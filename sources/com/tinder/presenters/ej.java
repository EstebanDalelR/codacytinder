package com.tinder.presenters;

import com.tinder.domain.match.model.Match;
import com.tinder.targets.MainActivityTarget;
import io.reactivex.functions.Consumer;

final /* synthetic */ class ej implements Consumer {
    /* renamed from: a */
    private final df f49883a;
    /* renamed from: b */
    private final MainActivityTarget f49884b;

    ej(df dfVar, MainActivityTarget mainActivityTarget) {
        this.f49883a = dfVar;
        this.f49884b = mainActivityTarget;
    }

    public void accept(Object obj) {
        this.f49883a.m64821a(this.f49884b, (Match) obj);
    }
}
