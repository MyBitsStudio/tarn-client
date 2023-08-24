package org.necrotic.client.graphics.rsinterface.achievements;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;
import org.necrotic.ColorConstants;
import org.necrotic.client.Client;
import org.necrotic.client.RSInterface;
import org.necrotic.client.Signlink;
import org.necrotic.client.graphics.rsinterface.ProgressBarType;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static org.necrotic.client.graphics.rsinterface.CustomInterfaces.tda;

public class Achievements extends RSInterface {

    public static void build() {
        achievement();
    }

    private static final AhoCorasickDoubleArrayTrie<String> acdat = new AhoCorasickDoubleArrayTrie<>();

    public static final List<Achievement> ALL_ACHIEVEMENTS = new ArrayList<>(300);
    public static final HashMap<Integer, Achievement> cachedAchievements = new HashMap<>();
    public static final List<Achievement> BEGINNER_ACHIEVEMENTS = new ArrayList<>();
    public static final List<Achievement> EASY_ACHIEVEMENTS = new ArrayList<>();
    public static final List<Achievement> MEDIUM_ACHIEVEMENTS = new ArrayList<>();
    public static final List<Achievement> HARD_ACHIEVEMENTS = new ArrayList<>();
    public static final List<Achievement> ELITE_ACHIEVEMENTS = new ArrayList<>();

    public static int completedBeginner = 0, completedEasy = 0, completedMedium = 0, completedHard = 0, completedElite = 0;

    private static final HashMap<Integer, String> PERK_DESCRIPTIONS = new HashMap<>();
    static {
        PERK_DESCRIPTIONS.put(165354, "This is perk one");
        PERK_DESCRIPTIONS.put(165355, "This is perk two");
        PERK_DESCRIPTIONS.put(165356, "This is perk three");
        PERK_DESCRIPTIONS.put(165357, "This is perk four");
        PERK_DESCRIPTIONS.put(165358, "This is perk five");
        PERK_DESCRIPTIONS.put(165359, "This is perk six");
        PERK_DESCRIPTIONS.put(165360, "This is perk seven");
        PERK_DESCRIPTIONS.put(165361, "This is perk eight");
        PERK_DESCRIPTIONS.put(165362, "This is perk nine");
    }

    public static final boolean[] UNLOCKED_PERKS = new boolean[9];
    public static void perkConfig(boolean bool, int offset) {
        UNLOCKED_PERKS[offset] = bool;
        if(bool) {
            RSInterface.interfaceCache[165354 + offset].disabledSprite = Client.spritesMap.get(3456 + (5 * offset));
            RSInterface.interfaceCache[165354 + offset].enabledSprite = Client.spritesMap.get(3456 + (5 * offset) + (offset == 0 ? 1 : 2));
        }
    }

    private static void achievement() {
        RSInterface rsi = addInterface(165001);
        rsi.totalChildren(33);

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
            addAchievementComponent(achievement.getComponentId(), achievement.getTitle(), achievement.getDescription(), achievement.getDifficulty().getPoints(), count % 2 == 0 ? 3423 : 3424, count % 2 == 0 ? 3427 : 3425, achievement.getDifficulty().getSprite(), achievement.getMaxProgress(), count);
            scroll.child(count+1, achievement.getComponentId(), 0, 35 * count);
            count++;
        }

        overlay();

        addWrappingText(165339, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi "
                , tda, 0, ColorConstants.RS_ORANGE, false, true, 100);

        rsi.child(30, 165339, 15, 112);

        hoverButton(165340, 3434, 3433, "Open");
        rsi.child(31, 165340, 13, 279);

        addText(165341, "Points Store", 0xff8624, true, true, -1, 1);
        rsi.child(32, 165341, 65, 286);

        perks();
    }

    private static void perks() {
        RSInterface rsi = addInterface(165342);
        rsi.totalChildren(56);

        addSpriteLoader(165343, 3406);
        rsi.child(0, 165343, 2, 15);

        rsi.child(1, 165003, 260, 25);
        rsi.child(2, 165004, 486, 25);
        rsi.child(3, 165005, 13, 62);
        rsi.child(4, 165006, 95, 62);
        rsi.child(5, 165007, 177, 62);
        rsi.child(6, 165008, 259, 62);
        rsi.child(7, 165009, 341, 62);
        rsi.child(8, 165010, 13, 54);
        rsi.child(9, 165010, 95, 54);
        rsi.child(10, 165010, 177, 54);
        rsi.child(11, 165010, 259, 54);
        rsi.child(12, 165010, 341, 54);
        rsi.child(13, 165011, 13, 54);
        rsi.child(14, 165012, 95, 54);
        rsi.child(15, 165013, 177, 54);
        rsi.child(16, 165014, 259, 54);
        rsi.child(17, 165015, 341, 54);
        rsi.child(18, 165016, 56, 66);
        rsi.child(19, 165017, 130, 66);
        rsi.child(20, 165018, 218, 66);
        rsi.child(21, 165019, 294, 66);
        rsi.child(22, 165020, 376, 66);
        rsi.child(23, 165021, 3, 89);
        rsi.child(24, 165022, 427, 61);
        rsi.child(25, 165023, 442, 61);
        rsi.child(26, 165024, 476, 63);
        rsi.child(27, 165339, 15, 112);
        rsi.child(28, 165340, 13, 279);
        rsi.child(29, 165341, 65, 286);

        hoverButton(165344, 3450, 3449, "Upgrade");
        rsi.child(30, 165344, 120, 246);

        hoverButton(165345, 3450, 3449, "Purchase");
        rsi.child(31, 165345, 120, 279);

        addText(165346, "Upgrade Selected Perk", 0xff8624, true, true, -1, 1);
        rsi.child(32, 165346, 205, 253);

        addText(165347, "Purchase Selected Perk", 0xff8624, true, true, -1, 1);
        rsi.child(33, 165347, 205, 286);

        rsi.child(34, 165022, 125, 225);
        rsi.child(35, 165023, 140, 226);

        addText(165348, "75", 0x9d9d9d, false, true, -1, 0);
        rsi.child(36, 165348, 147, 227);

        addWrappingText(165349, "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                        "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                        "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi "
                , tda, 0, ColorConstants.ORANGE, false, true, 190);

        rsi.child(37, 165349, 304, 204);

        addText(165350, "75", 0x9d9d9d, false, true, -1, 0);
        rsi.child(38, 165350, 345, 108);

        addText(165351, "100", 0x9d9d9d, false, true, -1, 0);
        rsi.child(39, 165351, 411, 108);

        addText(165352, "150", 0x9d9d9d, false, true, -1, 0);
        rsi.child(40, 165352, 481, 108);

        addText(165353, "200", 0x9d9d9d, false, true, -1, 0);
        rsi.child(41, 165353, 410, 162);

        addHoverableConfigSprite(165354, 3458, 3459, true, "Perk 1", 0, 3126);
        rsi.child(42, 165354, 130, 100);

        addHoverableConfigSprite(165355, 3464, 3465, true, "Perk 2", 1, 3126);
        rsi.child(43, 165355, 170, 100);

        addHoverableConfigSprite(165356, 3469, 3470, true, "Perk 3", 2, 3126);
        rsi.child(44, 165356, 210, 100);

        addHoverableConfigSprite(165357, 3474, 3475, true, "Perk 4", 3, 3126);
        rsi.child(45, 165357, 250, 100);

        addHoverableConfigSprite(165358, 3479, 3480, true, "Perk 5", 5, 3126);
        rsi.child(46, 165358, 130, 140);

        addHoverableConfigSprite(165359, 3484, 3485, true, "Perk 6", 6, 3126);
        rsi.child(47, 165359, 170, 140);

        addHoverableConfigSprite(165360, 3489, 3490, true, "Perk 7", 7, 3126);
        rsi.child(48, 165360, 210, 140);

        addHoverableConfigSprite(165361, 3494, 3495, true, "Perk 8", 8, 3126);
        rsi.child(49, 165361, 250, 140);

        addHoverableConfigSprite(165362, 3499, 3500, true, "Perk 9", 9, 3126);
        rsi.child(50, 165362, 130, 180);

        addSprite(165363, 3459);
        addSprite(165364, 3459);
        addSprite(165365, 3459);
        addSprite(165366, 3459);
        addSprite(165367, 3459);

        rsi.child(51, 165363, 300, 90);
        rsi.child(52, 165364, 371, 90);
        rsi.child(53, 165365, 441, 90);
        rsi.child(54, 165366, 441, 144);
        rsi.child(55, 165367, 371, 144);

    }

    private static void overlay() {
        RSInterface overlay = addInterface(165329);
        overlay.totalChildren(9);

        addRectangle(165330, 510, 304, 0x000000, 90, true);
        overlay.child(0, 165330, 2, 15);

        addSpriteLoader(165331, 3443);
        overlay.child(1,165331, 142, 45);

        addSpriteLoader(165332, 3428);
        overlay.child(2,165332, 261, 91);

        addText(165333, "Achievement Title", 0xffa900, true, true, -1, 1);
        overlay.child(3,165333, 270, 119);

        addText(165334, "Information", ColorConstants.RS_ORANGE, true, true, -1, 2);
        overlay.child(4,165334, 267, 56);

        addWrappingText(165335, "A description of the achievement, put anything here.", tda, 1, 0x9f9f9f, true, true, 196);
        overlay.child(5, 165335, 170, 148);

        addText(165336, "Rewards", 0xffc96d, true, true, -1, 1);
        overlay.child(6,165336, 266, 195);

        addToItemGroup(165337, 4,2, 5, 5, true, new String[]{null,null,null,null,null});
        overlay.child(7,165337, 180, 220);

        hoverButton(165338, 714, 715, "Close");
        overlay.child(8, 165338, 369, 55);
    }

    public static void onButtonClick(int interfaceId) {
        if(interfaceId == 165338) {
            Client.overlayInterfaceId = -1;
            RSInterface.interfaceCache[165001].disableInteraction = false;
            return;
        }
        if(interfaceId >= 165029 && interfaceId < ALL_ACHIEVEMENTS.size() + 165029) {
            Achievement achievement = null;
            if (cachedAchievements.containsKey(interfaceId)) {
                achievement = cachedAchievements.get(interfaceId);
            } else {
                Optional<Achievement> achievementOptional = ALL_ACHIEVEMENTS
                        .stream()
                        .filter(ach -> ach.getComponentId() == interfaceId)
                        .findFirst();
                if (achievementOptional.isPresent()) {
                    achievement = achievementOptional.get();
                }
            }
            if(achievement != null) {
                Client.overlayInterfaceId = 165329;
                RSInterface.interfaceCache[165001].disableInteraction = true;
                RSInterface.interfaceCache[165332].enabledSprite = achievement.getDifficulty().getSprite();
                RSInterface.interfaceCache[165332].disabledSprite = achievement.getDifficulty().getSprite();
                RSInterface.interfaceCache[165333].message = achievement.getTitle();
                RSInterface.interfaceCache[165335].message = achievement.getDescription();;
                RSInterface.interfaceCache[165337].inv = new int[8];
                RSInterface.interfaceCache[165337].invStackSizes = new int[8];
                for(int i = 0; i < achievement.getRewards().length; i++) {
                    RSInterface.interfaceCache[165337].inv[i] = achievement.getRewards()[i].getItemId() + 1;
                    RSInterface.interfaceCache[165337].invStackSizes[i] = achievement.getRewards()[i].getAmount();
                }
            }
        } else if(interfaceId >= 165354 && interfaceId <= 165362) {
            RSInterface.interfaceCache[165349].message = PERK_DESCRIPTIONS.get(interfaceId);
            showPerk(interfaceId);
        }
        if(interfaceId == 165340) {
            switchInterface(Client.openInterfaceID);
        }
    }

    public static void showPerk(int id) {
        for(int i = 165363; i <= 165367; i++) {
            RSInterface.interfaceCache[i].enabledSprite = RSInterface.interfaceCache[id].enabledSprite;
            RSInterface.interfaceCache[i].disabledSprite = RSInterface.interfaceCache[id].disabledSprite;
        }
    }

    public static void reset() {
        showPerk(165354);
        switchInterface(165342);
        Client.getClient().configPacket(3126, 0);
    }

    private static void switchInterface(int id) {
        Client.getClient().messagePromptRaised = false;
        showPerk(165354);
        Client.getClient().configPacket(3126, 0);
        if(id == 165001) {
            Client.openInterfaceID = 165342;
            Client.getClient().resetInterfaceAnimation(165342);
            RSInterface.interfaceCache[165341].message = "Achievements";
        } else if(id == 165342) {
            Client.openInterfaceID = 165001;
            Client.getClient().resetInterfaceAnimation(165001);
            RSInterface.interfaceCache[165341].message = "Points Store";
            switchTabs(Difficulty.BEGINNER);
        }
    }

    public static void search(String search) {
        clear();
        final AtomicInteger matchCount = new AtomicInteger(0);
        if(search.length() >= 1) {
            if(Client.openInterfaceID != 165001) {
                switchInterface(Client.openInterfaceID);
            }
            TreeMap<String, String> map = new TreeMap<>();
            map.put(search.toLowerCase(), search.toLowerCase());
            acdat.build(map);
            for(Achievement achievement : ALL_ACHIEVEMENTS) {
                String name = achievement.getTitle().toLowerCase();
                acdat.parseText(name, (begin, end, value) -> {
                        int count = matchCount.getAndIncrement();
                        RSInterface component = interfaceCache[achievement.getComponentId()];
                        component.disabledSprite = Client.spritesMap.get(count % 2 == 0 ? 3423 : 3424);
                        component.enabledSprite = Client.spritesMap.get(count % 2 == 0 ? 3427 : 3425);
                        component.hideWidget = false;
                        RSInterface.interfaceCache[165027].childY[(achievement.getComponentId() - 165029) + 1] = 35 * count;
                });
            }
            interfaceCache[165027].scrollMax = Math.max(182, 35 * matchCount.get());
        }
    }

    public static void switchTabs(Difficulty difficulty) {
        List<Achievement> list = new ArrayList<>();
        if(Client.openInterfaceID != 165001) {
            list = BEGINNER_ACHIEVEMENTS;
            Client.getClient().configPacket(3125, 0);
        } else {
            switch (difficulty) {
                case BEGINNER:
                    list = BEGINNER_ACHIEVEMENTS;
                    Client.getClient().configPacket(3125, 0);
                    break;
                case EASY:
                    list = EASY_ACHIEVEMENTS;
                    Client.getClient().configPacket(3125, 1);
                    break;
                case MEDIUM:
                    list = MEDIUM_ACHIEVEMENTS;
                    Client.getClient().configPacket(3125, 2);
                    break;
                case HARD:
                    list = HARD_ACHIEVEMENTS;
                    Client.getClient().configPacket(3125, 3);
                    break;
                case ELITE:
                    list = ELITE_ACHIEVEMENTS;
                    Client.getClient().configPacket(3125, 4);
                    break;
            }
        }
        clear();
        int i = 0;
        for(Achievement achievement : list) {
            RSInterface.interfaceCache[achievement.getComponentId()].disabledSprite = Client.spritesMap.get(i % 2 == 0 ? 3423 : 3424);
            RSInterface.interfaceCache[achievement.getComponentId()].enabledSprite = Client.spritesMap.get(i % 2 == 0 ? 3427 : 3425);
            RSInterface.interfaceCache[165027].childY[(achievement.getComponentId() - 165029) + 1] = i * 35;
            RSInterface.interfaceCache[achievement.getComponentId()].hideWidget = false;
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
        if(Client.openInterfaceID != 165001) {
            switchInterface(Client.openInterfaceID);
        }
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
            for(int i = 0; i < ALL_ACHIEVEMENTS.size(); i++) {
                ALL_ACHIEVEMENTS.get(i).setComponentId(165029+i);
            }
            BEGINNER_ACHIEVEMENTS.addAll(ALL_ACHIEVEMENTS.stream().filter(achievement -> achievement.getDifficulty().equals(Difficulty.BEGINNER)).collect(Collectors.toList()));
            EASY_ACHIEVEMENTS.addAll(ALL_ACHIEVEMENTS.stream().filter(achievement -> achievement.getDifficulty().equals(Difficulty.EASY)).collect(Collectors.toList()));
            MEDIUM_ACHIEVEMENTS.addAll(ALL_ACHIEVEMENTS.stream().filter(achievement -> achievement.getDifficulty().equals(Difficulty.MEDIUM)).collect(Collectors.toList()));
            HARD_ACHIEVEMENTS.addAll(ALL_ACHIEVEMENTS.stream().filter(achievement -> achievement.getDifficulty().equals(Difficulty.HARD)).collect(Collectors.toList()));
            ELITE_ACHIEVEMENTS.addAll(ALL_ACHIEVEMENTS.stream().filter(achievement -> achievement.getDifficulty().equals(Difficulty.ELITE)).collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
