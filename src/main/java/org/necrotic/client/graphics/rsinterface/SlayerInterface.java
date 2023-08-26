package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class SlayerInterface extends RSInterface{

    public static void build(TextDrawingArea[] tda) {
        RSInterface rsi = addInterface(166200);

        addSpriteLoader(166201, 3161);
        addText(166202, "Slayer", ColorConstants.AQUA, true, true, -1, 2);
        addCloseButton(166203, 166204, 166205);

        addText(166206, "Task Name", ColorConstants.SNOW_WHITE, true, true, -1, 1);
        drawNpcOnInterface(166207, 100, 1000);

        addButtonWSpriteLoader(166208, 3043, "Assign");
        addText(166209, "Assign", ColorConstants.SNOW_WHITE, true, true, -1, 1);
        addButtonWSpriteLoader(166210, 3043, "Rewards");
        addText(166211, "Rewards", ColorConstants.SNOW_WHITE, true, true, -1, 1);
        addButtonWSpriteLoader(166212, 3043, "Blocked");
        addText(166213, "Blocked", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        rsi.totalChildren(11);
        int x = 185;
        int y = 20;

        rsi.child(0, 166201, x, y);
        rsi.child(1, 166202, x + 100, y + 10);
        rsi.child(2, 166203, x + 165, y + 6);

        rsi.child(3, 166206, x + 100, y + 45);
        rsi.child(4, 166207, x + 35, y + 70);

        rsi.child(5, 166208, x + 40, y + 185);
        rsi.child(6, 166209, x + 100, y + 195);
        rsi.child(7, 166210, x + 40, y + 220);
        rsi.child(8, 166211, x + 100, y + 230);
        rsi.child(9, 166212, x + 40, y + 255);
        rsi.child(10, 166213, x + 100, y + 265);

    }
}
