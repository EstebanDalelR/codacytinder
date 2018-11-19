package com.tinder.paywall.legacy;

import com.tinder.domain.profile.model.ProductType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lcom/tinder/paywall/legacy/PlusPaywallSource;", "", "Lcom/tinder/paywall/legacy/PaywallTypeSource;", "analyticsSource", "", "(Ljava/lang/String;II)V", "getAnalyticsSource", "()I", "productType", "Lcom/tinder/domain/profile/model/ProductType;", "getProductType", "()Lcom/tinder/domain/profile/model/ProductType;", "GAMEPAD_UNDO", "PASSPORT_ADD_LOCATION", "PASSPORT_RECENT_LOCATION", "GAMEPAD_LIKE", "GAMEPAD_SUPERLIKE", "BLENDS_ACTIVITY", "SETTINGS_PLUS_BUTTON", "EDIT_PROFILE_ACTIVITY", "CONTROL_UNDO", "CONTROL_UNLIMITED_SWIPES", "CONTROL_HIDE_ADS", "CONTROL_SUPERLIKE_FEATURE", "CONTROL_BOOST_FEATURE", "CONTROL_WHO_SEES_YOU", "CONTROL_YOUR_PROFILE", "CONTROL_OTHER_FEATURE", "CONTROL_PLUS_BUTTON", "DISCOUNT_AVAILABLE", "DISCOUNT_NOTIFICATION", "DISCOUNT_REMINDER", "BOOST_DIALOG_SUMMARY", "DEEPLINK_PLUS", "BOOST_DIALOG_UPSELL_BUTTON", "BOOST_DIALOG_UPDATE", "SUPERLIKE_DIALOG_UPSELL", "PROFILE_TAB", "RECS_EXHAUSTED_SETTINGS", "NATIVE_DFP_AD", "paywall_release"}, k = 1, mv = {1, 1, 10})
public enum PlusPaywallSource implements PaywallTypeSource {
    ;
    
    private final int analyticsSource;
    @NotNull
    private final ProductType productType;

    protected PlusPaywallSource(int i) {
        this.analyticsSource = i;
        this.productType = ProductType.PLUS;
    }

    public int getAnalyticsSource() {
        return this.analyticsSource;
    }

    @NotNull
    public ProductType getProductType() {
        return this.productType;
    }
}
