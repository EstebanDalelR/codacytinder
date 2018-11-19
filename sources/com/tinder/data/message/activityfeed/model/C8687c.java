package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel;
import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel.C10867c;
import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel.C8717a;
import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel.Creator;
import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel.Select_activity_event_new_matchCreator;
import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel.Select_activity_event_new_matchModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"activityEventNewMatchForActivityFeedItemRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ActivityEventNewMatchModel$Select_activity_event_new_matchModel;", "getActivityEventNewMatchForActivityFeedItemRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "activityEventNewMatchModelFactory", "Lcom/tinder/data/model/activityfeed/ActivityEventNewMatchModel$Factory;", "Lcom/tinder/data/model/activityfeed/ActivityEventNewMatchModel;", "getActivityEventNewMatchModelFactory", "()Lcom/tinder/data/model/activityfeed/ActivityEventNewMatchModel$Factory;", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.c */
public final class C8687c {
    @NotNull
    /* renamed from: a */
    private static final C8717a<ActivityEventNewMatchModel> f30605a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_activity_event_new_matchModel> f30606b;

    @NotNull
    /* renamed from: a */
    public static final C8717a<ActivityEventNewMatchModel> m37065a() {
        return f30605a;
    }

    static {
        Function5 function5 = C14292x28f09f3d.f45282a;
        if (function5 != null) {
            function5 = new C10813d(function5);
        }
        f30605a = new C8717a((Creator) function5);
        C8717a c8717a = f30605a;
        Function3 function3 = C14291x585e1d2e.f45281a;
        if (function3 != null) {
            function3 = new C10814e(function3);
        }
        C10867c a = c8717a.m37200a((Select_activity_event_new_matchCreator) function3);
        C2668g.a(a, "activityEventNewMatchMod…atchByActivityFeedItemId)");
        f30606b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_activity_event_new_matchModel> m37066b() {
        return f30606b;
    }
}
