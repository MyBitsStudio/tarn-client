package org.necrotic.client.cache.definition;


import static org.necrotic.client.cache.definition.MobDefinition.get;

public class ItemDef3 {
	public byte[] customSpriteLocation;

	private ItemDef3() {
	}

	public static ItemDefinition newIDS1(ItemDefinition itemDef, int id) {


		ItemDefinition itemdefedit, itemDef2;
		switch (id) {


//			//EASTER
//			case 23000:
//				itemDef.copyItem(6585);
//				itemDef.name = "Carrot Necklace";
//				itemDef.modelID = 100051;
//				itemDef.maleEquip1 = 100052;
//				itemDef.femaleEquip1 = 100052;
//				itemDef.modelZoom = 635;
//				itemDef.rotationX = 254;
//				itemDef.rotationY = 449;
//				itemDef.rotationZ = 0;
//				itemDef.modelOffsetX = 5;
//				itemDef.modelOffsetY = 11;
//				break;
//
//			case 23004:
//				itemDef.copyItem(12855);
//				itemDef.name = "Orange Easter Egg";
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				itemDef.modelID = 100057;
//				itemDef.modelZoom = 535;
//				itemDef.rotationX = 0;
//				itemDef.rotationY = 0;
//				itemDef.rotationZ = 0;
//				itemDef.modelOffsetX = 0;
//				itemDef.modelOffsetY = 0;
//				break;
//			case 23005:
//				itemDef.copyItem(23004);
//				itemDef.name = "Cyan Easter Egg";
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				itemDef.modelID = 100058;
//				break;
//			case 23006:
//				itemDef.copyItem(23004);
//				itemDef.name = "Purple Easter Egg";
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				itemDef.modelID = 100059;
//				break;
//			case 23007:
//				itemDef.copyItem(23004);
//				itemDef.name = "Red Easter Egg";
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				itemDef.modelID = 100060;
//				break;
//
//			case 23008:
//				itemDef.copyItem(12855);
//				itemDef.name = "White Easter Dye";
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				itemDef.modelID = 100061;
//				itemDef.modelZoom = 769;
//				itemDef.rotationX = 0;
//				itemDef.rotationY = 0;
//				itemDef.rotationZ = 0;
//				itemDef.modelOffsetX = 0;
//				itemDef.modelOffsetY = -3;
//				break;
//			case 23009:
//				itemDef.copyItem(23008);
//				itemDef.name = "Green Easter Dye";
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				itemDef.modelID = 100062;
//				break;
//			case 23010:
//				itemDef.copyItem(23008);
//				itemDef.name = "Gold Easter Dye";
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				itemDef.modelID = 100063;
//				break;
//			case 23011:
//				itemDef.copyItem(23008);
//				itemDef.name = "Blue Easter Dye";
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				itemDef.modelID = 100064;
//				break;
//			case 23012:
//				itemDef.copyItem(23008);
//				itemDef.name = "Red Easter Dye";
//				itemDef.actions = new String[]{null, null, null, null, "Drop"};
//				itemDef.modelID = 100065;
//				break;
//
//			case 23013:
//				itemDef.copyItem(1053);
//				itemDef.name = "Easter Bunny Mask";
//				itemDef.modelID = 100066;
//				itemDef.maleEquip1 = 100067;
//				itemDef.femaleEquip1 = 100067;
//				itemDef.modelZoom = 1505;
//				itemDef.rotationX = 0;
//				itemDef.rotationY = 0;
//				itemDef.rotationZ = 0;
//				itemDef.modelOffsetX = 0;
//				itemDef.modelOffsetY = 0;
//				break;
//			case 23014:
//				itemDef.copyItem(23013);
//				itemDef.name = "Green Easter Bunny Mask";
//				itemDef.modelID = 100068;
//				itemDef.maleEquip1 = 100069;
//				itemDef.femaleEquip1 = 100069;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 23015:
//				itemDef.copyItem(23014);
//				itemDef.name = "Golden Easter Bunny Mask";
//				itemDef.modelID = 100070;
//				itemDef.maleEquip1 = 100071;
//				itemDef.femaleEquip1 = 100071;
//				break;
//			case 23016:
//				itemDef.copyItem(23014);
//				itemDef.name = "Blue Easter Bunny Mask";
//				itemDef.modelID = 100072;
//				itemDef.maleEquip1 = 100073;
//				itemDef.femaleEquip1 = 100073;
//				break;
//			case 23017:
//				itemDef.copyItem(23014);
//				itemDef.name = "Red Easter Bunny Mask";
//				itemDef.modelID = 100074;
//				itemDef.maleEquip1 = 100075;
//				itemDef.femaleEquip1 = 100075;
//				break;

			case 23069:
				itemDef.copyItem(13263);
				itemDef.name = "Cactus Slayer helm (T2)";
				itemDef.modelID = 100166;
				itemDef.maleEquip1 = 100167;
				itemDef.femaleEquip1 = 100167;
				itemDef.equipOptions[1] = "Teleport";
				break;
			case 23070:
				itemDef.copyItem(13263);
				itemDef.name = "Deep blue Slayer helm (T3)";
				itemDef.modelID = 100168;
				itemDef.maleEquip1 = 100169;
				itemDef.femaleEquip1 = 100169;
				itemDef.equipOptions[1] = "Teleport";
				break;
			case 23071:
				itemDef.copyItem(13263);
				itemDef.name = "Golden Slayer helm (T1)";
				itemDef.modelID = 100170;
				itemDef.maleEquip1 = 100171;
				itemDef.femaleEquip1 = 100171;
				itemDef.equipOptions[1] = "Teleport";
				break;
			case 23072:
				itemDef.copyItem(13263);
				itemDef.name = "Roseblood Slayer helm (T5)";
				itemDef.modelID = 100172;
				itemDef.maleEquip1 = 100173;
				itemDef.femaleEquip1 = 100173;
				itemDef.equipOptions[1] = "Teleport";
				break;
			case 23073:
				itemDef.copyItem(13263);
				itemDef.name = "Sacred Slayer helm (T6)";
				itemDef.modelID = 100174;
				itemDef.maleEquip1 = 100175;
				itemDef.femaleEquip1 = 100175;
				itemDef.equipOptions[1] = "Teleport";
				break;
			case 23074:
				itemDef.copyItem(13263);
				itemDef.name = "Sea urchin Slayer helm (T4)";
				itemDef.modelID = 100176;
				itemDef.equipOptions[1] = "Teleport";
				itemDef.maleEquip1 = 100177;
				itemDef.femaleEquip1 = 100177;
				itemDef.equipOptions[1] = "Teleport";
				break;


//			case 23150:
//				itemDef.copyItem(669);
//				itemDef.name = "Flat cape";
//				itemDef.modelID = 100304;
//				itemDef.maleEquip1 = 100304;
//				itemDef.femaleEquip1 = 100304;
//				itemDef.modelZoom = 2300;
//				itemDef.rotationX = 1050;
//				itemDef.rotationY = 525;
//				itemDef.modelOffsetX = 0;
//				itemDef.rotationZ = 0;
//				itemDef.modelOffsetY = 25;
//				break;


//			case 23151:
//				itemDef.copyItem(5074);
//				itemDef.name = "Demon of Light Pet";
//				itemDef.modelID = 100281;
//				itemDef.modelZoom = 1500;
//				itemDef.rotationY = 0;
//				itemDef.rotationX = 0;
//				itemDef.modelOffsetX = 0;
//				itemDef.modelOffsetY = 0;
//				itemDef.scaleX = 32;
//				itemDef.scaleY = 32;
//				itemDef.scaleZ = 32;
//				break;
//			case 23152:
//				itemDef.copyItem(23151);
//				itemDef.name = "Bat of Light Pet";
//				itemDef.modelID = 100282;
//				itemDef.modelZoom = 1500;
//				itemDef.scaleX = 8;
//				itemDef.scaleY = 8;
//				itemDef.scaleZ = 8;
//				itemDef.rotationY = 300;
//				itemDef.rotationX = 300;
//				break;
//			case 23153:
//				itemDef.copyItem(23151);
//				itemDef.name = "Goblin of Light Pet";
//				itemDef.modelID = 100283;
//				itemDef.scaleX = 8;
//				itemDef.scaleY = 8;
//				itemDef.scaleZ = 8;
//				itemDef.modelZoom = 1500;
//				break;
//			case 23154:
//				itemDef.copyItem(23151);
//				itemDef.name = "Lava hound Pet";
//				itemDef.modelID = 100306;
//				itemDef.modelZoom = 700;
//				itemDef.rotationX = 200;
//				break;
//			case 23155:
//				itemDef.copyItem(23151);
//				itemDef.name = "Mutated hound Pet";
//				itemDef.modelID = 100305;
//				itemDef.modelZoom = 1600;
//				break;
//
//			case 23156:
//				itemDef.copyItem(23151);
//				itemDef.name = "Scorpion Pet";
//				itemDef.modelID = 100313;
//				itemDef.rotationX = 0;
//				itemDef.rotationY = 300;
//				itemDef.modelZoom = 1000;
//				break;
//			case 23157:
//				itemDef.copyItem(23151);
//				itemDef.name = "Zombie Pet";
//				itemDef.modelID = 100314;
//				itemDef.modelZoom = 800;
//				break;

//			case 23158:
//				itemDef.copyItem(669);
//				itemDef.name = "Magic max cape";
//				itemDef.modelID = 100307;
//				itemDef.maleEquip1 = 100308;
//				itemDef.femaleEquip1 = 100308;
//				itemDef.modelZoom = 1800;
//				itemDef.rotationX = 0;
//				itemDef.rotationY = 525;
//				itemDef.modelOffsetX = 0;
//				itemDef.rotationZ = 0;
//				itemDef.modelOffsetY = 0;
//				break;
//			case 23159:
//				itemDef.copyItem(669);
//				itemDef.name = "Melee max cape";
//				itemDef.modelID = 100309;
//				itemDef.maleEquip1 = 100310;
//				itemDef.femaleEquip1 = 100310;
//				itemDef.modelZoom = 1800;
//				itemDef.rotationX = 0;
//				itemDef.rotationY = 525;
//				itemDef.modelOffsetX = 0;
//				itemDef.rotationZ = 0;
//				itemDef.modelOffsetY = 0;
//				break;



			//END

			case 19336:
			case 19337:
			case 19338:
			case 19339:
			case 19340:
				itemDef.rdc2 = 814488;
				break;
			case 7394:
			case 10689:
				//case 2597:
				itemDef.rdc2 = 2299;
				break;
			case 21372:
				itemDef.rdc2 = 24929;
				break;
			case 21373:
				itemDef.rdc2 = 10843;
				break;
			case 21374:
				itemDef.rdc2 = 88753;
				break;
//			case 17043:
//				itemDef.name = "Leafy coif";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 18332:
//				itemDef.name = "Leafy Longbow";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//
//			case 17175:
//				itemDef.name = "Leafy body";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 17321:
//				itemDef.name = "Leafy chaps";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 10696:
//				itemDef.name = "Leafy boots";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 15026:
//				itemDef.name = "Leafy gloves";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 14733:
//				itemDef.name = "Sinful Hat";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 14732:
//				itemDef.name = "Sinful Top";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 14734:
//				itemDef.name = "Sinful Bottom";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 14377:
//				itemDef.name = "Sinful Staff";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				break;
//			case 10865:
//				itemDef.name = "Sinful Boots";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				break;
//			case 12864:
//				itemDef.name = "Sinful Gloves";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				break;


//			case 7997:
//				itemDef.name = "Exciter Cape";
//				//	itemDef.modelID = 65448;
//				//	itemDef.maleWearId = 65449;
//				//	itemDef.femaleWearId = 65449;
//				itemDef.modelID = 64367;
//				itemDef.maleEquip1 = 64368;
//				itemDef.femaleEquip1 = 64368;
//				itemdefedit = ItemDefinition.get(2414);
//				//	itemDef.modelID = 65333;
//				//itemDef.maleWearId = 65334;
//				//itemDef.femaleWearId = 65334;
//				//itemDef.actions = itemdefedit.actions;
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.newModelColor = new int[]{40};
//				itemDef.editedModelColor = new int[]{95};
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//
//				break;


//			case 20591:
//				itemDef.name = "@gre@Rage Cape";
//				itemDef.modelID = 65333;
//				itemDef.maleEquip1 = 65334;
//				itemDef.femaleEquip1 = 65334;
//				itemdefedit = ItemDefinition.get(4367);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				//	itemDef.actions = itemdefedit.actions;
//				itemDef.rdc2 = 29295;
//				itemDef.newModelColor = new int[]{57};
//				itemDef.editedModelColor = new int[]{71};
//				itemDef.modelZoom = 1385;
//				itemDef.modelOffsetX = 0;
//				itemDef.modelOffsetY = 24;
//				itemDef.rotationY = 279;
//				itemDef.rotationX = 948;
//				break;




//			case 8087:
//				itemDef.name = "Tarn sword";
//				itemDef.modelID = 64139;
//				itemDef.maleEquip1 = 64140;
//				itemDef.femaleEquip1 = 64140;
//				itemdefedit = ItemDefinition.get(22034);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelZoom = 1500;
//				itemDef.rotationY = 400;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//
//				break;

//			case 18888:
//
//				itemdefedit = ItemDefinition.get(19888);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.name = "Collector necklace @mag@III";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;
//			case 18818:
//				itemdefedit = ItemDefinition.get(18823);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.name = "Collector ring @mag@III";
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				break;

			case 21815:
				itemDef.name = "Archer ticket";
				itemDef.rdc2 = 45367587;
				break;
			case 21814:
				itemDef.name = "Wizard ticket";
				itemDef.rdc2 = 35734;
				break;
//			case 14910:
//				itemDef.name = "Forsaken Helm";
//
//				itemdefedit = ItemDefinition.get(14008);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;
//			case 14911:
//				itemDef.name = "Forsaken Body";
//
//				itemdefedit = ItemDefinition.get(14009);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;
//			case 14912:
//				itemDef.name = "Forsaken Legs";
//
//				itemdefedit = ItemDefinition.get(14010);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;
//			case 14913:
//				itemDef.name = "Forsaken Gloves";
//
//				itemdefedit = ItemDefinition.get(5556);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;
//
//			case 14914:
//				itemDef.name = "Forsaken Boots";
//
//				itemdefedit = ItemDefinition.get(20119);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;
//
//			case 14916:
//				itemDef.name = "Nature pernix cowl";
//
//				itemdefedit = ItemDefinition.get(14011);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;
//			case 14917:
//				itemDef.name = "Nature pernix body";
//
//				itemdefedit = ItemDefinition.get(14012);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;
//			case 14918:
//				itemDef.name = "Nature pernix chaps";
//
//				itemdefedit = ItemDefinition.get(14013);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;
//			case 14920:
//				itemDef.name = "Nature cape";
//
//				itemdefedit = ItemDefinition.get(14022);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;
//
//			case 14921:
//				itemDef.name = "Icey virtus mask";
//
//				itemdefedit = ItemDefinition.get(14014);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = itemdefedit.actions;
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;
//			case 14922:
//				itemDef.name = "Icey virtus robe top";
//
//				itemdefedit = ItemDefinition.get(14015);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = itemdefedit.actions;
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;
//			case 14923:
//				itemDef.name = "Icey virtus legs";
//
//				itemdefedit = ItemDefinition.get(14016);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = itemdefedit.actions;
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;
//			case 14925:
//				itemDef.name = "Icey shield";
//
//				itemdefedit = ItemDefinition.get(14577);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = itemdefedit.actions;
//				itemDef.stackable = false;
//				//	itemDef.rdc2 = 19518;
//				break;

			case 3107:
				itemDef.name = "Groudon-flame boots";
				break;
			case 13640:
				itemDef.name = "Groudon-flame staff";
				break;
			case 13964:
				itemDef.name = "Groudon-flame shield";
				break;



			case 17391:
				itemDef.name = "@or2@Gold Enhancement";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 21934:
				itemDef.name = "Groudon-flame helm";
				itemDef.modelID = 65112;
				itemDef.maleEquip1 = 65113;
				itemDef.femaleEquip1 = 65113;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 40; // the new texture u want it to have
				itemDef.stackable = false;
				
				// itemDef.setTexture(matid, textureid);
				// itemDef.applyTexturing(model, id);
				// itemDef.rdc2 = 8822;
				break;
			case 19918:
				itemDef.name = "Groudon-flame body";
				itemDef.modelID = 65114;
				itemDef.maleEquip1 = 65115;
				itemDef.femaleEquip1 = 65115;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 40; // the new texture u want it to have
				// itemDef.rdc2 = 8822;
				
				break;
			case 19913:
				itemDef.name = "Groudon-flame legs";
				itemDef.modelID = 65116;
				itemDef.maleEquip1 = 65117;
				itemDef.femaleEquip1 = 65117;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 40; // the new texture u want it to have
				itemDef.stackable = false;
				// itemDef.rdc2 = 8822;
				
				break;

//			case 14053:
//				itemDef.name = "Godly boots";
//				itemdefedit = ItemDefinition.get(7114);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelZoom = itemdefedit.modelZoom;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.modelID = 64177;
//				itemDef.maleEquip1 = 64178;
//				itemDef.femaleEquip1 = 64178;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				//	itemDef.rdc2 = 47333;
//				break;
//			case 14054:
//				itemDef.name = "Godly shield";
//				itemdefedit = ItemDefinition.get(12930);
//				itemDef.modelID = itemdefedit.modelID;
//				itemDef.maleEquip1 = itemdefedit.maleEquip1;
//				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
//
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelZoom = 1600;
//				itemDef.rotationY = itemdefedit.rotationY;
//
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;
//			case 14055:
//				itemDef.name = "Godly gloves";
//				itemdefedit = ItemDefinition.get(7461);
//				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
//				itemDef.modelZoom = 1100;
//				itemDef.rotationY = itemdefedit.rotationY;
//				itemDef.rotationX = itemdefedit.rotationX;
//				itemDef.modelID = 64175;
//				itemDef.maleEquip1 = 64176;
//				itemDef.femaleEquip1 = 64176;
//				itemDef.groundActions = new String[5];
//				itemDef.groundActions[2] = "Take";
//				itemDef.stackable = false;
//
//				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
//				itemDef.stackable = false;
//				break;

			case 11181:
				itemDef.name = "Gold gloves";
				itemdefedit = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1200;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64277;
				itemDef.maleEquip1 = 64278;
				itemDef.femaleEquip1 = 64278;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				//	itemDef.rdc2 = 8423432;
				break;
			case 11182:
				itemDef.name = "Gold boots";
				itemdefedit = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64279;
				itemDef.maleEquip1 = 64279;
				itemDef.femaleEquip1 = 64279;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				//	itemDef.rdc2 = 8423432;
				break;


			case 11183:
				itemDef.name = "Gold helm";
				itemDef.modelID = 65272;
				itemDef.maleEquip1 = 65273;
				itemDef.femaleEquip1 = 65273;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 19188731;//777245
				break;

			case 11184:
				itemDef.name = "Gold body";
				itemDef.modelID = 65274;
				itemDef.maleEquip1 = 65275;
				itemDef.femaleEquip1 = 65275;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 19188731;
				break;

			case 11179:
				itemDef.name = "Gold legs";
				itemDef.modelID = 65276;
				itemDef.maleEquip1 = 65277;
				itemDef.femaleEquip1 = 65277;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				// itemDef.rdc2 = 23945;
				itemDef.rdc2 = 19188731;
				break;
			case 11759:
				itemDef.name = "Gold Teddybear";
				itemDef.modelID = 64034;
				itemDef.maleEquip1 = 64035;
				itemDef.femaleEquip1 = 64035;
				itemdefedit = ItemDefinition.get(8848);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemdefedit.rotationY;

				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 11762:
				itemDef.name = "Gold cape";
				itemDef.modelID = 64315;

				itemdefedit = ItemDefinition.get(6570);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 65447;
				itemDef.maleEquip1 = 65446;
				itemDef.femaleEquip1 = 65446;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.editedModelColor = new int[2]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[2]; // same here
				itemDef.newModelColor[0] = 54; // the texture that it currently has
				itemDef.editedModelColor[0] = 56;
				itemDef.newModelColor[1] = 65; // the texture that it currently has
				itemDef.editedModelColor[1] = 56; // the new texture u want it to have
				itemDef.stackable = false;
				itemDef.value = 1;
				break;
			case 11763:
				itemDef.name = "Frieza helm";
				itemDef.modelID = 64374;
				itemDef.maleEquip1 = 64369;
				itemDef.femaleEquip1 = 64369;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				//itemDef.rdc2 = 8423432;
				break;

			case 11764:
				itemDef.name = "Frieza body";
				itemDef.modelID = 64370;
				itemDef.maleEquip1 = 64371;
				itemDef.femaleEquip1 = 64371;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				//	itemDef.rdc2 = 8423432;
				break;

			case 11765:
				itemDef.name = "Frieza legs";
				itemDef.modelID = 64372;
				itemDef.maleEquip1 = 64373;
				itemDef.femaleEquip1 = 64373;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				// itemDef.rdc2 = 23945;
				//	itemDef.rdc2 = 8423432;
				break;
			case 11766:
				itemDef.name = "Frieza gloves";
				itemdefedit = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1200;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64277;
				itemDef.maleEquip1 = 64278;
				itemDef.femaleEquip1 = 64278;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				

				//	itemDef.rdc2 = 8423432;
				break;
			case 11767:
				itemDef.name = "Frieza boots";
				itemdefedit = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64279;
				itemDef.maleEquip1 = 64279;
				itemDef.femaleEquip1 = 64279;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				

				//	itemDef.rdc2 = 8423432;
				break;
			case 9478:
				itemDef.name = "Super buu helm";
				itemDef.modelID = 64375;
				itemDef.maleEquip1 = 64376;
				itemDef.femaleEquip1 = 64376;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//itemDef.rdc2 = 8423432;
				

				break;

			case 9479:
				itemDef.name = "Super buu body";
				itemDef.modelID = 64377;
				itemDef.maleEquip1 = 64378;
				itemDef.femaleEquip1 = 64378;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				break;

			case 9480:
				itemDef.name = "Super buu legs";
				itemDef.modelID = 64379;
				itemDef.maleEquip1 = 64380;
				itemDef.femaleEquip1 = 64380;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				//	itemDef.rdc2 = 8423432;
				break;
			case 9481:
				itemDef.name = "Perfect Cell helm";
				itemDef.modelID = 64386;
				itemDef.maleEquip1 = 64387;
				itemDef.femaleEquip1 = 64387;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				//itemDef.rdc2 = 8423432;
				break;

			case 9482:
				itemDef.name = "Perfect Cell body";
				itemDef.modelID = 64388;
				itemDef.maleEquip1 = 64389;
				itemDef.femaleEquip1 = 64389;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				//	itemDef.rdc2 = 8423432;
				break;

			case 9483:
				itemDef.name = "Perfect Cell legs";
				itemDef.modelID = 64390;
				itemDef.maleEquip1 = 64391;
				itemDef.femaleEquip1 = 64391;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				// itemDef.rdc2 = 23945;
				//	itemDef.rdc2 = 8423432;
				break;


			case 7543:
				itemDef.name = "Perfect Cell Rifle";
				ItemDefinition itemdefedit1 = ItemDefinition.get(20538);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 65024;
				itemDef.femaleEquip1 = 65025;
				itemDef.maleEquip1 = 65025;
				itemDef.modelOffsetX = 1;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = 30;
				itemDef.modelZoom = 2100;
				itemDef.rotationY = 200;
				itemDef.rotationX = itemdefedit1.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				

				break;
			case 7544:
				itemDef.name = "Perfect Cell Teddybear";
				itemDef.modelID = 64034;
				itemDef.maleEquip1 = 64035;
				itemDef.femaleEquip1 = 64035;
				itemdefedit1 = ItemDefinition.get(8848);
				itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit1.modelOffsetY;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemdefedit1.rotationY;

				itemDef.rotationX = itemdefedit1.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 7545:
				itemdefedit1 = ItemDefinition.get(7535);
				itemDef.name = "Perfect Cell apparatus";
				itemDef.modelID = itemdefedit1.modelID;
				itemDef.maleEquip1 = itemdefedit1.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit1.femaleEquip1;

				itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit1.modelOffsetY;
				itemDef.modelZoom = itemdefedit1.modelZoom;
				itemDef.rotationY = itemdefedit1.rotationY;

				itemDef.rotationX = itemdefedit1.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				break;

			case 16249:
				itemDef.name = "Super buu Staff";
				break;
			case 16265:
				itemDef.name = "Super buu boots";
				break;
			case 15832:
				itemDef.name = "Super buu ward";
				break;
			case 1485:
				itemDef.name = "Godly cape";
				itemDef.modelID = 64393;
				itemDef.femaleEquip1 = 64394;
				itemDef.maleEquip1 = 64394;
				itemDef.modelOffsetX = 20;
				itemDef.modelOffsetY = 100;
				itemDef.modelZoom = 2300;
				itemDef.rotationY = 300;
				itemDef.rotationX = 1000;
				itemDef.stackable = false;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 96;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 1486:
				itemDef.name = "Goku Cape";
				ItemDefinition SoulCape1 = ItemDefinition.get(19709);
				itemDef.modelID = 64393;
				itemDef.femaleEquip1 = 64394;
				itemDef.maleEquip1 = 64394;
				itemDef.modelOffsetX = 20;
				itemDef.modelOffsetY = 100;
				itemDef.modelZoom = 2300;
				itemDef.rotationY = 300;
				itemDef.rotationX = 1000;
				itemDef.stackable = false;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 97;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;

			case 8100:
				itemDef.name = "Light guild helmet";

				itemDef.modelID = 64428;
				itemDef.maleEquip1 = 64429;
				itemDef.femaleEquip1 = 64429;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;

				break;
			case 8101:
				itemDef.name = "Light guild body";
				itemDef.modelID = 64430;
				itemDef.maleEquip1 = 64431;
				itemDef.femaleEquip1 = 64431;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;


				break;
			case 8102:
				itemDef.name = "Light guild legs";

				itemDef.modelID = 64432;
				itemDef.maleEquip1 = 64433;
				itemDef.femaleEquip1 = 64433;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
//itemDef.rdc2  = 47473432;

				break;
			case 8103:
				itemDef.name = "Light guild boots";
				itemdefedit = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64434;
				itemDef.maleEquip1 = 64434;
				itemDef.femaleEquip1 = 64434;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};

				break;

			case 8104:
				itemDef.name = "Light guild gloves";
				itemdefedit = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1100;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64436;
				itemDef.maleEquip1 = 64436;
				itemDef.femaleEquip1 = 64436;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";

				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;

//	itemDef.rdc2  = 732223;
				break;
			case 8105:
				itemDef.name = "Dark guild helmet";

				itemDef.modelID = 64437;
				itemDef.maleEquip1 = 64438;
				itemDef.femaleEquip1 = 64438;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;

				break;
			case 8106:
				itemDef.name = "Dark guild body";
				itemDef.modelID = 64439;
				itemDef.maleEquip1 = 64440;
				itemDef.femaleEquip1 = 64440;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;


				break;
			case 8107:
				itemDef.name = "Dark guild legs";

				itemDef.modelID = 64441;
				itemDef.maleEquip1 = 64442;
				itemDef.femaleEquip1 = 64442;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;


				break;
			case 8108:
				itemDef.name = "Dark guild boots";
				itemdefedit = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64443;
				itemDef.maleEquip1 = 64443;
				itemDef.femaleEquip1 = 64443;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};

				break;

			case 8109:
				itemDef.name = "Dark guild gloves";
				itemdefedit = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1100;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64444;
				itemDef.maleEquip1 = 64445;
				itemDef.femaleEquip1 = 64445;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";

				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;

				break;
			case 13128:
				itemDef.name = "Dark guild Flail";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 729987;
				break;
			case 8110:
				itemDef.name = "Light guild sword";
				itemDef.modelID = 64446;
				itemDef.maleEquip1 = 64447;
				itemDef.femaleEquip1 = 64447;
				itemdefedit = ItemDefinition.get(22034);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1500;
				itemDef.rotationY = 400;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//itemDef.rdc2  =11234633;//225992

				break;

			case 21600:
				itemDef.name = "Dragon Torva helm";
				itemDef.modelID = 64449;
				itemDef.maleEquip1 = 64450;
				itemDef.femaleEquip1 = 64450;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;


				break;

			case 21601:
				itemDef.name = "Dragon Torva body";
				itemDef.modelID = 64451;
				itemDef.maleEquip1 = 64452;
				itemDef.femaleEquip1 = 64452;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;

				break;

			case 21602:
				itemDef.name = "Dragon Torva legs";
				itemDef.modelID = 64453;
				itemDef.maleEquip1 = 64454;
				itemDef.femaleEquip1 = 64454;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//itemDef.rdc2 = 2039208;
				break;
			case 21603:
				itemDef.name = "Dragon wings";
				itemDef.modelID = 64455;
				itemDef.maleEquip1 = 64456;
				itemDef.femaleEquip1 = 64456;
				itemdefedit = ItemDefinition.get(18509);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 21604:
				itemDef.name = "Dragon kiteshield";
				itemDef.modelID = 64457;
				itemDef.maleEquip1 = 64458;
				itemDef.femaleEquip1 = 64458;
				itemdefedit = ItemDefinition.get(18509);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 21780:
				itemDef.name = "Dragon gloves";
				itemDef.modelID = 65136;
				itemDef.maleEquip1 = 65137;
				itemDef.femaleEquip1 = 65137;
				itemdefedit = ItemDefinition.get(7462);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 65;
				itemDef.stackable = false;
				// itemDef.rdc2 = 8822;
				break;
			case 21605:
				itemDef.name = "Dragon boots";
				itemDef.modelID = 64459;
				itemDef.maleEquip1 = 64459;
				itemDef.femaleEquip1 = 64459;
				itemdefedit = ItemDefinition.get(11732);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 21606:
				itemDef.name = "Dragon Rifle";
				itemdefedit = ItemDefinition.get(20538);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 64491;
				itemDef.femaleEquip1 = 64492;
				itemDef.maleEquip1 = 64492;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
				itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				break;

			case 5073:
				itemDef.name = "Joker Rpg";
				itemdefedit = ItemDefinition.get(1419);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 64506;
				itemDef.femaleEquip1 = 64507;
				itemDef.maleEquip1 = 64507;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.rdc2 = 2412432;
				break;
			case 14060:
				itemDef.name = "Crystalized helm";
				itemDef.modelID = 64513;
				itemDef.maleEquip1 = 64514;
				itemDef.femaleEquip1 = 64514;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = 1;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = 200;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				


				break;

			case 14061:
				itemDef.name = "Crystalized body";
				itemDef.modelID = 64515;
				itemDef.maleEquip1 = 64516;
				itemDef.femaleEquip1 = 64516;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				break;

			case 14062:
				itemDef.name = "Crystalized legs";
				itemDef.modelID = 64517;
				itemDef.maleEquip1 = 64518;
				itemDef.femaleEquip1 = 64518;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				break;


			case 14063:
				itemDef.name = "Crystalized gloves";
				itemDef.modelID = 64519;
				itemDef.maleEquip1 = 64520;
				itemDef.femaleEquip1 = 64520;
				itemdefedit = ItemDefinition.get(20458);
				itemDef.modelOffsetX = 30;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 400;
				itemDef.rotationY = 240;
				itemDef.rotationX = 20;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.editedModelColor = new int[1];
				itemDef.newModelColor = new int[1];
				itemDef.newModelColor[0] = 40;
				itemDef.editedModelColor[0] = 65;
				itemDef.stackable = false;
				

				break;
			case 14064:
				itemDef.name = "Crystalized boots";
				itemDef.modelID = 64521;
				itemDef.maleEquip1 = 64521;
				itemDef.femaleEquip1 = 64521;
				itemdefedit = ItemDefinition.get(11732);
				itemDef.modelOffsetX = 10;
				itemDef.modelOffsetY = -15;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = 1;
				itemDef.rotationX = 2000;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 14065:
				itemDef.name = "Crystalized sword";
				itemdefedit = ItemDefinition.get(1419);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 64522;
				itemDef.femaleEquip1 = 64523;
				itemDef.maleEquip1 = 64523;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				
				break;
			case 14066:
				itemDef.name = "Crystalized wings";
				itemdefedit = ItemDefinition.get(1419);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 64524;
				itemDef.femaleEquip1 = 64525;
				itemDef.maleEquip1 = 64525;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 2000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				
				//itemDef.rdc2 = 2412432;
				break;
			case 9054:
				itemDef.name = "Creeper helm";
				itemDef.modelID = 64513;
				itemDef.maleEquip1 = 64514;
				itemDef.femaleEquip1 = 64514;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = 1;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = 200;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 5523329;
				break;

			case 9055:
				itemDef.name = "Creeper body";
				itemDef.modelID = 64515;
				itemDef.maleEquip1 = 64516;
				itemDef.femaleEquip1 = 64516;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 5523329;
				break;

			case 9056:
				itemDef.name = "Creeper legs";
				itemDef.modelID = 64517;
				itemDef.maleEquip1 = 64518;
				itemDef.femaleEquip1 = 64518;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 5523329;
				break;


			case 9057:
				itemDef.name = "Creeper gloves";
				itemDef.modelID = 64519;
				itemDef.maleEquip1 = 64520;
				itemDef.femaleEquip1 = 64520;
				itemdefedit = ItemDefinition.get(20458);
				itemDef.modelOffsetX = 30;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 400;
				itemDef.rotationY = 240;
				itemDef.rotationX = 20;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.editedModelColor = new int[1];
				itemDef.newModelColor = new int[1];
				itemDef.newModelColor[0] = 40;
				itemDef.editedModelColor[0] = 65;
				itemDef.stackable = false;
				itemDef.rdc2 = 5523329;
				
				break;
			case 9058:
				itemDef.name = "Creeper boots";
				itemDef.modelID = 64521;
				itemDef.maleEquip1 = 64521;
				itemDef.femaleEquip1 = 64521;
				itemdefedit = ItemDefinition.get(11732);
				itemDef.modelOffsetX = 10;
				itemDef.modelOffsetY = -15;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = 1;
				itemDef.rotationX = 2000;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 5523329;
				
				break;
			case 9059:
				itemDef.name = "Creeper sword";
				itemdefedit = ItemDefinition.get(1419);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 64522;
				itemDef.femaleEquip1 = 64523;
				itemDef.maleEquip1 = 64523;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.rdc2 = 5523329;
				break;
			case 9060:
				itemDef.name = "Creeper wings";
				itemdefedit = ItemDefinition.get(1419);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 64524;
				itemDef.femaleEquip1 = 64525;
				itemDef.maleEquip1 = 64525;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 2000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.rdc2 = 5523329;
				break;
			case 14067:
				ItemDefinition Crystalqueenpet = ItemDefinition.get(12479);
				itemDef.modelID = 64512;
				itemDef.modelOffsetX = Crystalqueenpet.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = Crystalqueenpet.modelOffsetY;
				itemDef.modelZoom = 2500;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "Crystal queen pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
//	itemDef.rdc2 = 664466;
				break;
			case 14068:
				itemDef.name = "Garfield mask";
				itemDef.modelID = 64526;
				itemDef.maleEquip1 = 64527;
				itemDef.femaleEquip1 = 64527;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;


				break;

			case 14069:
				itemDef.name = "Garfield body";
				itemDef.modelID = 64528;
				itemDef.maleEquip1 = 64529;
				itemDef.femaleEquip1 = 64529;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;

				break;

			case 14070:
				itemDef.name = "Garfield legs";
				itemDef.modelID = 64530;
				itemDef.maleEquip1 = 64531;
				itemDef.femaleEquip1 = 64531;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//itemDef.rdc2 = 2039208;
				break;


			case 14071:
				itemDef.name = "Garfield gloves";
				itemDef.modelID = 64532;
				itemDef.maleEquip1 = 64533;
				itemDef.femaleEquip1 = 64533;
				itemdefedit = ItemDefinition.get(20458);
				itemDef.modelOffsetX = 30;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 400;
				itemDef.rotationY = 240;
				itemDef.rotationX = 20;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 65;
				itemDef.stackable = false;
				// itemDef.rdc2 = 8822;
				break;
			case 14072:
				itemDef.name = "Garfield boots";
				itemDef.modelID = 64534;
				itemDef.maleEquip1 = 64534;
				itemDef.femaleEquip1 = 64534;
				itemdefedit = ItemDefinition.get(11732);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14073:
				itemDef.name = "Garfield Scarf";
				itemdefedit = ItemDefinition.get(1419);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 64535;
				itemDef.femaleEquip1 = 64536;
				itemDef.maleEquip1 = 64536;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";

				break;
			case 21607:
				itemDef.name = "Custom Elite helm";
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64194;
				itemDef.maleEquip1 = 64195;
				itemDef.femaleEquip1 = 64195;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 123829;//77777
				break;

			case 21608:
				itemDef.name = "Custom Elite body";
				itemdefedit = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64196;
				itemDef.maleEquip1 = 64197;
				itemDef.femaleEquip1 = 64197;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 123829;
				break;
			case 21609:
				itemDef.name = "Custom Elite legs";
				itemdefedit = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64198;
				itemDef.maleEquip1 = 64199;
				itemDef.femaleEquip1 = 64199;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 123829;
				break;
			case 21610:
				itemDef.name = "Custom Elite Teddy bear";
				itemDef.modelID = 64034;
				itemDef.maleEquip1 = 64035;
				itemDef.femaleEquip1 = 64035;
				itemdefedit = ItemDefinition.get(8848);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemdefedit.rotationY;

				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 204929;
				break;

			case 21611:
				itemDef.name = "Custom Elite gloves";
				itemdefedit = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64202;
				itemDef.maleEquip1 = 64203;
				itemDef.femaleEquip1 = 64203;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 123829;
				break;
			case 21612:
				itemDef.name = "Custom Elite boots";
				itemdefedit = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64204;
				itemDef.maleEquip1 = 64204;
				itemDef.femaleEquip1 = 64204;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 123829;
				break;
			case 21613:
				itemDef.name = "Nick's OC";
				itemDef.modelID = 64462;
				itemDef.maleEquip1 = 64463;
				itemDef.femaleEquip1 = 64463;
				itemdefedit = ItemDefinition.get(2414);
//	itemDef.modelID = 65333;
				//itemDef.maleWearId = 65334;
				//itemDef.femaleWearId = 65334;
				itemDef.actions = itemdefedit.actions;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.newModelColor = new int[]{57};
				itemDef.editedModelColor = new int[]{52};
//	itemDef.actions[3] = "<col=f8a6c1>Activate god mode";

				//itemDef.rdc2 = 762432;
//	itemDef.modelZoom = 1385;
//	itemDef.modelOffset1 = 0;
//	itemDef.modelOffsetY = 24;
//	itemDef.modelRotationY = 279;
//	itemDef.modelRotationX = 948;
				break;

			case 15642:
				itemDef.name = "Elite helm (ranged)";
				itemDef.modelID = 96496;
				itemDef.maleEquip1 = 96497;
				itemDef.femaleEquip1 = 96497;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{55};
				itemDef.editedModelColor = new int[]{61};
//	itemDef.rdc2 = 2353627;
				break;
			case 15643:
				itemDef.name = "Elite body (ranged)";
				itemDef.modelID = 96498;
				itemDef.maleEquip1 = 96499;
				itemDef.femaleEquip1 = 96499;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{55};
				itemDef.editedModelColor = new int[]{61};
//	itemDef.rdc2 = 2353627;
				break;

			case 15644:
				itemDef.name = "Elite legs (ranged)";
				itemDef.modelID = 96500;
				itemDef.maleEquip1 = 96501;
				itemDef.femaleEquip1 = 96501;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{55};
				itemDef.editedModelColor = new int[]{61};
//	itemDef.rdc2 = 2353627;
				break;
			case 14176:
				itemDef.name = "Optimus suit helmet";
				itemDef.modelID = 64479;
				itemDef.maleEquip1 = 64480;
				itemDef.femaleEquip1 = 64480;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//itemDef.rdc2  = 20483;
				break;
			case 14172:
				itemDef.name = "Optimus suit body";
				itemDef.modelID = 64481;
				itemDef.maleEquip1 = 64482;
				itemDef.femaleEquip1 = 64482;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;

				break;
			case 14174:
				itemDef.name = "Optimus suit legs";
				itemDef.modelID = 64483;
				itemDef.maleEquip1 = 64484;
				itemDef.femaleEquip1 = 64484;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//itemDef.rdc2  = 20483;
				break;
							//NEW BOSSING ITEMS
			case 14178:
				itemDef.name = "Demonlord Body";
				itemDef.modelID = 140054;
				itemDef.maleEquip1 = 140055;
				itemDef.femaleEquip1 = 140055;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14180:
				itemDef.name = "Demonlord Boots";
				itemDef.modelID = 140056;
				itemDef.maleEquip1 = 140056;
				itemDef.femaleEquip1 = 140056;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14182:
				itemDef.name = "Demonlord Gloves";
				itemDef.modelID = 140057;
				itemDef.maleEquip1 = 140058;
				itemDef.femaleEquip1 = 140058;
				itemdefedit = ItemDefinition.get(7462);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14184:
				itemDef.name = "Demonlord Helm";
				itemDef.modelID = 140059;
				itemDef.maleEquip1 = 140060;
				itemDef.femaleEquip1 = 140060;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14186:
				itemDef.name = "Demonlord Legs";
				itemDef.modelID = 140061;
				itemDef.maleEquip1 = 140062;
				itemDef.femaleEquip1 = 140062;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14188:
				itemDef.name = "Demonlord Sword";
				itemDef.modelID = 139773;
				itemDef.maleEquip1 = 139774;
				itemDef.femaleEquip1 = 139774;
				itemdefedit = ItemDefinition.get(22034);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14190:
				itemDef.name = "Tyrant Helm";
				itemDef.modelID = 140208;
				itemDef.maleEquip1 = 140209;
				itemDef.femaleEquip1 = 140209;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14192:
				itemDef.name = "Tyrant Body";
				itemDef.modelID = 140211;
				itemDef.maleEquip1 = 140210;
				itemDef.femaleEquip1 = 140210;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14194:
				itemDef.name = "Tyrant Legs";
				itemDef.modelID = 140213;
				itemDef.maleEquip1 = 140212;
				itemDef.femaleEquip1 = 140212;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14196:
				itemDef.name = "Tyrant Gloves";
				itemDef.modelID = 140215;
				itemDef.maleEquip1 = 140214;
				itemDef.femaleEquip1 = 140214;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14198:
				itemDef.name = "Tyrant Boots";
				itemDef.modelID = 140216;
				itemDef.maleEquip1 = 140216;
				itemDef.femaleEquip1 = 140216;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14200:
				itemDef.name = "Tyrant Wings";
				itemDef.modelID = 140218;
				itemDef.maleEquip1 = 140217;
				itemDef.femaleEquip1 = 140217;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14202:
				itemDef.name = "Virtuos Helm";
				itemDef.modelID = 140128;
				itemDef.maleEquip1 = 140129;
				itemDef.femaleEquip1 = 140129;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14204:
				itemDef.name = "Virtuos Body";
				itemDef.modelID = 140130;
				itemDef.maleEquip1 = 140131;
				itemDef.femaleEquip1 = 140131;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14206:
				itemDef.name = "Virtuos Legs";
				itemDef.modelID = 140132;
				itemDef.maleEquip1 = 140133;
				itemDef.femaleEquip1 = 140133;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14301:
				itemDef.name = "Virtuos Gloves";
				itemDef.modelID = 140134;
				itemDef.maleEquip1 = 140135;
				itemDef.femaleEquip1 = 140135;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14303:
				itemDef.name = "Virtuos Boots";
				itemDef.modelID = 140136;
				itemDef.maleEquip1 = 140136;
				itemDef.femaleEquip1 = 140136;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14305:
				itemDef.name = "Virtuos Wand";
				itemDef.modelID = 140137;
				itemDef.maleEquip1 = 140138;
				itemDef.femaleEquip1 = 140138;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14307:
				itemDef.name = "Virtuos Relic";
				itemDef.modelID = 140139;
				itemDef.maleEquip1 = 140140;
				itemDef.femaleEquip1 = 140140;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14309:
				itemDef.name = "Fighter Head";
				itemDef.modelID = 140105;
				itemDef.maleEquip1 = 140106;
				itemDef.femaleEquip1 = 140106;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14311:
				itemDef.name = "Fighter Body";
				itemDef.modelID = 140107;
				itemDef.maleEquip1 = 140108;
				itemDef.femaleEquip1 = 140108;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14313:
				itemDef.name = "Fighter Legs";
				itemDef.modelID = 140109;
				itemDef.maleEquip1 = 140110;
				itemDef.femaleEquip1 = 140110;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14315:
				itemDef.name = "Fighter Gloves";
				itemDef.modelID = 140111;
				itemDef.maleEquip1 = 140112;
				itemDef.femaleEquip1 = 140112;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14317:
				itemDef.name = "Fighter Boots";
				itemDef.modelID = 140113;
				itemDef.maleEquip1 = 140113;
				itemDef.femaleEquip1 = 140113;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14319:
				itemDef.name = "Fighter Sword";
				itemDef.modelID = 140114;
				itemDef.maleEquip1 = 140115;
				itemDef.femaleEquip1 = 140115;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14321:
				itemDef.name = "Fighter Wings";
				itemDef.modelID = 140116;
				itemDef.maleEquip1 = 140117;
				itemDef.femaleEquip1 = 140117;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14323:
				itemDef.name = "Evil Gloves";
				itemDef.modelID = 99977;
				itemDef.maleEquip1 = 99978;
				itemDef.femaleEquip1 = 99978;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14325:
				itemDef.name = "Evil Helmet";
				itemDef.modelID = 99971;
				itemDef.maleEquip1 = 99972;
				itemDef.femaleEquip1 = 99972;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14327:
				itemDef.name = "Evil Body";
				itemDef.modelID = 99973;
				itemDef.maleEquip1 = 99974;
				itemDef.femaleEquip1 = 99974;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14329:
				itemDef.name = "Evil Boots";
				itemDef.modelID = 99979;
				itemDef.maleEquip1 = 99979;
				itemDef.femaleEquip1 = 99979;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14331:
				itemDef.name = "Evil Legs";
				itemDef.modelID = 99975;
				itemDef.maleEquip1 = 99976;
				itemDef.femaleEquip1 = 99976;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14333:
				itemDef.name = "Evil Wings";
				itemDef.modelID = 15176;
				itemDef.maleEquip1 = 15175;
				itemDef.femaleEquip1 = 15175;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14335:
				itemDef.name = "Evil Scythe";
				itemDef.modelID = 80091;
				itemDef.maleEquip1 = 80090;
				itemDef.femaleEquip1 = 80090;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14337:
				itemDef.name = "Death Aura";
				itemDef.modelID = 140147;
				itemDef.maleEquip1 = 140147;
				itemDef.femaleEquip1 = 140147;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 5000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14339:
				itemDef.name = "Death Body";
				itemDef.modelID = 140148;
				itemDef.maleEquip1 = 140148;
				itemDef.femaleEquip1 = 140148;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14341:
				itemDef.name = "Death Boots";
				itemDef.modelID = 140149;
				itemDef.maleEquip1 = 140149;
				itemDef.femaleEquip1 = 140149;
				itemdefedit = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14343:
				itemDef.name = "Death Bow";
				itemDef.modelID = 140150;
				itemDef.maleEquip1 = 140150;
				itemDef.femaleEquip1 = 140150;
				itemdefedit = ItemDefinition.get(859);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 5000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14345:
				itemDef.name = "Death Gloves";
				itemDef.modelID = 140151;
				itemDef.maleEquip1 = 140151;
				itemDef.femaleEquip1 = 140151;
				itemdefedit = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14347:
				itemDef.name = "Death Legs";
				itemDef.modelID = 140152;
				itemDef.maleEquip1 = 140152;
				itemDef.femaleEquip1 = 140152;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14349:
				itemDef.name = "Death Sickle";
				itemDef.modelID = 140157;
				itemDef.maleEquip1 = 140157;
				itemDef.femaleEquip1 = 140157;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14351:
				itemDef.name = "Death Sickle Off-Hand";
				itemDef.modelID = 140158;
				itemDef.maleEquip1 = 140158;
				itemDef.femaleEquip1 = 140158;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14353:
				itemDef.name = "Death Ring";
				itemDef.modelID = 140159;
				itemDef.maleEquip1 = 140159;
				itemDef.femaleEquip1 = 140159;
				itemdefedit = ItemDefinition.get(23091);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14355:
				itemDef.name = "Death Staff";
				itemDef.modelID = 140160;
				itemDef.maleEquip1 = 140160;
				itemDef.femaleEquip1 = 140160;
				itemdefedit = ItemDefinition.get(4587);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1250;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14357:
				itemDef.name = "Death Wings";
				itemDef.modelID = 140161;
				itemDef.maleEquip1 = 140161;
				itemDef.femaleEquip1 = 140161;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 2000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14359:
				itemDef.name = "Death Head";
				itemDef.modelID = 140162;
				itemDef.maleEquip1 = 140162;
				itemDef.femaleEquip1 = 140162;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14361:
				itemDef.name = "Death Halo";
				itemDef.modelID = 140163;
				itemDef.maleEquip1 = 140163;
				itemDef.femaleEquip1 = 140163;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14363:
				itemDef.name = "Death Pendant";
				itemDef.modelID = 140164;
				itemDef.maleEquip1 = 140164;
				itemDef.femaleEquip1 = 140164;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14365:
				itemDef.name = "Scylla Boots";
				itemDef.modelID = 140355;
				itemDef.maleEquip1 = 140355;
				itemDef.femaleEquip1 = 140355;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14367:
				itemDef.name = "Scylla Gloves";
				itemDef.modelID = 140356;
				itemDef.maleEquip1 = 140357;
				itemDef.femaleEquip1 = 140357;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14369:
				itemDef.name = "Scylla Helm";
				itemDef.modelID = 140358;
				itemDef.maleEquip1 = 140359;
				itemDef.femaleEquip1 = 140359;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14371:
				itemDef.name = "Scylla Legs";
				itemDef.modelID = 140360;
				itemDef.maleEquip1 = 140361;
				itemDef.femaleEquip1 = 140361;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14373:
				itemDef.name = "Scylla Body";
				itemDef.modelID = 140362;
				itemDef.maleEquip1 = 140363;
				itemDef.femaleEquip1 = 140363;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14375:
				itemDef.name = "Scylla Wings";
				itemDef.modelID = 140364;
				itemDef.maleEquip1 = 140365;
				itemDef.femaleEquip1 = 140365;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14379:
				itemDef.name = "Afreet Scythe";
				itemDef.modelID = 140312;
				itemDef.maleEquip1 = 140313;
				itemDef.femaleEquip1 = 140313;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14381:
				itemDef.name = "Afreet Helm";
				itemDef.modelID = 140314;
				itemDef.maleEquip1 = 140314;
				itemDef.femaleEquip1 = 140314;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14383:
				itemDef.name = "Afreet Body";
				itemDef.modelID = 140315;
				itemDef.maleEquip1 = 140315;
				itemDef.femaleEquip1 = 140315;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14385:
				itemDef.name = "Afreet Legs";
				itemDef.modelID = 140316;
				itemDef.maleEquip1 = 140316;
				itemDef.femaleEquip1 = 140316;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14387:
				itemDef.name = "Afreet Soul";
				itemDef.modelID = 140321;
				itemDef.maleEquip1 = 140321;
				itemDef.femaleEquip1 = 140321;
				itemdefedit = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14389:
				itemDef.name = "Tanjiro Head";
				itemDef.modelID = 139933;
				itemDef.maleEquip1 = 139934;
				itemDef.femaleEquip1 = 139934;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14391:
				itemDef.name = "Tanjiro Body";
				itemDef.modelID = 139935;
				itemDef.maleEquip1 = 139935;
				itemDef.femaleEquip1 = 139935;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14393:
				itemDef.name = "Tanjiro Legs";
				itemDef.modelID = 139936;
				itemDef.maleEquip1 = 139937;
				itemDef.femaleEquip1 = 139937;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14395:
				itemDef.name = "Tanjiro Hands";
				itemDef.modelID = 139938;
				itemDef.maleEquip1 = 139939;
				itemDef.femaleEquip1 = 139939;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14397:
				itemDef.name = "Tanjiro Boots";
				itemDef.modelID = 139940;
				itemDef.maleEquip1 = 139940;
				itemDef.femaleEquip1 = 139940;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14399:
				itemDef.name = "Tanjiro Sword";
				itemDef.modelID = 139942;
				itemDef.maleEquip1 = 139943;
				itemDef.femaleEquip1 = 139943;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14401:
				itemDef.name = "Inosuke Sword";
				itemDef.modelID = 139954;
				itemDef.maleEquip1 = 139955;
				itemDef.femaleEquip1 = 139955;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14403:
				itemDef.name = "Inosuke Head";
				itemDef.modelID = 139944;
				itemDef.maleEquip1 = 139945;
				itemDef.femaleEquip1 = 139945;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14405:
				itemDef.name = "Inosuke Body";
				itemDef.modelID = 139946;
				itemDef.maleEquip1 = 139947;
				itemDef.femaleEquip1 = 139947;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14407:
				itemDef.name = "Inosuke Legs";
				itemDef.modelID = 139948;
				itemDef.maleEquip1 = 139949;
				itemDef.femaleEquip1 = 139949;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14409:
				itemDef.name = "Inosuke Hands";
				itemDef.modelID = 139950;
				itemDef.maleEquip1 = 139951;
				itemDef.femaleEquip1 = 139951;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14411:
				itemDef.name = "Inosuke Boots";
				itemDef.modelID = 139952;
				itemDef.maleEquip1 = 139952;
				itemDef.femaleEquip1 = 139952;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14413:
				itemDef.name = "Zenitsu Body";
				itemDef.modelID = 139958;
				itemDef.maleEquip1 = 139959;
				itemDef.femaleEquip1 = 139959;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14415:
				itemDef.name = "Zenitsu Legs";
				itemDef.modelID = 139960;
				itemDef.maleEquip1 = 139961;
				itemDef.femaleEquip1 = 139961;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14417:
				itemDef.name = "Zenitsu Hands";
				itemDef.modelID = 139962;
				itemDef.maleEquip1 = 139969;
				itemDef.femaleEquip1 = 139969;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14419:
				itemDef.name = "Zenitsu Boots";
				itemDef.modelID = 139963;
				itemDef.maleEquip1 = 139963;
				itemDef.femaleEquip1 = 139963;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14421:
				itemDef.name = "Zenitsu Sword";
				itemDef.modelID = 139965;
				itemDef.maleEquip1 = 139966;
				itemDef.femaleEquip1 = 139966;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14422:
				itemDef.name = "Zenitsu Head";
				itemDef.modelID = 139967;
				itemDef.maleEquip1 = 139968;
				itemDef.femaleEquip1 = 139968;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14424:
				itemDef.name = "Elder Boots";
				itemDef.modelID = 140630;
				itemDef.maleEquip1 = 140630;
				itemDef.femaleEquip1 = 140630;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14426:
				itemDef.name = "Elder Gloves";
				itemDef.modelID = 140632;
				itemDef.maleEquip1 = 140631;
				itemDef.femaleEquip1 = 140631;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14428:
				itemDef.name = "Elder Legs";
				itemDef.modelID = 140633;
				itemDef.maleEquip1 = 140634;
				itemDef.femaleEquip1 = 140634;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14430:
				itemDef.name = "Elder Body";
				itemDef.modelID = 140636;
				itemDef.maleEquip1 = 140635;
				itemDef.femaleEquip1 = 140635;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14432:
				itemDef.name = "Elder Helm";
				itemDef.modelID = 140637;
				itemDef.maleEquip1 = 140638;
				itemDef.femaleEquip1 = 140638;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14434:
				itemDef.name = "Elder Ring";
				itemDef.modelID = 140639;
				itemDef.maleEquip1 = 140639;
				itemDef.femaleEquip1 = 140639;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14436:
				itemDef.name = "Elder Amulet";
				itemDef.modelID = 140640;
				itemDef.maleEquip1 = 140641;
				itemDef.femaleEquip1 = 140641;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14438:
				itemDef.name = "Black Goku Legs";
				itemDef.modelID = 140734;
				itemDef.maleEquip1 = 140733;
				itemDef.femaleEquip1 = 140733;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14440:
				itemDef.name = "Black Goku Head";
				itemDef.modelID = 140736;
				itemDef.maleEquip1 = 140735;
				itemDef.femaleEquip1 = 140735;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14442:
				itemDef.name = "Black Goku Gloves";
				itemDef.modelID = 140738;
				itemDef.maleEquip1 = 140737;
				itemDef.femaleEquip1 = 140737;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14444:
				itemDef.name = "Black Goku Boots";
				itemDef.modelID = 140740;
				itemDef.maleEquip1 = 140739;
				itemDef.femaleEquip1 = 140739;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14446:
				itemDef.name = "Black Goku Body";
				itemDef.modelID = 140742;
				itemDef.maleEquip1 = 140741;
				itemDef.femaleEquip1 = 140741;
				itemdefedit = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;




			case 14460:
				itemDef.name = "Jiren Legs";
				itemDef.modelID = 140743;
				itemDef.maleEquip1 = 140744;
				itemDef.femaleEquip1 = 140744;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14462:
				itemDef.name = "Jiren Head";
				itemDef.modelID = 140746;
				itemDef.maleEquip1 = 140747;
				itemDef.femaleEquip1 = 140747;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14464:
				itemDef.name = "Jiren Gloves";
				itemDef.modelID = 140748;
				itemDef.maleEquip1 = 140749;
				itemDef.femaleEquip1 = 140749;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14466:
				itemDef.name = "Jiren Boots";
				itemDef.modelID = 140750;
				itemDef.maleEquip1 = 140751;
				itemDef.femaleEquip1 = 140751;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14468:
				itemDef.name = "Jiren Body";
				itemDef.modelID = 140752;
				itemDef.maleEquip1 = 140753;
				itemDef.femaleEquip1 = 140753;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14470:
				itemDef.name = "Dox Bow";
				itemDef.modelID = 140729;
				itemDef.maleEquip1 = 140730;
				itemDef.femaleEquip1 = 140730;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14472:
				itemDef.name = "Dox Sword";
				itemDef.modelID = 140772;
				itemDef.maleEquip1 = 140771;
				itemDef.femaleEquip1 = 140771;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14474:
				itemDef.name = "Dox Staff";
				itemDef.modelID = 140774;
				itemDef.maleEquip1 = 140773;
				itemDef.femaleEquip1 = 140773;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14476:
				itemDef.name = "Dox Ward";
				itemDef.modelID = 140766;
				itemDef.maleEquip1 = 140765;
				itemDef.femaleEquip1 = 140765;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14478:
				itemDef.name = "Dox Buckler";
				itemDef.modelID = 140768;
				itemDef.maleEquip1 = 140767;
				itemDef.femaleEquip1 = 140767;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14479:
				itemDef.name = "Dox Kite";
				itemDef.modelID = 140770;
				itemDef.maleEquip1 = 140769;
				itemDef.femaleEquip1 = 140769;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14482:
				itemDef.name = "Black Goku Spear";
				itemDef.modelID = 140776;
				itemDef.maleEquip1 = 140775;
				itemDef.femaleEquip1 = 140775;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14484:
				itemDef.name = "Blurite Katana";
				itemDef.modelID = 140317;
				itemDef.maleEquip1 = 140318;
				itemDef.femaleEquip1 = 140318;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;

			case 14450:
				itemDef.name = "Gogeta Legs";
				itemDef.modelID = 140756;
				itemDef.maleEquip1 = 140755;
				itemDef.femaleEquip1 = 140755;
				itemDef2 = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemDef2.modelOffsetY;
				itemDef.modelZoom = itemDef2.modelZoom;
				itemDef.rotationY = itemDef2.rotationY;
				itemDef.rotationX = itemDef2.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14452:
				itemDef.name = "Gogeta Head";
				itemDef.modelID = 140758;
				itemDef.maleEquip1 = 140757;
				itemDef.femaleEquip1 = 140757;
				itemDef2 = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemDef2.modelOffsetY;
				itemDef.modelZoom = itemDef2.modelZoom;
				itemDef.rotationY = itemDef2.rotationY;
				itemDef.rotationX = itemDef2.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14454:
				itemDef.name = "Gogeta Gloves";
				itemDef.modelID = 140760;
				itemDef.maleEquip1 = 140759;
				itemDef.femaleEquip1 = 140759;
				itemDef2 = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemDef2.modelOffsetY;
				itemDef.modelZoom = itemDef2.modelZoom;
				itemDef.rotationY = itemDef2.rotationY;
				itemDef.rotationX = itemDef2.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14456:
				itemDef.name = "Gogeta Boots";
				itemDef.modelID = 140762;
				itemDef.maleEquip1 = 140761;
				itemDef.femaleEquip1 = 140761;
				itemDef2 = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemDef2.modelOffsetY;
				itemDef.modelZoom = itemDef2.modelZoom;
				itemDef.rotationY = itemDef2.rotationY;
				itemDef.rotationX = itemDef2.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14458:
				itemDef.name = "Gogeta Body";
				itemDef.modelID = 140764;
				itemDef.maleEquip1 = 140763;
				itemDef.femaleEquip1 = 140763;
				itemDef2 = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemDef2.modelOffsetY;
				itemDef.modelZoom = itemDef2.modelZoom;
				itemDef.rotationY = itemDef2.rotationY;
				itemDef.rotationX = itemDef2.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14490:
				itemDef.name = "@mag@Death Box";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				itemdefedit = ItemDefinition.get(6199);
				itemDef.modelOffsetX = 2;
				itemDef.modelOffsetY = 1;
				itemDef.modelZoom = 850;
				itemDef.rotationY = 100;
				itemDef.rotationX = 90;
				itemDef.modelID = 15180;
				
				//itemDef.rdc2 = 988331;
				itemDef.scaleY *= 0.50;
				itemDef.scaleX *= 0.50;
				itemDef.scaleZ *= 0.50;
				break;

			case 14492:
				itemDef.name = "@cya@Afreet Box";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				itemdefedit = ItemDefinition.get(6199);
				itemDef.modelOffsetX = 2;
				itemDef.modelOffsetY = 1;
				itemDef.modelZoom = 850;
				itemDef.rotationY = 100;
				itemDef.rotationX = 90;
				itemDef.modelID = 15181;
				
				//itemDef.rdc2 = 988331;
				itemDef.scaleY *= 0.50;
				itemDef.scaleX *= 0.50;
				itemDef.scaleZ *= 0.50;
				break;

		}
		return itemDef;
	}

	public static ItemDefinition itemDef(int id, ItemDefinition itemDef) {
		// TODO Auto-generated method stub
		return null;
	}

}
