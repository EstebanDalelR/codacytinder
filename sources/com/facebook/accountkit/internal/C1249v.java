package com.facebook.accountkit.internal;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.PhoneNumber;

/* renamed from: com.facebook.accountkit.internal.v */
final class C1249v {
    @Nullable
    /* renamed from: a */
    private volatile C1247u f3347a;
    @Nullable
    /* renamed from: b */
    private volatile Activity f3348b;
    /* renamed from: c */
    private volatile boolean f3349c = false;
    /* renamed from: d */
    private final C1237m f3350d;
    /* renamed from: e */
    private final C0436c f3351e;

    C1249v(C1237m c1237m, C0436c c0436c) {
        this.f3350d = c1237m;
        this.f3351e = c0436c;
    }

    @Nullable
    /* renamed from: a */
    PhoneUpdateModelImpl m4470a(PhoneNumber phoneNumber, @Nullable String str) {
        C1251w.m4510d();
        if (AccountKit.m4116e() == null) {
            return null;
        }
        m4471a();
        PhoneUpdateModelImpl phoneUpdateModelImpl = new PhoneUpdateModelImpl(phoneNumber);
        phoneNumber = new C1247u(this, phoneUpdateModelImpl);
        phoneNumber.m4464a(str);
        this.f3350d.m4376a("ak_update_start", phoneUpdateModelImpl);
        this.f3347a = phoneNumber;
        return phoneUpdateModelImpl;
    }

    /* renamed from: a */
    void m4474a(String str) {
        C1251w.m4510d();
        if (AccountKit.m4116e() != null) {
            PhoneUpdateModelImpl f = m4469f();
            if (f != null) {
                try {
                    f.setConfirmationCode(str);
                    m4467a(f);
                    this.f3350d.m4376a("ak_update_verify", f);
                } catch (String str2) {
                    if (C1251w.m4496a(C1220c.m4288a())) {
                        throw str2;
                    }
                    this.f3350d.m4376a("ak_confirmation_code_set", f);
                }
            }
        }
    }

    /* renamed from: a */
    void m4471a() {
        if (this.f3347a != null) {
            this.f3347a.m4465b();
        }
    }

    /* renamed from: b */
    C1237m m4475b() {
        return this.f3350d;
    }

    /* renamed from: a */
    void m4473a(Activity activity, Bundle bundle) {
        this.f3349c = true;
        this.f3348b = activity;
        this.f3350d.m4381b(bundle);
        if (bundle != null) {
            PhoneUpdateModelImpl phoneUpdateModelImpl = (PhoneUpdateModelImpl) bundle.getParcelable("accountkitUpdateModel");
            if (phoneUpdateModelImpl != null) {
                m4468b(phoneUpdateModelImpl);
            }
        }
    }

    /* renamed from: a */
    void m4472a(Activity activity) {
        if (this.f3348b == activity) {
            this.f3349c = null;
            this.f3348b = null;
            this.f3347a = null;
            C1224e.m4323b();
            C1224e.m4321a(null);
        }
    }

    /* renamed from: b */
    void m4476b(Activity activity, Bundle bundle) {
        if (this.f3348b == activity) {
            this.f3350d.m4371a(bundle);
            if (this.f3347a != null) {
                bundle.putParcelable("accountkitUpdateModel", this.f3347a.m4466c());
            }
        }
    }

    /* renamed from: c */
    boolean m4477c() {
        return this.f3349c;
    }

    /* renamed from: d */
    void m4478d() {
        this.f3347a = null;
    }

    /* renamed from: e */
    C0436c m4479e() {
        return this.f3351e;
    }

    /* renamed from: a */
    private void m4467a(PhoneUpdateModelImpl phoneUpdateModelImpl) {
        C1251w.m4510d();
        if (this.f3347a != null) {
            switch (phoneUpdateModelImpl.getStatus()) {
                case EMPTY:
                case SUCCESS:
                    break;
                case PENDING:
                    this.f3347a.m4462a();
                    break;
                case CANCELLED:
                    this.f3347a.m4465b();
                    break;
                case ERROR:
                    this.f3347a.m4463a(phoneUpdateModelImpl.getError());
                    break;
                default:
                    break;
            }
        }
    }

    @Nullable
    /* renamed from: f */
    private PhoneUpdateModelImpl m4469f() {
        if (this.f3347a == null) {
            return null;
        }
        return this.f3347a.m4466c();
    }

    /* renamed from: b */
    private void m4468b(PhoneUpdateModelImpl phoneUpdateModelImpl) {
        C1251w.m4510d();
        this.f3347a = new C1247u(this, phoneUpdateModelImpl);
        m4467a(phoneUpdateModelImpl);
    }
}
