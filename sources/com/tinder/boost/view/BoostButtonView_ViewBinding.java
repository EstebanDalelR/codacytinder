package com.tinder.boost.view;

import android.content.res.Resources;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.recs.view.BoostButton;

public final class BoostButtonView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private BoostButtonView f34044b;
    /* renamed from: c */
    private View f34045c;

    @UiThread
    public BoostButtonView_ViewBinding(final BoostButtonView boostButtonView, View view) {
        this.f34044b = boostButtonView;
        View a = C0761c.a(view, R.id.boost_button, "field 'boostButton' and method 'startBoost'");
        boostButtonView.boostButton = (BoostButton) C0761c.c(a, R.id.boost_button, "field 'boostButton'", BoostButton.class);
        this.f34045c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BoostButtonView_ViewBinding f34043b;

            public void doClick(View view) {
                boostButtonView.startBoost();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        boostButtonView.boostEndGradientColor = C0432b.c(view, R.color.boost_intro_gradient_end);
        boostButtonView.boostStartGradientColor = C0432b.c(view, R.color.boost_intro_gradient_start);
        boostButtonView.boostEmitterGamepadYDelta = resources.getDimensionPixelSize(R.dimen.boost_gamepad_y_delta);
        boostButtonView.boostGamepadOffsetY = resources.getDimensionPixelSize(R.dimen.boost_gamepad_y_offset);
        boostButtonView.boostStartTooltipMessage = resources.getString(R.string.boost_start_tool_tip);
        boostButtonView.boostYourProfileMessage = resources.getString(R.string.boost_your_profile_get_likes);
    }

    public void unbind() {
        BoostButtonView boostButtonView = this.f34044b;
        if (boostButtonView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34044b = null;
        boostButtonView.boostButton = null;
        this.f34045c.setOnClickListener(null);
        this.f34045c = null;
    }
}
