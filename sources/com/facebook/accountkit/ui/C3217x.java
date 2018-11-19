package com.facebook.accountkit.ui;

import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import com.facebook.accountkit.C1198e;
import com.facebook.accountkit.internal.C1251w;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.facebook.accountkit.ui.x */
public abstract class C3217x extends C1198e {
    /* renamed from: a */
    private static final Pattern f9817a = Pattern.compile("(\\d{6})(?=.*\\bAccount Kit\\b)(?=.*\\bFacebook\\b)");

    /* renamed from: a */
    protected abstract void mo3244a(String str);

    /* renamed from: h */
    protected boolean mo1635h() {
        return false;
    }

    public C3217x() {
        m4137c();
    }

    /* renamed from: a */
    protected List<String> mo1563a() {
        return Arrays.asList(new String[]{"android.provider.Telephony.SMS_RECEIVED", "com.facebook.accountkit.SMS_RECIEVED", "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"});
    }

    /* renamed from: a */
    protected void mo1564a(Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            intent = intent.getExtras();
            Status status = (Status) intent.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            if (status != null) {
                if (status.getStatusCode() == 0) {
                    intent = (String) intent.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                }
            }
            intent = null;
        } else {
            Object[] objArr = (Object[]) intent.getSerializableExtra("pdus");
            StringBuilder stringBuilder = new StringBuilder();
            for (Object obj : objArr) {
                stringBuilder.append(SmsMessage.createFromPdu((byte[]) obj).getDisplayMessageBody());
            }
            intent = stringBuilder.toString();
        }
        if (intent != null) {
            String b = C3217x.m12266b(intent);
            if (b != null) {
                mo3244a(b);
            }
        }
    }

    /* renamed from: b */
    static String m12266b(String str) {
        str = f9817a.matcher(str);
        return str.find() ? str.group(1) : null;
    }

    /* renamed from: a */
    static boolean m12265a(Context context, AccountKitConfiguration accountKitConfiguration) {
        if (accountKitConfiguration.isReceiveSMSEnabled() == null) {
            return false;
        }
        if (C1251w.m4518g(context) == null && C1251w.m4504b(context) == null) {
            return false;
        }
        return true;
    }
}
