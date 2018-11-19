package com.facebook.accountkit.ui;

import android.support.annotation.Nullable;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.ui.C1327y.C4351a;
import com.facebook.accountkit.ui.C1328z.C4132a;

/* renamed from: com.facebook.accountkit.ui.m */
abstract class C4129m extends C3210g {
    /* renamed from: a */
    private static final LoginFlowState f13104a = LoginFlowState.ERROR;
    /* renamed from: b */
    private C4351a f13105b;
    /* renamed from: c */
    private C4132a f13106c;
    /* renamed from: d */
    private C4132a f13107d;
    /* renamed from: f */
    private C4351a f13108f;
    /* renamed from: g */
    private C4351a f13109g;

    C4129m(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: b */
    public void mo3260b(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13105b = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    public void mo3258a(@Nullable C4132a c4132a) {
        this.f13106c = c4132a;
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.f13107d == null) {
            this.f13107d = C1328z.m4644a(this.e.getUIManager(), C1194g.com_accountkit_error_title, new String[0]);
        }
        return this.f13107d;
    }

    /* renamed from: b */
    public void mo3271b(@Nullable C4132a c4132a) {
        this.f13107d = c4132a;
    }

    /* renamed from: d */
    public LoginFlowState mo3261d() {
        return f13104a;
    }

    /* renamed from: e */
    public C4127h mo3262e() {
        if (this.f13108f == null) {
            this.f13108f = C1327y.m4641a(this.e.getUIManager(), mo3261d());
        }
        return this.f13108f;
    }

    /* renamed from: f */
    public C4127h mo3263f() {
        if (this.f13109g == null) {
            mo3273c(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13109g;
    }

    /* renamed from: c */
    public void mo3273c(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13109g = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    protected void mo3256a() {
        C1219a.m4269a(true, this.e.getLoginType());
    }

    /* renamed from: a */
    void m16196a(@Nullable String str) {
        if (this.f13107d != null) {
            this.f13107d.m16235a(str);
        }
    }
}
