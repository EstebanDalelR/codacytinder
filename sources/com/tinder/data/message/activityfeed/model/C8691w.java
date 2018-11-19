package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.C7263a;
import com.squareup.sqldelight.RowMapper;
import com.tinder.data.message.activityfeed.ActivityEventType;
import com.tinder.data.model.activityfeed.ActivityFeedItemModel;
import com.tinder.data.model.activityfeed.ActivityFeedItemModel.C10871d;
import com.tinder.data.model.activityfeed.ActivityFeedItemModel.C8721b;
import com.tinder.data.model.activityfeed.ActivityFeedItemModel.Creator;
import com.tinder.data.model.activityfeed.ActivityFeedItemModel.Select_activity_feed_item_by_message_idCreator;
import com.tinder.data.model.activityfeed.ActivityFeedItemModel.Select_activity_feed_item_by_message_idModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"activityFeedItemForMessageRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ActivityFeedItemModel$Select_activity_feed_item_by_message_idModel;", "getActivityFeedItemForMessageRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "activityFeedItemModelFactory", "Lcom/tinder/data/model/activityfeed/ActivityFeedItemModel$Factory;", "Lcom/tinder/data/model/activityfeed/ActivityFeedItemModel;", "getActivityFeedItemModelFactory", "()Lcom/tinder/data/model/activityfeed/ActivityFeedItemModel$Factory;", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.w */
public final class C8691w {
    @NotNull
    /* renamed from: a */
    private static final C8721b<ActivityFeedItemModel> f30615a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_activity_feed_item_by_message_idModel> f30616b;

    @NotNull
    /* renamed from: a */
    public static final C8721b<ActivityFeedItemModel> m37075a() {
        return f30615a;
    }

    static {
        Function4 function4 = ActivityFeedItemModelsKt$activityFeedItemModelFactory$1.f45290a;
        if (function4 != null) {
            function4 = new C10829x(function4);
        }
        f30615a = new C8721b((Creator) function4, C7263a.a(ActivityEventType.class));
        C8721b c8721b = f30615a;
        function4 = ActivityFeedItemModelsKt$activityFeedItemForMessageRowMapper$1.f45289a;
        if (function4 != null) {
            function4 = new C10830y(function4);
        }
        C10871d a = c8721b.m37208a((Select_activity_feed_item_by_message_idCreator) function4);
        C2668g.a(a, "activityFeedItemModelFac…ivityFeedItemByMessageId)");
        f30616b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_activity_feed_item_by_message_idModel> m37076b() {
        return f30616b;
    }
}
