package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.model.activityfeed.ActivityFeedCommentModel;
import com.tinder.data.model.activityfeed.ActivityFeedCommentModel.C10870c;
import com.tinder.data.model.activityfeed.ActivityFeedCommentModel.C8720a;
import com.tinder.data.model.activityfeed.ActivityFeedCommentModel.Creator;
import com.tinder.data.model.activityfeed.ActivityFeedCommentModel.Select_activity_feed_item_commentsCreator;
import com.tinder.data.model.activityfeed.ActivityFeedCommentModel.Select_activity_feed_item_commentsModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"activityFeedCommentForActivityFeedItemRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ActivityFeedCommentModel$Select_activity_feed_item_commentsModel;", "getActivityFeedCommentForActivityFeedItemRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "activityFeedCommentModelFactory", "Lcom/tinder/data/model/activityfeed/ActivityFeedCommentModel$Factory;", "Lcom/tinder/data/model/activityfeed/ActivityFeedCommentModel;", "getActivityFeedCommentModelFactory", "()Lcom/tinder/data/model/activityfeed/ActivityFeedCommentModel$Factory;", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.r */
public final class C8690r {
    @NotNull
    /* renamed from: a */
    private static final C8720a<ActivityFeedCommentModel> f30613a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_activity_feed_item_commentsModel> f30614b;

    @NotNull
    /* renamed from: a */
    public static final C8720a<ActivityFeedCommentModel> m37073a() {
        return f30613a;
    }

    static {
        Function5 function5 = ActivityFeedCommentModelsKt$activityFeedCommentModelFactory$1.f45288a;
        if (function5 != null) {
            function5 = new C10825s(function5);
        }
        f30613a = new C8720a((Creator) function5);
        C8720a c8720a = f30613a;
        Function4 function4 = C14293xdc7ab7b2.f45287a;
        if (function4 != null) {
            function4 = new C10826t(function4);
        }
        C10870c a = c8720a.m37206a((Select_activity_feed_item_commentsCreator) function4);
        C2668g.a(a, "activityFeedCommentModel…mentByActivityFeedItemId)");
        f30614b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_activity_feed_item_commentsModel> m37074b() {
        return f30614b;
    }
}
