package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.text.Spanned;
import com.google.gson.annotations.SerializedName;

public class Teaser implements Parcelable {
    public static final Creator<Teaser> CREATOR = new C99341();
    @SerializedName("string")
    private String mString;
    @SerializedName("type")
    public String mType;

    /* renamed from: com.tinder.model.Teaser$1 */
    static class C99341 implements Creator<Teaser> {
        C99341() {
        }

        public Teaser createFromParcel(Parcel parcel) {
            return new Teaser(parcel);
        }

        public Teaser[] newArray(int i) {
            return new Teaser[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public Teaser(String str, String str2) {
        this.mType = str;
        this.mString = str2;
    }

    public String getType() {
        return this.mType;
    }

    @Deprecated
    public Spanned getSpanned() {
        return Html.fromHtml(this.mString);
    }

    public String toString() {
        return this.mString;
    }

    protected Teaser(Parcel parcel) {
        this.mType = parcel.readString();
        this.mString = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mType);
        parcel.writeString(this.mString);
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
        r1 = r5 instanceof com.tinder.model.Teaser;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r5 = (com.tinder.model.Teaser) r5;
        r1 = r4.mType;
        if (r1 == 0) goto L_0x001b;
    L_0x0010:
        r1 = r4.mType;
        r3 = r5.mType;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x0020;
    L_0x001a:
        goto L_0x001f;
    L_0x001b:
        r1 = r5.mType;
        if (r1 == 0) goto L_0x0020;
    L_0x001f:
        return r2;
    L_0x0020:
        r1 = r4.mString;
        if (r1 == 0) goto L_0x002f;
    L_0x0024:
        r1 = r4.mString;
        r5 = r5.mString;
        r5 = r1.equals(r5);
        if (r5 != 0) goto L_0x0035;
    L_0x002e:
        goto L_0x0034;
    L_0x002f:
        r5 = r5.mString;
        if (r5 != 0) goto L_0x0034;
    L_0x0033:
        goto L_0x0035;
    L_0x0034:
        r0 = 0;
    L_0x0035:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.model.Teaser.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.mType != null ? this.mType.hashCode() : 0) * 31;
        if (this.mString != null) {
            i = this.mString.hashCode();
        }
        return hashCode + i;
    }
}
