package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

public final class ObservableRangeLong extends C3959e<Long> {
    /* renamed from: a */
    private final long f57193a;
    /* renamed from: b */
    private final long f57194b;

    static final class RangeDisposable extends BasicIntQueueDisposable<Long> {
        private static final long serialVersionUID = 396518478098735504L;
        /* renamed from: a */
        final Observer<? super Long> f59540a;
        /* renamed from: b */
        final long f59541b;
        /* renamed from: c */
        long f59542c;
        /* renamed from: d */
        boolean f59543d;

        @Nullable
        public /* synthetic */ Object poll() throws Exception {
            return m68217b();
        }

        RangeDisposable(Observer<? super Long> observer, long j, long j2) {
            this.f59540a = observer;
            this.f59542c = j;
            this.f59541b = j2;
        }

        /* renamed from: a */
        void m68216a() {
            if (!this.f59543d) {
                Observer observer = this.f59540a;
                long j = this.f59541b;
                for (long j2 = this.f59542c; j2 != j && get() == 0; j2++) {
                    observer.onNext(Long.valueOf(j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    observer.onComplete();
                }
            }
        }

        @Nullable
        /* renamed from: b */
        public Long m68217b() throws Exception {
            long j = this.f59542c;
            if (j != this.f59541b) {
                this.f59542c = j + 1;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }

        public boolean isEmpty() {
            return this.f59542c == this.f59541b;
        }

        public void clear() {
            this.f59542c = this.f59541b;
            lazySet(1);
        }

        public void dispose() {
            set(1);
        }

        public boolean isDisposed() {
            return get() != 0;
        }

        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f59543d = true;
            return 1;
        }
    }

    public ObservableRangeLong(long j, long j2) {
        this.f57193a = j;
        this.f57194b = j2;
    }

    protected void subscribeActual(Observer<? super Long> observer) {
        RangeDisposable rangeDisposable = new RangeDisposable(observer, this.f57193a, this.f57193a + this.f57194b);
        observer.onSubscribe(rangeDisposable);
        rangeDisposable.m68216a();
    }
}
