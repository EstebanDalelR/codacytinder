package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.UseCase;
import com.tinder.etl.event.uh;
import com.tinder.etl.event.uh.C9290a;
import javax.inject.Inject;
import rx.Observable;

/* renamed from: com.tinder.profile.b.p */
public class C16081p implements UseCase<C14388a, Void> {
    @NonNull
    /* renamed from: a */
    private final C2630h f49997a;

    /* renamed from: com.tinder.profile.b.p$a */
    public static abstract class C14388a {
        @NonNull
        /* renamed from: a */
        public abstract String m54809a();

        @NonNull
        /* renamed from: b */
        public abstract String m54810b();

        @Nullable
        /* renamed from: c */
        public abstract String m54811c();

        @Nullable
        /* renamed from: d */
        public abstract String m54812d();
    }

    @NonNull
    public /* synthetic */ Observable execute(@NonNull Object obj) {
        return m60853a((C14388a) obj);
    }

    @Inject
    C16081p(@NonNull C2630h c2630h) {
        this.f49997a = c2630h;
    }

    @NonNull
    /* renamed from: a */
    public Observable<Void> m60853a(@NonNull C14388a c14388a) {
        C9290a d = uh.a().a(c14388a.m54809a()).d(c14388a.m54810b());
        if (c14388a.m54811c() != null) {
            d.b(c14388a.m54811c());
        }
        if (c14388a.m54812d() != null) {
            d.c(c14388a.m54812d());
        }
        this.f49997a.a(d.a());
        return Observable.c();
    }
}
