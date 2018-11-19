package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableInt extends C3984b implements Parcelable, Serializable {
    public static final Creator<ObservableInt> CREATOR = new C01011();
    static final long serialVersionUID = 1;
    private int mValue;

    /* renamed from: android.databinding.ObservableInt$1 */
    static class C01011 implements Creator<ObservableInt> {
        C01011() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m321a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m322a(i);
        }

        /* renamed from: a */
        public ObservableInt m321a(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        /* renamed from: a */
        public ObservableInt[] m322a(int i) {
            return new ObservableInt[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableInt(int i) {
        this.mValue = i;
    }

    public ObservableInt(Observable... observableArr) {
        super(observableArr);
    }

    public int get() {
        return this.mValue;
    }

    public void set(int i) {
        if (i != this.mValue) {
            this.mValue = i;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
