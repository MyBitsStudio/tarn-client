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
    private static final int[] co;
    private static final long serialVersionUID = -1913853327056220406L;
    public static long h;
    public static int i;
    public static int j;
    public static int l;
    public static int[] m;
    public static Client q;
    public static int s;
    public static org.necrotic.client.e.a.a t;
    public static int u;
    public static int v;
    private static boolean cu;
    public static int w;
    public static boolean x;
    public static boolean y;
    public static String z;
    public static int[] A;
    private static String cv;
    public static String B;
    private static int cw;
    private static int cx;
    public static boolean C;
    public static org.necrotic.client.f.f D;
    static boolean E;
    private static boolean cy;
    private static byte[] cz;
    private static org.necrotic.client.n.b.p cA;
    private static org.necrotic.client.n.b.a cB;
    private static final org.necrotic.client.n.b.p[] cC;
    private static org.necrotic.client.n.b.d cD;
    private static org.necrotic.client.n.b.e cE;
    private static org.necrotic.client.n.b.i cF;
    private static org.necrotic.client.n.a.a cG;
    private static int cH;
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
    private static boolean dc;
    private static boolean dd;
    private static final ArrayList<Character> de;
    private static boolean df;
    private static byte[] dg;
    private static int dh;
    private static int di;
    private static org.necrotic.client.g.a dj;
    private static int dk;
    private static int dl;
    private static aa dm;
    private static d[] dn;

    /* renamed from: do  reason: not valid java name */
    private int[] f0do;
    private String[] dp;
    private boolean[] dq;
    public final int[] G;
    public final int[] H;
    private int[] dr;
    public final int[] I;
    public final m[] J;
    public final int[] K;
    public final int[] L;
    public final int[] M;
    public final org.necrotic.client.f.e[] N;
    private final String[] dA;
    private final boolean dC;
    private final boolean[] dD;
    private final aa dE;
    private final int dF;
    private final int[] dG;
    private final int[] dH;
    private final int[] dI;
    private final int[] dK;
    private final int[] dL;
    private final int[] dM;
    private final int[] dO;
    private final int[] dP;
    private final int[] dQ;
    private final int[] dR;
    private final int[] dS;
    private final int[] dT;
    private final int[] dU;
    private final int[][][] dV;
    private final String[] dW;
    private final int[] dY;
    private final long[] dZ;
    private final int eb;
    private final int ec;
    private final org.necrotic.client.f.e[] ed;
    private final org.necrotic.client.f.e[] ee;
    private final int[] ef;
    private final int[] eg;
    private final int[] eh;
    private org.necrotic.client.f.e ek;
    private org.necrotic.client.f.e el;
    private org.necrotic.client.f.e em;
    private int ep;
    public boolean S;
    private boolean et;
    private boolean eu;
    private boolean ev;
    public org.necrotic.client.f.e[] T;
    public String U;
    private int ew;
    private int ex;
    public int V;
    private int ey;
    private int ez;
    private int eA;
    public int W;
    private int eB;
    public int X;
    private int eC;
    private int eD;
    private int eE;
    public int Y;
    public int Z;
    public int aa;
    public int ab;
    public int[] ac;
    public int[] ad;
    public int[] ae;
    public int[] af;
    public int[] ag;
    public String ah;
    public int ai;
    public int aj;
    public int ak;
    public org.necrotic.client.f.d an;
    public String[] ao;
    public String[] ap;
    public String[] aq;
    public int[] ar;
    public org.necrotic.client.f.a.c as;
    public org.necrotic.client.f.a.c at;
    public int[] au;
    private String eF;
    public org.necrotic.client.f.e ax;
    public int ay;
    public int az;
    public int aA;
    public int aC;
    public long[] aD;
    public int[] aE;
    public org.necrotic.client.f.d aF;
    public int aH;
    public int aI;
    private int eG;
    private int eH;
    public static boolean aJ;
    public org.necrotic.client.f.d aK;
    public org.necrotic.client.f.e aL;
    public org.necrotic.client.f.e aM;
    public org.necrotic.client.f.e aN;
    public org.necrotic.client.f.e aO;
    public org.necrotic.client.f.e aP;
    public org.necrotic.client.f.e aQ;
    public org.necrotic.client.f.e aR;
    public org.necrotic.client.f.e aS;
    public int[] aT;
    public String[] aU;
    private String[] eI;
    private int[] eJ;
    public int aV;
    public boolean aW;
    public int aX;
    public boolean aY;
    public org.necrotic.client.f.e aZ;
    public int ba;
    public int bb;
    public int bc;
    public int bd;
    public org.necrotic.client.f.a.a be;
    public org.necrotic.client.f.a.a bf;
    public org.necrotic.client.f.a.a bg;
    public org.necrotic.client.f.a.a bh;
    public org.necrotic.client.f.a.c bi;
    public int bk;
    public org.necrotic.client.c.c.a bm;
    private int eK;
    private int eL;
    public int bn;
    public org.necrotic.client.e.a.a[] bo;
    public int bp;
    public int[] bq;
    public int br;
    public String bs;
    public String bt;
    public int bu;
    private int eM;
    public org.necrotic.client.f.a.c bv;
    private int eN;
    private int eO;
    public org.necrotic.client.f.d by;
    public int bz;
    public int bA;
    private int eQ;
    public int bB;
    private int eR;
    public int bC;
    public int bD;
    public int bF;
    public org.necrotic.client.f.b bG;
    private final boolean fb;
    public int bJ;
    public String bK;
    private boolean ff;
    private boolean fg;
    private boolean fi;
    private boolean fj;
    private boolean fk;
    private boolean fl;
    private boolean fm;
    private int fq;
    private boolean fs;
    private int ft;
    private String fu;
    private org.necrotic.client.f.e fv;
    private long fx;
    private org.necrotic.client.f.e fy;
    private String fB;
    private int fC;
    private int fD;
    private long fF;
    private boolean fJ;
    private boolean fK;
    private boolean fL;
    private boolean fM;
    private boolean fN;
    private boolean fO;
    private boolean fP;
    private boolean fR;
    private boolean fS;
    private byte[] fT;
    private byte[][] fU;
    private byte[][] fV;
    private org.necrotic.client.n.b[] fW;
    private org.necrotic.client.c.b.a fX;
    private org.necrotic.client.c.b.a fY;
    private org.necrotic.client.c.b.a fZ;
    private org.necrotic.client.f.e ga;
    private org.necrotic.client.f.e gb;
    private int gc;
    private long gd;
    private long ge;
    private int gf;
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
    private int[] hm;
    private int[] ho;
    private int[][] hq;
    private int[][] hr;
    private org.necrotic.client.f.d ht;
    private org.necrotic.client.f.d hu;
    private Socket hv;
    private org.necrotic.client.g.a[] hx;
    private int hy;
    private int hz;
    private int hA;
    private int hB;
    private int[] hC;
    private int[] hD;
    private byte[][][] hE;
    private int hF;
    private int hG;
    private org.necrotic.client.h.a hH;
    private org.necrotic.client.g.b hI;
    private org.necrotic.client.f.e[] hJ;
    private int hK;
    private int hL;
    private int hM;
    private int hN;
    private int hO;
    private int hP;
    private int hQ;
    private int hR;
    private volatile boolean hT;
    private int[] hU;
    private String[] hW;
    private int hX;
    private int[] hZ;
    private org.necrotic.client.f.e[] id;
    private org.necrotic.client.f.e[] ie;

    /* renamed from: if  reason: not valid java name */
    private int f1if;
    private org.necrotic.client.g.a ig;
    private int[][][] ii;
    private int ij;
    private org.necrotic.client.f.d ik;
    private boolean il;
    private int in;
    private String[] io;
    private int ip;
    private int iq;
    private org.necrotic.client.f.a is;
    private org.necrotic.client.f.e it;
    private org.necrotic.client.f.e iu;
    private org.necrotic.client.f.e[] iv;
    private org.necrotic.client.f.a[] iw;
    private int ix;
    private int[] iy;
    private int[] iz;
    private int[] iA;
    private int iB;
    private int iC;
    private int iD;
    private int iE;
    private String iF;
    private int iG;
    private org.necrotic.client.f.e iH;
    private org.necrotic.client.f.e iI;
    private String iK;
    private int iL;
    private int[] iM;
    private int iO;
    private org.necrotic.client.f.d iP;
    private int iQ;
    private boolean iR;
    private String iS;
    private long iT;
    private org.necrotic.client.f.e[] iU;
    private String iV;
    private int iW;
    private int iX;
    private int iY;
    private int iZ;
    private org.necrotic.client.f.d jb;
    private org.necrotic.client.c.a jd;
    private org.necrotic.client.f.d jf;
    private int jg;
    private int jh;
    private int ji;
    private int jj;
    private boolean jk;
    private org.necrotic.client.n.m jl;
    private boolean jm;
    private boolean jn;
    private org.necrotic.client.f.e jo;
    private int jp;
    private int jq;
    private org.necrotic.client.f.a.c ju;
    private org.necrotic.client.f.a.c jv;
    private int jw;
    private int jx;
    private boolean jz;
    private boolean jA;
    private boolean jD;
    private int jF;
    private org.necrotic.client.j.c jS;
    private boolean jW;
    private boolean jX;
    private org.necrotic.client.f.e jZ;
    public int[] bM;
    private static org.necrotic.b cn = new org.necrotic.b();

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f169a = {9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486};
    public static final int[][] b = {new int[]{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, new int[]{8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239}, new int[]{25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003}, new int[]{4626, 11146, 6439, 12, 4758, 10270}, new int[]{4550, 20165, 43678, 16895, 28416, 12231, 947, 60359, 32433}};
    public static final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] cp = {1196, 1199, 1206, 1215, 1224, 1231, 1240, 1249, 1258, 1267, 1274, 1283, 1573, 1290, 1299, 1308, 1315, 1324, 1333, 1340, 1349, 1358, 1367, 1374, 1381, 1388, 1397, 1404, 1583, 12038, 1414, 1421, 1430, 1437, 1446, 1453, 1460, 1469, 15878, 1602, 1613, 1624, 7456, 1478, 1485, 1494, 1503, 1512, 1521, 1530, 1544, 1553, 1563, 1593, 1635, 12426, 12436, 12446, 12456, 6004, 18471, 12940, 12988, 13036, 12902, 12862, 13046, 12964, 13012, 13054, 12920, 12882, 13062, 12952, 13000, 13070, 12912, 12872, 13080, 12976, 13024, 13088, 12930, 12892, 13096};
    private static final Pattern cq = Pattern.compile("@.+@");
    private static final int[] cr = {1202, 1203, 1209, 1210, 1211, 1218, 1219, 1220, 1227, 1228, 1234, 1235, 1236, 1243, 1244, 1245, 1252, 1253, 1254, 1261, 1262, 1263, 1270, 1271, 1277, 1278, 1279, 1286, 1287, 1293, 1294, 1295, 1302, 1303, 1304, 1311, 1312, 1318, 1319, 1320, 1327, 1328, 1329, 1336, 1337, 1343, 1344, 1345, 1352, 1353, 1354, 1361, 1362, 1363, 1370, 1371, 1377, 1378, 1384, 1385, 1391, 1392, 1393, 1400, 1401, 1407, 1408, 1410, 1417, 1418, 1424, 1425, 1426, 1433, 1434, 1440, 1441, 1442, 1449, 1450, 1456, 1457, 1463, 1464, 1465, 1472, 1473, 1474, 1481, 1482, 1488, 1489, 1490, 1497, 1498, 1499, 1506, 1507, 1508, 1515, 1516, 1517, 1524, 1525, 1526, 1533, 1534, 1535, 1547, 1548, 1549, 1556, 1557, 1558, 1566, 1567, 1568, 1576, 1577, 1578, 1586, 1587, 1588, 1596, 1597, 1598, 1605, 1606, 1607, 1616, 1617, 1618, 1627, 1628, 1629, 1638, 1639, 1640, 6007, 6008, 6011, 8673, 8674, 12041, 12042, 12429, 12430, 12431, 12439, 12440, 12441, 12449, 12450, 12451, 12459, 12460, 15881, 15882, 15885, 18474, 18475, 18478};
    public static boolean d = false;
    private static boolean cs = false;
    public static int e = 0;
    public static boolean f = false;
    public static boolean g = false;
    private static boolean ct = true;
    public static int k = 256;
    public static int[] n = {12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800};
    public static int o = Constants.GAME_FIXED_HEIGHT;
    public static int p = Constants.GAME_FIXED_WIDTH;
    public static int r = (int) (Math.log(765.0d) / Math.log(5.0d));
    private int ds = Constants.GAME_FIXED_WIDTH;
    private int dt = Constants.GAME_FIXED_HEIGHT;
    private int du = 800;
    private int dv = Constants.GAME_TICK_LENGTH;
    public final int[] O = new int[500];
    private int[] dw = {50, 50, 52, 54, 56, 59, 62, 65, 68, 71, 74, 76, 78, 80, 82, 84, 86, 89, 92, 95};
    private String[] dx = {"Protect Item", "Sap Warrior", "Sap Ranger", "Sap Mage", "Sap Spirit", "Berserker", "Deflect Summoning", "Deflect Magic", "Deflect Missiles", "Deflect Melee", "Leech Attack", "Leech Ranged", "Leech Magic", "Leech Defence", "Leech Strength", "Leech Energy", "Leech Special Attack", "Wrath", "Soul Split", "Turmoil"};
    private int[] dy = {1, 4, 7, 8, 9, 10, 13, 16, 19, 22, 25, 26, 27, 28, 31, 34, 37, 40, 43, 44, 45, 46, 49, 52, 60, 70, 80, 80};
    private String[] dz = {"Thick Skin", "Burst of Strength", "Clarity of Thought", "Sharp Eye", "Mystic Will", "Rock Skin", "Superhuman Strength", "Improved Reflexes", "Rapid Restore", "Rapid Heal", "Protect Item", "Hawk Eye", "Mystic Lore", "Steel Skin", "Ultimate Strength", "Incredible Reflexes", "Protect from Magic", "Protect from Missiles", "Protect from Melee", "Eagle Eye", "Mystic Might", "Retribution", "Redemption", "Smite", "Chivalry", "Piety", "Rigour", "Augury"};
    private final int[] dJ = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
    private final int[] dN = {16776960, 16711680, 65280, 65535, 16711935, 16777215};
    private final org.necrotic.client.f.b.a.b ea = new org.necrotic.client.f.b.a.b();
    private final String[] ei = new String[500];
    private final ah ej = new ah();
    private org.necrotic.client.i.b en = new org.necrotic.client.i.b(this);
    public int P = 0;
    public int Q = 0;
    private boolean eq = false;
    private boolean er = false;
    private ArrayList<Object> es = new ArrayList<>();
    public ArrayList<org.necrotic.client.f.c.c> R = new ArrayList<>();
    public String[] aw = new String[100];
    public int aB = 100;
    public int bw = 1;
    public org.necrotic.client.f.b.a.c bx = new org.necrotic.client.f.b.a.c();
    private boolean eS = false;
    private int eT = 0;
    private boolean eU = false;
    private boolean eV = false;
    private aa eW = null;
    public String bE = null;
    private int eX = 4;
    private int eY = 4;
    private final boolean fa = true;
    public int[] bH = new int[28];
    public int[] bI = new int[20];
    private int[] fc = {630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 658, 659};
    private int fd = -1;
    private boolean fe = false;
    org.necrotic.client.f.b.a.a bL = new org.necrotic.client.f.b.a.a();
    private ArrayList<aa> fh = new ArrayList<>();
    private boolean[] fn = new boolean[3];
    private boolean[] fo = new boolean[3];
    private int fp = 0;
    private org.necrotic.client.c.a.j fr = null;
    private long fw = 0;
    private boolean fz = false;
    private boolean fA = false;
    private int fE = -1;
    private int fH = 0;
    private int fI = 0;
    private int[] hs = new int[0];
    private final int[][] hS = {new int[]{475, 90}, new int[]{-40, PluginPanel.PANEL_WIDTH}, new int[]{260, 334}};
    private String hV = "";
    private int ia = 512;
    private int ib = 334;
    private boolean ic = true;
    private int ih = 0;
    private int ir = -1;
    private int iJ = ColorUtil.MAX_RGB_VALUE;
    private String iN = "";
    private int ja = -1;
    private int[] jc = null;
    private int je = -1;
    private long jr = System.currentTimeMillis();
    private final int[] js = {0, 5, 13, 24, 25, 26, 27};
    private final int[] jt = {1, 3, 4, 6, 11, 12, 14, 19, 20, 24, 25, 26, 27};
    private final int[] jy = {2, 3, 4, 7, 11, 12, 15, 19, 20, 24, 25, 26, 27};
    private final int[] jE = {3, 4, 11, 12, 19, 20, 24, 25, 26, 27};
    private boolean jG = false;
    private final int[] jH = {1, 2, 3, 4, 6, 7, 11, 12, 14, 15, 19, 20, 24, 25, 26, 27};
    private final int[] jI = {16, 17, 18, 21, 22, 23};
    private final int[] jJ = {0, 1, 2, 3, 4, 5, 6, 7, 11, 12, 13, 14, 15, 19, 20, 24, 25, 26, 27};
    private final int[][] jK = {this.js, this.jt, this.jy, this.jE, this.jI};
    private final int[] jL = {1, 2, 3, 4, 19};
    private final int[] jM = {10, 11, 12, 13, 14, 15, 16, 19};
    private final int[] jN = {7, 8, 9, 17, 18};
    private final int jP = 13;
    private final org.necrotic.client.f.e[] jQ = new org.necrotic.client.f.e[13];
    private final int jR = 6;
    private int jT = -1;
    private final org.necrotic.client.f.e[] jU = new org.necrotic.client.f.e[6];
    private int jV = -1;
    private String jY = "";
    private String ka = "null";
    private int[] kb = new int[2000];
    private int[] kc = new int[2000];
    private int[] kd = new int[2000];
    private int ke = 0;
    private final g jO = new g();
    private final AccountManager eP = new AccountManager();
    private final org.necrotic.client.f.c.i eZ = new org.necrotic.client.f.c.i();
    private final BufferedImage[] fG = new BufferedImage[4];
    private int[] jB = new int[500];
    private int[] jC = new int[500];
    private int hY = -1;
    private b eo = new b(this);
    public final List<Integer>[] F = new ArrayList[500];
    public int av = 0;
    public int am = -1;
    public int al = 0;
    private int[][] hp = new int[104][104];
    private final CRC32 dX = new CRC32();
    public org.necrotic.client.c.b.a[][][] aG = new org.necrotic.client.c.b.a[4][104][104];
    private volatile boolean fQ = false;
    private org.necrotic.client.g.a hw = new org.necrotic.client.g.a(new byte[5000]);
    public org.necrotic.client.j.e[] bj = new org.necrotic.client.j.e[50000];
    public int[] bl = new int[50000];
    private int[] hn = new int[1000];
    private org.necrotic.client.g.a im = org.necrotic.client.g.a.a();
    private final boolean dB = true;

    /* JADX WARN: Type inference failed for: r0v4, types: [int[], int[][]] */
    static {
        new HashMap();
        A = new int[2];
        D = new org.necrotic.client.f.f();
        cC = new org.necrotic.client.n.b.p[50];
        cV = 0;
        cW = 0;
        cX = -1;
        cY = 0;
        dc = false;
        dd = true;
        de = new ArrayList<>();
        di = 10;
        String[] strArr = {"Attack", "Constitution", "Mining", "Strength", "Agility", "Smithing", "Defence", "Herblore", "Fishing", HttpHeaders.RANGE, "Thieving", "Cooking", "Prayer", "Crafting", "Firemaking", "Magic", "Fletching", "Woodcutting", "Runecrafting", "Slayer", "Farming", "Invention", "Hunter", "Summoning"};
        dk = 127;
        dl = 0;
        dm = null;
        System.getProperty("os.name").toLowerCase();
        co = new int[99];
        int i2 = 0;
        for (int i3 = 0; i3 < 99; i3++) {
            int i4 = i3 + 1;
            i2 += (int) (i4 + (300.0d * Math.pow(2.0d, i4 / 7.0d)));
            co[i3] = i2 >> 2;
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
                return dn[6];
            case 829:
                return dn[7];
            case 830:
                return dn[2];
            case 831:
                return dn[8];
            case 832:
                return dn[9];
            case 833:
                return dn[4];
            case 834:
                return dn[1];
            case 835:
                return dn[3];
            case 836:
                return dn[0];
            case 1508:
                return dn[5];
            default:
                return null;
        }
    }

    public static d b(int i2) {
        switch (i2) {
            case 1:
                return dn[6];
            case 2:
                return dn[7];
            case 3:
                return dn[2];
            case 4:
                return dn[8];
            case 5:
                return dn[9];
            case 6:
                return dn[4];
            case 7:
                return dn[1];
            case 8:
                return dn[3];
            case 9:
                return dn[0];
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            default:
                return null;
            case 13:
            case 16:
                return dn[5];
        }
    }

    /* JADX WARN: Type inference failed for: r1v68, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r1v99, types: [int[], int[][]] */
    public Client() {
        this.io = new String[]{""};
        u = -1;
        this.dr = new int[25];
        this.fR = false;
        this.dL = new int[5];
        this.dD = new boolean[5];
        this.fb = false;
        this.jg = -1;
        this.aW = false;
        z = "";
        this.eb = 2048;
        this.ec = 2047;
        this.aE = new int[200];
        this.bo = new org.necrotic.client.e.a.a[this.eb];
        this.bq = new int[this.eb];
        this.ho = new int[this.eb];
        this.hx = new org.necrotic.client.g.a[this.eb];
        this.hq = new int[104][104];
        this.fT = new byte[16384];
        this.I = new int[25];
        this.dZ = new long[100];
        this.il = false;
        this.dM = new int[5];
        this.hr = new int[104][104];
        this.au = new int[500];
        this.ap = new String[500];
        this.ao = new String[500];
        this.aq = new String[500];
        this.ar = new int[500];
        Arrays.fill(this.aq, "");
        Arrays.fill(this.ar, 0);
        Arrays.fill(this.O, 0);
        this.ev = true;
        this.aD = new long[200];
        this.hW = new String[200];
        this.hO = -1;
        this.hT = false;
        this.iX = -1;
        this.iY = -1;
        this.G = new int[33];
        this.J = new m[6];
        this.bM = new int[9000];
        this.fS = false;
        this.dF = 79;
        this.dO = new int[this.dF];
        this.dP = new int[this.dF];
        this.dQ = new int[this.dF];
        this.dR = new int[this.dF];
        this.dS = new int[this.dF];
        this.dT = new int[this.dF];
        this.dU = new int[this.dF];
        this.dW = new String[this.dF];
        this.hf = -1;
        this.f0do = new int[5];
        this.dC = false;
        this.U = "";
        this.fX = new org.necrotic.client.c.b.a();
        this.fJ = false;
        this.gj = -1;
        this.dG = new int[5];
        this.fK = false;
        this.iv = new org.necrotic.client.f.e[100];
        this.aA = -1;
        this.M = new int[25];
        this.dH = new int[10000];
        this.et = true;
        this.K = new int[152];
        this.ey = -1;
        this.fY = new org.necrotic.client.c.b.a();
        this.H = new int[33];
        this.dE = new aa();
        this.iw = new org.necrotic.client.f.a[100];
        this.dI = new int[7];
        this.ac = new int[1000];
        this.ad = new int[1000];
        this.fL = false;
        this.ig = org.necrotic.client.g.a.a();
        this.dY = new int[9];
        this.iz = new int[500];
        this.iA = new int[500];
        this.aT = new int[500];
        this.iy = new int[500];
        this.id = new org.necrotic.client.f.e[20];
        this.iU = new org.necrotic.client.f.e[7];
        this.ie = new org.necrotic.client.f.e[20];
        this.ee = new org.necrotic.client.f.e[12];
        this.ed = new org.necrotic.client.f.e[6];
        cu = false;
        this.bt = "";
        this.dp = new String[7];
        this.dq = new boolean[7];
        this.dV = new int[4][13][13];
        this.T = new org.necrotic.client.f.e[1000];
        this.fM = false;
        this.eu = false;
        this.hJ = new org.necrotic.client.f.e[8];
        aJ = false;
        this.fN = false;
        this.fO = false;
        B = "";
        this.bK = "";
        this.eM = -1;
        this.fZ = new org.necrotic.client.c.b.a();
        this.gD = 128;
        this.aI = -1;
        dj = org.necrotic.client.g.a.a();
        this.aU = new String[500];
        this.eI = new String[500];
        this.eJ = new int[500];
        this.dK = new int[5];
        this.ef = new int[50];
        j = 78;
        this.bs = "";
        this.N = new org.necrotic.client.f.e[17];
        w = 3;
        E = false;
        this.L = new int[152];
        this.fW = new org.necrotic.client.n.b[4];
        this.eh = new int[50];
        this.fP = false;
        this.eg = new int[50];
        this.jk = false;
        this.aY = false;
        this.ai = -1;
        this.fB = "";
        y = false;
        this.dA = new String[50];
        this.hC = new int[4000];
        this.hD = new int[4000];
        this.io = new String[]{""};
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
        cY = 20;
        try {
            cG = new org.necrotic.client.n.a.c();
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
        dd = true;
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
        cD = eVar;
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
        if (cD != null) {
            cD.a(iArr, 0, i13);
        }
        k(i13);
    }

    private static final synchronized void A() {
        byte[] bArr;
        if (C()) {
            if (dc && (bArr = dg) != null) {
                if (cM >= 0) {
                    int i2 = cM;
                    int i3 = dh;
                    if (cG != null) {
                        if (cX >= 0) {
                            cW = i2;
                            if (cX != 0) {
                                int j2 = ((j(cX) - cV) + 3600) / i2;
                                cY = j2;
                                if (j2 <= 0) {
                                    cY = 1;
                                }
                            } else {
                                cY = 1;
                            }
                            cz = bArr;
                            cT = i3;
                        } else if (cY == 0) {
                            a(i3, bArr);
                        } else {
                            cT = i3;
                            cz = bArr;
                        }
                    }
                } else if (cR < 0) {
                    a(dh, bArr);
                } else {
                    int i4 = cR;
                    int i5 = dh;
                    if (cG != null) {
                        if (-1 >= (cX ^ (-1))) {
                            int i6 = i4 - 20;
                            if (i6 <= 0) {
                                i6 = 1;
                            }
                            cY = i6;
                            if (cX == 0) {
                                cW = 0;
                            } else {
                                cW = (((cW - 1) + (j(cX) - cV)) + 3600) / cW;
                            }
                            cz = bArr;
                            cT = i5;
                        } else if (cY != 0) {
                            cz = bArr;
                            cT = i5;
                        } else {
                            a(i5, bArr);
                        }
                    }
                }
                dc = false;
            }
            if (cG == null) {
                return;
            }
            if (cX < 0) {
                if (cY > 0) {
                    int i7 = cY - 1;
                    cY = i7;
                    if (i7 == 0) {
                        if (cz == null) {
                            cG.a(256);
                        } else {
                            cG.a(cT);
                            cX = cT;
                            cG.a(cT, cz);
                            cz = null;
                        }
                        cV = 0;
                    }
                }
            } else if (cY > 0) {
                cV += cW;
                cG.a(cX, cV);
                int i8 = cY - 1;
                cY = i8;
                if (i8 == 0) {
                    cG.b();
                    cY = 20;
                    cX = -1;
                }
            }
            cG.b(-122);
        }
    }

    public static final synchronized void b() {
        if (cD != null) {
            cD.a(256);
        }
        k(256);
    }

    private static final synchronized void B() {
        if (!C()) {
            return;
        }
        a(0, (byte[]) null);
        dc = false;
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
        cS += i2;
        while (cS >= l) {
            cS -= l;
            int i3 = cU;
            cU = i3 - (i3 >> 2);
        }
        int i4 = cU - (i2 * 1000);
        cU = i4;
        if (i4 < 0) {
            cU = 0;
        }
    }

    public static final void c() {
        if (cG == null) {
            return;
        }
        a(0, (byte[]) null);
        if (cY > 0) {
            cG.a(256);
            cY = 0;
        }
        cG.a();
        cG = null;
    }

    private static final void a(int i2, byte[] bArr) {
        if (cG != null) {
            if (cX >= 0) {
                cG.b();
                cX = -1;
                cz = null;
                cY = 20;
                cV = 0;
            }
            if (bArr != null) {
                if (cY > 0) {
                    cG.a(i2);
                    cY = 0;
                }
                cX = i2;
                cG.a(i2, bArr);
            }
        }
    }

    private static final boolean C() {
        return cG != null;
    }

    private static void E() {
        org.necrotic.client.n.m.c = false;
        org.necrotic.client.n.l.C = false;
        org.necrotic.client.n.j.c = false;
        org.necrotic.client.c.a.k.f189a = false;
        org.necrotic.a.s = true;
        org.necrotic.a.t = true;
        org.necrotic.a.r = true;
    }

    public static void d(int i2) {
        w = i2;
        cu = true;
    }

    private static final void l(int i2) {
        if (C()) {
            if (dc) {
                dh = i2;
            } else if (cG == null) {
            } else {
                if (cY == 0) {
                    if (cX < 0) {
                        return;
                    }
                    cX = i2;
                    cG.a(i2, 0);
                } else if (cz == null) {
                } else {
                    cT = i2;
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
        Graphics graphics = cl.getGraphics();
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
        return dj;
    }

    private static int G() {
        return cP;
    }

    private static void m(int i2) {
        cP = i2;
    }

    private static int H() {
        return cL;
    }

    private static void n(int i2) {
        cL = i2;
    }

    private static int I() {
        return cO;
    }

    private static void o(int i2) {
        cO = i2;
    }

    private static int J() {
        return da;
    }

    private static void p(int i2) {
        da = i2;
    }

    private static int K() {
        return db;
    }

    private static void q(int i2) {
        db = i2;
    }

    private static int L() {
        return cJ;
    }

    private static void r(int i2) {
        cJ = i2;
    }

    private static int M() {
        return cN;
    }

    private static void s(int i2) {
        cN = i2;
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
        return this.bW >= i2 && this.bW <= i3 && this.bX >= i4 && this.bX <= i5;
    }

    public final void a(int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.fC - 6;
        int i8 = i2 - (i7 << 3);
        int i9 = i3 - ((this.fD - 6) << 3);
        int i10 = this.dJ[10];
        if (i9 > 0 && i9 < 103 && i8 > 0 && i8 < 103) {
            a(-1, i4, i5, i10, i9, 10, i6, i8, 0);
        }
    }

    private static String f(int i2, int i3) {
        return ae.b() + "/index" + i2 + "/" + (i3 != -1 ? i3 + ".gz" : "");
    }

    private void a(int i2, boolean z2) {
        this.bM[aa.u[i2].aN[0][1]] = z2 ? 1 : 0;
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
        this.eS = false;
        this.eT = 0;
        dj.i(195);
        dj.h(6667);
    }

    private void P() {
        if (y) {
            int i2 = 0;
            int i3 = 308;
            while (i2 < 17) {
                if (this.dA[i2] != null) {
                    this.bf.a(this.dA[i2], 9, i3, 16777215, 0, false);
                }
                i2++;
                i3 -= 18;
            }
        }
    }

    private void b(String str, int i2) {
        if (this.ai == -1) {
            E = true;
        }
        for (int i3 = 16; i3 > 0; i3--) {
            String[] strArr = this.dA;
            strArr[i3] = strArr[i3 - 1];
        }
        if (i2 == 0) {
            this.dA[0] = new SimpleDateFormat("HH:mm:ss").format(new Date()) + " " + str;
            return;
        }
        this.dA[0] = str;
    }

    private void g(String str) {
        if (str.equalsIgnoreCase("cls") || str.equalsIgnoreCase("clear")) {
            for (int i2 = 0; i2 < 17; i2++) {
                this.dA[i2] = null;
            }
        }
        if (str.startsWith("vngt")) {
            this.fE = 31;
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
                this.jn = !this.jn;
                break;
            case true:
            case true:
                this.jm = !this.jm;
                break;
        }
        if (aJ) {
            dj.i(231);
            dj.l(str.length() + 1);
            dj.a(str);
        }
    }

    private void a(long j2) {
        if (j2 == 0) {
            return;
        }
        try {
            if (this.aC >= 100 && this.gp != 1) {
                a("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
            } else if (this.aC >= 200) {
                a("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
            } else {
                String a2 = org.necrotic.client.f.a.b.a(org.necrotic.client.f.a.b.a(j2));
                String str = a2;
                if (a2 != null) {
                    if (str.indexOf("@") == 0) {
                        str = this.iK.substring(d(this.iK));
                    }
                    if (str.indexOf("@") == 0) {
                        str = this.iK.substring(d(this.iK));
                    }
                }
                for (int i2 = 0; i2 < this.aC; i2++) {
                    if (this.aD[i2] == j2) {
                        a(str + " is already on your friend list", 0, "");
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f1if; i3++) {
                    if (this.dZ[i3] == j2) {
                        a("Please remove " + str + " from your ignore list first", 0, "");
                        return;
                    }
                }
                if (str.equals(t.y)) {
                    return;
                }
                this.hW[this.aC] = str;
                this.aD[this.aC] = j2;
                this.aE[this.aC] = 0;
                this.aC++;
                dj.i(188);
                dj.a(j2);
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
            if (this.f1if >= 100) {
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
            for (int i2 = 0; i2 < this.f1if; i2++) {
                if (this.dZ[i2] == j2) {
                    a(str + " is already on your ignore list", 0, "");
                    return;
                }
            }
            for (int i3 = 0; i3 < this.aC; i3++) {
                if (this.aD[i3] == j2) {
                    a("Please remove " + str + " from your friend list first", 0, "");
                    return;
                }
            }
            long[] jArr = this.dZ;
            int i4 = this.f1if;
            this.f1if = i4 + 1;
            jArr[i4] = j2;
            dj.i(133);
            dj.a(j2);
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
        if (this.eG == 0 && this.eO == 0) {
            this.aU[this.aV] = "Walk here";
            this.aT[this.aV] = 516;
            this.iz[this.aV] = this.bW;
            this.iA[this.aV] = this.bX;
            this.aV++;
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
                if (i9 == 2 && this.jl.c(this.bn, i7, i8, i6) >= 0) {
                    int i11 = org.necrotic.client.n.d.h[i5];
                    i10 = i11;
                    org.necrotic.client.c.a.k a2 = org.necrotic.client.c.a.k.a(i11);
                    org.necrotic.client.c.a.k kVar2 = a2;
                    if (a2.m != null) {
                        int i12 = -1;
                        if (kVar2.s != -1) {
                            org.necrotic.client.c.a.n nVar = org.necrotic.client.c.a.n.f192a[kVar2.s];
                            int i13 = nVar.b;
                            int i14 = nVar.c;
                            i12 = (org.necrotic.client.c.a.k.b.bM[i13] >> i14) & m[nVar.d - i14];
                        } else if (kVar2.i != -1) {
                            i12 = org.necrotic.client.c.a.k.b.bM[kVar2.i];
                        }
                        if (i12 < 0 || i12 >= kVar2.m.length || kVar2.m[i12] == -1) {
                            kVar = null;
                        } else {
                            kVar = org.necrotic.client.c.a.k.a(kVar2.m[i12]);
                        }
                        kVar2 = kVar;
                    }
                    if (this.aj + i7 == 3090 && this.ak + i8 == 3956) {
                        this.aU[this.aV] = "Pull @cya@Lever";
                        this.aT[this.aV] = 502;
                        this.iy[this.aV] = i6;
                        this.iz[this.aV] = i7;
                        this.iA[this.aV] = i8;
                        this.jB[this.aV] = 5959;
                        this.aV++;
                        this.aU[this.aV] = "Examine @cya@ Lever";
                        this.aT[this.aV] = 1226;
                        this.iy[this.aV] = 950;
                        this.iz[this.aV] = i7;
                        this.iA[this.aV] = i8;
                        this.jB[this.aV] = 5959;
                        this.aV++;
                        return;
                    } else if (this.aj + i7 == 2539 && this.ak + i8 == 4712) {
                        this.aU[this.aV] = "Pull @cya@Lever";
                        this.aT[this.aV] = 502;
                        this.iy[this.aV] = i6;
                        this.iz[this.aV] = i7;
                        this.iA[this.aV] = i8;
                        this.jB[this.aV] = 5960;
                        this.aV++;
                        this.aU[this.aV] = "Examine @cya@Lever";
                        this.aT[this.aV] = 1226;
                        this.iy[this.aV] = 950;
                        this.iz[this.aV] = i7;
                        this.iA[this.aV] = i8;
                        this.jB[this.aV] = 5960;
                        this.aV++;
                        return;
                    } else if (kVar2 != null) {
                        if (this.eG == 1) {
                            this.aU[this.aV] = "Use " + this.iS + " with @cya@" + kVar2.f;
                            this.aT[this.aV] = 62;
                            iArr = this.iy;
                            i2 = this.aV;
                            i3 = i6;
                        } else if (this.eO == 1) {
                            if ((this.iW & 4) == 4) {
                                this.aU[this.aV] = this.iV + " @cya@" + kVar2.f;
                                this.aT[this.aV] = 956;
                                iArr = this.iy;
                                i2 = this.aV;
                                i3 = i6;
                            }
                        } else {
                            if (kVar2 != null && kVar2.y != null) {
                                for (int i15 = 4; i15 >= 0; i15--) {
                                    if (kVar2.y[i15] != null) {
                                        this.aU[this.aV] = kVar2.y[i15] + " @cya@" + kVar2.f;
                                        if (i15 == 0) {
                                            this.aT[this.aV] = 502;
                                        }
                                        if (i15 == 1) {
                                            this.aT[this.aV] = 900;
                                        }
                                        if (i15 == 2) {
                                            this.aT[this.aV] = 113;
                                        }
                                        if (i15 == 3) {
                                            this.aT[this.aV] = 872;
                                        }
                                        if (i15 == 4) {
                                            this.aT[this.aV] = 1062;
                                        }
                                        this.iy[this.aV] = i6;
                                        this.iz[this.aV] = i7;
                                        this.iA[this.aV] = i8;
                                        this.jB[this.aV] = i10;
                                        this.aV++;
                                    }
                                }
                            }
                            this.aU[this.aV] = this.bc == 4 ? "Examine @cya@" + kVar2.f + " @gre@(@whi@" + kVar2.j + "@gre@) (@whi@" + (i7 + this.aj) + "," + (i8 + this.ak) + ") @or1@(" + kVar2.x + ")@gre@)" : "Examine @cya@" + kVar2.f;
                            this.aT[this.aV] = 1226;
                            iArr = this.iy;
                            i2 = this.aV;
                            i3 = kVar2 == null ? -1 : kVar2.j << 14;
                        }
                        iArr[i2] = i3;
                        this.iz[this.aV] = i7;
                        this.iA[this.aV] = i8;
                        this.jB[this.aV] = i10;
                        this.aV++;
                    }
                }
                if (i9 == 1) {
                    org.necrotic.client.j.e eVar = this.bj[i10];
                    if (eVar.c.t == 1 && (eVar.aJ & 127) == 64 && (eVar.aK & 127) == 64) {
                        for (int i16 = 0; i16 < this.bk; i16++) {
                            org.necrotic.client.j.e eVar2 = this.bj[this.bl[i16]];
                            if (eVar2 != null && eVar2 != eVar && eVar2.c.t == 1 && eVar2.aJ == eVar.aJ && eVar2.aK == eVar.aK) {
                                a(eVar2.c, this.bl[i16], i8, i7);
                            }
                        }
                        for (int i17 = 0; i17 < this.bp; i17++) {
                            org.necrotic.client.e.a.a aVar2 = this.bo[this.bq[i17]];
                            if (aVar2 != null && aVar2.aJ == eVar.aJ && aVar2.aK == eVar.aK) {
                                a(i7, this.bq[i17], aVar2, i8);
                            }
                        }
                    }
                    a(eVar.c, i10, i8, i7);
                }
                if (i9 == 0) {
                    org.necrotic.client.e.a.a aVar3 = this.bo[i10];
                    if ((aVar3.aJ & 127) == 64 && (aVar3.aK & 127) == 64) {
                        for (int i18 = 0; i18 < this.bk; i18++) {
                            org.necrotic.client.j.e eVar3 = this.bj[this.bl[i18]];
                            if (eVar3 != null) {
                                try {
                                    if (eVar3.c.t == 1 && eVar3.aJ == aVar3.aJ && eVar3.aK == aVar3.aK) {
                                        a(eVar3.c, this.bl[i18], i8, i7);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                        for (int i19 = 0; i19 < this.bp; i19++) {
                            org.necrotic.client.e.a.a aVar4 = this.bo[this.bq[i19]];
                            if (aVar4 != null && aVar4 != aVar3 && aVar4.aJ == aVar3.aJ && aVar4.aK == aVar3.aK) {
                                a(i7, this.bq[i19], aVar4, i8);
                            }
                        }
                    }
                    a(i7, i10, aVar3, i8);
                }
                if (i9 == 3 && (aVar = this.aG[this.bn][i7][i8]) != null) {
                    org.necrotic.client.c.b.b a3 = aVar.a();
                    while (true) {
                        org.necrotic.client.j.d dVar = (org.necrotic.client.j.d) a3;
                        if (dVar != null) {
                            org.necrotic.client.c.a.i a4 = org.necrotic.client.c.a.i.a(dVar.d);
                            if (this.eG == 1) {
                                this.aU[this.aV] = "Use " + this.iS + " with @lre@" + a4.G + (this.bc == 4 ? " (" + a4.w + ") @or1@(" + a4.l + ")" : "");
                                this.aT[this.aV] = 511;
                                this.iy[this.aV] = dVar.d;
                                this.iz[this.aV] = i7;
                                this.iA[this.aV] = i8;
                                this.jB[this.aV] = i10;
                                this.aV++;
                            } else if (this.eO == 1) {
                                if ((this.iW & 1) == 1) {
                                    this.aU[this.aV] = this.iV + " @lre@" + a4.G + (this.bc == 4 ? " (" + a4.w + ") @or1@(" + a4.l + ")" : "");
                                    this.aT[this.aV] = 94;
                                    this.iy[this.aV] = dVar.d;
                                    this.iz[this.aV] = i7;
                                    this.iA[this.aV] = i8;
                                    this.jB[this.aV] = i10;
                                    this.aV++;
                                }
                            } else {
                                for (int i20 = 4; i20 >= 0; i20--) {
                                    if (a4.v != null && a4.v[i20] != null) {
                                        this.aU[this.aV] = a4.v[i20] + " @lre@" + a4.G + (this.bc == 4 ? " (" + a4.w + ") @or1@(" + a4.l + ")" : "");
                                        if (i20 == 0) {
                                            this.aT[this.aV] = 652;
                                        }
                                        if (i20 == 1) {
                                            this.aT[this.aV] = 567;
                                        }
                                        if (i20 == 2) {
                                            this.aT[this.aV] = 234;
                                        }
                                        if (i20 == 3) {
                                            this.aT[this.aV] = 244;
                                        }
                                        if (i20 == 4) {
                                            this.aT[this.aV] = 213;
                                        }
                                        this.iy[this.aV] = dVar.d;
                                        this.iz[this.aV] = i7;
                                        this.iA[this.aV] = i8;
                                        this.jB[this.aV] = i10;
                                        this.jC[this.aV] = dVar.e.ordinal();
                                        this.aV++;
                                    } else if (i20 == 2) {
                                        this.aU[this.aV] = "Take @lre@" + a4.G + (this.bc == 4 ? " (" + a4.w + ") @or1@(" + a4.l + ")" : "");
                                        this.aT[this.aV] = 234;
                                        this.iy[this.aV] = dVar.d;
                                        this.iz[this.aV] = i7;
                                        this.iA[this.aV] = i8;
                                        this.jB[this.aV] = i10;
                                        this.jC[this.aV] = dVar.e.ordinal();
                                        this.aV++;
                                    }
                                }
                                this.aU[this.aV] = "Examine @lre@" + a4.G + (this.bc == 4 ? " (" + a4.w + ") @or1@(" + a4.l + ") @or2@(" + a4.l + ")" : "");
                                this.aT[this.aV] = 1448;
                                this.iy[this.aV] = dVar.d;
                                this.iz[this.aV] = i7;
                                this.iA[this.aV] = i8;
                                this.jB[this.aV] = i10;
                                this.aV++;
                            }
                            a3 = aVar.b();
                        }
                    }
                }
            }
        }
    }

    private void a(org.necrotic.client.c.a.j jVar, int i2, int i3, int i4) {
        if (this.aV >= 400) {
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
        if (this.eG == 1) {
            this.aU[this.aV] = "Use " + this.iS + " with @yel@" + str;
            this.aT[this.aV] = 582;
            this.iy[this.aV] = i2;
            this.iz[this.aV] = i4;
            this.iA[this.aV] = i3;
            this.aV++;
        } else if (this.eO == 1) {
            if ((this.iW & 2) == 2) {
                this.aU[this.aV] = this.iV + " @yel@" + str;
                this.aT[this.aV] = 413;
                this.iy[this.aV] = i2;
                this.iz[this.aV] = i4;
                this.iA[this.aV] = i3;
                this.aV++;
            }
        } else {
            if (jVar.g != null) {
                for (int i5 = 4; i5 >= 0; i5--) {
                    if (jVar.g[i5] != null && !jVar.g[i5].equalsIgnoreCase("attack")) {
                        this.aU[this.aV] = jVar.g[i5] + " @yel@" + str;
                        if (i5 == 0) {
                            this.aT[this.aV] = 20;
                        }
                        if (i5 == 1) {
                            this.aT[this.aV] = 412;
                        }
                        if (i5 == 2) {
                            this.aT[this.aV] = 225;
                        }
                        if (i5 == 3) {
                            this.aT[this.aV] = 965;
                        }
                        if (i5 == 4) {
                            this.aT[this.aV] = 478;
                        }
                        this.iy[this.aV] = i2;
                        this.iz[this.aV] = i4;
                        this.iA[this.aV] = i3;
                        this.aV++;
                    }
                }
            }
            if (jVar.g != null) {
                for (int i6 = 4; i6 >= 0; i6--) {
                    if (jVar.g[i6] != null && jVar.g[i6].equalsIgnoreCase("attack")) {
                        this.aU[this.aV] = jVar.g[i6] + " @yel@" + str;
                        if (i6 == 0) {
                            this.aT[this.aV] = 20;
                        }
                        if (i6 == 1) {
                            this.aT[this.aV] = 412;
                        }
                        if (i6 == 2) {
                            this.aT[this.aV] = 225;
                        }
                        if (i6 == 3) {
                            this.aT[this.aV] = 965;
                        }
                        if (i6 == 4) {
                            this.aT[this.aV] = 478;
                        }
                        this.iy[this.aV] = i2;
                        this.iz[this.aV] = i4;
                        this.iA[this.aV] = i3;
                        this.aV++;
                        this.aU[this.aV] = "@yel@Show drops";
                        this.aT[this.aV] = 1075;
                        this.iy[this.aV] = i2;
                        this.iz[this.aV] = i4;
                        this.iA[this.aV] = i3;
                        this.aV++;
                    }
                }
            }
            if (jVar.w == 3062 || jVar.w == 770 || jVar.w == 771 || jVar.w == 769 || jVar.w == 6960 || jVar.w == 6958 || jVar.w == 6968 || jVar.w == 6964 || jVar.w == 350 || jVar.w == 351 || jVar.w == 352 || jVar.w == 928 || jVar.w == 4000 || jVar.w == 4001 || jVar.w == 271 || jVar.w == 133 || jVar.w == 105 || jVar.w == 4414 || jVar.w == 189 || jVar.w == 4444 || jVar.w == 1902 || jVar.w == 8802 || jVar.w == 3309 || jVar.w == 1898 || jVar.w == 302 || jVar.w == 1890 || jVar.w == 1894 || jVar.w == 1893 || jVar.w == 1892 || jVar.w == 1904 || jVar.w == 3001 || jVar.w == 5001 || jVar.w == 3377 || jVar.w == 4969 || jVar.w == 6913 || jVar.w == 6919 || jVar.w == 6942 || jVar.w == 6945 || jVar.w == 3033 || jVar.w == 3030 || jVar.w == 3031 || jVar.w == 3032 || jVar.w == 3034 || jVar.w == 3035 || jVar.w == 3036 || jVar.w == 3037 || jVar.w == 3038 || jVar.w == 3039 || jVar.w == 3040 || jVar.w == 3047 || jVar.w == 3048 || jVar.w == 3050 || jVar.w == 3051 || jVar.w == 3052 || jVar.w == 3053 || jVar.w == 3054 || jVar.w == 3055 || jVar.w == 3056 || jVar.w == 3057 || jVar.w == 3058 || jVar.w == 3059 || jVar.w == 3060 || jVar.w == 3061 || jVar.w == 6302 || jVar.w == 6303 || jVar.w == 6304 || jVar.w == 6305 || jVar.w == 6306 || jVar.w == 6307 || jVar.w == 6308 || jVar.w == 6309 || jVar.w == 6310 || jVar.w == 6312 || jVar.w == 6313 || jVar.w == 6314 || jVar.w == 6315 || jVar.w == 6316 || jVar.w == 6317 || jVar.w == 6318 || jVar.w == 6319 || jVar.w == 6320 || jVar.w == 6311 || jVar.w == 6322 || jVar.w == 6323 || jVar.w == 6324 || jVar.w == 3062 || jVar.w == 1906 || jVar.w == 184 || jVar.w == 6431 || jVar.w == 1801 || jVar.w == 10 || jVar.w == 3062) {
                this.aU[this.aV] = "@yel@Pick-up " + jVar.r;
                this.aT[this.aV] = 1075;
                this.iy[this.aV] = i2;
                this.iz[this.aV] = i4;
                this.iA[this.aV] = i3;
                this.aV++;
            }
            if (this.bc == 4) {
                str = str + " @whi@(@gre@" + jVar.w + "@whi@)" + jVar.s[0];
            }
            this.aU[this.aV] = "Examine @yel@".concat(String.valueOf(str));
            this.aT[this.aV] = 1025;
            this.iy[this.aV] = i2;
            this.iz[this.aV] = i4;
            this.iA[this.aV] = i3;
            this.aV++;
        }
    }

    private void a(int i2, int i3, org.necrotic.client.e.a.a aVar, int i4) {
        String str;
        if (aVar == t || this.aV >= 400) {
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
        if (this.eG == 1) {
            this.aU[this.aV] = "Use " + this.iS + " with @whi@" + str;
            this.aT[this.aV] = 491;
            this.iy[this.aV] = i3;
            this.iz[this.aV] = i2;
            this.iA[this.aV] = i4;
            this.aV++;
        } else if (this.eO == 1) {
            if ((this.iW & 8) == 8) {
                this.aU[this.aV] = this.iV + " @whi@" + str;
                this.aT[this.aV] = 365;
                this.iy[this.aV] = i3;
                this.iz[this.aV] = i2;
                this.iA[this.aV] = i4;
                this.aV++;
            }
        } else {
            for (int i5 = 6; i5 >= 0; i5--) {
                if (this.dp[i5] != null) {
                    this.aU[this.aV] = this.dp[i5] + " @whi@" + str;
                    int i6 = 0;
                    if (this.dp[i5].equalsIgnoreCase("attack")) {
                        if (t.z != 0 && aVar.z != 0) {
                            i6 = t.z == aVar.z ? 2000 : 0;
                        }
                    } else if (this.dq[i5]) {
                        i6 = 2000;
                    }
                    if (i5 == 0) {
                        this.aT[this.aV] = i6 + 561;
                    }
                    if (i5 == 1) {
                        this.aT[this.aV] = i6 + 779;
                    }
                    if (i5 == 2) {
                        this.aT[this.aV] = i6 + 27;
                    }
                    if (i5 == 3) {
                        this.aT[this.aV] = i6 + 577;
                    }
                    if (i5 == 4) {
                        this.aT[this.aV] = i6 + 729;
                    }
                    if (i5 == 5) {
                        this.aT[this.aV] = 8300;
                    }
                    if (i5 == 6) {
                        this.aT[this.aV] = 8305;
                    }
                    this.iy[this.aV] = i3;
                    this.iz[this.aV] = i2;
                    this.iA[this.aV] = i4;
                    this.aV++;
                }
            }
        }
        for (int i7 = 0; i7 < this.aV; i7++) {
            if (this.aT[i7] == 516) {
                this.aU[i7] = "Walk here @whi@".concat(String.valueOf(str));
                return;
            }
        }
    }

    private void t(int i2) {
        if (!this.ic || this.bL.b()) {
            return;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 500; i4++) {
            if (this.ao[i4] != null) {
                int i5 = this.au[i4];
                int i6 = (70 - (i3 * 14)) + 42 + i + 4 + 5;
                if (i6 >= -23) {
                    String str = this.ap[i4];
                    if (this.av != 1) {
                        if (this.av != 2) {
                            if (this.av != 3 && this.av != 4) {
                                if (this.aH != 3) {
                                    if (this.av != 5) {
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
                                        if ((i5 == 1 || i5 == 2) && (i5 == 1 || this.bu == 0 || (this.bu == 1 && e(str)))) {
                                            if (i2 > i6 - 14 && i2 <= i6 && !t.y.equals(cq.matcher(str).replaceAll(""))) {
                                                if (!e(str)) {
                                                    this.aU[this.aV] = "Add ignore @whi@".concat(String.valueOf(str));
                                                    this.aT[this.aV] = 42;
                                                    this.aV++;
                                                    this.aU[this.aV] = "Add friend @whi@".concat(String.valueOf(str));
                                                    this.aT[this.aV] = 337;
                                                    this.aV++;
                                                } else if (e(str)) {
                                                    this.aU[this.aV] = "Message @whi@".concat(String.valueOf(str));
                                                    this.aT[this.aV] = 2639;
                                                    this.aV++;
                                                }
                                            }
                                            i3++;
                                        }
                                        if ((i5 == 3 || i5 == 7) && this.bw == 0 && (i5 == 7 || this.br == 0 || (this.br == 1 && e(str)))) {
                                            if (i2 > i6 - 14 && i2 <= i6) {
                                                if (!e(str)) {
                                                    this.aU[this.aV] = "Add ignore @whi@".concat(String.valueOf(str));
                                                    this.aT[this.aV] = 42;
                                                    this.aV++;
                                                    this.aU[this.aV] = "Add friend @whi@".concat(String.valueOf(str));
                                                    this.aT[this.aV] = 337;
                                                    this.aV++;
                                                } else if (e(str)) {
                                                    this.aU[this.aV] = "Message @whi@".concat(String.valueOf(str));
                                                    this.aT[this.aV] = 2639;
                                                    this.aV++;
                                                }
                                            }
                                            i3++;
                                        }
                                        if (i5 == 4 && (this.bz == 0 || (this.bz == 1 && e(str)))) {
                                            if (i2 > i6 - 14 && i2 <= i6) {
                                                this.aU[this.aV] = "Accept trade @whi@".concat(String.valueOf(str));
                                                this.aT[this.aV] = 484;
                                                this.aV++;
                                            }
                                            i3++;
                                        }
                                        if ((i5 == 5 || i5 == 6) && this.bw == 0 && this.br < 2) {
                                            i3++;
                                        }
                                        if (i5 == 8 && (this.bF == 0 || (this.bF == 1 && e(str)))) {
                                            if (i2 > i6 - 14 && i2 <= i6) {
                                                this.aU[this.aV] = "Accept challenge @whi@".concat(String.valueOf(str));
                                                this.aT[this.aV] = 6;
                                                this.aV++;
                                            }
                                            i3++;
                                        }
                                        if (i5 == 21) {
                                            if (i2 > i6 - 14 && i2 <= i6) {
                                                this.aU[this.aV] = "Accept gamble @whi@".concat(String.valueOf(str));
                                                this.aT[this.aV] = 1673;
                                                this.aV++;
                                            }
                                            i3++;
                                        }
                                        if (i5 == 22) {
                                            if (i2 > i6 - 14 && i2 <= i6) {
                                                this.aU[this.aV] = "Accept raid request @whi@".concat(String.valueOf(str));
                                                this.aT[this.aV] = 1773;
                                                this.aV++;
                                            }
                                            i3++;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    org.necrotic.client.f.c.i iVar = this.eZ;
                                    int i7 = 0;
                                    for (int i8 = 0; i8 < 100 && q.U.length() != 0 && iVar.c != 0 && q.U != ""; i8++) {
                                        String c2 = c(iVar.d[i8]);
                                        for (int i9 = 0; i9 <= 20; i9++) {
                                            if (c2.contains(" <img=" + i9 + ">")) {
                                                c2 = c2.replaceAll(" <img=" + i9 + ">", "");
                                            }
                                        }
                                        int i10 = (21 + (i7 * 14)) - iVar.f;
                                        if (i2 > i10 - 14 && i2 <= i10 && q.bW > 74 && q.bW < 495) {
                                            q.aU[q.aV] = String.valueOf(c2);
                                            q.aT[q.aV] = 1251;
                                            q.aV++;
                                        }
                                        i7++;
                                    }
                                    return;
                                }
                            } else {
                                int i11 = 0;
                                for (int i12 = 0; i12 < 500; i12++) {
                                    if (this.ao[i12] != null && (this.av == 3 || this.av == 4)) {
                                        int i13 = this.au[i12];
                                        String str3 = this.ap[i12];
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
                                        if (this.av == 3 && i13 == 4 && (this.bz == 0 || (this.bz == 1 && e(str3)))) {
                                            if (i2 > i14 - 14 && i2 <= i14) {
                                                this.aU[this.aV] = "Accept trade @whi@".concat(String.valueOf(str3));
                                                this.aT[this.aV] = 484;
                                                this.aV++;
                                            }
                                            i11++;
                                        }
                                        if (this.av == 4 && i13 == 8 && (this.bF == 0 || (this.bF == 1 && e(str3)))) {
                                            if (i2 > i14 - 14 && i2 <= i14) {
                                                this.aU[this.aV] = "Accept challenge @whi@".concat(String.valueOf(str3));
                                                this.aT[this.aV] = 6;
                                                this.aV++;
                                            }
                                            i11++;
                                        }
                                        if (i13 == 12) {
                                            if (i2 > i14 - 14 && i2 <= i14) {
                                                this.aU[this.aV] = "Go-to @blu@".concat(String.valueOf(str3));
                                                this.aT[this.aV] = 915;
                                                this.aV++;
                                            }
                                            i11++;
                                        }
                                        if (i13 == 21) {
                                            if (i2 > i14 - 14 && i2 <= i14) {
                                                this.aU[this.aV] = "Accept gamble @whi@".concat(String.valueOf(str3));
                                                this.aT[this.aV] = 1673;
                                                this.aV++;
                                            }
                                            i11++;
                                        }
                                        if (i13 == 22) {
                                            if (i2 > i14 - 14 && i2 <= i14) {
                                                this.aU[this.aV] = "Accept raid request @whi@".concat(String.valueOf(str3));
                                                this.aT[this.aV] = 1773;
                                                this.aV++;
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
                                if (this.ao[i16] != null && this.av == 2) {
                                    int i17 = this.au[i16];
                                    String str4 = this.ap[i16];
                                    int i18 = (70 - (i15 * 14)) + 42 + i + 4 + 5;
                                    if (i18 < -23) {
                                        return;
                                    }
                                    if (str4 != null) {
                                        if (str4.indexOf("@") == 0) {
                                            str4 = str4.substring(d(this.iK));
                                        }
                                        if (str4.indexOf("@") == 0) {
                                            str4 = str4.substring(d(this.iK));
                                        }
                                    }
                                    if ((i17 == 5 || i17 == 6) && ((this.bw == 0 || this.av == 2) && (i17 == 6 || this.br == 0 || (this.br == 1 && e(str4))))) {
                                        i15++;
                                    }
                                    if ((i17 == 3 || i17 == 7) && ((this.bw == 0 || this.av == 2) && (i17 == 7 || this.br == 0 || (this.br == 1 && e(str4))))) {
                                        if (i2 > i18 - 14 && i2 <= i18) {
                                            if (!e(str4)) {
                                                this.aU[this.aV] = "Add ignore @whi@".concat(String.valueOf(str4));
                                                this.aT[this.aV] = 42;
                                                this.aV++;
                                                this.aU[this.aV] = "Add friend @whi@".concat(String.valueOf(str4));
                                                this.aT[this.aV] = 337;
                                                this.aV++;
                                            } else if (e(str4)) {
                                                this.aU[this.aV] = "Message @whi@".concat(String.valueOf(str4));
                                                this.aT[this.aV] = 2639;
                                                this.aV++;
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
                            if (this.ao[i20] != null && this.av == 1) {
                                int i21 = this.au[i20];
                                String str5 = this.ap[i20];
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
                                if ((i21 == 1 || i21 == 2) && (i21 == 1 || this.bu == 0 || (this.bu == 1 && e(str5)))) {
                                    if (i2 > i22 - 14 && i2 <= i22 && !str5.equals(t.y)) {
                                        if (!e(str5)) {
                                            this.aU[this.aV] = "Add ignore @whi@".concat(String.valueOf(str5));
                                            this.aT[this.aV] = 42;
                                            this.aV++;
                                            this.aU[this.aV] = "Add friend @whi@".concat(String.valueOf(str5));
                                            this.aT[this.aV] = 337;
                                            this.aV++;
                                        } else if (e(str5)) {
                                            this.aU[this.aV] = "Message @whi@".concat(String.valueOf(str5));
                                            this.aT[this.aV] = 2639;
                                            this.aV++;
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
            this.aU[this.aV] = "Remove @whi@" + this.hW[i2];
            this.aT[this.aV] = 792;
            this.aV++;
            this.aU[this.aV] = "Message @whi@" + this.hW[i2];
            this.aT[this.aV] = 639;
            this.aV++;
            return true;
        } else if (i3 >= 401 && i3 <= 500) {
            this.aU[this.aV] = "Remove @whi@" + aaVar.an;
            this.aT[this.aV] = 322;
            this.aV++;
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
                if (this.bO != 0) {
                    i3 = this.bP;
                    i5 = this.bQ;
                }
                if ((aaVar2.ab >= 0 || aaVar2.K != 0) && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                    if (aaVar2.ab >= 0) {
                        this.gW = aaVar2.ab;
                    } else {
                        this.gW = aaVar2.ac;
                    }
                }
                if ((aaVar2.aK == 8 || aaVar2.aK == 10) && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                    this.gS = aaVar2.ac;
                    if (aaVar2.ac != this.fq) {
                        this.fq = aaVar2.ac;
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
                    if (aaVar2.aK == 100 && C && aaVar2.g != null && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        a(this.bW - i10, this.bX - i11, aaVar2.g);
                    }
                    aaVar2.i = false;
                    if (aaVar2.h && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        aaVar2.i = true;
                        if (aaVar2.S == 0) {
                            String str = aaVar2.aI;
                            String str2 = str;
                            if (str != null) {
                                if ((this.bc == 4 || this.bc == 3) && !str2.isEmpty()) {
                                    str2 = str2 + " - Id: " + aaVar2.ac;
                                }
                                this.aU[this.aV] = str2;
                                this.aT[this.aV] = 777;
                                this.iA[this.aV] = aaVar2.ac;
                                this.aV++;
                            }
                        }
                    }
                    if (aaVar2.S == 1 && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa && (aaVar2.as < 113500 || aaVar2.as >= 114000 || !aaVar2.an.equalsIgnoreCase(""))) {
                        if (aaVar2.aK == 42) {
                            dm = aaVar2;
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
                                        this.aU[this.aV] = str3;
                                        this.aT[this.aV] = 222;
                                        this.iA[this.aV] = aaVar2.ac;
                                        this.jw = this.aV;
                                        this.aV++;
                                    }
                                }
                            }
                            String str4 = aaVar2.aI;
                            String str5 = str4;
                            if (str4 != null) {
                                if (this.bc == 4) {
                                    str5 = str5 + " - Id: " + aaVar2.ac;
                                }
                                if (!str5.contains("[GE")) {
                                    this.aU[this.aV] = str5;
                                    this.aT[this.aV] = 315;
                                    this.iA[this.aV] = aaVar2.ac;
                                    this.aV++;
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
                            this.aU[this.aV] = "Autocast @gre@" + aaVar2.az;
                            this.aT[this.aV] = 104;
                            this.iA[this.aV] = aaVar2.ac;
                            this.aV++;
                        }
                        this.aU[this.aV] = str7 + " @gre@" + aaVar2.az + (this.bc == 4 ? ", " + aaVar2.ac : "");
                        this.aT[this.aV] = 626;
                        this.iA[this.aV] = aaVar2.ac;
                        this.aV++;
                    }
                    if (aaVar2.S == 3 && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        this.aU[this.aV] = "Close";
                        this.aT[this.aV] = 200;
                        this.iA[this.aV] = aaVar2.ac;
                        this.aV++;
                    }
                    if (aaVar2.S == 4 && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        this.aU[this.aV] = aaVar2.aI + (this.bc == 4 ? ", " + aaVar2.ac : "");
                        this.aT[this.aV] = 169;
                        this.iA[this.aV] = aaVar2.ac;
                        this.aV++;
                        String str8 = aaVar2.aJ;
                    }
                    if (aaVar2.S == 5 && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        dm = aaVar2;
                        this.aU[this.aV] = aaVar2.aI + (this.bc == 4 ? ", " + aaVar2.ac : "");
                        this.aT[this.aV] = 646;
                        this.iA[this.aV] = aaVar2.ac;
                        this.aV++;
                    }
                    if (aaVar2.S == 6 && !this.eu && i3 >= i10 && i5 >= i11 && i3 < i10 + aaVar2.aO && i5 < i11 + aaVar2.aa) {
                        this.aU[this.aV] = aaVar2.aI + (this.bc == 4 ? ", " + aaVar2.ac : "");
                        this.aT[this.aV] = 679;
                        this.iA[this.aV] = aaVar2.ac;
                        this.aV++;
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
                                    this.iG = i12;
                                    this.ij = aaVar2.ac;
                                    if (aaVar2.ae[i12] > 0) {
                                        int i17 = aaVar2.ae[i12] - 1;
                                        if (i17 <= org.necrotic.client.c.a.i.g) {
                                            org.necrotic.client.c.a.i a2 = org.necrotic.client.c.a.i.a(i17);
                                            this.jT = aaVar2.ae[i12] - 1;
                                            if (this.jT != this.fd) {
                                                a(a2);
                                                this.fd = aaVar2.ae[i12] - 1;
                                                this.fe = true;
                                            }
                                            if (this.eG == 1 && aaVar2.ak) {
                                                if (aaVar2.ac != this.gQ || i12 != this.gP) {
                                                    this.aU[this.aV] = "Use " + this.iS + " with @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                    this.aT[this.aV] = 870;
                                                    this.iy[this.aV] = a2.w;
                                                    this.iz[this.aV] = i12;
                                                    this.iA[this.aV] = aaVar2.ac;
                                                    this.aV++;
                                                }
                                            } else if (this.eO == 1 && aaVar2.ak) {
                                                if ((this.iW & 16) == 16) {
                                                    this.aU[this.aV] = this.iV + " @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                    this.aT[this.aV] = 543;
                                                    this.iy[this.aV] = a2.w;
                                                    this.iz[this.aV] = i12;
                                                    this.iA[this.aV] = aaVar2.ac;
                                                    this.aV++;
                                                }
                                            } else {
                                                if (aaVar2.ak && ((!f || !ct) && u != 24700 && u != 2700)) {
                                                    for (int i18 = 4; i18 >= 3; i18--) {
                                                        if (a2.j != null && a2.j[i18] != null) {
                                                            this.aU[this.aV] = a2.j[i18] + " @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                            if (i18 == 3) {
                                                                this.aT[this.aV] = 493;
                                                            }
                                                            if (i18 == 4) {
                                                                this.aT[this.aV] = 847;
                                                            }
                                                            this.iy[this.aV] = a2.w;
                                                            this.iz[this.aV] = i12;
                                                            this.iA[this.aV] = aaVar2.ac;
                                                            this.aV++;
                                                        } else if (i18 == 4) {
                                                            this.aU[this.aV] = "Drop @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                            this.aT[this.aV] = 847;
                                                            this.iy[this.aV] = a2.w;
                                                            this.iz[this.aV] = i12;
                                                            this.iA[this.aV] = aaVar2.ac;
                                                            this.aV++;
                                                        }
                                                    }
                                                }
                                                if (aaVar2.aL) {
                                                    if (u == 24700) {
                                                        this.aU[this.aV] = "Offer @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                        this.aT[this.aV] = 24700;
                                                        this.iy[this.aV] = a2.w;
                                                        p().f217a = a2.w;
                                                    } else if (u == 2700) {
                                                        this.aU[this.aV] = "Store @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                        this.aT[this.aV] = 2700;
                                                        this.iy[this.aV] = a2.w;
                                                    } else {
                                                        this.aU[this.aV] = "Use @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                        this.aT[this.aV] = 447;
                                                        this.iy[this.aV] = a2.w;
                                                    }
                                                    this.iz[this.aV] = i12;
                                                    this.iA[this.aV] = aaVar2.ac;
                                                    this.aV++;
                                                }
                                                if (u != 24700 && aaVar2.ak && a2.j != null) {
                                                    for (int i19 = 2; i19 >= 0; i19--) {
                                                        if (a2.j[i19] != null) {
                                                            this.aU[this.aV] = a2.j[i19] + " @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                            if (i19 == 0) {
                                                                this.aT[this.aV] = 74;
                                                            }
                                                            if (i19 == 1) {
                                                                this.aT[this.aV] = 454;
                                                            }
                                                            if (i19 == 2) {
                                                                this.aT[this.aV] = 539;
                                                            }
                                                            this.iy[this.aV] = a2.w;
                                                            this.iz[this.aV] = i12;
                                                            this.iA[this.aV] = aaVar2.ac;
                                                            this.aV++;
                                                        }
                                                    }
                                                }
                                                if (aaVar2.ak && f && ct) {
                                                    for (int i20 = 4; i20 >= 3; i20--) {
                                                        if (a2.j != null && a2.j[i20] != null) {
                                                            this.aU[this.aV] = a2.j[i20] + " @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                            if (i20 == 3) {
                                                                this.aT[this.aV] = 493;
                                                            }
                                                            if (i20 == 4) {
                                                                this.aT[this.aV] = 847;
                                                            }
                                                            this.iy[this.aV] = a2.w;
                                                            this.iz[this.aV] = i12;
                                                            this.iA[this.aV] = aaVar2.ac;
                                                            this.aV++;
                                                        } else if (i20 == 4) {
                                                            this.aU[this.aV] = "Drop @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                            this.aT[this.aV] = 847;
                                                            this.iy[this.aV] = a2.w;
                                                            this.iz[this.aV] = i12;
                                                            this.iA[this.aV] = aaVar2.ac;
                                                            this.aV++;
                                                        }
                                                    }
                                                } else if (aaVar2.H != null) {
                                                    int i21 = aaVar2.ac;
                                                    for (int i22 = 4; i22 >= 0; i22--) {
                                                        if ((aaVar2.H[i22] != null && !aaVar2.H[i22].equalsIgnoreCase("operate")) || (a2.k[this.aV] != null && aaVar2.ac == 1688)) {
                                                            if (aaVar2.ac == 1688) {
                                                                if (a2.k[this.aV] != null) {
                                                                    this.aU[this.aV] = a2.k[this.aV] + " @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                                } else if (aaVar2.H[i22] != null) {
                                                                    this.aU[this.aV] = aaVar2.H[i22] + " @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                                }
                                                                if (i22 == 0) {
                                                                    this.aT[this.aV] = 632;
                                                                }
                                                                if (i22 == 1) {
                                                                    this.aT[this.aV] = 661;
                                                                }
                                                                if (i22 == 2) {
                                                                    this.aT[this.aV] = 662;
                                                                }
                                                                if (i22 == 3) {
                                                                    this.aT[this.aV] = 663;
                                                                }
                                                                if (i22 == 4) {
                                                                    this.aT[this.aV] = 664;
                                                                }
                                                            } else {
                                                                this.aU[this.aV] = aaVar2.H[i22] + " @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                                if (i22 == 0) {
                                                                    this.aT[this.aV] = 632;
                                                                }
                                                                if (i22 == 1) {
                                                                    this.aT[this.aV] = 78;
                                                                }
                                                                if (i22 == 2) {
                                                                    this.aT[this.aV] = 867;
                                                                }
                                                                if (i22 == 3) {
                                                                    this.aT[this.aV] = 431;
                                                                }
                                                                if (i22 == 4) {
                                                                    this.aT[this.aV] = 53;
                                                                }
                                                                if (i22 == 5) {
                                                                    this.aT[this.aV] = 54;
                                                                }
                                                            }
                                                            if ((aaVar2.as == 5292 || aaVar2.as == 5063) && aaVar2.H.length > 5 && i22 == 6) {
                                                                this.aT[this.aV] = 300;
                                                            }
                                                            this.iy[this.aV] = a2.w;
                                                            this.iz[this.aV] = i12;
                                                            this.iA[this.aV] = i21;
                                                            this.aV++;
                                                        }
                                                    }
                                                }
                                                if (u != 24700) {
                                                    if (!aaVar2.aS && aaVar2.o) {
                                                        this.aU[this.aV] = "Examine @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                        this.aT[this.aV] = 1125;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                    } else if (aaVar2.as == 3822 && u == 3824) {
                                                        this.aU[this.aV] = "Sell All @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                        this.aT[this.aV] = 1126;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                    }
                                                    if (aaVar2.ac == 39672 && cs) {
                                                        this.aU[this.aV] = "Claim @lre@" + a2.G;
                                                        this.aT[this.aV] = 431;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                    }
                                                    if (aaVar2.ac == 39673 && cs) {
                                                        this.aU[this.aV] = "Claim @lre@" + a2.G;
                                                        this.aT[this.aV] = 431;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                    }
                                                    if (aaVar2.ac == 39674 && cs) {
                                                        this.aU[this.aV] = "Claim @lre@" + a2.G;
                                                        this.aT[this.aV] = 431;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                    }
                                                    if (aaVar2.ac == 32621) {
                                                        this.aU[this.aV] = "Buy X @lre@" + a2.G;
                                                        this.aT[this.aV] = 431;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                        this.aU[this.aV] = "Buy 10 @lre@" + a2.G;
                                                        this.aT[this.aV] = 300;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                        this.aU[this.aV] = "Buy 5 @lre@" + a2.G;
                                                        this.aT[this.aV] = 291;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                        this.aU[this.aV] = "Buy 1 @lre@" + a2.G;
                                                        this.aT[this.aV] = 867;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                        this.aU[this.aV] = "Value @lre@" + a2.G;
                                                        this.aT[this.aV] = 632;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                    }
                                                    if (aaVar2.ac == 33621) {
                                                        this.aU[this.aV] = "Set price @lre@" + a2.G;
                                                        this.aT[this.aV] = 78;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                        this.aU[this.aV] = "Withdraw X @lre@" + a2.G;
                                                        this.aT[this.aV] = 431;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                        this.aU[this.aV] = "Withdraw 10 @lre@" + a2.G;
                                                        this.aT[this.aV] = 300;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                        this.aU[this.aV] = "Withdraw 5 @lre@" + a2.G;
                                                        this.aT[this.aV] = 291;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                        this.aU[this.aV] = "Withdraw 1 @lre@" + a2.G;
                                                        this.aT[this.aV] = 867;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                        this.aU[this.aV] = "Value @lre@" + a2.G;
                                                        this.aT[this.aV] = 632;
                                                        this.iy[this.aV] = a2.w;
                                                        this.iz[this.aV] = i12;
                                                        this.iA[this.aV] = aaVar2.ac;
                                                        this.aV++;
                                                    }
                                                }
                                                ArrayList<Integer> arrayList = new ArrayList<Integer>() { // from class: org.necrotic.client.Client.2
                                                    {
                                                        add(1);
                                                        add(2);
                                                    }
                                                };
                                                this.jT = a2.w;
                                                if (this.jT >= 0 && !arrayList.contains(Integer.valueOf(u))) {
                                                    int i23 = this.bX;
                                                    int i24 = this.bW;
                                                    int i25 = aa.u[94021].aO;
                                                    int i26 = aa.u[94086].aO;
                                                    if (w.f271a[this.jT] != null && w.f271a[this.jT].i == 1) {
                                                        if (i24 + i25 > 500) {
                                                            i24 = 500 - i25;
                                                        }
                                                        if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED && i23 > 180) {
                                                            i23 = 180;
                                                        }
                                                    }
                                                    if (g && w.f271a[this.jT] != null && w.f271a[this.jT].i == 1) {
                                                        a(0, i24, aa.u[94000], i23);
                                                    } else {
                                                        a(0, i24, aa.u[94020], i23);
                                                    }
                                                }
                                                if (u == 5292 && aaVar2.ah[i12] == 0) {
                                                    this.aV = 3;
                                                    this.aU[0] = "Cancel";
                                                    this.aT[0] = 1107;
                                                    this.iy[0] = a2.w;
                                                    this.iz[0] = i12;
                                                    this.iA[0] = aaVar2.ac;
                                                    if (aaVar2.o) {
                                                        this.aU[1] = "Examine @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                        this.aT[1] = 1125;
                                                        this.iy[1] = a2.w;
                                                        this.iz[1] = i12;
                                                        this.iA[1] = aaVar2.ac;
                                                    }
                                                    this.aU[2] = "Release @lre@" + a2.G + (this.bc == 4 ? " (" + a2.w + ") @or1@(" + a2.l + ")" : "");
                                                    this.aT[2] = 633;
                                                    this.iy[2] = a2.w;
                                                    this.iz[2] = i12;
                                                    this.iA[2] = aaVar2.ac;
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
        if (this.bw == 0) {
            return;
        }
        int i2 = 0;
        if (this.eB != 0) {
            i2 = 0 + 1;
        }
        if (this.ft != 0) {
            i2++;
        }
        for (int i3 = 0; i3 < 500; i3++) {
            if (this.ao[i3] != null) {
                int i4 = this.au[i3];
                String str = this.ap[i3];
                boolean z2 = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED;
                if (str != null && str.indexOf("@") == 0) {
                    str = cq.matcher(str).replaceAll("");
                }
                if ((i4 == 3 || i4 == 7) && (i4 == 7 || this.br == 0 || (this.br == 1 && e(str)))) {
                    int h2 = (this.bL.h() - 9) - (i2 * 13);
                    if (this.bW > (z2 ? 4 : 0)) {
                        if (this.bX - (z2 ? 4 : 0) > h2 - 10) {
                            if (this.bX - (z2 ? 4 : 0) <= h2 + 3) {
                                int a2 = this.bi.a("From:  " + str + this.ao[i3]) + 25;
                                int i5 = a2;
                                if (a2 > 450) {
                                    i5 = 450;
                                }
                                if (this.bW < (z2 ? 4 : 0) + i5) {
                                    if (!e(str)) {
                                        this.aU[this.aV] = "Add ignore @whi@".concat(String.valueOf(str));
                                        this.aT[this.aV] = 2042;
                                        this.aV++;
                                        this.aU[this.aV] = "Add friend @whi@".concat(String.valueOf(str));
                                        this.aT[this.aV] = 2337;
                                        this.aV++;
                                    } else if (e(str)) {
                                        this.aU[this.aV] = "Message @whi@".concat(String.valueOf(str));
                                        this.aT[this.aV] = 2639;
                                        this.aV++;
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
                if ((i4 == 5 || i4 == 6) && this.br < 2) {
                    i2++;
                    if (i2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    private void S() {
        int i2 = (this.gw << 7) + 64;
        int i3 = (this.gx << 7) + 64;
        int b2 = b(this.bn, i3, i2) - this.gy;
        if (this.bB < i2) {
            this.bB += this.gz + (((i2 - this.bB) * this.gA) / 1000);
            if (this.bB > i2) {
                this.bB = i2;
            }
        }
        if (this.bB > i2) {
            this.bB -= this.gz + (((this.bB - i2) * this.gA) / 1000);
            if (this.bB < i2) {
                this.bB = i2;
            }
        }
        if (this.bD < b2) {
            this.bD += this.gz + (((b2 - this.bD) * this.gA) / 1000);
            if (this.bD > b2) {
                this.bD = b2;
            }
        }
        if (this.bD > b2) {
            this.bD -= this.gz + (((this.bD - b2) * this.gA) / 1000);
            if (this.bD < b2) {
                this.bD = b2;
            }
        }
        if (this.bC < i3) {
            this.bC += this.gz + (((i3 - this.bC) * this.gA) / 1000);
            if (this.bC > i3) {
                this.bC = i3;
            }
        }
        if (this.bC > i3) {
            this.bC -= this.gz + (((this.bC - i3) * this.gA) / 1000);
            if (this.bC < i3) {
                this.bC = i3;
            }
        }
        int i4 = (this.hh << 7) + 64;
        int i5 = (this.hi << 7) + 64;
        int b3 = b(this.bn, i5, i4) - this.hj;
        int i6 = i4 - this.bB;
        int i7 = b3 - this.bD;
        int i8 = i5 - this.bC;
        int atan2 = ((int) (Math.atan2(i7, (int) Math.sqrt((i6 * i6) + (i8 * i8))) * 325.949d)) & 2047;
        int atan22 = ((int) (Math.atan2(i6, i8) * (-325.949d))) & 2047;
        if (atan2 < 128) {
            atan2 = 128;
        }
        if (atan2 > 383) {
            atan2 = 383;
        }
        if (this.eR < atan2) {
            this.eR += this.hk + (((atan2 - this.eR) * this.hl) / 1000);
            if (this.eR > atan2) {
                this.eR = atan2;
            }
        }
        if (this.eR > atan2) {
            this.eR -= this.hk + (((this.eR - atan2) * this.hl) / 1000);
            if (this.eR < atan2) {
                this.eR = atan2;
            }
        }
        int i9 = atan22 - this.eQ;
        int i10 = i9;
        if (i9 > 1024) {
            i10 -= 2048;
        }
        if (i10 < -1024) {
            i10 += 2048;
        }
        if (i10 > 0) {
            this.eQ += this.hk + ((i10 * this.hl) / 1000);
            this.eQ &= 2047;
        }
        if (i10 < 0) {
            this.eQ -= this.hk + (((-i10) * this.hl) / 1000);
            this.eQ &= 2047;
        }
        int i11 = atan22 - this.eQ;
        int i12 = i11;
        if (i11 > 1024) {
            i12 -= 2048;
        }
        if (i12 < -1024) {
            i12 += 2048;
        }
        if ((i12 < 0 && i10 > 0) || (i12 > 0 && i10 < 0)) {
            this.eQ = atan22;
        }
    }

    private void a(int i2, int i3, int i4) {
        if (i2 < 128 || i4 < 128 || i2 > 13056 || i4 > 13056) {
            this.iX = -1;
            this.iY = -1;
            return;
        }
        int b2 = b(this.bn, i4, i2) - i3;
        int i5 = i2 - this.bB;
        int i6 = b2 - this.bD;
        int i7 = i4 - this.bC;
        int i8 = org.necrotic.client.n.l.e[this.eR];
        int i9 = org.necrotic.client.n.l.f[this.eR];
        int i10 = org.necrotic.client.n.l.e[this.eQ];
        int i11 = org.necrotic.client.n.l.f[this.eQ];
        int i12 = ((i7 * i10) + (i5 * i11)) >> 16;
        int i13 = ((i7 * i11) - (i5 * i10)) >> 16;
        int i14 = ((i6 * i9) - (i13 * i8)) >> 16;
        int i15 = ((i6 * i8) + (i13 * i9)) >> 16;
        if (i15 >= 50) {
            this.iX = org.necrotic.client.n.l.z + ((i12 << r) / i15);
            this.iY = org.necrotic.client.n.l.A + ((i14 << r) / i15);
            return;
        }
        this.iX = -1;
        this.iY = -1;
    }

    private static void c(long j2) {
        if (j2 == 0) {
            return;
        }
        try {
            dj.i(60);
            dj.a(j2);
        } catch (RuntimeException e2) {
            ae.a("47229, 3, " + j2 + ", " + e2.toString());
            throw new RuntimeException();
        }
    }

    @Override // org.necrotic.client.r
    public final void g() {
        ae.e = false;
        this.fy = null;
        try {
            if (this.hH != null) {
                this.hH.b();
            }
            D.close();
            D = null;
        } catch (Exception unused) {
        }
        this.hH = null;
        if (this.bm != null) {
            this.bm.a();
        }
        this.bm = null;
        this.hw = null;
        dj = null;
        this.im = null;
        this.ig = null;
        this.hm = null;
        this.fU = null;
        this.fV = null;
        this.hU = null;
        this.iM = null;
        this.ii = null;
        this.hE = null;
        this.jl = null;
        this.fW = null;
        this.hq = null;
        this.hp = null;
        this.hC = null;
        this.hD = null;
        this.fT = null;
        this.by = null;
        this.ik = null;
        this.jf = null;
        this.iP = null;
        this.aK = null;
        this.aF = null;
        this.an = null;
        this.hu = null;
        this.is = null;
        this.ax = null;
        this.id = null;
        this.iU = null;
        this.ie = null;
        this.hJ = null;
        this.aN = null;
        this.aO = null;
        this.aP = null;
        this.aM = null;
        this.aQ = null;
        this.aL = null;
        this.ek = null;
        this.el = null;
        this.em = null;
        this.iw = null;
        this.iv = null;
        this.hr = null;
        this.bo = null;
        this.bq = null;
        this.ho = null;
        this.hx = null;
        this.hn = null;
        this.bj = null;
        this.bl = null;
        this.aG = null;
        this.fZ = null;
        this.fX = null;
        this.fY = null;
        this.iz = null;
        this.iA = null;
        this.jB = null;
        this.jC = null;
        this.aT = null;
        this.iy = null;
        this.aU = null;
        this.bM = null;
        this.ac = null;
        this.ad = null;
        this.T = null;
        this.aZ = null;
        this.hW = null;
        this.aD = null;
        this.aE = null;
        this.ht = null;
        this.jb = null;
        this.iH = null;
        this.iI = null;
        an();
        org.necrotic.client.c.a.k.a();
        org.necrotic.client.c.a.j.a();
        org.necrotic.client.c.a.i.a();
        p.a();
        org.necrotic.client.c.a.e.f186a = null;
        aa.u = null;
        org.necrotic.client.c.a.a.f183a = null;
        org.necrotic.client.c.a.m.b = null;
        org.necrotic.client.c.a.m.f191a = null;
        org.necrotic.client.c.a.o.a((org.necrotic.client.c.a.o[]) null);
        this.bS = null;
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
                D.a(784).e(i2 - 11, i3 - 12);
            } else {
                D.a(785).e(i2 - 12, i3 - 13);
            }
            this.bv.a(0, String.valueOf(j3), i3 + 4, i2);
            this.bv.a(16777215, String.valueOf(j3), i3 + 3, i2 - 1);
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
        if (this.iX >= 0) {
            int i8 = 0;
            if (i7 == 0) {
                cVar.aU[0] = this.iY + i5;
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
                org.necrotic.client.f.e a2 = D.a(792 + (i3 * 3));
                org.necrotic.client.f.e a3 = D.a(792 + (i3 * 3) + 1);
                org.necrotic.client.f.e a4 = D.a(792 + (i3 * 3) + 2);
                if (i4 != 255 && i4 != 8) {
                    D.a(i4 + 786).d((this.iX - 31) + i9, i8 - 9, i6);
                }
                a2.d((this.iX - 12) + i9, i8 - 12, i6);
                int i10 = 0 + a2.d;
                int i11 = i9 + 3;
                for (int i12 = 0; i12 < i2 + 3; i12++) {
                    a3.d((this.iX - 12) + i11, i8 - 12, i6);
                    i10 += a3.d;
                    i11 += 3;
                }
                a4.d((this.iX - 12) + i11, i8 - 12, i6);
                int i13 = i10 + a4.d;
                org.necrotic.client.f.a.c cVar2 = i3 == 1 ? this.bi : this.bv;
                if (j2 < 1000) {
                    cVar2.a(6029107, d(j2), i8 + 3, (this.iX + (i13 / 8)) - (cVar2.a(d(j2)) / 5), i6);
                } else if (j2 < 10000) {
                    cVar2.a(6029107, d(j2), i8 + 3, (this.iX + (i13 / 8)) - (cVar2.a(d(j2)) / 5), i6);
                } else if (j2 < 100000) {
                    cVar2.a(6029107, d(j2), i8 + 3, (this.iX + (i13 / 8)) - (cVar2.a(d(j2)) / 10), i6);
                } else if (j2 < 1000000) {
                    cVar2.a(6029107, d(j2), i8 + 3, (this.iX + (i13 / 8)) - (cVar2.a(d(j2)) / 13), i6);
                } else if (j2 < 10000000) {
                    cVar2.a(16580403, d(j2), i8 + 3, (this.iX + (i13 / 8)) - (cVar2.a(d(j2)) / 17), i6);
                } else if (j2 < 100000000) {
                    cVar2.a(16580403, d(j2), i8 + 3, (this.iX + (i13 / 8)) - (cVar2.a(d(j2)) / 17), i6);
                } else if (j2 > 100000000) {
                    cVar2.a(16580403, d(j2), i8 + 3, (this.iX + (i13 / 8)) - (cVar2.a(d(j2)) / 100), i6);
                }
                if (j3 > 0) {
                    a(j3, i6, i8, i11);
                    return;
                }
                return;
            }
            D.a(543).d(this.iX - (j3 > 0 ? 26 : 12), i8 - 14, i6);
            if (j3 > 0) {
                a(j3, i6, i8, 4);
            }
        }
    }

    private void a(long j2, int i2, int i3, int i4) {
        int i5 = i4 - 12;
        int length = String.valueOf(j2).length();
        D.a(844).d(this.iX + i5, i3 - 12, i2);
        int i6 = i5 + 20;
        D.a(822).d(this.iX + i6, i3 - 12, i2);
        int i7 = i6 + 3;
        for (int i8 = 0; i8 < (length << 1); i8++) {
            D.a(823).d(this.iX + i7, i3 - 12, i2);
            i7 += 3;
        }
        D.a(824).d(this.iX + i7, i3 - 10, i2);
        if (j2 > 99) {
            i7 -= 5;
        }
        if (j2 > 999) {
            i7 -= 5;
        }
        this.ju.a(16777215, d(j2), i3 + 32, (this.iX - 8) + i7 + (length == 1 ? 5 : 0), i2);
    }

    private void e(long j2) {
        if (j2 == 0) {
            return;
        }
        int i2 = 0;
        while (i2 < this.aC) {
            try {
                if (this.aD[i2] != j2) {
                    i2++;
                } else {
                    this.aC--;
                    while (i2 < this.aC) {
                        String[] strArr = this.hW;
                        strArr[i2] = strArr[i2 + 1];
                        int[] iArr = this.aE;
                        iArr[i2] = iArr[i2 + 1];
                        long[] jArr = this.aD;
                        jArr[i2] = jArr[i2 + 1];
                        i2++;
                    }
                    dj.i(215);
                    dj.a(j2);
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
        for (int i2 = 0; i2 < this.f1if; i2++) {
            try {
                if (this.dZ[i2] == j2) {
                    this.f1if--;
                    System.arraycopy(this.dZ, i2 + 1, this.dZ, i2, this.f1if - i2);
                    dj.i(74);
                    dj.a(j2);
                    return;
                }
            } catch (RuntimeException e2) {
                ae.a("47229, 3, " + j2 + ", " + e2.toString());
                throw new RuntimeException();
            }
        }
    }

    private void U() {
        int c2 = this.bg.c("Choose Option");
        for (int i2 = 0; i2 < this.aV; i2++) {
            int c3 = this.bg.c(this.aU[i2]);
            if (this.aU[i2].contains("<img=")) {
                c3 -= 36;
            }
            if (this.ei[i2] != null) {
                c3 += this.bg.c(this.ei[i2]);
            }
            if (this.eI[i2] != null) {
                c3 += this.bg.c(this.eI[i2]);
            }
            if (c3 > c2) {
                c2 = c3;
            }
        }
        int i3 = c2 + 8;
        int i4 = (15 * this.aV) + 21;
        if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
            if (this.ca > 4 && this.cb > 4 && this.ca < 516 && this.cb < 338) {
                int i5 = (this.ca - 4) - (i3 / 2);
                int i6 = i5;
                if (i5 + i3 > 512) {
                    i6 = 512 - i3;
                }
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = this.cb - 4;
                int i8 = i7;
                if (i7 + i4 > 334) {
                    i8 = 334 - i4;
                }
                if (i8 < 0) {
                    i8 = 0;
                }
                this.aW = true;
                this.aX = 0;
                this.iC = i6;
                this.iD = i8;
                this.iE = i3;
                this.iB = (15 * this.aV) + 22;
            }
            if (this.ca > 519 && this.cb > 168 && this.ca < 765 && this.cb < 503) {
                int i9 = (this.ca - 519) - (i3 / 2);
                int i10 = i9;
                if (i9 < 0) {
                    i10 = 0;
                } else if (i10 + i3 > 245) {
                    i10 = 245 - i3;
                }
                int i11 = this.cb - 168;
                int i12 = i11;
                if (i11 < 0) {
                    i12 = 0;
                } else if (i12 + i4 > 333) {
                    i12 = 333 - i4;
                }
                this.aW = true;
                this.aX = 1;
                this.iC = i10;
                this.iD = i12;
                this.iE = i3;
                this.iB = (15 * this.aV) + 22;
            }
            if (this.ca > 0 && this.cb > 338 && this.ca < 516 && this.cb < 503) {
                int i13 = this.ca - (i3 / 2);
                int i14 = i13;
                if (i13 < 0) {
                    i14 = 0;
                } else if (i14 + i3 > 516) {
                    i14 = 516 - i3;
                }
                int i15 = this.cb - 338;
                int i16 = i15;
                if (i15 < 0) {
                    i16 = 0;
                } else if (i16 + i4 > 165) {
                    i16 = 165 - i4;
                }
                this.aW = true;
                this.aX = 2;
                this.iC = i14;
                this.iD = i16;
                this.iE = i3;
                this.iB = (15 * this.aV) + 22;
            }
            if (this.ca > 519 && this.cb > 0 && this.ca < 765 && this.cb < 168) {
                int i17 = (this.ca - 519) - (i3 / 2);
                int i18 = i17;
                if (i17 < 0) {
                    i18 = 0;
                } else if (i18 + i3 > 245) {
                    i18 = 245 - i3;
                }
                int i19 = this.cb;
                int i20 = i19;
                if (i19 < 0) {
                    i20 = 0;
                } else if (i20 + i4 > 168) {
                    i20 = 168 - i4;
                }
                this.aW = true;
                this.aX = 3;
                this.iC = i18;
                this.iD = i20;
                this.iE = i3;
                this.iB = (15 * this.aV) + 22;
            }
        } else if (this.ca > 0 && this.cb > 0 && this.ca < s() && this.cb < t()) {
            int i21 = this.ca - (i3 / 2);
            int i22 = i21;
            if (i21 + i3 > s()) {
                i22 = s() - i3;
            }
            if (i22 < 0) {
                i22 = 0;
            }
            int i23 = this.cb;
            int i24 = i23;
            if (i23 + i4 > t()) {
                i24 = t() - i4;
            }
            if (i24 < 0) {
                i24 = 0;
            }
            this.aW = true;
            this.aX = 0;
            this.iC = i22;
            this.iD = i24;
            this.iE = i3;
            this.iB = (15 * this.aV) + 22;
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
            dj.i(195);
            dj.h(i2);
        }
    }

    private boolean a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z2, int i11) {
        for (int i12 = 0; i12 < 104; i12++) {
            for (int i13 = 0; i13 < 104; i13++) {
                this.hq[i12][i13] = 0;
                this.hp[i12][i13] = 99999999;
            }
        }
        int i14 = i10;
        int i15 = i6;
        if (i10 >= this.hq.length || i6 >= this.hq[i10].length) {
            return true;
        }
        this.hq[i10][i6] = 99;
        this.hp[i10][i6] = 0;
        int i16 = 0;
        this.hC[0] = i10;
        int i17 = 0 + 1;
        this.hD[0] = i6;
        boolean z3 = false;
        int length = this.hC.length;
        int[][] iArr = this.fW[this.bn].f239a;
        while (true) {
            if (i16 == i17) {
                break;
            }
            i14 = this.hC[i16];
            i15 = this.hD[i16];
            i16 = (i16 + 1) % length;
            if (i14 == i11 && i15 == i9) {
                z3 = true;
                break;
            }
            if (i5 != 0) {
                if ((i5 < 5 || i5 == 10) && this.fW[this.bn].a(i11, i14, i15, i3, i5 - 1, i9)) {
                    z3 = true;
                    break;
                } else if (i5 < 10 && this.fW[this.bn].b(i11, i9, i15, i5 - 1, i3, i14)) {
                    z3 = true;
                    break;
                }
            }
            if (i7 != 0 && i4 != 0 && this.fW[this.bn].a(i9, i11, i14, i4, i8, i7, i15)) {
                z3 = true;
                break;
            }
            int i18 = this.hp[i14][i15] + 1;
            if (i14 > 0 && this.hq[i14 - 1][i15] == 0 && (iArr[i14 - 1][i15] & 19398920) == 0) {
                this.hC[i17] = i14 - 1;
                this.hD[i17] = i15;
                i17 = (i17 + 1) % length;
                this.hq[i14 - 1][i15] = 2;
                this.hp[i14 - 1][i15] = i18;
            }
            if (i14 < 103 && this.hq[i14 + 1][i15] == 0 && (iArr[i14 + 1][i15] & 19399040) == 0) {
                this.hC[i17] = i14 + 1;
                this.hD[i17] = i15;
                i17 = (i17 + 1) % length;
                this.hq[i14 + 1][i15] = 8;
                this.hp[i14 + 1][i15] = i18;
            }
            if (i15 > 0 && this.hq[i14][i15 - 1] == 0 && (iArr[i14][i15 - 1] & 19398914) == 0) {
                this.hC[i17] = i14;
                this.hD[i17] = i15 - 1;
                i17 = (i17 + 1) % length;
                this.hq[i14][i15 - 1] = 1;
                this.hp[i14][i15 - 1] = i18;
            }
            if (i15 < 103 && this.hq[i14][i15 + 1] == 0 && (iArr[i14][i15 + 1] & 19398944) == 0) {
                this.hC[i17] = i14;
                this.hD[i17] = i15 + 1;
                i17 = (i17 + 1) % length;
                this.hq[i14][i15 + 1] = 4;
                this.hp[i14][i15 + 1] = i18;
            }
            if (i14 > 0 && i15 > 0 && this.hq[i14 - 1][i15 - 1] == 0 && (iArr[i14 - 1][i15 - 1] & 19398926) == 0 && (iArr[i14 - 1][i15] & 19398920) == 0 && (iArr[i14][i15 - 1] & 19398914) == 0) {
                this.hC[i17] = i14 - 1;
                this.hD[i17] = i15 - 1;
                i17 = (i17 + 1) % length;
                this.hq[i14 - 1][i15 - 1] = 3;
                this.hp[i14 - 1][i15 - 1] = i18;
            }
            if (i14 < 103 && i15 > 0 && this.hq[i14 + 1][i15 - 1] == 0 && (iArr[i14 + 1][i15 - 1] & 19399043) == 0 && (iArr[i14 + 1][i15] & 19399040) == 0 && (iArr[i14][i15 - 1] & 19398914) == 0) {
                this.hC[i17] = i14 + 1;
                this.hD[i17] = i15 - 1;
                i17 = (i17 + 1) % length;
                this.hq[i14 + 1][i15 - 1] = 9;
                this.hp[i14 + 1][i15 - 1] = i18;
            }
            if (i14 > 0 && i15 < 103 && this.hq[i14 - 1][i15 + 1] == 0 && (iArr[i14 - 1][i15 + 1] & 19398968) == 0 && (iArr[i14 - 1][i15] & 19398920) == 0 && (iArr[i14][i15 + 1] & 19398944) == 0) {
                this.hC[i17] = i14 - 1;
                this.hD[i17] = i15 + 1;
                i17 = (i17 + 1) % length;
                this.hq[i14 - 1][i15 + 1] = 6;
                this.hp[i14 - 1][i15 + 1] = i18;
            }
            if (i14 < 103 && i15 < 103 && this.hq[i14 + 1][i15 + 1] == 0 && (iArr[i14 + 1][i15 + 1] & 19399136) == 0 && (iArr[i14 + 1][i15] & 19399040) == 0 && (iArr[i14][i15 + 1] & 19398944) == 0) {
                this.hC[i17] = i14 + 1;
                this.hD[i17] = i15 + 1;
                i17 = (i17 + 1) % length;
                this.hq[i14 + 1][i15 + 1] = 12;
                this.hp[i14 + 1][i15 + 1] = i18;
            }
        }
        this.gL = 0;
        if (!z3) {
            if (z2) {
                int i19 = 100;
                for (int i20 = 1; i20 < 2; i20++) {
                    for (int i21 = i11 - i20; i21 <= i11 + i20; i21++) {
                        for (int i22 = i9 - i20; i22 <= i9 + i20; i22++) {
                            if (i21 >= 0 && i22 >= 0 && i21 < 104 && i22 < 104 && this.hp[i21][i22] < i19) {
                                i19 = this.hp[i21][i22];
                                i14 = i21;
                                i15 = i22;
                                this.gL = 1;
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
        this.hC[0] = i14;
        int i23 = 0 + 1;
        this.hD[0] = i15;
        int i24 = this.hq[i14][i15];
        int i25 = i24;
        while (true) {
            int i26 = i24;
            if (i14 == i10 && i15 == i6) {
                break;
            }
            if (i26 != i25) {
                i25 = i26;
                this.hC[i23] = i14;
                int i27 = i23;
                i23++;
                this.hD[i27] = i15;
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
            i24 = this.hq[i14][i15];
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
        int i31 = this.hC[i30];
        int i32 = this.hD[i30];
        int i33 = cQ + i29;
        cQ = i33;
        if (i33 >= 92) {
            dj.i(36);
            dj.h(0);
            cQ = 0;
        }
        if (i2 == 0) {
            dj.i(229);
            dj.l(this.bn);
            dj.i(164);
            int i34 = i29;
            dj.l(i34 + i34 + 3);
        }
        if (i2 == 1) {
            dj.i(229);
            dj.l(this.bn);
            dj.i(248);
            int i35 = i29;
            dj.l(i35 + i35 + 3 + 14);
        }
        if (i2 == 2) {
            dj.i(229);
            dj.l(this.bn);
            dj.i(98);
            int i36 = i29;
            dj.l(i36 + i36 + 3);
        }
        dj.g(i31 + this.aj);
        this.ay = this.hC[0];
        this.az = this.hD[0];
        for (int i37 = 1; i37 < i29; i37++) {
            i30--;
            dj.l(this.hC[i30] - i31);
            dj.l(this.hD[i30] - i32);
        }
        dj.e(i32 + this.ak);
        dj.c(this.bU[5] != 1 ? 0 : 1);
        return true;
    }

    private void W() {
        if (!this.bL.b() && this.bw != 0) {
            org.necrotic.client.f.a.c cVar = this.bi;
            int i2 = 0;
            if (this.eB != 0) {
                i2 = 0 + 1;
            }
            if (this.ft != 0) {
                i2++;
            }
            for (int i3 = 0; i3 < 100; i3++) {
                if (this.ao[i3] != null) {
                    int i4 = this.au[i3];
                    String str = this.ap[i3];
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
                    if ((i4 == 3 || i4 == 7) && (i4 == 7 || this.br == 0 || (this.br == 1 && e(str2)))) {
                        int i6 = (t2 + 329) - (i2 * 13);
                        cVar.b(0, HttpHeaders.FROM, i6, 4);
                        cVar.b(org.necrotic.client.f.b.a.a.b[this.P], HttpHeaders.FROM, i6 - 1, 4);
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
                                this.N[i5].c(a3, i6 - 12, ColorUtil.MAX_RGB_VALUE);
                                a3 += this.N[i5].v + 2;
                            } else {
                                b2.a(b2.d, b2.e).c(a3, i6 - 11);
                                a3 += b2.d + 2;
                            }
                        }
                        cVar.b(0, str2 + ": " + this.ao[i3], i6, a3);
                        cVar.b(org.necrotic.client.f.b.a.a.b[this.P], str2 + ": " + this.ao[i3], i6 - 1, a3);
                        i2++;
                        if (i2 >= 5) {
                            break;
                        }
                    }
                    if (i4 == 5 && this.br < 2) {
                        int i7 = (t2 + 329) - (i2 * 13);
                        cVar.b(0, this.ao[i3], i7, 4);
                        cVar.b(org.necrotic.client.f.b.a.a.b[this.P], this.ao[i3], i7 - 1, 4);
                        i2++;
                        if (i2 >= 5) {
                            break;
                        }
                    }
                    if (i4 == 6 && this.br < 2) {
                        int i8 = (t2 + 329) - (i2 * 13);
                        cVar.b(0, "To", i8, 4);
                        cVar.b(org.necrotic.client.f.b.a.a.b[this.P], "To", i8 - 1, 4);
                        int a4 = 4 + cVar.a("To ");
                        if (i5 != 0) {
                            d b3 = b(i5);
                            if (b3 != null) {
                                b3.a(b3.d, b3.e).c(a4, i8 - 11);
                                a4 += 12;
                            } else {
                                this.N[i5].c(a4, i8 - 12, ColorUtil.MAX_RGB_VALUE);
                                a4 += 12;
                            }
                        }
                        cVar.b(0, str2 + ": " + this.ao[i3], i8, a4);
                        cVar.b(org.necrotic.client.f.b.a.a.b[this.P], str2 + ": " + this.ao[i3], i8 - 1, a4);
                        i2++;
                        if (i2 >= 5) {
                            break;
                        }
                    }
                }
            }
        }
        b bVar = this.eo;
        if (bVar.f179a == null) {
            this.en.b();
            if (this.hL == 1) {
                this.hJ[this.hK / 100].e((this.hM - 8) - 4, (this.hN - 8) - 4);
                int i9 = cK + 1;
                cK = i9;
                if (i9 > 67) {
                    cK = 0;
                }
            }
            if (this.hL == 2) {
                this.hJ[4 + (this.hK / 100)].e((this.hM - 8) - 4, (this.hN - 8) - 4);
            }
            if (cs) {
                a(0, 0, aa.u[39670], 0);
            }
            if (this.gj > 0) {
                i(this.hd, this.gj);
                if (this.gj == 15892 && org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
                    a(0, ((s() / 2) - aa.u[this.gj].aO) + 20, aa.u[this.gj], 0);
                } else if ((this.gj == 201 || this.gj == 197) && org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
                    a(0, (s() - Constants.GAME_FIXED_WIDTH) + 15, aa.u[this.gj], -241);
                } else if (this.gj == 197) {
                    a(0, (s() - Constants.GAME_FIXED_WIDTH) - (org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? 30 : 0), aa.u[42020], 10);
                } else {
                    a(0, 0, aa.u[this.gj], 0);
                }
            }
            if (this.fh.size() > 0) {
                Iterator<aa> it = this.fh.iterator();
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
                i(this.hd, u);
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
                            aa.u[i10 + 27014].aA = D.a(1009);
                            aa.u[i10 + 27014].an = "Click here to select tab " + (i10 + 1);
                        }
                        for (int i11 = parseInt + 1; i11 <= 8; i11++) {
                            aa.u[i11 + 27014].aA = null;
                            aa.u[i11 + 27014].an = "";
                        }
                        if (parseInt != 8) {
                            aa.u[parseInt + 27015].aA = D.a(1010);
                            aa.u[parseInt + 27015].an = "Drag an item here to create a new tab";
                        }
                        if (parseInt2 == -1) {
                            aa.u[27013].aA = D.a(1011);
                        } else if (parseInt2 > 0) {
                            aa.u[parseInt2 + 27014].aA = D.a(1012);
                            aa.u[27014].aA = D.a(1011);
                        } else {
                            aa.u[27014].aA = D.a(1008);
                        }
                        aa.u[27000].an = "0";
                    }
                    if (this.jo != null) {
                        this.jo.e(this.jp, this.jq);
                    }
                }
                org.necrotic.client.f.c.i iVar = this.eZ;
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
                        iVar.l = D.a(1158);
                        iVar.m = D.a(1159);
                        iVar.n = D.a(1160);
                        iVar.o = D.a(1161);
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
                        iVar.l = D.a(1158);
                        iVar.m = D.a(1159);
                        iVar.n = D.a(1160);
                        iVar.o = D.a(1161);
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
            dm = null;
            o.b();
            if (!this.aW) {
                aq();
                ac();
            } else if (this.aX == 0) {
                i();
            }
            if (this.ez == 1) {
                this.iH.e(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 472 : s() - 40, org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 296 : 175);
            }
            if (this.eA == 1) {
                this.iI.e(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 472 : s() - 40, org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 296 : 175);
            }
            if (Objects.nonNull(this.jS) && u <= 0) {
                long j2 = this.jS.au;
                long j3 = this.jS.aB;
                int i19 = 35;
                int i20 = 106;
                if (!org.necrotic.a.i) {
                    j2 = Math.round((float) (j2 / 10));
                    j3 /= 10;
                }
                int i21 = 13;
                if (this.jS instanceof org.necrotic.client.e.a.a) {
                    org.necrotic.client.e.a.a aVar = (org.necrotic.client.e.a.a) this.jS;
                    a(106, 35, j2, j3, 13);
                    int i22 = 106 / 2;
                    this.be.a(aVar.y, 63, 40, 16777215, 0);
                } else {
                    org.necrotic.client.j.e eVar = (org.necrotic.client.j.e) this.jS;
                    boolean z2 = j3 > 2500;
                    boolean z3 = z2;
                    if (z2) {
                        i21 = 23;
                        i19 = 25 + (eVar.d.size() * 10) + 10;
                        i20 = 125;
                    }
                    a(i20, i19, j2, j3, i21);
                    if (eVar.c == null) {
                        this.jS = null;
                    } else {
                        this.be.a(eVar.c.r, 10 + (i20 / 2), 40, 16777215, 0);
                        if (z3) {
                            for (int i23 = 0; i23 < 5; i23++) {
                                this.be.a("", 15, 40 + (i23 * 10) + 10, false);
                                this.be.a("", 105, 40 + (i23 * 10) + 10, false);
                                if (i23 < eVar.d.size()) {
                                    String a5 = eVar.d.get(i23).a();
                                    long b4 = eVar.d.get(i23).b();
                                    if (!org.necrotic.a.i && b4 > 0) {
                                        b4 /= 10;
                                    }
                                    DecimalFormat decimalFormat = new DecimalFormat("#");
                                    this.be.a(a5, 15, 40 + (i23 * 10) + 10, false);
                                    this.be.a(decimalFormat.format(b4), 105, 40 + (i23 * 10) + 10, false);
                                }
                            }
                        }
                    }
                }
            }
            int i24 = this.aj + ((t.aJ - 6) >> 7);
            int i25 = this.ak + ((t.aK - 6) >> 7);
            if (this.jn) {
                this.bi.b(16776960, "Fps: " + this.bR, 240, 5);
                Runtime runtime = Runtime.getRuntime();
                int i26 = 16776960;
                int freeMemory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024);
                if (freeMemory > 33554432 && df) {
                    i26 = 16711680;
                }
                this.bi.b(i26, "Mem: " + freeMemory + "k", 254, 5);
                this.bi.b(16776960, "Mouse X: " + this.bW + " , Mouse Y: " + this.bX, 269, 5);
                this.bi.b(16776960, "Coords: " + i24 + ", " + i25, 284, 5);
                this.bi.b(16776960, "Client resolution: " + s() + "x" + t(), 299, 5);
                this.bi.b(16776960, "Object Maps: " + this.iN + ";", 314, 5);
                this.bi.b(16776960, "Floor Maps: " + this.hV + ";", 329, 5);
            }
            if (this.jm) {
                int g2 = this.ea.g() - 90;
                int i27 = 16776960;
                if (this.bR < 15) {
                    i27 = 16711680;
                }
                this.bi.b(i27, "Fps:" + this.bR, 20, g2);
                Runtime runtime2 = Runtime.getRuntime();
                int freeMemory2 = (int) ((runtime2.totalMemory() - runtime2.freeMemory()) / 1024);
                if (freeMemory2 > 33554432 && df) {
                    i27 = 16711680;
                }
                this.bi.b(i27, "Mem:" + freeMemory2 + "k", 35, g2);
                this.bi.b(i27, "MouseX:" + this.bW, 50, g2);
                this.bi.b(i27, "MouseY:" + this.bX, 65, g2);
                this.bi.b(16776960, "Object Maps: " + this.iN + ";", 80, 5);
                this.bi.b(16776960, "Floor Maps: " + this.hV + ";", 95, 5);
            }
            if (this.eB != 0) {
                int i28 = this.eB / 50;
                int i29 = i28 / 60;
                int i30 = i28 % 60;
                if (i30 < 10) {
                    this.bi.b(16776960, "System update in: " + i29 + ":0" + i30, org.necrotic.client.f.b.a.j() ? 329 : t() - 168, 4);
                } else {
                    this.bi.b(16776960, "System update in: " + i29 + ":" + i30, org.necrotic.client.f.b.a.j() ? 329 : t() - 168, 4);
                }
                int i31 = cZ + 1;
                cZ = i31;
                if (i31 > 75) {
                    cZ = 0;
                    dj.i(148);
                    return;
                }
                return;
            }
            if (this.ft == 0) {
                this.fu = null;
            }
            if (this.fu != null) {
                this.bi.b(16776960, this.fu, org.necrotic.client.f.b.a.j() ? 329 : t() - 168, 4);
                return;
            }
            return;
        }
        a aVar2 = bVar.f179a;
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
        this.bL.a(0);
        this.bL.b(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 338 : t() - 165);
        this.bL.a(this);
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
                if (i2 == 1 && this.gY == 0) {
                    aaVar.an = "Loading friend list";
                    aaVar.S = 0;
                } else if (i2 == 1 && this.gY == 1) {
                    aaVar.an = "Connecting to friendserver";
                    aaVar.S = 0;
                } else if (i2 == 2 && this.gY != 2) {
                    aaVar.an = "Please wait...";
                    aaVar.S = 0;
                } else {
                    int i3 = this.aC;
                    if (this.gY != 2) {
                        i3 = 0;
                    }
                    int i4 = i2 > 700 ? i2 - 601 : i2 - 1;
                    if (i4 >= i3) {
                        aaVar.an = "";
                        aaVar.S = 0;
                        return;
                    }
                    aaVar.an = this.hW[i4];
                    aaVar.S = 1;
                }
            } else if (i2 == 901) {
                aaVar.an = new StringBuilder().append(this.aC).toString();
            } else if (i2 == 902) {
                aaVar.an = new StringBuilder().append(this.f1if).toString();
            } else if ((i2 >= 101 && i2 <= 200) || (i2 >= 801 && i2 <= 900)) {
                int i5 = this.aC;
                if (this.gY != 2) {
                    i5 = 0;
                }
                int i6 = i2 > 800 ? i2 - 701 : i2 - 101;
                if (i6 >= i5) {
                    aaVar.an = "";
                    aaVar.S = 0;
                    return;
                }
                if (this.aE[i6] != 0 && this.aE[i6] == di) {
                    aaVar.an = "@gre@Online";
                } else {
                    aaVar.an = "@red@Offline";
                }
                aaVar.S = 1;
            } else if (i2 == 203) {
                int i7 = this.aC;
                if (this.gY != 2) {
                    i7 = 0;
                }
                aaVar.au = (i7 * 15) + 20;
                if (aaVar.au <= aaVar.aa) {
                    aaVar.au = aaVar.aa + 1;
                }
            } else if (i2 >= 401 && i2 <= 500) {
                int i8 = i2 - 401;
                if (i8 == 0 && this.gY == 0) {
                    aaVar.an = "Loading ignore list";
                    aaVar.S = 0;
                } else if (i8 == 1 && this.gY == 0) {
                    aaVar.an = "Please wait...";
                    aaVar.S = 0;
                } else {
                    int i9 = this.f1if;
                    if (this.gY == 0) {
                        i9 = 0;
                    }
                    if (i8 >= i9) {
                        aaVar.an = "";
                        aaVar.S = 0;
                        return;
                    }
                    aaVar.an = org.necrotic.client.f.a.b.a(org.necrotic.client.f.a.b.a(this.dZ[i8]));
                    aaVar.S = 1;
                }
            } else if (i2 == 503) {
                aaVar.au = (this.f1if * 15) + 20;
                if (aaVar.au <= aaVar.aa) {
                    aaVar.au = aaVar.aa + 1;
                }
            } else if (i2 == 327) {
                aaVar.ao = 150;
                aaVar.ap = ((int) (Math.sin(s / 40.0d) * 256.0d)) & 2047;
                if (this.fK) {
                    for (int i10 = 0; i10 < 7; i10++) {
                        int i11 = this.dI[i10];
                        if (i11 >= 0 && !org.necrotic.client.c.a.e.f186a[i11].a()) {
                            return;
                        }
                    }
                    this.fK = false;
                    org.necrotic.client.n.d[] dVarArr = new org.necrotic.client.n.d[7];
                    int i12 = 0;
                    for (int i13 = 0; i13 < 7; i13++) {
                        int i14 = this.dI[i13];
                        if (i14 >= 0) {
                            int i15 = i12;
                            i12++;
                            dVarArr[i15] = org.necrotic.client.c.a.e.f186a[i14].b();
                        }
                    }
                    org.necrotic.client.n.d dVar5 = new org.necrotic.client.n.d(i12, dVarArr);
                    for (int i16 = 0; i16 < 5; i16++) {
                        if (this.f0do[i16] != 0) {
                            dVar5.a(b[i16][0], b[i16][this.f0do[i16]]);
                            if (i16 == 1) {
                                dVar5.a(f169a[0], f169a[this.f0do[i16]]);
                            }
                        }
                    }
                    dVar5.g();
                    dVar5.c(org.necrotic.client.c.a.a.f183a[t.O].c[0]);
                    dVar5.a(64, 850, -30, -50, -30, true);
                    aaVar.M = 5;
                    aaVar.am = 0;
                    aa.a(this.dC, dVar5);
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
                dVar4.c(org.necrotic.client.c.a.a.f183a[org.necrotic.client.f.c.n.c()].c[org.necrotic.client.f.c.n.f219a]);
                dVar4.a(64, 850, -30, -50, -30, true);
                aaVar.M = 5;
                aaVar.am = 0;
                aa.a(this.dC, dVar4);
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
                    dVar3.c(org.necrotic.client.c.a.a.f183a[org.necrotic.client.f.c.l.c()].c[org.necrotic.client.f.c.l.f218a]);
                    aaVar.M = 5;
                    aaVar.am = 0;
                    aa.a(this.dC, dVar3);
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
                        if (a2.f188a > 0) {
                            dVar2.e(a2.f188a);
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
                        dVar2.c(org.necrotic.client.c.a.a.f183a[org.necrotic.client.f.c.l.c()].c[org.necrotic.client.f.c.l.f218a]);
                        aaVar.M = 5;
                        aaVar.am = 0;
                        aa.a(this.dC, dVar2);
                        if (!org.necrotic.client.f.c.l.b) {
                            org.necrotic.client.f.c.l.b();
                        }
                    }
                } else {
                    if (i2 == 32921) {
                        this.fr = org.necrotic.client.c.a.j.a(aaVar.B);
                        if (aaVar.B != -1 && aaVar.B != 5090) {
                            org.necrotic.client.f.c.l lVar3 = new org.necrotic.client.f.c.l(this.fr);
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
                            if (this.fr.u != null) {
                                for (int i23 = 0; i23 < this.fr.u.length; i23++) {
                                    int i24 = this.fr.u[i23];
                                    int i25 = this.fr.j[i23];
                                    int i26 = dVar.J;
                                }
                            }
                            dVar.g();
                            dVar.c(org.necrotic.client.c.a.a.f183a[org.necrotic.client.f.c.l.c()].c[org.necrotic.client.f.c.l.f218a]);
                            aaVar.M = 5;
                            aaVar.am = 0;
                            aa.a(this.dC, dVar);
                            if (!org.necrotic.client.f.c.l.b) {
                                org.necrotic.client.f.c.l.b();
                                return;
                            }
                            return;
                        }
                        aaVar.M = 5;
                        aaVar.am = 0;
                        aa.a(this.dC, (org.necrotic.client.n.d) null);
                    }
                    if (i2 == 328) {
                        aaVar.ao = 150;
                        aaVar.ap = ((int) (Math.sin(s / 40.0d) * 256.0d)) & 2047;
                        if (this.fK) {
                            org.necrotic.client.n.d e2 = t.e();
                            for (int i27 = 0; i27 < 5; i27++) {
                                if (this.f0do[i27] != 0) {
                                    e2.a(b[i27][0], b[i27][this.f0do[i27]]);
                                    if (i27 == 1) {
                                        e2.a(f169a[0], f169a[this.f0do[i27]]);
                                    }
                                }
                            }
                            int i28 = t.O;
                            e2.g();
                            e2.c(org.necrotic.client.c.a.a.f183a[i28].c[0]);
                            aaVar.M = 5;
                            aaVar.am = 0;
                            aa.a(this.dC, e2);
                        }
                    } else if (i2 == 324) {
                        if (this.ga == null) {
                            this.ga = aaVar.aA;
                            this.gb = aaVar.aB;
                        }
                        if (this.et) {
                            aaVar.aA = this.gb;
                        } else {
                            aaVar.aA = this.ga;
                        }
                    } else if (i2 == 325) {
                        if (this.ga == null) {
                            this.ga = aaVar.aA;
                            this.gb = aaVar.aB;
                        }
                        if (this.et) {
                            aaVar.aA = this.ga;
                        } else {
                            aaVar.aA = this.gb;
                        }
                    } else {
                        if (i2 == 650 || i2 == 655) {
                            if (this.gG != 0) {
                                if (this.hP == 0) {
                                    str = "earlier today";
                                } else if (this.hP == 1) {
                                    str = "yesterday";
                                } else {
                                    str = this.hP + " days ago";
                                }
                                aaVar.an = "You last logged in " + str + " from: " + ae.c;
                            } else {
                                aaVar.an = "";
                            }
                        }
                        if (i2 == 651) {
                            if (this.jh == 0) {
                                aaVar.an = "0 unread messages";
                                aaVar.aF = 16776960;
                            } else if (this.jh == 1) {
                                aaVar.an = "1 unread message";
                                aaVar.aF = 65280;
                            } else if (this.jh > 1) {
                                aaVar.an = this.jh + " unread messages";
                                aaVar.aF = 65280;
                            }
                        }
                        if (i2 == 652) {
                            if (this.hQ == 201) {
                                if (this.ix == 1) {
                                    aaVar.an = "@yel@This is a non-members world: @whi@Since you are a member we";
                                } else {
                                    aaVar.an = "";
                                }
                            } else if (this.hQ == 200) {
                                aaVar.an = "You have not yet set any password recovery questions.";
                            } else {
                                if (this.hQ == 0) {
                                    str2 = "Earlier today";
                                } else if (this.hQ == 1) {
                                    str2 = "Yesterday";
                                } else {
                                    str2 = this.hQ + " days ago";
                                }
                                aaVar.an = str2 + " you changed your recovery questions";
                            }
                        }
                        if (i2 == 653) {
                            if (this.hQ == 201) {
                                if (this.ix == 1) {
                                    aaVar.an = "@whi@recommend you use a members world instead. You may use";
                                } else {
                                    aaVar.an = "";
                                }
                            } else if (this.hQ == 200) {
                                aaVar.an = "We strongly recommend you do so now to secure your account.";
                            } else {
                                aaVar.an = "If you do not remember making this change then cancel it immediately";
                            }
                        }
                        if (i2 == 654) {
                            if (this.hQ == 201) {
                                if (this.ix == 1) {
                                    aaVar.an = "@whi@this world but member benefits are unavailable whilst here.";
                                } else {
                                    aaVar.an = "";
                                }
                            } else if (this.hQ == 200) {
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
                for (int i30 = 0; i30 < this.dr.length; i30++) {
                    j2 += this.dr[i30];
                }
                str3 = "Total XP: " + String.format("%, d", Long.valueOf(j2));
            } else {
                String[] strArr = new String[6];
                int[] iArr = {0, 3, 14, 2, 16, 13, 1, 15, 10, 4, 17, 7, 5, 12, 11, 6, 9, 8, 20, 18, 19, 21, 22, 23, 24, 25};
                int i31 = af.c[iArr[i29]][0];
                int i32 = af.c[iArr[i29]][1];
                int i33 = iArr[i29];
                int i34 = this.I[i33];
                int i35 = this.M[i33];
                if (i33 == 3 || i33 == 5) {
                    i34 /= 10;
                    i35 /= 10;
                }
                strArr[0] = af.f175a[i29] + ": " + i34 + "/" + i35 + "\\n";
                strArr[1] = "Current Exp: " + String.format("%, d", Integer.valueOf(this.dr[iArr[i29]])) + "\\n";
                strArr[2] = "Next level: " + String.format("%, d", Integer.valueOf(org.necrotic.client.e.a.b.b(i35 + 1) - this.dr[iArr[i29]]));
                String str4 = strArr[0] + strArr[1];
                boolean z2 = false;
                if (i35 < 99) {
                    str4 = str4 + strArr[2];
                    z2 = true;
                }
                if (this.dr[iArr[i29]] < 1000000000 && i31 >= 0 && i32 >= 0) {
                    strArr[4] = (z2 ? "\\n" : "") + af.d + (af.d.endsWith("Level: ") ? Integer.valueOf(org.necrotic.client.e.a.b.a(i32)) : String.format("%,d", Integer.valueOf(i32))) + "\\n";
                    int i36 = (i32 - this.dr[iArr[i29]]) - (af.d.endsWith("Level: ") ? 1 : 0);
                    int i37 = i36;
                    if (i36 < 0) {
                        i37 = 0;
                    }
                    strArr[5] = "Remainder: " + String.format("%,d", Integer.valueOf(i37));
                    af.c[iArr[i29]][2] = (int) (((this.dr[iArr[i29]] - i31) / (i32 - i31)) * 100.0d);
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
        int a2 = this.as.a(split[0]) + 6;
        for (int i4 = 1; i4 < split.length; i4++) {
            if (a2 <= this.as.a(split[i4]) + 6) {
                a2 = this.as.a(split[i4]) + 6;
            }
        }
        org.necrotic.client.f.c.b(length, i3, i2, 16777120, a2);
        org.necrotic.client.f.c.c(i2, a2, length, 0, i3);
        int i5 = i3 + 14;
        for (String str2 : split) {
            this.bi.a(false, i2 + 3, 0, str2, i5);
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
        if (aaVar.ad && this.gk != aaVar.ac && this.gq != aaVar.ac && this.gn != aaVar.ac) {
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
                for (int i18 = 0; i18 < cp.length; i18++) {
                    if (aaVar2.ac == cp[i18] + 1) {
                        if (i18 > 61) {
                            h(i16 + 1, i17);
                        } else {
                            h(i16, i17 + 1);
                        }
                    }
                }
                for (int i19 : cr) {
                    if (aaVar2.ac == i19) {
                        aaVar2.aq = 775;
                    }
                }
                if (aaVar2.ac != 1194 && aaVar2.ac != 12856) {
                    if (aaVar2.aK == 282 && aaVar2.A != null) {
                        for (int i20 = 0; i20 < aaVar2.A.length; i20++) {
                            org.necrotic.client.f.e a4 = org.necrotic.client.c.a.i.a(aaVar2.A[i20], 0, 0);
                            org.necrotic.client.f.e.a(a4, a4.d, this.fI).e(i16 + 30 + (i20 * 50), i17 + 3);
                        }
                        if (this.fH % 3 == 0) {
                            this.fI++;
                        }
                        this.fH++;
                        System.out.println("Cut amount: " + this.fI);
                        if (this.fI >= 40) {
                            aaVar2.A = null;
                            f().i(199);
                            f().l(1);
                            this.fI = 0;
                        }
                    }
                    if (aaVar2.aK == 287) {
                        a(i16, i17, aaVar2.aO, aaVar2.aa, aaVar2.j, aaVar2.k, aaVar2.l);
                    } else if (aaVar2.aK == 288 && aaVar2.m == org.necrotic.client.f.c.o.VERTICAL_DOWN_UP) {
                        int i21 = (aaVar2.j * aaVar2.aa) / aaVar2.n;
                        new org.necrotic.client.f.e(D.b(aaVar2.aY), aaVar2.aO, Math.min(aaVar2.aa, i21)).c(i16, Math.max(i17, i17 + (aaVar2.aa - i21)));
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
                            this.aZ.e(i16, i17);
                            D.a(1421).e(((i16 + 40) + (t.aJ / 32)) - 10, ((i17 + 458) - (t.aK / 32)) - 10);
                        }
                        if (aaVar2.aK != 2) {
                            if (aaVar2.aK != 3) {
                                if (aaVar2.aK != 4) {
                                    if (aaVar2.aK == 42) {
                                        boolean z2 = false;
                                        if (!((this.gn == aaVar2.ac || this.gq == aaVar2.ac || this.gk == aaVar2.ac || dm == aaVar2) ? true : true)) {
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
                                    z3 = (this.gn == aaVar2.ac || this.gq == aaVar2.ac || this.gk == aaVar2.ac || dm == aaVar2) ? true : true;
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
                                    if (aaVar2.S == 6 && this.eu) {
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
                                                if (this.jQ[i24] == null) {
                                                    this.jQ[i24] = new org.necrotic.client.f.e("currency".concat(String.valueOf(i24)));
                                                }
                                                this.jQ[i24].e(i16 - 19, i17);
                                                int parseInt = Integer.parseInt(split[0]);
                                                if (parseInt <= 0) {
                                                    this.bv.a(true, i16 - 5, 16776960, "FREE", i17 + 10);
                                                } else if (parseInt < 100000) {
                                                    this.bv.a(true, i16 - 5, 16776960, String.valueOf(parseInt), i17 + 10);
                                                } else if (parseInt < 10000000) {
                                                    this.bv.a(true, i16 - 5, 16776960, new StringBuilder().append(parseInt / 1000).toString(), i17 + 10);
                                                } else {
                                                    this.bv.a(true, i16 - 5, 16776960, new StringBuilder().append(parseInt / 1000000).toString(), i17 + 10);
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
                                                    this.bf.a("<img=" + i23 + ">", i16, i28, true);
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
                                z5 = (this.gn == aaVar2.ac || this.gq == aaVar2.ac || this.gk == aaVar2.ac || aaVar2 == dm) ? true : true;
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
                                            if (this.fv == null) {
                                                this.fv = new org.necrotic.client.f.e("/ok/stock");
                                            }
                                            this.fv.e(i32 - 8, i33 - 4);
                                        }
                                        int i34 = 0;
                                        int i35 = 0;
                                        int i36 = aaVar2.ae[i29] - 1;
                                        if (aaVar2.ac == 49565) {
                                            org.necrotic.client.f.c.h.g(i36, i32 - 6, i33 - 6);
                                        }
                                        if ((i32 > org.necrotic.client.f.c.p - 32 && i32 < org.necrotic.client.f.c.q && i33 > org.necrotic.client.f.c.k - 32 && i33 < org.necrotic.client.f.c.l) || (this.gc != 0 && this.gt == i29)) {
                                            int i37 = 0;
                                            if (this.eG == 1 && this.gP == i29 && this.gQ == aaVar2.ac) {
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
                                                if (this.gc == 0 || this.gt != i29 || this.gs != aaVar2.ac) {
                                                    if (this.hA != 0 && this.hy == i29 && this.hz == aaVar2.ac) {
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
                                                    i34 = this.bW - this.gu;
                                                    i35 = this.bX - this.gv;
                                                    if (i34 < 5 && i34 > -5) {
                                                        i34 = 0;
                                                    }
                                                    if (i35 < 5 && i35 > -5) {
                                                        i35 = 0;
                                                    }
                                                    if (this.hg < 10) {
                                                        i34 = 0;
                                                        i35 = 0;
                                                    }
                                                    if (a5 != null) {
                                                        org.necrotic.client.f.c.b(i32 + i34, i33 + i35, a5.a());
                                                    }
                                                    a3.d(i32 + i34, i33 + i35);
                                                    int t2 = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 40 : (t() - Constants.GAME_FIXED_HEIGHT) / 2;
                                                    if (u == 5292) {
                                                        if (this.bX >= t2 && this.bX <= t2 + 24) {
                                                            this.jo = a3;
                                                            this.jp = this.bW - 20;
                                                            this.jq = this.bX - 20;
                                                        } else if (this.jo != null) {
                                                            this.jo = null;
                                                        }
                                                    }
                                                    if (i33 + i35 < org.necrotic.client.f.c.k && aaVar.aw > 0) {
                                                        int i39 = (this.hd * ((org.necrotic.client.f.c.k - i33) - i35)) / 3;
                                                        int i40 = i39;
                                                        if (i39 > this.hd * 10) {
                                                            i40 = this.hd * 10;
                                                        }
                                                        if (i40 > aaVar.aw) {
                                                            i40 = aaVar.aw;
                                                        }
                                                        aaVar.aw -= i40;
                                                        this.gv += i40;
                                                    }
                                                    if (i33 + i35 + 32 > org.necrotic.client.f.c.l && aaVar.aw < aaVar.au - aaVar.aa) {
                                                        int i41 = (this.hd * (((i33 + i35) + 32) - org.necrotic.client.f.c.l)) / 3;
                                                        int i42 = i41;
                                                        if (i41 > this.hd * 10) {
                                                            i42 = this.hd * 10;
                                                        }
                                                        if (i42 > (aaVar.au - aaVar.aa) - aaVar.aw) {
                                                            i42 = (aaVar.au - aaVar.aa) - aaVar.aw;
                                                        }
                                                        aaVar.aw += i42;
                                                        this.gv -= i42;
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
                                                        this.be.a("<trans=170>" + c(i43), i32 + i34, i33 + 9 + i35, 16776960, 0, false);
                                                    } else if (i43 >= 1500000000 && aaVar2.al) {
                                                        D.a(780).e(i32, i33);
                                                    } else {
                                                        this.bv.b(0, c(i43), i33 + 10 + i35, i32 + 1 + i34);
                                                        if (i43 > 99999 && i43 < 10000000) {
                                                            this.bv.b(16777215, c(i43), i33 + 9 + i35, i32 + i34);
                                                        } else if (i43 > 9999999) {
                                                            this.bv.b(65408, c(i43), i33 + 9 + i35, i32 + i34);
                                                        } else {
                                                            this.bv.b(16776960, c(i43), i33 + 9 + i35, i32 + i34);
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
                                                if (this.bW >= i16 && this.bX >= i17 && this.bW < i16 + aaVar2.aO && this.bX < i17 + aaVar2.aa) {
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
                                            } else if (aaVar2.aK != 8 || ((this.gT != aaVar2.ac && this.go != aaVar2.ac && this.gB != aaVar2.ac) || this.gU != 30 || this.aW)) {
                                                ?? r0 = aaVar2.aK;
                                                if (r0 == 9) {
                                                    try {
                                                        r0 = this;
                                                        r0.a(i16, i17, aaVar2.aJ);
                                                    } catch (Exception unused2) {
                                                        r0.printStackTrace();
                                                    }
                                                } else if (aaVar2.aK != 88) {
                                                    if (aaVar2.aK != 10 || this.aW || this.fq <= 0 || this.gU != 30) {
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
                                                    } else if (aaVar2.ac == this.fq) {
                                                        int i44 = 0;
                                                        int i45 = 0;
                                                        org.necrotic.client.f.a.c cVar2 = this.bi;
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
                                                        boolean z7 = (this.dr[x(aaVar2.ac)] >= 1000000000 || af.c[x(aaVar2.ac)][0] == -1 || af.c[x(aaVar2.ac)][1] == -1 || af.c[x(aaVar2.ac)][2] == -1) ? false : true;
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
                                                        if (z7 && this.dr[x(aaVar2.ac)] < 1000000000 && af.c[x(aaVar2.ac)][0] != -1 && af.c[x(aaVar2.ac)][1] != -1 && af.c[x(aaVar2.ac)][2] != -1) {
                                                            int i51 = af.c[x(aaVar2.ac)][2];
                                                            org.necrotic.client.f.c.c(i48 + 4, i46 - 7, 12, 0, (i49 + i7) - 14);
                                                            org.necrotic.client.f.c.b(10, (i49 + i7) - 13, i48 + 4 + 1, Color.RED.getRGB(), i46 - 9);
                                                            org.necrotic.client.f.c.b(10, (i49 + i7) - 13, i48 + 4 + 1, Color.GREEN.getRGB(), ((int) (((i46 - 7) * 0.01d) * i51)) - 2);
                                                            if (i51 == 100) {
                                                                this.bv.a(0, "Goal Completed!", (i49 - 3) + i7, (int) (i48 + (((i46 - 7) - (cVar2.a("Goal Completed!") + 10)) / 2.0d) + 54.0d));
                                                            } else {
                                                                this.bv.a(0, i51 + Units.PERCENT, (i49 - 3) + i7, (int) (i48 + (((i46 - 6) - (cVar2.a(i51 + Units.PERCENT) + 10)) / 2.0d) + 24.0d));
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
                                                org.necrotic.client.f.a.c cVar3 = this.bi;
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
                                            org.necrotic.client.c.a.a aVar = org.necrotic.client.c.a.a.f183a[i8];
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
                                    int i73 = yVar.f273a[yVar.b];
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
                                aaVar2.aV = aaVar2.aU > this.M[23];
                                if (aaVar2.aV) {
                                    aaVar2.aA.i();
                                    eVar3 = aaVar2.aA;
                                } else {
                                    eVar3 = aaVar2.aB;
                                }
                            }
                            if (this.eO == 1 && aaVar2.ac == dl && dl != 0 && eVar3 != null) {
                                eVar3.e(i16, i17, 16777215);
                            } else if (eVar3 != null) {
                                if (aaVar2.aT) {
                                    eVar3.c(i16, i17);
                                } else {
                                    eVar3.e(i16, i17);
                                }
                            }
                            if (this.eS && aaVar2.ac == this.eT) {
                                D.a(497).e(i16 - 3, i17 - 3);
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
        this.jb.a();
        org.necrotic.client.f.c.c(0, 0, s(), t());
        int s2 = s() / 2;
        int t2 = t() / 2;
        this.iZ += this.iZ < 250 ? 8 : 0;
        if (this.iZ < 250) {
            D.a(449).c(s2 - (D.a(449).d / 2), t2 - (D.a(449).e / 2), this.iZ);
        } else {
            int i2 = -1;
            this.bG = null;
            this.fm = false;
            this.fl = false;
            this.fk = false;
            this.fj = false;
            this.fi = false;
            this.fs = false;
            for (int i3 = 0; i3 < this.fn.length; i3++) {
                this.fn[i3] = false;
                this.fo[i3] = false;
            }
            if (this.bW >= 280 && this.bW <= 485 && this.bX >= 312 && this.bX <= 350) {
                this.fi = true;
            }
            if (this.jW) {
                if (this.bW >= 228 && this.bW <= 265 && this.bX >= 190 && this.bX <= 210) {
                    this.fs = true;
                }
                if (this.bW >= 236 && this.bW <= 536 && this.bX >= 270 && this.bX <= 308) {
                    i2 = 2;
                    this.fk = true;
                }
            } else {
                if (this.bW >= 233 && this.bW <= 533) {
                    if (this.bX >= 189 && this.bX <= 229) {
                        i2 = 2;
                        this.fk = true;
                    } else if (this.bX >= 238 && this.bX <= 276) {
                        i2 = 2;
                        this.fl = true;
                    }
                }
                if (this.bW >= 230 && this.bW <= 270 && this.bX >= 240 && this.bX <= 312) {
                    this.fj = true;
                }
            }
            if (this.bW >= 225 && this.bW <= 540 && this.bX >= 394 && this.bX <= 449) {
                this.fn[0] = this.bW >= 225 && this.bW <= 280;
                this.fn[1] = this.bW >= 355 && this.bW <= 410;
                this.fn[2] = this.bW >= 485 && this.bW <= 540;
                for (int i4 = 0; i4 < this.fn.length && !this.fn[i4]; i4++) {
                }
            }
            if (this.bW >= 282 && this.bW <= 550 && this.bX >= 394 && this.bX <= 404) {
                this.fo[0] = this.bW >= 280 && this.bW <= 290;
                this.fo[1] = this.bW >= 410 && this.bW <= 420;
                this.fo[2] = this.bW >= 540 && this.bW <= 550;
                for (int i5 = 0; i5 < this.fo.length && !this.fo[i5]; i5++) {
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
            D.a(449).c(0, 0);
            if (this.fi) {
                D.a(464).c(263, 305);
            } else {
                D.a(463).c(263, 305);
            }
            if (!this.jW) {
                if (this.fk) {
                    D.a(466).c(260, 190);
                } else {
                    D.a(465).c(260, 190);
                }
                if (this.fl) {
                    D.a(470).c(260, 238);
                } else {
                    D.a(469).c(260, 238);
                }
                if (org.necrotic.a.d) {
                    D.a(468).c(250, 288);
                } else {
                    D.a(467).c(250, 288);
                }
            }
            if (this.jW) {
                if (this.fk) {
                    D.a(470).c(237, 270);
                } else {
                    D.a(469).c(237, 270);
                }
                if (this.ip == 0 && s % 45 < 10) {
                    this.as.a(true, 289, 16777215, this.jY + "|", 292);
                } else {
                    this.as.a(true, 289, 16777215, this.jY, 292);
                }
            } else {
                if (this.ip == 0 && s % 45 < 10) {
                    this.as.a(true, 289, 16777215, B + "|", 213);
                } else {
                    this.as.a(true, 289, 16777215, B, 213);
                }
                if (this.ip == 1 && s % 45 < 10) {
                    this.as.a(true, 289, 16777215, f(this.bK) + "|", 263);
                } else {
                    this.as.a(true, 289, 16777215, f(this.bK), 263);
                }
            }
            if (!this.jW) {
                int i6 = 226;
                for (int i7 = 0; i7 < this.fn.length; i7++) {
                    if (this.eP.getAccounts()[i7] == null) {
                        if (this.eP != null) {
                            if (this.fn[i7]) {
                                D.a(1594).c(i6, 394);
                                D.a(1598).c(i6 - 33, 454);
                            } else {
                                D.a(1593).c(i6, 394);
                                D.a(1597).c(i6 - 33, 454);
                            }
                            if (this.fo[i7]) {
                                D.a(1600).c(i6 + 54, 394);
                            } else {
                                D.a(1599).c(i6 + 54, 394);
                            }
                        }
                    } else {
                        if (this.fn[i7]) {
                            D.a(1596).c(i6, 394);
                            D.a(1598).c(i6 - 33, 454);
                        } else {
                            D.a(1595).c(i6, 394);
                            D.a(1597).c(i6 - 33, 454);
                        }
                        if (this.fo[i7]) {
                            D.a(1600).c(i6 + 54, 394);
                        } else {
                            D.a(1599).c(i6 + 54, 394);
                        }
                        this.be.a(account.getUsername(), i6 + 26, 469, 16777215, 0);
                    }
                    i6 += 130;
                }
            }
            if (!this.jW) {
                for (int i8 = 0; i8 < this.io.length; i8++) {
                    String str = this.io[i8];
                    if (str != null && str.length() != 0) {
                        this.as.a(true, (p / 2) - (this.as.a(str) / 2), 16777215, str, (o / 2) + (i8 * 20) + 240);
                    }
                }
            } else if (this.jX) {
                org.necrotic.client.f.c.d(16777215, 185, this.jZ.d, this.jZ.e + 10, (p - this.jZ.d) / 2);
                this.jZ.c((p - this.jZ.d) / 2, 190);
                if (this.fs) {
                    this.bf.a("Back", 245, 205, 16766720, 0);
                } else {
                    this.bf.a("Back", 245, 205, 16777215, 0);
                }
            }
        }
        if (!this.jz) {
            this.jb.a(cl.getGraphics(), 0, 0);
        }
        if (this.jk) {
            this.jk = false;
        }
    }

    public final void i() {
        int i2 = this.iC;
        int i3 = this.iD;
        int i4 = this.iE;
        int i5 = this.bW;
        int i6 = this.bX;
        int i7 = this.iB + 1;
        if (this.aX == 1 && org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
            i2 += 519;
            i3 += 168;
        }
        if (this.aX == 2 && org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
            i3 += 338;
        }
        if (this.aX == 3 && org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
            i2 += 515;
        }
        if (this.aX == 0) {
            i5 -= 4;
            i6 -= 4;
        }
        if (this.aX == 1 && org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
            i5 -= 519;
            i6 -= 168;
        }
        if (this.aX == 2 && org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
            i5 -= 17;
            i6 -= 338;
        }
        if (this.aX == 3 && org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
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
        this.bg.a("Choose Option", i2 + 3, i3 + 14, 13023381, 0, true);
        int i8 = i2;
        for (int i9 = 0; i9 < this.aV; i9++) {
            int i10 = i3 + 31 + (((this.aV - 1) - i9) * 15);
            int i11 = 16777215;
            if (i5 > i2 && i5 < i2 + i4 && i6 > i10 - 11 && i6 < i10 + 5) {
                org.necrotic.client.f.c.b(15, i10 - 11, i2 + 3, 7301469, this.iE - 6);
                h(this.aU[i9]);
                i11 = 16776960;
                this.jw = i9;
            }
            this.bg.a(this.aU[i9], i2 + 3, i10, i11, 0, true);
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
        this.ea.a(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 519 : s() - 170);
        this.ea.b(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 0 : 1);
        this.ea.a(this);
    }

    public final void a(org.necrotic.client.f.e eVar, int i2, int i3) {
        int i4 = (i3 * i3) + (i2 * i2);
        if (i4 > 4225 && i4 < 90000) {
            int i5 = (this.bA + this.ba) & 2047;
            int i6 = org.necrotic.client.n.l.e[i5];
            int i7 = org.necrotic.client.n.l.f[i5];
            int i8 = this.bb;
            int i9 = (i6 << 8) / 256;
            int i10 = this.bb;
            int i11 = (i7 << 8) / 256;
            double atan2 = Math.atan2(((i2 * i9) + (i3 * i11)) >> 16, ((i2 * i11) - (i3 * i9)) >> 16);
            int sin = (int) (Math.sin(atan2) * 63.0d);
            int cos = (int) (Math.cos(atan2) * 57.0d);
            org.necrotic.client.f.e eVar2 = this.it;
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
            D.a(1108).e(i13, i4);
            i12++;
            i13 += 5;
        }
        D.a(1107).e(i11, i4);
        int i14 = i11 + 5;
        for (int i15 = 0; i15 <= i10; i15++) {
            D.a(1110).e(i14, i4);
            i14 += 5;
        }
        D.a(1109).e(((((i2 - 32) - i9) * i3) / (i6 - i2)) + 16 + i5 + (i9 - 5), i4);
        D.a(1112).e(i5, i4);
        D.a(1111).e((i5 + i2) - 16, i4);
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
            this.ee[i7 + 1].e(i5, i13);
            i12++;
            i13 += 5;
        }
        this.ee[i7 + 2].e(i5, i11);
        int i14 = i11 + 5;
        for (int i15 = 0; i15 <= i10; i15++) {
            this.ee[i7 + 3].e(i5, i14);
            i14 += 5;
        }
        this.ee[i7].e(i5, (((((((i2 - 32) - i9) * i3) / (i6 - i2)) + 16) + i4) + i9) - 5);
        if (z2) {
            this.ed[4].e(i5, i4);
            this.ed[5].e(i5, (i4 + i2) - 16);
            return;
        }
        this.ed[0].e(i5, i4);
        this.ed[1].e(i5, (i4 + i2) - 16);
    }

    private void aa() {
        int i2 = this.dH[2000] & ColorUtil.MAX_RGB_VALUE;
        int i3 = (this.dH[2000] >> 8) & ColorUtil.MAX_RGB_VALUE;
        org.necrotic.client.f.e a2 = D.a(617);
        org.necrotic.client.f.e a3 = D.a(613);
        org.necrotic.client.f.e a4 = D.a(614);
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
        this.bx.a(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 516 : (s() - this.bx.f()) + 12);
        this.bx.b(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 168 : (t() - this.bx.c()) + 2);
        this.bx.a(this);
    }

    private void ac() {
        String str;
        if (this.aV < 2 && this.eG == 0 && this.eO == 0) {
            if (org.necrotic.a.n) {
                super.a(org.necrotic.client.f.b.CURSOR_0);
                return;
            }
            return;
        }
        if (this.eG == 1 && this.aV < 2) {
            str = "Use " + this.iS + " with...";
        } else if (this.eO == 1 && this.aV < 2) {
            str = this.iV + "...";
        } else {
            str = this.aU[this.aV - 1];
        }
        if (this.aV > 2) {
            str = str + "@whi@ / " + (this.aV - 2) + " more options";
        }
        this.bg.a(str, 4, 15, 16777215, 0, true);
        if (org.necrotic.a.n) {
            h(this.aU[this.aV - 1]);
        }
    }

    private void ad() {
        if (this.ex > 0) {
            at();
            return;
        }
        if (this.aF != null) {
            this.aF.a();
        }
        D.a(1105).e(7, 4);
        if (!this.jz && this.aF != null) {
            this.aF.a(cl.getGraphics(), this.eX, this.eY);
        }
        this.V = 0;
        this.ay = 0;
        org.necrotic.client.h.a aVar = this.hH;
        aJ = false;
        this.in = 0;
        a(this.bK, true, B, this);
        if (!aJ) {
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
                    i7 = this.I[iArr[i4]];
                }
                if (i6 == 2) {
                    int i8 = i4;
                    i4++;
                    i7 = this.M[iArr[i8]];
                }
                if (i6 == 3) {
                    int i9 = i4;
                    i4++;
                    i7 = this.dr[iArr[i9]];
                }
                if (i6 == 4) {
                    int i10 = i4;
                    int i11 = i4 + 1;
                    aa aaVar2 = aa.u[iArr[i10]];
                    i4 = i11 + 1;
                    int i12 = iArr[i11];
                    if (i12 >= 0 && i12 < org.necrotic.client.c.a.i.g && (!org.necrotic.client.c.a.i.a(i12).y || dd)) {
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
                    i7 = this.bM[iArr[i14]];
                }
                if (i6 == 6) {
                    int i15 = i4;
                    i4++;
                    i7 = co[this.M[iArr[i15]] - 1];
                }
                if (i6 == 7) {
                    int i16 = i4;
                    i4++;
                    i7 = (this.bM[iArr[i16]] * 100) / 46875;
                }
                if (i6 == 8) {
                    i7 = t.u;
                }
                if (i6 == 9) {
                    for (int i17 = 0; i17 < 25; i17++) {
                        if (af.b[i17]) {
                            i7 += this.M[i17];
                        }
                    }
                }
                if (i6 == 10) {
                    int i18 = i4;
                    int i19 = i4 + 1;
                    aa aaVar3 = aa.u[iArr[i18]];
                    i4 = i19 + 1;
                    int i20 = iArr[i19] + 1;
                    if (i20 >= 0 && i20 < org.necrotic.client.c.a.i.g && (!org.necrotic.client.c.a.i.a(i20).y || dd)) {
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
                    i7 = this.aB;
                }
                if (i6 == 12) {
                    i7 = this.jj;
                }
                if (i6 == 13) {
                    int i22 = i4;
                    int i23 = i4 + 1;
                    i4 = i23 + 1;
                    i7 = (this.bM[iArr[i22]] & (1 << iArr[i23])) == 0 ? 0 : 1;
                }
                if (i6 == 14) {
                    int i24 = i4;
                    i4++;
                    org.necrotic.client.c.a.n nVar = org.necrotic.client.c.a.n.f192a[iArr[i24]];
                    int i25 = nVar.b;
                    int i26 = nVar.c;
                    i7 = (this.bM[i25] >> i26) & m[nVar.d - i26];
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
                    i7 = (t.aJ >> 7) + this.aj;
                }
                if (i6 == 19) {
                    i7 = (t.aK >> 7) + this.ak;
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
            if (this.J[0] != null) {
                bArr = this.J[0].a(i2);
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
                    if (this.J[0] != null) {
                        this.J[0].a(bArr.length, bArr, i2);
                    }
                } catch (Exception unused2) {
                    this.J[0] = null;
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
                throw new RuntimeException("Unable to find archive: " + this.iK);
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
        if (!this.cg) {
            return;
        }
        this.gE += i2 * 3;
        this.gF += i3 << 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init() {
        try {
            di = 10;
            v = 0;
            E();
            dd = true;
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
        if (z2 && this.bO != 1) {
            return false;
        }
        if ((z2 ? this.ca : this.bW) >= i2) {
            if ((z2 ? this.ca : this.bW) <= i2 + eVar.d) {
                if ((z2 ? this.cb : this.bX) >= i3) {
                    return (z2 ? this.cb : this.bX) <= i3 + eVar.e;
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
            str = cq.matcher(str).replaceAll("");
        }
        for (int i2 = 0; i2 < this.aC; i2++) {
            if (str.equalsIgnoreCase(this.hW[i2])) {
                return true;
            }
        }
        return str.equalsIgnoreCase(t.y);
    }

    private boolean ae() {
        return this.bV == null;
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
        int i4 = (this.bA + this.ba) & 2047;
        int d2 = this.ea.d();
        int h2 = this.ea.h();
        if ((i2 * i2) + (i3 * i3) > 6400) {
            return;
        }
        int i5 = org.necrotic.client.n.l.e[i4];
        int i6 = org.necrotic.client.n.l.f[i4];
        int i7 = this.bb;
        int i8 = (i5 << 8) / 256;
        int i9 = this.bb;
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
        int i3 = this.aT[i2];
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
                org.necrotic.client.j.e eVar = this.bj[cVar.az];
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
            if (i4 == this.jg) {
                i5 = this.ec;
            }
            org.necrotic.client.e.a.a aVar = this.bo[i5];
            if (aVar != null) {
                int i6 = cVar.aJ - aVar.aJ;
                int i7 = cVar.aK - aVar.aK;
                if (i6 != 0 || i7 != 0) {
                    cVar.aI = ((int) (Math.atan2(i6, i7) * 325.949d)) & 2047;
                }
            }
        }
        if ((cVar.ae != 0 || cVar.af != 0) && (cVar.aE == 0 || cVar.M > 0)) {
            int i8 = cVar.aJ - (((cVar.ae - this.aj) - this.aj) << 6);
            int i9 = cVar.aK - (((cVar.af - this.ak) - this.ak) << 6);
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
                if (cVar.R > org.necrotic.client.c.a.a.f183a.length) {
                    cVar.R = 0;
                }
                org.necrotic.client.c.a.a aVar = org.necrotic.client.c.a.a.f183a[cVar.R];
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
            if (cVar.L != -1 && cVar.aa <= 1 && org.necrotic.client.c.a.a.f183a[cVar.L].m == 1 && cVar.ah > 0 && cVar.am <= s && cVar.an < s) {
                cVar.aa = 1;
                return;
            }
            if (cVar.L != -1 && cVar.aa == 0) {
                org.necrotic.client.c.a.a aVar3 = org.necrotic.client.c.a.a.f183a[cVar.L];
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
            int i2 = t.aJ + this.hF;
            int i3 = t.aK + this.hG;
            if (this.gg - i2 < -500 || this.gg - i2 > 500 || this.gh - i3 < -500 || this.gh - i3 > 500) {
                this.gg = i2;
                this.gh = i3;
            }
            if (this.gg != i2) {
                this.gg += (i2 - this.gg) / 16;
            }
            if (this.gh != i3) {
                this.gh += (i3 - this.gh) / 16;
            }
            if (this.bU[1] == 1) {
                this.gE += ((-24) - this.gE) / 2;
            } else if (this.bU[2] == 1) {
                this.gE += (24 - this.gE) / 2;
            } else {
                this.gE /= 2;
            }
            if (this.bU[3] == 1) {
                this.gF += (12 - this.gF) / 2;
            } else if (this.bU[4] == 1) {
                this.gF += ((-12) - this.gF) / 2;
            } else {
                this.gF /= 2;
            }
            this.bA = (this.bA + (this.gE / 2)) & 2047;
            this.gD += this.gF / 2;
            if (this.gD < 128) {
                this.gD = 128;
            }
            if (this.gD > 383) {
                this.gD = 383;
            }
            int i4 = this.gg >> 7;
            int i5 = this.gh >> 7;
            int b2 = b(this.bn, this.gh, this.gg);
            int i6 = 0;
            if (i4 > 3 && i5 > 3 && i4 < 100 && i5 < 100) {
                for (int i7 = i4 - 4; i7 <= i4 + 4; i7++) {
                    for (int i8 = i5 - 4; i8 <= i5 + 4; i8++) {
                        int i9 = this.bn;
                        int i10 = i9;
                        if (i9 < 3 && (this.hE[1][i7][i8] & 2) == 2) {
                            i10++;
                        }
                        int i11 = b2 - this.ii[i10][i7][i8];
                        if (i11 > i6) {
                            i6 = i11;
                        }
                    }
                }
            }
            int i12 = cH + 1;
            cH = i12;
            if (i12 > 1512) {
                cH = 0;
                dj.i(77);
                dj.l(0);
                int i13 = dj.f;
                dj.l((int) (Math.random() * 256.0d));
                dj.l(101);
                dj.l(233);
                dj.j(45092);
                if (((int) (Math.random() * 2.0d)) == 0) {
                    dj.j(35784);
                }
                dj.l((int) (Math.random() * 256.0d));
                dj.l(64);
                dj.l(38);
                dj.j((int) (Math.random() * 65536.0d));
                dj.j((int) (Math.random() * 65536.0d));
                org.necrotic.client.g.a aVar = dj;
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
            if (i15 > this.he) {
                this.he += (i15 - this.he) / 24;
            } else if (i15 < this.he) {
                this.he += (i15 - this.he) / 80;
            }
        } catch (Exception unused) {
            ae.a("glfc_ex " + t.aJ + "," + t.aK + "," + this.gg + "," + this.gh + "," + cw + "," + cx + "," + this.aj + "," + this.ak);
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
            int[] iArr = this.ho;
            int i2 = this.gX;
            this.gX = i2 + 1;
            iArr[i2] = this.ec;
        } else if (a2 == 1) {
            t.a(false, aVar.a(3));
            if (aVar.a(1) == 1) {
                int[] iArr2 = this.ho;
                int i3 = this.gX;
                this.gX = i3 + 1;
                iArr2[i3] = this.ec;
            }
        } else if (a2 == 2) {
            t.a(true, aVar.a(3));
            t.a(true, aVar.a(3));
            if (aVar.a(1) == 1) {
                int[] iArr3 = this.ho;
                int i4 = this.gX;
                this.gX = i4 + 1;
                iArr3[i4] = this.ec;
            }
        } else if (a2 == 3) {
            this.bn = aVar.a(2);
            if (this.hf != this.bn) {
                this.eH = 1;
            }
            this.hf = this.bn;
            int a3 = aVar.a(1);
            if (aVar.a(1) == 1) {
                int[] iArr4 = this.ho;
                int i5 = this.gX;
                this.gX = i5 + 1;
                iArr4[i5] = this.ec;
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
                    org.necrotic.client.c.a.a aVar = org.necrotic.client.c.a.a.f183a[i5];
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
        if (this.eR < 310) {
            int i5 = this.bB >> 7;
            int i6 = this.bC >> 7;
            int i7 = t.aJ >> 7;
            int i8 = t.aK >> 7;
            try {
                if ((this.hE[this.bn][i5][i6] & 4) != 0) {
                    i4 = this.bn;
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
                        if ((this.hE[this.bn][i5][i6] & 4) != 0) {
                            i4 = this.bn;
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
                            if ((this.hE[this.bn][i5][i6] & 4) != 0) {
                                i4 = this.bn;
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
                        if ((this.hE[this.bn][i5][i6] & 4) != 0) {
                            i4 = this.bn;
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
                            if ((this.hE[this.bn][i5][i6] & 4) != 0) {
                                i4 = this.bn;
                            }
                        } catch (ArrayIndexOutOfBoundsException unused5) {
                        }
                    }
                }
            }
        }
        try {
            if ((this.hE[this.bn][t.aJ >> 7][t.aK >> 7] & 4) != 0) {
                i4 = this.bn;
            }
        } catch (ArrayIndexOutOfBoundsException unused6) {
        }
        return i4;
    }

    private void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        h hVar = null;
        org.necrotic.client.c.b.b e2 = this.fZ.e();
        while (true) {
            h hVar2 = (h) e2;
            if (hVar2 != null) {
                if (hVar2.e == i8 && hVar2.g == i9 && hVar2.h == i6 && hVar2.f == i5) {
                    hVar = hVar2;
                    break;
                }
                e2 = this.fZ.f();
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
            this.fZ.a(hVar);
        }
        hVar.f225a = i3;
        hVar.c = i7;
        hVar.b = i4;
        hVar.l = i10;
        hVar.d = i2;
    }

    private void b(org.necrotic.client.g.a aVar) {
        int a2 = aVar.a(8);
        if (a2 < this.bp) {
            for (int i2 = a2; i2 < this.bp; i2++) {
                int[] iArr = this.hn;
                int i3 = this.gV;
                this.gV = i3 + 1;
                iArr[i3] = this.bq[i2];
            }
        }
        if (a2 > this.bp) {
            ae.a(B + " Too many players");
            throw new RuntimeException("eek");
        }
        this.bp = 0;
        for (int i4 = 0; i4 < a2; i4++) {
            int i5 = this.bq[i4];
            org.necrotic.client.e.a.a aVar2 = this.bo[i5];
            if (aVar.a(1) == 0) {
                int[] iArr2 = this.bq;
                int i6 = this.bp;
                this.bp = i6 + 1;
                iArr2[i6] = i5;
                aVar2.ad = s;
            } else {
                int a3 = aVar.a(2);
                if (a3 == 0) {
                    int[] iArr3 = this.bq;
                    int i7 = this.bp;
                    this.bp = i7 + 1;
                    iArr3[i7] = i5;
                    aVar2.ad = s;
                    int[] iArr4 = this.ho;
                    int i8 = this.gX;
                    this.gX = i8 + 1;
                    iArr4[i8] = i5;
                } else if (a3 != 1) {
                    if (a3 != 2) {
                        if (a3 == 3) {
                            int[] iArr5 = this.hn;
                            int i9 = this.gV;
                            this.gV = i9 + 1;
                            iArr5[i9] = i5;
                        }
                    } else {
                        int[] iArr6 = this.bq;
                        int i10 = this.bp;
                        this.bp = i10 + 1;
                        iArr6[i10] = i5;
                        aVar2.ad = s;
                        aVar2.a(true, aVar.a(3));
                        aVar2.a(true, aVar.a(3));
                        if (aVar.a(1) == 1) {
                            int[] iArr7 = this.ho;
                            int i11 = this.gX;
                            this.gX = i11 + 1;
                            iArr7[i11] = i5;
                        }
                    }
                } else {
                    int[] iArr8 = this.bq;
                    int i12 = this.bp;
                    this.bp = i12 + 1;
                    iArr8[i12] = i5;
                    aVar2.ad = s;
                    aVar2.a(false, aVar.a(3));
                    if (aVar.a(1) == 1) {
                        int[] iArr9 = this.ho;
                        int i13 = this.gX;
                        this.gX = i13 + 1;
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
            int i4 = this.gN + ((t2 >> 4) & 7);
            int i5 = this.gO + (t2 & 7);
            int u2 = aVar.u();
            int u3 = aVar.u();
            int u4 = aVar.u();
            if (i4 >= 0 && i5 >= 0 && i4 < 104 && i5 < 104 && (aVar4 = this.aG[this.bn][i4][i5]) != null) {
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
            int i6 = this.gN + ((t3 >> 4) & 7);
            int i7 = this.gO + (t3 & 7);
            int u5 = aVar.u();
            int t4 = aVar.t();
            int i8 = (t4 >> 4) & 15;
            int i9 = t4 & 7;
            if (t.aD[0] >= i6 - i8 && t.aD[0] <= i6 + i8 && t.aF[0] >= i7 - i8 && t.aF[0] <= i7 + i8 && dk != 0 && this.dB && !df && this.eN < 50) {
                this.ef[this.eN] = u5;
                this.eh[this.eN] = i9;
                this.eg[this.eN] = org.necrotic.client.n.b.r.f250a[u5];
                cC[this.eN] = null;
                this.eN++;
            }
        }
        if (i2 == 215) {
            int D2 = aVar.D();
            int B2 = aVar.B();
            int i10 = this.gN + ((B2 >> 4) & 7);
            int i11 = this.gO + (B2 & 7);
            int D3 = aVar.D();
            int u6 = aVar.u();
            if (i10 >= 0 && i11 >= 0 && i10 < 104 && i11 < 104 && D3 != this.jg) {
                org.necrotic.client.j.d dVar2 = new org.necrotic.client.j.d();
                dVar2.d = D2;
                dVar2.c = u6;
                if (this.aG[this.bn][i10][i11] == null) {
                    this.aG[this.bn][i10][i11] = new org.necrotic.client.c.b.a();
                }
                this.aG[this.bn][i10][i11].a(dVar2);
                m(i10, i11);
            }
        } else if (i2 == 156) {
            int z2 = aVar.z();
            int i12 = this.gN + ((z2 >> 4) & 7);
            int i13 = this.gO + (z2 & 7);
            int u7 = aVar.u();
            int t5 = aVar.t();
            if (i12 >= 0 && i13 >= 0 && i12 < 104 && i13 < 104 && (aVar3 = this.aG[this.bn][i12][i13]) != null) {
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
                    this.aG[this.bn][i12][i13] = null;
                }
                m(i12, i13);
            }
        } else if (i2 == 160) {
            int B3 = aVar.B();
            int i14 = this.gN + ((B3 >> 4) & 7);
            int i15 = this.gO + (B3 & 7);
            int B4 = aVar.B();
            int i16 = B4 >> 2;
            int i17 = B4 & 3;
            int i18 = this.dJ[i16];
            int D4 = aVar.D();
            if (i14 >= 0 && i15 >= 0 && i14 < 103 && i15 < 103) {
                int i19 = this.ii[this.bn][i14][i15];
                int i20 = this.ii[this.bn][i14 + 1][i15];
                int i21 = this.ii[this.bn][i14 + 1][i15 + 1];
                int i22 = this.ii[this.bn][i14][i15 + 1];
                if (i18 == 0 && (f2 = this.jl.f(this.bn, i14, i15)) != null) {
                    int i23 = (f2.h >> 14) & 32767;
                    if (i16 == 2) {
                        f2.f = new org.necrotic.client.j.g(i23, i17 + 4, 2, i20, i21, i19, i22, D4, false);
                        f2.g = new org.necrotic.client.j.g(i23, (i17 + 1) & 3, 2, i20, i21, i19, i22, D4, false);
                    } else {
                        f2.f = new org.necrotic.client.j.g(i23, i17, i16, i20, i21, i19, i22, D4, false);
                    }
                }
                if (i18 == 1 && (g2 = this.jl.g(i14, i15, this.bn)) != null) {
                    g2.f = new org.necrotic.client.j.g((g2.g >> 14) & 32767, 0, 4, i20, i21, i19, i22, D4, false);
                }
                if (i18 == 2) {
                    org.necrotic.client.n.i h2 = this.jl.h(i14, i15, this.bn);
                    if (i16 == 11) {
                        i16 = 10;
                    }
                    if (h2 != null) {
                        h2.e = new org.necrotic.client.j.g((h2.m >> 14) & 32767, i17, i16, i20, i21, i19, i22, D4, false);
                    }
                }
                if (i18 == 3 && (i3 = this.jl.i(i15, i14, this.bn)) != null) {
                    i3.d = new org.necrotic.client.j.g((i3.e >> 14) & 32767, i17, 22, i20, i21, i19, i22, D4, false);
                }
            }
        } else {
            if (i2 == 147) {
                int B5 = aVar.B();
                int i24 = this.gN + ((B5 >> 4) & 7);
                int i25 = this.gO + (B5 & 7);
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
                int i29 = this.dJ[i27];
                byte n2 = aVar.n();
                int u10 = aVar.u();
                byte C3 = aVar.C();
                if (u8 == this.jg) {
                    aVar2 = t;
                } else {
                    aVar2 = this.bo[u8];
                }
                if (aVar2 != null && (a3 = (a2 = org.necrotic.client.c.a.k.a(u10)).a(i27, i28, this.ii[this.bn][i24][i25], this.ii[this.bn][i24 + 1][i25], this.ii[this.bn][i24 + 1][i25 + 1], this.ii[this.bn][i24][i25 + 1], -1)) != null) {
                    a(u9 + 1, -1, 0, i29, i25, 0, this.bn, i24, l2 + 1);
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
                    aVar2.k = b(this.bn, aVar2.l, aVar2.j);
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
                int i32 = this.gN + ((z3 >> 4) & 7);
                int i33 = this.gO + (z3 & 7);
                int l3 = aVar.l();
                int B7 = aVar.B();
                int i34 = B7 >> 2;
                int i35 = B7 & 3;
                int i36 = this.dJ[i34];
                if (l3 < -1) {
                    l3 = 32767 - l3;
                }
                if (i32 >= 0 && i33 >= 0 && i32 < 104 && i33 < 104) {
                    a(-1, l3, i35, i36, i33, i34, this.bn, i32, 0);
                }
            } else if (i2 == 4) {
                int t6 = aVar.t();
                int i37 = this.gN + ((t6 >> 4) & 7);
                int i38 = this.gO + (t6 & 7);
                int u11 = aVar.u();
                int t7 = aVar.t();
                int u12 = aVar.u();
                if (i37 >= 0 && i38 >= 0 && i37 < 104 && i38 < 104) {
                    int i39 = (i37 << 7) + 64;
                    int i40 = (i38 << 7) + 64;
                    this.fY.a(new org.necrotic.client.j.b(this.bn, s, u12, u11, b(this.bn, i40, i39) - t7, i40, i39));
                }
            } else if (i2 == 44) {
                int m2 = aVar.m();
                long i41 = aVar.i();
                int t8 = aVar.t();
                int t9 = aVar.t();
                int i42 = this.gN + ((t8 >> 4) & 7);
                int i43 = this.gO + (t8 & 7);
                if (i42 >= 0 && i43 >= 0 && i42 < 104 && i43 < 104) {
                    org.necrotic.client.j.d dVar4 = new org.necrotic.client.j.d();
                    dVar4.d = m2;
                    dVar4.c = (int) i41;
                    dVar4.e = u.values()[t9];
                    if (this.aG[this.bn][i42][i43] == null) {
                        this.aG[this.bn][i42][i43] = new org.necrotic.client.c.b.a();
                    }
                    this.aG[this.bn][i42][i43].a(dVar4);
                    m(i42, i43);
                }
            } else if (i2 == 101) {
                int A2 = aVar.A();
                int i44 = A2 >> 2;
                int i45 = A2 & 3;
                int i46 = this.dJ[i44];
                int t10 = aVar.t();
                int i47 = this.gN + ((t10 >> 4) & 7);
                int i48 = this.gO + (t10 & 7);
                if (i47 >= 0 && i48 >= 0 && i47 < 104 && i48 < 104) {
                    a(-1, -1, i45, i46, i48, i44, this.bn, i47, 0);
                }
            } else if (i2 == 117) {
                int t11 = aVar.t();
                int i49 = this.gN + ((t11 >> 4) & 7);
                int i50 = this.gO + (t11 & 7);
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
                    org.necrotic.client.j.f fVar = new org.necrotic.client.j.f(t14, t13, u14 + s, u15 + s, t15, this.bn, b(this.bn, i52, i51) - t12, i52, i51, o2, u13);
                    fVar.a(u14 + s, i54, b(this.bn, i54, i53) - t13, i53);
                    this.fX.a(fVar);
                }
            }
        }
    }

    private void c(org.necrotic.client.g.a aVar) {
        aVar.x();
        int a2 = aVar.a(8);
        if (a2 < this.bk) {
            for (int i2 = a2; i2 < this.bk; i2++) {
                int[] iArr = this.hn;
                int i3 = this.gV;
                this.gV = i3 + 1;
                iArr[i3] = this.bl[i2];
            }
        }
        if (a2 > this.bk) {
            System.out.println(B + " Too many npcs");
            throw new RuntimeException("eek");
        }
        this.bk = 0;
        this.fp = a2;
        for (int i4 = 0; i4 < a2; i4++) {
            int i5 = this.bl[i4];
            org.necrotic.client.j.e eVar = this.bj[i5];
            if (aVar.a(1) == 0) {
                int[] iArr2 = this.bl;
                int i6 = this.bk;
                this.bk = i6 + 1;
                iArr2[i6] = i5;
                eVar.ad = s;
            } else {
                int a3 = aVar.a(2);
                if (a3 == 0) {
                    int[] iArr3 = this.bl;
                    int i7 = this.bk;
                    this.bk = i7 + 1;
                    iArr3[i7] = i5;
                    eVar.ad = s;
                    int[] iArr4 = this.ho;
                    int i8 = this.gX;
                    this.gX = i8 + 1;
                    iArr4[i8] = i5;
                } else if (a3 != 1) {
                    if (a3 != 2) {
                        if (a3 == 3) {
                            int[] iArr5 = this.hn;
                            int i9 = this.gV;
                            this.gV = i9 + 1;
                            iArr5[i9] = i5;
                        }
                    } else {
                        int[] iArr6 = this.bl;
                        int i10 = this.bk;
                        this.bk = i10 + 1;
                        iArr6[i10] = i5;
                        eVar.ad = s;
                        eVar.a(true, aVar.a(3));
                        eVar.a(true, aVar.a(3));
                        if (aVar.a(1) == 1) {
                            int[] iArr7 = this.ho;
                            int i11 = this.gX;
                            this.gX = i11 + 1;
                            iArr7[i11] = i5;
                        }
                    }
                } else {
                    int[] iArr8 = this.bl;
                    int i12 = this.bk;
                    this.bk = i12 + 1;
                    iArr8[i12] = i5;
                    eVar.ad = s;
                    eVar.a(false, aVar.a(3));
                    if (aVar.a(1) == 1) {
                        int[] iArr9 = this.ho;
                        int i13 = this.gX;
                        this.gX = i13 + 1;
                        iArr9[i13] = i5;
                    }
                }
            }
        }
    }

    private void b(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i6 > 0 && i2 > 0 && i6 <= 102 && i2 <= 102) {
            if (df && i3 != this.bn) {
                return;
            }
            int i9 = 0;
            if (i7 == 0) {
                i9 = this.jl.j(i3, i6, i2);
            }
            if (i7 == 1) {
                i9 = this.jl.l(i3, i6, i2);
            }
            if (i7 == 2) {
                i9 = this.jl.n(i3, i6, i2);
            }
            if (i7 == 3) {
                i9 = this.jl.p(i3, i6, i2);
            }
            if (i9 != 0) {
                int c2 = this.jl.c(i3, i6, i2, i9);
                int i10 = (i9 >> 14) & 32767;
                int i11 = c2 & 31;
                int i12 = c2 >> 6;
                if (i7 == 0) {
                    this.jl.a(i6, i3, i2);
                    org.necrotic.client.c.a.k a2 = org.necrotic.client.c.a.k.a(i10);
                    if (a2.q) {
                        this.fW[i3].a(i12, i11, a2.k, i6, i2);
                    }
                }
                if (i7 == 1) {
                    this.jl.b(i2, i3, i6);
                }
                if (i7 == 2) {
                    this.jl.c(i3, i6, i2);
                    org.necrotic.client.c.a.k a3 = org.necrotic.client.c.a.k.a(i10);
                    if (i6 + a3.g > 103 || i2 + a3.g > 103 || i6 + a3.n > 103 || i2 + a3.n > 103) {
                        return;
                    }
                    if (a3.q) {
                        this.fW[i3].a(i12, a3.g, i6, i2, a3.n, a3.k);
                    }
                }
                if (i7 == 3) {
                    this.jl.d(i3, i2, i6);
                    org.necrotic.client.c.a.k a4 = org.necrotic.client.c.a.k.a(i10);
                    if (a4.q && a4.v) {
                        this.fW[i3].b(i2, i6);
                    }
                }
            }
            if (i8 >= 0) {
                int i13 = i3;
                if (i3 < 3 && (this.hE[1][i6][i2] & 2) == 2) {
                    i13++;
                }
                if (i3 == 4) {
                    i3 = 0;
                }
                org.necrotic.client.n.j.a(this.jl, i4, i2, i5, i13, this.fW[i3], this.ii, i6, i8, i3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ai() {
        try {
            this.hf = -1;
            this.fY.d();
            this.fX.d();
            org.necrotic.client.n.l.g();
            az();
            this.jl.c();
            System.gc();
            for (int i2 = 0; i2 < 4; i2++) {
                this.fW[i2].a();
            }
            for (int i3 = 0; i3 < 4; i3++) {
                for (int i4 = 0; i4 < 104; i4++) {
                    for (int i5 = 0; i5 < 104; i5++) {
                        this.hE[i3][i4][i5] = 0;
                    }
                }
            }
            org.necrotic.client.n.j jVar = new org.necrotic.client.n.j(this.hE, this.ii);
            int length = this.fU.length;
            if (aJ) {
                dj.i(0);
            }
            if (!this.fN) {
                for (int i6 = 0; i6 < length; i6++) {
                    int i7 = ((this.hm[i6] >> 8) << 6) - this.aj;
                    int i8 = ((this.hm[i6] & ColorUtil.MAX_RGB_VALUE) << 6) - this.ak;
                    byte[] bArr = this.fU[i6];
                    if (bArr != null) {
                        jVar.a(bArr, i8, i7, (cw - 6) << 3, (cx - 6) << 3, this.fW);
                    }
                }
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = ((this.hm[i9] >> 8) * 62) - this.aj;
                    int i11 = ((this.hm[i9] & ColorUtil.MAX_RGB_VALUE) * 62) - this.ak;
                    if (this.fU[i9] == null && cx < 800) {
                        jVar.a(i11, 64, 64, i10);
                    }
                }
                if (aJ) {
                    dj.i(0);
                }
                for (int i12 = 0; i12 < length; i12++) {
                    byte[] bArr2 = this.fV[i12];
                    if (bArr2 != null) {
                        jVar.a(((this.hm[i12] >> 8) << 6) - this.aj, this.fW, ((this.hm[i12] & ColorUtil.MAX_RGB_VALUE) << 6) - this.ak, this.jl, bArr2);
                    }
                }
                org.necrotic.client.n.c.a();
            } else {
                for (int i13 = 0; i13 < 4; i13++) {
                    for (int i14 = 0; i14 < 13; i14++) {
                        for (int i15 = 0; i15 < 13; i15++) {
                            int i16 = this.dV[i13][i14][i15];
                            if (i16 != -1) {
                                int i17 = (i16 >> 24) & 3;
                                int i18 = (i16 >> 1) & 3;
                                int i19 = (i16 >> 14) & 1023;
                                int i20 = (i16 >> 3) & 2047;
                                int i21 = ((i19 / 8) << 8) + (i20 / 8);
                                int i22 = 0;
                                while (true) {
                                    if (i22 >= this.hm.length) {
                                        break;
                                    } else if (this.hm[i22] != i21 || this.fU[i22] == null) {
                                        i22++;
                                    } else {
                                        jVar.a(i17, i18, this.fW, i14 << 3, (i19 & 7) << 3, this.fU[i22], (i20 & 7) << 3, i13, i15 << 3);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                for (int i23 = 0; i23 < 13; i23++) {
                    for (int i24 = 0; i24 < 13; i24++) {
                        if (this.dV[0][i23][i24] == -1) {
                            jVar.a(i24 << 3, 8, 8, i23 << 3);
                        }
                    }
                }
                if (aJ) {
                    dj.i(0);
                }
                for (int i25 = 0; i25 < 4; i25++) {
                    for (int i26 = 0; i26 < 13; i26++) {
                        for (int i27 = 0; i27 < 13; i27++) {
                            int i28 = this.dV[i25][i26][i27];
                            if (i28 != -1) {
                                int i29 = (i28 >> 24) & 3;
                                int i30 = (i28 >> 1) & 3;
                                int i31 = (i28 >> 14) & 1023;
                                int i32 = (i28 >> 3) & 2047;
                                int i33 = ((i31 / 8) << 8) + (i32 / 8);
                                int i34 = 0;
                                while (true) {
                                    if (i34 >= this.hm.length) {
                                        break;
                                    } else if (this.hm[i34] != i33 || this.fV[i34] == null) {
                                        i34++;
                                    } else {
                                        jVar.a(this.fW, this.jl, i29, i26 << 3, (i32 & 7) << 3, i25, this.fV[i34], (i31 & 7) << 3, i30, i27 << 3);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                this.fN = false;
            }
            if (aJ) {
                dj.i(0);
            }
            dj.i(0);
            jVar.a(this.fW, this.jl);
            if (aJ) {
                this.aF.a();
            }
            if (aJ) {
                dj.i(0);
            }
            int i35 = org.necrotic.client.n.j.b;
            int i36 = i35;
            if (i35 > this.bn) {
                i36 = this.bn;
            }
            if (i36 < this.bn - 1) {
                int i37 = this.bn;
            }
            if (df) {
                this.jl.a(org.necrotic.client.n.j.b);
            } else {
                this.jl.a(0);
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
        if (aJ) {
            dj.i(210);
            dj.h(1057001181);
        }
        System.gc();
        org.necrotic.client.n.l.h();
        this.bm.e();
        int i40 = ((cw - 6) / 8) - 1;
        int i41 = ((cw + 6) / 8) + 1;
        int i42 = ((cx - 6) / 8) - 1;
        int i43 = ((cx + 6) / 8) + 1;
        for (int i44 = i40; i44 <= i41; i44++) {
            for (int i45 = i42; i45 <= i43; i45++) {
                if (i44 == i40 || i44 == i41 || i45 == i42 || i45 == i43) {
                    int a2 = this.bm.a(0, i45, i44);
                    if (a2 != -1) {
                        this.bm.a(a2, 3);
                    }
                    int a3 = this.bm.a(1, i45, i44);
                    if (a3 != -1) {
                        this.bm.a(a3, 3);
                    }
                }
            }
        }
    }

    private void b(boolean z2) {
        for (int i2 = 0; i2 < this.bk; i2++) {
            org.necrotic.client.j.e eVar = this.bj[this.bl[i2]];
            int i3 = 536870912 + (this.bl[i2] << 14);
            if (eVar != null && eVar.d() && eVar.c.x == z2) {
                int i4 = eVar.aJ >> 7;
                int i5 = eVar.aK >> 7;
                if (i4 >= 0 && i4 < 104 && i5 >= 0 && i5 < 104) {
                    if (eVar.ag == 1 && (eVar.aJ & 127) == 64 && (eVar.aK & 127) == 64) {
                        if (this.hr[i4][i5] != this.gM) {
                            this.hr[i4][i5] = this.gM;
                        }
                    }
                    if (!eVar.c.o) {
                        i3 -= Integer.MIN_VALUE;
                    }
                    this.jl.a(this.bn, eVar.ap, b(this.bn, eVar.aK, eVar.aJ), i3, eVar.aK, ((eVar.ag - 1) << 6) + 60, eVar.aJ, eVar, eVar.J);
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
        if (i2 < 3 && (this.hE[1][i5][i6] & 2) == 2) {
            i2++;
        }
        int i7 = i4 & 127;
        int i8 = i3 & 127;
        return (((((this.ii[i2][i5][i6] * (128 - i7)) + (this.ii[i2][i5 + 1][i6] * i7)) >> 7) * (128 - i8)) + ((((this.ii[i2][i5][i6 + 1] * (128 - i7)) + (this.ii[i2][i5 + 1][i6 + 1] * i7)) >> 7) * i8)) >> 7;
    }

    private void aj() {
        this.fK = true;
        for (int i2 = 0; i2 < 7; i2++) {
            this.dI[i2] = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= org.necrotic.client.c.a.e.f()) {
                    break;
                }
                if (!org.necrotic.client.c.a.e.f186a[i3].e()) {
                    if (org.necrotic.client.c.a.e.f186a[i3].g() == i2 + (this.et ? 0 : 7)) {
                        this.dI[i2] = i3;
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
            if (this.bj[a2] == null) {
                this.bj[a2] = new org.necrotic.client.j.e();
            }
            org.necrotic.client.j.e eVar = this.bj[a2];
            int[] iArr = this.bl;
            int i3 = this.bk;
            this.bk = i3 + 1;
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
                int[] iArr2 = this.ho;
                int i6 = this.gX;
                this.gX = i6 + 1;
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
        if ((t.aJ >> 7) == this.ay && (t.aK >> 7) == this.az) {
            this.ay = 0;
        }
        int i3 = this.bp;
        if (z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (z2) {
                aVar = t;
                i2 = this.ec << 14;
            } else {
                aVar = this.bo[this.bq[i4]];
                i2 = this.bq[i4] << 14;
            }
            if (aVar != null && aVar.A) {
                aVar.d = this.bp > 200 && !z2 && aVar.R == aVar.O;
                int i5 = aVar.aJ >> 7;
                int i6 = aVar.aK >> 7;
                if (i5 >= 0 && i5 < 104 && i6 >= 0 && i6 < 104) {
                    if (aVar.e != null && s >= aVar.g && s < aVar.h) {
                        aVar.d = false;
                        aVar.i = b(this.bn, aVar.aK, aVar.aJ);
                        org.necrotic.client.e.a.a aVar2 = aVar;
                        this.jl.a(this.bn, aVar.aK, aVar2, aVar2.ap, aVar.s, aVar.aJ, aVar.i, aVar.p, aVar.r, i2, aVar.q);
                    } else {
                        if ((aVar.aJ & 127) == 64 && (aVar.aK & 127) == 64) {
                            if (this.hr[i5][i6] != this.gM) {
                                this.hr[i5][i6] = this.gM;
                            }
                        }
                        aVar.i = b(this.bn, aVar.aK, aVar.aJ);
                        org.necrotic.client.e.a.a aVar3 = aVar;
                        this.jl.a(this.bn, aVar.ap, aVar.i, i2, aVar.aK, 60, aVar.aJ, aVar3, aVar3.J);
                    }
                }
            }
        }
    }

    private void d(org.necrotic.client.g.a aVar) {
        for (int i2 = 0; i2 < this.gX; i2++) {
            int i3 = this.ho[i2];
            org.necrotic.client.e.a.a aVar2 = this.bo[i3];
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
                    int i7 = org.necrotic.client.c.a.a.f183a[i6].o;
                    if (i7 == 1) {
                        aVar2.Y = 0;
                        aVar2.Z = 0;
                        aVar2.aa = A2;
                        aVar2.ab = 0;
                    }
                    if (i7 == 2) {
                        aVar2.ab = 0;
                    }
                } else if (i6 == -1 || aVar2.L == -1 || org.necrotic.client.c.a.a.f183a[i6].i >= org.necrotic.client.c.a.a.f183a[aVar2.L].i) {
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
                            if (i9 < this.f1if) {
                                if (this.dZ[i9] != b2) {
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
                        int i10 = this.gJ;
                        try {
                            this.hw.f = 0;
                            byte[] bArr = this.hw.d;
                            for (int i11 = A3 - 1; i11 >= 0; i11--) {
                                byte[] bArr2 = aVar.d;
                                int i12 = aVar.f;
                                aVar.f = i12 + 1;
                                bArr[i11] = bArr2[i12];
                            }
                            this.hw.f = 0;
                            String a2 = org.necrotic.client.f.a.d.a(A3, this.hw);
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
                this.hx[i3] = aVar3;
                aVar2.a(aVar3);
            }
            if ((i5 & 2) != 0) {
                aVar2.ae = aVar.m();
                aVar2.af = aVar.l();
            }
            if ((i5 & 32) != 0) {
                aVar2.a(aVar.t(), this.ig.i(), s, aVar.t(), this.ig.i());
                aVar2.aA = s + 300;
                aVar2.au = this.ig.i();
                aVar2.aB = this.ig.i();
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
        int j2 = this.jl.j(i6, i4, i2);
        if ((j2 ^ (-1)) != -1) {
            int c2 = this.jl.c(i6, i4, i2, j2);
            int i7 = (c2 >> 6) & 3;
            int i8 = c2 & 31;
            if (j2 > 0) {
                i3 = i5;
            }
            int[] iArr = this.aZ.c;
            int i9 = 24624 + (i4 << 2) + (((103 - i2) << 9) << 2);
            if ((org.necrotic.client.c.a.k.a(this.jl.m(i6, i4, i2)).l ^ (-1)) == 0) {
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
        int n2 = this.jl.n(i6, i4, i2);
        if (n2 != 0) {
            int c3 = this.jl.c(i6, i4, i2, n2);
            int i10 = (c3 >> 6) & 3;
            int i11 = c3 & 31;
            org.necrotic.client.c.a.k a2 = org.necrotic.client.c.a.k.a(this.jl.o(i6, i4, i2));
            if (a2.l != -1) {
                org.necrotic.client.f.a aVar2 = this.iw[a2.l];
                if (aVar2 != null) {
                    aVar2.a(48 + (i4 << 2) + (((a2.g << 2) - aVar2.e) / 2), 48 + (((104 - i2) - a2.n) << 2) + (((a2.n << 2) - aVar2.f) / 2));
                }
            } else if (i11 == 9) {
                int i12 = 15658734;
                if (n2 > 0) {
                    i12 = 15597568;
                }
                int[] iArr2 = this.aZ.c;
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
        int q2 = this.jl.q(i6, i4, i2);
        if (q2 > 0) {
            org.necrotic.client.c.a.k a3 = org.necrotic.client.c.a.k.a(q2);
            if (a3.l != -1 && (aVar = this.iw[a3.l]) != null) {
                aVar.a(48 + (i4 << 2) + (((a3.g << 2) - aVar.e) / 2), 48 + (((104 - i2) - a3.n) << 2) + (((a3.n << 2) - aVar.f) / 2));
            }
        }
    }

    private final synchronized void j(int i2, int i3) {
        if (C()) {
            this.iL = i3;
            this.bm.b(2, this.iL);
            dh = i2;
            cR = -1;
            cy = true;
            cM = -1;
        }
    }

    private final synchronized void k(int i2, int i3) {
        if (C()) {
            this.iL = i3;
            this.bm.b(2, this.iL);
            dh = i2;
            cR = -1;
            cy = true;
            cM = 10;
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
        org.necrotic.client.c.b.b e2 = this.fZ.e();
        while (true) {
            h hVar = (h) e2;
            if (hVar != null) {
                if (hVar.d == -1) {
                    hVar.l = 0;
                    a(hVar);
                } else {
                    hVar.b();
                }
                e2 = this.fZ.f();
            } else {
                return;
            }
        }
    }

    private void a(int i2, int i3, int i4, int i5, aa aaVar, int i6, int i7) {
        int i8;
        if (this.fS) {
            i8 = 32;
        } else {
            i8 = 0;
        }
        this.fS = false;
        if (i4 >= i2 && i4 < i2 + 16 && i5 >= i6 && i5 < i6 + 16) {
            aaVar.aw -= this.gH << 2;
        } else if (i5 >= i6 && i5 < i6 + 16 && i4 >= (i2 + i3) - 16 && i4 < i2 + i3) {
            aaVar.aw += this.gH << 2;
        } else if (i5 >= i6 - i8 && i5 < i6 + 16 + i8 && i4 >= i2 + 16 && i4 < (i2 + i3) - 16 && this.gH > 0) {
            int i9 = ((i3 - 32) * i3) / i7;
            int i10 = i9;
            if (i9 < 8) {
                i10 = 8;
            }
            aaVar.aw = ((i7 - i3) * (((i4 - i2) - 16) - (i10 / 2))) / ((i3 - 32) - i10);
            this.fS = true;
        }
    }

    private void a(int i2, int i3, int i4, int i5, aa aaVar, int i6, boolean z2, int i7) {
        int i8;
        if (this.fS) {
            i8 = 32;
        } else {
            i8 = 0;
        }
        this.fS = false;
        if (i4 >= i2 && i4 < i2 + 16 && i5 >= i6 && i5 < i6 + 16) {
            aaVar.aw -= this.gH << 2;
            if (z2) {
            }
        } else if (i4 >= i2 && i4 < i2 + 16 && i5 >= (i6 + i3) - 16 && i5 < i6 + i3) {
            aaVar.aw += this.gH << 2;
            if (z2) {
            }
        } else if (i4 >= i2 - i8 && i4 < i2 + 16 + i8 && i5 >= i6 + 16 && i5 < (i6 + i3) - 16 && this.gH > 0) {
            int i9 = ((i3 - 32) * i3) / i7;
            int i10 = i9;
            if (i9 < 8) {
                i10 = 8;
            }
            aaVar.aw = ((i7 - i3) * (((i5 - i6) - 16) - (i10 / 2))) / ((i3 - 32) - i10);
            this.fS = true;
        }
    }

    private boolean b(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int c2 = this.jl.c(this.bn, i4, i3, i2);
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
        this.hM = this.ca;
        this.hN = this.cb;
        this.hL = 2;
        this.hK = 0;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r8.bc <= 0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0521, code lost:
        org.necrotic.client.af.e = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0525, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r8.bc > 4) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x05e9, code lost:
        org.necrotic.client.af.e = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x05ed, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (org.necrotic.client.Client.y != false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        org.necrotic.client.Client.y = r0;
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
        org.necrotic.client.c.a a2 = a(3, "interface", this.dY[3]);
        org.necrotic.client.c.a a3 = a(4, "media", this.dY[4]);
        org.necrotic.client.f.a.c[] cVarArr = {this.bv, this.bi, this.as, this.at};
        org.necrotic.client.f.a.a[] aVarArr = {this.be, this.bf, this.bg};
        aa.a(a2, cVarArr, a3);
    }

    private void e(org.necrotic.client.g.a aVar) {
        for (int i2 = 0; i2 < this.gX; i2++) {
            org.necrotic.client.j.e eVar = this.bj[this.ho[i2]];
            int t2 = aVar.t();
            if ((t2 & 16) != 0) {
                int l2 = aVar.l();
                int i3 = l2;
                if (l2 == 65535) {
                    i3 = -1;
                }
                int t3 = aVar.t();
                if (i3 == eVar.L && i3 != -1) {
                    int i4 = org.necrotic.client.c.a.a.f183a[i3].o;
                    if (i4 == 1) {
                        eVar.Y = 0;
                        eVar.Z = 0;
                        eVar.aa = t3;
                        eVar.ab = 0;
                    }
                    if (i4 == 2) {
                        eVar.ab = 0;
                    }
                } else if (i3 == -1 || eVar.L == -1 || org.necrotic.client.c.a.a.f183a[i3].i >= org.necrotic.client.c.a.a.f183a[eVar.L].i) {
                    eVar.L = i3;
                    eVar.Y = 0;
                    eVar.Z = 0;
                    eVar.aa = t3;
                    eVar.ab = 0;
                    eVar.ah = eVar.aE;
                }
            }
            if ((t2 & 8) != 0) {
                eVar.a(aVar.A(), this.ig.i(), s, aVar.t(), 0L);
                eVar.aA = s + 300;
                eVar.au = this.ig.i();
                eVar.aB = this.ig.i();
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
                eVar.a(aVar.B(), this.ig.i(), s, aVar.t(), 0L);
                eVar.aA = s + 300;
                eVar.au = this.ig.i();
                eVar.aB = this.ig.i();
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
            i2 = this.jl.j(hVar.e, hVar.g, hVar.h);
        }
        if (hVar.f == 1) {
            i2 = this.jl.l(hVar.e, hVar.g, hVar.h);
        }
        if (hVar.f == 2) {
            i2 = this.jl.n(hVar.e, hVar.g, hVar.h);
        }
        if (hVar.f == 3) {
            i2 = this.jl.p(hVar.e, hVar.g, hVar.h);
        }
        if (i2 != 0) {
            int c2 = this.jl.c(hVar.e, hVar.g, hVar.h, i2);
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
            if (this.bo[a2] == null) {
                this.bo[a2] = new org.necrotic.client.e.a.a();
                if (this.hx[a2] != null) {
                    this.bo[a2].a(this.hx[a2]);
                }
            }
            int[] iArr = this.bq;
            int i3 = this.bp;
            this.bp = i3 + 1;
            iArr[i3] = a2;
            org.necrotic.client.e.a.a aVar2 = this.bo[a2];
            aVar2.ad = s;
            if (aVar.a(1) == 1) {
                int[] iArr2 = this.ho;
                int i4 = this.gX;
                this.gX = i4 + 1;
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
        if (cVar.an == s || cVar.L == -1 || cVar.aa != 0 || cVar.Z + 1 > org.necrotic.client.c.a.a.f183a[cVar.L].a(cVar.Y)) {
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
            org.necrotic.client.c.a.a aVar = org.necrotic.client.c.a.a.f183a[cVar.L];
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
        this.fQ = false;
        boolean z2 = this.hT;
    }

    private DataInputStream j(String str) {
        if (this.hv != null) {
            try {
                this.hv.close();
            } catch (Exception unused) {
            }
            this.hv = null;
        }
        this.hv = f(9420);
        this.hv.setSoTimeout(10000);
        InputStream inputStream = this.hv.getInputStream();
        this.hv.getOutputStream().write(("JAGGRAB /" + str + "\n\n").getBytes());
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
            String str = "Packet received but exception occurred: type " + this.eL + ", currentPacket " + this.eD + ", lastPacket " + this.eE + ", size " + this.eK + ", pos " + (this.aj + t.aD[0]) + "," + (this.ak + t.aF[0]) + ", buffer - ";
            for (int i3 = 0; i3 < this.eK && i3 < 50; i3++) {
                str = str + ((int) aK().d[i3]) + ",";
            }
            ae.a(str);
        }
        if (a2 == 0) {
            return false;
        }
        if (this.eL == -1) {
            aJ().a(aK().d, 1);
            this.eL = aK().d[0] & 255;
            if (aL() != null) {
                this.eL = (this.eL - aL().a()) & ColorUtil.MAX_RGB_VALUE;
            }
            this.eK = org.necrotic.client.d.b.f200a[this.eL];
            i2--;
        }
        if (this.eK == -1) {
            if (i2 > 0) {
                aJ().a(aK().d, 1);
                this.eK = aK().d[0] & 255;
                i2--;
            } else {
                return false;
            }
        }
        if (this.eK == -2) {
            if (i2 > 1) {
                aJ().a(aK().d, 2);
                aK().f = 0;
                this.eK = aK().u();
                i2 -= 2;
            } else {
                return false;
            }
        }
        if (i2 < this.eK) {
            return false;
        }
        aK().f = 0;
        aJ().a(aK().d, this.eK);
        this.ew = 0;
        this.eE = this.eD;
        this.eD = this.eC;
        this.eC = this.eL;
        ?? r0 = this.eL;
        switch (r0) {
            case 1:
                for (int i4 = 0; i4 < this.bo.length; i4++) {
                    if (this.bo[i4] != null) {
                        this.bo[i4].L = -1;
                    }
                }
                for (int i5 = 0; i5 < this.bj.length; i5++) {
                    if (this.bj[i5] != null) {
                        this.bj[i5].L = -1;
                    }
                }
                this.eL = -1;
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
                ae.a("Packet not handled: type " + this.eL + ", size " + this.eK + " - currentPacket " + this.eD + ", lastPacket " + this.eE);
                this.eL = -1;
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
                a(aK(), this.eL);
                this.eL = -1;
                return true;
            case 8:
                int m2 = aK().m();
                int u3 = aK().u();
                aa.u[m2].M = 1;
                aa.u[m2].am = u3;
                this.eL = -1;
                return true;
            case 24:
                this.ey = aK().B();
                if (this.ey == w) {
                    if (this.ey == 3) {
                        w = 1;
                    } else {
                        w = 3;
                    }
                }
                this.eL = -1;
                return true;
            case Ascii.ESC /* 27 */:
                this.bE = aK().q();
                this.aY = false;
                this.aH = 1;
                this.U = "";
                E = true;
                this.eL = -1;
                return true;
            case 32:
                aa.u[aK().I()].bb = aK().t() == 1;
                this.eL = -1;
                return true;
            case 34:
                aa aaVar2 = aa.u[aK().u()];
                while (aK().f < this.eK) {
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
                this.eL = -1;
                return true;
            case 35:
                int t3 = aK().t();
                int t4 = aK().t();
                int t5 = aK().t();
                int t6 = aK().t();
                this.dD[t3] = true;
                this.dL[t3] = t4;
                this.dK[t3] = t5;
                this.dM[t3] = t6;
                this.dG[t3] = 0;
                this.eL = -1;
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
                        this.eq = true;
                    } else {
                        this.eq = false;
                    }
                    this.eL = -1;
                    return true;
                }
                this.dH[l2] = e3;
                switch (l2) {
                    case 19:
                        x = e3 == 1;
                        break;
                    case 293:
                        aa.u[12348].aA = D.a(e3 == 0 ? 607 : e3 == 1 ? 606 : e3 == 2 ? 608 : e3 == 3 ? 609 : 610);
                        break;
                    case 2000:
                        aa();
                        break;
                }
                if (l2 < this.bM.length && this.bM[l2] != e3) {
                    this.bM[l2] = e3;
                    E(l2);
                    if (this.aA != -1) {
                        E = true;
                    }
                }
                this.eL = -1;
                return true;
            case 38:
                int u5 = aK().u();
                if (u5 == -1) {
                    this.eS = false;
                    this.eT = 0;
                } else {
                    this.eS = true;
                    this.eT = u5;
                }
                this.eL = -1;
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
                        aaVar4.aA = D.a(j2);
                        aaVar4.aB = D.a(j2);
                    }
                    a(aK().q(), aK().I());
                }
                a(aK().q(), aK().I());
                a(aK().q(), aK().I());
                this.eL = -1;
                return true;
            case SignatureVisitor.SUPER /* 45 */:
                org.necrotic.client.e.a.b.g = aK().i();
                this.eL = -1;
                return true;
            case 50:
                long i8 = aK().i();
                int t7 = aK().t();
                String a3 = org.necrotic.client.f.a.b.a(org.necrotic.client.f.a.b.a(i8));
                for (int i9 = 0; i9 < this.aC; i9++) {
                    if (i8 == this.aD[i9]) {
                        if (this.aE[i9] != t7) {
                            this.aE[i9] = t7;
                        }
                        a3 = null;
                    }
                }
                if (a3 != null && this.aC < 200) {
                    this.aD[this.aC] = i8;
                    this.hW[this.aC] = a3;
                    this.aE[this.aC] = t7;
                    this.aC++;
                }
                boolean z2 = false;
                while (!z2) {
                    z2 = true;
                    for (int i10 = 0; i10 < this.aC - 1; i10++) {
                        if ((this.aE[i10] != di && this.aE[i10 + 1] == di) || (this.aE[i10] == 0 && this.aE[i10 + 1] != 0)) {
                            int i11 = this.aE[i10];
                            int[] iArr = this.aE;
                            iArr[i10] = iArr[i10 + 1];
                            this.aE[i10 + 1] = i11;
                            String str2 = this.hW[i10];
                            String[] strArr = this.hW;
                            strArr[i10] = strArr[i10 + 1];
                            this.hW[i10 + 1] = str2;
                            long j3 = this.aD[i10];
                            long[] jArr = this.aD;
                            jArr[i10] = jArr[i10 + 1];
                            this.aD[i10 + 1] = j3;
                            z2 = false;
                        }
                    }
                }
                this.eL = -1;
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
                    this.eL = -1;
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
                    p().f217a = i12;
                }
                this.eL = -1;
                return true;
            case 54:
                o.a(new n(aK().j(), aK().g()));
                this.eL = -1;
                return true;
            case 60:
                this.gO = aK().t();
                this.gN = aK().A();
                while (aK().f < this.eK) {
                    a(aK(), aK().t());
                }
                this.eL = -1;
                return true;
            case 61:
                this.ez = aK().t();
                this.eL = -1;
                return true;
            case 62:
                this.eA = aK().t();
                this.eL = -1;
                return true;
            case 64:
                this.gN = aK().A();
                this.gO = aK().B();
                for (int i16 = this.gN; i16 < this.gN + 8; i16++) {
                    for (int i17 = this.gO; i17 < this.gO + 8; i17++) {
                        if (this.aG[this.bn][i16][i17] != null) {
                            this.aG[this.bn][i16][i17] = null;
                            m(i16, i17);
                        }
                    }
                }
                h hVar = (h) aM().e();
                while (hVar != null) {
                    if (hVar.g >= this.gN && hVar.g < this.gN + 8 && hVar.h >= this.gO && hVar.h < this.gO + 8 && hVar.e == this.bn) {
                        hVar.d = 0;
                    }
                    hVar = (h) aM().f();
                }
                this.eL = -1;
                return true;
            case 65:
                c(aK(), this.eK);
                this.eL = -1;
                return true;
            case 68:
                for (int i18 = 0; i18 < this.bM.length; i18++) {
                    if (this.bM[i18] != this.dH[i18]) {
                        this.bM[i18] = this.dH[i18];
                        E(i18);
                    }
                }
                this.eL = -1;
                return true;
            case 70:
                int o2 = aK().o();
                int E2 = aK().E();
                aa aaVar5 = aa.u[aK().l()];
                aaVar5.aP = o2;
                aaVar5.aQ = E2;
                this.eL = -1;
                return true;
            case 71:
                int I3 = aK().I();
                int z3 = aK().z();
                if (I3 == 65535) {
                    I3 = -1;
                }
                c[z3] = I3;
                this.bJ = c[5];
                cu = true;
                this.eL = -1;
                return true;
            case 72:
                aa aaVar6 = aa.u[aK().l()];
                for (int i19 = 0; i19 < aaVar6.ae.length; i19++) {
                    aaVar6.ae[i19] = -1;
                    aaVar6.ae[i19] = 0;
                }
                this.eL = -1;
                return true;
            case 73:
            case 241:
                int i20 = cw;
                int i21 = cx;
                if (this.eL == 73) {
                    int D2 = aK().D();
                    this.fC = D2;
                    i20 = D2;
                    int u6 = aK().u();
                    this.fD = u6;
                    i21 = u6;
                    this.fN = false;
                }
                if (this.eL == 241) {
                    i20 = aK().u();
                    i21 = aK().D();
                    for (int i22 = 0; i22 < 4; i22++) {
                        for (int i23 = 0; i23 < 13; i23++) {
                            for (int i24 = 0; i24 < 13; i24++) {
                                if (aK().t() == 1) {
                                    this.dV[i22][i23][i24] = aK().g();
                                } else {
                                    this.dV[i22][i23][i24] = -1;
                                }
                            }
                        }
                    }
                    this.fN = true;
                }
                if (cw == i20 && cx == i21 && this.eH == 2) {
                    this.eL = -1;
                    return true;
                }
                cw = i20;
                cx = i21;
                this.aj = (cw - 6) << 3;
                this.ak = (cx - 6) << 3;
                this.fM = (cw / 8 == 48 || cw / 8 == 49) && cx / 8 == 48;
                if (cw / 8 == 48 && cx / 8 == 148) {
                    this.fM = true;
                }
                this.eH = 1;
                this.gd = System.currentTimeMillis();
                this.aF.a();
                D.a(1105).e(8, 9);
                if (!this.jz) {
                    this.aF.a(cl.getGraphics(), this.eX, this.eY);
                }
                if (this.eL == 73) {
                    int i25 = 0;
                    for (int i26 = (cw - 6) / 8; i26 <= (cw + 6) / 8; i26++) {
                        for (int i27 = (cx - 6) / 8; i27 <= (cx + 6) / 8; i27++) {
                            i25++;
                        }
                    }
                    this.fU = new byte[i25];
                    this.fV = new byte[i25];
                    this.hm = new int[i25];
                    this.hU = new int[i25];
                    this.iM = new int[i25];
                    int i28 = 0;
                    for (int i29 = (cw - 6) / 8; i29 <= (cw + 6) / 8; i29++) {
                        for (int i30 = (cx - 6) / 8; i30 <= (cx + 6) / 8; i30++) {
                            this.hm[i28] = (i29 << 8) + i30;
                            if (this.fM && (i30 == 49 || i30 == 149 || i30 == 147 || i29 == 50 || (i29 == 49 && i30 == 47))) {
                                this.hU[i28] = -1;
                                this.iM[i28] = -1;
                            } else {
                                int a4 = this.bm.a(0, i30, i29);
                                this.hU[i28] = a4;
                                if (a4 != -1) {
                                    this.bm.b(3, a4);
                                }
                                int a5 = this.bm.a(1, i30, i29);
                                this.iM[i28] = a5;
                                if (a5 != -1) {
                                    this.bm.b(3, a5);
                                }
                            }
                            i28++;
                        }
                    }
                }
                if (this.eL == 241) {
                    int i31 = 0;
                    int[] iArr2 = new int[676];
                    for (int i32 = 0; i32 < 4; i32++) {
                        for (int i33 = 0; i33 < 13; i33++) {
                            for (int i34 = 0; i34 < 13; i34++) {
                                int i35 = this.dV[i32][i33][i34];
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
                    this.fU = new byte[i31];
                    this.fV = new byte[i31];
                    this.hm = new int[i31];
                    this.hU = new int[i31];
                    this.iM = new int[i31];
                    for (int i39 = 0; i39 < i31; i39++) {
                        int i40 = iArr2[i39];
                        this.hm[i39] = i40;
                        int i41 = (i40 >> 8) & ColorUtil.MAX_RGB_VALUE;
                        int i42 = i40 & ColorUtil.MAX_RGB_VALUE;
                        int a6 = this.bm.a(0, i42, i41);
                        this.hU[i39] = a6;
                        if (a6 != -1) {
                            this.bm.b(3, a6);
                        }
                        int a7 = this.bm.a(1, i42, i41);
                        this.iM[i39] = a7;
                        if (a7 != -1) {
                            this.bm.b(3, a7);
                        }
                    }
                }
                int i43 = this.aj - this.gl;
                int i44 = this.ak - this.gm;
                this.gl = this.aj;
                this.gm = this.ak;
                for (int i45 = 0; i45 < 16384; i45++) {
                    org.necrotic.client.j.e eVar2 = this.bj[i45];
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
                    org.necrotic.client.e.a.a aVar = this.bo[i49];
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
                this.fL = true;
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
                                this.aG[i63][i59][i60] = this.aG[i63][i61][i62];
                            } else {
                                this.aG[i63][i59][i60] = null;
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
                if (this.ay != 0) {
                    this.ay -= i43;
                    this.az -= i44;
                }
                this.fO = false;
                this.eL = -1;
                return true;
            case 74:
                int l3 = aK().l();
                int i64 = l3;
                if (l3 == 65535) {
                    i64 = -1;
                }
                if (i64 != -1 || this.iO != 0) {
                    if (i64 != -1 && this.hO != i64 && this.iJ != 0 && this.iO == 0) {
                        k(this.iJ, i64);
                    }
                } else {
                    B();
                }
                this.hO = i64;
                this.eL = -1;
                return true;
            case 75:
                int m3 = aK().m();
                int m4 = aK().m();
                aa.u[m4].M = 2;
                aa.u[m4].am = m3;
                this.eL = -1;
                return true;
            case 78:
                this.ay = 0;
                this.eL = -1;
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
                this.eL = -1;
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
                this.eL = -1;
                return true;
            case 81:
                b(this.eK, aK());
                l(175, u == 26000 ? 1 : 0);
                this.fL = false;
                this.eL = -1;
                return true;
            case 85:
                this.gO = aK().A();
                this.gN = aK().A();
                this.eL = -1;
                return true;
            case 86:
                int t9 = aK().t();
                if (this.bn != t9 && t9 >= 0 && t9 < 4) {
                    this.bn = t9;
                }
                this.eL = -1;
                return true;
            case 87:
                int l4 = aK().l();
                int G = aK().G();
                this.dH[l4] = G;
                switch (l4) {
                    case 2000:
                        aa();
                        break;
                }
                if (l4 < 2000 && this.bM[l4] != G) {
                    this.bM[l4] = G;
                    E(l4);
                    if (this.aA != -1) {
                        E = true;
                    }
                }
                this.eL = -1;
                return true;
            case 88:
                int o3 = aK().o();
                int o4 = aK().o();
                int l5 = aK().l();
                if (l5 < this.bj.length && (eVar = this.bj[l5]) != null) {
                    eVar.ae = o3;
                    eVar.af = o4;
                }
                this.eL = -1;
                return true;
            case 89:
                ai();
                this.eL = -1;
                return true;
            case 97:
                int I5 = aK().I();
                B(I5);
                if (this.aI != -1) {
                    this.aI = -1;
                    cu = true;
                }
                if (this.ai != -1) {
                    this.ai = -1;
                    E = true;
                }
                if (this.aH != 0) {
                    this.aH = 0;
                    E = true;
                }
                u = I5;
                this.eu = false;
                this.eL = -1;
                return true;
            case 99:
                this.V = aK().t();
                this.eL = -1;
                return true;
            case 102:
                int l6 = aK().l();
                int D4 = aK().D();
                aa aaVar8 = aa.u[l6];
                if (D4 <= aaVar8.aa) {
                    D4 = aaVar8.aa + 1;
                }
                aaVar8.au = D4;
                this.eL = -1;
                return true;
            case 103:
                this.S = aK().t() == 1;
                this.eL = -1;
                return true;
            case 104:
                int A2 = aK().A();
                int z4 = aK().z();
                String q2 = aK().q();
                if (A2 > 0 && A2 <= 7) {
                    if (q2.equalsIgnoreCase("null")) {
                        q2 = null;
                    }
                    this.dp[A2 - 1] = q2;
                    this.dq[A2 - 1] = z4 == 0;
                }
                this.eL = -1;
                return true;
            case 106:
                w = aK().A();
                cu = true;
                this.eL = -1;
                return true;
            case 107:
                this.fO = false;
                for (int i66 = 0; i66 < 5; i66++) {
                    this.dD[i66] = false;
                }
                this.eL = -1;
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
                this.eL = -1;
                return true;
            case 109:
                at();
                this.eL = -1;
                return false;
            case 110:
                this.aB = aK().t();
                this.eL = -1;
                return true;
            case 112:
                this.bd = aK().t();
                this.eL = -1;
                return true;
            case 113:
                this.iR = aK().t() > 0;
                this.bM[173] = this.iR ? 1 : 0;
                this.ea.b.a(this.iR);
                this.eL = -1;
                return true;
            case 114:
                this.eB = aK().l() * 30;
                this.eL = -1;
                return true;
            case 115:
                this.jF = aK().t();
                ap();
                this.eL = -1;
                return true;
            case 120:
                String q3 = aK().q();
                this.ft = aK().g() * 30;
                this.fu = q3;
                this.eL = -1;
                return true;
            case 121:
                int m5 = aK().m();
                int D5 = aK().D();
                if (m5 == 65535) {
                    m5 = -1;
                }
                if (this.iJ != 0 && D5 != -1) {
                    j(this.iJ, m5);
                    this.iO = D5 * 20;
                }
                this.eL = -1;
                return true;
            case 122:
                int m6 = aK().m();
                int m7 = aK().m();
                aa.u[m6].aF = (((m7 >> 10) & 31) << 19) + (((m7 >> 5) & 31) << 11) + ((m7 & 31) << 3);
                this.eL = -1;
                return true;
            case 123:
                b(aK().q(), 1);
                this.eL = -1;
                return true;
            case 124:
                int t10 = aK().t();
                int h2 = aK().h();
                int h3 = aK().h();
                org.necrotic.client.e.a.b.a(t10, h2);
                org.necrotic.client.e.a.b.g = h3;
                this.eL = -1;
                return true;
            case 125:
                int j4 = aK().j();
                if (aK().e() == 0) {
                    this.jS = j4 < this.bo.length ? this.bo[j4] : null;
                    this.eL = -1;
                    return true;
                }
                this.jS = j4 < this.bj.length ? this.bj[j4] : null;
                if (this.jS == null) {
                    this.eL = -1;
                    return true;
                }
                org.necrotic.client.j.e eVar3 = (org.necrotic.client.j.e) this.jS;
                eVar3.d.clear();
                if (aK().e() == 1) {
                    byte e4 = aK().e();
                    for (byte b2 = 0; b2 < e4; b2++) {
                        eVar3.d.add(new org.necrotic.client.f.c.d(aK().q(), aK().i()));
                    }
                }
                this.eL = -1;
                return true;
            case 126:
                String q4 = aK().q();
                int I6 = aK().I();
                if (q4.startsWith("http://") || q4.startsWith("www.") || q4.startsWith("https://")) {
                    i(q4);
                    this.eL = -1;
                    return true;
                } else if (q4.equals("[CLOSEMENU]") && I6 == 0) {
                    this.aW = false;
                    this.eL = -1;
                    return true;
                } else if (q4.startsWith("vngt:")) {
                    this.fE = (int) (Integer.parseInt(q4.substring("vngt:".length())) * 0.65d);
                    this.eL = -1;
                    return true;
                } else {
                    if ((I6 >= 1675 && I6 <= 1687) || (I6 >= 15115 && I6 <= 15120)) {
                        c(q4, I6);
                    }
                    a(q4, I6);
                    this.eL = -1;
                    return true;
                }
            case 127:
                this.bc = aK().t();
                this.eL = -1;
                return true;
            case 128:
                this.jS = null;
                this.eL = -1;
                return true;
            case 134:
                int t11 = aK().t();
                int G2 = aK().G();
                int u11 = aK().u();
                int u12 = aK().u();
                int i69 = G2 - this.dr[t11];
                this.dr[t11] = G2;
                this.I[t11] = u11;
                this.M[t11] = u12;
                if (i69 > 0) {
                    org.necrotic.client.e.a.b.a(t11, i69);
                }
                if (t11 == 23) {
                    a(String.valueOf(u12), 28171);
                }
                this.eL = -1;
                return true;
            case 140:
                c(aK().I(), aK().u(), aK().t());
                this.eL = -1;
                return true;
            case 142:
                int l8 = aK().l();
                B(l8);
                if (this.ai != -1) {
                    this.ai = -1;
                    E = true;
                }
                if (this.aH != 0) {
                    this.aH = 0;
                    E = true;
                }
                this.aI = l8;
                cu = true;
                u = -1;
                this.eu = false;
                this.eL = -1;
                return true;
            case 164:
                int l9 = aK().l();
                if (this.bL.b()) {
                    this.bL.a(false);
                }
                B(l9);
                if (this.aI != -1) {
                    this.aI = -1;
                    cu = true;
                }
                this.ai = l9;
                E = true;
                u = -1;
                this.eu = false;
                this.eL = -1;
                return true;
            case 166:
                this.fO = true;
                this.gw = aK().t();
                this.gx = aK().t();
                this.gy = aK().u();
                this.gz = aK().t();
                this.gA = aK().t();
                if (this.gA >= 100) {
                    this.bB = (this.gw << 7) + 64;
                    this.bC = (this.gx << 7) + 64;
                    this.bD = b(this.bn, this.bC, this.bB) - this.gy;
                }
                this.eL = -1;
                return true;
            case 171:
                aa.u[aK().u()].ad = aK().t() == 1;
                this.eL = -1;
                return true;
            case 174:
                int u13 = aK().u();
                int t12 = aK().t();
                int u14 = aK().u();
                if (dk != 0 && t12 != 0 && this.eN < 50) {
                    this.ef[this.eN] = u13;
                    this.eh[this.eN] = t12;
                    this.eg[this.eN] = u14;
                    cC[this.eN] = null;
                    this.eN++;
                }
                this.eL = -1;
                return true;
            case 176:
                this.hQ = aK().A();
                this.jh = aK().D();
                this.ix = aK().t();
                this.gG = aK().H();
                this.hP = aK().u();
                this.eL = -1;
                return true;
            case 177:
                this.fO = true;
                this.hh = aK().t();
                this.hi = aK().t();
                this.hj = aK().u();
                this.hk = aK().t();
                this.hl = aK().t();
                if (this.hl >= 100) {
                    int i70 = (this.hh << 7) + 64;
                    int i71 = (this.hi << 7) + 64;
                    int b3 = b(this.bn, i71, i70) - this.hj;
                    int i72 = i70 - this.bB;
                    int i73 = b3 - this.bD;
                    int i74 = i71 - this.bC;
                    this.eR = ((int) (Math.atan2(i73, (int) Math.sqrt((i72 * i72) + (i74 * i74))) * 325.949d)) & 2047;
                    this.eQ = ((int) (Math.atan2(i72, i74) * (-325.949d))) & 2047;
                    if (this.eR < 128) {
                        this.eR = 128;
                    }
                    if (this.eR > 383) {
                        this.eR = 383;
                    }
                }
                this.eL = -1;
                return true;
            case 180:
                int u15 = aK().u();
                int[] iArr8 = {93, 102, 96, 97, 98, 99, 100, 101, 94, -1, -1, 95};
                aa aaVar9 = aa.u[aK().u()];
                if (aaVar9 != null) {
                    org.necrotic.client.f.e a8 = D.a(iArr8[u15]);
                    aaVar9.aB = a8;
                    aaVar9.aA = a8;
                }
                this.eL = -1;
                return true;
            case 181:
                this.eL = -1;
                return true;
            case 182:
                this.eL = -1;
                return true;
            case 185:
                int m8 = aK().m();
                aa.u[m8].M = 3;
                if (t.v == null) {
                    aa.u[m8].am = (t.t[0] << 25) + (t.t[4] << 20) + (t.w[0] << 15) + (t.w[8] << 10) + (t.w[11] << 5) + t.w[1];
                } else {
                    aa.u[m8].am = (int) (305419896 + t.v.w);
                }
                this.eL = -1;
                return true;
            case 187:
                this.bE = aK().q();
                if (this.bE.contains("#confirmstatus")) {
                    this.fA = true;
                    this.bE = this.bE.replace("#confirmstatus", "");
                } else {
                    this.fA = false;
                }
                if (this.bE.contains("$pin")) {
                    this.fz = true;
                    this.bE = this.bE.replace("$pin", "");
                } else {
                    this.fz = false;
                }
                if (this.bE.contains("#confirm2fa")) {
                    this.fA = true;
                    this.bE = this.bE.replace("#confirm2fa", "");
                } else {
                    this.fA = false;
                }
                this.aY = false;
                this.aH = 2;
                this.U = "";
                E = true;
                this.eL = -1;
                return true;
            case 188:
                int t13 = aK().t();
                this.hs = new int[t13];
                for (int i75 = 0; i75 < t13; i75++) {
                    this.hs[i75] = aK().u();
                }
                this.eL = -1;
                return true;
            case 189:
                this.bE = aK().q();
                this.aY = false;
                this.aH = 4;
                this.U = "";
                E = true;
                this.eL = -1;
                return true;
            case 190:
                int g2 = aK().g();
                int j5 = aK().j();
                int j6 = aK().j();
                aa aaVar10 = aa.u[g2];
                aaVar10.B = j5;
                aaVar10.C = j5;
                aaVar10.aq = j6;
                this.eL = -1;
                return true;
            case 196:
                long i76 = aK().i();
                aK().h();
                int t14 = aK().t();
                boolean z5 = false;
                if (t14 <= 1) {
                    for (int i77 = 0; i77 < this.f1if; i77++) {
                        if (this.dZ[i77] == i76) {
                            z5 = true;
                        }
                    }
                }
                if (!z5) {
                    ?? r02 = this.gJ;
                    try {
                        String a9 = org.necrotic.client.f.a.d.a(this.eK - 13, aK());
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
                this.eL = -1;
                return true;
            case 199:
                aa.u[23635].A = new int[]{aK().j(), aK().j(), aK().j()};
                this.eL = -1;
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
                this.eL = -1;
                return true;
            case 203:
                aa.u[aK().j()].j = aK().e();
                this.eL = -1;
                return true;
            case 204:
                int g3 = aK().g();
                int g4 = aK().g();
                int g5 = aK().g();
                aa.u[g3].j = g4;
                aa.u[g3].n = g5;
                this.eL = -1;
                return true;
            case 206:
                this.bu = aK().t();
                this.br = aK().t();
                this.bz = aK().t();
                E = true;
                this.eL = -1;
                return true;
            case 208:
                int I7 = aK().I();
                boolean z6 = aK().v() == 1;
                aa aaVar12 = aa.u[I7];
                if (aaVar12 != null) {
                    if (z6) {
                        if (!this.fh.contains(aaVar12)) {
                            this.fh.add(aaVar12);
                        }
                    } else {
                        this.fh.remove(aaVar12);
                    }
                }
                this.eL = -1;
                return true;
            case 209:
                int g6 = aK().g();
                int j7 = aK().j();
                if (aa.u[g6] != null) {
                    aa.u[g6].aA = j7 == 65535 ? null : D.a(j7);
                    aa.u[g6].aB = j7 == 65535 ? null : D.a(j7);
                }
                this.eL = -1;
                return true;
            case 210:
                aa.u[aK().u()].r = aK().u() != 0;
                this.eL = -1;
                return true;
            case 214:
                this.f1if = aK().j();
                for (int i78 = 0; i78 < this.f1if; i78++) {
                    this.dZ[i78] = Long.parseLong(aK().q());
                }
                this.eL = -1;
                return true;
            case 217:
                try {
                    this.iK = aK().q();
                    this.iF = aK().q();
                    this.eF = aK().q();
                    this.iQ = aK().u();
                    String replaceAll = this.iK.replaceAll("null", "");
                    this.iF = org.necrotic.client.f.a.d.a(this.iF);
                    r0 = this;
                    r0.a(r0.iF, 16, replaceAll);
                } catch (Exception unused5) {
                    r0.printStackTrace();
                }
                this.eL = -1;
                return true;
            case 218:
                this.aA = aK().F();
                E = true;
                this.eL = -1;
                return true;
            case 219:
                if (this.aI != -1) {
                    this.aI = -1;
                    cu = true;
                }
                if (this.ai != -1) {
                    this.ai = -1;
                    E = true;
                }
                if (this.aH != 0) {
                    this.aH = 0;
                    E = true;
                }
                u = -1;
                this.eu = false;
                this.eL = -1;
                return true;
            case 221:
                J(aK().t());
                this.eL = -1;
                return true;
            case 224:
                for (int i79 = 0; i79 < 3; i79++) {
                    aa.u[i79 + 25413].g = org.necrotic.client.f.e.a(D.a(1513));
                }
                this.eL = -1;
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
                this.eL = -1;
                return true;
            case 230:
                int D6 = aK().D();
                int u17 = aK().u();
                int u18 = aK().u();
                int m9 = aK().m();
                aa.u[u17].ao = u18;
                aa.u[u17].ap = m9;
                aa.u[u17].aq = D6;
                this.eL = -1;
                return true;
            case 231:
                int g7 = aK().g();
                int g8 = aK().g();
                aa aaVar13 = aa.u[g8];
                if (aaVar13 != null) {
                    System.out.println("npc_id: " + g7 + " interfaceId: " + g8);
                    aaVar13.C = g7;
                }
                this.eL = -1;
                return true;
            case 232:
                aa.u[aK().j()].a(aK().e() == 1);
                this.eL = -1;
                return true;
            case 233:
                aa.u[aK().j()].am = aK().j();
                this.eL = -1;
                return true;
            case 240:
                this.jj = aK().o();
                this.eL = -1;
                return true;
            case 244:
                p().a(aK().q());
                this.eL = -1;
                return true;
            case 246:
                int l10 = aK().l();
                int u19 = aK().u();
                int u20 = aK().u();
                if (u20 == 65535) {
                    aa.u[l10].M = 0;
                    this.eL = -1;
                    return true;
                }
                org.necrotic.client.c.a.i a11 = org.necrotic.client.c.a.i.a(u20);
                aa.u[l10].M = 4;
                aa.u[l10].am = u20;
                aa.u[l10].ao = a11.C;
                aa.u[l10].ap = a11.D;
                aa.u[l10].aq = (a11.E * 100) / u19;
                this.eL = -1;
                return true;
            case 248:
                int g9 = aK().g();
                int u21 = aK().u();
                if (this.ai != -1) {
                    this.ai = -1;
                    E = true;
                }
                if (this.aH != 0) {
                    this.aH = 0;
                    E = true;
                }
                u = g9;
                this.aI = u21;
                cu = true;
                this.eu = false;
                this.eL = -1;
                return true;
            case 249:
                this.gp = aK().z();
                this.jg = aK().u();
                this.eL = -1;
                return true;
            case 253:
                String q5 = aK().q();
                if (q5.startsWith("casketopening##")) {
                    String[] split = q5.split("##");
                    if (split[1] != null) {
                        g gVar = this.jO;
                        g.a(Integer.parseInt(split[1]), Integer.parseInt(split[2]) + 1, Integer.parseInt(split[3]), Integer.parseInt(split[4]));
                    }
                    this.eL = -1;
                    return true;
                } else if (q5.equals(":spinCasket")) {
                    this.jO.a();
                    this.eL = -1;
                    return true;
                } else if (q5.equals(":resetCasket")) {
                    this.jO.c();
                    this.eL = -1;
                    return true;
                } else if (q5.startsWith(":forge:")) {
                    org.necrotic.client.f.c.h.c = Integer.parseInt(q5.substring(q5.lastIndexOf(":") + 1)) == 0;
                    this.eL = -1;
                    return true;
                } else {
                    if (y) {
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
                                                        cs = true;
                                                        System.err.println("1");
                                                    } else if (q5.startsWith("Alert##")) {
                                                        String[] split2 = q5.split("##");
                                                        System.out.println(split2.length);
                                                        this.en.a(new org.necrotic.client.i.a(split2[1], Integer.parseInt(split2[2]), Integer.parseInt(split2[3]), Integer.parseInt(split2[4]), Integer.parseInt(split2[5]), Integer.parseInt(split2[6]), split2[7], split2[8], split2[9]));
                                                        this.eL = -1;
                                                        return true;
                                                    } else {
                                                        a(q5, 0, "");
                                                    }
                                                } else {
                                                    String substring2 = q5.substring(0, q5.indexOf(":"));
                                                    long b4 = org.necrotic.client.f.a.b.b(substring2);
                                                    boolean z7 = false;
                                                    for (int i81 = 0; i81 < this.f1if; i81++) {
                                                        if (this.dZ[i81] == b4) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    if (!z7) {
                                                        int i82 = this.gJ;
                                                        a(q5.substring(q5.indexOf(":") + 1, q5.length() - 9), 8, substring2);
                                                    }
                                                }
                                            } else {
                                                String substring3 = q5.substring(0, q5.indexOf(":"));
                                                long b5 = org.necrotic.client.f.a.b.b(substring3);
                                                boolean z8 = false;
                                                for (int i83 = 0; i83 < this.f1if; i83++) {
                                                    if (this.dZ[i83] == b5) {
                                                        z8 = true;
                                                    }
                                                }
                                                if (!z8) {
                                                    int i84 = this.gJ;
                                                    a("wishes to duel with you.", 8, substring3);
                                                }
                                            }
                                        } else {
                                            a("Join us at: ", 9, q5.substring(0, q5.indexOf("#")));
                                        }
                                    } else {
                                        int parseInt = Integer.parseInt(q5.substring(6, 8));
                                        System.out.println(q5.substring(8));
                                        a("<col=16777215>" + substring.substring(0, 1) + "@blu@" + substring.substring(1, parseInt) + "<col=16777215>" + substring.substring(parseInt, parseInt + 1) + org.necrotic.client.f.b.a.a.c[this.Q] + "<shad=0>" + substring.substring(parseInt + 1), 16, "");
                                    }
                                } else {
                                    String substring4 = q5.substring(0, q5.indexOf(":"));
                                    long b6 = org.necrotic.client.f.a.b.b(substring4);
                                    boolean z9 = false;
                                    for (int i85 = 0; i85 < this.f1if; i85++) {
                                        if (this.dZ[i85] == b6) {
                                            z9 = true;
                                        }
                                    }
                                    if (!z9) {
                                        int i86 = this.gJ;
                                        a("invited you to their Raids party. Click here to accept the invitation.", 22, substring4);
                                    }
                                }
                            } else {
                                String substring5 = q5.substring(0, q5.indexOf(":"));
                                long b7 = org.necrotic.client.f.a.b.b(substring5);
                                boolean z10 = false;
                                for (int i87 = 0; i87 < this.f1if; i87++) {
                                    if (this.dZ[i87] == b7) {
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
                            for (int i88 = 0; i88 < this.f1if; i88++) {
                                if (this.dZ[i88] == b8) {
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                int i89 = this.gJ;
                                a("wishes to trade with you.", 4, substring6);
                            }
                        }
                    } else {
                        aa aaVar14 = aa.u[47029];
                        aa aaVar15 = aa.u[47023];
                    }
                    this.eL = -1;
                    return true;
                }
            case 254:
                this.Y = aK().t();
                if (this.Y == 1) {
                    this.X = aK().u();
                }
                if (this.Y >= 2 && this.Y <= 6) {
                    if (this.Y == 2) {
                        this.hb = 64;
                        this.hc = 64;
                    }
                    if (this.Y == 3) {
                        this.hb = 0;
                        this.hc = 64;
                    }
                    if (this.Y == 4) {
                        this.hb = 128;
                        this.hc = 64;
                    }
                    if (this.Y == 5) {
                        this.hb = 64;
                        this.hc = 0;
                    }
                    if (this.Y == 6) {
                        this.hb = 64;
                        this.hc = 128;
                    }
                    this.Y = 5;
                    this.aa = aK().u();
                    this.ab = aK().u();
                    this.ha = aK().t();
                }
                if (this.Y == 10) {
                    this.Z = aK().u();
                }
                this.eL = -1;
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
        if (this.jF > 0) {
            aa.a();
            org.necrotic.client.f.c.b.a(true, B, this.jF == 2);
            return;
        }
        aa.a();
        org.necrotic.client.f.c.b.a(false, "", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v592, types: [org.necrotic.client.Client] */
    /* JADX WARN: Type inference failed for: r0v595 */
    @Override // org.necrotic.client.r
    public final void k() {
        e[] values;
        org.necrotic.client.j.e eVar;
        Container j2 = j();
        int i2 = j2.getSize().width;
        int i3 = j2.getSize().height;
        if (r.bZ != i2 || r.bY != i3 || r.cm) {
            Container j3 = j();
            if (j3 != null) {
                r.bZ = j3.getWidth();
                r.bY = j3.getHeight();
                if (r.bZ <= 0) {
                    r.bZ = 1;
                }
                if (r.bY <= 0) {
                    r.bY = 1;
                }
                r.cj = Math.min(r.bZ, r.f268ch);
                r.ck = Math.min(r.bY, r.ci);
                r.cf = (r.bZ - r.cj) / 2;
                r.cl.setSize(r.cj, r.ck);
                p = r.cj;
                o = r.ck;
                if (q != null) {
                    q.ay();
                }
                r.cl.setLocation(r.cf, 0);
                int i4 = r.cf;
                int i5 = (r.bZ - r.cj) - i4;
                int i6 = r.bY - r.ck;
                if (i4 > 0 || i5 > 0 || i6 > 0) {
                    try {
                        Graphics graphics = q.j().getGraphics();
                        graphics.setColor(Color.black);
                        if (i4 > 0) {
                            graphics.fillRect(0, 0, i4, r.bY);
                        }
                        if (i5 > 0) {
                            graphics.fillRect((0 + r.bZ) - i5, 0, i5, r.bY);
                        }
                        if (i6 > 0) {
                            graphics.fillRect(0, (0 + r.bY) - i6, r.bZ, i6);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            r.cm = false;
        }
        if (this.il) {
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
        } else if (!this.jD) {
            if (aJ) {
                if (this.hY == -1 || (this.eH != 2 && this.bS == null)) {
                    if (this.hR != 0) {
                        as();
                    }
                    if (this.jk) {
                        this.jk = false;
                        if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
                            this.jf.a(cl.getGraphics(), 0, 0);
                            this.ik.a(cl.getGraphics(), 0, 4);
                            this.iP.a(cl.getGraphics(), 516, 4);
                            this.iP.a(cl.getGraphics(), 515, 4);
                        }
                        E = true;
                        cu = true;
                        if (this.eH != 2) {
                            if (!this.jz) {
                                this.aF.a(cl.getGraphics(), this.eX, this.eY);
                            }
                            this.aK.a(cl.getGraphics(), this.ea.g(), this.ea.h());
                        }
                    }
                    ab();
                    if (this.ai == -1 && this.aH == 3) {
                        int i7 = (this.eZ.c * 14) + 7;
                        this.dE.aw = this.eZ.f;
                        if (this.bW > 478 && this.bW < 580 && this.bX > o - 161) {
                            a(494, 110, this.bW, this.bX - (o - 155), this.dE, 0, false, this.eZ.c);
                        }
                        int i8 = this.dE.aw;
                        int i9 = i8;
                        if (i8 < 0) {
                            i9 = 0;
                        }
                        if (i9 > i7 - 110) {
                            i9 = i7 - 110;
                        }
                        if (this.eZ.f != i9) {
                            this.eZ.f = i9;
                            E = true;
                        }
                    }
                    if (this.ai == -1 && this.aH != 3) {
                        this.dE.aw = (j - i) - 110;
                        if (this.bW > this.bL.g() + 478 && this.bW < this.bL.g() + 580 && this.bX > this.bL.h() + 4) {
                            a(494, 110, this.bW - this.bL.g(), (this.bX - this.bL.h()) - 10, this.dE, 0, false, j);
                        }
                        int i10 = (j - 110) - this.dE.aw;
                        int i11 = i10;
                        if (i10 < 0) {
                            i11 = 0;
                        }
                        if (i11 > j - 110) {
                            i11 = j - 110;
                        }
                        if (i != i11) {
                            i = i11;
                            E = true;
                        }
                    }
                    if (this.ai != -1 && i(this.hd, this.ai)) {
                        E = true;
                    }
                    if (this.hA == 3) {
                        E = true;
                    }
                    if (this.gc == 3) {
                        E = true;
                    }
                    if (this.ah != null) {
                        E = true;
                    }
                    if (this.aW && this.aX == 2) {
                        E = true;
                    }
                    if (E) {
                        X();
                        P();
                        E = false;
                    }
                    if (this.eH == 2) {
                        this.gM++;
                        int i12 = 0;
                        int i13 = this.bB;
                        int i14 = this.bD;
                        int i15 = this.bC;
                        int i16 = this.eR;
                        int i17 = this.eQ;
                        if (aJ) {
                            c(true);
                            b(true);
                            c(false);
                            b(false);
                            org.necrotic.client.c.b.b e2 = this.fX.e();
                            while (true) {
                                org.necrotic.client.j.f fVar = (org.necrotic.client.j.f) e2;
                                if (fVar == null) {
                                    break;
                                }
                                if (fVar.k != this.bn || s > fVar.d) {
                                    fVar.b();
                                } else if (s >= fVar.c) {
                                    if (fVar.i > 0 && (eVar = this.bj[fVar.i - 1]) != null && eVar.aJ >= 0 && eVar.aJ < 13312 && eVar.aK >= 0 && eVar.aK < 13312) {
                                        fVar.a(s, eVar.aK, b(fVar.k, eVar.aK, eVar.aJ) - fVar.e, eVar.aJ);
                                    }
                                    if (fVar.i < 0) {
                                        int i18 = (-fVar.i) - 1;
                                        org.necrotic.client.e.a.a aVar = i18 == this.jg ? t : this.bo[i18];
                                        if (aVar != null && aVar.aJ >= 0 && aVar.aJ < 13312 && aVar.aK >= 0 && aVar.aK < 13312) {
                                            fVar.a(s, aVar.aK, b(fVar.k, aVar.aK, aVar.aJ) - fVar.e, aVar.aJ);
                                        }
                                    }
                                    fVar.a(this.hd);
                                    this.jl.a(this.bn, fVar.j, (int) fVar.h, -1, (int) fVar.g, 60, (int) fVar.f, fVar, false);
                                }
                                e2 = this.fX.f();
                            }
                            org.necrotic.client.c.b.b e3 = this.fY.e();
                            while (true) {
                                org.necrotic.client.j.b bVar = (org.necrotic.client.j.b) e3;
                                if (bVar == null) {
                                    break;
                                }
                                if (bVar.c != this.bn || bVar.h) {
                                    bVar.b();
                                } else if (s >= bVar.g) {
                                    bVar.a(this.hd);
                                    if (bVar.h) {
                                        bVar.b();
                                    } else {
                                        this.jl.a(bVar.c, 0, bVar.f, -1, bVar.e, 60, bVar.d, bVar, false);
                                    }
                                }
                                e3 = this.fY.f();
                            }
                            if (!this.fO) {
                                int i19 = this.gD;
                                if (this.he / 256 > i19) {
                                    i19 = this.he / 256;
                                }
                                if (this.dD[4] && this.dK[4] + 128 > i19) {
                                    i19 = this.dK[4] + 128;
                                }
                                if (org.necrotic.a.v) {
                                    r = s() >= 1024 ? 10 : 9;
                                } else {
                                    r = 9;
                                }
                                int i20 = (this.bA + this.ji) & 2047;
                                int t2 = org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? Constants.GAME_TICK_LENGTH + (i19 * 3) + e : s() >= 1024 ? ((i19 + (org.necrotic.a.v ? 1200 : 650)) - (t() / 400)) + e : 450 + (i19 * 3) + e;
                                int i21 = i19;
                                int i22 = this.gg;
                                int b2 = b(this.bn, t.aK, t.aJ) - 50;
                                int i23 = this.gh;
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
                                this.bB = i22 - i27;
                                this.bD = b2 - i28;
                                this.bC = i23 - i24;
                                this.eR = i21;
                                this.eQ = i20;
                            }
                            i12 = !this.fO ? ah() : (b(this.bn, this.bC, this.bB) - this.bD >= 800 || (this.hE[this.bn][this.bB >> 7][this.bC >> 7] & 4) == 0) ? 3 : this.bn;
                        }
                        int i35 = org.necrotic.client.n.l.v;
                        org.necrotic.client.n.d.c = true;
                        org.necrotic.client.n.d.g = 0;
                        org.necrotic.client.n.d.e = this.bW - 4;
                        org.necrotic.client.n.d.f = this.bX - 4;
                        if (aJ) {
                            this.jl.a(this.bB, this.bC, this.eQ, this.bD, i12, this.eR);
                            this.jl.b();
                            if (org.necrotic.a.p) {
                                org.necrotic.client.n.l.a(2800, 3300);
                            } else {
                                org.necrotic.client.n.l.a(7700, 7700);
                            }
                        }
                        aA();
                        if (this.fw != 0) {
                            System.currentTimeMillis();
                            long j4 = this.fw;
                        }
                        if (this.fE != -1) {
                            if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
                                int i36 = this.hS[0][0];
                                int i37 = this.hS[0][1];
                                org.necrotic.client.f.e eVar2 = this.iu;
                                eVar2.c(i36 - eVar2.d, i37 - this.iu.e);
                                this.be.a(D(this.fE), i36, i37, 16753920, 1, true);
                            } else if (org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
                                int s2 = s() + this.hS[1][0];
                                int i38 = this.hS[1][1];
                                org.necrotic.client.f.e eVar3 = this.iu;
                                eVar3.c(s2 - eVar3.d, i38 - this.iu.e);
                                this.be.a(D(this.fE), s2, i38, 16753920, 1, true);
                            }
                        }
                        if (this.Y == 2) {
                            a(((this.aa - this.aj) << 7) + this.hb, this.ha << 1, ((this.ab - this.ak) << 7) + this.hc);
                            if (this.iX >= 0 && s % 20 < 10) {
                                this.ie[0].e(this.iX - 12, this.iY - 28);
                            }
                        }
                        if (!df) {
                            for (e eVar4 : e.values()) {
                                if (org.necrotic.client.n.l.x[eVar4.a()] >= eVar4.a()) {
                                    org.necrotic.client.f.a aVar2 = org.necrotic.client.n.l.c[eVar4.a()];
                                    int i39 = (aVar2.e * aVar2.f) - 1;
                                    int b3 = aVar2.e * this.hd * eVar4.b();
                                    byte[] bArr = aVar2.c;
                                    byte[] bArr2 = this.fT;
                                    for (int i40 = 0; i40 <= i39; i40++) {
                                        bArr2[i40] = bArr[(i40 - b3) & i39];
                                    }
                                    aVar2.c = bArr2;
                                    this.fT = bArr;
                                    org.necrotic.client.n.l.b(eVar4.a());
                                }
                            }
                        }
                        if (org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED && aJ) {
                            ab();
                            X();
                            Z();
                        }
                        if (aJ) {
                            if (org.necrotic.a.q) {
                                for (int i41 = 0; i41 < 104; i41++) {
                                    for (int i42 = 0; i42 < 104; i42++) {
                                        org.necrotic.client.c.b.a aVar3 = this.aG[this.bn][i41][i42];
                                        int i43 = -13;
                                        if (aVar3 != null) {
                                            org.necrotic.client.c.b.b a2 = aVar3.a();
                                            while (true) {
                                                org.necrotic.client.j.d dVar = (org.necrotic.client.j.d) a2;
                                                if (dVar != null) {
                                                    org.necrotic.client.c.a.i a3 = org.necrotic.client.c.a.i.a(dVar.d);
                                                    a((i41 << 7) + 64, 64, (i42 << 7) + 64);
                                                    this.be.a(a3.G + (dVar.c > 1 ? " (" + c(dVar.c) + ")" : ""), this.iX, this.iY - i43, 16777215, 1);
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
                            if (y) {
                                org.necrotic.client.f.c.a(334, 0, 0, j().getWidth());
                                org.necrotic.client.f.c.b(1, 315, 0, 16777215, j().getWidth());
                                this.bg.a("-->", 11, 328, 16777215, 0, false);
                                if (s % 20 < 10) {
                                    this.bg.a(this.fB + "|", 38, 328, 16777215, 0, false);
                                } else {
                                    this.bg.a(this.fB, 38, 328, 16777215, 0, false);
                                }
                            }
                        }
                        if (org.necrotic.client.e.a.b.b && aJ) {
                            this.ea.b(this);
                        }
                        if (aJ) {
                            if (!this.jz) {
                                this.aF.a(cl.getGraphics(), this.eX, this.eY);
                            }
                            this.bB = i13;
                            this.bD = i14;
                            this.bC = i15;
                            this.eR = i16;
                            this.eQ = i17;
                        }
                    }
                    if (this.eH == 2 && org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
                        Z();
                        if (this.ea.i()) {
                            this.aK.a(cl.getGraphics(), this.ea.g(), this.ea.h());
                        }
                    }
                    if (this.ey != -1) {
                        cu = true;
                    }
                    if (cu) {
                        if (this.ey != -1 && this.ey == w) {
                            this.ey = -1;
                            dj.i(120);
                            dj.l(w);
                        }
                        cu = false;
                        this.hu.a();
                        this.aF.a();
                    }
                    if (this.aW) {
                        i();
                    }
                    this.hd = 0;
                } else {
                    if (this.eH == 2) {
                        i(this.hd, this.hY);
                        if (u != -1) {
                            i(this.hd, u);
                        }
                        this.hd = 0;
                        if (this.bS == null) {
                            this.an = null;
                            this.aK = null;
                            this.by = null;
                            this.aF = null;
                            this.hu = null;
                            this.ht = null;
                            this.jb = null;
                            this.bS = new org.necrotic.client.f.d(Constants.GAME_FIXED_WIDTH, Constants.GAME_FIXED_HEIGHT, j());
                            this.jk = true;
                        }
                        this.bS.a();
                        org.necrotic.client.n.l.B = this.hZ;
                        org.necrotic.client.f.c.e();
                        this.jk = true;
                        if (u != -1) {
                            aa aaVar = aa.u[u];
                            if (aaVar.aO == 512 && aaVar.aa == 334 && aaVar.aK == 0) {
                                aaVar.aO = Constants.GAME_FIXED_WIDTH;
                                aaVar.aa = Constants.GAME_FIXED_HEIGHT;
                            }
                            a(0, 0, aaVar, 8);
                        }
                        aa aaVar2 = aa.u[this.hY];
                        if (aaVar2.aO == 512 && aaVar2.aa == 334 && aaVar2.aK == 0) {
                            aaVar2.aO = Constants.GAME_FIXED_WIDTH;
                            aaVar2.aa = Constants.GAME_FIXED_HEIGHT;
                        }
                        a(0, 0, aaVar2, 8);
                        if (this.aW) {
                            i();
                        } else {
                            aq();
                            ac();
                        }
                    }
                    this.hR++;
                    this.bS.a(cl.getGraphics(), 0, 0);
                }
                cn.f168a.f2a = "Logged In : " + B;
            } else {
                Y();
            }
            this.gH = 0;
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
        if (!this.ej.a(1500L)) {
            return;
        }
        this.ej.c();
        o.a().clear();
        String b2 = b(org.necrotic.client.f.a.b.a(str2));
        for (String str3 : org.necrotic.client.l.a.f232a) {
            if (b2.toLowerCase().contains(str3)) {
                this.io = new String[]{"This username has been blocked", "and cannot be used."};
                return;
            } else if (str.toUpperCase().contains(str3)) {
                this.io = new String[]{"This password has been blocked", "and cannot be used."};
                return;
            }
        }
        if (b2.toLowerCase().contains("admin") || b2.toLowerCase().contains("mod") || b2.toLowerCase().contains("dev") || b2.toLowerCase().contains("owner")) {
            this.io = new String[]{"This username has been blocked", "and cannot be used."};
        } else if (b2.startsWith(" ") || b2.startsWith("_")) {
            this.io = new String[]{"Your username cannot start with a space."};
        } else if (b2.endsWith(" ") || b2.endsWith("_")) {
            this.io = new String[]{"Your username cannot end with a space."};
        } else if (b2.length() <= 0 && str.length() <= 0) {
            this.io = new String[]{"Please enter a valid username and password."};
        } else if (str.length() < 3) {
            this.io = new String[]{"Your password is too short."};
        } else if (b2.length() <= 0) {
            this.io = new String[]{"Your username is too short."};
        } else if (b2.length() > 12) {
            this.io = new String[]{"Your username is too long."};
        } else if (str.length() > 24) {
            this.io = new String[]{"Your password is too long."};
        } else {
            this.io = new String[]{"Attempting to login"};
            if (client.ir == 0) {
                client.in = 0;
            }
            try {
                this.io = new String[]{"Attempting to login"};
                Y();
                new Thread(() -> {
                    boolean z3 = this.jG;
                }, "Login").start();
                b(client);
                a(client, client.hH.c(), b2, str, N(), this.ka, z2);
            } catch (IOException unused) {
                this.io = new String[]{"Error connecting to server."};
                this.jG = false;
                aJ = false;
            }
        }
    }

    private static void b(Client client) {
        client.hH = new org.necrotic.client.h.a(client, T());
        int b2 = (int) ((org.necrotic.client.f.a.b.b(B) >> 16) & 31);
        dj.f = 0;
        dj.l(76);
        dj.l(b2);
        client.hH.a(2, dj.d);
        for (int i2 = 0; i2 < 8; i2++) {
            client.hH.c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.String, java.lang.Exception] */
    private boolean a(Client client, int i2, String str, String str2, String str3, String str4, boolean z2) {
        ?? r0;
        if (i2 == 0) {
            client.hH.a(client.ig.d, 8);
            client.ig.f = 0;
            client.iT = client.ig.i();
            int[] iArr = new int[4];
            iArr[0] = (int) (Math.random() * 9.9999999E7d);
            iArr[1] = (int) (Math.random() * 9.9999999E7d);
            iArr[2] = (int) (client.iT >> 32);
            iArr[3] = (int) client.iT;
            dj.f = 0;
            dj.l(21);
            dj.h(iArr[0]);
            dj.h(iArr[1]);
            dj.h(iArr[2]);
            dj.h(iArr[3]);
            dj.h(350);
            dj.a(str);
            dj.a(str2);
            dj.a(str3);
            dj.a(str4);
            dj.j(222);
            dj.l(0);
            org.necrotic.client.g.a aVar = dj;
            int i3 = aVar.f;
            aVar.f = 0;
            byte[] bArr = new byte[i3];
            aVar.a(i3, bArr);
            byte[] byteArray = new BigInteger(bArr).modPow(org.necrotic.client.g.a.h, org.necrotic.client.g.a.g).toByteArray();
            aVar.f = 0;
            aVar.l(byteArray.length);
            aVar.b(byteArray, byteArray.length);
            client.im.f = 0;
            client.im.l(z2 ? 65 : 92);
            client.im.l(dj.f + 36 + 1 + 1 + 2 + this.jY.length() + 1);
            client.im.l(169);
            client.im.j(39);
            client.im.l(df ? 66 : 12);
            byte[] bytes = cv.getBytes(StandardCharsets.UTF_8);
            this.im.l(bytes.length);
            this.im.b(bytes, bytes.length);
            try {
                this.jV = (this.jY == null || this.jY.length() == 0) ? -1 : Integer.parseInt(this.jY);
            } catch (NumberFormatException unused) {
                this.jV = -1;
            }
            this.im.j(this.jV);
            this.im.a(this.jY);
            for (int i4 = 0; i4 < 9; i4++) {
                this.im.h(this.dY[i4]);
            }
            client.im.b(dj.d, dj.f);
            dj.e = new org.necrotic.client.g.b(iArr);
            for (int i5 = 0; i5 < 4; i5++) {
                int i6 = i5;
                iArr[i6] = iArr[i6] + 50;
            }
            client.hI = new org.necrotic.client.g.b(iArr);
            client.hH.a(client.im.f, client.im.d);
            i2 = client.hH.c();
            this.jW = false;
            this.jY = "";
        }
        if (i2 == 1) {
            this.jG = false;
            try {
                Thread.sleep(2000L);
            } catch (Exception unused2) {
            }
            a(str2, z2, str, client);
            return false;
        } else if (i2 != 2) {
            if (!a(i2, str, z2, client, str2)) {
                this.jG = false;
                this.jX = false;
                this.jW = false;
                return false;
            } else if (i2 != -1) {
                this.io = new String[]{"Unexpected server response.", "Please try using a different world."};
                return false;
            } else {
                this.jG = false;
                if (i2 != 0 || client.ir == 0) {
                    this.io = new String[]{"No response from server!"};
                    return false;
                } else if (client.in >= 2) {
                    this.io = new String[]{"Too many login attempts!"};
                    return false;
                } else {
                    try {
                        Thread.sleep(2000L);
                    } catch (Exception unused3) {
                    }
                    client.in++;
                    a(str2, z2, str, client);
                    return false;
                }
            }
        } else {
            client.bc = client.hH.c();
            client.hH.c();
            if (client.hH.c() > 0) {
                int c2 = ((client.hH.c() & ColorUtil.MAX_RGB_VALUE) << 8) + (client.hH.c() & ColorUtil.MAX_RGB_VALUE);
                int i7 = c2;
                if (c2 > 60000) {
                    i7 -= 65535;
                }
                byte[] bArr2 = new byte[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    bArr2[i8] = (byte) client.hH.c();
                }
                ImageIO.read(new ByteArrayInputStream(bArr2));
                this.jZ = new org.necrotic.client.f.e(bArr2);
                this.jW = true;
                this.jX = true;
                this.ip = 0;
            } else {
                client.bN = true;
                client.ev = true;
                aJ = true;
                dj.f = 0;
                client.ig.f = 0;
                client.eL = -1;
                client.eC = -1;
                client.eD = -1;
                client.eE = -1;
                client.eK = 0;
                client.ew = 0;
                client.eB = 0;
                client.ft = 0;
                client.fu = null;
                client.ex = 0;
                client.Y = 0;
                client.aV = 0;
                client.aW = false;
                client.bT = 0;
                client.eG = 0;
                client.eO = 0;
                client.eH = 0;
                client.eN = 0;
                client.aw();
                client.V = 0;
                client.hf = -1;
                client.ay = 0;
                client.az = 0;
                client.bp = 0;
                client.bk = 0;
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
                    B.printStackTrace();
                }
                for (int i11 = 0; i11 < client.eb; i11++) {
                    client.bo[i11] = null;
                    client.hx[i11] = null;
                }
                for (int i12 = 0; i12 < 16384; i12++) {
                    client.bj[i12] = null;
                }
                org.necrotic.client.e.a.a[] aVarArr = client.bo;
                int i13 = client.ec;
                org.necrotic.client.e.a.a aVar2 = new org.necrotic.client.e.a.a();
                aVarArr[i13] = aVar2;
                t = aVar2;
                client.fX.d();
                client.fY.d();
                for (int i14 = 0; i14 < 4; i14++) {
                    for (int i15 = 0; i15 < 104; i15++) {
                        for (int i16 = 0; i16 < 104; i16++) {
                            client.aG[i14][i15][i16] = null;
                        }
                    }
                }
                client.fZ = new org.necrotic.client.c.b.a();
                client.hY = -1;
                client.gY = 0;
                client.aC = 0;
                client.aA = -1;
                client.ai = -1;
                u = -1;
                client.aI = -1;
                client.gj = -1;
                client.eu = false;
                w = 3;
                client.aH = 0;
                client.aW = false;
                client.aY = false;
                client.ah = null;
                client.ez = 0;
                client.eA = 0;
                client.ey = -1;
                client.et = true;
                client.aj();
                for (int i17 = 0; i17 < 5; i17++) {
                    client.f0do[i17] = 0;
                }
                for (int i18 = 0; i18 < 7; i18++) {
                    client.dp[i18] = null;
                    client.dq[i18] = false;
                }
                cN = 0;
                cJ = 0;
                db = 0;
                cQ = 0;
                da = 0;
                cO = 0;
                cL = 0;
                cP = 0;
                client.au = new int[500];
                client.ap = new String[500];
                client.ao = new String[500];
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
                this.io = new String[]{""};
                this.jG = false;
            }
            org.necrotic.client.e.a.b.a();
            String a2 = j.a(k.f230a);
            dj.i(243);
            dj.l(a2.length() + 1);
            dj.a(a2);
            return false;
        }
    }

    private boolean a(int i2, String str, boolean z2, Client client, String str2) {
        if (i2 == 3) {
            this.io = new String[]{"Invalid username or password."};
            return false;
        } else if (i2 == 4) {
            this.io = new String[]{"This account has been banned! Appeal on the forum."};
            return false;
        } else if (i2 == 5) {
            this.io = new String[]{"This account is already logged in.", "Please try again in 60 seconds.."};
            return false;
        } else if (i2 == 6) {
            this.io = new String[]{"Tarn is currently being updated.", "Please try again in 60 seconds.."};
            return false;
        } else if (i2 == 7) {
            this.io = new String[]{"Tarn is currently busy.", "Please try again."};
            return false;
        } else if (i2 == 8) {
            this.io = new String[]{"Tarn login server is down.", "Please try again in 60 seconds.."};
            return false;
        } else if (i2 == 9) {
            this.io = new String[]{"Login limit exceeded. Too many connections", "from your address."};
            return false;
        } else if (i2 == 10) {
            this.io = new String[]{"Unable to connect!", "Server responded: bad session id!"};
            return false;
        } else if (i2 == 11) {
            this.io = new String[]{"Unable to connect!", "Server responded: rejected session!"};
            return false;
        } else if (i2 == 12) {
            this.io = new String[]{"You need to be a member to login to this world."};
            return false;
        } else if (i2 == 13) {
            this.io = new String[]{"Login could not be completed. Try again!"};
            return false;
        } else if (i2 == 14) {
            this.io = new String[]{"Tarn is currently being updated.", "Please try again in 60 seconds.."};
            return false;
        } else if (i2 == 23) {
            this.io = new String[]{"Tarn is currently being launched.", "Please try again in 60 seconds.."};
            return false;
        } else if (i2 == 27) {
            this.io = new String[]{"Your IP-Adress has been banned.", "Please appeal on the forums."};
            return false;
        } else if (i2 == 28) {
            this.io = new String[]{"Your username contains invalid letters.", "Your username contains invalid letters."};
            return false;
        } else if (i2 == 29) {
            this.io = new String[]{"Old client usage detected.", "Download the latest one!"};
            return false;
        } else if (i2 == 31) {
            this.io = new String[]{"Your username cannot start with a space."};
            return false;
        } else if (i2 == 22) {
            this.io = new String[]{"This computer has been banned.", "Appeal on the forum!"};
            return false;
        } else if (i2 == 30) {
            String[] strArr = new String[2];
            strArr[0] = "Tarn has been updated!";
            strArr[1] = ae() ? "Refresh this page." : "Download the latest client.";
            this.io = strArr;
            return false;
        } else if (i2 == 16) {
            this.io = new String[]{"Login attempts exceeded.", "Please wait 1 minute and try again."};
            return false;
        } else if (i2 == 17) {
            this.io = new String[]{"You are standing in a members-only area.", "To play on this world move to a free area first."};
            return false;
        } else if (i2 == 20) {
            this.io = new String[]{"Invalid loginserver requested", "Please try using a different world."};
            return false;
        } else if (i2 == 37) {
            this.io = new String[]{"This account does not exist. You can create", "it by clicking the button below."};
            return false;
        } else if (i2 == 66) {
            this.io = new String[]{"This account has been locked. Please contact Corrupt or Alex to unlock."};
            return false;
        } else if (i2 == 67) {
            this.io = new String[]{"This account has been temporarily disabled for 5 Minutes"};
            return false;
        } else if (i2 == 68) {
            this.io = new String[]{"This account has been temporarily disabled 10 Minutes"};
            return false;
        } else if (i2 == 69) {
            this.io = new String[]{"This account has been temporarily disabled 15 Minutes"};
            return false;
        } else if (i2 == 70) {
            this.io = new String[]{"This account has been temporarily disabled 30 Minutes"};
            return false;
        } else if (i2 == 71) {
            this.io = new String[]{"This account has been temporarily disabled 1 Hour"};
            return false;
        } else if (i2 == 72) {
            this.io = new String[]{"This account has been temporarily disabled ."};
            return false;
        } else if (i2 == 73) {
            this.io = new String[]{"This IP is not registered. Please turn off VPNs."};
            return false;
        } else if (i2 == 74) {
            this.io = new String[]{"Please turn off VPN's or TORs."};
            return false;
        } else if (i2 == 21) {
            for (int c2 = client.hH.c(); c2 >= 0; c2--) {
                this.io = new String[]{"You have only just left another world", "Your profile will be transferred in: " + c2 + " seconds"};
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
        if (this.gc != 0) {
            return;
        }
        this.aU[0] = "Cancel";
        this.aT[0] = 1107;
        this.aV = 1;
        int i2 = 122 + (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 0 : 2);
        if (this.hY != -1) {
            this.gW = 0;
            this.gS = 0;
            this.fq = 0;
            a(org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 8 : (s() / 2) - (aa.u[this.hY].aO / 2), aa.u[this.hY], this.bW, org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 8 : (t() / 2) - (aa.u[this.hY].aa / 2), this.bX, 0);
            if (this.gW != this.gk) {
                this.gk = this.gW;
            }
            if (this.gS != this.gB) {
                this.gB = this.gS;
                return;
            }
            return;
        }
        if (!this.bL.b() && this.ic) {
            R();
        }
        if (this.bW >= 495 && this.bW <= 510 && this.bX >= i2 + this.bL.h() && this.bX <= (i2 + this.bL.h()) + 13) {
            a.C0027a c0027a = this.bL.f206a;
            org.necrotic.client.f.b.a.a();
            c0027a.a(this);
            return;
        }
        this.gW = 0;
        this.gS = 0;
        this.fq = 0;
        int s2 = org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? s() : 516;
        int t2 = org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? t() : 338;
        if (this.bW > this.eX && this.bX > this.eY && this.bW < s2 && this.bX < t2) {
            int i3 = u;
            ?? r0 = i3;
            if (i3 != -1) {
                boolean z2 = this.ic;
                r0 = z2;
                if (z2) {
                    aa aaVar = aa.u[u];
                    if (org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED) {
                        a(this.eX + (((org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? s() : 516) - Constants.GAME_FIXED_WIDTH) / 2), aaVar, this.bW, this.eY + (((org.necrotic.client.f.b.a.a() != a.EnumC0026a.FIXED ? t() : 338) - Constants.GAME_FIXED_HEIGHT) / 2), this.bX, 0);
                    } else {
                        a(4, aaVar, this.bW, 4, this.bX, 0);
                    }
                }
            }
            try {
                if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
                    Q();
                } else if (!this.ea.b(this, org.necrotic.client.f.b.a.a()) && !this.bL.b(this, org.necrotic.client.f.b.a.a()) && !this.bx.b(this, org.necrotic.client.f.b.a.a())) {
                    Q();
                }
            } catch (Exception unused) {
                r0.printStackTrace();
            }
        }
        b bVar = this.eo;
        int i4 = this.bW;
        int i5 = this.bX;
        bVar.a();
        this.en.a(this.bW, this.bX);
        if (this.fu != null) {
            this.bi.b(16776960, this.fu, org.necrotic.client.f.b.a.j() ? 329 : t() - 168, 4);
            if (this.bW >= 4 && this.bW <= 503) {
                if (this.bX >= (org.necrotic.client.f.b.a.j() ? 320 : t() - 168)) {
                    if (this.bX <= (org.necrotic.client.f.b.a.j() ? 337 : t() - 185)) {
                        q.aU[0] = "Dismiss";
                        q.aT[0] = 471;
                    }
                }
            }
        }
        a.C0027a c0027a2 = this.bL.f206a;
        org.necrotic.client.f.b.a.a();
        c0027a2.a(this);
        if (this.gW != this.gk) {
            this.gk = this.gW;
        }
        if (this.gS != this.gB) {
            this.gB = this.gS;
        }
        this.gW = 0;
        this.gS = 0;
        this.fq = 0;
        if (this.bx.b(this, org.necrotic.client.f.b.a.a()) && !this.bx.b()) {
            if (this.aI != -1) {
                a(this.bx.g() + (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 31 : 40), aa.u[this.aI], this.bW, this.bx.h() + (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 36 : s() <= 1000 ? -6 : 30), this.bX, 0);
            } else if (c[w] != -1) {
                a(this.bx.g() + (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 31 : 40), aa.u[c[w]], this.bW, this.bx.h() + (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED ? 36 : s() <= 1000 ? -6 : 30), this.bX, 0);
            }
        }
        if (this.gW != this.gq) {
            cu = true;
            this.gq = this.gW;
        }
        if (this.gS != this.go) {
            cu = true;
            this.go = this.gS;
        }
        this.gW = 0;
        this.gS = 0;
        if (this.bW > this.bL.g() && this.bX > this.bL.h() && this.bW < this.bL.g() + 490 && this.bX < this.bL.h() + 125) {
            if (this.ai != -1) {
                a(20, aa.u[this.ai], this.bW, this.bL.h() + 20, this.bX, this.bL.g());
            } else if (this.bX < this.bL.h() + 125 && this.bW < this.bL.g() + 490) {
                t(this.bX - this.bL.h());
            }
        }
        if (this.ai != -1 && this.gW != this.gn) {
            E = true;
            this.gn = this.gW;
        }
        if (this.ai != -1 && this.gS != this.gT) {
            E = true;
            this.gT = this.gS;
        }
        this.ea.c(this);
        boolean z3 = false;
        while (!z3) {
            z3 = true;
            for (int i6 = 0; i6 < this.aV - 1; i6++) {
                if (this.aT[i6] < 1000 && this.aT[i6 + 1] > 1000) {
                    String str = this.aU[i6];
                    String[] strArr = this.aU;
                    strArr[i6] = strArr[i6 + 1];
                    this.aU[i6 + 1] = str;
                    int i7 = this.aT[i6];
                    int[] iArr = this.aT;
                    iArr[i6] = iArr[i6 + 1];
                    this.aT[i6 + 1] = i7;
                    int i8 = this.iz[i6];
                    int[] iArr2 = this.iz;
                    iArr2[i6] = iArr2[i6 + 1];
                    this.iz[i6 + 1] = i8;
                    int i9 = this.iA[i6];
                    int[] iArr3 = this.iA;
                    iArr3[i6] = iArr3[i6 + 1];
                    this.iA[i6 + 1] = i9;
                    int i10 = this.jB[i6];
                    int[] iArr4 = this.jB;
                    iArr4[i6] = iArr4[i6 + 1];
                    this.jB[i6 + 1] = i10;
                    int i11 = this.jC[i6];
                    int[] iArr5 = this.jC;
                    iArr5[i6] = iArr5[i6 + 1];
                    this.jC[i6 + 1] = i11;
                    int i12 = this.iy[i6];
                    int[] iArr6 = this.iy;
                    iArr6[i6] = iArr6[i6 + 1];
                    this.iy[i6 + 1] = i12;
                    z3 = false;
                }
            }
        }
    }

    private boolean d(aa aaVar) {
        int i2 = aaVar.X;
        int i3 = aaVar.ac - 79924;
        if (this.gY == 2) {
            if (i2 == 201) {
                E = true;
                this.aH = 0;
                this.aY = true;
                this.bs = "";
                this.hX = 1;
                this.bt = "Enter name of friend to add to list";
            }
            if (i2 == 202) {
                E = true;
                this.aH = 0;
                this.aY = true;
                this.bs = "";
                this.hX = 2;
                this.bt = "Enter name of friend to delete from list";
            }
        }
        if (i2 == 205) {
            this.ex = 250;
            return true;
        }
        if (i2 == 501) {
            E = true;
            this.aH = 0;
            this.aY = true;
            this.bs = "";
            this.hX = 4;
            this.bt = "Enter the name of a player to add to the list";
        }
        if (i2 == 502) {
            E = true;
            this.aH = 0;
            this.aY = true;
            this.bs = "";
            this.hX = 5;
            this.bt = "Enter the name of a player to delete from the list";
        }
        if (i2 == 1321) {
            E = true;
            this.aH = 0;
            this.aY = true;
            this.bs = "";
            this.hX = 12;
            this.bt = "Enter your " + af.f175a[i3] + " level goal below.";
        }
        if (i2 == 1322) {
            E = true;
            this.aH = 0;
            this.aY = true;
            this.bs = "";
            this.hX = 13;
            this.bt = "Enter your experience goal below.";
        }
        if (i2 == 1323) {
            if (af.c[af.e][0] == -1 && af.c[af.e][1] == -1 && af.c[af.e][2] == -1) {
                a("You do not have a goal to clear for that level.", 0, "");
            }
            if (af.e >= 0) {
                af.c[af.e][0] = -1;
                af.c[af.e][1] = -1;
                af.c[af.e][2] = -1;
                k(B);
            }
        } else if (i2 >= 5000 && i2 <= 5025) {
            dj.i(223);
            dj.j(i2 - 5000);
            return true;
        }
        if (i2 == 550) {
            if (aa.u[18135].an.startsWith("Join")) {
                E = true;
                this.aH = 0;
                this.aY = true;
                this.bs = "";
                this.hX = 6;
                this.bt = "Enter the name of the chat you wish to join";
            } else {
                dj.i(195);
                dj.h(49627);
            }
        }
        if (i2 == 22222) {
            E = true;
            this.aY = true;
            this.U = "";
            this.bs = "";
            this.aH = 0;
            this.ih = 6199;
            this.bt = "Enter a name for the clan chat.";
        }
        if (i2 == 677) {
            E = true;
            this.aY = true;
            this.U = "";
            this.bs = "";
            this.aH = 0;
            this.ih = 6200;
            this.bt = "Enter name of the player you would like kicked.";
        }
        if (i2 >= 300 && i2 <= 313) {
            int i4 = (i2 - 300) / 2;
            int i5 = i2 & 1;
            int i6 = this.dI[i4];
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
                    if (!org.necrotic.client.c.a.e.f186a[i7].e()) {
                        if (org.necrotic.client.c.a.e.f186a[i7].g() == i4 + (this.et ? 0 : 7)) {
                            break;
                        }
                    }
                }
                this.dI[i4] = i7;
                this.fK = true;
            }
        }
        if (i2 >= 314 && i2 <= 323) {
            int i8 = (i2 - 314) / 2;
            int i9 = i2 & 1;
            int i10 = this.f0do[i8];
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
            this.f0do[i8] = i10;
            this.fK = true;
        }
        if (i2 == 324 && !this.et) {
            this.et = true;
            aj();
        }
        if (i2 == 325 && this.et) {
            this.et = false;
            aj();
        }
        if (i2 == 326) {
            String str = " " + (this.et ? 0 : 1);
            for (int i11 = 0; i11 < 7; i11++) {
                str = str + " " + this.dI[i11];
            }
            for (int i12 = 0; i12 < 5; i12++) {
                str = str + " " + this.f0do[i12];
            }
            dj.i(11);
            dj.l(str.substring(1).length() + 1);
            dj.a(str.substring(1));
            return true;
        }
        return false;
    }

    private void a(String str, String str2, String str3, int i2, int i3, List<Integer> list) {
        if (this.ai == -1) {
            E = true;
        }
        for (int i4 = 499; i4 > 0; i4--) {
            int[] iArr = this.au;
            iArr[i4] = iArr[i4 - 1];
            String[] strArr = this.ap;
            strArr[i4] = strArr[i4 - 1];
            String[] strArr2 = this.ao;
            strArr2[i4] = strArr2[i4 - 1];
            List<Integer>[] listArr = this.F;
            listArr[i4] = listArr[i4 - 1];
            String[] strArr3 = this.aq;
            strArr3[i4] = strArr3[i4 - 1];
            int[] iArr2 = this.ar;
            iArr2[i4] = iArr2[i4 - 1];
            int[] iArr3 = this.O;
            iArr3[i4] = iArr3[i4 - 1];
        }
        String a2 = org.necrotic.client.f.a.a.a(str);
        this.au[0] = 2;
        this.ap[0] = str2;
        this.ao[0] = a2.trim();
        this.F[0] = list;
        this.aq[0] = str3;
        this.O[0] = i2;
        this.ar[0] = i3;
    }

    public final void a(String str, int i2, String str2) {
        if (i2 == 0 && this.aA != -1) {
            this.ah = str;
            this.bO = 0;
        }
        if (this.ai == -1) {
            E = true;
        }
        for (int i3 = 499; i3 > 0; i3--) {
            int[] iArr = this.au;
            iArr[i3] = iArr[i3 - 1];
            String[] strArr = this.ap;
            strArr[i3] = strArr[i3 - 1];
            String[] strArr2 = this.ao;
            strArr2[i3] = strArr2[i3 - 1];
            List<Integer>[] listArr = this.F;
            listArr[i3] = listArr[i3 - 1];
            String[] strArr3 = this.aq;
            strArr3[i3] = strArr3[i3 - 1];
            int[] iArr2 = this.ar;
            iArr2[i3] = iArr2[i3 - 1];
            int[] iArr3 = this.O;
            iArr3[i3] = iArr3[i3 - 1];
        }
        this.au[0] = i2;
        this.ap[0] = str2;
        this.ao[0] = str.trim();
        this.F[0] = new ArrayList();
        this.aq[0] = "";
        this.O[0] = 0;
        this.ar[0] = 0;
    }

    @Override // org.necrotic.client.r
    public final void m() {
        this.jk = true;
    }

    private void ar() {
        if (this.ht != null) {
            return;
        }
        this.bS = null;
        this.an = null;
        this.aK = null;
        this.by = null;
        this.aF = null;
        this.hu = null;
        this.ht = new org.necrotic.client.f.d(509, 171, j());
        org.necrotic.client.f.c.e();
        this.jb = new org.necrotic.client.f.d(s(), t(), j());
        org.necrotic.client.f.c.e();
        new org.necrotic.client.f.d(203, 238, j());
        org.necrotic.client.f.c.e();
        new org.necrotic.client.f.d(74, 94, j());
        org.necrotic.client.f.c.e();
        if (this.jd != null) {
            ar();
            System.gc();
        }
        this.jk = true;
    }

    private void as() {
        if (this.an != null) {
            return;
        }
        an();
        this.bS = null;
        this.ht = null;
        this.jb = null;
        this.an = new org.necrotic.client.f.d(516, 165, j());
        this.aK = new org.necrotic.client.f.d(249, 168, j());
        org.necrotic.client.f.c.e();
        if (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED) {
            D.a(14).e(0, 0);
        }
        this.by = new org.necrotic.client.f.d(250, 335, j());
        this.aF = new org.necrotic.client.f.d(512, 334, j());
        org.necrotic.client.f.c.e();
        this.hu = new org.necrotic.client.f.d(249, 45, j());
        this.jk = true;
    }

    private void at() {
        try {
            if (this.hH != null) {
                this.hH.b();
            }
        } catch (Exception unused) {
        }
        if (org.necrotic.a.d) {
            boolean z2 = false;
            Account[] accounts = this.eP.getAccounts();
            int length = accounts.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Account account = accounts[i2];
                if (account == null || !account.getUsername().equalsIgnoreCase(B)) {
                    i2++;
                } else {
                    account.setIDKHead(t.w[0] < 1164 ? this.dI[0] == 0 ? A[0] : this.dI[0] : 0);
                    account.setHelmet(t.w[0] >= 1164 ? t.w[0] - 512 : 0);
                    account.setJaw(A[1]);
                    account.setGender(t.f);
                    account.setPassword(this.bK);
                    z2 = true;
                }
            }
            if (!z2) {
                this.eP.addAccount(new Account(B, this.bK, t.f, t.w[0] >= 1164 ? t.w[0] - 512 : 0, t.w[0] < 1164 ? this.dI[0] == 0 ? A[0] : this.dI[0] : 0, this.dI[1] == 0 ? A[1] : this.dI[1]), false);
            } else {
                this.eP.updateInterface();
            }
            this.eP.save();
        }
        this.eo.f179a = null;
        this.en.a(null);
        this.jS = null;
        this.jG = false;
        this.io = new String[]{""};
        y = false;
        this.eq = false;
        this.hH = null;
        aJ = false;
        this.iq = 0;
        this.ip = 0;
        az();
        this.jl.c();
        for (int i3 = 0; i3 < 4; i3++) {
            this.fW[i3].a();
        }
        System.gc();
        this.hO = -1;
        this.iL = -1;
        this.iO = 0;
        if (!org.necrotic.client.f.b.a.j()) {
            ay();
        }
        k(0, 0);
        org.necrotic.client.a.a.a(q);
    }

    @Override // org.necrotic.client.r, java.lang.Runnable
    public void run() {
        boolean z2 = this.fb;
        super.run();
    }

    private void au() {
        if (this.ai != -1) {
            this.ai = -1;
            E = true;
        }
        if (this.aH != 0) {
            this.aH = 0;
            E = true;
        }
        u = 21172;
        this.aI = 3213;
        cu = true;
        this.eu = false;
    }

    private void l(int i2, int i3) {
        this.dH[i2] = i3;
        if (this.bM[i2] != i3) {
            this.bM[i2] = i3;
            E(i2);
            if (this.aA != -1) {
                E = true;
            }
        }
    }

    public static void a(boolean z2) {
        E = z2;
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
        this.hF = 0;
        this.hG = 0;
        this.ji = 0;
        this.bA = 0;
        this.ba = 0;
        this.bb = 0;
    }

    private void m(int i2, int i3) {
        org.necrotic.client.c.b.a aVar = this.aG[this.bn][i2][i3];
        if (aVar == null) {
            this.jl.e(this.bn, i2, i3);
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
                this.jl.a(i2, i2 + (i3 << 7) + 1610612736, dVar3, b(this.bn, (i3 << 7) + 64, (i2 << 7) + 64), dVar4, dVar, this.bn, i3);
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
        this.jx = i2;
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
        this.jD = true;
        boolean z2 = ae.g;
        if (ae.d != null) {
            ae.d.getDocumentBase().getHost().toLowerCase();
        }
        for (int i2 = 0; i2 < this.fG.length; i2++) {
            File file = new File(ae.b() + i2 + ".png");
            if (!file.exists() && !org.necrotic.client.h.b.a("https://tarn-rsps.com/resources/" + i2 + ".png", ae.b())) {
                org.necrotic.client.h.b.a("https://tarn-rsps.com/resources/" + i2 + ".png", ae.b());
            }
            try {
                this.fG[i2] = ImageIO.read(file);
            } catch (Exception unused) {
            }
        }
        Thread thread = new Thread(() -> {
            while (true) {
                ?? r0 = this.jD;
                if (r0 != 0) {
                    try {
                        r0 = f.f202a;
                        if (r0 == 0) {
                            this.jx += 2;
                            if (this.jx > 100) {
                                this.jx = 100;
                                boolean z3 = this.jD;
                            }
                        }
                        Graphics graphics = cl == null ? getGraphics() : cl.getGraphics();
                        Graphics graphics2 = graphics;
                        if (graphics != null) {
                            if (this.fG[0] != null) {
                                graphics2.drawImage(this.fG[0], 0, 0, (ImageObserver) null);
                            }
                            if (this.jx > 0) {
                                int i3 = ((this.jx * 790) / 560) << 2;
                                int i4 = i3;
                                if (i3 > 559) {
                                    i4 = 559;
                                }
                                if (this.fG[3] != null) {
                                    graphics2.drawImage(this.fG[3], i4 + 72 + 20, 280, (ImageObserver) null);
                                }
                                graphics2.setFont(new Font("Serif", 1, 16));
                                int i5 = i4 + 80;
                                if (this.jx < 10) {
                                    i5 += 4;
                                } else if (this.jx == 100) {
                                    i5 -= 4;
                                }
                                graphics2.drawString(new StringBuilder().append(this.jx).toString(), i5 + 20, 307);
                                if (this.fG[2] != null) {
                                    graphics2.drawImage(this.fG[2].getSubimage(0, 0, i4 + 20, 32), 89, 323, (ImageObserver) null);
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
            if (this.bV != null) {
                this.bV.c();
            }
            this.jx = 0;
        }
        if (ae.f174a != null) {
            for (int i3 = 0; i3 < 6; i3++) {
                this.J[i3] = new m(ae.f174a, ae.b[i3], i3 + 1);
            }
        }
        File file2 = new File(ae.b() + "/Shop/");
        if (!file2.exists()) {
            file2.mkdir();
        }
        for (int i4 = 0; i4 < 13; i4++) {
            this.jQ[i4] = new org.necrotic.client.f.e("/Shop/currency".concat(String.valueOf(i4)));
        }
        for (int i5 = 0; i5 < 6; i5++) {
            this.jU[i5] = new org.necrotic.client.f.e("/Shop/box".concat(String.valueOf(i5)));
        }
        try {
            this.jd = a(1, "title", this.dY[1]);
            this.bv = new org.necrotic.client.f.a.c(false, "p11_full", this.jd);
            this.bi = new org.necrotic.client.f.a.c(false, "p12_full", this.jd);
            this.ju = new org.necrotic.client.f.a.c(false, "hit_full", this.jd);
            this.jv = new org.necrotic.client.f.a.c(true, "critical_full", this.jd);
            this.as = new org.necrotic.client.f.a.c(false, "b12_full", this.jd);
            this.at = new org.necrotic.client.f.a.c(true, "q8_full", this.jd);
            this.be = new org.necrotic.client.f.a.a(false, "p11_full", this.jd);
            this.bf = new org.necrotic.client.f.a.a(false, "p12_full", this.jd);
            this.bg = new org.necrotic.client.f.a.a(false, "b12_full", this.jd);
            this.bh = new org.necrotic.client.f.a.a(true, "q8_full", this.jd);
            ar();
            System.gc();
            cE = a(q);
            cB = new org.necrotic.client.n.b.a(l);
            org.necrotic.client.c.a a2 = a(2, "config", this.dY[2]);
            org.necrotic.client.c.a a3 = a(3, "interface", this.dY[3]);
            org.necrotic.client.c.a a4 = a(4, "media", this.dY[4]);
            org.necrotic.client.c.a a5 = a(6, "textures", this.dY[6]);
            a(7, "wordenc", this.dY[7]);
            org.necrotic.client.c.a a6 = a(8, "sounds", this.dY[8]);
            this.hE = new byte[4][104][104];
            this.ii = new int[4][105][105];
            this.jl = new org.necrotic.client.n.m(this.ii);
            for (int i6 = 0; i6 < 4; i6++) {
                this.fW[i6] = new org.necrotic.client.n.b();
            }
            this.aZ = new org.necrotic.client.f.e(512, 512);
            org.necrotic.client.c.a a7 = a(5, "versionlist", this.dY[5]);
            this.bm = new org.necrotic.client.c.c.a();
            this.bm.a(a7, this);
            this.bm.b();
            org.necrotic.client.n.d.a(this.bm);
            z();
            this.fy = new org.necrotic.client.f.e(a4, "mapfunction", 5);
            D.a(ae.b());
            this.is = new org.necrotic.client.f.a(a4, "mapback", 0);
            this.it = new org.necrotic.client.f.e(a4, "mapedge", 0);
            org.necrotic.client.f.e eVar = this.it;
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
                    this.iw[i8] = new org.necrotic.client.f.a(a4, "mapscene", i8);
                } catch (Exception unused2) {
                }
            }
            for (int i9 = 0; i9 < 100; i9++) {
                if (i9 < 75) {
                    try {
                        this.iv[i9] = new org.necrotic.client.f.e(a4, "mapfunction", i9);
                        continue;
                    } catch (Exception unused3) {
                    }
                } else {
                    this.iv[i9] = new org.necrotic.client.f.e(a4, "mapfunctions2", i9 - 76);
                    continue;
                }
            }
            for (int i10 = 0; i10 <= 19; i10++) {
                try {
                    this.id[i10] = new org.necrotic.client.f.e(a4, "headicons_prayer", i10);
                } catch (Exception unused4) {
                }
            }
            for (int i11 = 0; i11 < 7; i11++) {
                this.iU[i11] = new org.necrotic.client.f.e(a4, "headicons_pk", i11);
            }
            this.aR = new org.necrotic.client.f.e(a4, "mapmarker", 0);
            this.aS = new org.necrotic.client.f.e(a4, "mapmarker", 1);
            for (int i12 = 0; i12 < 8; i12++) {
                this.hJ[i12] = new org.necrotic.client.f.e(a4, "cross", i12);
            }
            this.aN = new org.necrotic.client.f.e(a4, "mapdots", 0);
            this.aO = new org.necrotic.client.f.e(a4, "mapdots", 1);
            this.aP = new org.necrotic.client.f.e(a4, "mapdots", 2);
            this.aM = new org.necrotic.client.f.e(a4, "mapdots", 3);
            this.aQ = new org.necrotic.client.f.e(a4, "mapdots", 4);
            this.ek = new org.necrotic.client.f.e("alertback");
            this.el = new org.necrotic.client.f.e("alertborder");
            this.em = new org.necrotic.client.f.e("alertborderh");
            this.R.add(new org.necrotic.client.f.c.c(2378, 4014, new org.necrotic.client.f.e(a4, "mapfunction", 12)));
            this.R.add(new org.necrotic.client.f.c.c(2378, 4028, new org.necrotic.client.f.e(a4, "mapfunction", 12)));
            this.R.add(new org.necrotic.client.f.c.c(3663, 2981, new org.necrotic.client.f.e(a4, "mapfunction", 5)));
            this.R.add(new org.necrotic.client.f.c.c(3674, 2970, new org.necrotic.client.f.e(a4, "mapfunction", 51)));
            this.R.add(new org.necrotic.client.f.c.c(3676, 2989, new org.necrotic.client.f.e(a4, "mapfunction", 54)));
            this.R.add(new org.necrotic.client.f.c.c(3685, 2977, new org.necrotic.client.f.e(a4, "mapfunction", 0)));
            this.R.add(new org.necrotic.client.f.c.c(2574, 3880, new org.necrotic.client.f.e(a4, "mapfunction", 5)));
            this.R.add(new org.necrotic.client.f.c.c(2550, 3858, new org.necrotic.client.f.e(a4, "mapfunction", 5)));
            this.R.add(new org.necrotic.client.f.c.c(2557, 3886, new org.necrotic.client.f.e(a4, "mapfunction", 34)));
            d[] dVarArr = new d[10];
            dn = dVarArr;
            dVarArr[0] = new d(ae.b() + "gifs/diamond.gif");
            dn[1] = new d(ae.b() + "gifs/emerald.gif");
            dn[2] = new d(ae.b() + "gifs/onyx.gif");
            dn[3] = new d(ae.b() + "gifs/ruby.gif");
            dn[4] = new d(ae.b() + "gifs/sapphire.gif");
            dn[5] = new d(ae.b() + "gifs/zenyte.gif");
            dn[6] = new d(ae.b() + "gifs/mod.gif");
            dn[7] = new d(ae.b() + "gifs/admin.gif");
            dn[8] = new d(ae.b() + "gifs/cm.gif");
            dn[9] = new d(ae.b() + "gifs/support.gif");
            org.necrotic.client.f.c.h.f216a = D.a(3363);
            org.necrotic.client.f.c.h.b = D.a(3338);
            this.aL = D.a(398);
            this.iu = D.a(297);
            for (int i13 = 0; i13 < 12; i13++) {
                this.ee[i13] = new org.necrotic.client.f.e(a4, "scrollpart", i13);
            }
            for (int i14 = 0; i14 < 6; i14++) {
                this.ed[i14] = new org.necrotic.client.f.e(a4, "scrollbar", i14);
            }
            for (int i15 = 0; i15 < this.N.length; i15++) {
                this.N[i15] = D.a(i15 + 827);
            }
            this.N[15] = D.a(1509);
            this.N[16] = D.a(1508);
            this.iH = D.a(1025);
            this.iI = D.a(1025);
            org.necrotic.client.f.e eVar2 = new org.necrotic.client.f.e(a4, "screenframe", 0);
            this.ik = new org.necrotic.client.f.d(eVar2.d, eVar2.e, j());
            eVar2.h();
            org.necrotic.client.f.e eVar3 = new org.necrotic.client.f.e(a4, "screenframe", 1);
            this.jf = new org.necrotic.client.f.d(eVar3.d, eVar3.e, j());
            eVar3.h();
            org.necrotic.client.f.e eVar4 = new org.necrotic.client.f.e(a4, "screenframe", 2);
            this.iP = new org.necrotic.client.f.d(eVar4.d, eVar4.e, j());
            eVar4.h();
            org.necrotic.client.f.e eVar5 = new org.necrotic.client.f.e(a4, "mapedge", 0);
            new org.necrotic.client.f.d(eVar5.d, eVar5.e, j());
            eVar5.h();
            this.ax = new org.necrotic.client.f.e(a4, "compass", 0);
            this.fx = ae.h;
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
            org.necrotic.client.c.a.i.d = dd;
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
                                this.J[i16].a(g2.length, g2, parseInt);
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
            if (!df) {
                org.necrotic.client.n.b.p.a(new org.necrotic.client.g.a(a6.a("sounds.dat")));
            }
            ?? r0 = {this.bv, this.bi, this.as, this.at};
            try {
                org.necrotic.client.f.a.a[] aVarArr = {this.be, this.bf, this.bg};
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
                            if (this.is.c[i21 + (i18 * this.is.e)] == 0) {
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
                this.G[i18] = i19;
                this.H[i18] = i20 - i19;
            }
            for (int i22 = 5; i22 < 156; i22++) {
                int i23 = 999;
                int i24 = 0;
                int i25 = 20;
                while (true) {
                    if (i25 >= 172) {
                        break;
                    }
                    if (this.is.c[i25 + (i22 * this.is.e)] == 0 && (i25 > 34 || i22 > 34)) {
                        if (i23 == 999) {
                            i23 = i25;
                        }
                    } else if (i23 != 999) {
                        i24 = i25;
                        break;
                    }
                    i25++;
                }
                this.K[i22 - 5] = i23 - 20;
                this.L[i22 - 5] = i24 - i23;
                if (this.L[i22 - 5] == -20) {
                    this.L[i22 - 5] = 152;
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
                            B = jsonObject.get("username").getAsString();
                        }
                        if (jsonObject.has("password")) {
                            q.bK = jsonObject.get("password").getAsString();
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
                            org.necrotic.client.d.a.f199a = jsonObject.get("gameframe").getAsBoolean() ? a.EnumC0025a.FRAME_554 : a.EnumC0025a.FRAME_525;
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
                            client.P = jsonObject.get("split-chat-color").getAsInt();
                        }
                        if (jsonObject.has("clan-chat-color")) {
                            client.P = jsonObject.get("clan-chat-color").getAsInt();
                        }
                        if (jsonObject.has("split-chat")) {
                            int[] iArr3 = client.bM;
                            int[] iArr4 = client.bM;
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
                                client.bH[i26] = Integer.parseInt(asString.substring(i27, i27 + 1));
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
                                client.bI[i28] = Integer.parseInt(asString2.substring(i29, i29 + 1));
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
                this.ka = org.necrotic.client.k.a.a();
            } catch (Exception unused9) {
            }
            cv = l.a();
            this.jD = false;
            if (org.necrotic.a.n) {
                super.a(org.necrotic.client.f.b.CURSOR_0);
            }
        } catch (Exception e2) {
            this.jD = false;
            e2.printStackTrace();
            ae.a("loaderror " + this.gr);
            this.il = true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: ?: MOVE  (r2 I:??) = (r3 I:??), block:B:23:0x006e */
    private void ax() {
        int i2;
        String str = null;
        for (int i3 = 0; i3 < 100; i3++) {
            if (this.ao[i3] != null && ((i2 = this.au[i3]) == 3 || i2 == 7)) {
                str = this.ap[i3];
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
            E = true;
            this.aH = 0;
            this.aY = true;
            this.bs = "";
            this.hX = 3;
            this.ge = b2;
            this.bt = "Enter message to send to " + org.necrotic.client.f.a.b.a(org.necrotic.client.f.a.b.a(b2));
        }
    }

    private void ay() {
        this.ia = org.necrotic.client.f.b.a.j() ? 512 : s();
        this.ib = org.necrotic.client.f.b.a.j() ? 334 : t();
        if (this.aF == null || this.aF.f221a != this.ia || this.aF.b != this.ib) {
            this.aF = new org.necrotic.client.f.d(this.ia, this.ib, j());
        }
        aB();
    }

    private void d(boolean z2) {
        if (z2) {
            this.jz = true;
            (aJ ? this.aF : this.jb).a();
            return;
        }
        this.jz = false;
        (aJ ? this.aF : this.jb).a(cl.getGraphics(), org.necrotic.client.f.b.a.j() ? 4 : this.eX, this.eY);
    }

    private void a(a.EnumC0026a enumC0026a) {
        if (this.cc) {
            org.necrotic.client.f.b.a.a(enumC0026a);
            if (enumC0026a == a.EnumC0026a.FIXED) {
                l(652, 0);
                this.eX = 4;
                this.eY = 4;
            } else if (enumC0026a == a.EnumC0026a.RESIZABLE) {
                l(652, 2);
                this.eX = 0;
                this.eY = 0;
            } else {
                l(652, 1);
                this.eX = 0;
                this.eY = 0;
            }
        } else if (org.necrotic.client.f.b.a.a() != enumC0026a) {
            d(true);
            super.h(0);
            if (enumC0026a == a.EnumC0026a.FIXED) {
                org.necrotic.client.f.b.a.a(enumC0026a);
                this.eX = 4;
                this.eY = 4;
                this.cd = Constants.GAME_FIXED_WIDTH;
                this.ce = Constants.GAME_FIXED_HEIGHT;
                p = Constants.GAME_FIXED_WIDTH;
                o = Constants.GAME_FIXED_HEIGHT;
                l(652, 0);
                b(false, Constants.GAME_FIXED_WIDTH, Constants.GAME_FIXED_HEIGHT, false);
                this.jk = true;
                e = 0;
            } else if (enumC0026a == a.EnumC0026a.RESIZABLE) {
                org.necrotic.client.f.b.a.a(enumC0026a);
                this.eX = 0;
                this.eY = 0;
                this.ce = -1;
                this.cd = -1;
                l(652, 2);
                b(false, 800, Constants.GAME_TICK_LENGTH, true);
                e = 480;
            } else {
                org.necrotic.client.f.b.a.a(a.EnumC0026a.FULLSCREEN);
                this.eX = 0;
                this.eY = 0;
                l(652, 1);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                p = screenSize.width;
                o = screenSize.height;
                b(true, screenSize.width, screenSize.height, false);
                this.ce = -1;
                this.cd = -1;
                bZ = screenSize.width;
                bY = screenSize.height;
                e = 480;
            }
            if (enumC0026a == a.EnumC0026a.FIXED) {
                E = true;
            }
            if (!aJ) {
                ar();
            } else {
                as();
            }
            this.bL.a(false);
            this.bx.a(false);
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
        org.necrotic.client.c.a.m.f191a.a();
        p.f265a.clear();
        org.necrotic.client.c.a.k.z.clear();
        org.necrotic.client.c.a.i.h.clear();
        org.necrotic.client.c.a.j.f.clear();
        D.a();
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
            int i4 = this.bM[i2];
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
                this.jk = true;
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
                if (i5 != this.iJ) {
                    if (this.iJ != 0 || this.hO == -1) {
                        if (i5 != 0) {
                            l(i5);
                        } else {
                            B();
                            this.iO = 0;
                        }
                    } else {
                        j(i5, this.hO);
                        this.iO = 0;
                    }
                    this.iJ = i5;
                }
            } else if (i3 == 4) {
                if (i4 == 0) {
                    dk = 127;
                } else if (i4 == 1) {
                    dk = 96;
                } else if (i4 == 2) {
                    dk = 64;
                } else if (i4 == 3) {
                    dk = 32;
                } else if (i4 == 4) {
                    dk = 0;
                }
            } else if (i3 == 5) {
                this.gK = i4;
            } else if (i3 == 6) {
                this.gI = i4;
            } else if (i3 == 7) {
                this.iR = !this.iR;
                this.ea.b.a(this.iR);
            } else if (i3 == 8) {
                this.bw = i4;
                E = true;
            } else if (i3 == 9) {
                this.gZ = i4;
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
        for (int i6 = -1; i6 < this.bp + this.bk; i6++) {
            try {
                if (i6 == -1) {
                    bVar = t;
                } else if (i6 < this.bp) {
                    bVar = this.bo[this.bq[i6]];
                } else {
                    bVar = this.bj[this.bl[i6 - this.bp]];
                }
                if (bVar != null && ((org.necrotic.client.j.c) bVar).d()) {
                    if (bVar instanceof org.necrotic.client.j.e) {
                        org.necrotic.client.c.a.j jVar = ((org.necrotic.client.j.e) bVar).c;
                        a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av + 5);
                        if (this.iX >= 0) {
                            if (jVar.w == 6537) {
                                D.a(607).e(this.iX - 12, this.iY - 30);
                            }
                            if (jVar.w == 8000 || jVar.w == 8002) {
                                D.a(134).e(this.iX - 12, this.iY - 30);
                            }
                            if (jVar.w == 13738) {
                                D.a(1419).e(this.iX - 12, this.iY - 30);
                            }
                            if (jVar.w == 1086) {
                                D.a(638).e(this.iX - 12, this.iY - 40);
                            }
                            if (jVar.w == 1085) {
                                D.a(641).e(this.iX - 12, this.iY - 40);
                            }
                            if (jVar.w == 1084) {
                                D.a(625).e(this.iX - 12, this.iY - 40);
                            }
                            if (jVar.w == 3777) {
                                D.a(857).e(this.iX - 4, this.iY - 16);
                            }
                            if (jVar.w == 585) {
                                D.a(915).e(this.iX - 4, this.iY - 32);
                            }
                            if (jVar.w == 688) {
                                D.a(916).e(this.iX - 4, this.iY - 32);
                            }
                            if (jVar.w == 125) {
                                D.a(917).e(this.iX - 4, this.iY - 32);
                            }
                            if (jVar.w == 1821) {
                                D.a(869).e(this.iX - 4, this.iY - 5);
                            }
                            if (jVar.w == 925 || jVar.w == 1988) {
                                D.a(853).e(this.iX - 4, this.iY - 16);
                            }
                            if (jVar.w == 198) {
                                D.a(856).e(this.iX - 4, this.iY - 16);
                            }
                            if (jVar.w == 3306) {
                                D.a(876).e(this.iX - 4, this.iY - 16);
                            }
                            if (jVar.w == 4651) {
                                D.a(868).e(this.iX - 4, this.iY - 16);
                            }
                            if (jVar.w == 6692) {
                                D.a(364).e(this.iX - 12, this.iY - 30);
                            }
                            if (jVar.w == 3112) {
                                D.a(1229).e(this.iX - 12, this.iY - 30);
                            }
                            if (jVar.w == 605) {
                                D.a(866).e(this.iX - 4, this.iY - 16);
                            }
                            if (jVar.w == 2579) {
                                D.a(838).e(this.iX - 4, this.iY - 16);
                            }
                            if (jVar.w == 547) {
                                D.a(870).e(this.iX - 4, this.iY - 16);
                            }
                        }
                        if (jVar.k != null) {
                            jVar = jVar.c();
                        }
                        if (jVar == null) {
                        }
                    }
                    if (i6 < this.bp) {
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
                            if (this.iX >= 0) {
                                if (aVar.C) {
                                    int i9 = i7 + 2;
                                    this.iU[0].e(this.iX - 12, this.iY - i9);
                                    i7 = i9 + 19;
                                }
                                if (aVar.B >= 0 && aVar.B <= 4) {
                                    D.a(1026 + aVar.B).e(this.iX - (aVar.C ? 8 : 10), this.iY - i7);
                                    i7 += 28;
                                }
                                if (aVar.x < 20) {
                                    this.id[aVar.x].e(this.iX - 12, this.iY - i7);
                                    i7 += 29;
                                }
                                i8 = i2;
                                if (org.necrotic.a.f) {
                                    if (aVar.D > 0 && aVar.D <= 2 && a(aVar).startsWith("<col")) {
                                        i8 = 1441536;
                                        this.be.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iX, this.iY - 10, 1441536, 0);
                                    } else if (aVar.D > 0 && aVar.D <= 2) {
                                        i8 = 1441536;
                                        this.be.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iX + 20, this.iY - 10, 1441536, 0);
                                    } else if (aVar.D == 10) {
                                        i8 = 1441536;
                                        this.be.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iX + 10, this.iY - 10, 1441536, 0);
                                    } else if (aVar.D == 6 || aVar.D == 8 || aVar.D == 9) {
                                        i8 = 1441536;
                                        this.be.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iX + 10, this.iY - 10, 1441536, 0);
                                    } else if (aVar.D == 7) {
                                        i8 = 1441536;
                                        this.be.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iX + 85, this.iY - 10, 1441536, 0);
                                    } else if (aVar.D >= 3 && aVar.D <= 4) {
                                        i8 = 1441536;
                                        this.be.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iX + 250, this.iY - 10, 1441536, 0);
                                    } else if (aVar.D == 5) {
                                        i8 = 1441536;
                                        this.be.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iX + 120, this.iY - 10, 1441536, 0);
                                    } else if (aVar.D >= 13) {
                                        i8 = 1441536;
                                        this.be.a(aVar.y != null ? a(aVar) + aVar.y : "null username", this.iX, this.iY - 10, 1441536, 0);
                                    } else {
                                        i8 = 1441536;
                                        this.be.a(aVar.y != null ? aVar.y : "null username", this.iX, this.iY - 10, 1441536, 0);
                                    }
                                }
                            }
                        }
                        if (i6 >= 0 && this.Y == 10 && this.Z == this.bq[i6]) {
                            a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av + 15);
                            if (this.iX >= 0) {
                                this.id[7].e(this.iX - 12, this.iY - i7);
                            }
                        }
                        i3 = i8;
                    } else {
                        org.necrotic.client.c.a.j jVar2 = ((org.necrotic.client.j.e) bVar).c;
                        if (jVar2.q >= 0 && jVar2.q < this.id.length) {
                            a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av + 15);
                            if (this.iX >= 0) {
                                this.id[jVar2.q].e(this.iX - 12, this.iY - 30);
                            }
                        }
                        i3 = i2;
                        if (this.Y == 1) {
                            i3 = i2;
                            if (this.X == this.bl[i6 - this.bp]) {
                                i3 = i2;
                                if (s % 20 < 10) {
                                    a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av + 15);
                                    i3 = i2;
                                    if (this.iX >= 0) {
                                        this.id[2].e(this.iX - 12, this.iY - 28);
                                        i3 = i2;
                                    }
                                }
                            }
                        }
                    }
                    if (((org.necrotic.client.j.c) bVar).aH != null && (i6 >= this.bp || this.bu == 0 || this.bu == 3 || (this.bu == 1 && e(((org.necrotic.client.e.a.a) bVar).y)))) {
                        a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av);
                        if (this.iX >= 0 && i5 < this.dF) {
                            this.dR[i5] = this.as.b(((org.necrotic.client.j.c) bVar).aH) / 2;
                            this.dQ[i5] = this.as.c;
                            this.dO[i5] = this.iX;
                            this.dP[i5] = this.iY;
                            this.dS[i5] = ((org.necrotic.client.j.c) bVar).Q;
                            this.dT[i5] = ((org.necrotic.client.j.c) bVar).ac;
                            this.dU[i5] = ((org.necrotic.client.j.c) bVar).aG;
                            int i10 = i5;
                            i5++;
                            this.dW[i10] = ((org.necrotic.client.j.c) bVar).aH;
                            if (this.gI == 0 && ((org.necrotic.client.j.c) bVar).ac > 0 && ((org.necrotic.client.j.c) bVar).ac <= 3) {
                                int[] iArr = this.dQ;
                                iArr[i5] = iArr[i5] + 10;
                                int[] iArr2 = this.dP;
                                iArr2[i5] = iArr2[i5] + 5;
                            }
                            if (this.gI == 0 && ((org.necrotic.client.j.c) bVar).ac == 4) {
                                this.dR[i5] = 60;
                            }
                            if (this.gI == 0 && ((org.necrotic.client.j.c) bVar).ac == 5) {
                                int[] iArr3 = this.dQ;
                                iArr3[i5] = iArr3[i5] + 5;
                            }
                        }
                    }
                    int i11 = i3;
                    if (((org.necrotic.client.j.c) bVar).aA > s) {
                        try {
                            a((org.necrotic.client.j.c) bVar, ((org.necrotic.client.j.c) bVar).av + 15);
                            int i12 = i3;
                            if (this.iX >= 0) {
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
                                        D.a(349).e(this.iX - 44, this.iY - 5);
                                        i4 = 7;
                                        new org.necrotic.client.f.e(D.b(397), (int) Math.min(d2, 56.0d), 7).e(this.iX - 44, this.iY - 5);
                                    } else {
                                        D.a(349).e(this.iX - 28, this.iY - 5);
                                        i4 = 7;
                                        new org.necrotic.client.f.e(D.b(348), (int) Math.min(d2, 56.0d), 7).e(this.iX - 28, this.iY - 5);
                                    }
                                } else {
                                    long j10 = (((org.necrotic.client.j.c) bVar).au * 30) / ((org.necrotic.client.j.c) bVar).aB;
                                    long j11 = i3 == 1 ? 1 : 0;
                                    if (j10 > 30) {
                                        j11 = 30;
                                    }
                                    org.necrotic.client.f.c.b(5, this.iY - 3, this.iX - 12, 65280, (int) j11);
                                    int i13 = (int) (30 - j11);
                                    org.necrotic.client.f.c.b(5, this.iY - 3, (int) ((this.iX - 12) + j11), 16711680, i13);
                                    i4 = i13;
                                }
                                i12 = i4;
                                if (org.necrotic.a.e) {
                                    i12 = i4;
                                    if (bVar instanceof org.necrotic.client.e.a.a) {
                                        org.necrotic.client.j.e eVar = (org.necrotic.client.j.c) bVar;
                                        double d3 = eVar.au;
                                        double d4 = eVar.aB;
                                        int F = F((int) Math.round((int) ((d3 / d4) * 100.0d)));
                                        this.bf.a(((int) d3) + "/" + ((int) d4), this.iX, this.iY - 22, F, 0);
                                        i12 = F;
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
                                a(this.iX, this.iY, i14, (org.necrotic.client.j.c) i2);
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
            int i20 = this.dO[i19];
            int i21 = this.dP[i19];
            int i22 = this.dR[i19];
            int i23 = this.dQ[i19];
            for (boolean z3 = true; z3; z3 = z2) {
                z2 = false;
                int i24 = 0;
                while (i24 < i19) {
                    if (i21 + 2 > this.dP[i24] - this.dQ[i24] && i21 - i23 < this.dP[i24] + 2 && i20 - i22 < this.dO[i24] + this.dR[i24] && i20 + i22 > this.dO[i24] - this.dR[i24] && this.dP[i24] - this.dQ[i24] < i21) {
                        i21 = this.dP[i24] - this.dQ[i24];
                        z2 = true;
                    }
                    i24++;
                    z2 = z2;
                }
            }
            this.iX = this.dO[i19];
            int i25 = i21;
            this.dP[i19] = i25;
            this.iY = i25;
            String str = this.dW[i19];
            if (this.gI == 0) {
                int i26 = 16776960;
                if (this.dS[i19] < 6) {
                    i26 = this.dN[this.dS[i19]];
                }
                if (this.dS[i19] == 6) {
                    i26 = this.gM % 20 >= 10 ? 16776960 : 16711680;
                }
                if (this.dS[i19] == 7) {
                    i26 = this.gM % 20 >= 10 ? 65535 : ColorUtil.MAX_RGB_VALUE;
                }
                if (this.dS[i19] == 8) {
                    i26 = this.gM % 20 >= 10 ? 8454016 : 45056;
                }
                if (this.dS[i19] == 9) {
                    int i27 = 150 - this.dU[i19];
                    if (i27 < 50) {
                        i26 = 16711680 + (i27 * 1280);
                    } else if (i27 < 100) {
                        i26 = 16776960 - (327680 * (i27 - 50));
                    } else if (i27 < 150) {
                        i26 = 65280 + (5 * (i27 - 100));
                    }
                }
                if (this.dS[i19] == 10) {
                    int i28 = 150 - this.dU[i19];
                    if (i28 < 50) {
                        i26 = 16711680 + (5 * i28);
                    } else if (i28 < 100) {
                        i26 = 16711935 - (327680 * (i28 - 50));
                    } else if (i28 < 150) {
                        i26 = (ColorUtil.MAX_RGB_VALUE + (327680 * (i28 - 100))) - (5 * (i28 - 100));
                    }
                }
                if (this.dS[i19] == 11) {
                    int i29 = 150 - this.dU[i19];
                    if (i29 < 50) {
                        i26 = 16777215 - (i29 * 327685);
                    } else if (i29 < 100) {
                        i26 = 65280 + (327685 * (i29 - 50));
                    } else if (i29 < 150) {
                        i26 = 16777215 - (327680 * (i29 - 100));
                    }
                }
                if (this.dT[i19] == 0) {
                    this.as.a(0, str, this.iY + 1, this.iX + 1);
                    this.as.a(i26, str, this.iY, this.iX);
                }
                if (this.dT[i19] == 1) {
                    this.as.b(0, str, this.iX + 1, this.gM, this.iY + 1);
                    this.as.b(i26, str, this.iX, this.gM, this.iY);
                }
                if (this.dT[i19] == 2) {
                    this.as.c(this.iX + 1, str, this.gM, this.iY + 1, 0);
                    this.as.c(this.iX, str, this.gM, this.iY, i26);
                }
                if (this.dT[i19] == 3) {
                    this.as.a(150 - this.dU[i19], str, this.gM, this.iY + 1, this.iX + 1, 0);
                    this.as.a(150 - this.dU[i19], str, this.gM, this.iY, this.iX, i26);
                }
                if (this.dT[i19] == 4) {
                    int b2 = ((150 - this.dU[i19]) * (this.as.b(str) + 100)) / 150;
                    org.necrotic.client.f.c.e(this.iX - 50, 0, this.iX + 50, 334);
                    this.as.b(0, str, this.iY + 1, (this.iX + 51) - b2);
                    this.as.b(i26, str, this.iY, (this.iX + 50) - b2);
                    org.necrotic.client.f.c.d();
                }
                if (this.dT[i19] == 5) {
                    int i30 = 150 - this.dU[i19];
                    int i31 = 0;
                    if (i30 < 25) {
                        i31 = i30 - 25;
                    } else if (i30 > 125) {
                        i31 = i30 - 125;
                    }
                    org.necrotic.client.f.c.e(0, (this.iY - this.as.c) - 1, 512, this.iY + 5);
                    this.as.a(0, str, this.iY + 1 + i31, this.iX + 1);
                    this.as.a(i26, str, this.iY + i31, this.iX);
                    org.necrotic.client.f.c.d();
                }
            } else {
                this.as.a(0, str, this.iY + 1, this.iX + 1);
                this.as.a(16776960, str, this.iY, this.iX);
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
            this.hZ = org.necrotic.client.n.l.B;
            org.necrotic.client.n.l.c((org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED && this.ic) ? this.an != null ? this.an.f221a : 519 : s(), (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED && this.ic) ? this.an != null ? this.an.b : 165 : t());
            this.ae = org.necrotic.client.n.l.B;
            org.necrotic.client.n.l.c((org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED && this.ic) ? this.by != null ? this.by.f221a : 346 : s(), (org.necrotic.client.f.b.a.a() == a.EnumC0026a.FIXED && this.ic) ? this.by != null ? this.by.b : 335 : t());
            this.af = org.necrotic.client.n.l.B;
            org.necrotic.client.n.l.c(this.ia, this.ib);
            this.ag = org.necrotic.client.n.l.B;
            int[] iArr = new int[9];
            for (int i2 = 0; i2 < 9; i2++) {
                int i3 = 128 + (i2 << 5) + 15;
                iArr[i2] = ((Constants.GAME_TICK_LENGTH + (i3 * 3)) * org.necrotic.client.n.l.e[i3]) >> 16;
            }
            org.necrotic.client.n.m.a(!aJ ? s() : this.ia, !aJ ? t() : this.ib, iArr);
            if (aJ) {
                this.aF = new org.necrotic.client.f.d(this.ia, this.ib, j());
            } else {
                this.jb = new org.necrotic.client.f.d(s(), t(), j());
            }
        } catch (Exception unused) {
            printStackTrace.printStackTrace();
        }
    }

    private void c(org.necrotic.client.g.a aVar, int i2) {
        this.gV = 0;
        this.gX = 0;
        c(aVar);
        a(i2, aVar);
        e(aVar);
        for (int i3 = 0; i3 < this.gV; i3++) {
            int i4 = this.hn[i3];
            if (this.bj[i4].ad != s) {
                this.bj[i4].c = null;
                this.bj[i4] = null;
            }
        }
        if (aVar.f != i2) {
            ae.a(B + " size mismatch in getnpcpos - pos:" + aVar.f + " psize:" + i2);
            throw new RuntimeException("eek");
        }
        for (int i5 = 0; i5 < this.bk; i5++) {
            if (this.bj[this.bl[i5]] == null) {
                ae.a(B + " null entry in npc list - pos:" + i5 + " size:" + this.bk);
                throw new RuntimeException("eek");
            }
        }
    }

    private void b(int i2, org.necrotic.client.g.a aVar) {
        this.gV = 0;
        this.gX = 0;
        a(aVar);
        b(aVar);
        b(aVar, i2);
        d(aVar);
        for (int i3 = 0; i3 < this.gV; i3++) {
            int i4 = this.hn[i3];
            if (this.bo[i4].ad != s) {
                this.bo[i4] = null;
            }
        }
        if (aVar.f != i2) {
            ae.a("Error packet size mismatch in getplayer pos:" + aVar.f + " psize:" + i2);
            throw new RuntimeException("eek");
        }
        for (int i5 = 0; i5 < this.bp; i5++) {
            if (this.bo[this.bq[i5]] == null) {
                ae.a(B + " null entry in pl list - pos:" + i5 + " size:" + this.bp);
                throw new RuntimeException("eek");
            }
        }
    }

    public final void o() {
        boolean z2;
        if (System.currentTimeMillis() - this.jr > 60000) {
            this.jr = System.currentTimeMillis();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.gE += 25;
        }
    }

    private void aC() {
        int i2 = -1;
        if (this.bJ == 5608) {
            if (aD() > 0) {
                if (!this.ea.f209a.c()) {
                    int i3 = 0;
                    while (i3 < this.bH.length) {
                        int i4 = i3 == 26 ? 25104 : i3 == 27 ? 25108 : (i3 << 1) + 25000;
                        aa aaVar = aa.u[i4];
                        if (aaVar.aN != null && aaVar.aN[0][0] == 5) {
                            int i5 = aaVar.aN[0][1];
                            if (this.bM[i5] == 0 && this.bH[i3] == 1) {
                                dj.i(195);
                                dj.h(i4);
                                this.ea.f209a.a(true);
                            } else if (this.bH[i3] == 1 && this.bM[i5] == 1) {
                                this.ea.f209a.a(true);
                            }
                        }
                        i3++;
                    }
                    return;
                }
                aF();
                this.ea.f209a.a(false);
                return;
            }
            if (this.ea.f209a.c()) {
                aF();
            } else {
                a("You don't have any quick prayers selected.", 0, "");
                a("Right-click the Prayer button next to the minimap to select some.", 0, "");
            }
            this.ea.f209a.a(false);
        } else if (this.bJ == 32500) {
            if (aE() > 0) {
                if (!this.ea.f209a.c()) {
                    for (int i6 = 0; i6 < this.bI.length; i6++) {
                        int i7 = (i6 << 1) + 32500 + 3;
                        aa aaVar2 = aa.u[i7];
                        if (aaVar2.aN != null && aaVar2.aN[0][0] == 5) {
                            i2 = aaVar2.aN[0][1];
                            if (this.bM[i2] == 0 && this.bI[i6] == 1) {
                                dj.i(195);
                                dj.h(i7);
                                this.ea.f209a.a(true);
                            }
                        } else if (this.bI[i6] == 1 && this.bM[i2] == 1) {
                            this.ea.f209a.a(true);
                        }
                    }
                    return;
                }
                aG();
                this.ea.f209a.a(false);
            } else if (this.ea.f209a.c()) {
                aG();
                this.ea.f209a.a(false);
            } else {
                a("You don't have any quick curses selected.", 0, "");
                a("Right-click the Curses button next to the minimap to select some.", 0, "");
            }
        }
    }

    private int aD() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.bH.length; i3++) {
            if (this.bH[i3] == 1) {
                i2++;
            }
        }
        return i2;
    }

    private int aE() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.bI.length; i3++) {
            if (this.bI[i3] == 1) {
                i2++;
            }
        }
        return i2;
    }

    private int[] G(int i2) {
        int[] iArr = null;
        for (int i3 = 0; i3 < this.jM.length; i3++) {
            if (i2 == this.jM[i3]) {
                iArr = this.jL;
            }
        }
        for (int i4 = 0; i4 < this.jL.length; i4++) {
            if (i2 == this.jL[i4]) {
                iArr = this.jM;
            }
        }
        for (int i5 = 0; i5 < this.jN.length; i5++) {
            if (i2 == this.jN[i5]) {
                iArr = this.jN;
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
        if (this.bJ == 5608) {
            if (this.M[5] / 10 >= this.dy[i3]) {
                int[] I = I(i3);
                int[] iArr = I;
                if (I != null) {
                    for (int i4 = 0; i4 < this.jE.length; i4++) {
                        if (i3 == this.jE[i4]) {
                            iArr = this.jH;
                        }
                    }
                    for (int i5 = 0; i5 < iArr.length; i5++) {
                        if (i3 != iArr[i5]) {
                            if (i3 == 24 || i3 == 25) {
                                iArr = this.jJ;
                            }
                            this.bH[iArr[i5]] = 0;
                            this.bM[this.fc[iArr[i5]]] = 0;
                            E(this.fc[iArr[i5]]);
                            if (this.aA != -1) {
                                E = true;
                            }
                        } else {
                            int[] iArr2 = this.bH;
                            iArr2[i3] = (iArr2[i3] + 1) % 2;
                            this.bM[this.fc[i3]] = this.bH[i3];
                            E(this.fc[i3]);
                            if (this.aA != -1) {
                                E = true;
                            }
                        }
                    }
                    return;
                }
                int[] iArr3 = this.bH;
                iArr3[i3] = (iArr3[i3] + 1) % 2;
                this.bM[this.fc[i3]] = this.bH[i3];
                E(this.fc[i3]);
                if (this.aA != -1) {
                    E = true;
                    return;
                }
                return;
            }
            a("You need a Prayer level of atleast " + this.dy[i3] + " to use " + this.dz[i3] + ".", 0, "");
        } else if (this.bJ == 32500) {
            if (this.M[5] / 10 >= this.dw[i3]) {
                int[] G = G(i3);
                if (G != null) {
                    for (int i6 = 0; i6 < G.length; i6++) {
                        if (i3 != G[i6]) {
                            this.bI[G[i6]] = 0;
                            this.bM[this.fc[G[i6]]] = 0;
                            E(this.fc[G[i6]]);
                            if (this.aA != -1) {
                                E = true;
                            }
                        }
                    }
                }
                int[] iArr4 = this.bI;
                iArr4[i3] = (iArr4[i3] + 1) % 2;
                this.bM[this.fc[i3]] = this.bI[i3];
                E(this.fc[i3]);
                if (this.aA != -1) {
                    E = true;
                    return;
                }
                return;
            }
            a("You need a Prayer level of atleast " + this.dw[i3] + " to use " + this.dx[i3] + ".", 0, "");
        }
    }

    private void aF() {
        int i2 = 0;
        while (i2 < this.bH.length) {
            int i3 = i2 == 26 ? 25104 : i2 == 27 ? 25108 : (i2 << 1) + 25000;
            aa aaVar = aa.u[i3];
            if (aaVar.aN != null && aaVar.aN[0][0] == 5) {
                if (this.bM[aaVar.aN[0][1]] == 1 && this.bH[i2] == 1) {
                    dj.i(195);
                    dj.h(i3);
                }
            }
            i2++;
        }
    }

    private void aG() {
        for (int i2 = 0; i2 < this.bI.length; i2++) {
            aa aaVar = aa.u[(i2 << 1) + 32503];
            if (aaVar.aN != null && aaVar.aN[0][0] == 5) {
                if (this.bM[aaVar.aN[0][1]] == 1 && this.bI[i2] == 1) {
                    dj.i(195);
                    dj.h((i2 << 1) + 32503);
                }
            }
        }
    }

    private int[] I(int i2) {
        int[] iArr = null;
        for (int i3 = 0; i3 < this.jK.length; i3++) {
            for (int i4 = 0; i4 < this.jK[i3].length; i4++) {
                if (i2 == this.jK[i3][i4]) {
                    iArr = this.jK[i3];
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
        if (this.bJ == 5608) {
            c[5] = 17200;
            cu = true;
        } else if (this.bJ == 32500) {
            c[5] = 17234;
            cu = true;
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
            this.bg.a(((int) d2) + "%/100%", 10 + (i2 / 2), i5 + 13, 16777215, 0);
        } else {
            this.bg.a(j2 + "/" + j3, 10 + (i2 / 2), i5 + 13, 16777215, 0);
        }
    }

    private org.necrotic.client.h.a aJ() {
        return this.hH;
    }

    private org.necrotic.client.g.a aK() {
        return this.ig;
    }

    private org.necrotic.client.g.b aL() {
        return this.hI;
    }

    private void J(int i2) {
        this.gY = i2;
    }

    private org.necrotic.client.c.b.a aM() {
        return this.fZ;
    }

    private int aN() {
        return this.eb;
    }

    public final org.necrotic.client.f.c.i p() {
        return this.eZ;
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
        return cl;
    }

    private static void n(int i2, int i3) {
        String str = "::tele " + i2 + " " + i3;
        dj.i(231);
        dj.l(str.length() - 1);
        dj.a(str.substring(2));
    }

    private void a(org.necrotic.client.c.a.i iVar) {
        String str;
        String str2;
        String str3 = "";
        if (this.jT > 0 && iVar != null && w.f271a.length > this.jT) {
            if (iVar.j != null) {
                str3 = iVar.j[1] == null ? "" : iVar.j[1];
            }
            aa.u[94002].an = " @lre@" + org.necrotic.client.f.a.a.b(iVar.G);
            if (w.f271a[this.jT] != null) {
                if (w.f271a[this.jT].i != 1) {
                    if (w.f271a[this.jT].i != 2) {
                        if (w.f271a[this.jT].i == 3) {
                            aa.a(aa.u[94089], w.f271a[this.jT].j);
                            aa.u[94087].an = w.f271a[this.jT].k;
                            return;
                        }
                        return;
                    }
                    aa.u[94021].aa = 28;
                    int c2 = this.be.c(iVar.G) + this.be.c(str3) + 8;
                    int i2 = c2;
                    if (c2 < 58) {
                        i2 = 58;
                    }
                    aa.u[94021].aO = i2;
                    aa.u[94020].V[1] = 8 + (i2 / 2);
                    aa.u[94020].V[2] = 8 + (i2 / 2);
                    aa.u[94022].an = "@whi@Heals: @gre@" + w.f271a[this.jT].h;
                    aa.u[94022].T = true;
                    return;
                }
                aa.u[94006].an = "";
                for (int i3 = 0; i3 < 5; i3++) {
                    if (w.f271a[this.jT].b[i3] > 0) {
                        str2 = "+";
                    } else {
                        str2 = "";
                    }
                    String str4 = str2;
                    StringBuilder sb = new StringBuilder();
                    aa aaVar = aa.u[94006];
                    aaVar.an = sb.append(aaVar.an).append("@whi@").append(str4).append(g(w.f271a[this.jT].b[i3])).append("\\n").toString();
                }
                aa.u[94007].an = "";
                for (int i4 = 0; i4 < 5; i4++) {
                    if (w.f271a[this.jT].c[i4] > 0) {
                        str = "+";
                    } else {
                        str = "";
                    }
                    String str5 = str;
                    StringBuilder sb2 = new StringBuilder();
                    aa aaVar2 = aa.u[94007];
                    aaVar2.an = sb2.append(aaVar2.an).append("@whi@").append(str5).append(g(w.f271a[this.jT].c[i4])).append("\\n").toString();
                }
                aa.u[94010].an = "@whi@" + (w.f271a[this.jT].f > 0 ? "+" : "") + g(w.f271a[this.jT].f) + "\\n@whi@" + (w.f271a[this.jT].e > 0 ? "+" : "") + g(w.f271a[this.jT].e) + "\\n@whi@" + (w.f271a[this.jT].d > 0 ? "+" : "") + g(w.f271a[this.jT].d) + "\\n@whi@" + (w.f271a[this.jT].g > 0 ? "+" : "") + g(w.f271a[this.jT].g);
                aa.u[94021].aa = 28;
                aa.u[94021].aO = 145;
                aa.u[94020].V[1] = 80;
                aa.u[94022].an = "@whi@Press @gre@CTRL@whi@ to view stats";
                aa.u[94022].T = false;
                aa.u[94020].V[2] = 10;
                return;
            }
            aa.u[94021].aa = 16;
            aa.u[94021].aO = this.be.c(iVar.G) + this.be.c(str3) + 8;
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
            cF = nVar;
        } catch (Throwable unused) {
            try {
                cF = new org.necrotic.client.n.b.m();
            } catch (Throwable unused2) {
                if (System.getProperty("java.vendor").toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        cF = new org.necrotic.client.n.b.k();
                    } catch (Throwable unused3) {
                        cF = new org.necrotic.client.n.b.i(8000);
                        org.necrotic.client.n.b.e eVar = new org.necrotic.client.n.b.e();
                        a(eVar);
                        return eVar;
                    }
                }
                cF = new org.necrotic.client.n.b.i(8000);
            }
        }
        org.necrotic.client.n.b.e eVar2 = new org.necrotic.client.n.b.e();
        a(eVar2);
        return eVar2;
    }

    private static void D() {
        df = true;
        org.necrotic.a.r = false;
        org.necrotic.a.s = false;
        org.necrotic.a.t = true;
    }

    public final void h() {
        dj.i(170);
        if (this.aI != -1) {
            this.aI = -1;
            this.eu = false;
            cu = true;
        }
        if (this.ai != -1) {
            this.ai = -1;
            E = true;
            this.eu = false;
        }
        u = -1;
        this.hY = -1;
    }

    private void v(int i2) {
        dj.i(195);
        dj.h(i2);
        aa aaVar = aa.u[i2];
        if (aaVar != null && aaVar.aN != null && aaVar.aN[0][0] == 5) {
            int i3 = aaVar.aN[0][1];
            this.bM[i3] = 1 - this.bM[i3];
        }
    }

    private void av() {
        dj.i(231);
        dj.l(z.length() - 1);
        dj.a(z.substring(2));
        z = "";
        this.bs = "";
        this.ih = 0;
    }

    private void aH() {
        org.necrotic.client.a.a.a(q);
        c[5] = this.bJ;
    }
}