package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.content.Context;
import com.snapchat.kit.sdk.bitmoji.OnBitmojiSearchFocusChangeListener;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5887d;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5891c;
import com.snapchat.kit.sdk.bitmoji.search.PrefixTagSearchEngine;
import com.snapchat.kit.sdk.bitmoji.ui.p157a.C7129a;
import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.l */
public final class C7885l implements Factory<C7884k> {
    /* renamed from: a */
    private final Provider<Context> f28469a;
    /* renamed from: b */
    private final Provider<C5927a> f28470b;
    /* renamed from: c */
    private final Provider<PrefixTagSearchEngine> f28471c;
    /* renamed from: d */
    private final Provider<C7129a> f28472d;
    /* renamed from: e */
    private final Provider<BitmojiTagResultsViewController> f28473e;
    /* renamed from: f */
    private final Provider<C5918a> f28474f;
    /* renamed from: g */
    private final Provider<C5891c> f28475g;
    /* renamed from: h */
    private final Provider<C5887d> f28476h;
    /* renamed from: i */
    private final Provider<OnBitmojiSearchFocusChangeListener> f28477i;

    public /* synthetic */ Object get() {
        return m33736a();
    }

    public C7885l(Provider<Context> provider, Provider<C5927a> provider2, Provider<PrefixTagSearchEngine> provider3, Provider<C7129a> provider4, Provider<BitmojiTagResultsViewController> provider5, Provider<C5918a> provider6, Provider<C5891c> provider7, Provider<C5887d> provider8, Provider<OnBitmojiSearchFocusChangeListener> provider9) {
        this.f28469a = provider;
        this.f28470b = provider2;
        this.f28471c = provider3;
        this.f28472d = provider4;
        this.f28473e = provider5;
        this.f28474f = provider6;
        this.f28475g = provider7;
        this.f28476h = provider8;
        this.f28477i = provider9;
    }

    /* renamed from: a */
    public C7884k m33736a() {
        return new C7884k((Context) this.f28469a.get(), (C5927a) this.f28470b.get(), (PrefixTagSearchEngine) this.f28471c.get(), (C7129a) this.f28472d.get(), (BitmojiTagResultsViewController) this.f28473e.get(), (C5918a) this.f28474f.get(), (C5891c) this.f28475g.get(), (C5887d) this.f28476h.get(), (OnBitmojiSearchFocusChangeListener) this.f28477i.get());
    }

    /* renamed from: a */
    public static Factory<C7884k> m33735a(Provider<Context> provider, Provider<C5927a> provider2, Provider<PrefixTagSearchEngine> provider3, Provider<C7129a> provider4, Provider<BitmojiTagResultsViewController> provider5, Provider<C5918a> provider6, Provider<C5891c> provider7, Provider<C5887d> provider8, Provider<OnBitmojiSearchFocusChangeListener> provider9) {
        return new C7885l(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }
}
