package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;

public class InstanceTimerOverlay extends RSInterface{

    public static void init() {
        RSInterface rsInterface = addInterface(63_000);
        addRectangle(63_001, 77, 0x40372A, true, 55, 55);
        addRectangle(63_002, 256, 0x242017, false, 56, 56);
        addRectangle(63_003, 256, 0x5A4F3A, false, 54, 54);
        addText(63_004, "0", ColorConstants.SNOW_WHITE, true, true, 52, 3);

        rsInterface.totalChildren(4);
        rsInterface.child(0, 63_001, 455, 60);
        rsInterface.child(1, 63_002, 454, 59);
        rsInterface.child(2, 63_003, 455, 60);
        rsInterface.child(3, 63_004, 482, 78);

    }
}
