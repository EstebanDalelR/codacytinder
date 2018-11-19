package com.tinder.recsads.analytics;

import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.ac;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import com.tinder.recsads.analytics.C16446x.C16445a;
import javax.inject.Inject;

/* renamed from: com.tinder.recsads.analytics.j */
public class C16434j extends C14737g<C14739a> {

    /* renamed from: com.tinder.recsads.analytics.j$a */
    public static abstract class C14739a {

        /* renamed from: com.tinder.recsads.analytics.j$a$a */
        public static abstract class C14738a {
            /* renamed from: a */
            public abstract C14739a mo12172a();
        }

        @Nullable
        /* renamed from: a */
        public abstract String mo12173a();

        @Nullable
        /* renamed from: b */
        public abstract Integer mo12174b();

        @Nullable
        /* renamed from: c */
        public abstract String mo12175c();

        /* renamed from: d */
        public static C14738a m56005d() {
            return new C16445a();
        }
    }

    @Inject
    C16434j(C2630h c2630h, C14729c c14729c) {
        super(c2630h, c14729c);
    }

    /* renamed from: a */
    protected EtlEvent m61823a(C14739a c14739a, AdEventFields adEventFields) {
        return ac.a().a(adEventFields.mo12162a()).a(adEventFields.mo12164c()).b(adEventFields.mo12163b()).b(adEventFields.mo12167f().key()).a(adEventFields.mo12168g()).c(adEventFields.mo12165d().key()).d(Integer.valueOf(adEventFields.mo12166e().key())).a();
    }
}
