package com.snapchat.kit.sdk.bitmoji.ui.p157a;

import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5886c;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5891c;
import com.squareup.picasso.Picasso;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.a.b */
public final class C7874b implements Factory<C7129a> {
    /* renamed from: a */
    private final Provider<C5886c> f28413a;
    /* renamed from: b */
    private final Provider<C5891c> f28414b;
    /* renamed from: c */
    private final Provider<C5891c> f28415c;
    /* renamed from: d */
    private final Provider<Picasso> f28416d;

    public /* synthetic */ Object get() {
        return m33694a();
    }

    public C7874b(Provider<C5886c> provider, Provider<C5891c> provider2, Provider<C5891c> provider3, Provider<Picasso> provider4) {
        this.f28413a = provider;
        this.f28414b = provider2;
        this.f28415c = provider3;
        this.f28416d = provider4;
    }

    /* renamed from: a */
    public C7129a m33694a() {
        return new C7129a((C5886c) this.f28413a.get(), (C5891c) this.f28414b.get(), (C5891c) this.f28415c.get(), (Picasso) this.f28416d.get());
    }

    /* renamed from: a */
    public static Factory<C7129a> m33693a(Provider<C5886c> provider, Provider<C5891c> provider2, Provider<C5891c> provider3, Provider<Picasso> provider4) {
        return new C7874b(provider, provider2, provider3, provider4);
    }
}
