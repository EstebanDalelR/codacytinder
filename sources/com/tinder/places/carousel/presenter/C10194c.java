package com.tinder.places.carousel.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Corrected;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Created;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Deleted;
import com.tinder.domain.places.model.Place;
import com.tinder.places.card.view.PlaceCardView;
import com.tinder.places.carousel.target.PlacesCarouselTarget;
import com.tinder.places.p311f.C12337b;
import com.tinder.places.p311f.C12342g;
import com.tinder.places.provider.SelectedPlaceProvider;
import com.tinder.places.provider.SelectedPlaceProvider.C10269a;
import com.tinder.places.provider.SelectedPlaceProvider.SelectedFrom;
import com.tinder.places.viewmodel.C14349b;
import com.tinder.utils.RxUtils;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u0004\u0018\u00010\rJ\b\u0010\u001b\u001a\u00020\u0015H\u0007J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\rJ\b\u0010\u001e\u001a\u00020\u0015H\u0007J\b\u0010\u001f\u001a\u00020\u0015H\u0007R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/tinder/places/carousel/presenter/PlacesCarouselPresenter;", "", "fetchPlaces", "Lcom/tinder/places/usecase/FetchPlaces;", "selectedPlace", "Lcom/tinder/places/provider/SelectedPlaceProvider;", "markPlaceViewed", "Lcom/tinder/places/usecase/MarkPlaceViewed;", "(Lcom/tinder/places/usecase/FetchPlaces;Lcom/tinder/places/provider/SelectedPlaceProvider;Lcom/tinder/places/usecase/MarkPlaceViewed;)V", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "places", "", "", "target", "Lcom/tinder/places/carousel/target/PlacesCarouselTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/carousel/target/PlacesCarouselTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/carousel/target/PlacesCarouselTarget;)V", "disablePager", "", "enablePager", "expandPlaceCard", "placeCard", "Lcom/tinder/places/card/view/PlaceCardView;", "getPlaceSelectedId", "onDrop", "placeSelected", "placeId", "subscribe", "subscribeToMarkPlacesViewed", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.carousel.presenter.c */
public final class C10194c {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesCarouselTarget f33247a;
    /* renamed from: b */
    private final C19573b f33248b = new C19573b();
    /* renamed from: c */
    private final Set<String> f33249c = ((Set) new HashSet());
    /* renamed from: d */
    private final C12337b f33250d;
    /* renamed from: e */
    private final SelectedPlaceProvider f33251e;
    /* renamed from: f */
    private final C12342g f33252f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "it", "Lcom/tinder/places/provider/SelectedPlaceProvider$PlaceSelection;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.c$d */
    static final class C13573d<T, R> implements Func1<C10269a, Completable> {
        /* renamed from: a */
        final /* synthetic */ C10194c f43309a;

        C13573d(C10194c c10194c) {
            this.f43309a = c10194c;
        }

        public /* synthetic */ Object call(Object obj) {
            return m52993a((C10269a) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m52993a(C10269a c10269a) {
            return this.f43309a.f33252f.m48725a(c10269a.m41656b());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.c$a */
    static final class C14196a<T> implements Action1<PlaceUpdate> {
        /* renamed from: a */
        final /* synthetic */ C10194c f44985a;

        C14196a(C10194c c10194c) {
            this.f44985a = c10194c;
        }

        public /* synthetic */ void call(Object obj) {
            m53910a((PlaceUpdate) obj);
        }

        /* renamed from: a */
        public final void m53910a(PlaceUpdate placeUpdate) {
            Place item;
            String valueOf;
            if (placeUpdate instanceof Created) {
                Created created = (Created) placeUpdate;
                item = created.getItem();
                valueOf = String.valueOf(item.getId());
                if (!this.f44985a.f33249c.contains(valueOf)) {
                    this.f44985a.m41495a().add(created.getIndex(), C14349b.f45514a.a(item));
                    this.f44985a.f33249c.add(valueOf);
                }
            } else if (placeUpdate instanceof Corrected) {
                Corrected corrected = (Corrected) placeUpdate;
                item = corrected.getItem();
                valueOf = String.valueOf(item.getId());
                this.f44985a.f33249c.remove(corrected.getOldItemId());
                this.f44985a.f33249c.add(valueOf);
                this.f44985a.m41495a().set(corrected.getIndex(), C14349b.f45514a.a(item));
            } else if (placeUpdate instanceof Deleted) {
                placeUpdate = String.valueOf(((Deleted) placeUpdate).getItem().getId());
                this.f44985a.f33249c.remove(placeUpdate);
                this.f44985a.m41495a().removePlace(placeUpdate);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.c$b */
    static final class C14197b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14197b f44986a = new C14197b();

        C14197b() {
        }

        public /* synthetic */ void call(Object obj) {
            m53911a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53911a(Throwable th) {
            C0001a.c(th, "Fetch Places failed", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/places/provider/SelectedPlaceProvider$PlaceSelection;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.c$c */
    static final class C14198c<T> implements Action1<C10269a> {
        /* renamed from: a */
        final /* synthetic */ C10194c f44987a;

        C14198c(C10194c c10194c) {
            this.f44987a = c10194c;
        }

        public /* synthetic */ void call(Object obj) {
            m53912a((C10269a) obj);
        }

        /* renamed from: a */
        public final void m53912a(C10269a c10269a) {
            if (c10269a.m41655a() != SelectedFrom.CAROUSEL) {
                this.f44987a.m41495a().setSelectedItem(c10269a.m41656b());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/places/provider/SelectedPlaceProvider$PlaceSelection;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.c$e */
    static final class C14199e<T> implements Action1<C10269a> {
        /* renamed from: a */
        public static final C14199e f44988a = new C14199e();

        C14199e() {
        }

        /* renamed from: a */
        public final void m53913a(C10269a c10269a) {
        }

        public /* synthetic */ void call(Object obj) {
            m53913a((C10269a) obj);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.c$f */
    static final class C14200f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14200f f44989a = new C14200f();

        C14200f() {
        }

        public /* synthetic */ void call(Object obj) {
            m53914a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53914a(Throwable th) {
            C0001a.c(th, "Error marking place as viewed", new Object[0]);
        }
    }

    @Inject
    public C10194c(@NotNull C12337b c12337b, @NotNull SelectedPlaceProvider selectedPlaceProvider, @NotNull C12342g c12342g) {
        C2668g.b(c12337b, "fetchPlaces");
        C2668g.b(selectedPlaceProvider, "selectedPlace");
        C2668g.b(c12342g, "markPlaceViewed");
        this.f33250d = c12337b;
        this.f33251e = selectedPlaceProvider;
        this.f33252f = c12342g;
    }

    @NotNull
    /* renamed from: a */
    public final PlacesCarouselTarget m41495a() {
        PlacesCarouselTarget placesCarouselTarget = this.f33247a;
        if (placesCarouselTarget == null) {
            C2668g.b("target");
        }
        return placesCarouselTarget;
    }

    @Take
    /* renamed from: b */
    public final void m41498b() {
        Subscription a = this.f33250d.execute().a(RxUtils.a()).a(new C14196a(this), C14197b.f44986a);
        Observable a2 = this.f33251e.observe().a(RxUtils.a());
        Action1 c14198c = new C14198c(this);
        Function1 function1 = PlacesCarouselPresenter$subscribe$selectedItemSubscription$2.f45328a;
        if (function1 != null) {
            function1 = new C14201d(function1);
        }
        Subscription a3 = a2.a(c14198c, (Action1) function1);
        this.f33248b.a(new Subscription[]{a, a3});
    }

    @Take
    /* renamed from: c */
    public final void m41499c() {
        this.f33248b.a(this.f33251e.observe().b(Schedulers.io()).a(Schedulers.io()).i(new C13573d(this)).a(C14199e.f44988a, C14200f.f44989a));
    }

    @Drop
    /* renamed from: d */
    public final void m41500d() {
        this.f33248b.a();
    }

    /* renamed from: a */
    public final void m41497a(@NotNull String str) {
        C2668g.b(str, "placeId");
        this.f33251e.m48843a(new C10269a(SelectedFrom.CAROUSEL, str));
    }

    /* renamed from: e */
    public final void m41501e() {
        PlacesCarouselTarget placesCarouselTarget = this.f33247a;
        if (placesCarouselTarget == null) {
            C2668g.b("target");
        }
        placesCarouselTarget.pagerScrollEnabled(false);
    }

    /* renamed from: f */
    public final void m41502f() {
        PlacesCarouselTarget placesCarouselTarget = this.f33247a;
        if (placesCarouselTarget == null) {
            C2668g.b("target");
        }
        placesCarouselTarget.pagerScrollEnabled(true);
    }

    /* renamed from: a */
    public final void m41496a(@NotNull PlaceCardView placeCardView) {
        C2668g.b(placeCardView, "placeCard");
        C14349b placeCardViewModel$Tinder_release = placeCardView.getPlaceCardViewModel$Tinder_release();
        if (placeCardViewModel$Tinder_release != null) {
            Integer c = placeCardViewModel$Tinder_release.c();
            if (c != null && c.intValue() > 0) {
                PlacesCarouselTarget placesCarouselTarget = this.f33247a;
                if (placesCarouselTarget == null) {
                    C2668g.b("target");
                }
                placesCarouselTarget.openPlaceRecs(placeCardView);
            }
        }
    }
}
