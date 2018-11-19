package com.tinder.verification.usecase;

import com.tinder.auth.model.C8286a;
import com.tinder.auth.model.C8291f;
import com.tinder.auth.repository.AuthLedgerRepository;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/verification/usecase/SuppressSmsVerificationRequirement;", "", "authLedgerRepository", "Lcom/tinder/auth/repository/AuthLedgerRepository;", "(Lcom/tinder/auth/repository/AuthLedgerRepository;)V", "execute", "Lio/reactivex/Completable;", "verification_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.verification.usecase.c */
public final class C15392c {
    /* renamed from: a */
    private final AuthLedgerRepository f47665a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/auth/model/AuthLedger;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.verification.usecase.c$a */
    static final class C17238a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17238a f52849a = new C17238a();

        C17238a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m63149a((C8286a) obj));
        }

        /* renamed from: a */
        public final boolean m63149a(@NotNull C8286a c8286a) {
            C2668g.b(c8286a, "it");
            return c8286a.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Completable;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.verification.usecase.c$b */
    static final class C17239b<T, R> implements Function<Boolean, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C15392c f52850a;

        C17239b(C15392c c15392c) {
            this.f52850a = c15392c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m63150a((Boolean) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m63150a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return this.f52850a.f47665a.saveLedger(new C8286a(bool.booleanValue(), new C8291f(false, true)));
        }
    }

    public C15392c(@NotNull AuthLedgerRepository authLedgerRepository) {
        C2668g.b(authLedgerRepository, "authLedgerRepository");
        this.f47665a = authLedgerRepository;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m57724a() {
        C3956a d = this.f47665a.loadLedger().f(C17238a.f52849a).f().d(new C17239b(this));
        C2668g.a(d, "authLedgerRepository.loa…    )\n                ) }");
        return d;
    }
}
