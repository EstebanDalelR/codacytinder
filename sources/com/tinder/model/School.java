package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.text.Spanned;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class School implements Parcelable, Serializable {
    public static final Creator<School> CREATOR = new C99331();
    @SerializedName("id")
    public String id;
    @SerializedName("displayed")
    public boolean isDisplayed;
    @SerializedName("name")
    private String mName;

    /* renamed from: com.tinder.model.School$1 */
    static class C99331 implements Creator<School> {
        C99331() {
        }

        public School createFromParcel(Parcel parcel) {
            return new School(parcel);
        }

        public School[] newArray(int i) {
            return new School[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public School(String str, String str2, boolean z) {
        this.mName = str2;
        this.id = str;
        this.isDisplayed = z;
    }

    public String getName() {
        return this.mName;
    }

    public Spanned getSpanned() {
        return Html.fromHtml(this.mName);
    }

    public String getId() {
        return this.id;
    }

    public String toString() {
        return this.mName;
    }

    protected School(Parcel parcel) {
        this.mName = parcel.readString();
        this.id = parcel.readString();
        this.isDisplayed = parcel.readByte() != null ? true : null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mName);
        parcel.writeString(this.id);
        parcel.writeByte((byte) this.isDisplayed);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.model.School;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r5 = (com.tinder.model.School) r5;
        r1 = r4.isDisplayed;
        r3 = r5.isDisplayed;
        if (r1 == r3) goto L_0x0013;
    L_0x0012:
        return r2;
    L_0x0013:
        r1 = r4.mName;
        if (r1 == 0) goto L_0x0022;
    L_0x0017:
        r1 = r4.mName;
        r3 = r5.mName;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x0027;
    L_0x0021:
        goto L_0x0026;
    L_0x0022:
        r1 = r5.mName;
        if (r1 == 0) goto L_0x0027;
    L_0x0026:
        return r2;
    L_0x0027:
        r1 = r4.id;
        if (r1 == 0) goto L_0x0036;
    L_0x002b:
        r1 = r4.id;
        r5 = r5.id;
        r5 = r1.equals(r5);
        if (r5 != 0) goto L_0x003c;
    L_0x0035:
        goto L_0x003b;
    L_0x0036:
        r5 = r5.id;
        if (r5 != 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003c;
    L_0x003b:
        r0 = 0;
    L_0x003c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.model.School.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.mName != null ? this.mName.hashCode() : 0) * 31;
        if (this.id != null) {
            i = this.id.hashCode();
        }
        return ((hashCode + i) * 31) + this.isDisplayed;
    }

    public boolean isDisplayed() {
        return this.isDisplayed;
    }
}
