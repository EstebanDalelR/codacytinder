package com.tinder.toppicks.emptyview;

import android.content.Context;
import android.widget.TextView;
import com.tinder.toppicks.C15235b.C15232h;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "formattedTime", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class TopPicksEmptyView$setCountdownTime$1 extends Lambda implements Function1<String, C15813i> {
    /* renamed from: a */
    final /* synthetic */ TopPicksEmptyView f58689a;

    TopPicksEmptyView$setCountdownTime$1(TopPicksEmptyView topPicksEmptyView) {
        this.f58689a = topPicksEmptyView;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67477a((String) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67477a(@NotNull String str) {
        C2668g.b(str, "formattedTime");
        TextView b = this.f58689a.f52442d;
        Context context = this.f58689a.getContext();
        C2668g.a(context, "context");
        b.setText(context.getResources().getString(C15232h.top_picks_alc_paywall_out_of_tps_byline, new Object[]{str}));
    }
}
