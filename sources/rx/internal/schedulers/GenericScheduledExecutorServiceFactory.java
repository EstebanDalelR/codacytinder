package rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import rx.functions.Func0;
import rx.internal.util.RxThreadFactory;
import rx.p498c.C19401c;

enum GenericScheduledExecutorServiceFactory {
    ;
    
    static final RxThreadFactory THREAD_FACTORY = null;
    static final String THREAD_NAME_PREFIX = "RxScheduledExecutorPool-";

    static {
        THREAD_FACTORY = new RxThreadFactory(THREAD_NAME_PREFIX);
    }

    static ThreadFactory threadFactory() {
        return THREAD_FACTORY;
    }

    public static ScheduledExecutorService create() {
        Func0 c = C19401c.m69819c();
        if (c == null) {
            return createDefault();
        }
        return (ScheduledExecutorService) c.call();
    }

    static ScheduledExecutorService createDefault() {
        return Executors.newScheduledThreadPool(1, threadFactory());
    }
}
