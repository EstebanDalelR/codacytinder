package com.tinder.settings.presenter;

import com.tinder.R;
import com.tinder.settings.targets.SettingsTarget;
import rx.functions.Action1;

final /* synthetic */ class aj implements Action1 {
    /* renamed from: a */
    static final Action1 f58415a = new aj();

    private aj() {
    }

    public void call(Object obj) {
        ((SettingsTarget) obj).showRatingView(R.string.rate_us);
    }
}
