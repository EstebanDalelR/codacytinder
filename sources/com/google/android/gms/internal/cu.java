package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.C2490g;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.util.C2526k;
import com.tinder.api.ManagerWebServices;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
public final class cu implements zzafb {
    @VisibleForTesting
    /* renamed from: a */
    boolean f23243a;
    /* renamed from: b */
    private final aei f23244b;
    /* renamed from: c */
    private final LinkedHashMap<String, aeq> f23245c;
    /* renamed from: d */
    private final Context f23246d;
    /* renamed from: e */
    private final zzafd f23247e;
    /* renamed from: f */
    private final zzaey f23248f;
    /* renamed from: g */
    private final Object f23249g = new Object();
    /* renamed from: h */
    private HashSet<String> f23250h = new HashSet();
    /* renamed from: i */
    private boolean f23251i = false;
    /* renamed from: j */
    private boolean f23252j = false;
    /* renamed from: k */
    private boolean f23253k = false;

    public cu(Context context, zzakd zzakd, zzaey zzaey, String str, zzafd zzafd) {
        ad.a(zzaey, "SafeBrowsing config is not present.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f23246d = context;
        this.f23245c = new LinkedHashMap();
        this.f23247e = zzafd;
        this.f23248f = zzaey;
        for (String toLowerCase : this.f23248f.zzcwt) {
            this.f23250h.add(toLowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f23250h.remove("cookie".toLowerCase(Locale.ENGLISH));
        aei aei = new aei();
        aei.f26552a = Integer.valueOf(8);
        aei.f26553b = str;
        aei.f26554c = str;
        aei.f26555d = new aej();
        aei.f26555d.f26568a = this.f23248f.zzcwp;
        aer aer = new aer();
        aer.f26602a = zzakd.zzcv;
        aer.f26604c = Boolean.valueOf(pl.m20131a(this.f23246d).m20127a());
        C2490g.b();
        long d = (long) C2490g.d(this.f23246d);
        if (d > 0) {
            aer.f26603b = Long.valueOf(d);
        }
        aei.f26559h = aer;
        this.f23244b = aei;
    }

    @Nullable
    /* renamed from: a */
    private final aeq m27275a(String str) {
        aeq aeq;
        synchronized (this.f23249g) {
            aeq = (aeq) this.f23245c.get(str);
        }
        return aeq;
    }

    @VisibleForTesting
    /* renamed from: a */
    final void m27278a() {
        Object obj = (!(this.f23243a && this.f23248f.zzcwv) && (!(this.f23253k && this.f23248f.zzcwu) && (this.f23243a || !this.f23248f.zzcws))) ? null : 1;
        if (obj != null) {
            synchronized (this.f23249g) {
                this.f23244b.f26556e = new aeq[this.f23245c.size()];
                this.f23245c.values().toArray(this.f23244b.f26556e);
                if (dc.m19584a()) {
                    String str = this.f23244b.f26553b;
                    String str2 = this.f23244b.f26557f;
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 53) + String.valueOf(str2).length());
                    stringBuilder.append("Sending SB report\n  url: ");
                    stringBuilder.append(str);
                    stringBuilder.append("\n  clickUrl: ");
                    stringBuilder.append(str2);
                    stringBuilder.append("\n  resources: \n");
                    StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
                    for (aeq aeq : this.f23244b.f26556e) {
                        stringBuilder2.append("    [");
                        stringBuilder2.append(aeq.f26597e.length);
                        stringBuilder2.append("] ");
                        stringBuilder2.append(aeq.f26594b);
                    }
                    dc.m19583a(stringBuilder2.toString());
                }
                zzakv a = new gr(this.f23246d).m19830a(1, this.f23248f.zzcwq, null, aee.m19058a(this.f23244b));
                if (dc.m19584a()) {
                    a.zza(new cx(this), fe.f16050a);
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    final void m27279a(@Nullable Map<String, String> map) throws JSONException {
        if (map != null) {
            for (String str : map.keySet()) {
                String str2;
                JSONArray optJSONArray = new JSONObject((String) map.get(str2)).optJSONArray(ManagerWebServices.PARAM_MATCHES);
                if (optJSONArray != null) {
                    synchronized (this.f23249g) {
                        int length = optJSONArray.length();
                        aeq a = m27275a(str2);
                        if (a == null) {
                            String str3 = "Cannot find the corresponding resource object for ";
                            str2 = String.valueOf(str2);
                            dc.m19583a(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                        } else {
                            a.f26597e = new String[length];
                            int i = 0;
                            for (int i2 = 0; i2 < length; i2++) {
                                a.f26597e[i2] = optJSONArray.getJSONObject(i2).getString("threat_type");
                            }
                            boolean z = this.f23243a;
                            if (length > 0) {
                                i = 1;
                            }
                            this.f23243a = i | z;
                        }
                    }
                }
            }
        }
    }

    public final void zza(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
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
        r0 = r6.f23249g;
        monitor-enter(r0);
        r1 = 3;
        if (r9 != r1) goto L_0x000d;
    L_0x0006:
        r2 = 1;
        r6.f23253k = r2;	 Catch:{ all -> 0x000a }
        goto L_0x000d;	 Catch:{ all -> 0x000a }
    L_0x000a:
        r7 = move-exception;	 Catch:{ all -> 0x000a }
        goto L_0x00ca;	 Catch:{ all -> 0x000a }
    L_0x000d:
        r2 = r6.f23245c;	 Catch:{ all -> 0x000a }
        r2 = r2.containsKey(r7);	 Catch:{ all -> 0x000a }
        if (r2 == 0) goto L_0x0027;	 Catch:{ all -> 0x000a }
    L_0x0015:
        if (r9 != r1) goto L_0x0025;	 Catch:{ all -> 0x000a }
    L_0x0017:
        r8 = r6.f23245c;	 Catch:{ all -> 0x000a }
        r7 = r8.get(r7);	 Catch:{ all -> 0x000a }
        r7 = (com.google.android.gms.internal.aeq) r7;	 Catch:{ all -> 0x000a }
        r8 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x000a }
        r7.f26596d = r8;	 Catch:{ all -> 0x000a }
    L_0x0025:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;	 Catch:{ all -> 0x000a }
    L_0x0027:
        r1 = new com.google.android.gms.internal.aeq;	 Catch:{ all -> 0x000a }
        r1.<init>();	 Catch:{ all -> 0x000a }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x000a }
        r1.f26596d = r9;	 Catch:{ all -> 0x000a }
        r9 = r6.f23245c;	 Catch:{ all -> 0x000a }
        r9 = r9.size();	 Catch:{ all -> 0x000a }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x000a }
        r1.f26593a = r9;	 Catch:{ all -> 0x000a }
        r1.f26594b = r7;	 Catch:{ all -> 0x000a }
        r9 = new com.google.android.gms.internal.ael;	 Catch:{ all -> 0x000a }
        r9.<init>();	 Catch:{ all -> 0x000a }
        r1.f26595c = r9;	 Catch:{ all -> 0x000a }
        r9 = r6.f23250h;	 Catch:{ all -> 0x000a }
        r9 = r9.size();	 Catch:{ all -> 0x000a }
        if (r9 <= 0) goto L_0x00c3;	 Catch:{ all -> 0x000a }
    L_0x004f:
        if (r8 == 0) goto L_0x00c3;	 Catch:{ all -> 0x000a }
    L_0x0051:
        r9 = new java.util.LinkedList;	 Catch:{ all -> 0x000a }
        r9.<init>();	 Catch:{ all -> 0x000a }
        r8 = r8.entrySet();	 Catch:{ all -> 0x000a }
        r8 = r8.iterator();	 Catch:{ all -> 0x000a }
    L_0x005e:
        r2 = r8.hasNext();	 Catch:{ all -> 0x000a }
        if (r2 == 0) goto L_0x00b6;	 Catch:{ all -> 0x000a }
    L_0x0064:
        r2 = r8.next();	 Catch:{ all -> 0x000a }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x000a }
        r3 = r2.getKey();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        if (r3 == 0) goto L_0x0077;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0070:
        r3 = r2.getKey();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r3 = (java.lang.String) r3;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        goto L_0x0079;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0077:
        r3 = "";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0079:
        r4 = r2.getValue();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        if (r4 == 0) goto L_0x0086;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x007f:
        r2 = r2.getValue();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r2 = (java.lang.String) r2;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        goto L_0x0088;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0086:
        r2 = "";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0088:
        r4 = java.util.Locale.ENGLISH;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4 = r3.toLowerCase(r4);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r5 = r6.f23250h;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4 = r5.contains(r4);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        if (r4 != 0) goto L_0x0097;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0096:
        goto L_0x005e;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0097:
        r4 = new com.google.android.gms.internal.aek;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4.<init>();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r5 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r3 = r3.getBytes(r5);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4.f26570a = r3;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r3 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r2 = r2.getBytes(r3);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4.f26571b = r2;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r9.add(r4);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        goto L_0x005e;
    L_0x00b0:
        r2 = "Cannot convert string to bytes, skip header.";	 Catch:{ all -> 0x000a }
        com.google.android.gms.internal.dc.m19583a(r2);	 Catch:{ all -> 0x000a }
        goto L_0x005e;	 Catch:{ all -> 0x000a }
    L_0x00b6:
        r8 = r9.size();	 Catch:{ all -> 0x000a }
        r8 = new com.google.android.gms.internal.aek[r8];	 Catch:{ all -> 0x000a }
        r9.toArray(r8);	 Catch:{ all -> 0x000a }
        r9 = r1.f26595c;	 Catch:{ all -> 0x000a }
        r9.f26572a = r8;	 Catch:{ all -> 0x000a }
    L_0x00c3:
        r8 = r6.f23245c;	 Catch:{ all -> 0x000a }
        r8.put(r7, r1);	 Catch:{ all -> 0x000a }
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;	 Catch:{ all -> 0x000a }
    L_0x00ca:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cu.zza(java.lang.String, java.util.Map, int):void");
    }

    public final void zzbv(String str) {
        synchronized (this.f23249g) {
            this.f23244b.f26557f = str;
        }
    }

    public final zzaey zzok() {
        return this.f23248f;
    }

    public final boolean zzol() {
        return C2526k.e() && this.f23248f.zzcwr && !this.f23252j;
    }

    public final void zzom() {
        this.f23251i = true;
    }

    public final void zzon() {
        synchronized (this.f23249g) {
            zzakv zza = this.f23247e.zza(this.f23246d, this.f23245c.keySet());
            zza.zza(new cw(this, zza), fe.f16050a);
        }
    }

    public final void zzq(View view) {
        if (this.f23248f.zzcwr && !this.f23252j) {
            ar.e();
            Bitmap b = fk.m19712b(view);
            if (b == null) {
                dc.m19583a("Failed to capture the webview bitmap.");
                return;
            }
            this.f23252j = true;
            fk.m19718b(new cv(this, b));
        }
    }
}
