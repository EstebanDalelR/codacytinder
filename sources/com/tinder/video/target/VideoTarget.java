package com.tinder.video.target;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0013H&J\b\u0010 \u001a\u00020\u0003H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001aH&J\b\u0010#\u001a\u00020\u0003H&J\b\u0010$\u001a\u00020\u0003H&J\b\u0010%\u001a\u00020\u0003H&J\b\u0010&\u001a\u00020\u0003H&J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\bH&J\b\u0010)\u001a\u00020\u0003H&J\b\u0010*\u001a\u00020\u0003H&J\b\u0010+\u001a\u00020\u0003H&J\b\u0010,\u001a\u00020\u0003H&J\b\u0010-\u001a\u00020\u0003H&J\b\u0010.\u001a\u00020\u0003H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\bH&¨\u00061"}, d2 = {"Lcom/tinder/video/target/VideoTarget;", "", "addEventListenerOnPlayer", "", "addVideoRendererEventListenerOnPlayer", "animateVideoLoadingIndicator", "applyAspectRatioHeightScalingToMediaViews", "heightWidthVideoAspectRatio", "", "applyCenterCropTransformationToPlayerView", "videoWidth", "videoHeight", "clearCurrentVideoFrameInPreviewView", "hideLoadingState", "hidePausedState", "hideVideoPreview", "hideVolumeControls", "loadHighResThumbnailImagePreview", "highResThumbnailUrl", "", "notifyVideoMuted", "notifyVideoUnmuted", "prepareForMutingAudio", "prepareVideo", "videoUrl", "loopVideo", "", "releasePlayer", "removeEventListenerFromPlayer", "removeVideoRendererEventListenerOnPlayer", "sendErrorLoadingContentEvent", "mediaUrl", "setPlayButtonClickListener", "setPlayWhenReadyOnPlayer", "value", "showCurrentVideoFrameInPreviewView", "showErrorState", "showLoadingState", "showPausedState", "showVideoFullscreen", "widthHeightVideoAspectRatio", "showVideoPlayerView", "showVideoPreview", "showVolumeControls", "showVolumeMutedState", "showVolumePlayingState", "unsubscribeFromCopyingPreviousVideoFrame", "updatePlayerVolume", "volume", "video_release"}, k = 1, mv = {1, 1, 10})
public interface VideoTarget {
    void addEventListenerOnPlayer();

    void addVideoRendererEventListenerOnPlayer();

    void animateVideoLoadingIndicator();

    void applyAspectRatioHeightScalingToMediaViews(float f);

    void applyCenterCropTransformationToPlayerView(float f, float f2);

    void clearCurrentVideoFrameInPreviewView();

    void hideLoadingState();

    void hidePausedState();

    void hideVideoPreview();

    void hideVolumeControls();

    void loadHighResThumbnailImagePreview(@Nullable String str);

    void notifyVideoMuted();

    void notifyVideoUnmuted();

    void prepareForMutingAudio();

    void prepareVideo(@NotNull String str, boolean z);

    void releasePlayer();

    void removeEventListenerFromPlayer();

    void removeVideoRendererEventListenerOnPlayer();

    void sendErrorLoadingContentEvent(@NotNull String str);

    void setPlayButtonClickListener();

    void setPlayWhenReadyOnPlayer(boolean z);

    void showCurrentVideoFrameInPreviewView();

    void showErrorState();

    void showLoadingState();

    void showPausedState();

    void showVideoFullscreen(@NotNull String str, float f);

    void showVideoPlayerView();

    void showVideoPreview();

    void showVolumeControls();

    void showVolumeMutedState();

    void showVolumePlayingState();

    void unsubscribeFromCopyingPreviousVideoFrame();

    void updatePlayerVolume(float f);
}
