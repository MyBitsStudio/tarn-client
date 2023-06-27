package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class GlobalBosses extends RSInterface {

    public static void build(TextDrawingArea[] tda){
        RSInterface main = addInterface(79000);

        addSpriteLoader(79001, 3155);
        addText(79002, "GLOBALS", ColorConstants.PURPLE, true, true, -1, 2);
        addCloseButton(79003, 79004, 79005);

        main.totalChildren(3);
        main.child(0, 79001, 140, 55);
        main.child(1, 79002, 255, 60);
        main.child(2, 79003, 395, 60);
    }
}
