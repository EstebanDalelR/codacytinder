package com.tinder.recs.presenter;

import com.tinder.recs.target.RecsStatusTarget;
import com.tinder.recs.target.RecsStatusTarget_Stub;

public class RecsStatusPresenter_Holder {
    public static void takeAll(RecsStatusPresenter recsStatusPresenter, RecsStatusTarget recsStatusTarget) {
        recsStatusPresenter.target = recsStatusTarget;
        recsStatusPresenter.subscribe$Tinder_release();
    }

    public static void dropAll(RecsStatusPresenter recsStatusPresenter) {
        recsStatusPresenter.unsubscribe$Tinder_release();
        recsStatusPresenter.target = new RecsStatusTarget_Stub();
    }
}
