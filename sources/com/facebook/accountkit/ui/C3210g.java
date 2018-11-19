package com.facebook.accountkit.ui;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.facebook.accountkit.ui.g */
public abstract class C3210g implements C1314f {
    /* renamed from: e */
    protected final AccountKitConfiguration f9811e;

    /* renamed from: a */
    protected abstract void mo3256a();

    /* renamed from: a */
    public void mo1629a(int i, int i2, Intent intent) {
    }

    /* renamed from: h */
    public boolean mo1632h() {
        return true;
    }

    C3210g(AccountKitConfiguration accountKitConfiguration) {
        this.f9811e = accountKitConfiguration;
    }

    /* renamed from: b */
    public void mo1631b(Activity activity) {
        ag.m4598a(activity);
    }

    /* renamed from: a */
    public void mo1630a(Activity activity) {
        mo3256a();
    }
}
