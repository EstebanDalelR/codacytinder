package com.tinder.recs.presenter;

import com.tinder.domain.meta.model.DiscoverySettings;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "discoverySettings", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$subscribeToDiscoverySettingsChanges$1<T> implements Consumer<DiscoverySettings> {
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$subscribeToDiscoverySettingsChanges$1(RecsPresenter recsPresenter) {
        this.this$0 = recsPresenter;
    }

    public final void accept(DiscoverySettings discoverySettings) {
        if (this.this$0.shouldShowCardStack(discoverySettings) != null) {
            this.this$0.bindSourceState();
            this.this$0.getTarget().switchToCardStackView();
            return;
        }
        this.this$0.getTarget().switchToDiscoveryOffView();
    }
}
