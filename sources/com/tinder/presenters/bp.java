package com.tinder.presenters;

import com.tinder.domain.profile.model.InstagramAuthResult;
import io.reactivex.functions.Consumer;

final /* synthetic */ class bp implements Consumer {
    /* renamed from: a */
    private final bf f49859a;

    bp(bf bfVar) {
        this.f49859a = bfVar;
    }

    public void accept(Object obj) {
        this.f49859a.m54698b((InstagramAuthResult) obj);
    }
}
