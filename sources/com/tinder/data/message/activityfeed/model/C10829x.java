package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.message.activityfeed.ActivityEventType;
import com.tinder.data.model.activityfeed.ActivityFeedItemModel;
import com.tinder.data.model.activityfeed.ActivityFeedItemModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.x */
final class C10829x implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function4 f35415a;

    C10829x(Function4 function4) {
        this.f35415a = function4;
    }

    public final /* synthetic */ T create(@NotNull @NonNull String str, @NotNull @NonNull String str2, @NotNull @NonNull ActivityEventType activityEventType, @Nullable @org.jetbrains.annotations.Nullable String str3) {
        C2668g.b(str, "id");
        C2668g.b(str2, "match_id");
        C2668g.b(activityEventType, "activity_event_type");
        return (ActivityFeedItemModel) this.f35415a.invoke(str, str2, activityEventType, str3);
    }
}
