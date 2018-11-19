package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdViewAttributes;

/* renamed from: com.facebook.ads.internal.view.r */
public abstract class C1614r {
    /* renamed from: a */
    public static LinearLayout m5505a(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        LinearLayout linearLayout = new LinearLayout(context);
        View c1619v = new C1619v(context);
        c1619v.setText(nativeAd.getAdSocialContext());
        C1614r.m5507b(c1619v, nativeAdViewAttributes);
        linearLayout.addView(c1619v);
        return linearLayout;
    }

    /* renamed from: a */
    public static void m5506a(TextView textView, NativeAdViewAttributes nativeAdViewAttributes) {
        textView.setTextColor(nativeAdViewAttributes.getTitleTextColor());
        textView.setTextSize((float) nativeAdViewAttributes.getTitleTextSize());
        textView.setTypeface(nativeAdViewAttributes.getTypeface(), 1);
    }

    /* renamed from: b */
    public static void m5507b(TextView textView, NativeAdViewAttributes nativeAdViewAttributes) {
        textView.setTextColor(nativeAdViewAttributes.getDescriptionTextColor());
        textView.setTextSize((float) nativeAdViewAttributes.getDescriptionTextSize());
        textView.setTypeface(nativeAdViewAttributes.getTypeface());
    }
}
