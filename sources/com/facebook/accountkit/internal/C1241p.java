package com.facebook.accountkit.internal;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import android.util.Log;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitCallback;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.AccountKitException;
import com.facebook.accountkit.LoginModel;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.internal.AccountKitGraphRequest.Callback;
import com.facebook.accountkit.internal.SeamlessLoginClient.CompletedListener;
import com.facebook.accountkit.ui.NotificationChannel;
import java.util.UUID;

/* renamed from: com.facebook.accountkit.internal.p */
final class C1241p {
    /* renamed from: a */
    private static final String f3326a = "com.facebook.accountkit.internal.p";
    /* renamed from: b */
    private final C1218b f3327b;
    /* renamed from: c */
    private volatile Activity f3328c;
    @Nullable
    /* renamed from: d */
    private volatile C1239o f3329d;
    /* renamed from: e */
    private volatile boolean f3330e = false;
    /* renamed from: f */
    private final C0436c f3331f;
    /* renamed from: g */
    private final C1237m f3332g;
    /* renamed from: h */
    private String f3333h;
    /* renamed from: i */
    private SeamlessLoginClient f3334i;
    /* renamed from: j */
    private String f3335j;
    /* renamed from: k */
    private long f3336k;

    /* renamed from: com.facebook.accountkit.internal.p$1 */
    class C31721 implements CompletedListener {
        /* renamed from: a */
        final /* synthetic */ C1241p f9751a;

        C31721(C1241p c1241p) {
            this.f9751a = c1241p;
        }

        public void completed(Bundle bundle) {
            this.f9751a.m4400a(bundle);
        }
    }

    C1241p(C1237m c1237m, C1218b c1218b, @NonNull C0436c c0436c) {
        this.f3327b = c1218b;
        this.f3331f = c0436c;
        this.f3332g = c1237m;
        m4408s();
    }

    /* renamed from: a */
    void m4417a(String str) {
        LoginModelImpl d = m4423d();
        if (d != null) {
            try {
                d.setConfirmationCode(str);
                m4416a(d);
            } catch (String str2) {
                if (C1251w.m4496a(C1220c.m4288a())) {
                    throw str2;
                }
                this.f3332g.m4375a("ak_confirmation_code_set", d);
            }
        }
    }

    /* renamed from: a */
    void m4411a() {
        LoginModelImpl p = m4405p();
        if (p != null) {
            try {
                m4416a(p);
            } catch (AccountKitException e) {
                if (C1251w.m4496a(C1220c.m4288a())) {
                    throw e;
                }
                this.f3332g.m4375a("ak_seamless_pending", p);
            }
        }
    }

    /* renamed from: a */
    void m4413a(Activity activity, Bundle bundle) {
        this.f3330e = true;
        this.f3328c = activity;
        this.f3332g.m4381b(bundle);
        if (bundle != null) {
            LoginModelImpl loginModelImpl = (LoginModelImpl) bundle.getParcelable("accountkitLoginModel");
            if (loginModelImpl != null) {
                m4404f(loginModelImpl);
            }
        }
    }

    /* renamed from: a */
    void m4412a(Activity activity) {
        if (this.f3328c == activity) {
            this.f3330e = null;
            this.f3329d = null;
            this.f3328c = null;
            C1224e.m4323b();
            C1224e.m4321a(null);
        }
    }

    /* renamed from: b */
    void m4419b(Activity activity, Bundle bundle) {
        if (this.f3328c == activity) {
            this.f3332g.m4371a(bundle);
            if (this.f3329d != null) {
                bundle.putParcelable("accountkitLoginModel", this.f3329d.m4396g());
            }
        }
    }

    /* renamed from: b */
    C1237m m4418b() {
        return this.f3332g;
    }

    /* renamed from: a */
    void m4416a(LoginModelImpl loginModelImpl) {
        if (this.f3329d != null) {
            C1252x.m4528a(loginModelImpl, this.f3329d.m4396g());
            C1251w.m4510d();
            switch (loginModelImpl.getStatus()) {
                case PENDING:
                    this.f3329d.mo1588d();
                    break;
                case ACCOUNT_VERIFIED:
                    this.f3329d.mo1589e();
                    break;
                case ERROR:
                    this.f3329d.m4390a(loginModelImpl.getError());
                    break;
                case CANCELLED:
                    this.f3329d.mo1587c();
                    break;
                case SUCCESS:
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: e */
    private void m4403e(LoginModelImpl loginModelImpl) {
        this.f3332g.m4375a("ak_login_start", loginModelImpl);
    }

    /* renamed from: b */
    void m4420b(LoginModelImpl loginModelImpl) {
        this.f3332g.m4375a("ak_login_verify", loginModelImpl);
    }

    /* renamed from: c */
    void m4422c(LoginModelImpl loginModelImpl) {
        this.f3332g.m4375a("ak_seamless_pending", loginModelImpl);
    }

    /* renamed from: d */
    void m4424d(LoginModelImpl loginModelImpl) {
        this.f3332g.m4375a("ak_login_complete", loginModelImpl);
    }

    /* renamed from: c */
    EmailLoginModelImpl m4421c() {
        if (this.f3329d == null) {
            return null;
        }
        LoginModelImpl g = this.f3329d.m4396g();
        if (g instanceof EmailLoginModelImpl) {
            return (EmailLoginModelImpl) g;
        }
        return null;
    }

    /* renamed from: d */
    PhoneLoginModelImpl m4423d() {
        if (this.f3329d == null) {
            return null;
        }
        LoginModelImpl g = this.f3329d.m4396g();
        if (g instanceof PhoneLoginModelImpl) {
            return (PhoneLoginModelImpl) g;
        }
        return null;
    }

    @Nullable
    /* renamed from: p */
    private LoginModelImpl m4405p() {
        if (this.f3329d == null) {
            return null;
        }
        return this.f3329d.m4396g();
    }

    /* renamed from: e */
    void m4425e() {
        C1251w.m4510d();
        m4408s();
        if (this.f3329d != null) {
            this.f3329d.mo1587c();
            C1224e.m4321a(null);
            this.f3329d = null;
        }
        C1224e a = C1224e.m4320a();
        if (a != null) {
            a.cancel(true);
            C1224e.m4321a(null);
        }
    }

    /* renamed from: f */
    String m4426f() {
        return this.f3333h;
    }

    /* renamed from: g */
    void m4427g() {
        this.f3335j = null;
        this.f3332g.m4377a("ak_fetch_seamless_login_token", "started");
        this.f3334i = new SeamlessLoginClient(C1220c.m4288a(), AccountKit.m4119h(), this.f3332g);
        if (this.f3334i.m4238a()) {
            this.f3334i.m4237a(new C31721(this));
        }
    }

    /* renamed from: a */
    private void m4400a(Bundle bundle) {
        if (bundle != null) {
            this.f3336k = bundle.getLong("com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH") * 1000;
            this.f3335j = bundle.getString("com.facebook.platform.extra.SEAMLESS_LOGIN_TOKEN");
            this.f3332g.m4377a("ak_fetch_seamless_login_token", "completed");
        }
    }

    /* renamed from: h */
    String m4428h() {
        if (this.f3336k < System.currentTimeMillis()) {
            this.f3335j = null;
        }
        return this.f3335j;
    }

    /* renamed from: i */
    String m4429i() {
        return this.f3335j;
    }

    /* renamed from: j */
    boolean m4430j() {
        return this.f3335j == null && this.f3334i != null && this.f3334i.m4239b();
    }

    /* renamed from: a */
    EmailLoginModelImpl m4409a(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        C1251w.m4510d();
        m4406q();
        LoginModelImpl emailLoginModelImpl = new EmailLoginModelImpl(str, str2);
        str = new C3169i(this.f3327b, this, emailLoginModelImpl);
        str.mo1585a(str3);
        m4403e(emailLoginModelImpl);
        this.f3329d = str;
        return emailLoginModelImpl;
    }

    /* renamed from: a */
    PhoneLoginModelImpl m4410a(@NonNull PhoneNumber phoneNumber, @NonNull NotificationChannel notificationChannel, @NonNull String str, @Nullable String str2) {
        C1251w.m4510d();
        if (notificationChannel == NotificationChannel.SMS) {
            m4406q();
        }
        LoginModelImpl phoneLoginModelImpl = new PhoneLoginModelImpl(phoneNumber, notificationChannel, str);
        phoneNumber = new C3179t(this.f3327b, this, phoneLoginModelImpl);
        phoneNumber.mo1585a(str2);
        m4403e(phoneLoginModelImpl);
        this.f3329d = phoneNumber;
        return phoneLoginModelImpl;
    }

    /* renamed from: k */
    void m4431k() {
        m4414a(null);
        this.f3327b.m4255a(null);
    }

    /* renamed from: a */
    void m4414a(@Nullable final AccountKitCallback<Void> accountKitCallback) {
        AccessToken e = AccountKit.m4116e();
        if (e == null) {
            Log.w(f3326a, "No access token: cannot log out");
            if (accountKitCallback != null) {
                accountKitCallback.onSuccess(null);
            }
            return;
        }
        AccountKitGraphRequest.m4147a(new AccountKitGraphRequest(e, "logout/", null, false, HttpMethod.POST), new Callback(this) {
            /* renamed from: b */
            final /* synthetic */ C1241p f9753b;

            public void onCompleted(C1227f c1227f) {
                if (c1227f.m4333a() != null) {
                    c1227f = C1251w.m4483a(c1227f.m4333a());
                    this.f9753b.f3332g.m4372a("ak_log_out_error");
                    if (accountKitCallback != null) {
                        accountKitCallback.onError((AccountKitError) c1227f.first);
                        return;
                    }
                    return;
                }
                this.f9753b.f3327b.m4255a(null);
                this.f9753b.f3332g.m4372a("ak_log_out");
                if (accountKitCallback != null) {
                    accountKitCallback.onSuccess(null);
                }
            }
        });
    }

    /* renamed from: l */
    void m4432l() {
        this.f3329d = null;
    }

    /* renamed from: q */
    private void m4406q() {
        if (this.f3329d != null) {
            this.f3329d.m4396g().setStatus(LoginStatus.CANCELLED);
            this.f3329d.mo1587c();
        }
    }

    /* renamed from: m */
    boolean m4433m() {
        return this.f3330e;
    }

    /* renamed from: n */
    C0436c m4434n() {
        return this.f3331f;
    }

    /* renamed from: o */
    boolean m4435o() {
        return this.f3329d != null;
    }

    /* renamed from: r */
    private void m4407r() {
        this.f3329d = null;
        C1224e.m4323b();
        C1224e.m4321a(null);
    }

    /* renamed from: a */
    void m4415a(LoginModel loginModel) {
        this.f3335j = null;
        if (this.f3329d != null && C1251w.m4505b((Object) loginModel, this.f3329d.m4396g()) != null) {
            m4407r();
        }
    }

    /* renamed from: f */
    private void m4404f(@NonNull LoginModelImpl loginModelImpl) {
        C1251w.m4510d();
        if (loginModelImpl instanceof EmailLoginModelImpl) {
            this.f3329d = new C3169i(this.f3327b, this, (EmailLoginModelImpl) loginModelImpl);
        } else if (loginModelImpl instanceof PhoneLoginModelImpl) {
            this.f3329d = new C3179t(this.f3327b, this, (PhoneLoginModelImpl) loginModelImpl);
        } else {
            throw new AccountKitException(Type.ARGUMENT_ERROR, InternalAccountKitError.INVALID_LOGIN_TYPE, loginModelImpl.getClass().getName());
        }
        m4416a(loginModelImpl);
    }

    /* renamed from: s */
    private void m4408s() {
        this.f3333h = UUID.randomUUID().toString();
    }
}
