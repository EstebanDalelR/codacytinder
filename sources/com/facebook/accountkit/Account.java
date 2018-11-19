package com.facebook.accountkit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.accountkit.internal.C1251w;

public final class Account implements Parcelable {
    public static final Creator<Account> CREATOR = new C11821();
    private final String email;
    private final String id;
    private final PhoneNumber phoneNumber;

    /* renamed from: com.facebook.accountkit.Account$1 */
    static class C11821 implements Creator<Account> {
        C11821() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4107a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4108a(i);
        }

        /* renamed from: a */
        public Account m4107a(Parcel parcel) {
            return new Account(parcel);
        }

        /* renamed from: a */
        public Account[] m4108a(int i) {
            return new Account[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public Account(@NonNull String str, @Nullable PhoneNumber phoneNumber, @Nullable String str2) {
        this.id = str;
        this.phoneNumber = phoneNumber;
        this.email = str2;
    }

    public String getEmail() {
        return this.email;
    }

    public String getId() {
        return this.id;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account account = (Account) obj;
        if (!C1251w.m4505b(this.email, account.email) || !C1251w.m4505b(this.id, account.id) || C1251w.m4505b(this.phoneNumber, account.phoneNumber) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((527 + C1251w.m4481a(this.email)) * 31) + C1251w.m4481a(this.id)) * 31) + C1251w.m4481a(this.phoneNumber);
    }

    private Account(Parcel parcel) {
        this.id = parcel.readString();
        this.phoneNumber = (PhoneNumber) parcel.readParcelable(PhoneNumber.class.getClassLoader());
        this.email = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.phoneNumber, i);
        parcel.writeString(this.email);
    }
}
