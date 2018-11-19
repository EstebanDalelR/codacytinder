package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.common.ProcessedVideo;
import com.tinder.domain.common.model.Photo.Video;
import java8.util.Objects;

public class ad extends C2646o<Video, ProcessedVideo> {
    @Nullable
    /* renamed from: a */
    public Video m43080a(@NonNull ProcessedVideo processedVideo) {
        String str = (String) Objects.b(processedVideo.url(), "");
        if (str.isEmpty()) {
            return null;
        }
        return Video.builder().url(str).width(((Integer) Objects.b(processedVideo.width(), Integer.valueOf(0))).intValue()).height(((Integer) Objects.b(processedVideo.height(), Integer.valueOf(0))).intValue()).build();
    }
}
