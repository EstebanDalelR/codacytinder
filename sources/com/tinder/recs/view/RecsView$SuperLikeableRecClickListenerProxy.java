package com.tinder.recs.view;

import android.content.Context;
import android.view.View;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.view.UserRecProfileView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.RecProfileView.GamepadButtonStates;
import com.tinder.superlikeable.analytics.AddSuperLikeableInteractEvent.SuperLikeablePosition;
import com.tinder.superlikeable.analytics.C18198b.C15092a;
import com.tinder.superlikeable.view.cardview.GridCardView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/tinder/recs/view/RecsView$SuperLikeableRecClickListenerProxy;", "", "()V", "onRecClicked", "", "gridCardView", "Lcom/tinder/superlikeable/view/cardview/GridCardView;", "gridCardIndex", "", "userRec", "Lcom/tinder/domain/recs/model/UserRec;", "recsView", "Lcom/tinder/recs/view/RecsView;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
final class RecsView$SuperLikeableRecClickListenerProxy {
    public final void onRecClicked(@NotNull GridCardView gridCardView, int i, @NotNull UserRec userRec, @NotNull RecsView recsView) {
        GridCardView gridCardView2 = gridCardView;
        UserRec userRec2 = userRec;
        RecsView recsView2 = recsView;
        C2668g.b(gridCardView2, "gridCardView");
        C2668g.b(userRec2, "userRec");
        C2668g.b(recsView2, "recsView");
        if (!RecsView.access$getStampIsAnimating$p(recsView)) {
            if (!RecsView.access$isProfileViewAnimating$p(recsView)) {
                Context context = recsView.getContext();
                UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider$Tinder_release = recsView.getUserRecActivePhotoIndexProvider$Tinder_release();
                int currentPhotoIndex = gridCardView.getCurrentPhotoIndex();
                List photos = userRec.getUser().photos();
                if (photos.size() <= currentPhotoIndex) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Photo size is ");
                    stringBuilder.append(photos.size());
                    stringBuilder.append(" but photoIndex is ");
                    stringBuilder.append(currentPhotoIndex);
                    C0001a.d(stringBuilder.toString(), new Object[0]);
                    return;
                }
                String url = ((Photo) userRec.getUser().photos().get(currentPhotoIndex)).url();
                if (url != null) {
                    SuperLikeablePosition a = SuperLikeablePosition.Companion.m56839a(i);
                    String id = userRec.getUser().id();
                    C2668g.a(id, "userRec.user.id()");
                    C15092a c15092a = new C15092a(id, userRec.getUser().photos().size(), a);
                    c15092a.m56852a(currentPhotoIndex);
                    RecsView$Companion recsView$Companion = RecsView.Companion;
                    int size = photos.size();
                    View view = gridCardView2;
                    C2668g.a(context, "context");
                    PlaceholderPhotoConfig access$createPlaceholderPhotoConfig = recsView$Companion.createPlaceholderPhotoConfig(currentPhotoIndex, url, size, view, context);
                    UserRecProfileView userRecProfileView = new UserRecProfileView(context, userRec2, currentPhotoIndex, new GamepadButtonStates(false, false, false, false, 8, null));
                    userRecProfileView.hideGamepad();
                    userRecProfileView.m61053a(ProfileScreenSource.RECS);
                    RecProfileView recProfileView = userRecProfileView;
                    RecsView.access$setRecProfileView$p(recsView2, recProfileView);
                    userRecProfileView.setListener(new RecsView$SuperLikeableRecClickListenerProxy$onRecClicked$1(userRecActivePhotoIndexProvider$Tinder_release, gridCardView2, c15092a));
                    RecsView.access$prepareForProfileEntranceAnimation(recsView2, access$createPlaceholderPhotoConfig);
                    RecsView.access$prepareForProfileExitAnimation(recsView2, access$createPlaceholderPhotoConfig);
                    RecsView.access$showRecProfileView(recsView2, recProfileView);
                }
            }
        }
    }
}
