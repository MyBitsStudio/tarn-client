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

        addText(167502, "Worlds Kingdom", ColorConstants.ORANGE, true, true, -1, 2);
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
        workersScroll.totalChildren(30);

        addSprite(167519, 3382);
        int y = 48;
        for(int i = 0; i < 10; i++) {
            workersScroll.child(i, 167519, 16, y);
            workersScroll.child(i+10, 167519, 156, y);

            addHoverableText(167520+i, "Add Worker", "Select", tda, 1, false, false, 65, ColorConstants.ORANGE, ColorConstants.SNOW_WHITE);
            workersScroll.child(i+20, 167520+i, 140, y-30);

            y += 50;
        }
    }
}
