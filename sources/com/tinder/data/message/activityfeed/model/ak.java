package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.InstagramConnectModel;
import com.tinder.data.model.activityfeed.InstagramConnectModel.Creator;
import com.tinder.domain.feed.ActivityFeedPhoto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class ak implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function6 f35282a;

    ak(Function6 function6) {
        this.f35282a = function6;
    }

    public final /* synthetic */ T create(long j, @NotNull @NonNull String str, long j2, long j3, @NotNull @NonNull String str2, @Nullable @org.jetbrains.annotations.Nullable List<ActivityFeedPhoto> list) {
        String str3 = str;
        C2668g.b(str3, "activity_feed_item_id");
        String str4 = str2;
        C2668g.b(str4, "instagram_user_name");
        return (InstagramConnectModel) this.f35282a.invoke(Long.valueOf(j), str3, Long.valueOf(j2), Long.valueOf(j3), str4, list);
    }
}
