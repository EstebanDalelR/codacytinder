package com.tinder.recs.view.nativevideos;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.ads.C2412j;
import com.google.android.gms.ads.formats.C2353b;
import com.tinder.R;
import com.tinder.ads.Ad.AdType;
import com.tinder.ads.RecsNativeAd;
import com.tinder.ads.RecsNativeVideoAd;
import com.tinder.ads.RecsNativeVideoAd.Style;
import com.tinder.ads.TinderAdType;
import com.tinder.recs.component.RecsViewComponentProvider;
import com.tinder.recs.controller.RecsNativeDfpAdController;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001)\b&\u0018\u0000 C2\u00020\u0001:\u0002CDB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0004J\u000e\u00101\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u0006J\b\u00102\u001a\u000203H&J\b\u00104\u001a\u00020,H\u0007J\u0018\u00105\u001a\u00020,2\u0006\u00106\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0006\u00108\u001a\u00020,J\u0006\u00109\u001a\u00020,J\b\u0010:\u001a\u00020,H\u0007J\u0006\u0010;\u001a\u00020,J\b\u0010<\u001a\u00020,H\u0007J\u0006\u0010=\u001a\u00020,J\u0006\u0010>\u001a\u00020,J\b\u0010?\u001a\u00020,H\u0002J\b\u0010@\u001a\u00020,H\u0002J\u0010\u0010A\u001a\u00020,2\b\u0010B\u001a\u0004\u0018\u00010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u001e\u0010 \u001a\u00020!8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u00020)X\u0004¢\u0006\u0004\n\u0002\u0010*¨\u0006E"}, d2 = {"Lcom/tinder/recs/view/nativevideos/NativeAdView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ad", "Lcom/tinder/ads/RecsNativeAd;", "contentStub", "Landroid/view/ViewStub;", "getContentStub$Tinder_release", "()Landroid/view/ViewStub;", "setContentStub$Tinder_release", "(Landroid/view/ViewStub;)V", "controller", "Lcom/tinder/recs/controller/RecsNativeDfpAdController;", "getController$Tinder_release", "()Lcom/tinder/recs/controller/RecsNativeDfpAdController;", "setController$Tinder_release", "(Lcom/tinder/recs/controller/RecsNativeDfpAdController;)V", "isPlaying", "", "muteButton", "Landroid/widget/ImageView;", "getMuteButton$Tinder_release", "()Landroid/widget/ImageView;", "setMuteButton$Tinder_release", "(Landroid/widget/ImageView;)V", "onAdUrlClickListener", "Lcom/tinder/recs/view/nativevideos/NativeAdView$OnDfpNativeAdClickListener;", "playPauseButton", "getPlayPauseButton$Tinder_release", "setPlayPauseButton$Tinder_release", "progress", "Landroid/widget/ProgressBar;", "getProgress$Tinder_release", "()Landroid/widget/ProgressBar;", "setProgress$Tinder_release", "(Landroid/widget/ProgressBar;)V", "videoController", "Lcom/google/android/gms/ads/VideoController;", "videoLifecycleCallbacks", "com/tinder/recs/view/nativevideos/NativeAdView$videoLifecycleCallbacks$1", "Lcom/tinder/recs/view/nativevideos/NativeAdView$videoLifecycleCallbacks$1;", "addMediaViewToContentView", "", "container", "Landroid/view/ViewGroup;", "mediaView", "Lcom/google/android/gms/ads/formats/MediaView;", "bindAd", "getLayoutResourceId", "", "onClickThroughViewClick", "onContentInflated", "inflated", "Landroid/view/View;", "onDestroy", "onMovedTopTop", "onMuteUnmuteButtonClick", "onPause", "onPlayPauseButtonClick", "onRemovedFromTop", "onResume", "pause", "play", "setOnAdUrlClickListener", "onAdRecUrlClickedListener", "Companion", "OnDfpNativeAdClickListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class NativeAdView extends FrameLayout {
    public static final Companion Companion = new Companion();
    private HashMap _$_findViewCache;
    private RecsNativeAd ad;
    @NotNull
    @BindView(2131361862)
    public ViewStub contentStub;
    @Inject
    @NotNull
    public RecsNativeDfpAdController controller;
    private boolean isPlaying = true;
    @NotNull
    @BindView(2131361860)
    public ImageView muteButton;
    private OnDfpNativeAdClickListener onAdUrlClickListener;
    @NotNull
    @BindView(2131361861)
    public ImageView playPauseButton;
    @NotNull
    @BindView(2131363346)
    public ProgressBar progress;
    private C2412j videoController;
    private final NativeAdView$videoLifecycleCallbacks$1 videoLifecycleCallbacks;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/recs/view/nativevideos/NativeAdView$Companion;", "", "()V", "create", "Lcom/tinder/recs/view/nativevideos/NativeAdView;", "context", "Landroid/content/Context;", "ad", "Lcom/tinder/ads/RecsNativeAd;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {

        @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Style.values().length];

            static {
                $EnumSwitchMapping$0[Style.SQUARE.ordinal()] = 1;
                $EnumSwitchMapping$0[Style.PORTRAIT.ordinal()] = 2;
                $EnumSwitchMapping$0[Style.OLD.ordinal()] = 3;
            }
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final NativeAdView create(@NotNull Context context, @NotNull RecsNativeAd recsNativeAd) {
            C2668g.b(context, "context");
            C2668g.b(recsNativeAd, "ad");
            AdType adType = recsNativeAd.adType();
            if (adType == TinderAdType.REC_NATIVE_VIDEO_DFP) {
                Style style = null;
                if (!(recsNativeAd instanceof RecsNativeVideoAd)) {
                    recsNativeAd = null;
                }
                RecsNativeVideoAd recsNativeVideoAd = (RecsNativeVideoAd) recsNativeAd;
                if (recsNativeVideoAd != null) {
                    style = recsNativeVideoAd.style();
                }
                if (style != null) {
                    switch (WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
                        case 1:
                            return (NativeAdView) new NativeSquareAdView(context);
                        case 2:
                            return (NativeAdView) new NativeAdPortraitView(context);
                        case 3:
                            return (NativeAdView) new NativeSquareOldAdView(context);
                        default:
                            break;
                    }
                }
                throw ((Throwable) new IllegalArgumentException("Un-configured Ad Style, should this be caught by an AdValidation.Rule?"));
            } else if (adType == TinderAdType.REC_NATIVE_DISPLAY_DFP) {
                return (NativeAdView) new NativeAdDisplayView(context);
            } else {
                throw ((Throwable) new IllegalArgumentException("Ad Type not supported by NativeAdView"));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/recs/view/nativevideos/NativeAdView$OnDfpNativeAdClickListener;", "", "onNativeAdClicked", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface OnDfpNativeAdClickListener {
        void onNativeAdClicked();
    }

    @JvmStatic
    @NotNull
    public static final NativeAdView create(@NotNull Context context, @NotNull RecsNativeAd recsNativeAd) {
        return Companion.create(context, recsNativeAd);
    }

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

    public abstract int getLayoutResourceId();

    public abstract void onContentInflated(@NotNull View view, @NotNull RecsNativeAd recsNativeAd);

    public NativeAdView(@Nullable Context context) {
        super(context);
        FrameLayout.inflate(context, R.layout.view_native_video, this);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.component.RecsViewComponentProvider");
        }
        ((RecsViewComponentProvider) context).getRecsViewComponent().inject(this);
        ButterKnife.a(this);
        this.videoLifecycleCallbacks = new NativeAdView$videoLifecycleCallbacks$1(this);
    }

    @NotNull
    public static final /* synthetic */ RecsNativeAd access$getAd$p(NativeAdView nativeAdView) {
        nativeAdView = nativeAdView.ad;
        if (nativeAdView == null) {
            C2668g.b("ad");
        }
        return nativeAdView;
    }

    @NotNull
    public final RecsNativeDfpAdController getController$Tinder_release() {
        RecsNativeDfpAdController recsNativeDfpAdController = this.controller;
        if (recsNativeDfpAdController == null) {
            C2668g.b("controller");
        }
        return recsNativeDfpAdController;
    }

    public final void setController$Tinder_release(@NotNull RecsNativeDfpAdController recsNativeDfpAdController) {
        C2668g.b(recsNativeDfpAdController, "<set-?>");
        this.controller = recsNativeDfpAdController;
    }

    @NotNull
    public final ImageView getPlayPauseButton$Tinder_release() {
        ImageView imageView = this.playPauseButton;
        if (imageView == null) {
            C2668g.b("playPauseButton");
        }
        return imageView;
    }

    public final void setPlayPauseButton$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.playPauseButton = imageView;
    }

    @NotNull
    public final ImageView getMuteButton$Tinder_release() {
        ImageView imageView = this.muteButton;
        if (imageView == null) {
            C2668g.b("muteButton");
        }
        return imageView;
    }

    public final void setMuteButton$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.muteButton = imageView;
    }

    @NotNull
    public final ProgressBar getProgress$Tinder_release() {
        ProgressBar progressBar = this.progress;
        if (progressBar == null) {
            C2668g.b("progress");
        }
        return progressBar;
    }

    public final void setProgress$Tinder_release(@NotNull ProgressBar progressBar) {
        C2668g.b(progressBar, "<set-?>");
        this.progress = progressBar;
    }

    @NotNull
    public final ViewStub getContentStub$Tinder_release() {
        ViewStub viewStub = this.contentStub;
        if (viewStub == null) {
            C2668g.b("contentStub");
        }
        return viewStub;
    }

    public final void setContentStub$Tinder_release(@NotNull ViewStub viewStub) {
        C2668g.b(viewStub, "<set-?>");
        this.contentStub = viewStub;
    }

    public final void bindAd(@NotNull RecsNativeAd recsNativeAd) {
        C2668g.b(recsNativeAd, "ad");
        this.ad = recsNativeAd;
        this.videoController = recsNativeAd.getNativeCustomTemplateAd().getVideoController();
        C2412j c2412j = this.videoController;
        int i = 0;
        boolean e = c2412j != null ? c2412j.e() : false;
        ImageView imageView = this.playPauseButton;
        if (imageView == null) {
            C2668g.b("playPauseButton");
        }
        imageView.setVisibility(e ? 0 : 8);
        imageView = this.muteButton;
        if (imageView == null) {
            C2668g.b("muteButton");
        }
        if (!e) {
            i = 8;
        }
        imageView.setVisibility(i);
        ViewStub viewStub = this.contentStub;
        if (viewStub == null) {
            C2668g.b("contentStub");
        }
        viewStub.setLayoutResource(getLayoutResourceId());
        viewStub = this.contentStub;
        if (viewStub == null) {
            C2668g.b("contentStub");
        }
        viewStub.setOnInflateListener(new NativeAdView$bindAd$1(this, recsNativeAd));
        recsNativeAd = this.contentStub;
        if (recsNativeAd == null) {
            C2668g.b("contentStub");
        }
        recsNativeAd.inflate();
        if (e) {
            recsNativeAd = this.videoController;
            if (recsNativeAd != null) {
                recsNativeAd.a(this.videoLifecycleCallbacks);
            }
            recsNativeAd = this.videoController;
            if (recsNativeAd != null) {
                recsNativeAd.c();
            }
        }
        recsNativeAd = this.progress;
        if (recsNativeAd == null) {
            C2668g.b("progress");
        }
        recsNativeAd.setVisibility(8);
    }

    public final void onMovedTopTop() {
        play();
        RecsNativeDfpAdController recsNativeDfpAdController = this.controller;
        if (recsNativeDfpAdController == null) {
            C2668g.b("controller");
        }
        RecsNativeAd recsNativeAd = this.ad;
        if (recsNativeAd == null) {
            C2668g.b("ad");
        }
        recsNativeDfpAdController.onCardMovedToTop(recsNativeAd);
    }

    public final void onRemovedFromTop() {
        pause();
    }

    public final void onResume() {
        play();
    }

    public final void onPause() {
        pause();
    }

    public final void onDestroy() {
        RecsNativeAd recsNativeAd = this.ad;
        if (recsNativeAd == null) {
            C2668g.b("ad");
        }
        recsNativeAd.getNativeCustomTemplateAd().destroy();
    }

    @OnClick({2131361855})
    public final void onClickThroughViewClick() {
        RecsNativeAd recsNativeAd = this.ad;
        if (recsNativeAd == null) {
            C2668g.b("ad");
        }
        if (recsNativeAd.clickthroughUrl() != null) {
            RecsNativeDfpAdController recsNativeDfpAdController = this.controller;
            if (recsNativeDfpAdController == null) {
                C2668g.b("controller");
            }
            RecsNativeAd recsNativeAd2 = this.ad;
            if (recsNativeAd2 == null) {
                C2668g.b("ad");
            }
            recsNativeDfpAdController.onClickthroughClicked(recsNativeAd2, 5);
            OnDfpNativeAdClickListener onDfpNativeAdClickListener = this.onAdUrlClickListener;
            if (onDfpNativeAdClickListener != null) {
                onDfpNativeAdClickListener.onNativeAdClicked();
            }
        }
    }

    @OnClick({2131361861})
    public final void onPlayPauseButtonClick() {
        if (this.isPlaying) {
            pause();
        } else {
            play();
        }
    }

    @OnClick({2131361860})
    public final void onMuteUnmuteButtonClick() {
        C2412j c2412j = this.videoController;
        if (c2412j != null) {
            c2412j.a(c2412j.d() ^ 1);
        }
    }

    public final void setOnAdUrlClickListener(@Nullable OnDfpNativeAdClickListener onDfpNativeAdClickListener) {
        this.onAdUrlClickListener = onDfpNativeAdClickListener;
    }

    protected final void addMediaViewToContentView(@NotNull ViewGroup viewGroup, @NotNull C2353b c2353b) {
        C2668g.b(viewGroup, "container");
        C2668g.b(c2353b, "mediaView");
        if (c2353b.getParent() != null) {
            ViewParent parent = c2353b.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
        }
        viewGroup.addView(c2353b, 0, new LayoutParams(-1, -1));
    }

    private final void play() {
        this.isPlaying = true;
        C2412j c2412j = this.videoController;
        if (c2412j != null) {
            c2412j.b();
        }
    }

    private final void pause() {
        this.isPlaying = false;
        C2412j c2412j = this.videoController;
        if (c2412j != null) {
            c2412j.c();
        }
    }
}
