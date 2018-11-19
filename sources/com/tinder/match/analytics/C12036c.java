package com.tinder.match.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.etl.event.lu;
import com.tinder.utils.RxUtils;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/match/analytics/AddMatchSearchSelectEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "analyticsFactory", "Lcom/tinder/match/analytics/MatchListAnalyticsFactory;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/match/analytics/MatchListAnalyticsFactory;Lcom/tinder/domain/match/usecase/GetMatch;)V", "execute", "", "matchId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.analytics.c */
public final class C12036c implements VoidUseCase<String> {
    /* renamed from: a */
    private final C2630h f39145a;
    /* renamed from: b */
    private final C9845l f39146b;
    /* renamed from: c */
    private final GetMatch f39147c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.analytics.c$a */
    static final class C13399a<T, R> implements Func1<Optional<Match>, Boolean> {
        /* renamed from: a */
        public static final C13399a f42533a = new C13399a();

        C13399a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51835a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m51835a(Optional<Match> optional) {
            C2668g.a(optional, "optionalMatch");
            return optional.c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "optionalMatch", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.analytics.c$b */
    static final class C13400b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13400b f42534a = new C13400b();

        C13400b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51836a((Optional) obj);
        }

        /* renamed from: a */
        public final Match m51836a(Optional<Match> optional) {
            return (Match) optional.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/etl/event/MatchSearchSelectEvent;", "match", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.analytics.c$c */
    static final class C13401c<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C12036c f42535a;

        C13401c(C12036c c12036c) {
            this.f42535a = c12036c;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51837a((Match) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<lu> m51837a(Match match) {
            C9845l a = this.f42535a.f39146b;
            C2668g.a(match, "match");
            return a.m40529a(match);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/MatchSearchSelectEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.analytics.c$d */
    static final class C13402d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C12036c f42536a;

        C13402d(C12036c c12036c) {
            this.f42536a = c12036c;
        }

        public /* synthetic */ Object call(Object obj) {
            m51838a((lu) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m51838a(lu luVar) {
            this.f42536a.f39145a.a(luVar);
        }
    }

    @Inject
    public C12036c(@NotNull C2630h c2630h, @NotNull C9845l c9845l, @NotNull GetMatch getMatch) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c9845l, "analyticsFactory");
        C2668g.b(getMatch, "getMatch");
        this.f39145a = c2630h;
        this.f39146b = c9845l;
        this.f39147c = getMatch;
    }

    public /* synthetic */ void execute(Object obj) {
        m48137a((String) obj);
    }

    /* renamed from: a */
    public void m48137a(@NotNull String str) {
        C2668g.b(str, "matchId");
        this.f39147c.execute(str).f(C13399a.f42533a).k(C13400b.f42534a).h().j(new C13401c(this)).k(new C13402d(this)).b().b(Schedulers.io()).b(RxUtils.b());
    }
}
