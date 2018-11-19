package com.tinder.data.message.activityfeed.model;

import android.support.annotation.NonNull;
import com.tinder.api.ManagerWebServices;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel.Select_profile_change_bioCreator;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel.Select_profile_change_bioModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class bn implements Select_profile_change_bioCreator {
    /* renamed from: a */
    private final /* synthetic */ Function4 f35347a;

    bn(Function4 function4) {
        this.f35347a = function4;
    }

    public final /* synthetic */ T create(long j, long j2, @NotNull @NonNull String str, @NotNull @NonNull String str2) {
        C2668g.b(str, ManagerWebServices.PARAM_BIO);
        C2668g.b(str2, "old_bio");
        return (Select_profile_change_bioModel) this.f35347a.invoke(Long.valueOf(j), Long.valueOf(j2), str, str2);
    }
}
