package com.google.android.gms.gcm;

import android.support.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.gcm.e */
final class C2548e implements ThreadFactory {
    /* renamed from: a */
    private final AtomicInteger f7750a = new AtomicInteger(1);

    C2548e(GcmTaskService gcmTaskService) {
    }

    public final Thread newThread(@NonNull Runnable runnable) {
        int andIncrement = this.f7750a.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append("gcm-task#");
        stringBuilder.append(andIncrement);
        Thread thread = new Thread(runnable, stringBuilder.toString());
        thread.setPriority(4);
        return thread;
    }
}
