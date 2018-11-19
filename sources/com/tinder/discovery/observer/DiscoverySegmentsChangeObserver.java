package com.tinder.discovery.observer;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.tinder.discovery.domain.C11143a;
import com.tinder.discovery.p231a.C11119a;
import com.tinder.discovery.p231a.C13142b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/discovery/observer/DiscoverySegmentsChangeObserver;", "Landroid/arch/lifecycle/LifecycleObserver;", "observerDiscoverySegments", "Lcom/tinder/discovery/domain/ObserverDiscoverySegments;", "discoveryToggleNavigationAdapter", "Lcom/tinder/discovery/adapter/DiscoveryToggleNavigationAdapter;", "discoverySingleViewSwitcherAdapter", "Lcom/tinder/discovery/adapter/DiscoverySingleViewSwitcherAdapter;", "(Lcom/tinder/discovery/domain/ObserverDiscoverySegments;Lcom/tinder/discovery/adapter/DiscoveryToggleNavigationAdapter;Lcom/tinder/discovery/adapter/DiscoverySingleViewSwitcherAdapter;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "onActivityCreate", "", "onActivityDestroy", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class DiscoverySegmentsChangeObserver implements LifecycleObserver {
    /* renamed from: a */
    private Disposable f12282a;
    /* renamed from: b */
    private final C11143a f12283b;
    /* renamed from: c */
    private final C13142b f12284c;
    /* renamed from: d */
    private final C11119a f12285d;

    public DiscoverySegmentsChangeObserver(@NotNull C11143a c11143a, @NotNull C13142b c13142b, @NotNull C11119a c11119a) {
        C2668g.m10309b(c11143a, "observerDiscoverySegments");
        C2668g.m10309b(c13142b, "discoveryToggleNavigationAdapter");
        C2668g.m10309b(c11119a, "discoverySingleViewSwitcherAdapter");
        this.f12283b = c11143a;
        this.f12284c = c13142b;
        this.f12285d = c11119a;
    }

    @OnLifecycleEvent(Event.ON_CREATE)
    public final void onActivityCreate() {
        Disposable disposable = this.f12282a;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f12282a = this.f12283b.execute().m15381d().m15363b(C15756a.b()).m15336a(C15674a.a()).m15355a((Consumer) new DiscoverySegmentsChangeObserver$a(this), (Consumer) DiscoverySegmentsChangeObserver$b.f36035a);
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void onActivityDestroy() {
        Disposable disposable = this.f12282a;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
