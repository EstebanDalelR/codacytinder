package com.tinder.purchase.logging.p376a;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.tinder.boost.p178a.C10400d;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.managers.bk;
import com.tinder.passport.p093d.C3945a;
import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.superlike.p419b.C15071e;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.logging.a.b */
public final class C17835b implements Factory<C14521a> {
    /* renamed from: a */
    private final Provider<bk> f55653a;
    /* renamed from: b */
    private final Provider<C3945a> f55654b;
    /* renamed from: c */
    private final Provider<C15071e> f55655c;
    /* renamed from: d */
    private final Provider<C10400d> f55656d;
    /* renamed from: e */
    private final Provider<OfferRepository> f55657e;
    /* renamed from: f */
    private final Provider<TelephonyManager> f55658f;
    /* renamed from: g */
    private final Provider<ConnectivityManager> f55659g;
    /* renamed from: h */
    private final Provider<Biller> f55660h;
    /* renamed from: i */
    private final Provider<SubscriptionProvider> f55661i;
    /* renamed from: j */
    private final Provider<AbTestUtility> f55662j;

    public /* synthetic */ Object get() {
        return m65126a();
    }

    public C17835b(Provider<bk> provider, Provider<C3945a> provider2, Provider<C15071e> provider3, Provider<C10400d> provider4, Provider<OfferRepository> provider5, Provider<TelephonyManager> provider6, Provider<ConnectivityManager> provider7, Provider<Biller> provider8, Provider<SubscriptionProvider> provider9, Provider<AbTestUtility> provider10) {
        this.f55653a = provider;
        this.f55654b = provider2;
        this.f55655c = provider3;
        this.f55656d = provider4;
        this.f55657e = provider5;
        this.f55658f = provider6;
        this.f55659g = provider7;
        this.f55660h = provider8;
        this.f55661i = provider9;
        this.f55662j = provider10;
    }

    /* renamed from: a */
    public C14521a m65126a() {
        return C17835b.m65124a(this.f55653a, this.f55654b, this.f55655c, this.f55656d, this.f55657e, this.f55658f, this.f55659g, this.f55660h, this.f55661i, this.f55662j);
    }

    /* renamed from: a */
    public static C14521a m65124a(Provider<bk> provider, Provider<C3945a> provider2, Provider<C15071e> provider3, Provider<C10400d> provider4, Provider<OfferRepository> provider5, Provider<TelephonyManager> provider6, Provider<ConnectivityManager> provider7, Provider<Biller> provider8, Provider<SubscriptionProvider> provider9, Provider<AbTestUtility> provider10) {
        return new C14521a((bk) provider.get(), (C3945a) provider2.get(), (C15071e) provider3.get(), (C10400d) provider4.get(), (OfferRepository) provider5.get(), (TelephonyManager) provider6.get(), (ConnectivityManager) provider7.get(), (Biller) provider8.get(), (SubscriptionProvider) provider9.get(), (AbTestUtility) provider10.get());
    }

    /* renamed from: b */
    public static C17835b m65125b(Provider<bk> provider, Provider<C3945a> provider2, Provider<C15071e> provider3, Provider<C10400d> provider4, Provider<OfferRepository> provider5, Provider<TelephonyManager> provider6, Provider<ConnectivityManager> provider7, Provider<Biller> provider8, Provider<SubscriptionProvider> provider9, Provider<AbTestUtility> provider10) {
        return new C17835b(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }
}
