package com.facebook.ads;

import android.content.Context;
import android.support.v4.view.C0600i;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.ads.NativeAdView.Type;
import com.facebook.ads.internal.p047k.an;
import java.util.ArrayList;
import java.util.List;

public class NativeAdScrollView extends LinearLayout {
    public static final int DEFAULT_INSET = 20;
    public static final int DEFAULT_MAX_ADS = 10;
    /* renamed from: a */
    private final Context f3567a;
    /* renamed from: b */
    private final NativeAdsManager f3568b;
    /* renamed from: c */
    private final AdViewProvider f3569c;
    /* renamed from: d */
    private final Type f3570d;
    /* renamed from: e */
    private final int f3571e;
    /* renamed from: f */
    private final C3239b f3572f;
    /* renamed from: g */
    private final NativeAdViewAttributes f3573g;

    public interface AdViewProvider {
        View createView(NativeAd nativeAd, int i);

        void destroyView(NativeAd nativeAd, View view);
    }

    /* renamed from: com.facebook.ads.NativeAdScrollView$a */
    private class C3238a extends C0600i {
        /* renamed from: a */
        final /* synthetic */ NativeAdScrollView f9898a;
        /* renamed from: b */
        private List<NativeAd> f9899b = new ArrayList();

        public C3238a(NativeAdScrollView nativeAdScrollView) {
            this.f9898a = nativeAdScrollView;
        }

        /* renamed from: a */
        public void m12409a() {
            this.f9899b.clear();
            int min = Math.min(this.f9898a.f3571e, this.f9898a.f3568b.getUniqueNativeAdCount());
            for (int i = 0; i < min; i++) {
                NativeAd nextNativeAd = this.f9898a.f3568b.nextNativeAd();
                nextNativeAd.m12402a(true);
                this.f9899b.add(nextNativeAd);
            }
            notifyDataSetChanged();
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (i < this.f9899b.size()) {
                if (this.f9898a.f3570d != null) {
                    ((NativeAd) this.f9899b.get(i)).unregisterView();
                } else {
                    this.f9898a.f3569c.destroyView((NativeAd) this.f9899b.get(i), (View) obj);
                }
            }
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return this.f9899b.size();
        }

        public int getItemPosition(Object obj) {
            int indexOf = this.f9899b.indexOf(obj);
            return indexOf >= 0 ? indexOf : -2;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View render = this.f9898a.f3570d != null ? NativeAdView.render(this.f9898a.f3567a, (NativeAd) this.f9899b.get(i), this.f9898a.f3570d, this.f9898a.f3573g) : this.f9898a.f3569c.createView((NativeAd) this.f9899b.get(i), i);
            viewGroup.addView(render);
            return render;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* renamed from: com.facebook.ads.NativeAdScrollView$b */
    private class C3239b extends ViewPager {
        /* renamed from: a */
        final /* synthetic */ NativeAdScrollView f9900a;

        public C3239b(NativeAdScrollView nativeAdScrollView, Context context) {
            this.f9900a = nativeAdScrollView;
            super(context);
        }

        protected void onMeasure(int i, int i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider) {
        this(context, nativeAdsManager, adViewProvider, null, null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i) {
        this(context, nativeAdsManager, adViewProvider, null, null, i);
    }

    private NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, Type type, NativeAdViewAttributes nativeAdViewAttributes, int i) {
        super(context);
        if (!nativeAdsManager.isLoaded()) {
            throw new IllegalStateException("NativeAdsManager not loaded");
        } else if (type == null && adViewProvider == null) {
            throw new IllegalArgumentException("Must provide a NativeAdView.Type or AdViewProvider");
        } else {
            this.f3567a = context;
            this.f3568b = nativeAdsManager;
            this.f3573g = nativeAdViewAttributes;
            this.f3569c = adViewProvider;
            this.f3570d = type;
            this.f3571e = i;
            C0600i c3238a = new C3238a(this);
            this.f3572f = new C3239b(this, context);
            this.f3572f.setAdapter(c3238a);
            setInset(20);
            c3238a.m12409a();
            addView(this.f3572f);
        }
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, Type type) {
        this(context, nativeAdsManager, null, type, new NativeAdViewAttributes(), 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, type, nativeAdViewAttributes, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, Type type, NativeAdViewAttributes nativeAdViewAttributes, int i) {
        this(context, nativeAdsManager, null, type, nativeAdViewAttributes, i);
    }

    public void setInset(int i) {
        if (i > 0) {
            float f = an.f4090b;
            int round = Math.round(((float) i) * f);
            this.f3572f.setPadding(round, 0, round, 0);
            this.f3572f.setPageMargin(Math.round(((float) (i / 2)) * f));
            this.f3572f.setClipToPadding(false);
        }
    }
}
