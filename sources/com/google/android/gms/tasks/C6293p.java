package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.ad;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.p */
final class C6293p<TResult> extends C4500a<TResult> {
    /* renamed from: a */
    private final Object f23565a = new Object();
    /* renamed from: b */
    private final C4510n<TResult> f23566b = new C4510n();
    /* renamed from: c */
    private boolean f23567c;
    /* renamed from: d */
    private TResult f23568d;
    /* renamed from: e */
    private Exception f23569e;

    C6293p() {
    }

    /* renamed from: e */
    private final void m27614e() {
        ad.a(this.f23567c, "Task is not yet complete");
    }

    /* renamed from: f */
    private final void m27615f() {
        ad.a(this.f23567c ^ 1, "Task is already complete");
    }

    /* renamed from: g */
    private final void m27616g() {
        synchronized (this.f23565a) {
            if (this.f23567c) {
                this.f23566b.m20381a((C4500a) this);
                return;
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public final <TContinuationResult> C4500a<TContinuationResult> mo4755a(@NonNull Continuation<TResult, TContinuationResult> continuation) {
        return mo4759a(C4503c.f16741a, (Continuation) continuation);
    }

    @NonNull
    /* renamed from: a */
    public final C4500a<TResult> mo4756a(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        return mo4760a(C4503c.f16741a, (OnCompleteListener) onCompleteListener);
    }

    @NonNull
    /* renamed from: a */
    public final C4500a<TResult> mo4757a(@NonNull OnFailureListener onFailureListener) {
        return mo4761a(C4503c.f16741a, onFailureListener);
    }

    @NonNull
    /* renamed from: a */
    public final C4500a<TResult> mo4758a(@NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        return mo4762a(C4503c.f16741a, (OnSuccessListener) onSuccessListener);
    }

    @NonNull
    /* renamed from: a */
    public final <TContinuationResult> C4500a<TContinuationResult> mo4759a(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation) {
        C4500a c6293p = new C6293p();
        this.f23566b.m20382a(new C6289e(executor, continuation, c6293p));
        m27616g();
        return c6293p;
    }

    @NonNull
    /* renamed from: a */
    public final C4500a<TResult> mo4760a(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f23566b.m20382a(new C6290g(executor, onCompleteListener));
        m27616g();
        return this;
    }

    @NonNull
    /* renamed from: a */
    public final C4500a<TResult> mo4761a(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.f23566b.m20382a(new C6291i(executor, onFailureListener));
        m27616g();
        return this;
    }

    @NonNull
    /* renamed from: a */
    public final C4500a<TResult> mo4762a(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.f23566b.m20382a(new C6292k(executor, onSuccessListener));
        m27616g();
        return this;
    }

    /* renamed from: a */
    public final void m27625a(@NonNull Exception exception) {
        ad.a(exception, "Exception must not be null");
        synchronized (this.f23565a) {
            m27615f();
            this.f23567c = true;
            this.f23569e = exception;
        }
        this.f23566b.m20381a((C4500a) this);
    }

    /* renamed from: a */
    public final void m27626a(TResult tResult) {
        synchronized (this.f23565a) {
            m27615f();
            this.f23567c = true;
            this.f23568d = tResult;
        }
        this.f23566b.m20381a((C4500a) this);
    }

    /* renamed from: a */
    public final boolean mo4763a() {
        boolean z;
        synchronized (this.f23565a) {
            z = this.f23567c;
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo4764b() {
        boolean z;
        synchronized (this.f23565a) {
            z = this.f23567c && this.f23569e == null;
        }
        return z;
    }

    /* renamed from: b */
    public final boolean m27629b(@NonNull Exception exception) {
        ad.a(exception, "Exception must not be null");
        synchronized (this.f23565a) {
            if (this.f23567c) {
                return false;
            }
            this.f23567c = true;
            this.f23569e = exception;
            this.f23566b.m20381a((C4500a) this);
            return true;
        }
    }

    /* renamed from: b */
    public final boolean m27630b(TResult tResult) {
        synchronized (this.f23565a) {
            if (this.f23567c) {
                return false;
            }
            this.f23567c = true;
            this.f23568d = tResult;
            this.f23566b.m20381a((C4500a) this);
            return true;
        }
    }

    /* renamed from: c */
    public final TResult mo4765c() {
        TResult tResult;
        synchronized (this.f23565a) {
            m27614e();
            if (this.f23569e != null) {
                throw new RuntimeExecutionException(this.f23569e);
            }
            tResult = this.f23568d;
        }
        return tResult;
    }

    @Nullable
    /* renamed from: d */
    public final Exception mo4766d() {
        Exception exception;
        synchronized (this.f23565a) {
            exception = this.f23569e;
        }
        return exception;
    }
}
