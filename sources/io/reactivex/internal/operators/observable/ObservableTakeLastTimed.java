package io.reactivex.internal.operators.observable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C15679f;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.C18423a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ObservableTakeLastTimed<T> extends C18394a<T, T> {
    /* renamed from: b */
    final long f58993b;
    /* renamed from: c */
    final long f58994c;
    /* renamed from: d */
    final TimeUnit f58995d;
    /* renamed from: e */
    final C15679f f58996e;
    /* renamed from: f */
    final int f58997f;
    /* renamed from: g */
    final boolean f58998g;

    static final class TakeLastTimedObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = -5677354903406201275L;
        /* renamed from: a */
        final Observer<? super T> f53742a;
        /* renamed from: b */
        final long f53743b;
        /* renamed from: c */
        final long f53744c;
        /* renamed from: d */
        final TimeUnit f53745d;
        /* renamed from: e */
        final C15679f f53746e;
        /* renamed from: f */
        final C18423a<Object> f53747f;
        /* renamed from: g */
        final boolean f53748g;
        /* renamed from: h */
        Disposable f53749h;
        /* renamed from: i */
        volatile boolean f53750i;
        /* renamed from: j */
        Throwable f53751j;

        TakeLastTimedObserver(Observer<? super T> observer, long j, long j2, TimeUnit timeUnit, C15679f c15679f, int i, boolean z) {
            this.f53742a = observer;
            this.f53743b = j;
            this.f53744c = j2;
            this.f53745d = timeUnit;
            this.f53746e = c15679f;
            this.f53747f = new C18423a(i);
            this.f53748g = z;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53749h, disposable)) {
                this.f53749h = disposable;
                this.f53742a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            C18423a c18423a = this.f53747f;
            long a = this.f53746e.m58851a(this.f53745d);
            long j = this.f53744c;
            long j2 = this.f53743b;
            Object obj = j2 == Format.OFFSET_SAMPLE_RELATIVE ? 1 : null;
            c18423a.offer(Long.valueOf(a), t);
            while (c18423a.isEmpty() == null) {
                if (((Long) c18423a.m66578a()).longValue() <= a - j || (obj == null && ((long) (c18423a.m66579b() >> 1)) > j2)) {
                    c18423a.poll();
                    c18423a.poll();
                } else {
                    return;
                }
            }
        }

        public void onError(Throwable th) {
            this.f53751j = th;
            m63680a();
        }

        public void onComplete() {
            m63680a();
        }

        public void dispose() {
            if (!this.f53750i) {
                this.f53750i = true;
                this.f53749h.dispose();
                if (compareAndSet(false, true)) {
                    this.f53747f.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f53750i;
        }

        /* renamed from: a */
        void m63680a() {
            if (compareAndSet(false, true)) {
                Observer observer = this.f53742a;
                C18423a c18423a = this.f53747f;
                boolean z = this.f53748g;
                while (!this.f53750i) {
                    if (!z) {
                        Throwable th = this.f53751j;
                        if (th != null) {
                            c18423a.clear();
                            observer.onError(th);
                            return;
                        }
                    }
                    Object poll = c18423a.poll();
                    if ((poll == null ? 1 : null) != null) {
                        Throwable th2 = this.f53751j;
                        if (th2 != null) {
                            observer.onError(th2);
                        } else {
                            observer.onComplete();
                        }
                        return;
                    }
                    Object poll2 = c18423a.poll();
                    if (((Long) poll).longValue() >= this.f53746e.m58851a(this.f53745d) - this.f53744c) {
                        observer.onNext(poll2);
                    }
                }
                c18423a.clear();
            }
        }
    }

    public ObservableTakeLastTimed(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, C15679f c15679f, int i, boolean z) {
        super(observableSource);
        this.f58993b = j;
        this.f58994c = j2;
        this.f58995d = timeUnit;
        this.f58996e = c15679f;
        this.f58997f = i;
        this.f58998g = z;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new TakeLastTimedObserver(observer, this.f58993b, this.f58994c, this.f58995d, this.f58996e, this.f58997f, this.f58998g));
    }
}
