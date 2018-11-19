package com.tinder.toppicks.view;

import android.view.View;
import com.tinder.recs.domain.model.CustomRecEngineResetReason.RetryOnError;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 10})
final class TopPicksGoldView$5 extends Lambda implements Function1<View, C15813i> {
    /* renamed from: a */
    final /* synthetic */ TopPicksGoldView f58695a;

    TopPicksGoldView$5(TopPicksGoldView topPicksGoldView) {
        this.f58695a = topPicksGoldView;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67483a((View) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67483a(@NotNull View view) {
        C2668g.b(view, "it");
        TopPicksGoldView.b(this.f58695a).reset(RetryOnError.INSTANCE);
    }
}
