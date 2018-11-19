package com.esotericsoftware.kryo.util;

public class IdentityObjectIntMap<K> {
    private static final int PRIME2 = -1105259343;
    private static final int PRIME3 = -1262997959;
    private static final int PRIME4 = -825114047;
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
    int[] valueTable;

    public IdentityObjectIntMap() {
        this(32, 0.8f);
    }

    public IdentityObjectIntMap(int i) {
        this(i, 0.8f);
    }

    public IdentityObjectIntMap(int i, float f) {
        StringBuilder stringBuilder;
        if (i < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("initialCapacity must be >= 0: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.capacity > 1073741824) {
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
            this.valueTable = new int[this.keyTable.length];
        }
    }

    public void put(K k, int i) {
        IdentityObjectIntMap identityObjectIntMap = this;
        K k2 = k;
        if (k2 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        Object[] objArr = identityObjectIntMap.keyTable;
        int i2 = identityObjectIntMap.mask;
        boolean z = identityObjectIntMap.isBigTable;
        int identityHashCode = System.identityHashCode(k);
        i2 &= identityHashCode;
        K k3 = objArr[i2];
        if (k2 == k3) {
            identityObjectIntMap.valueTable[i2] = i;
            return;
        }
        int hash2 = hash2(identityHashCode);
        K k4 = objArr[hash2];
        if (k2 == k4) {
            identityObjectIntMap.valueTable[hash2] = i;
            return;
        }
        int hash3 = hash3(identityHashCode);
        K k5 = objArr[hash3];
        if (k2 == k5) {
            identityObjectIntMap.valueTable[hash3] = i;
            return;
        }
        K k6;
        int i3;
        if (z) {
            identityHashCode = hash4(identityHashCode);
            k6 = objArr[identityHashCode];
            if (k2 == k6) {
                identityObjectIntMap.valueTable[identityHashCode] = i;
                return;
            }
            i3 = identityHashCode;
        } else {
            k6 = null;
            i3 = -1;
        }
        identityHashCode = identityObjectIntMap.capacity;
        int i4 = identityObjectIntMap.stashSize + identityHashCode;
        while (identityHashCode < i4) {
            if (objArr[identityHashCode] == k2) {
                identityObjectIntMap.valueTable[identityHashCode] = i;
                return;
            }
            identityHashCode++;
        }
        int i5;
        if (k3 == null) {
            objArr[i2] = k2;
            identityObjectIntMap.valueTable[i2] = i;
            i5 = identityObjectIntMap.size;
            identityObjectIntMap.size = i5 + 1;
            if (i5 >= identityObjectIntMap.threshold) {
                resize(identityObjectIntMap.capacity << 1);
            }
        } else if (k4 == null) {
            objArr[hash2] = k2;
            identityObjectIntMap.valueTable[hash2] = i;
            i5 = identityObjectIntMap.size;
            identityObjectIntMap.size = i5 + 1;
            if (i5 >= identityObjectIntMap.threshold) {
                resize(identityObjectIntMap.capacity << 1);
            }
        } else if (k5 == null) {
            objArr[hash3] = k2;
            identityObjectIntMap.valueTable[hash3] = i;
            i5 = identityObjectIntMap.size;
            identityObjectIntMap.size = i5 + 1;
            if (i5 >= identityObjectIntMap.threshold) {
                resize(identityObjectIntMap.capacity << 1);
            }
        } else if (z && k6 == null) {
            objArr[i3] = k2;
            identityObjectIntMap.valueTable[i3] = i;
            i5 = identityObjectIntMap.size;
            identityObjectIntMap.size = i5 + 1;
            if (i5 >= identityObjectIntMap.threshold) {
                resize(identityObjectIntMap.capacity << 1);
            }
        } else {
            push(k2, i, i2, k3, hash2, k4, hash3, k5, i3, k6);
        }
    }

    private void putResize(K k, int i) {
        int identityHashCode = System.identityHashCode(k);
        int i2 = identityHashCode & this.mask;
        Object obj = this.keyTable[i2];
        if (obj == null) {
            this.keyTable[i2] = k;
            this.valueTable[i2] = i;
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
            this.valueTable[hash2] = i;
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
            this.valueTable[hash3] = i;
            k = this.size;
            this.size = k + 1;
            if (k >= this.threshold) {
                resize(this.capacity << 1);
            }
            return;
        }
        int i3;
        Object obj4;
        if (this.isBigTable) {
            identityHashCode = hash4(identityHashCode);
            Object obj5 = this.keyTable[identityHashCode];
            if (obj5 == null) {
                this.keyTable[identityHashCode] = k;
                this.valueTable[identityHashCode] = i;
                k = this.size;
                this.size = k + 1;
                if (k >= this.threshold) {
                    resize(this.capacity << 1);
                }
                return;
            }
            i3 = identityHashCode;
            obj4 = obj5;
        } else {
            obj4 = null;
            i3 = -1;
        }
        push(k, i, i2, obj, hash2, obj2, hash3, obj3, i3, obj4);
    }

    private void push(K k, int i, int i2, K k2, int i3, K k3, int i4, K k4, int i5, K k5) {
        Object[] objArr = this.keyTable;
        int[] iArr = this.valueTable;
        int i6 = this.mask;
        boolean z = this.isBigTable;
        int i7 = this.pushIterations;
        int i8 = z ? 4 : 3;
        Object obj = k;
        int i9 = i;
        int i10 = i2;
        K k6 = k2;
        int i11 = i3;
        K k7 = k3;
        int i12 = i4;
        K k8 = k4;
        int i13 = i5;
        K k9 = k5;
        int i14 = 0;
        while (true) {
            int i15;
            switch (ObjectMap.random.nextInt(i8)) {
                case 0:
                    i15 = iArr[i10];
                    objArr[i10] = obj;
                    iArr[i10] = i9;
                    i9 = i15;
                    obj = k6;
                    break;
                case 1:
                    i15 = iArr[i11];
                    objArr[i11] = obj;
                    iArr[i11] = i9;
                    i9 = i15;
                    obj = k7;
                    break;
                case 2:
                    i15 = iArr[i12];
                    objArr[i12] = obj;
                    iArr[i12] = i9;
                    i9 = i15;
                    obj = k8;
                    break;
                default:
                    i15 = iArr[i13];
                    objArr[i13] = obj;
                    iArr[i13] = i9;
                    i9 = i15;
                    obj = k9;
                    break;
            }
            i15 = System.identityHashCode(obj);
            i10 = i15 & i6;
            k6 = objArr[i10];
            int i16;
            if (k6 == null) {
                objArr[i10] = obj;
                iArr[i10] = i9;
                i16 = r0.size;
                r0.size = i16 + 1;
                if (i16 >= r0.threshold) {
                    resize(r0.capacity << 1);
                }
                return;
            }
            i11 = hash2(i15);
            k7 = objArr[i11];
            if (k7 == null) {
                objArr[i11] = obj;
                iArr[i11] = i9;
                i16 = r0.size;
                r0.size = i16 + 1;
                if (i16 >= r0.threshold) {
                    resize(r0.capacity << 1);
                }
                return;
            }
            i12 = hash3(i15);
            k8 = objArr[i12];
            if (k8 == null) {
                objArr[i12] = obj;
                iArr[i12] = i9;
                i16 = r0.size;
                r0.size = i16 + 1;
                if (i16 >= r0.threshold) {
                    resize(r0.capacity << 1);
                }
                return;
            }
            if (z) {
                i15 = hash4(i15);
                K k10 = objArr[i15];
                if (k10 == null) {
                    objArr[i15] = obj;
                    iArr[i15] = i9;
                    i16 = r0.size;
                    r0.size = i16 + 1;
                    if (i16 >= r0.threshold) {
                        resize(r0.capacity << 1);
                    }
                    return;
                }
                k9 = k10;
                i13 = i15;
            }
            i15 = i14 + 1;
            if (i15 == i7) {
                putStash(obj, i9);
                return;
            }
            i14 = i15;
        }
    }

    private void putStash(K k, int i) {
        if (this.stashSize == this.stashCapacity) {
            resize(this.capacity << 1);
            put(k, i);
            return;
        }
        int i2 = this.capacity + this.stashSize;
        this.keyTable[i2] = k;
        this.valueTable[i2] = i;
        this.stashSize++;
        this.size++;
    }

    public int get(K k, int i) {
        int identityHashCode = System.identityHashCode(k);
        int i2 = this.mask & identityHashCode;
        if (k != this.keyTable[i2]) {
            i2 = hash2(identityHashCode);
            if (k != this.keyTable[i2]) {
                i2 = hash3(identityHashCode);
                if (k != this.keyTable[i2]) {
                    if (!this.isBigTable) {
                        return getStash(k, i);
                    }
                    i2 = hash4(identityHashCode);
                    if (k != this.keyTable[i2]) {
                        return getStash(k, i);
                    }
                }
            }
        }
        return this.valueTable[i2];
    }

    private int getStash(K k, int i) {
        Object[] objArr = this.keyTable;
        int i2 = this.capacity;
        int i3 = this.stashSize + i2;
        while (i2 < i3) {
            if (k == objArr[i2]) {
                return this.valueTable[i2];
            }
            i2++;
        }
        return i;
    }

    public int getAndIncrement(K k, int i, int i2) {
        int identityHashCode = System.identityHashCode(k);
        int i3 = this.mask & identityHashCode;
        if (k != this.keyTable[i3]) {
            i3 = hash2(identityHashCode);
            if (k != this.keyTable[i3]) {
                i3 = hash3(identityHashCode);
                if (k != this.keyTable[i3]) {
                    if (!this.isBigTable) {
                        return getAndIncrementStash(k, i, i2);
                    }
                    i3 = hash4(identityHashCode);
                    if (k != this.keyTable[i3]) {
                        return getAndIncrementStash(k, i, i2);
                    }
                }
            }
        }
        k = this.valueTable[i3];
        this.valueTable[i3] = i2 + k;
        return k;
    }

    private int getAndIncrementStash(K k, int i, int i2) {
        Object[] objArr = this.keyTable;
        int i3 = this.capacity;
        int i4 = this.stashSize + i3;
        while (i3 < i4) {
            if (k == objArr[i3]) {
                k = this.valueTable[i3];
                this.valueTable[i3] = i2 + k;
                return k;
            }
            i3++;
        }
        put(k, i2 + i);
        return i;
    }

    public int remove(K k, int i) {
        int identityHashCode = System.identityHashCode(k);
        int i2 = this.mask & identityHashCode;
        if (k == this.keyTable[i2]) {
            this.keyTable[i2] = null;
            k = this.valueTable[i2];
            this.size--;
            return k;
        }
        i2 = hash2(identityHashCode);
        if (k == this.keyTable[i2]) {
            this.keyTable[i2] = null;
            k = this.valueTable[i2];
            this.size--;
            return k;
        }
        i2 = hash3(identityHashCode);
        if (k == this.keyTable[i2]) {
            this.keyTable[i2] = null;
            k = this.valueTable[i2];
            this.size--;
            return k;
        }
        if (this.isBigTable) {
            identityHashCode = hash4(identityHashCode);
            if (k == this.keyTable[identityHashCode]) {
                this.keyTable[identityHashCode] = null;
                k = this.valueTable[identityHashCode];
                this.size--;
                return k;
            }
        }
        return removeStash(k, i);
    }

    int removeStash(K k, int i) {
        Object[] objArr = this.keyTable;
        int i2 = this.capacity;
        int i3 = this.stashSize + i2;
        while (i2 < i3) {
            if (k == objArr[i2]) {
                k = this.valueTable[i2];
                removeStashIndex(i2);
                this.size--;
                return k;
            }
            i2++;
        }
        return i;
    }

    void removeStashIndex(int i) {
        this.stashSize--;
        int i2 = this.capacity + this.stashSize;
        if (i < i2) {
            this.keyTable[i] = this.keyTable[i2];
            this.valueTable[i] = this.valueTable[i2];
        }
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
        int i = this.capacity + this.stashSize;
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.size = 0;
                this.stashSize = 0;
                return;
            }
        }
    }

    public boolean containsValue(int i) {
        Object[] objArr = this.keyTable;
        int[] iArr = this.valueTable;
        int i2 = this.capacity + this.stashSize;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return false;
            }
            if (objArr[i3] != null && iArr[i3] == i) {
                return true;
            }
            i2 = i3;
        }
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
            if (k == objArr[i]) {
                return true;
            }
            i++;
        }
        return null;
    }

    public K findKey(int i) {
        Object[] objArr = this.keyTable;
        int[] iArr = this.valueTable;
        int i2 = this.capacity + this.stashSize;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return null;
            }
            if (objArr[i3] != null && iArr[i3] == i) {
                return objArr[i3];
            }
            i2 = i3;
        }
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
        int[] iArr = this.valueTable;
        this.keyTable = new Object[(this.stashCapacity + i)];
        this.valueTable = new int[(i + this.stashCapacity)];
        i = this.size;
        this.size = 0;
        this.stashSize = 0;
        if (i > 0) {
            while (i3 < i2) {
                i = objArr[i3];
                if (i != 0) {
                    putResize(i, iArr[i3]);
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
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.IdentityObjectIntMap.toString():java.lang.String");
    }
}
