package com.tinder.video.p445b;

import com.tinder.video.target.C17252a;
import com.tinder.video.target.FullscreenVideoTarget;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/video/presenter/FullscreenVideoPresenter;", "", "()V", "target", "Lcom/tinder/video/target/FullscreenVideoTarget;", "drop", "", "hideVideo", "onRenderedFirstVideoFrame", "onVideoFinishedPlaying", "onVideoPausedPlaying", "onVideoPlayerError", "onVideoPreparedAndPlayerSet", "onVideoStartedPlaying", "showVideo", "videoUrl", "", "widthHeightVideoAspectRatio", "", "take", "fullscreenVideoTarget", "video_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.video.b.a */
public final class C15410a {
    /* renamed from: a */
    private FullscreenVideoTarget f47677a = new C17252a();

    /* renamed from: a */
    public final void m57742a(@NotNull FullscreenVideoTarget fullscreenVideoTarget) {
        C2668g.b(fullscreenVideoTarget, "fullscreenVideoTarget");
        this.f47677a = fullscreenVideoTarget;
    }

    /* renamed from: a */
    public final void m57741a() {
        m57744b();
        this.f47677a = new C17252a();
    }

    /* renamed from: b */
    public final void m57744b() {
        FullscreenVideoTarget fullscreenVideoTarget = this.f47677a;
        fullscreenVideoTarget.clearEventListenerFromPlayer();
        fullscreenVideoTarget.clearVideoRendererEventListenerOnPlayer();
        fullscreenVideoTarget.releasePlayer();
    }

    /* renamed from: a */
    public final void m57743a(@NotNull String str, float f) {
        C2668g.b(str, "videoUrl");
        if (C19296q.m68673a(str)) {
            f = new StringBuilder();
            f.append("error attempting to load video with invalid url: \"");
            f.append(str);
            f.append('\"');
            C0001a.d(f.toString(), new Object[0]);
            this.f47677a.showErrorState();
            return;
        }
        FullscreenVideoTarget fullscreenVideoTarget = this.f47677a;
        fullscreenVideoTarget.disableVideoControls();
        fullscreenVideoTarget.updatePlayerViewHeight(f);
        fullscreenVideoTarget.showLoadingState();
        fullscreenVideoTarget.prepareVideo(str);
    }

    /* renamed from: c */
    public final void m57745c() {
        FullscreenVideoTarget fullscreenVideoTarget = this.f47677a;
        fullscreenVideoTarget.setPlayWhenReadyOnPlayer(true);
        fullscreenVideoTarget.setEventListenerOnPlayer();
        fullscreenVideoTarget.setVideoRendererEventListenerOnPlayer();
    }

    /* renamed from: d */
    public final void m57746d() {
        this.f47677a.keepScreenOnIndefinitely();
    }

    /* renamed from: e */
    public final void m57747e() {
        this.f47677a.allowScreenToSleep();
    }

    /* renamed from: f */
    public final void m57748f() {
        FullscreenVideoTarget fullscreenVideoTarget = this.f47677a;
        fullscreenVideoTarget.stopAtStartOfVideo();
        fullscreenVideoTarget.allowScreenToSleep();
    }

    /* renamed from: g */
    public final void m57749g() {
        FullscreenVideoTarget fullscreenVideoTarget = this.f47677a;
        fullscreenVideoTarget.hideLoadingState();
        fullscreenVideoTarget.showErrorState();
        fullscreenVideoTarget.showErrorSnackbar();
    }

    /* renamed from: h */
    public final void m57750h() {
        FullscreenVideoTarget fullscreenVideoTarget = this.f47677a;
        fullscreenVideoTarget.hideLoadingState();
        fullscreenVideoTarget.enableVideoControls();
    }
}
