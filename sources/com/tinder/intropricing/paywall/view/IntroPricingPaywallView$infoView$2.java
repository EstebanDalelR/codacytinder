package com.tinder.intropricing.paywall.view;

import com.tinder.intropricing.C9728a.C9723c;
import com.tinder.intropricing.paywall.view.info.IntroPricingInfoView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/intropricing/paywall/view/info/IntroPricingInfoView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class IntroPricingPaywallView$infoView$2 extends Lambda implements Function0<IntroPricingInfoView> {
    /* renamed from: a */
    final /* synthetic */ IntroPricingPaywallView f44479a;

    IntroPricingPaywallView$infoView$2(IntroPricingPaywallView introPricingPaywallView) {
        this.f44479a = introPricingPaywallView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53716a();
    }

    /* renamed from: a */
    public final IntroPricingInfoView m53716a() {
        return (IntroPricingInfoView) this.f44479a.findViewById(C9723c.intro_pricing_info);
    }
}