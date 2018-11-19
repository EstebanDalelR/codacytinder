package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import com.tinder.data.model.activityfeed.ActivityFeedSongModel;
import com.tinder.data.model.activityfeed.ActivityFeedSongModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class af implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function4 f35270a;

    af(Function4 function4) {
        this.f35270a = function4;
    }

    public final /* synthetic */ T create(@NotNull @NonNull String str, @NotNull @NonNull String str2, @NotNull @NonNull String str3, @NotNull @NonNull String str4) {
        C2668g.b(str, "id");
        C2668g.b(str2, "activity_feed_item_id");
        C2668g.b(str3, "name");
        C2668g.b(str4, "url");
        return (ActivityFeedSongModel) this.f35270a.invoke(str, str2, str3, str4);
    }
}
