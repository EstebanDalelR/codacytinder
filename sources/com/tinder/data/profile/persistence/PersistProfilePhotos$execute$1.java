package com.tinder.data.profile.persistence;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.User;
import com.tinder.domain.meta.model.CoreUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/meta/model/CoreUser;", "kotlin.jvm.PlatformType", "user", "Lcom/tinder/domain/common/model/User;", "invoke"}, k = 3, mv = {1, 1, 10})
final class PersistProfilePhotos$execute$1 extends Lambda implements Function1<User, CoreUser> {
    /* renamed from: a */
    final /* synthetic */ List f43969a;

    PersistProfilePhotos$execute$1(List list) {
        this.f43969a = list;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53418a((User) obj);
    }

    /* renamed from: a */
    public final CoreUser m53418a(@NotNull User user) {
        C2668g.b(user, ManagerWebServices.PARAM_USER);
        user = CoreUser.from(user).toBuilder().photos(this.f43969a).build();
        C2668g.a(user, "CoreUser.from(user)\n    …                 .build()");
        return user;
    }
}
