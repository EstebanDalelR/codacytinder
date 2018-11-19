package com.tinder.loops.engine.common.opengl;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class GLUtilsKt$checkEglError$1 extends Lambda implements Function0<String> {
    /* renamed from: a */
    final /* synthetic */ String f44508a;
    /* renamed from: b */
    final /* synthetic */ int f44509b;

    GLUtilsKt$checkEglError$1(String str, int i) {
        this.f44508a = str;
        this.f44509b = i;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53744a();
    }

    @NotNull
    /* renamed from: a */
    public final String m53744a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f44508a);
        stringBuilder.append(": EGL error: 0x");
        stringBuilder.append(Integer.toHexString(this.f44509b));
        return stringBuilder.toString();
    }
}
