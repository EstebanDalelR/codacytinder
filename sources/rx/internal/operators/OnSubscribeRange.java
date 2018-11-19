package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.Producer;

public final class OnSubscribeRange implements OnSubscribe<Integer> {
    /* renamed from: a */
    private final int f62218a;
    /* renamed from: b */
    private final int f62219b;

    static final class RangeProducer extends AtomicLong implements Producer {
        private static final long serialVersionUID = 4114392207069098388L;
        /* renamed from: a */
        private final C19571c<? super Integer> f61157a;
        /* renamed from: b */
        private final int f61158b;
        /* renamed from: c */
        private long f61159c;

        RangeProducer(C19571c<? super Integer> c19571c, int i, int i2) {
            this.f61157a = c19571c;
            this.f61159c = (long) i;
            this.f61158b = i2;
        }

        public void request(long j) {
            if (get() != Format.OFFSET_SAMPLE_RELATIVE) {
                if (j == Format.OFFSET_SAMPLE_RELATIVE && compareAndSet(0, Format.OFFSET_SAMPLE_RELATIVE)) {
                    m70572a();
                } else if (j > 0 && C19419a.m69900a((AtomicLong) this, j) == 0) {
                    m70573a(j);
                }
            }
        }

        /* renamed from: a */
        void m70573a(long j) {
            long j2 = ((long) this.f61158b) + 1;
            long j3 = this.f61159c;
            C19571c c19571c = this.f61157a;
            long j4 = j3;
            j3 = j;
            do {
                j = 0;
                while (true) {
                    if (j == j3 || j4 == j2) {
                        if (!c19571c.isUnsubscribed()) {
                            if (j4 == j2) {
                                c19571c.onCompleted();
                                return;
                            }
                            j3 = get();
                            if (j3 == j) {
                                this.f61159c = j4;
                                j3 = addAndGet(-j);
                            }
                        } else {
                            return;
                        }
                    } else if (!c19571c.isUnsubscribed()) {
                        c19571c.onNext(Integer.valueOf((int) j4));
                        j++;
                        j4++;
                    } else {
                        return;
                    }
                }
            } while (j3 != 0);
        }

        /* renamed from: a */
        void m70572a() {
            long j = ((long) this.f61158b) + 1;
            C19571c c19571c = this.f61157a;
            long j2 = this.f61159c;
            while (j2 != j) {
                if (!c19571c.isUnsubscribed()) {
                    c19571c.onNext(Integer.valueOf((int) j2));
                    j2++;
                } else {
                    return;
                }
            }
            if (!c19571c.isUnsubscribed()) {
                c19571c.onCompleted();
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71577a((C19571c) obj);
    }

    public OnSubscribeRange(int i, int i2) {
        this.f62218a = i;
        this.f62219b = i2;
    }

    /* renamed from: a */
    public void m71577a(C19571c<? super Integer> c19571c) {
        c19571c.setProducer(new RangeProducer(c19571c, this.f62218a, this.f62219b));
    }
}
