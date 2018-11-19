package rx;

import java.util.concurrent.TimeUnit;
import rx.functions.Action0;
import rx.internal.schedulers.SchedulePeriodicHelper;

public abstract class a$a implements Subscription {
    /* renamed from: a */
    public abstract Subscription mo14740a(Action0 action0);

    /* renamed from: a */
    public abstract Subscription mo14741a(Action0 action0, long j, TimeUnit timeUnit);

    /* renamed from: a */
    public Subscription mo14760a(Action0 action0, long j, long j2, TimeUnit timeUnit) {
        return SchedulePeriodicHelper.m69908a(this, action0, j, j2, timeUnit, null);
    }

    /* renamed from: a */
    public long mo14759a() {
        return System.currentTimeMillis();
    }
}
