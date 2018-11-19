package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.adapter.p208a.C10731g;
import com.tinder.data.model.activityfeed.ProfileChangeSchoolModel;
import com.tinder.data.model.activityfeed.ProfileChangeSchoolModel.C10881c;
import com.tinder.data.model.activityfeed.ProfileChangeSchoolModel.C8731a;
import com.tinder.data.model.activityfeed.ProfileChangeSchoolModel.Creator;
import com.tinder.data.model.activityfeed.ProfileChangeSchoolModel.Select_profile_change_schoolCreator;
import com.tinder.data.model.activityfeed.ProfileChangeSchoolModel.Select_profile_change_schoolModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"profileChangeSchoolByActivityFeedItemRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ProfileChangeSchoolModel$Select_profile_change_schoolModel;", "getProfileChangeSchoolByActivityFeedItemRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "profileChangeSchoolModelFactory", "Lcom/tinder/data/model/activityfeed/ProfileChangeSchoolModel$Factory;", "Lcom/tinder/data/model/activityfeed/ProfileChangeSchoolModel;", "getProfileChangeSchoolModelFactory", "()Lcom/tinder/data/model/activityfeed/ProfileChangeSchoolModel$Factory;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class bq {
    @NotNull
    /* renamed from: a */
    private static final C8731a<ProfileChangeSchoolModel> f30601a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_profile_change_schoolModel> f30602b;

    @NotNull
    /* renamed from: a */
    public static final C8731a<ProfileChangeSchoolModel> m37061a() {
        return f30601a;
    }

    static {
        Function5 function5 = ProfileChangeSchoolModelsKt$profileChangeSchoolModelFactory$1.f45308a;
        if (function5 != null) {
            function5 = new br(function5);
        }
        f30601a = new C8731a((Creator) function5, new C10731g());
        C8731a c8731a = f30601a;
        Function3 function3 = C14301xd2c50128.f45307a;
        if (function3 != null) {
            function3 = new bs(function3);
        }
        C10881c a = c8731a.m37228a((Select_profile_change_schoolCreator) function3);
        C2668g.a(a, "profileChangeSchoolModel…hoolByActivityFeedItemId)");
        f30602b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_profile_change_schoolModel> m37062b() {
        return f30602b;
    }
}
