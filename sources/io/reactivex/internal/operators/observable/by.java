package io.reactivex.internal.operators.observable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.C19003j;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.C17530d;
import io.reactivex.subjects.UnicastSubject;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class by<T> extends C18394a<T, C3959e<T>> {
    /* renamed from: b */
    final long f59055b;
    /* renamed from: c */
    final long f59056c;
    /* renamed from: d */
    final TimeUnit f59057d;
    /* renamed from: e */
    final C15679f f59058e;
    /* renamed from: f */
    final long f59059f;
    /* renamed from: g */
    final int f59060g;
    /* renamed from: h */
    final boolean f59061h;

    /* renamed from: io.reactivex.internal.operators.observable.by$a */
    static final class C19190a<T> extends C19003j<T, Object, C3959e<T>> implements Disposable {
        /* renamed from: g */
        final long f59579g;
        /* renamed from: h */
        final TimeUnit f59580h;
        /* renamed from: i */
        final C15679f f59581i;
        /* renamed from: j */
        final int f59582j;
        /* renamed from: k */
        final boolean f59583k;
        /* renamed from: l */
        final long f59584l;
        /* renamed from: m */
        final C17362c f59585m;
        /* renamed from: n */
        long f59586n;
        /* renamed from: o */
        long f59587o;
        /* renamed from: p */
        Disposable f59588p;
        /* renamed from: q */
        UnicastSubject<T> f59589q;
        /* renamed from: r */
        volatile boolean f59590r;
        /* renamed from: s */
        final AtomicReference<Disposable> f59591s = new AtomicReference();

        /* renamed from: io.reactivex.internal.operators.observable.by$a$a */
        static final class C15713a implements Runnable {
            /* renamed from: a */
            final long f48595a;
            /* renamed from: b */
            final C19190a<?> f48596b;

            C15713a(long j, C19190a<?> c19190a) {
                this.f48595a = j;
                this.f48596b = c19190a;
            }

            public void run() {
                C19190a c19190a = this.f48596b;
                if (c19190a.c) {
                    c19190a.f59590r = true;
                    c19190a.m68231b();
                } else {
                    c19190a.b.offer(this);
                }
                if (c19190a.enter()) {
                    c19190a.m68232c();
                }
            }
        }

        C19190a(Observer<? super C3959e<T>> observer, long j, TimeUnit timeUnit, C15679f c15679f, int i, long j2, boolean z) {
            super(observer, new MpscLinkedQueue());
            this.f59579g = j;
            this.f59580h = timeUnit;
            this.f59581i = c15679f;
            this.f59582j = i;
            this.f59584l = j2;
            this.f59583k = z;
            if (z) {
                this.f59585m = c15679f.mo12872a();
            } else {
                this.f59585m = null;
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59588p, disposable)) {
                this.f59588p = disposable;
                disposable = this.a;
                disposable.onSubscribe(this);
                if (!this.c) {
                    UnicastSubject a = UnicastSubject.m67686a(this.f59582j);
                    this.f59589q = a;
                    disposable.onNext(a);
                    Runnable c15713a = new C15713a(this.f59587o, this);
                    if (this.f59583k != null) {
                        disposable = this.f59585m.m63454a(c15713a, this.f59579g, this.f59579g, this.f59580h);
                    } else {
                        disposable = this.f59581i.mo12919a(c15713a, this.f59579g, this.f59579g, this.f59580h);
                    }
                    DisposableHelper.replace(this.f59591s, disposable);
                }
            }
        }

        public void onNext(T t) {
            if (!this.f59590r) {
                if (m67552a()) {
                    UnicastSubject unicastSubject = this.f59589q;
                    unicastSubject.onNext(t);
                    long j = this.f59586n + 1;
                    if (j >= this.f59584l) {
                        this.f59587o++;
                        this.f59586n = 0;
                        unicastSubject.onComplete();
                        t = UnicastSubject.m67686a(this.f59582j);
                        this.f59589q = t;
                        this.a.onNext(t);
                        if (this.f59583k != null) {
                            ((Disposable) this.f59591s.get()).dispose();
                            DisposableHelper.replace(this.f59591s, this.f59585m.m63454a(new C15713a(this.f59587o, this), this.f59579g, this.f59579g, this.f59580h));
                        }
                    } else {
                        this.f59586n = j;
                    }
                    if (leave(-1) == null) {
                        return;
                    }
                }
                this.b.offer(NotificationLite.next(t));
                if (enter() == null) {
                    return;
                }
                m68232c();
            }
        }

        public void onError(Throwable th) {
            this.e = th;
            this.d = true;
            if (enter()) {
                m68232c();
            }
            this.a.onError(th);
            m68231b();
        }

        public void onComplete() {
            this.d = true;
            if (enter()) {
                m68232c();
            }
            this.a.onComplete();
            m68231b();
        }

        public void dispose() {
            this.c = true;
        }

        public boolean isDisposed() {
            return this.c;
        }

        /* renamed from: b */
        void m68231b() {
            DisposableHelper.dispose(this.f59591s);
            C17362c c17362c = this.f59585m;
            if (c17362c != null) {
                c17362c.dispose();
            }
        }

        /* renamed from: c */
        void m68232c() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.b;
            Observer observer = this.a;
            UnicastSubject unicastSubject = this.f59589q;
            int i = 1;
            while (!this.f59590r) {
                boolean z = this.d;
                Object poll = mpscLinkedQueue.poll();
                Object obj = poll == null ? 1 : null;
                boolean z2 = poll instanceof C15713a;
                if (z && (obj != null || z2)) {
                    this.f59589q = null;
                    mpscLinkedQueue.clear();
                    m68231b();
                    Throwable th = this.e;
                    if (th != null) {
                        unicastSubject.onError(th);
                    } else {
                        unicastSubject.onComplete();
                    }
                    return;
                } else if (obj != null) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z2) {
                    C15713a c15713a = (C15713a) poll;
                    if (this.f59583k || this.f59587o == c15713a.f48595a) {
                        unicastSubject.onComplete();
                        this.f59586n = 0;
                        unicastSubject = UnicastSubject.m67686a(this.f59582j);
                        this.f59589q = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(poll));
                    long j = this.f59586n + 1;
                    if (j >= this.f59584l) {
                        this.f59587o++;
                        this.f59586n = 0;
                        unicastSubject.onComplete();
                        unicastSubject = UnicastSubject.m67686a(this.f59582j);
                        this.f59589q = unicastSubject;
                        this.a.onNext(unicastSubject);
                        if (this.f59583k) {
                            Disposable disposable = (Disposable) this.f59591s.get();
                            disposable.dispose();
                            Disposable a = this.f59585m.m63454a(new C15713a(this.f59587o, this), this.f59579g, this.f59579g, this.f59580h);
                            if (!this.f59591s.compareAndSet(disposable, a)) {
                                a.dispose();
                            }
                        }
                    } else {
                        this.f59586n = j;
                    }
                }
            }
            this.f59588p.dispose();
            mpscLinkedQueue.clear();
            m68231b();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.by$b */
    static final class C19191b<T> extends C19003j<T, Object, C3959e<T>> implements Observer<T>, Disposable, Runnable {
        /* renamed from: n */
        static final Object f59592n = new Object();
        /* renamed from: g */
        final long f59593g;
        /* renamed from: h */
        final TimeUnit f59594h;
        /* renamed from: i */
        final C15679f f59595i;
        /* renamed from: j */
        final int f59596j;
        /* renamed from: k */
        Disposable f59597k;
        /* renamed from: l */
        UnicastSubject<T> f59598l;
        /* renamed from: m */
        final AtomicReference<Disposable> f59599m = new AtomicReference();
        /* renamed from: o */
        volatile boolean f59600o;

        C19191b(Observer<? super C3959e<T>> observer, long j, TimeUnit timeUnit, C15679f c15679f, int i) {
            super(observer, new MpscLinkedQueue());
            this.f59593g = j;
            this.f59594h = timeUnit;
            this.f59595i = c15679f;
            this.f59596j = i;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59597k, disposable)) {
                this.f59597k = disposable;
                this.f59598l = UnicastSubject.m67686a(this.f59596j);
                disposable = this.a;
                disposable.onSubscribe(this);
                disposable.onNext(this.f59598l);
                if (this.c == null) {
                    DisposableHelper.replace(this.f59599m, this.f59595i.mo12919a(this, this.f59593g, this.f59593g, this.f59594h));
                }
            }
        }

        public void onNext(T t) {
            if (!this.f59600o) {
                if (m67552a()) {
                    this.f59598l.onNext(t);
                    if (leave(-1) == null) {
                        return;
                    }
                }
                this.b.offer(NotificationLite.next(t));
                if (enter() == null) {
                    return;
                }
                m68234c();
            }
        }

        public void onError(Throwable th) {
            this.e = th;
            this.d = true;
            if (enter()) {
                m68234c();
            }
            m68233b();
            this.a.onError(th);
        }

        public void onComplete() {
            this.d = true;
            if (enter()) {
                m68234c();
            }
            m68233b();
            this.a.onComplete();
        }

        public void dispose() {
            this.c = true;
        }

        public boolean isDisposed() {
            return this.c;
        }

        /* renamed from: b */
        void m68233b() {
            DisposableHelper.dispose(this.f59599m);
        }

        public void run() {
            if (this.c) {
                this.f59600o = true;
                m68233b();
            }
            this.b.offer(f59592n);
            if (enter()) {
                m68234c();
            }
        }

        /* renamed from: c */
        void m68234c() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.b;
            Observer observer = this.a;
            UnicastSubject unicastSubject = this.f59598l;
            int i = 1;
            while (true) {
                boolean z = this.f59600o;
                boolean z2 = this.d;
                Object poll = mpscLinkedQueue.poll();
                if (!(z2 && (poll == null || poll == f59592n))) {
                    if (poll == null) {
                        i = leave(-i);
                        if (i == 0) {
                            return;
                        }
                    } else if (poll == f59592n) {
                        unicastSubject.onComplete();
                        if (z) {
                            this.f59597k.dispose();
                        } else {
                            unicastSubject = UnicastSubject.m67686a(this.f59596j);
                            this.f59598l = unicastSubject;
                            observer.onNext(unicastSubject);
                        }
                    } else {
                        unicastSubject.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
            this.f59598l = null;
            mpscLinkedQueue.clear();
            m68233b();
            Throwable th = this.e;
            if (th != null) {
                unicastSubject.onError(th);
            } else {
                unicastSubject.onComplete();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.by$c */
    static final class C19192c<T> extends C19003j<T, Object, C3959e<T>> implements Disposable, Runnable {
        /* renamed from: g */
        final long f59601g;
        /* renamed from: h */
        final long f59602h;
        /* renamed from: i */
        final TimeUnit f59603i;
        /* renamed from: j */
        final C17362c f59604j;
        /* renamed from: k */
        final int f59605k;
        /* renamed from: l */
        final List<UnicastSubject<T>> f59606l = new LinkedList();
        /* renamed from: m */
        Disposable f59607m;
        /* renamed from: n */
        volatile boolean f59608n;

        /* renamed from: io.reactivex.internal.operators.observable.by$c$a */
        final class C15714a implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C19192c f48597a;
            /* renamed from: b */
            private final UnicastSubject<T> f48598b;

            C15714a(C19192c c19192c, UnicastSubject<T> unicastSubject) {
                this.f48597a = c19192c;
                this.f48598b = unicastSubject;
            }

            public void run() {
                this.f48597a.m68235a(this.f48598b);
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.by$c$b */
        static final class C15715b<T> {
            /* renamed from: a */
            final UnicastSubject<T> f48599a;
            /* renamed from: b */
            final boolean f48600b;

            C15715b(UnicastSubject<T> unicastSubject, boolean z) {
                this.f48599a = unicastSubject;
                this.f48600b = z;
            }
        }

        C19192c(Observer<? super C3959e<T>> observer, long j, long j2, TimeUnit timeUnit, C17362c c17362c, int i) {
            super(observer, new MpscLinkedQueue());
            this.f59601g = j;
            this.f59602h = j2;
            this.f59603i = timeUnit;
            this.f59604j = c17362c;
            this.f59605k = i;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59607m, disposable)) {
                this.f59607m = disposable;
                this.a.onSubscribe(this);
                if (this.c == null) {
                    disposable = UnicastSubject.m67686a(this.f59605k);
                    this.f59606l.add(disposable);
                    this.a.onNext(disposable);
                    this.f59604j.mo13559a(new C15714a(this, disposable), this.f59601g, this.f59603i);
                    this.f59604j.m63454a(this, this.f59602h, this.f59602h, this.f59603i);
                }
            }
        }

        public void onNext(T t) {
            if (m67552a()) {
                for (UnicastSubject onNext : this.f59606l) {
                    onNext.onNext(t);
                }
                if (leave(-1) == null) {
                    return;
                }
            }
            this.b.offer(t);
            if (enter() == null) {
                return;
            }
            m68237c();
        }

        public void onError(Throwable th) {
            this.e = th;
            this.d = true;
            if (enter()) {
                m68237c();
            }
            this.a.onError(th);
            m68236b();
        }

        public void onComplete() {
            this.d = true;
            if (enter()) {
                m68237c();
            }
            this.a.onComplete();
            m68236b();
        }

        public void dispose() {
            this.c = true;
        }

        public boolean isDisposed() {
            return this.c;
        }

        /* renamed from: b */
        void m68236b() {
            this.f59604j.dispose();
        }

        /* renamed from: a */
        void m68235a(UnicastSubject<T> unicastSubject) {
            this.b.offer(new C15715b(unicastSubject, false));
            if (enter() != null) {
                m68237c();
            }
        }

        /* renamed from: c */
        void m68237c() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.b;
            Observer observer = this.a;
            List<UnicastSubject> list = this.f59606l;
            int i = 1;
            while (!this.f59608n) {
                boolean z = this.d;
                Object poll = mpscLinkedQueue.poll();
                Object obj = poll == null ? 1 : null;
                boolean z2 = poll instanceof C15715b;
                if (z && (obj != null || z2)) {
                    mpscLinkedQueue.clear();
                    Throwable th = this.e;
                    if (th != null) {
                        for (UnicastSubject onError : list) {
                            onError.onError(th);
                        }
                    } else {
                        for (UnicastSubject onComplete : list) {
                            onComplete.onComplete();
                        }
                    }
                    m68236b();
                    list.clear();
                    return;
                } else if (obj != null) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z2) {
                    C15715b c15715b = (C15715b) poll;
                    if (!c15715b.f48600b) {
                        list.remove(c15715b.f48599a);
                        c15715b.f48599a.onComplete();
                        if (list.isEmpty() && this.c) {
                            this.f59608n = true;
                        }
                    } else if (!this.c) {
                        UnicastSubject a = UnicastSubject.m67686a(this.f59605k);
                        list.add(a);
                        observer.onNext(a);
                        this.f59604j.mo13559a(new C15714a(this, a), this.f59601g, this.f59603i);
                    }
                } else {
                    for (UnicastSubject onNext : list) {
                        onNext.onNext(poll);
                    }
                }
            }
            this.f59607m.dispose();
            m68236b();
            mpscLinkedQueue.clear();
            list.clear();
        }

        public void run() {
            C15715b c15715b = new C15715b(UnicastSubject.m67686a(this.f59605k), true);
            if (!this.c) {
                this.b.offer(c15715b);
            }
            if (enter()) {
                m68237c();
            }
        }
    }

    public by(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, C15679f c15679f, long j3, int i, boolean z) {
        super(observableSource);
        this.f59055b = j;
        this.f59056c = j2;
        this.f59057d = timeUnit;
        this.f59058e = c15679f;
        this.f59059f = j3;
        this.f59060g = i;
        this.f59061h = z;
    }

    public void subscribeActual(Observer<? super C3959e<T>> observer) {
        Observer c17530d = new C17530d(observer);
        if (this.f59055b != this.f59056c) {
            this.a.subscribe(new C19192c(c17530d, this.f59055b, this.f59056c, this.f59057d, this.f59058e.mo12872a(), this.f59060g));
        } else if (this.f59059f == Format.OFFSET_SAMPLE_RELATIVE) {
            this.a.subscribe(new C19191b(c17530d, this.f59055b, this.f59057d, this.f59058e, this.f59060g));
        } else {
            this.a.subscribe(new C19190a(c17530d, this.f59055b, this.f59057d, this.f59058e, this.f59060g, this.f59059f, this.f59061h));
        }
    }
}
