package com.tinder.recs.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.recsads.view.DispatchTouchDownListenerMediaView;
import com.tinder.recsads.view.DispatchTouchDownListenerTextView;
import com.tinder.recsads.view.RedGradientFillButtonView;

public class FanAdView_ViewBinding implements Unbinder {
    private FanAdView target;
    private View view2131362462;

    @UiThread
    public FanAdView_ViewBinding(FanAdView fanAdView) {
        this(fanAdView, fanAdView);
    }

    @UiThread
    public FanAdView_ViewBinding(final FanAdView fanAdView, View view) {
        this.target = fanAdView;
        fanAdView.nativeAdContainer = (LinearLayout) C0761c.b(view, R.id.fan_ad_native_ad_unit, "field 'nativeAdContainer'", LinearLayout.class);
        fanAdView.nativeAdMediaView = (DispatchTouchDownListenerMediaView) C0761c.b(view, R.id.fan_ad_media_view, "field 'nativeAdMediaView'", DispatchTouchDownListenerMediaView.class);
        fanAdView.nativeAdTitle = (DispatchTouchDownListenerTextView) C0761c.b(view, R.id.fan_ad_title, "field 'nativeAdTitle'", DispatchTouchDownListenerTextView.class);
        fanAdView.nativeAdIcon = (ImageView) C0761c.b(view, R.id.fan_ad_sponsor_logo, "field 'nativeAdIcon'", ImageView.class);
        fanAdView.nativeAdSponsorName = (TextView) C0761c.b(view, R.id.fan_ad_sponsor_name, "field 'nativeAdSponsorName'", TextView.class);
        fanAdView.nativeAdBody = (TextView) C0761c.b(view, R.id.fan_ad_description, "field 'nativeAdBody'", TextView.class);
        View a = C0761c.a(view, R.id.fan_ad_sponsor_label, "field 'nativeAdSponsorLabel' and method 'clickSponsorLabel'");
        fanAdView.nativeAdSponsorLabel = (TextView) C0761c.c(a, R.id.fan_ad_sponsor_label, "field 'nativeAdSponsorLabel'", TextView.class);
        this.view2131362462 = a;
        a.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                fanAdView.clickSponsorLabel();
            }
        });
        fanAdView.adChoicesContainer = (ViewGroup) C0761c.b(view, R.id.ad_choices_container, "field 'adChoicesContainer'", ViewGroup.class);
        fanAdView.nativeAdCallToAction = (RedGradientFillButtonView) C0761c.b(view, R.id.fan_ad_action, "field 'nativeAdCallToAction'", RedGradientFillButtonView.class);
        fanAdView.materialTouchDelegateSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.material_touch_delegate_size);
    }

    @CallSuper
    public void unbind() {
        FanAdView fanAdView = this.target;
        if (fanAdView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        fanAdView.nativeAdContainer = null;
        fanAdView.nativeAdMediaView = null;
        fanAdView.nativeAdTitle = null;
        fanAdView.nativeAdIcon = null;
        fanAdView.nativeAdSponsorName = null;
        fanAdView.nativeAdBody = null;
        fanAdView.nativeAdSponsorLabel = null;
        fanAdView.adChoicesContainer = null;
        fanAdView.nativeAdCallToAction = null;
        this.view2131362462.setOnClickListener(null);
        this.view2131362462 = null;
    }
}
