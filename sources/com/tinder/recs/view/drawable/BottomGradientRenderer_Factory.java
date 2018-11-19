package com.tinder.recs.view.drawable;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class BottomGradientRenderer_Factory implements Factory<BottomGradientRenderer> {
    private final Provider<BottomGradientDrawableCache> bottomGradientDrawableCacheProvider;

    public BottomGradientRenderer_Factory(Provider<BottomGradientDrawableCache> provider) {
        this.bottomGradientDrawableCacheProvider = provider;
    }

    public BottomGradientRenderer get() {
        return provideInstance(this.bottomGradientDrawableCacheProvider);
    }

    public static BottomGradientRenderer provideInstance(Provider<BottomGradientDrawableCache> provider) {
        BottomGradientRenderer bottomGradientRenderer = new BottomGradientRenderer();
        BottomGradientRenderer_MembersInjector.injectBottomGradientDrawableCache(bottomGradientRenderer, (BottomGradientDrawableCache) provider.get());
        return bottomGradientRenderer;
    }

    public static BottomGradientRenderer_Factory create(Provider<BottomGradientDrawableCache> provider) {
        return new BottomGradientRenderer_Factory(provider);
    }

    public static BottomGradientRenderer newBottomGradientRenderer() {
        return new BottomGradientRenderer();
    }
}
