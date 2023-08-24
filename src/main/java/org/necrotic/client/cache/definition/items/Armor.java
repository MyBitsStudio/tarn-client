package org.necrotic.client.cache.definition.items;

import org.necrotic.client.cache.definition.ItemDefinition;

public class Armor {
    /* Dye recolors

                    33281 cyan
                    50000 purple
                    12222 grey
                    99900 teal
                    remove rdc for GREEN

                     */
    public static ItemDefinition newDef(ItemDefinition itemDef, int id) {
        ItemDefinition itemDefs;
        switch(id) {
            case 13263:
                itemDef.actions = new String[]{null, "Wear", null, "Upgrade", "Drop"};
                break;

            case 21075:
                itemDef.name = "Slayer helmet [Level 1]";
                 itemDefs = ItemDefinition.get(13263);
                itemDef.modelOffsetX =  itemDefs.modelOffsetX;
                itemDef.modelOffsetY =  itemDefs.modelOffsetY;
                itemDef.modelZoom =  itemDefs.modelZoom;
                itemDef.rotationY =  itemDefs.rotationY;
                itemDef.rotationX =  itemDefs.rotationX;
                itemDef.modelID =  itemDefs.modelID;
                itemDef.maleEquip1 =  itemDefs.maleEquip1;
                itemDef.femaleEquip1 =  itemDefs.femaleEquip1;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, "Wear", null, "Upgrade", "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 35363;
                break;
            case 21076:
                itemDef.name = "Slayer helmet [Level 2]";
                 itemDefs = ItemDefinition.get(13263);
                itemDef.modelOffsetX =  itemDefs.modelOffsetX;
                itemDef.modelOffsetY =  itemDefs.modelOffsetY;
                itemDef.modelZoom =  itemDefs.modelZoom;
                itemDef.rotationY =  itemDefs.rotationY;
                itemDef.rotationX =  itemDefs.rotationX;
                itemDef.modelID =  itemDefs.modelID;
                itemDef.maleEquip1 =  itemDefs.maleEquip1;
                itemDef.femaleEquip1 =  itemDefs.femaleEquip1;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, "Wear", null, "Upgrade", "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 444444;
                break;
            case 21077:
                itemDef.name = "Slayer helmet [level 3]";
                 itemDefs = ItemDefinition.get(13263);
                itemDef.modelOffsetX =  itemDefs.modelOffsetX;
                itemDef.modelOffsetY =  itemDefs.modelOffsetY;
                itemDef.modelZoom =  itemDefs.modelZoom;
                itemDef.rotationY =  itemDefs.rotationY;
                itemDef.rotationX =  itemDefs.rotationX;
                itemDef.modelID =  itemDefs.modelID;
                itemDef.maleEquip1 =  itemDefs.maleEquip1;
                itemDef.femaleEquip1 =  itemDefs.femaleEquip1;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, "Wear", null, "Upgrade", "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 8858;
                break;

            case 21078:
                itemDef.name = "Slayer helmet [Level 4]";
                 itemDefs = ItemDefinition.get(13263);
                itemDef.modelOffsetX =  itemDefs.modelOffsetX;
                itemDef.modelOffsetY =  itemDefs.modelOffsetY;
                itemDef.modelZoom =  itemDefs.modelZoom;
                itemDef.rotationY =  itemDefs.rotationY;
                itemDef.rotationX =  itemDefs.rotationX;
                itemDef.modelID =  itemDefs.modelID;
                itemDef.maleEquip1 =  itemDefs.maleEquip1;
                itemDef.femaleEquip1 =  itemDefs.femaleEquip1;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, "Wear", null, "Upgrade", "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 8808080;
                break;
            case 21079:
                itemDef.name = "Slayer helmet [MAX]";
                 itemDefs = ItemDefinition.get(13263);
                itemDef.modelOffsetX =  itemDefs.modelOffsetX;
                itemDef.modelOffsetY =  itemDefs.modelOffsetY;
                itemDef.modelZoom =  itemDefs.modelZoom;
                itemDef.rotationY =  itemDefs.rotationY;
                itemDef.rotationX =  itemDefs.rotationX;
                itemDef.modelID =  itemDefs.modelID;
                itemDef.maleEquip1 =  itemDefs.maleEquip1;
                itemDef.femaleEquip1 =  itemDefs.femaleEquip1;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.rdc2 = 74623;
                break;

                /* Starter Gear */

            case 703:
                itemDef.name = "Starter Helm";
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
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 57; // the texture that it currently has
                itemDef.editedModelColor[0] = 40; //

                break;

            case 704:
                itemDef.name = "Starter Body";
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
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 57; // the texture that it currently has
                itemDef.editedModelColor[0] = 40; //

                break;

            case 705:
                itemDef.name = "Starter Legs";
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
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 57; // the texture that it currently has
                itemDef.editedModelColor[0] = 40; //
                break;
            case 23089:
                itemDef.copyItem(23087);
                itemDef.name = "Starter amulet";
                itemDef.modelID = 100207;
                itemDef.maleEquip1 = 100208;
                itemDef.femaleEquip1 = 100208;
                break;
            case 23091:
                itemDef.copyItem(6737);
                itemDef.name = "Starter ring";
                itemDef.modelID = 100211;
                itemDef.modelZoom = 1400;
                itemDef.rotationX = 0;
                itemDef.rotationY = 520;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 22083:
                itemDef.name = "Starter Cannon";
                itemDefs = ItemDefinition.get(20538);
                itemDef.modelID = 65426;
                itemDef.femaleEquip1 = 65427;
                itemDef.maleEquip1 = 65427;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.newModelColor = new int[]{55};
                itemDef.editedModelColor = new int[]{40};
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22092:
                itemDef.name = "Starter Staff";
                itemDefs = ItemDefinition.get(15486);
                itemDef.modelID = 65418;
                itemDef.femaleEquip1 = 65419;
                itemDef.maleEquip1 = 65419;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{52};
                itemDef.editedModelColor = new int[]{40};
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            case 22084:
                itemDef.name = "Starter Blade";
                itemDefs = ItemDefinition.get(20538);
                itemDef.modelID = 65428;
                itemDef.femaleEquip1 = 65429;
                itemDef.maleEquip1 = 65429;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{52};
                itemDef.editedModelColor = new int[]{40};
                break;
            case 19945:
                itemDef.name = "Starter Boots";
                itemDef.modelID = 65103;
                itemDef.maleEquip1 = 65103;
                itemDef.femaleEquip1 = 65103;
                itemDefs = ItemDefinition.get(3791);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor[0] = 52; // the texture that it currently has
                itemDef.editedModelColor[0] = 40; // the new text
                break;
            case 19944:
                itemDef.name = "Starter Cape";
                itemDef.modelID = 65104;
                itemDef.maleEquip1 = 65105;
                itemDef.femaleEquip1 = 65105;
                itemDefs = ItemDefinition.get(1007);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor[0] = 52; // the texture that it currently has
                itemDef.editedModelColor[0] = 40; // the new text
                break;
            case 19946:
                itemDef.name = "Starter Gloves";
                itemDef.modelID = 65101;
                itemDef.maleEquip1 = 65102;
                itemDef.femaleEquip1 = 65102;
                itemDefs = ItemDefinition.get(7462);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                itemDef.newModelColor[0] = 52; // the texture that it currently has
                itemDef.editedModelColor[0] = 40; // the new text

                break;
            case 19914:
                itemDef.name = "Starter Defender";
                itemDef.modelID = 65127;
                itemDef.maleEquip1 = 65128;
                itemDef.femaleEquip1 = 65128;
                itemDefs = ItemDefinition.get(1321);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 40; // the texture that it currently has
                itemDef.editedModelColor[0] = 40;
                itemDef.stackable = false;
                break;

                /* Statues */
            case 15584:
                itemDef.name = "Inferno's Statue";
                itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
                break;
            case 15585:
                itemDef.name = "Zorbak's Statue";
                itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
                break;
            case 15586:
                itemDef.name = "Mutant's Statue";
                itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
                break;
            case 15589:
                itemDef.name = "Gorvek's Statue";
                itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
                break;
            case 15587:
                itemDef.name = "Malvek's Statue";
                itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
                break;
            case 15588:
                itemDef.name = "Griffin's Statue";
                itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
                break;

                /* Auras */
            case 23044:
                itemDef.copyItem(1);
                itemDef.name = "Aura 1";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.modelID = 100123;
                itemDef.rotationX = 0;
                itemDef.modelZoom = 2000;
                break;
            case 23045:
                itemDef.copyItem(23044);
                itemDef.name = "Aura 2";
                itemDef.modelID = 100124;
                break;
            case 23046:
                itemDef.copyItem(23044);
                itemDef.name = "Aura 3";
                itemDef.modelID = 100125;
                break;
            case 23047:
                itemDef.copyItem(23044);
                itemDef.name = "Aura 4";
                itemDef.modelID = 100126;
                break;
            case 23048:
                itemDef.copyItem(23044);
                itemDef.name = "Aura 5";
                itemDef.modelID = 100127;
                break;
            case 23049:
                itemDef.copyItem(23044);
                itemDef.name = "Aura 6";
                itemDef.modelID = 100128;
                break;

            case 15448:
                itemDef.name = "Groudon-flame Aura";
                break;
            case 15449:
                itemDef.name = "Extreme Aura";
                break;
            case 15450:
                itemDef.name = "Collectors Aura I";
                break;
            case 26:
                itemDef.name = "Sassy Aura";
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;


            /* Ironman */
            case 13700:
                itemDef.copyItem(4977);
                itemDef.name = "Group Ironman full helm";
                itemDef.rdc2 = 91291;
                break;
            case 13701:
                itemDef.copyItem(4989);
                itemDef.name = "Group Ironman platebody";
                itemDef.rdc2 = 91291;
                break;
            case 13702:
                itemDef.copyItem(4995);
                itemDef.name = "Group Ironman platelegs";
                itemDef.rdc2 = 91291;
                break;
            case 16691:
                itemDef.name = "Ironman full helm";
                itemDef.modelID = 80047;
                itemDef.maleEquip1 = 80048;
                itemDef.femaleEquip1 = 80048;
                break;
            case 17239:
                itemDef.name = "Ironman platebody";
                itemDef.modelID = 80051;
                itemDef.maleEquip1 = 80052;
                itemDef.femaleEquip1 = 80052;
                break;
            case 16669:
                itemDef.name = "Ironman platelegs";
                itemDef.modelID = 80049;
                itemDef.maleEquip1 = 80050;
                itemDef.femaleEquip1 = 80050;

                break;
            case 4977:
                itemDef.name = "Ult. Ironman full helm";
                itemDef.modelID = 65440;
                itemDef.maleEquip1 = 65441;
                itemDef.femaleEquip1 = 65441;
                itemDef.rdc2 = 500;
                break;
            case 4989:
                itemDef.name = "Ult. Ironman platebody";
                itemDef.modelID = 65442;
                itemDef.maleEquip1 = 65443;
                itemDef.anInt188 = -1;
                itemDef.femaleEquip1 = 65443;
                itemDef.rdc2 = 500;
                break;
            case 4995:
                itemDef.name = "Ult. Ironman platelegs";
                itemDef.modelID = 65444;
                itemDef.maleEquip1 = 65445;
                itemDef.femaleEquip1 = 65445;
                itemDef.rdc2 = 500;
                break;
                
                /* Staff */
            case 7995:
                itemDef.name = "Owner's cape";
                itemDef.modelID = 65448;
                itemDef.maleEquip1 = 65449;
                itemDef.femaleEquip1 = 65449;
                itemDefs = ItemDefinition.get(2414);
                itemDef.actions = itemDefs.actions;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.newModelColor = new int[]{57};
                itemDef.editedModelColor = new int[]{52};
                break;
            case 22109:
                itemDef.name = "Admin's cape";
                itemDef.modelID = 15116;
                itemDef.maleEquip1 = 15114;
                itemDef.femaleEquip1 = 15114;
                itemDefs = ItemDefinition.get(2414);
                itemDef.actions = itemDefs.actions;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.newModelColor = new int[]{57};
                itemDef.editedModelColor = new int[]{52};
                break;
            case 20499:
                itemDef.name = "Mod's cape";
                itemDef.modelID = 15117;
                itemDef.maleEquip1 = 15115;
                itemDef.femaleEquip1 = 15115;
                itemDefs = ItemDefinition.get(2414);
                itemDef.actions = itemDefs.actions;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.newModelColor = new int[]{57};
                itemDef.editedModelColor = new int[]{52};
                break;

                /* Others */
            case 23176:
                itemDef.copyItem(669);
                itemDef.name = "Master max cape";
                itemDef.modelID = 100321;
                itemDef.maleEquip1 = 100322;
                itemDef.femaleEquip1 = 100322;
                itemDef.modelZoom = 1900;
                itemDef.rotationX = 0;
                itemDef.rotationY = 525;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                break;

            /* Master Sets **/

//            case 21020:
//                itemDef.name = "Deviant helm";
//                itemDefs = ItemDefinition.get(4882);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.modelID = 64237;
//                itemDef.maleEquip1 = 64238;
//                itemDef.femaleEquip1 = 64238;
//                itemDef.groundActions = new String[5];
//                itemDef.groundActions[2] = "Take";
//                itemDef.stackable = false;
//                itemDef.actions = new String[5];
//                itemDef.actions[1] = "Wear"/*done*/; //done
//                itemDef.actions[2] = "Dissolve";
//                itemDef.actions[4] = "Drop";
//                itemDef.stackable = false;
//
//
//                break;
//            case 21021:
//                itemDef.name = "Deviant body";
//                itemDefs = ItemDefinition.get(5575);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.modelID = 64239;
//                itemDef.maleEquip1 = 64240;
//                itemDef.femaleEquip1 = 64240;
//                itemDef.groundActions = new String[5];
//                itemDef.groundActions[2] = "Take";
//                itemDef.stackable = false;
//                itemDef.actions = new String[5];
//                itemDef.actions[1] = "Wear"/*done*/; //done
//                itemDef.actions[2] = "Dissolve";
//                itemDef.actions[4] = "Drop";
//                itemDef.stackable = false;
//
//                break;
//            case 21022:
//                itemDef.name = "Deviant legs";
//                itemDefs = ItemDefinition.get(5576);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.modelID = 64241;
//                itemDef.maleEquip1 = 64242;
//                itemDef.femaleEquip1 = 64242;
//                itemDef.groundActions = new String[5];
//                itemDef.groundActions[2] = "Take";
//                itemDef.stackable = false;
//                itemDef.actions = new String[5];
//                itemDef.actions[1] = "Wear"/*done*/; //done
//                itemDef.actions[2] = "Dissolve";
//                itemDef.actions[4] = "Drop";
//                itemDef.stackable = false;
//
//
//                break;
//            case 21023:
//                itemDef.name = "Deviant sword";
//                itemDef.modelID = 64243;
//                itemDef.maleEquip1 = 64244;
//                itemDef.femaleEquip1 = 64244;
//                itemDefs = ItemDefinition.get(19780);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                //itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[5];
//                itemDef.actions[1] = "Wear"/*done*/; //done
//                itemDef.actions[2] = "Dissolve";
//                itemDef.actions[4] = "Drop";
//                itemDef.stackable = false;
//
//                break;
//            case 21024:
//                itemDef.name = "Deviant wings";
//                itemDef.modelID = 64245;
//                itemDef.maleEquip1 = 64246;
//                itemDef.femaleEquip1 = 64246;
//                itemDefs = ItemDefinition.get(17632);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                //itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.actions = new String[5];
//                itemDef.actions[1] = "Wear"/*done*/; //done
//                itemDef.actions[2] = "Dissolve";
//                itemDef.rdc2 = 230;
//                itemDef.actions[4] = "Drop";
//                itemDef.stackable = false;
//
//                break;

//            needs weapon
            case 15005:
                itemDef.name = "Ruthless Gladiator Helmet";
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64101;
                itemDef.maleEquip1 = 64102;
                itemDef.femaleEquip1 = 64102;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                break;
            case 15006:
                itemDef.name = "Ruthless Gladiator Body";
                itemDefs = ItemDefinition.get(5575);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64103;
                itemDef.maleEquip1 = 64104;
                itemDef.femaleEquip1 = 64104;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                break;
            case 15007:
                itemDef.name = "Ruthless Gladiator Legs";
                itemDefs = ItemDefinition.get(5576);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64105;
                itemDef.maleEquip1 = 64106;
                itemDef.femaleEquip1 = 64106;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                break;
            case 15008:
                itemDef.name = "Ruthless Gladiator Kiteshield";
                itemDefs = ItemDefinition.get(1540);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64107;
                itemDef.maleEquip1 = 64108;
                itemDef.femaleEquip1 = 64108;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                break;

            case 15200:
                itemDef.name = "Ruthless Gladiator Gloves";
                itemDefs = ItemDefinition.get(7461);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64111;
                itemDef.maleEquip1 = 64112;
                itemDef.femaleEquip1 = 64112;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                break;
            case 15201:
                itemDef.name = "Ruthless Gladiator Boots";
                itemDefs = ItemDefinition.get(7114);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64113;
                itemDef.maleEquip1 = 64113;
                itemDef.femaleEquip1 = 64113;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                break;
            case 15100:
                itemDef.name = "Ruthless Gladiator Cape";
                itemDefs = ItemDefinition.get(6570);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64109;
                itemDef.maleEquip1 = 64110;
                itemDef.femaleEquip1 = 64110;
                itemDef.groundActions = new String[5];
                itemDef.groundActions[2] = "Take";
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                break;

            case 14915:
                itemDef.name = "Ruthless Gladiator Blade";
                itemDefs = ItemDefinition.get(20536);
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

            case 23064:
                itemDef.copyItem(4710);
                itemDef.name = "Avaryss blade";
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
                itemDef.name = "Off-hand Avaryss blade";
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


        }
        return itemDef;
    }
}
