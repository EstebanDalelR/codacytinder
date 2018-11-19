package com.tinder.recs.view;

import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.recs.presenter.UserRecCardPresenter;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.drawable.BottomGradientRenderer;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class BaseUserRecCardView_MembersInjector implements MembersInjector<BaseUserRecCardView> {
    private final Provider<UserRecActivePhotoIndexProvider> activePhotoIndexProvider;
    private final Provider<BottomGradientRenderer> bottomGradientRendererProvider;
    private final Provider<FastMatchConfigProvider> fastMatchConfigProvider;
    private final Provider<UserRecCardPresenter> presenterProvider;
    private final Provider<TopPicksConfig> topPicksConfigProvider;

    public BaseUserRecCardView_MembersInjector(Provider<UserRecCardPresenter> provider, Provider<UserRecActivePhotoIndexProvider> provider2, Provider<TopPicksConfig> provider3, Provider<FastMatchConfigProvider> provider4, Provider<BottomGradientRenderer> provider5) {
        this.presenterProvider = provider;
        this.activePhotoIndexProvider = provider2;
        this.topPicksConfigProvider = provider3;
        this.fastMatchConfigProvider = provider4;
        this.bottomGradientRendererProvider = provider5;
    }

    public static MembersInjector<BaseUserRecCardView> create(Provider<UserRecCardPresenter> provider, Provider<UserRecActivePhotoIndexProvider> provider2, Provider<TopPicksConfig> provider3, Provider<FastMatchConfigProvider> provider4, Provider<BottomGradientRenderer> provider5) {
        return new BaseUserRecCardView_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public void injectMembers(BaseUserRecCardView baseUserRecCardView) {
        injectPresenter(baseUserRecCardView, (UserRecCardPresenter) this.presenterProvider.get());
        injectActivePhotoIndexProvider(baseUserRecCardView, (UserRecActivePhotoIndexProvider) this.activePhotoIndexProvider.get());
        injectTopPicksConfig(baseUserRecCardView, (TopPicksConfig) this.topPicksConfigProvider.get());
        injectFastMatchConfigProvider(baseUserRecCardView, (FastMatchConfigProvider) this.fastMatchConfigProvider.get());
        injectBottomGradientRenderer(baseUserRecCardView, (BottomGradientRenderer) this.bottomGradientRendererProvider.get());
    }

    public static void injectPresenter(BaseUserRecCardView baseUserRecCardView, UserRecCardPresenter userRecCardPresenter) {
        baseUserRecCardView.presenter = userRecCardPresenter;
    }

    public static void injectActivePhotoIndexProvider(BaseUserRecCardView baseUserRecCardView, UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider) {
        baseUserRecCardView.activePhotoIndexProvider = userRecActivePhotoIndexProvider;
    }

    public static void injectTopPicksConfig(BaseUserRecCardView baseUserRecCardView, TopPicksConfig topPicksConfig) {
        baseUserRecCardView.topPicksConfig = topPicksConfig;
    }

    public static void injectFastMatchConfigProvider(BaseUserRecCardView baseUserRecCardView, FastMatchConfigProvider fastMatchConfigProvider) {
        baseUserRecCardView.fastMatchConfigProvider = fastMatchConfigProvider;
    }

    public static void injectBottomGradientRenderer(BaseUserRecCardView baseUserRecCardView, BottomGradientRenderer bottomGradientRenderer) {
        baseUserRecCardView.bottomGradientRenderer = bottomGradientRenderer;
    }
}
