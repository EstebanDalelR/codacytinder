package com.tinder.app.dagger.module.main;

import com.tinder.activities.MainActivity;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.s */
public final class C12518s implements Factory<OnSegmentChangedListener> {
    /* renamed from: a */
    private final C8251a f40350a;
    /* renamed from: b */
    private final Provider<MainActivity> f40351b;

    public /* synthetic */ Object get() {
        return m49267a();
    }

    public C12518s(C8251a c8251a, Provider<MainActivity> provider) {
        this.f40350a = c8251a;
        this.f40351b = provider;
    }

    /* renamed from: a */
    public OnSegmentChangedListener m49267a() {
        return C12518s.m49265a(this.f40350a, this.f40351b);
    }

    /* renamed from: a */
    public static OnSegmentChangedListener m49265a(C8251a c8251a, Provider<MainActivity> provider) {
        return C12518s.m49264a(c8251a, (MainActivity) provider.get());
    }

    /* renamed from: b */
    public static C12518s m49266b(C8251a c8251a, Provider<MainActivity> provider) {
        return new C12518s(c8251a, provider);
    }

    /* renamed from: a */
    public static OnSegmentChangedListener m49264a(C8251a c8251a, MainActivity mainActivity) {
        return (OnSegmentChangedListener) C15521i.a(c8251a.m35208a(mainActivity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
