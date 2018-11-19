package com.tinder.tinderplus.behavior;

import android.content.Context;
import android.support.design.widget.AppBarLayout.ScrollingViewBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.tinder.R;
import com.tinder.utils.C15358e;
import com.tinder.utils.ad;
import com.tinder.utils.av;

public class GetTPlusHeaderBehavior extends ScrollingViewBehavior {
    /* renamed from: c */
    private Context f59407c;
    /* renamed from: d */
    private View f59408d;
    /* renamed from: e */
    private View f59409e;
    /* renamed from: f */
    private int f59410f;
    /* renamed from: g */
    private View f59411g;
    /* renamed from: h */
    private View f59412h;
    /* renamed from: i */
    private View f59413i;
    /* renamed from: j */
    private View f59414j;
    /* renamed from: k */
    private View f59415k;
    /* renamed from: l */
    private int f59416l;
    /* renamed from: m */
    private int f59417m;
    /* renamed from: n */
    private int f59418n;
    /* renamed from: o */
    private int f59419o;
    /* renamed from: p */
    private int f59420p;
    /* renamed from: q */
    private int f59421q;
    /* renamed from: r */
    private int f59422r;
    /* renamed from: s */
    private int f59423s;

    public GetTPlusHeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59407c = context;
    }

    /* renamed from: a */
    public boolean m68143a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f59409e == null) {
            this.f59409e = coordinatorLayout.findViewById(R.id.appbar);
            this.f59411g = this.f59409e.findViewById(R.id.up_icon);
            this.f59408d = this.f59409e.findViewById(R.id.btn_getplus);
            this.f59412h = this.f59409e.findViewById(R.id.header_image);
            this.f59413i = this.f59409e.findViewById(R.id.power_on_text);
            this.f59414j = this.f59409e.findViewById(R.id.toolbar_title);
            this.f59415k = this.f59409e.findViewById(R.id.appbar_divider);
        }
        return super.a(coordinatorLayout, view, view2);
    }

    /* renamed from: b */
    public boolean m68144b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        m68142d(this.f59409e);
        float height = (float) (this.f59409e.getHeight() - this.f59410f);
        float abs = 1.0f - (Math.abs(this.f59409e.getY()) / height);
        float abs2 = 1.0f - (Math.abs(this.f59409e.getY()) / (0.25f * height));
        height = 1.0f - (Math.abs(this.f59409e.getY()) / height);
        float f = 1.0f - height;
        float f2 = ((float) (this.f59416l - this.f59419o)) * f;
        float f3 = ((float) (this.f59417m - this.f59418n)) * f;
        float f4 = ((float) (this.f59421q - this.f59422r)) * f;
        f = 1.0f - (f * 0.2f);
        if (this.f59409e == null || ((float) (r0.f59409e.getHeight() - r0.f59410f)) - Math.abs(r0.f59409e.getY()) > ((float) r0.f59410f)) {
            r0.f59411g.setVisibility(8);
            r0.f59414j.setVisibility(8);
            r0.f59415k.setVisibility(8);
        } else {
            float height2 = (((float) (r0.f59409e.getHeight() - r0.f59410f)) - Math.abs(r0.f59409e.getY())) / ((float) r0.f59410f);
            int i = r0.f59417m;
            i = r0.f59420p;
            height2 = 1.0f - height2;
            r0.f59411g.setVisibility(0);
            r0.f59411g.setY((float) r0.f59420p);
            r0.f59411g.setAlpha(height2);
            r0.f59414j.setVisibility(0);
            r0.f59414j.setY((float) r0.f59420p);
            r0.f59414j.setAlpha(height2);
            if (!C15358e.f47625a.m57654a()) {
                av.b(r0.f59415k, height2);
                if (r0.f59415k.getVisibility() == 8) {
                    av.b(r0.f59415k, 1.0f);
                    r0.f59415k.setVisibility(0);
                }
            }
        }
        if (r0.f59412h != null) {
            r0.f59412h.setAlpha(abs);
        }
        if (r0.f59413i != null) {
            r0.f59413i.setY(((float) r0.f59421q) - f4);
            r0.f59413i.setAlpha(abs2);
        }
        if (height >= 0.0f) {
            r0.f59408d.setX(((float) r0.f59416l) - f2);
            r0.f59408d.setY(((float) r0.f59417m) - f3);
            r0.f59408d.setScaleX(f);
            r0.f59408d.setScaleY(f);
        } else {
            r0.f59408d.setX((float) r0.f59419o);
            r0.f59408d.setY((float) r0.f59418n);
            r0.f59408d.setScaleX(0.8f);
            r0.f59408d.setScaleY(0.8f);
        }
        return super.b(coordinatorLayout, view, view2);
    }

    /* renamed from: d */
    private void m68142d(View view) {
        if (this.f59416l == 0) {
            this.f59416l = (view.getWidth() / 2) - (this.f59408d.getWidth() / 2);
            this.f59408d.setX((float) this.f59416l);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("start x: ");
            stringBuilder.append(this.f59416l);
            ad.a(stringBuilder.toString());
        }
        if (this.f59417m == 0) {
            this.f59417m = ((int) ((view.getY() + ((float) view.getHeight())) / 2.0f)) - (this.f59408d.getHeight() / 2);
            this.f59408d.setY((float) this.f59417m);
            stringBuilder = new StringBuilder();
            stringBuilder.append("start Y: ");
            stringBuilder.append(this.f59417m);
            ad.a(stringBuilder.toString());
        }
        if (this.f59419o == 0) {
            this.f59419o = (view.getWidth() - this.f59408d.getWidth()) - this.f59407c.getResources().getDimensionPixelSize(R.dimen.modal_elevation);
            stringBuilder = new StringBuilder();
            stringBuilder.append("final x: ");
            stringBuilder.append(this.f59419o);
            ad.a(stringBuilder.toString());
        }
        if (this.f59410f == 0) {
            TypedValue typedValue = new TypedValue();
            if (this.f59407c.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
                this.f59410f = TypedValue.complexToDimensionPixelSize(typedValue.data, this.f59407c.getResources().getDisplayMetrics());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("toolbar size: ");
            stringBuilder.append(this.f59410f);
            ad.a(stringBuilder.toString());
        }
        if (this.f59418n == 0) {
            this.f59418n = (this.f59409e.getHeight() - this.f59408d.getHeight()) - ((this.f59410f - this.f59408d.getHeight()) / 2);
            stringBuilder = new StringBuilder();
            stringBuilder.append("final y: ");
            stringBuilder.append(this.f59418n);
            ad.a(stringBuilder.toString());
        }
        if (this.f59420p == 0) {
            this.f59420p = (this.f59409e.getHeight() - this.f59411g.getHeight()) - ((this.f59410f - this.f59411g.getHeight()) / 2);
        }
        if (this.f59423s == 0) {
            this.f59423s = this.f59411g.getRight() + this.f59407c.getResources().getDimensionPixelSize(R.dimen.margin_small);
            this.f59414j.setX((float) this.f59423s);
        }
        if (this.f59421q == 0) {
            this.f59421q = (this.f59417m - this.f59413i.getHeight()) - this.f59407c.getResources().getDimensionPixelSize(R.dimen.margin_xxsmall);
            view = (view.getWidth() / 2) - (this.f59413i.getWidth() / 2);
            this.f59413i.setY((float) this.f59417m);
            this.f59413i.setX((float) view);
        }
        if (this.f59422r == null) {
            this.f59422r = -this.f59413i.getHeight();
        }
    }
}
