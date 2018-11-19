package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel.Select_activity_feed_albumCreator;
import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel.Select_activity_feed_albumModel;
import com.tinder.domain.feed.ActivityFeedImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.j */
final class C10818j implements Select_activity_feed_albumCreator {
    /* renamed from: a */
    private final /* synthetic */ Function2 f35385a;

    C10818j(Function2 function2) {
        this.f35385a = function2;
    }

    public final /* synthetic */ T create(@NotNull @NonNull String str, @Nullable @org.jetbrains.annotations.Nullable List<ActivityFeedImage> list) {
        C2668g.b(str, "name");
        return (Select_activity_feed_albumModel) this.f35385a.invoke(str, list);
    }
}
