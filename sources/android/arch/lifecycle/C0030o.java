package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.ViewModelProvider.C3976a;
import android.arch.lifecycle.ViewModelProvider.Factory;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/* renamed from: android.arch.lifecycle.o */
public class C0030o {
    /* renamed from: a */
    private static Application m128a(Activity activity) {
        activity = activity.getApplication();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: a */
    private static Activity m127a(Fragment fragment) {
        fragment = fragment.getActivity();
        if (fragment != null) {
            return fragment;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    @MainThread
    @NonNull
    /* renamed from: a */
    public static ViewModelProvider m129a(@NonNull Fragment fragment, @Nullable Factory factory) {
        Application a = C0030o.m128a(C0030o.m127a(fragment));
        if (factory == null) {
            factory = C3976a.m15516a(a);
        }
        return new ViewModelProvider(C0032q.m134a(fragment), factory);
    }

    @MainThread
    @NonNull
    /* renamed from: a */
    public static ViewModelProvider m130a(@NonNull FragmentActivity fragmentActivity, @Nullable Factory factory) {
        Application a = C0030o.m128a((Activity) fragmentActivity);
        if (factory == null) {
            factory = C3976a.m15516a(a);
        }
        return new ViewModelProvider(C0032q.m135a(fragmentActivity), factory);
    }
}
