package com.tinder.reactions.gestures.view;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class TappableGrandGestureView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private TappableGrandGestureView f50881b;

    @UiThread
    public TappableGrandGestureView_ViewBinding(TappableGrandGestureView tappableGrandGestureView, View view) {
        this.f50881b = tappableGrandGestureView;
        tappableGrandGestureView.tappableAnimationView = (GrandGestureAnimationView) C0761c.b(view, R.id.tappableAnimationView, "field 'tappableAnimationView'", GrandGestureAnimationView.class);
    }

    public void unbind() {
        TappableGrandGestureView tappableGrandGestureView = this.f50881b;
        if (tappableGrandGestureView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50881b = null;
        tappableGrandGestureView.tappableAnimationView = null;
    }
}
