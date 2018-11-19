package com.tinder.recs.view.nativevideos;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/recs/view/nativevideos/NativeSquareAdView;", "Lcom/tinder/recs/view/nativevideos/NativeAdView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "backgroundView", "Landroid/widget/ImageView;", "contentView", "Landroid/view/ViewGroup;", "logoView", "titleView", "Landroid/widget/TextView;", "getLayoutResourceId", "", "onContentInflated", "", "inflated", "Landroid/view/View;", "ad", "Lcom/tinder/ads/RecsNativeAd;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class NativeSquareAdView extends NativeAdView {
    private HashMap _$_findViewCache;
    private ImageView backgroundView;
    private ViewGroup contentView;
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
        return R.layout.view_ad_native_square_v1;
    }

    public NativeSquareAdView(@Nullable Context context) {
        super(context);
    }

    public void onContentInflated(@NotNull View view, @NotNull RecsNativeAd recsNativeAd) {
        C2355b backgroundImage;
        Drawable a;
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
        view = view.findViewById(R.id.ads_card_background_image);
        C2668g.a(view, "inflated.findViewById<Im…ds_card_background_image)");
        this.backgroundView = (ImageView) view;
        view = this.contentView;
        if (view == null) {
            C2668g.b("contentView");
        }
        C2353b videoMediaView = recsNativeAd.getNativeCustomTemplateAd().getVideoMediaView();
        C2668g.a(videoMediaView, "ad.nativeCustomTemplateAd.videoMediaView");
        addMediaViewToContentView(view, videoMediaView);
        view = this.backgroundView;
        if (view == null) {
            C2668g.b("backgroundView");
        }
        Drawable drawable = null;
        RecsNativeVideoAd recsNativeVideoAd = (RecsNativeVideoAd) (!(recsNativeAd instanceof RecsNativeVideoAd) ? null : recsNativeAd);
        if (recsNativeVideoAd != null) {
            backgroundImage = recsNativeVideoAd.backgroundImage();
            if (backgroundImage != null) {
                a = backgroundImage.a();
                view.setImageDrawable(a);
                view = this.logoView;
                if (view == null) {
                    C2668g.b("logoView");
                }
                backgroundImage = recsNativeAd.displayImage();
                if (backgroundImage != null) {
                    drawable = backgroundImage.a();
                }
                view.setImageDrawable(drawable);
                view = this.titleView;
                if (view == null) {
                    C2668g.b("titleView");
                }
                view.setText(recsNativeAd.title());
            }
        }
        a = null;
        view.setImageDrawable(a);
        view = this.logoView;
        if (view == null) {
            C2668g.b("logoView");
        }
        backgroundImage = recsNativeAd.displayImage();
        if (backgroundImage != null) {
            drawable = backgroundImage.a();
        }
        view.setImageDrawable(drawable);
        view = this.titleView;
        if (view == null) {
            C2668g.b("titleView");
        }
        view.setText(recsNativeAd.title());
    }
}
