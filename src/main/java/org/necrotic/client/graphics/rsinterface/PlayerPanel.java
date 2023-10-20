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

        addSpriteLoader(id, 1563);
        tab.child(c++, id++, 2 + x, 30 + y);

        tab.child(c++, 111100, 0, 0);


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
