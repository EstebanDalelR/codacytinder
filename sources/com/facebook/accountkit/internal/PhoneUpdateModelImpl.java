package com.facebook.accountkit.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.PhoneUpdateModel;
import java.util.HashMap;
import java.util.Map;

final class PhoneUpdateModelImpl implements PhoneUpdateModel {
    public static final Creator<PhoneUpdateModelImpl> CREATOR = new C12151();
    private String confirmationCode;
    private AccountKitError error;
    private long expiresInSeconds;
    private Map<String, String> fields;
    private String finalUpdateState;
    private String initialUpdateState;
    private PhoneNumber phoneNumber;
    private long resendTime;
    private UpdateStatus status;
    private String updateRequestCode;

    /* renamed from: com.facebook.accountkit.internal.PhoneUpdateModelImpl$1 */
    static class C12151 implements Creator<PhoneUpdateModelImpl> {
        C12151() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4231a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4232a(i);
        }

        /* renamed from: a */
        public PhoneUpdateModelImpl m4231a(Parcel parcel) {
            return new PhoneUpdateModelImpl(parcel);
        }

        /* renamed from: a */
        public PhoneUpdateModelImpl[] m4232a(int i) {
            return new PhoneUpdateModelImpl[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    PhoneUpdateModelImpl(PhoneNumber phoneNumber) {
        this.status = UpdateStatus.EMPTY;
        this.fields = new HashMap();
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getConfirmationCode() {
        return this.confirmationCode;
    }

    public String getInitialUpdateState() {
        return this.initialUpdateState;
    }

    public String getFinalUpdateState() {
        return this.finalUpdateState;
    }

    public String getUpdateRequestCode() {
        return this.updateRequestCode;
    }

    public long getResendTime() {
        return this.resendTime;
    }

    public UpdateStatus getStatus() {
        return this.status;
    }

    public AccountKitError getError() {
        return this.error;
    }

    void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void setConfirmationCode(String str) {
        C1252x.m4529a(getStatus(), UpdateStatus.PENDING, "Phone status");
        C1252x.m4525a();
        this.confirmationCode = str;
    }

    void setInitialUpdateState(String str) {
        this.initialUpdateState = str;
    }

    void setFinalUpdateState(String str) {
        this.finalUpdateState = str;
    }

    void setUpdateRequestCode(String str) {
        this.updateRequestCode = str;
    }

    void setExpiresInSeconds(long j) {
        this.expiresInSeconds = j;
    }

    void setResendTime(long j) {
        this.resendTime = j;
    }

    void setStatus(UpdateStatus updateStatus) {
        this.status = updateStatus;
    }

    void setError(AccountKitError accountKitError) {
        this.error = accountKitError;
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
        if (!(obj instanceof PhoneUpdateModelImpl)) {
            return false;
        }
        PhoneUpdateModelImpl phoneUpdateModelImpl = (PhoneUpdateModelImpl) obj;
        if (this.expiresInSeconds != phoneUpdateModelImpl.expiresInSeconds || this.resendTime != phoneUpdateModelImpl.resendTime || !C1251w.m4505b(this.error, phoneUpdateModelImpl.error) || !C1251w.m4505b(this.status, phoneUpdateModelImpl.status) || !C1251w.m4505b(this.phoneNumber, phoneUpdateModelImpl.phoneNumber) || !C1251w.m4505b(this.updateRequestCode, phoneUpdateModelImpl.updateRequestCode) || !C1251w.m4505b(this.finalUpdateState, phoneUpdateModelImpl.finalUpdateState) || C1251w.m4505b(this.confirmationCode, phoneUpdateModelImpl.confirmationCode) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.phoneNumber.hashCode()) * 31) + Long.valueOf(this.resendTime).hashCode()) * 31) + Long.valueOf(this.expiresInSeconds).hashCode()) * 31) + this.error.hashCode()) * 31) + this.status.hashCode()) * 31) + this.updateRequestCode.hashCode()) * 31) + this.finalUpdateState.hashCode()) * 31) + this.confirmationCode.hashCode();
    }

    private PhoneUpdateModelImpl(Parcel parcel) {
        this.status = UpdateStatus.EMPTY;
        this.fields = new HashMap();
        this.phoneNumber = (PhoneNumber) parcel.readParcelable(PhoneNumber.class.getClassLoader());
        this.resendTime = parcel.readLong();
        this.expiresInSeconds = parcel.readLong();
        this.confirmationCode = parcel.readString();
        this.updateRequestCode = parcel.readString();
        this.finalUpdateState = parcel.readString();
        this.error = (AccountKitError) parcel.readParcelable(AccountKitError.class.getClassLoader());
        this.status = UpdateStatus.valueOf(parcel.readString());
        this.fields = new HashMap();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.fields.put(parcel.readString(), parcel.readString());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.phoneNumber, i);
        parcel.writeLong(this.resendTime);
        parcel.writeLong(this.expiresInSeconds);
        parcel.writeString(this.confirmationCode);
        parcel.writeString(this.updateRequestCode);
        parcel.writeString(this.finalUpdateState);
        parcel.writeParcelable(this.error, i);
        parcel.writeString(this.status.name());
        parcel.writeInt(this.fields.size());
        for (String str : this.fields.keySet()) {
            parcel.writeString(str);
            parcel.writeString((String) this.fields.get(str));
        }
    }
}
