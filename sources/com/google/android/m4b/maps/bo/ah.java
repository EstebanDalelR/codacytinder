package com.google.android.m4b.maps.bo;

public final class ah {
    /* renamed from: a */
    public static int m21500a(af afVar, af afVar2, af afVar3) {
        afVar = (((long) (afVar3.f17658a - afVar.f17658a)) * ((long) (afVar3.f17659b - afVar2.f17659b))) - (((long) (afVar3.f17659b - afVar.f17659b)) * ((long) (afVar3.f17658a - afVar2.f17658a)));
        return (int) (((long) (afVar != 0 ? true : null)) | (afVar >> 63));
    }

    /* renamed from: a */
    public static boolean m21503a(af afVar, af afVar2, af afVar3, af afVar4) {
        af afVar5 = afVar;
        af afVar6 = afVar2;
        af afVar7 = afVar3;
        af afVar8 = afVar4;
        int i = afVar6.f17658a - afVar5.f17658a;
        int i2 = afVar6.f17659b - afVar5.f17659b;
        int i3 = afVar8.f17658a - afVar7.f17658a;
        int i4 = afVar8.f17659b - afVar7.f17659b;
        int i5 = afVar7.f17658a - afVar5.f17658a;
        int i6 = afVar7.f17659b - afVar5.f17659b;
        long j = (long) i3;
        long j2 = (long) i2;
        long j3 = j * j2;
        long j4 = j;
        j = (long) i4;
        int i7 = i3;
        int i8 = i4;
        long j5 = (long) i;
        long j6 = j;
        j = j3 - (j * j5);
        if (j != 0) {
            long j7 = (long) i6;
            double d = ((double) ((((long) (-i5)) * j2) + (j5 * j7))) / ((double) j);
            if (d >= 0.0d) {
                if (d <= 1.0d) {
                    d = ((double) ((((long) i5) * j6) - (j7 * j4))) / ((double) (-j));
                    return d >= 0.0d && d <= 1.0d;
                }
            }
            return false;
        } else if (i5 == 0 && i6 == 0) {
            return true;
        } else {
            if ((((long) i5) * j2) - (((long) i6) * j5) != 0) {
                return false;
            }
            if (i == 0 && i2 == 0) {
                return m21511f(afVar7, afVar8, afVar5);
            }
            if (i7 == 0 && i8 == 0) {
                return m21511f(afVar, afVar2, afVar3);
            }
            if (!(m21511f(afVar, afVar2, afVar3) || m21511f(afVar5, afVar6, afVar8) || m21511f(afVar7, afVar8, afVar5))) {
                if (!m21511f(afVar7, afVar8, afVar6)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m21504a(af afVar, af afVar2, af afVar3, af afVar4, af afVar5) {
        long j = (long) (afVar.f17659b - afVar2.f17659b);
        long j2 = (long) (afVar2.f17658a - afVar.f17658a);
        long j3 = (((long) (afVar4.f17658a - afVar3.f17658a)) * j) + (((long) (afVar4.f17659b - afVar3.f17659b)) * j2);
        if (j3 != 0) {
            afVar = ((double) ((((long) (afVar.f17658a - afVar3.f17658a)) * j) + (((long) (afVar.f17659b - afVar3.f17659b)) * j2))) / ((double) j3);
            if (afVar >= 0.0d) {
                if (afVar <= 1.0d) {
                    afVar5.f17658a = (int) (((double) afVar3.f17658a) + (((double) (afVar4.f17658a - afVar3.f17658a)) * afVar));
                    afVar5.f17659b = (int) (((double) afVar3.f17659b) + (((double) (afVar4.f17659b - afVar3.f17659b)) * afVar));
                    return true;
                }
            }
            return false;
        } else if (m21500a(afVar, afVar2, afVar3) == 0) {
            afVar5.m21482b(afVar3);
            return true;
        } else if (m21500a(afVar, afVar2, afVar4) != null) {
            return false;
        } else {
            afVar5.m21482b(afVar4);
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m21506b(af afVar, af afVar2, af afVar3) {
        int i = afVar.f17658a;
        afVar = afVar.f17659b;
        int i2 = afVar2.f17658a;
        afVar2 = afVar2.f17659b;
        int i3 = afVar3.f17658a;
        afVar3 = afVar3.f17659b;
        if (afVar <= afVar3 && afVar2 <= afVar3) {
            return false;
        }
        if (i3 >= i && i3 >= i2) {
            return false;
        }
        if (i3 >= i || i3 >= i2) {
            return i2 >= i ? ((long) (i3 - i)) * ((long) (afVar2 - afVar)) > ((long) (afVar3 - afVar)) * ((long) (i2 - i)) : ((long) (i3 - i)) * ((long) (afVar2 - afVar)) < ((long) (afVar3 - afVar)) * ((long) (i2 - i));
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static void m21508c(af afVar, af afVar2, af afVar3) {
        afVar3.f17658a = afVar.f17658a + afVar2.f17658a;
        afVar3.f17659b = afVar.f17659b + afVar2.f17659b;
    }

    /* renamed from: d */
    public static void m21509d(af afVar, af afVar2, af afVar3) {
        afVar3.f17658a = afVar.f17658a - afVar2.f17658a;
        afVar3.f17659b = afVar.f17659b - afVar2.f17659b;
    }

    /* renamed from: e */
    public static void m21510e(af afVar, af afVar2, af afVar3) {
        afVar3.f17658a = (afVar.f17658a / 2) + (afVar2.f17658a / 2);
        afVar3.f17659b = (afVar.f17659b / 2) + (afVar2.f17659b / 2);
    }

    /* renamed from: a */
    public static void m21501a(af afVar, float f, af afVar2) {
        float hypot = (float) Math.hypot((double) afVar.f17658a, (double) afVar.f17659b);
        if (hypot == 0.0f) {
            afVar2.f17658a = (int) f;
            afVar2.f17659b = null;
            return;
        }
        f /= hypot;
        afVar2.f17658a = (int) (((float) (-afVar.f17659b)) * f);
        afVar2.f17659b = (int) (((float) afVar.f17658a) * f);
    }

    /* renamed from: a */
    public static void m21502a(af afVar, af afVar2) {
        afVar2.f17658a = -afVar.f17659b;
        afVar2.f17659b = afVar.f17658a;
    }

    /* renamed from: b */
    public static float m21505b(af afVar, af afVar2) {
        return m21499a(afVar2.f17658a - afVar.f17658a, afVar2.f17659b - afVar.f17659b);
    }

    /* renamed from: a */
    public static float m21499a(int i, int i2) {
        i2 = 1119092736 - ((float) ((Math.atan2((double) i2, (double) i) * 180.0d) / 3.141592653589793d));
        return i2 < 0 ? i2 + 1135869952 : i2;
    }

    /* renamed from: c */
    public static long m21507c(af afVar, af afVar2) {
        return (((long) afVar.f17658a) * ((long) afVar2.f17659b)) - (((long) afVar.f17659b) * ((long) afVar2.f17658a));
    }

    /* renamed from: f */
    private static boolean m21511f(af afVar, af afVar2, af afVar3) {
        long j = (long) (afVar2.f17658a - afVar.f17658a);
        long j2 = (long) (afVar2.f17659b - afVar.f17659b);
        long j3 = (((long) (afVar3.f17658a - afVar.f17658a)) * j) + (((long) (afVar3.f17659b - afVar.f17659b)) * j2);
        return (j3 < 0 || j3 > (j * j) + (j2 * j2)) ? null : true;
    }
}
