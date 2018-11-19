package org.apache.commons.lang3;

public class ThreadUtils {
    /* renamed from: a */
    public static final C17713a f49637a = new C17713a();

    public interface ThreadGroupPredicate {
        boolean test(ThreadGroup threadGroup);
    }

    public interface ThreadPredicate {
        boolean test(Thread thread);
    }

    /* renamed from: org.apache.commons.lang3.ThreadUtils$a */
    private static final class C17713a implements ThreadGroupPredicate, ThreadPredicate {
        public boolean test(Thread thread) {
            return true;
        }

        public boolean test(ThreadGroup threadGroup) {
            return true;
        }

        private C17713a() {
        }
    }
}
