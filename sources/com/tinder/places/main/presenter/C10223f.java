package com.tinder.places.main.presenter;

import com.tinder.analytics.C2634g;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.Screen.C10689h;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.data.places.p330b.C10894b;
import com.tinder.data.places.p330b.C10896d;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.PlacesLoadedStateProvider;
import com.tinder.domain.places.model.PlacesConfig;
import com.tinder.domain.places.model.PlacesLoadedState;
import com.tinder.domain.places.provider.PlacesOnboardingProgressProvider;
import com.tinder.domain.places.provider.PlacesOnboardingProgressProvider.OnboardingProgress;
import com.tinder.domain.places.usecase.ClearAllPlaces;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.model.Tutorial.PlacesOnboarding;
import com.tinder.domain.profile.model.Tutorials;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent;
import com.tinder.places.analytics.AddPlacesViewEvent;
import com.tinder.places.analytics.AddPlacesViewEvent.Screen;
import com.tinder.places.analytics.AddPlacesViewEvent.Source;
import com.tinder.places.analytics.C10114d;
import com.tinder.places.main.target.PlacesTarget;
import com.tinder.places.p311f.C12345i;
import com.tinder.places.p311f.C12345i.C10208b;
import com.tinder.places.provider.C10271c;
import com.tinder.places.provider.C10271c.C10270a;
import com.tinder.places.provider.C10275k;
import com.tinder.places.provider.PlacesEnabledProvider;
import com.tinder.places.provider.SelectedPlaceProvider;
import com.tinder.places.provider.SelectedPlaceProvider.C10269a;
import com.tinder.places.provider.SelectedPlaceProvider.SelectedFrom;
import com.tinder.utils.RxUtils;
import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001`B\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u000e\b\u0003\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&¢\u0006\u0002\u0010'JF\u00104\u001a\b\u0012\u0004\u0012\u000206052\f\u00107\u001a\b\u0012\u0004\u0012\u00020+052\f\u00108\u001a\b\u0012\u0004\u0012\u00020+052\f\u00109\u001a\b\u0012\u0004\u0012\u00020+052\f\u0010:\u001a\b\u0012\u0004\u0012\u00020+05H\u0002J!\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0002\u0010AJ\u001a\u0010B\u001a\u00020<2\u0006\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020+H\u0002J\r\u0010F\u001a\u00020<H\u0001¢\u0006\u0002\bGJ\r\u0010H\u001a\u00020<H\u0001¢\u0006\u0002\bIJ\u0006\u0010J\u001a\u00020<J\u0012\u0010K\u001a\u00020+2\b\u0010L\u001a\u0004\u0018\u00010)H\u0002J\b\u0010M\u001a\u00020<H\u0007J\b\u0010N\u001a\u00020<H\u0007J\b\u0010O\u001a\u00020<H\u0007J\u0006\u0010P\u001a\u00020<J\b\u0010Q\u001a\u00020<H\u0007J\u0010\u0010R\u001a\u00020<2\u0006\u0010S\u001a\u00020+H\u0002J\b\u0010T\u001a\u00020<H\u0002J\u0006\u0010U\u001a\u00020<J\u001e\u0010V\u001a\u00020<2\u0006\u0010W\u001a\u00020X2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020<0\u001dH\u0002J\u0006\u0010Z\u001a\u00020<J\b\u0010[\u001a\u00020<H\u0007J\u0010\u0010\\\u001a\u00020<2\u0006\u0010]\u001a\u00020^H\u0002J\b\u0010_\u001a\u00020<H\u0002R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020/8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006a"}, d2 = {"Lcom/tinder/places/main/presenter/PlacesPresenter;", "", "placesConfigProvider", "Lcom/tinder/domain/places/PlacesConfigProvider;", "placesStateProvider", "Lcom/tinder/domain/places/PlacesLoadedStateProvider;", "fetchRecentPlacesFromApi", "Lcom/tinder/data/places/usecase/FetchRecentPlacesFromApi;", "selectedPlaceProvider", "Lcom/tinder/places/provider/SelectedPlaceProvider;", "clearPlaces", "Lcom/tinder/domain/places/usecase/ClearAllPlaces;", "placesEnabledProvider", "Lcom/tinder/places/provider/PlacesEnabledProvider;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "addPlacesViewEvent", "Lcom/tinder/places/analytics/AddPlacesViewEvent;", "addPlacesLoadedEvent", "Lcom/tinder/places/analytics/AddPlacesLoadedRecentPlacesEvent;", "countPlacesInCache", "Lcom/tinder/data/places/usecase/CountPlacesInCache;", "showPlacesErrorIfNeeded", "Lcom/tinder/places/usecase/ShowPlacesErrorIfNeeded;", "currentScreenNotifier", "Lcom/tinder/common/navigation/CurrentScreenNotifier;", "crmUserAttributeTracker", "Lcom/tinder/analytics/CrmUserAttributeTracker;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "addPlacesManageEnabledEvent", "Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent;", "placeFrontmostProvider", "Lcom/tinder/places/provider/PlaceFrontmostProvider;", "placesOnboardingProgressProvider", "Lcom/tinder/domain/places/provider/PlacesOnboardingProgressProvider;", "placesSeenSharedPreferencesProvider", "Lcom/tinder/places/provider/PlacesSeenSharedPreferencesProvider;", "(Lcom/tinder/domain/places/PlacesConfigProvider;Lcom/tinder/domain/places/PlacesLoadedStateProvider;Lcom/tinder/data/places/usecase/FetchRecentPlacesFromApi;Lcom/tinder/places/provider/SelectedPlaceProvider;Lcom/tinder/domain/places/usecase/ClearAllPlaces;Lcom/tinder/places/provider/PlacesEnabledProvider;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/tinder/places/analytics/AddPlacesViewEvent;Lcom/tinder/places/analytics/AddPlacesLoadedRecentPlacesEvent;Lcom/tinder/data/places/usecase/CountPlacesInCache;Lcom/tinder/places/usecase/ShowPlacesErrorIfNeeded;Lcom/tinder/common/navigation/CurrentScreenNotifier;Lcom/tinder/analytics/CrmUserAttributeTracker;Lkotlin/jvm/functions/Function0;Lcom/tinder/places/analytics/AddPlacesManageEnabledEvent;Lcom/tinder/places/provider/PlaceFrontmostProvider;Lcom/tinder/domain/places/provider/PlacesOnboardingProgressProvider;Lcom/tinder/places/provider/PlacesSeenSharedPreferencesProvider;)V", "combinedEnvironmentSubscription", "Lio/reactivex/disposables/Disposable;", "firedPlacesViewEvent", "", "placesStateSubscription", "setPlacesHasToggledDisposable", "target", "Lcom/tinder/places/main/target/PlacesTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/main/target/PlacesTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/main/target/PlacesTarget;)V", "createCombinedEnvironmentObservable", "Lio/reactivex/Observable;", "Lcom/tinder/places/main/presenter/PlacesPresenter$PlacesLoadingEnvironment;", "placesEnabled", "onboardingRequired", "onboardingStarted", "placesFrontmostObs", "firePlacesLoadedEvent", "", "startTime", "", "errorCode", "", "(JLjava/lang/Integer;)V", "firePlacesViewEventOnce", "screen", "Lcom/tinder/places/analytics/AddPlacesViewEvent$Screen;", "isLoading", "handlePlacesBackgrounded", "handlePlacesBackgrounded$Tinder_release", "handlePlacesForegrounded", "handlePlacesForegrounded$Tinder_release", "handlePlacesSettingsButtonClicked", "isInitialized", "disposable", "loadPlacesConfig", "notifyPlacesAsCurrentScreen", "observeLoadedState", "resetOnboardingProgress", "resetPlacesViewEventAnalytics", "setPlacesEnabled", "enabled", "setPlacesHasToggled", "settingsRequested", "showErrorIfNeeded", "throwable", "", "retryAction", "turnOnPlaces", "unsubscribe", "updateLoadingState", "state", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "updatePlacesRepoFromApi", "PlacesLoadingEnvironment", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.main.presenter.f */
public final class C10223f {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesTarget f33296a;
    /* renamed from: b */
    private Disposable f33297b;
    /* renamed from: c */
    private Disposable f33298c;
    /* renamed from: d */
    private Disposable f33299d;
    /* renamed from: e */
    private boolean f33300e;
    /* renamed from: f */
    private final PlacesConfigProvider f33301f;
    /* renamed from: g */
    private final PlacesLoadedStateProvider f33302g;
    /* renamed from: h */
    private final C10896d f33303h;
    /* renamed from: i */
    private final SelectedPlaceProvider f33304i;
    /* renamed from: j */
    private final ClearAllPlaces f33305j;
    /* renamed from: k */
    private final PlacesEnabledProvider f33306k;
    /* renamed from: l */
    private final LoadProfileOptionData f33307l;
    /* renamed from: m */
    private final AddPlacesViewEvent f33308m;
    /* renamed from: n */
    private final C10114d f33309n;
    /* renamed from: o */
    private final C10894b f33310o;
    /* renamed from: p */
    private final C12345i f33311p;
    /* renamed from: q */
    private final CurrentScreenNotifier f33312q;
    /* renamed from: r */
    private final C2634g f33313r;
    /* renamed from: s */
    private final Function0<DateTime> f33314s;
    /* renamed from: t */
    private final AddPlacesManageEnabledEvent f33315t;
    /* renamed from: u */
    private final C10271c f33316u;
    /* renamed from: v */
    private final PlacesOnboardingProgressProvider f33317v;
    /* renamed from: w */
    private final C10275k f33318w;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tinder/places/main/presenter/PlacesPresenter$PlacesLoadingEnvironment;", "", "placesEnabled", "", "onboardingRequired", "onboardingStarted", "(ZZZ)V", "getOnboardingRequired", "()Z", "getOnboardingStarted", "getPlacesEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$a */
    private static final class C10222a {
        /* renamed from: a */
        private final boolean f33293a;
        /* renamed from: b */
        private final boolean f33294b;
        /* renamed from: c */
        private final boolean f33295c;

        /* renamed from: a */
        public final boolean m41555a() {
            return this.f33293a;
        }

        /* renamed from: b */
        public final boolean m41556b() {
            return this.f33294b;
        }

        /* renamed from: c */
        public final boolean m41557c() {
            return this.f33295c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C10222a) {
                C10222a c10222a = (C10222a) obj;
                if ((this.f33293a == c10222a.f33293a ? 1 : null) != null) {
                    if ((this.f33294b == c10222a.f33294b ? 1 : null) != null) {
                        if ((this.f33295c == c10222a.f33295c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f33293a;
            int i2 = 1;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            int i3 = this.f33294b;
            if (i3 != 0) {
                i3 = 1;
            }
            i = (i + i3) * 31;
            boolean z = this.f33295c;
            if (!z) {
                i2 = z;
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PlacesLoadingEnvironment(placesEnabled=");
            stringBuilder.append(this.f33293a);
            stringBuilder.append(", onboardingRequired=");
            stringBuilder.append(this.f33294b);
            stringBuilder.append(", onboardingStarted=");
            stringBuilder.append(this.f33295c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10222a(boolean z, boolean z2, boolean z3) {
            this.f33293a = z;
            this.f33294b = z2;
            this.f33295c = z3;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/places/main/presenter/PlacesPresenter$PlacesLoadingEnvironment;", "placesEnabled", "", "placesOnboardingRequired", "placesOnboardingStarted", "placesFrontmost", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$b */
    static final class C12352b<T1, T2, T3, T4, R> implements Function4<Boolean, Boolean, Boolean, Boolean, C10222a> {
        /* renamed from: a */
        final /* synthetic */ C10223f f39968a;

        C12352b(C10223f c10223f) {
            this.f39968a = c10223f;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
            return m48745a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
        }

        @NotNull
        /* renamed from: a */
        public final C10222a m48745a(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z4) {
                this.f39968a.m41583m();
            }
            z2 = z2 && z4;
            return new C10222a(z, z2, z3);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/tinder/places/main/presenter/PlacesPresenter$PlacesLoadingEnvironment;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$i */
    static final class C12353i<T> implements Consumer<C10222a> {
        /* renamed from: a */
        final /* synthetic */ C10223f f39969a;

        C12353i(C10223f c10223f) {
            this.f39969a = c10223f;
        }

        public /* synthetic */ void accept(Object obj) {
            m48746a((C10222a) obj);
        }

        /* renamed from: a */
        public final void m48746a(C10222a c10222a) {
            boolean a = c10222a.m41555a();
            boolean b = c10222a.m41556b();
            c10222a = c10222a.m41557c();
            if (b && c10222a == null) {
                this.f39969a.m41584a().showOnboarding();
                this.f39969a.f33317v.updateOnboardingProgress(OnboardingProgress.IN_PROGRESS);
                C10223f.m41567a(this.f39969a, Screen.ONBOARDING, false, 2, null);
            } else if (a) {
                this.f39969a.m41571a(true);
                this.f39969a.f33313r.j(0);
            } else {
                this.f39969a.m41571a(false);
                C10223f.m41567a(this.f39969a, Screen.PLACES_DISABLED, false, 2, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/Tutorials;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$j */
    static final class C12354j<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C12354j f39970a = new C12354j();

        C12354j() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m48747a((Tutorials) obj));
        }

        /* renamed from: a */
        public final boolean m48747a(@NotNull Tutorials tutorials) {
            C2668g.b(tutorials, "it");
            return tutorials.getTutorials().contains(PlacesOnboarding.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/provider/PlacesOnboardingProgressProvider$OnboardingProgress;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$k */
    static final class C12355k<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C12355k f39971a = new C12355k();

        C12355k() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m48748a((OnboardingProgress) obj));
        }

        /* renamed from: a */
        public final boolean m48748a(@NotNull OnboardingProgress onboardingProgress) {
            C2668g.b(onboardingProgress, "it");
            return onboardingProgress != OnboardingProgress.NOT_STARTED ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/places/provider/PlaceFrontmostProvider$PlacesNavState;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$l */
    static final class C12356l<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C12356l f39972a = new C12356l();

        C12356l() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m48749a((C10270a) obj));
        }

        /* renamed from: a */
        public final boolean m48749a(@NotNull C10270a c10270a) {
            C2668g.b(c10270a, "it");
            return c10270a.m41659a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "", "state", "placesEnabled", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$m */
    static final class C12357m<T1, T2, R> implements BiFunction<PlacesLoadedState, Boolean, Pair<? extends PlacesLoadedState, ? extends Boolean>> {
        /* renamed from: a */
        public static final C12357m f39973a = new C12357m();

        C12357m() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m48750a((PlacesLoadedState) obj, ((Boolean) obj2).booleanValue());
        }

        @NotNull
        /* renamed from: a */
        public final Pair<PlacesLoadedState, Boolean> m48750a(@NotNull PlacesLoadedState placesLoadedState, boolean z) {
            C2668g.b(placesLoadedState, "state");
            return new Pair(placesLoadedState, Boolean.valueOf(z));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$n */
    static final class C12358n<T> implements Predicate<Pair<? extends PlacesLoadedState, ? extends Boolean>> {
        /* renamed from: a */
        public static final C12358n f39974a = new C12358n();

        C12358n() {
        }

        /* renamed from: a */
        public final boolean m48751a(@NotNull Pair<? extends PlacesLoadedState, Boolean> pair) {
            C2668g.b(pair, "<name for destructuring parameter 0>");
            return ((Boolean) pair.d()).booleanValue();
        }

        public /* synthetic */ boolean test(Object obj) {
            return m48751a((Pair) obj);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$o */
    static final class C12359o<T> implements Consumer<Pair<? extends PlacesLoadedState, ? extends Boolean>> {
        /* renamed from: a */
        final /* synthetic */ C10223f f39975a;

        C12359o(C10223f c10223f) {
            this.f39975a = c10223f;
        }

        public /* synthetic */ void accept(Object obj) {
            m48752a((Pair) obj);
        }

        /* renamed from: a */
        public final void m48752a(Pair<? extends PlacesLoadedState, Boolean> pair) {
            switch (C10224g.f33319a[((PlacesLoadedState) pair.c()).ordinal()]) {
                case 1:
                    this.f39975a.m41582l();
                    return;
                case 2:
                    this.f39975a.m41562a(Screen.PLACES, true);
                    this.f39975a.m41584a().showLoadingMap();
                    return;
                case 3:
                    this.f39975a.m41562a(Screen.PLACES, false);
                    this.f39975a.m41584a().hideLoadingMap();
                    return;
                default:
                    return;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$p */
    static final class C12360p<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12360p f39976a = new C12360p();

        C12360p() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48753a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48753a(Throwable th) {
            C0001a.c(th, "Error reading loaded state", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/provider/PlacesOnboardingProgressProvider$OnboardingProgress;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$q */
    static final class C12361q<T> implements Predicate<OnboardingProgress> {
        /* renamed from: a */
        public static final C12361q f39977a = new C12361q();

        C12361q() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m48754a((OnboardingProgress) obj);
        }

        /* renamed from: a */
        public final boolean m48754a(@NotNull OnboardingProgress onboardingProgress) {
            C2668g.b(onboardingProgress, "it");
            return onboardingProgress != OnboardingProgress.COMPLETE ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/provider/PlacesOnboardingProgressProvider$OnboardingProgress;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$r */
    static final class C12362r<T> implements Consumer<OnboardingProgress> {
        /* renamed from: a */
        final /* synthetic */ C10223f f39978a;

        C12362r(C10223f c10223f) {
            this.f39978a = c10223f;
        }

        public /* synthetic */ void accept(Object obj) {
            m48755a((OnboardingProgress) obj);
        }

        /* renamed from: a */
        public final void m48755a(OnboardingProgress onboardingProgress) {
            this.f39978a.f33317v.updateOnboardingProgress(OnboardingProgress.NOT_STARTED);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$s */
    static final class C12363s<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12363s f39979a = new C12363s();

        C12363s() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48756a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48756a(Throwable th) {
            C0001a.c(th, "Error observing onboarding progress", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$v */
    static final class C12364v implements Action {
        /* renamed from: a */
        public static final C12364v f39980a = new C12364v();

        C12364v() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$w */
    static final class C12365w<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12365w f39981a = new C12365w();

        C12365w() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48757a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48757a(Throwable th) {
            C0001a.c(th, "failed to setPlacesHasToggled", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$d */
    static final class C13586d<T, R> implements Func1<PlacesLoadedState, Boolean> {
        /* renamed from: a */
        public static final C13586d f43330a = new C13586d();

        C13586d() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m53032a((PlacesLoadedState) obj));
        }

        /* renamed from: a */
        public final boolean m53032a(PlacesLoadedState placesLoadedState) {
            return placesLoadedState == PlacesLoadedState.SUCCESS ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/domain/places/model/PlacesConfig;", "it", "Lcom/tinder/domain/places/model/PlacesLoadedState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$e */
    static final class C13587e<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10223f f43331a;

        C13587e(C10223f c10223f) {
            this.f43331a = c10223f;
        }

        public /* synthetic */ Object call(Object obj) {
            return m53033a((PlacesLoadedState) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Observable<PlacesConfig> m53033a(PlacesLoadedState placesLoadedState) {
            return this.f43331a.f33301f.observe();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "placesConfig", "Lcom/tinder/domain/places/model/PlacesConfig;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$f */
    static final class C13588f<T, R> implements Func1<PlacesConfig, Completable> {
        /* renamed from: a */
        final /* synthetic */ C10223f f43332a;

        C13588f(C10223f c10223f) {
            this.f43332a = c10223f;
        }

        public /* synthetic */ Object call(Object obj) {
            return m53034a((PlacesConfig) obj);
        }

        /* renamed from: a */
        public final Completable m53034a(final PlacesConfig placesConfig) {
            if (placesConfig.getNextRefreshTime() < ((DateTime) this.f43332a.f33314s.invoke()).getMillis()) {
                return this.f43332a.f33305j.execute();
            }
            if ((((CharSequence) placesConfig.getLastSelectedPlace()).length() > 0 ? 1 : null) != null) {
                return Completable.a(new Action0() {
                    public final void call() {
                        this.f43332a.f33304i.m48843a(new C10269a(SelectedFrom.LAST_SELECTED_PLACE, placesConfig.getLastSelectedPlace()));
                    }
                });
            }
            return Completable.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "count", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$c */
    static final class C14207c<T> implements Action1<Integer> {
        /* renamed from: a */
        final /* synthetic */ C10223f f45014a;
        /* renamed from: b */
        final /* synthetic */ long f45015b;

        C14207c(C10223f c10223f, long j) {
            this.f45014a = c10223f;
            this.f45015b = j;
        }

        public /* synthetic */ void call(Object obj) {
            m53928a((Integer) obj);
        }

        /* renamed from: a */
        public final void m53928a(Integer num) {
            C10114d h = this.f45014a.f33309n;
            C2668g.a(num, ManagerWebServices.FB_PARAM_FIELD_COUNT);
            h.m41347a(num.intValue(), this.f45015b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$g */
    static final class C14209g implements Action0 {
        /* renamed from: a */
        public static final C14209g f45018a = new C14209g();

        C14209g() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$h */
    static final class C14210h<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14210h f45019a = new C14210h();

        C14210h() {
        }

        public /* synthetic */ void call(Object obj) {
            m53929a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53929a(Throwable th) {
            C0001a.c(th, "Error getting loaded state", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$t */
    static final class C14211t implements Action0 {
        /* renamed from: a */
        public static final C14211t f45020a = new C14211t();

        C14211t() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$u */
    static final class C14212u<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14212u f45021a = new C14212u();

        C14212u() {
        }

        public /* synthetic */ void call(Object obj) {
            m53930a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53930a(Throwable th) {
            C0001a.c(th, "Error clearing places", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lrx/Subscription;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$x */
    static final class C14213x<T> implements Action1<Subscription> {
        /* renamed from: a */
        final /* synthetic */ C10223f f45022a;

        C14213x(C10223f c10223f) {
            this.f45022a = c10223f;
        }

        public /* synthetic */ void call(Object obj) {
            m53931a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m53931a(Subscription subscription) {
            this.f45022a.m41561a(PlacesLoadedState.LOADING);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$y */
    static final class C14214y implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10223f f45023a;
        /* renamed from: b */
        final /* synthetic */ long f45024b;

        C14214y(C10223f c10223f, long j) {
            this.f45023a = c10223f;
            this.f45024b = j;
        }

        public final void call() {
            C10223f.m41564a(this.f45023a, this.f45024b, null, 2, null);
            this.f45023a.m41561a(PlacesLoadedState.SUCCESS);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.f$z */
    static final class C14215z<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C10223f f45025a;
        /* renamed from: b */
        final /* synthetic */ long f45026b;

        C14215z(C10223f c10223f, long j) {
            this.f45025a = c10223f;
            this.f45026b = j;
        }

        public /* synthetic */ void call(Object obj) {
            m53932a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53932a(Throwable th) {
            C0001a.c(th, "Error fetching recent places", new Object[0]);
            PlacesApiException placesApiException = (PlacesApiException) (!(th instanceof PlacesApiException) ? null : th);
            if (placesApiException != null) {
                Integer a = placesApiException.m37235a();
                if (a != null) {
                    this.f45025a.m41560a(this.f45026b, Integer.valueOf(a.intValue()));
                }
            }
            this.f45025a.m41561a(PlacesLoadedState.ERROR);
            C10223f c10223f = this.f45025a;
            C2668g.a(th, "it");
            c10223f.m41570a(th, (Function0) new PlacesPresenter$updatePlacesRepoFromApi$3$2(this));
        }
    }

    @Inject
    public C10223f(@NotNull PlacesConfigProvider placesConfigProvider, @NotNull PlacesLoadedStateProvider placesLoadedStateProvider, @NotNull C10896d c10896d, @NotNull SelectedPlaceProvider selectedPlaceProvider, @NotNull ClearAllPlaces clearAllPlaces, @NotNull PlacesEnabledProvider placesEnabledProvider, @NotNull LoadProfileOptionData loadProfileOptionData, @NotNull AddPlacesViewEvent addPlacesViewEvent, @NotNull C10114d c10114d, @NotNull C10894b c10894b, @NotNull C12345i c12345i, @NotNull CurrentScreenNotifier currentScreenNotifier, @NotNull C2634g c2634g, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0, @NotNull AddPlacesManageEnabledEvent addPlacesManageEnabledEvent, @NotNull C10271c c10271c, @NotNull PlacesOnboardingProgressProvider placesOnboardingProgressProvider, @NotNull C10275k c10275k) {
        C10223f c10223f = this;
        PlacesConfigProvider placesConfigProvider2 = placesConfigProvider;
        PlacesLoadedStateProvider placesLoadedStateProvider2 = placesLoadedStateProvider;
        C10896d c10896d2 = c10896d;
        SelectedPlaceProvider selectedPlaceProvider2 = selectedPlaceProvider;
        ClearAllPlaces clearAllPlaces2 = clearAllPlaces;
        PlacesEnabledProvider placesEnabledProvider2 = placesEnabledProvider;
        LoadProfileOptionData loadProfileOptionData2 = loadProfileOptionData;
        AddPlacesViewEvent addPlacesViewEvent2 = addPlacesViewEvent;
        C10114d c10114d2 = c10114d;
        C10894b c10894b2 = c10894b;
        C12345i c12345i2 = c12345i;
        CurrentScreenNotifier currentScreenNotifier2 = currentScreenNotifier;
        C2634g c2634g2 = c2634g;
        Function0<DateTime> function02 = function0;
        AddPlacesManageEnabledEvent addPlacesManageEnabledEvent2 = addPlacesManageEnabledEvent;
        C10271c c10271c2 = c10271c;
        C2668g.b(placesConfigProvider2, "placesConfigProvider");
        C2668g.b(placesLoadedStateProvider2, "placesStateProvider");
        C2668g.b(c10896d2, "fetchRecentPlacesFromApi");
        C2668g.b(selectedPlaceProvider2, "selectedPlaceProvider");
        C2668g.b(clearAllPlaces2, "clearPlaces");
        C2668g.b(placesEnabledProvider2, "placesEnabledProvider");
        C2668g.b(loadProfileOptionData2, "loadProfileOptionData");
        C2668g.b(addPlacesViewEvent2, "addPlacesViewEvent");
        C2668g.b(c10114d2, "addPlacesLoadedEvent");
        C2668g.b(c10894b2, "countPlacesInCache");
        C2668g.b(c12345i2, "showPlacesErrorIfNeeded");
        C2668g.b(currentScreenNotifier2, "currentScreenNotifier");
        C2668g.b(c2634g2, "crmUserAttributeTracker");
        C2668g.b(function02, "dateTimeProvider");
        C2668g.b(addPlacesManageEnabledEvent2, "addPlacesManageEnabledEvent");
        C2668g.b(c10271c, "placeFrontmostProvider");
        C2668g.b(placesOnboardingProgressProvider, "placesOnboardingProgressProvider");
        C2668g.b(c10275k, "placesSeenSharedPreferencesProvider");
        C10271c c10271c3 = c10271c;
        this.f33301f = placesConfigProvider2;
        this.f33302g = placesLoadedStateProvider2;
        this.f33303h = c10896d2;
        this.f33304i = selectedPlaceProvider2;
        this.f33305j = clearAllPlaces2;
        this.f33306k = placesEnabledProvider2;
        this.f33307l = loadProfileOptionData2;
        this.f33308m = addPlacesViewEvent2;
        this.f33309n = c10114d2;
        this.f33310o = c10894b2;
        this.f33311p = c12345i2;
        this.f33312q = currentScreenNotifier2;
        this.f33313r = c2634g2;
        this.f33314s = function02;
        this.f33315t = addPlacesManageEnabledEvent;
        this.f33316u = c10271c3;
        C10275k c10275k2 = c10275k;
        this.f33317v = placesOnboardingProgressProvider;
        this.f33318w = c10275k2;
    }

    @NotNull
    /* renamed from: a */
    public final PlacesTarget m41584a() {
        PlacesTarget placesTarget = this.f33296a;
        if (placesTarget == null) {
            C2668g.b("target");
        }
        return placesTarget;
    }

    @Take
    /* renamed from: b */
    public final void m41585b() {
        if (!m41572a(this.f33297b)) {
            C3959e observePlacesEnabled = this.f33306k.observePlacesEnabled();
            C3959e map = this.f33307l.execute(ProfileOption.Tutorials.INSTANCE).map(C12354j.f39970a);
            C3959e map2 = this.f33316u.m41660a().p().map(C12356l.f39972a);
            C3959e map3 = this.f33317v.observeOnboardingProgress().map(C12355k.f39971a);
            C2668g.a(map, "onboardingRequiredObs");
            C2668g.a(map3, "onboardingStartedObs");
            C2668g.a(map2, "placesFrontmostObs");
            observePlacesEnabled = m41559a(observePlacesEnabled, map, map3, map2).subscribeOn(C15756a.b()).observeOn(C15674a.a());
            Consumer c12353i = new C12353i(this);
            Function1 function1 = PlacesPresenter$loadPlacesConfig$2.f45330a;
            if (function1 != null) {
                function1 = new C12366h(function1);
            }
            this.f33297b = observePlacesEnabled.subscribe(c12353i, (Consumer) function1);
        }
    }

    @Take
    /* renamed from: c */
    public final void m41586c() {
        if (!m41572a(this.f33298c)) {
            this.f33298c = C3959e.combineLatest(RxJavaInteropExtKt.toV2Observable(this.f33302g.observe()), this.f33306k.observePlacesEnabled(), C12357m.f39973a).filter(C12358n.f39974a).observeOn(C15674a.a()).subscribe(new C12359o(this), C12360p.f39976a);
        }
    }

    @Take
    /* renamed from: d */
    public final void m41587d() {
        this.f33302g.observe().f(C13586d.f43330a).h().h(new C13587e(this)).h().a().c(new C13588f(this)).a(C14209g.f45018a, C14210h.f45019a);
    }

    @Take
    /* renamed from: e */
    public final void m41588e() {
        this.f33312q.notify(C10689h.f35030a);
    }

    @Drop
    /* renamed from: f */
    public final void m41589f() {
        C10269a a = this.f33304i.m48842a();
        if (a != null) {
            PlacesConfig placesConfig = this.f33301f.get();
            if (placesConfig != null) {
                this.f33301f.update(PlacesConfig.copy$default(placesConfig, 0, a.m41656b(), false, false, 13, null));
            }
        }
    }

    @Drop
    /* renamed from: g */
    public final void m41590g() {
        this.f33300e = false;
    }

    /* renamed from: a */
    private final void m41571a(boolean z) {
        if (z) {
            z = this.f33296a;
            if (!z) {
                C2668g.b("target");
            }
            z.clearDisabledView();
            return;
        }
        z = this.f33296a;
        if (!z) {
            C2668g.b("target");
        }
        z.showDisabledView();
        this.f33305j.execute().a(C14211t.f45020a, C14212u.f45021a);
    }

    /* renamed from: l */
    private final void m41582l() {
        long a = DateTimeUtils.a();
        this.f33303h.execute().a(RxUtils.a().b()).d(new C14213x(this)).a(new C14214y(this, a), new C14215z(this, a));
    }

    /* renamed from: a */
    private final void m41561a(PlacesLoadedState placesLoadedState) {
        this.f33302g.update(placesLoadedState);
    }

    /* renamed from: a */
    static /* synthetic */ void m41564a(C10223f c10223f, long j, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        c10223f.m41560a(j, num);
    }

    /* renamed from: a */
    private final void m41560a(long j, Integer num) {
        long a = DateTimeUtils.a() - j;
        if (num != null) {
            this.f33309n.m41348b(num.intValue(), a);
        } else {
            this.f33310o.execute().b(new C14207c(this, a));
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m41567a(C10223f c10223f, Screen screen, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c10223f.m41562a(screen, z);
    }

    /* renamed from: a */
    private final void m41562a(Screen screen, boolean z) {
        if (!this.f33300e) {
            this.f33300e = true;
            this.f33308m.m41333a(Source.TOGGLE, screen, z);
        }
    }

    @Drop
    /* renamed from: h */
    public final void m41591h() {
        Disposable disposable = this.f33297b;
        if (disposable != null) {
            disposable.dispose();
        }
        disposable = this.f33298c;
        if (disposable != null) {
            disposable.dispose();
        }
        disposable = this.f33299d;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: i */
    public final void m41592i() {
        this.f33306k.setPlacesEnabled(true).b(C15756a.b()).a(C15674a.a()).subscribe(C12345i.f39948a.m41526a(new PlacesPresenter$turnOnPlaces$1(this), new PlacesPresenter$turnOnPlaces$2(this), "error enabling places from disabled screen"));
    }

    /* renamed from: j */
    public final void m41593j() {
        PlacesTarget placesTarget = this.f33296a;
        if (placesTarget == null) {
            C2668g.b("target");
        }
        placesTarget.showPlacesSettings();
    }

    /* renamed from: k */
    public final void m41594k() {
        this.f33317v.observeOnboardingProgress().firstElement().a(C12361q.f39977a).a(C15756a.b()).a(new C12362r(this), C12363s.f39979a);
    }

    /* renamed from: a */
    private final boolean m41572a(Disposable disposable) {
        return disposable != null && disposable.isDisposed() == null;
    }

    /* renamed from: a */
    private final void m41570a(Throwable th, Function0<C15813i> function0) {
        this.f33311p.m48726a(new C10208b(th, new PlacesPresenter$showErrorIfNeeded$request$1(this, function0)));
    }

    /* renamed from: m */
    private final void m41583m() {
        this.f33299d = this.f33318w.m41668b().a(C12364v.f39980a, C12365w.f39981a);
    }

    /* renamed from: a */
    private final C3959e<C10222a> m41559a(C3959e<Boolean> c3959e, C3959e<Boolean> c3959e2, C3959e<Boolean> c3959e3, C3959e<Boolean> c3959e4) {
        c3959e = C3959e.combineLatest(c3959e, c3959e2, c3959e3, c3959e4, new C12352b(this));
        C2668g.a(c3959e, "Observable.combineLatest…}\n            )\n        )");
        return c3959e;
    }
}
