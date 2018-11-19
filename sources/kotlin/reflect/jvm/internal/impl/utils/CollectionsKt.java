package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CollectionsKt {
    @NotNull
    public static final <K> Map<K, Integer> mapToIndex(@NotNull Iterable<? extends K> iterable) {
        C2668g.b(iterable, "$receiver");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object put : iterable) {
            linkedHashMap.put(put, Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    public static final <T> void addIfNotNull(@NotNull Collection<T> collection, @Nullable T t) {
        C2668g.b(collection, "$receiver");
        if (t != null) {
            collection.add(t);
        }
    }

    @NotNull
    public static final <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new HashMap(capacity(i));
    }

    @NotNull
    public static final <E> HashSet<E> newHashSetWithExpectedSize(int i) {
        return new HashSet(capacity(i));
    }

    @NotNull
    public static final <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i) {
        return new LinkedHashSet(capacity(i));
    }

    private static final int capacity(int i) {
        return i < 3 ? 3 : (i + (i / 3)) + 1;
    }

    @NotNull
    public static final <T> List<T> compact(@NotNull ArrayList<T> arrayList) {
        C2668g.b(arrayList, "$receiver");
        switch (arrayList.size()) {
            case 0:
                return C17554o.m64195a();
            case 1:
                return C15807n.m59826a(C19299w.m68829f((List) arrayList));
            default:
                arrayList.trimToSize();
                return arrayList;
        }
    }
}
