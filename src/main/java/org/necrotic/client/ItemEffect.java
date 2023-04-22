package org.necrotic.client;

public enum ItemEffect {

    /* Common Effect */
    NOTHING(ItemRarity.COMMON),

    /* Uncommon Rarity Bonuses */
    STRENGTH_DAMAGE(ItemRarity.UNCOMMON),
    RANGE_DAMAGE(ItemRarity.UNCOMMON),
    MAGIC_DAMAGE(ItemRarity.UNCOMMON),

    /* Rare Rarity Bonuses */
    DROP_RATE_LOW(ItemRarity.RARE),
    DOUBLE_DROP(ItemRarity.RARE),
    ALL_DAMAGE_LOW(ItemRarity.RARE),

    /* Legendary Rarity Bonuses */
    DOUBLE_KILLS(ItemRarity.LEGENDARY),
    DOUBLE_CASH(ItemRarity.LEGENDARY),
    ALL_DAMAGE_MEDIUM(ItemRarity.LEGENDARY),

    /* Mythic Rarity Bonuses */
    TRIPLE_KILLS(ItemRarity.MYTHIC),
    AOE_EFFECT(ItemRarity.MYTHIC),
    DROP_RATE_HIGH(ItemRarity.MYTHIC),
    ALL_DAMAGE_HIGH(ItemRarity.MYTHIC);

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
