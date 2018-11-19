package com.tinder.typingindicator.usecase;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.typingindicator.usecase.C17188q.C15332a;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/typingindicator/usecase/SendHeartbeatsUponTypingEmissions;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/typingindicator/usecase/SendHeartbeatsUponTypingEmissions$Request;", "observeThrottledTypingEmissions", "Lcom/tinder/typingindicator/usecase/ObserveThrottledTypingEmissions;", "sendTypingHeartbeat", "Lcom/tinder/typingindicator/usecase/SendTypingHeartbeat;", "(Lcom/tinder/typingindicator/usecase/ObserveThrottledTypingEmissions;Lcom/tinder/typingindicator/usecase/SendTypingHeartbeat;)V", "execute", "Lio/reactivex/Completable;", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.usecase.o */
public final class C17185o implements CompletableUseCase<C15331a> {
    /* renamed from: a */
    private final C17177i f52730a;
    /* renamed from: b */
    private final C17188q f52731b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/typingindicator/usecase/SendHeartbeatsUponTypingEmissions$Request;", "", "matchId", "", "matchUserId", "(Ljava/lang/String;Ljava/lang/String;)V", "getMatchId", "()Ljava/lang/String;", "getMatchUserId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.o$a */
    public static final class C15331a {
        @NotNull
        /* renamed from: a */
        private final String f47554a;
        @NotNull
        /* renamed from: b */
        private final String f47555b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15331a) {
                    C15331a c15331a = (C15331a) obj;
                    if (C2668g.a(this.f47554a, c15331a.f47554a) && C2668g.a(this.f47555b, c15331a.f47555b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f47554a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f47555b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f47554a);
            stringBuilder.append(", matchUserId=");
            stringBuilder.append(this.f47555b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15331a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "matchUserId");
            this.f47554a = str;
            this.f47555b = str2;
        }

        @NotNull
        /* renamed from: a */
        public final String m57521a() {
            return this.f47554a;
        }

        @NotNull
        /* renamed from: b */
        public final String m57522b() {
            return this.f47555b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "", "apply", "(Lkotlin/Unit;)Lio/reactivex/Completable;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.o$b */
    static final class C17184b<T, R> implements Function<C15813i, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C17185o f52728a;
        /* renamed from: b */
        final /* synthetic */ C15331a f52729b;

        C17184b(C17185o c17185o, C15331a c15331a) {
            this.f52728a = c17185o;
            this.f52729b = c15331a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m63054a((C15813i) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m63054a(@NotNull C15813i c15813i) {
            C2668g.b(c15813i, "it");
            return this.f52728a.f52731b.m63060a(new C15332a(this.f52729b.m57521a(), this.f52729b.m57522b()));
        }
    }

    @Inject
    public C17185o(@NotNull C17177i c17177i, @NotNull C17188q c17188q) {
        C2668g.b(c17177i, "observeThrottledTypingEmissions");
        C2668g.b(c17188q, "sendTypingHeartbeat");
        this.f52730a = c17177i;
        this.f52731b = c17188q;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m63056a((C15331a) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m63056a(@NotNull C15331a c15331a) {
        C2668g.b(c15331a, "request");
        c15331a = this.f52730a.execute().c(new C17184b(this, c15331a));
        C2668g.a(c15331a, "observeThrottledTypingEm…          )\n            }");
        return c15331a;
    }
}
