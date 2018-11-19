package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.adapter.p208a.C10726a;
import com.tinder.data.model.activityfeed.ActivityFeedArtistModel;
import com.tinder.data.model.activityfeed.ActivityFeedArtistModel.C10869c;
import com.tinder.data.model.activityfeed.ActivityFeedArtistModel.C8719a;
import com.tinder.data.model.activityfeed.ActivityFeedArtistModel.Creator;
import com.tinder.data.model.activityfeed.ActivityFeedArtistModel.Select_activity_feed_artistCreator;
import com.tinder.data.model.activityfeed.ActivityFeedArtistModel.Select_activity_feed_artistModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"activityFeedArtistModelFactory", "Lcom/tinder/data/model/activityfeed/ActivityFeedArtistModel$Factory;", "Lcom/tinder/data/model/activityfeed/ActivityFeedArtistModel;", "getActivityFeedArtistModelFactory", "()Lcom/tinder/data/model/activityfeed/ActivityFeedArtistModel$Factory;", "activityFeedArtistRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ActivityFeedArtistModel$Select_activity_feed_artistModel;", "getActivityFeedArtistRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.m */
public final class C8689m {
    @NotNull
    /* renamed from: a */
    private static final C8719a<ActivityFeedArtistModel> f30611a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_activity_feed_artistModel> f30612b;

    @NotNull
    /* renamed from: a */
    public static final C8719a<ActivityFeedArtistModel> m37071a() {
        return f30611a;
    }

    static {
        Function5 function5 = ActivityFeedArtistModelsKt$activityFeedArtistModelFactory$1.f45285a;
        if (function5 != null) {
            function5 = new C10821n(function5);
        }
        f30611a = new C8719a((Creator) function5, new C10726a());
        C8719a c8719a = f30611a;
        Function3 function3 = ActivityFeedArtistModelsKt$activityFeedArtistRowMapper$1.f45286a;
        if (function3 != null) {
            function3 = new C10822o(function3);
        }
        C10869c a = c8719a.m37204a((Select_activity_feed_artistCreator) function3);
        C2668g.a(a, "activityFeedArtistModelF…ivityFeedItemIdAndSongId)");
        f30612b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_activity_feed_artistModel> m37072b() {
        return f30612b;
    }
}
