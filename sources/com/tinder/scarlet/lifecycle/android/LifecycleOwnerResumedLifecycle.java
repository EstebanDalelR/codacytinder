package com.tinder.scarlet.lifecycle.android;

import com.tinder.scarlet.Lifecycle;
import com.tinder.scarlet.Lifecycle.C14785a;
import com.tinder.scarlet.lifecycle.C18043d;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Subscriber;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001H\u0001¢\u0006\u0002\u0010\nJ9\u0010\u000b\u001a\u00020\f2.\u0010\r\u001a*\u0012\u000e\b\u0000\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0014\u0012\u000e\b\u0000\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u000e0\u000eH\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/scarlet/lifecycle/android/LifecycleOwnerResumedLifecycle;", "Lcom/tinder/scarlet/Lifecycle;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "lifecycleRegistry", "Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;", "(Landroid/arch/lifecycle/LifecycleOwner;Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;)V", "combineWith", "others", "", "([Lcom/tinder/scarlet/Lifecycle;)Lcom/tinder/scarlet/Lifecycle;", "subscribe", "", "p0", "Lorg/reactivestreams/Subscriber;", "Lcom/tinder/scarlet/Lifecycle$State;", "kotlin.jvm.PlatformType", "ALifecycleObserver", "scarlet-lifecycle-android_release"}, k = 1, mv = {1, 1, 9})
public final class LifecycleOwnerResumedLifecycle implements Lifecycle {
    /* renamed from: a */
    private final C18043d f56040a;

    @NotNull
    public Lifecycle combineWith(@NotNull Lifecycle... lifecycleArr) {
        C2668g.b(lifecycleArr, "others");
        return this.f56040a.combineWith(lifecycleArr);
    }

    public void subscribe(Subscriber<? super C14785a> subscriber) {
        this.f56040a.subscribe(subscriber);
    }
}
