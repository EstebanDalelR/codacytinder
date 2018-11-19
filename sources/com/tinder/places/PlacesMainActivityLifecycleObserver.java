package com.tinder.places;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.tinder.discovery.domain.C11144b;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.p238f.p239a.C9363a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/places/PlacesMainActivityLifecycleObserver;", "Landroid/arch/lifecycle/LifecycleObserver;", "updateDiscoverySegments", "Lcom/tinder/discovery/domain/UpdateDiscoverySegments;", "placesAvailableProvider", "Lcom/tinder/domain/places/provider/PlacesAvailableProvider;", "crmAttributesReporter", "Lcom/tinder/meta/analytics/CrmAttributesReporter;", "(Lcom/tinder/discovery/domain/UpdateDiscoverySegments;Lcom/tinder/domain/places/provider/PlacesAvailableProvider;Lcom/tinder/meta/analytics/CrmAttributesReporter;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "onActivityCreated", "", "onActivityDestroyed", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesMainActivityLifecycleObserver implements LifecycleObserver {
    /* renamed from: a */
    private Disposable f12448a;
    /* renamed from: b */
    private final C11144b f12449b;
    /* renamed from: c */
    private final PlacesAvailableProvider f12450c;
    /* renamed from: d */
    private final C9363a f12451d;

    @Inject
    public PlacesMainActivityLifecycleObserver(@NotNull C11144b c11144b, @NotNull PlacesAvailableProvider placesAvailableProvider, @NotNull C9363a c9363a) {
        C2668g.m10309b(c11144b, "updateDiscoverySegments");
        C2668g.m10309b(placesAvailableProvider, "placesAvailableProvider");
        C2668g.m10309b(c9363a, "crmAttributesReporter");
        this.f12449b = c11144b;
        this.f12450c = placesAvailableProvider;
        this.f12451d = c9363a;
    }

    @OnLifecycleEvent(Event.ON_CREATE)
    public final void onActivityCreated() {
        Disposable disposable = this.f12448a;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f12448a = this.f12450c.observePlacesAvailable().m15381d().m15372c((Function) new PlacesMainActivityLifecycleObserver$a(this)).m15294b(C15756a.b()).m15288a((Action) PlacesMainActivityLifecycleObserver$b.f26505a, (Consumer) PlacesMainActivityLifecycleObserver$c.f26506a);
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void onActivityDestroyed() {
        Disposable disposable = this.f12448a;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
