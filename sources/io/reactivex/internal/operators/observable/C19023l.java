package io.reactivex.internal.operators.observable;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.C19003j;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.C15742i;
import io.reactivex.observers.C17530d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.l */
public final class C19023l<T, U extends Collection<? super T>> extends C18394a<T, U> {
    /* renamed from: b */
    final long f59068b;
    /* renamed from: c */
    final long f59069c;
    /* renamed from: d */
    final TimeUnit f59070d;
    /* renamed from: e */
    final C15679f f59071e;
    /* renamed from: f */
    final Callable<U> f59072f;
    /* renamed from: g */
    final int f59073g;
    /* renamed from: h */
    final boolean f59074h;

    /* renamed from: io.reactivex.internal.operators.observable.l$a */
    static final class C19195a<T, U extends Collection<? super T>> extends C19003j<T, U, U> implements Disposable, Runnable {
        /* renamed from: g */
        final Callable<U> f59619g;
        /* renamed from: h */
        final long f59620h;
        /* renamed from: i */
        final TimeUnit f59621i;
        /* renamed from: j */
        final int f59622j;
        /* renamed from: k */
        final boolean f59623k;
        /* renamed from: l */
        final C17362c f59624l;
        /* renamed from: m */
        U f59625m;
        /* renamed from: n */
        Disposable f59626n;
        /* renamed from: o */
        Disposable f59627o;
        /* renamed from: p */
        long f59628p;
        /* renamed from: q */
        long f59629q;

        public /* synthetic */ void accept(Observer observer, Object obj) {
            m68243a(observer, (Collection) obj);
        }

        C19195a(Observer<? super U> observer, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, C17362c c17362c) {
            super(observer, new MpscLinkedQueue());
            this.f59619g = callable;
            this.f59620h = j;
            this.f59621i = timeUnit;
            this.f59622j = i;
            this.f59623k = z;
            this.f59624l = c17362c;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59627o, disposable)) {
                this.f59627o = disposable;
                try {
                    this.f59625m = (Collection) C15684a.m58895a(this.f59619g.call(), "The buffer supplied is null");
                    this.a.onSubscribe(this);
                    this.f59626n = this.f59624l.m63454a(this, this.f59620h, this.f59620h, this.f59621i);
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    disposable.dispose();
                    EmptyDisposable.error(th, this.a);
                    this.f59624l.dispose();
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r8) {
            /*
            r7 = this;
            monitor-enter(r7);
            r0 = r7.f59625m;	 Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0007;
        L_0x0005:
            monitor-exit(r7);	 Catch:{ all -> 0x006a }
            return;
        L_0x0007:
            r0.add(r8);	 Catch:{ all -> 0x006a }
            r8 = r0.size();	 Catch:{ all -> 0x006a }
            r1 = r7.f59622j;	 Catch:{ all -> 0x006a }
            if (r8 >= r1) goto L_0x0014;
        L_0x0012:
            monitor-exit(r7);	 Catch:{ all -> 0x006a }
            return;
        L_0x0014:
            r8 = 0;
            r7.f59625m = r8;	 Catch:{ all -> 0x006a }
            r1 = r7.f59628p;	 Catch:{ all -> 0x006a }
            r3 = 1;
            r5 = r1 + r3;
            r7.f59628p = r5;	 Catch:{ all -> 0x006a }
            monitor-exit(r7);	 Catch:{ all -> 0x006a }
            r8 = r7.f59623k;
            if (r8 == 0) goto L_0x0029;
        L_0x0024:
            r8 = r7.f59626n;
            r8.dispose();
        L_0x0029:
            r8 = 0;
            r7.m67553b(r0, r8, r7);
            r8 = r7.f59619g;	 Catch:{ Throwable -> 0x005d }
            r8 = r8.call();	 Catch:{ Throwable -> 0x005d }
            r0 = "The buffer supplied is null";
            r8 = io.reactivex.internal.functions.C15684a.m58895a(r8, r0);	 Catch:{ Throwable -> 0x005d }
            r8 = (java.util.Collection) r8;	 Catch:{ Throwable -> 0x005d }
            monitor-enter(r7);
            r7.f59625m = r8;	 Catch:{ all -> 0x005a }
            r0 = r7.f59629q;	 Catch:{ all -> 0x005a }
            r8 = 0;
            r5 = r0 + r3;
            r7.f59629q = r5;	 Catch:{ all -> 0x005a }
            monitor-exit(r7);	 Catch:{ all -> 0x005a }
            r8 = r7.f59623k;
            if (r8 == 0) goto L_0x0059;
        L_0x004a:
            r0 = r7.f59624l;
            r2 = r7.f59620h;
            r4 = r7.f59620h;
            r6 = r7.f59621i;
            r1 = r7;
            r8 = r0.m63454a(r1, r2, r4, r6);
            r7.f59626n = r8;
        L_0x0059:
            return;
        L_0x005a:
            r8 = move-exception;
            monitor-exit(r7);	 Catch:{ all -> 0x005a }
            throw r8;
        L_0x005d:
            r8 = move-exception;
            io.reactivex.exceptions.C15678a.m58850b(r8);
            r0 = r7.a;
            r0.onError(r8);
            r7.dispose();
            return;
        L_0x006a:
            r8 = move-exception;
            monitor-exit(r7);	 Catch:{ all -> 0x006a }
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.l.a.onNext(java.lang.Object):void");
        }

        public void onError(Throwable th) {
            synchronized (this) {
                this.f59625m = null;
            }
            this.a.onError(th);
            this.f59624l.dispose();
        }

        public void onComplete() {
            Collection collection;
            this.f59624l.dispose();
            synchronized (this) {
                collection = this.f59625m;
                this.f59625m = null;
            }
            this.b.offer(collection);
            this.d = true;
            if (enter()) {
                C15742i.m58996a(this.b, this.a, false, this, this);
            }
        }

        /* renamed from: a */
        public void m68243a(Observer<? super U> observer, U u) {
            observer.onNext(u);
        }

        public void dispose() {
            if (!this.c) {
                this.c = true;
                this.f59627o.dispose();
                this.f59624l.dispose();
                synchronized (this) {
                    this.f59625m = null;
                }
            }
        }

        public boolean isDisposed() {
            return this.c;
        }

        public void run() {
            try {
                Collection collection = (Collection) C15684a.m58895a(this.f59619g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    Collection collection2 = this.f59625m;
                    if (collection2 != null) {
                        if (this.f59628p == this.f59629q) {
                            this.f59625m = collection;
                            m67553b(collection2, false, this);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                C15678a.m58850b(th);
                dispose();
                this.a.onError(th);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.l$b */
    static final class C19196b<T, U extends Collection<? super T>> extends C19003j<T, U, U> implements Disposable, Runnable {
        /* renamed from: g */
        final Callable<U> f59630g;
        /* renamed from: h */
        final long f59631h;
        /* renamed from: i */
        final TimeUnit f59632i;
        /* renamed from: j */
        final C15679f f59633j;
        /* renamed from: k */
        Disposable f59634k;
        /* renamed from: l */
        U f59635l;
        /* renamed from: m */
        final AtomicReference<Disposable> f59636m = new AtomicReference();

        public /* synthetic */ void accept(Observer observer, Object obj) {
            m68244a(observer, (Collection) obj);
        }

        C19196b(Observer<? super U> observer, Callable<U> callable, long j, TimeUnit timeUnit, C15679f c15679f) {
            super(observer, new MpscLinkedQueue());
            this.f59630g = callable;
            this.f59631h = j;
            this.f59632i = timeUnit;
            this.f59633j = c15679f;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59634k, disposable)) {
                this.f59634k = disposable;
                try {
                    this.f59635l = (Collection) C15684a.m58895a(this.f59630g.call(), "The buffer supplied is null");
                    this.a.onSubscribe(this);
                    if (this.c == null) {
                        disposable = this.f59633j.mo12919a(this, this.f59631h, this.f59631h, this.f59632i);
                        if (!this.f59636m.compareAndSet(null, disposable)) {
                            disposable.dispose();
                        }
                    }
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    dispose();
                    EmptyDisposable.error(th, this.a);
                }
            }
        }

        public void onNext(T t) {
            synchronized (this) {
                Collection collection = this.f59635l;
                if (collection == null) {
                    return;
                }
                collection.add(t);
            }
        }

        public void onError(Throwable th) {
            synchronized (this) {
                this.f59635l = null;
            }
            this.a.onError(th);
            DisposableHelper.dispose(this.f59636m);
        }

        public void onComplete() {
            synchronized (this) {
                Collection collection = this.f59635l;
                this.f59635l = null;
            }
            if (collection != null) {
                this.b.offer(collection);
                this.d = true;
                if (enter()) {
                    C15742i.m58996a(this.b, this.a, false, null, this);
                }
            }
            DisposableHelper.dispose(this.f59636m);
        }

        public void dispose() {
            DisposableHelper.dispose(this.f59636m);
            this.f59634k.dispose();
        }

        public boolean isDisposed() {
            return this.f59636m.get() == DisposableHelper.DISPOSED;
        }

        public void run() {
            try {
                Collection collection;
                Collection collection2 = (Collection) C15684a.m58895a(this.f59630g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    collection = this.f59635l;
                    if (collection != null) {
                        this.f59635l = collection2;
                    }
                }
                if (collection == null) {
                    DisposableHelper.dispose(this.f59636m);
                } else {
                    m67551a(collection, false, this);
                }
            } catch (Throwable th) {
                C15678a.m58850b(th);
                this.a.onError(th);
                dispose();
            }
        }

        /* renamed from: a */
        public void m68244a(Observer<? super U> observer, U u) {
            this.a.onNext(u);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.l$c */
    static final class C19197c<T, U extends Collection<? super T>> extends C19003j<T, U, U> implements Disposable, Runnable {
        /* renamed from: g */
        final Callable<U> f59637g;
        /* renamed from: h */
        final long f59638h;
        /* renamed from: i */
        final long f59639i;
        /* renamed from: j */
        final TimeUnit f59640j;
        /* renamed from: k */
        final C17362c f59641k;
        /* renamed from: l */
        final List<U> f59642l = new LinkedList();
        /* renamed from: m */
        Disposable f59643m;

        /* renamed from: io.reactivex.internal.operators.observable.l$c$a */
        final class C15721a implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C19197c f48613a;
            /* renamed from: b */
            private final U f48614b;

            C15721a(C19197c c19197c, U u) {
                this.f48613a = c19197c;
                this.f48614b = u;
            }

            public void run() {
                synchronized (this.f48613a) {
                    this.f48613a.f59642l.remove(this.f48614b);
                }
                this.f48613a.m67553b(this.f48614b, false, this.f48613a.f59641k);
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.l$c$b */
        final class C15722b implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C19197c f48615a;
            /* renamed from: b */
            private final U f48616b;

            C15722b(C19197c c19197c, U u) {
                this.f48615a = c19197c;
                this.f48616b = u;
            }

            public void run() {
                synchronized (this.f48615a) {
                    this.f48615a.f59642l.remove(this.f48616b);
                }
                this.f48615a.m67553b(this.f48616b, false, this.f48615a.f59641k);
            }
        }

        public /* synthetic */ void accept(Observer observer, Object obj) {
            m68247a(observer, (Collection) obj);
        }

        C19197c(Observer<? super U> observer, Callable<U> callable, long j, long j2, TimeUnit timeUnit, C17362c c17362c) {
            super(observer, new MpscLinkedQueue());
            this.f59637g = callable;
            this.f59638h = j;
            this.f59639i = j2;
            this.f59640j = timeUnit;
            this.f59641k = c17362c;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59643m, disposable)) {
                this.f59643m = disposable;
                try {
                    Collection collection = (Collection) C15684a.m58895a(this.f59637g.call(), "The buffer supplied is null");
                    this.f59642l.add(collection);
                    this.a.onSubscribe(this);
                    this.f59641k.m63454a(this, this.f59639i, this.f59639i, this.f59640j);
                    this.f59641k.mo13559a(new C15722b(this, collection), this.f59638h, this.f59640j);
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    disposable.dispose();
                    EmptyDisposable.error(th, this.a);
                    this.f59641k.dispose();
                }
            }
        }

        public void onNext(T t) {
            synchronized (this) {
                for (Collection add : this.f59642l) {
                    add.add(t);
                }
            }
        }

        public void onError(Throwable th) {
            this.d = true;
            m68248b();
            this.a.onError(th);
            this.f59641k.dispose();
        }

        public void onComplete() {
            synchronized (this) {
                List<Collection> arrayList = new ArrayList(this.f59642l);
                this.f59642l.clear();
            }
            for (Collection offer : arrayList) {
                this.b.offer(offer);
            }
            this.d = true;
            if (enter()) {
                C15742i.m58996a(this.b, this.a, false, this.f59641k, this);
            }
        }

        public void dispose() {
            if (!this.c) {
                this.c = true;
                m68248b();
                this.f59643m.dispose();
                this.f59641k.dispose();
            }
        }

        public boolean isDisposed() {
            return this.c;
        }

        /* renamed from: b */
        void m68248b() {
            synchronized (this) {
                this.f59642l.clear();
            }
        }

        public void run() {
            if (!this.c) {
                try {
                    Collection collection = (Collection) C15684a.m58895a(this.f59637g.call(), "The bufferSupplier returned a null buffer");
                    synchronized (this) {
                        if (this.c) {
                            return;
                        }
                        this.f59642l.add(collection);
                        this.f59641k.mo13559a(new C15721a(this, collection), this.f59638h, this.f59640j);
                    }
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    this.a.onError(th);
                    dispose();
                }
            }
        }

        /* renamed from: a */
        public void m68247a(Observer<? super U> observer, U u) {
            observer.onNext(u);
        }
    }

    public C19023l(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, C15679f c15679f, Callable<U> callable, int i, boolean z) {
        super(observableSource);
        this.f59068b = j;
        this.f59069c = j2;
        this.f59070d = timeUnit;
        this.f59071e = c15679f;
        this.f59072f = callable;
        this.f59073g = i;
        this.f59074h = z;
    }

    protected void subscribeActual(Observer<? super U> observer) {
        if (this.f59068b == this.f59069c && this.f59073g == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            this.a.subscribe(new C19196b(new C17530d(observer), this.f59072f, this.f59068b, this.f59070d, this.f59071e));
            return;
        }
        C17362c a = this.f59071e.mo12872a();
        if (this.f59068b == this.f59069c) {
            this.a.subscribe(new C19195a(new C17530d(observer), this.f59072f, this.f59068b, this.f59070d, this.f59073g, this.f59074h, a));
        } else {
            this.a.subscribe(new C19197c(new C17530d(observer), this.f59072f, this.f59068b, this.f59069c, this.f59070d, a));
        }
    }
}
