package com.tinder.profile.view;

import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.shimmy.ShimmerFrameLayout;

public final class ControllaButtonView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ControllaButtonView f50207b;

    @UiThread
    public ControllaButtonView_ViewBinding(ControllaButtonView controllaButtonView, View view) {
        this.f50207b = controllaButtonView;
        controllaButtonView.actionButton = (FloatingActionButton) C0761c.b(view, R.id.controlla_floating_button, "field 'actionButton'", FloatingActionButton.class);
        controllaButtonView.getMoreTextView = (TextView) C0761c.b(view, R.id.controlla_button_get_more, "field 'getMoreTextView'", TextView.class);
        controllaButtonView.numberRemainingTextView = (TextView) C0761c.b(view, R.id.controlla_button_number_remaining, "field 'numberRemainingTextView'", TextView.class);
        controllaButtonView.shimmerFrameLayout = (ShimmerFrameLayout) C0761c.b(view, R.id.controlla_button_shimmer_layout, "field 'shimmerFrameLayout'", ShimmerFrameLayout.class);
        controllaButtonView.timeRemainingTextView = (TextView) C0761c.b(view, R.id.controlla_button_time_remaining, "field 'timeRemainingTextView'", TextView.class);
    }

    public void unbind() {
        ControllaButtonView controllaButtonView = this.f50207b;
        if (controllaButtonView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50207b = null;
        controllaButtonView.actionButton = null;
        controllaButtonView.getMoreTextView = null;
        controllaButtonView.numberRemainingTextView = null;
        controllaButtonView.shimmerFrameLayout = null;
        controllaButtonView.timeRemainingTextView = null;
    }
}
