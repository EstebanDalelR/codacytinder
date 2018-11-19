package com.tinder.recs.presenter;

import com.tinder.recs.view.tappy.TappyCarouselViewTarget;
import com.tinder.recs.view.tappy.TappyCarouselViewTarget_Stub;

public class TappyImageDrawableCarouselViewPresenter_Holder {
    public static void takeAll(TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter, TappyCarouselViewTarget tappyCarouselViewTarget) {
        tappyImageDrawableCarouselViewPresenter.target = tappyCarouselViewTarget;
    }

    public static void dropAll(TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter) {
        tappyImageDrawableCarouselViewPresenter.target = new TappyCarouselViewTarget_Stub();
    }
}
