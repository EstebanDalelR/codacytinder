package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public final class ExceptionUtilsKt {
    @NotNull
    public static final RuntimeException rethrow(@NotNull Throwable th) {
        C2668g.b(th, "e");
        throw th;
    }

    public static final boolean isProcessCanceledException(@NotNull Throwable th) {
        C2668g.b(th, "$receiver");
        th = th.getClass();
        while (!C2668g.a(th.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            th = th.getSuperclass();
            if (th == null) {
                return null;
            }
        }
        return true;
    }
}
