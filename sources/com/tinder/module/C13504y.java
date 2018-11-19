package com.tinder.module;

import com.tinder.data.ads.TrackingUrlNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;

/* renamed from: com.tinder.module.y */
public final class C13504y implements Factory<TrackingUrlNotifier> {
    /* renamed from: a */
    private final C9940d f43093a;
    /* renamed from: b */
    private final Provider<C17692o> f43094b;

    public /* synthetic */ Object get() {
        return m52607a();
    }

    public C13504y(C9940d c9940d, Provider<C17692o> provider) {
        this.f43093a = c9940d;
        this.f43094b = provider;
    }

    /* renamed from: a */
    public TrackingUrlNotifier m52607a() {
        return C13504y.m52604a(this.f43093a, this.f43094b);
    }

    /* renamed from: a */
    public static TrackingUrlNotifier m52604a(C9940d c9940d, Provider<C17692o> provider) {
        return C13504y.m52605a(c9940d, (C17692o) provider.get());
    }

    /* renamed from: b */
    public static C13504y m52606b(C9940d c9940d, Provider<C17692o> provider) {
        return new C13504y(c9940d, provider);
    }

    /* renamed from: a */
    public static TrackingUrlNotifier m52605a(C9940d c9940d, C17692o c17692o) {
        return (TrackingUrlNotifier) C15521i.a(c9940d.m40860a(c17692o), "Cannot return null from a non-@Nullable @Provides method");
    }
}
