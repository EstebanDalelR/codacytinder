package com.tinder.recs.view.drawable;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class BottomGradientDrawableCache_Factory implements Factory<BottomGradientDrawableCache> {
    private final Provider<Context> contextProvider;

    public BottomGradientDrawableCache_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public BottomGradientDrawableCache get() {
        return provideInstance(this.contextProvider);
    }

    public static BottomGradientDrawableCache provideInstance(Provider<Context> provider) {
        return new BottomGradientDrawableCache((Context) provider.get());
    }

    public static BottomGradientDrawableCache_Factory create(Provider<Context> provider) {
        return new BottomGradientDrawableCache_Factory(provider);
    }

    public static BottomGradientDrawableCache newBottomGradientDrawableCache(Context context) {
        return new BottomGradientDrawableCache(context);
    }
}
