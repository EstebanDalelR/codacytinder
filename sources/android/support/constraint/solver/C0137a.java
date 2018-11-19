package android.support.constraint.solver;

import android.support.constraint.solver.SolverVariable.Type;
import java.util.Arrays;

/* renamed from: android.support.constraint.solver.a */
public class C0137a {
    /* renamed from: a */
    int f404a = 0;
    /* renamed from: b */
    private final C2733b f405b;
    /* renamed from: c */
    private final C0138c f406c;
    /* renamed from: d */
    private int f407d = 8;
    /* renamed from: e */
    private SolverVariable f408e = null;
    /* renamed from: f */
    private int[] f409f = new int[this.f407d];
    /* renamed from: g */
    private int[] f410g = new int[this.f407d];
    /* renamed from: h */
    private float[] f411h = new float[this.f407d];
    /* renamed from: i */
    private int f412i = -1;
    /* renamed from: j */
    private int f413j = -1;
    /* renamed from: k */
    private boolean f414k = false;

    C0137a(C2733b c2733b, C0138c c0138c) {
        this.f405b = c2733b;
        this.f406c = c0138c;
    }

    /* renamed from: a */
    public final void m413a(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            m407a(solverVariable, true);
        } else if (this.f412i == -1) {
            this.f412i = 0;
            this.f411h[this.f412i] = f;
            this.f409f[this.f412i] = solverVariable.f394a;
            this.f410g[this.f412i] = -1;
            solverVariable.f402i += Float.MIN_VALUE;
            solverVariable.m402a(this.f405b);
            this.f404a += 1;
            if (this.f414k == null) {
                this.f413j += 1;
                if (this.f413j >= this.f409f.length) {
                    this.f414k = true;
                    this.f413j = this.f409f.length - 1;
                }
            }
        } else {
            int i = this.f412i;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f404a) {
                if (this.f409f[i] == solverVariable.f394a) {
                    this.f411h[i] = f;
                    return;
                }
                if (this.f409f[i] < solverVariable.f394a) {
                    i3 = i;
                }
                i = this.f410g[i];
                i2++;
            }
            i = this.f413j + 1;
            if (this.f414k) {
                if (this.f409f[this.f413j] == -1) {
                    i = this.f413j;
                } else {
                    i = this.f409f.length;
                }
            }
            if (i >= this.f409f.length && this.f404a < this.f409f.length) {
                for (i2 = 0; i2 < this.f409f.length; i2++) {
                    if (this.f409f[i2] == -1) {
                        i = i2;
                        break;
                    }
                }
            }
            if (i >= this.f409f.length) {
                i = this.f409f.length;
                this.f407d *= 2;
                this.f414k = false;
                this.f413j = i - 1;
                this.f411h = Arrays.copyOf(this.f411h, this.f407d);
                this.f409f = Arrays.copyOf(this.f409f, this.f407d);
                this.f410g = Arrays.copyOf(this.f410g, this.f407d);
            }
            this.f409f[i] = solverVariable.f394a;
            this.f411h[i] = f;
            if (i3 != -1) {
                this.f410g[i] = this.f410g[i3];
                this.f410g[i3] = i;
            } else {
                this.f410g[i] = this.f412i;
                this.f412i = i;
            }
            solverVariable.f402i += Float.MIN_VALUE;
            solverVariable.m402a(this.f405b);
            this.f404a += 1;
            if (this.f414k == null) {
                this.f413j += 1;
            }
            if (this.f404a >= this.f409f.length) {
                this.f414k = true;
            }
            if (this.f413j >= this.f409f.length) {
                this.f414k = true;
                this.f413j = this.f409f.length - 1;
            }
        }
    }

    /* renamed from: a */
    final void m414a(SolverVariable solverVariable, float f, boolean z) {
        if (f != 0.0f) {
            if (this.f412i == -1) {
                this.f412i = 0;
                this.f411h[this.f412i] = f;
                this.f409f[this.f412i] = solverVariable.f394a;
                this.f410g[this.f412i] = -1;
                solverVariable.f402i += Float.MIN_VALUE;
                solverVariable.m402a(this.f405b);
                this.f404a += 1;
                if (this.f414k == null) {
                    this.f413j += 1;
                    if (this.f413j >= this.f409f.length) {
                        this.f414k = true;
                        this.f413j = this.f409f.length - 1;
                    }
                }
                return;
            }
            int i = this.f412i;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f404a) {
                if (this.f409f[i] == solverVariable.f394a) {
                    float[] fArr = this.f411h;
                    fArr[i] = fArr[i] + f;
                    if (this.f411h[i] == 0.0f) {
                        if (i == this.f412i) {
                            this.f412i = this.f410g[i];
                        } else {
                            this.f410g[i3] = this.f410g[i];
                        }
                        if (z) {
                            solverVariable.m404b(this.f405b);
                        }
                        if (this.f414k != null) {
                            this.f413j = i;
                        }
                        solverVariable.f402i -= Float.MIN_VALUE;
                        this.f404a -= 1;
                    }
                    return;
                }
                if (this.f409f[i] < solverVariable.f394a) {
                    i3 = i;
                }
                i = this.f410g[i];
                i2++;
            }
            z = this.f413j + true;
            if (this.f414k) {
                if (this.f409f[this.f413j]) {
                    z = this.f413j;
                } else {
                    z = this.f409f.length;
                }
            }
            if (z >= this.f409f.length && this.f404a < this.f409f.length) {
                for (boolean z2 = false; z2 < this.f409f.length; z2++) {
                    if (this.f409f[z2] == -1) {
                        z = z2;
                        break;
                    }
                }
            }
            if (z >= this.f409f.length) {
                z = this.f409f.length;
                this.f407d *= 2;
                this.f414k = false;
                this.f413j = z - 1;
                this.f411h = Arrays.copyOf(this.f411h, this.f407d);
                this.f409f = Arrays.copyOf(this.f409f, this.f407d);
                this.f410g = Arrays.copyOf(this.f410g, this.f407d);
            }
            this.f409f[z] = solverVariable.f394a;
            this.f411h[z] = f;
            if (i3 != -1) {
                this.f410g[z] = this.f410g[i3];
                this.f410g[i3] = z;
            } else {
                this.f410g[z] = this.f412i;
                this.f412i = z;
            }
            solverVariable.f402i += Float.MIN_VALUE;
            solverVariable.m402a(this.f405b);
            this.f404a += 1;
            if (this.f414k == null) {
                this.f413j += 1;
            }
            if (this.f413j >= this.f409f.length) {
                this.f414k = true;
                this.f413j = this.f409f.length - 1;
            }
        }
    }

    /* renamed from: a */
    public final float m407a(SolverVariable solverVariable, boolean z) {
        if (this.f408e == solverVariable) {
            this.f408e = null;
        }
        if (this.f412i == -1) {
            return 0.0f;
        }
        int i = this.f412i;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f404a) {
            if (this.f409f[i] == solverVariable.f394a) {
                if (i == this.f412i) {
                    this.f412i = this.f410g[i];
                } else {
                    this.f410g[i3] = this.f410g[i];
                }
                if (z) {
                    solverVariable.m404b(this.f405b);
                }
                solverVariable.f402i--;
                this.f404a--;
                this.f409f[i] = -1;
                if (this.f414k != null) {
                    this.f413j = i;
                }
                return this.f411h[i];
            }
            i2++;
            i3 = i;
            i = this.f410g[i];
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void m411a() {
        int i = this.f412i;
        int i2 = 0;
        while (i != -1 && i2 < this.f404a) {
            SolverVariable solverVariable = this.f406c.f417c[this.f409f[i]];
            if (solverVariable != null) {
                solverVariable.m404b(this.f405b);
            }
            i = this.f410g[i];
            i2++;
        }
        this.f412i = -1;
        this.f413j = -1;
        this.f414k = false;
        this.f404a = 0;
    }

    /* renamed from: a */
    final boolean m417a(SolverVariable solverVariable) {
        if (this.f412i == -1) {
            return false;
        }
        int i = this.f412i;
        int i2 = 0;
        while (i != -1 && i2 < this.f404a) {
            if (this.f409f[i] == solverVariable.f394a) {
                return true;
            }
            i = this.f410g[i];
            i2++;
        }
        return false;
    }

    /* renamed from: b */
    void m420b() {
        int i = this.f412i;
        int i2 = 0;
        while (i != -1 && i2 < this.f404a) {
            float[] fArr = this.f411h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f410g[i];
            i2++;
        }
    }

    /* renamed from: a */
    void m412a(float f) {
        int i = this.f412i;
        int i2 = 0;
        while (i != -1 && i2 < this.f404a) {
            float[] fArr = this.f411h;
            fArr[i] = fArr[i] / f;
            i = this.f410g[i];
            i2++;
        }
    }

    /* renamed from: a */
    private boolean m406a(SolverVariable solverVariable, C0140e c0140e) {
        return solverVariable.f402i <= 1 ? true : null;
    }

    /* renamed from: a */
    SolverVariable m409a(C0140e c0140e) {
        int i = this.f412i;
        SolverVariable solverVariable = null;
        int i2 = 0;
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        boolean z = false;
        float f2 = 0.0f;
        boolean z2 = false;
        while (i != -1 && i2 < this.f404a) {
            boolean a;
            boolean a2;
            float f3 = this.f411h[i];
            SolverVariable solverVariable3 = this.f406c.f417c[this.f409f[i]];
            if (f3 < 0.0f) {
                if (f3 > -0.001f) {
                    this.f411h[i] = 0.0f;
                    solverVariable3.m404b(this.f405b);
                }
                if (f3 != 0.0f) {
                    if (solverVariable3.f399f == Type.UNRESTRICTED) {
                        if (solverVariable != null) {
                            a = m406a(solverVariable3, c0140e);
                        } else if (f > f3) {
                            a = m406a(solverVariable3, c0140e);
                        } else if (!z && m406a(solverVariable3, c0140e)) {
                            f = f3;
                            solverVariable = solverVariable3;
                            z = true;
                        }
                        z = a;
                        f = f3;
                        solverVariable = solverVariable3;
                    } else if (solverVariable == null && f3 < 0.0f) {
                        if (solverVariable2 != null) {
                            a2 = m406a(solverVariable3, c0140e);
                        } else if (f2 > f3) {
                            a2 = m406a(solverVariable3, c0140e);
                        } else if (!z2 && m406a(solverVariable3, c0140e)) {
                            f2 = f3;
                            solverVariable2 = solverVariable3;
                            z2 = true;
                        }
                        z2 = a2;
                        f2 = f3;
                        solverVariable2 = solverVariable3;
                    }
                }
                i = this.f410g[i];
                i2++;
            } else {
                if (f3 < 0.001f) {
                    this.f411h[i] = 0.0f;
                    solverVariable3.m404b(this.f405b);
                }
                if (f3 != 0.0f) {
                    if (solverVariable3.f399f == Type.UNRESTRICTED) {
                        if (solverVariable2 != null) {
                            a2 = m406a(solverVariable3, c0140e);
                        } else if (f2 > f3) {
                            f2 = f3;
                            solverVariable2 = solverVariable3;
                            z2 = true;
                        } else {
                            a2 = m406a(solverVariable3, c0140e);
                        }
                        z2 = a2;
                        f2 = f3;
                        solverVariable2 = solverVariable3;
                    } else {
                        if (solverVariable != null) {
                            a = m406a(solverVariable3, c0140e);
                        } else if (f > f3) {
                            f = f3;
                            solverVariable = solverVariable3;
                            z = true;
                        } else {
                            a = m406a(solverVariable3, c0140e);
                        }
                        z = a;
                        f = f3;
                        solverVariable = solverVariable3;
                    }
                }
                i = this.f410g[i];
                i2++;
            }
            f3 = 0.0f;
            if (f3 != 0.0f) {
                if (solverVariable3.f399f == Type.UNRESTRICTED) {
                    if (solverVariable != null) {
                        a = m406a(solverVariable3, c0140e);
                    } else if (f > f3) {
                        a = m406a(solverVariable3, c0140e);
                    } else {
                        f = f3;
                        solverVariable = solverVariable3;
                        z = true;
                    }
                    z = a;
                    f = f3;
                    solverVariable = solverVariable3;
                } else {
                    if (solverVariable2 != null) {
                        a2 = m406a(solverVariable3, c0140e);
                    } else if (f2 > f3) {
                        a2 = m406a(solverVariable3, c0140e);
                    } else {
                        f2 = f3;
                        solverVariable2 = solverVariable3;
                        z2 = true;
                    }
                    z2 = a2;
                    f2 = f3;
                    solverVariable2 = solverVariable3;
                }
            }
            i = this.f410g[i];
            i2++;
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    /* renamed from: a */
    final void m415a(C2733b c2733b, C2733b c2733b2, boolean z) {
        int i = this.f412i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f404a) {
                if (this.f409f[i] == c2733b2.f8592a.f394a) {
                    float f = this.f411h[i];
                    m407a(c2733b2.f8592a, z);
                    C0137a c0137a = c2733b2.f8595d;
                    int i3 = c0137a.f412i;
                    int i4 = 0;
                    while (i3 != -1 && i4 < c0137a.f404a) {
                        m414a(this.f406c.f417c[c0137a.f409f[i3]], c0137a.f411h[i3] * f, z);
                        i3 = c0137a.f410g[i3];
                        i4++;
                    }
                    c2733b.f8593b += c2733b2.f8593b * f;
                    if (z) {
                        c2733b2.f8592a.m404b(c2733b);
                    }
                    i = this.f412i;
                } else {
                    i = this.f410g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    void m416a(C2733b c2733b, C2733b[] c2733bArr) {
        int i = this.f412i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f404a) {
                SolverVariable solverVariable = this.f406c.f417c[this.f409f[i]];
                if (solverVariable.f395b != -1) {
                    float f = this.f411h[i];
                    m407a(solverVariable, true);
                    C2733b c2733b2 = c2733bArr[solverVariable.f395b];
                    if (!c2733b2.f8596e) {
                        C0137a c0137a = c2733b2.f8595d;
                        int i3 = c0137a.f412i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < c0137a.f404a) {
                            m414a(this.f406c.f417c[c0137a.f409f[i3]], c0137a.f411h[i3] * f, true);
                            i3 = c0137a.f410g[i3];
                            i4++;
                        }
                    }
                    c2733b.f8593b += c2733b2.f8593b * f;
                    c2733b2.f8592a.m404b(c2733b);
                    i = this.f412i;
                } else {
                    i = this.f410g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    SolverVariable m410a(boolean[] zArr, SolverVariable solverVariable) {
        int i = this.f412i;
        int i2 = 0;
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f404a) {
            if (this.f411h[i] < 0.0f) {
                SolverVariable solverVariable3 = this.f406c.f417c[this.f409f[i]];
                if ((zArr == null || !zArr[solverVariable3.f394a]) && solverVariable3 != solverVariable && (solverVariable3.f399f == Type.SLACK || solverVariable3.f399f == Type.ERROR)) {
                    float f2 = this.f411h[i];
                    if (f2 < f) {
                        solverVariable2 = solverVariable3;
                        f = f2;
                    }
                }
            }
            i = this.f410g[i];
            i2++;
        }
        return solverVariable2;
    }

    /* renamed from: a */
    final SolverVariable m408a(int i) {
        int i2 = this.f412i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f404a) {
            if (i3 == i) {
                return this.f406c.f417c[this.f409f[i2]];
            }
            i2 = this.f410g[i2];
            i3++;
        }
        return 0;
    }

    /* renamed from: b */
    final float m418b(int i) {
        int i2 = this.f412i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f404a) {
            if (i3 == i) {
                return this.f411h[i2];
            }
            i2 = this.f410g[i2];
            i3++;
        }
        return 0;
    }

    /* renamed from: b */
    public final float m419b(SolverVariable solverVariable) {
        int i = this.f412i;
        int i2 = 0;
        while (i != -1 && i2 < this.f404a) {
            if (this.f409f[i] == solverVariable.f394a) {
                return this.f411h[i];
            }
            i = this.f410g[i];
            i2++;
        }
        return null;
    }

    public String toString() {
        String str = "";
        int i = this.f412i;
        int i2 = 0;
        while (i != -1 && i2 < this.f404a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" -> ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f411h[i]);
            stringBuilder.append(" : ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f406c.f417c[this.f409f[i]]);
            str = stringBuilder.toString();
            i = this.f410g[i];
            i2++;
        }
        return str;
    }
}
