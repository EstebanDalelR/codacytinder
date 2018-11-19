package com.tinder.updates;

import android.support.annotation.NonNull;
import com.tinder.data.updates.C8809l;
import javax.inject.Inject;

/* renamed from: com.tinder.updates.a */
public class C17218a implements UpdatesScheduler {
    @NonNull
    /* renamed from: a */
    private final C8809l f52793a;
    /* renamed from: b */
    private boolean f52794b;

    @Inject
    public C17218a(@NonNull C8809l c8809l) {
        this.f52793a = c8809l;
    }

    public boolean schedule() {
        return m63108a();
    }

    public synchronized boolean unschedule() {
        if (!this.f52794b) {
            return false;
        }
        this.f52793a.b();
        this.f52794b = false;
        return true;
    }

    /* renamed from: a */
    private synchronized boolean m63108a() {
        if (this.f52794b) {
            return false;
        }
        this.f52793a.a();
        this.f52794b = true;
        return true;
    }
}
