package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.view.C1614r;
import com.facebook.ads.internal.view.C1619v;

/* renamed from: com.facebook.ads.internal.view.component.c */
public class C1597c extends LinearLayout {
    /* renamed from: a */
    private ImageView f4421a;
    /* renamed from: b */
    private C1596b f4422b;
    /* renamed from: c */
    private TextView f4423c;
    /* renamed from: d */
    private LinearLayout f4424d = new LinearLayout(getContext());

    public C1597c(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes, boolean z, int i) {
        NativeAdViewAttributes nativeAdViewAttributes2 = nativeAdViewAttributes;
        boolean z2 = z;
        super(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        setVerticalGravity(16);
        setOrientation(1);
        View linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(Math.round(displayMetrics.density * 15.0f), Math.round(displayMetrics.density * 15.0f), Math.round(displayMetrics.density * 15.0f), Math.round(displayMetrics.density * 15.0f));
        linearLayout.setLayoutParams(layoutParams);
        addView(linearLayout);
        layoutParams = new LinearLayout.LayoutParams(-1, 0);
        this.f4424d.setOrientation(0);
        this.f4424d.setGravity(16);
        layoutParams.weight = 3.0f;
        this.f4424d.setLayoutParams(layoutParams);
        linearLayout.addView(this.f4424d);
        this.f4421a = new C1600f(getContext());
        float a = (float) m5465a(z2, i);
        LayoutParams layoutParams2 = new LinearLayout.LayoutParams(Math.round(displayMetrics.density * a), Math.round(a * displayMetrics.density));
        layoutParams2.setMargins(0, 0, Math.round(displayMetrics.density * 15.0f), 0);
        this.f4421a.setLayoutParams(layoutParams2);
        NativeAd.downloadAndDisplayImage(nativeAd.getAdIcon(), this.f4421a);
        this.f4424d.addView(this.f4421a);
        View linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        this.f4424d.addView(linearLayout2);
        this.f4422b = new C1596b(getContext(), nativeAd, nativeAdViewAttributes2);
        LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.setMargins(0, 0, Math.round(displayMetrics.density * 15.0f), 0);
        layoutParams3.weight = 0.5f;
        this.f4422b.setLayoutParams(layoutParams3);
        linearLayout2.addView(this.f4422b);
        this.f4423c = new TextView(getContext());
        this.f4423c.setPadding(Math.round(displayMetrics.density * 6.0f), Math.round(displayMetrics.density * 6.0f), Math.round(displayMetrics.density * 6.0f), Math.round(displayMetrics.density * 6.0f));
        this.f4423c.setText(nativeAd.getAdCallToAction());
        this.f4423c.setTextColor(nativeAdViewAttributes.getButtonTextColor());
        this.f4423c.setTextSize(14.0f);
        this.f4423c.setTypeface(nativeAdViewAttributes.getTypeface(), 1);
        this.f4423c.setMaxLines(2);
        this.f4423c.setEllipsize(TruncateAt.END);
        this.f4423c.setGravity(17);
        Drawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(nativeAdViewAttributes.getButtonColor());
        gradientDrawable.setCornerRadius(displayMetrics.density * 5.0f);
        gradientDrawable.setStroke(1, nativeAdViewAttributes.getButtonBorderColor());
        this.f4423c.setBackgroundDrawable(gradientDrawable);
        LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.weight = 0.25f;
        this.f4423c.setLayoutParams(layoutParams4);
        linearLayout2.addView(this.f4423c);
        if (z2) {
            View c1619v = new C1619v(getContext());
            c1619v.setText(nativeAd.getAdBody());
            C1614r.m5507b(c1619v, nativeAdViewAttributes2);
            c1619v.setMinTextSize((float) (nativeAdViewAttributes.getDescriptionTextSize() - 1));
            LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams5.weight = 1.0f;
            c1619v.setLayoutParams(layoutParams5);
            c1619v.setGravity(80);
            linearLayout.addView(c1619v);
        }
    }

    /* renamed from: a */
    private int m5465a(boolean z, int i) {
        return (int) (((double) (i - 30)) * (3.0d / ((double) (z + 3))));
    }

    public TextView getCallToActionView() {
        return this.f4423c;
    }

    public ImageView getIconView() {
        return this.f4421a;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TextView titleTextView = this.f4422b.getTitleTextView();
        if (titleTextView.getLayout().getLineEnd(titleTextView.getLineCount() - 1) < this.f4422b.getMinVisibleTitleCharacters()) {
            this.f4424d.removeView(this.f4421a);
            super.onMeasure(i, i2);
        }
    }
}
