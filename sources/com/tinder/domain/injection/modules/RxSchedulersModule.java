package com.tinder.domain.injection.modules;

import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import com.tinder.domain.injection.qualifiers.FeedTrackerScheduler;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import dagger.Module;
import dagger.Provides;
import io.reactivex.C15679f;
import io.reactivex.schedulers.C15756a;
import java.util.concurrent.Executors;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.C2671a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\nJ\r\u0010\u000b\u001a\u00020\tH\u0001¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/tinder/domain/injection/modules/RxSchedulersModule;", "", "()V", "providesComputationScheduler", "Lio/reactivex/Scheduler;", "providesComputationScheduler$domain_release", "providesIoScheduler", "providesIoScheduler$domain_release", "providesRxJava1ComputationScheduler", "Lrx/Scheduler;", "providesRxJava1ComputationScheduler$domain_release", "providesRxJava1FeedTrackerScheduler", "providesRxJava1FeedTrackerScheduler$domain_release", "domain_release"}, k = 1, mv = {1, 1, 10})
@Module
public final class RxSchedulersModule {
    @NotNull
    @ComputationScheduler
    @Provides
    public final C2671a providesRxJava1ComputationScheduler$domain_release() {
        C2671a computation = Schedulers.computation();
        C2668g.a(computation, "rx.schedulers.Schedulers.computation()");
        return computation;
    }

    @FeedTrackerScheduler
    @Singleton
    @NotNull
    @Provides
    public final C2671a providesRxJava1FeedTrackerScheduler$domain_release() {
        C2671a from = Schedulers.from(Executors.newSingleThreadExecutor());
        C2668g.a(from, "rx.schedulers.Schedulers…ewSingleThreadExecutor())");
        return from;
    }

    @NotNull
    @ComputationScheduler
    @Provides
    public final C15679f providesComputationScheduler$domain_release() {
        C15679f a = C15756a.a();
        C2668g.a(a, "Schedulers.computation()");
        return a;
    }

    @NotNull
    @IoScheduler
    @Provides
    public final C15679f providesIoScheduler$domain_release() {
        C15679f b = C15756a.b();
        C2668g.a(b, "Schedulers.io()");
        return b;
    }
}
