package io.fabric.sdk.android.services.concurrency;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.LinkedList;
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

public abstract class AsyncTask<Params, Progress, Result> {
    /* renamed from: a */
    private static final int f48391a = Runtime.getRuntime().availableProcessors();
    /* renamed from: b */
    public static final Executor f48392b = new ThreadPoolExecutor(f48394d, f48395e, 1, TimeUnit.SECONDS, f48397g, f48396f);
    /* renamed from: c */
    public static final Executor f48393c = new C15637c();
    /* renamed from: d */
    private static final int f48394d = (f48391a + 1);
    /* renamed from: e */
    private static final int f48395e = ((f48391a * 2) + 1);
    /* renamed from: f */
    private static final ThreadFactory f48396f = new C156311();
    /* renamed from: g */
    private static final BlockingQueue<Runnable> f48397g = new LinkedBlockingQueue(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
    /* renamed from: h */
    private static final C15635b f48398h = new C15635b();
    /* renamed from: i */
    private static volatile Executor f48399i = f48393c;
    /* renamed from: j */
    private final C15638d<Params, Result> f48400j = new C173362(this);
    /* renamed from: k */
    private final FutureTask<Result> f48401k = new FutureTask<Result>(this, this.f48400j) {
        /* renamed from: a */
        final /* synthetic */ AsyncTask f48382a;

        protected void done() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            r0 = r3.f48382a;	 Catch:{ InterruptedException -> 0x001e, ExecutionException -> 0x0011, CancellationException -> 0x000a }
            r1 = r3.get();	 Catch:{ InterruptedException -> 0x001e, ExecutionException -> 0x0011, CancellationException -> 0x000a }
            r0.m58714c(r1);	 Catch:{ InterruptedException -> 0x001e, ExecutionException -> 0x0011, CancellationException -> 0x000a }
            goto L_0x0024;
        L_0x000a:
            r0 = r3.f48382a;
            r1 = 0;
            r0.m58714c(r1);
            goto L_0x0024;
        L_0x0011:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r2 = "An error occured while executing doInBackground()";
            r0 = r0.getCause();
            r1.<init>(r2, r0);
            throw r1;
        L_0x001e:
            r0 = move-exception;
            r1 = "AsyncTask";
            android.util.Log.w(r1, r0);
        L_0x0024:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.concurrency.AsyncTask.3.done():void");
        }
    };
    /* renamed from: l */
    private volatile Status f48402l = Status.PENDING;
    /* renamed from: m */
    private final AtomicBoolean f48403m = new AtomicBoolean();
    /* renamed from: n */
    private final AtomicBoolean f48404n = new AtomicBoolean();

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$1 */
    static class C156311 implements ThreadFactory {
        /* renamed from: a */
        private final AtomicInteger f48381a = new AtomicInteger(1);

        C156311() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AsyncTask #");
            stringBuilder.append(this.f48381a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$a */
    private static class C15634a<Data> {
        /* renamed from: a */
        final AsyncTask f48384a;
        /* renamed from: b */
        final Data[] f48385b;

        C15634a(AsyncTask asyncTask, Data... dataArr) {
            this.f48384a = asyncTask;
            this.f48385b = dataArr;
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$b */
    private static class C15635b extends Handler {
        public C15635b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C15634a c15634a = (C15634a) message.obj;
            switch (message.what) {
                case 1:
                    c15634a.f48384a.m58716e(c15634a.f48385b[0]);
                    return;
                case 2:
                    c15634a.f48384a.m58724b(c15634a.f48385b);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$c */
    private static class C15637c implements Executor {
        /* renamed from: a */
        final LinkedList<Runnable> f48388a;
        /* renamed from: b */
        Runnable f48389b;

        private C15637c() {
            this.f48388a = new LinkedList();
        }

        public synchronized void execute(final Runnable runnable) {
            this.f48388a.offer(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C15637c f48387b;

                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        this.f48387b.m58709a();
                    }
                }
            });
            if (this.f48389b == null) {
                m58709a();
            }
        }

        /* renamed from: a */
        protected synchronized void m58709a() {
            Runnable runnable = (Runnable) this.f48388a.poll();
            this.f48389b = runnable;
            if (runnable != null) {
                AsyncTask.f48392b.execute(this.f48389b);
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$d */
    private static abstract class C15638d<Params, Result> implements Callable<Result> {
        /* renamed from: b */
        Params[] f48390b;

        private C15638d() {
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$2 */
    class C173362 extends C15638d<Params, Result> {
        /* renamed from: a */
        final /* synthetic */ AsyncTask f53054a;

        C173362(AsyncTask asyncTask) {
            this.f53054a = asyncTask;
            super();
        }

        public Result call() throws Exception {
            this.f53054a.f48404n.set(true);
            Process.setThreadPriority(10);
            return this.f53054a.m58715d(this.f53054a.mo13549a(this.b));
        }
    }

    /* renamed from: a */
    protected abstract Result mo13549a(Params... paramsArr);

    /* renamed from: a */
    protected void mo13550a() {
    }

    /* renamed from: a */
    protected void mo13551a(Result result) {
    }

    /* renamed from: b */
    protected void m58724b(Progress... progressArr) {
    }

    /* renamed from: c */
    protected void m58725c() {
    }

    /* renamed from: c */
    private void m58714c(Result result) {
        if (!this.f48404n.get()) {
            m58715d(result);
        }
    }

    /* renamed from: d */
    private Result m58715d(Result result) {
        f48398h.obtainMessage(1, new C15634a(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: b */
    public final Status m58722b() {
        return this.f48402l;
    }

    /* renamed from: b */
    protected void mo13552b(Result result) {
        m58725c();
    }

    /* renamed from: d */
    public final boolean m58726d() {
        return this.f48403m.get();
    }

    /* renamed from: a */
    public final boolean m58721a(boolean z) {
        this.f48403m.set(true);
        return this.f48401k.cancel(z);
    }

    /* renamed from: a */
    public final AsyncTask<Params, Progress, Result> m58717a(Executor executor, Params... paramsArr) {
        if (this.f48402l != Status.PENDING) {
            switch (this.f48402l) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    break;
            }
        }
        this.f48402l = Status.RUNNING;
        mo13550a();
        this.f48400j.f48390b = paramsArr;
        executor.execute(this.f48401k);
        return this;
    }

    /* renamed from: e */
    private void m58716e(Result result) {
        if (m58726d()) {
            mo13552b((Object) result);
        } else {
            mo13551a((Object) result);
        }
        this.f48402l = Status.FINISHED;
    }
}
