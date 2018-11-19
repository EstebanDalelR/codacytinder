package org.objectweb.asm;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: org.objectweb.asm.r */
class C19508r extends C19347q {
    /* renamed from: A */
    private C19336d f60964A;
    /* renamed from: B */
    private int f60965B;
    /* renamed from: C */
    private int[] f60966C;
    /* renamed from: D */
    private int[] f60967D;
    /* renamed from: E */
    private int f60968E;
    /* renamed from: F */
    private C19344n f60969F;
    /* renamed from: G */
    private C19344n f60970G;
    /* renamed from: H */
    private int f60971H;
    /* renamed from: I */
    private C19336d f60972I;
    /* renamed from: J */
    private int f60973J;
    /* renamed from: K */
    private C19336d f60974K;
    /* renamed from: L */
    private int f60975L;
    /* renamed from: M */
    private C19336d f60976M;
    /* renamed from: N */
    private int f60977N;
    /* renamed from: O */
    private C19336d f60978O;
    /* renamed from: P */
    private int f60979P;
    /* renamed from: Q */
    private C19505b f60980Q;
    /* renamed from: R */
    private C19505b f60981R;
    /* renamed from: S */
    private C19335c f60982S;
    /* renamed from: T */
    private boolean f60983T;
    /* renamed from: U */
    private int f60984U;
    /* renamed from: V */
    private final int f60985V;
    /* renamed from: W */
    private C19346p f60986W;
    /* renamed from: X */
    private C19346p f60987X;
    /* renamed from: Y */
    private C19346p f60988Y;
    /* renamed from: Z */
    private int f60989Z;
    private int aa;
    /* renamed from: c */
    final C19506g f60990c;
    /* renamed from: d */
    String f60991d;
    /* renamed from: e */
    int f60992e;
    /* renamed from: f */
    int f60993f;
    /* renamed from: g */
    int f60994g;
    /* renamed from: h */
    int[] f60995h;
    /* renamed from: i */
    private int f60996i;
    /* renamed from: j */
    private final int f60997j;
    /* renamed from: k */
    private final int f60998k;
    /* renamed from: l */
    private final String f60999l;
    /* renamed from: m */
    private C19336d f61000m;
    /* renamed from: n */
    private C19505b f61001n;
    /* renamed from: o */
    private C19505b f61002o;
    /* renamed from: p */
    private C19505b f61003p;
    /* renamed from: q */
    private C19505b f61004q;
    /* renamed from: r */
    private C19505b[] f61005r;
    /* renamed from: s */
    private C19505b[] f61006s;
    /* renamed from: t */
    private int f61007t;
    /* renamed from: u */
    private C19335c f61008u;
    /* renamed from: v */
    private C19336d f61009v = new C19336d();
    /* renamed from: w */
    private int f61010w;
    /* renamed from: x */
    private int f61011x;
    /* renamed from: y */
    private int f61012y;
    /* renamed from: z */
    private int f61013z;

    C19508r(C19506g c19506g, int i, String str, String str2, String str3, String[] strArr, boolean z, boolean z2) {
        super(327680);
        if (c19506g.f60946t == null) {
            c19506g.f60946t = this;
        } else {
            c19506g.f60947u.b = this;
        }
        c19506g.f60947u = this;
        this.f60990c = c19506g;
        this.f60996i = i;
        if ("<init>".equals(str)) {
            this.f60996i |= 524288;
        }
        this.f60997j = c19506g.m70394a(str);
        this.f60998k = c19506g.m70394a(str2);
        this.f60999l = str2;
        this.f60991d = str3;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            this.f60994g = strArr.length;
            this.f60995h = new int[this.f60994g];
            for (int i3 = 0; i3 < this.f60994g; i3++) {
                this.f60995h[i3] = c19506g.m70421c(strArr[i3]);
            }
        }
        if (!z2) {
            i2 = z ? 1 : 2;
        }
        this.f60985V = i2;
        if (z || z2) {
            int e = C19348s.m69472e(this.f60999l) >> 2;
            if ((i & 8) != 0) {
                e--;
            }
            this.f61011x = e;
            this.f61012y = e;
            this.f60986W = new C19346p();
            C19346p c19346p = this.f60986W;
            c19346p.f60374a |= 8;
            mo14620a(this.f60986W);
        }
    }

    /* renamed from: a */
    private int m70433a(int i, int i2, int i3) {
        int i4 = (i2 + 3) + i3;
        if (this.f60967D == null || this.f60967D.length < i4) {
            this.f60967D = new int[i4];
        }
        this.f60967D[0] = i;
        this.f60967D[1] = i2;
        this.f60967D[2] = i3;
        return 3;
    }

    /* renamed from: a */
    static int m70434a(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: a */
    static int m70435a(int[] iArr, int[] iArr2, int i, int i2) {
        int i3 = i2 - i;
        int i4 = 0;
        while (i4 < iArr.length) {
            if (i < iArr[i4] && iArr[i4] <= i2) {
                i3 += iArr2[i4];
            } else if (i2 < iArr[i4] && iArr[i4] <= i) {
                i3 -= iArr2[i4];
            }
            i4++;
        }
        return i3;
    }

    /* renamed from: a */
    private void m70436a(C19342l c19342l) {
        int[] iArr = c19342l.f60348c;
        int[] iArr2 = c19342l.f60349d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < iArr.length) {
            int i5 = iArr[i2];
            if (i5 == 16777216) {
                i3++;
            } else {
                i4 += i3 + 1;
                i3 = 0;
            }
            if (i5 == 16777220 || i5 == 16777219) {
                i2++;
            }
            i2++;
        }
        i2 = 0;
        i3 = 0;
        while (i2 < iArr2.length) {
            i5 = iArr2[i2];
            i3++;
            if (i5 == 16777220 || i5 == 16777219) {
                i2++;
            }
            i2++;
        }
        i2 = m70433a(c19342l.f60347b.f60376c, i4, i3);
        int i6 = 0;
        while (i4 > 0) {
            i3 = iArr[i6];
            int i7 = i2 + 1;
            this.f60967D[i2] = i3;
            if (i3 == 16777220 || i3 == 16777219) {
                i6++;
            }
            i6++;
            i4--;
            i2 = i7;
        }
        while (i < iArr2.length) {
            i6 = iArr2[i];
            i3 = i2 + 1;
            this.f60967D[i2] = i6;
            if (i6 == 16777220 || i6 == 16777219) {
                i++;
            }
            i++;
            i2 = i3;
        }
        m70447g();
    }

    /* renamed from: a */
    private void m70437a(C19346p c19346p, C19346p[] c19346pArr) {
        if (this.f60988Y != null) {
            int i = 0;
            if (this.f60985V == 0) {
                this.f60988Y.f60379f.m69412a(171, 0, null, null);
                m70443c(0, c19346p);
                c19346p = c19346p.m69425a();
                c19346p.f60374a |= 16;
                for (int i2 = 0; i2 < c19346pArr.length; i2++) {
                    m70443c(0, c19346pArr[i2]);
                    C19346p a = c19346pArr[i2].m69425a();
                    a.f60374a |= 16;
                }
            } else {
                this.f60989Z--;
                m70443c(this.f60989Z, c19346p);
                while (i < c19346pArr.length) {
                    m70443c(this.f60989Z, c19346pArr[i]);
                    i++;
                }
            }
            m70444e();
        }
    }

    /* renamed from: a */
    static void m70438a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >>> 8);
        bArr[i + 1] = (byte) i2;
    }

    /* renamed from: a */
    static void m70439a(int[] iArr, int[] iArr2, C19346p c19346p) {
        if ((c19346p.f60374a & 4) == 0) {
            c19346p.f60376c = C19508r.m70435a(iArr, iArr2, 0, c19346p.f60376c);
            c19346p.f60374a |= 4;
        }
    }

    /* renamed from: b */
    static short m70440b(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: b */
    private void m70441b(java.lang.Object r3) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0034 in {2, 4, 8, 9} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
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
        r0 = r3 instanceof java.lang.String;
        if (r0 == 0) goto L_0x0017;
    L_0x0004:
        r0 = r2.f60964A;
        r1 = 7;
        r0 = r0.m69352a(r1);
        r1 = r2.f60990c;
        r3 = (java.lang.String) r3;
        r3 = r1.m70421c(r3);
    L_0x0013:
        r0.m69358b(r3);
        return;
    L_0x0017:
        r0 = r3 instanceof java.lang.Integer;
        if (r0 == 0) goto L_0x0027;
    L_0x001b:
        r0 = r2.f60964A;
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r0.m69352a(r3);
        return;
    L_0x0027:
        r0 = r2.f60964A;
        r1 = 8;
        r0 = r0.m69352a(r1);
        r3 = (org.objectweb.asm.C19346p) r3;
        r3 = r3.f60376c;
        goto L_0x0013;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.r.b(java.lang.Object):void");
    }

    /* renamed from: c */
    static int m70442c(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16)) | ((bArr[i + 2] & 255) << 8));
    }

    /* renamed from: c */
    private void m70443c(int i, C19346p c19346p) {
        C19340i c19340i = new C19340i();
        c19340i.f60341a = i;
        c19340i.f60342b = c19346p;
        c19340i.f60343c = this.f60988Y.f60381h;
        this.f60988Y.f60381h = c19340i;
    }

    /* renamed from: e */
    private void m70444e() {
        if (this.f60985V == 0) {
            C19346p c19346p = new C19346p();
            c19346p.f60379f = new C19342l();
            c19346p.f60379f.f60347b = c19346p;
            c19346p.m69431a(this, this.f61009v.f60313b, this.f61009v.f60312a);
            this.f60987X.f60380g = c19346p;
            this.f60987X = c19346p;
        } else {
            this.f60988Y.f60378e = this.aa;
        }
        this.f60988Y = null;
    }

    /* renamed from: e */
    private void m70445e(int i, int i2) {
        while (i < i2) {
            C19336d a;
            int i3 = this.f60967D[i];
            int i4 = -268435456 & i3;
            if (i4 == 0) {
                i4 = i3 & 1048575;
                i3 &= 267386880;
                if (i3 == 24117248) {
                    a = this.f60964A.m69352a(7);
                    i4 = this.f60990c.m70421c(this.f60990c.f60940n[i4].f60369e);
                } else if (i3 != 25165824) {
                    this.f60964A.m69352a(i4);
                    i++;
                } else {
                    a = this.f60964A.m69352a(8);
                    i4 = this.f60990c.f60940n[i4].f60367c;
                }
            } else {
                char c;
                StringBuffer stringBuffer = new StringBuffer();
                i4 >>= 28;
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0) {
                        break;
                    }
                    stringBuffer.append('[');
                    i4 = i5;
                }
                if ((i3 & 267386880) != 24117248) {
                    i3 &= 15;
                    switch (i3) {
                        case 1:
                            c = 'I';
                            break;
                        case 2:
                            c = 'F';
                            break;
                        case 3:
                            c = 'D';
                            break;
                        default:
                            switch (i3) {
                                case 9:
                                    c = 'Z';
                                    break;
                                case 10:
                                    c = 'B';
                                    break;
                                case 11:
                                    c = 'C';
                                    break;
                                case 12:
                                    c = 'S';
                                    break;
                                default:
                                    c = 'J';
                                    break;
                            }
                    }
                }
                stringBuffer.append('L');
                stringBuffer.append(this.f60990c.f60940n[i3 & 1048575].f60369e);
                c = ';';
                stringBuffer.append(c);
                a = this.f60964A.m69352a(7);
                i4 = this.f60990c.m70421c(stringBuffer.toString());
            }
            a.m69358b(i4);
            i++;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: f */
    private void m70446f() {
        /*
        r10 = this;
        r0 = r10.f60999l;
        r0 = r0.length();
        r1 = 1;
        r0 = r0 + r1;
        r2 = 0;
        r0 = r10.m70433a(r2, r0, r2);
        r2 = r10.f60996i;
        r2 = r2 & 8;
        r3 = 24117248; // 0x1700000 float:4.4081038E-38 double:1.19155037E-316;
        if (r2 != 0) goto L_0x0036;
    L_0x0015:
        r2 = r10.f60996i;
        r4 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r2 = r2 & r4;
        if (r2 != 0) goto L_0x002e;
    L_0x001c:
        r2 = r10.f60967D;
        r4 = r0 + 1;
        r5 = r10.f60990c;
        r6 = r10.f60990c;
        r6 = r6.f60941o;
        r5 = r5.m70426e(r6);
        r5 = r5 | r3;
        r2[r0] = r5;
        goto L_0x0037;
    L_0x002e:
        r2 = r10.f60967D;
        r4 = r0 + 1;
        r5 = 6;
        r2[r0] = r5;
        goto L_0x0037;
    L_0x0036:
        r4 = r0;
    L_0x0037:
        r0 = 1;
    L_0x0038:
        r2 = r10.f60999l;
        r5 = r0 + 1;
        r2 = r2.charAt(r0);
        r6 = 3;
        r7 = 59;
        switch(r2) {
            case 66: goto L_0x00bc;
            case 67: goto L_0x00bc;
            case 68: goto L_0x00b5;
            case 70: goto L_0x00ad;
            case 73: goto L_0x00bc;
            case 74: goto L_0x00a5;
            case 76: goto L_0x0081;
            case 83: goto L_0x00bc;
            case 90: goto L_0x00bc;
            case 91: goto L_0x0048;
            default: goto L_0x0046;
        };
    L_0x0046:
        goto L_0x00c6;
    L_0x0048:
        r2 = r10.f60999l;
        r2 = r2.charAt(r5);
        r6 = 91;
        if (r2 != r6) goto L_0x0055;
    L_0x0052:
        r5 = r5 + 1;
        goto L_0x0048;
    L_0x0055:
        r2 = r10.f60999l;
        r2 = r2.charAt(r5);
        r6 = 76;
        if (r2 != r6) goto L_0x006a;
    L_0x005f:
        r5 = r5 + 1;
        r2 = r10.f60999l;
        r2 = r2.charAt(r5);
        if (r2 == r7) goto L_0x006a;
    L_0x0069:
        goto L_0x005f;
    L_0x006a:
        r2 = r10.f60967D;
        r6 = r4 + 1;
        r7 = r10.f60990c;
        r8 = r10.f60999l;
        r5 = r5 + r1;
        r0 = r8.substring(r0, r5);
        r0 = r7.m70426e(r0);
        r0 = r0 | r3;
        r2[r4] = r0;
        r0 = r5;
        r4 = r6;
        goto L_0x0038;
    L_0x0081:
        r0 = r5;
    L_0x0082:
        r2 = r10.f60999l;
        r2 = r2.charAt(r0);
        if (r2 == r7) goto L_0x008d;
    L_0x008a:
        r0 = r0 + 1;
        goto L_0x0082;
    L_0x008d:
        r2 = r10.f60967D;
        r6 = r4 + 1;
        r7 = r10.f60990c;
        r8 = r10.f60999l;
        r9 = r0 + 1;
        r0 = r8.substring(r5, r0);
        r0 = r7.m70426e(r0);
        r0 = r0 | r3;
        r2[r4] = r0;
        r4 = r6;
        r0 = r9;
        goto L_0x0038;
    L_0x00a5:
        r0 = r10.f60967D;
        r2 = r4 + 1;
        r6 = 4;
        r0[r4] = r6;
        goto L_0x00c2;
    L_0x00ad:
        r0 = r10.f60967D;
        r2 = r4 + 1;
        r6 = 2;
        r0[r4] = r6;
        goto L_0x00c2;
    L_0x00b5:
        r0 = r10.f60967D;
        r2 = r4 + 1;
        r0[r4] = r6;
        goto L_0x00c2;
    L_0x00bc:
        r0 = r10.f60967D;
        r2 = r4 + 1;
        r0[r4] = r1;
    L_0x00c2:
        r4 = r2;
        r0 = r5;
        goto L_0x0038;
    L_0x00c6:
        r0 = r10.f60967D;
        r4 = r4 - r6;
        r0[r1] = r4;
        r10.m70447g();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.r.f():void");
    }

    /* renamed from: g */
    private void m70447g() {
        if (this.f60966C != null) {
            if (this.f60964A == null) {
                this.f60964A = new C19336d();
            }
            m70448h();
            this.f61013z++;
        }
        this.f60966C = this.f60967D;
        this.f60967D = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: h */
    private void m70448h() {
        /*
        r17 = this;
        r0 = r17;
        r1 = r0.f60967D;
        r2 = 1;
        r1 = r1[r2];
        r3 = r0.f60967D;
        r4 = 2;
        r3 = r3[r4];
        r4 = r0.f60990c;
        r4 = r4.f60931e;
        r5 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r4 = r4 & r5;
        r5 = 0;
        r6 = 3;
        r7 = 50;
        if (r4 >= r7) goto L_0x0035;
    L_0x001a:
        r2 = r0.f60964A;
        r4 = r0.f60967D;
        r4 = r4[r5];
        r2 = r2.m69358b(r4);
        r2.m69358b(r1);
        r1 = r1 + r6;
        r0.m70445e(r6, r1);
        r2 = r0.f60964A;
        r2.m69358b(r3);
        r3 = r3 + r1;
        r0.m70445e(r1, r3);
        return;
    L_0x0035:
        r4 = r0.f60966C;
        r4 = r4[r2];
        r7 = r0.f61013z;
        if (r7 != 0) goto L_0x0042;
    L_0x003d:
        r7 = r0.f60967D;
        r7 = r7[r5];
        goto L_0x004c;
    L_0x0042:
        r7 = r0.f60967D;
        r7 = r7[r5];
        r8 = r0.f60966C;
        r8 = r8[r5];
        r7 = r7 - r8;
        r7 = r7 - r2;
    L_0x004c:
        r8 = 247; // 0xf7 float:3.46E-43 double:1.22E-321;
        r9 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        r10 = 64;
        r11 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r3 != 0) goto L_0x0073;
    L_0x0056:
        r2 = r1 - r4;
        switch(r2) {
            case -3: goto L_0x0068;
            case -2: goto L_0x0068;
            case -1: goto L_0x0068;
            case 0: goto L_0x0061;
            case 1: goto L_0x005e;
            case 2: goto L_0x005e;
            case 3: goto L_0x005e;
            default: goto L_0x005b;
        };
    L_0x005b:
        r12 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        goto L_0x006d;
    L_0x005e:
        r12 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        goto L_0x006d;
    L_0x0061:
        if (r7 >= r10) goto L_0x0065;
    L_0x0063:
        r12 = 0;
        goto L_0x006d;
    L_0x0065:
        r12 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        goto L_0x006d;
    L_0x0068:
        r4 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;
        r4 = r1;
        r12 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;
    L_0x006d:
        r16 = r12;
        r12 = r2;
        r2 = r16;
        goto L_0x0084;
    L_0x0073:
        if (r1 != r4) goto L_0x0081;
    L_0x0075:
        if (r3 != r2) goto L_0x0081;
    L_0x0077:
        r2 = 63;
        if (r7 >= r2) goto L_0x007e;
    L_0x007b:
        r2 = 64;
        goto L_0x0083;
    L_0x007e:
        r2 = 247; // 0xf7 float:3.46E-43 double:1.22E-321;
        goto L_0x0083;
    L_0x0081:
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
    L_0x0083:
        r12 = 0;
    L_0x0084:
        if (r2 == r11) goto L_0x009b;
    L_0x0086:
        r13 = 3;
    L_0x0087:
        if (r5 >= r4) goto L_0x009b;
    L_0x0089:
        r14 = r0.f60967D;
        r14 = r14[r13];
        r15 = r0.f60966C;
        r15 = r15[r13];
        if (r14 == r15) goto L_0x0096;
    L_0x0093:
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        goto L_0x009b;
    L_0x0096:
        r13 = r13 + 1;
        r5 = r5 + 1;
        goto L_0x0087;
    L_0x009b:
        if (r2 == 0) goto L_0x00fa;
    L_0x009d:
        if (r2 == r10) goto L_0x00ec;
    L_0x009f:
        switch(r2) {
            case 247: goto L_0x00e2;
            case 248: goto L_0x00d7;
            default: goto L_0x00a2;
        };
    L_0x00a2:
        switch(r2) {
            case 251: goto L_0x00d0;
            case 252: goto L_0x00c0;
            default: goto L_0x00a5;
        };
    L_0x00a5:
        r2 = r0.f60964A;
        r2 = r2.m69352a(r11);
        r2 = r2.m69358b(r7);
        r2.m69358b(r1);
        r1 = r1 + r6;
        r0.m70445e(r6, r1);
        r2 = r0.f60964A;
        r2.m69358b(r3);
        r3 = r3 + r1;
        r0.m70445e(r1, r3);
        return;
    L_0x00c0:
        r2 = r0.f60964A;
        r12 = r12 + r9;
        r2 = r2.m69352a(r12);
        r2.m69358b(r7);
        r4 = r4 + r6;
        r1 = r1 + r6;
        r0.m70445e(r4, r1);
        return;
    L_0x00d0:
        r1 = r0.f60964A;
        r1 = r1.m69352a(r9);
        goto L_0x00de;
    L_0x00d7:
        r1 = r0.f60964A;
        r12 = r12 + r9;
        r1 = r1.m69352a(r12);
    L_0x00de:
        r1.m69358b(r7);
        return;
    L_0x00e2:
        r2 = r0.f60964A;
        r2 = r2.m69352a(r8);
        r2.m69358b(r7);
        goto L_0x00f2;
    L_0x00ec:
        r2 = r0.f60964A;
        r7 = r7 + r10;
        r2.m69352a(r7);
    L_0x00f2:
        r2 = r1 + 3;
        r1 = r1 + 4;
        r0.m70445e(r2, r1);
        return;
    L_0x00fa:
        r1 = r0.f60964A;
        r1.m69352a(r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.r.h():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: i */
    private void m70449i() {
        /*
        r19 = this;
        r0 = r19;
        r1 = r0.f61009v;
        r1 = r1.f60312a;
        r2 = 0;
        r3 = new int[r2];
        r4 = new int[r2];
        r5 = r0.f61009v;
        r5 = r5.f60313b;
        r5 = new boolean[r5];
        r6 = 3;
        r7 = r4;
        r4 = r3;
        r3 = 3;
    L_0x0015:
        if (r3 != r6) goto L_0x0018;
    L_0x0017:
        r3 = 2;
    L_0x0018:
        r9 = r7;
        r7 = r4;
        r4 = r3;
        r3 = 0;
    L_0x001c:
        r10 = r1.length;
        r11 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r12 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r13 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r14 = 8;
        r8 = 1;
        r15 = 4;
        if (r3 >= r10) goto L_0x0105;
    L_0x0029:
        r10 = r1[r3];
        r10 = r10 & 255;
        r17 = org.objectweb.asm.C19506g.f60913c;
        r17 = r17[r10];
        switch(r17) {
            case 0: goto L_0x00de;
            case 1: goto L_0x00da;
            case 2: goto L_0x00d6;
            case 3: goto L_0x00da;
            case 4: goto L_0x00de;
            case 5: goto L_0x00d6;
            case 6: goto L_0x00d6;
            case 7: goto L_0x00d2;
            case 8: goto L_0x00d2;
            case 9: goto L_0x0093;
            case 10: goto L_0x00d2;
            case 11: goto L_0x00da;
            case 12: goto L_0x00d6;
            case 13: goto L_0x00d6;
            case 14: goto L_0x0066;
            case 15: goto L_0x0044;
            case 16: goto L_0x0034;
            case 17: goto L_0x0039;
            default: goto L_0x0034;
        };
    L_0x0034:
        r3 = r3 + 4;
    L_0x0036:
        r10 = 0;
        goto L_0x00e2;
    L_0x0039:
        r10 = r3 + 1;
        r10 = r1[r10];
        r10 = r10 & 255;
        if (r10 != r12) goto L_0x0034;
    L_0x0041:
        r3 = r3 + 6;
        goto L_0x0036;
    L_0x0044:
        if (r4 != r8) goto L_0x004d;
    L_0x0046:
        r10 = org.objectweb.asm.C19508r.m70435a(r7, r9, r2, r3);
        r10 = r10 & r6;
        r10 = -r10;
        goto L_0x0057;
    L_0x004d:
        r10 = r5[r3];
        if (r10 != 0) goto L_0x0056;
    L_0x0051:
        r10 = r3 & 3;
        r5[r3] = r8;
        goto L_0x0057;
    L_0x0056:
        r10 = 0;
    L_0x0057:
        r11 = r3 + 4;
        r3 = r3 & 3;
        r11 = r11 - r3;
        r3 = r11 + 4;
        r3 = org.objectweb.asm.C19508r.m70442c(r1, r3);
        r3 = r3 * 8;
        r3 = r3 + r14;
        goto L_0x0090;
    L_0x0066:
        if (r4 != r8) goto L_0x006f;
    L_0x0068:
        r10 = org.objectweb.asm.C19508r.m70435a(r7, r9, r2, r3);
        r10 = r10 & r6;
        r10 = -r10;
        goto L_0x0079;
    L_0x006f:
        r10 = r5[r3];
        if (r10 != 0) goto L_0x0078;
    L_0x0073:
        r10 = r3 & 3;
        r5[r3] = r8;
        goto L_0x0079;
    L_0x0078:
        r10 = 0;
    L_0x0079:
        r11 = r3 + 4;
        r3 = r3 & 3;
        r11 = r11 - r3;
        r3 = r11 + 8;
        r3 = org.objectweb.asm.C19508r.m70442c(r1, r3);
        r12 = r11 + 4;
        r12 = org.objectweb.asm.C19508r.m70442c(r1, r12);
        r3 = r3 - r12;
        r3 = r3 + r8;
        r3 = r3 * 4;
        r3 = r3 + 12;
    L_0x0090:
        r11 = r11 + r3;
        r3 = r11;
        goto L_0x00e2;
    L_0x0093:
        if (r10 <= r13) goto L_0x00a3;
    L_0x0095:
        if (r10 >= r11) goto L_0x009a;
    L_0x0097:
        r10 = r10 + -49;
        goto L_0x009c;
    L_0x009a:
        r10 = r10 + -20;
    L_0x009c:
        r11 = r3 + 1;
        r11 = org.objectweb.asm.C19508r.m70434a(r1, r11);
        goto L_0x00a9;
    L_0x00a3:
        r11 = r3 + 1;
        r11 = org.objectweb.asm.C19508r.m70440b(r1, r11);
    L_0x00a9:
        r11 = r11 + r3;
        r11 = org.objectweb.asm.C19508r.m70435a(r7, r9, r3, r11);
        r12 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        if (r11 < r12) goto L_0x00b6;
    L_0x00b2:
        r12 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r11 <= r12) goto L_0x00cb;
    L_0x00b6:
        r11 = r5[r3];
        if (r11 != 0) goto L_0x00cb;
    L_0x00ba:
        r11 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        if (r10 == r11) goto L_0x00c6;
    L_0x00be:
        r11 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        if (r10 != r11) goto L_0x00c3;
    L_0x00c2:
        goto L_0x00c6;
    L_0x00c3:
        r16 = 5;
        goto L_0x00c8;
    L_0x00c6:
        r16 = 2;
    L_0x00c8:
        r5[r3] = r8;
        goto L_0x00cd;
    L_0x00cb:
        r16 = 0;
    L_0x00cd:
        r3 = r3 + 3;
        r10 = r16;
        goto L_0x00e2;
    L_0x00d2:
        r3 = r3 + 5;
        goto L_0x0036;
    L_0x00d6:
        r3 = r3 + 3;
        goto L_0x0036;
    L_0x00da:
        r3 = r3 + 2;
        goto L_0x0036;
    L_0x00de:
        r3 = r3 + 1;
        goto L_0x0036;
    L_0x00e2:
        if (r10 == 0) goto L_0x001c;
    L_0x00e4:
        r11 = r7.length;
        r11 = r11 + r8;
        r11 = new int[r11];
        r12 = r9.length;
        r12 = r12 + r8;
        r8 = new int[r12];
        r12 = r7.length;
        java.lang.System.arraycopy(r7, r2, r11, r2, r12);
        r12 = r9.length;
        java.lang.System.arraycopy(r9, r2, r8, r2, r12);
        r7 = r7.length;
        r11[r7] = r3;
        r7 = r9.length;
        r8[r7] = r10;
        if (r10 <= 0) goto L_0x0101;
    L_0x00fc:
        r9 = r8;
        r7 = r11;
        r4 = 3;
        goto L_0x001c;
    L_0x0101:
        r9 = r8;
        r7 = r11;
        goto L_0x001c;
    L_0x0105:
        if (r4 >= r6) goto L_0x0109;
    L_0x0107:
        r4 = r4 + -1;
    L_0x0109:
        r3 = r4;
        if (r3 != 0) goto L_0x0339;
    L_0x010c:
        r3 = new org.objectweb.asm.d;
        r4 = r0.f61009v;
        r4 = r4.f60313b;
        r3.<init>(r4);
        r4 = 0;
    L_0x0116:
        r10 = r0.f61009v;
        r10 = r10.f60313b;
        if (r4 >= r10) goto L_0x0269;
    L_0x011c:
        r10 = r1[r4];
        r10 = r10 & 255;
        r17 = org.objectweb.asm.C19506g.f60913c;
        r17 = r17[r10];
        switch(r17) {
            case 0: goto L_0x025e;
            case 1: goto L_0x0256;
            case 2: goto L_0x024e;
            case 3: goto L_0x0256;
            case 4: goto L_0x025e;
            case 5: goto L_0x024e;
            case 6: goto L_0x024e;
            case 7: goto L_0x0247;
            case 8: goto L_0x0247;
            case 9: goto L_0x01f1;
            case 10: goto L_0x01db;
            case 11: goto L_0x0256;
            case 12: goto L_0x024e;
            case 13: goto L_0x024e;
            case 14: goto L_0x018d;
            case 15: goto L_0x0146;
            case 16: goto L_0x0127;
            case 17: goto L_0x012f;
            default: goto L_0x0127;
        };
    L_0x0127:
        r6 = 5;
        r3.m69357a(r1, r4, r15);
        r4 = r4 + 4;
        goto L_0x0264;
    L_0x012f:
        r10 = r4 + 1;
        r10 = r1[r10];
        r10 = r10 & 255;
        if (r10 != r12) goto L_0x013f;
    L_0x0137:
        r10 = 6;
        r3.m69357a(r1, r4, r10);
        r4 = r4 + 6;
        goto L_0x01ee;
    L_0x013f:
        r3.m69357a(r1, r4, r15);
        r4 = r4 + 4;
        goto L_0x01ee;
    L_0x0146:
        r10 = r4 + 4;
        r17 = r4 & 3;
        r10 = r10 - r17;
        r12 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r3.m69352a(r12);
        r12 = 0;
        r6 = r3.f60313b;
        r6 = r6 % r15;
        r6 = 4 - r6;
        r6 = r6 % r15;
        r3.m69357a(r12, r2, r6);
        r6 = org.objectweb.asm.C19508r.m70442c(r1, r10);
        r6 = r6 + r4;
        r10 = r10 + r15;
        r6 = org.objectweb.asm.C19508r.m70435a(r7, r9, r4, r6);
        r3.m69360c(r6);
        r6 = org.objectweb.asm.C19508r.m70442c(r1, r10);
        r10 = r10 + r15;
        r3.m69360c(r6);
    L_0x0170:
        if (r6 <= 0) goto L_0x018b;
    L_0x0172:
        r12 = org.objectweb.asm.C19508r.m70442c(r1, r10);
        r3.m69360c(r12);
        r10 = r10 + 4;
        r12 = org.objectweb.asm.C19508r.m70442c(r1, r10);
        r12 = r12 + r4;
        r10 = r10 + r15;
        r12 = org.objectweb.asm.C19508r.m70435a(r7, r9, r4, r12);
        r3.m69360c(r12);
        r6 = r6 + -1;
        goto L_0x0170;
    L_0x018b:
        r4 = r10;
        goto L_0x01ee;
    L_0x018d:
        r6 = r4 + 4;
        r10 = r4 & 3;
        r6 = r6 - r10;
        r10 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r3.m69352a(r10);
        r10 = 0;
        r12 = r3.f60313b;
        r12 = r12 % r15;
        r12 = 4 - r12;
        r12 = r12 % r15;
        r3.m69357a(r10, r2, r12);
        r10 = org.objectweb.asm.C19508r.m70442c(r1, r6);
        r10 = r10 + r4;
        r6 = r6 + r15;
        r10 = org.objectweb.asm.C19508r.m70435a(r7, r9, r4, r10);
        r3.m69360c(r10);
        r10 = org.objectweb.asm.C19508r.m70442c(r1, r6);
        r6 = r6 + r15;
        r3.m69360c(r10);
        r12 = org.objectweb.asm.C19508r.m70442c(r1, r6);
        r12 = r12 - r10;
        r12 = r12 + r8;
        r6 = r6 + r15;
        r10 = r6 + -4;
        r10 = org.objectweb.asm.C19508r.m70442c(r1, r10);
        r3.m69360c(r10);
    L_0x01c6:
        if (r12 <= 0) goto L_0x01d9;
    L_0x01c8:
        r10 = org.objectweb.asm.C19508r.m70442c(r1, r6);
        r10 = r10 + r4;
        r6 = r6 + 4;
        r10 = org.objectweb.asm.C19508r.m70435a(r7, r9, r4, r10);
        r3.m69360c(r10);
        r12 = r12 + -1;
        goto L_0x01c6;
    L_0x01d9:
        r4 = r6;
        goto L_0x01ee;
    L_0x01db:
        r6 = r4 + 1;
        r6 = org.objectweb.asm.C19508r.m70442c(r1, r6);
        r6 = r6 + r4;
        r6 = org.objectweb.asm.C19508r.m70435a(r7, r9, r4, r6);
        r3.m69352a(r10);
        r3.m69360c(r6);
        r4 = r4 + 5;
    L_0x01ee:
        r6 = 5;
        goto L_0x0264;
    L_0x01f1:
        if (r10 <= r13) goto L_0x0201;
    L_0x01f3:
        if (r10 >= r11) goto L_0x01f8;
    L_0x01f5:
        r10 = r10 + -49;
        goto L_0x01fa;
    L_0x01f8:
        r10 = r10 + -20;
    L_0x01fa:
        r6 = r4 + 1;
        r6 = org.objectweb.asm.C19508r.m70434a(r1, r6);
        goto L_0x0207;
    L_0x0201:
        r6 = r4 + 1;
        r6 = org.objectweb.asm.C19508r.m70440b(r1, r6);
    L_0x0207:
        r6 = r6 + r4;
        r6 = org.objectweb.asm.C19508r.m70435a(r7, r9, r4, r6);
        r12 = r5[r4];
        if (r12 == 0) goto L_0x023e;
    L_0x0210:
        r12 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        if (r10 != r12) goto L_0x021a;
    L_0x0214:
        r10 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r3.m69352a(r10);
        goto L_0x023a;
    L_0x021a:
        r12 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        if (r10 != r12) goto L_0x0222;
    L_0x021e:
        r3.m69352a(r13);
        goto L_0x023a;
    L_0x0222:
        r12 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        if (r10 > r12) goto L_0x022b;
    L_0x0226:
        r10 = r10 + 1;
        r10 = r10 ^ r8;
        r10 = r10 - r8;
        goto L_0x022d;
    L_0x022b:
        r10 = r10 ^ 1;
    L_0x022d:
        r3.m69352a(r10);
        r3.m69358b(r14);
        r10 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r3.m69352a(r10);
        r6 = r6 + -3;
    L_0x023a:
        r3.m69360c(r6);
        goto L_0x0244;
    L_0x023e:
        r3.m69352a(r10);
        r3.m69358b(r6);
    L_0x0244:
        r4 = r4 + 3;
        goto L_0x01ee;
    L_0x0247:
        r6 = 5;
        r3.m69357a(r1, r4, r6);
        r4 = r4 + 5;
        goto L_0x0264;
    L_0x024e:
        r6 = 5;
        r10 = 3;
        r3.m69357a(r1, r4, r10);
        r4 = r4 + 3;
        goto L_0x0264;
    L_0x0256:
        r6 = 5;
        r10 = 2;
        r3.m69357a(r1, r4, r10);
        r4 = r4 + 2;
        goto L_0x0264;
    L_0x025e:
        r6 = 5;
        r3.m69352a(r10);
        r4 = r4 + 1;
    L_0x0264:
        r6 = 3;
        r12 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        goto L_0x0116;
    L_0x0269:
        r1 = r0.f60985V;
        if (r1 != 0) goto L_0x02ae;
    L_0x026d:
        r1 = r0.f60986W;
    L_0x026f:
        if (r1 == 0) goto L_0x0287;
    L_0x0271:
        r4 = r1.f60376c;
        r6 = 3;
        r4 = r4 - r6;
        if (r4 < 0) goto L_0x0281;
    L_0x0277:
        r4 = r5[r4];
        if (r4 == 0) goto L_0x0281;
    L_0x027b:
        r4 = r1.f60374a;
        r4 = r4 | 16;
        r1.f60374a = r4;
    L_0x0281:
        org.objectweb.asm.C19508r.m70439a(r7, r9, r1);
        r1 = r1.f60380g;
        goto L_0x026f;
    L_0x0287:
        r1 = r0.f60990c;
        r1 = r1.f60940n;
        if (r1 == 0) goto L_0x02b6;
    L_0x028d:
        r1 = 0;
    L_0x028e:
        r4 = r0.f60990c;
        r4 = r4.f60940n;
        r4 = r4.length;
        if (r1 >= r4) goto L_0x02b6;
    L_0x0295:
        r4 = r0.f60990c;
        r4 = r4.f60940n;
        r4 = r4[r1];
        if (r4 == 0) goto L_0x02ab;
    L_0x029d:
        r5 = r4.f60366b;
        r6 = 31;
        if (r5 != r6) goto L_0x02ab;
    L_0x02a3:
        r5 = r4.f60367c;
        r5 = org.objectweb.asm.C19508r.m70435a(r7, r9, r2, r5);
        r4.f60367c = r5;
    L_0x02ab:
        r1 = r1 + 1;
        goto L_0x028e;
    L_0x02ae:
        r1 = r0.f61013z;
        if (r1 <= 0) goto L_0x02b6;
    L_0x02b2:
        r1 = r0.f60990c;
        r1.f60948v = r8;
    L_0x02b6:
        r1 = r0.f60969F;
    L_0x02b8:
        if (r1 == 0) goto L_0x02cc;
    L_0x02ba:
        r4 = r1.f60359a;
        org.objectweb.asm.C19508r.m70439a(r7, r9, r4);
        r4 = r1.f60360b;
        org.objectweb.asm.C19508r.m70439a(r7, r9, r4);
        r4 = r1.f60361c;
        org.objectweb.asm.C19508r.m70439a(r7, r9, r4);
        r1 = r1.f60364f;
        goto L_0x02b8;
    L_0x02cc:
        r1 = 0;
        r4 = 2;
    L_0x02ce:
        if (r1 >= r4) goto L_0x0300;
    L_0x02d0:
        if (r1 != 0) goto L_0x02d5;
    L_0x02d2:
        r5 = r0.f60974K;
        goto L_0x02d7;
    L_0x02d5:
        r5 = r0.f60976M;
    L_0x02d7:
        if (r5 == 0) goto L_0x02fd;
    L_0x02d9:
        r6 = r5.f60312a;
        r10 = 0;
    L_0x02dc:
        r11 = r5.f60313b;
        if (r10 >= r11) goto L_0x02fd;
    L_0x02e0:
        r11 = org.objectweb.asm.C19508r.m70434a(r6, r10);
        r12 = org.objectweb.asm.C19508r.m70435a(r7, r9, r2, r11);
        org.objectweb.asm.C19508r.m70438a(r6, r10, r12);
        r13 = r10 + 2;
        r14 = org.objectweb.asm.C19508r.m70434a(r6, r13);
        r11 = r11 + r14;
        r11 = org.objectweb.asm.C19508r.m70435a(r7, r9, r2, r11);
        r11 = r11 - r12;
        org.objectweb.asm.C19508r.m70438a(r6, r13, r11);
        r10 = r10 + 10;
        goto L_0x02dc;
    L_0x02fd:
        r1 = r1 + 1;
        goto L_0x02ce;
    L_0x0300:
        r1 = r0.f60978O;
        if (r1 == 0) goto L_0x031d;
    L_0x0304:
        r1 = r0.f60978O;
        r1 = r1.f60312a;
        r4 = 0;
    L_0x0309:
        r5 = r0.f60978O;
        r5 = r5.f60313b;
        if (r4 >= r5) goto L_0x031d;
    L_0x030f:
        r5 = org.objectweb.asm.C19508r.m70434a(r1, r4);
        r5 = org.objectweb.asm.C19508r.m70435a(r7, r9, r2, r5);
        org.objectweb.asm.C19508r.m70438a(r1, r4, r5);
        r4 = r4 + 4;
        goto L_0x0309;
    L_0x031d:
        r1 = r0.f60982S;
    L_0x031f:
        if (r1 == 0) goto L_0x0336;
    L_0x0321:
        r2 = r1.m69349b();
        if (r2 == 0) goto L_0x0333;
    L_0x0327:
        r4 = r2.length;
        r4 = r4 - r8;
    L_0x0329:
        if (r4 < 0) goto L_0x0333;
    L_0x032b:
        r5 = r2[r4];
        org.objectweb.asm.C19508r.m70439a(r7, r9, r5);
        r4 = r4 + -1;
        goto L_0x0329;
    L_0x0333:
        r1 = r1.f60311c;
        goto L_0x031f;
    L_0x0336:
        r0.f61009v = r3;
        return;
    L_0x0339:
        r4 = r7;
        r7 = r9;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.r.i():void");
    }

    /* renamed from: a */
    public C19334a mo14602a() {
        this.f61000m = new C19336d();
        return new C19505b(this.f60990c, false, this.f61000m, null, 0);
    }

    /* renamed from: a */
    public C19334a mo14603a(int i, String str, boolean z) {
        C19336d c19336d = new C19336d();
        if ("Ljava/lang/Synthetic;".equals(str)) {
            this.f61007t = Math.max(this.f61007t, i + 1);
            return new C19505b(this.f60990c, false, c19336d, null, 0);
        }
        c19336d.m69358b(this.f60990c.m70394a(str)).m69358b(0);
        C19334a c19505b = new C19505b(this.f60990c, true, c19336d, c19336d, 2);
        if (z) {
            if (this.f61005r == null) {
                this.f61005r = new C19505b[C19348s.m69471d(this.f60999l).length];
            }
            c19505b.f60905c = this.f61005r[i];
            this.f61005r[i] = c19505b;
            return c19505b;
        }
        if (this.f61006s == null) {
            this.f61006s = new C19505b[C19348s.m69471d(this.f60999l).length];
        }
        c19505b.f60905c = this.f61006s[i];
        this.f61006s[i] = c19505b;
        return c19505b;
    }

    /* renamed from: a */
    public C19334a mo14604a(int i, C19349t c19349t, String str, boolean z) {
        C19336d c19336d = new C19336d();
        C19505b.m70377a(i, c19349t, c19336d);
        c19336d.m69358b(this.f60990c.m70394a(str)).m69358b(0);
        C19334a c19505b = new C19505b(this.f60990c, true, c19336d, c19336d, c19336d.f60313b - 2);
        if (z) {
            c19505b.f60905c = this.f61003p;
            this.f61003p = c19505b;
            return c19505b;
        }
        c19505b.f60905c = this.f61004q;
        this.f61004q = c19505b;
        return c19505b;
    }

    /* renamed from: a */
    public C19334a mo14605a(int i, C19349t c19349t, C19346p[] c19346pArr, C19346p[] c19346pArr2, int[] iArr, String str, boolean z) {
        C19336d c19336d = new C19336d();
        c19336d.m69352a(i >>> 24).m69358b(c19346pArr.length);
        for (int i2 = 0; i2 < c19346pArr.length; i2++) {
            c19336d.m69358b(c19346pArr[i2].f60376c).m69358b(c19346pArr2[i2].f60376c - c19346pArr[i2].f60376c).m69358b(iArr[i2]);
        }
        if (c19349t == null) {
            c19336d.m69352a(0);
        } else {
            c19336d.m69357a(c19349t.f60400a, c19349t.f60401b, (c19349t.f60400a[c19349t.f60401b] * 2) + 1);
        }
        c19336d.m69358b(this.f60990c.m70394a(str)).m69358b(0);
        C19334a c19505b = new C19505b(this.f60990c, true, c19336d, c19336d, c19336d.f60313b - 2);
        if (z) {
            c19505b.f60905c = this.f60980Q;
            this.f60980Q = c19505b;
            return c19505b;
        }
        c19505b.f60905c = this.f60981R;
        this.f60981R = c19505b;
        return c19505b;
    }

    /* renamed from: a */
    public C19334a mo14606a(String str, boolean z) {
        C19336d c19336d = new C19336d();
        c19336d.m69358b(this.f60990c.m70394a(str)).m69358b(0);
        C19334a c19505b = new C19505b(this.f60990c, true, c19336d, c19336d, 2);
        if (z) {
            c19505b.f60905c = this.f61001n;
            this.f61001n = c19505b;
            return c19505b;
        }
        c19505b.f60905c = this.f61002o;
        this.f61002o = c19505b;
        return c19505b;
    }

    /* renamed from: a */
    public void mo14607a(int i) {
        this.f60979P = this.f61009v.f60313b;
        this.f61009v.m69352a(i);
        if (this.f60988Y != null) {
            if (this.f60985V == 0) {
                this.f60988Y.f60379f.m69412a(i, 0, null, null);
            } else {
                int i2 = this.f60989Z + C19342l.f60346a[i];
                if (i2 > this.aa) {
                    this.aa = i2;
                }
                this.f60989Z = i2;
            }
            if ((i >= 172 && i <= 177) || i == 191) {
                m70444e();
            }
        }
    }

    /* renamed from: a */
    public void mo14608a(int i, int i2) {
        this.f60979P = this.f61009v.f60313b;
        if (this.f60988Y != null) {
            if (this.f60985V == 0) {
                this.f60988Y.f60379f.m69412a(i, i2, null, null);
            } else if (i != 188) {
                int i3 = this.f60989Z + 1;
                if (i3 > this.aa) {
                    this.aa = i3;
                }
                this.f60989Z = i3;
            }
        }
        if (i == 17) {
            this.f61009v.m69359b(i, i2);
        } else {
            this.f61009v.m69353a(i, i2);
        }
    }

    /* renamed from: a */
    public void mo14609a(int i, int i2, C19346p c19346p, C19346p... c19346pArr) {
        this.f60979P = this.f61009v.f60313b;
        int i3 = this.f61009v.f60313b;
        this.f61009v.m69352a(170);
        int i4 = 0;
        this.f61009v.m69357a(null, 0, (4 - (this.f61009v.f60313b % 4)) % 4);
        c19346p.m69428a(this, this.f61009v, i3, true);
        this.f61009v.m69360c(i).m69360c(i2);
        while (i4 < c19346pArr.length) {
            c19346pArr[i4].m69428a(this, this.f61009v, i3, true);
            i4++;
        }
        m70437a(c19346p, c19346pArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo14610a(int r9, int r10, java.lang.Object[] r11, int r12, java.lang.Object[] r13) {
        /*
        r8 = this;
        r0 = r8.f60985V;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = -1;
        r1 = 0;
        if (r9 != r0) goto L_0x00b8;
    L_0x0009:
        r9 = r8.f60966C;
        if (r9 != 0) goto L_0x0010;
    L_0x000d:
        r8.m70446f();
    L_0x0010:
        r8.f61012y = r10;
        r9 = r8.f61009v;
        r9 = r9.f60313b;
        r9 = r8.m70433a(r9, r10, r12);
        r0 = r9;
        r9 = 0;
    L_0x001c:
        r2 = 25165824; // 0x1800000 float:4.7019774E-38 double:1.2433569E-316;
        r3 = 24117248; // 0x1700000 float:4.4081038E-38 double:1.19155037E-316;
        if (r9 >= r10) goto L_0x006a;
    L_0x0022:
        r4 = r11[r9];
        r4 = r4 instanceof java.lang.String;
        if (r4 == 0) goto L_0x003b;
    L_0x0028:
        r2 = r8.f60967D;
        r4 = r0 + 1;
        r5 = r8.f60990c;
        r6 = r11[r9];
        r6 = (java.lang.String) r6;
        r5 = r5.m70426e(r6);
        r3 = r3 | r5;
        r2[r0] = r3;
    L_0x0039:
        r0 = r4;
        goto L_0x0067;
    L_0x003b:
        r3 = r11[r9];
        r3 = r3 instanceof java.lang.Integer;
        if (r3 == 0) goto L_0x0051;
    L_0x0041:
        r2 = r8.f60967D;
        r3 = r0 + 1;
        r4 = r11[r9];
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r2[r0] = r4;
        r0 = r3;
        goto L_0x0067;
    L_0x0051:
        r3 = r8.f60967D;
        r4 = r0 + 1;
        r5 = r8.f60990c;
        r6 = "";
        r7 = r11[r9];
        r7 = (org.objectweb.asm.C19346p) r7;
        r7 = r7.f60376c;
        r5 = r5.m70395a(r6, r7);
        r2 = r2 | r5;
        r3[r0] = r2;
        goto L_0x0039;
    L_0x0067:
        r9 = r9 + 1;
        goto L_0x001c;
    L_0x006a:
        if (r1 >= r12) goto L_0x00b3;
    L_0x006c:
        r9 = r13[r1];
        r9 = r9 instanceof java.lang.String;
        if (r9 == 0) goto L_0x0085;
    L_0x0072:
        r9 = r8.f60967D;
        r10 = r0 + 1;
        r11 = r8.f60990c;
        r4 = r13[r1];
        r4 = (java.lang.String) r4;
        r11 = r11.m70426e(r4);
        r11 = r11 | r3;
        r9[r0] = r11;
    L_0x0083:
        r0 = r10;
        goto L_0x00b0;
    L_0x0085:
        r9 = r13[r1];
        r9 = r9 instanceof java.lang.Integer;
        if (r9 == 0) goto L_0x009a;
    L_0x008b:
        r9 = r8.f60967D;
        r10 = r0 + 1;
        r11 = r13[r1];
        r11 = (java.lang.Integer) r11;
        r11 = r11.intValue();
        r9[r0] = r11;
        goto L_0x0083;
    L_0x009a:
        r9 = r8.f60967D;
        r10 = r0 + 1;
        r11 = r8.f60990c;
        r4 = "";
        r5 = r13[r1];
        r5 = (org.objectweb.asm.C19346p) r5;
        r5 = r5.f60376c;
        r11 = r11.m70395a(r4, r5);
        r11 = r11 | r2;
        r9[r0] = r11;
        goto L_0x0083;
    L_0x00b0:
        r1 = r1 + 1;
        goto L_0x006a;
    L_0x00b3:
        r8.m70447g();
        goto L_0x016c;
    L_0x00b8:
        r0 = r8.f60964A;
        if (r0 != 0) goto L_0x00c8;
    L_0x00bc:
        r0 = new org.objectweb.asm.d;
        r0.<init>();
        r8.f60964A = r0;
        r0 = r8.f61009v;
        r0 = r0.f60313b;
        goto L_0x00dd;
    L_0x00c8:
        r0 = r8.f61009v;
        r0 = r0.f60313b;
        r2 = r8.f60965B;
        r0 = r0 - r2;
        r0 = r0 + -1;
        if (r0 >= 0) goto L_0x00dd;
    L_0x00d3:
        r10 = 3;
        if (r9 != r10) goto L_0x00d7;
    L_0x00d6:
        return;
    L_0x00d7:
        r9 = new java.lang.IllegalStateException;
        r9.<init>();
        throw r9;
    L_0x00dd:
        r2 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        r3 = 64;
        switch(r9) {
            case 0: goto L_0x0135;
            case 1: goto L_0x011b;
            case 2: goto L_0x010b;
            case 3: goto L_0x0100;
            case 4: goto L_0x00e6;
            default: goto L_0x00e4;
        };
    L_0x00e4:
        goto L_0x0160;
    L_0x00e6:
        if (r0 >= r3) goto L_0x00ef;
    L_0x00e8:
        r9 = r8.f60964A;
        r0 = r0 + r3;
        r9.m69352a(r0);
        goto L_0x00fa;
    L_0x00ef:
        r9 = r8.f60964A;
        r10 = 247; // 0xf7 float:3.46E-43 double:1.22E-321;
        r9 = r9.m69352a(r10);
        r9.m69358b(r0);
    L_0x00fa:
        r9 = r13[r1];
        r8.m70441b(r9);
        goto L_0x0160;
    L_0x0100:
        if (r0 >= r3) goto L_0x0108;
    L_0x0102:
        r9 = r8.f60964A;
        r9.m69352a(r0);
        goto L_0x0160;
    L_0x0108:
        r9 = r8.f60964A;
        goto L_0x0113;
    L_0x010b:
        r9 = r8.f61012y;
        r9 = r9 - r10;
        r8.f61012y = r9;
        r9 = r8.f60964A;
        r2 = r2 - r10;
    L_0x0113:
        r9 = r9.m69352a(r2);
        r9.m69358b(r0);
        goto L_0x0160;
    L_0x011b:
        r9 = r8.f61012y;
        r9 = r9 + r10;
        r8.f61012y = r9;
        r9 = r8.f60964A;
        r13 = r10 + 251;
        r9 = r9.m69352a(r13);
        r9.m69358b(r0);
    L_0x012b:
        if (r1 >= r10) goto L_0x0160;
    L_0x012d:
        r9 = r11[r1];
        r8.m70441b(r9);
        r1 = r1 + 1;
        goto L_0x012b;
    L_0x0135:
        r8.f61012y = r10;
        r9 = r8.f60964A;
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r9 = r9.m69352a(r2);
        r9 = r9.m69358b(r0);
        r9.m69358b(r10);
        r9 = 0;
    L_0x0147:
        if (r9 >= r10) goto L_0x0151;
    L_0x0149:
        r0 = r11[r9];
        r8.m70441b(r0);
        r9 = r9 + 1;
        goto L_0x0147;
    L_0x0151:
        r9 = r8.f60964A;
        r9.m69358b(r12);
    L_0x0156:
        if (r1 >= r12) goto L_0x0160;
    L_0x0158:
        r9 = r13[r1];
        r8.m70441b(r9);
        r1 = r1 + 1;
        goto L_0x0156;
    L_0x0160:
        r9 = r8.f61009v;
        r9 = r9.f60313b;
        r8.f60965B = r9;
        r9 = r8.f61013z;
        r9 = r9 + 1;
        r8.f61013z = r9;
    L_0x016c:
        r9 = r8.f61010w;
        r9 = java.lang.Math.max(r9, r12);
        r8.f61010w = r9;
        r9 = r8.f61011x;
        r10 = r8.f61012y;
        r9 = java.lang.Math.max(r9, r10);
        r8.f61011x = r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.r.a(int, int, java.lang.Object[], int, java.lang.Object[]):void");
    }

    /* renamed from: a */
    public void mo14611a(int i, String str) {
        this.f60979P = this.f61009v.f60313b;
        C19345o b = this.f60990c.m70418b(str);
        if (this.f60988Y != null) {
            if (this.f60985V == 0) {
                this.f60988Y.f60379f.m69412a(i, this.f61009v.f60313b, this.f60990c, b);
            } else if (i == 187) {
                int i2 = this.f60989Z + 1;
                if (i2 > this.aa) {
                    this.aa = i2;
                }
                this.f60989Z = i2;
            }
        }
        this.f61009v.m69359b(i, b.f60365a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo14612a(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
        r4 = this;
        r0 = r4.f61009v;
        r0 = r0.f60313b;
        r4.f60979P = r0;
        r0 = r4.f60990c;
        r6 = r0.m70419b(r6, r7, r8);
        r7 = r4.f60988Y;
        if (r7 == 0) goto L_0x0058;
    L_0x0010:
        r7 = r4.f60985V;
        r0 = 0;
        if (r7 != 0) goto L_0x001f;
    L_0x0015:
        r7 = r4.f60988Y;
        r7 = r7.f60379f;
        r8 = r4.f60990c;
        r7.m69412a(r5, r0, r8, r6);
        goto L_0x0058;
    L_0x001f:
        r7 = r8.charAt(r0);
        r8 = -2;
        r1 = 1;
        r2 = 74;
        r3 = 68;
        switch(r5) {
            case 178: goto L_0x0045;
            case 179: goto L_0x003c;
            case 180: goto L_0x0033;
            default: goto L_0x002c;
        };
    L_0x002c:
        r0 = r4.f60989Z;
        if (r7 == r3) goto L_0x004e;
    L_0x0030:
        if (r7 != r2) goto L_0x004f;
    L_0x0032:
        goto L_0x004e;
    L_0x0033:
        r8 = r4.f60989Z;
        if (r7 == r3) goto L_0x0039;
    L_0x0037:
        if (r7 != r2) goto L_0x003a;
    L_0x0039:
        r0 = 1;
    L_0x003a:
        r8 = r8 + r0;
        goto L_0x0050;
    L_0x003c:
        r0 = r4.f60989Z;
        if (r7 == r3) goto L_0x004f;
    L_0x0040:
        if (r7 != r2) goto L_0x0043;
    L_0x0042:
        goto L_0x004f;
    L_0x0043:
        r8 = -1;
        goto L_0x004f;
    L_0x0045:
        r8 = r4.f60989Z;
        if (r7 == r3) goto L_0x004b;
    L_0x0049:
        if (r7 != r2) goto L_0x004c;
    L_0x004b:
        r1 = 2;
    L_0x004c:
        r8 = r8 + r1;
        goto L_0x0050;
    L_0x004e:
        r8 = -3;
    L_0x004f:
        r8 = r8 + r0;
    L_0x0050:
        r7 = r4.aa;
        if (r8 <= r7) goto L_0x0056;
    L_0x0054:
        r4.aa = r8;
    L_0x0056:
        r4.f60989Z = r8;
    L_0x0058:
        r7 = r4.f61009v;
        r6 = r6.f60365a;
        r7.m69359b(r5, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.r.a(int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo14613a(int i, String str, String str2, String str3, boolean z) {
        this.f60979P = this.f61009v.f60313b;
        C19345o a = this.f60990c.m70405a(str, str2, str3, z);
        int i2 = a.f60367c;
        if (this.f60988Y != null) {
            if (this.f60985V == 0) {
                this.f60988Y.f60379f.m69412a(i, 0, this.f60990c, a);
            } else {
                if (i2 == 0) {
                    i2 = C19348s.m69472e(str3);
                    a.f60367c = i2;
                }
                int i3 = i == 184 ? ((this.f60989Z - (i2 >> 2)) + (i2 & 3)) + 1 : (this.f60989Z - (i2 >> 2)) + (i2 & 3);
                if (i3 > this.aa) {
                    this.aa = i3;
                }
                this.f60989Z = i3;
            }
        }
        if (i == 185) {
            if (i2 == 0) {
                i2 = C19348s.m69472e(str3);
                a.f60367c = i2;
            }
            this.f61009v.m69359b(185, a.f60365a).m69353a(i2 >> 2, 0);
            return;
        }
        this.f61009v.m69359b(i, a.f60365a);
    }

    /* renamed from: a */
    public void mo14614a(int i, C19346p c19346p) {
        this.f60979P = this.f61009v.f60313b;
        C19346p c19346p2 = null;
        if (this.f60988Y != null) {
            C19346p a;
            if (this.f60985V == 0) {
                this.f60988Y.f60379f.m69412a(i, 0, null, null);
                a = c19346p.m69425a();
                a.f60374a |= 16;
                m70443c(0, c19346p);
                if (i != 167) {
                    c19346p2 = new C19346p();
                }
            } else if (i == 168) {
                if ((c19346p.f60374a & 512) == 0) {
                    c19346p.f60374a |= 512;
                    this.f60984U++;
                }
                a = this.f60988Y;
                a.f60374a |= ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                m70443c(this.f60989Z + 1, c19346p);
                c19346p2 = new C19346p();
            } else {
                this.f60989Z += C19342l.f60346a[i];
                m70443c(this.f60989Z, c19346p);
            }
        }
        if ((c19346p.f60374a & 2) == 0 || c19346p.f60376c - this.f61009v.f60313b >= -32768) {
            this.f61009v.m69352a(i);
            c19346p.m69428a(this, this.f61009v, this.f61009v.f60313b - 1, false);
        } else {
            if (i != 167) {
                if (i == 168) {
                    this.f61009v.m69352a(201);
                    c19346p.m69428a(this, this.f61009v, this.f61009v.f60313b - 1, true);
                } else {
                    if (c19346p2 != null) {
                        c19346p2.f60374a |= 16;
                    }
                    this.f61009v.m69352a(i <= 166 ? ((i + 1) ^ 1) - 1 : i ^ 1);
                    this.f61009v.m69358b(8);
                }
            }
            this.f61009v.m69352a((int) Callback.DEFAULT_DRAG_ANIMATION_DURATION);
            c19346p.m69428a(this, this.f61009v, this.f61009v.f60313b - 1, true);
        }
        if (this.f60988Y != null) {
            if (c19346p2 != null) {
                mo14620a(c19346p2);
            }
            if (i == 167) {
                m70444e();
            }
        }
    }

    /* renamed from: a */
    public void mo14615a(Object obj) {
        int i;
        C19336d c19336d;
        int i2;
        this.f60979P = this.f61009v.f60313b;
        C19345o a = this.f60990c.m70404a(obj);
        if (this.f60988Y != null) {
            if (this.f60985V == 0) {
                this.f60988Y.f60379f.m69412a(18, 0, this.f60990c, a);
            } else {
                if (a.f60366b != 5) {
                    if (a.f60366b != 6) {
                        i = this.f60989Z + 1;
                        if (i > this.aa) {
                            this.aa = i;
                        }
                        this.f60989Z = i;
                    }
                }
                i = this.f60989Z + 2;
                if (i > this.aa) {
                    this.aa = i;
                }
                this.f60989Z = i;
            }
        }
        i = a.f60365a;
        if (a.f60366b != 5) {
            if (a.f60366b != 6) {
                if (i >= 256) {
                    c19336d = this.f61009v;
                    i2 = 19;
                    c19336d.m69359b(i2, i);
                }
                this.f61009v.m69353a(18, i);
                return;
            }
        }
        c19336d = this.f61009v;
        i2 = 20;
        c19336d.m69359b(i2, i);
    }

    /* renamed from: a */
    public void mo14616a(String str, int i) {
        if (this.f60972I == null) {
            this.f60972I = new C19336d();
        }
        this.f60971H++;
        this.f60972I.m69358b(str == null ? 0 : this.f60990c.m70394a(str)).m69358b(i);
    }

    /* renamed from: a */
    public void mo14617a(String str, String str2, String str3, C19346p c19346p, C19346p c19346p2, int i) {
        if (str3 != null) {
            if (this.f60976M == null) {
                this.f60976M = new C19336d();
            }
            this.f60975L++;
            this.f60976M.m69358b(c19346p.f60376c).m69358b(c19346p2.f60376c - c19346p.f60376c).m69358b(this.f60990c.m70394a(str)).m69358b(this.f60990c.m70394a(str3)).m69358b(i);
        }
        if (this.f60974K == null) {
            this.f60974K = new C19336d();
        }
        this.f60973J++;
        this.f60974K.m69358b(c19346p.f60376c).m69358b(c19346p2.f60376c - c19346p.f60376c).m69358b(this.f60990c.m70394a(str)).m69358b(this.f60990c.m70394a(str2)).m69358b(i);
        int i2 = 2;
        if (this.f60985V != 2) {
            char charAt = str2.charAt(0);
            if (charAt != 'J') {
                if (charAt != 'D') {
                    i2 = 1;
                }
            }
            i += i2;
            if (i > this.f61011x) {
                this.f61011x = i;
            }
        }
    }

    /* renamed from: a */
    public void mo14618a(String str, String str2, C19343m c19343m, Object... objArr) {
        this.f60979P = this.f61009v.f60313b;
        C19345o a = this.f60990c.m70406a(str, str2, c19343m, objArr);
        int i = a.f60367c;
        if (this.f60988Y != null) {
            if (this.f60985V == 0) {
                this.f60988Y.f60379f.m69412a(186, 0, this.f60990c, a);
            } else {
                if (i == 0) {
                    i = C19348s.m69472e(str2);
                    a.f60367c = i;
                }
                int i2 = ((this.f60989Z - (i >> 2)) + (i & 3)) + 1;
                if (i2 > this.aa) {
                    this.aa = i2;
                }
                this.f60989Z = i2;
            }
        }
        this.f61009v.m69359b(186, a.f60365a);
        this.f61009v.m69358b(0);
    }

    /* renamed from: a */
    public void mo14619a(C19335c c19335c) {
        if (c19335c.m69347a()) {
            c19335c.f60311c = this.f60982S;
            this.f60982S = c19335c;
            return;
        }
        c19335c.f60311c = this.f61008u;
        this.f61008u = c19335c;
    }

    /* renamed from: a */
    final void m70468a(C19336d c19336d) {
        C19336d c19336d2 = c19336d;
        c19336d2.m69358b(((((this.f60996i & 262144) / 64) | 917504) ^ -1) & this.f60996i).m69358b(this.f60997j).m69358b(this.f60998k);
        if (this.f60992e != 0) {
            c19336d2.m69357a(r0.f60990c.f60930d.f60314a, r0.f60992e, r0.f60993f);
            return;
        }
        int i = r0.f61009v.f60313b > 0 ? 1 : 0;
        if (r0.f60994g > 0) {
            i++;
        }
        if ((r0.f60996i & 4096) != 0 && ((r0.f60990c.f60931e & 65535) < 49 || (r0.f60996i & 262144) != 0)) {
            i++;
        }
        if ((r0.f60996i & 131072) != 0) {
            i++;
        }
        if (r0.f60991d != null) {
            i++;
        }
        if (r0.f60972I != null) {
            i++;
        }
        if (r0.f61000m != null) {
            i++;
        }
        if (r0.f61001n != null) {
            i++;
        }
        if (r0.f61002o != null) {
            i++;
        }
        if (r0.f61003p != null) {
            i++;
        }
        if (r0.f61004q != null) {
            i++;
        }
        if (r0.f61005r != null) {
            i++;
        }
        if (r0.f61006s != null) {
            i++;
        }
        if (r0.f61008u != null) {
            i += r0.f61008u.m69350c();
        }
        c19336d2.m69358b(i);
        if (r0.f61009v.f60313b > 0) {
            i = (r0.f61009v.f60313b + 12) + (r0.f60968E * 8);
            if (r0.f60974K != null) {
                i += r0.f60974K.f60313b + 8;
            }
            if (r0.f60976M != null) {
                i += r0.f60976M.f60313b + 8;
            }
            if (r0.f60978O != null) {
                i += r0.f60978O.f60313b + 8;
            }
            if (r0.f60964A != null) {
                i += r0.f60964A.f60313b + 8;
            }
            if (r0.f60980Q != null) {
                i += r0.f60980Q.m70385b() + 8;
            }
            if (r0.f60981R != null) {
                i += r0.f60981R.m70385b() + 8;
            }
            if (r0.f60982S != null) {
                i += r0.f60982S.m69348b(r0.f60990c, r0.f61009v.f60312a, r0.f61009v.f60313b, r0.f61010w, r0.f61011x);
            }
            c19336d2.m69358b(r0.f60990c.m70394a("Code")).m69360c(i);
            c19336d2.m69358b(r0.f61010w).m69358b(r0.f61011x);
            c19336d2.m69360c(r0.f61009v.f60313b).m69357a(r0.f61009v.f60312a, 0, r0.f61009v.f60313b);
            c19336d2.m69358b(r0.f60968E);
            if (r0.f60968E > 0) {
                for (C19344n c19344n = r0.f60969F; c19344n != null; c19344n = c19344n.f60364f) {
                    c19336d2.m69358b(c19344n.f60359a.f60376c).m69358b(c19344n.f60360b.f60376c).m69358b(c19344n.f60361c.f60376c).m69358b(c19344n.f60363e);
                }
            }
            i = r0.f60974K != null ? 1 : 0;
            if (r0.f60976M != null) {
                i++;
            }
            if (r0.f60978O != null) {
                i++;
            }
            if (r0.f60964A != null) {
                i++;
            }
            if (r0.f60980Q != null) {
                i++;
            }
            if (r0.f60981R != null) {
                i++;
            }
            if (r0.f60982S != null) {
                i += r0.f60982S.m69350c();
            }
            c19336d2.m69358b(i);
            if (r0.f60974K != null) {
                c19336d2.m69358b(r0.f60990c.m70394a("LocalVariableTable"));
                c19336d2.m69360c(r0.f60974K.f60313b + 2).m69358b(r0.f60973J);
                c19336d2.m69357a(r0.f60974K.f60312a, 0, r0.f60974K.f60313b);
            }
            if (r0.f60976M != null) {
                c19336d2.m69358b(r0.f60990c.m70394a("LocalVariableTypeTable"));
                c19336d2.m69360c(r0.f60976M.f60313b + 2).m69358b(r0.f60975L);
                c19336d2.m69357a(r0.f60976M.f60312a, 0, r0.f60976M.f60313b);
            }
            if (r0.f60978O != null) {
                c19336d2.m69358b(r0.f60990c.m70394a("LineNumberTable"));
                c19336d2.m69360c(r0.f60978O.f60313b + 2).m69358b(r0.f60977N);
                c19336d2.m69357a(r0.f60978O.f60312a, 0, r0.f60978O.f60313b);
            }
            if (r0.f60964A != null) {
                c19336d2.m69358b(r0.f60990c.m70394a(((r0.f60990c.f60931e & 65535) >= 50 ? 1 : null) != null ? "StackMapTable" : "StackMap"));
                c19336d2.m69360c(r0.f60964A.f60313b + 2).m69358b(r0.f61013z);
                c19336d2.m69357a(r0.f60964A.f60312a, 0, r0.f60964A.f60313b);
            }
            if (r0.f60980Q != null) {
                c19336d2.m69358b(r0.f60990c.m70394a("RuntimeVisibleTypeAnnotations"));
                r0.f60980Q.m70384a(c19336d2);
            }
            if (r0.f60981R != null) {
                c19336d2.m69358b(r0.f60990c.m70394a("RuntimeInvisibleTypeAnnotations"));
                r0.f60981R.m70384a(c19336d2);
            }
            if (r0.f60982S != null) {
                r0.f60982S.m69346a(r0.f60990c, r0.f61009v.f60312a, r0.f61009v.f60313b, r0.f61011x, r0.f61010w, c19336d2);
            }
        }
        if (r0.f60994g > 0) {
            c19336d2.m69358b(r0.f60990c.m70394a("Exceptions")).m69360c((r0.f60994g * 2) + 2);
            c19336d2.m69358b(r0.f60994g);
            for (i = 0; i < r0.f60994g; i++) {
                c19336d2.m69358b(r0.f60995h[i]);
            }
        }
        if ((r0.f60996i & 4096) != 0 && ((r0.f60990c.f60931e & 65535) < 49 || (r0.f60996i & 262144) != 0)) {
            c19336d2.m69358b(r0.f60990c.m70394a("Synthetic")).m69360c(0);
        }
        if ((r0.f60996i & 131072) != 0) {
            c19336d2.m69358b(r0.f60990c.m70394a("Deprecated")).m69360c(0);
        }
        if (r0.f60991d != null) {
            c19336d2.m69358b(r0.f60990c.m70394a("Signature")).m69360c(2).m69358b(r0.f60990c.m70394a(r0.f60991d));
        }
        if (r0.f60972I != null) {
            c19336d2.m69358b(r0.f60990c.m70394a("MethodParameters"));
            c19336d2.m69360c(r0.f60972I.f60313b + 1).m69352a(r0.f60971H);
            c19336d2.m69357a(r0.f60972I.f60312a, 0, r0.f60972I.f60313b);
        }
        if (r0.f61000m != null) {
            c19336d2.m69358b(r0.f60990c.m70394a("AnnotationDefault"));
            c19336d2.m69360c(r0.f61000m.f60313b);
            c19336d2.m69357a(r0.f61000m.f60312a, 0, r0.f61000m.f60313b);
        }
        if (r0.f61001n != null) {
            c19336d2.m69358b(r0.f60990c.m70394a("RuntimeVisibleAnnotations"));
            r0.f61001n.m70384a(c19336d2);
        }
        if (r0.f61002o != null) {
            c19336d2.m69358b(r0.f60990c.m70394a("RuntimeInvisibleAnnotations"));
            r0.f61002o.m70384a(c19336d2);
        }
        if (r0.f61003p != null) {
            c19336d2.m69358b(r0.f60990c.m70394a("RuntimeVisibleTypeAnnotations"));
            r0.f61003p.m70384a(c19336d2);
        }
        if (r0.f61004q != null) {
            c19336d2.m69358b(r0.f60990c.m70394a("RuntimeInvisibleTypeAnnotations"));
            r0.f61004q.m70384a(c19336d2);
        }
        if (r0.f61005r != null) {
            c19336d2.m69358b(r0.f60990c.m70394a("RuntimeVisibleParameterAnnotations"));
            C19505b.m70378a(r0.f61005r, r0.f61007t, c19336d2);
        }
        if (r0.f61006s != null) {
            c19336d2.m69358b(r0.f60990c.m70394a("RuntimeInvisibleParameterAnnotations"));
            C19505b.m70378a(r0.f61006s, r0.f61007t, c19336d2);
        }
        if (r0.f61008u != null) {
            r0.f61008u.m69346a(r0.f60990c, null, 0, -1, -1, c19336d2);
        }
    }

    /* renamed from: a */
    public void mo14620a(C19346p c19346p) {
        this.f60983T |= c19346p.m69431a(this, this.f61009v.f60313b, this.f61009v.f60312a);
        if ((c19346p.f60374a & 1) == 0) {
            if (this.f60985V == 0) {
                C19346p c19346p2;
                if (this.f60988Y != null) {
                    if (c19346p.f60376c == this.f60988Y.f60376c) {
                        c19346p2 = this.f60988Y;
                        c19346p2.f60374a |= c19346p.f60374a & 16;
                        c19346p.f60379f = this.f60988Y.f60379f;
                        return;
                    }
                    m70443c(0, c19346p);
                }
                this.f60988Y = c19346p;
                if (c19346p.f60379f == null) {
                    c19346p.f60379f = new C19342l();
                    c19346p.f60379f.f60347b = c19346p;
                }
                if (this.f60987X != null) {
                    if (c19346p.f60376c == this.f60987X.f60376c) {
                        c19346p2 = this.f60987X;
                        c19346p2.f60374a |= c19346p.f60374a & 16;
                        c19346p.f60379f = this.f60987X.f60379f;
                        this.f60988Y = this.f60987X;
                        return;
                    }
                }
                this.f60987X = c19346p;
            } else if (this.f60985V == 1) {
                if (this.f60988Y != null) {
                    this.f60988Y.f60378e = this.aa;
                    m70443c(this.f60989Z, c19346p);
                }
                this.f60988Y = c19346p;
                this.f60989Z = 0;
                this.aa = 0;
                if (this.f60987X != null) {
                }
                this.f60987X = c19346p;
            } else {
                return;
            }
            this.f60987X.f60380g = c19346p;
            this.f60987X = c19346p;
        }
    }

    /* renamed from: a */
    public void mo14621a(C19346p c19346p, C19346p c19346p2, C19346p c19346p3, String str) {
        this.f60968E++;
        C19344n c19344n = new C19344n();
        c19344n.f60359a = c19346p;
        c19344n.f60360b = c19346p2;
        c19344n.f60361c = c19346p3;
        c19344n.f60362d = str;
        c19344n.f60363e = str != null ? this.f60990c.m70421c(str) : 0;
        if (this.f60970G == null) {
            this.f60969F = c19344n;
        } else {
            this.f60970G.f60364f = c19344n;
        }
        this.f60970G = c19344n;
    }

    /* renamed from: a */
    public void mo14622a(C19346p c19346p, int[] iArr, C19346p[] c19346pArr) {
        this.f60979P = this.f61009v.f60313b;
        int i = this.f61009v.f60313b;
        this.f61009v.m69352a(171);
        int i2 = 0;
        this.f61009v.m69357a(null, 0, (4 - (this.f61009v.f60313b % 4)) % 4);
        c19346p.m69428a(this, this.f61009v, i, true);
        this.f61009v.m69360c(c19346pArr.length);
        while (i2 < c19346pArr.length) {
            this.f61009v.m69360c(iArr[i2]);
            c19346pArr[i2].m69428a(this, this.f61009v, i, true);
            i2++;
        }
        m70437a(c19346p, c19346pArr);
    }

    /* renamed from: b */
    public C19334a mo14623b(int i, C19349t c19349t, String str, boolean z) {
        C19336d c19336d = new C19336d();
        C19505b.m70377a((i & -16776961) | (this.f60979P << 8), c19349t, c19336d);
        c19336d.m69358b(this.f60990c.m70394a(str)).m69358b(0);
        C19334a c19505b = new C19505b(this.f60990c, true, c19336d, c19336d, c19336d.f60313b - 2);
        if (z) {
            c19505b.f60905c = this.f60980Q;
            this.f60980Q = c19505b;
            return c19505b;
        }
        c19505b.f60905c = this.f60981R;
        this.f60981R = c19505b;
        return c19505b;
    }

    /* renamed from: b */
    public void mo14624b() {
    }

    /* renamed from: b */
    public void mo14625b(int i, int i2) {
        int i3;
        this.f60979P = this.f61009v.f60313b;
        if (this.f60988Y != null) {
            if (this.f60985V == 0) {
                this.f60988Y.f60379f.m69412a(i, i2, null, null);
            } else if (i == 169) {
                C19346p c19346p = this.f60988Y;
                c19346p.f60374a |= 256;
                this.f60988Y.f60377d = this.f60989Z;
                m70444e();
            } else {
                i3 = this.f60989Z + C19342l.f60346a[i];
                if (i3 > this.aa) {
                    this.aa = i3;
                }
                this.f60989Z = i3;
            }
        }
        if (this.f60985V != 2) {
            if (!(i == 22 || i == 24 || i == 55)) {
                if (i != 57) {
                    i3 = i2 + 1;
                    if (i3 > this.f61011x) {
                        this.f61011x = i3;
                    }
                }
            }
            i3 = i2 + 2;
            if (i3 > this.f61011x) {
                this.f61011x = i3;
            }
        }
        if (i2 < 4 && i != 169) {
            this.f61009v.m69352a((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            this.f61009v.m69352a(196).m69359b(i, i2);
        } else {
            this.f61009v.m69353a(i, i2);
        }
        if (i >= 54 && this.f60985V == 0 && this.f60968E > 0) {
            mo14620a(new C19346p());
        }
    }

    /* renamed from: b */
    public void mo14626b(int i, C19346p c19346p) {
        if (this.f60978O == null) {
            this.f60978O = new C19336d();
        }
        this.f60977N++;
        this.f60978O.m69358b(c19346p.f60376c);
        this.f60978O.m69358b(i);
    }

    /* renamed from: b */
    public void mo14627b(String str, int i) {
        this.f60979P = this.f61009v.f60313b;
        C19345o b = this.f60990c.m70418b(str);
        if (this.f60988Y != null) {
            if (this.f60985V == 0) {
                this.f60988Y.f60379f.m69412a(197, i, this.f60990c, b);
            } else {
                this.f60989Z += 1 - i;
            }
        }
        this.f61009v.m69359b(197, b.f60365a).m69352a(i);
    }

    /* renamed from: c */
    public C19334a mo14628c(int i, C19349t c19349t, String str, boolean z) {
        C19336d c19336d = new C19336d();
        C19505b.m70377a(i, c19349t, c19336d);
        c19336d.m69358b(this.f60990c.m70394a(str)).m69358b(0);
        C19334a c19505b = new C19505b(this.f60990c, true, c19336d, c19336d, c19336d.f60313b - 2);
        if (z) {
            c19505b.f60905c = this.f60980Q;
            this.f60980Q = c19505b;
            return c19505b;
        }
        c19505b.f60905c = this.f60981R;
        this.f60981R = c19505b;
        return c19505b;
    }

    /* renamed from: c */
    public void mo14629c() {
    }

    /* renamed from: c */
    public void mo14630c(int i, int i2) {
        this.f60979P = this.f61009v.f60313b;
        if (this.f60988Y != null && this.f60985V == 0) {
            this.f60988Y.f60379f.m69412a(132, i, null, null);
        }
        if (this.f60985V != 2) {
            int i3 = i + 1;
            if (i3 > this.f61011x) {
                this.f61011x = i3;
            }
        }
        if (i <= 255 && i2 <= 127) {
            if (i2 >= -128) {
                this.f61009v.m69352a(132).m69353a(i, i2);
                return;
            }
        }
        this.f61009v.m69352a(196).m69359b(132, i).m69358b(i2);
    }

    /* renamed from: d */
    final int m70480d() {
        if (this.f60992e != 0) {
            return this.f60993f + 6;
        }
        int i;
        int length;
        if (this.f61009v.f60313b <= 0) {
            i = 8;
        } else if (this.f61009v.f60313b > 65536) {
            throw new RuntimeException("Method code too large!");
        } else {
            this.f60990c.m70394a("Code");
            i = ((this.f61009v.f60313b + 18) + (this.f60968E * 8)) + 8;
            if (this.f60974K != null) {
                this.f60990c.m70394a("LocalVariableTable");
                i += this.f60974K.f60313b + 8;
            }
            if (this.f60976M != null) {
                this.f60990c.m70394a("LocalVariableTypeTable");
                i += this.f60976M.f60313b + 8;
            }
            if (this.f60978O != null) {
                this.f60990c.m70394a("LineNumberTable");
                i += this.f60978O.f60313b + 8;
            }
            if (this.f60964A != null) {
                this.f60990c.m70394a(((this.f60990c.f60931e & 65535) >= 50 ? 1 : null) != null ? "StackMapTable" : "StackMap");
                i += this.f60964A.f60313b + 8;
            }
            if (this.f60980Q != null) {
                this.f60990c.m70394a("RuntimeVisibleTypeAnnotations");
                i += this.f60980Q.m70385b() + 8;
            }
            if (this.f60981R != null) {
                this.f60990c.m70394a("RuntimeInvisibleTypeAnnotations");
                i += this.f60981R.m70385b() + 8;
            }
            if (this.f60982S != null) {
                i += this.f60982S.m69348b(this.f60990c, this.f61009v.f60312a, this.f61009v.f60313b, this.f61010w, this.f61011x);
            }
        }
        if (this.f60994g > 0) {
            this.f60990c.m70394a("Exceptions");
            i += (this.f60994g * 2) + 8;
        }
        if ((this.f60996i & 4096) != 0 && ((65535 & this.f60990c.f60931e) < 49 || (this.f60996i & 262144) != 0)) {
            this.f60990c.m70394a("Synthetic");
            i += 6;
        }
        if ((this.f60996i & 131072) != 0) {
            this.f60990c.m70394a("Deprecated");
            i += 6;
        }
        if (this.f60991d != null) {
            this.f60990c.m70394a("Signature");
            this.f60990c.m70394a(this.f60991d);
            i += 8;
        }
        if (this.f60972I != null) {
            this.f60990c.m70394a("MethodParameters");
            i += this.f60972I.f60313b + 7;
        }
        if (this.f61000m != null) {
            this.f60990c.m70394a("AnnotationDefault");
            i += this.f61000m.f60313b + 6;
        }
        if (this.f61001n != null) {
            this.f60990c.m70394a("RuntimeVisibleAnnotations");
            i += this.f61001n.m70385b() + 8;
        }
        if (this.f61002o != null) {
            this.f60990c.m70394a("RuntimeInvisibleAnnotations");
            i += this.f61002o.m70385b() + 8;
        }
        if (this.f61003p != null) {
            this.f60990c.m70394a("RuntimeVisibleTypeAnnotations");
            i += this.f61003p.m70385b() + 8;
        }
        if (this.f61004q != null) {
            this.f60990c.m70394a("RuntimeInvisibleTypeAnnotations");
            i += this.f61004q.m70385b() + 8;
        }
        if (this.f61005r != null) {
            this.f60990c.m70394a("RuntimeVisibleParameterAnnotations");
            i += ((this.f61005r.length - this.f61007t) * 2) + 7;
            for (length = this.f61005r.length - 1; length >= this.f61007t; length--) {
                i += this.f61005r[length] == null ? 0 : this.f61005r[length].m70385b();
            }
        }
        if (this.f61006s != null) {
            this.f60990c.m70394a("RuntimeInvisibleParameterAnnotations");
            i += ((this.f61006s.length - this.f61007t) * 2) + 7;
            for (length = this.f61006s.length - 1; length >= this.f61007t; length--) {
                i += this.f61006s[length] == null ? 0 : this.f61006s[length].m70385b();
            }
        }
        if (this.f61008u != null) {
            i += this.f61008u.m69348b(this.f60990c, null, 0, -1, -1);
        }
        return i;
    }

    /* renamed from: d */
    public void mo14631d(int i, int i2) {
        int i3 = i;
        if (this.f60983T) {
            m70449i();
        }
        long j = 32;
        C19346p a;
        C19346p a2;
        C19346p a3;
        C19346p c19346p;
        int i4;
        if (r0.f60985V == 0) {
            int length;
            C19344n c19344n = r0.f60969F;
            while (c19344n != null) {
                a = c19344n.f60361c.m69425a();
                a2 = c19344n.f60360b.m69425a();
                int e = 24117248 | r0.f60990c.m70426e(c19344n.f60362d == null ? "java/lang/Throwable" : c19344n.f60362d);
                a.f60374a |= 16;
                for (C19346p a4 = c19344n.f60359a.m69425a(); a4 != a2; a4 = a4.f60380g) {
                    C19340i c19340i = new C19340i();
                    c19340i.f60341a = e;
                    c19340i.f60342b = a;
                    c19340i.f60343c = a4.f60381h;
                    a4.f60381h = c19340i;
                }
                c19344n = c19344n.f60364f;
            }
            C19342l c19342l = r0.f60986W.f60379f;
            c19342l.m69413a(r0.f60990c, r0.f60996i, C19348s.m69471d(r0.f60999l), r0.f61011x);
            m70436a(c19342l);
            C19346p c19346p2 = r0.f60986W;
            int i5 = 0;
            while (c19346p2 != null) {
                a = c19346p2.f60382i;
                c19346p2.f60382i = null;
                C19342l c19342l2 = c19346p2.f60379f;
                if ((c19346p2.f60374a & 16) != 0) {
                    c19346p2.f60374a |= 32;
                }
                c19346p2.f60374a |= 64;
                length = c19342l2.f60349d.length + c19346p2.f60378e;
                if (length > i5) {
                    i5 = length;
                }
                for (C19340i c19340i2 = c19346p2.f60381h; c19340i2 != null; c19340i2 = c19340i2.f60343c) {
                    a3 = c19340i2.f60342b.m69425a();
                    if (c19342l2.m69414a(r0.f60990c, a3.f60379f, c19340i2.f60341a) && a3.f60382i == null) {
                        a3.f60382i = a;
                        a = a3;
                    }
                }
                c19346p2 = a;
            }
            for (c19346p2 = r0.f60986W; c19346p2 != null; c19346p2 = c19346p2.f60380g) {
                C19342l c19342l3 = c19346p2.f60379f;
                if ((c19346p2.f60374a & 32) != 0) {
                    m70436a(c19342l3);
                }
                if ((c19346p2.f60374a & 64) == 0) {
                    c19346p = c19346p2.f60380g;
                    i4 = c19346p2.f60376c;
                    int i6 = (c19346p == null ? r0.f61009v.f60313b : c19346p.f60376c) - 1;
                    if (i6 >= i4) {
                        i5 = Math.max(i5, 1);
                        for (length = i4; length < i6; length++) {
                            r0.f61009v.f60312a[length] = (byte) 0;
                        }
                        r0.f61009v.f60312a[i6] = (byte) -65;
                        r0.f60967D[m70433a(i4, 0, 1)] = r0.f60990c.m70426e("java/lang/Throwable") | 24117248;
                        m70447g();
                        r0.f60969F = C19344n.m69415a(r0.f60969F, c19346p2, c19346p);
                    }
                }
            }
            r0.f60968E = 0;
            for (c19344n = r0.f60969F; c19344n != null; c19344n = c19344n.f60364f) {
                r0.f60968E++;
            }
            r0.f61010w = i5;
        } else if (r0.f60985V == 1) {
            C19346p c19346p3;
            for (C19344n c19344n2 = r0.f60969F; c19344n2 != null; c19344n2 = c19344n2.f60364f) {
                a2 = c19344n2.f60361c;
                a3 = c19344n2.f60360b;
                for (a = c19344n2.f60359a; a != a3; a = a.f60380g) {
                    C19340i c19340i3 = new C19340i();
                    c19340i3.f60341a = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    c19340i3.f60342b = a2;
                    if ((a.f60374a & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                        c19340i3.f60343c = a.f60381h;
                        a.f60381h = c19340i3;
                    } else {
                        c19340i3.f60343c = a.f60381h.f60343c.f60343c;
                        a.f60381h.f60343c.f60343c = c19340i3;
                    }
                }
            }
            if (r0.f60984U > 0) {
                r0.f60986W.m69427a(null, 1, r0.f60984U);
                c19346p3 = r0.f60986W;
                i4 = 0;
                while (c19346p3 != null) {
                    if ((c19346p3.f60374a & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                        C19346p c19346p4 = c19346p3.f60381h.f60343c.f60342b;
                        if ((c19346p4.f60374a & 1024) == 0) {
                            i4++;
                            c19346p4.m69427a(null, ((((long) i4) / 32) << j) | (1 << (i4 % 32)), r0.f60984U);
                        }
                    }
                    c19346p3 = c19346p3.f60380g;
                    j = 32;
                }
                for (c19346p3 = r0.f60986W; c19346p3 != null; c19346p3 = c19346p3.f60380g) {
                    if ((c19346p3.f60374a & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                        c19346p = r0.f60986W;
                        while (c19346p != null) {
                            c19346p.f60374a &= -2049;
                            c19346p = c19346p.f60380g;
                        }
                        c19346p3.f60381h.f60343c.f60342b.m69427a(c19346p3, 0, r0.f60984U);
                    }
                }
            }
            c19346p3 = r0.f60986W;
            int i7 = 0;
            while (c19346p3 != null) {
                C19346p c19346p5 = c19346p3.f60382i;
                int i8 = c19346p3.f60377d;
                i4 = c19346p3.f60378e + i8;
                if (i4 > i7) {
                    i7 = i4;
                }
                C19340i c19340i4 = c19346p3.f60381h;
                if ((c19346p3.f60374a & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                    c19340i4 = c19340i4.f60343c;
                }
                c19346p3 = c19346p5;
                for (c19340i4 = 
/*
Method generation error in method: org.objectweb.asm.r.d(int, int):void, dex: classes5.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r8_25 'c19340i4' org.objectweb.asm.i) = (r8_23 'c19340i4' org.objectweb.asm.i), (r8_24 'c19340i4' org.objectweb.asm.i) binds: {(r8_24 'c19340i4' org.objectweb.asm.i)=B:95:0x01d9, (r8_23 'c19340i4' org.objectweb.asm.i)=B:94:0x01d7} in method: org.objectweb.asm.r.d(int, int):void, dex: classes5.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:219)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:146)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:124)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 28 more

*/
            }
