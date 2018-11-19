package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableBoolean extends C3984b implements Parcelable, Serializable {
    public static final Creator<ObservableBoolean> CREATOR = new C00961();
    static final long serialVersionUID = 1;
    private boolean mValue;

    /* renamed from: android.databinding.ObservableBoolean$1 */
    static class C00961 implements Creator<ObservableBoolean> {
        C00961() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m311a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m312a(i);
        }

        /* renamed from: a */
        public ObservableBoolean m311a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new ObservableBoolean(z);
        }

        /* renamed from: a */
        public ObservableBoolean[] m312a(int i) {
            return new ObservableBoolean[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableBoolean(boolean z) {
        this.mValue = z;
    }

    public ObservableBoolean(Observable... observableArr) {
        super(observableArr);
    }

    public boolean get() {
        return this.mValue;
    }

    public void set(boolean z) {
        if (z != this.mValue) {
            this.mValue = z;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
