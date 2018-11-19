package com.tinder.data.message.activityfeed.model;

import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.ProfileChangeSchoolModel.Select_profile_change_schoolCreator;
import com.tinder.data.model.activityfeed.ProfileChangeSchoolModel.Select_profile_change_schoolModel;
import com.tinder.domain.feed.ActivityFeedSchool;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class bs implements Select_profile_change_schoolCreator {
    /* renamed from: a */
    private final /* synthetic */ Function3 f35357a;

    bs(Function3 function3) {
        this.f35357a = function3;
    }

    public final /* synthetic */ T create(long j, long j2, @Nullable @org.jetbrains.annotations.Nullable List<ActivityFeedSchool> list) {
        return (Select_profile_change_schoolModel) this.f35357a.invoke(Long.valueOf(j), Long.valueOf(j2), list);
    }
}
