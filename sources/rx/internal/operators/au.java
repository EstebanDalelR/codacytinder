package rx.internal.operators;

import rx.C19571c;
import rx.Observable.Operator;
import rx.Producer;

public final class au<T> implements Operator<T, T> {
    /* renamed from: a */
    final int f62035a;

    public /* synthetic */ Object call(Object obj) {
        return m71462a((C19571c) obj);
    }

    public au(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("n >= 0 required but it was ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f62035a = i;
    }

    /* renamed from: a */
    public C19571c<? super T> m71462a(final C19571c<? super T> c19571c) {
        return new C19571c<T>(this, c19571c) {
            /* renamed from: a */
            int f61642a;
            /* renamed from: c */
            final /* synthetic */ au f61644c;

            public void onCompleted() {
                c19571c.onCompleted();
            }

            public void onError(Throwable th) {
                c19571c.onError(th);
            }

            public void onNext(T t) {
                if (this.f61642a >= this.f61644c.f62035a) {
                    c19571c.onNext(t);
                } else {
                    this.f61642a++;
                }
            }

            public void setProducer(Producer producer) {
                c19571c.setProducer(producer);
                producer.request((long) this.f61644c.f62035a);
            }
        };
    }
}
