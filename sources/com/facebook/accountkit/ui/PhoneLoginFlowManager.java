package com.facebook.accountkit.ui;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.internal.C1220c;
import com.facebook.accountkit.ui.AccountKitActivity.ResponseType;

class PhoneLoginFlowManager extends LoginFlowManager {
    public static final Creator<PhoneLoginFlowManager> CREATOR = new C12931();
    private PhoneNumber lastUsedPhoneNumber;
    private NotificationChannel notificationChannel = NotificationChannel.SMS;

    /* renamed from: com.facebook.accountkit.ui.PhoneLoginFlowManager$1 */
    static class C12931 implements Creator<PhoneLoginFlowManager> {
        C12931() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4581a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4582a(i);
        }

        /* renamed from: a */
        public PhoneLoginFlowManager m4581a(Parcel parcel) {
            return new PhoneLoginFlowManager(parcel);
        }

        /* renamed from: a */
        public PhoneLoginFlowManager[] m4582a(int i) {
            return new PhoneLoginFlowManager[i];
        }
    }

    PhoneLoginFlowManager(AccountKitConfiguration accountKitConfiguration) {
        super(LoginType.PHONE);
        this.activityHandler = new ActivityPhoneHandler(accountKitConfiguration);
    }

    private PhoneNumber getLastUsedPhoneNumber() {
        return this.lastUsedPhoneNumber;
    }

    void setLastUsedPhoneNumber(PhoneNumber phoneNumber) {
        this.lastUsedPhoneNumber = phoneNumber;
    }

    public void logInWithPhoneNumber(PhoneNumber phoneNumber, NotificationChannel notificationChannel, ResponseType responseType, @Nullable String str) {
        if (isValid()) {
            setLastUsedPhoneNumber(phoneNumber);
            C1220c.m4290a(phoneNumber, notificationChannel, responseType.getValue(), str);
        }
    }

    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    public void setConfirmationCode(String str) {
        if (isValid()) {
            C1220c.m4295a(str);
        }
    }

    void confirmSeamlessLogin() {
        if (isValid()) {
            C1220c.m4305f();
        }
    }

    PhoneLoginFlowManager(Parcel parcel) {
        super(parcel);
        this.activityHandler = (ActivityHandler) parcel.readParcelable(ActivityPhoneHandler.class.getClassLoader());
        setLastUsedPhoneNumber((PhoneNumber) parcel.readParcelable(PhoneNumber.class.getClassLoader()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.activityHandler, i);
        parcel.writeParcelable(getLastUsedPhoneNumber(), i);
    }
}
