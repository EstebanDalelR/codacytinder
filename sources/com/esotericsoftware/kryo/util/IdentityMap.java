package com.esotericsoftware.kryo.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IdentityMap<K, V> {
    private static final int PRIME2 = -1105259343;
    private static final int PRIME3 = -1262997959;
    private static final int PRIME4 = -825114047;
    int capacity;
    private Entries entries;
    private int hashShift;
    private boolean isBigTable;
    K[] keyTable;
    private Keys keys;
    private float loadFactor;
    private int mask;
    private int pushIterations;
    public int size;
    private int stashCapacity;
    int stashSize;
    private int threshold;
    V[] valueTable;
    private Values values;

    public static class Entry<K, V> {
        public K key;
        public V value;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.key);
            stringBuilder.append("=");
            stringBuilder.append(this.value);
            return stringBuilder.toString();
        }
    }

    private static class MapIterator<K, V> {
        int currentIndex;
        public boolean hasNext;
        final IdentityMap<K, V> map;
        int nextIndex;

        public MapIterator(IdentityMap<K, V> identityMap) {
            this.map = identityMap;
            reset();
        }

        public void reset() {
            this.currentIndex = -1;
            this.nextIndex = -1;
            findNextIndex();
        }

        void findNextIndex() {
            this.hasNext = false;
            Object[] objArr = this.map.keyTable;
            int i = this.map.capacity + this.map.stashSize;
            do {
                int i2 = this.nextIndex + 1;
                this.nextIndex = i2;
                if (i2 >= i) {
                    return;
                }
            } while (objArr[this.nextIndex] == null);
            this.hasNext = true;
        }

        public void remove() {
            if (this.currentIndex < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            if (this.currentIndex >= this.map.capacity) {
                this.map.removeStashIndex(this.currentIndex);
                this.nextIndex = this.currentIndex - 1;
                findNextIndex();
            } else {
                this.map.keyTable[this.currentIndex] = null;
                this.map.valueTable[this.currentIndex] = null;
            }
            this.currentIndex = -1;
            IdentityMap identityMap = this.map;
            identityMap.size--;
        }
    }

    public static class Entries<K, V> extends MapIterator<K, V> implements Iterable<Entry<K, V>>, Iterator<Entry<K, V>> {
        private Entry<K, V> entry = new Entry();

        public Iterator<Entry<K, V>> iterator() {
            return this;
        }

        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public Entries(IdentityMap<K, V> identityMap) {
            super(identityMap);
        }

        public Entry<K, V> next() {
            if (this.hasNext) {
                Object[] objArr = this.map.keyTable;
                this.entry.key = objArr[this.nextIndex];
                this.entry.value = this.map.valueTable[this.nextIndex];
                this.currentIndex = this.nextIndex;
                findNextIndex();
                return this.entry;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.hasNext;
        }
    }

    public static class Keys<K> extends MapIterator<K, Object> implements Iterable<K>, Iterator<K> {
        public Iterator<K> iterator() {
            return this;
        }

        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public Keys(IdentityMap<K, ?> identityMap) {
            super(identityMap);
        }

        public boolean hasNext() {
            return this.hasNext;
        }

        public K next() {
            K k = this.map.keyTable[this.nextIndex];
            this.currentIndex = this.nextIndex;
            findNextIndex();
            return k;
        }

        public ArrayList<K> toArray() {
            ArrayList<K> arrayList = new ArrayList(this.map.size);
            while (this.hasNext) {
                arrayList.add(next());
            }
            return arrayList;
        }
    }

    public static class Values<V> extends MapIterator<Object, V> implements Iterable<V>, Iterator<V> {
        public Iterator<V> iterator() {
            return this;
        }

        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public Values(IdentityMap<?, V> identityMap) {
            super(identityMap);
        }

        public boolean hasNext() {
            return this.hasNext;
        }

        public V next() {
            V v = this.map.valueTable[this.nextIndex];
            this.currentIndex = this.nextIndex;
            findNextIndex();
            return v;
        }

        public ArrayList<V> toArray() {
            ArrayList<V> arrayList = new ArrayList(this.map.size);
            while (this.hasNext) {
                arrayList.add(next());
            }
            return arrayList;
        }

        public void toArray(ArrayList<V> arrayList) {
            while (this.hasNext) {
                arrayList.add(next());
            }
        }
    }

    public IdentityMap() {
        this(32, 0.8f);
    }

    public IdentityMap(int i) {
        this(i, 0.8f);
    }

    public IdentityMap(int i, float f) {
        StringBuilder stringBuilder;
        if (i < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("initialCapacity must be >= 0: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i > 1073741824) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("initialCapacity is too large: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            this.capacity = ObjectMap.nextPowerOfTwo(i);
            if (f <= 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("loadFactor must be > 0: ");
                stringBuilder.append(f);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.loadFactor = f;
            this.isBigTable = (this.capacity >>> 16) != 0 ? 1 : 0;
            this.threshold = (int) (((float) this.capacity) * f);
            this.mask = this.capacity - 1;
            this.hashShift = 31 - Integer.numberOfTrailingZeros(this.capacity);
            this.stashCapacity = Math.max(3, ((int) Math.ceil(Math.log((double) this.capacity))) * 2);
            this.pushIterations = Math.max(Math.min(this.capacity, 8), ((int) Math.sqrt((double) this.capacity)) / 8);
            this.keyTable = (Object[]) new Object[(this.capacity + this.stashCapacity)];
            this.valueTable = (Object[]) new Object[this.keyTable.length];
        }
    }

    public V put(K k, V v) {
        IdentityMap identityMap = this;
        K k2 = k;
        if (k2 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        Object[] objArr = identityMap.keyTable;
        int i = identityMap.mask;
        boolean z = identityMap.isBigTable;
        int identityHashCode = System.identityHashCode(k);
        i &= identityHashCode;
        K k3 = objArr[i];
        if (k3 == k2) {
            V v2 = identityMap.valueTable[i];
            identityMap.valueTable[i] = v;
            return v2;
        }
        int hash2 = hash2(identityHashCode);
        K k4 = objArr[hash2];
        if (k4 == k2) {
            v2 = identityMap.valueTable[hash2];
            identityMap.valueTable[hash2] = v;
            return v2;
        }
        int hash3 = hash3(identityHashCode);
        K k5 = objArr[hash3];
        if (k5 == k2) {
            v2 = identityMap.valueTable[hash3];
            identityMap.valueTable[hash3] = v;
            return v2;
        }
        K k6;
        int i2;
        if (z) {
            identityHashCode = hash4(identityHashCode);
            k6 = objArr[identityHashCode];
            if (k6 == k2) {
                v2 = identityMap.valueTable[identityHashCode];
                identityMap.valueTable[identityHashCode] = v;
                return v2;
            }
            i2 = identityHashCode;
        } else {
            k6 = null;
            i2 = -1;
        }
        identityHashCode = identityMap.capacity;
        int i3 = identityMap.stashSize + identityHashCode;
        while (identityHashCode < i3) {
            if (objArr[identityHashCode] == k2) {
                v2 = identityMap.valueTable[identityHashCode];
                identityMap.valueTable[identityHashCode] = v;
                return v2;
            }
            identityHashCode++;
        }
        int i4;
        if (k3 == null) {
            objArr[i] = k2;
            identityMap.valueTable[i] = v;
            i4 = identityMap.size;
            identityMap.size = i4 + 1;
            if (i4 >= identityMap.threshold) {
                resize(identityMap.capacity << 1);
            }
            return null;
        } else if (k4 == null) {
            objArr[hash2] = k2;
            identityMap.valueTable[hash2] = v;
            i4 = identityMap.size;
            identityMap.size = i4 + 1;
            if (i4 >= identityMap.threshold) {
                resize(identityMap.capacity << 1);
            }
            return null;
        } else if (k5 == null) {
            objArr[hash3] = k2;
            identityMap.valueTable[hash3] = v;
            i4 = identityMap.size;
            identityMap.size = i4 + 1;
            if (i4 >= identityMap.threshold) {
                resize(identityMap.capacity << 1);
            }
            return null;
        } else if (z && k6 == null) {
            objArr[i2] = k2;
            identityMap.valueTable[i2] = v;
            i4 = identityMap.size;
            identityMap.size = i4 + 1;
            if (i4 >= identityMap.threshold) {
                resize(identityMap.capacity << 1);
            }
            return null;
        } else {
            push(k2, v, i, k3, hash2, k4, hash3, k5, i2, k6);
            return null;
        }
    }

    private void putResize(K k, V v) {
        int identityHashCode = System.identityHashCode(k);
        int i = identityHashCode & this.mask;
        Object obj = this.keyTable[i];
        if (obj == null) {
            this.keyTable[i] = k;
            this.valueTable[i] = v;
            k = this.size;
            this.size = k + 1;
            if (k >= this.threshold) {
                resize(this.capacity << 1);
            }
            return;
        }
        int hash2 = hash2(identityHashCode);
        Object obj2 = this.keyTable[hash2];
        if (obj2 == null) {
            this.keyTable[hash2] = k;
            this.valueTable[hash2] = v;
            k = this.size;
            this.size = k + 1;
            if (k >= this.threshold) {
                resize(this.capacity << 1);
            }
            return;
        }
        int hash3 = hash3(identityHashCode);
        Object obj3 = this.keyTable[hash3];
        if (obj3 == null) {
            this.keyTable[hash3] = k;
            this.valueTable[hash3] = v;
            k = this.size;
            this.size = k + 1;
            if (k >= this.threshold) {
                resize(this.capacity << 1);
            }
            return;
        }
        int i2;
        Object obj4;
        if (this.isBigTable) {
            identityHashCode = hash4(identityHashCode);
            Object obj5 = this.keyTable[identityHashCode];
            if (obj5 == null) {
                this.keyTable[identityHashCode] = k;
                this.valueTable[identityHashCode] = v;
                k = this.size;
                this.size = k + 1;
                if (k >= this.threshold) {
                    resize(this.capacity << 1);
                }
                return;
            }
            i2 = identityHashCode;
            obj4 = obj5;
        } else {
            obj4 = null;
            i2 = -1;
        }
        push(k, v, i, obj, hash2, obj2, hash3, obj3, i2, obj4);
    }

    private void push(K k, V v, int i, K k2, int i2, K k3, int i3, K k4, int i4, K k5) {
        Object[] objArr = this.keyTable;
        Object[] objArr2 = this.valueTable;
        int i5 = this.mask;
        boolean z = this.isBigTable;
        int i6 = this.pushIterations;
        int i7 = z ? 4 : 3;
        Object obj = k;
        Object obj2 = v;
        int i8 = i;
        K k6 = k2;
        int i9 = i2;
        K k7 = k3;
        int i10 = i3;
        K k8 = k4;
        int i11 = i4;
        K k9 = k5;
        int i12 = 0;
        while (true) {
            Object obj3;
            switch (ObjectMap.random.nextInt(i7)) {
                case 0:
                    obj3 = objArr2[i8];
                    objArr[i8] = obj;
                    objArr2[i8] = obj2;
                    obj2 = obj3;
                    obj = k6;
                    break;
                case 1:
                    obj3 = objArr2[i9];
                    objArr[i9] = obj;
                    objArr2[i9] = obj2;
                    obj2 = obj3;
                    obj = k7;
                    break;
                case 2:
                    obj3 = objArr2[i10];
                    objArr[i10] = obj;
                    objArr2[i10] = obj2;
                    obj2 = obj3;
                    obj = k8;
                    break;
                default:
                    obj3 = objArr2[i11];
                    objArr[i11] = obj;
                    objArr2[i11] = obj2;
                    obj2 = obj3;
                    obj = k9;
                    break;
            }
            int identityHashCode = System.identityHashCode(obj);
            i8 = identityHashCode & i5;
            k6 = objArr[i8];
            int i13;
            if (k6 == null) {
                objArr[i8] = obj;
                objArr2[i8] = obj2;
                i13 = r0.size;
                r0.size = i13 + 1;
                if (i13 >= r0.threshold) {
                    resize(r0.capacity << 1);
                }
                return;
            }
            i9 = hash2(identityHashCode);
            k7 = objArr[i9];
            if (k7 == null) {
                objArr[i9] = obj;
                objArr2[i9] = obj2;
                i13 = r0.size;
                r0.size = i13 + 1;
                if (i13 >= r0.threshold) {
                    resize(r0.capacity << 1);
                }
                return;
            }
            i10 = hash3(identityHashCode);
            k8 = objArr[i10];
            if (k8 == null) {
                objArr[i10] = obj;
                objArr2[i10] = obj2;
                i13 = r0.size;
                r0.size = i13 + 1;
                if (i13 >= r0.threshold) {
                    resize(r0.capacity << 1);
                }
                return;
            }
            if (z) {
                identityHashCode = hash4(identityHashCode);
                K k10 = objArr[identityHashCode];
                if (k10 == null) {
                    objArr[identityHashCode] = obj;
                    objArr2[identityHashCode] = obj2;
                    i13 = r0.size;
                    r0.size = i13 + 1;
                    if (i13 >= r0.threshold) {
                        resize(r0.capacity << 1);
                    }
                    return;
                }
                k9 = k10;
                i11 = identityHashCode;
            }
            identityHashCode = i12 + 1;
            if (identityHashCode == i6) {
                putStash(obj, obj2);
                return;
            }
            i12 = identityHashCode;
        }
    }

    private void putStash(K k, V v) {
        if (this.stashSize == this.stashCapacity) {
            resize(this.capacity << 1);
            put(k, v);
            return;
        }
        int i = this.capacity + this.stashSize;
        this.keyTable[i] = k;
        this.valueTable[i] = v;
        this.stashSize++;
        this.size++;
    }

    public V get(K k) {
        int identityHashCode = System.identityHashCode(k);
        int i = this.mask & identityHashCode;
        if (k != this.keyTable[i]) {
            i = hash2(identityHashCode);
            if (k != this.keyTable[i]) {
                i = hash3(identityHashCode);
                if (k != this.keyTable[i]) {
                    if (!this.isBigTable) {
                        return getStash(k, null);
                    }
                    i = hash4(identityHashCode);
                    if (k != this.keyTable[i]) {
                        return getStash(k, null);
                    }
                }
            }
        }
        return this.valueTable[i];
    }

    public V get(K k, V v) {
        int identityHashCode = System.identityHashCode(k);
        int i = this.mask & identityHashCode;
        if (k != this.keyTable[i]) {
            i = hash2(identityHashCode);
            if (k != this.keyTable[i]) {
                i = hash3(identityHashCode);
                if (k != this.keyTable[i]) {
                    if (!this.isBigTable) {
                        return getStash(k, v);
                    }
                    i = hash4(identityHashCode);
                    if (k != this.keyTable[i]) {
                        return getStash(k, v);
                    }
                }
            }
        }
        return this.valueTable[i];
    }

    private V getStash(K k, V v) {
        Object[] objArr = this.keyTable;
        int i = this.capacity;
        int i2 = this.stashSize + i;
        while (i < i2) {
            if (objArr[i] == k) {
                return this.valueTable[i];
            }
            i++;
        }
        return v;
    }

    public V remove(K k) {
        int identityHashCode = System.identityHashCode(k);
        int i = this.mask & identityHashCode;
        if (this.keyTable[i] == k) {
            this.keyTable[i] = null;
            k = this.valueTable[i];
            this.valueTable[i] = null;
            this.size--;
            return k;
        }
        i = hash2(identityHashCode);
        if (this.keyTable[i] == k) {
            this.keyTable[i] = null;
            k = this.valueTable[i];
            this.valueTable[i] = null;
            this.size--;
            return k;
        }
        i = hash3(identityHashCode);
        if (this.keyTable[i] == k) {
            this.keyTable[i] = null;
            k = this.valueTable[i];
            this.valueTable[i] = null;
            this.size--;
            return k;
        }
        if (this.isBigTable) {
            identityHashCode = hash4(identityHashCode);
            if (this.keyTable[identityHashCode] == k) {
                this.keyTable[identityHashCode] = null;
                k = this.valueTable[identityHashCode];
                this.valueTable[identityHashCode] = null;
                this.size--;
                return k;
            }
        }
        return removeStash(k);
    }

    V removeStash(K k) {
        Object[] objArr = this.keyTable;
        int i = this.capacity;
        int i2 = this.stashSize + i;
        while (i < i2) {
            if (objArr[i] == k) {
                k = this.valueTable[i];
                removeStashIndex(i);
                this.size--;
                return k;
            }
            i++;
        }
        return null;
    }

    void removeStashIndex(int i) {
        this.stashSize--;
        int i2 = this.capacity + this.stashSize;
        if (i < i2) {
            this.keyTable[i] = this.keyTable[i2];
            this.valueTable[i] = this.valueTable[i2];
            this.valueTable[i2] = null;
            return;
        }
        this.valueTable[i] = null;
    }

    public void shrink(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("maximumCapacity must be >= 0: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (this.size > i) {
            i = this.size;
        }
        if (this.capacity > i) {
            resize(ObjectMap.nextPowerOfTwo(i));
        }
    }

    public void clear(int i) {
        if (this.capacity <= i) {
            clear();
            return;
        }
        this.size = 0;
        resize(i);
    }

    public void clear() {
        Object[] objArr = this.keyTable;
        Object[] objArr2 = this.valueTable;
        int i = this.capacity + this.stashSize;
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                objArr[i2] = null;
                objArr2[i2] = null;
                i = i2;
            } else {
                this.size = 0;
                this.stashSize = 0;
                return;
            }
        }
    }

    public boolean containsValue(Object obj, boolean z) {
        Object[] objArr = this.valueTable;
        boolean z2;
        if (obj != null) {
            if (!z) {
                z = this.capacity + this.stashSize;
                while (true) {
                    z2 = z - 1;
                    if (z > false) {
                        break;
                    } else if (obj.equals(objArr[z2])) {
                        return true;
                    } else {
                        z = z2;
                    }
                }
            } else {
                z = this.capacity + this.stashSize;
                while (true) {
                    z2 = z - 1;
                    if (z > false) {
                        break;
                    } else if (objArr[z2] == obj) {
                        return true;
                    } else {
                        z = z2;
                    }
                }
            }
        } else {
            obj = this.keyTable;
            z = this.capacity + this.stashSize;
            while (true) {
                z2 = z - 1;
                if (z > false) {
                    break;
                } else if (obj[z2] && !objArr[z2]) {
                    return true;
                } else {
                    z = z2;
                }
            }
        }
        return null;
    }

    public boolean containsKey(K k) {
        int identityHashCode = System.identityHashCode(k);
        if (k != this.keyTable[this.mask & identityHashCode]) {
            if (k != this.keyTable[hash2(identityHashCode)]) {
                if (k != this.keyTable[hash3(identityHashCode)]) {
                    if (!this.isBigTable) {
                        return containsKeyStash(k);
                    }
                    if (k != this.keyTable[hash4(identityHashCode)]) {
                        return containsKeyStash(k);
                    }
                }
            }
        }
        return true;
    }

    private boolean containsKeyStash(K k) {
        Object[] objArr = this.keyTable;
        int i = this.capacity;
        int i2 = this.stashSize + i;
        while (i < i2) {
            if (objArr[i] == k) {
                return true;
            }
            i++;
        }
        return null;
    }

    public K findKey(Object obj, boolean z) {
        Object[] objArr = this.valueTable;
        boolean z2;
        if (obj != null) {
            if (!z) {
                z = this.capacity + this.stashSize;
                while (true) {
                    z2 = z - 1;
                    if (z > false) {
                        break;
                    } else if (obj.equals(objArr[z2])) {
                        return this.keyTable[z2];
                    } else {
                        z = z2;
                    }
                }
            } else {
                z = this.capacity + this.stashSize;
                while (true) {
                    z2 = z - 1;
                    if (z > false) {
                        break;
                    } else if (objArr[z2] == obj) {
                        return this.keyTable[z2];
                    } else {
                        z = z2;
                    }
                }
            }
        } else {
            obj = this.keyTable;
            z = this.capacity + this.stashSize;
            while (true) {
                z2 = z - 1;
                if (z > false) {
                    break;
                } else if (obj[z2] && !objArr[z2]) {
                    return obj[z2];
                } else {
                    z = z2;
                }
            }
        }
        return null;
    }

    public void ensureCapacity(int i) {
        int i2 = this.size + i;
        if (i2 >= this.threshold) {
            resize(ObjectMap.nextPowerOfTwo((int) (((float) i2) / this.loadFactor)));
        }
    }

    private void resize(int i) {
        int i2 = this.capacity + this.stashSize;
        this.capacity = i;
        this.threshold = (int) (((float) i) * this.loadFactor);
        this.mask = i - 1;
        this.hashShift = 31 - Integer.numberOfTrailingZeros(i);
        double d = (double) i;
        this.stashCapacity = Math.max(3, ((int) Math.ceil(Math.log(d))) * 2);
        this.pushIterations = Math.max(Math.min(i, 8), ((int) Math.sqrt(d)) / 8);
        int i3 = 0;
        this.isBigTable = (this.capacity >>> 16) != 0;
        Object[] objArr = this.keyTable;
        Object[] objArr2 = this.valueTable;
        this.keyTable = new Object[(this.stashCapacity + i)];
        this.valueTable = (Object[]) new Object[(i + this.stashCapacity)];
        i = this.size;
        this.size = 0;
        this.stashSize = 0;
        if (i > 0) {
            while (i3 < i2) {
                i = objArr[i3];
                if (i != 0) {
                    putResize(i, objArr2[i3]);
                }
                i3++;
            }
        }
    }

    private int hash2(int i) {
        i *= PRIME2;
        return (i ^ (i >>> this.hashShift)) & this.mask;
    }

    private int hash3(int i) {
        i *= PRIME3;
        return (i ^ (i >>> this.hashShift)) & this.mask;
    }

    private int hash4(int i) {
        i *= PRIME4;
        return (i ^ (i >>> this.hashShift)) & this.mask;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r7 = this;
        r0 = r7.size;
        if (r0 != 0) goto L_0x0007;
    L_0x0004:
        r0 = "[]";
        return r0;
    L_0x0007:
        r0 = new java.lang.StringBuilder;
        r1 = 32;
        r0.<init>(r1);
        r1 = 91;
        r0.append(r1);
        r1 = r7.keyTable;
        r2 = r7.valueTable;
        r3 = r1.length;
    L_0x0018:
        r4 = r3 + -1;
        r5 = 61;
        if (r3 <= 0) goto L_0x002f;
    L_0x001e:
        r3 = r1[r4];
        if (r3 != 0) goto L_0x0024;
    L_0x0022:
        r3 = r4;
        goto L_0x0018;
    L_0x0024:
        r0.append(r3);
        r0.append(r5);
        r3 = r2[r4];
        r0.append(r3);
    L_0x002f:
        r3 = r4 + -1;
        if (r4 <= 0) goto L_0x004a;
    L_0x0033:
        r4 = r1[r3];
        if (r4 != 0) goto L_0x0038;
    L_0x0037:
        goto L_0x0048;
    L_0x0038:
        r6 = ", ";
        r0.append(r6);
        r0.append(r4);
        r0.append(r5);
        r4 = r2[r3];
        r0.append(r4);
    L_0x0048:
        r4 = r3;
        goto L_0x002f;
    L_0x004a:
        r1 = 93;
        r0.append(r1);
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.IdentityMap.toString():java.lang.String");
    }

    public Entries<K, V> entries() {
        if (this.entries == null) {
            this.entries = new Entries(this);
        } else {
            this.entries.reset();
        }
        return this.entries;
    }

    public Values<V> values() {
        if (this.values == null) {
            this.values = new Values(this);
        } else {
            this.values.reset();
        }
        return this.values;
    }

    public Keys<K> keys() {
        if (this.keys == null) {
            this.keys = new Keys(this);
        } else {
            this.keys.reset();
        }
        return this.keys;
    }
}
