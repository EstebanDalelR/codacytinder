package com.tinder.purchase.p371a;

import android.support.annotation.NonNull;
import com.tinder.api.model.profile.Products;
import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.domain.exception.OfferException.CannotGetPriceFromSkuException;
import com.tinder.purchase.domain.model.C14516k;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.logging.C14522a;
import com.tinder.purchase.model.p377a.C14529b;
import com.tinder.utils.RxUtils;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;
import rx.Observable$Transformer;
import rx.Subscription;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Singleton
/* renamed from: com.tinder.purchase.a.a */
public class C14479a {
    /* renamed from: a */
    private static final String f45858a = "com.tinder.purchase.a.a";
    /* renamed from: b */
    private final C14529b f45859b;
    /* renamed from: c */
    private final OfferRepository f45860c;
    /* renamed from: d */
    private final Biller f45861d;
    /* renamed from: e */
    private final C14522a f45862e;
    /* renamed from: f */
    private Subscription f45863f;

    @Inject
    public C14479a(C14529b c14529b, OfferRepository offerRepository, Biller biller, C14522a c14522a) {
        this.f45859b = c14529b;
        this.f45860c = offerRepository;
        this.f45861d = biller;
        this.f45862e = c14522a;
    }

    /* renamed from: a */
    public void m55312a(@NonNull Products products) {
        if (RxUtils.a(this.f45863f)) {
            RxUtils.b(this.f45863f);
        }
        products = m55308c(products).k(new C17796b(this, products)).b(Schedulers.io());
        Action1 c18611c = new C18611c(this);
        C14522a c14522a = this.f45862e;
        c14522a.getClass();
        this.f45863f = products.a(c18611c, C18612d.m67068a(c14522a));
    }

    /* renamed from: a */
    final /* synthetic */ List m55310a(@NonNull Products products, C14516k c14516k) {
        return this.f45859b.m55517a(products, c14516k);
    }

    /* renamed from: a */
    final /* synthetic */ void m55313a(List list) {
        this.f45860c.setAllOffers(list);
        String str = f45858a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Loaded offers");
        stringBuilder.append(list);
        ad.c(str, stringBuilder.toString());
    }

    /* renamed from: c */
    private Observable<C14516k> m55308c(@NonNull Products products) {
        return Observable.a(new C17797e(this, products));
    }

    /* renamed from: b */
    final /* synthetic */ Observable m55314b(@NonNull Products products) {
        List a = this.f45859b.m55516a(products);
        return this.f45861d.loadPriceListing(a).a().a(m55306b(a));
    }

    /* renamed from: b */
    private Observable$Transformer<C14516k, C14516k> m55306b(List<String> list) {
        return new C18613f(this, list);
    }

    /* renamed from: b */
    final /* synthetic */ Observable m55315b(List list, Observable observable) {
        return Observable.a(observable.a(m55302a()), observable.a(m55307c(list)));
    }

    /* renamed from: a */
    private Observable$Transformer<C14516k, C14516k> m55302a() {
        return C18614g.f58044a;
    }

    /* renamed from: c */
    private Observable$Transformer<C14516k, C14516k> m55307c(List<String> list) {
        return new C18615h(this, list);
    }

    /* renamed from: a */
    final /* synthetic */ Observable m55311a(List list, Observable observable) {
        return observable.k(new C17798i(this, list)).a(RxUtils.a(5, 3000));
    }

    /* renamed from: a */
    final /* synthetic */ C14516k m55309a(List list, C14516k c14516k) {
        if (!m55304a(c14516k, list)) {
            return c14516k;
        }
        List arrayList = new ArrayList();
        arrayList.addAll(m55305b(c14516k, list));
        Collections.sort(arrayList);
        throw new CannotGetPriceFromSkuException(arrayList);
    }

    /* renamed from: a */
    private boolean m55304a(@NonNull C14516k c14516k, @NonNull List<String> list) {
        return c14516k.m55438a().size() < list.size() ? true : null;
    }

    /* renamed from: b */
    private Set<String> m55305b(@NonNull C14516k c14516k, @NonNull List<String> list) {
        if (!m55304a(c14516k, (List) list)) {
            return Collections.emptySet();
        }
        Set<String> hashSet = new HashSet(list);
        hashSet.removeAll(c14516k.m55438a());
        return hashSet;
    }
}
