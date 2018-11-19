package com.tinder.recsads.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.C11530v;
import com.tinder.etl.event.EtlEvent;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import com.tinder.recsads.analytics.C16444w.C16443a;
import javax.inject.Inject;

/* renamed from: com.tinder.recsads.analytics.d */
public class C16432d extends C14737g<C14735a> {

    /* renamed from: com.tinder.recsads.analytics.d$a */
    public static abstract class C14735a {

        /* renamed from: com.tinder.recsads.analytics.d$a$a */
        public static abstract class C14734a {
            /* renamed from: a */
            public abstract C14735a mo12169a();
        }

        @Nullable
        /* renamed from: a */
        public abstract Number mo12170a();

        @Nullable
        /* renamed from: b */
        public abstract String mo12171b();

        /* renamed from: c */
        public static C14734a m55997c() {
            return new C16443a();
        }
    }

    @Inject
    C16432d(C2630h c2630h, C14729c c14729c) {
        super(c2630h, c14729c);
    }

    /* renamed from: a */
    protected EtlEvent m61819a(@NonNull C14735a c14735a, AdEventFields adEventFields) {
        return C11530v.a().a(adEventFields.mo12162a()).a(adEventFields.mo12164c()).e(c14735a.mo12170a()).b(adEventFields.mo12163b()).b(adEventFields.mo12167f().key()).a(adEventFields.mo12168g()).c(adEventFields.mo12165d().key()).d(Integer.valueOf(adEventFields.mo12166e().key())).a();
    }
}
