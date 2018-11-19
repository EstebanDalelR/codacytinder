package com.tinder.places.settings.presenter;

import android.annotation.SuppressLint;
import com.mapbox.mapboxsdk.maps.MapboxTelemetryProvider;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.data.places.p330b.C10896d;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import com.tinder.domain.places.PlacesLoadedStateProvider;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Created;
import com.tinder.domain.places.PlacesRepository.PlaceUpdate.Deleted;
import com.tinder.domain.places.model.PlacesLoadedState;
import com.tinder.domain.places.usecase.ClearAllPlaces;
import com.tinder.domain.profile.model.ProfileOption.Discovery;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent.Source;
import com.tinder.places.analytics.AddPlacesRemoveRecentPlaceEvent;
import com.tinder.places.p311f.C12336a;
import com.tinder.places.p311f.C12337b;
import com.tinder.places.provider.PlacesEnabledProvider;
import com.tinder.places.settings.target.PlacesSettingsTarget;
import com.tinder.places.viewmodel.C14353d;
import com.tinder.settings.feed.analytics.AddSettingsOptionUseCase;
import com.tinder.settings.feed.analytics.AddSettingsOptionUseCase.C14872a;
import com.tinder.settings.feed.analytics.AddSettingsOptionUseCase.Type;
import com.tinder.utils.RxUtils;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p500e.C19573b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\b\u00104\u001a\u000205H\u0007J\u0006\u00106\u001a\u000205J\u0014\u0010\b\u001a\u0002052\f\u00107\u001a\b\u0012\u0004\u0012\u00020)08J\u0006\u00109\u001a\u000205J\b\u0010:\u001a\u000205H\u0002J\b\u0010;\u001a\u000205H\u0007J\b\u0010<\u001a\u000205H\u0007J\u0006\u0010=\u001a\u000205J\u0006\u0010>\u001a\u000205J\b\u0010?\u001a\u000205H\u0007J\u0006\u0010@\u001a\u000205J\u0006\u0010A\u001a\u000205J\u0006\u0010B\u001a\u000205J\u0006\u0010C\u001a\u000205J\u000e\u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020)J\u000e\u0010F\u001a\u0002052\u0006\u0010G\u001a\u00020\u001aJ\b\u0010H\u001a\u000205H\u0007J\b\u0010I\u001a\u000205H\u0007J\u0006\u0010J\u001a\u000205J\u0006\u0010K\u001a\u000205J\u0006\u0010L\u001a\u000205J\b\u0010M\u001a\u000205H\u0007J\b\u0010N\u001a\u000205H\u0007J\u000e\u0010O\u001a\u0002052\u0006\u0010P\u001a\u00020QR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020)X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020/8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006R"}, d2 = {"Lcom/tinder/places/settings/presenter/PlacesSettingsPresenter;", "", "placesLoadedStateProvider", "Lcom/tinder/domain/places/PlacesLoadedStateProvider;", "fetchRecentPlacesFromApi", "Lcom/tinder/data/places/usecase/FetchRecentPlacesFromApi;", "fetchPlaces", "Lcom/tinder/places/usecase/FetchPlaces;", "deletePlaces", "Lcom/tinder/places/usecase/DeletePlaces;", "clearAllPlaces", "Lcom/tinder/domain/places/usecase/ClearAllPlaces;", "placesEnabledProvider", "Lcom/tinder/places/provider/PlacesEnabledProvider;", "addPlacesManageEnabledEvent", "Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent;", "addPlacesRemoveRecentPlaceEvent", "Lcom/tinder/places/analytics/AddPlacesRemoveRecentPlaceEvent;", "addSettingsOptionUseCase", "Lcom/tinder/settings/feed/analytics/AddSettingsOptionUseCase;", "mapboxTelemetryProvider", "Lcom/mapbox/mapboxsdk/maps/MapboxTelemetryProvider;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "(Lcom/tinder/domain/places/PlacesLoadedStateProvider;Lcom/tinder/data/places/usecase/FetchRecentPlacesFromApi;Lcom/tinder/places/usecase/FetchPlaces;Lcom/tinder/places/usecase/DeletePlaces;Lcom/tinder/domain/places/usecase/ClearAllPlaces;Lcom/tinder/places/provider/PlacesEnabledProvider;Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent;Lcom/tinder/places/analytics/AddPlacesRemoveRecentPlaceEvent;Lcom/tinder/settings/feed/analytics/AddSettingsOptionUseCase;Lcom/mapbox/mapboxsdk/maps/MapboxTelemetryProvider;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;)V", "analyticsWereFired", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "editMode", "editMode$annotations", "()V", "getEditMode", "()Z", "setEditMode", "(Z)V", "profileSubscription", "Lio/reactivex/disposables/Disposable;", "source", "", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "target", "Lcom/tinder/places/settings/target/PlacesSettingsTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/settings/target/PlacesSettingsTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/settings/target/PlacesSettingsTarget;)V", "bindGender", "", "deleteButtonPressed", "selectedIDs", "", "editButtonPressed", "enterEditPlaces", "exitEditPlaces", "fireSettingsOptionAnalyticsEventOnce", "foursquareLogoPressed", "improveMapBoxButtonPressed", "kickstartLoadingIfNeeded", "mapBoxButtonPressed", "mapBoxLogoPressed", "mapboxTelemetryButtonPressed", "openStreetMapButtonPressed", "placeTapped", "id", "setPlacesEnabled", "enable", "subscribeToConfig", "subscribeToPlaces", "telemetryOptInPressed", "telemetryOptOutPressed", "telemetryTellMeMorePressed", "togglePlacesEnabled", "unsubscribe", "updatePlaceCount", "count", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.settings.presenter.c */
public final class C14318c {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesSettingsTarget f45470a;
    @NotNull
    /* renamed from: b */
    public String f45471b;
    /* renamed from: c */
    private final C19573b f45472c = new C19573b();
    /* renamed from: d */
    private final C17356a f45473d = new C17356a();
    /* renamed from: e */
    private Disposable f45474e;
    /* renamed from: f */
    private boolean f45475f;
    /* renamed from: g */
    private boolean f45476g;
    /* renamed from: h */
    private final PlacesLoadedStateProvider f45477h;
    /* renamed from: i */
    private final C10896d f45478i;
    /* renamed from: j */
    private final C12337b f45479j;
    /* renamed from: k */
    private final C12336a f45480k;
    /* renamed from: l */
    private final ClearAllPlaces f45481l;
    /* renamed from: m */
    private final PlacesEnabledProvider f45482m;
    /* renamed from: n */
    private final AddPlacesManageEnabledEvent f45483n;
    /* renamed from: o */
    private final AddPlacesRemoveRecentPlaceEvent f45484o;
    /* renamed from: p */
    private final AddSettingsOptionUseCase f45485p;
    /* renamed from: q */
    private final MapboxTelemetryProvider f45486q;
    /* renamed from: r */
    private final LoadProfileOptionData f45487r;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/meta/model/DiscoverySettings$GenderFilter;", "discoverySettings", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$a */
    static final class C16007a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16007a f49772a = new C16007a();

        C16007a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m60772a((DiscoverySettings) obj);
        }

        @NotNull
        /* renamed from: a */
        public final GenderFilter m60772a(@NotNull DiscoverySettings discoverySettings) {
            C2668g.b(discoverySettings, "discoverySettings");
            return discoverySettings.genderFilter();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/meta/model/DiscoverySettings$GenderFilter;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$b */
    static final class C16008b<T> implements Consumer<GenderFilter> {
        /* renamed from: a */
        final /* synthetic */ C14318c f49773a;

        C16008b(C14318c c14318c) {
            this.f49773a = c14318c;
        }

        public /* synthetic */ void accept(Object obj) {
            m60773a((GenderFilter) obj);
        }

        /* renamed from: a */
        public final void m60773a(GenderFilter genderFilter) {
            if (genderFilter != null) {
                switch (C14319d.f45488a[genderFilter.ordinal()]) {
                    case 1:
                        this.f49773a.m54612a().setMaleGenderPreference();
                        return;
                    case 2:
                        this.f49773a.m54612a().setFemaleGenderPreference();
                        return;
                    case 3:
                        this.f49773a.m54612a().setNeutralGenderPreference();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$c */
    static final class C16009c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C14318c f49774a;

        C16009c(C14318c c14318c) {
            this.f49774a = c14318c;
        }

        public /* synthetic */ void accept(Object obj) {
            m60774a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m60774a(Throwable th) {
            C0001a.c(th, "Error getting discovery settings for user", new Object[0]);
            this.f49774a.m54612a().setNeutralGenderPreference();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "", "loadedState", "observePlacesEnabled", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$f */
    static final class C16010f<T1, T2, R> implements BiFunction<PlacesLoadedState, Boolean, Pair<? extends PlacesLoadedState, ? extends Boolean>> {
        /* renamed from: a */
        public static final C16010f f49775a = new C16010f();

        C16010f() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m60775a((PlacesLoadedState) obj, ((Boolean) obj2).booleanValue());
        }

        @NotNull
        /* renamed from: a */
        public final Pair<PlacesLoadedState, Boolean> m60775a(@NotNull PlacesLoadedState placesLoadedState, boolean z) {
            C2668g.b(placesLoadedState, "loadedState");
            return new Pair(placesLoadedState, Boolean.valueOf(z));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$g */
    static final class C16011g<T> implements Predicate<Pair<? extends PlacesLoadedState, ? extends Boolean>> {
        /* renamed from: a */
        public static final C16011g f49776a = new C16011g();

        C16011g() {
        }

        /* renamed from: a */
        public final boolean m60776a(@NotNull Pair<? extends PlacesLoadedState, Boolean> pair) {
            C2668g.b(pair, "<name for destructuring parameter 0>");
            return ((Boolean) pair.m59806d()).booleanValue();
        }

        public /* synthetic */ boolean test(Object obj) {
            return m60776a((Pair) obj);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "it", "Lkotlin/Pair;", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$h */
    static final class C16012h<T, R> implements Function<Pair<? extends PlacesLoadedState, ? extends Boolean>, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C14318c f49777a;

        C16012h(C14318c c14318c) {
            this.f49777a = c14318c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m60777a((Pair) obj);
        }

        /* renamed from: a */
        public final C3956a m60777a(@NotNull Pair<? extends PlacesLoadedState, Boolean> pair) {
            C2668g.b(pair, "it");
            return RxJavaInteropExtKt.toV2Completable(this.f49777a.f45478i.execute()).b(C15756a.m59010b());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$i */
    static final class C16013i implements Action {
        /* renamed from: a */
        public static final C16013i f49778a = new C16013i();

        C16013i() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$j */
    static final class C16014j<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16014j f49779a = new C16014j();

        C16014j() {
        }

        public /* synthetic */ void accept(Object obj) {
            m60778a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m60778a(Throwable th) {
            C0001a.c(th, "Error fetching places from API for settings", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$k */
    static final class C16015k<T> implements Predicate<PlacesLoadedState> {
        /* renamed from: a */
        public static final C16015k f49780a = new C16015k();

        C16015k() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m60779a((PlacesLoadedState) obj);
        }

        /* renamed from: a */
        public final boolean m60779a(@NotNull PlacesLoadedState placesLoadedState) {
            C2668g.b(placesLoadedState, "it");
            return placesLoadedState == PlacesLoadedState.COLD ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$l */
    static final class C16016l implements Action {
        /* renamed from: a */
        final /* synthetic */ C14318c f49781a;
        /* renamed from: b */
        final /* synthetic */ boolean f49782b;

        C16016l(C14318c c14318c, boolean z) {
            this.f49781a = c14318c;
            this.f49782b = z;
        }

        public final void run() {
            this.f49781a.m54612a().setEditButtonVisibility(this.f49782b);
            this.f49781a.f45483n.a(this.f49782b, Source.SETTINGS);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$m */
    static final class C16017m<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C14318c f49783a;
        /* renamed from: b */
        final /* synthetic */ boolean f49784b;

        C16017m(C14318c c14318c, boolean z) {
            this.f49783a = c14318c;
            this.f49784b = z;
        }

        public /* synthetic */ void accept(Object obj) {
            m60780a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m60780a(Throwable th) {
            PlacesApiException placesApiException = (PlacesApiException) (!(th instanceof PlacesApiException) ? null : th);
            if (placesApiException != null) {
                this.f49783a.m54612a().showErrorDialog(placesApiException);
                Integer a = placesApiException.a();
                if (a != null) {
                    this.f49783a.f45483n.a(Integer.valueOf(a.intValue()), Source.SETTINGS);
                }
            }
            this.f49783a.m54612a().setFeatureSwitchChecked(this.f49784b ^ 1);
            this.f49783a.m54612a().setEditButtonVisibility(this.f49784b ^ 1);
            C0001a.c(th, "Failed to set Places enabled / disabled", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$n */
    static final class C16018n<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C14318c f49785a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.places.settings.presenter.c$n$1 */
        static final class C185741<T> implements Action1<PlaceUpdate> {
            /* renamed from: a */
            public static final C185741 f57831a = new C185741();

            C185741() {
            }

            /* renamed from: a */
            public final void m67030a(PlaceUpdate placeUpdate) {
            }

            public /* synthetic */ void call(Object obj) {
                m67030a((PlaceUpdate) obj);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.places.settings.presenter.c$n$2 */
        static final class C185752 implements Action0 {
            /* renamed from: a */
            public static final C185752 f57832a = new C185752();

            C185752() {
            }

            public final void call() {
            }
        }

        C16018n(C14318c c14318c) {
            this.f49785a = c14318c;
        }

        public /* synthetic */ void accept(Object obj) {
            m60781a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m60781a(Boolean bool) {
            PlacesSettingsTarget a = this.f49785a.m54612a();
            C2668g.a(bool, "enabled");
            a.setFeatureSwitchChecked(bool.booleanValue());
            this.f49785a.m54612a().setPlacesListExpanded(bool.booleanValue());
            this.f49785a.m54612a().setEditButtonVisibility(bool.booleanValue());
            Function1 function1;
            if (bool.booleanValue() != null) {
                this.f49785a.m54612a().showEnabledUI();
                bool = this.f49785a.f45479j.execute();
                Action1 action1 = C185741.f57831a;
                function1 = PlacesSettingsPresenter$subscribeToConfig$1$2.f59363a;
                if (function1 != null) {
                    function1 = new C18578f(function1);
                }
                bool.a(action1, (Action1) function1);
                return;
            }
            this.f49785a.m54612a().showDisabledUI();
            bool = this.f49785a.f45481l.execute();
            Action0 action0 = C185752.f57832a;
            function1 = PlacesSettingsPresenter$subscribeToConfig$1$4.f59364a;
            if (function1 != null) {
                function1 = new C18578f(function1);
            }
            bool.a(action0, (Action1) function1);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$q */
    static final class C16019q<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C14318c f49786a;

        C16019q(C14318c c14318c) {
            this.f49786a = c14318c;
        }

        public /* synthetic */ void accept(Object obj) {
            m60782a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m60782a(Boolean bool) {
            if (bool.booleanValue() == null) {
                this.f49786a.m54616a(true);
            } else {
                this.f49786a.m54612a().showDisableConfirmationDialog();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$r */
    static final class C16020r<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16020r f49787a = new C16020r();

        C16020r() {
        }

        public /* synthetic */ void accept(Object obj) {
            m60783a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m60783a(Throwable th) {
            C0001a.c(th, "Error observing places enabled in Settings", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$d */
    static final class C18572d implements Action0 {
        /* renamed from: a */
        public static final C18572d f57829a = new C18572d();

        C18572d() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$e */
    static final class C18573e<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C14318c f57830a;

        C18573e(C14318c c14318c) {
            this.f57830a = c14318c;
        }

        public /* synthetic */ void call(Object obj) {
            m67029a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67029a(Throwable th) {
            C0001a.c(th, "deletePlaces failed", new Object[0]);
            PlacesApiException placesApiException = (PlacesApiException) (!(th instanceof PlacesApiException) ? null : th);
            if (placesApiException != null) {
                Integer a = placesApiException.a();
                if (a != null) {
                    int intValue = a.intValue();
                    AddPlacesRemoveRecentPlaceEvent e = this.f57830a.f45484o;
                    th = ((PlacesApiException) th).c();
                    if (th == null) {
                        th = "unknown";
                    }
                    e.c(th, intValue);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/PlacesRepository$PlaceUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$o */
    static final class C18576o<T> implements Action1<PlaceUpdate> {
        /* renamed from: a */
        final /* synthetic */ C14318c f57833a;

        C18576o(C14318c c14318c) {
            this.f57833a = c14318c;
        }

        public /* synthetic */ void call(Object obj) {
            m67031a((PlaceUpdate) obj);
        }

        /* renamed from: a */
        public final void m67031a(PlaceUpdate placeUpdate) {
            if (placeUpdate instanceof Created) {
                this.f57833a.m54612a().add(C14353d.f45532a.m54671a(((Created) placeUpdate).getItem()));
            } else if (placeUpdate instanceof Deleted) {
                this.f57833a.m54612a().remove(String.valueOf(((Deleted) placeUpdate).getItem().getId()));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.presenter.c$p */
    static final class C18577p<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18577p f57834a = new C18577p();

        C18577p() {
        }

        public /* synthetic */ void call(Object obj) {
            m67032a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67032a(Throwable th) {
            C0001a.c(th, "Error getting places for Places settings", new Object[0]);
        }
    }

    @Inject
    public C14318c(@NotNull PlacesLoadedStateProvider placesLoadedStateProvider, @NotNull C10896d c10896d, @NotNull C12337b c12337b, @NotNull C12336a c12336a, @NotNull ClearAllPlaces clearAllPlaces, @NotNull PlacesEnabledProvider placesEnabledProvider, @NotNull AddPlacesManageEnabledEvent addPlacesManageEnabledEvent, @NotNull AddPlacesRemoveRecentPlaceEvent addPlacesRemoveRecentPlaceEvent, @NotNull AddSettingsOptionUseCase addSettingsOptionUseCase, @NotNull MapboxTelemetryProvider mapboxTelemetryProvider, @NotNull LoadProfileOptionData loadProfileOptionData) {
        C2668g.b(placesLoadedStateProvider, "placesLoadedStateProvider");
        C2668g.b(c10896d, "fetchRecentPlacesFromApi");
        C2668g.b(c12337b, "fetchPlaces");
        C2668g.b(c12336a, "deletePlaces");
        C2668g.b(clearAllPlaces, "clearAllPlaces");
        C2668g.b(placesEnabledProvider, "placesEnabledProvider");
        C2668g.b(addPlacesManageEnabledEvent, "addPlacesManageEnabledEvent");
        C2668g.b(addPlacesRemoveRecentPlaceEvent, "addPlacesRemoveRecentPlaceEvent");
        C2668g.b(addSettingsOptionUseCase, "addSettingsOptionUseCase");
        C2668g.b(mapboxTelemetryProvider, "mapboxTelemetryProvider");
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        this.f45477h = placesLoadedStateProvider;
        this.f45478i = c10896d;
        this.f45479j = c12337b;
        this.f45480k = c12336a;
        this.f45481l = clearAllPlaces;
        this.f45482m = placesEnabledProvider;
        this.f45483n = addPlacesManageEnabledEvent;
        this.f45484o = addPlacesRemoveRecentPlaceEvent;
        this.f45485p = addSettingsOptionUseCase;
        this.f45486q = mapboxTelemetryProvider;
        this.f45487r = loadProfileOptionData;
    }

    @NotNull
    /* renamed from: a */
    public final PlacesSettingsTarget m54612a() {
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        return placesSettingsTarget;
    }

    /* renamed from: a */
    public final void m54614a(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.f45471b = str;
    }

    @Take
    /* renamed from: b */
    public final void m54617b() {
        this.f45473d.add(C3959e.combineLatest(RxJavaInteropExtKt.toV2Observable(this.f45477h.observe()).filter(C16015k.f49780a), this.f45482m.observePlacesEnabled(), C16010f.f49775a).filter(C16011g.f49776a).flatMapCompletable(new C16012h(this)).b(C15756a.m59010b()).a(C16013i.f49778a, C16014j.f49779a));
    }

    @Take
    /* renamed from: c */
    public final void m54619c() {
        this.f45472c.a(this.f45479j.execute().a(RxUtils.a()).a(new C18576o(this), C18577p.f57834a));
    }

    @Take
    /* renamed from: d */
    public final void m54620d() {
        C17356a c17356a = this.f45473d;
        C3959e observeOn = this.f45482m.observePlacesEnabled().subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a());
        Consumer c16018n = new C16018n(this);
        Function1 function1 = PlacesSettingsPresenter$subscribeToConfig$2.f59365a;
        if (function1 != null) {
            function1 = new C16021e(function1);
        }
        c17356a.add(observeOn.subscribe(c16018n, (Consumer) function1));
    }

    @Take
    /* renamed from: e */
    public final void m54621e() {
        if (!this.f45475f) {
            AddSettingsOptionUseCase addSettingsOptionUseCase = this.f45485p;
            Type type = Type.MANAGE_PLACES;
            String str = this.f45471b;
            if (str == null) {
                C2668g.b("source");
            }
            addSettingsOptionUseCase.m62086a(new C14872a(type, str));
            this.f45475f = true;
        }
    }

    @Take
    /* renamed from: f */
    public final void m54622f() {
        Disposable disposable = this.f45474e;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f45474e = this.f45487r.execute(Discovery.INSTANCE).map(C16007a.f49772a).observeOn(C15674a.m58830a()).subscribe(new C16008b(this), new C16009c(this));
    }

    @Drop
    /* renamed from: g */
    public final void m54623g() {
        this.f45472c.a();
        this.f45473d.m63446a();
        Disposable disposable = this.f45474e;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: a */
    public final void m54616a(boolean z) {
        this.f45482m.setPlacesEnabled(z).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C16016l(this, z), new C16017m(this, z));
    }

    /* renamed from: a */
    public final void m54615a(@NotNull List<String> list) {
        C2668g.b(list, "selectedIDs");
        this.f45480k.a(list).a(RxUtils.a().m67520b()).a(C18572d.f57829a, new C18573e(this));
        this.f45476g = null;
        m54626j();
    }

    /* renamed from: h */
    public final void m54624h() {
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.showDeletePlacesDialog(new PlacesSettingsPresenter$deleteButtonPressed$1(this));
    }

    /* renamed from: i */
    public final void m54625i() {
        if (this.f45476g) {
            m54626j();
        } else {
            m54611u();
        }
        this.f45476g ^= 1;
    }

    /* renamed from: u */
    private final void m54611u() {
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.enterEditPlacesUi();
        placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.setPlacesListEditable(true);
        placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.setDeleteButtonVisibility(true);
        placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.setFeatureToggleEnabled(false);
    }

    /* renamed from: a */
    public final void m54613a(int i) {
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.setDeleteButtonEnabled(i > 0 ? 1 : 0);
    }

    @Take
    /* renamed from: j */
    public final void m54626j() {
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.exitEditPlacesUi();
        placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.setPlacesListEditable(false);
        placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.setDeleteButtonVisibility(false);
        placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.setFeatureToggleEnabled(true);
    }

    /* renamed from: k */
    public final void m54627k() {
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.openBrowserWindow("http://mapbox.com/about/maps");
    }

    /* renamed from: l */
    public final void m54628l() {
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.openBrowserWindow("http://mapbox.com/about/maps");
    }

    /* renamed from: m */
    public final void m54629m() {
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.openBrowserWindow("https://enterprise.foursquare.com/");
    }

    /* renamed from: n */
    public final void m54630n() {
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.openBrowserWindow("http://www.openstreetmap.org/copyright");
    }

    /* renamed from: o */
    public final void m54631o() {
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.openBrowserWindow("https://www.mapbox.com/map-feedback/");
    }

    /* renamed from: b */
    public final void m54618b(@NotNull String str) {
        C2668g.b(str, "id");
        this.f45484o.d(str);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: p */
    public final void m54632p() {
        this.f45482m.observePlacesEnabled().take(1).subscribe(new C16019q(this), C16020r.f49787a);
    }

    /* renamed from: q */
    public final void m54633q() {
        boolean isTelemetryEnabled = this.f45486q.isTelemetryEnabled();
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.openMapboxTelemetryDialog(isTelemetryEnabled);
    }

    /* renamed from: r */
    public final void m54634r() {
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.closeTelemetryDialog();
        placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.openBrowserWindow("https://www.mapbox.com/telemetry/");
    }

    /* renamed from: s */
    public final void m54635s() {
        this.f45486q.enableTelemetry();
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.closeTelemetryDialog();
    }

    /* renamed from: t */
    public final void m54636t() {
        this.f45486q.disableTelemetry();
        PlacesSettingsTarget placesSettingsTarget = this.f45470a;
        if (placesSettingsTarget == null) {
            C2668g.b("target");
        }
        placesSettingsTarget.closeTelemetryDialog();
    }
}
