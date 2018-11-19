package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

public final class ObservableRange extends C3959e<Integer> {
    /* renamed from: a */
    private final int f57191a;
    /* renamed from: b */
    private final long f57192b;

    static final class RangeDisposable extends BasicIntQueueDisposable<Integer> {
        private static final long serialVersionUID = 396518478098735504L;
        /* renamed from: a */
        final Observer<? super Integer> f59536a;
        /* renamed from: b */
        final long f59537b;
        /* renamed from: c */
        long f59538c;
        /* renamed from: d */
        boolean f59539d;

        @Nullable
        public /* synthetic */ Object poll() throws Exception {
            return m68215b();
        }

        RangeDisposable(Observer<? super Integer> observer, long j, long j2) {
            this.f59536a = observer;
            this.f59538c = j;
            this.f59537b = j2;
        }

        /* renamed from: a */
        void m68214a() {
            if (!this.f59539d) {
                Observer observer = this.f59536a;
                long j = this.f59537b;
                for (long j2 = this.f59538c; j2 != j && get() == 0; j2++) {
                    observer.onNext(Integer.valueOf((int) j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    observer.onComplete();
                }
            }
        }

        @Nullable
        /* renamed from: b */
        public Integer m68215b() throws Exception {
            long j = this.f59538c;
            if (j != this.f59537b) {
                this.f59538c = j + 1;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }

        public boolean isEmpty() {
            return this.f59538c == this.f59537b;
        }

        public void clear() {
            this.f59538c = this.f59537b;
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
            this.f59539d = true;
            return 1;
        }
    }

    public ObservableRange(int i, int i2) {
        this.f57191a = i;
        this.f57192b = ((long) i) + ((long) i2);
    }

    protected void subscribeActual(Observer<? super Integer> observer) {
        RangeDisposable rangeDisposable = new RangeDisposable(observer, (long) this.f57191a, this.f57192b);
        observer.onSubscribe(rangeDisposable);
        rangeDisposable.m68214a();
    }
}
