package com.tinder.injection.p261a;

import com.tinder.common.reactivex.p319a.p320a.C10696a;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import dagger.Module;
import dagger.Provides;
import io.reactivex.C15679f;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.C2671a;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\bJ\r\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/injection/modules/RxAndroidSchedulersModule;", "", "()V", "provideSchedulers", "Lcom/tinder/common/reactivex/schedulers/Schedulers;", "provideSchedulers$Tinder_release", "providesMainThreadScheduler", "Lio/reactivex/Scheduler;", "providesMainThreadScheduler$Tinder_release", "providesRxJava1MainThreadScheduler", "Lrx/Scheduler;", "providesRxJava1MainThreadScheduler$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.injection.a.a */
public final class C9707a {
    @NotNull
    @MainThreadScheduler
    @Provides
    /* renamed from: a */
    public final C2671a m40170a() {
        C2671a a = C19397a.a();
        C2668g.a(a, "rx.android.schedulers.An…idSchedulers.mainThread()");
        return a;
    }

    @NotNull
    @MainThreadScheduler
    @Provides
    /* renamed from: b */
    public final C15679f m40171b() {
        return C10696a.f35038a.mainThread();
    }

    @NotNull
    @Provides
    /* renamed from: c */
    public final Schedulers m40172c() {
        return C10696a.f35038a;
    }
}
