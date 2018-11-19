package com.google.android.gms.auth.api;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C3783c;
import com.google.android.gms.auth.api.signin.internal.C4393d;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.C3788d;
import com.google.android.gms.internal.mf;
import com.google.android.gms.internal.mg;
import com.google.android.gms.internal.mq;
import com.google.android.gms.internal.mz;
import com.google.android.gms.internal.nr;
import com.google.android.gms.internal.zzaur;

/* renamed from: com.google.android.gms.auth.api.a */
public final class C2422a {
    /* renamed from: a */
    public static final C3788d<mz> f7343a = new C3788d();
    /* renamed from: b */
    public static final C3788d<C4393d> f7344b = new C3788d();
    @KeepForSdk
    /* renamed from: c */
    public static final Api<C4392g> f7345c = C2441e.f7379a;
    /* renamed from: d */
    public static final Api<C4391a> f7346d = new Api("Auth.CREDENTIALS_API", f7352j, f7343a);
    /* renamed from: e */
    public static final Api<GoogleSignInOptions> f7347e = new Api("Auth.GOOGLE_SIGN_IN_API", f7354l, f7344b);
    @KeepForSdk
    /* renamed from: f */
    public static final ProxyApi f7348f = new nr();
    /* renamed from: g */
    public static final CredentialsApi f7349g = new mq();
    /* renamed from: h */
    public static final GoogleSignInApi f7350h = new C3783c();
    /* renamed from: i */
    private static C3788d<mg> f7351i = new C3788d();
    /* renamed from: j */
    private static final C3787a<mz, C4391a> f7352j = new C4282b();
    /* renamed from: k */
    private static final C3787a<mg, Object> f7353k = new C4283c();
    /* renamed from: l */
    private static final C3787a<C4393d, GoogleSignInOptions> f7354l = new C4284d();
    /* renamed from: m */
    private static Api<Object> f7355m = new Api("Auth.ACCOUNT_STATUS_API", f7353k, f7351i);
    /* renamed from: n */
    private static zzaur f7356n = new mf();

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.a$a */
    public static class C4391a implements Optional {
        /* renamed from: a */
        private static C4391a f14564a = new C2421a().m8781a();
        /* renamed from: b */
        private final String f14565b = null;
        /* renamed from: c */
        private final PasswordSpecification f14566c;
        /* renamed from: d */
        private final boolean f14567d;

        @Deprecated
        /* renamed from: com.google.android.gms.auth.api.a$a$a */
        public static class C2421a {
            @NonNull
            /* renamed from: a */
            protected PasswordSpecification f7341a = PasswordSpecification.zzeft;
            /* renamed from: b */
            protected Boolean f7342b = Boolean.valueOf(false);

            /* renamed from: a */
            public C4391a m8781a() {
                return new C4391a(this);
            }
        }

        public C4391a(C2421a c2421a) {
            this.f14566c = c2421a.f7341a;
            this.f14567d = c2421a.f7342b.booleanValue();
        }

        /* renamed from: a */
        public final PasswordSpecification m18147a() {
            return this.f14566c;
        }

        /* renamed from: b */
        public final Bundle m18148b() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putParcelable("password_specification", this.f14566c);
            bundle.putBoolean("force_save_dialog", this.f14567d);
            return bundle;
        }
    }
}
