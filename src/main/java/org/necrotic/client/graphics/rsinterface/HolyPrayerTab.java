package org.necrotic.client.graphics.rsinterface;

import org.necrotic.client.*;

public class HolyPrayerTab extends RSInterface {

   // public static TextDrawingArea tda[];

    public static void Holy_Prayer() {
        RSInterface Interface = addTabInterface(29753);
        int index = 0;
        addSpriteLoader(688, 871);
        addSpriteLoader(689, 872);
        addText(19025, "  Stat Adjustments", 0xFFCC00, false, true, 52, CustomInterfaces.tda, 0);
        addText(690, "690", 0xFF981F, false, false, -1, CustomInterfaces.tda, 0);
        addText(691, "691", 0xFF981F, false, false, -1, CustomInterfaces.tda, 0);
        addText(692, "692", 0xFF981F, false, false, -1, CustomInterfaces.tda, 0);
        addText(693, "693", 0xFF981F, false, false, -1, CustomInterfaces.tda, 0);
        addText(694, "694", 0xFF981F, false, false, -1, CustomInterfaces.tda, 0);
       // addText(687, "99/99", 0xFF981F, false, false, -1, CustomInterfaces.tda, 1);
        //addSpriteLoader(52853, 870);//prayer icon
        
      
        String
                prayer1 = "Warlock",
                prayer2 = "Knight",
                prayer3 = "Marksman",
                prayer4 = "Prosperous",
                prayer5 = "Sovereignty",
                prayer6 = "Trinity";
        String
                Gods_Will_desc = "Level 99\n" + prayer1 + "\nGrants 20% bonus in Magic \nand 10% bonus in Defence", //Warlock
                Desolation_desc = "Level 99\n" + prayer2 + "\nGrants 20% bonus is Attack \nand 10% bonus in Defence", //Knight
                Fortitude_desc = "Level 99\n" + prayer3 + "\nGrants 20% bonus is Range \n and 10% bonus in Defence", //MArksman
                Gnomes_Greed_desc = "Level 110\n" + prayer4 + "\nIncreases Drop Rate and \nDouble Drop Rate by 10%", //Prosperous
                Soul_Leech_desc = "Level 115\n" + prayer5 + "\nSoul Split Effect and \n10% bonus in Magic, Attack \nand Range", //Sovereignty
                Torment_desc = "Level 118\n" + prayer6 + "\nGrants 25% bonus in Magic, \nAttack and Range. \nAlso grants 25% Drop Rate Bonus"; //Trinity
        
        addHolyWithTooltip(42503, 0, 690, 75, 1601, prayer1, 42584);
        addHolyWithTooltip(42505, 0, 691, 80, 1602, prayer2, 42544);
        addHolyWithTooltip(42507, 0, 692, 85, 1603, prayer3, 42546);
        addHolyWithTooltip(42509, 0, 693, 90, 1604, prayer4, 42548);
        addHolyWithTooltip(42511, 0, 694, 94, 1605, prayer5, 42550);
        addHolyWithTooltip(42513, 0, 695, 99, 1606, prayer6, 42552);//torment

        addTooltip(42584, Gods_Will_desc);
        addTooltip(42544, Desolation_desc);
        addTooltip(42546, Fortitude_desc);
        addTooltip(42548, Gnomes_Greed_desc);
        addTooltip(42550, Soul_Leech_desc);
        addTooltip(42552, Torment_desc);
        
        setChildren(27, Interface);

        //Misc sprites and Text
        setBounds(689, 0, 217, index, Interface);
        index++;
        //setBounds(687, 85, 241, index, Interface);
        //index++;
        setBounds(688, 0, 170, index, Interface);
        index++;
        
        setBounds(690, 2, 200, index, Interface);
        index++;
        setBounds(691, 41, 200, index, Interface);
        index++;
        setBounds(692, 79, 200, index, Interface);
        index++;
        setBounds(693, 117, 200, index, Interface);
        index++;
        setBounds(694, 160, 200, index, Interface);
        index++;
		
        setBounds(19025, 47, 218, index, Interface);//"stat adjustment" text
        index++;
        setBounds(52853, 65, 241, index, Interface);//prayer icon
        index++;
        
        
        
        setBounds(42513, 2, 45, index, Interface);//Calls ID 42552
        index++;
        setBounds(42514, 4, 47, index, Interface);//icon -
        index++;
        setBounds(42552, 10, 80, index, Interface);
        index++;
        
        setBounds(42511, 150, 5, index, Interface);//Calls ID 42550
        index++;
        setBounds(42512, 152, 7, index, Interface);//icon - Coup de Grace
        index++;
        setBounds(42550, 20, 40, index, Interface);
        index++;
        
        setBounds(42509, 113, 5, index, Interface);
        index++;
        setBounds(42510, 115, 7, index, Interface);//icon - Gnomes Greed
        index++;
        setBounds(42548, 20, 40, index, Interface);
        index++;
        
        setBounds(42507, 76, 5, index, Interface);
        index++;
        setBounds(42508, 78, 7, index, Interface);//icon - Fortitude
        index++;
        setBounds(42546, 20, 40, index, Interface);
        index++;
        
        setBounds(42505, 40, 5, index, Interface);
        index++;
        setBounds(42506, 42, 7, index, Interface);//icon Desolation
        index++;
        setBounds(42544, 20, 40, index, Interface);
        index++; 
        
        setBounds(42503, 2, 5, index, Interface);
        index++;
        setBounds(42504, 4, 7, index, Interface);//icon - God's Will
        index++;
        setBounds(42584, 10, 40, index, Interface);
        index++;
        
       
       
    
       
        
        
       
        
     
        
    }

}