package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.etl.event.ix;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/reactions/analytics/GrandGestureUpdateSettingEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/reactions/analytics/GrandGestureUpdateSettingEventDispatcher$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/match/usecase/GetMatch;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.analytics.m */
public final class C16281m implements VoidUseCase<C14587a> {
    /* renamed from: a */
    private final C2630h f50700a;
    /* renamed from: b */
    private final GetMatch f50701b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/tinder/reactions/analytics/GrandGestureUpdateSettingEventDispatcher$Request;", "", "matchId", "", "gestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "settingType", "Lcom/tinder/reactions/analytics/GestureSettingType;", "settingValue", "Lcom/tinder/reactions/analytics/GestureSettingValue;", "(Ljava/lang/String;Lcom/tinder/domain/reactions/model/GrandGestureType;Lcom/tinder/reactions/analytics/GestureSettingType;Lcom/tinder/reactions/analytics/GestureSettingValue;)V", "getGestureType", "()Lcom/tinder/domain/reactions/model/GrandGestureType;", "getMatchId", "()Ljava/lang/String;", "getSettingType", "()Lcom/tinder/reactions/analytics/GestureSettingType;", "getSettingValue", "()Lcom/tinder/reactions/analytics/GestureSettingValue;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.m$a */
    public static final class C14587a {
        @NotNull
        /* renamed from: a */
        private final String f46035a;
        @NotNull
        /* renamed from: b */
        private final GrandGestureType f46036b;
        @NotNull
        /* renamed from: c */
        private final GestureSettingType f46037c;
        @NotNull
        /* renamed from: d */
        private final GestureSettingValue f46038d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14587a) {
                    C14587a c14587a = (C14587a) obj;
                    if (C2668g.a(this.f46035a, c14587a.f46035a) && C2668g.a(this.f46036b, c14587a.f46036b) && C2668g.a(this.f46037c, c14587a.f46037c) && C2668g.a(this.f46038d, c14587a.f46038d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f46035a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            GrandGestureType grandGestureType = this.f46036b;
            hashCode = (hashCode + (grandGestureType != null ? grandGestureType.hashCode() : 0)) * 31;
            GestureSettingType gestureSettingType = this.f46037c;
            hashCode = (hashCode + (gestureSettingType != null ? gestureSettingType.hashCode() : 0)) * 31;
            GestureSettingValue gestureSettingValue = this.f46038d;
            if (gestureSettingValue != null) {
                i = gestureSettingValue.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f46035a);
            stringBuilder.append(", gestureType=");
            stringBuilder.append(this.f46036b);
            stringBuilder.append(", settingType=");
            stringBuilder.append(this.f46037c);
            stringBuilder.append(", settingValue=");
            stringBuilder.append(this.f46038d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14587a(@NotNull String str, @NotNull GrandGestureType grandGestureType, @NotNull GestureSettingType gestureSettingType, @NotNull GestureSettingValue gestureSettingValue) {
            C2668g.b(str, "matchId");
            C2668g.b(grandGestureType, "gestureType");
            C2668g.b(gestureSettingType, "settingType");
            C2668g.b(gestureSettingValue, "settingValue");
            this.f46035a = str;
            this.f46036b = grandGestureType;
            this.f46037c = gestureSettingType;
            this.f46038d = gestureSettingValue;
        }

        @NotNull
        /* renamed from: a */
        public final String m55639a() {
            return this.f46035a;
        }

        @NotNull
        /* renamed from: b */
        public final GrandGestureType m55640b() {
            return this.f46036b;
        }

        @NotNull
        /* renamed from: c */
        public final GestureSettingType m55641c() {
            return this.f46037c;
        }

        @NotNull
        /* renamed from: d */
        public final GestureSettingValue m55642d() {
            return this.f46038d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.m$b */
    static final class C17924b<T, R> implements Func1<Optional<Match>, Boolean> {
        /* renamed from: a */
        public static final C17924b f55831a = new C17924b();

        C17924b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65229a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m65229a(Optional<Match> optional) {
            C2668g.a(optional, "optionalMatch");
            return optional.m59132c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/GrandGestureUpdateSettingEvent;", "kotlin.jvm.PlatformType", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.m$c */
    static final class C17925c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14587a f55832a;

        C17925c(C14587a c14587a) {
            this.f55832a = c14587a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65230a((Optional) obj);
        }

        /* renamed from: a */
        public final ix m65230a(Optional<Match> optional) {
            optional = optional.m59127b();
            if (optional == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.match.model.CoreMatch");
            }
            return ix.a().a(this.f55832a.m55640b().getGestureId()).b(this.f55832a.m55639a()).c(((CoreMatch) optional).getPerson().id()).d(this.f55832a.m55641c().getAnalyticsValue()).e(this.f55832a.m55642d().getAnalyticsValue()).a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/GrandGestureUpdateSettingEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.m$d */
    static final class C17926d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16281m f55833a;

        C17926d(C16281m c16281m) {
            this.f55833a = c16281m;
        }

        public /* synthetic */ Object call(Object obj) {
            m65231a((ix) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m65231a(ix ixVar) {
            this.f55833a.f50700a.a(ixVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.m$e */
    static final class C18665e implements Action0 {
        /* renamed from: a */
        public static final C18665e f58136a = new C18665e();

        C18665e() {
        }

        public final void call() {
            C0001a.b("GrandGestureUpdateSettingEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.analytics.m$f */
    static final class C18666f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18666f f58137a = new C18666f();

        C18666f() {
        }

        public /* synthetic */ void call(Object obj) {
            m67096a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67096a(Throwable th) {
            C0001a.c(th, "GrandGestureUpdateSettingEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C16281m(@NotNull C2630h c2630h, @NotNull GetMatch getMatch) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(getMatch, "getMatch");
        this.f50700a = c2630h;
        this.f50701b = getMatch;
    }

    public /* synthetic */ void execute(Object obj) {
        m61472a((C14587a) obj);
    }

    /* renamed from: a */
    public void m61472a(@NotNull C14587a c14587a) {
        C2668g.b(c14587a, "request");
        this.f50701b.execute(c14587a.m55639a()).f(C17924b.f55831a).k(new C17925c(c14587a)).k(new C17926d(this)).b().b(Schedulers.io()).a(C18665e.f58136a, C18666f.f58137a);
    }
}
