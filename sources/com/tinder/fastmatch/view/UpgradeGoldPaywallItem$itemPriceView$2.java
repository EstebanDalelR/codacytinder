package com.tinder.fastmatch.view;

import android.widget.TextView;
import com.tinder.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class UpgradeGoldPaywallItem$itemPriceView$2 extends Lambda implements Function0<TextView> {
    /* renamed from: a */
    final /* synthetic */ UpgradeGoldPaywallItem f44076a;

    UpgradeGoldPaywallItem$itemPriceView$2(UpgradeGoldPaywallItem upgradeGoldPaywallItem) {
        this.f44076a = upgradeGoldPaywallItem;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53472a();
    }

    /* renamed from: a */
    public final TextView m53472a() {
        return (TextView) this.f44076a.findViewById(R.id.item_price);
    }
}
