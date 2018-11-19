package com.tinder.fastmatch;

import com.tinder.recsgrid.C16487f;
import com.tinder.recsgrid.ScrollStatusNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.g */
public final class C13193g implements Factory<ScrollStatusNotifier> {
    /* renamed from: a */
    private final C9370a f41893a;
    /* renamed from: b */
    private final Provider<C16487f> f41894b;

    public /* synthetic */ Object get() {
        return m51161a();
    }

    public C13193g(C9370a c9370a, Provider<C16487f> provider) {
        this.f41893a = c9370a;
        this.f41894b = provider;
    }

    /* renamed from: a */
    public ScrollStatusNotifier m51161a() {
        return C13193g.m51159a(this.f41893a, this.f41894b);
    }

    /* renamed from: a */
    public static ScrollStatusNotifier m51159a(C9370a c9370a, Provider<C16487f> provider) {
        return C13193g.m51158a(c9370a, (C16487f) provider.get());
    }

    /* renamed from: b */
    public static C13193g m51160b(C9370a c9370a, Provider<C16487f> provider) {
        return new C13193g(c9370a, provider);
    }

    /* renamed from: a */
    public static ScrollStatusNotifier m51158a(C9370a c9370a, C16487f c16487f) {
        return (ScrollStatusNotifier) C15521i.a(c9370a.m39227a(c16487f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
