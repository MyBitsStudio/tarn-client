package org.necrotic.client.graphics.rsinterface;

import org.necrotic.client.RSInterface;

import static org.necrotic.client.graphics.rsinterface.CustomInterfaces.tda;

public class Achievements extends RSInterface {

    public static void build() {
        achievement();
    }

    private static void achievement() {
        RSInterface rsi = addInterface(165001);
        rsi.totalChildren(29);

        addSpriteLoader(165002, 3407);
        rsi.child(0, 165002, 2, 15);

        addText(165003, "Achievement Book", 0xff8624, true, true, -1, 2);
        rsi.child(1, 165003, 260, 25);

        hoverButton(165004, 714, 715, "Close");
        rsi.child(2, 165004, 486, 25);

        addHoverableConfigSprite(165005, 3420, 3421, true, "Select Beginner", 0, 3125);
        rsi.child(3, 165005, 13, 62);

        addHoverableConfigSprite(165006, 3417, 3418, true, "Select Easy", 1, 3125);
        rsi.child(4, 165006, 95, 62);

        addHoverableConfigSprite(165007, 3409, 3408, true, "Select Medium", 2, 3125);
        rsi.child(5, 165007, 177, 62);

        addHoverableConfigSprite(165008, 3414, 3415, true, "Select Hard", 3, 3125);
        rsi.child(6, 165008, 259, 62);

        addHoverableConfigSprite(165009, 3411, 3412, true, "Select Elite", 4, 3125);
        rsi.child(7, 165009, 341, 62);

        addSprite(165010, 3442);
        rsi.child(8, 165010, 13, 54);
        rsi.child(9, 165010, 95, 54);
        rsi.child(10, 165010, 177, 54);
        rsi.child(11, 165010, 259, 54);
        rsi.child(12, 165010, 341, 54);

        addProgressBar(165011, 78, 7, 0, 0x37b514, 0x000000);
        rsi.child(13, 165011, 13, 54);

        addProgressBar(165012, 78, 7, 15, 0x37b514, 0x000000);
        rsi.child(14, 165012, 95, 54);

        addProgressBar(165013, 78, 7, 30, 0x37b514, 0x000000);
        rsi.child(15, 165013, 177, 54);

        addProgressBar(165014, 78, 7, 45, 0x37b514, 0x000000);
        rsi.child(16, 165014, 259, 54);

        addProgressBar(165015, 78, 7, 60, 0x37b514, 0x000000);
        rsi.child(17, 165015, 341, 54);

        addText(165016, "Beginner", 0xff8624, true, true, -1, 0);
        rsi.child(18, 165017, 56, 66);
        addText(165017, "Easy", 0xff8624, true, true, -1, 0);
        rsi.child(19, 165017, 130, 66);
        addText(165018, "Medium", 0xff8624, true, true, -1, 0);
        rsi.child(20, 165018, 218, 66);
        addText(165019, "Hard", 0xff8624, true, true, -1, 0);
        rsi.child(21, 165019, 294, 66);
        addText(165020, "Elite", 0xff8624, true, true, -1, 0);
        rsi.child(22, 165020, 376, 66);

        addClickableText(165021, "Search..", "Search", tda, 1, 0xfeb73e, true, true, 110);
        rsi.child(23, 165021, 3, 89);

        addSprite(165022, 3435);
        rsi.child(24, 165022, 427, 61);

        addText(165023, ":", 0x9d9d9d, false, true, -1, 0);
        rsi.child(25, 165023, 442, 61);

        addText(165024, "500", 0x9d9d9d, true, true, -1, 0);
        rsi.child(26, 165024, 476, 63);

        addProgressBar(165025, 3438, 100, ProgressBarType.HORIZONTAL_LEFT_RIGHT);
        rsi.child(27, 165025, 123, 89);

        addText(165026, "4/10 Complete", 0xffffff, true, true, -1, 1);
        rsi.child(28, 165026, 310, 95);

    }
}
