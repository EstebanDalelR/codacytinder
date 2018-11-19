package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.C1614r;

/* renamed from: com.facebook.ads.internal.view.component.g */
public class C1601g extends LinearLayout {
    public C1601g(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        super(context);
        float f = an.f4090b;
        View linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVerticalGravity(16);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        f *= 15.0f;
        layoutParams.setMargins(Math.round(f), Math.round(f), Math.round(f), Math.round(f));
        linearLayout.setLayoutParams(layoutParams);
        addView(linearLayout);
        CharSequence adSubtitle = nativeAd.getAdSubtitle();
        View textView = new TextView(getContext());
        if (TextUtils.isEmpty(adSubtitle)) {
            adSubtitle = nativeAd.getAdTitle();
        }
        textView.setText(adSubtitle);
        C1614r.m5506a(textView, nativeAdViewAttributes);
        textView.setEllipsize(TruncateAt.END);
        textView.setSingleLine(true);
        linearLayout.addView(textView);
        View textView2 = new TextView(getContext());
        textView2.setText(nativeAd.getAdBody());
        C1614r.m5507b(textView2, nativeAdViewAttributes);
        textView2.setEllipsize(TruncateAt.END);
        textView2.setMaxLines(2);
        linearLayout.addView(textView2);
    }
}
