package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.viewpagerindicator.CirclePageIndicator;

public class ControllaCarouselView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ControllaCarouselView f50210b;

    @UiThread
    public ControllaCarouselView_ViewBinding(ControllaCarouselView controllaCarouselView, View view) {
        this.f50210b = controllaCarouselView;
        controllaCarouselView.circlePageIndicator = (CirclePageIndicator) C0761c.b(view, R.id.controlla_page_indicator, "field 'circlePageIndicator'", CirclePageIndicator.class);
        controllaCarouselView.viewPager = (ViewPager) C0761c.b(view, R.id.controlla_view_pager, "field 'viewPager'", ViewPager.class);
    }

    @CallSuper
    public void unbind() {
        ControllaCarouselView controllaCarouselView = this.f50210b;
        if (controllaCarouselView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50210b = null;
        controllaCarouselView.circlePageIndicator = null;
        controllaCarouselView.viewPager = null;
    }
}
