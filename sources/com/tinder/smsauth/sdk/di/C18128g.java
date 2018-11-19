package com.tinder.smsauth.sdk.di;

import android.arch.lifecycle.C0029n;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.sdk.di.g */
public final class C18128g implements Factory<C18127f> {
    /* renamed from: a */
    private final Provider<Map<Class<? extends C0029n>, Provider<C0029n>>> f56258a;

    public /* synthetic */ Object get() {
        return m65775a();
    }

    public C18128g(Provider<Map<Class<? extends C0029n>, Provider<C0029n>>> provider) {
        this.f56258a = provider;
    }

    /* renamed from: a */
    public C18127f m65775a() {
        return C18128g.m65773a(this.f56258a);
    }

    /* renamed from: a */
    public static C18127f m65773a(Provider<Map<Class<? extends C0029n>, Provider<C0029n>>> provider) {
        return new C18127f((Map) provider.get());
    }

    /* renamed from: b */
    public static C18128g m65774b(Provider<Map<Class<? extends C0029n>, Provider<C0029n>>> provider) {
        return new C18128g(provider);
    }
}
