package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ProfileChangeAnthemModel.Select_profile_change_anthemCreator;
import com.tinder.data.model.activityfeed.ProfileChangeAnthemModel.Select_profile_change_anthemModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class bi implements Select_profile_change_anthemCreator {
    /* renamed from: a */
    private final /* synthetic */ Function2 f35335a;

    bi(Function2 function2) {
        this.f35335a = function2;
    }

    public final /* synthetic */ T create(long j, long j2) {
        return (Select_profile_change_anthemModel) this.f35335a.invoke(Long.valueOf(j), Long.valueOf(j2));
    }
}
