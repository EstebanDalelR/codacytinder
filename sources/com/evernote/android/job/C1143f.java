package com.evernote.android.job;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.util.LruCache;
import com.evernote.android.job.util.C3142c;
import com.tinder.api.ManagerWebServices;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.evernote.android.job.f */
class C1143f {
    /* renamed from: a */
    private static final C3142c f3002a = new C3142c("JobStorage");
    /* renamed from: b */
    private final SharedPreferences f3003b;
    /* renamed from: c */
    private final C1141a f3004c;
    /* renamed from: d */
    private AtomicInteger f3005d;
    /* renamed from: e */
    private final Set<String> f3006e;
    /* renamed from: f */
    private final C1142b f3007f;
    /* renamed from: g */
    private SQLiteDatabase f3008g;
    /* renamed from: h */
    private final ReadWriteLock f3009h;

    /* renamed from: com.evernote.android.job.f$a */
    private class C1141a extends LruCache<Integer, JobRequest> {
        /* renamed from: a */
        final /* synthetic */ C1143f f3001a;

        protected /* synthetic */ Object create(Object obj) {
            return m3842a((Integer) obj);
        }

        public C1141a(C1143f c1143f) {
            this.f3001a = c1143f;
            super(30);
        }

        /* renamed from: a */
        protected JobRequest m3842a(Integer num) {
            return this.f3001a.m3849a(num.intValue(), true);
        }
    }

    /* renamed from: com.evernote.android.job.f$b */
    private static final class C1142b extends SQLiteOpenHelper {
        private C1142b(Context context, String str) {
            super(context, str, null, 6, new C1144g());
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m3843a(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            while (i < i2) {
                switch (i) {
                    case 1:
                        m3844b(sQLiteDatabase);
                        i++;
                        break;
                    case 2:
                        m3845c(sQLiteDatabase);
                        i++;
                        break;
                    case 3:
                        m3846d(sQLiteDatabase);
                        i++;
                        break;
                    case 4:
                        m3847e(sQLiteDatabase);
                        i++;
                        break;
                    case 5:
                        m3848f(sQLiteDatabase);
                        i++;
                        break;
                    default:
                        throw new IllegalStateException("not implemented");
                }
            }
        }

        /* renamed from: a */
        private void m3843a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("create table jobs (_id integer primary key, tag text not null, startMs integer, endMs integer, backoffMs integer, backoffPolicy text not null, intervalMs integer, requirementsEnforced integer, requiresCharging integer, requiresDeviceIdle integer, exact integer, networkType text not null, extras text, numFailures integer, scheduledAt integer, started integer, flexMs integer, flexSupport integer, lastRun integer, transient integer, requiresBatteryNotLow integer, requiresStorageNotLow integer);");
        }

        /* renamed from: b */
        private void m3844b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column isTransient integer;");
        }

        /* renamed from: c */
        private void m3845c(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column flexMs integer;");
            sQLiteDatabase.execSQL("alter table jobs add column flexSupport integer;");
            ContentValues contentValues = new ContentValues();
            contentValues.put("intervalMs", Long.valueOf(JobRequest.f2956c));
            String str = ManagerWebServices.PARAM_JOBS;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("intervalMs>0 AND intervalMs<");
            stringBuilder.append(JobRequest.f2956c);
            sQLiteDatabase.update(str, contentValues, stringBuilder.toString(), new String[0]);
            sQLiteDatabase.execSQL("update jobs set flexMs = intervalMs;");
        }

        /* renamed from: d */
        private void m3846d(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column lastRun integer;");
        }

        /* renamed from: e */
        private void m3847e(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.beginTransaction();
                String str = "jobs_new";
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("create table ");
                stringBuilder.append(str);
                stringBuilder.append(" (");
                stringBuilder.append(ManagerWebServices.PARAM_ID_UNDERSCORE);
                stringBuilder.append(" integer primary key, ");
                stringBuilder.append("tag");
                stringBuilder.append(" text not null, ");
                stringBuilder.append("startMs");
                stringBuilder.append(" integer, ");
                stringBuilder.append("endMs");
                stringBuilder.append(" integer, ");
                stringBuilder.append("backoffMs");
                stringBuilder.append(" integer, ");
                stringBuilder.append("backoffPolicy");
                stringBuilder.append(" text not null, ");
                stringBuilder.append("intervalMs");
                stringBuilder.append(" integer, ");
                stringBuilder.append("requirementsEnforced");
                stringBuilder.append(" integer, ");
                stringBuilder.append("requiresCharging");
                stringBuilder.append(" integer, ");
                stringBuilder.append("requiresDeviceIdle");
                stringBuilder.append(" integer, ");
                stringBuilder.append("exact");
                stringBuilder.append(" integer, ");
                stringBuilder.append("networkType");
                stringBuilder.append(" text not null, ");
                stringBuilder.append("extras");
                stringBuilder.append(" text, ");
                stringBuilder.append("numFailures");
                stringBuilder.append(" integer, ");
                stringBuilder.append("scheduledAt");
                stringBuilder.append(" integer, ");
                stringBuilder.append("started");
                stringBuilder.append(" integer, ");
                stringBuilder.append("flexMs");
                stringBuilder.append(" integer, ");
                stringBuilder.append("flexSupport");
                stringBuilder.append(" integer, ");
                stringBuilder.append("lastRun");
                stringBuilder.append(" integer);");
                sQLiteDatabase.execSQL(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append("INSERT INTO ");
                stringBuilder.append(str);
                stringBuilder.append(" SELECT ");
                stringBuilder.append(ManagerWebServices.PARAM_ID_UNDERSCORE);
                stringBuilder.append(",");
                stringBuilder.append("tag");
                stringBuilder.append(",");
                stringBuilder.append("startMs");
                stringBuilder.append(",");
                stringBuilder.append("endMs");
                stringBuilder.append(",");
                stringBuilder.append("backoffMs");
                stringBuilder.append(",");
                stringBuilder.append("backoffPolicy");
                stringBuilder.append(",");
                stringBuilder.append("intervalMs");
                stringBuilder.append(",");
                stringBuilder.append("requirementsEnforced");
                stringBuilder.append(",");
                stringBuilder.append("requiresCharging");
                stringBuilder.append(",");
                stringBuilder.append("requiresDeviceIdle");
                stringBuilder.append(",");
                stringBuilder.append("exact");
                stringBuilder.append(",");
                stringBuilder.append("networkType");
                stringBuilder.append(",");
                stringBuilder.append("extras");
                stringBuilder.append(",");
                stringBuilder.append("numFailures");
                stringBuilder.append(",");
                stringBuilder.append("scheduledAt");
                stringBuilder.append(",");
                stringBuilder.append("isTransient");
                stringBuilder.append(",");
                stringBuilder.append("flexMs");
                stringBuilder.append(",");
                stringBuilder.append("flexSupport");
                stringBuilder.append(",");
                stringBuilder.append("lastRun");
                stringBuilder.append(" FROM ");
                stringBuilder.append(ManagerWebServices.PARAM_JOBS);
                sQLiteDatabase.execSQL(stringBuilder.toString());
                sQLiteDatabase.execSQL("DROP TABLE jobs");
                stringBuilder = new StringBuilder();
                stringBuilder.append("ALTER TABLE ");
                stringBuilder.append(str);
                stringBuilder.append(" RENAME TO ");
                stringBuilder.append(ManagerWebServices.PARAM_JOBS);
                sQLiteDatabase.execSQL(stringBuilder.toString());
                sQLiteDatabase.execSQL("alter table jobs add column transient integer;");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }

        /* renamed from: f */
        private void m3848f(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column requiresBatteryNotLow integer;");
            sQLiteDatabase.execSQL("alter table jobs add column requiresStorageNotLow integer;");
        }
    }

    public C1143f(Context context) {
        this(context, "evernote_jobs.db");
    }

    public C1143f(Context context, String str) {
        this.f3003b = context.getSharedPreferences("evernote_jobs", 0);
        this.f3009h = new ReentrantReadWriteLock();
        this.f3004c = new C1141a(this);
        this.f3007f = new C1142b(context, str);
        this.f3006e = this.f3003b.getStringSet("FAILED_DELETE_IDS", new HashSet());
        if (this.f3006e.isEmpty() == null) {
            m3861e();
        }
    }

    /* renamed from: a */
    public void m3865a(JobRequest jobRequest) {
        this.f3009h.writeLock().lock();
        try {
            m3860d(jobRequest);
            m3857c(jobRequest);
        } finally {
            this.f3009h.writeLock().unlock();
        }
    }

    /* renamed from: a */
    public void m3866a(JobRequest jobRequest, ContentValues contentValues) {
        this.f3009h.writeLock().lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            m3857c(jobRequest);
            SQLiteDatabase b = m3867b();
            try {
                b.update(ManagerWebServices.PARAM_JOBS, contentValues, "_id=?", new String[]{String.valueOf(jobRequest.m3765c())});
                C1143f.m3853a(b);
            } catch (Exception e) {
                contentValues = e;
                sQLiteDatabase = b;
                try {
                    f3002a.m12121b(contentValues, "could not update %s", jobRequest);
                    C1143f.m3853a(sQLiteDatabase);
                    this.f3009h.writeLock().unlock();
                } catch (Throwable th) {
                    jobRequest = th;
                    C1143f.m3853a(sQLiteDatabase);
                    this.f3009h.writeLock().unlock();
                    throw jobRequest;
                }
            } catch (Throwable th2) {
                jobRequest = th2;
                sQLiteDatabase = b;
                C1143f.m3853a(sQLiteDatabase);
                this.f3009h.writeLock().unlock();
                throw jobRequest;
            }
        } catch (Exception e2) {
            contentValues = e2;
            f3002a.m12121b(contentValues, "could not update %s", jobRequest);
            C1143f.m3853a(sQLiteDatabase);
            this.f3009h.writeLock().unlock();
        }
        this.f3009h.writeLock().unlock();
    }

    /* renamed from: c */
    private void m3857c(JobRequest jobRequest) {
        this.f3004c.put(Integer.valueOf(jobRequest.m3765c()), jobRequest);
    }

    /* renamed from: a */
    public JobRequest m3863a(int i) {
        this.f3009h.readLock().lock();
        try {
            JobRequest jobRequest = (JobRequest) this.f3004c.get(Integer.valueOf(i));
            return jobRequest;
        } finally {
            this.f3009h.readLock().unlock();
        }
    }

    /* renamed from: a */
    public Set<JobRequest> m3864a(@Nullable String str, boolean z) {
        SQLiteDatabase b;
        Cursor query;
        Throwable e;
        Throwable th;
        Set<JobRequest> hashSet = new HashSet();
        this.f3009h.readLock().lock();
        try {
            String str2;
            String[] strArr;
            if (TextUtils.isEmpty(str)) {
                str2 = z ? null : "ifnull(started, 0)<=0";
                strArr = null;
            } else {
                z = z ? "" : "ifnull(started, 0)<=0 AND ";
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(z);
                stringBuilder.append("tag=?");
                str2 = stringBuilder.toString();
                strArr = new String[]{str};
            }
            b = m3867b();
            try {
                query = b.query(ManagerWebServices.PARAM_JOBS, null, str2, strArr, null, null, null);
                try {
                    HashMap hashMap = new HashMap(this.f3004c.snapshot());
                    while (query != false && query.moveToNext()) {
                        Integer valueOf = Integer.valueOf(query.getInt(query.getColumnIndex(ManagerWebServices.PARAM_ID_UNDERSCORE)));
                        if (!m3858c(valueOf.intValue())) {
                            if (hashMap.containsKey(valueOf)) {
                                hashSet.add(hashMap.get(valueOf));
                            } else {
                                hashSet.add(JobRequest.m3751a(query));
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        f3002a.m12121b(e, "could not load all jobs", new Object[0]);
                        C1143f.m3852a(query);
                        C1143f.m3853a(b);
                        this.f3009h.readLock().unlock();
                        return hashSet;
                    } catch (Throwable th2) {
                        th = th2;
                        C1143f.m3852a(query);
                        C1143f.m3853a(b);
                        this.f3009h.readLock().unlock();
                        throw th;
                    }
                }
            } catch (boolean z2) {
                e = z2;
                query = null;
                f3002a.m12121b(e, "could not load all jobs", new Object[0]);
                C1143f.m3852a(query);
                C1143f.m3853a(b);
                this.f3009h.readLock().unlock();
                return hashSet;
            } catch (boolean z22) {
                th = z22;
                query = false;
                C1143f.m3852a(query);
                C1143f.m3853a(b);
                this.f3009h.readLock().unlock();
                throw th;
            }
        } catch (String str3) {
            query = false;
            e = str3;
            b = query;
            f3002a.m12121b(e, "could not load all jobs", new Object[0]);
            C1143f.m3852a(query);
            C1143f.m3853a(b);
            this.f3009h.readLock().unlock();
            return hashSet;
        } catch (String str32) {
            th = str32;
            b = null;
            query = b;
            C1143f.m3852a(query);
            C1143f.m3853a(b);
            this.f3009h.readLock().unlock();
            throw th;
        }
        C1143f.m3852a(query);
        C1143f.m3853a(b);
        this.f3009h.readLock().unlock();
        return hashSet;
    }

    /* renamed from: b */
    public void m3868b(JobRequest jobRequest) {
        m3854a(jobRequest, jobRequest.m3765c());
    }

    /* renamed from: a */
    private boolean m3854a(@Nullable JobRequest jobRequest, int i) {
        SQLiteDatabase b;
        Throwable e;
        this.f3009h.writeLock().lock();
        try {
            this.f3004c.remove(Integer.valueOf(i));
            b = m3867b();
            try {
                b.delete(ManagerWebServices.PARAM_JOBS, "_id=?", new String[]{String.valueOf(i)});
                C1143f.m3853a(b);
                this.f3009h.writeLock().unlock();
                return true;
            } catch (Exception e2) {
                e = e2;
                try {
                    f3002a.m12121b(e, "could not delete %d %s", Integer.valueOf(i), jobRequest);
                    m3856b(i);
                    C1143f.m3853a(b);
                    this.f3009h.writeLock().unlock();
                    return false;
                } catch (Throwable th) {
                    jobRequest = th;
                    C1143f.m3853a(b);
                    this.f3009h.writeLock().unlock();
                    throw jobRequest;
                }
            }
        } catch (Throwable e3) {
            Throwable th2 = e3;
            b = null;
            e = th2;
            f3002a.m12121b(e, "could not delete %d %s", Integer.valueOf(i), jobRequest);
            m3856b(i);
            C1143f.m3853a(b);
            this.f3009h.writeLock().unlock();
            return false;
        } catch (Throwable th3) {
            jobRequest = th3;
            b = null;
            C1143f.m3853a(b);
            this.f3009h.writeLock().unlock();
            throw jobRequest;
        }
    }

    /* renamed from: a */
    public synchronized int m3862a() {
        int incrementAndGet;
        if (this.f3005d == null) {
            this.f3005d = new AtomicInteger(m3869c());
        }
        incrementAndGet = this.f3005d.incrementAndGet();
        int e = C1133b.m3799e();
        if (incrementAndGet < e || incrementAndGet >= 2147480000) {
            this.f3005d.set(e);
            incrementAndGet = this.f3005d.incrementAndGet();
        }
        this.f3003b.edit().putInt("JOB_ID_COUNTER_v2", incrementAndGet).apply();
        return incrementAndGet;
    }

    /* renamed from: d */
    private void m3860d(JobRequest jobRequest) {
        SQLiteDatabase b;
        jobRequest = jobRequest.m3759G();
        try {
            b = m3867b();
            try {
                if (b.insertWithOnConflict(ManagerWebServices.PARAM_JOBS, null, jobRequest, 5) < 0) {
                    throw new SQLException("Couldn't insert job request into database");
                }
                C1143f.m3853a(b);
            } catch (Throwable th) {
                jobRequest = th;
                C1143f.m3853a(b);
                throw jobRequest;
            }
        } catch (Throwable th2) {
            jobRequest = th2;
            b = null;
            C1143f.m3853a(b);
            throw jobRequest;
        }
    }

    /* renamed from: a */
    private JobRequest m3849a(int i, boolean z) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor = null;
        if (m3858c(i)) {
            return null;
        }
        SQLiteDatabase b;
        Cursor query;
        try {
            String str = "_id=?";
            if (!z) {
                z = new StringBuilder();
                z.append(str);
                z.append(" AND started<=0");
                str = z.toString();
            }
            String str2 = str;
            b = m3867b();
            try {
                query = b.query(ManagerWebServices.PARAM_JOBS, null, str2, new String[]{String.valueOf(i)}, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            JobRequest a = JobRequest.m3751a(query);
                            C1143f.m3852a(query);
                            C1143f.m3853a(b);
                            return a;
                        }
                    } catch (Exception e) {
                        Exception exception = e;
                        sQLiteDatabase = b;
                        z = exception;
                        try {
                            f3002a.m12121b(z, "could not load id %d", Integer.valueOf(i));
                            C1143f.m3852a(query);
                            C1143f.m3853a(sQLiteDatabase);
                            return null;
                        } catch (Throwable th) {
                            i = th;
                            cursor = query;
                            b = sQLiteDatabase;
                            C1143f.m3852a(cursor);
                            C1143f.m3853a(b);
                            throw i;
                        }
                    } catch (Throwable th2) {
                        i = th2;
                        cursor = query;
                        C1143f.m3852a(cursor);
                        C1143f.m3853a(b);
                        throw i;
                    }
                }
                C1143f.m3852a(query);
                C1143f.m3853a(b);
            } catch (Exception e2) {
                sQLiteDatabase = b;
                z = e2;
                query = null;
                f3002a.m12121b(z, "could not load id %d", Integer.valueOf(i));
                C1143f.m3852a(query);
                C1143f.m3853a(sQLiteDatabase);
                return null;
            } catch (Throwable th3) {
                i = th3;
                C1143f.m3852a(cursor);
                C1143f.m3853a(b);
                throw i;
            }
        } catch (Exception e3) {
            z = e3;
            query = null;
            sQLiteDatabase = query;
            f3002a.m12121b(z, "could not load id %d", Integer.valueOf(i));
            C1143f.m3852a(query);
            C1143f.m3853a(sQLiteDatabase);
            return null;
        } catch (Throwable th4) {
            i = th4;
            b = false;
            C1143f.m3852a(cursor);
            C1143f.m3853a(b);
            throw i;
        }
        return null;
    }

    @VisibleForTesting
    @NonNull
    /* renamed from: b */
    SQLiteDatabase m3867b() {
        if (this.f3008g != null) {
            return this.f3008g;
        }
        try {
            return this.f3007f.getWritableDatabase();
        } catch (Throwable e) {
            f3002a.m12117a(e);
            new C1144g().m3872a("evernote_jobs.db");
            return this.f3007f.getWritableDatabase();
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    int m3869c() {
        int i;
        Throwable e;
        Throwable th;
        SQLiteDatabase b;
        Cursor rawQuery;
        try {
            b = m3867b();
            try {
                rawQuery = b.rawQuery("SELECT MAX(_id) FROM jobs", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.moveToFirst()) {
                            i = rawQuery.getInt(0);
                            C1143f.m3852a(rawQuery);
                            C1143f.m3853a(b);
                            return Math.max(C1133b.m3799e(), Math.max(i, this.f3003b.getInt("JOB_ID_COUNTER_v2", 0)));
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            f3002a.m12117a(e);
                            C1143f.m3852a(rawQuery);
                            C1143f.m3853a(b);
                            i = 0;
                            return Math.max(C1133b.m3799e(), Math.max(i, this.f3003b.getInt("JOB_ID_COUNTER_v2", 0)));
                        } catch (Throwable th2) {
                            th = th2;
                            C1143f.m3852a(rawQuery);
                            C1143f.m3853a(b);
                            throw th;
                        }
                    }
                }
                i = 0;
                C1143f.m3852a(rawQuery);
                C1143f.m3853a(b);
            } catch (Throwable e3) {
                Throwable th3 = e3;
                rawQuery = null;
                e = th3;
                f3002a.m12117a(e);
                C1143f.m3852a(rawQuery);
                C1143f.m3853a(b);
                i = 0;
                return Math.max(C1133b.m3799e(), Math.max(i, this.f3003b.getInt("JOB_ID_COUNTER_v2", 0)));
            } catch (Throwable th4) {
                th = th4;
                rawQuery = null;
                C1143f.m3852a(rawQuery);
                C1143f.m3853a(b);
                throw th;
            }
        } catch (Throwable e4) {
            rawQuery = null;
            e = e4;
            b = rawQuery;
            f3002a.m12117a(e);
            C1143f.m3852a(rawQuery);
            C1143f.m3853a(b);
            i = 0;
            return Math.max(C1133b.m3799e(), Math.max(i, this.f3003b.getInt("JOB_ID_COUNTER_v2", 0)));
        } catch (Throwable th5) {
            th = th5;
            b = null;
            rawQuery = b;
            C1143f.m3852a(rawQuery);
            C1143f.m3853a(b);
            throw th;
        }
        return Math.max(C1133b.m3799e(), Math.max(i, this.f3003b.getInt("JOB_ID_COUNTER_v2", 0)));
    }

    /* renamed from: b */
    private void m3856b(int i) {
        synchronized (this.f3006e) {
            this.f3006e.add(String.valueOf(i));
            this.f3003b.edit().putStringSet("FAILED_DELETE_IDS", this.f3006e).apply();
        }
    }

    /* renamed from: c */
    private boolean m3858c(int i) {
        synchronized (this.f3006e) {
            i = (this.f3006e.isEmpty() || this.f3006e.contains(String.valueOf(i)) == 0) ? 0 : 1;
        }
        return i;
    }

    /* renamed from: e */
    private void m3861e() {
        new Thread(this, "CleanupFinishedJobsThread") {
            /* renamed from: a */
            final /* synthetic */ C1143f f3000a;

            public void run() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r7 = this;
                r0 = r7.f3000a;
                r0 = r0.f3006e;
                monitor-enter(r0);
                r1 = new java.util.HashSet;	 Catch:{ all -> 0x00a3 }
                r2 = r7.f3000a;	 Catch:{ all -> 0x00a3 }
                r2 = r2.f3006e;	 Catch:{ all -> 0x00a3 }
                r1.<init>(r2);	 Catch:{ all -> 0x00a3 }
                monitor-exit(r0);	 Catch:{ all -> 0x00a3 }
                r0 = r1.iterator();
            L_0x0017:
                r2 = r0.hasNext();
                r3 = 0;
                if (r2 == 0) goto L_0x005d;
            L_0x001e:
                r2 = r0.next();
                r2 = (java.lang.String) r2;
                r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x0059 }
                r4 = r7.f3000a;	 Catch:{ NumberFormatException -> 0x0059 }
                r5 = 0;	 Catch:{ NumberFormatException -> 0x0059 }
                r4 = r4.m3854a(r5, r2);	 Catch:{ NumberFormatException -> 0x0059 }
                r5 = 1;	 Catch:{ NumberFormatException -> 0x0059 }
                if (r4 == 0) goto L_0x0047;	 Catch:{ NumberFormatException -> 0x0059 }
            L_0x0032:
                r0.remove();	 Catch:{ NumberFormatException -> 0x0059 }
                r4 = com.evernote.android.job.C1143f.f3002a;	 Catch:{ NumberFormatException -> 0x0059 }
                r6 = "Deleted job %d which failed to delete earlier";	 Catch:{ NumberFormatException -> 0x0059 }
                r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x0059 }
                r2 = java.lang.Integer.valueOf(r2);	 Catch:{ NumberFormatException -> 0x0059 }
                r5[r3] = r2;	 Catch:{ NumberFormatException -> 0x0059 }
                r4.m12116a(r6, r5);	 Catch:{ NumberFormatException -> 0x0059 }
                goto L_0x0017;	 Catch:{ NumberFormatException -> 0x0059 }
            L_0x0047:
                r4 = com.evernote.android.job.C1143f.f3002a;	 Catch:{ NumberFormatException -> 0x0059 }
                r6 = "Couldn't delete job %d which failed to delete earlier";	 Catch:{ NumberFormatException -> 0x0059 }
                r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x0059 }
                r2 = java.lang.Integer.valueOf(r2);	 Catch:{ NumberFormatException -> 0x0059 }
                r5[r3] = r2;	 Catch:{ NumberFormatException -> 0x0059 }
                r4.m12125d(r6, r5);	 Catch:{ NumberFormatException -> 0x0059 }
                goto L_0x0017;
            L_0x0059:
                r0.remove();
                goto L_0x0017;
            L_0x005d:
                r0 = r7.f3000a;
                r2 = r0.f3006e;
                monitor-enter(r2);
                r0 = r7.f3000a;	 Catch:{ all -> 0x00a0 }
                r0 = r0.f3006e;	 Catch:{ all -> 0x00a0 }
                r0.clear();	 Catch:{ all -> 0x00a0 }
                r0 = r1.size();	 Catch:{ all -> 0x00a0 }
                r4 = 50;	 Catch:{ all -> 0x00a0 }
                if (r0 <= r4) goto L_0x0095;	 Catch:{ all -> 0x00a0 }
            L_0x0075:
                r0 = r1.iterator();	 Catch:{ all -> 0x00a0 }
            L_0x0079:
                r1 = r0.hasNext();	 Catch:{ all -> 0x00a0 }
                if (r1 == 0) goto L_0x009e;	 Catch:{ all -> 0x00a0 }
            L_0x007f:
                r1 = r0.next();	 Catch:{ all -> 0x00a0 }
                r1 = (java.lang.String) r1;	 Catch:{ all -> 0x00a0 }
                r5 = r3 + 1;	 Catch:{ all -> 0x00a0 }
                if (r3 <= r4) goto L_0x008a;	 Catch:{ all -> 0x00a0 }
            L_0x0089:
                goto L_0x009e;	 Catch:{ all -> 0x00a0 }
            L_0x008a:
                r3 = r7.f3000a;	 Catch:{ all -> 0x00a0 }
                r3 = r3.f3006e;	 Catch:{ all -> 0x00a0 }
                r3.add(r1);	 Catch:{ all -> 0x00a0 }
                r3 = r5;	 Catch:{ all -> 0x00a0 }
                goto L_0x0079;	 Catch:{ all -> 0x00a0 }
            L_0x0095:
                r0 = r7.f3000a;	 Catch:{ all -> 0x00a0 }
                r0 = r0.f3006e;	 Catch:{ all -> 0x00a0 }
                r0.addAll(r1);	 Catch:{ all -> 0x00a0 }
            L_0x009e:
                monitor-exit(r2);	 Catch:{ all -> 0x00a0 }
                return;	 Catch:{ all -> 0x00a0 }
            L_0x00a0:
                r0 = move-exception;	 Catch:{ all -> 0x00a0 }
                monitor-exit(r2);	 Catch:{ all -> 0x00a0 }
                throw r0;
            L_0x00a3:
                r1 = move-exception;
                monitor-exit(r0);	 Catch:{ all -> 0x00a3 }
                throw r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.f.1.run():void");
            }
        }.start();
    }

    /* renamed from: a */
    private static void m3852a(@android.support.annotation.Nullable android.database.Cursor r0) {
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
        if (r0 == 0) goto L_0x0005;
    L_0x0002:
        r0.close();	 Catch:{ Exception -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.f.a(android.database.Cursor):void");
    }

    /* renamed from: a */
    private static void m3853a(@android.support.annotation.Nullable android.database.sqlite.SQLiteDatabase r0) {
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
        if (r0 == 0) goto L_0x0005;
    L_0x0002:
        r0.close();	 Catch:{ Exception -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.f.a(android.database.sqlite.SQLiteDatabase):void");
    }
}
