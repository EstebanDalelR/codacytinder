package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.InstagramNewMediaModel;
import com.tinder.data.model.activityfeed.InstagramNewMediaModel.Creator;
import com.tinder.domain.feed.InstagramMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class ap implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function9 f35300a;

    ap(Function9 function9) {
        this.f35300a = function9;
    }

    public final /* synthetic */ T create(long j, @NotNull @NonNull String str, @NotNull @NonNull String str2, @NotNull @NonNull String str3, long j2, long j3, long j4, @NotNull @NonNull String str4, @Nullable @org.jetbrains.annotations.Nullable List<InstagramMedia> list) {
        String str5 = str;
        C2668g.b(str5, "activity_feed_item_id");
        String str6 = str2;
        C2668g.b(str6, "instagram_media_id");
        String str7 = str3;
        C2668g.b(str7, "instagram_user_name");
        String str8 = str4;
        C2668g.b(str8, "caption");
        return (InstagramNewMediaModel) this.f35300a.invoke(Long.valueOf(j), str5, str6, str7, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), str8, list);
    }
}
