package org.necrotic.client.cache.definition;

public class ItemDef2 {
	private ItemDef2() {
	}

	public byte[] customSpriteLocation;

	public static ItemDefinition newIDS(ItemDefinition itemDef, int id) {

		ItemDefinition def;
		switch (id) {
			//Ring of dueling:
		  	case 2552:
			case 2554:
			case 2556:
			case 2558:
			case 2560:
			case 2562:
			case 2564:
			case 2566:
				itemDef.equipOptions[3] = "Duel Arena";
				itemDef.equipOptions[2] = "Castle Wars";
				itemDef.equipOptions[1] = "Clan wars";
				break;

//			case 17670:
//				itemDef.name = "<col=b3b4f2>Demon Scythe";
//				itemDef.modelID = 64016;
//				itemDef.maleEquip1 = 64017;
//				itemDef.femaleEquip1 = 64017;
//				itemDef21 = ItemDefinition.get(1419);
//				itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemDef21.modelOffsetY;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = itemDef21.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;


//			case 17678:
//				itemDef.name = "Noblelords Sycthe";
//				itemDef.modelID = 64024;
//				itemDef.maleEquip1 = 64025;
//				itemDef.femaleEquip1 = 64025;
//				itemDef21 = ItemDefinition.get(1419);
//				itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemDef21.modelOffsetY;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = itemDef21.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;


//			case 17658:
//				itemDef.name = "Teddybear";
//				itemDef.modelID = 64034;
//				itemDef.maleEquip1 = 64035;
//				itemDef.femaleEquip1 = 64035;
//				itemDef21 = ItemDefinition.get(8848);
//				itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemDef21.modelOffsetY;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = itemDef21.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 17688:
//				itemDef.name = "Demoncore Sycthe";
//				itemDef.modelID = 64036;
//				itemDef.maleEquip1 = 64037;
//				itemDef.femaleEquip1 = 64037;
//				itemDef21 = ItemDefinition.get(1419);
//				itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemDef21.modelOffsetY;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = itemDef21.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 17714:
//				itemDef.name = "Lucien Axe";
//				itemDef.modelID = 64058;
//				itemDef.maleEquip1 = 64057;
//				itemDef.femaleEquip1 = 64057;
//				itemDef21 = ItemDefinition.get(1419);
//				itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemDef21.modelOffsetY;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = itemDef21.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				break;
//			case 17690:
//				itemDef.name = "Nocturan MoonSlicer";
//				itemDef.modelID = 64038;
//				itemDef.maleEquip1 = 64039;
//				itemDef.femaleEquip1 = 64039;
//				itemDef21 = ItemDefinition.get(1419);
//				itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemDef21.modelOffsetY;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = itemDef21.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 17692:
//				itemDef.name = "Paladin's Bliss";
//				itemDef.modelID = 64040;
//				itemDef.maleEquip1 = 64041;
//				itemDef.femaleEquip1 = 64041;
//				itemDef21 = ItemDefinition.get(1419);
//				itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemDef21.modelOffsetY;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = itemDef21.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 17694:
//				itemDef.name = "Tyrant Hammer";
//				itemDef.modelID = 64042;
//				itemDef.maleEquip1 = 64042;
//				itemDef.femaleEquip1 = 64042;
//				itemDef21 = ItemDefinition.get(1419);
//				itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemDef21.modelOffsetY;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = itemDef21.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 17696:
//				itemDef.name = "Tyrant Hammer Off-Hand";
//				itemDef.modelID = 64043;
//				itemDef.maleEquip1 = 64043;
//				itemDef.femaleEquip1 = 64043;
//				itemDef21 = ItemDefinition.get(1419);
//				itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemDef21.modelOffsetY;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = itemDef21.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 17698:
//				itemDef.name = "Nite Hammer";
//				itemDef.modelID = 64044;
//				itemDef.maleEquip1 = 64044;
//				itemDef.femaleEquip1 = 64044;
//				itemDef21 = ItemDefinition.get(1419);
//				itemDef.modelOffsetX = 50;
//				itemDef.modelOffsetY = 110;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = 280;
//				itemDef.rotationX = 230;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;


//				break;
//			case 18750:
//				itemDef.name = "@red@Imperial Whip";
//				itemDef.modelID = 65141;
//				itemDef.maleEquip1 = 65142;
//				itemDef.femaleEquip1 = 65142;
//				itemDef21 = ItemDefinition.get(13131);
//				itemDef.modelOffsetX = 10;
//
//				itemDef.modelOffsetY = 1;
//				itemDef.modelZoom = 1000;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = 120;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 66; // the new texture u want it to have
//
//
//				itemDef.stackable = false;
//				break;

//			case 18636:
//
//				itemDef.name = "@red@Imperial Minigun";
//				ItemDefinition itemDef211 = ItemDefinition.get(20538);
//				itemDef.modelID = 65210;
//				itemDef.femaleEquip1 = 65211;
//				itemDef.maleEquip1 = 65211;// 95099
//				itemDef.actions = new String[]{null, "Wield", null, null, "Destroy"};
//				itemDef.modelOffsetX = itemDef211.modelOffsetX;
//
//				itemDef.modelOffsetY = itemDef211.modelOffsetY;
//				itemDef.modelZoom = itemDef211.modelZoom;
//				itemDef.rotationY = itemDef211.rotationY;
//				itemDef.rotationX = itemDef211.rotationX;
//				itemDef.stackable = false;
//				break;
//			case 8253:
//				itemDef.editedModelColor = new int[2]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[2]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 66; // the new texture u want it to have
//
//				itemDef.newModelColor[1] = 24; // the texture that it currently has
//				itemDef.editedModelColor[1] = 71; // the new texture u want it to have
//				itemDef.name = "<col=ff2a00><shad=761401>Defiled minigun<shad-1>";
//				def = ItemDefinition.get(20538);
//				itemDef.modelID = 65210;
//				itemDef.femaleEquip1 = 65211;
//				itemDef.maleEquip1 = 65211;// 95099
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.modelOffsetX = def.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.stackable = false;
//				break;
//			case 17700:
//				itemDef.name = "Nite Hammer Off-Hand";
//				itemDef.maleEquip1 = 64045;
//				itemDef.modelID = 64045;
//				itemDef.femaleEquip1 = 64045;
//				def = ItemDefinition.get(1419);
//				itemDef.modelOffsetX = 46;
//				itemDef.modelOffsetY = 10;
//				itemDef.modelZoom = 2200;
//				itemDef.rotationY = 300;
//				itemDef.rotationX = 600;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				break;
			case 17702:
				itemDef.name = "Frieza claws";
				itemDef.modelID = 64046;
				itemDef.maleEquip1 = 64047;
				itemDef.femaleEquip1 = 64047;
				def = ItemDefinition.get(20562);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

//			case 17706:
//				itemDef.name = "Chest";
//				itemDef.modelID = 64050;
//				itemDef.maleEquip1 = 64050;
//				itemDef.femaleEquip1 = 64050;
//				def = ItemDefinition.get(6199);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = 2300;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				//	itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
//				itemDef.stackable = false;
//				break;
//			case 17708:
//				itemDef.name = "<col=b5f2b3>Turtle Sword";
//				itemDef.modelID = 64051;
//				itemDef.maleEquip1 = 64052;
//				itemDef.femaleEquip1 = 64052;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				break;

//			case 17710:
//				itemDef.name = "Maze Maul";
//				itemDef.modelID = 64053;
//				itemDef.maleEquip1 = 64054;
//				itemDef.femaleEquip1 = 64054;
//				def = ItemDefinition.get(4153);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = 2200;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;

//			case 13760:
//				itemDef.name = "Elder Maul";
//				itemDef.modelID = 64334;
//				itemDef.maleEquip1 = 64335;
//				itemDef.femaleEquip1 = 64335;
//				def = ItemDefinition.get(4153);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = 2200;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 11798:
//				itemDef.name = "Dinh's bulwark";
//				itemDef.modelID = 64336;
//				itemDef.maleEquip1 = 64337;
//				itemDef.femaleEquip1 = 64337;
//				def = ItemDefinition.get(4153);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = 2200;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//
//				break;
//			case 17712:
//				itemDef.name = "<col=b5aaaa>Angels Flamethrower";
//				itemDef.modelID = 64055;
//				itemDef.maleEquip1 = 64056;
//				itemDef.femaleEquip1 = 64056;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 7654;
//				break;
//			case 12860:
//				itemDef.name = "Angelic gloves";
//
//				break;
//			case 12565:
//				itemDef.name = "Angelic boots";
//
//				break;
//			case 16140:
//				itemDef.name = "Angelic amulet";
//
//				break;

//			case 17716:
//				itemDef.name = "Doom wings";
//				itemDef.modelID = 64071;
//				itemDef.maleEquip1 = 64072;
//				itemDef.femaleEquip1 = 64072;
//				def = ItemDefinition.get(19893);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 1959:
//				itemDef.name = "Halloween Token";
//				itemDef.stackable = true;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				break;
//			case 18189:
//				itemDef.name = "Baby web spiders";
//				itemDef.stackable = true;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				break;
//			case 20422:
//				itemDef.name = "Cracker Urn";
//				itemDef.stackable = true;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				break;
//			case 4568:
//				itemDef.name = "Basket of undead (@bla@Discontinued@or1@)";
//				//	itemDef.stackable = true;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				def = ItemDefinition.get(4565);
//				itemDef.modelID = def.modelID;
//				itemDef.maleEquip1 = def.maleEquip1;
//				itemDef.femaleEquip1 = def.femaleEquip1;
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.actions = def.actions;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.rdc2 = 35473;
//				break;
//			case 4569:
//				itemDef.name = "Basket of Xmas (@whi@Xmas 2019@or1@)";
//				//	itemDef.stackable = true;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				def = ItemDefinition.get(4565);
//				itemDef.modelID = def.modelID;
//				itemDef.maleEquip1 = def.maleEquip1;
//				itemDef.femaleEquip1 = def.femaleEquip1;
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.actions = def.actions;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.rdc2 = 90999;
//				break;
//			case 4570:
//				itemDef.name = "Golden Cracker (@whi@Xmas 2019@or1@)";
//				//	itemDef.stackable = true;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				def = ItemDefinition.get(20083);
//				itemDef.modelID = def.modelID;
//				itemDef.maleEquip1 = def.maleEquip1;
//				itemDef.femaleEquip1 = def.femaleEquip1;
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.actions = def.actions;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.rdc2 = 7775;
//				break;
//			case 15367:
//				itemDef.name = "Event pack";
//				itemDef.stackable = false;
//				itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
//
//				itemDef.rdc2 = 621133;
//				break;
//			case 15290:
//				itemDef.name = "Upgrade Token pack (5k)";
//				itemDef.stackable = false;
//				itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
//				def = ItemDefinition.get(15262);
//				itemDef.modelID = def.modelID;
//				itemDef.maleEquip1 = def.maleEquip1;
//				itemDef.femaleEquip1 = def.femaleEquip1;
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = 2000;
//				//itemDef.actions = itemDef211.actions;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.rdc2 = 293613;
//				break;
//			case 15289:
//				itemDef.name = "Upgrade Token pack (25k)";
//				itemDef.stackable = false;
//				itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
//				def = ItemDefinition.get(15262);
//				itemDef.modelID = def.modelID;
//				itemDef.maleEquip1 = def.maleEquip1;
//				itemDef.femaleEquip1 = def.femaleEquip1;
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = 2000;
//				//itemDef.actions = itemDef211.actions;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.rdc2 = 283613;
//				break;
//			case 15288:
//				itemDef.name = "Upgrade Token pack (100k)";
//				itemDef.stackable = false;
//				itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
//				def = ItemDefinition.get(15262);
//				itemDef.modelID = def.modelID;
//				itemDef.maleEquip1 = def.maleEquip1;
//				itemDef.femaleEquip1 = def.femaleEquip1;
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = 2000;
//				//itemDef.actions = itemDef211.actions;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.rdc2 = 223613;
//				break;
//			case 6183:
//				itemDef.name = "Halloween Box (@bla@Discontinued@or1@)";
//				itemDef.rdc2 = 32535;
//				break;
//			case 15246:
//				itemDef.name = "Xmas Mystery Box (@whi@Xmas 2019@or1@)";
//				itemDef.rdc2 = 32535;
//				break;
//			case 20083:
//				itemDef.name = "Halloween cracker (@bla@Discontinued@or1@)";
//				//itemDef.stackable = true;
//				itemDef.actions = new String[]{"Pull", null, null, null, "Drop"};
//				itemDef.rdc2 = 294295;
//				break;
//
//
//
//
//			case 19775:
//				itemDef.name = "Small event rate Lamp";
//				itemDef.rdc2 = 47388;
//				break;
//			case 19768:
//				itemDef.name = "Large event rate Lamp";
//				itemDef.rdc2 = 23643315;
//				itemDef.modelZoom = 700;
//				break;
//			case 17831:
//				itemDef.name = "Mystery Shards";
//				itemDef.stackable = false;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				//itemDef.rdc2 = 234563434;
//				break;
//			case 2862:
//				itemDef.name = "Grinch logs";
//				itemDef.stackable = true;
//				itemDef.rdc2 = 857664;
//				break;
//			case 10593:
//				itemDef.name = "Cowbell";
//				itemDef.stackable = true;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				//	itemDef.rdc2=  857664;
//				break;
//			case 6855:
//				itemDef.name = "Christmas Mystery Box";
//				itemDef.stackable = false;
//				itemDef.actions = new String[]{"open", null, null, null, "Drop"};
//				//itemDef.rdc2 = 234563434;
//				break;
//			case 8212:
//				itemDef.name = "Spirit Dust";
//				itemDef.stackable = true;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				itemDef.rdc2 = 234563434;
//				break;
//			case 6849:
//				itemDef.name = "Blue bell";
//				itemDef.stackable = true;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				//itemDef.rdc2 = 234563434;
//				break;
//			case 6850:
//				itemDef.name = "Green bell";
//				itemDef.stackable = true;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				//itemDef.rdc2 = 234563434;
//				break;
//			case 6847:
//				itemDef.name = "Yellow bell";
//				itemDef.stackable = true;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				//itemDef.rdc2 = 234563434;
//				break;
//			case 6851:
//				itemDef.name = "pink bell";
//				itemDef.stackable = true;
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				//itemDef.rdc2 = 234563434;
//				break;
//			case 2396:
//				itemDef.name = "Merry scroll";
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				itemDef.stackable = true;
//
//				itemDef.rdc2 = 2344321;
//				break;
//			case 17718:
//				itemDef.name = "Darkness bow";
//				itemDef.modelID = 64073;
//				itemDef.maleEquip1 = 64074;
//				itemDef.femaleEquip1 = 64074;
//				def = ItemDefinition.get(20171);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;


//			case 17732:
//				itemDef.name = "FyreFighter";
//				itemDef.modelID = 64087;
//				itemDef.maleEquip1 = 64088;
//				itemDef.femaleEquip1 = 64088;
//				def = ItemDefinition.get(1311);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 17734:
//				itemDef.name = "GreatRealm Axe";
//				itemDef.modelID = 64089;
//				itemDef.maleEquip1 = 64090;
//				itemDef.femaleEquip1 = 64090;
//				def = ItemDefinition.get(1311);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 17636:
//				itemDef.name = "Flaming Skeleton";
//				itemDef.modelID = 65525;
//				itemDef.maleEquip1 = 65526;
//				itemDef.femaleEquip1 = 65526;
//				def = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 17644:
//				itemDef.name = "Flaming Katana";
//				itemDef.modelID = 65527;
//				itemDef.maleEquip1 = 65528;
//				itemDef.femaleEquip1 = 65528;
//				def = ItemDefinition.get(1333);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//
//			case 17632:
//				itemDef.name = "Leafy wings";
//				itemDef.modelID = 65517;
//				itemDef.maleEquip1 = 65518;
//				itemDef.femaleEquip1 = 65518;
//				def = ItemDefinition.get(18509);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 29638936;
//
//				break;

//			case 18011:
//				itemDef.name = "<col=E3E3E3>Revenant Whip";
//				itemDef.modelID = 65509;
//				itemDef.maleEquip1 = 65510;
//				itemDef.femaleEquip1 = 65510;
//				def = ItemDefinition.get(4151);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.rdc2 = 8239113;
//				break;
//			case 17624:
//				itemDef.name = "Shadow whip";
//				itemDef.modelID = 65509;
//				itemDef.maleEquip1 = 65510;
//				itemDef.femaleEquip1 = 65510;
//				def = ItemDefinition.get(4151);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 757:
//				itemDef.name = "<col=5cc6cf>Starter Tasks Book";
//				//	itemDef.rdc2 = 92942;
//				break;


//			case 17602:
//				itemDef.name = "<col=b5f2b3>Indravox Cape";
//				itemDef.modelID = 65488;
//				itemDef.maleEquip1 = 65489;
//				itemDef.femaleEquip1 = 65489;
//				def = ItemDefinition.get(18509);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 2324222;
//				break;
//			case 17604:
//				itemDef.name = "Champion Cape";
//				itemDef.modelID = 65490;
//				itemDef.maleEquip1 = 65491;
//				itemDef.femaleEquip1 = 65491;
//				def = ItemDefinition.get(18509);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.rdc2 = 7733;
//				break;

//			case 4555:
//				itemDef.name = "Riddler's helm";
//				itemDef.modelID = 65354;
//				itemDef.maleEquip1 = 65355;
//				itemDef.femaleEquip1 = 65355;
//				def = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 57; // the texture that it currently has
//				itemDef.editedModelColor[0] = 68; //
//				break;
//
//			case 4556:
//				itemDef.name = "Riddler's body";
//				itemDef.modelID = 65356;
//				itemDef.maleEquip1 = 65357;
//				itemDef.femaleEquip1 = 65357;
//				def = ItemDefinition.get(4894);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				// itemDef.rdc2 = 23945;
//				//itemDef.rdc2 = 34737;
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 57; // the texture that it currently has
//				itemDef.editedModelColor[0] = 68; //
//				break;
//
//			case 4557:
//				itemDef.name = "Riddler's legs";
//				itemDef.modelID = 65358;
//				itemDef.maleEquip1 = 65359;
//				itemDef.femaleEquip1 = 65359;
//				def = ItemDefinition.get(4900);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 57; // the texture that it currently has
//				itemDef.editedModelColor[0] = 68; //
//				//	itemDef.rdc2 = 34737;
//				break;
//			case 4558:
//				itemDef.name = "Riddler's Offhand";
//				itemDef.modelID = 65409;
//				itemDef.maleEquip1 = 65411;
//				itemDef.femaleEquip1 = 65411;
//				def = ItemDefinition.get(19146);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[5];
//				itemDef.actions[4] = "Drop";
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{55};
//				itemDef.editedModelColor = new int[]{68};
//				break;
//			case 7014:
//				itemDef.name = "Gold Glaive";
//				itemDef.modelID = 65341;
//				itemDef.maleEquip1 = 65342;
//				itemDef.femaleEquip1 = 65342;
//				def = ItemDefinition.get(20551);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[5];
//				itemDef.actions[4] = "Drop";
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{60, 62};
//				itemDef.editedModelColor = new int[]{70, 70};
//				break;
//			case 9360:
//				itemDef.name = "Master void helm (ranged)";
//
//				itemDef.modelID = 65385;
//				itemDef.maleEquip1 = 65386;
//				itemDef.femaleEquip1 = 65386;
//				itemDef2 = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemDef2.modelOffsetY;
//				itemDef.modelZoom = itemDef2.modelZoom;
//				itemDef.rotationY = itemDef2.rotationY;
//				itemDef.rotationX = itemDef2.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{52};
//				itemDef.editedModelColor = new int[]{73};
//				break;
//			case 9361:
//				itemDef.name = "Master void body";
//				itemDef.modelID = 65387;
//				itemDef.maleEquip1 = 65388;
//				itemDef.femaleEquip1 = 65388;
//				itemDef2 = ItemDefinition.get(4894);
//				itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemDef2.modelOffsetY;
//				itemDef.modelZoom = itemDef2.modelZoom;
//				itemDef.rotationY = itemDef2.rotationY;
//				itemDef.rotationX = itemDef2.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{52};
//				itemDef.editedModelColor = new int[]{73};
//
//				break;
//			case 9362:
//				itemDef.name = "Master Void legs";
//
//				itemDef.modelID = 65389;
//				itemDef.maleEquip1 = 65390;
//				itemDef.femaleEquip1 = 65390;
//				def = ItemDefinition.get(4900);
//				itemDef.modelOffsetX = def.modelOffsetX;
////	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{52};
//				itemDef.editedModelColor = new int[]{73};
//
//				break;
//			case 9363:
//				itemDef.name = "Master void helm (melee)";
//				itemDef.modelID = 65130;
//				itemDef.maleEquip1 = 65131;
//				itemDef.femaleEquip1 = 65131;
//				def = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 73;
//				itemDef.stackable = false;
//				break;
//			case 9364:
//				itemDef.name = "Master void helm (magic)";
//				itemDef.modelID = 65112;
//				itemDef.maleEquip1 = 65113;
//				itemDef.femaleEquip1 = 65113;
//				def = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 73; // the new texture u want it to have
//				itemDef.stackable = false;
//				// itemDef.setTexture(matid, textureid);
//				// itemDef.applyTexturing(model, id);
//				// itemDef.rdc2 = 8822;
//				break;
//			case 15922:
//				itemDef.name = "Doom Helm";
//				itemDef.modelID = 65450;
//				itemDef.maleEquip1 = 65451;
//				itemDef.femaleEquip1 = 65451;
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 57; // the texture that it currently has
//				itemDef.editedModelColor[0] = 66; // the new texture u want it to have
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 7885:
//				itemDef.name = "Mac's blade";
//				ItemDefinition trinity = ItemDefinition.get(20538);
//				// itemDef.modelID = itemDef2.modelID;
//				itemDef.modelID = 65428;
//				itemDef.femaleEquip1 = 65429;
//				itemDef.maleEquip1 = 65429;
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{52};
//				itemDef.editedModelColor = new int[]{52};
//				break;
//			case 20551:
//				itemDef.modelID = 65341;
//				itemDef.maleEquip1 = 65342;
//				itemDef.femaleEquip1 = 65342;
//				itemDef.name = "Elite Glaive (mage)";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.newModelColor = new int[]{60, 62};
//				itemDef.editedModelColor = new int[]{68, 68};
//				//itemDef.rdc2 = 7007;
//				break;
//			case 20558:
//				itemDef.modelID = 65341;
//				itemDef.maleEquip1 = 65342;
//				itemDef.femaleEquip1 = 65342;
//				itemDef.name = "Graceful Glaive";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.newModelColor = new int[]{60, 62};
//				itemDef.editedModelColor = new int[]{57, 57};
//				//itemDef.rdc2 = 7007;
//				break;
//			case 20559:
//				itemDef.name = "Rabies spreader (offhand)";
//				itemDef.modelID = 65409;
//				itemDef.maleEquip1 = 65411;
//				itemDef.femaleEquip1 = 65411;
//				def = ItemDefinition.get(19146);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[5];
//				itemDef.actions[4] = "Drop";
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{55};
//				itemDef.editedModelColor = new int[]{57};
//				break;
//			case 4017:
//				itemDef.modelID = 65341;
//				itemDef.maleEquip1 = 65342;
//				itemDef.femaleEquip1 = 65342;
//				itemDef.name = "<shad=1><col=00e673>Elite Glaive (ranged)";
//				trinity = ItemDefinition.get(20551);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.newModelColor = new int[]{60, 62};
//				itemDef.editedModelColor = new int[]{59, 59};
//				//itemDef.rdc2 = 7007;
//				break;
//			case 4018:
//				itemDef.name = "<shad=1><col=00e673>Extreme Offhand";
//				itemDef.modelID = 65409;
//				itemDef.maleEquip1 = 65411;
//				itemDef.femaleEquip1 = 65411;
//				trinity = ItemDefinition.get(19146);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = new String[5];
//				itemDef.actions[4] = "Drop";
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{55};
//				itemDef.editedModelColor = new int[]{59};
//				break;
//			case 3260:
//				itemDef.name = "@red@Supreme Blade";
//				ItemDefinition trinity2 = ItemDefinition.get(20538);
//				// itemDef.modelID = itemDef2.modelID;
//				itemDef.modelID = 65428;
//				itemDef.femaleEquip1 = 65429;
//				itemDef.maleEquip1 = 65429;
//				itemDef.modelOffsetX = trinity2.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity2.modelOffsetY;
//				itemDef.modelZoom = trinity2.modelZoom;
//				itemDef.rotationY = trinity2.rotationY;
//				itemDef.rotationX = trinity2.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{52};
//				itemDef.editedModelColor = new int[]{52};
//				break;
//			case 5432:
//				itemDef.modelID = 65341;
//				itemDef.maleEquip1 = 65342;
//				itemDef.femaleEquip1 = 65342;
//				itemDef.name = "Maddest glaive";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.newModelColor = new int[]{60, 62};
//				itemDef.editedModelColor = new int[]{71, 71};
//				//itemDef.rdc2 = 7007;
//				break;
//			case 522:
//				itemDef.name = "Saggy's broomstick";
//				itemDef.modelID = 65127;
//				itemDef.maleEquip1 = 65128;
//				itemDef.femaleEquip1 = 65128;
//				def = ItemDefinition.get(1321);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 70;
//				itemDef.stackable = false;
//				break;
//			case 523:// tetsu
//				itemDef.name = "Saggy helm";
//				itemDef.modelID = 65078;
//				itemDef.maleEquip1 = 65079;
//				itemDef.femaleEquip1 = 65079;
//				def = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				//	itemDef.rdc2 = 9999;
//				itemDef.newModelColor = new int[]{55};
//				itemDef.editedModelColor = new int[]{70};
//				break;
//			case 524:// tetsu
//				itemDef.name = "Saggy body";
//				itemDef.modelID = 65080;
//				itemDef.maleEquip1 = 65081;
//				itemDef.femaleEquip1 = 65081;
//				def = ItemDefinition.get(4894);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				//itemDef.rdc2 = 9999;
//				itemDef.newModelColor = new int[]{55};
//				itemDef.editedModelColor = new int[]{70};
//				break;
//			case 525:// tetsu
//				itemDef.name = "Saggy legs";
//				itemDef.modelID = 65082;
//				itemDef.maleEquip1 = 65083;
//				itemDef.femaleEquip1 = 65083;
//				def = ItemDefinition.get(4900);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.newModelColor = new int[]{55};
//				itemDef.editedModelColor = new int[]{70};
//				//	itemDef.rdc2 = 9999;
//				break;


//			case 666:
//				itemDef.name = "<col=b3b4f2>Demon+ hood";
//				def = ItemDefinition.get(15422);
//				itemDef.modelID = def.modelID;
//				itemDef.maleEquip1 = def.maleEquip1;
//				itemDef.femaleEquip1 = def.femaleEquip1;
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.rdc2 = 83433339;
//
//				break;
//			case 15424:
//				itemDef.name = "<col=b3b4f2>Demon+ top";
//
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.rdc2 = 83433339;
//
//				break;
//			case 674:
//				itemDef.name = "<col=b3b4f2>Demon+ bottom";
//				def = ItemDefinition.get(15425);
//				itemDef.modelID = def.modelID;
//				itemDef.maleEquip1 = def.maleEquip1;
//				itemDef.femaleEquip1 = def.femaleEquip1;
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.rdc2 = 83433339;
//
//				break;
			case 669:
				itemDef.name = "Imp wings ";
				def = ItemDefinition.get(4411);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.rdc2 = 3453;
				
				break;
			case 671:
				itemDef.name = "Imp HandCannon ";
				def = ItemDefinition.get(15241);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.rdc2 = 1234;
				
				break;
			case 672:
				itemDef.name = "Imp gloves";
				def = ItemDefinition.get(14602);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.rdc2 = 1234;
				
				break;
			case 673:
				itemDef.name = "Imp boots";
				def = ItemDefinition.get(14605);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.rdc2 = 1234;
				
				break;
			case 14405:
			case 14395:
			case 14415:
				itemDef.name = itemDef.name.replace("class 3", "Imp");
				itemDef.name = itemDef.name.replace("(b)", "");
				itemDef.rdc2 = 54321;
				
				break;

//			case 676:
//				itemDef.name = "Lord longsword";
//				def = ItemDefinition.get(22075);
//				itemDef.modelID = def.modelID;
//				itemDef.maleEquip1 = def.maleEquip1;
//				itemDef.femaleEquip1 = def.femaleEquip1;
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.rdc2 = 9183;
//
//				break;
//			case 681:
//				itemDef.name = "lord of the ring";
//				def = ItemDefinition.get(15398);
//				itemDef.modelID = def.modelID;
//				itemDef.maleEquip1 = def.maleEquip1;
//				itemDef.femaleEquip1 = def.femaleEquip1;
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.rdc2 = 9183;
//
//				break;
//			case 18363:
//				itemDef.name = "Lords deflector";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.rdc2 = 9183;
//
//				break;
//			case 734:
//				itemDef.name = "<col=b3b4f2>Demon big maul";
//				def = ItemDefinition.get(17710);
//				itemDef.modelID = def.modelID;
//				itemDef.maleEquip1 = def.maleEquip1;
//				itemDef.femaleEquip1 = def.femaleEquip1;
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.rdc2 = 49494;
//
//				break;
//			case 19149:
//				itemDef.name = "Swoodo bow";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				break;
//			case 12930:
//				itemDef.name = "Swoodo Shield";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				break;

//			case 16021:
//				itemDef.name = "Doom Body";
//				itemDef.modelID = 65452;
//				itemDef.maleEquip1 = 65453;
//				itemDef.femaleEquip1 = 65453;
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 57; // the texture that it currently has
//				itemDef.editedModelColor[0] = 66; // the new texture u want it to have
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 15933:
//				itemDef.name = "Doom Legs";
//				itemDef.modelID = 65454;
//				itemDef.maleEquip1 = 65455;
//				itemDef.femaleEquip1 = 65455;
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 57; // the texture that it currently has
//				itemDef.editedModelColor[0] = 66; // the new texture u want it to have
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;

//			case 8830:
//				itemDef.name = "Charybde cape";
//				trinity = ItemDefinition.get(6570);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.modelID = 65447;
//				itemDef.maleEquip1 = 65446;
//				itemDef.femaleEquip1 = 65446;
//				itemDef.actions = trinity.actions;
//				itemDef.editedModelColor = new int[2]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[2]; // same here
//				itemDef.newModelColor[0] = 54; // the texture that it currently has
//				itemDef.editedModelColor[0] = 63;
//				itemDef.newModelColor[1] = 65; // the texture that it currently has
//				itemDef.editedModelColor[1] = 63; // the new texture u want it to have
//				itemDef.stackable = false;
//				itemDef.value = 1;
//				break;
//			case 8812:
//				itemDef.name = "Tarn gloves";
//				trinity = ItemDefinition.get(7671);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.modelID = 65360;
//				itemDef.femaleEquip1 = 65361;
//				itemDef.maleEquip1 = 65361;
//				itemDef.actions = trinity.actions;
//
//				itemDef.rdc2 = 24252;
//				break;
//			case 18883:
//				itemDef.name = "Supreme gloves";
//				trinity = ItemDefinition.get(7671);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.modelID = 65360;
//				itemDef.femaleEquip1 = 65361;
//				itemDef.maleEquip1 = 65361;
//				itemDef.actions = trinity.actions;
//				itemDef.rdc2 = 42812;
//				break;

//			case 16194:
//				itemDef.name = "Blood gloves";
//				trinity = ItemDefinition.get(7671);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.modelID = 65360;
//				itemDef.femaleEquip1 = 65361;
//				itemDef.maleEquip1 = 65361;
//				itemDef.actions = trinity.actions;
//				break;
//
//			case 18885:
//				itemDef.name = "@cya@Mega gloves";
//				trinity = ItemDefinition.get(7671);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.modelID = 65360;
//				itemDef.femaleEquip1 = 65361;
//				itemDef.maleEquip1 = 65361;
//				itemDef.actions = trinity.actions;
//				itemDef.rdc2 = 42812;
//				break;

//			case 8819:
//				itemDef.name = "Antique Gloves";
//				trinity = ItemDefinition.get(7671);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.modelID = 65360;
//				itemDef.femaleEquip1 = 65361;
//				itemDef.maleEquip1 = 65361;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				//	itemDef.rdc2 = 47333;
//
//
//				break;
//			case 8820:
//				itemDef.name = "Antique Boots";
//				trinity = ItemDefinition.get(20450);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.modelID = 65362;
//				itemDef.femaleEquip1 = 65362;
//				itemDef.maleEquip1 = 65362;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				break;
//			case 8831:
//				itemDef.name = "Charybde ring";
//				trinity = ItemDefinition.get(15401);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = trinity.actions;
//
//				itemDef.modelID = 65303;
//				itemDef.maleEquip1 = 65303;
//				itemDef.femaleEquip1 = 65303;
//				itemDef.editedModelColor = new int[1]; // same here
//				itemDef.newModelColor = new int[1];
//				itemDef.newModelColor[0] = 51; // the texture that it currently has
//				itemDef.editedModelColor[0] = 63;
//				break;


			/*case 1153:
				itemDef.name = "Starter full helm";
				itemDef.modelID = 80047;
				itemDef.maleEquip1 = 80048;
				itemDef.femaleEquip1 = 80048;
				itemDef.stackable = false;
				itemDef.rdc2 = 77643;
				break;
			case 1115:
				itemDef.name = "Starter platebody";
				itemDef.modelID = 80051;
				itemDef.maleEquip1 = 80052;
				itemDef.femaleEquip1 = 80052;
				itemDef.stackable = false;
				itemDef.rdc2 = 77643;//568322
				break;
			case 1067:
				itemDef.name = "Starter platelegs";
				itemDef.modelID = 80049;
				itemDef.maleEquip1 = 80050;
				itemDef.femaleEquip1 = 80050;
				itemDef.stackable = false;
				itemDef.rdc2 = 77643;
				break;
*/
//			case 8323:
//				itemDef.name = "T4 Magic helm";
//				itemDef.modelID = 65456;
//				itemDef.maleEquip1 = 65457;
//				itemDef.femaleEquip1 = 65457;
//				trinity = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{56};
//				itemDef.editedModelColor = new int[]{79};
//
//				break;
//			case 8324:
//				itemDef.name = "T4 Magic body";
//				itemDef.modelID = 65458;
//				itemDef.maleEquip1 = 65459;
//				itemDef.femaleEquip1 = 65459;
//				trinity = ItemDefinition.get(4894);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{56};
//				itemDef.editedModelColor = new int[]{79};
//
//				break;

//			case 8325:
//				itemDef.name = "T4 Magic legs";
//				itemDef.modelID = 65460;
//				itemDef.maleEquip1 = 65461;
//				itemDef.femaleEquip1 = 65461;
//				trinity = ItemDefinition.get(4900);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{56};
//				itemDef.editedModelColor = new int[]{79};
//
//				break;
//			case 8326:
//				itemDef.name = "Starter helm";
//				itemDef.modelID = 65462;
//				itemDef.maleEquip1 = 65463;
//				itemDef.femaleEquip1 = 65463;
//				trinity = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{56};
//				itemDef.editedModelColor = new int[]{52};
//
//				break;
//			case 8327:
//				itemDef.name = "Starter body";
//				itemDef.modelID = 65464;
//				itemDef.maleEquip1 = 65465;
//				itemDef.femaleEquip1 = 65465;
//				trinity = ItemDefinition.get(4894);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{56};
//				itemDef.editedModelColor = new int[]{52};
//
//				break;
//
//			case 8328:
//				itemDef.name = "Starter legs";
//				itemDef.modelID = 65466;
//				itemDef.maleEquip1 = 65467;
//				itemDef.femaleEquip1 = 65467;
//				trinity = ItemDefinition.get(4900);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{56};
//				itemDef.editedModelColor = new int[]{52};
//
//				break;
////			case 9250:
//				itemDef.name = "Yogifus helm";
//				itemDef.modelID = 65462;
//				itemDef.maleEquip1 = 65463;
//				itemDef.femaleEquip1 = 65463;
//				trinity = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{56};
//				itemDef.editedModelColor = new int[]{67};
//				//	itemDef.rdc2 = 2353627;
//				break;
//			case 9251:
//				itemDef.name = "Yogifus body";
//				itemDef.modelID = 65464;
//				itemDef.maleEquip1 = 65465;
//				itemDef.femaleEquip1 = 65465;
//				trinity = ItemDefinition.get(4894);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{56};
//				itemDef.editedModelColor = new int[]{67};
//				//	itemDef.rdc2 = 2353627;
//				break;
//
//			case 9252:
//				itemDef.name = "Yogifus legs";
//				itemDef.modelID = 65466;
//				itemDef.maleEquip1 = 65467;
//				itemDef.femaleEquip1 = 65467;
//				trinity = ItemDefinition.get(4900);
//				itemDef.modelOffsetX = trinity.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = trinity.modelOffsetY;
//				itemDef.modelZoom = trinity.modelZoom;
//				itemDef.rotationY = trinity.rotationY;
//				itemDef.rotationX = trinity.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{56};
//				itemDef.editedModelColor = new int[]{67};
//				//	itemDef.rdc2 = 2353627;
//				break;
//			case 9253:
//				itemDef.name = "Yogi's picnic basket";
//				ItemDefinition itemdefyogipic = ItemDefinition.get(20538);
//				// itemDef.modelID = itemDef2.modelID;
//				itemDef.modelID = 65428;
//				itemDef.femaleEquip1 = 65429;
//				itemDef.maleEquip1 = 65429;
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.stackable = false;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				//itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{52};
//				itemDef.editedModelColor = new int[]{67};
//				//itemDef.rdc2 = 222222;
//				break;
//			case 9254:
//				itemDef.name = "Madman helm";
//				itemDef.modelID = 65130;
//				itemDef.maleEquip1 = 65131;
//				itemDef.femaleEquip1 = 65131;
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 71;
//				itemDef.stackable = false;
//				break;
//			case 9255:
//				itemDef.name = "Madman platebody";
//				itemDef.modelID = 65132;
//				itemDef.maleEquip1 = 65133;
//				itemDef.femaleEquip1 = 65133;
//				itemdefyogipic = ItemDefinition.get(4894);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 71;
//				itemDef.stackable = false;
//				break;
//			case 9256:
//				itemDef.name = "Madman legs";
//				itemDef.modelID = 65134;
//				itemDef.maleEquip1 = 65135;
//				itemDef.femaleEquip1 = 65135;
//				itemdefyogipic = ItemDefinition.get(4900);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 71;
//				itemDef.stackable = false;
//				break;
//			case 9257:
//				itemDef.name = "Epic Defender";
//				itemDef.modelID = 65127;
//				itemDef.maleEquip1 = 65128;
//				itemDef.femaleEquip1 = 65128;
//				itemdefyogipic = ItemDefinition.get(1321);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 61;
//				itemDef.stackable = false;
//				break;
//			case 9258:
//				itemDef.name = "Yogifus Cape";
//				itemdefyogipic = ItemDefinition.get(6570);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 65104;
//				itemDef.maleEquip1 = 65105;
//				itemDef.femaleEquip1 = 65105;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.editedModelColor = new int[2]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[2]; // same here
//				itemDef.newModelColor[0] = 52; // the texture that it currently has
//				itemDef.editedModelColor[0] = 67;
//				itemDef.newModelColor[1] = 920; // the texture that it currently has
//				itemDef.editedModelColor[1] = 50; // the new texture u want it to have
//				itemDef.stackable = false;
//				itemDef.value = 1;
//				break;
//			case 8330:
//				itemDef.name = "T4 Range helm";
//				itemDef.modelID = 65468;
//				itemDef.maleEquip1 = 65469;
//				itemDef.femaleEquip1 = 65469;
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{56};
//				itemDef.editedModelColor = new int[]{68};
//
//				break;
//			case 8331:
//				itemDef.name = "T4 Range body";
//				itemDef.modelID = 65470;
//				itemDef.maleEquip1 = 65471;
//				itemDef.femaleEquip1 = 65471;
//				itemdefyogipic = ItemDefinition.get(4894);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{56};
//				itemDef.editedModelColor = new int[]{68};
//
//				break;
//
//			case 8332:
//				itemDef.name = "T4 Range legs";
//				itemDef.modelID = 65472;
//				itemDef.maleEquip1 = 65473;
//				itemDef.femaleEquip1 = 65473;
//				itemdefyogipic = ItemDefinition.get(4900);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{56};
//				itemDef.editedModelColor = new int[]{68};
//
//				break;
//			case 8806:
//				itemDef.name = "Lust visor";
//				itemDef.modelID = 65371;
//				itemDef.maleEquip1 = 65372;
//				itemDef.femaleEquip1 = 65372;
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{59};
//				itemDef.editedModelColor = new int[]{54};
//				//	itemDef.rdc2 = 2353627;
//
//				break;
//			case 8807:
//				itemDef.name = "Lust poncho";
//				itemDef.modelID = 65373;
//				itemDef.maleEquip1 = 65374;
//				itemDef.femaleEquip1 = 65374;
//				itemdefyogipic = ItemDefinition.get(4894);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{59};
//				itemDef.editedModelColor = new int[]{54};
//
//				//	itemDef.rdc2 = 2353627;
//				break;
//
//			case 8808:
//				itemDef.name = "Lust legging";
//				itemDef.modelID = 65375;
//				itemDef.maleEquip1 = 65376;
//				itemDef.femaleEquip1 = 65376;
//				itemdefyogipic = ItemDefinition.get(4900);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{59};
//				itemDef.editedModelColor = new int[]{54};
//
//				//	itemDef.rdc2 = 2353627;
//				break;
//			case 8803:
//				itemDef.name = "Titan helm";
//				itemDef.modelID = 65377;
//				itemDef.maleEquip1 = 65378;
//				itemDef.femaleEquip1 = 65378;
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 2353627;
//				itemDef.newModelColor = new int[]{55};
//				itemDef.editedModelColor = new int[]{78};
//
//				break;
//			case 8804:
//				itemDef.name = "Titan body";
//				itemDef.modelID = 65379;
//				itemDef.maleEquip1 = 65380;
//				itemDef.femaleEquip1 = 65380;
//				itemdefyogipic = ItemDefinition.get(4894);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{78};
//				//	itemDef.rdc2 = 2353627;
//
//				break;
//
//			case 8805:
//				itemDef.name = "Titan legs";
//				itemDef.modelID = 65381;
//				itemDef.maleEquip1 = 65382;
//				itemDef.femaleEquip1 = 65382;
//				itemdefyogipic = ItemDefinition.get(4900);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{78};
//				//	itemDef.rdc2 = 2353627;
//
//				break;
//			case 8821:
//				itemDef.name = "Shikruu wings";
//				itemDef.modelID = 65369;
//				itemDef.maleEquip1 = 65370;
//				itemDef.femaleEquip1 = 65370;
//				itemdefyogipic = ItemDefinition.get(18509);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{55};
//				//	itemDef.rdc2 = 2353627;
//				break;

//			case 8860:
//				itemDef.name = "Predator helm";
//				itemDef.modelID = 65403;
//				itemDef.maleEquip1 = 65404;
//				itemDef.femaleEquip1 = 65404;
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{63};
//				itemDef.editedModelColor = new int[]{70};
//
//				break;
//			case 8861:
//				itemDef.name = "Predator body";
//				itemDef.modelID = 65405;
//				itemDef.maleEquip1 = 65406;
//				itemDef.femaleEquip1 = 65406;
//				itemdefyogipic = ItemDefinition.get(4894);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{63};
//				itemDef.editedModelColor = new int[]{70};
//
//				break;
//
//			case 8862:
//				itemDef.name = "Predator legs";
//				itemDef.modelID = 65407;
//				itemDef.maleEquip1 = 65408;
//				itemDef.femaleEquip1 = 65408;
//				itemdefyogipic = ItemDefinition.get(4900);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{63};
//				itemDef.editedModelColor = new int[]{70};
//
//				break;

//			case 16835:
//				itemDef.name = "Nebula whip";
//				itemDef.modelID = 65141;
//				itemDef.maleEquip1 = 65142;
//				itemDef.femaleEquip1 = 65142;
//				itemdefyogipic = ItemDefinition.get(13131);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 61; // the new texture u want it to have
//				itemDef.stackable = false;
//				break;
//			case 5154:
//				itemDef.name = "Multiplier @cya@+100";
//				itemdefyogipic = ItemDefinition.get(12845);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.modelID = itemdefyogipic.modelID;
//				break;
//			case 5155:
//				itemDef.name = "Multiplier @cya@+1000";
//				itemdefyogipic = ItemDefinition.get(12845);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.modelID = itemdefyogipic.modelID;
//				break;
//			case 5156:
//				itemDef.name = "Multiplier @cya@+10000";
//				itemdefyogipic = ItemDefinition.get(12845);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.modelID = itemdefyogipic.modelID;
//				break;
//			case 5500:
//				itemDef.name = "<img=15>Multiplier +1";
//				itemdefyogipic = ItemDefinition.get(12845);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.rdc2 = 292;
//				break;



//			case 13172:
//				itemDef.name = "Inferno cat mask";
//				itemDef.rdc2 = 852661;
//				break;
//
//			case 13169:
//				itemDef.name = "Brown sheep mask";
//				itemDef.rdc2 = 3256;
//				break;
//			case 10721:
//				itemDef.name = "Black frog mask";
//				itemDef.rdc2 = 46234;
//				break;
//			case 19278:
//				itemDef.name = "Golden unicorn mask";
//				itemDef.rdc2 = 9924;
//				break;
//			case 9920:
//				itemDef.name = "Haunted jack lantern mask";
//				itemDef.rdc2 = 34563;//1242
//				break;
//			case 14824:
//				itemDef.name = "Octo mask ";
//				itemDef.rdc2 = 24242;
//				break;
//			case 14825:
//				itemDef.name = "Ray mask";
//				itemDef.rdc2 = 24242;
//				break;
//			case 14826:
//				itemDef.name = "Manta mask";
//				itemDef.rdc2 = 24242;
//				break;
//			case 8809:
//				itemDef.name = "Lust staff";
//				itemDef.modelID = 65383;
//				itemDef.maleEquip1 = 65384;
//				itemDef.femaleEquip1 = 65384;
//				itemdefyogipic = ItemDefinition.get(19146);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[5];
//				itemDef.newModelColor = new int[]{59};
//				itemDef.editedModelColor = new int[]{54};
//				itemDef.actions[4] = "Drop";
//				itemDef.actions[1] = "Wear"/*done*/; //done
//				itemDef.actions[2] = "Dissolve";
//
//				itemDef.stackable = false;
//				break;
//			case 15830:
//				itemDef.name = "Predator boots";
//
//
//				break;

//			case 8810:
//				itemDef.modelID = 65351;
//				itemDef.maleEquip1 = 65352;
//				itemDef.femaleEquip1 = 65352;
//				itemDef.name = "<col=7f39f2>Tarn Wings";
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 59; // the texture that it currently has
//				itemDef.editedModelColor[0] = 71; //
//				itemDef.actions = new String[5];
//				itemDef.actions[4] = "Drop";
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//
//
//				break;
			case 11195:
				itemDef.name = "<col=39383a>Nite Necklace";
				itemDef.rdc2 = 7262;
				

				break;


//			case 15818:
//				itemDef.name = "Champion Off-Hand";
//				itemDef.modelID = 65127;
//				itemDef.maleEquip1 = 65128;
//				itemDef.femaleEquip1 = 65128;
//				itemdefyogipic = ItemDefinition.get(1321);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 12;
//
//				itemDef.stackable = false;
//				break;
//			case 15888:
//				itemDef.name = "Champion whip";
//				itemDef.modelID = 65141;
//				itemDef.maleEquip1 = 65142;
//				itemDef.femaleEquip1 = 65142;
//				itemdefyogipic = ItemDefinition.get(13131);
//				itemDef.modelOffsetX = 10;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = 1;
//				itemDef.modelZoom = 1000;
//				itemDef.rotationY = 600;
//				itemDef.rotationX = 120;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.newModelColor = new int[]{59, 40};
//				itemDef.editedModelColor = new int[]{12, 74};
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 74; // the new texture u want it to hav
//
//				itemDef.stackable = false;
//				break;
//
//			case 15924:
//				itemDef.name = "Champion helm";
//				itemDef.modelID = 65335;
//				//itemDef.name = "Torva full helm";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.maleEquip1 = 65336;
//				itemDef.femaleEquip1 = 65336;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				// itemDef.actions[2] = "Check-charges";
//				itemDef.actions[4] = "Drop";
//				//itemDef.maleDialogue = 62729;
//				//itemDef.femaleDialogue = 62729;
//				itemDef.newModelColor = new int[]{24, 40};
//				itemDef.editedModelColor = new int[]{53, 12};
//				itemDef.stackable = false;
//
//				break;
//			case 16023:
//				itemDef.name = "Champion platebody";
//				itemDef.stackable = false;
//				itemDef.modelID = 65337;
//				//	itemDef.name = "Torva platebody";
//				itemDef.modelZoom = 1506;
//				itemDef.rotationY = 473;
//				itemDef.rotationX = 2042;
//				itemDef.modelOffsetX = 0;
//				itemDef.modelOffsetY = 0;
//				itemDef.maleEquip1 = 65338;
//				itemDef.femaleEquip1 = 65338;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				// itemDef.actions[2] = "Check-charges";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{24, 40};
//				itemDef.editedModelColor = new int[]{53, 12};
//
//				break;
//			case 15935:
//				itemDef.name = "Champion legs";
//				itemDef.stackable = false;
//				itemDef.modelID = 65339;
//				//		itemDef.name = "Torva platelegs";
//				itemDef.modelZoom = 1740;
//				itemDef.rotationY = 474;
//				itemDef.rotationX = 2045;
//				itemDef.modelOffsetX = 0;
//				itemDef.modelOffsetY = -5;
//				itemDef.maleEquip1 = 65340;
//				itemDef.femaleEquip1 = 65340;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				// itemDef.actions[2] = "Check-charges";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{24, 40};
//				itemDef.editedModelColor = new int[]{53, 12};
//
//				break;

//			case 16272:
//				itemDef.name = "Champion boots";
//				itemDef.modelID = 65138;
//				itemDef.maleEquip1 = 65138;
//				itemDef.femaleEquip1 = 65138;
//				itemdefyogipic = ItemDefinition.get(3791);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 12;
//				itemDef.stackable = false;
//
//				// itemDef.rdc2 = 8822;
//				break;
//			case 15591:
//				itemDef.name = "xat full helm";
//				itemDef.modelID = 65440;
//				itemDef.maleEquip1 = 65441;
//				itemDef.femaleEquip1 = 65441;
//				itemdefyogipic = ItemDefinition.get(16691);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.rdc2 = 121212;
//				break;
//			case 15592:
//				itemDef.name = "xat platebody";
//				itemDef.modelID = 65442;
//				itemDef.maleEquip1 = 65443;
//				itemDef.femaleEquip1 = 65443;
//				itemdefyogipic = ItemDefinition.get(17239);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.rdc2 = 121212;
//				break;
//			case 15593:
//				itemDef.name = "<col=b5aaaa>Angelic platelegs";
//				itemDef.modelID = 65444;
//				itemDef.maleEquip1 = 65445;
//				itemDef.femaleEquip1 = 65445;
//				itemdefyogipic = ItemDefinition.get(16669);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.rdc2 = 121212;
//
//				break;

//			case 15915:
//				itemDef.name = "@red@Burning head";
//				itemDef.modelID = 65433;
//				itemDef.maleEquip1 = 65434;
//				itemDef.femaleEquip1 = 65434;
//				break;
//			case 15916:
//				itemDef.name = "Crown of hearts";
//				itemDef.modelID = 93514;
//				itemDef.maleEquip1 = 93498;
//				itemDef.femaleEquip1 = 93498;
//				itemDef.maleWieldY = 5;
//				itemDef.modelZoom = 658;
//				itemDef.modelOffsetX = 1;
//				itemDef.modelOffsetY = -4;
//				itemDef.rotationX = 2031;
//				itemDef.rotationY = 475;
//				itemDef.rotationZ = 1;
//				break;
//			case 13556:
//				itemDef.copyItem(17011);
//				itemDef.name = "Staff of Adoration";
//				itemDef.modelID = 93511;
//				itemDef.maleEquip1 = 93501;
//				itemDef.femaleEquip1 = 93501;
//				itemDef.modelZoom = 1579;
//				itemDef.modelOffsetX = -3;
//				itemDef.modelOffsetY = 1;
//				itemDef.rotationX = 48;
//				itemDef.rotationY = 660;
//				itemDef.rotationZ = 13;
//				break;
//			case 13558:
//				itemDef.copyItem(12160);
//				itemDef.name = "@red@Easter Attachment";
//				itemDef.rdc2 = 52966;
//				itemDef.stackable = true;
//				break;
//			case 13800:
//				itemDef.copyItem(15916);
//				itemDef.name = "St. Patrick's Hat";
//				itemDef.modelID = 98004;
//				itemDef.maleEquip1 = 98005;
//				itemDef.femaleEquip1 = 98005;
//				itemDef.maleWieldY = 5;
//				itemDef.modelZoom = 700;
//				itemDef.modelOffsetX = 1;
//				itemDef.modelOffsetY = -1;
//				itemDef.rotationX = 2031;
//				itemDef.rotationY = 0;
//				itemDef.rotationZ = 1;
//				break;
//			case 13801:
//				itemDef.copyItem(17011);
//				itemDef.name = "St. Patrick's Sword";
//				itemDef.modelID = 98002;
//				itemDef.maleEquip1 = 98003;
//				itemDef.femaleEquip1 = 98003;
//				itemDef.modelZoom = 1579;
//				itemDef.modelOffsetX = -3;
//				itemDef.modelOffsetY = 1;
//				itemDef.rotationX = 48;
//				itemDef.rotationY = 660;
//				itemDef.rotationZ = 13;
//				break;
//			case 13802:
//				itemDef.copyItem(6199);
//				itemDef.name = "St. Patrick's Box";
//				itemDef.newModelColor = new int[]{2999, 926, 22410};
//				itemDef.editedModelColor = new int[]{19197, 20386, 20386};
//				break;

//			case 16014:
//				itemDef.name = "@red@Burning top";
//				itemDef.modelID = 65435;
//				itemDef.maleEquip1 = 65436;
//				itemDef.femaleEquip1 = 65436;
//				break;
//			case 15926:
//				itemDef.name = "@red@Burning legs";
//				itemDef.modelID = 65437;
//				itemDef.maleEquip1 = 65438;
//				itemDef.femaleEquip1 = 65438;
//				break;
//			case 20592:
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.name = "@blu@Aberrant head";
//				itemdefyogipic = ItemDefinition.get(15915);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 65474;
//				itemDef.maleEquip1 = 65475;
//				itemDef.femaleEquip1 = 65475;
//				itemDef.rdc2 = 29592;
//				break;
//			case 20593:
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.name = "@blu@Aberrant top";
//				itemdefyogipic = ItemDefinition.get(16014);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 65476;
//				itemDef.maleEquip1 = 65477;
//				itemDef.femaleEquip1 = 65477;
//				itemDef.rdc2 = 29592;
//
//				break;
//			case 20594:
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemdefyogipic = ItemDefinition.get(15926);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.name = "@blu@Aberrant legs";
//				itemDef.modelID = 65478;
//				itemDef.maleEquip1 = 65479;
//				itemDef.femaleEquip1 = 65479;
//				itemDef.rdc2 = 29592;
//				break;




//			case 16137:
//				itemDef.name = "Aberrant 2h sword";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				break;
//			case 8329:
//				itemDef.name = "Aberrant Defender";
//				itemDef.modelID = 65127;
//				itemDef.maleEquip1 = 65128;
//				itemDef.femaleEquip1 = 65128;
//				itemdefyogipic = ItemDefinition.get(1321);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 40; // the texture that it currently has
//				itemDef.editedModelColor[0] = 62;
//				itemDef.stackable = false;
//				break;
//			case 11140:
//				itemDef.name = "Aberrant gloves";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 19892:
//				itemDef.name = "Aberrant Amulet";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 15834:
//				itemDef.name = "Owner's Necklace";
//				break;
//			case 8335:
//				itemDef.name = "Aberrant Ring";
//				itemDef.modelID = 65303;
//				itemDef.maleEquip1 = 65303;
//				itemDef.femaleEquip1 = 65303;
//				itemdefyogipic = ItemDefinition.get(15401);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // same here
//				itemDef.newModelColor = new int[1];
//				itemDef.newModelColor[0] = 51; // the texture that it currently has
//				itemDef.editedModelColor[0] = 62;
//
//				break;
//
//			case 8334:
//				itemDef.name = "Aberrant boots";
//				itemDef.modelID = 65226;
//				itemDef.maleEquip1 = 65226;
//				itemDef.femaleEquip1 = 65226;
//				itemdefyogipic = ItemDefinition.get(3791);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 60; // the texture that it currently has
//				itemDef.editedModelColor[0] = 62; // the new texture u want it to have
//				itemDef.stackable = false;
//				break;
//			case 8336:
//				itemDef.name = "eatmycaca helm";
//				itemDef.modelID = 65231;
//				itemDef.maleEquip1 = 65232;
//				itemDef.femaleEquip1 = 65232;
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 60; // the texture that it currently has
//				itemDef.editedModelColor[0] = 70; // the new texture u want it to have
//				itemDef.stackable = false;
//				break;
//			case 8337:
//				itemDef.name = "eatmycaca body";
//				itemDef.modelID = 65233;
//				itemDef.maleEquip1 = 65234;
//				itemDef.femaleEquip1 = 65234;
//				itemdefyogipic = ItemDefinition.get(4894);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 60; // the texture that it currently has
//				itemDef.editedModelColor[0] = 70; // the new texture u want it to have
//				itemDef.stackable = false;
//				break;
//			case 8338:
//				itemDef.name = "eatmycaca chaps";
//				itemDef.modelID = 65235;
//				itemDef.maleEquip1 = 65236;
//				itemDef.femaleEquip1 = 65236;// im not lagging
//				itemdefyogipic = ItemDefinition.get(4900);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 60; // the texture that it currently has
//				itemDef.editedModelColor[0] = 70; //
//				itemDef.stackable = false;
//				break;
//			case 19112:
//				itemDef.name = "Collector Donation";
//				itemDef.actions = new String[5];
//				itemDef.actions[0] = "Open";
//				itemdefyogipic = ItemDefinition.get(290);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.rdc2 = 259252;
//				break;
//			case 7956:
//				itemDef.name = "PvM Box";
//				itemDef.actions = new String[5];
//				itemDef.actions[0] = "Open";
//				itemdefyogipic = ItemDefinition.get(6199);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				// itemDef.modelID = itemDef2.modelID;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.newModelColor = new int[]{63};
//				itemDef.editedModelColor = new int[]{67};
//				itemDef.modelID = 65284;
//				break;
//			case 7120:
//				itemDef.name = "@or2@Slayer Box";
//				itemDef.actions = new String[5];
//				itemDef.actions[0] = "Open";
//				itemdefyogipic = ItemDefinition.get(6199);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				// itemDef.modelID = itemDef2.modelID;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.newModelColor = new int[]{63};
//				itemDef.editedModelColor = new int[]{81};
//				itemDef.modelID = 65284;
//				break;


//			case 13306:
//				itemDef.name = "Inferno Anti-Shield";
//				itemDef.modelID = 65506;
//				itemDef.maleEquip1 = 65507;
//				itemDef.femaleEquip1 = 65507;
//				def = ItemDefinition.get(18509);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.rdc2 = 101922;
//
//
//
//				break;

//			case 13300:
//				itemDef.name = "Inferno Helm";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = 1;
//				itemDef.modelOffsetY = -60;
//				itemDef.modelZoom = 1000;
//				itemDef.rotationY = 230;
//				itemDef.rotationX = 200;
//				itemDef.modelID = 64114;
//				itemDef.maleEquip1 = 64115;
//				itemDef.femaleEquip1 = 64115;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{54};
//				break;
//			case 13301:
//				itemDef.name = "Inferno Body";
//				itemdefyogipic = ItemDefinition.get(5575);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = 1600;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64116;
//				itemDef.maleEquip1 = 64117;
//				itemDef.femaleEquip1 = 64117;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{54};
//				break;
//			case 13304:
//				itemDef.name = "Inferno Legs";
//				itemdefyogipic = ItemDefinition.get(5576);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = 20;
//				itemDef.modelZoom = 2000;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64118;
//				itemDef.maleEquip1 = 64119;
//				itemDef.femaleEquip1 = 64119;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{54};
//				break;
//			case 13302:
//				itemDef.name = "Inferno gloves";
//				itemdefyogipic = ItemDefinition.get(7461);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64120;
//				itemDef.maleEquip1 = 64121;
//				itemDef.femaleEquip1 = 64121;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.rdc2 = 145242;
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 18881:
//				itemDef.name = "Supreme Boots";
//				itemDef.modelID = 65226;
//				itemDef.maleEquip1 = 65226;
//				itemDef.femaleEquip1 = 65226;
//				itemdefyogipic = ItemDefinition.get(3791);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 60; // the texture that it currently has
//				itemDef.editedModelColor[0] = 76; // the new texture u want it to have
//				itemDef.stackable = false;
//				break;

//			case 18887:
//				itemDef.name = "@cya@Mega Boots";
//				itemDef.modelID = 65226;
//				itemDef.maleEquip1 = 65226;
//				itemDef.femaleEquip1 = 65226;
//				itemdefyogipic = ItemDefinition.get(3791);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
//				itemDef.newModelColor = new int[1]; // same here
//				itemDef.newModelColor[0] = 60; // the texture that it currently has
//				itemDef.editedModelColor[0] = 78; // the new texture u want it to have
//				itemDef.stackable = false;
//				break;
//			case 13305:
//				itemDef.name = "Inferno boots";
//				itemdefyogipic = ItemDefinition.get(7114);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64122;
//				itemDef.maleEquip1 = 64122;
//				itemDef.femaleEquip1 = 64122;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 12265:
//				itemDef.name = "Ice Torva full helm";
//				itemdefyogipic = ItemDefinition.get(14008);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
//				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 36262;
//				break;
//			case 12266:
//				itemDef.name = "Ice Torva platebody";
//				itemdefyogipic = ItemDefinition.get(14009);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
//				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 36262;
//				break;
//			case 12267:
//				itemDef.name = "Ice Torva platelegs";
//				itemdefyogipic = ItemDefinition.get(14010);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
//				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 36262;
//				break;

//			case 13025:
//				itemDef.name = "Grinch head";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64306;
//				itemDef.maleEquip1 = 64307;
//				itemDef.femaleEquip1 = 64307;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 13027:
//				itemDef.name = "Grinch body";
//				itemdefyogipic = ItemDefinition.get(5575);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64308;
//				itemDef.maleEquip1 = 64309;
//				itemDef.femaleEquip1 = 64309;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 13023:
//				itemDef.name = "Grinch legs";
//				itemdefyogipic = ItemDefinition.get(5576);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64310;
//				itemDef.maleEquip1 = 64311;
//				itemDef.femaleEquip1 = 64311;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 13029:
//				itemDef.name = "Grinch gloves";
//				itemdefyogipic = ItemDefinition.get(7461);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64312;
//				itemDef.maleEquip1 = 64313;
//				itemDef.femaleEquip1 = 64313;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 13031:
//				itemDef.name = "Grinch boots";
//				itemdefyogipic = ItemDefinition.get(7114);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64314;
//				itemDef.maleEquip1 = 64314;
//				itemDef.femaleEquip1 = 64314;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;


//			case 21053:
//				itemDef.name = "forbidden Ballista";
//				itemDef.modelID = 64291;
//				itemDef.maleEquip1 = 64292;
//				itemDef.femaleEquip1 = 64292;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				break;
//			case 21054:
//				itemDef.name = "@gre@Imperial Ballista";
//				itemDef.modelID = 64291;
//				itemDef.maleEquip1 = 64292;
//				itemDef.femaleEquip1 = 64292;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.rdc2 = 24204;
//				break;
//			case 21055:
//				itemDef.name = "Nagi Ballista";
//				itemDef.modelID = 64291;
//				itemDef.maleEquip1 = 64292;
//				itemDef.femaleEquip1 = 64292;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.rdc2 = 9999898;
//				break;
//			case 21056:
//				itemDef.name = "Damned Ballista";
//				itemDef.modelID = 64291;
//				itemDef.maleEquip1 = 64292;
//				itemDef.femaleEquip1 = 64292;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.rdc2 = 553535;
//				break;

//			case 21058:
//				itemDef.name = "dualsaber";
//				itemDef.modelID = 64295;
//				itemDef.maleEquip1 = 64296;
//				itemDef.femaleEquip1 = 64296;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				break;
//			case 18665:
//				itemDef.name = "Slayer reward key";
//				break;
//			case 3849:
//				itemDef.name = "Slayer reward chest";
//				break;
//			case 21060:
//				itemDef.name = "Slayer dualsaber";
//				itemDef.modelID = 64295;
//				itemDef.maleEquip1 = 64296;
//				itemDef.femaleEquip1 = 64296;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 295925;
//
//				break;
//			case 21061:
//				itemDef.name = "dualsaber";
//				itemDef.modelID = 64295;
//				itemDef.maleEquip1 = 64296;
//				itemDef.femaleEquip1 = 64296;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 77777;
//				break;
//			case 21059:
//				itemDef.name = "Slapping hand";
//				itemDef.modelID = 64298;
//				itemDef.maleEquip1 = 64297;
//				itemDef.femaleEquip1 = 64297;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				break;

//			case 20497:
//				itemDef.name = "Supreme bow (i)";
//				itemDef.modelID = 64233;
//				itemDef.maleEquip1 = 64234;
//				itemDef.femaleEquip1 = 64234;
//				itemDef21 = ItemDefinition.get(4755);
//				itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemDef21.modelOffsetY;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = itemDef21.rotationX;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//				itemDef.rdc2 = 587654;
//				break;
//			case 21019:
//				itemDef.name = "Turtle spirit shield";
//				itemDef.modelID = 64235;
//				itemDef.maleEquip1 = 64236;
//				itemDef.femaleEquip1 = 64236;
//				itemDef21 = ItemDefinition.get(1540);
//				itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemDef21.modelOffsetY;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = itemDef21.rotationX;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//				itemDef.rdc2 = 987654;
//
//				break;
			//cyan 444444

//			case 20098:
//				itemDef.name = "@gre@Imperial Scimitar";
//				itemdefyogipic = ItemDefinition.get(4587);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64209;
//				itemDef.maleEquip1 = 64210;
//				itemDef.femaleEquip1 = 64210;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 44322;
//				break;
//			case 20099:
//				itemDef.name = "@gre@Imperial Cape";
//				itemdefyogipic = ItemDefinition.get(2413);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64211;
//				itemDef.maleEquip1 = 64212;
//				itemDef.femaleEquip1 = 64212;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 44322;
//				break;
//			case 20100:
//				itemDef.name = "@gre@Imperial Rapier";
//				itemdefyogipic = ItemDefinition.get(4587);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64213;
//				itemDef.maleEquip1 = 64214;
//				itemDef.femaleEquip1 = 64214;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 44322;
//				break;
//			case 21062:
//				itemDef.name = "Nagi helm";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64194;
//				itemDef.maleEquip1 = 64195;
//				itemDef.femaleEquip1 = 64195;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//				itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 23662;
//				break;

//			case 21072:
//				itemDef.name = "Nagi rapier";
//				itemdefyogipic = ItemDefinition.get(4587);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64213;
//				itemDef.maleEquip1 = 64214;
//				itemDef.femaleEquip1 = 64214;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 77743;
//				break;
//			case 21073:
//				itemDef.name = "Nagi Scimitar";
//				itemdefyogipic = ItemDefinition.get(4587);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
//				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.actions = new String[]{null, "Wear", null, "Upgrade", "Drop"};
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 12124;
//				break;


//			case 21048:
//				itemDef.name = "Tormented Sword";
//				itemDef.modelID = 64280;
//				itemDef.maleEquip1 = 64281;
//				itemDef.femaleEquip1 = 64281;
//				itemDef21 = ItemDefinition.get(4755);
//				itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
//				itemDef.modelOffsetY = itemDef21.modelOffsetY;
//				itemDef.modelZoom = itemDef21.modelZoom;
//				itemDef.rotationY = itemDef21.rotationY;
//				itemDef.rotationX = itemDef21.rotationX;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{73};
//				break;
//			case 21049:
//				itemDef.name = "Tormented Shield";
//				itemdefyogipic = ItemDefinition.get(1540);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64282;
//				itemDef.maleEquip1 = 64283;
//				itemDef.femaleEquip1 = 64283;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{73};
//				break;
//
//			case 15235:
//				itemDef.name = "Electric gloves";
//				itemdefyogipic = ItemDefinition.get(7461);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = 1100;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64175;
//				itemDef.maleEquip1 = 64176;
//				itemDef.femaleEquip1 = 64176;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 15236:
//				itemDef.name = "Electric boots";
//				itemdefyogipic = ItemDefinition.get(7114);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64177;
//				itemDef.maleEquip1 = 64178;
//				itemDef.femaleEquip1 = 64178;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 11305:
//				itemDef.name = "Earthquake full helm";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64151;
//				itemDef.maleEquip1 = 64152;
//				itemDef.femaleEquip1 = 64152;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 3462;
//				break;
//			case 11306:
//				itemDef.name = "Earthquake platebody";
//				itemdefyogipic = ItemDefinition.get(5575);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64153;
//				itemDef.maleEquip1 = 64154;
//				itemDef.femaleEquip1 = 64154;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 3462;
//				break;
//
//			case 11307:
//				itemDef.name = "Earthquake platelegs";
//				itemdefyogipic = ItemDefinition.get(5576);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64155;
//				itemDef.maleEquip1 = 64156;
//				itemDef.femaleEquip1 = 64156;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 3462;
//				break;
//			case 11308:
//				itemDef.name = "Earthquake battlesword";
//				itemDef.modelID = 64157;
//				itemDef.maleEquip1 = 64158;
//				itemDef.femaleEquip1 = 64158;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				itemDef.rdc2 = 3462;
//
//				break;
//			case 11300:
//				itemDef.name = "Defender full helm";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64141;
//				itemDef.maleEquip1 = 64142;
//				itemDef.femaleEquip1 = 64142;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{58};
//				break;
//			case 11301:
//				itemDef.name = "Defender fighterbody";
//				itemdefyogipic = ItemDefinition.get(5575);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64143;
//				itemDef.maleEquip1 = 64144;
//				itemDef.femaleEquip1 = 64144;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{58};
//				break;
//			case 11302:
//				itemDef.name = "Defender fighterlegs";
//				itemdefyogipic = ItemDefinition.get(5576);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64145;
//				itemDef.maleEquip1 = 64146;
//				itemDef.femaleEquip1 = 64146;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{58};
//				break;
//			case 11303:
//				itemDef.name = "Defender kiteshield";
//				itemdefyogipic = ItemDefinition.get(1540);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64147;
//				itemDef.maleEquip1 = 64148;
//				itemDef.femaleEquip1 = 64148;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{58};
//				break;
//			case 11304:
//				itemDef.name = "Defender cape";
//				itemdefyogipic = ItemDefinition.get(2413);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64149;
//				itemDef.maleEquip1 = 64150;
//				itemDef.femaleEquip1 = 64150;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{58};
//				break;
//			case 11315:
//				ItemDefinition itemDef2111 = ItemDefinition.get(12479);
//				itemDef.modelID = 64100;
//				itemDef.modelOffsetX = itemDef2111.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
//				itemDef.modelOffsetY = itemDef2111.modelOffsetY;
//				itemDef.modelZoom = 7950;
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.name = "<img=1355><col=f8ac00>double afk pet";
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
//				break;
//			case 11316:
//				ItemDefinition votingpoting = ItemDefinition.get(12479);
//				itemDef.modelID = 64098;
//				itemDef.modelOffsetX = votingpoting.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
//				itemDef.modelOffsetY = votingpoting.modelOffsetY;
//				itemDef.modelZoom = 7550;
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.name = "<img=28><col=f8ac00>Double vote pet";
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
//				break;

//			case 5504:
//				ItemDefinition charizard = ItemDefinition.get(12479);
//				itemDef.modelID = 64067;
//				itemDef.modelOffsetX = charizard.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
//				itemDef.modelOffsetY = charizard.modelOffsetY;
//				itemDef.modelZoom = 4000;
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.name = "Charizard pet";
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
//				break;
//			case 5506:
//				ItemDefinition donkeykong2 = ItemDefinition.get(12479);
//				itemDef.modelID = 64225;
//				itemDef.modelOffsetX = donkeykong2.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
//				itemDef.modelOffsetY = donkeykong2.modelOffsetY;
//				itemDef.modelZoom = 4000;
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.name = "Donkeykong pet";
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
//				break;
//			case 5507:
//				ItemDefinition sonicw = ItemDefinition.get(12479);
//				itemDef.modelID = 64224;
//				itemDef.modelOffsetX = sonicw.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
//				itemDef.modelOffsetY = sonicw.modelOffsetY;
//				itemDef.modelZoom = 3000;
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.name = "Sonic pet";
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
//				break;
//			case 5508:
//				ItemDefinition Mario = ItemDefinition.get(12479);
//				itemDef.modelID = 64223;
//				itemDef.modelOffsetX = Mario.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
//				itemDef.modelOffsetY = Mario.modelOffsetY;
//				itemDef.modelZoom = 3000;
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.name = "Mario pet";
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
//				break;
//			case 5560:
//				ItemDefinition superstar2 = ItemDefinition.get(12479);
//				itemDef.modelID = 64305;
//				itemDef.modelOffsetX = superstar2.modelOffsetX;
//				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
//				itemDef.modelOffsetY = superstar2.modelOffsetY;
//				itemDef.modelZoom = 2000;
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.name = "Super Star pet";
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
//				break;
//			case 5563:
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = 1000;
//				itemDef.rotationY = 10;
//				itemDef.rotationX = 10;
//				itemDef.modelID = 64306;
//
//				itemDef.name = "Grinch pet @whi@X2 EXP@or1@";
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
//				break;



//			case 14817:
//				itemdefyogipic = ItemDefinition.get(14819);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.name = "x2 Invention XP Certificate";
//				itemDef.rdc2 = 2592;
//				break;
//			case 14827:
//				itemDef.name = "American pernix hood";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = 1;
//				itemDef.modelOffsetY = 200;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = 260;
//				itemDef.rotationX = 20;
//				itemDef.modelID = 64159;
//				itemDef.maleEquip1 = 64160;
//				itemDef.femaleEquip1 = 64160;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 14818:
//				itemDef.name = "American pernix body";
//				itemdefyogipic = ItemDefinition.get(5575);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = 1350;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64161;
//				itemDef.maleEquip1 = 64162;
//				itemDef.femaleEquip1 = 64162;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
////				break;
//			case 14820:
//				itemDef.name = "American pernix legs";
//				itemdefyogipic = ItemDefinition.get(5576);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = 7;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64163;
//				itemDef.maleEquip1 = 64164;
//				itemDef.femaleEquip1 = 64164;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 21050:
//				itemDef.name = "Slayermaster hood";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64284;
//				itemDef.maleEquip1 = 64285;
//				itemDef.femaleEquip1 = 64285;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 21051:
//				itemDef.name = "Slayermaster body";
//				itemdefyogipic = ItemDefinition.get(5575);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64286;
//				itemDef.maleEquip1 = 64287;
//				itemDef.femaleEquip1 = 64287;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 21052:
//				itemDef.name = "Slayermaster legs";
//				itemdefyogipic = ItemDefinition.get(5576);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64288;
//				itemDef.maleEquip1 = 64289;
//				itemDef.femaleEquip1 = 64289;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 21025:
//				itemDef.name = "Samurai head";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64247;
//				itemDef.maleEquip1 = 64248;
//				itemDef.femaleEquip1 = 64248;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 21026:
//				itemDef.name = "Samurai body";
//				itemdefyogipic = ItemDefinition.get(5575);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64249;
//				itemDef.maleEquip1 = 64250;
//				itemDef.femaleEquip1 = 64250;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 21027:
//				itemDef.name = "Samurai legs";
//				itemdefyogipic = ItemDefinition.get(5576);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64251;
//				itemDef.maleEquip1 = 64252;
//				itemDef.femaleEquip1 = 64252;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 21028:
//				itemDef.name = "Saint helm";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64253;
//				itemDef.maleEquip1 = 64254;
//				itemDef.femaleEquip1 = 64254;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 923295;
//				break;
//			case 21029:
//				itemDef.name = "Saint body";
//				itemdefyogipic = ItemDefinition.get(5575);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64255;
//				itemDef.maleEquip1 = 64256;
//				itemDef.femaleEquip1 = 64256;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 923295;
//				break;
//			case 21030:
//				itemDef.name = "Saint legs";
//				itemdefyogipic = ItemDefinition.get(5576);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64257;
//				itemDef.maleEquip1 = 64258;
//				itemDef.femaleEquip1 = 64258;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 923295;
//				break;
//			case 11009:
//				itemDef.name = "Hotshot helm";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64186;
//				itemDef.maleEquip1 = 64187;
//				itemDef.femaleEquip1 = 64187;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 11010:
//				itemDef.name = "Hotshot body";
//				itemdefyogipic = ItemDefinition.get(5575);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64188;
//				itemDef.maleEquip1 = 64189;
//				itemDef.femaleEquip1 = 64189;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 11011:
//				itemDef.name = "Hotshot legs";
//				itemdefyogipic = ItemDefinition.get(5576);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64190;
//				itemDef.maleEquip1 = 64191;
//				itemDef.femaleEquip1 = 64191;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 11012:
//				itemDef.name = "Hotshot wings";
//				itemdefyogipic = ItemDefinition.get(2413);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64192;
//				itemDef.maleEquip1 = 64193;
//				itemDef.femaleEquip1 = 64193;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 11001:
//				itemDef.name = "Emerald coif";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64179;
//				itemDef.maleEquip1 = 64180;
//				itemDef.femaleEquip1 = 64180;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 11002:
//				itemDef.name = "Emerald body";
//				itemdefyogipic = ItemDefinition.get(5575);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64181;
//				itemDef.maleEquip1 = 64182;
//				itemDef.femaleEquip1 = 64182;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//
//			case 2575:
//				itemDef.name = "Goku Watch";
//
//				break;
//			case 11003:
//				itemDef.name = "Emerald chaps";
//				itemdefyogipic = ItemDefinition.get(5576);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64183;
//				itemDef.maleEquip1 = 64184;
//				itemDef.femaleEquip1 = 64184;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				break;
//			case 11006:
//				itemDef.name = "Forbidden coif";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64179;
//				itemDef.maleEquip1 = 64180;
//				itemDef.femaleEquip1 = 64180;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 29592;
//				break;
//			case 11007:
//				itemDef.name = "Forbidden leatherbody";
//				itemdefyogipic = ItemDefinition.get(5575);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64181;
//				itemDef.maleEquip1 = 64182;
//				itemDef.femaleEquip1 = 64182;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 29592;
//				break;
//			case 11008:
//				itemDef.name = "Forbidden leatherchaps";
//				itemdefyogipic = ItemDefinition.get(5576);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64183;
//				itemDef.maleEquip1 = 64184;
//				itemDef.femaleEquip1 = 64184;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 29592;
//				break;

//			case 8868:
//				itemDef.name = "<col=f8ac00>Betrayed key@lre@";
//				itemDef.actions = new String[5];
//				itemDef.actions[0] = "Open";
//				break;
//			case 21201:
//				itemDef.name = "Betrayed key [<col=92d49a>Uncommon@lre@]";
//				itemdefyogipic = ItemDefinition.get(8868);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 4710;
//				break;
//			case 21202:
//				itemDef.name = "Betrayed key [<col=789eea>Rare@lre@]";
//				itemdefyogipic = ItemDefinition.get(8868);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 888888;
//				break;
//			case 21203:
//				itemDef.name = "Betrayed key [<col=c378ea>Legendary@lre@]";
//				itemdefyogipic = ItemDefinition.get(8868);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 111111;
//				break;
//			case 21204:
//				itemDef.name = "Betrayed key [<col=eae678>Exotic@lre@]";
//				itemdefyogipic = ItemDefinition.get(8868);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 88757;
//				break;


//			case 3468:
//				itemDef.name = "<col=f8ac00>Cursed key@lre@";
//				itemDef.actions = new String[5];
//				itemDef.actions[0] = "Open";
//				break;
//			case 21213:
//				itemDef.name = "Cursed key [<col=92d49a>Uncommon@lre@]";
//				itemdefyogipic = ItemDefinition.get(3468);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 5364;
//				break;
//			case 21214:
//				itemDef.name = "Cursed key [<col=789eea>Rare@lre@]";
//				itemdefyogipic = ItemDefinition.get(3468);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 888888;
//				break;
//			case 21215:
//				itemDef.name = "Cursed key [<col=c378ea>Legendary@lre@]";
//				itemdefyogipic = ItemDefinition.get(3468);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 7326;
//				break;
//			case 21216:
//				itemDef.name = "Cursed key [<col=eae678>Exotic@lre@]";
//				itemdefyogipic = ItemDefinition.get(3468);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 88757;
//				break;
//			case 21217:
//				itemDef.name = "Slayer xp lamp ";
//				itemdefyogipic = ItemDefinition.get(19750);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 36262;
//				break;
//			case 15403:
//				itemDef.name = "Sharp balmung";
//				itemDef.rdc2 = 9224592;
//				break;
//			case 10887:
//				itemDef.name = "Anchor (Special)";
//				itemDef.rdc2 = 9939;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 21219:
//				itemDef.name = "Slayer xp lamp ";
//				itemdefyogipic = ItemDefinition.get(19750);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = 750;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 36262;
//				break;
//			case 21218:
//				itemDef.name = "Invention xp lamp ";
//				itemdefyogipic = ItemDefinition.get(19750);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = itemdefyogipic.modelID;
//				itemDef.actions = itemdefyogipic.actions;
//				itemDef.rdc2 = 3344;
//				break;
//			case 21260:
//				itemDef.name = "offhand glaive";
//				itemDef.modelID = 64301;
//				itemDef.maleEquip1 = 64302;
//				itemDef.femaleEquip1 = 64302;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//
//				break;
//			case 5424:
//				itemDef.name = "madman offhand glaive";
//				itemDef.modelID = 64301;
//				itemDef.maleEquip1 = 64302;
//				itemDef.femaleEquip1 = 64302;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				//
//
//				break;
//			case 21261:
//				itemDef.name = "offhand glaive";
//				itemDef.modelID = 64301;
//				itemDef.maleEquip1 = 64302;
//				itemDef.femaleEquip1 = 64302;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 464646;
//				break;
//			case 21262:
//				itemDef.name = "offhand glaive";
//				itemDef.modelID = 64301;
//				itemDef.maleEquip1 = 64302;
//				itemDef.femaleEquip1 = 64302;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 85722;
//				break;
//			case 21263:
//				itemDef.name = "offhand glaive";
//				itemDef.modelID = 64301;
//				itemDef.maleEquip1 = 64302;
//				itemDef.femaleEquip1 = 64302;
//				def = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = def.modelOffsetX;
//				itemDef.modelOffsetY = def.modelOffsetY;
//				itemDef.modelZoom = def.modelZoom;
//				itemDef.rotationY = def.rotationY;
//				itemDef.rotationX = def.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				itemDef.rdc2 = 43722;
//				break;

//			case 18599:
//				itemDef.name = "Graceful head";
//				itemdefyogipic = ItemDefinition.get(4882);
//				itemDef.modelOffsetX = 1;
//				itemDef.modelOffsetY = -60;
//				itemDef.modelZoom = 1000;
//				itemDef.rotationY = 230;
//				itemDef.rotationX = 200;
//				itemDef.modelID = 64317;
//				itemDef.maleEquip1 = 64318;
//				itemDef.femaleEquip1 = 64318;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//				break;
//			case 18600:
//				itemDef.name = "Graceful body";
//				itemdefyogipic = ItemDefinition.get(5575);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = 1600;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64319;
//				itemDef.maleEquip1 = 64320;
//				itemDef.femaleEquip1 = 64320;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//				break;
//			case 18601:
//				itemDef.name = "Graceful legs";
//				itemdefyogipic = ItemDefinition.get(5576);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = 20;
//				itemDef.modelZoom = 2000;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64321;
//				itemDef.maleEquip1 = 64322;
//				itemDef.femaleEquip1 = 64322;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//				break;
//			case 18602:
//				itemDef.name = "Graceful hands";
//				itemdefyogipic = ItemDefinition.get(7461);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64323;
//				itemDef.maleEquip1 = 64324;
//				itemDef.femaleEquip1 = 64324;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//				break;
//			case 18603:
//				itemDef.name = "Graceful feet";
//				itemdefyogipic = ItemDefinition.get(7114);
//				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
//				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
//				itemDef.modelZoom = itemdefyogipic.modelZoom;
//				itemDef.rotationY = itemdefyogipic.rotationY;
//				itemDef.rotationX = itemdefyogipic.rotationX;
//				itemDef.modelID = 64325;
//				itemDef.maleEquip1 = 64325;
//				itemDef.femaleEquip1 = 64325;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//				itemDef.actions = new String[5];
//				itemDef.actions[1] = "Wear"/*done*/; //done
//itemDef.actions[2] = "Dissolve";
//				itemDef.actions[4] = "Drop";
//				itemDef.stackable = false;
//				break;

//			case 5011:
//				itemDef.name = "@whi@Light Twisted Bow";
//				ItemDefinition tbow1 = ItemDefinition.get(1419);
//				itemDef.modelID = 65324;
//				itemDef.femaleEquip1 = 65325;
//				itemDef.maleEquip1 = 65325;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.modelOffsetX = tbow1.modelOffsetX;
//				itemDef.modelOffsetY = tbow1.modelOffsetY;
//				itemDef.modelZoom = tbow1.modelZoom;
//				itemDef.rotationY = tbow1.rotationY;
//				itemDef.rotationX = tbow1.rotationX;
//				itemDef.stackable = false;
//				itemDef.rdc2 = 888833;
//				break;
//			case 5010:
//				itemDef.name = "Crystalized bow";
//				ItemDefinition tbow3 = ItemDefinition.get(1419);
//				itemDef.modelID = 71222;
//				itemDef.femaleEquip1 = 71223;
//				itemDef.maleEquip1 = 71223;
//				itemDef.actions = tbow3.actions;
//				itemDef.modelOffsetX = tbow3.modelOffsetX;
//				itemDef.modelOffsetY = tbow3.modelOffsetY;
//				itemDef.modelZoom = tbow3.modelZoom;
//				itemDef.rotationY = tbow3.rotationY;
//				itemDef.rotationX = tbow3.rotationX;
//				itemDef.stackable = false;
//				break;
//			case 8136:
//				itemDef.name = "Blood Vitur";
//				ItemDefinition vitruu = ItemDefinition.get(1419);
//				// itemDef.modelID = itemDef2.modelID;
//				itemDef.modelID = 65320;
//				itemDef.femaleEquip1 = 65321;
//				itemDef.maleEquip1 = 65321;
//				itemDef.actions = vitruu.actions;
//
//				itemDef.modelOffsetX = vitruu.modelOffsetX;
//				//	itemDef.modelOffsetX = vitruu.modelOffsetX;
//				itemDef.modelOffsetY = vitruu.modelOffsetY;
//				itemDef.modelZoom = 3800;
//				itemDef.rotationY = vitruu.rotationY;
//				itemDef.rotationX = vitruu.rotationX;
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{54};
//				break;
//			case 12535:
//				itemDef.name = "Execution Vitur";
//				ItemDefinition vitur22 = ItemDefinition.get(1419);
//				// itemDef.modelID = itemDef2.modelID;
//				itemDef.modelID = 65320;
//				itemDef.femaleEquip1 = 65321;
//				itemDef.maleEquip1 = 65321;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				itemDef.modelOffsetX = vitur22.modelOffsetX;
//				//	itemDef.modelOffsetX = vitruu.modelOffsetX;
//				itemDef.modelOffsetY = vitur22.modelOffsetY;
//				itemDef.modelZoom = 3800;
//				itemDef.rotationY = vitur22.rotationY;
//				itemDef.rotationX = vitur22.rotationX;
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{57};
//				break;
//
//			case 12537:
//				itemDef.name = "Light Scythe Of Vitur";
//				ItemDefinition vitur222 = ItemDefinition.get(1419);
//				// itemDef.modelID = itemDef2.modelID;
//				itemDef.modelID = 65320;
//				itemDef.femaleEquip1 = 65321;
//				itemDef.maleEquip1 = 65321;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				itemDef.modelOffsetX = vitur222.modelOffsetX;
//				//	itemDef.modelOffsetX = vitruu.modelOffsetX;
//				itemDef.modelOffsetY = vitur222.modelOffsetY;
//				itemDef.modelZoom = 3800;
//				itemDef.rotationY = vitur222.rotationY;
//				itemDef.rotationX = vitur222.rotationX;
//				itemDef.stackable = false;
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{76};
//				break;
//			case 9940:
//				itemDef.name = "Unknown Mace";
//				ItemDefinition execution = ItemDefinition.get(4755);
//				// itemDef.modelID = itemDef2.modelID;
//				itemDef.modelID = 65322;
//				itemDef.femaleEquip1 = 65323;
//				itemDef.maleEquip1 = 65323;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				itemDef.modelOffsetX = execution.modelOffsetX;
//				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
//				itemDef.modelOffsetY = execution.modelOffsetY;
//				itemDef.modelZoom = execution.modelZoom;
//				itemDef.rotationY = execution.rotationY;
//				itemDef.rotationX = execution.rotationX;
//				itemDef.stackable = false;
//				itemDef.rdc2 = 3645768;//23622
//
//				break;

//			case 9941:
//				itemDef.actions = new String[5];
//				itemDef.modelID = 19219;
//				itemDef.name = "Executive blowpipe";
//				itemDef.modelZoom = 1158;
//				itemDef.rotationX = 189;//189
//				itemDef.rotationY = 768;//768
//				itemDef.modelOffsetX = -7;
//				itemDef.modelOffsetY = 4;
//				itemDef.value = 20000000;
//				itemDef.maleEquip1 = 14403;
//				itemDef.femaleEquip1 = 14403;
//				itemDef.actions[1] = "Wield";
//				// itemDef.actions[2] = "Uncharge";
//				//	itemDef.actions[3] = "Uncharge";
//				itemDef.groundActions = new String[]{null, null, "Take", null, null};
//				itemDef.rdc2 = 666737;//23622
//				break;


		}
		return itemDef;
	}

}
