package com.tinder.recs.presenter;

import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/recs/presenter/RecsStatusPresenter$handleSettingsUpdateButtonClick$1", "Lcom/tinder/paywall/legacy/PaywallFlowSuccessListener;", "(Lcom/tinder/recs/presenter/RecsStatusPresenter;)V", "handleSuccess", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsStatusPresenter$handleSettingsUpdateButtonClick$1 implements PaywallFlowSuccessListener {
    final /* synthetic */ RecsStatusPresenter this$0;

    RecsStatusPresenter$handleSettingsUpdateButtonClick$1(RecsStatusPresenter recsStatusPresenter) {
        this.this$0 = recsStatusPresenter;
    }

    public void handleSuccess() {
        this.this$0.navigateToSettings();
    }
}
