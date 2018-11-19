package com.facebook.accountkit.ui;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitUpdateResult;

class AccountKitUpdateResultImpl implements AccountKitUpdateResult {
    public static final Creator<AccountKitUpdateResultImpl> CREATOR = new C12571();
    private final boolean cancelled;
    @Nullable
    private final AccountKitError error;
    private final String finalAuthorizationState;

    /* renamed from: com.facebook.accountkit.ui.AccountKitUpdateResultImpl$1 */
    static class C12571 implements Creator<AccountKitUpdateResultImpl> {
        C12571() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4537a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4538a(i);
        }

        /* renamed from: a */
        public AccountKitUpdateResultImpl m4537a(Parcel parcel) {
            return new AccountKitUpdateResultImpl(parcel);
        }

        /* renamed from: a */
        public AccountKitUpdateResultImpl[] m4538a(int i) {
            return new AccountKitUpdateResultImpl[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public AccountKitUpdateResultImpl(String str, AccountKitError accountKitError, boolean z) {
        this.cancelled = z;
        this.error = accountKitError;
        this.finalAuthorizationState = str;
    }

    @Nullable
    public String getFinalAuthorizationState() {
        return this.finalAuthorizationState;
    }

    @Nullable
    public AccountKitError getError() {
        return this.error;
    }

    public boolean wasCancelled() {
        return this.error == null;
    }

    private AccountKitUpdateResultImpl(Parcel parcel) {
        this.finalAuthorizationState = parcel.readString();
        this.error = (AccountKitError) parcel.readParcelable(AccountKitError.class.getClassLoader());
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        this.cancelled = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.finalAuthorizationState);
        parcel.writeParcelable(this.error, i);
        parcel.writeByte((byte) this.cancelled);
    }
}
