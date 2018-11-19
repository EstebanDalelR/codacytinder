package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx.C19571c;
import rx.Observable.Operator;
import rx.Observer;
import rx.Producer;
import rx.exceptions.C19410a;
import rx.internal.producers.SingleDelayedProducer;

public final class bb<T> implements Operator<List<T>, T> {

    /* renamed from: rx.internal.operators.bb$a */
    static final class C19431a {
        /* renamed from: a */
        static final bb<Object> f60624a = new bb();
    }

    public /* synthetic */ Object call(Object obj) {
        return m71470a((C19571c) obj);
    }

    /* renamed from: a */
    public static <T> bb<T> m71469a() {
        return C19431a.f60624a;
    }

    bb() {
    }

    /* renamed from: a */
    public C19571c<? super T> m71470a(final C19571c<? super List<T>> c19571c) {
        final Producer singleDelayedProducer = new SingleDelayedProducer(c19571c);
        Object c197141 = new C19571c<T>(this) {
            /* renamed from: a */
            boolean f61676a;
            /* renamed from: b */
            List<T> f61677b = new LinkedList();
            /* renamed from: e */
            final /* synthetic */ bb f61680e;

            public void onStart() {
                request(Format.OFFSET_SAMPLE_RELATIVE);
            }

            public void onCompleted() {
                if (!this.f61676a) {
                    this.f61676a = true;
                    try {
                        ArrayList arrayList = new ArrayList(this.f61677b);
                        this.f61677b = null;
                        singleDelayedProducer.m70604a(arrayList);
                    } catch (Throwable th) {
                        C19410a.m69869a(th, (Observer) this);
                    }
                }
            }

            public void onError(Throwable th) {
                c19571c.onError(th);
            }

            public void onNext(T t) {
                if (!this.f61676a) {
                    this.f61677b.add(t);
                }
            }
        };
        c19571c.add(c197141);
        c19571c.setProducer(singleDelayedProducer);
        return c197141;
    }
}
