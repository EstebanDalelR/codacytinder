package com.tinder.recs.view;

import com.tinder.ads.presenter.FanAdPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class FanAdView_MembersInjector implements MembersInjector<FanAdView> {
    private final Provider<FanAdPresenter> fanAdPresenterProvider;

    public FanAdView_MembersInjector(Provider<FanAdPresenter> provider) {
        this.fanAdPresenterProvider = provider;
    }

    public static MembersInjector<FanAdView> create(Provider<FanAdPresenter> provider) {
        return new FanAdView_MembersInjector(provider);
    }

    public void injectMembers(FanAdView fanAdView) {
        injectFanAdPresenter(fanAdView, (FanAdPresenter) this.fanAdPresenterProvider.get());
    }

    public static void injectFanAdPresenter(FanAdView fanAdView, FanAdPresenter fanAdPresenter) {
        fanAdView.fanAdPresenter = fanAdPresenter;
    }
}
