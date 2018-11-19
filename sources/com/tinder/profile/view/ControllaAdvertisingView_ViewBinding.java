package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ControllaAdvertisingView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ControllaAdvertisingView f50206b;

    @UiThread
    public ControllaAdvertisingView_ViewBinding(ControllaAdvertisingView controllaAdvertisingView, View view) {
        this.f50206b = controllaAdvertisingView;
        controllaAdvertisingView.titleView = (TextView) C0761c.b(view, R.id.controlla_ad_title, "field 'titleView'", TextView.class);
        controllaAdvertisingView.descriptionView = (TextView) C0761c.b(view, R.id.controlla_ad_description, "field 'descriptionView'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        ControllaAdvertisingView controllaAdvertisingView = this.f50206b;
        if (controllaAdvertisingView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50206b = null;
        controllaAdvertisingView.titleView = null;
        controllaAdvertisingView.descriptionView = null;
    }
}
