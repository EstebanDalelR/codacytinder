package com.tinder.recsads.lifecycle.observer;

import com.tinder.addy.Ad;
import com.tinder.recsads.analytics.C16433f.C14736a;
import com.tinder.recsads.analytics.CtaBounceBackTimer.Listener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/tinder/recsads/lifecycle/observer/RecsAdCtaBouncebackLifecycleObserver$1", "Lcom/tinder/recsads/analytics/CtaBounceBackTimer$Listener;", "(Lcom/tinder/recsads/lifecycle/observer/RecsAdCtaBouncebackLifecycleObserver;)V", "onAdTimerCompleted", "", "ad", "Lcom/tinder/addy/Ad;", "duration", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsAdCtaBouncebackLifecycleObserver$1 implements Listener {
    /* renamed from: a */
    final /* synthetic */ RecsAdCtaBouncebackLifecycleObserver f51048a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.lifecycle.observer.RecsAdCtaBouncebackLifecycleObserver$1$a */
    static final class C18785a implements Action0 {
        /* renamed from: a */
        public static final C18785a f58296a = new C18785a();

        C18785a() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.lifecycle.observer.RecsAdCtaBouncebackLifecycleObserver$1$b */
    static final class C18786b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18786b f58297a = new C18786b();

        C18786b() {
        }

        public /* synthetic */ void call(Object obj) {
            m67223a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67223a(Throwable th) {
            C0001a.c(th);
        }
    }

    RecsAdCtaBouncebackLifecycleObserver$1(RecsAdCtaBouncebackLifecycleObserver recsAdCtaBouncebackLifecycleObserver) {
        this.f51048a = recsAdCtaBouncebackLifecycleObserver;
    }

    public void onAdTimerCompleted(@NotNull Ad ad, long j) {
        C2668g.b(ad, "ad");
        RecsAdCtaBouncebackLifecycleObserver.a(this.f51048a).m56002a((Object) new C14736a(Long.valueOf(j)), ad).b(Schedulers.io()).a((Action0) C18785a.f58296a, C18786b.f58297a);
    }
}
