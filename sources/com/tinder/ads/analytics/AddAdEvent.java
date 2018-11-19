package com.tinder.ads.analytics;

import com.tinder.ads.Ad;
import com.tinder.ads.analytics.AdEventFields.Factory;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import rx.Completable;

public abstract class AddAdEvent<REQUEST> {
    private final Factory commonFieldsFactory;
    private final C2630h fireworks;

    protected abstract EtlEvent createEvent(REQUEST request, AdEventFields adEventFields);

    public AddAdEvent(C2630h c2630h, Factory factory) {
        this.fireworks = c2630h;
        this.commonFieldsFactory = factory;
    }

    public Completable execute(REQUEST request, Ad ad) {
        return Completable.a(new AddAdEvent$$Lambda$0(this, ad, request));
    }

    final /* synthetic */ void lambda$execute$0$AddAdEvent(Ad ad, Object obj) {
        this.fireworks.a(createEvent(obj, this.commonFieldsFactory.create(ad)));
    }
}
