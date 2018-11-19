package com.tinder.boost.repository;

import com.tinder.domain.boost.model.BoostStatus;
import rx.functions.Action1;

/* renamed from: com.tinder.boost.repository.c */
final /* synthetic */ class C13655c implements Action1 {
    /* renamed from: a */
    private final C10447a f43498a;

    C13655c(C10447a c10447a) {
        this.f43498a = c10447a;
    }

    public void call(Object obj) {
        this.f43498a.setBoostStatus((BoostStatus) obj);
    }
}
