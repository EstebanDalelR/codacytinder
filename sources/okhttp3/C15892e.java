package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: okhttp3.e */
public final class C15892e {
    /* renamed from: A */
    public static final C15892e f49137A = C15892e.m60067a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    /* renamed from: B */
    public static final C15892e f49138B = C15892e.m60067a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    /* renamed from: C */
    public static final C15892e f49139C = C15892e.m60067a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    /* renamed from: D */
    public static final C15892e f49140D = C15892e.m60067a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    /* renamed from: E */
    public static final C15892e f49141E = C15892e.m60067a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    /* renamed from: F */
    public static final C15892e f49142F = C15892e.m60067a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    /* renamed from: G */
    public static final C15892e f49143G = C15892e.m60067a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    /* renamed from: H */
    public static final C15892e f49144H = C15892e.m60067a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    /* renamed from: I */
    public static final C15892e f49145I = C15892e.m60067a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    /* renamed from: J */
    public static final C15892e f49146J = C15892e.m60067a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    /* renamed from: K */
    public static final C15892e f49147K = C15892e.m60067a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    /* renamed from: L */
    public static final C15892e f49148L = C15892e.m60067a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    /* renamed from: M */
    public static final C15892e f49149M = C15892e.m60067a("TLS_RSA_WITH_NULL_SHA256", 59);
    /* renamed from: N */
    public static final C15892e f49150N = C15892e.m60067a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    /* renamed from: O */
    public static final C15892e f49151O = C15892e.m60067a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    /* renamed from: P */
    public static final C15892e f49152P = C15892e.m60067a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    /* renamed from: Q */
    public static final C15892e f49153Q = C15892e.m60067a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    /* renamed from: R */
    public static final C15892e f49154R = C15892e.m60067a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    /* renamed from: S */
    public static final C15892e f49155S = C15892e.m60067a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    /* renamed from: T */
    public static final C15892e f49156T = C15892e.m60067a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    /* renamed from: U */
    public static final C15892e f49157U = C15892e.m60067a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    /* renamed from: V */
    public static final C15892e f49158V = C15892e.m60067a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    /* renamed from: W */
    public static final C15892e f49159W = C15892e.m60067a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    /* renamed from: X */
    public static final C15892e f49160X = C15892e.m60067a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
    /* renamed from: Y */
    public static final C15892e f49161Y = C15892e.m60067a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
    /* renamed from: Z */
    public static final C15892e f49162Z = C15892e.m60067a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
    /* renamed from: a */
    static final Comparator<String> f49163a = new C158911();
    public static final C15892e aA = C15892e.m60067a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    public static final C15892e aB = C15892e.m60067a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    public static final C15892e aC = C15892e.m60067a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    public static final C15892e aD = C15892e.m60067a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    public static final C15892e aE = C15892e.m60067a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
    public static final C15892e aF = C15892e.m60067a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    public static final C15892e aG = C15892e.m60067a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    public static final C15892e aH = C15892e.m60067a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    public static final C15892e aI = C15892e.m60067a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final C15892e aJ = C15892e.m60067a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final C15892e aK = C15892e.m60067a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    public static final C15892e aL = C15892e.m60067a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    public static final C15892e aM = C15892e.m60067a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    public static final C15892e aN = C15892e.m60067a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    public static final C15892e aO = C15892e.m60067a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    public static final C15892e aP = C15892e.m60067a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    public static final C15892e aQ = C15892e.m60067a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    public static final C15892e aR = C15892e.m60067a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    public static final C15892e aS = C15892e.m60067a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    public static final C15892e aT = C15892e.m60067a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    public static final C15892e aU = C15892e.m60067a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    public static final C15892e aV = C15892e.m60067a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    public static final C15892e aW = C15892e.m60067a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    public static final C15892e aX = C15892e.m60067a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
    public static final C15892e aY = C15892e.m60067a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
    public static final C15892e aZ = C15892e.m60067a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
    public static final C15892e aa = C15892e.m60067a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
    public static final C15892e ab = C15892e.m60067a("TLS_PSK_WITH_RC4_128_SHA", 138);
    public static final C15892e ac = C15892e.m60067a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
    public static final C15892e ad = C15892e.m60067a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
    public static final C15892e ae = C15892e.m60067a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
    public static final C15892e af = C15892e.m60067a("TLS_RSA_WITH_SEED_CBC_SHA", 150);
    public static final C15892e ag = C15892e.m60067a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
    public static final C15892e ah = C15892e.m60067a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
    public static final C15892e ai = C15892e.m60067a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
    public static final C15892e aj = C15892e.m60067a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
    public static final C15892e ak = C15892e.m60067a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
    public static final C15892e al = C15892e.m60067a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
    public static final C15892e am = C15892e.m60067a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
    public static final C15892e an = C15892e.m60067a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
    public static final C15892e ao = C15892e.m60067a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
    public static final C15892e ap = C15892e.m60067a("TLS_FALLBACK_SCSV", 22016);
    public static final C15892e aq = C15892e.m60067a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
    public static final C15892e ar = C15892e.m60067a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
    public static final C15892e as = C15892e.m60067a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
    public static final C15892e at = C15892e.m60067a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
    public static final C15892e au = C15892e.m60067a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
    public static final C15892e av = C15892e.m60067a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
    public static final C15892e aw = C15892e.m60067a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
    public static final C15892e ax = C15892e.m60067a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
    public static final C15892e ay = C15892e.m60067a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    public static final C15892e az = C15892e.m60067a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    /* renamed from: b */
    public static final C15892e f49164b = C15892e.m60067a("SSL_RSA_WITH_NULL_MD5", 1);
    public static final C15892e ba = C15892e.m60067a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
    public static final C15892e bb = C15892e.m60067a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
    public static final C15892e bc = C15892e.m60067a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
    public static final C15892e bd = C15892e.m60067a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
    public static final C15892e be = C15892e.m60067a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
    public static final C15892e bf = C15892e.m60067a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
    public static final C15892e bg = C15892e.m60067a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
    public static final C15892e bh = C15892e.m60067a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
    public static final C15892e bi = C15892e.m60067a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
    private static final Map<String, C15892e> bk = new TreeMap(f49163a);
    /* renamed from: c */
    public static final C15892e f49165c = C15892e.m60067a("SSL_RSA_WITH_NULL_SHA", 2);
    /* renamed from: d */
    public static final C15892e f49166d = C15892e.m60067a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
    /* renamed from: e */
    public static final C15892e f49167e = C15892e.m60067a("SSL_RSA_WITH_RC4_128_MD5", 4);
    /* renamed from: f */
    public static final C15892e f49168f = C15892e.m60067a("SSL_RSA_WITH_RC4_128_SHA", 5);
    /* renamed from: g */
    public static final C15892e f49169g = C15892e.m60067a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
    /* renamed from: h */
    public static final C15892e f49170h = C15892e.m60067a("SSL_RSA_WITH_DES_CBC_SHA", 9);
    /* renamed from: i */
    public static final C15892e f49171i = C15892e.m60067a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
    /* renamed from: j */
    public static final C15892e f49172j = C15892e.m60067a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
    /* renamed from: k */
    public static final C15892e f49173k = C15892e.m60067a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
    /* renamed from: l */
    public static final C15892e f49174l = C15892e.m60067a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
    /* renamed from: m */
    public static final C15892e f49175m = C15892e.m60067a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
    /* renamed from: n */
    public static final C15892e f49176n = C15892e.m60067a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
    /* renamed from: o */
    public static final C15892e f49177o = C15892e.m60067a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
    /* renamed from: p */
    public static final C15892e f49178p = C15892e.m60067a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
    /* renamed from: q */
    public static final C15892e f49179q = C15892e.m60067a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
    /* renamed from: r */
    public static final C15892e f49180r = C15892e.m60067a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
    /* renamed from: s */
    public static final C15892e f49181s = C15892e.m60067a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
    /* renamed from: t */
    public static final C15892e f49182t = C15892e.m60067a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
    /* renamed from: u */
    public static final C15892e f49183u = C15892e.m60067a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
    /* renamed from: v */
    public static final C15892e f49184v = C15892e.m60067a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
    /* renamed from: w */
    public static final C15892e f49185w = C15892e.m60067a("TLS_KRB5_WITH_RC4_128_SHA", 32);
    /* renamed from: x */
    public static final C15892e f49186x = C15892e.m60067a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    /* renamed from: y */
    public static final C15892e f49187y = C15892e.m60067a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    /* renamed from: z */
    public static final C15892e f49188z = C15892e.m60067a("TLS_KRB5_WITH_RC4_128_MD5", 36);
    final String bj;

    /* renamed from: okhttp3.e$1 */
    class C158911 implements Comparator<String> {
        C158911() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m60064a((String) obj, (String) obj2);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public int m60064a(java.lang.String r7, java.lang.String r8) {
            /*
            r6 = this;
            r0 = r7.length();
            r1 = r8.length();
            r0 = java.lang.Math.min(r0, r1);
            r1 = 4;
        L_0x000d:
            r2 = -1;
            r3 = 1;
            if (r1 >= r0) goto L_0x0023;
        L_0x0011:
            r4 = r7.charAt(r1);
            r5 = r8.charAt(r1);
            if (r4 == r5) goto L_0x0020;
        L_0x001b:
            if (r4 >= r5) goto L_0x001e;
        L_0x001d:
            goto L_0x001f;
        L_0x001e:
            r2 = 1;
        L_0x001f:
            return r2;
        L_0x0020:
            r1 = r1 + 1;
            goto L_0x000d;
        L_0x0023:
            r7 = r7.length();
            r8 = r8.length();
            if (r7 == r8) goto L_0x0032;
        L_0x002d:
            if (r7 >= r8) goto L_0x0030;
        L_0x002f:
            goto L_0x0031;
        L_0x0030:
            r2 = 1;
        L_0x0031:
            return r2;
        L_0x0032:
            r7 = 0;
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.e.1.a(java.lang.String, java.lang.String):int");
        }
    }

    /* renamed from: a */
    public static synchronized C15892e m60066a(String str) {
        C15892e c15892e;
        synchronized (C15892e.class) {
            c15892e = (C15892e) bk.get(str);
            if (c15892e == null) {
                c15892e = new C15892e(str);
                bk.put(str, c15892e);
            }
        }
        return c15892e;
    }

    /* renamed from: a */
    static List<C15892e> m60065a(String... strArr) {
        List arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(C15892e.m60066a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private C15892e(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.bj = str;
    }

    /* renamed from: a */
    private static C15892e m60067a(String str, int i) {
        return C15892e.m60066a(str);
    }

    /* renamed from: a */
    public String m60068a() {
        return this.bj;
    }

    public String toString() {
        return this.bj;
    }
}
