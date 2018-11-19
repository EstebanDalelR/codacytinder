package com.tinder.recs.view;

import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class UserRecCardHeadLineView_MembersInjector implements MembersInjector<UserRecCardHeadLineView> {
    private final Provider<FastMatchConfigProvider> fastMatchConfigProvider;
    private final Provider<TopPicksConfig> topPicksConfigProvider;

    public UserRecCardHeadLineView_MembersInjector(Provider<FastMatchConfigProvider> provider, Provider<TopPicksConfig> provider2) {
        this.fastMatchConfigProvider = provider;
        this.topPicksConfigProvider = provider2;
    }

    public static MembersInjector<UserRecCardHeadLineView> create(Provider<FastMatchConfigProvider> provider, Provider<TopPicksConfig> provider2) {
        return new UserRecCardHeadLineView_MembersInjector(provider, provider2);
    }

    public void injectMembers(UserRecCardHeadLineView userRecCardHeadLineView) {
        injectFastMatchConfigProvider(userRecCardHeadLineView, (FastMatchConfigProvider) this.fastMatchConfigProvider.get());
        injectTopPicksConfig(userRecCardHeadLineView, (TopPicksConfig) this.topPicksConfigProvider.get());
    }

    public static void injectFastMatchConfigProvider(UserRecCardHeadLineView userRecCardHeadLineView, FastMatchConfigProvider fastMatchConfigProvider) {
        userRecCardHeadLineView.fastMatchConfigProvider = fastMatchConfigProvider;
    }

    public static void injectTopPicksConfig(UserRecCardHeadLineView userRecCardHeadLineView, TopPicksConfig topPicksConfig) {
        userRecCardHeadLineView.topPicksConfig = topPicksConfig;
    }
}
