package com.tinder.places.recs.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.recs.model.UserRec.Teaser;
import com.tinder.places.recs.target.PlacesUserRecCardTarget;
import com.tinder.recs.analytics.AddRecsViewEvent;
import com.tinder.recs.card.UserRecCard;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/tinder/places/recs/presenter/PlacesUserRecCardPresenter;", "", "addRecsViewEvent", "Lcom/tinder/recs/analytics/AddRecsViewEvent;", "(Lcom/tinder/recs/analytics/AddRecsViewEvent;)V", "target", "Lcom/tinder/places/recs/target/PlacesUserRecCardTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/recs/target/PlacesUserRecCardTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/recs/target/PlacesUserRecCardTarget;)V", "bindInfo", "", "userRecCard", "Lcom/tinder/recs/card/UserRecCard;", "handleBindUserRec", "userRec", "Lcom/tinder/domain/recs/model/UserRec;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.recs.presenter.f */
public final class C10279f {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesUserRecCardTarget f33417a;
    /* renamed from: b */
    private final AddRecsViewEvent f33418b;

    @Inject
    public C10279f(@NotNull AddRecsViewEvent addRecsViewEvent) {
        C2668g.b(addRecsViewEvent, "addRecsViewEvent");
        this.f33418b = addRecsViewEvent;
    }

    /* renamed from: a */
    public final void m41674a(@NotNull UserRecCard userRecCard) {
        C2668g.b(userRecCard, "userRecCard");
        UserRec userRec = userRecCard.userRec();
        C2668g.a(userRec, "userRecCard.userRec()");
        m41673a(userRec);
        PlacesUserRecCardTarget placesUserRecCardTarget = this.f33417a;
        if (placesUserRecCardTarget == null) {
            C2668g.b("target");
        }
        placesUserRecCardTarget.bindHeadLineViews(userRecCard);
        userRecCard = userRecCard.teasers();
        C2668g.a(userRecCard, "userRecCard.teasers()");
        int i = 0;
        for (Teaser teaser : C19301m.d((Iterable) userRecCard, 2)) {
            int i2 = i + 1;
            PlacesUserRecCardTarget placesUserRecCardTarget2 = this.f33417a;
            if (placesUserRecCardTarget2 == null) {
                C2668g.b("target");
            }
            placesUserRecCardTarget2.bindTeaser(i, teaser.getValue());
            i = i2;
        }
    }

    /* renamed from: a */
    private final void m41673a(UserRec userRec) {
        this.f33418b.execute(userRec).b(Schedulers.io()).b(RxUtils.b());
    }
}
