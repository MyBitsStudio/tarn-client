package org.necrotic.client.graphics.rsinterface;

import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class EventPanel extends RSInterface {

    public static void topPanel(TextDrawingArea[] tda) {
        int interID = 73500;
        RSInterface list = addInterface(interID);
        list.width = 190;
        list.height = 44;
        list.scrollMax = 44;
        int id = interID + 1;
        int c = 0;
        int x = 0;
        int y = 0;
        list.totalChildren(12);

        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Globals", 0, 5, 6000);
        list.child(c++, id++, 33 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Events", 1, 5, 6000);
        list.child(c++, id++, 63 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Slayer Hub", 2, 5, 6000);
        list.child(c++, id++, 93 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Coming Soon", 3, 5, 6000);
        list.child(c++, id++, 123 + x, 5 + y);

        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 108 + x, 5 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 138 + x, 5 + y);


        addSpriteLoader(id, 2831);
        list.child(c++, id++, 40 + x, 10 + y);
        addSpriteLoader(id, 2507);
        list.child(c++, id++, 70 + x, 10 + y);
        addSpriteLoader(id, 3303);
        list.child(c++, id++, 100 + x, 10 + y);
        addSpriteLoader(id, 1568);
        list.child(c++, id++, 130 + x, 10 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 100 + x, 10 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 130 + x, 10 + y);
    }

    public static void build(TextDrawingArea[] tda) {
        topPanel(tda);
        buildGlobals(tda);

        int interID = 73000;
        RSInterface tab = addInterface(interID);

        int id = interID + 1;
        int c = 0;
        int x = 0;
        int y = 0;
        tab.totalChildren(4);

        addSpriteLoader(id, 1563);
        tab.child(c++, id++, 2 + x, 30 + y);

        tab.child(c++, 73500, 0, 0);

        addText(id, "@whi@Globals", tda, 2, 0xFFFFFF, true, true);
        tab.child(c++, id++, 95 + x, 37 + y);

        tab.child(c++, 74000, 4 + x, 58 + y);


    }

    public static void buildTwo(TextDrawingArea[] tda) {
        topPanel(tda);

        int interID = 75000;
        RSInterface tab = addInterface(interID);

        int id = interID + 1;
        int c = 0;
        int x = 0;
        int y = 0;
        tab.totalChildren(4);

        addSpriteLoader(id, 1563);
        tab.child(c++, id++, 2 + x, 30 + y);

        tab.child(c++, 73500, 0, 0);

        addText(id, "@whi@Events", tda, 2, 0xFFFFFF, true, true);
        tab.child(c++, id++, 95 + x, 37 + y);

        tab.child(c++, 76000, 4 + x, 58 + y);

    }

    public static void buildGlobals(TextDrawingArea[] tda) {

        int interID = 74000;
        RSInterface info = addInterface(interID);
        info.width = 182 - 16;
        info.height = 195;
        info.scrollMax = 750;
        int id = interID + 1;
        int c = 0;
        int x = -5;
        int y = 3;
        info.totalChildren(40);

        for (int i = 0; i < 20; i++) {
            addButtonWSpriteLoader(id, 493, "Teleport");
            info.child(c++, id++, x += 8, y += 1);
            addText(id, "", tda, 1, 0xFFFFFF, true, true);
            info.child(c++, id++, x += 78, y +=7);
            x = -5;
            y += 28;
        }
    }

    public static void buildThree(TextDrawingArea[] tda) {
        topPanel(tda);
        slayerHub(tda);

        int interID = 121000;
        RSInterface tab = addInterface(interID);

        int id = interID + 1;
        int c = 0;
        int x = 0;
        int y = 0;
        tab.totalChildren(4);

        addSpriteLoader(id, 1563);
        tab.child(c++, id++, 2 + x, 30 + y);

        tab.child(c++, 73500, 0, 0);

        addText(id, "@whi@Slayer Hub", tda, 2, 0xFFFFFF, true, true);
        tab.child(c++, id++, 95 + x, 37 + y);

        tab.child(c++, 121050, 4 + x, 58 + y);

    }

    public static void slayerHub(TextDrawingArea[] tda){
        int interID = 121050;
        RSInterface info = addInterface(interID);
        info.width = 182 - 16;
        info.height = 195;
        info.scrollMax = 500;
        int id = interID + 1;
        int c = 0;
        int x = -5;
        int y = 3;
        info.totalChildren(11);

        addText(id, "@yel@SLAYER MONSTER HERE", tda, 2, 0xFFFFFF, true, true);
        info.child(c++, id++, x + 90, y + 1);

        addSpriteLoader(id, 1327);
        info.child(c++, id++, x + 14, y + 20);

        addNpc(id, 50);
        info.child(c++, id++, x + 14, y + 18);

        addSpriteLoader(id, 493);
        info.child(c++, id++, x + 8, y + 120);
        addSpriteLoader(id, 3303);
        info.child(c++, id++, x + 14, y + 125);
        addText(id, "@yel@ 16141 / 87162", tda, 1, 0xFFFFFF, true, true);
        info.child(c++, id++, x + 92, y + 128);

        addSpriteLoader(id, 493);
        info.child(c++, id++, x + 8, y + 158);
        addSpriteLoader(id, 2999);
        info.child(c++, id++, x + 16, y + 164);
        addText(id, "@yel@ Streak : 1819", tda, 1, 0xFFFFFF, true, true);
        info.child(c++, id++, x + 92, y + 166);

        addButtonWSpriteLoader(id, 3269, "Slayer Master");
        info.child(c++, id++, x + 25, y + 205);

        addText(id, "@yel@ Slayer Master", tda, 2, 0xFFFFFF, true, true);
        info.child(c++, id++, x + 90, y + 211);
    }

}
