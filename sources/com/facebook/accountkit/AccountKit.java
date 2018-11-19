package com.facebook.accountkit;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.facebook.accountkit.internal.C1220c;
import java.util.concurrent.Executor;

public final class AccountKit {
    /* renamed from: a */
    private static volatile Executor f3147a;
    /* renamed from: b */
    private static final Object f3148b = new Object();
    /* renamed from: c */
    private static final C1186b f3149c = new C1186b();

    public interface InitializeCallback {
        void onInitialized();
    }

    /* renamed from: a */
    public static C1186b m4109a() {
        return f3149c;
    }

    /* renamed from: b */
    public static boolean m4113b() {
        return C1220c.m4299b();
    }

    /* renamed from: c */
    public static void m4114c() {
        C1220c.m4302d();
    }

    /* renamed from: d */
    public static void m4115d() {
        C1220c.m4304e();
    }

    @Nullable
    /* renamed from: e */
    public static AccessToken m4116e() {
        return C1220c.m4308i();
    }

    /* renamed from: f */
    public static PhoneLoginModel m4117f() {
        return C1220c.m4310k();
    }

    /* renamed from: g */
    public static LoginModel m4118g() {
        LoginModel k = C1220c.m4310k();
        return k == null ? C1220c.m4309j() : k;
    }

    /* renamed from: a */
    public static void m4111a(Activity activity, Bundle bundle) {
        C1220c.m4293a(activity, bundle);
    }

    /* renamed from: a */
    public static void m4110a(Activity activity) {
        C1220c.m4292a(activity);
    }

    /* renamed from: b */
    public static void m4112b(Activity activity, Bundle bundle) {
        C1220c.m4297b(activity, bundle);
    }

    /* renamed from: h */
    public static String m4119h() {
        return C1220c.m4311l();
    }

    /* renamed from: i */
    public static String m4120i() {
        return C1220c.m4312m();
    }

    /* renamed from: j */
    public static String m4121j() {
        return C1220c.m4313n();
    }

    /* renamed from: k */
    public static boolean m4122k() {
        return C1220c.m4314o();
    }

    /* renamed from: l */
    public static Executor m4123l() {
        synchronized (f3148b) {
            if (f3147a == null) {
                f3147a = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f3147a;
    }
}
