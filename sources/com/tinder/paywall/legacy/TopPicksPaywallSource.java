package com.tinder.paywall.legacy;

import com.tinder.domain.profile.model.ProductType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "", "Lcom/tinder/paywall/legacy/PaywallTypeSource;", "analyticsSource", "", "(Ljava/lang/String;II)V", "getAnalyticsSource", "()I", "productType", "Lcom/tinder/domain/profile/model/ProductType;", "getProductType", "()Lcom/tinder/domain/profile/model/ProductType;", "TOP_PICKS_NOT_AVAILABLE", "EXHAUSTED_VIEW_EMPTY_STATE", "SCROLL_TO_BOTTOM", "DEEPLINK", "FOOTER_BUTTON", "SWIPE_ON_TEASER", "CLICK_ON_TEASER", "Companion", "paywall_release"}, k = 1, mv = {1, 1, 10})
public enum TopPicksPaywallSource implements PaywallTypeSource {
    ;
    
    public static final C10063a Companion = null;
    private final int analyticsSource;
    @NotNull
    private final ProductType productType;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/paywall/legacy/TopPicksPaywallSource$Companion;", "", "()V", "fromCode", "Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "code", "", "paywall_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.legacy.TopPicksPaywallSource$a */
    public static final class C10063a {
        private C10063a() {
        }

        @NotNull
        /* renamed from: a */
        public final TopPicksPaywallSource m41131a(int i) {
            TopPicksPaywallSource[] values = TopPicksPaywallSource.values();
            Map linkedHashMap = new LinkedHashMap(C19068g.c(ae.a(values.length), 16));
            for (TopPicksPaywallSource topPicksPaywallSource : values) {
                linkedHashMap.put(Integer.valueOf(topPicksPaywallSource.getAnalyticsSource()), topPicksPaywallSource);
            }
            TopPicksPaywallSource topPicksPaywallSource2 = (TopPicksPaywallSource) linkedHashMap.get(Integer.valueOf(i));
            return topPicksPaywallSource2 != null ? topPicksPaywallSource2 : TopPicksPaywallSource.TOP_PICKS_NOT_AVAILABLE;
        }
    }

    protected TopPicksPaywallSource(int i) {
        this.analyticsSource = i;
        this.productType = ProductType.TOP_PICKS;
    }

    public int getAnalyticsSource() {
        return this.analyticsSource;
    }

    static {
        Companion = new C10063a();
    }

    @NotNull
    public ProductType getProductType() {
        return this.productType;
    }
}
