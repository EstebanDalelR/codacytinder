package com.tinder.boost.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.boost.view.BoostGaugeView.SweepAnimationView;

public class BoostGaugeView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private BoostGaugeView f34050b;

    @UiThread
    public BoostGaugeView_ViewBinding(BoostGaugeView boostGaugeView, View view) {
        this.f34050b = boostGaugeView;
        boostGaugeView.mGaugeView = (SweepAnimationView) C0761c.b(view, R.id.boost_gauge_gauge, "field 'mGaugeView'", SweepAnimationView.class);
        boostGaugeView.mBoltView = (ImageView) C0761c.b(view, R.id.boost_gauge_bolt, "field 'mBoltView'", ImageView.class);
        boostGaugeView.mMultiplierContainer = C0761c.a(view, R.id.multiplier_container, "field 'mMultiplierContainer'");
        boostGaugeView.mMultiplierView = (TextView) C0761c.b(view, R.id.multiplier, "field 'mMultiplierView'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        BoostGaugeView boostGaugeView = this.f34050b;
        if (boostGaugeView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34050b = null;
        boostGaugeView.mGaugeView = null;
        boostGaugeView.mBoltView = null;
        boostGaugeView.mMultiplierContainer = null;
        boostGaugeView.mMultiplierView = null;
    }
}
