package com.tinder.data.p211c.p212a;

import com.tinder.data.p211c.C8636b;
import com.tinder.domain.connectivity.ConnectivityRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.c.a.b */
public final class C12847b implements Factory<ConnectivityRepository> {
    /* renamed from: a */
    private final C8635a f41283a;
    /* renamed from: b */
    private final Provider<C8636b> f41284b;

    public /* synthetic */ Object get() {
        return m50455a();
    }

    public C12847b(C8635a c8635a, Provider<C8636b> provider) {
        this.f41283a = c8635a;
        this.f41284b = provider;
    }

    /* renamed from: a */
    public ConnectivityRepository m50455a() {
        return C12847b.m50453a(this.f41283a, this.f41284b);
    }

    /* renamed from: a */
    public static ConnectivityRepository m50453a(C8635a c8635a, Provider<C8636b> provider) {
        return C12847b.m50452a(c8635a, (C8636b) provider.get());
    }

    /* renamed from: b */
    public static C12847b m50454b(C8635a c8635a, Provider<C8636b> provider) {
        return new C12847b(c8635a, provider);
    }

    /* renamed from: a */
    public static ConnectivityRepository m50452a(C8635a c8635a, C8636b c8636b) {
        return (ConnectivityRepository) C15521i.a(c8635a.m36789a(c8636b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
