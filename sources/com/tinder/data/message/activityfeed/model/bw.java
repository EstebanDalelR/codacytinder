package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.ProfileChangeWorkModel;
import com.tinder.data.model.activityfeed.ProfileChangeWorkModel.Creator;
import com.tinder.domain.feed.ActivityFeedJob;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class bw implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function5 f35366a;

    bw(Function5 function5) {
        this.f35366a = function5;
    }

    public final /* synthetic */ T create(long j, @NotNull @NonNull String str, long j2, long j3, @Nullable @org.jetbrains.annotations.Nullable List<ActivityFeedJob> list) {
        C2668g.b(str, "activity_feed_item_id");
        return (ProfileChangeWorkModel) this.f35366a.invoke(Long.valueOf(j), str, Long.valueOf(j2), Long.valueOf(j3), list);
    }
}
