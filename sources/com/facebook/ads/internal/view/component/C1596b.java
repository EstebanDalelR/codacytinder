package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.view.C1614r;
import com.facebook.ads.internal.view.C1616t;

/* renamed from: com.facebook.ads.internal.view.component.b */
public class C1596b extends LinearLayout {
    /* renamed from: a */
    private C1616t f4419a = new C1616t(getContext(), 2);
    /* renamed from: b */
    private int f4420b;

    public C1596b(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        super(context);
        setOrientation(1);
        setVerticalGravity(16);
        this.f4419a.setMinTextSize((float) (nativeAdViewAttributes.getTitleTextSize() - 2));
        this.f4419a.setText(nativeAd.getAdTitle());
        C1614r.m5506a(this.f4419a, nativeAdViewAttributes);
        this.f4419a.setLayoutParams(new LayoutParams(-2, -2));
        addView(this.f4419a);
        int i = 21;
        if (nativeAd.getAdTitle() != null) {
            i = Math.min(nativeAd.getAdTitle().length(), 21);
        }
        this.f4420b = i;
        addView(C1614r.m5505a(context, nativeAd, nativeAdViewAttributes));
    }

    public int getMinVisibleTitleCharacters() {
        return this.f4420b;
    }

    public TextView getTitleTextView() {
        return this.f4419a;
    }
}
