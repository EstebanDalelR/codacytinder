package android.arch.lifecycle;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/* renamed from: android.arch.lifecycle.q */
public class C0032q {
    @MainThread
    @NonNull
    /* renamed from: a */
    public static C0031p m135a(@NonNull FragmentActivity fragmentActivity) {
        if (fragmentActivity instanceof ViewModelStoreOwner) {
            return fragmentActivity.getViewModelStore();
        }
        return C3977c.m15518a(fragmentActivity).getViewModelStore();
    }

    @MainThread
    @NonNull
    /* renamed from: a */
    public static C0031p m134a(@NonNull Fragment fragment) {
        if (fragment instanceof ViewModelStoreOwner) {
            return fragment.getViewModelStore();
        }
        return C3977c.m15517a(fragment).getViewModelStore();
    }
}
