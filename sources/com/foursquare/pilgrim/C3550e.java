package com.foursquare.pilgrim;

import android.content.Context;
import android.database.Cursor;
import com.foursquare.internal.data.db.C1916a;
import com.foursquare.internal.data.db.DatabaseUtil;
import com.foursquare.internal.util.C1942d;
import com.foursquare.internal.util.C1946h;
import com.foursquare.internal.util.FsLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.foursquare.pilgrim.e */
final class C3550e extends C1916a {
    /* renamed from: a */
    private static final String f10646a = "e";
    /* renamed from: b */
    private static final String[] f10647b = new String[]{"timestamp", "level"};

    /* renamed from: com.foursquare.pilgrim.e$a */
    private static class C1980a {
        /* renamed from: a */
        long f5385a;
        /* renamed from: b */
        float f5386b;

        C1980a(long j, float f) {
            this.f5385a = j;
            this.f5386b = f;
        }
    }

    public String getCreateTableSQL() {
        return "create table if not exists battery_watcher(timestamp integer, level real );";
    }

    public int getLastSchemaChangedVersion() {
        return 33;
    }

    public String getTableName() {
        return "battery_watcher";
    }

    C3550e() {
    }

    /* renamed from: a */
    private static void m13381a(long r3, float r5) {
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
        r0.beginTransaction();	 Catch:{ Exception -> 0x001f }
        r1 = "INSERT INTO battery_watcher (timestamp, level) VALUES (?, ?)";	 Catch:{ Exception -> 0x001f }
        r1 = r0.compileStatement(r1);	 Catch:{ Exception -> 0x001f }
        r2 = 1;	 Catch:{ Exception -> 0x001f }
        r1.bindLong(r2, r3);	 Catch:{ Exception -> 0x001f }
        r3 = 2;	 Catch:{ Exception -> 0x001f }
        r4 = (double) r5;	 Catch:{ Exception -> 0x001f }
        r1.bindDouble(r3, r4);	 Catch:{ Exception -> 0x001f }
        r1.execute();	 Catch:{ Exception -> 0x001f }
        r0.setTransactionSuccessful();	 Catch:{ Exception -> 0x001f }
        goto L_0x0026;
    L_0x001d:
        r3 = move-exception;
        goto L_0x002a;
    L_0x001f:
        r3 = f10646a;	 Catch:{ all -> 0x001d }
        r4 = "Issue adding location to battery history";	 Catch:{ all -> 0x001d }
        com.foursquare.internal.util.FsLog.m6807d(r3, r4);	 Catch:{ all -> 0x001d }
    L_0x0026:
        r0.endTransaction();
        return;
    L_0x002a:
        r0.endTransaction();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.e.a(long, float):void");
    }

    /* renamed from: a */
    static void m13382a(Context context) {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - bh.m7116b()) >= 10) {
            C3550e.m13381a(System.currentTimeMillis(), ((float) C1942d.m6822a(context)) / 100.0f);
            bh.m7117b(System.currentTimeMillis());
            C3550e.m13385d();
        }
    }

    /* renamed from: a */
    static String m13380a() {
        List c = C3550e.m13384c();
        StringBuilder stringBuilder = new StringBuilder(c.size() * 32);
        int i = 0;
        while (i < 72 && i < c.size()) {
            C1980a c1980a = (C1980a) c.get(i);
            stringBuilder.append(Long.toString(c1980a.f5385a));
            stringBuilder.append(',');
            stringBuilder.append(Float.toString(c1980a.f5386b));
            stringBuilder.append(';');
            i++;
        }
        return stringBuilder.toString();
    }

    /* renamed from: c */
    private static List<C1980a> m13384c() {
        Throwable th;
        Throwable th2;
        List arrayList = new ArrayList();
        Object obj = null;
        try {
            Object query = C1916a.getDatabase().query("battery_watcher", f10647b, null, null, null, null, "timestamp DESC");
            while (query.moveToNext()) {
                try {
                    arrayList.add(C3550e.m13379a((Cursor) query));
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
                FsLog.m6806c(f10646a, "Error getting battery history", th);
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
    static void m13383b() {
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
        r0 = com.foursquare.internal.data.db.C1916a.getDatabase();	 Catch:{ Exception -> 0x000a }
        r1 = "battery_watcher";	 Catch:{ Exception -> 0x000a }
        r2 = 0;	 Catch:{ Exception -> 0x000a }
        r0.delete(r1, r2, r2);	 Catch:{ Exception -> 0x000a }
    L_0x000a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.e.b():void");
    }

    /* renamed from: d */
    private static void m13385d() {
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
        r3 = 1;	 Catch:{ Exception -> 0x0024 }
        r2 = r2.toMillis(r3);	 Catch:{ Exception -> 0x0024 }
        r4 = 0;	 Catch:{ Exception -> 0x0024 }
        r4 = r0 - r2;	 Catch:{ Exception -> 0x0024 }
        r0 = com.foursquare.internal.data.db.C1916a.getDatabase();	 Catch:{ Exception -> 0x0024 }
        r1 = "battery_watcher";	 Catch:{ Exception -> 0x0024 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.e.d():void");
    }

    /* renamed from: a */
    private static C1980a m13379a(Cursor cursor) {
        return new C1980a(DatabaseUtil.m6665c(cursor, "timestamp"), DatabaseUtil.m6668f(cursor, "level"));
    }
}
