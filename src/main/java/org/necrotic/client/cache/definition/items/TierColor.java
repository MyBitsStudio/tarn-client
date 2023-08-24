package org.necrotic.client.cache.definition.items;

public enum TierColor {
    //<shad=1><col=00e673>

    BEGGINER(""),
    NOVICE("<col=b5aaaa>"),
    INTER("<col=ff0000>"),
    ADVANCED("<col=ff00ff>"),
    UNCOMMON("<col=00ff00>"),

    SEMI_RARE("<col=0000ff>"),
    RARE("<col=ffff00>"),
    ULTRA_RARE("<col=ff0000>"),

    LEGENDARY("<col=ff0000>"),
    DIVINE("<col=ff0000>"),
    MYTHICAL("<col=ff0000>"),

    ;

    private final String color;

    TierColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
