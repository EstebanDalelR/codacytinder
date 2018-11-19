package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.C1359i;

/* renamed from: com.facebook.ads.internal.view.component.h */
public class C1602h extends LinearLayout {
    /* renamed from: a */
    private static final float f4434a = Resources.getSystem().getDisplayMetrics().density;
    /* renamed from: b */
    private static final int f4435b = ((int) (f4434a * 6.0f));
    /* renamed from: c */
    private static final int f4436c = ((int) (f4434a * 8.0f));
    /* renamed from: d */
    private final TextView f4437d;
    /* renamed from: e */
    private final TextView f4438e;

    public C1602h(Context context, C1359i c1359i, boolean z, boolean z2, boolean z3) {
        super(context);
        setOrientation(1);
        this.f4437d = new TextView(context);
        this.f4437d.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.f4437d.setTextSize(2, z2 ? 18.0f : 20.0f);
        this.f4437d.setTextColor(c1359i.m4755c(z));
        this.f4437d.setEllipsize(TruncateAt.END);
        this.f4437d.setLineSpacing((float) f4435b, 1.0f);
        this.f4438e = new TextView(context);
        this.f4438e.setTypeface(Typeface.SANS_SERIF, 0);
        this.f4438e.setTextSize(2, z2 ? 14.0f : 16.0f);
        this.f4438e.setTextColor(c1359i.m4754b(z));
        this.f4438e.setEllipsize(TruncateAt.END);
        this.f4438e.setLineSpacing((float) f4435b, 1.0f);
        addView(this.f4437d, new LayoutParams(-1, -2));
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.setMargins(0, z3 ? f4436c / 2 : f4436c, 0, 0);
        addView(this.f4438e, layoutParams);
    }

    /* renamed from: a */
    public void m5467a(String str, String str2, boolean z, boolean z2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        TextView textView;
        int isEmpty = TextUtils.isEmpty(str) ^ 1;
        int isEmpty2 = TextUtils.isEmpty(str2) ^ 1;
        TextView textView2 = this.f4437d;
        if (isEmpty == 0) {
            charSequence = str2;
        }
        textView2.setText(charSequence);
        TextView textView3 = this.f4438e;
        if (isEmpty == 0) {
            charSequence2 = "";
        }
        textView3.setText(charSequence2);
        int i = 3;
        if (isEmpty != 0) {
            if (isEmpty2 != 0) {
                this.f4437d.setMaxLines(z ? 1 : 2);
                textView = this.f4438e;
                if (z) {
                    i = 1;
                } else {
                    if (z2) {
                    }
                    i = 2;
                }
                textView.setMaxLines(i);
            }
        }
        textView = this.f4437d;
        if (!z) {
            if (z2) {
                i = 4;
            }
            textView.setMaxLines(i);
        }
        i = 2;
        textView.setMaxLines(i);
    }

    public void setAlignment(int i) {
        this.f4437d.setGravity(i);
        this.f4438e.setGravity(i);
    }
}
