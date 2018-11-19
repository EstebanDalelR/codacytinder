package io.reactivex.observers;

import com.facebook.ads.AdError;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.VolatileSizeArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements Disposable {
    /* renamed from: a */
    protected final CountDownLatch f54143a = new CountDownLatch(1);
    /* renamed from: b */
    protected final List<T> f54144b = new VolatileSizeArrayList();
    /* renamed from: c */
    protected final List<Throwable> f54145c = new VolatileSizeArrayList();
    /* renamed from: d */
    protected long f54146d;
    /* renamed from: e */
    protected Thread f54147e;
    /* renamed from: f */
    protected boolean f54148f;
    /* renamed from: g */
    protected int f54149g;
    /* renamed from: h */
    protected int f54150h;

    public enum TestWaitStrategy implements Runnable {
        SPIN {
            public void run() {
            }
        },
        YIELD {
            public void run() {
                Thread.yield();
            }
        },
        SLEEP_1MS {
            public void run() {
                TestWaitStrategy.sleep(1);
            }
        },
        SLEEP_10MS {
            public void run() {
                TestWaitStrategy.sleep(10);
            }
        },
        SLEEP_100MS {
            public void run() {
                TestWaitStrategy.sleep(100);
            }
        },
        SLEEP_1000MS {
            public void run() {
                TestWaitStrategy.sleep(AdError.NETWORK_ERROR_CODE);
            }
        };

        public abstract void run();

        static void sleep(int i) {
            try {
                Thread.sleep((long) i);
            } catch (int i2) {
                throw new RuntimeException(i2);
            }
        }
    }
}
