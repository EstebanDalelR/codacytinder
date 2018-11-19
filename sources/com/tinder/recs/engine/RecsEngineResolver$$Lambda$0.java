package com.tinder.recs.engine;

import com.tinder.domain.recs.model.RecSource;
import rx.functions.Action1;

final /* synthetic */ class RecsEngineResolver$$Lambda$0 implements Action1 {
    private final RecsEngineResolver arg$1;
    private final RecsEngineProvider arg$2;

    RecsEngineResolver$$Lambda$0(RecsEngineResolver recsEngineResolver, RecsEngineProvider recsEngineProvider) {
        this.arg$1 = recsEngineResolver;
        this.arg$2 = recsEngineProvider;
    }

    public void call(Object obj) {
        this.arg$1.lambda$new$0$RecsEngineResolver(this.arg$2, (RecSource) obj);
    }
}
