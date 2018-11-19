package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.etl.event.iq;
import com.tinder.reactions.analytics.model.GestureDrawerInteractMethod;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/reactions/analytics/GrandGestureCloseEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/reactions/analytics/GrandGestureCloseEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/match/usecase/GetMatch;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.analytics.g */
public final class C16276g implements VoidUseCase<C14582a> {
    /* renamed from: a */
    private final C2630h f50686a;
    /* renamed from: b */
    private final GetMatch f50687b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/reactions/analytics/GrandGestureCloseEventDispatcher$Request;", "", "matchId", "", "gestureDrawerInteractMethod", "Lcom/tinder/reactions/analytics/model/GestureDrawerInteractMethod;", "(Ljava/lang/String;Lcom/tinder/reactions/analytics/model/GestureDrawerInteractMethod;)V", "getGestureDrawerInteractMethod", "()Lcom/tinder/reactions/analytics/model/GestureDrawerInteractMethod;", "getMatchId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.g$a */
    public static final class C14582a {
        @NotNull
        /* renamed from: a */
        private final String f46023a;
        @NotNull
        /* renamed from: b */
        private final GestureDrawerInteractMethod f46024b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14582a) {
                    C14582a c14582a = (C14582a) obj;
                    if (C2668g.a(this.f46023a, c14582a.f46023a) && C2668g.a(this.f46024b, c14582a.f46024b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f46023a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            GestureDrawerInteractMethod gestureDrawerInteractMethod = this.f46024b;
            if (gestureDrawerInteractMethod != null) {
                i = gestureDrawerInteractMethod.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f46023a);
            stringBuilder.append(", gestureDrawerInteractMethod=");
            stringBuilder.append(this.f46024b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14582a(@NotNull String str, @NotNull GestureDrawerInteractMethod gestureDrawerInteractMethod) {
            C2668g.b(str, "matchId");
            C2668g.b(gestureDrawerInteractMethod, "gestureDrawerInteractMethod");
            this.f46023a = str;
            this.f46024b = gestureDrawerInteractMethod;
        }

        @NotNull
        /* renamed from: a */
        public final String m55627a() {
            return this.f46023a;
        }

        @NotNull
        /* renamed from: b */
        public final GestureDrawerInteractMethod m55628b() {
            return this.f46024b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.g$b */
    static final class C17906b<T, R> implements Func1<Optional<Match>, Boolean> {
        /* renamed from: a */
        public static final C17906b f55808a = new C17906b();

        C17906b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65209a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m65209a(Optional<Match> optional) {
            C2668g.a(optional, "optionalMatch");
            return optional.m59132c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/GrandGestureCloseEvent;", "kotlin.jvm.PlatformType", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.g$c */
    static final class C17907c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14582a f55809a;

        C17907c(C14582a c14582a) {
            this.f55809a = c14582a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65210a((Optional) obj);
        }

        /* renamed from: a */
        public final iq m65210a(Optional<Match> optional) {
            optional = optional.m59127b();
            if (optional == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.match.model.CoreMatch");
            }
            return iq.a().b(this.f55809a.m55627a()).c(((CoreMatch) optional).getPerson().id()).a(this.f55809a.m55628b().getAnalyticsValue()).a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/GrandGestureCloseEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.g$d */
    static final class C17908d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16276g f55810a;

        C17908d(C16276g c16276g) {
            this.f55810a = c16276g;
        }

        public /* synthetic */ Object call(Object obj) {
            m65211a((iq) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m65211a(iq iqVar) {
            this.f55810a.f50686a.a(iqVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.g$e */
    static final class C18655e implements Action0 {
        /* renamed from: a */
        public static final C18655e f58126a = new C18655e();

        C18655e() {
        }

        public final void call() {
            C0001a.b("GrandGestureCloseEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.g$f */
    static final class C18656f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18656f f58127a = new C18656f();

        C18656f() {
        }

        public /* synthetic */ void call(Object obj) {
            m67091a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67091a(Throwable th) {
            C0001a.c(th, "GrandGestureCloseEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C16276g(@NotNull C2630h c2630h, @NotNull GetMatch getMatch) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(getMatch, "getMatch");
        this.f50686a = c2630h;
        this.f50687b = getMatch;
    }

    public /* synthetic */ void execute(Object obj) {
        m61459a((C14582a) obj);
    }

    /* renamed from: a */
    public void m61459a(@NotNull C14582a c14582a) {
        C2668g.b(c14582a, "request");
        this.f50687b.execute(c14582a.m55627a()).f(C17906b.f55808a).k(new C17907c(c14582a)).k(new C17908d(this)).b().b(Schedulers.io()).a(C18655e.f58126a, C18656f.f58127a);
    }
}
