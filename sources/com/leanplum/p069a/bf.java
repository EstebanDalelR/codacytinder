package com.leanplum.p069a;

import com.leanplum.ActionContext;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.leanplum.a.bf */
public final class bf {
    /* renamed from: a */
    private static final String f21185a = "Leanplum";
    /* renamed from: b */
    private static final String f21186b = "getContentResponse";
    /* renamed from: c */
    private static final String f21187c = "updateVars";
    /* renamed from: d */
    private static final String f21188d = "getViewHierarchy";
    /* renamed from: e */
    private static final String f21189e = "previewUpdateRules";
    /* renamed from: f */
    private static final String f21190f = "trigger";
    /* renamed from: g */
    private static final String f21191g = "getVariables";
    /* renamed from: h */
    private static final String f21192h = "getActions";
    /* renamed from: i */
    private static final String f21193i = "registerDevice";
    /* renamed from: j */
    private static final String f21194j = "applyVars";
    /* renamed from: k */
    private static bf f21195k = new bf();
    /* renamed from: l */
    private C5727q f21196l;
    /* renamed from: m */
    private boolean f21197m;
    /* renamed from: n */
    private boolean f21198n = false;
    /* renamed from: o */
    private boolean f21199o = false;

    /* renamed from: com.leanplum.a.bf$1 */
    final class C57241 extends TimerTask {
        /* renamed from: a */
        private /* synthetic */ bf f21181a;

        C57241(bf bfVar) {
            this.f21181a = bfVar;
        }

        public final void run() {
            try {
                bf.m25069c(this.f21181a);
            } catch (Throwable th) {
                bo.a(th);
            }
        }
    }

    public bf() {
        bn c7039p = new C7039p(this);
        try {
            StringBuilder stringBuilder = new StringBuilder("http://");
            stringBuilder.append(C2590h.f8059d);
            stringBuilder.append(":");
            stringBuilder.append(C2590h.f8060e);
            this.f21196l = new C5727q(new URI(stringBuilder.toString()), c7039p);
        } catch (URISyntaxException e) {
            ao.a(new Object[]{e.getMessage()});
        }
        m25074f();
        new Timer().schedule(new C57241(this), 0, 5000);
    }

    /* renamed from: a */
    public static bf m25063a() {
        return f21195k;
    }

    /* renamed from: e */
    private void m25073e() {
        bn c7039p = new C7039p(this);
        try {
            StringBuilder stringBuilder = new StringBuilder("http://");
            stringBuilder.append(C2590h.f8059d);
            stringBuilder.append(":");
            stringBuilder.append(C2590h.f8060e);
            this.f21196l = new C5727q(new URI(stringBuilder.toString()), c7039p);
        } catch (URISyntaxException e) {
            ao.a(new Object[]{e.getMessage()});
        }
        m25074f();
        new Timer().schedule(new C57241(this), 0, 5000);
    }

    /* renamed from: f */
    private void m25074f() {
        this.f21199o = true;
        this.f21196l.m25155b();
    }

    /* renamed from: g */
    private void m25075g() {
        if (!this.f21198n && !this.f21199o) {
            m25074f();
        }
    }

    /* renamed from: a */
    public final <T> void m25076a(String str, Map<String, T> map) {
        try {
            Object[] objArr = new Object[1];
            StringBuilder stringBuilder = new StringBuilder("Sending event: ");
            stringBuilder.append(str);
            stringBuilder.append(" & data over socket:\n");
            stringBuilder.append(map);
            objArr[0] = stringBuilder.toString();
            ao.e(objArr);
            this.f21196l.m25154a(str, new JSONArray(Collections.singletonList(ab.b(map))));
        } catch (String str2) {
            map = new Object[1];
            StringBuilder stringBuilder2 = new StringBuilder("Failed to create JSON data object: ");
            stringBuilder2.append(str2.getMessage());
            map[0] = stringBuilder2.toString();
            ao.a(map);
        }
    }

    /* renamed from: a */
    static void m25064a(JSONArray jSONArray) {
        try {
            jSONArray = jSONArray.getJSONObject(0);
            JSONObject jSONObject = jSONArray.getJSONObject("action");
            if (jSONObject != null) {
                String string = jSONArray.getString("messageId");
                jSONArray = jSONArray.getBoolean("isRooted");
                String string2 = jSONObject.getString("__name__");
                Map map = (Map) bq.o().get(string2);
                Object obj = null;
                if (map != null) {
                    obj = (Map) map.get("values");
                }
                C2589f actionContext = new ActionContext(string2, (Map) bq.a(obj, ab.a(jSONObject)), string);
                actionContext.preventRealtimeUpdating();
                actionContext.a(jSONArray);
                actionContext.b(true);
                actionContext.update();
                ag.a(actionContext);
                C2587d.a().b(string);
            }
        } catch (JSONArray jSONArray2) {
            ao.a(new Object[]{"Error getting action info", jSONArray2});
        }
    }

    /* renamed from: b */
    public final void m25077b() {
        boolean j = bq.j();
        bq.l();
        m25076a(f21186b, bo.a("updated", Boolean.valueOf(j), new Object[0]));
    }

    /* renamed from: c */
    final void m25079c() {
        boolean k = bq.k();
        bq.l();
        m25076a(f21186b, bo.a("updated", Boolean.valueOf(k), new Object[0]));
    }

    /* renamed from: b */
    final void m25078b(org.json.JSONArray r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        com.leanplum.p069a.ag.a();
        r0 = 0;
        r3 = r3.getJSONObject(r0);	 Catch:{ JSONException -> 0x000f }
        r1 = "email";	 Catch:{ JSONException -> 0x000f }
        r3 = r3.getString(r1);	 Catch:{ JSONException -> 0x000f }
        goto L_0x001a;
    L_0x000f:
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r1 = "Socket - No developer e-mail provided.";
        r3[r0] = r1;
        com.leanplum.p069a.ao.d(r3);
        r3 = 0;
    L_0x001a:
        if (r3 != 0) goto L_0x001e;
    L_0x001c:
        r3 = "a Leanplum account";
    L_0x001e:
        r0 = com.leanplum.p069a.aq.a();
        r1 = new com.leanplum.a.bf$2;
        r1.<init>(r2, r3);
        r0.a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.bf.b(org.json.JSONArray):void");
    }

    /* renamed from: c */
    static void m25070c(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                jSONArray = jSONArray.getJSONObject(0);
                if (jSONArray != null) {
                    bq.a(ab.a(jSONArray), null, null, null, null, null);
                }
            } catch (JSONArray jSONArray2) {
                ao.a(new Object[]{"Couldn't applyVars for preview.", jSONArray2});
            } catch (JSONArray jSONArray22) {
                bo.a(jSONArray22);
            }
        }
    }

    /* renamed from: d */
    static void m25072d(org.json.JSONArray r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 1;
        r1 = 0;
        r4 = r4.getJSONObject(r1);	 Catch:{ Exception -> 0x005a }
        r2 = "closed";
        r2 = r4.optBoolean(r2);
        if (r2 != 0) goto L_0x0016;
    L_0x000e:
        r2 = com.leanplum.p069a.an.a();
        r2.startUpdating();
        goto L_0x001d;
    L_0x0016:
        r2 = com.leanplum.p069a.an.a();
        r2.stopUpdating();
    L_0x001d:
        r2 = "mode";
        r2 = r4.optInt(r2);
        r3 = com.leanplum.LeanplumEditorMode.values();
        r3 = r3.length;
        if (r2 < r3) goto L_0x0036;
    L_0x002a:
        r0 = new java.lang.Object[r0];
        r2 = "Invalid editor mode in packet";
        r0[r1] = r2;
        com.leanplum.p069a.ao.e(r0);
        r0 = com.leanplum.LeanplumEditorMode.LP_EDITOR_MODE_INTERFACE;
        goto L_0x003c;
    L_0x0036:
        r0 = com.leanplum.LeanplumEditorMode.values();
        r0 = r0[r2];
    L_0x003c:
        r1 = com.leanplum.p069a.an.a();
        r1.setMode(r0);
        r0 = "rules";
        r4 = r4.optJSONArray(r0);
        if (r4 == 0) goto L_0x0052;
    L_0x004b:
        r4 = com.leanplum.p069a.ab.a(r4);
        com.leanplum.p069a.bq.a(r4);
    L_0x0052:
        r4 = com.leanplum.p069a.an.a();
        r4.sendUpdateDelayedDefault();
        return;
    L_0x005a:
        r4 = new java.lang.Object[r0];
        r0 = "Error parsing data";
        r4[r1] = r0;
        com.leanplum.p069a.ao.a(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.bf.d(org.json.JSONArray):void");
    }

    /* renamed from: d */
    public final boolean m25080d() {
        return this.f21198n;
    }

    /* renamed from: c */
    static /* synthetic */ void m25069c(bf bfVar) {
        if (!bfVar.f21198n && !bfVar.f21199o) {
            bfVar.m25074f();
        }
    }
}
