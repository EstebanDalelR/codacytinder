package com.tinder.common;

import com.tinder.domain.common.model.ProfileUser;
import rx.functions.Action1;

/* renamed from: com.tinder.common.l */
final /* synthetic */ class C13769l implements Action1 {
    /* renamed from: a */
    private final C12781h f43758a;

    C13769l(C12781h c12781h) {
        this.f43758a = c12781h;
    }

    public void call(Object obj) {
        this.f43758a.update((ProfileUser) obj);
    }
}
