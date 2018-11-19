package com.tinder.recs.presenter;

import com.tinder.recs.target.TappyUserRecCardTarget;
import com.tinder.recs.target.TappyUserRecCardTarget_Stub;

public class TappyUserRecCardPresenter_Holder {
    public static void takeAll(TappyUserRecCardPresenter tappyUserRecCardPresenter, TappyUserRecCardTarget tappyUserRecCardTarget) {
        tappyUserRecCardPresenter.target = tappyUserRecCardTarget;
    }

    public static void dropAll(TappyUserRecCardPresenter tappyUserRecCardPresenter) {
        tappyUserRecCardPresenter.onDropTarget();
        tappyUserRecCardPresenter.target = new TappyUserRecCardTarget_Stub();
    }
}
