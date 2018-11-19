package com.tinder.feed.analytics.events;

import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.gm;
import com.tinder.feed.analytics.C9432a;
import com.tinder.feed.analytics.TopSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/feed/analytics/events/FeedTopEventDispatcher;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/feed/analytics/events/FeedTopEventDispatcher$Request;", "feedEventDispatchingSubscriber", "Lcom/tinder/feed/analytics/FeedEventDispatchingSubscriber;", "(Lcom/tinder/feed/analytics/FeedEventDispatchingSubscriber;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/FeedTopEvent;", "request", "sessionId", "", "execute", "", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.events.i */
public final class C11693i implements VoidUseCase<C9440a> {
    /* renamed from: a */
    private final C9432a f38195a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/feed/analytics/events/FeedTopEventDispatcher$Request;", "", "source", "Lcom/tinder/feed/analytics/TopSource;", "(Lcom/tinder/feed/analytics/TopSource;)V", "getSource", "()Lcom/tinder/feed/analytics/TopSource;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.events.i$a */
    public static final class C9440a {
        @NotNull
        /* renamed from: a */
        private final TopSource f31633a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9440a) {
                    if (C2668g.a(this.f31633a, ((C9440a) obj).f31633a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            TopSource topSource = this.f31633a;
            return topSource != null ? topSource.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(source=");
            stringBuilder.append(this.f31633a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9440a(@NotNull TopSource topSource) {
            C2668g.b(topSource, "source");
            this.f31633a = topSource;
        }

        @NotNull
        /* renamed from: a */
        public final TopSource m39469a() {
            return this.f31633a;
        }
    }

    @Inject
    public C11693i(@NotNull C9432a c9432a) {
        C2668g.b(c9432a, "feedEventDispatchingSubscriber");
        this.f38195a = c9432a;
    }

    public /* synthetic */ void execute(Object obj) {
        m47520a((C9440a) obj);
    }

    /* renamed from: a */
    public void m47520a(@NotNull C9440a c9440a) {
        C2668g.b(c9440a, "request");
        this.f38195a.m39436a("FeedTopEvent", c9440a, new FeedTopEventDispatcher$execute$1(this));
    }

    /* renamed from: a */
    private final Single<gm> m47518a(C9440a c9440a, String str) {
        c9440a = Single.a(gm.m45141a().m38281a(str).m38283b(c9440a.m39469a().getValue()).m38282a());
        C2668g.a(c9440a, "Single.just(it)");
        C2668g.a(c9440a, "FeedTopEvent.builder()\n … .let { Single.just(it) }");
        return c9440a;
    }
}
