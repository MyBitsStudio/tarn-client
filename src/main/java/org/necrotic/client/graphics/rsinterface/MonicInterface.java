package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class MonicInterface extends RSInterface{

    public static void build(TextDrawingArea[] tda) {
        RSInterface rsi = addInterface(166000);

        addSpriteLoader(166001, 3009);
        addText(166002, "Monic", ColorConstants.AQUA, true, true, -1, 2);

        addText(166003, "Donator Pack", ColorConstants.AQUA, true, true, -1, 1);
        addText(166004, "6 Charges", ColorConstants.AQUA, true, true, -1, 1);
        addButtonWSpriteLoader(166005, 3296, "Activate");
        addText(166006, "Activate", ColorConstants.SNOW_WHITE, true, true, -1, 1);
        addButtonWSpriteLoader(166007, 3296, "Cancel");
        addText(166008, "Cancel", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        RSInterface scroll = RSInterface.addInterface(166100);

        scroll.width = 84;
        scroll.height = 109;
        scroll.scrollMax = 820;

        int npcList = 50;
        int y = 1;
        for (int i = 0; i < npcList; i++) {
            addText(166101 + i, "b", tda, 1, ClientConstants.WHITE, false, false, ClientConstants.WHITE, "Select", 150);
        }
        scroll.totalChildren(npcList);

        for (int i = 0; i < npcList; i++) {
            scroll.child(i, 166101 + i , 3, y);
            y += 15;
        }

        rsi.totalChildren(9);

        rsi.child(0, 166001, 185, 40);
        rsi.child(1, 166002, 249, 49);

        rsi.child(2, 166100, 198, 68);


        rsi.child(3, 166003, 249, 180);
        rsi.child(4, 166004, 248, 200);
        rsi.child(5, 166005, 217, 219);
        rsi.child(6, 166006, 247, 222);
        rsi.child(7, 166007, 217, 245);
        rsi.child(8, 166008, 247, 248);

    }
}
