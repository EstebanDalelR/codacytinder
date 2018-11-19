package com.tinder.auth.p168c;

import com.tinder.auth.model.C8286a;
import com.tinder.auth.model.C8288b;
import com.tinder.auth.repository.AuthLedgerRepository;
import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/auth/usecase/SaveAuthLedger;", "", "authLedgerRepository", "Lcom/tinder/auth/repository/AuthLedgerRepository;", "(Lcom/tinder/auth/repository/AuthLedgerRepository;)V", "execute", "Lio/reactivex/Completable;", "request", "Lcom/tinder/auth/model/AuthResult;", "domain"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.c.f */
public final class C8274f {
    /* renamed from: a */
    private final AuthLedgerRepository f29518a;

    public C8274f(@NotNull AuthLedgerRepository authLedgerRepository) {
        C2668g.b(authLedgerRepository, "authLedgerRepository");
        this.f29518a = authLedgerRepository;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m35325a(@NotNull C8288b c8288b) {
        C2668g.b(c8288b, "request");
        return this.f29518a.saveLedger(new C8286a(c8288b.m35368b(), c8288b.m35369c()));
    }
}
