package com.tinder.recs.view;

import com.tinder.cardstack.model.C8395a;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.view.InAppNotificationView.Listener;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recs.presenter.RecsPresenter;
import com.tinder.screenshotty.p401a.C14826a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import rx.Completable;
import rx.functions.Action0;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/pushnotifications/model/TinderNotification;", "call"}, k = 3, mv = {1, 1, 10})
final class RecsView$sendScreenshotInAppNotification$1<T, R> implements Func1<TinderNotification, Completable> {
    final /* synthetic */ C14826a $screenshot;
    final /* synthetic */ C8395a $topCard;
    final /* synthetic */ RecsView this$0;

    RecsView$sendScreenshotInAppNotification$1(RecsView recsView, C8395a c8395a, C14826a c14826a) {
        this.this$0 = recsView;
        this.$topCard = c8395a;
        this.$screenshot = c14826a;
    }

    public final Completable call(final TinderNotification tinderNotification) {
        return Completable.a(new Action0() {
            public final void call() {
                tinderNotification.m55582a((Listener) new Listener() {
                    public void onInAppNotificationClicked() {
                        RecsPresenter presenter$Tinder_release = this.this$0.getPresenter$Tinder_release();
                        UserRec userRec = ((UserRecCard) this.$topCard).userRec();
                        C2668g.a(userRec, "topCard.userRec()");
                        presenter$Tinder_release.handleInAppNotificationClick(userRec, this.$screenshot);
                    }
                });
                C14550a notificationDispatcher$Tinder_release = this.this$0.getNotificationDispatcher$Tinder_release();
                TinderNotification tinderNotification = tinderNotification;
                C2668g.a(tinderNotification, "it");
                notificationDispatcher$Tinder_release.m55573a(tinderNotification);
            }
        });
    }
}
