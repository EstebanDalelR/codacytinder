package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.etl.event.dg;
import com.tinder.etl.event.ua;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.p363b.C16084u.C16083a;
import javax.inject.Inject;
import rx.Completable;

/* renamed from: com.tinder.profile.b.g */
public class C16075g implements CompletableUseCase<C14381a> {
    @NonNull
    /* renamed from: a */
    private final C2630h f49990a;

    /* renamed from: com.tinder.profile.b.g$a */
    public static abstract class C14381a {

        /* renamed from: com.tinder.profile.b.g$a$a */
        public static abstract class C14380a {
            /* renamed from: a */
            public abstract C14380a mo11564a(int i);

            /* renamed from: a */
            public abstract C14380a mo11565a(Source source);

            /* renamed from: a */
            public abstract C14380a mo11566a(String str);

            /* renamed from: a */
            public abstract C14381a mo11567a();

            /* renamed from: b */
            public abstract C14380a mo11568b(String str);
        }

        @NonNull
        /* renamed from: a */
        public abstract Source mo11569a();

        @NonNull
        /* renamed from: b */
        public abstract int mo11570b();

        @NonNull
        /* renamed from: c */
        public abstract String mo11571c();

        @NonNull
        /* renamed from: d */
        public abstract String mo11572d();

        /* renamed from: e */
        public static C14380a m54784e() {
            return new C16083a();
        }
    }

    @NonNull
    public /* synthetic */ Completable execute(@NonNull Object obj) {
        return m60848a((C14381a) obj);
    }

    @Inject
    public C16075g(@NonNull C2630h c2630h) {
        this.f49990a = c2630h;
    }

    @NonNull
    /* renamed from: a */
    public Completable m60848a(@NonNull C14381a c14381a) {
        switch (c14381a.mo11569a()) {
            case REC:
                this.f49990a.a(ua.a().a(Integer.valueOf(c14381a.mo11570b())).b(c14381a.mo11571c()).a(c14381a.mo11572d()).a());
                break;
            case MATCH:
                this.f49990a.a(dg.a().a(Integer.valueOf(c14381a.mo11570b())).a(c14381a.mo11571c()).b(c14381a.mo11572d()).a());
                break;
            default:
                return Completable.a();
        }
        return Completable.a();
    }
}
