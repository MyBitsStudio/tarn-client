package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class Shops extends RSInterface {

    //2954 -- upgrade interface

    public static void build(TextDrawingArea[] tda){ //2936
        RSInterface rsi = addInterface(160000);

        addSpriteLoader(160001, 2852);
        addText(160002, "Shop", ColorConstants.AQUA, true, true, -1, 2);
        addCloseButton(160003, 160004, 160005);

        addButtonWSpriteLoader(160006, 2829, "Store");
        addText(160007, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(160008, 2829, "Store");
        addText(160009, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(160010, 2829, "Store");
        addText(160011, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(160012, 2829, "Store");
        addText(160013, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(160014, 2829, "Store");
        addText(160015, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(160016, 2829, "Store");
        addText(160017, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(160018, 2829, "Store");
        addText(160019, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        RSInterface items = addTabInterface(162000);
        items.totalChildren(150);
        items.height = 272;
        items.width = 319;
        items.scrollMax = 800;

        int x = 0, c = 0, yz = 2, id = 162001;

        for (int z = 0; z < 15; z++) {
            for (int i = 0; i < 10; i++) {
                dropGroup(id, 1, 1, 1, 1);
                items.child(c++, id++, x, yz);
                x += 36;
            }
            x = 0;
            yz += 35;
        }

        rsi.totalChildren(18);
        rsi.child(0, 160001, 8, 8);
        rsi.child(1, 160002, 256, 19);
        rsi.child(2, 160003, 472, 16);

        rsi.child(3, 160006, 19, 46);
        rsi.child(4, 160007, 80, 56);
        rsi.child(5, 160008, 19, 82);
        rsi.child(6, 160009, 80, 92);
        rsi.child(7, 160010, 19, 118);
        rsi.child(8, 160011, 80, 128);
        rsi.child(9, 160012, 19, 154);
        rsi.child(10, 160013, 80, 164);
        rsi.child(11, 160014, 19, 190);
        rsi.child(12, 160015, 80, 200);
        rsi.child(13, 160016, 19, 226);
        rsi.child(14, 160017, 80, 236);
        rsi.child(15, 160018, 19, 262);
        rsi.child(16, 160019, 80, 272);

        rsi.child(17, 162000, 160, 46);


    }

    public static void buildBuy(TextDrawingArea[] tda){
        RSInterface rsi = addInterface(164000);

        addSpriteLoader(164001, 3009);
        addText(164002, "Buy Item", ColorConstants.AQUA, true, true, -1, 2);

        addText(164003, "90m Tokens", ColorConstants.WHITE, true, true, -1, 1);

        dropGroup(164004, 1, 1, 1, 1);

        addButtonWSpriteLoader(164005, 3296, "Buy");
        addText(164006, "Buy", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(164007, 3296, "Cancel");
        addText(164008, "Cancel", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        rsi.totalChildren(8);

        rsi.child(0, 164001, 190, 40);
        rsi.child(1, 164002, 253, 46);

        rsi.child(2, 164003, 253, 74);

        rsi.child(3, 164004, 236, 110);

        rsi.child(4, 164005, 224, 170);
        rsi.child(5, 164006, 254, 173);

        rsi.child(6, 164007, 224, 200);
        rsi.child(7, 164008, 254, 203);



    }


}
