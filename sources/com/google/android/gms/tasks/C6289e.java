package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.e */
final class C6289e<TResult, TContinuationResult> implements C4509m<TResult> {
    /* renamed from: a */
    private final Executor f23553a;
    /* renamed from: b */
    private final Continuation<TResult, TContinuationResult> f23554b;
    /* renamed from: c */
    private final C6293p<TContinuationResult> f23555c;

    public C6289e(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation, @NonNull C6293p<TContinuationResult> c6293p) {
        this.f23553a = executor;
        this.f23554b = continuation;
        this.f23555c = c6293p;
    }

    /* renamed from: a */
    public final void mo4754a(@NonNull C4500a<TResult> c4500a) {
        this.f23553a.execute(new C4505f(this, c4500a));
    }
}
