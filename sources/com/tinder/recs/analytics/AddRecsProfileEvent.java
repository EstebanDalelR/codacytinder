package com.tinder.recs.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.recs.model.PlacesUserRec;
import com.tinder.domain.recs.model.RecSource.FastMatch;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.recs.model.UserRec.Teaser;
import com.tinder.etl.event.EtlEvent;
import rx.Completable;

abstract class AddRecsProfileEvent implements CompletableUseCase<UserRec> {
    private static final String FAST_MATCH_FROM_VALUE = "likeslist";
    @NonNull
    private final C2630h fireworks;

    abstract EtlEvent createEvent(int i, String str, boolean z, String str2, String str3, String str4, Integer num, @Nullable String str5, @Nullable String str6);

    AddRecsProfileEvent(@NonNull C2630h c2630h) {
        this.fireworks = c2630h;
    }

    @NonNull
    public Completable execute(@NonNull UserRec userRec) {
        return Completable.a(new AddRecsProfileEvent$$Lambda$0(this, userRec));
    }

    final /* synthetic */ void lambda$execute$0$AddRecsProfileEvent(@NonNull UserRec userRec) {
        Integer valueOf;
        String str;
        String str2;
        String str3;
        Instagram instagram = userRec.getUser().profileUser().instagram();
        String str4 = null;
        if (instagram != null) {
            String username = instagram.username();
            valueOf = Integer.valueOf(instagram.mediaCount());
            str = username;
        } else {
            str = null;
            valueOf = str;
        }
        if (userRec.getTeasers().isEmpty()) {
            str2 = null;
            str3 = str2;
        } else {
            Teaser teaser = (Teaser) userRec.getTeasers().get(0);
            username = teaser.getType();
            str3 = teaser.getValue();
            str2 = username;
        }
        String str5 = userRec.getSource().equals(FastMatch.INSTANCE) ? FAST_MATCH_FROM_VALUE : null;
        if (userRec instanceof PlacesUserRec) {
            str4 = ((PlacesUserRec) userRec).getPlaceId();
        }
        this.fireworks.a(createEvent(1, userRec.getUser().id(), userRec.isSuperLike(), str2, str3, str, valueOf, str5, str4));
    }
}
