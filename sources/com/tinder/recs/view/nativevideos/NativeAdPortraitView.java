package com.tinder.recs.view.nativevideos;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.formats.C2353b;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.tinder.R;
import com.tinder.ads.RecsNativeAd;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/recs/view/nativevideos/NativeAdPortraitView;", "Lcom/tinder/recs/view/nativevideos/NativeAdView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bottomGradient", "Landroid/view/View;", "clickthroughTextView", "Landroid/widget/TextView;", "contentView", "Landroid/view/ViewGroup;", "gradientParams", "Landroid/widget/FrameLayout$LayoutParams;", "logoView", "Landroid/widget/ImageView;", "getLayoutResourceId", "", "onContentInflated", "", "inflated", "ad", "Lcom/tinder/ads/RecsNativeAd;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class NativeAdPortraitView extends NativeAdView {
    private HashMap _$_findViewCache;
    private View bottomGradient;
    private TextView clickthroughTextView;
    private ViewGroup contentView;
    private final LayoutParams gradientParams = new LayoutParams(-1, 0, 80);
    private ImageView logoView;

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
        return R.layout.view_ad_native_portrait;
    }

    public NativeAdPortraitView(@Nullable Context context) {
        super(context);
    }

    public void onContentInflated(@NotNull View view, @NotNull RecsNativeAd recsNativeAd) {
        C2668g.b(view, "inflated");
        C2668g.b(recsNativeAd, "ad");
        View findViewById = view.findViewById(R.id.ads_video_container);
        C2668g.a(findViewById, "inflated.findViewById(R.id.ads_video_container)");
        this.contentView = (ViewGroup) findViewById;
        findViewById = view.findViewById(R.id.ads_card_logo_image);
        C2668g.a(findViewById, "inflated.findViewById(R.id.ads_card_logo_image)");
        this.logoView = (ImageView) findViewById;
        findViewById = view.findViewById(R.id.ads_card_click_through_text);
        C2668g.a(findViewById, "inflated.findViewById(R.…_card_click_through_text)");
        this.clickthroughTextView = (TextView) findViewById;
        view = view.findViewById(R.id.portrait_ad_bottom_gradient);
        C2668g.a(view, "inflated.findViewById(R.…trait_ad_bottom_gradient)");
        this.bottomGradient = view;
        view = this.contentView;
        if (view == null) {
            C2668g.b("contentView");
        }
        C2353b videoMediaView = recsNativeAd.getNativeCustomTemplateAd().getVideoMediaView();
        C2668g.a(videoMediaView, "ad.nativeCustomTemplateAd.videoMediaView");
        addMediaViewToContentView(view, videoMediaView);
        view = this.logoView;
        if (view == null) {
            C2668g.b("logoView");
        }
        C2355b logo = recsNativeAd.logo();
        view.setImageDrawable(logo != null ? logo.a() : null);
        view = this.clickthroughTextView;
        if (view == null) {
            C2668g.b("clickthroughTextView");
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
