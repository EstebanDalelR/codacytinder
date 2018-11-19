package com.tinder.views.grid;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.recs.model.SwipeOrigin;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.enums.SwipeType;
import com.tinder.recs.view.RecCardView;
import com.tinder.recs.view.RecProfileView.Listener;
import com.tinder.views.grid.presenter.RecsGridPresenter;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J*\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J \u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/views/grid/RefreshableGridRecsView$UserRecProfileViewListener;", "Lcom/tinder/recs/view/RecProfileView$Listener;", "Lcom/tinder/domain/recs/model/UserRec;", "userRecCardView", "Lcom/tinder/views/grid/GridUserRecCardView;", "presenter", "Lcom/tinder/views/grid/presenter/RecsGridPresenter;", "(Lcom/tinder/views/grid/RefreshableGridRecsView;Lcom/tinder/views/grid/GridUserRecCardView;Lcom/tinder/views/grid/presenter/RecsGridPresenter;)V", "animateStamp", "", "recCardView", "Lcom/tinder/recs/view/RecCardView;", "stamp", "Landroid/view/View;", "animationEndListener", "Lkotlin/Function0;", "onGamepadButtonClick", "swipeType", "Lcom/tinder/enums/SwipeType;", "userRec", "onPhotoChanged", "index", "", "size", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RefreshableGridRecsView$e implements Listener<UserRec> {
    /* renamed from: a */
    final /* synthetic */ RefreshableGridRecsView f52919a;
    /* renamed from: b */
    private final GridUserRecCardView f52920b;
    /* renamed from: c */
    private final RecsGridPresenter f52921c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/views/grid/RefreshableGridRecsView$UserRecProfileViewListener$animateStamp$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/views/grid/RefreshableGridRecsView$UserRecProfileViewListener;Lkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.views.grid.RefreshableGridRecsView$e$a */
    public static final class C15451a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ RefreshableGridRecsView$e f47874a;
        /* renamed from: b */
        final /* synthetic */ Function0 f47875b;

        C15451a(RefreshableGridRecsView$e refreshableGridRecsView$e, Function0 function0) {
            this.f47874a = refreshableGridRecsView$e;
            this.f47875b = function0;
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f47875b.invoke();
            RefreshableGridRecsView.a(this.f47874a.f52919a, false);
        }
    }

    public RefreshableGridRecsView$e(RefreshableGridRecsView refreshableGridRecsView, @NotNull GridUserRecCardView gridUserRecCardView, @NotNull RecsGridPresenter recsGridPresenter) {
        C2668g.b(gridUserRecCardView, "userRecCardView");
        C2668g.b(recsGridPresenter, "presenter");
        this.f52919a = refreshableGridRecsView;
        this.f52920b = gridUserRecCardView;
        this.f52921c = recsGridPresenter;
    }

    public /* synthetic */ void onGamepadButtonClick(SwipeType swipeType, Object obj) {
        m63204a(swipeType, (UserRec) obj);
    }

    public /* synthetic */ void onPhotoChanged(int i, int i2, Object obj) {
        m63203a(i, i2, (UserRec) obj);
    }

    /* renamed from: a */
    public void m63204a(@NotNull SwipeType swipeType, @NotNull UserRec userRec) {
        C2668g.b(swipeType, "swipeType");
        C2668g.b(userRec, "userRec");
        userRec = SwipeOrigin.USER_PROFILE;
        View stampLike;
        UserRec userRec2;
        switch (C15457d.f47888a[swipeType.ordinal()]) {
            case 1:
                stampLike = this.f52920b.getStampLike();
                if (stampLike != null) {
                    m63201a((RecCardView) this.f52920b, stampLike, (Function0) new C18992x33526b27(this, userRec));
                    return;
                }
                swipeType = this.f52921c;
                userRec2 = this.f52920b.getUserRecCard().userRec();
                C2668g.a(userRec2, "userRecCardView.userRecCard.userRec()");
                swipeType.likeOnRec(userRec2, userRec);
                return;
            case 2:
                stampLike = this.f52920b.getStampPass();
                if (stampLike != null) {
                    m63201a((RecCardView) this.f52920b, stampLike, (Function0) new C18993x33526b28(this, userRec));
                    return;
                }
                swipeType = this.f52921c;
                userRec2 = this.f52920b.getUserRecCard().userRec();
                C2668g.a(userRec2, "userRecCardView.userRecCard.userRec()");
                swipeType.passOnRec(userRec2, userRec);
                return;
            case 3:
                stampLike = this.f52920b.getStampSuperLike();
                if (stampLike != null) {
                    m63201a((RecCardView) this.f52920b, stampLike, (Function0) new C18994x33526b29(this, userRec));
                    return;
                }
                swipeType = this.f52921c;
                userRec2 = this.f52920b.getUserRecCard().userRec();
                C2668g.a(userRec2, "userRecCardView.userRecCard.userRec()");
                swipeType.superlikeOnRec(userRec2, userRec);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void m63203a(int i, int i2, @NotNull UserRec userRec) {
        C2668g.b(userRec, "userRec");
        i2 = userRec.getUser().id();
        this.f52920b.m66294a(i);
        userRec = this.f52919a.getActivePhotoIndexProvider$Tinder_release();
        C2668g.a(i2, ManagerWebServices.PARAM_USER_ID);
        userRec.updateActivePhotoIndex(i2, i);
    }

    /* renamed from: a */
    private final void m63201a(RecCardView<?> recCardView, View view, Function0<C15813i> function0) {
        recCardView.disableStampsDecoration();
        RefreshableGridRecsView.a(this.f52919a, true);
        view.animate().setDuration(100).alpha(1.0f).setListener((AnimatorListener) new C15451a(this, function0));
    }
}
