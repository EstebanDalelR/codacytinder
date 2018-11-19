package com.facebook.accountkit.internal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.internal.AccountKitGraphRequest.Callback;
import com.tinder.api.ManagerWebServices;
import java.lang.ref.WeakReference;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.accountkit.internal.o */
abstract class C1239o<E extends LoginModelImpl> {
    /* renamed from: c */
    private static final String f3321c = "com.facebook.accountkit.internal.o";
    /* renamed from: a */
    final C1218b f3322a;
    /* renamed from: b */
    protected final E f3323b;
    /* renamed from: d */
    private final WeakReference<C1241p> f3324d;

    /* renamed from: com.facebook.accountkit.internal.o$a */
    class C3171a implements Callback {
        /* renamed from: a */
        final C1241p f9749a;
        /* renamed from: b */
        final /* synthetic */ C1239o f9750b;

        C3171a(C1239o c1239o, C1241p c1241p) {
            this.f9750b = c1239o;
            this.f9749a = c1241p;
        }

        public void onCompleted(com.facebook.accountkit.internal.C1227f r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.f9749a;
            r0 = r0.m4433m();
            if (r0 != 0) goto L_0x0012;
        L_0x0008:
            r3 = com.facebook.accountkit.internal.C1239o.f3321c;
            r0 = "Warning: Callback issues while activity not available.";
            android.util.Log.w(r3, r0);
            return;
        L_0x0012:
            r0 = r3.m4333a();	 Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0055;	 Catch:{ all -> 0x0094 }
        L_0x0018:
            r3 = r3.m4333a();	 Catch:{ all -> 0x0094 }
            r3 = com.facebook.accountkit.internal.C1251w.m4483a(r3);	 Catch:{ all -> 0x0094 }
            r0 = r2.f9750b;	 Catch:{ all -> 0x0094 }
            r3 = r3.first;	 Catch:{ all -> 0x0094 }
            r3 = (com.facebook.accountkit.AccountKitError) r3;	 Catch:{ all -> 0x0094 }
            r0.m4390a(r3);	 Catch:{ all -> 0x0094 }
            r3 = r2.f9750b;
            r3.m4398i();
            r3 = r2.f9749a;
            r0 = r2.f9750b;
            r0 = r0.f3323b;
            r3.m4424d(r0);
            r3 = r2.f9750b;
            r3 = r3.f3323b;
            r3 = r3.getStatus();
            r0 = com.facebook.accountkit.internal.LoginStatus.SUCCESS;
            if (r3 == r0) goto L_0x004f;
        L_0x0043:
            r3 = r2.f9750b;
            r3 = r3.f3323b;
            r3 = r3.getStatus();
            r0 = com.facebook.accountkit.internal.LoginStatus.ERROR;
            if (r3 != r0) goto L_0x0054;
        L_0x004f:
            r3 = r2.f9749a;
            r3.m4432l();
        L_0x0054:
            return;
        L_0x0055:
            r3 = r3.m4334b();	 Catch:{ all -> 0x0094 }
            r0 = r2.f9750b;	 Catch:{ JSONException -> 0x005f }
            r0.m4391a(r3);	 Catch:{ JSONException -> 0x005f }
            goto L_0x0068;
        L_0x005f:
            r3 = r2.f9750b;	 Catch:{ all -> 0x0094 }
            r0 = com.facebook.accountkit.AccountKitError.Type.LOGIN_INVALIDATED;	 Catch:{ all -> 0x0094 }
            r1 = com.facebook.accountkit.internal.InternalAccountKitError.INVALID_GRAPH_RESULTS_FORMAT;	 Catch:{ all -> 0x0094 }
            r3.m4389a(r0, r1);	 Catch:{ all -> 0x0094 }
        L_0x0068:
            r3 = r2.f9750b;
            r3.m4398i();
            r3 = r2.f9749a;
            r0 = r2.f9750b;
            r0 = r0.f3323b;
            r3.m4424d(r0);
            r3 = r2.f9750b;
            r3 = r3.f3323b;
            r3 = r3.getStatus();
            r0 = com.facebook.accountkit.internal.LoginStatus.SUCCESS;
            if (r3 == r0) goto L_0x008e;
        L_0x0082:
            r3 = r2.f9750b;
            r3 = r3.f3323b;
            r3 = r3.getStatus();
            r0 = com.facebook.accountkit.internal.LoginStatus.ERROR;
            if (r3 != r0) goto L_0x0093;
        L_0x008e:
            r3 = r2.f9749a;
            r3.m4432l();
        L_0x0093:
            return;
        L_0x0094:
            r3 = move-exception;
            r0 = r2.f9750b;
            r0.m4398i();
            r0 = r2.f9749a;
            r1 = r2.f9750b;
            r1 = r1.f3323b;
            r0.m4424d(r1);
            r0 = r2.f9750b;
            r0 = r0.f3323b;
            r0 = r0.getStatus();
            r1 = com.facebook.accountkit.internal.LoginStatus.SUCCESS;
            if (r0 == r1) goto L_0x00bb;
        L_0x00af:
            r0 = r2.f9750b;
            r0 = r0.f3323b;
            r0 = r0.getStatus();
            r1 = com.facebook.accountkit.internal.LoginStatus.ERROR;
            if (r0 != r1) goto L_0x00c0;
        L_0x00bb:
            r0 = r2.f9749a;
            r0.m4432l();
        L_0x00c0:
            throw r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.o.a.onCompleted(com.facebook.accountkit.internal.f):void");
        }
    }

    /* renamed from: a */
    protected abstract String mo1584a();

    /* renamed from: b */
    protected abstract String mo1586b();

    /* renamed from: c */
    public abstract void mo1587c();

    /* renamed from: d */
    public abstract void mo1588d();

    /* renamed from: e */
    public abstract void mo1589e();

    C1239o(@NonNull C1218b c1218b, @NonNull C1241p c1241p, @NonNull E e) {
        this.f3322a = c1218b;
        this.f3324d = new WeakReference(c1241p);
        this.f3323b = e;
    }

    /* renamed from: g */
    public E m4396g() {
        return this.f3323b;
    }

    /* renamed from: a */
    public void m4390a(AccountKitError accountKitError) {
        this.f3323b.setError(accountKitError);
        this.f3323b.setStatus(LoginStatus.ERROR);
        accountKitError = m4397h();
        if (accountKitError != null) {
            accountKitError.m4415a(this.f3323b);
        }
    }

    /* renamed from: a */
    void m4391a(JSONObject jSONObject) throws JSONException {
        if (C1251w.m4505b(this.f3323b.getResponseType(), ManagerWebServices.PARAM_TOKEN)) {
            AccessToken accessToken = new AccessToken(jSONObject.getString("access_token"), jSONObject.getString("id"), AccountKit.m4119h(), Long.parseLong(jSONObject.getString("token_refresh_interval_sec")), new Date());
            this.f3322a.m4255a(accessToken);
            this.f3323b.setFinalAuthState(jSONObject.optString("state"));
            this.f3323b.setAccessToken(accessToken);
            this.f3323b.setStatus(LoginStatus.SUCCESS);
            return;
        }
        this.f3323b.setCode(jSONObject.getString("code"));
        this.f3323b.setFinalAuthState(jSONObject.optString("state"));
        this.f3323b.setStatus(LoginStatus.SUCCESS);
    }

    /* renamed from: a */
    AccountKitGraphRequest m4387a(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        C1251w.m4490a(bundle2, "credentials_type", mo1584a());
        C1251w.m4490a(bundle2, "login_request_code", this.f3323b.getLoginRequestCode());
        C1251w.m4490a(bundle2, "logging_ref", m4397h() != null ? m4397h().m4418b().m4370a() : null);
        bundle2.putAll(bundle);
        return new AccountKitGraphRequest(null, str, bundle2, mo1585a(str), HttpMethod.POST);
    }

    /* renamed from: h */
    C1241p m4397h() {
        C1241p c1241p = (C1241p) this.f3324d.get();
        if (c1241p == null) {
            return null;
        }
        if (c1241p.m4433m()) {
            return c1241p;
        }
        Log.w(f3321c, "Warning: Callback issues while activity not available.");
        return null;
    }

    /* renamed from: a */
    protected void m4389a(Type type, InternalAccountKitError internalAccountKitError) {
        m4390a(new AccountKitError(type, internalAccountKitError));
    }

    /* renamed from: i */
    void m4398i() {
        C1241p h = m4397h();
        if (h != null) {
            h.m4434n().m1653a(new Intent(mo1586b()).putExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_MODEL", this.f3323b).putExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_STATUS", this.f3323b.getStatus()).putExtra("com.facebook.accountkit.sdk.EXTRA_LOGIN_ERROR", this.f3323b.getError()));
        }
    }

    /* renamed from: a */
    private boolean mo1585a(String str) {
        if (!(C1251w.m4505b((Object) str, (Object) "start_login") || C1251w.m4505b((Object) str, (Object) "poll_login"))) {
            if (C1251w.m4505b((Object) str, (Object) "confirm_login") == null) {
                return null;
            }
        }
        return true;
    }
}
