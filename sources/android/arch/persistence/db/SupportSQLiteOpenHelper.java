package android.arch.persistence.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.Log;
import java.io.File;

public interface SupportSQLiteOpenHelper {

    public interface Factory {
        SupportSQLiteOpenHelper create(C0068b c0068b);
    }

    /* renamed from: android.arch.persistence.db.SupportSQLiteOpenHelper$a */
    public static abstract class C0066a {
        /* renamed from: a */
        public final int f166a;

        /* renamed from: a */
        public void mo127a(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* renamed from: a */
        public abstract void mo128a(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        /* renamed from: b */
        public abstract void mo129b(SupportSQLiteDatabase supportSQLiteDatabase);

        /* renamed from: c */
        public void mo131c(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public C0066a(int i) {
            this.f166a = i;
        }

        /* renamed from: b */
        public void mo130b(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't downgrade database from version ");
            stringBuilder.append(i);
            stringBuilder.append(" to ");
            stringBuilder.append(i2);
            throw new SQLiteException(stringBuilder.toString());
        }

        /* renamed from: d */
        public void m235d(android.arch.persistence.db.SupportSQLiteDatabase r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = "SupportSQLite";
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = "Corruption reported by sqlite on database: ";
            r1.append(r2);
            r2 = r4.getPath();
            r1.append(r2);
            r1 = r1.toString();
            android.util.Log.e(r0, r1);
            r0 = r4.isOpen();
            if (r0 != 0) goto L_0x0028;
        L_0x0020:
            r4 = r4.getPath();
            r3.m229a(r4);
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
            r4.close();	 Catch:{ IOException -> 0x0057, all -> 0x002f }
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
            r3.m229a(r0);
            goto L_0x003b;
        L_0x004f:
            r4 = r4.getPath();
            r3.m229a(r4);
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
            r3.m229a(r0);
            goto L_0x005d;
        L_0x0071:
            r4 = r4.getPath();
            r3.m229a(r4);
        L_0x0078:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.arch.persistence.db.SupportSQLiteOpenHelper.a.d(android.arch.persistence.db.SupportSQLiteDatabase):void");
        }

        /* renamed from: a */
        private void m229a(String str) {
            if (!str.equalsIgnoreCase(":memory:")) {
                if (str.trim().length() != 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("deleting the database file: ");
                    stringBuilder.append(str);
                    Log.w("SupportSQLite", stringBuilder.toString());
                    try {
                        if (VERSION.SDK_INT >= 16) {
                            SQLiteDatabase.deleteDatabase(new File(str));
                        } else {
                            try {
                                if (!new File(str).delete()) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Could not delete the database file ");
                                    stringBuilder.append(str);
                                    Log.e("SupportSQLite", stringBuilder.toString());
                                }
                            } catch (String str2) {
                                Log.e("SupportSQLite", "error while deleting corrupted database file", str2);
                            }
                        }
                    } catch (String str22) {
                        Log.w("SupportSQLite", "delete failed: ", str22);
                    }
                }
            }
        }
    }

    /* renamed from: android.arch.persistence.db.SupportSQLiteOpenHelper$b */
    public static class C0068b {
        @NonNull
        /* renamed from: a */
        public final Context f170a;
        @Nullable
        /* renamed from: b */
        public final String f171b;
        @NonNull
        /* renamed from: c */
        public final C0066a f172c;

        /* renamed from: android.arch.persistence.db.SupportSQLiteOpenHelper$b$a */
        public static class C0067a {
            /* renamed from: a */
            Context f167a;
            /* renamed from: b */
            String f168b;
            /* renamed from: c */
            C0066a f169c;

            /* renamed from: a */
            public C0068b m238a() {
                if (this.f169c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f167a != null) {
                    return new C0068b(this.f167a, this.f168b, this.f169c);
                } else {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
            }

            C0067a(@NonNull Context context) {
                this.f167a = context;
            }

            /* renamed from: a */
            public C0067a m237a(@Nullable String str) {
                this.f168b = str;
                return this;
            }

            /* renamed from: a */
            public C0067a m236a(@NonNull C0066a c0066a) {
                this.f169c = c0066a;
                return this;
            }
        }

        C0068b(@NonNull Context context, @Nullable String str, @NonNull C0066a c0066a) {
            this.f170a = context;
            this.f171b = str;
            this.f172c = c0066a;
        }

        /* renamed from: a */
        public static C0067a m239a(Context context) {
            return new C0067a(context);
        }
    }

    void close();

    String getDatabaseName();

    SupportSQLiteDatabase getReadableDatabase();

    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);
}
