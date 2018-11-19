package com.tinder.fireboarding.domain;

import com.tinder.auth.model.C8286a;
import com.tinder.auth.repository.AuthLedgerRepository;
import com.tinder.domain.common.reactivex.usecase.SingleResultUseCase;
import io.reactivex.C3960g;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/fireboarding/domain/IsNewAccount;", "Lcom/tinder/domain/common/reactivex/usecase/SingleResultUseCase;", "", "authLedgerRepository", "Lcom/tinder/auth/repository/AuthLedgerRepository;", "(Lcom/tinder/auth/repository/AuthLedgerRepository;)V", "execute", "Lio/reactivex/Single;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.k */
public final class C11806k implements SingleResultUseCase<Boolean> {
    /* renamed from: a */
    private final AuthLedgerRepository f38532a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/auth/model/AuthLedger;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.k$a */
    static final class C11805a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11805a f38531a = new C11805a();

        C11805a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m47722a((C8286a) obj));
        }

        /* renamed from: a */
        public final boolean m47722a(@NotNull C8286a c8286a) {
            C2668g.b(c8286a, "it");
            return c8286a.m35361a();
        }
    }

    public C11806k(@NotNull AuthLedgerRepository authLedgerRepository) {
        C2668g.b(authLedgerRepository, "authLedgerRepository");
        this.f38532a = authLedgerRepository;
    }

    @NotNull
    public C3960g<Boolean> execute() {
        C3960g<Boolean> f = this.f38532a.loadLedger().f(C11805a.f38531a).f();
        C2668g.a(f, "authLedgerRepository.loa…          .firstOrError()");
        return f;
    }
}
