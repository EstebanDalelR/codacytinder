package rx.internal.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    /* renamed from: a */
    public static final ThreadFactory f60641a = new C194381();
    private static final long serialVersionUID = -8841098858898482335L;
    /* renamed from: b */
    final String f60642b;

    /* renamed from: rx.internal.util.RxThreadFactory$1 */
    static class C194381 implements ThreadFactory {
        C194381() {
        }

        public Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    }

    public RxThreadFactory(String str) {
        this.f60642b = str;
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f60642b);
        stringBuilder.append(incrementAndGet());
        Thread thread = new Thread(runnable, stringBuilder.toString());
        thread.setDaemon(true);
        return thread;
    }
}
