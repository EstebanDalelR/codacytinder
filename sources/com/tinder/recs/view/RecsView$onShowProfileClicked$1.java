package com.tinder.recs.view;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.recs.model.Rec;
import com.tinder.enums.SwipeType;
import com.tinder.recs.view.RecProfileView.Listener;
import com.tinder.recsads.C16456c.C14753a;
import com.tinder.recsads.view.BrandedProfileCardRecCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"com/tinder/recs/view/RecsView$onShowProfileClicked$1", "Lcom/tinder/recs/view/RecProfileView$Listener;", "Lcom/tinder/recsads/BrandedAdRecProfileView$BpcAdRecProfileViewModel;", "(Lcom/tinder/recs/view/RecsView;Lcom/tinder/domain/recs/model/Rec;)V", "onGamepadButtonClick", "", "swipeType", "Lcom/tinder/enums/SwipeType;", "data", "onPhotoChanged", "index", "", "totalCount", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$onShowProfileClicked$1 implements Listener<C14753a> {
    final /* synthetic */ Rec $adRec;
    final /* synthetic */ RecsView this$0;

    RecsView$onShowProfileClicked$1(RecsView recsView, Rec rec) {
        this.this$0 = recsView;
        this.$adRec = rec;
    }

    public void onGamepadButtonClick(@NotNull SwipeType swipeType, @NotNull C14753a c14753a) {
        C2668g.b(swipeType, "swipeType");
        C2668g.b(c14753a, ManagerWebServices.FB_DATA);
        if (swipeType == SwipeType.SUPER_LIKE_BUTTON) {
            throw ((Throwable) new IllegalStateException("Cannot SuperLike a BPC Ad REC"));
        }
        RecsView.access$onGamePadButtonClickedFromProfile(this.this$0, swipeType, c14753a.m56026a());
    }

    public void onPhotoChanged(int i, int i2, @NotNull C14753a c14753a) {
        C2668g.b(c14753a, ManagerWebServices.FB_DATA);
        i2 = c14753a.m56026a();
        if (!(RecsView.access$getTopRecCardView$p(this.this$0) == null || (RecsView.access$getTopRecCardView$p(this.this$0) instanceof BrandedProfileCardRecCardView) == null)) {
            if ((C2668g.a(i2, this.$adRec) ^ 1) == 0) {
                BrandedProfileCardRecCardView brandedProfileCardRecCardView = (BrandedProfileCardRecCardView) RecsView.access$getTopRecCardView$p(this.this$0);
                if (brandedProfileCardRecCardView == null) {
                    C2668g.a();
                }
                brandedProfileCardRecCardView.a(i);
            }
        }
    }
}
