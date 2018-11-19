package com.tinder.recs.view;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.enums.SwipeType;
import com.tinder.recs.analytics.RecsPhotoSource;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.RecProfileView.Listener;
import com.tinder.recs.view.exception.TopRecNotEqualToUserRecException;
import com.tinder.recs.view.exception.UnexpectedImageIndexOnPhotoChangeException;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"com/tinder/recs/view/RecsView$onUserRecCardViewClick$1", "Lcom/tinder/recs/view/RecProfileView$Listener;", "Lcom/tinder/domain/recs/model/UserRec;", "(Lcom/tinder/recs/view/RecsView;)V", "onGamepadButtonClick", "", "swipeType", "Lcom/tinder/enums/SwipeType;", "data", "onPhotoChanged", "index", "", "totalCount", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$onUserRecCardViewClick$1 implements Listener<UserRec> {
    final /* synthetic */ RecsView this$0;

    RecsView$onUserRecCardViewClick$1(RecsView recsView) {
        this.this$0 = recsView;
    }

    public void onGamepadButtonClick(@NotNull SwipeType swipeType, @NotNull UserRec userRec) {
        C2668g.b(swipeType, "swipeType");
        C2668g.b(userRec, ManagerWebServices.FB_DATA);
        RecsView.access$onGamePadButtonClickedFromProfile(this.this$0, swipeType, userRec);
    }

    public void onPhotoChanged(int i, int i2, @NotNull UserRec userRec) {
        C2668g.b(userRec, ManagerWebServices.FB_DATA);
        if (RecsView.access$getTopRecCardView$p(this.this$0) != null && (RecsView.access$getTopRecCardView$p(this.this$0) instanceof BaseUserRecCardView)) {
            BaseUserRecCardView baseUserRecCardView = (BaseUserRecCardView) RecsView.access$getTopRecCardView$p(this.this$0);
            if (baseUserRecCardView == null) {
                C2668g.a();
            }
            UserRec userRec2 = baseUserRecCardView.getUserRecCard().userRec();
            if ((C2668g.a(userRec2, userRec) ^ 1) != 0) {
                RecsView.access$logUnexpectedRecOnPhotoChangeException(this.this$0, (RuntimeException) new TopRecNotEqualToUserRecException());
                return;
            }
            UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider$Tinder_release;
            String id = userRec2.getUser().id();
            String id2 = userRec.getUser().id();
            int photoCount = baseUserRecCardView.getPhotoCount();
            if (i >= 0 && i < photoCount) {
                if (i < i2) {
                    i2 = i;
                    baseUserRecCardView.showPhotoAtIndex(i2);
                    userRecActivePhotoIndexProvider$Tinder_release = this.this$0.getUserRecActivePhotoIndexProvider$Tinder_release();
                    C2668g.a(id2, "userRecId");
                    userRecActivePhotoIndexProvider$Tinder_release.updateActivePhotoIndex(id2, i2);
                    this.this$0.getRecsPhotosViewedCache$Tinder_release().notifyPhotoViewed(i, userRec.getId(), RecsPhotoSource.PROFILE);
                }
            }
            RecsView.access$logUnexpectedRecOnPhotoChangeException(this.this$0, new UnexpectedImageIndexOnPhotoChangeException(i, i2, photoCount, C2668g.a(id, id2)));
            i2 = Math.max(0, photoCount - 1);
            baseUserRecCardView.showPhotoAtIndex(i2);
            userRecActivePhotoIndexProvider$Tinder_release = this.this$0.getUserRecActivePhotoIndexProvider$Tinder_release();
            C2668g.a(id2, "userRecId");
            userRecActivePhotoIndexProvider$Tinder_release.updateActivePhotoIndex(id2, i2);
            this.this$0.getRecsPhotosViewedCache$Tinder_release().notifyPhotoViewed(i, userRec.getId(), RecsPhotoSource.PROFILE);
        }
    }
}
