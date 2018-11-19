package com.tinder.verification.usecase;

import com.tinder.auth.model.C8286a;
import com.tinder.auth.model.C8291f;
import com.tinder.auth.repository.AuthLedgerRepository;
import io.reactivex.C3957b;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/verification/usecase/ObserveSmsVerificationStatus;", "", "authLedgerRepository", "Lcom/tinder/auth/repository/AuthLedgerRepository;", "(Lcom/tinder/auth/repository/AuthLedgerRepository;)V", "execute", "Lio/reactivex/Flowable;", "Lcom/tinder/auth/model/SmsVerificationStatus;", "verification_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.verification.usecase.a */
public final class C15390a {
    /* renamed from: a */
    private final AuthLedgerRepository f47663a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/auth/model/SmsVerificationStatus;", "it", "Lcom/tinder/auth/model/AuthLedger;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.verification.usecase.a$a */
    static final class C17237a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17237a f52848a = new C17237a();

        C17237a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m63148a((C8286a) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8291f m63148a(@NotNull C8286a c8286a) {
            C2668g.b(c8286a, "it");
            return c8286a.b();
        }
    }

    public C15390a(@NotNull AuthLedgerRepository authLedgerRepository) {
        C2668g.b(authLedgerRepository, "authLedgerRepository");
        this.f47663a = authLedgerRepository;
    }

    @NotNull
    /* renamed from: a */
    public final C3957b<C8291f> m57721a() {
        C3957b<C8291f> f = this.f47663a.loadLedger().f(C17237a.f52848a);
        C2668g.a(f, "authLedgerRepository.loa…t.smsVerificationStatus }");
        return f;
    }
}
