package com.tinder.recs.view;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.enums.SwipeType;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.RecProfileView.Listener;
import com.tinder.superlikeable.analytics.C18198b.C15092a;
import com.tinder.superlikeable.view.cardview.GridCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"com/tinder/recs/view/RecsView$SuperLikeableRecClickListenerProxy$onRecClicked$1", "Lcom/tinder/recs/view/RecProfileView$Listener;", "Lcom/tinder/domain/recs/model/UserRec;", "(Lcom/tinder/recs/provider/UserRecActivePhotoIndexProvider;Lcom/tinder/superlikeable/view/cardview/GridCardView;Lcom/tinder/superlikeable/analytics/AddSuperLikeableProfileInteractEvent$Request;)V", "onGamepadButtonClick", "", "swipeType", "Lcom/tinder/enums/SwipeType;", "data", "onPhotoChanged", "index", "", "totalCount", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$SuperLikeableRecClickListenerProxy$onRecClicked$1 implements Listener<UserRec> {
    final /* synthetic */ GridCardView $gridCardView;
    final /* synthetic */ C15092a $profileInteractAnalyticsRequest;
    final /* synthetic */ UserRecActivePhotoIndexProvider $userRecActivePhotoIndexProvider;

    public void onGamepadButtonClick(@NotNull SwipeType swipeType, @NotNull UserRec userRec) {
        C2668g.b(swipeType, "swipeType");
        C2668g.b(userRec, ManagerWebServices.FB_DATA);
    }

    RecsView$SuperLikeableRecClickListenerProxy$onRecClicked$1(UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider, GridCardView gridCardView, C15092a c15092a) {
        this.$userRecActivePhotoIndexProvider = userRecActivePhotoIndexProvider;
        this.$gridCardView = gridCardView;
        this.$profileInteractAnalyticsRequest = c15092a;
    }

    public void onPhotoChanged(int i, int i2, @NotNull UserRec userRec) {
        C2668g.b(userRec, ManagerWebServices.FB_DATA);
        i2 = this.$userRecActivePhotoIndexProvider;
        userRec = userRec.getUser().id();
        C2668g.a(userRec, "data.user.id()");
        i2.updateActivePhotoIndex(userRec, i);
        this.$gridCardView.m65999a(i);
        this.$profileInteractAnalyticsRequest.m56852a(i);
    }
}
