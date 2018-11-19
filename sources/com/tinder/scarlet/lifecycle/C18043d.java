package com.tinder.scarlet.lifecycle;

import com.tinder.scarlet.Lifecycle;
import com.tinder.scarlet.Lifecycle.C14785a;
import com.tinder.scarlet.Lifecycle.C14785a.C16489a;
import io.reactivex.C15679f;
import io.reactivex.C3957b;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.schedulers.C15756a;
import io.reactivex.subscribers.C18433a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001fB\u0019\b\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0011\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nB3\b\u0000\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u00020\u00012\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0019\u0010\u0019\u001a\u00020\u00152\u000e\u0010\u001a\u001a\n \u001b*\u0004\u0018\u00010\u00030\u0003H\u0001J\u0019\u0010\u001c\u001a\u00020\u00152\u000e\u0010\u001a\u001a\n \u001b*\u0004\u0018\u00010\u001d0\u001dH\u0001J9\u0010\u001e\u001a\u00020\u00152.\u0010\u001a\u001a*\u0012\u000e\b\u0000\u0012\n \u001b*\u0004\u0018\u00010\u00030\u0003 \u001b*\u0014\u0012\u000e\b\u0000\u0012\n \u001b*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002H\u0001R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;", "Lcom/tinder/scarlet/Lifecycle;", "Lorg/reactivestreams/Subscriber;", "Lcom/tinder/scarlet/Lifecycle$State;", "throttleTimeoutMillis", "", "scheduler", "Lio/reactivex/Scheduler;", "(JLio/reactivex/Scheduler;)V", "throttleDurationMillis", "(J)V", "upstreamProcessor", "Lio/reactivex/processors/FlowableProcessor;", "downstreamProcessor", "throttleScheduler", "(Lio/reactivex/processors/FlowableProcessor;Lio/reactivex/processors/FlowableProcessor;JLio/reactivex/Scheduler;)V", "combineWith", "others", "", "([Lcom/tinder/scarlet/Lifecycle;)Lcom/tinder/scarlet/Lifecycle;", "onComplete", "", "onError", "t", "", "onNext", "p0", "kotlin.jvm.PlatformType", "onSubscribe", "Lorg/reactivestreams/Subscription;", "subscribe", "LifecycleStateSubscriber", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.lifecycle.d */
public final class C18043d implements Lifecycle, Subscriber<C14785a> {
    /* renamed from: a */
    private final C18430a<C14785a> f56045a;
    /* renamed from: b */
    private final C18430a<C14785a> f56046b;
    /* renamed from: c */
    private final /* synthetic */ C18042b f56047c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tinder/scarlet/lifecycle/LifecycleRegistry$LifecycleStateSubscriber;", "Lio/reactivex/subscribers/DisposableSubscriber;", "Lcom/tinder/scarlet/Lifecycle$State;", "(Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;)V", "onComplete", "", "onError", "throwable", "", "onNext", "state", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.lifecycle.d$a */
    private final class C18822a extends C18433a<C14785a> {
        /* renamed from: a */
        final /* synthetic */ C18043d f58362a;

        public C18822a(C18043d c18043d) {
            this.f58362a = c18043d;
        }

        public /* synthetic */ void onNext(Object obj) {
            m67276a((C14785a) obj);
        }

        /* renamed from: a */
        public void m67276a(@NotNull C14785a c14785a) {
            C2668g.b(c14785a, "state");
            this.f58362a.f56046b.onNext(c14785a);
            if (C2668g.a(c14785a, C16489a.f51166a) != null) {
                this.f58362a.f56046b.onComplete();
                dispose();
            }
        }

        public void onError(@NotNull Throwable th) {
            C2668g.b(th, "throwable");
            throw new IllegalStateException("Stream is terminated", th);
        }

        public void onComplete() {
            throw new IllegalStateException("Stream is terminated");
        }
    }

    /* renamed from: a */
    public void m65511a(C14785a c14785a) {
        this.f56045a.onNext(c14785a);
    }

    @NotNull
    public Lifecycle combineWith(@NotNull Lifecycle... lifecycleArr) {
        C2668g.b(lifecycleArr, "others");
        return this.f56047c.combineWith(lifecycleArr);
    }

    public void onSubscribe(Subscription subscription) {
        this.f56045a.onSubscribe(subscription);
    }

    public void subscribe(Subscriber<? super C14785a> subscriber) {
        this.f56047c.subscribe(subscriber);
    }

    public C18043d(@NotNull C18430a<C14785a> c18430a, @NotNull C18430a<C14785a> c18430a2, final long j, @NotNull final C15679f c15679f) {
        C2668g.b(c18430a, "upstreamProcessor");
        C2668g.b(c18430a2, "downstreamProcessor");
        C2668g.b(c15679f, "throttleScheduler");
        C3957b j2 = c18430a2.j();
        C2668g.a(j2, "downstreamProcessor.onBackpressureLatest()");
        this.f56047c = new C18042b(j2, c15679f);
        this.f56045a = c18430a;
        this.f56046b = c18430a2;
        c18430a = this.f56045a.j();
        c18430a2 = (Function2) LifecycleRegistry$1.f59393a;
        if (c18430a2 != null) {
            c18430a2 = new C16545e(c18430a2);
        }
        c18430a = c18430a.a((BiPredicate) c18430a2).a((FlowableTransformer) new FlowableTransformer<T, R>() {
            public /* synthetic */ Publisher apply(C3957b c3957b) {
                return m61965a(c3957b);
            }

            /* renamed from: a */
            public final C3957b<C14785a> m61965a(@NotNull C3957b<C14785a> c3957b) {
                C2668g.b(c3957b, "it");
                return j != 0 ? c3957b.e(j, TimeUnit.MILLISECONDS, c15679f) : c3957b;
            }
        });
        c18430a2 = (Function2) LifecycleRegistry$3.f59394a;
        if (c18430a2 != null) {
            c18430a2 = new C16545e(c18430a2);
        }
        c18430a.a((BiPredicate) c18430a2).a(new C18822a(this));
    }

    public /* synthetic */ void onNext(Object obj) {
        m65511a((C14785a) obj);
    }

    public C18043d(long j, @NotNull C15679f c15679f) {
        C2668g.b(c15679f, "scheduler");
        PublishProcessor q = PublishProcessor.m67663q();
        C2668g.a(q, "PublishProcessor.create()");
        C18430a c18430a = q;
        BehaviorProcessor q2 = BehaviorProcessor.m67654q();
        C2668g.a(q2, "BehaviorProcessor.create()");
        this(c18430a, q2, j, c15679f);
    }

    public /* synthetic */ C18043d(long j, int i, C15823e c15823e) {
        if ((i & 1) != 0) {
            j = 0;
        }
        this(j);
    }

    public C18043d(long j) {
        C15679f a = C15756a.m59008a();
        C2668g.a(a, "Schedulers.computation()");
        this(j, a);
    }

    public void onComplete() {
        this.f56045a.onNext(C16489a.f51166a);
    }

    public void onError(@Nullable Throwable th) {
        this.f56045a.onNext(C16489a.f51166a);
    }
}
