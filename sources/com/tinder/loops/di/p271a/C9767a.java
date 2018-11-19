package com.tinder.loops.di.p271a;

import android.arch.lifecycle.ViewModelProvider.Factory;
import android.content.Context;
import com.tinder.common.reactivex.p319a.p320a.C10696a;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.injection.ForApplication;
import com.tinder.rx.RxSchedulerProvider;
import com.tinder.viewmodel.C17260a;
import dagger.Module;
import dagger.Provides;
import io.reactivex.C15679f;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/tinder/loops/di/module/LoopsModule;", "", "()V", "bindViewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/tinder/viewmodel/DemoViewModelFactory;", "bindViewModelFactory$loops_release", "provideApplication", "Landroid/content/Context;", "context", "provideRxSchedulerProvider", "Lcom/tinder/rx/RxSchedulerProvider;", "provideSchedulers", "Lcom/tinder/common/reactivex/schedulers/Schedulers;", "loops_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.loops.di.a.a */
public final class C9767a {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004H\u0016¨\u0006\b"}, d2 = {"com/tinder/loops/di/module/LoopsModule$provideRxSchedulerProvider$1", "Lcom/tinder/rx/RxSchedulerProvider;", "()V", "computation", "Lio/reactivex/Scheduler;", "io", "ui", "kotlin.jvm.PlatformType", "loops_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.di.a.a$a */
    public static final class C11932a implements RxSchedulerProvider {
        C11932a() {
        }

        public C15679f ui() {
            return C15674a.a();
        }

        @NotNull
        public C15679f computation() {
            return C15756a.a();
        }

        @NotNull
        public C15679f io() {
            return C15756a.b();
        }
    }

    @Singleton
    @NotNull
    @ForApplication
    @Provides
    /* renamed from: a */
    public final Context m40309a(@NotNull @com.tinder.module.ForApplication Context context) {
        C2668g.b(context, "context");
        return context;
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final RxSchedulerProvider m40310a() {
        return new C11932a();
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final Factory m40308a(@NotNull C17260a c17260a) {
        C2668g.b(c17260a, "factory");
        return c17260a;
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final Schedulers m40311b() {
        return C10696a.f35038a;
    }
}
