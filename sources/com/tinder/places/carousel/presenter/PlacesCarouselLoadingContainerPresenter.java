package com.tinder.places.carousel.presenter;

import com.tinder.data.places.p330b.C10894b;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import com.tinder.domain.places.PlacesLoadedStateProvider;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Deleted;
import com.tinder.domain.places.model.PlacesLoadedState;
import com.tinder.places.carousel.target.PlacesCarouselLoadingContainerTarget;
import com.tinder.places.p311f.C12337b;
import com.tinder.utils.RxUtils;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.C2671a;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\u0002 !B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0007J\b\u0010\u001d\u001a\u00020\u0017H\u0007J\b\u0010\u001e\u001a\u00020\u0017H\u0007J\b\u0010\u001f\u001a\u00020\u0017H\u0007R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/tinder/places/carousel/presenter/PlacesCarouselLoadingContainerPresenter;", "", "scheduler", "Lrx/Scheduler;", "loadedStateProvider", "Lcom/tinder/domain/places/PlacesLoadedStateProvider;", "countPlacesInCache", "Lcom/tinder/data/places/usecase/CountPlacesInCache;", "fetchPlaces", "Lcom/tinder/places/usecase/FetchPlaces;", "(Lrx/Scheduler;Lcom/tinder/domain/places/PlacesLoadedStateProvider;Lcom/tinder/data/places/usecase/CountPlacesInCache;Lcom/tinder/places/usecase/FetchPlaces;)V", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "target", "Lcom/tinder/places/carousel/target/PlacesCarouselLoadingContainerTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/carousel/target/PlacesCarouselLoadingContainerTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/carousel/target/PlacesCarouselLoadingContainerTarget;)V", "targetViewStateSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/places/carousel/presenter/PlacesCarouselLoadingContainerPresenter$TargetViewState;", "placeDeleted", "", "placesLoaded", "showEmptyState", "showLoadingState", "showPlaces", "subscribeToLoadingState", "subscribeToPlacesUpdates", "subscribeToTargetViewState", "unsubscribe", "Companion", "TargetViewState", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesCarouselLoadingContainerPresenter {
    /* renamed from: b */
    public static final C10191a f33237b = new C10191a();
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesCarouselLoadingContainerTarget f33238a;
    /* renamed from: c */
    private final C19573b f33239c = new C19573b();
    /* renamed from: d */
    private final PublishSubject<TargetViewState> f33240d;
    /* renamed from: e */
    private final C2671a f33241e;
    /* renamed from: f */
    private final PlacesLoadedStateProvider f33242f;
    /* renamed from: g */
    private final C10894b f33243g;
    /* renamed from: h */
    private final C12337b f33244h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/places/carousel/presenter/PlacesCarouselLoadingContainerPresenter$TargetViewState;", "", "(Ljava/lang/String;I)V", "EMPTY", "LOADING", "PLACES", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private enum TargetViewState {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/carousel/presenter/PlacesCarouselLoadingContainerPresenter$Companion;", "", "()V", "STATE_CHANGE_DEBOUNCE_MS", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$a */
    public static final class C10191a {
        private C10191a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$f */
    static final class C13571f<T, R> implements Func1<PlacesLoadedState, Boolean> {
        /* renamed from: a */
        public static final C13571f f43307a = new C13571f();

        C13571f() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m52991a((PlacesLoadedState) obj));
        }

        /* renamed from: a */
        public final boolean m52991a(PlacesLoadedState placesLoadedState) {
            return placesLoadedState != PlacesLoadedState.COLD ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$i */
    static final class C13572i<T, R> implements Func1<PlaceUpdate, Boolean> {
        /* renamed from: a */
        public static final C13572i f43308a = new C13572i();

        C13572i() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m52992a((PlaceUpdate) obj));
        }

        /* renamed from: a */
        public final boolean m52992a(PlaceUpdate placeUpdate) {
            return placeUpdate instanceof Deleted;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$b */
    static final class C14185b<T> implements Action1<Integer> {
        /* renamed from: a */
        final /* synthetic */ PlacesCarouselLoadingContainerPresenter f44974a;

        C14185b(PlacesCarouselLoadingContainerPresenter placesCarouselLoadingContainerPresenter) {
            this.f44974a = placesCarouselLoadingContainerPresenter;
        }

        public /* synthetic */ void call(Object obj) {
            m53899a((Integer) obj);
        }

        /* renamed from: a */
        public final void m53899a(Integer num) {
            if (num != null) {
                if (num.intValue() == null) {
                    this.f44974a.m41484i();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$c */
    static final class C14186c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14186c f44975a = new C14186c();

        C14186c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53900a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53900a(Throwable th) {
            C0001a.c(th, "Error asking how many places exist", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$d */
    static final class C14187d<T> implements Action1<Integer> {
        /* renamed from: a */
        final /* synthetic */ PlacesCarouselLoadingContainerPresenter f44976a;

        C14187d(PlacesCarouselLoadingContainerPresenter placesCarouselLoadingContainerPresenter) {
            this.f44976a = placesCarouselLoadingContainerPresenter;
        }

        public /* synthetic */ void call(Object obj) {
            m53901a((Integer) obj);
        }

        /* renamed from: a */
        public final void m53901a(Integer num) {
            if (C2668g.a(num.intValue(), 0) > null) {
                this.f44976a.m41485j();
            } else {
                this.f44976a.m41484i();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$e */
    static final class C14188e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14188e f44977a = new C14188e();

        C14188e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53902a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53902a(Throwable th) {
            C0001a.c(th, "Error asking how many places exist", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$g */
    static final class C14189g<T> implements Action1<PlacesLoadedState> {
        /* renamed from: a */
        final /* synthetic */ PlacesCarouselLoadingContainerPresenter f44978a;

        C14189g(PlacesCarouselLoadingContainerPresenter placesCarouselLoadingContainerPresenter) {
            this.f44978a = placesCarouselLoadingContainerPresenter;
        }

        public /* synthetic */ void call(Object obj) {
            m53903a((PlacesLoadedState) obj);
        }

        /* renamed from: a */
        public final void m53903a(PlacesLoadedState placesLoadedState) {
            if (placesLoadedState != null) {
                switch (placesLoadedState) {
                    case LOADING:
                        this.f44978a.m41483h();
                        return;
                    case SUCCESS:
                        this.f44978a.m41482g();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$h */
    static final class C14190h<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14190h f44979a = new C14190h();

        C14190h() {
        }

        public /* synthetic */ void call(Object obj) {
            m53904a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53904a(Throwable th) {
            C0001a.c(th, "Error watching places loaded state", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$j */
    static final class C14191j<T> implements Action1<PlaceUpdate> {
        /* renamed from: a */
        final /* synthetic */ PlacesCarouselLoadingContainerPresenter f44980a;

        C14191j(PlacesCarouselLoadingContainerPresenter placesCarouselLoadingContainerPresenter) {
            this.f44980a = placesCarouselLoadingContainerPresenter;
        }

        public /* synthetic */ void call(Object obj) {
            m53905a((PlaceUpdate) obj);
        }

        /* renamed from: a */
        public final void m53905a(PlaceUpdate placeUpdate) {
            this.f44980a.m41481f();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$k */
    static final class C14192k<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14192k f44981a = new C14192k();

        C14192k() {
        }

        public /* synthetic */ void call(Object obj) {
            m53906a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53906a(Throwable th) {
            C0001a.c(th, "Error fetching places", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/places/carousel/presenter/PlacesCarouselLoadingContainerPresenter$TargetViewState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$l */
    static final class C14193l<T> implements Action1<TargetViewState> {
        /* renamed from: a */
        final /* synthetic */ PlacesCarouselLoadingContainerPresenter f44982a;

        C14193l(PlacesCarouselLoadingContainerPresenter placesCarouselLoadingContainerPresenter) {
            this.f44982a = placesCarouselLoadingContainerPresenter;
        }

        public /* synthetic */ void call(Object obj) {
            m53907a((TargetViewState) obj);
        }

        /* renamed from: a */
        public final void m53907a(TargetViewState targetViewState) {
            if (targetViewState == TargetViewState.LOADING) {
                this.f44982a.m41486a().showLoadingState();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/places/carousel/presenter/PlacesCarouselLoadingContainerPresenter$TargetViewState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$m */
    static final class C14194m<T> implements Action1<TargetViewState> {
        /* renamed from: a */
        final /* synthetic */ PlacesCarouselLoadingContainerPresenter f44983a;

        C14194m(PlacesCarouselLoadingContainerPresenter placesCarouselLoadingContainerPresenter) {
            this.f44983a = placesCarouselLoadingContainerPresenter;
        }

        public /* synthetic */ void call(Object obj) {
            m53908a((TargetViewState) obj);
        }

        /* renamed from: a */
        public final void m53908a(TargetViewState targetViewState) {
            if (targetViewState != null) {
                switch (targetViewState) {
                    case PLACES:
                        this.f44983a.m41486a().showPlaces();
                        return;
                    case EMPTY:
                        this.f44983a.m41486a().showEmptyState();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter$n */
    static final class C14195n<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14195n f44984a = new C14195n();

        C14195n() {
        }

        public /* synthetic */ void call(Object obj) {
            m53909a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53909a(Throwable th) {
            C0001a.c(th, "Error changing view state on Places", new Object[0]);
        }
    }

    @Inject
    public PlacesCarouselLoadingContainerPresenter(@NotNull @ComputationScheduler C2671a c2671a, @NotNull PlacesLoadedStateProvider placesLoadedStateProvider, @NotNull C10894b c10894b, @NotNull C12337b c12337b) {
        C2668g.b(c2671a, "scheduler");
        C2668g.b(placesLoadedStateProvider, "loadedStateProvider");
        C2668g.b(c10894b, "countPlacesInCache");
        C2668g.b(c12337b, "fetchPlaces");
        this.f33241e = c2671a;
        this.f33242f = placesLoadedStateProvider;
        this.f33243g = c10894b;
        this.f33244h = c12337b;
        c2671a = PublishSubject.w();
        C2668g.a(c2671a, "PublishSubject.create()");
        this.f33240d = c2671a;
    }

    @NotNull
    /* renamed from: a */
    public final PlacesCarouselLoadingContainerTarget m41486a() {
        PlacesCarouselLoadingContainerTarget placesCarouselLoadingContainerTarget = this.f33238a;
        if (placesCarouselLoadingContainerTarget == null) {
            C2668g.b("target");
        }
        return placesCarouselLoadingContainerTarget;
    }

    @Take
    /* renamed from: b */
    public final void m41487b() {
        this.f33239c.a(this.f33240d.g().a(C19397a.a()).b(new C14193l(this)).c(250, TimeUnit.MILLISECONDS, this.f33241e).g().a(C19397a.a()).a(new C14194m(this), C14195n.f44984a));
    }

    @Take
    /* renamed from: c */
    public final void m41488c() {
        this.f33239c.a(this.f33242f.observe().a(C19397a.a()).f(C13571f.f43307a).a(new C14189g(this), C14190h.f44979a));
    }

    @Take
    /* renamed from: d */
    public final void m41489d() {
        this.f33239c.a(this.f33244h.execute().a(RxUtils.a()).f(C13572i.f43308a).a(new C14191j(this), C14192k.f44981a));
    }

    @Drop
    /* renamed from: e */
    public final void m41490e() {
        this.f33239c.a();
    }

    /* renamed from: f */
    private final void m41481f() {
        this.f33243g.execute().a(new C14185b(this), C14186c.f44975a);
    }

    /* renamed from: g */
    private final void m41482g() {
        this.f33243g.execute().a(new C14187d(this), C14188e.f44977a);
    }

    /* renamed from: h */
    private final void m41483h() {
        this.f33240d.onNext(TargetViewState.LOADING);
    }

    /* renamed from: i */
    private final void m41484i() {
        this.f33240d.onNext(TargetViewState.EMPTY);
    }

    /* renamed from: j */
    private final void m41485j() {
        this.f33240d.onNext(TargetViewState.PLACES);
    }
}
