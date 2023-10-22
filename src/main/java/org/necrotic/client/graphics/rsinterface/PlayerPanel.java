package org.necrotic.client.graphics.rsinterface;

import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class PlayerPanel extends RSInterface{
    public static void panelInterface(TextDrawingArea[] tda) {
        topPanel(tda);
        firstPanel(tda);
        // 70 71 progress , 202 sperator
        int interID = 111000;
        RSInterface tab = addInterface(interID);
        int id = interID + 1;
        int c = 0;
        int x = 0;
        int y = 0;
        tab.totalChildren(4);

        addSpriteLoader(id, 1563);
        tab.child(c++, id++, 2 + x, 30 + y);

        tab.child(c++, 111100, 0, 0);

        addText(id, "@whi@World Information", tda, 2, 0xFFFFFF, true, true);
        tab.child(c++, id++, 95 + x, 37 + y);

        tab.child(c++, 111200, 4 + x, 58 + y);

    }

    public static void firstPanel(TextDrawingArea[] tda){
        String[] infos = {"@whi@Online Players : 120", "@whi@Server Time : 12:23:49",
                "@whi@Date : 12/12/2020", "@whi@Perk : 2x Slayer Tickets"};
        int[] logos = {3390, 2499, 2511, 3504};

        int interID = 111200;
        RSInterface info = addInterface(interID);
        info.width = 182 - 16;
        info.height = 195;
        info.scrollMax = 500;
        int id = interID + 1;
        int c = 0;
        int x = -5;
        int y = 3;
        info.totalChildren(12);

        for(int i = 0; i < 4; i++){
            addSpriteLoader(id, 493);
            info.child(c++, id++, x+=8, y+=1);
            addSpriteLoader(id, logos[i]);
            info.child(c++, id++, x+=3, y+=10);
            addText(id, infos[i], tda, 1, 0xFFFFFF, true, true);
            info.child(c++, id++, x+=86, y-=3);
            x = -5;
            y+= 25;
        }
    }
    public static void secondInterface(TextDrawingArea[] tda) {
        topPanel(tda);
        secondPanel(tda);
        // 70 71 progress , 202 sperator
        int interID = 111300;
        RSInterface tab = addInterface(interID);
        int id = interID + 1;
        int c = 0;
        int x = 0;
        int y = 0;
        tab.totalChildren(4);

        addSpriteLoader(id, 1563);
        tab.child(c++, id++, 2 + x, 30 + y);

        tab.child(c++, 111100, 0, 0);

        addText(id, "@whi@Player Information", tda, 2, 0xFFFFFF, true, true);
        tab.child(c++, id++, 95 + x, 37 + y);

        tab.child(c++, 111400, 4 + x, 58 + y);

    }


    public static void secondPanel(TextDrawingArea[] tda){
        String[] infos = {"@whi@Time Played : 23d 12h", "@whi@Mode : Ultimate Ironman",
                "@whi@Staff : Administrator", "@whi@VIP : Diamond", "@whi@ Kill Count : 15610251",
                "@whi@Total Votes : 120", "@whi@VIP Points : 120", "@whi@VIP Exp : 120",
                "@whi@Pack Exp : 120", "@whi@Loyalty Exp : 120", "@whi@Loyalty Level : 120"};
        int[] logos = {3504, 3429, 3108, 3064, 2831, 2507, 2497, 2491, 2492, 2490, 2343};

        int interID = 111400;
        RSInterface info = addInterface(interID);
        info.width = 182 - 16;
        info.height = 195;
        info.scrollMax = 500;
        int id = interID + 1;
        int c = 0;
        int x = -5;
        int y = 3;
        info.totalChildren(33);

        for(int i = 0; i < 11; i++){
            addSpriteLoader(id, 493);
            info.child(c++, id++, x+=8, y+=1);
            addSpriteLoader(id, logos[i]);
            info.child(c++, id++, x+=3, y+=10);
            addText(id, infos[i], tda, 1, 0xFFFFFF, true, true);
            info.child(c++, id++, x+=86, y-=3);
            x = -5;
            y+= 25;
        }

    }

    public static void thirdInterface(TextDrawingArea[] tda) {
        topPanel(tda);
        thirdPanel(tda);
        // 70 71 progress , 202 sperator
        int interID = 111500;
        RSInterface tab = addInterface(interID);
        int id = interID + 1;
        int c = 0;
        int x = 0;
        int y = 0;
        tab.totalChildren(4);

        addSpriteLoader(id, 1563);
        tab.child(c++, id++, 2 + x, 30 + y);

        tab.child(c++, 111100, 0, 0);

        addText(id, "@whi@Commands", tda, 2, 0xFFFFFF, true, true);
        tab.child(c++, id++, 95 + x, 37 + y);

        tab.child(c++, 111600, 4 + x, 58 + y);

    }

    public static void thirdPanel(TextDrawingArea[] tda){

        int interID = 111600;
        RSInterface info = addInterface(interID);
        info.width = 182 - 16;
        info.height = 195;
        info.scrollMax = 50000;
        int id = interID + 1;
        int c = 0;
        int x = -5;
        int y = 3;

        info.totalChildren(100);

        for(int i = 0; i < 50; i++){
            addButtonWSpriteLoader(id, 493, "Activate");
            info.child(c++, id++, x+=8, y+=1);
            addText(id, "Coming Soon!!!", tda, 1, 0xFFFFFF, true, true);
            info.child(c++, id++, x+=86, y+=7);
            x = -5;
            y+= 28;
        }

    }

    public static void fourInterface(TextDrawingArea[] tda) {
        topPanel(tda);
        fourPanel(tda);
        // 70 71 progress , 202 sperator
        int interID = 111700;
        RSInterface tab = addInterface(interID);
        int id = interID + 1;
        int c = 0;
        int x = 0;
        int y = 0;
        tab.totalChildren(4);

        addSpriteLoader(id, 1563);
        tab.child(c++, id++, 2 + x, 30 + y);

        tab.child(c++, 111100, 0, 0);

        addText(id, "@whi@Content Links", tda, 2, 0xFFFFFF, true, true);
        tab.child(c++, id++, 95 + x, 37 + y);

        tab.child(c++, 111800, 4 + x, 58 + y);
    }

    public static void fourPanel(TextDrawingArea[] tda){
        String[] infos = {"@whi@Tracks", "@whi@Battlepass",
                "@whi@Achievements", "@whi@Drop Tables", "@whi@Collection Log",
                "@whi@Possible Loot", "@whi@Best In Slot", "@whi@Kill Tracker",
                "@whi@Forge", "@whi@VIP"};
        int[] logos = {3258, 3257, 3259, 3130, 2514, 3128, 2489, 2501, 2832, 3065};

        int interID = 111800;
        RSInterface info = addInterface(interID);
        info.width = 182 - 16;
        info.height = 195;
        info.scrollMax = 500;
        int id = interID + 1;
        int c = 0;
        int x = -5;
        int y = 3;
        info.totalChildren(30);

        for(int i = 0; i < 10; i++){
            addButtonWSpriteLoader(id, 493, infos[i]);
            info.child(c++, id++, x+=8, y+=1);
            addSpriteLoader(id, logos[i]);
            info.child(c++, id++, x+=3, y+=10);
            addText(id, infos[i], tda, 1, 0xFFFFFF, true, true);
            info.child(c++, id++, x+=86, y-=3);
            x = -5;
            y+= 25;
        }

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

        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "World Information", 0, 5, 6000);
        list.child(c++, id++, 33 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Player Information", 1, 5, 6000);
        list.child(c++, id++, 63 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Commands", 2, 5, 6000);
        list.child(c++, id++, 93 + x, 5 + y);
        addConfigButtonWSpriteLoader(id, interID, 1564, 1565, 31, 27, "Content Links", 3, 5, 6000);
        list.child(c++, id++, 123 + x, 5 + y);

        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 108 + x, 5 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 138 + x, 5 + y);


        addSpriteLoader(id, 1566);
        list.child(c++, id++, 40 + x, 10 + y);
        addSpriteLoader(id, 1569);
        list.child(c++, id++, 70 + x, 10 + y);
        addSpriteLoader(id, 2505);
        list.child(c++, id++, 104 + x, 14 + y);
        addSpriteLoader(id, 1568);
        list.child(c++, id++, 130 + x, 10 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 100 + x, 10 + y);
        addText(id, "", tda, 2, 0xFFFFFF, true, true);
        list.child(c++, id++, 130 + x, 10 + y);
    }
}
