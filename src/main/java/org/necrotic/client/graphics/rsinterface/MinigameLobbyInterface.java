package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;

public class MinigameLobbyInterface extends RSInterface {

    public static void build() {
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
}
