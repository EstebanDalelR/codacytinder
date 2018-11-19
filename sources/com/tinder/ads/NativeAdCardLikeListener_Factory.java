package com.tinder.ads;

import com.tinder.recs.view.RecsView;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NativeAdCardLikeListener_Factory implements Factory<NativeAdCardLikeListener> {
    private final Provider<RecsView> recsViewProvider;

    public NativeAdCardLikeListener_Factory(Provider<RecsView> provider) {
        this.recsViewProvider = provider;
    }

    public NativeAdCardLikeListener get() {
        return provideInstance(this.recsViewProvider);
    }

    public static NativeAdCardLikeListener provideInstance(Provider<RecsView> provider) {
        return new NativeAdCardLikeListener((RecsView) provider.get());
    }

    public static NativeAdCardLikeListener_Factory create(Provider<RecsView> provider) {
        return new NativeAdCardLikeListener_Factory(provider);
    }

    public static NativeAdCardLikeListener newNativeAdCardLikeListener(RecsView recsView) {
        return new NativeAdCardLikeListener(recsView);
    }
}
