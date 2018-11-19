package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.ad;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.tasks.d */
public final class C4504d {

    /* renamed from: com.google.android.gms.tasks.d$b */
    interface C6288b extends OnFailureListener, OnSuccessListener<Object> {
    }

    /* renamed from: com.google.android.gms.tasks.d$a */
    static final class C7367a implements C6288b {
        /* renamed from: a */
        private final CountDownLatch f27083a;

        private C7367a() {
            this.f27083a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public final void m31717a() throws InterruptedException {
            this.f27083a.await();
        }

        public final void onFailure(@NonNull Exception exception) {
            this.f27083a.countDown();
        }

        public final void onSuccess(Object obj) {
            this.f27083a.countDown();
        }
    }

    /* renamed from: a */
    public static <TResult> TResult m20377a(@NonNull C4500a<TResult> c4500a) throws ExecutionException, InterruptedException {
        ad.c("Must not be called on the main application thread");
        ad.a(c4500a, "Task must not be null");
        if (c4500a.mo4763a()) {
            return C4504d.m20379b(c4500a);
        }
        Object c7367a = new C7367a();
        C4504d.m20378a(c4500a, c7367a);
        c7367a.m31717a();
        return C4504d.m20379b(c4500a);
    }

    /* renamed from: a */
    private static void m20378a(C4500a<?> c4500a, C6288b c6288b) {
        c4500a.mo4762a(C4503c.f16742b, (OnSuccessListener) c6288b);
        c4500a.mo4761a(C4503c.f16742b, (OnFailureListener) c6288b);
    }

    /* renamed from: b */
    private static <TResult> TResult m20379b(C4500a<TResult> c4500a) throws ExecutionException {
        if (c4500a.mo4764b()) {
            return c4500a.mo4765c();
        }
        throw new ExecutionException(c4500a.mo4766d());
    }
}
