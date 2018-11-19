package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.a */
public abstract class C4500a<TResult> {
    @NonNull
    /* renamed from: a */
    public <TContinuationResult> C4500a<TContinuationResult> mo4755a(@NonNull Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: a */
    public C4500a<TResult> mo4756a(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: a */
    public abstract C4500a<TResult> mo4757a(@NonNull OnFailureListener onFailureListener);

    @NonNull
    /* renamed from: a */
    public abstract C4500a<TResult> mo4758a(@NonNull OnSuccessListener<? super TResult> onSuccessListener);

    @NonNull
    /* renamed from: a */
    public <TContinuationResult> C4500a<TContinuationResult> mo4759a(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: a */
    public C4500a<TResult> mo4760a(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: a */
    public abstract C4500a<TResult> mo4761a(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener);

    @NonNull
    /* renamed from: a */
    public abstract C4500a<TResult> mo4762a(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener);

    /* renamed from: a */
    public abstract boolean mo4763a();

    /* renamed from: b */
    public abstract boolean mo4764b();

    /* renamed from: c */
    public abstract TResult mo4765c();

    @Nullable
    /* renamed from: d */
    public abstract Exception mo4766d();
}
