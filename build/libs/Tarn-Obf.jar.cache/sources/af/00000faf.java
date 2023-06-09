package net.runelite.client.ui;

import com.google.common.collect.ComparisonChain;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JPanel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: Tarn-Obf.jar:net/runelite/client/ui/ClientTitleToolbar.class */
public class ClientTitleToolbar extends JPanel {
    private static final int TITLEBAR_SIZE = 23;
    private static final int ITEM_PADDING = 4;
    private final Map<NavigationButton, Component> componentMap = new TreeMap(navigationButton, navigationButton2 -> {
        return ComparisonChain.start().compare(navigationButton.getPriority(), navigationButton2.getPriority()).compare(navigationButton.getTooltip(), navigationButton2.getTooltip()).result();
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    public ClientTitleToolbar() {
        setLayout(new LayoutManager2() { // from class: net.runelite.client.ui.ClientTitleToolbar.1
            public void addLayoutComponent(String str, Component component) {
            }

            public void addLayoutComponent(Component component, Object obj) {
            }

            public void removeLayoutComponent(Component component) {
            }

            public Dimension preferredLayoutSize(Container container) {
                return new Dimension(container.getComponentCount() * 27, 23);
            }

            public Dimension minimumLayoutSize(Container container) {
                return preferredLayoutSize(container);
            }

            public Dimension maximumLayoutSize(Container container) {
                return preferredLayoutSize(container);
            }

            public float getLayoutAlignmentX(Container container) {
                return 0.0f;
            }

            public float getLayoutAlignmentY(Container container) {
                return 0.0f;
            }

            public void invalidateLayout(Container container) {
            }

            public void layoutContainer(Container container) {
                Component[] components;
                int i = 0;
                for (Component component : container.getComponents()) {
                    int i2 = i + 4;
                    int i3 = component.getPreferredSize().height;
                    int i4 = i3;
                    if (i3 > 23) {
                        i4 = 23;
                    }
                    component.setBounds(i2, (23 - i4) / 2, 23, i4);
                    i = i2 + 23;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addComponent(NavigationButton navigationButton, Component component) {
        if (this.componentMap.put(navigationButton, component) == null) {
            update();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeComponent(NavigationButton navigationButton) {
        if (this.componentMap.remove(navigationButton) != null) {
            update();
        }
    }

    private void update() {
        removeAll();
        this.componentMap.values().forEach(this::add);
        repaint();
    }
}