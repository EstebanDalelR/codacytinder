package kotlin.reflect.jvm.internal.pcollections;

import org.jetbrains.annotations.NotNull;

public final class HashPMap<K, V> {
    private static final HashPMap<Object, Object> EMPTY = new HashPMap(IntTreePMap.empty(), 0);
    private final IntTreePMap<ConsPStack<MapEntry<K, V>>> intMap;
    private final int size;

    @NotNull
    public static <K, V> HashPMap<K, V> empty() {
        return EMPTY;
    }

    private HashPMap(IntTreePMap<ConsPStack<MapEntry<K, V>>> intTreePMap, int i) {
        this.intMap = intTreePMap;
        this.size = i;
    }

    public int size() {
        return this.size;
    }

    public boolean containsKey(Object obj) {
        return keyIndexIn(getEntries(obj.hashCode()), obj) != -1 ? true : null;
    }

    public V get(Object obj) {
        ConsPStack entries = getEntries(obj.hashCode());
        while (entries != null && entries.size() > 0) {
            MapEntry mapEntry = (MapEntry) entries.first;
            if (mapEntry.key.equals(obj)) {
                return mapEntry.value;
            }
            entries = entries.rest;
        }
        return null;
    }

    @NotNull
    public HashPMap<K, V> plus(K k, V v) {
        ConsPStack entries = getEntries(k.hashCode());
        int size = entries.size();
        int keyIndexIn = keyIndexIn(entries, k);
        if (keyIndexIn != -1) {
            entries = entries.minus(keyIndexIn);
        }
        v = entries.plus(new MapEntry(k, v));
        return new HashPMap(this.intMap.plus(k.hashCode(), v), (this.size - size) + v.size());
    }

    @NotNull
    public HashPMap<K, V> minus(Object obj) {
        ConsPStack entries = getEntries(obj.hashCode());
        int keyIndexIn = keyIndexIn(entries, obj);
        if (keyIndexIn == -1) {
            return this;
        }
        entries = entries.minus(keyIndexIn);
        if (entries.size() == 0) {
            return new HashPMap(this.intMap.minus(obj.hashCode()), this.size - 1);
        }
        return new HashPMap(this.intMap.plus(obj.hashCode(), entries), this.size - 1);
    }

    private ConsPStack<MapEntry<K, V>> getEntries(int i) {
        ConsPStack consPStack = (ConsPStack) this.intMap.get(i);
        return consPStack == null ? ConsPStack.empty() : consPStack;
    }

    private static <K, V> int keyIndexIn(ConsPStack<MapEntry<K, V>> consPStack, Object obj) {
        int i = 0;
        while (consPStack != null && consPStack.size() > 0) {
            if (((MapEntry) consPStack.first).key.equals(obj)) {
                return i;
            }
            consPStack = consPStack.rest;
            i++;
        }
        return -1;
    }
}
