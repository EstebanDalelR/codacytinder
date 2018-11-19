package com.tinder.toppicks.teasers;

import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.paywall.legacy.GoldPaywallSource;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
final class TopPicksTeasersView$3 implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ TopPicksTeasersView f47454a;

    TopPicksTeasersView$3(TopPicksTeasersView topPicksTeasersView) {
        this.f47454a = topPicksTeasersView;
    }

    public final void onClick(View view) {
        this.f47454a.getPresenter().m57453a(GoldPaywallSource.TOP_PICKS_FOOTER_BUTTON);
    }
}
