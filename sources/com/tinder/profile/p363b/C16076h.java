package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.etl.event.di;
import com.tinder.etl.event.ud;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.p363b.C16086v.C16085a;
import javax.inject.Inject;
import rx.Completable;

/* renamed from: com.tinder.profile.b.h */
public class C16076h implements CompletableUseCase<C14384a> {
    @NonNull
    /* renamed from: a */
    private final C2630h f49991a;

    /* renamed from: com.tinder.profile.b.h$a */
    public static abstract class C14384a {

        /* renamed from: com.tinder.profile.b.h$a$a */
        public static abstract class C14383a {
            /* renamed from: a */
            public abstract C14383a mo11573a(int i);

            /* renamed from: a */
            public abstract C14383a mo11574a(Source source);

            /* renamed from: a */
            public abstract C14383a mo11575a(String str);

            /* renamed from: a */
            public abstract C14383a mo11576a(boolean z);

            /* renamed from: a */
            public abstract C14384a mo11577a();

            /* renamed from: b */
            public abstract C14383a mo11578b(int i);

            /* renamed from: b */
            public abstract C14383a mo11579b(String str);
        }

        @NonNull
        /* renamed from: a */
        public abstract Source mo11580a();

        @NonNull
        /* renamed from: b */
        public abstract int mo11581b();

        @NonNull
        /* renamed from: c */
        public abstract int mo11582c();

        @NonNull
        /* renamed from: d */
        public abstract boolean mo11583d();

        @NonNull
        /* renamed from: e */
        public abstract String mo11584e();

        @NonNull
        /* renamed from: f */
        public abstract String mo11585f();

        /* renamed from: g */
        public static C14383a m54796g() {
            return new C16085a();
        }
    }

    @NonNull
    public /* synthetic */ Completable execute(@NonNull Object obj) {
        return m60849a((C14384a) obj);
    }

    @Inject
    public C16076h(@NonNull C2630h c2630h) {
        this.f49991a = c2630h;
    }

    @NonNull
    /* renamed from: a */
    public Completable m60849a(@NonNull C14384a c14384a) {
        switch (c14384a.mo11580a()) {
            case REC:
                this.f49991a.a(ud.a().a(Integer.valueOf(c14384a.mo11581b())).b(Integer.valueOf(c14384a.mo11582c())).a(Boolean.valueOf(c14384a.mo11583d())).b(c14384a.mo11584e()).a(c14384a.mo11585f()).a());
                break;
            case MATCH:
                this.f49991a.a(di.a().a(Integer.valueOf(c14384a.mo11581b())).b(Integer.valueOf(c14384a.mo11582c())).a(Boolean.valueOf(c14384a.mo11583d())).a(c14384a.mo11584e()).b(c14384a.mo11585f()).a());
                break;
            default:
                return Completable.a();
        }
        return Completable.a();
    }
}
