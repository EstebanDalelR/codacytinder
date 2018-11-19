package com.tinder.boost.model;

import android.support.annotation.NonNull;
import com.tinder.boost.model.C10421a.C10420a;
import com.tinder.model.UserMeta;
import java8.util.Optional;

/* renamed from: com.tinder.boost.model.b */
public abstract class C8345b {

    /* renamed from: com.tinder.boost.model.b$a */
    public static abstract class C8344a {
        /* renamed from: a */
        public abstract C8344a mo9308a(double d);

        /* renamed from: a */
        public abstract C8344a mo9309a(long j);

        /* renamed from: a */
        public abstract C8344a mo9310a(boolean z);

        /* renamed from: a */
        public abstract C8345b mo9311a();
    }

    /* renamed from: a */
    public abstract boolean mo9312a();

    /* renamed from: b */
    public abstract double mo9313b();

    /* renamed from: c */
    public abstract long mo9314c();

    @NonNull
    /* renamed from: a */
    public static C8345b m35518a(@NonNull UserMeta userMeta) {
        boolean booleanValue = ((Boolean) Optional.b(userMeta).a(C10422c.f33990a).a(C10423d.f33991a).c(Boolean.valueOf(false))).booleanValue();
        double doubleValue = ((Double) Optional.b(userMeta).a(C10424e.f33992a).a(C10425f.f33993a).c(Double.valueOf(0.0d))).doubleValue();
        return C8345b.m35520e().mo9310a(booleanValue).mo9308a(doubleValue).mo9309a(((Long) Optional.b(userMeta).a(C10426g.f33994a).a(C10427h.f33995a).c(Long.valueOf(0))).longValue()).mo9311a();
    }

    @NonNull
    /* renamed from: d */
    public static C8345b m35519d() {
        return C8345b.m35520e().mo9310a(false).mo9308a(0.0d).mo9309a(0).mo9311a();
    }

    /* renamed from: e */
    public static C8344a m35520e() {
        return new C10420a();
    }
}
