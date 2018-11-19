package io.branch.indexing;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.indexing.c */
public class C15562c {
    /* renamed from: a */
    private static C15562c f48068a;
    /* renamed from: b */
    private JSONObject f48069b;
    /* renamed from: c */
    private String f48070c;
    /* renamed from: d */
    private int f48071d = 0;
    /* renamed from: e */
    private int f48072e = 1;
    /* renamed from: f */
    private int f48073f = 0;
    /* renamed from: g */
    private boolean f48074g = false;
    /* renamed from: h */
    private JSONArray f48075h;
    /* renamed from: i */
    private SharedPreferences f48076i;
    /* renamed from: j */
    private final String f48077j = "BNC_CD_MANIFEST";

    /* renamed from: io.branch.indexing.c$a */
    class C15561a {
        /* renamed from: a */
        final JSONObject f48063a;
        /* renamed from: b */
        final /* synthetic */ C15562c f48064b;
        /* renamed from: c */
        private boolean f48065c;
        /* renamed from: d */
        private int f48066d;
        /* renamed from: e */
        private int f48067e = 15;

        /* renamed from: a */
        int m58122a() {
            return this.f48066d;
        }

        /* renamed from: b */
        int m58123b() {
            return this.f48067e;
        }

        C15561a(C15562c c15562c, JSONObject jSONObject) {
            this.f48064b = c15562c;
            this.f48063a = jSONObject;
            if (jSONObject.has("h") != null) {
                try {
                    this.f48065c = jSONObject.getBoolean("h") ^ 1;
                } catch (C15562c c15562c2) {
                    c15562c2.printStackTrace();
                }
            }
            try {
                if (jSONObject.has("dri") != null) {
                    this.f48066d = jSONObject.getInt("dri");
                }
                if (jSONObject.has("mdr") != null) {
                    this.f48067e = jSONObject.getInt("mdr");
                }
            } catch (C15562c c15562c22) {
                c15562c22.printStackTrace();
            }
        }

        /* renamed from: c */
        JSONArray m58124c() {
            if (this.f48063a.has("ck")) {
                try {
                    return this.f48063a.getJSONArray("ck");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        /* renamed from: d */
        boolean m58125d() {
            return this.f48065c;
        }

        /* renamed from: e */
        boolean m58126e() {
            JSONArray c = m58124c();
            return c != null && c.length() == 0;
        }
    }

    private C15562c(Context context) {
        this.f48076i = context.getSharedPreferences("bnc_content_discovery_manifest_storage", 0);
        m58128b(context);
    }

    /* renamed from: a */
    public static C15562c m58127a(Context context) {
        if (f48068a == null) {
            f48068a = new C15562c(context);
        }
        return f48068a;
    }

    /* renamed from: f */
    private void m58129f() {
        this.f48076i.edit().putString("BNC_CD_MANIFEST", this.f48069b.toString()).apply();
    }

    /* renamed from: b */
    private void m58128b(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r3 = r2.f48076i;
        r0 = "BNC_CD_MANIFEST";
        r1 = 0;
        r3 = r3.getString(r0, r1);
        if (r3 == 0) goto L_0x0043;
    L_0x000b:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x003b }
        r0.<init>(r3);	 Catch:{ JSONException -> 0x003b }
        r2.f48069b = r0;	 Catch:{ JSONException -> 0x003b }
        r3 = r2.f48069b;	 Catch:{ JSONException -> 0x003b }
        r0 = "mv";	 Catch:{ JSONException -> 0x003b }
        r3 = r3.has(r0);	 Catch:{ JSONException -> 0x003b }
        if (r3 == 0) goto L_0x0026;	 Catch:{ JSONException -> 0x003b }
    L_0x001c:
        r3 = r2.f48069b;	 Catch:{ JSONException -> 0x003b }
        r0 = "mv";	 Catch:{ JSONException -> 0x003b }
        r3 = r3.getString(r0);	 Catch:{ JSONException -> 0x003b }
        r2.f48070c = r3;	 Catch:{ JSONException -> 0x003b }
    L_0x0026:
        r3 = r2.f48069b;	 Catch:{ JSONException -> 0x003b }
        r0 = "m";	 Catch:{ JSONException -> 0x003b }
        r3 = r3.has(r0);	 Catch:{ JSONException -> 0x003b }
        if (r3 == 0) goto L_0x004a;	 Catch:{ JSONException -> 0x003b }
    L_0x0030:
        r3 = r2.f48069b;	 Catch:{ JSONException -> 0x003b }
        r0 = "m";	 Catch:{ JSONException -> 0x003b }
        r3 = r3.getJSONArray(r0);	 Catch:{ JSONException -> 0x003b }
        r2.f48075h = r3;	 Catch:{ JSONException -> 0x003b }
        goto L_0x004a;
    L_0x003b:
        r3 = new org.json.JSONObject;
        r3.<init>();
        r2.f48069b = r3;
        goto L_0x004a;
    L_0x0043:
        r3 = new org.json.JSONObject;
        r3.<init>();
        r2.f48069b = r3;
    L_0x004a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.c.b(android.content.Context):void");
    }

    /* renamed from: a */
    public void m58131a(org.json.JSONObject r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = "cd";
        r0 = r3.has(r0);
        if (r0 == 0) goto L_0x0079;
    L_0x0008:
        r0 = 1;
        r2.f48074g = r0;
        r0 = "cd";	 Catch:{ JSONException -> 0x007c }
        r3 = r3.getJSONObject(r0);	 Catch:{ JSONException -> 0x007c }
        r0 = "mv";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x007c }
        if (r0 == 0) goto L_0x0021;	 Catch:{ JSONException -> 0x007c }
    L_0x0019:
        r0 = "mv";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x007c }
        r2.f48070c = r0;	 Catch:{ JSONException -> 0x007c }
    L_0x0021:
        r0 = "mhl";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x007c }
        if (r0 == 0) goto L_0x0031;	 Catch:{ JSONException -> 0x007c }
    L_0x0029:
        r0 = "mhl";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.getInt(r0);	 Catch:{ JSONException -> 0x007c }
        r2.f48072e = r0;	 Catch:{ JSONException -> 0x007c }
    L_0x0031:
        r0 = "m";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x007c }
        if (r0 == 0) goto L_0x0041;	 Catch:{ JSONException -> 0x007c }
    L_0x0039:
        r0 = "m";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.getJSONArray(r0);	 Catch:{ JSONException -> 0x007c }
        r2.f48075h = r0;	 Catch:{ JSONException -> 0x007c }
    L_0x0041:
        r0 = "mtl";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x007c }
        if (r0 == 0) goto L_0x0053;	 Catch:{ JSONException -> 0x007c }
    L_0x0049:
        r0 = "mtl";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.getInt(r0);	 Catch:{ JSONException -> 0x007c }
        if (r0 <= 0) goto L_0x0053;	 Catch:{ JSONException -> 0x007c }
    L_0x0051:
        r2.f48071d = r0;	 Catch:{ JSONException -> 0x007c }
    L_0x0053:
        r0 = "mps";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x007c }
        if (r0 == 0) goto L_0x0063;	 Catch:{ JSONException -> 0x007c }
    L_0x005b:
        r0 = "mps";	 Catch:{ JSONException -> 0x007c }
        r3 = r3.getInt(r0);	 Catch:{ JSONException -> 0x007c }
        r2.f48073f = r3;	 Catch:{ JSONException -> 0x007c }
    L_0x0063:
        r3 = r2.f48069b;	 Catch:{ JSONException -> 0x007c }
        r0 = "mv";	 Catch:{ JSONException -> 0x007c }
        r1 = r2.f48070c;	 Catch:{ JSONException -> 0x007c }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x007c }
        r3 = r2.f48069b;	 Catch:{ JSONException -> 0x007c }
        r0 = "m";	 Catch:{ JSONException -> 0x007c }
        r1 = r2.f48075h;	 Catch:{ JSONException -> 0x007c }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x007c }
        r2.m58129f();	 Catch:{ JSONException -> 0x007c }
        goto L_0x007c;
    L_0x0079:
        r3 = 0;
        r2.f48074g = r3;
    L_0x007c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.c.a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    io.branch.indexing.C15562c.C15561a m58130a(android.app.Activity r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.f48075h;
        r1 = 0;
        if (r0 == 0) goto L_0x004b;
    L_0x0005:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = "/";
        r0.append(r2);
        r5 = r5.getClass();
        r5 = r5.getSimpleName();
        r0.append(r5);
        r5 = r0.toString();
        r0 = 0;
    L_0x001f:
        r2 = r4.f48075h;	 Catch:{ JSONException -> 0x004b }
        r2 = r2.length();	 Catch:{ JSONException -> 0x004b }
        if (r0 >= r2) goto L_0x004b;	 Catch:{ JSONException -> 0x004b }
    L_0x0027:
        r2 = r4.f48075h;	 Catch:{ JSONException -> 0x004b }
        r2 = r2.getJSONObject(r0);	 Catch:{ JSONException -> 0x004b }
        r3 = "p";	 Catch:{ JSONException -> 0x004b }
        r3 = r2.has(r3);	 Catch:{ JSONException -> 0x004b }
        if (r3 == 0) goto L_0x0048;	 Catch:{ JSONException -> 0x004b }
    L_0x0035:
        r3 = "p";	 Catch:{ JSONException -> 0x004b }
        r3 = r2.getString(r3);	 Catch:{ JSONException -> 0x004b }
        r3 = r3.equals(r5);	 Catch:{ JSONException -> 0x004b }
        if (r3 == 0) goto L_0x0048;	 Catch:{ JSONException -> 0x004b }
    L_0x0041:
        r5 = new io.branch.indexing.c$a;	 Catch:{ JSONException -> 0x004b }
        r5.<init>(r4, r2);	 Catch:{ JSONException -> 0x004b }
        r1 = r5;
        goto L_0x004b;
    L_0x0048:
        r0 = r0 + 1;
        goto L_0x001f;
    L_0x004b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.c.a(android.app.Activity):io.branch.indexing.c$a");
    }

    /* renamed from: a */
    boolean m58132a() {
        return this.f48074g;
    }

    /* renamed from: b */
    int m58133b() {
        return this.f48071d;
    }

    /* renamed from: c */
    int m58134c() {
        return this.f48073f;
    }

    /* renamed from: d */
    int m58135d() {
        return this.f48072e;
    }

    /* renamed from: e */
    public String m58136e() {
        if (TextUtils.isEmpty(this.f48070c)) {
            return "-1";
        }
        return this.f48070c;
    }
}
