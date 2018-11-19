package com.tinder.presenters;

import com.tinder.domain.common.model.Instagram;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

final /* synthetic */ class bk implements Consumer {
    /* renamed from: a */
    private final bf f49850a;
    /* renamed from: b */
    private final int f49851b;
    /* renamed from: c */
    private final Instagram f49852c;

    bk(bf bfVar, int i, Instagram instagram) {
        this.f49850a = bfVar;
        this.f49851b = i;
        this.f49852c = instagram;
    }

    public void accept(Object obj) {
        this.f49850a.m54689a(this.f49851b, this.f49852c, (Disposable) obj);
    }
}
