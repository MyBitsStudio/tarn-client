package org.necrotic.client.cache.definition.items;

public enum TierColor {

    BEGGINER(""),
    NOVICE("<col=b5aaaa>"),
    INTER("<col=ff0000>"),
    ADVANCED("<col=ff00ff>"),

    ;

    private final String color;

    TierColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
