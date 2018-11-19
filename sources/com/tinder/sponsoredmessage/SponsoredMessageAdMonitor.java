package com.tinder.sponsoredmessage;

import com.tinder.addy.Ad;
import com.tinder.addy.AdAggregator;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.profile.model.ProfileOption.Purchase;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.messageads.model.C12131a;
import io.reactivex.C3958c;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeOnSubscribe;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u0014J\u0006\u0010\u001f\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/sponsoredmessage/SponsoredMessageAdMonitor;", "", "adAggregator", "Lcom/tinder/addy/AdAggregator;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "sponsoredMessageViewedCache", "Lcom/tinder/sponsoredmessage/SponsoredMessageViewedCache;", "adAggregatorListeners", "", "Lcom/tinder/addy/AdAggregator$Listener;", "config", "Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;", "(Lcom/tinder/addy/AdAggregator;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/tinder/sponsoredmessage/SponsoredMessageViewedCache;Ljava/util/Set;Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/sponsoredmessage/SponsoredMessageAdMonitor$Listener;", "addListener", "", "listener", "consumeAd", "Lio/reactivex/Maybe;", "Lcom/tinder/messageads/model/MessageAd;", "loadMessageAd", "register", "registrar", "Lcom/tinder/sponsoredmessage/SponsoredMessageAdsRegistrar;", "removeListener", "start", "stop", "Listener", "message-ads_release"}, k = 1, mv = {1, 1, 10})
public final class SponsoredMessageAdMonitor {
    /* renamed from: a */
    private final C17356a f46800a = new C17356a();
    /* renamed from: b */
    private final CopyOnWriteArraySet<Listener> f46801b = new CopyOnWriteArraySet();
    /* renamed from: c */
    private final AdAggregator f46802c;
    /* renamed from: d */
    private final LoadProfileOptionData f46803d;
    /* renamed from: e */
    private final SponsoredMessageViewedCache f46804e;
    /* renamed from: f */
    private final Set<com.tinder.addy.AdAggregator.Listener> f46805f;
    /* renamed from: g */
    private final C15034e f46806g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/sponsoredmessage/SponsoredMessageAdMonitor$Listener;", "", "onSponsoredMatchAdAvailable", "", "sponsoredMessageAd", "Lcom/tinder/messageads/model/MessageAd;", "message-ads_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onSponsoredMatchAdAvailable(@NotNull C12131a c12131a);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.SponsoredMessageAdMonitor$a */
    static final class C16820a implements Action {
        /* renamed from: a */
        public static final C16820a f51882a = new C16820a();

        C16820a() {
        }

        public final void run() {
            C0001a.b("No Sponsored Message ads available", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/messageads/model/MessageAd;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.SponsoredMessageAdMonitor$b */
    static final class C16821b<T> implements Consumer<C12131a> {
        /* renamed from: a */
        final /* synthetic */ SponsoredMessageAdMonitor f51883a;

        C16821b(SponsoredMessageAdMonitor sponsoredMessageAdMonitor) {
            this.f51883a = sponsoredMessageAdMonitor;
        }

        public /* synthetic */ void accept(Object obj) {
            m62378a((C12131a) obj);
        }

        /* renamed from: a */
        public final void m62378a(C12131a c12131a) {
            C0001a.b("Sponsored Message ads received", new Object[0]);
            SponsoredMessageViewedCache c = this.f51883a.f46804e;
            C2668g.a(c12131a, "it");
            c.add(c12131a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/MaybeEmitter;", "Lcom/tinder/messageads/model/MessageAd;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.SponsoredMessageAdMonitor$c */
    static final class C16822c<T> implements MaybeOnSubscribe<T> {
        /* renamed from: a */
        final /* synthetic */ SponsoredMessageAdMonitor f51884a;

        C16822c(SponsoredMessageAdMonitor sponsoredMessageAdMonitor) {
            this.f51884a = sponsoredMessageAdMonitor;
        }

        public final void subscribe(@NotNull MaybeEmitter<C12131a> maybeEmitter) {
            C2668g.b(maybeEmitter, "emitter");
            Ad h = this.f51884a.f46802c.h();
            if (h == null) {
                maybeEmitter.onComplete();
                return;
            }
            C12131a c12131a = (C12131a) h;
            if (this.f51884a.f46804e.exists(c12131a)) {
                maybeEmitter.onComplete();
            } else {
                maybeEmitter.onSuccess(c12131a);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/common/model/Subscription;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.SponsoredMessageAdMonitor$d */
    static final class C16823d<T> implements Consumer<Subscription> {
        /* renamed from: a */
        final /* synthetic */ SponsoredMessageAdMonitor f51885a;

        C16823d(SponsoredMessageAdMonitor sponsoredMessageAdMonitor) {
            this.f51885a = sponsoredMessageAdMonitor;
        }

        public /* synthetic */ void accept(Object obj) {
            m62379a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m62379a(Subscription subscription) {
            if (subscription.isActiveSubscription() == null || this.f51885a.f46806g.m56652f() != null) {
                this.f51885a.f46802c.d();
            } else {
                this.f51885a.f46802c.e();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.SponsoredMessageAdMonitor$e */
    static final class C16824e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16824e f51886a = new C16824e();

        C16824e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62380a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62380a(Throwable th) {
            C0001a.b(th, "Failed to subscribe to subscription updates", new Object[0]);
        }
    }

    public SponsoredMessageAdMonitor(@NotNull AdAggregator adAggregator, @NotNull LoadProfileOptionData loadProfileOptionData, @NotNull SponsoredMessageViewedCache sponsoredMessageViewedCache, @NotNull Set<? extends com.tinder.addy.AdAggregator.Listener> set, @NotNull C15034e c15034e) {
        C2668g.b(adAggregator, "adAggregator");
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.b(sponsoredMessageViewedCache, "sponsoredMessageViewedCache");
        C2668g.b(set, "adAggregatorListeners");
        C2668g.b(c15034e, "config");
        this.f46802c = adAggregator;
        this.f46803d = loadProfileOptionData;
        this.f46804e = sponsoredMessageViewedCache;
        this.f46805f = set;
        this.f46806g = c15034e;
    }

    /* renamed from: a */
    public final void m56636a(@NotNull C15033d c15033d) {
        C2668g.b(c15033d, "registrar");
        c15033d.m56646a();
    }

    /* renamed from: a */
    public final void m56635a() {
        for (com.tinder.addy.AdAggregator.Listener listener : this.f46805f) {
            this.f46802c.a(listener);
            if (listener instanceof C16843c) {
                ((C16843c) listener).m62397a(this.f46801b);
            }
        }
        this.f46802c.a();
        this.f46800a.add(this.f46803d.execute(Purchase.INSTANCE).subscribeOn(C15756a.m59010b()).subscribe(new C16823d(this), C16824e.f51886a));
    }

    /* renamed from: b */
    public final void m56637b() {
        this.f46802c.b();
        this.f46800a.m63446a();
        for (com.tinder.addy.AdAggregator.Listener b : this.f46805f) {
            this.f46802c.b(b);
        }
    }

    @NotNull
    /* renamed from: c */
    public final C3958c<C12131a> m56638c() {
        C3958c<C12131a> c = m56634d().a(C16820a.f51882a).c(new C16821b(this));
        C2668g.a(c, "loadMessageAd()\n        …add(it)\n                }");
        return c;
    }

    /* renamed from: d */
    private final C3958c<C12131a> m56634d() {
        C3958c<C12131a> a = C3958c.a(new C16822c(this));
        C2668g.a(a, "Maybe.create { emitter -…cess(messageAd)\n        }");
        return a;
    }
}
