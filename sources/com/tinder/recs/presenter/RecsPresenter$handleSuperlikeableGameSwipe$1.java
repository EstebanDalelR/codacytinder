package com.tinder.recs.presenter;

import com.tinder.domain.recs.model.UserRec;
import com.tinder.pushnotifications.model.C16265p;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/pushnotifications/model/SuperlikeableNotification;", "call"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$handleSuperlikeableGameSwipe$1<V> implements Callable<Single<T>> {
    final /* synthetic */ UserRec $userRec;
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$handleSuperlikeableGameSwipe$1(RecsPresenter recsPresenter, UserRec userRec) {
        this.this$0 = recsPresenter;
        this.$userRec = userRec;
    }

    @NotNull
    public final Single<C16265p> call() {
        return this.this$0.onSuperlikeRequestSuccess(this.$userRec);
    }
}
