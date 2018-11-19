package com.tinder.video.activities;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Surface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Player.C3585a;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.analytics.AnalyticsListener.C2009a;
import com.google.android.exoplayer2.analytics.C3588b;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.PlayerView;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.video.C15407a.C15397d;
import com.tinder.video.C15407a.C15398e;
import com.tinder.video.C15407a.C15399f;
import com.tinder.video.injection.VideoComponentProvider;
import com.tinder.video.p445b.C15410a;
import com.tinder.video.p446c.C15412a;
import com.tinder.video.target.FullscreenVideoTarget;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 72\u00020\u00012\u00020\u0002:\u0003789B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u0012\u0010 \u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u0019H\u0014J\b\u0010$\u001a\u00020\u0019H\u0014J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0019H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0019H\u0016J\b\u0010.\u001a\u00020\u0019H\u0002J\b\u0010/\u001a\u00020\u0019H\u0016J\b\u00100\u001a\u00020\u0019H\u0016J\b\u00101\u001a\u00020\u0019H\u0016J\b\u00102\u001a\u00020\u0019H\u0002J\b\u00103\u001a\u00020\u0019H\u0016J\u0010\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u000206H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00060\u0011R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/tinder/video/activities/FullscreenVideoActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/tinder/video/target/FullscreenVideoTarget;", "()V", "exoPlayerProvider", "Lcom/tinder/video/provider/ExoPlayerProvider;", "getExoPlayerProvider$video_release", "()Lcom/tinder/video/provider/ExoPlayerProvider;", "setExoPlayerProvider$video_release", "(Lcom/tinder/video/provider/ExoPlayerProvider;)V", "fullscreenVideoPresenter", "Lcom/tinder/video/presenter/FullscreenVideoPresenter;", "getFullscreenVideoPresenter$video_release", "()Lcom/tinder/video/presenter/FullscreenVideoPresenter;", "setFullscreenVideoPresenter$video_release", "(Lcom/tinder/video/presenter/FullscreenVideoPresenter;)V", "playerStateChangedListener", "Lcom/tinder/video/activities/FullscreenVideoActivity$FullscreenVideoPlayerStateChangeListener;", "videoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "getVideoPlayer", "()Lcom/google/android/exoplayer2/SimpleExoPlayer;", "videoRendererEventListener", "Lcom/tinder/video/activities/FullscreenVideoActivity$FullscreenVideoRendererEventListener;", "allowScreenToSleep", "", "clearEventListenerFromPlayer", "clearVideoRendererEventListenerOnPlayer", "disableVideoControls", "enableVideoControls", "hideLoadingState", "keepScreenOnIndefinitely", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "prepareVideo", "videoUrl", "", "releasePlayer", "setEventListenerOnPlayer", "setPlayWhenReadyOnPlayer", "playWhenReady", "", "setVideoRendererEventListenerOnPlayer", "setupDagger", "showErrorSnackbar", "showErrorState", "showLoadingState", "showVideo", "stopAtStartOfVideo", "updatePlayerViewHeight", "widthHeightVideoAspectRatio", "", "Companion", "FullscreenVideoPlayerStateChangeListener", "FullscreenVideoRendererEventListener", "video_release"}, k = 1, mv = {1, 1, 10})
public final class FullscreenVideoActivity extends AppCompatActivity implements FullscreenVideoTarget {
    /* renamed from: c */
    public static final C15408a f59943c = new C15408a();
    @Inject
    @NotNull
    /* renamed from: a */
    public C15410a f59944a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C15412a f59945b;
    /* renamed from: d */
    private final C18289c f59946d = new C18289c(this);
    /* renamed from: e */
    private final C18288b f59947e = new C18288b(this);
    /* renamed from: f */
    private HashMap f59948f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/video/activities/FullscreenVideoActivity$Companion;", "", "()V", "EXTRA_VIDEO_ASPECT_RATIO", "", "EXTRA_VIDEO_HIGH_RES_URL", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "videoHighResUrl", "videoAspectRatio", "", "video_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.activities.FullscreenVideoActivity$a */
    public static final class C15408a {
        private C15408a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final Intent m57740a(@NotNull Context context, @NotNull String str, float f) {
            C2668g.b(context, "context");
            C2668g.b(str, "videoHighResUrl");
            Intent intent = new Intent(context, FullscreenVideoActivity.class);
            intent.putExtra("video_high_res_url", str);
            intent.putExtra("video_aspect_ratio", f);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.activities.FullscreenVideoActivity$d */
    static final class C15409d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ FullscreenVideoActivity f47676a;

        C15409d(FullscreenVideoActivity fullscreenVideoActivity) {
            this.f47676a = fullscreenVideoActivity;
        }

        public final void onClick(View view) {
            this.f47676a.m68616d();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/tinder/video/activities/FullscreenVideoActivity$FullscreenVideoPlayerStateChangeListener;", "Lcom/google/android/exoplayer2/Player$DefaultEventListener;", "(Lcom/tinder/video/activities/FullscreenVideoActivity;)V", "onPlayerError", "", "error", "Lcom/google/android/exoplayer2/ExoPlaybackException;", "onPlayerStateChanged", "playWhenReady", "", "playbackState", "", "video_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.activities.FullscreenVideoActivity$b */
    private final class C18288b extends C3585a {
        /* renamed from: a */
        final /* synthetic */ FullscreenVideoActivity f56629a;

        public C18288b(FullscreenVideoActivity fullscreenVideoActivity) {
            this.f56629a = fullscreenVideoActivity;
        }

        public void onPlayerStateChanged(boolean z, int i) {
            if (z) {
                switch (i) {
                    case 3:
                        this.f56629a.m68618a().m57746d();
                        return;
                    case 4:
                        this.f56629a.m68618a().m57748f();
                        return;
                    default:
                        return;
                }
            }
            this.f56629a.m68618a().m57747e();
        }

        public void onPlayerError(@Nullable ExoPlaybackException exoPlaybackException) {
            C0001a.b(exoPlaybackException, "Error playing Activity Feed video", new Object[0]);
            this.f56629a.m68618a().m57749g();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/video/activities/FullscreenVideoActivity$FullscreenVideoRendererEventListener;", "Lcom/google/android/exoplayer2/analytics/DefaultAnalyticsListener;", "(Lcom/tinder/video/activities/FullscreenVideoActivity;)V", "onRenderedFirstFrame", "", "eventTime", "Lcom/google/android/exoplayer2/analytics/AnalyticsListener$EventTime;", "surface", "Landroid/view/Surface;", "video_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.video.activities.FullscreenVideoActivity$c */
    private final class C18289c extends C3588b {
        /* renamed from: a */
        final /* synthetic */ FullscreenVideoActivity f56630a;

        public C18289c(FullscreenVideoActivity fullscreenVideoActivity) {
            this.f56630a = fullscreenVideoActivity;
        }

        public void onRenderedFirstFrame(@NotNull C2009a c2009a, @NotNull Surface surface) {
            C2668g.b(c2009a, "eventTime");
            C2668g.b(surface, "surface");
            this.f56630a.m68618a().m57750h();
        }
    }

    /* renamed from: a */
    public View m68617a(int i) {
        if (this.f59948f == null) {
            this.f59948f = new HashMap();
        }
        View view = (View) this.f59948f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f59948f.put(Integer.valueOf(i), view);
        return view;
    }

    @NotNull
    /* renamed from: a */
    public final C15410a m68618a() {
        C15410a c15410a = this.f59944a;
        if (c15410a == null) {
            C2668g.b("fullscreenVideoPresenter");
        }
        return c15410a;
    }

    /* renamed from: b */
    private final SimpleExoPlayer m68614b() {
        PlayerView playerView = (PlayerView) m68617a(C15397d.videoPlayerView);
        C2668g.a(playerView, "videoPlayerView");
        Player player = playerView.getPlayer();
        if (player != null) {
            return (SimpleExoPlayer) player;
        }
        throw new IllegalStateException("Video player not initialized".toString());
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        m68615c();
        setContentView(C15398e.activity_fullscreen_video);
    }

    /* renamed from: c */
    private final void m68615c() {
        Application application = getApplication();
        if (application == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.video.injection.VideoComponentProvider");
        }
        ((VideoComponentProvider) application).provideVideoComponent().inject(this);
    }

    protected void onResume() {
        super.onResume();
        C15410a c15410a = this.f59944a;
        if (c15410a == null) {
            C2668g.b("fullscreenVideoPresenter");
        }
        c15410a.m57742a(this);
        m68616d();
    }

    protected void onPause() {
        super.onPause();
        C15410a c15410a = this.f59944a;
        if (c15410a == null) {
            C2668g.b("fullscreenVideoPresenter");
        }
        c15410a.m57741a();
    }

    /* renamed from: d */
    private final void m68616d() {
        if (getIntent() != null) {
            Intent intent = getIntent();
            float floatExtra = intent.getFloatExtra("video_aspect_ratio", 1.0f);
            String stringExtra = intent.getStringExtra("video_high_res_url");
            C15410a c15410a = this.f59944a;
            if (c15410a == null) {
                C2668g.b("fullscreenVideoPresenter");
            }
            C2668g.a(stringExtra, "videoUrl");
            c15410a.m57743a(stringExtra, floatExtra);
            return;
        }
        C0001a.e("error launching fullscreen video, activity intent is null", new Object[0]);
        finish();
    }

    public void updatePlayerViewHeight(float f) {
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) m68617a(C15397d.exo_content_frame);
        aspectRatioFrameLayout.setResizeMode(1);
        aspectRatioFrameLayout.setAspectRatio(f);
    }

    public void releasePlayer() {
        PlayerView playerView = (PlayerView) m68617a(C15397d.videoPlayerView);
        Player player = playerView.getPlayer();
        if (player != null) {
            player.release();
        }
        playerView.setPlayer((Player) null);
    }

    public void stopAtStartOfVideo() {
        SimpleExoPlayer b = m68614b();
        b.seekTo(0);
        b.setPlayWhenReady(false);
    }

    public void keepScreenOnIndefinitely() {
        getWindow().addFlags(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    }

    public void allowScreenToSleep() {
        getWindow().clearFlags(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    }

    public void clearEventListenerFromPlayer() {
        m68614b().removeListener(this.f59947e);
    }

    public void setEventListenerOnPlayer() {
        m68614b().addListener(this.f59947e);
    }

    public void setPlayWhenReadyOnPlayer(boolean z) {
        m68614b().setPlayWhenReady(z);
    }

    public void prepareVideo(@NotNull String str) {
        C2668g.b(str, "videoUrl");
        C15412a c15412a = this.f59945b;
        if (c15412a == null) {
            C2668g.b("exoPlayerProvider");
        }
        SimpleExoPlayer a = c15412a.m57789a();
        C15412a c15412a2 = this.f59945b;
        if (c15412a2 == null) {
            C2668g.b("exoPlayerProvider");
        }
        C15412a.m57788a(c15412a2, a, str, false, 4, null);
        PlayerView playerView = (PlayerView) m68617a(C15397d.videoPlayerView);
        C2668g.a(playerView, "videoPlayerView");
        playerView.setPlayer(a);
        str = this.f59944a;
        if (str == null) {
            C2668g.b("fullscreenVideoPresenter");
        }
        str.m57745c();
    }

    public void showErrorState() {
        View a = m68617a(C15397d.videoLoadingStateShutterView);
        C2668g.a(a, "videoLoadingStateShutterView");
        a.setVisibility(0);
        a = m68617a(C15397d.videoErrorStateImageView);
        C2668g.a(a, "videoErrorStateImageView");
        a.setVisibility(0);
        TextView textView = (TextView) m68617a(C15397d.videoErrorStateTextView);
        C2668g.a(textView, "videoErrorStateTextView");
        textView.setVisibility(0);
    }

    public void showErrorSnackbar() {
        Snackbar.a((PlayerView) m68617a(C15397d.videoPlayerView), C15399f.error_loading_video_message, 0).a(C15399f.retry, new C15409d(this)).b();
    }

    public void showLoadingState() {
        View a = m68617a(C15397d.videoLoadingStateShutterView);
        C2668g.a(a, "videoLoadingStateShutterView");
        a.setVisibility(0);
        a = m68617a(C15397d.videoErrorStateImageView);
        C2668g.a(a, "videoErrorStateImageView");
        a.setVisibility(8);
        TextView textView = (TextView) m68617a(C15397d.videoErrorStateTextView);
        C2668g.a(textView, "videoErrorStateTextView");
        textView.setVisibility(8);
        ProgressBar progressBar = (ProgressBar) m68617a(C15397d.videoProgressLoaderView);
        C2668g.a(progressBar, "videoProgressLoaderView");
        progressBar.setVisibility(0);
    }

    public void hideLoadingState() {
        View a = m68617a(C15397d.videoLoadingStateShutterView);
        C2668g.a(a, "videoLoadingStateShutterView");
        a.setVisibility(8);
        ProgressBar progressBar = (ProgressBar) m68617a(C15397d.videoProgressLoaderView);
        C2668g.a(progressBar, "videoProgressLoaderView");
        progressBar.setVisibility(8);
    }

    public void enableVideoControls() {
        PlayerView playerView = (PlayerView) m68617a(C15397d.videoPlayerView);
        C2668g.a(playerView, "videoPlayerView");
        playerView.setUseController(true);
    }

    public void disableVideoControls() {
        PlayerView playerView = (PlayerView) m68617a(C15397d.videoPlayerView);
        C2668g.a(playerView, "videoPlayerView");
        playerView.setUseController(false);
    }

    public void setVideoRendererEventListenerOnPlayer() {
        m68614b().a(this.f59946d);
    }

    public void clearVideoRendererEventListenerOnPlayer() {
        m68614b().a(this.f59946d);
    }
}
