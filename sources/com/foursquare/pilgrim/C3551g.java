package com.foursquare.pilgrim;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.foursquare.internal.data.db.C1916a;
import com.foursquare.internal.data.db.DatabaseUtil;
import com.foursquare.internal.util.C1946h;
import com.foursquare.internal.util.FsLog;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: com.foursquare.pilgrim.g */
class C3551g extends C1916a {
    /* renamed from: a */
    private static final String[] f10648a = new String[]{"timestamp", "log_level", "location", "trigger", "motion", "notes"};

    public String getCreateTableSQL() {
        return "create table if not exists debug_logs(timestamp INTEGER,log_level INTEGER,location TEXT,trigger TEXT,motion TEXT,notes TEXT);";
    }

    public int getLastSchemaChangedVersion() {
        return 35;
    }

    public String getTableName() {
        return "debug_logs";
    }

    C3551g() {
    }

    /* renamed from: a */
    static void m13388a(@android.support.annotation.NonNull com.foursquare.pilgrim.PilgrimSdk.LogLevel r5, java.lang.String r6) {
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
        r0 = com.foursquare.internal.data.db.C1916a.getDatabase();
        r0.beginTransaction();	 Catch:{ Exception -> 0x0038 }
        r1 = "INSERT INTO debug_logs (timestamp, log_level, location, trigger, motion, notes) VALUES (?, ?, ?, ?, ?, ?)";	 Catch:{ Exception -> 0x0038 }
        r1 = r0.compileStatement(r1);	 Catch:{ Exception -> 0x0038 }
        r2 = 1;	 Catch:{ Exception -> 0x0038 }
        r3 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0038 }
        r1.bindLong(r2, r3);	 Catch:{ Exception -> 0x0038 }
        r2 = 2;	 Catch:{ Exception -> 0x0038 }
        r5 = r5.ordinal();	 Catch:{ Exception -> 0x0038 }
        r3 = (long) r5;	 Catch:{ Exception -> 0x0038 }
        r1.bindLong(r2, r3);	 Catch:{ Exception -> 0x0038 }
        r5 = 3;	 Catch:{ Exception -> 0x0038 }
        r2 = 0;	 Catch:{ Exception -> 0x0038 }
        com.foursquare.internal.data.db.DatabaseUtil.m6661a(r1, r5, r2);	 Catch:{ Exception -> 0x0038 }
        r5 = 4;	 Catch:{ Exception -> 0x0038 }
        com.foursquare.internal.data.db.DatabaseUtil.m6661a(r1, r5, r2);	 Catch:{ Exception -> 0x0038 }
        r5 = 5;	 Catch:{ Exception -> 0x0038 }
        com.foursquare.internal.data.db.DatabaseUtil.m6661a(r1, r5, r2);	 Catch:{ Exception -> 0x0038 }
        r5 = 6;	 Catch:{ Exception -> 0x0038 }
        com.foursquare.internal.data.db.DatabaseUtil.m6661a(r1, r5, r6);	 Catch:{ Exception -> 0x0038 }
        r1.execute();	 Catch:{ Exception -> 0x0038 }
        r0.setTransactionSuccessful();	 Catch:{ Exception -> 0x0038 }
        goto L_0x003f;
    L_0x0036:
        r5 = move-exception;
        goto L_0x0046;
    L_0x0038:
        r5 = "DebugLogTable";	 Catch:{ all -> 0x0036 }
        r6 = "Failed to add debug log";	 Catch:{ all -> 0x0036 }
        com.foursquare.internal.util.FsLog.m6807d(r5, r6);	 Catch:{ all -> 0x0036 }
    L_0x003f:
        r0.endTransaction();
        com.foursquare.pilgrim.C3551g.m13389b();
        return;
    L_0x0046:
        r0.endTransaction();
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.g.a(com.foursquare.pilgrim.PilgrimSdk$LogLevel, java.lang.String):void");
    }

    /* renamed from: b */
    private static void m13389b() {
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
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0024 }
        r2 = java.util.concurrent.TimeUnit.DAYS;	 Catch:{ Exception -> 0x0024 }
        r3 = 2;	 Catch:{ Exception -> 0x0024 }
        r2 = r2.toMillis(r3);	 Catch:{ Exception -> 0x0024 }
        r4 = 0;	 Catch:{ Exception -> 0x0024 }
        r4 = r0 - r2;	 Catch:{ Exception -> 0x0024 }
        r0 = com.foursquare.internal.data.db.C1916a.getDatabase();	 Catch:{ Exception -> 0x0024 }
        r1 = "debug_logs";	 Catch:{ Exception -> 0x0024 }
        r2 = "timestamp < ?";	 Catch:{ Exception -> 0x0024 }
        r3 = 1;	 Catch:{ Exception -> 0x0024 }
        r3 = new java.lang.String[r3];	 Catch:{ Exception -> 0x0024 }
        r6 = 0;	 Catch:{ Exception -> 0x0024 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ Exception -> 0x0024 }
        r3[r6] = r4;	 Catch:{ Exception -> 0x0024 }
        r0.delete(r1, r2, r3);	 Catch:{ Exception -> 0x0024 }
    L_0x0024:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.g.b():void");
    }

    @NonNull
    /* renamed from: a */
    static List<DebugLogItem> m13387a() {
        Throwable th;
        Throwable th2;
        List arrayList = new ArrayList();
        Object obj = null;
        try {
            Object query = C1916a.getDatabase().query("debug_logs", f10648a, null, null, null, null, "timestamp DESC", "3000");
            while (query.moveToNext()) {
                try {
                    arrayList.add(C3551g.m13386a(query));
                } catch (Throwable e) {
                    Object obj2 = query;
                    th = e;
                    obj = obj2;
                } catch (Throwable th3) {
                    th2 = th3;
                    obj = query;
                }
            }
            C1946h.m6836a(query);
        } catch (Exception e2) {
            th = e2;
            try {
                FsLog.m6806c("DebugLogTable", "Error getting logs", th);
                C1946h.m6836a(obj);
                return arrayList;
            } catch (Throwable th4) {
                th2 = th4;
                C1946h.m6836a(obj);
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static DebugLogItem m13386a(Cursor cursor) {
        return new DebugLogItem(DatabaseUtil.m6665c(cursor, "timestamp"), DatabaseUtil.m6659a(cursor, "notes"), LogLevel.values()[DatabaseUtil.m6666d(cursor, "log_level")], DatabaseUtil.m6659a(cursor, "location"), DatabaseUtil.m6659a(cursor, "trigger"), DatabaseUtil.m6659a(cursor, "motion"));
    }
}
