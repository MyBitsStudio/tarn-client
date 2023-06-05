package org.necrotic.client.cache.definition;

public class CustomItems {

    public static ItemDefinition newIDS1(ItemDefinition itemDef, int id) {

        ItemDefinition itemDef2;
        switch(id){
            case 23200:
                itemDef.copyItem(23107);
                itemDef.name = "Raid Key I";
                itemDef.actions = new String[]{"Teleport", "Use", null, null, "Drop"};
                itemDef.modelID = 100235;
                itemDef.modelZoom = 400;
                break;

            case 23201:
                itemDef.copyItem(23107);
                itemDef.name = "Raid Key II";
                itemDef.actions = new String[]{"Teleport", "Use", null, null, "Drop"};
                itemDef.modelID = 100235;
                itemDef.modelZoom = 400;
                break;

            case 23202:
                itemDef.copyItem(23107);
                itemDef.name = "Raid Key III";
                itemDef.actions = new String[]{"Teleport", "Use", null, null, "Drop"};
                itemDef.modelID = 100235;
                itemDef.modelZoom = 400;
                break;

            case 23203:
                //itemDef.copyItem(995);
                itemDef.name = "<col=842e00><shad=0>T-Token<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[2] = "Convert To Billions";
                itemDef.modelID = 15044;
                itemDef.modelZoom = 1100;
                itemDef.rotationX = 0;
                itemDef.rotationY = 520;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                itemDef.stackAmounts = null;
                itemDef.stackIDs = null;
//				itemDef.newModelColor[0] = 63; // the texture that it currently has
//				itemDef.editedModelColor[0] = 59;

                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;

            case 23204:
                itemDef.copyItem(21816);
                itemDef.name = "@blu@Donator Ticket";
                itemDef.actions = new String[]{null, null, null, null, null};
                break;

            case 23205:
                itemDef.copyItem(21816);
                itemDef.name = "@blu@Voting Ticket";
                itemDef.actions = new String[]{null, null, null, null, null};
                break;

            case 23206:
                itemDef.copyItem(20435);
                itemDef.name = "@blu@AOE Token";
                itemDef.actions = new String[]{null, null, null, null, null};
                break;

            case 23207:
                itemDef.copyItem(20435);
                itemDef.name = "@blu@Drop Rate Token";
                itemDef.actions = new String[]{null, null, null, null, null};
                break;

            case 23208:
                itemDef.copyItem(20435);
                itemDef.name = "@blu@Damage High Token";
                itemDef.actions = new String[]{null, null, null, null, null};
                break;

            case 23209:
                itemDef.copyItem(21816);
                itemDef.name = "@blu@Elite Voting Ticket";
                itemDef.stackable = true;
                itemDef.actions = new String[]{null, null, null, null, null};
                break;

            case 23210:
                itemDef.copyItem(6103);
                itemDef.name = "@yel@Event Crystal";
                itemDef.stackable = true;
                itemDef.actions = new String[]{"Combine", null, null, null, null};
                break;

            case 23211:
                itemDef.copyItem(21816);
                itemDef.name = "@blu@Flash Deal Ticket";
                itemDef.stackable = true;
                itemDef.actions = new String[]{null, null, null, null, null};
                break;

            case 23212:
                itemDef.copyItem(23049);
                itemDef.name = "Aura 7";
                break;

            case 23213:
                itemDef.copyItem(20661);
                itemDef.name = "Golden Statue";
                itemDef.actions = new String[]{null, "Equip", null, null, null};
                break;

            case 15682:
                itemDef.name = "Vote Crate";
                itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
                break;
            case 20488:
                itemDef.name = "<col=afafb2><shad=1299>Devoted Box<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15156;

                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20489:
                itemDef.name = "<col=a18f00><shad=0>Infamous Box<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 14954;

                //itemDef.rdc2 = 12111;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20490:
                itemDef.name = "<col=a48a4c><shad=110100>Sacred Box<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 2;
                itemDef.modelZoom = 1100;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15142;

                //itemDef.rdc2 = 12111;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20491:
                itemDef.name = "<col=555557><shad=110100>Damnation Box<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 2;
                itemDef.modelZoom = 1100;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15031;

                //itemDef.rdc2 = 55555;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20506:
                itemDef.name = "<col=555557><shad=110100>Enhancement Chest<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 2;
                itemDef.modelZoom = 1100;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15163;

                //itemDef.rdc2 = 55555;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20507:
                itemDef.name = "<col=555557><shad=110100>Owners Ultimate Chest<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 2;
                itemDef.modelZoom = 1100;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15164;

                //itemDef.rdc2 = 55555;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20498:
                itemDef.name = "<col=a18f00><shad=0>Ticket Pack<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15159;

                //itemDef.rdc2 = 12111;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20500:
                itemDef.name = "<col=a18f00><shad=0>Counter Pack<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15160;

                //itemDef.rdc2 = 12111;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20501:
                itemDef.name = "<col=a18f00><shad=0>Event Pack<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15161;

                //itemDef.rdc2 = 12111;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20502:
                itemDef.name = "<col=a18f00><shad=0>Donator Pack<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15162;

                //itemDef.rdc2 = 12111;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 15002:
                itemDef.name = "<col=958aa6><shad=0>Gracious Box<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 14951;

                //itemDef.rdc2 = 92111;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 15355:
                itemDef.name = "@gre@<shad=0>Double DR Scroll (1 Hour)<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Activate";
                itemDef.rdc2 = 921211;
                break;
            case 15356:
                itemDef.name = "@gre@<shad=0>Double DDR Scroll (1 Hour)<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Activate";
                itemDef.rdc2 = 348132;
                break;
            case 15357:
                itemDef.name = "@gre@<shad=0>Double Damage Scroll (1 Hour)<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Activate";
                itemDef.rdc2 = 23333;
                break;
            case 15358:
                itemDef.name = "@gre@<shad=0>Double DR Scroll (30 Minutes)<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Activate";
                itemDef.rdc2 = 663712;
                break;
            case 15359:
                itemDef.name = "@gre@<shad=0>Double Damage Scroll (30 Minutes)<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Activate";
                itemDef.rdc2 = 12411;
                break;
            case 15003:
                itemDef.name = "<col=842e00><shad=0>Cursed Box<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 14945;

                //itemDef.rdc2 = 988331;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20504:
                itemDef.name = "<col=842e00><shad=0>AoE Token [2x2]<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 139920;

                //itemDef.rdc2 = 988331;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20505:
                itemDef.name = "<col=842e00><shad=0>Youtube Box<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15113;

                //itemDef.rdc2 = 988331;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 15004:
                itemDef.name = "<col=05519a><shad=0>Majestic Box<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 14944;

                //itemDef.rdc2 = 129911;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 19659:
                itemDef.name = "Summer's Present";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef2 = ItemDefinition.get(6199);
                itemDef.modelOffsetX = itemDef2.modelOffsetX;
                itemDef.rotationZ = itemDef2.rotationZ;
                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = 1600;
                // itemDef.modelID = itemDef2.modelID;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;

                itemDef.modelID = 64099;
                itemDef.rdc2 = 32521;
                break;

            case 7587:
                itemDef.name = "Coffin of the Damned";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                break;

            case 19129:
                itemDef.name = "Steel boots";
                itemDef.modelID = 65226;
                itemDef.maleEquip1 = 65226;
                itemDef.femaleEquip1 = 65226;
                itemDef2 = ItemDefinition.get(3791);
                itemDef.modelOffsetX = itemDef2.modelOffsetX;
                itemDef.rotationZ = itemDef2.rotationZ;
                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.actions = new String[5];
                itemDef.actions[4] = "Drop";
                itemDef.actions[3] = "Upgrade-boots";
                itemDef.actions[1] = "Wear"/*done*/; //done
                itemDef.actions[2] = "Dissolve";
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 60; // the texture that it currently has
                itemDef.editedModelColor[0] = 62; // the new texture u want it to have
                itemDef.stackable = false;
                break;

            case 3686:
                itemDef.name = "<col=4689fe>Premium Ticket";
                itemDef.rdc2 = 999122;
                itemDef2 = ItemDefinition.get(5020);
                // itemDef.modelID = itemDef2.modelID;
                itemDef.modelID = itemDef2.modelID;
                itemDef.femaleEquip1 = itemDef2.femaleEquip1;
                itemDef.maleEquip1 = itemDef2.maleEquip1;
                itemDef.modelOffsetX = itemDef2.modelOffsetX;
                itemDef.rotationZ = itemDef2.rotationZ;
                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                // itemDef.rdc2 = ;
                itemDef.stackable = true;
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                break;

            case 10027:
                itemDef.name = "@whi@Progressive Box [T3]";
                itemDef.rdc2 = 2536531;
                itemDef.actions = new String[]{"Open", null, null, null, "Drop"};

                break;

            case 22083:
                itemDef.name = "<col=a69eb6>Starter Cannon";
                itemDef2 = ItemDefinition.get(20538);

                itemDef.modelID = 65426;
                itemDef.femaleEquip1 = 65427;
                itemDef.maleEquip1 = 65427;
                itemDef.modelOffsetX = itemDef2.modelOffsetX;
                itemDef.rotationZ = itemDef2.rotationZ;
                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.newModelColor = new int[]{55};
                itemDef.editedModelColor = new int[]{40};
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.stackable = false;
                break;

            case 22092:
                itemDef.name = "<col=a69eb6>Starter Staff";
                itemDef2 = ItemDefinition.get(15486);
                // itemDef.modelID = itemDef2.modelID;
                itemDef.modelID = 65418;
                itemDef.femaleEquip1 = 65419;
                itemDef.maleEquip1 = 65419;
                itemDef.modelOffsetX = itemDef2.modelOffsetX;
                itemDef.rotationZ = itemDef2.rotationZ;
                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{52};
                itemDef.editedModelColor = new int[]{40};
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            case 22084:
                itemDef.name = "<col=a69eb6>Starter Blade";
                itemDef2 = ItemDefinition.get(20538);
                // itemDef.modelID = itemDef2.modelID;
                itemDef.modelID = 65428;
                itemDef.femaleEquip1 = 65429;
                itemDef.maleEquip1 = 65429;
                itemDef.modelOffsetX = itemDef2.modelOffsetX;
                itemDef.rotationZ = itemDef2.rotationZ;
                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.stackable = false;
                itemDef.newModelColor = new int[]{52};
                itemDef.editedModelColor = new int[]{40};
                break;

            case 19135:
                itemDef.newModelColor = new int[]{40, 24};
                itemDef.editedModelColor = new int[]{66, 66};
                // itemDef.originalModelColors = new int[1]; // if only 1 texture is modified
                // this has to be 1, if 2 then 2 etc
                // itemDef.modifiedModelColors = new int[1]; // same here
                // itemDef.modifiedModelColors[0] = 40; // the texture that it currently has
                // itemDef.originalModelColors[0] = 66; // the new texture u want it to have
                itemDef.name = "Aberrant Minigun";
                itemDef2 = ItemDefinition.get(20538);
                itemDef.modelID = 65210;
                itemDef.femaleEquip1 = 65211;
                itemDef.maleEquip1 = 65211;// 95099
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.modelOffsetX = itemDef2.modelOffsetX;
                itemDef.rotationZ = itemDef2.rotationZ;
                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.stackable = false;
                break;

            case 18753:
                itemDef.name = "<col=eed81d><shad=9283>Maxiblood helm<shad-1>";
                itemDef.modelID = 65130;
                itemDef.maleEquip1 = 65131;
                itemDef.femaleEquip1 = 65131;
                itemDef2 = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDef2.modelOffsetX;

                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 40; // the texture that it currently has
                itemDef.editedModelColor[0] = 66;
                itemDef.stackable = false;
                break;
            case 18752:
                itemDef.name = "<col=eed81d><shad=9283>Maxiblood platebody<shad-1>";
                itemDef.modelID = 65132;
                itemDef.maleEquip1 = 65133;
                itemDef.femaleEquip1 = 65133;
                itemDef2 = ItemDefinition.get(4894);
                itemDef.modelOffsetX = 1;

                itemDef.modelOffsetY = -10;
                itemDef.modelZoom = 1400;
                itemDef.rotationY = 700;
                itemDef.rotationX = 1;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 40; // the texture that it currently has
                itemDef.editedModelColor[0] = 66;
                itemDef.stackable = false;
                break;
            case 18751:
                itemDef.name = "<col=eed81d><shad=9283>Maxiblood legs<shad-1>";
                itemDef.modelID = 65134;
                itemDef.maleEquip1 = 65135;
                itemDef.femaleEquip1 = 65135;
                itemDef2 = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDef2.modelOffsetX;

                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = 1800;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 40; // the texture that it currently has
                itemDef.editedModelColor[0] = 66;
                itemDef.stackable = false;
                break;
            case 18749:
                itemDef.name = "<col=fb9ae5><shad=9283>Corrupt archie helm<shad-1>";
                itemDef.modelID = 65231;
                itemDef.maleEquip1 = 65232;
                itemDef.femaleEquip1 = 65232;
                itemDef2 = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDef2.modelOffsetX;
                //itemDef.modelOffsetX = itemDef21.modelOffsetX;
                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};

                //	itemDef.originalModelColors = new int[] { 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40 };
                //	itemDef.originalModelColors = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                //	itemDef.modifiedModelColors = new int[1]; // same here
                //	itemDef.modifiedModelColors[0] = 60; // the texture that it currently has
                //	itemDef.originalModelColors[0] = 52; // the new texture u want it to have
                itemDef.stackable = false;
                break;
            case 18748:
                itemDef.name = "<col=fb9ae5><shad=9283>Corrupt archie body<shad-1>";
                itemDef.modelID = 65233;
                itemDef.maleEquip1 = 65234;
                itemDef.femaleEquip1 = 65234;
                itemDef2 = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDef2.modelOffsetX;
                //	itemDef.modelOffsetX = itemDef21.modelOffsetX;
                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};


                //		itemDef.originalModelColors = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                //	itemDef.modifiedModelColors = new int[1]; // same here
                //	itemDef.modifiedModelColors[0] = 60; // the texture that it currently has
                //	itemDef.originalModelColors[0] = 52; // the new texture u want it to have
                itemDef.stackable = false;
                break;
            case 18638:
                itemDef.name = "<col=fb9ae5><shad=9283> Corrupt archie chaps<shad-1>";
                itemDef.modelID = 65235;
                itemDef.maleEquip1 = 65236;
                itemDef.femaleEquip1 = 65236;// im not lagging
                itemDef2 = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDef2.modelOffsetX;

                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};

                //	itemDef.originalModelColors = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                //		itemDef.modifiedModelColors = new int[1]; // same here
//			itemDef.modifiedModelColors[0] = 60; // the texture that it currently has

                itemDef.stackable = false;
                break;
            case 18631:
                itemDef.name = "<col=57d0fd><shad=9283>Corrupt moonlight hood<shad-1>";
                itemDef.modelID = 65296;
                itemDef.maleEquip1 = 65297;
                itemDef.femaleEquip1 = 65297;
                itemDef2 = ItemDefinition.get(4882);
                itemDef.modelOffsetX = itemDef2.modelOffsetX;

                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 40; // the texture that it currently has
                itemDef.editedModelColor[0] = 57;
                itemDef.stackable = false;
                break;
            case 18637:
                itemDef.name = "<col=57d0fd><shad=9283>Corrupt moonlight robetop<shad-1>";
                itemDef.modelID = 65298;
                itemDef.maleEquip1 = 65299;
                itemDef.femaleEquip1 = 65299;
                itemDef2 = ItemDefinition.get(4894);
                itemDef.modelOffsetX = itemDef2.modelOffsetX;

                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 40; // the texture that it currently has
                itemDef.editedModelColor[0] = 57;
                itemDef.stackable = false;
                break;
            case 18623:
                itemDef.name = "<col=57d0fd><shad=9283>Corrupt moonlight robebottom<shad-1>";
                itemDef.modelID = 65300;
                itemDef.maleEquip1 = 65301;
                itemDef.femaleEquip1 = 65301;
                itemDef2 = ItemDefinition.get(4900);
                itemDef.modelOffsetX = itemDef2.modelOffsetX;

                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 40; // the texture that it currently has
                itemDef.editedModelColor[0] = 57;
                itemDef.stackable = false;
                break;

            case 23021:
                itemDef.copyItem(4708);
                itemDef.name = "Mystic helm";
                itemDef.modelID = 100084;
                itemDef.maleEquip1 = 100085;
                itemDef.femaleEquip1 = 100085;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23022:
                itemDef.copyItem(4712);
                itemDef.name = "Mystic body";
                itemDef.modelID = 100093;
                itemDef.maleEquip1 = 100094;
                itemDef.femaleEquip1 = 100094;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23023:
                itemDef.copyItem(4714);
                itemDef.name = "Mystic legs";
                itemDef.modelID = 100091;
                itemDef.maleEquip1 = 100092;
                itemDef.femaleEquip1 = 100092;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23024:
                itemDef.copyItem(4708);
                itemDef.name = "Mystic gloves";
                itemDef.modelID = 100089;
                itemDef.maleEquip1 = 100090;
                itemDef.femaleEquip1 = 100090;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23025:
                itemDef.copyItem(4708);
                itemDef.name = "Mystic boots";
                itemDef.modelID = 100088;
                itemDef.maleEquip1 = 100088;
                itemDef.femaleEquip1 = 100088;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23026:
                itemDef.copyItem(1391);
                itemDef.name = "Mystic staff";
                itemDef.modelZoom = 2000;
                itemDef.rotationZ = 10;
                itemDef.modelOffsetX = 10;
                itemDef.modelID = 100095;
                itemDef.maleEquip1 = 100096;
                itemDef.femaleEquip1 = 100096;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23027:
                itemDef.copyItem(3841);
                itemDef.name = "Mystic book";
                itemDef.modelID = 100086;
                itemDef.maleEquip1 = 100087;
                itemDef.femaleEquip1 = 100087;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;


            case 23028:
                itemDef.copyItem(4708);
                itemDef.name = "Nightmare helm";
                itemDef.modelZoom = 500;
                itemDef.modelID = 100105;
                itemDef.maleEquip1 = 100106;
                itemDef.femaleEquip1 = 100106;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23029:
                itemDef.copyItem(4712);
                itemDef.name = "Nightmare body";
                itemDef.modelID = 100098;
                itemDef.maleEquip1 = 100099;
                itemDef.femaleEquip1 = 100099;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23030:
                itemDef.copyItem(4714);
                itemDef.name = "Nightmare legs";
                itemDef.modelID = 100107;
                itemDef.maleEquip1 = 100108;
                itemDef.femaleEquip1 = 100108;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23031:
                itemDef.copyItem(4708);
                itemDef.name = "Nightmare gloves";
                itemDef.modelID = 100101;
                itemDef.maleEquip1 = 100102;
                itemDef.femaleEquip1 = 100102;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23032:
                itemDef.copyItem(4708);
                itemDef.name = "Nightmare boots";
                itemDef.modelID = 100100;
                itemDef.maleEquip1 = 100100;
                itemDef.femaleEquip1 = 100100;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23033:
                itemDef.copyItem(4710);
                itemDef.name = "Nightmare hammers";
                itemDef.modelID = 100103;
                itemDef.maleEquip1 = 100104;
                itemDef.femaleEquip1 = 100104;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;


            case 23034:
                itemDef.copyItem(4708);
                itemDef.name = "Patience helm";
                itemDef.modelID = 100117;
                itemDef.maleEquip1 = 100118;
                itemDef.femaleEquip1 = 100118;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23035:
                itemDef.copyItem(4712);
                itemDef.name = "Patience body";
                itemDef.modelID = 100119;
                itemDef.maleEquip1 = 100115;
                itemDef.femaleEquip1 = 100115;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23036:
                itemDef.copyItem(4714);
                itemDef.name = "Patience legs";
                itemDef.modelID = 100120;
                itemDef.maleEquip1 = 100121;
                itemDef.femaleEquip1 = 100121;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23037:
                itemDef.copyItem(4708);
                itemDef.name = "Patience gloves";
                itemDef.modelID = 100112;
                itemDef.maleEquip1 = 100113;
                itemDef.femaleEquip1 = 100113;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23038:
                itemDef.copyItem(4708);
                itemDef.name = "Patience boots";
                itemDef.modelID = 100116;
                itemDef.maleEquip1 = 100116;
                itemDef.femaleEquip1 = 100116;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;
            case 23039:
                itemDef.copyItem(4710);
                itemDef.name = "Patience bow";
                itemDef.modelID = 100110;
                itemDef.maleEquip1 = 100111;
                itemDef.femaleEquip1 = 100111;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                break;

            case 8089:
                itemDef.name = "Tarn Staff";
                itemDef.modelID = 64360;
                itemDef.maleEquip1 = 64361;
                itemDef.femaleEquip1 = 64361;
                itemDef2 = ItemDefinition.get(1385);
                itemDef.modelOffsetX = itemDef2.modelOffsetX;
                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = 2000;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear"/*done*/; //done
                itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";
                itemDef.stackable = false;

                itemDef.rdc2 = 12345;
                break;


            /**
             * Possible??
             */

//            case 19133:
//                itemDef.name = "Thunder Partyhat";
//                itemDef.modelID = 65286;
//                itemDef.maleEquip1 = 65287;
//                itemDef.femaleEquip1 = 65287;
//                itemDef21 = ItemDefinition.get(1040);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 56; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18415:
//                itemDef.name = "Lava Partyhat";
//                itemDef.modelID = 65286;
//                itemDef.maleEquip1 = 65287;
//                itemDef.femaleEquip1 = 65287;
//                itemDef21 = ItemDefinition.get(1040);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 40; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18416:
//                itemDef.name = "Water Partyhat";
//                itemDef.modelID = 65286;
//                itemDef.maleEquip1 = 65287;
//                itemDef.femaleEquip1 = 65287;
//                itemDef21 = ItemDefinition.get(1040);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 51; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
            case 18417:
                itemDef.name = "Firehell Partyhat";
                itemDef.modelID = 65286;
                itemDef.maleEquip1 = 65287;
                itemDef.femaleEquip1 = 65287;
                itemDef2 = ItemDefinition.get(1040);
                itemDef.modelOffsetX = itemDef2.modelOffsetX;
                itemDef.rotationZ = itemDef2.rotationZ;
                itemDef.modelOffsetY = itemDef2.modelOffsetY;
                itemDef.modelZoom = itemDef2.modelZoom;
                itemDef.rotationY = itemDef2.rotationY;
                itemDef.rotationX = itemDef2.rotationX;
                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
                itemDef.newModelColor = new int[1]; // same here
                itemDef.newModelColor[0] = 40; // the texture that it currently has
                itemDef.editedModelColor[0] = 52; // the new texture u want it to have
                itemDef.stackable = false;
                break;
//            case 18418:
//                itemDef.name = "@mag@Velvet Partyhat";
//                itemDef.modelID = 65286;
//                itemDef.maleEquip1 = 65287;
//                itemDef.femaleEquip1 = 65287;
//                itemDef21 = ItemDefinition.get(1040);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 54; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18419:
//                itemDef.name = "Universal Partyhat";
//                itemDef.modelID = 65286;
//                itemDef.maleEquip1 = 65287;
//                itemDef.femaleEquip1 = 65287;
//                itemDef21 = ItemDefinition.get(1040);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 66; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 19134:
//                itemDef.name = "Staff Santa hat";
//                itemDef.modelID = 65288;
//                itemDef.maleEquip1 = 65289;
//                itemDef.femaleEquip1 = 65289;
//                itemDef21 = ItemDefinition.get(1050);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 74; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18410:
//                itemDef.name = "Universal Santa hat";
//                itemDef.modelID = 65288;
//                itemDef.maleEquip1 = 65289;
//                itemDef.femaleEquip1 = 65289;
//                itemDef21 = ItemDefinition.get(1050);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 66; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18411:
//                itemDef.name = "Skyrocket Santa hat";
//                itemDef.modelID = 65288;
//                itemDef.maleEquip1 = 65289;
//                itemDef.femaleEquip1 = 65289;
//                itemDef21 = ItemDefinition.get(1050);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 57; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18412:
//                itemDef.name = "Hellfire Santa hat";
//                itemDef.modelID = 65288;
//                itemDef.maleEquip1 = 65289;
//                itemDef.femaleEquip1 = 65289;
//                itemDef21 = ItemDefinition.get(1050);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 54; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18413:
//                itemDef.name = "Leafy Santa hat";
//                itemDef.modelID = 65288;
//                itemDef.maleEquip1 = 65289;
//                itemDef.femaleEquip1 = 65289;
//                itemDef21 = ItemDefinition.get(1050);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 55; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18414:
//                itemDef.name = "Velvet Santa hat";
//                itemDef.modelID = 65288;
//                itemDef.maleEquip1 = 65289;
//                itemDef.femaleEquip1 = 65289;
//                itemDef21 = ItemDefinition.get(1050);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 56; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 19132:
//                itemDef.name = "Staff H'ween mask";
//                itemDef.modelID = 65290;
//                itemDef.maleEquip1 = 65291;
//                itemDef.femaleEquip1 = 65291;
//                itemDef21 = ItemDefinition.get(4716);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 74; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18405:
//                itemDef.name = "Universal H'ween mask";
//                itemDef.modelID = 65290;
//                itemDef.maleEquip1 = 65291;
//                itemDef.femaleEquip1 = 65291;
//                itemDef21 = ItemDefinition.get(4716);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 66; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18406:
//                itemDef.name = "Skyrocket H'ween mask";
//                itemDef.modelID = 65290;
//                itemDef.maleEquip1 = 65291;
//                itemDef.femaleEquip1 = 65291;
//                itemDef21 = ItemDefinition.get(4716);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 57; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18407:
//                itemDef.name = "Hellfire H'ween mask";
//                itemDef.modelID = 65290;
//                itemDef.maleEquip1 = 65291;
//                itemDef.femaleEquip1 = 65291;
//                itemDef21 = ItemDefinition.get(4716);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 54; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18408:
//                itemDef.name = "Leafy H'ween mask";
//                itemDef.modelID = 65290;
//                itemDef.maleEquip1 = 65291;
//                itemDef.femaleEquip1 = 65291;
//                itemDef21 = ItemDefinition.get(4716);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 55; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
//            case 18409:
//                itemDef.name = "Velvet H'ween mask";
//                itemDef.modelID = 65290;
//                itemDef.maleEquip1 = 65291;
//                itemDef.femaleEquip1 = 65291;
//                itemDef21 = ItemDefinition.get(4716);
//                itemDef.modelOffsetX = itemDef21.modelOffsetX;
//                itemDef.rotationZ = itemDef21.rotationZ;
//                itemDef.modelOffsetY = itemDef21.modelOffsetY;
//                itemDef.modelZoom = itemDef21.modelZoom;
//                itemDef.rotationY = itemDef21.rotationY;
//                itemDef.rotationX = itemDef21.rotationX;
//                itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//                itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//                itemDef.newModelColor = new int[1]; // same here
//                itemDef.newModelColor[0] = 40; // the texture that it currently has
//                itemDef.editedModelColor[0] = 56; // the new texture u want it to have
//                itemDef.stackable = false;
//                break;
        }
        return itemDef;
    }
}
