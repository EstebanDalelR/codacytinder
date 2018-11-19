package com.google.android.m4b.maps.bv;

import android.opengl.Visibility;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bv.f */
final class C4926f {
    /* renamed from: a */
    private final FloatBuffer f18167a;
    /* renamed from: b */
    private final float[] f18168b;
    /* renamed from: c */
    private final FloatBuffer f18169c;
    /* renamed from: d */
    private final CharBuffer f18170d;
    /* renamed from: e */
    private final char[] f18171e;
    /* renamed from: f */
    private final int f18172f;
    /* renamed from: g */
    private final int f18173g;
    /* renamed from: h */
    private final int f18174h;

    public C4926f(int i, int i2) {
        if (i >= 2) {
            if (i < 65536) {
                if (i2 >= 2) {
                    if (i2 < 65536) {
                        int i3 = i * i2;
                        if (i3 >= 65536) {
                            throw new IllegalArgumentException("w * h >= 65536");
                        }
                        this.f18172f = i;
                        this.f18173g = i2;
                        this.f18168b = new float[(i3 * 3)];
                        i3 *= 4;
                        this.f18167a = ByteBuffer.allocateDirect(i3 * 3).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.f18169c = ByteBuffer.allocateDirect(i3 * 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        i = this.f18172f - 1;
                        i2 = this.f18173g - 1;
                        int i4 = (i * i2) * 6;
                        this.f18174h = i4;
                        this.f18171e = new char[i4];
                        this.f18170d = ByteBuffer.allocateDirect(i4 * 2).order(ByteOrder.nativeOrder()).asCharBuffer();
                        i4 = 0;
                        i3 = 0;
                        while (i4 < i2) {
                            int i5 = i3;
                            i3 = 0;
                            while (i3 < i) {
                                int i6 = (this.f18172f * i4) + i3;
                                char c = (char) (i6 + 1);
                                char c2 = (char) (this.f18172f + i6);
                                char c3 = (char) ((this.f18172f + i6) + 1);
                                int i7 = i5 + 1;
                                this.f18171e[i5] = (char) i6;
                                i6 = i7 + 1;
                                this.f18171e[i7] = c;
                                int i8 = i6 + 1;
                                this.f18171e[i6] = c2;
                                i6 = i8 + 1;
                                this.f18171e[i8] = c;
                                int i9 = i6 + 1;
                                this.f18171e[i6] = c2;
                                i6 = i9 + 1;
                                this.f18171e[i9] = c3;
                                i3++;
                                i5 = i6;
                            }
                            i4++;
                            i3 = i5;
                        }
                        this.f18170d.position(0);
                        this.f18170d.put(this.f18171e);
                        this.f18170d.position(0);
                        return;
                    }
                }
                throw new IllegalArgumentException("h");
            }
        }
        throw new IllegalArgumentException("w");
    }

    /* renamed from: a */
    final void m22080a(int i, int i2, float f, float f2, float f3, float f4, float f5) {
        if (i >= 0) {
            if (i < this.f18172f) {
                if (i2 >= 0) {
                    if (i2 < this.f18173g) {
                        int i3 = (this.f18172f * i2) + i;
                        i = i3 * 3;
                        this.f18168b[i] = f;
                        int i4 = i + 1;
                        this.f18168b[i4] = f2;
                        int i5 = i + 2;
                        this.f18168b[i5] = f3;
                        this.f18167a.put(i, f);
                        this.f18167a.put(i4, f2);
                        this.f18167a.put(i5, f3);
                        i3 *= 2;
                        this.f18169c.put(i3, f4);
                        this.f18169c.put(i3 + 1, f5);
                        return;
                    }
                }
                throw new IllegalArgumentException("j");
            }
        }
        throw new IllegalArgumentException("i");
    }

    /* renamed from: a */
    public final void m22082a(float[] fArr, int i) {
        Visibility.computeBoundingSphere(this.f18168b, 0, this.f18172f * this.f18173g, fArr, i);
    }

    /* renamed from: a */
    public final void m22081a(GL10 gl10, boolean z) {
        gl10.glEnableClientState(32884);
        gl10.glVertexPointer(3, 5126, 0, this.f18167a);
        if (z) {
            gl10.glEnableClientState(32888);
            gl10.glTexCoordPointer(true, 5126, 0, this.f18169c);
            gl10.glEnable(3553);
        } else {
            gl10.glDisableClientState(32888);
            gl10.glDisable(3553);
        }
        gl10.glDrawElements(true, this.f18174h, 5123, this.f18170d);
    }

    /* renamed from: a */
    public final int m22079a(aj ajVar) {
        return ajVar.m22049a(this.f18168b, 0, this.f18171e, 0, this.f18171e.length);
    }
}
