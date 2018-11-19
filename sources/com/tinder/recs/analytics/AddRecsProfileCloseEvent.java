package com.tinder.recs.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.uc;
import javax.inject.Inject;
import rx.Completable;

public class AddRecsProfileCloseEvent extends AddRecsProfileEvent {
    @NonNull
    public /* bridge */ /* synthetic */ Completable execute(@NonNull UserRec userRec) {
        return super.execute(userRec);
    }

    @Inject
    AddRecsProfileCloseEvent(@NonNull C2630h c2630h) {
        super(c2630h);
    }

    EtlEvent createEvent(int i, String str, boolean z, String str2, String str3, String str4, Integer num, @Nullable String str5, @Nullable String str6) {
        return uc.a().a(str).a(Boolean.valueOf(z)).a();
    }
}
