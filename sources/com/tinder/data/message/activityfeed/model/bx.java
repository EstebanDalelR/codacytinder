package com.tinder.data.message.activityfeed.model;

import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.ProfileChangeWorkModel.Select_profile_change_workCreator;
import com.tinder.data.model.activityfeed.ProfileChangeWorkModel.Select_profile_change_workModel;
import com.tinder.domain.feed.ActivityFeedJob;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class bx implements Select_profile_change_workCreator {
    /* renamed from: a */
    private final /* synthetic */ Function3 f35367a;

    bx(Function3 function3) {
        this.f35367a = function3;
    }

    public final /* synthetic */ T create(long j, long j2, @Nullable @org.jetbrains.annotations.Nullable List<ActivityFeedJob> list) {
        return (Select_profile_change_workModel) this.f35367a.invoke(Long.valueOf(j), Long.valueOf(j2), list);
    }
}
