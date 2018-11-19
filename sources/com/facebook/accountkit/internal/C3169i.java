package com.facebook.accountkit.internal;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.facebook.accountkit.internal.AccountKitGraphRequest.Callback;
import com.facebook.accountkit.internal.C1239o.C3171a;
import com.facebook.ads.AdError;
import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;
import com.tinder.api.ManagerWebServices;

/* renamed from: com.facebook.accountkit.internal.i */
final class C3169i extends C1239o<EmailLoginModelImpl> {
    /* renamed from: c */
    private static final String f9747c = "com.facebook.accountkit.internal.i";

    /* renamed from: com.facebook.accountkit.internal.i$1 */
    class C31661 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C3169i f9743a;

        C31661(C3169i c3169i) {
            this.f9743a = c3169i;
        }

        public void onCompleted(com.facebook.accountkit.internal.C1227f r7) {
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
            r6 = this;
            r0 = r6.f9743a;
            r0 = r0.m4397h();
            if (r0 != 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r1 = r7.m4333a();	 Catch:{ all -> 0x00ef }
            if (r1 == 0) goto L_0x0026;	 Catch:{ all -> 0x00ef }
        L_0x000f:
            r7 = r7.m4333a();	 Catch:{ all -> 0x00ef }
            r7 = com.facebook.accountkit.internal.C1251w.m4483a(r7);	 Catch:{ all -> 0x00ef }
            r0 = r6.f9743a;	 Catch:{ all -> 0x00ef }
            r7 = r7.first;	 Catch:{ all -> 0x00ef }
            r7 = (com.facebook.accountkit.AccountKitError) r7;	 Catch:{ all -> 0x00ef }
            r0.m4390a(r7);	 Catch:{ all -> 0x00ef }
            r7 = r6.f9743a;
            r7.m4398i();
            return;
        L_0x0026:
            r7 = r7.m4334b();	 Catch:{ all -> 0x00ef }
            if (r7 != 0) goto L_0x003b;	 Catch:{ all -> 0x00ef }
        L_0x002c:
            r7 = r6.f9743a;	 Catch:{ all -> 0x00ef }
            r0 = com.facebook.accountkit.AccountKitError.Type.LOGIN_INVALIDATED;	 Catch:{ all -> 0x00ef }
            r1 = com.facebook.accountkit.internal.InternalAccountKitError.NO_RESULT_FOUND;	 Catch:{ all -> 0x00ef }
            r7.m4389a(r0, r1);	 Catch:{ all -> 0x00ef }
            r7 = r6.f9743a;
            r7.m4398i();
            return;
        L_0x003b:
            r1 = "privacy_policy";	 Catch:{ all -> 0x00ef }
            r1 = r7.optString(r1);	 Catch:{ all -> 0x00ef }
            r2 = com.facebook.accountkit.internal.C1251w.m4500a(r1);	 Catch:{ all -> 0x00ef }
            if (r2 != 0) goto L_0x0052;	 Catch:{ all -> 0x00ef }
        L_0x0047:
            r2 = r6.f9743a;	 Catch:{ all -> 0x00ef }
            r2 = r2.b;	 Catch:{ all -> 0x00ef }
            r2 = (com.facebook.accountkit.internal.EmailLoginModelImpl) r2;	 Catch:{ all -> 0x00ef }
            r3 = "privacy_policy";	 Catch:{ all -> 0x00ef }
            r2.putField(r3, r1);	 Catch:{ all -> 0x00ef }
        L_0x0052:
            r1 = "terms_of_service";	 Catch:{ all -> 0x00ef }
            r1 = r7.optString(r1);	 Catch:{ all -> 0x00ef }
            r2 = com.facebook.accountkit.internal.C1251w.m4500a(r1);	 Catch:{ all -> 0x00ef }
            if (r2 != 0) goto L_0x0069;	 Catch:{ all -> 0x00ef }
        L_0x005e:
            r2 = r6.f9743a;	 Catch:{ all -> 0x00ef }
            r2 = r2.b;	 Catch:{ all -> 0x00ef }
            r2 = (com.facebook.accountkit.internal.EmailLoginModelImpl) r2;	 Catch:{ all -> 0x00ef }
            r3 = "terms_of_service";	 Catch:{ all -> 0x00ef }
            r2.putField(r3, r1);	 Catch:{ all -> 0x00ef }
        L_0x0069:
            r1 = "can_attempt_seamless_login";	 Catch:{ JSONException -> 0x0098 }
            r1 = r7.getBoolean(r1);	 Catch:{ JSONException -> 0x0098 }
            r2 = "expires_at";	 Catch:{ JSONException -> 0x0098 }
            r2 = r7.getString(r2);	 Catch:{ JSONException -> 0x0098 }
            r2 = java.lang.Long.parseLong(r2);	 Catch:{ JSONException -> 0x0098 }
            r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ JSONException -> 0x0098 }
            r2 = r2 * r4;	 Catch:{ JSONException -> 0x0098 }
            if (r1 == 0) goto L_0x0098;	 Catch:{ JSONException -> 0x0098 }
        L_0x007f:
            r4 = java.lang.System.currentTimeMillis();	 Catch:{ JSONException -> 0x0098 }
            r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ JSONException -> 0x0098 }
            if (r1 <= 0) goto L_0x0098;	 Catch:{ JSONException -> 0x0098 }
        L_0x0087:
            r1 = r6.f9743a;	 Catch:{ JSONException -> 0x0098 }
            r1 = r1.b;	 Catch:{ JSONException -> 0x0098 }
            r1 = (com.facebook.accountkit.internal.EmailLoginModelImpl) r1;	 Catch:{ JSONException -> 0x0098 }
            r2 = com.facebook.accountkit.internal.LoginStatus.ACCOUNT_VERIFIED;	 Catch:{ JSONException -> 0x0098 }
            r1.setStatus(r2);	 Catch:{ JSONException -> 0x0098 }
            r7 = r6.f9743a;
            r7.m4398i();
            return;
        L_0x0098:
            r1 = "login_request_code";	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r1 = r7.getString(r1);	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r2 = r6.f9743a;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r2 = r2.b;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r2 = (com.facebook.accountkit.internal.EmailLoginModelImpl) r2;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r2.setLoginCode(r1);	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r1 = "expires_in_sec";	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r1 = r7.getString(r1);	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r1 = java.lang.Long.parseLong(r1);	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r3 = r6.f9743a;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r3 = r3.b;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r3 = (com.facebook.accountkit.internal.EmailLoginModelImpl) r3;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r3.setExpiresInSeconds(r1);	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r1 = "interval_sec";	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r7 = r7.getString(r1);	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r7 = java.lang.Integer.parseInt(r7);	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r1 = r6.f9743a;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r1 = r1.b;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r1 = (com.facebook.accountkit.internal.EmailLoginModelImpl) r1;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r1.setInterval(r7);	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r7 = r6.f9743a;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r7 = r7.b;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r7 = (com.facebook.accountkit.internal.EmailLoginModelImpl) r7;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r1 = com.facebook.accountkit.internal.LoginStatus.PENDING;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r7.setStatus(r1);	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r7 = r6.f9743a;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r7 = r7.b;	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            r0.m4416a(r7);	 Catch:{ JSONException -> 0x00e0, JSONException -> 0x00e0 }
            goto L_0x00e9;
        L_0x00e0:
            r7 = r6.f9743a;	 Catch:{ all -> 0x00ef }
            r0 = com.facebook.accountkit.AccountKitError.Type.LOGIN_INVALIDATED;	 Catch:{ all -> 0x00ef }
            r1 = com.facebook.accountkit.internal.InternalAccountKitError.INVALID_GRAPH_RESULTS_FORMAT;	 Catch:{ all -> 0x00ef }
            r7.m4389a(r0, r1);	 Catch:{ all -> 0x00ef }
        L_0x00e9:
            r7 = r6.f9743a;
            r7.m4398i();
            return;
        L_0x00ef:
            r7 = move-exception;
            r0 = r6.f9743a;
            r0.m4398i();
            throw r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.i.1.onCompleted(com.facebook.accountkit.internal.f):void");
        }
    }

    /* renamed from: com.facebook.accountkit.internal.i$a */
    private class C3168a implements Callback {
        /* renamed from: a */
        final EmailLoginModelImpl f9745a;
        /* renamed from: b */
        final /* synthetic */ C3169i f9746b;

        C3168a(C3169i c3169i, EmailLoginModelImpl emailLoginModelImpl) {
            this.f9746b = c3169i;
            this.f9745a = emailLoginModelImpl;
        }

        public void onCompleted(com.facebook.accountkit.internal.C1227f r10) {
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
            r9 = this;
            com.facebook.accountkit.internal.C1251w.m4510d();
            r0 = r9.f9746b;
            r0 = r0.m4397h();
            if (r0 != 0) goto L_0x000c;
        L_0x000b:
            return;
        L_0x000c:
            r1 = r0.m4433m();
            if (r1 == 0) goto L_0x0204;
        L_0x0012:
            r1 = r0.m4435o();
            if (r1 != 0) goto L_0x001a;
        L_0x0018:
            goto L_0x0204;
        L_0x001a:
            r1 = r10.m4333a();	 Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0055;	 Catch:{ all -> 0x01df }
        L_0x0020:
            r10 = r10.m4333a();	 Catch:{ all -> 0x01df }
            r10 = com.facebook.accountkit.internal.C1251w.m4483a(r10);	 Catch:{ all -> 0x01df }
            r1 = r9.f9746b;	 Catch:{ all -> 0x01df }
            r10 = r10.first;	 Catch:{ all -> 0x01df }
            r10 = (com.facebook.accountkit.AccountKitError) r10;	 Catch:{ all -> 0x01df }
            r1.m4390a(r10);	 Catch:{ all -> 0x01df }
            r10 = r9.f9745a;
            if (r10 == 0) goto L_0x0054;
        L_0x0035:
            r10 = com.facebook.accountkit.internal.C3169i.C12313.f3299a;
            r1 = r9.f9745a;
            r1 = r1.getStatus();
            r1 = r1.ordinal();
            r10 = r10[r1];
            switch(r10) {
                case 1: goto L_0x0047;
                case 2: goto L_0x0047;
                default: goto L_0x0046;
            };
        L_0x0046:
            goto L_0x0054;
        L_0x0047:
            r10 = r9.f9745a;
            r0.m4424d(r10);
            r10 = r9.f9746b;
            r10.m4398i();
            r0.m4432l();
        L_0x0054:
            return;
        L_0x0055:
            r10 = r10.m4334b();	 Catch:{ all -> 0x01df }
            if (r10 != 0) goto L_0x0088;	 Catch:{ all -> 0x01df }
        L_0x005b:
            r10 = r9.f9746b;	 Catch:{ all -> 0x01df }
            r1 = com.facebook.accountkit.AccountKitError.Type.LOGIN_INVALIDATED;	 Catch:{ all -> 0x01df }
            r2 = com.facebook.accountkit.internal.InternalAccountKitError.NO_RESULT_FOUND;	 Catch:{ all -> 0x01df }
            r10.m4389a(r1, r2);	 Catch:{ all -> 0x01df }
            r10 = r9.f9745a;
            if (r10 == 0) goto L_0x0087;
        L_0x0068:
            r10 = com.facebook.accountkit.internal.C3169i.C12313.f3299a;
            r1 = r9.f9745a;
            r1 = r1.getStatus();
            r1 = r1.ordinal();
            r10 = r10[r1];
            switch(r10) {
                case 1: goto L_0x007a;
                case 2: goto L_0x007a;
                default: goto L_0x0079;
            };
        L_0x0079:
            goto L_0x0087;
        L_0x007a:
            r10 = r9.f9745a;
            r0.m4424d(r10);
            r10 = r9.f9746b;
            r10.m4398i();
            r0.m4432l();
        L_0x0087:
            return;
        L_0x0088:
            r1 = "status";	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = r10.getString(r1);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = "pending";	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = r1.equals(r2);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            if (r1 == 0) goto L_0x0142;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
        L_0x0096:
            r1 = r9.f9746b;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r3 = new com.facebook.accountkit.internal.i$a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r4 = r9.f9746b;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r5 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r3.<init>(r4, r5);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = r1.m12206a(r2, r3);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            if (r1 != 0) goto L_0x00cd;
        L_0x00a9:
            r10 = r9.f9745a;
            if (r10 == 0) goto L_0x00cc;
        L_0x00ad:
            r10 = com.facebook.accountkit.internal.C3169i.C12313.f3299a;
            r1 = r9.f9745a;
            r1 = r1.getStatus();
            r1 = r1.ordinal();
            r10 = r10[r1];
            switch(r10) {
                case 1: goto L_0x00bf;
                case 2: goto L_0x00bf;
                default: goto L_0x00be;
            };
        L_0x00be:
            goto L_0x00cc;
        L_0x00bf:
            r10 = r9.f9745a;
            r0.m4424d(r10);
            r10 = r9.f9746b;
            r10.m4398i();
            r0.m4432l();
        L_0x00cc:
            return;
        L_0x00cd:
            r2 = "interval_sec";	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = r10.getString(r2);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = java.lang.Integer.parseInt(r2);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r3 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r3.setInterval(r2);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = "expires_in_sec";	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10 = r10.getString(r2);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = java.lang.Long.parseLong(r10);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10.setExpiresInSeconds(r2);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10 = r10.getInterval();	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r4 = (long) r10;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            if (r10 >= 0) goto L_0x0123;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
        L_0x00f6:
            r10 = r9.f9746b;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = com.facebook.accountkit.AccountKitError.Type.LOGIN_INVALIDATED;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = com.facebook.accountkit.internal.InternalAccountKitError.EXPIRED_EMAIL_REQUEST;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10.m4389a(r1, r2);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10 = r9.f9745a;
            if (r10 == 0) goto L_0x0122;
        L_0x0103:
            r10 = com.facebook.accountkit.internal.C3169i.C12313.f3299a;
            r1 = r9.f9745a;
            r1 = r1.getStatus();
            r1 = r1.ordinal();
            r10 = r10[r1];
            switch(r10) {
                case 1: goto L_0x0115;
                case 2: goto L_0x0115;
                default: goto L_0x0114;
            };
        L_0x0114:
            goto L_0x0122;
        L_0x0115:
            r10 = r9.f9745a;
            r0.m4424d(r10);
            r10 = r9.f9746b;
            r10.m4398i();
            r0.m4432l();
        L_0x0122:
            return;
        L_0x0123:
            r10 = r0.m4433m();	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            if (r10 != 0) goto L_0x012f;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
        L_0x0129:
            r10 = r0.m4435o();	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            if (r10 == 0) goto L_0x01bb;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
        L_0x012f:
            r10 = new android.os.Handler;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10.<init>();	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = r2.getInterval();	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = r2 * 1000;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = (long) r2;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10.postDelayed(r1, r2);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            goto L_0x01bb;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
        L_0x0142:
            r1 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = r1.getResponseType();	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = "token";	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = com.facebook.accountkit.internal.C1251w.m4505b(r1, r2);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            if (r1 == 0) goto L_0x0194;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
        L_0x0150:
            r1 = "access_token";	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r3 = r10.getString(r1);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = "id";	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r4 = r10.getString(r1);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = "token_refresh_interval_sec";	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = r10.getString(r1);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r6 = java.lang.Long.parseLong(r1);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = new com.facebook.accountkit.AccessToken;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r5 = com.facebook.accountkit.AccountKit.m4119h();	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r8 = new java.util.Date;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r8.<init>();	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = r1;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2.<init>(r3, r4, r5, r6, r8);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = r9.f9746b;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = r2.a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2.m4255a(r1);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = "state";	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10 = r10.optString(r2);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2.setFinalAuthState(r10);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10.setAccessToken(r1);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = com.facebook.accountkit.internal.LoginStatus.SUCCESS;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10.setStatus(r1);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            goto L_0x01bb;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
        L_0x0194:
            r1 = "code";	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = r10.getString(r1);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r2.setCode(r1);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = "state";	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10 = r10.optString(r1);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1.setFinalAuthState(r10);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10 = r9.f9745a;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r1 = com.facebook.accountkit.internal.LoginStatus.SUCCESS;	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            r10.setStatus(r1);	 Catch:{ JSONException -> 0x01b2, JSONException -> 0x01b2 }
            goto L_0x01bb;
        L_0x01b2:
            r10 = r9.f9746b;	 Catch:{ all -> 0x01df }
            r1 = com.facebook.accountkit.AccountKitError.Type.LOGIN_INVALIDATED;	 Catch:{ all -> 0x01df }
            r2 = com.facebook.accountkit.internal.InternalAccountKitError.INVALID_GRAPH_RESULTS_FORMAT;	 Catch:{ all -> 0x01df }
            r10.m4389a(r1, r2);	 Catch:{ all -> 0x01df }
        L_0x01bb:
            r10 = r9.f9745a;
            if (r10 == 0) goto L_0x01de;
        L_0x01bf:
            r10 = com.facebook.accountkit.internal.C3169i.C12313.f3299a;
            r1 = r9.f9745a;
            r1 = r1.getStatus();
            r1 = r1.ordinal();
            r10 = r10[r1];
            switch(r10) {
                case 1: goto L_0x01d1;
                case 2: goto L_0x01d1;
                default: goto L_0x01d0;
            };
        L_0x01d0:
            goto L_0x01de;
        L_0x01d1:
            r10 = r9.f9745a;
            r0.m4424d(r10);
            r10 = r9.f9746b;
            r10.m4398i();
            r0.m4432l();
        L_0x01de:
            return;
        L_0x01df:
            r10 = move-exception;
            r1 = r9.f9745a;
            if (r1 == 0) goto L_0x0203;
        L_0x01e4:
            r1 = com.facebook.accountkit.internal.C3169i.C12313.f3299a;
            r2 = r9.f9745a;
            r2 = r2.getStatus();
            r2 = r2.ordinal();
            r1 = r1[r2];
            switch(r1) {
                case 1: goto L_0x01f6;
                case 2: goto L_0x01f6;
                default: goto L_0x01f5;
            };
        L_0x01f5:
            goto L_0x0203;
        L_0x01f6:
            r1 = r9.f9745a;
            r0.m4424d(r1);
            r1 = r9.f9746b;
            r1.m4398i();
            r0.m4432l();
        L_0x0203:
            throw r10;
        L_0x0204:
            r10 = com.facebook.accountkit.internal.C3169i.f9747c;
            r0 = "Warning: Callback issues while activity not available.";
            android.util.Log.w(r10, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.i.a.onCompleted(com.facebook.accountkit.internal.f):void");
        }
    }

    /* renamed from: a */
    protected String mo1584a() {
        return "email";
    }

    /* renamed from: b */
    protected String mo1586b() {
        return "com.facebook.accountkit.sdk.ACTION_EMAIL_LOGIN_STATE_CHANGED";
    }

    C3169i(C1218b c1218b, C1241p c1241p, EmailLoginModelImpl emailLoginModelImpl) {
        super(c1218b, c1241p, emailLoginModelImpl);
    }

    /* renamed from: a */
    public void mo1585a(@Nullable String str) {
        Callback c31661 = new C31661(this);
        Bundle bundle = new Bundle();
        C1251w.m4490a(bundle, "email", ((EmailLoginModelImpl) this.b).getEmail());
        C1251w.m4490a(bundle, QueryParams.REDIRECT_URI, C1251w.m4512e());
        C1251w.m4490a(bundle, "state", str);
        C1251w.m4490a(bundle, QueryParams.RESPONSE_TYPE, ((EmailLoginModelImpl) this.b).getResponseType());
        C1251w.m4490a(bundle, ManagerWebServices.FB_PARAM_BATCH_FIELDS, "terms_of_service,privacy_policy");
        C1241p h = m4397h();
        if (h != null) {
            if (h.m4430j()) {
                h.m4418b().m4377a("ak_fetch_seamless_login_token", "not_completed");
            } else {
                C1251w.m4490a(bundle, "fb_user_token", h.m4428h());
            }
        }
        ((EmailLoginModelImpl) this.b).setInitialAuthState(str);
        AccountKitGraphRequest a = m4387a("start_login", bundle);
        C1224e.m4323b();
        C1224e.m4321a(AccountKitGraphRequest.m4147a(a, c31661));
    }

    /* renamed from: c */
    public void mo1587c() {
        ((EmailLoginModelImpl) this.b).setStatus(LoginStatus.CANCELLED);
        m4398i();
        C1224e.m4323b();
    }

    /* renamed from: d */
    public void mo1588d() {
        C1241p h = m4397h();
        if (h != null && h.m4433m()) {
            Runnable a = m12206a((EmailLoginModelImpl) this.b, new C3168a(this, (EmailLoginModelImpl) this.b));
            if (a != null) {
                new Handler().postDelayed(a, (long) (((EmailLoginModelImpl) this.b).getInterval() * AdError.NETWORK_ERROR_CODE));
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
            C1251w.m4490a(bundle, "email", ((EmailLoginModelImpl) this.b).getEmail());
            C1251w.m4490a(bundle, QueryParams.RESPONSE_TYPE, ((EmailLoginModelImpl) this.b).getResponseType());
            C1251w.m4490a(bundle, "state", ((EmailLoginModelImpl) this.b).getInitialAuthState());
            AccountKitGraphRequest a = m4387a("instant_verification_login", bundle);
            C1224e.m4323b();
            C1224e.m4321a(AccountKitGraphRequest.m4147a(a, c3171a));
        }
    }

    @Nullable
    /* renamed from: a */
    private Runnable m12206a(final EmailLoginModelImpl emailLoginModelImpl, final Callback callback) {
        C1241p h = m4397h();
        if (h == null) {
            return null;
        }
        final String f = h.m4426f();
        return new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ C3169i f3298d;

            /* renamed from: com.facebook.accountkit.internal.i$2$1 */
            class C31671 implements Callback {
                /* renamed from: a */
                final /* synthetic */ C12302 f9744a;

                C31671(C12302 c12302) {
                    this.f9744a = c12302;
                }

                public void onCompleted(C1227f c1227f) {
                    callback.onCompleted(c1227f);
                }
            }

            public void run() {
                C1251w.m4510d();
                if (m4349a()) {
                    Bundle bundle = new Bundle();
                    C1251w.m4490a(bundle, "email", emailLoginModelImpl.getEmail());
                    AccountKitGraphRequest a = this.f3298d.m4387a("poll_login", bundle);
                    C1224e.m4323b();
                    C1224e.m4321a(AccountKitGraphRequest.m4147a(a, new C31671(this)));
                }
            }

            /* renamed from: a */
            private boolean m4349a() {
                C1241p h = this.f3298d.m4397h();
                return h != null && f.equals(h.m4426f()) && h.m4435o();
            }
        };
    }
}
