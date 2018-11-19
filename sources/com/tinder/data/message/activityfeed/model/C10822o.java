package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.ActivityFeedArtistModel.Select_activity_feed_artistCreator;
import com.tinder.data.model.activityfeed.ActivityFeedArtistModel.Select_activity_feed_artistModel;
import com.tinder.domain.feed.ActivityFeedImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.o */
final class C10822o implements Select_activity_feed_artistCreator {
    /* renamed from: a */
    private final /* synthetic */ Function3 f35395a;

    C10822o(Function3 function3) {
        this.f35395a = function3;
    }

    public final /* synthetic */ T create(@NotNull @NonNull String str, @NotNull @NonNull String str2, @Nullable @org.jetbrains.annotations.Nullable List<ActivityFeedImage> list) {
        C2668g.b(str, "id");
        C2668g.b(str2, "name");
        return (Select_activity_feed_artistModel) this.f35395a.invoke(str, str2, list);
    }
}
