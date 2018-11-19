package com.tinder.data.message.activityfeed.model;

import com.squareup.sqldelight.RowMapper;
import com.tinder.data.adapter.p208a.C10730f;
import com.tinder.data.model.activityfeed.ProfileAddPhotoModel;
import com.tinder.data.model.activityfeed.ProfileAddPhotoModel.C10878c;
import com.tinder.data.model.activityfeed.ProfileAddPhotoModel.C8728a;
import com.tinder.data.model.activityfeed.ProfileAddPhotoModel.Creator;
import com.tinder.data.model.activityfeed.ProfileAddPhotoModel.Select_profile_add_photoCreator;
import com.tinder.data.model.activityfeed.ProfileAddPhotoModel.Select_profile_add_photoModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"profileAddPhotoByActivityFeedItemRowMapper", "Lcom/squareup/sqldelight/RowMapper;", "Lcom/tinder/data/model/activityfeed/ProfileAddPhotoModel$Select_profile_add_photoModel;", "getProfileAddPhotoByActivityFeedItemRowMapper", "()Lcom/squareup/sqldelight/RowMapper;", "profileAddPhotoModelFactory", "Lcom/tinder/data/model/activityfeed/ProfileAddPhotoModel$Factory;", "Lcom/tinder/data/model/activityfeed/ProfileAddPhotoModel;", "getProfileAddPhotoModelFactory", "()Lcom/tinder/data/model/activityfeed/ProfileAddPhotoModel$Factory;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class bb {
    @NotNull
    /* renamed from: a */
    private static final C8728a<ProfileAddPhotoModel> f30595a;
    @NotNull
    /* renamed from: b */
    private static final RowMapper<Select_profile_add_photoModel> f30596b;

    @NotNull
    /* renamed from: a */
    public static final C8728a<ProfileAddPhotoModel> m37055a() {
        return f30595a;
    }

    static {
        Function5 function5 = ProfileAddPhotoModelsKt$profileAddPhotoModelFactory$1.f45302a;
        if (function5 != null) {
            function5 = new bc(function5);
        }
        f30595a = new C8728a((Creator) function5, new C10730f());
        C8728a c8728a = f30595a;
        Function3 function3 = C14299x5f7aa9ce.f45301a;
        if (function3 != null) {
            function3 = new bd(function3);
        }
        C10878c a = c8728a.m37222a((Select_profile_add_photoCreator) function3);
        C2668g.a(a, "profileAddPhotoModelFact…hotoByActivityFeedItemId)");
        f30596b = a;
    }

    @NotNull
    /* renamed from: b */
    public static final RowMapper<Select_profile_add_photoModel> m37056b() {
        return f30596b;
    }
}
