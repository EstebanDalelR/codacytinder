package com.facebook.accountkit.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.PhoneLoginModel;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.ui.NotificationChannel;
import java.util.HashMap;

public final class PhoneLoginModelImpl extends LoginModelImpl implements PhoneLoginModel {
    public static final Creator<PhoneLoginModelImpl> CREATOR = new C12141();
    private String confirmationCode;
    @NonNull
    private final NotificationChannel notificationChannel;
    private PhoneNumber phoneNumber;
    private long resendTime;

    /* renamed from: com.facebook.accountkit.internal.PhoneLoginModelImpl$1 */
    static class C12141 implements Creator<PhoneLoginModelImpl> {
        C12141() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4229a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4230a(i);
        }

        /* renamed from: a */
        public PhoneLoginModelImpl m4229a(Parcel parcel) {
            return new PhoneLoginModelImpl(parcel);
        }

        /* renamed from: a */
        public PhoneLoginModelImpl[] m4230a(int i) {
            return new PhoneLoginModelImpl[i];
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

    PhoneLoginModelImpl(PhoneNumber phoneNumber, @NonNull NotificationChannel notificationChannel, String str) {
        super(str);
        this.notificationChannel = notificationChannel;
        this.phoneNumber = phoneNumber;
    }

    void setConfirmationCode(@NonNull String str) {
        C1252x.m4529a(getStatus(), LoginStatus.PENDING, "Phone status");
        C1252x.m4525a();
        this.confirmationCode = str;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getConfirmationCode() {
        return this.confirmationCode;
    }

    public long getResendTime() {
        return this.resendTime;
    }

    @NonNull
    public NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void setResendTime(long j) {
        this.resendTime = j;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneLoginModelImpl)) {
            return false;
        }
        PhoneLoginModelImpl phoneLoginModelImpl = (PhoneLoginModelImpl) obj;
        if (!super.equals(phoneLoginModelImpl) || !C1251w.m4505b(this.confirmationCode, phoneLoginModelImpl.confirmationCode) || !C1251w.m4505b(this.phoneNumber, phoneLoginModelImpl.phoneNumber) || this.notificationChannel != phoneLoginModelImpl.notificationChannel || this.resendTime != phoneLoginModelImpl.resendTime) {
            z = false;
        }
        return z;
    }

    private PhoneLoginModelImpl(Parcel parcel) {
        super(parcel);
        this.phoneNumber = (PhoneNumber) parcel.readParcelable(PhoneNumber.class.getClassLoader());
        this.confirmationCode = parcel.readString();
        this.notificationChannel = NotificationChannel.values()[parcel.readInt()];
        this.fields = new HashMap();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.fields.put(parcel.readString(), parcel.readString());
        }
        this.resendTime = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.phoneNumber, i);
        parcel.writeString(this.confirmationCode);
        parcel.writeInt(this.notificationChannel.ordinal());
        parcel.writeInt(this.fields.size());
        for (String str : this.fields.keySet()) {
            parcel.writeString(str);
            parcel.writeString((String) this.fields.get(str));
        }
        parcel.writeLong(this.resendTime);
    }
}
