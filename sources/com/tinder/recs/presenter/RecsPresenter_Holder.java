package com.tinder.recs.presenter;

import com.tinder.recs.target.RecsTarget;
import com.tinder.recs.target.RecsTarget_Stub;

public class RecsPresenter_Holder {
    public static void takeAll(RecsPresenter recsPresenter, RecsTarget recsTarget) {
        recsPresenter.target = recsTarget;
        recsPresenter.subscribe$Tinder_release();
        recsPresenter.startMonitoringForScreenshots$Tinder_release();
        recsPresenter.observeSwipeRatingStatus();
        recsPresenter.observeAdSwipeTerminationRule();
        recsPresenter.observeShouldShowNudgeAnimation();
        recsPresenter.subscribeToDiscoverySettingsChanges();
        recsPresenter.subscribeToSuperLikeableViewStateChanges();
        recsPresenter.subscribeToSuperLikeStatusChanges();
    }

    public static void dropAll(RecsPresenter recsPresenter) {
        recsPresenter.unsubscribe();
        recsPresenter.unSubscribeToSuperLikeableViewStateChanges();
        recsPresenter.unSubscribeToSuperLikeStatusChanges();
        recsPresenter.target = new RecsTarget_Stub();
    }
}
