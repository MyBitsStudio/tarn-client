package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class VIPInterface extends RSInterface{

    public static void build(TextDrawingArea[] tda){
        RSInterface main = addInterface(77000);

        addSpriteLoader(77001, 3042);
        addText(77002, "VIP", ColorConstants.SNOW_WHITE, true, true, -1, 2);
        addCloseButton(77003, 77004, 77005);

        RSInterface teleScroll = addInterface(78000);
        teleScroll.width = 152;
        teleScroll.height = 221;
        teleScroll.scrollMax = 700;
        teleScroll.totalChildren(35);

        for(int i = 0; i < 35; i++) {
            addClickableText(78001 + i, ""+i, "Check", tda, 0, 0xFF8900, true, true, 151);
            teleScroll.child( i, 78001 + i, 10, 5 + (i * 20));
        }

        addText(77006, "Donations", ColorConstants.SNOW_WHITE, true, true, -1, 0);

        addText(77007, "Information", ColorConstants.SNOW_WHITE, true, true, -1, 0);
        addText(77008, "Points : 5,612", ColorConstants.SNOW_WHITE, true, true, -1, 0);
        addText(77009, "Level : 7", ColorConstants.SNOW_WHITE, true, true, -1, 0);
        addText(77010, "Rank : Mythic", ColorConstants.SNOW_WHITE, true, true, -1, 0);
        addText(77011, "Instance : +45M", ColorConstants.SNOW_WHITE, true, true, -1, 0);
        addText(77012, "Tickets : 6", ColorConstants.SNOW_WHITE, true, true, -1, 0);
        addText(77013, "Double Drop : 12%", ColorConstants.SNOW_WHITE, true, true, -1, 0);

        addText(77014, "Next : 35$", ColorConstants.SNOW_WHITE, true, true, -1, 0);

        dropGroup(77015, 1, 1, 1, 1);

        addButtonWSpriteLoader(77016, 2895, "Donate");
        addText(77017, "Donate", ColorConstants.SNOW_WHITE, true, true, -1, 0);

        addButtonWSpriteLoader(77018, 2895, "Store");
        addText(77019, "Store", ColorConstants.SNOW_WHITE, true, true, -1, 0);


        main.totalChildren(18);
        main.child(0, 77001, 20, 15);
        main.child(1, 77002, 260, 26);
        main.child(2, 77003, 456, 22);

        main.child(3, 78000, 20, 76);

        main.child(4, 77006, 105, 60);

        main.child(5, 77007, 351, 61);
        main.child(6, 77008, 275, 85);
        main.child(7, 77009, 275, 105);
        main.child(8, 77010, 275, 125);
        main.child(9, 77011, 385, 85);
        main.child(10, 77012, 385, 105);
        main.child(11, 77013, 385, 125);

        main.child(12, 77014, 351, 182);
        main.child(13, 77015, 336, 210);

        main.child(14, 77016, 235, 280);
        main.child(15, 77017, 269, 287);

        main.child(16, 77018, 330, 280);
        main.child(17, 77019, 365, 287);
    }
}
