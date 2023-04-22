package org.necrotic.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum RarityColor {
    NONE(0, null),
    COMMON(0x32a852, ItemRarity.COMMON),
    UNCOMMON(0x3564bd, ItemRarity.UNCOMMON),
    RARE(0x8935bd, ItemRarity.RARE),
    LEGENDARY(0xd4a22f, ItemRarity.LEGENDARY),
    MYTHIC(0xed1515, ItemRarity.MYTHIC);

    private final int color;
    private final ItemRarity itemRarity;

    RarityColor(int color, ItemRarity itemRarity) {
        this.color = color;
        this.itemRarity = itemRarity;
    }

    public int getColor() {
        return color;
    }

    public ItemRarity getItemRarity() {
        return itemRarity;
    }

    public static RarityColor getColorTypeForEffect(int effect) {
        ItemRarity rarity = ItemEffect.values()[effect].getRarity();
        return RARITY_COLOR_LIST
                .stream()
                .filter(rarityColor -> rarityColor.itemRarity != null && rarityColor.itemRarity.equals(rarity))
                .findFirst()
                .orElse(null);
    }

    private static final List<RarityColor> RARITY_COLOR_LIST = new ArrayList<>(Arrays.asList(values()));
}
