package com.tinder.recs.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class AdRecCardView_ViewBinding implements Unbinder {
    private AdRecCardView target;

    @UiThread
    public AdRecCardView_ViewBinding(AdRecCardView adRecCardView) {
        this(adRecCardView, adRecCardView);
    }

    @UiThread
    public AdRecCardView_ViewBinding(AdRecCardView adRecCardView, View view) {
        this.target = adRecCardView;
        adRecCardView.adContainer = (FrameLayout) C0761c.b(view, R.id.ad_container, "field 'adContainer'", FrameLayout.class);
    }

    @CallSuper
    public void unbind() {
        AdRecCardView adRecCardView = this.target;
        if (adRecCardView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        adRecCardView.adContainer = null;
    }
}
