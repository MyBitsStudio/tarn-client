package org.necrotic.client.cache.definition;


import static org.necrotic.client.cache.definition.MobDefinition.get;

public class ItemDef3 {
	public byte[] customSpriteLocation;

	private ItemDef3() {
	}

	public static ItemDefinition newIDS1(ItemDefinition itemDef, int id) {


		ItemDefinition itemdefedit;
		switch (id) {


			//EASTER
			case 23000:
				itemDef.copyItem(6585);
				itemDef.name = "Carrot Necklace";
				itemDef.modelID = 100051;
				itemDef.maleEquip1 = 100052;
				itemDef.femaleEquip1 = 100052;
				itemDef.modelZoom = 635;
				itemDef.rotationX = 254;
				itemDef.rotationY = 449;
				itemDef.rotationZ = 0;
				itemDef.modelOffsetX = 5;
				itemDef.modelOffsetY = 11;
				break;
			case 23002:
				itemDef.copyItem(6199);
				itemDef.name = "Fortune Chest";
				itemDef.modelID = 100054;
				itemDef.modelZoom = 936;
				itemDef.rotationX = 110;
				itemDef.rotationY = 127;
				itemDef.rotationZ = 0;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = -6;
				break;
			case 23003:
				itemDef.copyItem(12855);
				itemDef.name = "Easter Tickets";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.modelID = 100056;
				itemDef.modelZoom = 1874;
				itemDef.rotationX = 0;
				itemDef.rotationY = 525;
				itemDef.rotationZ = 0;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				break;

			case 23004:
				itemDef.copyItem(12855);
				itemDef.name = "Orange Easter Egg";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.modelID = 100057;
				itemDef.modelZoom = 535;
				itemDef.rotationX = 0;
				itemDef.rotationY = 0;
				itemDef.rotationZ = 0;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				break;
			case 23005:
				itemDef.copyItem(23004);
				itemDef.name = "Cyan Easter Egg";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.modelID = 100058;
				break;
			case 23006:
				itemDef.copyItem(23004);
				itemDef.name = "Purple Easter Egg";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.modelID = 100059;
				break;
			case 23007:
				itemDef.copyItem(23004);
				itemDef.name = "Red Easter Egg";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.modelID = 100060;
				break;

			case 23008:
				itemDef.copyItem(12855);
				itemDef.name = "White Easter Dye";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.modelID = 100061;
				itemDef.modelZoom = 769;
				itemDef.rotationX = 0;
				itemDef.rotationY = 0;
				itemDef.rotationZ = 0;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = -3;
				break;
			case 23009:
				itemDef.copyItem(23008);
				itemDef.name = "Green Easter Dye";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.modelID = 100062;
				break;
			case 23010:
				itemDef.copyItem(23008);
				itemDef.name = "Gold Easter Dye";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.modelID = 100063;
				break;
			case 23011:
				itemDef.copyItem(23008);
				itemDef.name = "Blue Easter Dye";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.modelID = 100064;
				break;
			case 23012:
				itemDef.copyItem(23008);
				itemDef.name = "Red Easter Dye";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.modelID = 100065;
				break;

			case 23013:
				itemDef.copyItem(1053);
				itemDef.name = "Easter Bunny Mask";
				itemDef.modelID = 100066;
				itemDef.maleEquip1 = 100067;
				itemDef.femaleEquip1 = 100067;
				itemDef.modelZoom = 1505;
				itemDef.rotationX = 0;
				itemDef.rotationY = 0;
				itemDef.rotationZ = 0;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				break;
			case 23014:
				itemDef.copyItem(23013);
				itemDef.name = "Green Easter Bunny Mask";
				itemDef.modelID = 100068;
				itemDef.maleEquip1 = 100069;
				itemDef.femaleEquip1 = 100069;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 23015:
				itemDef.copyItem(23014);
				itemDef.name = "Golden Easter Bunny Mask";
				itemDef.modelID = 100070;
				itemDef.maleEquip1 = 100071;
				itemDef.femaleEquip1 = 100071;
				break;
			case 23016:
				itemDef.copyItem(23014);
				itemDef.name = "Blue Easter Bunny Mask";
				itemDef.modelID = 100072;
				itemDef.maleEquip1 = 100073;
				itemDef.femaleEquip1 = 100073;
				break;
			case 23017:
				itemDef.copyItem(23014);
				itemDef.name = "Red Easter Bunny Mask";
				itemDef.modelID = 100074;
				itemDef.maleEquip1 = 100075;
				itemDef.femaleEquip1 = 100075;
				break;

			case 23018:
				itemDef.copyItem(5074);
				itemDef.name = "Armoured Bunny Pet";
				itemDef.modelID = 100050;
				itemDef.modelZoom = 4000;
				break;


			case 23020:
				itemDef.copyItem(19670);
				itemDef.name = "Vote Scroll";
				itemDef.rdc2 = 15345;
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

			case 23040:
				itemDef.copyItem(6199);
				itemDef.modelZoom = 3000;
				itemDef.name = "Chest";
				itemDef.modelID = 100122;
				itemDef.maleEquip1 = 100122;
				itemDef.femaleEquip1 = 100122;
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


			case 23050:
				itemDef.copyItem(4708);
				itemDef.name = "Zinq helm";
				itemDef.modelZoom = 1000;
				itemDef.modelID = 100129;
				itemDef.maleEquip1 = 100130;
				itemDef.femaleEquip1 = 100130;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 23051:
				itemDef.copyItem(4712);
				itemDef.name = "Zinq body";
				itemDef.modelZoom = 1500;
				itemDef.modelID = 100131;
				itemDef.maleEquip1 = 100132;
				itemDef.femaleEquip1 = 100132;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 23052:
				itemDef.copyItem(4714);
				itemDef.name = "Zinq legs";
				itemDef.modelZoom = 1800;
				itemDef.modelID = 100133;
				itemDef.maleEquip1 = 100134;
				itemDef.femaleEquip1 = 100134;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 23053:
				itemDef.copyItem(4708);
				itemDef.name = "Zinq gloves";
				itemDef.modelID = 100135;
				itemDef.modelZoom = 1000;
				itemDef.maleEquip1 = 100136;
				itemDef.femaleEquip1 = 100136;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 23054:
				itemDef.copyItem(4708);
				itemDef.name = "Zinq boots";
				itemDef.modelID = 100137;
				itemDef.maleEquip1 = 100137;
				itemDef.femaleEquip1 = 100137;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 23055:
				itemDef.copyItem(4710);
				itemDef.name = "Zinq sword";
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
				itemDef.name = "Zinq shield";
				itemDef.modelID = 100140;
				itemDef.maleEquip1 = 100141;
				itemDef.femaleEquip1 = 100141;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
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


			case 23075:
				itemDef.copyItem(13263);
				itemDef.name = "Soldier helm";
				itemDef.modelID = 100178;
				itemDef.maleEquip1 = 100179;
				itemDef.femaleEquip1 = 100179;
				break;
			case 23076:
				itemDef.copyItem(4712);
				itemDef.name = "Soldier body";
				itemDef.modelZoom = 1500;
				itemDef.modelID = 100180;
				itemDef.maleEquip1 = 100181;
				itemDef.femaleEquip1 = 100181;
				break;
			case 23077:
				itemDef.copyItem(4714);
				itemDef.name = "Soldier legs";
				itemDef.modelZoom = 1800;
				itemDef.modelID = 100182;
				itemDef.maleEquip1 = 100183;
				itemDef.femaleEquip1 = 100183;
				break;
			//case 23078: old id for soldier lance
			case 5730:
				itemDef.copyItem(4710);
				itemDef.name = "@red@Soldier Lance (Special)";
				itemDef.modelZoom = 2700;
				itemDef.rotationX = 1200;
				itemDef.rotationY = 400;
				itemDef.modelOffsetX = -20;
				itemDef.modelOffsetY = -20;
				itemDef.modelID = 100184;
				itemDef.maleEquip1 = 100185;
				itemDef.femaleEquip1 = 100185;
				break;
			case 23079:
				itemDef.copyItem(4710);
				itemDef.name = "Soldier sword";
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
				itemDef.name = "Soldier Sword Off-Hand";
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

				//BOSS PETS START
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
			case 19484:
				itemDef.copyItem(5074);
				itemDef.name = "Asmodeus Pet";
				itemDef.modelID = 100407;
				itemDef.modelZoom = 4500;
				itemDef.modelOffsetX = 2;
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = 80;
				itemDef.rotationY = 204;
				itemDef.rotationX = 20;
				break;
			case 19485:
				itemDef.copyItem(5074);
				itemDef.name = "Malvek Pet";
				itemDef.modelID = 65172;
				itemDef.modelZoom = 2500;
				itemDef.modelOffsetX = 2;
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = 80;
				itemDef.rotationY = 204;
				itemDef.rotationX = 20;
				break;
			case 19486:
				itemDef.copyItem(12189);
				itemDef.name = "Onyx Griffin Pet";
				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
				break;
			case 19487:
				itemDef.copyItem(5074);
				itemDef.name = "Zeidan Grimm Pet";
				itemDef.modelID = 139754;
				itemDef.modelZoom = 3500;
				itemDef.modelOffsetX = 2;
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
			case 19489:
				itemDef.copyItem(5074);
				itemDef.name = "Lilinryss Pet";
				itemDef.modelID = 139804;
				itemDef.modelZoom = 3500;
				itemDef.modelOffsetX = 2;
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = 80;
				itemDef.rotationY = 204;
				itemDef.rotationX = 20;
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = 80;
				itemDef.rotationY = 204;
				itemDef.rotationX = 20;
				break;
			case 19495:
				itemDef.copyItem(5074);
				itemDef.name = "Agumon Pet";
				itemDef.modelID = 139850;
				itemDef.modelZoom = 2500;
				itemDef.modelOffsetX = 2;
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
			case 20589:
				itemDef.copyItem(5074);
				itemDef.name = "Exoden Pet";
				itemDef.modelID = 64094;
				itemDef.modelZoom = 7500;
				itemDef.modelOffsetX = 2;
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = 80;
				itemDef.rotationY = 204;
				itemDef.rotationX = 20;
				break;
			case 20590:
				itemDef.copyItem(5074);
				itemDef.name = "Ezkel-Nojad Pet";
				itemDef.modelID = 34131;
				itemDef.modelZoom = 7500;
				itemDef.modelOffsetX = 2;
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = 80;
				itemDef.rotationY = 204;
				itemDef.rotationX = 20;
				break;
			case 20603:
				itemDef.copyItem(5074);
				itemDef.name = "Frieza Pet";
				itemDef.modelID = 64364;
				itemDef.modelOffsetX = 2;
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
				itemDef.name = "<col=C733FF>Fazula pet";
				itemDef.modelID = 141170;
				//itemDef = ItemDefinition.get(4708);
				itemDef.modelOffsetX = itemDef.modelOffsetX;
				itemDef.modelOffsetY = itemDef.modelOffsetY;
				itemDef.modelZoom = 800;
				itemDef.rotationY = itemDef.rotationY;
				itemDef.rotationX = itemDef.rotationX;
				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
				itemDef.stackable = false;
				//itemDef.rdc2 = 654332;
				break;

				//BOSS PETS END
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

			case 23086:
				itemDef.copyItem(1);
				itemDef.name = "Halls of Valor Key";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.modelID = 100202;
				itemDef.rotationX = 0;
				itemDef.rotationY = 520;
				itemDef.modelZoom = 800;
				break;

			case 23087:
				itemDef.copyItem(6585);
				itemDef.name = "Collectors necklace";
				itemDef.modelID = 100203;
				itemDef.maleEquip1 = 100204;
				itemDef.femaleEquip1 = 100204;
				itemDef.modelZoom = 800;
				itemDef.rotationX = 0;
				itemDef.rotationY = 350;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 15;
				break;
			case 23088:
				itemDef.copyItem(23087);
				itemDef.name = "Green Valor Amulet";
				itemDef.modelID = 100205;
				itemDef.maleEquip1 = 100206;
				itemDef.femaleEquip1 = 100206;
				break;
			case 23089:
				itemDef.copyItem(23087);
				itemDef.name = "Starter amulet";
				itemDef.modelID = 100207;
				itemDef.maleEquip1 = 100208;
				itemDef.femaleEquip1 = 100208;
				break;
			case 23090:
				itemDef.copyItem(23087);
				itemDef.name = "Upgraded collectors necklace";
				itemDef.modelID = 100209;
				itemDef.maleEquip1 = 100210;
				itemDef.femaleEquip1 = 100210;
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
			case 23092:
				itemDef.copyItem(23091);
				itemDef.name = "Zircon (Wizard)";
				itemDef.modelID = 100212;
				break;
			case 23093:
				itemDef.copyItem(23091);
				itemDef.name = "Zicron (Ranger)";
				itemDef.modelID = 100213;
				break;
			case 23094:
				itemDef.copyItem(23091);
				itemDef.name = "Zircon (Warrior)";
				itemDef.modelID = 100214;
				break;
			case 9719:
				itemDef.name = "Slayer skip scroll";
				break;

			case 12852:
				itemDef.name = "Vault token";
				break;
			case 23095:
				itemDef.copyItem(2902);
				itemDef.name = "Mercenary gloves";
				itemDef.modelID = 100215;
				itemDef.maleEquip1 = 100216;
				itemDef.femaleEquip1 = 100216;
				itemDef.modelZoom = 750;
				itemDef.rotationX = 0;
				itemDef.rotationY = 520;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				break;
			case 23096:
				itemDef.copyItem(23095);
				itemDef.name = "Wizard gloves";
				itemDef.modelID = 100217;
				itemDef.maleEquip1 = 100218;
				itemDef.femaleEquip1 = 100218;
				break;
			case 23097:
				itemDef.copyItem(23095);
				itemDef.name = "Warrior gloves";
				itemDef.modelID = 100219;
				itemDef.maleEquip1 = 100220;
				itemDef.femaleEquip1 = 100220;
				break;
			case 23098:
				itemDef.copyItem(23095);
				itemDef.name = "Archer gloves";
				itemDef.modelID = 100221;
				itemDef.maleEquip1 = 100222;
				itemDef.femaleEquip1 = 1002222;
				break;

			case 23099:
				itemDef.copyItem(2902);
				itemDef.name = "War gauntlets (T1)";
				itemDef.modelID = 100223;
				itemDef.maleEquip1 = 100224;
				itemDef.femaleEquip1 = 100224;
				itemDef.modelZoom = 700;
				itemDef.rotationX = 0;
				itemDef.rotationY = 520;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				break;
			case 23100:
				itemDef.copyItem(23099);
				itemDef.name = "War gauntlets (T2)";
				itemDef.modelID = 100225;
				itemDef.maleEquip1 = 100226;
				itemDef.femaleEquip1 = 100226;
				break;
			case 23101:
				itemDef.copyItem(23099);
				itemDef.name = "War gauntlets (T3)";
				itemDef.modelID = 100227;
				itemDef.maleEquip1 = 100228;
				itemDef.femaleEquip1 = 100228;
				break;
			case 23102:
				itemDef.copyItem(23099);
				itemDef.name = "War gauntlets (T4)";
				itemDef.modelID = 100229;
				itemDef.maleEquip1 = 100230;
				itemDef.femaleEquip1 = 1002230;
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

				//new items
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

			case 23127:
				itemDef.copyItem(4708);
				itemDef.name = "Mystical helm";
				itemDef.modelID = 100264;
				itemDef.maleEquip1 = 15166;
				itemDef.femaleEquip1 = 15166;
				itemDef.modelZoom = 800;
				break;
			case 23128:
				itemDef.copyItem(4712);
				itemDef.name = "Mystical body";
				itemDef.modelID = 100259;
				itemDef.maleEquip1 = 15168;
				itemDef.femaleEquip1 = 15168;
				itemDef.modelZoom = 1500;
				break;
			case 23129:
				itemDef.copyItem(4714);
				itemDef.name = "Mystical legs";
				itemDef.modelID = 100266;
				itemDef.maleEquip1 = 15167;
				itemDef.femaleEquip1 = 15167;
				itemDef.modelZoom = 1800;
				break;
			case 23130:
				itemDef.copyItem(4708);
				itemDef.name = "Mystical gloves";
				itemDef.modelID = 100262;
				itemDef.maleEquip1 = 15170;
				itemDef.femaleEquip1 = 15170;
				itemDef.modelZoom = 700;
				break;
			case 23131:
				itemDef.copyItem(4708);
				itemDef.name = "Mystical boots";
				itemDef.modelID = 100261;
				itemDef.maleEquip1 = 15169;
				itemDef.femaleEquip1 = 15169;
				itemDef.modelZoom = 700;
				break;
			case 23132:
				itemDef.copyItem(4710);
				itemDef.name = "Mystical scythe";
				itemDef.modelID = 100268;
				itemDef.maleEquip1 = 15171;
				itemDef.femaleEquip1 = 15171;
				itemDef.modelZoom = 3000;
				itemDef.rotationX = 1024;
				itemDef.rotationY = 525;
				itemDef.modelOffsetX = -5;
				itemDef.rotationZ = 0;
				itemDef.modelOffsetY = -5;
				break;
			case 23133:
				itemDef.copyItem(669);
				itemDef.name = "Mystical wings";
				itemDef.modelID = 100270;
				itemDef.maleEquip1 = 15172;
				itemDef.femaleEquip1 = 15172;
				itemDef.modelZoom = 2300;
				itemDef.rotationX = 1050;
				itemDef.rotationY = 525;
				itemDef.modelOffsetX = 0;
				itemDef.rotationZ = 0;
				itemDef.modelOffsetY = 25;
				break;

			case 23134:
				itemDef.copyItem(4708);
				itemDef.name = "Sacred helm";
				itemDef.modelID = 100279;
				itemDef.maleEquip1 = 100280;
				itemDef.femaleEquip1 = 100280;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.modelZoom = 800;
				break;
			case 23135:
				itemDef.copyItem(4712);
				itemDef.name = "Sacred body";
				itemDef.modelID = 100272;
				itemDef.maleEquip1 = 100273;
				itemDef.femaleEquip1 = 100273;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.modelZoom = 1500;
				break;
			case 23136:
				itemDef.copyItem(4714);
				itemDef.name = "Sacred legs";
				itemDef.modelID = 100277;
				itemDef.maleEquip1 = 100278;
				itemDef.femaleEquip1 = 100278;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.modelZoom = 1800;
				break;
			case 23137:
				itemDef.copyItem(4708);
				itemDef.name = "Sacred gloves";
				itemDef.modelID = 100275;
				itemDef.maleEquip1 = 100276;
				itemDef.femaleEquip1 = 100276;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.modelZoom = 700;
				break;
			case 23138:
				itemDef.copyItem(4708);
				itemDef.name = "Sacred boots";
				itemDef.modelID = 100274;
				itemDef.maleEquip1 = 100274;
				itemDef.femaleEquip1 = 100274;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.modelZoom = 700;
				break;


			case 23139:
				itemDef.copyItem(4708);
				itemDef.name = "Ruthless helm";
				itemDef.modelID = 100289;
				itemDef.maleEquip1 = 100290;
				itemDef.femaleEquip1 = 100290;
				itemDef.modelZoom = 900;
				break;
			case 23140:
				itemDef.copyItem(4712);
				itemDef.name = "Ruthless body";
				itemDef.modelID = 100293;
				itemDef.maleEquip1 = 100294;
				itemDef.femaleEquip1 = 100294;
				itemDef.modelZoom = 1500;
				break;
			case 23141:
				itemDef.copyItem(4714);
				itemDef.name = "Ruthless legs";
				itemDef.modelID = 100291;
				itemDef.maleEquip1 = 100292;
				itemDef.femaleEquip1 = 100292;
				itemDef.modelZoom = 1800;
				break;
			case 23142:
				itemDef.copyItem(4708);
				itemDef.name = "Ruthless gloves";
				itemDef.modelID = 100287;
				itemDef.maleEquip1 = 100288;
				itemDef.femaleEquip1 = 100288;
				itemDef.modelZoom = 700;
				break;
			case 23143:
				itemDef.copyItem(4708);
				itemDef.name = "Ruthless boots";
				itemDef.modelID = 100286;
				itemDef.maleEquip1 = 100286;
				itemDef.femaleEquip1 = 100286;
				itemDef.modelZoom = 700;
				break;
			case 23144:
				itemDef.copyItem(4710);
				itemDef.name = "Antique bow";
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
				itemDef.name = "Antique staff";
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
				itemDef.name = "Antique sword";
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

			case 23147:
				itemDef.copyItem(1505);
				itemDef.name = "Melee attachement";
				itemDef.modelID = 100301;
				itemDef.modelZoom = 1500;
				itemDef.actions = new String[]{null, null, null, null, null};
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				itemDef.rotationZ = 0;
				break;
			case 23148:
				itemDef.copyItem(23147);
				itemDef.name = "Magic attachement";
				itemDef.modelID = 100302;
				itemDef.modelZoom = 1600;
				break;
			case 23149:
				itemDef.copyItem(23147);
				itemDef.name = "Ranged attachement";
				itemDef.modelID = 100303;
				itemDef.modelZoom = 1600;
				break;

			case 995:
				//itemDef.copyItem(995);
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
				//itemDef.copyItem(995);
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
				//itemDef.copyItem(995);
				itemDef.name = "<col=05519a><shad=0>Upgrade Token<shad-1>";
				itemDef.actions = new String[5];
				//itemDef.actions[2] = "@cya@Convert to 1B";
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
			case 23150:
				itemDef.copyItem(669);
				itemDef.name = "Flat cape";
				itemDef.modelID = 100304;
				itemDef.maleEquip1 = 100304;
				itemDef.femaleEquip1 = 100304;
				itemDef.modelZoom = 2300;
				itemDef.rotationX = 1050;
				itemDef.rotationY = 525;
				itemDef.modelOffsetX = 0;
				itemDef.rotationZ = 0;
				itemDef.modelOffsetY = 25;
				break;


			case 23151:
				itemDef.copyItem(5074);
				itemDef.name = "Demon of Light Pet";
				itemDef.modelID = 100281;
				itemDef.modelZoom = 1500;
				itemDef.rotationY = 0;
				itemDef.rotationX = 0;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				itemDef.scaleX = 32;
				itemDef.scaleY = 32;
				itemDef.scaleZ = 32;
				break;
			case 23152:
				itemDef.copyItem(23151);
				itemDef.name = "Bat of Light Pet";
				itemDef.modelID = 100282;
				itemDef.modelZoom = 1500;
				itemDef.scaleX = 8;
				itemDef.scaleY = 8;
				itemDef.scaleZ = 8;
				itemDef.rotationY = 300;
				itemDef.rotationX = 300;
				break;
			case 23153:
				itemDef.copyItem(23151);
				itemDef.name = "Goblin of Light Pet";
				itemDef.modelID = 100283;
				itemDef.scaleX = 8;
				itemDef.scaleY = 8;
				itemDef.scaleZ = 8;
				itemDef.modelZoom = 1500;
				break;
			case 23154:
				itemDef.copyItem(23151);
				itemDef.name = "Lava hound Pet";
				itemDef.modelID = 100306;
				itemDef.modelZoom = 700;
				itemDef.rotationX = 200;
				break;
			case 23155:
				itemDef.copyItem(23151);
				itemDef.name = "Mutated hound Pet";
				itemDef.modelID = 100305;
				itemDef.modelZoom = 1600;
				break;

			case 23156:
				itemDef.copyItem(23151);
				itemDef.name = "Scorpion Pet";
				itemDef.modelID = 100313;
				itemDef.rotationX = 0;
				itemDef.rotationY = 300;
				itemDef.modelZoom = 1000;
				break;
			case 23157:
				itemDef.copyItem(23151);
				itemDef.name = "Zombie Pet";
				itemDef.modelID = 100314;
				itemDef.modelZoom = 800;
				break;

			case 23158:
				itemDef.copyItem(669);
				itemDef.name = "Magic max cape";
				itemDef.modelID = 100307;
				itemDef.maleEquip1 = 100308;
				itemDef.femaleEquip1 = 100308;
				itemDef.modelZoom = 1800;
				itemDef.rotationX = 0;
				itemDef.rotationY = 525;
				itemDef.modelOffsetX = 0;
				itemDef.rotationZ = 0;
				itemDef.modelOffsetY = 0;
				break;
			case 23159:
				itemDef.copyItem(669);
				itemDef.name = "Melee max cape";
				itemDef.modelID = 100309;
				itemDef.maleEquip1 = 100310;
				itemDef.femaleEquip1 = 100310;
				itemDef.modelZoom = 1800;
				itemDef.rotationX = 0;
				itemDef.rotationY = 525;
				itemDef.modelOffsetX = 0;
				itemDef.rotationZ = 0;
				itemDef.modelOffsetY = 0;
				break;
			case 23160:
				itemDef.copyItem(669);
				itemDef.name = "Ranged max cape";
				itemDef.modelID = 100311;
				itemDef.maleEquip1 = 100312;
				itemDef.femaleEquip1 = 100312;
				itemDef.modelZoom = 2500;
				itemDef.rotationX = 0;
				itemDef.rotationY = 525;
				itemDef.modelOffsetX = 0;
				itemDef.rotationZ = 0;
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

			case 2734:
				itemDef.name = "Slayer casket";
				itemDef.rdc2 = 847;
				break;
			case 2736:
				itemDef.name = "PvM Casket";
				itemDef.rdc2 = 54666;
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
			case 23173:
				itemDef.copyItem(6199);
				itemDef.name = "Blurite box";
				itemDef.rdc2 = 18000;
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

			case 23175:
				itemDef.copyItem(6889);
				itemDef.name = "Vindicta book";
				itemDef.rdc2 = 54666;//15888 - 45366
				break;


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


			case 23177:
				itemDef.copyItem(6199);
				itemDef.name = "Starter box";
				itemDef.rdc2 = 3455;//15888 - 45366
				break;


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
			case 20555://vitur
			case 13887:
			case 13905:
			case 13867:
			case 15877:
			case 15922:
			case 15933:
			case 16021:
			case 8816:
			case 8817:
			case 8818:
			case 18356:
			case 12931:
			case 15511:
			case 1149:
			case 1249:
			case 3204:
			case 1305:
			case 1215:
			case 1377:
			case 1434:
			case 7158:
				
				break;
			case 17043:
				itemDef.name = "Leafy coif";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				
				break;
			case 18332:
				itemDef.name = "Leafy Longbow";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				
				break;
			case 13591:
				itemDef.name = "@yel@Raids [1] Key";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, null};
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
			case 17175:
				itemDef.name = "Leafy body";


				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				
				break;
			case 17321:
				itemDef.name = "Leafy chaps";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				
				break;
			case 10696:
				itemDef.name = "Leafy boots";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				
				break;
			case 15026:
				itemDef.name = "Leafy gloves";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				
				break;
			case 14733:
				itemDef.name = "Sinful Hat";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				
				break;
			case 14732:
				itemDef.name = "Sinful Top";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				
				break;
			case 14734:
				itemDef.name = "Sinful Bottom";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				
				break;
			case 14377:
				itemDef.name = "Sinful Staff";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				
				break;
			case 10865:
				itemDef.name = "Sinful Boots";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				
				break;
			case 12864:
				itemDef.name = "Sinful Gloves";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				
				break;
			case 4367:
				itemDef.name = "Aberrant cape";
				//	itemDef.modelID = 65448;
				//	itemDef.maleWearId = 65449;
				//	itemDef.femaleWearId = 65449;
				itemDef.modelID = 65333;
				itemDef.maleEquip1 = 65334;
				itemDef.femaleEquip1 = 65334;
				itemDef.newModelColor = new int[]{59};
				itemDef.editedModelColor = new int[]{66};
				itemDef.rdc2 = 762432;
				itemDef.modelZoom = 1385;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 24;
				itemDef.rotationY = 279;
				itemDef.rotationX = 948;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 7996:
				itemDef.name = "robin's cape";
				//	itemDef.modelID = 65448;
				//	itemDef.maleWearId = 65449;
				//	itemDef.femaleWearId = 65449;
				itemDef.modelID = 64365;
				itemDef.maleEquip1 = 64366;
				itemDef.femaleEquip1 = 64366;
				itemdefedit = ItemDefinition.get(2414);
				//	itemDef.modelID = 65333;
				//itemDef.maleWearId = 65334;
				//itemDef.femaleWearId = 65334;
				//itemDef.actions = itemdefedit.actions;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};

				break;
			case 10946:
				itemDef.name = "$1 Scroll";
				itemDef.actions = new String[5];
				itemDef.actions[4] = "Drop";
				itemDef.actions[0] = "Claim";
				itemDef.actions[2] = "Claim all";
				itemdefedit = ItemDefinition.get(761);
				itemDef.modelID = itemdefedit.modelID;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.itemdefedit = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelZoom = 1300;
				break;
			case 7997:
				itemDef.name = "Exciter Cape";
				//	itemDef.modelID = 65448;
				//	itemDef.maleWearId = 65449;
				//	itemDef.femaleWearId = 65449;
				itemDef.modelID = 64367;
				itemDef.maleEquip1 = 64368;
				itemDef.femaleEquip1 = 64368;
				itemdefedit = ItemDefinition.get(2414);
				//	itemDef.modelID = 65333;
				//itemDef.maleWearId = 65334;
				//itemDef.femaleWearId = 65334;
				//itemDef.actions = itemdefedit.actions;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{95};
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};

				break;
			case 7995:
				itemDef.name = "Owner's cape";
				itemDef.modelID = 65448;
				itemDef.maleEquip1 = 65449;
				itemDef.femaleEquip1 = 65449;
				itemdefedit = ItemDefinition.get(2414);
				itemDef.actions = itemdefedit.actions;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.newModelColor = new int[]{57};
				itemDef.editedModelColor = new int[]{52};
				break;
			case 22109:
				itemDef.name = "Owner's cape (U)";
				itemDef.modelID = 15116;
				itemDef.maleEquip1 = 15114;
				itemDef.femaleEquip1 = 15114;
				itemdefedit = ItemDefinition.get(2414);
				itemDef.actions = itemdefedit.actions;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.newModelColor = new int[]{57};
				itemDef.editedModelColor = new int[]{52};
				break;
			case 20499:
				itemDef.name = "Owner's cape (E)";
				itemDef.modelID = 15117;
				itemDef.maleEquip1 = 15115;
				itemDef.femaleEquip1 = 15115;
				itemdefedit = ItemDefinition.get(2414);
				itemDef.actions = itemdefedit.actions;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.newModelColor = new int[]{57};
				itemDef.editedModelColor = new int[]{52};
				break;
			case 11000:
				itemDef.name = "@red@Owner's Attachment";
				itemDef.modelID = 65448;
				itemDef.maleEquip1 = 65449;
				itemDef.femaleEquip1 = 65449;
				itemdefedit = ItemDefinition.get(2414);
				itemDef.actions = itemdefedit.actions;
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				break;
			case 5594:
				itemDef.name = "Exode Cape";
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
				itemDef.actions = itemdefedit.actions;
				itemDef.editedModelColor = new int[2]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[2]; // same here
				itemDef.newModelColor[0] = 54; // the texture that it currently has
				itemDef.editedModelColor[0] = 88;
				itemDef.newModelColor[1] = 65; // the texture that it currently has
				itemDef.editedModelColor[1] = 88; // the new texture u want it to have
				itemDef.stackable = false;
				itemDef.value = 1;
				break;
			case 15219:
				itemDef.name = "Del's cape";
				itemDef.modelID = 65333;
				itemDef.maleEquip1 = 65334;
				itemDef.femaleEquip1 = 65334;
				itemDef.newModelColor = new int[]{57};
				itemDef.editedModelColor = new int[]{78};
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 36232;
				itemDef.modelZoom = 1385;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 24;
				itemDef.rotationY = 279;
				itemDef.rotationX = 948;
				break;
			case 20591:
				itemDef.name = "@gre@Rage Cape";
				itemDef.modelID = 65333;
				itemDef.maleEquip1 = 65334;
				itemDef.femaleEquip1 = 65334;
				itemdefedit = ItemDefinition.get(4367);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//	itemDef.actions = itemdefedit.actions;
				itemDef.rdc2 = 29295;
				itemDef.newModelColor = new int[]{57};
				itemDef.editedModelColor = new int[]{71};
				itemDef.modelZoom = 1385;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 24;
				itemDef.rotationY = 279;
				itemDef.rotationX = 948;
				break;
			case 11320:
				itemDef.name = "Max melee helm";
				itemDef.modelID = 99851;
				itemDef.maleEquip1 = 99852;
				itemDef.femaleEquip1 = 99852;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{52};
				break;
			case 11321:
				itemDef.name = "Max melee body";

				itemDef.modelID = 99849;
				itemDef.maleEquip1 = 99850;
				itemDef.femaleEquip1 = 99850;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{52};
				break;
			case 11322:
				itemDef.name = "Max melee legs";
				itemDef.modelID = 99848;
				itemDef.maleEquip1 = 99847;
				itemDef.femaleEquip1 = 99847;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{52};
				break;
			case 18819:
				itemDef.name = "<shad=1><col=FF0000>Infinity Slayer Ring";
				itemdefedit = ItemDefinition.get(13281);
				itemDef.actions = itemdefedit.actions;
				break;
			case 11421:
				itemDef.name = "Belligerent helm";
				itemDef.modelID = 96321;
				itemDef.maleEquip1 = 96322;
				itemDef.femaleEquip1 = 96322;
				itemdefedit = ItemDefinition.get(4882);
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
				itemDef.name = "Belligerent body";
				itemDef.modelID = 96323;
				itemDef.maleEquip1 = 96324;
				itemDef.femaleEquip1 = 96324;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{51};
				break;
			case 11423:
				itemDef.name = "Belligerent legs";
				itemDef.modelID = 96325;
				itemDef.maleEquip1 = 96326;
				itemDef.femaleEquip1 = 96326;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{51};
				break;
			case 11340:
				itemDef.name = "Max range halo";
				itemDef.modelID = 96120;
				itemDef.maleEquip1 = 96121;
				itemDef.femaleEquip1 = 96121;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 19518;
				break;
			case 22121:
				itemDef.name = "@yel@Golden Scratch Card";
				itemdefedit = ItemDefinition.get(455);
				itemDef.actions = new String[]{"Scratch", null, null, null, "Drop"};
				itemDef.modelID = 100053;
				itemDef.modelZoom = 1171;
				itemDef.rotationX = 322;
				itemDef.rotationY = 525;
				itemDef.rotationZ = 0;
				itemDef.modelOffsetX = 4;
				itemDef.modelOffsetY = -3;
				break;
			case 11341:
				itemDef.name = "Max range body";
				itemDef.modelID = 96122;
				itemDef.maleEquip1 = 96123;
				itemDef.femaleEquip1 = 96123;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 19518;
				break;
			case 11342:
				itemDef.name = "Max range legs";
				itemDef.modelID = 96124;
				itemDef.maleEquip1 = 96125;
				itemDef.femaleEquip1 = 96125;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 19518;
				break;

			case 8087:
				itemDef.name = "Tarn sword";
				itemDef.modelID = 64139;
				itemDef.maleEquip1 = 64140;
				itemDef.femaleEquip1 = 64140;
				itemdefedit = ItemDefinition.get(22034);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1500;
				itemDef.rotationY = 400;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				break;

			case 8088:
				itemDef.name = "Emerald Crossbow";
				itemDef.modelID = 64358;
				itemDef.maleEquip1 = 64359;
				itemDef.femaleEquip1 = 64359;
				itemdefedit = ItemDefinition.get(9185);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1700;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 654332;
				break;
			case 8001:
				itemDef.name = "Forbidden Crossbow";
				itemDef.modelID = 64495;
				itemDef.maleEquip1 = 64496;
				itemDef.femaleEquip1 = 64496;
				itemdefedit = ItemDefinition.get(9185);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1700;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				//	
				//itemDef.rdc2 = 654332;
				break;
			case 8089:
				itemDef.name = "Tarn Staff";
				itemDef.modelID = 64360;
				itemDef.maleEquip1 = 64361;
				itemDef.femaleEquip1 = 64361;
				itemdefedit = ItemDefinition.get(1385);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 2000;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear"/*done*/; //done
itemDef.actions[2] = "Dissolve";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 12345;
				break;
			case 19888:
				itemDef.name = "Collector necklace @cya@II";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				

				break;
			case 18823:

				itemDef.name = "Collector ring @cya@II";
				
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 18888:

				itemdefedit = ItemDefinition.get(19888);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.name = "Collector necklace @mag@III";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 18818:
				itemdefedit = ItemDefinition.get(18823);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.name = "Collector ring @mag@III";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 21816:
				itemDef.name = "Warrior ticket";
				//itemDef.rdc2 = 45367587;
				break;

			case 21815:
				itemDef.name = "Archer ticket";
				itemDef.rdc2 = 45367587;
				break;
			case 21814:
				itemDef.name = "Wizard ticket";
				itemDef.rdc2 = 35734;
				break;
			case 14910:
				itemDef.name = "Forsaken Helm";

				itemdefedit = ItemDefinition.get(14008);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;
			case 14911:
				itemDef.name = "Forsaken Body";

				itemdefedit = ItemDefinition.get(14009);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;
			case 14912:
				itemDef.name = "Forsaken Legs";

				itemdefedit = ItemDefinition.get(14010);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;
			case 14913:
				itemDef.name = "Forsaken Gloves";

				itemdefedit = ItemDefinition.get(5556);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;

			case 14914:
				itemDef.name = "Forsaken Boots";

				itemdefedit = ItemDefinition.get(20119);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;
			case 14915:
				itemDef.name = "Forsaken Sword";

				itemdefedit = ItemDefinition.get(20536);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				break;
			case 14916:
				itemDef.name = "Nature pernix cowl";

				itemdefedit = ItemDefinition.get(14011);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;
			case 14917:
				itemDef.name = "Nature pernix body";

				itemdefedit = ItemDefinition.get(14012);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;
			case 14918:
				itemDef.name = "Nature pernix chaps";

				itemdefedit = ItemDefinition.get(14013);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;
			case 14919:
				itemDef.name = "Nature crossbow";

				itemdefedit = ItemDefinition.get(14684);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				break;
			case 14920:
				itemDef.name = "Nature cape";

				itemdefedit = ItemDefinition.get(14022);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;
			case 6833:
				itemDef.name = "Goodiebag Box";
				itemDef.rdc2 = 12512;
				itemDef.actions = new String[]{"Open", null, null, null, "Drop"};

				break;
			case 14921:
				itemDef.name = "Icey virtus mask";

				itemdefedit = ItemDefinition.get(14014);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = itemdefedit.actions;
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;
			case 14922:
				itemDef.name = "Icey virtus robe top";

				itemdefedit = ItemDefinition.get(14015);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = itemdefedit.actions;
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;
			case 14923:
				itemDef.name = "Icey virtus legs";

				itemdefedit = ItemDefinition.get(14016);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = itemdefedit.actions;
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;
			case 14924:
				itemDef.name = "Icey staff of festive";

				itemdefedit = ItemDefinition.get(18667);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				break;
			case 14925:
				itemDef.name = "Icey shield";

				itemdefedit = ItemDefinition.get(14577);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = itemdefedit.actions;
				itemDef.stackable = false;
				//	itemDef.rdc2 = 19518;
				break;
			case 15115:
				itemDef.name = "<shad=1><col=00e673>Extreme helm";
				itemDef.modelID = 65192;
				itemDef.maleEquip1 = 65193;
				itemDef.femaleEquip1 = 65193;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 88205;
				break;
			case 15116:
				itemDef.name = "<shad=1><col=00e673>Extreme body";
				itemDef.modelID = 65194;
				itemDef.maleEquip1 = 65195;
				itemDef.femaleEquip1 = 65195;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 88205;
				break;
			case 15117:
				itemDef.name = "<shad=1><col=00e673>Extreme legs";
				itemDef.modelID = 65196;
				itemDef.maleEquip1 = 65197;
				itemDef.femaleEquip1 = 65197;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 88205;
				break;
			case 15118:
				itemDef.name = "<shad=1><col=00e673>Extreme gloves";
				itemDef.modelID = 65198;
				itemDef.maleEquip1 = 65199;
				itemDef.femaleEquip1 = 65199;
				itemdefedit = ItemDefinition.get(7462);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 88205;
				break;
			case 15119:
				itemDef.name = "<shad=1><col=00e673>Extreme boots";
				itemDef.modelID = 65200;
				itemDef.maleEquip1 = 65200;
				itemDef.femaleEquip1 = 65200;
				itemdefedit = ItemDefinition.get(3791);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 88205;
				break;
			case 15121:
				itemDef.name = "Extreme spear";
				itemDef.modelID = 65201;
				itemDef.maleEquip1 = 65202;
				itemDef.femaleEquip1 = 65202;
				itemdefedit = ItemDefinition.get(1237);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 88205;
				break;
			case 19331:
				itemDef.name = "Frozen staff";
				itemdefedit = ItemDefinition.get(15486);
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;
				
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 7792950;
				break;
			case 15448:
				itemDef.name = "Groudon-flame power";
				
				break;
			case 15449:
				itemDef.name = "Extreme Aura";
				break;
			case 15450:
				itemDef.name = "@cya@Collectors Aura I";
				break;
			case 3107:
				itemDef.name = "Groudon-flame boots";
				
				break;
			case 13640:
				itemDef.name = "Groudon-flame staff";
				
				break;
			case 13964:
				itemDef.name = "Groudon-flame shield";
				
				break;
			//case 13964:itemDef.name = "Groudon-flame shield";break;
			case 11317:
				ItemDefinition votingpoting = ItemDefinition.get(12479);
				itemDef.modelID = 64304;
				itemDef.modelOffsetX = votingpoting.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = votingpoting.modelOffsetY;
				itemDef.modelZoom = 2000;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "Bumble bee pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
				itemDef.rdc2 = 664466;
				break;
			case 5074:
				ItemDefinition jokerpet = ItemDefinition.get(12479);
				itemDef.modelID = 64508;
				itemDef.modelOffsetX = jokerpet.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = luffpet.modelOffsetY;
				itemDef.modelZoom = 2000;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "Luffy pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
				//	itemDef.rdc2 = 664466;
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
			case 20060:
				itemDef.name = "@gre@Cleric helm";

				itemDef.modelID = 65385;
				itemDef.maleEquip1 = 65386;
				itemDef.femaleEquip1 = 65386;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{88};
				break;
			case 20062:
				itemDef.name = "@gre@Cleric body";
				itemDef.modelID = 65387;
				itemDef.maleEquip1 = 65388;
				itemDef.femaleEquip1 = 65388;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{88};

				break;
			case 20063:
				itemDef.name = "@gre@Cleric legs";

				itemDef.modelID = 65389;
				itemDef.maleEquip1 = 65390;
				itemDef.femaleEquip1 = 65390;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{88};

				break;
			case 20073:
				itemDef.name = "@gre@Cleric boots";
				itemdefedit = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64177;
				itemDef.maleEquip1 = 64178;
				itemDef.femaleEquip1 = 64178;
				itemDef.actions = itemdefedit.actions;
				//	itemDef.rdc2 = 47333;
				break;

			case 19800:
				itemDef.name = "@gre@Cleric Teddybear";
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
			case 19802:
				itemDef.name = "@gre@Cleric gloves";
				itemdefedit = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1100;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64175;
				itemDef.maleEquip1 = 64176;
				itemDef.femaleEquip1 = 64176;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;

				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14050:
				itemDef.name = "Godly helm";

				itemDef.modelID = 65385;
				itemDef.maleEquip1 = 65386;
				itemDef.femaleEquip1 = 65386;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{91};
				break;
			case 14051:
				itemDef.name = "Godly body";
				itemDef.modelID = 65387;
				itemDef.maleEquip1 = 65388;
				itemDef.femaleEquip1 = 65388;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{91};

				break;
			case 14052:
				itemDef.name = "Godly legs";

				itemDef.modelID = 65389;
				itemDef.maleEquip1 = 65390;
				itemDef.femaleEquip1 = 65390;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
//	itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{91};

				break;
			case 14053:
				itemDef.name = "Godly boots";
				itemdefedit = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64177;
				itemDef.maleEquip1 = 64178;
				itemDef.femaleEquip1 = 64178;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				//	itemDef.rdc2 = 47333;
				break;
			case 14054:
				itemDef.name = "Godly shield";
				itemdefedit = ItemDefinition.get(12930);
				itemDef.modelID = itemdefedit.modelID;
				itemDef.maleEquip1 = itemdefedit.maleEquip1;
				itemDef.femaleEquip1 = itemdefedit.femaleEquip1;

				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1600;
				itemDef.rotationY = itemdefedit.rotationY;

				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14055:
				itemDef.name = "Godly gloves";
				itemdefedit = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1100;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.modelID = 64175;
				itemDef.maleEquip1 = 64176;
				itemDef.femaleEquip1 = 64176;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;

				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14056:
				itemDef.name = "Elite Tarn bow";
				itemDef.modelID = 64358;
				itemDef.maleEquip1 = 64359;
				itemDef.femaleEquip1 = 64359;
				itemdefedit = ItemDefinition.get(9185);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = 1700;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};

				break;
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
			case 9929:
				itemDef.name = "@gre@Cleric Rifle";
				ItemDefinition itemDef2 = ItemDefinition.get(20538);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 65024;
				itemDef.femaleEquip1 = 65025;
				itemDef.maleEquip1 = 65025;
				itemDef.modelOffsetX = 1;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = 30;
				itemDef.modelZoom = 2100;
				itemDef.rotationY = 200;
				itemDef.rotationX = itemDef2.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				break;
			case 26:
				itemDef.name = "Sassy Aura";
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};

				break;
			case 18768:
				itemDef.name = "Dragonball Saga box";
				itemDef.rdc2 = 2233311;
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
			case 8410:
				itemDef.name = "Elite Sword";
				itemdefedit1 = ItemDefinition.get(4587);
				itemDef.modelID = 64487;
				itemDef.femaleEquip1 = 64488;
				itemDef.maleEquip1 = 64488;
				itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit1.modelOffsetY;
				itemDef.modelZoom = itemdefedit1.modelZoom;
				itemDef.rotationY = itemdefedit1.rotationY;
				itemDef.rotationX = itemdefedit1.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{60};
				break;
			case 8411:
				itemDef.name = "Elite Bow";
				itemdefedit1 = ItemDefinition.get(859);
				itemDef.modelID = 64485;
				itemDef.femaleEquip1 = 64486;
				itemDef.maleEquip1 = 64486;
				itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit1.modelOffsetY;
				itemDef.modelZoom = itemdefedit1.modelZoom;
				itemDef.rotationY = itemdefedit1.rotationY;
				itemDef.rotationX = itemdefedit1.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				//	itemDef.rdc2  = 20483;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{59};
				break;
			case 8412:
				itemDef.name = "Elite Staff";
				itemdefedit1 = ItemDefinition.get(4587);
				itemDef.modelID = 64489;
				itemDef.femaleEquip1 = 64490;
				itemDef.maleEquip1 = 64490;
				itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit1.modelOffsetY;
				itemDef.modelZoom = itemdefedit1.modelZoom;
				itemDef.rotationY = itemdefedit1.rotationY;
				itemDef.rotationX = itemdefedit1.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{58};
				break;
			case 3737:
				itemDef.name = "Scarlet Sword";
				itemdefedit1 = ItemDefinition.get(4587);
				itemDef.modelID = 64395;
				itemDef.femaleEquip1 = 64396;
				itemDef.maleEquip1 = 64396;
				itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit1.modelOffsetY;
				itemDef.modelZoom = itemdefedit1.modelZoom;
				itemDef.rotationY = itemdefedit1.rotationY;
				itemDef.rotationX = itemdefedit1.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				

				break;
			case 3738:
				itemDef.name = "Herbal Bow";
				itemdefedit1 = ItemDefinition.get(859);
				itemDef.modelID = 64397;
				itemDef.femaleEquip1 = 64398;
				itemDef.maleEquip1 = 64398;
				itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit1.modelOffsetY;
				itemDef.modelZoom = itemdefedit1.modelZoom;
				itemDef.rotationY = itemdefedit1.rotationY;
				itemDef.rotationX = itemdefedit1.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				

				//	itemDef.rdc2  = 20483;
				break;
			case 3739:
				itemDef.name = "Azure Staff";
				itemdefedit1 = ItemDefinition.get(4675);
				itemDef.modelID = 64399;
				itemDef.femaleEquip1 = 64400;
				itemDef.maleEquip1 = 64400;
				itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit1.modelOffsetY;
				itemDef.modelZoom = itemdefedit1.modelZoom;
				itemDef.rotationY = itemdefedit1.rotationY;
				itemDef.rotationX = itemdefedit1.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				

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
				ItemDefinition SoulCape = ItemDefinition.get(19709);
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
			case 3740:
				itemDef.name = "Yogi helm";
				itemDef.modelID = 64401;
				itemDef.maleEquip1 = 64402;
				itemDef.femaleEquip1 = 64402;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 23453;
				break;
			case 3741:
				itemDef.name = "Yogi body";
				itemDef.modelID = 64403;
				itemDef.maleEquip1 = 64404;
				itemDef.femaleEquip1 = 64404;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 23453;
				break;
			case 3742:
				itemDef.name = "Yogi legs";
				itemDef.modelID = 64405;
				itemDef.maleEquip1 = 64406;
				itemDef.femaleEquip1 = 64406;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 23453;
				break;
			case 3743:
				itemDef.name = "Yogi Sword";
				itemdefedit1 = ItemDefinition.get(4587);
				itemDef.modelID = 64395;
				itemDef.femaleEquip1 = 64396;
				itemDef.maleEquip1 = 64396;
				itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit1.modelOffsetY;
				itemDef.modelZoom = itemdefedit1.modelZoom;
				itemDef.rotationY = itemdefedit1.rotationY;
				itemDef.rotationX = itemdefedit1.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.rdc2 = 23453;
				break;
			case 3744:
				itemDef.name = "Yogi Bow";
				itemdefedit1 = ItemDefinition.get(859);
				itemDef.modelID = 64397;
				itemDef.femaleEquip1 = 64398;
				itemDef.maleEquip1 = 64398;
				itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit1.modelOffsetY;
				itemDef.modelZoom = itemdefedit1.modelZoom;
				itemDef.rotationY = itemdefedit1.rotationY;
				itemDef.rotationX = itemdefedit1.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.rdc2 = 23453;
				break;
			case 3745:
				itemDef.name = "Yogi Staff";
				itemdefedit1 = ItemDefinition.get(4675);
				itemDef.modelID = 64399;
				itemDef.femaleEquip1 = 64400;
				itemDef.maleEquip1 = 64400;
				itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit1.modelOffsetY;
				itemDef.modelZoom = itemdefedit1.modelZoom;
				itemDef.rotationY = itemdefedit1.rotationY;
				itemDef.rotationX = itemdefedit1.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.rdc2 = 23453;
				break;
			case 3720:
				itemDef.name = "Scarlet helm";
				itemDef.modelID = 64407;
				itemDef.maleEquip1 = 64408;
				itemDef.femaleEquip1 = 64408;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				//itemDef.rdc =1931;
				break;
			case 3721:
				itemDef.name = "Scarlet body";
				itemDef.modelID = 64409;
				itemDef.maleEquip1 = 64410;
				itemDef.femaleEquip1 = 64410;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				//itemDef.rdc2= 1931;
				

				break;
			case 3722:
				itemDef.name = "Scarlet legs";
				itemDef.modelID = 64411;
				itemDef.maleEquip1 = 64412;
				itemDef.femaleEquip1 = 64412;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				break;
			case 3726:
				itemDef.name = "Azure helm";
				itemDef.modelID = 64419;
				itemDef.maleEquip1 = 64420;
				itemDef.femaleEquip1 = 64420;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 3728:
				itemDef.name = "Azure body";
				itemDef.modelID = 64421;
				itemDef.maleEquip1 = 64422;
				itemDef.femaleEquip1 = 64422;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 3730:
				itemDef.name = "Azure legs";
				itemDef.modelID = 64423;
				itemDef.maleEquip1 = 64424;
				itemDef.femaleEquip1 = 64424;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				break;
			case 3723:
				itemDef.name = "Herbal helm";
				itemDef.modelID = 64413;
				itemDef.maleEquip1 = 64414;
				itemDef.femaleEquip1 = 64414;
				itemdefedit = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				break;
			case 3724:
				itemDef.name = "Herbal body";
				itemDef.modelID = 64415;
				itemDef.maleEquip1 = 64416;
				itemDef.femaleEquip1 = 64416;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 3725:
				itemDef.name = "Herbal legs";
				itemDef.modelID = 64417;
				itemDef.maleEquip1 = 64418;
				itemDef.femaleEquip1 = 64418;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
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
			case 11318:
				ItemDefinition adminsraichu = ItemDefinition.get(12479);
				itemDef.modelID = 64448;
				itemDef.modelOffsetX = adminsraichu.modelOffsetX;
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = adminsraichu.modelOffsetY;
				itemDef.modelZoom = 2000;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "@yel@Raichu pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
				//itemDef.rdc2 = 664466;
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
				//itemDef.modelOffsetX = itemdefedit1.modelOffsetX;
				itemDef.modelOffsetY = zorbak2.modelOffsetY;
				itemDef.modelZoom = 6500;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "Youtube JR Pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
				//itemDef.rdc2 = 664466;
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
			case 5068:
				itemDef.name = "Joker helm";
				itemDef.modelID = 64497;
				itemDef.maleEquip1 = 64498;
				itemDef.femaleEquip1 = 64498;
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

			case 5069:
				itemDef.name = "Joker body";
				itemDef.modelID = 64499;
				itemDef.maleEquip1 = 64500;
				itemDef.femaleEquip1 = 64500;
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

			case 5070:
				itemDef.name = "Joker legs";
				itemDef.modelID = 64501;
				itemDef.maleEquip1 = 64502;
				itemDef.femaleEquip1 = 64502;
				itemdefedit = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				
				break;


			case 5071:
				itemDef.name = "Joker gloves";
				itemDef.modelID = 64503;
				itemDef.maleEquip1 = 64504;
				itemDef.femaleEquip1 = 64504;
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
				
				break;
			case 5072:
				itemDef.name = "Joker boots";
				itemDef.modelID = 64505;
				itemDef.maleEquip1 = 64505;
				itemDef.femaleEquip1 = 64505;
				itemdefedit = ItemDefinition.get(11732);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				

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
			case 8828:
				itemDef.name = "Charybde helm";
				itemDef.modelID = 96452;
				itemDef.maleEquip1 = 96453;
				itemDef.femaleEquip1 = 96453;
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
			case 8829:
				itemDef.name = "Charybde body";
				itemDef.modelID = 96454;
				itemDef.maleEquip1 = 96455;
				itemDef.femaleEquip1 = 96455;
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

			case 8833:
				itemDef.name = "Charybde legs";
				itemDef.modelID = 96456;
				itemDef.maleEquip1 = 96457;
				itemDef.femaleEquip1 = 96457;
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
			case 15645:
				itemDef.name = "Solar helm";
				itemDef.modelID = 99922;
				itemDef.maleEquip1 = 99923;
				itemDef.femaleEquip1 = 99923;
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
			case 15646:
				itemDef.name = "Solar body";
				itemDef.modelID = 99920;
				itemDef.maleEquip1 = 99921;
				itemDef.femaleEquip1 = 99921;
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

			case 15647:
				itemDef.name = "Solar legs";
				itemDef.modelID = 99924;
				itemDef.maleEquip1 = 99925;
				itemDef.femaleEquip1 = 99925;
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


			case 14450:
				itemDef.name = "Gogeta Legs";
				itemDef.modelID = 140756;
				itemDef.maleEquip1 = 140755;
				itemDef.femaleEquip1 = 140755;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14452:
				itemDef.name = "Gogeta Head";
				itemDef.modelID = 140758;
				itemDef.maleEquip1 = 140757;
				itemDef.femaleEquip1 = 140757;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14454:
				itemDef.name = "Gogeta Gloves";
				itemDef.modelID = 140760;
				itemDef.maleEquip1 = 140759;
				itemDef.femaleEquip1 = 140759;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14456:
				itemDef.name = "Gogeta Boots";
				itemDef.modelID = 140762;
				itemDef.maleEquip1 = 140761;
				itemDef.femaleEquip1 = 140761;
				itemdefedit = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefedit.modelOffsetX;
				itemDef.modelOffsetY = itemdefedit.modelOffsetY;
				itemDef.modelZoom = itemdefedit.modelZoom;
				itemDef.rotationY = itemdefedit.rotationY;
				itemDef.rotationX = itemdefedit.rotationX;
				itemDef.actions = new String[]{null, "Wear", "Dissolve", null, "Drop"};
				itemDef.stackable = false;
				break;
			case 14458:
				itemDef.name = "Gogeta Body";
				itemDef.modelID = 140764;
				itemDef.maleEquip1 = 140763;
				itemDef.femaleEquip1 = 140763;
				itemdefedit = ItemDefinition.get(4894);
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

			case 14487:
				itemDef.name = "@red@Imperial Box";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				itemdefedit = ItemDefinition.get(6199);
				itemDef.modelOffsetX = 2;
				itemDef.modelOffsetY = 1;
				itemDef.modelZoom = 850;
				itemDef.rotationY = 100;
				itemDef.rotationX = 90;
				itemDef.modelID = 15178;
				
				//itemDef.rdc2 = 988331;
				itemDef.scaleY *= 0.50;
				itemDef.scaleX *= 0.50;
				itemDef.scaleZ *= 0.50;
				break;
			case 14488:
				itemDef.name = "@cya@Blurite Box";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				itemdefedit = ItemDefinition.get(6199);
				itemDef.modelOffsetX = 2;
				itemDef.modelOffsetY = 1;
				itemDef.modelZoom = 850;
				itemDef.rotationY = 100;
				itemDef.rotationX = 90;
				itemDef.modelID = 15179;
				
				//itemDef.rdc2 = 988331;
				itemDef.scaleY *= 0.50;
				itemDef.scaleX *= 0.50;
				itemDef.scaleZ *= 0.50;
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

		}
		return itemDef;
	}

	public static ItemDefinition itemDef(int id, ItemDefinition itemDef) {
		// TODO Auto-generated method stub
		return null;
	}

}
