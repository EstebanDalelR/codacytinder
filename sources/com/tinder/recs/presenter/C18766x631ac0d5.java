package com.tinder.recs.presenter;

import com.tinder.gamepadcounters.C9671a;
import com.tinder.recs.target.GamepadTarget;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/gamepadcounters/GamePadButtonCounterInfo;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.presenter.GamepadPresenter$subscribeToGamepadCounterSession$gamepadCounterSessionSubscription$2 */
final class C18766x631ac0d5<T> implements Action1<C9671a> {
    final /* synthetic */ GamepadPresenter this$0;

    C18766x631ac0d5(GamepadPresenter gamepadPresenter) {
        this.this$0 = gamepadPresenter;
    }

    public final void call(C9671a c9671a) {
        GamepadTarget target$Tinder_release = this.this$0.getTarget$Tinder_release();
        C2668g.a(c9671a, "it");
        target$Tinder_release.animateGamepadCounters(c9671a);
    }
}
