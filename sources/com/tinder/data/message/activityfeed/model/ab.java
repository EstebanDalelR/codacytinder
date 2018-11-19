package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import com.tinder.data.model.activityfeed.ActivityFeedItemUserInfoModel;
import com.tinder.data.model.activityfeed.ActivityFeedItemUserInfoModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class ab implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function3 f35262a;

    ab(Function3 function3) {
        this.f35262a = function3;
    }

    public final /* synthetic */ T create(long j, @NotNull @NonNull String str, @NotNull @NonNull String str2) {
        C2668g.b(str, "activity_feed_item_id");
        C2668g.b(str2, "user_id");
        return (ActivityFeedItemUserInfoModel) this.f35262a.invoke(Long.valueOf(j), str, str2);
    }
}
