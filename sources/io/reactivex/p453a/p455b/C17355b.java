package io.reactivex.p453a.p455b;

import android.os.Handler;
import android.os.Message;
import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.disposables.C15676b;
import io.reactivex.disposables.Disposable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.a.b.b */
final class C17355b extends C15679f {
    /* renamed from: b */
    private final Handler f53090b;

    /* renamed from: io.reactivex.a.b.b$b */
    private static final class C17354b implements Disposable, Runnable {
        /* renamed from: a */
        private final Handler f53087a;
        /* renamed from: b */
        private final Runnable f53088b;
        /* renamed from: c */
        private volatile boolean f53089c;

        C17354b(Handler handler, Runnable runnable) {
            this.f53087a = handler;
            this.f53088b = runnable;
        }

        public void run() {
            try {
                this.f53088b.run();
            } catch (Throwable th) {
                Throwable illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.", th);
                C2667a.a(illegalStateException);
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
            }
        }

        public void dispose() {
            this.f53089c = true;
            this.f53087a.removeCallbacks(this);
        }

        public boolean isDisposed() {
            return this.f53089c;
        }
    }

    /* renamed from: io.reactivex.a.b.b$a */
    private static final class C18338a extends C17362c {
        /* renamed from: a */
        private final Handler f56803a;
        /* renamed from: b */
        private volatile boolean f56804b;

        C18338a(Handler handler) {
            this.f56803a = handler;
        }

        /* renamed from: a */
        public Disposable mo13559a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f56804b) {
                return C15676b.m58842b();
            } else {
                Object c17354b = new C17354b(this.f56803a, C2667a.a(runnable));
                runnable = Message.obtain(this.f56803a, c17354b);
                runnable.obj = this;
                this.f56803a.sendMessageDelayed(runnable, Math.max(0, timeUnit.toMillis(j)));
                if (this.f56804b == null) {
                    return c17354b;
                }
                this.f56803a.removeCallbacks(c17354b);
                return C15676b.m58842b();
            }
        }

        public void dispose() {
            this.f56804b = true;
            this.f56803a.removeCallbacksAndMessages(this);
        }

        public boolean isDisposed() {
            return this.f56804b;
        }
    }

    C17355b(Handler handler) {
        this.f53090b = handler;
    }

    /* renamed from: a */
    public Disposable mo12871a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        } else {
            Object c17354b = new C17354b(this.f53090b, C2667a.a(runnable));
            this.f53090b.postDelayed(c17354b, Math.max(0, timeUnit.toMillis(j)));
            return c17354b;
        }
    }

    /* renamed from: a */
    public C17362c mo12872a() {
        return new C18338a(this.f53090b);
    }
}
