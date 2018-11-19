package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.p124x.C5545m.C6818a;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.LinkedList;

public final class ap extends C6818a implements OnClickListener {
    /* renamed from: a */
    private static final int f27856a = C4513R.color.maps_qu_google_blue_500;
    /* renamed from: b */
    private static final int f27857b = C4513R.color.maps_qu_google_yellow_500;
    /* renamed from: c */
    private final Resources f27858c;
    /* renamed from: d */
    private final ImageView f27859d;
    /* renamed from: e */
    private final ImageView f27860e;
    /* renamed from: f */
    private final ImageView f27861f;
    /* renamed from: g */
    private final LinkedList<ImageView> f27862g;
    /* renamed from: h */
    private final LinearLayout f27863h;
    /* renamed from: i */
    private boolean f27864i;
    /* renamed from: j */
    private boolean f27865j;
    /* renamed from: k */
    private boolean f27866k = false;
    /* renamed from: l */
    private final boolean f27867l;
    /* renamed from: m */
    private final C5188s f27868m;
    /* renamed from: n */
    private az f27869n;
    /* renamed from: o */
    private boolean f27870o;
    /* renamed from: p */
    private CameraPosition f27871p;
    /* renamed from: q */
    private final int f27872q;
    /* renamed from: r */
    private final int f27873r;
    /* renamed from: s */
    private final int f27874s;

    private ap(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, Resources resources, C5188s c5188s, boolean z) {
        this.f27858c = (Resources) C5571j.m24293a((Object) resources, (Object) "libraryResources");
        this.f27863h = (LinearLayout) C5571j.m24293a((Object) linearLayout, (Object) "toolbarView");
        this.f27859d = (ImageView) C5571j.m24293a((Object) imageView, (Object) "openGmmButton");
        this.f27860e = (ImageView) C5571j.m24293a((Object) imageView2, (Object) "directionsButton");
        this.f27861f = (ImageView) C5571j.m24293a((Object) imageView3, (Object) "starButton");
        this.f27868m = (C5188s) C5571j.m24293a((Object) c5188s, (Object) "gmmLauncher");
        this.f27867l = z;
        this.f27872q = resources.getDimensionPixelSize(C4513R.dimen.maps_btn_map_toolbar_margin);
        this.f27873r = resources.getDimensionPixelSize(C4513R.dimen.maps_btn_map_toolbar_divider);
        this.f27874s = resources.getDimensionPixelSize(C4513R.dimen.maps_btn_map_toolbar_bottom_shadow);
        this.f27862g = new LinkedList();
        this.f27863h.setOrientation(0);
        this.f27863h.setTag("GoogleMapToolbar");
        this.f27863h.setVisibility(8);
        this.f27859d.setImageDrawable(this.f27858c.getDrawable(C4513R.drawable.maps_icon_gmm));
        this.f27859d.setContentDescription(this.f27858c.getString(C4513R.string.maps_OPEN_GMM_ALT_TEXT));
        this.f27859d.setTag("GoogleMapOpenGmmButton");
        this.f27860e.setImageDrawable(this.f27858c.getDrawable(C4513R.drawable.maps_icon_direction));
        this.f27860e.setContentDescription(this.f27858c.getString(C4513R.string.maps_DIRECTIONS_ALT_TEXT));
        this.f27860e.setTag("GoogleMapDirectionsButton");
        this.f27860e.setColorFilter(this.f27858c.getColor(f27856a));
        this.f27859d.setOnClickListener(this);
        this.f27860e.setOnClickListener(this);
        this.f27861f.setOnClickListener(this);
        this.f27863h.addView(this.f27861f);
        this.f27863h.addView(this.f27860e);
        this.f27863h.addView(this.f27859d);
    }

    /* renamed from: a */
    public static ap m32824a(Context context, Resources resources, C5188s c5188s, boolean z) {
        return new ap(new LinearLayout(context), new ImageView(context), new ImageView(context), new ImageView(context), resources, c5188s, z);
    }

    /* renamed from: a */
    public final void m32831a(boolean z) {
        this.f27864i = z;
        if (!z) {
            this.f27863h.setVisibility(8);
        }
        m32827e();
    }

    /* renamed from: a */
    public final Boolean m32828a() {
        return Boolean.valueOf(this.f27864i);
    }

    /* renamed from: b */
    public final void m32833b() {
        this.f27869n = null;
        if (!this.f27867l) {
            m32825a(this.f27863h, false);
        }
        this.f27866k = false;
        this.f27863h.setVisibility(8);
    }

    /* renamed from: a */
    public final void m32832a(boolean z, boolean z2, az azVar, boolean z3) {
        this.f27866k = true;
        if (this.f27864i) {
            boolean z4 = false;
            this.f27860e.setVisibility(z2 ? 0 : 8);
            this.f27859d.setVisibility(0);
            this.f27861f.setVisibility(8);
            this.f27869n = azVar;
            this.f27870o = z3;
            this.f27862g.clear();
            if (z2) {
                this.f27862g.add(this.f27860e);
            }
            this.f27862g.add(this.f27859d);
            z2 = this.f27862g.size();
            if (z2) {
                m32826a((ImageView) this.f27862g.get(0), C4513R.drawable.maps_btn_standalone);
            } else {
                while (z4 < z2) {
                    ImageView imageView = (ImageView) this.f27862g.get(z4);
                    if (!z4) {
                        m32826a(imageView, C4513R.drawable.maps_btn_left);
                    } else if (z4 == z2 - 1) {
                        m32826a(imageView, C4513R.drawable.maps_btn_right);
                    } else {
                        m32826a(imageView, C4513R.drawable.maps_btn_middle);
                    }
                    z4++;
                }
            }
            m32827e();
        }
    }

    /* renamed from: e */
    private void m32827e() {
        if (this.f27866k && this.f27865j) {
            if (this.f27864i) {
                if (!this.f27867l) {
                    m32825a(this.f27863h, true);
                }
                this.f27863h.setVisibility(0);
            }
        }
    }

    public final void onClick(View view) {
        if (view == this.f27859d) {
            this.f27868m.m23186a(this.f27871p, this.f27869n, this.f27870o);
            return;
        }
        if (view == this.f27860e) {
            this.f27868m.m23185a(this.f27869n);
        }
    }

    /* renamed from: c */
    public final void m32834c() {
        this.f27865j = true;
        m32827e();
    }

    /* renamed from: d */
    public final View m32835d() {
        return this.f27863h;
    }

    /* renamed from: a */
    public final void m32829a(az azVar) {
        if (this.f27869n == azVar && this.f27867l == null) {
            m32833b();
        }
    }

    /* renamed from: a */
    public final void mo5313a(CameraPosition cameraPosition) {
        this.f27871p = cameraPosition;
        if (this.f27867l == null && this.f27869n != null && this.f27869n.m32886s().m22939i(this.f27869n) == null) {
            m32833b();
        }
    }

    /* renamed from: a */
    private void m32826a(ImageView imageView, int i) {
        if (VERSION.SDK_INT >= 16) {
            imageView.setBackground(this.f27858c.getDrawable(i));
        } else {
            imageView.setBackgroundDrawable(this.f27858c.getDrawable(i));
        }
        Drawable background = imageView.getBackground();
        imageView.setLayoutParams(new LayoutParams(background.getIntrinsicWidth(), background.getIntrinsicHeight()));
        if (i == C4513R.drawable.maps_btn_right) {
            imageView.setPadding(this.f27873r, 0, this.f27872q, this.f27874s);
        } else if (i == C4513R.drawable.maps_btn_left) {
            imageView.setPadding(this.f27872q, 0, this.f27873r, this.f27874s);
        } else {
            imageView.setPadding(0, 0, 0, this.f27874s);
        }
        imageView.setScaleType(ScaleType.CENTER);
    }

    /* renamed from: a */
    private void m32825a(View view, boolean z) {
        if (z != (view.getVisibility() == 0)) {
            if (view == this.f27863h) {
                if (z) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                    translateAnimation.setInterpolator(new DecelerateInterpolator());
                    translateAnimation.setDuration(300);
                } else {
                    TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 2, 1.0f, 1, 0.0f, 1, 0.0f);
                    translateAnimation2.setInterpolator(new AccelerateInterpolator());
                    translateAnimation2.setDuration(300);
                }
            } else if (view == this.f27861f) {
                C5571j.m24298a(z, (Object) "Slide out not implemented for the star.");
                TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation3.setInterpolator(new DecelerateInterpolator());
                translateAnimation3.setDuration(100);
            } else {
                throw new IllegalArgumentException("No animation set for this view.");
            }
            view.startAnimation(z);
        }
    }
}
