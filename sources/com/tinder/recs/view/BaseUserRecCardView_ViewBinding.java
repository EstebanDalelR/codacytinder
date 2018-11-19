package com.tinder.recs.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.recs.view.superlike.SuperLikeOverlayView;

public class BaseUserRecCardView_ViewBinding implements Unbinder {
    private BaseUserRecCardView target;

    @UiThread
    public BaseUserRecCardView_ViewBinding(BaseUserRecCardView baseUserRecCardView) {
        this(baseUserRecCardView, baseUserRecCardView);
    }

    @UiThread
    public BaseUserRecCardView_ViewBinding(BaseUserRecCardView baseUserRecCardView, View view) {
        this.target = baseUserRecCardView;
        baseUserRecCardView.fastMatchTeaserView = C0761c.a(view, R.id.recs_card_user_fast_match_teaser, "field 'fastMatchTeaserView'");
        baseUserRecCardView.headlineView = (UserRecCardHeadLineView) C0761c.b(view, R.id.recs_card_user_headline, "field 'headlineView'", UserRecCardHeadLineView.class);
        baseUserRecCardView.contentContainer = (ViewGroup) C0761c.b(view, R.id.recs_card_user_content_container, "field 'contentContainer'", ViewGroup.class);
        baseUserRecCardView.referralBannerView = (ReferralBannerView) C0761c.b(view, R.id.recs_card_referral_banner, "field 'referralBannerView'", ReferralBannerView.class);
        baseUserRecCardView.selectUserBannerView = C0761c.a(view, R.id.recs_card_select_user_banner, "field 'selectUserBannerView'");
        baseUserRecCardView.superLikeOverlayView = (SuperLikeOverlayView) C0761c.b(view, R.id.recs_card_superlike_animation_overlay, "field 'superLikeOverlayView'", SuperLikeOverlayView.class);
        baseUserRecCardView.teaserViews = C0761c.a(new TextView[]{(TextView) C0761c.b(view, R.id.recs_card_user_teaser_1, "field 'teaserViews'", TextView.class), (TextView) C0761c.b(view, R.id.recs_card_user_teaser_2, "field 'teaserViews'", TextView.class)});
    }

    @CallSuper
    public void unbind() {
        BaseUserRecCardView baseUserRecCardView = this.target;
        if (baseUserRecCardView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        baseUserRecCardView.fastMatchTeaserView = null;
        baseUserRecCardView.headlineView = null;
        baseUserRecCardView.contentContainer = null;
        baseUserRecCardView.referralBannerView = null;
        baseUserRecCardView.selectUserBannerView = null;
        baseUserRecCardView.superLikeOverlayView = null;
        baseUserRecCardView.teaserViews = null;
    }
}
