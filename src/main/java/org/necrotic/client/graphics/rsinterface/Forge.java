package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.Client;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.Sprite;

import java.util.HashMap;

import static org.necrotic.client.Client.intToKOrMil;

public class Forge extends RSInterface {

    public static Sprite boxSprite;
    public static Sprite lockSprite;
    public static boolean unbuyable;

    public static final HashMap<Integer, Integer> PRICES = new HashMap<>();

    static {
        PRICES.put(23226, 25);
        PRICES.put(23227, 35);
        PRICES.put(23228, 40);
        PRICES.put(23229, 50);
        PRICES.put(8100, 100);
        PRICES.put(8101, 100);
        PRICES.put(8102, 100);
        PRICES.put(8103, 100);
        PRICES.put(8104, 100);
        PRICES.put(8105, 125);
        PRICES.put(8106, 125);
        PRICES.put(8107, 125);
        PRICES.put(8108, 125);
        PRICES.put(8109, 125);
        PRICES.put(8110, 125);
        PRICES.put(24003, 400);
        PRICES.put(24004, 400);
        PRICES.put(24005, 400);
        PRICES.put(24006, 400);
        PRICES.put(24007, 400);
        PRICES.put(24008, 400);
        PRICES.put(24009, 400);
        PRICES.put(23127, 600);
        PRICES.put(23128, 600);
        PRICES.put(23129, 600);
        PRICES.put(23130, 600);
        PRICES.put(23131, 600);
        PRICES.put(22242, 800);
        PRICES.put(22244, 800);
        PRICES.put(22246, 800);
        PRICES.put(22250, 800);
        PRICES.put(22248, 800);
        PRICES.put(22252, 800);
        PRICES.put(24010, 400);
        PRICES.put(22254, 600);
        PRICES.put(4446, 20);
        PRICES.put(19886, 25);
        PRICES.put(18888, 80);
        PRICES.put(18823, 60);
        PRICES.put(17391, 40);
        PRICES.put(1857, 30);
        PRICES.put(21814, 3);
        PRICES.put(21815, 1);
        PRICES.put(9084, 15);
        PRICES.put(2380, 5);
        PRICES.put(741, 10);
        PRICES.put(23219, 30);
        PRICES.put(8788, 3);
        PRICES.put(21816, 10);
        PRICES.put(23178, 40);
        PRICES.put(22110, 60);
        PRICES.put(13650, 2);
        PRICES.put(742, 15);
        PRICES.put(4442, 100);
        PRICES.put(4440, 250);
        PRICES.put(743, 120);
        PRICES.put(13019, 500);
        PRICES.put(3686, 5000);
        PRICES.put(15003, 50);
        PRICES.put(15002, 250);
        PRICES.put(15004, 600);
        PRICES.put(20491, 1100);
        PRICES.put(20490, 1900);
    }

    public static void build() {
        RSInterface rsi = addInterface(49510);

        addSpriteLoader(49511, 3348);
        addText(49512, "The Forge", ColorConstants.RS_ORANGE, true, true, -1, 2);

        addCloseButtonSmall(49513,49514,49515);

        addSprite(49516, 3343);
        addButton(49517, 3344, "Shops");

        addText(49518, "Forge", 0xdba40b, false, true, -1, 0);
        addText(49519, "Shop", 0xffda72, false, true, -1, 0);

        addHoverButtonWSpriteLoader(49520, 3347, 91, 35, "Start", -1, 49521, 1);
        addHoveredImageWSpriteLoader(49521, 3346, 91, 35, 49522);

        addHoverButtonWSpriteLoader(49582, 2768, 65, 35, "Forge Inventory", -1, 49583, 1);

        addItemOnInterface(49523, 49510, new String[]{});
        RSInterface.interfaceCache[49523].inv[0] = 18654;
        RSInterface.interfaceCache[49523].invStackSizes[0] = 0;

        addText(49524, "Current tier:", 0xcc8700, false, true, -1, 0);
        addText(49525, "Fragments:", 0xcc8700, false, true, -1, 0);
        addText(49526, "0", 0xffcf70, false, true, -1, 0);
        addText(49527, "0", 0xffcf70, false, true, -1, 0);

        addText(49528, "Start", ColorConstants.RS_ORANGE, false, true, -1, 2);

        addProgressBar(49529, 3350, 100, ProgressBarType.VERTICAL_DOWN_UP);
        addSprite(49530, 3349);

        addText(49531, "Tier: 3", 0xdba40b, true, true, -1, 0);

        addText(49532, "5 F", ColorConstants.WHITE, false, true, -1, 0);
        addText(49533, "100 F", ColorConstants.WHITE, false, true, -1, 0);
        addText(49534, "300 F", ColorConstants.WHITE, false, true, -1, 0);
        addText(49535, "500 F", ColorConstants.WHITE, false, true, -1, 0);
        addText(49536, "750 F", ColorConstants.WHITE, false, true, -1, 0);
        addText(49537, "1000 F", ColorConstants.WHITE, false, true, -1, 0);

        RSInterface scroll = addInterface(49538);
        scroll.height = 219;
        scroll.width = 230;
        scroll.scrollMax = 220;

        addToItemGroup(49539, 6,15, 5, 5, true, new String[]{"Remove",null,null,null,null});
        scroll.totalChildren(1);
        scroll.child(0, 49539, 0, 5);

        rsi.totalChildren(27);
        rsi.child(0, 49511, 1, 1);
        rsi.child(1, 49512, 260, 13);
        rsi.child(2, 49513, 485, 11);
        rsi.child(3, 49514, 485, 11);
        rsi.child(4, 49516, 16, 44);
        rsi.child(5, 49517, 16, 73);
        rsi.child(6, 49518, 45, 52);
        rsi.child(7, 49519, 45, 81);
        rsi.child(8, 49520, 273, 278);
        rsi.child(9, 49521, 273, 278);
        rsi.child(10, 49523, 109, 279);
        rsi.child(11, 49524, 145, 282);
        rsi.child(12, 49525, 145, 297);
        rsi.child(13, 49526, 210, 282);
        rsi.child(14, 49527, 201, 297);
        rsi.child(15, 49528, 302, 288);
        rsi.child(16, 49529, 403, 88);
        rsi.child(17, 49530, 382, 85);
        rsi.child(18, 49531, 403, 64);
        rsi.child(19, 49532, 450, 280);
        rsi.child(20, 49533, 450, 240);
        rsi.child(21, 49534, 450, 200);
        rsi.child(22, 49535, 450, 160);
        rsi.child(23, 49536, 450, 120);
        rsi.child(24, 49537, 450, 80);
        rsi.child(25, 49538, 115, 53);
        rsi.child(26, 49582, 236, 286);

        inventory();
        shop();
        inventoryDisabled();
    }

    private static void inventory() {
        RSInterface tab = addTabInterface(49540);
        addInventoryItemGroup2(49541, 7, 4, new String[]{"Sacrifice", null, null, null, null});
        setChildren(1, tab);
        setBounds(49541, 0, 0, 0, tab);
    }

    private static void inventoryDisabled() {
        RSInterface tab = addTabInterface(49566);
        addInventoryItemGroup2(49567, 7, 4, new String[]{null, null, null, null, null});
        setChildren(1, tab);
        setBounds(49567, 0, 0, 0, tab);
    }

    private static void shop() {
        RSInterface rsi = addInterface(49542);

        addSpriteLoader(49543, 3364);
        addText(49544, "The Forge", ColorConstants.RS_ORANGE, true, true, -1, 2);

        addCloseButtonSmall(49545,49546,49547);

        addButton(49548, 3342, "Forge");
        addSprite(49549, 3345);

        addText(49550, "Forge", 0xdba40b, false, true, -1, 0);
        addText(49551, "Shop", 0xffda72, false, true, -1, 0);

        addConfigButtonWSpriteLoader(49552, 49542, 3351, 3355, 76, 26, "Tier one shop", 0, 5, 1531);
        addConfigButtonWSpriteLoader(49553, 49542, 3354, 3352, 76, 26, "Tier two shop", 1, 5, 1531);
        addConfigButtonWSpriteLoader(49554, 49542, 3353, 3356, 76, 26, "Tier two shop", 2, 5, 1531);

        addConfigButtonWSpriteLoader(49555, 49542, 3360, 3357, 76, 26, "Armoury", 0, 5, 1532);
        addConfigButtonWSpriteLoader(49556, 49542, 3359, 3362, 76, 26, "Jewelry", 1, 5, 1532);
        addConfigButtonWSpriteLoader(49557, 49542, 3358, 3361, 76, 26, "Others", 2, 5, 1532);

        addText(49558, "Tier 1", 0xdba40b, false, true, -1, 0);
        addText(49559, "Tier 2", 0xdba40b, false, true, -1, 0);
        addText(49560, "Tier 3", 0xdba40b, false, true, -1, 0);

        addText(49561, "Armoury", 0xdba40b, false, true, -1, 0);
        addText(49562, "Jewelry", 0xdba40b, false, true, -1, 0);
        addText(49563, "Others", 0xdba40b, false, true, -1, 0);

        RSInterface scroll = addInterface(49564);
        scroll.totalChildren(1);
        scroll.height = 269;
        scroll.width = 288;
        scroll.scrollMax = 620;
        addToItemGroup(49565, 5,20, 26, 35, true, new String[]{"Buy 1", "Buy 5", "Buy 10", "Buy X", null});
        scroll.child(0, 49565, 9, 10);

        rsi.totalChildren(21);
        rsi.child(0, 49543, 1, 1);
        rsi.child(1, 49544, 260, 13);
        rsi.child(2, 49545, 485, 11);
        rsi.child(3, 49546, 485, 11);
        rsi.child(4, 49548, 16, 44);
        rsi.child(5, 49549, 16, 73);
        rsi.child(6, 49550, 45, 52);
        rsi.child(7, 49551, 45, 81);
        rsi.child(8, 49552, 16, 210);
        rsi.child(9, 49553, 16, 238);
        rsi.child(10, 49554, 16, 266);
        rsi.child(11, 49555, 411, 44);
        rsi.child(12, 49556, 411, 73);
        rsi.child(13, 49557, 411, 102);
        rsi.child(14, 49558, 43, 218);
        rsi.child(15, 49559, 43, 246);
        rsi.child(16, 49560, 43, 274);
        rsi.child(17, 49561, 419, 53);
        rsi.child(18, 49562, 419, 82);
        rsi.child(19, 49563, 419, 111);
        rsi.child(20, 49564, 106, 46);
    }

    public static void drawShopBox(int itemId, int x, int y) {
        boxSprite.drawSprite(x, y);
        Client.instance.smallText.drawRegularText(true, x + 14, 0xffff00, intToKOrMil(PRICES.get(itemId)), y + 52);
    }

    public static void drawLock(int x, int y) {
        if(unbuyable) {
            lockSprite.drawAdvancedSprite(x-3,y+1);
        }
    }
}
