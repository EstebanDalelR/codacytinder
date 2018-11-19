package com.tinder.presenters;

import com.tinder.domain.common.model.Instagram;
import io.reactivex.functions.Function;

final /* synthetic */ class bg implements Function {
    /* renamed from: a */
    private final bf f49844a;
    /* renamed from: b */
    private final int f49845b;

    bg(bf bfVar, int i) {
        this.f49844a = bfVar;
        this.f49845b = i;
    }

    public Object apply(Object obj) {
        return this.f49844a.m54686a(this.f49845b, (Instagram) obj);
    }
}
