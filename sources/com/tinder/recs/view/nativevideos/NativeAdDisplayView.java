package com.tinder.recs.view.nativevideos;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.tinder.R;
import com.tinder.ads.RecsNativeAd;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/recs/view/nativevideos/NativeAdDisplayView;", "Lcom/tinder/recs/view/nativevideos/NativeAdView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adDisplayImageView", "Landroid/widget/ImageView;", "bottomGradient", "Landroid/view/View;", "gradientParams", "Landroid/widget/FrameLayout$LayoutParams;", "logoView", "titleView", "Landroid/widget/TextView;", "getLayoutResourceId", "", "onContentInflated", "", "inflated", "ad", "Lcom/tinder/ads/RecsNativeAd;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class NativeAdDisplayView extends NativeAdView {
    private HashMap _$_findViewCache;
    private ImageView adDisplayImageView;
    private View bottomGradient;
    private final LayoutParams gradientParams = new LayoutParams(-1, 0, 80);
    private ImageView logoView;
    private TextView titleView;

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), view);
        return view;
    }

    public int getLayoutResourceId() {
        return R.layout.view_ad_native_display;
    }

    public NativeAdDisplayView(@Nullable Context context) {
        super(context);
    }

    public void onContentInflated(@NotNull View view, @NotNull RecsNativeAd recsNativeAd) {
        C2668g.b(view, "inflated");
        C2668g.b(recsNativeAd, "ad");
        View findViewById = view.findViewById(R.id.ads_card_display_image);
        C2668g.a(findViewById, "inflated.findViewById(R.id.ads_card_display_image)");
        this.adDisplayImageView = (ImageView) findViewById;
        findViewById = view.findViewById(R.id.ads_card_logo_image);
        C2668g.a(findViewById, "inflated.findViewById(R.id.ads_card_logo_image)");
        this.logoView = (ImageView) findViewById;
        findViewById = view.findViewById(R.id.ads_card_title);
        C2668g.a(findViewById, "inflated.findViewById(R.id.ads_card_title)");
        this.titleView = (TextView) findViewById;
        view = view.findViewById(R.id.display_ad_bottom_gradient);
        C2668g.a(view, "inflated.findViewById(R.…splay_ad_bottom_gradient)");
        this.bottomGradient = view;
        view = this.adDisplayImageView;
        if (view == null) {
            C2668g.b("adDisplayImageView");
        }
        C2355b displayImage = recsNativeAd.displayImage();
        Drawable drawable = null;
        view.setImageDrawable(displayImage != null ? displayImage.a() : null);
        view = this.logoView;
        if (view == null) {
            C2668g.b("logoView");
        }
        displayImage = recsNativeAd.logo();
        if (displayImage != null) {
            drawable = displayImage.a();
        }
        view.setImageDrawable(drawable);
        view = this.titleView;
        if (view == null) {
            C2668g.b("titleView");
        }
        view.setText(recsNativeAd.clickThroughText());
    }

    protected void onMeasure(int i, int i2) {
        this.gradientParams.height = MeasureSpec.getSize(i2) / 3;
        View view = this.bottomGradient;
        if (view == null) {
            C2668g.b("bottomGradient");
        }
        view.setLayoutParams(this.gradientParams);
        super.onMeasure(i, i2);
    }
}
