package com.tinder.superlike.p419b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.provider.C2643c;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.etl.event.xi;
import com.tinder.etl.event.xj;
import com.tinder.etl.event.xk;
import com.tinder.etl.event.xm;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.providers.BillerVersionCodeProvider;
import com.tinder.superlike.p419b.C16883a.C16882a;
import com.tinder.utils.ab;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;

@Singleton
/* renamed from: com.tinder.superlike.b.b */
public class C15070b {
    @NonNull
    /* renamed from: a */
    private final C2630h f46904a;
    @NonNull
    /* renamed from: b */
    private final BillerVersionCodeProvider f46905b;
    @NonNull
    /* renamed from: c */
    private final C15071e f46906c;
    @NonNull
    /* renamed from: d */
    private final OfferRepository f46907d;
    @NonNull
    /* renamed from: e */
    private final C2643c f46908e;
    /* renamed from: f */
    private int f46909f = -1;

    /* renamed from: com.tinder.superlike.b.b$a */
    public static abstract class C15069a {

        /* renamed from: com.tinder.superlike.b.b$a$a */
        public static abstract class C15068a {
            /* renamed from: a */
            public abstract C15068a mo12457a(Number number);

            /* renamed from: a */
            public abstract C15068a mo12458a(String str);

            /* renamed from: a */
            public abstract C15068a mo12459a(List list);

            /* renamed from: a */
            public abstract C15069a mo12460a();

            /* renamed from: b */
            public abstract C15068a mo12461b(Number number);

            /* renamed from: b */
            public abstract C15068a mo12462b(String str);

            /* renamed from: c */
            public abstract C15068a mo12463c(Number number);

            /* renamed from: c */
            public abstract C15068a mo12464c(String str);

            /* renamed from: d */
            public abstract C15068a mo12465d(Number number);

            /* renamed from: e */
            public abstract C15068a mo12466e(Number number);

            /* renamed from: f */
            public abstract C15068a mo12467f(Number number);

            /* renamed from: g */
            public abstract C15068a mo12468g(Number number);
        }

        @Nullable
        /* renamed from: a */
        public abstract Number mo12469a();

        @Nullable
        /* renamed from: b */
        public abstract Number mo12470b();

        @Nullable
        /* renamed from: c */
        public abstract Number mo12471c();

        @Nullable
        /* renamed from: d */
        public abstract List mo12472d();

        @Nullable
        /* renamed from: e */
        public abstract Number mo12473e();

        @Nullable
        /* renamed from: f */
        public abstract Number mo12474f();

        @Nullable
        /* renamed from: g */
        public abstract String mo12475g();

        @Nullable
        /* renamed from: h */
        public abstract String mo12476h();

        @Nullable
        /* renamed from: i */
        public abstract Number mo12477i();

        @Nullable
        /* renamed from: j */
        public abstract Number mo12478j();

        @Nullable
        /* renamed from: k */
        public abstract String mo12479k();

        @Nullable
        /* renamed from: l */
        public abstract Number mo12480l();

        /* renamed from: m */
        public static C15068a m56791m() {
            return new C16882a();
        }
    }

    @Inject
    C15070b(@NonNull C2630h c2630h, @NonNull BillerVersionCodeProvider billerVersionCodeProvider, @NonNull C15071e c15071e, @NonNull OfferRepository offerRepository, @NonNull C2643c c2643c) {
        this.f46904a = c2630h;
        this.f46905b = billerVersionCodeProvider;
        this.f46906c = c15071e;
        this.f46907d = offerRepository;
        this.f46908e = c2643c;
    }

    /* renamed from: a */
    public void m56809a(int i) {
        this.f46909f = i;
    }

    /* renamed from: a */
    public int m56808a() {
        return this.f46909f;
    }

    /* renamed from: a */
    public void m56810a(@NonNull C14510e c14510e) {
        c14510e = m56806d(c14510e);
        this.f46904a.a(xk.a().b(c14510e.mo12469a()).b(c14510e.mo12475g()).e(c14510e.mo12470b()).c(c14510e.mo12471c()).g(c14510e.mo12473e()).f(c14510e.mo12474f()).a(c14510e.mo12472d()).a(c14510e.mo12476h()).d(c14510e.mo12477i()).a(c14510e.mo12478j()).c(c14510e.mo12479k()).a());
    }

    /* renamed from: b */
    public void m56811b() {
        C15069a d = m56805d();
        this.f46904a.a(xi.a().a(d.mo12469a()).c(d.mo12470b()).b(d.mo12471c()).e(d.mo12473e()).d(d.mo12474f()).a(d.mo12472d()).a());
    }

    /* renamed from: c */
    public void m56813c() {
        C15069a d = m56805d();
        this.f46904a.a(xm.a().d(d.mo12469a()).c(d.mo12470b()).a(d.mo12471c()).b(d.mo12473e()).e(d.mo12474f()).a(d.mo12472d()).f(d.mo12480l()).a());
    }

    /* renamed from: b */
    public void m56812b(@NonNull C14510e c14510e) {
        c14510e = m56806d(c14510e);
        this.f46904a.a(xj.a().b(c14510e.mo12469a()).b(c14510e.mo12475g()).f(c14510e.mo12470b()).c(c14510e.mo12471c()).h(c14510e.mo12473e()).g(c14510e.mo12474f()).a(c14510e.mo12472d()).a(c14510e.mo12476h()).d(c14510e.mo12477i()).a(c14510e.mo12478j()).c(c14510e.mo12479k()).e(c14510e.mo12480l()).a());
    }

    @NonNull
    /* renamed from: d */
    private C15069a m56805d() {
        return m56807e().mo12460a();
    }

    @NonNull
    /* renamed from: d */
    private C15069a m56806d(@NonNull C14510e c14510e) {
        return m56807e().mo12462b(c14510e.mo11842d().mo11869a()).mo12466e(c14510e.mo11842d().mo11870b()).mo12467f(c14510e.mo11844f()).mo12464c(c14510e.mo11839a()).mo12460a();
    }

    @NonNull
    /* renamed from: e */
    private C15068a m56807e() {
        C15068a m = C15069a.m56791m();
        m.mo12457a(Integer.valueOf(this.f46909f)).mo12458a(ab.m57608a(this.f46908e.a())).mo12461b(Integer.valueOf(3)).mo12468g(Integer.valueOf(this.f46905b.getPurchaseCodeVersion()));
        SuperlikeStatus b = this.f46906c.m56818b();
        if (b == null) {
            m.mo12463c(Integer.valueOf(0)).mo12465d(Integer.valueOf(0));
        } else {
            m.mo12463c(Long.valueOf(b.millisUntilResetDate() / 1000)).mo12465d(Integer.valueOf(b.remainingCount()));
        }
        Iterable offers = this.f46907d.getOffers(ProductType.SUPERLIKE);
        if (!offers.isEmpty()) {
            m.mo12459a((List) Observable.a(offers).k(C18185c.f56378a).v().u().b());
        }
        return m;
    }

    /* renamed from: c */
    static final /* synthetic */ Map m56804c(C14510e c14510e) {
        Map hashMap = new HashMap(2);
        hashMap.put("sku", c14510e.mo11839a());
        hashMap.put("price", c14510e.mo11842d().mo11870b());
        return hashMap;
    }
}
