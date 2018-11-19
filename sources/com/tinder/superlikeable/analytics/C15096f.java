package com.tinder.superlikeable.analytics;

import com.tinder.etl.event.xn;
import com.tinder.etl.event.xn.C9328a;
import com.tinder.superlikeable.analytics.AddSuperLikeableInteractEvent.Method;
import com.tinder.superlikeable.analytics.C18196a.C15091a;
import com.tinder.superlikeable.analytics.C18198b.C15092a;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/tinder/superlikeable/analytics/SuperLikeableAnalyticsFactory;", "", "()V", "createGameInteractEvent", "Lrx/Single;", "Lcom/tinder/etl/event/SuperLikeableInteractEvent;", "request", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableGameInteractEvent$Request;", "createProfileInteractEvent", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableProfileInteractEvent$Request;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.analytics.f */
public final class C15096f {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/SuperLikeableInteractEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.analytics.f$a */
    static final class C15094a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C15091a f46964a;

        C15094a(C15091a c15091a) {
            this.f46964a = c15091a;
        }

        public /* synthetic */ Object call() {
            return m56867a();
        }

        /* renamed from: a */
        public final xn m56867a() {
            C9328a d = xn.a().c(Integer.valueOf(this.f46964a.m56847b())).c(this.f46964a.m56848c()).d(this.f46964a.m56846a().getAnalyticsValue()).d(Integer.valueOf(this.f46964a.m56849d().getAnalyticsValue()));
            Method e = this.f46964a.m56850e();
            return d.a(e != null ? e.getAnalyticsValue() : null).a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/SuperLikeableInteractEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.analytics.f$b */
    static final class C15095b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C15092a f46965a;

        C15095b(C15092a c15092a) {
            this.f46965a = c15092a;
        }

        public /* synthetic */ Object call() {
            return m56868a();
        }

        /* renamed from: a */
        public final xn m56868a() {
            return xn.a().d(this.f46965a.m56851a().getAnalyticsValue()).b(this.f46965a.m56854c()).d(Integer.valueOf(this.f46965a.m56856e().getAnalyticsValue())).a(Integer.valueOf(this.f46965a.m56855d())).b(Integer.valueOf(this.f46965a.m56853b())).a();
        }
    }

    @NotNull
    /* renamed from: a */
    public final Single<xn> m56870a(@NotNull C15092a c15092a) {
        C2668g.b(c15092a, "request");
        c15092a = Observable.a(new C15095b(c15092a)).a();
        C2668g.a(c15092a, "Observable.fromCallable(…d()\n        }).toSingle()");
        return c15092a;
    }

    @NotNull
    /* renamed from: a */
    public final Single<xn> m56869a(@NotNull C15091a c15091a) {
        C2668g.b(c15091a, "request");
        c15091a = Observable.a(new C15094a(c15091a)).a();
        C2668g.a(c15091a, "Observable.fromCallable(…d()\n        }).toSingle()");
        return c15091a;
    }
}
