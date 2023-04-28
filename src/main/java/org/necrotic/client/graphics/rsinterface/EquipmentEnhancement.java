package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;

public class EquipmentEnhancement extends RSInterface {

    public static void build() {
        RSInterface main = addInterface(49400);

        addSpriteLoader(49401, 3324);

        addText(49402, "Equipment Enhancement", ColorConstants.ORANGE, true, true, -1, 2);

        addCloseButton(49403, 49404, 49405);

        addText(49406, "Select equipment slot to", 0xc0c0c0, true, true, -1, 0);
        addText(49407, "enhance.", 0x9370db, true, true, -1, 0);
        addText(49408, "Currently enhancing", 0x9370db, true, true, -1, 0);
        addText(49409, "slotName.", 0xc0c0c0, true, true, -1, 0);

        addButtonWSpriteLoader(49410, 3312, "Select Helmet");
        addButtonWSpriteLoader(49411, 3313, "Select Cape");
        addButtonWSpriteLoader(49412, 3314, "Select Amulet");
        addButtonWSpriteLoader(49413, 3317, "Select Torso");
        addButtonWSpriteLoader(49414, 3319, "Select Legs");
        addButtonWSpriteLoader(49415, 3321, "Select Boots");
        addButtonWSpriteLoader(49416, 3318, "Select Shield");
        addButtonWSpriteLoader(49417, 3316, "Select Weapon");
        addButtonWSpriteLoader(49418, 3315, "Select Quiver");
        addButtonWSpriteLoader(49419, 3327, "Select Halo");
        addButtonWSpriteLoader(49420, 3320, "Select Gloves");
        addButtonWSpriteLoader(49421, 3322, "Select Ring");
        addButtonWSpriteLoader(49422, 3327, "Select Enhancement");
        addButtonWSpriteLoader(49423, 3327, "Select Aura");
        addButtonWSpriteLoader(49424, 3327, "Select Gemstone");

        addText(49426, "You can enhance an equipment \\n slot up to +20. You will lose \\n materials and 1 level upon @red@enhance \\n @red@failure", 0xc0c0c0, true, true, -1, 0);
        addText(49427, "Success rate: 20%", 0xadff2f, true, true, -1, 0);

        addText(49428, "Stats: ", ColorConstants.RS_ORANGE, true, true, -1, 0);
        addText(49429, "DR: ", ColorConstants.RS_ORANGE, true, true, -1, 0);
        addText(49430, "Cash: ", ColorConstants.RS_ORANGE, true, true, -1, 0);

        addText(49431, "0.0", 0xc0c0c0, true, true, -1, 0);
        addText(49432, "0.0", 0xc0c0c0, true, true, -1, 0);
        addText(49433, "0.0", 0xc0c0c0, true, true, -1, 0);

        addText(49434, "1.0", 0xadff2f, true, true, -1, 0);
        addText(49435, "1.0", 0xadff2f, true, true, -1, 0);
        addText(49436, "1.0", 0xadff2f, true, true, -1, 0);

        addSpriteLoader(49437, 3329);
        addSpriteLoader(49438, 3329);
        addSpriteLoader(49439, 3329);
        addSpriteLoader(49440, 3327);

        addToItemGroup(49441, 3,1, 18, 1, false, new String[] {null});

        addHoverButtonWSpriteLoader(49442, 3325, 147, 32, "Upgrade", -1, 49443, 1);
        addHoveredImageWSpriteLoader(49443, 3326, 147, 32, 49444);

        addText(49445, "Upgrade", 0xc0c0c0, true, true, -1, 1);

        addSpriteLoader(49446, 3300);
        addSpriteLoader(49447, 3301);
        addSpriteLoader(49448, 3302);

        main.totalChildren(46);
        main.child(0, 49401, 85, 20);
        main.child(1, 49402, 255, 30);
        main.child(2, 49403, 395, 27);
        main.child(3, 49404, 395, 27);
        main.child(4, 49406, 160, 60);
        main.child(5, 49407, 160, 75);
        main.child(6, 49408, 340, 60);
        main.child(7, 49409, 340, 75);
        main.child(8, 49410, 140, 90);
        main.child(9, 49411, 180, 90);
        main.child(10, 49412, 100, 90);
        main.child(11, 49413, 140, 130);
        main.child(12, 49414, 140, 170);
        main.child(13, 49415, 140, 210);
        main.child(14, 49416, 180, 130);
        main.child(15, 49417, 100, 130);
        main.child(16, 49418, 180, 210);
        main.child(17, 49419, 100, 210);
        main.child(18, 49420, 100, 170);
        main.child(19, 49421, 180, 170);
        main.child(20, 49422, 220, 90);
        main.child(21, 49423, 220, 130);
        main.child(22, 49424, 220, 170);
        main.child(23, 49426, 179, 252);
        main.child(24, 49427, 338, 144);
        main.child(25, 49428, 290, 205);
        main.child(26, 49429, 290, 165);
        main.child(27, 49430, 290, 185);
        main.child(28, 49431, 330, 165);
        main.child(29, 49432, 330, 185);
        main.child(30, 49433, 330, 205);
        main.child(31, 49434, 385, 205);
        main.child(32, 49435, 385, 165);
        main.child(33, 49436, 385, 185);
        main.child(34, 49437, 357, 205);
        main.child(35, 49438, 357, 185);
        main.child(36, 49439, 357, 165);
        main.child(37, 49440, 322, 93);
        main.child(38, 49441, 275, 234);
        main.child(39, 49442, 269, 278);
        main.child(40, 49443, 269, 278);
        main.child(41, 49445, 341, 281);
        main.child(42, 49446, 216, 88);
        main.child(43, 49446, 216, 128);
        main.child(44, 49447, 216, 166);
        main.child(45, 49448, 95, 208);

    }

}
