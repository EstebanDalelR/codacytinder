package bolts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class Task<TResult> {
    /* renamed from: a */
    public static final ExecutorService f2044a = C0756c.m2670a();
    /* renamed from: b */
    public static final Executor f2045b = C0752a.m2666b();
    /* renamed from: c */
    private static final Executor f2046c = C0756c.m2671b();
    /* renamed from: i */
    private static Task<?> f2047i = new Task(null);
    /* renamed from: j */
    private static Task<Boolean> f2048j = new Task(Boolean.valueOf(true));
    /* renamed from: k */
    private static Task<Boolean> f2049k = new Task(Boolean.valueOf(false));
    /* renamed from: l */
    private static Task<?> f2050l = new Task(true);
    /* renamed from: d */
    private final Object f2051d = new Object();
    /* renamed from: e */
    private boolean f2052e;
    /* renamed from: f */
    private boolean f2053f;
    /* renamed from: g */
    private TResult f2054g;
    /* renamed from: h */
    private List<Continuation<TResult, Void>> f2055h = new ArrayList();

    public interface UnobservedExceptionHandler {
        void unobservedException(Task<?> task, UnobservedTaskException unobservedTaskException);
    }

    Task() {
    }

    private Task(TResult tResult) {
        m2663a(tResult);
    }

    private Task(boolean z) {
        if (z) {
            m2662a();
        } else {
            m2663a(false);
        }
    }

    /* renamed from: b */
    private void m2661b() {
        synchronized (this.f2051d) {
            for (Continuation then : this.f2055h) {
                try {
                    then.then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Throwable e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f2055h = null;
        }
    }

    /* renamed from: a */
    boolean m2662a() {
        synchronized (this.f2051d) {
            if (this.f2052e) {
                return false;
            }
            this.f2052e = true;
            this.f2053f = true;
            this.f2051d.notifyAll();
            m2661b();
            return true;
        }
    }

    /* renamed from: a */
    boolean m2663a(TResult tResult) {
        synchronized (this.f2051d) {
            if (this.f2052e) {
                return null;
            }
            this.f2052e = true;
            this.f2054g = tResult;
            this.f2051d.notifyAll();
            m2661b();
            return true;
        }
    }
}
