package com.tinder.settings.presenter;

import com.tinder.R;
import com.tinder.settings.targets.SettingsTarget;
import rx.functions.Action1;

final /* synthetic */ class ai implements Action1 {
    /* renamed from: a */
    static final Action1 f58414a = new ai();

    private ai() {
    }

    public void call(Object obj) {
        ((SettingsTarget) obj).showRatingView(R.string.give_feedback);
    }
}
