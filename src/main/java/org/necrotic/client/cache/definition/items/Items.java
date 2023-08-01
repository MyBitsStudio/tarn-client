package org.necrotic.client.cache.definition.items;

import org.necrotic.client.cache.definition.ItemDefinition;

public class Items {

    public static ItemDefinition newDef(ItemDefinition itemDef, int id) {
        ItemDefinition itemDefs;
        switch (id) {

            case 995:
                itemDef.name = "<col=a48a4c><shad=110100>Coins<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[2] = "Convert to Tokens";
                itemDef.modelID = 15043;
                itemDef.modelZoom = 1100;
                itemDef.rotationX = 0;
                itemDef.rotationY = 520;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                itemDef.stackAmounts = null;
                itemDef.stackIDs = null;

                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 10835:
                itemDef.name = "<col=842e00><shad=0>Tokens<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[2] = "Convert to Coins";
                itemDef.modelID = 15044;
                itemDef.modelZoom = 1100;
                itemDef.rotationX = 0;
                itemDef.rotationY = 520;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                itemDef.stackAmounts = null;
                itemDef.stackIDs = null;

                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20503:
                itemDef.name = "<col=05519a><shad=0>Upgrade Token<shad-1>";
                itemDef.actions = new String[5];
                itemDef.modelID = 15063;
                itemDef.modelZoom = 1100;
                itemDef.rotationX = 0;
                itemDef.rotationY = 520;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                itemDef.stackAmounts = null;
                itemDef.stackIDs = null;

                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 455:
                itemDef.name = "Scratch Card";
                break;
            case 22121:
                itemDef.name = "Rare Card I";
                itemDef.actions = new String[]{"Scratch", null, null, null, "Drop"};
                itemDef.modelID = 100053;
                itemDef.modelZoom = 1171;
                itemDef.rotationX = 322;
                itemDef.rotationY = 525;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetX = 4;
                itemDef.modelOffsetY = -3;
                break;
            case 23020:
                itemDef.copyItem(19670);
                itemDef.name = "Vote Scroll";
                itemDef.rdc2 = 15345;
                break;
            case 23057:
                itemDef.copyItem(1);
                itemDef.name = "$10 Bond";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.modelID = 100148;
                itemDef.rotationX = 0;
                itemDef.modelZoom = 2500;
                break;
            case 23058:
                itemDef.copyItem(23057);
                itemDef.name = "$25 Bond";
                itemDef.modelID = 100149;
                break;
            case 23059:
                itemDef.copyItem(23057);
                itemDef.name = "$100 Bond";
                itemDef.modelID = 100150;
                break;
            case 23060:
                itemDef.copyItem(23057);
                itemDef.name = "$250 Bond";
                itemDef.modelID = 100151;
                break;
            case 10946:
                itemDef.name = "$1 Scroll";
                itemDef.actions = new String[5];
                itemDef.actions[4] = "Drop";
                itemDef.actions[0] = "Claim";
                itemDef.actions[2] = "Claim all";
                itemDefs = ItemDefinition.get(761);
                itemDef.modelID = itemDefs.modelID;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelZoom = 1300;
                break;
            case 2023:
                itemDef.name = "Lava Bones";
                itemDef.newModelColor = new int[]{63};
                itemDefs = ItemDefinition.get(526);
                itemDef.editedModelColor = new int[]{40};
                itemDef.actions = itemDefs.actions;
                itemDef.modelID = 65285;
                itemDef.modelZoom = 1500;
                break;
            case 3686:
                itemDef.name = "<col=4689fe>Premium Ticket";
                itemDef.rdc2 = 999122;
                itemDefs = ItemDefinition.get(5020);
                itemDef.modelID = itemDefs.modelID;
                itemDef.femaleEquip1 = itemDefs.femaleEquip1;
                itemDef.maleEquip1 = itemDefs.maleEquip1;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                // itemDef.rdc2 = ;
                itemDef.stackable = true;
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                break;
            case 12852:
                itemDef.name = "Starter token";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Redeem";
                break;
            case 23147:
                itemDef.copyItem(1505);
                itemDef.name = "Rare Perk Token";
                itemDef.modelID = 100301;
                itemDef.modelZoom = 1500;
                itemDef.actions = new String[]{"Activate", null, null, null, "Destroy"};
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                itemDef.rotationZ = 0;
                break;
            case 23148:
                itemDef.copyItem(23147);
                itemDef.name = "Common Perk Token";
                itemDef.modelID = 100302;
                itemDef.modelZoom = 1600;
                break;
            case 23149:
                itemDef.copyItem(23147);
                itemDef.name = "Perk Token";
                itemDef.modelID = 100303;
                itemDef.modelZoom = 1600;
                break;


            case 21816:
                itemDef.name = "@red@1% DR & Double Drop Ticket";
                itemDef.actions = new String[]{null, null, null, null, null};
                break;
            case 21815:
                itemDef.name = "@gre@1% DR Ticket";
                itemDef.actions = new String[]{null, null, null, null, null};
                break;
            case 21814:
                itemDef.name = "@blu@1% Double Drop Ticket";
                itemDef.actions = new String[]{null, null, null, null, null};
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
            case 17544:
                itemDef.name = "@cya@<shad=272625> Aggro Potion (Godly)<shad-1>";
                itemDef.rdc2 = 5774;
                itemDef.modelZoom = 600;
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                break;
            case 17546:
                itemDef.name = "<col=969695><shad=272625> Aggro Potion (Mortal)<shad-1>";
                itemDef.rdc2 = 9090;
                itemDef.modelZoom = 600;
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                break;
            case 17542:
                itemDef.name = "<col=ff0000><shad=272625>Aggro Potion (Divine)<shad-1>";
                itemDef.rdc2 = 42500;
                itemDef.modelZoom = 600;
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                break;
            case 17540:
                itemDef.name = "<col=ff0000><shad=272625>Infinite Super Overload<shad-1>";
                itemDef.rdc2 = 42500;
                itemDef.modelZoom = 600;
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                break;
            case 15328:
                itemDef.name = "<shad=1><col=ff0000>Infinity Rage Potion";
                break;
            case 15330:
                itemDef.name = "<shad=1><col=ff0000>Infinite Super Overload";
                itemDef.actions = new String[]{"Drink", null, "Upgrade", null, "Drop"};
                break;
            case 27:
                itemDef.name = "<img=15>VIP Slayer Gem";
                itemDef.actions = new String[]{"Teleport to task", null, "Teleport to Elite", "Teleport To Master", "Drop"};
                itemDef.rdc2 = 37483;
                itemDefs = ItemDefinition.get(4155);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = itemDefs.modelID;
                break;
            case 23165:
                itemDef.copyItem(1505);
                itemDef.name = "Knight prayer scroll";
                itemDef.modelID = 100318;
                itemDef.actions = new String[]{"Claim", null, null, null, null};
                itemDef.modelZoom = 2600;
                itemDef.rotationX = 1534;
                itemDef.rotationY = 554;
                itemDef.modelOffsetX = -4;
                itemDef.modelOffsetY = 0;
                break;
            case 23166:
                itemDef.copyItem(23165);
                itemDef.name = "Trinity prayer scroll";
                itemDef.modelID = 100316;
                break;
            case 23167:
                itemDef.copyItem(23165);
                itemDef.name = "Warlock prayer scroll";
                itemDef.modelID = 100317;
                break;
            case 23168:
                itemDef.copyItem(23165);
                itemDef.name = "Marksman prayer scroll";
                itemDef.modelID = 100319;
                break;
            case 23169:
                itemDef.copyItem(23165);
                itemDef.name = "Sovereignty prayer scroll";
                itemDef.modelID = 100320;
                break;
            case 23170:
                itemDef.copyItem(23165);
                itemDef.name = "Prosperous prayer scroll";
                itemDef.modelID = 100315;
                break;
                
            case 23174:
                itemDef.copyItem(10936);
                itemDef.name = "10% DR enchantment";
                itemDef.rdc2 = 456;
                itemDef.actions = new String[5];
                break;
            case 23178:
                itemDef.copyItem(10936);
                itemDef.name = "100% DR enchantment";
                itemDef.rdc2 = 54666;
                itemDef.actions = new String[5];
                break;
            case 882:
                itemDef.name = "Starter arrow";
                break;
            case 14819:
                itemDef.name = "x2 Slayer XP Certificate";
                break;
            case 9719:
                itemDef.name = "Slayer skip scroll";
                break;
            case 14822:
                itemDef.name = "<img=15>VIP Slayer License";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                break;
            case 20481:
                itemDef.name = "Summoning charm box";
                itemDefs = ItemDefinition.get(7630);
                itemDef.modelID = itemDefs.modelID;
                itemDef.rdc2 = 23454;
                itemDef.actions = itemDefs.actions;
                itemDef.modelZoom = itemDefs.modelZoom;
                break;

            case 23150:
                itemDef.copyItem(20435);
                itemDef.name = "Drop Rate Low";
                itemDef.actions = new String[]{"Equip", null, null, null, null};
                break;

            case 23151:
                itemDef.copyItem(23150);
                itemDef.name = "Double XP";
                break;

            case 23152:
                itemDef.copyItem(23150);
                itemDef.name = "Double Drop";
                break;

            case 23153:
                itemDef.copyItem(23150);
                itemDef.name = "Double Rate Medium";
                break;

            case 23154:
                itemDef.copyItem(23150);
                itemDef.name = "Multi Kills";
                break;

            case 23155:
                itemDef.copyItem(23150);
                itemDef.name = "Double Cash";
                break;

            case 23156:
                itemDef.copyItem(23150);
                itemDef.name = "Damage Boost";
                break;

            case 23157:
                itemDef.copyItem(23150);
                itemDef.name = "AOE";
                break;

            case 23158:
                itemDef.copyItem(23150);
                itemDef.name = "Drop Rate High";
                break;

            case 23159:
                itemDef.copyItem(23150);
                itemDef.name = "Triple Cash";
                break;

            case 23160:
                itemDef.copyItem(23150);
                itemDef.name = "Multi Shot";
                break;


                /* Packs */
            case 23200:
                itemDef.name = TierColor.BEGGINER.getColor() +"Blurite Box";
                itemDef.copyItem(14488);
                break;
            case 23201:
                itemDef.name = TierColor.BEGGINER.getColor() +"Nagi Box";
                itemDef.copyItem(14488);
                break;
            case 23202:
                itemDef.name = TierColor.BEGGINER.getColor() +"Executive Box";
                itemDef.copyItem(14488);
                break;
            case 23203:
                itemDef.name = TierColor.BEGGINER.getColor() +"Imperial Box";
                itemDef.copyItem(14488);
                break;
            case 23204:
                itemDef.name = TierColor.BEGGINER.getColor() +"Unknown Box";
                itemDef.copyItem(14488);
                break;
            case 23205:
                itemDef.name = TierColor.BEGGINER.getColor() +"Turtle Box";
                itemDef.copyItem(14488);
                break;
            case 23206:
                itemDef.name = TierColor.BEGGINER.getColor() +"Tormented Box";
                itemDef.copyItem(14488);
                break;
            case 23207:
                itemDef.name = TierColor.NOVICE.getColor() +"Revenant Box";
                itemDef.copyItem(14488);
                break;
            case 23208:
                itemDef.name = TierColor.NOVICE.getColor() +"Freeflow Box";
                itemDef.copyItem(14488);
                break;
            case 23209:
                itemDef.name = TierColor.INTER.getColor() +"Soldier Box";
                itemDef.copyItem(14488);
                break;
            case 23210:
                itemDef.name = TierColor.INTER.getColor() +"Mystical Box";
                itemDef.copyItem(14488);
                break;
            case 23211:
                itemDef.name = TierColor.INTER.getColor() +"Sacred Box";
                itemDef.copyItem(14488);
                break;
            case 23212:
                itemDef.name = TierColor.INTER.getColor() +"Ruthless Box";
                itemDef.copyItem(14488);
                break;
            case 23213:
                itemDef.name = TierColor.INTER.getColor() +"Antique Box";
                itemDef.copyItem(14488);
                break;

            case 23300:
                itemDef.name = TierColor.NOVICE.getColor() +"Starter Pack II";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 14944;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;

            case 23301:
                itemDef.name = TierColor.NOVICE.getColor() +"Starter Pack III";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 14944;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;

            case 15004:
                itemDef.name = TierColor.NOVICE.getColor() +"Starter Pack I";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 14944;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;

            case 14487:
                itemDef.name = "Base Box";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15178;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 14488:
                itemDef.name = "Base Box";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationX = 90;
                itemDef.modelID = 15179;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 23173:
                itemDef.copyItem(6199);
                itemDef.name = "Other box";
                itemDef.rdc2 = 18000;
                break;
            case 15682:
                itemDef.name = "Vote Crate";
                itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
                break;
            case 20505:
                itemDef.name = "<col=842e00><shad=0>Youtube Box<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15113;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;

            case 19659:
                itemDef.name = "Summer's Present";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDefs = ItemDefinition.get(6199);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1600;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = 64099;
                itemDef.rdc2 = 32521;
                break;
            case 15003:
                itemDef.name = "<col=842e00><shad=0>Cursed Box<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 14945;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20488:
                itemDef.name = "<col=afafb2><shad=1299>Devoted Box<shad-1>";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
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
            case 3578:
                itemDef.name = "<col=FF0000><shad=0>Owner's Cape Goodiebag";
                //itemDef.rdc3 = 131313;
                break;
            case 13021:
                itemDef.name = "<col=000000><shad=0>Elite Goodiebag";
                itemDef.rdc3 = 44444;
                break;
            case 13017:
                itemDef.name = "<col=17D797><shad=0>Special Goodiebag";
                itemDef.rdc3 = 25500;
                break;
            case 13019:
                itemDef.name = "<col=D73717><shad=0>Owner Jewellery Goodiebag";
                itemDef.rdc3 = 67500;
                break;
            case 23177:
                itemDef.copyItem(6199);
                itemDef.name = "Starter box";
                itemDef.rdc2 = 3455;//15888 - 45366
                break;
            case 23171:
                itemDef.copyItem(6199);
                itemDef.name = "Rare box";
                itemDef.rdc2 = 12000;
                break;
            case 23172:
                itemDef.copyItem(6199);
                itemDef.name = "Imperial Box";
                itemDef.rdc2 = 15000;
                break;

            case 2734:
                itemDef.name = "Slayer casket";
                itemDef.rdc2 = 847;
                break;
            case 2736:
                itemDef.name = "PvM Casket";
                itemDef.rdc2 = 54666;
                break;
            case 19624:
                itemDef.name = "<col=c497fc>Boss Event Box";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDefs = ItemDefinition.get(6199);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                //itemDef.modelOffsetX = itemDefs1.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                // itemDef.modelID = itemDefs.modelID;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.newModelColor = new int[]{63};
                itemDef.editedModelColor = new int[]{61};
                itemDef.modelID = 65284;
                break;
            case 23002:
                itemDef.copyItem(6199);
                itemDef.name = "Owner Chest";
                itemDef.modelID = 100054;
                itemDef.modelZoom = 936;
                itemDef.rotationX = 110;
                itemDef.rotationY = 127;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = -6;
                break;
            case 23040:
                itemDef.copyItem(6199);
                itemDef.modelZoom = 3000;
                itemDef.name = "Chest";
                itemDef.modelID = 100122;
                itemDef.maleEquip1 = 100122;
                itemDef.femaleEquip1 = 100122;
                break;

                /* Key Packs */
            case 28:
                itemDef.name = "Slayer chest key";
                itemDefs = ItemDefinition.get(989);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 760;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = 800;
                itemDef.modelID = 64299;
                itemDef.stackable = false;
                break;
            case 29:
                itemDef.name = "Locked slayer chest";
                itemDefs = ItemDefinition.get(405);
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 64300;
                itemDef.modelZoom = 1100;
                itemDef.stackable = false;
                break;

            /* To Use */
            case 23118:
                itemDef.copyItem(2436);
                itemDef.name = "Infinite healing potion (T1)";
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                itemDef.modelID = 100250;
                itemDef.modelZoom = 1000;
                break;
            case 23119:
                itemDef.copyItem(23118);
                itemDef.name = "Infinite healing potion (T2)";
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                itemDef.modelID = 100251;
                break;
            case 23120:
                itemDef.copyItem(23118);
                itemDef.name = "Infinite healing potion (T3)";
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                itemDef.modelID = 100252;
                break;
            case 23121:
                itemDef.copyItem(23118);
                itemDef.name = "Infinite prayer potion (T1)";
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                itemDef.modelID = 100253;
                break;
            case 23122:
                itemDef.copyItem(23118);
                itemDef.name = "Infinite prayer potion (T2)";
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                itemDef.modelID = 100254;
                break;
            case 23123:
                itemDef.copyItem(23118);
                itemDef.name = "Infinite prayer potion (T3)";
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                itemDef.modelID = 100255;
                break;
            case 23124:
                itemDef.copyItem(23118);
                itemDef.name = "Infinite overload potion (T1)";
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                itemDef.modelID = 100256;
                break;
            case 23125:
                itemDef.copyItem(23118);
                itemDef.name = "Infinite overload potion (T2)";
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                itemDef.modelID = 100257;
                break;
            case 23126:
                itemDef.copyItem(23118);
                itemDef.name = "Infinite overload potion (T3)";
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                itemDef.modelID = 100258;
                break;
            case 13591:
                itemDef.name = "@yel@Raids [1] Key";
                itemDef.stackable = true;
                itemDef.actions = new String[]{null, null, null, null, null};
                break;
            case 23103:
                itemDef.copyItem(1);
                itemDef.name = "Treasure Key 1";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.modelID = 100231;
                itemDef.rotationX = 0;
                itemDef.rotationY = 520;
                itemDef.modelZoom = 800;
                break;
            case 23104:
                itemDef.copyItem(23103);
                itemDef.name = "Treasure Key 2";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.modelID = 100232;
                break;
            case 23105:
                itemDef.copyItem(23103);
                itemDef.name = "Treasure Key 3";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.modelID = 100233;
                break;
            case 23106:
                itemDef.copyItem(23103);
                itemDef.name = "Treasure Key 4";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.modelID = 100234;
                break;
            case 23107:
                itemDef.copyItem(23103);
                itemDef.name = "Master Treasure Key";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.modelID = 100235;
                itemDef.modelZoom = 400;
                break;
            case 23086:
                itemDef.copyItem(1);
                itemDef.name = "Halls of Valor Key";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.modelID = 100202;
                itemDef.rotationX = 0;
                itemDef.rotationY = 520;
                itemDef.modelZoom = 800;
                break;
            case 15222:
                itemDef.name = "Poison Ivy";
                itemDef.stackable = false;
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                break;
            case 588:
                itemDef.name = "Spirit Orb";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.rdc2 = 12233;
                itemDef.stackable = false;

                break;
            case 14505:
                itemDef.name = "Phantom orb";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.rdc2 = 3274772;
                itemDef.stackable = false;

                break;
            case 18761:
                itemDef.name = "Transylvanian orb";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.rdc2 = 3465736;
                itemDef.stackable = false;

                break;
            case 19640:
                itemDef.name = "Undead orb";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.rdc2 = 8844;
                itemDef.stackable = false;
                break;

            case 11000:
                itemDef.name = "@red@Owner's Attachment";
                itemDef.modelID = 65448;
                itemDef.maleEquip1 = 65449;
                itemDef.femaleEquip1 = 65449;
                itemDefs = ItemDefinition.get(2414);
                itemDef.actions = itemDefs.actions;
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = 1000;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                break;
            case 23003:
                itemDef.copyItem(12855);
                itemDef.name = "VIP Ticket";
                itemDef.actions = new String[]{null, null, null, null, null};
                itemDef.modelID = 100056;
                itemDef.modelZoom = 1874;
                itemDef.rotationX = 0;
                itemDef.rotationY = 525;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                break;
//            case 19682:
//                itemDef.name = "Loot device";
//                itemDef.actions = new String[]{null, null, null, null, "Drop"};
//                //itemDef.rdc2 = 3222;
//                break;

//            case 604:
//                itemDef.name = "Supreme Shard";
//                break;
//            case 13555:
//                itemDef.copyItem(6585);
//                itemDef.name = "Elite Pendant (hybrid)";
//                itemDef.modelID = 83812;
//                itemDef.maleEquip1 = 83801;
//                itemDef.femaleEquip1 = 83801;
//                itemDef.maleWieldY = 5;
//                itemDef.modelZoom = 464;
//                itemDef.modelOffsetX = 3;
//                itemDef.modelOffsetY = 54;
//                itemDef.rotationX = 1964;
//                itemDef.rotationY = 277;
//                itemDef.rotationZ = 0;
//                break;
//            case 8788:
//                itemDef.name = "Transfer Crystal";
//                itemDef.rdc2 = 91291;
//                break;
//            case 9662:
//                itemDef.name = "<col=f8ac00>Damned key@lre@";
//                itemDef.actions = new String[5];
//                itemDef.actions[0] = "Open";
//                break;
//            case 21205:
//                itemDef.name = "Damned key [<col=92d49a>Uncommon@lre@]";
//                itemDefs = ItemDefinition.get(9662);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.modelID = itemDefs.modelID;
//                itemDef.actions = itemDefs.actions;
//                itemDef.rdc2 = 4710;
//                break;
//            case 21206:
//                itemDef.name = "Damned key [<col=789eea>Rare@lre@]";
//                itemDefs = ItemDefinition.get(9662);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.modelID = itemDefs.modelID;
//                itemDef.actions = itemDefs.actions;
//                itemDef.rdc2 = 888888;
//                break;
//            case 21207:
//                itemDef.name = "Damned key [<col=c378ea>Legendary@lre@]";
//                itemDefs = ItemDefinition.get(9662);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.modelID = itemDefs.modelID;
//                itemDef.actions = itemDefs.actions;
//                itemDef.rdc2 = 111111;
//                break;
//            case 21208:
//                itemDef.name = "Damned key [<col=eae678>Exotic@lre@]";
//                itemDefs = ItemDefinition.get(9662);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.modelID = itemDefs.modelID;
//                itemDef.actions = itemDefs.actions;
//                itemDef.rdc2 = 88757;
//                break;
//            case 14471:
//                itemDef.name = "<col=f8ac00>Hidden key@lre@";
//                itemDef.actions = new String[5];
//                itemDef.actions[0] = "Open";
//                break;
//            case 21209:
//                itemDef.name = "Hidden key [<col=92d49a>Uncommon@lre@]";
//                itemDefs = ItemDefinition.get(14471);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.modelID = itemDefs.modelID;
//                itemDef.actions = itemDefs.actions;
//                itemDef.rdc2 = 1896;
//                break;
//            case 21210:
//                itemDef.name = "Hidden key [<col=789eea>Rare@lre@]";
//                itemDefs = ItemDefinition.get(14471);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.modelID = itemDefs.modelID;
//                itemDef.actions = itemDefs.actions;
//                itemDef.rdc2 = 888888;
//                break;
//            case 21211:
//                itemDef.name = "Hidden key [<col=c378ea>Legendary@lre@]";
//                itemDefs = ItemDefinition.get(14471);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.modelID = itemDefs.modelID;
//                itemDef.actions = itemDefs.actions;
//                itemDef.rdc2 = 111111;
//                break;
//            case 21212:
//                itemDef.name = "Hidden key [<col=eae678>Exotic@lre@]";
//                itemDefs = ItemDefinition.get(14471);
//                itemDef.modelOffsetX = itemDefs.modelOffsetX;
//                itemDef.modelOffsetY = itemDefs.modelOffsetY;
//                itemDef.modelZoom = itemDefs.modelZoom;
//                itemDef.rotationY = itemDefs.rotationY;
//                itemDef.rotationX = itemDefs.rotationX;
//                itemDef.modelID = itemDefs.modelID;
//                itemDef.actions = itemDefs.actions;
//                itemDef.rdc2 = 88757;
//                break;
        }
        return itemDef;
    }
}
