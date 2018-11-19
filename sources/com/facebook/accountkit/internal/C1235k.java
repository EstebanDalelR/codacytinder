package com.facebook.accountkit.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.accountkit.internal.AccountKitGraphRequest.Callback;

/* renamed from: com.facebook.accountkit.internal.k */
final class C1235k {
    /* renamed from: a */
    private Context f3311a;

    /* renamed from: com.facebook.accountkit.internal.k$1 */
    class C12331 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1235k f3308a;

        C12331(C1235k c1235k) {
            this.f3308a = c1235k;
        }

        public void run() {
            C1232j a = this.f3308a.m4363a();
            if (!a.m4354a() || a.m4355b()) {
                this.f3308a.m4362a(a.m4357c());
            }
        }
    }

    C1235k() {
    }

    /* renamed from: a */
    void m4364a(@NonNull Context context) {
        C1252x.m4526a(context);
        this.f3311a = context.getApplicationContext();
        C1251w.m4502b().execute(new C12331(this));
    }

    /* renamed from: a */
    C1232j m4363a() {
        return new C1232j(this.f3311a);
    }

    /* renamed from: a */
    private void m4362a(@Nullable final String str) {
        C1251w.m4502b().execute(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C1235k f3310b;

            /* renamed from: com.facebook.accountkit.internal.k$2$1 */
            class C31701 implements Callback {
                /* renamed from: a */
                final /* synthetic */ C12342 f9748a;

                C31701(C12342 c12342) {
                    this.f9748a = c12342;
                }

                public void onCompleted(com.facebook.accountkit.internal.C1227f r9) {
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
                    r8 = this;
                    if (r9 == 0) goto L_0x0095;
                L_0x0002:
                    r0 = r9.m4334b();
                    if (r0 == 0) goto L_0x0095;
                L_0x0008:
                    r0 = r9.m4333a();
                    if (r0 == 0) goto L_0x0010;
                L_0x000e:
                    goto L_0x0095;
                L_0x0010:
                    r9 = r9.m4334b();	 Catch:{ JSONException -> 0x0094 }
                    r0 = "data";	 Catch:{ JSONException -> 0x0094 }
                    r9 = r9.getJSONArray(r0);	 Catch:{ JSONException -> 0x0094 }
                    r0 = 0;	 Catch:{ JSONException -> 0x0094 }
                    r9 = r9.getJSONObject(r0);	 Catch:{ JSONException -> 0x0094 }
                    r1 = "create_time";	 Catch:{ JSONException -> 0x0094 }
                    r1 = r9.has(r1);	 Catch:{ JSONException -> 0x0094 }
                    r2 = 0;	 Catch:{ JSONException -> 0x0094 }
                    if (r1 == 0) goto L_0x0033;	 Catch:{ JSONException -> 0x0094 }
                L_0x0028:
                    r1 = "create_time";	 Catch:{ JSONException -> 0x0094 }
                    r3 = r9.getLong(r1);	 Catch:{ JSONException -> 0x0094 }
                    r1 = java.lang.Long.valueOf(r3);	 Catch:{ JSONException -> 0x0094 }
                    goto L_0x0034;	 Catch:{ JSONException -> 0x0094 }
                L_0x0033:
                    r1 = r2;	 Catch:{ JSONException -> 0x0094 }
                L_0x0034:
                    r3 = "unit_id";	 Catch:{ JSONException -> 0x0094 }
                    r3 = r9.has(r3);	 Catch:{ JSONException -> 0x0094 }
                    if (r3 == 0) goto L_0x0043;	 Catch:{ JSONException -> 0x0094 }
                L_0x003c:
                    r3 = "unit_id";	 Catch:{ JSONException -> 0x0094 }
                    r3 = r9.getString(r3);	 Catch:{ JSONException -> 0x0094 }
                    goto L_0x0044;	 Catch:{ JSONException -> 0x0094 }
                L_0x0043:
                    r3 = r2;	 Catch:{ JSONException -> 0x0094 }
                L_0x0044:
                    r4 = "ttl";	 Catch:{ JSONException -> 0x0094 }
                    r4 = r9.has(r4);	 Catch:{ JSONException -> 0x0094 }
                    if (r4 == 0) goto L_0x0056;	 Catch:{ JSONException -> 0x0094 }
                L_0x004c:
                    r2 = "ttl";	 Catch:{ JSONException -> 0x0094 }
                    r4 = r9.getLong(r2);	 Catch:{ JSONException -> 0x0094 }
                    r2 = java.lang.Long.valueOf(r4);	 Catch:{ JSONException -> 0x0094 }
                L_0x0056:
                    r4 = "feature_set";	 Catch:{ JSONException -> 0x0094 }
                    r9 = r9.getJSONArray(r4);	 Catch:{ JSONException -> 0x0094 }
                    r4 = new java.util.HashMap;	 Catch:{ JSONException -> 0x0094 }
                    r5 = r9.length();	 Catch:{ JSONException -> 0x0094 }
                    r4.<init>(r5);	 Catch:{ JSONException -> 0x0094 }
                L_0x0065:
                    r5 = r9.length();	 Catch:{ JSONException -> 0x0094 }
                    if (r0 >= r5) goto L_0x0089;	 Catch:{ JSONException -> 0x0094 }
                L_0x006b:
                    r5 = r9.getJSONObject(r0);	 Catch:{ JSONException -> 0x0094 }
                    r6 = "key";	 Catch:{ JSONException -> 0x0094 }
                    r6 = r5.getInt(r6);	 Catch:{ JSONException -> 0x0094 }
                    r6 = java.lang.Integer.valueOf(r6);	 Catch:{ JSONException -> 0x0094 }
                    r7 = "value";	 Catch:{ JSONException -> 0x0094 }
                    r5 = r5.getInt(r7);	 Catch:{ JSONException -> 0x0094 }
                    r5 = java.lang.Integer.valueOf(r5);	 Catch:{ JSONException -> 0x0094 }
                    r4.put(r6, r5);	 Catch:{ JSONException -> 0x0094 }
                    r0 = r0 + 1;	 Catch:{ JSONException -> 0x0094 }
                    goto L_0x0065;	 Catch:{ JSONException -> 0x0094 }
                L_0x0089:
                    r9 = r8.f9748a;	 Catch:{ JSONException -> 0x0094 }
                    r9 = r9.f3310b;	 Catch:{ JSONException -> 0x0094 }
                    r9 = r9.f3311a;	 Catch:{ JSONException -> 0x0094 }
                    com.facebook.accountkit.internal.C1232j.m4352a(r9, r3, r1, r2, r4);	 Catch:{ JSONException -> 0x0094 }
                L_0x0094:
                    return;
                L_0x0095:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.k.2.1.onCompleted(com.facebook.accountkit.internal.f):void");
                }
            }

            public void run() {
                AccountKitGraphRequest a = this.f3310b.m4360a("experimentation_configuration", str);
                C1224e.m4323b();
                C1224e.m4321a(AccountKitGraphRequest.m4147a(a, new C31701(this)));
            }
        });
    }

    /* renamed from: a */
    private AccountKitGraphRequest m4360a(String str, @Nullable String str2) {
        Bundle bundle = new Bundle();
        C1251w.m4490a(bundle, "unit_id", str2);
        return new AccountKitGraphRequest(null, str, bundle, false, HttpMethod.GET);
    }
}
