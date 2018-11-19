package com.tinder.data.p210b;

import com.tinder.domain.common.model.DeviceInfo;
import com.tinder.domain.common.repository.DeviceInfoRepository;
import io.reactivex.C3957b;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u00040\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/data/common/DeviceInfoDataRepository;", "Lcom/tinder/domain/common/repository/DeviceInfoRepository;", "()V", "defaultDeviceInfo", "Lcom/tinder/domain/common/model/DeviceInfo;", "processor", "Lio/reactivex/processors/FlowableProcessor;", "kotlin.jvm.PlatformType", "observe", "Lio/reactivex/Flowable;", "update", "", "deviceInfo", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.b.a */
public final class C10748a implements DeviceInfoRepository {
    /* renamed from: a */
    private final DeviceInfo f35143a = new DeviceInfo(false, -1);
    /* renamed from: b */
    private final C18430a<DeviceInfo> f35144b = BehaviorProcessor.d(this.f35143a).u();

    @NotNull
    public C3957b<DeviceInfo> observe() {
        C3957b<DeviceInfo> j = this.f35144b.g().j();
        C2668g.a(j, "processor.hide().onBackpressureLatest()");
        return j;
    }

    public void update(@NotNull DeviceInfo deviceInfo) {
        C2668g.b(deviceInfo, "deviceInfo");
        this.f35144b.onNext(deviceInfo);
    }
}
