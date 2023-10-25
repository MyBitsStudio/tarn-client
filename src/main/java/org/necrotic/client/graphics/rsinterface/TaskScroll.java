package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;

import static org.necrotic.client.graphics.rsinterface.CustomInterfaces.tda;

public class TaskScroll extends RSInterface {

    public static void build() {
        RSInterface rsi = addInterface(167650);
        rsi.totalChildren(17);

        addSpriteLoader(167651, 1391);
        rsi.child(0, 167651, 70, 20);

        addText(167652, "Task Scroll", ColorConstants.ORANGE, true, true, -1, 2);
        rsi.child(1, 167652, 248, 30);

        hoverButton(167653, 652, 653, "Close");
        rsi.child(2, 167653, 407, 27);

        addSprite(167654, 3382);
        rsi.child(3, 167654, 76, 72);
        rsi.child(4, 167654, 239, 72);

        addSprite(167655, 3383);
        rsi.child(5, 167655, 215, 54);
        rsi.child(6, 167655, 215, 93);

        rsi.child(7, 167654, 76, 283);
        rsi.child(8, 167654, 239, 283);

        hoverButton(167656, 3188, 3189, "Claim");
        rsi.child(9, 167656, 349, 290);

        hoverButton(167657, 3190, 3191, "Track");
        rsi.child(10, 167657, 389, 290);

        addProgressBar(167658, 260, 20, 0, 0x494034, 0x06bc21);
        rsi.child(11, 167658, 83, 293);

        addText(167659, "Rewards", ColorConstants.RS_ORANGE, true, true, -1, 1);
        rsi.child(12, 167659, 145, 56);

        addText(167660, "Description", ColorConstants.RS_ORANGE, true, true, -1, 1);
        rsi.child(13, 167660, 325, 56);

        addText(167661, "", ColorConstants.SNOW_WHITE, true, true, -1, 1);
        rsi.child(14, 167661, 219, 297);

        RSInterface rewardScroll = addInterface(167662);
        rewardScroll.scrollMax = 500;
        rewardScroll.width = 113;
        rewardScroll.height = 208;
        rsi.child(15, 167662, 85, 75);
        rewardScroll.totalChildren(1);

        RSInterface.itemGroup(167663, 3, 15, 5, 3);
        rewardScroll.child(0, 167663, 0, 3);

        for(int i = 0; i < 30; i++) {
            RSInterface.interfaceCache[167663].inv[i] = 4152;
            RSInterface.interfaceCache[167663].invStackSizes[i] = i;
        }

        addWrappingText(167664, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                        "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                        "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi "
                , tda, 1, 0xff9040, false, true, 200);

        rsi.child(16, 167664, 225, 80);

        overlay();
    }

    private static void overlay() {
        RSInterface rsi = addInterface(167665);
        rsi.totalChildren(2);
        rsi.child(0, 167658, 120, 300);
        rsi.child(1, 167661, 250, 303);
    }
}
