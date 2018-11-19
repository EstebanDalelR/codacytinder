package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.atomic.AtomicInteger;
import rx.C19571c;
import rx.Observable;
import rx.Producer;

/* renamed from: rx.internal.operators.f */
public abstract class C19731f<T, R> extends C19571c<T> {
    /* renamed from: a */
    protected final C19571c<? super R> f61727a;
    /* renamed from: b */
    protected boolean f61728b;
    /* renamed from: c */
    protected R f61729c;
    /* renamed from: d */
    final AtomicInteger f61730d = new AtomicInteger();

    /* renamed from: rx.internal.operators.f$a */
    static final class C19593a implements Producer {
        /* renamed from: a */
        final C19731f<?, ?> f61219a;

        public C19593a(C19731f<?, ?> c19731f) {
            this.f61219a = c19731f;
        }

        public void request(long j) {
            this.f61219a.m70995a(j);
        }
    }

    public C19731f(C19571c<? super R> c19571c) {
        this.f61727a = c19571c;
    }

    public void onError(Throwable th) {
        this.f61729c = null;
        this.f61727a.onError(th);
    }

    public void onCompleted() {
        if (this.f61728b) {
            m70996a(this.f61729c);
        } else {
            m70994a();
        }
    }

    /* renamed from: a */
    protected final void m70994a() {
        this.f61727a.onCompleted();
    }

    /* renamed from: a */
    protected final void m70996a(R r) {
        C19571c c19571c = this.f61727a;
        do {
            int i = this.f61730d.get();
            if (!(i == 2 || i == 3)) {
                if (!c19571c.isUnsubscribed()) {
                    if (i == 1) {
                        c19571c.onNext(r);
                        if (c19571c.isUnsubscribed() == null) {
                            c19571c.onCompleted();
                        }
                        this.f61730d.lazySet(3);
                        return;
                    }
                    this.f61729c = r;
                }
            }
            return;
        } while (!this.f61730d.compareAndSet(0, 2));
    }

    /* renamed from: a */
    final void m70995a(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("n >= 0 required but it was ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j != 0) {
            j = this.f61727a;
            do {
                int i = this.f61730d.get();
                if (!(i == 1 || i == 3)) {
                    if (!j.isUnsubscribed()) {
                        if (i == 2) {
                            if (this.f61730d.compareAndSet(2, 3)) {
                                j.onNext(this.f61729c);
                                if (!j.isUnsubscribed()) {
                                    j.onCompleted();
                                }
                            }
                            return;
                        }
                    }
                }
                return;
            } while (!this.f61730d.compareAndSet(0, 1));
        }
    }

    public final void setProducer(Producer producer) {
        producer.request(Format.OFFSET_SAMPLE_RELATIVE);
    }

    /* renamed from: a */
    public final void m70997a(Observable<? extends T> observable) {
        m70998b();
        observable.m69661a((C19571c) this);
    }

    /* renamed from: b */
    final void m70998b() {
        C19571c c19571c = this.f61727a;
        c19571c.add(this);
        c19571c.setProducer(new C19593a(this));
    }
}
