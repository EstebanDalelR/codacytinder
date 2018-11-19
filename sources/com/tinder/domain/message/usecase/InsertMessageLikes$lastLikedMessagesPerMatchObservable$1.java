package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageLike;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/tinder/domain/message/MessageLike;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class InsertMessageLikes$lastLikedMessagesPerMatchObservable$1<V> implements Callable<ObservableSource<? extends T>> {
    final /* synthetic */ List $messageLikes;
    final /* synthetic */ InsertMessageLikes this$0;

    InsertMessageLikes$lastLikedMessagesPerMatchObservable$1(InsertMessageLikes insertMessageLikes, List list) {
        this.this$0 = insertMessageLikes;
        this.$messageLikes = list;
    }

    public final C3959e<MessageLike> call() {
        return C3959e.fromIterable(this.this$0.lastLikedMessagesPerMatch(this.$messageLikes));
    }
}
