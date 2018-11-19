package com.tinder.presenters;

import com.tinder.domain.common.model.Instagram;
import io.reactivex.functions.Action;

final /* synthetic */ class bl implements Action {
    /* renamed from: a */
    private final bf f49853a;
    /* renamed from: b */
    private final Instagram f49854b;

    bl(bf bfVar, Instagram instagram) {
        this.f49853a = bfVar;
        this.f49854b = instagram;
    }

    public void run() {
        this.f49853a.m54690a(this.f49854b);
    }
}
