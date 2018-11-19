package com.tinder.paywall.viewmodels;

import android.content.res.Resources;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.paywall.viewmodels.k */
public final class C13554k implements Factory<C10089j> {
    /* renamed from: a */
    private final Provider<Resources> f43278a;

    public /* synthetic */ Object get() {
        return m52960a();
    }

    /* renamed from: a */
    public C10089j m52960a() {
        return C13554k.m52959a(this.f43278a);
    }

    /* renamed from: a */
    public static C10089j m52959a(Provider<Resources> provider) {
        return new C10089j((Resources) provider.get());
    }

    /* renamed from: a */
    public static C10089j m52958a(Resources resources) {
        return new C10089j(resources);
    }
}
