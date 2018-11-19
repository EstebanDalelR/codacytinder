package android.arch.core.p002a;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.core.a.c */
public abstract class C0004c {
    /* renamed from: a */
    public abstract void mo15a(@NonNull Runnable runnable);

    /* renamed from: b */
    public abstract void mo16b(@NonNull Runnable runnable);

    /* renamed from: d */
    public abstract boolean mo17d();

    /* renamed from: c */
    public void m36c(@NonNull Runnable runnable) {
        if (mo17d()) {
            runnable.run();
        } else {
            mo16b(runnable);
        }
    }
}
