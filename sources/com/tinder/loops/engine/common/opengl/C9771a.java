package com.tinder.loops.engine.common.opengl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import com.tinder.exception.LoopsEngineExtractionException;
import com.tinder.p260i.C9706a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H&¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001fR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u000e¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n \t*\u0004\u0018\u00010\u00110\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/loops/engine/common/opengl/EGLContext;", "", "()V", "attributes", "", "getAttributes", "()[I", "eglContext", "Landroid/opengl/EGLContext;", "kotlin.jvm.PlatformType", "eglDisplay", "Landroid/opengl/EGLDisplay;", "getEglDisplay", "()Landroid/opengl/EGLDisplay;", "setEglDisplay", "(Landroid/opengl/EGLDisplay;)V", "eglSurface", "Landroid/opengl/EGLSurface;", "buildSurface", "configs", "", "Landroid/opengl/EGLConfig;", "([Landroid/opengl/EGLConfig;)Landroid/opengl/EGLSurface;", "eglSetup", "", "makeCurrent", "release", "setPresentationTime", "nanoSeconds", "", "swapBuffers", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.common.opengl.a */
public abstract class C9771a {
    /* renamed from: a */
    private EGLDisplay f32409a = EGL14.EGL_NO_DISPLAY;
    /* renamed from: b */
    private EGLContext f32410b = EGL14.EGL_NO_CONTEXT;
    /* renamed from: c */
    private EGLSurface f32411c = EGL14.EGL_NO_SURFACE;

    @NotNull
    /* renamed from: a */
    public abstract EGLSurface mo10526a(@NotNull EGLConfig[] eGLConfigArr);

    @NotNull
    /* renamed from: b */
    public abstract int[] mo10527b();

    /* renamed from: a */
    protected final EGLDisplay m40316a() {
        return this.f32409a;
    }

    /* renamed from: c */
    public final void m40320c() {
        if (this.f32409a != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglMakeCurrent(this.f32409a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f32409a, this.f32411c);
            EGL14.eglDestroyContext(this.f32409a, this.f32410b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f32409a);
        }
        this.f32409a = EGL14.EGL_NO_DISPLAY;
        this.f32410b = EGL14.EGL_NO_CONTEXT;
        this.f32411c = EGL14.EGL_NO_SURFACE;
    }

    /* renamed from: d */
    public final void m40321d() {
        boolean z = false;
        this.f32409a = EGL14.eglGetDisplay(0);
        C9706a.m40168a(this.f32409a != EGL14.EGL_NO_DISPLAY, (Exception) new LoopsEngineExtractionException("unable to get EGL14 display"));
        int[] iArr = new int[2];
        C9706a.m40168a(EGL14.eglInitialize(this.f32409a, iArr, 0, iArr, 1), (Exception) new LoopsEngineExtractionException("unable to initialize EGL14"));
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        C9706a.m40168a(EGL14.eglChooseConfig(this.f32409a, mo10527b(), 0, eGLConfigArr, 0, eGLConfigArr.length, new int[1], 0), (Exception) new LoopsEngineExtractionException("unable to find EGL config"));
        this.f32410b = EGL14.eglCreateContext(this.f32409a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        C9772b.m40324a("eglCreateContext");
        C9706a.m40168a(this.f32410b != null, (Exception) new LoopsEngineExtractionException("null egl context"));
        this.f32411c = mo10526a(eGLConfigArr);
        C9772b.m40324a("eglCreatePbufferSurface");
        if (this.f32411c != null) {
            z = true;
        }
        C9706a.m40168a(z, (Exception) new LoopsEngineExtractionException("egl surface was null"));
    }

    /* renamed from: e */
    public final void m40322e() {
        C9706a.m40168a(EGL14.eglMakeCurrent(this.f32409a, this.f32411c, this.f32411c, this.f32410b), (Exception) new LoopsEngineExtractionException("eglMakeCurrent failed"));
    }

    /* renamed from: f */
    public final boolean m40323f() {
        return EGL14.eglSwapBuffers(this.f32409a, this.f32411c);
    }

    /* renamed from: a */
    public final void m40318a(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f32409a, this.f32411c, j);
    }
}
