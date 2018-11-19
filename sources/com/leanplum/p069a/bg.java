package com.leanplum.p069a;

import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.leanplum.a.bg */
final class bg implements bn {
    /* renamed from: a */
    private /* synthetic */ bf f25529a;

    bg(bf bfVar) {
        this.f25529a = bfVar;
    }

    /* renamed from: a */
    public final void mo6201a(Exception exception) {
        ao.a(new Object[]{"Development socket error", exception});
    }

    /* renamed from: a */
    public final void mo6200a() {
        ao.c(new Object[]{"Disconnected from development server"});
        this.f25529a.f21198n = false;
        this.f25529a.f21199o = false;
        this.f25529a.f21197m = false;
    }

    /* renamed from: b */
    public final void mo6203b() {
        if (!this.f25529a.f21197m) {
            ao.c(new Object[]{"Connected to development server"});
            try {
                this.f25529a.f21196l.m25100a("auth", new JSONArray(Collections.singletonList(new JSONObject(bo.a("appId", aw.e(), new Object[]{"deviceId", aw.f()})))));
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                bo.a(th);
            }
            this.f25529a.f21197m = true;
            this.f25529a.f21198n = true;
            this.f25529a.f21199o = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo6202a(java.lang.String r5, org.json.JSONArray r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = -1;
        r1 = r5.hashCode();	 Catch:{ Throwable -> 0x00b6 }
        r2 = 1;	 Catch:{ Throwable -> 0x00b6 }
        r3 = 0;	 Catch:{ Throwable -> 0x00b6 }
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
        };	 Catch:{ Throwable -> 0x00b6 }
    L_0x000a:
        goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x000b:
        r1 = "getViewHierarchy";	 Catch:{ Throwable -> 0x00b6 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00b6 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x0013:
        r0 = 2;	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x0015:
        r1 = "getVariables";	 Catch:{ Throwable -> 0x00b6 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00b6 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x001d:
        r0 = 4;	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x001f:
        r1 = "getActions";	 Catch:{ Throwable -> 0x00b6 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00b6 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x0027:
        r0 = 5;	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x0029:
        r1 = "updateVars";	 Catch:{ Throwable -> 0x00b6 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00b6 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x0031:
        r0 = 0;	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x0033:
        r1 = "previewUpdateRules";	 Catch:{ Throwable -> 0x00b6 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00b6 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x003b:
        r0 = 3;	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x003d:
        r1 = "registerDevice";	 Catch:{ Throwable -> 0x00b6 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00b6 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x0045:
        r0 = 6;	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x0047:
        r1 = "trigger";	 Catch:{ Throwable -> 0x00b6 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00b6 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x004f:
        r0 = 1;	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x0051:
        r1 = "applyVars";	 Catch:{ Throwable -> 0x00b6 }
        r5 = r5.equals(r1);	 Catch:{ Throwable -> 0x00b6 }
        if (r5 == 0) goto L_0x005a;	 Catch:{ Throwable -> 0x00b6 }
    L_0x0059:
        r0 = 7;	 Catch:{ Throwable -> 0x00b6 }
    L_0x005a:
        switch(r0) {
            case 0: goto L_0x00b1;
            case 1: goto L_0x00ad;
            case 2: goto L_0x009e;
            case 3: goto L_0x009a;
            case 4: goto L_0x0094;
            case 5: goto L_0x008e;
            case 6: goto L_0x0062;
            case 7: goto L_0x005e;
            default: goto L_0x005d;
        };	 Catch:{ Throwable -> 0x00b6 }
    L_0x005d:
        goto L_0x00b5;	 Catch:{ Throwable -> 0x00b6 }
    L_0x005e:
        com.leanplum.p069a.bf.m25070c(r6);	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x00b5;	 Catch:{ Throwable -> 0x00b6 }
    L_0x0062:
        r5 = r4.f25529a;	 Catch:{ Throwable -> 0x00b6 }
        com.leanplum.p069a.ag.a();	 Catch:{ Throwable -> 0x00b6 }
        r0 = 0;
        r6 = r6.getJSONObject(r3);	 Catch:{ JSONException -> 0x0073 }
        r1 = "email";	 Catch:{ JSONException -> 0x0073 }
        r6 = r6.getString(r1);	 Catch:{ JSONException -> 0x0073 }
        goto L_0x007d;
    L_0x0073:
        r6 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x00b6 }
        r1 = "Socket - No developer e-mail provided.";	 Catch:{ Throwable -> 0x00b6 }
        r6[r3] = r1;	 Catch:{ Throwable -> 0x00b6 }
        com.leanplum.p069a.ao.d(r6);	 Catch:{ Throwable -> 0x00b6 }
        r6 = r0;	 Catch:{ Throwable -> 0x00b6 }
    L_0x007d:
        if (r6 != 0) goto L_0x0081;	 Catch:{ Throwable -> 0x00b6 }
    L_0x007f:
        r6 = "a Leanplum account";	 Catch:{ Throwable -> 0x00b6 }
    L_0x0081:
        r0 = com.leanplum.p069a.aq.a();	 Catch:{ Throwable -> 0x00b6 }
        r1 = new com.leanplum.a.bf$2;	 Catch:{ Throwable -> 0x00b6 }
        r1.<init>(r5, r6);	 Catch:{ Throwable -> 0x00b6 }
        r0.a(r1);	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x00ba;	 Catch:{ Throwable -> 0x00b6 }
    L_0x008e:
        r5 = r4.f25529a;	 Catch:{ Throwable -> 0x00b6 }
        r5.m25079c();	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x00ba;	 Catch:{ Throwable -> 0x00b6 }
    L_0x0094:
        r5 = r4.f25529a;	 Catch:{ Throwable -> 0x00b6 }
        r5.m25077b();	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x00ba;	 Catch:{ Throwable -> 0x00b6 }
    L_0x009a:
        com.leanplum.p069a.bf.m25072d(r6);	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x00ba;	 Catch:{ Throwable -> 0x00b6 }
    L_0x009e:
        r5 = com.leanplum.p069a.an.a();	 Catch:{ Throwable -> 0x00b6 }
        r5.startUpdating();	 Catch:{ Throwable -> 0x00b6 }
        r5 = com.leanplum.p069a.an.a();	 Catch:{ Throwable -> 0x00b6 }
        r5.sendUpdate();	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x00ba;	 Catch:{ Throwable -> 0x00b6 }
    L_0x00ad:
        com.leanplum.p069a.bf.m25064a(r6);	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x00ba;	 Catch:{ Throwable -> 0x00b6 }
    L_0x00b1:
        com.leanplum.Leanplum.forceContentUpdate();	 Catch:{ Throwable -> 0x00b6 }
        goto L_0x00ba;
    L_0x00b5:
        return;
    L_0x00b6:
        r5 = move-exception;
        com.leanplum.p069a.bo.a(r5);
    L_0x00ba:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.bg.a(java.lang.String, org.json.JSONArray):void");
    }
}
