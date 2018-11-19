package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.Observable.Operator;
import rx.Producer;

public final class ax<T> implements Operator<T, T> {
    /* renamed from: a */
    final int f62045a;

    public /* synthetic */ Object call(Object obj) {
        return m71465a((C19571c) obj);
    }

    public ax(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("limit >= 0 required but it was ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f62045a = i;
    }

    /* renamed from: a */
    public C19571c<? super T> m71465a(final C19571c<? super T> c19571c) {
        Object c197081 = new C19571c<T>(this) {
            /* renamed from: a */
            int f61660a;
            /* renamed from: b */
            boolean f61661b;
            /* renamed from: d */
            final /* synthetic */ ax f61663d;

            public void onCompleted() {
                if (!this.f61661b) {
                    this.f61661b = true;
                    c19571c.onCompleted();
                }
            }

            public void onError(Throwable th) {
                if (!this.f61661b) {
                    this.f61661b = true;
                    try {
                        c19571c.onError(th);
                    } finally {
                        unsubscribe();
                    }
                }
            }

            public void onNext(T t) {
                if (!isUnsubscribed()) {
                    int i = this.f61660a;
                    this.f61660a = i + 1;
                    if (i < this.f61663d.f62045a) {
                        Object obj = this.f61660a == this.f61663d.f62045a ? 1 : null;
                        c19571c.onNext(t);
                        if (obj != null && this.f61661b == null) {
                            this.f61661b = true;
                            try {
                                c19571c.onCompleted();
                            } finally {
                                unsubscribe();
                            }
                        }
                    }
                }
            }

            public void setProducer(final Producer producer) {
                c19571c.setProducer(new Producer(this) {
                    /* renamed from: a */
                    final AtomicLong f61201a = new AtomicLong(0);
                    /* renamed from: c */
                    final /* synthetic */ C197081 f61203c;

                    public void request(long j) {
                        if (j > 0 && !this.f61203c.f61661b) {
                            long min;
                            long j2;
                            do {
                                j2 = this.f61201a.get();
                                min = Math.min(j, ((long) this.f61203c.f61663d.f62045a) - j2);
                                if (min == 0) {
                                    return;
                                }
                            } while (!this.f61201a.compareAndSet(j2, j2 + min));
                            producer.request(min);
                        }
                    }
                });
            }
        };
        if (this.f62045a == 0) {
            c19571c.onCompleted();
            c197081.unsubscribe();
        }
        c19571c.add(c197081);
        return c197081;
    }
}
