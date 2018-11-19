package com.tinder.loops.views;

import com.tinder.loops.analytics.TutorialAction;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class MediaSelectorView$showMediaTooltip$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ MediaSelectorView f44546a;

    MediaSelectorView$showMediaTooltip$1(MediaSelectorView mediaSelectorView) {
        this.f44546a = mediaSelectorView;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53784a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53784a() {
        this.f44546a.dismissTooltip(TutorialAction.TAP_TOOLTIP);
    }
}
