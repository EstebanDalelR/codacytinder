package com.tinder.scarlet.lifecycle.android;

import android.app.Application;
import com.tinder.scarlet.Lifecycle;
import com.tinder.scarlet.lifecycle.C18043d;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007J\"\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/scarlet/lifecycle/android/AndroidLifecycle;", "", "()V", "ACTIVITY_THROTTLE_TIMEOUT_MILLIS", "", "APPLICATION_THROTTLE_TIMEOUT_MILLIS", "ofApplicationForeground", "Lcom/tinder/scarlet/Lifecycle;", "application", "Landroid/app/Application;", "throttleTimeoutMillis", "ofLifecycleOwnerForeground", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "scarlet-lifecycle-android_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.lifecycle.android.a */
public final class C14815a {
    /* renamed from: a */
    public static final C14815a f46417a = new C14815a();

    private C14815a() {
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Lifecycle m56161a(Application application, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 1000;
        }
        return C14815a.m56160a(application, j);
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    /* renamed from: a */
    public static final Lifecycle m56160a(@NotNull Application application, long j) {
        C2668g.b(application, "application");
        return new C18040b(application, new C18043d(j)).combineWith(new Lifecycle[]{new C18041c(application, null, 2, null)});
    }
}
