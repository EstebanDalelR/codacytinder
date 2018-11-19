package com.evernote.android.job;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.support.annotation.VisibleForTesting;
import com.evernote.android.job.util.C3142c;
import java.io.File;

/* renamed from: com.evernote.android.job.g */
final class C1144g implements DatabaseErrorHandler {
    /* renamed from: a */
    private static final C3142c f3010a = new C3142c("DatabaseErrorHandler");

    C1144g() {
    }

    public void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
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
        r3 = this;
        r0 = f3010a;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Corruption reported by sqlite on database: ";
        r1.append(r2);
        r2 = r4.getPath();
        r1.append(r2);
        r1 = r1.toString();
        r0.m12124d(r1);
        r0 = r4.isOpen();
        if (r0 != 0) goto L_0x0028;
    L_0x0020:
        r4 = r4.getPath();
        r3.m3872a(r4);
        return;
    L_0x0028:
        r0 = 0;
        r1 = r4.getAttachedDbs();	 Catch:{ SQLiteException -> 0x0031, all -> 0x002f }
        r0 = r1;
        goto L_0x0031;
    L_0x002f:
        r1 = move-exception;
        goto L_0x0035;
    L_0x0031:
        r4.close();	 Catch:{ SQLiteException -> 0x0057, all -> 0x002f }
        goto L_0x0057;
    L_0x0035:
        if (r0 == 0) goto L_0x004f;
    L_0x0037:
        r4 = r0.iterator();
    L_0x003b:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0056;
    L_0x0041:
        r0 = r4.next();
        r0 = (android.util.Pair) r0;
        r0 = r0.second;
        r0 = (java.lang.String) r0;
        r3.m3872a(r0);
        goto L_0x003b;
    L_0x004f:
        r4 = r4.getPath();
        r3.m3872a(r4);
    L_0x0056:
        throw r1;
    L_0x0057:
        if (r0 == 0) goto L_0x0071;
    L_0x0059:
        r4 = r0.iterator();
    L_0x005d:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0078;
    L_0x0063:
        r0 = r4.next();
        r0 = (android.util.Pair) r0;
        r0 = r0.second;
        r0 = (java.lang.String) r0;
        r3.m3872a(r0);
        goto L_0x005d;
    L_0x0071:
        r4 = r4.getPath();
        r3.m3872a(r4);
    L_0x0078:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.g.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }

    /* renamed from: a */
    void m3872a(String str) {
        if (!str.equalsIgnoreCase(":memory:")) {
            if (str.trim().length() != 0) {
                C3142c c3142c = f3010a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("deleting the database file: ");
                stringBuilder.append(str);
                c3142c.m12124d(stringBuilder.toString());
                try {
                    File file = new File(str);
                    if (VERSION.SDK_INT >= 16) {
                        m3871a(file);
                    } else {
                        m3870a(C1139e.m3819a().m3841f(), file);
                    }
                } catch (String str2) {
                    c3142c = f3010a;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("delete failed: ");
                    stringBuilder.append(str2.getMessage());
                    c3142c.m12118a(str2, stringBuilder.toString(), new Object[0]);
                }
            }
        }
    }

    @VisibleForTesting
    @TargetApi(16)
    /* renamed from: a */
    void m3871a(File file) {
        SQLiteDatabase.deleteDatabase(file);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m3870a(Context context, File file) {
        context.deleteDatabase(file.getName());
    }
}
