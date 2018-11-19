package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.exceptions.C19410a;
import rx.functions.Func0;
import rx.functions.Func1;

/* renamed from: rx.internal.operators.z */
public final class C19899z<T, K, V> implements OnSubscribe<Map<K, Collection<V>>>, Func0<Map<K, Collection<V>>> {
    /* renamed from: a */
    private final Func1<? super T, ? extends K> f62320a;
    /* renamed from: b */
    private final Func1<? super T, ? extends V> f62321b;
    /* renamed from: c */
    private final Func0<? extends Map<K, Collection<V>>> f62322c;
    /* renamed from: d */
    private final Func1<? super K, ? extends Collection<V>> f62323d;
    /* renamed from: e */
    private final Observable<T> f62324e;

    /* renamed from: rx.internal.operators.z$a */
    private static final class C19749a<K, V> implements Func1<K, Collection<V>> {
        /* renamed from: a */
        private static final C19749a<Object, Object> f61791a = new C19749a();

        private C19749a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m71015a(obj);
        }

        /* renamed from: a */
        static <K, V> C19749a<K, V> m71014a() {
            return f61791a;
        }

        /* renamed from: a */
        public Collection<V> m71015a(K k) {
            return new ArrayList();
        }
    }

    /* renamed from: rx.internal.operators.z$b */
    private static final class C19898b<T, K, V> extends C19831g<T, Map<K, Collection<V>>> {
        /* renamed from: f */
        private final Func1<? super T, ? extends K> f62317f;
        /* renamed from: g */
        private final Func1<? super T, ? extends V> f62318g;
        /* renamed from: h */
        private final Func1<? super K, ? extends Collection<V>> f62319h;

        C19898b(C19571c<? super Map<K, Collection<V>>> c19571c, Map<K, Collection<V>> map, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func1<? super K, ? extends Collection<V>> func13) {
            super(c19571c);
            this.c = map;
            this.b = true;
            this.f62317f = func1;
            this.f62318g = func12;
            this.f62319h = func13;
        }

        public void onStart() {
            request(Format.OFFSET_SAMPLE_RELATIVE);
        }

        public void onNext(T t) {
            if (!this.e) {
                try {
                    Object call = this.f62317f.call(t);
                    t = this.f62318g.call(t);
                    Collection collection = (Collection) ((Map) this.c).get(call);
                    if (collection == null) {
                        collection = (Collection) this.f62319h.call(call);
                        ((Map) this.c).put(call, collection);
                    }
                    collection.add(t);
                } catch (T t2) {
                    C19410a.m69874b(t2);
                    unsubscribe();
                    onError(t2);
                }
            }
        }
    }

    public /* synthetic */ Object call() {
        return m71636a();
    }

    public /* synthetic */ void call(Object obj) {
        m71637a((C19571c) obj);
    }

    public C19899z(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12) {
        this(observable, func1, func12, null, C19749a.m71014a());
    }

    public C19899z(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func0<? extends Map<K, Collection<V>>> func0, Func1<? super K, ? extends Collection<V>> func13) {
        this.f62324e = observable;
        this.f62320a = func1;
        this.f62321b = func12;
        if (func0 == null) {
            this.f62322c = this;
        } else {
            this.f62322c = func0;
        }
        this.f62323d = func13;
    }

    /* renamed from: a */
    public Map<K, Collection<V>> m71636a() {
        return new HashMap();
    }

    /* renamed from: a */
    public void m71637a(C19571c<? super Map<K, Collection<V>>> c19571c) {
        try {
            new C19898b(c19571c, (Map) this.f62322c.call(), this.f62320a, this.f62321b, this.f62323d).m70997a((Observable) this.f62324e);
        } catch (Throwable th) {
            C19410a.m69874b(th);
            c19571c.onError(th);
        }
    }
}
