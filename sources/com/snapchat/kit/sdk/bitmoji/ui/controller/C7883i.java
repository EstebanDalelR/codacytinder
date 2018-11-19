package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.content.Context;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5885a;
import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.i */
public final class C7883i implements Factory<C7882h> {
    /* renamed from: a */
    private final Provider<Context> f28448a;
    /* renamed from: b */
    private final Provider<C5927a> f28449b;
    /* renamed from: c */
    private final Provider<MetricQueue<ServerEvent>> f28450c;
    /* renamed from: d */
    private final Provider<C5885a> f28451d;

    public /* synthetic */ Object get() {
        return m33725a();
    }

    public C7883i(Provider<Context> provider, Provider<C5927a> provider2, Provider<MetricQueue<ServerEvent>> provider3, Provider<C5885a> provider4) {
        this.f28448a = provider;
        this.f28449b = provider2;
        this.f28450c = provider3;
        this.f28451d = provider4;
    }

    /* renamed from: a */
    public C7882h m33725a() {
        return new C7882h((Context) this.f28448a.get(), (C5927a) this.f28449b.get(), (MetricQueue) this.f28450c.get(), (C5885a) this.f28451d.get());
    }

    /* renamed from: a */
    public static Factory<C7882h> m33724a(Provider<Context> provider, Provider<C5927a> provider2, Provider<MetricQueue<ServerEvent>> provider3, Provider<C5885a> provider4) {
        return new C7883i(provider, provider2, provider3, provider4);
    }
}
