package org.necrotic.client.graphics.rsinterface;

import org.necrotic.client.RSInterface;

public class AttendanceRewardInterface extends RSInterface {

    public static void build() {
        RSInterface rsInterface = addInterface(150_000);
        addSpriteLoader(150_001, 3365);

        addText(150_002, "Attendance Rewards", 0xff8624, false, true, 52, 2);
        addCloseButtonSmall(150_003, 150_004, 150_005);

        rsInterface.totalChildren(136);

        int spriteId = 3366;
        int y = 64;
        int x = 37;
        for(int i = 0; i < 31; i++) {
            if(i >0 && i % 9 == 0) {
                y+= 49;
                x = 37;
            }
            if(i == 30) {
                spriteId = 3367;
            }
            addHDSprite(150_012+i, spriteId,spriteId);
            rsInterface.child(10+i, 150_012+i, x, y);
            addText(150_043+i, String.valueOf((i+1)), 0xC0C0C0, false, true, 52, 0);
            rsInterface.child(41+i, 150_043+i, x+2, y+2);
            addItemOnInterface(150_074+i, 150_000, new String[]{null,null,null,null,null});
            rsInterface.child(72+i, 150_074+i, x+7, y+8);
            addHDSprite(150_105+i, 3368, 3368);
            rsInterface.child(103+i, 150_105+i, x+8, y+11);
            x += 49;
        }

        addConfigButton(150_006, 150_000, 3369, 3370, 78, 20, "Loyal", 0, 5, 178);
        addText(150_007, "Loyal", 0xff8624, false, true, 52, 0);

        addConfigButton(150_136, 150_000, 3371, 3372, 78, 20, "Returning", 1, 5, 178);
        addText(150_137, "Returning", 0xff8624, false, true, 52, 0);

        addText(150_008, "Event Period: Oct 1, 2022 (00:00 UTC) - Oct 31 (23:59 UTC).", 0xe4a146, false, true, 52, 1);
        addText(150_009, "Claim Period Until Oct 31 (23:59 UTC).", 0xe4a146, false, true, 52, 1);
        addText(150_010, "You can collect your Attendance Reward once a day.", 0xecc578, false, true, 52, 1);

        addSprite(150_011, 3373);

        rsInterface.child(0, 150_001, 25, 1);
        rsInterface.child(1, 150_002, 185, 11);
        rsInterface.child(2, 150_003, 458, 11);
        rsInterface.child(3, 150_004, 458, 11);
        rsInterface.child(4, 150_006, 37, 40);
        rsInterface.child(5, 150_007, 55, 45);
        rsInterface.child(6, 150_008, 47, 267);
        rsInterface.child(7, 150_009, 47, 285);
        rsInterface.child(8, 150_010, 62, 303);
        rsInterface.child(9, 150_011, 47, 303);

        rsInterface.child(134, 150_136, 125, 40);
        rsInterface.child(135, 150_137, 144, 45);
    }
}
