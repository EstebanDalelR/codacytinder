package com.tinder.di;

import com.tinder.domain.di.IoScheduler;
import com.tinder.domain.di.MainThreadScheduler;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.C2671a;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lcom/tinder/di/SchedulerModule;", "", "()V", "provideIoScheduler", "Lrx/Scheduler;", "provideMainThreadScheduler", "engine_release"}, k = 1, mv = {1, 1, 9})
@Module
/* renamed from: com.tinder.di.l */
public final class C8842l {
    @NotNull
    @IoScheduler
    @Provides
    /* renamed from: a */
    public final C2671a m37601a() {
        C2671a io = Schedulers.io();
        C2668g.a(io, "Schedulers.io()");
        return io;
    }

    @NotNull
    @MainThreadScheduler
    @Provides
    /* renamed from: b */
    public final C2671a m37602b() {
        C2671a a = C19397a.a();
        C2668g.a(a, "AndroidSchedulers.mainThread()");
        return a;
    }
}
