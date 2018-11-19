package com.facebook.accountkit.ui;

import android.support.annotation.Nullable;
import android.telephony.PhoneNumberUtils;
import android.text.TextWatcher;
import com.google.i18n.phonenumbers.C5621b;
import com.google.i18n.phonenumbers.PhoneNumberUtil;

/* renamed from: com.facebook.accountkit.ui.r */
public class C1323r implements TextWatcher {
    /* renamed from: a */
    private boolean f3466a = false;
    /* renamed from: b */
    private C5621b f3467b;

    public C1323r(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.f3467b = PhoneNumberUtil.b().d(str);
    }

    public synchronized void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f3466a == null) {
        }
    }

    public synchronized void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f3466a == null) {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void afterTextChanged(android.text.Editable r9) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.f3466a;	 Catch:{ all -> 0x003b }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r8);
        return;
    L_0x0007:
        r0 = android.text.Selection.getSelectionEnd(r9);	 Catch:{ all -> 0x003b }
        r0 = r8.m4640a(r9, r0);	 Catch:{ all -> 0x003b }
        if (r0 == 0) goto L_0x0039;
    L_0x0011:
        r1 = r8.f3467b;	 Catch:{ all -> 0x003b }
        r7 = r1.c();	 Catch:{ all -> 0x003b }
        r1 = 1;
        r8.f3466a = r1;	 Catch:{ all -> 0x003b }
        r2 = 0;
        r3 = r9.length();	 Catch:{ all -> 0x003b }
        r5 = 0;
        r6 = r0.length();	 Catch:{ all -> 0x003b }
        r1 = r9;
        r4 = r0;
        r1.replace(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x003b }
        r1 = r9.toString();	 Catch:{ all -> 0x003b }
        r0 = r0.equals(r1);	 Catch:{ all -> 0x003b }
        if (r0 == 0) goto L_0x0036;
    L_0x0033:
        android.text.Selection.setSelection(r9, r7);	 Catch:{ all -> 0x003b }
    L_0x0036:
        r9 = 0;
        r8.f3466a = r9;	 Catch:{ all -> 0x003b }
    L_0x0039:
        monitor-exit(r8);
        return;
    L_0x003b:
        r9 = move-exception;
        monitor-exit(r8);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.ui.r.afterTextChanged(android.text.Editable):void");
    }

    @Nullable
    /* renamed from: a */
    private String m4640a(CharSequence charSequence, int i) {
        i--;
        this.f3467b.a();
        int length = charSequence.length();
        String str = null;
        char c = '\u0000';
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i2);
            if (PhoneNumberUtils.isNonSeparator(charAt)) {
                if (c != '\u0000') {
                    str = m4639a(c, z);
                    z = false;
                }
                c = charAt;
            }
            if (i2 == i) {
                z = true;
            }
        }
        return c != '\u0000' ? m4639a(c, z) : str;
    }

    /* renamed from: a */
    private String m4639a(char c, boolean z) {
        if (z) {
            return this.f3467b.b(c);
        }
        return this.f3467b.a(c);
    }
}
