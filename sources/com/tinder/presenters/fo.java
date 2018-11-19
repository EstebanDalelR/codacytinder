package com.tinder.presenters;

import com.tinder.auth.model.C8291f;
import com.tinder.targets.MainActivityTarget;
import io.reactivex.functions.Consumer;

final /* synthetic */ class fo implements Consumer {
    /* renamed from: a */
    private final df f49904a;
    /* renamed from: b */
    private final MainActivityTarget f49905b;

    fo(df dfVar, MainActivityTarget mainActivityTarget) {
        this.f49904a = dfVar;
        this.f49905b = mainActivityTarget;
    }

    public void accept(Object obj) {
        this.f49904a.m64820a(this.f49905b, (C8291f) obj);
    }
}
