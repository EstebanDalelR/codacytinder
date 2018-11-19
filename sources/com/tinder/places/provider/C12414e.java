package com.tinder.places.provider;

import android.content.SharedPreferences;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.functions.Action;
import io.reactivex.processors.BehaviorProcessor;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/places/provider/PlacesAvailableSharedPreferencesProvider;", "Lcom/tinder/domain/places/provider/PlacesAvailableProvider;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "processor", "Lio/reactivex/processors/BehaviorProcessor;", "", "fetchConfigFromSharedPrefs", "Lio/reactivex/Single;", "observePlacesAvailable", "Lio/reactivex/Flowable;", "setPlacesAvailable", "Lio/reactivex/Completable;", "placesAvailable", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.provider.e */
public final class C12414e implements PlacesAvailableProvider {
    /* renamed from: a */
    private final BehaviorProcessor<Boolean> f40061a;
    /* renamed from: b */
    private final SharedPreferences f40062b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.e$a */
    static final class C10272a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C12414e f33402a;

        C10272a(C12414e c12414e) {
            this.f33402a = c12414e;
        }

        public /* synthetic */ Object call() {
            return Boolean.valueOf(m41663a());
        }

        /* renamed from: a */
        public final boolean m41663a() {
            return this.f33402a.f40062b.getBoolean("places_available", false);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.e$b */
    static final class C12413b implements Action {
        /* renamed from: a */
        final /* synthetic */ C12414e f40059a;
        /* renamed from: b */
        final /* synthetic */ boolean f40060b;

        C12413b(C12414e c12414e, boolean z) {
            this.f40059a = c12414e;
            this.f40060b = z;
        }

        public final void run() {
            this.f40059a.f40061a.onNext(Boolean.valueOf(this.f40060b));
            this.f40059a.f40062b.edit().putBoolean("places_available", this.f40060b).apply();
        }
    }

    public C12414e(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f40062b = sharedPreferences;
        sharedPreferences = BehaviorProcessor.q();
        C2668g.a(sharedPreferences, "BehaviorProcessor.create<Boolean>()");
        this.f40061a = sharedPreferences;
    }

    @NotNull
    public C3957b<Boolean> observePlacesAvailable() {
        C3957b<Boolean> b = m48848a().d().b(this.f40061a.u());
        C2668g.a(b, "fetchConfigFromSharedPre…processor.toSerialized())");
        return b;
    }

    @NotNull
    public C3956a setPlacesAvailable(boolean z) {
        z = C3956a.a(new C12413b(this, z));
        C2668g.a(z, "Completable.fromAction {…ilable).apply()\n        }");
        return z;
    }

    /* renamed from: a */
    private final C3960g<Boolean> m48848a() {
        C3960g<Boolean> c = C3960g.c(new C10272a(this));
        C2668g.a(c, "Single.fromCallable {\n  …ACES_AVAILABLE)\n        }");
        return c;
    }
}
