package com.tinder.data.message.activityfeed.model;

import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.ProfileAddPhotoModel.Select_profile_add_photoCreator;
import com.tinder.data.model.activityfeed.ProfileAddPhotoModel.Select_profile_add_photoModel;
import com.tinder.domain.feed.ActivityFeedPhoto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class bd implements Select_profile_add_photoCreator {
    /* renamed from: a */
    private final /* synthetic */ Function3 f35327a;

    bd(Function3 function3) {
        this.f35327a = function3;
    }

    public final /* synthetic */ T create(long j, long j2, @Nullable @org.jetbrains.annotations.Nullable List<ActivityFeedPhoto> list) {
        return (Select_profile_add_photoModel) this.f35327a.invoke(Long.valueOf(j), Long.valueOf(j2), list);
    }
}
