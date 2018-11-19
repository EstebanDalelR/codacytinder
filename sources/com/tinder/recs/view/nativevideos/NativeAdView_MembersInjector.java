package com.tinder.recs.view.nativevideos;

import com.tinder.recs.controller.RecsNativeDfpAdController;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class NativeAdView_MembersInjector implements MembersInjector<NativeAdView> {
    private final Provider<RecsNativeDfpAdController> controllerProvider;

    public NativeAdView_MembersInjector(Provider<RecsNativeDfpAdController> provider) {
        this.controllerProvider = provider;
    }

    public static MembersInjector<NativeAdView> create(Provider<RecsNativeDfpAdController> provider) {
        return new NativeAdView_MembersInjector(provider);
    }

    public void injectMembers(NativeAdView nativeAdView) {
        injectController(nativeAdView, (RecsNativeDfpAdController) this.controllerProvider.get());
    }

    public static void injectController(NativeAdView nativeAdView, RecsNativeDfpAdController recsNativeDfpAdController) {
        nativeAdView.controller = recsNativeDfpAdController;
    }
}
