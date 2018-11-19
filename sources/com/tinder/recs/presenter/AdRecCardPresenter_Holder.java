package com.tinder.recs.presenter;

import com.tinder.recs.target.AdRecCardTarget;
import com.tinder.recs.target.AdRecCardTarget_Stub;

public class AdRecCardPresenter_Holder {
    public static void takeAll(AdRecCardPresenter adRecCardPresenter, AdRecCardTarget adRecCardTarget) {
        adRecCardPresenter.target = adRecCardTarget;
    }

    public static void dropAll(AdRecCardPresenter adRecCardPresenter) {
        adRecCardPresenter.target = new AdRecCardTarget_Stub();
    }
}
