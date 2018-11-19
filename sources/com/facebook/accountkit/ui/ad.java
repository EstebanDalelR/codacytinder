package com.facebook.accountkit.ui;

import android.support.annotation.Nullable;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.ui.C1327y.C4351a;
import com.facebook.accountkit.ui.C1328z.C4132a;

final class ad extends C3210g {
    /* renamed from: a */
    private static final LoginFlowState f13066a = LoginFlowState.VERIFIED;
    /* renamed from: b */
    private C4351a f13067b;
    /* renamed from: c */
    private C4351a f13068c;
    /* renamed from: d */
    private C4132a f13069d;
    /* renamed from: f */
    private C4132a f13070f;
    /* renamed from: g */
    private C4351a f13071g;
    /* renamed from: h */
    private C4351a f13072h;

    ad(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: b */
    public C4127h mo3259b() {
        if (this.f13067b == null) {
            mo3270a(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13067b;
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13067b = (C4351a) c4127h;
        }
    }

    /* renamed from: b */
    public void mo3260b(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13068c = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    public void mo3258a(@Nullable C4132a c4132a) {
        this.f13069d = c4132a;
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.f13070f == null) {
            mo3271b(C1328z.m4644a(this.e.getUIManager(), C1194g.com_accountkit_success_title, new String[0]));
        }
        return this.f13070f;
    }

    /* renamed from: b */
    public void mo3271b(@Nullable C4132a c4132a) {
        this.f13070f = c4132a;
    }

    /* renamed from: d */
    public LoginFlowState mo3261d() {
        return f13066a;
    }

    /* renamed from: e */
    public C4127h mo3262e() {
        if (this.f13071g == null) {
            this.f13071g = C1327y.m4641a(this.e.getUIManager(), mo3261d());
        }
        return this.f13071g;
    }

    /* renamed from: f */
    public C4127h mo3263f() {
        if (this.f13072h == null) {
            mo3273c(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13072h;
    }

    /* renamed from: c */
    public void mo3273c(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13072h = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    protected void mo3256a() {
        C1219a.m4286e(true, this.e.getLoginType());
    }
}
