package com.tinder.feed.p248c;

import com.tinder.common.tracker.recyclerview.p200c.C8577i;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.c.l */
public final class C13262l implements Factory<C8577i> {
    /* renamed from: a */
    private final C9461b f42017a;
    /* renamed from: b */
    private final Provider<C8577i> f42018b;

    public /* synthetic */ Object get() {
        return m51309a();
    }

    public C13262l(C9461b c9461b, Provider<C8577i> provider) {
        this.f42017a = c9461b;
        this.f42018b = provider;
    }

    /* renamed from: a */
    public C8577i m51309a() {
        return C13262l.m51307a(this.f42017a, this.f42018b);
    }

    /* renamed from: a */
    public static C8577i m51307a(C9461b c9461b, Provider<C8577i> provider) {
        return C13262l.m51306a(c9461b, (C8577i) provider.get());
    }

    /* renamed from: b */
    public static C13262l m51308b(C9461b c9461b, Provider<C8577i> provider) {
        return new C13262l(c9461b, provider);
    }

    /* renamed from: a */
    public static C8577i m51306a(C9461b c9461b, C8577i c8577i) {
        return (C8577i) C15521i.a(c9461b.m39560a(c8577i), "Cannot return null from a non-@Nullable @Provides method");
    }
}
