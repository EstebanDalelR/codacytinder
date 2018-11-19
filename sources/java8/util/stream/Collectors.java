package java8.util.stream;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java8.util.Maps;
import java8.util.Objects;
import java8.util.concurrent.ConcurrentMaps;
import java8.util.function.BiConsumer;
import java8.util.function.BiFunction;
import java8.util.function.BinaryOperator;
import java8.util.function.Consumer;
import java8.util.function.Function;
import java8.util.function.Predicate;
import java8.util.function.Supplier;
import java8.util.function.ToDoubleFunction;
import java8.util.function.ToIntFunction;
import java8.util.function.ToLongFunction;
import java8.util.stream.Collector.Characteristics;

public final class Collectors {
    /* renamed from: a */
    static final Set<Characteristics> f48880a = Collections.unmodifiableSet(EnumSet.of(Characteristics.CONCURRENT, Characteristics.UNORDERED, Characteristics.IDENTITY_FINISH));
    /* renamed from: b */
    static final Set<Characteristics> f48881b = Collections.unmodifiableSet(EnumSet.of(Characteristics.CONCURRENT, Characteristics.UNORDERED));
    /* renamed from: c */
    static final Set<Characteristics> f48882c = Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH));
    /* renamed from: d */
    static final Set<Characteristics> f48883d = Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED, Characteristics.IDENTITY_FINISH));
    /* renamed from: e */
    static final Set<Characteristics> f48884e = Collections.emptySet();

    private static final class Partition<T> extends AbstractMap<Boolean, T> implements Map<Boolean, T> {
        /* renamed from: a */
        final T f48878a;
        /* renamed from: b */
        final T f48879b;

        /* renamed from: java8.util.stream.Collectors$Partition$1 */
        class C157731 extends AbstractSet<Entry<Boolean, T>> {
            /* renamed from: a */
            final /* synthetic */ Partition f48877a;

            public int size() {
                return 2;
            }

            C157731(Partition partition) {
                this.f48877a = partition;
            }

            public Iterator<Entry<Boolean, T>> iterator() {
                SimpleImmutableEntry simpleImmutableEntry = new SimpleImmutableEntry(Boolean.valueOf(false), this.f48877a.f48879b);
                SimpleImmutableEntry simpleImmutableEntry2 = new SimpleImmutableEntry(Boolean.valueOf(true), this.f48877a.f48878a);
                return Arrays.asList(new Entry[]{simpleImmutableEntry, simpleImmutableEntry2}).iterator();
            }
        }

        public boolean isEmpty() {
            return false;
        }

        public int size() {
            return 2;
        }

        Partition(T t, T t2) {
            this.f48878a = t;
            this.f48879b = t2;
        }

        public Set<Entry<Boolean, T>> entrySet() {
            return new C157731(this);
        }

        public boolean containsKey(Object obj) {
            return obj instanceof Boolean;
        }

        public T get(Object obj) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() != null ? this.f48878a : this.f48879b;
            } else {
                return null;
            }
        }
    }

    /* renamed from: java8.util.stream.Collectors$1OptionalBox */
    class AnonymousClass1OptionalBox implements Consumer<T> {
        /* renamed from: a */
        T f54523a = null;
        /* renamed from: b */
        boolean f54524b = null;
        /* renamed from: c */
        final /* synthetic */ BinaryOperator f54525c;

        AnonymousClass1OptionalBox(BinaryOperator binaryOperator) {
            this.f54525c = binaryOperator;
        }

        public void accept(T t) {
            if (this.f54524b) {
                this.f54523a = this.f54525c.apply(this.f54523a, t);
                return;
            }
            this.f54523a = t;
            this.f54524b = true;
        }
    }

    static class CollectorImpl<T, A, R> implements Collector<T, A, R> {
        /* renamed from: a */
        private final Supplier<A> f54527a;
        /* renamed from: b */
        private final BiConsumer<A, T> f54528b;
        /* renamed from: c */
        private final BinaryOperator<A> f54529c;
        /* renamed from: d */
        private final Function<A, R> f54530d;
        /* renamed from: e */
        private final Set<Characteristics> f54531e;

        /* renamed from: b */
        private static /* synthetic */ Object m63962b(Object obj) {
            return obj;
        }

        CollectorImpl(Supplier<A> supplier, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator, Function<A, R> function, Set<Characteristics> set) {
            this.f54527a = supplier;
            this.f54528b = biConsumer;
            this.f54529c = binaryOperator;
            this.f54530d = function;
            this.f54531e = set;
        }

        CollectorImpl(Supplier<A> supplier, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator, Set<Characteristics> set) {
            this(supplier, biConsumer, binaryOperator, Collectors$CollectorImpl$$Lambda$1.m63960a(), set);
        }

        public BiConsumer<A, T> accumulator() {
            return this.f54528b;
        }

        public Supplier<A> supplier() {
            return this.f54527a;
        }

        public BinaryOperator<A> combiner() {
            return this.f54529c;
        }

        public Function<A, R> finisher() {
            return this.f54530d;
        }

        public Set<Characteristics> characteristics() {
            return this.f54531e;
        }
    }

    private Collectors() {
    }

    /* renamed from: a */
    private static IllegalStateException m59414a(Object obj, Object obj2, Object obj3) {
        return new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", new Object[]{obj, obj2, obj3}));
    }

    /* renamed from: h */
    private static <K, V, M extends Map<K, V>> BinaryOperator<M> m59554h() {
        return Collectors$$Lambda$1.m66669a();
    }

    /* renamed from: b */
    private static /* synthetic */ Map m59475b(Map map, Map map2) {
        for (Entry entry : map2.entrySet()) {
            Object putIfAbsent;
            Object key = entry.getKey();
            Object b = Objects.m59115b(entry.getValue());
            if (map instanceof ConcurrentMap) {
                putIfAbsent = ((ConcurrentMap) map).putIfAbsent(key, b);
                continue;
            } else {
                putIfAbsent = Maps.m59107a(map, key, b);
                continue;
            }
            if (putIfAbsent != null) {
                throw m59414a(key, putIfAbsent, b);
            }
        }
        return map;
    }

    /* renamed from: b */
    private static <T, K, V> BiConsumer<Map<K, V>, T> m59487b(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return Collectors$$Lambda$2.m63950a(function, function2);
    }

    /* renamed from: b */
    private static /* synthetic */ void m59498b(Function function, Function function2, Map map, Object obj) {
        Object putIfAbsent;
        Object apply = function.apply(obj);
        Object b = Objects.m59115b(function2.apply(obj));
        if ((map instanceof ConcurrentMap) != null) {
            putIfAbsent = ((ConcurrentMap) map).putIfAbsent(apply, b);
        } else {
            putIfAbsent = Maps.m59107a(map, apply, b);
        }
        if (putIfAbsent != null) {
            throw m59414a(apply, putIfAbsent, b);
        }
    }

    /* renamed from: a */
    public static <T> Collector<T, ?, List<T>> m59434a() {
        return new CollectorImpl(Collectors$$Lambda$5.m63951a(), Collectors$$Lambda$6.m63952a(), Collectors$$Lambda$7.m66670a(), f48882c);
    }

    /* renamed from: b */
    private static /* synthetic */ Set m59479b(Set set, Set set2) {
        if (set.size() < set2.size()) {
            set2.addAll(set);
            return set2;
        }
        set.addAll(set2);
        return set;
    }

    /* renamed from: a */
    public static Collector<CharSequence, ?, String> m59435a(CharSequence charSequence) {
        return m59436a(charSequence, (CharSequence) "", (CharSequence) "");
    }

    /* renamed from: a */
    public static Collector<CharSequence, ?, String> m59436a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return new CollectorImpl(Collectors$$Lambda$15.m63947a(charSequence, charSequence2, charSequence3), Collectors$$Lambda$16.m63948a(), Collectors$$Lambda$17.m66668a(), Collectors$$Lambda$18.m63949a(), f48884e);
    }

    /* renamed from: b */
    private static /* synthetic */ Map m59476b(BinaryOperator binaryOperator, Map map, Map map2) {
        for (Entry entry : map2.entrySet()) {
            Maps.m59108a(map, entry.getKey(), entry.getValue(), binaryOperator);
        }
        return map;
    }

    /* renamed from: b */
    private static /* synthetic */ ConcurrentMap m59480b(BinaryOperator binaryOperator, ConcurrentMap concurrentMap, ConcurrentMap concurrentMap2) {
        for (Entry entry : concurrentMap2.entrySet()) {
            ConcurrentMaps.m59213a(concurrentMap, entry.getKey(), entry.getValue(), (BiFunction) binaryOperator);
        }
        return concurrentMap;
    }

    /* renamed from: b */
    private static /* synthetic */ void m59497b(java8.util.function.Function r1, java8.util.function.BiConsumer r2, java.lang.Object r3, java.lang.Object r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = r1.apply(r4);	 Catch:{ all -> 0x001f }
        r1 = (java8.util.stream.Stream) r1;	 Catch:{ all -> 0x001f }
        if (r1 == 0) goto L_0x0019;
    L_0x0009:
        r4 = r1.sequential();	 Catch:{ all -> 0x0017 }
        r4 = (java8.util.stream.Stream) r4;	 Catch:{ all -> 0x0017 }
        r2 = java8.util.stream.Collectors$$Lambda$92.m63959a(r2, r3);	 Catch:{ all -> 0x0017 }
        r4.forEach(r2);	 Catch:{ all -> 0x0017 }
        goto L_0x0019;
    L_0x0017:
        r2 = move-exception;
        goto L_0x0021;
    L_0x0019:
        if (r1 == 0) goto L_0x001e;
    L_0x001b:
        r1.close();	 Catch:{ Exception -> 0x001e }
    L_0x001e:
        return;
    L_0x001f:
        r2 = move-exception;
        r1 = r0;
    L_0x0021:
        if (r1 == 0) goto L_0x0026;
    L_0x0023:
        r1.close();	 Catch:{ Exception -> 0x0026 }
    L_0x0026:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.stream.Collectors.b(java8.util.function.Function, java8.util.function.BiConsumer, java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: b */
    private static /* synthetic */ void m59503b(Predicate predicate, BiConsumer biConsumer, Object obj, Object obj2) {
        if (predicate.test(obj2) != null) {
            biConsumer.accept(obj, obj2);
        }
    }

    /* renamed from: d */
    private static /* synthetic */ void m59538d(ToDoubleFunction toDoubleFunction, double[] dArr, Object obj) {
        double applyAsDouble = toDoubleFunction.applyAsDouble(obj);
        m59461a(dArr, applyAsDouble);
        dArr[2] = dArr[2] + applyAsDouble;
    }

    /* renamed from: d */
    private static /* synthetic */ double[] m59541d(double[] dArr, double[] dArr2) {
        m59461a(dArr, dArr2[0]);
        dArr[2] = dArr[2] + dArr2[2];
        return m59461a(dArr, dArr2[1]);
    }

    /* renamed from: a */
    static double[] m59461a(double[] dArr, double d) {
        d -= dArr[1];
        double d2 = dArr[0];
        double d3 = d2 + d;
        dArr[1] = (d3 - d2) - d;
        dArr[0] = d3;
        return dArr;
    }

    /* renamed from: a */
    static double m59412a(double[] dArr) {
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) == null || Double.isInfinite(d2) == null) ? d : d2;
    }

    /* renamed from: b */
    private static /* synthetic */ void m59508b(ToIntFunction toIntFunction, long[] jArr, Object obj) {
        jArr[0] = jArr[0] + ((long) toIntFunction.applyAsInt(obj));
        jArr[1] = jArr[1] + 1;
    }

    /* renamed from: e */
    private static /* synthetic */ long[] m59548e(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
        return jArr;
    }

    /* renamed from: e */
    private static /* synthetic */ Double m59545e(long[] jArr) {
        return Double.valueOf(jArr[1] == 0 ? 0.0d : ((double) jArr[0]) / ((double) jArr[1]));
    }

    /* renamed from: c */
    private static /* synthetic */ void m59525c(ToLongFunction toLongFunction, long[] jArr, Object obj) {
        jArr[0] = jArr[0] + toLongFunction.applyAsLong(obj);
        jArr[1] = jArr[1] + 1;
    }

    /* renamed from: d */
    private static /* synthetic */ long[] m59542d(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
        return jArr;
    }

    /* renamed from: d */
    private static /* synthetic */ Double m59533d(long[] jArr) {
        return Double.valueOf(jArr[1] == 0 ? 0.0d : ((double) jArr[0]) / ((double) jArr[1]));
    }

    /* renamed from: c */
    private static /* synthetic */ void m59524c(ToDoubleFunction toDoubleFunction, double[] dArr, Object obj) {
        double applyAsDouble = toDoubleFunction.applyAsDouble(obj);
        m59461a(dArr, applyAsDouble);
        dArr[2] = dArr[2] + 1.0d;
        dArr[3] = dArr[3] + applyAsDouble;
    }

    /* renamed from: c */
    private static /* synthetic */ double[] m59526c(double[] dArr, double[] dArr2) {
        m59461a(dArr, dArr2[0]);
        m59461a(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
        dArr[3] = dArr[3] + dArr2[3];
        return dArr;
    }

    /* renamed from: d */
    private static /* synthetic */ Double m59532d(double[] dArr) {
        double d = 0.0d;
        if (dArr[2] != 0.0d) {
            d = m59412a(dArr) / dArr[2];
        }
        return Double.valueOf(d);
    }

    /* renamed from: b */
    private static /* synthetic */ AnonymousClass1OptionalBox m59489b(AnonymousClass1OptionalBox anonymousClass1OptionalBox, AnonymousClass1OptionalBox anonymousClass1OptionalBox2) {
        if (anonymousClass1OptionalBox2.f54524b) {
            anonymousClass1OptionalBox.accept(anonymousClass1OptionalBox2.f54523a);
        }
        return anonymousClass1OptionalBox;
    }

    /* renamed from: c */
    private static /* synthetic */ void m59523c(Function function, Supplier supplier, BiConsumer biConsumer, ConcurrentMap concurrentMap, Object obj) {
        function = ConcurrentMaps.m59214a(concurrentMap, Objects.m59113a(function.apply(obj), "element cannot be mapped to a null key"), Collectors$$Lambda$88.m63955a(supplier));
        synchronized (function) {
            biConsumer.accept(function, obj);
        }
    }

    /* renamed from: b */
    private static /* synthetic */ void m59494b(BiConsumer biConsumer, Predicate predicate, Partition partition, Object obj) {
        biConsumer.accept(predicate.test(obj) != null ? partition.f48878a : partition.f48879b, obj);
    }

    /* renamed from: a */
    public static <T, K, U> Collector<T, ?, Map<K, U>> m59437a(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2) {
        return new CollectorImpl(Collectors$$Lambda$72.m63953a(), m59487b((Function) function, (Function) function2), m59554h(), f48882c);
    }
}
