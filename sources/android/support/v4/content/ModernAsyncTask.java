package android.support.v4.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class ModernAsyncTask<Params, Progress, Result> {
    /* renamed from: a */
    private static final ThreadFactory f1450a = new C04261();
    /* renamed from: b */
    private static final BlockingQueue<Runnable> f1451b = new LinkedBlockingQueue(10);
    /* renamed from: c */
    public static final Executor f1452c = new ThreadPoolExecutor(5, ProfileEditingConfig.DEFAULT_MAX_LENGTH, 1, TimeUnit.SECONDS, f1451b, f1450a);
    /* renamed from: d */
    private static C0430b f1453d;
    /* renamed from: e */
    private static volatile Executor f1454e = f1452c;
    /* renamed from: f */
    private final C0431c<Params, Result> f1455f = new C28372(this);
    /* renamed from: g */
    private final FutureTask<Result> f1456g = new FutureTask<Result>(this, this.f1455f) {
        /* renamed from: a */
        final /* synthetic */ ModernAsyncTask f1445a;

        protected void done() {
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
            r0 = r3.get();	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x001a, CancellationException -> 0x0013, Throwable -> 0x000a }
            r1 = r3.f1445a;	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x001a, CancellationException -> 0x0013, Throwable -> 0x000a }
            r1.m1633c(r0);	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x001a, CancellationException -> 0x0013, Throwable -> 0x000a }
            goto L_0x002d;
        L_0x000a:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r2 = "An error occurred while executing doInBackground()";
            r1.<init>(r2, r0);
            throw r1;
        L_0x0013:
            r0 = r3.f1445a;
            r1 = 0;
            r0.m1633c(r1);
            goto L_0x002d;
        L_0x001a:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r2 = "An error occurred while executing doInBackground()";
            r0 = r0.getCause();
            r1.<init>(r2, r0);
            throw r1;
        L_0x0027:
            r0 = move-exception;
            r1 = "AsyncTask";
            android.util.Log.w(r1, r0);
        L_0x002d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.ModernAsyncTask.3.done():void");
        }
    };
    /* renamed from: h */
    private volatile Status f1457h = Status.PENDING;
    /* renamed from: i */
    private final AtomicBoolean f1458i = new AtomicBoolean();
    /* renamed from: j */
    private final AtomicBoolean f1459j = new AtomicBoolean();

    /* renamed from: android.support.v4.content.ModernAsyncTask$1 */
    static class C04261 implements ThreadFactory {
        /* renamed from: a */
        private final AtomicInteger f1444a = new AtomicInteger(1);

        C04261() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ModernAsyncTask #");
            stringBuilder.append(this.f1444a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$a */
    private static class C0429a<Data> {
        /* renamed from: a */
        final ModernAsyncTask f1447a;
        /* renamed from: b */
        final Data[] f1448b;

        C0429a(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f1447a = modernAsyncTask;
            this.f1448b = dataArr;
        }
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$b */
    private static class C0430b extends Handler {
        C0430b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C0429a c0429a = (C0429a) message.obj;
            switch (message.what) {
                case 1:
                    c0429a.f1447a.m1636e(c0429a.f1448b[0]);
                    return;
                case 2:
                    c0429a.f1447a.m1632b(c0429a.f1448b);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$c */
    private static abstract class C0431c<Params, Result> implements Callable<Result> {
        /* renamed from: b */
        Params[] f1449b;

        C0431c() {
        }
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$2 */
    class C28372 extends C0431c<Params, Result> {
        /* renamed from: a */
        final /* synthetic */ ModernAsyncTask f9021a;

        C28372(ModernAsyncTask modernAsyncTask) {
            this.f9021a = modernAsyncTask;
        }

        public Result call() throws Exception {
            Throwable th;
            Throwable th2;
            this.f9021a.f1459j.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                Result a = this.f9021a.mo453a(this.b);
                try {
                    Binder.flushPendingCommands();
                    this.f9021a.m1635d(a);
                    return a;
                } catch (Throwable th3) {
                    th2 = th3;
                    obj = a;
                    this.f9021a.m1635d(obj);
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                this.f9021a.f1458i.set(true);
                throw th;
            }
        }
    }

    /* renamed from: a */
    protected abstract Result mo453a(Params... paramsArr);

    /* renamed from: a */
    protected void m1627a() {
    }

    /* renamed from: a */
    protected void mo454a(Result result) {
    }

    /* renamed from: b */
    protected void m1630b() {
    }

    /* renamed from: b */
    protected void m1632b(Progress... progressArr) {
    }

    /* renamed from: d */
    private static Handler m1624d() {
        Handler handler;
        synchronized (ModernAsyncTask.class) {
            if (f1453d == null) {
                f1453d = new C0430b();
            }
            handler = f1453d;
        }
        return handler;
    }

    ModernAsyncTask() {
    }

    /* renamed from: c */
    void m1633c(Result result) {
        if (!this.f1459j.get()) {
            m1635d(result);
        }
    }

    /* renamed from: d */
    Result m1635d(Result result) {
        m1624d().obtainMessage(1, new C0429a(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: b */
    protected void mo455b(Result result) {
        m1630b();
    }

    /* renamed from: c */
    public final boolean m1634c() {
        return this.f1458i.get();
    }

    /* renamed from: a */
    public final boolean m1629a(boolean z) {
        this.f1458i.set(true);
        return this.f1456g.cancel(z);
    }

    /* renamed from: a */
    public final ModernAsyncTask<Params, Progress, Result> m1625a(Executor executor, Params... paramsArr) {
        if (this.f1457h != Status.PENDING) {
            switch (this.f1457h) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    throw new IllegalStateException("We should never reach this state");
            }
        }
        this.f1457h = Status.RUNNING;
        m1627a();
        this.f1455f.f1449b = paramsArr;
        executor.execute(this.f1456g);
        return this;
    }

    /* renamed from: e */
    void m1636e(Result result) {
        if (m1634c()) {
            mo455b((Object) result);
        } else {
            mo454a((Object) result);
        }
        this.f1457h = Status.FINISHED;
    }
}
