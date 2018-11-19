package com.google.android.gms.tasks;

import android.support.annotation.NonNull;

/* renamed from: com.google.android.gms.tasks.b */
public class C4501b<TResult> {
    /* renamed from: a */
    private final C6293p<TResult> f16739a = new C6293p();

    @NonNull
    /* renamed from: a */
    public C4500a<TResult> m20372a() {
        return this.f16739a;
    }

    /* renamed from: a */
    public void m20373a(@NonNull Exception exception) {
        this.f16739a.m27625a(exception);
    }

    /* renamed from: a */
    public void m20374a(TResult tResult) {
        this.f16739a.m27626a((Object) tResult);
    }

    /* renamed from: b */
    public boolean m20375b(@NonNull Exception exception) {
        return this.f16739a.m27629b(exception);
    }

    /* renamed from: b */
    public boolean m20376b(TResult tResult) {
        return this.f16739a.m27630b((Object) tResult);
    }
}
