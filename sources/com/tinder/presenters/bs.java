package com.tinder.presenters;

import com.tinder.domain.profile.model.InstagramAuthResult;
import io.reactivex.functions.Consumer;

final /* synthetic */ class bs implements Consumer {
    /* renamed from: a */
    private final bf f49862a;

    bs(bf bfVar) {
        this.f49862a = bfVar;
    }

    public void accept(Object obj) {
        this.f49862a.m54692a((InstagramAuthResult) obj);
    }
}
