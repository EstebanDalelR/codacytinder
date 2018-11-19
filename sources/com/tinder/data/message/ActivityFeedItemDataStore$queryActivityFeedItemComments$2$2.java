package com.tinder.data.message;

import com.tinder.data.model.activityfeed.ActivityFeedCommentModel.Select_activity_feed_item_commentsModel;
import com.tinder.domain.feed.ActivityCommentMetaData;
import com.tinder.domain.feed.ActivityFeedComment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/ActivityFeedComment;", "model", "Lcom/tinder/data/model/activityfeed/ActivityFeedCommentModel$Select_activity_feed_item_commentsModel;", "invoke"}, k = 3, mv = {1, 1, 10})
final class ActivityFeedItemDataStore$queryActivityFeedItemComments$2$2 extends Lambda implements Function1<Select_activity_feed_item_commentsModel, ActivityFeedComment> {
    /* renamed from: a */
    public static final ActivityFeedItemDataStore$queryActivityFeedItemComments$2$2 f43878a = new ActivityFeedItemDataStore$queryActivityFeedItemComments$2$2();

    ActivityFeedItemDataStore$queryActivityFeedItemComments$2$2() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53392a((Select_activity_feed_item_commentsModel) obj);
    }

    @NotNull
    /* renamed from: a */
    public final ActivityFeedComment m53392a(@NotNull Select_activity_feed_item_commentsModel select_activity_feed_item_commentsModel) {
        C2668g.b(select_activity_feed_item_commentsModel, "model");
        String metadata_carousel_item_id = select_activity_feed_item_commentsModel.metadata_carousel_item_id();
        C2668g.a(metadata_carousel_item_id, "model.metadata_carousel_item_id()");
        ActivityCommentMetaData activityCommentMetaData = new ActivityCommentMetaData(metadata_carousel_item_id);
        String message = select_activity_feed_item_commentsModel.message();
        C2668g.a(message, "model.message()");
        String activity_feed_item_id = select_activity_feed_item_commentsModel.activity_feed_item_id();
        C2668g.a(activity_feed_item_id, "model.activity_feed_item_id()");
        return new ActivityFeedComment(message, activity_feed_item_id, select_activity_feed_item_commentsModel.created_at(), activityCommentMetaData, null, 16, null);
    }
}
