package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.etl.event.tz;
import javax.inject.Inject;
import rx.Completable;

/* renamed from: com.tinder.profile.b.m */
public class C16080m implements CompletableUseCase<C14387a> {
    @NonNull
    /* renamed from: a */
    private final C2630h f49996a;

    /* renamed from: com.tinder.profile.b.m$a */
    public static abstract class C14387a {
        @NonNull
        /* renamed from: a */
        public abstract String mo11586a();

        @NonNull
        /* renamed from: b */
        public abstract String mo11587b();

        /* renamed from: a */
        public static C14387a m54806a(String str, String str2) {
            return new C16087w(str, str2);
        }
    }

    @NonNull
    public /* synthetic */ Completable execute(@NonNull Object obj) {
        return m60851a((C14387a) obj);
    }

    @Inject
    C16080m(@NonNull C2630h c2630h) {
        this.f49996a = c2630h;
    }

    @NonNull
    /* renamed from: a */
    public Completable m60851a(@NonNull C14387a c14387a) {
        return Completable.a(new C18588n(this, c14387a));
    }

    /* renamed from: b */
    final /* synthetic */ void m60852b(@NonNull C14387a c14387a) {
        this.f49996a.a(tz.a().a(Boolean.valueOf(true)).a(c14387a.mo11586a()).b(c14387a.mo11587b()).a());
    }
}
