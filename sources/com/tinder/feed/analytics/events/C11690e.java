package com.tinder.feed.analytics.events;

import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.etl.event.gi;
import com.tinder.feed.analytics.C9432a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/feed/analytics/events/FeedNoActivityEventDispatcher;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "feedEventDispatchingSubscriber", "Lcom/tinder/feed/analytics/FeedEventDispatchingSubscriber;", "(Lcom/tinder/feed/analytics/FeedEventDispatchingSubscriber;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/FeedNoActivityEvent;", "sessionId", "", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.events.e */
public final class C11690e implements SimpleVoidUseCase {
    /* renamed from: a */
    private final C9432a f38191a;

    @Inject
    public C11690e(@NotNull C9432a c9432a) {
        C2668g.b(c9432a, "feedEventDispatchingSubscriber");
        this.f38191a = c9432a;
    }

    public void execute() {
        this.f38191a.m39437a("FeedNoActivityEvent", (Function1) new FeedNoActivityEventDispatcher$execute$1(this));
    }

    /* renamed from: a */
    private final Single<gi> m47512a(String str) {
        str = Single.a(gi.m45098a().m38261a(str).m38262a());
        C2668g.a(str, "Single.just(it)");
        C2668g.a(str, "FeedNoActivityEvent.buil… .let { Single.just(it) }");
        return str;
    }
}
