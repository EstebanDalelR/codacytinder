package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0140e;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;

/* renamed from: android.support.constraint.solver.widgets.g */
public class C0149g {
    /* renamed from: a */
    static boolean[] f549a = new boolean[3];

    /* renamed from: a */
    static void m565a(C3987d c3987d, C0140e c0140e, ConstraintWidget constraintWidget) {
        if (c3987d.B[0] != DimensionBehaviour.WRAP_CONTENT && constraintWidget.f481B[0] == DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.f522r.f470d;
            int o = c3987d.m545o() - constraintWidget.f524t.f470d;
            constraintWidget.f522r.f472f = c0140e.m438a(constraintWidget.f522r);
            constraintWidget.f524t.f472f = c0140e.m438a(constraintWidget.f524t);
            c0140e.m439a(constraintWidget.f522r.f472f, i);
            c0140e.m439a(constraintWidget.f524t.f472f, o);
            constraintWidget.f505a = 2;
            constraintWidget.m518c(i, o);
        }
        if (c3987d.B[1] != DimensionBehaviour.WRAP_CONTENT && constraintWidget.f481B[1] == DimensionBehaviour.MATCH_PARENT) {
            i = constraintWidget.f523s.f470d;
            int q = c3987d.m549q() - constraintWidget.f525u.f470d;
            constraintWidget.f523s.f472f = c0140e.m438a(constraintWidget.f523s);
            constraintWidget.f525u.f472f = c0140e.m438a(constraintWidget.f525u);
            c0140e.m439a(constraintWidget.f523s.f472f, i);
            c0140e.m439a(constraintWidget.f525u.f472f, q);
            if (constraintWidget.f491L > 0 || constraintWidget.m537k() == 8) {
                constraintWidget.f526v.f472f = c0140e.m438a(constraintWidget.f526v);
                c0140e.m439a(constraintWidget.f526v.f472f, constraintWidget.f491L + i);
            }
            constraintWidget.f506b = 2;
            constraintWidget.m523d(i, q);
        }
    }

    /* renamed from: a */
    private static boolean m566a(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget.f481B[i] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        int i2 = 1;
        if (constraintWidget.f485F != 0.0f) {
            constraintWidget = constraintWidget.f481B;
            if (i != 0) {
                i2 = 0;
            }
            return constraintWidget[i2] == DimensionBehaviour.MATCH_CONSTRAINT ? false : false;
        } else {
            if (i != 0) {
                if (constraintWidget.f510f == 0 && constraintWidget.f515k == 0) {
                    if (constraintWidget.f516l != null) {
                    }
                }
                return false;
            } else if (constraintWidget.f509e == 0 && constraintWidget.f512h == 0 && constraintWidget.f513i == null) {
                return true;
            } else {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    static void m564a(int i, ConstraintWidget constraintWidget) {
        ConstraintWidget constraintWidget2 = constraintWidget;
        constraintWidget.m529g();
        C2737i a = constraintWidget2.f522r.m462a();
        C2737i a2 = constraintWidget2.f523s.m462a();
        C2737i a3 = constraintWidget2.f524t.m462a();
        C2737i a4 = constraintWidget2.f525u.m462a();
        Object obj = (i & 8) == 8 ? 1 : null;
        Object obj2 = (constraintWidget2.f481B[0] == DimensionBehaviour.MATCH_CONSTRAINT && C0149g.m566a(constraintWidget2, 0)) ? 1 : null;
        if (!(a.f8605g == 4 || a3.f8605g == 4)) {
            if (constraintWidget2.f481B[0] != DimensionBehaviour.FIXED) {
                if (obj2 == null || constraintWidget.m537k() != 8) {
                    if (obj2 != null) {
                        int o = constraintWidget.m545o();
                        a.m10653b(1);
                        a3.m10653b(1);
                        if (constraintWidget2.f522r.f469c == null && constraintWidget2.f524t.f469c == null) {
                            if (obj != null) {
                                a3.m10651a(a, 1, constraintWidget.m531h());
                            } else {
                                a3.m10650a(a, o);
                            }
                        } else if (constraintWidget2.f522r.f469c == null || constraintWidget2.f524t.f469c != null) {
                            if (constraintWidget2.f522r.f469c != null || constraintWidget2.f524t.f469c == null) {
                                if (!(constraintWidget2.f522r.f469c == null || constraintWidget2.f524t.f469c == null)) {
                                    if (obj != null) {
                                        constraintWidget.m531h().m569a(a);
                                        constraintWidget.m531h().m569a(a3);
                                    }
                                    if (constraintWidget2.f485F == 0.0f) {
                                        a.m10653b(3);
                                        a3.m10653b(3);
                                        a.m10654b(a3, 0.0f);
                                        a3.m10654b(a, 0.0f);
                                    } else {
                                        a.m10653b(2);
                                        a3.m10653b(2);
                                        a.m10654b(a3, (float) (-o));
                                        a3.m10654b(a, (float) o);
                                        constraintWidget2.m532h(o);
                                    }
                                }
                            } else if (obj != null) {
                                a.m10651a(a3, -1, constraintWidget.m531h());
                            } else {
                                a.m10650a(a3, -o);
                            }
                        } else if (obj != null) {
                            a3.m10651a(a, 1, constraintWidget.m531h());
                        } else {
                            a3.m10650a(a, o);
                        }
                    }
                }
            }
            if (constraintWidget2.f522r.f469c == null && constraintWidget2.f524t.f469c == null) {
                a.m10653b(1);
                a3.m10653b(1);
                if (obj != null) {
                    a3.m10651a(a, 1, constraintWidget.m531h());
                } else {
                    a3.m10650a(a, constraintWidget.m545o());
                }
            } else if (constraintWidget2.f522r.f469c != null && constraintWidget2.f524t.f469c == null) {
                a.m10653b(1);
                a3.m10653b(1);
                if (obj != null) {
                    a3.m10651a(a, 1, constraintWidget.m531h());
                } else {
                    a3.m10650a(a, constraintWidget.m545o());
                }
            } else if (constraintWidget2.f522r.f469c == null && constraintWidget2.f524t.f469c != null) {
                a.m10653b(1);
                a3.m10653b(1);
                a.m10650a(a3, -constraintWidget.m545o());
                if (obj != null) {
                    a.m10651a(a3, -1, constraintWidget.m531h());
                } else {
                    a.m10650a(a3, -constraintWidget.m545o());
                }
            } else if (!(constraintWidget2.f522r.f469c == null || constraintWidget2.f524t.f469c == null)) {
                a.m10653b(2);
                a3.m10653b(2);
                if (obj != null) {
                    constraintWidget.m531h().m569a(a);
                    constraintWidget.m531h().m569a(a3);
                    a.m10655b(a3, -1, constraintWidget.m531h());
                    a3.m10655b(a, 1, constraintWidget.m531h());
                } else {
                    a.m10654b(a3, (float) (-constraintWidget.m545o()));
                    a3.m10654b(a, (float) constraintWidget.m545o());
                }
            }
        }
        Object obj3 = (constraintWidget2.f481B[1] == DimensionBehaviour.MATCH_CONSTRAINT && C0149g.m566a(constraintWidget2, 1)) ? 1 : null;
        if (a2.f8605g != 4 && a4.f8605g != 4) {
            if (constraintWidget2.f481B[1] != DimensionBehaviour.FIXED) {
                if (obj3 == null || constraintWidget.m537k() != 8) {
                    if (obj3 != null) {
                        int q = constraintWidget.m549q();
                        a2.m10653b(1);
                        a4.m10653b(1);
                        if (constraintWidget2.f523s.f469c == null && constraintWidget2.f525u.f469c == null) {
                            if (obj != null) {
                                a4.m10651a(a2, 1, constraintWidget.m533i());
                                return;
                            } else {
                                a4.m10650a(a2, q);
                                return;
                            }
                        } else if (constraintWidget2.f523s.f469c == null || constraintWidget2.f525u.f469c != null) {
                            if (constraintWidget2.f523s.f469c != null || constraintWidget2.f525u.f469c == null) {
                                if (constraintWidget2.f523s.f469c != null && constraintWidget2.f525u.f469c != null) {
                                    if (obj != null) {
                                        constraintWidget.m533i().m569a(a2);
                                        constraintWidget.m531h().m569a(a4);
                                    }
                                    if (constraintWidget2.f485F == 0.0f) {
                                        a2.m10653b(3);
                                        a4.m10653b(3);
                                        a2.m10654b(a4, 0.0f);
                                        a4.m10654b(a2, 0.0f);
                                        return;
                                    }
                                    a2.m10653b(2);
                                    a4.m10653b(2);
                                    a2.m10654b(a4, (float) (-q));
                                    a4.m10654b(a2, (float) q);
                                    constraintWidget2.m534i(q);
                                    if (constraintWidget2.f491L > 0) {
                                        constraintWidget2.f526v.m462a().m10647a(1, a2, constraintWidget2.f491L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (obj != null) {
                                a2.m10651a(a4, -1, constraintWidget.m533i());
                                return;
                            } else {
                                a2.m10650a(a4, -q);
                                return;
                            }
                        } else if (obj != null) {
                            a4.m10651a(a2, 1, constraintWidget.m533i());
                            return;
                        } else {
                            a4.m10650a(a2, q);
                            return;
                        }
                    }
                    return;
                }
            }
            if (constraintWidget2.f523s.f469c == null && constraintWidget2.f525u.f469c == null) {
                a2.m10653b(1);
                a4.m10653b(1);
                if (obj != null) {
                    a4.m10651a(a2, 1, constraintWidget.m533i());
                } else {
                    a4.m10650a(a2, constraintWidget.m549q());
                }
                if (constraintWidget2.f526v.f469c != null) {
                    constraintWidget2.f526v.m462a().m10653b(1);
                    a2.m10647a(1, constraintWidget2.f526v.m462a(), -constraintWidget2.f491L);
                }
            } else if (constraintWidget2.f523s.f469c != null && constraintWidget2.f525u.f469c == null) {
                a2.m10653b(1);
                a4.m10653b(1);
                if (obj != null) {
                    a4.m10651a(a2, 1, constraintWidget.m533i());
                } else {
                    a4.m10650a(a2, constraintWidget.m549q());
                }
                if (constraintWidget2.f491L > 0) {
                    constraintWidget2.f526v.m462a().m10647a(1, a2, constraintWidget2.f491L);
                }
            } else if (constraintWidget2.f523s.f469c == null && constraintWidget2.f525u.f469c != null) {
                a2.m10653b(1);
                a4.m10653b(1);
                if (obj != null) {
                    a2.m10651a(a4, -1, constraintWidget.m533i());
                } else {
                    a2.m10650a(a4, -constraintWidget.m549q());
                }
                if (constraintWidget2.f491L > 0) {
                    constraintWidget2.f526v.m462a().m10647a(1, a2, constraintWidget2.f491L);
                }
            } else if (constraintWidget2.f523s.f469c != null && constraintWidget2.f525u.f469c != null) {
                a2.m10653b(2);
                a4.m10653b(2);
                if (obj != null) {
                    a2.m10655b(a4, -1, constraintWidget.m533i());
                    a4.m10655b(a2, 1, constraintWidget.m533i());
                    constraintWidget.m533i().m569a(a2);
                    constraintWidget.m531h().m569a(a4);
                } else {
                    a2.m10654b(a4, (float) (-constraintWidget.m549q()));
                    a4.m10654b(a2, (float) constraintWidget.m549q());
                }
                if (constraintWidget2.f491L > 0) {
                    constraintWidget2.f526v.m462a().m10647a(1, a2, constraintWidget2.f491L);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static boolean m567a(android.support.constraint.solver.widgets.C3987d r21, android.support.constraint.solver.C0140e r22, int r23, int r24, android.support.constraint.solver.widgets.C0147c r25) {
        /*
        r0 = r22;
        r1 = r25;
        r2 = r1.f531a;
        r3 = r1.f533c;
        r4 = r1.f532b;
        r5 = r1.f534d;
        r6 = r1.f535e;
        r7 = r1.f541k;
        r8 = r1.f536f;
        r1 = r1.f537g;
        r8 = r21;
        r1 = r8.B;
        r1 = r1[r23];
        r8 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        r1 = 2;
        r9 = 1;
        if (r23 != 0) goto L_0x0036;
    L_0x0020:
        r10 = r6.f498T;
        if (r10 != 0) goto L_0x0026;
    L_0x0024:
        r10 = 1;
        goto L_0x0027;
    L_0x0026:
        r10 = 0;
    L_0x0027:
        r11 = r6.f498T;
        if (r11 != r9) goto L_0x002d;
    L_0x002b:
        r11 = 1;
        goto L_0x002e;
    L_0x002d:
        r11 = 0;
    L_0x002e:
        r6 = r6.f498T;
        if (r6 != r1) goto L_0x0034;
    L_0x0032:
        r1 = 1;
        goto L_0x0049;
    L_0x0034:
        r1 = 0;
        goto L_0x0049;
    L_0x0036:
        r10 = r6.f499U;
        if (r10 != 0) goto L_0x003c;
    L_0x003a:
        r10 = 1;
        goto L_0x003d;
    L_0x003c:
        r10 = 0;
    L_0x003d:
        r11 = r6.f499U;
        if (r11 != r9) goto L_0x0043;
    L_0x0041:
        r11 = 1;
        goto L_0x0044;
    L_0x0043:
        r11 = 0;
    L_0x0044:
        r6 = r6.f499U;
        if (r6 != r1) goto L_0x0034;
    L_0x0048:
        goto L_0x0032;
    L_0x0049:
        r13 = r2;
        r6 = 0;
        r9 = 0;
        r12 = 0;
        r14 = 0;
        r15 = 0;
    L_0x004f:
        if (r12 != 0) goto L_0x00f2;
    L_0x0051:
        r8 = r13.m537k();
        r16 = r12;
        r12 = 8;
        if (r8 == r12) goto L_0x008e;
    L_0x005b:
        r6 = r6 + 1;
        if (r23 != 0) goto L_0x0066;
    L_0x005f:
        r8 = r13.m545o();
        r8 = (float) r8;
        r14 = r14 + r8;
        goto L_0x006c;
    L_0x0066:
        r8 = r13.m549q();
        r8 = (float) r8;
        r14 = r14 + r8;
    L_0x006c:
        if (r13 == r4) goto L_0x0078;
    L_0x006e:
        r8 = r13.f530z;
        r8 = r8[r24];
        r8 = r8.m471e();
        r8 = (float) r8;
        r14 = r14 + r8;
    L_0x0078:
        r8 = r13.f530z;
        r8 = r8[r24];
        r8 = r8.m471e();
        r8 = (float) r8;
        r15 = r15 + r8;
        r8 = r13.f530z;
        r17 = r24 + 1;
        r8 = r8[r17];
        r8 = r8.m471e();
        r8 = (float) r8;
        r15 = r15 + r8;
    L_0x008e:
        r8 = r13.f530z;
        r8 = r8[r24];
        r8 = r13.m537k();
        if (r8 == r12) goto L_0x00c3;
    L_0x0098:
        r8 = r13.f481B;
        r8 = r8[r23];
        r12 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r8 != r12) goto L_0x00c3;
    L_0x00a0:
        r9 = r9 + 1;
        if (r23 != 0) goto L_0x00b4;
    L_0x00a4:
        r8 = r13.f509e;
        if (r8 == 0) goto L_0x00aa;
    L_0x00a8:
        r8 = 0;
        return r8;
    L_0x00aa:
        r8 = 0;
        r12 = r13.f512h;
        if (r12 != 0) goto L_0x00b3;
    L_0x00af:
        r12 = r13.f513i;
        if (r12 == 0) goto L_0x00c3;
    L_0x00b3:
        return r8;
    L_0x00b4:
        r8 = 0;
        r12 = r13.f510f;
        if (r12 == 0) goto L_0x00ba;
    L_0x00b9:
        return r8;
    L_0x00ba:
        r12 = r13.f515k;
        if (r12 != 0) goto L_0x00c2;
    L_0x00be:
        r12 = r13.f516l;
        if (r12 == 0) goto L_0x00c3;
    L_0x00c2:
        return r8;
    L_0x00c3:
        r8 = r13.f530z;
        r12 = r24 + 1;
        r8 = r8[r12];
        r8 = r8.f469c;
        if (r8 == 0) goto L_0x00e5;
    L_0x00cd:
        r8 = r8.f467a;
        r12 = r8.f530z;
        r12 = r12[r24];
        r12 = r12.f469c;
        if (r12 == 0) goto L_0x00e5;
    L_0x00d7:
        r12 = r8.f530z;
        r12 = r12[r24];
        r12 = r12.f469c;
        r12 = r12.f467a;
        if (r12 == r13) goto L_0x00e2;
    L_0x00e1:
        goto L_0x00e5;
    L_0x00e2:
        r18 = r8;
        goto L_0x00e7;
    L_0x00e5:
        r18 = 0;
    L_0x00e7:
        if (r18 == 0) goto L_0x00ef;
    L_0x00e9:
        r12 = r16;
        r13 = r18;
        goto L_0x004f;
    L_0x00ef:
        r12 = 1;
        goto L_0x004f;
    L_0x00f2:
        r8 = r2.f530z;
        r8 = r8[r24];
        r8 = r8.m462a();
        r3 = r3.f530z;
        r12 = r24 + 1;
        r3 = r3[r12];
        r3 = r3.m462a();
        r19 = r2;
        r2 = r8.f8601c;
        if (r2 == 0) goto L_0x035d;
    L_0x010a:
        r2 = r3.f8601c;
        if (r2 != 0) goto L_0x0110;
    L_0x010e:
        goto L_0x035d;
    L_0x0110:
        r2 = r8.f8601c;
        r2 = r2.i;
        r0 = 1;
        if (r2 == r0) goto L_0x011f;
    L_0x0117:
        r2 = r3.f8601c;
        r2 = r2.i;
        if (r2 == r0) goto L_0x011f;
    L_0x011d:
        r0 = 0;
        return r0;
    L_0x011f:
        r0 = 0;
        if (r9 <= 0) goto L_0x0125;
    L_0x0122:
        if (r9 == r6) goto L_0x0125;
    L_0x0124:
        return r0;
    L_0x0125:
        if (r1 != 0) goto L_0x012e;
    L_0x0127:
        if (r10 != 0) goto L_0x012e;
    L_0x0129:
        if (r11 == 0) goto L_0x012c;
    L_0x012b:
        goto L_0x012e;
    L_0x012c:
        r0 = 0;
        goto L_0x0147;
    L_0x012e:
        if (r4 == 0) goto L_0x013a;
    L_0x0130:
        r0 = r4.f530z;
        r0 = r0[r24];
        r0 = r0.m471e();
        r0 = (float) r0;
        goto L_0x013b;
    L_0x013a:
        r0 = 0;
    L_0x013b:
        if (r5 == 0) goto L_0x0147;
    L_0x013d:
        r2 = r5.f530z;
        r2 = r2[r12];
        r2 = r2.m471e();
        r2 = (float) r2;
        r0 = r0 + r2;
    L_0x0147:
        r2 = r8.f8601c;
        r2 = r2.f8604f;
        r3 = r3.f8601c;
        r3 = r3.f8604f;
        r16 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r16 >= 0) goto L_0x0156;
    L_0x0153:
        r3 = r3 - r2;
        r3 = r3 - r14;
        goto L_0x0159;
    L_0x0156:
        r3 = r2 - r3;
        r3 = r3 - r14;
    L_0x0159:
        r16 = 1;
        if (r9 <= 0) goto L_0x0222;
    L_0x015d:
        if (r9 != r6) goto L_0x0222;
    L_0x015f:
        r1 = r13.m535j();
        if (r1 == 0) goto L_0x0173;
    L_0x0165:
        r1 = r13.m535j();
        r1 = r1.f481B;
        r1 = r1[r23];
        r6 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r1 != r6) goto L_0x0173;
    L_0x0171:
        r1 = 0;
        return r1;
    L_0x0173:
        r3 = r3 + r14;
        r3 = r3 - r15;
        if (r10 == 0) goto L_0x0179;
    L_0x0177:
        r15 = r15 - r0;
        r3 = r3 - r15;
    L_0x0179:
        if (r10 == 0) goto L_0x0195;
    L_0x017b:
        r0 = r4.f530z;
        r0 = r0[r12];
        r0 = r0.m471e();
        r0 = (float) r0;
        r2 = r2 + r0;
        r0 = r4.f504Z;
        r0 = r0[r23];
        if (r0 == 0) goto L_0x0195;
    L_0x018b:
        r0 = r0.f530z;
        r0 = r0[r24];
        r0 = r0.m471e();
        r0 = (float) r0;
        r2 = r2 + r0;
    L_0x0195:
        if (r4 == 0) goto L_0x0220;
    L_0x0197:
        r0 = android.support.constraint.solver.C0140e.f418g;
        if (r0 == 0) goto L_0x01b6;
    L_0x019b:
        r0 = android.support.constraint.solver.C0140e.f418g;
        r10 = r0.f437B;
        r20 = r12;
        r12 = r10 - r16;
        r0.f437B = r12;
        r0 = android.support.constraint.solver.C0140e.f418g;
        r10 = r0.f458s;
        r12 = r10 + r16;
        r0.f458s = r12;
        r0 = android.support.constraint.solver.C0140e.f418g;
        r10 = r0.f464y;
        r12 = r10 + r16;
        r0.f464y = r12;
        goto L_0x01b8;
    L_0x01b6:
        r20 = r12;
    L_0x01b8:
        r0 = r4.f504Z;
        r0 = r0[r23];
        if (r0 != 0) goto L_0x01c5;
    L_0x01be:
        if (r4 != r5) goto L_0x01c1;
    L_0x01c0:
        goto L_0x01c5;
    L_0x01c1:
        r6 = 0;
        r12 = r22;
        goto L_0x021b;
    L_0x01c5:
        r1 = (float) r9;
        r1 = r3 / r1;
        r6 = 0;
        r10 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r10 <= 0) goto L_0x01d4;
    L_0x01cd:
        r1 = r4.f502X;
        r1 = r1[r23];
        r1 = r1 * r3;
        r1 = r1 / r7;
    L_0x01d4:
        r10 = r4.f530z;
        r10 = r10[r24];
        r10 = r10.m471e();
        r10 = (float) r10;
        r2 = r2 + r10;
        r10 = r4.f530z;
        r10 = r10[r24];
        r10 = r10.m462a();
        r11 = r8.f8603e;
        r10.m10649a(r11, r2);
        r10 = r4.f530z;
        r10 = r10[r20];
        r10 = r10.m462a();
        r11 = r8.f8603e;
        r2 = r2 + r1;
        r10.m10649a(r11, r2);
        r1 = r4.f530z;
        r1 = r1[r24];
        r1 = r1.m462a();
        r12 = r22;
        r1.m10648a(r12);
        r1 = r4.f530z;
        r1 = r1[r20];
        r1 = r1.m462a();
        r1.m10648a(r12);
        r1 = r4.f530z;
        r1 = r1[r20];
        r1 = r1.m471e();
        r1 = (float) r1;
        r2 = r2 + r1;
    L_0x021b:
        r4 = r0;
        r12 = r20;
        goto L_0x0195;
    L_0x0220:
        r0 = 1;
        return r0;
    L_0x0222:
        r20 = r12;
        r12 = r22;
        r7 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1));
        if (r7 >= 0) goto L_0x022c;
    L_0x022a:
        r7 = 0;
        return r7;
    L_0x022c:
        if (r1 == 0) goto L_0x02b5;
    L_0x022e:
        r3 = r3 - r0;
        r0 = r19;
        r0 = r0.m557y();
        r3 = r3 * r0;
        r2 = r2 + r3;
    L_0x0238:
        if (r4 == 0) goto L_0x02b2;
    L_0x023a:
        r0 = android.support.constraint.solver.C0140e.f418g;
        if (r0 == 0) goto L_0x0256;
    L_0x023e:
        r0 = android.support.constraint.solver.C0140e.f418g;
        r6 = r0.f437B;
        r9 = r6 - r16;
        r0.f437B = r9;
        r0 = android.support.constraint.solver.C0140e.f418g;
        r6 = r0.f458s;
        r9 = r6 + r16;
        r0.f458s = r9;
        r0 = android.support.constraint.solver.C0140e.f418g;
        r6 = r0.f464y;
        r9 = r6 + r16;
        r0.f464y = r9;
    L_0x0256:
        r0 = r4.f504Z;
        r0 = r0[r23];
        if (r0 != 0) goto L_0x025e;
    L_0x025c:
        if (r4 != r5) goto L_0x02b0;
    L_0x025e:
        if (r23 != 0) goto L_0x0266;
    L_0x0260:
        r1 = r4.m545o();
        r1 = (float) r1;
        goto L_0x026b;
    L_0x0266:
        r1 = r4.m549q();
        r1 = (float) r1;
    L_0x026b:
        r3 = r4.f530z;
        r3 = r3[r24];
        r3 = r3.m471e();
        r3 = (float) r3;
        r2 = r2 + r3;
        r3 = r4.f530z;
        r3 = r3[r24];
        r3 = r3.m462a();
        r6 = r8.f8603e;
        r3.m10649a(r6, r2);
        r3 = r4.f530z;
        r3 = r3[r20];
        r3 = r3.m462a();
        r6 = r8.f8603e;
        r2 = r2 + r1;
        r3.m10649a(r6, r2);
        r1 = r4.f530z;
        r1 = r1[r24];
        r1 = r1.m462a();
        r1.m10648a(r12);
        r1 = r4.f530z;
        r1 = r1[r20];
        r1 = r1.m462a();
        r1.m10648a(r12);
        r1 = r4.f530z;
        r1 = r1[r20];
        r1 = r1.m471e();
        r1 = (float) r1;
        r2 = r2 + r1;
    L_0x02b0:
        r4 = r0;
        goto L_0x0238;
    L_0x02b2:
        r0 = 1;
        goto L_0x035c;
    L_0x02b5:
        if (r10 != 0) goto L_0x02b9;
    L_0x02b7:
        if (r11 == 0) goto L_0x02b2;
    L_0x02b9:
        if (r10 == 0) goto L_0x02bd;
    L_0x02bb:
        r3 = r3 - r0;
        goto L_0x02c0;
    L_0x02bd:
        if (r11 == 0) goto L_0x02c0;
    L_0x02bf:
        r3 = r3 - r0;
    L_0x02c0:
        r0 = r6 + 1;
        r0 = (float) r0;
        r0 = r3 / r0;
        if (r11 == 0) goto L_0x02d4;
    L_0x02c7:
        r1 = 1;
        if (r6 <= r1) goto L_0x02d0;
    L_0x02ca:
        r0 = r6 + -1;
        r0 = (float) r0;
        r0 = r3 / r0;
        goto L_0x02d4;
    L_0x02d0:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r3 / r0;
    L_0x02d4:
        r1 = r2 + r0;
        if (r11 == 0) goto L_0x02e5;
    L_0x02d8:
        r3 = 1;
        if (r6 <= r3) goto L_0x02e5;
    L_0x02db:
        r1 = r4.f530z;
        r1 = r1[r24];
        r1 = r1.m471e();
        r1 = (float) r1;
        r1 = r1 + r2;
    L_0x02e5:
        if (r10 == 0) goto L_0x02f3;
    L_0x02e7:
        if (r4 == 0) goto L_0x02f3;
    L_0x02e9:
        r2 = r4.f530z;
        r2 = r2[r24];
        r2 = r2.m471e();
        r2 = (float) r2;
        r1 = r1 + r2;
    L_0x02f3:
        if (r4 == 0) goto L_0x02b2;
    L_0x02f5:
        r2 = android.support.constraint.solver.C0140e.f418g;
        if (r2 == 0) goto L_0x0311;
    L_0x02f9:
        r2 = android.support.constraint.solver.C0140e.f418g;
        r6 = r2.f437B;
        r9 = r6 - r16;
        r2.f437B = r9;
        r2 = android.support.constraint.solver.C0140e.f418g;
        r6 = r2.f458s;
        r9 = r6 + r16;
        r2.f458s = r9;
        r2 = android.support.constraint.solver.C0140e.f418g;
        r6 = r2.f464y;
        r9 = r6 + r16;
        r2.f464y = r9;
    L_0x0311:
        r2 = r4.f504Z;
        r2 = r2[r23];
        if (r2 != 0) goto L_0x0319;
    L_0x0317:
        if (r4 != r5) goto L_0x035a;
    L_0x0319:
        if (r23 != 0) goto L_0x0321;
    L_0x031b:
        r3 = r4.m545o();
        r3 = (float) r3;
        goto L_0x0326;
    L_0x0321:
        r3 = r4.m549q();
        r3 = (float) r3;
    L_0x0326:
        r6 = r4.f530z;
        r6 = r6[r24];
        r6 = r6.m462a();
        r7 = r8.f8603e;
        r6.m10649a(r7, r1);
        r6 = r4.f530z;
        r6 = r6[r20];
        r6 = r6.m462a();
        r7 = r8.f8603e;
        r9 = r1 + r3;
        r6.m10649a(r7, r9);
        r6 = r4.f530z;
        r6 = r6[r24];
        r6 = r6.m462a();
        r6.m10648a(r12);
        r4 = r4.f530z;
        r4 = r4[r20];
        r4 = r4.m462a();
        r4.m10648a(r12);
        r3 = r3 + r0;
        r1 = r1 + r3;
    L_0x035a:
        r4 = r2;
        goto L_0x02f3;
    L_0x035c:
        return r0;
    L_0x035d:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.g.a(android.support.constraint.solver.widgets.d, android.support.constraint.solver.e, int, int, android.support.constraint.solver.widgets.c):boolean");
    }
}
