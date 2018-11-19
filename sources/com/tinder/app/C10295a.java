package com.tinder.app;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.support.annotation.UiThread;
import io.reactivex.C3959e;
import io.reactivex.subjects.C19040a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0003J\b\u0010\u000e\u001a\u00020\rH\u0003J\u001a\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R2\u0010\b\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/tinder/app/ActivityBasedAppVisibilityTracker;", "Lcom/tinder/app/AppVisibilityTracker;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "activitiesStarted", "", "isChangingConfiguration", "", "visibilityBehaviorSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "kotlin.jvm.PlatformType", "dispatchOnBackground", "", "dispatchOnForeground", "onActivityCreated", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "trackVisibility", "Lio/reactivex/Observable;", "verifyNonNegativeActivityStackSize", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.app.a */
public final class C10295a implements ActivityLifecycleCallbacks, AppVisibilityTracker {
    /* renamed from: a */
    private final C19040a<AppVisibilityTracker$Visibility> f33431a = C19040a.a(AppVisibilityTracker$Visibility.BACKGROUND);
    /* renamed from: b */
    private int f33432b;
    /* renamed from: c */
    private boolean f33433c;

    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        C2668g.b(activity, "activity");
    }

    public void onActivityDestroyed(@NotNull Activity activity) {
        C2668g.b(activity, "activity");
    }

    public void onActivityPaused(@NotNull Activity activity) {
        C2668g.b(activity, "activity");
    }

    public void onActivityResumed(@NotNull Activity activity) {
        C2668g.b(activity, "activity");
    }

    public void onActivitySaveInstanceState(@NotNull Activity activity, @Nullable Bundle bundle) {
        C2668g.b(activity, "activity");
    }

    @NotNull
    public C3959e<AppVisibilityTracker$Visibility> trackVisibility() {
        C3959e<AppVisibilityTracker$Visibility> hide = this.f33431a.hide();
        C2668g.a(hide, "visibilityBehaviorSubject.hide()");
        return hide;
    }

    @UiThread
    public void onActivityStarted(@NotNull Activity activity) {
        C2668g.b(activity, "activity");
        activity = this.f33432b;
        this.f33432b = activity + 1;
        if (activity != null) {
            return;
        }
        if (this.f33433c != null) {
            this.f33433c = null;
        } else {
            m41684a();
        }
    }

    @UiThread
    public void onActivityStopped(@NotNull Activity activity) {
        C2668g.b(activity, "activity");
        this.f33432b--;
        if (this.f33432b == 0) {
            if (activity.isChangingConfigurations() != null) {
                this.f33433c = true;
            } else {
                m41685b();
            }
        }
        m41686c();
    }

    @UiThread
    /* renamed from: a */
    private final void m41684a() {
        this.f33431a.onNext(AppVisibilityTracker$Visibility.FOREGROUND);
    }

    @UiThread
    /* renamed from: b */
    private final void m41685b() {
        this.f33431a.onNext(AppVisibilityTracker$Visibility.BACKGROUND);
    }

    /* renamed from: c */
    private final void m41686c() {
        if ((this.f33432b >= 0 ? 1 : null) == null) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
