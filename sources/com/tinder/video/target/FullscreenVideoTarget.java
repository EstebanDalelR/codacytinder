package com.tinder.video.target;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001a"}, d2 = {"Lcom/tinder/video/target/FullscreenVideoTarget;", "", "allowScreenToSleep", "", "clearEventListenerFromPlayer", "clearVideoRendererEventListenerOnPlayer", "disableVideoControls", "enableVideoControls", "hideLoadingState", "keepScreenOnIndefinitely", "prepareVideo", "videoUrl", "", "releasePlayer", "setEventListenerOnPlayer", "setPlayWhenReadyOnPlayer", "playWhenReady", "", "setVideoRendererEventListenerOnPlayer", "showErrorSnackbar", "showErrorState", "showLoadingState", "stopAtStartOfVideo", "updatePlayerViewHeight", "widthHeightVideoAspectRatio", "", "video_release"}, k = 1, mv = {1, 1, 10})
public interface FullscreenVideoTarget {
    void allowScreenToSleep();

    void clearEventListenerFromPlayer();

    void clearVideoRendererEventListenerOnPlayer();

    void disableVideoControls();

    void enableVideoControls();

    void hideLoadingState();

    void keepScreenOnIndefinitely();

    void prepareVideo(@NotNull String str);

    void releasePlayer();

    void setEventListenerOnPlayer();

    void setPlayWhenReadyOnPlayer(boolean z);

    void setVideoRendererEventListenerOnPlayer();

    void showErrorSnackbar();

    void showErrorState();

    void showLoadingState();

    void stopAtStartOfVideo();

    void updatePlayerViewHeight(float f);
}
