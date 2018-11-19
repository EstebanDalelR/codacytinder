package com.facebook.accountkit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.accountkit.internal.C1251w;

public final class PhoneNumber implements Parcelable {
    public static final Creator<PhoneNumber> CREATOR = new C11841();
    private final String countryCode;
    private final String countryCodeIso;
    private final String phoneNumber;

    /* renamed from: com.facebook.accountkit.PhoneNumber$1 */
    static class C11841 implements Creator<PhoneNumber> {
        C11841() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4127a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4128a(i);
        }

        /* renamed from: a */
        public PhoneNumber m4127a(Parcel parcel) {
            return new PhoneNumber(parcel);
        }

        /* renamed from: a */
        public PhoneNumber[] m4128a(int i) {
            return new PhoneNumber[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public PhoneNumber(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        this.phoneNumber = C1251w.m4513e(str2);
        this.countryCode = C1251w.m4513e(str);
        this.countryCodeIso = str3;
    }

    @Deprecated
    public PhoneNumber(String str, String str2) {
        this(str, str2, null);
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountryCodeIso() {
        return this.countryCodeIso;
    }

    public String getRawPhoneNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.countryCode);
        stringBuilder.append(this.phoneNumber);
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+");
        stringBuilder.append(this.countryCode);
        stringBuilder.append(this.phoneNumber);
        return stringBuilder.toString();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean equals(Object obj) {
        return ((obj instanceof PhoneNumber) && hashCode() == obj.hashCode()) ? true : null;
    }

    private PhoneNumber(Parcel parcel) {
        this.countryCode = parcel.readString();
        this.phoneNumber = parcel.readString();
        this.countryCodeIso = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.countryCode);
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.countryCodeIso);
    }
}
