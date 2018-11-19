package com.tinder.recs.view.loops.presenter;

import dagger.internal.Factory;

public final class TappyLoopsCarouselViewPresenter_Factory implements Factory<TappyLoopsCarouselViewPresenter> {
    private static final TappyLoopsCarouselViewPresenter_Factory INSTANCE = new TappyLoopsCarouselViewPresenter_Factory();

    public TappyLoopsCarouselViewPresenter get() {
        return provideInstance();
    }

    public static TappyLoopsCarouselViewPresenter provideInstance() {
        return new TappyLoopsCarouselViewPresenter();
    }

    public static TappyLoopsCarouselViewPresenter_Factory create() {
        return INSTANCE;
    }

    public static TappyLoopsCarouselViewPresenter newTappyLoopsCarouselViewPresenter() {
        return new TappyLoopsCarouselViewPresenter();
    }
}
