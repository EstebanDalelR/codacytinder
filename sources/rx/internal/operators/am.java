package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.BackpressureOverflow;
import rx.BackpressureOverflow.Strategy;
import rx.C19571c;
import rx.Observable.Operator;
import rx.Producer;
import rx.exceptions.C19410a;
import rx.functions.Action0;
import rx.internal.util.BackpressureDrainManager;
import rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback;

public class am<T> implements Operator<T, T> {
    /* renamed from: a */
    private final Long f62014a = null;
    /* renamed from: b */
    private final Action0 f62015b = null;
    /* renamed from: c */
    private final Strategy f62016c = BackpressureOverflow.f60536b;

    /* renamed from: rx.internal.operators.am$b */
    static final class C19426b {
        /* renamed from: a */
        static final am<?> f60619a = new am();
    }

    /* renamed from: rx.internal.operators.am$a */
    static final class C19692a<T> extends C19571c<T> implements BackpressureQueueCallback {
        /* renamed from: a */
        private final ConcurrentLinkedQueue<Object> f61591a = new ConcurrentLinkedQueue();
        /* renamed from: b */
        private final AtomicLong f61592b;
        /* renamed from: c */
        private final C19571c<? super T> f61593c;
        /* renamed from: d */
        private final AtomicBoolean f61594d = new AtomicBoolean(false);
        /* renamed from: e */
        private final BackpressureDrainManager f61595e;
        /* renamed from: f */
        private final Action0 f61596f;
        /* renamed from: g */
        private final Strategy f61597g;

        public C19692a(C19571c<? super T> c19571c, Long l, Action0 action0, Strategy strategy) {
            this.f61593c = c19571c;
            this.f61592b = l != null ? new AtomicLong(l.longValue()) : null;
            this.f61596f = action0;
            this.f61595e = new BackpressureDrainManager(this);
            this.f61597g = strategy;
        }

        public void onStart() {
            request(Format.OFFSET_SAMPLE_RELATIVE);
        }

        public void onCompleted() {
            if (!this.f61594d.get()) {
                this.f61595e.m70621a();
            }
        }

        public void onError(Throwable th) {
            if (!this.f61594d.get()) {
                this.f61595e.m70622a(th);
            }
        }

        public void onNext(T t) {
            if (m70959b()) {
                this.f61591a.offer(NotificationLite.m69885a((Object) t));
                this.f61595e.m70623b();
            }
        }

        public boolean accept(Object obj) {
            return NotificationLite.m69887a(this.f61593c, obj);
        }

        public void complete(Throwable th) {
            if (th != null) {
                this.f61593c.onError(th);
            } else {
                this.f61593c.onCompleted();
            }
        }

        public Object peek() {
            return this.f61591a.peek();
        }

        public Object poll() {
            Object poll = this.f61591a.poll();
            if (!(this.f61592b == null || poll == null)) {
                this.f61592b.incrementAndGet();
            }
            return poll;
        }

        /* renamed from: b */
        private boolean m70959b() {
            if (this.f61592b == null) {
                return true;
            }
            long j;
            do {
                j = this.f61592b.get();
                if (j <= 0) {
                    Object obj;
                    try {
                        if (this.f61597g.mayAttemptDrop() && poll() != null) {
                            obj = 1;
                            if (this.f61596f != null) {
                                try {
                                    this.f61596f.call();
                                } catch (Throwable th) {
                                    C19410a.m69874b(th);
                                    this.f61595e.m70622a(th);
                                    return false;
                                }
                            }
                            if (obj == null) {
                                return false;
                            }
                        }
                    } catch (Throwable e) {
                        if (this.f61594d.compareAndSet(false, true)) {
                            unsubscribe();
                            this.f61593c.onError(e);
                        }
                    }
                    obj = null;
                    if (this.f61596f != null) {
                        this.f61596f.call();
                    }
                    if (obj == null) {
                        return false;
                    }
                }
            } while (!this.f61592b.compareAndSet(j, j - 1));
            return true;
        }

        /* renamed from: a */
        protected Producer m70960a() {
            return this.f61595e;
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71450a((C19571c) obj);
    }

    /* renamed from: a */
    public static <T> am<T> m71449a() {
        return C19426b.f60619a;
    }

    am() {
    }

    /* renamed from: a */
    public C19571c<? super T> m71450a(C19571c<? super T> c19571c) {
        C19571c<? super T> c19692a = new C19692a(c19571c, this.f62014a, this.f62015b, this.f62016c);
        c19571c.add(c19692a);
        c19571c.setProducer(c19692a.m70960a());
        return c19692a;
    }
}
