package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.etl.event.iu;
import com.tinder.utils.RxUtils;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/reactions/analytics/AddGrandGestureShowChatIntroEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/reactions/analytics/AddGrandGestureShowChatIntroEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/match/usecase/GetMatch;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.analytics.d */
public final class C16274d implements VoidUseCase<C14581a> {
    /* renamed from: a */
    private final C2630h f50683a;
    /* renamed from: b */
    private final GetMatch f50684b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/reactions/analytics/AddGrandGestureShowChatIntroEvent$Request;", "", "matchId", "", "gestureIntroFrom", "Lcom/tinder/reactions/analytics/GestureIntroFrom;", "(Ljava/lang/String;Lcom/tinder/reactions/analytics/GestureIntroFrom;)V", "getGestureIntroFrom", "()Lcom/tinder/reactions/analytics/GestureIntroFrom;", "getMatchId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.d$a */
    public static final class C14581a {
        @NotNull
        /* renamed from: a */
        private final String f46021a;
        @NotNull
        /* renamed from: b */
        private final GestureIntroFrom f46022b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14581a) {
                    C14581a c14581a = (C14581a) obj;
                    if (C2668g.a(this.f46021a, c14581a.f46021a) && C2668g.a(this.f46022b, c14581a.f46022b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f46021a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            GestureIntroFrom gestureIntroFrom = this.f46022b;
            if (gestureIntroFrom != null) {
                i = gestureIntroFrom.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f46021a);
            stringBuilder.append(", gestureIntroFrom=");
            stringBuilder.append(this.f46022b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14581a(@NotNull String str, @NotNull GestureIntroFrom gestureIntroFrom) {
            C2668g.b(str, "matchId");
            C2668g.b(gestureIntroFrom, "gestureIntroFrom");
            this.f46021a = str;
            this.f46022b = gestureIntroFrom;
        }

        @NotNull
        /* renamed from: a */
        public final String m55625a() {
            return this.f46021a;
        }

        @NotNull
        /* renamed from: b */
        public final GestureIntroFrom m55626b() {
            return this.f46022b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.d$b */
    static final class C17900b<T, R> implements Func1<Optional<Match>, Boolean> {
        /* renamed from: a */
        public static final C17900b f55801a = new C17900b();

        C17900b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65201a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m65201a(Optional<Match> optional) {
            C2668g.a(optional, "optionalMatch");
            return optional.m59132c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "optionalMatch", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.d$c */
    static final class C17901c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17901c f55802a = new C17901c();

        C17901c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65202a((Optional) obj);
        }

        /* renamed from: a */
        public final Match m65202a(Optional<Match> optional) {
            return (Match) optional.m59127b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "coreMatch", "Lcom/tinder/domain/match/model/CoreMatch;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.d$d */
    static final class C17902d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17902d f55803a = new C17902d();

        C17902d() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65203a((CoreMatch) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m65203a(CoreMatch coreMatch) {
            return coreMatch.getPerson().id();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/GrandGestureShowIntroEvent;", "kotlin.jvm.PlatformType", "otherId", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.d$e */
    static final class C17903e<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14581a f55804a;

        C17903e(C14581a c14581a) {
            this.f55804a = c14581a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65204a((String) obj);
        }

        /* renamed from: a */
        public final iu m65204a(@NotNull String str) {
            C2668g.b(str, "otherId");
            return iu.a().b(this.f55804a.m55625a()).a(this.f55804a.m55626b().getAnalyticsValue()).c(str).a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/GrandGestureShowIntroEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.d$f */
    static final class C17904f<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16274d f55805a;

        C17904f(C16274d c16274d) {
            this.f55805a = c16274d;
        }

        public /* synthetic */ Object call(Object obj) {
            m65205a((iu) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m65205a(iu iuVar) {
            this.f55805a.f50683a.a(iuVar);
        }
    }

    @Inject
    public C16274d(@NotNull C2630h c2630h, @NotNull GetMatch getMatch) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(getMatch, "getMatch");
        this.f50683a = c2630h;
        this.f50684b = getMatch;
    }

    public /* synthetic */ void execute(Object obj) {
        m61455a((C14581a) obj);
    }

    /* renamed from: a */
    public void m61455a(@NotNull C14581a c14581a) {
        C2668g.b(c14581a, "request");
        this.f50684b.execute(c14581a.m55625a()).f(C17900b.f55801a).k(C17901c.f55802a).a(CoreMatch.class).k(C17902d.f55803a).k(new C17903e(c14581a)).k(new C17904f(this)).b().b(Schedulers.io()).b(RxUtils.b());
    }
}
