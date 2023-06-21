package org.necrotic.client.graphics.rsinterface;

import org.necrotic.ColorConstants;
import org.necrotic.client.Client;
import org.necrotic.client.RSInterface;
import org.necrotic.client.Signlink;
import org.necrotic.client.graphics.DrawingArea;
import org.necrotic.client.graphics.gameframe.GameFrame;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

import static org.necrotic.client.graphics.rsinterface.CustomInterfaces.tda;

public class TradingPost extends RSInterface {

    public static void build() {
       // listingPage();
      //  searchPopup();
      //  buyingPage();
       // historyPopup();
    }

    private static void listingPage() {
        RSInterface rsi = addInterface(150250);
        rsi.totalChildren(23);

        addSpriteLoader(150251, 1334);
        rsi.child(0, 150251, 9, 14);

        addRectangle(150252, 77, 0x40372A, true, 474, 232);
        addRectangle(150253, 256, 0x242017, false, 480, 233);
        addRectangle(150254, 256, 0x5A4F3A, false, 478, 231);
        rsi.child(1, 150252, 18, 51);
        rsi.child(2, 150253, 17, 50);
        rsi.child(3, 150254, 18, 51);

        addCloseButton(150255, 150256, 150257);
        rsi.child(4, 150255, 475, 21);
        rsi.child(5, 150256, 475, 21);

        addText(150258, "Trading Post", ColorConstants.RS_ORANGE, true, true, -1, 2);
        rsi.child(6, 150258, 255, 24);

        RSInterface scroll = addInterface(150259);
        scroll.width = 290;
        scroll.height = 231;
        scroll.scrollMax = 577;
        scroll.totalChildren(70);

        int y = 4;
        int x = 2;
        for(int i = 0; i < 10; i++) {
            if(i%2==0 && i != 0) {
                x = 2;
                y += 114;
            }
            hoverButton(150260+i, 1169, 1168, "Select");
            addProgressBar(150280+i, 3385, 100, ProgressBarType.HORIZONTAL_LEFT_RIGHT);
            addItemOnInterface(150290+i, 150259, new String[]{null});
            addText(150300+i, "Abyssal Whip", ColorConstants.RS_ORANGE, false, true, -1, 0);
            addText(150310+i, "0/0", ColorConstants.WHITE, true, true, -1, 0);
            addText(150320+i, "Price:@whi@ 15 (ea)", ColorConstants.RS_ORANGE, false, true, -1, 0);
            addText(150330+i, "=10 total", 0xbfbfbf, false, true, -1, 0);

            scroll.child(i, 150260+i, x,y);
            scroll.child(i+10, 150280+i, x+7,y+80);
            scroll.child(i+20, 150290+i, x+10,y+34);
            scroll.child(i+30, 150300+i, x+47,y+32);
            scroll.child(i+40, 150310+i, x+72,y+83);
            scroll.child(i+50, 150320+i, x+47,y+45);
            scroll.child(i+60, 150330+i, x+47,y+58);

            x += 145;

            RSInterface.interfaceCache[150280+i].progress = 10*i+10;
            RSInterface.interfaceCache[150290+i].inv[0] = 4152;
            RSInterface.interfaceCache[150290+i].invStackSizes[0] = 1;
            RSInterface.interfaceCache[150310+i].message = i + "/10";

        }
        rsi.child(7, 150259, 190, 50);

        hoverButton(150270, 3118, 3119, "View Offers");
        rsi.child(8, 150270, 23, 56);

        addText(150271, "View Offers", ColorConstants.RS_ORANGE, true, true, -1, 2);
        rsi.child(9, 150271, 103, 67);

        addSpriteLoader(150272, 3382);
        rsi.child(10, 150272, 15, 283);
        rsi.child(11, 150272, 200, 283);
        rsi.child(12, 150272, 307, 283);

        addSpriteLoader(150273, 3383);
        rsi.child(13, 150273, 185, 51);
        rsi.child(14, 150273, 185, 91);

        hoverButton(150274, 3114, 3117, "Search");
        rsi.child(15, 150274, 23, 106);

        addText(150275, "Search Item", ColorConstants.RS_ORANGE, true, true, -1, 2);
        rsi.child(16, 150275, 103, 117);

        RSInterface rsi1 = interfaceCache[150430] = new RSInterface();
        rsi1.parentID = 150430;
        rsi1.type = 0;
        rsi1.width = 479;
        rsi1.height = 25;

        RSInterface cb = addInterface(150431);
        cb.type = 289;
        cb.conveyorItems = new int[25][2];

        rsi1.totalChildren(1);
        rsi1.child(0, 150431, 0,0);

        rsi.child(17, 150430, 18, 289);

        for(int i = 0; i < 25; i++) {
            cb.conveyorItems[i][0] = 4151;
            if(i%2==0) {
                cb.conveyorItems[i][1] = 1;
            } else {
                cb.conveyorItems[i][1] = 0;
            }
        }

        hoverButton(150432, 3114, 3117, "Search History");
        rsi.child(18, 150432, 23, 156);

        addText(150433, "Search History", ColorConstants.RS_ORANGE, true, true, -1, 2);
        rsi.child(19, 150433, 103, 167);

        hoverButton(150434, 3386, 3387, "Claim");
        rsi.child(20, 150434, 27, 235);

        addText(150435, "Coffer:", ColorConstants.RS_ORANGE, false, true, -1, 2);
        rsi.child(21, 150435, 27, 215);

        addText(150436, "2147M Tokens", 0xffe93b, true, true, -1, 0);
        rsi.child(22, 150436, 118, 241);

    }

    private static void buyingPage() {
        RSInterface rsi = addInterface(150440);
        rsi.totalChildren(21);

        addSpriteLoader(150441, 1334);
        rsi.child(0, 150441, 9, 14);

        addCloseButton(150442, 150443, 150444);
        rsi.child(1, 150442, 475, 21);
        rsi.child(2, 150443, 475, 21);

        addText(150445, "Trading Post", ColorConstants.RS_ORANGE, true, true, -1, 2);
        rsi.child(3, 150445, 255, 24);

        RSInterface scroll = addInterface(150446);
        scroll.width = 470;
        scroll.height = 220;
        scroll.scrollMax = 2005;

        scroll.totalChildren(400);

        int y = 3;
        for(int i = 0; i < 50; i++) {
            if(i % 2 == 0) {
                addRectangle(150447+i, 256, 0x3a3229, true, 465, 41);
            } else {
                addRectangle(150447+i, 256, 0x40372e, true, 465, 41);
            }
            scroll.child(i, 150447+i, 5, y-3);
            hoverButton(150447+i+50, 2949, 2950, "Buy");
            scroll.child(i+50, 150447+i+50, 380, y+6);
            hoverButton(150447+i+100, 3391, 3392, "History");
            scroll.child(i+100, 150447+i+100, 450, y+11);
            addText(150447+i+150, "Buy", ColorConstants.RS_ORANGE, false, true, -1, 1);
            scroll.child(i+150, 150447+i+150, 403, y+10);
            addItemOnInterface(150447+i+200, 150446, new String[]{null});
            scroll.child(i+200, 150447+i+200, 12, y+3);
            RSInterface.interfaceCache[150447+200+i].inv[0] = 4152;
            RSInterface.interfaceCache[150447+200+i].invStackSizes[0] = i;
            addText(150447+i+250, "Abyssal Whip", ColorConstants.RS_ORANGE, true, true, -1, 1);
            scroll.child(i+250, 150447+i+250, 117, y+9);
            addText(150447+i+300, "249M", 0x03b60b, true, true, -1, 1);
            scroll.child(i+300, 150447+i+300, 230, y+9);
            addText(150447+i+350, "0:0", 0xafafaf, true, true, -1, 1);
            scroll.child(i+350, 150447+i+350, 320, y+9);
            y+=41;
        }

        rsi.child(4, 150446, 10, 65);

        rsi.child(5, 150272, 15, 286);
        rsi.child(6, 150272, 200, 286);
        rsi.child(7, 150272, 306 , 286);

        rsi.child(8, 150272, 15, 64);
        rsi.child(9, 150272, 200, 64);
        rsi.child(10, 150272, 306 , 64);

        hoverButton(150847, 3396, 3397, "Refresh");
        rsi.child(11, 150847, 481 , 48);

        hoverButton(150848, 720, 721, "Search");
        rsi.child(12, 150848, 17 , 290);

        hoverButton(150849, 3398, 3399, "Next page");
        rsi.child(13, 150849, 280 , 295);

        hoverButton(150850, 3400, 3401, "Previous page");
        rsi.child(14, 150850, 230 , 295);

        addText(150851, "1", ColorConstants.RS_ORANGE, true, true, -1, 1);
        rsi.child(15, 150851, 263 , 296);

        addText(150852, "Quantity", ColorConstants.RS_ORANGE, false, true, -1, 0);
        rsi.child(16, 150852, 17 , 51);

        addText(150853, "Name", ColorConstants.RS_ORANGE, false, true, -1, 0);
        rsi.child(17, 150853, 110 , 51);

        addText(150854, "Price", ColorConstants.RS_ORANGE, false, true, -1, 0);
        rsi.child(18, 150854, 226 , 51);

        addText(150855, "Age", ColorConstants.RS_ORANGE, false, true, -1, 0);
        rsi.child(19, 150855, 320 , 51);

        addButton(150856, 3395,  "Back");
        rsi.child(20, 150856, 18 , 24);
    }


    private static void searchPopup() {
        RSInterface popup = addInterface(150276);

        popup.totalChildren(3);

        addRectangle(150277, 77, 0x000000, true, 494, 309);
        popup.child(0, 150277, 9,14);

        addSpriteLoader(150278, 481);
        popup.child(1, 150278, 161,34);

        hoverButton(150279, 714, 715, "Close");
        popup.child(2, 150279, 315,38);
    }

    private static void historyPopup() {
        RSInterface popup = addInterface(150857);

        popup.totalChildren(15);

        popup.child(0, 150277, 9,14);

        addSpriteLoader(150858, 1391);
        popup.child(1, 150858, 79,17);

        hoverButton(150859, 714, 715, "Close");
        popup.child(2, 150859, 420,27);

        addText(150860, "Purchase History", ColorConstants.RS_ORANGE, false, true, -1, 2);
        popup.child(3, 150860, 203,28);

        addHoverableText(150861, "Search", "Search Item", tda, 1, false, false, 60, 0xafafaf, ColorConstants.SNOW_WHITE);
        popup.child(4, 150861, 115,28);

        addSprite(150862, 2793);
        popup.child(5, 150862, 97,28);

        RSInterface scroll = addInterface(150863);
        scroll.width = 335;
        scroll.height = 130;
        scroll.scrollMax = 1000;
        scroll.totalChildren(200);

        popup.child(6, 150863, 86, 69);
        popup.child(7, 150272, 85, 199);
        popup.child(8, 150272, 248, 199);

        popup.child(9, 150272, 85, 67);
        popup.child(10, 150272, 248, 67);

        addText(150864, "Quantity", ColorConstants.RS_ORANGE, false, true, -1, 0);
        popup.child(11, 150864, 90 , 54);

        addText(150865, "Price", ColorConstants.RS_ORANGE, false, true, -1, 0);
        popup.child(12, 150865, 197 , 54);

        addText(150866, "Timestamp", ColorConstants.RS_ORANGE, false, true, -1, 0);
        popup.child(13, 150866, 310 , 54);

        int y = 0;
        for(int i = 0; i < 50; i++) {
            if(i % 2 == 0) {
                addRectangle(150867+i, 256, 0x322c23, true, 465, 35);
            } else {
                addRectangle(150867+i, 256, 0x29241d, true, 465, 35);
            }
            scroll.child(i, 150867+i, 0, y);
            addItemOnInterface(150867+i+50, 150863, new String[]{null});
            scroll.child(i+50, 150867+i+50, 5, y+3);
            RSInterface.interfaceCache[150867+i+50].inv[0] = 4152;
            RSInterface.interfaceCache[150867+i+50].invStackSizes[0] = 1;

            addText(150867+i+100, "249M (ea)", ColorConstants.RS_ORANGE, true, true, -1, 0);
            scroll.child(i+100, 150867+i+100, 124, y+12);
            addText(150867+i+150, "--/--/--", 0xafafaf, true, true, -1, 0);
            scroll.child(i+150, 150867+i+150, 250, y+12);

            y+=35;
        }

        RSInterface searchContainer = addInterface(151067);
        searchContainer.height = 114;
        searchContainer.width = 335;
        searchContainer.scrollMax = 1200;
        searchContainer.totalChildren(150);
        popup.child(14, 151067, 86, 202);

        y = 0;
        for(int i = 0; i < 50; i++) {
            addRectangle(151068+i, 256, 0x000000, false, 355, 35);
            searchContainer.child(i, 151068+i, 0,y+1);
            addItemOnInterface(151068+i+50, 151067, new String[]{null});
            searchContainer.child(i+50, 151068+i+50, 5, y+3);
            RSInterface.interfaceCache[151068+i+50].hideExamine = true;
            RSInterface.interfaceCache[151068+i+50].inv[0] = 4152;
            RSInterface.interfaceCache[151068+i+50].invStackSizes[0] = 1;
            addText(151068+i+100, "Abyssal Whip", ColorConstants.ORANGE, false, true, -1, 1);
            searchContainer.child(i+100, 151068+i+100, 60, y+11);
            y+= 34;
        }
    }

    public static void load() {
        Path path = Paths.get(Signlink.getCacheDirectory() + "tp_items.dat");

        try(FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate((int) fileChannel.size());

            while(fileChannel.read(buffer) > 0) {
                buffer.flip();
                int id = 0;
                while(buffer.hasRemaining()) {
                    int opcode = buffer.get();
                    if(opcode == 0) {
                        id = buffer.get();
                    } else if(opcode == 1) {
                        byte[] bytes = new byte[30];
                        byte b;
                        int i = 0;
                        while((b = buffer.get()) != 10) {
                            bytes[i] = b;
                            i++;
                        }
                        System.out.println("Id: " + id + " name : " + new String(Arrays.copyOfRange(bytes, 0, i), StandardCharsets.UTF_8));
                    }
                }
                buffer.clear();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}