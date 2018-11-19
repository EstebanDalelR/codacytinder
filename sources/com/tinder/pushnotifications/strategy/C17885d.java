package com.tinder.pushnotifications.strategy;

import android.content.Context;
import android.os.Handler;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.pushnotifications.p381b.C14551a;
import com.tinder.pushnotifications.usecase.NotifyPushServer;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.pushnotifications.strategy.d */
public final class C17885d implements Factory<C16270c> {
    /* renamed from: a */
    private final Provider<Context> f55772a;
    /* renamed from: b */
    private final Provider<AppVisibilityTracker> f55773b;
    /* renamed from: c */
    private final Provider<Handler> f55774c;
    /* renamed from: d */
    private final Provider<NotifyPushServer> f55775d;
    /* renamed from: e */
    private final Provider<C14551a> f55776e;
    /* renamed from: f */
    private final Provider<AbTestUtility> f55777f;

    public /* synthetic */ Object get() {
        return m65174a();
    }

    public C17885d(Provider<Context> provider, Provider<AppVisibilityTracker> provider2, Provider<Handler> provider3, Provider<NotifyPushServer> provider4, Provider<C14551a> provider5, Provider<AbTestUtility> provider6) {
        this.f55772a = provider;
        this.f55773b = provider2;
        this.f55774c = provider3;
        this.f55775d = provider4;
        this.f55776e = provider5;
        this.f55777f = provider6;
    }

    /* renamed from: a */
    public C16270c m65174a() {
        return C17885d.m65172a(this.f55772a, this.f55773b, this.f55774c, this.f55775d, this.f55776e, this.f55777f);
    }

    /* renamed from: a */
    public static C16270c m65172a(Provider<Context> provider, Provider<AppVisibilityTracker> provider2, Provider<Handler> provider3, Provider<NotifyPushServer> provider4, Provider<C14551a> provider5, Provider<AbTestUtility> provider6) {
        return new C16270c((Context) provider.get(), (AppVisibilityTracker) provider2.get(), (Handler) provider3.get(), (NotifyPushServer) provider4.get(), (C14551a) provider5.get(), (AbTestUtility) provider6.get());
    }

    /* renamed from: b */
    public static C17885d m65173b(Provider<Context> provider, Provider<AppVisibilityTracker> provider2, Provider<Handler> provider3, Provider<NotifyPushServer> provider4, Provider<C14551a> provider5, Provider<AbTestUtility> provider6) {
        return new C17885d(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
