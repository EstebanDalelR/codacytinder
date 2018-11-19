package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableChar extends C3984b implements Parcelable, Serializable {
    public static final Creator<ObservableChar> CREATOR = new C00981();
    static final long serialVersionUID = 1;
    private char mValue;

    /* renamed from: android.databinding.ObservableChar$1 */
    static class C00981 implements Creator<ObservableChar> {
        C00981() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m315a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m316a(i);
        }

        /* renamed from: a */
        public ObservableChar m315a(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        /* renamed from: a */
        public ObservableChar[] m316a(int i) {
            return new ObservableChar[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableChar(char c) {
        this.mValue = c;
    }

    public ObservableChar(Observable... observableArr) {
        super(observableArr);
    }

    public char get() {
        return this.mValue;
    }

    public void set(char c) {
        if (c != this.mValue) {
            this.mValue = c;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
