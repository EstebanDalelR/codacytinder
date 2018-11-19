package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.Observer;
import rx.functions.Action0;
import rx.p500e.C19407e;
import rx.subjects.C19623c;

public final class BufferUntilSubscriber<T> extends C19623c<T, T> {
    /* renamed from: c */
    static final Observer f61456c = new C195801();
    /* renamed from: b */
    final State<T> f61457b;
    /* renamed from: d */
    private boolean f61458d;

    static final class State<T> extends AtomicReference<Observer<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;
        /* renamed from: a */
        final Object f60590a = new Object();
        /* renamed from: b */
        boolean f60591b;
        /* renamed from: c */
        final ConcurrentLinkedQueue<Object> f60592c = new ConcurrentLinkedQueue();

        State() {
        }

        /* renamed from: a */
        boolean m69883a(Observer<? super T> observer, Observer<? super T> observer2) {
            return compareAndSet(observer, observer2);
        }
    }

    /* renamed from: rx.internal.operators.BufferUntilSubscriber$1 */
    static class C195801 implements Observer {
        public void onCompleted() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(Object obj) {
        }

        C195801() {
        }
    }

    /* renamed from: rx.internal.operators.BufferUntilSubscriber$a */
    static final class C19871a<T> implements OnSubscribe<T> {
        /* renamed from: a */
        final State<T> f62195a;

        /* renamed from: rx.internal.operators.BufferUntilSubscriber$a$1 */
        class C198161 implements Action0 {
            /* renamed from: a */
            final /* synthetic */ C19871a f61966a;

            C198161(C19871a c19871a) {
                this.f61966a = c19871a;
            }

            public void call() {
                this.f61966a.f62195a.set(BufferUntilSubscriber.f61456c);
            }
        }

        public /* synthetic */ void call(Object obj) {
            m71564a((C19571c) obj);
        }

        public C19871a(State<T> state) {
            this.f62195a = state;
        }

        /* renamed from: a */
        public void m71564a(C19571c<? super T> c19571c) {
            if (this.f62195a.m69883a(null, c19571c)) {
                boolean z;
                c19571c.add(C19407e.m69854a(new C198161(this)));
                synchronized (this.f62195a.f60590a) {
                    z = true;
                    if (this.f62195a.f60591b == null) {
                        this.f62195a.f60591b = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    while (true) {
                        c19571c = this.f62195a.f60592c.poll();
                        if (c19571c != null) {
                            NotificationLite.m69887a((Observer) this.f62195a.get(), c19571c);
                        } else {
                            synchronized (this.f62195a.f60590a) {
                                if (this.f62195a.f60592c.isEmpty()) {
                                    this.f62195a.f60591b = false;
                                    return;
                                }
                            }
                        }
                    }
                }
                return;
            }
            c19571c.onError(new IllegalStateException("Only one subscriber allowed!"));
        }
    }

    /* renamed from: w */
    public static <T> BufferUntilSubscriber<T> m70894w() {
        return new BufferUntilSubscriber(new State());
    }

    private BufferUntilSubscriber(State<T> state) {
        super(new C19871a(state));
        this.f61457b = state;
    }

    /* renamed from: f */
    private void m70893f(Object obj) {
        synchronized (this.f61457b.f60590a) {
            this.f61457b.f60592c.add(obj);
            if (this.f61457b.get() != null && this.f61457b.f60591b == null) {
                this.f61458d = true;
                this.f61457b.f60591b = true;
            }
        }
        if (this.f61458d != null) {
            while (true) {
                obj = this.f61457b.f60592c.poll();
                if (obj != null) {
                    NotificationLite.m69887a((Observer) this.f61457b.get(), obj);
                } else {
                    return;
                }
            }
        }
    }

    public void onCompleted() {
        if (this.f61458d) {
            ((Observer) this.f61457b.get()).onCompleted();
        } else {
            m70893f(NotificationLite.m69884a());
        }
    }

    public void onError(Throwable th) {
        if (this.f61458d) {
            ((Observer) this.f61457b.get()).onError(th);
        } else {
            m70893f(NotificationLite.m69886a(th));
        }
    }

    public void onNext(T t) {
        if (this.f61458d) {
            ((Observer) this.f61457b.get()).onNext(t);
        } else {
            m70893f(NotificationLite.m69885a((Object) t));
        }
    }
}
