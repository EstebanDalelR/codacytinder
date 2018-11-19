package com.tinder.feed.view;

import com.tinder.feed.analytics.InteractType;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedOverflowButton$reportProfileActionItem$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ FeedOverflowButton f44169a;

    FeedOverflowButton$reportProfileActionItem$1(FeedOverflowButton feedOverflowButton) {
        this.f44169a = feedOverflowButton;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53541a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53541a() {
        this.f44169a.f38220a.onItemSelected(InteractType.REPORT);
    }
}
