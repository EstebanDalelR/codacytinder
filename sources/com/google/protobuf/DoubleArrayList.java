package com.google.protobuf;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.protobuf.Internal.DoubleList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class DoubleArrayList extends AbstractProtobufList<Double> implements DoubleList, PrimitiveNonBoxingCollection, RandomAccess {
    private static final DoubleArrayList EMPTY_LIST = new DoubleArrayList();
    private double[] array;
    private int size;

    static {
        EMPTY_LIST.makeImmutable();
    }

    public static DoubleArrayList emptyList() {
        return EMPTY_LIST;
    }

    DoubleArrayList() {
        this(new double[10], 0);
    }

    private DoubleArrayList(double[] dArr, int i) {
        this.array = dArr;
        this.size = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.size != doubleArrayList.size) {
            return false;
        }
        obj = doubleArrayList.array;
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
            i = (i * 31) + Internal.hashLong(Double.doubleToLongBits(this.array[i2]));
        }
        return i;
    }

    public DoubleList mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new DoubleArrayList(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    public double getDouble(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    public int size() {
        return this.size;
    }

    public Double set(int i, Double d) {
        return Double.valueOf(setDouble(i, d.doubleValue()));
    }

    public double setDouble(int i, double d) {
        ensureIsMutable();
        ensureIndexInRange(i);
        double d2 = this.array[i];
        this.array[i] = d;
        return d2;
    }

    public void add(int i, Double d) {
        addDouble(i, d.doubleValue());
    }

    public void addDouble(double d) {
        addDouble(this.size, d);
    }

    private void addDouble(int i, double d) {
        ensureIsMutable();
        if (i >= 0) {
            if (i <= this.size) {
                if (this.size < this.array.length) {
                    System.arraycopy(this.array, i, this.array, i + 1, this.size - i);
                } else {
                    Object obj = new double[(((this.size * 3) / 2) + 1)];
                    System.arraycopy(this.array, 0, obj, 0, i);
                    System.arraycopy(this.array, i, obj, i + 1, this.size - i);
                    this.array = obj;
                }
                this.array[i] = d;
                this.size++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }

    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        if (doubleArrayList.size == 0) {
            return false;
        }
        if (ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.size < doubleArrayList.size) {
            throw new OutOfMemoryError();
        }
        int i = this.size + doubleArrayList.size;
        if (i > this.array.length) {
            this.array = Arrays.copyOf(this.array, i);
        }
        System.arraycopy(doubleArrayList.array, 0, this.array, this.size, doubleArrayList.size);
        this.size = i;
        this.modCount += 1;
        return true;
    }

    public boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Double.valueOf(this.array[i]))) {
                System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
                this.size -= 1;
                this.modCount += 1;
                return true;
            }
        }
        return false;
    }

    public Double remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        double d = this.array[i];
        System.arraycopy(this.array, i + 1, this.array, i, this.size - i);
        this.size--;
        this.modCount++;
        return Double.valueOf(d);
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
