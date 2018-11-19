package com.firebase.jobdispatcher;

import android.support.annotation.NonNull;
import com.firebase.jobdispatcher.C3491i.C3490a;
import com.firebase.jobdispatcher.RetryStrategy.C1874a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class FirebaseJobDispatcher {
    /* renamed from: a */
    private final Driver f5083a;
    /* renamed from: b */
    private final ValidationEnforcer f5084b;
    /* renamed from: c */
    private final C1874a f5085c = new C1874a(this.f5084b);

    @Retention(RetentionPolicy.SOURCE)
    public @interface CancelResult {
    }

    public static final class ScheduleFailedException extends RuntimeException {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScheduleResult {
    }

    public FirebaseJobDispatcher(Driver driver) {
        this.f5083a = driver;
        this.f5084b = new ValidationEnforcer(driver.getValidator());
    }

    /* renamed from: a */
    public int m6564a(@NonNull C3491i c3491i) {
        if (this.f5083a.isAvailable()) {
            return this.f5083a.schedule(c3491i);
        }
        return 2;
    }

    /* renamed from: a */
    public int m6565a(@NonNull String str) {
        if (this.f5083a.isAvailable()) {
            return this.f5083a.cancel(str);
        }
        return 2;
    }

    /* renamed from: b */
    public void m6567b(C3491i c3491i) {
        if (m6564a(c3491i) != null) {
            throw new ScheduleFailedException();
        }
    }

    @NonNull
    /* renamed from: a */
    public C3490a m6566a() {
        return new C3490a(this.f5084b);
    }
}
