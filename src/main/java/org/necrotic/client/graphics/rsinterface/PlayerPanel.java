package org.necrotic.client.graphics.rsinterface;

import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class PlayerPanel extends RSInterface{

    public static void panelInterface(TextDrawingArea[] tda) {
        topPanel(tda);


        int interID = 111000;
        RSInterface tab = addInterface(interID);
        int id = interID + 1;
        int c = 0;
        int x = 0;
        int y = 0;
        tab.totalChildren(4);
        //1418
        //1471

        addSpriteLoader(id, 1563);
        tab.child(c++, id++, 2 + x, 30 + y);

        tab.child(c++, 111100, 0, 0);

        addText(id, "@whi@World Information", tda, 2, 0xFFFFFF, true, true);
        tab.child(c++, id++, 95 + x, 37 + y);

        tab.child(c++, 111200, 4 + x, 58 + y);

        interID = 111200;
        RSInterface info = addInterface(interID);
        info.width = 182 - 16;
        info.height = 195;
        info.scrollMax = 500;
        id = interID + 1;
        c = 0;
        x = -5;
        y = 3;
        info.totalChildren(2);

        addSpriteLoader(id, 1318);
        info.child(c++, id++, 9 + x, 25 + y);
        addText(id, "@whi@Online Players : 120", tda, 2, 0xFFFFFF, true, true);
        info.child(c++, id++, 47 + x, 40 + y);


    }

    public static void topPanel(TextDrawingArea[] tda){
        int interID = 111100;
        RSInterface list = addInterface(interID);
        list.width = 190;
        list.height = 44;
        list.scrollMax = 44;
        int id = interID + 1;
        int c = 0;
        int x = 0;
        int y = 0;
        list.totalChildren(12);

        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "View World Information", 0, 5, 6000);
        list.child(c++, id++, 33 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "View Account Information", 1, 5, 6000);
        list.child(c++, id++, 63 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "View Interfaces", 2, 5, 6000);
        list.child(c++, id++, 93 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "View Slayer Hub", 3, 5, 6000);
        list.child(c++, id++, 123 + x, 5 + y);

        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        //	addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "View Achievements", 3, 5, 6000);
        list.child(c++, id++, 108 + x, 5 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        //addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "View Raids", 4, 5, 6000);
        list.child(c++, id++, 138 + x, 5 + y);


        addSpriteLoader(id, 1566);
        list.child(c++, id++, 40 + x, 10 + y);
        addSpriteLoader(id, 1569);
        list.child(c++, id++, 70 + x, 10 + y);
        addSpriteLoader(id, 3303);
        list.child(c++, id++, 100 + x, 10 + y);
        addSpriteLoader(id, 1568);
        list.child(c++, id++, 130 + x, 10 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        //addSpriteLoader(id, 1567);
        list.child(c++, id++, 100 + x, 10 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        //addSpriteLoader(id, 1570);
        list.child(c++, id++, 130 + x, 10 + y);
    }
}
