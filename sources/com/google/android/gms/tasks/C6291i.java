package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.i */
final class C6291i<TResult> implements C4509m<TResult> {
    /* renamed from: a */
    private final Executor f23559a;
    /* renamed from: b */
    private final Object f23560b = new Object();
    /* renamed from: c */
    private OnFailureListener f23561c;

    public C6291i(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.f23559a = executor;
        this.f23561c = onFailureListener;
    }

    /* renamed from: a */
    public final void mo4754a(@NonNull C4500a<TResult> c4500a) {
        if (!c4500a.mo4764b()) {
            synchronized (this.f23560b) {
                if (this.f23561c == null) {
                    return;
                }
                this.f23559a.execute(new C4507j(this, c4500a));
            }
        }
    }
}
