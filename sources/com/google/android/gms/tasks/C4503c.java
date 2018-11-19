package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.c */
public final class C4503c {
    /* renamed from: a */
    public static final Executor f16741a = new C4502a();
    /* renamed from: b */
    static final Executor f16742b = new C4511o();

    /* renamed from: com.google.android.gms.tasks.c$a */
    static final class C4502a implements Executor {
        /* renamed from: a */
        private final Handler f16740a = new Handler(Looper.getMainLooper());

        public final void execute(@NonNull Runnable runnable) {
            this.f16740a.post(runnable);
        }
    }
}
