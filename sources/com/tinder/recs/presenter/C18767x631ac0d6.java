package com.tinder.recs.presenter;

import kotlin.Metadata;
import p000a.p001a.C0001a;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.presenter.GamepadPresenter$subscribeToGamepadCounterSession$gamepadCounterSessionSubscription$3 */
final class C18767x631ac0d6<T> implements Action1<Throwable> {
    public static final C18767x631ac0d6 INSTANCE = new C18767x631ac0d6();

    C18767x631ac0d6() {
    }

    public final void call(Throwable th) {
        C0001a.c(th, "Error subscribing to gamepadCounterInfo", new Object[0]);
    }
}
