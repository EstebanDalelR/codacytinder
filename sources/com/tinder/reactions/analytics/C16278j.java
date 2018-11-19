package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.etl.event.it;
import com.tinder.reactions.p385c.C16287f;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/reactions/analytics/GrandGestureShowAnimationEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/reactions/analytics/GrandGestureShowAnimationEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "getChatBubbleSoundState", "Lcom/tinder/reactions/usecase/GetChatBubbleSoundState;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/match/usecase/GetMatch;Lcom/tinder/reactions/usecase/GetChatBubbleSoundState;)V", "execute", "", "request", "isChatBubbleType", "", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.analytics.j */
public final class C16278j implements VoidUseCase<C14584a> {
    /* renamed from: a */
    private final C2630h f50690a;
    /* renamed from: b */
    private final GetMatch f50691b;
    /* renamed from: c */
    private final C16287f f50692c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/tinder/reactions/analytics/GrandGestureShowAnimationEventDispatcher$Request;", "", "matchId", "", "showAnimationFrom", "Lcom/tinder/reactions/analytics/ShowAnimationFrom;", "showAnimationFor", "Lcom/tinder/reactions/analytics/ShowAnimationFor;", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "(Ljava/lang/String;Lcom/tinder/reactions/analytics/ShowAnimationFrom;Lcom/tinder/reactions/analytics/ShowAnimationFor;Lcom/tinder/domain/reactions/model/GrandGestureType;)V", "getGrandGestureType", "()Lcom/tinder/domain/reactions/model/GrandGestureType;", "getMatchId", "()Ljava/lang/String;", "getShowAnimationFor", "()Lcom/tinder/reactions/analytics/ShowAnimationFor;", "getShowAnimationFrom", "()Lcom/tinder/reactions/analytics/ShowAnimationFrom;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.j$a */
    public static final class C14584a {
        @NotNull
        /* renamed from: a */
        private final String f46027a;
        @NotNull
        /* renamed from: b */
        private final ShowAnimationFrom f46028b;
        @NotNull
        /* renamed from: c */
        private final ShowAnimationFor f46029c;
        @NotNull
        /* renamed from: d */
        private final GrandGestureType f46030d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14584a) {
                    C14584a c14584a = (C14584a) obj;
                    if (C2668g.a(this.f46027a, c14584a.f46027a) && C2668g.a(this.f46028b, c14584a.f46028b) && C2668g.a(this.f46029c, c14584a.f46029c) && C2668g.a(this.f46030d, c14584a.f46030d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f46027a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            ShowAnimationFrom showAnimationFrom = this.f46028b;
            hashCode = (hashCode + (showAnimationFrom != null ? showAnimationFrom.hashCode() : 0)) * 31;
            ShowAnimationFor showAnimationFor = this.f46029c;
            hashCode = (hashCode + (showAnimationFor != null ? showAnimationFor.hashCode() : 0)) * 31;
            GrandGestureType grandGestureType = this.f46030d;
            if (grandGestureType != null) {
                i = grandGestureType.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f46027a);
            stringBuilder.append(", showAnimationFrom=");
            stringBuilder.append(this.f46028b);
            stringBuilder.append(", showAnimationFor=");
            stringBuilder.append(this.f46029c);
            stringBuilder.append(", grandGestureType=");
            stringBuilder.append(this.f46030d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14584a(@NotNull String str, @NotNull ShowAnimationFrom showAnimationFrom, @NotNull ShowAnimationFor showAnimationFor, @NotNull GrandGestureType grandGestureType) {
            C2668g.b(str, "matchId");
            C2668g.b(showAnimationFrom, "showAnimationFrom");
            C2668g.b(showAnimationFor, "showAnimationFor");
            C2668g.b(grandGestureType, "grandGestureType");
            this.f46027a = str;
            this.f46028b = showAnimationFrom;
            this.f46029c = showAnimationFor;
            this.f46030d = grandGestureType;
        }

        @NotNull
        /* renamed from: a */
        public final String m55631a() {
            return this.f46027a;
        }

        @NotNull
        /* renamed from: b */
        public final ShowAnimationFrom m55632b() {
            return this.f46028b;
        }

        @NotNull
        /* renamed from: c */
        public final ShowAnimationFor m55633c() {
            return this.f46029c;
        }

        @NotNull
        /* renamed from: d */
        public final GrandGestureType m55634d() {
            return this.f46030d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/GrandGestureShowAnimationEvent;", "kotlin.jvm.PlatformType", "coreMatch", "Lcom/tinder/domain/match/model/CoreMatch;", "chatBubbleSoundState", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.j$b */
    static final class C17913b<T1, T2, R> implements Func2<T1, T2, R> {
        /* renamed from: a */
        final /* synthetic */ C16278j f55816a;
        /* renamed from: b */
        final /* synthetic */ C14584a f55817b;

        C17913b(C16278j c16278j, C14584a c14584a) {
            this.f55816a = c16278j;
            this.f55817b = c14584a;
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m65218a((CoreMatch) obj, ((Boolean) obj2).booleanValue());
        }

        /* renamed from: a */
        public final it m65218a(@NotNull CoreMatch coreMatch, boolean z) {
            C2668g.b(coreMatch, "coreMatch");
            GrandGestureType d = this.f55817b.m55634d();
            coreMatch = it.a().d(this.f55817b.m55631a()).e(coreMatch.getPerson().id()).c(this.f55817b.m55632b().getAnalyticsValue()).b(this.f55817b.m55633c().getAnalyticsValue()).a(d.getGestureId());
            if (this.f55816a.m61463a(d)) {
                coreMatch.a(Boolean.valueOf(z));
            }
            return coreMatch.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/GrandGestureShowAnimationEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.j$c */
    static final class C17914c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16278j f55818a;

        C17914c(C16278j c16278j) {
            this.f55818a = c16278j;
        }

        public /* synthetic */ Object call(Object obj) {
            m65219a((it) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m65219a(it itVar) {
            this.f55818a.f50690a.a(itVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.j$f */
    static final class C17915f<T, R> implements Func1<Optional<Match>, Boolean> {
        /* renamed from: a */
        public static final C17915f f55819a = new C17915f();

        C17915f() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65220a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m65220a(Optional<Match> optional) {
            C2668g.a(optional, "optionalMatch");
            return optional.m59132c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "optionalMatch", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.j$g */
    static final class C17916g<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17916g f55820a = new C17916g();

        C17916g() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65221a((Optional) obj);
        }

        /* renamed from: a */
        public final Match m65221a(Optional<Match> optional) {
            return (Match) optional.m59127b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.j$d */
    static final class C18659d implements Action0 {
        /* renamed from: a */
        public static final C18659d f58130a = new C18659d();

        C18659d() {
        }

        public final void call() {
            C0001a.b("GrandGestureShowAnimationEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.j$e */
    static final class C18660e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18660e f58131a = new C18660e();

        C18660e() {
        }

        public /* synthetic */ void call(Object obj) {
            m67093a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67093a(Throwable th) {
            C0001a.c(th, "GrandGestureShowAnimationEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C16278j(@NotNull C2630h c2630h, @NotNull GetMatch getMatch, @NotNull C16287f c16287f) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(getMatch, "getMatch");
        C2668g.b(c16287f, "getChatBubbleSoundState");
        this.f50690a = c2630h;
        this.f50691b = getMatch;
        this.f50692c = c16287f;
    }

    public /* synthetic */ void execute(Object obj) {
        m61465a((C14584a) obj);
    }

    /* renamed from: a */
    public void m61465a(@NotNull C14584a c14584a) {
        C2668g.b(c14584a, "request");
        Single.a(this.f50691b.execute(c14584a.m55631a()).f(C17915f.f55819a).k(C17916g.f55820a).a(CoreMatch.class).h().a(), this.f50692c.execute().h().a(), new C17913b(this, c14584a)).d(new C17914c(this)).b().b(Schedulers.io()).a(C18659d.f58130a, C18660e.f58131a);
    }

    /* renamed from: a */
    private final boolean m61463a(GrandGestureType grandGestureType) {
        if (!(grandGestureType == GrandGestureType.REALLY || grandGestureType == GrandGestureType.UGH)) {
            if (grandGestureType != GrandGestureType.NOPE) {
                return null;
            }
        }
        return true;
    }
}
