package com.tinder.updates.p443a;

import com.tinder.api.keepalive.KeepAliveScarletApi;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.proto.keepalive.KeepAliveNudge.Nudge;
import com.tinder.scarlet.C14797g;
import com.tinder.scarlet.C14797g.C16515a;
import com.tinder.scarlet.C14797g.C16516b;
import com.tinder.scarlet.C14797g.C16518d;
import com.tinder.scarlet.C14797g.C16520f;
import com.tinder.scarlet.WebSocket.C14786a;
import com.tinder.scarlet.WebSocket.C14786a.C16492a;
import com.tinder.updates.p443a.C17205c.C15335a;
import com.tinder.updates.p443a.C17206e.C15337b;
import com.tinder.updates.p443a.C17207g.C15339b;
import io.reactivex.C15679f;
import io.reactivex.C3957b;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0006\u0010\u001a\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\f\u0010\u001c\u001a\u00020\u0012*\u00020\u001dH\u0002J7\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H!0 0\u001f\"\u0004\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\u001f2\u0006\u0010\"\u001a\u0002H!H\u0002¢\u0006\u0002\u0010#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/tinder/updates/analytics/WebSocketAnalyticsEventDispatcher;", "", "keepAliveScarletApi", "Lcom/tinder/api/keepalive/KeepAliveScarletApi;", "addWebSocketCloseEvent", "Lcom/tinder/updates/analytics/AddWebSocketCloseEvent;", "addWebSocketConnectEvent", "Lcom/tinder/updates/analytics/AddWebSocketConnectEvent;", "addWebSocketNudgeEvent", "Lcom/tinder/updates/analytics/AddWebSocketNudgeEvent;", "sendEventScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/api/keepalive/KeepAliveScarletApi;Lcom/tinder/updates/analytics/AddWebSocketCloseEvent;Lcom/tinder/updates/analytics/AddWebSocketConnectEvent;Lcom/tinder/updates/analytics/AddWebSocketNudgeEvent;Lio/reactivex/Scheduler;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "addFailedCloseEvent", "", "closeCode", "", "addFailedConnectEvent", "retryCount", "addSuccesfulCloseEvent", "addSuccessfulConnectEvent", "handleConnectionClosedAfterEstablished", "handleConnectionEstablished", "handleConnectionFailedToEstablish", "start", "stop", "findCloseCode", "Lcom/tinder/scarlet/WebSocket$Event;", "pairWithPrevious", "Lio/reactivex/Flowable;", "Lkotlin/Pair;", "T", "initialItem", "(Lio/reactivex/Flowable;Ljava/lang/Object;)Lio/reactivex/Flowable;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.updates.a.i */
public final class C15341i {
    /* renamed from: a */
    public static final C15340a f47565a = new C15340a();
    /* renamed from: b */
    private C17356a f47566b = new C17356a();
    /* renamed from: c */
    private final KeepAliveScarletApi f47567c;
    /* renamed from: d */
    private final C17205c f47568d;
    /* renamed from: e */
    private final C17206e f47569e;
    /* renamed from: f */
    private final C17207g f47570f;
    /* renamed from: g */
    private final C15679f f47571g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/updates/analytics/WebSocketAnalyticsEventDispatcher$Companion;", "", "()V", "UNKNOWN_CLOSE_CODE", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.i$a */
    public static final class C15340a {
        private C15340a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "T", "previousPair", "current", "apply", "(Lkotlin/Pair;Ljava/lang/Object;)Lkotlin/Pair;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.i$b */
    static final class C17208b<T1, T2, R> implements BiFunction<R, T, R> {
        /* renamed from: a */
        public static final C17208b f52783a = new C17208b();

        C17208b() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m63098a((Pair) obj, obj2);
        }

        @NotNull
        /* renamed from: a */
        public final Pair<T, T> m63098a(@NotNull Pair<? extends T, ? extends T> pair, T t) {
            C2668g.b(pair, "previousPair");
            return C15811g.m59834a(pair.m59804b(), t);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0006\u0010\u0000\u001a\u0018\u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u0003\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00042\u000b\u0010\u0005\u001a\u0007H\u0002¢\u0006\u0002\b\u00032\u000b\u0010\u0006\u001a\u0007H\u0004¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "T", "Lio/reactivex/annotations/NonNull;", "U", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "io/reactivex/rxkotlin/FlowablesKt$withLatestFrom$2"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.i$c */
    public static final class C17209c<T1, T2, R> implements BiFunction<Pair<? extends C14797g, ? extends C14797g>, C14786a, Pair<? extends Pair<? extends C14797g, ? extends C14797g>, ? extends C14786a>> {
        /* renamed from: a */
        public static final C17209c f52784a = new C17209c();

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m63099a(obj, obj2);
        }

        @NotNull
        /* renamed from: a */
        public final Pair<Pair<? extends C14797g, ? extends C14797g>, C14786a> m63099a(Pair<? extends C14797g, ? extends C14797g> pair, C14786a c14786a) {
            return new Pair(pair, c14786a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/proto/keepalive/KeepAliveNudge$Nudge;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.i$d */
    static final class C17210d<T> implements Consumer<Nudge> {
        /* renamed from: a */
        final /* synthetic */ C15341i f52785a;

        C17210d(C15341i c15341i) {
            this.f52785a = c15341i;
        }

        public /* synthetic */ void accept(Object obj) {
            m63100a((Nudge) obj);
        }

        /* renamed from: a */
        public final void m63100a(Nudge nudge) {
            C17207g a = this.f52785a.f47570f;
            C2668g.a(nudge, "it");
            nudge = nudge.getType();
            C2668g.a(nudge, "it.type");
            a.m63097a(new C15339b(nudge.getNumber()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.i$e */
    static final class C17211e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17211e f52786a = new C17211e();

        C17211e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m63101a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63101a(Throwable th) {
            C0001a.c(th, "Cannot observe nudge: stream is terminated", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u000126\u0010\u0004\u001a2\u0012 \u0012\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/tinder/scarlet/State;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lcom/tinder/scarlet/WebSocket$Event;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.i$f */
    static final class C17212f<T, R> implements Function<T, K> {
        /* renamed from: a */
        public static final C17212f f52787a = new C17212f();

        C17212f() {
        }

        @NotNull
        /* renamed from: a */
        public final Pair<C14797g, C14797g> m63102a(@NotNull Pair<? extends Pair<? extends C14797g, ? extends C14797g>, ? extends C14786a> pair) {
            C2668g.b(pair, "<name for destructuring parameter 0>");
            return (Pair) pair.m59805c();
        }

        public /* synthetic */ Object apply(Object obj) {
            return m63102a((Pair) obj);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012n\u0010\u0002\u001aj\u0012 \u0012\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*4\u0012 \u0012\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/tinder/scarlet/State;", "kotlin.jvm.PlatformType", "Lcom/tinder/scarlet/WebSocket$Event;", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.i$g */
    static final class C17213g<T> implements Consumer<Pair<? extends Pair<? extends C14797g, ? extends C14797g>, ? extends C14786a>> {
        /* renamed from: a */
        final /* synthetic */ C15341i f52788a;

        C17213g(C15341i c15341i) {
            this.f52788a = c15341i;
        }

        public /* synthetic */ void accept(Object obj) {
            m63103a((Pair) obj);
        }

        /* renamed from: a */
        public final void m63103a(Pair<? extends Pair<? extends C14797g, ? extends C14797g>, ? extends C14786a> pair) {
            Pair pair2 = (Pair) pair.m59805c();
            C14786a c14786a = (C14786a) pair.m59806d();
            C14797g c14797g = (C14797g) pair2.m59805c();
            C14797g c14797g2 = (C14797g) pair2.m59806d();
            boolean z = c14797g instanceof C16516b;
            if (z && (c14797g2 instanceof C16515a)) {
                this.f52788a.m57536a(((C16516b) c14797g).m61936b());
            } else if (z && (c14797g2 instanceof C16520f)) {
                this.f52788a.m57538b(((C16516b) c14797g).m61936b());
            } else if ((c14797g instanceof C16515a) && !(c14797g2 instanceof C16515a)) {
                C15341i c15341i = this.f52788a;
                C15341i c15341i2 = this.f52788a;
                C2668g.a(c14786a, "latestWebSocketEvent");
                c15341i.m57540c(c15341i2.m57532a(c14786a));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.updates.a.i$h */
    static final class C17214h<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17214h f52789a = new C17214h();

        C17214h() {
        }

        public /* synthetic */ void accept(Object obj) {
            m63104a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63104a(Throwable th) {
            C0001a.c(th, "Cannot observe state: stream is terminated", new Object[0]);
        }
    }

    @Inject
    public C15341i(@NotNull KeepAliveScarletApi keepAliveScarletApi, @NotNull C17205c c17205c, @NotNull C17206e c17206e, @NotNull C17207g c17207g, @NotNull @IoScheduler C15679f c15679f) {
        C2668g.b(keepAliveScarletApi, "keepAliveScarletApi");
        C2668g.b(c17205c, "addWebSocketCloseEvent");
        C2668g.b(c17206e, "addWebSocketConnectEvent");
        C2668g.b(c17207g, "addWebSocketNudgeEvent");
        C2668g.b(c15679f, "sendEventScheduler");
        this.f47567c = keepAliveScarletApi;
        this.f47568d = c17205c;
        this.f47569e = c17206e;
        this.f47570f = c17207g;
        this.f47571g = c15679f;
    }

    /* renamed from: a */
    public final void m57546a() {
        C3957b a = this.f47567c.observeState().a(this.f47571g);
        C2668g.a(a, "keepAliveScarletApi.obse…rveOn(sendEventScheduler)");
        a = m57535a(a, C16518d.f51186a).a(this.f47567c.observeWebSocketEvent(), C17209c.f52784a);
        C2668g.a(a, "withLatestFrom(other, Bi…on{ t, u -> Pair(t,u)  })");
        Disposable a2 = a.a(C17212f.f52787a).a(new C17213g(this), C17214h.f52789a);
        Disposable a3 = this.f47567c.observeNudge().a(this.f47571g).a(new C17210d(this), C17211e.f52786a);
        this.f47566b.m63448a(a2, a3);
    }

    /* renamed from: a */
    private final void m57536a(int i) {
        m57542d(i);
    }

    /* renamed from: b */
    private final void m57538b(int i) {
        m57543e(i);
        m57545g(-1);
    }

    /* renamed from: c */
    private final void m57540c(int i) {
        m57544f(i);
    }

    /* renamed from: d */
    private final void m57542d(int i) {
        this.f47569e.m63095a(new C15337b(i, true));
    }

    /* renamed from: e */
    private final void m57543e(int i) {
        this.f47569e.m63095a(new C15337b(i, false));
    }

    /* renamed from: f */
    private final void m57544f(int i) {
        this.f47568d.m63092a(new C15335a(i, true));
    }

    /* renamed from: g */
    private final void m57545g(int i) {
        this.f47568d.m63092a(new C15335a(i, false));
    }

    /* renamed from: a */
    private final int m57532a(@NotNull C14786a c14786a) {
        return c14786a instanceof C16492a ? ((C16492a) c14786a).m61918a().m56097a() : -1;
    }

    /* renamed from: a */
    private final <T> C3957b<Pair<T, T>> m57535a(@NotNull C3957b<T> c3957b, T t) {
        c3957b = c3957b.a(C15811g.m59834a(t, t), C17208b.f52783a);
        C2668g.a(c3957b, "scan(initialItem to init…sPair.second to current }");
        return c3957b;
    }
}
