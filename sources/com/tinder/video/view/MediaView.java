package com.tinder.video.view;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.annotation.DrawableRes;
import android.support.constraint.C0132c;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.C4080b;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Player.C3585a;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.analytics.AnalyticsListener.C2009a;
import com.google.android.exoplayer2.analytics.C3588b;
import com.tinder.loops.OnMediaContentLoadedListener;
import com.tinder.utils.C15365p;
import com.tinder.utils.au;
import com.tinder.video.C15407a.C15394a;
import com.tinder.video.C15407a.C15395b;
import com.tinder.video.C15407a.C15396c;
import com.tinder.video.C15407a.C15397d;
import com.tinder.video.C15407a.C15398e;
import com.tinder.video.C15407a.C15400g;
import com.tinder.video.activities.FullscreenVideoActivity;
import com.tinder.video.activities.FullscreenVideoActivity.C15408a;
import com.tinder.video.injection.VideoInjector$Factory;
import com.tinder.video.model.C17250a;
import com.tinder.video.model.C17251d;
import com.tinder.video.model.MediaScaleType;
import com.tinder.video.p444a.C15401a;
import com.tinder.video.p444a.C15404c;
import com.tinder.video.p444a.C15406d;
import com.tinder.video.p445b.C15411b;
import com.tinder.video.p446c.C15412a;
import com.tinder.video.target.VideoTarget;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.HashMap;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000±\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\"*\u0001\u0017\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\n\u0001\u0001\u0001\u0001\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0016J\b\u0010.\u001a\u00020,H\u0016J\b\u0010/\u001a\u00020,H\u0016J\u0010\u00100\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0016J\u0018\u00103\u001a\u00020,2\u0006\u00104\u001a\u0002022\u0006\u00105\u001a\u000202H\u0016J\u0010\u00106\u001a\u00020,2\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020,2\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010:\u001a\u00020,2\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010;\u001a\u00020,2\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010<\u001a\u00020,2\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010=\u001a\u00020,2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J<\u0010>\u001a\u00020,2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@2\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020C0@2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u001aJ\b\u0010F\u001a\u00020,H\u0016J\b\u0010G\u001a\u00020,H\u0016J\b\u0010H\u001a\u00020,H\u0016J\b\u0010I\u001a\u00020,H\u0002J\b\u0010J\u001a\u00020,H\u0016J\b\u0010K\u001a\u00020,H\u0016J\u001a\u0010L\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010M\u001a\u00020,H\u0002J\u0012\u0010N\u001a\u00020,2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010Q\u001a\u00020,H\u0016J\b\u0010R\u001a\u00020,H\u0016J\b\u0010S\u001a\u00020,H\u0014J\b\u0010T\u001a\u00020,H\u0014J\u0006\u0010U\u001a\u00020,J\u0006\u0010V\u001a\u00020,J\b\u0010W\u001a\u00020,H\u0016J\u0018\u0010X\u001a\u00020,2\u0006\u0010Y\u001a\u00020P2\u0006\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020,H\u0016J\b\u0010]\u001a\u00020,H\u0002J\b\u0010^\u001a\u00020,H\u0016J\b\u0010_\u001a\u00020,H\u0016J\u0010\u0010`\u001a\u00020,2\u0006\u0010a\u001a\u00020PH\u0016J\u0006\u0010b\u001a\u00020,J\u000e\u0010c\u001a\u00020,2\u0006\u0010d\u001a\u00020eJ\u0010\u0010f\u001a\u00020,2\b\b\u0001\u0010g\u001a\u00020\bJ\b\u0010h\u001a\u00020,H\u0016J\u0010\u0010i\u001a\u00020,2\u0006\u0010j\u001a\u00020[H\u0016J\u000e\u0010k\u001a\u00020,2\u0006\u0010l\u001a\u00020\u001cJ\u000e\u0010m\u001a\u00020,2\u0006\u0010n\u001a\u00020[J\u0006\u0010o\u001a\u00020,J\b\u0010p\u001a\u00020,H\u0002J\b\u0010q\u001a\u00020,H\u0002J\b\u0010r\u001a\u00020,H\u0016J\b\u0010s\u001a\u00020,H\u0016J\b\u0010t\u001a\u00020,H\u0016J\b\u0010u\u001a\u00020,H\u0016J\b\u0010v\u001a\u00020,H\u0002J\u0018\u0010w\u001a\u00020,2\u0006\u0010Y\u001a\u00020P2\u0006\u0010x\u001a\u000202H\u0016J\b\u0010y\u001a\u00020,H\u0016J\b\u0010z\u001a\u00020,H\u0016J\b\u0010{\u001a\u00020,H\u0016J\b\u0010|\u001a\u00020,H\u0016J\b\u0010}\u001a\u00020,H\u0016J\b\u0010~\u001a\u00020,H\u0016J\u0010\u0010\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0002J\u0012\u0010\u0001\u001a\u00020,2\u0007\u0010\u0001\u001a\u000202H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u00060\"R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020$8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0012\u0010)\u001a\u00060*R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/tinder/video/view/MediaView;", "Lcom/tinder/video/view/RoundedConstraintLayout;", "Lcom/tinder/video/target/VideoTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "contentLoadedListener", "Lcom/tinder/loops/OnMediaContentLoadedListener;", "copyBitmapDisposable", "Lio/reactivex/disposables/Disposable;", "exoPlayerProvider", "Lcom/tinder/video/provider/ExoPlayerProvider;", "getExoPlayerProvider$video_release", "()Lcom/tinder/video/provider/ExoPlayerProvider;", "setExoPlayerProvider$video_release", "(Lcom/tinder/video/provider/ExoPlayerProvider;)V", "lifeCycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "parentActivityLifecycleObserver", "com/tinder/video/view/MediaView$parentActivityLifecycleObserver$1", "Lcom/tinder/video/view/MediaView$parentActivityLifecycleObserver$1;", "parentVideoClickListener", "Lcom/tinder/video/view/MediaView$VideoClickListener;", "parentVideoMuteListener", "Lcom/tinder/video/view/MediaView$VideoMuteListener;", "placeholderBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "playerStateChangedListener", "Lcom/tinder/video/view/MediaView$MediaViewPlayerPlayStateChangedListener;", "videoPresenter", "Lcom/tinder/video/presenter/VideoPresenter;", "getVideoPresenter$video_release", "()Lcom/tinder/video/presenter/VideoPresenter;", "setVideoPresenter$video_release", "(Lcom/tinder/video/presenter/VideoPresenter;)V", "videoRendererEventListener", "Lcom/tinder/video/view/MediaView$MediaViewRendererEventListener;", "addActivityLifecycleObserver", "", "addEventListenerOnPlayer", "addVideoRendererEventListenerOnPlayer", "animateVideoLoadingIndicator", "applyAspectRatioHeightScalingToMediaViews", "heightWidthVideoAspectRatio", "", "applyCenterCropTransformationToPlayerView", "videoWidth", "videoHeight", "applyFullscreenModeStyling", "typedArray", "Landroid/content/res/TypedArray;", "applyMediaScaleType", "applyMuteControlsStyling", "applyPlaceholderStyling", "applyVideoPreviewModeStyling", "applyXmlStyling", "bind", "videoViewModels", "", "Lcom/tinder/video/model/VideoViewModel;", "thumbnailViewModels", "Lcom/tinder/video/model/ImageViewModel;", "onMediaContentLoadedListener", "videoClickListener", "clearCurrentVideoFrameInPreviewView", "hideLoadingState", "hidePausedState", "hidePlaceholder", "hideVideoPreview", "hideVolumeControls", "inflateAndApplyXmlStyling", "initVideoClickListener", "loadHighResThumbnailImagePreview", "highResThumbnailUrl", "", "notifyVideoMuted", "notifyVideoUnmuted", "onAttachedToWindow", "onDetachedFromWindow", "pauseVideo", "playVideo", "prepareForMutingAudio", "prepareVideo", "videoUrl", "loopVideo", "", "releasePlayer", "removeActivityLifecycleObserver", "removeEventListenerFromPlayer", "removeVideoRendererEventListenerOnPlayer", "sendErrorLoadingContentEvent", "mediaUrl", "setFullscreenModeEnabled", "setMediaScaleType", "mediaScaleType", "Lcom/tinder/video/model/MediaScaleType;", "setPlaceholderBackgroundResource", "resourceId", "setPlayButtonClickListener", "setPlayWhenReadyOnPlayer", "value", "setVideoMuteListener", "videoMuteListener", "setVideoPreviewModeEnabled", "isVideoPreviewModeEnabled", "setVolumeMuteControlsEnabled", "setupDagger", "setupLifeCycleOwner", "showCurrentVideoFrameInPreviewView", "showErrorState", "showLoadingState", "showPausedState", "showPlaceholder", "showVideoFullscreen", "widthHeightVideoAspectRatio", "showVideoPlayerView", "showVideoPreview", "showVolumeControls", "showVolumeMutedState", "showVolumePlayingState", "unsubscribeFromCopyingPreviousVideoFrame", "updateMediaViewHeight", "updatePlayerVolume", "volume", "Companion", "MediaViewPlayerPlayStateChangedListener", "MediaViewRendererEventListener", "VideoClickListener", "VideoMuteListener", "video_release"}, k = 1, mv = {1, 1, 10})
public final class MediaView extends RoundedConstraintLayout implements VideoTarget {
    /* renamed from: c */
    public static final C15417a f56646c = new C15417a();
    @Inject
    @NotNull
    /* renamed from: a */
    public C15412a f56647a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C15411b f56648b;
    /* renamed from: d */
    private OnMediaContentLoadedListener f56649d;
    /* renamed from: e */
    private VideoClickListener f56650e;
    /* renamed from: f */
    private VideoMuteListener f56651f;
    /* renamed from: g */
    private LifecycleOwner f56652g;
    /* renamed from: h */
    private final C18296b f56653h;
    /* renamed from: i */
    private final C18297c f56654i;
    /* renamed from: j */
    private SimpleExoPlayer f56655j;
    /* renamed from: k */
    private Drawable f56656k;
    /* renamed from: l */
    private final MediaView$parentActivityLifecycleObserver$1 f56657l;
    /* renamed from: m */
    private Disposable f56658m;
    /* renamed from: n */
    private HashMap f56659n;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/video/view/MediaView$VideoClickListener;", "", "onClicked", "", "video_release"}, k = 1, mv = {1, 1, 10})
    public interface VideoClickListener {
        void onClicked();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/tinder/video/view/MediaView$VideoMuteListener;", "", "onAudioMuted", "", "onAudioUnMuted", "video_release"}, k = 1, mv = {1, 1, 10})
    public interface VideoMuteListener {
        void onAudioMuted();

        void onAudioUnMuted();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¨\u0006\f"}, d2 = {"Lcom/tinder/video/view/MediaView$Companion;", "", "()V", "createAndBind", "Lcom/tinder/video/view/MediaView;", "context", "Landroid/content/Context;", "videos", "", "Lcom/tinder/video/model/VideoViewModel;", "thumbnails", "Lcom/tinder/video/model/ImageViewModel;", "video_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.view.MediaView$a */
    public static final class C15417a {
        private C15417a() {
        }

        @NotNull
        /* renamed from: a */
        public final MediaView m57807a(@NotNull Context context, @NotNull List<C17251d> list, @NotNull List<C17250a> list2) {
            C2668g.b(context, "context");
            C2668g.b(list, "videos");
            C2668g.b(list2, "thumbnails");
            MediaView mediaView = new MediaView(context, null, 0, 6, null);
            MediaView.m66261a(mediaView, list, list2, null, null, 12, null);
            return mediaView;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.view.MediaView$d */
    static final class C15418d implements Runnable {
        /* renamed from: a */
        final /* synthetic */ MediaView f47700a;

        C15418d(MediaView mediaView) {
            this.f47700a = mediaView;
        }

        public final void run() {
            ((ImageView) this.f47700a.mo13544a(C15397d.videoLoadingAnimationView)).clearAnimation();
            ImageView imageView = (ImageView) this.f47700a.mo13544a(C15397d.videoLoadingAnimationView);
            C2668g.a(imageView, "videoLoadingAnimationView");
            imageView.setVisibility(4);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.view.MediaView$e */
    static final class C15419e implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MediaView f47701a;

        C15419e(MediaView mediaView) {
            this.f47701a = mediaView;
        }

        public final void onClick(View view) {
            this.f47701a.getVideoPresenter$video_release().m57780f();
            view = this.f47701a.f56650e;
            if (view != null) {
                view.onClicked();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.view.MediaView$g */
    static final class C15420g implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MediaView f47702a;

        C15420g(MediaView mediaView) {
            this.f47702a = mediaView;
        }

        public final void onClick(View view) {
            this.f47702a.getVideoPresenter$video_release().m57787m();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J4\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016J<\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/tinder/video/view/MediaView$loadHighResThumbnailImagePreview$1$requestListener$1", "Lcom/bumptech/glide/request/RequestListener;", "", "Landroid/graphics/Bitmap;", "(Lcom/tinder/video/view/MediaView$loadHighResThumbnailImagePreview$1;)V", "onException", "", "e", "Ljava/lang/Exception;", "model", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "isFromMemoryCache", "video_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.view.MediaView$f */
    public static final class C17254f implements RequestListener<String, Bitmap> {
        /* renamed from: a */
        final /* synthetic */ MediaView f52873a;
        /* renamed from: b */
        final /* synthetic */ String f52874b;

        C17254f(MediaView mediaView, String str) {
            this.f52873a = mediaView;
            this.f52874b = str;
        }

        public /* synthetic */ boolean onException(Exception exception, Object obj, Target target, boolean z) {
            return m63168a(exception, (String) obj, target, z);
        }

        public /* synthetic */ boolean onResourceReady(Object obj, Object obj2, Target target, boolean z, boolean z2) {
            return m63167a((Bitmap) obj, (String) obj2, target, z, z2);
        }

        /* renamed from: a */
        public boolean m63167a(@Nullable Bitmap bitmap, @Nullable String str, @Nullable Target<Bitmap> target, boolean z, boolean z2) {
            this.f52873a.getVideoPresenter$video_release().m57786l();
            return null;
        }

        /* renamed from: a */
        public boolean m63168a(@Nullable Exception exception, @Nullable String str, @Nullable Target<Bitmap> target, boolean z) {
            this.f52873a.getVideoPresenter$video_release().m57785k();
            return null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "bitmapOptional", "Ljava8/util/Optional;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.view.MediaView$h */
    static final class C17256h<T> implements Consumer<Optional<Bitmap>> {
        /* renamed from: a */
        final /* synthetic */ MediaView f52876a;

        C17256h(MediaView mediaView) {
            this.f52876a = mediaView;
        }

        public /* synthetic */ void accept(Object obj) {
            m63170a((Optional) obj);
        }

        /* renamed from: a */
        public final void m63170a(Optional<Bitmap> optional) {
            optional.m59125a((java8.util.function.Consumer) new java8.util.function.Consumer<Bitmap>() {
                public /* synthetic */ void accept(Object obj) {
                    m63169a((Bitmap) obj);
                }

                /* renamed from: a */
                public final void m63169a(Bitmap bitmap) {
                    ((ImageView) this.f52876a.mo13544a(C15397d.videoPreviewView)).setImageBitmap(bitmap);
                    this.f52876a.getVideoPresenter$video_release().m57783i();
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.view.MediaView$i */
    static final class C17257i<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17257i f52877a = new C17257i();

        C17257i() {
        }

        public /* synthetic */ void accept(Object obj) {
            m63171a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63171a(Throwable th) {
            C0001a.c(th, "copying bitmap failed", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/tinder/video/view/MediaView$MediaViewPlayerPlayStateChangedListener;", "Lcom/google/android/exoplayer2/Player$DefaultEventListener;", "(Lcom/tinder/video/view/MediaView;)V", "onPlayerError", "", "error", "Lcom/google/android/exoplayer2/ExoPlaybackException;", "onPlayerStateChanged", "playWhenReady", "", "playbackState", "", "video_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.view.MediaView$b */
    private final class C18296b extends C3585a {
        /* renamed from: a */
        final /* synthetic */ MediaView f56644a;

        public void onPlayerStateChanged(boolean z, int i) {
        }

        public C18296b(MediaView mediaView) {
            this.f56644a = mediaView;
        }

        public void onPlayerError(@Nullable ExoPlaybackException exoPlaybackException) {
            C0001a.b(exoPlaybackException, "Error playing Activity Feed video", new Object[0]);
            this.f56644a.getVideoPresenter$video_release().m57782h();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/video/view/MediaView$MediaViewRendererEventListener;", "Lcom/google/android/exoplayer2/analytics/DefaultAnalyticsListener;", "(Lcom/tinder/video/view/MediaView;)V", "onRenderedFirstFrame", "", "eventTime", "Lcom/google/android/exoplayer2/analytics/AnalyticsListener$EventTime;", "surface", "Landroid/view/Surface;", "video_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.view.MediaView$c */
    private final class C18297c extends C3588b {
        /* renamed from: a */
        final /* synthetic */ MediaView f56645a;

        public C18297c(MediaView mediaView) {
            this.f56645a = mediaView;
        }

        public void onRenderedFirstFrame(@NotNull C2009a c2009a, @NotNull Surface surface) {
            C2668g.b(c2009a, "eventTime");
            C2668g.b(surface, "surface");
            this.f56645a.getVideoPresenter$video_release().m57784j();
            c2009a = this.f56645a.f56649d;
            if (c2009a != null) {
                c2009a.onContentLoaded();
            }
        }
    }

    @JvmOverloads
    public MediaView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public MediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo13544a(int i) {
        if (this.f56659n == null) {
            this.f56659n = new HashMap();
        }
        View view = (View) this.f56659n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f56659n.put(Integer.valueOf(i), view);
        return view;
    }

    @JvmOverloads
    public /* synthetic */ MediaView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public MediaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        this.f56653h = new C18296b(this);
        this.f56654i = new C18297c(this);
        this.f56657l = new MediaView$parentActivityLifecycleObserver$1(this);
        m66272h();
        m66259a(context, attributeSet);
        m66273i();
        m66271g();
        TextureView textureView = (TextureView) mo13544a(C15397d.videoPlayerView);
        C2668g.a(textureView, "videoPlayerView");
        textureView.setOpaque(null);
    }

    @NotNull
    public final C15412a getExoPlayerProvider$video_release() {
        C15412a c15412a = this.f56647a;
        if (c15412a == null) {
            C2668g.b("exoPlayerProvider");
        }
        return c15412a;
    }

    public final void setExoPlayerProvider$video_release(@NotNull C15412a c15412a) {
        C2668g.b(c15412a, "<set-?>");
        this.f56647a = c15412a;
    }

    @NotNull
    public final C15411b getVideoPresenter$video_release() {
        C15411b c15411b = this.f56648b;
        if (c15411b == null) {
            C2668g.b("videoPresenter");
        }
        return c15411b;
    }

    public final void setVideoPresenter$video_release(@NotNull C15411b c15411b) {
        C2668g.b(c15411b, "<set-?>");
        this.f56648b = c15411b;
    }

    /* renamed from: a */
    public static /* synthetic */ void m66261a(MediaView mediaView, List list, List list2, OnMediaContentLoadedListener onMediaContentLoadedListener, VideoClickListener videoClickListener, int i, Object obj) {
        if ((i & 2) != null) {
            list2 = C17554o.m64195a();
        }
        if ((i & 4) != null) {
            onMediaContentLoadedListener = null;
        }
        if ((i & 8) != 0) {
            videoClickListener = null;
        }
        mediaView.m66277a(list, list2, onMediaContentLoadedListener, videoClickListener);
    }

    /* renamed from: a */
    public final void m66277a(@NotNull List<C17251d> list, @NotNull List<C17250a> list2, @Nullable OnMediaContentLoadedListener onMediaContentLoadedListener, @Nullable VideoClickListener videoClickListener) {
        C2668g.b(list, "videoViewModels");
        C2668g.b(list2, "thumbnailViewModels");
        C15411b c15411b = this.f56648b;
        if (c15411b == null) {
            C2668g.b("videoPresenter");
        }
        c15411b.m57772a(list, list2, isAttachedToWindow());
        this.f56649d = onMediaContentLoadedListener;
        this.f56650e = videoClickListener;
    }

    public final void setVideoMuteListener(@NotNull VideoMuteListener videoMuteListener) {
        C2668g.b(videoMuteListener, "videoMuteListener");
        this.f56651f = videoMuteListener;
    }

    public final void setPlaceholderBackgroundResource(@DrawableRes int i) {
        this.f56656k = C0432b.a(getContext(), i);
    }

    public final void setMediaScaleType(@NotNull MediaScaleType mediaScaleType) {
        C2668g.b(mediaScaleType, "mediaScaleType");
        C15411b c15411b = this.f56648b;
        if (c15411b == null) {
            C2668g.b("videoPresenter");
        }
        c15411b.m57770a(mediaScaleType);
    }

    /* renamed from: a */
    public final void mo13545a() {
        C15411b c15411b = this.f56648b;
        if (c15411b == null) {
            C2668g.b("videoPresenter");
        }
        c15411b.m57775b(true);
    }

    public final void setVideoPreviewModeEnabled(boolean z) {
        C15411b c15411b = this.f56648b;
        if (c15411b == null) {
            C2668g.b("videoPresenter");
        }
        c15411b.m57773a(z);
    }

    /* renamed from: b */
    public final void m66278b() {
        C15411b c15411b = this.f56648b;
        if (c15411b == null) {
            C2668g.b("videoPresenter");
        }
        c15411b.m57777c(true);
    }

    /* renamed from: a */
    public final void m66276a(@Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C15400g.MediaView);
        try {
            C2668g.a(obtainStyledAttributes, "typedArray");
            m66260a(obtainStyledAttributes);
            m66263b(obtainStyledAttributes);
            m66265c(obtainStyledAttributes);
            m66267d(obtainStyledAttributes);
            m66269e(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void applyAspectRatioHeightScalingToMediaViews(float f) {
        m66258a(f);
    }

    public void applyCenterCropTransformationToPlayerView(float f, float f2) {
        TextureView textureView = (TextureView) mo13544a(C15397d.videoPlayerView);
        C2668g.a(textureView, "videoPlayerView");
        C15404c.m57733a(textureView, f, f2);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C15411b c15411b = this.f56648b;
        if (c15411b == null) {
            C2668g.b("videoPresenter");
        }
        c15411b.m57771a((VideoTarget) this);
        m66268e();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C15411b c15411b = this.f56648b;
        if (c15411b == null) {
            C2668g.b("videoPresenter");
        }
        c15411b.m57768a();
        m66270f();
        this.f56649d = (OnMediaContentLoadedListener) null;
    }

    public void releasePlayer() {
        SimpleExoPlayer simpleExoPlayer = this.f56655j;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.release();
        }
        this.f56655j = (SimpleExoPlayer) null;
    }

    public void notifyVideoMuted() {
        VideoMuteListener videoMuteListener = this.f56651f;
        if (videoMuteListener != null) {
            videoMuteListener.onAudioMuted();
        }
    }

    public void notifyVideoUnmuted() {
        VideoMuteListener videoMuteListener = this.f56651f;
        if (videoMuteListener != null) {
            videoMuteListener.onAudioUnMuted();
        }
    }

    public void sendErrorLoadingContentEvent(@NotNull String str) {
        C2668g.b(str, "mediaUrl");
        OnMediaContentLoadedListener onMediaContentLoadedListener = this.f56649d;
        if (onMediaContentLoadedListener != null) {
            onMediaContentLoadedListener.onErrorLoadingContent(str);
        }
    }

    public void showVideoFullscreen(@NotNull String str, float f) {
        C2668g.b(str, "videoUrl");
        C15408a c15408a = FullscreenVideoActivity.f59943c;
        Context context = getContext();
        C2668g.a(context, "context");
        getContext().startActivity(c15408a.m57740a(context, str, f));
    }

    public void prepareForMutingAudio() {
        SimpleExoPlayer simpleExoPlayer = this.f56655j;
        if (simpleExoPlayer != null) {
            C15411b c15411b = this.f56648b;
            if (c15411b == null) {
                C2668g.b("videoPresenter");
            }
            c15411b.m57769a(simpleExoPlayer.a());
        }
    }

    public void updatePlayerVolume(float f) {
        SimpleExoPlayer simpleExoPlayer = this.f56655j;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.a(f);
        }
    }

    public void showVolumeMutedState() {
        View a = mo13544a(C15397d.videoAudioStateOverlayView);
        C2668g.a(a, "videoAudioStateOverlayView");
        a.setBackground(au.m57651b(this, C15396c.ic_audio_muted));
    }

    public void showVolumePlayingState() {
        View a = mo13544a(C15397d.videoAudioStateOverlayView);
        C2668g.a(a, "videoAudioStateOverlayView");
        a.setBackground(au.m57651b(this, C15396c.ic_audio_playing));
    }

    public void showVolumeControls() {
        View a = mo13544a(C15397d.videoAudioStateOverlayView);
        C2668g.a(a, "videoAudioStateOverlayView");
        a.setVisibility(0);
    }

    public void hideVolumeControls() {
        View a = mo13544a(C15397d.videoAudioStateOverlayView);
        C2668g.a(a, "videoAudioStateOverlayView");
        a.setVisibility(8);
    }

    public void showLoadingState() {
        ProgressBar progressBar = (ProgressBar) mo13544a(C15397d.videoProgressLoaderView);
        C2668g.a(progressBar, "videoProgressLoaderView");
        progressBar.setVisibility(0);
        TextView textView = (TextView) mo13544a(C15397d.videoErrorStateTextView);
        C2668g.a(textView, "videoErrorStateTextView");
        textView.setVisibility(8);
        View a = mo13544a(C15397d.videoErrorStateImageView);
        C2668g.a(a, "videoErrorStateImageView");
        a.setVisibility(8);
        a = mo13544a(C15397d.videoPlayButtonView);
        C2668g.a(a, "videoPlayButtonView");
        a.setVisibility(4);
        m66264c();
    }

    public void hideLoadingState() {
        ProgressBar progressBar = (ProgressBar) mo13544a(C15397d.videoProgressLoaderView);
        C2668g.a(progressBar, "videoProgressLoaderView");
        progressBar.setVisibility(4);
        m66266d();
    }

    public void showVideoPlayerView() {
        TextureView textureView = (TextureView) mo13544a(C15397d.videoPlayerView);
        C2668g.a(textureView, "videoPlayerView");
        textureView.setVisibility(0);
    }

    public void showVideoPreview() {
        ImageView imageView = (ImageView) mo13544a(C15397d.videoPreviewView);
        C2668g.a(imageView, "videoPreviewView");
        imageView.setVisibility(0);
        TextureView textureView = (TextureView) mo13544a(C15397d.videoPlayerView);
        C2668g.a(textureView, "videoPlayerView");
        textureView.setVisibility(4);
    }

    public void hideVideoPreview() {
        ImageView imageView = (ImageView) mo13544a(C15397d.videoPreviewView);
        C2668g.a(imageView, "videoPreviewView");
        imageView.setVisibility(4);
    }

    public void showPausedState() {
        View a = mo13544a(C15397d.videoPlayButtonView);
        C2668g.a(a, "videoPlayButtonView");
        a.setVisibility(0);
    }

    public void hidePausedState() {
        View a = mo13544a(C15397d.videoPlayButtonView);
        C2668g.a(a, "videoPlayButtonView");
        a.setVisibility(4);
    }

    public void showErrorState() {
        m66264c();
        View a = mo13544a(C15397d.videoErrorStateImageView);
        C2668g.a(a, "videoErrorStateImageView");
        a.setVisibility(0);
        TextView textView = (TextView) mo13544a(C15397d.videoErrorStateTextView);
        C2668g.a(textView, "videoErrorStateTextView");
        textView.setVisibility(0);
    }

    public void removeEventListenerFromPlayer() {
        SimpleExoPlayer simpleExoPlayer = this.f56655j;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.removeListener(this.f56653h);
        }
    }

    public void addEventListenerOnPlayer() {
        SimpleExoPlayer simpleExoPlayer = this.f56655j;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.addListener(this.f56653h);
        }
    }

    public void removeVideoRendererEventListenerOnPlayer() {
        SimpleExoPlayer simpleExoPlayer = this.f56655j;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.b(this.f56654i);
        }
    }

    public void addVideoRendererEventListenerOnPlayer() {
        SimpleExoPlayer simpleExoPlayer = this.f56655j;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.a(this.f56654i);
        }
    }

    public void showCurrentVideoFrameInPreviewView() {
        TextureView textureView = (TextureView) mo13544a(C15397d.videoPlayerView);
        C2668g.a(textureView, "videoPlayerView");
        this.f56658m = C15406d.m57737a(textureView).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C17256h(this), C17257i.f52877a);
    }

    public void unsubscribeFromCopyingPreviousVideoFrame() {
        Disposable disposable = this.f56658m;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public void clearCurrentVideoFrameInPreviewView() {
        ((ImageView) mo13544a(C15397d.videoPreviewView)).setImageBitmap(null);
    }

    public void setPlayWhenReadyOnPlayer(boolean z) {
        SimpleExoPlayer simpleExoPlayer = this.f56655j;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(z);
        }
    }

    public void loadHighResThumbnailImagePreview(@Nullable String str) {
        C4080b l = C0994i.b(getContext()).a(str).l();
        l.a(new C17254f(this, str));
        l.a((ImageView) mo13544a(C15397d.videoPreviewView));
    }

    public void animateVideoLoadingIndicator() {
        ImageView imageView = (ImageView) mo13544a(C15397d.videoLoadingAnimationView);
        C2668g.a(imageView, "videoLoadingAnimationView");
        imageView.setVisibility(0);
        ((ImageView) mo13544a(C15397d.videoLoadingAnimationView)).startAnimation(AnimationUtils.loadAnimation(getContext(), C15394a.anim_video_loop));
        new Handler().postDelayed(new C15418d(this), 1000);
    }

    public void prepareVideo(@NotNull String str, boolean z) {
        C15412a c15412a;
        C2668g.b(str, "videoUrl");
        if (this.f56655j == null) {
            c15412a = this.f56647a;
            if (c15412a == null) {
                C2668g.b("exoPlayerProvider");
            }
            SimpleExoPlayer a = c15412a.m57789a();
            a.setVideoTextureView((TextureView) mo13544a(C15397d.videoPlayerView));
            this.f56655j = a;
        }
        c15412a = this.f56647a;
        if (c15412a == null) {
            C2668g.b("exoPlayerProvider");
        }
        SimpleExoPlayer simpleExoPlayer = this.f56655j;
        if (simpleExoPlayer == null) {
            C2668g.a();
        }
        c15412a.m57790a(simpleExoPlayer, str, z);
        str = this.f56648b;
        if (str == null) {
            C2668g.b("videoPresenter");
        }
        str.m57781g();
    }

    public void setPlayButtonClickListener() {
        mo13544a(C15397d.videoPlayButtonView).setOnClickListener(new C15420g(this));
    }

    /* renamed from: c */
    private final void m66264c() {
        setBackground(this.f56656k);
    }

    /* renamed from: d */
    private final void m66266d() {
        setBackground((Drawable) null);
    }

    /* renamed from: e */
    private final void m66268e() {
        LifecycleOwner lifecycleOwner = this.f56652g;
        if (lifecycleOwner != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            if (lifecycle != null) {
                lifecycle.a(this.f56657l);
            }
        }
    }

    /* renamed from: f */
    private final void m66270f() {
        LifecycleOwner lifecycleOwner = this.f56652g;
        if (lifecycleOwner != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this.f56657l);
            }
        }
    }

    /* renamed from: g */
    private final void m66271g() {
        setOnClickListener(new C15419e(this));
    }

    /* renamed from: a */
    private final void m66258a(float f) {
        MediaView mediaView = this;
        C0132c c0132c = new C0132c();
        ConstraintLayout constraintLayout = mediaView;
        c0132c.a(constraintLayout);
        TextureView textureView = (TextureView) mo13544a(C15397d.videoPlayerView);
        C2668g.a(textureView, "videoPlayerView");
        C15401a.m57730a(c0132c, textureView.getId(), f);
        ImageView imageView = (ImageView) mo13544a(C15397d.videoPreviewView);
        C2668g.a(imageView, "videoPreviewView");
        C15401a.m57730a(c0132c, imageView.getId(), f);
        c0132c.b(constraintLayout);
    }

    /* renamed from: a */
    private final void m66259a(Context context, AttributeSet attributeSet) {
        ConstraintLayout.inflate(context, C15398e.media_view, this);
        setLayoutParams(new LayoutParams(-1, -2));
        m66276a(attributeSet);
    }

    /* renamed from: h */
    private final void m66272h() {
        if (!isInEditMode()) {
            Context context = getContext();
            C2668g.a(context, "context");
            context = C15365p.m57675b(context);
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.video.injection.VideoInjector.Factory");
            }
            ((VideoInjector$Factory) context).provideVideoInjector().inject(this);
        }
    }

    /* renamed from: i */
    private final void m66273i() {
        Context context = getContext();
        C2668g.a(context, "context");
        context = C15365p.m57675b(context);
        if (context instanceof LifecycleOwner) {
            this.f56652g = (LifecycleOwner) context;
        } else {
            C0001a.d("activity doesn't implement the LifecycleOwner interface,\n                please use an AppCompatActivity from the support library", new Object[0]);
        }
    }

    /* renamed from: a */
    private final void m66260a(TypedArray typedArray) {
        setVideoPreviewModeEnabled(typedArray.getBoolean(C15400g.MediaView_enableVideoPreviewMode, false));
    }

    /* renamed from: b */
    private final void m66263b(TypedArray typedArray) {
        if (typedArray.getBoolean(C15400g.MediaView_enableFullscreenMode, false) != null) {
            mo13545a();
        }
    }

    /* renamed from: c */
    private final void m66265c(TypedArray typedArray) {
        if (typedArray.getBoolean(C15400g.MediaView_enableVideoVolumeMuteControls, false) != null) {
            m66278b();
        }
    }

    /* renamed from: d */
    private final void m66267d(TypedArray typedArray) {
        setPlaceholderBackgroundResource(typedArray.getResourceId(C15400g.MediaView_placeholderDrawable, C15395b.video_loading_background));
    }

    /* renamed from: e */
    private final void m66269e(TypedArray typedArray) {
        MediaScaleType mediaScaleType = MediaScaleType.values()[typedArray.getInt(C15400g.MediaView_mediaScaleType, 0)];
        C15411b c15411b = this.f56648b;
        if (c15411b == null) {
            C2668g.b("videoPresenter");
        }
        c15411b.m57770a(mediaScaleType);
    }
}
