package com.tinder.recs.view;

import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.model.SwipeDirection;
import com.tinder.cardstack.view.OnPreSwipeListener;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\t\u0012\u0002\b\u00030\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "card", "Lcom/tinder/cardstack/model/Card;", "", "kotlin.jvm.PlatformType", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "onPreSwipe"}, k = 3, mv = {1, 1, 10})
final class RecsView$preSwipeListener$1 implements OnPreSwipeListener {
    final /* synthetic */ RecsView this$0;

    RecsView$preSwipeListener$1(RecsView recsView) {
        this.this$0 = recsView;
    }

    public final boolean onPreSwipe(@NotNull C8395a<Object> c8395a, @NotNull SwipeDirection swipeDirection) {
        C2668g.b(c8395a, "card");
        C2668g.b(swipeDirection, "swipeDirection");
        if (!RecsView.access$isSwipesEnabled$p(this.this$0)) {
            return false;
        }
        c8395a = RecsView.access$getRec(this.this$0, c8395a);
        boolean z = true;
        switch (RecsView$WhenMappings.$EnumSwitchMapping$0[swipeDirection.ordinal()]) {
            case 1:
                if (RecFieldDecorationExtensionsKt.isSuperLikeable(c8395a) != null) {
                    this.this$0.getPresenter$Tinder_release().superlikeOnRecFromCard(c8395a);
                    break;
                }
                return false;
            case 2:
                this.this$0.getPresenter$Tinder_release().passOnRecFromCard(c8395a);
                break;
            case 3:
                this.this$0.getPresenter$Tinder_release().likeOnRecFromCard(c8395a);
                break;
            default:
                z = false;
                break;
        }
        return z;
    }
}
