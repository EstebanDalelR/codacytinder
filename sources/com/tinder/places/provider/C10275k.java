package com.tinder.places.provider;

import android.content.SharedPreferences;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/places/provider/PlacesSeenSharedPreferencesProvider;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "fetchHasToggledFromSharedPrefs", "Lio/reactivex/Single;", "", "setPlacesHasToggled", "Lio/reactivex/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.provider.k */
public final class C10275k {
    /* renamed from: a */
    private final SharedPreferences f33405a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.k$a */
    static final class C10273a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10275k f33403a;

        C10273a(C10275k c10275k) {
            this.f33403a = c10275k;
        }

        public /* synthetic */ Object call() {
            return Boolean.valueOf(m41664a());
        }

        /* renamed from: a */
        public final boolean m41664a() {
            return this.f33403a.f33405a.getBoolean("KEY_PLACES_HAS_TOGGLED", false);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.k$b */
    static final class C10274b<V> implements Callable<Object> {
        /* renamed from: a */
        final /* synthetic */ C10275k f33404a;

        C10274b(C10275k c10275k) {
            this.f33404a = c10275k;
        }

        public /* synthetic */ Object call() {
            m41665a();
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m41665a() {
            this.f33404a.f33405a.edit().putBoolean("KEY_PLACES_HAS_TOGGLED", true).apply();
        }
    }

    @Inject
    public C10275k(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f33405a = sharedPreferences;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<Boolean> m41667a() {
        C3960g<Boolean> c = C3960g.c(new C10273a(this));
        C2668g.a(c, "Single.fromCallable {\n  …TOGGLED, false)\n        }");
        return c;
    }

    @NotNull
    /* renamed from: b */
    public final C3956a m41668b() {
        C3956a a = C3956a.a(new C10274b(this));
        C2668g.a(a, "Completable.fromCallable…_TOGGLED, true).apply() }");
        return a;
    }
}
