package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.etl.event.iv;
import com.tinder.reactions.gestures.p395c.C16347e;
import com.tinder.reactions.gestures.p395c.C16347e.C14659a;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/reactions/analytics/GrandGestureShowPreviewEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/reactions/analytics/GrandGestureShowPreviewEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "gesturePositionProvider", "Lcom/tinder/reactions/gestures/provider/GesturePositionProvider;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "getChatBubbleSoundState", "Lcom/tinder/reactions/usecase/GetChatBubbleSoundState;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/reactions/gestures/provider/GesturePositionProvider;Lcom/tinder/domain/match/usecase/GetMatch;Lcom/tinder/reactions/usecase/GetChatBubbleSoundState;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.analytics.k */
public final class C16279k implements VoidUseCase<C14585a> {
    /* renamed from: a */
    private final C2630h f50693a;
    /* renamed from: b */
    private final C16347e f50694b;
    /* renamed from: c */
    private final GetMatch f50695c;
    /* renamed from: d */
    private final C16287f f50696d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tinder/reactions/analytics/GrandGestureShowPreviewEventDispatcher$Request;", "", "matchId", "", "gestureShowPreviewFrom", "Lcom/tinder/reactions/analytics/GestureShowPreviewFrom;", "shouldIgnoreSoundSetting", "", "(Ljava/lang/String;Lcom/tinder/reactions/analytics/GestureShowPreviewFrom;Z)V", "getGestureShowPreviewFrom", "()Lcom/tinder/reactions/analytics/GestureShowPreviewFrom;", "getMatchId", "()Ljava/lang/String;", "getShouldIgnoreSoundSetting", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.k$a */
    public static final class C14585a {
        @NotNull
        /* renamed from: a */
        private final String f46031a;
        @NotNull
        /* renamed from: b */
        private final GestureShowPreviewFrom f46032b;
        /* renamed from: c */
        private final boolean f46033c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14585a) {
                C14585a c14585a = (C14585a) obj;
                if (C2668g.a(this.f46031a, c14585a.f46031a) && C2668g.a(this.f46032b, c14585a.f46032b)) {
                    if ((this.f46033c == c14585a.f46033c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.f46031a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            GestureShowPreviewFrom gestureShowPreviewFrom = this.f46032b;
            if (gestureShowPreviewFrom != null) {
                i = gestureShowPreviewFrom.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            i = this.f46033c;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f46031a);
            stringBuilder.append(", gestureShowPreviewFrom=");
            stringBuilder.append(this.f46032b);
            stringBuilder.append(", shouldIgnoreSoundSetting=");
            stringBuilder.append(this.f46033c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14585a(@NotNull String str, @NotNull GestureShowPreviewFrom gestureShowPreviewFrom, boolean z) {
            C2668g.b(str, "matchId");
            C2668g.b(gestureShowPreviewFrom, "gestureShowPreviewFrom");
            this.f46031a = str;
            this.f46032b = gestureShowPreviewFrom;
            this.f46033c = z;
        }

        @NotNull
        /* renamed from: a */
        public final String m55635a() {
            return this.f46031a;
        }

        @NotNull
        /* renamed from: b */
        public final GestureShowPreviewFrom m55636b() {
            return this.f46032b;
        }

        /* renamed from: c */
        public final boolean m55637c() {
            return this.f46033c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/GrandGestureShowPreviewEvent;", "kotlin.jvm.PlatformType", "coreMatch", "Lcom/tinder/domain/match/model/CoreMatch;", "chatBubbleSoundState", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.k$b */
    static final class C17917b<T1, T2, R> implements Func2<T1, T2, R> {
        /* renamed from: a */
        final /* synthetic */ C14585a f55821a;
        /* renamed from: b */
        final /* synthetic */ C14659a f55822b;

        C17917b(C14585a c14585a, C14659a c14659a) {
            this.f55821a = c14585a;
            this.f55822b = c14659a;
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m65222a((CoreMatch) obj, ((Boolean) obj2).booleanValue());
        }

        /* renamed from: a */
        public final iv m65222a(@NotNull CoreMatch coreMatch, boolean z) {
            C2668g.b(coreMatch, "coreMatch");
            coreMatch = iv.a().c(this.f55821a.m55635a()).d(coreMatch.getPerson().id()).b(this.f55821a.m55636b().getAnalyticsValue()).a(Integer.valueOf(this.f55822b.m55887a())).b(Integer.valueOf(this.f55822b.m55888b())).a(this.f55822b.m55889c().getGestureId());
            if (!this.f55821a.m55637c()) {
                coreMatch.a(Boolean.valueOf(z));
            }
            return coreMatch.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/GrandGestureShowPreviewEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.k$c */
    static final class C17918c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16279k f55823a;

        C17918c(C16279k c16279k) {
            this.f55823a = c16279k;
        }

        public /* synthetic */ Object call(Object obj) {
            m65223a((iv) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m65223a(iv ivVar) {
            this.f55823a.f50693a.a(ivVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.k$f */
    static final class C17919f<T, R> implements Func1<Optional<Match>, Boolean> {
        /* renamed from: a */
        public static final C17919f f55824a = new C17919f();

        C17919f() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65224a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m65224a(Optional<Match> optional) {
            C2668g.a(optional, "optionalMatch");
            return optional.m59132c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "optionalMatch", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.k$g */
    static final class C17920g<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17920g f55825a = new C17920g();

        C17920g() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65225a((Optional) obj);
        }

        /* renamed from: a */
        public final Match m65225a(Optional<Match> optional) {
            return (Match) optional.m59127b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.k$d */
    static final class C18661d implements Action0 {
        /* renamed from: a */
        public static final C18661d f58132a = new C18661d();

        C18661d() {
        }

        public final void call() {
            C0001a.b("GrandGestureShowPreviewEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.k$e */
    static final class C18662e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18662e f58133a = new C18662e();

        C18662e() {
        }

        public /* synthetic */ void call(Object obj) {
            m67094a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67094a(Throwable th) {
            C0001a.c(th, "GrandGestureShowPreviewEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C16279k(@NotNull C2630h c2630h, @NotNull C16347e c16347e, @NotNull GetMatch getMatch, @NotNull C16287f c16287f) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c16347e, "gesturePositionProvider");
        C2668g.b(getMatch, "getMatch");
        C2668g.b(c16287f, "getChatBubbleSoundState");
        this.f50693a = c2630h;
        this.f50694b = c16347e;
        this.f50695c = getMatch;
        this.f50696d = c16287f;
    }

    public /* synthetic */ void execute(Object obj) {
        m61467a((C14585a) obj);
    }

    /* renamed from: a */
    public void m61467a(@NotNull C14585a c14585a) {
        C2668g.b(c14585a, "request");
        Single.a(this.f50695c.execute(c14585a.m55635a()).f(C17919f.f55824a).k(C17920g.f55825a).a(CoreMatch.class).h().a(), this.f50696d.execute().h().a(), new C17917b(c14585a, this.f50694b.m61660a())).d(new C17918c(this)).b().b(Schedulers.io()).a(C18661d.f58132a, C18662e.f58133a);
    }
}
