package com.tinder.tinderplus.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.etl.event.mj;
import com.tinder.etl.event.yq;
import com.tinder.etl.event.yr;
import com.tinder.etl.event.ys;
import com.tinder.etl.event.yt;
import com.tinder.etl.event.yu;
import com.tinder.etl.event.yv;
import com.tinder.etl.event.yx;
import com.tinder.managers.bk;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14510e.C14509b;
import com.tinder.purchase.domain.model.C14514j;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.providers.BillerVersionCodeProvider;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tinderplus.model.C16957b.C16956a;
import com.tinder.tinderplus.model.C16959c.C16958a;
import com.tinder.tinderplus.p428a.C15188a;
import com.tinder.tinderplus.p428a.C15192e;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.tinderplus.p429b.C15201k;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import com.tinder.utils.ab;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java8.util.Optional;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;
import javax.inject.Inject;
import rx.Observable;

/* renamed from: com.tinder.tinderplus.model.p */
public class C15219p {
    @NonNull
    /* renamed from: a */
    private final LikeStatusProvider f47294a;
    @NonNull
    /* renamed from: b */
    private final bk f47295b;
    @NonNull
    /* renamed from: c */
    private final C15192e f47296c;
    @NonNull
    /* renamed from: d */
    private final OfferRepository f47297d;
    @NonNull
    /* renamed from: e */
    private final C15071e f47298e;
    @NonNull
    /* renamed from: f */
    private final C15193i f47299f;
    @NonNull
    /* renamed from: g */
    private final C15188a f47300g;
    @NonNull
    /* renamed from: h */
    private final BillerVersionCodeProvider f47301h;

    /* renamed from: com.tinder.tinderplus.model.p$a */
    static abstract class C15216a {

        /* renamed from: com.tinder.tinderplus.model.p$a$a */
        public static abstract class C15215a {
            /* renamed from: a */
            public abstract C15215a mo12566a(Boolean bool);

            /* renamed from: a */
            public abstract C15215a mo12567a(Number number);

            /* renamed from: a */
            public abstract C15215a mo12568a(String str);

            /* renamed from: a */
            public abstract C15215a mo12569a(List list);

            /* renamed from: a */
            public abstract C15216a mo12570a();

            /* renamed from: b */
            public abstract C15215a mo12571b(Boolean bool);

            /* renamed from: b */
            public abstract C15215a mo12572b(Number number);

            /* renamed from: b */
            public abstract C15215a mo12573b(String str);

            /* renamed from: b */
            public abstract C15215a mo12574b(List list);

            /* renamed from: c */
            public abstract C15215a mo12575c(Number number);

            /* renamed from: c */
            public abstract C15215a mo12576c(String str);

            /* renamed from: c */
            public abstract C15215a mo12577c(List list);

            /* renamed from: d */
            public abstract C15215a mo12578d(Number number);

            /* renamed from: d */
            public abstract C15215a mo12579d(String str);

            /* renamed from: d */
            public abstract C15215a mo12580d(List list);

            /* renamed from: e */
            public abstract C15215a mo12581e(Number number);

            /* renamed from: e */
            public abstract C15215a mo12582e(String str);

            /* renamed from: e */
            public abstract C15215a mo12583e(List list);

            /* renamed from: f */
            public abstract C15215a mo12584f(Number number);

            /* renamed from: f */
            public abstract C15215a mo12585f(String str);

            /* renamed from: g */
            public abstract C15215a mo12586g(Number number);

            /* renamed from: h */
            public abstract C15215a mo12587h(Number number);

            /* renamed from: i */
            public abstract C15215a mo12588i(Number number);

            /* renamed from: j */
            public abstract C15215a mo12589j(Number number);

            /* renamed from: k */
            public abstract C15215a mo12590k(Number number);

            /* renamed from: l */
            public abstract C15215a mo12591l(Number number);

            /* renamed from: m */
            public abstract C15215a mo12592m(Number number);

            /* renamed from: n */
            public abstract C15215a mo12593n(Number number);

            /* renamed from: o */
            public abstract C15215a mo12594o(Number number);
        }

        @Nullable
        /* renamed from: A */
        public abstract List mo12595A();

        @Nullable
        /* renamed from: B */
        public abstract Boolean mo12596B();

        @Nullable
        /* renamed from: C */
        public abstract List mo12597C();

        @Nullable
        /* renamed from: D */
        public abstract Boolean mo12598D();

        @Nullable
        /* renamed from: E */
        public abstract Boolean mo12599E();

        @Nullable
        /* renamed from: F */
        public abstract Number mo12600F();

        @Nullable
        /* renamed from: G */
        public abstract Number mo12601G();

        @Nullable
        /* renamed from: a */
        public abstract List mo12602a();

        @Nullable
        /* renamed from: b */
        public abstract String mo12603b();

        @Nullable
        /* renamed from: c */
        public abstract Number mo12604c();

        @Nullable
        /* renamed from: d */
        public abstract String mo12605d();

        @Nullable
        /* renamed from: e */
        public abstract Number mo12606e();

        @Nullable
        /* renamed from: f */
        public abstract Number mo12607f();

        @Nullable
        /* renamed from: g */
        public abstract Number mo12608g();

        @Nullable
        /* renamed from: h */
        public abstract Number mo12609h();

        @Nullable
        /* renamed from: i */
        public abstract String mo12610i();

        @Nullable
        /* renamed from: j */
        public abstract Boolean mo12611j();

        @Nullable
        /* renamed from: k */
        public abstract Number mo12612k();

        @Nullable
        /* renamed from: l */
        public abstract Number mo12613l();

        @Nullable
        /* renamed from: m */
        public abstract List mo12614m();

        @Nullable
        /* renamed from: n */
        public abstract String mo12615n();

        @Nullable
        /* renamed from: o */
        public abstract Number mo12616o();

        @Nullable
        /* renamed from: p */
        public abstract Number mo12617p();

        @Nullable
        /* renamed from: q */
        public abstract Number mo12618q();

        @Nullable
        /* renamed from: r */
        public abstract Number mo12619r();

        @Nullable
        /* renamed from: s */
        public abstract String mo12620s();

        @Nullable
        /* renamed from: t */
        public abstract List mo12621t();

        @Nullable
        /* renamed from: u */
        public abstract List mo12622u();

        @Nullable
        /* renamed from: v */
        public abstract Number mo12623v();

        @Nullable
        /* renamed from: w */
        public abstract String mo12624w();

        @Nullable
        /* renamed from: x */
        public abstract String mo12625x();

        @Nullable
        /* renamed from: y */
        public abstract String mo12626y();

        @Nullable
        /* renamed from: z */
        public abstract Number mo12627z();

        C15216a() {
        }

        /* renamed from: H */
        public static C15215a m57214H() {
            return new C16956a();
        }
    }

    /* renamed from: com.tinder.tinderplus.model.p$b */
    public static abstract class C15218b {

        /* renamed from: com.tinder.tinderplus.model.p$b$a */
        public static abstract class C15217a {
            /* renamed from: a */
            public abstract C15217a mo12628a(C14510e c14510e);

            /* renamed from: a */
            public abstract C15217a mo12629a(Integer num);

            /* renamed from: a */
            public abstract C15217a mo12630a(List<String> list);

            /* renamed from: a */
            public abstract C15217a mo12631a(boolean z);

            /* renamed from: a */
            public abstract C15218b mo12632a();

            /* renamed from: b */
            public abstract C15217a mo12633b(Integer num);

            /* renamed from: b */
            public abstract C15217a mo12634b(List<Integer> list);

            /* renamed from: c */
            public abstract C15217a mo12635c(Integer num);
        }

        @Nullable
        /* renamed from: a */
        public abstract Integer mo12636a();

        /* renamed from: b */
        public abstract boolean mo12637b();

        @Nullable
        /* renamed from: c */
        public abstract C14510e mo12638c();

        @NonNull
        /* renamed from: d */
        public abstract List<String> mo12639d();

        @Nullable
        /* renamed from: e */
        public abstract Integer mo12640e();

        @Nullable
        /* renamed from: f */
        public abstract Integer mo12641f();

        @NonNull
        /* renamed from: g */
        public abstract List<Integer> mo12642g();

        /* renamed from: h */
        public static C15217a m57256h() {
            return new C16958a().mo12631a(false).mo12630a(Collections.emptyList()).mo12634b(Collections.emptyList());
        }
    }

    @Inject
    public C15219p(@NonNull LikeStatusProvider likeStatusProvider, @NonNull bk bkVar, @NonNull C15192e c15192e, @NonNull OfferRepository offerRepository, @NonNull C15071e c15071e, @NonNull C15193i c15193i, @NonNull C15188a c15188a, @NonNull BillerVersionCodeProvider billerVersionCodeProvider) {
        this.f47294a = likeStatusProvider;
        this.f47295b = bkVar;
        this.f47296c = c15192e;
        this.f47297d = offerRepository;
        this.f47298e = c15071e;
        this.f47299f = c15193i;
        this.f47300g = c15188a;
        this.f47301h = billerVersionCodeProvider;
    }

    @NonNull
    /* renamed from: a */
    public yx m57270a(@NonNull C15218b c15218b) {
        c15218b = m57268i(c15218b);
        return yx.a().b(c15218b.mo12605d()).a(c15218b.mo12613l()).a(c15218b.mo12603b()).a(c15218b.mo12595A()).d(c15218b.mo12625x()).c(c15218b.mo12624w()).b(c15218b.mo12623v()).a();
    }

    @NonNull
    /* renamed from: b */
    public yt m57271b(@NonNull C15218b c15218b) {
        c15218b = m57268i(c15218b);
        return yt.a().b(c15218b.mo12605d()).g(c15218b.mo12613l()).a(c15218b.mo12603b()).f(c15218b.mo12625x()).e(c15218b.mo12624w()).j(c15218b.mo12623v()).a(c15218b.mo12602a()).a(c15218b.mo12604c()).b(c15218b.mo12606e()).c(c15218b.mo12607f()).a(c15218b.mo12611j()).e(c15218b.mo12609h()).i(c15218b.mo12619r()).c(c15218b.mo12621t()).d(c15218b.mo12622u()).f(c15218b.mo12612k()).c(c15218b.mo12610i()).d(c15218b.mo12608g()).d(c15218b.mo12620s()).b(c15218b.mo12614m()).h(c15218b.mo12618q()).k(c15218b.mo12627z()).a();
    }

    @NonNull
    /* renamed from: c */
    public yu m57272c(@NonNull C15218b c15218b) {
        c15218b = m57268i(c15218b);
        return yu.a().a(Boolean.valueOf(true)).a(c15218b.mo12613l()).a(c15218b.mo12603b()).c(c15218b.mo12625x()).b(c15218b.mo12624w()).b(c15218b.mo12623v()).g(c15218b.mo12609h()).c(c15218b.mo12604c()).d(c15218b.mo12606e()).b(c15218b.mo12621t()).c(c15218b.mo12622u()).i(c15218b.mo12612k()).d(c15218b.mo12610i()).e(c15218b.mo12608g()).a(c15218b.mo12614m()).h(c15218b.mo12618q()).f(c15218b.mo12627z()).a();
    }

    @NonNull
    /* renamed from: a */
    public yu m57269a() {
        return yu.a().a(Boolean.valueOf(false)).f(m57268i(C15218b.m57256h().mo12632a()).mo12627z()).a();
    }

    @NonNull
    /* renamed from: d */
    public yr m57273d(@NonNull C15218b c15218b) {
        c15218b = m57268i(c15218b);
        return yr.a().d(c15218b.mo12613l()).a(c15218b.mo12603b()).b(c15218b.mo12595A()).c(c15218b.mo12597C()).d(c15218b.mo12625x()).c(c15218b.mo12624w()).f(c15218b.mo12623v()).a(c15218b.mo12602a()).c(c15218b.mo12607f()).a(c15218b.mo12611j()).a(c15218b.mo12604c()).b(c15218b.mo12606e()).e(c15218b.mo12619r()).e(c15218b.mo12621t()).f(c15218b.mo12622u()).b(c15218b.mo12620s()).d(c15218b.mo12614m()).g(c15218b.mo12627z()).a();
    }

    @NonNull
    /* renamed from: e */
    public yq m57274e(@NonNull C15218b c15218b) {
        c15218b = m57268i(c15218b);
        return yq.a().a(c15218b.mo12613l()).a(c15218b.mo12603b()).f(c15218b.mo12595A()).d(c15218b.mo12597C()).c(c15218b.mo12625x()).b(c15218b.mo12624w()).b(c15218b.mo12623v()).e(c15218b.mo12602a()).f(c15218b.mo12607f()).a(c15218b.mo12611j()).c(c15218b.mo12604c()).d(c15218b.mo12606e()).e(c15218b.mo12619r()).b(c15218b.mo12621t()).c(c15218b.mo12622u()).i(c15218b.mo12612k()).e(c15218b.mo12610i()).g(c15218b.mo12608g()).d(c15218b.mo12620s()).a(c15218b.mo12614m()).h(c15218b.mo12618q()).a();
    }

    @NonNull
    /* renamed from: f */
    public yv m57275f(@NonNull C15218b c15218b) {
        c15218b = m57268i(c15218b);
        return yv.a().a(c15218b.mo12613l()).a(c15218b.mo12603b()).c(c15218b.mo12625x()).b(c15218b.mo12624w()).b(c15218b.mo12623v()).d(c15218b.mo12602a()).f(c15218b.mo12607f()).a(c15218b.mo12611j()).c(c15218b.mo12604c()).d(c15218b.mo12606e()).e(c15218b.mo12619r()).b(c15218b.mo12621t()).c(c15218b.mo12622u()).i(c15218b.mo12612k()).e(c15218b.mo12610i()).g(c15218b.mo12608g()).d(c15218b.mo12620s()).a(c15218b.mo12614m()).h(c15218b.mo12618q()).a();
    }

    @NonNull
    /* renamed from: g */
    public ys m57276g(@NonNull C15218b c15218b) {
        c15218b = m57268i(c15218b);
        return ys.a().a(c15218b.mo12603b()).d(c15218b.mo12602a()).a(c15218b.mo12611j()).b(c15218b.mo12604c()).b(c15218b.mo12621t()).c(c15218b.mo12622u()).c(c15218b.mo12620s()).a(c15218b.mo12614m()).b(c15218b.mo12615n()).c(c15218b.mo12616o()).a(c15218b.mo12617p()).d(c15218b.mo12618q()).a();
    }

    @NonNull
    /* renamed from: h */
    public mj m57277h(@NonNull C15218b c15218b) {
        c15218b = m57268i(c15218b);
        return mj.a().a(c15218b.mo12603b()).a(c15218b.mo12599E()).b(c15218b.mo12605d()).a(c15218b.mo12622u()).a(c15218b.mo12600F()).b(c15218b.mo12601G()).a();
    }

    @NonNull
    /* renamed from: i */
    private C15216a m57268i(@NonNull C15218b c15218b) {
        C15215a a = m57264a(c15218b.mo12637b());
        List g = c15218b.mo12642g();
        if (!g.isEmpty()) {
            a.mo12577c(g);
        }
        g = (List) StreamSupport.m59708a(this.f47300g.m57104a()).map(C16971q.f52359a).collect(Collectors.m59434a());
        if (!g.isEmpty()) {
            a.mo12580d(g);
        }
        C14510e c = c15218b.mo12638c();
        if (c != null) {
            a.mo12584f((Number) Optional.m59121b(c.mo11843e()).m59122a(C16972r.f52360a).m59130c(null));
            a.mo12576c(c.mo11839a());
            a.mo12578d(c.mo11842d().mo11870b());
            a.mo12568a(c.mo11842d().mo11869a());
        }
        Number a2 = c15218b.mo12636a();
        if (a2 != null) {
            a.mo12567a(a2);
        }
        g = c15218b.mo12639d();
        if (!g.isEmpty()) {
            a.mo12574b(g);
            Number e = c15218b.mo12640e();
            if (e != null) {
                a.mo12587h(e);
                if (g.size() > e.intValue()) {
                    a.mo12579d((String) g.get(e.intValue()));
                }
                c15218b = c15218b.mo12641f();
                if (c15218b != null) {
                    if (c15218b.intValue() > e.intValue()) {
                        a.mo12588i(Integer.valueOf(null));
                    } else if (c15218b.intValue() < e.intValue()) {
                        a.mo12588i(Integer.valueOf(1));
                    }
                }
            }
        }
        return a.mo12570a();
    }

    @NonNull
    /* renamed from: a */
    private C15215a m57264a(boolean z) {
        C15215a H = C15216a.m57214H();
        H.mo12571b(Boolean.valueOf(this.f47299f.m57121a())).mo12573b(ab.m57609b()).mo12592m(Integer.valueOf(m57267b())).mo12593n(Integer.valueOf(0)).mo12594o(Integer.valueOf(0)).mo12572b(Integer.valueOf(4)).mo12575c(Integer.valueOf(this.f47294a.currentStatus().likesPercentRemaining())).mo12566a(Boolean.valueOf(this.f47295b.M())).mo12581e(Integer.valueOf(2)).mo12590k(Integer.valueOf(C15201k.m57129a()));
        SuperlikeStatus b = this.f47298e.m56818b();
        if (b != null) {
            H.mo12589j(Integer.valueOf(b.remainingCount()));
        }
        List offers = this.f47297d.getOffers(ProductType.PLUS);
        if (!offers.isEmpty()) {
            C14514j j = ((C14510e) offers.get(0)).mo11848j();
            H.mo12586g(j.mo11870b());
            H.mo12568a(j.mo11869a());
            H.mo12583e((List) Observable.a(offers).k(C18214s.f56471a).v().u().b());
            H.mo12569a((List) Observable.a(offers).k(C18215t.f56472a).v().u().b());
            C14509b a = this.f47296c.m57111a(offers);
            if (a != null && (this.f47296c.m57117d() || z)) {
                offers = (List) Observable.a(offers).k(C18216u.f56473a).f(C18217v.f56474a).k(C18218w.f56475a).v().u().b();
                H.mo12585f(a.mo11864e()).mo12582e(a.mo11865f()).mo12591l(a.mo11862c().mo11870b()).mo12569a(offers);
            }
        }
        return H;
    }

    /* renamed from: a */
    static final /* synthetic */ Map m57266a(C14510e c14510e) {
        Map hashMap = new HashMap(2);
        hashMap.put("sku", c14510e.mo11839a());
        hashMap.put("price", c14510e.mo11842d().mo11870b());
        return hashMap;
    }

    /* renamed from: a */
    static final /* synthetic */ Map m57265a(C14509b c14509b) {
        Map hashMap = new HashMap(2);
        hashMap.put("sku", c14509b.mo11860a());
        hashMap.put("price", c14509b.mo11862c().mo11870b());
        return hashMap;
    }

    /* renamed from: b */
    private int m57267b() {
        return this.f47301h.getPurchaseCodeVersion();
    }
}
