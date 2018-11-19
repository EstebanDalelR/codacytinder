package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.etl.event.iw;
import com.tinder.reactions.gestures.p395c.C16347e;
import com.tinder.reactions.gestures.p395c.C16347e.C14659a;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/reactions/analytics/GrandGestureShowTutorialEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/reactions/analytics/GrandGestureShowTutorialEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "gesturePositionProvider", "Lcom/tinder/reactions/gestures/provider/GesturePositionProvider;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/reactions/gestures/provider/GesturePositionProvider;Lcom/tinder/domain/match/usecase/GetMatch;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.analytics.l */
public final class C16280l implements VoidUseCase<C14586a> {
    /* renamed from: a */
    private final C2630h f50697a;
    /* renamed from: b */
    private final C16347e f50698b;
    /* renamed from: c */
    private final GetMatch f50699c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/reactions/analytics/GrandGestureShowTutorialEventDispatcher$Request;", "", "matchId", "", "(Ljava/lang/String;)V", "getMatchId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.l$a */
    public static final class C14586a {
        @NotNull
        /* renamed from: a */
        private final String f46034a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14586a) {
                    if (C2668g.a(this.f46034a, ((C14586a) obj).f46034a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f46034a;
            return str != null ? str.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f46034a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14586a(@NotNull String str) {
            C2668g.b(str, "matchId");
            this.f46034a = str;
        }

        @NotNull
        /* renamed from: a */
        public final String m55638a() {
            return this.f46034a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.l$b */
    static final class C17921b<T, R> implements Func1<Optional<Match>, Boolean> {
        /* renamed from: a */
        public static final C17921b f55826a = new C17921b();

        C17921b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65226a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m65226a(Optional<Match> optional) {
            C2668g.a(optional, "optionalMatch");
            return optional.m59132c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/GrandGestureShowTutorialEvent;", "kotlin.jvm.PlatformType", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.l$c */
    static final class C17922c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16280l f55827a;
        /* renamed from: b */
        final /* synthetic */ C14586a f55828b;
        /* renamed from: c */
        final /* synthetic */ C14659a f55829c;

        C17922c(C16280l c16280l, C14586a c14586a, C14659a c14659a) {
            this.f55827a = c16280l;
            this.f55828b = c14586a;
            this.f55829c = c14659a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65227a((Optional) obj);
        }

        /* renamed from: a */
        public final iw m65227a(Optional<Match> optional) {
            optional = optional.m59127b();
            if (optional == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.match.model.CoreMatch");
            }
            return iw.a().b(this.f55828b.m55638a()).c(((CoreMatch) optional).getPerson().id()).a(this.f55829c.m55889c().getGestureId()).a(Integer.valueOf(this.f55829c.m55887a())).b(Integer.valueOf(this.f55827a.f50698b.m61660a().m55888b())).a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/GrandGestureShowTutorialEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.l$d */
    static final class C17923d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16280l f55830a;

        C17923d(C16280l c16280l) {
            this.f55830a = c16280l;
        }

        public /* synthetic */ Object call(Object obj) {
            m65228a((iw) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m65228a(iw iwVar) {
            this.f55830a.f50697a.a(iwVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.l$e */
    static final class C18663e implements Action0 {
        /* renamed from: a */
        public static final C18663e f58134a = new C18663e();

        C18663e() {
        }

        public final void call() {
            C0001a.b("GrandGestureShowTutorialEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.l$f */
    static final class C18664f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18664f f58135a = new C18664f();

        C18664f() {
        }

        public /* synthetic */ void call(Object obj) {
            m67095a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67095a(Throwable th) {
            C0001a.c(th, "GrandGestureShowTutorialEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C16280l(@NotNull C2630h c2630h, @NotNull C16347e c16347e, @NotNull GetMatch getMatch) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c16347e, "gesturePositionProvider");
        C2668g.b(getMatch, "getMatch");
        this.f50697a = c2630h;
        this.f50698b = c16347e;
        this.f50699c = getMatch;
    }

    public /* synthetic */ void execute(Object obj) {
        m61470a((C14586a) obj);
    }

    /* renamed from: a */
    public void m61470a(@NotNull C14586a c14586a) {
        C2668g.b(c14586a, "request");
        this.f50699c.execute(c14586a.m55638a()).f(C17921b.f55826a).k(new C17922c(this, c14586a, this.f50698b.m61660a())).k(new C17923d(this)).b().b(Schedulers.io()).a(C18663e.f58134a, C18664f.f58135a);
    }
}
