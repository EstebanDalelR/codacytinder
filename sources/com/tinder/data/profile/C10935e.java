package com.tinder.data.profile;

import com.tinder.api.TinderUserApi;
import com.tinder.api.model.common.User;
import com.tinder.data.meta.p226a.C10844c;
import com.tinder.domain.common.usecase.SingleResultUseCase;
import com.tinder.domain.meta.model.CoreUser;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/data/profile/FetchUserProfile;", "Lcom/tinder/domain/common/usecase/SingleResultUseCase;", "Lcom/tinder/domain/meta/model/CoreUser;", "api", "Lcom/tinder/api/TinderUserApi;", "adapter", "Lcom/tinder/data/meta/adapter/CoreUserAdapter;", "(Lcom/tinder/api/TinderUserApi;Lcom/tinder/data/meta/adapter/CoreUserAdapter;)V", "execute", "Lrx/Single;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.e */
public final class C10935e implements SingleResultUseCase<CoreUser> {
    /* renamed from: a */
    private final TinderUserApi f35637a;
    /* renamed from: b */
    private final C10844c f35638b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/meta/model/CoreUser;", "apiUser", "Lcom/tinder/api/model/common/User;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.e$a */
    static final class C13077a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10935e f41652a;

        C13077a(C10935e c10935e) {
            this.f41652a = c10935e;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50893a((User) obj);
        }

        @NotNull
        /* renamed from: a */
        public final CoreUser m50893a(User user) {
            return this.f41652a.f35638b.m43313a(user);
        }
    }

    @Inject
    public C10935e(@NotNull TinderUserApi tinderUserApi, @NotNull C10844c c10844c) {
        C2668g.b(tinderUserApi, "api");
        C2668g.b(c10844c, "adapter");
        this.f35637a = tinderUserApi;
        this.f35638b = c10844c;
    }

    @NotNull
    public Single<CoreUser> execute() {
        Single<CoreUser> a = this.f35637a.getUserProfile().k(new C13077a(this)).a();
        C2668g.a(a, "api.userProfile\n        …}\n            .toSingle()");
        return a;
    }
}
