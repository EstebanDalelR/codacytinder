package com.tinder.recsads.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.C3018c;
import com.bumptech.glide.RequestManager;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd.Image;
import com.facebook.ads.VideoStartReason;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.CardCollectionLayout;
import com.tinder.cardstack.view.CardView;
import com.tinder.recs.view.RecCardView;
import com.tinder.recsads.C14760n.C14757c;
import com.tinder.recsads.C14760n.C14758d;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.model.C16467e;
import com.tinder.recsads.p466a.C16428a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001FB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010*\u001a\u00020+2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0002H\u0016J\u0010\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\nH\u0002J\u0010\u00100\u001a\u00020+2\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020+H\u0014J\b\u00104\u001a\u00020+H\u0014J\b\u00105\u001a\u00020+H\u0014J\u0012\u00106\u001a\u00020+2\b\u00107\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u00108\u001a\u00020+H\u0002J\b\u00109\u001a\u00020+H\u0002J\u001a\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0002J\u0018\u0010?\u001a\u00020+2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010@\u001a\u00020+H\u0002J\b\u0010A\u001a\u00020+H\u0002J\b\u0010B\u001a\u00020+H\u0002J\b\u0010C\u001a\u00020+H\u0002J\b\u0010D\u001a\u00020+H\u0002J\u0010\u0010E\u001a\u00020+2\u0006\u0010/\u001a\u00020\nH\u0002R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!XD¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00020'X\u0004¢\u0006\u0004\n\u0002\u0010(R\u000e\u0010)\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/tinder/recsads/view/FanVideoRecCardView;", "Lcom/tinder/recs/view/RecCardView;", "Lcom/tinder/recsads/card/AdRecCard;", "Lcom/tinder/cardstack/view/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ad", "Lcom/tinder/recsads/model/RecsFanVideoAd;", "adBody", "Landroid/widget/TextView;", "adChoicesContainer", "Landroid/view/ViewGroup;", "adChoicesUrl", "", "adSocialContext", "adSponsorLogo", "Landroid/widget/ImageView;", "adSponsorName", "callToAction", "Lcom/tinder/recsads/view/RedGradientFillButtonView;", "fanVideoContainer", "mediaView", "Lcom/facebook/ads/MediaView;", "mediaViewPlayPauseButton", "mediaViewVideoRenderer", "Lcom/tinder/recsads/view/FanVideoRecCardView$RecsMediaViewVideoRenderer;", "muteButton", "replayButton", "sponsoredLabel", "supportsStamps", "", "getSupportsStamps", "()Z", "videoCompletedOverlay", "Landroid/widget/FrameLayout;", "videoRendererCallback", "com/tinder/recsads/view/FanVideoRecCardView$videoRendererCallback$1", "Lcom/tinder/recsads/view/FanVideoRecCardView$videoRendererCallback$1;", "viewMoreButton", "addAdChoicesView", "", "bind", "recCard", "bindViewsToAd", "fanAd", "onAttachedToCardCollectionLayout", "cardCollectionLayout", "Lcom/tinder/cardstack/view/CardCollectionLayout;", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "onMovedToTop", "p0", "openAdChoices", "replayVideo", "resizeNativeAdViewHeight", "nativeAdView", "Landroid/view/View;", "adCoverImage", "Lcom/facebook/ads/NativeAd$Image;", "setNativeAdViewLayoutParameters", "showMuteIcon", "showPauseButton", "showPlayButton", "showUnmutedIcon", "showVideoCompletedOverlay", "startVideo", "RecsMediaViewVideoRenderer", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class FanVideoRecCardView extends RecCardView<C16428a> implements CardView<C16428a> {
    /* renamed from: a */
    private final boolean f56014a;
    /* renamed from: b */
    private RecsMediaViewVideoRenderer f56015b;
    /* renamed from: c */
    private MediaView f56016c;
    /* renamed from: d */
    private ViewGroup f56017d;
    /* renamed from: e */
    private ImageView f56018e;
    /* renamed from: f */
    private FrameLayout f56019f;
    /* renamed from: g */
    private TextView f56020g;
    /* renamed from: h */
    private TextView f56021h;
    /* renamed from: i */
    private ImageView f56022i;
    /* renamed from: j */
    private RedGradientFillButtonView f56023j;
    /* renamed from: k */
    private TextView f56024k;
    /* renamed from: l */
    private ImageView f56025l;
    /* renamed from: m */
    private TextView f56026m;
    /* renamed from: n */
    private TextView f56027n;
    /* renamed from: o */
    private C16467e f56028o;
    /* renamed from: p */
    private ViewGroup f56029p;
    /* renamed from: q */
    private TextView f56030q;
    /* renamed from: r */
    private String f56031r;
    /* renamed from: s */
    private final C16478f f56032s = new C16478f(this);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.FanVideoRecCardView$a */
    static final class C14767a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FanVideoRecCardView f46330a;

        C14767a(FanVideoRecCardView fanVideoRecCardView) {
            this.f46330a = fanVideoRecCardView;
        }

        public final void onClick(View view) {
            FanVideoRecCardView.m65476a(this.f46330a).m61900c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.FanVideoRecCardView$b */
    static final class C14768b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FanVideoRecCardView f46331a;

        C14768b(FanVideoRecCardView fanVideoRecCardView) {
            this.f46331a = fanVideoRecCardView;
        }

        public final void onClick(View view) {
            FanVideoRecCardView.m65476a(this.f46331a).m61897a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.FanVideoRecCardView$c */
    static final class C14769c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FanVideoRecCardView f46332a;

        C14769c(FanVideoRecCardView fanVideoRecCardView) {
            this.f46332a = fanVideoRecCardView;
        }

        public final void onClick(View view) {
            this.f46332a.m65477a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/tinder/recsads/view/FanVideoRecCardView$resizeNativeAdViewHeight$1$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/tinder/recsads/view/FanVideoRecCardView$resizeNativeAdViewHeight$1;)V", "onGlobalLayout", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.FanVideoRecCardView$d */
    public static final class C14770d implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ FanVideoRecCardView f46333a;
        /* renamed from: b */
        final /* synthetic */ View f46334b;
        /* renamed from: c */
        final /* synthetic */ Image f46335c;

        C14770d(FanVideoRecCardView fanVideoRecCardView, View view, Image image) {
            this.f46333a = fanVideoRecCardView;
            this.f46334b = view;
            this.f46335c = image;
        }

        public void onGlobalLayout() {
            this.f46333a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f46333a.m65482b(this.f46334b, this.f46335c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.FanVideoRecCardView$e */
    static final class C14771e implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FanVideoRecCardView f46336a;

        C14771e(FanVideoRecCardView fanVideoRecCardView) {
            this.f46336a = fanVideoRecCardView;
        }

        public final void onClick(View view) {
            this.f46336a.m65494g();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/recsads/view/FanVideoRecCardView$RecsMediaViewVideoRenderer;", "Lcom/facebook/ads/MediaViewVideoRenderer;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callback", "Lcom/tinder/recsads/view/FanVideoRecCardView$RecsMediaViewVideoRenderer$Callback;", "getCallback", "()Lcom/tinder/recsads/view/FanVideoRecCardView$RecsMediaViewVideoRenderer$Callback;", "setCallback", "(Lcom/tinder/recsads/view/FanVideoRecCardView$RecsMediaViewVideoRenderer$Callback;)V", "isMuted", "", "isPlaying", "muteVideo", "", "onCompleted", "onPaused", "onPlayed", "onVolumeChanged", "toggleSound", "toggleVideo", "Callback", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    private static final class RecsMediaViewVideoRenderer extends MediaViewVideoRenderer {
        @Nullable
        /* renamed from: d */
        private Callback f51130d;
        /* renamed from: e */
        private boolean f51131e;
        /* renamed from: f */
        private boolean f51132f;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/tinder/recsads/view/FanVideoRecCardView$RecsMediaViewVideoRenderer$Callback;", "", "onCompleted", "", "onMuted", "onPaused", "onPlayed", "onUnMuted", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
        public interface Callback {
            void onCompleted();

            void onMuted();

            void onPaused();

            void onPlayed();

            void onUnMuted();
        }

        public RecsMediaViewVideoRenderer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
            C2668g.b(context, "context");
            super(context, attributeSet);
        }

        /* renamed from: a */
        public final void m61898a(@Nullable Callback callback) {
            this.f51130d = callback;
        }

        public void onPlayed() {
            super.onPlayed();
            this.f51131e = true;
            Callback callback = this.f51130d;
            if (callback != null) {
                callback.onPlayed();
            }
        }

        public void onPaused() {
            super.onPaused();
            this.f51131e = false;
            Callback callback = this.f51130d;
            if (callback != null) {
                callback.onPaused();
            }
        }

        public void onCompleted() {
            super.onCompleted();
            this.f51131e = false;
            Callback callback = this.f51130d;
            if (callback != null) {
                callback.onCompleted();
            }
        }

        public void onVolumeChanged() {
            super.onVolumeChanged();
            this.f51132f = getVolume() <= 0.01f;
            Callback callback;
            if (this.f51132f) {
                callback = this.f51130d;
                if (callback != null) {
                    callback.onMuted();
                    return;
                }
                return;
            }
            callback = this.f51130d;
            if (callback != null) {
                callback.onUnMuted();
            }
        }

        /* renamed from: a */
        public final void m61897a() {
            if (this.f51131e) {
                pause(true);
            } else {
                play(VideoStartReason.USER_STARTED);
            }
        }

        /* renamed from: b */
        public final void m61899b() {
            setVolume(0.0f);
        }

        /* renamed from: c */
        public final void m61900c() {
            setVolume(this.f51132f ? 1.0f : 0.0f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/tinder/recsads/view/FanVideoRecCardView$videoRendererCallback$1", "Lcom/tinder/recsads/view/FanVideoRecCardView$RecsMediaViewVideoRenderer$Callback;", "(Lcom/tinder/recsads/view/FanVideoRecCardView;)V", "onCompleted", "", "onMuted", "onPaused", "onPlayed", "onUnMuted", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.FanVideoRecCardView$f */
    public static final class C16478f implements Callback {
        /* renamed from: a */
        final /* synthetic */ FanVideoRecCardView f51133a;

        C16478f(FanVideoRecCardView fanVideoRecCardView) {
            this.f51133a = fanVideoRecCardView;
        }

        public void onPlayed() {
            this.f51133a.m65485c();
        }

        public void onPaused() {
            this.f51133a.m65481b();
        }

        public void onCompleted() {
            this.f51133a.m65492f();
        }

        public void onMuted() {
            this.f51133a.m65488d();
        }

        public void onUnMuted() {
            this.f51133a.m65490e();
        }
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ RecsMediaViewVideoRenderer m65476a(FanVideoRecCardView fanVideoRecCardView) {
        fanVideoRecCardView = fanVideoRecCardView.f56015b;
        if (fanVideoRecCardView == null) {
            C2668g.b("mediaViewVideoRenderer");
        }
        return fanVideoRecCardView;
    }

    public /* synthetic */ void bind(C8395a c8395a) {
        m65497a((C16428a) c8395a);
    }

    public /* synthetic */ void bind(Object obj) {
        m65497a((C16428a) obj);
    }

    public /* synthetic */ void onMovedToTop(Object obj) {
        m65498b((C16428a) obj);
    }

    public FanVideoRecCardView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public boolean getSupportsStamps() {
        return this.f56014a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        Resources system = Resources.getSystem();
        C2668g.a(system, "Resources.getSystem()");
        float f = system.getDisplayMetrics().density;
        View findViewById = findViewById(C14758d.fan_video_container);
        C2668g.a(findViewById, "findViewById(R.id.fan_video_container)");
        this.f56017d = (ViewGroup) findViewById;
        findViewById = findViewById(C14758d.fan_video_media_view);
        C2668g.a(findViewById, "findViewById(R.id.fan_video_media_view)");
        this.f56016c = (MediaView) findViewById;
        LayoutParams layoutParams = new LayoutParams(-1, (int) (((float) 180) * f));
        MediaView mediaView = this.f56016c;
        if (mediaView == null) {
            C2668g.b("mediaView");
        }
        mediaView.setLayoutParams(layoutParams);
        Context context = getContext();
        C2668g.a(context, "context");
        this.f56015b = new RecsMediaViewVideoRenderer(context, null);
        mediaView = this.f56016c;
        if (mediaView == null) {
            C2668g.b("mediaView");
        }
        RecsMediaViewVideoRenderer recsMediaViewVideoRenderer = this.f56015b;
        if (recsMediaViewVideoRenderer == null) {
            C2668g.b("mediaViewVideoRenderer");
        }
        mediaView.setVideoRenderer(recsMediaViewVideoRenderer);
        View findViewById2 = findViewById(C14758d.fan_video_play_pause_button);
        C2668g.a(findViewById2, "findViewById(R.id.fan_video_play_pause_button)");
        this.f56018e = (ImageView) findViewById2;
        findViewById2 = findViewById(C14758d.fan_ad_action);
        C2668g.a(findViewById2, "findViewById(R.id.fan_ad_action)");
        this.f56023j = (RedGradientFillButtonView) findViewById2;
        findViewById2 = findViewById(C14758d.fan_video_completed_overlay);
        C2668g.a(findViewById2, "findViewById(R.id.fan_video_completed_overlay)");
        this.f56019f = (FrameLayout) findViewById2;
        findViewById2 = findViewById(C14758d.video_completed_replay_button);
        C2668g.a(findViewById2, "findViewById(R.id.video_completed_replay_button)");
        this.f56020g = (TextView) findViewById2;
        findViewById2 = findViewById(C14758d.video_completed_view_more_button);
        C2668g.a(findViewById2, "findViewById(R.id.video_…mpleted_view_more_button)");
        this.f56021h = (TextView) findViewById2;
        findViewById2 = findViewById(C14758d.fan_video_mute_button);
        C2668g.a(findViewById2, "findViewById(R.id.fan_video_mute_button)");
        this.f56022i = (ImageView) findViewById2;
        findViewById2 = findViewById(C14758d.fan_ad_title);
        C2668g.a(findViewById2, "findViewById(R.id.fan_ad_title)");
        this.f56024k = (TextView) findViewById2;
        findViewById2 = findViewById(C14758d.fan_ad_sponsor_logo);
        C2668g.a(findViewById2, "findViewById(R.id.fan_ad_sponsor_logo)");
        this.f56025l = (ImageView) findViewById2;
        findViewById2 = findViewById(C14758d.fan_ad_sponsor_name);
        C2668g.a(findViewById2, "findViewById(R.id.fan_ad_sponsor_name)");
        this.f56026m = (TextView) findViewById2;
        findViewById2 = findViewById(C14758d.fan_ad_description);
        C2668g.a(findViewById2, "findViewById(R.id.fan_ad_description)");
        this.f56027n = (TextView) findViewById2;
        findViewById2 = findViewById(C14758d.ad_choices_container);
        C2668g.a(findViewById2, "findViewById(R.id.ad_choices_container)");
        this.f56029p = (ViewGroup) findViewById2;
        findViewById2 = findViewById(C14758d.fan_ad_sponsor_label);
        C2668g.a(findViewById2, "findViewById(R.id.fan_ad_sponsor_label)");
        this.f56030q = (TextView) findViewById2;
        ImageView imageView = this.f56022i;
        if (imageView == null) {
            C2668g.b("muteButton");
        }
        imageView.setOnClickListener(new C14767a(this));
        imageView = this.f56018e;
        if (imageView == null) {
            C2668g.b("mediaViewPlayPauseButton");
        }
        imageView.setOnClickListener(new C14768b(this));
        TextView textView = this.f56030q;
        if (textView == null) {
            C2668g.b("sponsoredLabel");
        }
        textView.setOnClickListener(new C14769c(this));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecsMediaViewVideoRenderer recsMediaViewVideoRenderer = this.f56015b;
        if (recsMediaViewVideoRenderer == null) {
            C2668g.b("mediaViewVideoRenderer");
        }
        recsMediaViewVideoRenderer.m61898a(this.f56032s);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RecsMediaViewVideoRenderer recsMediaViewVideoRenderer = this.f56015b;
        if (recsMediaViewVideoRenderer == null) {
            C2668g.b("mediaViewVideoRenderer");
        }
        recsMediaViewVideoRenderer.m61898a((Callback) null);
    }

    /* renamed from: a */
    public void m65497a(@NotNull C16428a c16428a) {
        C2668g.b(c16428a, "recCard");
        super.bind(c16428a);
        c16428a = ((C16464a) c16428a.getItem()).m61877c();
        if (c16428a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.RecsFanVideoAd");
        }
        this.f56028o = (C16467e) c16428a;
        c16428a = this.f56028o;
        if (c16428a == null) {
            C2668g.b("ad");
        }
        this.f56031r = c16428a.m61879a().getAdChoicesLinkUrl();
        C16467e c16467e = this.f56028o;
        if (c16467e == null) {
            C2668g.b("ad");
        }
        m65483b(c16467e);
        c16467e = this.f56028o;
        if (c16467e == null) {
            C2668g.b("ad");
        }
        m65486c(c16467e);
    }

    /* renamed from: b */
    public void m65498b(@Nullable C16428a c16428a) {
        c16428a = this.f56023j;
        if (c16428a == null) {
            C2668g.b("callToAction");
        }
        c16428a.m61912b();
    }

    public void onAttachedToCardCollectionLayout(@NotNull CardCollectionLayout cardCollectionLayout) {
        C2668g.b(cardCollectionLayout, "cardCollectionLayout");
        super.onAttachedToCardCollectionLayout(cardCollectionLayout);
        cardCollectionLayout = this.f56016c;
        if (cardCollectionLayout == null) {
            C2668g.b("mediaView");
        }
        View view = cardCollectionLayout;
        C16467e c16467e = this.f56028o;
        if (c16467e == null) {
            C2668g.b("ad");
        }
        m65478a(view, c16467e.m61879a().getAdCoverImage());
    }

    /* renamed from: a */
    private final void m65479a(C16467e c16467e) {
        ViewGroup viewGroup = this.f56029p;
        if (viewGroup == null) {
            C2668g.b("adChoicesContainer");
        }
        viewGroup.removeAllViews();
        AdChoicesView adChoicesView = new AdChoicesView(getContext(), c16467e.m61879a(), true);
        c16467e = this.f56029p;
        if (c16467e == null) {
            C2668g.b("adChoicesContainer");
        }
        c16467e.addView(adChoicesView);
    }

    /* renamed from: b */
    private final void m65483b(C16467e c16467e) {
        MediaView mediaView = this.f56016c;
        if (mediaView == null) {
            C2668g.b("mediaView");
        }
        mediaView.setNativeAd(c16467e.m61879a());
        c16467e = this.f56015b;
        if (c16467e == null) {
            C2668g.b("mediaViewVideoRenderer");
        }
        c16467e.m61899b();
        c16467e = this.f56015b;
        if (c16467e == null) {
            C2668g.b("mediaViewVideoRenderer");
        }
        c16467e.play(VideoStartReason.USER_STARTED);
    }

    /* renamed from: c */
    private final void m65486c(C16467e c16467e) {
        TextView textView = this.f56024k;
        if (textView == null) {
            C2668g.b("adSocialContext");
        }
        textView.setText(c16467e.m61879a().getAdSocialContext());
        textView = this.f56026m;
        if (textView == null) {
            C2668g.b("adSponsorName");
        }
        textView.setText(c16467e.m61879a().getAdTitle());
        textView = this.f56027n;
        if (textView == null) {
            C2668g.b("adBody");
        }
        textView.setText(c16467e.m61879a().getAdRawBody());
        RedGradientFillButtonView redGradientFillButtonView = this.f56023j;
        if (redGradientFillButtonView == null) {
            C2668g.b("callToAction");
        }
        String adCallToAction = c16467e.m61879a().getAdCallToAction();
        C2668g.a(adCallToAction, "fanAd.nativeAd.adCallToAction");
        redGradientFillButtonView.setText(adCallToAction);
        RequestManager b = C0994i.b(getContext());
        Image adIcon = c16467e.m61879a().getAdIcon();
        C2668g.a(adIcon, "fanAd.nativeAd.adIcon");
        C3018c b2 = b.a(adIcon.getUrl()).b();
        ImageView imageView = this.f56025l;
        if (imageView == null) {
            C2668g.b("adSponsorLogo");
        }
        b2.a(imageView);
        m65479a(c16467e);
        c16467e = c16467e.m61879a();
        ViewGroup viewGroup = this.f56017d;
        if (viewGroup == null) {
            C2668g.b("fanVideoContainer");
        }
        View view = viewGroup;
        View[] viewArr = new View[5];
        TextView textView2 = this.f56024k;
        if (textView2 == null) {
            C2668g.b("adSocialContext");
        }
        viewArr[0] = textView2;
        ImageView imageView2 = this.f56025l;
        if (imageView2 == null) {
            C2668g.b("adSponsorLogo");
        }
        viewArr[1] = imageView2;
        textView2 = this.f56026m;
        if (textView2 == null) {
            C2668g.b("adSponsorName");
        }
        viewArr[2] = textView2;
        RedGradientFillButtonView redGradientFillButtonView2 = this.f56023j;
        if (redGradientFillButtonView2 == null) {
            C2668g.b("callToAction");
        }
        viewArr[3] = redGradientFillButtonView2;
        textView2 = this.f56021h;
        if (textView2 == null) {
            C2668g.b("viewMoreButton");
        }
        viewArr[4] = textView2;
        c16467e.registerViewForInteraction(view, C17554o.m64199b((Object[]) viewArr));
    }

    /* renamed from: a */
    private final void m65478a(View view, Image image) {
        if (image == null) {
            return;
        }
        if (getWidth() != 0) {
            m65482b(view, image);
        } else {
            getViewTreeObserver().addOnGlobalLayoutListener(new C14770d(this, view, image));
        }
    }

    /* renamed from: b */
    private final void m65482b(View view, Image image) {
        int width = image.getWidth();
        image = image.getHeight();
        View rootView = getRootView();
        C2668g.a(rootView, "rootView");
        int height = rootView.getHeight();
        int width2 = getWidth();
        view.setLayoutParams(new LayoutParams(width2, Math.min((int) ((((double) image) * ((double) width2)) / ((double) width)), height / 3)));
    }

    /* renamed from: a */
    private final void m65477a() {
        if (this.f56031r != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f56031r));
            Context context = getContext();
            C2668g.a(context, "context");
            if (!context.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
                getContext().startActivity(intent);
            }
        }
    }

    /* renamed from: b */
    private final void m65481b() {
        ImageView imageView = this.f56018e;
        if (imageView == null) {
            C2668g.b("mediaViewPlayPauseButton");
        }
        imageView.setImageResource(C14757c.ic_play);
    }

    /* renamed from: c */
    private final void m65485c() {
        ImageView imageView = this.f56018e;
        if (imageView == null) {
            C2668g.b("mediaViewPlayPauseButton");
        }
        imageView.setImageResource(C14757c.ic_pause);
    }

    /* renamed from: d */
    private final void m65488d() {
        ImageView imageView = this.f56022i;
        if (imageView == null) {
            C2668g.b("muteButton");
        }
        imageView.setImageResource(C14757c.ic_volume_muted);
    }

    /* renamed from: e */
    private final void m65490e() {
        ImageView imageView = this.f56022i;
        if (imageView == null) {
            C2668g.b("muteButton");
        }
        imageView.setImageResource(C14757c.ic_volume);
    }

    /* renamed from: f */
    private final void m65492f() {
        FrameLayout frameLayout = this.f56019f;
        if (frameLayout == null) {
            C2668g.b("videoCompletedOverlay");
        }
        frameLayout.setVisibility(0);
        TextView textView = this.f56020g;
        if (textView == null) {
            C2668g.b("replayButton");
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(C0432b.a(getContext(), C14757c.ic_watch_again), null, null, null);
        textView = this.f56021h;
        if (textView == null) {
            C2668g.b("viewMoreButton");
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(C0432b.a(getContext(), C14757c.ic_eye), null, null, null);
        textView = this.f56020g;
        if (textView == null) {
            C2668g.b("replayButton");
        }
        textView.setOnClickListener(new C14771e(this));
    }

    /* renamed from: g */
    private final void m65494g() {
        FrameLayout frameLayout = this.f56019f;
        if (frameLayout == null) {
            C2668g.b("videoCompletedOverlay");
        }
        frameLayout.setVisibility(8);
        RecsMediaViewVideoRenderer recsMediaViewVideoRenderer = this.f56015b;
        if (recsMediaViewVideoRenderer == null) {
            C2668g.b("mediaViewVideoRenderer");
        }
        recsMediaViewVideoRenderer.play(VideoStartReason.USER_STARTED);
    }
}
