package com.facebook.accountkit.ui;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.accountkit.internal.C1220c;
import com.facebook.accountkit.ui.AccountKitActivity.ResponseType;

class EmailLoginFlowManager extends LoginFlowManager {
    public static final Creator<EmailLoginFlowManager> CREATOR = new C12821();
    private String email;

    /* renamed from: com.facebook.accountkit.ui.EmailLoginFlowManager$1 */
    static class C12821 implements Creator<EmailLoginFlowManager> {
        C12821() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4558a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4559a(i);
        }

        /* renamed from: a */
        public EmailLoginFlowManager m4558a(Parcel parcel) {
            return new EmailLoginFlowManager(parcel);
        }

        /* renamed from: a */
        public EmailLoginFlowManager[] m4559a(int i) {
            return new EmailLoginFlowManager[i];
        }
    }

    public EmailLoginFlowManager(AccountKitConfiguration accountKitConfiguration) {
        super(LoginType.EMAIL);
        this.activityHandler = new ActivityEmailHandler(accountKitConfiguration);
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void logInWithEmail(ResponseType responseType, @Nullable String str) {
        if (isValid()) {
            if (this.email != null) {
                C1220c.m4289a(this.email, responseType.getValue(), str);
            }
        }
    }

    protected EmailLoginFlowManager(Parcel parcel) {
        super(parcel);
        this.activityHandler = (ActivityHandler) parcel.readParcelable(ActivityEmailHandler.class.getClassLoader());
        this.email = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.activityHandler, i);
        parcel.writeString(this.email);
    }
}
