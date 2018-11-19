package bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bolts.c */
final class C0756c {
    /* renamed from: a */
    private static final C0756c f2062a = new C0756c();
    /* renamed from: b */
    private final ExecutorService f2063b;
    /* renamed from: c */
    private final ScheduledExecutorService f2064c;
    /* renamed from: d */
    private final Executor f2065d;

    /* renamed from: bolts.c$a */
    private static class C0755a implements Executor {
        /* renamed from: a */
        private ThreadLocal<Integer> f2061a;

        private C0755a() {
            this.f2061a = new ThreadLocal();
        }

        /* renamed from: a */
        private int m2668a() {
            Integer num = (Integer) this.f2061a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() + 1;
            this.f2061a.set(Integer.valueOf(intValue));
            return intValue;
        }

        /* renamed from: b */
        private int m2669b() {
            Integer num = (Integer) this.f2061a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f2061a.remove();
            } else {
                this.f2061a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (m2668a() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    m2669b();
                }
            } else {
                C0756c.m2670a().execute(runnable);
            }
            m2669b();
        }
    }

    /* renamed from: c */
    private static boolean m2672c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }

    private C0756c() {
        this.f2063b = !C0756c.m2672c() ? Executors.newCachedThreadPool() : C0752a.m2664a();
        this.f2064c = Executors.newSingleThreadScheduledExecutor();
        this.f2065d = new C0755a();
    }

    /* renamed from: a */
    public static ExecutorService m2670a() {
        return f2062a.f2063b;
    }

    /* renamed from: b */
    static Executor m2671b() {
        return f2062a.f2065d;
    }
}
