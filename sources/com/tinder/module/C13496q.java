package com.tinder.module;

import com.tinder.ads.AdAggregator.Builder;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.module.q */
public final class C13496q implements Factory<Builder> {
    /* renamed from: a */
    private final C9940d f43067a;

    public /* synthetic */ Object get() {
        return m52575a();
    }

    public C13496q(C9940d c9940d) {
        this.f43067a = c9940d;
    }

    /* renamed from: a */
    public Builder m52575a() {
        return C13496q.m52572a(this.f43067a);
    }

    /* renamed from: a */
    public static Builder m52572a(C9940d c9940d) {
        return C13496q.m52574c(c9940d);
    }

    /* renamed from: b */
    public static C13496q m52573b(C9940d c9940d) {
        return new C13496q(c9940d);
    }

    /* renamed from: c */
    public static Builder m52574c(C9940d c9940d) {
        return (Builder) C15521i.a(c9940d.m40872b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
