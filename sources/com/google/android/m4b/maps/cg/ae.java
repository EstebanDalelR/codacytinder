package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class ae extends LinearLayout {
    /* renamed from: a */
    private final TextView f19036a;
    /* renamed from: b */
    private final TextView f19037b;

    private ae(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f19036a = textView;
        this.f19037b = textView2;
    }

    /* renamed from: a */
    public static ae m22839a(Context context) {
        View textView = new TextView(context);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        textView.setLayoutParams(layoutParams);
        textView.setEllipsize(TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextColor(-16777216);
        textView.setTextSize(14.0f);
        textView.setTypeface(null, 1);
        View textView2 = new TextView(context);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView2.setEllipsize(TruncateAt.END);
        textView2.setSingleLine(true);
        textView2.setTextColor(-7829368);
        textView2.setTextSize(14.0f);
        ae aeVar = new ae(context, textView, textView2);
        aeVar.addView(textView);
        aeVar.addView(textView2);
        aeVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        aeVar.setOrientation(1);
        return aeVar;
    }

    /* renamed from: a */
    public final void m22840a(String str) {
        this.f19036a.setText(str);
        this.f19036a.setVisibility(str != null ? null : 8);
    }

    /* renamed from: b */
    public final void m22841b(String str) {
        this.f19037b.setText(str);
        this.f19037b.setVisibility(str != null ? null : 8);
    }
}
