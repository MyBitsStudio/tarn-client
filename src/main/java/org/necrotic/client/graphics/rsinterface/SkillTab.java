package org.necrotic.client.graphics.rsinterface;

import org.necrotic.client.RSInterface;
import org.necrotic.client.Skills;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class SkillTab extends RSInterface{

    public static int[] icons = {625, 629, 645, 636, 641, 640, 638, 628, 639, 644, 647, 643, 926};

    public static void buildGlobal(TextDrawingArea[] tda) {
        int inter = 124000, child = 0;
        RSInterface info = addInterface(inter);
        info.totalChildren(8 * Skills.SKILL_NAMES.length + 5);
        int x = 0, y = 5;

        for(int i = 0; i < Skills.SKILL_NAMES.length; i++){
            addNewSkillButton(++inter, Skills.SKILL_NAMES[i]);
            info.child(child++, inter, x, y);
            createSkillHover(++inter, 205 + i);
            info.child(child++, inter, x, y);
            addHoverButtonWSpriteLoader(++inter, 370, 60, 27, "Select Skill", 1321, -1, 1);
            info.child(child++, inter, x, y);
            addSpriteLoader(++inter, icons[i]);
            info.child(child++, inter, x+3, y+7);
            addSkillText(++inter, false, i);
            info.child(child++, inter, x+28, y+4);
            addSkillText(++inter, true, i);
            info.child(child++, inter, x+41, y+20);
            addProgressBarTwo(++inter, 3392,61, 8, 100, 100, ProgressBarType.HORIZONTAL_LEFT_RIGHT);
            info.child(child++, inter, x + 1, y+31);
            addProgressBarTwo(++inter, 3350,5, 40, 100, 100, ProgressBarType.VERTICAL_DOWN_UP);
            info.child(child++, inter, x+60, y);
            x += 63;
            if((i + 1) % 3 == 0){
                y += 40;
                x = 0;
            }
        }

        addProgressBarTwo(++inter, 3392,126, 12, 100, 100, ProgressBarType.HORIZONTAL_LEFT_RIGHT);
        info.child(child++, inter, 3, 248);
        createHoverTwo(++inter, 230, 126, 12);
        info.child(child++, inter, 3, 248);

        addProgressBarTwo(++inter, 3392,126, 12, 100, 100, ProgressBarType.HORIZONTAL_LEFT_RIGHT);
        info.child(child++, inter, 3, 232);
        createHoverTwo(++inter, 231, 126, 12);
        info.child(child++, inter, 3, 232);

        addSpriteLoader(++inter, 649);
        info.child(child++, inter, 128, 230);

    }
}
