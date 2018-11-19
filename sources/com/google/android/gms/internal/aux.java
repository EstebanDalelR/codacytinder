package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.internal.aa;
import com.google.android.gms.ads.internal.ar;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.GlobalConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
public final class aux implements Callable<dl> {
    /* renamed from: a */
    private static long f15743a = 10;
    /* renamed from: b */
    private final Context f15744b;
    /* renamed from: c */
    private final gr f15745c;
    /* renamed from: d */
    private final aa f15746d;
    /* renamed from: e */
    private final tb f15747e;
    /* renamed from: f */
    private final zzzb f15748f;
    /* renamed from: g */
    private final Object f15749g = new Object();
    /* renamed from: h */
    private final dm f15750h;
    /* renamed from: i */
    private final amb f15751i;
    /* renamed from: j */
    private boolean f15752j;
    /* renamed from: k */
    private int f15753k;
    /* renamed from: l */
    private List<String> f15754l;
    /* renamed from: m */
    private JSONObject f15755m;
    /* renamed from: n */
    private String f15756n;

    public aux(Context context, aa aaVar, gr grVar, tb tbVar, dm dmVar, amb amb) {
        this.f15744b = context;
        this.f15746d = aaVar;
        this.f15745c = grVar;
        this.f15750h = dmVar;
        this.f15747e = tbVar;
        this.f15751i = amb;
        this.f15748f = aaVar.i();
        this.f15752j = false;
        this.f15753k = -2;
        this.f15754l = null;
        this.f15756n = null;
    }

    /* renamed from: a */
    private final com.google.android.gms.internal.dl m19501a() {
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
        r13 = this;
        r0 = 0;
        r1 = 0;
        r2 = r13.f15746d;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r11 = r2.g();	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = r13.m19511b();	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r2 != 0) goto L_0x0078;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x000e:
        r2 = new com.google.android.gms.internal.iw;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2.<init>();	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = new com.google.android.gms.internal.auw;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2.<init>();	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = new org.json.JSONObject;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r13.f15750h;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r3.f15996b;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r3.body;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2.<init>(r3);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = new org.json.JSONObject;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = r13.f15750h;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = r4.f15996b;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = r4.body;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3.<init>(r4);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = r3.length();	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r4 == 0) goto L_0x004a;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0034:
        r4 = "ads";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r3.optJSONArray(r4);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r3 == 0) goto L_0x0041;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x003c:
        r3 = r3.optJSONObject(r1);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        goto L_0x0042;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0041:
        r3 = r0;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0042:
        if (r3 == 0) goto L_0x004a;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0044:
        r3 = r3.length();	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r3 != 0) goto L_0x004e;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x004a:
        r3 = 3;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r13.m19506a(r3);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x004e:
        r3 = r13.f15748f;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = r3.zzi(r2);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = f15743a;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = r2.get(r3, r5);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = (org.json.JSONObject) r2;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = "success";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r2.optBoolean(r3, r1);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r3 == 0) goto L_0x0078;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0066:
        r3 = "json";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = r2.getJSONObject(r3);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = "ads";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = r2.optJSONArray(r3);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = r2.getJSONObject(r1);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r8 = r2;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        goto L_0x0079;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0078:
        r8 = r0;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0079:
        r2 = r13.m19511b();	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r2 != 0) goto L_0x0122;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x007f:
        if (r8 != 0) goto L_0x0083;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0081:
        goto L_0x0122;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0083:
        r2 = "template_id";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = r8.getString(r2);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r13.f15750h;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r3.f15995a;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r3.zzauo;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r3 == 0) goto L_0x009a;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0091:
        r3 = r13.f15750h;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r3.f15995a;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r3.zzauo;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r3.zzbve;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        goto L_0x009b;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x009a:
        r3 = 0;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x009b:
        r4 = r13.f15750h;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = r4.f15995a;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = r4.zzauo;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r4 == 0) goto L_0x00ac;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x00a3:
        r4 = r13.f15750h;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = r4.f15995a;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = r4.zzauo;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = r4.zzbvg;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        goto L_0x00ad;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x00ac:
        r4 = 0;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x00ad:
        r5 = "2";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5 = r5.equals(r2);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r5 == 0) goto L_0x00bf;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x00b5:
        r2 = new com.google.android.gms.internal.avl;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5 = r13.f15750h;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5 = r5.f16004j;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2.<init>(r3, r4, r5);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        goto L_0x0123;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x00bf:
        r5 = "1";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5 = r5.equals(r2);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r5 == 0) goto L_0x00d1;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x00c7:
        r2 = new com.google.android.gms.internal.avm;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5 = r13.f15750h;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5 = r5.f16004j;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2.<init>(r3, r4, r5);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        goto L_0x0123;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x00d1:
        r4 = "3";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = r4.equals(r2);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r2 == 0) goto L_0x011f;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x00d9:
        r2 = "custom_template_id";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = r8.getString(r2);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = new com.google.android.gms.internal.iw;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4.<init>();	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5 = com.google.android.gms.internal.fk.f16060a;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r6 = new com.google.android.gms.internal.auy;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r6.<init>(r13, r4, r2);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5.post(r6);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5 = f15743a;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = r4.get(r5, r2);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r2 == 0) goto L_0x00fe;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x00f8:
        r2 = new com.google.android.gms.internal.avn;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2.<init>(r3);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        goto L_0x0123;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x00fe:
        r2 = "No handler for custom template: ";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = "custom_template_id";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r8.getString(r3);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = r3.length();	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r4 == 0) goto L_0x0115;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0110:
        r2 = r2.concat(r3);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        goto L_0x011b;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0115:
        r3 = new java.lang.String;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3.<init>(r2);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = r3;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x011b:
        com.google.android.gms.internal.hx.m19913c(r2);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        goto L_0x0122;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x011f:
        r13.m19506a(r1);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0122:
        r2 = r0;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0123:
        r3 = r13.m19511b();	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r3 != 0) goto L_0x0171;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0129:
        if (r2 == 0) goto L_0x0171;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x012b:
        if (r8 != 0) goto L_0x012e;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x012d:
        goto L_0x0171;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x012e:
        r3 = "tracking_urls_and_actions";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r8.getJSONObject(r3);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = "impression_tracking_urls";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = m19513c(r3, r4);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r4 != 0) goto L_0x013e;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x013c:
        r4 = r0;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        goto L_0x0142;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x013e:
        r4 = java.util.Arrays.asList(r4);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0142:
        r13.f15754l = r4;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = "active_view";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r3.optJSONObject(r4);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r13.f15755m = r3;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = "debug_signals";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r8.optString(r3);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r13.f15756n = r3;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2 = r2.zza(r13, r8);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r12 = new com.google.android.gms.internal.amv;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = r13.f15744b;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5 = r13.f15746d;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r6 = r13.f15748f;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r7 = r13.f15747e;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r13.f15750h;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r3.f15995a;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r10 = r3.zzaty;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r12;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r9 = r2;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r2.zzb(r12);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        goto L_0x0172;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0171:
        r2 = r0;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0172:
        r3 = r2 instanceof com.google.android.gms.internal.amr;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        if (r3 == 0) goto L_0x018c;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x0176:
        r3 = r2;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = (com.google.android.gms.internal.amr) r3;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = new com.google.android.gms.internal.auw;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4.<init>();	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5 = new com.google.android.gms.internal.auz;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r5.<init>(r13, r3);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4.f15742a = r5;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3 = r13.f15748f;	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r4 = "/nativeAdCustomClick";	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        r3.zza(r4, r5);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
    L_0x018c:
        r2 = r13.m19502a(r2);	 Catch:{ CancellationException -> 0x019f, CancellationException -> 0x019f, CancellationException -> 0x019f, JSONException -> 0x0199, TimeoutException -> 0x0195, Exception -> 0x0191 }
        return r2;
    L_0x0191:
        r2 = move-exception;
        r3 = "Error occured while doing native ads initialization.";
        goto L_0x019c;
    L_0x0195:
        r2 = move-exception;
        r3 = "Timeout when loading native ad.";
        goto L_0x019c;
    L_0x0199:
        r2 = move-exception;
        r3 = "Malformed native JSON response.";
    L_0x019c:
        com.google.android.gms.internal.hx.m19914c(r3, r2);
    L_0x019f:
        r2 = r13.f15752j;
        if (r2 != 0) goto L_0x01a6;
    L_0x01a3:
        r13.m19506a(r1);
    L_0x01a6:
        r0 = r13.m19502a(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aux.a():com.google.android.gms.internal.dl");
    }

    /* renamed from: a */
    private final dl m19502a(zzou zzou) {
        int i;
        zzou zzou2;
        synchronized (this.f15749g) {
            try {
                i = (zzou == null && r1.f15753k == -2) ? 0 : r1.f15753k;
            } finally {
                Object obj = r0;
            }
        }
        if (i == -2) {
            zzou2 = zzou;
        }
        zzjj zzjj = r1.f15750h.f15995a.zzcnd;
        List list = r1.f15750h.f15996b.zzcdk;
        List list2 = r1.f15750h.f15996b.zzcdl;
        List list3 = r1.f15754l;
        int i2 = r1.f15750h.f15996b.orientation;
        long j = r1.f15750h.f15996b.zzcdq;
        String str = r1.f15750h.f15995a.zzcng;
        zzjn zzjn = r1.f15750h.f15998d;
        long j2 = r1.f15750h.f15996b.zzcov;
        List list4 = list;
        long j3 = r1.f15750h.f16000f;
        long j4 = j2;
        long j5 = r1.f15750h.f16001g;
        String str2 = r1.f15750h.f15996b.zzcpb;
        JSONObject jSONObject = r1.f15755m;
        boolean z = r1.f15750h.f15996b.zzcpo;
        zzaaz zzaaz = r1.f15750h.f15996b.zzcpp;
        List list5 = r1.f15750h.f15996b.zzcdn;
        return new dl(zzjj, null, list4, i, list2, list3, i2, j, str, false, null, null, null, null, null, 0, zzjn, j4, j3, j5, str2, jSONObject, zzou2, null, null, null, z, zzaaz, null, list5, r1.f15756n, r1.f15750h.f16003i, r1.f15750h.f15996b.zzaqv, r1.f15750h.f16004j);
    }

    /* renamed from: a */
    private final zzakv<amm> m19503a(JSONObject jSONObject, boolean z, boolean z2) throws JSONException {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? id.m19920a(new amm(null, Uri.parse(string), optDouble)) : this.f15745c.m19831a(string, new avb(this, z, optDouble, optBoolean, string));
        } else {
            m19519a(0, z);
            return id.m19920a(null);
        }
    }

    /* renamed from: a */
    static zzanh m19504a(zzakv<zzanh> zzakv) {
        try {
            return (zzanh) zzakv.get((long) ((Integer) aja.m19221f().m19334a(alo.bP)).intValue(), TimeUnit.SECONDS);
        } catch (Throwable e) {
            hx.m19914c("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (Throwable e2) {
            hx.m19914c("Exception occurred while waiting for video to load", e2);
            return null;
        }
    }

    /* renamed from: a */
    private final void m19506a(int i) {
        synchronized (this.f15749g) {
            this.f15752j = true;
            this.f15753k = i;
        }
    }

    /* renamed from: a */
    private final void m19508a(zzqm zzqm, String str) {
        try {
            zzqw zzs = this.f15746d.zzs(zzqm.getCustomTemplateId());
            if (zzs != null) {
                zzs.zzb(zzqm, str);
            }
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 40);
            stringBuilder.append("Failed to call onCustomClick for asset ");
            stringBuilder.append(str);
            stringBuilder.append(".");
            hx.m19914c(stringBuilder.toString(), e);
        }
    }

    /* renamed from: b */
    private static <V> zzakv<List<V>> m19509b(List<zzakv<V>> list) {
        zzakv iwVar = new iw();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzakv zza : list) {
            zza.zza(new avc(atomicInteger, size, iwVar, list), fe.f16050a);
        }
        return iwVar;
    }

    /* renamed from: b */
    private static java.lang.Integer m19510b(org.json.JSONObject r2, java.lang.String r3) {
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
        r2 = r2.getJSONObject(r3);	 Catch:{ JSONException -> 0x001f }
        r3 = "r";	 Catch:{ JSONException -> 0x001f }
        r3 = r2.getInt(r3);	 Catch:{ JSONException -> 0x001f }
        r0 = "g";	 Catch:{ JSONException -> 0x001f }
        r0 = r2.getInt(r0);	 Catch:{ JSONException -> 0x001f }
        r1 = "b";	 Catch:{ JSONException -> 0x001f }
        r2 = r2.getInt(r1);	 Catch:{ JSONException -> 0x001f }
        r2 = android.graphics.Color.rgb(r3, r0, r2);	 Catch:{ JSONException -> 0x001f }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ JSONException -> 0x001f }
        return r2;
    L_0x001f:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aux.b(org.json.JSONObject, java.lang.String):java.lang.Integer");
    }

    /* renamed from: b */
    private final boolean m19511b() {
        boolean z;
        synchronized (this.f15749g) {
            z = this.f15752j;
        }
        return z;
    }

    /* renamed from: c */
    private static <V> List<V> m19512c(List<zzakv<V>> list) throws ExecutionException, InterruptedException {
        List<V> arrayList = new ArrayList();
        for (zzakv zzakv : list) {
            Object obj = zzakv.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private static String[] m19513c(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    /* renamed from: a */
    public final zzakv<amk> m19514a(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return id.m19920a(null);
        }
        String optString = optJSONObject.optString(ManagerWebServices.PARAM_TEXT);
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b = m19510b(optJSONObject, "text_color");
        Integer b2 = m19510b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", AdError.NETWORK_ERROR_CODE);
        int optInt3 = optJSONObject.optInt("presentation_ms", GlobalConfig.DEFAULT_RECS_INTERVAL);
        int i = (this.f15750h.f15995a.zzauo == null || this.f15750h.f15995a.zzauo.versionCode < 2) ? 1 : this.f15750h.f15995a.zzauo.zzbvh;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List arrayList = new ArrayList();
        if (optJSONObject.optJSONArray(ManagerWebServices.PARAM_SPOTIFY_IMAGES) != null) {
            arrayList = m19517a(optJSONObject, ManagerWebServices.PARAM_SPOTIFY_IMAGES, false, false, true);
        } else {
            arrayList.add(m19516a(optJSONObject, ManagerWebServices.IG_PARAM_IMAGE, false, false));
        }
        return id.m19923a(m19509b(arrayList), new ava(this, optString, b2, b, optInt, optInt3, optInt2, i, optBoolean), fe.f16050a);
    }

    /* renamed from: a */
    public final zzakv<zzanh> m19515a(JSONObject jSONObject, String str) throws JSONException {
        jSONObject = jSONObject.optJSONObject(str);
        if (jSONObject == null) {
            return id.m19920a(null);
        }
        if (TextUtils.isEmpty(jSONObject.optString("vast_xml"))) {
            hx.m19916e("Required field 'vast_xml' is missing");
            return id.m19920a(null);
        }
        avd avd = new avd(this.f15744b, this.f15747e, this.f15750h, this.f15751i, this.f15746d);
        zzakv iwVar = new iw();
        ar.e();
        fk.m19700a(new ave(avd, jSONObject, iwVar));
        return iwVar;
    }

    /* renamed from: a */
    public final zzakv<amm> m19516a(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        jSONObject = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return m19503a(jSONObject, z, z2);
    }

    /* renamed from: a */
    public final List<zzakv<amm>> m19517a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        List<zzakv<amm>> arrayList = new ArrayList();
        if (optJSONArray != null) {
            if (optJSONArray.length() != 0) {
                int length = z3 ? optJSONArray.length() : 1;
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    arrayList.add(m19503a(jSONObject2, false, z2));
                }
                return arrayList;
            }
        }
        m19519a(0, false);
        return arrayList;
    }

    /* renamed from: a */
    public final Future<amm> m19518a(JSONObject jSONObject, String str, boolean z) throws JSONException {
        jSONObject = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject.optBoolean("require", true);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return m19503a(jSONObject, optBoolean, z);
    }

    /* renamed from: a */
    public final void m19519a(int i, boolean z) {
        if (z) {
            m19506a(i);
        }
    }

    public final /* synthetic */ Object call() throws Exception {
        return m19501a();
    }
}
