package com.tinder.recs.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.utils.C8578a;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.uf;
import javax.inject.Inject;
import rx.Completable;

public class AddRecsProfileOpenEvent extends AddRecsProfileEvent {
    @NonNull
    public /* bridge */ /* synthetic */ Completable execute(@NonNull UserRec userRec) {
        return super.execute(userRec);
    }

    @Inject
    AddRecsProfileOpenEvent(@NonNull C2630h c2630h) {
        super(c2630h);
    }

    EtlEvent createEvent(int i, String str, boolean z, String str2, String str3, String str4, Integer num, @Nullable String str5, @Nullable String str6) {
        i = uf.a().c(str).a(Boolean.valueOf(z)).a(Integer.valueOf(i));
        if (C8578a.a(str4) == null) {
            i.b(str4);
        }
        if (num != null) {
            i.b(num);
        }
        if (str2 != null) {
            i.e(str2);
        }
        if (str3 != null) {
            i.f(str3);
        }
        if (str5 != null) {
            i.a(str5);
        }
        if (str6 != null) {
            i.d(str6);
        }
        return i.a();
    }
}
