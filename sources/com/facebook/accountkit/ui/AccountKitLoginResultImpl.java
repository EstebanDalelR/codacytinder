package com.facebook.accountkit.ui;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitLoginResult;

class AccountKitLoginResultImpl implements AccountKitLoginResult {
    public static final Creator<AccountKitLoginResultImpl> CREATOR = new C12561();
    private final AccessToken accessToken;
    private final String authorizationCode;
    private final boolean cancelled;
    private final AccountKitError error;
    private final String finalAuthorizationState;
    private final long tokenRefreshIntervalInSeconds;

    /* renamed from: com.facebook.accountkit.ui.AccountKitLoginResultImpl$1 */
    static class C12561 implements Creator<AccountKitLoginResultImpl> {
        C12561() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4535a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4536a(i);
        }

        /* renamed from: a */
        public AccountKitLoginResultImpl m4535a(Parcel parcel) {
            return new AccountKitLoginResultImpl(parcel);
        }

        /* renamed from: a */
        public AccountKitLoginResultImpl[] m4536a(int i) {
            return new AccountKitLoginResultImpl[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public AccountKitLoginResultImpl(AccessToken accessToken, String str, String str2, long j, AccountKitError accountKitError, boolean z) {
        this.accessToken = accessToken;
        this.authorizationCode = str;
        this.tokenRefreshIntervalInSeconds = j;
        this.cancelled = z;
        this.error = accountKitError;
        this.finalAuthorizationState = str2;
    }

    @Nullable
    public AccessToken getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public String getFinalAuthorizationState() {
        return this.finalAuthorizationState;
    }

    @Nullable
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    @Nullable
    public AccountKitError getError() {
        return this.error;
    }

    public boolean wasCancelled() {
        return this.error == null && this.authorizationCode == null && this.accessToken == null;
    }

    public long getTokenRefreshIntervalInSeconds() {
        return this.tokenRefreshIntervalInSeconds;
    }

    private AccountKitLoginResultImpl(Parcel parcel) {
        this.accessToken = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
        this.authorizationCode = parcel.readString();
        this.finalAuthorizationState = parcel.readString();
        this.tokenRefreshIntervalInSeconds = parcel.readLong();
        this.error = (AccountKitError) parcel.readParcelable(AccountKitError.class.getClassLoader());
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        this.cancelled = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.accessToken, i);
        parcel.writeString(this.authorizationCode);
        parcel.writeString(this.finalAuthorizationState);
        parcel.writeLong(this.tokenRefreshIntervalInSeconds);
        parcel.writeParcelable(this.error, i);
        parcel.writeByte((byte) this.cancelled);
    }
}
