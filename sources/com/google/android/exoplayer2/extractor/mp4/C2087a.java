package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.a */
abstract class C2087a {
    /* renamed from: A */
    public static final int f5814A = C2314v.m8499g("sidx");
    /* renamed from: B */
    public static final int f5815B = C2314v.m8499g("moov");
    /* renamed from: C */
    public static final int f5816C = C2314v.m8499g("mvhd");
    /* renamed from: D */
    public static final int f5817D = C2314v.m8499g("trak");
    /* renamed from: E */
    public static final int f5818E = C2314v.m8499g("mdia");
    /* renamed from: F */
    public static final int f5819F = C2314v.m8499g("minf");
    /* renamed from: G */
    public static final int f5820G = C2314v.m8499g("stbl");
    /* renamed from: H */
    public static final int f5821H = C2314v.m8499g("avcC");
    /* renamed from: I */
    public static final int f5822I = C2314v.m8499g("hvcC");
    /* renamed from: J */
    public static final int f5823J = C2314v.m8499g("esds");
    /* renamed from: K */
    public static final int f5824K = C2314v.m8499g("moof");
    /* renamed from: L */
    public static final int f5825L = C2314v.m8499g("traf");
    /* renamed from: M */
    public static final int f5826M = C2314v.m8499g("mvex");
    /* renamed from: N */
    public static final int f5827N = C2314v.m8499g("mehd");
    /* renamed from: O */
    public static final int f5828O = C2314v.m8499g("tkhd");
    /* renamed from: P */
    public static final int f5829P = C2314v.m8499g("edts");
    /* renamed from: Q */
    public static final int f5830Q = C2314v.m8499g("elst");
    /* renamed from: R */
    public static final int f5831R = C2314v.m8499g("mdhd");
    /* renamed from: S */
    public static final int f5832S = C2314v.m8499g("hdlr");
    /* renamed from: T */
    public static final int f5833T = C2314v.m8499g("stsd");
    /* renamed from: U */
    public static final int f5834U = C2314v.m8499g("pssh");
    /* renamed from: V */
    public static final int f5835V = C2314v.m8499g("sinf");
    /* renamed from: W */
    public static final int f5836W = C2314v.m8499g("schm");
    /* renamed from: X */
    public static final int f5837X = C2314v.m8499g("schi");
    /* renamed from: Y */
    public static final int f5838Y = C2314v.m8499g("tenc");
    /* renamed from: Z */
    public static final int f5839Z = C2314v.m8499g("encv");
    /* renamed from: a */
    public static final int f5840a = C2314v.m8499g("ftyp");
    public static final int aA = C2314v.m8499g("udta");
    public static final int aB = C2314v.m8499g(ManagerWebServices.PARAM_META);
    public static final int aC = C2314v.m8499g("ilst");
    public static final int aD = C2314v.m8499g("mean");
    public static final int aE = C2314v.m8499g("name");
    public static final int aF = C2314v.m8499g(ManagerWebServices.FB_DATA);
    public static final int aG = C2314v.m8499g("emsg");
    public static final int aH = C2314v.m8499g("st3d");
    public static final int aI = C2314v.m8499g("sv3d");
    public static final int aJ = C2314v.m8499g("proj");
    public static final int aK = C2314v.m8499g("vp08");
    public static final int aL = C2314v.m8499g("vp09");
    public static final int aM = C2314v.m8499g("vpcC");
    public static final int aN = C2314v.m8499g("camm");
    public static final int aO = C2314v.m8499g("alac");
    public static final int aa = C2314v.m8499g("enca");
    public static final int ab = C2314v.m8499g("frma");
    public static final int ac = C2314v.m8499g("saiz");
    public static final int ad = C2314v.m8499g("saio");
    public static final int ae = C2314v.m8499g("sbgp");
    public static final int af = C2314v.m8499g("sgpd");
    public static final int ag = C2314v.m8499g("uuid");
    public static final int ah = C2314v.m8499g("senc");
    public static final int ai = C2314v.m8499g("pasp");
    public static final int aj = C2314v.m8499g("TTML");
    public static final int ak = C2314v.m8499g("vmhd");
    public static final int al = C2314v.m8499g("mp4v");
    public static final int am = C2314v.m8499g("stts");
    public static final int an = C2314v.m8499g("stss");
    public static final int ao = C2314v.m8499g("ctts");
    public static final int ap = C2314v.m8499g("stsc");
    public static final int aq = C2314v.m8499g("stsz");
    public static final int ar = C2314v.m8499g("stz2");
    public static final int as = C2314v.m8499g("stco");
    public static final int at = C2314v.m8499g("co64");
    public static final int au = C2314v.m8499g("tx3g");
    public static final int av = C2314v.m8499g("wvtt");
    public static final int aw = C2314v.m8499g("stpp");
    public static final int ax = C2314v.m8499g("c608");
    public static final int ay = C2314v.m8499g("samr");
    public static final int az = C2314v.m8499g("sawb");
    /* renamed from: b */
    public static final int f5841b = C2314v.m8499g("avc1");
    /* renamed from: c */
    public static final int f5842c = C2314v.m8499g("avc3");
    /* renamed from: d */
    public static final int f5843d = C2314v.m8499g("hvc1");
    /* renamed from: e */
    public static final int f5844e = C2314v.m8499g("hev1");
    /* renamed from: f */
    public static final int f5845f = C2314v.m8499g("s263");
    /* renamed from: g */
    public static final int f5846g = C2314v.m8499g("d263");
    /* renamed from: h */
    public static final int f5847h = C2314v.m8499g("mdat");
    /* renamed from: i */
    public static final int f5848i = C2314v.m8499g("mp4a");
    /* renamed from: j */
    public static final int f5849j = C2314v.m8499g(".mp3");
    /* renamed from: k */
    public static final int f5850k = C2314v.m8499g("wave");
    /* renamed from: l */
    public static final int f5851l = C2314v.m8499g("lpcm");
    /* renamed from: m */
    public static final int f5852m = C2314v.m8499g("sowt");
    /* renamed from: n */
    public static final int f5853n = C2314v.m8499g("ac-3");
    /* renamed from: o */
    public static final int f5854o = C2314v.m8499g("dac3");
    /* renamed from: p */
    public static final int f5855p = C2314v.m8499g("ec-3");
    /* renamed from: q */
    public static final int f5856q = C2314v.m8499g("dec3");
    /* renamed from: r */
    public static final int f5857r = C2314v.m8499g("dtsc");
    /* renamed from: s */
    public static final int f5858s = C2314v.m8499g("dtsh");
    /* renamed from: t */
    public static final int f5859t = C2314v.m8499g("dtsl");
    /* renamed from: u */
    public static final int f5860u = C2314v.m8499g("dtse");
    /* renamed from: v */
    public static final int f5861v = C2314v.m8499g("ddts");
    /* renamed from: w */
    public static final int f5862w = C2314v.m8499g("tfdt");
    /* renamed from: x */
    public static final int f5863x = C2314v.m8499g("tfhd");
    /* renamed from: y */
    public static final int f5864y = C2314v.m8499g("trex");
    /* renamed from: z */
    public static final int f5865z = C2314v.m8499g("trun");
    public final int aP;

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.a$a */
    static final class C3637a extends C2087a {
        public final long aQ;
        public final List<C3638b> aR = new ArrayList();
        public final List<C3637a> aS = new ArrayList();

        public C3637a(int i, long j) {
            super(i);
            this.aQ = j;
        }

        /* renamed from: a */
        public void m13751a(C3638b c3638b) {
            this.aR.add(c3638b);
        }

        /* renamed from: a */
        public void m13750a(C3637a c3637a) {
            this.aS.add(c3637a);
        }

        /* renamed from: d */
        public C3638b m13752d(int i) {
            int size = this.aR.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3638b c3638b = (C3638b) this.aR.get(i2);
                if (c3638b.aP == i) {
                    return c3638b;
                }
            }
            return 0;
        }

        /* renamed from: e */
        public C3637a m13753e(int i) {
            int size = this.aS.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3637a c3637a = (C3637a) this.aS.get(i2);
                if (c3637a.aP == i) {
                    return c3637a;
                }
            }
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C2087a.m7472c(this.aP));
            stringBuilder.append(" leaves: ");
            stringBuilder.append(Arrays.toString(this.aR.toArray()));
            stringBuilder.append(" containers: ");
            stringBuilder.append(Arrays.toString(this.aS.toArray()));
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.a$b */
    static final class C3638b extends C2087a {
        public final C2302k aQ;

        public C3638b(int i, C2302k c2302k) {
            super(i);
            this.aQ = c2302k;
        }
    }

    /* renamed from: a */
    public static int m7470a(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: b */
    public static int m7471b(int i) {
        return i & 16777215;
    }

    public C2087a(int i) {
        this.aP = i;
    }

    public String toString() {
        return C2087a.m7472c(this.aP);
    }

    /* renamed from: c */
    public static String m7472c(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append((char) ((i >> 24) & 255));
        stringBuilder.append((char) ((i >> 16) & 255));
        stringBuilder.append((char) ((i >> 8) & 255));
        stringBuilder.append((char) (i & 255));
        return stringBuilder.toString();
    }
}
