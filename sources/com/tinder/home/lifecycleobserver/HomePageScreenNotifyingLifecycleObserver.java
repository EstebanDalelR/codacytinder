package com.tinder.home.lifecycleobserver;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.home.navigation.C9703a;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/home/lifecycleobserver/HomePageScreenNotifyingLifecycleObserver;", "Landroid/arch/lifecycle/LifecycleObserver;", "homePageScreenTracker", "Lcom/tinder/home/navigation/HomePageScreenTracker;", "currentScreenNotifier", "Lcom/tinder/common/navigation/CurrentScreenNotifier;", "(Lcom/tinder/home/navigation/HomePageScreenTracker;Lcom/tinder/common/navigation/CurrentScreenNotifier;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "startNotifying", "", "stopNotifying", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class HomePageScreenNotifyingLifecycleObserver implements LifecycleObserver {
    /* renamed from: a */
    private Disposable f12300a;
    /* renamed from: b */
    private final C9703a f12301b;
    /* renamed from: c */
    private final CurrentScreenNotifier f12302c;

    public HomePageScreenNotifyingLifecycleObserver(@NotNull C9703a c9703a, @NotNull CurrentScreenNotifier currentScreenNotifier) {
        C2668g.m10309b(c9703a, "homePageScreenTracker");
        C2668g.m10309b(currentScreenNotifier, "currentScreenNotifier");
        this.f12301b = c9703a;
        this.f12302c = currentScreenNotifier;
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void startNotifying() {
        Disposable disposable = this.f12300a;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f12300a = this.f12301b.a().subscribe(new HomePageScreenNotifyingLifecycleObserver$a(this), HomePageScreenNotifyingLifecycleObserver$b.f38703a);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void stopNotifying() {
        Disposable disposable = this.f12300a;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
