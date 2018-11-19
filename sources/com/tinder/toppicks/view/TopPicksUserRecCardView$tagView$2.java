package com.tinder.toppicks.view;

import com.tinder.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/toppicks/view/TopPicksTagView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class TopPicksUserRecCardView$tagView$2 extends Lambda implements Function0<TopPicksTagView> {
    /* renamed from: a */
    final /* synthetic */ TopPicksUserRecCardView f58706a;

    TopPicksUserRecCardView$tagView$2(TopPicksUserRecCardView topPicksUserRecCardView) {
        this.f58706a = topPicksUserRecCardView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m67494a();
    }

    /* renamed from: a */
    public final TopPicksTagView m67494a() {
        return (TopPicksTagView) this.f58706a.findViewById(R.id.tag_view);
    }
}
