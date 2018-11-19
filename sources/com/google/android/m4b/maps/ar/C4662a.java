package com.google.android.m4b.maps.ar;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.m4b.maps.ap.C4656d;
import com.google.android.m4b.maps.ap.C4660g;
import com.google.android.m4b.maps.at.C4667a;
import com.google.android.m4b.maps.at.C4669b;
import com.google.android.m4b.maps.at.C4669b.C4668a;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Vector;

/* renamed from: com.google.android.m4b.maps.ar.a */
public final class C4662a {
    /* renamed from: a */
    public static final Boolean f17098a = new Boolean(false);
    /* renamed from: b */
    public static final Boolean f17099b = new Boolean(true);
    /* renamed from: c */
    private static byte[] f17100c = new byte[0];
    /* renamed from: h */
    private static final C4661a f17101h = new C4661a();
    /* renamed from: d */
    private C4664b f17102d;
    /* renamed from: e */
    private final C4669b f17103e;
    /* renamed from: f */
    private C4669b f17104f;
    /* renamed from: g */
    private int f17105g = Integer.MIN_VALUE;

    /* renamed from: com.google.android.m4b.maps.ar.a$a */
    static class C4661a {
        /* renamed from: a */
        public int f17097a;

        private C4661a() {
            this.f17097a = 0;
        }
    }

    /* renamed from: a */
    private static int m20789a(long j) {
        if (j < 0) {
            return 10;
        }
        int i = 1;
        while (j >= 128) {
            i++;
            j >>= 7;
        }
        return i;
    }

    /* renamed from: b */
    private static long m20803b(long j) {
        return (j << 1) ^ (-(j >>> 63));
    }

    public final /* synthetic */ Object clone() {
        return m20812a();
    }

    public C4662a(C4664b c4664b) {
        this.f17102d = c4664b;
        if (c4664b == null) {
            this.f17103e = new C4669b();
        } else {
            this.f17103e = c4664b.m20851a();
        }
    }

    /* renamed from: a */
    public final com.google.android.m4b.maps.ar.C4662a m20812a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = new com.google.android.m4b.maps.ar.a;	 Catch:{ IOException -> 0x000f }
        r1 = r2.f17102d;	 Catch:{ IOException -> 0x000f }
        r0.<init>(r1);	 Catch:{ IOException -> 0x000f }
        r1 = r2.m20837d();	 Catch:{ IOException -> 0x000f }
        r0.m20819a(r1);	 Catch:{ IOException -> 0x000f }
        return r0;
    L_0x000f:
        r0 = new java.lang.RuntimeException;
        r1 = "Could not serialize and parse ProtoBuf.";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ar.a.a():com.google.android.m4b.maps.ar.a");
    }

    /* renamed from: a */
    public final C4662a m20813a(int i) {
        return new C4662a((C4664b) this.f17102d.m20852b(i));
    }

    /* renamed from: a */
    public final void m20823a(int i, byte[] bArr) {
        m20800a(2, (Object) bArr);
    }

    /* renamed from: a */
    public final void m20821a(int i, C4662a c4662a) {
        m20800a(i, (Object) c4662a);
    }

    /* renamed from: a */
    public final void m20822a(int i, String str) {
        m20800a(i, (Object) str);
    }

    /* renamed from: b */
    public final boolean m20831b(int i) {
        return ((Boolean) m20806h(i, 24)).booleanValue();
    }

    /* renamed from: c */
    public final byte[] m20834c(int i) {
        return (byte[]) m20806h(i, 25);
    }

    /* renamed from: d */
    public final int m20835d(int i) {
        return (int) ((Long) m20806h(i, 21)).longValue();
    }

    /* renamed from: b */
    public final int m20826b(int i, int i2) {
        return (int) ((Long) m20797a(i, i2, 21)).longValue();
    }

    /* renamed from: e */
    public final long m20838e(int i) {
        return ((Long) m20806h(i, 19)).longValue();
    }

    /* renamed from: g */
    private long m20805g(int i, int i2) {
        return ((Long) m20797a(i, i2, 19)).longValue();
    }

    /* renamed from: f */
    public final float m20840f(int i) {
        return Float.intBitsToFloat(m20835d(5));
    }

    /* renamed from: g */
    public final C4662a m20842g(int i) {
        return (C4662a) m20806h(i, 26);
    }

    /* renamed from: c */
    public final C4662a m20833c(int i, int i2) {
        return (C4662a) m20797a(i, i2, 26);
    }

    /* renamed from: h */
    public final String m20843h(int i) {
        return (String) m20806h(i, 28);
    }

    /* renamed from: d */
    public final String m20836d(int i, int i2) {
        return (String) m20797a(i, i2, 28);
    }

    /* renamed from: b */
    public final C4664b m20829b() {
        return this.f17102d;
    }

    /* renamed from: a */
    final C4662a m20817a(C4664b c4664b) {
        if ((this.f17103e.m20879e() == 0 ? 1 : null) != null) {
            if (this.f17102d == null || c4664b == null || c4664b == this.f17102d) {
                this.f17102d = c4664b;
                this.f17104f = null;
                return this;
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public final boolean m20844i(int i) {
        return m20846k(i) > 0;
    }

    /* renamed from: j */
    public final boolean m20845j(int i) {
        if (!m20844i(i)) {
            if (m20809n(i) == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final C4662a m20819a(byte[] bArr) {
        m20811a(new ByteArrayInputStream(bArr), bArr.length);
        return this;
    }

    /* renamed from: a */
    public final C4662a m20818a(InputStream inputStream) {
        m20811a(inputStream, (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        return this;
    }

    /* renamed from: a */
    public final int m20811a(InputStream inputStream, int i) {
        return m20791a(inputStream, i, true, new C4661a());
    }

    /* renamed from: e */
    public final void m20839e(int i, int i2) {
        int k = m20846k(i);
        if (i2 >= k) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (k == 1) {
            this.f17103e.m20876b(i);
        } else {
            ((Vector) this.f17103e.m20873a(i)).removeElementAt(i2);
        }
    }

    /* renamed from: a */
    private static int m20793a(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Vector ? ((Vector) obj).size() : 1;
    }

    /* renamed from: k */
    public final int m20846k(int i) {
        return C4662a.m20793a(this.f17103e.m20873a(i));
    }

    /* renamed from: l */
    private int m20807l(int i) {
        int a = this.f17102d != null ? this.f17102d.m20849a(i) : 16;
        if (a == 16) {
            Integer num = this.f17104f != null ? (Integer) this.f17104f.m20873a(i) : null;
            if (num != null) {
                a = num.intValue();
            }
        }
        if (a != 16 || m20846k(i) <= 0) {
            return a;
        }
        i = m20797a(i, 0, 16);
        if (i instanceof Long) {
            return 0;
        }
        if ((i instanceof Boolean) != 0) {
            return 0;
        }
        return 2;
    }

    /* renamed from: c */
    public final int m20832c() {
        return m20794a(false);
    }

    /* renamed from: a */
    private int m20794a(boolean z) {
        if (this.f17105g != Integer.MIN_VALUE && z) {
            return this.f17105g;
        }
        C4668a b = this.f17103e.m20875b();
        int i = 0;
        while (b.m20867a()) {
            int b2 = b.m20868b();
            int k = m20846k(b2);
            int i2 = i;
            for (i = 0; i < k; i++) {
                int a = C4662a.m20789a((long) (b2 << 3));
                int o = m20810o(b2);
                if (o == 3) {
                    a += m20833c(b2, i).m20794a(z) + a;
                } else if (o != 5) {
                    switch (o) {
                        case 0:
                            long g = m20805g(b2, i);
                            if (m20808m(b2)) {
                                g = C4662a.m20803b(g);
                            }
                            a += C4662a.m20789a(g);
                            break;
                        case 1:
                            a += 8;
                            break;
                        default:
                            Object a2 = m20797a(b2, i, 16);
                            if (a2 instanceof byte[]) {
                                o = ((byte[]) a2).length;
                            } else if (a2 instanceof String) {
                                o = C4660g.m20786a((String) a2, null, 0);
                            } else {
                                o = ((C4662a) a2).m20794a(z);
                            }
                            a = (a + C4662a.m20789a((long) o)) + o;
                            break;
                    }
                } else {
                    a += 4;
                }
                i2 += a;
            }
            i = i2;
        }
        this.f17105g = i;
        return this.f17105g;
    }

    /* renamed from: a */
    public final void m20824a(OutputStream outputStream) {
        m20801a(outputStream, true);
    }

    /* renamed from: b */
    public final void m20830b(OutputStream outputStream) {
        m20801a(outputStream, false);
    }

    /* renamed from: a */
    private void m20801a(OutputStream outputStream, boolean z) {
        C4656d c4656d = new C4656d();
        int a = m20790a(c4656d);
        if (z) {
            ((DataOutput) outputStream).writeInt(a);
        }
        z = c4656d.m20776a();
        boolean z2 = false;
        boolean z3 = false;
        while (z2 < z) {
            boolean a2 = c4656d.m20777a(z2);
            c4656d.m20779a(outputStream, z3, a2 - z3);
            C4662a.m20792a(outputStream, (long) c4656d.m20777a(z2 + 1));
            z2 += 2;
            z3 = a2;
        }
        if (z3 < c4656d.m20780b()) {
            c4656d.m20779a(outputStream, z3, c4656d.m20780b() - z3);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private int m20790a(com.google.android.m4b.maps.ap.C4656d r23) {
        /*
        r22 = this;
        r0 = r22;
        r1 = r23;
        r2 = r0.f17103e;
        r2 = r2.m20875b();
        r4 = 0;
    L_0x000b:
        r5 = r2.m20867a();
        if (r5 == 0) goto L_0x00ec;
    L_0x0011:
        r5 = r2.m20868b();
        r6 = r0.m20846k(r5);
        r7 = r0.m20810o(r5);
        r8 = r5 << 3;
        r9 = r8 | r7;
        r10 = 0;
        r11 = 0;
    L_0x0023:
        if (r10 >= r6) goto L_0x00e6;
    L_0x0025:
        r12 = (long) r9;
        r12 = com.google.android.m4b.maps.ar.C4662a.m20792a(r1, r12);
        r11 = r11 + r12;
        r12 = r23.m20780b();
        r13 = 19;
        r14 = 5;
        r15 = 1;
        if (r7 == r14) goto L_0x00b1;
    L_0x0035:
        switch(r7) {
            case 0: goto L_0x0097;
            case 1: goto L_0x00b1;
            case 2: goto L_0x0057;
            case 3: goto L_0x003e;
            default: goto L_0x0038;
        };
    L_0x0038:
        r1 = new java.lang.IllegalArgumentException;
        r1.<init>();
        throw r1;
    L_0x003e:
        r13 = 26;
        r13 = r0.m20797a(r5, r10, r13);
        r13 = (com.google.android.m4b.maps.ar.C4662a) r13;
        r13 = r13.m20790a(r1);
        r11 = r11 + r13;
        r13 = r8 | 4;
        r13 = (long) r13;
        r13 = com.google.android.m4b.maps.ar.C4662a.m20792a(r1, r13);
        r11 = r11 + r13;
    L_0x0053:
        r20 = r4;
        goto L_0x00d8;
    L_0x0057:
        r13 = r0.m20807l(r5);
        r14 = 27;
        if (r13 != r14) goto L_0x0062;
    L_0x005f:
        r13 = 16;
        goto L_0x0064;
    L_0x0062:
        r13 = 25;
    L_0x0064:
        r13 = r0.m20797a(r5, r10, r13);
        r14 = r13 instanceof byte[];
        if (r14 == 0) goto L_0x0077;
    L_0x006c:
        r13 = (byte[]) r13;
        r14 = r13.length;
        r14 = (long) r14;
        com.google.android.m4b.maps.ar.C4662a.m20792a(r1, r14);
        r1.write(r13);
        goto L_0x00ae;
    L_0x0077:
        r14 = r23.m20780b();
        r1.m20781b(r14);
        r14 = r23.m20776a();
        r3 = -1;
        r1.m20781b(r3);
        r13 = (com.google.android.m4b.maps.ar.C4662a) r13;
        r3 = r13.m20790a(r1);
        r1.m20778a(r14, r3);
        r13 = (long) r3;
        r13 = com.google.android.m4b.maps.ar.C4662a.m20789a(r13);
        r13 = r13 + r3;
        r11 = r11 + r13;
        goto L_0x0053;
    L_0x0097:
        r3 = r0.m20797a(r5, r10, r13);
        r3 = (java.lang.Long) r3;
        r13 = r3.longValue();
        r3 = r0.m20808m(r5);
        if (r3 == 0) goto L_0x00ab;
    L_0x00a7:
        r13 = com.google.android.m4b.maps.ar.C4662a.m20803b(r13);
    L_0x00ab:
        com.google.android.m4b.maps.ar.C4662a.m20792a(r1, r13);
    L_0x00ae:
        r20 = r4;
        goto L_0x00d7;
    L_0x00b1:
        r3 = r0.m20797a(r5, r10, r13);
        r3 = (java.lang.Long) r3;
        r16 = r3.longValue();
        if (r7 != r14) goto L_0x00bf;
    L_0x00bd:
        r13 = 4;
        goto L_0x00c1;
    L_0x00bf:
        r13 = 8;
    L_0x00c1:
        r14 = 0;
    L_0x00c2:
        if (r14 >= r13) goto L_0x00ae;
    L_0x00c4:
        r18 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r20 = r4;
        r3 = r16 & r18;
        r3 = (int) r3;
        r1.write(r3);
        r3 = 8;
        r16 = r16 >> r3;
        r14 = r14 + 1;
        r4 = r20;
        goto L_0x00c2;
    L_0x00d7:
        r15 = 0;
    L_0x00d8:
        if (r15 != 0) goto L_0x00e0;
    L_0x00da:
        r3 = r23.m20780b();
        r3 = r3 - r12;
        r11 = r11 + r3;
    L_0x00e0:
        r10 = r10 + 1;
        r4 = r20;
        goto L_0x0023;
    L_0x00e6:
        r20 = r4;
        r4 = r20 + r11;
        goto L_0x000b;
    L_0x00ec:
        r20 = r4;
        return r20;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ar.a.a(com.google.android.m4b.maps.ap.d):int");
    }

    /* renamed from: m */
    private boolean m20808m(int i) {
        i = m20807l(i);
        if (i != 33) {
            if (i != 34) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final byte[] m20837d() {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m20830b(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public final void m20825a(Writer writer) {
        m20802a(writer, 0);
    }

    /* renamed from: a */
    public final C4662a m20816a(int i, boolean z) {
        return m20804b(i, z ? f17099b : f17098a);
    }

    /* renamed from: f */
    public final C4662a m20841f(int i, int i2) {
        return m20815a(i, (long) i2);
    }

    /* renamed from: a */
    public final C4662a m20815a(int i, long j) {
        return m20804b(i, Long.valueOf(j));
    }

    /* renamed from: a */
    public final C4662a m20814a(int i, float f) {
        return m20815a(i, (long) Float.floatToIntBits(f));
    }

    /* renamed from: b */
    public final C4662a m20827b(int i, C4662a c4662a) {
        return m20804b(i, (Object) c4662a);
    }

    /* renamed from: b */
    public final C4662a m20828b(int i, String str) {
        return m20804b(i, (Object) str);
    }

    /* renamed from: n */
    private Object m20809n(int i) {
        int l = m20807l(i);
        if (l != 16) {
            switch (l) {
                case 26:
                case 27:
                    break;
                default:
                    if (this.f17102d == null) {
                        return null;
                    }
                    return this.f17102d.m20852b(i);
            }
        }
        return null;
    }

    /* renamed from: h */
    private Object m20806h(int i, int i2) {
        Object a = this.f17103e.m20873a(i);
        int a2 = C4662a.m20793a(a);
        if (a2 == 0) {
            return m20809n(i);
        }
        if (a2 <= 1) {
            return m20798a(i, 0, i2, a);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private Object m20797a(int i, int i2, int i3) {
        Object a = this.f17103e.m20873a(i);
        if (i2 < C4662a.m20793a(a)) {
            return m20798a(i, i2, i3, a);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: a */
    private Object m20798a(int i, int i2, int i3, Object obj) {
        Vector vector;
        if (obj instanceof Vector) {
            Vector vector2 = (Vector) obj;
            vector = vector2;
            obj = vector2.elementAt(i2);
        } else {
            vector = null;
        }
        Object a = m20799a(obj, i3, i);
        if (!(a == obj || obj == null)) {
            if (vector == null) {
                m20804b(i, a);
            } else {
                vector.setElementAt(a, i2);
            }
        }
        return a;
    }

    /* renamed from: o */
    private final int m20810o(int i) {
        int l = m20807l(i);
        if (l != 5) {
            switch (l) {
                case 0:
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    switch (l) {
                        case 16:
                            break;
                        case 17:
                        case 22:
                        case 32:
                            return 1;
                        case 18:
                        case 23:
                        case 31:
                            return 5;
                        case 19:
                        case 20:
                        case 21:
                        case 24:
                        case 29:
                        case 30:
                        case 33:
                        case 34:
                            return 0;
                        case 25:
                        case 27:
                        case 28:
                        case 35:
                        case 36:
                            return 2;
                        case 26:
                            return 3;
                        default:
                            String valueOf = String.valueOf("Unsupp.Type:");
                            String valueOf2 = String.valueOf(this.f17102d);
                            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length());
                            stringBuilder.append(valueOf);
                            stringBuilder.append(valueOf2);
                            stringBuilder.append("/");
                            stringBuilder.append(i);
                            stringBuilder.append("/");
                            stringBuilder.append(l);
                            throw new RuntimeException(stringBuilder.toString());
                    }
            }
        }
        return l;
    }

    /* renamed from: a */
    private Object m20799a(Object obj, int i, int i2) {
        if (i == 16) {
            return obj;
        }
        switch (i) {
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                if ((obj instanceof Boolean) == 0) {
                    return obj;
                }
                return Long.valueOf(((Boolean) obj).booleanValue() != null ? true : 0);
            case 24:
                if ((obj instanceof Boolean) != 0) {
                    return obj;
                }
                switch ((int) ((Long) obj).longValue()) {
                    case null:
                        return f17098a;
                    case 1:
                        return f17099b;
                    default:
                        throw new IllegalArgumentException("Type mismatch");
                }
            case 25:
            case 35:
                if ((obj instanceof String) != 0) {
                    return C4660g.m20788a((String) obj);
                }
                if ((obj instanceof C4662a) == 0) {
                    return obj;
                }
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ((C4662a) obj).m20830b(byteArrayOutputStream);
                    return byteArrayOutputStream.toByteArray();
                } catch (Object obj2) {
                    throw new RuntimeException(obj2.toString());
                }
            case 26:
            case 27:
                if ((obj2 instanceof byte[]) == 0) {
                    return obj2;
                }
                if (i2 > 0) {
                    try {
                        if (this.f17102d != 0) {
                            i = new C4662a((C4664b) this.f17102d.m20852b(i2));
                            return i.m20819a((byte[]) obj2);
                        }
                    } catch (Object obj22) {
                        throw new RuntimeException(obj22.toString());
                    }
                }
                i = new C4662a(0);
                return i.m20819a((byte[]) obj22);
            case 28:
            case 36:
                if ((obj22 instanceof byte[]) == 0) {
                    return obj22;
                }
                byte[] bArr = (byte[]) obj22;
                return C4660g.m20787a(bArr, 0, bArr.length, true);
            default:
                throw new RuntimeException("Unsupp.Type");
        }
    }

    /* renamed from: a */
    static long m20795a(InputStream inputStream, boolean z) {
        return C4662a.m20796a(inputStream, z, f17101h);
    }

    /* renamed from: a */
    private static long m20796a(InputStream inputStream, boolean z, C4661a c4661a) {
        int i = 0;
        c4661a.f17097a = 0;
        long j = 0;
        long j2 = null;
        while (i < 10) {
            int read = inputStream.read();
            if (read != -1) {
                long j3 = j | (((long) (read & 127)) << j2);
                if ((read & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                    j = j3;
                    break;
                }
                j2 += 7;
                i++;
                j = j3;
            } else if (i == 0 && z) {
                return -1;
            } else {
                throw new IOException("EOF");
            }
        }
        c4661a.f17097a = i + 1;
        return j;
    }

    /* renamed from: b */
    private C4662a m20804b(int i, Object obj) {
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f17103e.m20874a(i, obj);
        return this;
    }

    public final String toString() {
        Writer stringWriter = new StringWriter();
        try {
            m20825a(stringWriter);
        } catch (IOException e) {
            stringWriter.write(e.toString());
        }
        return stringWriter.toString();
    }

    /* renamed from: a */
    private static int m20792a(OutputStream outputStream, long j) {
        int i = 0;
        while (i < 10) {
            int i2 = (int) (j & 127);
            j >>>= 7;
            if (j == 0) {
                outputStream.write(i2);
                return i + 1;
            }
            outputStream.write(i2 | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public final void m20820a(int i, int i2) {
        m20800a(i, Long.valueOf((long) i2));
    }

    /* renamed from: a */
    private int m20791a(InputStream inputStream, int i, boolean z, C4661a c4661a) {
        if (z) {
            this.f17103e.m20880f();
            this.f17104f = null;
        }
        while (i > 0) {
            long a = C4662a.m20796a(inputStream, true, c4661a);
            if (a != -1) {
                i -= c4661a.f17097a;
                int i2 = ((int) a) & 7;
                int i3 = 4;
                if (i2 != 4) {
                    Object valueOf;
                    int i4 = (int) (a >>> 3);
                    if (m20807l(i4) == 16) {
                        if (this.f17104f == null) {
                            this.f17104f = new C4669b();
                        }
                        this.f17104f.m20874a(i4, Integer.valueOf(i2));
                    }
                    long j = null;
                    if (i2 != 5) {
                        switch (i2) {
                            case 0:
                                long a2 = C4662a.m20796a(inputStream, false, c4661a);
                                i -= c4661a.f17097a;
                                if (m20808m(i4)) {
                                    a2 = (a2 >>> 1) ^ (-(a2 & 1));
                                }
                                valueOf = Long.valueOf(a2);
                                continue;
                            case 1:
                                break;
                            case 2:
                                z = (int) C4662a.m20796a(inputStream, false, c4661a);
                                i = (i - c4661a.f17097a) - z;
                                Object obj = !z ? f17100c : new byte[z];
                                boolean z2;
                                while (z2 < z) {
                                    i2 = inputStream.read(obj, z2, z - z2);
                                    if (i2 <= 0) {
                                        throw new IOException("Unexp.EOF");
                                    }
                                    z2 += i2;
                                }
                                valueOf = obj;
                                continue;
                            case 3:
                                C4664b c4664b;
                                if (this.f17102d == null) {
                                    c4664b = null;
                                } else {
                                    c4664b = (C4664b) this.f17102d.m20852b(i4);
                                }
                                valueOf = new C4662a(c4664b);
                                i = valueOf.m20791a(inputStream, i, false, c4661a);
                                continue;
                            default:
                                i = new StringBuilder(true);
                                i.append("Unknown wire type ");
                                i.append(i2);
                                i.append(", reading garbage data?");
                                throw new IOException(i.toString());
                        }
                    }
                    long j2 = 0;
                    if (i2 != 5) {
                        i3 = 8;
                    }
                    i -= i3;
                    while (true) {
                        int i5 = i3 - 1;
                        if (i3 > 0) {
                            j += true;
                            i3 = i5;
                            j2 |= ((long) inputStream.read()) << j;
                        } else {
                            valueOf = Long.valueOf(j2);
                            m20800a(i4, valueOf);
                        }
                    }
                }
            }
            if (i >= 0) {
                throw new IOException();
            }
            if (this.f17104f != null) {
                this.f17104f.m20878d();
            }
            return i;
        }
        if (i >= 0) {
            if (this.f17104f != null) {
                this.f17104f.m20878d();
            }
            return i;
        }
        throw new IOException();
    }

    /* renamed from: a */
    private void m20802a(Writer writer, int i) {
        int i2;
        int i3 = i * 2;
        StringBuffer stringBuffer = new StringBuffer();
        for (i2 = 0; i2 < i3; i2++) {
            stringBuffer.append(' ');
        }
        CharSequence stringBuffer2 = stringBuffer.toString();
        for (int i4 = 0; i4 <= this.f17103e.m20877c(); i4++) {
            for (i2 = 0; i2 < m20846k(i4); i2++) {
                writer.append(stringBuffer2).append(Integer.toString(i4));
                int l = m20807l(i4);
                if (l == 26) {
                    writer.append(' ');
                } else {
                    writer.append(':');
                }
                switch (l) {
                    case 17:
                        writer.append(Double.toString(Double.longBitsToDouble(m20805g(i4, i2))));
                        break;
                    case 18:
                        writer.append(Float.toString(Float.intBitsToFloat(m20826b(i4, i2))));
                        break;
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 36:
                        writer.append(m20797a(i4, i2, l).toString());
                        break;
                    case 25:
                    case 35:
                        writer.append(C4667a.m20866a((byte[]) m20797a(i4, i2, 25)));
                        break;
                    case 26:
                    case 27:
                        writer.append("{\n");
                        m20833c(i4, i2).m20802a(writer, i + 1);
                        writer.append(stringBuffer2).append('}');
                        break;
                    default:
                        writer.append("UNSUPPORTED TYPE: ").append(Integer.toString(l));
                        break;
                }
                writer.append('\n');
            }
        }
    }

    /* renamed from: a */
    private void m20800a(int i, Object obj) {
        Object a = this.f17103e.m20873a(i);
        Vector vector = a instanceof Vector ? (Vector) a : null;
        if (a != null) {
            if (vector == null || vector.size() != 0) {
                if (vector == null) {
                    vector = new Vector();
                    vector.addElement(a);
                    this.f17103e.m20874a(i, vector);
                }
                vector.addElement(obj);
                return;
            }
        }
        m20804b(i, obj);
    }
}
