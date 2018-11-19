package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.adapter.p208a.C10729e;
import com.tinder.data.model.activityfeed.ProfileAddLoopModel;
import com.tinder.data.model.activityfeed.ProfileAddLoopModel.C10877c;
import com.tinder.data.model.activityfeed.ProfileAddLoopModel.C8727a;
import com.tinder.data.model.activityfeed.ProfileAddLoopModel.Creator;
import com.tinder.data.model.activityfeed.ProfileAddLoopModel.Select_profile_add_loopCreator;
import com.tinder.data.model.activityfeed.ProfileAddLoopModel.Select_profile_add_loopModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"profileAddLoopByActivityFeedItemRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ProfileAddLoopModel$Select_profile_add_loopModel;", "getProfileAddLoopByActivityFeedItemRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "profileAddLoopModelFactory", "Lcom/tinder/data/model/activityfeed/ProfileAddLoopModel$Factory;", "Lcom/tinder/data/model/activityfeed/ProfileAddLoopModel;", "getProfileAddLoopModelFactory", "()Lcom/tinder/data/model/activityfeed/ProfileAddLoopModel$Factory;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class aw {
    @NotNull
    /* renamed from: a */
    private static final C8727a<ProfileAddLoopModel> f30593a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_profile_add_loopModel> f30594b;

    @NotNull
    /* renamed from: a */
    public static final C8727a<ProfileAddLoopModel> m37053a() {
        return f30593a;
    }

    static {
        Function5 function5 = ProfileAddLoopModelsKt$profileAddLoopModelFactory$1.f45300a;
        if (function5 != null) {
            function5 = new ax(function5);
        }
        f30593a = new C8727a((Creator) function5, new C10729e());
        C8727a c8727a = f30593a;
        Function3 function3 = C14298x3589ef80.f45299a;
        if (function3 != null) {
            function3 = new ay(function3);
        }
        C10877c a = c8727a.m37220a((Select_profile_add_loopCreator) function3);
        C2668g.a(a, "profileAddLoopModelFacto…LoopByActivityFeedItemId)");
        f30594b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_profile_add_loopModel> m37054b() {
        return f30594b;
    }
}
