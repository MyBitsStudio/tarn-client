package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class InstanceInterface extends RSInterface {
    public static void build2(TextDrawingArea[] tda){
        RSInterface main = addInterface(70500);

        addSpriteLoader(70501, 3061);
        addText(70502, "Instance Manager", ColorConstants.SNOW_WHITE, true, true, -1, 2);
        newCloseButton(70503, 70504, 70505);

        addButtonWSpriteLoader(70506, 1548, "Multi");
        addButtonWSpriteLoader(70507, 1547, "Single");
        addButtonWSpriteLoader(70508, 1547, "Special");
        addButtonWSpriteLoader(70509, 1547, "");
        addButtonWSpriteLoader(70510, 1547, "");

        addSpriteLoader(70536, 1552);
        addSpriteLoader(70537, 1549);
        addSpriteLoader(70538, 1550);
        addSpriteLoader(70539, 1550);
        addSpriteLoader(70540, 1550);

        drawNpcOnInterface(70511, 100, 1000);
        addText(70512, "This Fucking Monster", ColorConstants.GREEN, true, true, -1, 2);

        addSpriteLoader(70513, 2972);
        addText(70515, "HP : ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70516, "42B ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70517, "Max Hit : ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70518, "821 ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70519, "Melee Def : ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70520, "12M ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70521, "Magic Def : ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70522, "260M ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70523, "Range Def : ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70524, "11M ", ColorConstants.GREEN, true, true, -1, 0);


        addSpriteLoader(70514, 2972);
        addText(70525, "Cost : ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70526, "20m Counter Tokens ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70527, "Spawns : ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70528, "12 ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70529, "Cap : ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70530, "25000", ColorConstants.GREEN, true, true, -1, 0);
        addText(70531, "Req : ", ColorConstants.GREEN, true, true, -1, 0);
        addText(70532, "50K Goku Kills ", ColorConstants.GREEN, true, true, -1, 0);

        addText(70533, "Create your own instance away from everybody.\\n" +
                "@red@Any abuse of this system will result \\n" +
                "@red@in immediate punishment!", ColorConstants.CYAN, true, true, -1, 0);

        addButtonWSpriteLoader(70534, 2991, "Change Difficulty");
        addButtonWSpriteLoader(70535, 3181, "Start Instance");
        addButtonWSpriteLoader(70542, 2876, "Restart");

        addText(70541, "START", ColorConstants.ORA, true, true, -1, 2);

        RSInterface scroll = RSInterface.addInterface(70600);

        scroll.width = 160;
        scroll.height = 140;
        scroll.scrollMax = 870;

        int npcList = 57 * 2;
        int y = 1;
        int x = 1;
        int c = 0;
        for (int i = 0; i < npcList; i+=2) {
            addSpriteLoader(70601 + i, 1539);//1538
            addText(70602 + i, "b", tda, 1, ClientConstants.BURGUNDY, false, false, ClientConstants.WHITE, "Select", 150);
        }

        scroll.totalChildren(npcList);

        for (int i = 0; i < npcList; i+=2) {
            scroll.child(i, 70601 + i, 2, y);
            scroll.child(i + 1, 70602 + i , 20, y);
            y += 15;
        }

        RSInterface items = addTabInterface(70800);
        items.totalChildren(60);
        items.height = 62;
        items.width = 160;
        items.scrollMax = 300;

        y = 2;
        int id = 70801;

        for (int z = 0; z < 15; z++) {
            for (int i = 0; i < 4; i++) {
                dropGroup(id, 1, 1, 1, 1);
                items.child(c++, id++, x, y);
                x += 36;
            }
            x = 0;
            y += 35;
        }

        main.totalChildren(43);
        main.child(0, 70501, 5, 10);
        main.child(1, 70502, 250, 19);
        main.child(2, 70503, 455, 16);
        main.child(3, 70504, 455, 16);

        main.child(4, 70506, 309, 46);
        main.child(5, 70507, 340, 46);
        main.child(6, 70508, 371, 46);
        main.child(7, 70509, 402, 46);
        main.child(8, 70510, 433, 46);

        main.child(9, 70600, 311, 74);

        main.child(10, 70511, 22, 156);
        main.child(11, 70512, 87, 60);

        main.child(12, 70513, 157, 48);
        main.child(13, 70514, 157, 178);

        main.child(14, 70515, 173, 52);
        main.child(15, 70516, 265, 52);
        main.child(16, 70517, 183, 70);
        main.child(17, 70518, 265, 70);
        main.child(18, 70519, 189, 88);
        main.child(19, 70520, 265, 88);
        main.child(20, 70521, 189, 106);
        main.child(21, 70522, 265, 106);
        main.child(22, 70523, 190, 124);
        main.child(23, 70524, 265, 124);

        main.child(24, 70525, 176, 180);
        main.child(25, 70526, 249, 180);
        main.child(26, 70527, 184, 205);
        main.child(27, 70528, 265, 205);
        main.child(28, 70529, 175, 230);
        main.child(29, 70530, 265, 230);
        main.child(30, 70531, 175, 255);
        main.child(31, 70532, 265, 255);

        main.child(32, 70800, 311, 219);

        main.child(33, 70533, 150, 275);

        main.child(34, 70534, 315, 291);
        main.child(35, 70535, 405, 288);

        main.child(36, 70536, 318, 51);
        main.child(37, 70537, 349, 51);
        main.child(38, 70538, 380, 51);
        main.child(39, 70539, 411, 51);
        main.child(40, 70540, 442, 51);
        main.child(41, 70541, 442, 293);
        main.child(42, 70542, 370, 288);

    }
}
