package com.tinder.feed.analytics.events;

import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.gf;
import com.tinder.feed.analytics.C9432a;
import com.tinder.feed.analytics.C9434e;
import com.tinder.feed.analytics.C9434e.C11685c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/feed/analytics/events/FeedFetchEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/feed/analytics/events/FeedFetchEventDispatcher$Request;", "feedEventDispatchingSubscriber", "Lcom/tinder/feed/analytics/FeedEventDispatchingSubscriber;", "(Lcom/tinder/feed/analytics/FeedEventDispatchingSubscriber;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/FeedFetchEvent;", "request", "sessionId", "", "execute", "", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.events.d */
public final class C11689d implements VoidUseCase<C9437a> {
    /* renamed from: a */
    private final C9432a f38190a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/tinder/feed/analytics/events/FeedFetchEventDispatcher$Request;", "", "fetchSource", "Lcom/tinder/feed/analytics/FetchSource;", "isEnd", "", "activityCount", "", "(Lcom/tinder/feed/analytics/FetchSource;ZI)V", "getActivityCount", "()I", "getFetchSource", "()Lcom/tinder/feed/analytics/FetchSource;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.d$a */
    public static final class C9437a {
        @NotNull
        /* renamed from: a */
        private final C9434e f31613a;
        /* renamed from: b */
        private final boolean f31614b;
        /* renamed from: c */
        private final int f31615c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9437a) {
                C9437a c9437a = (C9437a) obj;
                if (C2668g.a(this.f31613a, c9437a.f31613a)) {
                    if ((this.f31614b == c9437a.f31614b ? 1 : null) != null) {
                        if ((this.f31615c == c9437a.f31615c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            C9434e c9434e = this.f31613a;
            int hashCode = (c9434e != null ? c9434e.hashCode() : 0) * 31;
            int i = this.f31614b;
            if (i != 0) {
                i = 1;
            }
            return ((hashCode + i) * 31) + this.f31615c;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(fetchSource=");
            stringBuilder.append(this.f31613a);
            stringBuilder.append(", isEnd=");
            stringBuilder.append(this.f31614b);
            stringBuilder.append(", activityCount=");
            stringBuilder.append(this.f31615c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9437a(@NotNull C9434e c9434e, boolean z, int i) {
            C2668g.b(c9434e, "fetchSource");
            this.f31613a = c9434e;
            this.f31614b = z;
            this.f31615c = i;
        }

        @NotNull
        /* renamed from: a */
        public final C9434e m39450a() {
            return this.f31613a;
        }

        /* renamed from: b */
        public final boolean m39451b() {
            return this.f31614b;
        }

        /* renamed from: c */
        public final int m39452c() {
            return this.f31615c;
        }
    }

    @Inject
    public C11689d(@NotNull C9432a c9432a) {
        C2668g.b(c9432a, "feedEventDispatchingSubscriber");
        this.f38190a = c9432a;
    }

    public /* synthetic */ void execute(Object obj) {
        m47510a((C9437a) obj);
    }

    /* renamed from: a */
    public void m47510a(@NotNull C9437a c9437a) {
        C2668g.b(c9437a, "request");
        this.f38190a.m39436a("FeedFetchEvent", c9437a, new FeedFetchEventDispatcher$execute$1(this));
    }

    /* renamed from: a */
    private final Single<gf> m47508a(C9437a c9437a, String str) {
        str = gf.m45032a().m38233a(str).m38232a((Number) Integer.valueOf(c9437a.m39452c())).m38236b(c9437a.m39450a().mo10419a()).m38231a(Boolean.valueOf(c9437a.m39451b()));
        if (c9437a.m39450a() instanceof C11685c) {
            str.m38235b(Boolean.valueOf(((C11685c) c9437a.m39450a()).m47495b()));
        }
        c9437a = Single.a(str.m38234a());
        C2668g.a(c9437a, "Single.just(it)");
        C2668g.a(c9437a, "with(request) {\n        …}.let { Single.just(it) }");
        return c9437a;
    }
}
