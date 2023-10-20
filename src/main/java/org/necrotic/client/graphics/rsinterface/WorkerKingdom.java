package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;

import static org.necrotic.client.graphics.rsinterface.CustomInterfaces.tda;

public class WorkerKingdom extends RSInterface {

    public static void build() {
        mainInterface();
    }

    public static void mainInterface() {
        RSInterface rsi = addInterface(167500);
        rsi.totalChildren(4);

        addSpriteLoader(167501,1334);
        rsi.child(0, 167501, 9, 15);

        addText(167502, "World Management", ColorConstants.ORANGE, true, true, -1, 2);
        rsi.child(1, 167502, 245, 25);

        hoverButton(167503, 652, 653, "Close");
        rsi.child(2, 167503, 476, 22);

        RSInterface map = addInterface(167504);
        map.width = 480;
        map.height = 268;
        map.scrollMax = 550;
        rsi.child(3, 167504, 0, 50);

        map.totalChildren(8);

        addHDSprite(167505, 3501, 3501);
        map.child(0, 167505, 15, 0);

        hoverButton(167506, 456, 457, "World_1");
        map.child(1, 167506, 50, 50);

        hoverButton(167507, 456, 457, "World_2");
        map.child(2, 167507, 151, 185);

        hoverButton(167508, 456, 457, "World_3");
        map.child(3, 167508, 312, 38);

        hoverButton(167509, 456, 457, "World_4");
        map.child(4, 167509, 315, 230);

        hoverButton(167510, 456, 457, "World_5");
        map.child(5, 167510, 40, 325);

        hoverButton(167511, 456, 457, "World_6");
        map.child(6, 167511, 200, 400);

        hoverButton(167512, 456, 457, "World_7");
        map.child(7, 167512, 290, 490);

        RSInterface workerOverlay = addInterface(167513);
        workerOverlay.totalChildren(5);

        addRectangle(167514, 495, 310, 0, 80,true);
        workerOverlay.child(0, 167514, 9, 15);

        addSpriteLoader(167515, 1534);
        workerOverlay.child(1, 167515, 90, 50);

        hoverButton(167516, 652, 653, "Close");
        workerOverlay.child(2, 167516, 394, 57);

        addText(167517, "World_name", ColorConstants.ORANGE, true, true, -1, 2);
        workerOverlay.child(3, 167517, 255, 60);

        RSInterface workersScroll = addInterface(167518);
        workersScroll.width = 320;
        workersScroll.height = 195;
        workersScroll.scrollMax = 500;
        workerOverlay.child(4, 167518, 80, 84);
        workersScroll.totalChildren(140);

        addSprite(167519, 3382);
        int y = 48;
        for(int i = 0; i < 10; i++) {
            workersScroll.child(i, 167519, 16, y);
            workersScroll.child(i+10, 167519, 156, y);
            addHoverableText(167520+i, "Add Worker", "Select", tda, 1, false, false, 65, ColorConstants.ORANGE, ColorConstants.SNOW_WHITE);
            workersScroll.child(i+20, 167520+i, 140, y-30);
            addText(167530+i, "Lv.31@or2@ Worker name here", 0xbdb1a1, false, true, -1, 1);
            workersScroll.child(i+30, 167530+i, 65, y-45);
            addRectangle(167623+i, 256, 0x242017, false, 46, 46);
            addRectangle(167633+i, 256, 0x5A4F3A, false, 44, 44);
            workersScroll.child(i+40, 167623+i, 16, y-46);
            workersScroll.child(i+50, 167633+i, 17, y+1-46);
            addProgressBar(167543+i, 41, 11, 10*i, 0xce7616, 0x2b292a);
            workersScroll.child(i+60, 167543+i, 19, y-13);
            addItemOnInterface(167553+i, 167518, new String[]{});
            RSInterface.interfaceCache[167553+i].hideExamine = true;
            RSInterface.interfaceCache[167553+i].inv[0] = 19994;
            RSInterface.interfaceCache[167553+i].invStackSizes[0] = 1;
            workersScroll.child(i+70, 167553+i, 21, y-46);
            addText(167563+i, "0/0", 0x9f9488, true, true, -1, 0);
            workersScroll.child(i+80, 167563+i, 39, y-13);
            addProgressBar(167573+i, 220, 17, 10*i, 0x8a7e6f, 0x47484d);
            workersScroll.child(i+90, 167573+i, 65, y-20);
            hoverButton(167583+i, 3502, 3503, "Cancel");
            workersScroll.child(i+100, 167583+i, 287, y-18);
            hoverButton(167593+i, 3504, 3505, "Repeat");
            workersScroll.child(i+110, 167593+i, 303, y-19);
            addButton(167603+i, 2019, "Feed");
            workersScroll.child(i+120, 167603+i, 300, y-45);
            addText(167613+i, "31 m 56 s [Excavation]", 0xd9c9b3, false, true, -1, 1);
            workersScroll.child(i+130, 167613+i, 70, y-19);
            y += 50;
        }

    }
}
