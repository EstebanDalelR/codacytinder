package com.tinder.analytics.fireworks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.TimeUnit;
import p000a.p001a.C0001a;
import rx.C2671a;
import rx.Subscription;

/* renamed from: com.tinder.analytics.fireworks.t */
public class C7332t extends BatchScheduleStrategy {
    @NonNull
    /* renamed from: a */
    private final C2671a f26486a;
    @Nullable
    /* renamed from: b */
    private Subscription f26487b;

    public C7332t(@NonNull C2671a c2671a) {
        this.f26486a = c2671a;
    }

    /* renamed from: a */
    void mo6796a() {
        if (this.f26487b != null) {
            m31294a("Schedule is already started");
        } else {
            this.f26487b = this.f26486a.createWorker().a(new C8144u(this), 10, 30, TimeUnit.SECONDS);
        }
    }

    /* renamed from: b */
    void mo6797b() {
        if (this.f26487b != null) {
            this.f26487b.unsubscribe();
            this.f26487b = null;
        }
    }

    /* renamed from: a */
    void m31294a(String str) {
        C0001a.d(str, new Object[0]);
    }
}
