package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.etl.event.ir;
import com.tinder.reactions.analytics.model.GestureRespondIntro;
import com.tinder.utils.RxUtils;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/reactions/analytics/AddGrandGestureDismissChatIntroEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/reactions/analytics/AddGrandGestureDismissChatIntroEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/match/usecase/GetMatch;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.analytics.a */
public final class C16272a implements VoidUseCase<C14579a> {
    /* renamed from: a */
    private final C2630h f50680a;
    /* renamed from: b */
    private final GetMatch f50681b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tinder/reactions/analytics/AddGrandGestureDismissChatIntroEvent$Request;", "", "matchId", "", "gestureIntroFrom", "Lcom/tinder/reactions/analytics/GestureIntroFrom;", "gestureRespondIntro", "Lcom/tinder/reactions/analytics/model/GestureRespondIntro;", "(Ljava/lang/String;Lcom/tinder/reactions/analytics/GestureIntroFrom;Lcom/tinder/reactions/analytics/model/GestureRespondIntro;)V", "getGestureIntroFrom", "()Lcom/tinder/reactions/analytics/GestureIntroFrom;", "getGestureRespondIntro", "()Lcom/tinder/reactions/analytics/model/GestureRespondIntro;", "getMatchId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.a$a */
    public static final class C14579a {
        @NotNull
        /* renamed from: a */
        private final String f46016a;
        @NotNull
        /* renamed from: b */
        private final GestureIntroFrom f46017b;
        @NotNull
        /* renamed from: c */
        private final GestureRespondIntro f46018c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14579a) {
                    C14579a c14579a = (C14579a) obj;
                    if (C2668g.a(this.f46016a, c14579a.f46016a) && C2668g.a(this.f46017b, c14579a.f46017b) && C2668g.a(this.f46018c, c14579a.f46018c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f46016a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            GestureIntroFrom gestureIntroFrom = this.f46017b;
            hashCode = (hashCode + (gestureIntroFrom != null ? gestureIntroFrom.hashCode() : 0)) * 31;
            GestureRespondIntro gestureRespondIntro = this.f46018c;
            if (gestureRespondIntro != null) {
                i = gestureRespondIntro.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f46016a);
            stringBuilder.append(", gestureIntroFrom=");
            stringBuilder.append(this.f46017b);
            stringBuilder.append(", gestureRespondIntro=");
            stringBuilder.append(this.f46018c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14579a(@NotNull String str, @NotNull GestureIntroFrom gestureIntroFrom, @NotNull GestureRespondIntro gestureRespondIntro) {
            C2668g.b(str, "matchId");
            C2668g.b(gestureIntroFrom, "gestureIntroFrom");
            C2668g.b(gestureRespondIntro, "gestureRespondIntro");
            this.f46016a = str;
            this.f46017b = gestureIntroFrom;
            this.f46018c = gestureRespondIntro;
        }

        @NotNull
        /* renamed from: a */
        public final String m55620a() {
            return this.f46016a;
        }

        @NotNull
        /* renamed from: b */
        public final GestureIntroFrom m55621b() {
            return this.f46017b;
        }

        @NotNull
        /* renamed from: c */
        public final GestureRespondIntro m55622c() {
            return this.f46018c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.a$b */
    static final class C17894b<T, R> implements Func1<Optional<Match>, Boolean> {
        /* renamed from: a */
        public static final C17894b f55794a = new C17894b();

        C17894b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65193a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m65193a(Optional<Match> optional) {
            C2668g.a(optional, "optionalMatch");
            return optional.m59132c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "optionalMatch", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.a$c */
    static final class C17895c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17895c f55795a = new C17895c();

        C17895c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65194a((Optional) obj);
        }

        /* renamed from: a */
        public final Match m65194a(Optional<Match> optional) {
            return (Match) optional.m59127b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "coreMatch", "Lcom/tinder/domain/match/model/CoreMatch;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.a$d */
    static final class C17896d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17896d f55796a = new C17896d();

        C17896d() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65195a((CoreMatch) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m65195a(CoreMatch coreMatch) {
            return coreMatch.getPerson().id();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/GrandGestureDismissIntroEvent;", "kotlin.jvm.PlatformType", "otherId", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.a$e */
    static final class C17897e<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14579a f55797a;

        C17897e(C14579a c14579a) {
            this.f55797a = c14579a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65196a((String) obj);
        }

        /* renamed from: a */
        public final ir m65196a(@NotNull String str) {
            C2668g.b(str, "otherId");
            return ir.a().c(this.f55797a.m55620a()).a(this.f55797a.m55621b().getAnalyticsValue()).b(this.f55797a.m55622c().getAnalyticsValue()).d(str).a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/GrandGestureDismissIntroEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.a$f */
    static final class C17898f<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16272a f55798a;

        C17898f(C16272a c16272a) {
            this.f55798a = c16272a;
        }

        public /* synthetic */ Object call(Object obj) {
            m65197a((ir) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m65197a(ir irVar) {
            this.f55798a.f50680a.a(irVar);
        }
    }

    @Inject
    public C16272a(@NotNull C2630h c2630h, @NotNull GetMatch getMatch) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(getMatch, "getMatch");
        this.f50680a = c2630h;
        this.f50681b = getMatch;
    }

    public /* synthetic */ void execute(Object obj) {
        m61451a((C14579a) obj);
    }

    /* renamed from: a */
    public void m61451a(@NotNull C14579a c14579a) {
        C2668g.b(c14579a, "request");
        this.f50681b.execute(c14579a.m55620a()).f(C17894b.f55794a).k(C17895c.f55795a).a(CoreMatch.class).k(C17896d.f55796a).k(new C17897e(c14579a)).k(new C17898f(this)).b().b(Schedulers.io()).b(RxUtils.b());
    }
}
