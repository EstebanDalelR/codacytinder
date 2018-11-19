package com.google.android.m4b.maps.aw;

import android.content.Context;
import android.util.Log;

/* renamed from: com.google.android.m4b.maps.aw.d */
public class C4698d {
    /* renamed from: a */
    private static final String f17282a = "d";
    /* renamed from: b */
    private final Context f17283b;

    C4698d(Context context) {
        this.f17283b = context;
    }

    /* renamed from: a */
    final synchronized void m20892a(java.lang.String r4, java.lang.String r5, long r6) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.google.android.m4b.maps.aw.d.a(java.lang.String, java.lang.String, long):void. bs: [B:9:0x001b, B:23:0x0043]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
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
        r3 = this;
        monitor-enter(r3);
        com.google.android.m4b.maps.p125y.C5571j.m24292a(r5);	 Catch:{ all -> 0x00d4 }
        r0 = r3.f17283b;	 Catch:{ FileNotFoundException -> 0x00b2 }
        r1 = "_m_t";	 Catch:{ FileNotFoundException -> 0x00b2 }
        r2 = 0;	 Catch:{ FileNotFoundException -> 0x00b2 }
        r0 = r0.openFileOutput(r1, r2);	 Catch:{ FileNotFoundException -> 0x00b2 }
        r1 = new java.io.DataOutputStream;	 Catch:{ all -> 0x00d4 }
        r1.<init>(r0);	 Catch:{ all -> 0x00d4 }
        r1.writeLong(r6);	 Catch:{ IOException -> 0x0042 }
        r1.writeUTF(r5);	 Catch:{ IOException -> 0x0042 }
        r1.writeUTF(r4);	 Catch:{ IOException -> 0x0042 }
        r1.close();	 Catch:{ IOException -> 0x001f }
        goto L_0x0084;
    L_0x001f:
        r4 = move-exception;
        r5 = f17282a;	 Catch:{ all -> 0x00d4 }
        r6 = "Error closing token file: ";	 Catch:{ all -> 0x00d4 }
        r4 = r4.getMessage();	 Catch:{ all -> 0x00d4 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x00d4 }
        r7 = r4.length();	 Catch:{ all -> 0x00d4 }
        if (r7 == 0) goto L_0x0037;	 Catch:{ all -> 0x00d4 }
    L_0x0032:
        r4 = r6.concat(r4);	 Catch:{ all -> 0x00d4 }
        goto L_0x003c;	 Catch:{ all -> 0x00d4 }
    L_0x0037:
        r4 = new java.lang.String;	 Catch:{ all -> 0x00d4 }
        r4.<init>(r6);	 Catch:{ all -> 0x00d4 }
    L_0x003c:
        android.util.Log.w(r5, r4);	 Catch:{ all -> 0x00d4 }
        goto L_0x0084;
    L_0x0040:
        r4 = move-exception;
        goto L_0x008d;
    L_0x0042:
        r4 = move-exception;
        r5 = f17282a;	 Catch:{ all -> 0x0040 }
        r6 = "Error writing token file: ";	 Catch:{ all -> 0x0040 }
        r4 = r4.getMessage();	 Catch:{ all -> 0x0040 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x0040 }
        r7 = r4.length();	 Catch:{ all -> 0x0040 }
        if (r7 == 0) goto L_0x005a;	 Catch:{ all -> 0x0040 }
    L_0x0055:
        r4 = r6.concat(r4);	 Catch:{ all -> 0x0040 }
        goto L_0x005f;	 Catch:{ all -> 0x0040 }
    L_0x005a:
        r4 = new java.lang.String;	 Catch:{ all -> 0x0040 }
        r4.<init>(r6);	 Catch:{ all -> 0x0040 }
    L_0x005f:
        android.util.Log.w(r5, r4);	 Catch:{ all -> 0x0040 }
        r1.close();	 Catch:{ IOException -> 0x0066 }
        goto L_0x0084;
    L_0x0066:
        r4 = move-exception;
        r5 = f17282a;	 Catch:{ all -> 0x00d4 }
        r6 = "Error closing token file: ";	 Catch:{ all -> 0x00d4 }
        r4 = r4.getMessage();	 Catch:{ all -> 0x00d4 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x00d4 }
        r7 = r4.length();	 Catch:{ all -> 0x00d4 }
        if (r7 == 0) goto L_0x007e;	 Catch:{ all -> 0x00d4 }
    L_0x0079:
        r4 = r6.concat(r4);	 Catch:{ all -> 0x00d4 }
        goto L_0x003c;	 Catch:{ all -> 0x00d4 }
    L_0x007e:
        r4 = new java.lang.String;	 Catch:{ all -> 0x00d4 }
        r4.<init>(r6);	 Catch:{ all -> 0x00d4 }
        goto L_0x003c;	 Catch:{ all -> 0x00d4 }
    L_0x0084:
        r4 = f17282a;	 Catch:{ all -> 0x00d4 }
        r5 = "Saved auth token";	 Catch:{ all -> 0x00d4 }
        android.util.Log.i(r4, r5);	 Catch:{ all -> 0x00d4 }
        monitor-exit(r3);
        return;
    L_0x008d:
        r1.close();	 Catch:{ IOException -> 0x0091 }
        goto L_0x00b1;
    L_0x0091:
        r5 = move-exception;
        r6 = f17282a;	 Catch:{ all -> 0x00d4 }
        r7 = "Error closing token file: ";	 Catch:{ all -> 0x00d4 }
        r5 = r5.getMessage();	 Catch:{ all -> 0x00d4 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x00d4 }
        r0 = r5.length();	 Catch:{ all -> 0x00d4 }
        if (r0 == 0) goto L_0x00a9;	 Catch:{ all -> 0x00d4 }
    L_0x00a4:
        r5 = r7.concat(r5);	 Catch:{ all -> 0x00d4 }
        goto L_0x00ae;	 Catch:{ all -> 0x00d4 }
    L_0x00a9:
        r5 = new java.lang.String;	 Catch:{ all -> 0x00d4 }
        r5.<init>(r7);	 Catch:{ all -> 0x00d4 }
    L_0x00ae:
        android.util.Log.w(r6, r5);	 Catch:{ all -> 0x00d4 }
    L_0x00b1:
        throw r4;	 Catch:{ all -> 0x00d4 }
    L_0x00b2:
        r4 = move-exception;	 Catch:{ all -> 0x00d4 }
        r5 = f17282a;	 Catch:{ all -> 0x00d4 }
        r6 = "Error opening token file: ";	 Catch:{ all -> 0x00d4 }
        r4 = r4.getMessage();	 Catch:{ all -> 0x00d4 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x00d4 }
        r7 = r4.length();	 Catch:{ all -> 0x00d4 }
        if (r7 == 0) goto L_0x00ca;	 Catch:{ all -> 0x00d4 }
    L_0x00c5:
        r4 = r6.concat(r4);	 Catch:{ all -> 0x00d4 }
        goto L_0x00cf;	 Catch:{ all -> 0x00d4 }
    L_0x00ca:
        r4 = new java.lang.String;	 Catch:{ all -> 0x00d4 }
        r4.<init>(r6);	 Catch:{ all -> 0x00d4 }
    L_0x00cf:
        android.util.Log.w(r5, r4);	 Catch:{ all -> 0x00d4 }
        monitor-exit(r3);
        return;
    L_0x00d4:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aw.d.a(java.lang.String, java.lang.String, long):void");
    }

    /* renamed from: a */
    final synchronized com.google.android.m4b.maps.aw.C4695a m20890a(java.lang.String r3) {
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
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f17283b;	 Catch:{ FileNotFoundException -> 0x0012 }
        r1 = "_m_t";	 Catch:{ FileNotFoundException -> 0x0012 }
        r0 = r0.openFileInput(r1);	 Catch:{ FileNotFoundException -> 0x0012 }
        r3 = com.google.android.m4b.maps.aw.C4698d.m20889a(r0, r3);	 Catch:{ all -> 0x000f }
        monitor-exit(r2);
        return r3;
    L_0x000f:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
    L_0x0012:
        r3 = 0;
        monitor-exit(r2);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aw.d.a(java.lang.String):com.google.android.m4b.maps.aw.a");
    }

    /* renamed from: a */
    private static com.google.android.m4b.maps.aw.C4695a m20889a(java.io.FileInputStream r5, java.lang.String r6) {
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
        r0 = new java.io.DataInputStream;
        r0.<init>(r5);
        r5 = 0;
        r1 = r0.readLong();	 Catch:{ IOException -> 0x0077 }
        r3 = r0.readUTF();	 Catch:{ IOException -> 0x0077 }
        r4 = r0.readUTF();	 Catch:{ EOFException -> 0x0044 }
        r6 = r6.equals(r4);	 Catch:{ EOFException -> 0x0044 }
        if (r6 != 0) goto L_0x004b;	 Catch:{ EOFException -> 0x0044 }
    L_0x0018:
        r6 = f17282a;	 Catch:{ EOFException -> 0x0044 }
        r4 = "New API Key detected, fetching a new token.";	 Catch:{ EOFException -> 0x0044 }
        android.util.Log.i(r6, r4);	 Catch:{ EOFException -> 0x0044 }
        r0.close();	 Catch:{ IOException -> 0x0023 }
        goto L_0x0043;
    L_0x0023:
        r6 = move-exception;
        r0 = f17282a;
        r1 = "Error closing token file: ";
        r6 = r6.getMessage();
        r6 = java.lang.String.valueOf(r6);
        r2 = r6.length();
        if (r2 == 0) goto L_0x003b;
    L_0x0036:
        r6 = r1.concat(r6);
        goto L_0x0040;
    L_0x003b:
        r6 = new java.lang.String;
        r6.<init>(r1);
    L_0x0040:
        android.util.Log.w(r0, r6);
    L_0x0043:
        return r5;
    L_0x0044:
        r6 = f17282a;	 Catch:{ IOException -> 0x0077 }
        r4 = "The API Key is not stored with the token";	 Catch:{ IOException -> 0x0077 }
        android.util.Log.i(r6, r4);	 Catch:{ IOException -> 0x0077 }
    L_0x004b:
        r6 = new com.google.android.m4b.maps.aw.a;	 Catch:{ IOException -> 0x0077 }
        r6.<init>(r3, r1);	 Catch:{ IOException -> 0x0077 }
        r0.close();	 Catch:{ IOException -> 0x0054 }
        goto L_0x0074;
    L_0x0054:
        r5 = move-exception;
        r0 = f17282a;
        r1 = "Error closing token file: ";
        r5 = r5.getMessage();
        r5 = java.lang.String.valueOf(r5);
        r2 = r5.length();
        if (r2 == 0) goto L_0x006c;
    L_0x0067:
        r5 = r1.concat(r5);
        goto L_0x0071;
    L_0x006c:
        r5 = new java.lang.String;
        r5.<init>(r1);
    L_0x0071:
        android.util.Log.w(r0, r5);
    L_0x0074:
        return r6;
    L_0x0075:
        r5 = move-exception;
        goto L_0x00bc;
    L_0x0077:
        r6 = move-exception;
        r1 = f17282a;	 Catch:{ all -> 0x0075 }
        r2 = "Error reading token file: ";	 Catch:{ all -> 0x0075 }
        r6 = r6.getMessage();	 Catch:{ all -> 0x0075 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0075 }
        r3 = r6.length();	 Catch:{ all -> 0x0075 }
        if (r3 == 0) goto L_0x008f;	 Catch:{ all -> 0x0075 }
    L_0x008a:
        r6 = r2.concat(r6);	 Catch:{ all -> 0x0075 }
        goto L_0x0094;	 Catch:{ all -> 0x0075 }
    L_0x008f:
        r6 = new java.lang.String;	 Catch:{ all -> 0x0075 }
        r6.<init>(r2);	 Catch:{ all -> 0x0075 }
    L_0x0094:
        android.util.Log.w(r1, r6);	 Catch:{ all -> 0x0075 }
        r0.close();	 Catch:{ IOException -> 0x009b }
        goto L_0x00bb;
    L_0x009b:
        r6 = move-exception;
        r0 = f17282a;
        r1 = "Error closing token file: ";
        r6 = r6.getMessage();
        r6 = java.lang.String.valueOf(r6);
        r2 = r6.length();
        if (r2 == 0) goto L_0x00b3;
    L_0x00ae:
        r6 = r1.concat(r6);
        goto L_0x00b8;
    L_0x00b3:
        r6 = new java.lang.String;
        r6.<init>(r1);
    L_0x00b8:
        android.util.Log.w(r0, r6);
    L_0x00bb:
        return r5;
    L_0x00bc:
        r0.close();	 Catch:{ IOException -> 0x00c0 }
        goto L_0x00e0;
    L_0x00c0:
        r6 = move-exception;
        r0 = f17282a;
        r1 = "Error closing token file: ";
        r6 = r6.getMessage();
        r6 = java.lang.String.valueOf(r6);
        r2 = r6.length();
        if (r2 == 0) goto L_0x00d8;
    L_0x00d3:
        r6 = r1.concat(r6);
        goto L_0x00dd;
    L_0x00d8:
        r6 = new java.lang.String;
        r6.<init>(r1);
    L_0x00dd:
        android.util.Log.w(r0, r6);
    L_0x00e0:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aw.d.a(java.io.FileInputStream, java.lang.String):com.google.android.m4b.maps.aw.a");
    }

    /* renamed from: a */
    final synchronized void m20891a() {
        if (this.f17283b.deleteFile("_m_t")) {
            Log.i(f17282a, "Deleted saved auth token");
        } else {
            Log.e(f17282a, "Error while trying to delete the auth token");
        }
    }
}
