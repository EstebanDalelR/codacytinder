package com.tinder.recs.presenter;

import com.tinder.domain.recs.model.UserRec;
import com.tinder.recs.analytics.AddRecsViewEvent;
import com.tinder.recs.card.UserRecCard;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.schedulers.Schedulers;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/recs/presenter/UserRecCardPresenter;", "Lcom/tinder/recs/presenter/RecCardPresenter;", "Lcom/tinder/recs/card/UserRecCard;", "addRecsViewEvent", "Lcom/tinder/recs/analytics/AddRecsViewEvent;", "(Lcom/tinder/recs/analytics/AddRecsViewEvent;)V", "handleCardMovedToTop", "", "userRecCard", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class UserRecCardPresenter extends RecCardPresenter<UserRecCard> {
    private final AddRecsViewEvent addRecsViewEvent;

    @Inject
    public UserRecCardPresenter(@NotNull AddRecsViewEvent addRecsViewEvent) {
        C2668g.b(addRecsViewEvent, "addRecsViewEvent");
        this.addRecsViewEvent = addRecsViewEvent;
    }

    public void handleCardMovedToTop(@NotNull UserRecCard userRecCard) {
        C2668g.b(userRecCard, "userRecCard");
        this.addRecsViewEvent.execute((UserRec) userRecCard.getItem()).b(Schedulers.io()).b(RxUtils.b());
    }
}
