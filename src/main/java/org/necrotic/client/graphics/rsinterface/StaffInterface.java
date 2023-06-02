package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.RSInterface;

public class StaffInterface extends RSInterface {

    public static void build(){
        RSInterface main = addInterface(71000);

        addSpriteLoader(71001, 3324);
        addText(71002, "Player Security", ColorConstants.PURPLE, true, true, -1, 2);
        addCloseButton(71003, 71004, 71005);
    }
}
