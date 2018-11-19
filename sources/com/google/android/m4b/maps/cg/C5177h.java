package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.p113m.C5475a;

/* renamed from: com.google.android.m4b.maps.cg.h */
public final class C5177h {
    /* renamed from: a */
    private final RelativeLayout f19263a;
    /* renamed from: b */
    private final Resources f19264b;
    /* renamed from: c */
    private final Context f19265c;
    /* renamed from: d */
    private cg f19266d;
    /* renamed from: e */
    private bb f19267e;
    /* renamed from: f */
    private ai f19268f;
    /* renamed from: g */
    private final ap f19269g;
    /* renamed from: h */
    private C6628m f19270h;

    public C5177h(Context context, Resources resources, ap apVar) {
        this.f19263a = new RelativeLayout(context);
        this.f19263a.setLayoutParams(new LayoutParams(-1, -1));
        this.f19265c = context;
        this.f19264b = resources;
        this.f19269g = apVar;
        context = new LayoutParams(-2, -2);
        if (m23134g() != null) {
            context.addRule(9);
            context.addRule(15);
        } else {
            context.addRule(11);
            context.addRule(10);
        }
        context.setMargins(0, this.f19264b.getDimensionPixelSize(C4513R.dimen.maps_btn_margin), this.f19264b.getDimensionPixelSize(C4513R.dimen.maps_btn_margin), 0);
        Context context2 = this.f19265c;
        Resources resources2 = this.f19264b;
        View imageView = new ImageView(context2);
        int i = C4513R.drawable.maps_btn_myl;
        if (C5475a.m23830a(context2) != null) {
            i = C4513R.drawable.maps_btn_myl_wear;
        }
        imageView.setImageDrawable(resources2.getDrawable(i));
        imageView.setVisibility(8);
        imageView.setContentDescription(resources2.getString(C4513R.string.maps_MY_LOCATION_ALT_TEXT));
        imageView.setTag("GoogleMapMyLocationButton");
        this.f19267e = new bb(imageView);
        m23133a(this.f19267e.m22940a(), 2, context);
        context = new LayoutParams(-2, -1);
        context.addRule(11);
        context.addRule(2, 1);
        context.addRule(3, 2);
        context.setMargins(0, this.f19264b.getDimensionPixelSize(C4513R.dimen.maps_btn_margin), this.f19264b.getDimensionPixelSize(C4513R.dimen.maps_btn_margin), this.f19264b.getDimensionPixelSize(C4513R.dimen.maps_btn_margin));
        this.f19268f = ai.m22844a(this.f19265c, this.f19264b);
        m23133a(this.f19268f.m22846a(), 3, context);
        context = new LayoutParams(-2, -2);
        if (m23134g()) {
            context.addRule(14);
            context.addRule(10);
        } else {
            context.addRule(11);
            context.addRule(12);
        }
        context.setMargins(0, 0, this.f19264b.getDimensionPixelSize(C4513R.dimen.maps_btn_margin), this.f19264b.getDimensionPixelSize(C4513R.dimen.maps_btn_zoom_y_margin));
        this.f19266d = cg.m23104a(this.f19265c, this.f19264b);
        m23133a(this.f19266d.m23105a(), 1, context);
        context = new LayoutParams(-2, -2);
        context.addRule(0, 1);
        context.alignWithParent = true;
        context.addRule(12);
        context.setMargins(0, 0, this.f19264b.getDimensionPixelSize(C4513R.dimen.maps_btn_margin), this.f19264b.getDimensionPixelSize(C4513R.dimen.maps_btn_zoom_y_margin));
        m23133a(this.f19269g.m32835d(), 4, context);
        context = new LayoutParams(-2, -2);
        if (m23134g() != null) {
            context.addRule(11);
            context.addRule(15);
        } else {
            context.addRule(9);
            context.addRule(10);
        }
        context.setMargins(this.f19264b.getDimensionPixelSize(C4513R.dimen.maps_btn_margin), this.f19264b.getDimensionPixelSize(C4513R.dimen.maps_btn_margin), 0, 0);
        this.f19270h = new C6628m(this.f19265c, this.f19264b);
        this.f19270h.setTag("GoogleMapCompass");
        m23133a(this.f19270h, 5, context);
    }

    /* renamed from: a */
    private void m23133a(View view, int i, LayoutParams layoutParams) {
        view.setVisibility(8);
        view.setId(i);
        this.f19263a.addView(view, layoutParams);
    }

    /* renamed from: g */
    private boolean m23134g() {
        return C5475a.m23830a(this.f19265c);
    }

    /* renamed from: a */
    public final void m23136a(int i, int i2, int i3, int i4) {
        this.f19263a.setPadding(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final View m23135a() {
        return this.f19263a;
    }

    /* renamed from: b */
    public final cg m23137b() {
        return this.f19266d;
    }

    /* renamed from: c */
    public final bb m23138c() {
        return this.f19267e;
    }

    /* renamed from: d */
    public final ai m23139d() {
        return this.f19268f;
    }

    /* renamed from: e */
    public final ap m23140e() {
        return this.f19269g;
    }

    /* renamed from: f */
    public final C6628m m23141f() {
        return this.f19270h;
    }
}
