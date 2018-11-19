package com.tinder.recsads.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.ak;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import com.tinder.recsads.analytics.aa.C16430a;
import javax.inject.Inject;

/* renamed from: com.tinder.recsads.analytics.t */
public class C16440t extends C14737g<C14747a> {

    /* renamed from: com.tinder.recsads.analytics.t$a */
    public static abstract class C14747a {

        /* renamed from: com.tinder.recsads.analytics.t$a$a */
        public static abstract class C14746a {
            /* renamed from: a */
            public abstract C14747a mo12151a();
        }

        @Nullable
        /* renamed from: a */
        public abstract Number mo12152a();

        @Nullable
        /* renamed from: b */
        public abstract String mo12153b();

        @Nullable
        /* renamed from: c */
        public abstract String mo12154c();

        @Nullable
        /* renamed from: d */
        public abstract String mo12155d();

        /* renamed from: e */
        public static C14746a m56021e() {
            return new C16430a();
        }
    }

    @Inject
    public C16440t(C2630h c2630h, C14729c c14729c) {
        super(c2630h, c14729c);
    }

    /* renamed from: a */
    protected EtlEvent m61834a(@NonNull C14747a c14747a, AdEventFields adEventFields) {
        return ak.a().a(adEventFields.mo12162a()).a(adEventFields.mo12164c()).b(adEventFields.mo12163b()).b(adEventFields.mo12167f().key()).a(adEventFields.mo12168g()).c(adEventFields.mo12165d().key()).d(Integer.valueOf(adEventFields.mo12166e().key())).e(c14747a.mo12152a()).c(c14747a.mo12154c()).a();
    }
}
