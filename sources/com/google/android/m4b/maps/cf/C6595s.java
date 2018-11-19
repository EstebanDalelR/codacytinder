package com.google.android.m4b.maps.cf;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import com.google.android.m4b.maps.cf.C5108f.C5107a;
import com.google.android.m4b.maps.cf.C5113h.C5112a;

/* renamed from: com.google.android.m4b.maps.cf.s */
public class C6595s extends C5113h {
    /* renamed from: e */
    private C5115k f24735e;
    /* renamed from: f */
    private int[] f24736f;
    /* renamed from: g */
    private volatile int f24737g;
    /* renamed from: h */
    private volatile int f24738h;
    /* renamed from: i */
    private volatile boolean f24739i;
    /* renamed from: j */
    private volatile int f24740j;
    /* renamed from: k */
    private volatile int f24741k;
    /* renamed from: l */
    private volatile boolean f24742l;
    /* renamed from: m */
    private final int f24743m;
    /* renamed from: n */
    private boolean f24744n;
    /* renamed from: o */
    private C5116m f24745o;

    private C6595s(C5115k c5115k) {
        this(null, 0);
    }

    protected C6595s() {
        this(null);
    }

    private C6595s(C5115k c5115k, int i) {
        this(c5115k, 0, false);
    }

    /* renamed from: a */
    protected final void m29464a(C5115k c5115k, boolean z) {
        if (this.b) {
            throw new RuntimeException("Must be called BEFORE set live");
        }
        this.f24744n = z;
        this.f24735e = c5115k;
    }

    /* renamed from: a */
    final boolean mo5295a(C5111g c5111g, C5107a c5107a) {
        c5111g = super.mo5295a(c5111g, c5107a);
        if (c5111g != null) {
            if (c5107a.f18965d) {
                GLES20.glGenTextures(1, this.f24736f, 0);
                GLES20.glBindTexture(3553, this.f24736f[0]);
                this.f24735e.m22804a(c5107a);
                GLES20.glTexParameteri(3553, 10241, this.f24737g);
                GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, this.f24738h);
                GLES20.glTexParameteri(3553, 10242, this.f24740j);
                GLES20.glTexParameteri(3553, 10243, this.f24741k);
                if (this.f24744n != null) {
                    GLES20.glGenerateMipmap(3553);
                }
            } else {
                this.f24735e.m22804a(c5107a);
                GLES20.glDeleteTextures(1, this.f24736f, 0);
            }
        }
        return c5111g;
    }

    /* renamed from: b */
    public final void m29466b(int i, int i2) {
        if (this.b) {
            C6591d.m29456b();
        }
        if ((i == 10497 || i == 33071 || i == 33648) && (i2 == 10497 || i2 == 33071 || i2 == 33648)) {
            this.f24740j = i;
            this.f24741k = i2;
            this.f24742l = true;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(58);
        stringBuilder.append("Illegal Wrap Mode: wrapS = ");
        stringBuilder.append(i);
        stringBuilder.append(" wrapT = ");
        stringBuilder.append(i2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: c */
    public final void m29467c(int i, int i2) {
        if (this.b) {
            C6591d.m29456b();
        }
        if ((i == 9729 || i == 9728 || i == 9987 || i == 9985 || i == 9986 || i == 9984) && (i2 == 9729 || i2 == 9728)) {
            this.f24737g = i;
            this.f24738h = i2;
            this.f24739i = true;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(56);
        stringBuilder.append("Illegal Filter Mode: min = ");
        stringBuilder.append(i);
        stringBuilder.append(" mag = ");
        stringBuilder.append(i2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private C6595s(C5115k c5115k, int i, boolean z) {
        C5112a c5112a;
        switch (i) {
            case 0:
                c5112a = C5112a.TEXTURE0;
                break;
            case 1:
                c5112a = C5112a.TEXTURE1;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(36);
                stringBuilder.append("Unsupported texture unit ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        super(c5112a);
        this.f24735e = null;
        this.f24736f = new int[1];
        this.f24737g = 9728;
        this.f24738h = 9729;
        this.f24739i = false;
        this.f24740j = 10497;
        this.f24741k = 10497;
        this.f24742l = false;
        this.f24744n = false;
        this.f24745o = new C5116m();
        this.f24735e = c5115k;
        this.f24744n = false;
        switch (i) {
            case 0:
                this.f24743m = 33984;
                return;
            case 1:
                this.f24743m = 33985;
                return;
            default:
                stringBuilder = new StringBuilder(36);
                stringBuilder.append("Unsupported texture unit ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
