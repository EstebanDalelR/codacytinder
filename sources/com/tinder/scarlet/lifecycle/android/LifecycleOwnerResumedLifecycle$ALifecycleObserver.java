package com.tinder.scarlet.lifecycle.android;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.facebook.ads.AdError;
import com.tinder.scarlet.C14796f;
import com.tinder.scarlet.Lifecycle.C14785a.C16490b;
import com.tinder.scarlet.Lifecycle.C14785a.C16491c.C18034b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/scarlet/lifecycle/android/LifecycleOwnerResumedLifecycle$ALifecycleObserver;", "Landroid/arch/lifecycle/LifecycleObserver;", "(Lcom/tinder/scarlet/lifecycle/android/LifecycleOwnerResumedLifecycle;)V", "onDestroy", "", "onPause", "onResume", "scarlet-lifecycle-android_release"}, k = 1, mv = {1, 1, 9})
final class LifecycleOwnerResumedLifecycle$ALifecycleObserver implements LifecycleObserver {
    /* renamed from: a */
    final /* synthetic */ LifecycleOwnerResumedLifecycle f12497a;

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        LifecycleOwnerResumedLifecycle.a(this.f12497a).a(new C18034b(new C14796f(AdError.NETWORK_ERROR_CODE, "Paused")));
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        LifecycleOwnerResumedLifecycle.a(this.f12497a).a(C16490b.f51167a);
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void onDestroy() {
        LifecycleOwnerResumedLifecycle.a(this.f12497a).onComplete();
    }
}
