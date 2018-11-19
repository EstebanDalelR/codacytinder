package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.ay.C4725p;

public final class cf {
    /* renamed from: a */
    private final RelativeLayout f19236a;
    /* renamed from: b */
    private final Resources f19237b;
    /* renamed from: c */
    private final Context f19238c;
    /* renamed from: d */
    private ImageView f19239d;
    /* renamed from: e */
    private TextView f19240e;
    /* renamed from: f */
    private final boolean f19241f;
    /* renamed from: g */
    private final boolean f19242g;

    public cf(Context context, Resources resources) {
        this(context, resources, false, "", C4725p.m21034k(), C4725p.m21035l());
    }

    private cf(Context context, Resources resources, boolean z, String str, boolean z2, boolean z3) {
        this.f19236a = new RelativeLayout(context);
        this.f19236a.setLayoutParams(new LayoutParams(-1, -1));
        this.f19238c = context;
        this.f19237b = resources;
        this.f19241f = z2;
        this.f19242g = z3;
        this.f19239d = new ImageView(this.f19238c);
        this.f19239d.setImageDrawable(this.f19237b.getDrawable(C4513R.drawable.maps_watermark_dark));
        context = new LayoutParams(-2, -2);
        context.addRule(true);
        context.addRule(12);
        str = this.f19237b.getDimensionPixelSize(C4513R.dimen.maps_watermark_margin);
        context.setMargins(str, str, str, str);
        this.f19239d.setLayoutParams(context);
        this.f19239d.setTag("GoogleWatermark");
        z2 = true;
        this.f19239d.setVisibility(this.f19242g != null ? null : 8);
        this.f19236a.addView(this.f19239d);
        this.f19240e = new TextView(this.f19238c);
        context = new LayoutParams(-2, -2);
        context.addRule(11);
        context.addRule(12);
        this.f19240e.setLayoutParams(context);
        this.f19240e.setTextSize(false, (float) this.f19237b.getDimensionPixelSize(C4513R.dimen.maps_dav_hud_copyright_fontsize));
        this.f19240e.setTextColor(-16777216);
        this.f19240e.setSingleLine(true);
        this.f19240e.setTag("GoogleCopyrights");
        context = this.f19240e;
        if (this.f19241f != null) {
            z2 = false;
        }
        context.setVisibility(z2);
        this.f19236a.addView(this.f19240e);
    }

    /* renamed from: a */
    public final void m23098a(int i, int i2, int i3, int i4) {
        this.f19236a.setPadding(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final View m23097a() {
        return this.f19236a;
    }

    /* renamed from: b */
    public final TextView m23100b() {
        return this.f19240e;
    }

    /* renamed from: a */
    public final void m23099a(boolean z) {
        this.f19239d.setImageDrawable(this.f19237b.getDrawable(z ? C4513R.drawable.maps_watermark_light : C4513R.drawable.maps_watermark_dark));
        this.f19240e.setTextColor(z ? true : true);
    }

    /* renamed from: b */
    public final void m23101b(boolean z) {
        TextView textView = this.f19240e;
        z = (this.f19241f && z) ? false : true;
        textView.setVisibility(z);
    }
}
