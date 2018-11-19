package com.tinder.domain.deviceinfo.usecase;

import com.tinder.domain.common.model.DeviceInfo;
import com.tinder.domain.common.repository.DeviceInfoRepository;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "deviceInfo", "Lcom/tinder/domain/common/model/DeviceInfo;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class LoadAndUpdateDeviceInfo$execute$2<T> implements Consumer<DeviceInfo> {
    final /* synthetic */ LoadAndUpdateDeviceInfo this$0;

    LoadAndUpdateDeviceInfo$execute$2(LoadAndUpdateDeviceInfo loadAndUpdateDeviceInfo) {
        this.this$0 = loadAndUpdateDeviceInfo;
    }

    public final void accept(DeviceInfo deviceInfo) {
        DeviceInfoRepository access$getDeviceInfoRepository$p = this.this$0.deviceInfoRepository;
        C2668g.a(deviceInfo, "deviceInfo");
        access$getDeviceInfoRepository$p.update(deviceInfo);
    }
}
