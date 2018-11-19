package com.facebook.accountkit.internal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.UpdateFlowBroadcastReceiver;
import com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event;
import com.facebook.accountkit.internal.AccountKitGraphRequest.Callback;
import com.tinder.api.ManagerWebServices;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.accountkit.internal.u */
final class C1247u {
    /* renamed from: a */
    private final WeakReference<C1249v> f3344a;
    /* renamed from: b */
    private final PhoneUpdateModelImpl f3345b;

    /* renamed from: com.facebook.accountkit.internal.u$1 */
    class C31801 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C1247u f9758a;

        C31801(C1247u c1247u) {
            this.f9758a = c1247u;
        }

        public void onCompleted(com.facebook.accountkit.internal.C1227f r11) {
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
            r10 = this;
            r0 = r10.f9758a;
            r0 = r0.m4461e();
            if (r0 == 0) goto L_0x01c5;
        L_0x0008:
            if (r11 != 0) goto L_0x000c;
        L_0x000a:
            goto L_0x01c5;
        L_0x000c:
            r1 = 0;
            r2 = r11.m4333a();	 Catch:{ all -> 0x017b }
            if (r2 == 0) goto L_0x0073;	 Catch:{ all -> 0x017b }
        L_0x0013:
            r11 = r11.m4333a();	 Catch:{ all -> 0x017b }
            r11 = com.facebook.accountkit.internal.C1251w.m4483a(r11);	 Catch:{ all -> 0x017b }
            r1 = r10.f9758a;	 Catch:{ all -> 0x006d }
            r2 = r11.first;	 Catch:{ all -> 0x006d }
            r2 = (com.facebook.accountkit.AccountKitError) r2;	 Catch:{ all -> 0x006d }
            r1.m4459b(r2);	 Catch:{ all -> 0x006d }
            r1 = new android.content.Intent;
            r2 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3151a;
            r1.<init>(r2);
            r2 = r10.f9758a;
            r2 = r2.f3345b;
            r2 = r2.getStatus();
            r3 = com.facebook.accountkit.internal.UpdateStatus.PENDING;
            if (r2 != r3) goto L_0x0041;
        L_0x0039:
            r11 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3152b;
            r2 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event.SENT_CODE;
            r1.putExtra(r11, r2);
            goto L_0x0065;
        L_0x0041:
            r2 = r10.f9758a;
            r2 = r2.f3345b;
            r2 = r2.getStatus();
            r3 = com.facebook.accountkit.internal.UpdateStatus.ERROR;
            if (r2 != r3) goto L_0x0065;
        L_0x004f:
            r2 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3152b;
            r3 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event.ERROR_UPDATE;
            r1.putExtra(r2, r3);
            if (r11 == 0) goto L_0x0065;
        L_0x0058:
            r2 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3154d;
            r11 = r11.first;
            r11 = (com.facebook.accountkit.AccountKitError) r11;
            r11 = r11.getUserFacingMessage();
            r1.putExtra(r2, r11);
        L_0x0065:
            r11 = r0.m4479e();
            r11.m1653a(r1);
            return;
        L_0x006d:
            r1 = move-exception;
            r9 = r1;
            r1 = r11;
            r11 = r9;
            goto L_0x017c;
        L_0x0073:
            r11 = r11.m4334b();	 Catch:{ all -> 0x017b }
            if (r11 != 0) goto L_0x00bc;	 Catch:{ all -> 0x017b }
        L_0x0079:
            r11 = r10.f9758a;	 Catch:{ all -> 0x017b }
            r2 = com.facebook.accountkit.AccountKitError.Type.UPDATE_INVALIDATED;	 Catch:{ all -> 0x017b }
            r3 = com.facebook.accountkit.internal.InternalAccountKitError.NO_RESULT_FOUND;	 Catch:{ all -> 0x017b }
            r11.m4455a(r2, r3);	 Catch:{ all -> 0x017b }
            r11 = new android.content.Intent;
            r1 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3151a;
            r11.<init>(r1);
            r1 = r10.f9758a;
            r1 = r1.f3345b;
            r1 = r1.getStatus();
            r2 = com.facebook.accountkit.internal.UpdateStatus.PENDING;
            if (r1 != r2) goto L_0x009f;
        L_0x0097:
            r1 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3152b;
            r2 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event.SENT_CODE;
            r11.putExtra(r1, r2);
            goto L_0x00b4;
        L_0x009f:
            r1 = r10.f9758a;
            r1 = r1.f3345b;
            r1 = r1.getStatus();
            r2 = com.facebook.accountkit.internal.UpdateStatus.ERROR;
            if (r1 != r2) goto L_0x00b4;
        L_0x00ad:
            r1 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3152b;
            r2 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event.ERROR_UPDATE;
            r11.putExtra(r1, r2);
        L_0x00b4:
            r0 = r0.m4479e();
            r0.m1653a(r11);
            return;
        L_0x00bc:
            r2 = "privacy_policy";	 Catch:{ all -> 0x017b }
            r2 = r11.optString(r2);	 Catch:{ all -> 0x017b }
            r3 = com.facebook.accountkit.internal.C1251w.m4500a(r2);	 Catch:{ all -> 0x017b }
            if (r3 != 0) goto L_0x00d3;	 Catch:{ all -> 0x017b }
        L_0x00c8:
            r3 = r10.f9758a;	 Catch:{ all -> 0x017b }
            r3 = r3.f3345b;	 Catch:{ all -> 0x017b }
            r4 = "privacy_policy";	 Catch:{ all -> 0x017b }
            r3.putField(r4, r2);	 Catch:{ all -> 0x017b }
        L_0x00d3:
            r2 = "terms_of_service";	 Catch:{ all -> 0x017b }
            r2 = r11.optString(r2);	 Catch:{ all -> 0x017b }
            r3 = com.facebook.accountkit.internal.C1251w.m4500a(r2);	 Catch:{ all -> 0x017b }
            if (r3 != 0) goto L_0x00ea;	 Catch:{ all -> 0x017b }
        L_0x00df:
            r3 = r10.f9758a;	 Catch:{ all -> 0x017b }
            r3 = r3.f3345b;	 Catch:{ all -> 0x017b }
            r4 = "terms_of_service";	 Catch:{ all -> 0x017b }
            r3.putField(r4, r2);	 Catch:{ all -> 0x017b }
        L_0x00ea:
            r2 = "update_request_code";	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r2 = r11.getString(r2);	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r3 = "expires_in_sec";	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r3 = r11.getString(r3);	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r3 = java.lang.Long.parseLong(r3);	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r5 = r10.f9758a;	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r5 = r5.f3345b;	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r5.setExpiresInSeconds(r3);	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r3 = "min_resend_interval_sec";	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r11 = r11.optString(r3);	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r3 = java.lang.Long.parseLong(r11);	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r11 = r10.f9758a;	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r11 = r11.f3345b;	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r5 = java.lang.System.currentTimeMillis();	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r7 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r3 = r7.toMillis(r3);	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r7 = 0;	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r7 = r5 + r3;	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r11.setResendTime(r7);	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r11 = r10.f9758a;	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r11 = r11.f3345b;	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r3 = com.facebook.accountkit.internal.UpdateStatus.PENDING;	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r11.setStatus(r3);	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r11 = r10.f9758a;	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r11 = r11.f3345b;	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            r11.setUpdateRequestCode(r2);	 Catch:{ JSONException -> 0x0138, JSONException -> 0x0138 }
            goto L_0x0141;
        L_0x0138:
            r11 = r10.f9758a;	 Catch:{ all -> 0x017b }
            r2 = com.facebook.accountkit.AccountKitError.Type.UPDATE_INVALIDATED;	 Catch:{ all -> 0x017b }
            r3 = com.facebook.accountkit.internal.InternalAccountKitError.INVALID_GRAPH_RESULTS_FORMAT;	 Catch:{ all -> 0x017b }
            r11.m4455a(r2, r3);	 Catch:{ all -> 0x017b }
        L_0x0141:
            r11 = new android.content.Intent;
            r1 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3151a;
            r11.<init>(r1);
            r1 = r10.f9758a;
            r1 = r1.f3345b;
            r1 = r1.getStatus();
            r2 = com.facebook.accountkit.internal.UpdateStatus.PENDING;
            if (r1 != r2) goto L_0x015e;
        L_0x0156:
            r1 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3152b;
            r2 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event.SENT_CODE;
            r11.putExtra(r1, r2);
            goto L_0x0173;
        L_0x015e:
            r1 = r10.f9758a;
            r1 = r1.f3345b;
            r1 = r1.getStatus();
            r2 = com.facebook.accountkit.internal.UpdateStatus.ERROR;
            if (r1 != r2) goto L_0x0173;
        L_0x016c:
            r1 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3152b;
            r2 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event.ERROR_UPDATE;
            r11.putExtra(r1, r2);
        L_0x0173:
            r0 = r0.m4479e();
            r0.m1653a(r11);
            return;
        L_0x017b:
            r11 = move-exception;
        L_0x017c:
            r2 = new android.content.Intent;
            r3 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3151a;
            r2.<init>(r3);
            r3 = r10.f9758a;
            r3 = r3.f3345b;
            r3 = r3.getStatus();
            r4 = com.facebook.accountkit.internal.UpdateStatus.PENDING;
            if (r3 != r4) goto L_0x0199;
        L_0x0191:
            r1 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3152b;
            r3 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event.SENT_CODE;
            r2.putExtra(r1, r3);
            goto L_0x01bd;
        L_0x0199:
            r3 = r10.f9758a;
            r3 = r3.f3345b;
            r3 = r3.getStatus();
            r4 = com.facebook.accountkit.internal.UpdateStatus.ERROR;
            if (r3 != r4) goto L_0x01bd;
        L_0x01a7:
            r3 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3152b;
            r4 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event.ERROR_UPDATE;
            r2.putExtra(r3, r4);
            if (r1 == 0) goto L_0x01bd;
        L_0x01b0:
            r3 = com.facebook.accountkit.UpdateFlowBroadcastReceiver.f3154d;
            r1 = r1.first;
            r1 = (com.facebook.accountkit.AccountKitError) r1;
            r1 = r1.getUserFacingMessage();
            r2.putExtra(r3, r1);
        L_0x01bd:
            r0 = r0.m4479e();
            r0.m1653a(r2);
            throw r11;
        L_0x01c5:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.u.1.onCompleted(com.facebook.accountkit.internal.f):void");
        }
    }

    /* renamed from: com.facebook.accountkit.internal.u$2 */
    class C31812 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C1247u f9759a;

        C31812(C1247u c1247u) {
            this.f9759a = c1247u;
        }

        public void onCompleted(C1227f c1227f) {
            C1249v a = this.f9759a.m4461e();
            if (a != null) {
                if (c1227f != null) {
                    Intent intent = new Intent(UpdateFlowBroadcastReceiver.f3151a);
                    if (c1227f.m4333a() != null) {
                        c1227f = C1251w.m4483a(c1227f.m4333a());
                        if (C1251w.m4498a((InternalAccountKitError) c1227f.second)) {
                            this.f9759a.f3345b.setStatus(UpdateStatus.PENDING);
                            this.f9759a.f3345b.setError(null);
                            intent.putExtra(UpdateFlowBroadcastReceiver.f3152b, Event.RETRY_CONFIRMATION_CODE);
                        } else {
                            this.f9759a.m4459b((AccountKitError) c1227f.first);
                            a.m4478d();
                            intent.putExtra(UpdateFlowBroadcastReceiver.f3152b, Event.ERROR_CONFIRMATION_CODE);
                            intent.putExtra(UpdateFlowBroadcastReceiver.f3154d, ((AccountKitError) c1227f.first).getUserFacingMessage());
                        }
                    } else {
                        c1227f = c1227f.m4334b();
                        if (c1227f == null) {
                            this.f9759a.m4455a(Type.UPDATE_INVALIDATED, InternalAccountKitError.NO_RESULT_FOUND);
                            intent.putExtra(UpdateFlowBroadcastReceiver.f3152b, Event.ERROR_CONFIRMATION_CODE);
                        } else {
                            this.f9759a.f3345b.setFinalUpdateState(c1227f.optString("state"));
                            this.f9759a.f3345b.setStatus(UpdateStatus.SUCCESS);
                            intent.putExtra(UpdateFlowBroadcastReceiver.f3152b, Event.ACCOUNT_UPDATE_COMPLETE);
                            intent.putExtra(UpdateFlowBroadcastReceiver.f3156f, this.f9759a.f3345b.getFinalUpdateState());
                        }
                        a.m4478d();
                    }
                    a.m4475b().m4376a("ak_update_complete", this.f9759a.f3345b);
                    a.m4479e().m1653a(intent);
                }
            }
        }
    }

    /* renamed from: d */
    private String m4460d() {
        return ManagerWebServices.PARAM_PHONE_NUMBER;
    }

    C1247u(C1249v c1249v, PhoneUpdateModelImpl phoneUpdateModelImpl) {
        this.f3344a = new WeakReference(c1249v);
        this.f3345b = phoneUpdateModelImpl;
    }

    /* renamed from: a */
    void m4464a(String str) {
        Callback c31801 = new C31801(this);
        String phoneNumber = this.f3345b.getPhoneNumber().toString();
        Bundle bundle = new Bundle();
        C1251w.m4490a(bundle, ManagerWebServices.PARAM_PHONE_NUMBER, phoneNumber);
        C1251w.m4490a(bundle, "state", str);
        C1251w.m4490a(bundle, "extras", "terms_of_service,privacy_policy");
        this.f3345b.setInitialUpdateState(str);
        AccountKitGraphRequest a = m4453a("start_update", bundle);
        C1224e.m4323b();
        C1224e.m4321a(AccountKitGraphRequest.m4147a(a, c31801));
    }

    /* renamed from: a */
    void m4462a() {
        if (!C1251w.m4500a(this.f3345b.getConfirmationCode())) {
            Callback c31812 = new C31812(this);
            Bundle bundle = new Bundle();
            C1251w.m4490a(bundle, "confirmation_code", this.f3345b.getConfirmationCode());
            C1251w.m4490a(bundle, ManagerWebServices.PARAM_PHONE_NUMBER, this.f3345b.getPhoneNumber().toString());
            AccountKitGraphRequest a = m4453a("confirm_update", bundle);
            C1224e.m4323b();
            C1224e.m4321a(AccountKitGraphRequest.m4147a(a, c31812));
        }
    }

    /* renamed from: b */
    public void m4465b() {
        this.f3345b.setStatus(UpdateStatus.CANCELLED);
        C1224e.m4323b();
        C1224e.m4321a(null);
        C1249v e = m4461e();
        if (e != null) {
            e.m4478d();
        }
    }

    /* renamed from: a */
    public void m4463a(AccountKitError accountKitError) {
        this.f3345b.setError(accountKitError);
        this.f3345b.setStatus(UpdateStatus.ERROR);
        accountKitError = m4461e();
        if (accountKitError != null) {
            accountKitError.m4478d();
        }
    }

    /* renamed from: c */
    PhoneUpdateModelImpl m4466c() {
        return this.f3345b;
    }

    /* renamed from: b */
    private void m4459b(AccountKitError accountKitError) {
        this.f3345b.setError(accountKitError);
        this.f3345b.setStatus(UpdateStatus.ERROR);
    }

    /* renamed from: a */
    private void m4455a(Type type, InternalAccountKitError internalAccountKitError) {
        m4459b(new AccountKitError(type, internalAccountKitError));
    }

    /* renamed from: a */
    private AccountKitGraphRequest m4453a(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        C1251w.m4490a(bundle2, "credentials_type", m4460d());
        C1251w.m4490a(bundle2, "update_request_code", this.f3345b.getUpdateRequestCode());
        bundle2.putAll(bundle);
        return new AccountKitGraphRequest(AccountKit.m4116e(), str, bundle2, false, HttpMethod.POST);
    }

    @Nullable
    /* renamed from: e */
    private C1249v m4461e() {
        C1249v c1249v = (C1249v) this.f3344a.get();
        if (c1249v != null && c1249v.m4477c()) {
            return c1249v;
        }
        return null;
    }
}
