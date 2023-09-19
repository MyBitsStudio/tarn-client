package org.necrotic.client.graphics.rsinterface.achievements;

import org.necrotic.client.Client;
import org.necrotic.client.graphics.Sprite;

public enum Difficulty {
    BEGINNER(Client.spritesMap.get(3428), 2),
    EASY(Client.spritesMap.get(3432), 4),
    MEDIUM(Client.spritesMap.get(3430), 6),
    HARD(Client.spritesMap.get(3429), 8),
    ELITE(Client.spritesMap.get(3431), 10);

    private final Sprite sprite;
    private final int points;

    Difficulty(Sprite sprite, int points) {
        this.sprite = sprite;
        this.points = points;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public int getPoints() {
        return points;
    }
}
