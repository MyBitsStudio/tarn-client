package org.necrotic.client.graphics.rsinterface;

import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class EventPanel extends RSInterface {

    public static void build(TextDrawingArea[] tda){
        int interID = 73000;
        RSInterface tab = addInterface(interID);


        int id = interID + 1;
        int c = 0;
        int x = 0;
        int y = 0;
        tab.totalChildren(4);

        addSpriteLoader(id, 1563);
        tab.child(c++, id++, 2 + x, 30 + y);

        tab.child(c++, 74000, 0, 0);

        addText(id, "@whi@Events & More", tda, 2, 0xFFFFFF, true, true);
        tab.child(c++, id++, 95 + x, 37 + y);

        tab.child(c++, 73500, 4 + x, 58 + y);


        interID = 73500;
        RSInterface info = addInterface(interID);
        info.width = 182 - 16;
        info.height = 195;
        info.scrollMax = 500;
        id = interID + 1;
        c = 0;
        x = -5;
        y = 3;
        info.totalChildren(15);

        addText(id, "BOSSES", tda, 2, 0xFFFFFF, true, true);
        info.child(c++, id++, 85 + x, y);
        y += 20;

        addText(id, "-------------------", tda, 2, 0xFFFFFF, true, true);
        info.child(c++, id++, 85 + x, y);
        y += 20;

        addText(id, "GLOBALS", tda, 2, 0xFFFFFF, true, true);
        info.child(c++, id++, 85 + x, y);
        y += 20;

        for (int i = 0; i < 8; i++) {
            addText(id, "id: " + id, tda, 0, 0xFFFFFF, false, true);
            info.child(c++, id++, 10 + x, y);
            y += 17;
        }


        y += 5;
        addText(id, "SPECIALS", tda, 2, 0xFFFFFF, true, true);
        info.child(c++, id++, 85 + x, y);
        y += 20;

        for (int i = 0; i < 3; i++) {
            addText(id, "id: " + id, tda, 0, 0xFFFFFF, false, true);
            info.child(c++, id++, 10 + x, y);
            y += 17;
        }


        interID = 74000;
        RSInterface list = addInterface(interID);
        list.width = 190;
        list.height = 44;
        list.scrollMax = 44;
        id = interID + 1;
        c = 0;
        x = 0;
        y = 0;
        list.totalChildren(12);

        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Bosses", 0, 5, 6000);
        list.child(c++, id++, 33 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Staff Events", 1, 5, 6000);
        list.child(c++, id++, 63 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Donation Events", 2, 5, 6000);
        list.child(c++, id++, 93 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Coming Soon", 3, 5, 6000);
        list.child(c++, id++, 123 + x, 5 + y);

        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 108 + x, 5 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 138 + x, 5 + y);


        addSpriteLoader(id, 1930);
        list.child(c++, id++, 39 + x, 10 + y);
        addSpriteLoader(id, 1559);
        list.child(c++, id++, 70 + x, 11 + y);
        addSpriteLoader(id, 1420);
        list.child(c++, id++, 102 + x, 14 + y);
        addSpriteLoader(id, 1419);
        list.child(c++, id++, 131 + x, 11 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 100 + x, 10 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 130 + x, 10 + y);

    }

    public static void buildDeals(TextDrawingArea[] tda){
        int interID = 75000;
        RSInterface tab = addInterface(interID);
        int id = interID + 1;
        int c = 0;
        int x = 0;
        int y = 0;
        tab.totalChildren(4);

        addSpriteLoader(id, 1563);
        tab.child(c++, id++, 2 + x, 30 + y);

        tab.child(c++, 76000, 0, 0);

        addText(id, "@whi@Events & More", tda, 2, 0xFFFFFF, true, true);
        tab.child(c++, id++, 95 + x, 37 + y);

        tab.child(c++, 75500, 4 + x, 58 + y);


        interID = 75500;
        RSInterface info = addInterface(interID);
        info.width = 182 - 16;
        info.height = 195;
        info.scrollMax = 700;
        id = interID + 1;
        c = 0;
        x = -5;
        y = 3;
        info.totalChildren(33);

        addText(id, "DONATE DEALS", tda, 2, 0xFFFFFF, true, true);
        info.child(c++, id++, 85 + x, y);
        y += 20;

        addText(id, "-------------------", tda, 2, 0xFFFFFF, true, true);
        info.child(c++, id++, 85 + x, y);
        y += 20;

        addText(id, "SALES", tda, 2, 0xFFFFFF, true, true);
        info.child(c++, id++, 85 + x, y);
        y += 20;

        for (int i = 0; i < 8; i++) {
            addText(id, "id: " + id, tda, 0, 0xFFFFFF, false, true);
            info.child(c++, id++, 10 + x, y);
            y += 17;
        }


        y += 5;
        addText(id, "SPECIALS", tda, 2, 0xFFFFFF, true, true);
        info.child(c++, id++, 85 + x, y);
        y += 20;

        for (int i = 0; i < 10; i++) {
            addText(id, "id: " + id, tda, 0, 0xFFFFFF, false, true);
            info.child(c++, id++, 10 + x, y);
            y += 17;
        }

        y += 5;
        addText(id, "DOUBLED", tda, 2, 0xFFFFFF, true, true);
        info.child(c++, id++, 85 + x, y);
        y += 20;

        for (int i = 0; i < 10; i++) {
            addText(id, "id: " + id, tda, 0, 0xFFFFFF, false, true);
            info.child(c++, id++, 10 + x, y);
            y += 17;
        }

        interID = 76000;
        RSInterface list = addInterface(interID);
        list.width = 190;
        list.height = 44;
        list.scrollMax = 44;
        id = interID + 1;
        c = 0;
        x = 0;
        y = 0;
        list.totalChildren(12);

        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Bosses", 0, 5, 6000);
        list.child(c++, id++, 33 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Staff Events", 1, 5, 6000);
        list.child(c++, id++, 63 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Donation Events", 2, 5, 6000);
        list.child(c++, id++, 93 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Coming Soon", 3, 5, 6000);
        list.child(c++, id++, 123 + x, 5 + y);

        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 108 + x, 5 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 138 + x, 5 + y);


        addSpriteLoader(id, 1930);
        list.child(c++, id++, 39 + x, 10 + y);
        addSpriteLoader(id, 1559);
        list.child(c++, id++, 70 + x, 11 + y);
        addSpriteLoader(id, 1420);
        list.child(c++, id++, 102 + x, 14 + y);
        addSpriteLoader(id, 1419);
        list.child(c++, id++, 131 + x, 11 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 100 + x, 10 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 130 + x, 10 + y);
    }
}
