package com.tinder.toppicks.view;

import com.tinder.toppicks.C15235b.C15226b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class TopPicksTagView$tagTextSize$2 extends Lambda implements Function0<Float> {
    /* renamed from: a */
    final /* synthetic */ TopPicksTagView f58705a;

    TopPicksTagView$tagTextSize$2(TopPicksTagView topPicksTagView) {
        this.f58705a = topPicksTagView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return Float.valueOf(m67493a());
    }

    /* renamed from: a */
    public final float m67493a() {
        return this.f58705a.getResources().getDimension(C15226b.tagged_card_text_size);
    }
}
