package com.tinder.profile.adapters;

import com.tinder.domain.common.model.Photo.Video;
import com.tinder.model.ProcessedVideo;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/profile/adapters/LegacyProcessedVideoAdapter;", "", "()V", "fromVideo", "Lcom/tinder/model/ProcessedVideo;", "video", "Lcom/tinder/domain/common/model/Photo$Video;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.adapters.g */
public final class C14365g {
    @NotNull
    /* renamed from: a */
    public final ProcessedVideo m54714a(@NotNull Video video) {
        C2668g.b(video, "video");
        String url = video.url();
        C2668g.a(url, "video.url()");
        return new ProcessedVideo(url, video.width(), video.height());
    }
}
