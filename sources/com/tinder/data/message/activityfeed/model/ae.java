package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.model.activityfeed.ActivityFeedSongModel;
import com.tinder.data.model.activityfeed.ActivityFeedSongModel.C10873c;
import com.tinder.data.model.activityfeed.ActivityFeedSongModel.C8723a;
import com.tinder.data.model.activityfeed.ActivityFeedSongModel.Creator;
import com.tinder.data.model.activityfeed.ActivityFeedSongModel.Select_activity_feed_songCreator;
import com.tinder.data.model.activityfeed.ActivityFeedSongModel.Select_activity_feed_songModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"activityFeedSongModelFactory", "Lcom/tinder/data/model/activityfeed/ActivityFeedSongModel$Factory;", "Lcom/tinder/data/model/activityfeed/ActivityFeedSongModel;", "getActivityFeedSongModelFactory", "()Lcom/tinder/data/model/activityfeed/ActivityFeedSongModel$Factory;", "activityFeedSongRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ActivityFeedSongModel$Select_activity_feed_songModel;", "getActivityFeedSongRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class ae {
    @NotNull
    /* renamed from: a */
    private static final C8723a<ActivityFeedSongModel> f30585a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_activity_feed_songModel> f30586b;

    @NotNull
    /* renamed from: a */
    public static final C8723a<ActivityFeedSongModel> m37045a() {
        return f30585a;
    }

    static {
        Function4 function4 = ActivityFeedSongModelsKt$activityFeedSongModelFactory$1.f45292a;
        if (function4 != null) {
            function4 = new af(function4);
        }
        f30585a = new C8723a((Creator) function4);
        C8723a c8723a = f30585a;
        Function3 function3 = ActivityFeedSongModelsKt$activityFeedSongRowMapper$1.f45293a;
        if (function3 != null) {
            function3 = new ag(function3);
        }
        C10873c a = c8723a.m37212a((Select_activity_feed_songCreator) function3);
        C2668g.a(a, "activityFeedSongModelFac…SongByActivityFeedItemId)");
        f30586b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_activity_feed_songModel> m37046b() {
        return f30586b;
    }
}
