package com.tinder.recs.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.recs.model.UserRec.Teaser;
import com.tinder.managers.bk;

public abstract class RecsEventTracker<T> implements CompletableUseCase<T> {
    protected final C2630h fireworks;
    protected final bk managerSharedPreferences;

    RecsEventTracker(@NonNull C2630h c2630h, @NonNull bk bkVar) {
        this.fireworks = c2630h;
        this.managerSharedPreferences = bkVar;
    }

    @Nullable
    String firstBadgeTypeKey(@NonNull PerspectableUser perspectableUser) {
        return !perspectableUser.badges().isEmpty() ? ((Badge) perspectableUser.badges().get(0)).type().key() : null;
    }

    @Nullable
    String firstTeaserValue(UserRec userRec) {
        userRec = userRec.getTeasers();
        return !userRec.isEmpty() ? ((Teaser) userRec.get(0)).getValue() : null;
    }

    @Nullable
    String firstTeaserType(UserRec userRec) {
        userRec = userRec.getTeasers();
        return !userRec.isEmpty() ? ((Teaser) userRec.get(0)).getType() : null;
    }

    @Nullable
    String lastTeaserValue(UserRec userRec) {
        userRec = userRec.getTeasers();
        return userRec.size() > 1 ? ((Teaser) userRec.get(userRec.size() - 1)).getValue() : null;
    }

    @Nullable
    String lastTeaserType(UserRec userRec) {
        userRec = userRec.getTeasers();
        return userRec.size() > 1 ? ((Teaser) userRec.get(userRec.size() - 1)).getType() : null;
    }

    int normalizedBlendId() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.managerSharedPreferences;	 Catch:{ IllegalArgumentException -> 0x000b, IllegalArgumentException -> 0x000b }
        r0 = r0.N();	 Catch:{ IllegalArgumentException -> 0x000b, IllegalArgumentException -> 0x000b }
        r0 = com.tinder.api.model.meta.BlendType.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x000b, IllegalArgumentException -> 0x000b }
        goto L_0x000d;
    L_0x000b:
        r0 = com.tinder.api.model.meta.BlendType.OPTIMAL;
    L_0x000d:
        r0 = com.tinder.analytics.fireworks.C6231j.a(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.analytics.RecsEventTracker.normalizedBlendId():int");
    }
}
