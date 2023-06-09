package org.pushingpixels.substance.api;

import java.awt.Component;
import java.awt.Insets;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.JTextComponent;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.combo.ComboPopupPrototypeCallback;
import org.pushingpixels.substance.api.font.FontPolicy;
import org.pushingpixels.substance.api.font.FontSet;
import org.pushingpixels.substance.api.font.SubstanceFontUtilities;
import org.pushingpixels.substance.api.icon.SubstanceDefaultIconPack;
import org.pushingpixels.substance.api.icon.SubstanceIconPack;
import org.pushingpixels.substance.api.painter.preview.PreviewPainter;
import org.pushingpixels.substance.api.password.PasswordStrengthChecker;
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.api.skin.SkinChangeListener;
import org.pushingpixels.substance.api.skin.SkinInfo;
import org.pushingpixels.substance.api.tabbed.BaseTabCloseListener;
import org.pushingpixels.substance.api.tabbed.TabCloseCallback;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.SubstancePluginRepository;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.SubstanceWidgetRepository;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.painter.DecorationPainterUtils;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.SubstanceTitlePaneUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceWidgetManager;
import org.pushingpixels.substance.internal.utils.TabCloseListenerManager;

/* loaded from: Tarn-Obf.jar:org/pushingpixels/substance/api/SubstanceCortex.class */
public class SubstanceCortex {

    /* loaded from: Tarn-Obf.jar:org/pushingpixels/substance/api/SubstanceCortex$GlobalScope.class */
    public static final class GlobalScope {
        private static final String SUBSTANCE_FONT_POLICY_KEY = "substancelaf.fontPolicyKey";
        private static ClassLoader labelBundleClassLoader;
        private static SubstanceIconPack iconPack;
        private static ResourceBundle labelBundle = null;
        private static SubstanceSkin currentSkin = null;
        private static final Set<SkinChangeListener> skinChangeListeners = new HashSet();
        private static final Set<SubstanceSlices.LocaleChangeListener> localeChangeListeners = new HashSet();
        private static SubstanceSlices.ButtonOrder buttonBarButtonOrder = SubstanceSlices.ButtonOrder.PLATFORM;
        private static SubstanceSlices.HorizontalGravity buttonBarGravity = SubstanceSlices.HorizontalGravity.PLATFORM;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.NoClassDefFoundError] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Exception] */
        public static boolean setSkin(SubstanceSkin substanceSkin, boolean z) {
            if (!SwingUtilities.isEventDispatchThread()) {
                throw new IllegalStateException("This method must be called on the Event Dispatch Thread");
            }
            if (!substanceSkin.isValid()) {
                return false;
            }
            ?? r0 = UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel;
            if (r0 == 0) {
                try {
                    UIManager.setLookAndFeel(new SubstanceLookAndFeel(substanceSkin) { // from class: org.pushingpixels.substance.api.SubstanceCortex.GlobalScope.1SkinDerivedLookAndFeel
                    });
                    if (!(UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel)) {
                        return false;
                    }
                    for (Component component : Window.getWindows()) {
                        SwingUtilities.updateComponentTreeUI(component);
                    }
                    return true;
                } catch (UnsupportedLookAndFeelException unused) {
                    return false;
                }
            }
            try {
                if (!substanceSkin.isValid()) {
                    return false;
                }
                if (currentSkin != null && currentSkin.getWatermark() != null) {
                    currentSkin.getWatermark().dispose();
                }
                if (substanceSkin.getWatermark() != null && !substanceSkin.getWatermark().updateWatermarkImage(substanceSkin)) {
                    return false;
                }
                UIDefaults lookAndFeelDefaults = UIManager.getLookAndFeelDefaults();
                if (lookAndFeelDefaults != null) {
                    initFontDefaults(lookAndFeelDefaults, getFontPolicy().getFontSet("Substance", null));
                    substanceSkin.addCustomEntriesToTable(lookAndFeelDefaults);
                    SubstancePluginRepository.getInstance().processAllDefaultsEntriesComponentPlugins(lookAndFeelDefaults, substanceSkin);
                }
                ResourceBundle labelBundle2 = getLabelBundle();
                Enumeration<String> keys = labelBundle2.getKeys();
                while (keys.hasMoreElements()) {
                    String nextElement = keys.nextElement();
                    if (nextElement.indexOf("FileChooser") != -1) {
                        UIManager.put(nextElement, labelBundle2.getString(nextElement));
                    }
                }
                if (r0 != 0) {
                    LazyResettableHashMap.reset();
                }
                currentSkin = substanceSkin;
                if (z) {
                    SubstanceCoreUtilities.updateActiveUi();
                }
                Iterator<SkinChangeListener> it = skinChangeListeners.iterator();
                while (true) {
                    r0 = it.hasNext();
                    if (r0 != 0) {
                        it.next().skinChanged();
                    } else {
                        return true;
                    }
                }
            } catch (Exception unused2) {
                r0.printStackTrace(System.out);
                return false;
            } catch (NoClassDefFoundError unused3) {
                r0.printStackTrace(System.out);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void unsetSkin() {
            currentSkin = null;
        }

        public static boolean setSkin(SubstanceSkin substanceSkin) {
            return setSkin(substanceSkin, true);
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [boolean, java.lang.Exception] */
        public static boolean setSkin(String str) {
            Object newInstance;
            ?? skin;
            try {
                Class<?> cls = Class.forName(str);
                if (cls == null || (newInstance = cls.newInstance()) == null || !(newInstance instanceof SubstanceSkin)) {
                    return false;
                }
                skin = setSkin((SubstanceSkin) newInstance);
                return skin;
            } catch (Exception unused) {
                skin.printStackTrace();
                return false;
            }
        }

        public static SubstanceSkin getCurrentSkin() {
            if (UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel) {
                return currentSkin;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void initFontDefaults(UIDefaults uIDefaults) {
            initFontDefaults(uIDefaults, getFontPolicy().getFontSet("Substance", null));
        }

        private static void initFontDefaults(UIDefaults uIDefaults, FontSet fontSet) {
            FontUIResource controlFont = fontSet.getControlFont();
            FontUIResource menuFont = fontSet.getMenuFont();
            FontUIResource messageFont = fontSet.getMessageFont();
            FontUIResource smallFont = fontSet.getSmallFont();
            FontUIResource titleFont = fontSet.getTitleFont();
            FontUIResource windowTitleFont = fontSet.getWindowTitleFont();
            uIDefaults.putDefaults(new Object[]{"Button.font", controlFont, "CheckBox.font", controlFont, "ColorChooser.font", controlFont, "ComboBox.font", controlFont, "EditorPane.font", controlFont, "FormattedTextField.font", controlFont, "Label.font", controlFont, "List.font", controlFont, "Panel.font", controlFont, "PasswordField.font", controlFont, "ProgressBar.font", controlFont, "RadioButton.font", controlFont, "ScrollPane.font", controlFont, "Spinner.font", controlFont, "TabbedPane.font", controlFont, "Table.font", controlFont, "TableHeader.font", controlFont, "TextArea.font", controlFont, "TextField.font", controlFont, "TextPane.font", controlFont, "ToolBar.font", controlFont, "ToggleButton.font", controlFont, "Tree.font", controlFont, "Viewport.font", controlFont, "InternalFrame.titleFont", windowTitleFont, "DesktopIcon.titleFont", windowTitleFont, "OptionPane.font", messageFont, "OptionPane.messageFont", messageFont, "OptionPane.buttonFont", messageFont, "TitledBorder.font", titleFont, "ToolTip.font", smallFont, "CheckBoxMenuItem.font", menuFont, "CheckBoxMenuItem.acceleratorFont", menuFont, "Menu.font", menuFont, "Menu.acceleratorFont", menuFont, "MenuBar.font", menuFont, "MenuItem.font", menuFont, "MenuItem.acceleratorFont", menuFont, "PopupMenu.font", menuFont, "RadioButtonMenuItem.font", menuFont, "RadioButtonMenuItem.acceleratorFont", menuFont});
        }

        public static void registerSkinChangeListener(SkinChangeListener skinChangeListener) {
            skinChangeListeners.add(skinChangeListener);
        }

        public static void unregisterSkinChangeListener(SkinChangeListener skinChangeListener) {
            skinChangeListeners.remove(skinChangeListener);
        }

        public static Map<String, SkinInfo> getAllSkins() {
            TreeMap treeMap = new TreeMap();
            for (SubstanceSkinPlugin substanceSkinPlugin : SubstancePluginRepository.getInstance().getSkinPlugins()) {
                for (SkinInfo skinInfo : substanceSkinPlugin.getSkins()) {
                    treeMap.put(skinInfo.getDisplayName(), skinInfo);
                }
            }
            return treeMap;
        }

        public static void registerComponentPlugin(SubstanceComponentPlugin substanceComponentPlugin) {
            SubstancePluginRepository.getInstance().registerComponentPlugin(substanceComponentPlugin);
        }

        public static void registerSkinPlugin(SubstanceSkinPlugin substanceSkinPlugin) {
            SubstancePluginRepository.getInstance().registerSkinPlugin(substanceSkinPlugin);
        }

        public static void registerWidget(String str, Class<?> cls, boolean z) {
            SubstanceWidgetRepository.getRepository().registerWidget(str, cls, z);
        }

        public static void setFontPolicy(FontPolicy fontPolicy) {
            UIManager.put(SUBSTANCE_FONT_POLICY_KEY, fontPolicy);
            SubstanceSizeUtils.setControlFontSize(-1);
            SubstanceSizeUtils.resetPointsToPixelsRatio(fontPolicy);
            setSkin(getCurrentSkin());
        }

        public static FontPolicy getFontPolicy() {
            FontPolicy fontPolicy = (FontPolicy) UIManager.get(SUBSTANCE_FONT_POLICY_KEY);
            if (fontPolicy != null) {
                return fontPolicy;
            }
            return SubstanceFontUtilities.getDefaultFontPolicy();
        }

        public static void registerTabCloseChangeListener(BaseTabCloseListener baseTabCloseListener) {
            TabCloseListenerManager.getInstance().registerListener(baseTabCloseListener);
        }

        public static void unregisterTabCloseChangeListener(BaseTabCloseListener baseTabCloseListener) {
            TabCloseListenerManager.getInstance().unregisterListener(baseTabCloseListener);
        }

        public static Set<BaseTabCloseListener> getAllTabCloseListeners() {
            return TabCloseListenerManager.getInstance().getListeners();
        }

        public static void setIconPack(SubstanceIconPack substanceIconPack) {
            if (substanceIconPack == null) {
                throw new IllegalArgumentException("Cannot pass null icon pack");
            }
            iconPack = substanceIconPack;
            LazyResettableHashMap.reset();
        }

        public static SubstanceIconPack getIconPack() {
            if (iconPack == null) {
                iconPack = new SubstanceDefaultIconPack();
            }
            return iconPack;
        }

        public static void allowAnimations(SubstanceSlices.AnimationFacet animationFacet) {
            AnimationConfigurationManager.getInstance().allowAnimations(animationFacet);
        }

        public static void allowAnimations(SubstanceSlices.AnimationFacet animationFacet, Class<?> cls) {
            AnimationConfigurationManager.getInstance().allowAnimations(animationFacet, cls);
        }

        public static void allowAnimations(SubstanceSlices.AnimationFacet animationFacet, Class<?>[] clsArr) {
            AnimationConfigurationManager.getInstance().allowAnimations(animationFacet, clsArr);
        }

        public static void disallowAnimations(SubstanceSlices.AnimationFacet animationFacet) {
            AnimationConfigurationManager.getInstance().disallowAnimations(animationFacet);
        }

        public static void disallowAnimations(SubstanceSlices.AnimationFacet animationFacet, Class<?> cls) {
            AnimationConfigurationManager.getInstance().disallowAnimations(animationFacet, cls);
        }

        public static void disallowAnimations(SubstanceSlices.AnimationFacet animationFacet, Class<?>[] clsArr) {
            AnimationConfigurationManager.getInstance().disallowAnimations(animationFacet, clsArr);
        }

        public static boolean isAnimationAllowed(SubstanceSlices.AnimationFacet animationFacet) {
            return AnimationConfigurationManager.getInstance().isAnimationAllowed(animationFacet, null);
        }

        public static void setTimelineDuration(long j) {
            AnimationConfigurationManager.getInstance().setTimelineDuration(j);
        }

        public static long getTimelineDuration() {
            return AnimationConfigurationManager.getInstance().getTimelineDuration();
        }

        public static void registerLocaleChangeListener(SubstanceSlices.LocaleChangeListener localeChangeListener) {
            localeChangeListeners.add(localeChangeListener);
        }

        public static void unregisterLocaleChangeListener(SubstanceSlices.LocaleChangeListener localeChangeListener) {
            localeChangeListeners.remove(localeChangeListener);
        }

        public static Set<SubstanceSlices.LocaleChangeListener> getLocaleChangeListeners() {
            return Collections.unmodifiableSet(localeChangeListeners);
        }

        public static synchronized ResourceBundle getLabelBundle() {
            if (labelBundle == null) {
                if (labelBundleClassLoader == null) {
                    labelBundle = ResourceBundle.getBundle("org.pushingpixels.substance.internal.resources.Labels", Locale.getDefault());
                } else {
                    labelBundle = ResourceBundle.getBundle("org.pushingpixels.substance.internal.resources.Labels", Locale.getDefault(), labelBundleClassLoader);
                }
                for (SubstanceSlices.LocaleChangeListener localeChangeListener : getLocaleChangeListeners()) {
                    localeChangeListener.localeChanged();
                }
            }
            return labelBundle;
        }

        public static synchronized ResourceBundle getLabelBundle(Locale locale) {
            if (labelBundleClassLoader == null) {
                return ResourceBundle.getBundle("org.pushingpixels.substance.internal.resources.Labels", locale);
            }
            return ResourceBundle.getBundle("org.pushingpixels.substance.internal.resources.Labels", locale, labelBundleClassLoader);
        }

        public static synchronized void resetLabelBundle() {
            labelBundle = null;
        }

        public static void setLabelBundleClassLoader(ClassLoader classLoader) {
            labelBundleClassLoader = classLoader;
        }

        public static ClassLoader getLabelBundleClassLoader() {
            return labelBundleClassLoader;
        }

        public static void setUseConstantThemesOnOptionPanes(Boolean bool) {
            UIManager.put(SubstanceSynapse.USE_THEMED_ICONS_ON_OPTION_PANES, bool);
            SwingUtilities.invokeLater(SubstanceCoreUtilities::updateActiveUi);
        }

        public static void setUseThemedDefaultIcons(Boolean bool) {
            UIManager.put(SubstanceSynapse.USE_THEMED_DEFAULT_ICONS, bool);
        }

        public static SubstanceSlices.ButtonOrder getButtonBarOrder() {
            return buttonBarButtonOrder;
        }

        public static void setButtonBarOrder(SubstanceSlices.ButtonOrder buttonOrder) {
            if (buttonOrder == null) {
                throw new IllegalArgumentException("Cannot pass null. Did you mean PLATFORM or SWING_DEFAULT?");
            }
            buttonBarButtonOrder = buttonOrder;
            SwingUtilities.invokeLater(SubstanceCoreUtilities::updateActiveUi);
        }

        public static SubstanceSlices.HorizontalGravity getButtonBarGravity() {
            return buttonBarGravity;
        }

        public static void setButtonBarGravity(SubstanceSlices.HorizontalGravity horizontalGravity) {
            if (horizontalGravity == null) {
                throw new IllegalArgumentException("Cannot pass null. Did you mean PLATFORM or SWING_DEFAULT?");
            }
            buttonBarGravity = horizontalGravity;
            SwingUtilities.invokeLater(SubstanceCoreUtilities::updateActiveUi);
        }

        public static void configureTitleContentGravity(SubstanceSlices.HorizontalGravity horizontalGravity, SubstanceSlices.HorizontalGravity horizontalGravity2, SubstanceSlices.TitleIconHorizontalGravity titleIconHorizontalGravity) {
            if (horizontalGravity == null) {
                throw new IllegalArgumentException("Cannot pass null for text gravity. Did you mean PLATFORM or SWING_DEFAULT?");
            }
            if (horizontalGravity2 == null) {
                throw new IllegalArgumentException("Cannot pass null for control button group horizontal gravity. Did you mean PLATFORM or SWING_DEFAULT?");
            }
            if (titleIconHorizontalGravity == null) {
                throw new IllegalArgumentException("Cannot pass null for icon horizontal gravity. Did you mean PLATFORM or SWING_DEFAULT?");
            }
            if (horizontalGravity2 == SubstanceSlices.HorizontalGravity.CENTERED) {
                throw new IllegalArgumentException("Cannot pass CENTERED for control button group horizontal gravity. Did you mean PLATFORM or SWING_DEFAULT?");
            }
            UIManager.put(SubstanceSynapse.TITLE_TEXT_HORIZONTAL_GRAVITY, horizontalGravity);
            UIManager.put(SubstanceSynapse.TITLE_CONTROL_BUTTON_GROUP_HORIZONTAL_GRAVITY, horizontalGravity2);
            UIManager.put(SubstanceSynapse.TITLE_ICON_HORIZONTAL_GRAVITY, titleIconHorizontalGravity);
            SwingUtilities.invokeLater(SubstanceCoreUtilities::updateActiveUi);
        }

        public static SubstanceSlices.HorizontalGravity getTitleTextHorizontalGravity() {
            return SubstanceTitlePaneUtilities.getTitleTextHorizontalGravity();
        }

        public static SubstanceSlices.TitleIconHorizontalGravity getTitleIconHorizontalGravity() {
            return SubstanceTitlePaneUtilities.getTitleIconHorizontalGravity();
        }

        public static void setWidgetVisible(boolean z, SubstanceSlices.SubstanceWidgetType... substanceWidgetTypeArr) {
            SubstanceWidgetManager.getInstance().register(null, z, substanceWidgetTypeArr);
            for (Component component : Window.getWindows()) {
                SwingUtilities.updateComponentTreeUI(SwingUtilities.getRootPane(component));
            }
        }

        public static void setLockIconVisible(Boolean bool) {
            UIManager.put(SubstanceSynapse.HAS_LOCK_ICON, bool);
        }

        public static void setComponentPreviewPainter(PreviewPainter previewPainter) {
            UIManager.put(SubstanceSynapse.COMPONENT_PREVIEW_PAINTER, previewPainter);
        }

        public static void setSelectTextOnFocus(Boolean bool) {
            UIManager.put(SubstanceSynapse.TEXT_SELECT_ON_FOCUS, bool);
        }

        public static void setTextEditContextMenuPresence(Boolean bool) {
            UIManager.put(SubstanceSynapse.TEXT_EDIT_CONTEXT_MENU, bool);
        }

        public static void setAutomaticDragAndDropSupportPresence(Boolean bool) {
            UIManager.put(SubstanceSynapse.TREE_AUTO_DND_SUPPORT, bool);
        }

        public static void setAutomaticScrollPresence(Boolean bool) {
            UIManager.put(SubstanceSynapse.AUTO_SCROLL, bool);
        }

        public static void setWatermarkVisible(Boolean bool) {
            UIManager.put(SubstanceSynapse.WATERMARK_VISIBLE, bool);
        }

        public static void setButtonIgnoreMinimumSize(Boolean bool) {
            UIManager.put(SubstanceSynapse.BUTTON_NO_MIN_SIZE, bool);
        }

        public static void setButtonNeverPaintBackground(Boolean bool) {
            UIManager.put(SubstanceSynapse.BUTTON_NEVER_PAINT_BACKGROUND, bool);
        }

        public static void setFlatBackground(Boolean bool) {
            UIManager.put(SubstanceSynapse.FLAT_LOOK, bool);
        }

        public static void setToolbarButtonCornerRadius(float f) {
            UIManager.put(SubstanceSynapse.TOOLBAR_BUTTON_CORNER_RADIUS, Float.valueOf(f));
        }

        public static void setExtraWidgetsPresence(Boolean bool) {
            UIManager.put(SubstanceSynapse.SHOW_EXTRA_WIDGETS, bool);
        }

        public static void setColorizationFactor(double d) {
            UIManager.put(SubstanceSynapse.COLORIZATION_FACTOR, Double.valueOf(d));
        }

        public static void setTabCloseButtonsVisible(Boolean bool) {
            UIManager.put(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS, bool);
        }

        public static void setTabCloseCallback(TabCloseCallback tabCloseCallback) {
            UIManager.put(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS, tabCloseCallback);
        }

        public static void setRunModifiedAnimationOnTabCloseButton(Boolean bool) {
            UIManager.put(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION, bool);
        }

        public static void setTabContentPaneBorderKind(SubstanceSlices.TabContentPaneBorderKind tabContentPaneBorderKind) {
            UIManager.put(SubstanceSynapse.TABBED_PANE_CONTENT_BORDER_KIND, tabContentPaneBorderKind);
        }

        public static void setNumberOfPasswordEchoesPerCharacter(int i) {
            UIManager.put(SubstanceSynapse.PASSWORD_ECHO_PER_CHAR, Integer.valueOf(i));
        }

        public static void setMenuGutterFillKind(SubstanceSlices.MenuGutterFillKind menuGutterFillKind) {
            UIManager.put(SubstanceSynapse.MENU_GUTTER_FILL_KIND, menuGutterFillKind);
        }

        public static void setTraceFilename(String str) {
            UIManager.put(SubstanceSynapse.TRACE_FILE, str);
        }

        public static void setHeapStatusTraceFilename(String str) {
            UIManager.put(SubstanceSynapse.HEAP_STATUS_TRACE_FILE, str);
        }

        public static void setFocusKind(SubstanceSlices.FocusKind focusKind) {
            UIManager.put(SubstanceSynapse.FOCUS_KIND, focusKind);
        }

        public static void setComboBoxPrototypeCallback(ComboPopupPrototypeCallback comboPopupPrototypeCallback) {
            UIManager.put("substancelaf.internal.comboPopupPrototype", comboPopupPrototypeCallback);
        }

        public static void setComboBoxPrototypeDisplayValue(Object obj) {
            UIManager.put("substancelaf.internal.comboPopupPrototype", obj);
        }

        public static void setComboBoxPopupFlyoutOrientation(int i) {
            UIManager.put(SubstanceSynapse.COMBO_BOX_POPUP_FLYOUT_ORIENTATION, Integer.valueOf(i));
        }

        public static BufferedImage getBlankImage(int i, int i2) {
            return SubstanceCoreUtilities.getBlankImage(i, i2);
        }

        public static double getScaleFactor() {
            return UIUtil.getScaleFactor();
        }
    }

    /* loaded from: Tarn-Obf.jar:org/pushingpixels/substance/api/SubstanceCortex$ComponentScope.class */
    public static final class ComponentScope {
        public static SubstanceSkin getCurrentSkin(Component component) {
            return SubstanceCoreUtilities.getSkin(component);
        }

        public static void registerTabCloseChangeListener(JTabbedPane jTabbedPane, BaseTabCloseListener baseTabCloseListener) {
            if (jTabbedPane == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            TabCloseListenerManager.getInstance().registerListener(jTabbedPane, baseTabCloseListener);
        }

        public static void unregisterTabCloseChangeListener(JTabbedPane jTabbedPane, BaseTabCloseListener baseTabCloseListener) {
            if (jTabbedPane == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            TabCloseListenerManager.getInstance().unregisterListener(jTabbedPane, baseTabCloseListener);
        }

        public static Set<BaseTabCloseListener> getAllTabCloseListeners(JTabbedPane jTabbedPane) {
            if (jTabbedPane == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            return TabCloseListenerManager.getInstance().getListeners(jTabbedPane);
        }

        public static void allowAnimations(Component component, SubstanceSlices.AnimationFacet animationFacet) {
            if (component == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            AnimationConfigurationManager.getInstance().allowAnimations(animationFacet, component);
        }

        public static void disallowAnimations(Component component, SubstanceSlices.AnimationFacet animationFacet) {
            if (component == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            AnimationConfigurationManager.getInstance().disallowAnimations(animationFacet, component);
        }

        public static boolean isAnimationAllowed(Component component, SubstanceSlices.AnimationFacet animationFacet) {
            if (component == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            return AnimationConfigurationManager.getInstance().isAnimationAllowed(animationFacet, component);
        }

        public static SubstanceSlices.DecorationAreaType getImmediateDecorationType(Component component) {
            if (component == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            return DecorationPainterUtils.getImmediateDecorationType(component);
        }

        public static void setLockIconVisible(JComponent jComponent, Boolean bool) {
            jComponent.putClientProperty(SubstanceSynapse.HAS_LOCK_ICON, bool);
        }

        public static void setPasswordStrengthChecker(JPasswordField jPasswordField, PasswordStrengthChecker passwordStrengthChecker) {
            jPasswordField.putClientProperty(SubstanceSynapse.PASSWORD_STRENGTH_CHECKER, passwordStrengthChecker);
        }

        public static void setFlipTextSelectionOnEscape(JTextComponent jTextComponent, Boolean bool) {
            jTextComponent.putClientProperty(SubstanceSynapse.TEXT_FLIP_SELECT_ON_ESCAPE, bool);
        }

        public static void setTextEditContextMenuPresence(JTextComponent jTextComponent, Boolean bool) {
            jTextComponent.putClientProperty(SubstanceSynapse.TEXT_EDIT_CONTEXT_MENU, bool);
        }

        public static void setAutomaticDragAndDropSupportPresence(JTree jTree, Boolean bool) {
            jTree.putClientProperty(SubstanceSynapse.TREE_AUTO_DND_SUPPORT, bool);
        }

        public static void setAutomaticScrollPresence(JScrollPane jScrollPane, Boolean bool) {
            jScrollPane.putClientProperty(SubstanceSynapse.AUTO_SCROLL, bool);
        }

        public static void setButtonOpenSide(JComponent jComponent, SubstanceSlices.Side side) {
            jComponent.putClientProperty(SubstanceSynapse.BUTTON_OPEN_SIDE, side);
        }

        public static void setButtonOpenSides(JComponent jComponent, Set<SubstanceSlices.Side> set) {
            jComponent.putClientProperty(SubstanceSynapse.BUTTON_OPEN_SIDE, set);
        }

        public static void setButtonStraightSide(JComponent jComponent, SubstanceSlices.Side side) {
            jComponent.putClientProperty(SubstanceSynapse.BUTTON_STRAIGHT_SIDE, side);
        }

        public static void setButtonStraightSides(JComponent jComponent, Set<SubstanceSlices.Side> set) {
            jComponent.putClientProperty(SubstanceSynapse.BUTTON_STRAIGHT_SIDE, set);
        }

        public static void setToolbarButtonCornerRadius(AbstractButton abstractButton, float f) {
            abstractButton.putClientProperty(SubstanceSynapse.TOOLBAR_BUTTON_CORNER_RADIUS, Float.valueOf(f));
        }

        public static void setTabContentsModified(JComponent jComponent, Boolean bool) {
            jComponent.putClientProperty(SubstanceSynapse.CONTENTS_MODIFIED, bool);
        }

        public static void setTabCloseButtonsVisible(JTabbedPane jTabbedPane, Boolean bool) {
            jTabbedPane.putClientProperty(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS, bool);
        }

        public static void setTabCloseButtonVisible(JComponent jComponent, Boolean bool) {
            jComponent.putClientProperty(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS, bool);
        }

        public static void setTabCloseCallback(JTabbedPane jTabbedPane, TabCloseCallback tabCloseCallback) {
            jTabbedPane.putClientProperty(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS, tabCloseCallback);
        }

        public static void setTabCloseCallback(JComponent jComponent, TabCloseCallback tabCloseCallback) {
            jComponent.putClientProperty(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS, tabCloseCallback);
        }

        public static void setRunModifiedAnimationOnTabCloseButton(JTabbedPane jTabbedPane, Boolean bool) {
            jTabbedPane.putClientProperty(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION, bool);
        }

        public static void setRunModifiedAnimationOnTabCloseButton(JComponent jComponent, Boolean bool) {
            jComponent.putClientProperty(SubstanceSynapse.TABBED_PANE_CLOSE_BUTTONS_MODIFIED_ANIMATION, bool);
        }

        public static void setTabContentPaneBorderKind(JTabbedPane jTabbedPane, SubstanceSlices.TabContentPaneBorderKind tabContentPaneBorderKind) {
            jTabbedPane.putClientProperty(SubstanceSynapse.TABBED_PANE_CONTENT_BORDER_KIND, tabContentPaneBorderKind);
        }

        public static void setButtonShaper(JComponent jComponent, SubstanceButtonShaper substanceButtonShaper) {
            jComponent.putClientProperty(SubstanceSynapse.TABBED_PANE_CONTENT_BORDER_KIND, substanceButtonShaper);
        }

        public static void setNumberOfPasswordEchoesPerCharacter(JPasswordField jPasswordField, int i) {
            jPasswordField.putClientProperty(SubstanceSynapse.PASSWORD_ECHO_PER_CHAR, Integer.valueOf(i));
        }

        public static void setComboBoxPrototypeCallback(JComboBox jComboBox, ComboPopupPrototypeCallback comboPopupPrototypeCallback) {
            jComboBox.putClientProperty("substancelaf.internal.comboPopupPrototype", comboPopupPrototypeCallback);
        }

        public static void setComboBoxPrototypeDisplayValue(JComboBox jComboBox, Object obj) {
            jComboBox.putClientProperty("substancelaf.internal.comboPopupPrototype", obj);
        }

        public static void setComboBoxPopupFlyoutOrientation(JComboBox jComboBox, Integer num) {
            jComboBox.putClientProperty(SubstanceSynapse.COMBO_BOX_POPUP_FLYOUT_ORIENTATION, num);
        }
    }

    /* loaded from: Tarn-Obf.jar:org/pushingpixels/substance/api/SubstanceCortex$ComponentOrParentScope.class */
    public static final class ComponentOrParentScope {
        public static void setComponentPreviewPainter(JComponent jComponent, PreviewPainter previewPainter) {
            jComponent.putClientProperty(SubstanceSynapse.COMPONENT_PREVIEW_PAINTER, previewPainter);
        }

        public static void setButtonIgnoreMinimumSize(JComponent jComponent, Boolean bool) {
            jComponent.putClientProperty(SubstanceSynapse.BUTTON_NO_MIN_SIZE, bool);
        }

        public static void setButtonNeverPaintBackground(JComponent jComponent, Boolean bool) {
            jComponent.putClientProperty(SubstanceSynapse.BUTTON_NEVER_PAINT_BACKGROUND, bool);
        }

        public static void setFlatBackground(JComponent jComponent, Boolean bool) {
            jComponent.putClientProperty(SubstanceSynapse.FLAT_LOOK, bool);
        }
    }

    /* loaded from: Tarn-Obf.jar:org/pushingpixels/substance/api/SubstanceCortex$ComponentOrParentChainScope.class */
    public static final class ComponentOrParentChainScope {
        public static void setSelectTextOnFocus(JComponent jComponent, Boolean bool) {
            jComponent.putClientProperty(SubstanceSynapse.TEXT_SELECT_ON_FOCUS, bool);
        }

        public static void setWatermarkVisible(JComponent jComponent, Boolean bool) {
            jComponent.putClientProperty(SubstanceSynapse.WATERMARK_VISIBLE, bool);
        }

        public static void setToolbarButtonCornerRadius(JToolBar jToolBar, float f) {
            jToolBar.putClientProperty(SubstanceSynapse.TOOLBAR_BUTTON_CORNER_RADIUS, Float.valueOf(f));
        }

        public static void setExtraWidgetsPresence(JComponent jComponent, Boolean bool) {
            jComponent.putClientProperty(SubstanceSynapse.SHOW_EXTRA_WIDGETS, bool);
        }

        public static void setColorizationFactor(JComponent jComponent, double d) {
            jComponent.putClientProperty(SubstanceSynapse.COLORIZATION_FACTOR, Double.valueOf(d));
        }

        public static void setFocusKind(JComponent jComponent, SubstanceSlices.FocusKind focusKind) {
            jComponent.putClientProperty(SubstanceSynapse.FOCUS_KIND, focusKind);
        }

        public static void setDecorationType(JComponent jComponent, SubstanceSlices.DecorationAreaType decorationAreaType) {
            if (jComponent == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            DecorationPainterUtils.setDecorationType(jComponent, decorationAreaType);
        }

        public static SubstanceSlices.DecorationAreaType getDecorationType(Component component) {
            if (component == null) {
                throw new IllegalArgumentException("Component scope APIs do not accept null components");
            }
            return DecorationPainterUtils.getDecorationType(component);
        }
    }

    /* loaded from: Tarn-Obf.jar:org/pushingpixels/substance/api/SubstanceCortex$RootPaneScope.class */
    public static final class RootPaneScope {
        public static void setSkin(JRootPane jRootPane, SubstanceSkin substanceSkin) {
            if (jRootPane == null) {
                throw new IllegalArgumentException("Root pane scope APIs do not accept null root panes");
            }
            jRootPane.putClientProperty(SubstanceSynapse.ROOT_PANE_SKIN, substanceSkin);
        }

        public static void setContentsModified(JRootPane jRootPane, Boolean bool) {
            if (jRootPane == null) {
                throw new IllegalArgumentException("Root pane scope APIs do not accept null root panes");
            }
            jRootPane.putClientProperty(SubstanceSynapse.CONTENTS_MODIFIED, bool);
        }
    }

    /* loaded from: Tarn-Obf.jar:org/pushingpixels/substance/api/SubstanceCortex$WindowScope.class */
    public static final class WindowScope {
        public static void setWidgetVisible(Window window, boolean z, SubstanceSlices.SubstanceWidgetType... substanceWidgetTypeArr) {
            if (window == null) {
                throw new IllegalArgumentException("Window scope APIs do not accept null windows");
            }
            JRootPane rootPane = SwingUtilities.getRootPane(window);
            if (rootPane != null) {
                SubstanceWidgetManager.getInstance().register(rootPane, z, substanceWidgetTypeArr);
                SwingUtilities.updateComponentTreeUI(rootPane);
            }
        }

        public static void extendContentIntoTitlePane(Window window, SubstanceSlices.HorizontalGravity horizontalGravity, SubstanceSlices.VerticalGravity verticalGravity) {
            if (window == null) {
                throw new IllegalArgumentException("Window scope APIs do not accept null windows");
            }
            if (horizontalGravity != SubstanceSlices.HorizontalGravity.LEADING && horizontalGravity != SubstanceSlices.HorizontalGravity.TRAILING) {
                throw new IllegalArgumentException("Can only pass LEADING or TRAILING for control button group horizontal gravity.");
            }
            if (verticalGravity == null) {
                throw new IllegalArgumentException("Cannot pass null for control button group vertical gravity. Did you mean CENTERED?");
            }
            JRootPane rootPane = SwingUtilities.getRootPane(window);
            if (rootPane != null) {
                rootPane.putClientProperty(SubstanceSynapse.ROOT_PANE_CONTENTS_EXTENDS_INTO_TITLE_PANE, Boolean.TRUE);
                rootPane.putClientProperty(SubstanceSynapse.TITLE_CONTROL_BUTTON_GROUP_HORIZONTAL_GRAVITY, horizontalGravity);
                rootPane.putClientProperty(SubstanceSynapse.TITLE_CONTROL_BUTTON_GROUP_VERTICAL_GRAVITY, verticalGravity);
                rootPane.getUI().extendContentIntoTitlePane();
            }
        }

        public static JButton createTitlePaneControlButton(Window window) {
            if (window == null) {
                throw new IllegalArgumentException("Window scope APIs do not accept null windows");
            }
            JRootPane rootPane = SwingUtilities.getRootPane(window);
            if (rootPane != null) {
                return rootPane.getUI().createTitlePaneControlButton();
            }
            return null;
        }

        public static Insets getTitlePaneControlInsets(Window window) {
            if (window == null) {
                throw new IllegalArgumentException("Window scope APIs do not accept null windows");
            }
            JRootPane rootPane = SwingUtilities.getRootPane(window);
            if (rootPane != null) {
                return rootPane.getUI().getTitlePaneControlInsets();
            }
            return null;
        }

        public static void setPreferredTitlePaneHeight(Window window, int i) {
            if (window == null) {
                throw new IllegalArgumentException("Window scope APIs do not accept null windows");
            }
            if (i <= 0) {
                throw new IllegalArgumentException("Should pass positive value");
            }
            JRootPane rootPane = SwingUtilities.getRootPane(window);
            if (rootPane != null) {
                rootPane.putClientProperty(SubstanceSynapse.ROOT_PANE_PREFERRED_TITLE_PANE_HEIGHT, Integer.valueOf(i));
                rootPane.getUI().setPreferredTitlePaneHeight(i);
            }
        }

        public static SubstanceSlices.HorizontalGravity getTitleControlButtonGroupHorizontalGravity(Window window) {
            if (window == null) {
                throw new IllegalArgumentException("Window scope APIs do not accept null windows");
            }
            return SubstanceTitlePaneUtilities.getTitleControlButtonGroupHorizontalGravity(SwingUtilities.getRootPane(window));
        }
    }
}