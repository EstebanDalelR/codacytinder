package com.facebook.accountkit;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

public abstract class UpdateFlowBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public static final String f3151a;
    /* renamed from: b */
    public static final String f3152b;
    /* renamed from: c */
    public static final String f3153c;
    /* renamed from: d */
    public static final String f3154d;
    /* renamed from: e */
    public static final String f3155e;
    /* renamed from: f */
    public static final String f3156f;
    /* renamed from: g */
    private static final String f3157g = "UpdateFlowBroadcastReceiver";

    public enum Event {
        UPDATE_START,
        SENT_CODE,
        SENT_CODE_COMPLETE,
        ERROR_UPDATE,
        ERROR_CONFIRMATION_CODE,
        RETRY_CONFIRMATION_CODE,
        CONFIRMATION_CODE_COMPLETE,
        ACCOUNT_UPDATE_COMPLETE,
        RETRY
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f3157g);
        stringBuilder.append(".action_update");
        f3151a = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3157g);
        stringBuilder.append(".extra_event");
        f3152b = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3157g);
        stringBuilder.append(".extra_phoneNumber");
        f3153c = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3157g);
        stringBuilder.append(".extra_error_message");
        f3154d = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3157g);
        stringBuilder.append(".extra_confirmationCode");
        f3155e = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(f3157g);
        stringBuilder.append(".extra_updateState");
        f3156f = stringBuilder.toString();
    }

    /* renamed from: a */
    public static IntentFilter m4129a() {
        return new IntentFilter(f3151a);
    }
}
