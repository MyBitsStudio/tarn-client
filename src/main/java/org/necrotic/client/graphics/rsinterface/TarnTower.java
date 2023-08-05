package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class TarnTower extends RSInterface{

    public static void build(TextDrawingArea[] tda){
        RSInterface main = addInterface(81000);

        addSpriteLoader(81001, 2986);
        addText(81002, "Tower", ColorConstants.PURPLE, true, true, -1, 2);
        addCloseButton(81003, 81004, 81005);

        addText(81006, "Info ", ColorConstants.SNOW_WHITE, true, true, -1, 1);
        addText(81007, "Tier ", ColorConstants.SNOW_WHITE, true, true, -1, 1);
        addText(81008, "Level ", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addText(81009, "Next Level", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        drawNpcOnInterface(81010, 100, 1000);

        addSpriteLoader(81011, 2911);

        addText(81012, "Rewards", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        RSInterface items = addTabInterface(81030);
        items.totalChildren(28);
        items.height = 70;
        items.width = 265;
        items.scrollMax = 200;

        int y = 2;
        int x = 1;
        int c = 0;
        int id = 81031;

        for (int z = 0; z < 4; z++) {
            for (int i = 0; i < 7; i++) {
                dropGroup(id, 1, 1, 1, 1);
                items.child(c++, id++, x, y);
                x += 36;
            }
            x = 0;
            y += 35;
        }

        addButtonWSpriteLoader(81013, 3043, "Start");
        addText(81014, "Start", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        addButtonWSpriteLoader(81015, 3043, "Claim");
        addText(81016, "Claim", ColorConstants.SNOW_WHITE, true, true, -1, 1);

        main.totalChildren(15);
        main.child(0, 81001, 20, 15);
        main.child(1, 81002, 255, 21);
        main.child(2, 81003, 435, 17);

        main.child(3, 81006, 110, 46);
        main.child(4, 81007, 89, 70);
        main.child(5, 81008, 89, 101);

        main.child(6, 81009, 345, 46);
        main.child(7, 81010, 240, 70);
        main.child(8, 81011, 362, 160);

        main.child(9, 81012, 185, 220);
        main.child(10, 81030, 40, 245);

        main.child(11, 81013, 340, 249);
        main.child(12, 81014, 400, 256);

        main.child(13, 81015, 340, 280);
        main.child(14, 81016, 400, 287);
    }
}
