package com.tinder.recs.view;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.recs.analytics.RecsPhotoSource;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.RecProfileView.OnRecProfileExitClickedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/recs/view/RecsView$onUserRecCardViewClick$2", "Lcom/tinder/recs/view/RecProfileView$OnRecProfileExitClickedListener;", "Lcom/tinder/domain/recs/model/UserRec;", "(Lcom/tinder/recs/view/RecsView;)V", "onRecProfileExitClicked", "", "data", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$onUserRecCardViewClick$2 implements OnRecProfileExitClickedListener<UserRec> {
    final /* synthetic */ RecsView this$0;

    RecsView$onUserRecCardViewClick$2(RecsView recsView) {
        this.this$0 = recsView;
    }

    public void onRecProfileExitClicked(@NotNull UserRec userRec) {
        C2668g.b(userRec, ManagerWebServices.FB_DATA);
        UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider$Tinder_release = this.this$0.getUserRecActivePhotoIndexProvider$Tinder_release();
        String id = userRec.getUser().id();
        C2668g.a(id, "data.user.id()");
        this.this$0.getRecsPhotosViewedCache$Tinder_release().notifyPhotoViewed(userRecActivePhotoIndexProvider$Tinder_release.getActivePhotoIndex(id), userRec.getId(), RecsPhotoSource.CARD);
    }
}
