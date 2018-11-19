package com.tinder.pushnotifications.usecase;

import android.app.NotificationManager;
import com.tinder.api.TinderApi;
import com.tinder.common.provider.C2643c;
import com.tinder.data.p218g.p220b.C8665a;
import com.tinder.managers.C2652a;
import com.tinder.managers.bk;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.pushnotifications.usecase.c */
public final class C17890c implements Factory<NotifyPushServer> {
    /* renamed from: a */
    private final Provider<TinderApi> f55782a;
    /* renamed from: b */
    private final Provider<NotificationManager> f55783b;
    /* renamed from: c */
    private final Provider<C2652a> f55784c;
    /* renamed from: d */
    private final Provider<bk> f55785d;
    /* renamed from: e */
    private final Provider<C2643c> f55786e;
    /* renamed from: f */
    private final Provider<C8665a> f55787f;

    public /* synthetic */ Object get() {
        return m65183a();
    }

    public C17890c(Provider<TinderApi> provider, Provider<NotificationManager> provider2, Provider<C2652a> provider3, Provider<bk> provider4, Provider<C2643c> provider5, Provider<C8665a> provider6) {
        this.f55782a = provider;
        this.f55783b = provider2;
        this.f55784c = provider3;
        this.f55785d = provider4;
        this.f55786e = provider5;
        this.f55787f = provider6;
    }

    /* renamed from: a */
    public NotifyPushServer m65183a() {
        return C17890c.m65181a(this.f55782a, this.f55783b, this.f55784c, this.f55785d, this.f55786e, this.f55787f);
    }

    /* renamed from: a */
    public static NotifyPushServer m65181a(Provider<TinderApi> provider, Provider<NotificationManager> provider2, Provider<C2652a> provider3, Provider<bk> provider4, Provider<C2643c> provider5, Provider<C8665a> provider6) {
        return new NotifyPushServer((TinderApi) provider.get(), (NotificationManager) provider2.get(), (C2652a) provider3.get(), (bk) provider4.get(), (C2643c) provider5.get(), (C8665a) provider6.get());
    }

    /* renamed from: b */
    public static C17890c m65182b(Provider<TinderApi> provider, Provider<NotificationManager> provider2, Provider<C2652a> provider3, Provider<bk> provider4, Provider<C2643c> provider5, Provider<C8665a> provider6) {
        return new C17890c(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
