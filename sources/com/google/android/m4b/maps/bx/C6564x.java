package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.ba.C4743b;
import com.google.android.m4b.maps.bx.C5032y.C5023d;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: com.google.android.m4b.maps.bx.x */
public final class C6564x implements C5023d {
    /* renamed from: a */
    private int[] f24548a = new int[1];
    /* renamed from: b */
    private final C5022a[] f24549b;

    /* renamed from: com.google.android.m4b.maps.bx.x$a */
    public static class C5022a {
        /* renamed from: a */
        private final int f18542a;
        /* renamed from: b */
        private final int f18543b;
        /* renamed from: c */
        private final int f18544c;
        /* renamed from: d */
        private final int f18545d;
        /* renamed from: e */
        private final int f18546e;
        /* renamed from: f */
        private final int f18547f;
        /* renamed from: g */
        private int[] f18548g;
        /* renamed from: h */
        private boolean f18549h;

        C5022a(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f18548g = null;
            this.f18549h = false;
            this.f18542a = i;
            this.f18543b = i2;
            this.f18544c = i3;
            this.f18545d = i4;
            this.f18546e = i5;
            this.f18547f = i6;
        }

        C5022a(C5022a c5022a) {
            this(c5022a.f18542a, c5022a.f18543b, c5022a.f18544c, c5022a.f18545d, c5022a.f18546e, c5022a.f18547f);
        }

        /* renamed from: a */
        final void m22427a(boolean z) {
            this.f18549h = z;
        }

        /* renamed from: a */
        final int[] m22428a() {
            if (this.f18548g == null) {
                if (r0.f18549h) {
                    r0.f18548g = new int[]{12324, r0.f18542a, 12323, r0.f18543b, 12322, r0.f18544c, 12321, r0.f18545d, 12325, r0.f18546e, 12326, r0.f18547f, 12352, 4, 12344};
                } else {
                    r0.f18548g = new int[]{12324, r0.f18542a, 12323, r0.f18543b, 12322, r0.f18544c, 12321, r0.f18545d, 12325, r0.f18546e, 12326, r0.f18547f, 12344};
                }
            }
            return r0.f18548g;
        }
    }

    public C6564x(C5022a[] c5022aArr) {
        this.f24549b = c5022aArr;
    }

    /* renamed from: a */
    public final EGLConfig mo5242a(EGL10 egl10, EGLDisplay eGLDisplay) {
        boolean z = true;
        int[] iArr = new int[1];
        C5022a c5022a = new C5022a(this.f24549b[0]);
        c5022a.m22427a(true);
        if (egl10.eglChooseConfig(eGLDisplay, c5022a.m22428a(), null, 0, iArr)) {
            if (iArr[0] <= 0) {
                z = false;
            }
            C4743b.m21086a(z);
            EGLConfig eGLConfig = null;
            int i = 0;
            do {
                int[] a = this.f24549b[i].m22428a();
                if (egl10.eglChooseConfig(eGLDisplay, a, null, 0, iArr)) {
                    int i2 = iArr[0];
                    if (i2 > 0) {
                        EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                        if (egl10.eglChooseConfig(eGLDisplay, a, eGLConfigArr, i2, iArr)) {
                            eGLConfig = m29203a(egl10, eGLDisplay, eGLConfigArr, this.f24549b[i]);
                        } else {
                            throw new IllegalArgumentException("eglChooseConfig#2 failed");
                        }
                    }
                    if (eGLConfig != null) {
                        break;
                    }
                    i++;
                } else {
                    throw new IllegalArgumentException("eglChooseConfig failed");
                }
            } while (i < this.f24549b.length);
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new IllegalArgumentException("No config chosen");
        }
        throw new IllegalArgumentException("eglChooseConfig failed");
    }

    /* renamed from: a */
    private int m29202a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f24548a) != null) {
            return this.f24548a[0];
        }
        return 0;
    }

    /* renamed from: a */
    private EGLConfig m29203a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr, C5022a c5022a) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            EGL10 egl102 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            EGLConfig eGLConfig2 = eGLConfig;
            int a = m29202a(egl102, eGLDisplay2, eGLConfig2, 12325, 0);
            int a2 = m29202a(egl102, eGLDisplay2, eGLConfig2, 12326, 0);
            if (a >= c5022a.f18546e && a2 >= c5022a.f18547f) {
                egl102 = egl10;
                eGLDisplay2 = eGLDisplay;
                eGLConfig2 = eGLConfig;
                a = m29202a(egl102, eGLDisplay2, eGLConfig2, 12324, 0);
                int a3 = m29202a(egl102, eGLDisplay2, eGLConfig2, 12323, 0);
                int a4 = m29202a(egl102, eGLDisplay2, eGLConfig2, 12322, 0);
                a2 = m29202a(egl102, eGLDisplay2, eGLConfig2, 12321, 0);
                if (a == c5022a.f18542a && a3 == c5022a.f18543b && a4 == c5022a.f18544c && a2 == c5022a.f18545d) {
                    return eGLConfig;
                }
            }
        }
        return null;
    }
}
