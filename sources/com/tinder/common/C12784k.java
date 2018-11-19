package com.tinder.common;

import com.tinder.model.User;
import com.tinder.model.adapter.domain.CurrentUserLegacyUserAdapter;
import rx.functions.Func1;

/* renamed from: com.tinder.common.k */
final /* synthetic */ class C12784k implements Func1 {
    /* renamed from: a */
    private final CurrentUserLegacyUserAdapter f41177a;

    private C12784k(CurrentUserLegacyUserAdapter currentUserLegacyUserAdapter) {
        this.f41177a = currentUserLegacyUserAdapter;
    }

    /* renamed from: a */
    static Func1 m50263a(CurrentUserLegacyUserAdapter currentUserLegacyUserAdapter) {
        return new C12784k(currentUserLegacyUserAdapter);
    }

    public Object call(Object obj) {
        return this.f41177a.adapt((User) obj);
    }
}
