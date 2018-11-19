package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p497b.C19565b;
import rx.p500e.C19407e;
import rx.p500e.C19573b;

/* renamed from: rx.internal.operators.r */
public final class C19889r<T> implements OnSubscribe<T> {
    /* renamed from: a */
    volatile C19573b f62291a = new C19573b();
    /* renamed from: b */
    final AtomicInteger f62292b = new AtomicInteger(0);
    /* renamed from: c */
    final ReentrantLock f62293c = new ReentrantLock();
    /* renamed from: d */
    private final C19565b<? extends T> f62294d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m71625a(rx.C19571c<? super T> r3) {
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
        r0 = r2.f62293c;
        r0.lock();
        r0 = r2.f62292b;
        r0 = r0.incrementAndGet();
        r1 = 1;
        if (r0 != r1) goto L_0x0035;
    L_0x000e:
        r0 = new java.util.concurrent.atomic.AtomicBoolean;
        r0.<init>(r1);
        r1 = r2.f62294d;	 Catch:{ all -> 0x0028 }
        r3 = r2.m71624a(r3, r0);	 Catch:{ all -> 0x0028 }
        r1.mo14748e(r3);	 Catch:{ all -> 0x0028 }
        r3 = r0.get();
        if (r3 == 0) goto L_0x003f;
    L_0x0022:
        r3 = r2.f62293c;
        r3.unlock();
        goto L_0x003f;
    L_0x0028:
        r3 = move-exception;
        r0 = r0.get();
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r2.f62293c;
        r0.unlock();
    L_0x0034:
        throw r3;
    L_0x0035:
        r0 = r2.f62291a;	 Catch:{ all -> 0x0040 }
        r2.m71626a(r3, r0);	 Catch:{ all -> 0x0040 }
        r3 = r2.f62293c;
        r3.unlock();
    L_0x003f:
        return;
    L_0x0040:
        r3 = move-exception;
        r0 = r2.f62293c;
        r0.unlock();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.r.a(rx.c):void");
    }

    public /* synthetic */ void call(Object obj) {
        m71625a((C19571c) obj);
    }

    public C19889r(C19565b<? extends T> c19565b) {
        this.f62294d = c19565b;
    }

    /* renamed from: a */
    private Action1<Subscription> m71624a(final C19571c<? super T> c19571c, final AtomicBoolean atomicBoolean) {
        return new Action1<Subscription>(this) {
            /* renamed from: c */
            final /* synthetic */ C19889r f62081c;

            public /* synthetic */ void call(Object obj) {
                m71475a((Subscription) obj);
            }

            /* renamed from: a */
            public void m71475a(Subscription subscription) {
                try {
                    this.f62081c.f62291a.m70548a(subscription);
                    this.f62081c.m71626a(c19571c, this.f62081c.f62291a);
                } finally {
                    this.f62081c.f62293c.unlock();
                    atomicBoolean.set(false);
                }
            }
        };
    }

    /* renamed from: a */
    void m71626a(final C19571c<? super T> c19571c, final C19573b c19573b) {
        c19571c.add(m71622a(c19573b));
        this.f62294d.m69661a(new C19571c<T>(this, c19571c) {
            /* renamed from: c */
            final /* synthetic */ C19889r f61764c;

            public void onError(Throwable th) {
                m71010a();
                c19571c.onError(th);
            }

            public void onNext(T t) {
                c19571c.onNext(t);
            }

            public void onCompleted() {
                m71010a();
                c19571c.onCompleted();
            }

            /* renamed from: a */
            void m71010a() {
                this.f61764c.f62293c.lock();
                try {
                    if (this.f61764c.f62291a == c19573b) {
                        if (this.f61764c.f62294d instanceof Subscription) {
                            ((Subscription) this.f61764c.f62294d).unsubscribe();
                        }
                        this.f61764c.f62291a.unsubscribe();
                        this.f61764c.f62291a = new C19573b();
                        this.f61764c.f62292b.set(0);
                    }
                    this.f61764c.f62293c.unlock();
                } catch (Throwable th) {
                    this.f61764c.f62293c.unlock();
                }
            }
        });
    }

    /* renamed from: a */
    private Subscription m71622a(final C19573b c19573b) {
        return C19407e.m69854a(new Action0(this) {
            /* renamed from: b */
            final /* synthetic */ C19889r f62083b;

            public void call() {
                this.f62083b.f62293c.lock();
                try {
                    if (this.f62083b.f62291a == c19573b && this.f62083b.f62292b.decrementAndGet() == 0) {
                        if (this.f62083b.f62294d instanceof Subscription) {
                            ((Subscription) this.f62083b.f62294d).unsubscribe();
                        }
                        this.f62083b.f62291a.unsubscribe();
                        this.f62083b.f62291a = new C19573b();
                    }
                    this.f62083b.f62293c.unlock();
                } catch (Throwable th) {
                    this.f62083b.f62293c.unlock();
                }
            }
        });
    }
}
