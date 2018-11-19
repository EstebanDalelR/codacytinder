package com.tinder.boost.repository;

import com.tinder.boost.model.C10428i;
import rx.functions.Action1;

/* renamed from: com.tinder.boost.repository.e */
final /* synthetic */ class C13656e implements Action1 {
    /* renamed from: a */
    private final C10447a f43499a;

    C13656e(C10447a c10447a) {
        this.f43499a = c10447a;
    }

    public void call(Object obj) {
        this.f43499a.setBoostStatus((C10428i) obj);
    }
}
