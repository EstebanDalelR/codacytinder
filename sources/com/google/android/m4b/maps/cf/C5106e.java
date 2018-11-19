package com.google.android.m4b.maps.cf;

import android.opengl.Matrix;
import com.google.android.m4b.maps.cf.C5108f.C5107a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.cf.e */
public class C5106e {
    /* renamed from: a */
    private C5118o f18945a;
    /* renamed from: b */
    private volatile float[] f18946b = new float[16];
    /* renamed from: c */
    private float[] f18947c = new float[16];
    /* renamed from: d */
    private float[] f18948d = new float[16];
    /* renamed from: e */
    private float[] f18949e = new float[16];
    /* renamed from: f */
    private float[] f18950f = new float[16];
    /* renamed from: g */
    private boolean f18951g = false;
    /* renamed from: h */
    private int f18952h = 0;
    /* renamed from: i */
    private byte f18953i;
    /* renamed from: j */
    private boolean f18954j = false;
    /* renamed from: k */
    private final float f18955k;
    /* renamed from: l */
    private final float f18956l;
    /* renamed from: m */
    private final float f18957m;
    /* renamed from: n */
    private final C5105a f18958n;
    /* renamed from: o */
    private List<Object> f18959o = new ArrayList();

    /* renamed from: com.google.android.m4b.maps.cf.e$a */
    enum C5105a {
        PERSPECTIVE,
        ORTHOGRAPHIC,
        USER_SET
    }

    public C5106e(C5118o c5118o, int i, float[] fArr) {
        this.f18945a = c5118o;
        this.f18953i = (byte) i;
        this.f18955k = -1.0f;
        this.f18956l = 1.0f;
        this.f18957m = null;
        this.f18958n = C5105a.USER_SET;
        System.arraycopy(fArr, 0, this.f18946b, 0, 16);
        this.f18951g = true;
    }

    /* renamed from: w */
    protected final void m22785w() {
        Matrix.multiplyMM(this.f18949e, 0, this.f18948d, 0, this.f18946b, 0);
        this.f18952h++;
    }

    /* renamed from: x */
    public final C5118o m22786x() {
        return this.f18945a;
    }

    /* renamed from: a */
    final boolean m22784a(C5111g c5111g, C5107a c5107a) {
        if (c5107a.f18965d == this.f18954j && c5107a.f18966e == null) {
            return null;
        }
        this.f18954j = c5107a.f18965d;
        if (this.f18954j != null) {
            this.f18945a.m22809a(this);
            m22783a(this.f18945a.m22811b(), this.f18945a.m22813c());
        } else {
            this.f18945a.m22812b(this);
        }
        this.f18945a.m22810a(c5107a);
        return true;
    }

    /* renamed from: a */
    final void m22783a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        synchronized (this.f18950f) {
            try {
                float[] fArr;
                float f;
                float tan;
                switch (r1.f18958n) {
                    case PERSPECTIVE:
                        fArr = r1.f18950f;
                        f = i4 == 0 ? 1.0f : ((float) i3) / ((float) i4);
                        tan = ((float) Math.tan(Math.toRadians(0.0d) / 2.0d)) * -1.0f;
                        float f2 = -tan;
                        float f3 = f2 / f;
                        f = tan / f;
                        float f4 = tan - f2;
                        fArr[0] = -2.0f / f4;
                        fArr[1] = 0.0f;
                        fArr[2] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[4] = 0.0f;
                        float f5 = f - f3;
                        fArr[5] = -2.0f / f5;
                        fArr[6] = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[8] = (tan + f2) / f4;
                        fArr[9] = (f + f3) / f5;
                        fArr[10] = -0.0f;
                        fArr[11] = -1.0f;
                        fArr[12] = 0.0f;
                        fArr[13] = 0.0f;
                        fArr[14] = 1.0f;
                        fArr[15] = 0.0f;
                        break;
                    case ORTHOGRAPHIC:
                        fArr = r1.f18950f;
                        f = (float) i3;
                        tan = (float) i4;
                        if (!(0.0f == f || tan == 0.0f)) {
                            float f6 = f - 0.0f;
                            fArr[0] = 2.0f / f6;
                            fArr[1] = 0.0f;
                            fArr[2] = 0.0f;
                            fArr[3] = 0.0f;
                            fArr[4] = 0.0f;
                            float f7 = tan - 0.0f;
                            fArr[5] = 2.0f / f7;
                            fArr[6] = 0.0f;
                            fArr[7] = 0.0f;
                            fArr[8] = 0.0f;
                            fArr[9] = 0.0f;
                            fArr[10] = -1.0f;
                            fArr[11] = 0.0f;
                            fArr[12] = (-(f + 0.0f)) / f6;
                            fArr[13] = (-(tan + 0.0f)) / f7;
                            fArr[14] = -0.0f;
                            fArr[15] = 1.0f;
                            break;
                        }
                    case USER_SET:
                        break;
                    default:
                        String valueOf = String.valueOf(r1.f18958n);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        stringBuilder.append("Unimplemented projection type ");
                        stringBuilder.append(valueOf);
                        throw new IllegalStateException(stringBuilder.toString());
                }
                r1.f18951g = true;
                mo5248a();
            } catch (Throwable th) {
                Throwable th2 = th;
            }
        }
    }

    /* renamed from: y */
    final void m22787y() {
        synchronized (this.f18950f) {
            if (this.f18951g) {
                System.arraycopy(this.f18950f, 0, this.f18948d, 0, 16);
                m22785w();
                this.f18951g = false;
            }
        }
    }

    /* renamed from: z */
    public final byte m22788z() {
        return this.f18953i;
    }

    /* renamed from: a */
    private void mo5248a() {
        Iterator it = this.f18959o.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
