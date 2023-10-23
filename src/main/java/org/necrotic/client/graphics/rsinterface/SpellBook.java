package org.necrotic.client.graphics.rsinterface;

import org.necrotic.client.RSInterface;
import org.necrotic.client.graphics.fonts.TextDrawingArea;

public class SpellBook extends RSInterface{

    public static void buildGlobal(TextDrawingArea[] tda) {
        int inter = 123000;
        RSInterface info = addInterface(inter);
        info.totalChildren(6);

        addHoverButtonWSpriteLoader(++inter, 2351, 18, 18, "Teleport", -1, 11002, 1);
        info.child(0, inter, 18, 13);
        addHoverButtonWSpriteLoader(++inter, 1942, 18, 18, "Teleport", -1, 11005, 1);
        info.child(1, inter, 66, 13);
        addHoverButtonWSpriteLoader(++inter, 1944, 18, 18, "Teleport", -1, 11009, 1);
        info.child(2, inter, 106, 13);
        addHoverButtonWSpriteLoader(++inter, 1940, 18, 18, "Teleport", -1, 11012, 1);
        info.child(3, inter, 149, 13);

        addSpriteLoader(++inter, 207);
        info.child(4, inter, 6, 40);

        addSpriteLoader(++inter, 207);
        info.child(5, inter, 6, 148);
    }
}
