package com.tinder.ads;

import com.tinder.domain.common.model.Subscription;
import kotlin.Metadata;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "subscription", "Lcom/tinder/domain/common/model/Subscription;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class V1RecsAdsMonitor$start$2<T> implements Action1<Subscription> {
    final /* synthetic */ V1RecsAdsMonitor this$0;

    V1RecsAdsMonitor$start$2(V1RecsAdsMonitor v1RecsAdsMonitor) {
        this.this$0 = v1RecsAdsMonitor;
    }

    public final void call(Subscription subscription) {
        if (subscription.isActiveSubscription() != null) {
            this.this$0.adAggregator.disable();
        } else {
            this.this$0.adAggregator.enable();
        }
    }
}
