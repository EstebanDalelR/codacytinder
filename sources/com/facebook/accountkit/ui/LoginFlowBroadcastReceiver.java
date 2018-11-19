package com.facebook.accountkit.ui;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

abstract class LoginFlowBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private static final String f3412a = "LoginFlowBroadcastReceiver";
    /* renamed from: b */
    public static final String f3413b;
    /* renamed from: c */
    public static final String f3414c;
    /* renamed from: d */
    public static final String f3415d;
    /* renamed from: e */
    public static final String f3416e;
    /* renamed from: f */
    public static final String f3417f;
    /* renamed from: g */
    public static final String f3418g;

    public enum Event {
        SENT_CODE_COMPLETE,
        ACCOUNT_VERIFIED_COMPLETE,
        CONFIRM_SEAMLESS_LOGIN,
        EMAIL_LOGIN_COMPLETE,
        EMAIL_VERIFY_RETRY,
        ERROR_RESTART,
        PHONE_LOGIN_COMPLETE,
        PHONE_CONFIRMATION_CODE_COMPLETE,
        PHONE_CONFIRMATION_CODE_RETRY,
        PHONE_RESEND,
        PHONE_RESEND_FACEBOOK_NOTIFICATION,
        PHONE_RESEND_VOICE_CALL_NOTIFICATION
    }

    LoginFlowBroadcastReceiver() {
    }

    /* renamed from: a */
    public static IntentFilter m4564a() {
        return new IntentFilter(f3413b);
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f3412a);
        stringBuilder.append(".action_update");
        f3413b = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3412a);
        stringBuilder.append(".extra_event");
        f3414c = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3412a);
        stringBuilder.append(".extra_email");
        f3415d = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3412a);
        stringBuilder.append(".extra_confirmationCode");
        f3416e = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3412a);
        stringBuilder.append(".extra_phoneNumber");
        f3417f = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3412a);
        stringBuilder.append(".EXTRA_RETURN_LOGIN_FLOW_STATE");
        f3418g = stringBuilder.toString();
    }
}
