package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableByte extends C3984b implements Parcelable, Serializable {
    public static final Creator<ObservableByte> CREATOR = new C00971();
    static final long serialVersionUID = 1;
    private byte mValue;

    /* renamed from: android.databinding.ObservableByte$1 */
    static class C00971 implements Creator<ObservableByte> {
        C00971() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m313a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m314a(i);
        }

        /* renamed from: a */
        public ObservableByte m313a(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        /* renamed from: a */
        public ObservableByte[] m314a(int i) {
            return new ObservableByte[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableByte(byte b) {
        this.mValue = b;
    }

    public ObservableByte(Observable... observableArr) {
        super(observableArr);
    }

    public byte get() {
        return this.mValue;
    }

    public void set(byte b) {
        if (b != this.mValue) {
            this.mValue = b;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mValue);
    }
}
