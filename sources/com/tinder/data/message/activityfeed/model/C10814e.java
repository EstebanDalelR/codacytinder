package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel.Select_activity_event_new_matchCreator;
import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel.Select_activity_event_new_matchModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.e */
final class C10814e implements Select_activity_event_new_matchCreator {
    /* renamed from: a */
    private final /* synthetic */ Function3 f35377a;

    C10814e(Function3 function3) {
        this.f35377a = function3;
    }

    public final /* synthetic */ T create(long j, long j2, long j3) {
        return (Select_activity_event_new_matchModel) this.f35377a.invoke(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
    }
}
