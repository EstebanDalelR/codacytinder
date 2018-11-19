package com.tinder.domain.deviceinfo.usecase;

import com.tinder.domain.common.model.DeviceInfo;
import com.tinder.domain.deviceinfo.usecase.LoadAndUpdateDeviceInfo.Request;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/model/DeviceInfo;", "call"}, k = 3, mv = {1, 1, 10})
final class LoadAndUpdateDeviceInfo$execute$1<V> implements Callable<T> {
    final /* synthetic */ Request $request;

    LoadAndUpdateDeviceInfo$execute$1(Request request) {
        this.$request = request;
    }

    @NotNull
    public final DeviceInfo call() {
        int intValue = ((Number) this.$request.getDeviceYearResolver().invoke()).intValue();
        boolean z = intValue >= 2013 && this.$request.isShimmerEnabled();
        return new DeviceInfo(z, intValue);
    }
}
