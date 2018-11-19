package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import com.tinder.data.model.activityfeed.ActivityFeedCommentModel.Select_activity_feed_item_commentsCreator;
import com.tinder.data.model.activityfeed.ActivityFeedCommentModel.Select_activity_feed_item_commentsModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.t */
final class C10826t implements Select_activity_feed_item_commentsCreator {
    /* renamed from: a */
    private final /* synthetic */ Function4 f35406a;

    C10826t(Function4 function4) {
        this.f35406a = function4;
    }

    public final /* synthetic */ T create(@NotNull @NonNull String str, long j, @NotNull @NonNull String str2, @NotNull @NonNull String str3) {
        C2668g.b(str, "activity_feed_item_id");
        C2668g.b(str2, "message");
        C2668g.b(str3, "metadata_carousel_item_id");
        return (Select_activity_feed_item_commentsModel) this.f35406a.invoke(str, Long.valueOf(j), str2, str3);
    }
}
