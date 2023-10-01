package org.necrotic.client.cache.definition.items;

import org.necrotic.client.cache.definition.ItemDefinition;

public class Pets {

    public static ItemDefinition newDef(ItemDefinition itemDef, int id) {
        ItemDefinition itemDefs;
        switch (id) {
            case 19486:
                itemDef.copyItem(12189);
                itemDef.name = "Onyx Griffin Pet";
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 19481:
                itemDef.copyItem(5074);
                itemDef.name = "Sanctum Golem Pet";
                itemDef.modelID = 100027;
                itemDef.modelZoom = 5500;
                itemDef.modelOffsetX = 2;
                //itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 19482:
                itemDef.copyItem(5074);
                itemDef.name = "Mutant Hydra Pet";
                itemDef.modelID = 100305;
                itemDef.modelZoom = 5500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 23081:
                itemDef.copyItem(5074);
                itemDef.name = "Gorvek Pet";
                itemDef.modelID = 100190;
                itemDef.modelZoom = 3500;
                itemDef.rotationY = 400;
                itemDef.rotationX = 210;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 19485:
                itemDef.copyItem(5074);
                itemDef.name = "Malvek Pet";
                itemDef.modelID = 65172;
                itemDef.modelZoom = 2500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 19490:
                itemDef.copyItem(5074);
                itemDef.name = "Groudon Pet";
                itemDef.modelID = 65191;
                itemDef.modelZoom = 4000;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 19488:
                itemDef.copyItem(7988);
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                itemDef.name = "Ag'thomoth Pet";
                itemDef.modelID = 139799;
                itemDef.modelZoom = 4200;
                itemDef.rotationY = 520;
                itemDef.rotationX = 250;
                itemDef.scaleX = 32;
                itemDef.scaleY = 32;
                itemDef.scaleZ = 32;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                itemDef.rdc2 = 3333;
                break;
            case 19484:
                itemDef.copyItem(5074);
                itemDef.name = "Asmodeus Pet";
                itemDef.modelID = 100407;
                itemDef.modelZoom = 4500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 19487:
                itemDef.copyItem(5074);
                itemDef.name = "Zeidan Grimm Pet";
                itemDef.modelID = 139754;
                itemDef.modelZoom = 3500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 19489:
                itemDef.copyItem(5074);
                itemDef.name = "Lilinryss Pet";
                itemDef.modelID = 139804;
                itemDef.modelZoom = 3500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 19492:
                itemDef.copyItem(5074);
                itemDef.name = "Tyrant Lord Pet";
                itemDef.modelID = 65332;
                itemDef.modelZoom = 5500;
                itemDef.rotationY = 400;
                itemDef.rotationX = 210;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 19495:
                itemDef.copyItem(5074);
                itemDef.name = "Agumon Pet";
                itemDef.modelID = 139850;
                itemDef.modelZoom = 2500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 20586:
                itemDef.copyItem(5074);
                itemDef.name = "Slender Man Pet";
                itemDef.modelID = 139780;
                itemDef.modelZoom = 3500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 20582:
                itemDef.copyItem(5074);
                itemDef.name = "White Beard Pet";
                itemDef.modelID = 97300;
                itemDef.modelZoom = 2500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 20583:
                itemDef.copyItem(5074);
                itemDef.name = "Panther Pet";
                itemDef.modelID = 65177;
                itemDef.modelZoom = 1500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 23041:
                itemDef.copyItem(5074);
                itemDef.name = "Mage Pet";
                itemDef.modelID = 100097;
                itemDef.modelZoom = 3400;
                break;
            case 23042:
                itemDef.copyItem(5074);
                itemDef.name = "Melee Pet";
                itemDef.modelID = 100109;
                itemDef.modelZoom = 3400;
                break;
            case 23043:
                itemDef.copyItem(5074);
                itemDef.name = "Ranged Pet";
                itemDef.modelID = 100114;
                itemDef.modelZoom = 3400;
                break;
            case 23018:
                itemDef.copyItem(5074);
                itemDef.name = "Armoured Bunny Pet";
                itemDef.modelID = 100050;
                itemDef.modelZoom = 4000;
                break;
            case 20511:
                itemDef.modelID = 36071;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                itemDef.modelZoom = 2700;
                itemDef.name = "Hooker pet";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 11314:
                itemDefs = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 65498;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.name = "Shadow Pet";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 20589:
                itemDef.copyItem(5074);
                itemDef.name = "Exoden Pet";
                itemDef.modelID = 64094;
                itemDef.modelZoom = 7500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 22050:
                itemDef.name = "Vote Pet";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 23112:
                itemDef.copyItem(5074);
                itemDef.name = "Heimdall Pet";
                itemDef.modelID = 100200;
                itemDef.modelZoom = 3500;
                itemDef.rotationY = 0;
                itemDef.rotationX = 0;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 23108:
                itemDef.copyItem(5074);
                itemDef.name = "Fenrir Pet";
                itemDef.modelID = 100196;
                itemDef.modelZoom = 2700;
                itemDef.rotationY = 0;
                itemDef.rotationX = 0;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 23109:
                itemDef.copyItem(5074);
                itemDef.name = "Green Fenrir Pet";
                itemDef.modelID = 100197;
                itemDef.modelZoom = 2700;
                itemDef.rotationY = 0;
                itemDef.rotationX = 0;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 23110:
                itemDef.copyItem(5074);
                itemDef.name = "Red Fenrir Pet";
                itemDef.modelID = 100198;
                itemDef.modelZoom = 2700;
                itemDef.rotationY = 0;
                itemDef.rotationX = 0;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 456:
                itemDef.name = "Scorpion pet";
                itemDef.modelID = 24610;
                itemDef.modelZoom = 4000;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
                break;
            case 457:
                itemDef.name = "Unicorn pet";
                itemDef.modelID = 25754;
                itemDef.modelZoom = 3000;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
                break;
            case 458:
                itemDef.name = "Bear pet";
                itemDef.modelID = 18884;
                itemDef.modelZoom = 3000;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
                break;
            case 459:
                itemDef.name = "Wolf pet";
                itemDef.modelID = 26266;
                itemDef.modelZoom = 3000;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
                break;
            case 460:
                itemDef.name = "Gorilla pet";
                itemDef.modelID = 65154;
                itemDef.modelZoom = 3000;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
                break;
//            case 11317:
//                ItemDefinition votingpoting = ItemDefinition.get(12479);
//                itemDef.modelID = 64304;
//                itemDef.modelOffsetX = votingpoting.modelOffsetX;
//                itemDef.modelOffsetY = votingpoting.modelOffsetY;
//                itemDef.modelZoom = 2000;
//                itemDef.groundActions = new String[]{null, null, "Take", null, null};
//                itemDef.name = "Bumble bee pet";
//                itemDef.groundActions = new String[]{null, null, "Take", null, null};
//                itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
//                itemDef.rdc2 = 664466;
//                break;
            case 11318:
                ItemDefinition adminsraichu = ItemDefinition.get(12479);
                itemDef.modelID = 64448;
                itemDef.modelOffsetX = adminsraichu.modelOffsetX;
                itemDef.modelOffsetY = adminsraichu.modelOffsetY;
                itemDef.modelZoom = 2000;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.name = "Raichu pet";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
                break;
            case 22016:
                itemDef.name = "Pet Skeleton Warlord";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22017:
                itemDef.name = "Pet Penguin";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;

            case 22018:
                itemDef.name = "Pet Marley";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;

            case 5074:
                ItemDefinition jokerpet = ItemDefinition.get(12479);
                itemDef.modelID = 64508;
                itemDef.modelOffsetX = jokerpet.modelOffsetX;
                itemDef.modelOffsetY = jokerpet.modelOffsetY;
                itemDef.modelZoom = 2000;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.name = "Joker pet";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                //	itemDef.rdc2 = 664466;
                break;

            case 5406:
                ItemDefinition luffpet = ItemDefinition.get(12479);
                itemDef.modelID = 139798;
                itemDef.modelOffsetX = luffpet.modelOffsetX;
                itemDef.modelOffsetY = luffpet.modelOffsetY;
                itemDef.modelZoom = 2000;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.name = "Luffy pet";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;

                /* To Add */

            case 19483:
                itemDef.copyItem(5074);
                itemDef.name = "Dragonite Pet";
                itemDef.modelID = 100238;
                itemDef.modelZoom = 7500;
                itemDef.rotationY = 400;
                itemDef.rotationX = 210;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 19491:
                itemDef.copyItem(5074);
                itemDef.name = "Varthramoth Pet";
                itemDef.modelID = 139806;
                itemDef.modelZoom = 4500;
                itemDef.modelOffsetX = 2;
                //itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 19493:
                itemDef.copyItem(5074);
                itemDef.name = "Lucifer Pet";
                itemDef.modelID = 100000;
                itemDef.rotationX = 0;
                itemDef.rotationY = 468;
                itemDef.modelZoom = 694;
                itemDef.modelOffsetX = 7;
                itemDef.modelOffsetY = -7;
                break;
            case 19494:
                itemDef.copyItem(5074);
                itemDef.name = "Virtuoso Pet";
                itemDef.modelID = 139809;
                itemDef.modelZoom = 4000;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 20584:
                itemDef.copyItem(5074);
                itemDef.name = "Leviathan Pet";
                itemDef.modelID = 100240;
                itemDef.modelZoom = 3500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 20585:
                itemDef.copyItem(5074);
                itemDef.name = "Calamity Pet";
                itemDef.modelID = 139777;
                itemDef.modelZoom = 3500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 20587:
                itemDef.copyItem(5074);
                itemDef.name = "Charybdis Pet";
                itemDef.modelID = 65158;
                itemDef.modelZoom = 4200;
                itemDef.rotationY = 520;
                itemDef.rotationX = 250;
                itemDef.scaleX = 32;
                itemDef.scaleY = 32;
                itemDef.scaleZ = 32;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 20588:
                itemDef.copyItem(5074);
                itemDef.name = "Scylla Pet";
                itemDef.modelID = 65158;
                itemDef.modelZoom = 4200;
                itemDef.rotationY = 520;
                itemDef.rotationX = 250;
                itemDef.scaleX = 32;
                itemDef.scaleY = 32;
                itemDef.scaleZ = 32;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                itemDef.rdc2 = 7656789;
                break;
            case 20590:
                itemDef.copyItem(5074);
                itemDef.name = "Ezkel-Nojad Pet";
                itemDef.modelID = 34131;
                itemDef.modelZoom = 7500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                itemDef.rdc2 = 3333;
                break;
            case 20602:
                itemDef.copyItem(5074);
                itemDef.name = "Janemba Pet";
                itemDef.modelID = 139761;
                itemDef.modelZoom = 7500;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                break;
            case 20603:
                itemDef.copyItem(5074);
                itemDef.name = "Frieza Pet";
                itemDef.modelID = 64364;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                itemDef.modelZoom = 2100;
                break;
            case 20604:
                itemDef.copyItem(5074);
                itemDef.name = "Perfect Cell Pet";
                itemDef.modelID = 64385;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                itemDef.modelZoom = 2100;
                break;
            case 20605:
                itemDef.copyItem(5074);
                itemDef.name = "Super Buu Pet";
                itemDef.modelID = 64383;
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                itemDef.modelZoom = 2100;
                break;
            case 13774:
                itemDef.copyItem(13323);
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                itemDef.name = "Goku Pet";
                break;
            case 13775:
                itemDef.copyItem(13328);
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                itemDef.name = "Byakuya Pet";
                break;
            case 4073:
                itemDef.name = "Fazula pet";
                itemDef.modelID = 141170;
                itemDef.modelZoom = 800;
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                itemDef.stackable = false;
                break;
            case 23082:
                itemDef.copyItem(5074);
                itemDef.name = "Vindicta Pet";
                itemDef.modelID = 100192;
                itemDef.modelZoom = 1500;
                itemDef.rotationY = 0;
                itemDef.rotationX = 0;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 23083:
                itemDef.copyItem(5074);
                itemDef.name = "Avaryss Pet";
                itemDef.modelID = 100143;
                itemDef.modelZoom = 2700;
                itemDef.rotationY = 0;
                itemDef.rotationX = 0;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 23084:
                itemDef.copyItem(5074);
                itemDef.name = "Conjkoined Pet";
                itemDef.modelID = 100145;
                itemDef.modelZoom = 2700;
                itemDef.rotationY = 0;
                itemDef.rotationX = 0;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 23085:
                itemDef.copyItem(5074);
                itemDef.name = "Nymora Pet";
                itemDef.modelID = 100147;
                itemDef.modelZoom = 2700;
                itemDef.rotationY = 0;
                itemDef.rotationX = 0;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 23161:
                itemDef.copyItem(5074);
                itemDef.name = "Demon Pet";
                itemDef.modelID = 100237;
                itemDef.modelZoom = 5500;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 23162:
                itemDef.copyItem(5074);
                itemDef.name = "Dragonite Pet";
                itemDef.modelID = 100238;
                itemDef.modelZoom = 4200;
                itemDef.rotationY = 520;
                itemDef.rotationX = 250;
                itemDef.scaleX = 32;
                itemDef.scaleY = 32;
                itemDef.scaleZ = 32;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 23163:
                itemDef.copyItem(5074);
                itemDef.name = "Golem Pet";
                itemDef.modelID = 100239;
                itemDef.modelZoom = 5000;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                break;
            case 23164:
                itemDef.copyItem(5074);
                itemDef.name = "Rammus Pet";
                itemDef.modelID = 100240;
                itemDef.modelZoom = 4500;
                itemDef.modelOffsetX = 0;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetY = 0;
                break;

            case 2947:

                itemDef.modelID = 64362;
                itemDef.modelOffsetX = 2;
                //itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                itemDef.modelZoom = 2100;
                itemDef.name = "Frieza Pet (first form)";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 2948:

                itemDef.modelID = 64363;
                itemDef.modelOffsetX = 2;
                //itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                itemDef.modelZoom = 2100;
                itemDef.name = "Frieza Pet (second form)";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 2949:

                itemDef.modelID = 64364;
                itemDef.modelOffsetX = 2;
                //itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                itemDef.modelZoom = 2100;
                itemDef.name = "Frieza Pet (final form)";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 6545:

                itemDef.modelID = 64385;
                itemDef.modelOffsetX = 2;
                //itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                itemDef.modelZoom = 2100;
                itemDef.name = "Perfect cell pet";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 15279:

                itemDef.modelID = 64381;
                itemDef.modelOffsetX = 2;
                //itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                itemDef.modelZoom = 2100;
                itemDef.name = "Majin Buu Pet";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 15278:

                itemDef.modelID = 64383;
                itemDef.modelOffsetX = 2;
                //itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
                itemDef.modelOffsetY = 80;
                itemDef.rotationY = 204;
                itemDef.rotationX = 20;
                itemDef.modelZoom = 2100;
                itemDef.name = "Super Buu Pet";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 11319:
                ItemDefinition zorbak = ItemDefinition.get(12479);
                itemDef.modelID = 64476;
                itemDef.modelOffsetX = zorbak.modelOffsetX;
                //itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
                itemDef.modelOffsetY = zorbak.modelOffsetY;
                itemDef.modelZoom = 2000;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.name = "Zorbak (elite) pet";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
                //itemDef.rdc2 = 664466;
                break;
            case 11310:
                ItemDefinition zorbak2 = ItemDefinition.get(12479);
                itemDef.modelID = 97666;
                itemDef.modelOffsetX = zorbak2.modelOffsetX;
                itemDef.modelOffsetY = zorbak2.modelOffsetY;
                itemDef.modelZoom = 6500;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.name = "Youtube JR Pet";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22107:
                itemDef.name = "Lucifer's pet";
                itemDef.modelID = 100000;
                itemDef.rotationX = 0;
                itemDef.rotationY = 468;
                itemDef.modelZoom = 694;
                itemDef.modelOffsetX = 7;
                itemDef.modelOffsetY = -7;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22116:
                itemDef.name = "Iron's pet";
                itemDef.modelID = 100026;
                itemDef.rotationX = 0;
                itemDef.rotationY = 468;
                itemDef.modelZoom = 694;
                itemDef.modelOffsetX = 7;
                itemDef.modelOffsetY = -7;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;

            case 461:
                itemDef.name = "Vegeta pet";
                itemDef.modelID = 65304;
                itemDef.modelZoom = 1100;
                itemDef.modelOffsetY = 160;

                itemDef.rotationZ = 1;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
                break;
            case 462:
                itemDef.modelID = 13850;
                itemDef.modelZoom = 900;
                itemDef.modelOffsetY = 160;
                itemDef.rotationZ = 1;
                itemDef.name = "Yoshi pet";
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
                break;
            case 11989:
                itemDef.name = "Pet Phoenix";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22014:
                itemDef.name = "Pet Skeleton Hellhound";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22015:
                itemDef.name = "Pet Maze Guardian";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
//            case 22018:
//                itemDef.name = "Pet Druid";
//                itemDefs = ItemDefinition.get(12458);
//                itemDef.modelID = itemDefs.modelID;
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.rotationZ = itemDefs.rotationZ;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.groundActions = new String[]{null, null, "Take", null, null};
//                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
//                break;
            case 22019:
                itemDef.name = "Pet Monkey Guard";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22020:
                itemDef.name = "Pet Clockwork Cat";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22021:
                itemDef.name = "Pet Jubbly Bird";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22022:
                itemDef.name = "Pet Dust Devil";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22023:
                itemDef.name = "Pet Abyssal Demon";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22024:
                itemDef.name = "Pet Chinchompa";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22025:
                itemDef.name = "Pet Golem";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22026:
                itemDef.name = "Pet Chaos Dwarf";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22027:
                itemDef.name = "Pet Shark";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22028:
                itemDef.name = "Pet Goblin Cook";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22029:
                itemDef.name = "Pet Fire Elemental";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22030:
                itemDef.name = "Pet Tree Spirit";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22031:
                itemDef.name = "Pet Leprechaun";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;

            case 22032:
                itemDef.name = "Night spider pet";
                itemDefs = ItemDefinition.get(18504);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;

            case 22033:
                itemDef.name = "Pet serpentine";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22049:
                itemDef.name = "Pet tanzanite";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;
            case 22055:
                itemDef.name = "Pet WildyWyrm";
                itemDefs = ItemDefinition.get(12458);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.groundActions = new String[]{null, null, "Take", null, null};
                itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
                break;


			case 23111:
				itemDef.copyItem(5074);
				itemDef.name = "Odin Pet";
				itemDef.modelID = 100199;
				itemDef.modelZoom = 3500;
				itemDef.rotationY = 0;
				itemDef.rotationX = 0;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				break;

			case 23113:
				itemDef.copyItem(5074);
				itemDef.name = "Demon Pet";
				itemDef.modelID = 100076;
				itemDef.modelZoom = 5000;
				itemDef.rotationY = 0;
				itemDef.rotationX = 0;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				break;
			case 23114:
				itemDef.copyItem(5074);
				itemDef.name = "Kil'jaeden Pet";
				itemDef.modelID = 100077;
				itemDef.modelZoom = 5500;
				itemDef.rotationY = 0;
				itemDef.rotationX = 0;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				break;
			case 23115:
				itemDef.copyItem(5074);
				itemDef.name = "Skreeg Pet";
				itemDef.modelID = 100078;
				itemDef.modelZoom = 5000;
				itemDef.rotationY = 0;
				itemDef.rotationX = 0;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				break;
			case 23116:
				itemDef.copyItem(5074);
				itemDef.name = "Orix Pet";
				itemDef.modelID = 100079;
				itemDef.modelZoom = 5000;
				itemDef.rotationY = 0;
				itemDef.rotationX = 0;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				break;
			case 23117:
				itemDef.copyItem(5074);
				itemDef.name = "Crystal orc Pet";
				itemDef.modelID = 100080;
				itemDef.modelZoom = 5500;
				itemDef.rotationY = 0;
				itemDef.rotationX = 0;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				break;
        }
        return itemDef;
    }
}
