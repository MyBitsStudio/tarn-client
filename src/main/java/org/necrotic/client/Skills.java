package org.necrotic.client;
public final class Skills {

	public static final int SKILL_COUNT = 13;

	public static String[] SKILL_NAMES = {
			"Attack", "Defence", "Strength", "Hitpoints", "Range",
			"Prayer", "Magic", "Crafting", "Mining", "Smithing",
			"Thieving", "Slayer", "Alchemy"
	};

	public static int SKILL_ID(int ids) {
		int[] hoverIds = { 124002, 124010, 124018, 124026, 124034, 124042, 124050, 124058, 124066, 124074, 124081, 124089, 124098 };
		for (int hover = 0; hover < hoverIds.length; hover++) {
			if (hoverIds[hover] == ids) {
				ids = hover;
				return hoverIds[ids];
			}
		}
		return 0;
	}

	public static final boolean[] SKILLS_ENABLED = {
			true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true
	};

	public static final int[][] goalData = new int[SKILL_COUNT][3];
	public static String goalType = "Target Level: ";
	public static int selectedSkillId = -1;

	static {
		for (int i = 0; i < goalData.length; i++) {
			goalData[i][0] = -1;
			goalData[i][1] = -1;
			goalData[i][2] = -1;
		}
	}
}