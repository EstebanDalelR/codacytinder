package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.C0372a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.lifecycle.d */
class C0018d {
    /* renamed from: a */
    private static AtomicBoolean f45a = new AtomicBoolean(false);

    @VisibleForTesting
    /* renamed from: android.arch.lifecycle.d$b */
    static class C2682b extends C0016b {
        /* renamed from: a */
        private final C2683c f8494a = new C2683c();

        C2682b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if ((activity instanceof FragmentActivity) != null) {
                ((FragmentActivity) activity).getSupportFragmentManager().mo433a(this.f8494a, true);
            }
            C0025k.m111a(activity);
        }

        public void onActivityStopped(Activity activity) {
            if (activity instanceof FragmentActivity) {
                C0018d.m99b((FragmentActivity) activity, State.CREATED);
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            if ((activity instanceof FragmentActivity) != null) {
                C0018d.m99b((FragmentActivity) activity, State.CREATED);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: android.arch.lifecycle.d$c */
    static class C2683c extends C0372a {
        C2683c() {
        }

        /* renamed from: a */
        public void mo32a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            C0018d.m98b(fragment, Event.ON_CREATE);
            if ((fragment instanceof LifecycleRegistryOwner) != null && fragment.getChildFragmentManager().mo428a("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragment.getChildFragmentManager().mo429a().mo405a(new C3978a(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").mo410c();
            }
        }

        /* renamed from: b */
        public void mo33b(FragmentManager fragmentManager, Fragment fragment) {
            C0018d.m98b(fragment, Event.ON_START);
        }

        /* renamed from: c */
        public void mo34c(FragmentManager fragmentManager, Fragment fragment) {
            C0018d.m98b(fragment, Event.ON_RESUME);
        }
    }

    /* renamed from: android.arch.lifecycle.d$a */
    public static class C3978a extends Fragment {
        public void onPause() {
            super.onPause();
            m15519a(Event.ON_PAUSE);
        }

        public void onStop() {
            super.onStop();
            m15519a(Event.ON_STOP);
        }

        public void onDestroy() {
            super.onDestroy();
            m15519a(Event.ON_DESTROY);
        }

        /* renamed from: a */
        protected void m15519a(Event event) {
            C0018d.m98b(getParentFragment(), event);
        }
    }

    /* renamed from: a */
    static void m93a(Context context) {
        if (!f45a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C2682b());
        }
    }

    /* renamed from: a */
    private static void m96a(FragmentManager fragmentManager, State state) {
        FragmentManager<Object> e = fragmentManager.mo439e();
        if (e != null) {
            for (Object obj : e) {
                if (obj != null) {
                    C0018d.m97a(obj, state);
                    if (obj.isAdded()) {
                        C0018d.m96a(obj.getChildFragmentManager(), state);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m97a(Object obj, State state) {
        if (obj instanceof LifecycleRegistryOwner) {
            ((LifecycleRegistryOwner) obj).getLifecycle().m10470a(state);
        }
    }

    /* renamed from: b */
    private static void m99b(FragmentActivity fragmentActivity, State state) {
        C0018d.m97a((Object) fragmentActivity, state);
        C0018d.m96a(fragmentActivity.getSupportFragmentManager(), state);
    }

    /* renamed from: b */
    private static void m98b(Fragment fragment, Event event) {
        if (fragment instanceof LifecycleRegistryOwner) {
            ((LifecycleRegistryOwner) fragment).getLifecycle().m10469a(event);
        }
    }
}
