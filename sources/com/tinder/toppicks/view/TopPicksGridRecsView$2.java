package com.tinder.toppicks.view;

import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.view.OnPreSwipeListener;
import com.tinder.domain.recs.model.SwipeOrigin;
import com.tinder.domain.recs.model.TopPickTeaserRec;
import com.tinder.domain.recs.model.TopPickUserRec;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\t\u0012\u0002\b\u00030\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "card", "Lcom/tinder/cardstack/model/Card;", "", "kotlin.jvm.PlatformType", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "onPreSwipe"}, k = 3, mv = {1, 1, 10})
final class TopPicksGridRecsView$2 implements OnPreSwipeListener {
    /* renamed from: a */
    final /* synthetic */ TopPicksGridRecsView f52662a;

    TopPicksGridRecsView$2(TopPicksGridRecsView topPicksGridRecsView) {
        this.f52662a = topPicksGridRecsView;
    }

    public final boolean onPreSwipe(@NotNull C8395a<Object> c8395a, @NotNull SwipeDirection swipeDirection) {
        C2668g.b(c8395a, "card");
        C2668g.b(swipeDirection, "swipeDirection");
        c8395a = this.f52662a.b(c8395a);
        if (c8395a instanceof TopPickTeaserRec) {
            this.f52662a.a(TopPicksPaywallSource.SWIPE_ON_TEASER);
            return false;
        } else if (!(c8395a instanceof TopPickUserRec)) {
            return false;
        } else {
            switch (C15306g.f47507a[swipeDirection.ordinal()]) {
                case 1:
                    this.f52662a.getPresenter$Tinder_release().passOnRec(c8395a, SwipeOrigin.GRID);
                    break;
                case 2:
                    this.f52662a.getPresenter$Tinder_release().likeOnRec(c8395a, SwipeOrigin.GRID);
                    break;
                default:
                    return false;
            }
            return true;
        }
    }
}
