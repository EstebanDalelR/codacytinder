package com.tinder.domain.feed.usecase;

import kotlin.Metadata;
import rx.Completable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "", "call"}, k = 3, mv = {1, 1, 10})
final class PollForNewFeedItems$execute$2<T, R> implements Func1<Throwable, Completable> {
    public static final PollForNewFeedItems$execute$2 INSTANCE = new PollForNewFeedItems$execute$2();

    PollForNewFeedItems$execute$2() {
    }

    public final Completable call(Throwable th) {
        return Completable.a();
    }
}
