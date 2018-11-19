package com.tinder.domain.feed.usecase;

import com.tinder.domain.feed.FeedRequestResult;
import kotlin.Metadata;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/domain/feed/FeedRequestResult;", "kotlin.jvm.PlatformType", "it", "", "call"}, k = 3, mv = {1, 1, 10})
final class PollFeed$execute$2<T, R> implements Func1<Throwable, Observable<? extends FeedRequestResult>> {
    public static final PollFeed$execute$2 INSTANCE = new PollFeed$execute$2();

    PollFeed$execute$2() {
    }

    public final Observable<FeedRequestResult> call(Throwable th) {
        return Observable.c();
    }
}
