package com.tinder.views.grid;

import com.tinder.profile.view.UserRecProfileView;
import com.tinder.recs.animation.RecProfileAnimationDecorator.EndListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAnimationEnd"}, k = 3, mv = {1, 1, 10})
final class RefreshableGridRecsView$g implements EndListener {
    /* renamed from: a */
    final /* synthetic */ RefreshableGridRecsView f52925a;
    /* renamed from: b */
    final /* synthetic */ UserRecProfileView f52926b;
    /* renamed from: c */
    final /* synthetic */ GridUserRecCardView f52927c;

    RefreshableGridRecsView$g(RefreshableGridRecsView refreshableGridRecsView, UserRecProfileView userRecProfileView, GridUserRecCardView gridUserRecCardView) {
        this.f52925a = refreshableGridRecsView;
        this.f52926b = userRecProfileView;
        this.f52927c = gridUserRecCardView;
    }

    public final void onAnimationEnd() {
        this.f52925a.b().removeView(this.f52926b);
        this.f52927c.setEnabled(true);
        this.f52927c.setVisibility(0);
        this.f52925a.e();
    }
}
