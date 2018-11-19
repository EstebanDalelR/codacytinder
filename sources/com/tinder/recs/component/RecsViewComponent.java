package com.tinder.recs.component;

import com.tinder.ads.module.RecsAdsModule;
import com.tinder.module.ViewScope;
import com.tinder.recs.module.RecsViewModule;
import com.tinder.recs.view.AdRecCardView;
import com.tinder.recs.view.DiscoveryOffView;
import com.tinder.recs.view.FanAdView;
import com.tinder.recs.view.GamepadView;
import com.tinder.recs.view.RecsStatusView;
import com.tinder.recs.view.RecsView;
import com.tinder.recs.view.SettingsShortcutDialog;
import com.tinder.recs.view.SuperLikeableGameTeaserRecCardView;
import com.tinder.recs.view.TappyUserRecCardView;
import com.tinder.recs.view.UserRecCardHeadLineView;
import com.tinder.recs.view.nativevideos.NativeAdView;
import com.tinder.recs.view.tappy.TappyImageDrawableCarouselView;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import org.jetbrains.annotations.NotNull;

@ViewScope
@Subcomponent(modules = {RecsViewModule.class, RecsAdsModule.class})
public interface RecsViewComponent {

    @dagger.Subcomponent.Builder
    public interface Builder {
        RecsViewComponent build();

        @BindsInstance
        Builder recsView(RecsView recsView);
    }

    @Module(subcomponents = {RecsViewComponent.class})
    public static class InstallModule {
    }

    void inject(AdRecCardView adRecCardView);

    void inject(DiscoveryOffView discoveryOffView);

    void inject(FanAdView fanAdView);

    void inject(GamepadView gamepadView);

    void inject(RecsStatusView recsStatusView);

    void inject(RecsView recsView);

    void inject(SettingsShortcutDialog settingsShortcutDialog);

    void inject(SuperLikeableGameTeaserRecCardView superLikeableGameTeaserRecCardView);

    void inject(TappyUserRecCardView tappyUserRecCardView);

    void inject(UserRecCardHeadLineView userRecCardHeadLineView);

    void inject(@NotNull NativeAdView nativeAdView);

    void inject(TappyImageDrawableCarouselView tappyImageDrawableCarouselView);
}
