package org.necrotic.client.graphics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public enum AnimatedRankName {
    OWNER(8, new int[] {
            0x050000, 0x0a0000, 0x0f0000, 0x140000, 0x1a0000, 0x1f0000, 0x240000, 0x290000, 0x2e0000, 0x330000, 0x380000, 0x3d0000, 0x420000, 0x470000, 0x4d0000, 0x520000, 0x570000, 0x5c0000,
            0x610000, 0x660000, 0x6b0000, 0x700000, 0x750000, 0x7a0000, 0x800000, 0x850000, 0x8a0000, 0x8f0000, 0x940000, 0x990000, 0x9e0000, 0xa30000, 0xa80000, 0xad0000, 0xb30000, 0xb80000,
            0xbd0000, 0xc20000, 0xc70000, 0xcc0000, 0xd10000, 0xd60000, 0xdb0000, 0xe00000, 0xe60000, 0xeb0000, 0xf00000, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000,
            0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00,
            0xf50000,
            0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000, 0xffbe00, 0xf50000,
            0xffbe00, 0xf50000, 0xf00000, 0xeb0000, 0xe60000, 0xe00000, 0xdb0000, 0xd60000, 0xd10000, 0xcc0000, 0xc70000, 0xc20000, 0xbd0000, 0xb80000, 0xb30000, 0xad0000, 0xa80000, 0xa30000,
            0x9e0000, 0x990000, 0x940000, 0x8f0000, 0x8a0000, 0x850000, 0x800000, 0x7a0000, 0x750000, 0x700000, 0x6b0000, 0x660000, 0x610000, 0x5c0000, 0x570000, 0x520000, 0x4d0000, 0x470000,
            0x420000, 0x3d0000, 0x380000, 0x330000, 0x2e0000, 0x290000, 0x240000, 0x1f0000, 0x1a0000, 0x140000, 0x0f0000, 0x0a0000, 0x050000,
    }),

    EMERALD_DONATOR(7, new int[] {
            0x010500, 0x020a00, 0x030f00, 0x041400, 0x051a00, 0x061f00, 0x072400, 0x082900, 0x092e00, 0x0a3300, 0x0b3800, 0x0c3d00, 0x0d4200, 0x0e4700, 0x0f4d00, 0x105200, 0x115700, 0x125c00,
            0x136100, 0x146600, 0x156b00, 0x167000, 0x177500, 0x187a00, 0x198000, 0x1a8500, 0x1b8a00, 0x1c8f00, 0x1d9400, 0x1e9900, 0x1f9e00, 0x20a300, 0x21a800, 0x22ad00, 0x24b800, 0x25bd00,
            0x26c200, 0x27c700, 0x28cc00, 0x29d100, 0x2ad600, 0x2bdb00, 0x2ce000, 0x2de600, 0x2eeb00, 0x2ff000, 0x30f500, 0x31fa00, 0x32ff00, 0x36ff05, 0x3aff0a, 0x3eff0f, 0x42ff14, 0x46ff1a,
            0x4aff1f, 0x4eff24, 0x52ff29, 0x56ff2e, 0x5aff33, 0x5eff38, 0x62ff3d, 0x66ff42, 0x6aff47, 0x6eff4d, 0x72ff52, 0x76ff57, 0x7aff5c,
            0x7eff61,
            0x7aff5c, 0x76ff57, 0x72ff52, 0x6eff4d, 0x6aff47, 0x66ff42,
            0x62ff3d, 0x5eff38, 0x5aff33, 0x56ff2e, 0x52ff29, 0x4eff24, 0x4aff1f, 0x46ff1a, 0x42ff14, 0x3eff0f, 0x3aff0a, 0x36ff05, 0x32ff00, 0x31fa00, 0x30f500, 0x2ff000, 0x2eeb00, 0x2de600,
            0x2ce000, 0x2bdb00, 0x2ad600, 0x29d100, 0x28cc00, 0x27c700, 0x26c200, 0x25bd00, 0x24b800, 0x22ad00, 0x21a800, 0x20a300, 0x1f9e00, 0x1e9900, 0x1d9400, 0x1c8f00, 0x1b8a00, 0x1a8500,
            0x198000, 0x187a00, 0x177500, 0x167000, 0x156b00, 0x146600, 0x136100, 0x125c00, 0x115700, 0x105200, 0x0f4d00, 0x0e4700, 0x0d4200, 0x0c3d00, 0x0b3800, 0x0a3300, 0x092e00, 0x082900,
            0x072400, 0x061f00, 0x051a00, 0x041400, 0x030f00, 0x020a00, 0x010500
    }),

    SAPPHIRE_DONATOR(6, new int[] {
            0x000405, 0x00080a, 0x000c0f, 0x001014, 0x00141a, 0x00181f, 0x001c24, 0x002029, 0x00242e, 0x002833, 0x002c38, 0x00303d, 0x003442, 0x003847, 0x003c4d, 0x004052, 0x004457, 0x00485c,
            0x004c61, 0x005066, 0x00546b, 0x005870, 0x005c75, 0x00607a, 0x006480, 0x006885, 0x006c8a, 0x00708f, 0x007494, 0x007899, 0x007c9e, 0x0080a3, 0x0084a8, 0x0088ad, 0x008cb3, 0x0090b8,
            0x0094bd, 0x0098c2, 0x009cc7, 0x00a0cc, 0x00a4d1, 0x00a8d6, 0x00acdb, 0x00b0e0, 0x00b4e6, 0x00b8eb, 0x00bcf0, 0x00c0f5, 0x00c4fa, 0x00c8ff, 0x05c9ff, 0x0acaff, 0x0fcbff, 0x14ccff,
            0x1acdff, 0x1fceff, 0x24cfff, 0x29d0ff, 0x2ed1ff, 0x33d2ff, 0x38d3ff, 0x3dd4ff, 0x42d5ff, 0x47d6ff, 0x4dd7ff, 0x52d8ff, 0x57d9ff,
            0x5cdaff,
            0x57d9ff, 0x52d8ff, 0x4dd7ff, 0x47d6ff, 0x42d5ff, 0x3dd4ff,
            0x38d3ff, 0x33d2ff, 0x2ed1ff, 0x29d0ff, 0x24cfff, 0x1fceff, 0x1acdff, 0x14ccff, 0x0fcbff, 0x0acaff, 0x05c9ff, 0x00c8ff, 0x00c4fa, 0x00c0f5, 0x00bcf0, 0x00b8eb, 0x00b4e6, 0x00b0e0,
            0x00acdb, 0x00a8d6, 0x00a4d1, 0x00a0cc, 0x009cc7, 0x0098c2, 0x0094bd, 0x0090b8, 0x008cb3, 0x0088ad, 0x0084a8, 0x0080a3, 0x007c9e, 0x007899, 0x007494, 0x00708f, 0x006c8a, 0x006885,
            0x006480, 0x00607a, 0x005c75, 0x005870, 0x00546b, 0x005066, 0x004c61, 0x00485c, 0x004457, 0x004052, 0x003c4d, 0x003847, 0x003442, 0x00303d, 0x002c38, 0x002833, 0x00242e, 0x002029,
            0x001c24, 0x00181f, 0x00141a, 0x001014, 0x000c0f, 0x00080a, 0x000405
    }),

    RUBY_DONATOR(5, new int[] {
            0x050001, 0x0a0002, 0x0f0003, 0x140004, 0x1a0005, 0x1f0006, 0x240007, 0x290008, 0x2e0009, 0x33000a, 0x38000b, 0x3d000c, 0x42000d, 0x47000e, 0x4d000f, 0x520010, 0x570011, 0x5c0012,
            0x610013, 0x660014, 0x6b0015, 0x700016, 0x750017, 0x7a0018, 0x800019, 0x85001a, 0x8a001b, 0x8f001c, 0x94001d, 0x99001e, 0x9e001f, 0xa30020, 0xa80021, 0xad0022, 0xb30023, 0xb80024,
            0xbd0025, 0xc20026, 0xc70027, 0xcc0028, 0xd10029, 0xd6002a, 0xdb002b, 0xe0002c, 0xe6002d, 0xeb002e, 0xf0002f, 0xf50030, 0xfa0031, 0xff0032, 0xff0536, 0xff0a3a, 0xff0f3e, 0xff1442,
            0xff1a46, 0xff1f4a, 0xff244e, 0xff2952, 0xff2e56, 0xff335a, 0xff385e, 0xff3d62, 0xff4266, 0xff476a, 0xff4d6e, 0xff5272, 0xff5776,
            0xff5c7a,
            0xff5776, 0xff5272, 0xff4d6e, 0xff476a, 0xff4266, 0xff3d62, 0xff385e, 0xff335a, 0xff2e56, 0xff2952, 0xff244e, 0xff1f4a, 0xff1a46, 0xff1442, 0xff0f3e, 0xff0a3a, 0xff0536, 0xff0032,
            0xfa0031, 0xf50030, 0xf0002f, 0xeb002e, 0xe6002d, 0xe0002c, 0xdb002b, 0xd6002a, 0xd10029, 0xcc0028, 0xc70027, 0xc20026, 0xbd0025, 0xb80024, 0xb30023, 0xad0022, 0xa80021, 0xa30020,
            0x9e001f, 0x99001e, 0x94001d, 0x8f001c, 0x8a001b, 0x85001a, 0x800019, 0x7a0018, 0x750017, 0x700016, 0x6b0015, 0x660014, 0x610013, 0x5c0012, 0x570011, 0x520010, 0x4d000f, 0x47000e,
            0x42000d, 0x3d000c, 0x38000b, 0x33000a, 0x2e0009, 0x290008, 0x240007, 0x1f0006, 0x1a0005, 0x140004, 0x0f0003, 0x0a0002, 0x050001,
    }),

    DIAMOND_DONATOR(4, new int[] {
            0x010304, 0x020608, 0x03090c, 0x040c10, 0x050f14, 0x061218, 0x07151d, 0x081821, 0x091b25, 0x0a1e29, 0x0b212d, 0x0c2431, 0x0d2735, 0x0e2a39, 0x0f2d3d, 0x103041, 0x113346, 0x12364a,
            0x13394e, 0x143c52, 0x153f56, 0x16425a, 0x17455e, 0x184862, 0x194b66, 0x1a4e6a, 0x1b516f, 0x1c5473, 0x1d5777, 0x1e5a7b, 0x1f5d7f, 0x206083, 0x216387, 0x22668b, 0x23698f, 0x246c93,
            0x256f98, 0x26729c, 0x2775a0, 0x2878a4, 0x297ba8, 0x2a7eac, 0x2b81b0, 0x2c84b4, 0x2d87b8, 0x2e8abc, 0x2f8dc1, 0x3090c5, 0x3193c9, 0x3296cd, 0x3698ce, 0x3a9acf, 0x3e9cd0, 0x429ed1,
            0x46a0d2, 0x4ba2d3, 0x4fa4d4, 0x53a6d5, 0x57a8d6, 0x5baad7, 0x5facd8, 0x63aed9, 0x67b0da, 0x6bb2db, 0x6fb4dc, 0x74b6dd, 0x78b8de,
            0x7cbadf,
            0x78b8de, 0x74b6dd, 0x6fb4dc, 0x6bb2db, 0x67b0da, 0x63aed9, 0x5facd8, 0x5baad7, 0x57a8d6, 0x53a6d5, 0x4fa4d4, 0x4ba2d3, 0x46a0d2, 0x429ed1, 0x3e9cd0, 0x3a9acf, 0x3698ce, 0x3296cd,
            0x3193c9, 0x3090c5, 0x2f8dc1, 0x2e8abc, 0x2d87b8, 0x2c84b4, 0x2b81b0, 0x2a7eac, 0x297ba8, 0x2878a4, 0x2775a0, 0x26729c, 0x256f98, 0x246c93, 0x23698f, 0x22668b, 0x216387, 0x206083,
            0x1f5d7f, 0x1e5a7b, 0x1d5777, 0x1c5473, 0x1b516f, 0x1a4e6a, 0x194b66, 0x184862, 0x17455e, 0x16425a, 0x153f56, 0x143c52, 0x13394e, 0x12364a, 0x113346, 0x103041, 0x0f2d3d, 0x0e2a39,
            0x0d2735, 0x0c2431, 0x0b212d, 0x0a1e29, 0x091b25, 0x081821, 0x07151d, 0x061218, 0x050f14, 0x040c10, 0x03090c, 0x020608, 0x010304,
    }),

    ONYX_DONATOR(3, new int[] {
            0x030303, 0x050505, 0x080808, 0x0a0a0a, 0x0d0d0d, 0x0f0f0f, 0x121212, 0x141414, 0x171717, 0x1a1a1a, 0x1c1c1c, 0x1f1f1f, 0x212121, 0x242424, 0x262626, 0x292929, 0x2b2b2b, 0x2e2e2e,
            0x303030, 0x333333, 0x363636, 0x383838, 0x3b3b3b, 0x3d3d3d, 0x404040, 0x424242, 0x454545, 0x474747, 0x4a4a4a, 0x4d4d4d, 0x4f4f4f, 0x525252, 0x545454, 0x575757, 0x595959, 0x5c5c5c,
            0x5e5e5e, 0x616161, 0x636363, 0x666666, 0x696969, 0x6b6b6b, 0x6e6e6e, 0x707070, 0x737373, 0x757575, 0x787878, 0x7a7a7a, 0x7d7d7d, 0x808080, 0x828282, 0x858585, 0x878787, 0x8a8a8a,
            0x8c8c8c, 0x8f8f8f, 0x919191, 0x949494, 0x969696, 0x999999, 0x9c9c9c, 0x9e9e9e, 0xa1a1a1, 0xa3a3a3, 0xa6a6a6, 0xa8a8a8, 0xababab, 0xadadad, 0xb0b0b0, 0xb3b3b3, 0xb5b5b5, 0xb8b8b8,
            0xbababa, 0xbdbdbd, 0xbfbfbf, 0xc2c2c2, 0xc4c4c4, 0xc7c7c7, 0xc9c9c9, 0xcccccc, 0xcfcfcf, 0xd1d1d1, 0xd4d4d4, 0xd6d6d6, 0xd9d9d9, 0xdbdbdb, 0xdedede, 0xe0e0e0, 0xe3e3e3, 0xe6e6e6,
            0xe8e8e8, 0xebebeb, 0xededed, 0xf0f0f0, 0xf2f2f2, 0xf5f5f5, 0xf7f7f7,
            0xfafafa,
            0xf7f7f7, 0xf5f5f5, 0xf2f2f2, 0xf0f0f0, 0xededed, 0xebebeb, 0xe8e8e8, 0xe6e6e6, 0xe3e3e3, 0xe0e0e0, 0xdedede, 0xdbdbdb, 0xd9d9d9, 0xd6d6d6, 0xd4d4d4, 0xd1d1d1, 0xcfcfcf, 0xcccccc,
            0xc9c9c9, 0xc7c7c7, 0xc4c4c4, 0xc2c2c2, 0xbfbfbf, 0xbdbdbd, 0xbababa, 0xb8b8b8, 0xb5b5b5, 0xb3b3b3, 0xb0b0b0, 0xadadad, 0xababab, 0xa8a8a8, 0xa6a6a6, 0xa3a3a3, 0xa1a1a1, 0x9e9e9e,
            0x9c9c9c, 0x999999, 0x969696, 0x949494, 0x919191, 0x8f8f8f, 0x8c8c8c, 0x8a8a8a, 0x878787, 0x858585, 0x828282, 0x808080, 0x7d7d7d, 0x7a7a7a, 0x787878, 0x757575, 0x737373, 0x707070,
            0x6e6e6e, 0x6b6b6b, 0x696969, 0x666666, 0x636363, 0x616161, 0x5e5e5e, 0x5c5c5c, 0x595959, 0x575757, 0x545454, 0x525252, 0x4f4f4f, 0x4d4d4d, 0x4a4a4a, 0x474747, 0x454545, 0x424242,
            0x404040, 0x3d3d3d, 0x3b3b3b, 0x383838, 0x363636, 0x333333, 0x303030, 0x2e2e2e, 0x2b2b2b, 0x292929, 0x262626, 0x242424, 0x212121, 0x1f1f1f, 0x1c1c1c, 0x1a1a1a, 0x171717, 0x141414,
            0x121212, 0x0f0f0f, 0x0d0d0d, 0x0a0a0a, 0x080808, 0x050505, 0x030303 }),

    ZENYTE_DONATOR(2, new int[] {
            0x050300, 0x0a0600, 0x0f0900, 0x140c00, 0x1a0f00, 0x1f1200, 0x241500, 0x291800, 0x2e1b00, 0x331e00, 0x382100, 0x3d2400, 0x422700, 0x472a00, 0x4d2d00, 0x523000, 0x573300, 0x5c3600,
            0x613900, 0x663c00, 0x6b3f00, 0x704200, 0x754500, 0x7a4800, 0x804b00, 0x854e00, 0x8a5100, 0x8f5400, 0x945700, 0x995a00, 0x9e5d00, 0xa36000, 0xa86300, 0xad6600, 0xb36900, 0xb86c00,
            0xbd6f00, 0xc27200, 0xc77500, 0xcc7800, 0xd17b00, 0xd67e00, 0xdb8100, 0xe08400, 0xe68700, 0xeb8a00, 0xf08d00, 0xf59000, 0xfa9300, 0xff9600, 0xff9805, 0xff9a0a, 0xff9c0f, 0xff9e14,
            0xffa01a, 0xffa21f, 0xffa424, 0xffa629, 0xffa82e, 0xffaa33, 0xffac38, 0xffae3d, 0xffb042, 0xffb247, 0xffb44d, 0xffb652, 0xffb857,
            0xffba5c,
            0xffb857, 0xffb652, 0xffb44d, 0xffb247, 0xffb042,
            0xffae3d, 0xffac38, 0xffaa33, 0xffa82e, 0xffa629, 0xffa424, 0xffa21f, 0xffa01a, 0xff9e14, 0xff9c0f, 0xff9a0a, 0xff9805, 0xff9600, 0xfa9300, 0xf59000, 0xf08d00, 0xeb8a00, 0xe68700,
            0xe08400, 0xdb8100, 0xd67e00, 0xd17b00, 0xcc7800, 0xc77500, 0xc27200, 0xbd6f00, 0xb86c00, 0xb36900, 0xad6600, 0xa86300, 0xa36000, 0x9e5d00, 0x995a00, 0x945700, 0x8f5400, 0x8a5100,
            0x854e00, 0x804b00, 0x7a4800, 0x754500, 0x704200, 0x6b3f00, 0x663c00, 0x613900, 0x5c3600, 0x573300, 0x523000, 0x4d2d00, 0x472a00, 0x422700, 0x3d2400, 0x382100, 0x331e00, 0x2e1b00,
            0x291800, 0x241500, 0x1f1200, 0x140c00, 0x0f0900, 0x0a0600, 0x050300
    }),
    ;

    private static final int DELAY = 4;

    private final int[] colors;
    private final int rank;
    private int index;
    private int currentColor;

    AnimatedRankName(int rank, int[] colors) {
        this.rank = rank;
        this.colors = colors;
    }


    public void changeColor() {
        currentColor = colors[index];
        index++;
        if(index==colors.length)
            index=0;
    }

    public static void animateAll() {
        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(() -> ANIMATED_PLAYER_NAMES.forEach(AnimatedRankName::changeColor), 0, DELAY, TimeUnit.MILLISECONDS);
    }

    public static int getCurrentColorByRank(int rank) {
        Optional<AnimatedRankName> possibleAn = ANIMATED_PLAYER_NAMES.stream().filter(animatedPlayerName -> animatedPlayerName.rank == rank).findAny();
        return possibleAn.map(animatedPlayerName -> animatedPlayerName.currentColor).orElse(0);
    }

    private static final List<AnimatedRankName> ANIMATED_PLAYER_NAMES = Arrays.asList(AnimatedRankName.values());

}
