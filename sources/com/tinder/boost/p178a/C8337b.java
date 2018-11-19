package com.tinder.boost.p178a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.boost.p178a.C10399a.C10398a;
import com.tinder.boost.view.BoostButtonView$AnalyticsSource;
import com.tinder.domain.boost.model.BoostStatusExt;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.etl.event.bz;
import com.tinder.etl.event.ca;
import com.tinder.etl.event.cb;
import com.tinder.etl.event.cd;
import com.tinder.etl.event.ce;
import com.tinder.etl.event.cg;
import com.tinder.etl.event.ci;
import com.tinder.etl.event.cj;
import com.tinder.etl.event.ck;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.providers.BillerVersionCodeProvider;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.ab;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import rx.Observable;

/* renamed from: com.tinder.boost.a.b */
public class C8337b {
    /* renamed from: a */
    private final C2630h f29627a;
    /* renamed from: b */
    private final C15193i f29628b;
    /* renamed from: c */
    private final C10400d f29629c;
    /* renamed from: d */
    private final OfferRepository f29630d;
    /* renamed from: e */
    private final BillerVersionCodeProvider f29631e;

    /* renamed from: com.tinder.boost.a.b$a */
    public static abstract class C8336a {

        /* renamed from: com.tinder.boost.a.b$a$a */
        public static abstract class C8335a {
            /* renamed from: a */
            public abstract C8335a mo9268a(Boolean bool);

            /* renamed from: a */
            public abstract C8335a mo9269a(Number number);

            /* renamed from: a */
            public abstract C8335a mo9270a(String str);

            /* renamed from: a */
            public abstract C8335a mo9271a(List list);

            /* renamed from: a */
            public abstract C8336a mo9272a();

            /* renamed from: b */
            public abstract C8335a mo9273b(Boolean bool);

            /* renamed from: b */
            public abstract C8335a mo9274b(Number number);

            /* renamed from: b */
            public abstract C8335a mo9275b(String str);

            /* renamed from: c */
            public abstract C8335a mo9276c(Number number);

            /* renamed from: c */
            public abstract C8335a mo9277c(String str);

            /* renamed from: d */
            public abstract C8335a mo9278d(Number number);

            /* renamed from: d */
            public abstract C8335a mo9279d(String str);

            /* renamed from: e */
            public abstract C8335a mo9280e(Number number);

            /* renamed from: f */
            public abstract C8335a mo9281f(Number number);

            /* renamed from: g */
            public abstract C8335a mo9282g(Number number);

            /* renamed from: h */
            public abstract C8335a mo9283h(Number number);

            /* renamed from: i */
            public abstract C8335a mo9284i(Number number);

            /* renamed from: j */
            public abstract C8335a mo9285j(Number number);

            /* renamed from: k */
            public abstract C8335a mo9286k(Number number);
        }

        @Nullable
        /* renamed from: a */
        public abstract Number mo9287a();

        @Nullable
        /* renamed from: b */
        public abstract Boolean mo9288b();

        @Nullable
        /* renamed from: c */
        public abstract Number mo9289c();

        @Nullable
        /* renamed from: d */
        public abstract List mo9290d();

        @Nullable
        /* renamed from: e */
        public abstract Number mo9291e();

        @Nullable
        /* renamed from: f */
        public abstract Number mo9292f();

        @Nullable
        /* renamed from: g */
        public abstract String mo9293g();

        @Nullable
        /* renamed from: h */
        public abstract String mo9294h();

        @Nullable
        /* renamed from: i */
        public abstract Number mo9295i();

        @Nullable
        /* renamed from: j */
        public abstract Number mo9296j();

        @Nullable
        /* renamed from: k */
        public abstract Number mo9297k();

        @Nullable
        /* renamed from: l */
        public abstract Boolean mo9298l();

        @Nullable
        /* renamed from: m */
        public abstract String mo9299m();

        @Nullable
        /* renamed from: n */
        public abstract Number mo9300n();

        @Nullable
        /* renamed from: o */
        public abstract Number mo9301o();

        @Nullable
        /* renamed from: p */
        public abstract Number mo9302p();

        @Nullable
        /* renamed from: q */
        public abstract String mo9303q();

        @Nullable
        /* renamed from: r */
        public abstract Number mo9304r();

        /* renamed from: s */
        public static C8335a m35476s() {
            return new C10398a();
        }
    }

    @Inject
    public C8337b(C2630h c2630h, C15193i c15193i, C10400d c10400d, OfferRepository offerRepository, BillerVersionCodeProvider billerVersionCodeProvider) {
        this.f29627a = c2630h;
        this.f29628b = c15193i;
        this.f29629c = c10400d;
        this.f29630d = offerRepository;
        this.f29631e = billerVersionCodeProvider;
    }

    /* renamed from: a */
    public void m35501a(int i) {
        i = m35496c(i);
        this.f29627a.a(cd.m44320a().m37915c(i.mo9287a()).m37910a(i.mo9288b()).m37914b(i.mo9289c()).m37912a(i.mo9290d()).m37911a(i.mo9291e()).m37916d(i.mo9292f()).m37917e(i.mo9304r()).m37913a());
    }

    /* renamed from: b */
    public void m35505b(int i) {
        i = m35496c(i);
        this.f29627a.a(bz.m44238a().m37876c(i.mo9287a()).m37871a(i.mo9288b()).m37875b(i.mo9289c()).m37873a(i.mo9290d()).m37872a(i.mo9291e()).m37877d(i.mo9292f()).m37874a());
    }

    /* renamed from: a */
    public void m35502a(int i, @NonNull C14510e c14510e) {
        i = m35497c(i, c14510e);
        this.f29627a.a(cb.m44291a().m37904c(i.mo9287a()).m37896a(i.mo9288b()).m37902b(i.mo9289c()).m37899a(i.mo9290d()).m37897a(i.mo9291e()).m37906d(i.mo9292f()).m37898a(i.mo9303q()).m37907e(i.mo9302p()).m37903b(i.mo9299m()).m37901b(i.mo9298l()).m37905c(i.mo9293g()).m37908f(i.mo9300n()).m37909g(i.mo9301o()).m37900a());
    }

    /* renamed from: b */
    public void m35506b(int i, @NonNull C14510e c14510e) {
        i = m35497c(i, c14510e);
        this.f29627a.a(ca.m44260a().m37889c(i.mo9287a()).m37881a(i.mo9288b()).m37887b(i.mo9289c()).m37884a(i.mo9290d()).m37882a(i.mo9291e()).m37891d(i.mo9292f()).m37883a(i.mo9303q()).m37892e(i.mo9302p()).m37888b(i.mo9299m()).m37886b(i.mo9298l()).m37890c(i.mo9293g()).m37893f(i.mo9300n()).m37894g(i.mo9301o()).m37895h(i.mo9304r()).m37885a());
    }

    /* renamed from: a */
    public void m35500a() {
        this.f29627a.a(cj.m44373a().m37932a(m35499e().mo9288b()).m37933a());
    }

    /* renamed from: a */
    public void m35503a(BoostButtonView$AnalyticsSource boostButtonView$AnalyticsSource) {
        if (boostButtonView$AnalyticsSource == BoostButtonView$AnalyticsSource.UNKNOWN) {
            throw new IllegalArgumentException("Analytics Source must not be UNKNOWN");
        }
        C8336a e = m35499e();
        this.f29627a.a(ci.m44354a().m37925a(e.mo9288b()).m37926a(e.mo9295i()).m37929b(e.mo9292f()).m37927a(e.mo9294h()).m37930c(e.mo9296j()).m37931d(Integer.valueOf(boostButtonView$AnalyticsSource.getSource())).m37928a());
    }

    /* renamed from: b */
    public void m35504b() {
        this.f29627a.a(cg.m44349a().m37923a(m35499e().mo9288b()).m37924a());
    }

    /* renamed from: c */
    public void m35507c() {
        C8336a e = m35499e();
        this.f29627a.a(ck.m44378a().m37934a(e.mo9288b()).m37935a(e.mo9295i()).m37938b(e.mo9292f()).m37936a(e.mo9294h()).m37939c(e.mo9297k()).m37937a());
    }

    /* renamed from: d */
    public void m35508d() {
        C8336a e = m35499e();
        this.f29627a.a(ce.m44337a().m37918a(e.mo9288b()).m37919a(e.mo9295i()).m37922b(e.mo9292f()).m37920a(e.mo9294h()).m37921a());
    }

    @NonNull
    /* renamed from: e */
    private C8336a m35499e() {
        return m35498d(-1).mo9272a();
    }

    @NonNull
    /* renamed from: c */
    private C8336a m35496c(int i) {
        return m35498d(i).mo9272a();
    }

    @NonNull
    /* renamed from: c */
    private C8336a m35497c(int i, @NonNull C14510e c14510e) {
        return m35498d(i).mo9277c(c14510e.d().a()).mo9283h(c14510e.d().b()).mo9284i(c14510e.j().b()).mo9285j(c14510e.f()).mo9273b(Boolean.valueOf(c14510e.i())).mo9279d(c14510e.a()).mo9272a();
    }

    @NonNull
    /* renamed from: d */
    private C8335a m35498d(int i) {
        C8335a s = C8336a.m35476s();
        s.mo9269a(Integer.valueOf(i)).mo9270a(ab.b()).mo9268a(Boolean.valueOf(this.f29628b.a())).mo9274b(Integer.valueOf(2)).mo9286k(Integer.valueOf(this.f29631e.getPurchaseCodeVersion())).mo9282g(Integer.valueOf(-1));
        i = this.f29629c.m42282e();
        if (i != 0) {
            s.mo9280e(Integer.valueOf(i.getConsumedFrom())).mo9278d(Integer.valueOf(i.getRemaining())).mo9276c(Long.valueOf(i.getExpiresAt())).mo9275b(i.getBoostId()).mo9281f(Double.valueOf(BoostStatusExt.multiplierWithFallback(i)));
        }
        i = this.f29630d.getOffers(ProductType.BOOST);
        if (!i.isEmpty()) {
            s.mo9271a((List) Observable.a(i).k(C12622c.f40724a).v().u().b());
        }
        return s;
    }

    /* renamed from: a */
    static final /* synthetic */ Map m35495a(C14510e c14510e) {
        Map hashMap = new HashMap(2);
        hashMap.put("sku", c14510e.a());
        hashMap.put("price", c14510e.d().b());
        return hashMap;
    }
}
