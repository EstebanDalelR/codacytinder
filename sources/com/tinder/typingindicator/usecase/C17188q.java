package com.tinder.typingindicator.usecase;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.typingindicator.model.TypingIndicator;
import com.tinder.typingindicator.model.TypingIndicator.State;
import com.tinder.typingindicator.model.TypingType.C17162b;
import com.tinder.typingindicator.repository.TypingIndicatorRepository;
import com.tinder.typingindicator.usecase.C17172a.C15328a;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/typingindicator/usecase/SendTypingHeartbeat;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/typingindicator/usecase/SendTypingHeartbeat$Request;", "typingIndicatorRepository", "Lcom/tinder/typingindicator/repository/TypingIndicatorRepository;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "addChatTypingEvent", "Lcom/tinder/typingindicator/usecase/AddChatTypingEvent;", "(Lcom/tinder/typingindicator/repository/TypingIndicatorRepository;Lkotlin/jvm/functions/Function0;Lcom/tinder/typingindicator/usecase/AddChatTypingEvent;)V", "addChatTypingSendEvent", "Lio/reactivex/Completable;", "matchId", "", "execute", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.usecase.q */
public final class C17188q implements CompletableUseCase<C15332a> {
    /* renamed from: a */
    private final TypingIndicatorRepository f52735a;
    /* renamed from: b */
    private final Function0<DateTime> f52736b;
    /* renamed from: c */
    private final C17172a f52737c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/typingindicator/usecase/SendTypingHeartbeat$Request;", "", "matchId", "", "toUserId", "(Ljava/lang/String;Ljava/lang/String;)V", "getMatchId", "()Ljava/lang/String;", "getToUserId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.q$a */
    public static final class C15332a {
        @NotNull
        /* renamed from: a */
        private final String f47556a;
        @NotNull
        /* renamed from: b */
        private final String f47557b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15332a) {
                    C15332a c15332a = (C15332a) obj;
                    if (C2668g.a(this.f47556a, c15332a.f47556a) && C2668g.a(this.f47557b, c15332a.f47557b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f47556a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f47557b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f47556a);
            stringBuilder.append(", toUserId=");
            stringBuilder.append(this.f47557b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15332a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "toUserId");
            this.f47556a = str;
            this.f47557b = str2;
        }

        @NotNull
        /* renamed from: a */
        public final String m57523a() {
            return this.f47556a;
        }

        @NotNull
        /* renamed from: b */
        public final String m57524b() {
            return this.f47557b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.q$b */
    static final class C17187b implements Action {
        /* renamed from: a */
        final /* synthetic */ C17188q f52733a;
        /* renamed from: b */
        final /* synthetic */ String f52734b;

        C17187b(C17188q c17188q, String str) {
            this.f52733a = c17188q;
            this.f52734b = str;
        }

        public final void run() {
            this.f52733a.f52737c.m63047a(new C15328a(this.f52734b, C17162b.f52693a));
        }
    }

    @Inject
    public C17188q(@NotNull TypingIndicatorRepository typingIndicatorRepository, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0, @NotNull C17172a c17172a) {
        C2668g.b(typingIndicatorRepository, "typingIndicatorRepository");
        C2668g.b(function0, "dateTimeProvider");
        C2668g.b(c17172a, "addChatTypingEvent");
        this.f52735a = typingIndicatorRepository;
        this.f52736b = function0;
        this.f52737c = c17172a;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m63060a((C15332a) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m63060a(@NotNull C15332a c15332a) {
        C2668g.b(c15332a, "request");
        c15332a = this.f52735a.addTypingIndicator(new TypingIndicator(c15332a.m57523a(), c15332a.m57524b(), (DateTime) this.f52736b.invoke(), State.ACTIVE)).b(m63059a(c15332a.m57523a()));
        C2668g.a(c15332a, "typingIndicatorRepositor…Event(matchId = matchId))");
        C2668g.a(c15332a, "with(request) {\n        …hId = matchId))\n        }");
        return c15332a;
    }

    /* renamed from: a */
    private final C3956a m63059a(String str) {
        str = C3956a.a(new C17187b(this, str)).c();
        C2668g.a(str, "Completable\n            …       .onErrorComplete()");
        return str;
    }
}
