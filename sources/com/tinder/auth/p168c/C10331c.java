package com.tinder.auth.p168c;

import com.tinder.api.TinderApi;
import com.tinder.auth.repository.C10353p;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.model.auth.LogoutFrom;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/auth/usecase/Logout;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/model/auth/LogoutFrom;", "tinderApi", "Lcom/tinder/api/TinderApi;", "tinderLongLivedTokenRepository", "Lcom/tinder/auth/repository/TinderLongLivedTokenRepository;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/auth/repository/TinderLongLivedTokenRepository;)V", "execute", "Lio/reactivex/Completable;", "request", "invalidateTokenOnApi", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.c.c */
public final class C10331c implements CompletableUseCase<LogoutFrom> {
    /* renamed from: a */
    private final TinderApi f33739a;
    /* renamed from: b */
    private final C10353p f33740b;

    @Inject
    public C10331c(@NotNull TinderApi tinderApi, @NotNull C10353p c10353p) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c10353p, "tinderLongLivedTokenRepository");
        this.f33739a = tinderApi;
        this.f33740b = c10353p;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m42112a((LogoutFrom) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m42112a(@NotNull LogoutFrom logoutFrom) {
        C2668g.b(logoutFrom, "request");
        return m42111a();
    }

    /* renamed from: a */
    private final C3956a m42111a() {
        C3956a logout = this.f33739a.logout(this.f33740b.getToken());
        C2668g.a(logout, "tinderApi.logout(tinderL…vedTokenRepository.token)");
        return logout;
    }
}
