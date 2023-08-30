package org.necrotic.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum RarityColor {
    NONE(0, 0, ItemRarity.NONE),
    COMMON(0x32A852, 1, ItemRarity.COMMON),
    UNCOMMON(0x7DF0E, 2, ItemRarity.UNCOMMON),
    RARE(0x87CEEB, 3, ItemRarity.RARE),
    LEGENDARY(0XEE3609, 4, ItemRarity.LEGENDARY),
    MYTHIC(0xEE82EE, 5, ItemRarity.MYTHIC),

    GODLY(0xFF1493, 6, ItemRarity.GODLY);

    private final int color, id;
    private final ItemRarity itemRarity;

    RarityColor(int color, int id, ItemRarity itemRarity) {
        this.color = color;
        this.id = id;
        this.itemRarity = itemRarity;
    }

    public int getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public ItemRarity getItemRarity() {
        return itemRarity;
    }

    public static RarityColor getColorTypeForEffect(int effect) {
        return RARITY_COLOR_LIST
                .stream()
                .filter(eff -> eff.getId() == effect)
                .findFirst()
                .orElse(null);
    }

    private static final List<RarityColor> RARITY_COLOR_LIST = new ArrayList<>(Arrays.asList(values()));
}
