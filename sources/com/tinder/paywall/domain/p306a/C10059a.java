package com.tinder.paywall.domain.p306a;

import com.tinder.domain.profile.model.ProductType;
import com.tinder.paywall.domain.C10060a;
import com.tinder.paywall.domain.PaywallRepository;
import io.reactivex.C3959e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/paywall/domain/usecase/ObservePaywallUpdate;", "", "paywallRepository", "Lcom/tinder/paywall/domain/PaywallRepository;", "(Lcom/tinder/paywall/domain/PaywallRepository;)V", "execute", "Lio/reactivex/Observable;", "Lcom/tinder/paywall/domain/Paywall;", "type", "Lcom/tinder/domain/profile/model/ProductType;", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.domain.a.a */
public final class C10059a {
    /* renamed from: a */
    private final PaywallRepository f32956a;

    @Inject
    public C10059a(@NotNull PaywallRepository paywallRepository) {
        C2668g.b(paywallRepository, "paywallRepository");
        this.f32956a = paywallRepository;
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<C10060a> m41127a(@NotNull ProductType productType) {
        C2668g.b(productType, "type");
        return this.f32956a.observePaywallUpdates(productType);
    }
}
