package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.p113m.C5475a;

public final class cg implements OnClickListener {
    /* renamed from: a */
    private final View f19243a;
    /* renamed from: b */
    private final View f19244b;
    /* renamed from: c */
    private final View f19245c;
    /* renamed from: d */
    private C5172a f19246d;

    /* renamed from: com.google.android.m4b.maps.cg.cg$a */
    public interface C5172a {
        /* renamed from: a */
        void mo5321a();

        /* renamed from: b */
        void mo5322b();
    }

    private cg(View view, View view2, View view3) {
        this.f19245c = view;
        this.f19243a = view2;
        this.f19244b = view3;
    }

    /* renamed from: a */
    public static cg m23104a(Context context, Resources resources) {
        int i;
        int i2 = C4513R.drawable.maps_btn_zoom_up;
        int i3 = C4513R.drawable.maps_btn_zoom_down;
        if (C5475a.m23830a(context)) {
            i2 = C4513R.drawable.maps_btn_zoom_up_wear;
            i3 = C4513R.drawable.maps_btn_zoom_down_wear;
            i = 1;
        } else {
            i = 0;
        }
        View linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i ^ 1);
        View imageView = new ImageView(context);
        imageView.setLayoutParams(new LayoutParams(-2, -2));
        imageView.setImageDrawable(resources.getDrawable(i2));
        imageView.setContentDescription(resources.getString(C4513R.string.maps_ZOOM_IN_ALT_TEXT));
        imageView.setTag("GoogleMapZoomInButton");
        View imageView2 = new ImageView(context);
        imageView2.setLayoutParams(new LayoutParams(-2, -2));
        imageView2.setImageDrawable(resources.getDrawable(i3));
        imageView2.setContentDescription(resources.getString(C4513R.string.maps_ZOOM_OUT_ALT_TEXT));
        imageView2.setTag("GoogleMapZoomOutButton");
        if (i != 0) {
            linearLayout.addView(imageView2);
            linearLayout.addView(imageView);
        } else {
            linearLayout.addView(imageView);
            linearLayout.addView(imageView2);
        }
        context = new cg(linearLayout, imageView, imageView2);
        imageView.setOnClickListener(context);
        imageView2.setOnClickListener(context);
        return context;
    }

    /* renamed from: a */
    public final void m23107a(boolean z) {
        this.f19245c.setVisibility(z ? false : true);
    }

    /* renamed from: a */
    public final void m23106a(C5172a c5172a) {
        this.f19246d = c5172a;
    }

    public final void onClick(View view) {
        if (this.f19246d != null) {
            if (view == this.f19243a) {
                this.f19246d.mo5321a();
                return;
            }
            if (view == this.f19244b) {
                this.f19246d.mo5322b();
            }
        }
    }

    /* renamed from: b */
    public final void m23108b(boolean z) {
        this.f19243a.setEnabled(z);
    }

    /* renamed from: c */
    public final void m23109c(boolean z) {
        this.f19244b.setEnabled(z);
    }

    /* renamed from: a */
    public final View m23105a() {
        return this.f19245c;
    }
}
