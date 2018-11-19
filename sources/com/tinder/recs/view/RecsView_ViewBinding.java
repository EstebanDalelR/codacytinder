package com.tinder.recs.view;

import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.base.view.TouchBlockingFrameLayout;
import com.tinder.cardstack.view.CardStackLayout;

public final class RecsView_ViewBinding implements Unbinder {
    private RecsView target;

    @UiThread
    public RecsView_ViewBinding(RecsView recsView) {
        this(recsView, recsView);
    }

    @UiThread
    public RecsView_ViewBinding(RecsView recsView, View view) {
        this.target = recsView;
        recsView.cardStack = (CardStackLayout) C0761c.b(view, R.id.recs_cardstack, "field 'cardStack'", CardStackLayout.class);
        recsView.gamepad = (GamepadView) C0761c.b(view, R.id.recs_gamepad, "field 'gamepad'", GamepadView.class);
        recsView.cardStackContainer = (TouchBlockingFrameLayout) C0761c.b(view, R.id.recs_cardstack_container, "field 'cardStackContainer'", TouchBlockingFrameLayout.class);
        recsView.whiteColor = C0432b.c(view.getContext(), R.color.white);
    }

    public void unbind() {
        RecsView recsView = this.target;
        if (recsView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        recsView.cardStack = null;
        recsView.gamepad = null;
        recsView.cardStackContainer = null;
    }
}
