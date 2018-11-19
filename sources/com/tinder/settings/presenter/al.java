package com.tinder.settings.presenter;

import com.tinder.domain.profile.model.settings.WebProfileSettings;
import rx.functions.Func1;

final /* synthetic */ class al implements Func1 {
    /* renamed from: a */
    static final Func1 f56121a = new al();

    private al() {
    }

    public Object call(Object obj) {
        return ((WebProfileSettings) obj).getUsername();
    }
}
