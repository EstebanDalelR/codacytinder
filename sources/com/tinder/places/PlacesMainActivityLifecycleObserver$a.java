package com.tinder.places;

import com.tinder.discovery.model.DiscoverySegment;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Completable;"}, k = 3, mv = {1, 1, 10})
final class PlacesMainActivityLifecycleObserver$a<T, R> implements Function<Boolean, CompletableSource> {
    /* renamed from: a */
    final /* synthetic */ PlacesMainActivityLifecycleObserver f26504a;

    PlacesMainActivityLifecycleObserver$a(PlacesMainActivityLifecycleObserver placesMainActivityLifecycleObserver) {
        this.f26504a = placesMainActivityLifecycleObserver;
    }

    public /* synthetic */ Object apply(Object obj) {
        return m31318a((Boolean) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m31318a(@NotNull Boolean bool) {
        C2668g.b(bool, "it");
        PlacesMainActivityLifecycleObserver.a(this.f26504a).b(bool.booleanValue());
        return PlacesMainActivityLifecycleObserver.b(this.f26504a).a(C19301m.a(new Pair(DiscoverySegment.PLACES, bool)));
    }
}
