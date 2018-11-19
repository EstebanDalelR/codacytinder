package com.google.android.m4b.maps.bx;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bh.C4784a;
import com.google.android.m4b.maps.bx.C5032y.C5023d;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bx.z */
public class C5039z extends TextureView implements SurfaceTextureListener {
    /* renamed from: a */
    private static final C5037h f18626a = new C5037h();
    /* renamed from: b */
    private final WeakReference<C5039z> f18627b = new WeakReference(this);
    /* renamed from: c */
    private C5036g f18628c;
    /* renamed from: d */
    private ai f18629d;
    /* renamed from: e */
    private boolean f18630e;
    /* renamed from: f */
    private C5023d f18631f;
    /* renamed from: g */
    private C5033d f18632g;
    /* renamed from: h */
    private C5034e f18633h;
    /* renamed from: i */
    private boolean f18634i;
    /* renamed from: j */
    private boolean f18635j;

    /* renamed from: com.google.android.m4b.maps.bx.z$d */
    public interface C5033d {
        /* renamed from: a */
        EGLContext mo5245a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        /* renamed from: a */
        void mo5246a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* renamed from: com.google.android.m4b.maps.bx.z$e */
    public interface C5034e {
        /* renamed from: a */
        EGLSurface m22491a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (EGL10 egl102) {
                if (C4728u.m21050a("GLTextureView", 6) != null) {
                    Log.e("GLTextureView", "eglCreateWindowSurface", egl102);
                }
                return null;
            }
        }

        /* renamed from: a */
        void m22492a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        private C5034e() {
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.z$f */
    static class C5035f {
        /* renamed from: a */
        EGL10 f18593a;
        /* renamed from: b */
        EGLDisplay f18594b;
        /* renamed from: c */
        EGLSurface f18595c;
        /* renamed from: d */
        EGLConfig f18596d;
        /* renamed from: e */
        private WeakReference<C5039z> f18597e;
        /* renamed from: f */
        private EGLContext f18598f;

        public C5035f(WeakReference<C5039z> weakReference) {
            this.f18597e = weakReference;
        }

        /* renamed from: a */
        public final void m22497a() {
            C4784a.m21186a();
            this.f18593a = (EGL10) EGLContext.getEGL();
            this.f18594b = this.f18593a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.f18594b == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (this.f18593a.eglInitialize(this.f18594b, new int[2])) {
                C5039z c5039z = (C5039z) this.f18597e.get();
                if (c5039z == null) {
                    this.f18596d = null;
                    this.f18598f = null;
                } else {
                    this.f18596d = c5039z.f18631f.mo5242a(this.f18593a, this.f18594b);
                    this.f18598f = c5039z.f18632g.mo5245a(this.f18593a, this.f18594b, this.f18596d);
                }
                if (this.f18598f == null || this.f18598f == EGL10.EGL_NO_CONTEXT) {
                    this.f18598f = null;
                    C5035f.m22493a("createContext", this.f18593a.eglGetError());
                }
                this.f18595c = null;
                C4784a.m21187b();
                return;
            }
            throw new RuntimeException("eglInitialize failed");
        }

        /* renamed from: b */
        public final boolean m22498b() {
            if (this.f18593a == null) {
                throw new RuntimeException("egl not initialized");
            } else if (this.f18594b == null) {
                throw new RuntimeException("eglDisplay not initialized");
            } else if (this.f18596d == null) {
                throw new RuntimeException("mEglConfig not initialized");
            } else {
                m22496f();
                C5039z c5039z = (C5039z) this.f18597e.get();
                if (c5039z != null) {
                    this.f18595c = c5039z.f18633h.m22491a(this.f18593a, this.f18594b, this.f18596d, c5039z.getSurfaceTexture());
                } else {
                    this.f18595c = null;
                }
                if (this.f18595c != null) {
                    if (this.f18595c != EGL10.EGL_NO_SURFACE) {
                        if (this.f18593a.eglMakeCurrent(this.f18594b, this.f18595c, this.f18595c, this.f18598f)) {
                            return true;
                        }
                        C5035f.m22494a("EGLHelper", "eglMakeCurrent", this.f18593a.eglGetError());
                        return false;
                    }
                }
                if (this.f18593a.eglGetError() == 12299 && C4728u.m21050a("EglHelper", 6)) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
        }

        /* renamed from: c */
        final GL m22499c() {
            GL gl = this.f18598f.getGL();
            C5039z c5039z = (C5039z) this.f18597e.get();
            if (c5039z == null) {
                return gl;
            }
            if (null != null) {
                gl = null.m22466a();
            }
            if ((0 & 3) == 0) {
                return gl;
            }
            int i = 0;
            Writer writer = null;
            if ((0 & 1) != 0) {
                i = 1;
            }
            if ((0 & 2) != 0) {
                writer = new C5038i();
            }
            return GLDebugHelper.wrap(gl, i, writer);
        }

        /* renamed from: d */
        public final void m22500d() {
            m22496f();
        }

        /* renamed from: f */
        private void m22496f() {
            if (this.f18595c != null && this.f18595c != EGL10.EGL_NO_SURFACE) {
                this.f18593a.eglMakeCurrent(this.f18594b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                C5039z c5039z = (C5039z) this.f18597e.get();
                if (c5039z != null) {
                    c5039z.f18633h.m22492a(this.f18593a, this.f18594b, this.f18595c);
                }
                this.f18595c = null;
            }
        }

        /* renamed from: e */
        public final void m22501e() {
            if (this.f18598f != null) {
                C5039z c5039z = (C5039z) this.f18597e.get();
                if (c5039z != null) {
                    c5039z.f18632g.mo5246a(this.f18593a, this.f18594b, this.f18598f);
                }
                this.f18598f = null;
            }
            if (this.f18594b != null) {
                this.f18593a.eglTerminate(this.f18594b);
                this.f18594b = null;
            }
        }

        /* renamed from: a */
        public static void m22493a(String str, int i) {
            throw new RuntimeException(C5035f.m22495b(str, i));
        }

        /* renamed from: a */
        public static void m22494a(String str, String str2, int i) {
            if (C4728u.m21050a(str, 5)) {
                Log.w(str, C5035f.m22495b(str2, i));
            }
        }

        /* renamed from: b */
        private static String m22495b(String str, int i) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 20);
            stringBuilder.append(str);
            stringBuilder.append(" failed: ");
            stringBuilder.append(i);
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.z$g */
    static class C5036g extends Thread {
        /* renamed from: a */
        private boolean f18599a;
        /* renamed from: b */
        private boolean f18600b;
        /* renamed from: c */
        private boolean f18601c;
        /* renamed from: d */
        private boolean f18602d;
        /* renamed from: e */
        private boolean f18603e;
        /* renamed from: f */
        private boolean f18604f;
        /* renamed from: g */
        private boolean f18605g;
        /* renamed from: h */
        private boolean f18606h;
        /* renamed from: i */
        private boolean f18607i;
        /* renamed from: j */
        private boolean f18608j;
        /* renamed from: k */
        private int f18609k = 0;
        /* renamed from: l */
        private int f18610l = 0;
        /* renamed from: m */
        private int f18611m = 1;
        /* renamed from: n */
        private boolean f18612n = true;
        /* renamed from: o */
        private boolean f18613o;
        /* renamed from: p */
        private ArrayList<Runnable> f18614p = new ArrayList();
        /* renamed from: q */
        private boolean f18615q = true;
        /* renamed from: r */
        private C5035f f18616r;
        /* renamed from: s */
        private WeakReference<C5039z> f18617s;

        C5036g(WeakReference<C5039z> weakReference) {
            this.f18617s = weakReference;
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r4.getId();
            r2 = new java.lang.StringBuilder;
            r3 = 29;
            r2.<init>(r3);
            r3 = "GLThread ";
            r2.append(r3);
            r2.append(r0);
            r0 = r2.toString();
            r4.setName(r0);
            r4.m22505l();	 Catch:{ InterruptedException -> 0x001d, RuntimeException -> 0x002c, Exception -> 0x0027 }
        L_0x001d:
            r0 = com.google.android.m4b.maps.bx.C5039z.f18626a;
            r0.m22519a(r4);
            return;
        L_0x0025:
            r0 = move-exception;
            goto L_0x002e;
        L_0x0027:
            r0 = move-exception;
            r0.printStackTrace();	 Catch:{ all -> 0x0025 }
            goto L_0x001d;	 Catch:{ all -> 0x0025 }
        L_0x002c:
            r0 = move-exception;	 Catch:{ all -> 0x0025 }
            throw r0;	 Catch:{ all -> 0x0025 }
        L_0x002e:
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;
            r1.m22519a(r4);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.z.g.run():void");
        }

        /* renamed from: j */
        private void m22503j() {
            if (this.f18607i) {
                this.f18607i = false;
                this.f18616r.m22500d();
            }
        }

        /* renamed from: k */
        private void m22504k() {
            if (this.f18606h) {
                this.f18616r.m22501e();
                this.f18606h = false;
                C5039z.f18626a.m22524c(this);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: l */
        private void m22505l() {
            /*
            r19 = this;
            r1 = r19;
            r2 = new com.google.android.m4b.maps.bx.z$f;
            r3 = r1.f18617s;
            r2.<init>(r3);
            r1.f18616r = r2;
            r2 = 0;
            r1.f18606h = r2;
            r1.f18607i = r2;
            r4 = 0;
            r5 = 0;
            r6 = 0;
            r7 = 0;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 0;
            r13 = 0;
            r14 = 0;
            r15 = 0;
        L_0x001c:
            r16 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x022b }
            monitor-enter(r16);	 Catch:{ all -> 0x022b }
        L_0x0021:
            r3 = r1.f18599a;	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x0037;
        L_0x0025:
            monitor-exit(r16);	 Catch:{ all -> 0x0227 }
            r2 = com.google.android.m4b.maps.bx.C5039z.f18626a;
            monitor-enter(r2);
            r19.m22503j();	 Catch:{ all -> 0x0033 }
            r19.m22504k();	 Catch:{ all -> 0x0033 }
            monitor-exit(r2);	 Catch:{ all -> 0x0033 }
            return;
        L_0x0033:
            r0 = move-exception;
            r3 = r0;
            monitor-exit(r2);	 Catch:{ all -> 0x0033 }
            throw r3;
        L_0x0037:
            r3 = r1.f18614p;	 Catch:{ all -> 0x0227 }
            r3 = r3.isEmpty();	 Catch:{ all -> 0x0227 }
            if (r3 != 0) goto L_0x004c;
        L_0x003f:
            r3 = r1.f18614p;	 Catch:{ all -> 0x0227 }
            r10 = 0;
            r3 = r3.remove(r10);	 Catch:{ all -> 0x0227 }
            r3 = (java.lang.Runnable) r3;	 Catch:{ all -> 0x0227 }
            r10 = r3;
            r3 = 0;
            goto L_0x0154;
        L_0x004c:
            r3 = r1.f18602d;	 Catch:{ all -> 0x0227 }
            r2 = r1.f18601c;	 Catch:{ all -> 0x0227 }
            if (r3 == r2) goto L_0x0060;
        L_0x0052:
            r2 = r1.f18601c;	 Catch:{ all -> 0x0227 }
            r3 = r1.f18601c;	 Catch:{ all -> 0x0227 }
            r1.f18602d = r3;	 Catch:{ all -> 0x0227 }
            r3 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0227 }
            r3.notifyAll();	 Catch:{ all -> 0x0227 }
            goto L_0x0061;
        L_0x0060:
            r2 = 0;
        L_0x0061:
            r3 = r1.f18608j;	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x006f;
        L_0x0065:
            r19.m22503j();	 Catch:{ all -> 0x0227 }
            r19.m22504k();	 Catch:{ all -> 0x0227 }
            r3 = 0;
            r1.f18608j = r3;	 Catch:{ all -> 0x0227 }
            r5 = 1;
        L_0x006f:
            if (r6 == 0) goto L_0x0078;
        L_0x0071:
            r19.m22503j();	 Catch:{ all -> 0x0227 }
            r19.m22504k();	 Catch:{ all -> 0x0227 }
            r6 = 0;
        L_0x0078:
            if (r2 == 0) goto L_0x0081;
        L_0x007a:
            r3 = r1.f18607i;	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x0081;
        L_0x007e:
            r19.m22503j();	 Catch:{ all -> 0x0227 }
        L_0x0081:
            if (r2 == 0) goto L_0x00a6;
        L_0x0083:
            r3 = r1.f18606h;	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x00a6;
        L_0x0087:
            r3 = r1.f18617s;	 Catch:{ all -> 0x0227 }
            r3 = r3.get();	 Catch:{ all -> 0x0227 }
            r3 = (com.google.android.m4b.maps.bx.C5039z) r3;	 Catch:{ all -> 0x0227 }
            if (r3 != 0) goto L_0x0093;
        L_0x0091:
            r3 = 0;
            goto L_0x0097;
        L_0x0093:
            r3 = r3.f18634i;	 Catch:{ all -> 0x0227 }
        L_0x0097:
            if (r3 == 0) goto L_0x00a3;
        L_0x0099:
            r3 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0227 }
            r3 = r3.m22521a();	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x00a6;
        L_0x00a3:
            r19.m22504k();	 Catch:{ all -> 0x0227 }
        L_0x00a6:
            if (r2 == 0) goto L_0x00b7;
        L_0x00a8:
            r2 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0227 }
            r2 = r2.m22522b();	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x00b7;
        L_0x00b2:
            r2 = r1.f18616r;	 Catch:{ all -> 0x0227 }
            r2.m22501e();	 Catch:{ all -> 0x0227 }
        L_0x00b7:
            r2 = r1.f18603e;	 Catch:{ all -> 0x0227 }
            if (r2 != 0) goto L_0x00d3;
        L_0x00bb:
            r2 = r1.f18605g;	 Catch:{ all -> 0x0227 }
            if (r2 != 0) goto L_0x00d3;
        L_0x00bf:
            r2 = r1.f18607i;	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x00c6;
        L_0x00c3:
            r19.m22503j();	 Catch:{ all -> 0x0227 }
        L_0x00c6:
            r2 = 1;
            r1.f18605g = r2;	 Catch:{ all -> 0x0227 }
            r2 = 0;
            r1.f18604f = r2;	 Catch:{ all -> 0x0227 }
            r2 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0227 }
            r2.notifyAll();	 Catch:{ all -> 0x0227 }
        L_0x00d3:
            r2 = r1.f18603e;	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x00e5;
        L_0x00d7:
            r2 = r1.f18605g;	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x00e5;
        L_0x00db:
            r2 = 0;
            r1.f18605g = r2;	 Catch:{ all -> 0x0227 }
            r2 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0227 }
            r2.notifyAll();	 Catch:{ all -> 0x0227 }
        L_0x00e5:
            if (r4 == 0) goto L_0x00f3;
        L_0x00e7:
            r2 = 1;
            r1.f18613o = r2;	 Catch:{ all -> 0x0227 }
            r2 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0227 }
            r2.notifyAll();	 Catch:{ all -> 0x0227 }
            r4 = 0;
            r15 = 0;
        L_0x00f3:
            r2 = r19.m22506m();	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x021d;
        L_0x00f9:
            r2 = r1.f18606h;	 Catch:{ all -> 0x0227 }
            if (r2 != 0) goto L_0x0126;
        L_0x00fd:
            if (r5 == 0) goto L_0x0101;
        L_0x00ff:
            r5 = 0;
            goto L_0x0126;
        L_0x0101:
            r2 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0227 }
            r2 = r2.m22523b(r1);	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x0126;
        L_0x010b:
            r2 = r1.f18616r;	 Catch:{ RuntimeException -> 0x011c }
            r2.m22497a();	 Catch:{ RuntimeException -> 0x011c }
            r2 = 1;
            r1.f18606h = r2;	 Catch:{ all -> 0x0227 }
            r2 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0227 }
            r2.notifyAll();	 Catch:{ all -> 0x0227 }
            r11 = 1;
            goto L_0x0126;
        L_0x011c:
            r0 = move-exception;
            r2 = r0;
            r3 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0227 }
            r3.m22524c(r1);	 Catch:{ all -> 0x0227 }
            throw r2;	 Catch:{ all -> 0x0227 }
        L_0x0126:
            r2 = r1.f18606h;	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x0135;
        L_0x012a:
            r2 = r1.f18607i;	 Catch:{ all -> 0x0227 }
            if (r2 != 0) goto L_0x0135;
        L_0x012e:
            r2 = 1;
            r1.f18607i = r2;	 Catch:{ all -> 0x0227 }
            r2 = 1;
            r13 = 1;
            r14 = 1;
            goto L_0x0136;
        L_0x0135:
            r2 = r12;
        L_0x0136:
            r3 = r1.f18607i;	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x021c;
        L_0x013a:
            r3 = r1.f18615q;	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x0149;
        L_0x013e:
            r8 = r1.f18609k;	 Catch:{ all -> 0x0227 }
            r9 = r1.f18610l;	 Catch:{ all -> 0x0227 }
            r3 = 0;
            r1.f18615q = r3;	 Catch:{ all -> 0x0227 }
            r2 = 1;
            r14 = 1;
            r15 = 1;
            goto L_0x014a;
        L_0x0149:
            r3 = 0;
        L_0x014a:
            r1.f18612n = r3;	 Catch:{ all -> 0x0227 }
            r12 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0227 }
            r12.notifyAll();	 Catch:{ all -> 0x0227 }
            r12 = r2;
        L_0x0154:
            monitor-exit(r16);	 Catch:{ all -> 0x0227 }
            if (r10 == 0) goto L_0x015e;
        L_0x0157:
            r10.run();	 Catch:{ all -> 0x022b }
            r2 = 0;
            r10 = 0;
            goto L_0x001c;
        L_0x015e:
            if (r12 == 0) goto L_0x0180;
        L_0x0160:
            r2 = r1.f18616r;	 Catch:{ all -> 0x022b }
            r2 = r2.m22498b();	 Catch:{ all -> 0x022b }
            if (r2 != 0) goto L_0x017f;
        L_0x0168:
            r2 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x022b }
            monitor-enter(r2);	 Catch:{ all -> 0x022b }
            r3 = 1;
            r1.f18604f = r3;	 Catch:{ all -> 0x017b }
            r3 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x017b }
            r3.notifyAll();	 Catch:{ all -> 0x017b }
            monitor-exit(r2);	 Catch:{ all -> 0x017b }
        L_0x0178:
            r2 = 0;
            goto L_0x001c;
        L_0x017b:
            r0 = move-exception;
            r3 = r0;
            monitor-exit(r2);	 Catch:{ all -> 0x017b }
            throw r3;	 Catch:{ all -> 0x022b }
        L_0x017f:
            r12 = 0;
        L_0x0180:
            if (r13 == 0) goto L_0x0193;
        L_0x0182:
            r2 = r1.f18616r;	 Catch:{ all -> 0x022b }
            r2 = r2.m22499c();	 Catch:{ all -> 0x022b }
            r2 = (javax.microedition.khronos.opengles.GL10) r2;	 Catch:{ all -> 0x022b }
            r3 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x022b }
            r3.m22520a(r2);	 Catch:{ all -> 0x022b }
            r7 = r2;
            r13 = 0;
        L_0x0193:
            if (r11 == 0) goto L_0x01a7;
        L_0x0195:
            r2 = r1.f18617s;	 Catch:{ all -> 0x022b }
            r2 = r2.get();	 Catch:{ all -> 0x022b }
            r2 = (com.google.android.m4b.maps.bx.C5039z) r2;	 Catch:{ all -> 0x022b }
            if (r2 == 0) goto L_0x01a6;
        L_0x019f:
            r2 = r2.f18629d;	 Catch:{ all -> 0x022b }
            r2.mo5211a(r7);	 Catch:{ all -> 0x022b }
        L_0x01a6:
            r11 = 0;
        L_0x01a7:
            if (r14 == 0) goto L_0x01bb;
        L_0x01a9:
            r2 = r1.f18617s;	 Catch:{ all -> 0x022b }
            r2 = r2.get();	 Catch:{ all -> 0x022b }
            r2 = (com.google.android.m4b.maps.bx.C5039z) r2;	 Catch:{ all -> 0x022b }
            if (r2 == 0) goto L_0x01ba;
        L_0x01b3:
            r2 = r2.f18629d;	 Catch:{ all -> 0x022b }
            r2.mo5212a(r7, r8, r9);	 Catch:{ all -> 0x022b }
        L_0x01ba:
            r14 = 0;
        L_0x01bb:
            r2 = r1.f18617s;	 Catch:{ all -> 0x022b }
            r2 = r2.get();	 Catch:{ all -> 0x022b }
            r2 = (com.google.android.m4b.maps.bx.C5039z) r2;	 Catch:{ all -> 0x022b }
            if (r2 == 0) goto L_0x01cc;
        L_0x01c5:
            r2 = r2.f18629d;	 Catch:{ all -> 0x022b }
            r2.mo5213b(r7);	 Catch:{ all -> 0x022b }
        L_0x01cc:
            java.lang.System.nanoTime();	 Catch:{ all -> 0x022b }
            r2 = r1.f18616r;	 Catch:{ all -> 0x022b }
            r3 = r2.f18593a;	 Catch:{ all -> 0x022b }
            r17 = r4;
            r4 = r2.f18594b;	 Catch:{ all -> 0x022b }
            r18 = r5;
            r5 = r2.f18595c;	 Catch:{ all -> 0x022b }
            r3 = r3.eglSwapBuffers(r4, r5);	 Catch:{ all -> 0x022b }
            r4 = 12288; // 0x3000 float:1.7219E-41 double:6.071E-320;
            if (r3 != 0) goto L_0x01ea;
        L_0x01e3:
            r2 = r2.f18593a;	 Catch:{ all -> 0x022b }
            r2 = r2.eglGetError();	 Catch:{ all -> 0x022b }
            goto L_0x01ec;
        L_0x01ea:
            r2 = 12288; // 0x3000 float:1.7219E-41 double:6.071E-320;
        L_0x01ec:
            if (r2 == r4) goto L_0x0211;
        L_0x01ee:
            r3 = 12302; // 0x300e float:1.7239E-41 double:6.078E-320;
            if (r2 == r3) goto L_0x020e;
        L_0x01f2:
            r3 = "GLThread";
            r4 = "eglSwapBuffers";
            com.google.android.m4b.maps.bx.C5039z.C5035f.m22494a(r3, r4, r2);	 Catch:{ all -> 0x022b }
            r2 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x022b }
            monitor-enter(r2);	 Catch:{ all -> 0x022b }
            r3 = 1;
            r1.f18604f = r3;	 Catch:{ all -> 0x020a }
            r4 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x020a }
            r4.notifyAll();	 Catch:{ all -> 0x020a }
            monitor-exit(r2);	 Catch:{ all -> 0x020a }
            goto L_0x0212;
        L_0x020a:
            r0 = move-exception;
            r3 = r0;
            monitor-exit(r2);	 Catch:{ all -> 0x020a }
            throw r3;	 Catch:{ all -> 0x022b }
        L_0x020e:
            r3 = 1;
            r6 = 1;
            goto L_0x0212;
        L_0x0211:
            r3 = 1;
        L_0x0212:
            if (r15 == 0) goto L_0x0216;
        L_0x0214:
            r4 = 1;
            goto L_0x0218;
        L_0x0216:
            r4 = r17;
        L_0x0218:
            r5 = r18;
            goto L_0x0178;
        L_0x021c:
            r12 = r2;
        L_0x021d:
            r2 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0227 }
            r2.wait();	 Catch:{ all -> 0x0227 }
            r2 = 0;
            goto L_0x0021;
        L_0x0227:
            r0 = move-exception;
            r2 = r0;
            monitor-exit(r16);	 Catch:{ all -> 0x0227 }
            throw r2;	 Catch:{ all -> 0x022b }
        L_0x022b:
            r0 = move-exception;
            r2 = r0;
            r3 = com.google.android.m4b.maps.bx.C5039z.f18626a;
            monitor-enter(r3);
            r19.m22503j();	 Catch:{ all -> 0x023a }
            r19.m22504k();	 Catch:{ all -> 0x023a }
            monitor-exit(r3);	 Catch:{ all -> 0x023a }
            throw r2;
        L_0x023a:
            r0 = move-exception;
            r2 = r0;
            monitor-exit(r3);	 Catch:{ all -> 0x023a }
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.z.g.l():void");
        }

        /* renamed from: m */
        private boolean m22506m() {
            return !this.f18602d && this.f18603e && !this.f18604f && this.f18609k > 0 && this.f18610l > 0 && (this.f18612n || this.f18611m == 1);
        }

        /* renamed from: a */
        public final void m22508a(int i) {
            if (i >= 0) {
                if (i <= 1) {
                    synchronized (C5039z.f18626a) {
                        this.f18611m = i;
                        C5039z.f18626a.notifyAll();
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("renderMode");
        }

        /* renamed from: a */
        public final int m22507a() {
            int i;
            synchronized (C5039z.f18626a) {
                i = this.f18611m;
            }
            return i;
        }

        /* renamed from: b */
        public final void m22510b() {
            synchronized (C5039z.f18626a) {
                this.f18612n = true;
                C5039z.f18626a.notifyAll();
            }
        }

        /* renamed from: c */
        public final void m22511c() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = com.google.android.m4b.maps.bx.C5039z.f18626a;
            monitor-enter(r0);
            r1 = 1;
            r2.f18603e = r1;	 Catch:{ all -> 0x0029 }
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0029 }
            r1.notifyAll();	 Catch:{ all -> 0x0029 }
        L_0x000f:
            r1 = r2.f18605g;	 Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0027;	 Catch:{ all -> 0x0029 }
        L_0x0013:
            r1 = r2.f18600b;	 Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027;
        L_0x0017:
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ InterruptedException -> 0x001f }
            r1.wait();	 Catch:{ InterruptedException -> 0x001f }
            goto L_0x000f;
        L_0x001f:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0029 }
            r1.interrupt();	 Catch:{ all -> 0x0029 }
            goto L_0x000f;	 Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r0);	 Catch:{ all -> 0x0029 }
            return;	 Catch:{ all -> 0x0029 }
        L_0x0029:
            r1 = move-exception;	 Catch:{ all -> 0x0029 }
            monitor-exit(r0);	 Catch:{ all -> 0x0029 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.z.g.c():void");
        }

        /* renamed from: d */
        public final void m22512d() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = com.google.android.m4b.maps.bx.C5039z.f18626a;
            monitor-enter(r0);
            r1 = 0;
            r2.f18603e = r1;	 Catch:{ all -> 0x0029 }
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0029 }
            r1.notifyAll();	 Catch:{ all -> 0x0029 }
        L_0x000f:
            r1 = r2.f18605g;	 Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027;	 Catch:{ all -> 0x0029 }
        L_0x0013:
            r1 = r2.f18600b;	 Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027;
        L_0x0017:
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ InterruptedException -> 0x001f }
            r1.wait();	 Catch:{ InterruptedException -> 0x001f }
            goto L_0x000f;
        L_0x001f:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0029 }
            r1.interrupt();	 Catch:{ all -> 0x0029 }
            goto L_0x000f;	 Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r0);	 Catch:{ all -> 0x0029 }
            return;	 Catch:{ all -> 0x0029 }
        L_0x0029:
            r1 = move-exception;	 Catch:{ all -> 0x0029 }
            monitor-exit(r0);	 Catch:{ all -> 0x0029 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.z.g.d():void");
        }

        /* renamed from: e */
        public final void m22513e() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = com.google.android.m4b.maps.bx.C5039z.f18626a;
            monitor-enter(r0);
            r1 = 1;
            r2.f18601c = r1;	 Catch:{ all -> 0x0029 }
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0029 }
            r1.notifyAll();	 Catch:{ all -> 0x0029 }
        L_0x000f:
            r1 = r2.f18600b;	 Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027;	 Catch:{ all -> 0x0029 }
        L_0x0013:
            r1 = r2.f18602d;	 Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027;
        L_0x0017:
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ InterruptedException -> 0x001f }
            r1.wait();	 Catch:{ InterruptedException -> 0x001f }
            goto L_0x000f;
        L_0x001f:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0029 }
            r1.interrupt();	 Catch:{ all -> 0x0029 }
            goto L_0x000f;	 Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r0);	 Catch:{ all -> 0x0029 }
            return;	 Catch:{ all -> 0x0029 }
        L_0x0029:
            r1 = move-exception;	 Catch:{ all -> 0x0029 }
            monitor-exit(r0);	 Catch:{ all -> 0x0029 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.z.g.e():void");
        }

        /* renamed from: f */
        public final void m22514f() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = com.google.android.m4b.maps.bx.C5039z.f18626a;
            monitor-enter(r0);
            r1 = 0;
            r3.f18601c = r1;	 Catch:{ all -> 0x0032 }
            r2 = 1;	 Catch:{ all -> 0x0032 }
            r3.f18612n = r2;	 Catch:{ all -> 0x0032 }
            r3.f18613o = r1;	 Catch:{ all -> 0x0032 }
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0032 }
            r1.notifyAll();	 Catch:{ all -> 0x0032 }
        L_0x0014:
            r1 = r3.f18600b;	 Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030;	 Catch:{ all -> 0x0032 }
        L_0x0018:
            r1 = r3.f18602d;	 Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030;	 Catch:{ all -> 0x0032 }
        L_0x001c:
            r1 = r3.f18613o;	 Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030;
        L_0x0020:
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ InterruptedException -> 0x0028 }
            r1.wait();	 Catch:{ InterruptedException -> 0x0028 }
            goto L_0x0014;
        L_0x0028:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0032 }
            r1.interrupt();	 Catch:{ all -> 0x0032 }
            goto L_0x0014;	 Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0);	 Catch:{ all -> 0x0032 }
            return;	 Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception;	 Catch:{ all -> 0x0032 }
            monitor-exit(r0);	 Catch:{ all -> 0x0032 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.z.g.f():void");
        }

        /* renamed from: a */
        public final void m22509a(int r3, int r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = com.google.android.m4b.maps.bx.C5039z.f18626a;
            monitor-enter(r0);
            r2.f18609k = r3;	 Catch:{ all -> 0x0049 }
            r2.f18610l = r4;	 Catch:{ all -> 0x0049 }
            r3 = 1;	 Catch:{ all -> 0x0049 }
            r2.f18615q = r3;	 Catch:{ all -> 0x0049 }
            r2.f18612n = r3;	 Catch:{ all -> 0x0049 }
            r4 = 0;	 Catch:{ all -> 0x0049 }
            r2.f18613o = r4;	 Catch:{ all -> 0x0049 }
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0049 }
            r1.notifyAll();	 Catch:{ all -> 0x0049 }
        L_0x0018:
            r1 = r2.f18600b;	 Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0047;	 Catch:{ all -> 0x0049 }
        L_0x001c:
            r1 = r2.f18602d;	 Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0047;	 Catch:{ all -> 0x0049 }
        L_0x0020:
            r1 = r2.f18613o;	 Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0047;	 Catch:{ all -> 0x0049 }
        L_0x0024:
            r1 = r2.f18606h;	 Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0034;	 Catch:{ all -> 0x0049 }
        L_0x0028:
            r1 = r2.f18607i;	 Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0034;	 Catch:{ all -> 0x0049 }
        L_0x002c:
            r1 = r2.m22506m();	 Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0034;
        L_0x0032:
            r1 = 1;
            goto L_0x0035;
        L_0x0034:
            r1 = 0;
        L_0x0035:
            if (r1 == 0) goto L_0x0047;
        L_0x0037:
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ InterruptedException -> 0x003f }
            r1.wait();	 Catch:{ InterruptedException -> 0x003f }
            goto L_0x0018;
        L_0x003f:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0049 }
            r1.interrupt();	 Catch:{ all -> 0x0049 }
            goto L_0x0018;	 Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r0);	 Catch:{ all -> 0x0049 }
            return;	 Catch:{ all -> 0x0049 }
        L_0x0049:
            r3 = move-exception;	 Catch:{ all -> 0x0049 }
            monitor-exit(r0);	 Catch:{ all -> 0x0049 }
            throw r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.z.g.a(int, int):void");
        }

        /* renamed from: g */
        public final void m22515g() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = com.google.android.m4b.maps.bx.C5039z.f18626a;
            monitor-enter(r0);
            r1 = 1;
            r2.f18599a = r1;	 Catch:{ all -> 0x0025 }
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ all -> 0x0025 }
            r1.notifyAll();	 Catch:{ all -> 0x0025 }
        L_0x000f:
            r1 = r2.f18600b;	 Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0023;
        L_0x0013:
            r1 = com.google.android.m4b.maps.bx.C5039z.f18626a;	 Catch:{ InterruptedException -> 0x001b }
            r1.wait();	 Catch:{ InterruptedException -> 0x001b }
            goto L_0x000f;
        L_0x001b:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0025 }
            r1.interrupt();	 Catch:{ all -> 0x0025 }
            goto L_0x000f;	 Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r0);	 Catch:{ all -> 0x0025 }
            return;	 Catch:{ all -> 0x0025 }
        L_0x0025:
            r1 = move-exception;	 Catch:{ all -> 0x0025 }
            monitor-exit(r0);	 Catch:{ all -> 0x0025 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.z.g.g():void");
        }

        /* renamed from: h */
        public final boolean m22516h() {
            boolean z;
            synchronized (C5039z.f18626a) {
                z = this.f18600b;
            }
            return z;
        }

        /* renamed from: i */
        public final void m22517i() {
            this.f18608j = true;
            C5039z.f18626a.notifyAll();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.z$h */
    static class C5037h {
        /* renamed from: a */
        private static String f18618a = "GLThreadManager";
        /* renamed from: b */
        private boolean f18619b;
        /* renamed from: c */
        private int f18620c;
        /* renamed from: d */
        private boolean f18621d;
        /* renamed from: e */
        private boolean f18622e;
        /* renamed from: f */
        private boolean f18623f;
        /* renamed from: g */
        private C5036g f18624g;

        private C5037h() {
        }

        /* renamed from: a */
        public final synchronized void m22519a(C5036g c5036g) {
            c5036g.f18600b = true;
            if (this.f18624g == c5036g) {
                this.f18624g = null;
            }
            notifyAll();
        }

        /* renamed from: b */
        public final boolean m22523b(C5036g c5036g) {
            if (this.f18624g != c5036g) {
                if (this.f18624g != null) {
                    m22518c();
                    if (this.f18622e != null) {
                        return true;
                    }
                    if (this.f18624g != null) {
                        this.f18624g.m22517i();
                    }
                    return null;
                }
            }
            this.f18624g = c5036g;
            notifyAll();
            return true;
        }

        /* renamed from: c */
        public final void m22524c(C5036g c5036g) {
            if (this.f18624g == c5036g) {
                this.f18624g = null;
            }
            notifyAll();
        }

        /* renamed from: a */
        public final synchronized boolean m22521a() {
            return this.f18623f;
        }

        /* renamed from: b */
        public final synchronized boolean m22522b() {
            m22518c();
            return !this.f18622e;
        }

        /* renamed from: a */
        public final synchronized void m22520a(GL10 gl10) {
            if (!this.f18621d) {
                m22518c();
                gl10 = gl10.glGetString(7937);
                if (this.f18620c < 131072) {
                    this.f18622e = gl10.startsWith("Q3Dimension MSM7500 ") ^ true;
                    notifyAll();
                }
                if (this.f18622e) {
                    if (gl10.startsWith("Adreno") == null || VERSION.SDK_INT >= 11) {
                        gl10 = null;
                        this.f18623f = gl10;
                        this.f18621d = true;
                    }
                }
                gl10 = true;
                this.f18623f = gl10;
                this.f18621d = true;
            }
        }

        /* renamed from: c */
        private void m22518c() {
            if (!this.f18619b) {
                this.f18620c = 131072;
                if (this.f18620c >= 131072) {
                    this.f18622e = true;
                }
                this.f18619b = true;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.z$i */
    static class C5038i extends Writer {
        /* renamed from: a */
        private StringBuilder f18625a = new StringBuilder();

        C5038i() {
        }

        public final void close() {
            m22525a();
        }

        public final void flush() {
            m22525a();
        }

        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m22525a();
                } else {
                    this.f18625a.append(c);
                }
            }
        }

        /* renamed from: a */
        private void m22525a() {
            if (this.f18625a.length() > 0) {
                if (C4728u.m21050a("GLTextureView", 2)) {
                    Log.v("GLTextureView", this.f18625a.toString());
                }
                this.f18625a.delete(0, this.f18625a.length());
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.z$a */
    abstract class C6567a implements C5023d {
        /* renamed from: a */
        private int[] f24554a;
        /* renamed from: b */
        private /* synthetic */ C5039z f24555b;

        /* renamed from: a */
        abstract EGLConfig mo7108a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public C6567a(C5039z c5039z, int[] iArr) {
            this.f24555b = c5039z;
            if (0 == 2) {
                c5039z = iArr.length;
                Object obj = new int[(c5039z + 2)];
                int i = c5039z - 1;
                System.arraycopy(iArr, 0, obj, 0, i);
                obj[i] = 12352;
                obj[c5039z] = 4;
                obj[c5039z + 1] = 12344;
                iArr = obj;
            }
            this.f24554a = iArr;
        }

        /* renamed from: a */
        public final EGLConfig mo5242a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.f24554a, null, 0, iArr)) {
                int i = iArr[0];
                if (i <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                if (egl10.eglChooseConfig(eGLDisplay, this.f24554a, eGLConfigArr, i, iArr)) {
                    egl10 = mo7108a(egl10, eGLDisplay, eGLConfigArr);
                    if (egl10 != null) {
                        return egl10;
                    }
                    throw new IllegalArgumentException("No config chosen");
                }
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.z$c */
    class C6568c implements C5033d {
        /* renamed from: a */
        private int f24556a;
        /* renamed from: b */
        private /* synthetic */ C5039z f24557b;

        private C6568c(C5039z c5039z) {
            this.f24557b = c5039z;
            this.f24556a = 12440;
        }

        /* renamed from: a */
        public final EGLContext mo5245a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = new int[]{this.f24556a, 0, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (0 == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        /* renamed from: a */
        public final void mo5246a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                if (C4728u.m21050a("DefaultContextFactory", 6)) {
                    eGLDisplay = String.valueOf(eGLDisplay);
                    eGLContext = String.valueOf(eGLContext);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(eGLDisplay).length() + 18) + String.valueOf(eGLContext).length());
                    stringBuilder.append("display:");
                    stringBuilder.append(eGLDisplay);
                    stringBuilder.append(" context: ");
                    stringBuilder.append(eGLContext);
                    Log.e("DefaultContextFactory", stringBuilder.toString());
                }
                C5035f.m22493a("eglDestroyContex", egl10.eglGetError());
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.z$b */
    class C7487b extends C6567a {
        /* renamed from: a */
        private int[] f27633a = new int[1];
        /* renamed from: b */
        private int f27634b = 5;
        /* renamed from: c */
        private int f27635c = 6;
        /* renamed from: d */
        private int f27636d = 5;
        /* renamed from: e */
        private int f27637e = 0;
        /* renamed from: f */
        private int f27638f;
        /* renamed from: g */
        private int f27639g;
        /* renamed from: h */
        private /* synthetic */ C5039z f27640h;

        public C7487b(C5039z c5039z, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f27640h = c5039z;
            super(c5039z, new int[]{12324, 5, 12323, 6, 12322, 5, 12321, null, 12325, i5, 12326, null, 12344});
            this.f27638f = i5;
            this.f27639g = 0;
        }

        /* renamed from: a */
        public final EGLConfig mo7108a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                EGLConfig eGLConfig2 = eGLConfig;
                int a = m32531a(egl102, eGLDisplay2, eGLConfig2, 12325, 0);
                int a2 = m32531a(egl102, eGLDisplay2, eGLConfig2, 12326, 0);
                if (a >= this.f27638f && a2 >= this.f27639g) {
                    egl102 = egl10;
                    eGLDisplay2 = eGLDisplay;
                    eGLConfig2 = eGLConfig;
                    a = m32531a(egl102, eGLDisplay2, eGLConfig2, 12324, 0);
                    int a3 = m32531a(egl102, eGLDisplay2, eGLConfig2, 12323, 0);
                    int a4 = m32531a(egl102, eGLDisplay2, eGLConfig2, 12322, 0);
                    a2 = m32531a(egl102, eGLDisplay2, eGLConfig2, 12321, 0);
                    if (a == this.f27634b && a3 == this.f27635c && a4 == this.f27636d && a2 == this.f27637e) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        private int m32531a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f27633a) != null) {
                return this.f27633a[0];
            }
            return 0;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.z$j */
    class C8078j extends C7487b {
        /* renamed from: a */
        private /* synthetic */ C5039z f28978a;

        public C8078j(C5039z c5039z, boolean z) {
            this.f28978a = c5039z;
            super(c5039z, 5, 6, 5, 0, 16, 0);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C5039z(Context context) {
        super(context);
        setSurfaceTextureListener(this);
    }

    protected void finalize() {
        try {
            if (this.f18628c != null) {
                this.f18628c.m22515g();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    /* renamed from: i */
    public final void m22539i(boolean z) {
        this.f18634i = true;
    }

    /* renamed from: j */
    public final void m22540j(boolean z) {
        this.f18635j = z;
        if (!z && this.f18630e && this.f18628c && !this.f18628c.m22516h()) {
            this.f18628c.m22515g();
        }
    }

    /* renamed from: a */
    public final void m22536a(ai aiVar) {
        mo5225a();
        if (this.f18631f == null) {
            this.f18631f = new C8078j(this, true);
        }
        if (this.f18632g == null) {
            this.f18632g = new C6568c();
        }
        if (this.f18633h == null) {
            this.f18633h = new C5034e();
        }
        this.f18629d = aiVar;
        this.f18628c = new C5036g(this.f18627b);
        this.f18628c.start();
    }

    /* renamed from: a */
    public final void m22537a(C5023d c5023d) {
        mo5225a();
        this.f18631f = c5023d;
    }

    /* renamed from: b */
    public final void m22538b(int i) {
        this.f18628c.m22508a(0);
    }

    /* renamed from: p */
    public void mo5233p() {
        this.f18628c.m22510b();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f18628c.m22511c();
        this.f18628c.m22509a(i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f18628c.m22512d();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f18628c.m22509a(i, i2);
    }

    /* renamed from: r */
    public void mo5235r() {
        this.f18628c.m22513e();
    }

    /* renamed from: s */
    public void mo5236s() {
        this.f18628c.m22514f();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18630e && this.f18629d != null && (this.f18628c == null || this.f18628c.m22516h())) {
            int a = this.f18628c != null ? this.f18628c.m22507a() : 1;
            this.f18628c = new C5036g(this.f18627b);
            if (a != 1) {
                this.f18628c.m22508a(a);
            }
            this.f18628c.start();
        }
        this.f18630e = false;
    }

    protected void onDetachedFromWindow() {
        if (!(this.f18635j || this.f18628c == null)) {
            this.f18628c.m22515g();
        }
        this.f18630e = true;
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void mo5225a() {
        if (this.f18628c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }
}
