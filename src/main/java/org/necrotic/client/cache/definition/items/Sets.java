package org.necrotic.client.cache.definition.items;

import org.necrotic.client.cache.definition.ItemDefinition;

public class Sets {

    public static ItemDefinition newDef(ItemDefinition itemDef, int id) {
        ItemDefinition itemDefs;
        switch (id) {
            /* Begginer Sets */

            /* Tier 1 */

            case 19984:
                itemDef.name = TierColor.BEGGINER.getColor() + "Blurite Helm";
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64194;
                itemDef.maleEquip1 = 64195;
                itemDef.femaleEquip1 = 64195;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 444444;
                break;
            case 19985:
                itemDef.name = TierColor.BEGGINER.getColor() + "Blurite Body";
                itemDefs = ItemDefinition.get(5575);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64196;
                itemDef.maleEquip1 = 64197;
                itemDef.femaleEquip1 = 64197;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 444444;
                break;
            case 19986:
                itemDef.name = TierColor.BEGGINER.getColor() + "Blurite Legs";
                itemDefs = ItemDefinition.get(5576);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64198;
                itemDef.maleEquip1 = 64199;
                itemDef.femaleEquip1 = 64199;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 444444;
                break;
            case 19987:
                itemDef.name = TierColor.BEGGINER.getColor() + "Blurite Shield";
                itemDefs = ItemDefinition.get(1540);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64200;
                itemDef.maleEquip1 = 64201;
                itemDef.femaleEquip1 = 64201;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 444444;
                break;

            case 19988:
                itemDef.name = TierColor.BEGGINER.getColor() + "Blurite Gloves";
                itemDefs = ItemDefinition.get(7461);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64202;
                itemDef.maleEquip1 = 64203;
                itemDef.femaleEquip1 = 64203;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 444444;
                break;
            case 19989:
                itemDef.name = TierColor.BEGGINER.getColor() + "Blurite Boots";
                itemDefs = ItemDefinition.get(7114);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64204;
                itemDef.maleEquip1 = 64204;
                itemDef.femaleEquip1 = 64204;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 444444;
                break;
            case 19991:
                itemDef.name = TierColor.BEGGINER.getColor() + "Blurite Amulet";
                itemDefs = ItemDefinition.get(295);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64205;
                itemDef.maleEquip1 = 64206;
                itemDef.femaleEquip1 = 64206;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 444444;
                break;
            case 19992:
                itemDef.name = TierColor.BEGGINER.getColor() + "Blurite Ring";
                itemDefs = ItemDefinition.get(1635);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64207;
                itemDef.maleEquip1 = 64208;
                itemDef.femaleEquip1 = 64208;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 444444;
                break;
            case 19993:
                itemDef.name = TierColor.BEGGINER.getColor() + "Blurite Scimitar";
                itemDefs = ItemDefinition.get(4587);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64209;
                itemDef.maleEquip1 = 64210;
                itemDef.femaleEquip1 = 64210;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 444444;
                break;

            case 20400:
                itemDef.name = TierColor.BEGGINER.getColor() + "Blurite Cape";
                itemDefs = ItemDefinition.get(2413);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64211;
                itemDef.maleEquip1 = 64212;
                itemDef.femaleEquip1 = 64212;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 444444;
                break;

            case 21063:
                itemDef.name = TierColor.BEGGINER.getColor() + "Nagi body";
                itemDefs = ItemDefinition.get(5575);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64196;
                itemDef.maleEquip1 = 64197;
                itemDef.femaleEquip1 = 64197;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 23662;
                break;
            case 21064:
                itemDef.name = TierColor.BEGGINER.getColor() + "Nagi legs";
                itemDefs = ItemDefinition.get(5576);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64198;
                itemDef.maleEquip1 = 64199;
                itemDef.femaleEquip1 = 64199;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 23662;
                break;
            case 21066:
                itemDef.name = TierColor.BEGGINER.getColor() + "Nagi gloves";
                itemDefs = ItemDefinition.get(7461);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64202;
                itemDef.maleEquip1 = 64203;
                itemDef.femaleEquip1 = 64203;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 23662;
                break;
            case 21067:
                itemDef.name = TierColor.BEGGINER.getColor() + "Nagi boots";
                itemDefs = ItemDefinition.get(7114);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64204;
                itemDef.maleEquip1 = 64204;
                itemDef.femaleEquip1 = 64204;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 23662;
                break;
            case 21068:
                itemDef.name = TierColor.BEGGINER.getColor() + "Nagi amulet";
                itemDefs = ItemDefinition.get(295);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64205;
                itemDef.maleEquip1 = 64206;
                itemDef.femaleEquip1 = 64206;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 23662;
                break;
            case 21069:
                itemDef.name = TierColor.BEGGINER.getColor() + "Nagi ring";
                itemDefs = ItemDefinition.get(1635);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64207;
                itemDef.maleEquip1 = 64208;
                itemDef.femaleEquip1 = 64208;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 23662;
                break;
            case 21071:
                itemDef.name = TierColor.BEGGINER.getColor() + "Nagi cape";
                itemDefs = ItemDefinition.get(2413);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = -50;
                itemDef.modelZoom = 2300;
                itemDef.rotationY = 200;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64211;
                itemDef.maleEquip1 = 64212;
                itemDef.femaleEquip1 = 64212;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 23662;
                break;
            case 5012:
                itemDef.name = TierColor.BEGGINER.getColor() + "Nagi bow";
                ItemDefinition tbow = ItemDefinition.get(1419);
                itemDef.modelID = 65324;
                itemDef.femaleEquip1 = 65325;
                itemDef.maleEquip1 = 65325;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.modelOffsetX = tbow.modelOffsetX;
                itemDef.modelOffsetY = tbow.modelOffsetY;
                itemDef.modelZoom = 2000;
                itemDef.rotationY = tbow.rotationY;
                itemDef.rotationX = tbow.rotationX;
                itemDef.stackable = false;
                break;
            case 9942:
                itemDef.name = TierColor.BEGGINER.getColor() + "Executive Staff";
                ItemDefinition execution1 = ItemDefinition.get(21777);
                itemDef.modelID = execution1.modelID;
                itemDef.femaleEquip1 = execution1.femaleEquip1;
                itemDef.maleEquip1 = execution1.maleEquip1;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.modelOffsetX = execution1.modelOffsetX;
                itemDef.modelOffsetY = execution1.modelOffsetY;
                itemDef.modelZoom = execution1.modelZoom;
                itemDef.rotationY = execution1.rotationY;
                itemDef.rotationX = execution1.rotationX;
                itemDef.stackable = false;
                itemDef.rdc2 = 85748;
                break;
            case 9939:
                itemDef.name = TierColor.BEGGINER.getColor() + "Executive cape";
                ItemDefinition execape = ItemDefinition.get(21039);
                itemDef.modelID = execape.modelID;
                itemDef.femaleEquip1 = execape.femaleEquip1;
                itemDef.maleEquip1 = execape.maleEquip1;
                itemDef.actions = execape.actions;
                itemDef.modelZoom = 3000;
                itemDef.modelOffsetX = execape.modelOffsetX;
                itemDef.modelOffsetY = execape.modelOffsetY;
                itemDef.rotationY = execape.rotationY;
                itemDef.rotationX = execape.rotationX;
                itemDef.stackable = false;
                itemDef.rdc2 = 565656;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 4684:
                itemDef.name = TierColor.BEGGINER.getColor() + "Executive helm";
                itemDef.modelID = 65272;
                itemDef.maleEquip1 = 65273;
                itemDef.femaleEquip1 = 65273;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};;
                itemDef.stackable = false;
                itemDef.rdc2 = 45341;
                break;
            case 4685:
                itemDef.name = TierColor.BEGGINER.getColor() + "Executive body";
                itemDef.modelID = 65274;
                itemDef.maleEquip1 = 65275;
                itemDef.femaleEquip1 = 65275;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 45341;
                break;
            case 4686:
                itemDef.name = TierColor.BEGGINER.getColor() + "Executive legs";
                itemDef.modelID = 65276;
                itemDef.maleEquip1 = 65277;
                itemDef.femaleEquip1 = 65277;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 45341;
                break;
            case 8273:
                itemDef.name = TierColor.BEGGINER.getColor() + "Executive gloves";
                itemDefs = ItemDefinition.get(7461);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1200;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64277;
                itemDef.maleEquip1 = 64278;
                itemDef.femaleEquip1 = 64278;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 565656;
                break;
            case 8274:
                itemDef.name = TierColor.BEGGINER.getColor() + "Executive boots";
                itemDefs = ItemDefinition.get(7114);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64279;
                itemDef.maleEquip1 = 64279;
                itemDef.femaleEquip1 = 64279;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 565656;
                break;

            /* Tier 2 */

            case 18629:
                itemDef.name = TierColor.BEGGINER.getColor() + "Imperial Staff";
                itemDef.modelID = 65294;
                itemDef.maleEquip1 = 65295;
                itemDef.femaleEquip1 = 65295;
                itemDefs = ItemDefinition.get(4755);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 20086:
                itemDef.name = TierColor.BEGGINER.getColor() + "Imperial Helm";
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64194;
                itemDef.maleEquip1 = 64195;
                itemDef.femaleEquip1 = 64195;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 44322;
                break;
            case 20087:
                itemDef.name = TierColor.BEGGINER.getColor() + "Imperial Body";
                itemDefs = ItemDefinition.get(5575);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64196;
                itemDef.maleEquip1 = 64197;
                itemDef.femaleEquip1 = 64197;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 44322;
                break;
            case 20088:
                itemDef.name = TierColor.BEGGINER.getColor() + "Imperial Legs";
                itemDefs = ItemDefinition.get(5576);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64198;
                itemDef.maleEquip1 = 64199;
                itemDef.femaleEquip1 = 64199;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 44322;
                break;

            case 20091:
                itemDef.name = TierColor.BEGGINER.getColor() + "Imperial Gloves";
                itemDefs = ItemDefinition.get(7461);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64202;
                itemDef.maleEquip1 = 64203;
                itemDef.femaleEquip1 = 64203;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 44322;
                break;
            case 20089:
                itemDef.name = TierColor.BEGGINER.getColor() + "Imperial Boots";
                itemDefs = ItemDefinition.get(7114);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64204;
                itemDef.maleEquip1 = 64204;
                itemDef.femaleEquip1 = 64204;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 44322;
                break;
            case 20092:
                itemDef.name = TierColor.BEGGINER.getColor() + "Imperial Amulet";
                itemDefs = ItemDefinition.get(295);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64205;
                itemDef.maleEquip1 = 64206;
                itemDef.femaleEquip1 = 64206;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 44322;
                break;
            case 20093:
                itemDef.name = TierColor.BEGGINER.getColor() + "Imperial Ring";
                itemDefs = ItemDefinition.get(1635);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64207;
                itemDef.maleEquip1 = 64208;
                itemDef.femaleEquip1 = 64208;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 44322;
                break;

            case 21042:
                itemDef.name = TierColor.BEGGINER.getColor() + "Unknown Helmet";
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64269;
                itemDef.maleEquip1 = 64270;
                itemDef.femaleEquip1 = 64270;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 234423;
                break;
            case 21043:
                itemDef.name = TierColor.BEGGINER.getColor() + "Unknown Body";
                itemDefs = ItemDefinition.get(5575);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64271;
                itemDef.maleEquip1 = 64272;
                itemDef.femaleEquip1 = 64272;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 234423;
                break;
            case 21044:
                itemDef.name = TierColor.BEGGINER.getColor() + "Unknown legs";
                itemDefs = ItemDefinition.get(5576);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64273;
                itemDef.maleEquip1 = 64274;
                itemDef.femaleEquip1 = 64274;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 234423;
                break;
            case 21045:
                itemDef.name = TierColor.BEGGINER.getColor() + "Unknown cape";
                itemDefs = ItemDefinition.get(1540);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 2000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64275;
                itemDef.maleEquip1 = 64276;
                itemDef.femaleEquip1 = 64276;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 234423;
                break;

            case 21046:
                itemDef.name = TierColor.BEGGINER.getColor() + "Unknown gloves";
                itemDefs = ItemDefinition.get(7461);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1200;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64277;
                itemDef.maleEquip1 = 64278;
                itemDef.femaleEquip1 = 64278;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 234423;
                break;
            case 21047:
                itemDef.name = TierColor.BEGGINER.getColor() + "Unknown boots";
                itemDefs = ItemDefinition.get(7114);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64279;
                itemDef.maleEquip1 = 64279;
                itemDef.femaleEquip1 = 64279;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 234423;
                break;
            case 19998:
                itemDef.name = TierColor.BEGGINER.getColor() + "Unknown Rapier";
                itemDefs = ItemDefinition.get(4587);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64213;
                itemDef.maleEquip1 = 64214;
                itemDef.femaleEquip1 = 64214;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 444444;
                break;

            case 21015:
                itemDef.name = TierColor.BEGGINER.getColor() + "Turtle Helmet";
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64227;
                itemDef.maleEquip1 = 64228;
                itemDef.femaleEquip1 = 64228;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 987654;
                break;
            case 21016:
                itemDef.name = TierColor.BEGGINER.getColor() + "Turtle Body";
                itemDefs = ItemDefinition.get(5575);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64229;
                itemDef.maleEquip1 = 64230;
                itemDef.femaleEquip1 = 64230;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 987654;
                break;
            case 21017:
                itemDef.name = TierColor.BEGGINER.getColor() + "Turtle Legs";
                itemDefs = ItemDefinition.get(5576);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64231;
                itemDef.maleEquip1 = 64232;
                itemDef.femaleEquip1 = 64232;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.rdc2 = 987654;
                break;
            case 21018:
                itemDef.name = TierColor.BEGGINER.getColor() + "Turtle Bow";
                itemDef.modelID = 64233;
                itemDef.maleEquip1 = 64234;
                itemDef.femaleEquip1 = 64234;
                itemDefs = ItemDefinition.get(4755);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 987654;
                break;

            /* Tier 3 */

            case 21036:
                itemDef.name = TierColor.BEGGINER.getColor() + "Tormented helm";
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64269;
                itemDef.maleEquip1 = 64270;
                itemDef.femaleEquip1 = 64270;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 21037:
                itemDef.name = TierColor.BEGGINER.getColor() + "Tormented body";
                itemDefs = ItemDefinition.get(5575);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64271;
                itemDef.maleEquip1 = 64272;
                itemDef.femaleEquip1 = 64272;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 21038:
                itemDef.name = TierColor.BEGGINER.getColor() + "Tormented legs";
                itemDefs = ItemDefinition.get(5576);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64273;
                itemDef.maleEquip1 = 64274;
                itemDef.femaleEquip1 = 64274;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 21039:
                itemDef.name = TierColor.BEGGINER.getColor() + "Tormented cape";
                itemDefs = ItemDefinition.get(1540);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 2000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64275;
                itemDef.maleEquip1 = 64276;
                itemDef.femaleEquip1 = 64276;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            case 21040:
                itemDef.name = TierColor.BEGGINER.getColor() + "Tormented gloves";
                itemDefs = ItemDefinition.get(7461);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1200;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64277;
                itemDef.maleEquip1 = 64278;
                itemDef.femaleEquip1 = 64278;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 21041:
                itemDef.name = TierColor.BEGGINER.getColor() + "Tormented boots";
                itemDefs = ItemDefinition.get(7114);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64279;
                itemDef.maleEquip1 = 64279;
                itemDef.femaleEquip1 = 64279;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 8088:
                itemDef.name = "Tormented Crossbow";
                itemDef.modelID = 64358;
                itemDef.maleEquip1 = 64359;
                itemDef.femaleEquip1 = 64359;
                itemDefs = ItemDefinition.get(9185);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1700;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;

                itemDef.rdc2 = 654332;
                break;

            /* Stage 2 */

            /* Tier 4 */

            case 17999:
                itemDef.name = TierColor.NOVICE.getColor() + "Revenant Helmet";
                itemDef.modelID = 65498;
                itemDef.maleEquip1 = 65499;
                itemDef.femaleEquip1 = 65499;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 8239113;
                break;

            case 18001:
                itemDef.name = TierColor.NOVICE.getColor() + "Revenant Body";
                itemDef.modelID = 65500;
                itemDef.maleEquip1 = 65501;
                itemDef.femaleEquip1 = 65501;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 8239113;
                break;

            case 18003:
                itemDef.name = TierColor.NOVICE.getColor() + "Revenant Legs";
                itemDef.modelID = 65502;
                itemDef.maleEquip1 = 65503;
                itemDef.femaleEquip1 = 65503;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 8239113;
                break;
            case 18005:
                itemDef.name = TierColor.NOVICE.getColor() + "Revenant Wings";
                itemDef.modelID = 65504;
                itemDef.maleEquip1 = 65505;
                itemDef.femaleEquip1 = 65505;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 8239113;
                break;
            case 18009:
                itemDef.name = TierColor.NOVICE.getColor() + "Revenant Boots";
                itemDef.modelID = 65508;
                itemDef.maleEquip1 = 65508;
                itemDef.femaleEquip1 = 65508;
                itemDefs = ItemDefinition.get(11732);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 8239113;
                break;

            case 17011:
                itemDef.name = TierColor.NOVICE.getColor() + "Revenant Staff";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

//            case 17013:
//                itemDef.name = TierColor.NOVICE.getColor() + "Revenant Staff";
//                itemDef.actions = new String[5];
//                itemDef.actions[1] = "Wear"/*done*/; //done
//                itemDef.actions[2] = "Dissolve";
//                itemDef.actions[4] = "Drop";
//                itemDef.modelID = 99513;
//                itemDef.maleEquip1 = 99506;
//                itemDef.femaleEquip1 = 99506;
//                itemDef.rdc2 = 888833;
//				break;

            /* Tier 5 */
            case 23050:
                itemDef.copyItem(4708);
                itemDef.name = TierColor.NOVICE.getColor() +"Freeflow helm";
                itemDef.modelZoom = 1000;
                itemDef.modelID = 100129;
                itemDef.maleEquip1 = 100130;
                itemDef.femaleEquip1 = 100130;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23051:
                itemDef.copyItem(4712);
                itemDef.name = TierColor.NOVICE.getColor() +"Freeflow body";
                itemDef.modelZoom = 1500;
                itemDef.modelID = 100131;
                itemDef.maleEquip1 = 100132;
                itemDef.femaleEquip1 = 100132;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23052:
                itemDef.copyItem(4714);
                itemDef.name = TierColor.NOVICE.getColor() +"Freeflow legs";
                itemDef.modelZoom = 1800;
                itemDef.modelID = 100133;
                itemDef.maleEquip1 = 100134;
                itemDef.femaleEquip1 = 100134;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23053:
                itemDef.copyItem(4708);
                itemDef.name = TierColor.NOVICE.getColor() +"Freeflow gloves";
                itemDef.modelID = 100135;
                itemDef.modelZoom = 1000;
                itemDef.maleEquip1 = 100136;
                itemDef.femaleEquip1 = 100136;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23054:
                itemDef.copyItem(4708);
                itemDef.name = TierColor.NOVICE.getColor() +"Freeflow boots";
                itemDef.modelID = 100137;
                itemDef.maleEquip1 = 100137;
                itemDef.femaleEquip1 = 100137;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23055:
                itemDef.copyItem(4710);
                itemDef.name = TierColor.NOVICE.getColor() +"Freeflow sword";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 1024;
                itemDef.rotationY = 525;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                itemDef.modelID = 100138;
                itemDef.maleEquip1 = 100139;
                itemDef.femaleEquip1 = 100139;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23056:
                itemDef.copyItem(4710);
                itemDef.name = TierColor.NOVICE.getColor() +"Freeflow shield";
                itemDef.modelID = 100140;
                itemDef.maleEquip1 = 100141;
                itemDef.femaleEquip1 = 100141;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            /* Stage 3 */

            /* Tier 6 */
            case 23075:
                itemDef.copyItem(13263);
                itemDef.name = TierColor.INTER.getColor() +"Soldier helm";
                itemDef.modelID = 100178;
                itemDef.maleEquip1 = 100179;
                itemDef.femaleEquip1 = 100179;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23076:
                itemDef.copyItem(4712);
                itemDef.name = TierColor.INTER.getColor() +"Soldier body";
                itemDef.modelZoom = 1500;
                itemDef.modelID = 100180;
                itemDef.maleEquip1 = 100181;
                itemDef.femaleEquip1 = 100181;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23077:
                itemDef.copyItem(4714);
                itemDef.name = TierColor.INTER.getColor() +"Soldier legs";
                itemDef.modelZoom = 1800;
                itemDef.modelID = 100182;
                itemDef.maleEquip1 = 100183;
                itemDef.femaleEquip1 = 100183;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23079:
                itemDef.copyItem(4710);
                itemDef.name = TierColor.INTER.getColor() +"Soldier sword";
                itemDef.modelZoom = 2400;
                itemDef.rotationX = 1200;
                itemDef.rotationY = 520;
                itemDef.modelOffsetX = -10;
                itemDef.modelOffsetY = -10;
                itemDef.modelID = 100186;
                itemDef.maleEquip1 = 100187;
                itemDef.femaleEquip1 = 100187;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23080:
                itemDef.copyItem(4710);
                itemDef.name = TierColor.INTER.getColor() +"Soldier Sword Off-Hand";
                itemDef.modelZoom = 2400;
                itemDef.rotationX = 200;
                itemDef.rotationY = 520;
                itemDef.modelOffsetX = 10;
                itemDef.modelOffsetY = 10;
                itemDef.modelID = 100186;
                itemDef.maleEquip1 = 100188;
                itemDef.femaleEquip1 = 100188;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            /* Tier 7 */
            case 23127:
                itemDef.copyItem(4708);
                itemDef.name = TierColor.INTER.getColor() +"Mystical helm";
                itemDef.modelID = 100264;
                itemDef.maleEquip1 = 15166;
                itemDef.femaleEquip1 = 15166;
                itemDef.modelZoom = 800;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23128:
                itemDef.copyItem(4712);
                itemDef.name = TierColor.INTER.getColor() +"Mystical body";
                itemDef.modelID = 100259;
                itemDef.maleEquip1 = 15168;
                itemDef.femaleEquip1 = 15168;
                itemDef.modelZoom = 1500;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23129:
                itemDef.copyItem(4714);
                itemDef.name = TierColor.INTER.getColor() +"Mystical legs";
                itemDef.modelID = 100266;
                itemDef.maleEquip1 = 15167;
                itemDef.femaleEquip1 = 15167;
                itemDef.modelZoom = 1800;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23130:
                itemDef.copyItem(4708);
                itemDef.name = TierColor.INTER.getColor() +"Mystical gloves";
                itemDef.modelID = 100262;
                itemDef.maleEquip1 = 15170;
                itemDef.femaleEquip1 = 15170;
                itemDef.modelZoom = 700;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23131:
                itemDef.copyItem(4708);
                itemDef.name = TierColor.INTER.getColor() +"Mystical boots";
                itemDef.modelID = 100261;
                itemDef.maleEquip1 = 15169;
                itemDef.femaleEquip1 = 15169;
                itemDef.modelZoom = 700;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23133:
                itemDef.copyItem(669);
                itemDef.name = TierColor.INTER.getColor() +"Mystical wings";
                itemDef.modelID = 100270;
                itemDef.maleEquip1 = 15172;
                itemDef.femaleEquip1 = 15172;
                itemDef.modelZoom = 2300;
                itemDef.rotationX = 1050;
                itemDef.rotationY = 525;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 25;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            case 14924:
                itemDef.name = TierColor.INTER.getColor()+"Mystical Staff";
                itemDefs = ItemDefinition.get(18667);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelID = itemDefs.modelID;
                itemDef.maleEquip1 = itemDefs.maleEquip1;
                itemDef.femaleEquip1 = itemDefs.femaleEquip1;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            /* Tier 8 */
            case 23134:
                itemDef.copyItem(4708);
                itemDef.name = TierColor.INTER.getColor() +"Sacred helm";
                itemDef.modelID = 100279;
                itemDef.maleEquip1 = 100280;
                itemDef.femaleEquip1 = 100280;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.modelZoom = 800;
                break;
            case 23135:
                itemDef.copyItem(4712);
                itemDef.name = TierColor.INTER.getColor() +"Sacred body";
                itemDef.modelID = 100272;
                itemDef.maleEquip1 = 100273;
                itemDef.femaleEquip1 = 100273;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.modelZoom = 1500;
                break;
            case 23136:
                itemDef.copyItem(4714);
                itemDef.name = TierColor.INTER.getColor() +"Sacred legs";
                itemDef.modelID = 100277;
                itemDef.maleEquip1 = 100278;
                itemDef.femaleEquip1 = 100278;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.modelZoom = 1800;
                break;
            case 23137:
                itemDef.copyItem(4708);
                itemDef.name = TierColor.INTER.getColor() +"Sacred gloves";
                itemDef.modelID = 100275;
                itemDef.maleEquip1 = 100276;
                itemDef.femaleEquip1 = 100276;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.modelZoom = 700;
                break;
            case 23138:
                itemDef.copyItem(4708);
                itemDef.name = TierColor.INTER.getColor() +"Sacred boots";
                itemDef.modelID = 100274;
                itemDef.maleEquip1 = 100274;
                itemDef.femaleEquip1 = 100274;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.modelZoom = 700;
                break;
            case 14919:
                itemDef.name = TierColor.INTER.getColor() +"Sacred crossbow";
                itemDefs = ItemDefinition.get(14684);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelID = itemDefs.modelID;
                itemDef.maleEquip1 = itemDefs.maleEquip1;
                itemDef.femaleEquip1 = itemDefs.femaleEquip1;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
				break;

            /* Tier 9 */
            case 17720:
                itemDef.name = TierColor.INTER.getColor() +"Ruthless sword";
                itemDef.modelID = 64075;
                itemDef.maleEquip1 = 64076;
                itemDef.femaleEquip1 = 64076;
                itemDefs = ItemDefinition.get(1311);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
				break;
            case 23139:
                itemDef.copyItem(4708);
                itemDef.name = TierColor.INTER.getColor() +"Ruthless helm";
                itemDef.modelID = 100289;
                itemDef.maleEquip1 = 100290;
                itemDef.femaleEquip1 = 100290;
                itemDef.modelZoom = 900;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23140:
                itemDef.copyItem(4712);
                itemDef.name = TierColor.INTER.getColor() +"Ruthless body";
                itemDef.modelID = 100293;
                itemDef.maleEquip1 = 100294;
                itemDef.femaleEquip1 = 100294;
                itemDef.modelZoom = 1500;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23141:
                itemDef.copyItem(4714);
                itemDef.name = TierColor.INTER.getColor() +"Ruthless legs";
                itemDef.modelID = 100291;
                itemDef.maleEquip1 = 100292;
                itemDef.femaleEquip1 = 100292;
                itemDef.modelZoom = 1800;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23142:
                itemDef.copyItem(4708);
                itemDef.name = TierColor.INTER.getColor() +"Ruthless gloves";
                itemDef.modelID = 100287;
                itemDef.maleEquip1 = 100288;
                itemDef.femaleEquip1 = 100288;
                itemDef.modelZoom = 700;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23143:
                itemDef.copyItem(4708);
                itemDef.name = TierColor.INTER.getColor() +"Ruthless boots";
                itemDef.modelID = 100286;
                itemDef.maleEquip1 = 100286;
                itemDef.femaleEquip1 = 100286;
                itemDef.modelZoom = 700;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            /* Tier 10 */
            case 8816:
                itemDef.name = TierColor.INTER.getColor() +"Antique helm";
                itemDef.modelID = 65354;
                itemDef.maleEquip1 = 65355;
                itemDef.femaleEquip1 = 65355;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.editedModelColor = new int[1];
                itemDef.newModelColor = new int[1];
                itemDef.newModelColor[0] = 57;
                itemDef.editedModelColor[0] = 65;
                break;
            case 8817:
                itemDef.name = TierColor.INTER.getColor() +"Antique Body";
                itemDef.modelID = 65356;
                itemDef.maleEquip1 = 65357;
                itemDef.femaleEquip1 = 65357;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.editedModelColor = new int[1];
                itemDef.newModelColor = new int[1];
                itemDef.newModelColor[0] = 57;
                itemDef.editedModelColor[0] = 65;
                break;

            case 8818:
                itemDef.name = TierColor.INTER.getColor() +"Antique Legs";
                itemDef.modelID = 65358;
                itemDef.maleEquip1 = 65359;
                itemDef.femaleEquip1 = 65359;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.editedModelColor = new int[1];
                itemDef.newModelColor = new int[1];
                itemDef.newModelColor[0] = 57;
                itemDef.editedModelColor[0] = 65;
                break;
            case 23144:
                itemDef.copyItem(4710);
                itemDef.name = TierColor.INTER.getColor() +"Antique bow";
                itemDef.modelID = 100295;
                itemDef.maleEquip1 = 100296;
                itemDef.femaleEquip1 = 100296;
                itemDef.modelZoom = 2300;
                itemDef.rotationX = 1100;
                itemDef.rotationY = 450;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23145:
                itemDef.copyItem(4710);
                itemDef.name = TierColor.INTER.getColor() +"Antique staff";
                itemDef.modelID = 100297;
                itemDef.maleEquip1 = 100298;
                itemDef.femaleEquip1 = 100298;
                itemDef.modelZoom = 2600;
                itemDef.rotationX = 1100;
                itemDef.rotationY = 400;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23146:
                itemDef.copyItem(4710);
                itemDef.name = TierColor.INTER.getColor() +"Antique sword";
                itemDef.modelID = 100299;
                itemDef.maleEquip1 = 100300;
                itemDef.femaleEquip1 = 100300;
                itemDef.modelZoom = 1500;
                itemDef.rotationX = 1100;
                itemDef.rotationY = 525;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
                
                /* Stage 4 */
            
            /* Tier 11 */
            case 14018:
                itemDef.modelID = 6277;
                itemDef.name = TierColor.ADVANCED.getColor() +"Malvek Katana";
                itemDef.modelZoom = 2025;
                itemDef.rotationY = 593;
                itemDef.rotationX = 2040;
                itemDef.modelOffsetX = 5;
                itemDef.modelOffsetY = 1;
                itemDef.value = 50000;
                itemDef.membersObject = true;
                itemDef.maleEquip1 = 5324;
                itemDef.femaleEquip1 = 5324;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 19160:
                itemDef.name = TierColor.ADVANCED.getColor() +"Malvek helm";
                itemDef.modelID = 65260;
                itemDef.maleEquip1 = 65261;
                itemDef.femaleEquip1 = 65261;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 73533;
                break;
            case 19159:
                itemDef.name = TierColor.ADVANCED.getColor() +"Malvek body";
                itemDef.modelID = 65262;
                itemDef.maleEquip1 = 65263;
                itemDef.femaleEquip1 = 65263;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 73533;
                break;
            case 19158:
                itemDef.name = TierColor.ADVANCED.getColor() +"Malvek legs";
                itemDef.modelID = 65264;
                itemDef.maleEquip1 = 65265;
                itemDef.femaleEquip1 = 65265;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 73533;
                break;
//            case 11320:
//                itemDef.name = TierColor.ADVANCED.getColor() +"Cordial helm";
//                itemDef.modelID = 99851;
//                itemDef.maleEquip1 = 99852;
//                itemDef.femaleEquip1 = 99852;
//                itemDefs = ItemDefinition.get(4882);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                itemDef.newModelColor = new int[]{40};
//                itemDef.editedModelColor = new int[]{52};
//                break;
//            case 11321:
//                itemDef.name = TierColor.ADVANCED.getColor() +"Cordial body";
//                itemDef.modelID = 99849;
//                itemDef.maleEquip1 = 99850;
//                itemDef.femaleEquip1 = 99850;
//                itemDefs = ItemDefinition.get(4894);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                itemDef.newModelColor = new int[]{40};
//                itemDef.editedModelColor = new int[]{52};
//                break;
//            case 11322:
//                itemDef.name = TierColor.ADVANCED.getColor() +"Cordial legs";
//                itemDef.modelID = 99848;
//                itemDef.maleEquip1 = 99847;
//                itemDef.femaleEquip1 = 99847;
//                itemDefs = ItemDefinition.get(4900);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                itemDef.newModelColor = new int[]{40};
//                itemDef.editedModelColor = new int[]{52};
//                break;
//            case 23132:
//                itemDef.copyItem(4710);
//                itemDef.name = TierColor.INTER.getColor() +"Cordial scythe";
//                itemDef.modelID = 100268;
//                itemDef.maleEquip1 = 15171;
//                itemDef.femaleEquip1 = 15171;
//                itemDef.modelZoom = 3000;
//                itemDef.rotationX = 1024;
//                itemDef.rotationY = 525;
//                itemDef.modelOffsetX = -5;
//                itemDef.rotationZ = 0;
//                itemDef.modelOffsetY = -5;
//                break;
            case 11340:
                itemDef.name = TierColor.ADVANCED.getColor() +"Deviant halo";
                itemDef.modelID = 96120;
                itemDef.maleEquip1 = 96121;
                itemDef.femaleEquip1 = 96121;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 19518;
                break;
            case 11341:
                itemDef.name = TierColor.ADVANCED.getColor() +"Deviant body";
                itemDef.modelID = 96122;
                itemDef.maleEquip1 = 96123;
                itemDef.femaleEquip1 = 96123;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 19518;
                break;
            case 11342:
                itemDef.name = TierColor.ADVANCED.getColor() +"Deviant legs";
                itemDef.modelID = 96124;
                itemDef.maleEquip1 = 96125;
                itemDef.femaleEquip1 = 96125;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 19518;
                break;
            case 8001:
                itemDef.name = TierColor.ADVANCED.getColor() +"Deviant Crossbow";
                itemDef.modelID = 64495;
                itemDef.maleEquip1 = 64496;
                itemDef.femaleEquip1 = 64496;
                itemDefs = ItemDefinition.get(9185);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1700;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 11421:
                itemDef.name = TierColor.ADVANCED.getColor() +"Belligerent helm";
                itemDef.modelID = 96321;
                itemDef.maleEquip1 = 96322;
                itemDef.femaleEquip1 = 96322;
                itemDef.modelOffsetX = 10;
                itemDef.modelOffsetY = 20;
                itemDef.modelZoom = 900;
                itemDef.rotationY = 200;
                itemDef.rotationX = 500;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{40};
                itemDef.editedModelColor = new int[]{51};
                break;
            case 11422:
                itemDef.name = TierColor.ADVANCED.getColor() +"Belligerent body";
                itemDef.modelID = 96323;
                itemDef.maleEquip1 = 96324;
                itemDef.femaleEquip1 = 96324;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{40};
                itemDef.editedModelColor = new int[]{51};
                break;
            case 11423:
                itemDef.name = TierColor.ADVANCED.getColor() +"Belligerent legs";
                itemDef.modelID = 96325;
                itemDef.maleEquip1 = 96326;
                itemDef.femaleEquip1 = 96326;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{40};
                itemDef.editedModelColor = new int[]{51};
                break;
            case 17600:
                itemDef.name = TierColor.ADVANCED.getColor() +"Belligerent staff";
                itemDef.modelID = 65486;
                itemDef.maleEquip1 = 65487;
                itemDef.femaleEquip1 = 65487;
                itemDefs = ItemDefinition.get(4158);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 222222;
                break;

            /* Tier 12 */

            case 15115:
                itemDef.name = TierColor.ADVANCED.getColor() +"Extreme helm";
                itemDef.modelID = 65192;
                itemDef.maleEquip1 = 65193;
                itemDef.femaleEquip1 = 65193;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 88205;
                break;
            case 15116:
                itemDef.name = TierColor.ADVANCED.getColor() +"Extreme body";
                itemDef.modelID = 65194;
                itemDef.maleEquip1 = 65195;
                itemDef.femaleEquip1 = 65195;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 88205;
                break;
            case 15117:
                itemDef.name = TierColor.ADVANCED.getColor() +"Extreme legs";
                itemDef.modelID = 65196;
                itemDef.maleEquip1 = 65197;
                itemDef.femaleEquip1 = 65197;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 88205;
                break;
            case 15118:
                itemDef.name = TierColor.ADVANCED.getColor() +"Extreme gloves";
                itemDef.modelID = 65198;
                itemDef.maleEquip1 = 65199;
                itemDef.femaleEquip1 = 65199;
                itemDefs = ItemDefinition.get(7462);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 88205;
                break;
            case 15119:
                itemDef.name = TierColor.ADVANCED.getColor() +"Extreme boots";
                itemDef.modelID = 65200;
                itemDef.maleEquip1 = 65200;
                itemDef.femaleEquip1 = 65200;
                itemDefs = ItemDefinition.get(3791);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                //	itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 88205;
                break;
            case 26:
                itemDef.name = TierColor.ADVANCED.getColor() +"Extreme Wings";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 15121:
                itemDef.name = TierColor.ADVANCED.getColor() +"Extreme spear";
                itemDef.modelID = 65201;
                itemDef.maleEquip1 = 65202;
                itemDef.femaleEquip1 = 65202;
                itemDefs = ItemDefinition.get(1237);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 88205;
                break;

            case 14056:
                itemDef.name = TierColor.ADVANCED.getColor() +"Cleric Bow";
                itemDef.modelID = 64358;
                itemDef.maleEquip1 = 64359;
                itemDef.femaleEquip1 = 64359;
                itemDefs = ItemDefinition.get(9185);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1700;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            case 20060:
                itemDef.name = TierColor.ADVANCED.getColor() +"Cleric helm";
                itemDef.modelID = 65385;
                itemDef.maleEquip1 = 65386;
                itemDef.femaleEquip1 = 65386;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{52};
                itemDef.editedModelColor = new int[]{88};
                break;
            case 20062:
                itemDef.name = TierColor.ADVANCED.getColor() +"Cleric body";
                itemDef.modelID = 65387;
                itemDef.maleEquip1 = 65388;
                itemDef.femaleEquip1 = 65388;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{52};
                itemDef.editedModelColor = new int[]{88};
                break;
            case 20063:
                itemDef.name = TierColor.ADVANCED.getColor() +"Cleric legs";
                itemDef.modelID = 65389;
                itemDef.maleEquip1 = 65390;
                itemDef.femaleEquip1 = 65390;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{52};
                itemDef.editedModelColor = new int[]{88};
                break;
            case 20073:
                itemDef.name = TierColor.ADVANCED.getColor() +"Cleric boots";
                itemDefs = ItemDefinition.get(7114);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64177;
                itemDef.maleEquip1 = 64178;
                itemDef.femaleEquip1 = 64178;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            case 19800:
                itemDef.name = TierColor.ADVANCED.getColor() +"Cleric Teddybear";
                itemDef.modelID = 64034;
                itemDef.maleEquip1 = 64035;
                itemDef.femaleEquip1 = 64035;
                itemDefs = ItemDefinition.get(8848);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

//            case 19331:
//                itemDef.name = TierColor.ADVANCED.getColor() +"Godly staff";
//                itemDefs = ItemDefinition.get(15486);
//                itemDef.modelID = itemDefs.modelID;
//                itemDef.maleEquip1 = itemDefs.maleEquip1;
//                itemDef.femaleEquip1 = itemDefs.femaleEquip1;
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                itemDef.rdc2 = 7792950;
//                break;
//
//            case 14050:
//                itemDef.name = TierColor.ADVANCED.getColor() +"Godly helm";
//                itemDef.modelID = 65385;
//                itemDef.maleEquip1 = 65386;
//                itemDef.femaleEquip1 = 65386;
//                itemDefs = ItemDefinition.get(4882);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                itemDef.newModelColor = new int[]{52};
//                itemDef.editedModelColor = new int[]{91};
//                break;
//            case 14051:
//                itemDef.name = TierColor.ADVANCED.getColor() +"Godly body";
//                itemDef.modelID = 65387;
//                itemDef.maleEquip1 = 65388;
//                itemDef.femaleEquip1 = 65388;
//                itemDefs = ItemDefinition.get(4894);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                //	itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                itemDef.newModelColor = new int[]{52};
//                itemDef.editedModelColor = new int[]{91};
//                break;
//            case 14052:
//                itemDef.name = TierColor.ADVANCED.getColor() +"Godly Legs";
//                itemDef.modelID = 65389;
//                itemDef.maleEquip1 = 65390;
//                itemDef.femaleEquip1 = 65390;
//                itemDefs = ItemDefinition.get(4900);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                itemDef.newModelColor = new int[]{52};
//                itemDef.editedModelColor = new int[]{91};
//                break;

            case 22135:
                itemDef.name = "Solar Staff";
                itemDef.modelID = 139_778;
                itemDef.maleEquip1 = 139_779;
                itemDef.femaleEquip1 = 139_779;
                ItemDefinition def443 = ItemDefinition.get(1385);
                itemDef.modelOffsetX = def443.modelOffsetX;
                itemDef.modelOffsetY = def443.modelOffsetY;
                itemDef.modelZoom = 1900;
                itemDef.rotationY = def443.rotationY;
                itemDef.rotationX = def443.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 15645:
                itemDef.name = "Solar helm";
                itemDef.modelID = 99922;
                itemDef.maleEquip1 = 99923;
                itemDef.femaleEquip1 = 99923;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{55};
                itemDef.editedModelColor = new int[]{61};
                break;
            case 15646:
                itemDef.name = "Solar body";
                itemDef.modelID = 99920;
                itemDef.maleEquip1 = 99921;
                itemDef.femaleEquip1 = 99921;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{55};
                itemDef.editedModelColor = new int[]{61};
                break;

            case 15647:
                itemDef.name = "Solar legs";
                itemDef.modelID = 99924;
                itemDef.maleEquip1 = 99925;
                itemDef.femaleEquip1 = 99925;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{55};
                itemDef.editedModelColor = new int[]{61};
                break;
            /* Tier 13 */

            case 22152:
                itemDef.name = "Agumon Head";
                itemDef.modelID = 139_862;
                itemDef.maleEquip1 = 139_854;
                itemDef.femaleEquip1 = 139_854;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 22153:
                itemDef.name = "Agumon Body";
                itemDef.modelID = 139_860;
                itemDef.maleEquip1 = 139_851;
                itemDef.femaleEquip1 = 139_851;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 22154:
                itemDef.name = "Agumon Legs";
                itemDef.modelID = 139_863;
                itemDef.maleEquip1 = 139_855;
                itemDef.femaleEquip1 = 139_855;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 22155:
                itemDef.name = "Agumon Bow";
                itemDef.modelID = 139_864;
                itemDef.maleEquip1 = 139_857;
                itemDef.femaleEquip1 = 139_857;
                itemDefs = ItemDefinition.get(1419);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 22156:
                itemDef.name = "Agumon Scythe";
                itemDef.modelID = 139_865;
                itemDef.maleEquip1 = 139_858;
                itemDef.femaleEquip1 = 139_858;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 22157:
                itemDef.name = "Agumon Staff";
                itemDef.modelID = 139_866;
                itemDef.maleEquip1 = 139_859;
                itemDef.femaleEquip1 = 139_859;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 22158:
                itemDef.name = "Agumon Boots";
                itemDef.modelID = 139_852;
                itemDef.maleEquip1 = 139_852;
                itemDef.femaleEquip1 = 139_852;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                //itemDef.rdc = 3252;
                break;
            case 22159:
                itemDef.name = "Agumon Gloves";
                itemDef.modelID = 139_861;
                itemDef.femaleEquip1 = 139_853;
                itemDef.maleEquip1 = 139_853;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                //itemDef.rdc = 32521;
                break;

//            case 3740:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Yogi helm";
//                itemDef.modelID = 64401;
//                itemDef.maleEquip1 = 64402;
//                itemDef.femaleEquip1 = 64402;
//                itemDefs = ItemDefinition.get(4882);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                itemDef.rdc2 = 23453;
//                break;
//            case 3741:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Yogi body";
//                itemDef.modelID = 64403;
//                itemDef.maleEquip1 = 64404;
//                itemDef.femaleEquip1 = 64404;
//                itemDefs = ItemDefinition.get(4894);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                itemDef.rdc2 = 23453;
//                break;
//            case 3742:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Yogi legs";
//                itemDef.modelID = 64405;
//                itemDef.maleEquip1 = 64406;
//                itemDef.femaleEquip1 = 64406;
//                itemDefs = ItemDefinition.get(4900);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                itemDef.rdc2 = 23453;
//                break;
//            case 3744:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Yogi Bow";
//                itemDefs = ItemDefinition.get(859);
//                itemDef.modelID = 64397;
//                itemDef.femaleEquip1 = 64398;
//                itemDef.maleEquip1 = 64398;
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.stackable = false;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.rdc2 = 23453;
//                break;
//            case 3745:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Yogi Staff";
//                itemDefs = ItemDefinition.get(4675);
//                itemDef.modelID = 64399;
//                itemDef.femaleEquip1 = 64400;
//                itemDef.maleEquip1 = 64400;
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.stackable = false;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.rdc2 = 23453;
//                break;

            /* Tier 14 */

//            case 3720:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Scarlet helm";
//                itemDef.modelID = 64407;
//                itemDef.maleEquip1 = 64408;
//                itemDef.femaleEquip1 = 64408;
//                itemDefs = ItemDefinition.get(4882);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                break;
//            case 3721:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Scarlet body";
//                itemDef.modelID = 64409;
//                itemDef.maleEquip1 = 64410;
//                itemDef.femaleEquip1 = 64410;
//                itemDefs = ItemDefinition.get(4894);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                break;
//            case 3722:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Scarlet legs";
//                itemDef.modelID = 64411;
//                itemDef.maleEquip1 = 64412;
//                itemDef.femaleEquip1 = 64412;
//                itemDefs = ItemDefinition.get(4900);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                break;
//
//            case 3737:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Scarlet Sword";
//                itemDefs = ItemDefinition.get(4587);
//                itemDef.modelID = 64395;
//                itemDef.femaleEquip1 = 64396;
//                itemDef.maleEquip1 = 64396;
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.stackable = false;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;

            case 4075:
                itemDef.name = "Yasuda Head";
                itemDef.modelID = 141180;
                itemDef.maleEquip1 = 140838;
                itemDef.femaleEquip1 = 140838;
                itemDefs = ItemDefinition.get(4708);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 800;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 4077:
                itemDef.name = "Yasuda Body";
                itemDef.modelID = 141181;
                itemDef.maleEquip1 = 140839;
                itemDef.femaleEquip1 = 140839;
                itemDefs = ItemDefinition.get(17616);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1500;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 3473:
                itemDef.name = "Yasuda Legs";
                itemDef.modelID = 141182;
                itemDef.maleEquip1 = 140840;
                itemDef.femaleEquip1 = 140840;
                itemDefs = ItemDefinition.get(17618);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1500;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                //itemDef.rdc2 = 654332;
                break;
            case 4083:
                itemDef.name = "Yasuda Boots";
                itemDef.modelID = 141183;
                itemDef.maleEquip1 = 140841;
                itemDef.femaleEquip1 = 140841;
                itemDefs = ItemDefinition.get(4708);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 4085:
                itemDef.name = "Yasuda Gloves";
                itemDef.modelID = 141184;
                itemDef.maleEquip1 = 140842;
                itemDef.femaleEquip1 = 140842;
                itemDefs = ItemDefinition.get(4708);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 3470:
                itemDef.name = "Yasuda Wings";
                itemDef.modelID = 141185;
                itemDef.maleEquip1 = 140843;
                itemDef.femaleEquip1 = 140843;
                itemDefs = ItemDefinition.get(4708);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1100;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                //itemDef.rdc2 = 654332;
                break;
            case 3472:
                itemDef.name = "Yasuda Scythe";
                itemDef.modelID = 141186;
                itemDef.maleEquip1 = 140844;
                itemDef.femaleEquip1 = 140844;
                itemDefs = ItemDefinition.get(4055);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1750;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 4066:
                itemDef.name = "Fazula Head";
                itemDef.modelID = 141170;
                itemDef.maleEquip1 = 140831;
                itemDef.femaleEquip1 = 140831;
                itemDefs = ItemDefinition.get(4708);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 800;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                //itemDef.rdc2 = 654332;
                break;
            case 4067:
                itemDef.name = "Fazula Body";
                itemDef.modelID = 141171;
                itemDef.maleEquip1 = 140832;
                itemDef.femaleEquip1 = 140832;
                itemDefs = ItemDefinition.get(17616);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1500;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                //itemDef.rdc2 = 654332;
                break;
            case 4068:
                itemDef.name = "Fazula Legs";
                itemDef.modelID = 141172;
                itemDef.maleEquip1 = 140833;
                itemDef.femaleEquip1 = 140833;
                itemDefs = ItemDefinition.get(17618);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1500;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                //itemDef.rdc2 = 654332;
                break;
            case 4069:
                itemDef.name = "Fazula Boots";
                itemDef.modelID = 141173;
                itemDef.maleEquip1 = 140834;
                itemDef.femaleEquip1 = 140834;
                itemDefs = ItemDefinition.get(4708);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                //itemDef.rdc2 = 654332;
                break;
            case 4070:
                itemDef.name = "Fazula Gloves";
                itemDef.modelID = 141174;
                itemDef.maleEquip1 = 140835;
                itemDef.femaleEquip1 = 140835;
                itemDefs = ItemDefinition.get(4708);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1500;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                //itemDef.rdc2 = 654332;
                break;
            case 4071:
                itemDef.name = "Fazula Staff";
                itemDef.modelID = 141175;
                itemDef.maleEquip1 = 140836;
                itemDef.femaleEquip1 = 140836;
                itemDefs = ItemDefinition.get(4708);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1100;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                //itemDef.rdc2 = 654332;
                break;
            case 4072:
                itemDef.name = "Fazula Book";
                itemDef.modelID = 141176;
                itemDef.maleEquip1 = 140837;
                itemDef.femaleEquip1 = 140837;
                itemDefs = ItemDefinition.get(4055);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1500;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                //itemDef.rdc2 = 654332;
                break;

//            case 3739:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Azure Staff";
//                itemDefs = ItemDefinition.get(4675);
//                itemDef.modelID = 64399;
//                itemDef.femaleEquip1 = 64400;
//                itemDef.maleEquip1 = 64400;
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.stackable = false;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                break;
//            case 3726:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Azure Helmet";
//                itemDef.modelID = 64419;
//                itemDef.maleEquip1 = 64420;
//                itemDef.femaleEquip1 = 64420;
//                itemDefs = ItemDefinition.get(4882);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                break;
//            case 3728:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Azure body";
//                itemDef.modelID = 64421;
//                itemDef.maleEquip1 = 64422;
//                itemDef.femaleEquip1 = 64422;
//                itemDefs = ItemDefinition.get(4894);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                break;
//            case 3730:
//                itemDef.name = TierColor.UNCOMMON.getColor() +"Azure legs";
//                itemDef.modelID = 64423;
//                itemDef.maleEquip1 = 64424;
//                itemDef.femaleEquip1 = 64424;
//                itemDefs = ItemDefinition.get(4900);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.stackable = false;
//                break;

            case 3723:
                itemDef.name = TierColor.UNCOMMON.getColor() +"Herbal Helmet";
                itemDef.modelID = 64413;
                itemDef.maleEquip1 = 64414;
                itemDef.femaleEquip1 = 64414;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 3724:
                itemDef.name = TierColor.UNCOMMON.getColor() +"Herbal Body";
                itemDef.modelID = 64415;
                itemDef.maleEquip1 = 64416;
                itemDef.femaleEquip1 = 64416;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 3725:
                itemDef.name = TierColor.UNCOMMON.getColor() +"Herbal legs";
                itemDef.modelID = 64417;
                itemDef.maleEquip1 = 64418;
                itemDef.femaleEquip1 = 64418;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 3738:
                itemDef.name = TierColor.UNCOMMON.getColor() +"Herbal Bow";
                itemDefs = ItemDefinition.get(859);
                itemDef.modelID = 64397;
                itemDef.femaleEquip1 = 64398;
                itemDef.maleEquip1 = 64398;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

                // tier 15
            case 17614:
                itemDef.name = "Conquerer helm";
                itemDef.modelID = 65498;
                itemDef.maleEquip1 = 65499;
                itemDef.femaleEquip1 = 65499;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                //itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 17616:
                itemDef.name = "Conquerer body";
                itemDef.modelID = 65500;
                itemDef.maleEquip1 = 65501;
                itemDef.femaleEquip1 = 65501;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                //itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;

                break;

            case 17618:
                itemDef.name = "Conquerer legs";
                itemDef.modelID = 65502;
                itemDef.maleEquip1 = 65503;
                itemDef.femaleEquip1 = 65503;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 17606:
                itemDef.name = "Conquerer wings";
                itemDef.modelID = 65504;
                itemDef.maleEquip1 = 65505;
                itemDef.femaleEquip1 = 65505;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 8410:
                itemDef.name = "Conquerer Sword";
                itemDefs = ItemDefinition.get(4587);
                itemDef.modelID = 64487;
                itemDef.femaleEquip1 = 64488;
                itemDef.maleEquip1 = 64488;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.newModelColor = new int[]{40};
                itemDef.editedModelColor = new int[]{60};
				break;
			case 8411:
                itemDef.name = "Conquerer Bow";
                itemDefs = ItemDefinition.get(859);
                itemDef.modelID = 64485;
                itemDef.femaleEquip1 = 64486;
                itemDef.maleEquip1 = 64486;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                //	itemDef.rdc2  = 20483;
                itemDef.newModelColor = new int[]{40};
                itemDef.editedModelColor = new int[]{59};
				break;
			case 8412:
                itemDef.name = "Conquerer Staff";
                itemDefs = ItemDefinition.get(4587);
                itemDef.modelID = 64489;
                itemDef.femaleEquip1 = 64490;
                itemDef.maleEquip1 = 64490;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.newModelColor = new int[]{40};
                itemDef.editedModelColor = new int[]{58};
				break;
            
                // tier 16
            case 5068:
                itemDef.name = "Joker Face";
                itemDef.modelID = 64497;
                itemDef.maleEquip1 = 64498;
                itemDef.femaleEquip1 = 64498;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 5069:
                itemDef.name = "Joker body";
                itemDef.modelID = 64499;
                itemDef.maleEquip1 = 64500;
                itemDef.femaleEquip1 = 64500;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                //itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 5070:
                itemDef.name = "Joker legs";
                itemDef.modelID = 64501;
                itemDef.maleEquip1 = 64502;
                itemDef.femaleEquip1 = 64502;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;


            case 5071:
                itemDef.name = "Joker gloves";
                itemDef.modelID = 64503;
                itemDef.maleEquip1 = 64504;
                itemDef.femaleEquip1 = 64504;
                itemDefs = ItemDefinition.get(7462);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 40; // the texture that it currently has
                itemDef.editedModelColor[0] = 65;
                itemDef.stackable = false;
                break;
            case 5072:
                itemDef.name = "Joker boots";
                itemDef.modelID = 64505;
                itemDef.maleEquip1 = 64505;
                itemDef.femaleEquip1 = 64505;
                itemDefs = ItemDefinition.get(11732);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

			case 17718:
				itemDef.name = "Joker bow";
				itemDef.modelID = 64073;
				itemDef.maleEquip1 = 64074;
				itemDef.femaleEquip1 = 64074;
                itemDefs = ItemDefinition.get(20171);
				itemDef.modelOffsetX = itemDefs.modelOffsetX;
				itemDef.modelOffsetY = itemDefs.modelOffsetY + 2;
				itemDef.modelZoom = itemDefs.modelZoom;
				itemDef.rotationY = itemDefs.rotationY;
				itemDef.rotationX = itemDefs.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

            case 13328:
                itemDef.name = "Shinigami head";
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64132;
                itemDef.maleEquip1 = 64133;
                itemDef.femaleEquip1 = 64133;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear"/*done*/; //done
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                itemDef.stackable = false;

                break;
            case 13329:
                itemDef.name = "Shinigami body";
                itemDefs = ItemDefinition.get(5575);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64134;
                itemDef.maleEquip1 = 64135;
                itemDef.femaleEquip1 = 64135;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear"/*done*/; //done
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                itemDef.stackable = false;

                break;
            case 13330:
                itemDef.name = "Shinigami legs";
                itemDefs = ItemDefinition.get(5576);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64136;
                itemDef.maleEquip1 = 64137;
                itemDef.femaleEquip1 = 64137;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear"/*done*/; //done
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                itemDef.stackable = false;

                break;
            case 13332:
                itemDef.name = "Shinigami boots";
                itemDefs = ItemDefinition.get(7114);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64138;
                itemDef.maleEquip1 = 64138;
                itemDef.femaleEquip1 = 64138;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.stackable = false;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear"/*done*/; //done
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                itemDef.stackable = false;

                break;
            case 13333:
                itemDef.name = "Shinigami Sword";
                itemDef.modelID = 64139;
                itemDef.maleEquip1 = 64140;
                itemDef.femaleEquip1 = 64140;
                itemDefs = ItemDefinition.get(22034);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 8828:
                itemDef.name = "Charybde helm";
                itemDef.modelID = 96452;
                itemDef.maleEquip1 = 96453;
                itemDef.femaleEquip1 = 96453;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{55};
                itemDef.editedModelColor = new int[]{61};
                break;
            case 8829:
                itemDef.name = "Charybde body";
                itemDef.modelID = 96454;
                itemDef.maleEquip1 = 96455;
                itemDef.femaleEquip1 = 96455;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{55};
                itemDef.editedModelColor = new int[]{61};
                break;

            case 8833:
                itemDef.name = "Charybde legs";
                itemDef.modelID = 96456;
                itemDef.maleEquip1 = 96457;
                itemDef.femaleEquip1 = 96457;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{55};
                itemDef.editedModelColor = new int[]{61};
                break;

            case 8830:
				itemDef.name = "Charybde cape";
				itemDefs = ItemDefinition.get(6570);
				itemDef.modelOffsetX = itemDefs.modelOffsetX;
				itemDef.modelOffsetY = itemDefs.modelOffsetY;
				itemDef.modelZoom = itemDefs.modelZoom;
				itemDef.rotationY = itemDefs.rotationY;
				itemDef.rotationX = itemDefs.rotationX;
				itemDef.modelID = 65447;
				itemDef.maleEquip1 = 65446;
				itemDef.femaleEquip1 = 65446;
				itemDef.actions = itemDefs.actions;
				itemDef.editedModelColor = new int[2]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[2]; // same here
				itemDef.newModelColor[0] = 54; // the texture that it currently has
				itemDef.editedModelColor[0] = 63;
				itemDef.newModelColor[1] = 65; // the texture that it currently has
				itemDef.editedModelColor[1] = 63; // the new texture u want it to have
				itemDef.stackable = false;
				itemDef.value = 1;
				break;

            case 8831:
				itemDef.name = "Charybde ring";
				itemDefs = ItemDefinition.get(15401);
				itemDef.modelOffsetX = itemDefs.modelOffsetX;
				itemDef.modelOffsetY = itemDefs.modelOffsetY;
				itemDef.modelZoom = itemDefs.modelZoom;
				itemDef.rotationY = itemDefs.rotationY;
				itemDef.rotationX = itemDefs.rotationX;
				itemDef.actions = itemDefs.actions;
				itemDef.modelID = 65303;
				itemDef.maleEquip1 = 65303;
				itemDef.femaleEquip1 = 65303;
				itemDef.editedModelColor = new int[1]; // same here
				itemDef.newModelColor = new int[1];
				itemDef.newModelColor[0] = 51; // the texture that it currently has
				itemDef.editedModelColor[0] = 63;
				break;

            case 22173:
                itemDef.name = "Charybde staff";
                itemDef.modelID = 100357;
                itemDef.maleEquip1 = 100358;
                itemDef.femaleEquip1 = 100358;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

                //tier 17
            case 22177:
                itemDef.name = "Obsidian Staff";
                itemDef.modelID = 100365;
                itemDef.maleEquip1 = 100366;
                itemDef.femaleEquip1 = 100366;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 23066:
                itemDef.copyItem(23064);
                itemDef.name = "Obsidian crossbow";
                itemDef.rotationX = 150;
                itemDef.modelID = 100161;
                itemDef.maleEquip1 = 100163;
                itemDef.femaleEquip1 = 100163;
                break;
            case 23067:
                itemDef.copyItem(23065);
                itemDef.name = "Obsidian Off-Hand";
                itemDef.rotationX = 1400;
                itemDef.modelID = 100161;
                itemDef.maleEquip1 = 100162;
                itemDef.femaleEquip1 = 100162;
                break;

            case 23064:
                itemDef.copyItem(4710);
                itemDef.name = "Obsidian blade";
                itemDef.modelZoom = 1400;
                itemDef.rotationX = 2000;
                itemDef.rotationY = 525;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                itemDef.modelID = 100158;
                itemDef.maleEquip1 = 100160;
                itemDef.femaleEquip1 = 100160;
                break;
            case 23065:
                itemDef.copyItem(4710);
                itemDef.name = "Obisdian Short Off-Hand";
                itemDef.modelZoom = 1400;
                itemDef.rotationX = 490;
                itemDef.rotationY = 525;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                itemDef.modelID = 100158;
                itemDef.maleEquip1 = 100159;
                itemDef.femaleEquip1 = 100159;
                break;

            case 22202:
                itemDef.name = "Obsidian Cape";
                itemDef.modelID = 139820;
                itemDef.maleEquip1 = 139821;
                itemDef.femaleEquip1 = 139821;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22203:
                itemDef.name = "Obsidian Boots";
                itemDef.modelID = 139822;
                itemDef.maleEquip1 = 139822;
                itemDef.femaleEquip1 = 139822;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 23061:
                itemDef.copyItem(4708);
                itemDef.name = "Obsidian helm";
                itemDef.modelZoom = 900;
                itemDef.modelID = 100152;
                itemDef.maleEquip1 = 100153;
                itemDef.femaleEquip1 = 100153;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23062:
                itemDef.copyItem(4714);
                itemDef.name = "Obsidian body";
                itemDef.modelZoom = 1500;
                itemDef.modelID = 100156;
                itemDef.maleEquip1 = 100157;
                itemDef.femaleEquip1 = 100157;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23063:
                itemDef.copyItem(4712);
                itemDef.name = "Obsidian legs";
                itemDef.modelZoom = 1700;
                itemDef.modelID = 100154;
                itemDef.maleEquip1 = 100155;
                itemDef.femaleEquip1 = 100155;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23068:
                itemDef.copyItem(669);
                itemDef.name = "Obsidian wings";
                itemDef.modelZoom = 2200;
                itemDef.rotationX = 0;
                itemDef.rotationY = 525;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                itemDef.modelID = 100164;
                itemDef.maleEquip1 = 100165;
                itemDef.femaleEquip1 = 100165;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            case 22179:
                itemDef.name = "Ocean Boots";
                itemDefs = ItemDefinition.get(20119);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelID = 100408;
                itemDef.maleEquip1 = 100408;
                itemDef.femaleEquip1 = 100408;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = itemDefs.actions;
                itemDef.stackable = false;
                break;

            case 22180:
                itemDef.name = "Ocean Gloves";
                itemDef.modelID = 100409;
                itemDef.maleEquip1 = 100410;
                itemDef.femaleEquip1 = 100410;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22181:
                itemDef.name = "Ocean Body";
                itemDef.modelID = 100411;
                itemDef.maleEquip1 = 100412;
                itemDef.femaleEquip1 = 100412;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22182:
                itemDef.name = "Ocean Legs";
                itemDef.modelID = 100413;
                itemDef.maleEquip1 = 100414;
                itemDef.femaleEquip1 = 100414;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22183:
                itemDef.name = "Ocean Helm";
                itemDef.modelID = 100415;
                itemDef.maleEquip1 = 100416;
                itemDef.femaleEquip1 = 100416;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22184:
                itemDef.name = "Ocean Blade";
                itemDef.modelID = 100417;
                itemDef.maleEquip1 = 100418;
                itemDef.femaleEquip1 = 100418;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22161:
                itemDef.name = "White boots";
                itemDefs = ItemDefinition.get(20119);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelID = 100333;
                itemDef.maleEquip1 = 100333;
                itemDef.femaleEquip1 = 100333;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = itemDefs.actions;
                itemDef.stackable = false;
                break;

            case 22162:
                itemDef.name = "White Gloves";
                itemDef.modelID = 100334;
                itemDef.maleEquip1 = 100335;
                itemDef.femaleEquip1 = 100335;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22163:
                itemDef.name = "White Helm";
                itemDef.modelID = 100336;
                itemDef.maleEquip1 = 100337;
                itemDef.femaleEquip1 = 100337;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22164:
                itemDef.name = "White Legs";
                itemDef.modelID = 100338;
                itemDef.maleEquip1 = 100339;
                itemDef.femaleEquip1 = 100339;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22165:
                itemDef.name = "White Body";
                itemDef.modelID = 100340;
                itemDef.maleEquip1 = 100341;
                itemDef.femaleEquip1 = 100341;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22166:
                itemDef.name = "White wings";
                itemDef.modelID = 100347;
                itemDef.maleEquip1 = 100348;
                itemDef.femaleEquip1 = 100348;
                itemDefs = ItemDefinition.get(19709);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22167:
                itemDef.name = "White Staff";
                itemDef.modelID = 100342;
                itemDef.maleEquip1 = 100343;
                itemDef.femaleEquip1 = 100343;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 21607:
                itemDef.name = "Wind Helm";
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64194;
                itemDef.maleEquip1 = 64195;
                itemDef.femaleEquip1 = 64195;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear"/*done*/; //done
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                itemDef.rdc2 = 123829;//77777
                break;

            case 21608:
                itemDef.name = "Wind body";
                itemDefs = ItemDefinition.get(5575);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64196;
                itemDef.maleEquip1 = 64197;
                itemDef.femaleEquip1 = 64197;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear"/*done*/; //done
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                itemDef.rdc2 = 123829;
                break;
            case 21609:
                itemDef.name = "Wind legs";
                itemDefs = ItemDefinition.get(5576);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64198;
                itemDef.maleEquip1 = 64199;
                itemDef.femaleEquip1 = 64199;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear"/*done*/; //done
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                itemDef.rdc2 = 123829;
                break;
            case 21610:
                itemDef.name = "Wind Teddy bear";
                itemDef.modelID = 64034;
                itemDef.maleEquip1 = 64035;
                itemDef.femaleEquip1 = 64035;
                itemDefs = ItemDefinition.get(8848);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 204929;
                break;

            case 21611:
                itemDef.name = "Wind gloves";
                itemDefs = ItemDefinition.get(7461);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64202;
                itemDef.maleEquip1 = 64203;
                itemDef.femaleEquip1 = 64203;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear"/*done*/; //done
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                itemDef.rdc2 = 123829;
                break;
            case 21612:
                itemDef.name = "Wind boots";
                itemDefs = ItemDefinition.get(7114);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64204;
                itemDef.maleEquip1 = 64204;
                itemDef.femaleEquip1 = 64204;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear"/*done*/; //done
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                itemDef.rdc2 = 123829;
                break;

            case 22176:
                itemDef.name = "Wind Bow";
                itemDef.modelID = 100363;
                itemDef.maleEquip1 = 100364;
                itemDef.femaleEquip1 = 100364;
                itemDefs = ItemDefinition.get(18509);
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
                
                /* Tier 19 */
            case 8100:
                itemDef.name = "Light guild helmet";
                itemDef.modelID = 64428;
                itemDef.maleEquip1 = 64429;
                itemDef.femaleEquip1 = 64429;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 8101:
                itemDef.name = "Light guild body";
                itemDef.modelID = 64430;
                itemDef.maleEquip1 = 64431;
                itemDef.femaleEquip1 = 64431;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 8102:
                itemDef.name = "Light guild legs";
                itemDef.modelID = 64432;
                itemDef.maleEquip1 = 64433;
                itemDef.femaleEquip1 = 64433;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 8103:
                itemDef.name = "Light guild boots";
                itemDefs = ItemDefinition.get(7114);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64434;
                itemDef.maleEquip1 = 64434;
                itemDef.femaleEquip1 = 64434;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            case 8104:
                itemDef.name = "Light guild gloves";
                itemDefs = ItemDefinition.get(7461);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1100;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64436;
                itemDef.maleEquip1 = 64436;
                itemDef.femaleEquip1 = 64436;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 8110:
                itemDef.name = "Light guild sword";
                itemDef.modelID = 64446;
                itemDef.maleEquip1 = 64447;
                itemDef.femaleEquip1 = 64447;
                itemDefs = ItemDefinition.get(22034);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1500;
                itemDef.rotationY = 400;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 8105:
                itemDef.name = "Dark guild helmet";
                itemDef.modelID = 64437;
                itemDef.maleEquip1 = 64438;
                itemDef.femaleEquip1 = 64438;
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 8106:
                itemDef.name = "Dark guild body";
                itemDef.modelID = 64439;
                itemDef.maleEquip1 = 64440;
                itemDef.femaleEquip1 = 64440;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 8107:
                itemDef.name = "Dark guild legs";
                itemDef.modelID = 64441;
                itemDef.maleEquip1 = 64442;
                itemDef.femaleEquip1 = 64442;
                itemDefs = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 8108:
                itemDef.name = "Dark guild boots";
                itemDefs = ItemDefinition.get(7114);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64443;
                itemDef.maleEquip1 = 64443;
                itemDef.femaleEquip1 = 64443;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            case 8109:
                itemDef.name = "Dark guild gloves";
                itemDefs = ItemDefinition.get(7461);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1100;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64444;
                itemDef.maleEquip1 = 64445;
                itemDef.femaleEquip1 = 64445;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 22134:
                itemDef.name = "Dark Guild Bow";
                itemDef.modelID = 100_353;
                itemDef.maleEquip1 = 100_354;
                itemDef.femaleEquip1 = 100_354;
                ItemDefinition def343 = ItemDefinition.get(859);
                itemDef.modelOffsetX = def343.modelOffsetX;
                itemDef.modelOffsetY = def343.modelOffsetY;
                itemDef.modelZoom = 1900;
                itemDef.rotationY = def343.rotationY;
                itemDef.rotationX = def343.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 14202:
                itemDef.name = "Virtuos Helm";
                itemDef.modelID = 140128;
                itemDef.maleEquip1 = 140129;
                itemDef.femaleEquip1 = 140129;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 14204:
                itemDef.name = "Virtuos Body";
                itemDef.modelID = 140130;
                itemDef.maleEquip1 = 140131;
                itemDef.femaleEquip1 = 140131;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 14206:
                itemDef.name = "Virtuos Legs";
                itemDef.modelID = 140132;
                itemDef.maleEquip1 = 140133;
                itemDef.femaleEquip1 = 140133;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 14301:
                itemDef.name = "Virtuos Gloves";
                itemDef.modelID = 140134;
                itemDef.maleEquip1 = 140135;
                itemDef.femaleEquip1 = 140135;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 14303:
                itemDef.name = "Virtuos Boots";
                itemDef.modelID = 140136;
                itemDef.maleEquip1 = 140136;
                itemDef.femaleEquip1 = 140136;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 14305:
                itemDef.name = "Virtuos Wand";
                itemDef.modelID = 140137;
                itemDef.maleEquip1 = 140138;
                itemDef.femaleEquip1 = 140138;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 14307:
                itemDef.name = "Virtuos Relic";
                itemDef.modelID = 140139;
                itemDef.maleEquip1 = 140140;
                itemDef.femaleEquip1 = 140140;
                itemDefs = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;


        }
        return itemDef;
    }
}
