package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
public final class arp {
    /* renamed from: a */
    private static String m19460a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: a */
    public static List<String> m19461a(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        List arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m19462a(Context context, String str, dl dlVar, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String a : list) {
                String a2 = m19460a(m19460a(m19460a(m19460a(m19460a(m19460a(m19460a(a2, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", dlVar.f15985q.f15648h), "@gw_sdkver@", str), "@gw_sessid@", aja.m19218c()), "@gw_seqnum@", dlVar.f15977i), "@gw_adnetstatus@", dlVar.f15987s);
                if (dlVar.f15982n != null) {
                    a2 = m19460a(m19460a(a2, "@gw_adnetid@", dlVar.f15982n.f15623b), "@gw_allocid@", dlVar.f15982n.f15625d);
                }
                a2 = dh.m19613a(a2, context);
                ar.e();
                fk.m19717b(context, str, a2);
            }
        }
    }

    /* renamed from: a */
    public static void m19463a(Context context, String str, List<String> list, String str2, @Nullable zzaeq zzaeq) {
        if (list != null && !list.isEmpty()) {
            long currentTimeMillis = ar.k().currentTimeMillis();
            for (String a : list) {
                String a2 = m19460a(m19460a(a2, "@gw_rwd_userid@", str2), "@gw_tmstmp@", Long.toString(currentTimeMillis));
                if (zzaeq != null) {
                    a2 = m19460a(m19460a(a2, "@gw_rwd_itm@", zzaeq.type), "@gw_rwd_amt@", Integer.toString(zzaeq.zzcwd));
                }
                ar.e();
                fk.m19717b(context, str, a2);
            }
        }
    }

    /* renamed from: a */
    public static boolean m19464a(java.lang.String r3, int[] r4) {
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
        r0 = android.text.TextUtils.isEmpty(r3);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r4.length;
        r2 = 2;
        if (r0 == r2) goto L_0x000d;
    L_0x000c:
        return r1;
    L_0x000d:
        r0 = "x";
        r3 = r3.split(r0);
        r0 = r3.length;
        if (r0 == r2) goto L_0x0017;
    L_0x0016:
        return r1;
    L_0x0017:
        r0 = r3[r1];	 Catch:{ NumberFormatException -> 0x0029 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0029 }
        r4[r1] = r0;	 Catch:{ NumberFormatException -> 0x0029 }
        r0 = 1;	 Catch:{ NumberFormatException -> 0x0029 }
        r3 = r3[r0];	 Catch:{ NumberFormatException -> 0x0029 }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x0029 }
        r4[r0] = r3;	 Catch:{ NumberFormatException -> 0x0029 }
        return r0;
    L_0x0029:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.arp.a(java.lang.String, int[]):boolean");
    }
}
