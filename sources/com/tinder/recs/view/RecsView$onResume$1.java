package com.tinder.recs.view;

import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/recs/view/AdRecCardView;", "invoke"}, k = 3, mv = {1, 1, 10})
final class RecsView$onResume$1 extends Lambda implements Function1<AdRecCardView, C15813i> {
    public static final RecsView$onResume$1 INSTANCE = new RecsView$onResume$1();

    RecsView$onResume$1() {
        super(1);
    }

    public final void invoke(@NotNull AdRecCardView adRecCardView) {
        C2668g.b(adRecCardView, "it");
        adRecCardView.resume();
    }
}
