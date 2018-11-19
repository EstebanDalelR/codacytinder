package android.arch.persistence.room;

import android.arch.core.p002a.C2673a;
import android.arch.core.p003b.C0008b;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.C0546b;
import android.support.v4.util.C2880a;
import android.util.Log;
import io.fabric.sdk.android.services.events.C15645a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* renamed from: android.arch.persistence.room.c */
public class C0086c {
    /* renamed from: f */
    private static final String[] f221f = new String[]{"UPDATE", "DELETE", "INSERT"};
    @VisibleForTesting
    @NonNull
    /* renamed from: a */
    C2880a<String, Integer> f222a;
    @VisibleForTesting
    @NonNull
    /* renamed from: b */
    long[] f223b;
    /* renamed from: c */
    AtomicBoolean f224c;
    @VisibleForTesting
    /* renamed from: d */
    final C0008b<C0084b, C0085c> f225d;
    @VisibleForTesting
    /* renamed from: e */
    Runnable f226e;
    /* renamed from: g */
    private String[] f227g;
    /* renamed from: h */
    private Object[] f228h = new Object[1];
    /* renamed from: i */
    private long f229i = 0;
    /* renamed from: j */
    private final C0091e f230j;
    /* renamed from: k */
    private volatile boolean f231k;
    /* renamed from: l */
    private volatile SupportSQLiteStatement f232l;
    /* renamed from: m */
    private C0083a f233m;
    /* renamed from: n */
    private Runnable f234n;

    /* renamed from: android.arch.persistence.room.c$1 */
    class C00811 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0086c f209a;

        C00811(C0086c c0086c) {
            this.f209a = c0086c;
        }

        public void run() {
            if (!this.f209a.f230j.m297i() && this.f209a.m267c()) {
                while (true) {
                    int[] a = this.f209a.f233m.m254a();
                    if (a != null) {
                        int length = a.length;
                        SupportSQLiteDatabase writableDatabase = this.f209a.f230j.m289b().getWritableDatabase();
                        try {
                            writableDatabase.beginTransaction();
                            for (int i = 0; i < length; i++) {
                                switch (a[i]) {
                                    case 1:
                                        this.f209a.m263b(writableDatabase, i);
                                        break;
                                    case 2:
                                        this.f209a.m260a(writableDatabase, i);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            this.f209a.f233m.m255b();
                        } catch (Throwable e) {
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                            return;
                        } catch (Throwable th) {
                            writableDatabase.endTransaction();
                        }
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: android.arch.persistence.room.c$2 */
    class C00822 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0086c f210a;

        C00822(C0086c c0086c) {
            this.f210a = c0086c;
        }

        public void run() {
            Throwable th;
            Throwable th2;
            Lock a = this.f210a.f230j.m286a();
            Object obj;
            Iterator it;
            try {
                Cursor a2;
                a.lock();
                if (!this.f210a.m267c()) {
                    a.unlock();
                    return;
                } else if (!this.f210a.f224c.compareAndSet(true, false)) {
                    a.unlock();
                    return;
                } else if (this.f210a.f230j.m297i()) {
                    a.unlock();
                    return;
                } else {
                    this.f210a.f232l.executeUpdateDelete();
                    this.f210a.f228h[0] = Long.valueOf(this.f210a.f229i);
                    a2 = this.f210a.f230j.m285a("SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;", this.f210a.f228h);
                    obj = null;
                    while (a2.moveToNext()) {
                        try {
                            long j = a2.getLong(0);
                            this.f210a.f223b[a2.getInt(1)] = j;
                            try {
                                this.f210a.f229i = j;
                                obj = 1;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    try {
                        a2.close();
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                    a.unlock();
                    if (obj != null) {
                        synchronized (this.f210a.f225d) {
                            it = this.f210a.f225d.iterator();
                            while (it.hasNext()) {
                                ((C0085c) ((Entry) it.next()).getValue()).m257a(this.f210a.f223b);
                            }
                        }
                    }
                }
                a2.close();
                throw th5;
            } catch (IllegalStateException e) {
                th2 = e;
                obj = null;
                try {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", th2);
                    a.unlock();
                    if (obj != null) {
                        synchronized (this.f210a.f225d) {
                            it = this.f210a.f225d.iterator();
                            while (it.hasNext()) {
                                ((C0085c) ((Entry) it.next()).getValue()).m257a(this.f210a.f223b);
                            }
                        }
                    }
                } catch (Throwable th6) {
                    a.unlock();
                }
            }
        }
    }

    /* renamed from: android.arch.persistence.room.c$a */
    static class C0083a {
        /* renamed from: a */
        final long[] f211a;
        /* renamed from: b */
        final boolean[] f212b;
        /* renamed from: c */
        final int[] f213c;
        /* renamed from: d */
        boolean f214d;
        /* renamed from: e */
        boolean f215e;

        C0083a(int i) {
            this.f211a = new long[i];
            this.f212b = new boolean[i];
            this.f213c = new int[i];
            Arrays.fill(this.f211a, 0);
            Arrays.fill(this.f212b, false);
        }

        @Nullable
        /* renamed from: a */
        int[] m254a() {
            synchronized (this) {
                if (this.f214d) {
                    if (!this.f215e) {
                        int length = this.f211a.length;
                        int i = 0;
                        while (true) {
                            boolean z = true;
                            if (i < length) {
                                boolean z2 = this.f211a[i] > 0;
                                if (z2 != this.f212b[i]) {
                                    int[] iArr = this.f213c;
                                    if (!z2) {
                                        z = true;
                                    }
                                    iArr[i] = z;
                                } else {
                                    this.f213c[i] = 0;
                                }
                                this.f212b[i] = z2;
                                i++;
                            } else {
                                this.f215e = true;
                                this.f214d = false;
                                int[] iArr2 = this.f213c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* renamed from: b */
        void m255b() {
            synchronized (this) {
                this.f215e = false;
            }
        }
    }

    /* renamed from: android.arch.persistence.room.c$b */
    public static abstract class C0084b {
        /* renamed from: a */
        public abstract void m256a(@NonNull Set<String> set);
    }

    /* renamed from: android.arch.persistence.room.c$c */
    static class C0085c {
        /* renamed from: a */
        final int[] f216a;
        /* renamed from: b */
        final C0084b f217b;
        /* renamed from: c */
        private final String[] f218c;
        /* renamed from: d */
        private final long[] f219d;
        /* renamed from: e */
        private final Set<String> f220e;

        /* renamed from: a */
        void m257a(long[] jArr) {
            int length = this.f216a.length;
            Set set = null;
            for (int i = 0; i < length; i++) {
                long j = jArr[this.f216a[i]];
                if (this.f219d[i] < j) {
                    this.f219d[i] = j;
                    if (length == 1) {
                        set = this.f220e;
                    } else {
                        if (set == null) {
                            set = new C0546b(length);
                        }
                        set.add(this.f218c[i]);
                    }
                }
            }
            if (set != null) {
                this.f217b.m256a(set);
            }
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public C0086c(C0091e c0091e, String... strArr) {
        int i = 0;
        this.f224c = new AtomicBoolean(false);
        this.f231k = false;
        this.f225d = new C0008b();
        this.f234n = new C00811(this);
        this.f226e = new C00822(this);
        this.f230j = c0091e;
        this.f233m = new C0083a(strArr.length);
        this.f222a = new C2880a();
        c0091e = strArr.length;
        this.f227g = new String[c0091e];
        while (i < c0091e) {
            String toLowerCase = strArr[i].toLowerCase(Locale.US);
            this.f222a.put(toLowerCase, Integer.valueOf(i));
            this.f227g[i] = toLowerCase;
            i++;
        }
        this.f223b = new long[strArr.length];
        Arrays.fill(this.f223b, 0);
    }

    /* renamed from: a */
    void m272a(SupportSQLiteDatabase supportSQLiteDatabase) {
        synchronized (this) {
            if (this.f231k) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            supportSQLiteDatabase.beginTransaction();
            try {
                supportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
                supportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
                supportSQLiteDatabase.execSQL("CREATE TEMP TABLE room_table_modification_log(version INTEGER PRIMARY KEY AUTOINCREMENT, table_id INTEGER)");
                supportSQLiteDatabase.setTransactionSuccessful();
                this.f232l = supportSQLiteDatabase.compileStatement("DELETE FROM room_table_modification_log WHERE version NOT IN( SELECT MAX(version) FROM room_table_modification_log GROUP BY table_id)");
                this.f231k = true;
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }

    /* renamed from: a */
    private static void m262a(StringBuilder stringBuilder, String str, String str2) {
        stringBuilder.append("`");
        stringBuilder.append("room_table_modification_trigger_");
        stringBuilder.append(str);
        stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
        stringBuilder.append(str2);
        stringBuilder.append("`");
    }

    /* renamed from: a */
    private void m260a(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String str = this.f227g[i];
        StringBuilder stringBuilder = new StringBuilder();
        for (String str2 : f221f) {
            stringBuilder.setLength(0);
            stringBuilder.append("DROP TRIGGER IF EXISTS ");
            C0086c.m262a(stringBuilder, str, str2);
            supportSQLiteDatabase.execSQL(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private void m263b(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String str = this.f227g[i];
        StringBuilder stringBuilder = new StringBuilder();
        for (String str2 : f221f) {
            stringBuilder.setLength(0);
            stringBuilder.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            C0086c.m262a(stringBuilder, str, str2);
            stringBuilder.append(" AFTER ");
            stringBuilder.append(str2);
            stringBuilder.append(" ON `");
            stringBuilder.append(str);
            stringBuilder.append("` BEGIN INSERT OR REPLACE INTO ");
            stringBuilder.append("room_table_modification_log");
            stringBuilder.append(" VALUES(null, ");
            stringBuilder.append(i);
            stringBuilder.append("); END");
            supportSQLiteDatabase.execSQL(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    private boolean m267c() {
        if (!this.f230j.m292d()) {
            return false;
        }
        if (!this.f231k) {
            this.f230j.m289b().getWritableDatabase();
        }
        if (this.f231k) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: a */
    public void m271a() {
        if (this.f224c.compareAndSet(false, true)) {
            C2673a.m10423a().mo15a(this.f226e);
        }
    }

    /* renamed from: b */
    void m273b() {
        this.f234n.run();
    }
}
