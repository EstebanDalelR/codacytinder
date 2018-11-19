package android.arch.core.p002a;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.util.concurrent.Executor;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.core.a.a */
public class C2673a extends C0004c {
    /* renamed from: a */
    private static volatile C2673a f8473a;
    @NonNull
    /* renamed from: d */
    private static final Executor f8474d = new C00021();
    @NonNull
    /* renamed from: e */
    private static final Executor f8475e = new C00032();
    @NonNull
    /* renamed from: b */
    private C0004c f8476b = this.f8477c;
    @NonNull
    /* renamed from: c */
    private C0004c f8477c = new C2674b();

    /* renamed from: android.arch.core.a.a$1 */
    static class C00021 implements Executor {
        C00021() {
        }

        public void execute(Runnable runnable) {
            C2673a.m10423a().mo16b(runnable);
        }
    }

    /* renamed from: android.arch.core.a.a$2 */
    static class C00032 implements Executor {
        C00032() {
        }

        public void execute(Runnable runnable) {
            C2673a.m10423a().mo15a(runnable);
        }
    }

    private C2673a() {
    }

    @NonNull
    /* renamed from: a */
    public static C2673a m10423a() {
        if (f8473a != null) {
            return f8473a;
        }
        synchronized (C2673a.class) {
            if (f8473a == null) {
                f8473a = new C2673a();
            }
        }
        return f8473a;
    }

    /* renamed from: a */
    public void mo15a(Runnable runnable) {
        this.f8476b.mo15a(runnable);
    }

    /* renamed from: b */
    public void mo16b(Runnable runnable) {
        this.f8476b.mo16b(runnable);
    }

    @NonNull
    /* renamed from: b */
    public static Executor m10424b() {
        return f8474d;
    }

    @NonNull
    /* renamed from: c */
    public static Executor m10425c() {
        return f8475e;
    }

    /* renamed from: d */
    public boolean mo17d() {
        return this.f8476b.mo17d();
    }
}
