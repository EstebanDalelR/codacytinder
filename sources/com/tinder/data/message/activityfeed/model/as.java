package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.model.activityfeed.MessageActivityFeedItemModel;
import com.tinder.data.model.activityfeed.MessageActivityFeedItemModel.C8726a;
import com.tinder.data.model.activityfeed.MessageActivityFeedItemModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"messageActivityFeedItemModelFactory", "Lcom/tinder/data/model/activityfeed/MessageActivityFeedItemModel$Factory;", "Lcom/tinder/data/model/activityfeed/MessageActivityFeedItemModel;", "getMessageActivityFeedItemModelFactory", "()Lcom/tinder/data/model/activityfeed/MessageActivityFeedItemModel$Factory;", "messageActivityFeedItemRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "", "getMessageActivityFeedItemRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class as {
    @NotNull
    /* renamed from: a */
    private static final C8726a<MessageActivityFeedItemModel> f30591a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<String> f30592b;

    @NotNull
    /* renamed from: a */
    public static final C8726a<MessageActivityFeedItemModel> m37051a() {
        return f30591a;
    }

    static {
        Function2 function2 = C14297x2125cb6b.f45298a;
        if (function2 != null) {
            function2 = new at(function2);
        }
        f30591a = new C8726a((Creator) function2);
        RowMapper a = f30591a.m37217a();
        C2668g.a(a, "messageActivityFeedItemM…vity_feed_item_idMapper()");
        f30592b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<String> m37052b() {
        return f30592b;
    }
}
