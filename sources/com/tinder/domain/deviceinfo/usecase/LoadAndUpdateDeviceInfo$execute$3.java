package com.tinder.domain.deviceinfo.usecase;

import com.tinder.common.logger.Logger;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class LoadAndUpdateDeviceInfo$execute$3<T> implements Consumer<Throwable> {
    final /* synthetic */ LoadAndUpdateDeviceInfo this$0;

    LoadAndUpdateDeviceInfo$execute$3(LoadAndUpdateDeviceInfo loadAndUpdateDeviceInfo) {
        this.this$0 = loadAndUpdateDeviceInfo;
    }

    public final void accept(Throwable th) {
        Logger access$getLogger$p = this.this$0.logger;
        C2668g.a(th, "it");
        access$getLogger$p.error(th, "Failed to load deviceInfo.");
    }
}
