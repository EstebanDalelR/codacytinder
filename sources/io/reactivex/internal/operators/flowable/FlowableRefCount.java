package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.C15676b;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p490b.C18339a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableRefCount<T> extends C18364a<T, T> {
    /* renamed from: c */
    final C18339a<T> f58844c;
    /* renamed from: d */
    volatile C17356a f58845d = new C17356a();
    /* renamed from: e */
    final AtomicInteger f58846e = new AtomicInteger();
    /* renamed from: f */
    final ReentrantLock f58847f = new ReentrantLock();

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableRefCount$b */
    final class C15691b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ FlowableRefCount f48557a;
        /* renamed from: b */
        private final C17356a f48558b;

        C15691b(FlowableRefCount flowableRefCount, C17356a c17356a) {
            this.f48557a = flowableRefCount;
            this.f48558b = c17356a;
        }

        public void run() {
            this.f48557a.f58847f.lock();
            try {
                if (this.f48557a.f58845d == this.f48558b && this.f48557a.f58846e.decrementAndGet() == 0) {
                    if (this.f48557a.f58844c instanceof Disposable) {
                        ((Disposable) this.f48557a.f58844c).dispose();
                    }
                    this.f48557a.f58845d.dispose();
                    this.f48557a.f58845d = new C17356a();
                }
                this.f48557a.f58847f.unlock();
            } catch (Throwable th) {
                this.f48557a.f58847f.unlock();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableRefCount$a */
    final class C17411a implements Consumer<Disposable> {
        /* renamed from: a */
        final /* synthetic */ FlowableRefCount f53233a;
        /* renamed from: b */
        private final Subscriber<? super T> f53234b;
        /* renamed from: c */
        private final AtomicBoolean f53235c;

        public /* synthetic */ void accept(Object obj) throws Exception {
            m63495a((Disposable) obj);
        }

        C17411a(FlowableRefCount flowableRefCount, Subscriber<? super T> subscriber, AtomicBoolean atomicBoolean) {
            this.f53233a = flowableRefCount;
            this.f53234b = subscriber;
            this.f53235c = atomicBoolean;
        }

        /* renamed from: a */
        public void m63495a(Disposable disposable) {
            try {
                this.f53233a.f58845d.add(disposable);
                this.f53233a.m67591a(this.f53234b, this.f53233a.f58845d);
            } finally {
                this.f53233a.f58847f.unlock();
                this.f53235c.set(false);
            }
        }
    }

    final class ConnectionSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = 152064694420235350L;
        /* renamed from: a */
        final Subscriber<? super T> f56993a;
        /* renamed from: b */
        final C17356a f56994b;
        /* renamed from: c */
        final Disposable f56995c;
        /* renamed from: d */
        final AtomicLong f56996d = new AtomicLong();
        /* renamed from: e */
        final /* synthetic */ FlowableRefCount f56997e;

        ConnectionSubscriber(FlowableRefCount flowableRefCount, Subscriber<? super T> subscriber, C17356a c17356a, Disposable disposable) {
            this.f56997e = flowableRefCount;
            this.f56993a = subscriber;
            this.f56994b = c17356a;
            this.f56995c = disposable;
        }

        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this, this.f56996d, subscription);
        }

        public void onError(Throwable th) {
            m66457a();
            this.f56993a.onError(th);
        }

        public void onNext(T t) {
            this.f56993a.onNext(t);
        }

        public void onComplete() {
            m66457a();
            this.f56993a.onComplete();
        }

        public void request(long j) {
            SubscriptionHelper.deferredRequest(this, this.f56996d, j);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
            this.f56995c.dispose();
        }

        /* renamed from: a */
        void m66457a() {
            this.f56997e.f58847f.lock();
            try {
                if (this.f56997e.f58845d == this.f56994b) {
                    if (this.f56997e.f58844c instanceof Disposable) {
                        ((Disposable) this.f56997e.f58844c).dispose();
                    }
                    this.f56997e.f58845d.dispose();
                    this.f56997e.f58845d = new C17356a();
                    this.f56997e.f58846e.set(0);
                }
                this.f56997e.f58847f.unlock();
            } catch (Throwable th) {
                this.f56997e.f58847f.unlock();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m67590a(org.reactivestreams.Subscriber<? super T> r3) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x003f in list [B:7:0x0022]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.f58847f;
        r0.lock();
        r0 = r2.f58846e;
        r0 = r0.incrementAndGet();
        r1 = 1;
        if (r0 != r1) goto L_0x0035;
    L_0x000e:
        r0 = new java.util.concurrent.atomic.AtomicBoolean;
        r0.<init>(r1);
        r1 = r2.f58844c;	 Catch:{ all -> 0x0028 }
        r3 = r2.m67589a(r3, r0);	 Catch:{ all -> 0x0028 }
        r1.mo13999d(r3);	 Catch:{ all -> 0x0028 }
        r3 = r0.get();
        if (r3 == 0) goto L_0x003f;
    L_0x0022:
        r3 = r2.f58847f;
        r3.unlock();
        goto L_0x003f;
    L_0x0028:
        r3 = move-exception;
        r0 = r0.get();
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r2.f58847f;
        r0.unlock();
    L_0x0034:
        throw r3;
    L_0x0035:
        r0 = r2.f58845d;	 Catch:{ all -> 0x0040 }
        r2.m67591a(r3, r0);	 Catch:{ all -> 0x0040 }
        r3 = r2.f58847f;
        r3.unlock();
    L_0x003f:
        return;
    L_0x0040:
        r3 = move-exception;
        r0 = r2.f58847f;
        r0.unlock();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRefCount.a(org.reactivestreams.Subscriber):void");
    }

    public FlowableRefCount(C18339a<T> c18339a) {
        super(c18339a);
        this.f58844c = c18339a;
    }

    /* renamed from: a */
    private Consumer<Disposable> m67589a(Subscriber<? super T> subscriber, AtomicBoolean atomicBoolean) {
        return new C17411a(this, subscriber, atomicBoolean);
    }

    /* renamed from: a */
    void m67591a(Subscriber<? super T> subscriber, C17356a c17356a) {
        Object connectionSubscriber = new ConnectionSubscriber(this, subscriber, c17356a, m67588a(c17356a));
        subscriber.onSubscribe(connectionSubscriber);
        this.f58844c.a(connectionSubscriber);
    }

    /* renamed from: a */
    private Disposable m67588a(C17356a c17356a) {
        return C15676b.m58841a(new C15691b(this, c17356a));
    }
}
