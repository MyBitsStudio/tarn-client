package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class TrackInterface extends RSInterface {

    public static void build(TextDrawingArea[] tda){
        RSInterface rsi = addInterface(161000);
        rsi.totalChildren(62);

        addSpriteLoader(161001, 1464);
        addText(161002, "Tracks", ColorConstants.AQUA, true, true, -1, 2);
        addCloseButton(161003, 161004, 161005);

        addButtonWSpriteLoader(161006, 1547, "Easy");
        addButtonWSpriteLoader(161007, 1547, "Medium");
        addButtonWSpriteLoader(161008, 1547, "Hard");
        addButtonWSpriteLoader(161009, 1547, "Extreme");
        addButtonWSpriteLoader(161010, 1547, "Special");

        addButtonWSpriteLoader(161011, 1547, "Monsters");
        addButtonWSpriteLoader(161012, 1547, "Skilling");
        addButtonWSpriteLoader(161013, 1547, "Bosses");
        addButtonWSpriteLoader(161014, 1547, "Minigames");
        addButtonWSpriteLoader(161015, 1547, "Misc");
        addButtonWSpriteLoader(161016, 1547, "");

        addButtonWSpriteLoader(161017, 1547, "Task Info");
        addButtonWSpriteLoader(161018, 1547, "Task Reward");
        addButtonWSpriteLoader(161019, 1547, "");
        addButtonWSpriteLoader(161020, 1547, "");

        addButtonWSpriteLoader(161021, 1547, "Track Info");
        addButtonWSpriteLoader(161022, 1547, "Track Rewards");
        addButtonWSpriteLoader(161023, 1547, "");
        addButtonWSpriteLoader(161024, 1547, "");

        addSpriteLoader(161025, 1552);
        addSpriteLoader(161026, 1551);
        addSpriteLoader(161027, 1549);
        addSpriteLoader(161028, 1550);
        addSpriteLoader(161029, 1558);

        addSpriteLoader(161030, 1430);
        addSpriteLoader(161031, 1431);
        addSpriteLoader(161032, 1432);
        addSpriteLoader(161033, 1433);
        addSpriteLoader(161034, 1434);
        addSpriteLoader(161035, 1570);

        addSpriteLoader(161036, 1566);
        addSpriteLoader(161037, 2177);
        addSpriteLoader(161038, 2180);
        addSpriteLoader(161039, 2759);

        addSpriteLoader(161040, 2180);
        addSpriteLoader(161041, 2177);
        addSpriteLoader(161042, 2759);
        addSpriteLoader(161043, 2759);

        addText(161044, "Info Panel : ", ColorConstants.GREEN, true, true, -1, 1);
        for(int i = 0; i < 6; i++) {
            addText(161045 + i, "b", tda, 1, ColorConstants.SNOW_WHITE, false, false, ColorConstants.WHITE, "Select", 150);
        }

        addText(161051, "Track Info", ColorConstants.GREEN, true, true, -1, 0);

        addText(161052, "XP : 78/100", ColorConstants.GREEN, true, true, -1, 0);
        addText(161053, "Level : 48", ColorConstants.GREEN, true, true, -1, 0);
        addText(161054, "Max Level : 122", ColorConstants.GREEN, true, true, -1, 0);
        addText(161055, "Difficulty : Easy", ColorConstants.SKY_BLUE, true, true, -1, 0);
        addText(161056, "Tasks Left : 32", ColorConstants.SKY_BLUE, true, true, -1, 0);
        addText(161057, "Tasks Completed : 12", ColorConstants.SKY_BLUE, true, true, -1, 0);

        addProgressBar(161058, 3392, 100, ProgressBarType.HORIZONTAL_LEFT_RIGHT);

        addButtonWSpriteLoader(161059, 3296, "Claim");
        addText(161060, "CLAIM", ColorConstants.ORA, true, true, -1, 2);

        RSInterface items = addTabInterface(161300);
        items.totalChildren(45);
        items.height = 86;
        items.width = 108;
        items.scrollMax = 400;

        int x = 0, c = 0, yz = 2, id = 161301;

        for (int z = 0; z < 15; z++) {
            for (int i = 0; i < 3; i++) {
                dropGroup(id, 1, 1, 1, 1);
                items.child(c++, id++, x, yz);
                x += 36;
            }
            x = 0;
            yz += 35;
        }

        RSInterface items1 = addTabInterface(161400);
        items1.totalChildren(15);
        items1.height = 42;
        items1.width = 112;
        items1.scrollMax = 400;

        int x1 = 0, c1 = 0, yz1 = 2, id1 = 161401;

        for (int z = 0; z < 5; z++) {
            for (int i = 0; i < 3; i++) {
                dropGroup(id1, 1, 1, 1, 1);
                items1.child(c1++, id1++, x1, yz1);
                x1 += 36;
            }
            x1 = 0;
            yz1 += 35;
        }


        RSInterface scroll = RSInterface.addInterface(161100);

        scroll.width = 136;
        scroll.height = 218;
        scroll.scrollMax = 820;

        int npcList = 50;
        int y = 1;
        for (int i = 0; i < npcList; i++) {
            addText(161101 + i, "b", tda, 1, ClientConstants.BURGUNDY, false, false, ClientConstants.WHITE, "Select", 150);
        }
        scroll.totalChildren(npcList);

        for (int i = 0; i < npcList; i++) {
            scroll.child(i, 161101 + i , 3, y);
            y += 15;
        }

        RSInterface scroll2 = RSInterface.addInterface(161200);

        scroll2.width = 165;
        scroll2.height = 142;
        scroll2.scrollMax = 680;

        int npcLis2 = 50;
        int y2 = 1;
        for (int i = 0; i < npcLis2; i++) {
            addText(161201 + i, "b", tda, 1, ClientConstants.BURGUNDY, false, false, ClientConstants.WHITE, "Select", 150);
        }
        scroll2.totalChildren(npcLis2);

        for (int i = 0; i < npcLis2; i++) {
            scroll2.child(i, 161201 + i , 3, y2);
            y2 += 15;
        }

        rsi.child(0, 161001, 8, 8);
        rsi.child(1, 161002, 256, 19);
        rsi.child(2, 161003, 472, 19);

        rsi.child(3, 161006, 19, 64);
        rsi.child(4, 161007, 49, 64);
        rsi.child(5, 161008, 79, 64);
        rsi.child(6, 161009, 109, 64);
        rsi.child(7, 161010, 139, 64);

        rsi.child(8, 161011, 173, 65);
        rsi.child(9, 161012, 203, 65);
        rsi.child(10, 161013, 233, 65);
        rsi.child(11, 161014, 263, 65);
        rsi.child(12, 161015, 293, 65);
        rsi.child(13, 161016, 323, 65);

        rsi.child(14, 161017, 358, 65);
        rsi.child(15, 161018, 388, 65);
        rsi.child(16, 161019, 418, 65);
        rsi.child(17, 161020, 448, 65);

        rsi.child(18, 161021, 173, 238);
        rsi.child(19, 161022, 203, 238);
        rsi.child(20, 161023, 233, 238);
        rsi.child(21, 161024, 263, 238);

        rsi.child(22, 161100, 19, 92);
        rsi.child(23, 161200, 173, 92);

        rsi.child(24, 161025, 27, 72);
        rsi.child(25, 161026, 57, 72);
        rsi.child(26, 161027, 87, 72);
        rsi.child(27, 161028, 117, 72);
        rsi.child(28, 161029, 147, 72);

        rsi.child(29, 161030, 181, 72);
        rsi.child(30, 161031, 211, 72);
        rsi.child(31, 161032, 241, 72);
        rsi.child(32, 161033, 271, 72);
        rsi.child(33, 161034, 301, 72);
        rsi.child(34, 161035, 331, 72);

        rsi.child(35, 161036, 366, 72);
        rsi.child(36, 161037, 392, 70);
        rsi.child(37, 161038, 422, 70);
        rsi.child(38, 161039, 452, 70);

        rsi.child(39, 161040, 179, 242);
        rsi.child(40, 161041, 209, 242);
        rsi.child(41, 161042, 239, 242);
        rsi.child(42, 161043, 269, 242);

        rsi.child(43, 161044, 412, 98);
        for(int i = 0; i < 6; i++) {
            rsi.child(44 + i, 161045 + i, 363, 113 + (i * 15));
        }

        rsi.child(50, 161300, 362, 114);

        rsi.child(51, 161051, 396, 242);
        rsi.child(52, 161052, 229, 267);
        rsi.child(53, 161053, 229, 282);
        rsi.child(54, 161054, 229, 297);
        rsi.child(55, 161055, 366, 267);
        rsi.child(56, 161056, 366, 282);
        rsi.child(57, 161057, 366, 297);

        rsi.child(58, 161058, 361, 215);

        rsi.child(59, 161400, 182, 267);

        rsi.child(60, 161059, 419, 255);
        rsi.child(61, 161060, 449, 258);
    }
}
