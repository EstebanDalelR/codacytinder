package com.google.android.m4b.maps.bx;

import android.content.Context;
import android.opengl.GLDebugHelper;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bh.C4784a;
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

/* renamed from: com.google.android.m4b.maps.bx.y */
public class C5032y extends SurfaceView implements Callback {
    /* renamed from: a */
    private static final C5028i f18583a = new C5028i();
    /* renamed from: b */
    private final WeakReference<C5032y> f18584b = new WeakReference(this);
    /* renamed from: c */
    private C5027h f18585c;
    /* renamed from: d */
    private C5031l f18586d;
    /* renamed from: e */
    private boolean f18587e;
    /* renamed from: f */
    private C5023d f18588f;
    /* renamed from: g */
    private C5024e f18589g;
    /* renamed from: h */
    private C5025f f18590h;
    /* renamed from: i */
    private boolean f18591i;
    /* renamed from: j */
    private boolean f18592j;

    /* renamed from: com.google.android.m4b.maps.bx.y$d */
    public interface C5023d {
        /* renamed from: a */
        EGLConfig mo5242a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* renamed from: com.google.android.m4b.maps.bx.y$e */
    public interface C5024e {
        /* renamed from: a */
        EGLContext mo5243a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        /* renamed from: a */
        void mo5244a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* renamed from: com.google.android.m4b.maps.bx.y$f */
    public interface C5025f {
        /* renamed from: a */
        EGLSurface m22432a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (EGL10 egl102) {
                if (C4728u.m21050a("GLSurfaceView", 6) != null) {
                    Log.e("GLSurfaceView", "eglCreateWindowSurface", egl102);
                }
                return null;
            }
        }

        /* renamed from: a */
        void m22433a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        private C5025f() {
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.y$g */
    static class C5026g {
        /* renamed from: a */
        EGL10 f18550a;
        /* renamed from: b */
        EGLDisplay f18551b;
        /* renamed from: c */
        EGLSurface f18552c;
        /* renamed from: d */
        EGLConfig f18553d;
        /* renamed from: e */
        private WeakReference<C5032y> f18554e;
        /* renamed from: f */
        private EGLContext f18555f;

        public C5026g(WeakReference<C5032y> weakReference) {
            this.f18554e = weakReference;
        }

        /* renamed from: a */
        public final void m22438a() {
            C4784a.m21186a();
            this.f18550a = (EGL10) EGLContext.getEGL();
            this.f18551b = this.f18550a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.f18551b == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (this.f18550a.eglInitialize(this.f18551b, new int[2])) {
                C5032y c5032y = (C5032y) this.f18554e.get();
                if (c5032y == null) {
                    this.f18553d = null;
                    this.f18555f = null;
                } else {
                    this.f18553d = c5032y.f18588f.mo5242a(this.f18550a, this.f18551b);
                    this.f18555f = c5032y.f18589g.mo5243a(this.f18550a, this.f18551b, this.f18553d);
                }
                if (this.f18555f == null || this.f18555f == EGL10.EGL_NO_CONTEXT) {
                    this.f18555f = null;
                    C5026g.m22434a("createContext", this.f18550a.eglGetError());
                }
                this.f18552c = null;
                C4784a.m21187b();
                return;
            }
            throw new RuntimeException("eglInitialize failed");
        }

        /* renamed from: b */
        public final boolean m22439b() {
            if (this.f18550a == null) {
                throw new RuntimeException("egl not initialized");
            } else if (this.f18551b == null) {
                throw new RuntimeException("eglDisplay not initialized");
            } else if (this.f18553d == null) {
                throw new RuntimeException("mEglConfig not initialized");
            } else {
                m22437f();
                C5032y c5032y = (C5032y) this.f18554e.get();
                if (c5032y != null) {
                    this.f18552c = c5032y.f18590h.m22432a(this.f18550a, this.f18551b, this.f18553d, c5032y.getHolder());
                } else {
                    this.f18552c = null;
                }
                if (this.f18552c != null) {
                    if (this.f18552c != EGL10.EGL_NO_SURFACE) {
                        if (this.f18550a.eglMakeCurrent(this.f18551b, this.f18552c, this.f18552c, this.f18555f)) {
                            return true;
                        }
                        C5026g.m22435a("EGLHelper", "eglMakeCurrent", this.f18550a.eglGetError());
                        return false;
                    }
                }
                if (this.f18550a.eglGetError() == 12299 && C4728u.m21050a("EglHelper", 6)) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
        }

        /* renamed from: c */
        final GL m22440c() {
            GL gl = this.f18555f.getGL();
            C5032y c5032y = (C5032y) this.f18554e.get();
            if (c5032y == null) {
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
                writer = new C5030k();
            }
            return GLDebugHelper.wrap(gl, i, writer);
        }

        /* renamed from: d */
        public final void m22441d() {
            m22437f();
        }

        /* renamed from: f */
        private void m22437f() {
            if (this.f18552c != null && this.f18552c != EGL10.EGL_NO_SURFACE) {
                this.f18550a.eglMakeCurrent(this.f18551b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                C5032y c5032y = (C5032y) this.f18554e.get();
                if (c5032y != null) {
                    c5032y.f18590h.m22433a(this.f18550a, this.f18551b, this.f18552c);
                }
                this.f18552c = null;
            }
        }

        /* renamed from: e */
        public final void m22442e() {
            if (this.f18555f != null) {
                C5032y c5032y = (C5032y) this.f18554e.get();
                if (c5032y != null) {
                    c5032y.f18589g.mo5244a(this.f18550a, this.f18551b, this.f18555f);
                }
                this.f18555f = null;
            }
            if (this.f18551b != null) {
                this.f18550a.eglTerminate(this.f18551b);
                this.f18551b = null;
            }
        }

        /* renamed from: a */
        public static void m22434a(String str, int i) {
            throw new RuntimeException(C5026g.m22436b(str, i));
        }

        /* renamed from: a */
        public static void m22435a(String str, String str2, int i) {
            if (C4728u.m21050a(str, 5)) {
                Log.w(str, C5026g.m22436b(str2, i));
            }
        }

        /* renamed from: b */
        private static String m22436b(String str, int i) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 20);
            stringBuilder.append(str);
            stringBuilder.append(" failed: ");
            stringBuilder.append(i);
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.y$h */
    static class C5027h extends Thread {
        /* renamed from: a */
        private boolean f18556a;
        /* renamed from: b */
        private boolean f18557b;
        /* renamed from: c */
        private boolean f18558c;
        /* renamed from: d */
        private boolean f18559d;
        /* renamed from: e */
        private boolean f18560e;
        /* renamed from: f */
        private boolean f18561f;
        /* renamed from: g */
        private boolean f18562g;
        /* renamed from: h */
        private boolean f18563h;
        /* renamed from: i */
        private boolean f18564i;
        /* renamed from: j */
        private boolean f18565j;
        /* renamed from: k */
        private int f18566k = 0;
        /* renamed from: l */
        private int f18567l = 0;
        /* renamed from: m */
        private int f18568m = 1;
        /* renamed from: n */
        private boolean f18569n = true;
        /* renamed from: o */
        private boolean f18570o;
        /* renamed from: p */
        private ArrayList<Runnable> f18571p = new ArrayList();
        /* renamed from: q */
        private boolean f18572q = true;
        /* renamed from: r */
        private C5026g f18573r;
        /* renamed from: s */
        private WeakReference<C5032y> f18574s;

        C5027h(WeakReference<C5032y> weakReference) {
            this.f18574s = weakReference;
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
            r4.m22446l();	 Catch:{ InterruptedException -> 0x001d, RuntimeException -> 0x002c, Exception -> 0x0027 }
        L_0x001d:
            r0 = com.google.android.m4b.maps.bx.C5032y.f18583a;
            r0.m22460a(r4);
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
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;
            r1.m22460a(r4);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.y.h.run():void");
        }

        /* renamed from: j */
        private void m22444j() {
            if (this.f18564i) {
                this.f18564i = false;
                this.f18573r.m22441d();
            }
        }

        /* renamed from: k */
        private void m22445k() {
            if (this.f18563h) {
                this.f18573r.m22442e();
                this.f18563h = false;
                C5032y.f18583a.m22465c(this);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: l */
        private void m22446l() {
            /*
            r19 = this;
            r1 = r19;
            r2 = new com.google.android.m4b.maps.bx.y$g;
            r3 = r1.f18574s;
            r2.<init>(r3);
            r1.f18573r = r2;
            r2 = 0;
            r1.f18563h = r2;
            r1.f18564i = r2;
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
            r16 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x022b }
            monitor-enter(r16);	 Catch:{ all -> 0x022b }
        L_0x0021:
            r3 = r1.f18556a;	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x0037;
        L_0x0025:
            monitor-exit(r16);	 Catch:{ all -> 0x0227 }
            r2 = com.google.android.m4b.maps.bx.C5032y.f18583a;
            monitor-enter(r2);
            r19.m22444j();	 Catch:{ all -> 0x0033 }
            r19.m22445k();	 Catch:{ all -> 0x0033 }
            monitor-exit(r2);	 Catch:{ all -> 0x0033 }
            return;
        L_0x0033:
            r0 = move-exception;
            r3 = r0;
            monitor-exit(r2);	 Catch:{ all -> 0x0033 }
            throw r3;
        L_0x0037:
            r3 = r1.f18571p;	 Catch:{ all -> 0x0227 }
            r3 = r3.isEmpty();	 Catch:{ all -> 0x0227 }
            if (r3 != 0) goto L_0x004c;
        L_0x003f:
            r3 = r1.f18571p;	 Catch:{ all -> 0x0227 }
            r10 = 0;
            r3 = r3.remove(r10);	 Catch:{ all -> 0x0227 }
            r3 = (java.lang.Runnable) r3;	 Catch:{ all -> 0x0227 }
            r10 = r3;
            r3 = 0;
            goto L_0x0154;
        L_0x004c:
            r3 = r1.f18559d;	 Catch:{ all -> 0x0227 }
            r2 = r1.f18558c;	 Catch:{ all -> 0x0227 }
            if (r3 == r2) goto L_0x0060;
        L_0x0052:
            r2 = r1.f18558c;	 Catch:{ all -> 0x0227 }
            r3 = r1.f18558c;	 Catch:{ all -> 0x0227 }
            r1.f18559d = r3;	 Catch:{ all -> 0x0227 }
            r3 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0227 }
            r3.notifyAll();	 Catch:{ all -> 0x0227 }
            goto L_0x0061;
        L_0x0060:
            r2 = 0;
        L_0x0061:
            r3 = r1.f18565j;	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x006f;
        L_0x0065:
            r19.m22444j();	 Catch:{ all -> 0x0227 }
            r19.m22445k();	 Catch:{ all -> 0x0227 }
            r3 = 0;
            r1.f18565j = r3;	 Catch:{ all -> 0x0227 }
            r5 = 1;
        L_0x006f:
            if (r6 == 0) goto L_0x0078;
        L_0x0071:
            r19.m22444j();	 Catch:{ all -> 0x0227 }
            r19.m22445k();	 Catch:{ all -> 0x0227 }
            r6 = 0;
        L_0x0078:
            if (r2 == 0) goto L_0x0081;
        L_0x007a:
            r3 = r1.f18564i;	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x0081;
        L_0x007e:
            r19.m22444j();	 Catch:{ all -> 0x0227 }
        L_0x0081:
            if (r2 == 0) goto L_0x00a6;
        L_0x0083:
            r3 = r1.f18563h;	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x00a6;
        L_0x0087:
            r3 = r1.f18574s;	 Catch:{ all -> 0x0227 }
            r3 = r3.get();	 Catch:{ all -> 0x0227 }
            r3 = (com.google.android.m4b.maps.bx.C5032y) r3;	 Catch:{ all -> 0x0227 }
            if (r3 != 0) goto L_0x0093;
        L_0x0091:
            r3 = 0;
            goto L_0x0097;
        L_0x0093:
            r3 = r3.f18591i;	 Catch:{ all -> 0x0227 }
        L_0x0097:
            if (r3 == 0) goto L_0x00a3;
        L_0x0099:
            r3 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0227 }
            r3 = r3.m22462a();	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x00a6;
        L_0x00a3:
            r19.m22445k();	 Catch:{ all -> 0x0227 }
        L_0x00a6:
            if (r2 == 0) goto L_0x00b7;
        L_0x00a8:
            r2 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0227 }
            r2 = r2.m22463b();	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x00b7;
        L_0x00b2:
            r2 = r1.f18573r;	 Catch:{ all -> 0x0227 }
            r2.m22442e();	 Catch:{ all -> 0x0227 }
        L_0x00b7:
            r2 = r1.f18560e;	 Catch:{ all -> 0x0227 }
            if (r2 != 0) goto L_0x00d3;
        L_0x00bb:
            r2 = r1.f18562g;	 Catch:{ all -> 0x0227 }
            if (r2 != 0) goto L_0x00d3;
        L_0x00bf:
            r2 = r1.f18564i;	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x00c6;
        L_0x00c3:
            r19.m22444j();	 Catch:{ all -> 0x0227 }
        L_0x00c6:
            r2 = 1;
            r1.f18562g = r2;	 Catch:{ all -> 0x0227 }
            r2 = 0;
            r1.f18561f = r2;	 Catch:{ all -> 0x0227 }
            r2 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0227 }
            r2.notifyAll();	 Catch:{ all -> 0x0227 }
        L_0x00d3:
            r2 = r1.f18560e;	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x00e5;
        L_0x00d7:
            r2 = r1.f18562g;	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x00e5;
        L_0x00db:
            r2 = 0;
            r1.f18562g = r2;	 Catch:{ all -> 0x0227 }
            r2 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0227 }
            r2.notifyAll();	 Catch:{ all -> 0x0227 }
        L_0x00e5:
            if (r4 == 0) goto L_0x00f3;
        L_0x00e7:
            r2 = 1;
            r1.f18570o = r2;	 Catch:{ all -> 0x0227 }
            r2 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0227 }
            r2.notifyAll();	 Catch:{ all -> 0x0227 }
            r4 = 0;
            r15 = 0;
        L_0x00f3:
            r2 = r19.m22447m();	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x021d;
        L_0x00f9:
            r2 = r1.f18563h;	 Catch:{ all -> 0x0227 }
            if (r2 != 0) goto L_0x0126;
        L_0x00fd:
            if (r5 == 0) goto L_0x0101;
        L_0x00ff:
            r5 = 0;
            goto L_0x0126;
        L_0x0101:
            r2 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0227 }
            r2 = r2.m22464b(r1);	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x0126;
        L_0x010b:
            r2 = r1.f18573r;	 Catch:{ RuntimeException -> 0x011c }
            r2.m22438a();	 Catch:{ RuntimeException -> 0x011c }
            r2 = 1;
            r1.f18563h = r2;	 Catch:{ all -> 0x0227 }
            r2 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0227 }
            r2.notifyAll();	 Catch:{ all -> 0x0227 }
            r11 = 1;
            goto L_0x0126;
        L_0x011c:
            r0 = move-exception;
            r2 = r0;
            r3 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0227 }
            r3.m22465c(r1);	 Catch:{ all -> 0x0227 }
            throw r2;	 Catch:{ all -> 0x0227 }
        L_0x0126:
            r2 = r1.f18563h;	 Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x0135;
        L_0x012a:
            r2 = r1.f18564i;	 Catch:{ all -> 0x0227 }
            if (r2 != 0) goto L_0x0135;
        L_0x012e:
            r2 = 1;
            r1.f18564i = r2;	 Catch:{ all -> 0x0227 }
            r2 = 1;
            r13 = 1;
            r14 = 1;
            goto L_0x0136;
        L_0x0135:
            r2 = r12;
        L_0x0136:
            r3 = r1.f18564i;	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x021c;
        L_0x013a:
            r3 = r1.f18572q;	 Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x0149;
        L_0x013e:
            r8 = r1.f18566k;	 Catch:{ all -> 0x0227 }
            r9 = r1.f18567l;	 Catch:{ all -> 0x0227 }
            r3 = 0;
            r1.f18572q = r3;	 Catch:{ all -> 0x0227 }
            r2 = 1;
            r14 = 1;
            r15 = 1;
            goto L_0x014a;
        L_0x0149:
            r3 = 0;
        L_0x014a:
            r1.f18569n = r3;	 Catch:{ all -> 0x0227 }
            r12 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0227 }
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
            r2 = r1.f18573r;	 Catch:{ all -> 0x022b }
            r2 = r2.m22439b();	 Catch:{ all -> 0x022b }
            if (r2 != 0) goto L_0x017f;
        L_0x0168:
            r2 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x022b }
            monitor-enter(r2);	 Catch:{ all -> 0x022b }
            r3 = 1;
            r1.f18561f = r3;	 Catch:{ all -> 0x017b }
            r3 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x017b }
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
            r2 = r1.f18573r;	 Catch:{ all -> 0x022b }
            r2 = r2.m22440c();	 Catch:{ all -> 0x022b }
            r2 = (javax.microedition.khronos.opengles.GL10) r2;	 Catch:{ all -> 0x022b }
            r3 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x022b }
            r3.m22461a(r2);	 Catch:{ all -> 0x022b }
            r7 = r2;
            r13 = 0;
        L_0x0193:
            if (r11 == 0) goto L_0x01a7;
        L_0x0195:
            r2 = r1.f18574s;	 Catch:{ all -> 0x022b }
            r2 = r2.get();	 Catch:{ all -> 0x022b }
            r2 = (com.google.android.m4b.maps.bx.C5032y) r2;	 Catch:{ all -> 0x022b }
            if (r2 == 0) goto L_0x01a6;
        L_0x019f:
            r2 = r2.f18586d;	 Catch:{ all -> 0x022b }
            r2.mo5211a(r7);	 Catch:{ all -> 0x022b }
        L_0x01a6:
            r11 = 0;
        L_0x01a7:
            if (r14 == 0) goto L_0x01bb;
        L_0x01a9:
            r2 = r1.f18574s;	 Catch:{ all -> 0x022b }
            r2 = r2.get();	 Catch:{ all -> 0x022b }
            r2 = (com.google.android.m4b.maps.bx.C5032y) r2;	 Catch:{ all -> 0x022b }
            if (r2 == 0) goto L_0x01ba;
        L_0x01b3:
            r2 = r2.f18586d;	 Catch:{ all -> 0x022b }
            r2.mo5212a(r7, r8, r9);	 Catch:{ all -> 0x022b }
        L_0x01ba:
            r14 = 0;
        L_0x01bb:
            r2 = r1.f18574s;	 Catch:{ all -> 0x022b }
            r2 = r2.get();	 Catch:{ all -> 0x022b }
            r2 = (com.google.android.m4b.maps.bx.C5032y) r2;	 Catch:{ all -> 0x022b }
            if (r2 == 0) goto L_0x01cc;
        L_0x01c5:
            r2 = r2.f18586d;	 Catch:{ all -> 0x022b }
            r2.mo5213b(r7);	 Catch:{ all -> 0x022b }
        L_0x01cc:
            java.lang.System.nanoTime();	 Catch:{ all -> 0x022b }
            r2 = r1.f18573r;	 Catch:{ all -> 0x022b }
            r3 = r2.f18550a;	 Catch:{ all -> 0x022b }
            r17 = r4;
            r4 = r2.f18551b;	 Catch:{ all -> 0x022b }
            r18 = r5;
            r5 = r2.f18552c;	 Catch:{ all -> 0x022b }
            r3 = r3.eglSwapBuffers(r4, r5);	 Catch:{ all -> 0x022b }
            r4 = 12288; // 0x3000 float:1.7219E-41 double:6.071E-320;
            if (r3 != 0) goto L_0x01ea;
        L_0x01e3:
            r2 = r2.f18550a;	 Catch:{ all -> 0x022b }
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
            com.google.android.m4b.maps.bx.C5032y.C5026g.m22435a(r3, r4, r2);	 Catch:{ all -> 0x022b }
            r2 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x022b }
            monitor-enter(r2);	 Catch:{ all -> 0x022b }
            r3 = 1;
            r1.f18561f = r3;	 Catch:{ all -> 0x020a }
            r4 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x020a }
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
            r2 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0227 }
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
            r3 = com.google.android.m4b.maps.bx.C5032y.f18583a;
            monitor-enter(r3);
            r19.m22444j();	 Catch:{ all -> 0x023a }
            r19.m22445k();	 Catch:{ all -> 0x023a }
            monitor-exit(r3);	 Catch:{ all -> 0x023a }
            throw r2;
        L_0x023a:
            r0 = move-exception;
            r2 = r0;
            monitor-exit(r3);	 Catch:{ all -> 0x023a }
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.y.h.l():void");
        }

        /* renamed from: m */
        private boolean m22447m() {
            return !this.f18559d && this.f18560e && !this.f18561f && this.f18566k > 0 && this.f18567l > 0 && (this.f18569n || this.f18568m == 1);
        }

        /* renamed from: a */
        public final void m22449a(int i) {
            if (i >= 0) {
                if (i <= 1) {
                    synchronized (C5032y.f18583a) {
                        this.f18568m = i;
                        C5032y.f18583a.notifyAll();
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("renderMode");
        }

        /* renamed from: a */
        public final int m22448a() {
            int i;
            synchronized (C5032y.f18583a) {
                i = this.f18568m;
            }
            return i;
        }

        /* renamed from: b */
        public final void m22451b() {
            synchronized (C5032y.f18583a) {
                this.f18569n = true;
                C5032y.f18583a.notifyAll();
            }
        }

        /* renamed from: c */
        public final void m22452c() {
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
            r0 = com.google.android.m4b.maps.bx.C5032y.f18583a;
            monitor-enter(r0);
            r1 = 1;
            r2.f18560e = r1;	 Catch:{ all -> 0x0029 }
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0029 }
            r1.notifyAll();	 Catch:{ all -> 0x0029 }
        L_0x000f:
            r1 = r2.f18562g;	 Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0027;	 Catch:{ all -> 0x0029 }
        L_0x0013:
            r1 = r2.f18557b;	 Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027;
        L_0x0017:
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ InterruptedException -> 0x001f }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.y.h.c():void");
        }

        /* renamed from: d */
        public final void m22453d() {
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
            r0 = com.google.android.m4b.maps.bx.C5032y.f18583a;
            monitor-enter(r0);
            r1 = 0;
            r2.f18560e = r1;	 Catch:{ all -> 0x0029 }
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0029 }
            r1.notifyAll();	 Catch:{ all -> 0x0029 }
        L_0x000f:
            r1 = r2.f18562g;	 Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027;	 Catch:{ all -> 0x0029 }
        L_0x0013:
            r1 = r2.f18557b;	 Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027;
        L_0x0017:
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ InterruptedException -> 0x001f }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.y.h.d():void");
        }

        /* renamed from: e */
        public final void m22454e() {
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
            r0 = com.google.android.m4b.maps.bx.C5032y.f18583a;
            monitor-enter(r0);
            r1 = 1;
            r2.f18558c = r1;	 Catch:{ all -> 0x0029 }
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0029 }
            r1.notifyAll();	 Catch:{ all -> 0x0029 }
        L_0x000f:
            r1 = r2.f18557b;	 Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027;	 Catch:{ all -> 0x0029 }
        L_0x0013:
            r1 = r2.f18559d;	 Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0027;
        L_0x0017:
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ InterruptedException -> 0x001f }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.y.h.e():void");
        }

        /* renamed from: f */
        public final void m22455f() {
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
            r0 = com.google.android.m4b.maps.bx.C5032y.f18583a;
            monitor-enter(r0);
            r1 = 0;
            r3.f18558c = r1;	 Catch:{ all -> 0x0032 }
            r2 = 1;	 Catch:{ all -> 0x0032 }
            r3.f18569n = r2;	 Catch:{ all -> 0x0032 }
            r3.f18570o = r1;	 Catch:{ all -> 0x0032 }
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0032 }
            r1.notifyAll();	 Catch:{ all -> 0x0032 }
        L_0x0014:
            r1 = r3.f18557b;	 Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030;	 Catch:{ all -> 0x0032 }
        L_0x0018:
            r1 = r3.f18559d;	 Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030;	 Catch:{ all -> 0x0032 }
        L_0x001c:
            r1 = r3.f18570o;	 Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030;
        L_0x0020:
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ InterruptedException -> 0x0028 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.y.h.f():void");
        }

        /* renamed from: a */
        public final void m22450a(int r3, int r4) {
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
            r0 = com.google.android.m4b.maps.bx.C5032y.f18583a;
            monitor-enter(r0);
            r2.f18566k = r3;	 Catch:{ all -> 0x0049 }
            r2.f18567l = r4;	 Catch:{ all -> 0x0049 }
            r3 = 1;	 Catch:{ all -> 0x0049 }
            r2.f18572q = r3;	 Catch:{ all -> 0x0049 }
            r2.f18569n = r3;	 Catch:{ all -> 0x0049 }
            r4 = 0;	 Catch:{ all -> 0x0049 }
            r2.f18570o = r4;	 Catch:{ all -> 0x0049 }
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0049 }
            r1.notifyAll();	 Catch:{ all -> 0x0049 }
        L_0x0018:
            r1 = r2.f18557b;	 Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0047;	 Catch:{ all -> 0x0049 }
        L_0x001c:
            r1 = r2.f18559d;	 Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0047;	 Catch:{ all -> 0x0049 }
        L_0x0020:
            r1 = r2.f18570o;	 Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0047;	 Catch:{ all -> 0x0049 }
        L_0x0024:
            r1 = r2.f18563h;	 Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0034;	 Catch:{ all -> 0x0049 }
        L_0x0028:
            r1 = r2.f18564i;	 Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0034;	 Catch:{ all -> 0x0049 }
        L_0x002c:
            r1 = r2.m22447m();	 Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0034;
        L_0x0032:
            r1 = 1;
            goto L_0x0035;
        L_0x0034:
            r1 = 0;
        L_0x0035:
            if (r1 == 0) goto L_0x0047;
        L_0x0037:
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ InterruptedException -> 0x003f }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.y.h.a(int, int):void");
        }

        /* renamed from: g */
        public final void m22456g() {
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
            r0 = com.google.android.m4b.maps.bx.C5032y.f18583a;
            monitor-enter(r0);
            r1 = 1;
            r2.f18556a = r1;	 Catch:{ all -> 0x0025 }
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ all -> 0x0025 }
            r1.notifyAll();	 Catch:{ all -> 0x0025 }
        L_0x000f:
            r1 = r2.f18557b;	 Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0023;
        L_0x0013:
            r1 = com.google.android.m4b.maps.bx.C5032y.f18583a;	 Catch:{ InterruptedException -> 0x001b }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.y.h.g():void");
        }

        /* renamed from: h */
        public final boolean m22457h() {
            boolean z;
            synchronized (C5032y.f18583a) {
                z = this.f18557b;
            }
            return z;
        }

        /* renamed from: i */
        public final void m22458i() {
            this.f18565j = true;
            C5032y.f18583a.notifyAll();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.y$i */
    static class C5028i {
        /* renamed from: a */
        private static String f18575a = "GLThreadManager";
        /* renamed from: b */
        private boolean f18576b;
        /* renamed from: c */
        private int f18577c;
        /* renamed from: d */
        private boolean f18578d;
        /* renamed from: e */
        private boolean f18579e;
        /* renamed from: f */
        private boolean f18580f;
        /* renamed from: g */
        private C5027h f18581g;

        private C5028i() {
        }

        /* renamed from: a */
        public final synchronized void m22460a(C5027h c5027h) {
            c5027h.f18557b = true;
            if (this.f18581g == c5027h) {
                this.f18581g = null;
            }
            notifyAll();
        }

        /* renamed from: b */
        public final boolean m22464b(C5027h c5027h) {
            if (this.f18581g != c5027h) {
                if (this.f18581g != null) {
                    m22459c();
                    if (this.f18579e != null) {
                        return true;
                    }
                    if (this.f18581g != null) {
                        this.f18581g.m22458i();
                    }
                    return null;
                }
            }
            this.f18581g = c5027h;
            notifyAll();
            return true;
        }

        /* renamed from: c */
        public final void m22465c(C5027h c5027h) {
            if (this.f18581g == c5027h) {
                this.f18581g = null;
            }
            notifyAll();
        }

        /* renamed from: a */
        public final synchronized boolean m22462a() {
            return this.f18580f;
        }

        /* renamed from: b */
        public final synchronized boolean m22463b() {
            m22459c();
            return !this.f18579e;
        }

        /* renamed from: a */
        public final synchronized void m22461a(GL10 gl10) {
            if (!this.f18578d) {
                m22459c();
                gl10 = gl10.glGetString(7937);
                if (this.f18577c < 131072) {
                    this.f18579e = gl10.startsWith("Q3Dimension MSM7500 ") ^ true;
                    notifyAll();
                }
                if (this.f18579e) {
                    if (gl10.startsWith("Adreno") == null || VERSION.SDK_INT >= 11) {
                        gl10 = null;
                        this.f18580f = gl10;
                        this.f18578d = true;
                    }
                }
                gl10 = true;
                this.f18580f = gl10;
                this.f18578d = true;
            }
        }

        /* renamed from: c */
        private void m22459c() {
            if (!this.f18576b) {
                this.f18577c = 131072;
                if (this.f18577c >= 131072) {
                    this.f18579e = true;
                }
                this.f18576b = true;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.y$j */
    public interface C5029j {
        /* renamed from: a */
        GL m22466a();
    }

    /* renamed from: com.google.android.m4b.maps.bx.y$k */
    static class C5030k extends Writer {
        /* renamed from: a */
        private StringBuilder f18582a = new StringBuilder();

        C5030k() {
        }

        public final void close() {
            m22467a();
        }

        public final void flush() {
            m22467a();
        }

        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m22467a();
                } else {
                    this.f18582a.append(c);
                }
            }
        }

        /* renamed from: a */
        private void m22467a() {
            if (this.f18582a.length() > 0) {
                if (C4728u.m21050a("GLSurfaceView", 2)) {
                    Log.v("GLSurfaceView", this.f18582a.toString());
                }
                this.f18582a.delete(0, this.f18582a.length());
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.y$l */
    public interface C5031l {
        /* renamed from: a */
        void mo5211a(GL10 gl10);

        /* renamed from: a */
        void mo5212a(GL10 gl10, int i, int i2);

        /* renamed from: b */
        void mo5213b(GL10 gl10);
    }

    /* renamed from: com.google.android.m4b.maps.bx.y$a */
    abstract class C6565a implements C5023d {
        /* renamed from: a */
        private int[] f24550a;
        /* renamed from: b */
        private /* synthetic */ C5032y f24551b;

        /* renamed from: a */
        abstract EGLConfig mo7107a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public C6565a(C5032y c5032y, int[] iArr) {
            this.f24551b = c5032y;
            if (0 == 2) {
                c5032y = iArr.length;
                Object obj = new int[(c5032y + 2)];
                int i = c5032y - 1;
                System.arraycopy(iArr, 0, obj, 0, i);
                obj[i] = 12352;
                obj[c5032y] = 4;
                obj[c5032y + 1] = 12344;
                iArr = obj;
            }
            this.f24550a = iArr;
        }

        /* renamed from: a */
        public final EGLConfig mo5242a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.f24550a, null, 0, iArr)) {
                int i = iArr[0];
                if (i <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                if (egl10.eglChooseConfig(eGLDisplay, this.f24550a, eGLConfigArr, i, iArr)) {
                    egl10 = mo7107a(egl10, eGLDisplay, eGLConfigArr);
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

    /* renamed from: com.google.android.m4b.maps.bx.y$c */
    class C6566c implements C5024e {
        /* renamed from: a */
        private int f24552a;
        /* renamed from: b */
        private /* synthetic */ C5032y f24553b;

        private C6566c(C5032y c5032y) {
            this.f24553b = c5032y;
            this.f24552a = 12440;
        }

        /* renamed from: a */
        public final EGLContext mo5243a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = new int[]{this.f24552a, 0, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (0 == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        /* renamed from: a */
        public final void mo5244a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
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
                C5026g.m22434a("eglDestroyContex", egl10.eglGetError());
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.y$b */
    class C7486b extends C6565a {
        /* renamed from: a */
        private int[] f27625a = new int[1];
        /* renamed from: b */
        private int f27626b = 5;
        /* renamed from: c */
        private int f27627c = 6;
        /* renamed from: d */
        private int f27628d = 5;
        /* renamed from: e */
        private int f27629e = 0;
        /* renamed from: f */
        private int f27630f;
        /* renamed from: g */
        private int f27631g;
        /* renamed from: h */
        private /* synthetic */ C5032y f27632h;

        public C7486b(C5032y c5032y, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f27632h = c5032y;
            super(c5032y, new int[]{12324, 5, 12323, 6, 12322, 5, 12321, null, 12325, i5, 12326, null, 12344});
            this.f27630f = i5;
            this.f27631g = 0;
        }

        /* renamed from: a */
        public final EGLConfig mo7107a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                EGLConfig eGLConfig2 = eGLConfig;
                int a = m32529a(egl102, eGLDisplay2, eGLConfig2, 12325, 0);
                int a2 = m32529a(egl102, eGLDisplay2, eGLConfig2, 12326, 0);
                if (a >= this.f27630f && a2 >= this.f27631g) {
                    egl102 = egl10;
                    eGLDisplay2 = eGLDisplay;
                    eGLConfig2 = eGLConfig;
                    a = m32529a(egl102, eGLDisplay2, eGLConfig2, 12324, 0);
                    int a3 = m32529a(egl102, eGLDisplay2, eGLConfig2, 12323, 0);
                    int a4 = m32529a(egl102, eGLDisplay2, eGLConfig2, 12322, 0);
                    a2 = m32529a(egl102, eGLDisplay2, eGLConfig2, 12321, 0);
                    if (a == this.f27626b && a3 == this.f27627c && a4 == this.f27628d && a2 == this.f27629e) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        private int m32529a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f27625a) != null) {
                return this.f27625a[0];
            }
            return 0;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.y$m */
    class C8077m extends C7486b {
        /* renamed from: a */
        private /* synthetic */ C5032y f28977a;

        public C8077m(C5032y c5032y, boolean z) {
            this.f28977a = c5032y;
            super(c5032y, 5, 6, 5, 0, 16, 0);
        }
    }

    public C5032y(Context context) {
        super(context);
        context = getHolder();
        context.addCallback(this);
        if (VERSION.SDK_INT < 9) {
            context.setFormat(4);
        }
    }

    protected void finalize() {
        try {
            if (this.f18585c != null) {
                this.f18585c.m22456g();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    /* renamed from: i */
    public final void m22484i(boolean z) {
        this.f18591i = true;
    }

    /* renamed from: j */
    public final void m22485j(boolean z) {
        this.f18592j = z;
        if (!z && this.f18587e && this.f18585c && !this.f18585c.m22457h()) {
            this.f18585c.m22456g();
        }
    }

    /* renamed from: a */
    public final void m22482a(C5031l c5031l) {
        mo5239a();
        if (this.f18588f == null) {
            this.f18588f = new C8077m(this, true);
        }
        if (this.f18589g == null) {
            this.f18589g = new C6566c();
        }
        if (this.f18590h == null) {
            this.f18590h = new C5025f();
        }
        this.f18586d = c5031l;
        this.f18585c = new C5027h(this.f18584b);
        this.f18585c.start();
    }

    /* renamed from: a */
    public final void m22481a(C5023d c5023d) {
        mo5239a();
        this.f18588f = c5023d;
    }

    /* renamed from: b */
    public final void m22483b(int i) {
        this.f18585c.m22449a(0);
    }

    /* renamed from: p */
    public void mo5233p() {
        this.f18585c.m22451b();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f18585c.m22452c();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f18585c.m22453d();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f18585c.m22450a(i2, i3);
    }

    /* renamed from: r */
    public void mo5240r() {
        this.f18585c.m22454e();
    }

    /* renamed from: s */
    public void mo5241s() {
        this.f18585c.m22455f();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18587e && this.f18586d != null && (this.f18585c == null || this.f18585c.m22457h())) {
            int a = this.f18585c != null ? this.f18585c.m22448a() : 1;
            this.f18585c = new C5027h(this.f18584b);
            if (a != 1) {
                this.f18585c.m22449a(a);
            }
            this.f18585c.start();
        }
        this.f18587e = false;
    }

    protected void onDetachedFromWindow() {
        if (!(this.f18592j || this.f18585c == null)) {
            this.f18585c.m22456g();
        }
        this.f18587e = true;
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void mo5239a() {
        if (this.f18585c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }
}
