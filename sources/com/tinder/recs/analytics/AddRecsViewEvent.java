package com.tinder.recs.analytics;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.domain.recs.model.RecSource.FastMatch;
import com.tinder.domain.recs.model.RecSource.TopPicks;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.etl.event.uu;
import com.tinder.etl.event.uu.C9298a;
import com.tinder.managers.bk;
import javax.inject.Inject;
import rx.Completable;

public class AddRecsViewEvent extends RecsEventTracker<UserRec> {
    private static final String REQUEST_SOURCE_DEFAULT = "Default";
    private static final String REQUEST_SOURCE_LIKES_YOU = "Likes You";
    private static final String REQUEST_SOURCE_TOP_PICKS = "Top Picks";

    @Inject
    AddRecsViewEvent(@NonNull C2630h c2630h, @NonNull bk bkVar) {
        super(c2630h, bkVar);
    }

    @NonNull
    public Completable execute(@NonNull UserRec userRec) {
        return Completable.a(new AddRecsViewEvent$$Lambda$0(this, userRec));
    }

    final /* synthetic */ void lambda$execute$0$AddRecsViewEvent(@NonNull UserRec userRec) {
        PerspectableUser user = userRec.getUser();
        C9298a i = uu.a().b(firstBadgeTypeKey(user)).a(Integer.valueOf(normalizedBlendId())).a(Boolean.valueOf(userRec.isSuperLike())).d(user.id()).h(firstTeaserType(userRec)).i(firstTeaserValue(userRec));
        String str = userRec.getSource().equals(FastMatch.INSTANCE) ? REQUEST_SOURCE_LIKES_YOU : userRec.getSource().equals(TopPicks.INSTANCE) ? REQUEST_SOURCE_TOP_PICKS : REQUEST_SOURCE_DEFAULT;
        i.g(str);
        userRec = RecFieldDecorationExtensionsKt.deepLinkInfo(userRec);
        if (userRec != null) {
            i.a(userRec.activityType()).c(userRec.from()).f(userRec.referralString()).e(userRec.referralUrl());
        } else {
            i.c("recommended");
        }
        this.fireworks.a(i.a());
    }
}
