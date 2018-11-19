package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.GenderSelection;
import com.tinder.onboarding.target.GenderStepTarget;
import rx.functions.Action1;

final /* synthetic */ class ch implements Action1 {
    /* renamed from: a */
    private final GenderSelection f44669a;

    ch(GenderSelection genderSelection) {
        this.f44669a = genderSelection;
    }

    public void call(Object obj) {
        ((GenderStepTarget) obj).setShowMyGender(this.f44669a.showGenderOnProfile().booleanValue());
    }
}
