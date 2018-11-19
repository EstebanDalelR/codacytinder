package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView.Type;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.component.C1597c;
import com.facebook.ads.internal.view.component.C1601g;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.internal.view.a */
public class C1544a extends RelativeLayout {
    /* renamed from: a */
    private final NativeAdViewAttributes f4314a;
    /* renamed from: b */
    private final NativeAd f4315b;
    /* renamed from: c */
    private final float f4316c = an.f4090b;
    /* renamed from: d */
    private ArrayList<View> f4317d;

    public C1544a(Context context, NativeAd nativeAd, Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        super(context);
        setBackgroundColor(nativeAdViewAttributes.getBackgroundColor());
        this.f4314a = nativeAdViewAttributes;
        this.f4315b = nativeAd;
        setLayoutParams(new LayoutParams(-1, Math.round(((float) type.getHeight()) * this.f4316c)));
        View c1620w = new C1620w(context);
        c1620w.setMinWidth(Math.round(this.f4316c * 280.0f));
        c1620w.setMaxWidth(Math.round(this.f4316c * 375.0f));
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        c1620w.setLayoutParams(layoutParams);
        addView(c1620w);
        ViewGroup linearLayout = new LinearLayout(context);
        this.f4317d = new ArrayList();
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-1, -1));
        c1620w.addView(linearLayout);
        switch (type) {
            case HEIGHT_400:
                m5413b(linearLayout);
                break;
            case HEIGHT_300:
                break;
            default:
                break;
        }
        m5409a(linearLayout);
        m5410a(linearLayout, type);
        nativeAd.registerViewForInteraction(this, this.f4317d);
        View adChoicesView = new AdChoicesView(getContext(), nativeAd, true);
        LayoutParams layoutParams2 = (LayoutParams) adChoicesView.getLayoutParams();
        layoutParams2.addRule(11);
        layoutParams2.setMargins(Math.round(this.f4316c * 4.0f), Math.round(this.f4316c * 4.0f), Math.round(this.f4316c * 4.0f), Math.round(this.f4316c * 4.0f));
        c1620w.addView(adChoicesView);
    }

    /* renamed from: a */
    private void m5409a(ViewGroup viewGroup) {
        View relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(this.f4316c * 180.0f)));
        relativeLayout.setBackgroundColor(this.f4314a.getBackgroundColor());
        View mediaView = new MediaView(getContext());
        relativeLayout.addView(mediaView);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, (int) (this.f4316c * 180.0f));
        layoutParams.addRule(13, -1);
        mediaView.setLayoutParams(layoutParams);
        mediaView.setAutoplay(this.f4314a.getAutoplay());
        mediaView.setAutoplayOnMobile(this.f4314a.getAutoplayOnMobile());
        mediaView.setNativeAd(this.f4315b);
        viewGroup.addView(relativeLayout);
        this.f4317d.add(mediaView);
    }

    /* renamed from: a */
    private void m5410a(ViewGroup viewGroup, Type type) {
        View c1597c = new C1597c(getContext(), this.f4315b, this.f4314a, m5411a(type), m5412b(type));
        c1597c.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(((float) m5412b(type)) * this.f4316c)));
        viewGroup.addView(c1597c);
        this.f4317d.add(c1597c.getIconView());
        this.f4317d.add(c1597c.getCallToActionView());
    }

    /* renamed from: a */
    private boolean m5411a(Type type) {
        if (type != Type.HEIGHT_300) {
            if (type != Type.HEIGHT_120) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private int m5412b(Type type) {
        switch (type) {
            case HEIGHT_400:
                return (type.getHeight() - 180) / 2;
            case HEIGHT_300:
                return type.getHeight() - 180;
            case HEIGHT_100:
            case HEIGHT_120:
                return type.getHeight();
            default:
                return 0;
        }
    }

    /* renamed from: b */
    private void m5413b(ViewGroup viewGroup) {
        View c1601g = new C1601g(getContext(), this.f4315b, this.f4314a);
        c1601g.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(this.f4316c * 110.0f)));
        viewGroup.addView(c1601g);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4315b.unregisterView();
    }
}
