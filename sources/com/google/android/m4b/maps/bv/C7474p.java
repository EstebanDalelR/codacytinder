package com.google.android.m4b.maps.bv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.opengl.GLU;
import android.os.Bundle;
import android.support.v4.view.accessibility.C0586b;
import android.support.v4.widget.C2911h;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.cg.bp;
import com.google.android.m4b.maps.cg.bw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bv.p */
final class C7474p extends C2911h {
    /* renamed from: a */
    private static final float[] f27444a = new float[]{0.0f, -0.8f, 0.42096f, -0.1824f, -0.8f, 0.30096f, -0.1824f, -0.8f, 0.2f, 0.0f, -0.8f, 0.32f, 0.1824f, -0.8f, 0.2f, 0.1824f, -0.8f, 0.30096f};
    /* renamed from: b */
    private static final float[] f27445b = new float[]{0.0f, -0.84000003f, 0.42096f, -0.1824f, -0.84000003f, 0.30096f, -0.1824f, -0.84000003f, 0.2f, 0.0f, -0.84000003f, 0.32f, 0.1824f, -0.84000003f, 0.2f, 0.1824f, -0.84000003f, 0.30096f};
    /* renamed from: c */
    private static final float[] f27446c = new float[]{0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f};
    /* renamed from: d */
    private static final byte[] f27447d = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 0};
    /* renamed from: e */
    private static final byte[] f27448e = new byte[]{(byte) 0, (byte) 1, (byte) 2, (byte) 0, (byte) 2, (byte) 3, (byte) 0, (byte) 3, (byte) 4, (byte) 0, (byte) 4, (byte) 1};
    /* renamed from: A */
    private final Context f27449A;
    /* renamed from: B */
    private long f27450B;
    /* renamed from: C */
    private long f27451C;
    /* renamed from: D */
    private boolean f27452D;
    /* renamed from: E */
    private boolean f27453E;
    /* renamed from: F */
    private boolean f27454F = true;
    /* renamed from: G */
    private boolean f27455G = true;
    /* renamed from: H */
    private int[][] f27456H;
    /* renamed from: I */
    private final float f27457I;
    /* renamed from: J */
    private boolean f27458J;
    /* renamed from: K */
    private boolean f27459K;
    /* renamed from: f */
    private C4944q f27460f;
    /* renamed from: g */
    private C4948t[] f27461g;
    /* renamed from: h */
    private int f27462h;
    /* renamed from: i */
    private int f27463i;
    /* renamed from: j */
    private float f27464j;
    /* renamed from: k */
    private final C4942b f27465k;
    /* renamed from: l */
    private final C4942b f27466l;
    /* renamed from: m */
    private boolean f27467m;
    /* renamed from: n */
    private boolean f27468n;
    /* renamed from: o */
    private final C4954w f27469o;
    /* renamed from: p */
    private final float[] f27470p;
    /* renamed from: q */
    private C4935k f27471q;
    /* renamed from: r */
    private final CharSequence[] f27472r;
    /* renamed from: s */
    private final CharSequence[] f27473s;
    /* renamed from: t */
    private final Paint f27474t;
    /* renamed from: u */
    private final Paint f27475u;
    /* renamed from: v */
    private C4941a f27476v;
    /* renamed from: w */
    private C4941a f27477w;
    /* renamed from: x */
    private final Object f27478x;
    /* renamed from: y */
    private int f27479y;
    /* renamed from: z */
    private int f27480z;

    /* renamed from: com.google.android.m4b.maps.bv.p$a */
    static class C4941a {
        /* renamed from: a */
        private final int[] f18245a = new int[400];
        /* renamed from: b */
        private final int[] f18246b = new int[100];
        /* renamed from: c */
        private final int[] f18247c = new int[100];
        /* renamed from: d */
        private int f18248d;
        /* renamed from: e */
        private int f18249e;
        /* renamed from: f */
        private int f18250f;

        /* renamed from: a */
        public final void m22157a(int i, int i2) {
            this.f18248d = 0;
            this.f18249e = i;
            this.f18250f = i2;
        }

        /* renamed from: a */
        public final void m22158a(C4954w c4954w, GL10 gl10, float[] fArr, C4942b c4942b, int i, int i2, int i3, int i4) {
            c4954w.m22207b(gl10);
            gl10 = this.f18248d * 4;
            if (c4942b.m22166a(c4954w, this.f18245a, gl10, fArr, this.f18249e, this.f18250f) != null) {
                c4954w = this.f18245a[gl10];
                fArr = this.f18245a[gl10 + 1];
                c4942b = this.f18245a[gl10 + 2];
                gl10 = this.f18245a[gl10 + 3];
                int i5 = this.f18248d * 4;
                int[] iArr = this.f18245a;
                i = Math.max(0, c4942b - c4954w);
                i2 = Math.max(64, gl10 - fArr);
                c4954w = ((c4954w + c4942b) >> 1) - (i >> 1);
                gl10 = ((fArr + gl10) >> 1) - (i2 >> 1);
                iArr[i5] = c4954w;
                iArr[i5 + 1] = gl10;
                iArr[i5 + 2] = c4954w + i;
                iArr[i5 + 3] = gl10 + i2;
                this.f18247c[this.f18248d] = i4;
                c4954w = this.f18246b;
                gl10 = this.f18248d;
                this.f18248d = gl10 + 1;
                c4954w[gl10] = i3;
            }
        }

        /* renamed from: b */
        public final int m22161b(int i, int i2) {
            int[] iArr = this.f18245a;
            for (int i3 = this.f18248d - 1; i3 >= 0; i3--) {
                int i4 = i3 * 4;
                if (iArr[i4] <= i && iArr[i4 + 1] <= i2 && i < iArr[i4 + 2] && i2 < iArr[i4 + 3]) {
                    return this.f18246b[i3];
                }
            }
            return -1;
        }

        /* renamed from: a */
        public final int[] m22159a() {
            return this.f18246b;
        }

        /* renamed from: b */
        public final int m22160b() {
            return this.f18248d;
        }

        /* renamed from: c */
        public final int[] m22162c() {
            return this.f18245a;
        }

        /* renamed from: a */
        public final int m22156a(int i) {
            return this.f18247c[i];
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.p$b */
    static class C4942b {
        /* renamed from: a */
        private final FloatBuffer f18251a;
        /* renamed from: b */
        private final int f18252b;
        /* renamed from: c */
        private final int f18253c;
        /* renamed from: d */
        private final ByteBuffer f18254d;
        /* renamed from: e */
        private final ByteBuffer f18255e;

        public C4942b(float[] fArr) {
            this(fArr, C4942b.m22164a(fArr.length / 3));
        }

        private C4942b(float[] fArr, byte[] bArr) {
            this(fArr, bArr, bArr);
        }

        private C4942b(float[] fArr, byte[] bArr, byte[] bArr2) {
            this.f18251a = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f18251a.put(fArr, 0, fArr.length);
            this.f18251a.position(0);
            this.f18252b = bArr.length;
            this.f18253c = bArr2.length;
            if (this.f18252b <= 256) {
                if (this.f18253c <= 256) {
                    this.f18254d = C4942b.m22163a(bArr);
                    this.f18255e = C4942b.m22163a(bArr2);
                    return;
                }
            }
            throw new IllegalArgumentException("Only up to 256 points");
        }

        /* renamed from: a */
        private static ByteBuffer m22163a(byte[] bArr) {
            int length = bArr.length;
            ByteBuffer order = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
            order.put(bArr, 0, length);
            order.position(0);
            return order;
        }

        /* renamed from: a */
        private static byte[] m22164a(int i) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) i2;
            }
            return bArr;
        }

        /* renamed from: a */
        public final boolean m22166a(C4954w c4954w, int[] iArr, int i, float[] fArr, int i2, int i3) {
            float[] fArr2 = fArr;
            int limit = this.f18251a.limit() / 3;
            int i4 = 0;
            int i5 = 0;
            boolean z = false;
            int i6 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i7 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i8 = Integer.MIN_VALUE;
            int i9 = Integer.MIN_VALUE;
            while (i5 < limit) {
                boolean z2;
                int i10 = i5 * 3;
                fArr2[i4] = r0.f18251a.get(i10);
                fArr2[1] = r0.f18251a.get(i10 + 1);
                fArr2[2] = r0.f18251a.get(i10 + 2);
                fArr2[3] = 1.0f;
                c4954w.m22205a(fArr2, i4, fArr2, 4);
                i10 = (int) fArr2[4];
                i4 = (int) fArr2[5];
                int i11;
                int i12;
                if (z) {
                    i11 = i2;
                    i12 = i3;
                } else {
                    Object obj;
                    if (i10 < 0 || i4 < 0) {
                        i11 = i2;
                    } else if (i10 < i2) {
                        if (i4 < i3) {
                            obj = 1;
                            if (obj != null) {
                                z2 = false;
                                i6 = Math.min(i6, i10);
                                i8 = Math.max(i8, i10);
                                i7 = Math.min(i7, i4);
                                i9 = Math.max(i9, i4);
                                i5++;
                                z = z2;
                                i4 = 0;
                            }
                        }
                        obj = null;
                        if (obj != null) {
                            z2 = false;
                            i6 = Math.min(i6, i10);
                            i8 = Math.max(i8, i10);
                            i7 = Math.min(i7, i4);
                            i9 = Math.max(i9, i4);
                            i5++;
                            z = z2;
                            i4 = 0;
                        }
                    }
                    i12 = i3;
                    obj = null;
                    if (obj != null) {
                        z2 = false;
                        i6 = Math.min(i6, i10);
                        i8 = Math.max(i8, i10);
                        i7 = Math.min(i7, i4);
                        i9 = Math.max(i9, i4);
                        i5++;
                        z = z2;
                        i4 = 0;
                    }
                }
                z2 = true;
                i6 = Math.min(i6, i10);
                i8 = Math.max(i8, i10);
                i7 = Math.min(i7, i4);
                i9 = Math.max(i9, i4);
                i5++;
                z = z2;
                i4 = 0;
            }
            if (z) {
                iArr[i] = i6;
                iArr[i + 1] = i7;
                iArr[i + 2] = i8;
                iArr[i + 3] = i9;
            }
            return z;
        }

        /* renamed from: a */
        final void m22165a(GL10 gl10, int i) {
            gl10.glEnableClientState(32884);
            gl10.glVertexPointer(3, 5126, 0, this.f18251a);
            gl10.glDisableClientState(32888);
            gl10.glDisable(3553);
            gl10.glDrawElements(6, this.f18252b, 5121, this.f18254d);
        }
    }

    /* renamed from: b */
    protected final boolean m32398b(int i, int i2, Bundle bundle) {
        return true;
    }

    public C7474p(Context context, Resources resources, C4954w c4954w, View view) {
        super(view);
        this.f27449A = context;
        this.f27457I = resources.getDisplayMetrics().density;
        this.f27465k = new C4942b(f27444a);
        this.f27466l = new C4942b(f27445b);
        this.f27469o = c4954w;
        m32386d();
        this.f27472r = resources.getTextArray(C4513R.array.maps_compass_directions);
        this.f27473s = resources.getTextArray(C4513R.array.maps_full_compass_directions);
        this.f27474t = new Paint();
        this.f27474t.setAntiAlias(true);
        this.f27474t.setTextAlign(Align.LEFT);
        this.f27474t.setTypeface(Typeface.DEFAULT);
        this.f27474t.setTextSize(100.0f);
        this.f27474t.setARGB(-1, 255, 255, 255);
        this.f27474t.setStyle(Style.FILL);
        this.f27474t.setStrokeWidth(1.0f);
        this.f27475u = new Paint();
        this.f27475u.setAntiAlias(true);
        this.f27475u.setTextAlign(Align.LEFT);
        this.f27475u.setTypeface(Typeface.DEFAULT);
        this.f27475u.setTextSize(100.0f);
        this.f27475u.setStyle(Style.STROKE);
        this.f27475u.setStrokeWidth(3.0f);
        this.f27475u.setARGB(-1, 0, 0, 0);
        this.f27476v = new C4941a();
        this.f27477w = new C4941a();
        this.f27478x = this.f27477w;
        this.f27470p = new float[8];
    }

    /* renamed from: d */
    private void m32386d() {
        this.f27471q = new C4935k(true, ItemAnimator.FLAG_MOVED, ((double) this.f27457I) < 2.0d ? 1024 : ItemAnimator.FLAG_MOVED, false);
    }

    /* renamed from: a */
    public final void m32391a(C4944q c4944q, int i, int i2) {
        this.f27460f = c4944q;
        boolean z = true;
        if (this.f27460f == null || this.f27460f.f18275o != 1) {
            z = false;
        }
        this.f27459K = z;
        this.f27461g = this.f27460f.f18285y;
        this.f27462h = i;
        this.f27463i = i2;
        this.f27464j = ((float) i) / ((float) i2);
        this.f27468n = false;
        this.f27479y = -1;
    }

    /* renamed from: a */
    public final void m32393a(GL10 gl10) {
        m32384b(gl10);
    }

    /* renamed from: b */
    private void m32384b(GL10 gl10) {
        this.f27468n = false;
        this.f27467m = false;
        if (this.f27471q != null) {
            this.f27471q.m22116b(gl10);
            this.f27471q = null;
        }
    }

    /* renamed from: a */
    public final void m32388a(int i, long j) {
        if (i == 0) {
            this.f27451C = j;
            this.f27452D = true;
            return;
        }
        if (i == 1) {
            this.f27453E = true;
        }
    }

    /* renamed from: e */
    public final com.google.android.m4b.maps.bv.C4948t m32401e(int r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f27461g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0005 }
        r2 = r0[r2];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0005 }
        return r2;
    L_0x0005:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.p.e(int):com.google.android.m4b.maps.bv.t");
    }

    /* renamed from: a */
    public final void m32394a(javax.microedition.khronos.opengles.GL10 r11, com.google.android.m4b.maps.cg.bw r12, long r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = r10.f27458J;
        if (r0 != 0) goto L_0x013e;
    L_0x0004:
        r0 = r10.f27460f;
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        goto L_0x013e;
    L_0x000a:
        r0 = 1;
        r1 = new int[r0];
        r2 = 3379; // 0xd33 float:4.735E-42 double:1.6694E-320;
        r3 = 0;
        r11.glGetIntegerv(r2, r1, r3);
        r2 = r10.f27460f;
        r2 = r2.f18286z;
        if (r2 == 0) goto L_0x001b;
    L_0x0019:
        r2 = 1;
        goto L_0x001c;
    L_0x001b:
        r2 = 0;
    L_0x001c:
        r1 = r1[r3];
        r4 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r1 < r4) goto L_0x002c;
    L_0x0022:
        if (r2 == 0) goto L_0x002c;
    L_0x0024:
        r1 = r10.f27460f;
        r1 = r1.f18262b;
        if (r1 != 0) goto L_0x002c;
    L_0x002a:
        r1 = 1;
        goto L_0x002d;
    L_0x002c:
        r1 = 0;
    L_0x002d:
        r2 = -1;
        r10.f27480z = r2;
        r4 = r10.f27451C;
        r6 = r13 - r4;
        r13 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r4 >= 0) goto L_0x005c;
    L_0x003a:
        r4 = r10.f27461g;
        r5 = r12.m23049b();
        r6 = 1123024896; // 0x42f00000 float:120.0 double:5.548480205E-315;
        r4 = com.google.android.m4b.maps.bv.C4944q.m22170a(r4, r5, r6);
        r10.f27480z = r4;
        r4 = r10.f27451C;
        r6 = r4 + r13;
        r13 = r10.f27450B;
        r4 = 0;
        r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1));
        if (r8 == 0) goto L_0x005a;
    L_0x0054:
        r13 = r10.f27450B;
        r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x005c;
    L_0x005a:
        r10.f27450B = r6;
    L_0x005c:
        if (r1 == 0) goto L_0x0064;
    L_0x005e:
        r13 = r10.f27459K;	 Catch:{ OutOfMemoryError -> 0x0135 }
        if (r13 != 0) goto L_0x0064;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x0062:
        r13 = 1;	 Catch:{ OutOfMemoryError -> 0x0135 }
        goto L_0x0065;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x0064:
        r13 = 0;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x0065:
        r14 = r10.f27468n;	 Catch:{ OutOfMemoryError -> 0x0135 }
        if (r14 != 0) goto L_0x010a;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x0069:
        r14 = r10.f27460f;	 Catch:{ OutOfMemoryError -> 0x0135 }
        if (r14 != 0) goto L_0x006f;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x006d:
        goto L_0x010a;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x006f:
        r14 = r10.f27471q;	 Catch:{ OutOfMemoryError -> 0x0135 }
        if (r14 != 0) goto L_0x0076;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x0073:
        r10.m32386d();	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x0076:
        r14 = r10.f27467m;	 Catch:{ OutOfMemoryError -> 0x0135 }
        if (r14 != 0) goto L_0x0081;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x007a:
        r14 = r10.f27471q;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r14.m22113a(r11);	 Catch:{ OutOfMemoryError -> 0x0135 }
        r10.f27467m = r0;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x0081:
        if (r13 == 0) goto L_0x0108;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x0083:
        r13 = r10.f27471q;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r13.m22112a();	 Catch:{ OutOfMemoryError -> 0x0135 }
        r13 = r10.f27461g;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r13 = r13.length;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r14 = 3;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r1 = new int[]{r13, r14};	 Catch:{ OutOfMemoryError -> 0x0135 }
        r4 = int.class;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r1 = java.lang.reflect.Array.newInstance(r4, r1);	 Catch:{ OutOfMemoryError -> 0x0135 }
        r1 = (int[][]) r1;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r10.f27456H = r1;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r1 = 0;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x009b:
        if (r1 >= r13) goto L_0x0103;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x009d:
        r4 = r10.f27461g;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r4 = r4[r1];	 Catch:{ OutOfMemoryError -> 0x0135 }
        r5 = r4.f18298e;	 Catch:{ OutOfMemoryError -> 0x0135 }
        if (r5 == 0) goto L_0x00fa;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x00a5:
        r5 = r4.f18298e;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r5 = r5.length();	 Catch:{ OutOfMemoryError -> 0x0135 }
        if (r5 <= 0) goto L_0x00fa;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x00ad:
        r5 = r4.f18298e;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r6 = r10.f27472r;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r4 = r4.f18295b;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r4 = r6[r4];	 Catch:{ OutOfMemoryError -> 0x0135 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ OutOfMemoryError -> 0x0135 }
        r6 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r7 = java.lang.String.valueOf(r5);	 Catch:{ OutOfMemoryError -> 0x0135 }
        r7 = r7.length();	 Catch:{ OutOfMemoryError -> 0x0135 }
        r7 = r7 + r14;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r8 = java.lang.String.valueOf(r4);	 Catch:{ OutOfMemoryError -> 0x0135 }
        r8 = r8.length();	 Catch:{ OutOfMemoryError -> 0x0135 }
        r7 = r7 + r8;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r6.<init>(r7);	 Catch:{ OutOfMemoryError -> 0x0135 }
        r6.append(r5);	 Catch:{ OutOfMemoryError -> 0x0135 }
        r5 = " (";	 Catch:{ OutOfMemoryError -> 0x0135 }
        r6.append(r5);	 Catch:{ OutOfMemoryError -> 0x0135 }
        r6.append(r4);	 Catch:{ OutOfMemoryError -> 0x0135 }
        r4 = ")";	 Catch:{ OutOfMemoryError -> 0x0135 }
        r6.append(r4);	 Catch:{ OutOfMemoryError -> 0x0135 }
        r4 = r6.toString();	 Catch:{ OutOfMemoryError -> 0x0135 }
        r5 = 0;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x00e5:
        if (r5 >= r14) goto L_0x0100;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x00e7:
        r6 = r10.f27456H;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r6 = r6[r1];	 Catch:{ OutOfMemoryError -> 0x0135 }
        r7 = r10.f27471q;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r8 = r10.f27474t;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r9 = r10.f27475u;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r7 = r7.m22111a(r11, r4, r8, r9);	 Catch:{ OutOfMemoryError -> 0x0135 }
        r6[r5] = r7;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r5 = r5 + 1;	 Catch:{ OutOfMemoryError -> 0x0135 }
        goto L_0x00e5;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x00fa:
        r4 = r10.f27456H;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r4 = r4[r1];	 Catch:{ OutOfMemoryError -> 0x0135 }
        r4[r3] = r2;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x0100:
        r1 = r1 + 1;	 Catch:{ OutOfMemoryError -> 0x0135 }
        goto L_0x009b;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x0103:
        r13 = r10.f27471q;	 Catch:{ OutOfMemoryError -> 0x0135 }
        r13.m22117c(r11);	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x0108:
        r10.f27468n = r0;	 Catch:{ OutOfMemoryError -> 0x0135 }
    L_0x010a:
        r13 = r10.f27476v;
        r14 = r10.f27462h;
        r0 = r10.f27463i;
        r13.m22157a(r14, r0);
        r13 = r10.f27459K;
        if (r13 != 0) goto L_0x011e;
    L_0x0117:
        r13 = r10.f27454F;
        if (r13 == 0) goto L_0x011e;
    L_0x011b:
        r10.m32383a(r11, r12);
    L_0x011e:
        r13 = r10.f27455G;
        if (r13 == 0) goto L_0x0125;
    L_0x0122:
        r10.m32385b(r11, r12);
    L_0x0125:
        r12 = r10.f27478x;
        monitor-enter(r12);
        r11 = r10.f27477w;	 Catch:{ all -> 0x0132 }
        r13 = r10.f27476v;	 Catch:{ all -> 0x0132 }
        r10.f27477w = r13;	 Catch:{ all -> 0x0132 }
        r10.f27476v = r11;	 Catch:{ all -> 0x0132 }
        monitor-exit(r12);	 Catch:{ all -> 0x0132 }
        return;	 Catch:{ all -> 0x0132 }
    L_0x0132:
        r11 = move-exception;	 Catch:{ all -> 0x0132 }
        monitor-exit(r12);	 Catch:{ all -> 0x0132 }
        throw r11;
    L_0x0135:
        r10.m32384b(r11);
        r10.m32386d();
        r10.f27458J = r0;
        return;
    L_0x013e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.p.a(javax.microedition.khronos.opengles.GL10, com.google.android.m4b.maps.cg.bw, long):void");
    }

    /* renamed from: a */
    protected final int m32387a(float f, float f2) {
        f = this.f27477w.m22161b((int) f, this.f27463i - ((int) f2));
        return f == Float.NaN ? Integer.MIN_VALUE : f;
    }

    /* renamed from: a */
    protected final void m32392a(List<Integer> list) {
        int[] a = this.f27477w.m22159a();
        for (int i = 0; i < this.f27477w.m22160b(); i++) {
            list.add(Integer.valueOf(a[i]));
        }
    }

    /* renamed from: a */
    protected final void m32390a(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription(this.f27473s[this.f27477w.m22156a(i)]);
    }

    /* renamed from: a */
    protected final void m32389a(int i, C0586b c0586b) {
        int[] c = this.f27477w.m22162c();
        int i2 = i * 4;
        c0586b.b(new Rect(c[i2], this.f27463i - c[i2 + 3], c[i2 + 2], this.f27463i - c[i2 + 1]));
        c0586b.c(true);
        c0586b.d(this.f27473s[this.f27477w.m22156a(i)]);
    }

    /* renamed from: a */
    private void m32383a(GL10 gl10, bw bwVar) {
        if (this.f27456H != null) {
            this.f27471q.m22114a(gl10, (float) this.f27462h, (float) this.f27463i);
            gl10.glMatrixMode(5888);
            gl10.glPushMatrix();
            gl10.glLoadIdentity();
            gl10.glMultMatrixf(bwVar.m23048a(), 0);
            for (bwVar = null; bwVar < this.f27461g.length; bwVar++) {
                if (this.f27456H[bwVar][0] != -1) {
                    gl10.glPushMatrix();
                    double o = (double) bp.m23007o(180.0f - this.f27460f.f18281u);
                    gl10.glRotatef(-this.f27460f.f18282v, (float) Math.cos(o), 0.0f, -((float) Math.sin(o)));
                    gl10.glRotatef(-this.f27461g[bwVar].f18294a, 0.0f, 1.0f, 0.0f);
                    gl10.glTranslatef(0.0f, 0.0f, -5.0f);
                    gl10.glTranslatef(0.0f, -5.0f, 0.0f);
                    gl10.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
                    gl10.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
                    gl10.glScalef(0.025f, 0.025f, 0.025f);
                    gl10.glTranslatef(0.0f, (this.f27457I * -60.0f) / 2.0f, 0.0f);
                    this.f27471q.m22115a(gl10, this.f27456H[bwVar][0]);
                    gl10.glPopMatrix();
                }
            }
            gl10.glMatrixMode(5888);
            gl10.glPopMatrix();
            this.f27471q.m22118d(gl10);
        }
    }

    /* renamed from: b */
    private void m32385b(GL10 gl10, bw bwVar) {
        GL10 gl102 = gl10;
        if (this.f27464j != 0.0f) {
            gl102.glMatrixMode(5889);
            gl10.glLoadIdentity();
            GLU.gluPerspective(gl102, C6552x.m28941a(r0.f27464j) * bwVar.m23055f(), r0.f27464j, 0.1f, 100.0f);
            gl102.glMatrixMode(5888);
            gl10.glLoadIdentity();
            gl102.glTranslatef(0.0f, 0.0f, -2.0f);
            gl102.glMultMatrixf(bwVar.m23048a(), 0);
            gl102.glTranslatef(0.0f, -1.0f, 0.0f);
            gl102.glShadeModel(7424);
            gl102.glEnable(3042);
            gl102.glBlendFunc(770, 771);
            r0.f27469o.m22204a(gl102);
            gl102.glMatrixMode(5888);
            int i = 0;
            while (i < r0.f27461g.length) {
                Object obj;
                float b = bwVar.m23049b();
                C4948t c4948t = r0.f27461g[i];
                gl10.glPushMatrix();
                b -= c4948t.f18294a;
                float f = 180.0f - c4948t.f18294a;
                double o = (double) bp.m23007o(180.0f - r0.f27460f.f18281u);
                gl102.glRotatef(-r0.f27460f.f18282v, (float) Math.cos(o), 0.0f, -((float) Math.sin(o)));
                gl102.glRotatef(f, 0.0f, 1.0f, 0.0f);
                int i2 = c4948t.f18297d;
                gl102.glColor4x(((i2 >> 16) & 255) << 8, ((i2 >> 8) & 255) << 8, ((i2 >> 0) & 255) << 8, Math.min((int) (((float) (((i2 >> 24) & 255) << 8)) * 1.1f), 65536));
                b = (float) Math.cos((double) bp.m23007o(b));
                gl102.glTranslatef(0.0f, 0.0f, (((((b * 0.355f) + 0.68f) - ((((2.0f * b) * b) - 1.0f) * 0.32f)) - (((((4.0f * b) * b) - 3.0f) * b) * 0.215f)) * 0.25f) + 0.2f);
                Object obj2 = r0.f27480z == i ? 1 : null;
                Object obj3 = r0.f27479y == i ? 1 : null;
                if (obj3 != null) {
                    obj2 = null;
                }
                if (obj2 == null) {
                    if (obj3 == null) {
                        obj = null;
                        if (obj == null) {
                            if (obj2 == null) {
                                gl102.glColor4x(34816, 27904, 44288, 65536);
                            } else {
                                gl102.glColor4x(62976, 35328, 7936, 65536);
                            }
                            gl10.glPushMatrix();
                            gl102.glScalef(1.3f, 1.0f, 1.3f);
                        } else {
                            gl102.glColor4x(0, 0, 0, 32768);
                        }
                        r0.f27469o.m22207b(gl102);
                        if (!r0.f27459K || r0.f27464j >= 1.0f) {
                            gl102.glTranslatef(0.0f, 0.5f, 0.0f);
                        }
                        gl102.glColor4x(0, 0, 0, 20480);
                        r0.f27466l.m22165a(gl102, 6);
                        gl102.glColor4x(65536, 65536, 65536, 65536);
                        r0.f27465k.m22165a(gl102, 6);
                        r0.f27476v.m22158a(r0.f27469o, gl102, r0.f27470p, r0.f27465k, 0, 64, i, c4948t.f18295b);
                        if (obj != null) {
                            gl10.glPopMatrix();
                        }
                        gl10.glPopMatrix();
                        i++;
                    }
                }
                obj = 1;
                if (obj == null) {
                    gl102.glColor4x(0, 0, 0, 32768);
                } else {
                    if (obj2 == null) {
                        gl102.glColor4x(62976, 35328, 7936, 65536);
                    } else {
                        gl102.glColor4x(34816, 27904, 44288, 65536);
                    }
                    gl10.glPushMatrix();
                    gl102.glScalef(1.3f, 1.0f, 1.3f);
                }
                r0.f27469o.m22207b(gl102);
                gl102.glTranslatef(0.0f, 0.5f, 0.0f);
                gl102.glColor4x(0, 0, 0, 20480);
                r0.f27466l.m22165a(gl102, 6);
                gl102.glColor4x(65536, 65536, 65536, 65536);
                r0.f27465k.m22165a(gl102, 6);
                r0.f27476v.m22158a(r0.f27469o, gl102, r0.f27470p, r0.f27465k, 0, 64, i, c4948t.f18295b);
                if (obj != null) {
                    gl10.glPopMatrix();
                }
                gl10.glPopMatrix();
                i++;
            }
            gl102.glDisable(3042);
        }
    }

    /* renamed from: b */
    public final long m32396b() {
        return this.f27450B;
    }

    /* renamed from: c */
    public final int m32399c(int i, int i2) {
        synchronized (this.f27478x) {
            i = this.f27477w.m22161b(i, i2);
        }
        return i;
    }

    /* renamed from: f */
    public final void m32402f(int i) {
        this.f27479y = i;
    }

    /* renamed from: a */
    public final void m32395a(boolean z) {
        this.f27454F = z;
    }

    /* renamed from: c */
    public final boolean m32400c() {
        return this.f27454F;
    }

    /* renamed from: b */
    public final void m32397b(boolean z) {
        this.f27455G = z;
    }
}
