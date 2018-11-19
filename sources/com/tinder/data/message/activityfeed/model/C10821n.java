package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.ActivityFeedArtistModel;
import com.tinder.data.model.activityfeed.ActivityFeedArtistModel.Creator;
import com.tinder.domain.feed.ActivityFeedImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.n */
final class C10821n implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function5 f35394a;

    C10821n(Function5 function5) {
        this.f35394a = function5;
    }

    public final /* synthetic */ T create(@NotNull @NonNull String str, @NotNull @NonNull String str2, @NotNull @NonNull String str3, @NotNull @NonNull String str4, @Nullable @org.jetbrains.annotations.Nullable List<ActivityFeedImage> list) {
        C2668g.b(str, "id");
        C2668g.b(str2, "activity_feed_item_id");
        C2668g.b(str3, "activity_feed_song_id");
        C2668g.b(str4, "name");
        return (ActivityFeedArtistModel) this.f35394a.invoke(str, str2, str3, str4, list);
    }
}
