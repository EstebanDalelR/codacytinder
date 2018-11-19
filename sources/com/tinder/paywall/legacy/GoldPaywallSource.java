package com.tinder.paywall.legacy;

import com.tinder.domain.profile.model.ProductType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u001cB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001d"}, d2 = {"Lcom/tinder/paywall/legacy/GoldPaywallSource;", "", "Lcom/tinder/paywall/legacy/PaywallTypeSource;", "analyticsSource", "", "(Ljava/lang/String;II)V", "getAnalyticsSource", "()I", "productType", "Lcom/tinder/domain/profile/model/ProductType;", "getProductType", "()Lcom/tinder/domain/profile/model/ProductType;", "FASTMATCH_MATCHLIST_PREVIEW", "SETTINGS_BUTTON", "FASTMATCH_INTRO", "DEEPLINK", "CONTROLLA_FASTMATCH_FEATURE", "TOP_PICKS_FOOTER_BUTTON", "TOP_PICKS_SCROLL_TO_BOTTOM", "TOP_PICKS_SWIPE_LEFT_ON_REC", "TOP_PICKS_SWIPE_RIGHT_ON_REC", "TOP_PICKS_VIEWING_PROFILE", "LIKES_BOUNCER", "REWIND", "TOP_PICKS_DEEPLINK", "NATIVE_DFP_AD", "PLACES_SWIPE", "PLACES_PROFILE", "Companion", "paywall_release"}, k = 1, mv = {1, 1, 10})
public enum GoldPaywallSource implements PaywallTypeSource {
    ;
    
    public static final C10061a Companion = null;
    private final int analyticsSource;
    @NotNull
    private final ProductType productType;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/paywall/legacy/GoldPaywallSource$Companion;", "", "()V", "fromSource", "Lcom/tinder/paywall/legacy/PaywallTypeSource;", "source", "", "paywall_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.legacy.GoldPaywallSource$a */
    public static final class C10061a {
        private C10061a() {
        }

        @Nullable
        /* renamed from: a */
        public final PaywallTypeSource m41129a(int i) {
            GoldPaywallSource[] values = GoldPaywallSource.values();
            Map linkedHashMap = new LinkedHashMap(C19068g.c(ae.a(values.length), 16));
            for (GoldPaywallSource goldPaywallSource : values) {
                linkedHashMap.put(Integer.valueOf(goldPaywallSource.getAnalyticsSource()), goldPaywallSource);
            }
            return (PaywallTypeSource) linkedHashMap.get(Integer.valueOf(i));
        }
    }

    protected GoldPaywallSource(int i) {
        this.analyticsSource = i;
        this.productType = ProductType.GOLD;
    }

    public int getAnalyticsSource() {
        return this.analyticsSource;
    }

    static {
        Companion = new C10061a();
    }

    @NotNull
    public ProductType getProductType() {
        return this.productType;
    }
}
