package java8.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import java8.util.Objects;
import java8.util.function.BiFunction;
import java8.util.function.Function;

public final class ConcurrentMaps {
    /* renamed from: a */
    public static <K, V> V m59213a(ConcurrentMap<K, V> concurrentMap, K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        Objects.m59115b(concurrentMap);
        Objects.m59115b(biFunction);
        Objects.m59115b(v);
        while (true) {
            Object obj = concurrentMap.get(k);
            while (obj == null) {
                obj = concurrentMap.putIfAbsent(k, v);
                if (obj == null) {
                    return v;
                }
            }
            V apply = biFunction.apply(obj, v);
            if (apply != null) {
                if (concurrentMap.replace(k, obj, apply)) {
                    return apply;
                }
            } else if (concurrentMap.remove(k, obj)) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static <K, V> V m59214a(ConcurrentMap<K, V> concurrentMap, K k, Function<? super K, ? extends V> function) {
        Objects.m59115b(concurrentMap);
        Objects.m59115b(function);
        Function<? super K, ? extends V> function2 = concurrentMap.get(k);
        if (function2 == null) {
            function = function.apply(k);
            if (function != null) {
                function2 = concurrentMap.putIfAbsent(k, function);
                if (function2 == null) {
                    return function;
                }
            }
        }
        return function2;
    }

    /* renamed from: a */
    public static <K, V> void m59216a(ConcurrentMap<K, V> concurrentMap, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        Objects.m59115b(concurrentMap);
        Objects.m59115b(biFunction);
        m59215a((ConcurrentMap) concurrentMap, ConcurrentMaps$$Lambda$1.m63886a(concurrentMap, biFunction));
    }

    /* renamed from: b */
    private static /* synthetic */ void m59218b(ConcurrentMap concurrentMap, BiFunction biFunction, Object obj, Object obj2) {
        while (concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) == null) {
            obj2 = concurrentMap.get(obj);
            if (obj2 == null) {
                return;
            }
        }
    }

    /* renamed from: a */
    public static <K, V> void m59215a(java.util.concurrent.ConcurrentMap<K, V> r2, java8.util.function.BiConsumer<? super K, ? super V> r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        java8.util.Objects.m59115b(r2);
        java8.util.Objects.m59115b(r3);
        r2 = r2.entrySet();
        r2 = r2.iterator();
    L_0x000e:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0026;
    L_0x0014:
        r0 = r2.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();	 Catch:{ IllegalStateException -> 0x000e }
        r0 = r0.getValue();	 Catch:{ IllegalStateException -> 0x000e }
        r3.accept(r1, r0);
        goto L_0x000e;
    L_0x0026:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.concurrent.ConcurrentMaps.a(java.util.concurrent.ConcurrentMap, java8.util.function.BiConsumer):void");
    }

    private ConcurrentMaps() {
    }
}
