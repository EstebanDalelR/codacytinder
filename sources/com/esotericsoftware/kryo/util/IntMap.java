package com.esotericsoftware.kryo.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntMap<V> {
    private static final int EMPTY = 0;
    private static final int PRIME2 = -1105259343;
    private static final int PRIME3 = -1262997959;
    private static final int PRIME4 = -825114047;
    int capacity;
    boolean hasZeroValue;
    private int hashShift;
    private boolean isBigTable;
    int[] keyTable;
    private float loadFactor;
    private int mask;
    private int pushIterations;
    public int size;
    private int stashCapacity;
    int stashSize;
    private int threshold;
    V[] valueTable;
    V zeroValue;

    public static class Entry<V> {
        public int key;
        public V value;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.key);
            stringBuilder.append("=");
            stringBuilder.append(this.value);
            return stringBuilder.toString();
        }
    }

    private static class MapIterator<V> {
        static final int INDEX_ILLEGAL = -2;
        static final int INDEX_ZERO = -1;
        int currentIndex;
        public boolean hasNext;
        final IntMap<V> map;
        int nextIndex;

        public MapIterator(IntMap<V> intMap) {
            this.map = intMap;
            reset();
        }

        public void reset() {
            this.currentIndex = -2;
            this.nextIndex = -1;
            if (this.map.hasZeroValue) {
                this.hasNext = true;
            } else {
                findNextIndex();
            }
        }

        void findNextIndex() {
            this.hasNext = false;
            int[] iArr = this.map.keyTable;
            int i = this.map.capacity + this.map.stashSize;
            do {
                int i2 = this.nextIndex + 1;
                this.nextIndex = i2;
                if (i2 >= i) {
                    return;
                }
            } while (iArr[this.nextIndex] == 0);
            this.hasNext = true;
        }

        public void remove() {
            if (this.currentIndex == -1 && this.map.hasZeroValue) {
                this.map.zeroValue = null;
                this.map.hasZeroValue = false;
            } else if (this.currentIndex < 0) {
                throw new IllegalStateException("next must be called before remove.");
            } else if (this.currentIndex >= this.map.capacity) {
                this.map.removeStashIndex(this.currentIndex);
                this.nextIndex = this.currentIndex - 1;
                findNextIndex();
            } else {
                this.map.keyTable[this.currentIndex] = 0;
                this.map.valueTable[this.currentIndex] = null;
            }
            this.currentIndex = -2;
            IntMap intMap = this.map;
            intMap.size--;
        }
    }

    public static class Entries<V> extends MapIterator<V> implements Iterable<Entry<V>>, Iterator<Entry<V>> {
        private Entry<V> entry = new Entry();

        public Iterator<Entry<V>> iterator() {
            return this;
        }

        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public Entries(IntMap intMap) {
            super(intMap);
        }

        public Entry<V> next() {
            if (this.hasNext) {
                int[] iArr = this.map.keyTable;
                if (this.nextIndex == -1) {
                    this.entry.key = 0;
                    this.entry.value = this.map.zeroValue;
                } else {
                    this.entry.key = iArr[this.nextIndex];
                    this.entry.value = this.map.valueTable[this.nextIndex];
                }
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

    public static class Keys extends MapIterator {
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public Keys(IntMap intMap) {
            super(intMap);
        }

        public int next() {
            if (this.hasNext) {
                int i = this.nextIndex == -1 ? 0 : this.map.keyTable[this.nextIndex];
                this.currentIndex = this.nextIndex;
                findNextIndex();
                return i;
            }
            throw new NoSuchElementException();
        }

        public IntArray toArray() {
            IntArray intArray = new IntArray(true, this.map.size);
            while (this.hasNext) {
                intArray.add(next());
            }
            return intArray;
        }
    }

    public static class Values<V> extends MapIterator<V> implements Iterable<V>, Iterator<V> {
        public Iterator<V> iterator() {
            return this;
        }

        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public Values(IntMap<V> intMap) {
            super(intMap);
        }

        public boolean hasNext() {
            return this.hasNext;
        }

        public V next() {
            if (this.hasNext) {
                V v;
                if (this.nextIndex == -1) {
                    v = this.map.zeroValue;
                } else {
                    v = this.map.valueTable[this.nextIndex];
                }
                this.currentIndex = this.nextIndex;
                findNextIndex();
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
    }

    public IntMap() {
        this(32, 0.8f);
    }

    public IntMap(int i) {
        this(i, 0.8f);
    }

    public IntMap(int i, float f) {
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
            this.keyTable = new int[(this.capacity + this.stashCapacity)];
            this.valueTable = (Object[]) new Object[this.keyTable.length];
        }
    }

    public IntMap(IntMap<? extends V> intMap) {
        this(intMap.capacity, intMap.loadFactor);
        this.stashSize = intMap.stashSize;
        System.arraycopy(intMap.keyTable, 0, this.keyTable, 0, intMap.keyTable.length);
        System.arraycopy(intMap.valueTable, 0, this.valueTable, 0, intMap.valueTable.length);
        this.size = intMap.size;
        this.zeroValue = intMap.zeroValue;
        this.hasZeroValue = intMap.hasZeroValue;
    }

    public V put(int i, V v) {
        IntMap intMap = this;
        int i2 = i;
        V v2 = v;
        if (i2 == 0) {
            V v3 = intMap.zeroValue;
            intMap.zeroValue = v2;
            if (!intMap.hasZeroValue) {
                intMap.hasZeroValue = true;
                intMap.size++;
            }
            return v3;
        }
        int[] iArr = intMap.keyTable;
        int i3 = intMap.mask;
        boolean z = intMap.isBigTable;
        i3 &= i2;
        int i4 = iArr[i3];
        if (i4 == i2) {
            V v4 = intMap.valueTable[i3];
            intMap.valueTable[i3] = v2;
            return v4;
        }
        int hash2 = hash2(i);
        int i5 = iArr[hash2];
        if (i5 == i2) {
            v4 = intMap.valueTable[hash2];
            intMap.valueTable[hash2] = v2;
            return v4;
        }
        int hash3 = hash3(i);
        int i6 = iArr[hash3];
        if (i6 == i2) {
            v4 = intMap.valueTable[hash3];
            intMap.valueTable[hash3] = v2;
            return v4;
        }
        int i7;
        int i8 = -1;
        if (z) {
            i8 = hash4(i);
            i7 = iArr[i8];
            if (i7 == i2) {
                v4 = intMap.valueTable[i8];
                intMap.valueTable[i8] = v2;
                return v4;
            }
            int i9 = i7;
            i7 = i8;
            i8 = i9;
        } else {
            i7 = -1;
        }
        int i10 = intMap.capacity;
        int i11 = intMap.stashSize + i10;
        while (i10 < i11) {
            if (iArr[i10] == i2) {
                v4 = intMap.valueTable[i10];
                intMap.valueTable[i10] = v2;
                return v4;
            }
            i10++;
        }
        int i12;
        if (i4 == 0) {
            iArr[i3] = i2;
            intMap.valueTable[i3] = v2;
            i12 = intMap.size;
            intMap.size = i12 + 1;
            if (i12 >= intMap.threshold) {
                resize(intMap.capacity << 1);
            }
            return null;
        } else if (i5 == 0) {
            iArr[hash2] = i2;
            intMap.valueTable[hash2] = v2;
            i12 = intMap.size;
            intMap.size = i12 + 1;
            if (i12 >= intMap.threshold) {
                resize(intMap.capacity << 1);
            }
            return null;
        } else if (i6 == 0) {
            iArr[hash3] = i2;
            intMap.valueTable[hash3] = v2;
            i12 = intMap.size;
            intMap.size = i12 + 1;
            if (i12 >= intMap.threshold) {
                resize(intMap.capacity << 1);
            }
            return null;
        } else if (z && i8 == 0) {
            iArr[i7] = i2;
            intMap.valueTable[i7] = v2;
            i12 = intMap.size;
            intMap.size = i12 + 1;
            if (i12 >= intMap.threshold) {
                resize(intMap.capacity << 1);
            }
            return null;
        } else {
            push(i2, v2, i3, i4, hash2, i5, hash3, i6, i7, i8);
            return null;
        }
    }

    public void putAll(IntMap<V> intMap) {
        intMap = intMap.entries().iterator();
        while (intMap.hasNext()) {
            Entry entry = (Entry) intMap.next();
            put(entry.key, entry.value);
        }
    }

    private void putResize(int i, V v) {
        if (i == 0) {
            this.zeroValue = v;
            this.hasZeroValue = true;
            return;
        }
        int i2 = i & this.mask;
        int i3 = this.keyTable[i2];
        V v2;
        if (i3 == 0) {
            this.keyTable[i2] = i;
            this.valueTable[i2] = v;
            v2 = this.size;
            this.size = v2 + 1;
            if (v2 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return;
        }
        int hash2 = hash2(i);
        int i4 = this.keyTable[hash2];
        if (i4 == 0) {
            this.keyTable[hash2] = i;
            this.valueTable[hash2] = v;
            v2 = this.size;
            this.size = v2 + 1;
            if (v2 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return;
        }
        int hash3 = hash3(i);
        int i5 = this.keyTable[hash3];
        if (i5 == 0) {
            this.keyTable[hash3] = i;
            this.valueTable[hash3] = v;
            v2 = this.size;
            this.size = v2 + 1;
            if (v2 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return;
        }
        int i6;
        int i7;
        if (this.isBigTable) {
            int hash4 = hash4(i);
            int i8 = this.keyTable[hash4];
            if (i8 == 0) {
                this.keyTable[hash4] = i;
                this.valueTable[hash4] = v;
                v2 = this.size;
                this.size = v2 + 1;
                if (v2 >= this.threshold) {
                    resize(this.capacity << 1);
                }
                return;
            }
            i6 = hash4;
            i7 = i8;
        } else {
            i6 = -1;
            i7 = -1;
        }
        push(i, v, i2, i3, hash2, i4, hash3, i5, i6, i7);
    }

    private void push(int i, V v, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int[] iArr = this.keyTable;
        Object[] objArr = this.valueTable;
        int i10 = this.mask;
        boolean z = this.isBigTable;
        int i11 = this.pushIterations;
        int i12 = z ? 4 : 3;
        int i13 = i;
        Object obj = v;
        int i14 = i2;
        int i15 = i3;
        int i16 = i4;
        int i17 = i5;
        int i18 = i6;
        int i19 = i7;
        int i20 = i8;
        int i21 = i9;
        int i22 = 0;
        while (true) {
            Object obj2;
            switch (ObjectMap.random.nextInt(i12)) {
                case 0:
                    obj2 = objArr[i14];
                    iArr[i14] = i13;
                    objArr[i14] = obj;
                    obj = obj2;
                    i13 = i15;
                    break;
                case 1:
                    obj2 = objArr[i16];
                    iArr[i16] = i13;
                    objArr[i16] = obj;
                    obj = obj2;
                    i13 = i17;
                    break;
                case 2:
                    obj2 = objArr[i18];
                    iArr[i18] = i13;
                    objArr[i18] = obj;
                    obj = obj2;
                    i13 = i19;
                    break;
                default:
                    obj2 = objArr[i20];
                    iArr[i20] = i13;
                    objArr[i20] = obj;
                    obj = obj2;
                    i13 = i21;
                    break;
            }
            i14 = i13 & i10;
            i15 = iArr[i14];
            int i23;
            if (i15 == 0) {
                iArr[i14] = i13;
                objArr[i14] = obj;
                i23 = r0.size;
                r0.size = i23 + 1;
                if (i23 >= r0.threshold) {
                    resize(r0.capacity << 1);
                }
                return;
            }
            i16 = hash2(i13);
            i17 = iArr[i16];
            if (i17 == 0) {
                iArr[i16] = i13;
                objArr[i16] = obj;
                i23 = r0.size;
                r0.size = i23 + 1;
                if (i23 >= r0.threshold) {
                    resize(r0.capacity << 1);
                }
                return;
            }
            i18 = hash3(i13);
            i19 = iArr[i18];
            if (i19 == 0) {
                iArr[i18] = i13;
                objArr[i18] = obj;
                i23 = r0.size;
                r0.size = i23 + 1;
                if (i23 >= r0.threshold) {
                    resize(r0.capacity << 1);
                }
                return;
            }
            int hash4;
            if (z) {
                hash4 = hash4(i13);
                i20 = iArr[hash4];
                if (i20 == 0) {
                    iArr[hash4] = i13;
                    objArr[hash4] = obj;
                    i23 = r0.size;
                    r0.size = i23 + 1;
                    if (i23 >= r0.threshold) {
                        resize(r0.capacity << 1);
                    }
                    return;
                }
                i21 = i20;
                i20 = hash4;
            }
            hash4 = i22 + 1;
            if (hash4 == i11) {
                putStash(i13, obj);
                return;
            }
            i22 = hash4;
        }
    }

    private void putStash(int i, V v) {
        if (this.stashSize == this.stashCapacity) {
            resize(this.capacity << 1);
            put(i, v);
            return;
        }
        int i2 = this.capacity + this.stashSize;
        this.keyTable[i2] = i;
        this.valueTable[i2] = v;
        this.stashSize++;
        this.size++;
    }

    public V get(int i) {
        if (i != 0) {
            int i2 = this.mask & i;
            if (this.keyTable[i2] != i) {
                i2 = hash2(i);
                if (this.keyTable[i2] != i) {
                    i2 = hash3(i);
                    if (this.keyTable[i2] != i) {
                        if (!this.isBigTable) {
                            return getStash(i, null);
                        }
                        i2 = hash4(i);
                        if (this.keyTable[i2] != i) {
                            return getStash(i, null);
                        }
                    }
                }
            }
            return this.valueTable[i2];
        } else if (this.hasZeroValue == 0) {
            return null;
        } else {
            return this.zeroValue;
        }
    }

    public V get(int i, V v) {
        if (i != 0) {
            int i2 = this.mask & i;
            if (this.keyTable[i2] != i) {
                i2 = hash2(i);
                if (this.keyTable[i2] != i) {
                    i2 = hash3(i);
                    if (this.keyTable[i2] != i) {
                        if (!this.isBigTable) {
                            return getStash(i, v);
                        }
                        i2 = hash4(i);
                        if (this.keyTable[i2] != i) {
                            return getStash(i, v);
                        }
                    }
                }
            }
            return this.valueTable[i2];
        } else if (this.hasZeroValue == 0) {
            return v;
        } else {
            return this.zeroValue;
        }
    }

    private V getStash(int i, V v) {
        int[] iArr = this.keyTable;
        int i2 = this.capacity;
        int i3 = this.stashSize + i2;
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return this.valueTable[i2];
            }
            i2++;
        }
        return v;
    }

    public V remove(int i) {
        if (i != 0) {
            int i2 = this.mask & i;
            if (this.keyTable[i2] == i) {
                this.keyTable[i2] = null;
                i = this.valueTable[i2];
                this.valueTable[i2] = null;
                this.size--;
                return i;
            }
            i2 = hash2(i);
            if (this.keyTable[i2] == i) {
                this.keyTable[i2] = null;
                i = this.valueTable[i2];
                this.valueTable[i2] = null;
                this.size--;
                return i;
            }
            i2 = hash3(i);
            if (this.keyTable[i2] == i) {
                this.keyTable[i2] = null;
                i = this.valueTable[i2];
                this.valueTable[i2] = null;
                this.size--;
                return i;
            }
            if (this.isBigTable) {
                i2 = hash4(i);
                if (this.keyTable[i2] == i) {
                    this.keyTable[i2] = null;
                    i = this.valueTable[i2];
                    this.valueTable[i2] = null;
                    this.size--;
                    return i;
                }
            }
            return removeStash(i);
        } else if (this.hasZeroValue == 0) {
            return null;
        } else {
            i = this.zeroValue;
            this.zeroValue = null;
            this.hasZeroValue = false;
            this.size--;
            return i;
        }
    }

    V removeStash(int i) {
        int[] iArr = this.keyTable;
        int i2 = this.capacity;
        int i3 = this.stashSize + i2;
        while (i2 < i3) {
            if (iArr[i2] == i) {
                i = this.valueTable[i2];
                removeStashIndex(i2);
                this.size--;
                return i;
            }
            i2++;
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
        this.zeroValue = null;
        this.hasZeroValue = false;
        this.size = 0;
        resize(i);
    }

    public void clear() {
        int[] iArr = this.keyTable;
        Object[] objArr = this.valueTable;
        int i = this.capacity + this.stashSize;
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                iArr[i2] = 0;
                objArr[i2] = null;
                i = i2;
            } else {
                this.size = 0;
                this.stashSize = 0;
                this.zeroValue = null;
                this.hasZeroValue = false;
                return;
            }
        }
    }

    public boolean containsValue(Object obj, boolean z) {
        Object[] objArr = this.valueTable;
        boolean z2;
        if (obj == null) {
            if (this.hasZeroValue == null || this.zeroValue != null) {
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
            } else {
                return true;
            }
        } else if (z) {
            if (obj != this.zeroValue) {
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
            } else {
                return true;
            }
        } else if (!this.hasZeroValue || !obj.equals(this.zeroValue)) {
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
            return true;
        }
        return null;
    }

    public boolean containsKey(int i) {
        if (i == 0) {
            return this.hasZeroValue;
        }
        if (this.keyTable[this.mask & i] != i) {
            if (this.keyTable[hash2(i)] != i) {
                if (this.keyTable[hash3(i)] != i) {
                    if (!this.isBigTable) {
                        return containsKeyStash(i);
                    }
                    if (this.keyTable[hash4(i)] != i) {
                        return containsKeyStash(i);
                    }
                }
            }
        }
        return true;
    }

    private boolean containsKeyStash(int i) {
        int[] iArr = this.keyTable;
        int i2 = this.capacity;
        int i3 = this.stashSize + i2;
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public int findKey(Object obj, boolean z, int i) {
        Object[] objArr = this.valueTable;
        boolean z2;
        if (obj == null) {
            if (this.hasZeroValue == null || this.zeroValue != null) {
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
            } else {
                return 0;
            }
        } else if (z) {
            if (obj != this.zeroValue) {
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
            } else {
                return 0;
            }
        } else if (!this.hasZeroValue || !obj.equals(this.zeroValue)) {
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
            return 0;
        }
        return i;
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
        int[] iArr = this.keyTable;
        Object[] objArr = this.valueTable;
        this.keyTable = new int[(this.stashCapacity + i)];
        this.valueTable = (Object[]) new Object[(i + this.stashCapacity)];
        i = this.size;
        this.size = this.hasZeroValue;
        this.stashSize = 0;
        if (i > 0) {
            while (i3 < i2) {
                i = iArr[i3];
                if (i != 0) {
                    putResize(i, objArr[i3]);
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

    public java.lang.String toString() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
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
        r4 = r7.hasZeroValue;
        r5 = 61;
        if (r4 == 0) goto L_0x0029;
    L_0x001e:
        r4 = "0=";
        r0.append(r4);
        r4 = r7.zeroValue;
        r0.append(r4);
        goto L_0x003f;
    L_0x0029:
        r4 = r3 + -1;
        if (r3 <= 0) goto L_0x003e;
    L_0x002d:
        r3 = r1[r4];
        if (r3 != 0) goto L_0x0033;
    L_0x0031:
        r3 = r4;
        goto L_0x0029;
    L_0x0033:
        r0.append(r3);
        r0.append(r5);
        r3 = r2[r4];
        r0.append(r3);
    L_0x003e:
        r3 = r4;
    L_0x003f:
        r4 = r3 + -1;
        if (r3 <= 0) goto L_0x0059;
    L_0x0043:
        r3 = r1[r4];
        if (r3 != 0) goto L_0x0048;
    L_0x0047:
        goto L_0x003e;
    L_0x0048:
        r6 = ", ";
        r0.append(r6);
        r0.append(r3);
        r0.append(r5);
        r3 = r2[r4];
        r0.append(r3);
        goto L_0x003e;
    L_0x0059:
        r1 = 93;
        r0.append(r1);
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.IntMap.toString():java.lang.String");
    }

    public Entries<V> entries() {
        return new Entries(this);
    }

    public Values<V> values() {
        return new Values(this);
    }

    public Keys keys() {
        return new Keys(this);
    }
}
