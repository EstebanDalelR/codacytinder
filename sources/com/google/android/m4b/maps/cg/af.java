package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.C5539g;
import com.google.android.m4b.maps.p124x.C5540h.C6810a;
import com.google.android.m4b.maps.p125y.C5579p;

public class af extends C6810a {
    /* renamed from: a */
    private static final String f27831a = "af";
    /* renamed from: b */
    private final aa f27832b;
    /* renamed from: c */
    private final ViewGroup f27833c;
    /* renamed from: d */
    private final ae f27834d;
    /* renamed from: e */
    private C5539g f27835e;

    private af(aa aaVar, ViewGroup viewGroup, ae aeVar) {
        this.f27832b = aaVar;
        this.f27833c = viewGroup;
        this.f27834d = aeVar;
    }

    /* renamed from: a */
    public final void m32790a(C5539g c5539g) {
        this.f27832b.mo4875a();
        this.f27835e = c5539g;
    }

    /* renamed from: a */
    private View m32787a(IMarkerDelegate iMarkerDelegate) {
        try {
            View view = this.f27835e != null ? (View) C7701d.m33408a(this.f27835e.mo5789a(iMarkerDelegate)) : null;
            if (view == null) {
                try {
                    view = this.f27835e != null ? (View) C7701d.m33408a(this.f27835e.mo5790b(iMarkerDelegate)) : null;
                    if (view == null) {
                        if (C5579p.m24319b(iMarkerDelegate.getTitle())) {
                            return null;
                        }
                        this.f27834d.m22840a(iMarkerDelegate.getTitle());
                        this.f27834d.m22841b(iMarkerDelegate.getSnippet());
                        view = this.f27834d;
                    }
                    this.f27833c.removeAllViews();
                    this.f27833c.addView(view);
                    view = this.f27833c;
                } catch (IMarkerDelegate iMarkerDelegate2) {
                    throw new RuntimeRemoteException(iMarkerDelegate2);
                }
            }
            return view;
        } catch (IMarkerDelegate iMarkerDelegate22) {
            throw new RuntimeRemoteException(iMarkerDelegate22);
        }
    }

    /* renamed from: a */
    public final Bitmap mo7149a(IMarkerDelegate iMarkerDelegate, int i, int i2) {
        try {
            iMarkerDelegate = m32787a(iMarkerDelegate);
        } catch (IMarkerDelegate iMarkerDelegate2) {
            if (C4728u.m21050a(f27831a, 6)) {
                Log.e(f27831a, "Error while creating the info window.");
            }
            iMarkerDelegate2.printStackTrace();
            iMarkerDelegate2 = null;
        }
        if (iMarkerDelegate2 == null) {
            return null;
        }
        i = MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        i2 = MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        iMarkerDelegate2.setLayoutParams(new LayoutParams(-2, -2));
        iMarkerDelegate2.measure(i, i2);
        i = iMarkerDelegate2.getMeasuredWidth();
        i2 = iMarkerDelegate2.getMeasuredHeight();
        if (i != 0) {
            if (i2 != 0) {
                iMarkerDelegate2.layout(0, 0, i, i2);
                i = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                iMarkerDelegate2.draw(new Canvas(i));
                return i;
            }
        }
        if (C4728u.m21050a(f27831a, 5) != null) {
            Log.w(f27831a, "Info window has a width or height of zero.");
        }
        return null;
    }

    /* renamed from: a */
    public static af m32788a(aa aaVar, Context context, Resources resources) {
        ViewGroup linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundDrawable(resources.getDrawable(C4513R.drawable.maps_popup_pointer_button_normal));
        return new af(aaVar, linearLayout, ae.m22839a(context));
    }
}
