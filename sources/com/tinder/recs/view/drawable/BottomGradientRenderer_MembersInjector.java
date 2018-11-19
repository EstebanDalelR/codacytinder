package com.tinder.recs.view.drawable;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class BottomGradientRenderer_MembersInjector implements MembersInjector<BottomGradientRenderer> {
    private final Provider<BottomGradientDrawableCache> bottomGradientDrawableCacheProvider;

    public BottomGradientRenderer_MembersInjector(Provider<BottomGradientDrawableCache> provider) {
        this.bottomGradientDrawableCacheProvider = provider;
    }

    public static MembersInjector<BottomGradientRenderer> create(Provider<BottomGradientDrawableCache> provider) {
        return new BottomGradientRenderer_MembersInjector(provider);
    }

    public void injectMembers(BottomGradientRenderer bottomGradientRenderer) {
        injectBottomGradientDrawableCache(bottomGradientRenderer, (BottomGradientDrawableCache) this.bottomGradientDrawableCacheProvider.get());
    }

    public static void injectBottomGradientDrawableCache(BottomGradientRenderer bottomGradientRenderer, BottomGradientDrawableCache bottomGradientDrawableCache) {
        bottomGradientRenderer.bottomGradientDrawableCache = bottomGradientDrawableCache;
    }
}
