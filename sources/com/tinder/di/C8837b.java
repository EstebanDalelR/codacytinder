package com.tinder.di;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.C0372a;
import com.tinder.smsauth.di.Injectable;
import dagger.android.HasActivityInjector;
import dagger.android.support.C15512a;
import dagger.android.support.HasSupportFragmentInjector;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B?\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020 H\u0002R*\u0010\r\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00018\u0000@BX\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/di/InjectingActivityLifecycleListener;", "COMPONENT", "Ldagger/android/HasActivityInjector;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "injectedActivities", "", "Lkotlin/reflect/KClass;", "Landroid/app/Activity;", "terminatingActivities", "componentFactory", "Lkotlin/Function0;", "(Ljava/util/Set;Ljava/util/Set;Lkotlin/jvm/functions/Function0;)V", "<set-?>", "component", "getComponent", "()Ldagger/android/HasActivityInjector;", "setComponent", "(Ldagger/android/HasActivityInjector;)V", "Ldagger/android/HasActivityInjector;", "onActivityCreated", "", "activity", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "registerFragmentInjector", "Landroid/support/v4/app/FragmentActivity;", "sdk_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.di.b */
public class C8837b<COMPONENT extends HasActivityInjector> implements ActivityLifecycleCallbacks {
    @Nullable
    /* renamed from: a */
    private COMPONENT f30976a;
    /* renamed from: b */
    private final Set<KClass<? extends Activity>> f30977b;
    /* renamed from: c */
    private final Set<KClass<? extends Activity>> f30978c;
    /* renamed from: d */
    private final Function0<COMPONENT> f30979d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/tinder/di/InjectingActivityLifecycleListener$registerFragmentInjector$1", "Landroid/support/v4/app/FragmentManager$FragmentLifecycleCallbacks;", "()V", "onFragmentCreated", "", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "fragment", "Landroid/support/v4/app/Fragment;", "savedInstanceState", "Landroid/os/Bundle;", "sdk_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.di.b$a */
    public static final class C11106a extends C0372a {
        C11106a() {
        }

        /* renamed from: a */
        public void m43815a(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @Nullable Bundle bundle) {
            C2668g.b(fragmentManager, "fragmentManager");
            C2668g.b(fragment, "fragment");
            if ((fragment instanceof Injectable) != null) {
                C15512a.a(fragment);
            }
        }
    }

    public void onActivityPaused(@NotNull Activity activity) {
        C2668g.b(activity, "activity");
    }

    public void onActivityResumed(@NotNull Activity activity) {
        C2668g.b(activity, "activity");
    }

    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        C2668g.b(activity, "activity");
        C2668g.b(bundle, "outState");
    }

    public void onActivityStarted(@NotNull Activity activity) {
        C2668g.b(activity, "activity");
    }

    public void onActivityStopped(@NotNull Activity activity) {
        C2668g.b(activity, "activity");
    }

    public C8837b(@NotNull Set<? extends KClass<? extends Activity>> set, @NotNull Set<? extends KClass<? extends Activity>> set2, @NotNull Function0<? extends COMPONENT> function0) {
        C2668g.b(set, "injectedActivities");
        C2668g.b(set2, "terminatingActivities");
        C2668g.b(function0, "componentFactory");
        this.f30977b = set;
        this.f30978c = set2;
        this.f30979d = function0;
    }

    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        C2668g.b(activity, "activity");
        if ((activity instanceof Injectable) != null && this.f30977b.contains(C15825i.a(activity.getClass())) != null) {
            bundle = this.f30976a;
            if (bundle == null) {
                bundle = (HasActivityInjector) this.f30979d.invoke();
                this.f30976a = bundle;
            }
            bundle.activityInjector().inject(activity);
            if ((activity instanceof FragmentActivity) != null && (activity instanceof HasSupportFragmentInjector) != null) {
                m37595a((FragmentActivity) activity);
            }
        }
    }

    public void onActivityDestroyed(@NotNull Activity activity) {
        C2668g.b(activity, "activity");
        if (activity.isFinishing() && this.f30978c.contains(C15825i.a(activity.getClass()))) {
            this.f30976a = (HasActivityInjector) null;
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    private final void m37595a(FragmentActivity fragmentActivity) {
        fragmentActivity.getSupportFragmentManager().a(new C11106a(), true);
    }
}
