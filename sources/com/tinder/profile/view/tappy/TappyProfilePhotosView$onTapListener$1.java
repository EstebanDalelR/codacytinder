package com.tinder.profile.view.tappy;

import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "region", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "selectedPage", "", "isOverTap", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class TappyProfilePhotosView$onTapListener$1 extends Lambda implements Function3<TapRegion, Integer, Boolean, C15813i> {
    /* renamed from: a */
    final /* synthetic */ TappyProfilePhotosView f58004a;

    TappyProfilePhotosView$onTapListener$1(TappyProfilePhotosView tappyProfilePhotosView) {
        this.f58004a = tappyProfilePhotosView;
        super(3);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m67054a((TapRegion) obj, ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67054a(@NotNull TapRegion tapRegion, int i, boolean z) {
        C2668g.b(tapRegion, "region");
        this.f58004a.getTappablePager().setCurrentItem(i, false);
        if (z) {
            this.f58004a.m64964a(tapRegion);
        }
    }
}
