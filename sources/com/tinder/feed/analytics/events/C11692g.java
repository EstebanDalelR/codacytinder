package com.tinder.feed.analytics.events;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.etl.event.gl;
import com.tinder.feed.analytics.TabSource;
import com.tinder.feed.analytics.p247a.C9423b;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/feed/analytics/events/FeedShowBadgeEventDispatcher;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "feedShowBadgeEventTabSourceTracker", "Lcom/tinder/feed/analytics/factory/FeedShowBadgeEventTabSourceTracker;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/feed/analytics/factory/FeedShowBadgeEventTabSourceTracker;)V", "createShowBadgeEvent", "Lrx/Single;", "Lcom/tinder/etl/event/FeedShowBadgeEvent;", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.events.g */
public final class C11692g implements SimpleVoidUseCase {
    /* renamed from: a */
    private final C2630h f38193a;
    /* renamed from: b */
    private final C9423b f38194b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/FeedShowBadgeEvent;", "kotlin.jvm.PlatformType", "tabSource", "Lcom/tinder/feed/analytics/TabSource;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.g$a */
    static final class C13236a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13236a f41961a = new C13236a();

        C13236a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51238a((TabSource) obj);
        }

        /* renamed from: a */
        public final gl m51238a(TabSource tabSource) {
            return gl.m45136a().m38279a(tabSource.getValue()).m38280a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/etl/event/FeedShowBadgeEvent;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.g$b */
    static final class C13237b<T, R> implements Func1<gl, Completable> {
        /* renamed from: a */
        final /* synthetic */ C11692g f41962a;

        C13237b(C11692g c11692g) {
            this.f41962a = c11692g;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51239a((gl) obj);
        }

        /* renamed from: a */
        public final Completable m51239a(final gl glVar) {
            return Completable.a(new Callable<Object>() {
                public /* synthetic */ Object call() {
                    m39468a();
                    return C15813i.f49016a;
                }

                /* renamed from: a */
                public final void m39468a() {
                    this.f41962a.f38193a.a(glVar);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.g$c */
    static final class C13955c implements Action0 {
        /* renamed from: a */
        public static final C13955c f44089a = new C13955c();

        C13955c() {
        }

        public final void call() {
            C0001a.b("FeedShowBadgeEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.g$d */
    static final class C13956d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13956d f44090a = new C13956d();

        C13956d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53479a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53479a(Throwable th) {
            C0001a.c(th, "FeedShowBadgeEventDispatcher failed.", new Object[0]);
        }
    }

    @Inject
    public C11692g(@NotNull C2630h c2630h, @NotNull C9423b c9423b) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c9423b, "feedShowBadgeEventTabSourceTracker");
        this.f38193a = c2630h;
        this.f38194b = c9423b;
    }

    public void execute() {
        m47517a().c(new C13237b(this)).b(Schedulers.io()).a(C13955c.f44089a, C13956d.f44090a);
    }

    /* renamed from: a */
    private final Single<gl> m47517a() {
        Single<gl> d = this.f38194b.m39399a().d(C13236a.f41961a);
        C2668g.a(d, "feedShowBadgeEventTabSou…build()\n                }");
        return d;
    }
}
