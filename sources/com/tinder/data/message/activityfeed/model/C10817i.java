package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel;
import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel.Creator;
import com.tinder.domain.feed.ActivityFeedImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.i */
final class C10817i implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function4 f35384a;

    C10817i(Function4 function4) {
        this.f35384a = function4;
    }

    public final /* synthetic */ T create(@NotNull @NonNull String str, @NotNull @NonNull String str2, @NotNull @NonNull String str3, @Nullable @org.jetbrains.annotations.Nullable List<ActivityFeedImage> list) {
        C2668g.b(str, "activity_feed_item_id");
        C2668g.b(str2, "activity_feed_song_id");
        C2668g.b(str3, "name");
        return (ActivityFeedAlbumModel) this.f35384a.invoke(str, str2, str3, list);
    }
}
