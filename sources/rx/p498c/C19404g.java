package rx.p498c;

import java.util.concurrent.ThreadFactory;
import rx.C2671a;
import rx.functions.Action0;
import rx.internal.schedulers.C19601a;
import rx.internal.schedulers.C19602b;
import rx.internal.schedulers.C19606f;
import rx.internal.util.RxThreadFactory;

/* renamed from: rx.c.g */
public class C19404g {
    /* renamed from: a */
    private static final C19404g f60581a = new C19404g();

    @Deprecated
    /* renamed from: a */
    public Action0 m69841a(Action0 action0) {
        return action0;
    }

    /* renamed from: d */
    public C2671a m69842d() {
        return null;
    }

    /* renamed from: e */
    public C2671a m69843e() {
        return null;
    }

    /* renamed from: f */
    public C2671a m69844f() {
        return null;
    }

    /* renamed from: a */
    public static C2671a m69834a() {
        return C19404g.m69835a(new RxThreadFactory("RxComputationScheduler-"));
    }

    /* renamed from: a */
    public static C2671a m69835a(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new C19602b(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    /* renamed from: b */
    public static C2671a m69836b() {
        return C19404g.m69837b(new RxThreadFactory("RxIoScheduler-"));
    }

    /* renamed from: b */
    public static C2671a m69837b(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new C19601a(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    /* renamed from: c */
    public static C2671a m69838c() {
        return C19404g.m69839c(new RxThreadFactory("RxNewThreadScheduler-"));
    }

    /* renamed from: c */
    public static C2671a m69839c(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new C19606f(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    /* renamed from: g */
    public static C19404g m69840g() {
        return f60581a;
    }
}
