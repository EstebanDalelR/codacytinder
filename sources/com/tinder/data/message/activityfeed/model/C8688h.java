package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.adapter.p208a.C10726a;
import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel;
import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel.C10868c;
import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel.C8718a;
import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel.Creator;
import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel.Select_activity_feed_albumCreator;
import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel.Select_activity_feed_albumModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"activityFeedAlbumModelFactory", "Lcom/tinder/data/model/activityfeed/ActivityFeedAlbumModel$Factory;", "Lcom/tinder/data/model/activityfeed/ActivityFeedAlbumModel;", "getActivityFeedAlbumModelFactory", "()Lcom/tinder/data/model/activityfeed/ActivityFeedAlbumModel$Factory;", "activityFeedAlbumRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ActivityFeedAlbumModel$Select_activity_feed_albumModel;", "getActivityFeedAlbumRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.h */
public final class C8688h {
    @NotNull
    /* renamed from: a */
    private static final C8718a<ActivityFeedAlbumModel> f30609a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_activity_feed_albumModel> f30610b;

    @NotNull
    /* renamed from: a */
    public static final C8718a<ActivityFeedAlbumModel> m37069a() {
        return f30609a;
    }

    static {
        Function4 function4 = ActivityFeedAlbumModelsKt$activityFeedAlbumModelFactory$1.f45283a;
        if (function4 != null) {
            function4 = new C10817i(function4);
        }
        f30609a = new C8718a((Creator) function4, new C10726a());
        C8718a c8718a = f30609a;
        Function2 function2 = ActivityFeedAlbumModelsKt$activityFeedAlbumRowMapper$1.f45284a;
        if (function2 != null) {
            function2 = new C10818j(function2);
        }
        C10868c a = c8718a.m37202a((Select_activity_feed_albumCreator) function2);
        C2668g.a(a, "activityFeedAlbumModelFa…ivityFeedItemIdAndSongId)");
        f30610b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_activity_feed_albumModel> m37070b() {
        return f30610b;
    }
}
