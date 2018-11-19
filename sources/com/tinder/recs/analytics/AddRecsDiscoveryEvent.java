package com.tinder.recs.analytics;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.p076a.C2640a;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.etl.event.tw;
import javax.inject.Inject;
import rx.Completable;
import rx.CompletableEmitter;

public class AddRecsDiscoveryEvent implements CompletableUseCase<Boolean> {
    @NonNull
    private final C2630h fireworks;

    @Inject
    public AddRecsDiscoveryEvent(@NonNull C2630h c2630h) {
        this.fireworks = c2630h;
    }

    @NonNull
    public Completable execute(@NonNull Boolean bool) {
        C2640a.a(bool);
        return Completable.a(new AddRecsDiscoveryEvent$$Lambda$0(this, bool));
    }

    final /* synthetic */ void lambda$execute$0$AddRecsDiscoveryEvent(@NonNull Boolean bool, CompletableEmitter completableEmitter) {
        this.fireworks.a(tw.a().a(bool).a());
        completableEmitter.onCompleted();
    }
}
