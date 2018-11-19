package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel.C10880c;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel.C8730a;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel.Creator;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel.Select_profile_change_bioCreator;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel.Select_profile_change_bioModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"profileChangeBioByActivityFeedItemRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ProfileChangeBioModel$Select_profile_change_bioModel;", "getProfileChangeBioByActivityFeedItemRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "profileChangeBioModelFactory", "Lcom/tinder/data/model/activityfeed/ProfileChangeBioModel$Factory;", "Lcom/tinder/data/model/activityfeed/ProfileChangeBioModel;", "getProfileChangeBioModelFactory", "()Lcom/tinder/data/model/activityfeed/ProfileChangeBioModel$Factory;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class bl {
    @NotNull
    /* renamed from: a */
    private static final C8730a<ProfileChangeBioModel> f30599a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_profile_change_bioModel> f30600b;

    @NotNull
    /* renamed from: a */
    public static final C8730a<ProfileChangeBioModel> m37059a() {
        return f30599a;
    }

    static {
        Function6 function6 = ProfileChangeBioModelsKt$profileChangeBioModelFactory$1.f45306a;
        if (function6 != null) {
            function6 = new bm(function6);
        }
        f30599a = new C8730a((Creator) function6);
        C8730a c8730a = f30599a;
        Function4 function4 = C14300xc93df160.f45305a;
        if (function4 != null) {
            function4 = new bn(function4);
        }
        C10880c a = c8730a.m37226a((Select_profile_change_bioCreator) function4);
        C2668g.a(a, "profileChangeBioModelFac…eBioByActivityFeedItemId)");
        f30600b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_profile_change_bioModel> m37060b() {
        return f30600b;
    }
}
