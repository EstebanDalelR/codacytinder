package io.reactivex.internal.operators.observable;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import io.reactivex.C15679f;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.p079d.C2667a;
import io.reactivex.p491c.C18340a;
import io.reactivex.schedulers.C15757b;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableReplay<T> extends C18340a<T> implements Disposable, HasUpstreamObservableSource<T> {
    /* renamed from: e */
    static final C15704a f58965e = new C17447i();
    /* renamed from: a */
    final ObservableSource<T> f58966a;
    /* renamed from: b */
    final AtomicReference<ReplayObserver<T>> f58967b;
    /* renamed from: c */
    final C15704a<T> f58968c;
    /* renamed from: d */
    final ObservableSource<T> f58969d;

    static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        /* renamed from: a */
        final Object f48584a;

        Node(Object obj) {
            this.f48584a = obj;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$a */
    interface C15704a<T> {
        /* renamed from: a */
        C15705e<T> mo12912a();
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$e */
    interface C15705e<T> {
        /* renamed from: a */
        void mo12908a(InnerDisposable<T> innerDisposable);

        /* renamed from: a */
        void mo12909a(T t);

        /* renamed from: a */
        void mo12910a(Throwable th);

        /* renamed from: b */
        void mo12911b();
    }

    static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements C15705e<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        /* renamed from: a */
        Node f53629a;
        /* renamed from: b */
        int f53630b;

        /* renamed from: b */
        Object mo13579b(Object obj) {
            return obj;
        }

        /* renamed from: c */
        Object mo13580c(Object obj) {
            return obj;
        }

        /* renamed from: c */
        abstract void mo13581c();

        /* renamed from: d */
        void mo13582d() {
        }

        BoundedReplayBuffer() {
            Node node = new Node(null);
            this.f53629a = node;
            set(node);
        }

        /* renamed from: a */
        final void m63627a(Node node) {
            this.f53629a.set(node);
            this.f53629a = node;
            this.f53630b++;
        }

        /* renamed from: a */
        final void m63625a() {
            Node node = (Node) ((Node) get()).get();
            this.f53630b--;
            m63632b(node);
        }

        /* renamed from: b */
        final void m63632b(Node node) {
            set(node);
        }

        /* renamed from: a */
        public final void mo12909a(T t) {
            m63627a(new Node(mo13579b(NotificationLite.next(t))));
            mo13581c();
        }

        /* renamed from: a */
        public final void mo12910a(Throwable th) {
            m63627a(new Node(mo13579b(NotificationLite.error(th))));
            mo13582d();
        }

        /* renamed from: b */
        public final void mo12911b() {
            m63627a(new Node(mo13579b(NotificationLite.complete())));
            mo13582d();
        }

        /* renamed from: a */
        public final void mo12908a(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() == 0) {
                int i = 1;
                do {
                    Node node = (Node) innerDisposable.m63637a();
                    if (node == null) {
                        node = mo13583e();
                        innerDisposable.f53633c = node;
                    }
                    while (!innerDisposable.isDisposed()) {
                        Node node2 = (Node) node.get();
                        if (node2 == null) {
                            innerDisposable.f53633c = node;
                            i = innerDisposable.addAndGet(-i);
                        } else if (NotificationLite.accept(mo13580c(node2.f48584a), innerDisposable.f53632b)) {
                            innerDisposable.f53633c = null;
                            return;
                        } else {
                            node = node2;
                        }
                    }
                    return;
                } while (i != 0);
            }
        }

        /* renamed from: e */
        Node mo13583e() {
            return (Node) get();
        }
    }

    static final class InnerDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2728361546769921047L;
        /* renamed from: a */
        final ReplayObserver<T> f53631a;
        /* renamed from: b */
        final Observer<? super T> f53632b;
        /* renamed from: c */
        Object f53633c;
        /* renamed from: d */
        volatile boolean f53634d;

        InnerDisposable(ReplayObserver<T> replayObserver, Observer<? super T> observer) {
            this.f53631a = replayObserver;
            this.f53632b = observer;
        }

        public boolean isDisposed() {
            return this.f53634d;
        }

        public void dispose() {
            if (!this.f53634d) {
                this.f53634d = true;
                this.f53631a.m63641b(this);
            }
        }

        /* renamed from: a */
        <U> U m63637a() {
            return this.f53633c;
        }
    }

    static final class ReplayObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        /* renamed from: c */
        static final InnerDisposable[] f53635c = new InnerDisposable[0];
        /* renamed from: d */
        static final InnerDisposable[] f53636d = new InnerDisposable[0];
        private static final long serialVersionUID = -533785617179540163L;
        /* renamed from: a */
        final C15705e<T> f53637a;
        /* renamed from: b */
        boolean f53638b;
        /* renamed from: e */
        final AtomicReference<InnerDisposable[]> f53639e = new AtomicReference(f53635c);
        /* renamed from: f */
        final AtomicBoolean f53640f = new AtomicBoolean();

        ReplayObserver(C15705e<T> c15705e) {
            this.f53637a = c15705e;
        }

        public boolean isDisposed() {
            return this.f53639e.get() == f53636d;
        }

        public void dispose() {
            this.f53639e.set(f53636d);
            DisposableHelper.dispose(this);
        }

        /* renamed from: a */
        boolean m63639a(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            Object obj;
            do {
                innerDisposableArr = (InnerDisposable[]) this.f53639e.get();
                if (innerDisposableArr == f53636d) {
                    return false;
                }
                int length = innerDisposableArr.length;
                obj = new InnerDisposable[(length + 1)];
                System.arraycopy(innerDisposableArr, 0, obj, 0, length);
                obj[length] = innerDisposable;
            } while (!this.f53639e.compareAndSet(innerDisposableArr, obj));
            return true;
        }

        /* renamed from: b */
        void m63641b(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            Object obj;
            do {
                innerDisposableArr = (InnerDisposable[]) this.f53639e.get();
                int length = innerDisposableArr.length;
                if (length != 0) {
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (innerDisposableArr[i2].equals(innerDisposable)) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f53635c;
                        } else {
                            Object obj2 = new InnerDisposable[(length - 1)];
                            System.arraycopy(innerDisposableArr, 0, obj2, 0, i);
                            System.arraycopy(innerDisposableArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                }
                return;
            } while (!this.f53639e.compareAndSet(innerDisposableArr, obj));
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null) {
                m63638a();
            }
        }

        public void onNext(T t) {
            if (!this.f53638b) {
                this.f53637a.mo12909a((Object) t);
                m63638a();
            }
        }

        public void onError(Throwable th) {
            if (this.f53638b) {
                C2667a.a(th);
                return;
            }
            this.f53638b = true;
            this.f53637a.mo12910a(th);
            m63640b();
        }

        public void onComplete() {
            if (!this.f53638b) {
                this.f53638b = true;
                this.f53637a.mo12911b();
                m63640b();
            }
        }

        /* renamed from: a */
        void m63638a() {
            for (InnerDisposable a : (InnerDisposable[]) this.f53639e.get()) {
                this.f53637a.mo12908a(a);
            }
        }

        /* renamed from: b */
        void m63640b() {
            for (InnerDisposable a : (InnerDisposable[]) this.f53639e.getAndSet(f53636d)) {
                this.f53637a.mo12908a(a);
            }
        }
    }

    static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements C15705e<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        /* renamed from: a */
        volatile int f53641a;

        UnboundedReplayBuffer(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo12909a(T t) {
            add(NotificationLite.next(t));
            this.f53641a++;
        }

        /* renamed from: a */
        public void mo12910a(Throwable th) {
            add(NotificationLite.error(th));
            this.f53641a++;
        }

        /* renamed from: b */
        public void mo12911b() {
            add(NotificationLite.complete());
            this.f53641a++;
        }

        /* renamed from: a */
        public void mo12908a(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() == 0) {
                Observer observer = innerDisposable.f53632b;
                int i = 1;
                while (!innerDisposable.isDisposed()) {
                    int i2 = this.f53641a;
                    Integer num = (Integer) innerDisposable.m63637a();
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (!NotificationLite.accept(get(intValue), observer) && !innerDisposable.isDisposed()) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                    innerDisposable.f53633c = Integer.valueOf(intValue);
                    i = innerDisposable.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$b */
    static final class C17443b<R> implements Consumer<Disposable> {
        /* renamed from: a */
        private final ObserverResourceWrapper<R> f53642a;

        public /* synthetic */ void accept(Object obj) throws Exception {
            m63646a((Disposable) obj);
        }

        C17443b(ObserverResourceWrapper<R> observerResourceWrapper) {
            this.f53642a = observerResourceWrapper;
        }

        /* renamed from: a */
        public void m63646a(Disposable disposable) {
            this.f53642a.m63705a(disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$f */
    static final class C17444f<T> implements C15704a<T> {
        /* renamed from: a */
        private final int f53643a;

        C17444f(int i) {
            this.f53643a = i;
        }

        /* renamed from: a */
        public C15705e<T> mo12912a() {
            return new SizeBoundReplayBuffer(this.f53643a);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$g */
    static final class C17445g<T> implements ObservableSource<T> {
        /* renamed from: a */
        private final AtomicReference<ReplayObserver<T>> f53644a;
        /* renamed from: b */
        private final C15704a<T> f53645b;

        C17445g(AtomicReference<ReplayObserver<T>> atomicReference, C15704a<T> c15704a) {
            this.f53644a = atomicReference;
            this.f53645b = c15704a;
        }

        public void subscribe(Observer<? super T> observer) {
            ReplayObserver replayObserver;
            ReplayObserver replayObserver2;
            while (true) {
                replayObserver = (ReplayObserver) this.f53644a.get();
                if (replayObserver != null) {
                    break;
                }
                replayObserver2 = new ReplayObserver(this.f53645b.mo12912a());
                if (this.f53644a.compareAndSet(null, replayObserver2)) {
                    break;
                }
            }
            replayObserver = replayObserver2;
            InnerDisposable innerDisposable = new InnerDisposable(replayObserver, observer);
            observer.onSubscribe(innerDisposable);
            replayObserver.m63639a(innerDisposable);
            if (innerDisposable.isDisposed() != null) {
                replayObserver.m63641b(innerDisposable);
            } else {
                replayObserver.f53637a.mo12908a(innerDisposable);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$h */
    static final class C17446h<T> implements C15704a<T> {
        /* renamed from: a */
        private final int f53646a;
        /* renamed from: b */
        private final long f53647b;
        /* renamed from: c */
        private final TimeUnit f53648c;
        /* renamed from: d */
        private final C15679f f53649d;

        C17446h(int i, long j, TimeUnit timeUnit, C15679f c15679f) {
            this.f53646a = i;
            this.f53647b = j;
            this.f53648c = timeUnit;
            this.f53649d = c15679f;
        }

        /* renamed from: a */
        public C15705e<T> mo12912a() {
            return new SizeAndTimeBoundReplayBuffer(this.f53646a, this.f53647b, this.f53648c, this.f53649d);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$i */
    static final class C17447i implements C15704a<Object> {
        C17447i() {
        }

        /* renamed from: a */
        public C15705e<Object> mo12912a() {
            return new UnboundedReplayBuffer(16);
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        /* renamed from: c */
        final C15679f f57195c;
        /* renamed from: d */
        final long f57196d;
        /* renamed from: e */
        final TimeUnit f57197e;
        /* renamed from: f */
        final int f57198f;

        SizeAndTimeBoundReplayBuffer(int i, long j, TimeUnit timeUnit, C15679f c15679f) {
            this.f57195c = c15679f;
            this.f57198f = i;
            this.f57196d = j;
            this.f57197e = timeUnit;
        }

        /* renamed from: b */
        Object mo13579b(Object obj) {
            return new C15757b(obj, this.f57195c.m58851a(this.f57197e), this.f57197e);
        }

        /* renamed from: c */
        Object mo13580c(Object obj) {
            return ((C15757b) obj).m59013a();
        }

        /* renamed from: c */
        void mo13581c() {
            long a = this.f57195c.m58851a(this.f57197e) - this.f57196d;
            Node node = (Node) get();
            Node node2 = (Node) node.get();
            int i = 0;
            while (true) {
                Node node3 = node2;
                node2 = node;
                node = node3;
                if (node != null) {
                    if (this.b <= this.f57198f) {
                        if (((C15757b) node.f48584a).m59014b() > a) {
                            break;
                        }
                        i++;
                        this.b--;
                        node2 = (Node) node.get();
                    } else {
                        i++;
                        this.b--;
                        node2 = (Node) node.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                m63632b(node2);
            }
        }

        /* renamed from: d */
        void mo13582d() {
            long a = this.f57195c.m58851a(this.f57197e) - this.f57196d;
            Node node = (Node) get();
            Node node2 = (Node) node.get();
            int i = 0;
            while (true) {
                Node node3 = node2;
                node2 = node;
                node = node3;
                if (node != null && this.b > 1 && ((C15757b) node.f48584a).m59014b() <= a) {
                    i++;
                    this.b--;
                    node2 = (Node) node.get();
                } else if (i != 0) {
                    m63632b(node2);
                }
            }
            if (i != 0) {
                m63632b(node2);
            }
        }

        /* renamed from: e */
        Node mo13583e() {
            long a = this.f57195c.m58851a(this.f57197e) - this.f57196d;
            Node node = (Node) get();
            Node node2 = (Node) node.get();
            while (true) {
                Node node3 = node2;
                node2 = node;
                node = node3;
                if (node != null) {
                    C15757b c15757b = (C15757b) node.f48584a;
                    if (!NotificationLite.isComplete(c15757b.m59013a())) {
                        if (!NotificationLite.isError(c15757b.m59013a())) {
                            if (c15757b.m59014b() > a) {
                                break;
                            }
                            node2 = (Node) node.get();
                        } else {
                            break;
                        }
                    }
                    break;
                }
                break;
            }
            return node2;
        }
    }

    static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        /* renamed from: c */
        final int f57199c;

        SizeBoundReplayBuffer(int i) {
            this.f57199c = i;
        }

        /* renamed from: c */
        void mo13581c() {
            if (this.b > this.f57199c) {
                m63625a();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$c */
    static final class C18391c<R, U> extends C3959e<R> {
        /* renamed from: a */
        private final Callable<? extends C18340a<U>> f57200a;
        /* renamed from: b */
        private final Function<? super C3959e<U>, ? extends ObservableSource<R>> f57201b;

        C18391c(Callable<? extends C18340a<U>> callable, Function<? super C3959e<U>, ? extends ObservableSource<R>> function) {
            this.f57200a = callable;
            this.f57201b = function;
        }

        protected void subscribeActual(Observer<? super R> observer) {
            try {
                C18340a c18340a = (C18340a) C15684a.m58895a(this.f57200a.call(), "The connectableFactory returned a null ConnectableObservable");
                ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f57201b.apply(c18340a), "The selector returned a null ObservableSource");
                Object observerResourceWrapper = new ObserverResourceWrapper(observer);
                observableSource.subscribe(observerResourceWrapper);
                c18340a.mo14001a(new C17443b(observerResourceWrapper));
            } catch (Throwable th) {
                C15678a.m58850b(th);
                EmptyDisposable.error(th, (Observer) observer);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$d */
    static final class C19018d<T> extends C18340a<T> {
        /* renamed from: a */
        private final C18340a<T> f58963a;
        /* renamed from: b */
        private final C3959e<T> f58964b;

        C19018d(C18340a<T> c18340a, C3959e<T> c3959e) {
            this.f58963a = c18340a;
            this.f58964b = c3959e;
        }

        /* renamed from: a */
        public void mo14001a(Consumer<? super Disposable> consumer) {
            this.f58963a.mo14001a(consumer);
        }

        protected void subscribeActual(Observer<? super T> observer) {
            this.f58964b.subscribe(observer);
        }
    }

    /* renamed from: a */
    public static <U, R> C3959e<R> m67641a(Callable<? extends C18340a<U>> callable, Function<? super C3959e<U>, ? extends ObservableSource<R>> function) {
        return C2667a.a(new C18391c(callable, function));
    }

    /* renamed from: a */
    public static <T> C18340a<T> m67640a(C18340a<T> c18340a, C15679f c15679f) {
        return C2667a.a(new C19018d(c18340a, c18340a.observeOn(c15679f)));
    }

    /* renamed from: a */
    public static <T> C18340a<T> m67635a(ObservableSource<? extends T> observableSource) {
        return m67639a((ObservableSource) observableSource, f58965e);
    }

    /* renamed from: a */
    public static <T> C18340a<T> m67636a(ObservableSource<T> observableSource, int i) {
        if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return m67635a((ObservableSource) observableSource);
        }
        return m67639a((ObservableSource) observableSource, new C17444f(i));
    }

    /* renamed from: a */
    public static <T> C18340a<T> m67637a(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, C15679f c15679f) {
        return m67638a(observableSource, j, timeUnit, c15679f, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    /* renamed from: a */
    public static <T> C18340a<T> m67638a(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, C15679f c15679f, int i) {
        return m67639a((ObservableSource) observableSource, new C17446h(i, j, timeUnit, c15679f));
    }

    /* renamed from: a */
    static <T> C18340a<T> m67639a(ObservableSource<T> observableSource, C15704a<T> c15704a) {
        AtomicReference atomicReference = new AtomicReference();
        return C2667a.a(new ObservableReplay(new C17445g(atomicReference, c15704a), observableSource, atomicReference, c15704a));
    }

    private ObservableReplay(ObservableSource<T> observableSource, ObservableSource<T> observableSource2, AtomicReference<ReplayObserver<T>> atomicReference, C15704a<T> c15704a) {
        this.f58969d = observableSource;
        this.f58966a = observableSource2;
        this.f58967b = atomicReference;
        this.f58968c = c15704a;
    }

    public ObservableSource<T> source() {
        return this.f58966a;
    }

    public void dispose() {
        this.f58967b.lazySet(null);
    }

    public boolean isDisposed() {
        Disposable disposable = (Disposable) this.f58967b.get();
        if (disposable != null) {
            if (!disposable.isDisposed()) {
                return false;
            }
        }
        return true;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.f58969d.subscribe(observer);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo14001a(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r5) {
        /*
        r4 = this;
    L_0x0000:
        r0 = r4.f58967b;
        r0 = r0.get();
        r0 = (io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver) r0;
        if (r0 == 0) goto L_0x0010;
    L_0x000a:
        r1 = r0.isDisposed();
        if (r1 == 0) goto L_0x0025;
    L_0x0010:
        r1 = r4.f58968c;
        r1 = r1.mo12912a();
        r2 = new io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver;
        r2.<init>(r1);
        r1 = r4.f58967b;
        r0 = r1.compareAndSet(r0, r2);
        if (r0 != 0) goto L_0x0024;
    L_0x0023:
        goto L_0x0000;
    L_0x0024:
        r0 = r2;
    L_0x0025:
        r1 = r0.f53640f;
        r1 = r1.get();
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x0039;
    L_0x002f:
        r1 = r0.f53640f;
        r1 = r1.compareAndSet(r3, r2);
        if (r1 == 0) goto L_0x0039;
    L_0x0037:
        r1 = 1;
        goto L_0x003a;
    L_0x0039:
        r1 = 0;
    L_0x003a:
        r5.accept(r0);	 Catch:{ Throwable -> 0x0045 }
        if (r1 == 0) goto L_0x0044;
    L_0x003f:
        r5 = r4.f58966a;
        r5.subscribe(r0);
    L_0x0044:
        return;
    L_0x0045:
        r5 = move-exception;
        if (r1 == 0) goto L_0x004d;
    L_0x0048:
        r0 = r0.f53640f;
        r0.compareAndSet(r2, r3);
    L_0x004d:
        io.reactivex.exceptions.C15678a.m58850b(r5);
        r5 = io.reactivex.internal.util.ExceptionHelper.m58962a(r5);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableReplay.a(io.reactivex.functions.Consumer):void");
    }
}
