package com.tinder.session.usecase;

import com.bumptech.glide.RequestManager;
import com.tinder.analytics.C8000b;
import com.tinder.analytics.attribution.AttributionTracker;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.SyncProfileData;
import com.tinder.interactors.C9719k;
import com.tinder.managers.UserMetaManager;
import com.tinder.purchase.usecase.C16245c;
import com.tinder.screenshot.C16559a;
import com.tinder.screenshot.analytics.C16566d;
import com.tinder.session.analytics.C16579a;
import com.tinder.session.p474a.C16576a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.session.usecase.h */
public final class C18057h implements Factory<C14838f> {
    /* renamed from: a */
    private final Provider<UserMetaManager> f56074a;
    /* renamed from: b */
    private final Provider<RequestManager> f56075b;
    /* renamed from: c */
    private final Provider<C14835a> f56076c;
    /* renamed from: d */
    private final Provider<C9719k> f56077d;
    /* renamed from: e */
    private final Provider<AbTestUtility> f56078e;
    /* renamed from: f */
    private final Provider<SyncProfileData> f56079f;
    /* renamed from: g */
    private final Provider<LoadProfileOptionData> f56080g;
    /* renamed from: h */
    private final Provider<C16245c> f56081h;
    /* renamed from: i */
    private final Provider<AttributionTracker> f56082i;
    /* renamed from: j */
    private final Provider<C16579a> f56083j;
    /* renamed from: k */
    private final Provider<C14837d> f56084k;
    /* renamed from: l */
    private final Provider<C16576a> f56085l;
    /* renamed from: m */
    private final Provider<C16559a> f56086m;
    /* renamed from: n */
    private final Provider<C16566d> f56087n;
    /* renamed from: o */
    private final Provider<C8000b> f56088o;

    public /* synthetic */ Object get() {
        return m65547a();
    }

    public C18057h(Provider<UserMetaManager> provider, Provider<RequestManager> provider2, Provider<C14835a> provider3, Provider<C9719k> provider4, Provider<AbTestUtility> provider5, Provider<SyncProfileData> provider6, Provider<LoadProfileOptionData> provider7, Provider<C16245c> provider8, Provider<AttributionTracker> provider9, Provider<C16579a> provider10, Provider<C14837d> provider11, Provider<C16576a> provider12, Provider<C16559a> provider13, Provider<C16566d> provider14, Provider<C8000b> provider15) {
        this.f56074a = provider;
        this.f56075b = provider2;
        this.f56076c = provider3;
        this.f56077d = provider4;
        this.f56078e = provider5;
        this.f56079f = provider6;
        this.f56080g = provider7;
        this.f56081h = provider8;
        this.f56082i = provider9;
        this.f56083j = provider10;
        this.f56084k = provider11;
        this.f56085l = provider12;
        this.f56086m = provider13;
        this.f56087n = provider14;
        this.f56088o = provider15;
    }

    /* renamed from: a */
    public C14838f m65547a() {
        return C18057h.m65545a(this.f56074a, this.f56075b, this.f56076c, this.f56077d, this.f56078e, this.f56079f, this.f56080g, this.f56081h, this.f56082i, this.f56083j, this.f56084k, this.f56085l, this.f56086m, this.f56087n, this.f56088o);
    }

    /* renamed from: a */
    public static C14838f m65545a(Provider<UserMetaManager> provider, Provider<RequestManager> provider2, Provider<C14835a> provider3, Provider<C9719k> provider4, Provider<AbTestUtility> provider5, Provider<SyncProfileData> provider6, Provider<LoadProfileOptionData> provider7, Provider<C16245c> provider8, Provider<AttributionTracker> provider9, Provider<C16579a> provider10, Provider<C14837d> provider11, Provider<C16576a> provider12, Provider<C16559a> provider13, Provider<C16566d> provider14, Provider<C8000b> provider15) {
        return new C14838f((UserMetaManager) provider.get(), (RequestManager) provider2.get(), (C14835a) provider3.get(), (C9719k) provider4.get(), (AbTestUtility) provider5.get(), (SyncProfileData) provider6.get(), (LoadProfileOptionData) provider7.get(), (C16245c) provider8.get(), (AttributionTracker) provider9.get(), (C16579a) provider10.get(), (C14837d) provider11.get(), (C16576a) provider12.get(), (C16559a) provider13.get(), (C16566d) provider14.get(), (C8000b) provider15.get());
    }

    /* renamed from: b */
    public static C18057h m65546b(Provider<UserMetaManager> provider, Provider<RequestManager> provider2, Provider<C14835a> provider3, Provider<C9719k> provider4, Provider<AbTestUtility> provider5, Provider<SyncProfileData> provider6, Provider<LoadProfileOptionData> provider7, Provider<C16245c> provider8, Provider<AttributionTracker> provider9, Provider<C16579a> provider10, Provider<C14837d> provider11, Provider<C16576a> provider12, Provider<C16559a> provider13, Provider<C16566d> provider14, Provider<C8000b> provider15) {
        return new C18057h(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }
}
