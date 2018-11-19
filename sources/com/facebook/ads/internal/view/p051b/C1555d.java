package com.facebook.ads.internal.view.p051b;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p047k.C1505r;

/* renamed from: com.facebook.ads.internal.view.b.d */
public class C1555d extends LinearLayout {
    /* renamed from: a */
    private C4156e f4335a;
    /* renamed from: b */
    private TextView f4336b;
    /* renamed from: c */
    private TextView f4337c;

    public C1555d(Context context) {
        super(context);
        m5418a(context);
    }

    /* renamed from: a */
    public void m5417a(int i, int i2) {
        this.f4336b.setTextColor(i);
        this.f4337c.setTextColor(i2);
    }

    /* renamed from: a */
    public void m5418a(Context context) {
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (32.0f * f);
        setGravity(16);
        this.f4335a = new C4156e(context);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.setMargins(0, 0, (int) (f * 8.0f), 0);
        addView(this.f4335a, layoutParams);
        View linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f4336b = new TextView(context);
        LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        this.f4336b.setTypeface(Typeface.SANS_SERIF, 1);
        this.f4336b.setTextSize(2, 16.0f);
        this.f4336b.setEllipsize(TruncateAt.END);
        this.f4336b.setSingleLine(true);
        this.f4337c = new TextView(context);
        this.f4337c.setTypeface(Typeface.SANS_SERIF, 0);
        this.f4337c.setTextSize(2, 14.0f);
        this.f4337c.setText("Sponsored");
        linearLayout.addView(this.f4336b);
        linearLayout.addView(this.f4337c);
        addView(linearLayout, layoutParams2);
    }

    /* renamed from: a */
    public void m5419a(String str, String str2) {
        new C1505r(this.f4335a).m5301a(str2);
        this.f4336b.setText(str);
    }
}
