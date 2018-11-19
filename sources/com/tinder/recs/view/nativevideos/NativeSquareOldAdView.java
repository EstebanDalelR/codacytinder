package com.tinder.recs.view.nativevideos;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.formats.C2353b;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.tinder.R;
import com.tinder.ads.RecsNativeAd;
import com.tinder.ads.RecsNativeVideoAd;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/recs/view/nativevideos/NativeSquareOldAdView;", "Lcom/tinder/recs/view/nativevideos/NativeAdView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clickableView", "Landroid/view/View;", "contentView", "Landroid/view/ViewGroup;", "logoView", "Landroid/widget/ImageView;", "subTitleView", "Landroid/widget/TextView;", "titleView", "getLayoutResourceId", "", "onContentInflated", "", "inflated", "ad", "Lcom/tinder/ads/RecsNativeAd;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class NativeSquareOldAdView extends NativeAdView {
    private HashMap _$_findViewCache;
    private View clickableView;
    private ViewGroup contentView;
    private ImageView logoView;
    private TextView subTitleView;
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
        return R.layout.view_ad_native_square_old_v1;
    }

    public NativeSquareOldAdView(@Nullable Context context) {
        super(context);
    }

    public void onContentInflated(@NotNull View view, @NotNull RecsNativeAd recsNativeAd) {
        C2668g.b(view, "inflated");
        C2668g.b(recsNativeAd, "ad");
        View findViewById = view.findViewById(R.id.ads_video_container);
        C2668g.a(findViewById, "inflated.findViewById<Vi…R.id.ads_video_container)");
        this.contentView = (ViewGroup) findViewById;
        findViewById = view.findViewById(R.id.ads_card_logo_image);
        C2668g.a(findViewById, "inflated.findViewById<Im…R.id.ads_card_logo_image)");
        this.logoView = (ImageView) findViewById;
        findViewById = view.findViewById(R.id.ads_card_title);
        C2668g.a(findViewById, "inflated.findViewById<Te…iew>(R.id.ads_card_title)");
        this.titleView = (TextView) findViewById;
        findViewById = view.findViewById(R.id.ads_card_sub_title);
        C2668g.a(findViewById, "inflated.findViewById<Te…(R.id.ads_card_sub_title)");
        this.subTitleView = (TextView) findViewById;
        view = view.findViewById(R.id.clickable_surface);
        C2668g.a(view, "inflated.findViewById(R.id.clickable_surface)");
        this.clickableView = view;
        view = this.contentView;
        if (view == null) {
            C2668g.b("contentView");
        }
        C2353b videoMediaView = recsNativeAd.getNativeCustomTemplateAd().getVideoMediaView();
        C2668g.a(videoMediaView, "ad.nativeCustomTemplateAd.videoMediaView");
        addMediaViewToContentView(view, videoMediaView);
        view = this.titleView;
        if (view == null) {
            C2668g.b("titleView");
        }
        view.setText(recsNativeAd.title());
        view = this.logoView;
        if (view == null) {
            C2668g.b("logoView");
        }
        C2355b logo = recsNativeAd.logo();
        String str = null;
        view.setImageDrawable(logo != null ? logo.a() : null);
        view = this.subTitleView;
        if (view == null) {
            C2668g.b("subTitleView");
        }
        if (!(recsNativeAd instanceof RecsNativeVideoAd)) {
            recsNativeAd = null;
        }
        RecsNativeVideoAd recsNativeVideoAd = (RecsNativeVideoAd) recsNativeAd;
        if (recsNativeVideoAd != null) {
            str = recsNativeVideoAd.subtitle();
        }
        view.setText(str);
        view = this.clickableView;
        if (view == null) {
            C2668g.b("clickableView");
        }
        view.setOnClickListener((OnClickListener) new NativeSquareOldAdView$onContentInflated$1(this));
    }
}
