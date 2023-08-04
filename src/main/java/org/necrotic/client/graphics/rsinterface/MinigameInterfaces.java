package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;

public class MinigameInterfaces extends RSInterface {

    public static void build() {
        lobby();
        game();
    }

    private static void lobby() {
        RSInterface rsi = addInterface(151100);
        addRectangle(151101, 80, 0x40372A, true, 90, 37);
        addRectangle(151102, 256, 0x242017, false, 91, 38);
        addRectangle(151103, 256, 0x5A4F3A, false, 89, 36);
        addText(151104, "Players: 1", ColorConstants.RS_ORANGE, false, true, 52, 1);
        addText(151105, "Time left: 2 min", ColorConstants.RS_ORANGE, false, true, 52, 1);

        rsi.totalChildren(5);
        rsi.child(0, 151101, 420, 7);
        rsi.child(1, 151102, 419, 6);
        rsi.child(2, 151103, 420, 7);
        rsi.child(3, 151104, 423, 10);
        rsi.child(4, 151105, 423, 25);
    }

    private static void game() {
        RSInterface rsi = addInterface(151106);
        addRectangle(151107, 256, 0x242017, false, 115, 85);
        addRectangle(151108, 256, 0x5A4F3A, false, 113, 83);

        addText(151109, "Elder", 65280, false, true, -1, 1);
        addText(151110, "Magic", 65280, false, true, -1, 1);
        addText(151111, "Yew", 65280, false, true, -1, 1);
        addText(151112, "Maple", 65280, false, true, -1, 1);

        addProgressBar(151113, 73, 14, 0, 0x56ab29, 0xff0101);
        addProgressBar(151114, 73, 14, 0, 0x56ab29, 0xff0101);
        addProgressBar(151115, 73, 14, 0, 0x56ab29, 0xff0101);
        addProgressBar(151116, 73, 14, 0, 0x56ab29, 0xff0101);

        addRectangle(151117, 80, 0x3e352a, true, 300, 40);
        addRectangle(151118, 256, 0x221e18, false, 300, 40);
        addProgressBar(151119, 297, 22, 0, 0x56ab29, 0xff0101);

        addText(151120, "Obelisk", ColorConstants.RS_ORANGE, false, true, -1, 0);
        addText(151121, "100/5000", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        rsi.totalChildren(15);
        rsi.child(0, 151107, 391, 230);
        rsi.child(1, 151108, 392, 231);
        rsi.child(2, 151109, 393, 235);
        rsi.child(3, 151110, 393, 255);
        rsi.child(4, 151111, 393, 275);
        rsi.child(5, 151112, 393, 295);
        rsi.child(6, 151113, 430, 235);
        rsi.child(7, 151114, 430, 255);
        rsi.child(8, 151115, 430, 275);
        rsi.child(9, 151116, 430, 295);
        rsi.child(10, 151117, 118, 15);
        rsi.child(11, 151118, 118, 15);
        rsi.child(12, 151119, 120, 32);
        rsi.child(13, 151120, 250, 20);
        rsi.child(14, 151121, 265, 36);

    }

}
