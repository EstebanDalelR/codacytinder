package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.adapter.p208a.C10730f;
import com.tinder.data.model.activityfeed.InstagramConnectModel;
import com.tinder.data.model.activityfeed.InstagramConnectModel.C10874c;
import com.tinder.data.model.activityfeed.InstagramConnectModel.C8724a;
import com.tinder.data.model.activityfeed.InstagramConnectModel.Creator;
import com.tinder.data.model.activityfeed.InstagramConnectModel.Select_instagram_connectCreator;
import com.tinder.data.model.activityfeed.InstagramConnectModel.Select_instagram_connectModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"instagramConnectForActivityFeedItemIdRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/InstagramConnectModel$Select_instagram_connectModel;", "getInstagramConnectForActivityFeedItemIdRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "instagramConnectModelFactory", "Lcom/tinder/data/model/activityfeed/InstagramConnectModel$Factory;", "Lcom/tinder/data/model/activityfeed/InstagramConnectModel;", "getInstagramConnectModelFactory", "()Lcom/tinder/data/model/activityfeed/InstagramConnectModel$Factory;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class aj {
    @NotNull
    /* renamed from: a */
    private static final C8724a<InstagramConnectModel> f30587a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_instagram_connectModel> f30588b;

    @NotNull
    /* renamed from: a */
    public static final C8724a<InstagramConnectModel> m37047a() {
        return f30587a;
    }

    static {
        Function6 function6 = InstagramConnectModelsKt$instagramConnectModelFactory$1.f45295a;
        if (function6 != null) {
            function6 = new ak(function6);
        }
        f30587a = new C8724a((Creator) function6, new C10730f());
        C8724a c8724a = f30587a;
        Function4 function4 = C14295x6d5ab9f5.f45294a;
        if (function4 != null) {
            function4 = new al(function4);
        }
        C10874c a = c8724a.m37214a((Select_instagram_connectCreator) function4);
        C2668g.a(a, "instagramConnectModelFac…nectByActivityFeedItemId)");
        f30588b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_instagram_connectModel> m37048b() {
        return f30588b;
    }
}
