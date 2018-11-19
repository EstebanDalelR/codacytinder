package com.tinder.reactions.chat.feature;

import com.tinder.chat.view.provider.C8507f;
import com.tinder.reactions.chat.p386a.C14599c;
import com.tinder.reactions.chat.presenter.C14603a;
import com.tinder.reactions.drawer.mediator.C14629b;
import com.tinder.reactions.drawer.provider.C14637a;
import com.tinder.reactions.drawer.provider.C14639g;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.chat.feature.c */
public final class C17947c implements Factory<C16298b> {
    /* renamed from: a */
    private final Provider<C14603a> f55858a;
    /* renamed from: b */
    private final Provider<C14599c> f55859b;
    /* renamed from: c */
    private final Provider<C14639g> f55860c;
    /* renamed from: d */
    private final Provider<C14637a> f55861d;
    /* renamed from: e */
    private final Provider<C8507f> f55862e;
    /* renamed from: f */
    private final Provider<C14629b> f55863f;

    public /* synthetic */ Object get() {
        return m65270a();
    }

    public C17947c(Provider<C14603a> provider, Provider<C14599c> provider2, Provider<C14639g> provider3, Provider<C14637a> provider4, Provider<C8507f> provider5, Provider<C14629b> provider6) {
        this.f55858a = provider;
        this.f55859b = provider2;
        this.f55860c = provider3;
        this.f55861d = provider4;
        this.f55862e = provider5;
        this.f55863f = provider6;
    }

    /* renamed from: a */
    public C16298b m65270a() {
        return C17947c.m65268a(this.f55858a, this.f55859b, this.f55860c, this.f55861d, this.f55862e, this.f55863f);
    }

    /* renamed from: a */
    public static C16298b m65268a(Provider<C14603a> provider, Provider<C14599c> provider2, Provider<C14639g> provider3, Provider<C14637a> provider4, Provider<C8507f> provider5, Provider<C14629b> provider6) {
        return new C16298b((C14603a) provider.get(), (C14599c) provider2.get(), (C14639g) provider3.get(), (C14637a) provider4.get(), (C8507f) provider5.get(), (C14629b) provider6.get());
    }

    /* renamed from: b */
    public static C17947c m65269b(Provider<C14603a> provider, Provider<C14599c> provider2, Provider<C14639g> provider3, Provider<C14637a> provider4, Provider<C8507f> provider5, Provider<C14629b> provider6) {
        return new C17947c(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
