package com.tinder.recs.engine;

import com.tinder.domain.meta.model.DiscoverySettings;
import io.reactivex.functions.Consumer;

final /* synthetic */ class RecsEngineResolver$$Lambda$2 implements Consumer {
    private final RecsEngineResolver arg$1;

    RecsEngineResolver$$Lambda$2(RecsEngineResolver recsEngineResolver) {
        this.arg$1 = recsEngineResolver;
    }

    public void accept(Object obj) {
        this.arg$1.lambda$new$1$RecsEngineResolver((DiscoverySettings) obj);
    }
}
