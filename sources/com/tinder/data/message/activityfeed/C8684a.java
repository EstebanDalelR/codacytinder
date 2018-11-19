package com.tinder.data.message.activityfeed;

import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.data.model.activityfeed.ActivityFeedItemModel.C13027a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/data/message/activityfeed/ActivityFeedItemDeleteOperation;", "", "briteDatabase", "Lcom/squareup/sqlbrite/BriteDatabase;", "(Lcom/squareup/sqlbrite/BriteDatabase;)V", "deleteActivityFeedItem", "Lcom/tinder/data/model/activityfeed/ActivityFeedItemModel$Delete_activity_feed_item;", "", "activityFeedItemId", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.a */
public final class C8684a {
    /* renamed from: a */
    private final C13027a f30564a = new C13027a(this.f30565b.b());
    /* renamed from: b */
    private final BriteDatabase f30565b;

    public C8684a(@NotNull BriteDatabase briteDatabase) {
        C2668g.b(briteDatabase, "briteDatabase");
        this.f30565b = briteDatabase;
    }

    /* renamed from: a */
    public final void m37022a(@NotNull String str) {
        C2668g.b(str, "activityFeedItemId");
        this.f30564a.m50779a(str);
        this.f30565b.a(this.f30564a.a, this.f30564a.b);
    }
}
