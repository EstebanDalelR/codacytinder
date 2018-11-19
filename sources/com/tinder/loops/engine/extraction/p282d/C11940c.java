package com.tinder.loops.engine.extraction.p282d;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLSurface;
import com.tinder.loops.engine.common.opengl.C9771a;
import com.tinder.loops.engine.extraction.p281c.C9797e;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u001d\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0016¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/loops/engine/extraction/opengl/OutputEGLContext;", "Lcom/tinder/loops/engine/common/opengl/EGLContext;", "()V", "attributes", "", "getAttributes", "()[I", "resolution", "Lcom/tinder/loops/engine/extraction/model/Resolution;", "bindResolution", "", "buildSurface", "Landroid/opengl/EGLSurface;", "configs", "", "Landroid/opengl/EGLConfig;", "([Landroid/opengl/EGLConfig;)Landroid/opengl/EGLSurface;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.d.c */
public final class C11940c extends C9771a {
    /* renamed from: a */
    private C9797e f38857a;

    /* renamed from: a */
    public final void m47960a(@NotNull C9797e c9797e) {
        C2668g.b(c9797e, "resolution");
        this.f38857a = c9797e;
    }

    @NotNull
    /* renamed from: b */
    public int[] mo10527b() {
        return new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    }

    @NotNull
    /* renamed from: a */
    public EGLSurface mo10526a(@NotNull EGLConfig[] eGLConfigArr) {
        C2668g.b(eGLConfigArr, "configs");
        int[] iArr = new int[5];
        iArr[0] = 12375;
        C9797e c9797e = this.f38857a;
        if (c9797e == null) {
            C2668g.b("resolution");
        }
        iArr[1] = c9797e.m40389a();
        iArr[2] = 12374;
        C9797e c9797e2 = this.f38857a;
        if (c9797e2 == null) {
            C2668g.b("resolution");
        }
        iArr[3] = c9797e2.m40390b();
        iArr[4] = 12344;
        eGLConfigArr = EGL14.eglCreatePbufferSurface(m40316a(), eGLConfigArr[0], iArr, 0);
        C2668g.a(eGLConfigArr, "EGL14.eglCreatePbufferSu…0], surfaceAttributes, 0)");
        return eGLConfigArr;
    }
}
