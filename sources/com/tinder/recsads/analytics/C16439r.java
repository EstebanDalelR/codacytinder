package com.tinder.recsads.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.ai;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import com.tinder.recsads.analytics.C16450z.C16449a;
import javax.inject.Inject;

/* renamed from: com.tinder.recsads.analytics.r */
public class C16439r extends C14737g<C14745a> {

    /* renamed from: com.tinder.recsads.analytics.r$a */
    public static abstract class C14745a {

        /* renamed from: com.tinder.recsads.analytics.r$a$a */
        public static abstract class C14744a {
            /* renamed from: a */
            public abstract C14745a mo12181a();
        }

        @Nullable
        /* renamed from: a */
        public abstract Number mo12182a();

        @Nullable
        /* renamed from: b */
        public abstract Number mo12183b();

        /* renamed from: c */
        public static C14744a m56017c() {
            return new C16449a();
        }
    }

    @Inject
    C16439r(C2630h c2630h, C14729c c14729c) {
        super(c2630h, c14729c);
    }

    /* renamed from: a */
    protected EtlEvent m61832a(@NonNull C14745a c14745a, AdEventFields adEventFields) {
        return ai.a().a(adEventFields.mo12162a()).a(adEventFields.mo12164c()).b(adEventFields.mo12163b()).b(adEventFields.mo12167f().key()).a(adEventFields.mo12168g()).c(adEventFields.mo12165d().key()).d(Integer.valueOf(adEventFields.mo12166e().key())).e(c14745a.mo12182a()).f(c14745a.mo12183b()).a();
    }
}
