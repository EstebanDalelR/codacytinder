package com.tinder.data.p210b;

import com.tinder.common.logger.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/tinder/data/common/TimberLogger;", "Lcom/tinder/common/logger/Logger;", "()V", "debug", "", "message", "", "error", "throwable", "", "info", "verbose", "warn", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.b.f */
public final class C10749f implements Logger {
    /* renamed from: a */
    public static final C10749f f35145a = new C10749f();

    private C10749f() {
    }

    public void verbose(@NotNull String str) {
        C2668g.b(str, "message");
        C0001a.a(str, new Object[0]);
    }

    public void debug(@NotNull String str) {
        C2668g.b(str, "message");
        C0001a.b(str, new Object[0]);
    }

    public void info(@NotNull String str) {
        C2668g.b(str, "message");
        C0001a.c(str, new Object[0]);
    }

    public void warn(@NotNull String str) {
        C2668g.b(str, "message");
        C0001a.d(str, new Object[0]);
    }

    public void warn(@NotNull Throwable th) {
        C2668g.b(th, "throwable");
        C0001a.b(th);
    }

    public void warn(@NotNull Throwable th, @NotNull String str) {
        C2668g.b(th, "throwable");
        C2668g.b(str, "message");
        C0001a.b(th, str, new Object[0]);
    }

    public void error(@NotNull String str) {
        C2668g.b(str, "message");
        C0001a.e(str, new Object[0]);
    }

    public void error(@NotNull Throwable th) {
        C2668g.b(th, "throwable");
        C0001a.c(th);
    }

    public void error(@NotNull Throwable th, @NotNull String str) {
        C2668g.b(th, "throwable");
        C2668g.b(str, "message");
        C0001a.c(th, str, new Object[0]);
    }
}
