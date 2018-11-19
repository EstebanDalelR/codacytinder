package com.google.android.m4b.maps.ai;

/* renamed from: com.google.android.m4b.maps.ai.b */
public final class C6392b implements C4628d {
    /* renamed from: a */
    private static final C4628d f23721a = new C6392b();

    private C6392b() {
    }

    /* renamed from: a */
    public static C4628d m27903a() {
        return f23721a;
    }

    /* renamed from: a */
    private static int m27902a(C4627c c4627c, int i, int i2, int i3) {
        if (c4627c.mo5032a(i, i2)) {
            if (c4627c.mo5032a(i2, i3)) {
                return i2;
            }
            return c4627c.mo5032a(i, i3) != null ? i3 : i;
        } else if (c4627c.mo5032a(i3, i2)) {
            return i2;
        } else {
            return c4627c.mo5032a(i3, i) != null ? i3 : i;
        }
    }

    /* renamed from: b */
    private static void m27904b(C4627c c4627c, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            c4627c.mo5034b(i + i4, i2 + i4);
        }
    }

    /* renamed from: a */
    public final void mo4859a(C4627c c4627c, int i, int i2) {
        while (true) {
            int i3 = i2 - i;
            if (i3 >= 8) {
                int i4;
                if (i3 + 1 > 100) {
                    i3 /= 8;
                    i3 = C6392b.m27902a(c4627c, C6392b.m27902a(c4627c, (i3 * 0) + i, (i3 * 1) + i, (i3 * 2) + i), C6392b.m27902a(c4627c, (i3 * 3) + i, (i3 * 4) + i, (i3 * 5) + i), C6392b.m27902a(c4627c, (i3 * 6) + i, (i3 * 7) + i, (i3 * 8) + i));
                } else {
                    i3 = C6392b.m27902a(c4627c, i, (i + i2) / 2, i2);
                }
                int i5 = i;
                int i6 = i2;
                int i7 = i6;
                int i8 = i3;
                i3 = i5;
                while (true) {
                    if (i3 > i6 || c4627c.mo5032a(i8, i3)) {
                        while (i3 <= i6 && !c4627c.mo5032a(i6, i8)) {
                            if (!c4627c.mo5032a(i8, i6)) {
                                c4627c.mo5034b(i6, i7);
                                i4 = i7;
                                i7--;
                                i8 = i4;
                            }
                            i6--;
                        }
                        if (i3 > i6) {
                            break;
                        }
                        if (i3 == i8) {
                            i8 = i6;
                        } else if (i6 == i8) {
                            i8 = i3;
                        }
                        c4627c.mo5034b(i3, i6);
                        i3++;
                        i6--;
                    } else {
                        if (!c4627c.mo5032a(i3, i8)) {
                            c4627c.mo5034b(i5, i3);
                            i4 = i5;
                            i5++;
                            i8 = i4;
                        }
                        i3++;
                    }
                }
                i8 = i5 - i;
                i5 = i3 - i5;
                i8 = Math.min(i8, i5);
                C6392b.m27904b(c4627c, i, i3 - i8, i8);
                i6 = i7 - i6;
                i8 = Math.min(i6, i2 - i7);
                i7 = i2 + 1;
                C6392b.m27904b(c4627c, i3, i7 - i8, i8);
                i3 = (i5 + i) - 1;
                i6 = i7 - i6;
                if (i3 - i < i2 - i6) {
                    i4 = i3;
                    i3 = i2;
                    i2 = i4;
                } else {
                    i4 = i6;
                    i6 = i;
                    i = i4;
                }
                if (i < i2) {
                    mo4859a(c4627c, i, i2);
                }
                i2 = i3;
                i = i6;
            } else {
                C6391a.m27900a().mo4859a(c4627c, i, i2);
                return;
            }
        }
    }
}
