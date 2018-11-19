package com.tinder.views;

import com.tinder.utils.ad;
import rx.functions.Action1;

/* renamed from: com.tinder.views.q */
final /* synthetic */ class C18998q implements Action1 {
    /* renamed from: a */
    static final Action1 f58773a = new C18998q();

    private C18998q() {
    }

    public void call(Object obj) {
        ad.a("Failed to load bitmap for avatar", (Throwable) obj);
    }
}
