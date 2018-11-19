package com.tinder.sponsoredmessage;

import com.tinder.addy.AdAggregator;
import com.tinder.addy.LoaderPriority;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.C6191a;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.PublisherAdRequestFactory;
import com.tinder.messageads.p296c.C13472c;
import java.util.Collection;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/sponsoredmessage/SponsoredMessageAdsRegistrar;", "", "config", "Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;", "adAggregator", "Lcom/tinder/addy/AdAggregator;", "sponsoredMessageAdFactory", "Lcom/tinder/messageads/factory/SponsoredMessageAdFactory;", "nativeDfpLoaderBuilderProvider", "Ljavax/inject/Provider;", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$Builder;", "publisherAdRequestFactory", "Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$PublisherAdRequestFactory;", "requestRules", "Lcom/tinder/sponsoredmessage/AdRequestRuleSet;", "(Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;Lcom/tinder/addy/AdAggregator;Lcom/tinder/messageads/factory/SponsoredMessageAdFactory;Ljavax/inject/Provider;Lcom/tinder/addy/source/nativedfp/NativeDfpLoader$PublisherAdRequestFactory;Lcom/tinder/sponsoredmessage/AdRequestRuleSet;)V", "subscription", "Lrx/Subscription;", "addDfpLoader", "", "register", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.sponsoredmessage.d */
public final class C15033d {
    /* renamed from: a */
    private Subscription f46809a;
    /* renamed from: b */
    private final C15034e f46810b;
    /* renamed from: c */
    private final AdAggregator f46811c;
    /* renamed from: d */
    private final C13472c f46812d;
    /* renamed from: e */
    private final Provider<C6191a> f46813e;
    /* renamed from: f */
    private final PublisherAdRequestFactory f46814f;
    /* renamed from: g */
    private final C15032a f46815g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/sponsoredmessage/AdRequestRule;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.d$a */
    static final class C18148a<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        public static final C18148a f56315a = new C18148a();

        C18148a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65846a((AdRequestRule) obj);
        }

        /* renamed from: a */
        public final Observable<Boolean> m65846a(AdRequestRule adRequestRule) {
            return adRequestRule.shouldRequestAd().a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "list", "", "kotlin.jvm.PlatformType", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.d$b */
    static final class C18149b<T, R> implements Func1<List<Boolean>, Boolean> {
        /* renamed from: a */
        public static final C18149b f56316a = new C18149b();

        C18149b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65847a((List) obj));
        }

        /* renamed from: a */
        public final boolean m65847a(List<Boolean> list) {
            C2668g.a(list, "list");
            Iterable<Boolean> iterable = list;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            for (Boolean a : iterable) {
                if (!C2668g.a(a, Boolean.valueOf(true))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.d$c */
    static final class C18908c<T> implements Action1<List<Boolean>> {
        /* renamed from: a */
        final /* synthetic */ C15033d f58551a;

        C18908c(C15033d c15033d) {
            this.f58551a = c15033d;
        }

        public /* synthetic */ void call(Object obj) {
            m67388a((List) obj);
        }

        /* renamed from: a */
        public final void m67388a(List<Boolean> list) {
            this.f58551a.m56645b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.d$d */
    static final class C18909d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18909d f58552a = new C18909d();

        C18909d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67389a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67389a(Throwable th) {
            C0001a.c(th, "Error subscribing to Message Ad Request Rules", new Object[0]);
        }
    }

    public C15033d(@NotNull C15034e c15034e, @NotNull AdAggregator adAggregator, @NotNull C13472c c13472c, @NotNull Provider<C6191a> provider, @NotNull PublisherAdRequestFactory publisherAdRequestFactory, @NotNull C15032a c15032a) {
        C2668g.b(c15034e, "config");
        C2668g.b(adAggregator, "adAggregator");
        C2668g.b(c13472c, "sponsoredMessageAdFactory");
        C2668g.b(provider, "nativeDfpLoaderBuilderProvider");
        C2668g.b(publisherAdRequestFactory, "publisherAdRequestFactory");
        C2668g.b(c15032a, "requestRules");
        this.f46810b = c15034e;
        this.f46811c = adAggregator;
        this.f46812d = c13472c;
        this.f46813e = provider;
        this.f46814f = publisherAdRequestFactory;
        this.f46815g = c15032a;
    }

    /* renamed from: a */
    public final void m56646a() {
        if (this.f46810b.m56647a()) {
            this.f46809a = Observable.a(this.f46815g.m56643a()).h(C18148a.f56315a).v().f(C18149b.f56316a).b(Schedulers.io()).a(new C18908c(this), C18909d.f58552a);
        }
    }

    /* renamed from: b */
    private final void m56645b() {
        this.f46811c.a(((C6191a) this.f46813e.get()).a(this.f46810b.m56648b()).b(this.f46810b.m56649c()).a(this.f46812d).a(LoaderPriority.HIGH).a(this.f46814f).a());
    }
}
