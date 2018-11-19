package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.content.Context;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5885a;
import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.e */
public final class C7879e implements Factory<C7878d> {
    /* renamed from: a */
    private final Provider<Context> f28430a;
    /* renamed from: b */
    private final Provider<C5927a> f28431b;
    /* renamed from: c */
    private final Provider<C5885a> f28432c;
    /* renamed from: d */
    private final Provider<MetricQueue<ServerEvent>> f28433d;
    /* renamed from: e */
    private final Provider<String> f28434e;

    public /* synthetic */ Object get() {
        return m33710a();
    }

    public C7879e(Provider<Context> provider, Provider<C5927a> provider2, Provider<C5885a> provider3, Provider<MetricQueue<ServerEvent>> provider4, Provider<String> provider5) {
        this.f28430a = provider;
        this.f28431b = provider2;
        this.f28432c = provider3;
        this.f28433d = provider4;
        this.f28434e = provider5;
    }

    /* renamed from: a */
    public C7878d m33710a() {
        return new C7878d((Context) this.f28430a.get(), (C5927a) this.f28431b.get(), (C5885a) this.f28432c.get(), (MetricQueue) this.f28433d.get(), (String) this.f28434e.get());
    }

    /* renamed from: a */
    public static Factory<C7878d> m33709a(Provider<Context> provider, Provider<C5927a> provider2, Provider<C5885a> provider3, Provider<MetricQueue<ServerEvent>> provider4, Provider<String> provider5) {
        return new C7879e(provider, provider2, provider3, provider4, provider5);
    }
}
