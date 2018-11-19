package com.tinder.profiletab.p369c;

import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.etl.event.zv;
import com.tinder.photooptimizer.C10110a;
import com.tinder.profiletab.p369c.C16175c.C16174a;
import javax.inject.Inject;
import rx.Completable;

/* renamed from: com.tinder.profiletab.c.d */
public class C16176d implements CompletableUseCase<C14466a> {
    /* renamed from: a */
    private final C2630h f50389a;
    /* renamed from: b */
    private final C10110a f50390b;

    /* renamed from: com.tinder.profiletab.c.d$a */
    public static abstract class C14466a {

        /* renamed from: com.tinder.profiletab.c.d$a$a */
        public static abstract class C14465a {
            /* renamed from: a */
            public abstract C14465a mo11774a(int i);

            /* renamed from: a */
            public abstract C14465a mo11775a(String str);

            /* renamed from: a */
            public abstract C14465a mo11776a(boolean z);

            /* renamed from: a */
            public abstract C14466a mo11777a();

            /* renamed from: b */
            public abstract C14465a mo11778b(String str);

            /* renamed from: b */
            public abstract C14465a mo11779b(boolean z);

            /* renamed from: c */
            public abstract C14465a mo11780c(String str);

            /* renamed from: c */
            public abstract C14465a mo11781c(boolean z);

            /* renamed from: d */
            public abstract C14465a mo11782d(boolean z);

            /* renamed from: e */
            public abstract C14465a mo11783e(boolean z);
        }

        @Nullable
        /* renamed from: a */
        abstract String mo11784a();

        @Nullable
        /* renamed from: b */
        abstract String mo11785b();

        @Nullable
        /* renamed from: c */
        abstract String mo11786c();

        /* renamed from: d */
        abstract int mo11787d();

        /* renamed from: e */
        abstract boolean mo11788e();

        /* renamed from: f */
        abstract boolean mo11789f();

        /* renamed from: g */
        abstract boolean mo11790g();

        /* renamed from: h */
        abstract boolean mo11791h();

        /* renamed from: i */
        abstract boolean mo11792i();

        /* renamed from: j */
        public static C14465a m55206j() {
            return new C16174a();
        }
    }

    public /* synthetic */ Completable execute(Object obj) {
        return m61124a((C14466a) obj);
    }

    @Inject
    C16176d(C2630h c2630h, C10110a c10110a) {
        this.f50389a = c2630h;
        this.f50390b = c10110a;
    }

    /* renamed from: a */
    public Completable m61124a(C14466a c14466a) {
        return Completable.a(new C18598e(this, zv.a().a(c14466a.mo11784a()).d(c14466a.mo11785b()).c(c14466a.mo11786c()).a(Integer.valueOf(c14466a.mo11787d())).a(Boolean.valueOf(c14466a.mo11788e())).c(Boolean.valueOf(c14466a.mo11789f())).d(Boolean.valueOf(c14466a.mo11790g())).e(Boolean.valueOf(c14466a.mo11791h())).b(Boolean.valueOf(c14466a.mo11792i())).b(Integer.valueOf(this.f50390b.c())).b("open").a()));
    }

    /* renamed from: a */
    final /* synthetic */ void m61125a(zv zvVar) {
        this.f50389a.a(zvVar);
    }
}
