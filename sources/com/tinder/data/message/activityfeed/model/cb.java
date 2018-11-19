package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel;
import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class cb implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function4 f35374a;

    cb(Function4 function4) {
        this.f35374a = function4;
    }

    public final /* synthetic */ T create(long j, @NotNull @NonNull String str, long j2, long j3) {
        C2668g.b(str, "activity_feed_item_id");
        return (ProfileSpotifyTopArtistModel) this.f35374a.invoke(Long.valueOf(j), str, Long.valueOf(j2), Long.valueOf(j3));
    }
}
