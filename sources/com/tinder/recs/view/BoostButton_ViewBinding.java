package com.tinder.recs.view;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class BoostButton_ViewBinding implements Unbinder {
    private BoostButton target;

    @UiThread
    public BoostButton_ViewBinding(BoostButton boostButton) {
        this(boostButton, boostButton);
    }

    @UiThread
    public BoostButton_ViewBinding(BoostButton boostButton, View view) {
        this.target = boostButton;
        boostButton.mMultiplierTextView = (TextView) C0761c.b(view, R.id.boost_gamepad_multiplier, "field 'mMultiplierTextView'", TextView.class);
        boostButton.mBoltIcon = (ImageView) C0761c.b(view, R.id.boost_gamepad_ic_bolt, "field 'mBoltIcon'", ImageView.class);
        boostButton.boostCounterTextView = (TextView) C0761c.b(view, R.id.boost_count_text, "field 'boostCounterTextView'", TextView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        boostButton.mSweepStartColor = C0432b.c(view, R.color.boost_gauge_sweep_start);
        boostButton.mSweepEndColor = C0432b.c(view, R.color.boost_gauge_sweep_end);
        boostButton.mEmptyColor = C0432b.c(view, R.color.boost_guage_empty_color);
        boostButton.textGradientStart = C0432b.c(view, R.color.boost_perk_gradient_start);
        boostButton.textGradientEnd = C0432b.c(view, R.color.boost_perk_gradient_end);
        boostButton.mStrokeThickness = resources.getDimensionPixelSize(R.dimen.boost_gamepad_stroke_thickness);
    }

    @CallSuper
    public void unbind() {
        BoostButton boostButton = this.target;
        if (boostButton == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        boostButton.mMultiplierTextView = null;
        boostButton.mBoltIcon = null;
        boostButton.boostCounterTextView = null;
    }
}
