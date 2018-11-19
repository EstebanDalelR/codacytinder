package com.tinder.data.meta.p227b;

import com.tinder.api.TinderUserApi;
import com.tinder.data.meta.p226a.C10845e;
import com.tinder.data.meta.p226a.C10846g;
import com.tinder.data.meta.p226a.C10847i;
import com.tinder.data.meta.p226a.C10849m;
import com.tinder.data.meta.p226a.C10850p;
import com.tinder.data.meta.store.MetaStore;
import com.tinder.data.p222i.C8669a;
import com.tinder.data.p222i.p354a.C12902a;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.settings.notifications.NotificationSettingsRepository;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.domain.toppicks.repo.TopPicksSettingRepository;
import com.tinder.intropricing.domain.repo.IntroPricingApplicationRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;

/* renamed from: com.tinder.data.meta.b.u */
public final class C12981u implements Factory<C10851a> {
    /* renamed from: a */
    private final Provider<TinderUserApi> f41546a;
    /* renamed from: b */
    private final Provider<MetaStore> f41547b;
    /* renamed from: c */
    private final Provider<C10845e> f41548c;
    /* renamed from: d */
    private final Provider<C10846g> f41549d;
    /* renamed from: e */
    private final Provider<C10847i> f41550e;
    /* renamed from: f */
    private final Provider<FastMatchConfigProvider> f41551f;
    /* renamed from: g */
    private final Provider<IntroPricingApplicationRepository> f41552g;
    /* renamed from: h */
    private final Provider<C10849m> f41553h;
    /* renamed from: i */
    private final Provider<SubscriptionProvider> f41554i;
    /* renamed from: j */
    private final Provider<Function0<Integer>> f41555j;
    /* renamed from: k */
    private final Provider<NotificationSettingsRepository> f41556k;
    /* renamed from: l */
    private final Provider<C10850p> f41557l;
    /* renamed from: m */
    private final Provider<TopPicksApplicationRepository> f41558m;
    /* renamed from: n */
    private final Provider<C8669a> f41559n;
    /* renamed from: o */
    private final Provider<PlacesAvailableProvider> f41560o;
    /* renamed from: p */
    private final Provider<C12902a> f41561p;
    /* renamed from: q */
    private final Provider<TopPicksSettingRepository> f41562q;

    public /* synthetic */ Object get() {
        return m50728a();
    }

    public C12981u(Provider<TinderUserApi> provider, Provider<MetaStore> provider2, Provider<C10845e> provider3, Provider<C10846g> provider4, Provider<C10847i> provider5, Provider<FastMatchConfigProvider> provider6, Provider<IntroPricingApplicationRepository> provider7, Provider<C10849m> provider8, Provider<SubscriptionProvider> provider9, Provider<Function0<Integer>> provider10, Provider<NotificationSettingsRepository> provider11, Provider<C10850p> provider12, Provider<TopPicksApplicationRepository> provider13, Provider<C8669a> provider14, Provider<PlacesAvailableProvider> provider15, Provider<C12902a> provider16, Provider<TopPicksSettingRepository> provider17) {
        this.f41546a = provider;
        this.f41547b = provider2;
        this.f41548c = provider3;
        this.f41549d = provider4;
        this.f41550e = provider5;
        this.f41551f = provider6;
        this.f41552g = provider7;
        this.f41553h = provider8;
        this.f41554i = provider9;
        this.f41555j = provider10;
        this.f41556k = provider11;
        this.f41557l = provider12;
        this.f41558m = provider13;
        this.f41559n = provider14;
        this.f41560o = provider15;
        this.f41561p = provider16;
        this.f41562q = provider17;
    }

    /* renamed from: a */
    public C10851a m50728a() {
        Provider provider = this.f41546a;
        Provider provider2 = this.f41547b;
        Provider provider3 = this.f41548c;
        Provider provider4 = this.f41549d;
        Provider provider5 = this.f41550e;
        Provider provider6 = this.f41551f;
        Provider provider7 = this.f41552g;
        Provider provider8 = this.f41553h;
        Provider provider9 = this.f41554i;
        Provider provider10 = this.f41555j;
        Provider provider11 = this.f41556k;
        Provider provider12 = this.f41557l;
        Provider provider13 = this.f41558m;
        Provider provider14 = this.f41559n;
        Provider provider15 = this.f41560o;
        return C12981u.m50726a(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, this.f41561p, this.f41562q);
    }

    /* renamed from: a */
    public static C10851a m50726a(Provider<TinderUserApi> provider, Provider<MetaStore> provider2, Provider<C10845e> provider3, Provider<C10846g> provider4, Provider<C10847i> provider5, Provider<FastMatchConfigProvider> provider6, Provider<IntroPricingApplicationRepository> provider7, Provider<C10849m> provider8, Provider<SubscriptionProvider> provider9, Provider<Function0<Integer>> provider10, Provider<NotificationSettingsRepository> provider11, Provider<C10850p> provider12, Provider<TopPicksApplicationRepository> provider13, Provider<C8669a> provider14, Provider<PlacesAvailableProvider> provider15, Provider<C12902a> provider16, Provider<TopPicksSettingRepository> provider17) {
        return new C10851a((TinderUserApi) provider.get(), (MetaStore) provider2.get(), (C10845e) provider3.get(), (C10846g) provider4.get(), (C10847i) provider5.get(), (FastMatchConfigProvider) provider6.get(), (IntroPricingApplicationRepository) provider7.get(), (C10849m) provider8.get(), (SubscriptionProvider) provider9.get(), (Function0) provider10.get(), (NotificationSettingsRepository) provider11.get(), (C10850p) provider12.get(), (TopPicksApplicationRepository) provider13.get(), (C8669a) provider14.get(), (PlacesAvailableProvider) provider15.get(), (C12902a) provider16.get(), (TopPicksSettingRepository) provider17.get());
    }

    /* renamed from: b */
    public static C12981u m50727b(Provider<TinderUserApi> provider, Provider<MetaStore> provider2, Provider<C10845e> provider3, Provider<C10846g> provider4, Provider<C10847i> provider5, Provider<FastMatchConfigProvider> provider6, Provider<IntroPricingApplicationRepository> provider7, Provider<C10849m> provider8, Provider<SubscriptionProvider> provider9, Provider<Function0<Integer>> provider10, Provider<NotificationSettingsRepository> provider11, Provider<C10850p> provider12, Provider<TopPicksApplicationRepository> provider13, Provider<C8669a> provider14, Provider<PlacesAvailableProvider> provider15, Provider<C12902a> provider16, Provider<TopPicksSettingRepository> provider17) {
        return new C12981u(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }
}
