package com.tinder.data.profile.repository;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.User;
import com.tinder.domain.meta.model.CoreUser;
import com.tinder.domain.meta.model.CoreUser.Builder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/meta/model/CoreUser;", "kotlin.jvm.PlatformType", "user", "Lcom/tinder/domain/common/model/User;", "invoke"}, k = 3, mv = {1, 1, 10})
final class JobDataRepository$persist$1 extends Lambda implements Function1<User, CoreUser> {
    /* renamed from: a */
    final /* synthetic */ Function1 f43971a;

    JobDataRepository$persist$1(Function1 function1) {
        this.f43971a = function1;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53420a((User) obj);
    }

    /* renamed from: a */
    public final CoreUser m53420a(@NotNull User user) {
        C2668g.b(user, ManagerWebServices.PARAM_USER);
        Builder toBuilder = CoreUser.from(user).toBuilder();
        Function1 function1 = this.f43971a;
        user = user.jobs();
        C2668g.a(user, "user.jobs()");
        user = toBuilder.jobs((List) function1.invoke(user)).build();
        C2668g.a(user, "CoreUser.from(user)\n    …\n                .build()");
        return user;
    }
}
