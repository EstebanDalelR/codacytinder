package com.facebook.accountkit.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.EmailLoginModel;
import java.util.HashMap;

public final class EmailLoginModelImpl extends LoginModelImpl implements EmailLoginModel {
    public static final Creator<EmailLoginModelImpl> CREATOR = new C12111();
    private String email;
    private int interval;

    /* renamed from: com.facebook.accountkit.internal.EmailLoginModelImpl$1 */
    static class C12111 implements Creator<EmailLoginModelImpl> {
        C12111() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4209a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4210a(i);
        }

        /* renamed from: a */
        public EmailLoginModelImpl m4209a(Parcel parcel) {
            return new EmailLoginModelImpl(parcel);
        }

        /* renamed from: a */
        public EmailLoginModelImpl[] m4210a(int i) {
            return new EmailLoginModelImpl[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    @Nullable
    public /* bridge */ /* synthetic */ AccessToken getAccessToken() {
        return super.getAccessToken();
    }

    public /* bridge */ /* synthetic */ String getCode() {
        return super.getCode();
    }

    public /* bridge */ /* synthetic */ AccountKitError getError() {
        return super.getError();
    }

    public /* bridge */ /* synthetic */ String getFinalAuthState() {
        return super.getFinalAuthState();
    }

    public /* bridge */ /* synthetic */ String getInitialAuthState() {
        return super.getInitialAuthState();
    }

    @Nullable
    public /* bridge */ /* synthetic */ String getPrivacyPolicy() {
        return super.getPrivacyPolicy();
    }

    public /* bridge */ /* synthetic */ String getResponseType() {
        return super.getResponseType();
    }

    public /* bridge */ /* synthetic */ LoginStatus getStatus() {
        return super.getStatus();
    }

    @Nullable
    public /* bridge */ /* synthetic */ String getTermsOfService() {
        return super.getTermsOfService();
    }

    public String getEmail() {
        return this.email;
    }

    public int getInterval() {
        return this.interval;
    }

    EmailLoginModelImpl(String str, String str2) {
        super(str2);
        this.email = str;
    }

    void setEmail(String str) {
        this.email = str;
    }

    void setInterval(int i) {
        this.interval = i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailLoginModelImpl)) {
            return false;
        }
        EmailLoginModelImpl emailLoginModelImpl = (EmailLoginModelImpl) obj;
        if (super.equals(obj) == null || this.interval != emailLoginModelImpl.interval || C1251w.m4505b(this.email, emailLoginModelImpl.email) == null) {
            z = false;
        }
        return z;
    }

    private EmailLoginModelImpl(Parcel parcel) {
        super(parcel);
        this.email = parcel.readString();
        this.interval = parcel.readInt();
        this.fields = new HashMap();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.fields.put(parcel.readString(), parcel.readString());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.email);
        parcel.writeInt(this.interval);
        parcel.writeInt(this.fields.size());
        for (String str : this.fields.keySet()) {
            parcel.writeString(str);
            parcel.writeString((String) this.fields.get(str));
        }
    }
}
