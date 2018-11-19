package com.tinder.intropricing.paywall.view.offers;

import com.tinder.intropricing.C9728a.C9723c;
import com.tinder.paywall.view.itemsgroup.ItemsGroupView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class IntroPricingOffersView$pricingOffersGroup$2 extends Lambda implements Function0<ItemsGroupView> {
    /* renamed from: a */
    final /* synthetic */ IntroPricingOffersView f44500a;

    IntroPricingOffersView$pricingOffersGroup$2(IntroPricingOffersView introPricingOffersView) {
        this.f44500a = introPricingOffersView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53737a();
    }

    /* renamed from: a */
    public final ItemsGroupView m53737a() {
        return (ItemsGroupView) this.f44500a.findViewById(C9723c.intro_pricing_offers_group);
    }
}
