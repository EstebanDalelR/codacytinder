package com.tinder.paywall.legacy;

import com.tinder.domain.profile.model.ProductType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/tinder/paywall/legacy/SuperlikePaywallSource;", "", "Lcom/tinder/paywall/legacy/PaywallTypeSource;", "analyticsSource", "", "(Ljava/lang/String;II)V", "getAnalyticsSource", "()I", "productType", "Lcom/tinder/domain/profile/model/ProductType;", "getProductType", "()Lcom/tinder/domain/profile/model/ProductType;", "SUPERLIKE_EXHAUSTED", "SETTINGS_SUPERLIKE_BUTTON", "PLUS_CONTROL_SUPERLIKE_BUTTON", "DEEPLINK_SUPERLIKE", "TOP_PICKS", "PROFILE_TAB_SUPERLIKE", "paywall_release"}, k = 1, mv = {1, 1, 10})
public enum SuperlikePaywallSource implements PaywallTypeSource {
    ;
    
    private final int analyticsSource;
    @NotNull
    private final ProductType productType;

    protected SuperlikePaywallSource(int i) {
        this.analyticsSource = i;
        this.productType = ProductType.SUPERLIKE;
    }

    public int getAnalyticsSource() {
        return this.analyticsSource;
    }

    @NotNull
    public ProductType getProductType() {
        return this.productType;
    }
}
