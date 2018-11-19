package com.tinder.paywall.legacy;

import com.tinder.domain.profile.model.ProductType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tinder/paywall/legacy/PaywallTypeSource;", "", "analyticsSource", "", "getAnalyticsSource", "()I", "productType", "Lcom/tinder/domain/profile/model/ProductType;", "getProductType", "()Lcom/tinder/domain/profile/model/ProductType;", "paywall_release"}, k = 1, mv = {1, 1, 10})
public interface PaywallTypeSource {
    int getAnalyticsSource();

    @NotNull
    ProductType getProductType();
}
