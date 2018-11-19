package com.tinder.recsads.listener;

import com.tinder.addy.Ad;
import com.tinder.recsads.analytics.C16431b;
import com.tinder.recsads.analytics.C16431b.C14733a;
import com.tinder.recsads.analytics.C16438p;
import com.tinder.recsads.analytics.C16438p.C14743a;
import com.tinder.recsads.analytics.C16440t;
import com.tinder.recsads.analytics.C16440t.C14747a;
import com.tinder.recsads.view.FanStaticAdRecCardView.Listener;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0004\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/recsads/listener/FanStaticAdAnalyticsListener;", "Lcom/tinder/recsads/view/FanStaticAdRecCardView$Listener;", "addAdViewEvent", "Lcom/tinder/recsads/analytics/AddAdViewEvent;", "addAdSelectEvent", "Lcom/tinder/recsads/analytics/AddAdSelectEvent;", "addAdCloseEvent", "Lcom/tinder/recsads/analytics/AddAdCloseEvent;", "(Lcom/tinder/recsads/analytics/AddAdViewEvent;Lcom/tinder/recsads/analytics/AddAdSelectEvent;Lcom/tinder/recsads/analytics/AddAdCloseEvent;)V", "", "eventIdentifier", "", "ad", "Lcom/tinder/addy/Ad;", "onAdCardRemoved", "onAdImageClicked", "onAdTitleClicked", "onAdViewed", "onCallToActionClicked", "onSponsoredClicked", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.listener.c */
public final class C16463c implements Listener {
    /* renamed from: a */
    private final C16440t f51050a;
    /* renamed from: b */
    private final C16438p f51051b;
    /* renamed from: c */
    private final C16431b f51052c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.listener.c$a */
    static final class C18787a implements Action0 {
        /* renamed from: a */
        public static final C18787a f58298a = new C18787a();

        C18787a() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.listener.c$b */
    static final class C18788b implements Action0 {
        /* renamed from: a */
        public static final C18788b f58299a = new C18788b();

        C18788b() {
        }

        public final void call() {
            C0001a.b("send Ad Close event", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.listener.c$c */
    static final class C18789c implements Action0 {
        /* renamed from: a */
        public static final C18789c f58300a = new C18789c();

        C18789c() {
        }

        public final void call() {
        }
    }

    @Inject
    public C16463c(@NotNull C16440t c16440t, @NotNull C16438p c16438p, @NotNull C16431b c16431b) {
        C2668g.b(c16440t, "addAdViewEvent");
        C2668g.b(c16438p, "addAdSelectEvent");
        C2668g.b(c16431b, "addAdCloseEvent");
        this.f51050a = c16440t;
        this.f51051b = c16438p;
        this.f51052c = c16431b;
    }

    public void onAdViewed(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        ad = this.f51050a.m56002a((Object) C14747a.m56021e().mo12151a(), ad).b(Schedulers.io());
        Action0 action0 = C18789c.f58300a;
        Function1 function1 = FanStaticAdAnalyticsListener$onAdViewed$2.f59390a;
        if (function1 != null) {
            function1 = new C18790d(function1);
        }
        ad.a(action0, (Action1) function1);
    }

    public void onAdCardRemoved(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        ad = this.f51052c.m56002a((Object) new C14733a(null, null, 3, null), ad).b(Schedulers.io());
        Action0 action0 = C18788b.f58299a;
        Function1 function1 = FanStaticAdAnalyticsListener$onAdCardRemoved$2.f59389a;
        if (function1 != null) {
            function1 = new C18790d(function1);
        }
        ad.a(action0, (Action1) function1);
    }

    public void onAdImageClicked(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        m61874a(4, ad);
    }

    public void onAdTitleClicked(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        m61874a(5, ad);
    }

    public void onCallToActionClicked(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        m61874a(7, ad);
    }

    public void onSponsoredClicked(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        m61874a(6, ad);
    }

    /* renamed from: a */
    private final void m61874a(int i, Ad ad) {
        i = this.f51051b.m56002a((Object) C14743a.m56012d().mo12176a(i).mo12177a(), ad).b(Schedulers.io());
        Action0 action0 = (Action0) C18787a.f58298a;
        Function1 function1 = FanStaticAdAnalyticsListener$addAdSelectEvent$2.f59388a;
        if (function1 != null) {
            function1 = new C18790d(function1);
        }
        i.a(action0, (Action1) function1);
    }
}
