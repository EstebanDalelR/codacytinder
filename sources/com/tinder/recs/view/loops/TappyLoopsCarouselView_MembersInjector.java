package com.tinder.recs.view.loops;

import com.tinder.recs.view.loops.presenter.TappyLoopsCarouselViewPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class TappyLoopsCarouselView_MembersInjector implements MembersInjector<TappyLoopsCarouselView> {
    private final Provider<TappyLoopsCarouselViewPresenter> presenterProvider;

    public TappyLoopsCarouselView_MembersInjector(Provider<TappyLoopsCarouselViewPresenter> provider) {
        this.presenterProvider = provider;
    }

    public static MembersInjector<TappyLoopsCarouselView> create(Provider<TappyLoopsCarouselViewPresenter> provider) {
        return new TappyLoopsCarouselView_MembersInjector(provider);
    }

    public void injectMembers(TappyLoopsCarouselView tappyLoopsCarouselView) {
        injectPresenter(tappyLoopsCarouselView, (TappyLoopsCarouselViewPresenter) this.presenterProvider.get());
    }

    public static void injectPresenter(TappyLoopsCarouselView tappyLoopsCarouselView, TappyLoopsCarouselViewPresenter tappyLoopsCarouselViewPresenter) {
        tappyLoopsCarouselView.presenter = tappyLoopsCarouselViewPresenter;
    }
}
