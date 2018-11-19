package android.support.v7.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class SortedList<T> {
    private static final int CAPACITY_GROWTH = 10;
    private static final int DELETION = 2;
    private static final int INSERTION = 1;
    public static final int INVALID_POSITION = -1;
    private static final int LOOKUP = 4;
    private static final int MIN_CAPACITY = 10;
    private BatchedCallback mBatchedCallback;
    private Callback mCallback;
    T[] mData;
    private int mNewDataStart;
    private T[] mOldData;
    private int mOldDataSize;
    private int mOldDataStart;
    private int mSize;
    private final Class<T> mTClass;

    public static abstract class Callback<T2> implements ListUpdateCallback, Comparator<T2> {
        public abstract boolean areContentsTheSame(T2 t2, T2 t22);

        public abstract boolean areItemsTheSame(T2 t2, T2 t22);

        public abstract int compare(T2 t2, T2 t22);

        @Nullable
        public Object getChangePayload(T2 t2, T2 t22) {
            return null;
        }

        public abstract void onChanged(int i, int i2);

        public void onChanged(int i, int i2, Object obj) {
            onChanged(i, i2);
        }
    }

    public static class BatchedCallback<T2> extends Callback<T2> {
        private final BatchingListUpdateCallback mBatchingListUpdateCallback = new BatchingListUpdateCallback(this.mWrappedCallback);
        final Callback<T2> mWrappedCallback;

        public BatchedCallback(Callback<T2> callback) {
            this.mWrappedCallback = callback;
        }

        public int compare(T2 t2, T2 t22) {
            return this.mWrappedCallback.compare(t2, t22);
        }

        public void onInserted(int i, int i2) {
            this.mBatchingListUpdateCallback.onInserted(i, i2);
        }

        public void onRemoved(int i, int i2) {
            this.mBatchingListUpdateCallback.onRemoved(i, i2);
        }

        public void onMoved(int i, int i2) {
            this.mBatchingListUpdateCallback.onMoved(i, i2);
        }

        public void onChanged(int i, int i2) {
            this.mBatchingListUpdateCallback.onChanged(i, i2, null);
        }

        public void onChanged(int i, int i2, Object obj) {
            this.mBatchingListUpdateCallback.onChanged(i, i2, obj);
        }

        public boolean areContentsTheSame(T2 t2, T2 t22) {
            return this.mWrappedCallback.areContentsTheSame(t2, t22);
        }

        public boolean areItemsTheSame(T2 t2, T2 t22) {
            return this.mWrappedCallback.areItemsTheSame(t2, t22);
        }

        @Nullable
        public Object getChangePayload(T2 t2, T2 t22) {
            return this.mWrappedCallback.getChangePayload(t2, t22);
        }

        public void dispatchLastEvent() {
            this.mBatchingListUpdateCallback.dispatchLastEvent();
        }
    }

    public SortedList(Class<T> cls, Callback<T> callback) {
        this(cls, callback, 10);
    }

    public SortedList(Class<T> cls, Callback<T> callback, int i) {
        this.mTClass = cls;
        this.mData = (Object[]) Array.newInstance(cls, i);
        this.mCallback = callback;
        this.mSize = null;
    }

    public int size() {
        return this.mSize;
    }

    public int add(T t) {
        throwIfInMutationOperation();
        return add(t, true);
    }

    public void addAll(T[] tArr, boolean z) {
        throwIfInMutationOperation();
        if (tArr.length != 0) {
            if (z) {
                addAllInternal(tArr);
            } else {
                addAllInternal(copyArray(tArr));
            }
        }
    }

    public void addAll(T... tArr) {
        addAll(tArr, false);
    }

    public void addAll(Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance(this.mTClass, collection.size())), true);
    }

    public void replaceAll(@NonNull T[] tArr, boolean z) {
        throwIfInMutationOperation();
        if (z) {
            replaceAllInternal(tArr);
        } else {
            replaceAllInternal(copyArray(tArr));
        }
    }

    public void replaceAll(@NonNull T... tArr) {
        replaceAll(tArr, false);
    }

    public void replaceAll(@NonNull Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance(this.mTClass, collection.size())), true);
    }

    private void addAllInternal(T[] tArr) {
        if (tArr.length >= 1) {
            int sortAndDedup = sortAndDedup(tArr);
            if (this.mSize == 0) {
                this.mData = tArr;
                this.mSize = sortAndDedup;
                this.mCallback.onInserted(0, sortAndDedup);
            } else {
                merge(tArr, sortAndDedup);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void replaceAllInternal(@android.support.annotation.NonNull T[] r9) {
        /*
        r8 = this;
        r0 = r8.mCallback;
        r0 = r0 instanceof android.support.v7.util.SortedList.BatchedCallback;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r0 = 1;
        goto L_0x000b;
    L_0x000a:
        r0 = 0;
    L_0x000b:
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r8.beginBatchedUpdates();
    L_0x0010:
        r8.mOldDataStart = r1;
        r3 = r8.mSize;
        r8.mOldDataSize = r3;
        r3 = r8.mData;
        r8.mOldData = r3;
        r8.mNewDataStart = r1;
        r1 = r8.sortAndDedup(r9);
        r3 = r8.mTClass;
        r3 = java.lang.reflect.Array.newInstance(r3, r1);
        r3 = (java.lang.Object[]) r3;
        r8.mData = r3;
    L_0x002a:
        r3 = r8.mNewDataStart;
        if (r3 < r1) goto L_0x0034;
    L_0x002e:
        r3 = r8.mOldDataStart;
        r4 = r8.mOldDataSize;
        if (r3 >= r4) goto L_0x0069;
    L_0x0034:
        r3 = r8.mOldDataStart;
        r4 = r8.mOldDataSize;
        if (r3 < r4) goto L_0x0054;
    L_0x003a:
        r2 = r8.mNewDataStart;
        r3 = r8.mNewDataStart;
        r1 = r1 - r3;
        r3 = r8.mData;
        java.lang.System.arraycopy(r9, r2, r3, r2, r1);
        r9 = r8.mNewDataStart;
        r9 = r9 + r1;
        r8.mNewDataStart = r9;
        r9 = r8.mSize;
        r9 = r9 + r1;
        r8.mSize = r9;
        r9 = r8.mCallback;
        r9.onInserted(r2, r1);
        goto L_0x0069;
    L_0x0054:
        r3 = r8.mNewDataStart;
        if (r3 < r1) goto L_0x0072;
    L_0x0058:
        r9 = r8.mOldDataSize;
        r1 = r8.mOldDataStart;
        r9 = r9 - r1;
        r1 = r8.mSize;
        r1 = r1 - r9;
        r8.mSize = r1;
        r1 = r8.mCallback;
        r2 = r8.mNewDataStart;
        r1.onRemoved(r2, r9);
    L_0x0069:
        r9 = 0;
        r8.mOldData = r9;
        if (r0 == 0) goto L_0x0071;
    L_0x006e:
        r8.endBatchedUpdates();
    L_0x0071:
        return;
    L_0x0072:
        r3 = r8.mOldData;
        r4 = r8.mOldDataStart;
        r3 = r3[r4];
        r4 = r8.mNewDataStart;
        r4 = r9[r4];
        r5 = r8.mCallback;
        r5 = r5.compare(r3, r4);
        if (r5 >= 0) goto L_0x0088;
    L_0x0084:
        r8.replaceAllRemove();
        goto L_0x002a;
    L_0x0088:
        if (r5 <= 0) goto L_0x008e;
    L_0x008a:
        r8.replaceAllInsert(r4);
        goto L_0x002a;
    L_0x008e:
        r5 = r8.mCallback;
        r5 = r5.areItemsTheSame(r3, r4);
        if (r5 != 0) goto L_0x009d;
    L_0x0096:
        r8.replaceAllRemove();
        r8.replaceAllInsert(r4);
        goto L_0x002a;
    L_0x009d:
        r5 = r8.mData;
        r6 = r8.mNewDataStart;
        r5[r6] = r4;
        r5 = r8.mOldDataStart;
        r5 = r5 + r2;
        r8.mOldDataStart = r5;
        r5 = r8.mNewDataStart;
        r5 = r5 + r2;
        r8.mNewDataStart = r5;
        r5 = r8.mCallback;
        r5 = r5.areContentsTheSame(r3, r4);
        if (r5 != 0) goto L_0x002a;
    L_0x00b5:
        r5 = r8.mCallback;
        r6 = r8.mNewDataStart;
        r6 = r6 - r2;
        r7 = r8.mCallback;
        r3 = r7.getChangePayload(r3, r4);
        r5.onChanged(r6, r2, r3);
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.util.SortedList.replaceAllInternal(java.lang.Object[]):void");
    }

    private void replaceAllInsert(T t) {
        this.mData[this.mNewDataStart] = t;
        this.mNewDataStart += 1;
        this.mSize += 1;
        this.mCallback.onInserted(this.mNewDataStart - 1, 1);
    }

    private void replaceAllRemove() {
        this.mSize--;
        this.mOldDataStart++;
        this.mCallback.onRemoved(this.mNewDataStart, 1);
    }

    private int sortAndDedup(@NonNull T[] tArr) {
        int i = 0;
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.mCallback);
        int i2 = 1;
        for (int i3 = 1; i3 < tArr.length; i3++) {
            Object obj = tArr[i3];
            if (this.mCallback.compare(tArr[i], obj) == 0) {
                int findSameItem = findSameItem(obj, tArr, i, i2);
                if (findSameItem != -1) {
                    tArr[findSameItem] = obj;
                } else {
                    if (i2 != i3) {
                        tArr[i2] = obj;
                    }
                    i2++;
                }
            } else {
                if (i2 != i3) {
                    tArr[i2] = obj;
                }
                int i4 = i2;
                i2++;
                i = i4;
            }
        }
        return i2;
    }

    private int findSameItem(T t, T[] tArr, int i, int i2) {
        while (i < i2) {
            if (this.mCallback.areItemsTheSame(tArr[i], t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void merge(T[] r9, int r10) {
        /*
        r8 = this;
        r0 = r8.mCallback;
        r0 = r0 instanceof android.support.v7.util.SortedList.BatchedCallback;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r0 = 1;
        goto L_0x000b;
    L_0x000a:
        r0 = 0;
    L_0x000b:
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r8.beginBatchedUpdates();
    L_0x0010:
        r3 = r8.mData;
        r8.mOldData = r3;
        r8.mOldDataStart = r1;
        r3 = r8.mSize;
        r8.mOldDataSize = r3;
        r3 = r8.mSize;
        r3 = r3 + r10;
        r3 = r3 + 10;
        r4 = r8.mTClass;
        r3 = java.lang.reflect.Array.newInstance(r4, r3);
        r3 = (java.lang.Object[]) r3;
        r8.mData = r3;
        r8.mNewDataStart = r1;
    L_0x002b:
        r3 = r8.mOldDataStart;
        r4 = r8.mOldDataSize;
        if (r3 < r4) goto L_0x0033;
    L_0x0031:
        if (r1 >= r10) goto L_0x006b;
    L_0x0033:
        r3 = r8.mOldDataStart;
        r4 = r8.mOldDataSize;
        if (r3 != r4) goto L_0x0054;
    L_0x0039:
        r10 = r10 - r1;
        r2 = r8.mData;
        r3 = r8.mNewDataStart;
        java.lang.System.arraycopy(r9, r1, r2, r3, r10);
        r9 = r8.mNewDataStart;
        r9 = r9 + r10;
        r8.mNewDataStart = r9;
        r9 = r8.mSize;
        r9 = r9 + r10;
        r8.mSize = r9;
        r9 = r8.mCallback;
        r1 = r8.mNewDataStart;
        r1 = r1 - r10;
        r9.onInserted(r1, r10);
        goto L_0x006b;
    L_0x0054:
        if (r1 != r10) goto L_0x0074;
    L_0x0056:
        r9 = r8.mOldDataSize;
        r10 = r8.mOldDataStart;
        r9 = r9 - r10;
        r10 = r8.mOldData;
        r1 = r8.mOldDataStart;
        r2 = r8.mData;
        r3 = r8.mNewDataStart;
        java.lang.System.arraycopy(r10, r1, r2, r3, r9);
        r10 = r8.mNewDataStart;
        r10 = r10 + r9;
        r8.mNewDataStart = r10;
    L_0x006b:
        r9 = 0;
        r8.mOldData = r9;
        if (r0 == 0) goto L_0x0073;
    L_0x0070:
        r8.endBatchedUpdates();
    L_0x0073:
        return;
    L_0x0074:
        r3 = r8.mOldData;
        r4 = r8.mOldDataStart;
        r3 = r3[r4];
        r4 = r9[r1];
        r5 = r8.mCallback;
        r5 = r5.compare(r3, r4);
        if (r5 <= 0) goto L_0x009e;
    L_0x0084:
        r3 = r8.mData;
        r5 = r8.mNewDataStart;
        r6 = r5 + 1;
        r8.mNewDataStart = r6;
        r3[r5] = r4;
        r3 = r8.mSize;
        r3 = r3 + r2;
        r8.mSize = r3;
        r1 = r1 + 1;
        r3 = r8.mCallback;
        r4 = r8.mNewDataStart;
        r4 = r4 - r2;
        r3.onInserted(r4, r2);
        goto L_0x002b;
    L_0x009e:
        if (r5 != 0) goto L_0x00d1;
    L_0x00a0:
        r5 = r8.mCallback;
        r5 = r5.areItemsTheSame(r3, r4);
        if (r5 == 0) goto L_0x00d1;
    L_0x00a8:
        r5 = r8.mData;
        r6 = r8.mNewDataStart;
        r7 = r6 + 1;
        r8.mNewDataStart = r7;
        r5[r6] = r4;
        r1 = r1 + 1;
        r5 = r8.mOldDataStart;
        r5 = r5 + r2;
        r8.mOldDataStart = r5;
        r5 = r8.mCallback;
        r5 = r5.areContentsTheSame(r3, r4);
        if (r5 != 0) goto L_0x002b;
    L_0x00c1:
        r5 = r8.mCallback;
        r6 = r8.mNewDataStart;
        r6 = r6 - r2;
        r7 = r8.mCallback;
        r3 = r7.getChangePayload(r3, r4);
        r5.onChanged(r6, r2, r3);
        goto L_0x002b;
    L_0x00d1:
        r4 = r8.mData;
        r5 = r8.mNewDataStart;
        r6 = r5 + 1;
        r8.mNewDataStart = r6;
        r4[r5] = r3;
        r3 = r8.mOldDataStart;
        r3 = r3 + r2;
        r8.mOldDataStart = r3;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.util.SortedList.merge(java.lang.Object[], int):void");
    }

    private void throwIfInMutationOperation() {
        if (this.mOldData != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public void beginBatchedUpdates() {
        throwIfInMutationOperation();
        if (!(this.mCallback instanceof BatchedCallback)) {
            if (this.mBatchedCallback == null) {
                this.mBatchedCallback = new BatchedCallback(this.mCallback);
            }
            this.mCallback = this.mBatchedCallback;
        }
    }

    public void endBatchedUpdates() {
        throwIfInMutationOperation();
        if (this.mCallback instanceof BatchedCallback) {
            ((BatchedCallback) this.mCallback).dispatchLastEvent();
        }
        if (this.mCallback == this.mBatchedCallback) {
            this.mCallback = this.mBatchedCallback.mWrappedCallback;
        }
    }

    private int add(T t, boolean z) {
        int findIndexOf = findIndexOf(t, this.mData, 0, this.mSize, 1);
        if (findIndexOf == -1) {
            findIndexOf = 0;
        } else if (findIndexOf < this.mSize) {
            Object obj = this.mData[findIndexOf];
            if (this.mCallback.areItemsTheSame(obj, t)) {
                if (this.mCallback.areContentsTheSame(obj, t)) {
                    this.mData[findIndexOf] = t;
                    return findIndexOf;
                }
                this.mData[findIndexOf] = t;
                this.mCallback.onChanged(findIndexOf, 1, this.mCallback.getChangePayload(obj, t));
                return findIndexOf;
            }
        }
        addToData(findIndexOf, t);
        if (z) {
            this.mCallback.onInserted(findIndexOf, 1);
        }
        return findIndexOf;
    }

    public boolean remove(T t) {
        throwIfInMutationOperation();
        return remove(t, true);
    }

    public T removeItemAt(int i) {
        throwIfInMutationOperation();
        T t = get(i);
        removeItemAtIndex(i, true);
        return t;
    }

    private boolean remove(T t, boolean z) {
        t = findIndexOf(t, this.mData, 0, this.mSize, 2);
        if (t == -1) {
            return null;
        }
        removeItemAtIndex(t, z);
        return true;
    }

    private void removeItemAtIndex(int i, boolean z) {
        System.arraycopy(this.mData, i + 1, this.mData, i, (this.mSize - i) - 1);
        this.mSize--;
        this.mData[this.mSize] = null;
        if (z) {
            this.mCallback.onRemoved(i, 1);
        }
    }

    public void updateItemAt(int i, T t) {
        Object obj;
        throwIfInMutationOperation();
        T t2 = get(i);
        if (t2 != t) {
            if (this.mCallback.areContentsTheSame(t2, t)) {
                obj = null;
                if (t2 == t && this.mCallback.compare(t2, t) == 0) {
                    this.mData[i] = t;
                    if (obj != null) {
                        this.mCallback.onChanged(i, 1, this.mCallback.getChangePayload(t2, t));
                    }
                    return;
                }
                if (obj != null) {
                    this.mCallback.onChanged(i, 1, this.mCallback.getChangePayload(t2, t));
                }
                removeItemAtIndex(i, false);
                t = add(t, false);
                if (i != t) {
                    this.mCallback.onMoved(i, t);
                }
            }
        }
        obj = 1;
        if (t2 == t) {
        }
        if (obj != null) {
            this.mCallback.onChanged(i, 1, this.mCallback.getChangePayload(t2, t));
        }
        removeItemAtIndex(i, false);
        t = add(t, false);
        if (i != t) {
            this.mCallback.onMoved(i, t);
        }
    }

    public void recalculatePositionOfItemAt(int i) {
        throwIfInMutationOperation();
        Object obj = get(i);
        removeItemAtIndex(i, false);
        int add = add(obj, false);
        if (i != add) {
            this.mCallback.onMoved(i, add);
        }
    }

    public T get(int i) throws IndexOutOfBoundsException {
        if (i < this.mSize) {
            if (i >= 0) {
                if (this.mOldData == null || i < this.mNewDataStart) {
                    return this.mData[i];
                }
                return this.mOldData[(i - this.mNewDataStart) + this.mOldDataStart];
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Asked to get item at ");
        stringBuilder.append(i);
        stringBuilder.append(" but size is ");
        stringBuilder.append(this.mSize);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public int indexOf(T t) {
        if (this.mOldData != null) {
            int findIndexOf = findIndexOf(t, this.mData, 0, this.mNewDataStart, 4);
            if (findIndexOf != -1) {
                return findIndexOf;
            }
            t = findIndexOf(t, this.mOldData, this.mOldDataStart, this.mOldDataSize, 4);
            if (t != -1) {
                return (t - this.mOldDataStart) + this.mNewDataStart;
            }
            return -1;
        }
        return findIndexOf(t, this.mData, 0, this.mSize, 4);
    }

    private int findIndexOf(T t, T[] tArr, int i, int i2, int i3) {
        while (i < i2) {
            T t2 = (i + i2) / 2;
            Object obj = tArr[t2];
            int compare = this.mCallback.compare(obj, t);
            if (compare < 0) {
                i = t2 + 1;
            } else if (compare != 0) {
                i2 = t2;
            } else if (this.mCallback.areItemsTheSame(obj, t) != null) {
                return t2;
            } else {
                t = linearEqualitySearch(t, t2, i, i2);
                if (i3 != 1) {
                    return t;
                }
                if (t == -1) {
                    t = t2;
                }
                return t;
            }
        }
        if (i3 != 1) {
            i = -1;
        }
        return i;
    }

    private int linearEqualitySearch(T t, int i, int i2, int i3) {
        int i4 = i - 1;
        while (i4 >= i2) {
            Object obj = this.mData[i4];
            if (this.mCallback.compare(obj, t) != 0) {
                break;
            } else if (this.mCallback.areItemsTheSame(obj, t)) {
                return i4;
            } else {
                i4--;
            }
        }
        do {
            i++;
            if (i < i3) {
                i2 = this.mData[i];
                if (this.mCallback.compare(i2, t) != 0) {
                }
            }
            return -1;
        } while (this.mCallback.areItemsTheSame(i2, t) == 0);
        return i;
    }

    private void addToData(int i, T t) {
        if (i > this.mSize) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cannot add item to ");
            stringBuilder.append(i);
            stringBuilder.append(" because size is ");
            stringBuilder.append(this.mSize);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        if (this.mSize == this.mData.length) {
            Object[] objArr = (Object[]) Array.newInstance(this.mTClass, this.mData.length + 10);
            System.arraycopy(this.mData, 0, objArr, 0, i);
            objArr[i] = t;
            System.arraycopy(this.mData, i, objArr, i + 1, this.mSize - i);
            this.mData = objArr;
        } else {
            System.arraycopy(this.mData, i, this.mData, i + 1, this.mSize - i);
            this.mData[i] = t;
        }
        this.mSize++;
    }

    private T[] copyArray(T[] tArr) {
        Object[] objArr = (Object[]) Array.newInstance(this.mTClass, tArr.length);
        System.arraycopy(tArr, 0, objArr, 0, tArr.length);
        return objArr;
    }

    public void clear() {
        throwIfInMutationOperation();
        if (this.mSize != 0) {
            int i = this.mSize;
            Arrays.fill(this.mData, 0, i, null);
            this.mSize = 0;
            this.mCallback.onRemoved(0, i);
        }
    }
}
