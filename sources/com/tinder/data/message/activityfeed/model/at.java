package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import com.tinder.data.model.activityfeed.MessageActivityFeedItemModel;
import com.tinder.data.model.activityfeed.MessageActivityFeedItemModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class at implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function2 f35304a;

    at(Function2 function2) {
        this.f35304a = function2;
    }

    public final /* synthetic */ T create(@NotNull @NonNull String str, @NotNull @NonNull String str2) {
        C2668g.b(str, "message_id");
        C2668g.b(str2, "activity_feed_item_id");
        return (MessageActivityFeedItemModel) this.f35304a.invoke(str, str2);
    }
}
