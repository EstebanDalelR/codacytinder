package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.adapter.p208a.C10732h;
import com.tinder.data.model.activityfeed.InstagramNewMediaModel;
import com.tinder.data.model.activityfeed.InstagramNewMediaModel.C10875c;
import com.tinder.data.model.activityfeed.InstagramNewMediaModel.C8725a;
import com.tinder.data.model.activityfeed.InstagramNewMediaModel.Creator;
import com.tinder.data.model.activityfeed.InstagramNewMediaModel.Select_instagram_new_mediaCreator;
import com.tinder.data.model.activityfeed.InstagramNewMediaModel.Select_instagram_new_mediaModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"instagramNewMediaForActivityFeedItemRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/InstagramNewMediaModel$Select_instagram_new_mediaModel;", "getInstagramNewMediaForActivityFeedItemRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "instagramNewMediaModelFactory", "Lcom/tinder/data/model/activityfeed/InstagramNewMediaModel$Factory;", "Lcom/tinder/data/model/activityfeed/InstagramNewMediaModel;", "getInstagramNewMediaModelFactory", "()Lcom/tinder/data/model/activityfeed/InstagramNewMediaModel$Factory;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class ao {
    @NotNull
    /* renamed from: a */
    private static final C8725a<InstagramNewMediaModel> f30589a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_instagram_new_mediaModel> f30590b;

    @NotNull
    /* renamed from: a */
    public static final C8725a<InstagramNewMediaModel> m37049a() {
        return f30589a;
    }

    static {
        Function9 function9 = InstagramNewMediaModelsKt$instagramNewMediaModelFactory$1.f45297a;
        if (function9 != null) {
            function9 = new ap(function9);
        }
        f30589a = new C8725a((Creator) function9, new C10732h());
        C8725a c8725a = f30589a;
        Function7 function7 = C14296x85f5383a.f45296a;
        if (function7 != null) {
            function7 = new aq(function7);
        }
        C10875c a = c8725a.m37216a((Select_instagram_new_mediaCreator) function7);
        C2668g.a(a, "instagramNewMediaModelFa…ediaByActivityFeedItemId)");
        f30590b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_instagram_new_mediaModel> m37050b() {
        return f30590b;
    }
}
