package org.necrotic.client;

import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.applet.AppletContext;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicLookAndFeel;
import net.runelite.api.Constants;
import net.runelite.client.config.Units;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.util.ColorUtil;
import org.necrotic.client.accounts.Account;
import org.necrotic.client.accounts.AccountManager;
import org.necrotic.client.d.a;
import org.necrotic.client.f.b.a;
import org.necrotic.client.f.b.a.a;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: Tarn-Obf.jar:org/necrotic/client/Client.class */
public class Client extends r {
    public static final int[] a;
    public static final int[][] b;
    public static final int[] c;
    private static final int[] cp;
    private static final int[] cq;
    private static final Pattern cr;
    private static final int[] cs;
    private static final long serialVersionUID = -1913853327056220406L;
    public static boolean d;
    private static boolean ct;
    public static int e;
    public static boolean f;
    public static boolean g;
    private static boolean cu;
    public static long h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static int[] m;
    public static int[] n;
    public static int o;
    public static int p;
    public static Client q;
    public static int r;
    public static int s;
    public static org.necrotic.client.e.a.a t;
    public static int u;
    public static int v;
    private static boolean cv;
    public static int w;
    public static boolean z;
    public static boolean A;
    public static String B;
    public static int[] C;
    private static String cw;
    public static String D;
    private static int cx;
    private static int cy;
    public static boolean E;
    public static org.necrotic.client.f.f F;
    static boolean G;
    private static boolean cz;
    private static byte[] cA;
    private static org.necrotic.client.n.b.p cB;
    private static org.necrotic.client.n.b.a cC;
    private static final org.necrotic.client.n.b.p[] cD;
    private static org.necrotic.client.n.b.d cE;
    private static org.necrotic.client.n.b.e cF;
    private static org.necrotic.client.n.b.i cG;
    private static org.necrotic.client.n.a.a cH;
    private static int cI;
    private static int cJ;
    private static int cK;
    private static int cL;
    private static int cM;
    private static int cN;
    private static int cO;
    private static int cP;
    private static int cQ;
    private static int cR;
    private static int cS;
    private static int cT;
    private static int cU;
    private static int cV;
    private static int cW;
    private static int cX;
    private static int cY;
    private static int cZ;
    private static int da;
    private static int db;
    private static int dc;
    private static boolean dd;
    private static boolean de;
    private static final ArrayList<Character> df;
    private static boolean dg;
    private static byte[] dh;
    private static int di;
    private static int dj;
    private static org.necrotic.client.g.a dk;
    private static int dl;
    private static int dm;
    private static aa dn;

    /* renamed from: do  reason: not valid java name */
    private static d[] f0do;
    private int[] dp;
    private String[] dq;
    private boolean[] dr;
    public final int[] I;
    public final int[] J;
    private int[] ds;
    public final int[] K;
    public final m[] L;
    public final int[] M;
    public final int[] N;
    public final int[] O;
    public final org.necrotic.client.f.e[] P;
    private final String[] dB;
    private final boolean dD;
    private final boolean[] dE;
    private final aa dF;
    private final int dG;
    private final int[] dH;
    private final int[] dI;
    private final int[] dJ;
    private final int[] dL;
    private final int[] dM;
    private final int[] dN;
    private final int[] dP;
    private final int[] dQ;
    private final int[] dR;
    private final int[] dS;
    private final int[] dT;
    private final int[] dU;
    private final int[] dV;
    private final int[][][] dW;
    private final String[] dX;
    private final int[] dZ;
    private final long[] ea;
    private final int ec;
    private final int ed;
    private final org.necrotic.client.f.e[] ee;
    private final org.necrotic.client.f.e[] ef;
    private final int[] eg;
    private final int[] eh;
    private final int[] ei;
    private org.necrotic.client.f.e el;
    private org.necrotic.client.f.e em;
    private org.necrotic.client.f.e en;
    private int eq;
    public boolean U;
    private boolean eu;
    private boolean ev;
    private boolean ew;
    public org.necrotic.client.f.e[] V;
    public String W;
    private int ex;
    private int ey;
    public int X;
    private int ez;
    private int eA;
    private int eB;
    public int Y;
    private int eC;
    public int Z;
    private int eD;
    private int eE;
    private int eF;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int[] ae;
    public int[] af;
    public int[] ag;
    public int[] ah;
    public int[] ai;
    public String aj;
    public int ak;
    public int al;
    public int am;
    public org.necrotic.client.f.d ap;
    public String[] aq;
    public String[] ar;
    public String[] as;
    public int[] at;
    public org.necrotic.client.f.a.c au;
    public org.necrotic.client.f.a.c av;
    public int[] aw;
    private String eG;
    public org.necrotic.client.f.e az;
    public int aA;
    public int aB;
    public int aC;
    public int aE;
    public long[] aF;
    public int[] aG;
    public org.necrotic.client.f.d aH;
    public int aJ;
    public int aK;
    private int eH;
    private int eI;
    public static boolean aL;
    public org.necrotic.client.f.d aM;
    public org.necrotic.client.f.e aN;
    public org.necrotic.client.f.e aO;
    public org.necrotic.client.f.e aP;
    public org.necrotic.client.f.e aQ;
    public org.necrotic.client.f.e aR;
    public org.necrotic.client.f.e aS;
    public org.necrotic.client.f.e aT;
    public org.necrotic.client.f.e aU;
    public int[] aV;
    public String[] aW;
    private String[] eJ;
    private int[] eK;
    public int aX;
    public boolean aY;
    public int aZ;
    public boolean ba;
    public org.necrotic.client.f.e bb;
    public int bc;
    public int bd;
    public int be;
    public int bf;
    public org.necrotic.client.f.a.a bg;
    public org.necrotic.client.f.a.a bh;
    public org.necrotic.client.f.a.a bi;
    public org.necrotic.client.f.a.a bj;
    public org.necrotic.client.f.a.c bk;
    public int bm;
    public org.necrotic.client.c.c.a bo;
    private int eL;
    private int eM;
    public int bp;
    public org.necrotic.client.e.a.a[] bq;
    public int br;
    public int[] bs;
    public int bt;
    public String bu;
    public String bv;
    public int bw;
    private int eN;
    public org.necrotic.client.f.a.c bx;
    private int eO;
    private int eP;
    public org.necrotic.client.f.d bA;
    public int bB;
    public int bC;
    private int eR;
    public int bD;
    private int eS;
    public int bE;
    public int bF;
    public int bH;
    public org.necrotic.client.f.b bI;
    private final boolean fc;
    public int bL;
    public String bM;
    private boolean fg;
    private boolean fh;
    private boolean fj;
    private boolean fk;
    private boolean fl;
    private boolean fm;
    private boolean fn;
    private int fr;
    private boolean ft;
    private int fu;
    private String fv;
    private org.necrotic.client.f.e fw;
    private long fy;
    private org.necrotic.client.f.e fz;
    private String fC;
    private int fD;
    private int fE;
    private long fG;
    private boolean fK;
    private boolean fL;
    private boolean fM;
    private boolean fN;
    private boolean fO;
    private boolean fP;
    private boolean fQ;
    private boolean fS;
    private boolean fT;
    private byte[] fU;
    private byte[][] fV;
    private byte[][] fW;
    private org.necrotic.client.n.b[] fX;
    private org.necrotic.client.c.b.a fY;
    private org.necrotic.client.c.b.a fZ;
    private org.necrotic.client.c.b.a ga;
    private org.necrotic.client.f.e gb;
    private org.necrotic.client.f.e gc;
    private int gd;
    private long ge;
    private long gf;
    private int gg;
    private int gh;
    private int gi;
    private int gj;
    private int gk;
    private int gl;
    private int gm;
    private int gn;
    private int go;
    private int gp;
    private int gq;
    private int gr;
    private int gs;
    private int gt;
    private int gu;
    private int gv;
    private int gw;
    private int gx;
    private int gy;
    private int gz;
    private int gA;
    private int gB;
    private int gC;
    private int gD;
    private int gE;
    private int gF;
    private int gG;
    private int gH;
    private int gI;
    private int gJ;
    private int gK;
    private int gL;
    private int gM;
    private int gN;
    private int gO;
    private int gP;
    private int gQ;
    private int gR;
    private int gS;
    private int gT;
    private int gU;
    private int gV;
    private int gW;
    private int gX;
    private int gY;
    private int gZ;
    private int ha;
    private int hb;
    private int hc;
    private int hd;
    private int he;
    private int hf;
    private int hg;
    private int hh;
    private int hi;
    private int hj;
    private int hk;
    private int hl;
    private int hm;
    private int[] hn;
    private int[] hp;
    private int[][] hr;
    private int[][] hs;
    private org.necrotic.client.f.d hu;
    private org.necrotic.client.f.d hv;
    private Socket hw;
    private org.necrotic.client.g.a[] hy;
    private int hz;
    private int hA;
    private int hB;
    private int hC;
    private int[] hD;
    private int[] hE;
    private byte[][][] hF;
    private int hG;
    private int hH;
    private org.necrotic.client.h.a hI;
    private org.necrotic.client.g.b hJ;
    private org.necrotic.client.f.e[] hK;
    private int hL;
    private int hM;
    private int hN;
    private int hO;
    private int hP;
    private int hQ;
    private int hR;
    private int hS;
    private volatile boolean hU;
    private int[] hV;
    private String[] hX;
    private int hY;
    private int[] ia;
    private org.necrotic.client.f.e[] ie;

    /* renamed from: if  reason: not valid java name */
    private org.necrotic.client.f.e[] f1if;
    private int ig;
    private org.necrotic.client.g.a ih;
    private int[][][] ij;
    private int ik;
    private org.necrotic.client.f.d il;
    private boolean im;
    private int io;
    private String[] ip;
    private int iq;
    private int ir;
    private org.necrotic.client.f.a it;
    private org.necrotic.client.f.e iu;
    private org.necrotic.client.f.e iv;
    private org.necrotic.client.f.e[] iw;
    private org.necrotic.client.f.a[] ix;
    private int iy;
    private int[] iz;
    private int[] iA;
    private int[] iB;
    private int iC;
    private int iD;
    private int iE;
    private int iF;
    private String iG;
    private int iH;
    private org.necrotic.client.f.e iI;
    private org.necrotic.client.f.e iJ;
    private String iL;
    private int iM;
    private int[] iN;
    private int iP;
    private org.necrotic.client.f.d iQ;
    private int iR;
    private boolean iS;
    private String iT;
    private long iU;
    private org.necrotic.client.f.e[] iV;
    private String iW;
    private int iX;
    private int iY;
    private int iZ;
    private int ja;
    private org.necrotic.client.f.d jc;
    private org.necrotic.client.c.a je;
    private org.necrotic.client.f.d jg;
    private int jh;
    private int ji;
    private int jj;
    private int jk;
    private boolean jl;
    private org.necrotic.client.n.m jm;
    private boolean jn;
    private boolean jo;
    private org.necrotic.client.f.e jp;
    private int jq;
    private int jr;
    private org.necrotic.client.f.a.c jv;
    private org.necrotic.client.f.a.c jw;
    private int jx;
    private int jy;
    private boolean jA;
    private boolean jB;
    private boolean jE;
    private int jG;
    private org.necrotic.client.j.c jT;
    private boolean jX;
    private boolean jY;
    private org.necrotic.client.f.e ka;
    public int[] bO;
    private int dt = Constants.GAME_FIXED_WIDTH;
    private int du = Constants.GAME_FIXED_HEIGHT;
    private int dv = 800;
    private int dw = Constants.GAME_TICK_LENGTH;
    public final int[] Q = new int[500];
    private int[] dx = {50, 50, 52, 54, 56, 59, 62, 65, 68, 71, 74, 76, 78, 80, 82, 84, 86, 89, 92, 95};
    private String[] dy = {"Protect Item", "Sap Warrior", "Sap Ranger", "Sap Mage", "Sap Spirit", "Berserker", "Deflect Summoning", "Deflect Magic", "Deflect Missiles", "Deflect Melee", "Leech Attack", "Leech Ranged", "Leech Magic", "Leech Defence", "Leech Strength", "Leech Energy", "Leech Special Attack", "Wrath", "Soul Split", "Turmoil"};
    private int[] dz = {1, 4, 7, 8, 9, 10, 13, 16, 19, 22, 25, 26, 27, 28, 31, 34, 37, 40, 43, 44, 45, 46, 49, 52, 60, 70, 80, 80};
    private String[] dA = {"Thick Skin", "Burst of Strength", "Clarity of Thought", "Sharp Eye", "Mystic Will", "Rock Skin", "Superhuman Strength", "Improved Reflexes", "Rapid Restore", "Rapid Heal", "Protect Item", "Hawk Eye", "Mystic Lore", "Steel Skin", "Ultimate Strength", "Incredible Reflexes", "Protect from Magic", "Protect from Missiles", "Protect from Melee", "Eagle Eye", "Mystic Might", "Retribution", "Redemption", "Smite", "Chivalry", "Piety", "Rigour", "Augury"};
    private final int[] dK = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
    private final int[] dO = {16776960, 16711680, 65280, 65535, 16711935, 16777215};
    private final org.necrotic.client.f.b.a.b eb = new org.necrotic.client.f.b.a.b();
    private final String[] ej = new String[500];
    private final ah ek = new ah();
    private org.necrotic.client.i.b eo = new org.necrotic.client.i.b(this);
    public int R = 0;
    public int S = 0;
    private boolean er = false;
    private boolean es = false;
    private ArrayList<Object> et = new ArrayList<>();
    public ArrayList<org.necrotic.client.f.c.c> T = new ArrayList<>();
    public String[] ay = new String[100];
    public int aD = 100;
    public int by = 1;
    public org.necrotic.client.f.b.a.c bz = new org.necrotic.client.f.b.a.c();
    private boolean eT = false;
    private int eU = 0;
    private boolean eV = false;
    private boolean eW = false;
    private aa eX = null;
    public String bG = null;
    private int eY = 4;
    private int eZ = 4;
    private final boolean fb = true;
    public int[] bJ = new int[28];
    public int[] bK = new int[20];
    private int[] fd = {630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 658, 659};
    private int fe = -1;
    private boolean ff = false;
    org.necrotic.client.f.b.a.a bN = new org.necrotic.client.f.b.a.a();
    private ArrayList<aa> fi = new ArrayList<>();
    private boolean[] fo = new boolean[3];
    private boolean[] fp = new boolean[3];
    private int fq = 0;
    private org.necrotic.client.c.a.j fs = null;
    private long fx = 0;
    private boolean fA = false;
    private boolean fB = false;
    private int fF = -1;
    private int fI = 0;
    private int fJ = 0;
    private int[] ht = new int[0];
    private final int[][] hT = {new int[]{475, 90}, new int[]{-40, PluginPanel.PANEL_WIDTH}, new int[]{260, 334}};
    private String hW = "";
    private int ib = 512;
    private int ic = 334;
    private boolean id = true;
    private int ii = 0;
    private int is = -1;
    private int iK = ColorUtil.MAX_RGB_VALUE;
    private String iO = "";
    private int jb = -1;
    private int[] jd = null;
    private int jf = -1;
    private long js = System.currentTimeMillis();
    private final int[] jt = {0, 5, 13, 24, 25, 26, 27};
    private final int[] ju = {1, 3, 4, 6, 11, 12, 14, 19, 20, 24, 25, 26, 27};
    private final int[] jz = {2, 3, 4, 7, 11, 12, 15, 19, 20, 24, 25, 26, 27};
    private final int[] jF = {3, 4, 11, 12, 19, 20, 24, 25, 26, 27};
    private boolean jH = false;
    private final int[] jI = {1, 2, 3, 4, 6, 7, 11, 12, 14, 15, 19, 20, 24, 25, 26, 27};
    private final int[] jJ = {16, 17, 18, 21, 22, 23};
    private final int[] jK = {0, 1, 2, 3, 4, 5, 6, 7, 11, 12, 13, 14, 15, 19, 20, 24, 25, 26, 27};
    private final int[][] jL = {this.jt, this.ju, this.jz, this.jF, this.jJ};
    private final int[] jM = {1, 2, 3, 4, 19};
    private final int[] jN = {10, 11, 12, 13, 14, 15, 16, 19};
    private final int[] jO = {7, 8, 9, 17, 18};
    private final int jQ = 13;
    private final org.necrotic.client.f.e[] jR = new org.necrotic.client.f.e[13];
    private final int jS = 6;
    private int jU = -1;
    private final org.necrotic.client.f.e[] jV = new org.necrotic.client.f.e[6];
    private int jW = -1;
    private String jZ = "";
    private String kb = "null";
    private int[] kc = new int[2000];
    private int[] kd = new int[2000];
    private int[] ke = new int[2000];
    private int kf = 0;
    private final g jP = new g();
    private final AccountManager eQ = new AccountManager();
    private final org.necrotic.client.f.c.i fa = new org.necrotic.client.f.c.i();
    private final BufferedImage[] fH = new BufferedImage[4];
    private int[] jC = new int[500];
    private int[] jD = new int[500];
    private int hZ = -1;
    private b ep = new b(this);
    public final List<Integer>[] H = new ArrayList[500];
    public int ax = 0;
    public int ao = -1;
    public int an = 0;
    private int[][] hq = new int[104][104];
    private final CRC32 dY = new CRC32();
    public org.necrotic.client.c.b.a[][][] aI = new org.necrotic.client.c.b.a[4][104][104];
    private volatile boolean fR = false;
    private org.necrotic.client.g.a hx = new org.necrotic.client.g.a(new byte[5000]);
    public org.necrotic.client.j.e[] bl = new org.necrotic.client.j.e[50000];
    public int[] bn = new int[50000];
    private int[] ho = new int[1000];
    private org.necrotic.client.g.a in = org.necrotic.client.g.a.a();
    private final boolean dC = true;

    /* JADX WARN: Type inference failed for: r0v4, types: [int[], int[][]] */
    static {
        new org.necrotic.b();
        a = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486};
        b = new int[]{new int[]{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, new int[]{8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239}, new int[]{25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003}, new int[]{4626, 11146, 6439, 12, 4758, 10270}, new int[]{4550, 20165, 43678, 16895, 28416, 12231, 947, 60359, 32433}};
        c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        cq = new int[]{1196, 1199, 1206, 1215, 1224, 1231, 1240, 1249, 1258, 1267, 1274, 1283, 1573, 1290, 1299, 1308, 1315, 1324, 1333, 1340, 1349, 1358, 1367, 1374, 1381, 1388, 1397, 1404, 1583, 12038, 1414, 1421, 1430, 1437, 1446, 1453, 1460, 1469, 15878, 1602, 1613, 1624, 7456, 1478, 1485, 1494, 1503, 1512, 1521, 1530, 1544, 1553, 1563, 1593, 1635, 12426, 12436, 12446, 12456, 6004, 18471, 12940, 12988, 13036, 12902, 12862, 13046, 12964, 13012, 13054, 12920, 12882, 13062, 12952, 13000, 13070, 12912, 12872, 13080, 12976, 13024, 13088, 12930, 12892, 13096};
        cr = Pattern.compile("@.+@");
        cs = new int[]{1202, 1203, 1209, 1210, 1211, 1218, 1219, 1220, 1227, 1228, 1234, 1235, 1236, 1243, 1244, 1245, 1252, 1253, 1254, 1261, 1262, 1263, 1270, 1271, 1277, 1278, 1279, 1286, 1287, 1293, 1294, 1295, 1302, 1303, 1304, 1311, 1312, 1318, 1319, 1320, 1327, 1328, 1329, 1336, 1337, 1343, 1344, 1345, 1352, 1353, 1354, 1361, 1362, 1363, 1370, 1371, 1377, 1378, 1384, 1385, 1391, 1392, 1393, 1400, 1401, 1407, 1408, 1410, 1417, 1418, 1424, 1425, 1426, 1433, 1434, 1440, 1441, 1442, 1449, 1450, 1456, 1457, 1463, 1464, 1465, 1472, 1473, 1474, 1481, 1482, 1488, 1489, 1490, 1497, 1498, 1499, 1506, 1507, 1508, 1515, 1516, 1517, 1524, 1525, 1526, 1533, 1534, 1535, 1547, 1548, 1549, 1556, 1557, 1558, 1566, 1567, 1568, 1576, 1577, 1578, 1586, 1587, 1588, 1596, 1597, 1598, 1605, 1606, 1607, 1616, 1617, 1618, 1627, 1628, 1629, 1638, 1639, 1640, 6007, 6008, 6011, 8673, 8674, 12041, 12042, 12429, 12430, 12431, 12439, 12440, 12441, 12449, 12450, 12451, 12459, 12460, 15881, 15882, 15885, 18474, 18475, 18478};
        d = false;
        ct = false;
        e = 0;
        f = false;
        g = false;
        cu = true;
        k = 256;
        n = new int[]{12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800};
        o = Constants.GAME_FIXED_HEIGHT;
        p = Constants.GAME_FIXED_WIDTH;
        r = (int) (Math.log(765.0d) / Math.log(5.0d));
        new HashMap();
        C = new int[2];
        F = new org.necrotic.client.f.f();
        cD = new org.necrotic.client.n.b.p[50];
        cW = 0;
        cX = 0;
        cY = -1;
        cZ = 0;
        dd = false;
        de = true;
        df = new ArrayList<>();
        dj = 10;
        String[] strArr = {"Attack", "Constitution", "Mining", "Strength", "Agility", "Smithing", "Defence", "Herblore", "Fishing", HttpHeaders.RANGE, "Thieving", "Cooking", "Prayer", "Crafting", "Firemaking", "Magic", "Fletching", "Woodcutting", "Runecrafting", "Slayer", "Farming", "Invention", "Hunter", "Summoning"};
        dl = 127;
        dm = 0;
        dn = null;
        System.getProperty("os.name").toLowerCase();
        cp = new int[99];
        int i2 = 0;
        for (int i3 = 0; i3 < 99; i3++) {
            int i4 = i3 + 1;
            i2 += (int) (i4 + (300.0d * Math.pow(2.0d, i4 / 7.0d)));
            cp[i3] = i2 >> 2;
        }
        m = new int[32];
        int i5 = 2;
        for (int i6 = 0; i6 < 32; i6++) {
            m[i6] = i5 - 1;
            int i7 = i5;
            i5 = i7 + i7;
        }
    }

    public static d a(int i2) {
        switch (i2) {
            case 828:
                return f0do[6];
            case 829:
                return f0do[7];
            case 830:
                return f0do[2];
            case 831:
                return f0do[8];
            case 832:
                return f0do[9];
            case 833:
                return f0do[4];
            case 834:
                return f0do[1];
            case 835:
                return f0do[3];
            case 836:
                return f0do[0];
            case 1508:
                return f0do[5];
            default:
                return null;
        }
    }

    public static d b(int i2) {
        switch (i2) {
            case 1:
                return f0do[6];
            case 2:
                return f0do[7];
            case 3:
                return f0do[2];
            case 4:
                return f0do[8];
            case 5:
                return f0do[9];
            case 6:
                return f0do[4];
            case 7:
                return f0do[1];
            case 8:
                return f0do[3];
            case 9:
                return f0do[0];
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            default:
                return null;
            case 13:
            case 16:
                return f0do[5];
        }
    }

    /* JADX WARN: Type inference failed for: r1v68, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r1v99, types: [int[], int[][]] */
    public Client() {
        this.ip = new String[]{""};
        u = -1;
        this.ds = new int[25];
        this.fS = false;
        this.dM = new int[5];
        this.dE = new boolean[5];
        this.fc = false;
        this.jh = -1;
        this.aY = false;
        B = "";
        this.ec = 2048;
        this.ed = 2047;
        this.aG = new int[200];
        this.bq = new org.necrotic.client.e.a.a[this.ec];
        this.bs = new int[this.ec];
        this.hp = new int[this.ec];
        this.hy = new org.necrotic.client.g.a[this.ec];
        this.hr = new int[104][104];
        this.fU = new byte[16384];
        this.K = new int[25];
        this.ea = new long[100];
        this.im = false;
        this.dN = new int[5];
        this.hs = new int[104][104];
        this.aw = new int[500];
        this.ar = new String[500];
        this.aq = new String[500];
        this.as = new String[500];
        this.at = new int[500];
        Arrays.fill(this.as, "");
        Arrays.fill(this.at, 0);
        Arrays.fill(this.Q, 0);
        this.ew = true;
        this.aF = new long[200];
        this.hX = new String[200];
        this.hP = -1;
        this.hU = false;
        this.iY = -1;
        this.iZ = -1;
        this.I = new int[33];
        this.L = new m[6];
        this.bO = new int[9000];
        this.fT = false;
        this.dG = 79;
        this.dP = new int[this.dG];
        this.dQ = new int[this.dG];
        this.dR = new int[this.dG];
        this.dS = new int[this.dG];
        this.dT = new int[this.dG];
        this.dU = new int[this.dG];
        this.dV = new int[this.dG];
        this.dX = new String[this.dG];
        this.hg = -1;
        this.dp = new int[5];
        this.dD = false;
        this.W = "";
        this.fY = new org.necrotic.client.c.b.a();
        this.fK = false;
        this.gk = -1;
        this.dH = new int[5];
        this.fL = false;
        this.iw = new org.necrotic.client.f.e[100];
        this.aC = -1;
        this.O = new int[25];
        this.dI = new int[10000];
        this.eu = true;
        this.M = new int[152];
        this.ez = -1;
        this.fZ = new org.necrotic.client.c.b.a();
        this.J = new int[33];
        this.dF = new aa();
        this.ix = new org.necrotic.client.f.a[100];
        this.dJ = new int[7];
        this.ae = new int[1000];
        this.af = new int[1000];
        this.fM = false;
        this.ih = org.necrotic.client.g.a.a();
        this.dZ = new int[9];
        this.iA = new int[500];
        this.iB = new int[500];
        this.aV = new int[500];
        this.iz = new int[500];
        this.ie = new org.necrotic.client.f.e[20];
        this.iV = new org.necrotic.client.f.e[7];
        this.f1if = new org.necrotic.client.f.e[20];
        this.ef = new org.necrotic.client.f.e[12];
        this.ee = new org.necrotic.client.f.e[6];
        cv = false;
        this.bv = "";
        this.dq = new String[7];
        this.dr = new boolean[7];
        this.dW = new int[4][13][13];
        this.V = new org.necrotic.client.f.e[1000];
        this.fN = false;
        this.ev = false;
        this.hK = new org.necrotic.client.f.e[8];
        aL = false;
        this.fO = false;
        this.fP = false;
        D = "";
        this.bM = "";
        this.eN = -1;
        this.ga = new org.necrotic.client.c.b.a();
        this.gE = 128;
        this.aK = -1;
        dk = org.necrotic.client.g.a.a();
        this.aW = new String[500];
        this.eJ = new String[500];
        this.eK = new int[500];
        this.dL = new int[5];
        this.eg = new int[50];
        j = 78;
        this.bu = "";
        this.P = new org.necrotic.client.f.e[17];
        w = 3;
        G = false;
        this.N = new int[152];
        this.fX = new org.necrotic.client.n.b[4];
        this.ei = new int[50];
        this.fQ = false;
        this.eh = new int[50];
        this.jl = false;
        this.ba = false;
        this.ak = -1;
        this.fC = "";
        A = false;
        this.dB = new String[50];
        this.hD = new int[4000];
        this.hE = new int[4000];
        this.ip = new String[]{""};
    }

    private static String e(int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 < -9) {
            return "@red@";
        }
        if (i4 < -6) {
            return "@or3@";
        }
        if (i4 < -3) {
            return "@or2@";
        }
        if (i4 < 0) {
            return "@or1@";
        }
        if (i4 > 9) {
            return "@gre@";
        }
        if (i4 > 6) {
            return "@gr3@";
        }
        if (i4 > 3) {
            return "@gr2@";
        }
        if (i4 > 0) {
            return "@gr1@";
        }
        return "@yel@";
    }

    private static final boolean z() {
        cZ = 20;
        try {
            cH = new org.necrotic.client.n.a.c();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c(int i2) {
        if (i2 < 100000) {
            return String.valueOf(i2);
        }
        if (i2 < 10000000) {
            return (i2 / 1000) + "K";
        }
        return (i2 / 1000000) + "M";
    }

    private static String i(int i2) {
        String valueOf = String.valueOf(i2);
        String str = valueOf;
        for (int length = valueOf.length() - 3; length > 0; length -= 3) {
            str = str.substring(0, length) + "," + str.substring(length);
        }
        if (str.length() > 8) {
            str = "@gre@" + str.substring(0, str.length() - 8) + " million @whi@(" + str + ")";
        } else if (str.length() > 4) {
            str = "@cya@" + str.substring(0, str.length() - 4) + "K @whi@(" + str + ")";
        }
        return " ".concat(String.valueOf(str));
    }

    public static void main(String[] strArr) {
        SwingUtilities.invokeAndWait(() -> {
            BasicLookAndFeel bVar;
            try {
                JFrame.setDefaultLookAndFeelDecorated(true);
                JDialog.setDefaultLookAndFeelDecorated(true);
                bVar = new org.necrotic.client.m.a.b();
                UIManager.setLookAndFeel(bVar);
            } catch (Throwable unused) {
                bVar.printStackTrace();
            }
        });
        v = 0;
        if (!org.necrotic.a.r) {
            D();
        } else {
            E();
        }
        de = true;
        ae.f = 32;
        try {
            ae.a(InetAddress.getLocalHost());
        } catch (UnknownHostException e2) {
            System.err.printf("Unable to determine localhost for your machine [localhost=%s]%n", e2.getMessage());
        }
        org.necrotic.client.f.b.a.a(a.EnumC0026a.FIXED);
        Client client = new Client();
        q = client;
        client.c(p, o);
    }

    public static Client a() {
        return q;
    }

    private static int j(int i2) {
        return (int) ((Math.log(i2 * 0.00390625d) * 868.5889638065036d) + 0.5d);
    }

    private static final synchronized void a(org.necrotic.client.n.b.e eVar) {
        cE = eVar;
    }

    public static final synchronized void a(int[] iArr, int i2) {
        int i3 = 0;
        int i4 = i2 - 7;
        while (i3 < i4) {
            int i5 = i3;
            int i6 = i3 + 1;
            iArr[i5] = 0;
            int i7 = i6 + 1;
            iArr[i6] = 0;
            int i8 = i7 + 1;
            iArr[i7] = 0;
            int i9 = i8 + 1;
            iArr[i8] = 0;
            int i10 = i9 + 1;
            iArr[i9] = 0;
            int i11 = i10 + 1;
            iArr[i10] = 0;
            int i12 = i11 + 1;
            iArr[i11] = 0;
            i3 = i12 + 1;
            iArr[i12] = 0;
        }
        int i13 = i4 + 7;
        while (i3 < i13) {
            int i14 = i3;
            i3++;
            iArr[i14] = 0;
        }
        if (cE != null) {
            cE.a(iArr, 0, i13);
        }
        k(i13);
    }

    private static final synchronized void A() {
        byte[] bArr;
        if (C()) {
            if (dd && (bArr = dh) != null) {
                if (cN >= 0) {
                    int i2 = cN;
                    int i3 = di;
                    if (cH != null) {
                        if (cY >= 0) {
                            cX = i2;
                            if (cY != 0) {
                                int j2 = ((j(cY) - cW) + 3600) / i2;
                                cZ = j2;
                                if (j2 <= 0) {
                                    cZ = 1;
                                }
                            } else {
                                cZ = 1;
                            }
                            cA = bArr;
                            cU = i3;
                        } else if (cZ == 0) {
                            a(i3, bArr);
                        } else {
                            cU = i3;
                            cA = bArr;
                        }
                    }
                } else if (cS < 0) {
                    a(di, bArr);
                } else {
                    int i4 = cS;
                    int i5 = di;
                    if (cH != null) {
                        if (-1 >= (cY ^ (-1))) {
                            int i6 = i4 - 20;
                            if (i6 <= 0) {
                                i6 = 1;
                            }
                            cZ = i6;
                            if (cY == 0) {
                                cX = 0;
                            } else {
                                cX = (((cX - 1) + (j(cY) - cW)) + 3600) / cX;
                            }
                            cA = bArr;
                            cU = i5;
                        } else if (cZ != 0) {
                            cA = bArr;
                            cU = i5;
                        } else {
                            a(i5, bArr);
                        }
                    }
                }
                dd = false;
            }
            if (cH == null) {
                return;
            }
            if (cY < 0) {
                if (cZ > 0) {
                    int i7 = cZ - 1;
                    cZ = i7;
                    if (i7 == 0) {
                        if (cA == null) {
                            cH.a(256);
                        } else {
                            cH.a(cU);
                            cY = cU;
                            cH.a(cU, cA);
                            cA = null;
                        }
                        cW = 0;
                    }
                }
            } else if (cZ > 0) {
                cW += cX;
                cH.a(cY, cW);
                int i8 = cZ - 1;
                cZ = i8;
                if (i8 == 0) {
                    cH.b();
                    cZ = 20;
                    cY = -1;
                }
            }
            cH.b(-122);
        }
    }

    public static final synchronized void b() {
        if (cE != null) {
            cE.a(256);
        }
        k(256);
    }

    private static final synchronized void B() {
        if (!C()) {
            return;
        }
        a(0, (byte[]) null);
        dd = false;
    }

    public static final int a(int i2, int i3) {
        if (i2 > 22050) {
            i3 = i2;
            i2 = 22050;
        }
        while (i2 != 0) {
            int i4 = i3 % i2;
            i3 = i2;
            i2 = i4;
        }
        return i3;
    }

    private static final void k(int i2) {
        cT += i2;
        while (cT >= l) {
            cT -= l;
            int i3 = cV;
            cV = i3 - (i3 >> 2);
        }
        int i4 = cV - (i2 * 1000);
        cV = i4;
        if (i4 < 0) {
            cV = 0;
        }
    }

    public static final void c() {
        if (cH == null) {
            return;
        }
        a(0, (byte[]) null);
        if (cZ > 0) {
            cH.a(256);
            cZ = 0;
        }
        cH.a();
        cH = null;
    }

    private static final void a(int i2, byte[] bArr) {
        if (cH != null) {
            if (cY >= 0) {
                cH.b();
                cY = -1;
                cA = null;
                cZ = 20;
                cW = 0;
            }
            if (bArr != null) {
                if (cZ > 0) {
                    cH.a(i2);
                    cZ = 0;
                }
                cY = i2;
                cH.a(i2, bArr);
            }
        }
    }

    private static final boolean C() {
        return cH != null;
    }

    private static void E() {
        org.necrotic.client.n.m.c = false;
        org.necrotic.client.n.l.C = false;
        org.necrotic.client.n.j.c = false;
        org.necrotic.client.c.a.k.a = false;
        org.necrotic.a.s = true;
        org.necrotic.a.t = true;
        org.necrotic.a.r = true;
    }

    public static void d(int i2) {
        w = i2;
        cv = true;
    }

    private static final void l(int i2) {
        if (C()) {
            if (dd) {
                di = i2;
            } else if (cH == null) {
            } else {
                if (cZ == 0) {
                    if (cY < 0) {
                        return;
                    }
                    cY = i2;
                    cH.a(i2, 0);
                } else if (cA == null) {
                } else {
                    cU = i2;
                }
            }
        }
    }

    public static final void d() {
        if (5 > 0) {
            if (5 % 10 != 0) {
                try {
                    Thread.sleep(5L);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
            try {
                Thread.sleep(4L);
            } catch (InterruptedException unused2) {
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public static String e() {
        String str = "";
        Transferable contents = Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null);
        ?? r0 = (contents == null || !contents.isDataFlavorSupported(DataFlavor.stringFlavor)) ? 0 : 1;
        if (r0 != 0) {
            try {
                r0 = (String) contents.getTransferData(DataFlavor.stringFlavor);
                str = r0;
            } catch (Throwable unused) {
                r0.printStackTrace();
            }
            return str;
        }
        return "";
    }

    public static void a(String str) {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(str), (ClipboardOwner) null);
    }

    private static void F() {
        for (int i2 = 0; i2 < 20; i2++) {
            if (aa.y[i2] != null) {
                aa.y[i2].v = false;
                if (aa.y[i2].w.equals("")) {
                    aa.y[i2].w = aa.y[i2].x;
                }
            }
        }
    }

    public static String b(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (i2 == 0) {
                str = String.format("%s%s", Character.valueOf(Character.toUpperCase(str.charAt(0))), str.substring(1));
            }
            if (!Character.isLetterOrDigit(str.charAt(i2)) && i2 + 1 < str.length()) {
                str = String.format("%s%s%s", str.subSequence(0, i2 + 1), Character.valueOf(Character.toUpperCase(str.charAt(i2 + 1))), str.substring(i2 + 2));
            }
        }
        return str.replace("_", " ");
    }

    public static String c(String str) {
        if (str != "") {
            try {
                return (str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase()).trim();
            } catch (Exception unused) {
            }
        }
        return str;
    }

    private static String f(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            stringBuffer.append("*");
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Client client, String... strArr) {
        client.v();
        Graphics graphics = cn.getGraphics();
        Color color = new Color(205, 200, 50);
        Color color2 = new Color(30, 191, 30);
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, (int) Constants.GAME_FIXED_WIDTH, (int) Constants.GAME_FIXED_HEIGHT);
        graphics.setFont(new Font("Verdana", 1, 18));
        graphics.setColor(color);
        graphics.drawString("An error has occured while starting Tarn...", 30, 35);
        graphics.drawLine(30, 40, 645, 40);
        graphics.setFont(new Font("Arial", 1, 90));
        graphics.setColor(color2);
        graphics.setFont(new Font("Verdana", 1, 16));
        int i2 = 40;
        for (String str : strArr) {
            i2 += 40;
            graphics.drawString(str, 30, i2);
        }
    }

    public static int e(int i2) {
        return new Random().nextInt(i2);
    }

    public static org.necrotic.client.g.a f() {
        return dk;
    }

    private static int G() {
        return cQ;
    }

    private static void m(int i2) {
        cQ = i2;
    }

    private static int H() {
        return cM;
    }

    private static void n(int i2) {
        cM = i2;
    }

    private static int I() {
        return cP;
    }

    private static void o(int i2) {
        cP = i2;
    }

    private static int J() {
        return db;
    }

    private static void p(int i2) {
        db = i2;
    }

    private static int K() {
        return dc;
    }

    private static void q(int i2) {
        dc = i2;
    }

    private static int L() {
        return cK;
    }

    private static void r(int i2) {
        cK = i2;
    }

    private static int M() {
        return cO;
    }

    private static void s(int i2) {
        cO = i2;
    }

    private static String N() {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            byte[] hardwareAddress = networkInterfaces.nextElement().getHardwareAddress();
            if (hardwareAddress != null) {
                String[] strArr = new String[hardwareAddress.length];
                for (int i2 = 0; i2 < hardwareAddress.length; i2++) {
                    strArr[i2] = String.format("%02X", Byte.valueOf(hardwareAddress[i2]));
                }
                return String.join("-", strArr);
            }
        }
        return "badvalue";
    }

    public final boolean a(int i2, int i3, int i4, int i5) {
        return this.bY >= i2 && this.bY <= i3 && this.bZ >= i4 && this.bZ <= i5;
    }

    public final void a(int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.fD - 6;
        int i8 = i2 - (i7 << 3);
        int i9 = i3 - ((this.fE - 6) << 3);
        int i10 = this.dK[10];
        if (i9 > 0 && i9 < 103 && i8 > 0 && i8 < 103) {
            a(-1, i4, i5, i10, i9, 10, i6, i8, 0);
        }
    }

    private static String f(int i2, int i3) {
        return ae.b() + "/index" + i2 + "/" + (i3 != -1 ? i3 + ".gz" : "");
    }

    private void a(int i2, boolean z2) {
        this.bO[aa.u[i2].aN[0][1]] = z2 ? 1 : 0;
    }

    private static byte[] g(int i2, int i3) {
        try {
            if (f(i2, i3).length() <= 0 || f(i2, i3) == null) {
                return null;
            }
            File file = new File(f(i2, i3));
            byte[] bArr = new byte[(int) file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private void O() {
        this.eT = false;
        this.eU = 0;
        dk.i(195);
        dk.h(6667);
    }

    private void P() {
        if (A) {
            int i2 = 0;
            int i3 = 308;
            while (i2 < 17) {
                if (this.dB[i2] != null) {
                    this.bh.a(this.dB[i2], 9, i3, 16777215, 0, false);
                }
                i2++;
                i3 -= 18;
            }
        }
    }

    private void b(String str, int i2) {
        if (this.ak == -1) {
            G = true;
        }
        for (int i3 = 16; i3 > 0; i3--) {
            String[] strArr = this.dB;
            strArr[i3] = strArr[i3 - 1];
        }
        if (i2 == 0) {
            this.dB[0] = new SimpleDateFormat("HH:mm:ss").format(new Date()) + " " + str;
            return;
        }
        this.dB[0] = str;
    }

    private void g(String str) {
        if (str.equalsIgnoreCase("cls") || str.equalsIgnoreCase("clear")) {
            for (int i2 = 0; i2 < 17; i2++) {
                this.dB[i2] = null;
            }
        }
        if (str.startsWith("vngt")) {
            this.fF = 31;
            a("Sent vengTimer", 0, "");
        }
        if (str.startsWith("groundtext")) {
            org.necrotic.a.q = !org.necrotic.a.q;
            a("You've set ground item text to: " + org.necrotic.a.q + ".", 0, "");
        }
        str.split(" ");
        boolean z2 = true;
        switch (str.hashCode()) {
            case -1308064877:
                if (str.equals("hitmarks")) {
                    z2 = false;
                    break;
                }
                break;
            case 101609:
                if (str.equals("fps")) {
                    z2 = true;
                    break;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    z2 = true;
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    z2 = true;
                    break;
                }
                break;
            case 1126979549:
                if (str.equals("cursors")) {
                    z2 = true;
                    break;
                }
                break;
        }
        switch (z2) {
            case false:
                org.necrotic.a.h = !org.necrotic.a.h;
                break;
            case true:
                org.necrotic.a.n = !org.necrotic.a.n;
                break;
            case true:
                this.jo = !this.jo;
                break;
            case true:
            case true:
                this.jn = !this.jn;
                break;
        }
        if (aL) {
            dk.i(231);
            dk.l(str.length() + 1);
            dk.a(str);
        }
    }

    private void a(long j2) {
        if (j2 == 0) {
            return;
        }
        try {
            if (this.aE >= 100 && this.gq != 1) {
                a("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
            } else if (this.aE >= 200) {
                a("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
            } else {
                String a2 = org.necrotic.client.f.a.b.a(org.necrotic.client.f.a.b.a(j2));
                String str = a2;
                if (a2 != null) {
                    if (str.indexOf("@") == 0) {
                        str = this.iL.substring(d(this.iL));
                    }
                    if (str.indexOf("@") == 0) {
                        str = this.iL.substring(d(this.iL));
                    }
                }
                for (int i2 = 0; i2 < this.aE; i2++) {
                    if (this.aF[i2] == j2) {
                        a(str + " is already on your friend list", 0, "");
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.ig; i3++) {
                    if (this.ea[i3] == j2) {
                        a("Please remove " + str + " from your ignore list first", 0, "");
                        return;
                    }
                }
                if (str.equals(t.y)) {
                    return;
                }
                this.hX[this.aE] = str;
                this.aF[this.aE] = j2;
                this.aG[this.aE] = 0;
                this.aE++;
                dk.i(188);
                dk.a(j2);
            }
        } catch (RuntimeException e2) {
            ae.a("15283, 68, " + j2 + ", " + e2.toString());
            e2.printStackTrace();
            throw new RuntimeException();
        }
    }

    private void b(long j2) {
        if (j2 == 0) {
            return;
        }
        try {
            if (this.ig >= 100) {
                a("Your ignore list is full. Max of 100 hit", 0, "");
                return;
            }
            String a2 = org.necrotic.client.f.a.b.a(org.necrotic.client.f.a.b.a(j2));
            String str = a2;
            if (a2 != null) {
                if (str.indexOf("@") == 0) {
                    str = str.substring(d(str));
                }
                if (str.indexOf("@") == 0) {
                    str = str.substring(d(str));
                }
            }
            for (int i2 = 0; i2 < this.ig; i2++) {
                if (this.ea[i2] == j2) {
                    a(str + " is already on your ignore list", 0, "");
                    return;
                }
            }
            for (int i3 = 0; i3 < this.aE; i3++) {
                if (this.aF[i3] == j2) {
                    a("Please remove " + str + " from your friend list first", 0, "");
                    return;
                }
            }
            long[] jArr = this.ea;
            int i4 = this.ig;
            this.ig = i4 + 1;
            jArr[i4] = j2;
            dk.i(133);
            dk.a(j2);
        } catch (RuntimeException e2) {
            ae.a("45688, " + j2 + ", 4, " + e2.toString());
            throw new RuntimeException();
        }
    }

    private void Q() {
        org.necrotic.client.c.b.a aVar;
        int[] iArr;
        int i2;
        int i3;
        org.necrotic.client.c.a.k kVar;
        if (this.eH == 0 && this.eP == 0) {
            this.aW[this.aX] = "Walk here";
            this.aV[this.aX] = 516;
            this.iA[this.aX] = this.bY;
            this.iB[this.aX] = this.bZ;
            this.aX++;
        }
        int i4 = -1;
        for (int i5 = 0; i5 < org.necrotic.client.n.d.g; i5++) {
            int i6 = org.necrotic.client.n.d.i[i5];
            int i7 = i6 & 127;
            int i8 = (i6 >> 7) & 127;
            int i9 = (i6 >> 29) & 3;
            int i10 = -1;
            if (i9 != 2) {
                i10 = (i6 >> 14) & 32767;
            }
            if (i6 != i4) {
                i4 = i6;
                if (i9 == 2 && this.jm.c(this.bp, i7, i8, i6) >= 0) {
                    int i11 = org.necrotic.client.n.d.h[i5];
                    i10 = i11;
                    org.necrotic.client.c.a.k a2 = org.necrotic.client.c.a.k.a(i11);
                    org.necrotic.client.c.a.k kVar2 = a2;
                    if (a2.m != null) {
                        int i12 = -1;
                        if (kVar2.s != -1) {
                            org.necrotic.client.c.a.n nVar = org.necrotic.client.c.a.n.a[kVar2.s];
                            int i13 = nVar.b;
                            int i14 = nVar.c;
                            i12 = (org.necrotic.client.c.a.k.b.bO[i13] >> i14) & m[nVar.d - i14];
                        } else if (kVar2.i != -1) {
                            i12 = org.necrotic.client.c.a.k.b.bO[kVar2.i];
                        }
                        if (i12 < 0 || i12 >= kVar2.m.length || kVar2.m[i12] == -1) {
                            kVar = null;
                        } else {
                            kVar = org.necrotic.client.c.a.k.a(kVar2.m[i12]);
                        }
                        kVar2 = kVar;
                    }
                    if (this.al + i7 == 3090 && this.am + i8 == 3956) {
                        this.aW[this.aX] = "Pull @cya@Lever";
                        this.aV[this.aX] = 502;
                        this.iz[this.aX] = i6;
                        this.iA[this.aX] = i7;
                        this.iB[this.aX] = i8;
                        this.jC[this.aX] = 5959;
                        this.aX++;
                        this.aW[this.aX] = "Examine @cya@ Lever";
                        this.aV[this.aX] = 1226;
                        this.iz[this.aX] = 950;
                        this.iA[this.aX] = i7;
                        this.iB[this.aX] = i8;
                        this.jC[this.aX] = 5959;
                        this.aX++;
                        return;
                    } else if (this.al + i7 == 2539 && this.am + i8 == 4712) {
                        this.aW[this.aX] = "Pull @cya@Lever";
                        this.aV[this.aX] = 502;
                        this.iz[this.aX] = i6;
                        this.iA[this.aX] = i7;
                        this.iB[this.aX] = i8;
                        this.jC[this.aX] = 5960;
                        this.aX++;
                        this.aW[this.aX] = "Examine @cya@Lever";
                        this.aV[this.aX] = 1226;
                        this.iz[this.aX] = 950;
                        this.iA[this.aX] = i7;
                        this.iB[this.aX] = i8;
                        this.jC[this.aX] = 5960;
                        this.aX++;
                        return;
                    } else if (kVar2 != null) {
                        if (this.eH == 1) {
                            this.aW[this.aX] = "Use " + this.iT + " with @cya@" + kVar2.f;
                            this.aV[this.aX] = 62;
                            iArr = this.iz;
                            i2 = this.aX;
                            i3 = i6;
                        } else if (this.eP == 1) {
                            if ((this.iX & 4) == 4) {
                                this.aW[this.aX] = this.iW + " @cya@" + kVar2.f;
                                this.aV[this.aX] = 956;
                                iArr = this.iz;
                                i2 = this.aX;
                                i3 = i6;
                            }
                        } else {
                            if (kVar2 != null && kVar2.y != null) {
                                for (int i15 = 4; i15 >= 0; i15--) {
                                    if (kVar2.y[i15] != null) {
                                        this.aW[this.aX] = kVar2.y[i15] + " @cya@" + kVar2.f;
                                        if (i15 == 0) {
                                            this.aV[this.aX] = 502;
                                        }
                                        if (i15 == 1) {
                                            this.aV[this.aX] = 900;
                                        }
                                        if (i15 == 2) {
                                            this.aV[this.aX] = 113;
                                        }
                                        if (i15 == 3) {
                                            this.aV[this.aX] = 872;
                                        }
                                        if (i15 == 4) {
                                            this.aV[this.aX] = 1062;
                                        }
                                        this.iz[this.aX] = i6;
                                        this.iA[this.aX] = i7;
                                        this.iB[this.aX] = i8;
                                        this.jC[this.aX] = i10;
                                        this.aX++;
                                    }
                                }
                            }
                            this.aW[this.aX] = this.be == 4 ? "Examine @cya@" + kVar2.f + " @gre@(@whi@" + kVar2.j + "@gre@) (@whi@" + (i7 + this.al) + "," + (i8 + this.am) + ") @or1@(" + kVar2.x + ")@gre@)" : "Examine @cya@" + kVar2.f;
                            this.aV[this.aX] = 1226;
                            iArr = this.iz;
                            i2 = this.aX;
                            i3 = kVar2 == null ? -1 : kVar2.j << 14;
                        }
                        iArr[i2] = i3;
                        this.iA[this.aX] = i7;
                        this.iB[this.aX] = i8;
                        this.jC[this.aX] = i10;
                        this.aX++;
                    }
                }
                if (i9 == 1) {
                    org.necrotic.client.j.e eVar = this.bl[i10];
                    if (eVar.c.t == 1 && (eVar.aJ & 127) == 64 && (eVar.aK & 127) == 64) {
                        for (int i16 = 0; i16 < this.bm; i16++) {
                            org.necrotic.client.j.e eVar2 = this.bl[this.bn[i16]];
                            if (eVar2 != null && eVar2 != eVar && eVar2.c.t == 1 && eVar2.aJ == eVar.aJ && eVar2.aK == eVar.aK) {
                                a(eVar2.c, this.bn[i16], i8, i7);
                            }
                        }
                        for (int i17 = 0; i17 < this.br; i17++) {
                            org.necrotic.client.e.a.a aVar2 = this.bq[this.bs[i17]];
                            if (aVar2 != null && aVar2.aJ == eVar.aJ && aVar2.aK == eVar.aK) {
                                a(i7, this.bs[i17], aVar2, i8);
                            }
                        }
                    }
                    a(eVar.c, i10, i8, i7);
                }
                if (i9 == 0) {
                    org.necrotic.client.e.a.a aVar3 = this.bq[i10];
                    if ((aVar3.aJ & 127) == 64 && (aVar3.aK & 127) == 64) {
                        for (int i18 = 0; i18 < this.bm; i18++) {
                            org.necrotic.client.j.e eVar3 = this.bl[this.bn[i18]];
                            if (eVar3 != null) {
                                try {
                                    if (eVar3.c.t == 1 && eVar3.aJ == aVar3.aJ && eVar3.aK == aVar3.aK) {
                                        a(eVar3.c, this.bn[i18], i8, i7);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                        for (int i19 = 0; i19 < this.br; i19++) {
                            org.necrotic.client.e.a.a aVar4 = this.bq[this.bs[i19]];
                            if (aVar4 != null && aVar4 != aVar3 && aVar4.aJ == aVar3.aJ && aVar4.aK == aVar3.aK) {
                                a(i7, this.bs[i19], aVar4, i8);
                            }
                        }
                    }
                    a(i7, i10, aVar3, i8);
                }
                if (i9 == 3 && (aVar = this.aI[this.bp][i7][i8]) != null) {
                    org.necrotic.client.c.b.b a3 = aVar.a();
                    while (true) {
                        org.necrotic.client.j.d dVar = (org.necrotic.client.j.d) a3;
                        if (dVar != null) {
                            org.necrotic.client.c.a.i a4 = org.necrotic.client.c.a.i.a(dVar.d);
                            if (this.eH == 1) {
                                this.aW[this.aX] = "Use " + this.iT + " with @lre@" + a4.G + (this.be == 4 ? " (" + a4.w + ") @or1@(" + a4.l + ")" : "");
                                this.aV[this.aX] = 511;
                                this.iz[this.aX] = dVar.d;
                                this.iA[this.aX] = i7;
                                this.iB[this.aX] = i8;
                                this.jC[this.aX] = i10;
                                this.aX++;
                            } else if (this.eP == 1) {
                                if ((this.iX & 1) == 1) {
                                    this.aW[this.aX] = this.iW + " @lre@" + a4.G + (this.be == 4 ? " (" + a4.w + ") @or1@(" + a4.l + ")" : "");
                                    this.aV[this.aX] = 94;
                                    this.iz[this.aX] = dVar.d;
                                    this.iA[this.aX] = i7;
                                    this.iB[this.aX] = i8;
                                    this.jC[this.aX] = i10;
                                    this.aX++;
                                }
                            } else {
                                for (int i20 = 4; i20 >= 0; i20--) {
                                    if (a4.v != null && a4.v[i20] != null) {
                                        this.aW[this.aX] = a4.v[i20] + " @lre@" + a4.G + (this.be == 4 ? " (" + a4.w + ") @or1@(" + a4.l + ")" : "");
                                        if (i20 == 0) {
                                            this.aV[this.aX] = 652;
                                        }
                                        if (i20 == 1) {
                                            this.aV[this.aX] = 567;
                                        }
                                        if (i20 == 2) {
                                            this.aV[this.aX] = 234;
                                        }
                                        if (i20 == 3) {
                                            this.aV[this.aX] = 244;
                                        }
                                        if (i20 == 4) {
                                            this.aV[this.aX] = 213;
                                        }
                                        this.iz[this.aX] = dVar.d;
                                        this.iA[this.aX] = i7;
                                        this.iB[this.aX] = i8;
                                        this.jC[this.aX] = i10;
                                        this.jD[this.aX] = dVar.e.ordinal();
                                        this.aX++;
                                    } else if (i20 == 2) {
                                        this.aW[this.aX] = "Take @lre@" + a4.G + (this.be == 4 ? " (" + a4.w + ") @or1@(" + a4.l + ")" : "");
                                        this.aV[this.aX] = 234;
                                        this.iz[this.aX] = dVar.d;
                                        this.iA[this.aX] = i7;
                                        this.iB[this.aX] = i8;
                                        this.jC[this.aX] = i10;
                                        this.jD[this.aX] = dVar.e.ordinal();
                                        this.aX++;
                                    }
                                }
                                this.aW[this.aX] = "Examine @lre@" + a4.G + (this.be == 4 ? " (" + a4.w + ") @or1@(" + a4.l + ") @or2@(" + a4.l + ")" : "");
                                this.aV[this.aX] = 1448;
                                this.iz[this.aX] = dVar.d;
                                this.iA[this.aX] = i7;
                                this.iB[this.aX] = i8;
                                this.jC[this.aX] = i10;
                                this.aX++;
                            }
                            a3 = aVar.b();
                        }
                    }
                }
            }
        }
    }

    private void a(org.necrotic.client.c.a.j jVar, int i2, int i3, int i4) {
        if (this.aX >= 400) {
            return;
        }
        if (jVar.k != null) {
            jVar = jVar.c();
        }
        if (jVar == null || !jVar.o) {
            return;
        }
        String str = jVar.r;
        if (jVar.l != 0) {
            str = str + e(t.u, jVar.l) + " (level: " + jVar.l + ")";
        }
        if (this.eH == 1) {
            this.aW[this.aX] = "Use " + this.iT + " with @yel@" + str;
            this.aV[this.aX] = 582;
            this.iz[this.aX] = i2;
            this.iA[this.aX] = i4;
            this.iB[this.aX] = i3;
            this.aX++;
        } else if (this.eP == 1) {
            if ((this.iX & 2) == 2) {
                this.aW[this.aX] = this.iW + " @yel@" + str;
                this.aV[this.aX] = 413;
                this.iz[this.aX] = i2;
                this.iA[this.aX] = i4;
                this.iB[this.aX] = i3;
                this.aX++;
            }
        } else {
            if (jVar.g != null) {
                for (int i5 = 4; i5 >= 0; i5--) {
                    if (jVar.g[i5] != null && !jVar.g[i5].equalsIgnoreCase("attack")) {
                        this.aW[this.aX] = jVar.g[i5] + " @yel@" + str;
                        if (i5 == 0) {
                            this.aV[this.aX] = 20;
                        }
                        if (i5 == 1) {
                            this.aV[this.aX] = 412;
                        }
                        if (i5 == 2) {
                            this.aV[this.aX] = 225;
                        }
                        if (i5 == 3) {
                            this.aV[this.aX] = 965;
                        }
                        if (i5 == 4) {
                            this.aV[this.aX] = 478;
                        }
                        this.iz[this.aX] = i2;
                        this.iA[this.aX] = i4;
                        this.iB[this.aX] = i3;
                        this.aX++;
                    }
                }
            }
            if (jVar.g != null) {
                for (int i6 = 4; i6 >= 0; i6--) {
                    if (jVar.g[i6] != null && jVar.g[i6].equalsIgnoreCase("attack")) {
                        this.aW[this.aX] = jVar.g[i6] + " @yel@" + str;
                        if (i6 == 0) {
                            this.aV[this.aX] = 20;
                        }
                        if (i6 == 1) {
                            this.aV[this.aX] = 412;
                        }
                        if (i6 == 2) {
                            this.aV[this.aX] = 225;
                        }
                        if (i6 == 3) {
                            this.aV[this.aX] = 965;
                        }
                        if (i6 == 4) {
                            this.aV[this.aX] = 478;
                        }
                        this.iz[this.aX] = i2;
                        this.iA[this.aX] = i4;
                        this.iB[this.aX] = i3;
                        this.aX++;
                        this.aW[this.aX] = "@yel@Show drops";
                        this.aV[this.aX] = 1075;
                        this.iz[this.aX] = i2;
                        this.iA[this.aX] = i4;
                        this.iB[this.aX] = i3;
                        this.aX++;
                    }
                }
            }
            if (jVar.w == 3062 || jVar.w == 770 || jVar.w == 771 || jVar.w == 769 || jVar.w == 6960 || jVar.w == 6958 || jVar.w == 6968 || jVar.w == 6964 || jVar.w == 350 || jVar.w == 351 || jVar.w == 352 || jVar.w == 928 || jVar.w == 4000 || jVar.w == 4001 || jVar.w == 271 || jVar.w == 133 || jVar.w == 105 || jVar.w == 4414 || jVar.w == 189 || jVar.w == 4444 || jVar.w == 1902 || jVar.w == 8802 || jVar.w == 3309 || jVar.w == 1898 || jVar.w == 302 || jVar.w == 1890 || jVar.w == 1894 || jVar.w == 1893 || jVar.w == 1892 || jVar.w == 1904 || jVar.w == 3001 || jVar.w == 5001 || jVar.w == 3377 || jVar.w == 4969 || jVar.w == 6913 || jVar.w == 6919 || jVar.w == 6942 || jVar.w == 6945 || jVar.w == 3033 || jVar.w == 3030 || jVar.w == 3031 || jVar.w == 3032 || jVar.w == 3034 || jVar.w == 3035 || jVar.w == 3036 || jVar.w == 3037 || jVar.w == 3038 || jVar.w == 3039 || jVar.w == 3040 || jVar.w == 3047 || jVar.w == 3048 || jVar.w == 3050 || jVar.w == 3051 || jVar.w == 3052 || jVar.w == 3053 || jVar.w == 3054 || jVar.w == 3055 || jVar.w == 3056 || jVar.w == 3057 || jVar.w == 3058 || jVar.w == 3059 || jVar.w == 3060 || jVar.w == 3061 || jVar.w == 6302 || jVar.w == 6303 || jVar.w == 6304 || jVar.w == 6305 || jVar.w == 6306 || jVar.w == 6307 || jVar.w == 6308 || jVar.w == 6309 || jVar.w == 6310 || jVar.w == 6312 || jVar.w == 6313 || jVar.w == 6314 || jVar.w == 6315 || jVar.w == 6316 || jVar.w == 6317 || jVar.w == 6318 || jVar.w == 6319 || jVar.w == 6320 || jVar.w == 6311 || jVar.w == 6322 || jVar.w == 6323 || jVar.w == 6324 || jVar.w == 3062 || jVar.w == 1906 || jVar.w == 184 || jVar.w == 6431 || jVar.w == 1801 || jVar.w == 10 || jVar.w == 3062) {
                this.aW[this.aX] = "@yel@Pick-up " + jVar.r;
                this.aV[this.aX] = 1075;
                this.iz[this.aX] = i2;
                this.iA[this.aX] = i4;
                this.iB[this.aX] = i3;
                this.aX++;
            }
            if (this.be == 4) {
                str = str + " @whi@(@gre@" + jVar.w + "@whi@)" + jVar.s[0];
            }
            this.aW[this.aX] = "Examine @yel@".concat(String.valueOf(str));
            this.aV[this.aX] = 1025;
            this.iz[this.aX] = i2;
            this.iA[this.aX] = i4;
            this.iB[this.aX] = i3;
            this.aX++;
        }
    }

    private void a(int i2, int i3, org.necrotic.client.e.a.a aVar, int i4) {
        String str;
        if (aVar == t || this.aX >= 400) {
            return;
        }
        String str2 = "";
        String str3 = "";
        if (aVar.E != null && !aVar.E.isEmpty()) {
            str3 = "<col=" + Integer.toHexString(aVar.F) + ">" + aVar.E.trim() + "</col> ";
        }
        if (aVar.D == 1) {
            str2 = str2 + "<img=1><col=20B2AA>Mod@whi@ ";
        }
        if (aVar.D == 2) {
            str2 = str2 + "<img=2>@yel@Admin@whi@ ";
        }
        if (aVar.D == 3) {
            str2 = str2 + "<img=3> ";
        }
        if (aVar.D == 5) {
            str2 = str2 + "<img=5>@cya@Support@whi@ ";
        }
        if (aVar.D == 6) {
            str2 = str2 + "@bla@[<col=c40303>$@bla@]@whi@ ";
        }
        if (aVar.D == 7) {
            str2 = str2 + "@bla@[<col=0023d8>$@bla@]@whi@ ";
        }
        if (aVar.D == 8) {
            str2 = str2 + "@bla@[<col=1FBA07>$@bla@]@whi@ ";
        }
        if (aVar.D == 9) {
            str2 = str2 + "<img=9> ";
        }
        if (aVar.D == 10) {
            str2 = str2 + "<img=10> ";
        }
        if (aVar.D == 11) {
            str2 = str2 + "<col=b40404>Super@whi@ ";
        }
        if (aVar.D == 12) {
            str2 = str2 + "<col=b40404>Extreme@whi@ ";
        }
        if (aVar.D == 13) {
            str2 = str2 + "<img=13> ";
        }
        if (aVar.D == 4) {
            str2 = "<img=12><col=ff0000>Founder@whi@ ";
        }
        int a2 = c.a(aVar.D);
        if (a2 != 0) {
            str2 = str2 + "<col=" + a2 + ">";
        }
        if (aVar.u == 0) {
            str = str3 + aVar.y + e(t.u, aVar.u) + " (level-" + aVar.u + ")";
        } else {
            str = str2 + str3 + aVar.y + e(t.u, aVar.u) + " (level-" + aVar.u + ")";
        }
        if (this.eH == 1) {
            this.aW[this.aX] = "Use " + this.iT + " with @whi@" + str;
            this.aV[this.aX] = 491;
            this.iz[this.aX] = i3;
            this.iA[this.aX] = i2;
            this.iB[this.aX] = i4;
            this.aX++;
        } else if (this.eP == 1) {
            if ((this.iX & 8) == 8) {
                this.aW[this.aX] = this.iW + " @whi@" + str;
                this.aV[this.aX] = 365;
                this.iz[this.aX] = i3;
                this.iA[this.aX] = i2;
                this.iB[this.aX] = i4;
                this.aX++;
            }
        } else {
            for (int i5 = 6; i5 >= 0; i5--) {
                if (this.dq[i5] != null) {
                    this.aW[this.aX] = this.dq[i5] + " @whi@" + str;
                    int i6 = 0;
                    if (this.dq[i5].equalsIgnoreCase("attack")) {
                        if (t.z != 0 && aVar.z != 0) {
                            i6 = t.z == aVar.z ? 2000 : 0;
                        }
                    } else if (this.dr[i5]) {
                        i6 = 2000;
                    }
                    if (i5 == 0) {
                        this.aV[this.aX] = i6 + 561;
                    }
                    if (i5 == 1) {
                        this.aV[this.aX] = i6 + 779;
                    }
                    if (i5 == 2) {
                        this.aV[this.aX] = i6 + 27;
                    }
                    if (i5 == 3) {
                        this.aV[this.aX] = i6 + 577;
                    }
                    if (i5 == 4) {
                        this.aV[this.aX] = i6 + 729;
                    }
                    if (i5 == 5) {
                        this.aV[this.aX] = 8300;
                    }
                    if (i5 == 6) {
                        this.aV[this.aX] = 8305;
                    }
                    this.iz[this.aX] = i3;
                    this.iA[this.aX] = i2;
                    this.iB[this.aX] = i4;
                    this.aX++;
                }
            }
        }
        for (int i7 = 0; i7 < this.aX; i7++) {
            if (this.aV[i7] == 516) {
                this.aW[i7] = "Walk here @whi@".concat(String.valueOf(str));
                return;
            }
        }
    }

    private void t(int i2) {
        if (!this.id || this.bN.b()) {
            return;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 500; i4++) {
            if (this.aq[i4] != null) {
                int i5 = this.aw[i4];
                int i6 = (70 - (i3 * 14)) + 42 + i + 4 + 5;
                if (i6 >= -23) {
                    String str = this.ar[i4];
                    if (this.ax != 1) {
                        if (this.ax != 2) {
                            if (this.ax != 3 && this.ax != 4) {
                                if (this.aJ != 3) {
                                    if (this.ax != 5) {
                                        if (str != null) {
                                            if (str.indexOf("@") == 0) {
                                                str = str.substring(d(str));
                                            }
                                            if (str.indexOf("@") == 0) {
                                                str = str.substring(d(str));
                                            }
                                        }
                                        if (str != null && str.startsWith("<col=")) {
                                            String str2 = str;
                                            str = str2.substring(str2.indexOf(ColorUtil.CLOSING_COLOR_TAG) + 6);
                                        }
                                        if (i5 == 0) {
                                            i3++;
                                        }
                                        if ((i5 == 1 || i5 == 2) && (i5 == 1 || this.bw == 0 || (this.bw == 1 && e(str)))) {
                                            if (i2 > i6 - 14 && i2 <= i6 && !t.y.equals(cr.matcher(str).replaceAll(""))) {
                                                if (!e(str)) {
                                                    this.aW[this.aX] = "Add ignore @whi@".concat(String.valueOf(str));
                                                    this.aV[this.aX] = 42;
                                                    this.aX++;
                                                    this.aW[this.aX] = "Add friend @whi@".concat(String.valueOf(str));
                                                    this.aV[this.aX] = 337;
                                                    this.aX++;
                                                } else if (e(str)) {
                                                    this.aW[this.aX] = "Message @whi@".concat(String.valueOf(str));
                                                    this.aV[this.aX] = 2639;
                                                    this.aX++;
                                                }
                                            }
                                            i3++;
                                        }
                                        if ((i5 == 3 || i5 == 7) && this.by == 0 && (i5 == 7 || this.bt == 0 || (this.bt == 1 && e(str)))) {
                                            if (i2 > i6 - 14 && i2 <= i6) {
                                                if (!e(str)) {
                                                    this.aW[this.aX] = "Add ignore @whi@".concat(String.valueOf(str));
                                                    this.aV[this.aX] = 42;
                                                    this.aX++;
                                                    this.aW[this.aX] = "Add friend @whi@".concat(String.valueOf(str));
                                                    this.aV[this.aX] = 337;
                                                    this.aX++;
                                                } else if (e(str)) {
                                                    this.aW[this.aX] = "Message @whi@".concat(String.valueOf(str));
                                                    this.aV[this.aX] = 2639;
                                                    this.aX++;
                                                }
                                            }
                                            i3++;
                                        }
                                        if (i5 == 4 && (this.bB == 0 || (this.bB == 1 && e(str)))) {
                                            if (i2 > i6 - 14 && i2 <= i6) {
                                                this.aW[this.aX] = "Accept trade @whi@".concat(String.valueOf(str));
                                                this.aV[this.aX] = 484;
                                                this.aX++;
                                            }
                                            i3++;
                                        }
                                        if ((i5 == 5 || i5 == 6) && this.by == 0 && this.bt < 2) {
                                            i3++;
                                        }
                                        if (i5 == 8 && (this.bH == 0 || (this.bH == 1 && e(str)))) {
                                            if (i2 > i6 - 14 && i2 <= i6) {
                                                this.aW[this.aX] = "Accept challenge @whi@".concat(String.valueOf(str));
                                                this.aV[this.aX] = 6;
                                                this.aX++;
                                            }
                                            i3++;
                                        }
                                        if (i5 == 21) {
                                            if (i2 > i6 - 14 && i2 <= i6) {
                                                this.aW[this.aX] = "Accept gamble @whi@".concat(String.valueOf(str));
                                                this.aV[this.aX] = 1673;
                                                this.aX++;
                                            }
                                            i3++;
                                        }
                                        if (i5 == 22) {
                                            if (i2 > i6 - 14 && i2 <= i6) {
                                                this.aW[this.aX] = "Accept raid request @whi@".concat(String.valueOf(str));
                                                this.aV[this.aX] = 1773;
                                                this.aX++;
                                            }
                                            i3++;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    org.necrotic.client.f.c.i iVar = this.fa;
                                    int i7 = 0;
                                    for (int i8 = 0; i8 < 100 && q.W.length() != 0 && iVar.c != 0 && q.W != ""; i8++) {
                                        String c2 = c(iVar.d[i8]);
                                        for (int i9 = 0; i9 <= 20; i9++) {
                                            if (c2.contains(" <img=" + i9 + ">")) {
                                                c2 = c2.replaceAll(" <img=" + i9 + ">", "");
                                            }
                                        }
                                        int i10 = (21 + (i7 * 14)) - iVar.f;
                                        if (i2 > i10 - 14 && i2 <= i10 && q.bY > 74 && q.bY < 495) {
                                            q.aW[q.aX] = String.valueOf(c2);
                                            q.aV[q.aX] = 1251;
                                            q.aX++;
                                        }
                                        i7++;
                                    }
                                    return;
                                }
                            } else {
                                int i11 = 0;
                                for (int i12 = 0; i12 < 500; i12++) {
                                    if (this.aq[i12] != null && (this.ax == 3 || this.ax == 4)) {
                                        int i13 = this.aw[i12];
                                        String str3 = this.ar[i12];
                                        int i14 = (70 - (i11 * 14)) + 42 + i + 4 + 5;
                                        if (i14 < -23) {
                                            return;
                                        }
                                        if (str3 != null) {
                                            if (str3.indexOf("@") == 0) {
                                                str3 = str3.substring(d(str3));
                                            }
                                            if (str3.indexOf("@") == 0) {
                                                str3 = str3.substring(d(str3));
                                            }
                                        }
                                        if (this.ax == 3 && i13 == 4 && (this.bB == 0 || (this.bB == 1 && e(str3)))) {
                                            if (i2 > i14 - 14 && i2 <= i14) {
                                                this.aW[this.aX] = "Accept trade @whi@".concat(String.valueOf(str3));
                                                this.aV[this.aX] = 484;
                                                this.aX++;
                                            }
                                            i11++;
                                        }
                                        if (this.ax == 4 && i13 == 8 && (this.bH == 0 || (this.bH == 1 && e(str3)))) {
                                            if (i2 > i14 - 14 && i2 <= i14) {
                                                this.aW[this.aX] = "Accept challenge @whi@".concat(String.valueOf(str3));
                                                this.aV[this.aX] = 6;
                                                this.aX++;
                                            }
                                            i11++;
                                        }
                                        if (i13 == 12) {
                                            if (i2 > i14 - 14 && i2 <= i14) {
                                                this.aW[this.aX] = "Go-to @blu@".concat(String.valueOf(str3));
                                                this.aV[this.aX] = 915;
                                                this.aX++;
                                            }
                                            i11++;
                                        }
                                        if (i13 == 21) {
                                            if (i2 > i14 - 14 && i2 <= i14) {
                                                this.aW[this.aX] = "Accept gamble @whi@".concat(String.valueOf(str3));
                                                this.aV[this.aX] = 1673;
                                                this.aX++;
                                            }
                                            i11++;
                                        }
                                        if (i13 == 22) {
                                            if (i2 > i14 - 14 && i2 <= i14) {
                                                this.aW[this.aX] = "Accept raid request @whi@".concat(String.valueOf(str3));
                                                this.aV[this.aX] = 1773;
                                                this.aX++;
                                            }
                                            i11++;
                                        }
                                    }
                                }
                                return;
                            }
                        } else {
                            int i15 = 0;
                            for (int i16 = 0; i16 < 500; i16++) {
                                if (this.aq[i16] != null && this.ax == 2) {
                                    int i17 = this.aw[i16];
                                    String str4 = this.ar[i16];
                                    int i18 = (70 - (i15 * 14)) + 42 + i + 4 + 5;
                                    if (i18 < -23) {
                                        return;
                                    }
                                    if (str4 != null) {
                                        if (str4.indexOf("@") == 0) {
                                            str4 = str4.substring(d(this.iL));
                                        }
                                        if (str4.indexOf("@") == 0) {
                                            str4 = str4.substring(d(this.iL));
                                        }
                                    }
                                    if ((i17 == 5 || i17 == 6) && ((this.by == 0 || this.ax == 2) && (i17 == 6 || this.bt == 0 || (this.bt == 1 && e(str4))))) {
                                        i15++;
                                    }
                                    if ((i17 == 3 || i17 == 7) && ((this.by == 0 || this.ax == 2) && (i17 == 7 || this.bt == 0 || (this.bt == 1 && e(str4))))) {
                                        if (i2 > i18 - 14 && i2 <= i18) {
                                            if (!e(str4)) {
                                                this.aW[this.aX] = "Add ignore @whi@".concat(String.valueOf(str4));
                                                this.aV[this.aX] = 42;
                                                this.aX++;
                                                this.aW[this.aX] = "Add friend @whi@".concat(String.valueOf(str4));
                                                this.aV[this.aX] = 337;
                                                this.aX++;
                                            } else if (e(str4)) {
                                                this.aW[this.aX] = "Message @whi@".concat(String.valueOf(str4));
                                                this.aV[this.aX] = 2639;
                                                this.aX++;
                                            }
                                        }
                                        i15++;
                                    }
                                }
                            }
                            return;
                        }
                    } else {
                        int i19 = 0;
                        for (int i20 = 0; i20 < 500; i20++) {
                            if (this.aq[i20] != null && this.ax == 1) {
                                int i21 = this.aw[i20];
                                String str5 = this.ar[i20];
                                int i22 = (70 - (i19 * 14)) + 42 + i + 4 + 5;
                                if (i22 < -23) {
                                    return;
                                }
                                if (str5 != null) {
                                    if (str5.indexOf("@") == 0) {
                                        str5 = str5.substring(d(str5));
                                    }
                                    if (str5.indexOf("@") == 0) {
                                        str5 = str5.substring(d(str5));
                                    }
                                }
                                if ((i21 == 1 || i21 == 2) && (i21 == 1 || this.bw == 0 || (this.bw == 1 && e(str5)))) {
                                    if (i2 > i22 - 14 && i2 <= i22 && !str5.equals(t.y)) {
                                        if (!e(str5)) {
                                            this.aW[this.aX] = "Add ignore @whi@".concat(String.valueOf(str5));
                                            this.aV[this.aX] = 42;
                                            this.aX++;
                                            this.aW[this.aX] = "Add friend @whi@".concat(String.valueOf(str5));
                                            this.aV[this.aX] = 337;
                                            this.aX++;
                                        } else if (e(str5)) {
                                            this.aW[this.aX] = "Message @whi@".concat(String.valueOf(str5));
                                            this.aV[this.aX] = 2639;
                                            this.aX++;
                                        }
                                    }
                                    i19++;
                                }
                            }
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    private boolean a(aa aaVar) {
        int i2;
        int i3 = aaVar.X;
        if ((i3 > 0 && i3 <= 200) || (i3 >= 701 && i3 <= 900)) {
            if (i3 >= 801) {
                i2 = i3 - 701;
            } else if (i3 >= 701) {
                i2 = i3 - 601;
            } else if (i3 >= 101) {
                i2 = i3 - 101;
            } else {
                i2 = i3 - 1;
            }
            this.aW[this.aX] = "Remove @whi@" + this.hX[i2];
            this.aV[this.aX] = 792;
            this.aX++;
            this.aW[this.aX] = "Message @whi@" + this.hX[i2];
            this.aV[this.aX] = 639;
            this.aX++;
            return true;
        } else if (i3 >= 401 && i3 <= 500) {
            this.aW[this.aX] = "Remove @whi@" + aaVar.an;
            this.aV[this.aX] = 322;
            this.aX++;
            return true;
        } else {
            return false;
        }
    }

    private static void a(int i2, int i3, org.necrotic.client.f.e eVar) {
        for (int i4 = -20; i4 <= 20; i4++) {
            for (int i5 = -20; i5 <= 20; i5++) {
                int i6 = i4;
                int i7 = i5;
                if ((i6 * i6) + (i7 * i7) < 400) {
                    int i8 = i2 + i4;
                    int i9 = i3 + i5;
                    if (i8 >= 0 && i8 < eVar.d && i9 >= 0 && i9 < eVar.e) {
                        eVar.c[i8 + (i9 * eVar.d)] = 0;
                    }
                }
            }
        }
    }

    private void a(int i2, aa aaVar, int i3, int i4, int i5, int i6) {
        if (aaVar == null) {
            aaVar = aa.u[21356];
        }
        if (aaVar.aK != 0 || aaVar.U == null || aaVar.ad || !aaVar.j() || i3 < i2 || i5 < i4 || i3 > i2 + aaVar.aO || i5 > i4 + aaVar.aa) {
            return;
        }
        int length = aaVar.U.length;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = (aaVar.V[i7] + i2) - (aaVar.av ? i6 : 0);
            int i9 = (aaVar.W[i7] + i4) - (aaVar.av ? 0 : i6);
            aa aaVar2 = aa.u[aaVar.U[i7]];
            if (aaVar2 != null) {
                int i10 = i8 + aaVar2.aP;
                int i11 = i9 + aaVar2.aQ;
                if (this.bQ != 0) {
                    i3 = this.bR;
                    i5 = this.bS;
                }
                if ((aaVar2.ab >= 0 || aaVar2.K != 0) && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                    if (aaVar2.ab >= 0) {
                        this.gX = aaVar2.ab;
                    } else {
                        this.gX = aaVar2.ac;
                    }
                }
                if ((aaVar2.aK == 8 || aaVar2.aK == 10) && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                    this.gT = aaVar2.ac;
                    if (aaVar2.ac != this.fr) {
                        this.fr = aaVar2.ac;
                    }
                }
                if (aaVar2.aK == 0) {
                    a(i10, aaVar2, i3, i11, i5, aaVar2.aw);
                    if (aaVar2.av) {
                        if (aaVar2.au > aaVar2.aO) {
                            a(i10, aaVar2.aO, i3, i5, aaVar2, i11 + aaVar2.aa, aaVar2.au);
                        }
                    } else if (aaVar2.au > aaVar2.aa) {
                        a(i10 + aaVar2.aO, aaVar2.aa, i3, i5, aaVar2, i11, true, aaVar2.au);
                    }
                } else {
                    if (aaVar2.aK == 100 && E && aaVar2.g != null && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        a(this.bY - i10, this.bZ - i11, aaVar2.g);
                    }
                    aaVar2.i = false;
                    if (aaVar2.h && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        aaVar2.i = true;
                        if (aaVar2.S == 0) {
                            String str = aaVar2.aI;
                            String str2 = str;
                            if (str != null) {
                                if ((this.be == 4 || this.be == 3) && !str2.isEmpty()) {
                                    str2 = str2 + " - Id: " + aaVar2.ac;
                                }
                                this.aW[this.aX] = str2;
                                this.aV[this.aX] = 777;
                                this.iB[this.aX] = aaVar2.ac;
                                this.aX++;
                            }
                        }
                    }
                    if (aaVar2.S == 1 && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa && (aaVar2.as < 113500 || aaVar2.as >= 114000 || !aaVar2.an.equalsIgnoreCase(""))) {
                        if (aaVar2.aK == 42) {
                            dn = aaVar2;
                        }
                        boolean z2 = false;
                        if (aaVar2.X != 0) {
                            z2 = a(aaVar2);
                        }
                        if (!z2) {
                            if (aaVar2.H != null) {
                                for (int length2 = aaVar2.H.length - 1; length2 >= 0; length2--) {
                                    String str3 = aaVar2.H[length2];
                                    if (str3 != null) {
                                        this.aW[this.aX] = str3;
                                        this.aV[this.aX] = 222;
                                        this.iB[this.aX] = aaVar2.ac;
                                        this.jx = this.aX;
                                        this.aX++;
                                    }
                                }
                            }
                            String str4 = aaVar2.aI;
                            String str5 = str4;
                            if (str4 != null) {
                                if (this.be == 4) {
                                    str5 = str5 + " - Id: " + aaVar2.ac;
                                }
                                if (!str5.contains("[GE")) {
                                    this.aW[this.aX] = str5;
                                    this.aV[this.aX] = 315;
                                    this.iB[this.aX] = aaVar2.ac;
                                    this.aX++;
                                }
                            }
                        }
                    }
                    if (aaVar2.S == 2 && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        String str6 = aaVar2.ay;
                        String str7 = str6;
                        if (str6.indexOf(" ") != -1) {
                            str7 = str7.substring(0, str7.indexOf(" "));
                        }
                        if (aaVar2.az.endsWith("Rush") || aaVar2.az.endsWith("Burst") || aaVar2.az.endsWith("Blitz") || aaVar2.az.endsWith("Barrage") || aaVar2.az.endsWith("strike") || aaVar2.az.endsWith("bolt") || aaVar2.az.equals("Crumble undead") || aaVar2.az.endsWith("blast") || aaVar2.az.endsWith("wave") || aaVar2.az.equals("Claws of Guthix") || aaVar2.az.equals("Flames of Zamorak") || aaVar2.az.equals("Magic Dart")) {
                            this.aW[this.aX] = "Autocast @gre@" + aaVar2.az;
                            this.aV[this.aX] = 104;
                            this.iB[this.aX] = aaVar2.ac;
                            this.aX++;
                        }
                        this.aW[this.aX] = str7 + " @gre@" + aaVar2.az + (this.be == 4 ? ", " + aaVar2.ac : "");
                        this.aV[this.aX] = 626;
                        this.iB[this.aX] = aaVar2.ac;
                        this.aX++;
                    }
                    if (aaVar2.S == 3 && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        this.aW[this.aX] = "Close";
                        this.aV[this.aX] = 200;
                        this.iB[this.aX] = aaVar2.ac;
                        this.aX++;
                    }
                    if (aaVar2.S == 4 && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        this.aW[this.aX] = aaVar2.aI + (this.be == 4 ? ", " + aaVar2.ac : "");
                        this.aV[this.aX] = 169;
                        this.iB[this.aX] = aaVar2.ac;
                        this.aX++;
                        String str8 = aaVar2.aJ;
                    }
                    if (aaVar2.S == 5 && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        dn = aaVar2;
                        this.aW[this.aX] = aaVar2.aI + (this.be == 4 ? ", " + aaVar2.ac : "");
                        this.aV[this.aX] = 646;
                        this.iB[this.aX] = aaVar2.ac;
                        this.aX++;
                    }
                    if (aaVar2.S == 6 && !this.ev && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        this.aW[this.aX] = aaVar2.aI + (this.be == 4 ? ", " + aaVar2.ac : "");
                        this.aV[this.aX] = 679;
                        this.iB[this.aX] = aaVar2.ac;
                        this.aX++;
                    }
                    if (aaVar2.aK == 2 && aaVar2.as != 0) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < aaVar2.aa; i13++) {
                            for (int i14 = 0; i14 < aaVar2.aO; i14++) {
                                int i15 = i10 + (i14 * (32 + aaVar2.af));
                                int i16 = i11 + (i13 * (32 + aaVar2.ag));
                                if (i12 < aaVar2.aD.length) {
                                    i15 += aaVar2.aD[i12];
                                    i16 += aaVar2.aE[i12];
                                }
                                if (i3 >= i15 && i5 >= i16 && i3 < i15 + 32 && i5 < i16 + 32) {
                                    this.iH = i12;
                                    this.ik = aaVar2.ac;
                                    if (aaVar2.ae[i12] > 0) {
                                        int i17 = aaVar2.ae[i12] - 1;
                                        if (i17 <= org.necrotic.client.c.a.i.g) {
                                            org.necrotic.client.c.a.i a2 = org.necrotic.client.c.a.i.a(i17);
                                            this.jU = aaVar2.ae[i12] - 1;
                                            if (this.jU != this.fe) {
                                                a(a2);
                                                this.fe = aaVar2.ae[i12] - 1;
                                                this.ff = true;
                                            }
                                            if (this.eH == 1 && aaVar2.ak) {
                                                if (aaVar2.ac != this.gR || i12 != this.gQ) {
                                                    this.aW[this.aX] = "Use " + this.iT + " with @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                    this.aV[this.aX] = 870;
                                                    this.iz[this.aX] = a2.w;
                                                    this.iA[this.aX] = i12;
                                                    this.iB[this.aX] = aaVar2.ac;
                                                    this.aX++;
                                                }
                                            } else if (this.eP == 1 && aaVar2.ak) {
                                                if ((this.iX & 16) == 16) {
                                                    this.aW[this.aX] = this.iW + " @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                    this.aV[this.aX] = 543;
                                                    this.iz[this.aX] = a2.w;
                                                    this.iA[this.aX] = i12;
                                                    this.iB[this.aX] = aaVar2.ac;
                                                    this.aX++;
                                                }
                                            } else {
                                                if (aaVar2.ak && ((!f || !cu) && u != 24700 && u != 2700)) {
                                                    for (int i18 = 4; i18 >= 3; i18--) {
                                                        if (a2.j != null && a2.j[i18] != null) {
                                                            this.aW[this.aX] = a2.j[i18] + " @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                            if (i18 == 3) {
                                                                this.aV[this.aX] = 493;
                                                            }
                                                            if (i18 == 4) {
                                                                this.aV[this.aX] = 847;
                                                            }
                                                            this.iz[this.aX] = a2.w;
                                                            this.iA[this.aX] = i12;
                                                            this.iB[this.aX] = aaVar2.ac;
                                                            this.aX++;
                                                        } else if (i18 == 4) {
                                                            this.aW[this.aX] = "Drop @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                            this.aV[this.aX] = 847;
                                                            this.iz[this.aX] = a2.w;
                                                            this.iA[this.aX] = i12;
                                                            this.iB[this.aX] = aaVar2.ac;
                                                            this.aX++;
                                                        }
                                                    }
                                                }
                                                if (aaVar2.aL) {
                                                    if (u == 24700) {
                                                        this.aW[this.aX] = "Offer @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                        this.aV[this.aX] = 24700;
                                                        this.iz[this.aX] = a2.w;
                                                        p().a = a2.w;
                                                    } else if (u == 2700) {
                                                        this.aW[this.aX] = "Store @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                        this.aV[this.aX] = 2700;
                                                        this.iz[this.aX] = a2.w;
                                                    } else {
                                                        this.aW[this.aX] = "Use @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                        this.aV[this.aX] = 447;
                                                        this.iz[this.aX] = a2.w;
                                                    }
                                                    this.iA[this.aX] = i12;
                                                    this.iB[this.aX] = aaVar2.ac;
                                                    this.aX++;
                                                }
                                                if (u != 24700 && aaVar2.ak && a2.j != null) {
                                                    for (int i19 = 2; i19 >= 0; i19--) {
                                                        if (a2.j[i19] != null) {
                                                            this.aW[this.aX] = a2.j[i19] + " @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                            if (i19 == 0) {
                                                                this.aV[this.aX] = 74;
                                                            }
                                                            if (i19 == 1) {
                                                                this.aV[this.aX] = 454;
                                                            }
                                                            if (i19 == 2) {
                                                                this.aV[this.aX] = 539;
                                                            }
                                                            this.iz[this.aX] = a2.w;
                                                            this.iA[this.aX] = i12;
                                                            this.iB[this.aX] = aaVar2.ac;
                                                            this.aX++;
                                                        }
                                                    }
                                                }
                                                if (aaVar2.ak && f && cu) {
                                                    for (int i20 = 4; i20 >= 3; i20--) {
                                                        if (a2.j != null && a2.j[i20] != null) {
                                                            this.aW[this.aX] = a2.j[i20] + " @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                            if (i20 == 3) {
                                                                this.aV[this.aX] = 493;
                                                            }
                                                            if (i20 == 4) {
                                                                this.aV[this.aX] = 847;
                                                            }
                                                            this.iz[this.aX] = a2.w;
                                                            this.iA[this.aX] = i12;
                                                            this.iB[this.aX] = aaVar2.ac;
                                                            this.aX++;
                                                        } else if (i20 == 4) {
                                                            this.aW[this.aX] = "Drop @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                            this.aV[this.aX] = 847;
                                                            this.iz[this.aX] = a2.w;
                                                            this.iA[this.aX] = i12;
                                                            this.iB[this.aX] = aaVar2.ac;
                                                            this.aX++;
                                                        }
                                                    }
                                                } else if (aaVar2.H != null) {
                                                    int i21 = aaVar2.ac;
                                                    for (int i22 = 4; i22 >= 0; i22--) {
                                                        if ((aaVar2.H[i22] != null && !aaVar2.H[i22].equalsIgnoreCase("operate")) || (a2.k[this.aX] != null && aaVar2.ac == 1688)) {
                                                            if (aaVar2.ac == 1688) {
                                                                if (a2.k[this.aX] != null) {
                                                                    this.aW[this.aX] = a2.k[this.aX] + " @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                                } else if (aaVar2.H[i22] != null) {
                                                                    this.aW[this.aX] = aaVar2.H[i22] + " @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                                }
                                                                if (i22 == 0) {
                                                                    this.aV[this.aX] = 632;
                                                                }
                                                                if (i22 == 1) {
                                                                    this.aV[this.aX] = 661;
                                                                }
                                                                if (i22 == 2) {
                                                                    this.aV[this.aX] = 662;
                                                                }
                                                                if (i22 == 3) {
                                                                    this.aV[this.aX] = 663;
                                                                }
                                                                if (i22 == 4) {
                                                                    this.aV[this.aX] = 664;
                                                                }
                                                            } else {
                                                                this.aW[this.aX] = aaVar2.H[i22] + " @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                                if (i22 == 0) {
                                                                    this.aV[this.aX] = 632;
                                                                }
                                                                if (i22 == 1) {
                                                                    this.aV[this.aX] = 78;
                                                                }
                                                                if (i22 == 2) {
                                                                    this.aV[this.aX] = 867;
                                                                }
                                                                if (i22 == 3) {
                                                                    this.aV[this.aX] = 431;
                                                                }
                                                                if (i22 == 4) {
                                                                    this.aV[this.aX] = 53;
                                                                }
                                                                if (i22 == 5) {
                                                                    this.aV[this.aX] = 54;
                                                                }
                                                            }
                                                            if ((aaVar2.as == 5292 || aaVar2.as == 5063) && aaVar2.H.length > 5 && i22 == 6) {
                                                                this.aV[this.aX] = 300;
                                                            }
                                                            this.iz[this.aX] = a2.w;
                                                            this.iA[this.aX] = i12;
                                                            this.iB[this.aX] = i21;
                                                            this.aX++;
                                                        }
                                                    }
                                                }
                                                if (u != 24700) {
                                                    if (!aaVar2.aS && aaVar2.o) {
                                                        this.aW[this.aX] = "Examine @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                        this.aV[this.aX] = 1125;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                    } else if (aaVar2.as == 3822 && u == 3824) {
                                                        this.aW[this.aX] = "Sell All @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                        this.aV[this.aX] = 1126;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                    }
                                                    if (aaVar2.ac == 39672 && ct) {
                                                        this.aW[this.aX] = "Claim @lre@" + a2.G;
                                                        this.aV[this.aX] = 431;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                    }
                                                    if (aaVar2.ac == 39673 && ct) {
                                                        this.aW[this.aX] = "Claim @lre@" + a2.G;
                                                        this.aV[this.aX] = 431;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                    }
                                                    if (aaVar2.ac == 39674 && ct) {
                                                        this.aW[this.aX] = "Claim @lre@" + a2.G;
                                                        this.aV[this.aX] = 431;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                    }
                                                    if (aaVar2.ac == 32621) {
                                                        this.aW[this.aX] = "Buy X @lre@" + a2.G;
                                                        this.aV[this.aX] = 431;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                        this.aW[this.aX] = "Buy 10 @lre@" + a2.G;
                                                        this.aV[this.aX] = 300;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                        this.aW[this.aX] = "Buy 5 @lre@" + a2.G;
                                                        this.aV[this.aX] = 291;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                        this.aW[this.aX] = "Buy 1 @lre@" + a2.G;
                                                        this.aV[this.aX] = 867;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                        this.aW[this.aX] = "Value @lre@" + a2.G;
                                                        this.aV[this.aX] = 632;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                    }
                                                    if (aaVar2.ac == 33621) {
                                                        this.aW[this.aX] = "Set price @lre@" + a2.G;
                                                        this.aV[this.aX] = 78;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                        this.aW[this.aX] = "Withdraw X @lre@" + a2.G;
                                                        this.aV[this.aX] = 431;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                        this.aW[this.aX] = "Withdraw 10 @lre@" + a2.G;
                                                        this.aV[this.aX] = 300;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                        this.aW[this.aX] = "Withdraw 5 @lre@" + a2.G;
                                                        this.aV[this.aX] = 291;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                        this.aW[this.aX] = "Withdraw 1 @lre@" + a2.G;
                                                        this.aV[this.aX] = 867;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                        this.aW[this.aX] = "Value @lre@" + a2.G;
                                                        this.aV[this.aX] = 632;
                                                        this.iz[this.aX] = a2.w;
                                                        this.iA[this.aX] = i12;
                                                        this.iB[this.aX] = aaVar2.ac;
                                                        this.aX++;
                                                    }
                                                }
                                                ArrayList<Integer> arrayList = new ArrayList<Integer>() { // from class: org.necrotic.client.Client.2
                                                    {
                                                        add(1);
                                                        add(2);
                                                    }
                                                };
                                                this.jU = a2.w;
                                                if (this.jU >= 0 && !arrayList.contains(Integer.valueOf(u))) {
                                                    int i23 = this.bZ;
                                                    int i24 = this.bY;
                                                    int i25 = aa.u[94021].aO;
                                                    int i26 = aa.u[94086].aO;
                                                    if (w.a[this.jU] != null && w.a[this.jU].i == 1) {
                                                        if (i24 + i25 > 500) {
                                                            i24 = 500 - i25;
                                                        }
                                                        if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED && i23 > 180) {
                                                            i23 = 180;
                                                        }
                                                    }
                                                    if (g && w.a[this.jU] != null && w.a[this.jU].i == 1) {
                                                        a(0, i24, aa.u[94000], i23);
                                                    } else {
                                                        a(0, i24, aa.u[94020], i23);
                                                    }
                                                }
                                                if (u == 5292 && aaVar2.ah[i12] == 0) {
                                                    this.aX = 3;
                                                    this.aW[0] = "Cancel";
                                                    this.aV[0] = 1107;
                                                    this.iz[0] = a2.w;
                                                    this.iA[0] = i12;
                                                    this.iB[0] = aaVar2.ac;
                                                    if (aaVar2.o) {
                                                        this.aW[1] = "Examine @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                        this.aV[1] = 1125;
                                                        this.iz[1] = a2.w;
                                                        this.iA[1] = i12;
                                                        this.iB[1] = aaVar2.ac;
                                                    }
                                                    this.aW[2] = "Release @lre@" + a2.G + (this.be == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                    this.aV[2] = 633;
                                                    this.iz[2] = a2.w;
                                                    this.iA[2] = i12;
                                                    this.iB[2] = aaVar2.ac;
                                                }
                                            }
                                        }
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                }
            }
        }
    }

    private void R() {
        if (this.by == 0) {
            return;
        }
        int i2 = 0;
        if (this.eC != 0) {
            i2 = 0 + 1;
        }
        if (this.fu != 0) {
            i2++;
        }
        for (int i3 = 0; i3 < 500; i3++) {
            if (this.aq[i3] != null) {
                int i4 = this.aw[i3];
                String str = this.ar[i3];
                boolean z2 = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED;
                if (str != null && str.indexOf("@") == 0) {
                    str = cr.matcher(str).replaceAll("");
                }
                if ((i4 == 3 || i4 == 7) && (i4 == 7 || this.bt == 0 || (this.bt == 1 && e(str)))) {
                    int h2 = (this.bN.h() - 9) - (i2 * 13);
                    if (this.bY > (z2 ? 4 : 0)) {
                        if (this.bZ - (z2 ? 4 : 0) > h2 - 10) {
                            if (this.bZ - (z2 ? 4 : 0) <= h2 + 3) {
                                int a2 = this.bk.a("From:  " + str + this.aq[i3]) + 25;
                                int i5 = a2;
                                if (a2 > 450) {
                                    i5 = 450;
                                }
                                if (this.bY < (z2 ? 4 : 0) + i5) {
                                    if (!e(str)) {
                                        this.aW[this.aX] = "Add ignore @whi@".concat(String.valueOf(str));
                                        this.aV[this.aX] = 2042;
                                        this.aX++;
                                        this.aW[this.aX] = "Add friend @whi@".concat(String.valueOf(str));
                                        this.aV[this.aX] = 2337;
                                        this.aX++;
                                    } else if (e(str)) {
                                        this.aW[this.aX] = "Message @whi@".concat(String.valueOf(str));
                                        this.aV[this.aX] = 2639;
                                        this.aX++;
                                    }
                                }
                            }
                        }
                    }
                    i2++;
                    if (i2 >= 5) {
                        return;
                    }
                }
                if ((i4 == 5 || i4 == 6) && this.bt < 2) {
                    i2++;
                    if (i2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    private void S() {
        int i2 = (this.gx << 7) + 64;
        int i3 = (this.gy << 7) + 64;
        int b2 = b(this.bp, i3, i2) - this.gz;
        if (this.bD < i2) {
            this.bD += this.gA + (((i2 - this.bD) * this.gB) / 1000);
            if (this.bD > i2) {
                this.bD = i2;
            }
        }
        if (this.bD > i2) {
            this.bD -= this.gA + (((this.bD - i2) * this.gB) / 1000);
            if (this.bD < i2) {
                this.bD = i2;
            }
        }
        if (this.bF < b2) {
            this.bF += this.gA + (((b2 - this.bF) * this.gB) / 1000);
            if (this.bF > b2) {
                this.bF = b2;
            }
        }
        if (this.bF > b2) {
            this.bF -= this.gA + (((this.bF - b2) * this.gB) / 1000);
            if (this.bF < b2) {
                this.bF = b2;
            }
        }
        if (this.bE < i3) {
            this.bE += this.gA + (((i3 - this.bE) * this.gB) / 1000);
            if (this.bE > i3) {
                this.bE = i3;
            }
        }
        if (this.bE > i3) {
            this.bE -= this.gA + (((this.bE - i3) * this.gB) / 1000);
            if (this.bE < i3) {
                this.bE = i3;
            }
        }
        int i4 = (this.hi << 7) + 64;
        int i5 = (this.hj << 7) + 64;
        int b3 = b(this.bp, i5, i4) - this.hk;
        int i6 = i4 - this.bD;
        int i7 = b3 - this.bF;
        int i8 = i5 - this.bE;
        int atan2 = ((int) (Math.atan2(i7, (int) Math.sqrt((i6 * i6) + (i8 * i8))) * 325.949d)) & 2047;
        int atan22 = ((int) (Math.atan2(i6, i8) * (-325.949d))) & 2047;
        if (atan2 < 128) {
            atan2 = 128;
        }
        if (atan2 > 383) {
            atan2 = 383;
        }
        if (this.eS < atan2) {
            this.eS += this.hl + (((atan2 - this.eS) * this.hm) / 1000);
            if (this.eS > atan2) {
                this.eS = atan2;
            }
        }
        if (this.eS > atan2) {
            this.eS -= this.hl + (((this.eS - atan2) * this.hm) / 1000);
            if (this.eS < atan2) {
                this.eS = atan2;
            }
        }
        int i9 = atan22 - this.eR;
        int i10 = i9;
        if (i9 > 1024) {
            i10 -= 2048;
        }
        if (i10 < -1024) {
            i10 += 2048;
        }
        if (i10 > 0) {
            this.eR += this.hl + ((i10 * this.hm) / 1000);
            this.eR &= 2047;
        }
        if (i10 < 0) {
            this.eR -= this.hl + (((-i10) * this.hm) / 1000);
            this.eR &= 2047;
        }
        int i11 = atan22 - this.eR;
        int i12 = i11;
        if (i11 > 1024) {
            i12 -= 2048;
        }
        if (i12 < -1024) {
            i12 += 2048;
        }
        if ((i12 < 0 && i10 > 0) || (i12 > 0 && i10 < 0)) {
            this.eR = atan22;
        }
    }

    private void a(int i2, int i3, int i4) {
        if (i2 < 128 || i4 < 128 || i2 > 13056 || i4 > 13056) {
            this.iY = -1;
            this.iZ = -1;
            return;
        }
        int b2 = b(this.bp, i4, i2) - i3;
        int i5 = i2 - this.bD;
        int i6 = b2 - this.bF;
        int i7 = i4 - this.bE;
        int i8 = org.necrotic.client.n.l.e[this.eS];
        int i9 = org.necrotic.client.n.l.f[this.eS];
        int i10 = org.necrotic.client.n.l.e[this.eR];
        int i11 = org.necrotic.client.n.l.f[this.eR];
        int i12 = ((i7 * i10) + (i5 * i11)) >> 16;
        int i13 = ((i7 * i11) - (i5 * i10)) >> 16;
        int i14 = ((i6 * i9) - (i13 * i8)) >> 16;
        int i15 = ((i6 * i8) + (i13 * i9)) >> 16;
        if (i15 >= 50) {
            this.iY = org.necrotic.client.n.l.z + ((i12 << r) / i15);
            this.iZ = org.necrotic.client.n.l.A + ((i14 << r) / i15);
            return;
        }
        this.iY = -1;
        this.iZ = -1;
    }

    private static void c(long j2) {
        if (j2 == 0) {
            return;
        }
        try {
            dk.i(60);
            dk.a(j2);
        } catch (RuntimeException e2) {
            ae.a("47229, 3, " + j2 + ", " + e2.toString());
            throw new RuntimeException();
        }
    }

    @Override // org.necrotic.client.r
    public final void g() {
        ae.e = false;
        this.fz = null;
        try {
            if (this.hI != null) {
                this.hI.b();
            }
            F.close();
            F = null;
        } catch (Exception unused) {
        }
        this.hI = null;
        if (this.bo != null) {
            this.bo.a();
        }
        this.bo = null;
        this.hx = null;
        dk = null;
        this.in = null;
        this.ih = null;
        this.hn = null;
        this.fV = null;
        this.fW = null;
        this.hV = null;
        this.iN = null;
        this.ij = null;
        this.hF = null;
        this.jm = null;
        this.fX = null;
        this.hr = null;
        this.hq = null;
        this.hD = null;
        this.hE = null;
        this.fU = null;
        this.bA = null;
        this.il = null;
        this.jg = null;
        this.iQ = null;
        this.aM = null;
        this.aH = null;
        this.ap = null;
        this.hv = null;
        this.it = null;
        this.az = null;
        this.ie = null;
        this.iV = null;
        this.f1if = null;
        this.hK = null;
        this.aP = null;
        this.aQ = null;
        this.aR = null;
        this.aO = null;
        this.aS = null;
        this.aN = null;
        this.el = null;
        this.em = null;
        this.en = null;
        this.ix = null;
        this.iw = null;
        this.hs = null;
        this.bq = null;
        this.bs = null;
        this.hp = null;
        this.hy = null;
        this.ho = null;
        this.bl = null;
        this.bn = null;
        this.aI = null;
        this.ga = null;
        this.fY = null;
        this.fZ = null;
        this.iA = null;
        this.iB = null;
        this.jC = null;
        this.jD = null;
        this.aV = null;
        this.iz = null;
        this.aW = null;
        this.bO = null;
        this.ae = null;
        this.af = null;
        this.V = null;
        this.bb = null;
        this.hX = null;
        this.aF = null;
        this.aG = null;
        this.hu = null;
        this.jc = null;
        this.iI = null;
        this.iJ = null;
        an();
        org.necrotic.client.c.a.k.a();
        org.necrotic.client.c.a.j.a();
        org.necrotic.client.c.a.i.a();
        p.a();
        org.necrotic.client.c.a.e.a = null;
        aa.u = null;
        org.necrotic.client.c.a.a.a = null;
        org.necrotic.client.c.a.m.b = null;
        org.necrotic.client.c.a.m.a = null;
        org.necrotic.client.c.a.o.a((org.necrotic.client.c.a.o[]) null);
        this.bU = null;
        org.necrotic.client.e.a.a.c = null;
        org.necrotic.client.n.l.i();
        org.necrotic.client.n.m.a();
        org.necrotic.client.n.d.d();
        org.necrotic.client.n.p.a();
        System.gc();
    }

    public static Socket f(int i2) {
        return new Socket(InetAddress.getByName(""), 9420);
    }

    private static Socket T() {
        return new Socket(InetAddress.getByName(org.necrotic.a.a()), 43216);
    }

    private void a(int i2, int i3, int i4, org.necrotic.client.j.c cVar) {
        if (i2 >= 0) {
            if (i4 == 1) {
                i3 -= 20;
            }
            if (i4 == 2) {
                i2 -= 15;
                i3 -= 10;
            }
            if (i4 == 3) {
                i2 += 15;
                i3 -= 10;
            }
            long j2 = cVar.aw[i4];
            long j3 = j2;
            if (j2 > 0) {
                if (!org.necrotic.a.i) {
                    long j4 = j3 / 10;
                    j3 = j4;
                    if (j4 == 0) {
                        j3 = 1;
                    }
                }
                F.a(784).e(i2 - 11, i3 - 12);
            } else {
                F.a(785).e(i2 - 12, i3 - 13);
            }
            this.bx.a(0, String.valueOf(j3), i3 + 4, i2);
            this.bx.a(16777215, String.valueOf(j3), i3 + 3, i2 - 1);
        }
    }

    private static String d(long j2) {
        if (j2 < 1000) {
            return String.valueOf(j2);
        }
        if (j2 < 100000) {
            return (j2 / 1000) + "K";
        }
        if (j2 < 1000000) {
            return (j2 / 1000) + "K";
        }
        return (j2 / 1000000) + "M";
    }

    private void a(org.necrotic.client.j.c cVar, int i2, int i3, int i4, long j2, long j3, int i5, int i6, int i7) {
        if (this.iY >= 0) {
            int i8 = 0;
            if (i7 == 0) {
                cVar.aU[0] = this.iZ + i5;
                i8 = cVar.aU[0];
            }
            if (i7 != 0) {
                int[] iArr = cVar.aU;
                iArr[i7] = iArr[0] + (i7 * 19);
                i8 = cVar.aU[i7];
            }
            if (j3 > 0) {
                j3 = 0;
            }
            if (j2 > 0) {
                int i9 = 0;
                if (!org.necrotic.a.i) {
                    long j4 = j2 / 10;
                    j2 = j4;
                    if (j4 == 0) {
                        j2 = 1;
                    }
                }
                switch (i2) {
                    case 1:
                        i9 = 8;
                        break;
                    case 2:
                        i9 = 4;
                        break;
                    case 3:
                        i9 = 1;
                        break;
                }
                if (j3 > 0) {
                    i9 -= 16;
                }
                org.necrotic.client.f.e a2 = F.a(792 + (i3 * 3));
                org.necrotic.client.f.e a3 = F.a(792 + (i3 * 3) + 1);
                org.necrotic.client.f.e a4 = F.a(792 + (i3 * 3) + 2);
                if (i4 != 255 && i4 != 8) {
                    F.a(i4 + 786).d((this.iY - 31) + i9, i8 - 9, i6);
                }
                a2.d((this.iY - 12) + i9, i8 - 12, i6);
                int i10 = 0 + a2.d;
                int i11 = i9 + 3;
                for (int i12 = 0; i12 < i2 + 3; i12++) {
                    a3.d((this.iY - 12) + i11, i8 - 12, i6);
                    i10 += a3.d;
                    i11 += 3;
                }
                a4.d((this.iY - 12) + i11, i8 - 12, i6);
                int i13 = i10 + a4.d;
                org.necrotic.client.f.a.c cVar2 = i3 == 1 ? this.bk : this.bx;
                if (j2 < 1000) {
                    cVar2.a(6029107, d(j2), i8 + 3, (this.iY + (i13 / 8)) - (cVar2.a(d(j2)) / 5), i6);
                } else if (j2 < 10000) {
                    cVar2.a(6029107, d(j2), i8 + 3, (this.iY + (i13 / 8)) - (cVar2.a(d(j2)) / 5), i6);
                } else if (j2 < 100000) {
                    cVar2.a(6029107, d(j2), i8 + 3, (this.iY + (i13 / 8)) - (cVar2.a(d(j2)) / 10), i6);
                } else if (j2 < 1000000) {
                    cVar2.a(6029107, d(j2), i8 + 3, (this.iY + (i13 / 8)) - (cVar2.a(d(j2)) / 13), i6);
                } else if (j2 < 10000000) {
                    cVar2.a(16580403, d(j2), i8 + 3, (this.iY + (i13 / 8)) - (cVar2.a(d(j2)) / 17), i6);
                } else if (j2 < 100000000) {
                    cVar2.a(16580403, d(j2), i8 + 3, (this.iY + (i13 / 8)) - (cVar2.a(d(j2)) / 17), i6);
                } else if (j2 > 100000000) {
                    cVar2.a(16580403, d(j2), i8 + 3, (this.iY + (i13 / 8)) - (cVar2.a(d(j2)) / 100), i6);
                }
                if (j3 > 0) {
                    a(j3, i6, i8, i11);
                    return;
                }
                return;
            }
            F.a(543).d(this.iY - (j3 > 0 ? 26 : 12), i8 - 14, i6);
            if (j3 > 0) {
                a(j3, i6, i8, 4);
            }
        }
    }

    private void a(long j2, int i2, int i3, int i4) {
        int i5 = i4 - 12;
        int length = String.valueOf(j2).length();
        F.a(844).d(this.iY + i5, i3 - 12, i2);
        int i6 = i5 + 20;
        F.a(822).d(this.iY + i6, i3 - 12, i2);
        int i7 = i6 + 3;
        for (int i8 = 0; i8 < (length << 1); i8++) {
            F.a(823).d(this.iY + i7, i3 - 12, i2);
            i7 += 3;
        }
        F.a(824).d(this.iY + i7, i3 - 10, i2);
        if (j2 > 99) {
            i7 -= 5;
        }
        if (j2 > 999) {
            i7 -= 5;
        }
        this.jv.a(16777215, d(j2), i3 + 32, (this.iY - 8) + i7 + (length == 1 ? 5 : 0), i2);
    }

    private void e(long j2) {
        if (j2 == 0) {
            return;
        }
        int i2 = 0;
        while (i2 < this.aE) {
            try {
                if (this.aF[i2] != j2) {
                    i2++;
                } else {
                    this.aE--;
                    while (i2 < this.aE) {
                        String[] strArr = this.hX;
                        strArr[i2] = strArr[i2 + 1];
                        int[] iArr = this.aG;
                        iArr[i2] = iArr[i2 + 1];
                        long[] jArr = this.aF;
                        jArr[i2] = jArr[i2 + 1];
                        i2++;
                    }
                    dk.i(215);
                    dk.a(j2);
                    return;
                }
            } catch (RuntimeException e2) {
                ae.a("18622, false, " + j2 + ", " + e2.toString());
                throw new RuntimeException();
            }
        }
    }

    private void f(long j2) {
        if (j2 == 0) {
            return;
        }
        for (int i2 = 0; i2 < this.ig; i2++) {
            try {
                if (this.ea[i2] == j2) {
                    this.ig--;
                    System.arraycopy(this.ea, i2 + 1, this.ea, i2, this.ig - i2);
                    dk.i(74);
                    dk.a(j2);
                    return;
                }
            } catch (RuntimeException e2) {
                ae.a("47229, 3, " + j2 + ", " + e2.toString());
                throw new RuntimeException();
            }
        }
    }

    private void U() {
        int c2 = this.bi.c("Choose Option");
        for (int i2 = 0; i2 < this.aX; i2++) {
            int c3 = this.bi.c(this.aW[i2]);
            if (this.aW[i2].contains("<img=")) {
                c3 -= 36;
            }
            if (this.ej[i2] != null) {
                c3 += this.bi.c(this.ej[i2]);
            }
            if (this.eJ[i2] != null) {
                c3 += this.bi.c(this.eJ[i2]);
            }
            if (c3 > c2) {
                c2 = c3;
            }
        }
        int i3 = c2 + 8;
        int i4 = (15 * this.aX) + 21;
        if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
            if (this.cc > 4 && this.cd > 4 && this.cc < 516 && this.cd < 338) {
                int i5 = (this.cc - 4) - (i3 / 2);
                int i6 = i5;
                if (i5 + i3 > 512) {
                    i6 = 512 - i3;
                }
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = this.cd - 4;
                int i8 = i7;
                if (i7 + i4 > 334) {
                    i8 = 334 - i4;
                }
                if (i8 < 0) {
                    i8 = 0;
                }
                this.aY = true;
                this.aZ = 0;
                this.iD = i6;
                this.iE = i8;
                this.iF = i3;
                this.iC = (15 * this.aX) + 22;
            }
            if (this.cc > 519 && this.cd > 168 && this.cc < 765 && this.cd < 503) {
                int i9 = (this.cc - 519) - (i3 / 2);
                int i10 = i9;
                if (i9 < 0) {
                    i10 = 0;
                } else if (i10 + i3 > 245) {
                    i10 = 245 - i3;
                }
                int i11 = this.cd - 168;
                int i12 = i11;
                if (i11 < 0) {
                    i12 = 0;
                } else if (i12 + i4 > 333) {
                    i12 = 333 - i4;
                }
                this.aY = true;
                this.aZ = 1;
                this.iD = i10;
                this.iE = i12;
                this.iF = i3;
                this.iC = (15 * this.aX) + 22;
            }
            if (this.cc > 0 && this.cd > 338 && this.cc < 516 && this.cd < 503) {
                int i13 = this.cc - (i3 / 2);
                int i14 = i13;
                if (i13 < 0) {
                    i14 = 0;
                } else if (i14 + i3 > 516) {
                    i14 = 516 - i3;
                }
                int i15 = this.cd - 338;
                int i16 = i15;
                if (i15 < 0) {
                    i16 = 0;
                } else if (i16 + i4 > 165) {
                    i16 = 165 - i4;
                }
                this.aY = true;
                this.aZ = 2;
                this.iD = i14;
                this.iE = i16;
                this.iF = i3;
                this.iC = (15 * this.aX) + 22;
            }
            if (this.cc > 519 && this.cd > 0 && this.cc < 765 && this.cd < 168) {
                int i17 = (this.cc - 519) - (i3 / 2);
                int i18 = i17;
                if (i17 < 0) {
                    i18 = 0;
                } else if (i18 + i3 > 245) {
                    i18 = 245 - i3;
                }
                int i19 = this.cd;
                int i20 = i19;
                if (i19 < 0) {
                    i20 = 0;
                } else if (i20 + i4 > 168) {
                    i20 = 168 - i4;
                }
                this.aY = true;
                this.aZ = 3;
                this.iD = i18;
                this.iE = i20;
                this.iF = i3;
                this.iC = (15 * this.aX) + 22;
            }
        } else if (this.cc > 0 && this.cd > 0 && this.cc < s() && this.cd < t()) {
            int i21 = this.cc - (i3 / 2);
            int i22 = i21;
            if (i21 + i3 > s()) {
                i22 = s() - i3;
            }
            if (i22 < 0) {
                i22 = 0;
            }
            int i23 = this.cd;
            int i24 = i23;
            if (i23 + i4 > t()) {
                i24 = t() - i4;
            }
            if (i24 < 0) {
                i24 = 0;
            }
            this.aY = true;
            this.aZ = 0;
            this.iD = i22;
            this.iE = i24;
            this.iF = i3;
            this.iC = (15 * this.aX) + 22;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.NumberFormatException, java.lang.String] */
    private static String V() {
        if (aa.u[8135].an == null) {
            return "";
        }
        ?? r0 = aa.u[8135].an;
        String str = r0;
        try {
            long parseLong = Long.parseLong(str);
            String str2 = "Too high!";
            if (parseLong >= 0 && parseLong < 100000) {
                str2 = String.valueOf(parseLong);
            } else if (parseLong >= 100000 && parseLong < 1000000) {
                str2 = (parseLong / 1000) + "K";
            } else if (parseLong >= 1000000 && parseLong < 1000000000) {
                str2 = (parseLong / 1000000) + "M";
            } else if (parseLong >= 1000000000 && parseLong < 1000000000000L) {
                str2 = (parseLong / 1000000000) + "B";
            } else if (parseLong >= 10000000000000L && parseLong < 10000000000000000L) {
                str2 = (parseLong / 1000000000000L) + "T";
            } else if (parseLong >= 10000000000000000L && parseLong < 1000000000000000000L) {
                str2 = (parseLong / 1000000000000000L) + "QD";
            } else if (parseLong >= 1000000000000000000L && parseLong < Long.MAX_VALUE) {
                str2 = (parseLong / 1000000000000000000L) + "QT";
            }
            str = str2;
        } catch (NumberFormatException unused) {
            r0.printStackTrace();
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x08b6, code lost:
        if (r0 > 17227) goto L213;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1268 */
    /* JADX WARN: Type inference failed for: r0v1269, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v1270, types: [org.necrotic.client.Client] */
    /* JADX WARN: Type inference failed for: r0v1410, types: [java.util.LinkedList<org.necrotic.client.f.b.a.b$d>, java.util.Collection, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r0v1475 */
    /* JADX WARN: Type inference failed for: r0v1476 */
    /* JADX WARN: Type inference failed for: r0v1477 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void u(int r15) {
        /*
            Method dump skipped, instructions count: 11157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.necrotic.client.Client.u(int):void");
    }

    private void w(int i2) {
        aa aaVar = aa.u[i2];
        boolean z2 = true;
        if (aaVar.X > 0) {
            z2 = d(aaVar);
        }
        if (z2) {
            dk.i(195);
            dk.h(i2);
        }
    }

    private boolean a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z2, int i11) {
        for (int i12 = 0; i12 < 104; i12++) {
            for (int i13 = 0; i13 < 104; i13++) {
                this.hr[i12][i13] = 0;
                this.hq[i12][i13] = 99999999;
            }
        }
        int i14 = i10;
        int i15 = i6;
        if (i10 >= this.hr.length || i6 >= this.hr[i10].length) {
            return true;
        }
        this.hr[i10][i6] = 99;
        this.hq[i10][i6] = 0;
        int i16 = 0;
        this.hD[0] = i10;
        int i17 = 0 + 1;
        this.hE[0] = i6;
        boolean z3 = false;
        int length = this.hD.length;
        int[][] iArr = this.fX[this.bp].a;
        while (true) {
            if (i16 == i17) {
                break;
            }
            i14 = this.hD[i16];
            i15 = this.hE[i16];
            i16 = (i16 + 1) % length;
            if (i14 == i11 && i15 == i9) {
                z3 = true;
                break;
            }
            if (i5 != 0) {
                if ((i5 < 5 || i5 == 10) && this.fX[this.bp].a(i11, i14, i15, i3, i5 - 1, i9)) {
                    z3 = true;
                    break;
                } else if (i5 < 10 && this.fX[this.bp].b(i11, i9, i15, i5 - 1, i3, i14)) {
                    z3 = true;
                    break;
                }
            }
            if (i7 != 0 && i4 != 0 && this.fX[this.bp].a(i9, i11, i14, i4, i8, i7, i15)) {
                z3 = true;
                break;
            }
            int i18 = this.hq[i14][i15] + 1;
            if (i14 > 0 && this.hr[i14 - 1][i15] == 0 && (iArr[i14 - 1][i15] & 19398920) == 0) {
                this.hD[i17] = i14 - 1;
                this.hE[i17] = i15;
                i17 = (i17 + 1) % length;
                this.hr[i14 - 1][i15] = 2;
                this.hq[i14 - 1][i15] = i18;
            }
            if (i14 < 103 && this.hr[i14 + 1][i15] == 0 && (iArr[i14 + 1][i15] & 19399040) == 0) {
                this.hD[i17] = i14 + 1;
                this.hE[i17] = i15;
                i17 = (i17 + 1) % length;
                this.hr[i14 + 1][i15] = 8;
                this.hq[i14 + 1][i15] = i18;
            }
            if (i15 > 0 && this.hr[i14][i15 - 1] == 0 && (iArr[i14][i15 - 1] & 19398914) == 0) {
                this.hD[i17] = i14;
                this.hE[i17] = i15 - 1;
                i17 = (i17 + 1) % length;
                this.hr[i14][i15 - 1] = 1;
                this.hq[i14][i15 - 1] = i18;
            }
            if (i15 < 103 && this.hr[i14][i15 + 1] == 0 && (iArr[i14][i15 + 1] & 19398944) == 0) {
                this.hD[i17] = i14;
                this.hE[i17] = i15 + 1;
                i17 = (i17 + 1) % length;
                this.hr[i14][i15 + 1] = 4;
                this.hq[i14][i15 + 1] = i18;
            }
            if (i14 > 0 && i15 > 0 && this.hr[i14 - 1][i15 - 1] == 0 && (iArr[i14 - 1][i15 - 1] & 19398926) == 0 && (iArr[i14 - 1][i15] & 19398920) == 0 && (iArr[i14][i15 - 1] & 19398914) == 0) {
                this.hD[i17] = i14 - 1;
                this.hE[i17] = i15 - 1;
                i17 = (i17 + 1) % length;
                this.hr[i14 - 1][i15 - 1] = 3;
                this.hq[i14 - 1][i15 - 1] = i18;
            }
            if (i14 < 103 && i15 > 0 && this.hr[i14 + 1][i15 - 1] == 0 && (iArr[i14 + 1][i15 - 1] & 19399043) == 0 && (iArr[i14 + 1][i15] & 19399040) == 0 && (iArr[i14][i15 - 1] & 19398914) == 0) {
                this.hD[i17] = i14 + 1;
                this.hE[i17] = i15 - 1;
                i17 = (i17 + 1) % length;
                this.hr[i14 + 1][i15 - 1] = 9;
                this.hq[i14 + 1][i15 - 1] = i18;
            }
            if (i14 > 0 && i15 < 103 && this.hr[i14 - 1][i15 + 1] == 0 && (iArr[i14 - 1][i15 + 1] & 19398968) == 0 && (iArr[i14 - 1][i15] & 19398920) == 0 && (iArr[i14][i15 + 1] & 19398944) == 0) {
                this.hD[i17] = i14 - 1;
                this.hE[i17] = i15 + 1;
                i17 = (i17 + 1) % length;
                this.hr[i14 - 1][i15 + 1] = 6;
                this.hq[i14 - 1][i15 + 1] = i18;
            }
            if (i14 < 103 && i15 < 103 && this.hr[i14 + 1][i15 + 1] == 0 && (iArr[i14 + 1][i15 + 1] & 19399136) == 0 && (iArr[i14 + 1][i15] & 19399040) == 0 && (iArr[i14][i15 + 1] & 19398944) == 0) {
                this.hD[i17] = i14 + 1;
                this.hE[i17] = i15 + 1;
                i17 = (i17 + 1) % length;
                this.hr[i14 + 1][i15 + 1] = 12;
                this.hq[i14 + 1][i15 + 1] = i18;
            }
        }
        this.gM = 0;
        if (!z3) {
            if (z2) {
                int i19 = 100;
                for (int i20 = 1; i20 < 2; i20++) {
                    for (int i21 = i11 - i20; i21 <= i11 + i20; i21++) {
                        for (int i22 = i9 - i20; i22 <= i9 + i20; i22++) {
                            if (i21 >= 0 && i22 >= 0 && i21 < 104 && i22 < 104 && this.hq[i21][i22] < i19) {
                                i19 = this.hq[i21][i22];
                                i14 = i21;
                                i15 = i22;
                                this.gM = 1;
                                z3 = true;
                            }
                        }
                    }
                    if (z3) {
                        break;
                    }
                }
            }
            if (!z3) {
                return false;
            }
        }
        this.hD[0] = i14;
        int i23 = 0 + 1;
        this.hE[0] = i15;
        int i24 = this.hr[i14][i15];
        int i25 = i24;
        while (true) {
            int i26 = i24;
            if (i14 == i10 && i15 == i6) {
                break;
            }
            if (i26 != i25) {
                i25 = i26;
                this.hD[i23] = i14;
                int i27 = i23;
                i23++;
                this.hE[i27] = i15;
            }
            if ((i26 & 2) != 0) {
                i14++;
            } else if ((i26 & 8) != 0) {
                i14--;
            }
            if ((i26 & 1) != 0) {
                i15++;
            } else if ((i26 & 4) != 0) {
                i15--;
            }
            i24 = this.hr[i14][i15];
        }
        if (i23 <= 0) {
            return i2 != 1;
        }
        int i28 = i23;
        int i29 = i28;
        if (i28 > 25) {
            i29 = 25;
        }
        int i30 = i23 - 1;
        int i31 = this.hD[i30];
        int i32 = this.hE[i30];
        int i33 = cR + i29;
        cR = i33;
        if (i33 >= 92) {
            dk.i(36);
            dk.h(0);
            cR = 0;
        }
        if (i2 == 0) {
            dk.i(229);
            dk.l(this.bp);
            dk.i(164);
            int i34 = i29;
            dk.l(i34 + i34 + 3);
        }
        if (i2 == 1) {
            dk.i(229);
            dk.l(this.bp);
            dk.i(248);
            int i35 = i29;
            dk.l(i35 + i35 + 3 + 14);
        }
        if (i2 == 2) {
            dk.i(229);
            dk.l(this.bp);
            dk.i(98);
            int i36 = i29;
            dk.l(i36 + i36 + 3);
        }
        dk.g(i31 + this.al);
        this.aA = this.hD[0];
        this.aB = this.hE[0];
        for (int i37 = 1; i37 < i29; i37++) {
            i30--;
            dk.l(this.hD[i30] - i31);
            dk.l(this.hE[i30] - i32);
        }
        dk.e(i32 + this.am);
        dk.c(this.bW[5] != 1 ? 0 : 1);
        return true;
    }

    private void W() {
        if (!this.bN.b() && this.by != 0) {
            org.necrotic.client.f.a.c cVar = this.bk;
            int i2 = 0;
            if (this.eC != 0) {
                i2 = 0 + 1;
            }
            if (this.fu != 0) {
                i2++;
            }
            for (int i3 = 0; i3 < 100; i3++) {
                if (this.aq[i3] != null) {
                    int i4 = this.aw[i3];
                    String str = this.ar[i3];
                    String str2 = str;
                    int i5 = 0;
                    if (str2 != null) {
                        if (str2.indexOf("@") == 0) {
                            str2 = str2.substring(d(str2));
                        }
                        if (str2.indexOf("@") == 0) {
                            str2 = str2.substring(d(str2));
                        }
                    }
                    int a2 = c.a(0);
                    if (a2 != 0) {
                        str2 = "<col=" + a2 + ">" + str2;
                    }
                    int t2 = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 0 : t() - 500;
                    if ((i4 == 3 || i4 == 7) && (i4 == 7 || this.bt == 0 || (this.bt == 1 && e(str2)))) {
                        int i6 = (t2 + 329) - (i2 * 13);
                        cVar.b(0, HttpHeaders.FROM, i6, 4);
                        cVar.b(org.necrotic.client.f.b.a.a.b[this.R], HttpHeaders.FROM, i6 - 1, 4);
                        int a3 = 4 + cVar.a("From ");
                        if (str != null && str.indexOf("@") == 0) {
                            i5 = a(str.substring(0, str.indexOf(str2)), d(str) == 6);
                        }
                        if (i5 == 13) {
                            i5 += 3;
                        }
                        if (i5 != 0) {
                            d b2 = b(i5);
                            if (b2 == null) {
                                this.P[i5].c(a3, i6 - 12, ColorUtil.MAX_RGB_VALUE);
                                a3 += this.P[i5].v + 2;
                            } else {
                                b2.a(b2.d, b2.e).c(a3, i6 - 11);
                                a3 += b2.d + 2;
                            }
                        }
                        cVar.b(0, str2 + ": " + this.aq[i3], i6, a3);
                        cVar.b(org.necrotic.client.f.b.a.a.b[this.R], str2 + ": " + this.aq[i3], i6 - 1, a3);
                        i2++;
                        if (i2 >= 5) {
                            break;
                        }
                    }
                    if (i4 == 5 && this.bt < 2) {
                        int i7 = (t2 + 329) - (i2 * 13);
                        cVar.b(0, this.aq[i3], i7, 4);
                        cVar.b(org.necrotic.client.f.b.a.a.b[this.R], this.aq[i3], i7 - 1, 4);
                        i2++;
                        if (i2 >= 5) {
                            break;
                        }
                    }
                    if (i4 == 6 && this.bt < 2) {
                        int i8 = (t2 + 329) - (i2 * 13);
                        cVar.b(0, "To", i8, 4);
                        cVar.b(org.necrotic.client.f.b.a.a.b[this.R], "To", i8 - 1, 4);
                        int a4 = 4 + cVar.a("To ");
                        if (i5 != 0) {
                            d b3 = b(i5);
                            if (b3 != null) {
                                b3.a(b3.d, b3.e).c(a4, i8 - 11);
                                a4 += 12;
                            } else {
                                this.P[i5].c(a4, i8 - 12, ColorUtil.MAX_RGB_VALUE);
                                a4 += 12;
                            }
                        }
                        cVar.b(0, str2 + ": " + this.aq[i3], i8, a4);
                        cVar.b(org.necrotic.client.f.b.a.a.b[this.R], str2 + ": " + this.aq[i3], i8 - 1, a4);
                        i2++;
                        if (i2 >= 5) {
                            break;
                        }
                    }
                }
            }
        }
        b bVar = this.ep;
        if (bVar.a == null) {
            this.eo.b();
            if (this.hM == 1) {
                this.hK[this.hL / 100].e((this.hN - 8) - 4, (this.hO - 8) - 4);
                int i9 = cL + 1;
                cL = i9;
                if (i9 > 67) {
                    cL = 0;
                }
            }
            if (this.hM == 2) {
                this.hK[4 + (this.hL / 100)].e((this.hN - 8) - 4, (this.hO - 8) - 4);
            }
            if (ct) {
                a(0, 0, aa.u[39670], 0);
            }
            if (this.gk > 0) {
                i(this.he, this.gk);
                if (this.gk == 15892 && org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
                    a(0, ((s() / 2) - aa.u[this.gk].aO) + 20, aa.u[this.gk], 0);
                } else if ((this.gk == 201 || this.gk == 197) && org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
                    a(0, (s() - Constants.GAME_FIXED_WIDTH) + 15, aa.u[this.gk], -241);
                } else if (this.gk == 197) {
                    a(0, (s() - Constants.GAME_FIXED_WIDTH) - (org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? 30 : 0), aa.u[42020], 10);
                } else {
                    a(0, 0, aa.u[this.gk], 0);
                }
            }
            if (this.fi.size() > 0) {
                Iterator<aa> it = this.fi.iterator();
                while (it.hasNext()) {
                    aa next = it.next();
                    if (next != null) {
                        if (next.aP + next.aO > 512) {
                            next.aP = 512 - next.aO;
                        }
                        if (next.aQ + next.aa > 334) {
                            next.aQ = 334 - next.aa;
                        }
                        if (next.aQ < 0) {
                            next.aQ = 0;
                        }
                        if (next.aP < 0) {
                            next.aP = 0;
                        }
                        switch (next.ac) {
                            case 28710:
                                if (aa.u[28714].an.length() <= 0) {
                                    break;
                                } else {
                                    next.aP = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 392 : p - 150;
                                    if (aa.u[28740].ad) {
                                        next.aQ = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 280 : 180;
                                    } else {
                                        next.aQ = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 163 : 180;
                                    }
                                    a(0, next.aP, next, next.aQ);
                                    break;
                                }
                            case 48300:
                            case 48400:
                                next.aP = (s() - Constants.GAME_FIXED_WIDTH) - (org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? 30 : 0);
                                a(0, next.aP, next, next.aQ);
                                break;
                            case 112000:
                                org.necrotic.client.f.b.a.a();
                                a.EnumC0026a enumC0026a = a.EnumC0026a.FIXED;
                                next.aP = 0;
                                next.aQ = org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? o - 500 : 0;
                                a(0, next.aP, next, next.aQ);
                                break;
                            default:
                                a(0, next.aP, next, next.aQ);
                                break;
                        }
                    }
                }
            }
            if (u != -1) {
                i(this.he, u);
                aa aaVar = aa.u[u];
                int s2 = org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? s() : 516;
                int t3 = org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? t() : 338;
                if (org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
                    a(0, (s2 - Constants.GAME_FIXED_WIDTH) / 2, aaVar, (t3 - Constants.GAME_FIXED_HEIGHT) / 2);
                } else {
                    a(0, 0, aaVar, 0);
                }
                if (u == 5292) {
                    if (u == 5292 && aa.u[27000].an.equals("1")) {
                        int parseInt = Integer.parseInt(aa.u[27001].an);
                        int parseInt2 = Integer.parseInt(aa.u[27002].an);
                        for (int i10 = 0; i10 <= parseInt; i10++) {
                            aa.u[i10 + 27014].aA = F.a(1009);
                            aa.u[i10 + 27014].an = "Click here to select tab " + (i10 + 1);
                        }
                        for (int i11 = parseInt + 1; i11 <= 8; i11++) {
                            aa.u[i11 + 27014].aA = null;
                            aa.u[i11 + 27014].an = "";
                        }
                        if (parseInt != 8) {
                            aa.u[parseInt + 27015].aA = F.a(1010);
                            aa.u[parseInt + 27015].an = "Drag an item here to create a new tab";
                        }
                        if (parseInt2 == -1) {
                            aa.u[27013].aA = F.a(1011);
                        } else if (parseInt2 > 0) {
                            aa.u[parseInt2 + 27014].aA = F.a(1012);
                            aa.u[27014].aA = F.a(1011);
                        } else {
                            aa.u[27014].aA = F.a(1008);
                        }
                        aa.u[27000].an = "0";
                    }
                    if (this.jp != null) {
                        this.jp.e(this.jq, this.jr);
                    }
                }
                org.necrotic.client.f.c.i iVar = this.fa;
                if (u == 24500 || u == 54700 || u == 53700) {
                    if (u == 24500) {
                        for (int i12 = 1; i12 < iVar.g.length; i12++) {
                            if (iVar.g[i12] == 0) {
                                iVar.a(i12, "Regular");
                            }
                            if (iVar.g[i12] == 1 && iVar.h[i12] == "Sell") {
                                iVar.a(i12, "Submit Sell");
                            }
                            if (iVar.g[i12] == 1 && iVar.h[i12] == "Buy") {
                                iVar.a(i12, "Submit Buy");
                            }
                            if (iVar.g[i12] == 2 && iVar.h[i12] == "Sell") {
                                iVar.a(i12, "Sell");
                            }
                            if (iVar.g[i12] == 2 && iVar.h[i12] == "Buy") {
                                iVar.a(i12, "Buy");
                            }
                            if (iVar.g[i12] == 3 && iVar.h[i12] == "Sell") {
                                iVar.a(i12, "Finished Selling");
                            }
                            if (iVar.g[i12] == 3 && iVar.h[i12] == "Buy") {
                                iVar.a(i12, "Finished Buying");
                            }
                        }
                    }
                    int i13 = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 71 : 71 + ((p / 2) - 256);
                    int i14 = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 303 : (o / 2) + 136;
                    if (u == 54700) {
                        iVar.l = F.a(1158);
                        iVar.m = F.a(1159);
                        iVar.n = F.a(1160);
                        iVar.o = F.a(1161);
                        if (iVar.i[iVar.k] == 100 || iVar.j[iVar.k]) {
                            aa.u[54800].aI = "[GE]";
                        } else {
                            aa.u[54800].aI = "Abort offer";
                        }
                        if (iVar.k <= 6) {
                            if (!iVar.j[iVar.k]) {
                                for (int i15 = 1; i15 < iVar.i[iVar.k]; i15++) {
                                    if (iVar.i[iVar.k] > 0) {
                                        if (i15 == 1) {
                                            if (iVar.l != null) {
                                                iVar.l.e(i13, i14);
                                            }
                                            i13 += 3;
                                        } else if (i15 == 99) {
                                            if (iVar.n != null) {
                                                iVar.n.e(i13, i14);
                                            }
                                            i13 += 4;
                                        } else {
                                            if (iVar.m != null) {
                                                iVar.m.e(i13, i14);
                                            }
                                            i13 += 3;
                                        }
                                    }
                                }
                            } else if (iVar.o != null) {
                                iVar.o.e(i13, i14);
                            }
                        }
                    }
                    int i16 = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 71 : 71 + ((p / 2) - 256);
                    int i17 = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 303 : (o / 2) + 136;
                    if (u == 53700) {
                        iVar.l = F.a(1158);
                        iVar.m = F.a(1159);
                        iVar.n = F.a(1160);
                        iVar.o = F.a(1161);
                        if (iVar.i[iVar.k] == 100 || iVar.j[iVar.k]) {
                            aa.u[53800].aI = "[GE]";
                        } else {
                            aa.u[53800].aI = "Abort offer";
                        }
                        if (iVar.k <= 6) {
                            if (!iVar.j[iVar.k]) {
                                for (int i18 = 1; i18 < iVar.i[iVar.k]; i18++) {
                                    if (iVar.i[iVar.k] > 0) {
                                        if (i18 == 1) {
                                            if (iVar.l != null) {
                                                iVar.l.e(i16, i17);
                                            }
                                            i16 += 3;
                                        } else if (i18 == 99) {
                                            if (iVar.n != null) {
                                                iVar.n.e(i16, i17);
                                            }
                                            i16 += 4;
                                        } else {
                                            if (iVar.m != null) {
                                                iVar.m.e(i16, i17);
                                            }
                                            i16 += 3;
                                        }
                                    }
                                }
                            } else if (iVar.o != null) {
                                iVar.o.e(i16, i17);
                            }
                        }
                    }
                }
            }
            dn = null;
            o.b();
            if (!this.aY) {
                aq();
                ac();
            } else if (this.aZ == 0) {
                i();
            }
            if (this.eA == 1) {
                this.iI.e(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 472 : s() - 40, org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 296 : 175);
            }
            if (this.eB == 1) {
                this.iJ.e(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 472 : s() - 40, org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 296 : 175);
            }
            if (Objects.nonNull(this.jT) && u <= 0) {
                long j2 = this.jT.au;
                long j3 = this.jT.aB;
                int i19 = 35;
                int i20 = 106;
                if (!org.necrotic.a.i) {
                    j2 = Math.round((float) (j2 / 10));
                    j3 /= 10;
                }
                int i21 = 13;
                if (this.jT instanceof org.necrotic.client.e.a.a) {
                    org.necrotic.client.e.a.a aVar = (org.necrotic.client.e.a.a) this.jT;
                    a(106, 35, j2, j3, 13);
                    int i22 = 106 / 2;
                    this.bg.a(aVar.y, 63, 40, 16777215, 0);
                } else {
                    org.necrotic.client.j.e eVar = (org.necrotic.client.j.e) this.jT;
                    boolean z2 = j3 > 2500;
                    boolean z3 = z2;
                    if (z2) {
                        i21 = 23;
                        i19 = 25 + (eVar.d.size() * 10) + 10;
                        i20 = 125;
                    }
                    a(i20, i19, j2, j3, i21);
                    if (eVar.c == null) {
                        this.jT = null;
                    } else {
                        this.bg.a(eVar.c.r, 10 + (i20 / 2), 40, 16777215, 0);
                        if (z3) {
                            for (int i23 = 0; i23 < 5; i23++) {
                                this.bg.a("", 15, 40 + (i23 * 10) + 10, false);
                                this.bg.a("", 105, 40 + (i23 * 10) + 10, false);
                                if (i23 < eVar.d.size()) {
                                    String a5 = eVar.d.get(i23).a();
                                    long b4 = eVar.d.get(i23).b();
                                    if (!org.necrotic.a.i && b4 > 0) {
                                        b4 /= 10;
                                    }
                                    DecimalFormat decimalFormat = new DecimalFormat("#");
                                    this.bg.a(a5, 15, 40 + (i23 * 10) + 10, false);
                                    this.bg.a(decimalFormat.format(b4), 105, 40 + (i23 * 10) + 10, false);
                                }
                            }
                        }
                    }
                }
            }
            int i24 = this.al + ((t.aJ - 6) >> 7);
            int i25 = this.am + ((t.aK - 6) >> 7);
            if (this.jo) {
                this.bk.b(16776960, "Fps: " + this.bT, 240, 5);
                Runtime runtime = Runtime.getRuntime();
                int i26 = 16776960;
                int freeMemory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024);
                if (freeMemory > 33554432 && dg) {
                    i26 = 16711680;
                }
                this.bk.b(i26, "Mem: " + freeMemory + "k", 254, 5);
                this.bk.b(16776960, "Mouse X: " + this.bY + " , Mouse Y: " + this.bZ, 269, 5);
                this.bk.b(16776960, "Coords: " + i24 + ", " + i25, 284, 5);
                this.bk.b(16776960, "Client resolution: " + s() + "x" + t(), 299, 5);
                this.bk.b(16776960, "Object Maps: " + this.iO + ";", 314, 5);
                this.bk.b(16776960, "Floor Maps: " + this.hW + ";", 329, 5);
            }
            if (this.jn) {
                int g2 = this.eb.g() - 90;
                int i27 = 16776960;
                if (this.bT < 15) {
                    i27 = 16711680;
                }
                this.bk.b(i27, "Fps:" + this.bT, 20, g2);
                Runtime runtime2 = Runtime.getRuntime();
                int freeMemory2 = (int) ((runtime2.totalMemory() - runtime2.freeMemory()) / 1024);
                if (freeMemory2 > 33554432 && dg) {
                    i27 = 16711680;
                }
                this.bk.b(i27, "Mem:" + freeMemory2 + "k", 35, g2);
                this.bk.b(i27, "MouseX:" + this.bY, 50, g2);
                this.bk.b(i27, "MouseY:" + this.bZ, 65, g2);
                this.bk.b(16776960, "Object Maps: " + this.iO + ";", 80, 5);
                this.bk.b(16776960, "Floor Maps: " + this.hW + ";", 95, 5);
            }
            if (this.eC != 0) {
                int i28 = this.eC / 50;
                int i29 = i28 / 60;
                int i30 = i28 % 60;
                if (i30 < 10) {
                    this.bk.b(16776960, "System update in: " + i29 + ":0" + i30, org.necrotic.client.f.b.a.j() ? 329 : t() - 168, 4);
                } else {
                    this.bk.b(16776960, "System update in: " + i29 + ":" + i30, org.necrotic.client.f.b.a.j() ? 329 : t() - 168, 4);
                }
                int i31 = da + 1;
                da = i31;
                if (i31 > 75) {
                    da = 0;
                    dk.i(148);
                    return;
                }
                return;
            }
            if (this.fu == 0) {
                this.fv = null;
            }
            if (this.fv != null) {
                this.bk.b(16776960, this.fv, org.necrotic.client.f.b.a.j() ? 329 : t() - 168, 4);
                return;
            }
            return;
        }
        a aVar2 = bVar.a;
        throw null;
    }

    private static void h(int i2, int i3) {
        org.necrotic.client.f.c.b(71, i3 - 1, i2 - 2, 7496785, 1);
        org.necrotic.client.f.c.b(69, i3, i2 + 174, 7496785, 1);
        org.necrotic.client.f.c.b(1, i3 - 2, i2 - 2, 7496785, 178);
        org.necrotic.client.f.c.b(1, i3 + 68, i2, 7496785, 174);
        org.necrotic.client.f.c.b(71, i3 - 1, i2 - 1, 3025699, 1);
        org.necrotic.client.f.c.b(71, i3 - 1, i2 + 175, 3025699, 1);
        org.necrotic.client.f.c.b(1, i3 - 1, i2, 3025699, 175);
        org.necrotic.client.f.c.b(1, i3 + 69, i2, 3025699, 175);
        org.necrotic.client.f.c.c(0, i3, 174, 68, 220, i2);
    }

    private void X() {
        this.bN.a(0);
        this.bN.b(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 338 : t() - 165);
        this.bN.a(this);
    }

    private void b(aa aaVar) {
        String str;
        String str2;
        org.necrotic.client.n.d dVar;
        org.necrotic.client.n.d dVar2;
        org.necrotic.client.n.d dVar3;
        org.necrotic.client.n.d dVar4;
        String str3;
        int i2 = aaVar.X;
        if (i2 < 205 || i2 > 231) {
            if ((i2 > 0 && i2 <= 100) || (i2 >= 701 && i2 <= 800)) {
                if (i2 == 1 && this.gZ == 0) {
                    aaVar.an = "Loading friend list";
                    aaVar.S = 0;
                } else if (i2 == 1 && this.gZ == 1) {
                    aaVar.an = "Connecting to friendserver";
                    aaVar.S = 0;
                } else if (i2 == 2 && this.gZ != 2) {
                    aaVar.an = "Please wait...";
                    aaVar.S = 0;
                } else {
                    int i3 = this.aE;
                    if (this.gZ != 2) {
                        i3 = 0;
                    }
                    int i4 = i2 > 700 ? i2 - 601 : i2 - 1;
                    if (i4 >= i3) {
                        aaVar.an = "";
                        aaVar.S = 0;
                        return;
                    }
                    aaVar.an = this.hX[i4];
                    aaVar.S = 1;
                }
            } else if (i2 == 901) {
                aaVar.an = new StringBuilder().append(this.aE).toString();
            } else if (i2 == 902) {
                aaVar.an = new StringBuilder().append(this.ig).toString();
            } else if ((i2 >= 101 && i2 <= 200) || (i2 >= 801 && i2 <= 900)) {
                int i5 = this.aE;
                if (this.gZ != 2) {
                    i5 = 0;
                }
                int i6 = i2 > 800 ? i2 - 701 : i2 - 101;
                if (i6 >= i5) {
                    aaVar.an = "";
                    aaVar.S = 0;
                    return;
                }
                if (this.aG[i6] != 0 && this.aG[i6] == dj) {
                    aaVar.an = "@gre@Online";
                } else {
                    aaVar.an = "@red@Offline";
                }
                aaVar.S = 1;
            } else if (i2 == 203) {
                int i7 = this.aE;
                if (this.gZ != 2) {
                    i7 = 0;
                }
                aaVar.au = (i7 * 15) + 20;
                if (aaVar.au <= aaVar.aa) {
                    aaVar.au = aaVar.aa + 1;
                }
            } else if (i2 >= 401 && i2 <= 500) {
                int i8 = i2 - 401;
                if (i8 == 0 && this.gZ == 0) {
                    aaVar.an = "Loading ignore list";
                    aaVar.S = 0;
                } else if (i8 == 1 && this.gZ == 0) {
                    aaVar.an = "Please wait...";
                    aaVar.S = 0;
                } else {
                    int i9 = this.ig;
                    if (this.gZ == 0) {
                        i9 = 0;
                    }
                    if (i8 >= i9) {
                        aaVar.an = "";
                        aaVar.S = 0;
                        return;
                    }
                    aaVar.an = org.necrotic.client.f.a.b.a(org.necrotic.client.f.a.b.a(this.ea[i8]));
                    aaVar.S = 1;
                }
            } else if (i2 == 503) {
                aaVar.au = (this.ig * 15) + 20;
                if (aaVar.au <= aaVar.aa) {
                    aaVar.au = aaVar.aa + 1;
                }
            } else if (i2 == 327) {
                aaVar.ao = 150;
                aaVar.ap = ((int) (Math.sin(s / 40.0d) * 256.0d)) & 2047;
                if (this.fL) {
                    for (int i10 = 0; i10 < 7; i10++) {
                        int i11 = this.dJ[i10];
                        if (i11 >= 0 && !org.necrotic.client.c.a.e.a[i11].a()) {
                            return;
                        }
                    }
                    this.fL = false;
                    org.necrotic.client.n.d[] dVarArr = new org.necrotic.client.n.d[7];
                    int i12 = 0;
                    for (int i13 = 0; i13 < 7; i13++) {
                        int i14 = this.dJ[i13];
                        if (i14 >= 0) {
                            int i15 = i12;
                            i12++;
                            dVarArr[i15] = org.necrotic.client.c.a.e.a[i14].b();
                        }
                    }
                    org.necrotic.client.n.d dVar5 = new org.necrotic.client.n.d(i12, dVarArr);
                    for (int i16 = 0; i16 < 5; i16++) {
                        if (this.dp[i16] != 0) {
                            dVar5.a(b[i16][0], b[i16][this.dp[i16]]);
                            if (i16 == 1) {
                                dVar5.a(a[0], a[this.dp[i16]]);
                            }
                        }
                    }
                    dVar5.g();
                    dVar5.c(org.necrotic.client.c.a.a.a[t.O].c[0]);
                    dVar5.a(64, 850, -30, -50, -30, true);
                    aaVar.M = 5;
                    aaVar.am = 0;
                    aa.a(this.dD, dVar5);
                }
            } else if (i2 == 3292) {
                if (org.necrotic.client.f.c.n.c <= 0) {
                    return;
                }
                org.necrotic.client.f.c.n nVar = new org.necrotic.client.f.c.n(org.necrotic.client.c.a.j.a(org.necrotic.client.f.c.n.c));
                aaVar.ao = 150;
                aaVar.ap = ((int) ((s / 100.0d) * 1024.0d)) & 2047;
                org.necrotic.client.n.d[] dVarArr2 = new org.necrotic.client.n.d[nVar.d()];
                for (int i17 = 0; i17 < nVar.d(); i17++) {
                    dVarArr2[i17] = org.necrotic.client.n.d.a(nVar.e()[i17]);
                }
                if (dVarArr2.length == 1) {
                    dVar4 = dVarArr2[0];
                } else {
                    dVar4 = new org.necrotic.client.n.d(dVarArr2.length, dVarArr2);
                }
                if (dVar4 == null) {
                    return;
                }
                dVar4.g();
                dVar4.k();
                dVar4.c(org.necrotic.client.c.a.a.a[org.necrotic.client.f.c.n.c()].c[org.necrotic.client.f.c.n.a]);
                dVar4.a(64, 850, -30, -50, -30, true);
                aaVar.M = 5;
                aaVar.am = 0;
                aa.a(this.dD, dVar4);
            } else {
                if (i2 == 1430 && aaVar.au > 5) {
                    if (aaVar.aZ > 0) {
                        aaVar.aZ--;
                        return;
                    }
                    aa aaVar2 = aa.u[aaVar.as];
                    if (aaVar.aw == (-aaVar.au)) {
                        aaVar.ba = true;
                        aaVar.aZ = 20;
                    }
                    if (aaVar.ba) {
                        if (aaVar.aw == 0) {
                            aaVar.ba = false;
                            aaVar.aZ = 20;
                        }
                        aaVar.aw++;
                    } else {
                        aaVar.aw--;
                    }
                    aaVar2.V[0] = aaVar.aw;
                }
                if (i2 == 3500) {
                    aaVar.ao = org.necrotic.client.c.a.i.a(aaVar.am).C;
                    aaVar.ap = org.necrotic.client.c.a.i.a(aaVar.am).D;
                    aaVar.aq = org.necrotic.client.c.a.i.a(aaVar.am).E / 2;
                    aaVar.aP = 0;
                    aaVar.aQ = 0;
                }
                if (i2 == 3600) {
                    org.necrotic.client.f.c.l lVar = new org.necrotic.client.f.c.l(org.necrotic.client.c.a.j.a(aaVar.C));
                    org.necrotic.client.n.d[] dVarArr3 = new org.necrotic.client.n.d[lVar.d()];
                    for (int i18 = 0; i18 < lVar.d(); i18++) {
                        dVarArr3[i18] = org.necrotic.client.n.d.a(lVar.e()[i18]);
                    }
                    if (dVarArr3.length == 1) {
                        dVar3 = dVarArr3[0];
                    } else {
                        dVar3 = new org.necrotic.client.n.d(dVarArr3.length, dVarArr3);
                    }
                    if (dVar3 == null) {
                        return;
                    }
                    dVar3.g();
                    dVar3.c(org.necrotic.client.c.a.a.a[org.necrotic.client.f.c.l.c()].c[org.necrotic.client.f.c.l.a]);
                    aaVar.M = 5;
                    aaVar.am = 0;
                    aa.a(this.dD, dVar3);
                    if (!org.necrotic.client.f.c.l.b) {
                        org.necrotic.client.f.c.l.b();
                    }
                } else if (i2 == 3291) {
                    org.necrotic.client.c.a.j a2 = org.necrotic.client.c.a.j.a(aaVar.C);
                    if (a2.s != null) {
                        org.necrotic.client.f.c.l lVar2 = new org.necrotic.client.f.c.l(a2);
                        aaVar.ao = 150;
                        aaVar.ap = ((int) ((s / 100.0d) * 1024.0d)) & 2047;
                        org.necrotic.client.n.d[] dVarArr4 = new org.necrotic.client.n.d[lVar2.d()];
                        for (int i19 = 0; i19 < lVar2.d(); i19++) {
                            dVarArr4[i19] = org.necrotic.client.n.d.a(lVar2.e()[i19]);
                        }
                        if (dVarArr4.length == 1) {
                            dVar2 = dVarArr4[0];
                        } else {
                            dVar2 = new org.necrotic.client.n.d(dVarArr4.length, dVarArr4);
                        }
                        if (dVar2 == null) {
                            return;
                        }
                        if (a2.u != null) {
                            for (int i20 = 0; i20 < a2.u.length; i20++) {
                                dVar2.a(a2.u[i20], a2.j[i20]);
                            }
                        }
                        if (a2.a > 0) {
                            dVar2.e(a2.a);
                        }
                        if (a2.b != 0) {
                            dVar2.f(a2.b);
                        }
                        int i21 = a2.c;
                        if (a2.h != 128 || a2.i != 128) {
                            dVar2.b(a2.h, a2.h, a2.i);
                        }
                        if (a2.w == 9819) {
                            dVar2.a(0, -100, 0);
                        }
                        dVar2.g();
                        dVar2.k();
                        dVar2.c(org.necrotic.client.c.a.a.a[org.necrotic.client.f.c.l.c()].c[org.necrotic.client.f.c.l.a]);
                        aaVar.M = 5;
                        aaVar.am = 0;
                        aa.a(this.dD, dVar2);
                        if (!org.necrotic.client.f.c.l.b) {
                            org.necrotic.client.f.c.l.b();
                        }
                    }
                } else {
                    if (i2 == 32921) {
                        this.fs = org.necrotic.client.c.a.j.a(aaVar.B);
                        if (aaVar.B != -1 && aaVar.B != 5090) {
                            org.necrotic.client.f.c.l lVar3 = new org.necrotic.client.f.c.l(this.fs);
                            aaVar.ao = 150;
                            aaVar.ap = ((int) ((s / 100.0d) * 1024.0d)) & 2047;
                            org.necrotic.client.n.d[] dVarArr5 = new org.necrotic.client.n.d[lVar3.d()];
                            for (int i22 = 0; i22 < lVar3.d(); i22++) {
                                dVarArr5[i22] = org.necrotic.client.n.d.a(lVar3.e()[i22]);
                            }
                            if (dVarArr5.length == 1) {
                                dVar = dVarArr5[0];
                            } else {
                                dVar = new org.necrotic.client.n.d(dVarArr5.length, dVarArr5);
                            }
                            if (dVar == null) {
                                return;
                            }
                            if (this.fs.u != null) {
                                for (int i23 = 0; i23 < this.fs.u.length; i23++) {
                                    int i24 = this.fs.u[i23];
                                    int i25 = this.fs.j[i23];
                                    int i26 = dVar.J;
                                }
                            }
                            dVar.g();
                            dVar.c(org.necrotic.client.c.a.a.a[org.necrotic.client.f.c.l.c()].c[org.necrotic.client.f.c.l.a]);
                            aaVar.M = 5;
                            aaVar.am = 0;
                            aa.a(this.dD, dVar);
                            if (!org.necrotic.client.f.c.l.b) {
                                org.necrotic.client.f.c.l.b();
                                return;
                            }
                            return;
                        }
                        aaVar.M = 5;
                        aaVar.am = 0;
                        aa.a(this.dD, (org.necrotic.client.n.d) null);
                    }
                    if (i2 == 328) {
                        aaVar.ao = 150;
                        aaVar.ap = ((int) (Math.sin(s / 40.0d) * 256.0d)) & 2047;
                        if (this.fL) {
                            org.necrotic.client.n.d e2 = t.e();
                            for (int i27 = 0; i27 < 5; i27++) {
                                if (this.dp[i27] != 0) {
                                    e2.a(b[i27][0], b[i27][this.dp[i27]]);
                                    if (i27 == 1) {
                                        e2.a(a[0], a[this.dp[i27]]);
                                    }
                                }
                            }
                            int i28 = t.O;
                            e2.g();
                            e2.c(org.necrotic.client.c.a.a.a[i28].c[0]);
                            aaVar.M = 5;
                            aaVar.am = 0;
                            aa.a(this.dD, e2);
                        }
                    } else if (i2 == 324) {
                        if (this.gb == null) {
                            this.gb = aaVar.aA;
                            this.gc = aaVar.aB;
                        }
                        if (this.eu) {
                            aaVar.aA = this.gc;
                        } else {
                            aaVar.aA = this.gb;
                        }
                    } else if (i2 == 325) {
                        if (this.gb == null) {
                            this.gb = aaVar.aA;
                            this.gc = aaVar.aB;
                        }
                        if (this.eu) {
                            aaVar.aA = this.gb;
                        } else {
                            aaVar.aA = this.gc;
                        }
                    } else {
                        if (i2 == 650 || i2 == 655) {
                            if (this.gH != 0) {
                                if (this.hQ == 0) {
                                    str = "earlier today";
                                } else if (this.hQ == 1) {
                                    str = "yesterday";
                                } else {
                                    str = this.hQ + " days ago";
                                }
                                aaVar.an = "You last logged in " + str + " from: " + ae.c;
                            } else {
                                aaVar.an = "";
                            }
                        }
                        if (i2 == 651) {
                            if (this.ji == 0) {
                                aaVar.an = "0 unread messages";
                                aaVar.aF = 16776960;
                            } else if (this.ji == 1) {
                                aaVar.an = "1 unread message";
                                aaVar.aF = 65280;
                            } else if (this.ji > 1) {
                                aaVar.an = this.ji + " unread messages";
                                aaVar.aF = 65280;
                            }
                        }
                        if (i2 == 652) {
                            if (this.hR == 201) {
                                if (this.iy == 1) {
                                    aaVar.an = "@yel@This is a non-members world: @whi@Since you are a member we";
                                } else {
                                    aaVar.an = "";
                                }
                            } else if (this.hR == 200) {
                                aaVar.an = "You have not yet set any password recovery questions.";
                            } else {
                                if (this.hR == 0) {
                                    str2 = "Earlier today";
                                } else if (this.hR == 1) {
                                    str2 = "Yesterday";
                                } else {
                                    str2 = this.hR + " days ago";
                                }
                                aaVar.an = str2 + " you changed your recovery questions";
                            }
                        }
                        if (i2 == 653) {
                            if (this.hR == 201) {
                                if (this.iy == 1) {
                                    aaVar.an = "@whi@recommend you use a members world instead. You may use";
                                } else {
                                    aaVar.an = "";
                                }
                            } else if (this.hR == 200) {
                                aaVar.an = "We strongly recommend you do so now to secure your account.";
                            } else {
                                aaVar.an = "If you do not remember making this change then cancel it immediately";
                            }
                        }
                        if (i2 == 654) {
                            if (this.hR == 201) {
                                if (this.iy == 1) {
                                    aaVar.an = "@whi@this world but member benefits are unavailable whilst here.";
                                } else {
                                    aaVar.an = "";
                                }
                            } else if (this.hR == 200) {
                                aaVar.an = "Do this from the 'account management' area on our front webpage";
                            } else {
                                aaVar.an = "Do this from the 'account management' area on our front webpage";
                            }
                        }
                    }
                }
            }
        } else {
            int i29 = i2 - 205;
            if (i29 == 26) {
                long j2 = 0;
                for (int i30 = 0; i30 < this.ds.length; i30++) {
                    j2 += this.ds[i30];
                }
                str3 = "Total XP: " + String.format("%, d", Long.valueOf(j2));
            } else {
                String[] strArr = new String[6];
                int[] iArr = {0, 3, 14, 2, 16, 13, 1, 15, 10, 4, 17, 7, 5, 12, 11, 6, 9, 8, 20, 18, 19, 21, 22, 23, 24, 25};
                int i31 = af.c[iArr[i29]][0];
                int i32 = af.c[iArr[i29]][1];
                int i33 = iArr[i29];
                int i34 = this.K[i33];
                int i35 = this.O[i33];
                if (i33 == 3 || i33 == 5) {
                    i34 /= 10;
                    i35 /= 10;
                }
                strArr[0] = af.a[i29] + ": " + i34 + "/" + i35 + "\\n";
                strArr[1] = "Current Exp: " + String.format("%, d", Integer.valueOf(this.ds[iArr[i29]])) + "\\n";
                strArr[2] = "Next level: " + String.format("%, d", Integer.valueOf(org.necrotic.client.e.a.b.b(i35 + 1) - this.ds[iArr[i29]]));
                String str4 = strArr[0] + strArr[1];
                boolean z2 = false;
                if (i35 < 99) {
                    str4 = str4 + strArr[2];
                    z2 = true;
                }
                if (this.ds[iArr[i29]] < 1000000000 && i31 >= 0 && i32 >= 0) {
                    strArr[4] = (z2 ? "\\n" : "") + af.d + (af.d.endsWith("Level: ") ? Integer.valueOf(org.necrotic.client.e.a.b.a(i32)) : String.format("%,d", Integer.valueOf(i32))) + "\\n";
                    int i36 = (i32 - this.ds[iArr[i29]]) - (af.d.endsWith("Level: ") ? 1 : 0);
                    int i37 = i36;
                    if (i36 < 0) {
                        i37 = 0;
                    }
                    strArr[5] = "Remainder: " + String.format("%,d", Integer.valueOf(i37));
                    af.c[iArr[i29]][2] = (int) (((this.ds[iArr[i29]] - i31) / (i32 - i31)) * 100.0d);
                    if (af.c[iArr[i29]][2] > 100) {
                        af.c[iArr[i29]][2] = 100;
                    }
                    str4 = str4 + strArr[4] + strArr[5];
                }
                str3 = str4;
            }
            aaVar.an = str3;
        }
    }

    private void a(int i2, int i3, String str) {
        String[] split = str.split("\n");
        int length = (split.length << 4) + 6;
        int a2 = this.au.a(split[0]) + 6;
        for (int i4 = 1; i4 < split.length; i4++) {
            if (a2 <= this.au.a(split[i4]) + 6) {
                a2 = this.au.a(split[i4]) + 6;
            }
        }
        org.necrotic.client.f.c.b(length, i3, i2, 16777120, a2);
        org.necrotic.client.f.c.c(i2, a2, length, 0, i3);
        int i5 = i3 + 14;
        for (String str2 : split) {
            this.bk.a(false, i2 + 3, 0, str2, i5);
            i5 += 16;
        }
    }

    private static void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        org.necrotic.client.f.c.a(i2, i3, i4, i5, i7, ColorUtil.MAX_RGB_VALUE);
        org.necrotic.client.f.c.a(i2, i3, (int) (i4 * (i6 / 100.0f)), i5, i8, ColorUtil.MAX_RGB_VALUE);
        org.necrotic.client.f.c.a(i2 - 1, i3, i4 + 1, i5, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v352, types: [int] */
    /* JADX WARN: Type inference failed for: r0v353, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v354, types: [org.necrotic.client.Client] */
    /* JADX WARN: Type inference failed for: r0v360, types: [int] */
    /* JADX WARN: Type inference failed for: r0v361, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v362, types: [org.necrotic.client.Client] */
    public final void a(int i2, int i3, aa aaVar, int i4) {
        int i5;
        String str;
        int indexOf;
        int indexOf2;
        int indexOf3;
        int indexOf4;
        int indexOf5;
        int i6;
        org.necrotic.client.f.e eVar;
        int i7;
        String str2;
        String str3;
        String str4;
        org.necrotic.client.f.e eVar2;
        String str5;
        int indexOf6;
        int indexOf7;
        int indexOf8;
        int indexOf9;
        int indexOf10;
        String str6;
        int indexOf11;
        int indexOf12;
        int indexOf13;
        int indexOf14;
        int indexOf15;
        int i8;
        org.necrotic.client.n.d a2;
        org.necrotic.client.f.e eVar3;
        org.necrotic.client.f.e eVar4;
        org.necrotic.client.f.e a3;
        if (aaVar == null || aaVar.U == null || aaVar.aK != 0 || !aaVar.j()) {
            return;
        }
        if (aaVar.ad && this.gl != aaVar.ac && this.gr != aaVar.ac && this.go != aaVar.ac) {
            return;
        }
        int i9 = org.necrotic.client.f.c.p;
        int i10 = org.necrotic.client.f.c.k;
        int i11 = org.necrotic.client.f.c.q;
        int i12 = org.necrotic.client.f.c.l;
        org.necrotic.client.f.c.e(i3, i4, i3 + aaVar.aO, i4 + aaVar.aa);
        int length = aaVar.U.length;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = (aaVar.V[i13] + i3) - (aaVar.av ? i2 : 0);
            int i15 = (aaVar.W[i13] + i4) - (aaVar.av ? 0 : i2);
            aa aaVar2 = aa.u[aaVar.U[i13]];
            if (aaVar2 != null && !aaVar2.bb) {
                int i16 = i14 + aaVar2.aP;
                int i17 = i15 + aaVar2.aQ;
                if (aaVar2.X > 0) {
                    b(aaVar2);
                }
                for (int i18 = 0; i18 < cq.length; i18++) {
                    if (aaVar2.ac == cq[i18] + 1) {
                        if (i18 > 61) {
                            h(i16 + 1, i17);
                        } else {
                            h(i16, i17 + 1);
                        }
                    }
                }
                for (int i19 : cs) {
                    if (aaVar2.ac == i19) {
                        aaVar2.aq = 775;
                    }
                }
                if (aaVar2.ac != 1194 && aaVar2.ac != 12856) {
                    if (aaVar2.aK == 282 && aaVar2.A != null) {
                        for (int i20 = 0; i20 < aaVar2.A.length; i20++) {
                            org.necrotic.client.f.e a4 = org.necrotic.client.c.a.i.a(aaVar2.A[i20], 0, 0);
                            org.necrotic.client.f.e.a(a4, a4.d, this.fJ).e(i16 + 30 + (i20 * 50), i17 + 3);
                        }
                        if (this.fI % 3 == 0) {
                            this.fJ++;
                        }
                        this.fI++;
                        System.out.println("Cut amount: " + this.fJ);
                        if (this.fJ >= 40) {
                            aaVar2.A = null;
                            f().i(199);
                            f().l(1);
                            this.fJ = 0;
                        }
                    }
                    if (aaVar2.aK == 287) {
                        a(i16, i17, aaVar2.aO, aaVar2.aa, aaVar2.j, aaVar2.k, aaVar2.l);
                    } else if (aaVar2.aK == 288 && aaVar2.m == org.necrotic.client.f.c.o.VERTICAL_DOWN_UP) {
                        int i21 = (aaVar2.j * aaVar2.aa) / aaVar2.n;
                        new org.necrotic.client.f.e(F.b(aaVar2.aY), aaVar2.aO, Math.min(aaVar2.aa, i21)).c(i16, Math.max(i17, i17 + (aaVar2.aa - i21)));
                    }
                    if (aaVar2.aK == 150) {
                        aaVar2.bc.a(i16, i17);
                    }
                    if (aaVar2.aK == 100 && aaVar2.g != null) {
                        aaVar2.g.e(i16 + 2, i17 + 2);
                    }
                    if (aaVar2.aK == 831) {
                        org.necrotic.client.f.c.a(i16, i17, aaVar2.aO, aaVar2.aa, aaVar2.L, aaVar2.F);
                    }
                    if (aaVar2.aK == 0) {
                        if (aaVar2.av) {
                            if (aaVar2.aw > aaVar2.au - aaVar2.aO) {
                                aaVar2.aw = aaVar2.au - aaVar2.aO;
                            }
                        } else if (aaVar2.aw > aaVar2.au - aaVar2.aa) {
                            aaVar2.aw = aaVar2.au - aaVar2.aa;
                        }
                        if (aaVar2.aw < 0) {
                            aaVar2.aw = 0;
                        }
                        a(aaVar2.aw, i16, aaVar2, i17);
                        if (aaVar2.av) {
                            if (aaVar2.au > aaVar2.aO) {
                                b(aaVar2.aO, aaVar2.aw, i17 + aaVar2.aa, i16, aaVar2.au);
                            }
                        } else if (aaVar2.au > aaVar2.aa) {
                            a(aaVar2.aa, aaVar2.aw, i17, i16 + aaVar2.aO, aaVar2.au, false);
                        }
                    } else if (aaVar2.aK != 1) {
                        if (aaVar2.aK == 1319) {
                            org.necrotic.client.f.c.b(i16 + 335, i17 + 52, i16 + 51, 0, 411);
                            this.bb.e(i16, i17);
                            F.a(1421).e(((i16 + 40) + (t.aJ / 32)) - 10, ((i17 + 458) - (t.aK / 32)) - 10);
                        }
                        if (aaVar2.aK != 2) {
                            if (aaVar2.aK != 3) {
                                if (aaVar2.aK != 4) {
                                    if (aaVar2.aK == 42) {
                                        boolean z2 = false;
                                        if (!((this.go == aaVar2.ac || this.gr == aaVar2.ac || this.gl == aaVar2.ac || dn == aaVar2) ? true : true)) {
                                            aaVar2.aA.c(i16, i17);
                                        } else {
                                            aaVar2.aB.c(i16, i17);
                                        }
                                        if (aaVar2.T) {
                                            aaVar2.aG.a(aaVar2.L, i16 + aaVar2.p, aaVar2.an, i17 + aaVar2.q, true);
                                        } else {
                                            aaVar2.aG.a(aaVar2.L, aaVar2.an, i16 + 5 + aaVar2.p, i17 + aaVar2.q);
                                        }
                                    }
                                } else {
                                    org.necrotic.client.f.a.c cVar = aaVar2.aG;
                                    String str7 = aaVar2.an;
                                    int i22 = 0;
                                    int i23 = 0;
                                    if (str7.contains("<img=")) {
                                        int indexOf16 = str7.indexOf("<img=");
                                        int indexOf17 = str7.indexOf(">");
                                        try {
                                            i23 = Integer.parseInt(str7.substring(indexOf16 + 5, indexOf17));
                                            str7 = str7.replaceAll(str7.substring(indexOf16 + 5, indexOf17), "").replaceAll("</img>", "").replaceAll("<img=>", "");
                                        } catch (IllegalStateException | NumberFormatException unused) {
                                            str7 = str7;
                                        }
                                        if (indexOf17 > indexOf16) {
                                            i22 = 0 + 14;
                                        }
                                    }
                                    boolean z3 = false;
                                    z3 = (this.go == aaVar2.ac || this.gr == aaVar2.ac || this.gl == aaVar2.ac || dn == aaVar2) ? true : true;
                                    if (c(aaVar2)) {
                                        i5 = aaVar2.L;
                                        if (z3 && aaVar2.N != 0) {
                                            i5 = aaVar2.N;
                                        }
                                        if (aaVar2.R.length() > 0) {
                                            str7 = aaVar2.R;
                                        }
                                    } else {
                                        boolean z4 = aaVar2.Z;
                                        i5 = aaVar2.aF;
                                        if (z3 && aaVar2.K != 0) {
                                            i5 = aaVar2.K;
                                        }
                                    }
                                    if (aaVar2.S == 6 && this.ev) {
                                        str7 = "Please wait...";
                                        i5 = aaVar2.aF;
                                    }
                                    if (org.necrotic.client.f.c.i == 516) {
                                        if (i5 == 16776960) {
                                            i5 = 255;
                                        }
                                        if (i5 == 49152) {
                                            i5 = 16777215;
                                        }
                                    }
                                    if (aaVar2.ac >= 35613 && aaVar2.ac < 35813) {
                                        if (aa.u[3900].ae[aaVar2.ac - 35613] > 0) {
                                            String[] split = str7.split(",");
                                            int i24 = 0;
                                            if (split.length > 1) {
                                                i24 = Integer.parseInt(split[1]);
                                            }
                                            if (i24 != -1) {
                                                if (this.jR[i24] == null) {
                                                    this.jR[i24] = new org.necrotic.client.f.e("currency".concat(String.valueOf(i24)));
                                                }
                                                this.jR[i24].e(i16 - 19, i17);
                                                int parseInt = Integer.parseInt(split[0]);
                                                if (parseInt <= 0) {
                                                    this.bx.a(true, i16 - 5, 16776960, "FREE", i17 + 10);
                                                } else if (parseInt < 100000) {
                                                    this.bx.a(true, i16 - 5, 16776960, String.valueOf(parseInt), i17 + 10);
                                                } else if (parseInt < 10000000) {
                                                    this.bx.a(true, i16 - 5, 16776960, new StringBuilder().append(parseInt / 1000).toString(), i17 + 10);
                                                } else {
                                                    this.bx.a(true, i16 - 5, 16776960, new StringBuilder().append(parseInt / 1000000).toString(), i17 + 10);
                                                }
                                            }
                                        }
                                    } else {
                                        if (aaVar2.as == 1151 || aaVar2.as == 12855) {
                                            switch (i5) {
                                                case 7040819:
                                                    i5 = 11495962;
                                                    break;
                                                case 16773120:
                                                    i5 = 16685087;
                                                    break;
                                            }
                                        }
                                        int i25 = i17;
                                        int i26 = cVar.c;
                                        while (true) {
                                            int i27 = i25 + i26;
                                            if (str7.length() > 0) {
                                                if (str7.contains(Units.PERCENT)) {
                                                    while (true) {
                                                        if (str7.indexOf("%1") != -1) {
                                                            str7 = (aaVar2.ac < 4000 || !(aaVar2.ac <= 5000 || aaVar2.ac == 13921 || aaVar2.ac == 13922 || aaVar2.ac == 12171 || aaVar2.ac == 12172)) ? str7.substring(0, indexOf) + C(a(aaVar2, 0)) + str7.substring(indexOf + 2) : str7.substring(0, indexOf) + z(a(aaVar2, 0)) + str7.substring(indexOf + 2);
                                                        } else {
                                                            while (true) {
                                                                if (str7.indexOf("%2") != -1) {
                                                                    str7 = str7.substring(0, indexOf2) + z(a(aaVar2, 1)) + str7.substring(indexOf2 + 2);
                                                                } else {
                                                                    while (true) {
                                                                        if (str7.indexOf("%3") != -1) {
                                                                            str7 = str7.substring(0, indexOf3) + z(a(aaVar2, 2)) + str7.substring(indexOf3 + 2);
                                                                        } else {
                                                                            while (true) {
                                                                                if (str7.indexOf("%4") != -1) {
                                                                                    str7 = str7.substring(0, indexOf4) + z(a(aaVar2, 3)) + str7.substring(indexOf4 + 2);
                                                                                } else {
                                                                                    while (true) {
                                                                                        if (str7.indexOf("%5") != -1) {
                                                                                            str7 = str7.substring(0, indexOf5) + z(a(aaVar2, 4)) + str7.substring(indexOf5 + 2);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int indexOf18 = str7.indexOf("\\n");
                                                if (indexOf18 != -1) {
                                                    str = str7.substring(0, indexOf18);
                                                    str7 = str7.substring(indexOf18 + 2);
                                                } else {
                                                    str = str7;
                                                    str7 = "";
                                                }
                                                if (i23 > 0 && i22 > 0) {
                                                    int i28 = i17 + 14;
                                                    if (i23 >= 841 && i23 <= 849) {
                                                        i22 -= 5;
                                                        i28 -= 7;
                                                    }
                                                    this.bh.a("<img=" + i23 + ">", i16, i28, true);
                                                }
                                                if (aaVar2.T) {
                                                    cVar.a(i5, i16 + (aaVar2.aO / 2) + i22, str, i27, aaVar2.aH);
                                                } else {
                                                    cVar.a(aaVar2.aH, i16 + i22, i5, str, i27);
                                                }
                                                i25 = i27;
                                                i26 = cVar.c;
                                            }
                                        }
                                    }
                                }
                            } else {
                                boolean z5 = false;
                                z5 = (this.go == aaVar2.ac || this.gr == aaVar2.ac || this.gl == aaVar2.ac || aaVar2 == dn) ? true : true;
                                if (c(aaVar2)) {
                                    i6 = aaVar2.L;
                                    if (z5 && aaVar2.N != 0) {
                                        i6 = aaVar2.N;
                                    }
                                } else {
                                    i6 = aaVar2.aF;
                                    if (z5 && aaVar2.K != 0) {
                                        i6 = aaVar2.K;
                                    }
                                }
                                if (aaVar2.ar == 0) {
                                    if (aaVar2.G) {
                                        org.necrotic.client.f.c.b(aaVar2.aa, i17, i16, i6, aaVar2.aO);
                                    } else {
                                        org.necrotic.client.f.c.c(i16, aaVar2.aO, aaVar2.aa, i6, i17);
                                    }
                                } else if (aaVar2.G) {
                                    org.necrotic.client.f.c.c(i6, i17, aaVar2.aO, aaVar2.aa, 256 - (aaVar2.ar & 255), i16);
                                } else {
                                    org.necrotic.client.f.c.d(i17, aaVar2.aa, 256 - (aaVar2.ar & 255), i6, aaVar2.aO, i16);
                                }
                            }
                        } else {
                            int i29 = 0;
                            for (int i30 = 0; i30 < aaVar2.aa; i30++) {
                                for (int i31 = 0; i31 < aaVar2.aO; i31++) {
                                    int i32 = i16 + (i31 * (32 + aaVar2.af));
                                    int i33 = i17 + (i30 * (32 + aaVar2.ag));
                                    if (i29 < 20) {
                                        i32 += aaVar2.aD[i29];
                                        i33 += aaVar2.aE[i29];
                                    }
                                    if (i29 >= aaVar2.ae.length || aaVar2.ae[i29] <= 0) {
                                        if (aaVar2.aC != null && i29 < 20 && (eVar4 = aaVar2.aC[i29]) != null) {
                                            eVar4.e(i32, i33);
                                        }
                                    } else {
                                        if (aaVar2.ac >= 110101 && aaVar2.ac <= 110221) {
                                            if (this.fw == null) {
                                                this.fw = new org.necrotic.client.f.e("/ok/stock");
                                            }
                                            this.fw.e(i32 - 8, i33 - 4);
                                        }
                                        int i34 = 0;
                                        int i35 = 0;
                                        int i36 = aaVar2.ae[i29] - 1;
                                        if (aaVar2.ac == 49565) {
                                            org.necrotic.client.f.c.h.g(i36, i32 - 6, i33 - 6);
                                        }
                                        if ((i32 > org.necrotic.client.f.c.p - 32 && i32 < org.necrotic.client.f.c.q && i33 > org.necrotic.client.f.c.k - 32 && i33 < org.necrotic.client.f.c.l) || (this.gd != 0 && this.gu == i29)) {
                                            int i37 = 0;
                                            if (this.eH == 1 && this.gQ == i29 && this.gR == aaVar2.ac) {
                                                i37 = 16777215;
                                            }
                                            int i38 = 256;
                                            if (u == 5292 && aaVar2.ah[i29] == 0) {
                                                i38 = 110;
                                            }
                                            if (aaVar2.ac == 30375 && aaVar2.ae[i29] == 0) {
                                                aaVar2.ar = (byte) 50;
                                            }
                                            if (aaVar2.ac == 25412) {
                                                a3 = org.necrotic.client.c.a.i.b(i36, aaVar2.ah[i29], i37);
                                            } else {
                                                a3 = org.necrotic.client.c.a.i.a(i36, aaVar2.ah[i29], i37);
                                            }
                                            ab a5 = aaVar2.ai[i29] > 0 ? ab.a(aaVar2.ai[i29]) : org.necrotic.client.c.a.i.a(i36).N;
                                            if (a3 != null) {
                                                if (this.gd == 0 || this.gu != i29 || this.gt != aaVar2.ac) {
                                                    if (this.hB != 0 && this.hz == i29 && this.hA == aaVar2.ac) {
                                                        if (a5 != null) {
                                                            org.necrotic.client.f.c.b(i32, i33, a5.a());
                                                        }
                                                        a3.d(i32, i33);
                                                    } else if (aaVar2.ac == 30375 && aaVar2.ah[i29] == 0) {
                                                        a3.f(i32, i33, 75);
                                                    } else if (i38 == 256) {
                                                        if (a5 != null) {
                                                            org.necrotic.client.f.c.b(i32, i33, a5.a());
                                                        }
                                                        a3.e(i32, i33);
                                                    } else {
                                                        if (a5 != null) {
                                                            org.necrotic.client.f.c.b(i32, i33, a5.a());
                                                        }
                                                        a3.f(i32, i33, i38);
                                                    }
                                                } else {
                                                    i34 = this.bY - this.gv;
                                                    i35 = this.bZ - this.gw;
                                                    if (i34 < 5 && i34 > -5) {
                                                        i34 = 0;
                                                    }
                                                    if (i35 < 5 && i35 > -5) {
                                                        i35 = 0;
                                                    }
                                                    if (this.hh < 10) {
                                                        i34 = 0;
                                                        i35 = 0;
                                                    }
                                                    if (a5 != null) {
                                                        org.necrotic.client.f.c.b(i32 + i34, i33 + i35, a5.a());
                                                    }
                                                    a3.d(i32 + i34, i33 + i35);
                                                    int t2 = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 40 : (t() - Constants.GAME_FIXED_HEIGHT) / 2;
                                                    if (u == 5292) {
                                                        if (this.bZ >= t2 && this.bZ <= t2 + 24) {
                                                            this.jp = a3;
                                                            this.jq = this.bY - 20;
                                                            this.jr = this.bZ - 20;
                                                        } else if (this.jp != null) {
                                                            this.jp = null;
                                                        }
                                                    }
                                                    if (i33 + i35 < org.necrotic.client.f.c.k && aaVar.aw > 0) {
                                                        int i39 = (this.he * ((org.necrotic.client.f.c.k - i33) - i35)) / 3;
                                                        int i40 = i39;
                                                        if (i39 > this.he * 10) {
                                                            i40 = this.he * 10;
                                                        }
                                                        if (i40 > aaVar.aw) {
                                                            i40 = aaVar.aw;
                                                        }
                                                        aaVar.aw -= i40;
                                                        this.gw += i40;
                                                    }
                                                    if (i33 + i35 + 32 > org.necrotic.client.f.c.l && aaVar.aw < aaVar.au - aaVar.aa) {
                                                        int i41 = (this.he * (((i33 + i35) + 32) - org.necrotic.client.f.c.l)) / 3;
                                                        int i42 = i41;
                                                        if (i41 > this.he * 10) {
                                                            i42 = this.he * 10;
                                                        }
                                                        if (i42 > (aaVar.au - aaVar.aa) - aaVar.aw) {
                                                            i42 = (aaVar.au - aaVar.aa) - aaVar.aw;
                                                        }
                                                        aaVar.aw += i42;
                                                        this.gw -= i42;
                                                    }
                                                }
                                                if (aaVar2.ac == 49565) {
                                                    org.necrotic.client.f.c.h.h(i32 - 6, i33 - 6);
                                                }
                                                if (a3.v == 33 || aaVar2.ah[i29] > 1 || (u == 5292 && aaVar2.ah[i29] == 0)) {
                                                    int i43 = aaVar2.ah[i29];
                                                    if ((u != 5292 || i43 != 0) && (aaVar2.ac != 30375 || i43 <= 1)) {
                                                        boolean z6 = aaVar2.aR;
                                                    }
                                                    if (u == 5292 && i43 == 0) {
                                                        this.bg.a("<trans=170>" + c(i43), i32 + i34, i33 + 9 + i35, 16776960, 0, false);
                                                    } else if (i43 >= 1500000000 && aaVar2.al) {
                                                        F.a(780).e(i32, i33);
                                                    } else {
                                                        this.bx.b(0, c(i43), i33 + 10 + i35, i32 + 1 + i34);
                                                        if (i43 > 99999 && i43 < 10000000) {
                                                            this.bx.b(16777215, c(i43), i33 + 9 + i35, i32 + i34);
                                                        } else if (i43 > 9999999) {
                                                            this.bx.b(65408, c(i43), i33 + 9 + i35, i32 + i34);
                                                        } else {
                                                            this.bx.b(16776960, c(i43), i33 + 9 + i35, i32 + i34);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i29++;
                                }
                            }
                        }
                        if (aaVar2.aK == 130) {
                            aa aaVar3 = aa.u[aaVar.U[0]];
                            org.necrotic.client.f.c.a(i16, i17, aaVar3.aO, aaVar3.aa + 2, aaVar2.bd, aaVar2.be);
                        }
                        if (aaVar2.aK != 5) {
                            if (aaVar2.aK != 553) {
                                if (aaVar2.aK != 554) {
                                    if (aaVar2.aK != 6) {
                                        if (aaVar2.aK == 42) {
                                            if (aaVar2.r) {
                                                if (this.bY >= i16 && this.bZ >= i17 && this.bY < i16 + aaVar2.aO && this.bZ < i17 + aaVar2.aa) {
                                                    aaVar2.aB.e(i16, i17);
                                                } else {
                                                    aaVar2.aA.e(i16, i17);
                                                }
                                                if (aaVar2.T) {
                                                    aaVar2.aG.a(aaVar2.aF, i16 + aaVar2.p, aaVar2.an, i17 + aaVar2.q, true);
                                                } else {
                                                    aaVar2.aG.a(aaVar2.aF, aaVar2.an, i16 + 5 + aaVar2.p, i17 + aaVar2.q);
                                                }
                                            }
                                        } else if (aaVar2.aK != 7) {
                                            if (aaVar2.aK == 77) {
                                                if (aaVar2.v) {
                                                    org.necrotic.client.f.c.b(aaVar2.aa, i17, i16, -5331456, aaVar2.aO);
                                                } else {
                                                    org.necrotic.client.f.c.b(aaVar2.aa, i17, i16, -14738666, aaVar2.aO);
                                                }
                                                org.necrotic.client.f.c.b(aaVar2.aa - 2, i17 + 1, i16 + 1, -13554910, aaVar2.aO - 2);
                                                org.necrotic.client.f.c.b(aaVar2.aa - 4, i17 + 2, i16 + 2, -13752543, aaVar2.aO - 4);
                                                if (aaVar2.v) {
                                                    aaVar2.s.a(s % 40 < 20 ? aaVar2.w + "|" : aaVar2.w, i16 + 6, i17 + (aaVar2.aa / 2) + 5, 16777215, 0, true);
                                                } else {
                                                    aaVar2.s.a(aaVar2.w, i16 + 6, i17 + (aaVar2.aa / 2) + 5, 16777215, 0, true);
                                                }
                                            } else if (aaVar2.aK != 8 || ((this.gU != aaVar2.ac && this.gp != aaVar2.ac && this.gC != aaVar2.ac) || this.gV != 30 || this.aY)) {
                                                ?? r0 = aaVar2.aK;
                                                if (r0 == 9) {
                                                    try {
                                                        r0 = this;
                                                        r0.a(i16, i17, aaVar2.aJ);
                                                    } catch (Exception unused2) {
                                                        r0.printStackTrace();
                                                    }
                                                } else if (aaVar2.aK != 88) {
                                                    if (aaVar2.aK != 10 || this.aY || this.fr <= 0 || this.gV != 30) {
                                                        ?? r02 = aaVar2.aK;
                                                        if (r02 == 12) {
                                                            try {
                                                                r02 = this;
                                                                r02.a(i16, i17, aaVar2.an);
                                                            } catch (Exception unused3) {
                                                                r02.printStackTrace();
                                                            }
                                                        } else if (aaVar2.aK == 13) {
                                                            if (c(aaVar2)) {
                                                                eVar = aaVar2.aB;
                                                            } else {
                                                                eVar = aaVar2.aA;
                                                            }
                                                            if (eVar != null) {
                                                                if (aaVar2.ar > 0) {
                                                                    eVar.c(i16, i17, aaVar2.ar);
                                                                } else {
                                                                    eVar.e(i16, i17);
                                                                }
                                                            }
                                                        }
                                                    } else if (aaVar2.ac == this.fr) {
                                                        int i44 = 0;
                                                        int i45 = 0;
                                                        org.necrotic.client.f.a.c cVar2 = this.bk;
                                                        String str8 = aaVar2.an;
                                                        while (str8.length() > 0) {
                                                            int indexOf19 = str8.indexOf("\\n");
                                                            if (indexOf19 != -1) {
                                                                str4 = str8.substring(0, indexOf19);
                                                                str8 = str8.substring(indexOf19 + 2);
                                                            } else {
                                                                str4 = str8;
                                                                str8 = "";
                                                            }
                                                            int a6 = cVar2.a(str4);
                                                            if (a6 > i44) {
                                                                i44 = a6;
                                                            }
                                                            i45 += cVar2.c + 1;
                                                        }
                                                        int i46 = i44 + 6;
                                                        int i47 = i45 + 7;
                                                        boolean z7 = (this.ds[x(aaVar2.ac)] >= 1000000000 || af.c[x(aaVar2.ac)][0] == -1 || af.c[x(aaVar2.ac)][1] == -1 || af.c[x(aaVar2.ac)][2] == -1) ? false : true;
                                                        int i48 = ((i16 + aaVar2.aO) - 5) - i46;
                                                        int i49 = i17 + aaVar2.aa + 5;
                                                        if (z7 && af.a(aaVar2.ac) == aaVar2.ac) {
                                                            i7 = i47 + (z7 ? 11 : 0);
                                                        } else {
                                                            i7 = i47 - 2;
                                                            z7 = false;
                                                        }
                                                        if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
                                                            if (i48 < i16 + 5) {
                                                                i48 = i16 + 5;
                                                            }
                                                            if (i48 + i46 > i3 + aaVar.aO) {
                                                                i48 = (i3 + aaVar.aO) - i46;
                                                            }
                                                            if (i49 + i7 > i4 + aaVar.aa) {
                                                                i49 = i17 - i7;
                                                            }
                                                            if (af.a(aaVar2.ac) == aaVar2.ac && i48 + i46 + i3 + aaVar.aO > 765) {
                                                                i48 = (((Constants.GAME_FIXED_WIDTH - i46) - i3) - aaVar.aO) - 3;
                                                            }
                                                            if (af.a(aaVar2.ac) == aaVar2.ac && i49 + i7 > ((Constants.GAME_FIXED_HEIGHT - i49) + i7) - 118) {
                                                                i49 -= i7 + 35;
                                                            }
                                                        } else {
                                                            if (i48 < i16 + 5) {
                                                                i48 = i16 + 5;
                                                            }
                                                            if (i48 > 1560 && i48 < 1600) {
                                                                i48 -= 40;
                                                            } else if (i48 >= 1600) {
                                                                i48 -= 90;
                                                            }
                                                            if (i48 + i46 > p) {
                                                                int i50 = i48;
                                                                i48 = i50 - ((i50 + i46) - p);
                                                            }
                                                            if (i49 + i7 > i4 + aaVar.aa) {
                                                                i49 = i17 - i7;
                                                            }
                                                        }
                                                        org.necrotic.client.f.c.b(i7, i49, i48, 16777120, i46);
                                                        if (z7 && this.ds[x(aaVar2.ac)] < 1000000000 && af.c[x(aaVar2.ac)][0] != -1 && af.c[x(aaVar2.ac)][1] != -1 && af.c[x(aaVar2.ac)][2] != -1) {
                                                            int i51 = af.c[x(aaVar2.ac)][2];
                                                            org.necrotic.client.f.c.c(i48 + 4, i46 - 7, 12, 0, (i49 + i7) - 14);
                                                            org.necrotic.client.f.c.b(10, (i49 + i7) - 13, i48 + 4 + 1, Color.RED.getRGB(), i46 - 9);
                                                            org.necrotic.client.f.c.b(10, (i49 + i7) - 13, i48 + 4 + 1, Color.GREEN.getRGB(), ((int) (((i46 - 7) * 0.01d) * i51)) - 2);
                                                            if (i51 == 100) {
                                                                this.bx.a(0, "Goal Completed!", (i49 - 3) + i7, (int) (i48 + (((i46 - 7) - (cVar2.a("Goal Completed!") + 10)) / 2.0d) + 54.0d));
                                                            } else {
                                                                this.bx.a(0, i51 + Units.PERCENT, (i49 - 3) + i7, (int) (i48 + (((i46 - 6) - (cVar2.a(i51 + Units.PERCENT) + 10)) / 2.0d) + 24.0d));
                                                            }
                                                        }
                                                        org.necrotic.client.f.c.c(i48, i46, i7, 0, i49);
                                                        String str9 = aaVar2.an;
                                                        int i52 = i49 + cVar2.c;
                                                        int i53 = 2;
                                                        while (true) {
                                                            int i54 = i52 + i53;
                                                            if (str9.length() > 0) {
                                                                int indexOf20 = str9.indexOf("\\n");
                                                                if (indexOf20 != -1) {
                                                                    str2 = str9.substring(0, indexOf20);
                                                                    str3 = str9.substring(indexOf20 + 2);
                                                                } else {
                                                                    str2 = str9;
                                                                    str3 = "";
                                                                }
                                                                str9 = str3;
                                                                cVar2.a(false, i48 + 3, 0, str2, i54);
                                                                i52 = i54;
                                                                i53 = cVar2.c + 1;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (c(aaVar2)) {
                                                        eVar2 = aaVar2.aB;
                                                    } else {
                                                        eVar2 = aaVar2.aA;
                                                    }
                                                    if (eVar2 != null) {
                                                        if (aaVar2.E) {
                                                            eVar2.c(i16, i17, aaVar2.F);
                                                        } else {
                                                            eVar2.e(i16, i17);
                                                        }
                                                    }
                                                }
                                            } else {
                                                int i55 = 0;
                                                int i56 = 0;
                                                org.necrotic.client.f.a.c cVar3 = this.bk;
                                                String str10 = aaVar2.an;
                                                while (str10.length() > 0) {
                                                    if (str10.indexOf(Units.PERCENT) != -1) {
                                                        while (true) {
                                                            if (str10.indexOf("%1") != -1) {
                                                                str10 = str10.substring(0, indexOf11) + z(a(aaVar2, 0)) + str10.substring(indexOf11 + 2);
                                                            } else {
                                                                while (true) {
                                                                    if (str10.indexOf("%2") != -1) {
                                                                        str10 = str10.substring(0, indexOf12) + z(a(aaVar2, 1)) + str10.substring(indexOf12 + 2);
                                                                    } else {
                                                                        while (true) {
                                                                            if (str10.indexOf("%3") != -1) {
                                                                                str10 = str10.substring(0, indexOf13) + z(a(aaVar2, 2)) + str10.substring(indexOf13 + 2);
                                                                            } else {
                                                                                while (true) {
                                                                                    if (str10.indexOf("%4") != -1) {
                                                                                        str10 = str10.substring(0, indexOf14) + z(a(aaVar2, 3)) + str10.substring(indexOf14 + 2);
                                                                                    } else {
                                                                                        while (true) {
                                                                                            if (str10.indexOf("%5") != -1) {
                                                                                                str10 = str10.substring(0, indexOf15) + z(a(aaVar2, 4)) + str10.substring(indexOf15 + 2);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int indexOf21 = str10.indexOf("\\n");
                                                    if (indexOf21 != -1) {
                                                        str6 = str10.substring(0, indexOf21);
                                                        str10 = str10.substring(indexOf21 + 2);
                                                    } else {
                                                        str6 = str10;
                                                        str10 = "";
                                                    }
                                                    int a7 = cVar3.a(str6);
                                                    if (a7 > i55) {
                                                        i55 = a7;
                                                    }
                                                    i56 += cVar3.c + 1;
                                                }
                                                int i57 = i55 + 6;
                                                int i58 = i56 + 7;
                                                int i59 = ((i16 + aaVar2.aO) - 5) - i57;
                                                int i60 = i17 + aaVar2.aa + 5;
                                                if (i59 < i16 + 5) {
                                                    i59 = i16 + 5;
                                                }
                                                if (i59 + i57 > i3 + aaVar.aO) {
                                                    i59 = (i3 + aaVar.aO) - i57;
                                                }
                                                if (i60 + i58 > i4 + aaVar.aa) {
                                                    i60 = i17 - i58;
                                                }
                                                org.necrotic.client.f.c.b(i58, i60, i59, 16777120, i57);
                                                org.necrotic.client.f.c.c(i59, i57, i58, 0, i60);
                                                String str11 = aaVar2.an;
                                                int i61 = i60 + cVar3.c;
                                                int i62 = 2;
                                                while (true) {
                                                    int i63 = i61 + i62;
                                                    if (str11.length() > 0) {
                                                        if (str11.indexOf(Units.PERCENT) != -1) {
                                                            while (true) {
                                                                if (str11.indexOf("%1") != -1) {
                                                                    str11 = str11.substring(0, indexOf6) + z(a(aaVar2, 0)) + str11.substring(indexOf6 + 2);
                                                                } else {
                                                                    while (true) {
                                                                        if (str11.indexOf("%2") != -1) {
                                                                            str11 = str11.substring(0, indexOf7) + z(a(aaVar2, 1)) + str11.substring(indexOf7 + 2);
                                                                        } else {
                                                                            while (true) {
                                                                                if (str11.indexOf("%3") != -1) {
                                                                                    str11 = str11.substring(0, indexOf8) + z(a(aaVar2, 2)) + str11.substring(indexOf8 + 2);
                                                                                } else {
                                                                                    while (true) {
                                                                                        if (str11.indexOf("%4") != -1) {
                                                                                            str11 = str11.substring(0, indexOf9) + z(a(aaVar2, 3)) + str11.substring(indexOf9 + 2);
                                                                                        } else {
                                                                                            while (true) {
                                                                                                if (str11.indexOf("%5") != -1) {
                                                                                                    str11 = str11.substring(0, indexOf10) + z(a(aaVar2, 4)) + str11.substring(indexOf10 + 2);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int indexOf22 = str11.indexOf("\\n");
                                                        if (indexOf22 != -1) {
                                                            str5 = str11.substring(0, indexOf22);
                                                            str11 = str11.substring(indexOf22 + 2);
                                                        } else {
                                                            str5 = str11;
                                                            str11 = "";
                                                        }
                                                        if (aaVar2.T) {
                                                            cVar3.a(i60, i59 + (aaVar2.aO / 2), str5, i63, false);
                                                        } else if (str5.contains("\\r")) {
                                                            String substring = str5.substring(0, str5.indexOf("\\r"));
                                                            String str12 = str5;
                                                            String substring2 = str12.substring(str12.indexOf("\\r") + 2);
                                                            cVar3.a(false, i59 + 3, 0, substring, i63);
                                                            cVar3.a(false, ((i57 + i59) - cVar3.a(substring2)) - 2, 0, substring2, i63);
                                                        } else {
                                                            cVar3.a(false, i59 + 3, 0, str5, i63);
                                                        }
                                                        i61 = i63;
                                                        i62 = cVar3.c + 1;
                                                    }
                                                }
                                            }
                                        } else {
                                            org.necrotic.client.f.a.c cVar4 = aaVar2.aG;
                                            int i64 = 0;
                                            for (int i65 = 0; i65 < aaVar2.aa; i65++) {
                                                for (int i66 = 0; i66 < aaVar2.aO; i66++) {
                                                    if (aaVar2.ae[i64] > 0) {
                                                        org.necrotic.client.c.a.i a8 = org.necrotic.client.c.a.i.a(aaVar2.ae[i64] - 1);
                                                        String str13 = a8.G;
                                                        if (a8.I || aaVar2.ah[i64] != 1) {
                                                            str13 = str13 + " x" + i(aaVar2.ah[i64]);
                                                        }
                                                        int i67 = i16 + (i66 * (115 + aaVar2.af));
                                                        int i68 = i17 + (i65 * (12 + aaVar2.ag));
                                                        if (aaVar2.T) {
                                                            cVar4.a(aaVar2.aF, i67 + (aaVar2.aO / 2), str13, i68, aaVar2.aH);
                                                        } else {
                                                            cVar4.a(aaVar2.aH, i67, aaVar2.aF, str13, i68);
                                                        }
                                                    }
                                                    i64++;
                                                }
                                            }
                                        }
                                    } else {
                                        int i69 = org.necrotic.client.n.l.z;
                                        int i70 = org.necrotic.client.n.l.A;
                                        org.necrotic.client.n.l.z = i16 + (aaVar2.aO / 2);
                                        org.necrotic.client.n.l.A = i17 + (aaVar2.aa / 2);
                                        int i71 = (org.necrotic.client.n.l.e[aaVar2.ao] * aaVar2.aq) >> 16;
                                        int i72 = (org.necrotic.client.n.l.f[aaVar2.ao] * aaVar2.aq) >> 16;
                                        boolean c2 = c(aaVar2);
                                        if (c2) {
                                            i8 = aaVar2.Q;
                                        } else {
                                            i8 = aaVar2.P;
                                        }
                                        if (i8 == -1) {
                                            a2 = aaVar2.a(-1, -1, c2);
                                        } else {
                                            org.necrotic.client.c.a.a aVar = org.necrotic.client.c.a.a.a[i8];
                                            a2 = aaVar2.a(aVar.d[aaVar2.O], aVar.c[aaVar2.O], c2);
                                        }
                                        if (a2 != null) {
                                            org.necrotic.client.n.l.a();
                                            a2.a(aaVar2.ap, 0, aaVar2.ao, 0, i71, i72);
                                        }
                                        org.necrotic.client.n.l.z = i69;
                                        org.necrotic.client.n.l.A = i70;
                                    }
                                } else {
                                    y yVar = (y) aaVar2;
                                    int i73 = yVar.a[yVar.b];
                                    int i74 = yVar.f[yVar.d];
                                    if (yVar.e) {
                                        int i75 = (yVar.c * yVar.aO) / 100;
                                        org.necrotic.client.f.c.b(yVar.aa, i17, i16, i74, yVar.aO);
                                        org.necrotic.client.f.c.b(yVar.aa, i17, i16, i73, i75);
                                        org.necrotic.client.f.c.c(i16, yVar.aO, yVar.aa, 0, i17);
                                    } else {
                                        int i76 = yVar.c;
                                        z.a(i16, i17, yVar.aO, yVar.aa, i74);
                                        z.a(i16, i17, yVar.aO, i76, i73);
                                        z.a(i16, i17, yVar.aO, yVar.aa);
                                    }
                                }
                            } else {
                                aaVar2.aA.a(i16, i17, aaVar2.aB);
                            }
                        } else {
                            if (aaVar2.aW > 0 && aaVar2.aA == null && aaVar2.aB == null) {
                                aaVar2.aA = org.necrotic.client.c.a.i.a(aaVar2.aW, 1, aaVar2.aX == -1 ? 0 : -1, aaVar2.aX, false);
                                aaVar2.aB = org.necrotic.client.c.a.i.a(aaVar2.aW, 1, aaVar2.aX == -1 ? 0 : -1, aaVar2.aX, false);
                            }
                            if (c(aaVar2)) {
                                eVar3 = aaVar2.aB;
                            } else {
                                eVar3 = aaVar2.aA;
                            }
                            if (aaVar2.ac == 1164 || aaVar2.ac == 1167 || aaVar2.ac == 1170 || aaVar2.ac == 1174 || aaVar2.ac == 1540 || aaVar2.ac == 1541 || aaVar2.ac == 7455 || aaVar2.ac == 18470 || aaVar2.ac == 13035 || aaVar2.ac == 13045 || aaVar2.ac == 13053 || aaVar2.ac == 13061 || aaVar2.ac == 13069 || aaVar2.ac == 13079 || aaVar2.ac == 30064 || aaVar2.ac == 30075 || aaVar2.ac == 30083 || aaVar2.ac == 30106 || aaVar2.ac == 30114 || aaVar2.ac == 30106 || aaVar2.ac == 30170 || aaVar2.ac == 13087 || aaVar2.ac == 30162 || aaVar2.ac == 13095) {
                                eVar3 = aaVar2.aB;
                            }
                            if (aaVar2.aU > 0 && aaVar2.aA != null && aaVar2.aB != null) {
                                aaVar2.aV = aaVar2.aU > this.O[23];
                                if (aaVar2.aV) {
                                    aaVar2.aA.i();
                                    eVar3 = aaVar2.aA;
                                } else {
                                    eVar3 = aaVar2.aB;
                                }
                            }
                            if (this.eP == 1 && aaVar2.ac == dm && dm != 0 && eVar3 != null) {
                                eVar3.e(i16, i17, 16777215);
                            } else if (eVar3 != null) {
                                if (aaVar2.aT) {
                                    eVar3.c(i16, i17);
                                } else {
                                    eVar3.e(i16, i17);
                                }
                            }
                            if (this.eT && aaVar2.ac == this.eU) {
                                F.a(497).e(i16 - 3, i17 - 3);
                            }
                        }
                        if (aaVar2.aK == 111) {
                            boolean z8 = aaVar2.i;
                            org.necrotic.client.f.e eVar5 = aaVar2.aA;
                            if (c(aaVar2) || z8) {
                                eVar5 = aaVar2.aB;
                            }
                            eVar5.e(i16, i17);
                        }
                        if (aaVar2.aK == 100 && aaVar2.g != null) {
                            aaVar2.g.e(i16 + 2, i17 + 2);
                        }
                    }
                }
            }
        }
        org.necrotic.client.f.c.e(i9, i10, i11, i12);
    }

    private static int x(int i2) {
        int[] iArr = {4040, 4076, 4112, 4046, 4082, 4118, 4052, 4088, 4124, 4058, 4094, 4130, 4064, 4100, 4136, 4070, 4106, 4142, 4160, 2832, 13917, 28173, 28174, 28175, 28176};
        int[] iArr2 = {0, 3, 14, 2, 16, 13, 1, 15, 10, 4, 17, 7, 5, 12, 11, 6, 9, 8, 20, 18, 19, 21, 22, 23, 24, 25};
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return iArr2[i3];
            }
        }
        return 0;
    }

    private void b(boolean z2, int i2, int i3, boolean z3) {
        a(z2, i2, i3, z3);
    }

    private void Y() {
        Account account;
        ar();
        this.jc.a();
        org.necrotic.client.f.c.c(0, 0, s(), t());
        int s2 = s() / 2;
        int t2 = t() / 2;
        this.ja += this.ja < 250 ? 8 : 0;
        if (this.ja < 250) {
            F.a(449).c(s2 - (F.a(449).d / 2), t2 - (F.a(449).e / 2), this.ja);
        } else {
            int i2 = -1;
            this.bI = null;
            this.fn = false;
            this.fm = false;
            this.fl = false;
            this.fk = false;
            this.fj = false;
            this.ft = false;
            for (int i3 = 0; i3 < this.fo.length; i3++) {
                this.fo[i3] = false;
                this.fp[i3] = false;
            }
            if (this.bY >= 280 && this.bY <= 485 && this.bZ >= 312 && this.bZ <= 350) {
                this.fj = true;
            }
            if (this.jX) {
                if (this.bY >= 228 && this.bY <= 265 && this.bZ >= 190 && this.bZ <= 210) {
                    this.ft = true;
                }
                if (this.bY >= 236 && this.bY <= 536 && this.bZ >= 270 && this.bZ <= 308) {
                    i2 = 2;
                    this.fl = true;
                }
            } else {
                if (this.bY >= 233 && this.bY <= 533) {
                    if (this.bZ >= 189 && this.bZ <= 229) {
                        i2 = 2;
                        this.fl = true;
                    } else if (this.bZ >= 238 && this.bZ <= 276) {
                        i2 = 2;
                        this.fm = true;
                    }
                }
                if (this.bY >= 230 && this.bY <= 270 && this.bZ >= 240 && this.bZ <= 312) {
                    this.fk = true;
                }
            }
            if (this.bY >= 225 && this.bY <= 540 && this.bZ >= 394 && this.bZ <= 449) {
                this.fo[0] = this.bY >= 225 && this.bY <= 280;
                this.fo[1] = this.bY >= 355 && this.bY <= 410;
                this.fo[2] = this.bY >= 485 && this.bY <= 540;
                for (int i4 = 0; i4 < this.fo.length && !this.fo[i4]; i4++) {
                }
            }
            if (this.bY >= 282 && this.bY <= 550 && this.bZ >= 394 && this.bZ <= 404) {
                this.fp[0] = this.bY >= 280 && this.bY <= 290;
                this.fp[1] = this.bY >= 410 && this.bY <= 420;
                this.fp[2] = this.bY >= 540 && this.bY <= 550;
                for (int i5 = 0; i5 < this.fp.length && !this.fp[i5]; i5++) {
                }
            }
            if (i2 == 12 || i2 == 2) {
                j().setCursor(new Cursor(i2));
            } else if (i2 == 1061) {
                super.a(org.necrotic.client.f.b.CURSOR_55);
            } else if (org.necrotic.a.n) {
                super.a(org.necrotic.client.f.b.CURSOR_0);
            } else {
                j().setCursor(new Cursor(0));
            }
            F.a(449).c(0, 0);
            if (this.fj) {
                F.a(464).c(263, 305);
            } else {
                F.a(463).c(263, 305);
            }
            if (!this.jX) {
                if (this.fl) {
                    F.a(466).c(260, 190);
                } else {
                    F.a(465).c(260, 190);
                }
                if (this.fm) {
                    F.a(470).c(260, 238);
                } else {
                    F.a(469).c(260, 238);
                }
                if (org.necrotic.a.d) {
                    F.a(468).c(250, 288);
                } else {
                    F.a(467).c(250, 288);
                }
            }
            if (this.jX) {
                if (this.fl) {
                    F.a(470).c(237, 270);
                } else {
                    F.a(469).c(237, 270);
                }
                if (this.iq == 0 && s % 45 < 10) {
                    this.au.a(true, 289, 16777215, this.jZ + "|", 292);
                } else {
                    this.au.a(true, 289, 16777215, this.jZ, 292);
                }
            } else {
                if (this.iq == 0 && s % 45 < 10) {
                    this.au.a(true, 289, 16777215, D + "|", 213);
                } else {
                    this.au.a(true, 289, 16777215, D, 213);
                }
                if (this.iq == 1 && s % 45 < 10) {
                    this.au.a(true, 289, 16777215, f(this.bM) + "|", 263);
                } else {
                    this.au.a(true, 289, 16777215, f(this.bM), 263);
                }
            }
            if (!this.jX) {
                int i6 = 226;
                for (int i7 = 0; i7 < this.fo.length; i7++) {
                    if (this.eQ.getAccounts()[i7] == null) {
                        if (this.eQ != null) {
                            if (this.fo[i7]) {
                                F.a(1594).c(i6, 394);
                                F.a(1598).c(i6 - 33, 454);
                            } else {
                                F.a(1593).c(i6, 394);
                                F.a(1597).c(i6 - 33, 454);
                            }
                            if (this.fp[i7]) {
                                F.a(1600).c(i6 + 54, 394);
                            } else {
                                F.a(1599).c(i6 + 54, 394);
                            }
                        }
                    } else {
                        if (this.fo[i7]) {
                            F.a(1596).c(i6, 394);
                            F.a(1598).c(i6 - 33, 454);
                        } else {
                            F.a(1595).c(i6, 394);
                            F.a(1597).c(i6 - 33, 454);
                        }
                        if (this.fp[i7]) {
                            F.a(1600).c(i6 + 54, 394);
                        } else {
                            F.a(1599).c(i6 + 54, 394);
                        }
                        this.bg.a(account.getUsername(), i6 + 26, 469, 16777215, 0);
                    }
                    i6 += 130;
                }
            }
            if (!this.jX) {
                for (int i8 = 0; i8 < this.ip.length; i8++) {
                    String str = this.ip[i8];
                    if (str != null && str.length() != 0) {
                        this.au.a(true, (p / 2) - (this.au.a(str) / 2), 16777215, str, (o / 2) + (i8 * 20) + 240);
                    }
                }
            } else if (this.jY) {
                org.necrotic.client.f.c.d(16777215, 185, this.ka.d, this.ka.e + 10, (p - this.ka.d) / 2);
                this.ka.c((p - this.ka.d) / 2, 190);
                if (this.ft) {
                    this.bh.a("Back", 245, 205, 16766720, 0);
                } else {
                    this.bh.a("Back", 245, 205, 16777215, 0);
                }
            }
        }
        if (!this.jA) {
            this.jc.a(cn.getGraphics(), 0, 0);
        }
        if (this.jl) {
            this.jl = false;
        }
    }

    public final void i() {
        int i2 = this.iD;
        int i3 = this.iE;
        int i4 = this.iF;
        int i5 = this.bY;
        int i6 = this.bZ;
        int i7 = this.iC + 1;
        if (this.aZ == 1 && org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
            i2 += 519;
            i3 += 168;
        }
        if (this.aZ == 2 && org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
            i3 += 338;
        }
        if (this.aZ == 3 && org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
            i2 += 515;
        }
        if (this.aZ == 0) {
            i5 -= 4;
            i6 -= 4;
        }
        if (this.aZ == 1 && org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
            i5 -= 519;
            i6 -= 168;
        }
        if (this.aZ == 2 && org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
            i5 -= 17;
            i6 -= 338;
        }
        if (this.aZ == 3 && org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
            i5 -= 515;
        }
        org.necrotic.client.f.c.b(i7 - 4, i3 + 2, i2, 7367262, i4);
        org.necrotic.client.f.c.b(i7 - 2, i3 + 1, i2 + 1, 7367262, i4 - 2);
        org.necrotic.client.f.c.b(i7, i3, i2 + 2, 7367262, i4 - 4);
        org.necrotic.client.f.c.b(i7 - 2, i3 + 1, i2 + 3, 2959394, i4 - 6);
        org.necrotic.client.f.c.b(i7 - 4, i3 + 2, i2 + 2, 2959394, i4 - 4);
        org.necrotic.client.f.c.b(i7 - 6, i3 + 3, i2 + 1, 2959394, i4 - 2);
        org.necrotic.client.f.c.b(i7 - 22, i3 + 19, i2 + 2, 5392957, i4 - 4);
        org.necrotic.client.f.c.b(i7 - 22, i3 + 20, i2 + 3, 5392957, i4 - 6);
        org.necrotic.client.f.c.b(i7 - 23, i3 + 20, i2 + 3, 2828060, i4 - 6);
        org.necrotic.client.f.c.c(i2 + 3, i4 - 6, 1, 2763035, i3 + 2);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 2762267, i3 + 3);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 2433302, i3 + 4);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 2170389, i3 + 5);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 1973010, i3 + 6);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 1709838, i3 + 7);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 2, 1380875, i3 + 8);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 1051912, i3 + 10);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 592388, i3 + 11);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 526083, i3 + 12);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 592388, i3 + 13);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 460802, i3 + 14);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 592388, i3 + 15);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 460802, i3 + 16);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 592388, i3 + 17);
        org.necrotic.client.f.c.c(i2 + 2, i4 - 4, 1, 2763035, i3 + 18);
        org.necrotic.client.f.c.c(i2 + 3, i4 - 6, 1, 5654851, i3 + 19);
        this.bi.a("Choose Option", i2 + 3, i3 + 14, 13023381, 0, true);
        int i8 = i2;
        for (int i9 = 0; i9 < this.aX; i9++) {
            int i10 = i3 + 31 + (((this.aX - 1) - i9) * 15);
            int i11 = 16777215;
            if (i5 > i2 && i5 < i2 + i4 && i6 > i10 - 11 && i6 < i10 + 5) {
                org.necrotic.client.f.c.b(15, i10 - 11, i2 + 3, 7301469, this.iF - 6);
                h(this.aW[i9]);
                i11 = 16776960;
                this.jx = i9;
            }
            this.bi.a(this.aW[i9], i2 + 3, i10, i11, 0, true);
            i2 = i8;
        }
    }

    private void h(String str) {
        if (!org.necrotic.a.n || str == null || str.isEmpty()) {
            return;
        }
        org.necrotic.client.f.b bVar = null;
        String replaceAll = str.replaceAll("@gre@", "").replaceAll("@yel@", "");
        org.necrotic.client.f.b[] values = org.necrotic.client.f.b.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            org.necrotic.client.f.b bVar2 = values[i2];
            if (!replaceAll.startsWith(bVar2.tooltip)) {
                i2++;
            } else {
                bVar = bVar2;
                break;
            }
        }
        if (bVar == null) {
            bVar = org.necrotic.client.f.b.CURSOR_0;
        }
        super.a(bVar);
    }

    private void Z() {
        this.eb.a(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 519 : s() - 170);
        this.eb.b(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 0 : 1);
        this.eb.a(this);
    }

    public final void a(org.necrotic.client.f.e eVar, int i2, int i3) {
        int i4 = (i3 * i3) + (i2 * i2);
        if (i4 > 4225 && i4 < 90000) {
            int i5 = (this.bC + this.bc) & 2047;
            int i6 = org.necrotic.client.n.l.e[i5];
            int i7 = org.necrotic.client.n.l.f[i5];
            int i8 = this.bd;
            int i9 = (i6 << 8) / 256;
            int i10 = this.bd;
            int i11 = (i7 << 8) / 256;
            double atan2 = Math.atan2(((i2 * i9) + (i3 * i11)) >> 16, ((i2 * i11) - (i3 * i9)) >> 16);
            int sin = (int) (Math.sin(atan2) * 63.0d);
            int cos = (int) (Math.cos(atan2) * 57.0d);
            org.necrotic.client.f.e eVar2 = this.iu;
            int i12 = (83 - cos) - 20;
            int i13 = ((sin + 94) + 4) - 10;
            eVar2.a();
            try {
                int i14 = (-20) / 2;
                int i15 = (-20) / 2;
                int sin2 = (int) (Math.sin(atan2) * 65536.0d);
                int cos2 = (int) (Math.cos(atan2) * 65536.0d);
                int i16 = (sin2 << 8) >> 8;
                int i17 = (cos2 << 8) >> 8;
                int i18 = 983040 + (i16 * (-10)) + (i17 * (-10));
                int i19 = 983040 + ((i17 * (-10)) - (i16 * (-10)));
                int i20 = i13 + (i12 * org.necrotic.client.f.c.i);
                for (int i21 = 0; i21 < 20; i21++) {
                    int i22 = i20;
                    int i23 = i18;
                    int i24 = i19;
                    for (int i25 = -20; i25 < 0; i25++) {
                        int i26 = eVar2.c[(i23 >> 16) + ((i24 >> 16) * eVar2.d)];
                        if (i26 != 0) {
                            int i27 = i22;
                            i22++;
                            org.necrotic.client.f.c.h[i27] = i26;
                        } else {
                            i22++;
                        }
                        i23 += i17;
                        i24 -= i16;
                    }
                    i18 += i16;
                    i19 += i17;
                    i20 += org.necrotic.client.f.c.i;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        b(eVar, i3, i2);
    }

    private static void b(int i2, int i3, int i4, int i5, int i6) {
        int i7 = (i2 - 32) / 5;
        int i8 = ((i2 - 32) * i2) / i6;
        int i9 = i8;
        if (i8 < 10) {
            i9 = 10;
        }
        int i10 = (i9 / 5) - 2;
        int i11 = ((((i2 - 32) - i9) * i3) / (i6 - i2)) + 16 + i5;
        int i12 = 0;
        int i13 = i5 + 16;
        while (i12 <= i7) {
            F.a(1108).e(i13, i4);
            i12++;
            i13 += 5;
        }
        F.a(1107).e(i11, i4);
        int i14 = i11 + 5;
        for (int i15 = 0; i15 <= i10; i15++) {
            F.a(1110).e(i14, i4);
            i14 += 5;
        }
        F.a(1109).e(((((i2 - 32) - i9) * i3) / (i6 - i2)) + 16 + i5 + (i9 - 5), i4);
        F.a(1112).e(i5, i4);
        F.a(1111).e((i5 + i2) - 16, i4);
    }

    public final void a(int i2, int i3, int i4, int i5, int i6, boolean z2) {
        int i7;
        int i8 = (i2 - 32) / 5;
        int i9 = ((i2 - 32) * i2) / i6;
        if (z2) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        if (i9 < 10) {
            i9 = 10;
        }
        int i10 = (i9 / 5) - 2;
        int i11 = ((((i2 - 32) - i9) * i3) / (i6 - i2)) + 16 + i4;
        int i12 = 0;
        int i13 = i4 + 16;
        while (i12 <= i8) {
            this.ef[i7 + 1].e(i5, i13);
            i12++;
            i13 += 5;
        }
        this.ef[i7 + 2].e(i5, i11);
        int i14 = i11 + 5;
        for (int i15 = 0; i15 <= i10; i15++) {
            this.ef[i7 + 3].e(i5, i14);
            i14 += 5;
        }
        this.ef[i7].e(i5, (((((((i2 - 32) - i9) * i3) / (i6 - i2)) + 16) + i4) + i9) - 5);
        if (z2) {
            this.ee[4].e(i5, i4);
            this.ee[5].e(i5, (i4 + i2) - 16);
            return;
        }
        this.ee[0].e(i5, i4);
        this.ee[1].e(i5, (i4 + i2) - 16);
    }

    private void aa() {
        int i2 = this.dI[2000] & ColorUtil.MAX_RGB_VALUE;
        int i3 = (this.dI[2000] >> 8) & ColorUtil.MAX_RGB_VALUE;
        org.necrotic.client.f.e a2 = F.a(617);
        org.necrotic.client.f.e a3 = F.a(613);
        org.necrotic.client.f.e a4 = F.a(614);
        org.necrotic.client.f.e eVar = new org.necrotic.client.f.e(0, 0);
        for (int i4 = 0; i4 < 9; i4++) {
            if (i4 < i2) {
                aa.u[i4 + 41018].aA = a3;
                aa.u[i4 + 41018].aI = "Click here to select tab " + (i4 + 1);
            } else {
                aa.u[i4 + 41018].aA = eVar;
                aa.u[i4 + 41018].aI = "";
            }
            aa.u[i4 + 41027].ae[0] = -1;
            aa.u[i4 + 41027].ah[0] = 0;
        }
        if (i2 < 9) {
            aa.u[i2 + 41018].aA = a4;
            aa.u[i2 + 41018].aI = "Drag an item here to create a new tab";
        }
        aa.u[i3 + 41018].aA = a2;
    }

    private void ab() {
        this.bz.a(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 516 : (s() - this.bz.f()) + 12);
        this.bz.b(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 168 : (t() - this.bz.c()) + 2);
        this.bz.a(this);
    }

    private void ac() {
        String str;
        if (this.aX < 2 && this.eH == 0 && this.eP == 0) {
            if (org.necrotic.a.n) {
                super.a(org.necrotic.client.f.b.CURSOR_0);
                return;
            }
            return;
        }
        if (this.eH == 1 && this.aX < 2) {
            str = "Use " + this.iT + " with...";
        } else if (this.eP == 1 && this.aX < 2) {
            str = this.iW + "...";
        } else {
            str = this.aW[this.aX - 1];
        }
        if (this.aX > 2) {
            str = str + "@whi@ / " + (this.aX - 2) + " more options";
        }
        this.bi.a(str, 4, 15, 16777215, 0, true);
        if (org.necrotic.a.n) {
            h(this.aW[this.aX - 1]);
        }
    }

    private void ad() {
        if (this.ey > 0) {
            at();
            return;
        }
        if (this.aH != null) {
            this.aH.a();
        }
        F.a(1105).e(7, 4);
        if (!this.jA && this.aH != null) {
            this.aH.a(cn.getGraphics(), this.eY, this.eZ);
        }
        this.X = 0;
        this.aA = 0;
        org.necrotic.client.h.a aVar = this.hI;
        aL = false;
        this.io = 0;
        a(this.bM, true, D, this);
        if (!aL) {
            at();
        }
        try {
            aVar.b();
        } catch (Exception unused) {
        }
    }

    private int a(aa aaVar, int i2) {
        if (aaVar.aN == null || i2 >= aaVar.aN.length) {
            return -2;
        }
        try {
            int[] iArr = aaVar.aN[i2];
            int i3 = 0;
            int i4 = 0;
            boolean z2 = false;
            while (true) {
                int i5 = i4;
                i4++;
                int i6 = iArr[i5];
                int i7 = 0;
                boolean z3 = false;
                if (i6 == 0) {
                    return i3;
                }
                if (i6 == 1) {
                    i4++;
                    i7 = this.K[iArr[i4]];
                }
                if (i6 == 2) {
                    int i8 = i4;
                    i4++;
                    i7 = this.O[iArr[i8]];
                }
                if (i6 == 3) {
                    int i9 = i4;
                    i4++;
                    i7 = this.ds[iArr[i9]];
                }
                if (i6 == 4) {
                    int i10 = i4;
                    int i11 = i4 + 1;
                    aa aaVar2 = aa.u[iArr[i10]];
                    i4 = i11 + 1;
                    int i12 = iArr[i11];
                    if (i12 >= 0 && i12 < org.necrotic.client.c.a.i.g && (!org.necrotic.client.c.a.i.a(i12).y || de)) {
                        for (int i13 = 0; i13 < aaVar2.ae.length; i13++) {
                            if (aaVar2.ae[i13] == i12 + 1) {
                                i7 += aaVar2.ah[i13];
                            }
                        }
                    }
                }
                if (i6 == 5 || i6 == 111) {
                    int i14 = i4;
                    i4++;
                    i7 = this.bO[iArr[i14]];
                }
                if (i6 == 6) {
                    int i15 = i4;
                    i4++;
                    i7 = cp[this.O[iArr[i15]] - 1];
                }
                if (i6 == 7) {
                    int i16 = i4;
                    i4++;
                    i7 = (this.bO[iArr[i16]] * 100) / 46875;
                }
                if (i6 == 8) {
                    i7 = t.u;
                }
                if (i6 == 9) {
                    for (int i17 = 0; i17 < 25; i17++) {
                        if (af.b[i17]) {
                            i7 += this.O[i17];
                        }
                    }
                }
                if (i6 == 10) {
                    int i18 = i4;
                    int i19 = i4 + 1;
                    aa aaVar3 = aa.u[iArr[i18]];
                    i4 = i19 + 1;
                    int i20 = iArr[i19] + 1;
                    if (i20 >= 0 && i20 < org.necrotic.client.c.a.i.g && (!org.necrotic.client.c.a.i.a(i20).y || de)) {
                        int[] iArr2 = aaVar3.ae;
                        int length = iArr2.length;
                        int i21 = 0;
                        while (true) {
                            if (i21 < length) {
                                if (iArr2[i21] != i20) {
                                    i21++;
                                } else {
                                    i7 = 999999999;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                if (i6 == 11) {
                    i7 = this.aD;
                }
                if (i6 == 12) {
                    i7 = this.jk;
                }
                if (i6 == 13) {
                    int i22 = i4;
                    int i23 = i4 + 1;
                    i4 = i23 + 1;
                    i7 = (this.bO[iArr[i22]] & (1 << iArr[i23])) == 0 ? 0 : 1;
                }
                if (i6 == 14) {
                    int i24 = i4;
                    i4++;
                    org.necrotic.client.c.a.n nVar = org.necrotic.client.c.a.n.a[iArr[i24]];
                    int i25 = nVar.b;
                    int i26 = nVar.c;
                    i7 = (this.bO[i25] >> i26) & m[nVar.d - i26];
                }
                if (i6 == 15) {
                    z3 = true;
                }
                if (i6 == 16) {
                    z3 = true;
                }
                if (i6 == 17) {
                    z3 = true;
                }
                if (i6 == 18) {
                    i7 = (t.aJ >> 7) + this.al;
                }
                if (i6 == 19) {
                    i7 = (t.aK >> 7) + this.am;
                }
                if (i6 == 20) {
                    int i27 = i4;
                    i4++;
                    i7 = iArr[i27];
                }
                if (!z3) {
                    if (!z2) {
                        i3 += i7;
                    }
                    if (z2) {
                        i3 -= i7;
                    }
                    if (z2 && i7 != 0) {
                        i3 /= i7;
                    }
                    if (z2) {
                        i3 *= i7;
                    }
                    z2 = false;
                } else {
                    z2 = z3;
                }
            }
        } catch (Exception unused) {
            return -1;
        }
    }

    public AppletContext getAppletContext() {
        if (ae.d != null) {
            return ae.d.getAppletContext();
        }
        return super.getAppletContext();
    }

    private org.necrotic.client.c.a a(int i2, String str, int i3) {
        byte[] bArr = null;
        try {
            if (this.L[0] != null) {
                bArr = this.L[0].a(i2);
            }
        } catch (Exception unused) {
        }
        if (bArr != null) {
            return new org.necrotic.client.c.a(bArr);
        }
        while (bArr == null) {
            String str2 = "Unknown error";
            try {
                DataInputStream j2 = j(str + i3);
                byte[] bArr2 = new byte[6];
                j2.readFully(bArr2, 0, 6);
                org.necrotic.client.g.a aVar = new org.necrotic.client.g.a(bArr2);
                aVar.f = 3;
                int r2 = aVar.r() + 6;
                int i4 = 6;
                bArr = new byte[r2];
                System.arraycopy(bArr2, 0, bArr, 0, 6);
                while (i4 < r2) {
                    int i5 = r2 - i4;
                    int i6 = i5;
                    if (i5 > 1000) {
                        i6 = 1000;
                    }
                    int read = j2.read(bArr, i4, i6);
                    if (read < 0) {
                        str2 = "Length error: " + i4 + "/" + r2;
                        throw new IOException("EOF");
                        break;
                    }
                    int i7 = i4 + read;
                    i4 = i7;
                    int i8 = (i7 * 100) / r2;
                }
                j2.close();
                try {
                    if (this.L[0] != null) {
                        this.L[0].a(bArr.length, bArr, i2);
                    }
                } catch (Exception unused2) {
                    this.L[0] = null;
                }
            } catch (IOException unused3) {
                str2.equals("Unknown error");
                bArr = null;
            } catch (ArrayIndexOutOfBoundsException unused4) {
                bArr = null;
                if (!ae.e) {
                    return null;
                }
            } catch (NullPointerException unused5) {
                bArr = null;
                if (!ae.e) {
                    return null;
                }
            } catch (Exception unused6) {
                bArr = null;
                if (!ae.e) {
                    return null;
                }
            }
            if (bArr == null) {
                throw new RuntimeException("Unable to find archive: " + this.iL);
            }
        }
        return new org.necrotic.client.c.a(bArr);
    }

    public URL getCodeBase() {
        try {
            return new URL(org.necrotic.a.a() + ":80");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // org.necrotic.client.r
    public final Container j() {
        if (ae.d != null) {
            return ae.d;
        }
        return this;
    }

    public String getParameter(String str) {
        if (ae.d != null) {
            return ae.d.getParameter(str);
        }
        return super.getParameter(str);
    }

    private static String y(int i2) {
        String str = "cr";
        if (i2 > 10) {
            str = "c";
        }
        return "@" + str + i2 + "@";
    }

    public static int d(String str) {
        if (str == null) {
            return 5;
        }
        return (str.contains("cr10") || str.contains("cr11")) ? 6 : 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Exception] */
    private static byte a(String str, boolean z2) {
        byte b2 = 0;
        int i2 = 3;
        int i3 = z2 ? 5 : 4;
        boolean contains = str.contains("cr");
        ?? r0 = contains;
        if (!contains) {
            r0 = 2;
            i2 = 2;
        }
        try {
            r0 = (byte) Integer.parseInt(str.substring(i2, i3));
            b2 = r0;
        } catch (Exception unused) {
            r0.printStackTrace();
        }
        return b2;
    }

    @Override // org.necrotic.client.r
    public final void b(int i2, int i3) {
        if (!this.ci) {
            return;
        }
        this.gF += i2 * 3;
        this.gG += i3 << 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init() {
        try {
            dj = 10;
            v = 0;
            E();
            de = true;
            ae.f = 32;
            q = this;
            ae.a(InetAddress.getLocalHost());
            org.necrotic.client.f.b.a.a(a.EnumC0026a.FIXED);
            u();
        } catch (Exception unused) {
            printStackTrace();
            System.exit(1);
        }
    }

    public final boolean a(boolean z2, org.necrotic.client.f.e eVar, int i2, int i3) {
        if (z2 && this.bQ != 1) {
            return false;
        }
        if ((z2 ? this.cc : this.bY) >= i2) {
            if ((z2 ? this.cc : this.bY) <= i2 + eVar.d) {
                if ((z2 ? this.cd : this.bZ) >= i3) {
                    return (z2 ? this.cd : this.bZ) <= i3 + eVar.e;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private static String z(int i2) {
        if (i2 < 999999999) {
            return String.valueOf(i2);
        }
        return "*";
    }

    private boolean c(aa aaVar) {
        if (aaVar.aM == null) {
            return false;
        }
        for (int i2 = 0; i2 < aaVar.aM.length; i2++) {
            int a2 = a(aaVar, i2);
            int i3 = aaVar.at[i2];
            if (aaVar.aM[i2] == 2) {
                if (a2 >= i3) {
                    return false;
                }
            } else if (aaVar.aM[i2] == 3) {
                if (a2 <= i3) {
                    return false;
                }
            } else if (aaVar.aM[i2] == 4) {
                if (a2 == i3) {
                    return false;
                }
            } else if (a2 != i3) {
                return false;
            }
        }
        return true;
    }

    public final boolean e(String str) {
        if (str == null) {
            return false;
        }
        if (str.contains("@")) {
            str = cr.matcher(str).replaceAll("");
        }
        for (int i2 = 0; i2 < this.aE; i2++) {
            if (str.equalsIgnoreCase(this.hX[i2])) {
                return true;
            }
        }
        return str.equalsIgnoreCase(t.y);
    }

    private boolean ae() {
        return this.bX == null;
    }

    private void i(String str) {
        String property = System.getProperty("os.name");
        try {
            if (property.startsWith("Mac OS")) {
                Class.forName("com.apple.eio.FileManager").getDeclaredMethod("openURL", String.class).invoke(null, str);
            } else if (property.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler ".concat(String.valueOf(str)));
            } else {
                String[] strArr = {"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "safari"};
                String str2 = null;
                for (int i2 = 0; i2 < strArr.length && str2 == null; i2++) {
                    if (Runtime.getRuntime().exec(new String[]{"which", strArr[i2]}).waitFor() == 0) {
                        str2 = strArr[i2];
                    }
                }
                if (str2 == null) {
                    throw new Exception("Could not find web browser");
                }
                Runtime.getRuntime().exec(new String[]{str2, str});
            }
        } catch (Exception unused) {
            a("Failed to open URL.", 0, "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:643:0x1285  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x15a4  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x15bb  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x166f A[LOOP:20: B:691:0x1519->B:771:0x166f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:885:0x18e3  */
    /* JADX WARN: Removed duplicated region for block: B:894:0x1901 A[LOOP:22: B:892:0x18fc->B:894:0x1901, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:897:0x1929  */
    /* JADX WARN: Removed duplicated region for block: B:900:0x1945  */
    /* JADX WARN: Removed duplicated region for block: B:992:0x163a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void af() {
        /*
            Method dump skipped, instructions count: 6540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.necrotic.client.Client.af():void");
    }

    public final void b(org.necrotic.client.f.e eVar, int i2, int i3) {
        if (eVar == null) {
            return;
        }
        boolean z2 = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED;
        int i4 = (this.bC + this.bc) & 2047;
        int d2 = this.eb.d();
        int h2 = this.eb.h();
        if ((i2 * i2) + (i3 * i3) > 6400) {
            return;
        }
        int i5 = org.necrotic.client.n.l.e[i4];
        int i6 = org.necrotic.client.n.l.f[i4];
        int i7 = this.bd;
        int i8 = (i5 << 8) / 256;
        int i9 = this.bd;
        int i10 = (i6 << 8) / 256;
        try {
            eVar.e((((z2 ? 104 : 83) + (((i3 * i8) + (i2 * i10)) >> 16)) - (eVar.v / 2)) + 4 + d2, ((((z2 ? 89 : 85) - (((i3 * i10) - (i2 * i8)) >> 16)) - (eVar.w / 2)) - 4) + h2);
        } catch (Exception unused) {
        }
    }

    private boolean A(int i2) {
        if (i2 < 0) {
            return false;
        }
        int i3 = this.aV[i2];
        int i4 = i3;
        if (i3 >= 2000) {
            i4 -= 2000;
        }
        return i4 == 337;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [int] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v74, types: [org.necrotic.client.j.c] */
    private void a(org.necrotic.client.j.c cVar) {
        ?? r0;
        if (cVar.N == 0) {
            return;
        }
        if (cVar.az != -1 && (r0 = cVar.az) < 32768) {
            try {
                org.necrotic.client.j.e eVar = this.bl[cVar.az];
                if (eVar != null) {
                    int i2 = cVar.aJ - eVar.aJ;
                    int i3 = cVar.aK - eVar.aK;
                    if (i2 != 0 || i3 != 0) {
                        r0 = cVar;
                        r0.aI = ((int) (Math.atan2(i2, i3) * 325.949d)) & 2047;
                    }
                }
            } catch (Exception unused) {
                r0.printStackTrace();
            }
        }
        if (cVar.az >= 32768) {
            int i4 = cVar.az - 32768;
            int i5 = i4;
            if (i4 == this.jh) {
                i5 = this.ed;
            }
            org.necrotic.client.e.a.a aVar = this.bq[i5];
            if (aVar != null) {
                int i6 = cVar.aJ - aVar.aJ;
                int i7 = cVar.aK - aVar.aK;
                if (i6 != 0 || i7 != 0) {
                    cVar.aI = ((int) (Math.atan2(i6, i7) * 325.949d)) & 2047;
                }
            }
        }
        if ((cVar.ae != 0 || cVar.af != 0) && (cVar.aE == 0 || cVar.M > 0)) {
            int i8 = cVar.aJ - (((cVar.ae - this.al) - this.al) << 6);
            int i9 = cVar.aK - (((cVar.af - this.am) - this.am) << 6);
            if (i8 != 0 || i9 != 0) {
                cVar.aI = ((int) (Math.atan2(i8, i9) * 325.949d)) & 2047;
            }
            cVar.ae = 0;
            cVar.af = 0;
        }
        int i10 = (cVar.aI - cVar.ap) & 2047;
        if (i10 != 0) {
            if (i10 < cVar.N || i10 > 2048 - cVar.N) {
                cVar.ap = cVar.aI;
            } else if (i10 > 1024) {
                cVar.ap -= cVar.N;
            } else {
                cVar.ap += cVar.N;
            }
            cVar.ap &= 2047;
            if (cVar.R == cVar.O && cVar.ap != cVar.aI) {
                if (cVar.P != -1) {
                    cVar.R = cVar.P;
                } else {
                    cVar.R = cVar.aq;
                }
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0290: INVOKE  (r0 I:java.lang.Exception) type: VIRTUAL call: java.lang.Exception.printStackTrace():void, block:B:96:0x0290 */
    private static void b(org.necrotic.client.j.c cVar) {
        Exception printStackTrace;
        try {
            cVar.J = false;
            if (cVar.R != -1) {
                if (cVar.R > org.necrotic.client.c.a.a.a.length) {
                    cVar.R = 0;
                }
                org.necrotic.client.c.a.a aVar = org.necrotic.client.c.a.a.a[cVar.R];
                cVar.T++;
                if (cVar.S < aVar.b && cVar.T > aVar.a(cVar.S)) {
                    cVar.T = 1;
                    cVar.S++;
                    cVar.aL++;
                }
                cVar.aL = cVar.S + 1;
                if (cVar.aL >= aVar.b && cVar.aL >= aVar.b) {
                    cVar.aL = 0;
                }
                if (cVar.S >= aVar.b) {
                    cVar.T = 1;
                    cVar.S = 0;
                }
            }
            if (cVar.U != -1 && s >= cVar.W) {
                if (cVar.aM < 0) {
                    cVar.aM = 0;
                }
                org.necrotic.client.c.a.a aVar2 = org.necrotic.client.c.a.m.b[cVar.U].c;
                cVar.V++;
                while (cVar.aM < aVar2.b && cVar.V > aVar2.a(cVar.aM)) {
                    cVar.V -= aVar2.a(cVar.aM);
                    cVar.aM++;
                }
                if (cVar.aM >= aVar2.b && (cVar.aM < 0 || cVar.aM >= aVar2.b)) {
                    cVar.U = -1;
                }
                cVar.aN = cVar.aM + 1;
                if (cVar.aN >= aVar2.b && (cVar.aN < 0 || cVar.aN >= aVar2.b)) {
                    cVar.U = -1;
                }
            }
            if (cVar.L != -1 && cVar.aa <= 1 && org.necrotic.client.c.a.a.a[cVar.L].m == 1 && cVar.ah > 0 && cVar.am <= s && cVar.an < s) {
                cVar.aa = 1;
                return;
            }
            if (cVar.L != -1 && cVar.aa == 0) {
                org.necrotic.client.c.a.a aVar3 = org.necrotic.client.c.a.a.a[cVar.L];
                cVar.Z++;
                while (cVar.Y < aVar3.b && cVar.Z > aVar3.a(cVar.Y)) {
                    cVar.Z -= aVar3.a(cVar.Y);
                    cVar.Y++;
                }
                if (cVar.Y >= aVar3.b) {
                    cVar.Y -= aVar3.f;
                    cVar.ab++;
                    if (cVar.ab >= aVar3.l) {
                        cVar.L = -1;
                    }
                    if (cVar.Y < 0 || cVar.Y >= aVar3.b) {
                        cVar.L = -1;
                    }
                }
                cVar.aO = cVar.Y + 1;
                if (cVar.aO >= aVar3.b) {
                    if (cVar.ab >= aVar3.l) {
                        cVar.L = -1;
                    }
                    if (cVar.aO < 0 || cVar.aO >= aVar3.b) {
                        cVar.L = -1;
                    }
                }
                cVar.J = aVar3.h;
            }
            if (cVar.aa > 0) {
                cVar.aa--;
            }
        } catch (Exception unused) {
            printStackTrace.printStackTrace();
        }
    }

    private void ag() {
        try {
            int i2 = t.aJ + this.hG;
            int i3 = t.aK + this.hH;
            if (this.gh - i2 < -500 || this.gh - i2 > 500 || this.gi - i3 < -500 || this.gi - i3 > 500) {
                this.gh = i2;
                this.gi = i3;
            }
            if (this.gh != i2) {
                this.gh += (i2 - this.gh) / 16;
            }
            if (this.gi != i3) {
                this.gi += (i3 - this.gi) / 16;
            }
            if (this.bW[1] == 1) {
                this.gF += ((-24) - this.gF) / 2;
            } else if (this.bW[2] == 1) {
                this.gF += (24 - this.gF) / 2;
            } else {
                this.gF /= 2;
            }
            if (this.bW[3] == 1) {
                this.gG += (12 - this.gG) / 2;
            } else if (this.bW[4] == 1) {
                this.gG += ((-12) - this.gG) / 2;
            } else {
                this.gG /= 2;
            }
            this.bC = (this.bC + (this.gF / 2)) & 2047;
            this.gE += this.gG / 2;
            if (this.gE < 128) {
                this.gE = 128;
            }
            if (this.gE > 383) {
                this.gE = 383;
            }
            int i4 = this.gh >> 7;
            int i5 = this.gi >> 7;
            int b2 = b(this.bp, this.gi, this.gh);
            int i6 = 0;
            if (i4 > 3 && i5 > 3 && i4 < 100 && i5 < 100) {
                for (int i7 = i4 - 4; i7 <= i4 + 4; i7++) {
                    for (int i8 = i5 - 4; i8 <= i5 + 4; i8++) {
                        int i9 = this.bp;
                        int i10 = i9;
                        if (i9 < 3 && (this.hF[1][i7][i8] & 2) == 2) {
                            i10++;
                        }
                        int i11 = b2 - this.ij[i10][i7][i8];
                        if (i11 > i6) {
                            i6 = i11;
                        }
                    }
                }
            }
            int i12 = cI + 1;
            cI = i12;
            if (i12 > 1512) {
                cI = 0;
                dk.i(77);
                dk.l(0);
                int i13 = dk.f;
                dk.l((int) (Math.random() * 256.0d));
                dk.l(101);
                dk.l(233);
                dk.j(45092);
                if (((int) (Math.random() * 2.0d)) == 0) {
                    dk.j(35784);
                }
                dk.l((int) (Math.random() * 256.0d));
                dk.l(64);
                dk.l(38);
                dk.j((int) (Math.random() * 65536.0d));
                dk.j((int) (Math.random() * 65536.0d));
                org.necrotic.client.g.a aVar = dk;
                aVar.k(aVar.f - i13);
            }
            int i14 = i6 * 192;
            int i15 = i14;
            if (i14 > 98048) {
                i15 = 98048;
            }
            if (i15 < 32768) {
                i15 = 32768;
            }
            if (i15 > this.hf) {
                this.hf += (i15 - this.hf) / 24;
            } else if (i15 < this.hf) {
                this.hf += (i15 - this.hf) / 80;
            }
        } catch (Exception unused) {
            ae.a("glfc_ex " + t.aJ + "," + t.aK + "," + this.gh + "," + this.gi + "," + cx + "," + cy + "," + this.al + "," + this.am);
            throw new RuntimeException("eek");
        }
    }

    private void a(org.necrotic.client.g.a aVar) {
        aVar.x();
        if (aVar.a(1) == 0) {
            return;
        }
        int a2 = aVar.a(2);
        if (a2 == 0) {
            int[] iArr = this.hp;
            int i2 = this.gY;
            this.gY = i2 + 1;
            iArr[i2] = this.ed;
        } else if (a2 == 1) {
            t.a(false, aVar.a(3));
            if (aVar.a(1) == 1) {
                int[] iArr2 = this.hp;
                int i3 = this.gY;
                this.gY = i3 + 1;
                iArr2[i3] = this.ed;
            }
        } else if (a2 == 2) {
            t.a(true, aVar.a(3));
            t.a(true, aVar.a(3));
            if (aVar.a(1) == 1) {
                int[] iArr3 = this.hp;
                int i4 = this.gY;
                this.gY = i4 + 1;
                iArr3[i4] = this.ed;
            }
        } else if (a2 == 3) {
            this.bp = aVar.a(2);
            if (this.hg != this.bp) {
                this.eI = 1;
            }
            this.hg = this.bp;
            int a3 = aVar.a(1);
            if (aVar.a(1) == 1) {
                int[] iArr4 = this.hp;
                int i5 = this.gY;
                this.gY = i5 + 1;
                iArr4[i5] = this.ed;
            }
            int a4 = aVar.a(7);
            t.a(aVar.a(7), a4, a3 == 1);
        }
    }

    private boolean i(int i2, int i3) {
        aa aaVar;
        int i4;
        int i5;
        boolean z2 = false;
        if (i3 < 0 || i3 > aa.u.length || (aaVar = aa.u[i3]) == null || aaVar.U == null) {
            return false;
        }
        int[] iArr = aaVar.U;
        int length = iArr.length;
        for (int i6 = 0; i6 < length && (i4 = iArr[i6]) != -1; i6++) {
            aa aaVar2 = aa.u[i4];
            if (aaVar2.aK == 1) {
                z2 |= i(i2, aaVar2.ac);
            }
            if (aaVar2.aK == 6 && (aaVar2.P != -1 || aaVar2.Q != -1)) {
                if (c(aaVar2)) {
                    i5 = aaVar2.Q;
                } else {
                    i5 = aaVar2.P;
                }
                if (i5 != -1) {
                    org.necrotic.client.c.a.a aVar = org.necrotic.client.c.a.a.a[i5];
                    aaVar2.J += i2;
                    while (aaVar2.J > aVar.a(aaVar2.O)) {
                        aaVar2.J -= aVar.a(aaVar2.O) + 1;
                        aaVar2.O++;
                        if (aaVar2.O >= aVar.b) {
                            aaVar2.O -= aVar.f;
                            if (aaVar2.O < 0 || aaVar2.O >= aVar.b) {
                                aaVar2.O = 0;
                            }
                        }
                        z2 = true;
                    }
                }
            }
        }
        return z2;
    }

    private int ah() {
        int i2;
        int i3;
        int i4 = 3;
        if (this.eS < 310) {
            int i5 = this.bD >> 7;
            int i6 = this.bE >> 7;
            int i7 = t.aJ >> 7;
            int i8 = t.aK >> 7;
            try {
                if ((this.hF[this.bp][i5][i6] & 4) != 0) {
                    i4 = this.bp;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (i7 > i5) {
                i2 = i7 - i5;
            } else {
                i2 = i5 - i7;
            }
            if (i8 > i6) {
                i3 = i8 - i6;
            } else {
                i3 = i6 - i8;
            }
            if (i2 > i3) {
                int i9 = (i3 << 16) / i2;
                int i10 = 32768;
                while (i5 != i7) {
                    if (i5 < i7) {
                        i5++;
                    } else if (i5 > i7) {
                        i5--;
                    }
                    try {
                        if ((this.hF[this.bp][i5][i6] & 4) != 0) {
                            i4 = this.bp;
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                    }
                    int i11 = i10 + i9;
                    i10 = i11;
                    if (i11 >= 65536) {
                        i10 -= 65536;
                        if (i6 < i8) {
                            i6++;
                        } else if (i6 > i8) {
                            i6--;
                        }
                        try {
                            if ((this.hF[this.bp][i5][i6] & 4) != 0) {
                                i4 = this.bp;
                            }
                        } catch (ArrayIndexOutOfBoundsException unused3) {
                        }
                    }
                }
            } else {
                int i12 = (i2 << 16) / i3;
                int i13 = 32768;
                while (i6 != i8) {
                    if (i6 < i8) {
                        i6++;
                    } else if (i6 > i8) {
                        i6--;
                    }
                    try {
                        if ((this.hF[this.bp][i5][i6] & 4) != 0) {
                            i4 = this.bp;
                        }
                    } catch (ArrayIndexOutOfBoundsException unused4) {
                    }
                    int i14 = i13 + i12;
                    i13 = i14;
                    if (i14 >= 65536) {
                        i13 -= 65536;
                        if (i5 < i7) {
                            i5++;
                        } else if (i5 > i7) {
                            i5--;
                        }
                        try {
                            if ((this.hF[this.bp][i5][i6] & 4) != 0) {
                                i4 = this.bp;
                            }
                        } catch (ArrayIndexOutOfBoundsException unused5) {
                        }
                    }
                }
            }
        }
        try {
            if ((this.hF[this.bp][t.aJ >> 7][t.aK >> 7] & 4) != 0) {
                i4 = this.bp;
            }
        } catch (ArrayIndexOutOfBoundsException unused6) {
        }
        return i4;
    }

    private void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        h hVar = null;
        org.necrotic.client.c.b.b e2 = this.ga.e();
        while (true) {
            h hVar2 = (h) e2;
            if (hVar2 != null) {
                if (hVar2.e == i8 && hVar2.g == i9 && hVar2.h == i6 && hVar2.f == i5) {
                    hVar = hVar2;
                    break;
                }
                e2 = this.ga.f();
            } else {
                break;
            }
        }
        if (hVar == null) {
            h hVar3 = new h();
            hVar = hVar3;
            hVar3.e = i8;
            hVar.f = i5;
            hVar.g = i9;
            hVar.h = i6;
            a(hVar);
            this.ga.a(hVar);
        }
        hVar.a = i3;
        hVar.c = i7;
        hVar.b = i4;
        hVar.l = i10;
        hVar.d = i2;
    }

    private void b(org.necrotic.client.g.a aVar) {
        int a2 = aVar.a(8);
        if (a2 < this.br) {
            for (int i2 = a2; i2 < this.br; i2++) {
                int[] iArr = this.ho;
                int i3 = this.gW;
                this.gW = i3 + 1;
                iArr[i3] = this.bs[i2];
            }
        }
        if (a2 > this.br) {
            ae.a(D + " Too many players");
            throw new RuntimeException("eek");
        }
        this.br = 0;
        for (int i4 = 0; i4 < a2; i4++) {
            int i5 = this.bs[i4];
            org.necrotic.client.e.a.a aVar2 = this.bq[i5];
            if (aVar.a(1) == 0) {
                int[] iArr2 = this.bs;
                int i6 = this.br;
                this.br = i6 + 1;
                iArr2[i6] = i5;
                aVar2.ad = s;
            } else {
                int a3 = aVar.a(2);
                if (a3 == 0) {
                    int[] iArr3 = this.bs;
                    int i7 = this.br;
                    this.br = i7 + 1;
                    iArr3[i7] = i5;
                    aVar2.ad = s;
                    int[] iArr4 = this.hp;
                    int i8 = this.gY;
                    this.gY = i8 + 1;
                    iArr4[i8] = i5;
                } else if (a3 != 1) {
                    if (a3 != 2) {
                        if (a3 == 3) {
                            int[] iArr5 = this.ho;
                            int i9 = this.gW;
                            this.gW = i9 + 1;
                            iArr5[i9] = i5;
                        }
                    } else {
                        int[] iArr6 = this.bs;
                        int i10 = this.br;
                        this.br = i10 + 1;
                        iArr6[i10] = i5;
                        aVar2.ad = s;
                        aVar2.a(true, aVar.a(3));
                        aVar2.a(true, aVar.a(3));
                        if (aVar.a(1) == 1) {
                            int[] iArr7 = this.hp;
                            int i11 = this.gY;
                            this.gY = i11 + 1;
                            iArr7[i11] = i5;
                        }
                    }
                } else {
                    int[] iArr8 = this.bs;
                    int i12 = this.br;
                    this.br = i12 + 1;
                    iArr8[i12] = i5;
                    aVar2.ad = s;
                    aVar2.a(false, aVar.a(3));
                    if (aVar.a(1) == 1) {
                        int[] iArr9 = this.hp;
                        int i13 = this.gY;
                        this.gY = i13 + 1;
                        iArr9[i13] = i5;
                    }
                }
            }
        }
    }

    private void a(org.necrotic.client.g.a aVar, int i2) {
        org.necrotic.client.e.a.a aVar2;
        org.necrotic.client.c.a.k a2;
        org.necrotic.client.n.d a3;
        org.necrotic.client.n.g i3;
        org.necrotic.client.n.f g2;
        org.necrotic.client.n.e f2;
        org.necrotic.client.c.b.a aVar3;
        org.necrotic.client.c.b.a aVar4;
        if (i2 == 84) {
            int t2 = aVar.t();
            int i4 = this.gO + ((t2 >> 4) & 7);
            int i5 = this.gP + (t2 & 7);
            int u2 = aVar.u();
            int u3 = aVar.u();
            int u4 = aVar.u();
            if (i4 >= 0 && i5 >= 0 && i4 < 104 && i5 < 104 && (aVar4 = this.aI[this.bp][i4][i5]) != null) {
                org.necrotic.client.c.b.b e2 = aVar4.e();
                while (true) {
                    org.necrotic.client.j.d dVar = (org.necrotic.client.j.d) e2;
                    if (dVar != null) {
                        if (dVar.d != (u2 & 32767) || dVar.c != u3) {
                            e2 = aVar4.f();
                        } else {
                            dVar.c = u4;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                m(i4, i5);
                return;
            }
            return;
        }
        if (i2 == 105) {
            int t3 = aVar.t();
            int i6 = this.gO + ((t3 >> 4) & 7);
            int i7 = this.gP + (t3 & 7);
            int u5 = aVar.u();
            int t4 = aVar.t();
            int i8 = (t4 >> 4) & 15;
            int i9 = t4 & 7;
            if (t.aD[0] >= i6 - i8 && t.aD[0] <= i6 + i8 && t.aF[0] >= i7 - i8 && t.aF[0] <= i7 + i8 && dl != 0 && this.dC && !dg && this.eO < 50) {
                this.eg[this.eO] = u5;
                this.ei[this.eO] = i9;
                this.eh[this.eO] = org.necrotic.client.n.b.r.a[u5];
                cD[this.eO] = null;
                this.eO++;
            }
        }
        if (i2 == 215) {
            int D2 = aVar.D();
            int B2 = aVar.B();
            int i10 = this.gO + ((B2 >> 4) & 7);
            int i11 = this.gP + (B2 & 7);
            int D3 = aVar.D();
            int u6 = aVar.u();
            if (i10 >= 0 && i11 >= 0 && i10 < 104 && i11 < 104 && D3 != this.jh) {
                org.necrotic.client.j.d dVar2 = new org.necrotic.client.j.d();
                dVar2.d = D2;
                dVar2.c = u6;
                if (this.aI[this.bp][i10][i11] == null) {
                    this.aI[this.bp][i10][i11] = new org.necrotic.client.c.b.a();
                }
                this.aI[this.bp][i10][i11].a(dVar2);
                m(i10, i11);
            }
        } else if (i2 == 156) {
            int z2 = aVar.z();
            int i12 = this.gO + ((z2 >> 4) & 7);
            int i13 = this.gP + (z2 & 7);
            int u7 = aVar.u();
            int t5 = aVar.t();
            if (i12 >= 0 && i13 >= 0 && i12 < 104 && i13 < 104 && (aVar3 = this.aI[this.bp][i12][i13]) != null) {
                org.necrotic.client.c.b.b e3 = aVar3.e();
                while (true) {
                    org.necrotic.client.j.d dVar3 = (org.necrotic.client.j.d) e3;
                    if (dVar3 != null) {
                        if (dVar3.d != (u7 & 32767) || dVar3.e.ordinal() != t5) {
                            e3 = aVar3.f();
                        } else {
                            dVar3.b();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (aVar3.e() == null) {
                    this.aI[this.bp][i12][i13] = null;
                }
                m(i12, i13);
            }
        } else if (i2 == 160) {
            int B3 = aVar.B();
            int i14 = this.gO + ((B3 >> 4) & 7);
            int i15 = this.gP + (B3 & 7);
            int B4 = aVar.B();
            int i16 = B4 >> 2;
            int i17 = B4 & 3;
            int i18 = this.dK[i16];
            int D4 = aVar.D();
            if (i14 >= 0 && i15 >= 0 && i14 < 103 && i15 < 103) {
                int i19 = this.ij[this.bp][i14][i15];
                int i20 = this.ij[this.bp][i14 + 1][i15];
                int i21 = this.ij[this.bp][i14 + 1][i15 + 1];
                int i22 = this.ij[this.bp][i14][i15 + 1];
                if (i18 == 0 && (f2 = this.jm.f(this.bp, i14, i15)) != null) {
                    int i23 = (f2.h >> 14) & 32767;
                    if (i16 == 2) {
                        f2.f = new org.necrotic.client.j.g(i23, i17 + 4, 2, i20, i21, i19, i22, D4, false);
                        f2.g = new org.necrotic.client.j.g(i23, (i17 + 1) & 3, 2, i20, i21, i19, i22, D4, false);
                    } else {
                        f2.f = new org.necrotic.client.j.g(i23, i17, i16, i20, i21, i19, i22, D4, false);
                    }
                }
                if (i18 == 1 && (g2 = this.jm.g(i14, i15, this.bp)) != null) {
                    g2.f = new org.necrotic.client.j.g((g2.g >> 14) & 32767, 0, 4, i20, i21, i19, i22, D4, false);
                }
                if (i18 == 2) {
                    org.necrotic.client.n.i h2 = this.jm.h(i14, i15, this.bp);
                    if (i16 == 11) {
                        i16 = 10;
                    }
                    if (h2 != null) {
                        h2.e = new org.necrotic.client.j.g((h2.m >> 14) & 32767, i17, i16, i20, i21, i19, i22, D4, false);
                    }
                }
                if (i18 == 3 && (i3 = this.jm.i(i15, i14, this.bp)) != null) {
                    i3.d = new org.necrotic.client.j.g((i3.e >> 14) & 32767, i17, 22, i20, i21, i19, i22, D4, false);
                }
            }
        } else {
            if (i2 == 147) {
                int B5 = aVar.B();
                int i24 = this.gO + ((B5 >> 4) & 7);
                int i25 = this.gP + (B5 & 7);
                int u8 = aVar.u();
                byte[] bArr = aVar.d;
                int i26 = aVar.f;
                aVar.f = i26 + 1;
                byte b2 = (byte) (128 - bArr[i26]);
                int l2 = aVar.l();
                byte C2 = aVar.C();
                int u9 = aVar.u();
                int B6 = aVar.B();
                int i27 = B6 >> 2;
                int i28 = B6 & 3;
                int i29 = this.dK[i27];
                byte n2 = aVar.n();
                int u10 = aVar.u();
                byte C3 = aVar.C();
                if (u8 == this.jh) {
                    aVar2 = t;
                } else {
                    aVar2 = this.bq[u8];
                }
                if (aVar2 != null && (a3 = (a2 = org.necrotic.client.c.a.k.a(u10)).a(i27, i28, this.ij[this.bp][i24][i25], this.ij[this.bp][i24 + 1][i25], this.ij[this.bp][i24 + 1][i25 + 1], this.ij[this.bp][i24][i25 + 1], -1)) != null) {
                    a(u9 + 1, -1, 0, i29, i25, 0, this.bp, i24, l2 + 1);
                    aVar2.g = l2 + s;
                    aVar2.h = u9 + s;
                    aVar2.e = a3;
                    int i30 = a2.g;
                    int i31 = a2.n;
                    if (i28 == 1 || i28 == 3) {
                        i30 = a2.n;
                        i31 = a2.g;
                    }
                    aVar2.j = (i24 << 7) + (i30 << 6);
                    aVar2.l = (i25 << 7) + (i31 << 6);
                    aVar2.k = b(this.bp, aVar2.l, aVar2.j);
                    if (n2 > b2) {
                        n2 = b2;
                        b2 = n2;
                    }
                    if (C3 > C2) {
                        C3 = C2;
                        C2 = C3;
                    }
                    aVar2.p = i24 + n2;
                    aVar2.r = i24 + b2;
                    aVar2.q = i25 + C3;
                    aVar2.s = i25 + C2;
                }
            }
            if (i2 == 151) {
                int z3 = aVar.z();
                int i32 = this.gO + ((z3 >> 4) & 7);
                int i33 = this.gP + (z3 & 7);
                int l3 = aVar.l();
                int B7 = aVar.B();
                int i34 = B7 >> 2;
                int i35 = B7 & 3;
                int i36 = this.dK[i34];
                if (l3 < -1) {
                    l3 = 32767 - l3;
                }
                if (i32 >= 0 && i33 >= 0 && i32 < 104 && i33 < 104) {
                    a(-1, l3, i35, i36, i33, i34, this.bp, i32, 0);
                }
            } else if (i2 == 4) {
                int t6 = aVar.t();
                int i37 = this.gO + ((t6 >> 4) & 7);
                int i38 = this.gP + (t6 & 7);
                int u11 = aVar.u();
                int t7 = aVar.t();
                int u12 = aVar.u();
                if (i37 >= 0 && i38 >= 0 && i37 < 104 && i38 < 104) {
                    int i39 = (i37 << 7) + 64;
                    int i40 = (i38 << 7) + 64;
                    this.fZ.a(new org.necrotic.client.j.b(this.bp, s, u12, u11, b(this.bp, i40, i39) - t7, i40, i39));
                }
            } else if (i2 == 44) {
                int m2 = aVar.m();
                long i41 = aVar.i();
                int t8 = aVar.t();
                int t9 = aVar.t();
                int i42 = this.gO + ((t8 >> 4) & 7);
                int i43 = this.gP + (t8 & 7);
                if (i42 >= 0 && i43 >= 0 && i42 < 104 && i43 < 104) {
                    org.necrotic.client.j.d dVar4 = new org.necrotic.client.j.d();
                    dVar4.d = m2;
                    dVar4.c = (int) i41;
                    dVar4.e = u.values()[t9];
                    if (this.aI[this.bp][i42][i43] == null) {
                        this.aI[this.bp][i42][i43] = new org.necrotic.client.c.b.a();
                    }
                    this.aI[this.bp][i42][i43].a(dVar4);
                    m(i42, i43);
                }
            } else if (i2 == 101) {
                int A2 = aVar.A();
                int i44 = A2 >> 2;
                int i45 = A2 & 3;
                int i46 = this.dK[i44];
                int t10 = aVar.t();
                int i47 = this.gO + ((t10 >> 4) & 7);
                int i48 = this.gP + (t10 & 7);
                if (i47 >= 0 && i48 >= 0 && i47 < 104 && i48 < 104) {
                    a(-1, -1, i45, i46, i48, i44, this.bp, i47, 0);
                }
            } else if (i2 == 117) {
                int t11 = aVar.t();
                int i49 = this.gO + ((t11 >> 4) & 7);
                int i50 = this.gP + (t11 & 7);
                int n3 = i49 + aVar.n();
                int n4 = i50 + aVar.n();
                int o2 = aVar.o();
                int u13 = aVar.u();
                int t12 = aVar.t() << 2;
                int t13 = aVar.t() << 2;
                int u14 = aVar.u();
                int u15 = aVar.u();
                int t14 = aVar.t();
                int t15 = aVar.t();
                if (i49 >= 0 && i50 >= 0 && i49 < 104 && i50 < 104 && n3 >= 0 && n4 >= 0 && n3 < 104 && n4 < 104 && u13 != 65535) {
                    int i51 = (i49 << 7) + 64;
                    int i52 = (i50 << 7) + 64;
                    int i53 = (n3 << 7) + 64;
                    int i54 = (n4 << 7) + 64;
                    org.necrotic.client.j.f fVar = new org.necrotic.client.j.f(t14, t13, u14 + s, u15 + s, t15, this.bp, b(this.bp, i52, i51) - t12, i52, i51, o2, u13);
                    fVar.a(u14 + s, i54, b(this.bp, i54, i53) - t13, i53);
                    this.fY.a(fVar);
                }
            }
        }
    }

    private void c(org.necrotic.client.g.a aVar) {
        aVar.x();
        int a2 = aVar.a(8);
        if (a2 < this.bm) {
            for (int i2 = a2; i2 < this.bm; i2++) {
                int[] iArr = this.ho;
                int i3 = this.gW;
                this.gW = i3 + 1;
                iArr[i3] = this.bn[i2];
            }
        }
        if (a2 > this.bm) {
            System.out.println(D + " Too many npcs");
            throw new RuntimeException("eek");
        }
        this.bm = 0;
        this.fq = a2;
        for (int i4 = 0; i4 < a2; i4++) {
            int i5 = this.bn[i4];
            org.necrotic.client.j.e eVar = this.bl[i5];
            if (aVar.a(1) == 0) {
                int[] iArr2 = this.bn;
                int i6 = this.bm;
                this.bm = i6 + 1;
                iArr2[i6] = i5;
                eVar.ad = s;
            } else {
                int a3 = aVar.a(2);
                if (a3 == 0) {
                    int[] iArr3 = this.bn;
                    int i7 = this.bm;
                    this.bm = i7 + 1;
                    iArr3[i7] = i5;
                    eVar.ad = s;
                    int[] iArr4 = this.hp;
                    int i8 = this.gY;
                    this.gY = i8 + 1;
                    iArr4[i8] = i5;
                } else if (a3 != 1) {
                    if (a3 != 2) {
                        if (a3 == 3) {
                            int[] iArr5 = this.ho;
                            int i9 = this.gW;
                            this.gW = i9 + 1;
                            iArr5[i9] = i5;
                        }
                    } else {
                        int[] iArr6 = this.bn;
                        int i10 = this.bm;
                        this.bm = i10 + 1;
                        iArr6[i10] = i5;
                        eVar.ad = s;
                        eVar.a(true, aVar.a(3));
                        eVar.a(true, aVar.a(3));
                        if (aVar.a(1) == 1) {
                            int[] iArr7 = this.hp;
                            int i11 = this.gY;
                            this.gY = i11 + 1;
                            iArr7[i11] = i5;
                        }
                    }
                } else {
                    int[] iArr8 = this.bn;
                    int i12 = this.bm;
                    this.bm = i12 + 1;
                    iArr8[i12] = i5;
                    eVar.ad = s;
                    eVar.a(false, aVar.a(3));
                    if (aVar.a(1) == 1) {
                        int[] iArr9 = this.hp;
                        int i13 = this.gY;
                        this.gY = i13 + 1;
                        iArr9[i13] = i5;
                    }
                }
            }
        }
    }

    private void b(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i6 > 0 && i2 > 0 && i6 <= 102 && i2 <= 102) {
            if (dg && i3 != this.bp) {
                return;
            }
            int i9 = 0;
            if (i7 == 0) {
                i9 = this.jm.j(i3, i6, i2);
            }
            if (i7 == 1) {
                i9 = this.jm.l(i3, i6, i2);
            }
            if (i7 == 2) {
                i9 = this.jm.n(i3, i6, i2);
            }
            if (i7 == 3) {
                i9 = this.jm.p(i3, i6, i2);
            }
            if (i9 != 0) {
                int c2 = this.jm.c(i3, i6, i2, i9);
                int i10 = (i9 >> 14) & 32767;
                int i11 = c2 & 31;
                int i12 = c2 >> 6;
                if (i7 == 0) {
                    this.jm.a(i6, i3, i2);
                    org.necrotic.client.c.a.k a2 = org.necrotic.client.c.a.k.a(i10);
                    if (a2.q) {
                        this.fX[i3].a(i12, i11, a2.k, i6, i2);
                    }
                }
                if (i7 == 1) {
                    this.jm.b(i2, i3, i6);
                }
                if (i7 == 2) {
                    this.jm.c(i3, i6, i2);
                    org.necrotic.client.c.a.k a3 = org.necrotic.client.c.a.k.a(i10);
                    if (i6 + a3.g > 103 || i2 + a3.g > 103 || i6 + a3.n > 103 || i2 + a3.n > 103) {
                        return;
                    }
                    if (a3.q) {
                        this.fX[i3].a(i12, a3.g, i6, i2, a3.n, a3.k);
                    }
                }
                if (i7 == 3) {
                    this.jm.d(i3, i2, i6);
                    org.necrotic.client.c.a.k a4 = org.necrotic.client.c.a.k.a(i10);
                    if (a4.q && a4.v) {
                        this.fX[i3].b(i2, i6);
                    }
                }
            }
            if (i8 >= 0) {
                int i13 = i3;
                if (i3 < 3 && (this.hF[1][i6][i2] & 2) == 2) {
                    i13++;
                }
                if (i3 == 4) {
                    i3 = 0;
                }
                org.necrotic.client.n.j.a(this.jm, i4, i2, i5, i13, this.fX[i3], this.ij, i6, i8, i3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ai() {
        try {
            this.hg = -1;
            this.fZ.d();
            this.fY.d();
            org.necrotic.client.n.l.g();
            az();
            this.jm.c();
            System.gc();
            for (int i2 = 0; i2 < 4; i2++) {
                this.fX[i2].a();
            }
            for (int i3 = 0; i3 < 4; i3++) {
                for (int i4 = 0; i4 < 104; i4++) {
                    for (int i5 = 0; i5 < 104; i5++) {
                        this.hF[i3][i4][i5] = 0;
                    }
                }
            }
            org.necrotic.client.n.j jVar = new org.necrotic.client.n.j(this.hF, this.ij);
            int length = this.fV.length;
            if (aL) {
                dk.i(0);
            }
            if (!this.fO) {
                for (int i6 = 0; i6 < length; i6++) {
                    int i7 = ((this.hn[i6] >> 8) << 6) - this.al;
                    int i8 = ((this.hn[i6] & ColorUtil.MAX_RGB_VALUE) << 6) - this.am;
                    byte[] bArr = this.fV[i6];
                    if (bArr != null) {
                        jVar.a(bArr, i8, i7, (cx - 6) << 3, (cy - 6) << 3, this.fX);
                    }
                }
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = ((this.hn[i9] >> 8) * 62) - this.al;
                    int i11 = ((this.hn[i9] & ColorUtil.MAX_RGB_VALUE) * 62) - this.am;
                    if (this.fV[i9] == null && cy < 800) {
                        jVar.a(i11, 64, 64, i10);
                    }
                }
                if (aL) {
                    dk.i(0);
                }
                for (int i12 = 0; i12 < length; i12++) {
                    byte[] bArr2 = this.fW[i12];
                    if (bArr2 != null) {
                        jVar.a(((this.hn[i12] >> 8) << 6) - this.al, this.fX, ((this.hn[i12] & ColorUtil.MAX_RGB_VALUE) << 6) - this.am, this.jm, bArr2);
                    }
                }
                org.necrotic.client.n.c.a();
            } else {
                for (int i13 = 0; i13 < 4; i13++) {
                    for (int i14 = 0; i14 < 13; i14++) {
                        for (int i15 = 0; i15 < 13; i15++) {
                            int i16 = this.dW[i13][i14][i15];
                            if (i16 != -1) {
                                int i17 = (i16 >> 24) & 3;
                                int i18 = (i16 >> 1) & 3;
                                int i19 = (i16 >> 14) & 1023;
                                int i20 = (i16 >> 3) & 2047;
                                int i21 = ((i19 / 8) << 8) + (i20 / 8);
                                int i22 = 0;
                                while (true) {
                                    if (i22 >= this.hn.length) {
                                        break;
                                    } else if (this.hn[i22] != i21 || this.fV[i22] == null) {
                                        i22++;
                                    } else {
                                        jVar.a(i17, i18, this.fX, i14 << 3, (i19 & 7) << 3, this.fV[i22], (i20 & 7) << 3, i13, i15 << 3);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                for (int i23 = 0; i23 < 13; i23++) {
                    for (int i24 = 0; i24 < 13; i24++) {
                        if (this.dW[0][i23][i24] == -1) {
                            jVar.a(i24 << 3, 8, 8, i23 << 3);
                        }
                    }
                }
                if (aL) {
                    dk.i(0);
                }
                for (int i25 = 0; i25 < 4; i25++) {
                    for (int i26 = 0; i26 < 13; i26++) {
                        for (int i27 = 0; i27 < 13; i27++) {
                            int i28 = this.dW[i25][i26][i27];
                            if (i28 != -1) {
                                int i29 = (i28 >> 24) & 3;
                                int i30 = (i28 >> 1) & 3;
                                int i31 = (i28 >> 14) & 1023;
                                int i32 = (i28 >> 3) & 2047;
                                int i33 = ((i31 / 8) << 8) + (i32 / 8);
                                int i34 = 0;
                                while (true) {
                                    if (i34 >= this.hn.length) {
                                        break;
                                    } else if (this.hn[i34] != i33 || this.fW[i34] == null) {
                                        i34++;
                                    } else {
                                        jVar.a(this.fX, this.jm, i29, i26 << 3, (i32 & 7) << 3, i25, this.fW[i34], (i31 & 7) << 3, i30, i27 << 3);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                this.fO = false;
            }
            if (aL) {
                dk.i(0);
            }
            dk.i(0);
            jVar.a(this.fX, this.jm);
            if (aL) {
                this.aH.a();
            }
            if (aL) {
                dk.i(0);
            }
            int i35 = org.necrotic.client.n.j.b;
            int i36 = i35;
            if (i35 > this.bp) {
                i36 = this.bp;
            }
            if (i36 < this.bp - 1) {
                int i37 = this.bp;
            }
            if (dg) {
                this.jm.a(org.necrotic.client.n.j.b);
            } else {
                this.jm.a(0);
            }
            for (int i38 = 0; i38 < 104; i38++) {
                for (int i39 = 0; i39 < 104; i39++) {
                    m(i38, i39);
                }
            }
            ak();
        } catch (Exception unused) {
            printStackTrace();
        }
        org.necrotic.client.c.a.k.d.a();
        if (aL) {
            dk.i(210);
            dk.h(1057001181);
        }
        System.gc();
        org.necrotic.client.n.l.h();
        this.bo.e();
        int i40 = ((cx - 6) / 8) - 1;
        int i41 = ((cx + 6) / 8) + 1;
        int i42 = ((cy - 6) / 8) - 1;
        int i43 = ((cy + 6) / 8) + 1;
        for (int i44 = i40; i44 <= i41; i44++) {
            for (int i45 = i42; i45 <= i43; i45++) {
                if (i44 == i40 || i44 == i41 || i45 == i42 || i45 == i43) {
                    int a2 = this.bo.a(0, i45, i44);
                    if (a2 != -1) {
                        this.bo.a(a2, 3);
                    }
                    int a3 = this.bo.a(1, i45, i44);
                    if (a3 != -1) {
                        this.bo.a(a3, 3);
                    }
                }
            }
        }
    }

    private void b(boolean z2) {
        for (int i2 = 0; i2 < this.bm; i2++) {
            org.necrotic.client.j.e eVar = this.bl[this.bn[i2]];
            int i3 = 536870912 + (this.bn[i2] << 14);
            if (eVar != null && eVar.d() && eVar.c.x == z2) {
                int i4 = eVar.aJ >> 7;
                int i5 = eVar.aK >> 7;
                if (i4 >= 0 && i4 < 104 && i5 >= 0 && i5 < 104) {
                    if (eVar.ag == 1 && (eVar.aJ & 127) == 64 && (eVar.aK & 127) == 64) {
                        if (this.hs[i4][i5] != this.gN) {
                            this.hs[i4][i5] = this.gN;
                        }
                    }
                    if (!eVar.c.o) {
                        i3 -= Integer.MIN_VALUE;
                    }
                    this.jm.a(this.bp, eVar.ap, b(this.bp, eVar.aK, eVar.aJ), i3, eVar.aK, ((eVar.ag - 1) << 6) + 60, eVar.aJ, eVar, eVar.J);
                }
            }
        }
    }

    private int b(int i2, int i3, int i4) {
        int i5 = i4 >> 7;
        int i6 = i3 >> 7;
        if (i5 < 0 || i6 < 0 || i5 > 103 || i6 > 103) {
            return 0;
        }
        if (i2 < 3 && (this.hF[1][i5][i6] & 2) == 2) {
            i2++;
        }
        int i7 = i4 & 127;
        int i8 = i3 & 127;
        return (((((this.ij[i2][i5][i6] * (128 - i7)) + (this.ij[i2][i5 + 1][i6] * i7)) >> 7) * (128 - i8)) + ((((this.ij[i2][i5][i6 + 1] * (128 - i7)) + (this.ij[i2][i5 + 1][i6 + 1] * i7)) >> 7) * i8)) >> 7;
    }

    private void aj() {
        this.fL = true;
        for (int i2 = 0; i2 < 7; i2++) {
            this.dJ[i2] = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= org.necrotic.client.c.a.e.f()) {
                    break;
                }
                if (!org.necrotic.client.c.a.e.a[i3].e()) {
                    if (org.necrotic.client.c.a.e.a[i3].g() == i2 + (this.eu ? 0 : 7)) {
                        this.dJ[i2] = i3;
                        break;
                    }
                }
                i3++;
            }
        }
    }

    private void a(int i2, org.necrotic.client.g.a aVar) {
        int a2;
        while (aVar.c + 21 < (i2 << 3) && (a2 = aVar.a(14)) != 16383) {
            if (this.bl[a2] == null) {
                this.bl[a2] = new org.necrotic.client.j.e();
            }
            org.necrotic.client.j.e eVar = this.bl[a2];
            int[] iArr = this.bn;
            int i3 = this.bm;
            this.bm = i3 + 1;
            iArr[i3] = a2;
            eVar.ad = s;
            int a3 = aVar.a(5);
            int i4 = a3;
            if (a3 > 15) {
                i4 -= 32;
            }
            int a4 = aVar.a(5);
            int i5 = a4;
            if (a4 > 15) {
                i5 -= 32;
            }
            int a5 = aVar.a(1);
            eVar.c = org.necrotic.client.c.a.j.a(aVar.a(18));
            if (aVar.a(1) == 1) {
                int[] iArr2 = this.hp;
                int i6 = this.gY;
                this.gY = i6 + 1;
                iArr2[i6] = a2;
            }
            eVar.ag = eVar.c.t;
            eVar.N = eVar.c.m;
            eVar.aq = eVar.c.y;
            eVar.ar = eVar.c.z;
            eVar.as = eVar.c.A;
            eVar.at = eVar.c.B;
            eVar.O = eVar.c.v;
            eVar.a(t.aD[0] + i5, t.aF[0] + i4, a5 == 1);
        }
        aVar.d();
    }

    private void c(boolean z2) {
        org.necrotic.client.e.a.a aVar;
        int i2;
        if ((t.aJ >> 7) == this.aA && (t.aK >> 7) == this.aB) {
            this.aA = 0;
        }
        int i3 = this.br;
        if (z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (z2) {
                aVar = t;
                i2 = this.ed << 14;
            } else {
                aVar = this.bq[this.bs[i4]];
                i2 = this.bs[i4] << 14;
            }
            if (aVar != null && aVar.A) {
                aVar.d = this.br > 200 && !z2 && aVar.R == aVar.O;
                int i5 = aVar.aJ >> 7;
                int i6 = aVar.aK >> 7;
                if (i5 >= 0 && i5 < 104 && i6 >= 0 && i6 < 104) {
                    if (aVar.e != null && s >= aVar.g && s < aVar.h) {
                        aVar.d = false;
                        aVar.i = b(this.bp, aVar.aK, aVar.aJ);
                        org.necrotic.client.e.a.a aVar2 = aVar;
                        this.jm.a(this.bp, aVar.aK, aVar2, aVar2.ap, aVar.s, aVar.aJ, aVar.i, aVar.p, aVar.r, i2, aVar.q);
                    } else {
                        if ((aVar.aJ & 127) == 64 && (aVar.aK & 127) == 64) {
                            if (this.hs[i5][i6] != this.gN) {
                                this.hs[i5][i6] = this.gN;
                            }
                        }
                        aVar.i = b(this.bp, aVar.aK, aVar.aJ);
                        org.necrotic.client.e.a.a aVar3 = aVar;
                        this.jm.a(this.bp, aVar.ap, aVar.i, i2, aVar.aK, 60, aVar.aJ, aVar3, aVar3.J);
                    }
                }
            }
        }
    }

    private void d(org.necrotic.client.g.a aVar) {
        for (int i2 = 0; i2 < this.gY; i2++) {
            int i3 = this.hp[i2];
            org.necrotic.client.e.a.a aVar2 = this.bq[i3];
            int t2 = aVar.t();
            int i4 = t2;
            if ((t2 & 64) != 0) {
                i4 += aVar.t() << 8;
            }
            int i5 = i4;
            if ((i5 & 1024) != 0) {
                aVar2.ai = aVar.B();
                aVar2.ak = aVar.B();
                aVar2.aj = aVar.B();
                aVar2.al = aVar.B();
                aVar2.am = aVar.m() + s;
                aVar2.an = aVar.D() + s;
                aVar2.ao = aVar.B();
                aVar2.g();
            }
            if ((i5 & 256) != 0) {
                aVar2.U = aVar.l();
                int h2 = aVar.h();
                aVar2.X = h2 >> 16;
                aVar2.W = s + (h2 & 65535);
                aVar2.aM = 0;
                aVar2.V = 0;
                if (aVar2.W > s) {
                    aVar2.aM = -1;
                }
                if (aVar2.U == 65535) {
                    aVar2.U = -1;
                }
            }
            if ((i5 & 8) != 0) {
                int l2 = aVar.l();
                int i6 = l2;
                if (l2 == 65535) {
                    i6 = -1;
                }
                int A2 = aVar.A();
                if (i6 == aVar2.L && i6 != -1) {
                    int i7 = org.necrotic.client.c.a.a.a[i6].o;
                    if (i7 == 1) {
                        aVar2.Y = 0;
                        aVar2.Z = 0;
                        aVar2.aa = A2;
                        aVar2.ab = 0;
                    }
                    if (i7 == 2) {
                        aVar2.ab = 0;
                    }
                } else if (i6 == -1 || aVar2.L == -1 || org.necrotic.client.c.a.a.a[i6].i >= org.necrotic.client.c.a.a.a[aVar2.L].i) {
                    aVar2.L = i6;
                    aVar2.Y = 0;
                    aVar2.Z = 0;
                    aVar2.aa = A2;
                    aVar2.ab = 0;
                    aVar2.ah = aVar2.aE;
                }
            }
            if ((i5 & 4) != 0) {
                aVar2.aH = aVar.q();
                if (aVar2.aH.charAt(0) == '~') {
                    aVar2.aH = aVar2.aH.substring(1);
                    a(aVar2.aH, 2, aVar2.y);
                } else if (aVar2 == t) {
                    a(aVar2.aH, 2, aVar2.y);
                }
                aVar2.Q = 0;
                aVar2.ac = 0;
                aVar2.aG = 150;
            }
            if ((i5 & 128) != 0) {
                int l3 = aVar.l();
                int t3 = aVar.t();
                int t4 = aVar.t();
                int A3 = aVar.A();
                int i8 = aVar.f;
                if (aVar2.y != null && aVar2.A) {
                    long b2 = org.necrotic.client.f.a.b.b(aVar2.y);
                    boolean z2 = false;
                    if (t3 <= 1) {
                        int i9 = 0;
                        while (true) {
                            if (i9 < this.ig) {
                                if (this.ea[i9] != b2) {
                                    i9++;
                                } else {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (!z2) {
                        int i10 = this.gK;
                        try {
                            this.hx.f = 0;
                            byte[] bArr = this.hx.d;
                            for (int i11 = A3 - 1; i11 >= 0; i11--) {
                                byte[] bArr2 = aVar.d;
                                int i12 = aVar.f;
                                aVar.f = i12 + 1;
                                bArr[i11] = bArr2[i12];
                            }
                            this.hx.f = 0;
                            String a2 = org.necrotic.client.f.a.d.a(A3, this.hx);
                            aVar2.aH = a2;
                            aVar2.Q = l3 >> 8;
                            aVar2.ac = l3 & ColorUtil.MAX_RGB_VALUE;
                            aVar2.aG = 150;
                            int i13 = -1;
                            if (t4 > 0) {
                                i13 = t4 + 11;
                            }
                            String str = y(t3) + (i13 >= 0 ? y(i13) : "");
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Integer.valueOf(t3));
                            arrayList.add(Integer.valueOf(i13));
                            if (org.necrotic.a.m) {
                                a(a2.replace(t.y.toLowerCase(), "<col=ff0000>" + t.y.toLowerCase() + ColorUtil.CLOSING_COLOR_TAG).replace(t.y, "<col=ff0000>" + t.y + ColorUtil.CLOSING_COLOR_TAG), str + aVar2.y, aVar2.E, aVar2.F, aVar2.G, arrayList);
                            } else {
                                a(a2, str + aVar2.y, aVar2.E, aVar2.F, aVar2.G, arrayList);
                            }
                        } catch (Exception unused) {
                            ae.a("cde2");
                        }
                    }
                }
                aVar.f = i8 + A3;
            }
            if ((i5 & 1) != 0) {
                aVar2.az = aVar.l();
                if (aVar2.az == 65535) {
                    aVar2.az = -1;
                }
            }
            if ((i5 & 16) != 0) {
                int A4 = aVar.A();
                byte[] bArr3 = new byte[A4];
                org.necrotic.client.g.a aVar3 = new org.necrotic.client.g.a(bArr3);
                aVar.a(A4, bArr3);
                byte[] bArr4 = new byte[aVar.d.length + 1];
                for (int i14 = 0; i14 < aVar.d.length; i14++) {
                    bArr4[i14] = aVar.d[i14];
                }
                aVar.d = bArr4;
                this.hy[i3] = aVar3;
                aVar2.a(aVar3);
            }
            if ((i5 & 2) != 0) {
                aVar2.ae = aVar.m();
                aVar2.af = aVar.l();
            }
            if ((i5 & 32) != 0) {
                aVar2.a(aVar.t(), this.ih.i(), s, aVar.t(), this.ih.i());
                aVar2.aA = s + 300;
                aVar2.au = this.ih.i();
                aVar2.aB = this.ih.i();
            }
            if ((i5 & 512) != 0) {
                aVar2.a(aVar.t(), aVar.i(), s, aVar.t(), aVar.i());
                aVar2.aA = s + 300;
                aVar2.au = aVar.i();
                aVar2.aB = aVar.i();
            }
        }
    }

    private void c(int i2, int i3, int i4, int i5, int i6) {
        org.necrotic.client.f.a aVar;
        int j2 = this.jm.j(i6, i4, i2);
        if ((j2 ^ (-1)) != -1) {
            int c2 = this.jm.c(i6, i4, i2, j2);
            int i7 = (c2 >> 6) & 3;
            int i8 = c2 & 31;
            if (j2 > 0) {
                i3 = i5;
            }
            int[] iArr = this.bb.c;
            int i9 = 24624 + (i4 << 2) + (((103 - i2) << 9) << 2);
            if ((org.necrotic.client.c.a.k.a(this.jm.m(i6, i4, i2)).l ^ (-1)) == 0) {
                if (i8 == 0 || i8 == 2) {
                    if (i7 == 0) {
                        iArr[i9] = i3;
                        iArr[i9 + 512] = i3;
                        iArr[i9 + 1024] = i3;
                        iArr[i9 + 1536] = i3;
                    } else if ((i7 ^ (-1)) == -2) {
                        iArr[i9] = i3;
                        iArr[i9 + 1] = i3;
                        iArr[i9 + 2] = i3;
                        iArr[i9 + 3] = i3;
                    } else if (i7 == 2) {
                        iArr[i9 - (-3)] = i3;
                        iArr[i9 + 3 + 512] = i3;
                        iArr[i9 + 3 + 1024] = i3;
                        iArr[(i9 + 1536) - (-3)] = i3;
                    } else if (i7 == 3) {
                        iArr[i9 + 1536] = i3;
                        iArr[i9 + 1536 + 1] = i3;
                        iArr[i9 + 2 + 1536] = i3;
                        iArr[i9 + 1539] = i3;
                    }
                }
                if (i8 == 3) {
                    if (i7 == 0) {
                        iArr[i9] = i3;
                    } else if (i7 == 1) {
                        iArr[i9 + 3] = i3;
                    } else if (i7 == 2) {
                        iArr[i9 + 3 + 1536] = i3;
                    } else if (i7 == 3) {
                        iArr[i9 + 1536] = i3;
                    }
                }
                if (i8 == 2) {
                    if (i7 == 3) {
                        iArr[i9] = i3;
                        iArr[i9 + 512] = i3;
                        iArr[i9 + 1024] = i3;
                        iArr[i9 + 1536] = i3;
                    } else if (i7 == 0) {
                        iArr[i9] = i3;
                        iArr[i9 + 1] = i3;
                        iArr[i9 + 2] = i3;
                        iArr[i9 + 3] = i3;
                    } else if (i7 == 1) {
                        iArr[i9 + 3] = i3;
                        iArr[i9 + 3 + 512] = i3;
                        iArr[i9 + 3 + 1024] = i3;
                        iArr[i9 + 3 + 1536] = i3;
                    } else if (i7 == 2) {
                        iArr[i9 + 1536] = i3;
                        iArr[i9 + 1536 + 1] = i3;
                        iArr[i9 + 1536 + 2] = i3;
                        iArr[i9 + 1536 + 3] = i3;
                    }
                }
            }
        }
        int n2 = this.jm.n(i6, i4, i2);
        if (n2 != 0) {
            int c3 = this.jm.c(i6, i4, i2, n2);
            int i10 = (c3 >> 6) & 3;
            int i11 = c3 & 31;
            org.necrotic.client.c.a.k a2 = org.necrotic.client.c.a.k.a(this.jm.o(i6, i4, i2));
            if (a2.l != -1) {
                org.necrotic.client.f.a aVar2 = this.ix[a2.l];
                if (aVar2 != null) {
                    aVar2.a(48 + (i4 << 2) + (((a2.g << 2) - aVar2.e) / 2), 48 + (((104 - i2) - a2.n) << 2) + (((a2.n << 2) - aVar2.f) / 2));
                }
            } else if (i11 == 9) {
                int i12 = 15658734;
                if (n2 > 0) {
                    i12 = 15597568;
                }
                int[] iArr2 = this.bb.c;
                int i13 = 24624 + (i4 << 2) + (((103 - i2) << 9) << 2);
                if (i10 == 0 || i10 == 2) {
                    iArr2[i13 + 1536] = i12;
                    iArr2[i13 + 1024 + 1] = i12;
                    iArr2[i13 + 512 + 2] = i12;
                    iArr2[i13 + 3] = i12;
                } else {
                    iArr2[i13] = i12;
                    iArr2[i13 + 512 + 1] = i12;
                    iArr2[i13 + 1024 + 2] = i12;
                    iArr2[i13 + 1536 + 3] = i12;
                }
            }
        }
        int q2 = this.jm.q(i6, i4, i2);
        if (q2 > 0) {
            org.necrotic.client.c.a.k a3 = org.necrotic.client.c.a.k.a(q2);
            if (a3.l != -1 && (aVar = this.ix[a3.l]) != null) {
                aVar.a(48 + (i4 << 2) + (((a3.g << 2) - aVar.e) / 2), 48 + (((104 - i2) - a3.n) << 2) + (((a3.n << 2) - aVar.f) / 2));
            }
        }
    }

    private final synchronized void j(int i2, int i3) {
        if (C()) {
            this.iM = i3;
            this.bo.b(2, this.iM);
            di = i2;
            cS = -1;
            cz = true;
            cN = -1;
        }
    }

    private final synchronized void k(int i2, int i3) {
        if (C()) {
            this.iM = i3;
            this.bo.b(2, this.iM);
            di = i2;
            cS = -1;
            cz = true;
            cN = 10;
        }
    }

    private void B(int i2) {
        int i3;
        aa aaVar = aa.u[i2];
        if (aaVar == null || aaVar.U == null) {
            return;
        }
        int[] iArr = aaVar.U;
        int length = iArr.length;
        for (int i4 = 0; i4 < length && (i3 = iArr[i4]) != -1; i4++) {
            aa aaVar2 = aa.u[i3];
            if (aaVar2.aK == 1) {
                B(aaVar2.ac);
            }
            aaVar2.O = 0;
            aaVar2.J = 0;
        }
    }

    private void ak() {
        org.necrotic.client.c.b.b e2 = this.ga.e();
        while (true) {
            h hVar = (h) e2;
            if (hVar != null) {
                if (hVar.d == -1) {
                    hVar.l = 0;
                    a(hVar);
                } else {
                    hVar.b();
                }
                e2 = this.ga.f();
            } else {
                return;
            }
        }
    }

    private void a(int i2, int i3, int i4, int i5, aa aaVar, int i6, int i7) {
        int i8;
        if (this.fT) {
            i8 = 32;
        } else {
            i8 = 0;
        }
        this.fT = false;
        if (i4 >= i2 && i4 < i2 + 16 && i5 >= i6 && i5 < i6 + 16) {
            aaVar.aw -= this.gI << 2;
        } else if (i5 >= i6 && i5 < i6 + 16 && i4 >= (i2 + i3) - 16 && i4 < i2 + i3) {
            aaVar.aw += this.gI << 2;
        } else if (i5 >= i6 - i8 && i5 < i6 + 16 + i8 && i4 >= i2 + 16 && i4 < (i2 + i3) - 16 && this.gI > 0) {
            int i9 = ((i3 - 32) * i3) / i7;
            int i10 = i9;
            if (i9 < 8) {
                i10 = 8;
            }
            aaVar.aw = ((i7 - i3) * (((i4 - i2) - 16) - (i10 / 2))) / ((i3 - 32) - i10);
            this.fT = true;
        }
    }

    private void a(int i2, int i3, int i4, int i5, aa aaVar, int i6, boolean z2, int i7) {
        int i8;
        if (this.fT) {
            i8 = 32;
        } else {
            i8 = 0;
        }
        this.fT = false;
        if (i4 >= i2 && i4 < i2 + 16 && i5 >= i6 && i5 < i6 + 16) {
            aaVar.aw -= this.gI << 2;
            if (z2) {
            }
        } else if (i4 >= i2 && i4 < i2 + 16 && i5 >= (i6 + i3) - 16 && i5 < i6 + i3) {
            aaVar.aw += this.gI << 2;
            if (z2) {
            }
        } else if (i4 >= i2 - i8 && i4 < i2 + 16 + i8 && i5 >= i6 + 16 && i5 < (i6 + i3) - 16 && this.gI > 0) {
            int i9 = ((i3 - 32) * i3) / i7;
            int i10 = i9;
            if (i9 < 8) {
                i10 = 8;
            }
            aaVar.aw = ((i7 - i3) * (((i5 - i6) - 16) - (i10 / 2))) / ((i3 - 32) - i10);
            this.fT = true;
        }
    }

    private boolean b(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int c2 = this.jm.c(this.bp, i4, i3, i2);
        if (i2 == -1) {
            return false;
        }
        int i8 = c2 & 31;
        int i9 = (c2 >> 6) & 3;
        if (i8 == 10 || i8 == 11 || i8 == 22) {
            org.necrotic.client.c.a.k a2 = org.necrotic.client.c.a.k.a(i5);
            if (i9 == 0 || i9 == 2) {
                i6 = a2.g;
                i7 = a2.n;
            } else {
                i6 = a2.g;
                i7 = a2.n;
            }
            int i10 = a2.r;
            if (i9 != 0) {
                i10 = ((i10 << i9) & 15) + (i10 >> (4 - i9));
            }
            a(2, 0, i7, 0, t.aF[0], i6, i10, i3, t.aD[0], false, i4);
        } else {
            a(2, i9, 0, i8 + 1, t.aF[0], 0, 0, i3, t.aD[0], false, i4);
        }
        this.hN = this.cc;
        this.hO = this.cd;
        this.hM = 2;
        this.hL = 0;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r8.be <= 0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0521, code lost:
        org.necrotic.client.af.e = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0525, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r8.be > 4) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x05e9, code lost:
        org.necrotic.client.af.e = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x05ed, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (org.necrotic.client.Client.A != false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        org.necrotic.client.Client.A = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:?, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [int] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.necrotic.client.Client] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void al() {
        /*
            Method dump skipped, instructions count: 3987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.necrotic.client.Client.al():void");
    }

    private void am() {
        org.necrotic.client.c.a a2 = a(3, "interface", this.dZ[3]);
        org.necrotic.client.c.a a3 = a(4, "media", this.dZ[4]);
        org.necrotic.client.f.a.c[] cVarArr = {this.bx, this.bk, this.au, this.av};
        org.necrotic.client.f.a.a[] aVarArr = {this.bg, this.bh, this.bi};
        aa.a(a2, cVarArr, a3);
    }

    private void e(org.necrotic.client.g.a aVar) {
        for (int i2 = 0; i2 < this.gY; i2++) {
            org.necrotic.client.j.e eVar = this.bl[this.hp[i2]];
            int t2 = aVar.t();
            if ((t2 & 16) != 0) {
                int l2 = aVar.l();
                int i3 = l2;
                if (l2 == 65535) {
                    i3 = -1;
                }
                int t3 = aVar.t();
                if (i3 == eVar.L && i3 != -1) {
                    int i4 = org.necrotic.client.c.a.a.a[i3].o;
                    if (i4 == 1) {
                        eVar.Y = 0;
                        eVar.Z = 0;
                        eVar.aa = t3;
                        eVar.ab = 0;
                    }
                    if (i4 == 2) {
                        eVar.ab = 0;
                    }
                } else if (i3 == -1 || eVar.L == -1 || org.necrotic.client.c.a.a.a[i3].i >= org.necrotic.client.c.a.a.a[eVar.L].i) {
                    eVar.L = i3;
                    eVar.Y = 0;
                    eVar.Z = 0;
                    eVar.aa = t3;
                    eVar.ab = 0;
                    eVar.ah = eVar.aE;
                }
            }
            if ((t2 & 8) != 0) {
                eVar.a(aVar.A(), this.ih.i(), s, aVar.t(), 0L);
                eVar.aA = s + 300;
                eVar.au = this.ih.i();
                eVar.aB = this.ih.i();
            }
            if ((t2 & 128) != 0) {
                eVar.U = aVar.u();
                int h2 = aVar.h();
                eVar.X = h2 >> 16;
                eVar.W = s + (h2 & 65535);
                eVar.aM = 0;
                eVar.V = 0;
                if (eVar.W > s) {
                    eVar.aM = -1;
                }
                if (eVar.U == 65535) {
                    eVar.U = -1;
                }
            }
            if ((t2 & 32) != 0) {
                eVar.az = aVar.u();
                if (eVar.az == 65535) {
                    eVar.az = -1;
                }
            }
            if ((t2 & 1) != 0) {
                eVar.aH = aVar.q();
                eVar.aG = 100;
            }
            if ((t2 & 64) != 0) {
                eVar.a(aVar.B(), this.ih.i(), s, aVar.t(), 0L);
                eVar.aA = s + 300;
                eVar.au = this.ih.i();
                eVar.aB = this.ih.i();
            }
            if ((t2 & 2) != 0) {
                eVar.c = org.necrotic.client.c.a.j.a(aVar.m());
                eVar.ag = eVar.c.t;
                eVar.N = eVar.c.m;
                eVar.aq = eVar.c.y;
                eVar.ar = eVar.c.z;
                eVar.as = eVar.c.A;
                eVar.at = eVar.c.B;
                eVar.O = eVar.c.v;
            }
            if ((t2 & 4) != 0) {
                eVar.ae = aVar.l();
                eVar.af = aVar.l();
            }
        }
    }

    private void a(h hVar) {
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        if (hVar.f == 0) {
            i2 = this.jm.j(hVar.e, hVar.g, hVar.h);
        }
        if (hVar.f == 1) {
            i2 = this.jm.l(hVar.e, hVar.g, hVar.h);
        }
        if (hVar.f == 2) {
            i2 = this.jm.n(hVar.e, hVar.g, hVar.h);
        }
        if (hVar.f == 3) {
            i2 = this.jm.p(hVar.e, hVar.g, hVar.h);
        }
        if (i2 != 0) {
            int c2 = this.jm.c(hVar.e, hVar.g, hVar.h, i2);
            i3 = (i2 >> 14) & 32767;
            i4 = c2 & 31;
            i5 = c2 >> 6;
        }
        hVar.i = i3;
        hVar.k = i4;
        hVar.j = i5;
    }

    private void b(org.necrotic.client.g.a aVar, int i2) {
        int a2;
        while (aVar.c + 10 < (i2 << 3) && (a2 = aVar.a(11)) != 2047) {
            if (this.bq[a2] == null) {
                this.bq[a2] = new org.necrotic.client.e.a.a();
                if (this.hy[a2] != null) {
                    this.bq[a2].a(this.hy[a2]);
                }
            }
            int[] iArr = this.bs;
            int i3 = this.br;
            this.br = i3 + 1;
            iArr[i3] = a2;
            org.necrotic.client.e.a.a aVar2 = this.bq[a2];
            aVar2.ad = s;
            if (aVar.a(1) == 1) {
                int[] iArr2 = this.hp;
                int i4 = this.gY;
                this.gY = i4 + 1;
                iArr2[i4] = a2;
            }
            int a3 = aVar.a(1);
            int a4 = aVar.a(5);
            int i5 = a4;
            if (a4 > 15) {
                i5 -= 32;
            }
            int a5 = aVar.a(5);
            int i6 = a5;
            if (a5 > 15) {
                i6 -= 32;
            }
            aVar2.a(t.aD[0] + i6, t.aF[0] + i5, a3 == 1);
        }
        aVar.d();
    }

    private void c(org.necrotic.client.j.c cVar) {
        if (cVar.aJ < 128 || cVar.aK < 128 || cVar.aJ >= 13184 || cVar.aK >= 13184) {
            cVar.L = -1;
            cVar.U = -1;
            cVar.am = 0;
            cVar.an = 0;
            cVar.aJ = (cVar.aD[0] << 7) + (cVar.ag << 6);
            cVar.aK = (cVar.aF[0] << 7) + (cVar.ag << 6);
            cVar.g();
        }
        if (cVar == t && (cVar.aJ < 1536 || cVar.aK < 1536 || cVar.aJ >= 11776 || cVar.aK >= 11776)) {
            cVar.L = -1;
            cVar.U = -1;
            cVar.am = 0;
            cVar.an = 0;
            cVar.aJ = (cVar.aD[0] << 7) + (cVar.ag << 6);
            cVar.aK = (cVar.aF[0] << 7) + (cVar.ag << 6);
            cVar.g();
        }
        if (cVar.am > s) {
            d(cVar);
        } else if (cVar.an >= s) {
            e(cVar);
        } else {
            f(cVar);
        }
        a(cVar);
        b(cVar);
    }

    private static void d(org.necrotic.client.j.c cVar) {
        int i2 = cVar.am - s;
        int i3 = (cVar.ai << 7) + (cVar.ag << 6);
        int i4 = (cVar.ak << 7) + (cVar.ag << 6);
        cVar.aJ += (i3 - cVar.aJ) / i2;
        cVar.aK += (i4 - cVar.aK) / i2;
        cVar.M = 0;
        if (cVar.ao == 0) {
            cVar.aI = 1024;
        }
        if (cVar.ao == 1) {
            cVar.aI = 1536;
        }
        if (cVar.ao == 2) {
            cVar.aI = 0;
        }
        if (cVar.ao == 3) {
            cVar.aI = 512;
        }
    }

    private static void e(org.necrotic.client.j.c cVar) {
        if (cVar.an == s || cVar.L == -1 || cVar.aa != 0 || cVar.Z + 1 > org.necrotic.client.c.a.a.a[cVar.L].a(cVar.Y)) {
            int i2 = cVar.an - cVar.am;
            int i3 = s - cVar.am;
            int i4 = (cVar.ai << 7) + (cVar.ag << 6);
            int i5 = (cVar.ak << 7) + (cVar.ag << 6);
            int i6 = (cVar.aj << 7) + (cVar.ag << 6);
            int i7 = (cVar.al << 7) + (cVar.ag << 6);
            cVar.aJ = ((i4 * (i2 - i3)) + (i6 * i3)) / i2;
            cVar.aK = ((i5 * (i2 - i3)) + (i7 * i3)) / i2;
        }
        cVar.M = 0;
        if (cVar.ao == 0) {
            cVar.aI = 1024;
        }
        if (cVar.ao == 1) {
            cVar.aI = 1536;
        }
        if (cVar.ao == 2) {
            cVar.aI = 0;
        }
        if (cVar.ao == 3) {
            cVar.aI = 512;
        }
        cVar.ap = cVar.aI;
    }

    private static void f(org.necrotic.client.j.c cVar) {
        cVar.R = cVar.O;
        if (cVar.aE == 0) {
            cVar.M = 0;
            return;
        }
        if (cVar.L != -1 && cVar.aa == 0) {
            org.necrotic.client.c.a.a aVar = org.necrotic.client.c.a.a.a[cVar.L];
            if (cVar.ah > 0 && aVar.m == 0) {
                cVar.M++;
                return;
            } else if (cVar.ah <= 0 && aVar.n == 0) {
                cVar.M++;
                return;
            }
        }
        int i2 = cVar.aJ;
        int i3 = cVar.aK;
        int i4 = (cVar.aD[cVar.aE - 1] << 7) + (cVar.ag << 6);
        int i5 = (cVar.aF[cVar.aE - 1] << 7) + (cVar.ag << 6);
        if (i4 - i2 > 256 || i4 - i2 < -256 || i5 - i3 > 256 || i5 - i3 < -256) {
            cVar.aJ = i4;
            cVar.aK = i5;
            return;
        }
        if (i2 < i4) {
            if (i3 < i5) {
                cVar.aI = 1280;
            } else if (i3 > i5) {
                cVar.aI = 1792;
            } else {
                cVar.aI = 1536;
            }
        } else if (i2 > i4) {
            if (i3 < i5) {
                cVar.aI = 768;
            } else if (i3 > i5) {
                cVar.aI = 256;
            } else {
                cVar.aI = 512;
            }
        } else if (i3 < i5) {
            cVar.aI = 1024;
        } else {
            cVar.aI = 0;
        }
        int i6 = (cVar.aI - cVar.ap) & 2047;
        int i7 = i6;
        if (i6 > 1024) {
            i7 -= 2048;
        }
        int i8 = cVar.ar;
        if (i7 >= -256 && i7 <= 256) {
            i8 = cVar.aq;
        } else if (i7 >= 256 && i7 < 768) {
            i8 = cVar.at;
        } else if (i7 >= -768 && i7 <= -256) {
            i8 = cVar.as;
        }
        if (i8 == -1) {
            i8 = cVar.aq;
        }
        cVar.R = i8;
        int i9 = 4;
        if (cVar.ap != cVar.aI && cVar.az == -1 && cVar.N != 0) {
            i9 = 2;
        }
        if (cVar.aE > 2) {
            i9 = 6;
        }
        if (cVar.aE > 3) {
            i9 = 8;
        }
        if (cVar.M > 0 && cVar.aE > 1) {
            i9 = 8;
            cVar.M--;
        }
        if (cVar.K[cVar.aE - 1]) {
            i9 <<= 1;
        }
        if (i9 >= 8 && cVar.R == cVar.aq && cVar.aC != -1) {
            cVar.R = cVar.aC;
        }
        if (i2 < i4) {
            cVar.aJ += i9;
            if (cVar.aJ > i4) {
                cVar.aJ = i4;
            }
        } else if (i2 > i4) {
            cVar.aJ -= i9;
            if (cVar.aJ < i4) {
                cVar.aJ = i4;
            }
        }
        if (i3 < i5) {
            cVar.aK += i9;
            if (cVar.aK > i5) {
                cVar.aK = i5;
            }
        } else if (i3 > i5) {
            cVar.aK -= i9;
            if (cVar.aK < i5) {
                cVar.aK = i5;
            }
        }
        if (cVar.aJ == i4 && cVar.aK == i5) {
            cVar.aE--;
            if (cVar.ah > 0) {
                cVar.ah--;
            }
        }
    }

    private static String C(int i2) {
        if (i2 >= 0 && i2 < 10000) {
            return String.valueOf(i2);
        }
        if (i2 >= 10000 && i2 < 10000000) {
            return (i2 / 1000) + "K";
        }
        if (i2 >= 10000000 && i2 <= Integer.MAX_VALUE) {
            return (i2 / 1000000) + "M";
        }
        if (i2 > Integer.MAX_VALUE) {
            return "*";
        }
        return "?";
    }

    private void a(org.necrotic.client.j.c cVar, int i2) {
        a(cVar.aJ, i2, cVar.aK);
    }

    private void an() {
        this.fR = false;
        boolean z2 = this.hU;
    }

    private DataInputStream j(String str) {
        if (this.hw != null) {
            try {
                this.hw.close();
            } catch (Exception unused) {
            }
            this.hw = null;
        }
        this.hw = f(9420);
        this.hw.setSoTimeout(10000);
        InputStream inputStream = this.hw.getInputStream();
        this.hw.getOutputStream().write(("JAGGRAB /" + str + "\n\n").getBytes());
        return new DataInputStream(inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1988 */
    /* JADX WARN: Type inference failed for: r0v1989 */
    /* JADX WARN: Type inference failed for: r0v47, types: [int, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v59, types: [org.necrotic.client.Client] */
    /* JADX WARN: Type inference failed for: r0v798, types: [int] */
    /* JADX WARN: Type inference failed for: r0v799, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v810 */
    /* JADX WARN: Type inference failed for: r18v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1018, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r1v1020, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r1v1070, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r1v1072, types: [byte[], byte[][]] */
    private boolean ao() {
        int a2;
        int i2;
        int I;
        aa aaVar;
        int u2;
        String substring;
        org.necrotic.client.j.e eVar;
        if (aJ() == null) {
            return false;
        }
        try {
            a2 = aJ().a();
            i2 = a2;
        } catch (IOException unused) {
            ad();
        } catch (Exception unused2) {
            String str = "Packet received but exception occurred: type " + this.eM + ", currentPacket " + this.eE + ", lastPacket " + this.eF + ", size " + this.eL + ", pos " + (this.al + t.aD[0]) + "," + (this.am + t.aF[0]) + ", buffer - ";
            for (int i3 = 0; i3 < this.eL && i3 < 50; i3++) {
                str = str + ((int) aK().d[i3]) + ",";
            }
            ae.a(str);
        }
        if (a2 == 0) {
            return false;
        }
        if (this.eM == -1) {
            aJ().a(aK().d, 1);
            this.eM = aK().d[0] & 255;
            if (aL() != null) {
                this.eM = (this.eM - aL().a()) & ColorUtil.MAX_RGB_VALUE;
            }
            this.eL = org.necrotic.client.d.b.a[this.eM];
            i2--;
        }
        if (this.eL == -1) {
            if (i2 > 0) {
                aJ().a(aK().d, 1);
                this.eL = aK().d[0] & 255;
                i2--;
            } else {
                return false;
            }
        }
        if (this.eL == -2) {
            if (i2 > 1) {
                aJ().a(aK().d, 2);
                aK().f = 0;
                this.eL = aK().u();
                i2 -= 2;
            } else {
                return false;
            }
        }
        if (i2 < this.eL) {
            return false;
        }
        aK().f = 0;
        aJ().a(aK().d, this.eL);
        this.ex = 0;
        this.eF = this.eE;
        this.eE = this.eD;
        this.eD = this.eM;
        ?? r0 = this.eM;
        switch (r0) {
            case 1:
                for (int i4 = 0; i4 < this.bq.length; i4++) {
                    if (this.bq[i4] != null) {
                        this.bq[i4].L = -1;
                    }
                }
                for (int i5 = 0; i5 < this.bl.length; i5++) {
                    if (this.bl[i5] != null) {
                        this.bl[i5].L = -1;
                    }
                }
                this.eM = -1;
                return true;
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case Ascii.SUB /* 26 */:
            case Ascii.FS /* 28 */:
            case Ascii.GS /* 29 */:
            case Ascii.RS /* 30 */:
            case Ascii.US /* 31 */:
            case 33:
            case 37:
            case 39:
            case 40:
            case 41:
            case 42:
            case 46:
            case 47:
            case 48:
            case 49:
            case 51:
            case 52:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 63:
            case 66:
            case 67:
            case 69:
            case 76:
            case 77:
            case 82:
            case 83:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 111:
            case 116:
            case 118:
            case 119:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 141:
            case 143:
            case 144:
            case 145:
            case 146:
            case 148:
            case 149:
            case 150:
            case 152:
            case 153:
            case 154:
            case 155:
            case 157:
            case 158:
            case 159:
            case 161:
            case 162:
            case 163:
            case 165:
            case 167:
            case 168:
            case 169:
            case 170:
            case 172:
            case 173:
            case 175:
            case 178:
            case 179:
            case 183:
            case 184:
            case 186:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 201:
            case 202:
            case 205:
            case 207:
            case 211:
            case 212:
            case 213:
            case 216:
            case 220:
            case 222:
            case 223:
            case 226:
            case 227:
            case 228:
            case 229:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
            case 239:
            case 242:
            case 243:
            case 245:
            case 247:
            case 250:
            case 251:
            case 252:
            default:
                ae.a("Packet not handled: type " + this.eM + ", size " + this.eL + " - currentPacket " + this.eE + ", lastPacket " + this.eF);
                this.eM = -1;
                return true;
            case 4:
            case 44:
            case 84:
            case 101:
            case 105:
            case 117:
            case 147:
            case 151:
            case 156:
            case 160:
            case 215:
                a(aK(), this.eM);
                this.eM = -1;
                return true;
            case 8:
                int m2 = aK().m();
                int u3 = aK().u();
                aa.u[m2].M = 1;
                aa.u[m2].am = u3;
                this.eM = -1;
                return true;
            case 24:
                this.ez = aK().B();
                if (this.ez == w) {
                    if (this.ez == 3) {
                        w = 1;
                    } else {
                        w = 3;
                    }
                }
                this.eM = -1;
                return true;
            case Ascii.ESC /* 27 */:
                this.bG = aK().q();
                this.ba = false;
                this.aJ = 1;
                this.W = "";
                G = true;
                this.eM = -1;
                return true;
            case 32:
                aa.u[aK().I()].bb = aK().t() == 1;
                this.eM = -1;
                return true;
            case 34:
                aa aaVar2 = aa.u[aK().u()];
                while (aK().f < this.eL) {
                    int p2 = aK().p();
                    int u4 = aK().u();
                    int I2 = aK().I();
                    int t2 = aK().t();
                    byte e2 = aK().e();
                    if (p2 >= 0 && p2 < aaVar2.ae.length) {
                        aaVar2.ae[p2] = u4;
                        aaVar2.ah[p2] = I2;
                        aaVar2.ai[p2] = t2;
                        aaVar2.aj[p2] = e2;
                    }
                }
                this.eM = -1;
                return true;
            case 35:
                int t3 = aK().t();
                int t4 = aK().t();
                int t5 = aK().t();
                int t6 = aK().t();
                this.dE[t3] = true;
                this.dM[t3] = t4;
                this.dL[t3] = t5;
                this.dN[t3] = t6;
                this.dH[t3] = 0;
                this.eM = -1;
                return true;
            case Constants.ITEM_SPRITE_WIDTH /* 36 */:
                int l2 = aK().l();
                byte e3 = aK().e();
                if (l2 == -55) {
                    for (int i6 : aa.u[3213].U) {
                        aa.u[i6].ag = e3 > 0 ? 0 : 6;
                    }
                    if (e3 > 0) {
                        aa.u[16546].an = e3 == 1 ? "Add to bag" : "View bag contents";
                        this.er = true;
                    } else {
                        this.er = false;
                    }
                    this.eM = -1;
                    return true;
                }
                this.dI[l2] = e3;
                switch (l2) {
                    case 19:
                        z = e3 == 1;
                        break;
                    case 293:
                        aa.u[12348].aA = F.a(e3 == 0 ? 607 : e3 == 1 ? 606 : e3 == 2 ? 608 : e3 == 3 ? 609 : 610);
                        break;
                    case 2000:
                        aa();
                        break;
                }
                if (l2 < this.bO.length && this.bO[l2] != e3) {
                    this.bO[l2] = e3;
                    E(l2);
                    if (this.aC != -1) {
                        G = true;
                    }
                }
                this.eM = -1;
                return true;
            case 38:
                int u5 = aK().u();
                if (u5 == -1) {
                    this.eT = false;
                    this.eU = 0;
                } else {
                    this.eT = true;
                    this.eU = u5;
                }
                this.eM = -1;
                return true;
            case SignatureVisitor.EXTENDS /* 43 */:
                for (int i7 = 0; i7 < 31; i7++) {
                    aa aaVar3 = aa.u[aK().I()];
                    aaVar3.ae[0] = aK().I();
                    aaVar3.ah[0] = aK().I();
                    aa.u[aK().I()].bb = aK().t() == 0;
                    aa aaVar4 = aa.u[aK().I()];
                    int j2 = aK().j();
                    if (j2 == 0) {
                        aaVar4.bb = true;
                    } else {
                        aaVar4.bb = false;
                        aaVar4.aA = F.a(j2);
                        aaVar4.aB = F.a(j2);
                    }
                    a(aK().q(), aK().I());
                }
                a(aK().q(), aK().I());
                a(aK().q(), aK().I());
                this.eM = -1;
                return true;
            case SignatureVisitor.SUPER /* 45 */:
                org.necrotic.client.e.a.b.g = aK().i();
                this.eM = -1;
                return true;
            case 50:
                long i8 = aK().i();
                int t7 = aK().t();
                String a3 = org.necrotic.client.f.a.b.a(org.necrotic.client.f.a.b.a(i8));
                for (int i9 = 0; i9 < this.aE; i9++) {
                    if (i8 == this.aF[i9]) {
                        if (this.aG[i9] != t7) {
                            this.aG[i9] = t7;
                        }
                        a3 = null;
                    }
                }
                if (a3 != null && this.aE < 200) {
                    this.aF[this.aE] = i8;
                    this.hX[this.aE] = a3;
                    this.aG[this.aE] = t7;
                    this.aE++;
                }
                boolean z2 = false;
                while (!z2) {
                    z2 = true;
                    for (int i10 = 0; i10 < this.aE - 1; i10++) {
                        if ((this.aG[i10] != dj && this.aG[i10 + 1] == dj) || (this.aG[i10] == 0 && this.aG[i10 + 1] != 0)) {
                            int i11 = this.aG[i10];
                            int[] iArr = this.aG;
                            iArr[i10] = iArr[i10 + 1];
                            this.aG[i10 + 1] = i11;
                            String str2 = this.hX[i10];
                            String[] strArr = this.hX;
                            strArr[i10] = strArr[i10 + 1];
                            this.hX[i10 + 1] = str2;
                            long j3 = this.aF[i10];
                            long[] jArr = this.aF;
                            jArr[i10] = jArr[i10 + 1];
                            this.aF[i10 + 1] = j3;
                            z2 = false;
                        }
                    }
                }
                this.eM = -1;
                return true;
            case 53:
                try {
                    I = aK().I();
                    aaVar = aa.u[I];
                    u2 = aK().u();
                } catch (Exception unused3) {
                    r0.printStackTrace();
                }
                if (aaVar == null || aaVar.ae == null || aaVar.ah == null) {
                    this.eM = -1;
                    return true;
                }
                int i12 = -1;
                for (int i13 = 0; i13 < u2; i13++) {
                    int t8 = aK().t();
                    int i14 = t8;
                    if (t8 == 255) {
                        i14 = aK().H();
                    }
                    i12 = aK().m();
                    aaVar.ae[i13] = i12;
                    aaVar.ah[i13] = i14;
                    aaVar.ai[i13] = aK().t();
                    aaVar.aj[i13] = aK().t();
                }
                for (int i15 = u2; i15 < aaVar.ae.length && i15 < aaVar.ah.length; i15++) {
                    aaVar.ae[i15] = 0;
                    aaVar.ah[i15] = 0;
                    aaVar.ai[i15] = 0;
                    aaVar.aj[i15] = 0;
                }
                if (I == 24680) {
                    p().a = i12;
                }
                this.eM = -1;
                return true;
            case 54:
                o.a(new n(aK().j(), aK().g()));
                this.eM = -1;
                return true;
            case 60:
                this.gP = aK().t();
                this.gO = aK().A();
                while (aK().f < this.eL) {
                    a(aK(), aK().t());
                }
                this.eM = -1;
                return true;
            case 61:
                this.eA = aK().t();
                this.eM = -1;
                return true;
            case 62:
                this.eB = aK().t();
                this.eM = -1;
                return true;
            case 64:
                this.gO = aK().A();
                this.gP = aK().B();
                for (int i16 = this.gO; i16 < this.gO + 8; i16++) {
                    for (int i17 = this.gP; i17 < this.gP + 8; i17++) {
                        if (this.aI[this.bp][i16][i17] != null) {
                            this.aI[this.bp][i16][i17] = null;
                            m(i16, i17);
                        }
                    }
                }
                h hVar = (h) aM().e();
                while (hVar != null) {
                    if (hVar.g >= this.gO && hVar.g < this.gO + 8 && hVar.h >= this.gP && hVar.h < this.gP + 8 && hVar.e == this.bp) {
                        hVar.d = 0;
                    }
                    hVar = (h) aM().f();
                }
                this.eM = -1;
                return true;
            case 65:
                c(aK(), this.eL);
                this.eM = -1;
                return true;
            case 68:
                for (int i18 = 0; i18 < this.bO.length; i18++) {
                    if (this.bO[i18] != this.dI[i18]) {
                        this.bO[i18] = this.dI[i18];
                        E(i18);
                    }
                }
                this.eM = -1;
                return true;
            case 70:
                int o2 = aK().o();
                int E2 = aK().E();
                aa aaVar5 = aa.u[aK().l()];
                aaVar5.aP = o2;
                aaVar5.aQ = E2;
                this.eM = -1;
                return true;
            case 71:
                int I3 = aK().I();
                int z3 = aK().z();
                if (I3 == 65535) {
                    I3 = -1;
                }
                c[z3] = I3;
                this.bL = c[5];
                cv = true;
                this.eM = -1;
                return true;
            case 72:
                aa aaVar6 = aa.u[aK().l()];
                for (int i19 = 0; i19 < aaVar6.ae.length; i19++) {
                    aaVar6.ae[i19] = -1;
                    aaVar6.ae[i19] = 0;
                }
                this.eM = -1;
                return true;
            case 73:
            case 241:
                int i20 = cx;
                int i21 = cy;
                if (this.eM == 73) {
                    int D2 = aK().D();
                    this.fD = D2;
                    i20 = D2;
                    int u6 = aK().u();
                    this.fE = u6;
                    i21 = u6;
                    this.fO = false;
                }
                if (this.eM == 241) {
                    i20 = aK().u();
                    i21 = aK().D();
                    for (int i22 = 0; i22 < 4; i22++) {
                        for (int i23 = 0; i23 < 13; i23++) {
                            for (int i24 = 0; i24 < 13; i24++) {
                                if (aK().t() == 1) {
                                    this.dW[i22][i23][i24] = aK().g();
                                } else {
                                    this.dW[i22][i23][i24] = -1;
                                }
                            }
                        }
                    }
                    this.fO = true;
                }
                if (cx == i20 && cy == i21 && this.eI == 2) {
                    this.eM = -1;
                    return true;
                }
                cx = i20;
                cy = i21;
                this.al = (cx - 6) << 3;
                this.am = (cy - 6) << 3;
                this.fN = (cx / 8 == 48 || cx / 8 == 49) && cy / 8 == 48;
                if (cx / 8 == 48 && cy / 8 == 148) {
                    this.fN = true;
                }
                this.eI = 1;
                this.ge = System.currentTimeMillis();
                this.aH.a();
                F.a(1105).e(8, 9);
                if (!this.jA) {
                    this.aH.a(cn.getGraphics(), this.eY, this.eZ);
                }
                if (this.eM == 73) {
                    int i25 = 0;
                    for (int i26 = (cx - 6) / 8; i26 <= (cx + 6) / 8; i26++) {
                        for (int i27 = (cy - 6) / 8; i27 <= (cy + 6) / 8; i27++) {
                            i25++;
                        }
                    }
                    this.fV = new byte[i25];
                    this.fW = new byte[i25];
                    this.hn = new int[i25];
                    this.hV = new int[i25];
                    this.iN = new int[i25];
                    int i28 = 0;
                    for (int i29 = (cx - 6) / 8; i29 <= (cx + 6) / 8; i29++) {
                        for (int i30 = (cy - 6) / 8; i30 <= (cy + 6) / 8; i30++) {
                            this.hn[i28] = (i29 << 8) + i30;
                            if (this.fN && (i30 == 49 || i30 == 149 || i30 == 147 || i29 == 50 || (i29 == 49 && i30 == 47))) {
                                this.hV[i28] = -1;
                                this.iN[i28] = -1;
                            } else {
                                int a4 = this.bo.a(0, i30, i29);
                                this.hV[i28] = a4;
                                if (a4 != -1) {
                                    this.bo.b(3, a4);
                                }
                                int a5 = this.bo.a(1, i30, i29);
                                this.iN[i28] = a5;
                                if (a5 != -1) {
                                    this.bo.b(3, a5);
                                }
                            }
                            i28++;
                        }
                    }
                }
                if (this.eM == 241) {
                    int i31 = 0;
                    int[] iArr2 = new int[676];
                    for (int i32 = 0; i32 < 4; i32++) {
                        for (int i33 = 0; i33 < 13; i33++) {
                            for (int i34 = 0; i34 < 13; i34++) {
                                int i35 = this.dW[i32][i33][i34];
                                if (i35 != -1) {
                                    int i36 = ((((i35 >> 14) & 1023) / 8) << 8) + (((i35 >> 3) & 2047) / 8);
                                    for (int i37 = 0; i37 < i31; i37++) {
                                        if (iArr2[i37] == i36) {
                                            i36 = -1;
                                        }
                                    }
                                    if (i36 != -1) {
                                        int i38 = i31;
                                        i31++;
                                        iArr2[i38] = i36;
                                    }
                                }
                            }
                        }
                    }
                    this.fV = new byte[i31];
                    this.fW = new byte[i31];
                    this.hn = new int[i31];
                    this.hV = new int[i31];
                    this.iN = new int[i31];
                    for (int i39 = 0; i39 < i31; i39++) {
                        int i40 = iArr2[i39];
                        this.hn[i39] = i40;
                        int i41 = (i40 >> 8) & ColorUtil.MAX_RGB_VALUE;
                        int i42 = i40 & ColorUtil.MAX_RGB_VALUE;
                        int a6 = this.bo.a(0, i42, i41);
                        this.hV[i39] = a6;
                        if (a6 != -1) {
                            this.bo.b(3, a6);
                        }
                        int a7 = this.bo.a(1, i42, i41);
                        this.iN[i39] = a7;
                        if (a7 != -1) {
                            this.bo.b(3, a7);
                        }
                    }
                }
                int i43 = this.al - this.gm;
                int i44 = this.am - this.gn;
                this.gm = this.al;
                this.gn = this.am;
                for (int i45 = 0; i45 < 16384; i45++) {
                    org.necrotic.client.j.e eVar2 = this.bl[i45];
                    if (eVar2 != null) {
                        for (int i46 = 0; i46 < 10; i46++) {
                            int[] iArr3 = eVar2.aD;
                            int i47 = i46;
                            iArr3[i47] = iArr3[i47] - i43;
                            int[] iArr4 = eVar2.aF;
                            int i48 = i46;
                            iArr4[i48] = iArr4[i48] - i44;
                        }
                        eVar2.aJ -= i43 << 7;
                        eVar2.aK -= i44 << 7;
                    }
                }
                for (int i49 = 0; i49 < aN(); i49++) {
                    org.necrotic.client.e.a.a aVar = this.bq[i49];
                    if (aVar != null) {
                        for (int i50 = 0; i50 < 10; i50++) {
                            int[] iArr5 = aVar.aD;
                            int i51 = i50;
                            iArr5[i51] = iArr5[i51] - i43;
                            int[] iArr6 = aVar.aF;
                            int i52 = i50;
                            iArr6[i52] = iArr6[i52] - i44;
                        }
                        aVar.aJ -= i43 << 7;
                        aVar.aK -= i44 << 7;
                    }
                }
                this.fM = true;
                int i53 = 0;
                int i54 = 104;
                int i55 = 1;
                if (i43 < 0) {
                    i53 = 103;
                    i54 = -1;
                    i55 = -1;
                }
                int i56 = 0;
                int i57 = 104;
                int i58 = 1;
                if (i44 < 0) {
                    i56 = 103;
                    i57 = -1;
                    i58 = -1;
                }
                for (int i59 = i53; i59 != i54; i59 += i55) {
                    for (int i60 = i56; i60 != i57; i60 += i58) {
                        int i61 = i59 + i43;
                        int i62 = i60 + i44;
                        for (int i63 = 0; i63 < 4; i63++) {
                            if (i61 >= 0 && i62 >= 0 && i61 < 104 && i62 < 104) {
                                this.aI[i63][i59][i60] = this.aI[i63][i61][i62];
                            } else {
                                this.aI[i63][i59][i60] = null;
                            }
                        }
                    }
                }
                h hVar2 = (h) aM().e();
                while (hVar2 != null) {
                    hVar2.g -= i43;
                    hVar2.h -= i44;
                    if (hVar2.g < 0 || hVar2.h < 0 || hVar2.g >= 104 || hVar2.h >= 104) {
                        hVar2.b();
                    }
                    hVar2 = (h) aM().f();
                }
                if (this.aA != 0) {
                    this.aA -= i43;
                    this.aB -= i44;
                }
                this.fP = false;
                this.eM = -1;
                return true;
            case 74:
                int l3 = aK().l();
                int i64 = l3;
                if (l3 == 65535) {
                    i64 = -1;
                }
                if (i64 != -1 || this.iP != 0) {
                    if (i64 != -1 && this.hP != i64 && this.iK != 0 && this.iP == 0) {
                        k(this.iK, i64);
                    }
                } else {
                    B();
                }
                this.hP = i64;
                this.eM = -1;
                return true;
            case 75:
                int m3 = aK().m();
                int m4 = aK().m();
                aa.u[m4].M = 2;
                aa.u[m4].am = m3;
                this.eM = -1;
                return true;
            case 78:
                this.aA = 0;
                this.eM = -1;
                return true;
            case 79:
                int I4 = aK().I();
                int D3 = aK().D();
                aa aaVar7 = aa.u[I4];
                if (aaVar7 != null && aaVar7.aK == 0) {
                    if (D3 < 0) {
                        D3 = 0;
                    }
                    aaVar7.au = D3;
                }
                this.eM = -1;
                return true;
            case 80:
                int u7 = aK().u();
                int u8 = aK().u();
                int[][] iArr7 = new int[u8][2];
                for (int i65 = 0; i65 < u8; i65++) {
                    int u9 = aK().u();
                    int u10 = aK().u();
                    iArr7[i65][0] = u9;
                    iArr7[i65][1] = u10;
                }
                aa.a(aa.u[u7], iArr7);
                this.eM = -1;
                return true;
            case 81:
                b(this.eL, aK());
                l(175, u == 26000 ? 1 : 0);
                this.fM = false;
                this.eM = -1;
                return true;
            case 85:
                this.gP = aK().A();
                this.gO = aK().A();
                this.eM = -1;
                return true;
            case 86:
                int t9 = aK().t();
                if (this.bp != t9 && t9 >= 0 && t9 < 4) {
                    this.bp = t9;
                }
                this.eM = -1;
                return true;
            case 87:
                int l4 = aK().l();
                int G2 = aK().G();
                this.dI[l4] = G2;
                switch (l4) {
                    case 2000:
                        aa();
                        break;
                }
                if (l4 < 2000 && this.bO[l4] != G2) {
                    this.bO[l4] = G2;
                    E(l4);
                    if (this.aC != -1) {
                        G = true;
                    }
                }
                this.eM = -1;
                return true;
            case 88:
                int o3 = aK().o();
                int o4 = aK().o();
                int l5 = aK().l();
                if (l5 < this.bl.length && (eVar = this.bl[l5]) != null) {
                    eVar.ae = o3;
                    eVar.af = o4;
                }
                this.eM = -1;
                return true;
            case 89:
                ai();
                this.eM = -1;
                return true;
            case 97:
                int I5 = aK().I();
                B(I5);
                if (this.aK != -1) {
                    this.aK = -1;
                    cv = true;
                }
                if (this.ak != -1) {
                    this.ak = -1;
                    G = true;
                }
                if (this.aJ != 0) {
                    this.aJ = 0;
                    G = true;
                }
                u = I5;
                this.ev = false;
                this.eM = -1;
                return true;
            case 99:
                this.X = aK().t();
                this.eM = -1;
                return true;
            case 102:
                int l6 = aK().l();
                int D4 = aK().D();
                aa aaVar8 = aa.u[l6];
                if (D4 <= aaVar8.aa) {
                    D4 = aaVar8.aa + 1;
                }
                aaVar8.au = D4;
                this.eM = -1;
                return true;
            case 103:
                this.U = aK().t() == 1;
                this.eM = -1;
                return true;
            case 104:
                int A2 = aK().A();
                int z4 = aK().z();
                String q2 = aK().q();
                if (A2 > 0 && A2 <= 7) {
                    if (q2.equalsIgnoreCase("null")) {
                        q2 = null;
                    }
                    this.dq[A2 - 1] = q2;
                    this.dr[A2 - 1] = z4 == 0;
                }
                this.eM = -1;
                return true;
            case 106:
                w = aK().A();
                cv = true;
                this.eM = -1;
                return true;
            case 107:
                this.fP = false;
                for (int i66 = 0; i66 < 5; i66++) {
                    this.dE[i66] = false;
                }
                this.eM = -1;
                return true;
            case 108:
                int l7 = aK().l();
                for (int i67 = l7 * 3; i67 < 90; i67 += 3) {
                    aa.u[i67 + 33008].bb = true;
                    aa.u[i67 + 33009].bb = true;
                }
                for (int i68 = 0; i68 < l7 * 3; i68 += 3) {
                    aa.u[i68 + 33008].bb = false;
                    aa.u[i68 + 33009].bb = false;
                }
                this.eM = -1;
                return true;
            case 109:
                at();
                this.eM = -1;
                return false;
            case 110:
                this.aD = aK().t();
                this.eM = -1;
                return true;
            case 112:
                this.bf = aK().t();
                this.eM = -1;
                return true;
            case 113:
                this.iS = aK().t() > 0;
                this.bO[173] = this.iS ? 1 : 0;
                this.eb.b.a(this.iS);
                this.eM = -1;
                return true;
            case 114:
                this.eC = aK().l() * 30;
                this.eM = -1;
                return true;
            case 115:
                this.jG = aK().t();
                ap();
                this.eM = -1;
                return true;
            case 120:
                String q3 = aK().q();
                this.fu = aK().g() * 30;
                this.fv = q3;
                this.eM = -1;
                return true;
            case 121:
                int m5 = aK().m();
                int D5 = aK().D();
                if (m5 == 65535) {
                    m5 = -1;
                }
                if (this.iK != 0 && D5 != -1) {
                    j(this.iK, m5);
                    this.iP = D5 * 20;
                }
                this.eM = -1;
                return true;
            case 122:
                int m6 = aK().m();
                int m7 = aK().m();
                aa.u[m6].aF = (((m7 >> 10) & 31) << 19) + (((m7 >> 5) & 31) << 11) + ((m7 & 31) << 3);
                this.eM = -1;
                return true;
            case 123:
                b(aK().q(), 1);
                this.eM = -1;
                return true;
            case 124:
                int t10 = aK().t();
                int h2 = aK().h();
                int h3 = aK().h();
                org.necrotic.client.e.a.b.a(t10, h2);
                org.necrotic.client.e.a.b.g = h3;
                this.eM = -1;
                return true;
            case 125:
                int j4 = aK().j();
                if (aK().e() == 0) {
                    this.jT = j4 < this.bq.length ? this.bq[j4] : null;
                    this.eM = -1;
                    return true;
                }
                this.jT = j4 < this.bl.length ? this.bl[j4] : null;
                if (this.jT == null) {
                    this.eM = -1;
                    return true;
                }
                org.necrotic.client.j.e eVar3 = (org.necrotic.client.j.e) this.jT;
                eVar3.d.clear();
                if (aK().e() == 1) {
                    byte e4 = aK().e();
                    for (byte b2 = 0; b2 < e4; b2++) {
                        eVar3.d.add(new org.necrotic.client.f.c.d(aK().q(), aK().i()));
                    }
                }
                this.eM = -1;
                return true;
            case 126:
                String q4 = aK().q();
                int I6 = aK().I();
                if (q4.startsWith("http://") || q4.startsWith("www.") || q4.startsWith("https://")) {
                    i(q4);
                    this.eM = -1;
                    return true;
                } else if (q4.equals("[CLOSEMENU]") && I6 == 0) {
                    this.aY = false;
                    this.eM = -1;
                    return true;
                } else if (q4.startsWith("vngt:")) {
                    this.fF = (int) (Integer.parseInt(q4.substring("vngt:".length())) * 0.65d);
                    this.eM = -1;
                    return true;
                } else {
                    if ((I6 >= 1675 && I6 <= 1687) || (I6 >= 15115 && I6 <= 15120)) {
                        c(q4, I6);
                    }
                    a(q4, I6);
                    this.eM = -1;
                    return true;
                }
            case 127:
                this.be = aK().t();
                this.eM = -1;
                return true;
            case 128:
                this.jT = null;
                this.eM = -1;
                return true;
            case 134:
                int t11 = aK().t();
                int G3 = aK().G();
                int u11 = aK().u();
                int u12 = aK().u();
                int i69 = G3 - this.ds[t11];
                this.ds[t11] = G3;
                this.K[t11] = u11;
                this.O[t11] = u12;
                if (i69 > 0) {
                    org.necrotic.client.e.a.b.a(t11, i69);
                }
                if (t11 == 23) {
                    a(String.valueOf(u12), 28171);
                }
                this.eM = -1;
                return true;
            case 140:
                c(aK().I(), aK().u(), aK().t());
                this.eM = -1;
                return true;
            case 142:
                int l8 = aK().l();
                B(l8);
                if (this.ak != -1) {
                    this.ak = -1;
                    G = true;
                }
                if (this.aJ != 0) {
                    this.aJ = 0;
                    G = true;
                }
                this.aK = l8;
                cv = true;
                u = -1;
                this.ev = false;
                this.eM = -1;
                return true;
            case 164:
                int l9 = aK().l();
                if (this.bN.b()) {
                    this.bN.a(false);
                }
                B(l9);
                if (this.aK != -1) {
                    this.aK = -1;
                    cv = true;
                }
                this.ak = l9;
                G = true;
                u = -1;
                this.ev = false;
                this.eM = -1;
                return true;
            case 166:
                this.fP = true;
                this.gx = aK().t();
                this.gy = aK().t();
                this.gz = aK().u();
                this.gA = aK().t();
                this.gB = aK().t();
                if (this.gB >= 100) {
                    this.bD = (this.gx << 7) + 64;
                    this.bE = (this.gy << 7) + 64;
                    this.bF = b(this.bp, this.bE, this.bD) - this.gz;
                }
                this.eM = -1;
                return true;
            case 171:
                aa.u[aK().u()].ad = aK().t() == 1;
                this.eM = -1;
                return true;
            case 174:
                int u13 = aK().u();
                int t12 = aK().t();
                int u14 = aK().u();
                if (dl != 0 && t12 != 0 && this.eO < 50) {
                    this.eg[this.eO] = u13;
                    this.ei[this.eO] = t12;
                    this.eh[this.eO] = u14;
                    cD[this.eO] = null;
                    this.eO++;
                }
                this.eM = -1;
                return true;
            case 176:
                this.hR = aK().A();
                this.ji = aK().D();
                this.iy = aK().t();
                this.gH = aK().H();
                this.hQ = aK().u();
                this.eM = -1;
                return true;
            case 177:
                this.fP = true;
                this.hi = aK().t();
                this.hj = aK().t();
                this.hk = aK().u();
                this.hl = aK().t();
                this.hm = aK().t();
                if (this.hm >= 100) {
                    int i70 = (this.hi << 7) + 64;
                    int i71 = (this.hj << 7) + 64;
                    int b3 = b(this.bp, i71, i70) - this.hk;
                    int i72 = i70 - this.bD;
                    int i73 = b3 - this.bF;
                    int i74 = i71 - this.bE;
                    this.eS = ((int) (Math.atan2(i73, (int) Math.sqrt((i72 * i72) + (i74 * i74))) * 325.949d)) & 2047;
                    this.eR = ((int) (Math.atan2(i72, i74) * (-325.949d))) & 2047;
                    if (this.eS < 128) {
                        this.eS = 128;
                    }
                    if (this.eS > 383) {
                        this.eS = 383;
                    }
                }
                this.eM = -1;
                return true;
            case 180:
                int u15 = aK().u();
                int[] iArr8 = {93, 102, 96, 97, 98, 99, 100, 101, 94, -1, -1, 95};
                aa aaVar9 = aa.u[aK().u()];
                if (aaVar9 != null) {
                    org.necrotic.client.f.e a8 = F.a(iArr8[u15]);
                    aaVar9.aB = a8;
                    aaVar9.aA = a8;
                }
                this.eM = -1;
                return true;
            case 181:
                this.eM = -1;
                return true;
            case 182:
                this.eM = -1;
                return true;
            case 185:
                int m8 = aK().m();
                aa.u[m8].M = 3;
                if (t.v == null) {
                    aa.u[m8].am = (t.t[0] << 25) + (t.t[4] << 20) + (t.w[0] << 15) + (t.w[8] << 10) + (t.w[11] << 5) + t.w[1];
                } else {
                    aa.u[m8].am = (int) (305419896 + t.v.w);
                }
                this.eM = -1;
                return true;
            case 187:
                this.bG = aK().q();
                if (this.bG.contains("#confirmstatus")) {
                    this.fB = true;
                    this.bG = this.bG.replace("#confirmstatus", "");
                } else {
                    this.fB = false;
                }
                if (this.bG.contains("$pin")) {
                    this.fA = true;
                    this.bG = this.bG.replace("$pin", "");
                } else {
                    this.fA = false;
                }
                if (this.bG.contains("#confirm2fa")) {
                    this.fB = true;
                    this.bG = this.bG.replace("#confirm2fa", "");
                } else {
                    this.fB = false;
                }
                this.ba = false;
                this.aJ = 2;
                this.W = "";
                G = true;
                this.eM = -1;
                return true;
            case 188:
                int t13 = aK().t();
                this.ht = new int[t13];
                for (int i75 = 0; i75 < t13; i75++) {
                    this.ht[i75] = aK().u();
                }
                this.eM = -1;
                return true;
            case 189:
                this.bG = aK().q();
                this.ba = false;
                this.aJ = 4;
                this.W = "";
                G = true;
                this.eM = -1;
                return true;
            case 190:
                int g2 = aK().g();
                int j5 = aK().j();
                int j6 = aK().j();
                aa aaVar10 = aa.u[g2];
                aaVar10.B = j5;
                aaVar10.C = j5;
                aaVar10.aq = j6;
                this.eM = -1;
                return true;
            case 196:
                long i76 = aK().i();
                aK().h();
                int t14 = aK().t();
                boolean z5 = false;
                if (t14 <= 1) {
                    for (int i77 = 0; i77 < this.ig; i77++) {
                        if (this.ea[i77] == i76) {
                            z5 = true;
                        }
                    }
                }
                if (!z5) {
                    ?? r02 = this.gK;
                    try {
                        String a9 = org.necrotic.client.f.a.d.a(this.eL - 13, aK());
                        String a10 = org.necrotic.client.f.a.b.a(org.necrotic.client.f.a.b.a(i76));
                        if (t14 != 0) {
                            Client client = this;
                            client.a(a9, 7, y(t14) + a10);
                            r02 = client;
                        } else {
                            Client client2 = this;
                            client2.a(a9, 3, a10);
                            r02 = client2;
                        }
                    } catch (Exception unused4) {
                        r02.printStackTrace();
                        ae.a("cde1");
                    }
                }
                this.eM = -1;
                return true;
            case 199:
                aa.u[23635].A = new int[]{aK().j(), aK().j(), aK().j()};
                this.eM = -1;
                return true;
            case 200:
                int u16 = aK().u();
                int o5 = aK().o();
                aa aaVar11 = aa.u[u16];
                aaVar11.P = o5;
                aaVar11.aq = 2000;
                if (o5 == -1) {
                    aaVar11.O = 0;
                    aaVar11.J = 0;
                }
                this.eM = -1;
                return true;
            case 203:
                aa.u[aK().j()].j = aK().e();
                this.eM = -1;
                return true;
            case 204:
                int g3 = aK().g();
                int g4 = aK().g();
                int g5 = aK().g();
                aa.u[g3].j = g4;
                aa.u[g3].n = g5;
                this.eM = -1;
                return true;
            case 206:
                this.bw = aK().t();
                this.bt = aK().t();
                this.bB = aK().t();
                G = true;
                this.eM = -1;
                return true;
            case 208:
                int I7 = aK().I();
                boolean z6 = aK().v() == 1;
                aa aaVar12 = aa.u[I7];
                if (aaVar12 != null) {
                    if (z6) {
                        if (!this.fi.contains(aaVar12)) {
                            this.fi.add(aaVar12);
                        }
                    } else {
                        this.fi.remove(aaVar12);
                    }
                }
                this.eM = -1;
                return true;
            case 209:
                int g6 = aK().g();
                int j7 = aK().j();
                if (aa.u[g6] != null) {
                    aa.u[g6].aA = j7 == 65535 ? null : F.a(j7);
                    aa.u[g6].aB = j7 == 65535 ? null : F.a(j7);
                }
                this.eM = -1;
                return true;
            case 210:
                aa.u[aK().u()].r = aK().u() != 0;
                this.eM = -1;
                return true;
            case 214:
                this.ig = aK().j();
                for (int i78 = 0; i78 < this.ig; i78++) {
                    this.ea[i78] = Long.parseLong(aK().q());
                }
                this.eM = -1;
                return true;
            case 217:
                try {
                    this.iL = aK().q();
                    this.iG = aK().q();
                    this.eG = aK().q();
                    this.iR = aK().u();
                    String replaceAll = this.iL.replaceAll("null", "");
                    this.iG = org.necrotic.client.f.a.d.a(this.iG);
                    r0 = this;
                    r0.a(r0.iG, 16, replaceAll);
                } catch (Exception unused5) {
                    r0.printStackTrace();
                }
                this.eM = -1;
                return true;
            case 218:
                this.aC = aK().F();
                G = true;
                this.eM = -1;
                return true;
            case 219:
                if (this.aK != -1) {
                    this.aK = -1;
                    cv = true;
                }
                if (this.ak != -1) {
                    this.ak = -1;
                    G = true;
                }
                if (this.aJ != 0) {
                    this.aJ = 0;
                    G = true;
                }
                u = -1;
                this.ev = false;
                this.eM = -1;
                return true;
            case 221:
                J(aK().t());
                this.eM = -1;
                return true;
            case 224:
                for (int i79 = 0; i79 < 3; i79++) {
                    aa.u[i79 + 25413].g = org.necrotic.client.f.e.a(F.a(1513));
                }
                this.eM = -1;
                return true;
            case PluginPanel.PANEL_WIDTH /* 225 */:
                ai aiVar = aa.u[aK().j()].bc;
                byte e5 = aK().e();
                int e6 = aK().e();
                int[] iArr9 = new int[e6];
                for (int i80 = 0; i80 < e6; i80++) {
                    iArr9[i80] = aK().j();
                }
                aiVar.a(iArr9);
                aiVar.a(e5);
                aiVar.a();
                this.eM = -1;
                return true;
            case 230:
                int D6 = aK().D();
                int u17 = aK().u();
                int u18 = aK().u();
                int m9 = aK().m();
                aa.u[u17].ao = u18;
                aa.u[u17].ap = m9;
                aa.u[u17].aq = D6;
                this.eM = -1;
                return true;
            case 231:
                int g7 = aK().g();
                int g8 = aK().g();
                aa aaVar13 = aa.u[g8];
                if (aaVar13 != null) {
                    System.out.println("npc_id: " + g7 + " interfaceId: " + g8);
                    aaVar13.C = g7;
                }
                this.eM = -1;
                return true;
            case 232:
                aa.u[aK().j()].a(aK().e() == 1);
                this.eM = -1;
                return true;
            case 233:
                aa.u[aK().j()].am = aK().j();
                this.eM = -1;
                return true;
            case 240:
                this.jk = aK().o();
                this.eM = -1;
                return true;
            case 244:
                p().a(aK().q());
                this.eM = -1;
                return true;
            case 246:
                int l10 = aK().l();
                int u19 = aK().u();
                int u20 = aK().u();
                if (u20 == 65535) {
                    aa.u[l10].M = 0;
                    this.eM = -1;
                    return true;
                }
                org.necrotic.client.c.a.i a11 = org.necrotic.client.c.a.i.a(u20);
                aa.u[l10].M = 4;
                aa.u[l10].am = u20;
                aa.u[l10].ao = a11.C;
                aa.u[l10].ap = a11.D;
                aa.u[l10].aq = (a11.E * 100) / u19;
                this.eM = -1;
                return true;
            case 248:
                int g9 = aK().g();
                int u21 = aK().u();
                if (this.ak != -1) {
                    this.ak = -1;
                    G = true;
                }
                if (this.aJ != 0) {
                    this.aJ = 0;
                    G = true;
                }
                u = g9;
                this.aK = u21;
                cv = true;
                this.ev = false;
                this.eM = -1;
                return true;
            case 249:
                this.gq = aK().z();
                this.jh = aK().u();
                this.eM = -1;
                return true;
            case 253:
                String q5 = aK().q();
                if (q5.startsWith("casketopening##")) {
                    String[] split = q5.split("##");
                    if (split[1] != null) {
                        g gVar = this.jP;
                        g.a(Integer.parseInt(split[1]), Integer.parseInt(split[2]) + 1, Integer.parseInt(split[3]), Integer.parseInt(split[4]));
                    }
                    this.eM = -1;
                    return true;
                } else if (q5.equals(":spinCasket")) {
                    this.jP.a();
                    this.eM = -1;
                    return true;
                } else if (q5.equals(":resetCasket")) {
                    this.jP.c();
                    this.eM = -1;
                    return true;
                } else if (q5.startsWith(":forge:")) {
                    org.necrotic.client.f.c.h.c = Integer.parseInt(q5.substring(q5.lastIndexOf(":") + 1)) == 0;
                    this.eM = -1;
                    return true;
                } else {
                    if (A) {
                        b(q5, 0);
                    } else if (!q5.equals(":refreshspinner:")) {
                        if (!q5.endsWith(":tradereq:")) {
                            if (!q5.endsWith(":gamblereq:")) {
                                if (!q5.endsWith(":raidreq:")) {
                                    if (!q5.startsWith(":clan:")) {
                                        if (!q5.endsWith("#url#")) {
                                            if (!q5.endsWith(":duelreq:")) {
                                                if (!q5.endsWith(":chalreq:")) {
                                                    if (q5.equalsIgnoreCase(":helloworld")) {
                                                        ct = true;
                                                        System.err.println("1");
                                                    } else if (q5.startsWith("Alert##")) {
                                                        String[] split2 = q5.split("##");
                                                        System.out.println(split2.length);
                                                        this.eo.a(new org.necrotic.client.i.a(split2[1], Integer.parseInt(split2[2]), Integer.parseInt(split2[3]), Integer.parseInt(split2[4]), Integer.parseInt(split2[5]), Integer.parseInt(split2[6]), split2[7], split2[8], split2[9]));
                                                        this.eM = -1;
                                                        return true;
                                                    } else {
                                                        a(q5, 0, "");
                                                    }
                                                } else {
                                                    String substring2 = q5.substring(0, q5.indexOf(":"));
                                                    long b4 = org.necrotic.client.f.a.b.b(substring2);
                                                    boolean z7 = false;
                                                    for (int i81 = 0; i81 < this.ig; i81++) {
                                                        if (this.ea[i81] == b4) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    if (!z7) {
                                                        int i82 = this.gK;
                                                        a(q5.substring(q5.indexOf(":") + 1, q5.length() - 9), 8, substring2);
                                                    }
                                                }
                                            } else {
                                                String substring3 = q5.substring(0, q5.indexOf(":"));
                                                long b5 = org.necrotic.client.f.a.b.b(substring3);
                                                boolean z8 = false;
                                                for (int i83 = 0; i83 < this.ig; i83++) {
                                                    if (this.ea[i83] == b5) {
                                                        z8 = true;
                                                    }
                                                }
                                                if (!z8) {
                                                    int i84 = this.gK;
                                                    a("wishes to duel with you.", 8, substring3);
                                                }
                                            }
                                        } else {
                                            a("Join us at: ", 9, q5.substring(0, q5.indexOf("#")));
                                        }
                                    } else {
                                        int parseInt = Integer.parseInt(q5.substring(6, 8));
                                        System.out.println(q5.substring(8));
                                        a("<col=16777215>" + substring.substring(0, 1) + "@blu@" + substring.substring(1, parseInt) + "<col=16777215>" + substring.substring(parseInt, parseInt + 1) + org.necrotic.client.f.b.a.a.c[this.S] + "<shad=0>" + substring.substring(parseInt + 1), 16, "");
                                    }
                                } else {
                                    String substring4 = q5.substring(0, q5.indexOf(":"));
                                    long b6 = org.necrotic.client.f.a.b.b(substring4);
                                    boolean z9 = false;
                                    for (int i85 = 0; i85 < this.ig; i85++) {
                                        if (this.ea[i85] == b6) {
                                            z9 = true;
                                        }
                                    }
                                    if (!z9) {
                                        int i86 = this.gK;
                                        a("invited you to their Raids party. Click here to accept the invitation.", 22, substring4);
                                    }
                                }
                            } else {
                                String substring5 = q5.substring(0, q5.indexOf(":"));
                                long b7 = org.necrotic.client.f.a.b.b(substring5);
                                boolean z10 = false;
                                for (int i87 = 0; i87 < this.ig; i87++) {
                                    if (this.ea[i87] == b7) {
                                        z10 = true;
                                    }
                                }
                                if (!z10 && substring5.length() >= 2) {
                                    a("wishes to gamble with you. Click here to accept the invitation.", 21, substring5);
                                }
                            }
                        } else {
                            String substring6 = q5.substring(0, q5.indexOf(":"));
                            long b8 = org.necrotic.client.f.a.b.b(substring6);
                            boolean z11 = false;
                            for (int i88 = 0; i88 < this.ig; i88++) {
                                if (this.ea[i88] == b8) {
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                int i89 = this.gK;
                                a("wishes to trade with you.", 4, substring6);
                            }
                        }
                    } else {
                        aa aaVar14 = aa.u[47029];
                        aa aaVar15 = aa.u[47023];
                    }
                    this.eM = -1;
                    return true;
                }
            case 254:
                this.aa = aK().t();
                if (this.aa == 1) {
                    this.Z = aK().u();
                }
                if (this.aa >= 2 && this.aa <= 6) {
                    if (this.aa == 2) {
                        this.hc = 64;
                        this.hd = 64;
                    }
                    if (this.aa == 3) {
                        this.hc = 0;
                        this.hd = 64;
                    }
                    if (this.aa == 4) {
                        this.hc = 128;
                        this.hd = 64;
                    }
                    if (this.aa == 5) {
                        this.hc = 64;
                        this.hd = 0;
                    }
                    if (this.aa == 6) {
                        this.hc = 64;
                        this.hd = 128;
                    }
                    this.aa = 5;
                    this.ac = aK().u();
                    this.ad = aK().u();
                    this.hb = aK().t();
                }
                if (this.aa == 10) {
                    this.ab = aK().u();
                }
                this.eM = -1;
                return true;
        }
    }

    private static String D(int i2) {
        int i3 = i2 / 60;
        int i4 = i2 - (i3 * 60);
        String valueOf = String.valueOf(i3);
        String valueOf2 = String.valueOf(i4);
        if (i4 < 10) {
            valueOf2 = "0".concat(String.valueOf(valueOf2));
        }
        if (i3 < 10) {
            valueOf = "0".concat(String.valueOf(valueOf));
        }
        return valueOf + ":" + valueOf2;
    }

    private void ap() {
        if (this.jG > 0) {
            aa.a();
            org.necrotic.client.f.c.b.a(true, D, this.jG == 2);
            return;
        }
        aa.a();
        org.necrotic.client.f.c.b.a(false, "", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v590, types: [org.necrotic.client.Client] */
    /* JADX WARN: Type inference failed for: r0v593 */
    @Override // org.necrotic.client.r
    public final void k() {
        e[] values;
        org.necrotic.client.j.e eVar;
        Container j2 = j();
        int i2 = j2.getSize().width;
        int i3 = j2.getSize().height;
        if (r.cb != i2 || r.ca != i3 || r.co) {
            Container j3 = j();
            if (j3 != null) {
                r.cb = j3.getWidth();
                r.ca = j3.getHeight();
                if (r.cb <= 0) {
                    r.cb = 1;
                }
                if (r.ca <= 0) {
                    r.ca = 1;
                }
                r.cl = Math.min(r.cb, r.cj);
                r.cm = Math.min(r.ca, r.ck);
                r.f2ch = (r.cb - r.cl) / 2;
                r.cn.setSize(r.cl, r.cm);
                p = r.cl;
                o = r.cm;
                if (q != null) {
                    q.ay();
                }
                r.cn.setLocation(r.f2ch, 0);
                int i4 = r.f2ch;
                int i5 = (r.cb - r.cl) - i4;
                int i6 = r.ca - r.cm;
                if (i4 > 0 || i5 > 0 || i6 > 0) {
                    try {
                        Graphics graphics = q.j().getGraphics();
                        graphics.setColor(Color.black);
                        if (i4 > 0) {
                            graphics.fillRect(0, 0, i4, r.ca);
                        }
                        if (i5 > 0) {
                            graphics.fillRect((0 + r.cb) - i5, 0, i5, r.ca);
                        }
                        if (i6 > 0) {
                            graphics.fillRect(0, (0 + r.ca) - i6, r.cb, i6);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            r.co = false;
        }
        if (this.im) {
            Runtime.getRuntime().addShutdownHook(new Thread() { // from class: org.necrotic.client.Client.1
                /* JADX WARN: Type inference failed for: r0v2, types: [java.io.IOException, java.lang.String] */
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    ?? b2;
                    try {
                        ae.a();
                        b2 = ae.b();
                        org.necrotic.client.l.b.a(b2);
                    } catch (IOException e2) {
                        b2.printStackTrace();
                        Client.b(Client.q, "A fatal error occured while attempting to fix the previous loading error", "Please screenshot this message and report it to Crimson immediately", e2.getMessage());
                    }
                }
            });
            InterruptedException interruptedException = q;
            b((Client) interruptedException, "An internal error occured whilst loading the Tarn client", "The client's common error quick fix system is attempting to repair the cause", "The client will automatically close in 10 seconds...");
            try {
                interruptedException = 10000;
                Thread.sleep(10000L);
            } catch (InterruptedException unused2) {
                interruptedException.printStackTrace();
            }
            System.exit(0);
        } else if (!this.jE) {
            if (!aL) {
                Y();
            } else if (this.hZ == -1 || (this.eI != 2 && this.bU == null)) {
                if (this.hS != 0) {
                    as();
                }
                if (this.jl) {
                    this.jl = false;
                    if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
                        this.jg.a(cn.getGraphics(), 0, 0);
                        this.il.a(cn.getGraphics(), 0, 4);
                        this.iQ.a(cn.getGraphics(), 516, 4);
                        this.iQ.a(cn.getGraphics(), 515, 4);
                    }
                    G = true;
                    cv = true;
                    if (this.eI != 2) {
                        if (!this.jA) {
                            this.aH.a(cn.getGraphics(), this.eY, this.eZ);
                        }
                        this.aM.a(cn.getGraphics(), this.eb.g(), this.eb.h());
                    }
                }
                ab();
                if (this.ak == -1 && this.aJ == 3) {
                    int i7 = (this.fa.c * 14) + 7;
                    this.dF.aw = this.fa.f;
                    if (this.bY > 478 && this.bY < 580 && this.bZ > o - 161) {
                        a(494, 110, this.bY, this.bZ - (o - 155), this.dF, 0, false, this.fa.c);
                    }
                    int i8 = this.dF.aw;
                    int i9 = i8;
                    if (i8 < 0) {
                        i9 = 0;
                    }
                    if (i9 > i7 - 110) {
                        i9 = i7 - 110;
                    }
                    if (this.fa.f != i9) {
                        this.fa.f = i9;
                        G = true;
                    }
                }
                if (this.ak == -1 && this.aJ != 3) {
                    this.dF.aw = (j - i) - 110;
                    if (this.bY > this.bN.g() + 478 && this.bY < this.bN.g() + 580 && this.bZ > this.bN.h() + 4) {
                        a(494, 110, this.bY - this.bN.g(), (this.bZ - this.bN.h()) - 10, this.dF, 0, false, j);
                    }
                    int i10 = (j - 110) - this.dF.aw;
                    int i11 = i10;
                    if (i10 < 0) {
                        i11 = 0;
                    }
                    if (i11 > j - 110) {
                        i11 = j - 110;
                    }
                    if (i != i11) {
                        i = i11;
                        G = true;
                    }
                }
                if (this.ak != -1 && i(this.he, this.ak)) {
                    G = true;
                }
                if (this.hB == 3) {
                    G = true;
                }
                if (this.gd == 3) {
                    G = true;
                }
                if (this.aj != null) {
                    G = true;
                }
                if (this.aY && this.aZ == 2) {
                    G = true;
                }
                if (G) {
                    X();
                    P();
                    G = false;
                }
                if (this.eI == 2) {
                    this.gN++;
                    int i12 = 0;
                    int i13 = this.bD;
                    int i14 = this.bF;
                    int i15 = this.bE;
                    int i16 = this.eS;
                    int i17 = this.eR;
                    if (aL) {
                        c(true);
                        b(true);
                        c(false);
                        b(false);
                        org.necrotic.client.c.b.b e2 = this.fY.e();
                        while (true) {
                            org.necrotic.client.j.f fVar = (org.necrotic.client.j.f) e2;
                            if (fVar == null) {
                                break;
                            }
                            if (fVar.k != this.bp || s > fVar.d) {
                                fVar.b();
                            } else if (s >= fVar.c) {
                                if (fVar.i > 0 && (eVar = this.bl[fVar.i - 1]) != null && eVar.aJ >= 0 && eVar.aJ < 13312 && eVar.aK >= 0 && eVar.aK < 13312) {
                                    fVar.a(s, eVar.aK, b(fVar.k, eVar.aK, eVar.aJ) - fVar.e, eVar.aJ);
                                }
                                if (fVar.i < 0) {
                                    int i18 = (-fVar.i) - 1;
                                    org.necrotic.client.e.a.a aVar = i18 == this.jh ? t : this.bq[i18];
                                    if (aVar != null && aVar.aJ >= 0 && aVar.aJ < 13312 && aVar.aK >= 0 && aVar.aK < 13312) {
                                        fVar.a(s, aVar.aK, b(fVar.k, aVar.aK, aVar.aJ) - fVar.e, aVar.aJ);
                                    }
                                }
                                fVar.a(this.he);
                                this.jm.a(this.bp, fVar.j, (int) fVar.h, -1, (int) fVar.g, 60, (int) fVar.f, fVar, false);
                            }
                            e2 = this.fY.f();
                        }
                        org.necrotic.client.c.b.b e3 = this.fZ.e();
                        while (true) {
                            org.necrotic.client.j.b bVar = (org.necrotic.client.j.b) e3;
                            if (bVar == null) {
                                break;
                            }
                            if (bVar.c != this.bp || bVar.h) {
                                bVar.b();
                            } else if (s >= bVar.g) {
                                bVar.a(this.he);
                                if (bVar.h) {
                                    bVar.b();
                                } else {
                                    this.jm.a(bVar.c, 0, bVar.f, -1, bVar.e, 60, bVar.d, bVar, false);
                                }
                            }
                            e3 = this.fZ.f();
                        }
                        if (!this.fP) {
                            int i19 = this.gE;
                            if (this.hf / 256 > i19) {
                                i19 = this.hf / 256;
                            }
                            if (this.dE[4] && this.dL[4] + 128 > i19) {
                                i19 = this.dL[4] + 128;
                            }
                            if (org.necrotic.a.v) {
                                r = s() >= 1024 ? 10 : 9;
                            } else {
                                r = 9;
                            }
                            int i20 = (this.bC + this.jj) & 2047;
                            int t2 = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? Constants.GAME_TICK_LENGTH + (i19 * 3) + e : s() >= 1024 ? ((i19 + (org.necrotic.a.v ? 1200 : 650)) - (t() / 400)) + e : 450 + (i19 * 3) + e;
                            int i21 = i19;
                            int i22 = this.gh;
                            int b2 = b(this.bp, t.aK, t.aJ) - 50;
                            int i23 = this.gi;
                            int i24 = t2;
                            int i25 = (2048 - i21) & 2047;
                            int i26 = (2048 - i20) & 2047;
                            int i27 = 0;
                            int i28 = 0;
                            if (i25 != 0) {
                                int i29 = org.necrotic.client.n.l.e[i25];
                                int i30 = org.necrotic.client.n.l.f[i25];
                                int i31 = ((0 * i30) - (i24 * i29)) >> 16;
                                i24 = ((0 * i29) + (i24 * i30)) >> 16;
                                i28 = i31;
                            }
                            if (i26 != 0) {
                                int i32 = org.necrotic.client.n.l.e[i26];
                                int i33 = org.necrotic.client.n.l.f[i26];
                                int i34 = ((i24 * i32) + (0 * i33)) >> 16;
                                i24 = ((i24 * i33) - (0 * i32)) >> 16;
                                i27 = i34;
                            }
                            this.bD = i22 - i27;
                            this.bF = b2 - i28;
                            this.bE = i23 - i24;
                            this.eS = i21;
                            this.eR = i20;
                        }
                        i12 = !this.fP ? ah() : (b(this.bp, this.bE, this.bD) - this.bF >= 800 || (this.hF[this.bp][this.bD >> 7][this.bE >> 7] & 4) == 0) ? 3 : this.bp;
                    }
                    int i35 = org.necrotic.client.n.l.v;
                    org.necrotic.client.n.d.c = true;
                    org.necrotic.client.n.d.g = 0;
                    org.necrotic.client.n.d.e = this.bY - 4;
                    org.necrotic.client.n.d.f = this.bZ - 4;
                    if (aL) {
                        this.jm.a(this.bD, this.bE, this.eR, this.bF, i12, this.eS);
                        this.jm.b();
                        if (org.necrotic.a.p) {
                            org.necrotic.client.n.l.a(2800, 3300);
                        } else {
                            org.necrotic.client.n.l.a(7700, 7700);
                        }
                    }
                    aA();
                    if (this.fx != 0) {
                        System.currentTimeMillis();
                        long j4 = this.fx;
                    }
                    if (this.fF != -1) {
                        if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
                            int i36 = this.hT[0][0];
                            int i37 = this.hT[0][1];
                            org.necrotic.client.f.e eVar2 = this.iv;
                            eVar2.c(i36 - eVar2.d, i37 - this.iv.e);
                            this.bg.a(D(this.fF), i36, i37, 16753920, 1, true);
                        } else if (org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
                            int s2 = s() + this.hT[1][0];
                            int i38 = this.hT[1][1];
                            org.necrotic.client.f.e eVar3 = this.iv;
                            eVar3.c(s2 - eVar3.d, i38 - this.iv.e);
                            this.bg.a(D(this.fF), s2, i38, 16753920, 1, true);
                        }
                    }
                    if (this.aa == 2) {
                        a(((this.ac - this.al) << 7) + this.hc, this.hb << 1, ((this.ad - this.am) << 7) + this.hd);
                        if (this.iY >= 0 && s % 20 < 10) {
                            this.f1if[0].e(this.iY - 12, this.iZ - 28);
                        }
                    }
                    if (!dg) {
                        for (e eVar4 : e.values()) {
                            if (org.necrotic.client.n.l.x[eVar4.a()] >= eVar4.a()) {
                                org.necrotic.client.f.a aVar2 = org.necrotic.client.n.l.c[eVar4.a()];
                                int i39 = (aVar2.e * aVar2.f) - 1;
                                int b3 = aVar2.e * this.he * eVar4.b();
                                byte[] bArr = aVar2.c;
                                byte[] bArr2 = this.fU;
                                for (int i40 = 0; i40 <= i39; i40++) {
                                    bArr2[i40] = bArr[(i40 - b3) & i39];
                                }
                                aVar2.c = bArr2;
                                this.fU = bArr;
                                org.necrotic.client.n.l.b(eVar4.a());
                            }
                        }
                    }
                    if (org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED && aL) {
                        ab();
                        X();
                        Z();
                    }
                    if (aL) {
                        if (org.necrotic.a.q) {
                            for (int i41 = 0; i41 < 104; i41++) {
                                for (int i42 = 0; i42 < 104; i42++) {
                                    org.necrotic.client.c.b.a aVar3 = this.aI[this.bp][i41][i42];
                                    int i43 = -13;
                                    if (aVar3 != null) {
                                        org.necrotic.client.c.b.b a2 = aVar3.a();
                                        while (true) {
                                            org.necrotic.client.j.d dVar = (org.necrotic.client.j.d) a2;
                                            if (dVar != null) {
                                                org.necrotic.client.c.a.i a3 = org.necrotic.client.c.a.i.a(dVar.d);
                                                a((i41 << 7) + 64, 64, (i42 << 7) + 64);
                                                this.bg.a(a3.G + (dVar.c > 1 ? " (" + c(dVar.c) + ")" : ""), this.iY, this.iZ - i43, 16777215, 1);
                                                i43 += 12;
                                                a2 = aVar3.b();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        W();
                        P();
                        if (A) {
                            org.necrotic.client.f.c.a(334, 0, 0, j().getWidth());
                            org.necrotic.client.f.c.b(1, 315, 0, 16777215, j().getWidth());
                            this.bi.a("-->", 11, 328, 16777215, 0, false);
                            if (s % 20 < 10) {
                                this.bi.a(this.fC + "|", 38, 328, 16777215, 0, false);
                            } else {
                                this.bi.a(this.fC, 38, 328, 16777215, 0, false);
                            }
                        }
                    }
                    if (org.necrotic.client.e.a.b.b && aL) {
                        this.eb.b(this);
                    }
                    if (aL) {
                        if (!this.jA) {
                            this.aH.a(cn.getGraphics(), this.eY, this.eZ);
                        }
                        this.bD = i13;
                        this.bF = i14;
                        this.bE = i15;
                        this.eS = i16;
                        this.eR = i17;
                    }
                }
                if (this.eI == 2 && org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
                    Z();
                    if (this.eb.i()) {
                        this.aM.a(cn.getGraphics(), this.eb.g(), this.eb.h());
                    }
                }
                if (this.ez != -1) {
                    cv = true;
                }
                if (cv) {
                    if (this.ez != -1 && this.ez == w) {
                        this.ez = -1;
                        dk.i(120);
                        dk.l(w);
                    }
                    cv = false;
                    this.hv.a();
                    this.aH.a();
                }
                if (this.aY) {
                    i();
                }
                this.he = 0;
            } else {
                if (this.eI == 2) {
                    i(this.he, this.hZ);
                    if (u != -1) {
                        i(this.he, u);
                    }
                    this.he = 0;
                    if (this.bU == null) {
                        this.ap = null;
                        this.aM = null;
                        this.bA = null;
                        this.aH = null;
                        this.hv = null;
                        this.hu = null;
                        this.jc = null;
                        this.bU = new org.necrotic.client.f.d(Constants.GAME_FIXED_WIDTH, Constants.GAME_FIXED_HEIGHT, j());
                        this.jl = true;
                    }
                    this.bU.a();
                    org.necrotic.client.n.l.B = this.ia;
                    org.necrotic.client.f.c.e();
                    this.jl = true;
                    if (u != -1) {
                        aa aaVar = aa.u[u];
                        if (aaVar.aO == 512 && aaVar.aa == 334 && aaVar.aK == 0) {
                            aaVar.aO = Constants.GAME_FIXED_WIDTH;
                            aaVar.aa = Constants.GAME_FIXED_HEIGHT;
                        }
                        a(0, 0, aaVar, 8);
                    }
                    aa aaVar2 = aa.u[this.hZ];
                    if (aaVar2.aO == 512 && aaVar2.aa == 334 && aaVar2.aK == 0) {
                        aaVar2.aO = Constants.GAME_FIXED_WIDTH;
                        aaVar2.aa = Constants.GAME_FIXED_HEIGHT;
                    }
                    a(0, 0, aaVar2, 8);
                    if (this.aY) {
                        i();
                    } else {
                        aq();
                        ac();
                    }
                }
                this.hS++;
                this.bU.a(cn.getGraphics(), 0, 0);
            }
            this.gI = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0450, code lost:
        if (r0 == 13) goto L259;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v79 */
    @Override // org.necrotic.client.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 1991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.necrotic.client.Client.l():void");
    }

    private void a(String str, boolean z2, String str2, Client client) {
        String[] strArr;
        if (!this.ek.a(1500L)) {
            return;
        }
        this.ek.c();
        o.a().clear();
        String b2 = b(org.necrotic.client.f.a.b.a(str2));
        for (String str3 : org.necrotic.client.l.a.a) {
            if (b2.toLowerCase().contains(str3)) {
                this.ip = new String[]{"This username has been blocked", "and cannot be used."};
                return;
            } else if (str.toUpperCase().contains(str3)) {
                this.ip = new String[]{"This password has been blocked", "and cannot be used."};
                return;
            }
        }
        if (b2.toLowerCase().contains("admin") || b2.toLowerCase().contains("mod") || b2.toLowerCase().contains("dev") || b2.toLowerCase().contains("owner")) {
            this.ip = new String[]{"This username has been blocked", "and cannot be used."};
        } else if (b2.startsWith(" ") || b2.startsWith("_")) {
            this.ip = new String[]{"Your username cannot start with a space."};
        } else if (b2.endsWith(" ") || b2.endsWith("_")) {
            this.ip = new String[]{"Your username cannot end with a space."};
        } else if (b2.length() <= 0 && str.length() <= 0) {
            this.ip = new String[]{"Please enter a valid username and password."};
        } else if (str.length() < 3) {
            this.ip = new String[]{"Your password is too short."};
        } else if (b2.length() <= 0) {
            this.ip = new String[]{"Your username is too short."};
        } else if (b2.length() > 12) {
            this.ip = new String[]{"Your username is too long."};
        } else if (str.length() > 24) {
            this.ip = new String[]{"Your password is too long."};
        } else {
            this.ip = new String[]{"Attempting to login"};
            if (client.is == 0) {
                client.io = 0;
            }
            try {
                this.ip = new String[]{"Attempting to login"};
                Y();
                new Thread(() -> {
                    boolean z3 = this.jH;
                }, "Login").start();
                b(client);
                a(client, client.hI.c(), b2, str, N(), this.kb, z2);
            } catch (IOException unused) {
                this.ip = new String[]{"Error connecting to server."};
                this.jH = false;
                aL = false;
            }
        }
    }

    private static void b(Client client) {
        client.hI = new org.necrotic.client.h.a(client, T());
        int b2 = (int) ((org.necrotic.client.f.a.b.b(D) >> 16) & 31);
        dk.f = 0;
        dk.l(76);
        dk.l(b2);
        client.hI.a(2, dk.d);
        for (int i2 = 0; i2 < 8; i2++) {
            client.hI.c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.String, java.lang.Exception] */
    private boolean a(Client client, int i2, String str, String str2, String str3, String str4, boolean z2) {
        ?? r0;
        if (i2 == 0) {
            client.hI.a(client.ih.d, 8);
            client.ih.f = 0;
            client.iU = client.ih.i();
            int[] iArr = new int[4];
            iArr[0] = (int) (Math.random() * 9.9999999E7d);
            iArr[1] = (int) (Math.random() * 9.9999999E7d);
            iArr[2] = (int) (client.iU >> 32);
            iArr[3] = (int) client.iU;
            dk.f = 0;
            dk.l(21);
            dk.h(iArr[0]);
            dk.h(iArr[1]);
            dk.h(iArr[2]);
            dk.h(iArr[3]);
            dk.h(350);
            dk.a(str);
            dk.a(str2);
            dk.a(str3);
            dk.a(str4);
            dk.j(222);
            dk.l(0);
            org.necrotic.client.g.a aVar = dk;
            int i3 = aVar.f;
            aVar.f = 0;
            byte[] bArr = new byte[i3];
            aVar.a(i3, bArr);
            byte[] byteArray = new BigInteger(bArr).modPow(org.necrotic.client.g.a.h, org.necrotic.client.g.a.g).toByteArray();
            aVar.f = 0;
            aVar.l(byteArray.length);
            aVar.b(byteArray, byteArray.length);
            client.in.f = 0;
            client.in.l(z2 ? 65 : 92);
            client.in.l(dk.f + 36 + 1 + 1 + 2 + this.jZ.length() + 1);
            client.in.l(169);
            client.in.j(39);
            client.in.l(dg ? 66 : 12);
            byte[] bytes = cw.getBytes(StandardCharsets.UTF_8);
            this.in.l(bytes.length);
            this.in.b(bytes, bytes.length);
            try {
                this.jW = (this.jZ == null || this.jZ.length() == 0) ? -1 : Integer.parseInt(this.jZ);
            } catch (NumberFormatException unused) {
                this.jW = -1;
            }
            this.in.j(this.jW);
            this.in.a(this.jZ);
            for (int i4 = 0; i4 < 9; i4++) {
                this.in.h(this.dZ[i4]);
            }
            client.in.b(dk.d, dk.f);
            dk.e = new org.necrotic.client.g.b(iArr);
            for (int i5 = 0; i5 < 4; i5++) {
                int i6 = i5;
                iArr[i6] = iArr[i6] + 50;
            }
            client.hJ = new org.necrotic.client.g.b(iArr);
            client.hI.a(client.in.f, client.in.d);
            i2 = client.hI.c();
            this.jX = false;
            this.jZ = "";
        }
        if (i2 == 1) {
            this.jH = false;
            try {
                Thread.sleep(2000L);
            } catch (Exception unused2) {
            }
            a(str2, z2, str, client);
            return false;
        } else if (i2 != 2) {
            if (!a(i2, str, z2, client, str2)) {
                this.jH = false;
                this.jY = false;
                this.jX = false;
                return false;
            } else if (i2 != -1) {
                this.ip = new String[]{"Unexpected server response.", "Please try using a different world."};
                return false;
            } else {
                this.jH = false;
                if (i2 != 0 || client.is == 0) {
                    this.ip = new String[]{"No response from server!"};
                    return false;
                } else if (client.io >= 2) {
                    this.ip = new String[]{"Too many login attempts!"};
                    return false;
                } else {
                    try {
                        Thread.sleep(2000L);
                    } catch (Exception unused3) {
                    }
                    client.io++;
                    a(str2, z2, str, client);
                    return false;
                }
            }
        } else {
            client.be = client.hI.c();
            client.hI.c();
            if (client.hI.c() > 0) {
                int c2 = ((client.hI.c() & ColorUtil.MAX_RGB_VALUE) << 8) + (client.hI.c() & ColorUtil.MAX_RGB_VALUE);
                int i7 = c2;
                if (c2 > 60000) {
                    i7 -= 65535;
                }
                byte[] bArr2 = new byte[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    bArr2[i8] = (byte) client.hI.c();
                }
                ImageIO.read(new ByteArrayInputStream(bArr2));
                this.ka = new org.necrotic.client.f.e(bArr2);
                this.jX = true;
                this.jY = true;
                this.iq = 0;
            } else {
                client.bP = true;
                client.ew = true;
                aL = true;
                dk.f = 0;
                client.ih.f = 0;
                client.eM = -1;
                client.eD = -1;
                client.eE = -1;
                client.eF = -1;
                client.eL = 0;
                client.ex = 0;
                client.eC = 0;
                client.fu = 0;
                client.fv = null;
                client.ey = 0;
                client.aa = 0;
                client.aX = 0;
                client.aY = false;
                client.bV = 0;
                client.eH = 0;
                client.eP = 0;
                client.eI = 0;
                client.eO = 0;
                client.aw();
                client.X = 0;
                client.hg = -1;
                client.aA = 0;
                client.aB = 0;
                client.br = 0;
                client.bm = 0;
                try {
                    File file = new File(ae.b() + "/" + r0.trim().toLowerCase() + ".goals");
                    if (file.exists()) {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        for (int i9 = 0; i9 < af.c.length; i9++) {
                            af.c[i9][0] = dataInputStream.readInt();
                            af.c[i9][1] = dataInputStream.readInt();
                            af.c[i9][2] = dataInputStream.readInt();
                            af.d = dataInputStream.readUTF();
                        }
                        dataInputStream.close();
                    } else {
                        for (int i10 = 0; i10 < af.c.length; i10++) {
                            af.c[i10][0] = -1;
                            af.c[i10][1] = -1;
                            af.c[i10][2] = -1;
                        }
                    }
                } catch (Exception unused4) {
                    D.printStackTrace();
                }
                for (int i11 = 0; i11 < client.ec; i11++) {
                    client.bq[i11] = null;
                    client.hy[i11] = null;
                }
                for (int i12 = 0; i12 < 16384; i12++) {
                    client.bl[i12] = null;
                }
                org.necrotic.client.e.a.a[] aVarArr = client.bq;
                int i13 = client.ed;
                org.necrotic.client.e.a.a aVar2 = new org.necrotic.client.e.a.a();
                aVarArr[i13] = aVar2;
                t = aVar2;
                client.fY.d();
                client.fZ.d();
                for (int i14 = 0; i14 < 4; i14++) {
                    for (int i15 = 0; i15 < 104; i15++) {
                        for (int i16 = 0; i16 < 104; i16++) {
                            client.aI[i14][i15][i16] = null;
                        }
                    }
                }
                client.ga = new org.necrotic.client.c.b.a();
                client.hZ = -1;
                client.gZ = 0;
                client.aE = 0;
                client.aC = -1;
                client.ak = -1;
                u = -1;
                client.aK = -1;
                client.gk = -1;
                client.ev = false;
                w = 3;
                client.aJ = 0;
                client.aY = false;
                client.ba = false;
                client.aj = null;
                client.eA = 0;
                client.eB = 0;
                client.ez = -1;
                client.eu = true;
                client.aj();
                for (int i17 = 0; i17 < 5; i17++) {
                    client.dp[i17] = 0;
                }
                for (int i18 = 0; i18 < 7; i18++) {
                    client.dq[i18] = null;
                    client.dr[i18] = false;
                }
                cO = 0;
                cK = 0;
                dc = 0;
                cR = 0;
                db = 0;
                cP = 0;
                cM = 0;
                cQ = 0;
                client.aw = new int[500];
                client.ar = new String[500];
                client.aq = new String[500];
                client.as();
                if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
                    client.aB();
                }
                a(26007, org.necrotic.a.o);
                a(26008, org.necrotic.a.j);
                a(26010, org.necrotic.a.n);
                a(26014, org.necrotic.a.h);
                a(26026, org.necrotic.a.e);
                a(26027, org.necrotic.a.f);
                a(26029, org.necrotic.a.i);
                a(26033, org.necrotic.a.m);
                a(26054, !org.necrotic.a.r);
                a(26058, org.necrotic.a.r);
                a(26067, org.necrotic.a.p);
                a(26031, org.necrotic.a.q);
                this.ip = new String[]{""};
                this.jH = false;
            }
            org.necrotic.client.e.a.b.a();
            String a2 = j.a(k.a);
            dk.i(243);
            dk.l(a2.length() + 1);
            dk.a(a2);
            return false;
        }
    }

    private boolean a(int i2, String str, boolean z2, Client client, String str2) {
        if (i2 == 3) {
            this.ip = new String[]{"Invalid username or password."};
            return false;
        } else if (i2 == 4) {
            this.ip = new String[]{"This account has been banned! Appeal on the forum."};
            return false;
        } else if (i2 == 5) {
            this.ip = new String[]{"This account is already logged in.", "Please try again in 60 seconds.."};
            return false;
        } else if (i2 == 6) {
            this.ip = new String[]{"Tarn is currently being updated.", "Please try again in 60 seconds.."};
            return false;
        } else if (i2 == 7) {
            this.ip = new String[]{"Tarn is currently busy.", "Please try again."};
            return false;
        } else if (i2 == 8) {
            this.ip = new String[]{"Tarn login server is down.", "Please try again in 60 seconds.."};
            return false;
        } else if (i2 == 9) {
            this.ip = new String[]{"Login limit exceeded. Too many connections", "from your address."};
            return false;
        } else if (i2 == 10) {
            this.ip = new String[]{"Unable to connect!", "Server responded: bad session id!"};
            return false;
        } else if (i2 == 11) {
            this.ip = new String[]{"Unable to connect!", "Server responded: rejected session!"};
            return false;
        } else if (i2 == 12) {
            this.ip = new String[]{"You need to be a member to login to this world."};
            return false;
        } else if (i2 == 13) {
            this.ip = new String[]{"Login could not be completed. Try again!"};
            return false;
        } else if (i2 == 14) {
            this.ip = new String[]{"Tarn is currently being updated.", "Please try again in 60 seconds.."};
            return false;
        } else if (i2 == 23) {
            this.ip = new String[]{"Tarn is currently being launched.", "Please try again in 60 seconds.."};
            return false;
        } else if (i2 == 27) {
            this.ip = new String[]{"Your IP-Adress has been banned.", "Please appeal on the forums."};
            return false;
        } else if (i2 == 28) {
            this.ip = new String[]{"Your username contains invalid letters.", "Your username contains invalid letters."};
            return false;
        } else if (i2 == 29) {
            this.ip = new String[]{"Old client usage detected.", "Download the latest one!"};
            return false;
        } else if (i2 == 31) {
            this.ip = new String[]{"Your username cannot start with a space."};
            return false;
        } else if (i2 == 22) {
            this.ip = new String[]{"This computer has been banned.", "Appeal on the forum!"};
            return false;
        } else if (i2 == 30) {
            String[] strArr = new String[2];
            strArr[0] = "Tarn has been updated!";
            strArr[1] = ae() ? "Refresh this page." : "Download the latest client.";
            this.ip = strArr;
            return false;
        } else if (i2 == 16) {
            this.ip = new String[]{"Login attempts exceeded.", "Please wait 1 minute and try again."};
            return false;
        } else if (i2 == 17) {
            this.ip = new String[]{"You are standing in a members-only area.", "To play on this world move to a free area first."};
            return false;
        } else if (i2 == 20) {
            this.ip = new String[]{"Invalid loginserver requested", "Please try using a different world."};
            return false;
        } else if (i2 == 37) {
            this.ip = new String[]{"This account does not exist. You can create", "it by clicking the button below."};
            return false;
        } else if (i2 == 66) {
            this.ip = new String[]{"This account has been locked. Please contact Corrupt or Alex to unlock."};
            return false;
        } else if (i2 == 67) {
            this.ip = new String[]{"This account has been temporarily disabled for 5 Minutes"};
            return false;
        } else if (i2 == 68) {
            this.ip = new String[]{"This account has been temporarily disabled 10 Minutes"};
            return false;
        } else if (i2 == 69) {
            this.ip = new String[]{"This account has been temporarily disabled 15 Minutes"};
            return false;
        } else if (i2 == 70) {
            this.ip = new String[]{"This account has been temporarily disabled 30 Minutes"};
            return false;
        } else if (i2 == 71) {
            this.ip = new String[]{"This account has been temporarily disabled 1 Hour"};
            return false;
        } else if (i2 == 72) {
            this.ip = new String[]{"This account has been temporarily disabled ."};
            return false;
        } else if (i2 == 73) {
            this.ip = new String[]{"This IP is not registered. Please turn off VPNs."};
            return false;
        } else if (i2 == 74) {
            this.ip = new String[]{"Please turn off VPN's or TORs."};
            return false;
        } else if (i2 == 21) {
            for (int c2 = client.hI.c(); c2 >= 0; c2--) {
                this.ip = new String[]{"You have only just left another world", "Your profile will be transferred in: " + c2 + " seconds"};
                Y();
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused) {
                }
            }
            a(str, z2, str2, this);
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v181, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v236 */
    /* JADX WARN: Type inference failed for: r0v237 */
    private void aq() {
        if (this.gd != 0) {
            return;
        }
        this.aW[0] = "Cancel";
        this.aV[0] = 1107;
        this.aX = 1;
        int i2 = 122 + (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 0 : 2);
        if (this.hZ != -1) {
            this.gX = 0;
            this.gT = 0;
            this.fr = 0;
            a(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 8 : (s() / 2) - (aa.u[this.hZ].aO / 2), aa.u[this.hZ], this.bY, org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 8 : (t() / 2) - (aa.u[this.hZ].aa / 2), this.bZ, 0);
            if (this.gX != this.gl) {
                this.gl = this.gX;
            }
            if (this.gT != this.gC) {
                this.gC = this.gT;
                return;
            }
            return;
        }
        if (!this.bN.b() && this.id) {
            R();
        }
        if (this.bY >= 495 && this.bY <= 510 && this.bZ >= i2 + this.bN.h() && this.bZ <= (i2 + this.bN.h()) + 13) {
            a.C0027a c0027a = this.bN.a;
            org.necrotic.client.f.b.a.a();
            c0027a.a(this);
            return;
        }
        this.gX = 0;
        this.gT = 0;
        this.fr = 0;
        int s2 = org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? s() : 516;
        int t2 = org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? t() : 338;
        if (this.bY > this.eY && this.bZ > this.eZ && this.bY < s2 && this.bZ < t2) {
            int i3 = u;
            ?? r0 = i3;
            if (i3 != -1) {
                boolean z2 = this.id;
                r0 = z2;
                if (z2) {
                    aa aaVar = aa.u[u];
                    if (org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
                        a(this.eY + (((org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? s() : 516) - Constants.GAME_FIXED_WIDTH) / 2), aaVar, this.bY, this.eZ + (((org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? t() : 338) - Constants.GAME_FIXED_HEIGHT) / 2), this.bZ, 0);
                    } else {
                        a(4, aaVar, this.bY, 4, this.bZ, 0);
                    }
                }
            }
            try {
                if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
                    Q();
                } else if (!this.eb.b(this, org.necrotic.client.f.b.a.a()) && !this.bN.b(this, org.necrotic.client.f.b.a.a()) && !this.bz.b(this, org.necrotic.client.f.b.a.a())) {
                    Q();
                }
            } catch (Exception unused) {
                r0.printStackTrace();
            }
        }
        b bVar = this.ep;
        int i4 = this.bY;
        int i5 = this.bZ;
        bVar.a();
        this.eo.a(this.bY, this.bZ);
        if (this.fv != null) {
            this.bk.b(16776960, this.fv, org.necrotic.client.f.b.a.j() ? 329 : t() - 168, 4);
            if (this.bY >= 4 && this.bY <= 503) {
                if (this.bZ >= (org.necrotic.client.f.b.a.j() ? 320 : t() - 168)) {
                    if (this.bZ <= (org.necrotic.client.f.b.a.j() ? 337 : t() - 185)) {
                        q.aW[0] = "Dismiss";
                        q.aV[0] = 471;
                    }
                }
            }
        }
        a.C0027a c0027a2 = this.bN.a;
        org.necrotic.client.f.b.a.a();
        c0027a2.a(this);
        if (this.gX != this.gl) {
            this.gl = this.gX;
        }
        if (this.gT != this.gC) {
            this.gC = this.gT;
        }
        this.gX = 0;
        this.gT = 0;
        this.fr = 0;
        if (this.bz.b(this, org.necrotic.client.f.b.a.a()) && !this.bz.b()) {
            if (this.aK != -1) {
                a(this.bz.g() + (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 31 : 40), aa.u[this.aK], this.bY, this.bz.h() + (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 36 : s() <= 1000 ? -6 : 30), this.bZ, 0);
            } else if (c[w] != -1) {
                a(this.bz.g() + (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 31 : 40), aa.u[c[w]], this.bY, this.bz.h() + (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 36 : s() <= 1000 ? -6 : 30), this.bZ, 0);
            }
        }
        if (this.gX != this.gr) {
            cv = true;
            this.gr = this.gX;
        }
        if (this.gT != this.gp) {
            cv = true;
            this.gp = this.gT;
        }
        this.gX = 0;
        this.gT = 0;
        if (this.bY > this.bN.g() && this.bZ > this.bN.h() && this.bY < this.bN.g() + 490 && this.bZ < this.bN.h() + 125) {
            if (this.ak != -1) {
                a(20, aa.u[this.ak], this.bY, this.bN.h() + 20, this.bZ, this.bN.g());
            } else if (this.bZ < this.bN.h() + 125 && this.bY < this.bN.g() + 490) {
                t(this.bZ - this.bN.h());
            }
        }
        if (this.ak != -1 && this.gX != this.go) {
            G = true;
            this.go = this.gX;
        }
        if (this.ak != -1 && this.gT != this.gU) {
            G = true;
            this.gU = this.gT;
        }
        this.eb.c(this);
        boolean z3 = false;
        while (!z3) {
            z3 = true;
            for (int i6 = 0; i6 < this.aX - 1; i6++) {
                if (this.aV[i6] < 1000 && this.aV[i6 + 1] > 1000) {
                    String str = this.aW[i6];
                    String[] strArr = this.aW;
                    strArr[i6] = strArr[i6 + 1];
                    this.aW[i6 + 1] = str;
                    int i7 = this.aV[i6];
                    int[] iArr = this.aV;
                    iArr[i6] = iArr[i6 + 1];
                    this.aV[i6 + 1] = i7;
                    int i8 = this.iA[i6];
                    int[] iArr2 = this.iA;
                    iArr2[i6] = iArr2[i6 + 1];
                    this.iA[i6 + 1] = i8;
                    int i9 = this.iB[i6];
                    int[] iArr3 = this.iB;
                    iArr3[i6] = iArr3[i6 + 1];
                    this.iB[i6 + 1] = i9;
                    int i10 = this.jC[i6];
                    int[] iArr4 = this.jC;
                    iArr4[i6] = iArr4[i6 + 1];
                    this.jC[i6 + 1] = i10;
                    int i11 = this.jD[i6];
                    int[] iArr5 = this.jD;
                    iArr5[i6] = iArr5[i6 + 1];
                    this.jD[i6 + 1] = i11;
                    int i12 = this.iz[i6];
                    int[] iArr6 = this.iz;
                    iArr6[i6] = iArr6[i6 + 1];
                    this.iz[i6 + 1] = i12;
                    z3 = false;
                }
            }
        }
    }

    private boolean d(aa aaVar) {
        int i2 = aaVar.X;
        int i3 = aaVar.ac - 79924;
        if (this.gZ == 2) {
            if (i2 == 201) {
                G = true;
                this.aJ = 0;
                this.ba = true;
                this.bu = "";
                this.hY = 1;
                this.bv = "Enter name of friend to add to list";
            }
            if (i2 == 202) {
                G = true;
                this.aJ = 0;
                this.ba = true;
                this.bu = "";
                this.hY = 2;
                this.bv = "Enter name of friend to delete from list";
            }
        }
        if (i2 == 205) {
            this.ey = 250;
            return true;
        }
        if (i2 == 501) {
            G = true;
            this.aJ = 0;
            this.ba = true;
            this.bu = "";
            this.hY = 4;
            this.bv = "Enter the name of a player to add to the list";
        }
        if (i2 == 502) {
            G = true;
            this.aJ = 0;
            this.ba = true;
            this.bu = "";
            this.hY = 5;
            this.bv = "Enter the name of a player to delete from the list";
        }
        if (i2 == 1321) {
            G = true;
            this.aJ = 0;
            this.ba = true;
            this.bu = "";
            this.hY = 12;
            this.bv = "Enter your " + af.a[i3] + " level goal below.";
        }
        if (i2 == 1322) {
            G = true;
            this.aJ = 0;
            this.ba = true;
            this.bu = "";
            this.hY = 13;
            this.bv = "Enter your experience goal below.";
        }
        if (i2 == 1323) {
            if (af.c[af.e][0] == -1 && af.c[af.e][1] == -1 && af.c[af.e][2] == -1) {
                a("You do not have a goal to clear for that level.", 0, "");
            }
            if (af.e >= 0) {
                af.c[af.e][0] = -1;
                af.c[af.e][1] = -1;
                af.c[af.e][2] = -1;
                k(D);
            }
        } else if (i2 >= 5000 && i2 <= 5025) {
            dk.i(223);
            dk.j(i2 - 5000);
            return true;
        }
        if (i2 == 550) {
            if (aa.u[18135].an.startsWith("Join")) {
                G = true;
                this.aJ = 0;
                this.ba = true;
                this.bu = "";
                this.hY = 6;
                this.bv = "Enter the name of the chat you wish to join";
            } else {
                dk.i(195);
                dk.h(49627);
            }
        }
        if (i2 == 22222) {
            G = true;
            this.ba = true;
            this.W = "";
            this.bu = "";
            this.aJ = 0;
            this.ii = 6199;
            this.bv = "Enter a name for the clan chat.";
        }
        if (i2 == 677) {
            G = true;
            this.ba = true;
            this.W = "";
            this.bu = "";
            this.aJ = 0;
            this.ii = 6200;
            this.bv = "Enter name of the player you would like kicked.";
        }
        if (i2 >= 300 && i2 <= 313) {
            int i4 = (i2 - 300) / 2;
            int i5 = i2 & 1;
            int i6 = this.dJ[i4];
            int i7 = i6;
            if (i6 != -1) {
                while (true) {
                    if (i5 == 0) {
                        i7--;
                        if (i7 < 0) {
                            i7 = org.necrotic.client.c.a.e.f() - 1;
                        }
                    }
                    if (i5 == 1) {
                        i7++;
                        if (i7 >= org.necrotic.client.c.a.e.f()) {
                            i7 = 0;
                        }
                    }
                    if (!org.necrotic.client.c.a.e.a[i7].e()) {
                        if (org.necrotic.client.c.a.e.a[i7].g() == i4 + (this.eu ? 0 : 7)) {
                            break;
                        }
                    }
                }
                this.dJ[i4] = i7;
                this.fL = true;
            }
        }
        if (i2 >= 314 && i2 <= 323) {
            int i8 = (i2 - 314) / 2;
            int i9 = i2 & 1;
            int i10 = this.dp[i8];
            if (i9 == 0) {
                i10--;
                if (i10 < 0) {
                    i10 = b[i8].length - 1;
                }
            }
            if (i9 == 1) {
                i10++;
                if (i10 >= b[i8].length) {
                    i10 = 0;
                }
            }
            this.dp[i8] = i10;
            this.fL = true;
        }
        if (i2 == 324 && !this.eu) {
            this.eu = true;
            aj();
        }
        if (i2 == 325 && this.eu) {
            this.eu = false;
            aj();
        }
        if (i2 == 326) {
            String str = " " + (this.eu ? 0 : 1);
            for (int i11 = 0; i11 < 7; i11++) {
                str = str + " " + this.dJ[i11];
            }
            for (int i12 = 0; i12 < 5; i12++) {
                str = str + " " + this.dp[i12];
            }
            dk.i(11);
            dk.l(str.substring(1).length() + 1);
            dk.a(str.substring(1));
            return true;
        }
        return false;
    }

    private void a(String str, String str2, String str3, int i2, int i3, List<Integer> list) {
        if (this.ak == -1) {
            G = true;
        }
        for (int i4 = 499; i4 > 0; i4--) {
            int[] iArr = this.aw;
            iArr[i4] = iArr[i4 - 1];
            String[] strArr = this.ar;
            strArr[i4] = strArr[i4 - 1];
            String[] strArr2 = this.aq;
            strArr2[i4] = strArr2[i4 - 1];
            List<Integer>[] listArr = this.H;
            listArr[i4] = listArr[i4 - 1];
            String[] strArr3 = this.as;
            strArr3[i4] = strArr3[i4 - 1];
            int[] iArr2 = this.at;
            iArr2[i4] = iArr2[i4 - 1];
            int[] iArr3 = this.Q;
            iArr3[i4] = iArr3[i4 - 1];
        }
        String a2 = org.necrotic.client.f.a.a.a(str);
        this.aw[0] = 2;
        this.ar[0] = str2;
        this.aq[0] = a2.trim();
        this.H[0] = list;
        this.as[0] = str3;
        this.Q[0] = i2;
        this.at[0] = i3;
    }

    public final void a(String str, int i2, String str2) {
        if (i2 == 0 && this.aC != -1) {
            this.aj = str;
            this.bQ = 0;
        }
        if (this.ak == -1) {
            G = true;
        }
        for (int i3 = 499; i3 > 0; i3--) {
            int[] iArr = this.aw;
            iArr[i3] = iArr[i3 - 1];
            String[] strArr = this.ar;
            strArr[i3] = strArr[i3 - 1];
            String[] strArr2 = this.aq;
            strArr2[i3] = strArr2[i3 - 1];
            List<Integer>[] listArr = this.H;
            listArr[i3] = listArr[i3 - 1];
            String[] strArr3 = this.as;
            strArr3[i3] = strArr3[i3 - 1];
            int[] iArr2 = this.at;
            iArr2[i3] = iArr2[i3 - 1];
            int[] iArr3 = this.Q;
            iArr3[i3] = iArr3[i3 - 1];
        }
        this.aw[0] = i2;
        this.ar[0] = str2;
        this.aq[0] = str.trim();
        this.H[0] = new ArrayList();
        this.as[0] = "";
        this.Q[0] = 0;
        this.at[0] = 0;
    }

    @Override // org.necrotic.client.r
    public final void m() {
        this.jl = true;
    }

    private void ar() {
        if (this.hu != null) {
            return;
        }
        this.bU = null;
        this.ap = null;
        this.aM = null;
        this.bA = null;
        this.aH = null;
        this.hv = null;
        this.hu = new org.necrotic.client.f.d(509, 171, j());
        org.necrotic.client.f.c.e();
        this.jc = new org.necrotic.client.f.d(s(), t(), j());
        org.necrotic.client.f.c.e();
        new org.necrotic.client.f.d(203, 238, j());
        org.necrotic.client.f.c.e();
        new org.necrotic.client.f.d(74, 94, j());
        org.necrotic.client.f.c.e();
        if (this.je != null) {
            ar();
            System.gc();
        }
        this.jl = true;
    }

    private void as() {
        if (this.ap != null) {
            return;
        }
        an();
        this.bU = null;
        this.hu = null;
        this.jc = null;
        this.ap = new org.necrotic.client.f.d(516, 165, j());
        this.aM = new org.necrotic.client.f.d(249, 168, j());
        org.necrotic.client.f.c.e();
        if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
            F.a(14).e(0, 0);
        }
        this.bA = new org.necrotic.client.f.d(250, 335, j());
        this.aH = new org.necrotic.client.f.d(512, 334, j());
        org.necrotic.client.f.c.e();
        this.hv = new org.necrotic.client.f.d(249, 45, j());
        this.jl = true;
    }

    private void at() {
        try {
            if (this.hI != null) {
                this.hI.b();
            }
        } catch (Exception unused) {
        }
        if (org.necrotic.a.d) {
            boolean z2 = false;
            Account[] accounts = this.eQ.getAccounts();
            int length = accounts.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Account account = accounts[i2];
                if (account == null || !account.getUsername().equalsIgnoreCase(D)) {
                    i2++;
                } else {
                    account.setIDKHead(t.w[0] < 1164 ? this.dJ[0] == 0 ? C[0] : this.dJ[0] : 0);
                    account.setHelmet(t.w[0] >= 1164 ? t.w[0] - 512 : 0);
                    account.setJaw(C[1]);
                    account.setGender(t.f);
                    account.setPassword(this.bM);
                    z2 = true;
                }
            }
            if (!z2) {
                this.eQ.addAccount(new Account(D, this.bM, t.f, t.w[0] >= 1164 ? t.w[0] - 512 : 0, t.w[0] < 1164 ? this.dJ[0] == 0 ? C[0] : this.dJ[0] : 0, this.dJ[1] == 0 ? C[1] : this.dJ[1]), false);
            } else {
                this.eQ.updateInterface();
            }
            this.eQ.save();
        }
        this.ep.a = null;
        this.eo.a(null);
        this.jT = null;
        this.jH = false;
        this.ip = new String[]{""};
        A = false;
        this.er = false;
        this.hI = null;
        aL = false;
        this.ir = 0;
        this.iq = 0;
        az();
        this.jm.c();
        for (int i3 = 0; i3 < 4; i3++) {
            this.fX[i3].a();
        }
        System.gc();
        this.hP = -1;
        this.iM = -1;
        this.iP = 0;
        if (!org.necrotic.client.f.b.a.j()) {
            ay();
        }
        k(0, 0);
        org.necrotic.client.a.a.a(q);
    }

    @Override // org.necrotic.client.r, java.lang.Runnable
    public void run() {
        boolean z2 = this.fc;
        super.run();
    }

    private void au() {
        if (this.ak != -1) {
            this.ak = -1;
            G = true;
        }
        if (this.aJ != 0) {
            this.aJ = 0;
            G = true;
        }
        u = 21172;
        this.aK = 3213;
        cv = true;
        this.ev = false;
    }

    private void l(int i2, int i3) {
        this.dI[i2] = i3;
        if (this.bO[i2] != i3) {
            this.bO[i2] = i3;
            E(i2);
            if (this.aC != -1) {
                G = true;
            }
        }
    }

    public static void a(boolean z2) {
        G = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.necrotic.client.aa, java.lang.Exception] */
    public static void a(String str, int i2) {
        ?? r0;
        try {
            r0 = aa.u[i2];
            r0.an = str;
            if (r0.aK == 9) {
                r0.aJ = str;
            }
            if (r0.ax != null && r0.ax.length() > 0) {
                r0.ax = "";
            }
        } catch (Exception unused) {
            r0.getStackTrace();
        }
    }

    private void aw() {
        this.hG = 0;
        this.hH = 0;
        this.jj = 0;
        this.bC = 0;
        this.bc = 0;
        this.bd = 0;
    }

    private void m(int i2, int i3) {
        org.necrotic.client.c.b.a aVar = this.aI[this.bp][i2][i3];
        if (aVar == null) {
            this.jm.e(this.bp, i2, i3);
            return;
        }
        int i4 = -99999999;
        org.necrotic.client.j.d dVar = null;
        org.necrotic.client.c.b.b e2 = aVar.e();
        while (true) {
            org.necrotic.client.j.d dVar2 = (org.necrotic.client.j.d) e2;
            if (dVar2 == null) {
                break;
            }
            org.necrotic.client.c.a.i a2 = org.necrotic.client.c.a.i.a(dVar2.d);
            int i5 = a2.M;
            if (a2.I) {
                i5 *= dVar2.c + 1;
            }
            if (i5 > i4) {
                i4 = i5;
                dVar = dVar2;
            }
            e2 = aVar.f();
        }
        aVar.b(dVar);
        org.necrotic.client.j.d dVar3 = null;
        org.necrotic.client.j.d dVar4 = null;
        org.necrotic.client.c.b.b e3 = aVar.e();
        while (true) {
            org.necrotic.client.j.d dVar5 = (org.necrotic.client.j.d) e3;
            if (dVar5 != null) {
                if (dVar5.d != dVar.d && dVar3 == null) {
                    dVar3 = dVar5;
                }
                if (dVar5.d != dVar.d && dVar5.d != dVar3.d && dVar4 == null) {
                    dVar4 = dVar5;
                }
                e3 = aVar.f();
            } else {
                this.jm.a(i2, i2 + (i3 << 7) + 1610612736, dVar3, b(this.bp, (i3 << 7) + 64, (i2 << 7) + 64), dVar4, dVar, this.bp, i3);
                return;
            }
        }
    }

    @Override // org.necrotic.client.r
    public final void a(Runnable runnable, int i2) {
        if (i2 > 10) {
            i2 = 10;
        }
        if (ae.d != null) {
            ae.a(runnable, i2);
        } else {
            super.a(runnable, i2);
        }
    }

    public final void g(int i2) {
        this.jy = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v199, types: [org.necrotic.client.f.a.c[]] */
    /* JADX WARN: Type inference failed for: r0v200, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v236, types: [boolean, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v238, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v239 */
    /* JADX WARN: Type inference failed for: r0v297 */
    /* JADX WARN: Type inference failed for: r0v378, types: [org.necrotic.client.c.a] */
    @Override // org.necrotic.client.r
    final void n() {
        int[] iArr;
        String str;
        t.a();
        this.jE = true;
        boolean z2 = ae.g;
        if (ae.d != null) {
            ae.d.getDocumentBase().getHost().toLowerCase();
        }
        for (int i2 = 0; i2 < this.fH.length; i2++) {
            File file = new File(ae.b() + i2 + ".png");
            if (!file.exists() && !org.necrotic.client.h.b.a("https://tarn-rsps.com/resources/" + i2 + ".png", ae.b())) {
                org.necrotic.client.h.b.a("https://tarn-rsps.com/resources/" + i2 + ".png", ae.b());
            }
            try {
                this.fH[i2] = ImageIO.read(file);
            } catch (Exception unused) {
            }
        }
        Thread thread = new Thread(() -> {
            while (true) {
                ?? r0 = this.jE;
                if (r0 != 0) {
                    try {
                        r0 = f.a;
                        if (r0 == 0) {
                            this.jy += 2;
                            if (this.jy > 100) {
                                this.jy = 100;
                                boolean z3 = this.jE;
                            }
                        }
                        Graphics graphics = cn == null ? getGraphics() : cn.getGraphics();
                        Graphics graphics2 = graphics;
                        if (graphics != null) {
                            if (this.fH[0] != null) {
                                graphics2.drawImage(this.fH[0], 0, 0, (ImageObserver) null);
                            }
                            if (this.jy > 0) {
                                int i3 = ((this.jy * 790) / 560) << 2;
                                int i4 = i3;
                                if (i3 > 559) {
                                    i4 = 559;
                                }
                                if (this.fH[3] != null) {
                                    graphics2.drawImage(this.fH[3], i4 + 72 + 20, 280, (ImageObserver) null);
                                }
                                graphics2.setFont(new Font("Serif", 1, 16));
                                int i5 = i4 + 80;
                                if (this.jy < 10) {
                                    i5 += 4;
                                } else if (this.jy == 100) {
                                    i5 -= 4;
                                }
                                graphics2.drawString(new StringBuilder().append(this.jy).toString(), i5 + 20, 307);
                                if (this.fH[2] != null) {
                                    graphics2.drawImage(this.fH[2].getSubimage(0, 0, i4 + 20, 32), 89, 323, (ImageObserver) null);
                                }
                            }
                        }
                        Thread.sleep(50L);
                    } catch (Exception unused2) {
                        r0.printStackTrace();
                    }
                } else {
                    return;
                }
            }
        });
        thread.setPriority(10);
        thread.start();
        if (f.a()) {
            if (this.bX != null) {
                this.bX.c();
            }
            this.jy = 0;
        }
        if (ae.a != null) {
            for (int i3 = 0; i3 < 6; i3++) {
                this.L[i3] = new m(ae.a, ae.b[i3], i3 + 1);
            }
        }
        File file2 = new File(ae.b() + "/Shop/");
        if (!file2.exists()) {
            file2.mkdir();
        }
        for (int i4 = 0; i4 < 13; i4++) {
            this.jR[i4] = new org.necrotic.client.f.e("/Shop/currency".concat(String.valueOf(i4)));
        }
        for (int i5 = 0; i5 < 6; i5++) {
            this.jV[i5] = new org.necrotic.client.f.e("/Shop/box".concat(String.valueOf(i5)));
        }
        try {
            this.je = a(1, "title", this.dZ[1]);
            this.bx = new org.necrotic.client.f.a.c(false, "p11_full", this.je);
            this.bk = new org.necrotic.client.f.a.c(false, "p12_full", this.je);
            this.jv = new org.necrotic.client.f.a.c(false, "hit_full", this.je);
            this.jw = new org.necrotic.client.f.a.c(true, "critical_full", this.je);
            this.au = new org.necrotic.client.f.a.c(false, "b12_full", this.je);
            this.av = new org.necrotic.client.f.a.c(true, "q8_full", this.je);
            this.bg = new org.necrotic.client.f.a.a(false, "p11_full", this.je);
            this.bh = new org.necrotic.client.f.a.a(false, "p12_full", this.je);
            this.bi = new org.necrotic.client.f.a.a(false, "b12_full", this.je);
            this.bj = new org.necrotic.client.f.a.a(true, "q8_full", this.je);
            ar();
            System.gc();
            cF = a(q);
            cC = new org.necrotic.client.n.b.a(l);
            org.necrotic.client.c.a a2 = a(2, "config", this.dZ[2]);
            org.necrotic.client.c.a a3 = a(3, "interface", this.dZ[3]);
            org.necrotic.client.c.a a4 = a(4, "media", this.dZ[4]);
            org.necrotic.client.c.a a5 = a(6, "textures", this.dZ[6]);
            a(7, "wordenc", this.dZ[7]);
            org.necrotic.client.c.a a6 = a(8, "sounds", this.dZ[8]);
            this.hF = new byte[4][104][104];
            this.ij = new int[4][105][105];
            this.jm = new org.necrotic.client.n.m(this.ij);
            for (int i6 = 0; i6 < 4; i6++) {
                this.fX[i6] = new org.necrotic.client.n.b();
            }
            this.bb = new org.necrotic.client.f.e(512, 512);
            org.necrotic.client.c.a a7 = a(5, "versionlist", this.dZ[5]);
            this.bo = new org.necrotic.client.c.c.a();
            this.bo.a(a7, this);
            this.bo.b();
            org.necrotic.client.n.d.a(this.bo);
            z();
            this.fz = new org.necrotic.client.f.e(a4, "mapfunction", 5);
            F.a(ae.b());
            this.it = new org.necrotic.client.f.a(a4, "mapback", 0);
            this.iu = new org.necrotic.client.f.e(a4, "mapedge", 0);
            org.necrotic.client.f.e eVar = this.iu;
            eVar.a();
            int[] iArr2 = new int[eVar.v * eVar.w];
            for (int i7 = 0; i7 < eVar.e; i7++) {
                System.arraycopy(eVar.c, i7 * eVar.d, iArr2, i7 + (eVar.u * eVar.v) + eVar.f, eVar.d);
            }
            eVar.c = iArr2;
            eVar.d = eVar.v;
            eVar.e = eVar.w;
            eVar.f = 0;
            eVar.u = 0;
            for (int i8 = 0; i8 < 100; i8++) {
                try {
                    this.ix[i8] = new org.necrotic.client.f.a(a4, "mapscene", i8);
                } catch (Exception unused2) {
                }
            }
            for (int i9 = 0; i9 < 100; i9++) {
                if (i9 < 75) {
                    try {
                        this.iw[i9] = new org.necrotic.client.f.e(a4, "mapfunction", i9);
                        continue;
                    } catch (Exception unused3) {
                    }
                } else {
                    this.iw[i9] = new org.necrotic.client.f.e(a4, "mapfunctions2", i9 - 76);
                    continue;
                }
            }
            for (int i10 = 0; i10 <= 19; i10++) {
                try {
                    this.ie[i10] = new org.necrotic.client.f.e(a4, "headicons_prayer", i10);
                } catch (Exception unused4) {
                }
            }
            for (int i11 = 0; i11 < 7; i11++) {
                this.iV[i11] = new org.necrotic.client.f.e(a4, "headicons_pk", i11);
            }
            this.aT = new org.necrotic.client.f.e(a4, "mapmarker", 0);
            this.aU = new org.necrotic.client.f.e(a4, "mapmarker", 1);
            for (int i12 = 0; i12 < 8; i12++) {
                this.hK[i12] = new org.necrotic.client.f.e(a4, "cross", i12);
            }
            this.aP = new org.necrotic.client.f.e(a4, "mapdots", 0);
            this.aQ = new org.necrotic.client.f.e(a4, "mapdots", 1);
            this.aR = new org.necrotic.client.f.e(a4, "mapdots", 2);
            this.aO = new org.necrotic.client.f.e(a4, "mapdots", 3);
            this.aS = new org.necrotic.client.f.e(a4, "mapdots", 4);
            this.el = new org.necrotic.client.f.e("alertback");
            this.em = new org.necrotic.client.f.e("alertborder");
            this.en = new org.necrotic.client.f.e("alertborderh");
            this.T.add(new org.necrotic.client.f.c.c(2378, 4014, new org.necrotic.client.f.e(a4, "mapfunction", 12)));
            this.T.add(new org.necrotic.client.f.c.c(2378, 4028, new org.necrotic.client.f.e(a4, "mapfunction", 12)));
            this.T.add(new org.necrotic.client.f.c.c(3663, 2981, new org.necrotic.client.f.e(a4, "mapfunction", 5)));
            this.T.add(new org.necrotic.client.f.c.c(3674, 2970, new org.necrotic.client.f.e(a4, "mapfunction", 51)));
            this.T.add(new org.necrotic.client.f.c.c(3676, 2989, new org.necrotic.client.f.e(a4, "mapfunction", 54)));
            this.T.add(new org.necrotic.client.f.c.c(3685, 2977, new org.necrotic.client.f.e(a4, "mapfunction", 0)));
            this.T.add(new org.necrotic.client.f.c.c(2574, 3880, new org.necrotic.client.f.e(a4, "mapfunction", 5)));
            this.T.add(new org.necrotic.client.f.c.c(2550, 3858, new org.necrotic.client.f.e(a4, "mapfunction", 5)));
            this.T.add(new org.necrotic.client.f.c.c(2557, 3886, new org.necrotic.client.f.e(a4, "mapfunction", 34)));
            d[] dVarArr = new d[10];
            f0do = dVarArr;
            dVarArr[0] = new d(ae.b() + "gifs/diamond.gif");
            f0do[1] = new d(ae.b() + "gifs/emerald.gif");
            f0do[2] = new d(ae.b() + "gifs/onyx.gif");
            f0do[3] = new d(ae.b() + "gifs/ruby.gif");
            f0do[4] = new d(ae.b() + "gifs/sapphire.gif");
            f0do[5] = new d(ae.b() + "gifs/zenyte.gif");
            f0do[6] = new d(ae.b() + "gifs/mod.gif");
            f0do[7] = new d(ae.b() + "gifs/admin.gif");
            f0do[8] = new d(ae.b() + "gifs/cm.gif");
            f0do[9] = new d(ae.b() + "gifs/support.gif");
            org.necrotic.client.f.c.h.a = F.a(3363);
            org.necrotic.client.f.c.h.b = F.a(3338);
            this.aN = F.a(398);
            this.iv = F.a(297);
            for (int i13 = 0; i13 < 12; i13++) {
                this.ef[i13] = new org.necrotic.client.f.e(a4, "scrollpart", i13);
            }
            for (int i14 = 0; i14 < 6; i14++) {
                this.ee[i14] = new org.necrotic.client.f.e(a4, "scrollbar", i14);
            }
            for (int i15 = 0; i15 < this.P.length; i15++) {
                this.P[i15] = F.a(i15 + 827);
            }
            this.P[15] = F.a(1509);
            this.P[16] = F.a(1508);
            this.iI = F.a(1025);
            this.iJ = F.a(1025);
            org.necrotic.client.f.e eVar2 = new org.necrotic.client.f.e(a4, "screenframe", 0);
            this.il = new org.necrotic.client.f.d(eVar2.d, eVar2.e, j());
            eVar2.h();
            org.necrotic.client.f.e eVar3 = new org.necrotic.client.f.e(a4, "screenframe", 1);
            this.jg = new org.necrotic.client.f.d(eVar3.d, eVar3.e, j());
            eVar3.h();
            org.necrotic.client.f.e eVar4 = new org.necrotic.client.f.e(a4, "screenframe", 2);
            this.iQ = new org.necrotic.client.f.d(eVar4.d, eVar4.e, j());
            eVar4.h();
            org.necrotic.client.f.e eVar5 = new org.necrotic.client.f.e(a4, "mapedge", 0);
            new org.necrotic.client.f.d(eVar5.d, eVar5.e, j());
            eVar5.h();
            this.az = new org.necrotic.client.f.e(a4, "compass", 0);
            this.fy = ae.h;
            org.necrotic.client.n.l.a(a5);
            org.necrotic.client.n.l.a(0.6d);
            org.necrotic.client.n.l.h();
            org.necrotic.client.c.a.a.a(a2);
            org.necrotic.client.c.a.k.a(a2);
            org.necrotic.client.c.a.d.a(a2);
            org.necrotic.client.c.a.d.b(a2);
            org.necrotic.client.c.a.l.a(a2);
            org.necrotic.client.c.a.i.a(a2);
            org.necrotic.client.c.a.j.a(a2);
            org.necrotic.client.c.a.e.a(a2);
            org.necrotic.client.c.a.m.a(a2);
            org.necrotic.client.c.a.o.a(a2);
            org.necrotic.client.c.a.n.a(a2);
            org.necrotic.client.c.a.i.d = de;
            c.b();
            for (int i16 : org.necrotic.a.c) {
                System.out.println("Started repacking index " + i16 + ".");
                int length = new File(f(i16, -1)).listFiles().length;
                File[] listFiles = new File(f(i16, -1)).listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    for (int i17 = 0; i17 < length; i17++) {
                        try {
                            File file3 = new File(listFiles[i17].toString());
                            file3.getName();
                            int lastIndexOf = file3.getName().lastIndexOf(46);
                            if (lastIndexOf > 0 && lastIndexOf <= file3.getName().length() - 2) {
                                str = file3.getName().substring(0, lastIndexOf);
                            } else {
                                str = "";
                            }
                            int parseInt = Integer.parseInt(str);
                            byte[] g2 = g(i16, parseInt);
                            if (g2 != null && g2.length > 0) {
                                this.L[i16].a(g2.length, g2, parseInt);
                                System.out.println("Repacked Archive: " + i16 + " File: " + parseInt + ".");
                            } else {
                                System.out.println("Unable to locate index " + parseInt + ".");
                            }
                        } catch (Exception unused5) {
                            System.out.println("Error packing cache index " + i16 + ".");
                        }
                    }
                    System.out.println("Finished repacking " + i16 + ".");
                }
            }
            if (!dg) {
                org.necrotic.client.n.b.p.a(new org.necrotic.client.g.a(a6.a("sounds.dat")));
            }
            ?? r0 = {this.bx, this.bk, this.au, this.av};
            try {
                org.necrotic.client.f.a.a[] aVarArr = {this.bg, this.bh, this.bi};
                r0 = a3;
                aa.a((org.necrotic.client.c.a) r0, (org.necrotic.client.f.a.c[]) r0, a4);
            } catch (Exception unused6) {
                r0.printStackTrace();
            }
            for (int i18 = 0; i18 < 33; i18++) {
                int i19 = 999;
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    if (i21 < 34) {
                        try {
                            if (this.it.c[i21 + (i18 * this.it.e)] == 0) {
                                if (i19 == 999) {
                                    i19 = i21;
                                }
                            } else if (i19 != 999) {
                                i20 = i21;
                                break;
                            }
                            i21++;
                        } catch (Exception unused7) {
                        }
                    }
                }
                this.I[i18] = i19;
                this.J[i18] = i20 - i19;
            }
            for (int i22 = 5; i22 < 156; i22++) {
                int i23 = 999;
                int i24 = 0;
                int i25 = 20;
                while (true) {
                    if (i25 >= 172) {
                        break;
                    }
                    if (this.it.c[i25 + (i22 * this.it.e)] == 0 && (i25 > 34 || i22 > 34)) {
                        if (i23 == 999) {
                            i23 = i25;
                        }
                    } else if (i23 != 999) {
                        i24 = i25;
                        break;
                    }
                    i25++;
                }
                this.M[i22 - 5] = i23 - 20;
                this.N[i22 - 5] = i24 - i23;
                if (this.N[i22 - 5] == -20) {
                    this.N[i22 - 5] = 152;
                }
            }
            w.a();
            aB();
            org.necrotic.client.j.g.c = this;
            org.necrotic.client.c.a.k.b = this;
            org.necrotic.client.c.a.j.d = this;
            Client client = q;
            File file4 = Paths.get(ae.c(), "/settings.json").toFile();
            ?? exists = file4.exists();
            if (exists != 0) {
                try {
                    FileReader fileReader = new FileReader(file4);
                    ?? r02 = 0;
                    try {
                        JsonParser jsonParser = new JsonParser();
                        new GsonBuilder().create();
                        JsonObject jsonObject = (JsonObject) jsonParser.parse(fileReader);
                        if (jsonObject.has("username")) {
                            D = jsonObject.get("username").getAsString();
                        }
                        if (jsonObject.has("password")) {
                            q.bM = jsonObject.get("password").getAsString();
                        }
                        if (jsonObject.has("save-accounts")) {
                            org.necrotic.a.d = jsonObject.get("save-accounts").getAsBoolean();
                        }
                        if (jsonObject.has("new-f-keys")) {
                            org.necrotic.a.o = jsonObject.get("new-f-keys").getAsBoolean();
                        }
                        if (jsonObject.has("new-hp-bars")) {
                            org.necrotic.a.j = jsonObject.get("new-hp-bars").getAsBoolean();
                        }
                        if (jsonObject.has("new-hitmark")) {
                            org.necrotic.a.h = jsonObject.get("new-hitmark").getAsBoolean();
                        }
                        if (jsonObject.has("constitution")) {
                            org.necrotic.a.i = jsonObject.get("constitution").getAsBoolean();
                        }
                        if (jsonObject.has("new-cursor")) {
                            org.necrotic.a.n = jsonObject.get("new-cursor").getAsBoolean();
                        }
                        if (jsonObject.has("display-hp-above-head")) {
                            org.necrotic.a.e = jsonObject.get("display-hp-above-head").getAsBoolean();
                        }
                        if (jsonObject.has("display-username-above-head")) {
                            org.necrotic.a.f = jsonObject.get("display-username-above-head").getAsBoolean();
                        }
                        if (jsonObject.has("gameframe")) {
                            org.necrotic.client.d.a.a = jsonObject.get("gameframe").getAsBoolean() ? a.EnumC0025a.FRAME_554 : a.EnumC0025a.FRAME_525;
                        }
                        if (jsonObject.has("highlight-username")) {
                            org.necrotic.a.m = jsonObject.get("highlight-username").getAsBoolean();
                        }
                        if (jsonObject.has("high-detail")) {
                            if (jsonObject.get("high-detail").getAsBoolean()) {
                                E();
                            } else {
                                D();
                            }
                        }
                        if (jsonObject.has("split-chat-color")) {
                            client.R = jsonObject.get("split-chat-color").getAsInt();
                        }
                        if (jsonObject.has("clan-chat-color")) {
                            client.R = jsonObject.get("clan-chat-color").getAsInt();
                        }
                        if (jsonObject.has("split-chat")) {
                            int[] iArr3 = client.bO;
                            int[] iArr4 = client.bO;
                            int asInt = jsonObject.get("split-chat").getAsInt();
                            iArr4[287] = asInt;
                            iArr3[502] = asInt;
                            q.E(287);
                        }
                        if (jsonObject.has("ground-text")) {
                            org.necrotic.a.q = jsonObject.get("ground-text").getAsBoolean();
                        }
                        if (jsonObject.has("quick-prayers")) {
                            String asString = jsonObject.get("quick-prayers").getAsString();
                            for (int i26 = 0; i26 < asString.length(); i26++) {
                                int i27 = i26;
                                client.bJ[i26] = Integer.parseInt(asString.substring(i27, i27 + 1));
                            }
                        }
                        if (jsonObject.has("quick-curses")) {
                            String asString2 = jsonObject.get("quick-curses").getAsString();
                            int i28 = 0;
                            while (true) {
                                r02 = i28;
                                if (r02 >= asString2.length()) {
                                    break;
                                }
                                int i29 = i28;
                                client.bK[i28] = Integer.parseInt(asString2.substring(i29, i29 + 1));
                                i28++;
                            }
                        }
                        if (0 != 0) {
                            try {
                                fileReader.close();
                            } catch (Throwable th) {
                                r02.addSuppressed(th);
                            }
                        } else {
                            fileReader.close();
                        }
                    } catch (Throwable th2) {
                        Throwable th3 = r02;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            if (th3 != null) {
                                try {
                                    fileReader.close();
                                } catch (Throwable th5) {
                                    th3.addSuppressed(th5);
                                }
                            } else {
                                fileReader.close();
                            }
                            throw th4;
                        }
                    }
                } catch (Exception unused8) {
                    exists.printStackTrace();
                }
            }
            try {
                this.kb = org.necrotic.client.k.a.a();
            } catch (Exception unused9) {
            }
            cw = l.a();
            this.jE = false;
            if (org.necrotic.a.n) {
                super.a(org.necrotic.client.f.b.CURSOR_0);
            }
        } catch (Exception e2) {
            this.jE = false;
            e2.printStackTrace();
            ae.a("loaderror " + this.gs);
            this.im = true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: ?: MOVE  (r2 I:??) = (r3 I:??), block:B:23:0x006e */
    private void ax() {
        int i2;
        String str = null;
        for (int i3 = 0; i3 < 100; i3++) {
            if (this.aq[i3] != null && ((i2 = this.aw[i3]) == 3 || i2 == 7)) {
                str = this.ar[i3];
                break;
            }
        }
        if (str == null) {
            a("You haven't received any messages to which you can reply.", 0, "");
            return;
        }
        if (str.indexOf("@") == 0) {
            str = str.substring(d(str));
        }
        if (str.indexOf("@") == 0) {
            str = str.substring(d(str));
        }
        long b2 = org.necrotic.client.f.a.b.b(str.trim());
        if (b2 != -1) {
            G = true;
            this.aJ = 0;
            this.ba = true;
            this.bu = "";
            this.hY = 3;
            this.gf = b2;
            this.bv = "Enter message to send to " + org.necrotic.client.f.a.b.a(org.necrotic.client.f.a.b.a(b2));
        }
    }

    private void ay() {
        this.ib = org.necrotic.client.f.b.a.j() ? 512 : s();
        this.ic = org.necrotic.client.f.b.a.j() ? 334 : t();
        if (this.aH == null || this.aH.a != this.ib || this.aH.b != this.ic) {
            this.aH = new org.necrotic.client.f.d(this.ib, this.ic, j());
        }
        aB();
    }

    private void d(boolean z2) {
        if (z2) {
            this.jA = true;
            (aL ? this.aH : this.jc).a();
            return;
        }
        this.jA = false;
        (aL ? this.aH : this.jc).a(cn.getGraphics(), org.necrotic.client.f.b.a.j() ? 4 : this.eY, this.eZ);
    }

    private void a(a.EnumC0026a enumC0026a) {
        if (this.ce) {
            org.necrotic.client.f.b.a.a(enumC0026a);
            if (enumC0026a == a.EnumC0026a.FIXED) {
                l(652, 0);
                this.eY = 4;
                this.eZ = 4;
            } else if (enumC0026a == a.EnumC0026a.RESIZABLE) {
                l(652, 2);
                this.eY = 0;
                this.eZ = 0;
            } else {
                l(652, 1);
                this.eY = 0;
                this.eZ = 0;
            }
        } else if (org.necrotic.client.f.b.a.a() != enumC0026a) {
            d(true);
            super.h(0);
            if (enumC0026a == a.EnumC0026a.FIXED) {
                org.necrotic.client.f.b.a.a(enumC0026a);
                this.eY = 4;
                this.eZ = 4;
                this.cf = Constants.GAME_FIXED_WIDTH;
                this.cg = Constants.GAME_FIXED_HEIGHT;
                p = Constants.GAME_FIXED_WIDTH;
                o = Constants.GAME_FIXED_HEIGHT;
                l(652, 0);
                b(false, Constants.GAME_FIXED_WIDTH, Constants.GAME_FIXED_HEIGHT, false);
                this.jl = true;
                e = 0;
            } else if (enumC0026a == a.EnumC0026a.RESIZABLE) {
                org.necrotic.client.f.b.a.a(enumC0026a);
                this.eY = 0;
                this.eZ = 0;
                this.cg = -1;
                this.cf = -1;
                l(652, 2);
                b(false, 800, Constants.GAME_TICK_LENGTH, true);
                e = 480;
            } else {
                org.necrotic.client.f.b.a.a(a.EnumC0026a.FULLSCREEN);
                this.eY = 0;
                this.eZ = 0;
                l(652, 1);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                p = screenSize.width;
                o = screenSize.height;
                b(true, screenSize.width, screenSize.height, false);
                this.cg = -1;
                this.cf = -1;
                cb = screenSize.width;
                ca = screenSize.height;
                e = 480;
            }
            if (enumC0026a == a.EnumC0026a.FIXED) {
                G = true;
            }
            if (!aL) {
                ar();
            } else {
                as();
            }
            this.bN.a(false);
            this.bz.a(false);
            ay();
            d(false);
        }
    }

    private static void az() {
        org.necrotic.client.c.a.k.d.a();
        org.necrotic.client.c.a.k.c.a();
        org.necrotic.client.c.a.j.e.a();
        org.necrotic.client.c.a.i.f.a();
        org.necrotic.client.c.a.i.e.a();
        org.necrotic.client.e.a.a.c.a();
        org.necrotic.client.c.a.m.a.a();
        p.a.clear();
        org.necrotic.client.c.a.k.z.clear();
        org.necrotic.client.c.a.i.h.clear();
        org.necrotic.client.c.a.j.f.clear();
        F.a();
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x017c: INVOKE  (r0 I:java.lang.Exception) type: VIRTUAL call: java.lang.Exception.printStackTrace():void, block:B:100:0x017c */
    private void E(int i2) {
        Exception printStackTrace;
        try {
            int i3 = 0;
            if (i2 < org.necrotic.client.c.a.o.a().length) {
                i3 = org.necrotic.client.c.a.o.a()[i2].b();
            }
            if (i3 == 0) {
                return;
            }
            int i4 = this.bO[i2];
            if (i3 == 1) {
                if (i4 == 1) {
                    org.necrotic.client.n.l.a(0.9d);
                } else if (i4 == 2) {
                    org.necrotic.client.n.l.a(0.8d);
                } else if (i4 == 3) {
                    org.necrotic.client.n.l.a(0.7d);
                } else if (i4 == 4) {
                    org.necrotic.client.n.l.a(0.6d);
                }
                org.necrotic.client.c.a.i.e.a();
                org.necrotic.client.c.a.i.i.clear();
                this.jl = true;
            } else if (i3 == 3) {
                int i5 = 0;
                if (i4 == 0) {
                    i5 = 255;
                } else if (i4 == 1) {
                    i5 = 192;
                } else if (i4 == 2) {
                    i5 = 128;
                } else if (i4 == 3) {
                    i5 = 64;
                } else if (i4 == 4) {
                    i5 = 0;
                }
                if (i5 != this.iK) {
                    if (this.iK != 0 || this.hP == -1) {
                        if (i5 != 0) {
                            l(i5);
                        } else {
                            B();
                            this.iP = 0;
                        }
                    } else {
                        j(i5, this.hP);
                        this.iP = 0;
                    }
                    this.iK = i5;
                }
            } else if (i3 == 4) {
                if (i4 == 0) {
                    dl = 127;
                } else if (i4 == 1) {
                    dl = 96;
                } else if (i4 == 2) {
                    dl = 64;
                } else if (i4 == 3) {
                    dl = 32;
                } else if (i4 == 4) {
                    dl = 0;
                }
            } else if (i3 == 5) {
                this.gL = i4;
            } else if (i3 == 6) {
                this.gJ = i4;
            } else if (i3 == 7) {
                this.iS = !this.iS;
                this.eb.b.a(this.iS);
            } else if (i3 == 8) {
                this.by = i4;
                G = true;
            } else if (i3 == 9) {
                this.ha = i4;
            }
        } catch (Exception unused) {
            printStackTrace.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v102 */
    /* JADX WARN: Type inference failed for: r4v103 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v68, types: [int] */
    /* JADX WARN: Type inference failed for: r4v69, types: [org.necrotic.client.j.c] */
    private void aA() {
        boolean z2;
        org.necrotic.client.c.b.b bVar;
        int i2;
        int i3;
        int i4;
        double d2;
        int i5 = 0;
        for (int i6 = -1; i6 < this.br + this.bm; i6++) {
            try {
                if (i6 == -1) {
                    bVar = t;
                } else if (i6 < this.br) {
                    bVar = this.bq[this.bs[i6]];
                } else {
                    bVar = this.bl[this.bn[i6 - this.br]];
                }
                if (bVar != null && ((org.necrotic.client.j.c) bVar).d()) {
                    if (bVar instanceof org.necrotic.client.j.e) {
                        org.necrotic.client.c.a.j jVar = ((org.necrotic.client.j.e) bVar).c;
                        a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av + 5);
                        if (this.iY >= 0) {
                            if (jVar.w == 6537) {
                                F.a(607).e(this.iY - 12, this.iZ - 30);
                            }
                            if (jVar.w == 8000 || jVar.w == 8002) {
                                F.a(134).e(this.iY - 12, this.iZ - 30);
                            }
                            if (jVar.w == 13738) {
                                F.a(1419).e(this.iY - 12, this.iZ - 30);
                            }
                            if (jVar.w == 1086) {
                                F.a(638).e(this.iY - 12, this.iZ - 40);
                            }
                            if (jVar.w == 1085) {
                                F.a(641).e(this.iY - 12, this.iZ - 40);
                            }
                            if (jVar.w == 1084) {
                                F.a(625).e(this.iY - 12, this.iZ - 40);
                            }
                            if (jVar.w == 3777) {
                                F.a(857).e(this.iY - 4, this.iZ - 16);
                            }
                            if (jVar.w == 585) {
                                F.a(915).e(this.iY - 4, this.iZ - 32);
                            }
                            if (jVar.w == 688) {
                                F.a(916).e(this.iY - 4, this.iZ - 32);
                            }
                            if (jVar.w == 125) {
                                F.a(917).e(this.iY - 4, this.iZ - 32);
                            }
                            if (jVar.w == 1821) {
                                F.a(869).e(this.iY - 4, this.iZ - 5);
                            }
                            if (jVar.w == 925 || jVar.w == 1988) {
                                F.a(853).e(this.iY - 4, this.iZ - 16);
                            }
                            if (jVar.w == 198) {
                                F.a(856).e(this.iY - 4, this.iZ - 16);
                            }
                            if (jVar.w == 3306) {
                                F.a(876).e(this.iY - 4, this.iZ - 16);
                            }
                            if (jVar.w == 4651) {
                                F.a(868).e(this.iY - 4, this.iZ - 16);
                            }
                            if (jVar.w == 6692) {
                                F.a(364).e(this.iY - 12, this.iZ - 30);
                            }
                            if (jVar.w == 3112) {
                                F.a(1229).e(this.iY - 12, this.iZ - 30);
                            }
                            if (jVar.w == 605) {
                                F.a(866).e(this.iY - 4, this.iZ - 16);
                            }
                            if (jVar.w == 2579) {
                                F.a(838).e(this.iY - 4, this.iZ - 16);
                            }
                            if (jVar.w == 547) {
                                F.a(870).e(this.iY - 4, this.iZ - 16);
                            }
                        }
                        if (jVar.k != null) {
                            jVar = jVar.c();
                        }
                        if (jVar == null) {
                        }
                    }
                    if (i6 < this.br) {
                        int i7 = (org.necrotic.a.e || org.necrotic.a.f) ? 42 : 32;
                        if (org.necrotic.a.e) {
                            i7 += 20;
                        }
                        if (org.necrotic.a.f) {
                            i7 += 10;
                        }
                        org.necrotic.client.e.a.a aVar = (org.necrotic.client.e.a.a) bVar;
                        int i8 = i2;
                        if (aVar.x >= 0) {
                            a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av + 15);
                            i8 = i2;
                            if (this.iY >= 0) {
                                if (aVar.C) {
                                    int i9 = i7 + 2;
                                    this.iV[0].e(this.iY - 12, this.iZ - i9);
                                    i7 = i9 + 19;
                                }
                                if (aVar.B >= 0 && aVar.B <= 4) {
                                    F.a(1026 + aVar.B).e(this.iY - (aVar.C ? 8 : 10), this.iZ - i7);
                                    i7 += 28;
                                }
                                if (aVar.x < 20) {
                                    this.ie[aVar.x].e(this.iY - 12, this.iZ - i7);
                                    i7 += 29;
                                }
                                i8 = i2;
                                if (org.necrotic.a.f) {
                                    if (aVar.D > 0 && aVar.D <= 2 && a(aVar).startsWith("<col")) {
                                        i8 = 1441536;
                                        this.bg.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iY, this.iZ - 10, 1441536, 0);
                                    } else if (aVar.D > 0 && aVar.D <= 2) {
                                        i8 = 1441536;
                                        this.bg.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iY + 20, this.iZ - 10, 1441536, 0);
                                    } else if (aVar.D == 10) {
                                        i8 = 1441536;
                                        this.bg.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iY + 10, this.iZ - 10, 1441536, 0);
                                    } else if (aVar.D == 6 || aVar.D == 8 || aVar.D == 9) {
                                        i8 = 1441536;
                                        this.bg.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iY + 10, this.iZ - 10, 1441536, 0);
                                    } else if (aVar.D == 7) {
                                        i8 = 1441536;
                                        this.bg.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iY + 85, this.iZ - 10, 1441536, 0);
                                    } else if (aVar.D >= 3 && aVar.D <= 4) {
                                        i8 = 1441536;
                                        this.bg.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iY + 250, this.iZ - 10, 1441536, 0);
                                    } else if (aVar.D == 5) {
                                        i8 = 1441536;
                                        this.bg.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iY + 120, this.iZ - 10, 1441536, 0);
                                    } else if (aVar.D >= 13) {
                                        i8 = 1441536;
                                        this.bg.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iY, this.iZ - 10, 1441536, 0);
                                    } else {
                                        i8 = 1441536;
                                        this.bg.a(aVar.y != null ? aVar.y : "null username", this.iY, this.iZ - 10, 1441536, 0);
                                    }
                                }
                            }
                        }
                        if (i6 >= 0 && this.aa == 10 && this.ab == this.bs[i6]) {
                            a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av + 15);
                            if (this.iY >= 0) {
                                this.ie[7].e(this.iY - 12, this.iZ - i7);
                            }
                        }
                        i3 = i8;
                    } else {
                        org.necrotic.client.c.a.j jVar2 = ((org.necrotic.client.j.e) bVar).c;
                        if (jVar2.q >= 0 && jVar2.q < this.ie.length) {
                            a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av + 15);
                            if (this.iY >= 0) {
                                this.ie[jVar2.q].e(this.iY - 12, this.iZ - 30);
                            }
                        }
                        i3 = i2;
                        if (this.aa == 1) {
                            i3 = i2;
                            if (this.Z == this.bn[i6 - this.br]) {
                                i3 = i2;
                                if (s % 20 < 10) {
                                    a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av + 15);
                                    i3 = i2;
                                    if (this.iY >= 0) {
                                        this.ie[2].e(this.iY - 12, this.iZ - 28);
                                        i3 = i2;
                                    }
                                }
                            }
                        }
                    }
                    if (((org.necrotic.client.j.c) bVar).aH != null && (i6 >= this.br || this.bw == 0 || this.bw == 3 || (this.bw == 1 && e(((org.necrotic.client.e.a.a) bVar).y)))) {
                        a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av);
                        if (this.iY >= 0 && i5 < this.dG) {
                            this.dS[i5] = this.au.b(((org.necrotic.client.j.c) bVar).aH) / 2;
                            this.dR[i5] = this.au.c;
                            this.dP[i5] = this.iY;
                            this.dQ[i5] = this.iZ;
                            this.dT[i5] = ((org.necrotic.client.j.c) bVar).Q;
                            this.dU[i5] = ((org.necrotic.client.j.c) bVar).ac;
                            this.dV[i5] = ((org.necrotic.client.j.c) bVar).aG;
                            int i10 = i5;
                            i5++;
                            this.dX[i10] = ((org.necrotic.client.j.c) bVar).aH;
                            if (this.gJ == 0 && ((org.necrotic.client.j.c) bVar).ac > 0 && ((org.necrotic.client.j.c) bVar).ac <= 3) {
                                int[] iArr = this.dR;
                                iArr[i5] = iArr[i5] + 10;
                                int[] iArr2 = this.dQ;
                                iArr2[i5] = iArr2[i5] + 5;
                            }
                            if (this.gJ == 0 && ((org.necrotic.client.j.c) bVar).ac == 4) {
                                this.dS[i5] = 60;
                            }
                            if (this.gJ == 0 && ((org.necrotic.client.j.c) bVar).ac == 5) {
                                int[] iArr3 = this.dR;
                                iArr3[i5] = iArr3[i5] + 5;
                            }
                        }
                    }
                    int i11 = i3;
                    if (((org.necrotic.client.j.c) bVar).aA > s) {
                        try {
                            a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av + 15);
                            int i12 = i3;
                            if (this.iY >= 0) {
                                if (org.necrotic.a.j) {
                                    long j2 = ((org.necrotic.client.j.c) bVar).au;
                                    long j3 = ((org.necrotic.client.j.c) bVar).aB;
                                    if (j2 > 0) {
                                        d2 = 56.0d * (j2 / j3);
                                    } else {
                                        d2 = 0.0d;
                                    }
                                    long j4 = ((org.necrotic.client.j.c) bVar).au;
                                    long j5 = ((org.necrotic.client.j.c) bVar).aB;
                                    long j6 = j5;
                                    if (j5 > 0 && (bVar instanceof org.necrotic.client.e.a.a)) {
                                        j4 /= 10;
                                        j6 /= 10;
                                    }
                                    long j7 = (j4 * 30) / j6;
                                    long j8 = (j4 * 90) / j6;
                                    long j9 = (j4 * 56) / j6;
                                    if (j6 >= 2000) {
                                        F.a(349).e(this.iY - 44, this.iZ - 5);
                                        i4 = 7;
                                        new org.necrotic.client.f.e(F.b(397), (int) Math.min(d2, 56.0d), 7).e(this.iY - 44, this.iZ - 5);
                                    } else {
                                        F.a(349).e(this.iY - 28, this.iZ - 5);
                                        i4 = 7;
                                        new org.necrotic.client.f.e(F.b(348), (int) Math.min(d2, 56.0d), 7).e(this.iY - 28, this.iZ - 5);
                                    }
                                } else {
                                    long j10 = (((org.necrotic.client.j.c) bVar).au * 30) / ((org.necrotic.client.j.c) bVar).aB;
                                    long j11 = i3 == 1 ? 1 : 0;
                                    if (j10 > 30) {
                                        j11 = 30;
                                    }
                                    org.necrotic.client.f.c.b(5, this.iZ - 3, this.iY - 12, 65280, (int) j11);
                                    int i13 = (int) (30 - j11);
                                    org.necrotic.client.f.c.b(5, this.iZ - 3, (int) ((this.iY - 12) + j11), 16711680, i13);
                                    i4 = i13;
                                }
                                i12 = i4;
                                if (org.necrotic.a.e) {
                                    i12 = i4;
                                    if (bVar instanceof org.necrotic.client.e.a.a) {
                                        org.necrotic.client.j.e eVar = (org.necrotic.client.j.c) bVar;
                                        double d3 = eVar.au;
                                        double d4 = eVar.aB;
                                        int F2 = F((int) Math.round((int) ((d3 / d4) * 100.0d)));
                                        this.bh.a(((int) d3) + "/" + ((int) d4), this.iY, this.iZ - 22, F2, 0);
                                        i12 = F2;
                                    }
                                }
                            }
                            i11 = i12;
                        } catch (Exception unused) {
                            i11 = i3;
                        }
                    }
                    int i14 = 0;
                    i2 = i11;
                    while (i14 < 4) {
                        if (((org.necrotic.client.j.c) bVar).ay[i14] > s) {
                            org.necrotic.client.j.e eVar2 = (org.necrotic.client.j.c) bVar;
                            a(eVar2, eVar2.av / 2);
                            if (!org.necrotic.a.h) {
                                i2 = eVar2;
                                a(this.iY, this.iZ, i14, (org.necrotic.client.j.c) i2);
                            } else {
                                if (eVar2.aQ[i14] == 0) {
                                    if (eVar2.aP[i14] > -14) {
                                        int[] iArr4 = eVar2.aP;
                                        int i15 = i14;
                                        iArr4[i15] = iArr4[i15] - 1;
                                    }
                                    eVar2.aQ[i14] = 2;
                                } else {
                                    int[] iArr5 = eVar2.aQ;
                                    int i16 = i14;
                                    iArr5[i16] = iArr5[i16] - 1;
                                }
                                if (eVar2.aP[i14] <= -14) {
                                    int[] iArr6 = eVar2.aR;
                                    int i17 = i14;
                                    iArr6[i17] = iArr6[i17] - 10;
                                }
                                int length = String.valueOf(eVar2.aw[i14]).length();
                                int i18 = eVar2.ax[i14];
                                i2 = eVar2.aS[i14];
                                a(eVar2, length, i18, (int) i2, eVar2.aw[i14], eVar2.aT[i14], eVar2.aP[i14], eVar2.aR[i14], i14);
                            }
                        }
                        i14++;
                        i2 = i2;
                    }
                }
            } catch (Exception unused2) {
                return;
            }
        }
        for (int i19 = 0; i19 < i5; i19++) {
            int i20 = this.dP[i19];
            int i21 = this.dQ[i19];
            int i22 = this.dS[i19];
            int i23 = this.dR[i19];
            for (boolean z3 = true; z3; z3 = z2) {
                z2 = false;
                int i24 = 0;
                while (i24 < i19) {
                    if (i21 + 2 > this.dQ[i24] - this.dR[i24] && i21 - i23 < this.dQ[i24] + 2 && i20 - i22 < this.dP[i24] + this.dS[i24] && i20 + i22 > this.dP[i24] - this.dS[i24] && this.dQ[i24] - this.dR[i24] < i21) {
                        i21 = this.dQ[i24] - this.dR[i24];
                        z2 = true;
                    }
                    i24++;
                    z2 = z2;
                }
            }
            this.iY = this.dP[i19];
            int i25 = i21;
            this.dQ[i19] = i25;
            this.iZ = i25;
            String str = this.dX[i19];
            if (this.gJ == 0) {
                int i26 = 16776960;
                if (this.dT[i19] < 6) {
                    i26 = this.dO[this.dT[i19]];
                }
                if (this.dT[i19] == 6) {
                    i26 = this.gN % 20 >= 10 ? 16776960 : 16711680;
                }
                if (this.dT[i19] == 7) {
                    i26 = this.gN % 20 >= 10 ? 65535 : ColorUtil.MAX_RGB_VALUE;
                }
                if (this.dT[i19] == 8) {
                    i26 = this.gN % 20 >= 10 ? 8454016 : 45056;
                }
                if (this.dT[i19] == 9) {
                    int i27 = 150 - this.dV[i19];
                    if (i27 < 50) {
                        i26 = 16711680 + (i27 * 1280);
                    } else if (i27 < 100) {
                        i26 = 16776960 - (327680 * (i27 - 50));
                    } else if (i27 < 150) {
                        i26 = 65280 + (5 * (i27 - 100));
                    }
                }
                if (this.dT[i19] == 10) {
                    int i28 = 150 - this.dV[i19];
                    if (i28 < 50) {
                        i26 = 16711680 + (5 * i28);
                    } else if (i28 < 100) {
                        i26 = 16711935 - (327680 * (i28 - 50));
                    } else if (i28 < 150) {
                        i26 = (ColorUtil.MAX_RGB_VALUE + (327680 * (i28 - 100))) - (5 * (i28 - 100));
                    }
                }
                if (this.dT[i19] == 11) {
                    int i29 = 150 - this.dV[i19];
                    if (i29 < 50) {
                        i26 = 16777215 - (i29 * 327685);
                    } else if (i29 < 100) {
                        i26 = 65280 + (327685 * (i29 - 50));
                    } else if (i29 < 150) {
                        i26 = 16777215 - (327680 * (i29 - 100));
                    }
                }
                if (this.dU[i19] == 0) {
                    this.au.a(0, str, this.iZ + 1, this.iY + 1);
                    this.au.a(i26, str, this.iZ, this.iY);
                }
                if (this.dU[i19] == 1) {
                    this.au.b(0, str, this.iY + 1, this.gN, this.iZ + 1);
                    this.au.b(i26, str, this.iY, this.gN, this.iZ);
                }
                if (this.dU[i19] == 2) {
                    this.au.c(this.iY + 1, str, this.gN, this.iZ + 1, 0);
                    this.au.c(this.iY, str, this.gN, this.iZ, i26);
                }
                if (this.dU[i19] == 3) {
                    this.au.a(150 - this.dV[i19], str, this.gN, this.iZ + 1, this.iY + 1, 0);
                    this.au.a(150 - this.dV[i19], str, this.gN, this.iZ, this.iY, i26);
                }
                if (this.dU[i19] == 4) {
                    int b2 = ((150 - this.dV[i19]) * (this.au.b(str) + 100)) / 150;
                    org.necrotic.client.f.c.e(this.iY - 50, 0, this.iY + 50, 334);
                    this.au.b(0, str, this.iZ + 1, (this.iY + 51) - b2);
                    this.au.b(i26, str, this.iZ, (this.iY + 50) - b2);
                    org.necrotic.client.f.c.d();
                }
                if (this.dU[i19] == 5) {
                    int i30 = 150 - this.dV[i19];
                    int i31 = 0;
                    if (i30 < 25) {
                        i31 = i30 - 25;
                    } else if (i30 > 125) {
                        i31 = i30 - 125;
                    }
                    org.necrotic.client.f.c.e(0, (this.iZ - this.au.c) - 1, 512, this.iZ + 5);
                    this.au.a(0, str, this.iZ + 1 + i31, this.iY + 1);
                    this.au.a(i26, str, this.iZ + i31, this.iY);
                    org.necrotic.client.f.c.d();
                }
            } else {
                this.au.a(0, str, this.iZ + 1, this.iY + 1);
                this.au.a(16776960, str, this.iZ, this.iY);
            }
        }
    }

    private static String a(org.necrotic.client.e.a.a aVar) {
        if (aVar.D == 0) {
            return "@whi@ ";
        }
        if (aVar.D == 1) {
            return "<img=1><col=20B2AA>Moderator@whi@ ";
        }
        if (aVar.D == 2) {
            return "<img=2><col=C5BE2D>Administrator@yel@ ";
        }
        if (aVar.D == 3) {
            return "<img=3><shad=1>@bla@Onyx Donator@whi@ ";
        }
        if (aVar.D == 4) {
            return "<img=4><col=ff0000>Founder@red@ ";
        }
        if (aVar.D == 5) {
            return "<img=5>@mag@Helper@whi@ ";
        }
        if (aVar.D == 6) {
            return "<img=6>@blu@Graceful Donator@whi@ ";
        }
        if (aVar.D == 7) {
            return "<img=7>@gre@Cleric Donator@whi@ ";
        }
        if (aVar.D == 8) {
            return "<img=8>@red@Tormented Donator@whi@ ";
        }
        if (aVar.D == 9) {
            return "<img=9>@whi@Mystical Donator@whi@ ";
        }
        if (aVar.D == 10) {
            return "<img=10>@red@Youtuber@whi@ ";
        }
        if (aVar.D == 11) {
            return "111";
        }
        if (aVar.D == 12) {
            return "<img=5>@mag@Support@whi@ ";
        }
        if (aVar.D == 13) {
            return "<img=1508><col=FF7400>Forsaken Donator@red@ ";
        }
        return "";
    }

    private static int F(int i2) {
        int[] iArr = {122625, 3858176, 7659264, 10870528, 14147329, 14395649, 14644225, 14629377, 16406616, 16657966, 14614785};
        int i3 = iArr[0];
        int i4 = 0;
        while (true) {
            if (i4 >= iArr.length) {
                break;
            } else if (i2 < 100 - (i4 * 10)) {
                i4++;
            } else {
                i3 = iArr[i4];
                break;
            }
        }
        return i3;
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0177: INVOKE  (r0 I:java.lang.Exception) type: VIRTUAL call: java.lang.Exception.printStackTrace():void, block:B:56:0x0177 */
    private void aB() {
        Exception printStackTrace;
        try {
            org.necrotic.client.n.l.c(s(), t());
            this.ia = org.necrotic.client.n.l.B;
            org.necrotic.client.n.l.c((org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED && this.id) ? this.ap != null ? this.ap.a : 519 : s(), (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED && this.id) ? this.ap != null ? this.ap.b : 165 : t());
            this.ag = org.necrotic.client.n.l.B;
            org.necrotic.client.n.l.c((org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED && this.id) ? this.bA != null ? this.bA.a : 346 : s(), (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED && this.id) ? this.bA != null ? this.bA.b : 335 : t());
            this.ah = org.necrotic.client.n.l.B;
            org.necrotic.client.n.l.c(this.ib, this.ic);
            this.ai = org.necrotic.client.n.l.B;
            int[] iArr = new int[9];
            for (int i2 = 0; i2 < 9; i2++) {
                int i3 = 128 + (i2 << 5) + 15;
                iArr[i2] = ((Constants.GAME_TICK_LENGTH + (i3 * 3)) * org.necrotic.client.n.l.e[i3]) >> 16;
            }
            org.necrotic.client.n.m.a(!aL ? s() : this.ib, !aL ? t() : this.ic, iArr);
            if (aL) {
                this.aH = new org.necrotic.client.f.d(this.ib, this.ic, j());
            } else {
                this.jc = new org.necrotic.client.f.d(s(), t(), j());
            }
        } catch (Exception unused) {
            printStackTrace.printStackTrace();
        }
    }

    private void c(org.necrotic.client.g.a aVar, int i2) {
        this.gW = 0;
        this.gY = 0;
        c(aVar);
        a(i2, aVar);
        e(aVar);
        for (int i3 = 0; i3 < this.gW; i3++) {
            int i4 = this.ho[i3];
            if (this.bl[i4].ad != s) {
                this.bl[i4].c = null;
                this.bl[i4] = null;
            }
        }
        if (aVar.f != i2) {
            ae.a(D + " size mismatch in getnpcpos - pos:" + aVar.f + " psize:" + i2);
            throw new RuntimeException("eek");
        }
        for (int i5 = 0; i5 < this.bm; i5++) {
            if (this.bl[this.bn[i5]] == null) {
                ae.a(D + " null entry in npc list - pos:" + i5 + " size:" + this.bm);
                throw new RuntimeException("eek");
            }
        }
    }

    private void b(int i2, org.necrotic.client.g.a aVar) {
        this.gW = 0;
        this.gY = 0;
        a(aVar);
        b(aVar);
        b(aVar, i2);
        d(aVar);
        for (int i3 = 0; i3 < this.gW; i3++) {
            int i4 = this.ho[i3];
            if (this.bq[i4].ad != s) {
                this.bq[i4] = null;
            }
        }
        if (aVar.f != i2) {
            ae.a("Error packet size mismatch in getplayer pos:" + aVar.f + " psize:" + i2);
            throw new RuntimeException("eek");
        }
        for (int i5 = 0; i5 < this.br; i5++) {
            if (this.bq[this.bs[i5]] == null) {
                ae.a(D + " null entry in pl list - pos:" + i5 + " size:" + this.br);
                throw new RuntimeException("eek");
            }
        }
    }

    public final void o() {
        boolean z2;
        if (System.currentTimeMillis() - this.js > 60000) {
            this.js = System.currentTimeMillis();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.gF += 25;
        }
    }

    private void aC() {
        int i2 = -1;
        if (this.bL == 5608) {
            if (aD() > 0) {
                if (!this.eb.a.c()) {
                    int i3 = 0;
                    while (i3 < this.bJ.length) {
                        int i4 = i3 == 26 ? 25104 : i3 == 27 ? 25108 : (i3 << 1) + 25000;
                        aa aaVar = aa.u[i4];
                        if (aaVar.aN != null && aaVar.aN[0][0] == 5) {
                            int i5 = aaVar.aN[0][1];
                            if (this.bO[i5] == 0 && this.bJ[i3] == 1) {
                                dk.i(195);
                                dk.h(i4);
                                this.eb.a.a(true);
                            } else if (this.bJ[i3] == 1 && this.bO[i5] == 1) {
                                this.eb.a.a(true);
                            }
                        }
                        i3++;
                    }
                    return;
                }
                aF();
                this.eb.a.a(false);
                return;
            }
            if (this.eb.a.c()) {
                aF();
            } else {
                a("You don't have any quick prayers selected.", 0, "");
                a("Right-click the Prayer button next to the minimap to select some.", 0, "");
            }
            this.eb.a.a(false);
        } else if (this.bL == 32500) {
            if (aE() > 0) {
                if (!this.eb.a.c()) {
                    for (int i6 = 0; i6 < this.bK.length; i6++) {
                        int i7 = (i6 << 1) + 32500 + 3;
                        aa aaVar2 = aa.u[i7];
                        if (aaVar2.aN != null && aaVar2.aN[0][0] == 5) {
                            i2 = aaVar2.aN[0][1];
                            if (this.bO[i2] == 0 && this.bK[i6] == 1) {
                                dk.i(195);
                                dk.h(i7);
                                this.eb.a.a(true);
                            }
                        } else if (this.bK[i6] == 1 && this.bO[i2] == 1) {
                            this.eb.a.a(true);
                        }
                    }
                    return;
                }
                aG();
                this.eb.a.a(false);
            } else if (this.eb.a.c()) {
                aG();
                this.eb.a.a(false);
            } else {
                a("You don't have any quick curses selected.", 0, "");
                a("Right-click the Curses button next to the minimap to select some.", 0, "");
            }
        }
    }

    private int aD() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.bJ.length; i3++) {
            if (this.bJ[i3] == 1) {
                i2++;
            }
        }
        return i2;
    }

    private int aE() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.bK.length; i3++) {
            if (this.bK[i3] == 1) {
                i2++;
            }
        }
        return i2;
    }

    private int[] G(int i2) {
        int[] iArr = null;
        for (int i3 = 0; i3 < this.jN.length; i3++) {
            if (i2 == this.jN[i3]) {
                iArr = this.jM;
            }
        }
        for (int i4 = 0; i4 < this.jM.length; i4++) {
            if (i2 == this.jM[i4]) {
                iArr = this.jN;
            }
        }
        for (int i5 = 0; i5 < this.jO.length; i5++) {
            if (i2 == this.jO[i5]) {
                iArr = this.jO;
            }
        }
        if (i2 == 6) {
            iArr = new int[]{17, 18};
        }
        if (i2 == 17 || i2 == 18) {
            iArr = new int[]{6, 7, 8, 9, 17, 18};
        }
        if (i2 == 19) {
            iArr = new int[]{1, 2, 3, 4, 10, 11, 12, 13, 14, 15, 16, 19};
        }
        return iArr;
    }

    private void H(int i2) {
        int i3 = i2 == 17279 ? 26 : i2 == 17280 ? 27 : i2 - 17202;
        if (this.bL == 5608) {
            if (this.O[5] / 10 >= this.dz[i3]) {
                int[] I = I(i3);
                int[] iArr = I;
                if (I != null) {
                    for (int i4 = 0; i4 < this.jF.length; i4++) {
                        if (i3 == this.jF[i4]) {
                            iArr = this.jI;
                        }
                    }
                    for (int i5 = 0; i5 < iArr.length; i5++) {
                        if (i3 != iArr[i5]) {
                            if (i3 == 24 || i3 == 25) {
                                iArr = this.jK;
                            }
                            this.bJ[iArr[i5]] = 0;
                            this.bO[this.fd[iArr[i5]]] = 0;
                            E(this.fd[iArr[i5]]);
                            if (this.aC != -1) {
                                G = true;
                            }
                        } else {
                            int[] iArr2 = this.bJ;
                            iArr2[i3] = (iArr2[i3] + 1) % 2;
                            this.bO[this.fd[i3]] = this.bJ[i3];
                            E(this.fd[i3]);
                            if (this.aC != -1) {
                                G = true;
                            }
                        }
                    }
                    return;
                }
                int[] iArr3 = this.bJ;
                iArr3[i3] = (iArr3[i3] + 1) % 2;
                this.bO[this.fd[i3]] = this.bJ[i3];
                E(this.fd[i3]);
                if (this.aC != -1) {
                    G = true;
                    return;
                }
                return;
            }
            a("You need a Prayer level of atleast " + this.dz[i3] + " to use " + this.dA[i3] + ".", 0, "");
        } else if (this.bL == 32500) {
            if (this.O[5] / 10 >= this.dx[i3]) {
                int[] G2 = G(i3);
                if (G2 != null) {
                    for (int i6 = 0; i6 < G2.length; i6++) {
                        if (i3 != G2[i6]) {
                            this.bK[G2[i6]] = 0;
                            this.bO[this.fd[G2[i6]]] = 0;
                            E(this.fd[G2[i6]]);
                            if (this.aC != -1) {
                                G = true;
                            }
                        }
                    }
                }
                int[] iArr4 = this.bK;
                iArr4[i3] = (iArr4[i3] + 1) % 2;
                this.bO[this.fd[i3]] = this.bK[i3];
                E(this.fd[i3]);
                if (this.aC != -1) {
                    G = true;
                    return;
                }
                return;
            }
            a("You need a Prayer level of atleast " + this.dx[i3] + " to use " + this.dy[i3] + ".", 0, "");
        }
    }

    private void aF() {
        int i2 = 0;
        while (i2 < this.bJ.length) {
            int i3 = i2 == 26 ? 25104 : i2 == 27 ? 25108 : (i2 << 1) + 25000;
            aa aaVar = aa.u[i3];
            if (aaVar.aN != null && aaVar.aN[0][0] == 5) {
                if (this.bO[aaVar.aN[0][1]] == 1 && this.bJ[i2] == 1) {
                    dk.i(195);
                    dk.h(i3);
                }
            }
            i2++;
        }
    }

    private void aG() {
        for (int i2 = 0; i2 < this.bK.length; i2++) {
            aa aaVar = aa.u[(i2 << 1) + 32503];
            if (aaVar.aN != null && aaVar.aN[0][0] == 5) {
                if (this.bO[aaVar.aN[0][1]] == 1 && this.bK[i2] == 1) {
                    dk.i(195);
                    dk.h((i2 << 1) + 32503);
                }
            }
        }
    }

    private int[] I(int i2) {
        int[] iArr = null;
        for (int i3 = 0; i3 < this.jL.length; i3++) {
            for (int i4 = 0; i4 < this.jL[i3].length; i4++) {
                if (i2 == this.jL[i3][i4]) {
                    iArr = this.jL[i3];
                }
            }
        }
        return iArr;
    }

    private void aI() {
        if (c[5] == 17200 || c[5] == 17234) {
            aH();
            return;
        }
        if (this.bL == 5608) {
            c[5] = 17200;
            cv = true;
        } else if (this.bL == 32500) {
            c[5] = 17234;
            cv = true;
        }
        w = 5;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.DataOutputStream, java.lang.Exception] */
    private static void k(String str) {
        ?? dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(ae.b() + "/" + str.trim().toLowerCase() + ".goals")));
            for (int i2 = 0; i2 < af.c.length; i2++) {
                dataOutputStream.writeInt(af.c[i2][0]);
                dataOutputStream.writeInt(af.c[i2][1]);
                dataOutputStream.writeInt(af.c[i2][2]);
                dataOutputStream.writeUTF(af.d);
            }
            dataOutputStream.close();
        } catch (Exception unused) {
            dataOutputStream.printStackTrace();
        }
    }

    private static void c(String str, int i2) {
        switch (i2) {
            case 1675:
                a(str, 17508);
                return;
            case 1676:
                a(str, 17509);
                return;
            case 1677:
                a(str, 17510);
                return;
            case 1678:
                a(str, 17511);
                return;
            case 1679:
                a(str, 17512);
                return;
            case 1680:
                a(str, 17513);
                return;
            case 1681:
                a(str, 17514);
                return;
            case 1682:
                a(str, 17515);
                return;
            case 1683:
                a(str, 17516);
                return;
            case 1684:
                a(str, 17517);
                return;
            case 1686:
                a(str, 17518);
                return;
            case 15115:
            case 15116:
            case 15117:
            case 15118:
            case 15119:
            case 15120:
                aa.a(i2, str, aa.t, 1, 16749056, false, true);
                return;
            default:
                return;
        }
    }

    private void a(int i2, int i3, long j2, long j3, int i4) {
        double d2 = (j2 / j3) * 100.0d;
        double d3 = 100.0d - d2;
        int i5 = (i3 + 30) - 20;
        if (d2 >= i2) {
            d2 = i2 - 25;
        }
        org.necrotic.client.f.a.c.f(10, 30, i2, i3);
        org.necrotic.client.f.c.b(15, i5, i4 + ((int) d2), 11740160, (int) d3);
        org.necrotic.client.f.c.b(15, i5, i4, 31744, (int) d2);
        if (j3 > 0) {
            this.bi.a(((int) d2) + "%/100%", 10 + (i2 / 2), i5 + 13, 16777215, 0);
        } else {
            this.bi.a(j2 + "/" + j3, 10 + (i2 / 2), i5 + 13, 16777215, 0);
        }
    }

    private org.necrotic.client.h.a aJ() {
        return this.hI;
    }

    private org.necrotic.client.g.a aK() {
        return this.ih;
    }

    private org.necrotic.client.g.b aL() {
        return this.hJ;
    }

    private void J(int i2) {
        this.gZ = i2;
    }

    private org.necrotic.client.c.b.a aM() {
        return this.ga;
    }

    private int aN() {
        return this.ec;
    }

    public final org.necrotic.client.f.c.i p() {
        return this.fa;
    }

    private static void c(int i2, int i3, int i4) {
        aa aaVar = aa.u[i2];
        if (aaVar == null) {
            return;
        }
        y yVar = (y) aaVar;
        yVar.b = i3;
        yVar.c = i4;
        yVar.d = 0;
    }

    public static org.necrotic.client.e.a.a q() {
        return t;
    }

    public static Canvas r() {
        return cn;
    }

    private static void n(int i2, int i3) {
        String str = "::tele " + i2 + " " + i3;
        dk.i(231);
        dk.l(str.length() - 1);
        dk.a(str.substring(2));
    }

    private void a(org.necrotic.client.c.a.i iVar) {
        String str;
        String str2;
        String str3 = "";
        if (this.jU > 0 && iVar != null && w.a.length > this.jU) {
            if (iVar.j != null) {
                str3 = iVar.j[1] == null ? "" : iVar.j[1];
            }
            aa.u[94002].an = " @lre@" + org.necrotic.client.f.a.a.b(iVar.G);
            if (w.a[this.jU] != null) {
                if (w.a[this.jU].i != 1) {
                    if (w.a[this.jU].i != 2) {
                        if (w.a[this.jU].i == 3) {
                            aa.a(aa.u[94089], w.a[this.jU].j);
                            aa.u[94087].an = w.a[this.jU].k;
                            return;
                        }
                        return;
                    }
                    aa.u[94021].aa = 28;
                    int c2 = this.bg.c(iVar.G) + this.bg.c(str3) + 8;
                    int i2 = c2;
                    if (c2 < 58) {
                        i2 = 58;
                    }
                    aa.u[94021].aO = i2;
                    aa.u[94020].V[1] = 8 + (i2 / 2);
                    aa.u[94020].V[2] = 8 + (i2 / 2);
                    aa.u[94022].an = "@whi@Heals: @gre@" + w.a[this.jU].h;
                    aa.u[94022].T = true;
                    return;
                }
                aa.u[94006].an = "";
                for (int i3 = 0; i3 < 5; i3++) {
                    if (w.a[this.jU].b[i3] > 0) {
                        str2 = "+";
                    } else {
                        str2 = "";
                    }
                    String str4 = str2;
                    StringBuilder sb = new StringBuilder();
                    aa aaVar = aa.u[94006];
                    aaVar.an = sb.append(aaVar.an).append("@whi@").append(str4).append(g(w.a[this.jU].b[i3])).append("\\n").toString();
                }
                aa.u[94007].an = "";
                for (int i4 = 0; i4 < 5; i4++) {
                    if (w.a[this.jU].c[i4] > 0) {
                        str = "+";
                    } else {
                        str = "";
                    }
                    String str5 = str;
                    StringBuilder sb2 = new StringBuilder();
                    aa aaVar2 = aa.u[94007];
                    aaVar2.an = sb2.append(aaVar2.an).append("@whi@").append(str5).append(g(w.a[this.jU].c[i4])).append("\\n").toString();
                }
                aa.u[94010].an = "@whi@" + (w.a[this.jU].f > 0 ? "+" : "") + g(w.a[this.jU].f) + "\\n@whi@" + (w.a[this.jU].e > 0 ? "+" : "") + g(w.a[this.jU].e) + "\\n@whi@" + (w.a[this.jU].d > 0 ? "+" : "") + g(w.a[this.jU].d) + "\\n@whi@" + (w.a[this.jU].g > 0 ? "+" : "") + g(w.a[this.jU].g);
                aa.u[94021].aa = 28;
                aa.u[94021].aO = 145;
                aa.u[94020].V[1] = 80;
                aa.u[94022].an = "@whi@Press @gre@CTRL@whi@ to view stats";
                aa.u[94022].T = false;
                aa.u[94020].V[2] = 10;
                return;
            }
            aa.u[94021].aa = 16;
            aa.u[94021].aO = this.bg.c(iVar.G) + this.bg.c(str3) + 8;
            aa.u[94020].V[1] = 8 + (aa.u[94021].aO / 2);
            aa.u[94022].an = "";
        }
    }

    private static String g(long j2) {
        boolean z2 = false;
        if (j2 < 0) {
            j2 = -j2;
            z2 = true;
        }
        int length = String.valueOf(j2).length();
        String l2 = Long.toString(j2);
        String str = l2;
        if (length == 4) {
            str = l2.substring(0, 1) + "K";
            double d2 = j2 / 1000.0d;
            if (d2 != ((int) d2) && j2 - (1000.0d * Math.ceil(d2)) > 100.0d) {
                str = l2.substring(0, 1) + "." + l2.substring(1, 2) + "K";
            }
        } else if (length == 5) {
            str = l2.substring(0, 2) + "K";
        } else if (length == 6) {
            str = l2.substring(0, 3) + "K";
        } else if (length == 7) {
            str = l2.substring(1, 2).equals("0") ? l2.substring(0, 1) + "M" : l2.substring(0, 1) + "." + l2.substring(1, 2) + "M";
        } else if (length == 8) {
            String str2 = "." + l2.substring(2, 3);
            String str3 = str2;
            if (str2.equals(".0")) {
                str3 = "";
            }
            str = l2.substring(0, 2) + str3 + "M";
        } else if (length == 9) {
            String str4 = "." + l2.substring(3, 4);
            String str5 = str4;
            if (str4.equals(".0")) {
                str5 = "";
            }
            str = l2.substring(0, 3) + str5 + "M";
        } else if (length == 10) {
            str = l2.substring(0, 4) + "M";
        } else if (length == 11) {
            str = l2.substring(0, 2) + "." + l2.substring(2, 5) + "B";
        } else if (length == 12) {
            str = l2.substring(0, 3) + "." + l2.substring(3, 6) + "B";
        } else if (length == 13) {
            str = l2.substring(0, 4) + "." + l2.substring(4, 7) + "B";
        }
        if (z2) {
            str = "-".concat(String.valueOf(str));
        }
        return str;
    }

    private static final org.necrotic.client.n.b.e a(Client client) {
        try {
            org.necrotic.client.n.b.n nVar = new org.necrotic.client.n.b.n();
            nVar.b(2048);
            cG = nVar;
        } catch (Throwable unused) {
            try {
                cG = new org.necrotic.client.n.b.m();
            } catch (Throwable unused2) {
                if (System.getProperty("java.vendor").toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        cG = new org.necrotic.client.n.b.k();
                    } catch (Throwable unused3) {
                        cG = new org.necrotic.client.n.b.i(8000);
                        org.necrotic.client.n.b.e eVar = new org.necrotic.client.n.b.e();
                        a(eVar);
                        return eVar;
                    }
                }
                cG = new org.necrotic.client.n.b.i(8000);
            }
        }
        org.necrotic.client.n.b.e eVar2 = new org.necrotic.client.n.b.e();
        a(eVar2);
        return eVar2;
    }

    private static void D() {
        dg = true;
        org.necrotic.a.r = false;
        org.necrotic.a.s = false;
        org.necrotic.a.t = true;
    }

    public final void h() {
        dk.i(170);
        if (this.aK != -1) {
            this.aK = -1;
            this.ev = false;
            cv = true;
        }
        if (this.ak != -1) {
            this.ak = -1;
            G = true;
            this.ev = false;
        }
        u = -1;
        this.hZ = -1;
    }

    private void v(int i2) {
        dk.i(195);
        dk.h(i2);
        aa aaVar = aa.u[i2];
        if (aaVar != null && aaVar.aN != null && aaVar.aN[0][0] == 5) {
            int i3 = aaVar.aN[0][1];
            this.bO[i3] = 1 - this.bO[i3];
        }
    }

    private void av() {
        dk.i(231);
        dk.l(B.length() - 1);
        dk.a(B.substring(2));
        B = "";
        this.bu = "";
        this.ii = 0;
    }

    private void aH() {
        org.necrotic.client.a.a.a(q);
        c[5] = this.bL;
    }
}