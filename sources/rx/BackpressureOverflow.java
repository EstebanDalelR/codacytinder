package rx;

import rx.exceptions.MissingBackpressureException;

public final class BackpressureOverflow {
    /* renamed from: a */
    public static final Strategy f60535a = C19554c.f61073a;
    /* renamed from: b */
    public static final Strategy f60536b = f60535a;
    /* renamed from: c */
    public static final Strategy f60537c = C19553b.f61072a;
    /* renamed from: d */
    public static final Strategy f60538d = C19552a.f61071a;

    public interface Strategy {
        boolean mayAttemptDrop() throws MissingBackpressureException;
    }

    /* renamed from: rx.BackpressureOverflow$a */
    static final class C19552a implements Strategy {
        /* renamed from: a */
        static final C19552a f61071a = new C19552a();

        public boolean mayAttemptDrop() {
            return false;
        }

        private C19552a() {
        }
    }

    /* renamed from: rx.BackpressureOverflow$b */
    static final class C19553b implements Strategy {
        /* renamed from: a */
        static final C19553b f61072a = new C19553b();

        public boolean mayAttemptDrop() {
            return true;
        }

        private C19553b() {
        }
    }

    /* renamed from: rx.BackpressureOverflow$c */
    static final class C19554c implements Strategy {
        /* renamed from: a */
        static final C19554c f61073a = new C19554c();

        private C19554c() {
        }

        public boolean mayAttemptDrop() throws MissingBackpressureException {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }
}
