package com.tinder.loops.engine.creation.p278e;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.tinder.loops.engine.common.opengl.C9771a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u001d\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0016¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/loops/engine/creation/opengl/InputEGLContext;", "Lcom/tinder/loops/engine/common/opengl/EGLContext;", "()V", "attributes", "", "getAttributes", "()[I", "surface", "Landroid/view/Surface;", "bindSurface", "", "buildSurface", "Landroid/opengl/EGLSurface;", "configs", "", "Landroid/opengl/EGLConfig;", "([Landroid/opengl/EGLConfig;)Landroid/opengl/EGLSurface;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.e.c */
public final class C11934c extends C9771a {
    /* renamed from: a */
    private Surface f38840a;

    /* renamed from: a */
    public final void m47941a(@NotNull Surface surface) {
        C2668g.b(surface, "surface");
        this.f38840a = surface;
    }

    @NotNull
    /* renamed from: b */
    public int[] mo10527b() {
        return new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};
    }

    @NotNull
    /* renamed from: a */
    public EGLSurface mo10526a(@NotNull EGLConfig[] eGLConfigArr) {
        C2668g.b(eGLConfigArr, "configs");
        int[] iArr = new int[]{12344};
        EGLDisplay a = m40316a();
        eGLConfigArr = eGLConfigArr[0];
        Surface surface = this.f38840a;
        if (surface == null) {
            C2668g.b("surface");
        }
        eGLConfigArr = EGL14.eglCreateWindowSurface(a, eGLConfigArr, surface, iArr, 0);
        C2668g.a(eGLConfigArr, "EGL14.eglCreateWindowSur…ceAttributes, 0\n        )");
        return eGLConfigArr;
    }
}
