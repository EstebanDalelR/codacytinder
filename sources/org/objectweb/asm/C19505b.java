package org.objectweb.asm;

/* renamed from: org.objectweb.asm.b */
final class C19505b extends C19334a {
    /* renamed from: c */
    C19505b f60905c;
    /* renamed from: d */
    C19505b f60906d;
    /* renamed from: e */
    private final C19506g f60907e;
    /* renamed from: f */
    private int f60908f;
    /* renamed from: g */
    private final boolean f60909g;
    /* renamed from: h */
    private final C19336d f60910h;
    /* renamed from: i */
    private final C19336d f60911i;
    /* renamed from: j */
    private final int f60912j;

    C19505b(C19506g c19506g, boolean z, C19336d c19336d, C19336d c19336d2, int i) {
        super(327680);
        this.f60907e = c19506g;
        this.f60909g = z;
        this.f60910h = c19336d;
        this.f60911i = c19336d2;
        this.f60912j = i;
    }

    /* renamed from: a */
    static void m70377a(int i, C19349t c19349t, C19336d c19336d) {
        int i2 = i >>> 24;
        switch (i2) {
            case 0:
            case 1:
                c19336d.m69358b(i >>> 16);
                break;
            default:
                switch (i2) {
                    case 19:
                    case 20:
                    case 21:
                        c19336d.m69352a(i2);
                        break;
                    case 22:
                        break;
                    default:
                        switch (i2) {
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                c19336d.m69360c(i);
                                break;
                            default:
                                c19336d.m69359b(i2, (i & 16776960) >> 8);
                                break;
                        }
                }
                c19336d.m69358b(i >>> 16);
                break;
        }
        if (c19349t == null) {
            c19336d.m69352a(0);
            return;
        }
        c19336d.m69357a(c19349t.f60400a, c19349t.f60401b, (c19349t.f60400a[c19349t.f60401b] * 2) + 1);
    }

    /* renamed from: a */
    static void m70378a(C19505b[] c19505bArr, int i, C19336d c19336d) {
        int length = ((c19505bArr.length - i) * 2) + 1;
        int i2 = i;
        while (true) {
            int i3 = 0;
            if (i2 >= c19505bArr.length) {
                break;
            }
            if (c19505bArr[i2] != null) {
                i3 = c19505bArr[i2].m70385b();
            }
            length += i3;
            i2++;
        }
        c19336d.m69360c(length).m69352a(c19505bArr.length - i);
        while (i < c19505bArr.length) {
            C19505b c19505b = null;
            i2 = 0;
            for (C19505b c19505b2 = c19505bArr[i]; c19505b2 != null; c19505b2 = c19505b2.f60905c) {
                i2++;
                c19505b2.mo14585a();
                c19505b2.f60906d = c19505b;
                c19505b = c19505b2;
            }
            c19336d.m69358b(i2);
            while (c19505b != null) {
                c19336d.m69357a(c19505b.f60910h.f60312a, 0, c19505b.f60910h.f60313b);
                c19505b = c19505b.f60906d;
            }
            i++;
        }
    }

    /* renamed from: a */
    public C19334a mo14583a(String str) {
        this.f60908f++;
        if (this.f60909g) {
            this.f60910h.m69358b(this.f60907e.m70394a(str));
        }
        this.f60910h.m69359b(91, 0);
        return new C19505b(this.f60907e, false, this.f60910h, this.f60910h, this.f60910h.f60313b - 2);
    }

    /* renamed from: a */
    public C19334a mo14584a(String str, String str2) {
        this.f60908f++;
        if (this.f60909g) {
            this.f60910h.m69358b(this.f60907e.m70394a(str));
        }
        this.f60910h.m69359b(64, this.f60907e.m70394a(str2)).m69358b(0);
        return new C19505b(this.f60907e, true, this.f60910h, this.f60910h, this.f60910h.f60313b - 2);
    }

    /* renamed from: a */
    public void mo14585a() {
        if (this.f60911i != null) {
            byte[] bArr = this.f60911i.f60312a;
            bArr[this.f60912j] = (byte) (this.f60908f >>> 8);
            bArr[this.f60912j + 1] = (byte) this.f60908f;
        }
    }

    /* renamed from: a */
    public void mo14586a(String str, Object obj) {
        C19336d c19336d;
        int i;
        C19506g c19506g;
        String str2;
        int i2;
        this.f60908f++;
        if (this.f60909g) {
            this.f60910h.m69358b(this.f60907e.m70394a(str));
        }
        if (obj instanceof String) {
            c19336d = this.f60910h;
            i = 115;
            c19506g = this.f60907e;
            str2 = (String) obj;
        } else {
            i = 66;
            if (obj instanceof Byte) {
                c19336d = this.f60910h;
                i2 = this.f60907e.m70401a(((Byte) obj).byteValue()).f60365a;
                c19336d.m69359b(i, i2);
            } else if (obj instanceof Boolean) {
                this.f60910h.m69359b(90, this.f60907e.m70401a(((Boolean) obj).booleanValue()).f60365a);
                return;
            } else if (obj instanceof Character) {
                this.f60910h.m69359b(67, this.f60907e.m70401a(((Character) obj).charValue()).f60365a);
                return;
            } else if (obj instanceof Short) {
                this.f60910h.m69359b(83, this.f60907e.m70401a(((Short) obj).shortValue()).f60365a);
                return;
            } else if (obj instanceof C19348s) {
                c19336d = this.f60910h;
                i = 99;
                c19506g = this.f60907e;
                str2 = ((C19348s) obj).m69479f();
            } else {
                int i3 = 0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    this.f60910h.m69359b(91, bArr.length);
                    while (i3 < bArr.length) {
                        this.f60910h.m69359b(66, this.f60907e.m70401a(bArr[i3]).f60365a);
                        i3++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    this.f60910h.m69359b(91, zArr.length);
                    while (i3 < zArr.length) {
                        this.f60910h.m69359b(90, this.f60907e.m70401a(zArr[i3]).f60365a);
                        i3++;
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    this.f60910h.m69359b(91, sArr.length);
                    while (i3 < sArr.length) {
                        this.f60910h.m69359b(83, this.f60907e.m70401a(sArr[i3]).f60365a);
                        i3++;
                    }
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    this.f60910h.m69359b(91, cArr.length);
                    while (i3 < cArr.length) {
                        this.f60910h.m69359b(67, this.f60907e.m70401a(cArr[i3]).f60365a);
                        i3++;
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    this.f60910h.m69359b(91, iArr.length);
                    while (i3 < iArr.length) {
                        this.f60910h.m69359b(73, this.f60907e.m70401a(iArr[i3]).f60365a);
                        i3++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    this.f60910h.m69359b(91, jArr.length);
                    while (i3 < jArr.length) {
                        this.f60910h.m69359b(74, this.f60907e.m70403a(jArr[i3]).f60365a);
                        i3++;
                    }
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    this.f60910h.m69359b(91, fArr.length);
                    while (i3 < fArr.length) {
                        this.f60910h.m69359b(70, this.f60907e.m70400a(fArr[i3]).f60365a);
                        i3++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    this.f60910h.m69359b(91, dArr.length);
                    while (i3 < dArr.length) {
                        this.f60910h.m69359b(68, this.f60907e.m70399a(dArr[i3]).f60365a);
                        i3++;
                    }
                } else {
                    C19345o a = this.f60907e.m70404a(obj);
                    this.f60910h.m69359b(".s.IFJDCS".charAt(a.f60366b), a.f60365a);
                }
                return;
            }
        }
        i2 = c19506g.m70394a(str2);
        c19336d.m69359b(i, i2);
    }

    /* renamed from: a */
    public void mo14587a(String str, String str2, String str3) {
        this.f60908f++;
        if (this.f60909g) {
            this.f60910h.m69358b(this.f60907e.m70394a(str));
        }
        this.f60910h.m69359b(101, this.f60907e.m70394a(str2)).m69358b(this.f60907e.m70394a(str3));
    }

    /* renamed from: a */
    void m70384a(C19336d c19336d) {
        C19505b c19505b = null;
        int i = 0;
        int i2 = 2;
        for (C19505b c19505b2 = this; c19505b2 != null; c19505b2 = c19505b2.f60905c) {
            i++;
            i2 += c19505b2.f60910h.f60313b;
            c19505b2.mo14585a();
            c19505b2.f60906d = c19505b;
            c19505b = c19505b2;
        }
        c19336d.m69360c(i2);
        c19336d.m69358b(i);
        while (c19505b != null) {
            c19336d.m69357a(c19505b.f60910h.f60312a, 0, c19505b.f60910h.f60313b);
            c19505b = c19505b.f60906d;
        }
    }

    /* renamed from: b */
    int m70385b() {
        int i = 0;
        for (C19505b c19505b = this; c19505b != null; c19505b = c19505b.f60905c) {
            i += c19505b.f60910h.f60313b;
        }
        return i;
    }
}
