package com.tinder.profile.view.tappy;

import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "invoke"}, k = 3, mv = {1, 1, 10})
final class TappableViewPager$tapDetector$1 extends Lambda implements Function1<TapRegion, C15813i> {
    /* renamed from: a */
    final /* synthetic */ TappableViewPager f57999a;

    TappableViewPager$tapDetector$1(TappableViewPager tappableViewPager) {
        this.f57999a = tappableViewPager;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67051a((TapRegion) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67051a(@NotNull TapRegion tapRegion) {
        C2668g.b(tapRegion, "it");
        this.f57999a.m61087a(tapRegion);
    }
}
