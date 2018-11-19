package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableShort extends C3984b implements Parcelable, Serializable {
    public static final Creator<ObservableShort> CREATOR = new C01061();
    static final long serialVersionUID = 1;
    private short mValue;

    /* renamed from: android.databinding.ObservableShort$1 */
    static class C01061 implements Creator<ObservableShort> {
        C01061() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m327a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m328a(i);
        }

        /* renamed from: a */
        public ObservableShort m327a(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        /* renamed from: a */
        public ObservableShort[] m328a(int i) {
            return new ObservableShort[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableShort(short s) {
        this.mValue = s;
    }

    public ObservableShort(Observable... observableArr) {
        super(observableArr);
    }

    public short get() {
        return this.mValue;
    }

    public void set(short s) {
        if (s != this.mValue) {
            this.mValue = s;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
