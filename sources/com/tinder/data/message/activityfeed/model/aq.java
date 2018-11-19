package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.model.activityfeed.InstagramNewMediaModel.Select_instagram_new_mediaCreator;
import com.tinder.data.model.activityfeed.InstagramNewMediaModel.Select_instagram_new_mediaModel;
import com.tinder.domain.feed.InstagramMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class aq implements Select_instagram_new_mediaCreator {
    /* renamed from: a */
    private final /* synthetic */ Function7 f35301a;

    aq(Function7 function7) {
        this.f35301a = function7;
    }

    public final /* synthetic */ T create(@NotNull @NonNull String str, @NotNull @NonNull String str2, long j, long j2, long j3, @NotNull @NonNull String str3, @Nullable @org.jetbrains.annotations.Nullable List<InstagramMedia> list) {
        String str4 = str;
        C2668g.b(str4, "instagram_media_id");
        String str5 = str2;
        C2668g.b(str5, "instagram_user_name");
        String str6 = str3;
        C2668g.b(str6, "caption");
        return (Select_instagram_new_mediaModel) this.f35301a.invoke(str4, str5, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), str6, list);
    }
}
