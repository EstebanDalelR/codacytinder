package com.foursquare.pilgrim;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.internal.data.db.C1916a;
import com.foursquare.internal.data.db.DatabaseUtil;
import com.foursquare.internal.util.C1946h;
import com.foursquare.internal.util.FsLog;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.List;

final class bc extends C1916a {
    /* renamed from: a */
    private static final String f10626a = "bc";
    /* renamed from: b */
    private static final String[] f10627b = new String[]{"timestamp", ManagerWebServices.PARAM_LAT, "lng", "acc"};

    public String getCreateTableSQL() {
        return "create table if not exists region_history(timestamp INTEGER,lat REAL,lng REAL,acc REAL);";
    }

    public int getLastSchemaChangedVersion() {
        return 26;
    }

    public String getTableName() {
        return "region_history";
    }

    bc() {
    }

    /* renamed from: a */
    static void m13344a(FoursquareLocation foursquareLocation) {
        SQLiteDatabase database = C1916a.getDatabase();
        try {
            database.beginTransaction();
            SQLiteStatement compileStatement = database.compileStatement("INSERT INTO region_history (timestamp, lat, lng, acc) VALUES (?, ?, ?, ?)");
            compileStatement.bindLong(1, foursquareLocation.getTime());
            compileStatement.bindDouble(2, foursquareLocation.getLat());
            compileStatement.bindDouble(3, foursquareLocation.getLng());
            compileStatement.bindDouble(4, (double) foursquareLocation.getAccuracy());
            compileStatement.execute();
            database.setTransactionSuccessful();
        } catch (FoursquareLocation foursquareLocation2) {
            PilgrimSdk.get().log(LogLevel.ERROR, "Issue adding location", foursquareLocation2);
        } catch (Throwable th) {
            database.endTransaction();
        }
        database.endTransaction();
    }

    /* renamed from: a */
    static long m13342a() {
        try {
            return DatabaseUtils.longForQuery(C1916a.getReadableDatabase(), "SELECT * FROM region_history ORDER BY timestamp DESC LIMIT 1;", null);
        } catch (Throwable e) {
            FsLog.m6806c(f10626a, "Error geting most recent timestamp", e);
            return 0;
        }
    }

    /* renamed from: b */
    static void m13345b() {
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
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0025 }
        r2 = java.util.concurrent.TimeUnit.DAYS;	 Catch:{ Exception -> 0x0025 }
        r3 = 90;	 Catch:{ Exception -> 0x0025 }
        r2 = r2.toMillis(r3);	 Catch:{ Exception -> 0x0025 }
        r4 = 0;	 Catch:{ Exception -> 0x0025 }
        r4 = r0 - r2;	 Catch:{ Exception -> 0x0025 }
        r0 = com.foursquare.internal.data.db.C1916a.getDatabase();	 Catch:{ Exception -> 0x0025 }
        r1 = "region_history";	 Catch:{ Exception -> 0x0025 }
        r2 = "timestamp < ?";	 Catch:{ Exception -> 0x0025 }
        r3 = 1;	 Catch:{ Exception -> 0x0025 }
        r3 = new java.lang.String[r3];	 Catch:{ Exception -> 0x0025 }
        r6 = 0;	 Catch:{ Exception -> 0x0025 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ Exception -> 0x0025 }
        r3[r6] = r4;	 Catch:{ Exception -> 0x0025 }
        r0.delete(r1, r2, r3);	 Catch:{ Exception -> 0x0025 }
        goto L_0x0030;
    L_0x0025:
        r0 = com.foursquare.pilgrim.PilgrimSdk.get();
        r1 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.ERROR;
        r2 = "Error deleting old region items";
        r0.log(r1, r2);
    L_0x0030:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.bc.b():void");
    }

    /* renamed from: c */
    static List<FoursquareLocation> m13346c() {
        Throwable th;
        Throwable th2;
        List arrayList = new ArrayList();
        Object obj = null;
        try {
            Object query = C1916a.getDatabase().query("region_history", f10627b, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(m13343a((Cursor) query));
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
                PilgrimSdk.get().log(LogLevel.ERROR, "Error loading history", th);
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
    private static FoursquareLocation m13343a(Cursor cursor) {
        Cursor cursor2 = cursor;
        return new FoursquareLocation(DatabaseUtil.m6667e(cursor2, ManagerWebServices.PARAM_LAT), DatabaseUtil.m6667e(cursor2, "lng"), DatabaseUtil.m6668f(cursor2, "acc"), true, -1.0d, false, 0.0f, null, DatabaseUtil.m6665c(cursor2, "timestamp"), 0);
    }
}
