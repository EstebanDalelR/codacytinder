package com.tinder.loops.engine.common.opengl;

import android.opengl.EGL14;
import com.tinder.p260i.C9706a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"checkEglError", "", "msg", "", "loopsengine_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.common.opengl.b */
public final class C9772b {
    /* renamed from: a */
    public static final void m40324a(@NotNull String str) {
        C2668g.b(str, "msg");
        int eglGetError = EGL14.eglGetError();
        C9706a.m40169a(eglGetError == 12288, (Function0) new GLUtilsKt$checkEglError$1(str, eglGetError));
    }
}
