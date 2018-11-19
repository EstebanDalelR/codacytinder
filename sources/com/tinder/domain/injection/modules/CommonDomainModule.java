package com.tinder.domain.injection.modules;

import com.tinder.domain.injection.qualifiers.CurrentDateTimeMillis;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.injection.qualifiers.TimeIntervalMins;
import com.tinder.domain.injection.qualifiers.UtcOffsetMins;
import com.tinder.domain.loops.usecase.GetAutoPlayLoopsEnabled;
import com.tinder.domain.loops.usecase.GetAutoPlayLoopsEnabledStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.CheckTutorialViewedStatus;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewedStatus;
import dagger.Module;
import dagger.Provides;
import io.reactivex.C3959e;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0001¢\u0006\u0002\b\u0010J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0001¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0001¢\u0006\u0002\b\u001bJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000eH\u0001¢\u0006\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/tinder/domain/injection/modules/CommonDomainModule;", "", "()V", "provideCheckedTutorial", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewedStatus;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "provideCheckedTutorial$domain_release", "provideConfirmTutorial", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewedStatus;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "provideConfirmTutorial$domain_release", "provideCurrentDateTimeMillis", "Lkotlin/Function0;", "", "provideCurrentDateTimeMillis$domain_release", "provideDateTimeProvider", "Lorg/joda/time/DateTime;", "provideDateTimeProvider$domain_release", "provideGetAutoPlayLoopsEnabledStatus", "Lcom/tinder/domain/loops/usecase/GetAutoPlayLoopsEnabledStatus;", "getAutoPlayLoopsEnabled", "Lcom/tinder/domain/loops/usecase/GetAutoPlayLoopsEnabled;", "provideGetAutoPlayLoopsEnabledStatus$domain_release", "provideTimeIntervalMins", "Lio/reactivex/Observable;", "provideTimeIntervalMins$domain_release", "provideUtcOffsetMins", "", "provideUtcOffsetMins$domain_release", "domain_release"}, k = 1, mv = {1, 1, 10})
@Module
public final class CommonDomainModule {
    @DefaultDateTimeProvider
    @NotNull
    @Provides
    public final Function0<DateTime> provideDateTimeProvider$domain_release() {
        return CommonDomainModule$provideDateTimeProvider$1.INSTANCE;
    }

    @CurrentDateTimeMillis
    @NotNull
    @Provides
    public final Function0<Long> provideCurrentDateTimeMillis$domain_release() {
        return CommonDomainModule$provideCurrentDateTimeMillis$1.INSTANCE;
    }

    @NotNull
    @UtcOffsetMins
    @Provides
    public final Function0<Integer> provideUtcOffsetMins$domain_release() {
        return CommonDomainModule$provideUtcOffsetMins$1.INSTANCE;
    }

    @TimeIntervalMins
    @NotNull
    @Provides
    public final C3959e<Long> provideTimeIntervalMins$domain_release() {
        C3959e<Long> interval = C3959e.interval(0, 1, TimeUnit.MINUTES);
        C2668g.a(interval, "Observable.interval(0, 1, TimeUnit.MINUTES)");
        return interval;
    }

    @NotNull
    @Provides
    public final ConfirmTutorialsViewedStatus provideConfirmTutorial$domain_release(@NotNull ConfirmTutorialsViewed confirmTutorialsViewed) {
        C2668g.b(confirmTutorialsViewed, "confirmTutorialsViewed");
        return confirmTutorialsViewed;
    }

    @NotNull
    @Provides
    public final CheckTutorialViewedStatus provideCheckedTutorial$domain_release(@NotNull CheckTutorialViewed checkTutorialViewed) {
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        return checkTutorialViewed;
    }

    @NotNull
    @Provides
    public final GetAutoPlayLoopsEnabledStatus provideGetAutoPlayLoopsEnabledStatus$domain_release(@NotNull GetAutoPlayLoopsEnabled getAutoPlayLoopsEnabled) {
        C2668g.b(getAutoPlayLoopsEnabled, "getAutoPlayLoopsEnabled");
        return getAutoPlayLoopsEnabled;
    }
}
