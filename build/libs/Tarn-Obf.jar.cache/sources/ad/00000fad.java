package net.runelite.client.ui;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import net.runelite.api.Constants;

/* loaded from: Tarn-Obf.jar:net/runelite/client/ui/ClientPanel.class */
final class ClientPanel extends JPanel {
    public ClientPanel(Applet applet) {
        setSize(Constants.GAME_FIXED_SIZE);
        setMinimumSize(Constants.GAME_FIXED_SIZE);
        setPreferredSize(Constants.GAME_FIXED_SIZE);
        setLayout(new BorderLayout());
        setBackground(Color.black);
        if (applet == null) {
            return;
        }
        applet.setLayout((LayoutManager) null);
        applet.setSize(Constants.GAME_FIXED_SIZE);
        applet.init();
        applet.start();
        add(applet, "Center");
    }
}