package com.tinder.data.profile;

import com.tinder.domain.common.model.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/model/User;", "it", "invoke"}, k = 3, mv = {1, 1, 10})
final class ProfileRemoteDataRepository$persistResult$1 extends Lambda implements Function1<User, User> {
    /* renamed from: a */
    final /* synthetic */ C10975q f43966a;

    ProfileRemoteDataRepository$persistResult$1(C10975q c10975q) {
        this.f43966a = c10975q;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53416a((User) obj);
    }

    @NotNull
    /* renamed from: a */
    public final User m53416a(@NotNull User user) {
        C2668g.b(user, "it");
        return this.f43966a.m43572a(user);
    }
}
