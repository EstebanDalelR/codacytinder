package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.C0372a;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.lifecycle.c */
public class C3977c extends Fragment implements ViewModelStoreOwner {
    /* renamed from: a */
    private static final C0017a f12635a = new C0017a();
    /* renamed from: b */
    private C0031p f12636b = new C0031p();

    /* renamed from: android.arch.lifecycle.c$a */
    static class C0017a {
        /* renamed from: a */
        private Map<Activity, C3977c> f40a = new HashMap();
        /* renamed from: b */
        private Map<Fragment, C3977c> f41b = new HashMap();
        /* renamed from: c */
        private ActivityLifecycleCallbacks f42c = new C26801(this);
        /* renamed from: d */
        private boolean f43d = false;
        /* renamed from: e */
        private C0372a f44e = new C26812(this);

        /* renamed from: android.arch.lifecycle.c$a$1 */
        class C26801 extends C0016b {
            /* renamed from: a */
            final /* synthetic */ C0017a f8492a;

            C26801(C0017a c0017a) {
                this.f8492a = c0017a;
            }

            public void onActivityDestroyed(Activity activity) {
                if (((C3977c) this.f8492a.f40a.remove(activity)) != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to save a ViewModel for ");
                    stringBuilder.append(activity);
                    Log.e("ViewModelStores", stringBuilder.toString());
                }
            }
        }

        /* renamed from: android.arch.lifecycle.c$a$2 */
        class C26812 extends C0372a {
            /* renamed from: a */
            final /* synthetic */ C0017a f8493a;

            C26812(C0017a c0017a) {
                this.f8493a = c0017a;
            }

            /* renamed from: a */
            public void mo28a(FragmentManager fragmentManager, Fragment fragment) {
                super.mo28a(fragmentManager, fragment);
                if (((C3977c) this.f8493a.f41b.remove(fragment)) != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to save a ViewModel for ");
                    stringBuilder.append(fragment);
                    Log.e("ViewModelStores", stringBuilder.toString());
                }
            }
        }

        C0017a() {
        }

        /* renamed from: a */
        void m91a(Fragment fragment) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment != null) {
                this.f41b.remove(parentFragment);
                parentFragment.getFragmentManager().mo432a(this.f44e);
                return;
            }
            this.f40a.remove(fragment.getActivity());
        }

        /* renamed from: a */
        private static C3977c m86a(FragmentManager fragmentManager) {
            if (fragmentManager.mo440f()) {
                throw new IllegalStateException("Can't access ViewModels from onDestroy");
            }
            fragmentManager = fragmentManager.mo428a("android.arch.lifecycle.state.StateProviderHolderFragment");
            if (fragmentManager == null || (fragmentManager instanceof C3977c)) {
                return (C3977c) fragmentManager;
            }
            throw new IllegalStateException("Unexpected fragment instance was returned by HOLDER_TAG");
        }

        /* renamed from: b */
        private static C3977c m88b(FragmentManager fragmentManager) {
            Fragment c3977c = new C3977c();
            fragmentManager.mo429a().mo405a(c3977c, "android.arch.lifecycle.state.StateProviderHolderFragment").mo412d();
            return c3977c;
        }

        /* renamed from: a */
        C3977c m90a(FragmentActivity fragmentActivity) {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            C3977c a = C0017a.m86a(supportFragmentManager);
            if (a != null) {
                return a;
            }
            a = (C3977c) this.f40a.get(fragmentActivity);
            if (a != null) {
                return a;
            }
            if (!this.f43d) {
                this.f43d = true;
                fragmentActivity.getApplication().registerActivityLifecycleCallbacks(this.f42c);
            }
            C3977c b = C0017a.m88b(supportFragmentManager);
            this.f40a.put(fragmentActivity, b);
            return b;
        }

        /* renamed from: b */
        C3977c m92b(Fragment fragment) {
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            C3977c a = C0017a.m86a(childFragmentManager);
            if (a != null) {
                return a;
            }
            a = (C3977c) this.f41b.get(fragment);
            if (a != null) {
                return a;
            }
            fragment.getFragmentManager().mo433a(this.f44e, false);
            C3977c b = C0017a.m88b(childFragmentManager);
            this.f41b.put(fragment, b);
            return b;
        }
    }

    public C3977c() {
        setRetainInstance(true);
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        f12635a.m91a((Fragment) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f12636b.m132a();
    }

    @NonNull
    public C0031p getViewModelStore() {
        return this.f12636b;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static C3977c m15518a(FragmentActivity fragmentActivity) {
        return f12635a.m90a(fragmentActivity);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static C3977c m15517a(Fragment fragment) {
        return f12635a.m92b(fragment);
    }
}
