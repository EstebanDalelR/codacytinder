package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.TimeUnit;
import rx.C19571c;
import rx.C2671a;
import rx.Observable.Operator;

public final class ba<T> implements Operator<T, T> {
    /* renamed from: a */
    final long f62048a;
    /* renamed from: b */
    final C2671a f62049b;

    public /* synthetic */ Object call(Object obj) {
        return m71468a((C19571c) obj);
    }

    public ba(long j, TimeUnit timeUnit, C2671a c2671a) {
        this.f62048a = timeUnit.toMillis(j);
        this.f62049b = c2671a;
    }

    /* renamed from: a */
    public C19571c<? super T> m71468a(final C19571c<? super T> c19571c) {
        return new C19571c<T>(this, c19571c) {
            /* renamed from: b */
            final /* synthetic */ ba f61674b;
            /* renamed from: c */
            private long f61675c = -1;

            public void onStart() {
                request(Format.OFFSET_SAMPLE_RELATIVE);
            }

            public void onNext(T t) {
                long now = this.f61674b.f62049b.now();
                if (this.f61675c == -1 || now < this.f61675c || now - this.f61675c >= this.f61674b.f62048a) {
                    this.f61675c = now;
                    c19571c.onNext(t);
                }
            }

            public void onCompleted() {
                c19571c.onCompleted();
            }

            public void onError(Throwable th) {
                c19571c.onError(th);
            }
        };
    }
}
