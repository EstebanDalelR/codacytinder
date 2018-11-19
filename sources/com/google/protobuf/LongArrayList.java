package com.google.protobuf;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.protobuf.Internal.LongList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class LongArrayList extends AbstractProtobufList<Long> implements LongList, PrimitiveNonBoxingCollection, RandomAccess {
    private static final LongArrayList EMPTY_LIST = new LongArrayList();
    private long[] array;
    private int size;

    static {
        EMPTY_LIST.makeImmutable();
    }

    public static LongArrayList emptyList() {
        return EMPTY_LIST;
    }

    LongArrayList() {
        this(new long[10], 0);
    }

    private LongArrayList(long[] jArr, int i) {
        this.array = jArr;
        this.size = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.size != longArrayList.size) {
            return false;
        }
        obj = longArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Internal.hashLong(this.array[i2]);
        }
        return i;
    }

    public LongList mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new LongArrayList(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    public long getLong(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    public int size() {
        return this.size;
    }

    public Long set(int i, Long l) {
        return Long.valueOf(setLong(i, l.longValue()));
    }

    public long setLong(int i, long j) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long j2 = this.array[i];
        this.array[i] = j;
        return j2;
    }

    public void add(int i, Long l) {
        addLong(i, l.longValue());
    }

    public void addLong(long j) {
        addLong(this.size, j);
    }

    private void addLong(int i, long j) {
        ensureIsMutable();
        if (i >= 0) {
            if (i <= this.size) {
                if (this.size < this.array.length) {
                    System.arraycopy(this.array, i, this.array, i + 1, this.size - i);
                } else {
                    Object obj = new long[(((this.size * 3) / 2) + 1)];
                    System.arraycopy(this.array, 0, obj, 0, i);
                    System.arraycopy(this.array, i, obj, i + 1, this.size - i);
                    this.array = obj;
                }
                this.array[i] = j;
                this.size++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }

    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        if (longArrayList.size == 0) {
            return false;
        }
        if (ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.size < longArrayList.size) {
            throw new OutOfMemoryError();
        }
        int i = this.size + longArrayList.size;
        if (i > this.array.length) {
            this.array = Arrays.copyOf(this.array, i);
        }
        System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
        this.size = i;
        this.modCount += 1;
        return true;
    }

    public boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.array[i]))) {
                System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
                this.size -= 1;
                this.modCount += 1;
                return true;
            }
        }
        return false;
    }

    public Long remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long j = this.array[i];
        System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
        this.size--;
        this.modCount++;
        return Long.valueOf(j);
    }

    private void ensureIndexInRange(int i) {
        if (i >= 0) {
            if (i < this.size) {
                return;
            }
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(this.size);
        return stringBuilder.toString();
    }
}
