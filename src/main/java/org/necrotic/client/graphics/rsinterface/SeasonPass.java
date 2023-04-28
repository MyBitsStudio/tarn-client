package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;

public class SeasonPass extends RSInterface {

    public static void build() {
        RSInterface rsi = addInterface(49450);

        addSpriteLoader(49451, 3331);

        addText(49452, "Season Pass", ColorConstants.ORANGE, true, true, -1, 2);

        addCloseButtonSmall(49453,49454,49455);

        addHoverButtonWSpriteLoader(49456, 3336, 16, 140, "Next", -1, 49457, 1);
        addHoveredImageWSpriteLoader(49457, 3337, 16, 140, 49458);

        addHoverButtonWSpriteLoader(49459, 3332, 16, 140, "Previous", -1, 49460, 1);
        addHoveredImageWSpriteLoader(49460, 3333, 16, 140, 49461);

        addHoverButtonWSpriteLoader(49462, 3334, 87, 25, "Buy Pass", -1, 49463, 1);
        addHoveredImageWSpriteLoader(49463, 3335, 87, 25, 49464);

        addHoverButtonWSpriteLoader(49465, 3330, 87, 25, "Claim", -1, 49466, 1);
        addHoveredImageWSpriteLoader(49466, 3339, 87, 25, 49467);

        addRectangle(49468, 256, 0x9d9514, false, 49, 45);

        addToItemGroup(49469, 7,2, 31, 25, false, new String[] {null});

        addHDSprite(49470, 3338,3338);

        addProgressBar(49471, 484, 40, 0, 0x23440f, 0x3b1d16);

        addHDSprite(49472, 3341, 3341);
        addHDSprite(49473, 3341, 3341);
        addHDSprite(49474, 3341, 3341);
        addHDSprite(49475, 3341, 3341);
        addHDSprite(49476, 3341, 3341);
        addHDSprite(49477, 3341, 3341);
        addHDSprite(49478, 3341, 3341);

        addText(49479, "0/10000", 0x66ff66, true, true, -1, 2);

        addText(49480, "Total Experience Contributed", ColorConstants.ORANGE, true, true, -1, 0);

        addSpriteLoader(49481, 3340);

        addText(49482, "Status", ColorConstants.ORANGE, true, true, -1, 0);
        addText(49483, "Top Contributor", ColorConstants.ORANGE, true, true, -1, 0);
        addText(49484, "Current Tier", ColorConstants.ORANGE, true, true, -1, 0);
        addText(49485, "Tiers Unlocked", ColorConstants.ORANGE, true, true, -1, 0);

        addText(49486, "Free", 0xcc553d, true, true, -1, 0);
        addText(49487, "John", 0xcc553d, true, true, -1, 0);
        addText(49488, "1", 0xcc553d, true, true, -1, 0);
        addText(49489, "0", 0xcc553d, true, true, -1, 0);
        addText(49490, "0", ColorConstants.WHITE, true, true, -1, 0);
        addText(49491, "Purchase", ColorConstants.ORANGE, true, true, -1, 0);
        addText(49492, "Claim", 0x32cd32, true, true, -1, 0);

        addText(49493, "Level 1", ColorConstants.ORANGE, true, true, -1, 0);
        addText(49494, "Level 2", ColorConstants.ORANGE, true, true, -1, 0);
        addText(49495, "Level 3", ColorConstants.ORANGE, true, true, -1, 0);
        addText(49496, "Level 4", ColorConstants.ORANGE, true, true, -1, 0);
        addText(49497, "Level 5", ColorConstants.ORANGE, true, true, -1, 0);
        addText(49498, "Level 6", ColorConstants.ORANGE, true, true, -1, 0);
        addText(49499, "Level 7", ColorConstants.ORANGE, true, true, -1, 0);
        addText(49500, "Resets: 00/00/00", ColorConstants.ORANGE, false, true, -1, 0);

        addHDSprite(49501, 3341, 3341);
        addHDSprite(49502, 3341, 3341);
        addHDSprite(49503, 3341, 3341);
        addHDSprite(49504, 3341, 3341);
        addHDSprite(49505, 3341, 3341);
        addHDSprite(49506, 3341, 3341);
        addHDSprite(49507, 3341, 3341);

        rsi.totalChildren(64);
        rsi.child(0, 49451, 5, 5);
        rsi.child(1, 49452, 250, 15);
        rsi.child(2, 49453, 482, 15);
        rsi.child(3, 49454, 482, 15);
        rsi.child(4, 49456, 483, 131);
        rsi.child(5, 49457, 483, 131);
        rsi.child(6, 49459, 12, 131);
        rsi.child(7, 49460, 12, 131);
        rsi.child(8, 49462, 158, 91);
        rsi.child(9, 49463, 158, 91);
        rsi.child(10, 49465, 266, 91);
        rsi.child(11, 49466, 266, 91);
        for(int i = 0; i < 7; i++) {
            rsi.child(12+i, 49468, 42 + (i*63), 215);
            rsi.child(20+i, 49470, 41 + (i*63), 219);
            rsi.child(28 + i, 49472 + i, 31 + (i * 63), 144);
            rsi.child(49 + i, 49493 + i, 65 + (i * 63), 140);
            rsi.child(57 + i, 49501 + i, 31 + (i * 63), 200);
        }
        rsi.child(19, 49469, 50, 166);
        rsi.child(27, 49471, 12, 271);
        rsi.child(35, 49479, 250, 285);
        rsi.child(36, 49480, 250, 50);
        rsi.child(37, 49481, 163, 49);
        rsi.child(38, 49482, 50, 50);
        rsi.child(39, 49483, 445, 50);
        rsi.child(40, 49484, 50, 95);
        rsi.child(41, 49485, 445, 95);
        rsi.child(42, 49486, 50, 65);
        rsi.child(43, 49487, 445, 65);
        rsi.child(44, 49488, 50, 110);
        rsi.child(45, 49489, 445, 110);
        rsi.child(46, 49490, 250, 65);
        rsi.child(47, 49491, 205, 98);
        rsi.child(48, 49492, 310, 98);
        rsi.child(56, 49500, 30, 18);
    }
}
