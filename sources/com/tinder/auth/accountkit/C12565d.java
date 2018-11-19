package com.tinder.auth.accountkit;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.accountkit.d */
public final class C12565d implements Factory<C12564c> {
    /* renamed from: a */
    private final Provider<C8271f> f40608a;

    public /* synthetic */ Object get() {
        return m49675a();
    }

    /* renamed from: a */
    public C12564c m49675a() {
        return C12565d.m49674a(this.f40608a);
    }

    /* renamed from: a */
    public static C12564c m49674a(Provider<C8271f> provider) {
        return new C12564c((C8271f) provider.get());
    }

    /* renamed from: a */
    public static C12564c m49673a(Object obj) {
        return new C12564c((C8271f) obj);
    }
}
