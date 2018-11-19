package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableFloat extends C3984b implements Parcelable, Serializable {
    public static final Creator<ObservableFloat> CREATOR = new C01001();
    static final long serialVersionUID = 1;
    private float mValue;

    /* renamed from: android.databinding.ObservableFloat$1 */
    static class C01001 implements Creator<ObservableFloat> {
        C01001() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m319a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m320a(i);
        }

        /* renamed from: a */
        public ObservableFloat m319a(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        /* renamed from: a */
        public ObservableFloat[] m320a(int i) {
            return new ObservableFloat[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableFloat(float f) {
        this.mValue = f;
    }

    public ObservableFloat(Observable... observableArr) {
        super(observableArr);
    }

    public float get() {
        return this.mValue;
    }

    public void set(float f) {
        if (f != this.mValue) {
            this.mValue = f;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.mValue);
    }
}
