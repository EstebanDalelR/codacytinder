package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.InstagramConnectModel.Select_instagram_connectCreator;
import com.tinder.data.model.activityfeed.InstagramConnectModel.Select_instagram_connectModel;
import com.tinder.domain.feed.ActivityFeedPhoto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class al implements Select_instagram_connectCreator {
    /* renamed from: a */
    private final /* synthetic */ Function4 f35283a;

    al(Function4 function4) {
        this.f35283a = function4;
    }

    public final /* synthetic */ T create(long j, long j2, @NotNull @NonNull String str, @Nullable @org.jetbrains.annotations.Nullable List<ActivityFeedPhoto> list) {
        C2668g.b(str, "instagram_user_name");
        return (Select_instagram_connectModel) this.f35283a.invoke(Long.valueOf(j), Long.valueOf(j2), str, list);
    }
}
