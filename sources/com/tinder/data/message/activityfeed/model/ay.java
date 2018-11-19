package com.tinder.data.message.activityfeed.model;

import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.ProfileAddLoopModel.Select_profile_add_loopCreator;
import com.tinder.data.model.activityfeed.ProfileAddLoopModel.Select_profile_add_loopModel;
import com.tinder.domain.feed.ActivityFeedLoop;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class ay implements Select_profile_add_loopCreator {
    /* renamed from: a */
    private final /* synthetic */ Function3 f35314a;

    ay(Function3 function3) {
        this.f35314a = function3;
    }

    public final /* synthetic */ T create(long j, long j2, @Nullable @org.jetbrains.annotations.Nullable List<ActivityFeedLoop> list) {
        return (Select_profile_add_loopModel) this.f35314a.invoke(Long.valueOf(j), Long.valueOf(j2), list);
    }
}
