package com.facebook.ads.internal.p041h;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.p037d.C1389a;
import com.facebook.ads.internal.p038e.C1392a;
import com.facebook.ads.internal.p038e.C1396d;
import com.facebook.ads.internal.p038e.C3279c;
import com.facebook.ads.internal.p040g.C1414h;
import com.facebook.ads.internal.p041h.C1424e.C1423a;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1499m;
import com.facebook.ads.internal.p047k.C1515z;
import com.tinder.api.ManagerWebServices;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.h.g */
public class C3288g implements C1423a, C1425f {
    /* renamed from: a */
    private static final String f10057a = "g";
    /* renamed from: b */
    private static C3288g f10058b;
    /* renamed from: c */
    private static double f10059c;
    /* renamed from: d */
    private static String f10060d;
    /* renamed from: e */
    private final C1424e f10061e;
    /* renamed from: f */
    private final C1396d f10062f;
    /* renamed from: g */
    private final Context f10063g;

    protected C3288g(Context context) {
        this.f10062f = new C1396d(context);
        this.f10061e = new C1424e(context, this);
        this.f10061e.m4981b();
        this.f10063g = context;
        C1389a.m4826a(context).m4827a();
    }

    /* renamed from: a */
    public static C1425f m12671a(Context context) {
        if (f10058b == null) {
            context = context.getApplicationContext();
            synchronized (context) {
                if (f10058b == null) {
                    f10058b = new C3288g(context);
                    C1414h.m4920a();
                    f10059c = C1414h.m4921b();
                    f10060d = C1414h.m4922c();
                }
            }
        }
        return f10058b;
    }

    /* renamed from: a */
    private org.json.JSONObject m12672a(int r7) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = 0;
        r1 = r6.f10062f;	 Catch:{ JSONException -> 0x0071, all -> 0x0062 }
        r1 = r1.m4853d();	 Catch:{ JSONException -> 0x0071, all -> 0x0062 }
        r2 = r6.f10062f;	 Catch:{ JSONException -> 0x0060, all -> 0x005b }
        r7 = r2.m4846a(r7);	 Catch:{ JSONException -> 0x0060, all -> 0x005b }
        r2 = r7.getCount();	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        if (r2 <= 0) goto L_0x002b;	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
    L_0x0013:
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        r2.<init>();	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        r3 = "tokens";	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        r4 = r6.m12673a(r7);	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        r2.put(r3, r4);	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        r3 = "events";	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        r4 = r6.m12676c(r7);	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        r2.put(r3, r4);	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        goto L_0x002c;	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
    L_0x002b:
        r2 = r0;	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
    L_0x002c:
        r3 = r6.f10063g;	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        r3 = com.facebook.ads.internal.C1418g.m4935f(r3);	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        if (r3 == 0) goto L_0x004e;	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
    L_0x0034:
        r3 = r6.f10063g;	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        r3 = com.facebook.ads.internal.p047k.C1502p.m5286a(r3);	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        if (r3 == 0) goto L_0x004e;	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
    L_0x003c:
        r4 = r3.length();	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        if (r4 <= 0) goto L_0x004e;	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
    L_0x0042:
        if (r2 != 0) goto L_0x0049;	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
    L_0x0044:
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        r2.<init>();	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
    L_0x0049:
        r4 = "debug";	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
        r2.put(r4, r3);	 Catch:{ JSONException -> 0x0073, all -> 0x0059 }
    L_0x004e:
        if (r1 == 0) goto L_0x0053;
    L_0x0050:
        r1.close();
    L_0x0053:
        if (r7 == 0) goto L_0x0058;
    L_0x0055:
        r7.close();
    L_0x0058:
        return r2;
    L_0x0059:
        r0 = move-exception;
        goto L_0x0066;
    L_0x005b:
        r7 = move-exception;
        r5 = r0;
        r0 = r7;
        r7 = r5;
        goto L_0x0066;
    L_0x0060:
        r7 = r0;
        goto L_0x0073;
    L_0x0062:
        r7 = move-exception;
        r1 = r0;
        r0 = r7;
        r7 = r1;
    L_0x0066:
        if (r1 == 0) goto L_0x006b;
    L_0x0068:
        r1.close();
    L_0x006b:
        if (r7 == 0) goto L_0x0070;
    L_0x006d:
        r7.close();
    L_0x0070:
        throw r0;
    L_0x0071:
        r7 = r0;
        r1 = r7;
    L_0x0073:
        if (r1 == 0) goto L_0x0078;
    L_0x0075:
        r1.close();
    L_0x0078:
        if (r7 == 0) goto L_0x007d;
    L_0x007a:
        r7.close();
    L_0x007d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.h.g.a(int):org.json.JSONObject");
    }

    /* renamed from: a */
    private JSONObject m12673a(Cursor cursor) {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            jSONObject.put(cursor.getString(0), cursor.getString(1));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private void m12674a(final C1420d c1420d) {
        if (c1420d.m4965j()) {
            this.f10062f.m4849a(c1420d, new C1392a<String>(this) {
                /* renamed from: b */
                final /* synthetic */ C3288g f10056b;

                /* renamed from: a */
                public void mo1738a(int i, String str) {
                    super.mo1738a(i, str);
                    if (!(c1420d instanceof C3286c)) {
                        this.f10056b.m12685b(str);
                    }
                }

                /* renamed from: a */
                public void m12669a(String str) {
                    super.mo1739a(str);
                    if (c1420d.m4964i()) {
                        this.f10056b.f10061e.m4980a();
                    } else {
                        this.f10056b.f10061e.m4981b();
                    }
                }
            });
            return;
        }
        String str = f10057a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attempting to log an invalid ");
        stringBuilder.append(c1420d.mo1736b());
        stringBuilder.append(" event.");
        Log.e(str, stringBuilder.toString());
    }

    /* renamed from: b */
    private JSONArray m12675b(Cursor cursor) {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", cursor.getString(C3279c.f10036a.f3784a));
            jSONObject.put("token_id", cursor.getString(C3279c.f10037b.f3784a));
            jSONObject.put("type", cursor.getString(C3279c.f10039d.f3784a));
            jSONObject.put("time", C1490h.m5241a(cursor.getDouble(C3279c.f10040e.f3784a)));
            jSONObject.put("session_time", C1490h.m5241a(cursor.getDouble(C3279c.f10041f.f3784a)));
            jSONObject.put("session_id", cursor.getString(C3279c.f10042g.f3784a));
            String string = cursor.getString(C3279c.f10043h.f3784a);
            jSONObject.put(ManagerWebServices.FB_DATA, string != null ? new JSONObject(string) : new JSONObject());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* renamed from: c */
    private JSONArray m12676c(Cursor cursor) {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", cursor.getString(2));
            jSONObject.put("token_id", cursor.getString(0));
            jSONObject.put("type", cursor.getString(4));
            jSONObject.put("time", C1490h.m5241a(cursor.getDouble(5)));
            jSONObject.put("session_time", C1490h.m5241a(cursor.getDouble(6)));
            jSONObject.put("session_id", cursor.getString(7));
            String string = cursor.getString(8);
            jSONObject.put(ManagerWebServices.FB_DATA, string != null ? new JSONObject(string) : new JSONObject());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* renamed from: d */
    private org.json.JSONObject m12677d() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r7 = this;
        r0 = 0;
        r1 = r7.f10062f;	 Catch:{ JSONException -> 0x0077, all -> 0x0068 }
        r1 = r1.m4855f();	 Catch:{ JSONException -> 0x0077, all -> 0x0068 }
        r2 = r7.f10062f;	 Catch:{ JSONException -> 0x0066, all -> 0x0061 }
        r2 = r2.m4854e();	 Catch:{ JSONException -> 0x0066, all -> 0x0061 }
        r3 = r1.getCount();	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        if (r3 <= 0) goto L_0x0031;	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
    L_0x0013:
        r3 = r2.getCount();	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        if (r3 <= 0) goto L_0x0031;	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
    L_0x0019:
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        r3.<init>();	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        r4 = "tokens";	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        r5 = r7.m12673a(r1);	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        r3.put(r4, r5);	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        r4 = "events";	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        r5 = r7.m12675b(r2);	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        r3.put(r4, r5);	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        goto L_0x0032;	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
    L_0x0031:
        r3 = r0;	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
    L_0x0032:
        r4 = r7.f10063g;	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        r4 = com.facebook.ads.internal.C1418g.m4935f(r4);	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        if (r4 == 0) goto L_0x0054;	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
    L_0x003a:
        r4 = r7.f10063g;	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        r4 = com.facebook.ads.internal.p047k.C1502p.m5286a(r4);	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        if (r4 == 0) goto L_0x0054;	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
    L_0x0042:
        r5 = r4.length();	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        if (r5 <= 0) goto L_0x0054;	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
    L_0x0048:
        if (r3 != 0) goto L_0x004f;	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
    L_0x004a:
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        r3.<init>();	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
    L_0x004f:
        r5 = "debug";	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
        r3.put(r5, r4);	 Catch:{ JSONException -> 0x0079, all -> 0x005f }
    L_0x0054:
        if (r1 == 0) goto L_0x0059;
    L_0x0056:
        r1.close();
    L_0x0059:
        if (r2 == 0) goto L_0x005e;
    L_0x005b:
        r2.close();
    L_0x005e:
        return r3;
    L_0x005f:
        r0 = move-exception;
        goto L_0x006c;
    L_0x0061:
        r2 = move-exception;
        r6 = r2;
        r2 = r0;
        r0 = r6;
        goto L_0x006c;
    L_0x0066:
        r2 = r0;
        goto L_0x0079;
    L_0x0068:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
        r1 = r2;
    L_0x006c:
        if (r1 == 0) goto L_0x0071;
    L_0x006e:
        r1.close();
    L_0x0071:
        if (r2 == 0) goto L_0x0076;
    L_0x0073:
        r2.close();
    L_0x0076:
        throw r0;
    L_0x0077:
        r1 = r0;
        r2 = r1;
    L_0x0079:
        if (r1 == 0) goto L_0x007e;
    L_0x007b:
        r1.close();
    L_0x007e:
        if (r2 == 0) goto L_0x0083;
    L_0x0080:
        r2.close();
    L_0x0083:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.h.g.d():org.json.JSONObject");
    }

    /* renamed from: a */
    public JSONObject mo1740a() {
        int i = C1418g.m4938i(this.f10063g);
        return i > 0 ? m12672a(i) : m12677d();
    }

    /* renamed from: a */
    public void mo1741a(String str) {
        new C1515z().execute(new String[]{str});
    }

    /* renamed from: a */
    public void mo1742a(String str, C1499m c1499m) {
        m12674a(new C3284a(str, f10059c, f10060d, c1499m));
    }

    /* renamed from: a */
    public void mo1743a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m12674a(new C3289i(this.f10063g, str, f10059c, f10060d, map));
        }
    }

    /* renamed from: a */
    public void mo1744a(String str, Map<String, String> map, String str2, C1426h c1426h) {
        m12674a(new C3292l(this.f10063g, str, f10059c, f10060d, map, str2, c1426h));
    }

    /* renamed from: a */
    public boolean mo1745a(org.json.JSONArray r12) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r11 = this;
        r0 = r11.f10063g;
        r0 = com.facebook.ads.internal.C1418g.m4935f(r0);
        r1 = 0;
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 1;
    L_0x000b:
        r6 = r12.length();
        if (r3 >= r6) goto L_0x0053;
    L_0x0011:
        r6 = r12.getJSONObject(r3);	 Catch:{ JSONException -> 0x0050 }
        r7 = "id";	 Catch:{ JSONException -> 0x0050 }
        r7 = r6.getString(r7);	 Catch:{ JSONException -> 0x0050 }
        r8 = "code";	 Catch:{ JSONException -> 0x0050 }
        r8 = r6.getInt(r8);	 Catch:{ JSONException -> 0x0050 }
        if (r8 != r2) goto L_0x0035;	 Catch:{ JSONException -> 0x0050 }
    L_0x0023:
        if (r0 == 0) goto L_0x002f;	 Catch:{ JSONException -> 0x0050 }
    L_0x0025:
        r8 = "dbtype";	 Catch:{ JSONException -> 0x0050 }
        r6 = r6.optInt(r8, r1);	 Catch:{ JSONException -> 0x0050 }
        if (r6 != r2) goto L_0x002f;	 Catch:{ JSONException -> 0x0050 }
    L_0x002d:
        r4 = 1;	 Catch:{ JSONException -> 0x0050 }
        goto L_0x0050;	 Catch:{ JSONException -> 0x0050 }
    L_0x002f:
        r6 = r11.f10062f;	 Catch:{ JSONException -> 0x0050 }
        r6.m4850a(r7);	 Catch:{ JSONException -> 0x0050 }
        goto L_0x0050;	 Catch:{ JSONException -> 0x0050 }
    L_0x0035:
        r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ JSONException -> 0x0050 }
        r10 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;	 Catch:{ JSONException -> 0x0050 }
        if (r8 < r9) goto L_0x003f;	 Catch:{ JSONException -> 0x0050 }
    L_0x003b:
        if (r8 >= r10) goto L_0x003f;	 Catch:{ JSONException -> 0x0050 }
    L_0x003d:
        r5 = 0;	 Catch:{ JSONException -> 0x0050 }
        goto L_0x0050;	 Catch:{ JSONException -> 0x0050 }
    L_0x003f:
        if (r8 < r10) goto L_0x0050;	 Catch:{ JSONException -> 0x0050 }
    L_0x0041:
        r9 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ JSONException -> 0x0050 }
        if (r8 >= r9) goto L_0x0050;	 Catch:{ JSONException -> 0x0050 }
    L_0x0045:
        if (r0 == 0) goto L_0x002f;	 Catch:{ JSONException -> 0x0050 }
    L_0x0047:
        r8 = "dbtype";	 Catch:{ JSONException -> 0x0050 }
        r6 = r6.optInt(r8, r1);	 Catch:{ JSONException -> 0x0050 }
        if (r6 != r2) goto L_0x002f;
    L_0x004f:
        goto L_0x002d;
    L_0x0050:
        r3 = r3 + 1;
        goto L_0x000b;
    L_0x0053:
        if (r4 == 0) goto L_0x005a;
    L_0x0055:
        r12 = r11.f10063g;
        com.facebook.ads.internal.p047k.C1502p.m5289b(r12);
    L_0x005a:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.h.g.a(org.json.JSONArray):boolean");
    }

    /* renamed from: b */
    public void mo1746b() {
        this.f10062f.m4856g();
        this.f10062f.m4851b();
    }

    /* renamed from: b */
    public void m12685b(String str) {
        String str2 = f10057a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdEventManager error: ");
        stringBuilder.append(str);
        Log.e(str2, stringBuilder.toString());
    }

    /* renamed from: b */
    public void mo1747b(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m12674a(new C3290j(this.f10063g, str, f10059c, f10060d, map));
        }
    }

    /* renamed from: c */
    public void mo1748c(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m12674a(new C3291k(this.f10063g, str, f10059c, f10060d, map));
        }
    }

    /* renamed from: c */
    public boolean mo1749c() {
        Throwable th;
        int i = C1418g.m4938i(this.f10063g);
        boolean z = true;
        if (i < 1) {
            return false;
        }
        Cursor cursor = null;
        try {
            Cursor d = this.f10062f.m4853d();
            try {
                if (!d.moveToFirst() || d.getInt(0) <= i) {
                    z = false;
                }
                if (d != null) {
                    d.close();
                }
                return z;
            } catch (Throwable th2) {
                th = th2;
                cursor = d;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public void mo1750d(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m12674a(new C3295o(this.f10063g, str, f10059c, f10060d, map));
        }
    }

    /* renamed from: e */
    public void mo1751e(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m12674a(new C3293m(str, f10059c, f10060d, map));
        }
    }

    /* renamed from: f */
    public void mo1752f(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m12674a(new C3294n(this.f10063g, str, f10059c, f10060d, map));
        }
    }

    /* renamed from: g */
    public void mo1753g(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m12674a(new C3285b(this.f10063g, str, f10059c, f10060d, map));
        }
    }
}
