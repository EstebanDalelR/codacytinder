package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.C0436c;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.internal.C1709i;
import com.facebook.internal.C1712j;
import com.facebook.internal.C1738r;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.appevents.c */
class C1638c {
    /* renamed from: a */
    private static final String f4525a = "com.facebook.appevents.c";
    /* renamed from: b */
    private static volatile C1632b f4526b = new C1632b();
    /* renamed from: c */
    private static final ScheduledExecutorService f4527c = Executors.newSingleThreadScheduledExecutor();
    /* renamed from: d */
    private static ScheduledFuture f4528d;
    /* renamed from: e */
    private static final Runnable f4529e = new C16331();

    /* renamed from: com.facebook.appevents.c$1 */
    static class C16331 implements Runnable {
        C16331() {
        }

        public void run() {
            C1638c.f4528d = null;
            if (AppEventsLogger.m5520a() != FlushBehavior.EXPLICIT_ONLY) {
                C1638c.m5563b(FlushReason.TIMER);
            }
        }
    }

    /* renamed from: com.facebook.appevents.c$2 */
    static class C16342 implements Runnable {
        C16342() {
        }

        public void run() {
            C1640d.m5571a(C1638c.f4526b);
            C1638c.f4526b = new C1632b();
        }
    }

    C1638c() {
    }

    /* renamed from: a */
    public static void m5557a() {
        f4527c.execute(new C16342());
    }

    /* renamed from: a */
    public static void m5560a(final FlushReason flushReason) {
        f4527c.execute(new Runnable() {
            public void run() {
                C1638c.m5563b(flushReason);
            }
        });
    }

    /* renamed from: a */
    public static void m5559a(final AccessTokenAppIdPair accessTokenAppIdPair, final AppEvent appEvent) {
        f4527c.execute(new Runnable() {
            public void run() {
                C1638c.f4526b.m5550a(accessTokenAppIdPair, appEvent);
                if (AppEventsLogger.m5520a() != FlushBehavior.EXPLICIT_ONLY && C1638c.f4526b.m5552b() > 100) {
                    C1638c.m5563b(FlushReason.EVENT_THRESHOLD);
                } else if (C1638c.f4528d == null) {
                    C1638c.f4528d = C1638c.f4527c.schedule(C1638c.f4529e, 15, TimeUnit.SECONDS);
                }
            }
        });
    }

    /* renamed from: b */
    public static Set<AccessTokenAppIdPair> m5561b() {
        return f4526b.m5549a();
    }

    /* renamed from: b */
    static void m5563b(FlushReason flushReason) {
        f4526b.m5551a(C1640d.m5568a());
        try {
            flushReason = C1638c.m5555a(flushReason, f4526b);
            if (flushReason != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", flushReason.f4531a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", flushReason.f4532b);
                C0436c.m1648a(FacebookSdk.m3994e()).m1653a(intent);
            }
        } catch (FlushReason flushReason2) {
            Log.w(f4525a, "Caught unexpected exception while flushing app events: ", flushReason2);
        }
    }

    /* renamed from: a */
    private static C1641e m5555a(FlushReason flushReason, C1632b c1632b) {
        C1641e c1641e = new C1641e();
        boolean b = FacebookSdk.m3989b(FacebookSdk.m3994e());
        List<GraphRequest> arrayList = new ArrayList();
        for (AccessTokenAppIdPair accessTokenAppIdPair : c1632b.m5549a()) {
            GraphRequest a = C1638c.m5553a(accessTokenAppIdPair, c1632b.m5548a(accessTokenAppIdPair), b, c1641e);
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() <= null) {
            return null;
        }
        C1738r.m5979a(LoggingBehavior.APP_EVENTS, f4525a, "Flushing %d events due to %s.", Integer.valueOf(c1641e.f4531a), flushReason.toString());
        for (GraphRequest i : arrayList) {
            i.m4065i();
        }
        return c1641e;
    }

    /* renamed from: a */
    private static GraphRequest m5553a(final AccessTokenAppIdPair accessTokenAppIdPair, final C1642f c1642f, boolean z, final C1641e c1641e) {
        boolean z2 = false;
        C1709i a = C1712j.m5909a(accessTokenAppIdPair.m5510b(), false);
        final GraphRequest a2 = GraphRequest.m4013a(null, String.format("%s/activities", new Object[]{r0}), null, null);
        Bundle e = a2.m4061e();
        if (e == null) {
            e = new Bundle();
        }
        e.putString("access_token", accessTokenAppIdPair.m5509a());
        String d = AppEventsLogger.m5530d();
        if (d != null) {
            e.putString(ManagerWebServices.PARAM_DEVICE_TOKEN, d);
        }
        a2.m4051a(e);
        if (a != null) {
            z2 = a.m5896a();
        }
        z = c1642f.m5575a(a2, FacebookSdk.m3994e(), z2, z);
        if (!z) {
            return null;
        }
        c1641e.f4531a += z;
        a2.m4052a(new Callback() {
            public void onCompleted(GraphResponse graphResponse) {
                C1638c.m5562b(accessTokenAppIdPair, a2, graphResponse, c1642f, c1641e);
            }
        });
        return a2;
    }

    /* renamed from: b */
    private static void m5562b(final com.facebook.appevents.AccessTokenAppIdPair r10, com.facebook.GraphRequest r11, com.facebook.GraphResponse r12, final com.facebook.appevents.C1642f r13, com.facebook.appevents.C1641e r14) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = r12.m4092a();
        r1 = "Success";
        r2 = com.facebook.appevents.FlushResult.SUCCESS;
        r3 = 1;
        r4 = 0;
        r5 = 2;
        if (r0 == 0) goto L_0x002f;
    L_0x000d:
        r1 = r0.getErrorCode();
        r2 = -1;
        if (r1 != r2) goto L_0x0019;
    L_0x0014:
        r1 = "Failed: No Connectivity";
        r2 = com.facebook.appevents.FlushResult.NO_CONNECTIVITY;
        goto L_0x002f;
    L_0x0019:
        r1 = "Failed:\n  Response: %s\n  Error %s";
        r2 = new java.lang.Object[r5];
        r12 = r12.toString();
        r2[r4] = r12;
        r12 = r0.toString();
        r2[r3] = r12;
        r1 = java.lang.String.format(r1, r2);
        r2 = com.facebook.appevents.FlushResult.SERVER_ERROR;
    L_0x002f:
        r12 = com.facebook.LoggingBehavior.APP_EVENTS;
        r12 = com.facebook.FacebookSdk.m3986a(r12);
        if (r12 == 0) goto L_0x0063;
    L_0x0037:
        r12 = r11.m4064h();
        r12 = (java.lang.String) r12;
        r6 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0047 }
        r6.<init>(r12);	 Catch:{ JSONException -> 0x0047 }
        r12 = r6.toString(r5);	 Catch:{ JSONException -> 0x0047 }
        goto L_0x0049;
    L_0x0047:
        r12 = "<Can't encode events for debug logging>";
    L_0x0049:
        r6 = com.facebook.LoggingBehavior.APP_EVENTS;
        r7 = f4525a;
        r8 = "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s";
        r9 = 3;
        r9 = new java.lang.Object[r9];
        r11 = r11.m4050a();
        r11 = r11.toString();
        r9[r4] = r11;
        r9[r3] = r1;
        r9[r5] = r12;
        com.facebook.internal.C1738r.m5979a(r6, r7, r8, r9);
    L_0x0063:
        if (r0 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x0067;
    L_0x0066:
        r3 = 0;
    L_0x0067:
        r13.m5577a(r3);
        r11 = com.facebook.appevents.FlushResult.NO_CONNECTIVITY;
        if (r2 != r11) goto L_0x007a;
    L_0x006e:
        r11 = com.facebook.FacebookSdk.m3990c();
        r12 = new com.facebook.appevents.c$6;
        r12.<init>(r10, r13);
        r11.execute(r12);
    L_0x007a:
        r10 = com.facebook.appevents.FlushResult.SUCCESS;
        if (r2 == r10) goto L_0x0086;
    L_0x007e:
        r10 = r14.f4532b;
        r11 = com.facebook.appevents.FlushResult.NO_CONNECTIVITY;
        if (r10 == r11) goto L_0x0086;
    L_0x0084:
        r14.f4532b = r2;
    L_0x0086:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.c.b(com.facebook.appevents.AccessTokenAppIdPair, com.facebook.GraphRequest, com.facebook.GraphResponse, com.facebook.appevents.f, com.facebook.appevents.e):void");
    }
}
