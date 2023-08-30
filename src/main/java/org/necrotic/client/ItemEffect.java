package org.necrotic.client;

public enum ItemEffect {

    /* Common Effect */
    NOTHING(ItemRarity.NONE),

    DROP_RATE_LOW(ItemRarity.UNCOMMON),
    DOUBLE_XP(ItemRarity.UNCOMMON),

    DOUBLE_DROP(ItemRarity.RARE),
    DROP_RATE_MED(ItemRarity.RARE),

    MULTI_KILLS(ItemRarity.LEGENDARY),
    DOUBLE_CASH(ItemRarity.LEGENDARY),
    ALL_DAMAGE(ItemRarity.LEGENDARY),

    AOE_EFFECT(ItemRarity.MYTHIC),
    DROP_RATE_HIGH(ItemRarity.MYTHIC),
    TRIPLE_CASH(ItemRarity.MYTHIC),
    MULTI_SHOT(ItemRarity.MYTHIC);

    ItemEffect(ItemRarity rarity) {
        this.rarity = rarity;
    }

    private ItemRarity rarity;

    public void setRarity(ItemRarity rarity) {
        this.rarity = rarity;
    }

    public ItemRarity getRarity() {
        return this.rarity;
    }


}
