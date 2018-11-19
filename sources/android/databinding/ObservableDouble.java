package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableDouble extends C3984b implements Parcelable, Serializable {
    public static final Creator<ObservableDouble> CREATOR = new C00991();
    static final long serialVersionUID = 1;
    private double mValue;

    /* renamed from: android.databinding.ObservableDouble$1 */
    static class C00991 implements Creator<ObservableDouble> {
        C00991() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m317a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m318a(i);
        }

        /* renamed from: a */
        public ObservableDouble m317a(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        /* renamed from: a */
        public ObservableDouble[] m318a(int i) {
            return new ObservableDouble[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableDouble(double d) {
        this.mValue = d;
    }

    public ObservableDouble(Observable... observableArr) {
        super(observableArr);
    }

    public double get() {
        return this.mValue;
    }

    public void set(double d) {
        if (d != this.mValue) {
            this.mValue = d;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mValue);
    }
}
