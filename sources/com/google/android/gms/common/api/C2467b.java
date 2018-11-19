package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions;
import com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.internal.al;
import com.google.android.gms.common.api.internal.an;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.api.internal.bd;
import com.google.android.gms.common.api.internal.bh;
import com.google.android.gms.common.api.internal.bl;
import com.google.android.gms.common.api.internal.bs;
import com.google.android.gms.common.api.internal.cc;
import com.google.android.gms.common.api.internal.cf;
import com.google.android.gms.common.api.internal.cg;
import com.google.android.gms.common.api.internal.ck;
import com.google.android.gms.common.api.internal.zzcz;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.aw;
import com.google.android.gms.tasks.C4500a;
import com.google.android.gms.tasks.C4501b;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.b */
public class C2467b<O extends ApiOptions> {
    /* renamed from: a */
    protected final al f7441a;
    /* renamed from: b */
    private final Context f7442b;
    /* renamed from: c */
    private final Api<O> f7443c;
    /* renamed from: d */
    private final O f7444d;
    /* renamed from: e */
    private final cg<O> f7445e;
    /* renamed from: f */
    private final Looper f7446f;
    /* renamed from: g */
    private final int f7447g;
    /* renamed from: h */
    private final GoogleApiClient f7448h;
    /* renamed from: i */
    private final zzcz f7449i;

    /* renamed from: com.google.android.gms.common.api.b$a */
    public static class C2466a {
        /* renamed from: a */
        public static final C2466a f7438a = new C2472i().m8913a();
        /* renamed from: b */
        public final zzcz f7439b;
        /* renamed from: c */
        public final Looper f7440c;

        private C2466a(zzcz zzcz, Account account, Looper looper) {
            this.f7439b = zzcz;
            this.f7440c = looper;
        }
    }

    protected C2467b(@NonNull Context context, Api<O> api, Looper looper) {
        ad.m9046a((Object) context, (Object) "Null context is not permitted.");
        ad.m9046a((Object) api, (Object) "Api must not be null.");
        ad.m9046a((Object) looper, (Object) "Looper must not be null.");
        this.f7442b = context.getApplicationContext();
        this.f7443c = api;
        this.f7444d = null;
        this.f7446f = looper;
        this.f7445e = cg.m8991a(api);
        this.f7448h = new av(this);
        this.f7441a = al.m8937a(this.f7442b);
        this.f7447g = this.f7441a.m8963c();
        this.f7449i = new cf();
    }

    public C2467b(@NonNull Context context, Api<O> api, O o, C2466a c2466a) {
        ad.m9046a((Object) context, (Object) "Null context is not permitted.");
        ad.m9046a((Object) api, (Object) "Api must not be null.");
        ad.m9046a((Object) c2466a, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f7442b = context.getApplicationContext();
        this.f7443c = api;
        this.f7444d = o;
        this.f7446f = c2466a.f7440c;
        this.f7445e = cg.m8992a(this.f7443c, this.f7444d);
        this.f7448h = new av(this);
        this.f7441a = al.m8937a(this.f7442b);
        this.f7447g = this.f7441a.m8963c();
        this.f7449i = c2466a.f7439b;
        this.f7441a.m8956a(this);
    }

    @Deprecated
    public C2467b(@NonNull Context context, Api<O> api, O o, zzcz zzcz) {
        this(context, (Api) api, (ApiOptions) o, new C2472i().m8914a(zzcz).m8913a());
    }

    /* renamed from: a */
    private final <A extends zzb, T extends ck<? extends Result, A>> T m8891a(int i, @NonNull T t) {
        t.m14231f();
        this.f7441a.m8958a(this, i, (ck) t);
        return t;
    }

    /* renamed from: a */
    private final <TResult, A extends zzb> C4500a<TResult> m8892a(int i, @NonNull bs<A, TResult> bsVar) {
        C4501b c4501b = new C4501b();
        this.f7441a.m8957a(this, i, bsVar, c4501b, this.f7449i);
        return c4501b.a();
    }

    /* renamed from: g */
    private final aw mo2554g() {
        GoogleSignInAccount googleSignInAccount;
        Account account;
        Collection zzabb;
        aw awVar = new aw();
        if (this.f7444d instanceof HasGoogleSignInAccountOptions) {
            googleSignInAccount = ((HasGoogleSignInAccountOptions) this.f7444d).getGoogleSignInAccount();
            if (googleSignInAccount != null) {
                account = googleSignInAccount.getAccount();
                awVar = awVar.m9120a(account);
                if (this.f7444d instanceof HasGoogleSignInAccountOptions) {
                    googleSignInAccount = ((HasGoogleSignInAccountOptions) this.f7444d).getGoogleSignInAccount();
                    if (googleSignInAccount != null) {
                        zzabb = googleSignInAccount.zzabb();
                        return awVar.m9122a(zzabb);
                    }
                }
                zzabb = Collections.emptySet();
                return awVar.m9122a(zzabb);
            }
        }
        account = this.f7444d instanceof HasAccountOptions ? ((HasAccountOptions) this.f7444d).getAccount() : null;
        awVar = awVar.m9120a(account);
        if (this.f7444d instanceof HasGoogleSignInAccountOptions) {
            googleSignInAccount = ((HasGoogleSignInAccountOptions) this.f7444d).getGoogleSignInAccount();
            if (googleSignInAccount != null) {
                zzabb = googleSignInAccount.zzabb();
                return awVar.m9122a(zzabb);
            }
        }
        zzabb = Collections.emptySet();
        return awVar.m9122a(zzabb);
    }

    @WorkerThread
    /* renamed from: a */
    public zze mo2552a(Looper looper, an<O> anVar) {
        return this.f7443c.m8845b().mo3558a(this.f7442b, looper, mo2554g().m9121a(this.f7442b.getPackageName()).m9123b(this.f7442b.getClass().getName()).m9119a(), this.f7444d, anVar, anVar);
    }

    /* renamed from: a */
    public final Api<O> m8895a() {
        return this.f7443c;
    }

    /* renamed from: a */
    public bl mo2553a(Context context, Handler handler) {
        return new bl(context, handler, mo2554g().m9119a());
    }

    /* renamed from: a */
    public final <A extends zzb, T extends ck<? extends Result, A>> T m8897a(@NonNull T t) {
        return m8891a(0, (ck) t);
    }

    /* renamed from: a */
    public final C4500a<Boolean> m8898a(@NonNull bd<?> bdVar) {
        ad.m9046a((Object) bdVar, (Object) "Listener key cannot be null.");
        return this.f7441a.m8953a(this, (bd) bdVar);
    }

    /* renamed from: a */
    public final <A extends zzb, T extends bh<A, ?>, U extends cc<A, ?>> C4500a<Void> m8899a(@NonNull T t, U u) {
        ad.m9045a((Object) t);
        ad.m9045a((Object) u);
        ad.m9046a(t.m8978a(), (Object) "Listener has already been released.");
        ad.m9046a(u.m8989a(), (Object) "Listener has already been released.");
        ad.m9055b(t.m8978a().equals(u.m8989a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f7441a.m8954a(this, (bh) t, (cc) u);
    }

    /* renamed from: a */
    public final <TResult, A extends zzb> C4500a<TResult> m8900a(bs<A, TResult> bsVar) {
        return m8892a(0, (bs) bsVar);
    }

    /* renamed from: b */
    public final cg<O> m8901b() {
        return this.f7445e;
    }

    /* renamed from: b */
    public final <A extends zzb, T extends ck<? extends Result, A>> T m8902b(@NonNull T t) {
        return m8891a(1, (ck) t);
    }

    /* renamed from: b */
    public final <TResult, A extends zzb> C4500a<TResult> m8903b(bs<A, TResult> bsVar) {
        return m8892a(1, (bs) bsVar);
    }

    /* renamed from: c */
    public final int m8904c() {
        return this.f7447g;
    }

    /* renamed from: d */
    public final GoogleApiClient m8905d() {
        return this.f7448h;
    }

    /* renamed from: e */
    public final Looper m8906e() {
        return this.f7446f;
    }

    /* renamed from: f */
    public final Context m8907f() {
        return this.f7442b;
    }
}
