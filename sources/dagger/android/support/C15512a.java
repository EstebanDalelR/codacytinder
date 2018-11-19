package dagger.android.support;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;
import dagger.android.AndroidInjector;
import dagger.internal.C15521i;

/* renamed from: dagger.android.support.a */
public final class C15512a {
    /* renamed from: a */
    public static void m57986a(Fragment fragment) {
        C15521i.m58001a(fragment, "fragment");
        HasSupportFragmentInjector b = C15512a.m57987b(fragment);
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", new Object[]{fragment.getClass().getCanonicalName(), b.getClass().getCanonicalName()}));
        }
        AndroidInjector supportFragmentInjector = b.supportFragmentInjector();
        C15521i.m58002a(supportFragmentInjector, "%s.supportFragmentInjector() returned null", b.getClass());
        supportFragmentInjector.inject(fragment);
    }

    /* renamed from: b */
    private static HasSupportFragmentInjector m57987b(Fragment fragment) {
        Fragment fragment2 = fragment;
        do {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 == null) {
                Activity activity = fragment.getActivity();
                if (activity instanceof HasSupportFragmentInjector) {
                    return (HasSupportFragmentInjector) activity;
                }
                if (activity.getApplication() instanceof HasSupportFragmentInjector) {
                    return (HasSupportFragmentInjector) activity.getApplication();
                }
                throw new IllegalArgumentException(String.format("No injector was found for %s", new Object[]{fragment.getClass().getCanonicalName()}));
            }
        } while (!(fragment2 instanceof HasSupportFragmentInjector));
        return (HasSupportFragmentInjector) fragment2;
    }
}
