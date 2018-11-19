package com.tinder.recs.view;

import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.recs.presenter.TappyUserRecCardPresenter;
import com.tinder.recs.presenter.UserRecCardPresenter;
import com.tinder.recs.provider.TappyConfigProvider;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.drawable.BottomGradientRenderer;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class TappyUserRecCardView_MembersInjector implements MembersInjector<TappyUserRecCardView> {
    private final Provider<UserRecActivePhotoIndexProvider> activePhotoIndexProvider;
    private final Provider<BottomGradientRenderer> bottomGradientRendererProvider;
    private final Provider<FastMatchConfigProvider> fastMatchConfigProvider;
    private final Provider<UserRecCardPresenter> presenterProvider;
    private final Provider<TappyUserRecCardPresenter> presenterProvider2;
    private final Provider<TappyConfigProvider> tappyConfigProvider;
    private final Provider<TopPicksConfig> topPicksConfigProvider;

    public TappyUserRecCardView_MembersInjector(Provider<UserRecCardPresenter> provider, Provider<UserRecActivePhotoIndexProvider> provider2, Provider<TopPicksConfig> provider3, Provider<FastMatchConfigProvider> provider4, Provider<BottomGradientRenderer> provider5, Provider<TappyConfigProvider> provider6, Provider<TappyUserRecCardPresenter> provider7) {
        this.presenterProvider = provider;
        this.activePhotoIndexProvider = provider2;
        this.topPicksConfigProvider = provider3;
        this.fastMatchConfigProvider = provider4;
        this.bottomGradientRendererProvider = provider5;
        this.tappyConfigProvider = provider6;
        this.presenterProvider2 = provider7;
    }

    public static MembersInjector<TappyUserRecCardView> create(Provider<UserRecCardPresenter> provider, Provider<UserRecActivePhotoIndexProvider> provider2, Provider<TopPicksConfig> provider3, Provider<FastMatchConfigProvider> provider4, Provider<BottomGradientRenderer> provider5, Provider<TappyConfigProvider> provider6, Provider<TappyUserRecCardPresenter> provider7) {
        return new TappyUserRecCardView_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public void injectMembers(TappyUserRecCardView tappyUserRecCardView) {
        BaseUserRecCardView_MembersInjector.injectPresenter(tappyUserRecCardView, (UserRecCardPresenter) this.presenterProvider.get());
        BaseUserRecCardView_MembersInjector.injectActivePhotoIndexProvider(tappyUserRecCardView, (UserRecActivePhotoIndexProvider) this.activePhotoIndexProvider.get());
        BaseUserRecCardView_MembersInjector.injectTopPicksConfig(tappyUserRecCardView, (TopPicksConfig) this.topPicksConfigProvider.get());
        BaseUserRecCardView_MembersInjector.injectFastMatchConfigProvider(tappyUserRecCardView, (FastMatchConfigProvider) this.fastMatchConfigProvider.get());
        BaseUserRecCardView_MembersInjector.injectBottomGradientRenderer(tappyUserRecCardView, (BottomGradientRenderer) this.bottomGradientRendererProvider.get());
        injectTappyConfigProvider(tappyUserRecCardView, (TappyConfigProvider) this.tappyConfigProvider.get());
        injectPresenter(tappyUserRecCardView, (TappyUserRecCardPresenter) this.presenterProvider2.get());
    }

    public static void injectTappyConfigProvider(TappyUserRecCardView tappyUserRecCardView, TappyConfigProvider tappyConfigProvider) {
        tappyUserRecCardView.tappyConfigProvider = tappyConfigProvider;
    }

    public static void injectPresenter(TappyUserRecCardView tappyUserRecCardView, TappyUserRecCardPresenter tappyUserRecCardPresenter) {
        tappyUserRecCardView.presenter = tappyUserRecCardPresenter;
    }
}
