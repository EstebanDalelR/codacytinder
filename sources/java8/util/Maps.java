package java8.util;

import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java8.util.concurrent.ConcurrentMaps;
import java8.util.function.BiConsumer;
import java8.util.function.BiFunction;
import java8.util.function.Function;

public final class Maps {

    public static final class Entry {
        private Entry() {
        }
    }

    /* renamed from: a */
    public static <K, V> V m59107a(Map<K, V> map, K k, V v) {
        Objects.m59115b(map);
        if (map instanceof ConcurrentMap) {
            return ((ConcurrentMap) map).putIfAbsent(k, v);
        }
        V v2 = map.get(k);
        if (v2 == null) {
            v2 = map.put(k, v);
        }
        return v2;
    }

    /* renamed from: a */
    public static <K, V> void m59110a(Map<K, V> map, BiConsumer<? super K, ? super V> biConsumer) {
        Objects.m59115b(map);
        Objects.m59115b(biConsumer);
        if (map instanceof ConcurrentMap) {
            ConcurrentMaps.m59215a((ConcurrentMap) map, (BiConsumer) biConsumer);
            return;
        }
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) map.next();
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (Map<K, V> map2) {
                biConsumer = new ConcurrentModificationException();
                biConsumer.initCause(map2);
                throw biConsumer;
            }
        }
    }

    /* renamed from: a */
    public static <K, V> V m59108a(Map<K, V> map, K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        Objects.m59115b(map);
        Objects.m59115b(biFunction);
        Objects.m59115b(v);
        if (map instanceof ConcurrentMap) {
            return ConcurrentMaps.m59213a((ConcurrentMap) map, (Object) k, (Object) v, (BiFunction) biFunction);
        }
        Object obj = map.get(k);
        if (obj != null) {
            v = biFunction.apply(obj, v);
        }
        if (v == null) {
            map.remove(k);
        } else {
            map.put(k, v);
        }
        return v;
    }

    /* renamed from: a */
    public static <K, V> V m59109a(Map<K, V> map, K k, Function<? super K, ? extends V> function) {
        Objects.m59115b(map);
        Objects.m59115b(function);
        if (map instanceof ConcurrentMap) {
            return ConcurrentMaps.m59214a((ConcurrentMap) map, k, function);
        }
        V v = map.get(k);
        if (v == null) {
            function = function.apply(k);
            if (function != null) {
                map.put(k, function);
                return function;
            }
        }
        return v;
    }

    /* renamed from: a */
    public static <K, V> void m59111a(Map<K, V> map, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        Objects.m59115b(map);
        Objects.m59115b(biFunction);
        if (map instanceof ConcurrentMap) {
            ConcurrentMaps.m59216a((ConcurrentMap) map, (BiFunction) biFunction);
            return;
        }
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) map.next();
            try {
                try {
                    entry.setValue(biFunction.apply(entry.getKey(), entry.getValue()));
                } catch (Map<K, V> map2) {
                    biFunction = new ConcurrentModificationException();
                    biFunction.initCause(map2);
                    throw biFunction;
                }
            } catch (Map<K, V> map22) {
                biFunction = new ConcurrentModificationException();
                biFunction.initCause(map22);
                throw biFunction;
            }
        }
    }

    private Maps() {
    }
}
