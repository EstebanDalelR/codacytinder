package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0140e;
import android.support.constraint.solver.C0141f;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.a */
public class C3986a extends C2736f {
    private int ae = 0;
    private ArrayList<C2737i> af = new ArrayList(4);
    private boolean ag = true;

    /* renamed from: a */
    public boolean mo155a() {
        return true;
    }

    /* renamed from: a */
    public void m15575a(int i) {
        this.ae = i;
    }

    /* renamed from: a */
    public void m15577a(boolean z) {
        this.ag = z;
    }

    /* renamed from: b */
    public void mo2975b() {
        super.mo2975b();
        this.af.clear();
    }

    /* renamed from: b */
    public void mo156b(int i) {
        if (this.C != 0 && ((C3987d) this.C).m15604q(2) != 0) {
            int i2;
            ConstraintWidget constraintWidget;
            C2737i a;
            switch (this.ae) {
                case 0:
                    i = this.r.m462a();
                    break;
                case 1:
                    i = this.t.m462a();
                    break;
                case 2:
                    i = this.s.m462a();
                    break;
                case 3:
                    i = this.u.m462a();
                    break;
                default:
                    return;
            }
            i.m10653b(5);
            if (this.ae != 0) {
                if (this.ae != 1) {
                    this.r.m462a().m10649a(null, 0.0f);
                    this.t.m462a().m10649a(null, 0.0f);
                    this.af.clear();
                    for (i2 = 0; i2 < this.ad; i2++) {
                        constraintWidget = this.ac[i2];
                        if (!this.ag || constraintWidget.mo155a()) {
                            switch (this.ae) {
                                case 0:
                                    a = constraintWidget.f522r.m462a();
                                    break;
                                case 1:
                                    a = constraintWidget.f524t.m462a();
                                    break;
                                case 2:
                                    a = constraintWidget.f523s.m462a();
                                    break;
                                case 3:
                                    a = constraintWidget.f525u.m462a();
                                    break;
                                default:
                                    a = null;
                                    break;
                            }
                            if (a != null) {
                                this.af.add(a);
                                a.m569a(i);
                            }
                        }
                    }
                }
            }
            this.s.m462a().m10649a(null, 0.0f);
            this.u.m462a().m10649a(null, 0.0f);
            this.af.clear();
            for (i2 = 0; i2 < this.ad; i2++) {
                constraintWidget = this.ac[i2];
                if (this.ag) {
                }
                switch (this.ae) {
                    case 0:
                        a = constraintWidget.f522r.m462a();
                        break;
                    case 1:
                        a = constraintWidget.f524t.m462a();
                        break;
                    case 2:
                        a = constraintWidget.f523s.m462a();
                        break;
                    case 3:
                        a = constraintWidget.f525u.m462a();
                        break;
                    default:
                        a = null;
                        break;
                }
                if (a != null) {
                    this.af.add(a);
                    a.m569a(i);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2976c() {
        C2737i a;
        float f = Float.MAX_VALUE;
        switch (this.ae) {
            case 0:
                a = this.r.m462a();
                break;
            case 1:
                a = this.t.m462a();
                break;
            case 2:
                a = this.s.m462a();
                break;
            case 3:
                a = this.u.m462a();
                break;
            default:
                return;
        }
        f = 0.0f;
        int size = this.af.size();
        C2737i c2737i = null;
        int i = 0;
        while (i < size) {
            C2737i c2737i2 = (C2737i) this.af.get(i);
            if (c2737i2.i == 1) {
                if (this.ae != 0) {
                    if (this.ae != 2) {
                        if (c2737i2.f8604f > f) {
                            f = c2737i2.f8604f;
                            c2737i = c2737i2.f8603e;
                        }
                        i++;
                    }
                }
                if (c2737i2.f8604f < f) {
                    f = c2737i2.f8604f;
                    c2737i = c2737i2.f8603e;
                }
                i++;
            } else {
                return;
            }
        }
        if (C0140e.m429a() != null) {
            C0141f a2 = C0140e.m429a();
            a2.f465z++;
        }
        a.f8603e = c2737i;
        a.f8604f = f;
        a.m572f();
        switch (this.ae) {
            case 0:
                this.t.m462a().m10649a(c2737i, f);
                break;
            case 1:
                this.r.m462a().m10649a(c2737i, f);
                break;
            case 2:
                this.u.m462a().m10649a(c2737i, f);
                break;
            case 3:
                this.s.m462a().m10649a(c2737i, f);
                break;
            default:
                return;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo154a(android.support.constraint.solver.C0140e r11) {
        /*
        r10 = this;
        r0 = r10.z;
        r1 = r10.r;
        r2 = 0;
        r0[r2] = r1;
        r0 = r10.z;
        r1 = r10.s;
        r3 = 2;
        r0[r3] = r1;
        r0 = r10.z;
        r1 = r10.t;
        r4 = 1;
        r0[r4] = r1;
        r0 = r10.z;
        r1 = r10.u;
        r5 = 3;
        r0[r5] = r1;
        r0 = 0;
    L_0x001d:
        r1 = r10.z;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x0033;
    L_0x0022:
        r1 = r10.z;
        r1 = r1[r0];
        r6 = r10.z;
        r6 = r6[r0];
        r6 = r11.m438a(r6);
        r1.f472f = r6;
        r0 = r0 + 1;
        goto L_0x001d;
    L_0x0033:
        r0 = r10.ae;
        if (r0 < 0) goto L_0x015b;
    L_0x0037:
        r0 = r10.ae;
        r1 = 4;
        if (r0 >= r1) goto L_0x015b;
    L_0x003c:
        r0 = r10.z;
        r1 = r10.ae;
        r0 = r0[r1];
        r1 = 0;
    L_0x0043:
        r6 = r10.ad;
        if (r1 >= r6) goto L_0x007c;
    L_0x0047:
        r6 = r10.ac;
        r6 = r6[r1];
        r7 = r10.ag;
        if (r7 != 0) goto L_0x0056;
    L_0x004f:
        r7 = r6.mo155a();
        if (r7 != 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0079;
    L_0x0056:
        r7 = r10.ae;
        if (r7 == 0) goto L_0x005e;
    L_0x005a:
        r7 = r10.ae;
        if (r7 != r4) goto L_0x0068;
    L_0x005e:
        r7 = r6.m485F();
        r8 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r7 != r8) goto L_0x0068;
    L_0x0066:
        r1 = 1;
        goto L_0x007d;
    L_0x0068:
        r7 = r10.ae;
        if (r7 == r3) goto L_0x0070;
    L_0x006c:
        r7 = r10.ae;
        if (r7 != r5) goto L_0x0079;
    L_0x0070:
        r6 = r6.m486G();
        r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r6 != r7) goto L_0x0079;
    L_0x0078:
        goto L_0x0066;
    L_0x0079:
        r1 = r1 + 1;
        goto L_0x0043;
    L_0x007c:
        r1 = 0;
    L_0x007d:
        r6 = r10.ae;
        if (r6 == 0) goto L_0x0093;
    L_0x0081:
        r6 = r10.ae;
        if (r6 != r4) goto L_0x0086;
    L_0x0085:
        goto L_0x0093;
    L_0x0086:
        r6 = r10.m535j();
        r6 = r6.m486G();
        r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r6 != r7) goto L_0x00a0;
    L_0x0092:
        goto L_0x009f;
    L_0x0093:
        r6 = r10.m535j();
        r6 = r6.m485F();
        r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r6 != r7) goto L_0x00a0;
    L_0x009f:
        r1 = 0;
    L_0x00a0:
        r6 = 0;
    L_0x00a1:
        r7 = r10.ad;
        if (r6 >= r7) goto L_0x00dd;
    L_0x00a5:
        r7 = r10.ac;
        r7 = r7[r6];
        r8 = r10.ag;
        if (r8 != 0) goto L_0x00b4;
    L_0x00ad:
        r8 = r7.mo155a();
        if (r8 != 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00da;
    L_0x00b4:
        r8 = r7.f530z;
        r9 = r10.ae;
        r8 = r8[r9];
        r8 = r11.m438a(r8);
        r7 = r7.f530z;
        r9 = r10.ae;
        r7 = r7[r9];
        r7.f472f = r8;
        r7 = r10.ae;
        if (r7 == 0) goto L_0x00d5;
    L_0x00ca:
        r7 = r10.ae;
        if (r7 != r3) goto L_0x00cf;
    L_0x00ce:
        goto L_0x00d5;
    L_0x00cf:
        r7 = r0.f472f;
        r11.m443a(r7, r8, r1);
        goto L_0x00da;
    L_0x00d5:
        r7 = r0.f472f;
        r11.m452b(r7, r8, r1);
    L_0x00da:
        r6 = r6 + 1;
        goto L_0x00a1;
    L_0x00dd:
        r0 = r10.ae;
        r6 = 5;
        r7 = 6;
        if (r0 != 0) goto L_0x00fe;
    L_0x00e3:
        r0 = r10.t;
        r0 = r0.f472f;
        r3 = r10.r;
        r3 = r3.f472f;
        r11.m454c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x015a;
    L_0x00f0:
        r0 = r10.r;
        r0 = r0.f472f;
        r1 = r10.C;
        r1 = r1.f524t;
        r1 = r1.f472f;
        r11.m454c(r0, r1, r2, r6);
        goto L_0x015a;
    L_0x00fe:
        r0 = r10.ae;
        if (r0 != r4) goto L_0x011d;
    L_0x0102:
        r0 = r10.r;
        r0 = r0.f472f;
        r3 = r10.t;
        r3 = r3.f472f;
        r11.m454c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x015a;
    L_0x010f:
        r0 = r10.r;
        r0 = r0.f472f;
        r1 = r10.C;
        r1 = r1.f522r;
        r1 = r1.f472f;
        r11.m454c(r0, r1, r2, r6);
        goto L_0x015a;
    L_0x011d:
        r0 = r10.ae;
        if (r0 != r3) goto L_0x013c;
    L_0x0121:
        r0 = r10.u;
        r0 = r0.f472f;
        r3 = r10.s;
        r3 = r3.f472f;
        r11.m454c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x015a;
    L_0x012e:
        r0 = r10.s;
        r0 = r0.f472f;
        r1 = r10.C;
        r1 = r1.f525u;
        r1 = r1.f472f;
        r11.m454c(r0, r1, r2, r6);
        goto L_0x015a;
    L_0x013c:
        r0 = r10.ae;
        if (r0 != r5) goto L_0x015a;
    L_0x0140:
        r0 = r10.s;
        r0 = r0.f472f;
        r3 = r10.u;
        r3 = r3.f472f;
        r11.m454c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x015a;
    L_0x014d:
        r0 = r10.s;
        r0 = r0.f472f;
        r1 = r10.C;
        r1 = r1.f523s;
        r1 = r1.f472f;
        r11.m454c(r0, r1, r2, r6);
    L_0x015a:
        return;
    L_0x015b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.a.a(android.support.constraint.solver.e):void");
    }
}
