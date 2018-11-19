package com.facebook.accountkit.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.facebook.accountkit.internal.AccountKitGraphRequest.Callback;
import com.facebook.accountkit.internal.C1239o.C3171a;
import com.google.android.gms.auth.api.phone.C2442a;
import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;

/* renamed from: com.facebook.accountkit.internal.t */
final class C3179t extends C1239o<PhoneLoginModelImpl> {
    /* renamed from: c */
    private static final String f9757c = "com.facebook.accountkit.internal.t";

    /* renamed from: com.facebook.accountkit.internal.t$1 */
    class C31771 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C3179t f9754a;

        C31771(C3179t c3179t) {
            this.f9754a = c3179t;
        }

        public void onCompleted(com.facebook.accountkit.internal.C1227f r8) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r7 = this;
            r0 = r7.f9754a;
            r0 = r0.m4397h();
            if (r0 == 0) goto L_0x0113;
        L_0x0008:
            if (r8 != 0) goto L_0x000c;
        L_0x000a:
            goto L_0x0113;
        L_0x000c:
            r0 = r8.m4333a();	 Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x0029;	 Catch:{ all -> 0x010c }
        L_0x0012:
            r8 = r8.m4333a();	 Catch:{ all -> 0x010c }
            r8 = com.facebook.accountkit.internal.C1251w.m4483a(r8);	 Catch:{ all -> 0x010c }
            r0 = r7.f9754a;	 Catch:{ all -> 0x010c }
            r8 = r8.first;	 Catch:{ all -> 0x010c }
            r8 = (com.facebook.accountkit.AccountKitError) r8;	 Catch:{ all -> 0x010c }
            r0.m4390a(r8);	 Catch:{ all -> 0x010c }
            r8 = r7.f9754a;
            r8.m4398i();
            return;
        L_0x0029:
            r8 = r8.m4334b();	 Catch:{ all -> 0x010c }
            if (r8 != 0) goto L_0x003e;	 Catch:{ all -> 0x010c }
        L_0x002f:
            r8 = r7.f9754a;	 Catch:{ all -> 0x010c }
            r0 = com.facebook.accountkit.AccountKitError.Type.LOGIN_INVALIDATED;	 Catch:{ all -> 0x010c }
            r1 = com.facebook.accountkit.internal.InternalAccountKitError.NO_RESULT_FOUND;	 Catch:{ all -> 0x010c }
            r8.m4389a(r0, r1);	 Catch:{ all -> 0x010c }
            r8 = r7.f9754a;
            r8.m4398i();
            return;
        L_0x003e:
            r0 = "privacy_policy";	 Catch:{ all -> 0x010c }
            r0 = r8.optString(r0);	 Catch:{ all -> 0x010c }
            r1 = com.facebook.accountkit.internal.C1251w.m4500a(r0);	 Catch:{ all -> 0x010c }
            if (r1 != 0) goto L_0x0055;	 Catch:{ all -> 0x010c }
        L_0x004a:
            r1 = r7.f9754a;	 Catch:{ all -> 0x010c }
            r1 = r1.b;	 Catch:{ all -> 0x010c }
            r1 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r1;	 Catch:{ all -> 0x010c }
            r2 = "privacy_policy";	 Catch:{ all -> 0x010c }
            r1.putField(r2, r0);	 Catch:{ all -> 0x010c }
        L_0x0055:
            r0 = "terms_of_service";	 Catch:{ all -> 0x010c }
            r0 = r8.optString(r0);	 Catch:{ all -> 0x010c }
            r1 = com.facebook.accountkit.internal.C1251w.m4500a(r0);	 Catch:{ all -> 0x010c }
            if (r1 != 0) goto L_0x006c;	 Catch:{ all -> 0x010c }
        L_0x0061:
            r1 = r7.f9754a;	 Catch:{ all -> 0x010c }
            r1 = r1.b;	 Catch:{ all -> 0x010c }
            r1 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r1;	 Catch:{ all -> 0x010c }
            r2 = "terms_of_service";	 Catch:{ all -> 0x010c }
            r1.putField(r2, r0);	 Catch:{ all -> 0x010c }
        L_0x006c:
            r0 = "can_attempt_seamless_login";	 Catch:{ JSONException -> 0x009b }
            r0 = r8.getBoolean(r0);	 Catch:{ JSONException -> 0x009b }
            r1 = "expires_at";	 Catch:{ JSONException -> 0x009b }
            r1 = r8.getString(r1);	 Catch:{ JSONException -> 0x009b }
            r1 = java.lang.Long.parseLong(r1);	 Catch:{ JSONException -> 0x009b }
            r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ JSONException -> 0x009b }
            r1 = r1 * r3;	 Catch:{ JSONException -> 0x009b }
            if (r0 == 0) goto L_0x009b;	 Catch:{ JSONException -> 0x009b }
        L_0x0082:
            r3 = java.lang.System.currentTimeMillis();	 Catch:{ JSONException -> 0x009b }
            r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ JSONException -> 0x009b }
            if (r0 <= 0) goto L_0x009b;	 Catch:{ JSONException -> 0x009b }
        L_0x008a:
            r0 = r7.f9754a;	 Catch:{ JSONException -> 0x009b }
            r0 = r0.b;	 Catch:{ JSONException -> 0x009b }
            r0 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r0;	 Catch:{ JSONException -> 0x009b }
            r1 = com.facebook.accountkit.internal.LoginStatus.ACCOUNT_VERIFIED;	 Catch:{ JSONException -> 0x009b }
            r0.setStatus(r1);	 Catch:{ JSONException -> 0x009b }
            r8 = r7.f9754a;
            r8.m4398i();
            return;
        L_0x009b:
            r0 = "login_request_code";	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r0 = r8.getString(r0);	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r1 = "expires_in_sec";	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r1 = r8.getString(r1);	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r1 = java.lang.Long.parseLong(r1);	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r3 = r7.f9754a;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r3 = r3.b;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r3 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r3;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r3.setExpiresInSeconds(r1);	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r1 = "min_resend_interval_sec";	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8 = r8.optString(r1);	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r1 = com.facebook.accountkit.internal.C1251w.m4500a(r8);	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            if (r1 != 0) goto L_0x00db;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
        L_0x00c0:
            r1 = java.lang.Long.parseLong(r8);	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8 = r7.f9754a;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8 = r8.b;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r8;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r3 = java.lang.System.currentTimeMillis();	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r5 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r1 = r5.toMillis(r1);	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r5 = 0;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r5 = r3 + r1;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8.setResendTime(r5);	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            goto L_0x00e8;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
        L_0x00db:
            r8 = r7.f9754a;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8 = r8.b;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r8;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r1 = java.lang.System.currentTimeMillis();	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8.setResendTime(r1);	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
        L_0x00e8:
            r8 = r7.f9754a;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8 = r8.b;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r8;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r1 = com.facebook.accountkit.internal.LoginStatus.PENDING;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8.setStatus(r1);	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8 = r7.f9754a;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8 = r8.b;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r8;	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            r8.setLoginCode(r0);	 Catch:{ JSONException -> 0x00fd, JSONException -> 0x00fd }
            goto L_0x0106;
        L_0x00fd:
            r8 = r7.f9754a;	 Catch:{ all -> 0x010c }
            r0 = com.facebook.accountkit.AccountKitError.Type.LOGIN_INVALIDATED;	 Catch:{ all -> 0x010c }
            r1 = com.facebook.accountkit.internal.InternalAccountKitError.INVALID_GRAPH_RESULTS_FORMAT;	 Catch:{ all -> 0x010c }
            r8.m4389a(r0, r1);	 Catch:{ all -> 0x010c }
        L_0x0106:
            r8 = r7.f9754a;
            r8.m4398i();
            return;
        L_0x010c:
            r8 = move-exception;
            r0 = r7.f9754a;
            r0.m4398i();
            throw r8;
        L_0x0113:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.t.1.onCompleted(com.facebook.accountkit.internal.f):void");
        }
    }

    /* renamed from: a */
    protected String mo1584a() {
        return ManagerWebServices.PARAM_PHONE_NUMBER;
    }

    /* renamed from: b */
    protected String mo1586b() {
        return "com.facebook.accountkit.sdk.ACTION_PHONE_LOGIN_STATE_CHANGED";
    }

    C3179t(C1218b c1218b, C1241p c1241p, PhoneLoginModelImpl phoneLoginModelImpl) {
        super(c1218b, c1241p, phoneLoginModelImpl);
    }

    /* renamed from: a */
    public void mo1585a(@Nullable String str) {
        Callback c31771 = new C31771(this);
        String phoneNumber = ((PhoneLoginModelImpl) this.b).getPhoneNumber().toString();
        Bundle bundle = new Bundle();
        C1251w.m4490a(bundle, ManagerWebServices.PARAM_PHONE_NUMBER, phoneNumber);
        C1251w.m4490a(bundle, "state", str);
        C1251w.m4490a(bundle, QueryParams.RESPONSE_TYPE, ((PhoneLoginModelImpl) this.b).getResponseType());
        C1251w.m4490a(bundle, ManagerWebServices.FB_PARAM_BATCH_FIELDS, "terms_of_service,privacy_policy");
        switch (((PhoneLoginModelImpl) this.b).getNotificationChannel()) {
            case FACEBOOK:
                C1251w.m4490a(bundle, "notif_medium", AnalyticsConstants.VALUE_FACEBOOK);
                break;
            case VOICE_CALLBACK:
                C1251w.m4490a(bundle, "notif_medium", "voice");
                break;
            default:
                break;
        }
        phoneNumber = C3179t.m12221a(C1220c.m4288a());
        if (phoneNumber != null) {
            C1251w.m4490a(bundle, "sms_token", phoneNumber);
        }
        C1241p h = m4397h();
        if (h != null) {
            if (h.m4430j()) {
                h.m4418b().m4377a("ak_fetch_seamless_login_token", "not_completed");
            } else {
                C1251w.m4490a(bundle, "fb_user_token", h.m4428h());
            }
        }
        ((PhoneLoginModelImpl) this.b).setInitialAuthState(str);
        AccountKitGraphRequest a = m4387a("start_login", bundle);
        C1224e.m4323b();
        C1224e.m4321a(AccountKitGraphRequest.m4147a(a, c31771));
    }

    @Nullable
    /* renamed from: a */
    private static String m12221a(Context context) {
        if (!C1251w.m4518g(context)) {
            return null;
        }
        String substring = C1245s.m4450a(context, context.getPackageName()).substring(0, 11);
        C2442a.m8808a(context).startSmsRetriever();
        return substring;
    }

    /* renamed from: c */
    public void mo1587c() {
        ((PhoneLoginModelImpl) this.b).setStatus(LoginStatus.CANCELLED);
        m4398i();
        C1224e.m4323b();
    }

    /* renamed from: d */
    public void mo1588d() {
        if (!C1251w.m4500a(((PhoneLoginModelImpl) this.b).getConfirmationCode())) {
            C1252x.m4527a(this.b);
            final C1241p h = m4397h();
            if (h != null) {
                h.m4420b(this.b);
                Callback c31782 = new Callback(this) {
                    /* renamed from: b */
                    final /* synthetic */ C3179t f9756b;

                    public void onCompleted(com.facebook.accountkit.internal.C1227f r5) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r4 = this;
                        r0 = r0;
                        r0 = r0.m4433m();
                        if (r0 != 0) goto L_0x0012;
                    L_0x0008:
                        r5 = com.facebook.accountkit.internal.C3179t.f9757c;
                        r0 = "Warning: Callback issues while activity not available.";
                        android.util.Log.w(r5, r0);
                        return;
                    L_0x0012:
                        if (r5 != 0) goto L_0x0015;
                    L_0x0014:
                        return;
                    L_0x0015:
                        r0 = 0;
                        r1 = r5.m4333a();	 Catch:{ all -> 0x012e }
                        if (r1 == 0) goto L_0x0098;	 Catch:{ all -> 0x012e }
                    L_0x001c:
                        r5 = r5.m4333a();	 Catch:{ all -> 0x012e }
                        r5 = com.facebook.accountkit.internal.C1251w.m4483a(r5);	 Catch:{ all -> 0x012e }
                        r1 = r5.second;	 Catch:{ all -> 0x0095 }
                        r1 = (com.facebook.accountkit.internal.InternalAccountKitError) r1;	 Catch:{ all -> 0x0095 }
                        r1 = com.facebook.accountkit.internal.C1251w.m4498a(r1);	 Catch:{ all -> 0x0095 }
                        if (r1 != 0) goto L_0x0037;	 Catch:{ all -> 0x0095 }
                    L_0x002e:
                        r1 = r4.f9756b;	 Catch:{ all -> 0x0095 }
                        r2 = r5.first;	 Catch:{ all -> 0x0095 }
                        r2 = (com.facebook.accountkit.AccountKitError) r2;	 Catch:{ all -> 0x0095 }
                        r1.m4390a(r2);	 Catch:{ all -> 0x0095 }
                    L_0x0037:
                        r1 = r4.f9756b;
                        r1 = r1.b;
                        r1 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r1;
                        r1 = r1.getStatus();
                        r2 = com.facebook.accountkit.internal.LoginStatus.ERROR;
                        if (r1 != r2) goto L_0x0065;
                    L_0x0045:
                        if (r5 == 0) goto L_0x0065;
                    L_0x0047:
                        r5 = r5.second;
                        r5 = (com.facebook.accountkit.internal.InternalAccountKitError) r5;
                        r5 = com.facebook.accountkit.internal.C1251w.m4498a(r5);
                        if (r5 == 0) goto L_0x0065;
                    L_0x0051:
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r1 = com.facebook.accountkit.internal.LoginStatus.PENDING;
                        r5.setStatus(r1);
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r5.setError(r0);
                    L_0x0065:
                        r5 = r4.f9756b;
                        r5.m4398i();
                        r5 = r0;
                        r0 = r4.f9756b;
                        r0 = r0.b;
                        r5.m4424d(r0);
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r5 = r5.getStatus();
                        r0 = com.facebook.accountkit.internal.LoginStatus.SUCCESS;
                        if (r5 == r0) goto L_0x008f;
                    L_0x0081:
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r5 = r5.getStatus();
                        r0 = com.facebook.accountkit.internal.LoginStatus.ERROR;
                        if (r5 != r0) goto L_0x0094;
                    L_0x008f:
                        r5 = r0;
                        r5.m4432l();
                    L_0x0094:
                        return;
                    L_0x0095:
                        r1 = move-exception;
                        goto L_0x0130;
                    L_0x0098:
                        r5 = r5.m4334b();	 Catch:{ all -> 0x012e }
                        if (r5 != 0) goto L_0x00e3;	 Catch:{ all -> 0x012e }
                    L_0x009e:
                        r5 = r4.f9756b;	 Catch:{ all -> 0x012e }
                        r1 = com.facebook.accountkit.AccountKitError.Type.LOGIN_INVALIDATED;	 Catch:{ all -> 0x012e }
                        r2 = com.facebook.accountkit.internal.InternalAccountKitError.NO_RESULT_FOUND;	 Catch:{ all -> 0x012e }
                        r5.m4389a(r1, r2);	 Catch:{ all -> 0x012e }
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r5 = r5.getStatus();
                        r0 = com.facebook.accountkit.internal.LoginStatus.ERROR;
                        r5 = r4.f9756b;
                        r5.m4398i();
                        r5 = r0;
                        r0 = r4.f9756b;
                        r0 = r0.b;
                        r5.m4424d(r0);
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r5 = r5.getStatus();
                        r0 = com.facebook.accountkit.internal.LoginStatus.SUCCESS;
                        if (r5 == r0) goto L_0x00dd;
                    L_0x00cf:
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r5 = r5.getStatus();
                        r0 = com.facebook.accountkit.internal.LoginStatus.ERROR;
                        if (r5 != r0) goto L_0x00e2;
                    L_0x00dd:
                        r5 = r0;
                        r5.m4432l();
                    L_0x00e2:
                        return;
                    L_0x00e3:
                        r1 = r4.f9756b;	 Catch:{ JSONException -> 0x00e9, JSONException -> 0x00e9 }
                        r1.m4391a(r5);	 Catch:{ JSONException -> 0x00e9, JSONException -> 0x00e9 }
                        goto L_0x00f2;
                    L_0x00e9:
                        r5 = r4.f9756b;	 Catch:{ all -> 0x012e }
                        r1 = com.facebook.accountkit.AccountKitError.Type.LOGIN_INVALIDATED;	 Catch:{ all -> 0x012e }
                        r2 = com.facebook.accountkit.internal.InternalAccountKitError.INVALID_GRAPH_RESULTS_FORMAT;	 Catch:{ all -> 0x012e }
                        r5.m4389a(r1, r2);	 Catch:{ all -> 0x012e }
                    L_0x00f2:
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r5 = r5.getStatus();
                        r0 = com.facebook.accountkit.internal.LoginStatus.ERROR;
                        r5 = r4.f9756b;
                        r5.m4398i();
                        r5 = r0;
                        r0 = r4.f9756b;
                        r0 = r0.b;
                        r5.m4424d(r0);
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r5 = r5.getStatus();
                        r0 = com.facebook.accountkit.internal.LoginStatus.SUCCESS;
                        if (r5 == r0) goto L_0x0128;
                    L_0x011a:
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r5 = r5.getStatus();
                        r0 = com.facebook.accountkit.internal.LoginStatus.ERROR;
                        if (r5 != r0) goto L_0x012d;
                    L_0x0128:
                        r5 = r0;
                        r5.m4432l();
                    L_0x012d:
                        return;
                    L_0x012e:
                        r1 = move-exception;
                        r5 = r0;
                    L_0x0130:
                        r2 = r4.f9756b;
                        r2 = r2.b;
                        r2 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r2;
                        r2 = r2.getStatus();
                        r3 = com.facebook.accountkit.internal.LoginStatus.ERROR;
                        if (r2 != r3) goto L_0x015e;
                    L_0x013e:
                        if (r5 == 0) goto L_0x015e;
                    L_0x0140:
                        r5 = r5.second;
                        r5 = (com.facebook.accountkit.internal.InternalAccountKitError) r5;
                        r5 = com.facebook.accountkit.internal.C1251w.m4498a(r5);
                        if (r5 == 0) goto L_0x015e;
                    L_0x014a:
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r2 = com.facebook.accountkit.internal.LoginStatus.PENDING;
                        r5.setStatus(r2);
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r5.setError(r0);
                    L_0x015e:
                        r5 = r4.f9756b;
                        r5.m4398i();
                        r5 = r0;
                        r0 = r4.f9756b;
                        r0 = r0.b;
                        r5.m4424d(r0);
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r5 = r5.getStatus();
                        r0 = com.facebook.accountkit.internal.LoginStatus.SUCCESS;
                        if (r5 == r0) goto L_0x0188;
                    L_0x017a:
                        r5 = r4.f9756b;
                        r5 = r5.b;
                        r5 = (com.facebook.accountkit.internal.PhoneLoginModelImpl) r5;
                        r5 = r5.getStatus();
                        r0 = com.facebook.accountkit.internal.LoginStatus.ERROR;
                        if (r5 != r0) goto L_0x018d;
                    L_0x0188:
                        r5 = r0;
                        r5.m4432l();
                    L_0x018d:
                        throw r1;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.t.2.onCompleted(com.facebook.accountkit.internal.f):void");
                    }
                };
                Bundle bundle = new Bundle();
                C1251w.m4490a(bundle, "confirmation_code", ((PhoneLoginModelImpl) this.b).getConfirmationCode());
                C1251w.m4490a(bundle, ManagerWebServices.PARAM_PHONE_NUMBER, ((PhoneLoginModelImpl) this.b).getPhoneNumber().toString());
                AccountKitGraphRequest a = m4387a("confirm_login", bundle);
                C1224e.m4323b();
                C1224e.m4321a(AccountKitGraphRequest.m4147a(a, c31782));
            }
        }
    }

    /* renamed from: e */
    public void mo1589e() {
        C1252x.m4527a(this.b);
        C1241p h = m4397h();
        if (h != null) {
            h.m4422c(this.b);
            Callback c3171a = new C3171a(this, h);
            Bundle bundle = new Bundle();
            C1251w.m4490a(bundle, "fb_user_token", h.m4429i());
            C1251w.m4490a(bundle, ManagerWebServices.PARAM_PHONE_NUMBER, ((PhoneLoginModelImpl) this.b).getPhoneNumber().toString());
            C1251w.m4490a(bundle, QueryParams.RESPONSE_TYPE, ((PhoneLoginModelImpl) this.b).getResponseType());
            C1251w.m4490a(bundle, "state", ((PhoneLoginModelImpl) this.b).getInitialAuthState());
            AccountKitGraphRequest a = m4387a("instant_verification_login", bundle);
            C1224e.m4323b();
            C1224e.m4321a(AccountKitGraphRequest.m4147a(a, c3171a));
        }
    }
}
