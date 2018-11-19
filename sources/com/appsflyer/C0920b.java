package com.appsflyer;

import android.os.Build.VERSION;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.b */
public class C0920b {
    /* renamed from: a */
    public static JSONObject m3146a(Map<String, ?> map) {
        if (VERSION.SDK_INT >= 19) {
            return new JSONObject(map);
        }
        return C0920b.m3147b(map);
    }

    /* renamed from: b */
    public static org.json.JSONObject m3147b(java.util.Map<java.lang.String, ?> r3) {
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
        r3 = r3.entrySet();
        r3 = r3.iterator();
    L_0x000d:
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x002b;
    L_0x0013:
        r1 = r3.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getValue();
        r2 = com.appsflyer.C0920b.m3145a(r2);
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x000d }
        r1 = (java.lang.String) r1;	 Catch:{ JSONException -> 0x000d }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x000d }
        goto L_0x000d;
    L_0x002b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.b.b(java.util.Map):org.json.JSONObject");
    }

    /* renamed from: a */
    private static java.lang.Object m3145a(java.lang.Object r3) {
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
        if (r3 != 0) goto L_0x0005;
    L_0x0002:
        r3 = org.json.JSONObject.NULL;
        return r3;
    L_0x0005:
        r0 = r3 instanceof org.json.JSONArray;
        if (r0 != 0) goto L_0x0098;
    L_0x0009:
        r0 = r3 instanceof org.json.JSONObject;
        if (r0 == 0) goto L_0x000f;
    L_0x000d:
        goto L_0x0098;
    L_0x000f:
        r0 = org.json.JSONObject.NULL;
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0018;
    L_0x0017:
        return r3;
    L_0x0018:
        r0 = r3 instanceof java.util.Collection;	 Catch:{ Exception -> 0x0095 }
        if (r0 == 0) goto L_0x003a;	 Catch:{ Exception -> 0x0095 }
    L_0x001c:
        r0 = new org.json.JSONArray;	 Catch:{ Exception -> 0x0095 }
        r0.<init>();	 Catch:{ Exception -> 0x0095 }
        r3 = (java.util.Collection) r3;	 Catch:{ Exception -> 0x0095 }
        r3 = r3.iterator();	 Catch:{ Exception -> 0x0095 }
    L_0x0027:
        r1 = r3.hasNext();	 Catch:{ Exception -> 0x0095 }
        if (r1 == 0) goto L_0x0039;	 Catch:{ Exception -> 0x0095 }
    L_0x002d:
        r1 = r3.next();	 Catch:{ Exception -> 0x0095 }
        r1 = com.appsflyer.C0920b.m3145a(r1);	 Catch:{ Exception -> 0x0095 }
        r0.put(r1);	 Catch:{ Exception -> 0x0095 }
        goto L_0x0027;	 Catch:{ Exception -> 0x0095 }
    L_0x0039:
        return r0;	 Catch:{ Exception -> 0x0095 }
    L_0x003a:
        r0 = r3.getClass();	 Catch:{ Exception -> 0x0095 }
        r0 = r0.isArray();	 Catch:{ Exception -> 0x0095 }
        if (r0 == 0) goto L_0x005f;	 Catch:{ Exception -> 0x0095 }
    L_0x0044:
        r3 = java.lang.reflect.Array.getLength(r3);	 Catch:{ Exception -> 0x0095 }
        r0 = new org.json.JSONArray;	 Catch:{ Exception -> 0x0095 }
        r0.<init>();	 Catch:{ Exception -> 0x0095 }
        r1 = 0;	 Catch:{ Exception -> 0x0095 }
    L_0x004e:
        if (r1 >= r3) goto L_0x005e;	 Catch:{ Exception -> 0x0095 }
    L_0x0050:
        r2 = java.lang.reflect.Array.get(r0, r1);	 Catch:{ Exception -> 0x0095 }
        r2 = com.appsflyer.C0920b.m3145a(r2);	 Catch:{ Exception -> 0x0095 }
        r0.put(r2);	 Catch:{ Exception -> 0x0095 }
        r1 = r1 + 1;	 Catch:{ Exception -> 0x0095 }
        goto L_0x004e;	 Catch:{ Exception -> 0x0095 }
    L_0x005e:
        return r0;	 Catch:{ Exception -> 0x0095 }
    L_0x005f:
        r0 = r3 instanceof java.util.Map;	 Catch:{ Exception -> 0x0095 }
        if (r0 == 0) goto L_0x006a;	 Catch:{ Exception -> 0x0095 }
    L_0x0063:
        r3 = (java.util.Map) r3;	 Catch:{ Exception -> 0x0095 }
        r3 = com.appsflyer.C0920b.m3147b(r3);	 Catch:{ Exception -> 0x0095 }
        return r3;
    L_0x006a:
        r0 = r3 instanceof java.lang.Boolean;
        if (r0 != 0) goto L_0x0094;
    L_0x006e:
        r0 = r3 instanceof java.lang.Byte;
        if (r0 != 0) goto L_0x0094;
    L_0x0072:
        r0 = r3 instanceof java.lang.Character;
        if (r0 != 0) goto L_0x0094;
    L_0x0076:
        r0 = r3 instanceof java.lang.Double;
        if (r0 != 0) goto L_0x0094;
    L_0x007a:
        r0 = r3 instanceof java.lang.Float;
        if (r0 != 0) goto L_0x0094;
    L_0x007e:
        r0 = r3 instanceof java.lang.Integer;
        if (r0 != 0) goto L_0x0094;
    L_0x0082:
        r0 = r3 instanceof java.lang.Long;
        if (r0 != 0) goto L_0x0094;
    L_0x0086:
        r0 = r3 instanceof java.lang.Short;
        if (r0 != 0) goto L_0x0094;
    L_0x008a:
        r0 = r3 instanceof java.lang.String;
        if (r0 == 0) goto L_0x008f;
    L_0x008e:
        goto L_0x0094;
    L_0x008f:
        r3 = r3.toString();	 Catch:{ Exception -> 0x0095 }
        return r3;
    L_0x0094:
        return r3;
    L_0x0095:
        r3 = org.json.JSONObject.NULL;
        return r3;
    L_0x0098:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.b.a(java.lang.Object):java.lang.Object");
    }
}
