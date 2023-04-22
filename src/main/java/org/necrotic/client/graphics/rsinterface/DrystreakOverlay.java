package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;

public class DrystreakOverlay extends RSInterface{

    public static void init() {
        RSInterface rsInterface = addInterface(60_000);
        addRectangle(60_001, 77, 0x40372A, true, 55, 55);
        addRectangle(60_002, 256, 0x242017, false, 56, 56);
        addRectangle(60_003, 256, 0x5A4F3A, false, 54, 54);
        addText(60_004, "0", ColorConstants.RS_ORANGE, true, true, 52, 3);

        rsInterface.totalChildren(4);
        rsInterface.child(0, 60_001, 455, 7);
        rsInterface.child(1, 60_002, 454, 6);
        rsInterface.child(2, 60_003, 455, 7);
        rsInterface.child(3, 60_004, 482, 25);

    }
}
