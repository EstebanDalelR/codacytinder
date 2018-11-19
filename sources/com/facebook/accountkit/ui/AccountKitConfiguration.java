package com.facebook.accountkit.ui;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.ui.AccountKitActivity.ResponseType;
import com.facebook.accountkit.ui.AccountKitActivity.TitleType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public final class AccountKitConfiguration implements Parcelable {
    public static final Creator CREATOR = new C12541();
    static final String TAG = "AccountKitConfiguration";
    private final String defaultCountryCode;
    private final String initialAuthState;
    private final String initialEmail;
    private final PhoneNumber initialPhoneNumber;
    private final LoginType loginType;
    private final LinkedHashSet<NotificationChannel> notificationChannels;
    private final boolean readPhoneStateEnabled;
    private final boolean receiveSMSEnabled;
    private final ResponseType responseType;
    private final String[] smsBlacklist;
    private final String[] smsWhitelist;
    @NonNull
    private final UIManager uiManager;

    /* renamed from: com.facebook.accountkit.ui.AccountKitConfiguration$1 */
    static class C12541 implements Creator {
        C12541() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4530a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4531a(i);
        }

        /* renamed from: a */
        public AccountKitConfiguration m4530a(Parcel parcel) {
            return new AccountKitConfiguration(parcel);
        }

        /* renamed from: a */
        public AccountKitConfiguration[] m4531a(int i) {
            return new AccountKitConfiguration[i];
        }
    }

    /* renamed from: com.facebook.accountkit.ui.AccountKitConfiguration$a */
    public static class C1255a {
        /* renamed from: a */
        private UIManagerStub f3363a;
        /* renamed from: b */
        private String f3364b;
        /* renamed from: c */
        private final LinkedHashSet<NotificationChannel> f3365c = new LinkedHashSet(NotificationChannel.values().length);
        /* renamed from: d */
        private String f3366d;
        /* renamed from: e */
        private String f3367e;
        /* renamed from: f */
        private PhoneNumber f3368f;
        /* renamed from: g */
        private LoginType f3369g;
        /* renamed from: h */
        private boolean f3370h = true;
        /* renamed from: i */
        private boolean f3371i = true;
        /* renamed from: j */
        private ResponseType f3372j;
        /* renamed from: k */
        private String[] f3373k;
        /* renamed from: l */
        private String[] f3374l;
        @Deprecated
        /* renamed from: m */
        private int f3375m = -1;

        public C1255a(LoginType loginType, ResponseType responseType) {
            this.f3365c.add(NotificationChannel.FACEBOOK);
            this.f3365c.add(NotificationChannel.VOICE_CALLBACK);
            this.f3369g = loginType;
            this.f3372j = responseType;
        }

        /* renamed from: a */
        public C1255a m4532a(@Nullable UIManager uIManager) {
            this.f3363a = uIManager;
            this.f3375m = -1;
            return this;
        }

        /* renamed from: a */
        public C1255a m4533a(@Nullable String str) {
            this.f3364b = str;
            return this;
        }

        /* renamed from: a */
        public AccountKitConfiguration m4534a() {
            if (this.f3363a == null) {
                r0.f3363a = new ThemeUIManager(r0.f3375m);
            } else if (r0.f3375m != -1 && (r0.f3363a instanceof SkinManager)) {
                ((UIManager) r0.f3363a).setThemeId(r0.f3375m);
            }
            if (r0.f3363a instanceof AdvancedUIManager) {
                r0.f3363a = new AdvancedUIManagerWrapper((AdvancedUIManager) r0.f3363a, r0.f3375m);
            }
            return new AccountKitConfiguration((UIManager) r0.f3363a, r0.f3364b, r0.f3365c, r0.f3366d, r0.f3367e, r0.f3368f, r0.f3369g, r0.f3370h, r0.f3371i, r0.f3372j, r0.f3373k, r0.f3374l);
        }
    }

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public TitleType getTitleType() {
        return null;
    }

    private AccountKitConfiguration(@NonNull UIManager uIManager, String str, LinkedHashSet<NotificationChannel> linkedHashSet, String str2, String str3, PhoneNumber phoneNumber, LoginType loginType, boolean z, boolean z2, ResponseType responseType, String[] strArr, String[] strArr2) {
        this.notificationChannels = new LinkedHashSet(NotificationChannel.values().length);
        this.initialAuthState = str2;
        this.defaultCountryCode = str;
        this.initialEmail = str3;
        this.notificationChannels.addAll(linkedHashSet);
        this.uiManager = uIManager;
        this.loginType = loginType;
        this.initialPhoneNumber = phoneNumber;
        this.readPhoneStateEnabled = z;
        this.receiveSMSEnabled = z2;
        this.responseType = responseType;
        this.smsBlacklist = strArr;
        this.smsWhitelist = strArr2;
    }

    @Nullable
    @Deprecated
    public AdvancedUIManager getAdvancedUIManager() {
        return this.uiManager instanceof AdvancedUIManagerWrapper ? ((AdvancedUIManagerWrapper) this.uiManager).getAdvancedUIManager() : null;
    }

    @NonNull
    public UIManager getUIManager() {
        return this.uiManager;
    }

    public String getDefaultCountryCode() {
        return this.defaultCountryCode;
    }

    public List<NotificationChannel> getNotificationChannels() {
        return Collections.unmodifiableList(new ArrayList(this.notificationChannels));
    }

    public boolean areFacebookNotificationsEnabled() {
        return getNotificationChannels().contains(NotificationChannel.FACEBOOK);
    }

    public String getInitialAuthState() {
        return this.initialAuthState;
    }

    public String getInitialEmail() {
        return this.initialEmail;
    }

    public PhoneNumber getInitialPhoneNumber() {
        return this.initialPhoneNumber;
    }

    public LoginType getLoginType() {
        return this.loginType;
    }

    public boolean isReadPhoneStateEnabled() {
        return this.readPhoneStateEnabled;
    }

    public boolean isReceiveSMSEnabled() {
        return this.receiveSMSEnabled;
    }

    public ResponseType getResponseType() {
        return this.responseType;
    }

    public String[] getSmsBlacklist() {
        return this.smsBlacklist;
    }

    public String[] getSmsWhitelist() {
        return this.smsWhitelist;
    }

    @Deprecated
    public int getTheme() {
        return this.uiManager.getThemeId();
    }

    private AccountKitConfiguration(Parcel parcel) {
        this.notificationChannels = new LinkedHashSet(NotificationChannel.values().length);
        this.uiManager = (UIManager) parcel.readParcelable(UIManager.class.getClassLoader());
        this.defaultCountryCode = parcel.readString();
        this.notificationChannels.clear();
        for (int i : parcel.createIntArray()) {
            this.notificationChannels.add(NotificationChannel.values()[i]);
        }
        this.initialAuthState = parcel.readString();
        this.initialEmail = parcel.readString();
        this.initialPhoneNumber = (PhoneNumber) parcel.readParcelable(PhoneNumber.class.getClassLoader());
        this.loginType = LoginType.valueOf(parcel.readString());
        boolean z = true;
        this.readPhoneStateEnabled = parcel.readByte() != (byte) 0;
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.receiveSMSEnabled = z;
        this.responseType = ResponseType.valueOf(parcel.readString());
        this.smsBlacklist = parcel.createStringArray();
        this.smsWhitelist = parcel.createStringArray();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.uiManager, i);
        parcel.writeString(this.defaultCountryCode);
        NotificationChannel[] notificationChannelArr = new NotificationChannel[this.notificationChannels.size()];
        this.notificationChannels.toArray(notificationChannelArr);
        int[] iArr = new int[notificationChannelArr.length];
        for (int i2 = 0; i2 < notificationChannelArr.length; i2++) {
            iArr[i2] = notificationChannelArr[i2].ordinal();
        }
        parcel.writeIntArray(iArr);
        parcel.writeString(this.initialAuthState);
        parcel.writeString(this.initialEmail);
        parcel.writeParcelable(this.initialPhoneNumber, i);
        parcel.writeString(this.loginType.name());
        parcel.writeByte((byte) this.readPhoneStateEnabled);
        parcel.writeByte((byte) this.receiveSMSEnabled);
        parcel.writeString(this.responseType.name());
        parcel.writeStringArray(this.smsBlacklist);
        parcel.writeStringArray(this.smsWhitelist);
    }
}
