package com.facebook.accountkit.internal;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.LoginModel;
import java.util.HashMap;
import java.util.Map;

abstract class LoginModelImpl implements LoginModel {
    private static final int PARCEL_VERSION = 2;
    private AccessToken accessToken;
    private String code;
    private AccountKitError error;
    private long expiresInSeconds;
    protected Map<String, String> fields = new HashMap();
    private String finalAuthState;
    private String initialAuthState;
    private String loginModelCode;
    private String responseType;
    private LoginStatus status = LoginStatus.EMPTY;

    LoginModelImpl(String str) {
        this.responseType = str;
    }

    public String getCode() {
        return this.code;
    }

    public AccountKitError getError() {
        return this.error;
    }

    String getLoginRequestCode() {
        return this.loginModelCode;
    }

    void setLoginCode(String str) {
        this.loginModelCode = str;
    }

    long getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    void setExpiresInSeconds(long j) {
        this.expiresInSeconds = j;
    }

    void setStatus(LoginStatus loginStatus) {
        this.status = loginStatus;
    }

    public LoginStatus getStatus() {
        return this.status;
    }

    void setError(AccountKitError accountKitError) {
        this.error = accountKitError;
    }

    public String getResponseType() {
        return this.responseType;
    }

    void setInitialAuthState(String str) {
        this.initialAuthState = str;
    }

    public String getInitialAuthState() {
        return this.initialAuthState;
    }

    void setFinalAuthState(String str) {
        this.finalAuthState = str;
    }

    public String getFinalAuthState() {
        return this.finalAuthState;
    }

    void setCode(String str) {
        this.code = str;
    }

    void setAccessToken(AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    @Nullable
    public AccessToken getAccessToken() {
        return this.accessToken;
    }

    void putField(String str, String str2) {
        this.fields.put(str, str2);
    }

    @Nullable
    public String getPrivacyPolicy() {
        return (String) this.fields.get("privacy_policy");
    }

    @Nullable
    public String getTermsOfService() {
        return (String) this.fields.get("terms_of_service");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginModelImpl)) {
            return false;
        }
        LoginModelImpl loginModelImpl = (LoginModelImpl) obj;
        if (this.expiresInSeconds != loginModelImpl.expiresInSeconds || !C1251w.m4505b(this.error, loginModelImpl.error) || !C1251w.m4505b(this.loginModelCode, loginModelImpl.loginModelCode) || !C1251w.m4505b(this.status, loginModelImpl.status) || !C1251w.m4505b(this.responseType, loginModelImpl.responseType) || !C1251w.m4505b(this.finalAuthState, loginModelImpl.finalAuthState) || C1251w.m4505b(this.code, loginModelImpl.code) == null) {
            z = false;
        }
        return z;
    }

    LoginModelImpl(Parcel parcel) {
        if (parcel.readInt() == 2) {
            this.error = (AccountKitError) parcel.readParcelable(AccountKitError.class.getClassLoader());
            this.expiresInSeconds = parcel.readLong();
            this.loginModelCode = parcel.readString();
            this.status = LoginStatus.valueOf(parcel.readString());
            this.responseType = parcel.readString();
            this.finalAuthState = parcel.readString();
            this.code = parcel.readString();
            return;
        }
        this.error = new AccountKitError(Type.LOGIN_INVALIDATED);
        this.status = LoginStatus.ERROR;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(2);
        parcel.writeParcelable(this.error, i);
        parcel.writeLong(this.expiresInSeconds);
        parcel.writeString(this.loginModelCode);
        parcel.writeString(this.status.name());
        parcel.writeString(this.responseType);
        parcel.writeString(this.finalAuthState);
        parcel.writeString(this.code);
    }
}
