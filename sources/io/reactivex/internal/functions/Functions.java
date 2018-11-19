package io.reactivex.internal.functions;

import com.google.android.exoplayer2.Format;
import io.reactivex.C15675d;
import io.reactivex.C15679f;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function7;
import io.reactivex.functions.Function8;
import io.reactivex.functions.Function9;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import io.reactivex.p079d.C2667a;
import io.reactivex.schedulers.C15757b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscription;

public final class Functions {
    /* renamed from: a */
    static final Function<Object, Object> f48539a = new C17383u();
    /* renamed from: b */
    public static final Runnable f48540b = new C15682q();
    /* renamed from: c */
    public static final Action f48541c = new C17377n();
    /* renamed from: d */
    static final Consumer<Object> f48542d = new C17378o();
    /* renamed from: e */
    public static final Consumer<Throwable> f48543e = new C17381s();
    /* renamed from: f */
    public static final Consumer<Throwable> f48544f = new ad();
    /* renamed from: g */
    public static final LongConsumer f48545g = new C17379p();
    /* renamed from: h */
    static final Predicate<Object> f48546h = new ai();
    /* renamed from: i */
    static final Predicate<Object> f48547i = new C17382t();
    /* renamed from: j */
    static final Callable<Object> f48548j = new ac();
    /* renamed from: k */
    static final Comparator<Object> f48549k = new C15683y();
    /* renamed from: l */
    public static final Consumer<Subscription> f48550l = new C17386x();

    enum HashSetCallable implements Callable<Set<Object>> {
        INSTANCE;

        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    enum NaturalComparator implements Comparator<Object> {
        INSTANCE;

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    static final class ac implements Callable<Object> {
        public Object call() {
            return null;
        }

        ac() {
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$j */
    static final class C15681j<T> implements Callable<List<T>> {
        /* renamed from: a */
        final int f48538a;

        public /* synthetic */ Object call() throws Exception {
            return m58857a();
        }

        C15681j(int i) {
            this.f48538a = i;
        }

        /* renamed from: a */
        public List<T> m58857a() throws Exception {
            return new ArrayList(this.f48538a);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$q */
    static final class C15682q implements Runnable {
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }

        C15682q() {
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$y */
    static final class C15683y implements Comparator<Object> {
        C15683y() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$a */
    static final class C17365a<T> implements Consumer<T> {
        /* renamed from: a */
        final Action f53111a;

        C17365a(Action action) {
            this.f53111a = action;
        }

        public void accept(T t) throws Exception {
            this.f53111a.run();
        }
    }

    static final class aa<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final Consumer<? super C15675d<T>> f53112a;

        public /* synthetic */ void accept(Object obj) throws Exception {
            m63460a((Throwable) obj);
        }

        aa(Consumer<? super C15675d<T>> consumer) {
            this.f53112a = consumer;
        }

        /* renamed from: a */
        public void m63460a(Throwable th) throws Exception {
            this.f53112a.accept(C15675d.m58832a(th));
        }
    }

    static final class ab<T> implements Consumer<T> {
        /* renamed from: a */
        final Consumer<? super C15675d<T>> f53113a;

        ab(Consumer<? super C15675d<T>> consumer) {
            this.f53113a = consumer;
        }

        public void accept(T t) throws Exception {
            this.f53113a.accept(C15675d.m58831a((Object) t));
        }
    }

    static final class ad implements Consumer<Throwable> {
        ad() {
        }

        public /* synthetic */ void accept(Object obj) throws Exception {
            m63461a((Throwable) obj);
        }

        /* renamed from: a */
        public void m63461a(Throwable th) {
            C2667a.a(new OnErrorNotImplementedException(th));
        }
    }

    static final class ae<T> implements Function<T, C15757b<T>> {
        /* renamed from: a */
        final TimeUnit f53114a;
        /* renamed from: b */
        final C15679f f53115b;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63462a(obj);
        }

        ae(TimeUnit timeUnit, C15679f c15679f) {
            this.f53114a = timeUnit;
            this.f53115b = c15679f;
        }

        /* renamed from: a */
        public C15757b<T> m63462a(T t) throws Exception {
            return new C15757b(t, this.f53115b.m58851a(this.f53114a), this.f53114a);
        }
    }

    static final class af<K, T> implements BiConsumer<Map<K, T>, T> {
        /* renamed from: a */
        private final Function<? super T, ? extends K> f53116a;

        public /* synthetic */ void accept(Object obj, Object obj2) throws Exception {
            m63463a((Map) obj, obj2);
        }

        af(Function<? super T, ? extends K> function) {
            this.f53116a = function;
        }

        /* renamed from: a */
        public void m63463a(Map<K, T> map, T t) throws Exception {
            map.put(this.f53116a.apply(t), t);
        }
    }

    static final class ag<K, V, T> implements BiConsumer<Map<K, V>, T> {
        /* renamed from: a */
        private final Function<? super T, ? extends V> f53117a;
        /* renamed from: b */
        private final Function<? super T, ? extends K> f53118b;

        public /* synthetic */ void accept(Object obj, Object obj2) throws Exception {
            m63464a((Map) obj, obj2);
        }

        ag(Function<? super T, ? extends V> function, Function<? super T, ? extends K> function2) {
            this.f53117a = function;
            this.f53118b = function2;
        }

        /* renamed from: a */
        public void m63464a(Map<K, V> map, T t) throws Exception {
            map.put(this.f53118b.apply(t), this.f53117a.apply(t));
        }
    }

    static final class ah<K, V, T> implements BiConsumer<Map<K, Collection<V>>, T> {
        /* renamed from: a */
        private final Function<? super K, ? extends Collection<? super V>> f53119a;
        /* renamed from: b */
        private final Function<? super T, ? extends V> f53120b;
        /* renamed from: c */
        private final Function<? super T, ? extends K> f53121c;

        public /* synthetic */ void accept(Object obj, Object obj2) throws Exception {
            m63465a((Map) obj, obj2);
        }

        ah(Function<? super K, ? extends Collection<? super V>> function, Function<? super T, ? extends V> function2, Function<? super T, ? extends K> function3) {
            this.f53119a = function;
            this.f53120b = function2;
            this.f53121c = function3;
        }

        /* renamed from: a */
        public void m63465a(Map<K, Collection<V>> map, T t) throws Exception {
            Object apply = this.f53121c.apply(t);
            Collection collection = (Collection) map.get(apply);
            if (collection == null) {
                collection = (Collection) this.f53119a.apply(apply);
                map.put(apply, collection);
            }
            collection.add(this.f53120b.apply(t));
        }
    }

    static final class ai implements Predicate<Object> {
        public boolean test(Object obj) {
            return true;
        }

        ai() {
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$b */
    static final class C17366b<T1, T2, R> implements Function<Object[], R> {
        /* renamed from: a */
        final BiFunction<? super T1, ? super T2, ? extends R> f53122a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63466a((Object[]) obj);
        }

        C17366b(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
            this.f53122a = biFunction;
        }

        /* renamed from: a */
        public R m63466a(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f53122a.apply(objArr[0], objArr[1]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array of size 2 expected but got ");
            stringBuilder.append(objArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$c */
    static final class C17367c<T1, T2, T3, R> implements Function<Object[], R> {
        /* renamed from: a */
        final Function3<T1, T2, T3, R> f53123a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63467a((Object[]) obj);
        }

        C17367c(Function3<T1, T2, T3, R> function3) {
            this.f53123a = function3;
        }

        /* renamed from: a */
        public R m63467a(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return this.f53123a.apply(objArr[0], objArr[1], objArr[2]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array of size 3 expected but got ");
            stringBuilder.append(objArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$d */
    static final class C17368d<T1, T2, T3, T4, R> implements Function<Object[], R> {
        /* renamed from: a */
        final Function4<T1, T2, T3, T4, R> f53124a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63468a((Object[]) obj);
        }

        C17368d(Function4<T1, T2, T3, T4, R> function4) {
            this.f53124a = function4;
        }

        /* renamed from: a */
        public R m63468a(Object[] objArr) throws Exception {
            if (objArr.length == 4) {
                return this.f53124a.apply(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array of size 4 expected but got ");
            stringBuilder.append(objArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$e */
    static final class C17369e<T1, T2, T3, T4, T5, R> implements Function<Object[], R> {
        /* renamed from: a */
        private final Function5<T1, T2, T3, T4, T5, R> f53125a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63469a((Object[]) obj);
        }

        C17369e(Function5<T1, T2, T3, T4, T5, R> function5) {
            this.f53125a = function5;
        }

        /* renamed from: a */
        public R m63469a(Object[] objArr) throws Exception {
            if (objArr.length == 5) {
                return this.f53125a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array of size 5 expected but got ");
            stringBuilder.append(objArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$f */
    static final class C17370f<T1, T2, T3, T4, T5, T6, R> implements Function<Object[], R> {
        /* renamed from: a */
        final Function6<T1, T2, T3, T4, T5, T6, R> f53126a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63470a((Object[]) obj);
        }

        C17370f(Function6<T1, T2, T3, T4, T5, T6, R> function6) {
            this.f53126a = function6;
        }

        /* renamed from: a */
        public R m63470a(Object[] objArr) throws Exception {
            if (objArr.length == 6) {
                return this.f53126a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array of size 6 expected but got ");
            stringBuilder.append(objArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$g */
    static final class C17371g<T1, T2, T3, T4, T5, T6, T7, R> implements Function<Object[], R> {
        /* renamed from: a */
        final Function7<T1, T2, T3, T4, T5, T6, T7, R> f53127a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63471a((Object[]) obj);
        }

        C17371g(Function7<T1, T2, T3, T4, T5, T6, T7, R> function7) {
            this.f53127a = function7;
        }

        /* renamed from: a */
        public R m63471a(Object[] objArr) throws Exception {
            if (objArr.length == 7) {
                return this.f53127a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array of size 7 expected but got ");
            stringBuilder.append(objArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$h */
    static final class C17372h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Function<Object[], R> {
        /* renamed from: a */
        final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f53128a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63472a((Object[]) obj);
        }

        C17372h(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
            this.f53128a = function8;
        }

        /* renamed from: a */
        public R m63472a(Object[] objArr) throws Exception {
            if (objArr.length == 8) {
                return this.f53128a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array of size 8 expected but got ");
            stringBuilder.append(objArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$i */
    static final class C17373i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements Function<Object[], R> {
        /* renamed from: a */
        final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f53129a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63473a((Object[]) obj);
        }

        C17373i(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9) {
            this.f53129a = function9;
        }

        /* renamed from: a */
        public R m63473a(Object[] objArr) throws Exception {
            if (objArr.length == 9) {
                return this.f53129a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Array of size 9 expected but got ");
            stringBuilder.append(objArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$k */
    static final class C17374k<T> implements Predicate<T> {
        /* renamed from: a */
        final BooleanSupplier f53130a;

        C17374k(BooleanSupplier booleanSupplier) {
            this.f53130a = booleanSupplier;
        }

        public boolean test(T t) throws Exception {
            return this.f53130a.getAsBoolean() ^ 1;
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$l */
    static final class C17375l<T, U> implements Function<T, U> {
        /* renamed from: a */
        final Class<U> f53131a;

        C17375l(Class<U> cls) {
            this.f53131a = cls;
        }

        public U apply(T t) throws Exception {
            return this.f53131a.cast(t);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$m */
    static final class C17376m<T, U> implements Predicate<T> {
        /* renamed from: a */
        final Class<U> f53132a;

        C17376m(Class<U> cls) {
            this.f53132a = cls;
        }

        public boolean test(T t) throws Exception {
            return this.f53132a.isInstance(t);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$n */
    static final class C17377n implements Action {
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }

        C17377n() {
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$o */
    static final class C17378o implements Consumer<Object> {
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }

        C17378o() {
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$p */
    static final class C17379p implements LongConsumer {
        public void accept(long j) {
        }

        C17379p() {
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$r */
    static final class C17380r<T> implements Predicate<T> {
        /* renamed from: a */
        final T f53133a;

        C17380r(T t) {
            this.f53133a = t;
        }

        public boolean test(T t) throws Exception {
            return C15684a.m58896a((Object) t, this.f53133a);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$s */
    static final class C17381s implements Consumer<Throwable> {
        C17381s() {
        }

        public /* synthetic */ void accept(Object obj) throws Exception {
            m63474a((Throwable) obj);
        }

        /* renamed from: a */
        public void m63474a(Throwable th) {
            C2667a.a(th);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$t */
    static final class C17382t implements Predicate<Object> {
        public boolean test(Object obj) {
            return false;
        }

        C17382t() {
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$u */
    static final class C17383u implements Function<Object, Object> {
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }

        C17383u() {
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$v */
    static final class C17384v<T, U> implements Function<T, U>, Callable<U> {
        /* renamed from: a */
        final U f53134a;

        C17384v(U u) {
            this.f53134a = u;
        }

        public U call() throws Exception {
            return this.f53134a;
        }

        public U apply(T t) throws Exception {
            return this.f53134a;
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$w */
    static final class C17385w<T> implements Function<List<T>, List<T>> {
        /* renamed from: a */
        final Comparator<? super T> f53135a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63475a((List) obj);
        }

        C17385w(Comparator<? super T> comparator) {
            this.f53135a = comparator;
        }

        /* renamed from: a */
        public List<T> m63475a(List<T> list) {
            Collections.sort(list, this.f53135a);
            return list;
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$x */
    static final class C17386x implements Consumer<Subscription> {
        C17386x() {
        }

        public /* synthetic */ void accept(Object obj) throws Exception {
            m63476a((Subscription) obj);
        }

        /* renamed from: a */
        public void m63476a(Subscription subscription) throws Exception {
            subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$z */
    static final class C17387z<T> implements Action {
        /* renamed from: a */
        final Consumer<? super C15675d<T>> f53136a;

        C17387z(Consumer<? super C15675d<T>> consumer) {
            this.f53136a = consumer;
        }

        public void run() throws Exception {
            this.f53136a.accept(C15675d.m58833f());
        }
    }

    /* renamed from: a */
    public static <T1, T2, R> Function<Object[], R> m58864a(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C15684a.m58895a((Object) biFunction, "f is null");
        return new C17366b(biFunction);
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> Function<Object[], R> m58865a(Function3<T1, T2, T3, R> function3) {
        C15684a.m58895a((Object) function3, "f is null");
        return new C17367c(function3);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, R> Function<Object[], R> m58866a(Function4<T1, T2, T3, T4, R> function4) {
        C15684a.m58895a((Object) function4, "f is null");
        return new C17368d(function4);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, R> Function<Object[], R> m58867a(Function5<T1, T2, T3, T4, T5, R> function5) {
        C15684a.m58895a((Object) function5, "f is null");
        return new C17369e(function5);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, R> Function<Object[], R> m58868a(Function6<T1, T2, T3, T4, T5, T6, R> function6) {
        C15684a.m58895a((Object) function6, "f is null");
        return new C17370f(function6);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, R> Function<Object[], R> m58869a(Function7<T1, T2, T3, T4, T5, T6, T7, R> function7) {
        C15684a.m58895a((Object) function7, "f is null");
        return new C17371g(function7);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Function<Object[], R> m58870a(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
        C15684a.m58895a((Object) function8, "f is null");
        return new C17372h(function8);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Function<Object[], R> m58871a(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9) {
        C15684a.m58895a((Object) function9, "f is null");
        return new C17373i(function9);
    }

    /* renamed from: a */
    public static <T> Function<T, T> m58863a() {
        return f48539a;
    }

    /* renamed from: b */
    public static <T> Consumer<T> m58878b() {
        return f48542d;
    }

    /* renamed from: c */
    public static <T> Predicate<T> m58883c() {
        return f48546h;
    }

    /* renamed from: d */
    public static <T> Predicate<T> m58885d() {
        return f48547i;
    }

    /* renamed from: e */
    public static <T> Callable<T> m58886e() {
        return f48548j;
    }

    /* renamed from: f */
    public static <T> Comparator<T> m58887f() {
        return f48549k;
    }

    /* renamed from: a */
    public static <T> Callable<T> m58877a(T t) {
        return new C17384v(t);
    }

    /* renamed from: b */
    public static <T, U> Function<T, U> m58880b(U u) {
        return new C17384v(u);
    }

    /* renamed from: a */
    public static <T, U> Function<T, U> m58872a(Class<U> cls) {
        return new C17375l(cls);
    }

    /* renamed from: a */
    public static <T> Callable<List<T>> m58876a(int i) {
        return new C15681j(i);
    }

    /* renamed from: c */
    public static <T> Predicate<T> m58884c(T t) {
        return new C17380r(t);
    }

    /* renamed from: g */
    public static <T> Callable<Set<T>> m58888g() {
        return HashSetCallable.INSTANCE;
    }

    /* renamed from: a */
    public static <T> Consumer<T> m58862a(Consumer<? super C15675d<T>> consumer) {
        return new ab(consumer);
    }

    /* renamed from: b */
    public static <T> Consumer<Throwable> m58879b(Consumer<? super C15675d<T>> consumer) {
        return new aa(consumer);
    }

    /* renamed from: c */
    public static <T> Action m58882c(Consumer<? super C15675d<T>> consumer) {
        return new C17387z(consumer);
    }

    /* renamed from: a */
    public static <T> Consumer<T> m58861a(Action action) {
        return new C17365a(action);
    }

    /* renamed from: b */
    public static <T, U> Predicate<T> m58881b(Class<U> cls) {
        return new C17376m(cls);
    }

    /* renamed from: a */
    public static <T> Predicate<T> m58875a(BooleanSupplier booleanSupplier) {
        return new C17374k(booleanSupplier);
    }

    /* renamed from: a */
    public static <T> Function<T, C15757b<T>> m58874a(TimeUnit timeUnit, C15679f c15679f) {
        return new ae(timeUnit, c15679f);
    }

    /* renamed from: a */
    public static <T, K> BiConsumer<Map<K, T>, T> m58858a(Function<? super T, ? extends K> function) {
        return new af(function);
    }

    /* renamed from: a */
    public static <T, K, V> BiConsumer<Map<K, V>, T> m58859a(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return new ag(function2, function);
    }

    /* renamed from: a */
    public static <T, K, V> BiConsumer<Map<K, Collection<V>>, T> m58860a(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Function<? super K, ? extends Collection<? super V>> function3) {
        return new ah(function3, function2, function);
    }

    /* renamed from: h */
    public static <T> Comparator<T> m58889h() {
        return NaturalComparator.INSTANCE;
    }

    /* renamed from: a */
    public static <T> Function<List<T>, List<T>> m58873a(Comparator<? super T> comparator) {
        return new C17385w(comparator);
    }
}
