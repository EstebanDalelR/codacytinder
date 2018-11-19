package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.AccountKitException;
import com.facebook.accountkit.C1196d.C1193f;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.internal.InternalAccountKitError;
import com.facebook.accountkit.ui.UIManager.UIManagerListener;

public class BaseUIManager implements Parcelable, UIManager {
    public static final Creator<BaseUIManager> CREATOR = new C12631();
    public static final int THEME_ID_NOT_SET = -1;
    private Fragment bodyFragment;
    private LoginFlowState flowState;
    private Fragment footerFragment;
    private Fragment headerFragment;
    protected UIManagerListener listener;
    @StyleRes
    private int themeId;

    /* renamed from: com.facebook.accountkit.ui.BaseUIManager$1 */
    static class C12631 implements Creator<BaseUIManager> {
        C12631() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4546a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4547a(i);
        }

        /* renamed from: a */
        public BaseUIManager m4546a(Parcel parcel) {
            return new BaseUIManager(parcel);
        }

        /* renamed from: a */
        public BaseUIManager[] m4547a(int i) {
            return new BaseUIManager[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void onError(AccountKitError accountKitError) {
    }

    public BaseUIManager(@StyleRes int i) {
        this.themeId = i;
        this.flowState = LoginFlowState.NONE;
    }

    protected BaseUIManager(Parcel parcel) {
        this.themeId = parcel.readInt();
        this.flowState = LoginFlowState.values()[parcel.readInt()];
    }

    LoginFlowState getFlowState() {
        return this.flowState;
    }

    public int getThemeId() {
        return this.themeId;
    }

    public void setThemeId(@StyleRes int i) {
        this.themeId = i;
    }

    protected void updateFlowState(LoginFlowState loginFlowState) {
        if (this.flowState != loginFlowState) {
            this.flowState = loginFlowState;
            this.headerFragment = null;
            this.bodyFragment = null;
            this.footerFragment = null;
        }
    }

    @Nullable
    public Fragment getBodyFragment(LoginFlowState loginFlowState) {
        updateFlowState(loginFlowState);
        if (this.bodyFragment != null) {
            return this.bodyFragment;
        }
        this.bodyFragment = getDefaultBodyFragment((UIManager) this, this.flowState);
        return this.bodyFragment;
    }

    @NonNull
    static Fragment getDefaultBodyFragment(UIManager uIManager, LoginFlowState loginFlowState) {
        switch (loginFlowState) {
            case ACCOUNT_VERIFIED:
                return C1327y.m4642a(uIManager, loginFlowState, C1193f.com_accountkit_fragment_sent_code_center);
            case CONFIRM_ACCOUNT_VERIFIED:
                return C1327y.m4641a(uIManager, loginFlowState);
            case CODE_INPUT:
                return C1327y.m4642a(uIManager, loginFlowState, C1193f.com_accountkit_fragment_confirmation_code_center);
            case EMAIL_INPUT:
                return C1327y.m4642a(uIManager, loginFlowState, C1193f.com_accountkit_fragment_email_login_center);
            case EMAIL_VERIFY:
                return C1327y.m4642a(uIManager, loginFlowState, C1193f.com_accountkit_fragment_email_verify_center);
            case ERROR:
                return C1327y.m4642a(uIManager, loginFlowState, C1193f.com_accountkit_fragment_error_center);
            case PHONE_NUMBER_INPUT:
                return C1327y.m4642a(uIManager, loginFlowState, C1193f.com_accountkit_fragment_phone_login_center);
            case SENDING_CODE:
            case CONFIRM_INSTANT_VERIFICATION_LOGIN:
                return C1327y.m4642a(uIManager, loginFlowState, C1193f.com_accountkit_fragment_sending_code_center);
            case SENT_CODE:
                return C1327y.m4642a(uIManager, loginFlowState, C1193f.com_accountkit_fragment_sent_code_center);
            case VERIFIED:
                return C1327y.m4642a(uIManager, loginFlowState, C1193f.com_accountkit_fragment_verified_code_center);
            case VERIFYING_CODE:
                return C1327y.m4642a(uIManager, loginFlowState, C1193f.com_accountkit_fragment_verifying_code_center);
            default:
                return C1327y.m4641a(uIManager, loginFlowState);
        }
    }

    static Fragment getDefaultBodyFragment(UIManager uIManager, UpdateFlowState updateFlowState) {
        switch (updateFlowState) {
            case CODE_INPUT:
                return C1327y.m4642a(uIManager, LoginFlowState.NONE, C1193f.com_accountkit_fragment_confirmation_code_center);
            case CODE_INPUT_ERROR:
            case PHONE_NUMBER_INPUT_ERROR:
                return C1327y.m4642a(uIManager, LoginFlowState.NONE, C1193f.com_accountkit_fragment_error_center);
            case PHONE_NUMBER_INPUT:
                return C1327y.m4642a(uIManager, LoginFlowState.NONE, C1193f.com_accountkit_fragment_phone_login_center);
            case SENDING_CODE:
                return C1327y.m4642a(uIManager, LoginFlowState.NONE, C1193f.com_accountkit_fragment_sending_code_center);
            case SENT_CODE:
                return C1327y.m4642a(uIManager, LoginFlowState.NONE, C1193f.com_accountkit_fragment_sent_code_center);
            case VERIFIED:
                return C1327y.m4642a(uIManager, LoginFlowState.NONE, C1193f.com_accountkit_fragment_verified_code_center);
            case VERIFYING_CODE:
                return C1327y.m4642a(uIManager, LoginFlowState.NONE, C1193f.com_accountkit_fragment_verifying_code_center);
            default:
                return C1327y.m4641a(uIManager, LoginFlowState.NONE);
        }
    }

    @Nullable
    public ButtonType getButtonType(LoginFlowState loginFlowState) {
        updateFlowState(loginFlowState);
        return null;
    }

    @Nullable
    public Fragment getFooterFragment(LoginFlowState loginFlowState) {
        updateFlowState(loginFlowState);
        if (this.footerFragment != null) {
            return this.footerFragment;
        }
        this.footerFragment = getDefaultFooterFragment(this);
        return this.footerFragment;
    }

    @NonNull
    static Fragment getDefaultFooterFragment(UIManager uIManager) {
        return C1328z.m4643a(uIManager);
    }

    @Nullable
    public Fragment getHeaderFragment(LoginFlowState loginFlowState) {
        updateFlowState(loginFlowState);
        return this.headerFragment;
    }

    @NonNull
    static Fragment getDefaultHeaderFragment(UIManager uIManager, LoginFlowState loginFlowState, LoginType loginType, @Nullable NotificationChannel notificationChannel) {
        switch (loginFlowState) {
            case ACCOUNT_VERIFIED:
                loginFlowState = C1194g.com_accountkit_account_verified;
                break;
            case CONFIRM_ACCOUNT_VERIFIED:
            case CONFIRM_INSTANT_VERIFICATION_LOGIN:
                loginFlowState = C1194g.com_accountkit_account_verified;
                break;
            case CODE_INPUT:
                loginFlowState = C1194g.com_accountkit_confirmation_code_title;
                break;
            case EMAIL_INPUT:
                loginFlowState = C1194g.com_accountkit_email_login_title;
                break;
            case EMAIL_VERIFY:
                loginFlowState = C1194g.com_accountkit_email_verify_title;
                break;
            case ERROR:
                if (C12642.f3383c[loginType.ordinal()] == 1) {
                    loginFlowState = C1194g.com_accountkit_phone_error_title;
                    break;
                }
                loginFlowState = C1194g.com_accountkit_error_title;
                break;
            case PHONE_NUMBER_INPUT:
                loginFlowState = C1194g.com_accountkit_phone_login_title;
                break;
            case SENDING_CODE:
                switch (loginType) {
                    case PHONE:
                        if (notificationChannel != NotificationChannel.FACEBOOK) {
                            loginFlowState = C1194g.com_accountkit_phone_loading_title;
                            break;
                        }
                        loginFlowState = C1194g.com_accountkit_phone_sending_code_on_fb_title;
                        break;
                    case EMAIL:
                        loginFlowState = C1194g.com_accountkit_email_loading_title;
                        break;
                    default:
                        throw new AccountKitException(Type.INTERNAL_ERROR, InternalAccountKitError.UNEXPECTED_STATE);
                }
            case SENT_CODE:
                loginFlowState = C1194g.com_accountkit_sent_title;
                break;
            case VERIFIED:
                loginFlowState = C1194g.com_accountkit_success_title;
                break;
            case VERIFYING_CODE:
                loginFlowState = C1194g.com_accountkit_verify_title;
                break;
            case RESEND:
                loginFlowState = C1194g.com_accountkit_resend_title;
                break;
            default:
                loginFlowState = -1;
                break;
        }
        if (loginFlowState > -1) {
            return C1328z.m4644a(uIManager, loginFlowState, new String[null]);
        }
        return C1328z.m4643a(uIManager);
    }

    static Fragment getDefaultHeaderFragment(UIManager uIManager, UpdateFlowState updateFlowState) {
        switch (updateFlowState) {
            case CODE_INPUT:
                updateFlowState = C1194g.com_accountkit_confirmation_code_title;
                break;
            case CODE_INPUT_ERROR:
                updateFlowState = C1194g.com_accountkit_error_title;
                break;
            case PHONE_NUMBER_INPUT_ERROR:
                updateFlowState = C1194g.com_accountkit_phone_error_title;
                break;
            case PHONE_NUMBER_INPUT:
                updateFlowState = C1194g.com_accountkit_phone_update_title;
                break;
            case SENDING_CODE:
                updateFlowState = C1194g.com_accountkit_phone_loading_title;
                break;
            case SENT_CODE:
                updateFlowState = C1194g.com_accountkit_sent_title;
                break;
            case VERIFIED:
                updateFlowState = C1194g.com_accountkit_success_title;
                break;
            case VERIFYING_CODE:
                updateFlowState = C1194g.com_accountkit_verify_title;
                break;
            default:
                updateFlowState = -1;
                break;
        }
        if (updateFlowState > -1) {
            return C1328z.m4644a(uIManager, updateFlowState, new String[0]);
        }
        return C1328z.m4643a(uIManager);
    }

    @Nullable
    public TextPosition getTextPosition(LoginFlowState loginFlowState) {
        updateFlowState(loginFlowState);
        return TextPosition.BELOW_BODY;
    }

    public void setUIManagerListener(UIManagerListener uIManagerListener) {
        this.listener = uIManagerListener;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.themeId);
        parcel.writeInt(this.flowState.ordinal());
    }
}
