package com.tinder.intropricing.paywall.view.offers;

import android.widget.TextView;
import com.tinder.intropricing.C9728a.C9723c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class IntroPricingOfferView$offerLength$2 extends Lambda implements Function0<TextView> {
    /* renamed from: a */
    final /* synthetic */ C11892a f44494a;

    IntroPricingOfferView$offerLength$2(C11892a c11892a) {
        this.f44494a = c11892a;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53731a();
    }

    /* renamed from: a */
    public final TextView m53731a() {
        return (TextView) this.f44494a.findViewById(C9723c.intro_pricing_offer_length);
    }
}
