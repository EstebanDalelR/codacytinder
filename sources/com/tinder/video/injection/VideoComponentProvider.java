package com.tinder.video.injection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/video/injection/VideoComponentProvider;", "", "provideVideoComponent", "Lcom/tinder/video/injection/VideoComponent;", "video_release"}, k = 1, mv = {1, 1, 10})
public interface VideoComponentProvider {
    @NotNull
    VideoComponent provideVideoComponent();
}
