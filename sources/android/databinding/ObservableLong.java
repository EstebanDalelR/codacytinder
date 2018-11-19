package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableLong extends C3984b implements Parcelable, Serializable {
    public static final Creator<ObservableLong> CREATOR = new C01031();
    static final long serialVersionUID = 1;
    private long mValue;

    /* renamed from: android.databinding.ObservableLong$1 */
    static class C01031 implements Creator<ObservableLong> {
        C01031() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m323a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m324a(i);
        }

        /* renamed from: a */
        public ObservableLong m323a(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        /* renamed from: a */
        public ObservableLong[] m324a(int i) {
            return new ObservableLong[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableLong(long j) {
        this.mValue = j;
    }

    public ObservableLong(Observable... observableArr) {
        super(observableArr);
    }

    public long get() {
        return this.mValue;
    }

    public void set(long j) {
        if (j != this.mValue) {
            this.mValue = j;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mValue);
    }
}
