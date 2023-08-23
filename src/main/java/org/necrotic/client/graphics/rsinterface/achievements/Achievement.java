package org.necrotic.client.graphics.rsinterface.achievements;

public class Achievement {
    private String title;
    private String description;
    private int maxProgress;
    private Difficulty difficulty;
    private int primaryKey;
    private int componentId;
    private Reward[] rewards;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMaxProgress(int maxProgress) {
        this.maxProgress = maxProgress;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public void setRewards(Reward[] rewards) {
        this.rewards = rewards;
    }

    public Reward[] getRewards() {
        return rewards;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getMaxProgress() {
        return maxProgress;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public int getComponentId() {
        return componentId;
    }
}
