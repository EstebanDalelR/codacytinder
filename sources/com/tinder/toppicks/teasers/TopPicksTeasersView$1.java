package com.tinder.toppicks.teasers;

import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.view.OnPreSwipeListener;
import com.tinder.domain.toppicks.model.TopPickTeaser;
import com.tinder.paywall.legacy.GoldPaywallSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\t\u0012\u0002\b\u00030\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "card", "Lcom/tinder/cardstack/model/Card;", "", "kotlin.jvm.PlatformType", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "onPreSwipe"}, k = 3, mv = {1, 1, 10})
final class TopPicksTeasersView$1 implements OnPreSwipeListener {
    /* renamed from: a */
    final /* synthetic */ TopPicksTeasersView f52621a;

    TopPicksTeasersView$1(TopPicksTeasersView topPicksTeasersView) {
        this.f52621a = topPicksTeasersView;
    }

    public final boolean onPreSwipe(@NotNull C8395a<Object> c8395a, @NotNull SwipeDirection swipeDirection) {
        C2668g.b(c8395a, "card");
        C2668g.b(swipeDirection, "swipeDirection");
        switch (C15301f.f47472a[swipeDirection.ordinal()]) {
            case 1:
                c8395a = c8395a.getItem();
                if ((c8395a instanceof TopPickTeaser) == null) {
                    c8395a = null;
                }
                if (((TopPickTeaser) c8395a) != null) {
                    TopPickTeasersGridTarget$a.m57430a(this.f52621a, null, GoldPaywallSource.TOP_PICKS_SWIPE_LEFT_ON_REC, 1, null);
                    break;
                }
                break;
            case 2:
                c8395a = c8395a.getItem();
                if ((c8395a instanceof TopPickTeaser) == null) {
                    c8395a = null;
                }
                TopPickTeaser topPickTeaser = (TopPickTeaser) c8395a;
                if (topPickTeaser != null) {
                    this.f52621a.getPresenter().m57452a(topPickTeaser, TopPicksTeasersView.a(this.f52621a, TopPicksTeasersView.a(this.f52621a)), GoldPaywallSource.TOP_PICKS_SWIPE_RIGHT_ON_REC);
                    break;
                }
                break;
            default:
                break;
        }
        return null;
    }
}
