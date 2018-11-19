package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import com.tinder.api.ManagerWebServices;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class bm implements Creator {
    /* renamed from: a */
    private final /* synthetic */ Function6 f35346a;

    bm(Function6 function6) {
        this.f35346a = function6;
    }

    public final /* synthetic */ T create(long j, @NotNull @NonNull String str, long j2, long j3, @NotNull @NonNull String str2, @NotNull @NonNull String str3) {
        String str4 = str;
        C2668g.b(str4, "activity_feed_item_id");
        String str5 = str2;
        C2668g.b(str5, ManagerWebServices.PARAM_BIO);
        String str6 = str3;
        C2668g.b(str6, "old_bio");
        return (ProfileChangeBioModel) this.f35346a.invoke(Long.valueOf(j), str4, Long.valueOf(j2), Long.valueOf(j3), str5, str6);
    }
}
