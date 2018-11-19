package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.o */
final class C4511o implements Executor {
    C4511o() {
    }

    public final void execute(@NonNull Runnable runnable) {
        runnable.run();
    }
}
