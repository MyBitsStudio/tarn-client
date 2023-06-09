package net.runelite.client.ui;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.time.Duration;
import javax.inject.Provider;
import javax.inject.a;
import javax.inject.e;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import net.runelite.api.Constants;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.ExpandResizeType;
import net.runelite.client.config.Keybind;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.config.WarningOnExit;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ClientShutdown;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.events.NavigationButtonAdded;
import net.runelite.client.events.NavigationButtonRemoved;
import net.runelite.client.input.KeyManager;
import net.runelite.client.input.MouseAdapter;
import net.runelite.client.input.MouseManager;
import net.runelite.client.ui.ContainableFrame;
import net.runelite.client.ui.skin.SubstanceRuneLiteLookAndFeel;
import net.runelite.client.util.HotkeyListener;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.OSType;
import net.runelite.client.util.SwingUtil;
import org.necrotic.client.Client;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceTitlePaneUtilities;
import org.slf4j.Logger;
import org.slf4j.c;

@e
/* loaded from: Tarn-Obf.jar:net/runelite/client/ui/ClientUI.class */
public class ClientUI {
    private static final Logger log;
    private static final String CONFIG_GROUP = "runelite";
    private static final String CONFIG_CLIENT_BOUNDS = "clientBounds";
    private static final String CONFIG_CLIENT_MAXIMIZED = "clientMaximized";
    private static final int CLIENT_WELL_HIDDEN_MARGIN = 160;
    private static final int CLIENT_WELL_HIDDEN_MARGIN_TOP = 10;
    public static final BufferedImage ICON;
    private TrayIcon trayIcon;
    private final RuneLiteConfig config;
    private final KeyManager keyManager;
    private final MouseManager mouseManager;
    private final Applet client;
    private final ConfigManager configManager;
    private final Provider<ClientThread> clientThreadProvider;
    private final EventBus eventBus;
    private final CardLayout cardLayout = new CardLayout();
    private final Rectangle sidebarButtonPosition = new Rectangle();
    private boolean withTitleBar;
    private BufferedImage sidebarOpenIcon;
    private BufferedImage sidebarClosedIcon;
    private ContainableFrame frame;
    private JPanel navContainer;
    private PluginPanel pluginPanel;
    private ClientPluginToolbar pluginToolbar;
    private ClientTitleToolbar titleToolbar;
    private JButton currentButton;
    private NavigationButton currentNavButton;
    private boolean sidebarOpen;
    private JPanel container;
    private NavigationButton sidebarNavigationButton;
    private JButton sidebarNavigationJButton;
    private Dimension lastClientSize;
    private Cursor defaultCursor;
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !ClientUI.class.desiredAssertionStatus();
        log = c.a(ClientUI.class);
        ICON = ImageUtil.getResourceStreamFromClass(ClientUI.class, "/runelite.png");
    }

    public TrayIcon getTrayIcon() {
        return this.trayIcon;
    }

    @a
    private ClientUI(RuneLiteConfig runeLiteConfig, KeyManager keyManager, MouseManager mouseManager, Applet applet, ConfigManager configManager, Provider<ClientThread> provider, EventBus eventBus) {
        this.config = runeLiteConfig;
        this.keyManager = keyManager;
        this.mouseManager = mouseManager;
        this.client = applet;
        this.configManager = configManager;
        this.clientThreadProvider = provider;
        this.eventBus = eventBus;
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        if (!configChanged.getGroup().equals("runelite") || configChanged.getKey().equals(CONFIG_CLIENT_MAXIMIZED) || configChanged.getKey().equals(CONFIG_CLIENT_BOUNDS)) {
            return;
        }
        SwingUtilities.invokeLater(() -> {
            updateFrameConfig(configChanged.getKey().equals("lockWindowSize"));
        });
    }

    @Subscribe
    public void onNavigationButtonAdded(NavigationButtonAdded navigationButtonAdded) {
        SwingUtilities.invokeLater(() -> {
            NavigationButton button = navigationButtonAdded.getButton();
            PluginPanel panel = button.getPanel();
            boolean z = !navigationButtonAdded.getButton().isTab() && this.withTitleBar;
            if (panel != null) {
                this.navContainer.add(panel.getWrappedPanel(), button.getTooltip());
            }
            Component createSwingButton = SwingUtil.createSwingButton(button, 16, navigationButton, jButton -> {
                if (navigationButton.getPanel() == null) {
                    return;
                }
                if (this.currentButton != null && this.currentButton == jButton && this.currentButton.isSelected()) {
                    contract();
                    this.currentButton.setSelected(false);
                    this.currentNavButton.setSelected(false);
                    this.currentButton = null;
                    this.currentNavButton = null;
                    return;
                }
                if (this.currentButton != null) {
                    this.currentButton.setSelected(false);
                }
                if (this.currentNavButton != null) {
                    this.currentNavButton.setSelected(false);
                }
                this.currentButton = jButton;
                this.currentNavButton = navigationButton;
                this.currentButton.setSelected(true);
                this.currentNavButton.setSelected(true);
                expand(navigationButton);
            });
            if (z) {
                this.titleToolbar.addComponent(navigationButtonAdded.getButton(), createSwingButton);
                this.titleToolbar.revalidate();
                return;
            }
            this.pluginToolbar.addComponent(navigationButtonAdded.getButton(), createSwingButton);
            this.pluginToolbar.revalidate();
        });
    }

    @Subscribe
    public void onNavigationButtonRemoved(NavigationButtonRemoved navigationButtonRemoved) {
        SwingUtilities.invokeLater(() -> {
            this.pluginToolbar.removeComponent(navigationButtonRemoved.getButton());
            this.pluginToolbar.revalidate();
            this.titleToolbar.removeComponent(navigationButtonRemoved.getButton());
            this.titleToolbar.revalidate();
            PluginPanel panel = navigationButtonRemoved.getButton().getPanel();
            if (panel != null) {
                this.navContainer.remove(panel.getWrappedPanel());
            }
        });
    }

    public void init() {
        SwingUtilities.invokeAndWait(() -> {
            SwingUtil.setupDefaults();
            SwingUtil.setTheme(new SubstanceRuneLiteLookAndFeel());
            SwingUtil.setFont(FontManager.getRunescapeFont());
            this.frame = new ContainableFrame();
            System.out.println("Creating frame");
            this.frame.setTitle(RuneLiteProperties.getTitle());
            this.frame.setIconImage(ICON);
            this.frame.getLayeredPane().setCursor(Cursor.getDefaultCursor());
            this.frame.setLocationRelativeTo(this.frame.getOwner());
            this.frame.setResizable(true);
            this.frame.setDefaultCloseOperation(0);
            this.frame.addWindowListener(new WindowAdapter() { // from class: net.runelite.client.ui.ClientUI.1
                public void windowClosing(WindowEvent windowEvent) {
                    int i = 0;
                    if (ClientUI.this.showWarningOnExit()) {
                        try {
                            i = JOptionPane.showConfirmDialog(ClientUI.this.frame, "Are you sure you want to exit?", "Exit", 2, 3);
                        } catch (Exception e) {
                            ClientUI.log.c("Unexpected exception occurred while check for confirm required", (Throwable) e);
                        }
                    }
                    if (i == 0) {
                        ClientUI.this.shutdownClient();
                    }
                }
            });
            this.container = new JPanel();
            this.container.setLayout(new BoxLayout(this.container, 0));
            this.container.add(new ClientPanel(this.client));
            this.navContainer = new JPanel();
            this.navContainer.setLayout(this.cardLayout);
            this.navContainer.setMinimumSize(new Dimension(0, 0));
            this.navContainer.setMaximumSize(new Dimension(0, 0));
            this.navContainer.setPreferredSize(new Dimension(0, 0));
            this.navContainer.putClientProperty(SubstanceSynapse.COLORIZATION_FACTOR, Double.valueOf(1.0d));
            this.container.add(this.navContainer);
            this.pluginToolbar = new ClientPluginToolbar();
            this.titleToolbar = new ClientTitleToolbar();
            this.frame.add(this.container);
            HotkeyListener hotkeyListener = new HotkeyListener(() -> {
                return new Keybind(122, 128);
            }) { // from class: net.runelite.client.ui.ClientUI.2
                @Override // net.runelite.client.util.HotkeyListener
                public void hotkeyPressed() {
                    ClientUI.this.toggleSidebar();
                }
            };
            hotkeyListener.setEnabledOnLogin(true);
            this.keyManager.registerKeyListener(hotkeyListener);
            this.mouseManager.registerMouseListener(new MouseAdapter() { // from class: net.runelite.client.ui.ClientUI.3
                @Override // net.runelite.client.input.MouseAdapter, net.runelite.client.input.MouseListener
                public MouseEvent mousePressed(MouseEvent mouseEvent) {
                    if (SwingUtilities.isLeftMouseButton(mouseEvent) && ClientUI.this.sidebarButtonPosition.contains(mouseEvent.getPoint())) {
                        ClientUI clientUI = ClientUI.this;
                        SwingUtilities.invokeLater(() -> {
                            clientUI.toggleSidebar();
                        });
                        mouseEvent.consume();
                    }
                    return mouseEvent;
                }
            });
            this.withTitleBar = this.config.enableCustomChrome();
            this.frame.setUndecorated(this.withTitleBar);
            if (this.withTitleBar) {
                this.frame.getRootPane().setWindowDecorationStyle(1);
                final JComponent titlePaneComponent = SubstanceCoreUtilities.getTitlePaneComponent(this.frame);
                this.titleToolbar.putClientProperty(SubstanceTitlePaneUtilities.EXTRA_COMPONENT_KIND, SubstanceTitlePaneUtilities.ExtraComponentKind.TRAILING);
                titlePaneComponent.add(this.titleToolbar);
                final LayoutManager layout = titlePaneComponent.getLayout();
                titlePaneComponent.setLayout(new LayoutManager() { // from class: net.runelite.client.ui.ClientUI.4
                    public void addLayoutComponent(String str, Component component) {
                        layout.addLayoutComponent(str, component);
                    }

                    public void removeLayoutComponent(Component component) {
                        layout.removeLayoutComponent(component);
                    }

                    public Dimension preferredLayoutSize(Container container) {
                        return layout.preferredLayoutSize(container);
                    }

                    public Dimension minimumLayoutSize(Container container) {
                        return layout.minimumLayoutSize(container);
                    }

                    public void layoutContainer(Container container) {
                        layout.layoutContainer(container);
                        int i = ClientUI.this.titleToolbar.getPreferredSize().width;
                        ClientUI.this.titleToolbar.setBounds((titlePaneComponent.getWidth() - 75) - i, 0, i, titlePaneComponent.getHeight());
                    }
                });
            }
            updateFrameConfig(true);
            this.sidebarOpenIcon = ImageUtil.getResourceStreamFromClass(ClientUI.class, this.withTitleBar ? "open.png" : "open_rs.png");
            this.sidebarClosedIcon = ImageUtil.flipImage(this.sidebarOpenIcon, true, false);
            this.sidebarNavigationButton = NavigationButton.builder().priority(100).icon(this.sidebarClosedIcon).onClick(this::toggleSidebar).build();
            this.sidebarNavigationJButton = SwingUtil.createSwingButton(this.sidebarNavigationButton, 0, null);
            this.titleToolbar.addComponent(this.sidebarNavigationButton, this.sidebarNavigationJButton);
            toggleSidebar();
        });
    }

    public void show() {
        SwingUtilities.invokeLater(() -> {
            Rectangle bounds;
            Rectangle bounds2;
            this.frame.pack();
            this.frame.revalidateMinimumSize();
            this.trayIcon = SwingUtil.createTrayIcon(ICON, RuneLiteProperties.getTitle(), this.frame);
            if (this.config.rememberScreenBounds()) {
                try {
                    Rectangle rectangle = (Rectangle) this.configManager.getConfiguration("runelite", CONFIG_CLIENT_BOUNDS, Rectangle.class);
                    if (rectangle != null) {
                        this.frame.setBounds(rectangle);
                        this.frame.revalidateMinimumSize();
                    } else {
                        this.frame.setLocationRelativeTo(this.frame.getOwner());
                    }
                    if (this.configManager.getConfiguration("runelite", CONFIG_CLIENT_MAXIMIZED) != null) {
                        this.frame.setExtendedState(6);
                    }
                } catch (Exception e) {
                    log.c("Failed to set window bounds", (Throwable) e);
                }
                bounds = this.frame.getBounds();
                bounds2 = this.frame.getGraphicsConfiguration().getBounds();
                if ((bounds.x + bounds.width) - 160 >= bounds2.getX() || bounds.x + 160 > bounds2.getX() + bounds2.getWidth() || bounds.y + 10 < bounds2.getY() || bounds.y + 160 > bounds2.getY() + bounds2.getHeight()) {
                    this.frame.setLocationRelativeTo(this.frame.getOwner());
                }
                this.frame.setVisible(true);
                this.frame.toFront();
                requestFocus();
                giveClientFocus();
                log.c("Showing frame {}", this.frame);
            }
            this.frame.setLocationRelativeTo(this.frame.getOwner());
            bounds = this.frame.getBounds();
            bounds2 = this.frame.getGraphicsConfiguration().getBounds();
            if ((bounds.x + bounds.width) - 160 >= bounds2.getX()) {
            }
            this.frame.setLocationRelativeTo(this.frame.getOwner());
            this.frame.setVisible(true);
            this.frame.toFront();
            requestFocus();
            giveClientFocus();
            log.c("Showing frame {}", this.frame);
        });
        if (this.client != null && !(this.client instanceof Client)) {
            SwingUtilities.invokeLater(() -> {
                JOptionPane.showMessageDialog(this.frame, "RuneLite has not yet been updated to work with the latest\ngame update, it will work with reduced functionality until then.", "RuneLite is outdated", 1);
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean showWarningOnExit() {
        if (this.config.warningOnExit() == WarningOnExit.ALWAYS) {
            return true;
        }
        if (this.config.warningOnExit() == WarningOnExit.LOGGED_IN && (this.client instanceof Client)) {
            Client client = (Client) this.client;
            return Client.aL;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdownClient() {
        saveClientBoundsConfig();
        ClientShutdown clientShutdown = new ClientShutdown();
        this.eventBus.post(clientShutdown);
        new Thread(() -> {
            int i;
            clientShutdown.waitForAllConsumers(Duration.ofSeconds(10L));
            if (this.client != null) {
                if (!(this.client instanceof Client)) {
                    this.client.stop();
                    this.frame.setVisible(false);
                    i = 6000;
                } else {
                    ((Client) this.client).destroy();
                    i = 1000;
                }
                try {
                    Thread.sleep(i);
                } catch (InterruptedException unused) {
                }
            }
            System.exit(0);
        }, "RuneLite Shutdown").start();
    }

    public void paint(Graphics graphics) {
        if (!$assertionsDisabled && !SwingUtilities.isEventDispatchThread()) {
            throw new AssertionError("paint must be called on EDT");
        }
        this.frame.paint(graphics);
    }

    public int getWidth() {
        return this.frame.getWidth();
    }

    public int getHeight() {
        return this.frame.getHeight();
    }

    public boolean isFocused() {
        return this.frame.isFocused();
    }

    public void requestFocus() {
        OSType.getOSType();
        OSType oSType = OSType.MacOS;
        this.frame.requestFocus();
        giveClientFocus();
    }

    public Cursor getCurrentCursor() {
        return this.container.getCursor();
    }

    public Cursor getDefaultCursor() {
        return this.defaultCursor != null ? this.defaultCursor : Cursor.getDefaultCursor();
    }

    public void setCursor(BufferedImage bufferedImage, String str) {
        if (this.container == null) {
            return;
        }
        Cursor createCustomCursor = Toolkit.getDefaultToolkit().createCustomCursor(bufferedImage, new Point(0, 0), str);
        this.defaultCursor = createCustomCursor;
        setCursor(createCustomCursor);
    }

    public void setCursor(Cursor cursor) {
        this.container.setCursor(cursor);
    }

    public void resetCursor() {
        if (this.container == null) {
            return;
        }
        this.defaultCursor = null;
        this.container.setCursor(Cursor.getDefaultCursor());
    }

    public Point getCanvasOffset() {
        if (this.client instanceof Client) {
            Client client = (Client) this.client;
            Canvas r = Client.r();
            if (r != null) {
                Point convertPoint = SwingUtilities.convertPoint(r, 0, 0, this.frame);
                return new Point(convertPoint.x, convertPoint.y);
            }
        }
        return new Point(0, 0);
    }

    public GraphicsConfiguration getGraphicsConfiguration() {
        return this.frame.getGraphicsConfiguration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleSidebar() {
        boolean z = this.sidebarOpen;
        this.sidebarOpen = !this.sidebarOpen;
        if (this.currentButton != null) {
            this.currentButton.setSelected(this.sidebarOpen);
        }
        if (this.currentNavButton != null) {
            this.currentNavButton.setSelected(this.sidebarOpen);
        }
        if (z) {
            this.sidebarNavigationJButton.setIcon(new ImageIcon(this.sidebarOpenIcon));
            this.sidebarNavigationJButton.setToolTipText("Open SideBar");
            contract();
            this.container.remove(this.pluginToolbar);
        } else {
            this.sidebarNavigationJButton.setIcon(new ImageIcon(this.sidebarClosedIcon));
            this.sidebarNavigationJButton.setToolTipText("Close SideBar");
            expand(this.currentNavButton);
            this.container.add(this.pluginToolbar);
        }
        this.container.revalidate();
        giveClientFocus();
        if (this.sidebarOpen) {
            this.frame.expandBy(this.pluginToolbar.getWidth());
        } else {
            this.frame.contractBy(this.pluginToolbar.getWidth());
        }
    }

    private void expand(NavigationButton navigationButton) {
        PluginPanel panel;
        if (navigationButton == null || (panel = navigationButton.getPanel()) == null) {
            return;
        }
        if (!this.sidebarOpen) {
            toggleSidebar();
        }
        int i = panel.getWrappedPanel().getPreferredSize().width;
        int i2 = this.pluginPanel != null ? this.pluginPanel.getWrappedPanel().getPreferredSize().width - i : i;
        this.pluginPanel = panel;
        this.navContainer.setMinimumSize(new Dimension(i, 0));
        this.navContainer.setMaximumSize(new Dimension(i, Integer.MAX_VALUE));
        this.navContainer.setPreferredSize(new Dimension(i, 0));
        this.navContainer.revalidate();
        this.cardLayout.show(this.navContainer, navigationButton.getTooltip());
        giveClientFocus();
        panel.onActivate();
        if (i2 > 0) {
            this.frame.expandBy(i2);
        } else if (i2 < 0) {
            this.frame.contractBy(i2);
        }
    }

    private void contract() {
        if (this.pluginPanel == null) {
            return;
        }
        this.pluginPanel.onDeactivate();
        this.navContainer.setMinimumSize(new Dimension(0, 0));
        this.navContainer.setMaximumSize(new Dimension(0, 0));
        this.navContainer.setPreferredSize(new Dimension(0, 0));
        this.navContainer.revalidate();
        giveClientFocus();
        this.frame.contractBy(this.pluginPanel.getWrappedPanel().getPreferredSize().width);
        this.pluginPanel = null;
    }

    private void giveClientFocus() {
        if (this.client instanceof Client) {
            Client client = (Client) this.client;
            Canvas r = Client.r();
            if (r != null) {
                r.requestFocusInWindow();
            }
        } else if (this.client != null) {
            this.client.requestFocusInWindow();
        }
    }

    private void updateFrameConfig(boolean z) {
        if (this.frame == null) {
            return;
        }
        if (this.config.usernameInTitle() && (this.client instanceof Client)) {
            Client client = (Client) this.client;
            org.necrotic.client.e.a.a q = Client.q();
            if (q != null && q.y != null) {
                this.frame.setTitle(RuneLiteProperties.getTitle() + " - " + q.y);
            }
        } else {
            this.frame.setTitle(RuneLiteProperties.getTitle());
        }
        if (this.frame.isAlwaysOnTopSupported()) {
            this.frame.setAlwaysOnTop(this.config.gameAlwaysOnTop());
        }
        if (z) {
            this.frame.setResizable(!this.config.lockWindowSize());
        }
        this.frame.setExpandResizeType(this.config.automaticResizeType());
        ContainableFrame.Mode containInScreen = this.config.containInScreen();
        ContainableFrame.Mode mode = containInScreen;
        if (containInScreen == ContainableFrame.Mode.ALWAYS && !this.withTitleBar) {
            mode = ContainableFrame.Mode.RESIZING;
        }
        this.frame.setContainedInScreen(mode);
        if (!this.config.rememberScreenBounds()) {
            this.configManager.unsetConfiguration("runelite", CONFIG_CLIENT_MAXIMIZED);
            this.configManager.unsetConfiguration("runelite", CONFIG_CLIENT_BOUNDS);
        }
        if (this.client == null) {
            return;
        }
        Dimension dimension = new Dimension(Math.max(Math.min(this.config.gameSize().width, 7680), (int) Constants.GAME_FIXED_WIDTH), Math.max(Math.min(this.config.gameSize().height, 2160), (int) Constants.GAME_FIXED_HEIGHT));
        if (!dimension.equals(this.lastClientSize)) {
            this.lastClientSize = dimension;
            this.client.setSize(dimension);
            this.client.setPreferredSize(dimension);
            this.client.getParent().setPreferredSize(dimension);
            this.client.getParent().setSize(dimension);
            if (this.frame.isVisible()) {
                this.frame.pack();
            }
        }
    }

    private void saveClientBoundsConfig() {
        if ((this.frame.getExtendedState() & 6) != 0) {
            this.configManager.setConfiguration("runelite", CONFIG_CLIENT_MAXIMIZED, Boolean.TRUE);
            return;
        }
        Rectangle bounds = this.frame.getBounds();
        if (!this.sidebarOpen) {
            bounds.width += this.pluginToolbar.getWidth();
        }
        if (this.config.automaticResizeType() == ExpandResizeType.KEEP_GAME_SIZE && this.pluginPanel != null) {
            bounds.width -= this.pluginPanel.getWrappedPanel().getPreferredSize().width;
        }
        this.configManager.unsetConfiguration("runelite", CONFIG_CLIENT_MAXIMIZED);
        this.configManager.setConfiguration("runelite", CONFIG_CLIENT_BOUNDS, bounds);
    }
}