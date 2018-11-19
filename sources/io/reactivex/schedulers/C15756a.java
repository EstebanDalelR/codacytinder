package io.reactivex.schedulers;

import io.reactivex.C15679f;
import io.reactivex.annotations.NonNull;
import io.reactivex.internal.schedulers.C17514a;
import io.reactivex.internal.schedulers.C17516d;
import io.reactivex.internal.schedulers.C17517e;
import io.reactivex.internal.schedulers.C17518h;
import io.reactivex.internal.schedulers.C17519i;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: io.reactivex.schedulers.a */
public final class C15756a {
    @NonNull
    /* renamed from: a */
    static final C15679f f48677a = C2667a.d(new C15755h());
    @NonNull
    /* renamed from: b */
    static final C15679f f48678b = C2667a.a(new C15749b());
    @NonNull
    /* renamed from: c */
    static final C15679f f48679c = C2667a.b(new C15750c());
    @NonNull
    /* renamed from: d */
    static final C15679f f48680d = C17519i.m63743c();
    @NonNull
    /* renamed from: e */
    static final C15679f f48681e = C2667a.c(new C15753f());

    /* renamed from: io.reactivex.schedulers.a$a */
    static final class C15748a {
        /* renamed from: a */
        static final C15679f f48673a = new C17514a();
    }

    /* renamed from: io.reactivex.schedulers.a$b */
    static final class C15749b implements Callable<C15679f> {
        C15749b() {
        }

        public /* synthetic */ Object call() throws Exception {
            return m59004a();
        }

        /* renamed from: a */
        public C15679f m59004a() throws Exception {
            return C15748a.f48673a;
        }
    }

    /* renamed from: io.reactivex.schedulers.a$c */
    static final class C15750c implements Callable<C15679f> {
        C15750c() {
        }

        public /* synthetic */ Object call() throws Exception {
            return m59005a();
        }

        /* renamed from: a */
        public C15679f m59005a() throws Exception {
            return C15751d.f48674a;
        }
    }

    /* renamed from: io.reactivex.schedulers.a$d */
    static final class C15751d {
        /* renamed from: a */
        static final C15679f f48674a = new C17516d();
    }

    /* renamed from: io.reactivex.schedulers.a$e */
    static final class C15752e {
        /* renamed from: a */
        static final C15679f f48675a = new C17517e();
    }

    /* renamed from: io.reactivex.schedulers.a$f */
    static final class C15753f implements Callable<C15679f> {
        C15753f() {
        }

        public /* synthetic */ Object call() throws Exception {
            return m59006a();
        }

        /* renamed from: a */
        public C15679f m59006a() throws Exception {
            return C15752e.f48675a;
        }
    }

    /* renamed from: io.reactivex.schedulers.a$g */
    static final class C15754g {
        /* renamed from: a */
        static final C15679f f48676a = new C17518h();
    }

    /* renamed from: io.reactivex.schedulers.a$h */
    static final class C15755h implements Callable<C15679f> {
        C15755h() {
        }

        public /* synthetic */ Object call() throws Exception {
            return m59007a();
        }

        /* renamed from: a */
        public C15679f m59007a() throws Exception {
            return C15754g.f48676a;
        }
    }

    @NonNull
    /* renamed from: a */
    public static C15679f m59008a() {
        return C2667a.a(f48678b);
    }

    @NonNull
    /* renamed from: b */
    public static C15679f m59010b() {
        return C2667a.b(f48679c);
    }

    @NonNull
    /* renamed from: c */
    public static C15679f m59011c() {
        return f48680d;
    }

    @NonNull
    /* renamed from: d */
    public static C15679f m59012d() {
        return C2667a.c(f48677a);
    }

    @NonNull
    /* renamed from: a */
    public static C15679f m59009a(@NonNull Executor executor) {
        return new ExecutorScheduler(executor);
    }
}
