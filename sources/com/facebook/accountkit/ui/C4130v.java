package com.facebook.accountkit.ui;

import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.AccountKitException;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.internal.InternalAccountKitError;
import com.facebook.accountkit.ui.C1327y.C4351a;
import com.facebook.accountkit.ui.C1328z.C4132a;

/* renamed from: com.facebook.accountkit.ui.v */
final class C4130v extends C3210g {
    /* renamed from: a */
    private C4351a f13110a;
    /* renamed from: b */
    private C4351a f13111b;
    /* renamed from: c */
    private C4132a f13112c;
    /* renamed from: d */
    private C4132a f13113d;
    /* renamed from: f */
    private C4351a f13114f;
    /* renamed from: g */
    private C4351a f13115g;

    C4130v(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: b */
    public C4127h mo3259b() {
        if (this.f13110a == null) {
            mo3270a(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13110a;
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13110a = (C4351a) c4127h;
        }
    }

    /* renamed from: b */
    public void mo3260b(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13111b = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    public void mo3258a(@Nullable C4132a c4132a) {
        this.f13112c = c4132a;
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.f13113d == null) {
            int i;
            switch (this.e.getLoginType()) {
                case EMAIL:
                    i = C1194g.com_accountkit_email_loading_title;
                    break;
                case PHONE:
                    i = C1194g.com_accountkit_phone_loading_title;
                    break;
                default:
                    throw new AccountKitException(Type.INTERNAL_ERROR, InternalAccountKitError.UNEXPECTED_STATE);
            }
            mo3271b(C1328z.m4644a(this.e.getUIManager(), i, new String[0]));
        }
        return this.f13113d;
    }

    /* renamed from: b */
    public void mo3271b(@Nullable C4132a c4132a) {
        this.f13113d = c4132a;
    }

    /* renamed from: d */
    public LoginFlowState mo3261d() {
        return LoginFlowState.SENDING_CODE;
    }

    /* renamed from: e */
    public C4127h mo3262e() {
        if (this.f13114f == null) {
            this.f13114f = C1327y.m4641a(this.e.getUIManager(), mo3261d());
        }
        return this.f13114f;
    }

    /* renamed from: f */
    public C4127h mo3263f() {
        if (this.f13115g == null) {
            mo3273c(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13115g;
    }

    /* renamed from: c */
    public void mo3273c(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13115g = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    protected void mo3256a() {
        C1219a.m4275b(true, this.e.getLoginType());
    }
}
