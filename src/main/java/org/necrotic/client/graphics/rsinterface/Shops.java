package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class Shops extends RSInterface {

    //2954 -- upgrade interface

    public static void build(TextDrawingArea[] tda){ //2936
        RSInterface rsi = addInterface(160000);
        rsi.totalChildren(3);

        addSpriteLoader(160001, 2852);
        addText(160002, "Shop", ColorConstants.AQUA, true, true, -1, 2);
        addCloseButton(160003, 160004, 160005);

        rsi.child(0, 160001, 8, 8);
        rsi.child(1, 160002, 256, 19);
        rsi.child(2, 160003, 472, 19);

    }
}
