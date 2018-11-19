package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.model.activityfeed.ProfileChangeAnthemModel;
import com.tinder.data.model.activityfeed.ProfileChangeAnthemModel.C10879c;
import com.tinder.data.model.activityfeed.ProfileChangeAnthemModel.C8729a;
import com.tinder.data.model.activityfeed.ProfileChangeAnthemModel.Creator;
import com.tinder.data.model.activityfeed.ProfileChangeAnthemModel.Select_profile_change_anthemCreator;
import com.tinder.data.model.activityfeed.ProfileChangeAnthemModel.Select_profile_change_anthemModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"profileChangeAnthemModelFactory", "Lcom/tinder/data/model/activityfeed/ProfileChangeAnthemModel$Factory;", "Lcom/tinder/data/model/activityfeed/ProfileChangeAnthemModel;", "getProfileChangeAnthemModelFactory", "()Lcom/tinder/data/model/activityfeed/ProfileChangeAnthemModel$Factory;", "profileChangeAnthemRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ProfileChangeAnthemModel$Select_profile_change_anthemModel;", "getProfileChangeAnthemRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class bg {
    @NotNull
    /* renamed from: a */
    private static final C8729a<ProfileChangeAnthemModel> f30597a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_profile_change_anthemModel> f30598b;

    @NotNull
    /* renamed from: a */
    public static final C8729a<ProfileChangeAnthemModel> m37057a() {
        return f30597a;
    }

    static {
        Function4 function4 = ProfileChangeAnthemModelsKt$profileChangeAnthemModelFactory$1.f45303a;
        if (function4 != null) {
            function4 = new bh(function4);
        }
        f30597a = new C8729a((Creator) function4);
        C8729a c8729a = f30597a;
        Function2 function2 = ProfileChangeAnthemModelsKt$profileChangeAnthemRowMapper$1.f45304a;
        if (function2 != null) {
            function2 = new bi(function2);
        }
        C10879c a = c8729a.m37224a((Select_profile_change_anthemCreator) function2);
        C2668g.a(a, "profileChangeAnthemModel…themByActivityFeedItemId)");
        f30598b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_profile_change_anthemModel> m37058b() {
        return f30598b;
    }
}
