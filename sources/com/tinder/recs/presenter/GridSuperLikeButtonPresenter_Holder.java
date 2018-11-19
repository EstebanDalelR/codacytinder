package com.tinder.recs.presenter;

import com.tinder.recs.target.GridSuperLikeButtonTarget;
import com.tinder.recs.target.GridSuperLikeButtonTarget_Stub;

public class GridSuperLikeButtonPresenter_Holder {
    public static void takeAll(GridSuperLikeButtonPresenter gridSuperLikeButtonPresenter, GridSuperLikeButtonTarget gridSuperLikeButtonTarget) {
        gridSuperLikeButtonPresenter.target = gridSuperLikeButtonTarget;
        gridSuperLikeButtonPresenter.observeSuperLikeRatingStatus$Tinder_release();
        gridSuperLikeButtonPresenter.observeRatingProcessor$Tinder_release();
    }

    public static void dropAll(GridSuperLikeButtonPresenter gridSuperLikeButtonPresenter) {
        gridSuperLikeButtonPresenter.clear$Tinder_release();
        gridSuperLikeButtonPresenter.target = new GridSuperLikeButtonTarget_Stub();
    }
}
