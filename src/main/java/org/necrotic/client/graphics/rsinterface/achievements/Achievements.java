package org.necrotic.client.graphics.rsinterface.achievements;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;
import org.necrotic.client.Client;
import org.necrotic.client.RSInterface;
import org.necrotic.client.Signlink;
import org.necrotic.client.graphics.Sprite;
import org.necrotic.client.graphics.rsinterface.ProgressBarType;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static org.necrotic.client.graphics.rsinterface.CustomInterfaces.tda;

public class Achievements extends RSInterface {

    public static void build() {
        achievement();
    }

    private static final AhoCorasickDoubleArrayTrie<String> acdat = new AhoCorasickDoubleArrayTrie<>();

    public static final List<Achievement> ALL_ACHIEVEMENTS = new ArrayList<>();
    public static final List<Achievement> BEGINNER_ACHIEVEMENTS = new ArrayList<>();
    public static final List<Achievement> EASY_ACHIEVEMENTS = new ArrayList<>();
    public static final List<Achievement> MEDIUM_ACHIEVEMENTS = new ArrayList<>();
    public static final List<Achievement> HARD_ACHIEVEMENTS = new ArrayList<>();
    public static final List<Achievement> ELITE_ACHIEVEMENTS = new ArrayList<>();

    public static int completedBeginner = 0, completedEasy = 0, completedMedium = 0, completedHard = 0, completedElite = 0;

    private static void achievement() {
        RSInterface rsi = addInterface(165001);
        rsi.totalChildren(30);

        addSpriteLoader(165002, 3407);
        rsi.child(0, 165002, 2, 15);

        addText(165003, "Achievement Book", 0xff8624, true, true, -1, 2);
        rsi.child(1, 165003, 260, 25);

        hoverButton(165004, 714, 715, "Close");
        rsi.child(2, 165004, 486, 25);

        addHoverableConfigSprite(165005, 3420, 3421, true, "Select Beginner", 0, 3125);
        rsi.child(3, 165005, 13, 62);
        RSInterface.interfaceCache[165005].contentType = 965;

        addHoverableConfigSprite(165006, 3417, 3418, true, "Select Easy", 1, 3125);
        rsi.child(4, 165006, 95, 62);
        RSInterface.interfaceCache[165006].contentType = 966;

        addHoverableConfigSprite(165007, 3409, 3408, true, "Select Medium", 2, 3125);
        rsi.child(5, 165007, 177, 62);
        RSInterface.interfaceCache[165007].contentType = 967;

        addHoverableConfigSprite(165008, 3414, 3415, true, "Select Hard", 3, 3125);
        rsi.child(6, 165008, 259, 62);
        RSInterface.interfaceCache[165008].contentType = 968;

        addHoverableConfigSprite(165009, 3411, 3412, true, "Select Elite", 4, 3125);
        rsi.child(7, 165009, 341, 62);
        RSInterface.interfaceCache[165009].contentType = 969;

        addSprite(165010, 3442);
        rsi.child(8, 165010, 13, 54);
        rsi.child(9, 165010, 95, 54);
        rsi.child(10, 165010, 177, 54);
        rsi.child(11, 165010, 259, 54);
        rsi.child(12, 165010, 341, 54);

        addProgressBar(165011, 78, 7, 0, 0x37b514, 0x000000);
        rsi.child(13, 165011, 13, 54);

        addProgressBar(165012, 78, 7, 15, 0x37b514, 0x000000);
        rsi.child(14, 165012, 95, 54);

        addProgressBar(165013, 78, 7, 30, 0x37b514, 0x000000);
        rsi.child(15, 165013, 177, 54);

        addProgressBar(165014, 78, 7, 45, 0x37b514, 0x000000);
        rsi.child(16, 165014, 259, 54);

        addProgressBar(165015, 78, 7, 60, 0x37b514, 0x000000);
        rsi.child(17, 165015, 341, 54);

        addText(165016, "Beginner", 0xff8624, true, true, -1, 0);
        rsi.child(18, 165016, 56, 66);
        addText(165017, "Easy", 0xff8624, true, true, -1, 0);
        rsi.child(19, 165017, 130, 66);
        addText(165018, "Medium", 0xff8624, true, true, -1, 0);
        rsi.child(20, 165018, 218, 66);
        addText(165019, "Hard", 0xff8624, true, true, -1, 0);
        rsi.child(21, 165019, 294, 66);
        addText(165020, "Elite", 0xff8624, true, true, -1, 0);
        rsi.child(22, 165020, 376, 66);

        addClickableText(165021, "Search..", "Search", tda, 1, 0xfeb73e, true, true, 110);
        rsi.child(23, 165021, 3, 89);
        RSInterface.interfaceCache[165021].contentType = 964;

        addSprite(165022, 3435);
        rsi.child(24, 165022, 427, 61);

        addText(165023, ":", 0x9d9d9d, false, true, -1, 0);
        rsi.child(25, 165023, 442, 61);

        addText(165024, "500", 0x9d9d9d, true, true, -1, 0);
        rsi.child(26, 165024, 476, 63);

        addProgressBar(165025, 3438, 100, ProgressBarType.HORIZONTAL_LEFT_RIGHT);
        rsi.child(27, 165025, 123, 89);

        addText(165026, "4/10 Complete", 0xffffff, true, true, -1, 1);
        rsi.child(28, 165026, 310, 95);

        RSInterface scroll = addInterface(165027);
        scroll.scrollMax = 5000;
        scroll.width = 361;
        scroll.height = 181;
        scroll.totalChildren(ALL_ACHIEVEMENTS.size()+1);
        rsi.child(29, 165027, 122, 125);

        addText(165028, "No matches found.", 0x9d9d9d, true, true, -1, 1);
        scroll.child(0, 165028, 182, 20);

        int count = 0;
        for(Achievement achievement : ALL_ACHIEVEMENTS) {
            addAchievementComponent(achievement.key, achievement.title, achievement.description, achievement.difficulty.points, count % 2 == 0 ? 3423 : 3424, count % 2 == 0 ? 3427 : 3425, achievement.difficulty.sprite, achievement.maxProgress, count);
            scroll.child(count+1, achievement.key, 0, 35 * count);
            count++;
        }
    }

    public static void search(String search) {
        clear();
        final AtomicInteger matchCount = new AtomicInteger(0);
        if(search.length() >= 2) {
            TreeMap<String, String> map = new TreeMap<>();
            map.put(search.toLowerCase(), search.toLowerCase());
            acdat.build(map);
            for(Achievement achievement : ALL_ACHIEVEMENTS) {
                String name = achievement.title.toLowerCase();
                acdat.parseText(name, (begin, end, value) -> {
                        int count = matchCount.getAndIncrement();
                        RSInterface component = interfaceCache[achievement.key];
                        component.achievementMaxProgress = achievement.maxProgress;
                        component.achievementTitle = achievement.title;
                        component.helmSprite = achievement.difficulty.sprite;
                        component.achievementDesc = achievement.description;
                        component.achievementRewardPoints = achievement.difficulty.points;
                        component.disabledSprite = Client.spritesMap.get(count % 2 == 0 ? 3423 : 3424);
                        component.enabledSprite = Client.spritesMap.get(count % 2 == 0 ? 3427 : 3425);
                        component.hideWidget = false;
                        RSInterface.interfaceCache[165027].childY[(achievement.key - 165029) + 1] = 35 * count;
                        interfaceCache[165027].scrollMax = Math.max(182, 35 * count);
                });
            }
        }
    }

    public static void switchTabs(Difficulty difficulty) {
        List<Achievement> list = new ArrayList<>();
        switch (difficulty) {
            case BEGINNER:
                list = BEGINNER_ACHIEVEMENTS;
                break;
            case EASY:
                list = EASY_ACHIEVEMENTS;
                break;
            case MEDIUM:
                list = MEDIUM_ACHIEVEMENTS;
                break;
            case HARD:
                list = HARD_ACHIEVEMENTS;
                break;
            case ELITE:
                list = ELITE_ACHIEVEMENTS;
                break;
        }
        clear();
        int i = 0;
        for(Achievement achievement : list) {
            RSInterface.interfaceCache[achievement.key].disabledSprite = Client.spritesMap.get(i % 2 == 0 ? 3423 : 3424);
            RSInterface.interfaceCache[achievement.key].enabledSprite = Client.spritesMap.get(i % 2 == 0 ? 3427 : 3425);
            RSInterface.interfaceCache[165027].childY[(achievement.key - 165029) + 1] = i * 35;
            RSInterface.interfaceCache[achievement.key].hideWidget = false;
            i++;
        }
        int size = list.size();
        interfaceCache[165025].maxPercentage = size;
        if(difficulty == Difficulty.BEGINNER) {
            interfaceCache[165026].message = completedBeginner + "/" + size + " Complete";
            interfaceCache[165025].progress = completedBeginner;
        } else if(difficulty == Difficulty.EASY) {
            interfaceCache[165026].message = completedEasy + "/" + size + " Complete";
            interfaceCache[165025].progress = completedEasy;
        } else if(difficulty == Difficulty.MEDIUM) {
            interfaceCache[165026].message = completedMedium + "/" + size + " Complete";
            interfaceCache[165025].progress = completedMedium;
        } else if(difficulty == Difficulty.HARD) {
            interfaceCache[165026].message = completedHard + "/" + size + " Complete";
            interfaceCache[165025].progress = completedHard;
        } else if(difficulty == Difficulty.ELITE) {
            interfaceCache[165026].message = completedElite + "/" + size + " Complete";
            interfaceCache[165025].progress = completedElite;
        }
        interfaceCache[165027].scrollMax = Math.max(182, 35 * list.size());
    }

    private static void clear() {
        for(int i = 0; i < ALL_ACHIEVEMENTS.size(); i++) {
            int id = 165029 + i;
            RSInterface.interfaceCache[id].hideWidget = true;
            RSInterface.interfaceCache[165027].childY[i+1] = 0;
        }
    }

    public static void load() {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            ALL_ACHIEVEMENTS.addAll(mapper.readValue(
                    new File(Signlink.getCacheDirectory() + "achievements.yaml"),
                    mapper.getTypeFactory().constructCollectionType(List.class, Achievement.class)
            ));
            BEGINNER_ACHIEVEMENTS.addAll(ALL_ACHIEVEMENTS.stream().filter(achievement -> achievement.difficulty.equals(Difficulty.BEGINNER)).collect(Collectors.toList()));
            EASY_ACHIEVEMENTS.addAll(ALL_ACHIEVEMENTS.stream().filter(achievement -> achievement.difficulty.equals(Difficulty.EASY)).collect(Collectors.toList()));
            MEDIUM_ACHIEVEMENTS.addAll(ALL_ACHIEVEMENTS.stream().filter(achievement -> achievement.difficulty.equals(Difficulty.MEDIUM)).collect(Collectors.toList()));
            HARD_ACHIEVEMENTS.addAll(ALL_ACHIEVEMENTS.stream().filter(achievement -> achievement.difficulty.equals(Difficulty.HARD)).collect(Collectors.toList()));
            ELITE_ACHIEVEMENTS.addAll(ALL_ACHIEVEMENTS.stream().filter(achievement -> achievement.difficulty.equals(Difficulty.ELITE)).collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public enum Difficulty {
        BEGINNER(Client.spritesMap.get(3428), 1),
        EASY(Client.spritesMap.get(3432), 2),
        MEDIUM(Client.spritesMap.get(3430), 3),
        HARD(Client.spritesMap.get(3429), 4),
        ELITE(Client.spritesMap.get(3431), 5);

        private final Sprite sprite;
        private final int points;

        Difficulty(Sprite sprite, int points) {
            this.sprite = sprite;
            this.points = points;
        }
    }

    static class Achievement {
        private String title;
        private String description;
        private int maxProgress;
        private Difficulty difficulty;
        private int key;

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

        public void setKey(int key) {
            this.key = key;
        }
    }
}
