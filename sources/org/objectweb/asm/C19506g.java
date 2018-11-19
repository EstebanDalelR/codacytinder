package org.objectweb.asm;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;

/* renamed from: org.objectweb.asm.g */
public class C19506g extends C19338f {
    /* renamed from: c */
    static final byte[] f60913c;
    /* renamed from: A */
    private int f60914A;
    /* renamed from: B */
    private int f60915B;
    /* renamed from: C */
    private int[] f60916C;
    /* renamed from: D */
    private int f60917D;
    /* renamed from: E */
    private C19336d f60918E;
    /* renamed from: F */
    private int f60919F;
    /* renamed from: G */
    private int f60920G;
    /* renamed from: H */
    private C19505b f60921H;
    /* renamed from: I */
    private C19505b f60922I;
    /* renamed from: J */
    private C19505b f60923J;
    /* renamed from: K */
    private C19505b f60924K;
    /* renamed from: L */
    private C19335c f60925L;
    /* renamed from: M */
    private int f60926M;
    /* renamed from: N */
    private C19336d f60927N;
    /* renamed from: O */
    private boolean f60928O;
    /* renamed from: P */
    private boolean f60929P;
    /* renamed from: d */
    C19337e f60930d;
    /* renamed from: e */
    int f60931e;
    /* renamed from: f */
    int f60932f = 1;
    /* renamed from: g */
    final C19336d f60933g = new C19336d();
    /* renamed from: h */
    C19345o[] f60934h = new C19345o[256];
    /* renamed from: i */
    int f60935i = ((int) (((double) this.f60934h.length) * 0.75d));
    /* renamed from: j */
    final C19345o f60936j = new C19345o();
    /* renamed from: k */
    final C19345o f60937k = new C19345o();
    /* renamed from: l */
    final C19345o f60938l = new C19345o();
    /* renamed from: m */
    final C19345o f60939m = new C19345o();
    /* renamed from: n */
    C19345o[] f60940n;
    /* renamed from: o */
    String f60941o;
    /* renamed from: p */
    int f60942p;
    /* renamed from: q */
    C19336d f60943q;
    /* renamed from: r */
    C19507k f60944r;
    /* renamed from: s */
    C19507k f60945s;
    /* renamed from: t */
    C19508r f60946t;
    /* renamed from: u */
    C19508r f60947u;
    /* renamed from: v */
    boolean f60948v;
    /* renamed from: w */
    private short f60949w;
    /* renamed from: x */
    private int f60950x;
    /* renamed from: y */
    private int f60951y;
    /* renamed from: z */
    private int f60952z;

    static {
        C19506g.m70390c();
        byte[] bArr = new byte[220];
        String str = "AAAAAAAAAAAAAAAABCLMMDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANAAAAAAAAAAAAAAAAAAAAJJJJJJJJJJJJJJJJDOPAAAAAAGGGGGGGHIFBFAAFFAARQJJKKJJJJJJJJJJJJJJJJJJ";
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (str.charAt(i) - 65);
        }
        f60913c = bArr;
    }

    public C19506g(int i) {
        super(327680);
        boolean z = true;
        this.f60928O = (i & 1) != 0;
        if ((i & 2) == 0) {
            z = false;
        }
        this.f60929P = z;
    }

    /* renamed from: a */
    private C19345o m70386a(C19345o c19345o) {
        this.f60949w = (short) (this.f60949w + 1);
        c19345o = new C19345o(this.f60949w, this.f60936j);
        m70391c(c19345o);
        if (this.f60940n == null) {
            this.f60940n = new C19345o[16];
        }
        if (this.f60949w == this.f60940n.length) {
            Object obj = new C19345o[(this.f60940n.length * 2)];
            System.arraycopy(this.f60940n, 0, obj, 0, this.f60940n.length);
            this.f60940n = obj;
        }
        this.f60940n[this.f60949w] = c19345o;
        return c19345o;
    }

    /* renamed from: a */
    private void m70387a(int i, int i2, int i3) {
        this.f60933g.m69359b(i, i2).m69358b(i3);
    }

    /* renamed from: b */
    private C19345o m70388b(C19345o c19345o) {
        C19345o c19345o2 = this.f60934h[c19345o.f60372h % this.f60934h.length];
        while (c19345o2 != null && (c19345o2.f60366b != c19345o.f60366b || !c19345o.m69423a(c19345o2))) {
            c19345o2 = c19345o2.f60373i;
        }
        return c19345o2;
    }

    /* renamed from: b */
    private void m70389b(int i, int i2, int i3) {
        this.f60933g.m69353a(i, i2).m69358b(i3);
    }

    /* renamed from: c */
    static void m70390c() {
    }

    /* renamed from: c */
    private void m70391c(C19345o c19345o) {
        int length;
        if (this.f60932f + this.f60949w > this.f60935i) {
            length = this.f60934h.length;
            int i = (length * 2) + 1;
            C19345o[] c19345oArr = new C19345o[i];
            for (length--; length >= 0; length--) {
                C19345o c19345o2 = this.f60934h[length];
                while (c19345o2 != null) {
                    int length2 = c19345o2.f60372h % c19345oArr.length;
                    C19345o c19345o3 = c19345o2.f60373i;
                    c19345o2.f60373i = c19345oArr[length2];
                    c19345oArr[length2] = c19345o2;
                    c19345o2 = c19345o3;
                }
            }
            this.f60934h = c19345oArr;
            this.f60935i = (int) (((double) i) * 0.75d);
        }
        length = c19345o.f60372h % this.f60934h.length;
        c19345o.f60373i = this.f60934h[length];
        this.f60934h[length] = c19345o;
    }

    /* renamed from: f */
    private C19345o m70392f(String str) {
        this.f60937k.m69420a(8, str, null, null);
        C19345o b = m70388b(this.f60937k);
        if (b != null) {
            return b;
        }
        this.f60933g.m69359b(8, m70394a(str));
        int i = this.f60932f;
        this.f60932f = i + 1;
        b = new C19345o(i, this.f60937k);
        m70391c(b);
        return b;
    }

    /* renamed from: a */
    int m70393a(int i, int i2) {
        this.f60937k.f60366b = 32;
        this.f60937k.f60368d = ((long) i) | (((long) i2) << 32);
        this.f60937k.f60372h = ((i + 32) + i2) & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        C19345o b = m70388b(this.f60937k);
        if (b == null) {
            String str = this.f60940n[i].f60369e;
            String str2 = this.f60940n[i2].f60369e;
            this.f60937k.f60367c = m70426e(m70424d(str, str2));
            b = new C19345o(0, this.f60937k);
            m70391c(b);
        }
        return b.f60367c;
    }

    /* renamed from: a */
    public int m70394a(String str) {
        this.f60936j.m69420a(1, str, null, null);
        C19345o b = m70388b(this.f60936j);
        if (b == null) {
            this.f60933g.m69352a(1).m69355a(str);
            int i = this.f60932f;
            this.f60932f = i + 1;
            b = new C19345o(i, this.f60936j);
            m70391c(b);
        }
        return b.f60365a;
    }

    /* renamed from: a */
    int m70395a(String str, int i) {
        this.f60936j.f60366b = 31;
        this.f60936j.f60367c = i;
        this.f60936j.f60369e = str;
        this.f60936j.f60372h = ((str.hashCode() + 31) + i) & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        C19345o b = m70388b(this.f60936j);
        if (b == null) {
            b = m70386a(this.f60936j);
        }
        return b.f60365a;
    }

    /* renamed from: a */
    public final C19334a mo14588a(int i, C19349t c19349t, String str, boolean z) {
        C19336d c19336d = new C19336d();
        C19505b.m70377a(i, c19349t, c19336d);
        c19336d.m69358b(m70394a(str)).m69358b(0);
        C19334a c19505b = new C19505b(this, true, c19336d, c19336d, c19336d.f60313b - 2);
        if (z) {
            c19505b.f60905c = this.f60923J;
            this.f60923J = c19505b;
            return c19505b;
        }
        c19505b.f60905c = this.f60924K;
        this.f60924K = c19505b;
        return c19505b;
    }

    /* renamed from: a */
    public final C19334a mo14589a(String str, boolean z) {
        C19336d c19336d = new C19336d();
        c19336d.m69358b(m70394a(str)).m69358b(0);
        C19334a c19505b = new C19505b(this, true, c19336d, c19336d, 2);
        if (z) {
            c19505b.f60905c = this.f60921H;
            this.f60921H = c19505b;
            return c19505b;
        }
        c19505b.f60905c = this.f60922I;
        this.f60922I = c19505b;
        return c19505b;
    }

    /* renamed from: a */
    public final C19341j mo14590a(int i, String str, String str2, String str3, Object obj) {
        return new C19507k(this, i, str, str2, str3, obj);
    }

    /* renamed from: a */
    C19345o m70399a(double d) {
        this.f60936j.m69416a(d);
        C19345o b = m70388b(this.f60936j);
        if (b != null) {
            return b;
        }
        this.f60933g.m69352a(6).m69354a(this.f60936j.f60368d);
        b = new C19345o(this.f60932f, this.f60936j);
        this.f60932f += 2;
        m70391c(b);
        return b;
    }

    /* renamed from: a */
    C19345o m70400a(float f) {
        this.f60936j.m69417a(f);
        C19345o b = m70388b(this.f60936j);
        if (b != null) {
            return b;
        }
        this.f60933g.m69352a(4).m69360c(this.f60936j.f60367c);
        int i = this.f60932f;
        this.f60932f = i + 1;
        b = new C19345o(i, this.f60936j);
        m70391c(b);
        return b;
    }

    /* renamed from: a */
    C19345o m70401a(int i) {
        this.f60936j.m69418a(i);
        C19345o b = m70388b(this.f60936j);
        if (b != null) {
            return b;
        }
        this.f60933g.m69352a(3).m69360c(i);
        i = this.f60932f;
        this.f60932f = i + 1;
        b = new C19345o(i, this.f60936j);
        m70391c(b);
        return b;
    }

    /* renamed from: a */
    C19345o m70402a(int i, String str, String str2, String str3) {
        this.f60939m.m69420a(i + 20, str, str2, str3);
        C19345o b = m70388b(this.f60939m);
        if (b != null) {
            return b;
        }
        int c;
        if (i <= 4) {
            c = m70422c(str, str2, str3);
        } else {
            c = m70417b(str, str2, str3, i == 9);
        }
        m70389b(15, i, c);
        i = this.f60932f;
        this.f60932f = i + 1;
        b = new C19345o(i, this.f60939m);
        m70391c(b);
        return b;
    }

    /* renamed from: a */
    C19345o m70403a(long j) {
        this.f60936j.m69421a(j);
        C19345o b = m70388b(this.f60936j);
        if (b != null) {
            return b;
        }
        this.f60933g.m69352a(5).m69354a(j);
        b = new C19345o(this.f60932f, this.f60936j);
        this.f60932f += 2;
        m70391c(b);
        return b;
    }

    /* renamed from: a */
    C19345o m70404a(Object obj) {
        if (obj instanceof Integer) {
            return m70401a(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m70401a(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m70401a(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m70401a(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m70401a(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Float) {
            return m70400a(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return m70403a(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m70399a(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return m70392f((String) obj);
        }
        if (obj instanceof C19348s) {
            C19348s c19348s = (C19348s) obj;
            int a = c19348s.m69474a();
            return a == 10 ? m70418b(c19348s.m69478e()) : a == 11 ? m70425d(c19348s.m69479f()) : m70418b(c19348s.m69479f());
        } else if (obj instanceof C19343m) {
            C19343m c19343m = (C19343m) obj;
            return m70402a(c19343m.f60355a, c19343m.f60356b, c19343m.f60357c, c19343m.f60358d);
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("value ");
            stringBuffer.append(obj);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    /* renamed from: a */
    C19345o m70405a(String str, String str2, String str3, boolean z) {
        int i = z ? 11 : 10;
        this.f60938l.m69420a(i, str, str2, str3);
        C19345o b = m70388b(this.f60938l);
        if (b != null) {
            return b;
        }
        m70387a(i, m70421c(str), m70416b(str2, str3));
        int i2 = this.f60932f;
        this.f60932f = i2 + 1;
        b = new C19345o(i2, this.f60938l);
        m70391c(b);
        return b;
    }

    /* renamed from: a */
    C19345o m70406a(String str, String str2, C19343m c19343m, Object... objArr) {
        C19345o c19345o;
        C19336d c19336d = this.f60943q;
        if (c19336d == null) {
            c19336d = new C19336d();
            this.f60943q = c19336d;
        }
        int i = c19336d.f60313b;
        int hashCode = c19343m.hashCode();
        c19336d.m69358b(m70414b(c19343m.f60355a, c19343m.f60356b, c19343m.f60357c, c19343m.f60358d));
        c19336d.m69358b(r12);
        int i2 = hashCode;
        for (Object obj : objArr) {
            i2 ^= obj.hashCode();
            c19336d.m69358b(m70415b(obj));
        }
        byte[] bArr = c19336d.f60312a;
        int i3 = (i3 + 2) << 1;
        hashCode = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED & i2;
        C19345o c19345o2 = this.f60934h[hashCode % this.f60934h.length];
        loop1:
        while (c19345o2 != null) {
            if (c19345o2.f60366b == 33) {
                if (c19345o2.f60372h == hashCode) {
                    int i4 = c19345o2.f60367c;
                    int i5 = 0;
                    while (i5 < i3) {
                        if (bArr[i + i5] == bArr[i4 + i5]) {
                            i5++;
                        }
                    }
                    break loop1;
                }
            }
            c19345o2 = c19345o2.f60373i;
        }
        if (c19345o2 != null) {
            i3 = c19345o2.f60365a;
            c19336d.f60313b = i;
        } else {
            i3 = this.f60942p;
            this.f60942p = i3 + 1;
            c19345o = new C19345o(i3);
            c19345o.m69419a(i, hashCode);
            m70391c(c19345o);
        }
        this.f60938l.m69422a(str, str2, i3);
        c19345o = m70388b(this.f60938l);
        if (c19345o != null) {
            return c19345o;
        }
        m70387a(18, i3, m70416b(str, str2));
        int i6 = this.f60932f;
        this.f60932f = i6 + 1;
        c19345o = new C19345o(i6, this.f60938l);
        m70391c(c19345o);
        return c19345o;
    }

    /* renamed from: a */
    public final C19347q mo14591a(int i, String str, String str2, String str3, String[] strArr) {
        return new C19508r(this, i, str, str2, str3, strArr, this.f60928O, this.f60929P);
    }

    /* renamed from: a */
    public final void mo14592a() {
    }

    /* renamed from: a */
    public final void mo14593a(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f60931e = i;
        this.f60950x = i2;
        this.f60951y = m70421c(str);
        this.f60941o = str;
        if (str2 != null) {
            this.f60952z = m70394a(str2);
        }
        this.f60914A = str3 == null ? 0 : m70421c(str3);
        if (strArr != null && strArr.length > 0) {
            this.f60915B = strArr.length;
            this.f60916C = new int[this.f60915B];
            for (i = 0; i < this.f60915B; i++) {
                this.f60916C[i] = m70421c(strArr[i]);
            }
        }
    }

    /* renamed from: a */
    public final void mo14594a(String str, String str2) {
        if (str != null) {
            this.f60917D = m70394a(str);
        }
        if (str2 != null) {
            this.f60918E = new C19336d().m69356a(str2, 0, (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
    }

    /* renamed from: a */
    public final void mo14595a(String str, String str2, String str3) {
        this.f60919F = m70421c(str);
        if (str2 != null && str3 != null) {
            this.f60920G = m70416b(str2, str3);
        }
    }

    /* renamed from: a */
    public final void mo14596a(String str, String str2, String str3, int i) {
        if (this.f60927N == null) {
            this.f60927N = new C19336d();
        }
        C19345o b = m70418b(str);
        if (b.f60367c == 0) {
            this.f60926M++;
            this.f60927N.m69358b(b.f60365a);
            int i2 = 0;
            this.f60927N.m69358b(str2 == null ? 0 : m70421c(str2));
            C19336d c19336d = this.f60927N;
            if (str3 != null) {
                i2 = m70394a(str3);
            }
            c19336d.m69358b(i2);
            this.f60927N.m69358b(i);
            b.f60367c = this.f60926M;
        }
    }

    /* renamed from: a */
    public final void mo14597a(C19335c c19335c) {
        c19335c.f60311c = this.f60925L;
        this.f60925L = c19335c;
    }

    /* renamed from: b */
    public int m70414b(int i, String str, String str2, String str3) {
        return m70402a(i, str, str2, str3).f60365a;
    }

    /* renamed from: b */
    public int m70415b(Object obj) {
        return m70404a(obj).f60365a;
    }

    /* renamed from: b */
    public int m70416b(String str, String str2) {
        return m70423c(str, str2).f60365a;
    }

    /* renamed from: b */
    public int m70417b(String str, String str2, String str3, boolean z) {
        return m70405a(str, str2, str3, z).f60365a;
    }

    /* renamed from: b */
    C19345o m70418b(String str) {
        this.f60937k.m69420a(7, str, null, null);
        C19345o b = m70388b(this.f60937k);
        if (b != null) {
            return b;
        }
        this.f60933g.m69359b(7, m70394a(str));
        int i = this.f60932f;
        this.f60932f = i + 1;
        b = new C19345o(i, this.f60937k);
        m70391c(b);
        return b;
    }

    /* renamed from: b */
    C19345o m70419b(String str, String str2, String str3) {
        this.f60938l.m69420a(9, str, str2, str3);
        C19345o b = m70388b(this.f60938l);
        if (b != null) {
            return b;
        }
        m70387a(9, m70421c(str), m70416b(str2, str3));
        int i = this.f60932f;
        this.f60932f = i + 1;
        b = new C19345o(i, this.f60938l);
        m70391c(b);
        return b;
    }

    /* renamed from: b */
    public byte[] m70420b() {
        if (this.f60932f > 65535) {
            throw new RuntimeException("Class file too large!");
        }
        C19507k c19507k;
        C19508r c19508r;
        int i;
        C19336d c19336d;
        int i2 = (r7.f60915B * 2) + 24;
        int i3 = 0;
        for (c19507k = r7.f60944r; c19507k != null; c19507k = (C19507k) c19507k.b) {
            i3++;
            i2 += c19507k.m70432b();
        }
        int i4 = 0;
        for (c19508r = r7.f60946t; c19508r != null; c19508r = (C19508r) c19508r.b) {
            i4++;
            i2 += c19508r.m70480d();
        }
        if (r7.f60943q != null) {
            i2 += r7.f60943q.f60313b + 8;
            m70394a("BootstrapMethods");
            i = i2;
            i2 = 1;
        } else {
            i = i2;
            i2 = 0;
        }
        if (r7.f60952z != 0) {
            i2++;
            i += 8;
            m70394a("Signature");
        }
        if (r7.f60917D != 0) {
            i2++;
            i += 8;
            m70394a("SourceFile");
        }
        if (r7.f60918E != null) {
            i2++;
            i += r7.f60918E.f60313b + 6;
            m70394a("SourceDebugExtension");
        }
        if (r7.f60919F != 0) {
            i2++;
            i += 10;
            m70394a("EnclosingMethod");
        }
        if ((r7.f60950x & 131072) != 0) {
            i2++;
            i += 6;
            m70394a("Deprecated");
        }
        if ((r7.f60950x & 4096) != 0 && ((r7.f60931e & 65535) < 49 || (r7.f60950x & 262144) != 0)) {
            i2++;
            i += 6;
            m70394a("Synthetic");
        }
        if (r7.f60927N != null) {
            i2++;
            i += r7.f60927N.f60313b + 8;
            m70394a("InnerClasses");
        }
        if (r7.f60921H != null) {
            i2++;
            i += r7.f60921H.m70385b() + 8;
            m70394a("RuntimeVisibleAnnotations");
        }
        if (r7.f60922I != null) {
            i2++;
            i += r7.f60922I.m70385b() + 8;
            m70394a("RuntimeInvisibleAnnotations");
        }
        if (r7.f60923J != null) {
            i2++;
            i += r7.f60923J.m70385b() + 8;
            m70394a("RuntimeVisibleTypeAnnotations");
        }
        if (r7.f60924K != null) {
            i2++;
            i += r7.f60924K.m70385b() + 8;
            m70394a("RuntimeInvisibleTypeAnnotations");
        }
        int i5 = i;
        if (r7.f60925L != null) {
            i5 += r7.f60925L.m69348b(r7, null, 0, -1, -1);
            i2 += r7.f60925L.m69350c();
        }
        C19336d c19336d2 = new C19336d(i5 + r7.f60933g.f60313b);
        c19336d2.m69360c(-889275714).m69360c(r7.f60931e);
        c19336d2.m69358b(r7.f60932f).m69357a(r7.f60933g.f60312a, 0, r7.f60933g.f60313b);
        c19336d2.m69358b(((393216 | ((r7.f60950x & 262144) / 64)) ^ -1) & r7.f60950x).m69358b(r7.f60951y).m69358b(r7.f60914A);
        c19336d2.m69358b(r7.f60915B);
        for (i = 0; i < r7.f60915B; i++) {
            c19336d2.m69358b(r7.f60916C[i]);
        }
        c19336d2.m69358b(i3);
        for (c19507k = r7.f60944r; c19507k != null; c19507k = (C19507k) c19507k.b) {
            c19507k.m70431a(c19336d2);
        }
        c19336d2.m69358b(i4);
        for (c19508r = r7.f60946t; c19508r != null; c19508r = (C19508r) c19508r.b) {
            c19508r.m70468a(c19336d2);
        }
        c19336d2.m69358b(i2);
        if (r7.f60943q != null) {
            c19336d2.m69358b(m70394a("BootstrapMethods"));
            c19336d2.m69360c(r7.f60943q.f60313b + 2).m69358b(r7.f60942p);
            c19336d2.m69357a(r7.f60943q.f60312a, 0, r7.f60943q.f60313b);
        }
        if (r7.f60952z != 0) {
            c19336d2.m69358b(m70394a("Signature")).m69360c(2).m69358b(r7.f60952z);
        }
        if (r7.f60917D != 0) {
            c19336d2.m69358b(m70394a("SourceFile")).m69360c(2).m69358b(r7.f60917D);
        }
        if (r7.f60918E != null) {
            i2 = r7.f60918E.f60313b;
            c19336d2.m69358b(m70394a("SourceDebugExtension")).m69360c(i2);
            c19336d2.m69357a(r7.f60918E.f60312a, 0, i2);
        }
        if (r7.f60919F != 0) {
            c19336d2.m69358b(m70394a("EnclosingMethod")).m69360c(4);
            c19336d2.m69358b(r7.f60919F).m69358b(r7.f60920G);
        }
        if ((r7.f60950x & 131072) != 0) {
            c19336d2.m69358b(m70394a("Deprecated")).m69360c(0);
        }
        if ((r7.f60950x & 4096) != 0 && ((r7.f60931e & 65535) < 49 || (r7.f60950x & 262144) != 0)) {
            c19336d2.m69358b(m70394a("Synthetic")).m69360c(0);
        }
        if (r7.f60927N != null) {
            c19336d2.m69358b(m70394a("InnerClasses"));
            c19336d2.m69360c(r7.f60927N.f60313b + 2).m69358b(r7.f60926M);
            c19336d2.m69357a(r7.f60927N.f60312a, 0, r7.f60927N.f60313b);
        }
        if (r7.f60921H != null) {
            c19336d2.m69358b(m70394a("RuntimeVisibleAnnotations"));
            r7.f60921H.m70384a(c19336d2);
        }
        if (r7.f60922I != null) {
            c19336d2.m69358b(m70394a("RuntimeInvisibleAnnotations"));
            r7.f60922I.m70384a(c19336d2);
        }
        if (r7.f60923J != null) {
            c19336d2.m69358b(m70394a("RuntimeVisibleTypeAnnotations"));
            r7.f60923J.m70384a(c19336d2);
        }
        if (r7.f60924K != null) {
            c19336d2.m69358b(m70394a("RuntimeInvisibleTypeAnnotations"));
            r7.f60924K.m70384a(c19336d2);
        }
        if (r7.f60925L != null) {
            c19336d = c19336d2;
            r7.f60925L.m69346a((C19506g) r7, null, 0, -1, -1, c19336d);
        } else {
            c19336d = c19336d2;
        }
        if (!r7.f60948v) {
            return c19336d.f60312a;
        }
        r7.f60921H = null;
        r7.f60922I = null;
        r7.f60925L = null;
        r7.f60926M = 0;
        r7.f60927N = null;
        r7.f60942p = 0;
        r7.f60943q = null;
        r7.f60944r = null;
        r7.f60945s = null;
        r7.f60946t = null;
        r7.f60947u = null;
        r7.f60928O = false;
        r7.f60929P = true;
        r7.f60948v = false;
        new C19337e(c19336d.f60312a).m69378a(r7, 4);
        return m70420b();
    }

    /* renamed from: c */
    public int m70421c(String str) {
        return m70418b(str).f60365a;
    }

    /* renamed from: c */
    public int m70422c(String str, String str2, String str3) {
        return m70419b(str, str2, str3).f60365a;
    }

    /* renamed from: c */
    C19345o m70423c(String str, String str2) {
        this.f60937k.m69420a(12, str, str2, null);
        C19345o b = m70388b(this.f60937k);
        if (b != null) {
            return b;
        }
        m70387a(12, m70394a(str), m70394a(str2));
        int i = this.f60932f;
        this.f60932f = i + 1;
        b = new C19345o(i, this.f60937k);
        m70391c(b);
        return b;
    }

    /* renamed from: d */
    protected String m70424d(String str, String str2) {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            Class cls = Class.forName(str.replace('/', '.'), false, classLoader);
            Class cls2 = Class.forName(str2.replace('/', '.'), false, classLoader);
            if (cls.isAssignableFrom(cls2)) {
                return str;
            }
            if (cls2.isAssignableFrom(cls)) {
                return str2;
            }
            if (!cls.isInterface()) {
                if (!cls2.isInterface()) {
                    do {
                        cls = cls.getSuperclass();
                    } while (!cls.isAssignableFrom(cls2));
                    return cls.getName().replace('.', '/');
                }
            }
            return "java/lang/Object";
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
    }

    /* renamed from: d */
    C19345o m70425d(String str) {
        this.f60937k.m69420a(16, str, null, null);
        C19345o b = m70388b(this.f60937k);
        if (b != null) {
            return b;
        }
        this.f60933g.m69359b(16, m70394a(str));
        int i = this.f60932f;
        this.f60932f = i + 1;
        b = new C19345o(i, this.f60937k);
        m70391c(b);
        return b;
    }

    /* renamed from: e */
    int m70426e(String str) {
        this.f60936j.m69420a(30, str, null, null);
        C19345o b = m70388b(this.f60936j);
        if (b == null) {
            b = m70386a(this.f60936j);
        }
        return b.f60365a;
    }
}
