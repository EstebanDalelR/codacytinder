package com.google.android.m4b.maps.bv;

import android.graphics.Bitmap;
import android.opengl.GLUtils;
import com.google.android.gms.gcm.Task;
import java.util.BitSet;
import javax.microedition.khronos.opengles.GL10;

final class af extends C4933j<C4946s, Integer> {
    /* renamed from: b */
    private final BitSet f24336b = new BitSet(17);
    /* renamed from: c */
    private final BitSet f24337c = new BitSet(17);
    /* renamed from: d */
    private final int[] f24338d = new int[17];
    /* renamed from: e */
    private GL10 f24339e;

    /* renamed from: a */
    protected final /* synthetic */ void mo5201a(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (this.f24336b.get(num.intValue()) == null) {
            obj2 = String.valueOf(num);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj2).length() + 24);
            stringBuilder.append("Ejecting unused texture ");
            stringBuilder.append(obj2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f24336b.clear(num.intValue());
    }

    public af(int i) {
        super(17);
    }

    /* renamed from: a */
    public final void m28932a(GL10 gl10) {
        this.f24339e = gl10;
        gl10.glGenTextures(this.a, this.f24338d, 0);
    }

    /* renamed from: a */
    public final int m28928a(C4946s c4946s) {
        Integer num = (Integer) m22104a((Object) c4946s);
        if (num == null) {
            return null;
        }
        return this.f24338d[num.intValue()];
    }

    /* renamed from: a */
    public final void m28929a() {
        if (this.f24339e != null) {
            this.f24339e.glDeleteTextures(this.a, this.f24338d, 0);
        }
        m22107b();
        this.f24337c.clear();
        this.f24339e = null;
    }

    /* renamed from: a */
    public final void m28930a(C4946s c4946s, Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (m22104a((Object) c4946s) != null) {
                    c4946s = String.valueOf(c4946s);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(c4946s).length() + 15);
                    stringBuilder.append("Already cached ");
                    stringBuilder.append(c4946s);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                m22109c();
                int nextClearBit = this.f24336b.nextClearBit(0);
                if (nextClearBit >= this.a) {
                    throw new RuntimeException("Ran out of texture cache slots.");
                }
                GL10 gl10 = this.f24339e;
                if (gl10 != null) {
                    gl10.glBindTexture(3553, this.f24338d[nextClearBit]);
                    if (this.f24337c.get(nextClearBit)) {
                        GLUtils.texImage2D(3553, 0, bitmap, 0);
                    } else {
                        gl10.glTexParameterf(3553, 10241, 9728.0f);
                        gl10.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                        gl10.glTexParameterf(3553, 10242, 33071.0f);
                        gl10.glTexParameterf(3553, 10243, 33071.0f);
                        gl10.glTexEnvf(8960, 8704, 7681.0f);
                        GLUtils.texImage2D(3553, 0, bitmap, 0);
                        this.f24337c.set(nextClearBit);
                    }
                    int glGetError = gl10.glGetError();
                    if (glGetError != 0) {
                        String str = "glError: ";
                        String valueOf = String.valueOf(Integer.toString(glGetError));
                        throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                    this.f24336b.set(nextClearBit);
                    m22108b(c4946s, Integer.valueOf(nextClearBit));
                }
                bitmap.recycle();
            } catch (Throwable th) {
                bitmap.recycle();
            }
        }
    }
}
