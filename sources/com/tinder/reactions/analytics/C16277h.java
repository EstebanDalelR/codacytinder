package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.etl.event.is;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/reactions/analytics/GrandGestureOpenEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/reactions/analytics/GrandGestureOpenEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/match/usecase/GetMatch;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.analytics.h */
public final class C16277h implements VoidUseCase<C14583a> {
    /* renamed from: a */
    private final C2630h f50688a;
    /* renamed from: b */
    private final GetMatch f50689b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/reactions/analytics/GrandGestureOpenEventDispatcher$Request;", "", "matchId", "", "gestureDrawerInteractMethod", "Lcom/tinder/reactions/analytics/model/GestureDrawerInteractMethod;", "(Ljava/lang/String;Lcom/tinder/reactions/analytics/model/GestureDrawerInteractMethod;)V", "getGestureDrawerInteractMethod", "()Lcom/tinder/reactions/analytics/model/GestureDrawerInteractMethod;", "getMatchId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.h$a */
    public static final class C14583a {
        @NotNull
        /* renamed from: a */
        private final String f46025a;
        @NotNull
        /* renamed from: b */
        private final GestureDrawerInteractMethod f46026b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14583a) {
                    C14583a c14583a = (C14583a) obj;
                    if (C2668g.a(this.f46025a, c14583a.f46025a) && C2668g.a(this.f46026b, c14583a.f46026b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f46025a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            GestureDrawerInteractMethod gestureDrawerInteractMethod = this.f46026b;
            if (gestureDrawerInteractMethod != null) {
                i = gestureDrawerInteractMethod.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f46025a);
            stringBuilder.append(", gestureDrawerInteractMethod=");
            stringBuilder.append(this.f46026b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14583a(@NotNull String str, @NotNull GestureDrawerInteractMethod gestureDrawerInteractMethod) {
            C2668g.b(str, "matchId");
            C2668g.b(gestureDrawerInteractMethod, "gestureDrawerInteractMethod");
            this.f46025a = str;
            this.f46026b = gestureDrawerInteractMethod;
        }

        @NotNull
        /* renamed from: a */
        public final String m55629a() {
            return this.f46025a;
        }

        @NotNull
        /* renamed from: b */
        public final GestureDrawerInteractMethod m55630b() {
            return this.f46026b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.h$b */
    static final class C17909b<T, R> implements Func1<Optional<Match>, Boolean> {
        /* renamed from: a */
        public static final C17909b f55811a = new C17909b();

        C17909b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65212a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m65212a(Optional<Match> optional) {
            C2668g.a(optional, "optionalMatch");
            return optional.m59132c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/GrandGestureOpenEvent;", "kotlin.jvm.PlatformType", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.h$c */
    static final class C17910c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14583a f55812a;

        C17910c(C14583a c14583a) {
            this.f55812a = c14583a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65213a((Optional) obj);
        }

        /* renamed from: a */
        public final is m65213a(Optional<Match> optional) {
            optional = optional.m59127b();
            if (optional == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.match.model.CoreMatch");
            }
            return is.a().b(this.f55812a.m55629a()).c(((CoreMatch) optional).getPerson().id()).a(this.f55812a.m55630b().getAnalyticsValue()).a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/GrandGestureOpenEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.h$d */
    static final class C17911d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16277h f55813a;

        C17911d(C16277h c16277h) {
            this.f55813a = c16277h;
        }

        public /* synthetic */ Object call(Object obj) {
            m65214a((is) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m65214a(is isVar) {
            this.f55813a.f50688a.a(isVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.h$e */
    static final class C18657e implements Action0 {
        /* renamed from: a */
        public static final C18657e f58128a = new C18657e();

        C18657e() {
        }

        public final void call() {
            C0001a.b("GrandGestureOpenEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.h$f */
    static final class C18658f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18658f f58129a = new C18658f();

        C18658f() {
        }

        public /* synthetic */ void call(Object obj) {
            m67092a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67092a(Throwable th) {
            C0001a.c(th, "GrandGestureOpenEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C16277h(@NotNull C2630h c2630h, @NotNull GetMatch getMatch) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(getMatch, "getMatch");
        this.f50688a = c2630h;
        this.f50689b = getMatch;
    }

    public /* synthetic */ void execute(Object obj) {
        m61461a((C14583a) obj);
    }

    /* renamed from: a */
    public void m61461a(@NotNull C14583a c14583a) {
        C2668g.b(c14583a, "request");
        this.f50689b.execute(c14583a.m55629a()).f(C17909b.f55811a).k(new C17910c(c14583a)).k(new C17911d(this)).b().b(Schedulers.io()).a(C18657e.f58128a, C18658f.f58129a);
    }
}
