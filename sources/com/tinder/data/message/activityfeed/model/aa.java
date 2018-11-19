package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.model.activityfeed.ActivityFeedItemUserInfoModel;
import com.tinder.data.model.activityfeed.ActivityFeedItemUserInfoModel.C8722a;
import com.tinder.data.model.activityfeed.ActivityFeedItemUserInfoModel.Creator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"activityFeedItemUserInfoModelFactory", "Lcom/tinder/data/model/activityfeed/ActivityFeedItemUserInfoModel$Factory;", "Lcom/tinder/data/model/activityfeed/ActivityFeedItemUserInfoModel;", "getActivityFeedItemUserInfoModelFactory", "()Lcom/tinder/data/model/activityfeed/ActivityFeedItemUserInfoModel$Factory;", "userInfoUserIdRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "", "getUserInfoUserIdRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class aa {
    @NotNull
    /* renamed from: a */
    private static final C8722a<ActivityFeedItemUserInfoModel> f30583a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<String> f30584b;

    @NotNull
    /* renamed from: a */
    public static final C8722a<ActivityFeedItemUserInfoModel> m37043a() {
        return f30583a;
    }

    static {
        Function3 function3 = C14294xc1ba853f.f45291a;
        if (function3 != null) {
            function3 = new ab(function3);
        }
        f30583a = new C8722a((Creator) function3);
        RowMapper a = f30583a.m37209a();
        C2668g.a(a, "activityFeedItemUserInfo….select_user_infoMapper()");
        f30584b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<String> m37044b() {
        return f30584b;
    }
}
