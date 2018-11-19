package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import io.fabric.sdk.android.services.events.C15645a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@zzzv
public final class cm extends dy implements zzaeh {
    /* renamed from: a */
    private final dm f26873a;
    /* renamed from: b */
    private final Context f26874b;
    /* renamed from: c */
    private final ArrayList<Future> f26875c;
    /* renamed from: d */
    private final ArrayList<String> f26876d;
    /* renamed from: e */
    private final HashMap<String, ce> f26877e;
    /* renamed from: f */
    private final List<ci> f26878f;
    /* renamed from: g */
    private final HashSet<String> f26879g;
    /* renamed from: h */
    private final Object f26880h;
    /* renamed from: i */
    private final bp f26881i;
    /* renamed from: j */
    private final long f26882j;

    public cm(Context context, dm dmVar, bp bpVar) {
        Context context2 = context;
        dm dmVar2 = dmVar;
        bp bpVar2 = bpVar;
        this(context2, dmVar2, bpVar2, ((Long) aja.m19221f().m19334a(alo.at)).longValue());
    }

    private cm(Context context, dm dmVar, bp bpVar, long j) {
        this.f26875c = new ArrayList();
        this.f26876d = new ArrayList();
        this.f26877e = new HashMap();
        this.f26878f = new ArrayList();
        this.f26879g = new HashSet();
        this.f26880h = new Object();
        this.f26874b = context;
        this.f26873a = dmVar;
        this.f26881i = bpVar;
        this.f26882j = j;
    }

    /* renamed from: a */
    private final dl m31553a(int i, @Nullable String str, @Nullable ari ari) {
        zzjj zzjj = this.f26873a.f15995a.zzcnd;
        List list = this.f26873a.f15996b.zzcdk;
        List list2 = this.f26873a.f15996b.zzcdl;
        List list3 = this.f26873a.f15996b.zzcoy;
        int i2 = this.f26873a.f15996b.orientation;
        long j = this.f26873a.f15996b.zzcdq;
        String str2 = this.f26873a.f15995a.zzcng;
        boolean z = this.f26873a.f15996b.zzcow;
        arj arj = this.f26873a.f15997c;
        long j2 = this.f26873a.f15996b.zzcox;
        zzjn zzjn = this.f26873a.f15998d;
        long j3 = j2;
        arj arj2 = arj;
        long j4 = this.f26873a.f15996b.zzcov;
        long j5 = this.f26873a.f16000f;
        long j6 = this.f26873a.f15996b.zzcpa;
        String str3 = this.f26873a.f15996b.zzcpb;
        JSONObject jSONObject = this.f26873a.f16002h;
        zzaeq zzaeq = this.f26873a.f15996b.zzcpl;
        List list4 = this.f26873a.f15996b.zzcpm;
        List list5 = this.f26873a.f15996b.zzcpn;
        boolean z2 = this.f26873a.f15996b.zzcpo;
        zzaaz zzaaz = this.f26873a.f15996b.zzcpp;
        String c = m31554c();
        zzaaz zzaaz2 = zzaaz;
        List list6 = this.f26873a.f15996b.zzcdn;
        String str4 = this.f26873a.f15996b.zzcps;
        ahw ahw = this.f26873a.f16003i;
        JSONObject jSONObject2 = jSONObject;
        zzjn zzjn2 = zzjn;
        String str5 = str3;
        long j7 = j3;
        j3 = j6;
        return new dl(zzjj, null, list, i, list2, list3, i2, j, str2, z, ari, null, str, arj2, null, j7, zzjn2, j4, j5, j3, str5, jSONObject2, null, zzaeq, list4, list5, z2, zzaaz2, c, list6, str4, ahw, this.f26873a.f15996b.zzaqv, this.f26873a.f16004j);
    }

    /* renamed from: c */
    private final String m31554c() {
        StringBuilder stringBuilder = new StringBuilder("");
        if (this.f26878f == null) {
            return stringBuilder.toString();
        }
        Iterator it = this.f26878f.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                return stringBuilder.substring(0, Math.max(0, stringBuilder.length() - 1));
            }
            ci ciVar = (ci) it.next();
            if (!(ciVar == null || TextUtils.isEmpty(ciVar.f15922a))) {
                String str = ciVar.f15922a;
                switch (ciVar.f15923b) {
                    case 3:
                        break;
                    case 4:
                        i = 2;
                        break;
                    case 5:
                        i = 4;
                        break;
                    case 6:
                        i = 0;
                        break;
                    case 7:
                        i = 3;
                        break;
                    default:
                        i = 6;
                        break;
                }
                long j = ciVar.f15924c;
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 33);
                stringBuilder2.append(str);
                stringBuilder2.append(".");
                stringBuilder2.append(i);
                stringBuilder2.append(".");
                stringBuilder2.append(j);
                stringBuilder.append(String.valueOf(stringBuilder2.toString()).concat(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR));
            }
        }
    }

    /* renamed from: a */
    public final void mo6837a() {
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
        r21 = this;
        r11 = r21;
        r1 = r11.f26873a;
        r1 = r1.f15997c;
        r1 = r1.f15641a;
        r12 = r1.iterator();
    L_0x000c:
        r1 = r12.hasNext();
        if (r1 == 0) goto L_0x00db;
    L_0x0012:
        r1 = r12.next();
        r13 = r1;
        r13 = (com.google.android.gms.internal.ari) r13;
        r14 = r13.f15631j;
        r1 = r13.f15624c;
        r15 = r1.iterator();
    L_0x0021:
        r1 = r15.hasNext();
        if (r1 == 0) goto L_0x000c;
    L_0x0027:
        r1 = r15.next();
        r1 = (java.lang.String) r1;
        r2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x0040;
    L_0x0035:
        r2 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        r2 = r2.equals(r1);
        if (r2 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0040;
    L_0x003e:
        r9 = r1;
        goto L_0x004c;
    L_0x0040:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00ca }
        r1.<init>(r14);	 Catch:{ JSONException -> 0x00ca }
        r2 = "class_name";	 Catch:{ JSONException -> 0x00ca }
        r1 = r1.getString(r2);	 Catch:{ JSONException -> 0x00ca }
        goto L_0x003e;
    L_0x004c:
        r10 = r11.f26880h;
        monitor-enter(r10);
        r1 = r11.f26881i;	 Catch:{ all -> 0x00c2 }
        r7 = r1.m34571a(r9);	 Catch:{ all -> 0x00c2 }
        if (r7 == 0) goto L_0x0097;	 Catch:{ all -> 0x00c2 }
    L_0x0057:
        r1 = r7.m19582b();	 Catch:{ all -> 0x00c2 }
        if (r1 == 0) goto L_0x0097;	 Catch:{ all -> 0x00c2 }
    L_0x005d:
        r1 = r7.m19581a();	 Catch:{ all -> 0x00c2 }
        if (r1 != 0) goto L_0x0064;	 Catch:{ all -> 0x00c2 }
    L_0x0063:
        goto L_0x0097;	 Catch:{ all -> 0x00c2 }
    L_0x0064:
        r8 = new com.google.android.gms.internal.ce;	 Catch:{ all -> 0x00c2 }
        r2 = r11.f26874b;	 Catch:{ all -> 0x00c2 }
        r6 = r11.f26873a;	 Catch:{ all -> 0x00c2 }
        r4 = r11.f26882j;	 Catch:{ all -> 0x00c2 }
        r1 = r8;
        r3 = r9;
        r16 = r4;
        r4 = r14;
        r5 = r13;
        r18 = r12;
        r12 = r8;
        r8 = r11;
        r20 = r10;
        r19 = r14;
        r14 = r9;
        r9 = r16;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00c8 }
        r1 = r11.f26875c;	 Catch:{ all -> 0x00c8 }
        r2 = r12.zznd();	 Catch:{ all -> 0x00c8 }
        r2 = (com.google.android.gms.internal.zzakv) r2;	 Catch:{ all -> 0x00c8 }
        r1.add(r2);	 Catch:{ all -> 0x00c8 }
        r1 = r11.f26876d;	 Catch:{ all -> 0x00c8 }
        r1.add(r14);	 Catch:{ all -> 0x00c8 }
        r1 = r11.f26877e;	 Catch:{ all -> 0x00c8 }
        r1.put(r14, r12);	 Catch:{ all -> 0x00c8 }
    L_0x0095:
        monitor-exit(r20);	 Catch:{ all -> 0x00c8 }
        goto L_0x00d5;	 Catch:{ all -> 0x00c8 }
    L_0x0097:
        r20 = r10;	 Catch:{ all -> 0x00c8 }
        r18 = r12;	 Catch:{ all -> 0x00c8 }
        r19 = r14;	 Catch:{ all -> 0x00c8 }
        r14 = r9;	 Catch:{ all -> 0x00c8 }
        r1 = r11.f26878f;	 Catch:{ all -> 0x00c8 }
        r2 = new com.google.android.gms.internal.ck;	 Catch:{ all -> 0x00c8 }
        r2.<init>();	 Catch:{ all -> 0x00c8 }
        r3 = r13.f15625d;	 Catch:{ all -> 0x00c8 }
        r2 = r2.m19580b(r3);	 Catch:{ all -> 0x00c8 }
        r2 = r2.m19579a(r14);	 Catch:{ all -> 0x00c8 }
        r3 = 0;	 Catch:{ all -> 0x00c8 }
        r2 = r2.m19578a(r3);	 Catch:{ all -> 0x00c8 }
        r3 = 7;	 Catch:{ all -> 0x00c8 }
        r2 = r2.m19577a(r3);	 Catch:{ all -> 0x00c8 }
        r2 = r2.m19576a();	 Catch:{ all -> 0x00c8 }
        r1.add(r2);	 Catch:{ all -> 0x00c8 }
        goto L_0x0095;	 Catch:{ all -> 0x00c8 }
    L_0x00c2:
        r0 = move-exception;	 Catch:{ all -> 0x00c8 }
        r20 = r10;	 Catch:{ all -> 0x00c8 }
    L_0x00c5:
        r1 = r0;	 Catch:{ all -> 0x00c8 }
        monitor-exit(r20);	 Catch:{ all -> 0x00c8 }
        throw r1;
    L_0x00c8:
        r0 = move-exception;
        goto L_0x00c5;
    L_0x00ca:
        r0 = move-exception;
        r18 = r12;
        r19 = r14;
        r1 = r0;
        r2 = "Unable to determine custom event class name, skipping...";
        com.google.android.gms.internal.hx.m19912b(r2, r1);
    L_0x00d5:
        r12 = r18;
        r14 = r19;
        goto L_0x0021;
    L_0x00db:
        r1 = 0;
    L_0x00dc:
        r2 = r11.f26875c;
        r2 = r2.size();
        r3 = 0;
        if (r1 >= r2) goto L_0x01ef;
    L_0x00e5:
        r2 = r11.f26875c;	 Catch:{ InterruptedException -> 0x0194, Exception -> 0x0160 }
        r2 = r2.get(r1);	 Catch:{ InterruptedException -> 0x0194, Exception -> 0x0160 }
        r2 = (java.util.concurrent.Future) r2;	 Catch:{ InterruptedException -> 0x0194, Exception -> 0x0160 }
        r2.get();	 Catch:{ InterruptedException -> 0x0194, Exception -> 0x0160 }
        r2 = r11.f26880h;
        monitor-enter(r2);
        r4 = r11.f26876d;	 Catch:{ all -> 0x0159 }
        r4 = r4.get(r1);	 Catch:{ all -> 0x0159 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0159 }
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0159 }
        if (r5 != 0) goto L_0x0114;	 Catch:{ all -> 0x0159 }
    L_0x0101:
        r5 = r11.f26877e;	 Catch:{ all -> 0x0159 }
        r4 = r5.get(r4);	 Catch:{ all -> 0x0159 }
        r4 = (com.google.android.gms.internal.ce) r4;	 Catch:{ all -> 0x0159 }
        if (r4 == 0) goto L_0x0114;	 Catch:{ all -> 0x0159 }
    L_0x010b:
        r5 = r11.f26878f;	 Catch:{ all -> 0x0159 }
        r4 = r4.m31548c();	 Catch:{ all -> 0x0159 }
        r5.add(r4);	 Catch:{ all -> 0x0159 }
    L_0x0114:
        monitor-exit(r2);	 Catch:{ all -> 0x0159 }
        r4 = r11.f26880h;
        monitor-enter(r4);
        r2 = r11.f26879g;	 Catch:{ all -> 0x0155 }
        r5 = r11.f26876d;	 Catch:{ all -> 0x0155 }
        r5 = r5.get(r1);	 Catch:{ all -> 0x0155 }
        r2 = r2.contains(r5);	 Catch:{ all -> 0x0155 }
        if (r2 == 0) goto L_0x0153;	 Catch:{ all -> 0x0155 }
    L_0x0126:
        r2 = r11.f26876d;	 Catch:{ all -> 0x0155 }
        r1 = r2.get(r1);	 Catch:{ all -> 0x0155 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0155 }
        r2 = r11.f26877e;	 Catch:{ all -> 0x0155 }
        r2 = r2.get(r1);	 Catch:{ all -> 0x0155 }
        if (r2 == 0) goto L_0x0142;	 Catch:{ all -> 0x0155 }
    L_0x0136:
        r2 = r11.f26877e;	 Catch:{ all -> 0x0155 }
        r2 = r2.get(r1);	 Catch:{ all -> 0x0155 }
        r2 = (com.google.android.gms.internal.ce) r2;	 Catch:{ all -> 0x0155 }
        r3 = r2.m31549d();	 Catch:{ all -> 0x0155 }
    L_0x0142:
        r2 = -2;	 Catch:{ all -> 0x0155 }
        r1 = r11.m31553a(r2, r1, r3);	 Catch:{ all -> 0x0155 }
        r2 = com.google.android.gms.internal.hn.f16157a;	 Catch:{ all -> 0x0155 }
        r3 = new com.google.android.gms.internal.cn;	 Catch:{ all -> 0x0155 }
        r3.<init>(r11, r1);	 Catch:{ all -> 0x0155 }
        r2.post(r3);	 Catch:{ all -> 0x0155 }
        monitor-exit(r4);	 Catch:{ all -> 0x0155 }
        return;	 Catch:{ all -> 0x0155 }
    L_0x0153:
        monitor-exit(r4);	 Catch:{ all -> 0x0155 }
        goto L_0x018c;	 Catch:{ all -> 0x0155 }
    L_0x0155:
        r0 = move-exception;	 Catch:{ all -> 0x0155 }
        r1 = r0;	 Catch:{ all -> 0x0155 }
        monitor-exit(r4);	 Catch:{ all -> 0x0155 }
        throw r1;
    L_0x0159:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r2);	 Catch:{ all -> 0x0159 }
        throw r1;
    L_0x015d:
        r0 = move-exception;
        r2 = r0;
        goto L_0x01c5;
    L_0x0160:
        r0 = move-exception;
        r2 = r0;
        r3 = "Unable to resolve rewarded adapter.";	 Catch:{ all -> 0x015d }
        com.google.android.gms.internal.hx.m19914c(r3, r2);	 Catch:{ all -> 0x015d }
        r2 = r11.f26880h;
        monitor-enter(r2);
        r3 = r11.f26876d;	 Catch:{ all -> 0x0190 }
        r3 = r3.get(r1);	 Catch:{ all -> 0x0190 }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x0190 }
        r4 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x0190 }
        if (r4 != 0) goto L_0x018b;	 Catch:{ all -> 0x0190 }
    L_0x0178:
        r4 = r11.f26877e;	 Catch:{ all -> 0x0190 }
        r3 = r4.get(r3);	 Catch:{ all -> 0x0190 }
        r3 = (com.google.android.gms.internal.ce) r3;	 Catch:{ all -> 0x0190 }
        if (r3 == 0) goto L_0x018b;	 Catch:{ all -> 0x0190 }
    L_0x0182:
        r4 = r11.f26878f;	 Catch:{ all -> 0x0190 }
        r3 = r3.m31548c();	 Catch:{ all -> 0x0190 }
        r4.add(r3);	 Catch:{ all -> 0x0190 }
    L_0x018b:
        monitor-exit(r2);	 Catch:{ all -> 0x0190 }
    L_0x018c:
        r1 = r1 + 1;	 Catch:{ all -> 0x0190 }
        goto L_0x00dc;	 Catch:{ all -> 0x0190 }
    L_0x0190:
        r0 = move-exception;	 Catch:{ all -> 0x0190 }
        r1 = r0;	 Catch:{ all -> 0x0190 }
        monitor-exit(r2);	 Catch:{ all -> 0x0190 }
        throw r1;
    L_0x0194:
        r2 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x015d }
        r2.interrupt();	 Catch:{ all -> 0x015d }
        r2 = r11.f26880h;
        monitor-enter(r2);
        r4 = r11.f26876d;	 Catch:{ all -> 0x01c1 }
        r1 = r4.get(r1);	 Catch:{ all -> 0x01c1 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x01c1 }
        r4 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x01c1 }
        if (r4 != 0) goto L_0x01bf;	 Catch:{ all -> 0x01c1 }
    L_0x01ac:
        r4 = r11.f26877e;	 Catch:{ all -> 0x01c1 }
        r1 = r4.get(r1);	 Catch:{ all -> 0x01c1 }
        r1 = (com.google.android.gms.internal.ce) r1;	 Catch:{ all -> 0x01c1 }
        if (r1 == 0) goto L_0x01bf;	 Catch:{ all -> 0x01c1 }
    L_0x01b6:
        r4 = r11.f26878f;	 Catch:{ all -> 0x01c1 }
        r1 = r1.m31548c();	 Catch:{ all -> 0x01c1 }
        r4.add(r1);	 Catch:{ all -> 0x01c1 }
    L_0x01bf:
        monitor-exit(r2);	 Catch:{ all -> 0x01c1 }
        goto L_0x01ef;	 Catch:{ all -> 0x01c1 }
    L_0x01c1:
        r0 = move-exception;	 Catch:{ all -> 0x01c1 }
        r1 = r0;	 Catch:{ all -> 0x01c1 }
        monitor-exit(r2);	 Catch:{ all -> 0x01c1 }
        throw r1;
    L_0x01c5:
        r4 = r11.f26880h;
        monitor-enter(r4);
        r3 = r11.f26876d;	 Catch:{ all -> 0x01eb }
        r1 = r3.get(r1);	 Catch:{ all -> 0x01eb }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x01eb }
        r3 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x01eb }
        if (r3 != 0) goto L_0x01e9;	 Catch:{ all -> 0x01eb }
    L_0x01d6:
        r3 = r11.f26877e;	 Catch:{ all -> 0x01eb }
        r1 = r3.get(r1);	 Catch:{ all -> 0x01eb }
        r1 = (com.google.android.gms.internal.ce) r1;	 Catch:{ all -> 0x01eb }
        if (r1 == 0) goto L_0x01e9;	 Catch:{ all -> 0x01eb }
    L_0x01e0:
        r3 = r11.f26878f;	 Catch:{ all -> 0x01eb }
        r1 = r1.m31548c();	 Catch:{ all -> 0x01eb }
        r3.add(r1);	 Catch:{ all -> 0x01eb }
    L_0x01e9:
        monitor-exit(r4);	 Catch:{ all -> 0x01eb }
        throw r2;
    L_0x01eb:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r4);	 Catch:{ all -> 0x01eb }
        throw r1;
    L_0x01ef:
        r1 = 3;
        r1 = r11.m31553a(r1, r3, r3);
        r2 = com.google.android.gms.internal.hn.f16157a;
        r3 = new com.google.android.gms.internal.co;
        r3.<init>(r11, r1);
        r2.post(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cm.a():void");
    }

    /* renamed from: b */
    public final void mo6838b() {
    }

    public final void zza(String str, int i) {
    }

    public final void zzbr(String str) {
        synchronized (this.f26880h) {
            this.f26879g.add(str);
        }
    }
}
