package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.HashMap;
import java.util.Map;
import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Observer;
import rx.exceptions.C19410a;
import rx.functions.Func0;
import rx.functions.Func1;

/* renamed from: rx.internal.operators.y */
public final class C19897y<T, K, V> implements OnSubscribe<Map<K, V>>, Func0<Map<K, V>> {
    /* renamed from: a */
    final Observable<T> f62313a;
    /* renamed from: b */
    final Func1<? super T, ? extends K> f62314b;
    /* renamed from: c */
    final Func1<? super T, ? extends V> f62315c;
    /* renamed from: d */
    final Func0<? extends Map<K, V>> f62316d;

    /* renamed from: rx.internal.operators.y$a */
    static final class C19896a<T, K, V> extends C19831g<T, Map<K, V>> {
        /* renamed from: f */
        final Func1<? super T, ? extends K> f62311f;
        /* renamed from: g */
        final Func1<? super T, ? extends V> f62312g;

        C19896a(C19571c<? super Map<K, V>> c19571c, Map<K, V> map, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12) {
            super(c19571c);
            this.c = map;
            this.b = true;
            this.f62311f = func1;
            this.f62312g = func12;
        }

        public void onStart() {
            request(Format.OFFSET_SAMPLE_RELATIVE);
        }

        public void onNext(T t) {
            if (!this.e) {
                try {
                    ((Map) this.c).put(this.f62311f.call(t), this.f62312g.call(t));
                } catch (T t2) {
                    C19410a.m69874b(t2);
                    unsubscribe();
                    onError(t2);
                }
            }
        }
    }

    public /* synthetic */ Object call() {
        return m71634a();
    }

    public /* synthetic */ void call(Object obj) {
        m71635a((C19571c) obj);
    }

    public C19897y(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12) {
        this(observable, func1, func12, null);
    }

    public C19897y(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func0<? extends Map<K, V>> func0) {
        this.f62313a = observable;
        this.f62314b = func1;
        this.f62315c = func12;
        if (func0 == null) {
            this.f62316d = this;
        } else {
            this.f62316d = func0;
        }
    }

    /* renamed from: a */
    public Map<K, V> m71634a() {
        return new HashMap();
    }

    /* renamed from: a */
    public void m71635a(C19571c<? super Map<K, V>> c19571c) {
        try {
            new C19896a(c19571c, (Map) this.f62316d.call(), this.f62314b, this.f62315c).m70997a((Observable) this.f62313a);
        } catch (Throwable th) {
            C19410a.m69869a(th, (Observer) c19571c);
        }
    }
}
