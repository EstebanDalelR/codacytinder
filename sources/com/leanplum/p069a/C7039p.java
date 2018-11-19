package com.leanplum.p069a;

import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.leanplum.a.p */
public class C7039p implements bn {
    /* renamed from: a */
    private static String f25596a = "advance";
    /* renamed from: b */
    private static String f25597b = "deleteNewsfeedMessage";
    /* renamed from: c */
    private static String f25598c = "downloadFile";
    /* renamed from: d */
    private static String f25599d = "getNewsfeedMessages";
    /* renamed from: e */
    private static String f25600e = "getVars";
    /* renamed from: f */
    private static String f25601f = "heartbeat";
    /* renamed from: g */
    private static String f25602g = "log";
    /* renamed from: h */
    private static String f25603h = "markNewsfeedMessageAsRead";
    /* renamed from: i */
    private static String f25604i = "multi";
    /* renamed from: j */
    private static String f25605j = "pauseSession";
    /* renamed from: k */
    private static String f25606k = "pauseState";
    /* renamed from: l */
    private static String f25607l = "registerDevice";
    /* renamed from: m */
    private static String f25608m = "resumeSession";
    /* renamed from: n */
    private static String f25609n = "resumeState";
    /* renamed from: o */
    private static String f25610o = "setDeviceAttributes";
    /* renamed from: p */
    private static String f25611p = "setTrafficSourceInfo";
    /* renamed from: q */
    private static String f25612q = "setUserAttributes";
    /* renamed from: r */
    private static String f25613r = "setVars";
    /* renamed from: s */
    private static String f25614s = "start";
    /* renamed from: t */
    private static String f25615t = "stop";
    /* renamed from: u */
    private static String f25616u = "track";
    /* renamed from: v */
    private static String f25617v = "uploadFile";
    /* renamed from: w */
    private /* synthetic */ bf f25618w;

    C7039p(bf bfVar) {
        this.f25618w = bfVar;
    }

    /* renamed from: a */
    public void mo6201a(Exception exception) {
        ao.a(new Object[]{"Development socket error", exception});
    }

    /* renamed from: a */
    public void mo6200a() {
        ao.c(new Object[]{"Disconnected from development server"});
        this.f25618w.f21198n = false;
        this.f25618w.f21199o = false;
        this.f25618w.f21197m = false;
    }

    /* renamed from: b */
    public void mo6203b() {
        if (!this.f25618w.f21197m) {
            ao.c(new Object[]{"Connected to development server"});
            try {
                this.f25618w.f21196l.m25154a("auth", new JSONArray(Collections.singletonList(new JSONObject(bo.a("appId", aw.e(), new Object[]{"deviceId", aw.f()})))));
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                bo.a(th);
            }
            this.f25618w.f21197m = true;
            this.f25618w.f21198n = true;
            this.f25618w.f21199o = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo6202a(java.lang.String r5, org.json.JSONArray r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = -1;
        r1 = r5.hashCode();	 Catch:{ Throwable -> 0x00e2 }
        r2 = 1;	 Catch:{ Throwable -> 0x00e2 }
        r3 = 0;	 Catch:{ Throwable -> 0x00e2 }
        switch(r1) {
            case -2075611462: goto L_0x0051;
            case -1059891784: goto L_0x0047;
            case -924224807: goto L_0x003d;
            case -420918074: goto L_0x0033;
            case -295879019: goto L_0x0029;
            case -124943161: goto L_0x001f;
            case -92082495: goto L_0x0015;
            case 394550618: goto L_0x000b;
            default: goto L_0x000a;
        };	 Catch:{ Throwable -> 0x00e2 }
    L_0x000a:
        goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x000b:
        r1 = "getViewHierarchy";	 Catch:{ Throwable -> 0x00e2 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00e2 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0013:
        r0 = 2;	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0015:
        r1 = "getVariables";	 Catch:{ Throwable -> 0x00e2 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00e2 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x001d:
        r0 = 4;	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x001f:
        r1 = "getActions";	 Catch:{ Throwable -> 0x00e2 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00e2 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0027:
        r0 = 5;	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0029:
        r1 = "updateVars";	 Catch:{ Throwable -> 0x00e2 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00e2 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0031:
        r0 = 0;	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0033:
        r1 = "previewUpdateRules";	 Catch:{ Throwable -> 0x00e2 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00e2 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x003b:
        r0 = 3;	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x003d:
        r1 = "registerDevice";	 Catch:{ Throwable -> 0x00e2 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00e2 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0045:
        r0 = 6;	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0047:
        r1 = "trigger";	 Catch:{ Throwable -> 0x00e2 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00e2 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x004f:
        r0 = 1;	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0051:
        r1 = "applyVars";	 Catch:{ Throwable -> 0x00e2 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00e2 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0059:
        r0 = 7;	 Catch:{ Throwable -> 0x00e2 }
    L_0x005a:
        switch(r0) {
            case 0: goto L_0x00dd;
            case 1: goto L_0x00d9;
            case 2: goto L_0x00ca;
            case 3: goto L_0x00c6;
            case 4: goto L_0x00ab;
            case 5: goto L_0x0090;
            case 6: goto L_0x0064;
            case 7: goto L_0x005f;
            default: goto L_0x005d;
        };	 Catch:{ Throwable -> 0x00e2 }
    L_0x005d:
        goto L_0x00e1;	 Catch:{ Throwable -> 0x00e2 }
    L_0x005f:
        com.leanplum.p069a.bf.m25070c(r6);	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x00e1;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0064:
        r5 = r4.f25618w;	 Catch:{ Throwable -> 0x00e2 }
        com.leanplum.p069a.ag.a();	 Catch:{ Throwable -> 0x00e2 }
        r0 = 0;
        r6 = r6.getJSONObject(r3);	 Catch:{ JSONException -> 0x0075 }
        r1 = "email";	 Catch:{ JSONException -> 0x0075 }
        r6 = r6.getString(r1);	 Catch:{ JSONException -> 0x0075 }
        goto L_0x007f;
    L_0x0075:
        r6 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x00e2 }
        r1 = "Socket - No developer e-mail provided.";	 Catch:{ Throwable -> 0x00e2 }
        r6[r3] = r1;	 Catch:{ Throwable -> 0x00e2 }
        com.leanplum.p069a.ao.d(r6);	 Catch:{ Throwable -> 0x00e2 }
        r6 = r0;	 Catch:{ Throwable -> 0x00e2 }
    L_0x007f:
        if (r6 != 0) goto L_0x0083;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0081:
        r6 = "a Leanplum account";	 Catch:{ Throwable -> 0x00e2 }
    L_0x0083:
        r0 = com.leanplum.p069a.aq.a();	 Catch:{ Throwable -> 0x00e2 }
        r1 = new com.leanplum.a.bf$2;	 Catch:{ Throwable -> 0x00e2 }
        r1.<init>(r5, r6);	 Catch:{ Throwable -> 0x00e2 }
        r0.a(r1);	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x00e6;	 Catch:{ Throwable -> 0x00e2 }
    L_0x0090:
        r5 = r4.f25618w;	 Catch:{ Throwable -> 0x00e2 }
        r6 = com.leanplum.p069a.bq.k();	 Catch:{ Throwable -> 0x00e2 }
        com.leanplum.p069a.bq.l();	 Catch:{ Throwable -> 0x00e2 }
        r0 = "getContentResponse";	 Catch:{ Throwable -> 0x00e2 }
        r1 = "updated";	 Catch:{ Throwable -> 0x00e2 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ Throwable -> 0x00e2 }
        r2 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x00e2 }
        r6 = com.leanplum.p069a.bo.a(r1, r6, r2);	 Catch:{ Throwable -> 0x00e2 }
        r5.m25076a(r0, r6);	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x00e6;	 Catch:{ Throwable -> 0x00e2 }
    L_0x00ab:
        r5 = r4.f25618w;	 Catch:{ Throwable -> 0x00e2 }
        r6 = com.leanplum.p069a.bq.j();	 Catch:{ Throwable -> 0x00e2 }
        com.leanplum.p069a.bq.l();	 Catch:{ Throwable -> 0x00e2 }
        r0 = "getContentResponse";	 Catch:{ Throwable -> 0x00e2 }
        r1 = "updated";	 Catch:{ Throwable -> 0x00e2 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ Throwable -> 0x00e2 }
        r2 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x00e2 }
        r6 = com.leanplum.p069a.bo.a(r1, r6, r2);	 Catch:{ Throwable -> 0x00e2 }
        r5.m25076a(r0, r6);	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x00e6;	 Catch:{ Throwable -> 0x00e2 }
    L_0x00c6:
        com.leanplum.p069a.bf.m25072d(r6);	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x00e6;	 Catch:{ Throwable -> 0x00e2 }
    L_0x00ca:
        r5 = com.leanplum.p069a.an.a();	 Catch:{ Throwable -> 0x00e2 }
        r5.startUpdating();	 Catch:{ Throwable -> 0x00e2 }
        r5 = com.leanplum.p069a.an.a();	 Catch:{ Throwable -> 0x00e2 }
        r5.sendUpdate();	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x00e6;	 Catch:{ Throwable -> 0x00e2 }
    L_0x00d9:
        com.leanplum.p069a.bf.m25064a(r6);	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x00e6;	 Catch:{ Throwable -> 0x00e2 }
    L_0x00dd:
        com.leanplum.Leanplum.forceContentUpdate();	 Catch:{ Throwable -> 0x00e2 }
        goto L_0x00e6;
    L_0x00e1:
        return;
    L_0x00e2:
        r5 = move-exception;
        com.leanplum.p069a.bo.a(r5);
    L_0x00e6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.p.a(java.lang.String, org.json.JSONArray):void");
    }
}
