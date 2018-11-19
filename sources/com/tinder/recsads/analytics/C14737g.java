package com.tinder.recsads.analytics;

import com.tinder.addy.Ad;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import rx.Completable;

/* renamed from: com.tinder.recsads.analytics.g */
public abstract class C14737g<REQUEST> {
    /* renamed from: a */
    private final C14729c f46313a;
    /* renamed from: b */
    private final C2630h f46314b;

    /* renamed from: a */
    protected abstract EtlEvent mo12150a(REQUEST request, AdEventFields adEventFields);

    public C14737g(C2630h c2630h, C14729c c14729c) {
        this.f46314b = c2630h;
        this.f46313a = c14729c;
    }

    /* renamed from: a */
    public Completable m56002a(REQUEST request, Ad ad) {
        return Completable.a(new C18776h(this, ad, request));
    }

    /* renamed from: a */
    final /* synthetic */ void m56003a(Ad ad, Object obj) {
        this.f46314b.a(mo12150a(obj, this.f46313a.m55978a(ad)));
    }
}
