package com.tinder.video.p445b;

import com.tinder.common.tracker.recyclerview.rx.ViewVisibleObserver;
import com.tinder.domain.loops.usecase.GetAutoPlayLoopsEnabledStatus;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import com.tinder.video.model.C15416c;
import com.tinder.video.model.C17250a;
import com.tinder.video.model.C17251d;
import com.tinder.video.model.MediaScaleType;
import com.tinder.video.target.C17253b;
import com.tinder.video.target.VideoTarget;
import io.reactivex.C15679f;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010!\u001a\u00020\"H\u0002J\u0006\u0010#\u001a\u00020\"J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0002J\b\u0010'\u001a\u00020\"H\u0002J\u000e\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u001cJ\b\u0010*\u001a\u00020\"H\u0002J\b\u0010+\u001a\u00020\"H\u0002J\b\u0010,\u001a\u00020\"H\u0002J,\u0010-\u001a\u00020\"2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130/2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010/2\b\b\u0002\u00102\u001a\u00020\u000eJ\u0006\u00103\u001a\u00020\"J\u0006\u00104\u001a\u00020\"J\u0006\u00105\u001a\u00020\"J\u0006\u00106\u001a\u00020\"J\u0006\u00107\u001a\u00020\"J\u0006\u00108\u001a\u00020\"J\u0006\u00109\u001a\u00020\"J\u0006\u0010:\u001a\u00020\"J\u0006\u0010;\u001a\u00020\"J\u0006\u0010<\u001a\u00020\"J\u0006\u0010=\u001a\u00020\"J\u0006\u0010>\u001a\u00020\"J\b\u0010?\u001a\u00020\"H\u0002J\b\u0010@\u001a\u00020\"H\u0002J\u000e\u0010A\u001a\u00020\"2\u0006\u0010B\u001a\u00020\u000eJ\u000e\u0010C\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010D\u001a\u00020\"H\u0002J\u000e\u0010E\u001a\u00020\"2\u0006\u0010F\u001a\u00020\u000eJ\u000e\u0010G\u001a\u00020\"2\u0006\u0010H\u001a\u00020\u000eJ\b\u0010I\u001a\u00020\u000eH\u0002J\b\u0010J\u001a\u00020\"H\u0002J\u000e\u0010K\u001a\u00020\"2\u0006\u0010L\u001a\u00020\u001eJ\b\u0010M\u001a\u00020\"H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/tinder/video/presenter/VideoPresenter;", "", "viewVisibleObserver", "Lcom/tinder/common/tracker/recyclerview/rx/ViewVisibleObserver;", "getAutoPlayLoopsEnabled", "Lcom/tinder/domain/loops/usecase/GetAutoPlayLoopsEnabledStatus;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/common/tracker/recyclerview/rx/ViewVisibleObserver;Lcom/tinder/domain/loops/usecase/GetAutoPlayLoopsEnabledStatus;Lio/reactivex/Scheduler;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "currentlyLoadedThumbnailUrl", "", "hasPreviewForCurrentVideoLoaded", "", "getHasPreviewForCurrentVideoLoaded", "()Z", "highResThumbnailUrl", "highResVideo", "Lcom/tinder/video/model/VideoViewModel;", "isEventListenersAdded", "isFullscreenModeEnabled", "isVideoPlaying", "isVolumeMuteControlsEnabled", "isVolumeMuted", "mediaScaleType", "Lcom/tinder/video/model/MediaScaleType;", "previouslyPlayingVolume", "", "target", "Lcom/tinder/video/target/VideoTarget;", "videoFirstFrameRendered", "videoPreviewModeEnabled", "checkAutoPlayEnabled", "", "drop", "handleDisplayingVideoAndPreview", "hideLoadingStateAndShowErrorState", "loadThumbnailPreviewUrl", "loadVideo", "muteVideoAudio", "currentVolume", "observeViewVisibility", "onAutoPlayDisabled", "onAutoPlayEnabled", "onBindVideo", "videoViewModels", "", "thumbnailViewModels", "Lcom/tinder/video/model/ImageViewModel;", "isTargetAttachedToWindow", "onPlayButtonClicked", "onRenderedFirstVideoFrame", "onTargetPaused", "onTargetResumed", "onThumbnailPreviewFailedLoading", "onThumbnailPreviewFinishedLoading", "onVideoClicked", "onVideoPlayerError", "onVideoPreparedAndPlayerSet", "onVideoThumbnailLoaded", "pauseVideo", "playVideo", "releasePlayerAndRemoveEventListeners", "resetVideoState", "setFullscreenModeEnabled", "fullscreenModeEnabled", "setMediaScaleType", "setUpPreviewViewAndShowLoadingState", "setVideoPreviewModeEnabled", "showVideoPreviewOnly", "setVolumeMuteControlsEnabled", "volumeMuteControlsEnabled", "shouldLoadVideo", "showVideoInFullscreen", "take", "videoTarget", "unMuteVideoAudio", "video_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.video.b.b */
public final class C15411b {
    /* renamed from: a */
    private VideoTarget f47678a = ((VideoTarget) new C17253b());
    /* renamed from: b */
    private final C17356a f47679b = new C17356a();
    /* renamed from: c */
    private boolean f47680c;
    /* renamed from: d */
    private boolean f47681d;
    /* renamed from: e */
    private String f47682e;
    /* renamed from: f */
    private MediaScaleType f47683f = MediaScaleType.SCALE_HEIGHT_TO_MAINTAIN_ASPECT_RATIO;
    /* renamed from: g */
    private C17251d f47684g;
    /* renamed from: h */
    private String f47685h;
    /* renamed from: i */
    private boolean f47686i;
    /* renamed from: j */
    private float f47687j;
    /* renamed from: k */
    private boolean f47688k = true;
    /* renamed from: l */
    private boolean f47689l;
    /* renamed from: m */
    private boolean f47690m;
    /* renamed from: n */
    private boolean f47691n;
    /* renamed from: o */
    private final ViewVisibleObserver f47692o;
    /* renamed from: p */
    private final GetAutoPlayLoopsEnabledStatus f47693p;
    /* renamed from: q */
    private final C15679f f47694q;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "enable", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.b.b$a */
    static final class C17244a<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C15411b f52856a;

        C17244a(C15411b c15411b) {
            this.f52856a = c15411b;
        }

        public /* synthetic */ void accept(Object obj) {
            m63155a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m63155a(Boolean bool) {
            C2668g.a(bool, "enable");
            if (bool.booleanValue() != null) {
                this.f52856a.m57762u();
            } else {
                this.f52856a.m57763v();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.b.b$b */
    static final class C17245b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17245b f52857a = new C17245b();

        C17245b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m63156a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63156a(Throwable th) {
            C0001a.e("Error subscribing to GetAutoPlayLoopEnabled settings", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.b.b$c */
    static final class C17246c<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C17246c f52858a = new C17246c();

        C17246c() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m63157a((Boolean) obj);
        }

        /* renamed from: a */
        public final boolean m63157a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return bool.booleanValue() ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.b.b$d */
    static final class C17247d<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C15411b f52859a;

        C17247d(C15411b c15411b) {
            this.f52859a = c15411b;
        }

        public /* synthetic */ void accept(Object obj) {
            m63158a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m63158a(Boolean bool) {
            this.f52859a.m57779e();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.b.b$e */
    static final class C17248e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17248e f52860a = new C17248e();

        C17248e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m63159a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63159a(Throwable th) {
            C0001a.c(th, "Error observing view visibility", new Object[0]);
        }
    }

    @Inject
    public C15411b(@NotNull ViewVisibleObserver viewVisibleObserver, @NotNull GetAutoPlayLoopsEnabledStatus getAutoPlayLoopsEnabledStatus, @NotNull @MainThreadScheduler C15679f c15679f) {
        C2668g.b(viewVisibleObserver, "viewVisibleObserver");
        C2668g.b(getAutoPlayLoopsEnabledStatus, "getAutoPlayLoopsEnabled");
        C2668g.b(c15679f, "mainThreadScheduler");
        this.f47692o = viewVisibleObserver;
        this.f47693p = getAutoPlayLoopsEnabledStatus;
        this.f47694q = c15679f;
    }

    /* renamed from: n */
    private final boolean m57755n() {
        return C2668g.a(this.f47682e, C15416c.m57803c(this.f47684g));
    }

    /* renamed from: a */
    public final void m57771a(@NotNull VideoTarget videoTarget) {
        C2668g.b(videoTarget, "videoTarget");
        this.f47678a = videoTarget;
        m57756o();
    }

    /* renamed from: a */
    public final void m57768a() {
        m57774b();
        this.f47678a = new C17253b();
    }

    /* renamed from: b */
    public final void m57774b() {
        m57760s();
        VideoTarget videoTarget = this.f47678a;
        videoTarget.unsubscribeFromCopyingPreviousVideoFrame();
        if (m57755n()) {
            videoTarget.showVideoPreview();
        }
        this.f47679b.m63446a();
    }

    /* renamed from: c */
    public final void m57776c() {
        m57765x();
    }

    /* renamed from: a */
    public final void m57773a(boolean z) {
        this.f47680c = z;
    }

    /* renamed from: b */
    public final void m57775b(boolean z) {
        this.f47690m = z;
    }

    /* renamed from: c */
    public final void m57777c(boolean z) {
        this.f47689l = z;
    }

    /* renamed from: a */
    public final void m57770a(@NotNull MediaScaleType mediaScaleType) {
        C2668g.b(mediaScaleType, "mediaScaleType");
        this.f47683f = mediaScaleType;
    }

    /* renamed from: a */
    public final void m57772a(@NotNull List<C17251d> list, @NotNull List<C17250a> list2, boolean z) {
        C2668g.b(list, "videoViewModels");
        C2668g.b(list2, "thumbnailViewModels");
        this.f47684g = C15416c.m57800a((List) list);
        this.f47685h = C15416c.m57804c((List) list2);
        this.f47686i = null;
        this.f47688k = true;
        if (z) {
            m57765x();
        }
    }

    /* renamed from: d */
    public final void m57778d() {
        this.f47686i = true;
        VideoTarget videoTarget = this.f47678a;
        videoTarget.setPlayWhenReadyOnPlayer(this.f47686i);
        videoTarget.hidePausedState();
    }

    /* renamed from: e */
    public final void m57779e() {
        this.f47686i = false;
        VideoTarget videoTarget = this.f47678a;
        videoTarget.setPlayWhenReadyOnPlayer(this.f47686i);
        videoTarget.showPausedState();
    }

    /* renamed from: f */
    public final void m57780f() {
        if (this.f47689l) {
            if (this.f47688k) {
                m57757p();
                this.f47678a.notifyVideoUnmuted();
            } else {
                VideoTarget videoTarget = this.f47678a;
                videoTarget.prepareForMutingAudio();
                videoTarget.notifyVideoMuted();
            }
        }
        if (this.f47690m) {
            m57758q();
        }
    }

    /* renamed from: a */
    public final void m57769a(float f) {
        this.f47688k = true;
        this.f47687j = f;
        f = this.f47678a;
        f.updatePlayerVolume(0.0f);
        f.showVolumeMutedState();
    }

    /* renamed from: g */
    public final void m57781g() {
        VideoTarget videoTarget = this.f47678a;
        if (!this.f47691n) {
            videoTarget.addVideoRendererEventListenerOnPlayer();
            videoTarget.addEventListenerOnPlayer();
            this.f47691n = true;
        }
        if (this.f47689l) {
            videoTarget.prepareForMutingAudio();
        }
        videoTarget.setPlayWhenReadyOnPlayer(this.f47686i);
    }

    /* renamed from: h */
    public final void m57782h() {
        m57759r();
        VideoTarget videoTarget = this.f47678a;
        videoTarget.hideVideoPreview();
        videoTarget.sendErrorLoadingContentEvent(C15416c.m57803c(this.f47684g));
    }

    /* renamed from: i */
    public final void m57783i() {
        this.f47682e = C15416c.m57803c(this.f47684g);
        if (this.f47680c) {
            this.f47678a.showVideoPreview();
            m57760s();
        }
    }

    /* renamed from: j */
    public final void m57784j() {
        boolean z = true;
        this.f47681d = true;
        VideoTarget videoTarget = this.f47678a;
        videoTarget.hideLoadingState();
        videoTarget.hideVideoPreview();
        if (!this.f47686i || this.f47680c) {
            videoTarget.showPausedState();
        }
        if (this.f47689l) {
            videoTarget.showVolumeControls();
        }
        if (!m57755n()) {
            CharSequence charSequence = this.f47685h;
            if (charSequence != null) {
                if (charSequence.length() != 0) {
                    z = false;
                }
            }
            if (z) {
                videoTarget.unsubscribeFromCopyingPreviousVideoFrame();
                videoTarget.showCurrentVideoFrameInPreviewView();
            }
        }
    }

    /* renamed from: k */
    public final void m57785k() {
        if (!this.f47686i) {
            m57766y();
        }
    }

    /* renamed from: l */
    public final void m57786l() {
        if (!this.f47686i) {
            VideoTarget videoTarget = this.f47678a;
            videoTarget.hideLoadingState();
            videoTarget.showPausedState();
        }
    }

    /* renamed from: m */
    public final void m57787m() {
        this.f47686i = true;
        if (this.f47681d) {
            m57778d();
        } else {
            m57766y();
        }
    }

    /* renamed from: o */
    private final void m57756o() {
        this.f47679b.add(this.f47692o.observe().filter(C17246c.f52858a).subscribe(new C17247d(this), C17248e.f52860a));
    }

    /* renamed from: p */
    private final void m57757p() {
        this.f47688k = false;
        VideoTarget videoTarget = this.f47678a;
        videoTarget.updatePlayerVolume(this.f47687j);
        videoTarget.showVolumePlayingState();
    }

    /* renamed from: q */
    private final void m57758q() {
        C17251d c17251d = this.f47684g;
        if (c17251d == null) {
            return;
        }
        if (C19296q.m68673a(C15416c.m57803c(c17251d))) {
            C0001a.d("video url is null - fullscreen mode will not be shown", new Object[0]);
        } else {
            this.f47678a.showVideoFullscreen(C15416c.m57803c(c17251d), C15416c.m57801b(c17251d));
        }
    }

    /* renamed from: r */
    private final void m57759r() {
        VideoTarget videoTarget = this.f47678a;
        videoTarget.hideLoadingState();
        videoTarget.showErrorState();
    }

    /* renamed from: s */
    private final void m57760s() {
        VideoTarget videoTarget = this.f47678a;
        videoTarget.removeEventListenerFromPlayer();
        videoTarget.removeVideoRendererEventListenerOnPlayer();
        this.f47691n = false;
        videoTarget.releasePlayer();
    }

    /* renamed from: t */
    private final void m57761t() {
        this.f47679b.add(this.f47693p.execute().subscribeOn(C15756a.m59010b()).observeOn(this.f47694q).subscribe(new C17244a(this), C17245b.f52857a));
    }

    /* renamed from: u */
    private final void m57762u() {
        this.f47686i = true;
        m57766y();
    }

    /* renamed from: v */
    private final void m57763v() {
        VideoTarget videoTarget = this.f47678a;
        videoTarget.hideLoadingState();
        videoTarget.showVideoPreview();
        videoTarget.setPlayButtonClickListener();
    }

    /* renamed from: w */
    private final void m57764w() {
        this.f47686i = false;
        this.f47681d = false;
    }

    /* renamed from: x */
    private final void m57765x() {
        m57764w();
        this.f47678a.showVideoPreview();
        m57751A();
        m57761t();
    }

    /* renamed from: y */
    private final void m57766y() {
        int i = 0;
        if (C19296q.m68673a(C15416c.m57803c(this.f47684g))) {
            C0001a.d("error attempting to load video with invalid url", new Object[0]);
            this.f47678a.showErrorState();
        } else if (m57767z()) {
            VideoTarget videoTarget = this.f47678a;
            int n = m57755n() ^ 1;
            CharSequence charSequence = this.f47685h;
            if (charSequence == null || charSequence.length() == 0) {
                i = 1;
            }
            if ((i & n) != 0) {
                videoTarget.clearCurrentVideoFrameInPreviewView();
            }
            videoTarget.showLoadingState();
            if (this.f47683f == MediaScaleType.CENTER_CROP) {
                C17251d c17251d = this.f47684g;
                if (c17251d == null) {
                    C2668g.a();
                }
                float a = (float) c17251d.m63164a();
                C17251d c17251d2 = this.f47684g;
                if (c17251d2 == null) {
                    C2668g.a();
                }
                videoTarget.applyCenterCropTransformationToPlayerView(a, (float) c17251d2.m63165b());
            }
            videoTarget.animateVideoLoadingIndicator();
            if (this.f47689l) {
                videoTarget.hideVolumeControls();
            }
            videoTarget.hidePausedState();
            videoTarget.showVideoPlayerView();
            videoTarget.prepareVideo(C15416c.m57803c(this.f47684g), true);
        }
    }

    /* renamed from: z */
    private final boolean m57767z() {
        if (this.f47680c) {
            if (m57755n()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    private final void m57751A() {
        m57752B();
        this.f47678a.loadHighResThumbnailImagePreview(this.f47685h);
    }

    /* renamed from: B */
    private final void m57752B() {
        VideoTarget videoTarget = this.f47678a;
        if (this.f47683f == MediaScaleType.SCALE_HEIGHT_TO_MAINTAIN_ASPECT_RATIO) {
            videoTarget.applyAspectRatioHeightScalingToMediaViews(C15416c.m57799a(this.f47684g));
        }
        videoTarget.showLoadingState();
    }
}
