package com.tinder.presenters;

import com.tinder.domain.common.model.Instagram;
import io.reactivex.functions.Consumer;

final /* synthetic */ class bi implements Consumer {
    /* renamed from: a */
    private final bf f49847a;
    /* renamed from: b */
    private final Runnable f49848b;

    bi(bf bfVar, Runnable runnable) {
        this.f49847a = bfVar;
        this.f49848b = runnable;
    }

    public void accept(Object obj) {
        this.f49847a.m54693a(this.f49848b, (Instagram) obj);
    }
}
