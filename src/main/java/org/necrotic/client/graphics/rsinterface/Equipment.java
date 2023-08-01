package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.Client;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class Equipment extends RSInterface {

    public static void equipSlot(){
        RSInterface rsi = addInterface(162750);

        addSpriteLoader(162751, 2126);

        rsi.totalChildren(2);
        rsi.child(0, 162751, 120, 45);
        rsi.child(1, 162500, 150, 75);

    }

    public static void wholePerks() {
        RSInterface rsi = addInterface(162700);

        addSpriteLoader(162701, 3036);
        addText(162702, "Perks", ColorConstants.PURPLE, true, true, -1, 2);
        addCloseButton(162703, 162704, 162705);

        addSpriteLoader(162706, 1563);
        addText(162707, "Slot : WEAPON", ColorConstants.SNOW_WHITE, true, true, -1, 2);


        rsi.totalChildren(6);
        rsi.child(0, 162701, 90, 15);
        rsi.child(1, 162702, 270, 24);
        rsi.child(2, 162703, 427, 22);

        rsi.child(3, 162550, 120, 96);

        rsi.child(4, 162706, 250, 65);
        rsi.child(5, 162707, 342, 72);

    }

    public static void onePerk() {
        RSInterface rsi = addInterface(162650);

        addSpriteLoader(162651, 3161);
        addText(162652, "Slot", ColorConstants.PURPLE, true, true, -1, 2);
        addCloseButton(162653, 162654, 162655);

        addText(162656, "NONE", ColorConstants.SNOW_WHITE, true, true, -1, 2);
        addSpriteLoader(162657, 1601);
        addText(162658, "BONUS : 0%", ColorConstants.SNOW_WHITE, true, true, -1, 2);
        addText(162659, "RARITY : COMMON", ColorConstants.SNOW_WHITE, true, true, -1, 2);

        addButtonWSpriteLoader(162660, 1584, "Remove");
        addText(162661, "Remove", ColorConstants.SNOW_WHITE, true, true, -1, 2);

        rsi.totalChildren(9);
        rsi.child(0, 162651, 150, 15);
        rsi.child(1, 162652, 250, 26);
        rsi.child(2, 162653, 315, 21);

        rsi.child(3, 162656, 250, 60);
        rsi.child(4, 162657, 233, 90);
        rsi.child(5, 162658, 250, 135);
        rsi.child(6, 162659, 250, 155);

        rsi.child(7, 162660, 210, 220);
        rsi.child(8, 162661, 249, 223);

    }

    public static void equipmentNon(){
        RSInterface rsi = addInterface(162550);
        addButtonWSpriteLoader(162551, 3327, "Halo");
        addButtonWSpriteLoader(162552, 3312, "Helmet");
        addButtonWSpriteLoader(162553, 3327, "Gemstone");

        addButtonWSpriteLoader(162554, 3313, "Cape");
        addButtonWSpriteLoader(162555, 3314, "Amulet");
        addButtonWSpriteLoader(162556, 3315, "Quiver");

        addButtonWSpriteLoader(162557, 3316, "Weapon");
        addButtonWSpriteLoader(162558, 3317, "Torso");
        addButtonWSpriteLoader(162559, 3318, "Shield");

        addButtonWSpriteLoader(162560, 3327, "Enhancement");
        addButtonWSpriteLoader(162561, 3319, "Legs");
        addButtonWSpriteLoader(162562, 3327, "Aura");

        addButtonWSpriteLoader(162563, 3320, "Gloves");
        addButtonWSpriteLoader(162564, 3321, "Boots");
        addButtonWSpriteLoader(162565, 3322, "Ring");

        addToItemGroup(162566, 3,5, 2, 1, true, new String[] {"Choose", null, null, null, null});

        rsi.totalChildren(15);

        rsi.child(0, 162551, 0, 0);
        rsi.child(1, 162552, 35, 0);
        rsi.child(2, 162553, 70, 0);
        rsi.child(3, 162554, 0, 35);
        rsi.child(4, 162555, 35, 35);
        rsi.child(5, 162556, 70, 35);
        rsi.child(6, 162557, 0, 70);
        rsi.child(7, 162558, 35, 70);
        rsi.child(8, 162559, 70, 70);
        rsi.child(9, 162560, 0, 105);
        rsi.child(10, 162561, 35, 105);
        rsi.child(11, 162562, 70, 105);
        rsi.child(12, 162563, 0, 140);
        rsi.child(13, 162564, 35, 140);
        rsi.child(14, 162565, 70, 140);
        rsi.child(15, 162566, 0, 0);
    }

    public static void equipment(){
        RSInterface rsi = addInterface(162500);
        addButtonWSpriteLoader(162501, 3327, "Halo");
        addButtonWSpriteLoader(162502, 3312, "Helmet");
        addButtonWSpriteLoader(162503, 3327, "Gemstone");

        addButtonWSpriteLoader(162504, 3313, "Cape");
        addButtonWSpriteLoader(162505, 3314, "Amulet");
        addButtonWSpriteLoader(162506, 3315, "Quiver");

        addButtonWSpriteLoader(162507, 3316, "Weapon");
        addButtonWSpriteLoader(162508, 3317, "Torso");
        addButtonWSpriteLoader(162509, 3318, "Shield");

        addButtonWSpriteLoader(162510, 3327, "Enhancement");
        addButtonWSpriteLoader(162511, 3319, "Legs");
        addButtonWSpriteLoader(162512, 3327, "Aura");

        addButtonWSpriteLoader(162513, 3320, "Gloves");
        addButtonWSpriteLoader(162514, 3321, "Boots");
        addButtonWSpriteLoader(162515, 3322, "Ring");

        addToItemGroup(162516, 3,5, 2, 1, true, new String[] {"Remove", null, "Perks", "Operate", null});

        rsi.totalChildren(16);

        rsi.child(0, 162501, 0, 0);
        rsi.child(1, 162502, 35, 0);
        rsi.child(2, 162503, 70, 0);
        rsi.child(3, 162504, 0, 35);
        rsi.child(4, 162505, 35, 35);
        rsi.child(5, 162506, 70, 35);
        rsi.child(6, 162507, 0, 70);
        rsi.child(7, 162508, 35, 70);
        rsi.child(8, 162509, 70, 70);
        rsi.child(9, 162510, 0, 105);
        rsi.child(10, 162511, 35, 105);
        rsi.child(11, 162512, 70, 105);
        rsi.child(12, 162513, 0, 140);
        rsi.child(13, 162514, 35, 140);
        rsi.child(14, 162515, 70, 140);
        rsi.child(15, 162516, 0, 0);
    }

    public static void build(TextDrawingArea[] tda) {
        RSInterface rsi = addInterface(162600);

        addSpriteLoader(162601, 3058);
        addSpriteLoaderWTooltip(162602, 3041, "Melee Max");
        addSpriteLoaderWTooltip(162603, 3041, "Magic Max");
        addSpriteLoaderWTooltip(162604, 3041, "Range Max");
        addSpriteLoaderWTooltip(162605, 3041, "Drop Rate");
        addSpriteLoaderWTooltip(162606, 3041, "Double Drop");
        addSpriteLoaderWTooltip(162607, 3041, "Set Bonus");
        addSpriteLoaderWTooltip(162608, 3041, "");
        addSpriteLoaderWTooltip(162609, 3041, "");

        addButtonWSpriteLoader(162610, 1484, "Equipment Stats");
        addButtonWSpriteLoader(162611, 1484, "Enhancement");
        addButtonWSpriteLoader(162612, 1484, "Switch");
        addButtonWSpriteLoader(162613, 1484, "Perks");

        addSpriteLoader(162614, 1521);
        addSpriteLoader(162615, 1523);
        addSpriteLoader(162616, 1524);
        addSpriteLoader(162617, 1525);

        rsi.totalChildren(18);

        rsi.child(0, 162500, 45, 35);

        rsi.child(1, 162601, 17, 8);
        rsi.child(2, 162602, 24, 11);
        rsi.child(3, 162603, 42, 11);
        rsi.child(4, 162604, 60, 11);
        rsi.child(5, 162605, 78, 11);
        rsi.child(6, 162606, 96, 11);
        rsi.child(7, 162607, 114, 11);
        rsi.child(8, 162608, 132, 11);
        rsi.child(9, 162609, 150, 11);

        rsi.child(10, 162610, 20, 215);
        rsi.child(11, 162611, 60, 215);
        rsi.child(12, 162612, 100, 215);
        rsi.child(13, 162613, 140, 215);

        rsi.child(14, 162614, 28, 222);
        rsi.child(15, 162615, 68, 222);
        rsi.child(16, 162616, 108, 222);
        rsi.child(17, 162617, 148, 222);
    }

    private static void reset(RSInterface rsInt3, int slot){
        switch(slot){
            case 0:
                rsInt3.enabledSprite = Client.spritesMap.get(3327);
                rsInt3.disabledSprite = Client.spritesMap.get(3327);
                rsInt3.tooltip = "Halo";
                break;
            case 1:
                rsInt3.enabledSprite = Client.spritesMap.get(3312);
                rsInt3.disabledSprite = Client.spritesMap.get(3312);
                rsInt3.tooltip = "Helmet";
                break;
            case 2:
                rsInt3.enabledSprite = Client.spritesMap.get(3327);
                rsInt3.disabledSprite = Client.spritesMap.get(3327);
                rsInt3.tooltip = "Gemstone";
                break;
            case 3:
                rsInt3.enabledSprite = Client.spritesMap.get(3313);
                rsInt3.disabledSprite = Client.spritesMap.get(3313);
                rsInt3.tooltip = "Cape";
                break;
            case 4:
                rsInt3.enabledSprite = Client.spritesMap.get(3314);
                rsInt3.disabledSprite = Client.spritesMap.get(3314);
                rsInt3.tooltip = "Amulet";
                break;
            case 5:
                rsInt3.enabledSprite = Client.spritesMap.get(3315);
                rsInt3.disabledSprite = Client.spritesMap.get(3315);
                rsInt3.tooltip = "Quiver";
                break;
            case 6:
                rsInt3.enabledSprite = Client.spritesMap.get(3316);
                rsInt3.disabledSprite = Client.spritesMap.get(3316);
                rsInt3.tooltip = "Weapon";
                break;
            case 7:
                rsInt3.enabledSprite = Client.spritesMap.get(3317);
                rsInt3.disabledSprite = Client.spritesMap.get(3317);
                rsInt3.tooltip = "Torso";
                break;
            case 8:
                rsInt3.enabledSprite = Client.spritesMap.get(3318);
                rsInt3.disabledSprite = Client.spritesMap.get(3318);
                rsInt3.tooltip = "Shield";
                break;
            case 9:
                rsInt3.enabledSprite = Client.spritesMap.get(3327);
                rsInt3.disabledSprite = Client.spritesMap.get(3327);
                rsInt3.tooltip = "Enhancement";
                break;
            case 10:
                rsInt3.enabledSprite = Client.spritesMap.get(3319);
                rsInt3.disabledSprite = Client.spritesMap.get(3319);
                rsInt3.tooltip = "Legs";
                break;
            case 11:
                rsInt3.enabledSprite = Client.spritesMap.get(3327);
                rsInt3.disabledSprite = Client.spritesMap.get(3327);
                rsInt3.tooltip = "Aura";
                break;
            case 12:
                rsInt3.enabledSprite = Client.spritesMap.get(3320);
                rsInt3.disabledSprite = Client.spritesMap.get(3320);
                rsInt3.tooltip = "Gloves";
                break;
            case 13:
                rsInt3.enabledSprite = Client.spritesMap.get(3321);
                rsInt3.disabledSprite = Client.spritesMap.get(3321);
                rsInt3.tooltip = "Boots";
                break;
            case 14:
                rsInt3.enabledSprite = Client.spritesMap.get(3322);
                rsInt3.disabledSprite = Client.spritesMap.get(3322);
                rsInt3.tooltip = "Ring";
                break;
        }
    }

    public static void updateEquipment(int... args){
        RSInterface rsInt2 = RSInterface.interfaceCache[162516];
        int slot = 0;
        switch(args[0]){
            case 0: slot = 1; break;
            case 1: slot = 3; break;
            case 2: slot = 4; break;
            case 3: slot = 6; break;
            case 4: slot = 7; break;
            case 5: slot = 8; break;
            case 6: slot = 9; break;
            case 7: slot = 10; break;
            case 8: slot = 11; break;
            case 9: slot = 12; break;
            case 10: slot = 13; break;
            case 12: slot = 14; break;
            case 13: slot = 5; break;
            case 14: slot = 2; break;
        }
        int id = 162501 + slot;
        RSInterface rsInt3 = RSInterface.interfaceCache[id];
        if(args[1] >= 2){
            rsInt3.enabledSprite = Client.spritesMap.get(3327);
            rsInt3.disabledSprite = Client.spritesMap.get(3327);
            rsInt3.tooltip = null;
        } else {
            reset(rsInt3, slot);
        }
        switch(slot){
            case 6:
                rsInt2.invSpritePadX = 2;
                rsInt2.invSpritePadY = 3;
                break;
            case 8:
                rsInt2.invSpritePadX = 4;
                rsInt2.invSpritePadY = 2;
                break;
            case 14:
                rsInt2.invSpritePadX = 5;
                rsInt2.invSpritePadY = 4;
                break;
        }
        rsInt2.inv[slot] = args[1];
        rsInt2.invStackSizes[slot] = args[2];
        rsInt2.invGlow[slot] = args[3];
        rsInt2.bonus[slot] = args[4];
    }
}
