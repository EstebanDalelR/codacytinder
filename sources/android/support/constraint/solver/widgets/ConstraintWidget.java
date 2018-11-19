package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0138c;
import android.support.constraint.solver.C0140e;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor.Strength;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import java.util.ArrayList;

public class ConstraintWidget {
    /* renamed from: O */
    public static float f479O = 0.5f;
    /* renamed from: A */
    protected ArrayList<ConstraintAnchor> f480A = new ArrayList();
    /* renamed from: B */
    protected DimensionBehaviour[] f481B = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
    /* renamed from: C */
    ConstraintWidget f482C = null;
    /* renamed from: D */
    int f483D = 0;
    /* renamed from: E */
    int f484E = 0;
    /* renamed from: F */
    protected float f485F = 0.0f;
    /* renamed from: G */
    protected int f486G = -1;
    /* renamed from: H */
    protected int f487H = 0;
    /* renamed from: I */
    protected int f488I = 0;
    /* renamed from: J */
    protected int f489J = 0;
    /* renamed from: K */
    protected int f490K = 0;
    /* renamed from: L */
    int f491L = 0;
    /* renamed from: M */
    protected int f492M;
    /* renamed from: N */
    protected int f493N;
    /* renamed from: P */
    float f494P = f479O;
    /* renamed from: Q */
    float f495Q = f479O;
    /* renamed from: R */
    boolean f496R;
    /* renamed from: S */
    boolean f497S;
    /* renamed from: T */
    int f498T = 0;
    /* renamed from: U */
    int f499U = 0;
    /* renamed from: V */
    boolean f500V;
    /* renamed from: W */
    boolean f501W;
    /* renamed from: X */
    float[] f502X = new float[]{-1.0f, -1.0f};
    /* renamed from: Y */
    protected ConstraintWidget[] f503Y = new ConstraintWidget[]{null, null};
    /* renamed from: Z */
    protected ConstraintWidget[] f504Z = new ConstraintWidget[]{null, null};
    /* renamed from: a */
    public int f505a = -1;
    ConstraintWidget aa = null;
    ConstraintWidget ab = null;
    private int[] ac = new int[]{ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
    private float ad = 0.0f;
    private int ae = 0;
    private int af = 0;
    private int ag = 0;
    private int ah = 0;
    private int ai;
    private int aj;
    private Object ak;
    private int al = 0;
    private int am = 0;
    private String an = null;
    private String ao = null;
    /* renamed from: b */
    public int f506b = -1;
    /* renamed from: c */
    C2738j f507c;
    /* renamed from: d */
    C2738j f508d;
    /* renamed from: e */
    int f509e = 0;
    /* renamed from: f */
    int f510f = 0;
    /* renamed from: g */
    int[] f511g = new int[2];
    /* renamed from: h */
    int f512h = 0;
    /* renamed from: i */
    int f513i = 0;
    /* renamed from: j */
    float f514j = 1.0f;
    /* renamed from: k */
    int f515k = 0;
    /* renamed from: l */
    int f516l = 0;
    /* renamed from: m */
    float f517m = 1.0f;
    /* renamed from: n */
    boolean f518n;
    /* renamed from: o */
    boolean f519o;
    /* renamed from: p */
    int f520p = -1;
    /* renamed from: q */
    float f521q = 1.0f;
    /* renamed from: r */
    ConstraintAnchor f522r = new ConstraintAnchor(this, Type.LEFT);
    /* renamed from: s */
    ConstraintAnchor f523s = new ConstraintAnchor(this, Type.TOP);
    /* renamed from: t */
    ConstraintAnchor f524t = new ConstraintAnchor(this, Type.RIGHT);
    /* renamed from: u */
    ConstraintAnchor f525u = new ConstraintAnchor(this, Type.BOTTOM);
    /* renamed from: v */
    ConstraintAnchor f526v = new ConstraintAnchor(this, Type.BASELINE);
    /* renamed from: w */
    ConstraintAnchor f527w = new ConstraintAnchor(this, Type.CENTER_X);
    /* renamed from: x */
    ConstraintAnchor f528x = new ConstraintAnchor(this, Type.CENTER_Y);
    /* renamed from: y */
    ConstraintAnchor f529y = new ConstraintAnchor(this, Type.CENTER);
    /* renamed from: z */
    protected ConstraintAnchor[] f530z = new ConstraintAnchor[]{this.f522r, this.f524t, this.f523s, this.f525u, this.f526v, this.f529y};

    public enum ContentAlignment {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* renamed from: b */
    public void m512b(ConstraintWidget constraintWidget) {
    }

    /* renamed from: c */
    public void mo2976c() {
    }

    /* renamed from: c */
    public void m517c(int i) {
        this.ac[0] = i;
    }

    /* renamed from: d */
    public void m522d(int i) {
        this.ac[1] = i;
    }

    /* renamed from: d */
    public boolean m524d() {
        return this.f509e == 0 && this.f485F == 0.0f && this.f512h == 0 && this.f513i == 0 && this.f481B[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    /* renamed from: e */
    public boolean m526e() {
        return this.f510f == 0 && this.f485F == 0.0f && this.f515k == 0 && this.f516l == 0 && this.f481B[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    /* renamed from: f */
    public void mo163f() {
        this.f522r.m475i();
        this.f523s.m475i();
        this.f524t.m475i();
        this.f525u.m475i();
        this.f526v.m475i();
        this.f527w.m475i();
        this.f528x.m475i();
        this.f529y.m475i();
        this.f482C = null;
        this.ad = 0.0f;
        this.f483D = 0;
        this.f484E = 0;
        this.f485F = 0.0f;
        this.f486G = -1;
        this.f487H = 0;
        this.f488I = 0;
        this.ae = 0;
        this.af = 0;
        this.ag = 0;
        this.ah = 0;
        this.f489J = 0;
        this.f490K = 0;
        this.f491L = 0;
        this.f492M = 0;
        this.f493N = 0;
        this.ai = 0;
        this.aj = 0;
        this.f494P = f479O;
        this.f495Q = f479O;
        this.f481B[0] = DimensionBehaviour.FIXED;
        this.f481B[1] = DimensionBehaviour.FIXED;
        this.ak = null;
        this.al = 0;
        this.am = 0;
        this.ao = null;
        this.f496R = false;
        this.f497S = false;
        this.f498T = 0;
        this.f499U = 0;
        this.f500V = false;
        this.f501W = false;
        this.f502X[0] = -1.0f;
        this.f502X[1] = -1.0f;
        this.f505a = -1;
        this.f506b = -1;
        this.ac[0] = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.ac[1] = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f509e = 0;
        this.f510f = 0;
        this.f514j = 1.0f;
        this.f517m = 1.0f;
        this.f513i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f516l = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f512h = 0;
        this.f515k = 0;
        this.f520p = -1;
        this.f521q = 1.0f;
        if (this.f507c != null) {
            this.f507c.mo159b();
        }
        if (this.f508d != null) {
            this.f508d.mo159b();
        }
    }

    /* renamed from: b */
    public void mo2975b() {
        for (int i = 0; i < 6; i++) {
            this.f530z[i].m462a().mo159b();
        }
    }

    /* renamed from: g */
    public void m529g() {
        for (int i = 0; i < 6; i++) {
            this.f530z[i].m462a().m10656c();
        }
    }

    /* renamed from: b */
    public void mo156b(int i) {
        C0149g.m564a(i, this);
    }

    /* renamed from: h */
    public C2738j m531h() {
        if (this.f507c == null) {
            this.f507c = new C2738j();
        }
        return this.f507c;
    }

    /* renamed from: i */
    public C2738j m533i() {
        if (this.f508d == null) {
            this.f508d = new C2738j();
        }
        return this.f508d;
    }

    public ConstraintWidget() {
        mo152H();
    }

    /* renamed from: a */
    public void mo161a(C0138c c0138c) {
        this.f522r.m463a(c0138c);
        this.f523s.m463a(c0138c);
        this.f524t.m463a(c0138c);
        this.f525u.m463a(c0138c);
        this.f526v.m463a(c0138c);
        this.f529y.m463a(c0138c);
        this.f527w.m463a(c0138c);
        this.f528x.m463a(c0138c);
    }

    /* renamed from: H */
    private void mo152H() {
        this.f480A.add(this.f522r);
        this.f480A.add(this.f523s);
        this.f480A.add(this.f524t);
        this.f480A.add(this.f525u);
        this.f480A.add(this.f527w);
        this.f480A.add(this.f528x);
        this.f480A.add(this.f529y);
        this.f480A.add(this.f526v);
    }

    /* renamed from: j */
    public ConstraintWidget m535j() {
        return this.f482C;
    }

    /* renamed from: a */
    public void m499a(ConstraintWidget constraintWidget) {
        this.f482C = constraintWidget;
    }

    /* renamed from: b */
    public void m514b(boolean z) {
        this.f518n = z;
    }

    /* renamed from: c */
    public void m520c(boolean z) {
        this.f519o = z;
    }

    /* renamed from: a */
    public void m500a(ConstraintWidget constraintWidget, float f, int i) {
        m495a(Type.CENTER, constraintWidget, Type.CENTER, i, 0);
        this.ad = f;
    }

    /* renamed from: e */
    public void m525e(int i) {
        this.am = i;
    }

    /* renamed from: k */
    public int m537k() {
        return this.am;
    }

    /* renamed from: l */
    public String m539l() {
        return this.an;
    }

    /* renamed from: a */
    public void m502a(String str) {
        this.an = str;
    }

    /* renamed from: b */
    public void m510b(C0140e c0140e) {
        c0140e.m438a(this.f522r);
        c0140e.m438a(this.f523s);
        c0140e.m438a(this.f524t);
        c0140e.m438a(this.f525u);
        if (this.f491L > 0) {
            c0140e.m438a(this.f526v);
        }
    }

    public String toString() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        if (this.ao != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("type: ");
            stringBuilder3.append(this.ao);
            stringBuilder3.append(" ");
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        if (this.an != null) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append("id: ");
            stringBuilder3.append(this.an);
            stringBuilder3.append(" ");
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append("(");
        stringBuilder2.append(this.f487H);
        stringBuilder2.append(", ");
        stringBuilder2.append(this.f488I);
        stringBuilder2.append(") - (");
        stringBuilder2.append(this.f483D);
        stringBuilder2.append(" x ");
        stringBuilder2.append(this.f484E);
        stringBuilder2.append(") wrap: (");
        stringBuilder2.append(this.ai);
        stringBuilder2.append(" x ");
        stringBuilder2.append(this.aj);
        stringBuilder2.append(")");
        return stringBuilder2.toString();
    }

    /* renamed from: m */
    public int m541m() {
        return this.f487H;
    }

    /* renamed from: n */
    public int m543n() {
        return this.f488I;
    }

    /* renamed from: o */
    public int m545o() {
        if (this.am == 8) {
            return 0;
        }
        return this.f483D;
    }

    /* renamed from: p */
    public int m547p() {
        return this.ai;
    }

    /* renamed from: q */
    public int m549q() {
        if (this.am == 8) {
            return 0;
        }
        return this.f484E;
    }

    /* renamed from: r */
    public int m550r() {
        return this.aj;
    }

    /* renamed from: s */
    public int m551s() {
        return this.ae + this.f489J;
    }

    /* renamed from: t */
    public int m552t() {
        return this.af + this.f490K;
    }

    /* renamed from: u */
    protected int m553u() {
        return this.f487H + this.f489J;
    }

    /* renamed from: v */
    protected int m554v() {
        return this.f488I + this.f490K;
    }

    /* renamed from: w */
    public int m555w() {
        return m541m() + this.f483D;
    }

    /* renamed from: x */
    public int m556x() {
        return m543n() + this.f484E;
    }

    /* renamed from: y */
    public float m557y() {
        return this.f494P;
    }

    /* renamed from: z */
    public boolean m558z() {
        return this.f491L > 0;
    }

    /* renamed from: A */
    public int m480A() {
        return this.f491L;
    }

    /* renamed from: B */
    public Object m481B() {
        return this.ak;
    }

    /* renamed from: C */
    public ArrayList<ConstraintAnchor> mo151C() {
        return this.f480A;
    }

    /* renamed from: f */
    public void m528f(int i) {
        this.f487H = i;
    }

    /* renamed from: g */
    public void m530g(int i) {
        this.f488I = i;
    }

    /* renamed from: a */
    public void m489a(int i, int i2) {
        this.f487H = i;
        this.f488I = i2;
    }

    /* renamed from: b */
    public void mo162b(int i, int i2) {
        this.f489J = i;
        this.f490K = i2;
    }

    /* renamed from: D */
    public void mo160D() {
        int i = this.f487H;
        int i2 = this.f488I;
        int i3 = this.f487H + this.f483D;
        int i4 = this.f488I + this.f484E;
        this.ae = i;
        this.af = i2;
        this.ag = i3 - i;
        this.ah = i4 - i2;
    }

    /* renamed from: h */
    public void m532h(int i) {
        this.f483D = i;
        if (this.f483D < this.f492M) {
            this.f483D = this.f492M;
        }
    }

    /* renamed from: i */
    public void m534i(int i) {
        this.f484E = i;
        if (this.f484E < this.f493N) {
            this.f484E = this.f493N;
        }
    }

    /* renamed from: a */
    public void m490a(int i, int i2, int i3, float f) {
        this.f509e = i;
        this.f512h = i2;
        this.f513i = i3;
        this.f514j = f;
        if (f < 1065353216 && this.f509e == 0) {
            this.f509e = 2;
        }
    }

    /* renamed from: b */
    public void m509b(int i, int i2, int i3, float f) {
        this.f510f = i;
        this.f515k = i2;
        this.f516l = i3;
        this.f517m = f;
        if (f < 1065353216 && this.f510f == 0) {
            this.f510f = 2;
        }
    }

    /* renamed from: b */
    public void m513b(java.lang.String r9) {
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
        r8 = this;
        r0 = 0;
        if (r9 == 0) goto L_0x008e;
    L_0x0003:
        r1 = r9.length();
        if (r1 != 0) goto L_0x000b;
    L_0x0009:
        goto L_0x008e;
    L_0x000b:
        r1 = -1;
        r2 = r9.length();
        r3 = 44;
        r3 = r9.indexOf(r3);
        r4 = 0;
        r5 = 1;
        if (r3 <= 0) goto L_0x0037;
    L_0x001a:
        r6 = r2 + -1;
        if (r3 >= r6) goto L_0x0037;
    L_0x001e:
        r6 = r9.substring(r4, r3);
        r7 = "W";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x002c;
    L_0x002a:
        r1 = 0;
        goto L_0x0035;
    L_0x002c:
        r4 = "H";
        r4 = r6.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0035;
    L_0x0034:
        r1 = 1;
    L_0x0035:
        r4 = r3 + 1;
    L_0x0037:
        r3 = 58;
        r3 = r9.indexOf(r3);
        if (r3 < 0) goto L_0x0075;
    L_0x003f:
        r2 = r2 - r5;
        if (r3 >= r2) goto L_0x0075;
    L_0x0042:
        r2 = r9.substring(r4, r3);
        r3 = r3 + r5;
        r9 = r9.substring(r3);
        r3 = r2.length();
        if (r3 <= 0) goto L_0x0084;
    L_0x0051:
        r3 = r9.length();
        if (r3 <= 0) goto L_0x0084;
    L_0x0057:
        r2 = java.lang.Float.parseFloat(r2);	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0084 }
        if (r3 <= 0) goto L_0x0084;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0063:
        r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0084 }
        if (r3 <= 0) goto L_0x0084;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0067:
        if (r1 != r5) goto L_0x006f;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0069:
        r9 = r9 / r2;	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Math.abs(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x006f:
        r2 = r2 / r9;	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Math.abs(r2);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x0075:
        r9 = r9.substring(r4);
        r2 = r9.length();
        if (r2 <= 0) goto L_0x0084;
    L_0x007f:
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x0084:
        r9 = 0;
    L_0x0085:
        r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x008d;
    L_0x0089:
        r8.f485F = r9;
        r8.f486G = r1;
    L_0x008d:
        return;
    L_0x008e:
        r8.f485F = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.ConstraintWidget.b(java.lang.String):void");
    }

    /* renamed from: a */
    public void m488a(float f) {
        this.f494P = f;
    }

    /* renamed from: b */
    public void m506b(float f) {
        this.f495Q = f;
    }

    /* renamed from: j */
    public void m536j(int i) {
        if (i < 0) {
            this.f492M = 0;
        } else {
            this.f492M = i;
        }
    }

    /* renamed from: k */
    public void m538k(int i) {
        if (i < 0) {
            this.f493N = 0;
        } else {
            this.f493N = i;
        }
    }

    /* renamed from: l */
    public void m540l(int i) {
        this.ai = i;
    }

    /* renamed from: m */
    public void m542m(int i) {
        this.aj = i;
    }

    /* renamed from: a */
    public void m491a(int i, int i2, int i3, int i4) {
        i3 -= i;
        i4 -= i2;
        this.f487H = i;
        this.f488I = i2;
        if (this.am == 8) {
            this.f483D = 0;
            this.f484E = 0;
            return;
        }
        if (this.f481B[0] == DimensionBehaviour.FIXED && i3 < this.f483D) {
            i3 = this.f483D;
        }
        if (this.f481B[1] == DimensionBehaviour.FIXED && i4 < this.f484E) {
            i4 = this.f484E;
        }
        this.f483D = i3;
        this.f484E = i4;
        if (this.f484E < this.f493N) {
            this.f484E = this.f493N;
        }
        if (this.f483D < this.f492M) {
            this.f483D = this.f492M;
        }
    }

    /* renamed from: c */
    public void m518c(int i, int i2) {
        this.f487H = i;
        this.f483D = i2 - i;
        if (this.f483D < this.f492M) {
            this.f483D = this.f492M;
        }
    }

    /* renamed from: d */
    public void m523d(int i, int i2) {
        this.f488I = i;
        this.f484E = i2 - i;
        if (this.f484E < this.f493N) {
            this.f484E = this.f493N;
        }
    }

    /* renamed from: n */
    public void m544n(int i) {
        this.f491L = i;
    }

    /* renamed from: a */
    public void m501a(Object obj) {
        this.ak = obj;
    }

    /* renamed from: c */
    public void m516c(float f) {
        this.f502X[0] = f;
    }

    /* renamed from: d */
    public void m521d(float f) {
        this.f502X[1] = f;
    }

    /* renamed from: o */
    public void m546o(int i) {
        this.f498T = i;
    }

    /* renamed from: p */
    public void m548p(int i) {
        this.f499U = i;
    }

    /* renamed from: a */
    public boolean mo155a() {
        return this.am != 8;
    }

    /* renamed from: a */
    public void m495a(Type type, ConstraintWidget constraintWidget, Type type2, int i, int i2) {
        mo153a(type).m466a(constraintWidget.mo153a(type2), i, i2, Strength.STRONG, 0, true);
    }

    /* renamed from: a */
    public void m494a(Type type, ConstraintWidget constraintWidget, Type type2) {
        m496a(type, constraintWidget, type2, 0, Strength.STRONG);
    }

    /* renamed from: a */
    public void m496a(Type type, ConstraintWidget constraintWidget, Type type2, int i, Strength strength) {
        m497a(type, constraintWidget, type2, i, strength, 0);
    }

    /* renamed from: a */
    public void m497a(Type type, ConstraintWidget constraintWidget, Type type2, int i, Strength strength, int i2) {
        ConstraintWidget constraintWidget2 = this;
        Type type3 = type;
        ConstraintWidget constraintWidget3 = constraintWidget;
        Type type4 = type2;
        int i3 = i2;
        int i4 = 0;
        ConstraintAnchor a;
        ConstraintAnchor a2;
        if (type3 == Type.CENTER) {
            ConstraintWidget constraintWidget4;
            Strength strength2;
            int i5;
            if (type4 == Type.CENTER) {
                Object obj;
                a = mo153a(Type.LEFT);
                a2 = mo153a(Type.RIGHT);
                ConstraintAnchor a3 = mo153a(Type.TOP);
                ConstraintAnchor a4 = mo153a(Type.BOTTOM);
                Object obj2 = 1;
                if ((a == null || !a.m476j()) && (a2 == null || !a2.m476j())) {
                    constraintWidget4 = constraintWidget3;
                    strength2 = strength;
                    i5 = i3;
                    m497a(Type.LEFT, constraintWidget4, Type.LEFT, 0, strength2, i5);
                    m497a(Type.RIGHT, constraintWidget4, Type.RIGHT, 0, strength2, i5);
                    obj = 1;
                } else {
                    obj = null;
                }
                if ((a3 == null || !a3.m476j()) && (a4 == null || !a4.m476j())) {
                    constraintWidget4 = constraintWidget3;
                    strength2 = strength;
                    i5 = i3;
                    m497a(Type.TOP, constraintWidget4, Type.TOP, 0, strength2, i5);
                    m497a(Type.BOTTOM, constraintWidget4, Type.BOTTOM, 0, strength2, i5);
                } else {
                    obj2 = null;
                }
                if (obj != null && obj2 != null) {
                    mo153a(Type.CENTER).m465a(constraintWidget3.mo153a(Type.CENTER), 0, i3);
                    return;
                } else if (obj != null) {
                    mo153a(Type.CENTER_X).m465a(constraintWidget3.mo153a(Type.CENTER_X), 0, i3);
                    return;
                } else if (obj2 != null) {
                    mo153a(Type.CENTER_Y).m465a(constraintWidget3.mo153a(Type.CENTER_Y), 0, i3);
                    return;
                } else {
                    return;
                }
            }
            Type type5;
            if (type4 != Type.LEFT) {
                if (type4 != Type.RIGHT) {
                    if (type4 == Type.TOP || type4 == Type.BOTTOM) {
                        constraintWidget4 = constraintWidget3;
                        type5 = type4;
                        strength2 = strength;
                        i5 = i3;
                        m497a(Type.TOP, constraintWidget4, type5, 0, strength2, i5);
                        m497a(Type.BOTTOM, constraintWidget4, type5, 0, strength2, i5);
                        mo153a(Type.CENTER).m465a(constraintWidget.mo153a(type2), 0, i3);
                        return;
                    }
                    return;
                }
            }
            constraintWidget4 = constraintWidget3;
            type5 = type4;
            strength2 = strength;
            i5 = i3;
            m497a(Type.LEFT, constraintWidget4, type5, 0, strength2, i5);
            m497a(Type.RIGHT, constraintWidget4, type5, 0, strength2, i5);
            mo153a(Type.CENTER).m465a(constraintWidget.mo153a(type2), 0, i3);
        } else if (type3 == Type.CENTER_X && (type4 == Type.LEFT || type4 == Type.RIGHT)) {
            a = mo153a(Type.LEFT);
            a2 = constraintWidget.mo153a(type2);
            r2 = mo153a(Type.RIGHT);
            a.m465a(a2, 0, i3);
            r2.m465a(a2, 0, i3);
            mo153a(Type.CENTER_X).m465a(a2, 0, i3);
        } else if (type3 == Type.CENTER_Y && (type4 == Type.TOP || type4 == Type.BOTTOM)) {
            a = constraintWidget.mo153a(type2);
            mo153a(Type.TOP).m465a(a, 0, i3);
            mo153a(Type.BOTTOM).m465a(a, 0, i3);
            mo153a(Type.CENTER_Y).m465a(a, 0, i3);
        } else if (type3 == Type.CENTER_X && type4 == Type.CENTER_X) {
            mo153a(Type.LEFT).m465a(constraintWidget3.mo153a(Type.LEFT), 0, i3);
            mo153a(Type.RIGHT).m465a(constraintWidget3.mo153a(Type.RIGHT), 0, i3);
            mo153a(Type.CENTER_X).m465a(constraintWidget.mo153a(type2), 0, i3);
        } else if (type3 == Type.CENTER_Y && type4 == Type.CENTER_Y) {
            mo153a(Type.TOP).m465a(constraintWidget3.mo153a(Type.TOP), 0, i3);
            mo153a(Type.BOTTOM).m465a(constraintWidget3.mo153a(Type.BOTTOM), 0, i3);
            mo153a(Type.CENTER_Y).m465a(constraintWidget.mo153a(type2), 0, i3);
        } else {
            a2 = mo153a(type);
            r2 = constraintWidget.mo153a(type2);
            if (a2.m464a(r2)) {
                ConstraintAnchor a5;
                if (type3 == Type.BASELINE) {
                    a = mo153a(Type.TOP);
                    a5 = mo153a(Type.BOTTOM);
                    if (a != null) {
                        a.m475i();
                    }
                    if (a5 != null) {
                        a5.m475i();
                    }
                } else {
                    if (type3 != Type.TOP) {
                        if (type3 != Type.BOTTOM) {
                            if (type3 == Type.LEFT || type3 == Type.RIGHT) {
                                a5 = mo153a(Type.CENTER);
                                if (a5.m473g() != r2) {
                                    a5.m475i();
                                }
                                a = mo153a(type).m477k();
                                a5 = mo153a(Type.CENTER_X);
                                if (a5.m476j()) {
                                    a.m475i();
                                    a5.m475i();
                                }
                            }
                            i4 = i;
                        }
                    }
                    a5 = mo153a(Type.BASELINE);
                    if (a5 != null) {
                        a5.m475i();
                    }
                    a5 = mo153a(Type.CENTER);
                    if (a5.m473g() != r2) {
                        a5.m475i();
                    }
                    a = mo153a(type).m477k();
                    a5 = mo153a(Type.CENTER_Y);
                    if (a5.m476j()) {
                        a.m475i();
                        a5.m475i();
                    }
                    i4 = i;
                }
                a2.m467a(r2, i4, strength, i3);
                r2.m469c().m512b(a2.m469c());
            }
        }
    }

    /* renamed from: E */
    public void m484E() {
        ConstraintWidget j = m535j();
        if (j == null || !(j instanceof C3987d) || !((C3987d) m535j()).m15594Q()) {
            int size = this.f480A.size();
            for (int i = 0; i < size; i++) {
                ((ConstraintAnchor) this.f480A.get(i)).m475i();
            }
        }
    }

    /* renamed from: a */
    public ConstraintAnchor mo153a(Type type) {
        switch (type) {
            case LEFT:
                return this.f522r;
            case TOP:
                return this.f523s;
            case RIGHT:
                return this.f524t;
            case BOTTOM:
                return this.f525u;
            case BASELINE:
                return this.f526v;
            case CENTER:
                return this.f529y;
            case CENTER_X:
                return this.f527w;
            case CENTER_Y:
                return this.f528x;
            case NONE:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* renamed from: F */
    public DimensionBehaviour m485F() {
        return this.f481B[0];
    }

    /* renamed from: G */
    public DimensionBehaviour m486G() {
        return this.f481B[1];
    }

    /* renamed from: a */
    public void m498a(DimensionBehaviour dimensionBehaviour) {
        this.f481B[0] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            m532h(this.ai);
        }
    }

    /* renamed from: b */
    public void m511b(DimensionBehaviour dimensionBehaviour) {
        this.f481B[1] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            m534i(this.aj);
        }
    }

    /* renamed from: a */
    public void mo154a(C0140e c0140e) {
        ConstraintWidget constraintWidget;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        Object obj;
        boolean z6;
        boolean z7;
        boolean j;
        boolean z8;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        C0140e c0140e2;
        SolverVariable solverVariable5;
        boolean z9;
        int i4;
        SolverVariable solverVariable6;
        ConstraintWidget constraintWidget2;
        C0140e c0140e3 = c0140e;
        SolverVariable a = c0140e3.m438a(this.f522r);
        SolverVariable a2 = c0140e3.m438a(this.f524t);
        SolverVariable a3 = c0140e3.m438a(this.f523s);
        SolverVariable a4 = c0140e3.m438a(this.f525u);
        SolverVariable a5 = c0140e3.m438a(this.f526v);
        if (this.f482C != null) {
            boolean z10 = constraintWidget.f482C != null && constraintWidget.f482C.f481B[0] == DimensionBehaviour.WRAP_CONTENT;
            z = constraintWidget.f482C != null && constraintWidget.f482C.f481B[1] == DimensionBehaviour.WRAP_CONTENT;
            if (!(constraintWidget.f522r.f469c == null || constraintWidget.f522r.f469c.f469c == constraintWidget.f522r || constraintWidget.f524t.f469c == null || constraintWidget.f524t.f469c.f469c != constraintWidget.f524t)) {
                ((C3987d) constraintWidget.f482C).m15598a(constraintWidget, 0);
            }
            boolean z11 = (constraintWidget.f522r.f469c != null && constraintWidget.f522r.f469c.f469c == constraintWidget.f522r) || (constraintWidget.f524t.f469c != null && constraintWidget.f524t.f469c.f469c == constraintWidget.f524t);
            if (!(constraintWidget.f523s.f469c == null || constraintWidget.f523s.f469c.f469c == constraintWidget.f523s || constraintWidget.f525u.f469c == null || constraintWidget.f525u.f469c.f469c != constraintWidget.f525u)) {
                ((C3987d) constraintWidget.f482C).m15598a(constraintWidget, 1);
            }
            z2 = (constraintWidget.f523s.f469c != null && constraintWidget.f523s.f469c.f469c == constraintWidget.f523s) || (constraintWidget.f525u.f469c != null && constraintWidget.f525u.f469c.f469c == constraintWidget.f525u);
            if (z10 && constraintWidget.am != 8 && constraintWidget.f522r.f469c == null && constraintWidget.f524t.f469c == null) {
                c0140e3.m441a(c0140e3.m438a(constraintWidget.f482C.f524t), a2, 0, 1);
            }
            if (z && constraintWidget.am != 8 && constraintWidget.f523s.f469c == null && constraintWidget.f525u.f469c == null && constraintWidget.f526v == null) {
                c0140e3.m441a(c0140e3.m438a(constraintWidget.f482C.f525u), a4, 0, 1);
            }
            z3 = z;
            z4 = z11;
            z5 = z2;
            z = z10;
        } else {
            z = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        int i5 = constraintWidget.f483D;
        if (i5 < constraintWidget.f492M) {
            i5 = constraintWidget.f492M;
        }
        int i6 = constraintWidget.f484E;
        if (i6 < constraintWidget.f493N) {
            i6 = constraintWidget.f493N;
        }
        z2 = constraintWidget.f481B[0] != DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z12 = constraintWidget.f481B[1] != DimensionBehaviour.MATCH_CONSTRAINT;
        constraintWidget.f520p = constraintWidget.f486G;
        constraintWidget.f521q = constraintWidget.f485F;
        int i7 = constraintWidget.f509e;
        int i8 = constraintWidget.f510f;
        int i9 = 4;
        if (constraintWidget.f485F <= 0.0f || constraintWidget.am == 8) {
            i = i6;
            i9 = i7;
            i2 = i8;
            i3 = i5;
        } else {
            int i10 = i5;
            if (constraintWidget.f481B[0] == DimensionBehaviour.MATCH_CONSTRAINT && i7 == 0) {
                i7 = 3;
            }
            if (constraintWidget.f481B[1] == DimensionBehaviour.MATCH_CONSTRAINT && i8 == 0) {
                i8 = 3;
            }
            if (constraintWidget.f481B[0] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f481B[1] == DimensionBehaviour.MATCH_CONSTRAINT && i7 == 3 && i8 == 3) {
                m503a(z, z3, z2, z12);
            } else if (constraintWidget.f481B[0] == DimensionBehaviour.MATCH_CONSTRAINT && i7 == 3) {
                constraintWidget.f520p = 0;
                i5 = (int) (constraintWidget.f521q * ((float) constraintWidget.f484E));
                if (constraintWidget.f481B[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
                    i3 = i5;
                    i = i6;
                    i2 = i8;
                } else {
                    i3 = i5;
                    i = i6;
                    i9 = i7;
                    i2 = i8;
                    obj = 1;
                    constraintWidget.f511g[0] = i9;
                    constraintWidget.f511g[1] = i2;
                    if (obj == null) {
                        if (constraintWidget.f520p == 0) {
                            if (constraintWidget.f520p == -1) {
                            }
                        }
                        z6 = true;
                        if (constraintWidget.f481B[0] != DimensionBehaviour.WRAP_CONTENT) {
                        }
                        j = constraintWidget.f529y.m476j() ^ 1;
                        if (constraintWidget.f505a == 2) {
                            if (constraintWidget.f482C == null) {
                            }
                            if (constraintWidget.f482C == null) {
                            }
                            z8 = z3;
                            solverVariable = a5;
                            solverVariable2 = a4;
                            solverVariable3 = a3;
                            solverVariable4 = a2;
                            m479a(c0140e3, z, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f522r) : null, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f524t) : null, constraintWidget.f481B[0], z7, constraintWidget.f522r, constraintWidget.f524t, constraintWidget.f487H, i3, constraintWidget.f492M, constraintWidget.ac[0], constraintWidget.f494P, z6, z4, i9, constraintWidget.f512h, constraintWidget.f513i, constraintWidget.f514j, j);
                            constraintWidget = this;
                        } else {
                            z8 = z3;
                            solverVariable = a5;
                            solverVariable2 = a4;
                            solverVariable3 = a3;
                            solverVariable4 = a2;
                        }
                        if (constraintWidget.f506b != 2) {
                            if (constraintWidget.f481B[1] != DimensionBehaviour.WRAP_CONTENT) {
                            }
                            if (obj == null) {
                            }
                            if (constraintWidget.f491L <= 0) {
                                a3 = solverVariable3;
                                c0140e2 = c0140e;
                            } else if (constraintWidget.f526v.m462a().i != 1) {
                                c0140e2 = c0140e;
                                constraintWidget.f526v.m462a().m10648a(c0140e2);
                                a3 = solverVariable3;
                            } else {
                                c0140e2 = c0140e;
                                solverVariable5 = solverVariable;
                                a3 = solverVariable3;
                                c0140e2.m454c(solverVariable5, a3, m480A(), 6);
                                if (constraintWidget.f526v.f469c != null) {
                                    c0140e2.m454c(solverVariable5, c0140e2.m438a(constraintWidget.f526v.f469c), 0, 6);
                                    z9 = false;
                                    if (constraintWidget.f482C == null) {
                                    }
                                    if (constraintWidget.f482C == null) {
                                    }
                                    i4 = i;
                                    solverVariable6 = a3;
                                    constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                                    if (obj == null) {
                                        constraintWidget2 = this;
                                    } else if (this.f520p != 1) {
                                        c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                                    } else {
                                        c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                                    }
                                    if (constraintWidget2.f529y.m476j()) {
                                        c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                                    }
                                }
                            }
                            z9 = j;
                            if (constraintWidget.f482C == null) {
                            }
                            if (constraintWidget.f482C == null) {
                            }
                            i4 = i;
                            solverVariable6 = a3;
                            constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                            if (obj == null) {
                                constraintWidget2 = this;
                            } else if (this.f520p != 1) {
                                c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                            } else {
                                c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                            }
                            if (constraintWidget2.f529y.m476j()) {
                                c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                            }
                        }
                    }
                    z6 = false;
                    if (constraintWidget.f481B[0] != DimensionBehaviour.WRAP_CONTENT) {
                    }
                    j = constraintWidget.f529y.m476j() ^ 1;
                    if (constraintWidget.f505a == 2) {
                        z8 = z3;
                        solverVariable = a5;
                        solverVariable2 = a4;
                        solverVariable3 = a3;
                        solverVariable4 = a2;
                    } else {
                        if (constraintWidget.f482C == null) {
                        }
                        if (constraintWidget.f482C == null) {
                        }
                        z8 = z3;
                        solverVariable = a5;
                        solverVariable2 = a4;
                        solverVariable3 = a3;
                        solverVariable4 = a2;
                        m479a(c0140e3, z, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f522r) : null, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f524t) : null, constraintWidget.f481B[0], z7, constraintWidget.f522r, constraintWidget.f524t, constraintWidget.f487H, i3, constraintWidget.f492M, constraintWidget.ac[0], constraintWidget.f494P, z6, z4, i9, constraintWidget.f512h, constraintWidget.f513i, constraintWidget.f514j, j);
                        constraintWidget = this;
                    }
                    if (constraintWidget.f506b != 2) {
                        if (constraintWidget.f481B[1] != DimensionBehaviour.WRAP_CONTENT) {
                        }
                        if (obj == null) {
                        }
                        if (constraintWidget.f491L <= 0) {
                            a3 = solverVariable3;
                            c0140e2 = c0140e;
                        } else if (constraintWidget.f526v.m462a().i != 1) {
                            c0140e2 = c0140e;
                            solverVariable5 = solverVariable;
                            a3 = solverVariable3;
                            c0140e2.m454c(solverVariable5, a3, m480A(), 6);
                            if (constraintWidget.f526v.f469c != null) {
                                c0140e2.m454c(solverVariable5, c0140e2.m438a(constraintWidget.f526v.f469c), 0, 6);
                                z9 = false;
                                if (constraintWidget.f482C == null) {
                                }
                                if (constraintWidget.f482C == null) {
                                }
                                i4 = i;
                                solverVariable6 = a3;
                                constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                                if (obj == null) {
                                    constraintWidget2 = this;
                                } else if (this.f520p != 1) {
                                    c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                                } else {
                                    c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                                }
                                if (constraintWidget2.f529y.m476j()) {
                                    c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                                }
                            }
                        } else {
                            c0140e2 = c0140e;
                            constraintWidget.f526v.m462a().m10648a(c0140e2);
                            a3 = solverVariable3;
                        }
                        z9 = j;
                        if (constraintWidget.f482C == null) {
                        }
                        if (constraintWidget.f482C == null) {
                        }
                        i4 = i;
                        solverVariable6 = a3;
                        constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                        if (obj == null) {
                            constraintWidget2 = this;
                        } else if (this.f520p != 1) {
                            c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                        } else {
                            c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                        }
                        if (constraintWidget2.f529y.m476j()) {
                            c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                        }
                    }
                }
            } else if (constraintWidget.f481B[1] == DimensionBehaviour.MATCH_CONSTRAINT && i8 == 3) {
                constraintWidget.f520p = 1;
                if (constraintWidget.f486G == -1) {
                    constraintWidget.f521q = 1.0f / constraintWidget.f521q;
                }
                i5 = (int) (constraintWidget.f521q * ((float) constraintWidget.f483D));
                if (constraintWidget.f481B[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
                    i = i5;
                    i9 = i7;
                    i3 = i10;
                    i2 = 4;
                } else {
                    i = i5;
                    i9 = i7;
                    i2 = i8;
                    i3 = i10;
                    obj = 1;
                    constraintWidget.f511g[0] = i9;
                    constraintWidget.f511g[1] = i2;
                    if (obj == null) {
                        if (constraintWidget.f520p == 0) {
                            if (constraintWidget.f520p == -1) {
                            }
                        }
                        z6 = true;
                        z7 = constraintWidget.f481B[0] != DimensionBehaviour.WRAP_CONTENT && (constraintWidget instanceof C3987d);
                        j = constraintWidget.f529y.m476j() ^ 1;
                        if (constraintWidget.f505a == 2) {
                            z8 = z3;
                            solverVariable = a5;
                            solverVariable2 = a4;
                            solverVariable3 = a3;
                            solverVariable4 = a2;
                            m479a(c0140e3, z, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f522r) : null, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f524t) : null, constraintWidget.f481B[0], z7, constraintWidget.f522r, constraintWidget.f524t, constraintWidget.f487H, i3, constraintWidget.f492M, constraintWidget.ac[0], constraintWidget.f494P, z6, z4, i9, constraintWidget.f512h, constraintWidget.f513i, constraintWidget.f514j, j);
                            constraintWidget = this;
                        } else {
                            z8 = z3;
                            solverVariable = a5;
                            solverVariable2 = a4;
                            solverVariable3 = a3;
                            solverVariable4 = a2;
                        }
                        if (constraintWidget.f506b != 2) {
                            z7 = constraintWidget.f481B[1] != DimensionBehaviour.WRAP_CONTENT && (constraintWidget instanceof C3987d);
                            z4 = obj == null && (constraintWidget.f520p == 1 || constraintWidget.f520p == -1);
                            if (constraintWidget.f491L <= 0) {
                                a3 = solverVariable3;
                                c0140e2 = c0140e;
                            } else if (constraintWidget.f526v.m462a().i != 1) {
                                c0140e2 = c0140e;
                                constraintWidget.f526v.m462a().m10648a(c0140e2);
                                a3 = solverVariable3;
                            } else {
                                c0140e2 = c0140e;
                                solverVariable5 = solverVariable;
                                a3 = solverVariable3;
                                c0140e2.m454c(solverVariable5, a3, m480A(), 6);
                                if (constraintWidget.f526v.f469c != null) {
                                    c0140e2.m454c(solverVariable5, c0140e2.m438a(constraintWidget.f526v.f469c), 0, 6);
                                    z9 = false;
                                    i4 = i;
                                    solverVariable6 = a3;
                                    constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                                    if (obj == null) {
                                        constraintWidget2 = this;
                                    } else if (this.f520p != 1) {
                                        c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                                    } else {
                                        c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                                    }
                                    if (constraintWidget2.f529y.m476j()) {
                                        c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                                    }
                                }
                            }
                            z9 = j;
                            if (constraintWidget.f482C == null) {
                            }
                            if (constraintWidget.f482C == null) {
                            }
                            i4 = i;
                            solverVariable6 = a3;
                            constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                            if (obj == null) {
                                constraintWidget2 = this;
                            } else if (this.f520p != 1) {
                                c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                            } else {
                                c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                            }
                            if (constraintWidget2.f529y.m476j()) {
                                c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                            }
                        }
                    }
                    z6 = false;
                    if (constraintWidget.f481B[0] != DimensionBehaviour.WRAP_CONTENT) {
                    }
                    j = constraintWidget.f529y.m476j() ^ 1;
                    if (constraintWidget.f505a == 2) {
                        z8 = z3;
                        solverVariable = a5;
                        solverVariable2 = a4;
                        solverVariable3 = a3;
                        solverVariable4 = a2;
                    } else {
                        if (constraintWidget.f482C == null) {
                        }
                        if (constraintWidget.f482C == null) {
                        }
                        z8 = z3;
                        solverVariable = a5;
                        solverVariable2 = a4;
                        solverVariable3 = a3;
                        solverVariable4 = a2;
                        m479a(c0140e3, z, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f522r) : null, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f524t) : null, constraintWidget.f481B[0], z7, constraintWidget.f522r, constraintWidget.f524t, constraintWidget.f487H, i3, constraintWidget.f492M, constraintWidget.ac[0], constraintWidget.f494P, z6, z4, i9, constraintWidget.f512h, constraintWidget.f513i, constraintWidget.f514j, j);
                        constraintWidget = this;
                    }
                    if (constraintWidget.f506b != 2) {
                        if (constraintWidget.f481B[1] != DimensionBehaviour.WRAP_CONTENT) {
                        }
                        if (obj == null) {
                        }
                        if (constraintWidget.f491L <= 0) {
                            a3 = solverVariable3;
                            c0140e2 = c0140e;
                        } else if (constraintWidget.f526v.m462a().i != 1) {
                            c0140e2 = c0140e;
                            solverVariable5 = solverVariable;
                            a3 = solverVariable3;
                            c0140e2.m454c(solverVariable5, a3, m480A(), 6);
                            if (constraintWidget.f526v.f469c != null) {
                                c0140e2.m454c(solverVariable5, c0140e2.m438a(constraintWidget.f526v.f469c), 0, 6);
                                z9 = false;
                                if (constraintWidget.f482C == null) {
                                }
                                if (constraintWidget.f482C == null) {
                                }
                                i4 = i;
                                solverVariable6 = a3;
                                constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                                if (obj == null) {
                                    constraintWidget2 = this;
                                } else if (this.f520p != 1) {
                                    c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                                } else {
                                    c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                                }
                                if (constraintWidget2.f529y.m476j()) {
                                    c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                                }
                            }
                        } else {
                            c0140e2 = c0140e;
                            constraintWidget.f526v.m462a().m10648a(c0140e2);
                            a3 = solverVariable3;
                        }
                        z9 = j;
                        if (constraintWidget.f482C == null) {
                        }
                        if (constraintWidget.f482C == null) {
                        }
                        i4 = i;
                        solverVariable6 = a3;
                        constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                        if (obj == null) {
                            constraintWidget2 = this;
                        } else if (this.f520p != 1) {
                            c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                        } else {
                            c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                        }
                        if (constraintWidget2.f529y.m476j()) {
                            c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                        }
                    }
                }
            }
            i = i6;
            i9 = i7;
            i2 = i8;
            i3 = i10;
            obj = 1;
            constraintWidget.f511g[0] = i9;
            constraintWidget.f511g[1] = i2;
            if (obj == null) {
                if (constraintWidget.f520p == 0) {
                    if (constraintWidget.f520p == -1) {
                    }
                }
                z6 = true;
                if (constraintWidget.f481B[0] != DimensionBehaviour.WRAP_CONTENT) {
                }
                j = constraintWidget.f529y.m476j() ^ 1;
                if (constraintWidget.f505a == 2) {
                    if (constraintWidget.f482C == null) {
                    }
                    if (constraintWidget.f482C == null) {
                    }
                    z8 = z3;
                    solverVariable = a5;
                    solverVariable2 = a4;
                    solverVariable3 = a3;
                    solverVariable4 = a2;
                    m479a(c0140e3, z, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f522r) : null, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f524t) : null, constraintWidget.f481B[0], z7, constraintWidget.f522r, constraintWidget.f524t, constraintWidget.f487H, i3, constraintWidget.f492M, constraintWidget.ac[0], constraintWidget.f494P, z6, z4, i9, constraintWidget.f512h, constraintWidget.f513i, constraintWidget.f514j, j);
                    constraintWidget = this;
                } else {
                    z8 = z3;
                    solverVariable = a5;
                    solverVariable2 = a4;
                    solverVariable3 = a3;
                    solverVariable4 = a2;
                }
                if (constraintWidget.f506b != 2) {
                    if (constraintWidget.f481B[1] != DimensionBehaviour.WRAP_CONTENT) {
                    }
                    if (obj == null) {
                    }
                    if (constraintWidget.f491L <= 0) {
                        a3 = solverVariable3;
                        c0140e2 = c0140e;
                    } else if (constraintWidget.f526v.m462a().i != 1) {
                        c0140e2 = c0140e;
                        constraintWidget.f526v.m462a().m10648a(c0140e2);
                        a3 = solverVariable3;
                    } else {
                        c0140e2 = c0140e;
                        solverVariable5 = solverVariable;
                        a3 = solverVariable3;
                        c0140e2.m454c(solverVariable5, a3, m480A(), 6);
                        if (constraintWidget.f526v.f469c != null) {
                            c0140e2.m454c(solverVariable5, c0140e2.m438a(constraintWidget.f526v.f469c), 0, 6);
                            z9 = false;
                            if (constraintWidget.f482C == null) {
                            }
                            if (constraintWidget.f482C == null) {
                            }
                            i4 = i;
                            solverVariable6 = a3;
                            constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                            if (obj == null) {
                                constraintWidget2 = this;
                            } else if (this.f520p != 1) {
                                c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                            } else {
                                c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                            }
                            if (constraintWidget2.f529y.m476j()) {
                                c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                            }
                        }
                    }
                    z9 = j;
                    if (constraintWidget.f482C == null) {
                    }
                    if (constraintWidget.f482C == null) {
                    }
                    i4 = i;
                    solverVariable6 = a3;
                    constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                    if (obj == null) {
                        constraintWidget2 = this;
                    } else if (this.f520p != 1) {
                        c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                    } else {
                        c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                    }
                    if (constraintWidget2.f529y.m476j()) {
                        c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                    }
                }
            }
            z6 = false;
            if (constraintWidget.f481B[0] != DimensionBehaviour.WRAP_CONTENT) {
            }
            j = constraintWidget.f529y.m476j() ^ 1;
            if (constraintWidget.f505a == 2) {
                z8 = z3;
                solverVariable = a5;
                solverVariable2 = a4;
                solverVariable3 = a3;
                solverVariable4 = a2;
            } else {
                if (constraintWidget.f482C == null) {
                }
                if (constraintWidget.f482C == null) {
                }
                z8 = z3;
                solverVariable = a5;
                solverVariable2 = a4;
                solverVariable3 = a3;
                solverVariable4 = a2;
                m479a(c0140e3, z, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f522r) : null, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f524t) : null, constraintWidget.f481B[0], z7, constraintWidget.f522r, constraintWidget.f524t, constraintWidget.f487H, i3, constraintWidget.f492M, constraintWidget.ac[0], constraintWidget.f494P, z6, z4, i9, constraintWidget.f512h, constraintWidget.f513i, constraintWidget.f514j, j);
                constraintWidget = this;
            }
            if (constraintWidget.f506b != 2) {
                if (constraintWidget.f481B[1] != DimensionBehaviour.WRAP_CONTENT) {
                }
                if (obj == null) {
                }
                if (constraintWidget.f491L <= 0) {
                    a3 = solverVariable3;
                    c0140e2 = c0140e;
                } else if (constraintWidget.f526v.m462a().i != 1) {
                    c0140e2 = c0140e;
                    solverVariable5 = solverVariable;
                    a3 = solverVariable3;
                    c0140e2.m454c(solverVariable5, a3, m480A(), 6);
                    if (constraintWidget.f526v.f469c != null) {
                        c0140e2.m454c(solverVariable5, c0140e2.m438a(constraintWidget.f526v.f469c), 0, 6);
                        z9 = false;
                        if (constraintWidget.f482C == null) {
                        }
                        if (constraintWidget.f482C == null) {
                        }
                        i4 = i;
                        solverVariable6 = a3;
                        constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                        if (obj == null) {
                            constraintWidget2 = this;
                        } else if (this.f520p != 1) {
                            c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                        } else {
                            c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                        }
                        if (constraintWidget2.f529y.m476j()) {
                            c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                        }
                    }
                } else {
                    c0140e2 = c0140e;
                    constraintWidget.f526v.m462a().m10648a(c0140e2);
                    a3 = solverVariable3;
                }
                z9 = j;
                if (constraintWidget.f482C == null) {
                }
                if (constraintWidget.f482C == null) {
                }
                i4 = i;
                solverVariable6 = a3;
                constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                if (obj == null) {
                    constraintWidget2 = this;
                } else if (this.f520p != 1) {
                    c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                } else {
                    c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                }
                if (constraintWidget2.f529y.m476j()) {
                    c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                }
            }
        }
        obj = null;
        constraintWidget.f511g[0] = i9;
        constraintWidget.f511g[1] = i2;
        if (obj == null) {
            if (constraintWidget.f520p == 0) {
                if (constraintWidget.f520p == -1) {
                }
            }
            z6 = true;
            if (constraintWidget.f481B[0] != DimensionBehaviour.WRAP_CONTENT) {
            }
            j = constraintWidget.f529y.m476j() ^ 1;
            if (constraintWidget.f505a == 2) {
                if (constraintWidget.f482C == null) {
                }
                if (constraintWidget.f482C == null) {
                }
                z8 = z3;
                solverVariable = a5;
                solverVariable2 = a4;
                solverVariable3 = a3;
                solverVariable4 = a2;
                m479a(c0140e3, z, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f522r) : null, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f524t) : null, constraintWidget.f481B[0], z7, constraintWidget.f522r, constraintWidget.f524t, constraintWidget.f487H, i3, constraintWidget.f492M, constraintWidget.ac[0], constraintWidget.f494P, z6, z4, i9, constraintWidget.f512h, constraintWidget.f513i, constraintWidget.f514j, j);
                constraintWidget = this;
            } else {
                z8 = z3;
                solverVariable = a5;
                solverVariable2 = a4;
                solverVariable3 = a3;
                solverVariable4 = a2;
            }
            if (constraintWidget.f506b != 2) {
                if (constraintWidget.f481B[1] != DimensionBehaviour.WRAP_CONTENT) {
                }
                if (obj == null) {
                }
                if (constraintWidget.f491L <= 0) {
                    a3 = solverVariable3;
                    c0140e2 = c0140e;
                } else if (constraintWidget.f526v.m462a().i != 1) {
                    c0140e2 = c0140e;
                    constraintWidget.f526v.m462a().m10648a(c0140e2);
                    a3 = solverVariable3;
                } else {
                    c0140e2 = c0140e;
                    solverVariable5 = solverVariable;
                    a3 = solverVariable3;
                    c0140e2.m454c(solverVariable5, a3, m480A(), 6);
                    if (constraintWidget.f526v.f469c != null) {
                        c0140e2.m454c(solverVariable5, c0140e2.m438a(constraintWidget.f526v.f469c), 0, 6);
                        z9 = false;
                        if (constraintWidget.f482C == null) {
                        }
                        if (constraintWidget.f482C == null) {
                        }
                        i4 = i;
                        solverVariable6 = a3;
                        constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                        if (obj == null) {
                            constraintWidget2 = this;
                        } else if (this.f520p != 1) {
                            c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                        } else {
                            c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                        }
                        if (constraintWidget2.f529y.m476j()) {
                            c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                        }
                    }
                }
                z9 = j;
                if (constraintWidget.f482C == null) {
                }
                if (constraintWidget.f482C == null) {
                }
                i4 = i;
                solverVariable6 = a3;
                constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                if (obj == null) {
                    constraintWidget2 = this;
                } else if (this.f520p != 1) {
                    c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                } else {
                    c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                }
                if (constraintWidget2.f529y.m476j()) {
                    c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                }
            }
        }
        z6 = false;
        if (constraintWidget.f481B[0] != DimensionBehaviour.WRAP_CONTENT) {
        }
        j = constraintWidget.f529y.m476j() ^ 1;
        if (constraintWidget.f505a == 2) {
            z8 = z3;
            solverVariable = a5;
            solverVariable2 = a4;
            solverVariable3 = a3;
            solverVariable4 = a2;
        } else {
            if (constraintWidget.f482C == null) {
            }
            if (constraintWidget.f482C == null) {
            }
            z8 = z3;
            solverVariable = a5;
            solverVariable2 = a4;
            solverVariable3 = a3;
            solverVariable4 = a2;
            m479a(c0140e3, z, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f522r) : null, constraintWidget.f482C == null ? c0140e3.m438a(constraintWidget.f482C.f524t) : null, constraintWidget.f481B[0], z7, constraintWidget.f522r, constraintWidget.f524t, constraintWidget.f487H, i3, constraintWidget.f492M, constraintWidget.ac[0], constraintWidget.f494P, z6, z4, i9, constraintWidget.f512h, constraintWidget.f513i, constraintWidget.f514j, j);
            constraintWidget = this;
        }
        if (constraintWidget.f506b != 2) {
            if (constraintWidget.f481B[1] != DimensionBehaviour.WRAP_CONTENT) {
            }
            if (obj == null) {
            }
            if (constraintWidget.f491L <= 0) {
                a3 = solverVariable3;
                c0140e2 = c0140e;
            } else if (constraintWidget.f526v.m462a().i != 1) {
                c0140e2 = c0140e;
                solverVariable5 = solverVariable;
                a3 = solverVariable3;
                c0140e2.m454c(solverVariable5, a3, m480A(), 6);
                if (constraintWidget.f526v.f469c != null) {
                    c0140e2.m454c(solverVariable5, c0140e2.m438a(constraintWidget.f526v.f469c), 0, 6);
                    z9 = false;
                    if (constraintWidget.f482C == null) {
                    }
                    if (constraintWidget.f482C == null) {
                    }
                    i4 = i;
                    solverVariable6 = a3;
                    constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
                    if (obj == null) {
                        constraintWidget2 = this;
                    } else if (this.f520p != 1) {
                        c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
                    } else {
                        c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
                    }
                    if (constraintWidget2.f529y.m476j()) {
                        c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
                    }
                }
            } else {
                c0140e2 = c0140e;
                constraintWidget.f526v.m462a().m10648a(c0140e2);
                a3 = solverVariable3;
            }
            z9 = j;
            if (constraintWidget.f482C == null) {
            }
            if (constraintWidget.f482C == null) {
            }
            i4 = i;
            solverVariable6 = a3;
            constraintWidget.m479a(c0140e2, z8, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f523s) : null, constraintWidget.f482C == null ? c0140e2.m438a(constraintWidget.f482C.f525u) : null, constraintWidget.f481B[1], z7, constraintWidget.f523s, constraintWidget.f525u, constraintWidget.f488I, i4, constraintWidget.f493N, constraintWidget.ac[1], constraintWidget.f495Q, z4, z5, i2, constraintWidget.f515k, constraintWidget.f516l, constraintWidget.f517m, z9);
            if (obj == null) {
                constraintWidget2 = this;
            } else if (this.f520p != 1) {
                c0140e.m442a(solverVariable4, a, solverVariable2, solverVariable6, constraintWidget2.f521q, 6);
            } else {
                c0140e.m442a(solverVariable2, solverVariable6, solverVariable4, a, constraintWidget2.f521q, 6);
            }
            if (constraintWidget2.f529y.m476j()) {
                c0140e.m448a(constraintWidget2, constraintWidget2.f529y.m473g().m469c(), (float) Math.toRadians((double) (constraintWidget2.ad + 90.0f)), constraintWidget2.f529y.m471e());
            }
        }
    }

    /* renamed from: a */
    public void m503a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f520p == -1) {
            if (z3 && !z4) {
                this.f520p = 0;
            } else if (!z3 && z4) {
                this.f520p = 1;
                if (this.f486G) {
                    this.f521q = true / this.f521q;
                }
            }
        }
        if (!this.f520p && (!this.f523s.m476j() || !this.f525u.m476j())) {
            this.f520p = 1;
        } else if (this.f520p && !(this.f522r.m476j() && this.f524t.m476j())) {
            this.f520p = 0;
        }
        if (this.f520p && !(this.f523s.m476j() && this.f525u.m476j() && this.f522r.m476j() && this.f524t.m476j())) {
            if (this.f523s.m476j() && this.f525u.m476j()) {
                this.f520p = 0;
            } else if (this.f522r.m476j() && this.f524t.m476j()) {
                this.f521q = true / this.f521q;
                this.f520p = 1;
            }
        }
        if (this.f520p) {
            if (z && !z2) {
                this.f520p = 0;
            } else if (!z && z2) {
                this.f521q = true / this.f521q;
                this.f520p = 1;
            }
        }
        if (this.f520p) {
            if (this.f512h <= false && !this.f515k) {
                this.f520p = 0;
            } else if (!this.f512h && this.f515k <= false) {
                this.f521q = true / this.f521q;
                this.f520p = 1;
            }
        }
        if (this.f520p && z && z2) {
            this.f521q = 1.0f / this.f521q;
            this.f520p = 1;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m479a(android.support.constraint.solver.C0140e r33, boolean r34, android.support.constraint.solver.SolverVariable r35, android.support.constraint.solver.SolverVariable r36, android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour r37, boolean r38, android.support.constraint.solver.widgets.ConstraintAnchor r39, android.support.constraint.solver.widgets.ConstraintAnchor r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, int r48, int r49, int r50, float r51, boolean r52) {
        /*
        r32 = this;
        r0 = r32;
        r10 = r33;
        r11 = r35;
        r12 = r36;
        r1 = r43;
        r2 = r44;
        r13 = r39;
        r9 = r10.m438a(r13);
        r8 = r40;
        r7 = r10.m438a(r8);
        r6 = r39.m473g();
        r6 = r10.m438a(r6);
        r14 = r40.m473g();
        r14 = r10.m438a(r14);
        r20 = r14;
        r14 = r10.f422c;
        r15 = 1;
        if (r14 == 0) goto L_0x0069;
    L_0x0030:
        r14 = r39.m462a();
        r14 = r14.i;
        r11 = 1;
        if (r14 != r11) goto L_0x0069;
    L_0x0039:
        r14 = r40.m462a();
        r14 = r14.i;
        if (r14 != r11) goto L_0x0069;
    L_0x0041:
        r1 = android.support.constraint.solver.C0140e.m429a();
        if (r1 == 0) goto L_0x0051;
    L_0x0047:
        r1 = android.support.constraint.solver.C0140e.m429a();
        r2 = r1.f458s;
        r5 = r2 + r15;
        r1.f458s = r5;
    L_0x0051:
        r1 = r39.m462a();
        r1.m10648a(r10);
        r1 = r40.m462a();
        r1.m10648a(r10);
        if (r47 != 0) goto L_0x0068;
    L_0x0061:
        if (r34 == 0) goto L_0x0068;
    L_0x0063:
        r1 = 0;
        r2 = 6;
        r10.m441a(r12, r7, r1, r2);
    L_0x0068:
        return;
    L_0x0069:
        r11 = android.support.constraint.solver.C0140e.m429a();
        if (r11 == 0) goto L_0x007e;
    L_0x006f:
        r11 = android.support.constraint.solver.C0140e.m429a();
        r1 = r11.f437B;
        r22 = r6;
        r21 = r7;
        r6 = r1 + r15;
        r11.f437B = r6;
        goto L_0x0082;
    L_0x007e:
        r22 = r6;
        r21 = r7;
    L_0x0082:
        r1 = r39.m476j();
        r2 = r40.m476j();
        r6 = r0.f529y;
        r6 = r6.m476j();
        if (r1 == 0) goto L_0x0094;
    L_0x0092:
        r7 = 1;
        goto L_0x0095;
    L_0x0094:
        r7 = 0;
    L_0x0095:
        if (r2 == 0) goto L_0x0099;
    L_0x0097:
        r7 = r7 + 1;
    L_0x0099:
        if (r6 == 0) goto L_0x009d;
    L_0x009b:
        r7 = r7 + 1;
    L_0x009d:
        if (r46 == 0) goto L_0x00a1;
    L_0x009f:
        r14 = 3;
        goto L_0x00a3;
    L_0x00a1:
        r14 = r48;
    L_0x00a3:
        r15 = android.support.constraint.solver.widgets.ConstraintWidget.C01451.f478b;
        r16 = r37.ordinal();
        r15 = r15[r16];
        r11 = 4;
        switch(r15) {
            case 1: goto L_0x00af;
            case 2: goto L_0x00af;
            case 3: goto L_0x00af;
            case 4: goto L_0x00b1;
            default: goto L_0x00af;
        };
    L_0x00af:
        r15 = 0;
        goto L_0x00b5;
    L_0x00b1:
        if (r14 != r11) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00af;
    L_0x00b4:
        r15 = 1;
    L_0x00b5:
        r11 = r0.am;
        r8 = 8;
        if (r11 != r8) goto L_0x00be;
    L_0x00bb:
        r8 = 0;
        r11 = 0;
        goto L_0x00c1;
    L_0x00be:
        r8 = r42;
        r11 = r15;
    L_0x00c1:
        if (r52 == 0) goto L_0x00e2;
    L_0x00c3:
        if (r1 != 0) goto L_0x00cf;
    L_0x00c5:
        if (r2 != 0) goto L_0x00cf;
    L_0x00c7:
        if (r6 != 0) goto L_0x00cf;
    L_0x00c9:
        r12 = r41;
        r10.m439a(r9, r12);
        goto L_0x00e2;
    L_0x00cf:
        if (r1 == 0) goto L_0x00e2;
    L_0x00d1:
        if (r2 != 0) goto L_0x00e2;
    L_0x00d3:
        r12 = r39.m471e();
        r24 = r2;
        r23 = r6;
        r6 = r22;
        r2 = 6;
        r10.m454c(r9, r6, r12, r2);
        goto L_0x00e9;
    L_0x00e2:
        r24 = r2;
        r23 = r6;
        r6 = r22;
        r2 = 6;
    L_0x00e9:
        if (r11 != 0) goto L_0x0122;
    L_0x00eb:
        if (r38 == 0) goto L_0x010d;
    L_0x00ed:
        r25 = r11;
        r12 = r21;
        r2 = 0;
        r11 = 3;
        r10.m454c(r12, r9, r2, r11);
        r2 = r43;
        if (r2 <= 0) goto L_0x00ff;
    L_0x00fa:
        r11 = 6;
        r10.m441a(r12, r9, r2, r11);
        goto L_0x0100;
    L_0x00ff:
        r11 = 6;
    L_0x0100:
        r8 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r26 = r6;
        r6 = r44;
        if (r6 >= r8) goto L_0x0119;
    L_0x0109:
        r10.m451b(r12, r9, r6, r11);
        goto L_0x0119;
    L_0x010d:
        r26 = r6;
        r25 = r11;
        r12 = r21;
        r2 = r43;
        r11 = 6;
        r10.m454c(r12, r9, r8, r11);
    L_0x0119:
        r2 = r49;
        r11 = r50;
        r0 = r14;
        r6 = r20;
        goto L_0x01fa;
    L_0x0122:
        r26 = r6;
        r25 = r11;
        r12 = r21;
        r2 = r43;
        r6 = -2;
        r11 = r49;
        if (r11 != r6) goto L_0x0133;
    L_0x012f:
        r11 = r50;
        r2 = r8;
        goto L_0x0136;
    L_0x0133:
        r2 = r11;
        r11 = r50;
    L_0x0136:
        if (r11 != r6) goto L_0x0139;
    L_0x0138:
        r11 = r8;
    L_0x0139:
        if (r2 <= 0) goto L_0x014b;
    L_0x013b:
        if (r34 == 0) goto L_0x0142;
    L_0x013d:
        r6 = 6;
        r10.m441a(r12, r9, r2, r6);
        goto L_0x0146;
    L_0x0142:
        r6 = 6;
        r10.m441a(r12, r9, r2, r6);
    L_0x0146:
        r8 = java.lang.Math.max(r8, r2);
        goto L_0x014c;
    L_0x014b:
        r6 = 6;
    L_0x014c:
        if (r11 <= 0) goto L_0x015d;
    L_0x014e:
        if (r34 == 0) goto L_0x0156;
    L_0x0150:
        r6 = 1;
        r10.m451b(r12, r9, r11, r6);
        r6 = 6;
        goto L_0x0159;
    L_0x0156:
        r10.m451b(r12, r9, r11, r6);
    L_0x0159:
        r8 = java.lang.Math.min(r8, r11);
    L_0x015d:
        r6 = 1;
        if (r14 != r6) goto L_0x0176;
    L_0x0160:
        if (r34 == 0) goto L_0x0168;
    L_0x0162:
        r6 = 6;
        r10.m454c(r12, r9, r8, r6);
        goto L_0x01e0;
    L_0x0168:
        if (r47 == 0) goto L_0x0170;
    L_0x016a:
        r6 = 4;
        r10.m454c(r12, r9, r8, r6);
        goto L_0x01e0;
    L_0x0170:
        r6 = 1;
        r10.m454c(r12, r9, r8, r6);
        goto L_0x01e0;
    L_0x0176:
        r6 = 2;
        if (r14 != r6) goto L_0x01e0;
    L_0x0179:
        r6 = r39.m470d();
        r27 = r14;
        r14 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        if (r6 == r14) goto L_0x01ab;
    L_0x0183:
        r6 = r39.m470d();
        r14 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        if (r6 != r14) goto L_0x018c;
    L_0x018b:
        goto L_0x01ab;
    L_0x018c:
        r6 = r0.f482C;
        r14 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT;
        r6 = r6.mo153a(r14);
        r6 = r10.m438a(r6);
        r14 = r0.f482C;
        r28 = r6;
        r6 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r6 = r14.mo153a(r6);
        r6 = r10.m438a(r6);
        r17 = r6;
        r18 = r28;
        goto L_0x01c9;
    L_0x01ab:
        r6 = r0.f482C;
        r14 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r6 = r6.mo153a(r14);
        r6 = r10.m438a(r6);
        r14 = r0.f482C;
        r29 = r6;
        r6 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r6 = r14.mo153a(r6);
        r6 = r10.m438a(r6);
        r17 = r6;
        r18 = r29;
    L_0x01c9:
        r14 = r33.m453c();
        r6 = r20;
        r0 = r27;
        r15 = r12;
        r16 = r9;
        r19 = r51;
        r14 = r14.m10610a(r15, r16, r17, r18, r19);
        r10.m444a(r14);
        r25 = 0;
        goto L_0x01e3;
    L_0x01e0:
        r0 = r14;
        r6 = r20;
    L_0x01e3:
        if (r25 == 0) goto L_0x01fa;
    L_0x01e5:
        r14 = 2;
        if (r7 == r14) goto L_0x01fa;
    L_0x01e8:
        if (r46 != 0) goto L_0x01fa;
    L_0x01ea:
        r8 = java.lang.Math.max(r2, r8);
        if (r11 <= 0) goto L_0x01f4;
    L_0x01f0:
        r8 = java.lang.Math.min(r11, r8);
    L_0x01f4:
        r14 = 6;
        r10.m454c(r12, r9, r8, r14);
        r25 = 0;
    L_0x01fa:
        if (r52 == 0) goto L_0x0303;
    L_0x01fc:
        if (r47 == 0) goto L_0x0200;
    L_0x01fe:
        goto L_0x0303;
    L_0x0200:
        r4 = 5;
        if (r1 != 0) goto L_0x0213;
    L_0x0203:
        if (r24 != 0) goto L_0x0213;
    L_0x0205:
        if (r23 != 0) goto L_0x0213;
    L_0x0207:
        if (r34 == 0) goto L_0x020f;
    L_0x0209:
        r5 = 0;
        r14 = r36;
        r10.m441a(r14, r12, r5, r4);
    L_0x020f:
        r2 = 6;
    L_0x0210:
        r3 = 0;
        goto L_0x02fb;
    L_0x0213:
        r5 = 0;
        r14 = r36;
        if (r1 == 0) goto L_0x0220;
    L_0x0218:
        if (r24 != 0) goto L_0x0220;
    L_0x021a:
        if (r34 == 0) goto L_0x020f;
    L_0x021c:
        r10.m441a(r14, r12, r5, r4);
        goto L_0x020f;
    L_0x0220:
        if (r1 != 0) goto L_0x0235;
    L_0x0222:
        if (r24 == 0) goto L_0x0235;
    L_0x0224:
        r0 = r40.m471e();
        r0 = -r0;
        r1 = 6;
        r10.m454c(r12, r6, r0, r1);
        if (r34 == 0) goto L_0x020f;
    L_0x022f:
        r8 = r35;
        r10.m441a(r9, r8, r5, r4);
        goto L_0x020f;
    L_0x0235:
        r7 = 1;
        r8 = r35;
        if (r1 == 0) goto L_0x020f;
    L_0x023a:
        if (r24 == 0) goto L_0x020f;
    L_0x023c:
        if (r25 == 0) goto L_0x02a4;
    L_0x023e:
        if (r34 == 0) goto L_0x0248;
    L_0x0240:
        r1 = r43;
        if (r1 != 0) goto L_0x0248;
    L_0x0244:
        r1 = 6;
        r10.m441a(r12, r9, r5, r1);
    L_0x0248:
        if (r0 != 0) goto L_0x0273;
    L_0x024a:
        if (r11 > 0) goto L_0x0252;
    L_0x024c:
        if (r2 <= 0) goto L_0x024f;
    L_0x024e:
        goto L_0x0252;
    L_0x024f:
        r0 = 6;
        r1 = 0;
        goto L_0x0254;
    L_0x0252:
        r0 = 4;
        r1 = 1;
    L_0x0254:
        r3 = r39.m471e();
        r5 = r26;
        r10.m454c(r9, r5, r3, r0);
        r3 = r40.m471e();
        r3 = -r3;
        r10.m454c(r12, r6, r3, r0);
        if (r11 > 0) goto L_0x026c;
    L_0x0267:
        if (r2 <= 0) goto L_0x026a;
    L_0x0269:
        goto L_0x026c;
    L_0x026a:
        r11 = 0;
        goto L_0x026d;
    L_0x026c:
        r11 = 1;
    L_0x026d:
        r15 = r1;
        r7 = r11;
        r0 = r32;
        r11 = 5;
        goto L_0x02bb;
    L_0x0273:
        r5 = r26;
        if (r0 != r7) goto L_0x027c;
    L_0x0277:
        r0 = r32;
        r11 = 6;
    L_0x027a:
        r15 = 1;
        goto L_0x02bb;
    L_0x027c:
        r1 = 3;
        if (r0 != r1) goto L_0x02a0;
    L_0x027f:
        if (r46 != 0) goto L_0x028c;
    L_0x0281:
        r0 = r32;
        r1 = r0.f520p;
        r2 = -1;
        if (r1 == r2) goto L_0x028e;
    L_0x0288:
        if (r11 > 0) goto L_0x028e;
    L_0x028a:
        r1 = 6;
        goto L_0x028f;
    L_0x028c:
        r0 = r32;
    L_0x028e:
        r1 = 4;
    L_0x028f:
        r2 = r39.m471e();
        r10.m454c(r9, r5, r2, r1);
        r2 = r40.m471e();
        r2 = -r2;
        r10.m454c(r12, r6, r2, r1);
        r11 = 5;
        goto L_0x027a;
    L_0x02a0:
        r0 = r32;
        r7 = 0;
        goto L_0x02b9;
    L_0x02a4:
        r5 = r26;
        r0 = r32;
        if (r34 == 0) goto L_0x02b9;
    L_0x02aa:
        r1 = r39.m471e();
        r10.m441a(r9, r5, r1, r4);
        r1 = r40.m471e();
        r1 = -r1;
        r10.m451b(r12, r6, r1, r4);
    L_0x02b9:
        r11 = 5;
        r15 = 0;
    L_0x02bb:
        if (r7 == 0) goto L_0x02d8;
    L_0x02bd:
        r4 = r39.m471e();
        r16 = r40.m471e();
        r1 = r10;
        r2 = r9;
        r3 = r5;
        r7 = r5;
        r5 = r45;
        r30 = r6;
        r0 = r7;
        r7 = r12;
        r14 = r8;
        r8 = r16;
        r14 = r9;
        r9 = r11;
        r1.m440a(r2, r3, r4, r5, r6, r7, r8, r9);
        goto L_0x02dc;
    L_0x02d8:
        r0 = r5;
        r30 = r6;
        r14 = r9;
    L_0x02dc:
        if (r15 == 0) goto L_0x02f1;
    L_0x02de:
        r1 = r39.m471e();
        r2 = 6;
        r10.m441a(r14, r0, r1, r2);
        r0 = r40.m471e();
        r0 = -r0;
        r1 = r30;
        r10.m451b(r12, r1, r0, r2);
        goto L_0x02f2;
    L_0x02f1:
        r2 = 6;
    L_0x02f2:
        if (r34 == 0) goto L_0x0210;
    L_0x02f4:
        r1 = r14;
        r0 = r35;
        r3 = 0;
        r10.m441a(r1, r0, r3, r2);
    L_0x02fb:
        if (r34 == 0) goto L_0x0302;
    L_0x02fd:
        r0 = r36;
        r10.m441a(r0, r12, r3, r2);
    L_0x0302:
        return;
    L_0x0303:
        r1 = r9;
        r0 = r36;
        r2 = 6;
        r3 = 0;
        r4 = r35;
        r5 = 2;
        if (r7 >= r5) goto L_0x0315;
    L_0x030d:
        if (r34 == 0) goto L_0x0315;
    L_0x030f:
        r10.m441a(r1, r4, r3, r2);
        r10.m441a(r0, r12, r3, r2);
    L_0x0315:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.ConstraintWidget.a(android.support.constraint.solver.e, boolean, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, android.support.constraint.solver.widgets.ConstraintAnchor, android.support.constraint.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* renamed from: c */
    public void mo157c(C0140e c0140e) {
        int b = c0140e.m449b(this.f522r);
        int b2 = c0140e.m449b(this.f523s);
        int b3 = c0140e.m449b(this.f524t);
        int b4 = c0140e.m449b(this.f525u);
        int i = b4 - b2;
        if (b3 - b < 0 || i < 0 || b == Integer.MIN_VALUE || b == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED || b2 == Integer.MIN_VALUE || b2 == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED || b3 == Integer.MIN_VALUE || b3 == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED || b4 == -2147483648 || b4 == 2147483647) {
            b4 = null;
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        m491a(b, b2, b3, b4);
    }
}
