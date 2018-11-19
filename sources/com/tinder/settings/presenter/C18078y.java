package com.tinder.settings.presenter;

import com.tinder.domain.pushnotifications.usecase.UnregisterPushToken;
import rx.functions.Func1;

/* renamed from: com.tinder.settings.presenter.y */
final /* synthetic */ class C18078y implements Func1 {
    /* renamed from: a */
    private final UnregisterPushToken f56160a;

    private C18078y(UnregisterPushToken unregisterPushToken) {
        this.f56160a = unregisterPushToken;
    }

    /* renamed from: a */
    static Func1 m65653a(UnregisterPushToken unregisterPushToken) {
        return new C18078y(unregisterPushToken);
    }

    public Object call(Object obj) {
        return this.f56160a.execute((String) obj);
    }
}
