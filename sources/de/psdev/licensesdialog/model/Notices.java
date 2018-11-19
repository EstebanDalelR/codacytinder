package de.psdev.licensesdialog.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class Notices implements Parcelable {
    public static Creator<Notices> CREATOR = new C155501();
    private final List<Notice> mNotices = new ArrayList();

    /* renamed from: de.psdev.licensesdialog.model.Notices$1 */
    static class C155501 implements Creator<Notices> {
        C155501() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m58071a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m58072a(i);
        }

        /* renamed from: a */
        public Notices m58071a(Parcel parcel) {
            return new Notices(parcel);
        }

        /* renamed from: a */
        public Notices[] m58072a(int i) {
            return new Notices[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void addNotice(Notice notice) {
        this.mNotices.add(notice);
    }

    public List<Notice> getNotices() {
        return this.mNotices;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.mNotices);
    }

    protected Notices(Parcel parcel) {
        parcel.readList(this.mNotices, Notice.class.getClassLoader());
    }
}
