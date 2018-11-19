package com.tinder.places.provider;

import android.content.SharedPreferences;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.model.PlacesConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Observable;
import rx.functions.Action0;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/places/provider/PlacesConfigSharedPreferencesProvider;", "Lcom/tinder/domain/places/PlacesConfigProvider;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "subject", "Lrx/subjects/BehaviorSubject;", "Lcom/tinder/domain/places/model/PlacesConfig;", "clear", "Lrx/Completable;", "fetchConfigFromSharedPrefs", "get", "observe", "Lrx/Observable;", "setSharedPrefs", "", "config", "update", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.provider.g */
public final class C12416g implements PlacesConfigProvider {
    /* renamed from: a */
    private final C19785a<PlacesConfig> f40064a;
    /* renamed from: b */
    private final SharedPreferences f40065b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.g$a */
    static final class C14222a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C12416g f45071a;

        C14222a(C12416g c12416g) {
            this.f45071a = c12416g;
        }

        public final void call() {
            this.f45071a.update(new PlacesConfig(0, null, false, false, 15, null));
        }
    }

    public C12416g(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f40065b = sharedPreferences;
        sharedPreferences = C19785a.f(m48851a());
        C2668g.a(sharedPreferences, "BehaviorSubject.create(f…hConfigFromSharedPrefs())");
        this.f40064a = sharedPreferences;
    }

    @NotNull
    public PlacesConfig get() {
        Object A = this.f40064a.A();
        C2668g.a(A, "subject.value");
        return (PlacesConfig) A;
    }

    @NotNull
    public Observable<PlacesConfig> observe() {
        Observable<PlacesConfig> e = this.f40064a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    public void update(@NotNull PlacesConfig placesConfig) {
        C2668g.b(placesConfig, "config");
        this.f40064a.onNext(placesConfig);
        m48852a(placesConfig);
    }

    @NotNull
    public Completable clear() {
        Completable a = Completable.a(new C14222a(this));
        C2668g.a(a, "Completable.fromAction { update(PlacesConfig()) }");
        return a;
    }

    /* renamed from: a */
    private final void m48852a(PlacesConfig placesConfig) {
        this.f40065b.edit().putLong("places_next_refresh", placesConfig.getNextRefreshTime()).putString("places_last_seen_id", placesConfig.getLastSelectedPlace()).putBoolean("places_new_place_available", placesConfig.getNewPlacesAvailable()).putBoolean("places_recs_has_seen_tutorial", placesConfig.getHasSeenPlacesRecsTutorial()).apply();
    }

    /* renamed from: a */
    private final PlacesConfig m48851a() {
        return new PlacesConfig(this.f40065b.getLong("places_next_refresh", 0), null, this.f40065b.getBoolean("places_new_place_available", false), this.f40065b.getBoolean("places_recs_has_seen_tutorial", false), 2, null);
    }
}
