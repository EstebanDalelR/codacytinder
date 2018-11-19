package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import com.tinder.data.model.activityfeed.ActivityFeedCommentModel;
import com.tinder.data.model.activityfeed.ActivityFeedCommentModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.s */
final class C10825s implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function5 f35405a;

    C10825s(Function5 function5) {
        this.f35405a = function5;
    }

    public final /* synthetic */ T create(long j, @NotNull @NonNull String str, long j2, @NotNull @NonNull String str2, @NotNull @NonNull String str3) {
        C2668g.b(str, "activity_feed_item_id");
        C2668g.b(str2, "message");
        C2668g.b(str3, "metadata_carousel_item_id");
        return (ActivityFeedCommentModel) this.f35405a.invoke(Long.valueOf(j), str, Long.valueOf(j2), str2, str3);
    }
}
