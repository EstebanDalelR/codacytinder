package android.support.v4.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service {
    /* renamed from: h */
    static final Object f1251h = new Object();
    /* renamed from: i */
    static final HashMap<ComponentName, C0380h> f1252i = new HashMap();
    /* renamed from: a */
    C0378b f1253a;
    /* renamed from: b */
    C0380h f1254b;
    /* renamed from: c */
    C0377a f1255c;
    /* renamed from: d */
    boolean f1256d = false;
    /* renamed from: e */
    boolean f1257e = false;
    /* renamed from: f */
    boolean f1258f = false;
    /* renamed from: g */
    final ArrayList<C2816d> f1259g;

    /* renamed from: android.support.v4.app.JobIntentService$a */
    final class C0377a extends AsyncTask<Void, Void, Void> {
        /* renamed from: a */
        final /* synthetic */ JobIntentService f1247a;

        C0377a(JobIntentService jobIntentService) {
            this.f1247a = jobIntentService;
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m1373a((Void[]) objArr);
        }

        protected /* synthetic */ void onCancelled(Object obj) {
            m1374a((Void) obj);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m1375b((Void) obj);
        }

        /* renamed from: a */
        protected Void m1373a(Void... voidArr) {
            while (true) {
                voidArr = this.f1247a.m1393d();
                if (voidArr == null) {
                    return null;
                }
                this.f1247a.mo1534a(voidArr.mo387a());
                voidArr.mo388b();
            }
        }

        /* renamed from: a */
        protected void m1374a(Void voidR) {
            this.f1247a.m1392c();
        }

        /* renamed from: b */
        protected void m1375b(Void voidR) {
            this.f1247a.m1392c();
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$b */
    interface C0378b {
        /* renamed from: a */
        IBinder mo389a();

        /* renamed from: b */
        C0379e mo390b();
    }

    /* renamed from: android.support.v4.app.JobIntentService$e */
    interface C0379e {
        /* renamed from: a */
        Intent mo387a();

        /* renamed from: b */
        void mo388b();
    }

    /* renamed from: android.support.v4.app.JobIntentService$h */
    static abstract class C0380h {
        /* renamed from: c */
        final ComponentName f1248c;
        /* renamed from: d */
        boolean f1249d;
        /* renamed from: e */
        int f1250e;

        /* renamed from: a */
        public void mo383a() {
        }

        /* renamed from: a */
        abstract void mo384a(Intent intent);

        /* renamed from: b */
        public void mo385b() {
        }

        /* renamed from: c */
        public void mo386c() {
        }

        C0380h(Context context, ComponentName componentName) {
            this.f1248c = componentName;
        }

        /* renamed from: a */
        void m1381a(int i) {
            if (!this.f1249d) {
                this.f1249d = true;
                this.f1250e = i;
            } else if (this.f1250e != i) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Given job ID ");
                stringBuilder.append(i);
                stringBuilder.append(" is different than previous ");
                stringBuilder.append(this.f1250e);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$c */
    static final class C2815c extends C0380h {
        /* renamed from: a */
        boolean f8904a;
        /* renamed from: b */
        boolean f8905b;
        /* renamed from: f */
        private final Context f8906f;
        /* renamed from: g */
        private final WakeLock f8907g;
        /* renamed from: h */
        private final WakeLock f8908h;

        C2815c(Context context, ComponentName componentName) {
            super(context, componentName);
            this.f8906f = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(componentName.getClassName());
            stringBuilder.append(":launch");
            this.f8907g = powerManager.newWakeLock(1, stringBuilder.toString());
            this.f8907g.setReferenceCounted(false);
            stringBuilder = new StringBuilder();
            stringBuilder.append(componentName.getClassName());
            stringBuilder.append(":run");
            this.f8908h = powerManager.newWakeLock(1, stringBuilder.toString());
            this.f8908h.setReferenceCounted(false);
        }

        /* renamed from: a */
        void mo384a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.c);
            if (this.f8906f.startService(intent2) != null) {
                synchronized (this) {
                    if (this.f8904a == null) {
                        this.f8904a = true;
                        if (this.f8905b == null) {
                            this.f8907g.acquire(60000);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo383a() {
            synchronized (this) {
                this.f8904a = false;
            }
        }

        /* renamed from: b */
        public void mo385b() {
            synchronized (this) {
                if (!this.f8905b) {
                    this.f8905b = true;
                    this.f8908h.acquire(600000);
                    this.f8907g.release();
                }
            }
        }

        /* renamed from: c */
        public void mo386c() {
            synchronized (this) {
                if (this.f8905b) {
                    if (this.f8904a) {
                        this.f8907g.acquire(60000);
                    }
                    this.f8905b = false;
                    this.f8908h.release();
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$d */
    final class C2816d implements C0379e {
        /* renamed from: a */
        final Intent f8909a;
        /* renamed from: b */
        final int f8910b;
        /* renamed from: c */
        final /* synthetic */ JobIntentService f8911c;

        C2816d(JobIntentService jobIntentService, Intent intent, int i) {
            this.f8911c = jobIntentService;
            this.f8909a = intent;
            this.f8910b = i;
        }

        /* renamed from: a */
        public Intent mo387a() {
            return this.f8909a;
        }

        /* renamed from: b */
        public void mo388b() {
            this.f8911c.stopSelf(this.f8910b);
        }
    }

    @RequiresApi(26)
    /* renamed from: android.support.v4.app.JobIntentService$f */
    static final class C2818f extends JobServiceEngine implements C0378b {
        /* renamed from: a */
        final JobIntentService f8914a;
        /* renamed from: b */
        final Object f8915b = new Object();
        /* renamed from: c */
        JobParameters f8916c;

        /* renamed from: android.support.v4.app.JobIntentService$f$a */
        final class C2817a implements C0379e {
            /* renamed from: a */
            final JobWorkItem f8912a;
            /* renamed from: b */
            final /* synthetic */ C2818f f8913b;

            C2817a(C2818f c2818f, JobWorkItem jobWorkItem) {
                this.f8913b = c2818f;
                this.f8912a = jobWorkItem;
            }

            /* renamed from: a */
            public Intent mo387a() {
                return this.f8912a.getIntent();
            }

            /* renamed from: b */
            public void mo388b() {
                synchronized (this.f8913b.f8915b) {
                    if (this.f8913b.f8916c != null) {
                        this.f8913b.f8916c.completeWork(this.f8912a);
                    }
                }
            }
        }

        C2818f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f8914a = jobIntentService;
        }

        /* renamed from: a */
        public IBinder mo389a() {
            return getBinder();
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f8916c = jobParameters;
            this.f8914a.m1389a(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            jobParameters = this.f8914a.m1391b();
            synchronized (this.f8915b) {
                this.f8916c = null;
            }
            return jobParameters;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        public android.support.v4.app.JobIntentService.C0379e mo390b() {
            /*
            r3 = this;
            r0 = r3.f8915b;
            monitor-enter(r0);
            r1 = r3.f8916c;	 Catch:{ all -> 0x0027 }
            r2 = 0;
            if (r1 != 0) goto L_0x000a;
        L_0x0008:
            monitor-exit(r0);	 Catch:{ all -> 0x0027 }
            return r2;
        L_0x000a:
            r1 = r3.f8916c;	 Catch:{ all -> 0x0027 }
            r1 = r1.dequeueWork();	 Catch:{ all -> 0x0027 }
            monitor-exit(r0);	 Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0026;
        L_0x0013:
            r0 = r1.getIntent();
            r2 = r3.f8914a;
            r2 = r2.getClassLoader();
            r0.setExtrasClassLoader(r2);
            r0 = new android.support.v4.app.JobIntentService$f$a;
            r0.<init>(r3, r1);
            return r0;
        L_0x0026:
            return r2;
        L_0x0027:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0027 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.JobIntentService.f.b():android.support.v4.app.JobIntentService$e");
        }
    }

    @RequiresApi(26)
    /* renamed from: android.support.v4.app.JobIntentService$g */
    static final class C2819g extends C0380h {
        /* renamed from: a */
        private final JobInfo f8917a;
        /* renamed from: b */
        private final JobScheduler f8918b;

        C2819g(Context context, ComponentName componentName, int i) {
            super(context, componentName);
            m1381a(i);
            this.f8917a = new Builder(i, this.c).setOverrideDeadline(0).build();
            this.f8918b = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* renamed from: a */
        void mo384a(Intent intent) {
            this.f8918b.enqueue(this.f8917a, new JobWorkItem(intent));
        }
    }

    /* renamed from: a */
    protected abstract void mo1534a(@NonNull Intent intent);

    /* renamed from: a */
    public boolean m1390a() {
        return true;
    }

    public JobIntentService() {
        if (VERSION.SDK_INT >= 26) {
            this.f1259g = null;
        } else {
            this.f1259g = new ArrayList();
        }
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.f1253a = new C2818f(this);
            this.f1254b = null;
            return;
        }
        this.f1253a = null;
        this.f1254b = m1385a((Context) this, new ComponentName(this, getClass()), false, 0);
    }

    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        if (this.f1259g == 0) {
            return 2;
        }
        this.f1254b.mo383a();
        synchronized (this.f1259g) {
            ArrayList arrayList = this.f1259g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C2816d(this, intent, i2));
            m1389a(true);
        }
        return 3;
    }

    public IBinder onBind(@NonNull Intent intent) {
        return this.f1253a != null ? this.f1253a.mo389a() : null;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f1259g != null) {
            synchronized (this.f1259g) {
                this.f1258f = true;
                this.f1254b.mo386c();
            }
        }
    }

    /* renamed from: a */
    public static void m1387a(@NonNull Context context, @NonNull Class cls, int i, @NonNull Intent intent) {
        m1386a(context, new ComponentName(context, cls), i, intent);
    }

    /* renamed from: a */
    public static void m1386a(@NonNull Context context, @NonNull ComponentName componentName, int i, @NonNull Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f1251h) {
            context = m1385a(context, componentName, true, i);
            context.m1381a(i);
            context.mo384a(intent);
        }
    }

    /* renamed from: a */
    static C0380h m1385a(Context context, ComponentName componentName, boolean z, int i) {
        C0380h c0380h = (C0380h) f1252i.get(componentName);
        if (c0380h != null) {
            return c0380h;
        }
        if (VERSION.SDK_INT < 26) {
            z = new C2815c(context, componentName);
        } else if (z) {
            z = new C2819g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        c0380h = z;
        f1252i.put(componentName, c0380h);
        return c0380h;
    }

    /* renamed from: b */
    boolean m1391b() {
        if (this.f1255c != null) {
            this.f1255c.cancel(this.f1256d);
        }
        this.f1257e = true;
        return m1390a();
    }

    /* renamed from: a */
    void m1389a(boolean z) {
        if (this.f1255c == null) {
            this.f1255c = new C0377a(this);
            if (this.f1254b != null && z) {
                this.f1254b.mo385b();
            }
            this.f1255c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: c */
    void m1392c() {
        if (this.f1259g != null) {
            synchronized (this.f1259g) {
                this.f1255c = null;
                if (this.f1259g != null && this.f1259g.size() > 0) {
                    m1389a(false);
                } else if (!this.f1258f) {
                    this.f1254b.mo386c();
                }
            }
        }
    }

    /* renamed from: d */
    C0379e m1393d() {
        if (this.f1253a != null) {
            return this.f1253a.mo390b();
        }
        synchronized (this.f1259g) {
            if (this.f1259g.size() > 0) {
                C0379e c0379e = (C0379e) this.f1259g.remove(0);
                return c0379e;
            }
            return null;
        }
    }
}
