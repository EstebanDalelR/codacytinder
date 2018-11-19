package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.etl.event.dj;
import com.tinder.etl.event.ue;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.p363b.C16089x.C16088a;
import javax.inject.Inject;
import rx.Completable;

/* renamed from: com.tinder.profile.b.r */
public class C16082r implements CompletableUseCase<C14391a> {
    @NonNull
    /* renamed from: a */
    private final C2630h f49998a;

    /* renamed from: com.tinder.profile.b.r$a */
    public static abstract class C14391a {

        /* renamed from: com.tinder.profile.b.r$a$a */
        public static abstract class C14390a {
            /* renamed from: a */
            public abstract C14390a mo11588a(int i);

            /* renamed from: a */
            public abstract C14390a mo11589a(Source source);

            /* renamed from: a */
            public abstract C14390a mo11590a(String str);

            /* renamed from: a */
            public abstract C14391a mo11591a();

            /* renamed from: b */
            public abstract C14390a mo11592b(String str);
        }

        @NonNull
        /* renamed from: a */
        public abstract Source mo11593a();

        @NonNull
        /* renamed from: b */
        public abstract int mo11594b();

        @NonNull
        /* renamed from: c */
        public abstract String mo11595c();

        @NonNull
        /* renamed from: d */
        public abstract String mo11596d();

        /* renamed from: e */
        public static C14390a m54818e() {
            return new C16088a();
        }
    }

    @NonNull
    public /* synthetic */ Completable execute(@NonNull Object obj) {
        return m60854a((C14391a) obj);
    }

    @Inject
    public C16082r(@NonNull C2630h c2630h) {
        this.f49998a = c2630h;
    }

    @NonNull
    /* renamed from: a */
    public Completable m60854a(@NonNull C14391a c14391a) {
        switch (c14391a.mo11593a()) {
            case REC:
                this.f49998a.a(ue.a().a(Integer.valueOf(c14391a.mo11594b())).b(c14391a.mo11595c()).a(c14391a.mo11596d()).a());
                break;
            case MATCH:
                this.f49998a.a(dj.a().a(Integer.valueOf(c14391a.mo11594b())).a(c14391a.mo11595c()).b(c14391a.mo11596d()).a());
                break;
            default:
                return Completable.a();
        }
        return Completable.a();
    }
}
