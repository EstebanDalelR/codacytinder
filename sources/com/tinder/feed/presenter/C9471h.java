package com.tinder.feed.presenter;

import com.tinder.common.logger.Logger;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.match.usecase.ObserveHasUntouchedMatches;
import com.tinder.feed.target.MatchesPageMessagesTabIndicatorTarget;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import io.reactivex.C15679f;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/tinder/feed/presenter/MatchMessagesTabPresenter;", "", "observeHasUntouchedMatches", "Lcom/tinder/domain/match/usecase/ObserveHasUntouchedMatches;", "ioScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/match/usecase/ObserveHasUntouchedMatches;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lcom/tinder/common/logger/Logger;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/feed/target/MatchesPageMessagesTabIndicatorTarget;", "getTarget$Tinder_release", "()Lcom/tinder/feed/target/MatchesPageMessagesTabIndicatorTarget;", "setTarget$Tinder_release", "(Lcom/tinder/feed/target/MatchesPageMessagesTabIndicatorTarget;)V", "drop", "", "observeUntouchedMatches", "take", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.presenter.h */
public final class C9471h {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public MatchesPageMessagesTabIndicatorTarget f31768a;
    /* renamed from: b */
    private final C17356a f31769b = new C17356a();
    /* renamed from: c */
    private final ObserveHasUntouchedMatches f31770c;
    /* renamed from: d */
    private final C15679f f31771d;
    /* renamed from: e */
    private final C15679f f31772e;
    /* renamed from: f */
    private final Logger f31773f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "hasUntouchedMatches", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.h$a */
    static final class C11696a<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C9471h f38208a;

        C11696a(C9471h c9471h) {
            this.f38208a = c9471h;
        }

        public /* synthetic */ void accept(Object obj) {
            m47527a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m47527a(Boolean bool) {
            C2668g.a(bool, "hasUntouchedMatches");
            if (bool.booleanValue() != null) {
                this.f38208a.m39626a().showUnreadIndicator();
            } else {
                this.f38208a.m39626a().hideUnreadIndicator();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.presenter.h$b */
    static final class C11697b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C9471h f38209a;

        C11697b(C9471h c9471h) {
            this.f38209a = c9471h;
        }

        public /* synthetic */ void accept(Object obj) {
            m47528a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47528a(Throwable th) {
            Logger a = this.f38209a.f31773f;
            C2668g.a(th, "throwable");
            a.error(th, "Error observing untouched matches");
        }
    }

    @Inject
    public C9471h(@NotNull ObserveHasUntouchedMatches observeHasUntouchedMatches, @NotNull @IoScheduler C15679f c15679f, @NotNull @MainThreadScheduler C15679f c15679f2, @NotNull Logger logger) {
        C2668g.b(observeHasUntouchedMatches, "observeHasUntouchedMatches");
        C2668g.b(c15679f, "ioScheduler");
        C2668g.b(c15679f2, "mainThreadScheduler");
        C2668g.b(logger, "logger");
        this.f31770c = observeHasUntouchedMatches;
        this.f31771d = c15679f;
        this.f31772e = c15679f2;
        this.f31773f = logger;
    }

    @NotNull
    /* renamed from: a */
    public final MatchesPageMessagesTabIndicatorTarget m39626a() {
        MatchesPageMessagesTabIndicatorTarget matchesPageMessagesTabIndicatorTarget = this.f31768a;
        if (matchesPageMessagesTabIndicatorTarget == null) {
            C2668g.b("target");
        }
        return matchesPageMessagesTabIndicatorTarget;
    }

    @Take
    /* renamed from: b */
    public final void m39627b() {
        m39625d();
    }

    @Drop
    /* renamed from: c */
    public final void m39628c() {
        this.f31769b.a();
    }

    /* renamed from: d */
    private final void m39625d() {
        this.f31769b.add(this.f31770c.execute().subscribeOn(this.f31771d).observeOn(this.f31772e).subscribe(new C11696a(this), new C11697b(this)));
    }
}
