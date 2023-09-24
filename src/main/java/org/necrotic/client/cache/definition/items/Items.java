package org.necrotic.client.cache.definition.items;

import org.necrotic.client.cache.definition.ItemDefinition;

public class Items {

    public static ItemDefinition newDef(ItemDefinition itemDef, int id) {
        ItemDefinition itemDefs;
        switch (id) {

            case 8644:
                itemDef.name = "Barricade";
                itemDef.actions = new String[]{null, null, null, null, null};
                itemDef.stackable = false;
                itemDef.modelID = 40782;
                itemDef.modelZoom = 2500;
                break;
            case 15430:
                itemDef.name = "Essence";
                itemDef.actions = new String[]{null, null, null, null, null};
                break;

            case 19639:
                itemDef.name = "Token Fragments";
                break;

            case 995:
                itemDef.name = "Coins";
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
                itemDef.name = "Tokens";
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
                itemDef.name = "Elite Token";
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
            case 4155:
                itemDef.name = "Slayer gem";
                itemDef.description = "A magical stone created by the gods of Tarn".getBytes();
                itemDef.actions = new String[5];
                itemDef.actions = new String[]{null, null, null, null, null};
                break;
            case 19000:
                itemDef.copyItem(14639);
                itemDef.name = "Pet fragment";
                itemDef.actions = new String[]{"Exchange", null, null, null, null};
                break;
            case 19002:
                itemDef.copyItem(14639);
                itemDef.name = "Elite Pet fragment";
                itemDef.actions = new String[]{"Exchange", null, null, null, null};
                break;
            case 5023:
                itemDef.name = "Slayer ticket";
                itemDef.rdc2 = 23452;
                itemDef.stackable = true;
                itemDefs = ItemDefinition.get(18652);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.modelID = itemDefs.modelID;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.newModelColor = new int[]{63};
                itemDef.editedModelColor = new int[]{67};
                break;
            case 5020:
                itemDef.name = "AFK ticket";
                itemDef.stackable = true;
                break;
            case 25100:
                itemDef.copyItem(607);
                itemDef.name = "Fall Scroll";
                itemDef.stackable = false;
                break;
            case 13727: // stardust
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                break;
            case 21819:
                itemDef.name = "Loot Device";
                itemDef.actions = new String[]{"Check", null, null, null, "Drop"};
                break;
            case 14505:
                itemDef.name = "Ancient Monic";
                itemDef.actions = new String[]{"Activate", null, null, null, "Drop"};
                itemDef.rdc2 = 3274772;
                itemDef.stackable = false;
                break;
            case 19640:
                itemDef.name = "Crystal Monic";
                itemDef.actions = new String[]{"Activate", null, null, null, "Drop"};
                itemDef.rdc2 = 8844;
                itemDef.stackable = false;
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
            case 23335:
                itemDef.copyItem(14819);
                itemDef.name = "$5 VIP Certificate";
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
            case 604:
                itemDef.name = "Supreme Shard";
                break;
            case 19001:
                itemDef.copyItem(15262);
                itemDef.name = "Pet fragment pack";
                itemDef.stackable = false;
                itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
                itemDef.rdc2 = 487111;
                break;
            case 23166:
                itemDef.copyItem(23165);
                itemDef.name = "Instance Unlock Scroll";
                itemDef.modelID = 100316;
                break;
            case 23168:
                itemDef.copyItem(23165);
                itemDef.name = "Raids Unlock scroll";
                itemDef.modelID = 100319;
                break;
            case 23167:
                itemDef.copyItem(23165);
                itemDef.name = "Holy Unlock scroll";
                itemDef.modelID = 100317;
                break;
            case 22214:
                itemDef.copyItem(3114);
                itemDef.name = "Helmet Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22215:
                itemDef.copyItem(3114);
                itemDef.name = "Necklace Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22216:
                itemDef.copyItem(3114);
                itemDef.name = "Body Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22217:
                itemDef.copyItem(3114);
                itemDef.name = "Legs Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22218:
                itemDef.copyItem(3114);
                itemDef.name = "Boots Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22219:
                itemDef.copyItem(3114);
                itemDef.name = "Halo Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22220:
                itemDef.copyItem(3114);
                itemDef.name = "Cape Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22221:
                itemDef.copyItem(3114);
                itemDef.name = "Weapon Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22222:
                itemDef.copyItem(3114);
                itemDef.name = "Aura Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22223:
                itemDef.copyItem(3114);
                itemDef.name = "Gloves Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22224:
                itemDef.copyItem(3114);
                itemDef.name = "Gemstone Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22225:
                itemDef.copyItem(3114);
                itemDef.name = "Arrow Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22226:
                itemDef.copyItem(3114);
                itemDef.name = "Shield Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22227:
                itemDef.copyItem(3114);
                itemDef.name = "Enchant Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 22228:
                itemDef.copyItem(3114);
                itemDef.name = "Ring Certificate";
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                itemDef.rdc = 129911;
                break;
            case 5022:
                itemDef.name = "Loyalty Tickets";
                itemDef.rdc2 = 54666;
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDefs = ItemDefinition.get(18652);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.rotationZ = itemDefs.rotationZ;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.modelID = itemDefs.modelID;
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
            case 4000:
                itemDef.copyItem(21816);
                itemDef.name = "Voting Ticket";
                itemDef.actions = new String[]{null, null, null, null, null};
                break;
            case 4001:
                itemDef.copyItem(21816);
                itemDef.name = "Elite Voting Ticket";
                itemDef.stackable = true;
                itemDef.actions = new String[]{null, null, null, null, null};
                break;
            case 13557:
				itemDef.copyItem(4561);
				itemDef.name = "Candy";
				itemDef.modelID = 93512;
				itemDef.modelZoom = 724;
				itemDef.modelOffsetX = 1;
				itemDef.modelOffsetY = 1;
				itemDef.rotationX = 1808;
				itemDef.rotationY = 308;
				itemDef.rotationZ = 308;
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
            case 2025:
                itemDef.copyItem(2023);
                itemDef.name = "Starter Bones";
                itemDef.newModelColor = new int[]{63};
                itemDef.editedModelColor = new int[]{72};
                break;
            case 4010:
                itemDef.copyItem(2023);
                itemDef.name = "Mystic Bones";
                itemDef.newModelColor = new int[]{63};
                itemDef.editedModelColor = new int[]{79};
                break;
            case 4011:
                itemDef.copyItem(2023);
                itemDef.name = "Callous Bones";
                itemDef.newModelColor = new int[]{63};
                itemDef.editedModelColor = new int[]{91};
                break;
            case 4012:
                itemDef.copyItem(2023);
                itemDef.name = "Night Bones";
                itemDef.newModelColor = new int[]{63};
                itemDef.editedModelColor = new int[]{66};
                break;
            case 4013:
                itemDef.copyItem(2023);
                itemDef.name = "Chipped Bones";
                itemDef.newModelColor = new int[]{63};
                itemDef.editedModelColor = new int[]{93};
                break;
            case 4014:
                itemDef.copyItem(2023);
                itemDef.name = "Donator Bones";
                itemDef.newModelColor = new int[]{63};
                itemDef.editedModelColor = new int[]{81};
                break;
            case 3686:
                itemDef.name = "Premium Ticket";
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
                itemDef.stackable = true;
                itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
                break;
            case 12852:
                itemDef.name = "Starter token";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Redeem";
                break;
            case 15355:
                itemDef.name = "Double DR Scroll (1 Hour)";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Activate";
                itemDef.rdc2 = 921211;
                break;
            case 15356:
                itemDef.name = "Double DDR Scroll (1 Hour)";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Activate";
                itemDef.rdc2 = 348132;
                break;
            case 15357:
                itemDef.name = "Double Damage Scroll (1 Hour)";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Activate";
                itemDef.rdc2 = 23333;
                break;
            case 15358:
                itemDef.name = "Double DR Scroll (30 Minutes)";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Activate";
                itemDef.rdc2 = 663712;
                break;
            case 15359:
                itemDef.name = "Double Damage Scroll (30 Minutes)";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Activate";
                itemDef.rdc2 = 12411;
                break;
            case 21403:
                itemDef.name = "Starter Potion";
                itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
                break;
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
            case 15328:
                itemDef.name = "Infinity Rage Potion";
                break;
            case 15330:
                itemDef.name = "Infinite Prayer Renewal";
                itemDef.actions = new String[]{"Drink", null, "Upgrade", null, "Drop"};
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
            case 8788:
                itemDef.name = "Transfer Crystal";
                itemDef.rdc2 = 91291;
                break;
            case 21816:
                itemDef.name = "1% DR & Double Drop Ticket";
                itemDef.actions = new String[]{null, null, null, null, null};
                break;
            case 21815:
                itemDef.name = "1% DR Ticket";
                itemDef.actions = new String[]{null, null, null, null, null};
                break;
            case 21814:
                itemDef.name = "1% Double Drop Ticket";
                itemDef.actions = new String[]{null, null, null, null, null};
                break;
            case 23150:
                itemDef.copyItem(20435);
                itemDef.name = "Drop Rate Low";
                itemDef.actions = new String[]{"Equip", null, "Dissolve", "Reroll", "Destroy"};
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
            case 25000:
                itemDef.copyItem(23150);
                itemDef.name = "Double Slayer Tickets";
                break;
            case 25001:
                itemDef.copyItem(23150);
                itemDef.name = "FireWall";
                break;

            case 15250:
                itemDef.name = "Armour Stone";
                break;
            case 15251:
                itemDef.name = "Weapon Stone";
                break;
            case 15252:
                itemDef.copyItem(15250);
                itemDef.name = "Accessories Stone";
                itemDef.rdc2 = 822332;
                break;
            case 15253:
                itemDef.copyItem(15251);
                itemDef.name = "Other Stone";
                itemDef.rdc2 = 622123;
                break;

            /* Master Parts */

            case 19641:
                itemDef.name = "Master Core";
                break;
            case 9076:
                itemDef.name = "Master Ore";
                break;
            case 9077:
                itemDef.name = "Master Steel";
                break;
            case 13748:
                itemDef.name = "Shank Divine Sigil";
                break;
            case 13746:
                itemDef.name = "Crosshair Divine Sigil";
                break;
            case 13750:
                itemDef.name = "Winged Divine Sigil";
                break;
            case 13752:
                itemDef.name = "Crooked Divine Sigil";
                break;

            /* Events */
            case 14819:
                itemDef.name = "Fall Certificate";
                break;

                /* Not Used Yet */
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
            case 27:
                itemDef.name = "<img=15>Elite Slayer Gem";
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
                itemDef.name = "Daily Coin Scroll";
                itemDef.modelID = 100318;
                itemDef.actions = new String[]{null, null, null, null, null};
                itemDef.modelZoom = 2600;
                itemDef.rotationX = 1534;
                itemDef.rotationY = 554;
                itemDef.modelOffsetX = -4;
                itemDef.modelOffsetY = 0;
                itemDef.stackable = true;
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
            case 9719:
                itemDef.name = "Slayer skip scroll";
                break;
            case 14822:
                itemDef.name = "<img=15>Elite Slayer License";
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


                /* Packs */
            case 23200:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.BEGGINER.getColor() +"Tier I Box";
                break;
            case 23201:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.BEGGINER.getColor() +"Tier II Box";
                break;
            case 23202:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.BEGGINER.getColor() +"Tier III Box";
                break;
            case 23203:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.NOVICE.getColor() +"Tier IV Box";
                break;
            case 23204:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.NOVICE.getColor() +"Tier V Box";
                break;
            case 23205:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.INTER.getColor() +"Tier VI Box";
                break;
            case 23206:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.INTER.getColor() +"Tier VII Box";
                break;
            case 23207:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.INTER.getColor() +"Tier VIII Box";
                break;
            case 23208:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.INTER.getColor() +"Tier IX Box";
                break;
            case 23209:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.INTER.getColor() +"Tier X Box";
                break;
            case 23210:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.ADVANCED.getColor() +"Tier XI Box";
                break;
            case 23211:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.ADVANCED.getColor() +"Tier XII Box";
                break;
            case 23212:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.ADVANCED.getColor() +"Tier XIII Box";
                break;
            case 23213:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.ADVANCED.getColor() +"Tier XIV Box";
                break;
            case 23214:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.ADVANCED.getColor() +"Tier XV Box";
                break;
            case 23215:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.UNCOMMON.getColor() +"Tier XVI Box";
                break;
            case 23216:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.UNCOMMON.getColor() +"Tier XVII Box";
                break;
            case 23217:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.UNCOMMON.getColor() +"Tier XVIII Box";
                break;
            case 23218:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.RARE.getColor() +"Tier XIX Box";
                break;
            case 23219:
                itemDef.copyItem(14488);
                itemDef.name = TierColor.RARE.getColor() +"Tier XX Box";
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
            case 2734:
                itemDef.name = "Slayer casket";
                itemDef.rdc2 = 847;
                break;
            case 2736:
                itemDef.name = "PvM Casket";
                itemDef.rdc2 = 54666;
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
            case 22122:
                itemDef.name = "Rare Card II";
                itemDef.actions = new String[]{"Scratch", null, null, null, "Drop"};
                itemDef.modelID = 100053;
                itemDef.modelZoom = 1171;
                itemDef.rotationX = 322;
                itemDef.rotationY = 525;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetX = 4;
                itemDef.modelOffsetY = -3;
                break;
            case 22123:
                itemDef.name = "Rare Card III";
                itemDef.actions = new String[]{"Scratch", null, null, null, "Drop"};
                itemDef.modelID = 100053;
                itemDef.modelZoom = 1171;
                itemDef.rotationX = 322;
                itemDef.rotationY = 525;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetX = 4;
                itemDef.modelOffsetY = -3;
                break;
            case 22124:
                itemDef.name = "Rare Card IV";
                itemDef.actions = new String[]{"Scratch", null, null, null, "Drop"};
                itemDef.modelID = 100053;
                itemDef.modelZoom = 1171;
                itemDef.rotationX = 322;
                itemDef.rotationY = 525;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetX = 4;
                itemDef.modelOffsetY = -3;
                break;

            case 20500:
                itemDef.name = "Enhance Pack I";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15160;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20501:
                itemDef.name = "Enhance Pack II";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15160;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 20502:
                itemDef.name = "Enhance Pack III";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15160;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 23250:
                itemDef.name = "Cert Pack I";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15161;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 23251:
                itemDef.name = "Cert Pack II";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15161;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 23252:
                itemDef.name = "Cert Pack III";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15161;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 23253:
                itemDef.name = "Ticket Pack I";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15162;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 23254:
                itemDef.name = "Ticket Pack II";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15162;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 23255:
                itemDef.name = "Ticket Pack III";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.modelZoom = 850;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15162;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 23256:
                itemDef.name = "Donator Chest I";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 2;
                itemDef.modelZoom = 1100;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15142;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 23257:
                itemDef.name = "Donator Chest II";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 2;
                itemDef.modelZoom = 1100;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15163;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 23258:
                itemDef.name = "Donator Chest III";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 2;
                itemDef.modelZoom = 1100;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15164;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 23259:
                itemDef.name = "Ultimate Donator Chest";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 2;
                itemDef.modelZoom = 1100;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 15031;
                itemDef.scaleY *= 0.50;
                itemDef.scaleX *= 0.50;
                itemDef.scaleZ *= 0.50;
                break;
            case 23260: //23060 - 23075 Limited Master Editions
                itemDef.copyItem(6199);
                itemDef.modelZoom = 3000;
                itemDef.name = "Limited Master 1";
                itemDef.modelID = 100122;
                itemDef.maleEquip1 = 100122;
                itemDef.femaleEquip1 = 100122;
                break;
            case 20488:
                itemDef.name = "Asta Fire Box";
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
            case 23002:
                itemDef.copyItem(6199);
                itemDef.name = "Tarn Master Chest";
                itemDef.modelID = 100054;
                itemDef.modelZoom = 936;
                itemDef.rotationX = 110;
                itemDef.rotationY = 127;
                itemDef.rotationZ = 0;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = -6;
                break;
            case 23276:
                itemDef.name = "Ultimate Cert Pack";
                itemDef.actions = new String[5];
                itemDef.actions[0] = "Open";
                itemDefs = ItemDefinition.get(6199);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.newModelColor = new int[]{63};
                itemDef.editedModelColor = new int[]{61};
                itemDef.modelID = 65284;
                break;
            case 15682:
                itemDef.name = "Vote Crate";
                itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
                break;
            case 18768:
                itemDef.name = "Vote Box";
                itemDef.rdc2 = 2233311;
                break;

            case 28:
                itemDef.name = "Fall key";
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
                itemDef.name = "Locked fall chest";
                itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 64300;
                itemDef.modelZoom = 1100;
                itemDef.stackable = false;
                break;
            case 23103:
                itemDef.copyItem(1);
                itemDef.name = "Vote Key";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.modelID = 100231;
                itemDef.rotationX = 0;
                itemDef.rotationY = 520;
                itemDef.modelZoom = 800;
                break;
            case 25101:
                itemDef.name = "Locked vote chest";
                itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 64300;
                itemDef.modelZoom = 1100;
                itemDef.stackable = false;
                break;
            case 23104:
                itemDef.copyItem(23103);
                itemDef.name = "Slayer Key";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.modelID = 100232;
                break;
            case 25102:
                itemDef.name = "Locked slayer chest";
                itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 64300;
                itemDef.modelZoom = 1100;
                itemDef.stackable = false;
                break;
            case 23105:
                itemDef.copyItem(23103);
                itemDef.name = "PvM Key";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.modelID = 100233;
                break;
            case 25103:
                itemDef.name = "Locked PVM chest";
                itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
                itemDef.modelOffsetX = 2;
                itemDef.modelOffsetY = 1;
                itemDef.rotationY = 100;
                itemDef.rotationX = 90;
                itemDef.modelID = 64300;
                itemDef.modelZoom = 1100;
                itemDef.stackable = false;
                break;
            case 23107:
                itemDef.copyItem(23103);
                itemDef.name = "Master Treasure Key";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.modelID = 100235;
                itemDef.modelZoom = 400;
                break;

            /* Not Used Yet */

            case 8213:
				itemDef.name = "Christmas token";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDefs = ItemDefinition.get(1050);
				itemDef.modelID = itemDefs.modelID;
				itemDef.maleEquip1 = itemDefs.maleEquip1;
				itemDef.femaleEquip1 = itemDefs.femaleEquip1;
				itemDef.modelOffsetX = 2;
				itemDef.modelOffsetY = 1;
				itemDef.modelZoom = 600;
				itemDef.rotationY = 20;
				itemDef.rotationX = 900;
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
            case 455:
                itemDef.name = "Scratch Card";
                break;
            case 23173:
                itemDef.copyItem(6199);
                itemDef.name = "Other box";
                itemDef.rdc2 = 18000;
                break;
            case 6833:
                itemDef.name = "Goodiebag Box";
                itemDef.rdc2 = 12512;
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
            case 22110:
                itemDef.name = "Owner's Attachment";
                itemDefs = ItemDefinition.get(15287);
                itemDef.modelOffsetX = itemDefs.modelOffsetX;
                itemDef.modelOffsetY = itemDefs.modelOffsetY;
                itemDef.modelZoom = itemDefs.modelZoom;
                itemDef.rotationY = itemDefs.rotationY;
                itemDef.rotationX = itemDefs.rotationX;
                itemDef.modelID = itemDefs.modelID;
                itemDef.actions = new String[5];
                itemDef.actions[4] = "Drop";
                itemDef.rdc2 = 53921;
                itemDef.stackable = true;
                break;
            case 23177:
                itemDef.copyItem(6199);
                itemDef.name = "Starter box";
                itemDef.rdc2 = 3455;
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

            /* To Use */
            case 13591:
                itemDef.name = "@yel@Raids [1] Key";
                itemDef.stackable = true;
                itemDef.actions = new String[]{null, null, null, null, null};
                break;
            case 23106:
                itemDef.copyItem(23103);
                itemDef.name = "Treasure Key 4";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.modelID = 100234;
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
            case 588:
                itemDef.name = "Spirit Orb";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.rdc2 = 12233;
                itemDef.stackable = false;
                break;

            case 18761:
                itemDef.name = "Transylvanian orb";
                itemDef.actions = new String[]{null, null, null, null, "Drop"};
                itemDef.rdc2 = 3465736;
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
//            case 19682:
//                itemDef.name = "Loot device";
//                itemDef.actions = new String[]{null, null, null, null, "Drop"};
//                //itemDef.rdc2 = 3222;
//                break;


            case 13555:
                itemDef.copyItem(6585);
                itemDef.name = "Elite Pendant (hybrid)";
                itemDef.modelID = 83812;
                itemDef.maleEquip1 = 83801;
                itemDef.femaleEquip1 = 83801;
                itemDef.maleWieldY = 5;
                itemDef.modelZoom = 464;
                itemDef.modelOffsetX = 3;
                itemDef.modelOffsetY = 54;
                itemDef.rotationX = 1964;
                itemDef.rotationY = 277;
                itemDef.rotationZ = 0;
                break;
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
            case 10025:
                itemDef.name = "@whi@Progressive Box [T1]";
                itemDef.rdc2 = 4567543;
                break;
            case 10029:
                itemDef.copyItem(10025);
                itemDef.name = "@whi@Progressive Box [T2]";
                itemDef.rdc2 = 5577653;
                break;
        }
        return itemDef;
    }
}
