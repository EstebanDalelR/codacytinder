package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.p107g.C5398g;

public final class bs {
    /* renamed from: a */
    private final RelativeLayout f19130a;
    /* renamed from: b */
    private final Context f19131b;
    /* renamed from: c */
    private ImageView f19132c;
    /* renamed from: d */
    private TextView f19133d;
    /* renamed from: e */
    private TextView f19134e = m23013c();
    /* renamed from: f */
    private final Resources f19135f;

    public bs(Context context, Resources resources) {
        this.f19130a = new RelativeLayout(context);
        this.f19130a.setLayoutParams(new LayoutParams(-1, -1));
        this.f19131b = context;
        this.f19135f = resources;
        this.f19130a.setVisibility(8);
        this.f19134e.setId(1);
        this.f19134e.setVisibility(8);
        context = new LayoutParams(-2, -2);
        context.addRule(11);
        context.addRule(12);
        context.setMargins(10, 0, 0, 0);
        this.f19130a.addView(this.f19134e, context);
        this.f19133d = m23013c();
        this.f19133d.setText("Report a problem");
        this.f19133d.setId(2);
        context = new LayoutParams(-2, -2);
        context.addRule(0, this.f19134e.getId());
        context.addRule(12);
        this.f19130a.addView(this.f19133d, context);
        this.f19132c = new ImageView(this.f19131b);
        this.f19132c.setImageDrawable(this.f19135f.getDrawable(C4513R.drawable.maps_watermark_light));
        context = new LayoutParams(-2, -2);
        context.addRule(9);
        context.addRule(12);
        int dimensionPixelSize = this.f19135f.getDimensionPixelSize(C4513R.dimen.maps_watermark_margin);
        context.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.f19132c.setLayoutParams(context);
        this.f19132c.setTag("GoogleWatermark");
        this.f19130a.addView(this.f19132c);
        if (C5398g.m23589e(this.f19131b) != null) {
            this.f19133d.setVisibility(8);
        }
    }

    /* renamed from: c */
    private TextView m23013c() {
        TextView textView = new TextView(this.f19131b);
        textView.setClickable(true);
        textView.setBackgroundColor(-1862270977);
        textView.setTextColor(-16777216);
        textView.setTextSize(10.0f);
        textView.setPadding(5, 0, 5, 0);
        return textView;
    }

    /* renamed from: a */
    public final void m23015a(String str) {
        this.f19134e.setText(str);
        this.f19134e.setVisibility(str.isEmpty() != null ? 8 : null);
    }

    /* renamed from: a */
    public final View m23014a() {
        return this.f19130a;
    }

    /* renamed from: b */
    public final TextView m23017b() {
        return this.f19133d;
    }

    /* renamed from: a */
    public final void m23016a(boolean z) {
        this.f19130a.setVisibility(z ? false : true);
    }
}
