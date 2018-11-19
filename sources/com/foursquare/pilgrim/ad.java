package com.foursquare.pilgrim;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.types.GoogleMotionReading;
import com.foursquare.internal.api.C1913a;
import com.foursquare.internal.data.db.C1916a;
import com.foursquare.internal.data.db.DatabaseUtil;
import com.foursquare.internal.data.db.DatabaseUtil.RowMapper;
import com.foursquare.internal.data.db.Migration;
import com.foursquare.internal.util.FsLog;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;
import com.google.gson.reflect.TypeToken;
import com.tinder.api.ManagerWebServices;
import java.util.Arrays;
import java.util.List;

final class ad extends C1916a {
    /* renamed from: a */
    private static final String f10607a = "ad";
    /* renamed from: b */
    private static final String[] f10608b = new String[]{ManagerWebServices.PARAM_LAT, "lng", "hacc", "timestamp", "trigger", "wifi", "motionTimestamp", "motionType", "elapsedRealtimeNanos", "used", "wakeupSource", "speed", "heading"};
    /* renamed from: c */
    private static final RowMapper<ac> f10609c = new C35185();

    /* renamed from: com.foursquare.pilgrim.ad$a */
    static class C1963a {
        @Nullable
        /* renamed from: a */
        String f5280a = null;
        @Nullable
        /* renamed from: b */
        String f5281b = null;
        @NonNull
        /* renamed from: c */
        String f5282c = "DESC";

        C1963a() {
        }

        /* renamed from: a */
        C1963a m6897a() {
            this.f5280a = "1";
            return this;
        }

        /* renamed from: a */
        C1963a m6898a(int i) {
            this.f5281b = String.valueOf(i);
            return this;
        }

        /* renamed from: b */
        C1963a m6899b() {
            this.f5282c = "DESC";
            return this;
        }
    }

    /* renamed from: com.foursquare.pilgrim.ad$1 */
    class C35141 implements Migration {
        /* renamed from: a */
        final /* synthetic */ ad f10604a;

        public int getDatabaseVersion() {
            return 34;
        }

        C35141(ad adVar) {
            this.f10604a = adVar;
        }

        public void apply(SQLiteDatabase sQLiteDatabase) {
            if (!DatabaseUtil.m6663a(sQLiteDatabase, "location_history", "motionType")) {
                sQLiteDatabase.execSQL("ALTER TABLE location_history ADD COLUMN motionTimestamp integer");
                sQLiteDatabase.execSQL("ALTER TABLE location_history ADD COLUMN motionType integer");
            }
        }
    }

    /* renamed from: com.foursquare.pilgrim.ad$2 */
    class C35152 implements Migration {
        /* renamed from: a */
        final /* synthetic */ ad f10605a;

        public int getDatabaseVersion() {
            return 37;
        }

        C35152(ad adVar) {
            this.f10605a = adVar;
        }

        public void apply(SQLiteDatabase sQLiteDatabase) {
            if (!DatabaseUtil.m6663a(sQLiteDatabase, "location_history", "elapsedRealtimeNanos")) {
                sQLiteDatabase.execSQL("ALTER TABLE location_history ADD COLUMN elapsedRealtimeNanos integer");
            }
        }
    }

    /* renamed from: com.foursquare.pilgrim.ad$3 */
    class C35163 implements Migration {
        /* renamed from: a */
        final /* synthetic */ ad f10606a;

        public int getDatabaseVersion() {
            return 42;
        }

        C35163(ad adVar) {
            this.f10606a = adVar;
        }

        public void apply(SQLiteDatabase sQLiteDatabase) {
            if (!DatabaseUtil.m6663a(sQLiteDatabase, "location_history", "used")) {
                sQLiteDatabase.execSQL("ALTER TABLE location_history ADD COLUMN used integer default 1");
            }
            if (!DatabaseUtil.m6663a(sQLiteDatabase, "location_history", "wakeupSource")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ALTER TABLE location_history ADD COLUMN wakeupSource text default '");
                stringBuilder.append(BackgroundWakeupSource.FUSED_CONTINUOUS.serializedName);
                stringBuilder.append("'");
                sQLiteDatabase.execSQL(stringBuilder.toString());
            }
            if (!DatabaseUtil.m6663a(sQLiteDatabase, "location_history", "speed")) {
                sQLiteDatabase.execSQL("ALTER TABLE location_history ADD COLUMN speed real default 0");
            }
            if (!DatabaseUtil.m6663a(sQLiteDatabase, "location_history", "heading")) {
                sQLiteDatabase.execSQL("ALTER TABLE location_history ADD COLUMN heading real default 0");
            }
        }
    }

    /* renamed from: com.foursquare.pilgrim.ad$4 */
    class C35174 extends TypeToken<List<WifiScanResult>> {
        C35174() {
        }
    }

    /* renamed from: com.foursquare.pilgrim.ad$5 */
    class C35185 implements RowMapper<ac> {
        C35185() {
        }

        @NonNull
        public /* synthetic */ Object map(@NonNull Cursor cursor) {
            return m13304a(cursor);
        }

        @NonNull
        /* renamed from: a */
        public ac m13304a(@NonNull Cursor cursor) {
            Cursor cursor2 = cursor;
            double e = DatabaseUtil.m6667e(cursor2, ManagerWebServices.PARAM_LAT);
            double e2 = DatabaseUtil.m6667e(cursor2, "lng");
            float f = DatabaseUtil.m6668f(cursor2, "hacc");
            long c = DatabaseUtil.m6665c(cursor2, "timestamp");
            String a = DatabaseUtil.m6659a(cursor2, "trigger");
            String a2 = DatabaseUtil.m6659a(cursor2, "wifi");
            long c2 = DatabaseUtil.m6665c(cursor2, "motionTimestamp");
            int d = DatabaseUtil.m6666d(cursor2, "motionType");
            long c3 = DatabaseUtil.m6665c(cursor2, "elapsedRealtimeNanos");
            boolean b = DatabaseUtil.m6664b(cursor2, "used");
            BackgroundWakeupSource fromSerializedName = BackgroundWakeupSource.fromSerializedName(DatabaseUtil.m6659a(cursor2, "wakeupSource"));
            float f2 = DatabaseUtil.m6668f(cursor2, "speed");
            float f3 = DatabaseUtil.m6668f(cursor2, "heading");
            return new ac(new FoursquareLocation(e, e2, f, true, -1.0d, false, f2, f2 >= 0.0f, f3, f3 >= 0.0f, null, c, c3), a, ad.m13310b(a2), GoogleMotionReading.from(c2, d), b, fromSerializedName == null ? BackgroundWakeupSource.FUSED_CONTINUOUS : fromSerializedName);
        }
    }

    /* renamed from: com.foursquare.pilgrim.ad$6 */
    class C35196 extends TypeToken<List<WifiScanResult>> {
        C35196() {
        }
    }

    public String getCreateTableSQL() {
        return "create table if not exists location_history(lat real, lng real, hacc real, timestamp integer, trigger text, wifi text, motionTimestamp integer, motionType integer, elapsedRealtimeNanos integer, used integer, wakeupSource text, speed real, heading real );";
    }

    public int getLastSchemaChangedVersion() {
        return 42;
    }

    public String getTableName() {
        return "location_history";
    }

    ad() {
    }

    public List<Migration> getMigrations() {
        return Arrays.asList(new Migration[]{new C35141(this), new C35152(this), new C35163(this)});
    }

    /* renamed from: a */
    static void m13309a(@NonNull FoursquareLocation foursquareLocation, @Nullable List<WifiScanResult> list, @Nullable String str, GoogleMotionReading googleMotionReading, boolean z, @NonNull BackgroundWakeupSource backgroundWakeupSource) {
        SQLiteDatabase database = C1916a.getDatabase();
        try {
            database.beginTransaction();
            SQLiteStatement compileStatement = database.compileStatement("INSERT INTO location_history (lat, lng, hacc, timestamp, trigger, wifi, motionTimestamp, motionType, elapsedRealtimeNanos, used, wakeupSource, speed, heading) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            compileStatement.bindDouble(1, foursquareLocation.getLat());
            compileStatement.bindDouble(2, foursquareLocation.getLng());
            compileStatement.bindDouble(3, (double) foursquareLocation.getAccuracy());
            compileStatement.bindLong(4, foursquareLocation.getTime());
            DatabaseUtil.m6661a(compileStatement, 5, str);
            DatabaseUtil.m6661a(compileStatement, 6, C1913a.m6653a((Object) list, new C35174()));
            if (googleMotionReading == null) {
                compileStatement.bindLong(7, 0);
                compileStatement.bindLong(8, 0);
            } else {
                compileStatement.bindLong(7, googleMotionReading.timestamp);
                compileStatement.bindLong(8, (long) googleMotionReading.motionType.detectedActivityType);
            }
            compileStatement.bindLong(9, foursquareLocation.getElapsedRealtimeNanos());
            DatabaseUtil.m6662a(compileStatement, 10, z);
            compileStatement.bindString(11, backgroundWakeupSource.serializedName);
            compileStatement.bindDouble(12, (double) foursquareLocation.getSpeed());
            compileStatement.bindDouble(13, (double) foursquareLocation.getHeading());
            compileStatement.execute();
            database.setTransactionSuccessful();
        } catch (FoursquareLocation foursquareLocation2) {
            PilgrimSdk.get().log(LogLevel.ERROR, "Issue adding location to history", foursquareLocation2);
        } catch (Throwable th) {
            database.endTransaction();
        }
        database.endTransaction();
    }

    @NonNull
    /* renamed from: a */
    static List<ac> m13306a(@NonNull C1963a c1963a) {
        String str;
        String[] strArr;
        if (c1963a.f5280a == null) {
            str = null;
            strArr = str;
        } else {
            str = "used = ?";
            strArr = new String[]{c1963a.f5280a};
        }
        String[] strArr2 = f10608b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("timestamp ");
        stringBuilder.append(c1963a.f5282c);
        return DatabaseUtil.m6660a(C1916a.getReadableDatabase().query("location_history", strArr2, str, strArr, null, null, stringBuilder.toString(), c1963a.f5281b), f10609c);
    }

    @Nullable
    /* renamed from: a */
    static ac m13305a() {
        List a = m13306a(new C1963a().m6897a().m6899b().m6898a(1));
        return a.isEmpty() ? null : (ac) a.get(0);
    }

    /* renamed from: b */
    static void m13311b() {
        C1916a.getDatabase().delete("location_history", null, null);
    }

    /* renamed from: a */
    static void m13308a(long j) {
        try {
            C1916a.getDatabase().delete("location_history", "timestamp < ?", new String[]{String.valueOf(j)});
        } catch (long j2) {
            FsLog.m6806c(f10607a, "Error clearing old locations", j2);
        }
    }

    @android.support.annotation.NonNull
    /* renamed from: b */
    private static java.util.List<com.foursquare.pilgrim.WifiScanResult> m13310b(@android.support.annotation.NonNull java.lang.String r1) {
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
        r0 = new com.foursquare.pilgrim.ad$6;	 Catch:{ JsonParseException -> 0x000c }
        r0.<init>();	 Catch:{ JsonParseException -> 0x000c }
        r1 = com.foursquare.internal.api.C1913a.m6649a(r1, r0);	 Catch:{ JsonParseException -> 0x000c }
        r1 = (java.util.List) r1;	 Catch:{ JsonParseException -> 0x000c }
        return r1;
    L_0x000c:
        r1 = java.util.Collections.emptyList();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.ad.b(java.lang.String):java.util.List<com.foursquare.pilgrim.WifiScanResult>");
    }
}
