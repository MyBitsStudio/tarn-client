package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class TarnTower extends RSInterface{

    public static void build(TextDrawingArea[] tda){
        RSInterface main = addInterface(162000);

        addSpriteLoader(162001, 2986);
        addText(162002, "Tower", ColorConstants.PURPLE, true, true, -1, 2);
        addCloseButton(162002, 162004, 162005);

        main.totalChildren(3);
        main.child(0, 162001, 20, 15);
        main.child(1, 162002, 255, 30);
        main.child(2, 162003, 395, 27);
    }
}
