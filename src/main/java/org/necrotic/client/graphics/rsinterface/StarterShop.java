package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class StarterShop extends RSInterface {

    public static void build(TextDrawingArea[] tda){ //2936
        RSInterface rsi = addInterface(164000);

        addSpriteLoader(164001, 2852);
        addText(164002, "Starter Shop", ColorConstants.AQUA, true, true, -1, 2);
        addCloseButton(164003, 164004, 164005);

        addButtonWSpriteLoader(164006, 2829, "Store");
        addText(164007, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(164008, 2829, "Store");
        addText(164009, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(164010, 2829, "Store");
        addText(164011, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(164012, 2829, "Store");
        addText(164013, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(164014, 2829, "Store");
        addText(164015, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(164016, 2829, "Store");
        addText(164017, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(164018, 2829, "Store");
        addText(164019, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        RSInterface items = addTabInterface(164100);
        items.totalChildren(1);
        items.height = 272;
        items.width = 319;
        items.scrollMax = 800;

        int x = 0, yz = 2, id = 164101;

        addToItemGroup(id, 7, 15, 12, 12, true, new String[]{"Value", "Buy 1", "Buy 5", "Buy 10", "Buy X"});
        items.child(0, id, x, yz);

        rsi.totalChildren(18);
        rsi.child(0, 164001, 8, 8);
        rsi.child(1, 164002, 256, 19);
        rsi.child(2, 164003, 472, 16);

        rsi.child(3, 164006, 19, 46);
        rsi.child(4, 164007, 80, 56);
        rsi.child(5, 164008, 19, 82);
        rsi.child(6, 164009, 80, 92);
        rsi.child(7, 164010, 19, 118);
        rsi.child(8, 164011, 80, 128);
        rsi.child(9, 164012, 19, 154);
        rsi.child(10, 164013, 80, 164);
        rsi.child(11, 164014, 19, 190);
        rsi.child(12, 164015, 80, 200);
        rsi.child(13, 164016, 19, 226);
        rsi.child(14, 164017, 80, 236);
        rsi.child(15, 164018, 19, 262);
        rsi.child(16, 164019, 80, 272);

        rsi.child(17, 164100, 160, 46);

    }
}
