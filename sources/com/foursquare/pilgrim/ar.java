package com.foursquare.pilgrim;

import android.database.Cursor;
import android.support.annotation.NonNull;
import com.foursquare.api.PilgrimException;
import com.foursquare.api.types.PilgrimEvent;
import com.foursquare.api.types.PilgrimEvent.Builder;
import com.foursquare.api.types.PilgrimEvent.EventLevel;
import com.foursquare.internal.data.db.C1916a;
import com.foursquare.internal.data.db.DatabaseUtil;
import com.foursquare.internal.data.db.DatabaseUtil.RowMapper;
import com.foursquare.internal.data.db.Migration;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.List;

class ar extends C1916a {
    /* renamed from: a */
    private static final String[] f10616a = new String[]{"event_timestamp", "event_type", "event_level", "event_msg", "event_exceptions"};
    /* renamed from: b */
    private static final RowMapper<PilgrimEvent> f10617b = new C35312();

    /* renamed from: com.foursquare.pilgrim.ar$1 */
    class C35301 extends TypeToken<List<PilgrimException>> {
        C35301() {
        }
    }

    /* renamed from: com.foursquare.pilgrim.ar$2 */
    class C35312 implements RowMapper<PilgrimEvent> {
        C35312() {
        }

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m13320a(cursor);
        }

        @NonNull
        /* renamed from: a */
        public PilgrimEvent m13320a(@NonNull Cursor cursor) {
            long c = DatabaseUtil.m6665c(cursor, "event_timestamp");
            DatabaseUtil.m6659a(cursor, "event_type");
            String a = DatabaseUtil.m6659a(cursor, "event_level");
            return new Builder().timestamp(c).level(EventLevel.fromString(a)).message(DatabaseUtil.m6659a(cursor, "event_msg")).pilgrimExceptions(ar.m13325b(DatabaseUtil.m6659a(cursor, "event_exceptions"))).build();
        }
    }

    /* renamed from: com.foursquare.pilgrim.ar$3 */
    class C35323 extends TypeToken<List<PilgrimException>> {
        C35323() {
        }
    }

    public String getCreateTableSQL() {
        return "create table if not exists pilgrim_events(event_timestamp  INTEGER,event_type TEXT,event_level TEXT,event_msg TEXT,event_exceptions TEXT);";
    }

    public int getLastSchemaChangedVersion() {
        return 41;
    }

    public String getTableName() {
        return "pilgrim_events";
    }

    ar() {
    }

    public List<Migration> getMigrations() {
        return Collections.EMPTY_LIST;
    }

    /* renamed from: a */
    static void m13323a(com.foursquare.api.types.PilgrimEvent r5) {
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
        r0.beginTransaction();	 Catch:{ Exception -> 0x004f }
        r1 = "INSERT INTO pilgrim_events (event_timestamp, event_type, event_level, event_msg, event_exceptions) VALUES (?, ?, ?, ?, ?)";	 Catch:{ Exception -> 0x004f }
        r1 = r0.compileStatement(r1);	 Catch:{ Exception -> 0x004f }
        r2 = 1;	 Catch:{ Exception -> 0x004f }
        r3 = r5.getTimestamp();	 Catch:{ Exception -> 0x004f }
        r1.bindLong(r2, r3);	 Catch:{ Exception -> 0x004f }
        r2 = 2;	 Catch:{ Exception -> 0x004f }
        r3 = r5.getEventType();	 Catch:{ Exception -> 0x004f }
        r3 = r3.toString();	 Catch:{ Exception -> 0x004f }
        com.foursquare.internal.data.db.DatabaseUtil.m6661a(r1, r2, r3);	 Catch:{ Exception -> 0x004f }
        r2 = 3;	 Catch:{ Exception -> 0x004f }
        r3 = r5.getLevel();	 Catch:{ Exception -> 0x004f }
        r3 = r3.toString();	 Catch:{ Exception -> 0x004f }
        com.foursquare.internal.data.db.DatabaseUtil.m6661a(r1, r2, r3);	 Catch:{ Exception -> 0x004f }
        r2 = 4;	 Catch:{ Exception -> 0x004f }
        r3 = r5.getMessage();	 Catch:{ Exception -> 0x004f }
        com.foursquare.internal.data.db.DatabaseUtil.m6661a(r1, r2, r3);	 Catch:{ Exception -> 0x004f }
        r2 = 5;	 Catch:{ Exception -> 0x004f }
        r5 = r5.getPilgrimExceptions();	 Catch:{ Exception -> 0x004f }
        r3 = new com.foursquare.pilgrim.ar$1;	 Catch:{ Exception -> 0x004f }
        r3.<init>();	 Catch:{ Exception -> 0x004f }
        r5 = com.foursquare.internal.api.C1913a.m6653a(r5, r3);	 Catch:{ Exception -> 0x004f }
        com.foursquare.internal.data.db.DatabaseUtil.m6661a(r1, r2, r5);	 Catch:{ Exception -> 0x004f }
        r1.execute();	 Catch:{ Exception -> 0x004f }
        r0.setTransactionSuccessful();	 Catch:{ Exception -> 0x004f }
        goto L_0x0056;
    L_0x004d:
        r5 = move-exception;
        goto L_0x005a;
    L_0x004f:
        r5 = "PilgrimEventsTable";	 Catch:{ all -> 0x004d }
        r1 = "Failed to add pilgrim event";	 Catch:{ all -> 0x004d }
        com.foursquare.internal.util.FsLog.m6807d(r5, r1);	 Catch:{ all -> 0x004d }
    L_0x0056:
        r0.endTransaction();
        return;
    L_0x005a:
        r0.endTransaction();
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.ar.a(com.foursquare.api.types.PilgrimEvent):void");
    }

    @NonNull
    /* renamed from: a */
    static List<PilgrimEvent> m13321a() {
        return DatabaseUtil.m6660a(C1916a.getReadableDatabase().query("pilgrim_events", f10616a, null, null, null, null, null, String.valueOf(25)), f10617b);
    }

    @android.support.annotation.NonNull
    /* renamed from: b */
    private static java.util.List<com.foursquare.api.PilgrimException> m13325b(@android.support.annotation.NonNull java.lang.String r1) {
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
        r0 = new com.foursquare.pilgrim.ar$3;	 Catch:{ JsonParseException -> 0x000c }
        r0.<init>();	 Catch:{ JsonParseException -> 0x000c }
        r1 = com.foursquare.internal.api.C1913a.m6649a(r1, r0);	 Catch:{ JsonParseException -> 0x000c }
        r1 = (java.util.List) r1;	 Catch:{ JsonParseException -> 0x000c }
        return r1;
    L_0x000c:
        r1 = java.util.Collections.emptyList();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.ar.b(java.lang.String):java.util.List<com.foursquare.api.PilgrimException>");
    }

    /* renamed from: b */
    static void m13326b() {
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
        r0 = com.foursquare.internal.data.db.C1916a.getDatabase();	 Catch:{ Exception -> 0x0009 }
        r1 = "DELETE FROM pilgrim_events WHERE event_timestamp NOT IN (SELECT event_timestamp FROM pilgrim_events ORDER BY event_timestamp DESC LIMIT 25);";	 Catch:{ Exception -> 0x0009 }
        r0.execSQL(r1);	 Catch:{ Exception -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.ar.b():void");
    }

    /* renamed from: c */
    static void m13327c() {
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
        r3 = 3;	 Catch:{ Exception -> 0x0024 }
        r2 = r2.toMillis(r3);	 Catch:{ Exception -> 0x0024 }
        r4 = 0;	 Catch:{ Exception -> 0x0024 }
        r4 = r0 - r2;	 Catch:{ Exception -> 0x0024 }
        r0 = com.foursquare.internal.data.db.C1916a.getDatabase();	 Catch:{ Exception -> 0x0024 }
        r1 = "pilgrim_events";	 Catch:{ Exception -> 0x0024 }
        r2 = "event_timestamp <= ?";	 Catch:{ Exception -> 0x0024 }
        r3 = 1;	 Catch:{ Exception -> 0x0024 }
        r3 = new java.lang.String[r3];	 Catch:{ Exception -> 0x0024 }
        r6 = 0;	 Catch:{ Exception -> 0x0024 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ Exception -> 0x0024 }
        r3[r6] = r4;	 Catch:{ Exception -> 0x0024 }
        r0.delete(r1, r2, r3);	 Catch:{ Exception -> 0x0024 }
    L_0x0024:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.ar.c():void");
    }

    /* renamed from: a */
    static void m13324a(java.util.List<java.lang.Long> r4) {
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
        r0 = com.foursquare.internal.util.CollectionUtils.m6792a(r4);
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = ",";	 Catch:{ Exception -> 0x0020 }
        r4 = android.text.TextUtils.join(r0, r4);	 Catch:{ Exception -> 0x0020 }
        r0 = com.foursquare.internal.data.db.C1916a.getDatabase();	 Catch:{ Exception -> 0x0020 }
        r1 = "DELETE FROM pilgrim_events WHERE event_timestamp IN (%s);";	 Catch:{ Exception -> 0x0020 }
        r2 = 1;	 Catch:{ Exception -> 0x0020 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0020 }
        r3 = 0;	 Catch:{ Exception -> 0x0020 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x0020 }
        r4 = java.lang.String.format(r1, r2);	 Catch:{ Exception -> 0x0020 }
        r0.execSQL(r4);	 Catch:{ Exception -> 0x0020 }
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.ar.a(java.util.List):void");
    }
}
