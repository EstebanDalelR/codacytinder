package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.util.SparseArray;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Creator<ParcelableSparseArray> CREATOR = new C01831();

    /* renamed from: android.support.design.internal.ParcelableSparseArray$1 */
    static class C01831 implements ClassLoaderCreator<ParcelableSparseArray> {
        C01831() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m610a(parcel);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return m611a(parcel, classLoader);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m612a(i);
        }

        /* renamed from: a */
        public ParcelableSparseArray m611a(Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }

        /* renamed from: a */
        public ParcelableSparseArray m610a(Parcel parcel) {
            return new ParcelableSparseArray(parcel, null);
        }

        /* renamed from: a */
        public ParcelableSparseArray[] m612a(int i) {
            return new ParcelableSparseArray[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ParcelableSparseArray(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        parcel = parcel.readParcelableArray(classLoader);
        for (classLoader = null; classLoader < readInt; classLoader++) {
            put(iArr[classLoader], parcel[classLoader]);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
