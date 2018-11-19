package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.g */
final class C6290g<TResult> implements C4509m<TResult> {
    /* renamed from: a */
    private final Executor f23556a;
    /* renamed from: b */
    private final Object f23557b = new Object();
    /* renamed from: c */
    private OnCompleteListener<TResult> f23558c;

    public C6290g(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f23556a = executor;
        this.f23558c = onCompleteListener;
    }

    /* renamed from: a */
    public final void mo4754a(@NonNull C4500a<TResult> c4500a) {
        synchronized (this.f23557b) {
            if (this.f23558c == null) {
                return;
            }
            this.f23556a.execute(new C4506h(this, c4500a));
        }
    }
}
