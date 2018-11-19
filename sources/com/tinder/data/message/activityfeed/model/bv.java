package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.adapter.p208a.C10728d;
import com.tinder.data.model.activityfeed.ProfileChangeWorkModel;
import com.tinder.data.model.activityfeed.ProfileChangeWorkModel.C10882c;
import com.tinder.data.model.activityfeed.ProfileChangeWorkModel.C8732a;
import com.tinder.data.model.activityfeed.ProfileChangeWorkModel.Creator;
import com.tinder.data.model.activityfeed.ProfileChangeWorkModel.Select_profile_change_workCreator;
import com.tinder.data.model.activityfeed.ProfileChangeWorkModel.Select_profile_change_workModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"profileChangeWorkByActivityFeedItemRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ProfileChangeWorkModel$Select_profile_change_workModel;", "getProfileChangeWorkByActivityFeedItemRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "profileChangeWorkModelFactory", "Lcom/tinder/data/model/activityfeed/ProfileChangeWorkModel$Factory;", "Lcom/tinder/data/model/activityfeed/ProfileChangeWorkModel;", "getProfileChangeWorkModelFactory", "()Lcom/tinder/data/model/activityfeed/ProfileChangeWorkModel$Factory;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class bv {
    @NotNull
    /* renamed from: a */
    private static final C8732a<ProfileChangeWorkModel> f30603a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_profile_change_workModel> f30604b;

    @NotNull
    /* renamed from: a */
    public static final C8732a<ProfileChangeWorkModel> m37063a() {
        return f30603a;
    }

    static {
        Function5 function5 = ProfileChangeWorkModelsKt$profileChangeWorkModelFactory$1.f45310a;
        if (function5 != null) {
            function5 = new bw(function5);
        }
        f30603a = new C8732a((Creator) function5, new C10728d());
        C8732a c8732a = f30603a;
        Function3 function3 = C14302x736a3aee.f45309a;
        if (function3 != null) {
            function3 = new bx(function3);
        }
        C10882c a = c8732a.m37230a((Select_profile_change_workCreator) function3);
        C2668g.a(a, "profileChangeWorkModelFa…WorkByActivityFeedItemId)");
        f30604b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_profile_change_workModel> m37064b() {
        return f30604b;
    }
}
