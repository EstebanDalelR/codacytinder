package com.tinder.scarlet.internal.connection;

import com.tinder.scarlet.C14788b;
import com.tinder.scarlet.C14788b.C16504a.C18035a;
import com.tinder.scarlet.C14788b.C16507d.C18037a;
import com.tinder.scarlet.C14789c;
import com.tinder.scarlet.C14794e;
import com.tinder.scarlet.C14797g;
import com.tinder.scarlet.C14797g.C16515a;
import com.tinder.scarlet.C14797g.C16520f;
import com.tinder.scarlet.Lifecycle;
import com.tinder.scarlet.Lifecycle.C14785a;
import com.tinder.scarlet.Lifecycle.C14785a.C16491c.C18033a;
import com.tinder.scarlet.Lifecycle.C14785a.C16491c.C18034b;
import com.tinder.scarlet.WebSocket;
import com.tinder.scarlet.WebSocket.C14786a;
import com.tinder.scarlet.WebSocket.Factory;
import com.tinder.scarlet.internal.connection.p492a.C18819a;
import com.tinder.scarlet.internal.connection.p492a.C18820b;
import com.tinder.scarlet.internal.connection.p492a.C18821c;
import com.tinder.scarlet.lifecycle.C18043d;
import com.tinder.scarlet.retry.BackoffStrategy;
import com.tinder.statemachine.C15065a;
import com.tinder.statemachine.C15065a.C15063c;
import com.tinder.statemachine.C15065a.C15063c.C15062a;
import io.reactivex.C15679f;
import io.reactivex.C3957b;
import io.reactivex.disposables.Disposable;
import io.reactivex.processors.PublishProcessor;
import java.util.concurrent.TimeUnit;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tinder/scarlet/internal/connection/Connection;", "", "stateManager", "Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "(Lcom/tinder/scarlet/internal/connection/Connection$StateManager;)V", "getStateManager", "()Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "observeEvent", "Lio/reactivex/Flowable;", "Lcom/tinder/scarlet/Event;", "send", "", "message", "Lcom/tinder/scarlet/Message;", "startForever", "", "Factory", "StateManager", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.internal.connection.a */
public final class C14804a {
    @NotNull
    /* renamed from: a */
    private final C14803b f46402a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/scarlet/internal/connection/Connection$Factory;", "", "lifecycle", "Lcom/tinder/scarlet/Lifecycle;", "webSocketFactory", "Lcom/tinder/scarlet/WebSocket$Factory;", "backoffStrategy", "Lcom/tinder/scarlet/retry/BackoffStrategy;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/scarlet/Lifecycle;Lcom/tinder/scarlet/WebSocket$Factory;Lcom/tinder/scarlet/retry/BackoffStrategy;Lio/reactivex/Scheduler;)V", "sharedLifecycle", "getSharedLifecycle", "()Lcom/tinder/scarlet/Lifecycle;", "sharedLifecycle$delegate", "Lkotlin/Lazy;", "create", "Lcom/tinder/scarlet/internal/connection/Connection;", "createSharedLifecycle", "Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.connection.a$a */
    public static final class C14802a {
        /* renamed from: a */
        static final /* synthetic */ KProperty[] f46389a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(C14802a.class), "sharedLifecycle", "getSharedLifecycle()Lcom/tinder/scarlet/Lifecycle;"))};
        /* renamed from: b */
        private final Lazy f46390b = C15810e.m59833a((Function0) new Connection$Factory$sharedLifecycle$2(this));
        /* renamed from: c */
        private final Lifecycle f46391c;
        /* renamed from: d */
        private final Factory f46392d;
        /* renamed from: e */
        private final BackoffStrategy f46393e;
        /* renamed from: f */
        private final C15679f f46394f;

        /* renamed from: b */
        private final Lifecycle m56112b() {
            Lazy lazy = this.f46390b;
            KProperty kProperty = f46389a[0];
            return (Lifecycle) lazy.getValue();
        }

        public C14802a(@NotNull Lifecycle lifecycle, @NotNull Factory factory, @NotNull BackoffStrategy backoffStrategy, @NotNull C15679f c15679f) {
            C2668g.b(lifecycle, "lifecycle");
            C2668g.b(factory, "webSocketFactory");
            C2668g.b(backoffStrategy, "backoffStrategy");
            C2668g.b(c15679f, "scheduler");
            this.f46391c = lifecycle;
            this.f46392d = factory;
            this.f46393e = backoffStrategy;
            this.f46394f = c15679f;
        }

        @NotNull
        /* renamed from: a */
        public final C14804a m56114a() {
            return new C14804a(new C14803b(m56112b(), this.f46392d, this.f46393e, this.f46394f));
        }

        /* renamed from: c */
        private final C18043d m56113c() {
            C18043d c18043d = new C18043d(0, 1, null);
            this.f46391c.subscribe(c18043d);
            return c18043d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rJ\u0018\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001dH\u0002J\u0018\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001dH\u0002J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0!J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u0006\u0010)\u001a\u00020\u001aJ\u0018\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0\u001dH\u0002J\f\u0010,\u001a\u00020\u001a*\u00020-H\u0002J\u0014\u0010.\u001a\u00020\u001a*\u00020/2\u0006\u0010\u0013\u001a\u000200H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/tinder/scarlet/internal/connection/Connection$StateManager;", "", "lifecycle", "Lcom/tinder/scarlet/Lifecycle;", "webSocketFactory", "Lcom/tinder/scarlet/WebSocket$Factory;", "backoffStrategy", "Lcom/tinder/scarlet/retry/BackoffStrategy;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/scarlet/Lifecycle;Lcom/tinder/scarlet/WebSocket$Factory;Lcom/tinder/scarlet/retry/BackoffStrategy;Lio/reactivex/Scheduler;)V", "eventProcessor", "Lio/reactivex/processors/PublishProcessor;", "Lcom/tinder/scarlet/Event;", "kotlin.jvm.PlatformType", "getLifecycle", "()Lcom/tinder/scarlet/Lifecycle;", "lifecycleStateSubscriber", "Lcom/tinder/scarlet/internal/connection/subscriber/LifecycleStateSubscriber;", "state", "Lcom/tinder/scarlet/State;", "getState", "()Lcom/tinder/scarlet/State;", "stateMachine", "Lcom/tinder/statemachine/StateMachine;", "handleEvent", "", "event", "lifecycleStart", "Lcom/tinder/statemachine/StateMachine$Matcher;", "Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "lifecycleStop", "observeEvent", "Lio/reactivex/Flowable;", "open", "Lcom/tinder/scarlet/Session;", "requestNextLifecycleState", "scheduleRetry", "Lio/reactivex/disposables/Disposable;", "duration", "", "subscribe", "webSocketOpen", "Lcom/tinder/scarlet/Event$OnWebSocket$Event;", "cancelRetry", "Lcom/tinder/scarlet/State$WaitingToRetry;", "initiateShutdown", "Lcom/tinder/scarlet/State$Connected;", "Lcom/tinder/scarlet/Lifecycle$State;", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.connection.a$b */
    public static final class C14803b {
        /* renamed from: a */
        private final C18819a f46395a = new C18819a(this);
        /* renamed from: b */
        private final PublishProcessor<C14788b> f46396b = PublishProcessor.m67663q();
        /* renamed from: c */
        private final C15065a<C14797g, C14788b> f46397c = C15065a.f46899a.m56760a((Function1) new Connection$StateManager$stateMachine$1(this));
        @NotNull
        /* renamed from: d */
        private final Lifecycle f46398d;
        /* renamed from: e */
        private final Factory f46399e;
        /* renamed from: f */
        private final BackoffStrategy f46400f;
        /* renamed from: g */
        private final C15679f f46401g;

        public C14803b(@NotNull Lifecycle lifecycle, @NotNull Factory factory, @NotNull BackoffStrategy backoffStrategy, @NotNull C15679f c15679f) {
            C2668g.b(lifecycle, "lifecycle");
            C2668g.b(factory, "webSocketFactory");
            C2668g.b(backoffStrategy, "backoffStrategy");
            C2668g.b(c15679f, "scheduler");
            this.f46398d = lifecycle;
            this.f46399e = factory;
            this.f46400f = backoffStrategy;
            this.f46401g = c15679f;
        }

        @NotNull
        /* renamed from: a */
        public final C14797g m56134a() {
            return (C14797g) this.f46397c.m56776a();
        }

        @NotNull
        /* renamed from: b */
        public final C3957b<C14788b> m56136b() {
            PublishProcessor publishProcessor = this.f46396b;
            C2668g.a(publishProcessor, "eventProcessor");
            return publishProcessor;
        }

        /* renamed from: c */
        public final void m56137c() {
            this.f46398d.subscribe(this.f46395a);
        }

        /* renamed from: a */
        public final void m56135a(@NotNull C14788b c14788b) {
            C2668g.b(c14788b, "event");
            this.f46396b.onNext(c14788b);
            this.f46397c.m56777a((Object) c14788b);
        }

        /* renamed from: d */
        private final C14794e m56124d() {
            WebSocket create = this.f46399e.create();
            C18821c c18821c = new C18821c(this);
            C3957b.a(create.open()).a(this.f46401g).a(C14786a.class).a(c18821c);
            return new C14794e(create, c18821c);
        }

        /* renamed from: a */
        private final Disposable m56115a(long j) {
            C18820b c18820b = new C18820b(this);
            C3957b.a(j, TimeUnit.MILLISECONDS, this.f46401g).a(c18820b);
            return c18820b;
        }

        /* renamed from: e */
        private final void m56127e() {
            this.f46395a.m67271b();
        }

        /* renamed from: a */
        private final void m56117a(@NotNull C16515a c16515a, C14785a c14785a) {
            if (c14785a instanceof C18034b) {
                c16515a.m61934a().m56090a().close(((C18034b) c14785a).m65499a());
            } else if (C2668g.a(c14785a, C18033a.f56033a) != null) {
                c16515a.m61934a().m56090a().cancel();
            }
        }

        /* renamed from: a */
        private final void m56118a(@NotNull C16520f c16520f) {
            c16520f.m61937a().dispose();
        }

        /* renamed from: f */
        private final C15063c<C14788b, C18035a<?>> m56129f() {
            C15062a c15062a = C15063c.f46892a;
            c15062a = C15063c.f46892a;
            return new C15063c(C18035a.class).m56762a((Function1) Connection$StateManager$lifecycleStart$1.f58329a);
        }

        /* renamed from: g */
        private final C15063c<C14788b, C18035a<?>> m56131g() {
            C15062a c15062a = C15063c.f46892a;
            c15062a = C15063c.f46892a;
            return new C15063c(C18035a.class).m56762a((Function1) Connection$StateManager$lifecycleStop$1.f58330a);
        }

        /* renamed from: h */
        private final C15063c<C14788b, C18037a<?>> m56132h() {
            C15062a c15062a = C15063c.f46892a;
            c15062a = C15063c.f46892a;
            return new C15063c(C18037a.class).m56762a((Function1) Connection$StateManager$webSocketOpen$1.f58357a);
        }
    }

    public C14804a(@NotNull C14803b c14803b) {
        C2668g.b(c14803b, "stateManager");
        this.f46402a = c14803b;
    }

    /* renamed from: a */
    public final void m56138a() {
        this.f46402a.m56137c();
    }

    @NotNull
    /* renamed from: b */
    public final C3957b<C14788b> m56140b() {
        return this.f46402a.m56136b();
    }

    /* renamed from: a */
    public final boolean m56139a(@NotNull C14789c c14789c) {
        C2668g.b(c14789c, "message");
        C14797g a = this.f46402a.m56134a();
        return a instanceof C16515a ? ((C16515a) a).m61934a().m56090a().send(c14789c) : null;
    }
}
