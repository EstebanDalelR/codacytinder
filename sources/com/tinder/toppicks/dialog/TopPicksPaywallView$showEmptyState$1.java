package com.tinder.toppicks.dialog;

import com.tinder.R;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "formattedDateString", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class TopPicksPaywallView$showEmptyState$1 extends Lambda implements Function1<String, C15813i> {
    /* renamed from: a */
    final /* synthetic */ TopPicksPaywallView f58687a;

    TopPicksPaywallView$showEmptyState$1(TopPicksPaywallView topPicksPaywallView) {
        this.f58687a = topPicksPaywallView;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67475a((String) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67475a(@NotNull String str) {
        C2668g.b(str, "formattedDateString");
        this.f58687a.f52411j.setText(this.f58687a.getResources().getString(R.string.top_picks_alc_paywall_no_offers_byline, new Object[]{str}));
    }
}
