package com.tinder.places.map.p314a;

import android.location.Location;
import com.tinder.core.p201a.C8588a;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.domain.places.PlacesLoadedStateProvider;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Corrected;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Created;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Deleted;
import com.tinder.domain.places.model.Place;
import com.tinder.domain.places.model.PlacesLoadedState;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.places.analytics.C10115e;
import com.tinder.places.map.target.PlacesMapTarget;
import com.tinder.places.p311f.C12337b;
import com.tinder.places.provider.C12412a;
import com.tinder.places.provider.SelectedPlaceProvider;
import com.tinder.places.provider.SelectedPlaceProvider.C10269a;
import com.tinder.places.provider.SelectedPlaceProvider.SelectedFrom;
import com.tinder.places.viewmodel.C14351c;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020\u0012H\u0002J\b\u0010\u0002\u001a\u00020,H\u0002J\u0006\u00103\u001a\u00020,J\u0006\u00104\u001a\u00020,J\u000e\u00105\u001a\u00020,2\u0006\u00102\u001a\u00020\u0012J\u000e\u00106\u001a\u00020,2\u0006\u00102\u001a\u00020\u0012J\u0010\u00107\u001a\u00020,2\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020,H\u0002J\b\u0010;\u001a\u00020,H\u0002J\u000e\u0010<\u001a\u00020,2\u0006\u0010=\u001a\u00020\u0018J\b\u0010>\u001a\u00020,H\u0002J\u000e\u0010?\u001a\u00020,2\u0006\u00102\u001a\u00020\u0012J\u0006\u0010@\u001a\u00020,J\b\u0010A\u001a\u00020,H\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006B"}, d2 = {"Lcom/tinder/places/map/presenter/PlacesMapPresenter;", "", "fetchPlaces", "Lcom/tinder/places/usecase/FetchPlaces;", "selectedPlace", "Lcom/tinder/places/provider/SelectedPlaceProvider;", "locationProvider", "Lcom/tinder/core/provider/LocationProvider;", "placeCardFlippedProvider", "Lcom/tinder/places/provider/PlaceCardFlippedProvider;", "addPlacesMapInteractionEvent", "Lcom/tinder/places/analytics/AddPlacesMapInteractionEvent;", "placesLoadedStateProvider", "Lcom/tinder/domain/places/PlacesLoadedStateProvider;", "(Lcom/tinder/places/usecase/FetchPlaces;Lcom/tinder/places/provider/SelectedPlaceProvider;Lcom/tinder/core/provider/LocationProvider;Lcom/tinder/places/provider/PlaceCardFlippedProvider;Lcom/tinder/places/analytics/AddPlacesMapInteractionEvent;Lcom/tinder/domain/places/PlacesLoadedStateProvider;)V", "compositeSubscription", "Lio/reactivex/disposables/CompositeDisposable;", "firstPlaceId", "", "hasSetDefaultMapPosition", "", "places", "", "previousCameraZoom", "", "getPreviousCameraZoom", "()Ljava/lang/Double;", "setPreviousCameraZoom", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "selectedPlaceId", "shouldDropPinsDown", "target", "Lcom/tinder/places/map/target/PlacesMapTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/map/target/PlacesMapTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/map/target/PlacesMapTarget;)V", "userMovingCamera", "getUserMovingCamera", "()Z", "setUserMovingCamera", "(Z)V", "addPlace", "", "index", "", "place", "Lcom/tinder/domain/places/model/Place;", "deletePlace", "placeId", "handleMapReady", "handleMapZoomEnded", "handlePlaceAdded", "handlePlaceSelected", "handlePlaceUpdate", "update", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "observeLoadedState", "observeSelectedPlace", "onCameraIdle", "newZoom", "positionMapToLastKnownLocation", "setPlaceActivated", "showActiveCardFrontIfFlipped", "unsubscribe", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.map.a.a */
public final class C10229a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesMapTarget f33332a;
    @Nullable
    /* renamed from: b */
    private Double f33333b;
    /* renamed from: c */
    private boolean f33334c;
    /* renamed from: d */
    private final C17356a f33335d = new C17356a();
    /* renamed from: e */
    private final Set<String> f33336e = ((Set) new HashSet());
    /* renamed from: f */
    private boolean f33337f;
    /* renamed from: g */
    private String f33338g;
    /* renamed from: h */
    private String f33339h;
    /* renamed from: i */
    private boolean f33340i;
    /* renamed from: j */
    private final C12337b f33341j;
    /* renamed from: k */
    private final SelectedPlaceProvider f33342k;
    /* renamed from: l */
    private final C8588a f33343l;
    /* renamed from: m */
    private final C12412a f33344m;
    /* renamed from: n */
    private final C10115e f33345n;
    /* renamed from: o */
    private final PlacesLoadedStateProvider f33346o;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.a.a$a */
    static final class C12377a<T> implements Consumer<PlaceUpdate> {
        /* renamed from: a */
        final /* synthetic */ C10229a f40000a;

        C12377a(C10229a c10229a) {
            this.f40000a = c10229a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48780a((PlaceUpdate) obj);
        }

        /* renamed from: a */
        public final void m48780a(PlaceUpdate placeUpdate) {
            C10229a c10229a = this.f40000a;
            C2668g.a(placeUpdate, "it");
            c10229a.m41598a(placeUpdate);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.a.a$b */
    static final class C12378b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12378b f40001a = new C12378b();

        C12378b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48781a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48781a(Throwable th) {
            C0001a.c(th, "Error fetching places", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "kotlin.jvm.PlatformType", "", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.a.a$c */
    static final class C12379c<T> implements Consumer<List<PlacesLoadedState>> {
        /* renamed from: a */
        final /* synthetic */ C10229a f40002a;

        C12379c(C10229a c10229a) {
            this.f40002a = c10229a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48782a((List) obj);
        }

        /* renamed from: a */
        public final void m48782a(List<PlacesLoadedState> list) {
            PlacesLoadedState placesLoadedState = (PlacesLoadedState) list.get(0);
            PlacesLoadedState placesLoadedState2 = (PlacesLoadedState) list.get(1);
            if (placesLoadedState == PlacesLoadedState.LOADING && placesLoadedState2 == PlacesLoadedState.SUCCESS) {
                this.f40002a.f33340i = true;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.a.a$d */
    static final class C12380d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12380d f40003a = new C12380d();

        C12380d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48783a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48783a(Throwable th) {
            C0001a.c(th, "Error getting loaded state", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/places/provider/SelectedPlaceProvider$PlaceSelection;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.a.a$e */
    static final class C12381e<T> implements Consumer<C10269a> {
        /* renamed from: a */
        final /* synthetic */ C10229a f40004a;

        C12381e(C10229a c10229a) {
            this.f40004a = c10229a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48784a((C10269a) obj);
        }

        /* renamed from: a */
        public final void m48784a(C10269a c10269a) {
            this.f40004a.f33338g = c10269a.m41656b();
            this.f40004a.m41607a().zoomOnPlace(c10269a.m41656b(), true);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.a.a$f */
    static final class C12382f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12382f f40005a = new C12382f();

        C12382f() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48785a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48785a(Throwable th) {
            C0001a.c(th, "Could not observe selected place", new Object[0]);
        }
    }

    @Inject
    public C10229a(@NotNull C12337b c12337b, @NotNull SelectedPlaceProvider selectedPlaceProvider, @NotNull C8588a c8588a, @NotNull C12412a c12412a, @NotNull C10115e c10115e, @NotNull PlacesLoadedStateProvider placesLoadedStateProvider) {
        C2668g.b(c12337b, "fetchPlaces");
        C2668g.b(selectedPlaceProvider, "selectedPlace");
        C2668g.b(c8588a, "locationProvider");
        C2668g.b(c12412a, "placeCardFlippedProvider");
        C2668g.b(c10115e, "addPlacesMapInteractionEvent");
        C2668g.b(placesLoadedStateProvider, "placesLoadedStateProvider");
        this.f33341j = c12337b;
        this.f33342k = selectedPlaceProvider;
        this.f33343l = c8588a;
        this.f33344m = c12412a;
        this.f33345n = c10115e;
        this.f33346o = placesLoadedStateProvider;
    }

    @NotNull
    /* renamed from: a */
    public final PlacesMapTarget m41607a() {
        PlacesMapTarget placesMapTarget = this.f33332a;
        if (placesMapTarget == null) {
            C2668g.b("target");
        }
        return placesMapTarget;
    }

    /* renamed from: a */
    public final void m41609a(@Nullable Double d) {
        this.f33333b = d;
    }

    /* renamed from: a */
    public final void m41611a(boolean z) {
        this.f33334c = z;
    }

    /* renamed from: b */
    public final void m41612b() {
        m41606i();
        m41604g();
        m41603f();
        m41605h();
    }

    @Drop
    /* renamed from: c */
    public final void m41614c() {
        this.f33335d.a();
    }

    /* renamed from: a */
    public final void m41610a(@NotNull String str) {
        C2668g.b(str, "placeId");
        this.f33342k.m48843a(new C10269a(SelectedFrom.MAP, str));
    }

    /* renamed from: a */
    public final void m41608a(double d) {
        if (this.f33334c) {
            boolean z = false;
            this.f33334c = false;
            Double d2 = this.f33333b;
            if (d2 != null) {
                if (d2.doubleValue() < d) {
                    z = true;
                }
                this.f33345n.m41350a(z);
            }
            return;
        }
        this.f33333b = Double.valueOf(d);
    }

    /* renamed from: d */
    public final void m41616d() {
        PlacesMapTarget placesMapTarget = this.f33332a;
        if (placesMapTarget == null) {
            C2668g.b("target");
        }
        placesMapTarget.showPins();
        placesMapTarget = this.f33332a;
        if (placesMapTarget == null) {
            C2668g.b("target");
        }
        placesMapTarget.raisePinAfterDelay();
    }

    /* renamed from: b */
    public final void m41613b(@NotNull String str) {
        C2668g.b(str, "placeId");
        PlacesMapTarget placesMapTarget = this.f33332a;
        if (placesMapTarget == null) {
            C2668g.b("target");
        }
        placesMapTarget.activatePin(str);
        placesMapTarget = this.f33332a;
        if (placesMapTarget == null) {
            C2668g.b("target");
        }
        placesMapTarget.activateRadar(str);
    }

    /* renamed from: e */
    public final void m41617e() {
        this.f33344m.m48847b();
    }

    /* renamed from: c */
    public final void m41615c(@NotNull String str) {
        C2668g.b(str, "placeId");
        if (C2668g.a(str, this.f33338g) || (C2668g.a(str, this.f33339h) && this.f33338g == null)) {
            PlacesMapTarget placesMapTarget = this.f33332a;
            if (placesMapTarget == null) {
                C2668g.b("target");
            }
            placesMapTarget.zoomOnPlace(str, false);
            if (C2668g.a(str, this.f33339h) != null && this.f33340i != null) {
                str = this.f33332a;
                if (str == null) {
                    C2668g.b("target");
                }
                str.animatePinsFromTop();
                this.f33340i = false;
            }
        }
    }

    /* renamed from: f */
    private final void m41603f() {
        this.f33335d.add(RxJavaInteropExtKt.toV2Observable(this.f33346o.observe()).buffer(2).observeOn(C15674a.a()).subscribe(new C12379c(this), C12380d.f40003a));
    }

    /* renamed from: g */
    private final void m41604g() {
        this.f33335d.add(RxJavaInteropExtKt.toV2Observable(this.f33341j.execute()).observeOn(C15674a.a()).subscribe(new C12377a(this), C12378b.f40001a));
    }

    /* renamed from: h */
    private final void m41605h() {
        this.f33335d.add(RxJavaInteropExtKt.toV2Observable(this.f33342k.observe()).observeOn(C15674a.a()).subscribe(new C12381e(this), C12382f.f40005a));
    }

    /* renamed from: i */
    private final void m41606i() {
        if (!this.f33337f) {
            Location a = this.f33343l.m36615a();
            if (a != null) {
                PlacesMapTarget placesMapTarget = this.f33332a;
                if (placesMapTarget == null) {
                    C2668g.b("target");
                }
                C2668g.a(a, "it");
                placesMapTarget.setInitialMapCoords(a.getLatitude(), a.getLongitude());
            }
            this.f33337f = true;
        }
    }

    /* renamed from: a */
    private final void m41598a(PlaceUpdate placeUpdate) {
        if (placeUpdate instanceof Created) {
            Created created = (Created) placeUpdate;
            m41597a(created.getIndex(), created.getItem());
        } else if (placeUpdate instanceof Corrected) {
            Corrected corrected = (Corrected) placeUpdate;
            m41602d(corrected.getOldItemId());
            m41597a(-1, corrected.getItem());
            PlacesMapTarget placesMapTarget = this.f33332a;
            if (placesMapTarget == null) {
                C2668g.b("target");
            }
            placesMapTarget.zoomOnPlace(String.valueOf(corrected.getItem().getId()), true);
        } else if (placeUpdate instanceof Deleted) {
            m41602d(String.valueOf(((Deleted) placeUpdate).getItem().getId()));
        }
    }

    /* renamed from: a */
    private final void m41597a(int i, Place place) {
        String valueOf = String.valueOf(place.getId());
        if (this.f33336e.isEmpty()) {
            PlacesMapTarget placesMapTarget = this.f33332a;
            if (placesMapTarget == null) {
                C2668g.b("target");
            }
            placesMapTarget.enableMapInteraction();
        }
        if (!this.f33336e.contains(valueOf)) {
            if (i == 0) {
                i = this.f33332a;
                if (i == 0) {
                    C2668g.b("target");
                }
                i.hidePins();
                this.f33339h = valueOf;
            }
            i = this.f33332a;
            if (i == 0) {
                C2668g.b("target");
            }
            i.addPin(C14351c.f45525a.a(place));
            this.f33336e.add(valueOf);
        }
    }

    /* renamed from: d */
    private final void m41602d(String str) {
        PlacesMapTarget placesMapTarget = this.f33332a;
        if (placesMapTarget == null) {
            C2668g.b("target");
        }
        placesMapTarget.removePin(str);
        this.f33336e.remove(str);
    }
}
