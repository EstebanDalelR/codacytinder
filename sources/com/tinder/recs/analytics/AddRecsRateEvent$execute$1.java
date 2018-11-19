package com.tinder.recs.analytics;

import android.text.TextUtils;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.common.model.SpotifyTrack;
import com.tinder.domain.recs.DeepLinkReferralInfo;
import com.tinder.domain.recs.model.PlacesUserRec;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.domain.recs.model.RecSource.FastMatch;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.Method;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.domain.recs.model.SwipeOrigin;
import com.tinder.domain.recs.model.Tag;
import com.tinder.domain.recs.model.TopPickUserRec;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.etl.event.ug;
import com.tinder.etl.event.ug.C9288a;
import com.tinder.fireboarding.domain.ProgressiveOnboarding;
import com.tinder.recs.analytics.AddRecsRateEvent.AddRecsRateEventRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import rx.Completable;
import rx.functions.Action0;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "progressiveOnboarding", "Lcom/tinder/fireboarding/domain/ProgressiveOnboarding;", "call"}, k = 3, mv = {1, 1, 10})
final class AddRecsRateEvent$execute$1<T, R> implements Func1<ProgressiveOnboarding, Completable> {
    final /* synthetic */ AddRecsRateEventRequest $request;
    final /* synthetic */ AddRecsRateEvent this$0;

    AddRecsRateEvent$execute$1(AddRecsRateEvent addRecsRateEvent, AddRecsRateEventRequest addRecsRateEventRequest) {
        this.this$0 = addRecsRateEvent;
        this.$request = addRecsRateEventRequest;
    }

    public final Completable call(final ProgressiveOnboarding progressiveOnboarding) {
        return Completable.a(new Action0() {
            public final void call() {
                Swipe swipe = this.$request.getSwipe();
                if (this.this$0.isValidRecType(swipe)) {
                    Rec rec = swipe.getRec();
                    if (rec == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.UserRec");
                    }
                    String analyticsValue;
                    C9288a k;
                    DeepLinkReferralInfo deepLinkInfo;
                    PlacesUserRec placesUserRec;
                    TopPickUserRec topPickUserRec;
                    Tag tag;
                    Iterable<Tag> tags;
                    Collection arrayList;
                    UserRec userRec = (UserRec) rec;
                    PerspectableUser user = userRec.getUser();
                    SpotifyTrack spotifyThemeTrack = user.profileUser().spotifyThemeTrack();
                    boolean z = false;
                    boolean z2 = (spotifyThemeTrack == null || TextUtils.isEmpty(spotifyThemeTrack.name())) ? false : true;
                    Method method = swipe.getActionContext().getMethod();
                    if (!(method instanceof SwipeMethod)) {
                        method = null;
                    }
                    SwipeMethod swipeMethod = (SwipeMethod) method;
                    C9288a c = ug.a().c(Boolean.valueOf(swipe.getActionContext().getOrigin() == SwipeOrigin.USER_PROFILE));
                    if (swipeMethod != null) {
                        analyticsValue = swipeMethod.getAnalyticsValue();
                        if (analyticsValue != null) {
                            k = c.g(analyticsValue).g(Boolean.valueOf(swipe.getType() != Type.LIKE)).n(Boolean.valueOf(swipe.getType() != Type.SUPERLIKE)).j(Boolean.valueOf(swipe.getRec().getType() != RecType.TOP_PICK)).b(Boolean.valueOf(userRec.isSuperLike())).b(this.this$0.firstBadgeTypeKey(user)).a(Integer.valueOf(this.this$0.normalizedBlendId())).b(Integer.valueOf(this.this$0.getCommonConnectionCount(user, 1))).g(Integer.valueOf(this.this$0.getCommonConnectionCount(user, 2))).a(Boolean.valueOf(z2)).i(Boolean.valueOf(this.this$0.spotifyInteractor.m56688o())).m(Boolean.valueOf(this.this$0.spotifyInteractor.m56683j())).e(Boolean.valueOf(this.this$0.boostInteractor.isUserBoosting())).d(user.id()).k(Boolean.valueOf(this.this$0.passportInteractor.c() == null));
                            if (this.this$0.passportInteractor.c() != null) {
                                z = true;
                            }
                            k = k.o(Boolean.valueOf(z)).l(Boolean.valueOf(userRec.isTraveling())).h(Long.valueOf(userRec.getSNumber())).k(this.this$0.firstTeaserType(userRec)).m(this.this$0.firstTeaserValue(userRec)).l(this.this$0.lastTeaserType(userRec)).n(this.this$0.lastTeaserValue(userRec)).c(Integer.valueOf(user.profileUser().photos().size())).d(Integer.valueOf(this.$request.getPhotoViewsCard())).e(Integer.valueOf(this.$request.getPhotoViewsProfile())).f(Integer.valueOf(progressiveOnboarding.getAnalyticsValue()));
                            if (this.this$0.fastMatchConfigProvider.get().isEnabled()) {
                                k.d(Boolean.valueOf(this.this$0.subscriptionProvider.get().isGold())).f(Boolean.valueOf(C2668g.a(userRec.getSource(), FastMatch.INSTANCE))).h(Boolean.valueOf(userRec.isFastMatch()));
                            }
                            deepLinkInfo = RecFieldDecorationExtensionsKt.deepLinkInfo(userRec);
                            if (deepLinkInfo == null) {
                                k.a(deepLinkInfo.activityType()).c(deepLinkInfo.from()).i(deepLinkInfo.referralString()).h(deepLinkInfo.referralUrl());
                            } else {
                                k.c("recommended");
                            }
                            placesUserRec = (PlacesUserRec) (userRec instanceof PlacesUserRec ? null : userRec);
                            if (placesUserRec != null) {
                                k.e(placesUserRec.getPlaceId());
                            }
                            if (!(userRec instanceof TopPickUserRec)) {
                                userRec = null;
                            }
                            topPickUserRec = (TopPickUserRec) userRec;
                            if (!(topPickUserRec == null || (topPickUserRec.getTags().isEmpty() ^ 1) == 0)) {
                                tag = (Tag) C19299w.m68829f(topPickUserRec.getTags());
                                k.f(tag.getId());
                                k.j(tag.getRegion());
                                tags = topPickUserRec.getTags();
                                arrayList = new ArrayList(C18457p.m66906a((Iterable) tags, 10));
                                for (Tag access$tagToList : tags) {
                                    arrayList.add(this.this$0.tagToList(access$tagToList));
                                }
                                k.a(C19299w.m68840l((List) arrayList));
                            }
                            this.this$0.fireworks.a(k.a());
                        }
                    }
                    analyticsValue = "";
                    if (swipe.getType() != Type.LIKE) {
                    }
                    if (swipe.getType() != Type.SUPERLIKE) {
                    }
                    if (swipe.getRec().getType() != RecType.TOP_PICK) {
                    }
                    if (this.this$0.passportInteractor.c() == null) {
                    }
                    k = c.g(analyticsValue).g(Boolean.valueOf(swipe.getType() != Type.LIKE)).n(Boolean.valueOf(swipe.getType() != Type.SUPERLIKE)).j(Boolean.valueOf(swipe.getRec().getType() != RecType.TOP_PICK)).b(Boolean.valueOf(userRec.isSuperLike())).b(this.this$0.firstBadgeTypeKey(user)).a(Integer.valueOf(this.this$0.normalizedBlendId())).b(Integer.valueOf(this.this$0.getCommonConnectionCount(user, 1))).g(Integer.valueOf(this.this$0.getCommonConnectionCount(user, 2))).a(Boolean.valueOf(z2)).i(Boolean.valueOf(this.this$0.spotifyInteractor.m56688o())).m(Boolean.valueOf(this.this$0.spotifyInteractor.m56683j())).e(Boolean.valueOf(this.this$0.boostInteractor.isUserBoosting())).d(user.id()).k(Boolean.valueOf(this.this$0.passportInteractor.c() == null));
                    if (this.this$0.passportInteractor.c() != null) {
                        z = true;
                    }
                    k = k.o(Boolean.valueOf(z)).l(Boolean.valueOf(userRec.isTraveling())).h(Long.valueOf(userRec.getSNumber())).k(this.this$0.firstTeaserType(userRec)).m(this.this$0.firstTeaserValue(userRec)).l(this.this$0.lastTeaserType(userRec)).n(this.this$0.lastTeaserValue(userRec)).c(Integer.valueOf(user.profileUser().photos().size())).d(Integer.valueOf(this.$request.getPhotoViewsCard())).e(Integer.valueOf(this.$request.getPhotoViewsProfile())).f(Integer.valueOf(progressiveOnboarding.getAnalyticsValue()));
                    if (this.this$0.fastMatchConfigProvider.get().isEnabled()) {
                        k.d(Boolean.valueOf(this.this$0.subscriptionProvider.get().isGold())).f(Boolean.valueOf(C2668g.a(userRec.getSource(), FastMatch.INSTANCE))).h(Boolean.valueOf(userRec.isFastMatch()));
                    }
                    deepLinkInfo = RecFieldDecorationExtensionsKt.deepLinkInfo(userRec);
                    if (deepLinkInfo == null) {
                        k.c("recommended");
                    } else {
                        k.a(deepLinkInfo.activityType()).c(deepLinkInfo.from()).i(deepLinkInfo.referralString()).h(deepLinkInfo.referralUrl());
                    }
                    if (userRec instanceof PlacesUserRec) {
                    }
                    placesUserRec = (PlacesUserRec) (userRec instanceof PlacesUserRec ? null : userRec);
                    if (placesUserRec != null) {
                        k.e(placesUserRec.getPlaceId());
                    }
                    if (userRec instanceof TopPickUserRec) {
                        userRec = null;
                    }
                    topPickUserRec = (TopPickUserRec) userRec;
                    tag = (Tag) C19299w.m68829f(topPickUserRec.getTags());
                    k.f(tag.getId());
                    k.j(tag.getRegion());
                    tags = topPickUserRec.getTags();
                    arrayList = new ArrayList(C18457p.m66906a((Iterable) tags, 10));
                    while (r1.hasNext()) {
                        arrayList.add(this.this$0.tagToList(access$tagToList));
                    }
                    k.a(C19299w.m68840l((List) arrayList));
                    this.this$0.fireworks.a(k.a());
                }
            }
        });
    }
}
