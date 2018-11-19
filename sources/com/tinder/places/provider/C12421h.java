package com.tinder.places.provider;

import com.tinder.core.experiment.C8598o;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.domain.places.provider.PlacesDiscoverToggleProvider;
import com.tinder.places.analytics.C10113b;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/places/provider/PlacesDiscoverToggleCollapseProvider;", "Lcom/tinder/domain/places/provider/PlacesDiscoverToggleProvider;", "placesSeenSharedPreferencesProvider", "Lcom/tinder/places/provider/PlacesSeenSharedPreferencesProvider;", "placesAvailableProvider", "Lcom/tinder/domain/places/provider/PlacesAvailableProvider;", "placesEnabledProvider", "Lcom/tinder/places/provider/PlacesEnabledProvider;", "placesToggleCollapseDefaultExperiment", "Lcom/tinder/core/experiment/PlacesToggleCollapseDefaultExperiment;", "addPlacesExperimentToggleEvent", "Lcom/tinder/places/analytics/AddPlacesExperimentToggleEvent;", "(Lcom/tinder/places/provider/PlacesSeenSharedPreferencesProvider;Lcom/tinder/domain/places/provider/PlacesAvailableProvider;Lcom/tinder/places/provider/PlacesEnabledProvider;Lcom/tinder/core/experiment/PlacesToggleCollapseDefaultExperiment;Lcom/tinder/places/analytics/AddPlacesExperimentToggleEvent;)V", "memoizedPlacesShouldBeDefault", "", "Ljava/lang/Boolean;", "observePlacesEnabledAndNotToggled", "Lio/reactivex/Single;", "observeShouldShowPlacesToggleCollapse", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.provider.h */
public final class C12421h implements PlacesDiscoverToggleProvider {
    /* renamed from: a */
    private Boolean f40070a;
    /* renamed from: b */
    private final C10275k f40071b;
    /* renamed from: c */
    private final PlacesAvailableProvider f40072c;
    /* renamed from: d */
    private final PlacesEnabledProvider f40073d;
    /* renamed from: e */
    private final C8598o f40074e;
    /* renamed from: f */
    private final C10113b f40075f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "placesEnabled", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Single;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.h$a */
    static final class C12418a<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C12421h f40067a;

        C12418a(C12421h c12421h) {
            this.f40067a = c12421h;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48854a((Boolean) obj);
        }

        /* renamed from: a */
        public final C3960g<Boolean> m48854a(@NotNull Boolean bool) {
            C2668g.b(bool, "placesEnabled");
            if (bool.booleanValue() != null) {
                return C3960g.a(Boolean.valueOf(null));
            }
            return this.f40067a.f40071b.m41667a().e(new Function<T, R>() {
                public /* synthetic */ Object apply(Object obj) {
                    return Boolean.valueOf(m48853a((Boolean) obj));
                }

                /* renamed from: a */
                public final boolean m48853a(@NotNull Boolean bool) {
                    C2668g.b(bool, "hasToggled");
                    if (bool.booleanValue() != null) {
                        return null;
                    }
                    this.f40067a.f40075f.m41345a(this.f40067a.f40074e.m36698a().isPlacesDefaultToggle());
                    return this.f40067a.f40074e.m36698a().isPlacesDefaultToggle();
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "it", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Single;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.h$b */
    static final class C12419b<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C12421h f40068a;

        C12419b(C12421h c12421h) {
            this.f40068a = c12421h;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48855a((Boolean) obj);
        }

        /* renamed from: a */
        public final C3960g<Boolean> m48855a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            if (bool.booleanValue() != null) {
                return this.f40068a.m48857a();
            }
            return C3960g.a(Boolean.valueOf(null));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.h$c */
    static final class C12420c<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C12421h f40069a;

        C12420c(C12421h c12421h) {
            this.f40069a = c12421h;
        }

        public /* synthetic */ void accept(Object obj) {
            m48856a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m48856a(Boolean bool) {
            this.f40069a.f40070a = bool;
        }
    }

    @Inject
    public C12421h(@NotNull C10275k c10275k, @NotNull PlacesAvailableProvider placesAvailableProvider, @NotNull PlacesEnabledProvider placesEnabledProvider, @NotNull C8598o c8598o, @NotNull C10113b c10113b) {
        C2668g.b(c10275k, "placesSeenSharedPreferencesProvider");
        C2668g.b(placesAvailableProvider, "placesAvailableProvider");
        C2668g.b(placesEnabledProvider, "placesEnabledProvider");
        C2668g.b(c8598o, "placesToggleCollapseDefaultExperiment");
        C2668g.b(c10113b, "addPlacesExperimentToggleEvent");
        this.f40071b = c10275k;
        this.f40072c = placesAvailableProvider;
        this.f40073d = placesEnabledProvider;
        this.f40074e = c8598o;
        this.f40075f = c10113b;
    }

    @NotNull
    public C3960g<Boolean> observeShouldShowPlacesToggleCollapse() {
        C3960g<Boolean> a;
        Boolean bool = this.f40070a;
        if (bool != null) {
            a = C3960g.a(Boolean.valueOf(bool.booleanValue()));
            if (a != null) {
                return a;
            }
        }
        a = this.f40072c.observePlacesAvailable().b(Boolean.valueOf(false)).a(new C12419b(this)).b(new C12420c(this));
        C2668g.a(a, "placesAvailableProvider\n…cesShouldBeDefault = it }");
        return a;
    }

    /* renamed from: a */
    private final C3960g<Boolean> m48857a() {
        C3960g<Boolean> a = this.f40073d.observePlacesEnabled().first(Boolean.valueOf(false)).a(new C12418a(this));
        C2668g.a(a, "placesEnabledProvider.ob…          }\n            }");
        return a;
    }
}
