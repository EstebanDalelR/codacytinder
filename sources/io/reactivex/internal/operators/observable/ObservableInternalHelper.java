package io.reactivex.internal.operators.observable;

import io.reactivex.C15675d;
import io.reactivex.C15679f;
import io.reactivex.C3959e;
import io.reactivex.Emitter;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.single.C18422k;
import io.reactivex.p079d.C2667a;
import io.reactivex.p491c.C18340a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class ObservableInternalHelper {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$a */
    static final class C15699a<T> implements Callable<C18340a<T>> {
        /* renamed from: a */
        private final C3959e<T> f48570a;
        /* renamed from: b */
        private final int f48571b;

        public /* synthetic */ Object call() throws Exception {
            return m58907a();
        }

        C15699a(C3959e<T> c3959e, int i) {
            this.f48570a = c3959e;
            this.f48571b = i;
        }

        /* renamed from: a */
        public C18340a<T> m58907a() {
            return this.f48570a.replay(this.f48571b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$b */
    static final class C15700b<T> implements Callable<C18340a<T>> {
        /* renamed from: a */
        private final C3959e<T> f48572a;
        /* renamed from: b */
        private final int f48573b;
        /* renamed from: c */
        private final long f48574c;
        /* renamed from: d */
        private final TimeUnit f48575d;
        /* renamed from: e */
        private final C15679f f48576e;

        public /* synthetic */ Object call() throws Exception {
            return m58908a();
        }

        C15700b(C3959e<T> c3959e, int i, long j, TimeUnit timeUnit, C15679f c15679f) {
            this.f48572a = c3959e;
            this.f48573b = i;
            this.f48574c = j;
            this.f48575d = timeUnit;
            this.f48576e = c15679f;
        }

        /* renamed from: a */
        public C18340a<T> m58908a() {
            return this.f48572a.replay(this.f48573b, this.f48574c, this.f48575d, this.f48576e);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$k */
    static final class C15701k<T> implements Callable<C18340a<T>> {
        /* renamed from: a */
        private final C3959e<T> f48577a;

        public /* synthetic */ Object call() throws Exception {
            return m58909a();
        }

        C15701k(C3959e<T> c3959e) {
            this.f48577a = c3959e;
        }

        /* renamed from: a */
        public C18340a<T> m58909a() {
            return this.f48577a.replay();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$o */
    static final class C15702o<T> implements Callable<C18340a<T>> {
        /* renamed from: a */
        private final C3959e<T> f48578a;
        /* renamed from: b */
        private final long f48579b;
        /* renamed from: c */
        private final TimeUnit f48580c;
        /* renamed from: d */
        private final C15679f f48581d;

        public /* synthetic */ Object call() throws Exception {
            return m58910a();
        }

        C15702o(C3959e<T> c3959e, long j, TimeUnit timeUnit, C15679f c15679f) {
            this.f48578a = c3959e;
            this.f48579b = j;
            this.f48580c = timeUnit;
            this.f48581d = c15679f;
        }

        /* renamed from: a */
        public C18340a<T> m58910a() {
            return this.f48578a.replay(this.f48579b, this.f48580c, this.f48581d);
        }
    }

    enum ErrorMapperFilter implements Function<C15675d<Object>, Throwable>, Predicate<C15675d<Object>> {
        INSTANCE;

        public Throwable apply(C15675d<Object> c15675d) throws Exception {
            return c15675d.m58838e();
        }

        public boolean test(C15675d<Object> c15675d) throws Exception {
            return c15675d.m58835b();
        }
    }

    enum MapToInt implements Function<Object, Object> {
        INSTANCE;

        public Object apply(Object obj) throws Exception {
            return Integer.valueOf(null);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$c */
    static final class C17427c<T, U> implements Function<T, ObservableSource<U>> {
        /* renamed from: a */
        private final Function<? super T, ? extends Iterable<? extends U>> f53529a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63581a(obj);
        }

        C17427c(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.f53529a = function;
        }

        /* renamed from: a */
        public ObservableSource<U> m63581a(T t) throws Exception {
            return new al((Iterable) C15684a.m58895a(this.f53529a.apply(t), "The mapper returned a null Iterable"));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$d */
    static final class C17428d<U, R, T> implements Function<U, R> {
        /* renamed from: a */
        private final BiFunction<? super T, ? super U, ? extends R> f53530a;
        /* renamed from: b */
        private final T f53531b;

        C17428d(BiFunction<? super T, ? super U, ? extends R> biFunction, T t) {
            this.f53530a = biFunction;
            this.f53531b = t;
        }

        public R apply(U u) throws Exception {
            return this.f53530a.apply(this.f53531b, u);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$e */
    static final class C17429e<T, R, U> implements Function<T, ObservableSource<R>> {
        /* renamed from: a */
        private final BiFunction<? super T, ? super U, ? extends R> f53532a;
        /* renamed from: b */
        private final Function<? super T, ? extends ObservableSource<? extends U>> f53533b;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63582a(obj);
        }

        C17429e(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends ObservableSource<? extends U>> function) {
            this.f53532a = biFunction;
            this.f53533b = function;
        }

        /* renamed from: a */
        public ObservableSource<R> m63582a(T t) throws Exception {
            return new aw((ObservableSource) C15684a.m58895a(this.f53533b.apply(t), "The mapper returned a null ObservableSource"), new C17428d(this.f53532a, t));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$f */
    static final class C17430f<T, U> implements Function<T, ObservableSource<T>> {
        /* renamed from: a */
        final Function<? super T, ? extends ObservableSource<U>> f53534a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63583a(obj);
        }

        C17430f(Function<? super T, ? extends ObservableSource<U>> function) {
            this.f53534a = function;
        }

        /* renamed from: a */
        public ObservableSource<T> m63583a(T t) throws Exception {
            return new bo((ObservableSource) C15684a.m58895a(this.f53534a.apply(t), "The itemDelay returned a null ObservableSource"), 1).map(Functions.m58880b((Object) t)).defaultIfEmpty(t);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$g */
    static final class C17431g<T, R> implements Function<T, C3959e<R>> {
        /* renamed from: a */
        final Function<? super T, ? extends SingleSource<? extends R>> f53535a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63584a(obj);
        }

        C17431g(Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.f53535a = function;
        }

        /* renamed from: a */
        public C3959e<R> m63584a(T t) throws Exception {
            return C2667a.a(new C18422k((SingleSource) C15684a.m58895a(this.f53535a.apply(t), "The mapper returned a null SingleSource")));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$h */
    static final class C17432h<T> implements Action {
        /* renamed from: a */
        final Observer<T> f53536a;

        C17432h(Observer<T> observer) {
            this.f53536a = observer;
        }

        public void run() throws Exception {
            this.f53536a.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$i */
    static final class C17433i<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final Observer<T> f53537a;

        public /* synthetic */ void accept(Object obj) throws Exception {
            m63585a((Throwable) obj);
        }

        C17433i(Observer<T> observer) {
            this.f53537a = observer;
        }

        /* renamed from: a */
        public void m63585a(Throwable th) throws Exception {
            this.f53537a.onError(th);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$j */
    static final class C17434j<T> implements Consumer<T> {
        /* renamed from: a */
        final Observer<T> f53538a;

        C17434j(Observer<T> observer) {
            this.f53538a = observer;
        }

        public void accept(T t) throws Exception {
            this.f53538a.onNext(t);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$l */
    static final class C17435l<T, R> implements Function<C3959e<T>, ObservableSource<R>> {
        /* renamed from: a */
        private final Function<? super C3959e<T>, ? extends ObservableSource<R>> f53539a;
        /* renamed from: b */
        private final C15679f f53540b;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63586a((C3959e) obj);
        }

        C17435l(Function<? super C3959e<T>, ? extends ObservableSource<R>> function, C15679f c15679f) {
            this.f53539a = function;
            this.f53540b = c15679f;
        }

        /* renamed from: a */
        public ObservableSource<R> m63586a(C3959e<T> c3959e) throws Exception {
            return C3959e.wrap((ObservableSource) C15684a.m58895a(this.f53539a.apply(c3959e), "The selector returned a null ObservableSource")).observeOn(this.f53540b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$m */
    static final class C17436m<T, S> implements BiFunction<S, Emitter<T>, S> {
        /* renamed from: a */
        final BiConsumer<S, Emitter<T>> f53541a;

        public /* synthetic */ Object apply(Object obj, Object obj2) throws Exception {
            return m63587a(obj, (Emitter) obj2);
        }

        C17436m(BiConsumer<S, Emitter<T>> biConsumer) {
            this.f53541a = biConsumer;
        }

        /* renamed from: a */
        public S m63587a(S s, Emitter<T> emitter) throws Exception {
            this.f53541a.accept(s, emitter);
            return s;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$n */
    static final class C17437n<T, S> implements BiFunction<S, Emitter<T>, S> {
        /* renamed from: a */
        final Consumer<Emitter<T>> f53542a;

        public /* synthetic */ Object apply(Object obj, Object obj2) throws Exception {
            return m63588a(obj, (Emitter) obj2);
        }

        C17437n(Consumer<Emitter<T>> consumer) {
            this.f53542a = consumer;
        }

        /* renamed from: a */
        public S m63588a(S s, Emitter<T> emitter) throws Exception {
            this.f53542a.accept(emitter);
            return s;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$p */
    static final class C17438p<T, R> implements Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> {
        /* renamed from: a */
        private final Function<? super Object[], ? extends R> f53543a;

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m63589a((List) obj);
        }

        C17438p(Function<? super Object[], ? extends R> function) {
            this.f53543a = function;
        }

        /* renamed from: a */
        public ObservableSource<? extends R> m63589a(List<ObservableSource<? extends T>> list) {
            return C3959e.zipIterable(list, this.f53543a, false, C3959e.bufferSize());
        }
    }

    /* renamed from: a */
    public static <T, S> BiFunction<S, Emitter<T>, S> m58913a(Consumer<Emitter<T>> consumer) {
        return new C17437n(consumer);
    }

    /* renamed from: a */
    public static <T, S> BiFunction<S, Emitter<T>, S> m58912a(BiConsumer<S, Emitter<T>> biConsumer) {
        return new C17436m(biConsumer);
    }

    /* renamed from: a */
    public static <T, U> Function<T, ObservableSource<T>> m58915a(Function<? super T, ? extends ObservableSource<U>> function) {
        return new C17430f(function);
    }

    /* renamed from: a */
    public static <T> Consumer<T> m58914a(Observer<T> observer) {
        return new C17434j(observer);
    }

    /* renamed from: b */
    public static <T> Consumer<Throwable> m58923b(Observer<T> observer) {
        return new C17433i(observer);
    }

    /* renamed from: c */
    public static <T> Action m58925c(Observer<T> observer) {
        return new C17432h(observer);
    }

    /* renamed from: a */
    public static <T, U, R> Function<T, ObservableSource<R>> m58917a(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new C17429e(biFunction, function);
    }

    /* renamed from: b */
    public static <T, U> Function<T, ObservableSource<U>> m58924b(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new C17427c(function);
    }

    /* renamed from: a */
    public static <T> Callable<C18340a<T>> m58918a(C3959e<T> c3959e) {
        return new C15701k(c3959e);
    }

    /* renamed from: a */
    public static <T> Callable<C18340a<T>> m58919a(C3959e<T> c3959e, int i) {
        return new C15699a(c3959e, i);
    }

    /* renamed from: a */
    public static <T> Callable<C18340a<T>> m58920a(C3959e<T> c3959e, int i, long j, TimeUnit timeUnit, C15679f c15679f) {
        return new C15700b(c3959e, i, j, timeUnit, c15679f);
    }

    /* renamed from: a */
    public static <T> Callable<C18340a<T>> m58921a(C3959e<T> c3959e, long j, TimeUnit timeUnit, C15679f c15679f) {
        return new C15702o(c3959e, j, timeUnit, c15679f);
    }

    /* renamed from: a */
    public static <T, R> Function<C3959e<T>, ObservableSource<R>> m58916a(Function<? super C3959e<T>, ? extends ObservableSource<R>> function, C15679f c15679f) {
        return new C17435l(function, c15679f);
    }

    /* renamed from: c */
    public static <T, R> Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> m58926c(Function<? super Object[], ? extends R> function) {
        return new C17438p(function);
    }

    /* renamed from: a */
    public static <T, R> C3959e<R> m58911a(C3959e<T> c3959e, Function<? super T, ? extends SingleSource<? extends R>> function) {
        return c3959e.switchMap(m58927d(function), 1);
    }

    /* renamed from: b */
    public static <T, R> C3959e<R> m58922b(C3959e<T> c3959e, Function<? super T, ? extends SingleSource<? extends R>> function) {
        return c3959e.switchMapDelayError(m58927d(function), 1);
    }

    /* renamed from: d */
    private static <T, R> Function<T, C3959e<R>> m58927d(Function<? super T, ? extends SingleSource<? extends R>> function) {
        C15684a.m58895a((Object) function, "mapper is null");
        return new C17431g(function);
    }
}
