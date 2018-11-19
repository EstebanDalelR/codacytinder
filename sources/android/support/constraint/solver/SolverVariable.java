package android.support.constraint.solver;

import java.util.Arrays;

public class SolverVariable {
    /* renamed from: j */
    private static int f389j = 1;
    /* renamed from: k */
    private static int f390k = 1;
    /* renamed from: l */
    private static int f391l = 1;
    /* renamed from: m */
    private static int f392m = 1;
    /* renamed from: n */
    private static int f393n = 1;
    /* renamed from: a */
    public int f394a = -1;
    /* renamed from: b */
    int f395b = -1;
    /* renamed from: c */
    public int f396c = 0;
    /* renamed from: d */
    public float f397d;
    /* renamed from: e */
    float[] f398e = new float[7];
    /* renamed from: f */
    Type f399f;
    /* renamed from: g */
    C2733b[] f400g = new C2733b[8];
    /* renamed from: h */
    int f401h = 0;
    /* renamed from: i */
    public int f402i = 0;
    /* renamed from: o */
    private String f403o;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* renamed from: a */
    static void m400a() {
        f390k++;
    }

    public SolverVariable(Type type, String str) {
        this.f399f = type;
    }

    /* renamed from: a */
    public final void m402a(C2733b c2733b) {
        int i = 0;
        while (i < this.f401h) {
            if (this.f400g[i] != c2733b) {
                i++;
            } else {
                return;
            }
        }
        if (this.f401h >= this.f400g.length) {
            this.f400g = (C2733b[]) Arrays.copyOf(this.f400g, this.f400g.length * 2);
        }
        this.f400g[this.f401h] = c2733b;
        this.f401h++;
    }

    /* renamed from: b */
    public final void m404b(C2733b c2733b) {
        int i = this.f401h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f400g[i2] == c2733b) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    int i4 = i2 + i3;
                    this.f400g[i4] = this.f400g[i4 + 1];
                }
                this.f401h--;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m405c(C2733b c2733b) {
        int i = this.f401h;
        for (int i2 = 0; i2 < i; i2++) {
            this.f400g[i2].f8595d.m415a(this.f400g[i2], c2733b, false);
        }
        this.f401h = 0;
    }

    /* renamed from: b */
    public void m403b() {
        this.f403o = null;
        this.f399f = Type.UNKNOWN;
        this.f396c = 0;
        this.f394a = -1;
        this.f395b = -1;
        this.f397d = 0.0f;
        this.f401h = 0;
        this.f402i = 0;
    }

    /* renamed from: a */
    public void m401a(Type type, String str) {
        this.f399f = type;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f403o);
        return stringBuilder.toString();
    }
}
