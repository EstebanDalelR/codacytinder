package com.tinder.module;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.recsads.model.C16465c;
import com.tinder.recsads.model.RecsAdsConfig;
import com.tinder.sponsoredmessage.C15034e;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/module/AdsConfigModule;", "", "()V", "provideRecsAdConfig", "Lcom/tinder/recsads/model/RecsAdsConfig;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "provideRecsAdConfig$Tinder_release", "provideSponsoredMessageConfig", "Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;", "provideSponsoredMessageConfig$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.module.a */
public final class C9939a {
    @NotNull
    @Provides
    /* renamed from: a */
    public final RecsAdsConfig m40761a(@NotNull AbTestUtility abTestUtility) {
        C2668g.b(abTestUtility, "abTestUtility");
        boolean isRecsFanAdsEnabled = abTestUtility.isRecsFanAdsEnabled();
        String fanPlacementId = abTestUtility.fanPlacementId();
        C2668g.a(fanPlacementId, "abTestUtility.fanPlacementId()");
        String fanVideoPlacementId = abTestUtility.fanVideoPlacementId();
        C2668g.a(fanVideoPlacementId, "abTestUtility.fanVideoPlacementId()");
        return new C16465c(abTestUtility.getAdsCadence(), abTestUtility.getSecondaryAdCadence(), 2, 4.0d, abTestUtility.isSwipeOpenForAdsEnabled(), "/7214/mat.tinder", "11729726", "11739876", "11768403", "11768418", isRecsFanAdsEnabled, fanPlacementId, fanVideoPlacementId, abTestUtility.isRecsNativeVideoDfpAdsEnabled(), abTestUtility.isRecsNativeDisplayDfpAdsEnabled(), abTestUtility.isAddyV2Enabled(), "11754121", abTestUtility.isDfpBrandedProfileRecEnabled(), abTestUtility.isFanVideoAdEnabled(), abTestUtility.shouldShowAdsForTinderPlusUsers(), abTestUtility.tinderHouseAdsEnabled());
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final C15034e m40762b(@NotNull AbTestUtility abTestUtility) {
        C2668g.b(abTestUtility, "abTestUtility");
        return new C15034e(abTestUtility.isSponsoredMessageEnabled(), "/7214/mat.tinder", "11726193", abTestUtility.getAdMessageRequestCadenceMs(), abTestUtility.getMinimumMessageAdInterstice(), abTestUtility.shouldShowAdsForTinderPlusUsers());
    }
}
