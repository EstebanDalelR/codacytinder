package com.foursquare.pilgrim;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.internal.data.db.C1916a;
import com.foursquare.internal.data.db.DatabaseUtil;
import com.foursquare.internal.data.db.Migration;
import com.foursquare.internal.util.C1946h;
import com.foursquare.internal.util.FsLog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.foursquare.pilgrim.x */
class C3570x extends C1916a {
    /* renamed from: a */
    private static final String[] f10659a = new String[]{"arrival_timestamp", "arrival_lat", "arrival_lng", "arrival_acc", "arrival_wifi", "arrival_realtime_nanos", "departure_timestamp", "departure_lat", "departure_lng", "departure_acc", "departure_realtime_nanos"};

    /* renamed from: com.foursquare.pilgrim.x$1 */
    class C35691 implements Migration {
        /* renamed from: a */
        final /* synthetic */ C3570x f10658a;

        public int getDatabaseVersion() {
            return 37;
        }

        C35691(C3570x c3570x) {
            this.f10658a = c3570x;
        }

        public void apply(SQLiteDatabase sQLiteDatabase) {
            if (!DatabaseUtil.m6663a(sQLiteDatabase, "failed_visits", "arrival_realtime_nanos")) {
                sQLiteDatabase.execSQL("ALTER TABLE failed_visits ADD COLUMN arrival_realtime_nanos integer");
                sQLiteDatabase.execSQL("ALTER TABLE failed_visits ADD COLUMN departure_realtime_nanos integer");
            }
        }
    }

    public String getCreateTableSQL() {
        return "create table if not exists failed_visits(arrival_timestamp INTEGER,arrival_lat REAL,arrival_lng REAL,arrival_acc REAL,arrival_wifi TEXT,arrival_realtime_nanos INTEGER,departure_timestamp INTEGER,departure_lat REAL,departure_lng REAL,departure_acc REAL,departure_realtime_nanos INTEGER);";
    }

    public int getLastSchemaChangedVersion() {
        return 37;
    }

    public String getTableName() {
        return "failed_visits";
    }

    C3570x() {
    }

    public List<Migration> getMigrations() {
        C35691 c35691 = new C35691(this);
        List arrayList = new ArrayList();
        arrayList.add(c35691);
        return arrayList;
    }

    /* renamed from: a */
    static void m13421a(com.foursquare.pilgrim.CurrentPlace r5, com.foursquare.api.FoursquareLocation r6) {
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
        r0.beginTransaction();	 Catch:{ Exception -> 0x0084 }
        r1 = "INSERT INTO failed_visits (arrival_timestamp, arrival_lat, arrival_lng, arrival_acc, arrival_wifi, arrival_realtime_nanos, departure_timestamp, departure_lat, departure_lng, departure_acc, departure_realtime_nanos) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";	 Catch:{ Exception -> 0x0084 }
        r1 = r0.compileStatement(r1);	 Catch:{ Exception -> 0x0084 }
        r2 = 1;	 Catch:{ Exception -> 0x0084 }
        r3 = r5.getArrival();	 Catch:{ Exception -> 0x0084 }
        r1.bindLong(r2, r3);	 Catch:{ Exception -> 0x0084 }
        r2 = 2;	 Catch:{ Exception -> 0x0084 }
        r3 = r5.getLocation();	 Catch:{ Exception -> 0x0084 }
        r3 = r3.getLat();	 Catch:{ Exception -> 0x0084 }
        r1.bindDouble(r2, r3);	 Catch:{ Exception -> 0x0084 }
        r2 = 3;	 Catch:{ Exception -> 0x0084 }
        r3 = r5.getLocation();	 Catch:{ Exception -> 0x0084 }
        r3 = r3.getLng();	 Catch:{ Exception -> 0x0084 }
        r1.bindDouble(r2, r3);	 Catch:{ Exception -> 0x0084 }
        r2 = 4;	 Catch:{ Exception -> 0x0084 }
        r3 = r5.getLocation();	 Catch:{ Exception -> 0x0084 }
        r3 = r3.getAccuracy();	 Catch:{ Exception -> 0x0084 }
        r3 = (double) r3;	 Catch:{ Exception -> 0x0084 }
        r1.bindDouble(r2, r3);	 Catch:{ Exception -> 0x0084 }
        r2 = 5;	 Catch:{ Exception -> 0x0084 }
        r3 = r5.m6857a();	 Catch:{ Exception -> 0x0084 }
        com.foursquare.internal.data.db.DatabaseUtil.m6661a(r1, r2, r3);	 Catch:{ Exception -> 0x0084 }
        r2 = 6;	 Catch:{ Exception -> 0x0084 }
        r3 = r5.getLocation();	 Catch:{ Exception -> 0x0084 }
        r3 = r3.getElapsedRealtimeNanos();	 Catch:{ Exception -> 0x0084 }
        r1.bindLong(r2, r3);	 Catch:{ Exception -> 0x0084 }
        r2 = 7;	 Catch:{ Exception -> 0x0084 }
        r3 = r5.getDeparture();	 Catch:{ Exception -> 0x0084 }
        r1.bindLong(r2, r3);	 Catch:{ Exception -> 0x0084 }
        r5 = 8;	 Catch:{ Exception -> 0x0084 }
        r2 = r6.getLat();	 Catch:{ Exception -> 0x0084 }
        r1.bindDouble(r5, r2);	 Catch:{ Exception -> 0x0084 }
        r5 = 9;	 Catch:{ Exception -> 0x0084 }
        r2 = r6.getLng();	 Catch:{ Exception -> 0x0084 }
        r1.bindDouble(r5, r2);	 Catch:{ Exception -> 0x0084 }
        r5 = 10;	 Catch:{ Exception -> 0x0084 }
        r2 = r6.getAccuracy();	 Catch:{ Exception -> 0x0084 }
        r2 = (double) r2;	 Catch:{ Exception -> 0x0084 }
        r1.bindDouble(r5, r2);	 Catch:{ Exception -> 0x0084 }
        r5 = 11;	 Catch:{ Exception -> 0x0084 }
        r2 = r6.getElapsedRealtimeNanos();	 Catch:{ Exception -> 0x0084 }
        r1.bindLong(r5, r2);	 Catch:{ Exception -> 0x0084 }
        r1.execute();	 Catch:{ Exception -> 0x0084 }
        r0.setTransactionSuccessful();	 Catch:{ Exception -> 0x0084 }
        goto L_0x008b;
    L_0x0082:
        r5 = move-exception;
        goto L_0x008f;
    L_0x0084:
        r5 = "FailedVisitsTable";	 Catch:{ all -> 0x0082 }
        r6 = "Failed to add visit";	 Catch:{ all -> 0x0082 }
        com.foursquare.internal.util.FsLog.m6807d(r5, r6);	 Catch:{ all -> 0x0082 }
    L_0x008b:
        r0.endTransaction();
        return;
    L_0x008f:
        r0.endTransaction();
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.x.a(com.foursquare.pilgrim.CurrentPlace, com.foursquare.api.FoursquareLocation):void");
    }

    /* renamed from: a */
    static void m13420a(long r5) {
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
        r0 = com.foursquare.internal.data.db.C1916a.getDatabase();	 Catch:{ Exception -> 0x0015 }
        r1 = "failed_visits";	 Catch:{ Exception -> 0x0015 }
        r2 = "arrival_timestamp = ?";	 Catch:{ Exception -> 0x0015 }
        r3 = 1;	 Catch:{ Exception -> 0x0015 }
        r3 = new java.lang.String[r3];	 Catch:{ Exception -> 0x0015 }
        r4 = 0;	 Catch:{ Exception -> 0x0015 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ Exception -> 0x0015 }
        r3[r4] = r5;	 Catch:{ Exception -> 0x0015 }
        r0.delete(r1, r2, r3);	 Catch:{ Exception -> 0x0015 }
    L_0x0015:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.x.a(long):void");
    }

    /* renamed from: a */
    static List<Pair<CurrentPlace, FoursquareLocation>> m13419a() {
        Throwable th;
        Throwable th2;
        List arrayList = new ArrayList();
        Object obj = null;
        try {
            Object query = C1916a.getDatabase().query("failed_visits", f10659a, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(C3570x.m13418a((Cursor) query));
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
                FsLog.m6806c("FailedVisitsTable", "Error getting history", th);
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

    /* renamed from: b */
    static void m13422b() {
        C1916a.getDatabase().delete("failed_visits", null, null);
    }

    /* renamed from: a */
    private static Pair<CurrentPlace, FoursquareLocation> m13418a(Cursor cursor) {
        Cursor cursor2 = cursor;
        double e = DatabaseUtil.m6667e(cursor2, "arrival_lat");
        double e2 = DatabaseUtil.m6667e(cursor2, "arrival_lng");
        float f = DatabaseUtil.m6668f(cursor2, "arrival_acc");
        long c = DatabaseUtil.m6665c(cursor2, "arrival_timestamp");
        String a = DatabaseUtil.m6659a(cursor2, "arrival_wifi");
        long c2 = DatabaseUtil.m6665c(cursor2, "arrival_realtime_nanos");
        double e3 = DatabaseUtil.m6667e(cursor2, "departure_lat");
        double e4 = DatabaseUtil.m6667e(cursor2, "departure_lng");
        float f2 = DatabaseUtil.m6668f(cursor2, "departure_acc");
        long c3 = DatabaseUtil.m6665c(cursor2, "departure_timestamp");
        long c4 = DatabaseUtil.m6665c(cursor2, "departure_realtime_nanos");
        long j = c3;
        FoursquareLocation foursquareLocation = new FoursquareLocation(e, e2, f, true, -1.0d, false, 0.0f, null, c, c2);
        FoursquareLocation foursquareLocation2 = new FoursquareLocation(e3, e4, f2, true, -1.0d, false, 0.0f, null, j, c4);
        CurrentPlace currentPlace = new CurrentPlace(null, RegionType.NONE, foursquareLocation.getTime(), Confidence.NONE, null, foursquareLocation, a, null, false);
        currentPlace.m6858a(j);
        return new Pair(currentPlace, foursquareLocation2);
    }
}
