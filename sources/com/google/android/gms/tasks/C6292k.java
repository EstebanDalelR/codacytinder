package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.k */
final class C6292k<TResult> implements C4509m<TResult> {
    /* renamed from: a */
    private final Executor f23562a;
    /* renamed from: b */
    private final Object f23563b = new Object();
    /* renamed from: c */
    private OnSuccessListener<? super TResult> f23564c;

    public C6292k(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.f23562a = executor;
        this.f23564c = onSuccessListener;
    }

    /* renamed from: a */
    public final void mo4754a(@NonNull C4500a<TResult> c4500a) {
        if (c4500a.mo4764b()) {
            synchronized (this.f23563b) {
                if (this.f23564c == null) {
                    return;
                }
                this.f23562a.execute(new C4508l(this, c4500a));
            }
        }
    }
}
