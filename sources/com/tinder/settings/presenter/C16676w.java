package com.tinder.settings.presenter;

import com.tinder.domain.recs.model.RecsLoadingStatus;
import io.reactivex.functions.Consumer;

/* renamed from: com.tinder.settings.presenter.w */
final /* synthetic */ class C16676w implements Consumer {
    /* renamed from: a */
    private final C18077q f51594a;

    C16676w(C18077q c18077q) {
        this.f51594a = c18077q;
    }

    public void accept(Object obj) {
        this.f51594a.m65622a((RecsLoadingStatus) obj);
    }
}
