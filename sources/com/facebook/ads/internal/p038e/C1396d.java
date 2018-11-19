package com.facebook.ads.internal.p038e;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.facebook.ads.internal.p038e.C1399f.C1398a;
import com.facebook.ads.internal.p041h.C1420d;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1502p;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.ads.internal.e.d */
public class C1396d {
    /* renamed from: a */
    private static final String f3791a;
    /* renamed from: b */
    private static final int f3792b = Runtime.getRuntime().availableProcessors();
    /* renamed from: c */
    private static final int f3793c = Math.max(2, Math.min(f3792b - 1, 4));
    /* renamed from: d */
    private static final int f3794d = ((f3792b * 2) + 1);
    /* renamed from: e */
    private static final ThreadFactory f3795e = new C13941();
    /* renamed from: f */
    private static final BlockingQueue<Runnable> f3796f = new LinkedBlockingQueue(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    /* renamed from: g */
    private static final Executor f3797g;
    /* renamed from: h */
    private final Context f3798h;
    /* renamed from: i */
    private final C3280h f3799i;
    /* renamed from: j */
    private final C3279c f3800j;
    /* renamed from: k */
    private final ReentrantReadWriteLock f3801k = new ReentrantReadWriteLock();
    /* renamed from: l */
    private final Lock f3802l = this.f3801k.readLock();
    /* renamed from: m */
    private final Lock f3803m = this.f3801k.writeLock();
    /* renamed from: n */
    private SQLiteOpenHelper f3804n;

    /* renamed from: com.facebook.ads.internal.e.d$1 */
    static class C13941 implements ThreadFactory {
        /* renamed from: a */
        private final AtomicInteger f3787a = new AtomicInteger(1);

        C13941() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DatabaseTask #");
            stringBuilder.append(this.f3787a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    /* renamed from: com.facebook.ads.internal.e.d$a */
    private static class C1395a<T> extends AsyncTask<Void, Void, T> {
        /* renamed from: a */
        private final C1399f<T> f3788a;
        /* renamed from: b */
        private final C1392a<T> f3789b;
        /* renamed from: c */
        private C1398a f3790c;

        C1395a(C1399f<T> c1399f, C1392a<T> c1392a) {
            this.f3788a = c1399f;
            this.f3789b = c1392a;
        }

        /* renamed from: a */
        protected T m4840a(java.lang.Void... r2) {
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
            r1 = this;
            r2 = 0;
            r0 = r1.f3788a;	 Catch:{ SQLiteException -> 0x0010 }
            r0 = r0.mo3337b();	 Catch:{ SQLiteException -> 0x0010 }
            r2 = r1.f3788a;	 Catch:{ SQLiteException -> 0x0011 }
            r2 = r2.m4861c();	 Catch:{ SQLiteException -> 0x0011 }
            r1.f3790c = r2;	 Catch:{ SQLiteException -> 0x0011 }
            return r0;
        L_0x0010:
            r0 = r2;
        L_0x0011:
            r2 = com.facebook.ads.internal.p038e.C1399f.C1398a.UNKNOWN;
            r1.f3790c = r2;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.e.d.a.a(java.lang.Void[]):T");
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m4840a((Void[]) objArr);
        }

        protected void onPostExecute(T t) {
            if (this.f3790c == null) {
                this.f3789b.mo1739a(t);
            } else {
                this.f3789b.mo1738a(this.f3790c.m4857a(), this.f3790c.m4858b());
            }
            this.f3789b.m4836a();
        }
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT tokens.");
        stringBuilder.append(C3280h.f10046a.f3785b);
        stringBuilder.append(", ");
        stringBuilder.append("tokens");
        stringBuilder.append(".");
        stringBuilder.append(C3280h.f10047b.f3785b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3279c.f10036a.f3785b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3279c.f10038c.f3785b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3279c.f10039d.f3785b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3279c.f10040e.f3785b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3279c.f10041f.f3785b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3279c.f10042g.f3785b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3279c.f10043h.f3785b);
        stringBuilder.append(" FROM ");
        stringBuilder.append("events");
        stringBuilder.append(" JOIN ");
        stringBuilder.append("tokens");
        stringBuilder.append(" ON ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3279c.f10037b.f3785b);
        stringBuilder.append(" = ");
        stringBuilder.append("tokens");
        stringBuilder.append(".");
        stringBuilder.append(C3280h.f10046a.f3785b);
        stringBuilder.append(" ORDER BY ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3279c.f10040e.f3785b);
        stringBuilder.append(" ASC");
        f3791a = stringBuilder.toString();
        Executor threadPoolExecutor = new ThreadPoolExecutor(f3793c, f3794d, 30, TimeUnit.SECONDS, f3796f, f3795e);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3797g = threadPoolExecutor;
    }

    public C1396d(Context context) {
        this.f3798h = context;
        this.f3799i = new C3280h(this);
        this.f3800j = new C3279c(this);
    }

    /* renamed from: h */
    private synchronized SQLiteDatabase m4845h() {
        if (this.f3804n == null) {
            this.f3804n = new C1397e(this.f3798h, this);
        }
        return this.f3804n.getWritableDatabase();
    }

    @WorkerThread
    /* renamed from: a */
    public Cursor m4846a(int i) {
        this.f3802l.lock();
        try {
            SQLiteDatabase a = m4847a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f3791a);
            stringBuilder.append(" LIMIT ");
            stringBuilder.append(String.valueOf(i));
            Cursor rawQuery = a.rawQuery(stringBuilder.toString(), null);
            return rawQuery;
        } finally {
            this.f3802l.unlock();
        }
    }

    /* renamed from: a */
    public SQLiteDatabase m4847a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return m4845h();
        }
        throw new IllegalStateException("Cannot call getDatabase from the UI thread!");
    }

    /* renamed from: a */
    public <T> AsyncTask m4848a(C1399f<T> c1399f, C1392a<T> c1392a) {
        return C1490h.m5236a(f3797g, new C1395a(c1399f, c1392a), new Void[0]);
    }

    /* renamed from: a */
    public AsyncTask m4849a(final C1420d c1420d, C1392a<String> c1392a) {
        return m4848a(new C3281i<String>(this) {
            /* renamed from: b */
            final /* synthetic */ C1396d f13268b;

            @Nullable
            /* renamed from: a */
            public String m16488a() {
                SQLiteDatabase a;
                Exception e;
                Throwable th;
                if (TextUtils.isEmpty(c1420d.m4959d())) {
                    return null;
                }
                this.f13268b.f3803m.lock();
                try {
                    a = this.f13268b.m4847a();
                    try {
                        a.beginTransaction();
                        String a2 = this.f13268b.f3800j.m12644a(this.f13268b.f3799i.m12650a(c1420d.m4959d()), c1420d.mo1735a().f3943c, c1420d.mo1736b(), c1420d.m4960e(), c1420d.m4961f(), c1420d.m4962g(), c1420d.m4963h());
                        a.setTransactionSuccessful();
                        if (a != null && a.inTransaction()) {
                            try {
                                a.endTransaction();
                            } catch (Exception e2) {
                                C1502p.m5285a(e2, this.f13268b.f3798h);
                            }
                        }
                        this.f13268b.f3803m.unlock();
                        return a2;
                    } catch (Exception e3) {
                        e = e3;
                        try {
                            m4859a(C1398a.DATABASE_INSERT);
                            C1502p.m5285a(e, this.f13268b.f3798h);
                            if (a != null && a.inTransaction()) {
                                try {
                                    a.endTransaction();
                                } catch (Exception e22) {
                                    C1502p.m5285a(e22, this.f13268b.f3798h);
                                }
                            }
                            this.f13268b.f3803m.unlock();
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                a.endTransaction();
                            } catch (Exception e222) {
                                C1502p.m5285a(e222, this.f13268b.f3798h);
                            }
                            this.f13268b.f3803m.unlock();
                            throw th;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    a = null;
                    m4859a(C1398a.DATABASE_INSERT);
                    C1502p.m5285a(e, this.f13268b.f3798h);
                    a.endTransaction();
                    this.f13268b.f3803m.unlock();
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    a = null;
                    if (a != null && a.inTransaction()) {
                        a.endTransaction();
                    }
                    this.f13268b.f3803m.unlock();
                    throw th;
                }
            }

            @Nullable
            /* renamed from: b */
            public /* synthetic */ Object mo3337b() {
                return m16488a();
            }
        }, (C1392a) c1392a);
    }

    @WorkerThread
    /* renamed from: a */
    public boolean m4850a(String str) {
        this.f3803m.lock();
        try {
            boolean a = this.f3800j.m12645a(str);
            return a;
        } finally {
            this.f3803m.unlock();
        }
    }

    /* renamed from: b */
    public synchronized void m4851b() {
        for (C1400g e : m4852c()) {
            e.m4869e();
        }
        if (this.f3804n != null) {
            this.f3804n.close();
            this.f3804n = null;
        }
    }

    /* renamed from: c */
    public C1400g[] m4852c() {
        return new C1400g[]{this.f3799i, this.f3800j};
    }

    /* renamed from: d */
    public Cursor m4853d() {
        this.f3802l.lock();
        try {
            Cursor c = this.f3800j.mo1734c();
            return c;
        } finally {
            this.f3802l.unlock();
        }
    }

    @WorkerThread
    /* renamed from: e */
    public Cursor m4854e() {
        this.f3802l.lock();
        try {
            Cursor d = this.f3800j.m12648d();
            return d;
        } finally {
            this.f3802l.unlock();
        }
    }

    @WorkerThread
    /* renamed from: f */
    public Cursor m4855f() {
        this.f3802l.lock();
        try {
            Cursor c = this.f3799i.mo1734c();
            return c;
        } finally {
            this.f3802l.unlock();
        }
    }

    @WorkerThread
    /* renamed from: g */
    public void m4856g() {
        this.f3803m.lock();
        try {
            this.f3799i.m12653d();
        } finally {
            this.f3803m.unlock();
        }
    }
}
