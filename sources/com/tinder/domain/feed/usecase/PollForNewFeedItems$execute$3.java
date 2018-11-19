package com.tinder.domain.feed.usecase;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012.\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Observable;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "observable", "call"}, k = 3, mv = {1, 1, 10})
final class PollForNewFeedItems$execute$3<T, R> implements Func1<Observable<? extends Void>, Observable<?>> {
    final /* synthetic */ PollForNewFeedItems this$0;

    PollForNewFeedItems$execute$3(PollForNewFeedItems pollForNewFeedItems) {
        this.this$0 = pollForNewFeedItems;
    }

    public final Observable<Void> call(final Observable<? extends Void> observable) {
        return this.this$0.repository.pollIntervalSeconds().b(new Func1<T, Observable<? extends R>>() {
            public final Observable<? extends Void> call(Integer num) {
                return observable.d((long) num.intValue(), TimeUnit.SECONDS, this.this$0.timerScheduler);
            }
        });
    }
}
