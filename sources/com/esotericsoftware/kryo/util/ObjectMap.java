package com.esotericsoftware.kryo.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class ObjectMap<K, V> {
    private static final int PRIME2 = -1105259343;
    private static final int PRIME3 = -1262997959;
    private static final int PRIME4 = -825114047;
    static Random random = new Random();
    int capacity;
    private int hashShift;
    private boolean isBigTable;
    K[] keyTable;
    private float loadFactor;
    private int mask;
    private int pushIterations;
    public int size;
    private int stashCapacity;
    int stashSize;
    private int threshold;
    V[] valueTable;

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
        final ObjectMap<K, V> map;
        int nextIndex;

        public MapIterator(ObjectMap<K, V> objectMap) {
            this.map = objectMap;
            reset();
        }

        public void reset() {
            this.currentIndex = -1;
            this.nextIndex = -1;
            advance();
        }

        void advance() {
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
                advance();
            } else {
                this.map.keyTable[this.currentIndex] = null;
                this.map.valueTable[this.currentIndex] = null;
            }
            this.currentIndex = -1;
            ObjectMap objectMap = this.map;
            objectMap.size--;
        }
    }

    public static class Entries<K, V> extends MapIterator<K, V> implements Iterable<Entry<K, V>>, Iterator<Entry<K, V>> {
        Entry<K, V> entry = new Entry();

        public Iterator<Entry<K, V>> iterator() {
            return this;
        }

        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public Entries(ObjectMap<K, V> objectMap) {
            super(objectMap);
        }

        public Entry<K, V> next() {
            if (this.hasNext) {
                Object[] objArr = this.map.keyTable;
                this.entry.key = objArr[this.nextIndex];
                this.entry.value = this.map.valueTable[this.nextIndex];
                this.currentIndex = this.nextIndex;
                advance();
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

        public Keys(ObjectMap<K, ?> objectMap) {
            super(objectMap);
        }

        public boolean hasNext() {
            return this.hasNext;
        }

        public K next() {
            if (this.hasNext) {
                K k = this.map.keyTable[this.nextIndex];
                this.currentIndex = this.nextIndex;
                advance();
                return k;
            }
            throw new NoSuchElementException();
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

        public Values(ObjectMap<?, V> objectMap) {
            super(objectMap);
        }

        public boolean hasNext() {
            return this.hasNext;
        }

        public V next() {
            if (this.hasNext) {
                V v = this.map.valueTable[this.nextIndex];
                this.currentIndex = this.nextIndex;
                advance();
                return v;
            }
            throw new NoSuchElementException();
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

    public static int nextPowerOfTwo(int i) {
        if (i == 0) {
            return 1;
        }
        i--;
        i |= i >> 1;
        i |= i >> 2;
        i |= i >> 4;
        i |= i >> 8;
        return (i | (i >> 16)) + 1;
    }

    public ObjectMap() {
        this(32, 0.8f);
    }

    public ObjectMap(int i) {
        this(i, 0.8f);
    }

    public ObjectMap(int i, float f) {
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
            this.capacity = nextPowerOfTwo(i);
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

    public ObjectMap(ObjectMap<? extends K, ? extends V> objectMap) {
        this(objectMap.capacity, objectMap.loadFactor);
        this.stashSize = objectMap.stashSize;
        System.arraycopy(objectMap.keyTable, 0, this.keyTable, 0, objectMap.keyTable.length);
        System.arraycopy(objectMap.valueTable, 0, this.valueTable, 0, objectMap.valueTable.length);
        this.size = objectMap.size;
    }

    public V put(K k, V v) {
        if (k != null) {
            return put_internal(k, v);
        }
        throw new IllegalArgumentException("key cannot be null.");
    }

    private V put_internal(K k, V v) {
        K k2 = k;
        Object[] objArr = this.keyTable;
        int i = this.mask;
        boolean z = this.isBigTable;
        int hashCode = k.hashCode();
        i &= hashCode;
        Object obj = objArr[i];
        if (k2.equals(obj)) {
            V v2 = r11.valueTable[i];
            r11.valueTable[i] = v;
            return v2;
        }
        int hash2 = hash2(hashCode);
        Object obj2 = objArr[hash2];
        if (k2.equals(obj2)) {
            v2 = r11.valueTable[hash2];
            r11.valueTable[hash2] = v;
            return v2;
        }
        int hash3 = hash3(hashCode);
        Object obj3 = objArr[hash3];
        if (k2.equals(obj3)) {
            v2 = r11.valueTable[hash3];
            r11.valueTable[hash3] = v;
            return v2;
        }
        Object obj4;
        int i2;
        if (z) {
            hashCode = hash4(hashCode);
            obj4 = objArr[hashCode];
            if (k2.equals(obj4)) {
                v2 = r11.valueTable[hashCode];
                r11.valueTable[hashCode] = v;
                return v2;
            }
            i2 = hashCode;
        } else {
            obj4 = null;
            i2 = -1;
        }
        hashCode = r11.capacity;
        int i3 = r11.stashSize + hashCode;
        while (hashCode < i3) {
            if (k2.equals(objArr[hashCode])) {
                v2 = r11.valueTable[hashCode];
                r11.valueTable[hashCode] = v;
                return v2;
            }
            hashCode++;
        }
        int i4;
        if (obj == null) {
            objArr[i] = k2;
            r11.valueTable[i] = v;
            i4 = r11.size;
            r11.size = i4 + 1;
            if (i4 >= r11.threshold) {
                resize(r11.capacity << 1);
            }
            return null;
        } else if (obj2 == null) {
            objArr[hash2] = k2;
            r11.valueTable[hash2] = v;
            i4 = r11.size;
            r11.size = i4 + 1;
            if (i4 >= r11.threshold) {
                resize(r11.capacity << 1);
            }
            return null;
        } else if (obj3 == null) {
            objArr[hash3] = k2;
            r11.valueTable[hash3] = v;
            i4 = r11.size;
            r11.size = i4 + 1;
            if (i4 >= r11.threshold) {
                resize(r11.capacity << 1);
            }
            return null;
        } else if (z && obj4 == null) {
            objArr[i2] = k2;
            r11.valueTable[i2] = v;
            i4 = r11.size;
            r11.size = i4 + 1;
            if (i4 >= r11.threshold) {
                resize(r11.capacity << 1);
            }
            return null;
        } else {
            push(k2, v, i, obj, hash2, obj2, hash3, obj3, i2, obj4);
            return null;
        }
    }

    public void putAll(ObjectMap<K, V> objectMap) {
        ensureCapacity(objectMap.size);
        objectMap = objectMap.entries().iterator();
        while (objectMap.hasNext()) {
            Entry entry = (Entry) objectMap.next();
            put(entry.key, entry.value);
        }
    }

    private void putResize(K k, V v) {
        int hashCode = k.hashCode();
        int i = hashCode & this.mask;
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
        int hash2 = hash2(hashCode);
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
        int hash3 = hash3(hashCode);
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
            hashCode = hash4(hashCode);
            Object obj5 = this.keyTable[hashCode];
            if (obj5 == null) {
                this.keyTable[hashCode] = k;
                this.valueTable[hashCode] = v;
                k = this.size;
                this.size = k + 1;
                if (k >= this.threshold) {
                    resize(this.capacity << 1);
                }
                return;
            }
            i2 = hashCode;
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
            switch (random.nextInt(i7)) {
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
            int hashCode = obj.hashCode();
            i8 = hashCode & i5;
            k6 = objArr[i8];
            if (k6 == null) {
                int i13;
                objArr[i8] = obj;
                objArr2[i8] = obj2;
                i13 = r0.size;
                r0.size = i13 + 1;
                if (i13 >= r0.threshold) {
                    resize(r0.capacity << 1);
                }
                return;
            }
            i9 = hash2(hashCode);
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
            i10 = hash3(hashCode);
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
                hashCode = hash4(hashCode);
                K k10 = objArr[hashCode];
                if (k10 == null) {
                    objArr[hashCode] = obj;
                    objArr2[hashCode] = obj2;
                    i13 = r0.size;
                    r0.size = i13 + 1;
                    if (i13 >= r0.threshold) {
                        resize(r0.capacity << 1);
                    }
                    return;
                }
                k9 = k10;
                i11 = hashCode;
            }
            hashCode = i12 + 1;
            if (hashCode == i6) {
                putStash(obj, obj2);
                return;
            }
            i12 = hashCode;
        }
    }

    private void putStash(K k, V v) {
        if (this.stashSize == this.stashCapacity) {
            resize(this.capacity << 1);
            put_internal(k, v);
            return;
        }
        int i = this.capacity + this.stashSize;
        this.keyTable[i] = k;
        this.valueTable[i] = v;
        this.stashSize++;
        this.size++;
    }

    public V get(K k) {
        int hashCode = k.hashCode();
        int i = this.mask & hashCode;
        if (!k.equals(this.keyTable[i])) {
            i = hash2(hashCode);
            if (!k.equals(this.keyTable[i])) {
                i = hash3(hashCode);
                if (!k.equals(this.keyTable[i])) {
                    if (!this.isBigTable) {
                        return getStash(k);
                    }
                    i = hash4(hashCode);
                    if (!k.equals(this.keyTable[i])) {
                        return getStash(k);
                    }
                }
            }
        }
        return this.valueTable[i];
    }

    private V getStash(K k) {
        Object[] objArr = this.keyTable;
        int i = this.capacity;
        int i2 = this.stashSize + i;
        while (i < i2) {
            if (k.equals(objArr[i])) {
                return this.valueTable[i];
            }
            i++;
        }
        return null;
    }

    public V get(K k, V v) {
        int hashCode = k.hashCode();
        int i = this.mask & hashCode;
        if (!k.equals(this.keyTable[i])) {
            i = hash2(hashCode);
            if (!k.equals(this.keyTable[i])) {
                i = hash3(hashCode);
                if (!k.equals(this.keyTable[i])) {
                    if (!this.isBigTable) {
                        return getStash(k, v);
                    }
                    i = hash4(hashCode);
                    if (!k.equals(this.keyTable[i])) {
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
            if (k.equals(objArr[i])) {
                return this.valueTable[i];
            }
            i++;
        }
        return v;
    }

    public V remove(K k) {
        int hashCode = k.hashCode();
        int i = this.mask & hashCode;
        if (k.equals(this.keyTable[i])) {
            this.keyTable[i] = null;
            k = this.valueTable[i];
            this.valueTable[i] = null;
            this.size--;
            return k;
        }
        i = hash2(hashCode);
        if (k.equals(this.keyTable[i])) {
            this.keyTable[i] = null;
            k = this.valueTable[i];
            this.valueTable[i] = null;
            this.size--;
            return k;
        }
        i = hash3(hashCode);
        if (k.equals(this.keyTable[i])) {
            this.keyTable[i] = null;
            k = this.valueTable[i];
            this.valueTable[i] = null;
            this.size--;
            return k;
        }
        if (this.isBigTable) {
            hashCode = hash4(hashCode);
            if (k.equals(this.keyTable[hashCode])) {
                this.keyTable[hashCode] = null;
                k = this.valueTable[hashCode];
                this.valueTable[hashCode] = null;
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
            if (k.equals(objArr[i])) {
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
            resize(nextPowerOfTwo(i));
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
        int hashCode = k.hashCode();
        if (!k.equals(this.keyTable[this.mask & hashCode])) {
            if (!k.equals(this.keyTable[hash2(hashCode)])) {
                if (!k.equals(this.keyTable[hash3(hashCode)])) {
                    if (!this.isBigTable) {
                        return containsKeyStash(k);
                    }
                    if (!k.equals(this.keyTable[hash4(hashCode)])) {
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
            if (k.equals(objArr[i])) {
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
            resize(nextPowerOfTwo((int) (((float) i2) / this.loadFactor)));
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
        r0 = "{}";
        return r0;
    L_0x0007:
        r0 = new java.lang.StringBuilder;
        r1 = 32;
        r0.<init>(r1);
        r1 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
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
        r1 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r0.append(r1);
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.ObjectMap.toString():java.lang.String");
    }

    public Entries<K, V> entries() {
        return new Entries(this);
    }

    public Values<V> values() {
        return new Values(this);
    }

    public Keys<K> keys() {
        return new Keys(this);
    }
}
