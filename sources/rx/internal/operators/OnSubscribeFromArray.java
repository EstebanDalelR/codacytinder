package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.Producer;

public final class OnSubscribeFromArray<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final T[] f62216a;

    static final class FromArrayProducer<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = 3534218984725836979L;
        /* renamed from: a */
        final C19571c<? super T> f61152a;
        /* renamed from: b */
        final T[] f61153b;
        /* renamed from: c */
        int f61154c;

        public FromArrayProducer(C19571c<? super T> c19571c, T[] tArr) {
            this.f61152a = c19571c;
            this.f61153b = tArr;
        }

        public void request(long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("n >= 0 required but it was ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (j == Format.OFFSET_SAMPLE_RELATIVE) {
                if (C19419a.m69900a((AtomicLong) this, j) == 0) {
                    m70568a();
                }
            } else if (j != 0 && C19419a.m69900a((AtomicLong) this, j) == 0) {
                m70569a(j);
            }
        }

        /* renamed from: a */
        void m70568a() {
            C19571c c19571c = this.f61152a;
            Object[] objArr = this.f61153b;
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                if (!c19571c.isUnsubscribed()) {
                    c19571c.onNext(obj);
                    i++;
                } else {
                    return;
                }
            }
            if (!c19571c.isUnsubscribed()) {
                c19571c.onCompleted();
            }
        }

        /* renamed from: a */
        void m70569a(long j) {
            C19571c c19571c = this.f61152a;
            Object[] objArr = this.f61153b;
            int length = objArr.length;
            int i = this.f61154c;
            loop0:
            do {
                long j2 = 0;
                while (true) {
                    if (j == 0 || i == length) {
                        long j3 = get() + j2;
                        if (j3 == 0) {
                            this.f61154c = i;
                            j = addAndGet(j2);
                        } else {
                            j = j3;
                        }
                    } else if (!c19571c.isUnsubscribed()) {
                        c19571c.onNext(objArr[i]);
                        i++;
                        if (i == length) {
                            break loop0;
                        }
                        j2--;
                        j--;
                    } else {
                        return;
                    }
                }
                if (c19571c.isUnsubscribed() == null) {
                    c19571c.onCompleted();
                }
                return;
            } while (j != 0);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71575a((C19571c) obj);
    }

    public OnSubscribeFromArray(T[] tArr) {
        this.f62216a = tArr;
    }

    /* renamed from: a */
    public void m71575a(C19571c<? super T> c19571c) {
        c19571c.setProducer(new FromArrayProducer(c19571c, this.f62216a));
    }
}
