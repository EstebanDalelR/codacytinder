package com.tinder.domain.deviceinfo.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.common.repository.DeviceInfoRepository;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import io.reactivex.C15679f;
import io.reactivex.C3960g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/domain/deviceinfo/usecase/LoadAndUpdateDeviceInfo;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/domain/deviceinfo/usecase/LoadAndUpdateDeviceInfo$Request;", "deviceInfoRepository", "Lcom/tinder/domain/common/repository/DeviceInfoRepository;", "ioScheduler", "Lio/reactivex/Scheduler;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/common/repository/DeviceInfoRepository;Lio/reactivex/Scheduler;Lcom/tinder/common/logger/Logger;)V", "execute", "", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class LoadAndUpdateDeviceInfo implements VoidUseCase<Request> {
    private final DeviceInfoRepository deviceInfoRepository;
    private final C15679f ioScheduler;
    private final Logger logger;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/deviceinfo/usecase/LoadAndUpdateDeviceInfo$Request;", "", "isShimmerEnabled", "", "deviceYearResolver", "Lkotlin/Function0;", "", "(ZLkotlin/jvm/functions/Function0;)V", "getDeviceYearResolver", "()Lkotlin/jvm/functions/Function0;", "()Z", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @NotNull
        private final Function0<Integer> deviceYearResolver;
        private final boolean isShimmerEnabled;

        public Request(boolean z, @NotNull Function0<Integer> function0) {
            C2668g.b(function0, "deviceYearResolver");
            this.isShimmerEnabled = z;
            this.deviceYearResolver = function0;
        }

        public final boolean isShimmerEnabled() {
            return this.isShimmerEnabled;
        }

        @NotNull
        public final Function0<Integer> getDeviceYearResolver() {
            return this.deviceYearResolver;
        }
    }

    @Inject
    public LoadAndUpdateDeviceInfo(@NotNull DeviceInfoRepository deviceInfoRepository, @NotNull @IoScheduler C15679f c15679f, @NotNull Logger logger) {
        C2668g.b(deviceInfoRepository, "deviceInfoRepository");
        C2668g.b(c15679f, "ioScheduler");
        C2668g.b(logger, "logger");
        this.deviceInfoRepository = deviceInfoRepository;
        this.ioScheduler = c15679f;
        this.logger = logger;
    }

    public void execute(@NotNull Request request) {
        C2668g.b(request, "request");
        C3960g.c(new LoadAndUpdateDeviceInfo$execute$1(request)).b(this.ioScheduler).a(new LoadAndUpdateDeviceInfo$execute$2(this), new LoadAndUpdateDeviceInfo$execute$3(this));
    }
}
