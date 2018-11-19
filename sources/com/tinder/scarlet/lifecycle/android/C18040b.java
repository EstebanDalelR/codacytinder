package com.tinder.scarlet.lifecycle.android;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.tinder.scarlet.C14796f;
import com.tinder.scarlet.Lifecycle;
import com.tinder.scarlet.Lifecycle.C14785a;
import com.tinder.scarlet.Lifecycle.C14785a.C16490b;
import com.tinder.scarlet.Lifecycle.C14785a.C16491c.C18034b;
import com.tinder.scarlet.lifecycle.C18043d;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Subscriber;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001H\u0001¢\u0006\u0002\u0010\nJ9\u0010\u000b\u001a\u00020\f2.\u0010\r\u001a*\u0012\u000e\b\u0000\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0014\u0012\u000e\b\u0000\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u000e0\u000eH\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/scarlet/lifecycle/android/ApplicationResumedLifecycle;", "Lcom/tinder/scarlet/Lifecycle;", "application", "Landroid/app/Application;", "lifecycleRegistry", "Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;", "(Landroid/app/Application;Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;)V", "combineWith", "others", "", "([Lcom/tinder/scarlet/Lifecycle;)Lcom/tinder/scarlet/Lifecycle;", "subscribe", "", "p0", "Lorg/reactivestreams/Subscriber;", "Lcom/tinder/scarlet/Lifecycle$State;", "kotlin.jvm.PlatformType", "ActivityLifecycleCallbacks", "scarlet-lifecycle-android_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.lifecycle.android.b */
public final class C18040b implements Lifecycle {
    /* renamed from: a */
    private final C18043d f56041a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tinder/scarlet/lifecycle/android/ApplicationResumedLifecycle$ActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "(Lcom/tinder/scarlet/lifecycle/android/ApplicationResumedLifecycle;)V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "scarlet-lifecycle-android_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.lifecycle.android.b$a */
    private final class C14816a implements ActivityLifecycleCallbacks {
        /* renamed from: a */
        final /* synthetic */ C18040b f46418a;

        public void onActivityCreated(@Nullable Activity activity, @Nullable Bundle bundle) {
        }

        public void onActivityDestroyed(@Nullable Activity activity) {
        }

        public void onActivitySaveInstanceState(@Nullable Activity activity, @Nullable Bundle bundle) {
        }

        public void onActivityStarted(@Nullable Activity activity) {
        }

        public void onActivityStopped(@Nullable Activity activity) {
        }

        public C14816a(C18040b c18040b) {
            this.f46418a = c18040b;
        }

        public void onActivityPaused(@Nullable Activity activity) {
            this.f46418a.f56041a.m65511a((C14785a) new C18034b(new C14796f(AdError.NETWORK_ERROR_CODE, "App is paused")));
        }

        public void onActivityResumed(@Nullable Activity activity) {
            this.f46418a.f56041a.m65511a((C14785a) C16490b.f51167a);
        }
    }

    @NotNull
    public Lifecycle combineWith(@NotNull Lifecycle... lifecycleArr) {
        C2668g.b(lifecycleArr, "others");
        return this.f56041a.combineWith(lifecycleArr);
    }

    public void subscribe(Subscriber<? super C14785a> subscriber) {
        this.f56041a.subscribe(subscriber);
    }

    public C18040b(@NotNull Application application, @NotNull C18043d c18043d) {
        C2668g.b(application, "application");
        C2668g.b(c18043d, "lifecycleRegistry");
        this.f56041a = c18043d;
        this.f56041a.m65511a((C14785a) C16490b.f51167a);
        application.registerActivityLifecycleCallbacks((ActivityLifecycleCallbacks) new C14816a(this));
    }
}
