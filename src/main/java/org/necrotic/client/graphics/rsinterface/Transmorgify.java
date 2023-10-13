package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class Transmorgify extends RSInterface{

    public static void build(TextDrawingArea[] tda) {
        RSInterface rsi = addInterface(167000);

        addSpriteLoader(167001, 3009);
        addText(167002, "Transform", ColorConstants.AQUA, true, true, -1, 2);

        addText(167003, "Death", ColorConstants.AQUA, true, true, -1, 1);
        addText(167004, "ACTIVE", ColorConstants.GREEN, true, true, -1, 1);
        addButtonWSpriteLoader(167005, 3296, "Activate");
        addText(167006, "Activate", ColorConstants.SNOW_WHITE, true, true, -1, 1);
        addButtonWSpriteLoader(167007, 3296, "Cancel");
        addText(167008, "Cancel", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        RSInterface scroll = RSInterface.addInterface(167100);

        scroll.width = 84;
        scroll.height = 109;
        scroll.scrollMax = 820;

        int npcList = 50;
        int y = 1;
        for (int i = 0; i < npcList; i++) {
            addText(167101 + i, "b", tda, 1, ClientConstants.WHITE, false, false, ClientConstants.WHITE, "Select", 150);
        }
        scroll.totalChildren(npcList);

        for (int i = 0; i < npcList; i++) {
            scroll.child(i, 167101 + i , 3, y);
            y += 15;
        }

        rsi.totalChildren(9);

        rsi.child(0, 167001, 185, 40);
        rsi.child(1, 167002, 249, 49);

        rsi.child(2, 167100, 198, 68);


        rsi.child(3, 167003, 249, 180);
        rsi.child(4, 167004, 248, 200);
        rsi.child(5, 167005, 217, 219);
        rsi.child(6, 167006, 247, 222);
        rsi.child(7, 167007, 217, 245);
        rsi.child(8, 167008, 247, 248);

    }
}
