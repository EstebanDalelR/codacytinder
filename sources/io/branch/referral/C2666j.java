package io.branch.referral;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.j */
public class C2666j {
    /* renamed from: a */
    static boolean f8428a = false;

    /* renamed from: a */
    static boolean m10266a(android.content.Context r5) {
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
        r0 = f8428a;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r5 = f8428a;
        return r5;
    L_0x0007:
        r0 = "io.branch.sdk.TestMode";
        r1 = 0;
        r2 = r5.getPackageManager();	 Catch:{ Exception -> 0x0043 }
        r3 = r5.getPackageName();	 Catch:{ Exception -> 0x0043 }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x0043 }
        r2 = r2.getApplicationInfo(r3, r4);	 Catch:{ Exception -> 0x0043 }
        r3 = r2.metaData;	 Catch:{ Exception -> 0x0043 }
        if (r3 == 0) goto L_0x002c;	 Catch:{ Exception -> 0x0043 }
    L_0x001c:
        r3 = r2.metaData;	 Catch:{ Exception -> 0x0043 }
        r3 = r3.containsKey(r0);	 Catch:{ Exception -> 0x0043 }
        if (r3 == 0) goto L_0x002c;	 Catch:{ Exception -> 0x0043 }
    L_0x0024:
        r5 = r2.metaData;	 Catch:{ Exception -> 0x0043 }
        r5 = r5.getBoolean(r0, r1);	 Catch:{ Exception -> 0x0043 }
    L_0x002a:
        r1 = r5;	 Catch:{ Exception -> 0x0043 }
        goto L_0x0043;	 Catch:{ Exception -> 0x0043 }
    L_0x002c:
        r2 = r5.getResources();	 Catch:{ Exception -> 0x0043 }
        r3 = "string";	 Catch:{ Exception -> 0x0043 }
        r5 = r5.getPackageName();	 Catch:{ Exception -> 0x0043 }
        r5 = r2.getIdentifier(r0, r3, r5);	 Catch:{ Exception -> 0x0043 }
        r5 = r2.getString(r5);	 Catch:{ Exception -> 0x0043 }
        r5 = java.lang.Boolean.parseBoolean(r5);	 Catch:{ Exception -> 0x0043 }
        goto L_0x002a;
    L_0x0043:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.j.a(android.content.Context):boolean");
    }

    /* renamed from: a */
    static String m10265a(JSONObject jSONObject) {
        return C2666j.m10268b(C2666j.m10269c(jSONObject));
    }

    /* renamed from: b */
    static String m10268b(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("source", "android");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: c */
    static org.json.JSONObject m10269c(org.json.JSONObject r6) {
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
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r6 == 0) goto L_0x005b;
    L_0x0007:
        r1 = r6.keys();
    L_0x000b:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x005b;
    L_0x0011:
        r2 = r1.next();
        r2 = (java.lang.String) r2;
        r3 = r6.has(r2);	 Catch:{ JSONException -> 0x000b }
        if (r3 == 0) goto L_0x004d;	 Catch:{ JSONException -> 0x000b }
    L_0x001d:
        r3 = r6.get(r2);	 Catch:{ JSONException -> 0x000b }
        r3 = r3.getClass();	 Catch:{ JSONException -> 0x000b }
        r4 = java.lang.String.class;	 Catch:{ JSONException -> 0x000b }
        r3 = r3.equals(r4);	 Catch:{ JSONException -> 0x000b }
        if (r3 == 0) goto L_0x004d;	 Catch:{ JSONException -> 0x000b }
    L_0x002d:
        r3 = r6.getString(r2);	 Catch:{ JSONException -> 0x000b }
        r4 = "\n";	 Catch:{ JSONException -> 0x000b }
        r5 = "\\n";	 Catch:{ JSONException -> 0x000b }
        r3 = r3.replace(r4, r5);	 Catch:{ JSONException -> 0x000b }
        r4 = "\r";	 Catch:{ JSONException -> 0x000b }
        r5 = "\\r";	 Catch:{ JSONException -> 0x000b }
        r3 = r3.replace(r4, r5);	 Catch:{ JSONException -> 0x000b }
        r4 = "\"";	 Catch:{ JSONException -> 0x000b }
        r5 = "\\\"";	 Catch:{ JSONException -> 0x000b }
        r3 = r3.replace(r4, r5);	 Catch:{ JSONException -> 0x000b }
        r0.put(r2, r3);	 Catch:{ JSONException -> 0x000b }
        goto L_0x000b;	 Catch:{ JSONException -> 0x000b }
    L_0x004d:
        r3 = r6.has(r2);	 Catch:{ JSONException -> 0x000b }
        if (r3 == 0) goto L_0x000b;	 Catch:{ JSONException -> 0x000b }
    L_0x0053:
        r3 = r6.get(r2);	 Catch:{ JSONException -> 0x000b }
        r0.put(r2, r3);	 Catch:{ JSONException -> 0x000b }
        goto L_0x000b;
    L_0x005b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.j.c(org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: a */
    public static Drawable m10264a(@NonNull Context context, @DrawableRes int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getResources().getDrawable(i, context.getTheme());
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: b */
    public static int m10267b(Context context, int i) {
        return Math.round(((float) i) * (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }
}
