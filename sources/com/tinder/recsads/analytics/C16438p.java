package com.tinder.recsads.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.ah;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import com.tinder.recsads.analytics.C16448y.C16447a;
import javax.inject.Inject;

/* renamed from: com.tinder.recsads.analytics.p */
public class C16438p extends C14737g<C14743a> {

    /* renamed from: com.tinder.recsads.analytics.p$a */
    public static abstract class C14743a {

        /* renamed from: com.tinder.recsads.analytics.p$a$a */
        public static abstract class C14742a {
            /* renamed from: a */
            public abstract C14742a mo12176a(int i);

            /* renamed from: a */
            public abstract C14743a mo12177a();
        }

        @Nullable
        /* renamed from: a */
        public abstract Integer mo12178a();

        @Nullable
        /* renamed from: b */
        public abstract Float mo12179b();

        /* renamed from: c */
        public abstract int mo12180c();

        /* renamed from: d */
        public static C14742a m56012d() {
            return new C16447a();
        }
    }

    @Inject
    C16438p(@NonNull C2630h c2630h, @NonNull C14729c c14729c) {
        super(c2630h, c14729c);
    }

    /* renamed from: a */
    protected EtlEvent m61830a(C14743a c14743a, AdEventFields adEventFields) {
        return ah.a().b(adEventFields.mo12162a()).a(adEventFields.mo12164c()).b(adEventFields.mo12163b()).c(adEventFields.mo12167f().key()).a(adEventFields.mo12168g()).f(c14743a.mo12179b()).d(adEventFields.mo12165d().key()).g(c14743a.mo12178a()).e(Integer.valueOf(adEventFields.mo12166e().key())).g(c14743a.mo12178a()).a(Integer.valueOf(c14743a.mo12180c())).a();
    }
}
