package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.C15676b;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p491c.C18340a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

public final class ObservableRefCount<T> extends C18394a<T, T> {
    /* renamed from: b */
    final C18340a<? extends T> f58956b;
    /* renamed from: c */
    volatile C17356a f58957c = new C17356a();
    /* renamed from: d */
    final AtomicInteger f58958d = new AtomicInteger();
    /* renamed from: e */
    final ReentrantLock f58959e = new ReentrantLock();

    /* renamed from: io.reactivex.internal.operators.observable.ObservableRefCount$b */
    final class C15703b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ObservableRefCount f48582a;
        /* renamed from: b */
        private final C17356a f48583b;

        C15703b(ObservableRefCount observableRefCount, C17356a c17356a) {
            this.f48582a = observableRefCount;
            this.f48583b = c17356a;
        }

        public void run() {
            this.f48582a.f58959e.lock();
            try {
                if (this.f48582a.f58957c == this.f48583b && this.f48582a.f58958d.decrementAndGet() == 0) {
                    if (this.f48582a.f58956b instanceof Disposable) {
                        ((Disposable) this.f48582a.f58956b).dispose();
                    }
                    this.f48582a.f58957c.dispose();
                    this.f48582a.f58957c = new C17356a();
                }
                this.f48582a.f58959e.unlock();
            } catch (Throwable th) {
                this.f48582a.f58959e.unlock();
            }
        }
    }

    final class ConnectionObserver extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        private static final long serialVersionUID = 3813126992133394324L;
        /* renamed from: a */
        final Observer<? super T> f53605a;
        /* renamed from: b */
        final C17356a f53606b;
        /* renamed from: c */
        final Disposable f53607c;
        /* renamed from: d */
        final /* synthetic */ ObservableRefCount f53608d;

        ConnectionObserver(ObservableRefCount observableRefCount, Observer<? super T> observer, C17356a c17356a, Disposable disposable) {
            this.f53608d = observableRefCount;
            this.f53605a = observer;
            this.f53606b = c17356a;
            this.f53607c = disposable;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onError(Throwable th) {
            m63617a();
            this.f53605a.onError(th);
        }

        public void onNext(T t) {
            this.f53605a.onNext(t);
        }

        public void onComplete() {
            m63617a();
            this.f53605a.onComplete();
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            this.f53607c.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        /* renamed from: a */
        void m63617a() {
            this.f53608d.f58959e.lock();
            try {
                if (this.f53608d.f58957c == this.f53606b) {
                    if (this.f53608d.f58956b instanceof Disposable) {
                        ((Disposable) this.f53608d.f58956b).dispose();
                    }
                    this.f53608d.f58957c.dispose();
                    this.f53608d.f58957c = new C17356a();
                    this.f53608d.f58958d.set(0);
                }
                this.f53608d.f58959e.unlock();
            } catch (Throwable th) {
                this.f53608d.f58959e.unlock();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableRefCount$a */
    final class C17442a implements Consumer<Disposable> {
        /* renamed from: a */
        final /* synthetic */ ObservableRefCount f53609a;
        /* renamed from: b */
        private final Observer<? super T> f53610b;
        /* renamed from: c */
        private final AtomicBoolean f53611c;

        public /* synthetic */ void accept(Object obj) throws Exception {
            m63618a((Disposable) obj);
        }

        C17442a(ObservableRefCount observableRefCount, Observer<? super T> observer, AtomicBoolean atomicBoolean) {
            this.f53609a = observableRefCount;
            this.f53610b = observer;
            this.f53611c = atomicBoolean;
        }

        /* renamed from: a */
        public void m63618a(Disposable disposable) {
            try {
                this.f53609a.f58957c.add(disposable);
                this.f53609a.m67633a(this.f53610b, this.f53609a.f58957c);
            } finally {
                this.f53609a.f58959e.unlock();
                this.f53611c.set(false);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
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
        r0 = r2.f58959e;
        r0.lock();
        r0 = r2.f58958d;
        r0 = r0.incrementAndGet();
        r1 = 1;
        if (r0 != r1) goto L_0x0035;
    L_0x000e:
        r0 = new java.util.concurrent.atomic.AtomicBoolean;
        r0.<init>(r1);
        r1 = r2.f58956b;	 Catch:{ all -> 0x0028 }
        r3 = r2.m67632a(r3, r0);	 Catch:{ all -> 0x0028 }
        r1.mo14001a(r3);	 Catch:{ all -> 0x0028 }
        r3 = r0.get();
        if (r3 == 0) goto L_0x003f;
    L_0x0022:
        r3 = r2.f58959e;
        r3.unlock();
        goto L_0x003f;
    L_0x0028:
        r3 = move-exception;
        r0 = r0.get();
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r2.f58959e;
        r0.unlock();
    L_0x0034:
        throw r3;
    L_0x0035:
        r0 = r2.f58957c;	 Catch:{ all -> 0x0040 }
        r2.m67633a(r3, r0);	 Catch:{ all -> 0x0040 }
        r3 = r2.f58959e;
        r3.unlock();
    L_0x003f:
        return;
    L_0x0040:
        r3 = move-exception;
        r0 = r2.f58959e;
        r0.unlock();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableRefCount.subscribeActual(io.reactivex.Observer):void");
    }

    public ObservableRefCount(C18340a<T> c18340a) {
        super(c18340a);
        this.f58956b = c18340a;
    }

    /* renamed from: a */
    private Consumer<Disposable> m67632a(Observer<? super T> observer, AtomicBoolean atomicBoolean) {
        return new C17442a(this, observer, atomicBoolean);
    }

    /* renamed from: a */
    void m67633a(Observer<? super T> observer, C17356a c17356a) {
        Object connectionObserver = new ConnectionObserver(this, observer, c17356a, m67631a(c17356a));
        observer.onSubscribe(connectionObserver);
        this.f58956b.subscribe(connectionObserver);
    }

    /* renamed from: a */
    private Disposable m67631a(C17356a c17356a) {
        return C15676b.m58841a(new C15703b(this, c17356a));
    }
}
