package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.content.Context;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5887d;
import com.snapchat.kit.sdk.bitmoji.ui.p157a.C7129a;
import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.c */
public final class C7877c implements Factory<BitmojiTagResultsViewController> {
    /* renamed from: a */
    private final Provider<Context> f28420a;
    /* renamed from: b */
    private final Provider<C5927a> f28421b;
    /* renamed from: c */
    private final Provider<C7129a> f28422c;
    /* renamed from: d */
    private final Provider<C5918a> f28423d;
    /* renamed from: e */
    private final Provider<C5887d> f28424e;

    public /* synthetic */ Object get() {
        return m33700a();
    }

    public C7877c(Provider<Context> provider, Provider<C5927a> provider2, Provider<C7129a> provider3, Provider<C5918a> provider4, Provider<C5887d> provider5) {
        this.f28420a = provider;
        this.f28421b = provider2;
        this.f28422c = provider3;
        this.f28423d = provider4;
        this.f28424e = provider5;
    }

    /* renamed from: a */
    public BitmojiTagResultsViewController m33700a() {
        return new BitmojiTagResultsViewController((Context) this.f28420a.get(), (C5927a) this.f28421b.get(), (C7129a) this.f28422c.get(), (C5918a) this.f28423d.get(), (C5887d) this.f28424e.get());
    }

    /* renamed from: a */
    public static Factory<BitmojiTagResultsViewController> m33699a(Provider<Context> provider, Provider<C5927a> provider2, Provider<C7129a> provider3, Provider<C5918a> provider4, Provider<C5887d> provider5) {
        return new C7877c(provider, provider2, provider3, provider4, provider5);
    }
}
