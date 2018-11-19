package com.foursquare.internal.util;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class CollectionUtils {

    public interface MergeStrategy<T> {
        T merge(@NonNull C1938b<T> c1938b, @NonNull C1938b<T> c1938b2);

        boolean shouldMerge(@NonNull C1938b<T> c1938b, @NonNull C1938b<T> c1938b2);
    }

    /* renamed from: com.foursquare.internal.util.CollectionUtils$a */
    public static class C1937a<K, T> {
        /* renamed from: a */
        public final K f5214a;
        @NonNull
        /* renamed from: b */
        public final List<T> f5215b = new ArrayList();

        C1937a(K k) {
            this.f5214a = k;
        }

        /* renamed from: a */
        void m6787a(T t) {
            this.f5215b.add(t);
        }

        /* renamed from: a */
        public int m6786a(Func1<T, Integer> func1) {
            int i = 0;
            for (Object call : this.f5215b) {
                i += ((Integer) func1.call(call)).intValue();
            }
            return i;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C1937a c1937a = (C1937a) obj;
                    if (this.f5214a != null) {
                        if (this.f5214a.equals(c1937a.f5214a) == null) {
                        }
                        return z;
                    } else if (c1937a.f5214a == null) {
                        return z;
                    }
                    z = false;
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f5214a != null ? this.f5214a.hashCode() : 0;
        }
    }

    /* renamed from: com.foursquare.internal.util.CollectionUtils$b */
    public static class C1938b<T> {
        /* renamed from: a */
        public final int f5216a;
        /* renamed from: b */
        public final T f5217b;

        public C1938b(int i, T t) {
            this.f5216a = i;
            this.f5217b = t;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C1938b c1938b = (C1938b) obj;
                    if (this.f5216a != c1938b.f5216a) {
                        return false;
                    }
                    if (this.f5217b != null) {
                        z = this.f5217b.equals(c1938b.f5217b);
                    } else if (c1938b.f5217b != null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f5216a * 31) + (this.f5217b != null ? this.f5217b.hashCode() : 0);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Indexed[");
            stringBuilder.append(this.f5216a);
            stringBuilder.append("]: ");
            stringBuilder.append(this.f5217b);
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public static boolean m6792a(@Nullable List<?> list) {
        if (list != null) {
            if (list.size() != null) {
                return null;
            }
        }
        return true;
    }

    @NonNull
    /* renamed from: a */
    public static <T, R> List<R> m6790a(@Nullable Iterable<T> iterable, @NonNull Func1<T, R> func1) {
        if (iterable == null) {
            return new ArrayList();
        }
        List<R> c = m6796c(iterable);
        for (T call : iterable) {
            c.add(func1.call(call));
        }
        return c;
    }

    @NonNull
    /* renamed from: b */
    public static <T, R> List<R> m6794b(@Nullable Iterable<T> iterable, @NonNull Func1<T, R> func1) {
        if (iterable == null) {
            return new ArrayList();
        }
        List<R> c = m6796c(iterable);
        for (T call : iterable) {
            Object call2 = func1.call(call);
            if (call2 != null) {
                c.add(call2);
            }
        }
        return c;
    }

    @NonNull
    /* renamed from: c */
    public static <R> List<R> m6797c(@Nullable Iterable<R> iterable, @NonNull Func1<R, Boolean> func1) {
        if (iterable == null) {
            return new ArrayList();
        }
        List<R> c = m6796c(iterable);
        for (Object next : iterable) {
            if (((Boolean) func1.call(next)).booleanValue()) {
                c.add(next);
            }
        }
        return c;
    }

    @NonNull
    /* renamed from: a */
    public static <T> List<T> m6789a(@NonNull Iterable<T> iterable, int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(".take with n=");
            stringBuilder.append(i);
            stringBuilder.append(" makes no sense");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i == 0) {
            return Collections.emptyList();
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                if (collection.size() <= i) {
                    return new ArrayList(collection);
                }
            }
            List<T> arrayList = new ArrayList(i);
            int i2 = 0;
            for (Object next : iterable) {
                int i3 = i2 + 1;
                if (i2 == i) {
                    break;
                }
                arrayList.add(next);
                i2 = i3;
            }
            return arrayList;
        }
    }

    /* renamed from: b */
    public static <T> List<C1938b<T>> m6795b(@NonNull List<T> list) {
        List<C1938b<T>> arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new C1938b(i, list.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <K, T> List<C1937a<K, T>> m6791a(List<T> list, Func1<T, K> func1) {
        Map linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            Object call = func1.call(next);
            if (linkedHashMap.containsKey(call)) {
                ((C1937a) linkedHashMap.get(call)).m6787a(next);
            } else {
                C1937a c1937a = new C1937a(call);
                c1937a.m6787a(next);
                linkedHashMap.put(call, c1937a);
            }
        }
        return new ArrayList(linkedHashMap.values());
    }

    @IntRange(from = -1, to = 2147483647L)
    /* renamed from: d */
    public static <T, C extends Comparable<? super C>> int m6798d(@NonNull Iterable<T> iterable, @NonNull Func1<T, C> func1) {
        int i = -1;
        Object obj = null;
        int i2 = 0;
        for (T call : iterable) {
            Comparable comparable = (Comparable) func1.call(call);
            if (obj == null || (comparable != null && comparable.compareTo(obj) < 0)) {
                i = i2;
                obj = comparable;
            }
            i2++;
        }
        return i;
    }

    @IntRange(from = -1, to = 2147483647L)
    /* renamed from: a */
    public static <T extends Comparable<? super T>> int m6788a(@NonNull Iterable<T> iterable) {
        return m6798d(iterable, C1945g.m6834a());
    }

    /* renamed from: e */
    public static <T> int m6799e(@NonNull Iterable<T> iterable, @NonNull Func1<T, Integer> func1) {
        int i = 0;
        for (T call : iterable) {
            i += ((Integer) func1.call(call)).intValue();
        }
        return i;
    }

    /* renamed from: b */
    public static int m6793b(@NonNull Iterable<Integer> iterable) {
        return m6799e(iterable, C1945g.m6834a());
    }

    @NonNull
    /* renamed from: c */
    private static <R> ArrayList<R> m6796c(@NonNull Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList(((Collection) iterable).size());
        }
        return new ArrayList();
    }
}
