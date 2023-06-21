package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class VIPInterface extends RSInterface{

    public static void build(TextDrawingArea[] tda){
        RSInterface main = addInterface(77000);

        addSpriteLoader(77001, 3042);
        addText(77002, "VIP", ColorConstants.PURPLE, true, true, -1, 2);
        addCloseButton(77003, 77004, 77005);

        RSInterface teleScroll = addInterface(78000);
        teleScroll.width = 163;
        teleScroll.height = 158;
        teleScroll.scrollMax = 700;
        teleScroll.totalChildren(35);

        for(int i = 0; i < 35; i++) {
            addClickableText(78001 + i, ""+i, "Check", tda, 0, 0xFF8900, true, true, 151);
            teleScroll.child( i, 78001 + i, 10, 5 + (i * 20));
        }

        addText(77006, "Donations", ColorConstants.SNOW_WHITE, true, true, -1, 0);

        main.totalChildren(5);
        main.child(0, 77001, 20, 15);
        main.child(1, 77002, 255, 30);
        main.child(2, 77003, 395, 27);

        main.child(3, 78001, 105, 60);

        main.child(4, 77006, 105, 50);
    }
}
