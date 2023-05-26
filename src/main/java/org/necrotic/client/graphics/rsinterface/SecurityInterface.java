package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class SecurityInterface extends RSInterface {

    public static void build(TextDrawingArea[] tda) {//image 3045
        RSInterface main = addInterface(70000);

        addSpriteLoader(70001, 3324);
        addText(70002, "Player Security", ColorConstants.PURPLE, true, true, -1, 2);
        addCloseButton(70003, 70004, 70005);


        addText(70006, "Player Security Information", 0xc0c0c0, true, true, -1, 0);
        addText(70007, "Active", ColorConstants.GREEN, true, true, -1, 0);
        addText(70008, "Current Security Status", 0xc0c0c0, true, true, -1, 0);
        addText(70009, "Unsecure", ColorConstants.YELLOW, true, true, -1, 0);
        addText(70010, "", ColorConstants.GREEN, true, true, -1, 0);

        addText(70011, "We keep a secure logging of \\n your files. Here you can check \\n for @red@Invalid Logs", 0xc0c0c0, true, true, -1, 0);

        addText(70012, "Security Score : 20", 0xadff2f, true, true, -1, 0);
        addText(70013, "Account Pin : ", ColorConstants.LIME_GREEN, true, true, -1, 0);
        addText(70014, "2FA: ", ColorConstants.LIME_GREEN, true, true, -1, 0);
        addText(70015, "Password: ", ColorConstants.LIME_GREEN, true, true, -1, 0);

        addText(70016, "@gre@Secure", 0xadff2f, true, true, -1, 0);
        addText(70017, "@gre@Secure", 0xadff2f, true, true, -1, 0);
        addText(70018, "@red@Insecure", 0xadff2f, true, true, -1, 0);

        addSpriteLoader(70019, 3327);

        addButtonWSpriteLoader(70020, 3338, "@gre@Change Pin");
        addButtonWSpriteLoader(70021, 3338,"@gre@Change 2FA");
        addButtonWSpriteLoader(70022, 3338,"@gre@Change Password");

        addButtonWSpriteLoader(70023, 3338, "@red@Secure");

        RSInterface teleScroll = addInterface(70024);

        teleScroll.width = 163;
        teleScroll.height = 158;
        teleScroll.scrollMax = 700;
        teleScroll.totalChildren(35);


        for(int i = 0; i < 35; i++) {
            addClickableText(70025 + i, "", "Validate", tda, 0, 0xFF8900, true, true, 151);
            teleScroll.child( i, 70025 + i, 10, 5 + (i * 20));
        }

        main.totalChildren(23);
        main.child(0, 70001, 85, 20);
        main.child(1, 70002, 255, 30);
        main.child(2, 70003, 395, 27);
        main.child(3, 70004, 395, 27);
        main.child(4, 70006, 176, 60);
        main.child(5, 70007, 172, 75);
        main.child(6, 70008, 340, 60);
        main.child(7, 70009, 340, 75);
        main.child(8, 70010, 340, 75);
        main.child(9, 70011, 179, 252);
        main.child(10, 70012, 338, 144);
        main.child(11, 70013, 310, 205);
        main.child(12, 70014, 290, 165);
        main.child(13, 70015, 305, 185);
        main.child(14, 70016, 385, 205);
        main.child(15, 70017, 385, 165);
        main.child(16, 70018, 385, 185);
        main.child(17, 70019, 322, 93);
        main.child(18, 70020, 264, 230);
        main.child(19, 70021, 314, 230);
        main.child(20, 70022, 364, 230);
        main.child(21, 70023, 314, 92);
        main.child(22, 70024, 88, 89);
    }
}
