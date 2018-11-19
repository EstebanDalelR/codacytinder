package java8.util.concurrent;

import java.lang.Thread.UncaughtExceptionHandler;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;

public class ForkJoinWorkerThread extends Thread {
    /* renamed from: a */
    final ForkJoinPool f48845a;
    /* renamed from: b */
    final WorkQueue f48846b;

    static final class InnocuousForkJoinWorkerThread extends ForkJoinWorkerThread {
        /* renamed from: c */
        private static final ThreadGroup f54348c = ((ThreadGroup) AccessController.doPrivileged(new C157701()));
        /* renamed from: d */
        private static final AccessControlContext f54349d = new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, null)});

        /* renamed from: java8.util.concurrent.ForkJoinWorkerThread$InnocuousForkJoinWorkerThread$1 */
        static class C157701 implements PrivilegedAction<ThreadGroup> {
            C157701() {
            }

            public /* synthetic */ Object run() {
                return m59289a();
            }

            /* renamed from: a */
            public ThreadGroup m59289a() {
                ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
                while (true) {
                    ThreadGroup parent = threadGroup.getParent();
                    if (parent == null) {
                        return new ThreadGroup(threadGroup, "InnocuousForkJoinWorkerThreadGroup");
                    }
                    threadGroup = parent;
                }
            }
        }

        public void setUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler) {
        }

        InnocuousForkJoinWorkerThread(ForkJoinPool forkJoinPool) {
            super(forkJoinPool, ClassLoader.getSystemClassLoader(), f54348c, f54349d);
        }

        /* renamed from: b */
        void mo12946b() {
            TLRandom.m59309a((Thread) this);
        }

        public void setContextClassLoader(ClassLoader classLoader) {
            throw new SecurityException("setContextClassLoader");
        }
    }

    /* renamed from: a */
    protected void m59290a() {
    }

    /* renamed from: a */
    protected void m59291a(Throwable th) {
    }

    /* renamed from: b */
    void mo12946b() {
    }

    ForkJoinWorkerThread(ForkJoinPool forkJoinPool, ClassLoader classLoader) {
        super("aForkJoinWorkerThread");
        TLRandom.m59310a((Thread) this, classLoader);
        this.f48845a = forkJoinPool;
        this.f48846b = forkJoinPool.m59254a(this);
    }

    ForkJoinWorkerThread(ForkJoinPool forkJoinPool, ClassLoader classLoader, ThreadGroup threadGroup, AccessControlContext accessControlContext) {
        super(threadGroup, "aForkJoinWorkerThread");
        super.setContextClassLoader(classLoader);
        TLRandom.m59311a((Thread) this, accessControlContext);
        TLRandom.m59309a((Thread) this);
        this.f48845a = forkJoinPool;
        this.f48846b = forkJoinPool.m59254a(this);
    }

    public void run() {
        if (this.f48846b.f48809h == null) {
            Throwable th = null;
            try {
                m59290a();
                this.f48845a.m59259a(this.f48846b);
                try {
                    m59291a(null);
                } catch (Throwable th2) {
                    this.f48845a.m59261a(this, null);
                }
            } catch (Throwable th3) {
                try {
                    m59291a(null);
                } catch (Throwable th4) {
                    this.f48845a.m59261a(this, null);
                }
                this.f48845a.m59261a(this, th);
            }
            this.f48845a.m59261a(this, th);
        }
    }
}
