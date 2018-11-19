package com.tinder.recs.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class UserRecCardHeadLineView_ViewBinding implements Unbinder {
    private UserRecCardHeadLineView target;

    @UiThread
    public UserRecCardHeadLineView_ViewBinding(UserRecCardHeadLineView userRecCardHeadLineView) {
        this(userRecCardHeadLineView, userRecCardHeadLineView);
    }

    @UiThread
    public UserRecCardHeadLineView_ViewBinding(UserRecCardHeadLineView userRecCardHeadLineView, View view) {
        this.target = userRecCardHeadLineView;
        userRecCardHeadLineView.nameView = (TextView) C0761c.b(view, R.id.recs_card_user_headline_name, "field 'nameView'", TextView.class);
        userRecCardHeadLineView.ageView = (TextView) C0761c.b(view, R.id.recs_card_user_headline_age, "field 'ageView'", TextView.class);
        userRecCardHeadLineView.verifiedBadgeView = (ImageView) C0761c.b(view, R.id.recs_card_user_headline_verified_badge, "field 'verifiedBadgeView'", ImageView.class);
        userRecCardHeadLineView.superLikeIconView = (ImageView) C0761c.b(view, R.id.recs_card_user_headline_superlike, "field 'superLikeIconView'", ImageView.class);
        userRecCardHeadLineView.boostIconView = (ImageView) C0761c.b(view, R.id.recs_card_user_headline_boost, "field 'boostIconView'", ImageView.class);
        userRecCardHeadLineView.fastMatchIconView = C0761c.a(view, R.id.recs_card_user_headline_grid, "field 'fastMatchIconView'");
        userRecCardHeadLineView.topPicksIconView = C0761c.a(view, R.id.recs_card_user_headline_top_picks, "field 'topPicksIconView'");
    }

    @CallSuper
    public void unbind() {
        UserRecCardHeadLineView userRecCardHeadLineView = this.target;
        if (userRecCardHeadLineView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        userRecCardHeadLineView.nameView = null;
        userRecCardHeadLineView.ageView = null;
        userRecCardHeadLineView.verifiedBadgeView = null;
        userRecCardHeadLineView.superLikeIconView = null;
        userRecCardHeadLineView.boostIconView = null;
        userRecCardHeadLineView.fastMatchIconView = null;
        userRecCardHeadLineView.topPicksIconView = null;
    }
}
