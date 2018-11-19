package com.tinder.paywall.domain;

import com.tinder.domain.profile.model.ProductType;
import io.reactivex.C3959e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/paywall/domain/PaywallRepository;", "", "observePaywallUpdates", "Lio/reactivex/Observable;", "Lcom/tinder/paywall/domain/Paywall;", "type", "Lcom/tinder/domain/profile/model/ProductType;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface PaywallRepository {
    @NotNull
    C3959e<C10060a> observePaywallUpdates(@NotNull ProductType productType);
}
