package com.tinder.auth.accountkit;

import android.app.Fragment;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.accountkit.ui.LoginFlowState;
import com.tinder.auth.interactor.AddSmsValidateEvent;
import com.tinder.auth.interactor.AddSmsValidateEvent.C8275a;
import com.tinder.auth.interactor.AddSmsValidateEvent.EventCode;
import com.tinder.auth.interactor.AddSmsValidateEvent.VerifyMethod;
import com.tinder.managers.ManagerApp;
import javax.inject.Inject;

public class ValidateAccountKitUiManager extends TinderAccountKitUiManager {
    public static final Creator<ValidateAccountKitUiManager> CREATOR = new C82681();
    @Inject
    @NonNull
    AddSmsValidateEvent addSmsValidateEvent;

    /* renamed from: com.tinder.auth.accountkit.ValidateAccountKitUiManager$1 */
    static class C82681 implements Creator<ValidateAccountKitUiManager> {
        C82681() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m35312a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m35313a(i);
        }

        /* renamed from: a */
        public ValidateAccountKitUiManager m35312a(Parcel parcel) {
            return new ValidateAccountKitUiManager(parcel);
        }

        /* renamed from: a */
        public ValidateAccountKitUiManager[] m35313a(int i) {
            return new ValidateAccountKitUiManager[i];
        }
    }

    /* renamed from: com.tinder.auth.accountkit.ValidateAccountKitUiManager$2 */
    static /* synthetic */ class C82692 {
        /* renamed from: a */
        static final /* synthetic */ int[] f29514a = new int[LoginFlowState.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.facebook.accountkit.ui.LoginFlowState.values();
            r0 = r0.length;
            r0 = new int[r0];
            f29514a = r0;
            r0 = f29514a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.facebook.accountkit.ui.LoginFlowState.PHONE_NUMBER_INPUT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f29514a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.facebook.accountkit.ui.LoginFlowState.SENDING_CODE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f29514a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.facebook.accountkit.ui.LoginFlowState.CODE_INPUT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f29514a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.facebook.accountkit.ui.LoginFlowState.VERIFYING_CODE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f29514a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.facebook.accountkit.ui.LoginFlowState.ERROR;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.auth.accountkit.ValidateAccountKitUiManager.2.<clinit>():void");
        }
    }

    public ValidateAccountKitUiManager(int i, @NonNull AddSmsValidateEvent addSmsValidateEvent) {
        super(i);
        this.addSmsValidateEvent = addSmsValidateEvent;
    }

    public ValidateAccountKitUiManager(Parcel parcel) {
        super(parcel);
        ManagerApp.e().inject(this);
    }

    @Nullable
    public Fragment getBodyFragment(@NonNull LoginFlowState loginFlowState) {
        EventCode eventCode;
        VerifyMethod verifyMethod = VerifyMethod.ACCOUNT_KIT;
        switch (C82692.f29514a[loginFlowState.ordinal()]) {
            case 1:
                eventCode = EventCode.REQUEST_PHONE;
                break;
            case 2:
                eventCode = EventCode.SUBMIT_PHONE;
                break;
            case 3:
                eventCode = EventCode.REQUEST_VERIFY_CODE;
                break;
            case 4:
                eventCode = EventCode.SUBMIT_VERIFY_CODE;
                break;
            case 5:
                eventCode = EventCode.ERROR_RETRIEVING_CODE;
                break;
            default:
                eventCode = null;
                break;
        }
        if (eventCode != null) {
            this.addSmsValidateEvent.m42113a(new C8275a(eventCode, verifyMethod, null));
        }
        return super.getBodyFragment(loginFlowState);
    }
}
