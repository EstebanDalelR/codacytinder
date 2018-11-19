package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.C19002b;

public final class ai<T> extends C3959e<T> {
    /* renamed from: a */
    final T[] f57238a;

    /* renamed from: io.reactivex.internal.operators.observable.ai$a */
    static final class C19184a<T> extends C19002b<T> {
        /* renamed from: a */
        final Observer<? super T> f59545a;
        /* renamed from: b */
        final T[] f59546b;
        /* renamed from: c */
        int f59547c;
        /* renamed from: d */
        boolean f59548d;
        /* renamed from: e */
        volatile boolean f59549e;

        C19184a(Observer<? super T> observer, T[] tArr) {
            this.f59545a = observer;
            this.f59546b = tArr;
        }

        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f59548d = true;
            return 1;
        }

        @Nullable
        public T poll() {
            int i = this.f59547c;
            Object[] objArr = this.f59546b;
            if (i == objArr.length) {
                return null;
            }
            this.f59547c = i + 1;
            return C15684a.m58895a(objArr[i], "The array element is null");
        }

        public boolean isEmpty() {
            return this.f59547c == this.f59546b.length;
        }

        public void clear() {
            this.f59547c = this.f59546b.length;
        }

        public void dispose() {
            this.f59549e = true;
        }

        public boolean isDisposed() {
            return this.f59549e;
        }

        /* renamed from: a */
        void m68218a() {
            Object[] objArr = this.f59546b;
            int length = objArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    Observer observer = this.f59545a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("The ");
                    stringBuilder.append(i);
                    stringBuilder.append("th element is null");
                    observer.onError(new NullPointerException(stringBuilder.toString()));
                    return;
                }
                this.f59545a.onNext(obj);
            }
            if (!isDisposed()) {
                this.f59545a.onComplete();
            }
        }
    }

    public ai(T[] tArr) {
        this.f57238a = tArr;
    }

    public void subscribeActual(Observer<? super T> observer) {
        C19184a c19184a = new C19184a(observer, this.f57238a);
        observer.onSubscribe(c19184a);
        if (c19184a.f59548d == null) {
            c19184a.m68218a();
        }
    }
}
