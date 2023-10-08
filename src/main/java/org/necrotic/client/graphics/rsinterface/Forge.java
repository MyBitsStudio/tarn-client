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
        //armors
        PRICES.put(17614, 75);
        PRICES.put(17616, 75);
        PRICES.put(17618, 75);
        PRICES.put(17606, 75);
        PRICES.put(8411, 100);
        PRICES.put(8410, 100);
        PRICES.put(8412, 100);

        PRICES.put(5068, 100);
        PRICES.put(5069, 100);
        PRICES.put(5070, 100);
        PRICES.put(5071, 100);
        PRICES.put(5072, 100);
        PRICES.put(17718, 200);

        PRICES.put(13328, 100);
        PRICES.put(13329, 100);
        PRICES.put(13330, 100);
        PRICES.put(13332, 100);
        PRICES.put(13333, 200);

        PRICES.put(8828, 100);
        PRICES.put(8829, 100);
        PRICES.put(8833, 100);
        PRICES.put(8830, 100);
        PRICES.put(8831, 100);
        PRICES.put(22173, 200);

        PRICES.put(22177, 350);
        PRICES.put(23066, 350);
        PRICES.put(23067, 350);
        PRICES.put(23064, 350);
        PRICES.put(23065, 350);
        PRICES.put(22202, 200);
        PRICES.put(22203, 200);
        PRICES.put(23061, 200);
        PRICES.put(23062, 200);
        PRICES.put(23063, 200);
        PRICES.put(23068, 200);

        PRICES.put(22179, 400);
        PRICES.put(22180, 400);
        PRICES.put(22181, 400);
        PRICES.put(22182, 400);
        PRICES.put(22183, 400);
        PRICES.put(22184, 600);

        PRICES.put(22161, 400);
        PRICES.put(22162, 400);
        PRICES.put(22163, 400);
        PRICES.put(22164, 400);
        PRICES.put(22165, 400);
        PRICES.put(22166, 400);
        PRICES.put(22167, 600);

        PRICES.put(21607, 400);
        PRICES.put(21608, 400);
        PRICES.put(21609, 400);
        PRICES.put(21610, 500);
        PRICES.put(21611, 400);
        PRICES.put(21612, 400);
        PRICES.put(22176, 600);

        PRICES.put(22134, 1250);
        PRICES.put(8109, 1000);
        PRICES.put(8108, 1000);
        PRICES.put(8107, 1000);
        PRICES.put(8106, 1000);
        PRICES.put(8105, 1000);
        PRICES.put(8110, 1250);
        PRICES.put(8104, 1000);
        PRICES.put(8103, 1000);
        PRICES.put(8102, 1000);
        PRICES.put(8101, 1000);
        PRICES.put(8100, 1000);
        PRICES.put(14202, 1000);
        PRICES.put(14204, 1000);
        PRICES.put(14206, 1000);
        PRICES.put(14301, 1000);
        PRICES.put(14303, 1000);
        PRICES.put(14305, 1000);
        PRICES.put(14307, 1250);

        //access
        PRICES.put(14880, 400);
        PRICES.put(15585, 1500);
        PRICES.put(15586, 1500);
        PRICES.put(15584, 1500);

        PRICES.put(15449, 1500);
        PRICES.put(15448, 1500);
        PRICES.put(23087, 1500);

        PRICES.put(18823, 2100);
        PRICES.put(19888, 2100);
        PRICES.put(15589, 2100);
        PRICES.put(15588, 2100);
        PRICES.put(15587, 2100);
        PRICES.put(23088, 4200);

        //others

        PRICES.put(21815, 5);
        PRICES.put(21814, 5);
        PRICES.put(23149, 25);

        PRICES.put(21816, 25);
        PRICES.put(23148, 50);

        PRICES.put(19641, 15000);
        PRICES.put(9076, 8000);
        PRICES.put(9040, 28000);
        PRICES.put(13748, 28000);
        PRICES.put(13746, 28000);
        PRICES.put(13750, 28000);
        PRICES.put(13752, 28000);
        PRICES.put(23147, 100);
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
