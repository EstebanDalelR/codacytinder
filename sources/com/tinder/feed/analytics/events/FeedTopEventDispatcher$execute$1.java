package com.tinder.feed.analytics.events;

import com.tinder.etl.event.gm;
import com.tinder.feed.analytics.events.C11693i.C9440a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u00072\u0015\u0010\b\u001a\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/etl/event/FeedTopEvent;", "p1", "Lcom/tinder/feed/analytics/events/FeedTopEventDispatcher$Request;", "Lkotlin/ParameterName;", "name", "request", "p2", "", "sessionId", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedTopEventDispatcher$execute$1 extends FunctionReference implements Function2<C9440a, String, Single<gm>> {
    FeedTopEventDispatcher$execute$1(C11693i c11693i) {
        super(2, c11693i);
    }

    public final String getName() {
        return "createEvent";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C11693i.class);
    }

    public final String getSignature() {
        return "createEvent(Lcom/tinder/feed/analytics/events/FeedTopEventDispatcher$Request;Ljava/lang/String;)Lrx/Single;";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m54417a((C9440a) obj, (String) obj2);
    }

    @NotNull
    /* renamed from: a */
    public final Single<gm> m54417a(@NotNull C9440a c9440a, @NotNull String str) {
        C2668g.b(c9440a, "p1");
        C2668g.b(str, "p2");
        return ((C11693i) this.receiver).m47518a(c9440a, str);
    }
}
