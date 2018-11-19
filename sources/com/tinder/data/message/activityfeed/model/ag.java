package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import com.tinder.data.model.activityfeed.ActivityFeedSongModel.Select_activity_feed_songCreator;
import com.tinder.data.model.activityfeed.ActivityFeedSongModel.Select_activity_feed_songModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class ag implements Select_activity_feed_songCreator {
    /* renamed from: a */
    private final /* synthetic */ Function3 f35271a;

    ag(Function3 function3) {
        this.f35271a = function3;
    }

    public final /* synthetic */ T create(@NotNull @NonNull String str, @NotNull @NonNull String str2, @NotNull @NonNull String str3) {
        C2668g.b(str, "id");
        C2668g.b(str2, "name");
        C2668g.b(str3, "url");
        return (Select_activity_feed_songModel) this.f35271a.invoke(str, str2, str3);
    }
}
