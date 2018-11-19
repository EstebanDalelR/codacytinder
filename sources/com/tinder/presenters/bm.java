package com.tinder.presenters;

import com.tinder.domain.common.model.Instagram;
import io.reactivex.functions.Consumer;

final /* synthetic */ class bm implements Consumer {
    /* renamed from: a */
    private final bf f49855a;
    /* renamed from: b */
    private final Instagram f49856b;

    bm(bf bfVar, Instagram instagram) {
        this.f49855a = bfVar;
        this.f49856b = instagram;
    }

    public void accept(Object obj) {
        this.f49855a.m54691a(this.f49856b, (Throwable) obj);
    }
}
